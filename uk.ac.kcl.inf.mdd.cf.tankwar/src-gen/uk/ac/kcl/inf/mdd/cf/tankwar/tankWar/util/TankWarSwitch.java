/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarPackage
 * @generated
 */
public class TankWarSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TankWarPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TankWarSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = TankWarPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case TankWarPackage.TANK_WAR_GAME:
      {
        TankWarGame tankWarGame = (TankWarGame)theEObject;
        T result = caseTankWarGame(tankWarGame);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TankWarPackage.VALUE:
      {
        Value value = (Value)theEObject;
        T result = caseValue(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TankWarPackage.DIRECT_BEHAVIOUR:
      {
        DirectBehaviour directBehaviour = (DirectBehaviour)theEObject;
        T result = caseDirectBehaviour(directBehaviour);
        if (result == null) result = caseValue(directBehaviour);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TankWarPackage.END_GAME_BEHAVIOUR:
      {
        EndGameBehaviour endGameBehaviour = (EndGameBehaviour)theEObject;
        T result = caseEndGameBehaviour(endGameBehaviour);
        if (result == null) result = caseDirectBehaviour(endGameBehaviour);
        if (result == null) result = caseOptionSpecification(endGameBehaviour);
        if (result == null) result = caseValue(endGameBehaviour);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TankWarPackage.STRING_VALUE:
      {
        StringValue stringValue = (StringValue)theEObject;
        T result = caseStringValue(stringValue);
        if (result == null) result = caseValue(stringValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TankWarPackage.INT_VALUE:
      {
        IntValue intValue = (IntValue)theEObject;
        T result = caseIntValue(intValue);
        if (result == null) result = caseValue(intValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TankWarPackage.SCREEN_SPECIFICATION:
      {
        ScreenSpecification screenSpecification = (ScreenSpecification)theEObject;
        T result = caseScreenSpecification(screenSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TankWarPackage.OBSTACLEPECIFICATION:
      {
        Obstaclepecification obstaclepecification = (Obstaclepecification)theEObject;
        T result = caseObstaclepecification(obstaclepecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TankWarPackage.OBSTACLE_MEMBER:
      {
        ObstacleMember obstacleMember = (ObstacleMember)theEObject;
        T result = caseObstacleMember(obstacleMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TankWarPackage.WATER_OBSTACLE:
      {
        WaterObstacle waterObstacle = (WaterObstacle)theEObject;
        T result = caseWaterObstacle(waterObstacle);
        if (result == null) result = caseObstacleMember(waterObstacle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TankWarPackage.WALL_OBSTACLE:
      {
        WallObstacle wallObstacle = (WallObstacle)theEObject;
        T result = caseWallObstacle(wallObstacle);
        if (result == null) result = caseObstacleMember(wallObstacle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TankWarPackage.FIELD_SPECIFICATION:
      {
        FieldSpecification fieldSpecification = (FieldSpecification)theEObject;
        T result = caseFieldSpecification(fieldSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TankWarPackage.FIELD_INITIALISATIONS:
      {
        FieldInitialisations fieldInitialisations = (FieldInitialisations)theEObject;
        T result = caseFieldInitialisations(fieldInitialisations);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TankWarPackage.LOCAL_FIELD_INITIALISATIONS:
      {
        LocalFieldInitialisations localFieldInitialisations = (LocalFieldInitialisations)theEObject;
        T result = caseLocalFieldInitialisations(localFieldInitialisations);
        if (result == null) result = caseFieldInitialisations(localFieldInitialisations);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TankWarPackage.OPTION_SPECIFICATION:
      {
        OptionSpecification optionSpecification = (OptionSpecification)theEObject;
        T result = caseOptionSpecification(optionSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TankWarPackage.SUPER_MODE_DECLARATION:
      {
        SuperModeDeclaration superModeDeclaration = (SuperModeDeclaration)theEObject;
        T result = caseSuperModeDeclaration(superModeDeclaration);
        if (result == null) result = caseOptionSpecification(superModeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TankWarPackage.START_FIELD_DECLARATION:
      {
        StartFieldDeclaration startFieldDeclaration = (StartFieldDeclaration)theEObject;
        T result = caseStartFieldDeclaration(startFieldDeclaration);
        if (result == null) result = caseOptionSpecification(startFieldDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TankWarPackage.ALLOW_RESTART_MENU:
      {
        AllowRestartMenu allowRestartMenu = (AllowRestartMenu)theEObject;
        T result = caseAllowRestartMenu(allowRestartMenu);
        if (result == null) result = caseOptionSpecification(allowRestartMenu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TankWarPackage.NO_OP_BEHAVIOUR:
      {
        NoOpBehaviour noOpBehaviour = (NoOpBehaviour)theEObject;
        T result = caseNoOpBehaviour(noOpBehaviour);
        if (result == null) result = caseDirectBehaviour(noOpBehaviour);
        if (result == null) result = caseValue(noOpBehaviour);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Game</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Game</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTankWarGame(TankWarGame object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValue(Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Direct Behaviour</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Direct Behaviour</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirectBehaviour(DirectBehaviour object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>End Game Behaviour</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>End Game Behaviour</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEndGameBehaviour(EndGameBehaviour object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringValue(StringValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntValue(IntValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Screen Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Screen Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScreenSpecification(ScreenSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Obstaclepecification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Obstaclepecification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObstaclepecification(Obstaclepecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Obstacle Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Obstacle Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObstacleMember(ObstacleMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Water Obstacle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Water Obstacle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWaterObstacle(WaterObstacle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wall Obstacle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wall Obstacle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWallObstacle(WallObstacle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldSpecification(FieldSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Initialisations</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Initialisations</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldInitialisations(FieldInitialisations object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Field Initialisations</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Field Initialisations</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalFieldInitialisations(LocalFieldInitialisations object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Option Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Option Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOptionSpecification(OptionSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Super Mode Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Super Mode Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSuperModeDeclaration(SuperModeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Start Field Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Start Field Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStartFieldDeclaration(StartFieldDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Allow Restart Menu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Allow Restart Menu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAllowRestartMenu(AllowRestartMenu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>No Op Behaviour</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>No Op Behaviour</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNoOpBehaviour(NoOpBehaviour object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //TankWarSwitch