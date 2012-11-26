/**
 */
package org.eclipse.e4.tutorial.contacts.model.application.ui.basic;

import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tutorial Part Stack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.e4.tutorial.contacts.model.application.ui.basic.TutorialPartStack#getMyRenderer <em>My Renderer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.e4.tutorial.contacts.model.application.ui.basic.BasicPackage#getTutorialPartStack()
 * @model
 * @generated
 */
public interface TutorialPartStack extends EObject, MPartStack {
	/**
	 * Returns the value of the '<em><b>My Renderer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Renderer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Renderer</em>' attribute.
	 * @see #setMyRenderer(String)
	 * @see org.eclipse.e4.tutorial.contacts.model.application.ui.basic.BasicPackage#getTutorialPartStack_MyRenderer()
	 * @model
	 * @generated
	 */
	String getMyRenderer();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.tutorial.contacts.model.application.ui.basic.TutorialPartStack#getMyRenderer <em>My Renderer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Renderer</em>' attribute.
	 * @see #getMyRenderer()
	 * @generated
	 */
	void setMyRenderer(String value);

} // TutorialPartStack
