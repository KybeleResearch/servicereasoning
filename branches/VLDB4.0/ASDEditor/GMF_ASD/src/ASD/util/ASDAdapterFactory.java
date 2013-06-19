/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ASD.util;

import ASD.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ASD.ASDPackage
 * @generated
 */
public class ASDAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ASDPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ASDAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ASDPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ASDSwitch<Adapter> modelSwitch =
    new ASDSwitch<Adapter>()
    {
      @Override
      public Adapter caseServiceDescription(ServiceDescription object)
      {
        return createServiceDescriptionAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseMessage(Message object)
      {
        return createMessageAdapter();
      }
      @Override
      public Adapter caseInfoType(InfoType object)
      {
        return createInfoTypeAdapter();
      }
      @Override
      public Adapter caseProfile(Profile object)
      {
        return createProfileAdapter();
      }
      @Override
      public Adapter caseAssertionSet(AssertionSet object)
      {
        return createAssertionSetAdapter();
      }
      @Override
      public Adapter caseAssertion(Assertion object)
      {
        return createAssertionAdapter();
      }
      @Override
      public Adapter caseNamedElement(NamedElement object)
      {
        return createNamedElementAdapter();
      }
      @Override
      public Adapter caseAnnotation(Annotation object)
      {
        return createAnnotationAdapter();
      }
      @Override
      public Adapter caseInfoTypeImported(InfoTypeImported object)
      {
        return createInfoTypeImportedAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ASD.ServiceDescription <em>Service Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ASD.ServiceDescription
   * @generated
   */
  public Adapter createServiceDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ASD.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ASD.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ASD.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ASD.Message
   * @generated
   */
  public Adapter createMessageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ASD.InfoType <em>Info Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ASD.InfoType
   * @generated
   */
  public Adapter createInfoTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ASD.Profile <em>Profile</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ASD.Profile
   * @generated
   */
  public Adapter createProfileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ASD.AssertionSet <em>Assertion Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ASD.AssertionSet
   * @generated
   */
  public Adapter createAssertionSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ASD.Assertion <em>Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ASD.Assertion
   * @generated
   */
  public Adapter createAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ASD.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ASD.NamedElement
   * @generated
   */
  public Adapter createNamedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ASD.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ASD.Annotation
   * @generated
   */
  public Adapter createAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ASD.InfoTypeImported <em>Info Type Imported</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ASD.InfoTypeImported
   * @generated
   */
  public Adapter createInfoTypeImportedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ASDAdapterFactory
