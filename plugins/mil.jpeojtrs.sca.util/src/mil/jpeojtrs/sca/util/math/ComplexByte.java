/*******************************************************************************
 * This file is protected by Copyright. 
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under 
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package mil.jpeojtrs.sca.util.math;

import org.omg.CORBA.Any;
import org.omg.CORBA.AnySeqHelper;
import org.omg.CORBA.ORB;

import CF.complexOctet;
import CF.complexOctetHelper;

public class ComplexByte extends ComplexNumber {

	private final byte[] bytes;

	public ComplexByte(byte... bytes) {
		this.bytes = bytes;
	}

	@Override
	public Any toAny() {
		ORB orb = ORB.init();
		if (bytes.length == 2) {
			complexOctet value = new complexOctet(bytes[0], bytes[1]);
			Any any = orb.create_any();
			complexOctetHelper.insert(any, value);
			return any;
		} else {
			Any retVal = orb.create_any();
			Any[] value = new Any[bytes.length];
			for (int i = 0; i < bytes.length; i++) {
				value[i] = orb.create_any();
				value[i].insert_octet(bytes[i]);
			}
			AnySeqHelper.insert(retVal, value);
			return retVal;
		}
	}

	public byte getByteValue(int index) throws ArrayIndexOutOfBoundsException {
		return bytes[index];
	}

	@Override
	public Byte getValue(int index) throws ArrayIndexOutOfBoundsException {
		return bytes[index];
	}

	@Override
	public int getSize() {
		return bytes.length;
	}

	public static ComplexByte valueOf(Any any) {
		complexOctet octet = complexOctetHelper.extract(any);
		return new ComplexByte(new byte[] { octet.real, octet.imag });
	}

	public static ComplexByte valueOf(String value) {
		String[] numbers = ComplexParser.parse(value);
		byte[] bytes = new byte[numbers.length];
		for (int i = 0; i < bytes.length; i++) {
			// TODO Add support for hex / octal
			bytes[i] = Byte.valueOf(numbers[i]);
		}
		return new ComplexByte(bytes);
	}

}
