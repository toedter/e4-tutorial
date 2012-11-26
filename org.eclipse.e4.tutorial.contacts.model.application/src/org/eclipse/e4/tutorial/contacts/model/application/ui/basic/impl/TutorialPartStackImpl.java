/**
 */
package org.eclipse.e4.tutorial.contacts.model.application.ui.basic.impl;

import org.eclipse.e4.tutorial.contacts.model.application.ui.basic.BasicPackage;
import org.eclipse.e4.tutorial.contacts.model.application.ui.basic.TutorialPartStack;

import org.eclipse.e4.ui.model.application.ui.basic.impl.PartStackImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tutorial Part Stack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.e4.tutorial.contacts.model.application.ui.basic.impl.TutorialPartStackImpl#getMyRenderer <em>My Renderer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TutorialPartStackImpl extends PartStackImpl implements TutorialPartStack {
	/**
	 * The default value of the '{@link #getMyRenderer() <em>My Renderer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyRenderer()
	 * @generated
	 * @ordered
	 */
	protected static final String MY_RENDERER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMyRenderer() <em>My Renderer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyRenderer()
	 * @generated
	 * @ordered
	 */
	protected String myRenderer = MY_RENDERER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TutorialPartStackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TUTORIAL_PART_STACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMyRenderer() {
		return myRenderer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyRenderer(String newMyRenderer) {
		String oldMyRenderer = myRenderer;
		myRenderer = newMyRenderer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicPackage.TUTORIAL_PART_STACK__MY_RENDERER, oldMyRenderer, myRenderer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicPackage.TUTORIAL_PART_STACK__MY_RENDERER:
				return getMyRenderer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasicPackage.TUTORIAL_PART_STACK__MY_RENDERER:
				setMyRenderer((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BasicPackage.TUTORIAL_PART_STACK__MY_RENDERER:
				setMyRenderer(MY_RENDERER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BasicPackage.TUTORIAL_PART_STACK__MY_RENDERER:
				return MY_RENDERER_EDEFAULT == null ? myRenderer != null : !MY_RENDERER_EDEFAULT.equals(myRenderer);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (myRenderer: ");
		result.append(myRenderer);
		result.append(')');
		return result.toString();
	}

} //TutorialPartStackImpl
