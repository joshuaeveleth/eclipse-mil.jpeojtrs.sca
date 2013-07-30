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
// BEGIN GENERATED CODE
package mil.jpeojtrs.sca.dpd.provider;

import java.util.ArrayList;
import java.util.Collection;

import mil.jpeojtrs.sca.dpd.util.DpdAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DpdItemProviderAdapterFactory extends DpdAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;
	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();
	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DpdItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.dpd.Author} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorItemProvider authorItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.dpd.Author}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAuthorAdapter() {
		if (authorItemProvider == null) {
			authorItemProvider = new AuthorItemProvider(this);
		}

		return authorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.dpd.ChildHwDevice} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildHwDeviceItemProvider childHwDeviceItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.dpd.ChildHwDevice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChildHwDeviceAdapter() {
		if (childHwDeviceItemProvider == null) {
			childHwDeviceItemProvider = new ChildHwDeviceItemProvider(this);
		}

		return childHwDeviceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.dpd.DeviceClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceClassItemProvider deviceClassItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.dpd.DeviceClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeviceClassAdapter() {
		if (deviceClassItemProvider == null) {
			deviceClassItemProvider = new DeviceClassItemProvider(this);
		}

		return deviceClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.dpd.DevicePkg} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevicePkgItemProvider devicePkgItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.dpd.DevicePkg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDevicePkgAdapter() {
		if (devicePkgItemProvider == null) {
			devicePkgItemProvider = new DevicePkgItemProvider(this);
		}

		return devicePkgItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.dpd.DevicePkgRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevicePkgRefItemProvider devicePkgRefItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.dpd.DevicePkgRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDevicePkgRefAdapter() {
		if (devicePkgRefItemProvider == null) {
			devicePkgRefItemProvider = new DevicePkgRefItemProvider(this);
		}

		return devicePkgRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.dpd.DocumentRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootItemProvider documentRootItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.dpd.DocumentRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocumentRootAdapter() {
		if (documentRootItemProvider == null) {
			documentRootItemProvider = new DocumentRootItemProvider(this);
		}

		return documentRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwDeviceRegistrationItemProvider hwDeviceRegistrationItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHwDeviceRegistrationAdapter() {
		if (hwDeviceRegistrationItemProvider == null) {
			hwDeviceRegistrationItemProvider = new HwDeviceRegistrationItemProvider(this);
		}

		return hwDeviceRegistrationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.dpd.LocalFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalFileItemProvider localFileItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.dpd.LocalFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLocalFileAdapter() {
		if (localFileItemProvider == null) {
			localFileItemProvider = new LocalFileItemProvider(this);
		}

		return localFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.dpd.PropertyFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyFileItemProvider propertyFileItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.dpd.PropertyFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyFileAdapter() {
		if (propertyFileItemProvider == null) {
			propertyFileItemProvider = new PropertyFileItemProvider(this);
		}

		return propertyFileItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (authorItemProvider != null) authorItemProvider.dispose();
		if (childHwDeviceItemProvider != null) childHwDeviceItemProvider.dispose();
		if (deviceClassItemProvider != null) deviceClassItemProvider.dispose();
		if (devicePkgItemProvider != null) devicePkgItemProvider.dispose();
		if (devicePkgRefItemProvider != null) devicePkgRefItemProvider.dispose();
		if (documentRootItemProvider != null) documentRootItemProvider.dispose();
		if (hwDeviceRegistrationItemProvider != null) hwDeviceRegistrationItemProvider.dispose();
		if (localFileItemProvider != null) localFileItemProvider.dispose();
		if (propertyFileItemProvider != null) propertyFileItemProvider.dispose();
	}

}
