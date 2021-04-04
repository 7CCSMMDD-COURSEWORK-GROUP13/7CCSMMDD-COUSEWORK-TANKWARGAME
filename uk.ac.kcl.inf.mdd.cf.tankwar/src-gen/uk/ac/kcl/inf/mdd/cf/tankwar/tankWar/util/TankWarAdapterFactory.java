/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarPackage
 * @generated
 */
public class TankWarAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TankWarPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TankWarAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TankWarPackage.eINSTANCE;
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
  protected TankWarSwitch<Adapter> modelSwitch =
    new TankWarSwitch<Adapter>()
    {
      @Override
      public Adapter caseTankWarGame(TankWarGame object)
      {
        return createTankWarGameAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter caseDirectBehaviour(DirectBehaviour object)
      {
        return createDirectBehaviourAdapter();
      }
      @Override
      public Adapter caseEndGameBehaviour(EndGameBehaviour object)
      {
        return createEndGameBehaviourAdapter();
      }
      @Override
      public Adapter caseStringValue(StringValue object)
      {
        return createStringValueAdapter();
      }
      @Override
      public Adapter caseIntValue(IntValue object)
      {
        return createIntValueAdapter();
      }
      @Override
      public Adapter caseScreenSpecification(ScreenSpecification object)
      {
        return createScreenSpecificationAdapter();
      }
      @Override
      public Adapter caseObstaclepecification(Obstaclepecification object)
      {
        return createObstaclepecificationAdapter();
      }
      @Override
      public Adapter caseObstacleMember(ObstacleMember object)
      {
        return createObstacleMemberAdapter();
      }
      @Override
      public Adapter caseWaterObstacle(WaterObstacle object)
      {
        return createWaterObstacleAdapter();
      }
      @Override
      public Adapter caseWallObstacle(WallObstacle object)
      {
        return createWallObstacleAdapter();
      }
      @Override
      public Adapter caseFieldSpecification(FieldSpecification object)
      {
        return createFieldSpecificationAdapter();
      }
      @Override
      public Adapter caseFieldInitialisations(FieldInitialisations object)
      {
        return createFieldInitialisationsAdapter();
      }
      @Override
      public Adapter caseLocalFieldInitialisations(LocalFieldInitialisations object)
      {
        return createLocalFieldInitialisationsAdapter();
      }
      @Override
      public Adapter caseOptionSpecification(OptionSpecification object)
      {
        return createOptionSpecificationAdapter();
      }
      @Override
      public Adapter caseSuperModeDeclaration(SuperModeDeclaration object)
      {
        return createSuperModeDeclarationAdapter();
      }
      @Override
      public Adapter caseStartFieldDeclaration(StartFieldDeclaration object)
      {
        return createStartFieldDeclarationAdapter();
      }
      @Override
      public Adapter caseAllowRestartMenu(AllowRestartMenu object)
      {
        return createAllowRestartMenuAdapter();
      }
      @Override
      public Adapter caseNoOpBehaviour(NoOpBehaviour object)
      {
        return createNoOpBehaviourAdapter();
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
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarGame <em>Game</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarGame
   * @generated
   */
  public Adapter createTankWarGameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.DirectBehaviour <em>Direct Behaviour</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.DirectBehaviour
   * @generated
   */
  public Adapter createDirectBehaviourAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.EndGameBehaviour <em>End Game Behaviour</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.EndGameBehaviour
   * @generated
   */
  public Adapter createEndGameBehaviourAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.StringValue
   * @generated
   */
  public Adapter createStringValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.IntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.IntValue
   * @generated
   */
  public Adapter createIntValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.ScreenSpecification <em>Screen Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.ScreenSpecification
   * @generated
   */
  public Adapter createScreenSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Obstaclepecification <em>Obstaclepecification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Obstaclepecification
   * @generated
   */
  public Adapter createObstaclepecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.ObstacleMember <em>Obstacle Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.ObstacleMember
   * @generated
   */
  public Adapter createObstacleMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.WaterObstacle <em>Water Obstacle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.WaterObstacle
   * @generated
   */
  public Adapter createWaterObstacleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.WallObstacle <em>Wall Obstacle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.WallObstacle
   * @generated
   */
  public Adapter createWallObstacleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.FieldSpecification <em>Field Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.FieldSpecification
   * @generated
   */
  public Adapter createFieldSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.FieldInitialisations <em>Field Initialisations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.FieldInitialisations
   * @generated
   */
  public Adapter createFieldInitialisationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.LocalFieldInitialisations <em>Local Field Initialisations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.LocalFieldInitialisations
   * @generated
   */
  public Adapter createLocalFieldInitialisationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.OptionSpecification <em>Option Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.OptionSpecification
   * @generated
   */
  public Adapter createOptionSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.SuperModeDeclaration <em>Super Mode Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.SuperModeDeclaration
   * @generated
   */
  public Adapter createSuperModeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.StartFieldDeclaration <em>Start Field Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.StartFieldDeclaration
   * @generated
   */
  public Adapter createStartFieldDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.AllowRestartMenu <em>Allow Restart Menu</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.AllowRestartMenu
   * @generated
   */
  public Adapter createAllowRestartMenuAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.NoOpBehaviour <em>No Op Behaviour</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.NoOpBehaviour
   * @generated
   */
  public Adapter createNoOpBehaviourAdapter()
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

} //TankWarAdapterFactory