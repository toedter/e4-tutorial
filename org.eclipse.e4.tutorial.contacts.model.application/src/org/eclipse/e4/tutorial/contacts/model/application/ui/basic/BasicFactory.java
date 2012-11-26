/**
 */
package org.eclipse.e4.tutorial.contacts.model.application.ui.basic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.e4.tutorial.contacts.model.application.ui.basic.BasicPackage
 * @generated
 */
public interface BasicFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicFactory eINSTANCE = org.eclipse.e4.tutorial.contacts.model.application.ui.basic.impl.BasicFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tutorial Part Stack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tutorial Part Stack</em>'.
	 * @generated
	 */
	TutorialPartStack createTutorialPartStack();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasicPackage getBasicPackage();

} //BasicFactory
