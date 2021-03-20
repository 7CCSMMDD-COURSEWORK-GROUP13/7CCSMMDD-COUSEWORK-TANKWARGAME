/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.AllowRestartMenu;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.DirectBehaviour;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.EndGameBehaviour;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.FieldInitialisations;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.FieldSpecification;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.IntValue;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.LocalFieldInitialisations;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.NoOpBehaviour;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.ObstacleMember;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Obstaclepecification;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.OptionSpecification;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.ScreenSpecification;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.StartFieldDeclaration;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.StringValue;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.SuperModeDeclaration;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarFactory;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarGame;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarPackage;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Value;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.WallObstacle;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.WaterObstacle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TankWarPackageImpl extends EPackageImpl implements TankWarPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tankWarGameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass directBehaviourEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass endGameBehaviourEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass screenSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass obstaclepecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass obstacleMemberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass waterObstacleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wallObstacleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldInitialisationsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localFieldInitialisationsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass superModeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass startFieldDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass allowRestartMenuEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noOpBehaviourEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TankWarPackageImpl()
  {
    super(eNS_URI, TankWarFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link TankWarPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TankWarPackage init()
  {
    if (isInited) return (TankWarPackage)EPackage.Registry.INSTANCE.getEPackage(TankWarPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredTankWarPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    TankWarPackageImpl theTankWarPackage = registeredTankWarPackage instanceof TankWarPackageImpl ? (TankWarPackageImpl)registeredTankWarPackage : new TankWarPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theTankWarPackage.createPackageContents();

    // Initialize created meta-data
    theTankWarPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTankWarPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TankWarPackage.eNS_URI, theTankWarPackage);
    return theTankWarPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTankWarGame()
  {
    return tankWarGameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTankWarGame_Name()
  {
    return (EAttribute)tankWarGameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTankWarGame_Screen()
  {
    return (EReference)tankWarGameEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTankWarGame_Fields()
  {
    return (EReference)tankWarGameEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTankWarGame_Options()
  {
    return (EReference)tankWarGameEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getValue()
  {
    return valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDirectBehaviour()
  {
    return directBehaviourEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEndGameBehaviour()
  {
    return endGameBehaviourEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEndGameBehaviour_Win()
  {
    return (EAttribute)endGameBehaviourEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEndGameBehaviour_Lost()
  {
    return (EAttribute)endGameBehaviourEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStringValue()
  {
    return stringValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getStringValue_Value()
  {
    return (EAttribute)stringValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIntValue()
  {
    return intValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIntValue_Value()
  {
    return (EAttribute)intValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getScreenSpecification()
  {
    return screenSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getScreenSpecification_Name()
  {
    return (EAttribute)screenSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getScreenSpecification_ScreenWidth()
  {
    return (EAttribute)screenSpecificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getScreenSpecification_ScreenHeight()
  {
    return (EAttribute)screenSpecificationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getObstaclepecification()
  {
    return obstaclepecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getObstaclepecification_Name()
  {
    return (EAttribute)obstaclepecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getObstaclepecification_Fields()
  {
    return (EReference)obstaclepecificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getObstacleMember()
  {
    return obstacleMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getObstacleMember_Name()
  {
    return (EAttribute)obstacleMemberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getWaterObstacle()
  {
    return waterObstacleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getWallObstacle()
  {
    return wallObstacleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getWallObstacle_WallWidth()
  {
    return (EAttribute)wallObstacleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getWallObstacle_WallHeight()
  {
    return (EAttribute)wallObstacleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getWallObstacle_WallPosX()
  {
    return (EAttribute)wallObstacleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getWallObstacle_WallPosY()
  {
    return (EAttribute)wallObstacleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFieldSpecification()
  {
    return fieldSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFieldSpecification_Name()
  {
    return (EAttribute)fieldSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFieldSpecification_EnemyCount()
  {
    return (EAttribute)fieldSpecificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFieldSpecification_Obstacle()
  {
    return (EReference)fieldSpecificationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFieldInitialisations()
  {
    return fieldInitialisationsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLocalFieldInitialisations()
  {
    return localFieldInitialisationsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLocalFieldInitialisations_Initialisations()
  {
    return (EAttribute)localFieldInitialisationsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOptionSpecification()
  {
    return optionSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSuperModeDeclaration()
  {
    return superModeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStartFieldDeclaration()
  {
    return startFieldDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStartFieldDeclaration_Field()
  {
    return (EReference)startFieldDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAllowRestartMenu()
  {
    return allowRestartMenuEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNoOpBehaviour()
  {
    return noOpBehaviourEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TankWarFactory getTankWarFactory()
  {
    return (TankWarFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    tankWarGameEClass = createEClass(TANK_WAR_GAME);
    createEAttribute(tankWarGameEClass, TANK_WAR_GAME__NAME);
    createEReference(tankWarGameEClass, TANK_WAR_GAME__SCREEN);
    createEReference(tankWarGameEClass, TANK_WAR_GAME__FIELDS);
    createEReference(tankWarGameEClass, TANK_WAR_GAME__OPTIONS);

    valueEClass = createEClass(VALUE);

    directBehaviourEClass = createEClass(DIRECT_BEHAVIOUR);

    endGameBehaviourEClass = createEClass(END_GAME_BEHAVIOUR);
    createEAttribute(endGameBehaviourEClass, END_GAME_BEHAVIOUR__WIN);
    createEAttribute(endGameBehaviourEClass, END_GAME_BEHAVIOUR__LOST);

    stringValueEClass = createEClass(STRING_VALUE);
    createEAttribute(stringValueEClass, STRING_VALUE__VALUE);

    intValueEClass = createEClass(INT_VALUE);
    createEAttribute(intValueEClass, INT_VALUE__VALUE);

    screenSpecificationEClass = createEClass(SCREEN_SPECIFICATION);
    createEAttribute(screenSpecificationEClass, SCREEN_SPECIFICATION__NAME);
    createEAttribute(screenSpecificationEClass, SCREEN_SPECIFICATION__SCREEN_WIDTH);
    createEAttribute(screenSpecificationEClass, SCREEN_SPECIFICATION__SCREEN_HEIGHT);

    obstaclepecificationEClass = createEClass(OBSTACLEPECIFICATION);
    createEAttribute(obstaclepecificationEClass, OBSTACLEPECIFICATION__NAME);
    createEReference(obstaclepecificationEClass, OBSTACLEPECIFICATION__FIELDS);

    obstacleMemberEClass = createEClass(OBSTACLE_MEMBER);
    createEAttribute(obstacleMemberEClass, OBSTACLE_MEMBER__NAME);

    waterObstacleEClass = createEClass(WATER_OBSTACLE);

    wallObstacleEClass = createEClass(WALL_OBSTACLE);
    createEAttribute(wallObstacleEClass, WALL_OBSTACLE__WALL_WIDTH);
    createEAttribute(wallObstacleEClass, WALL_OBSTACLE__WALL_HEIGHT);
    createEAttribute(wallObstacleEClass, WALL_OBSTACLE__WALL_POS_X);
    createEAttribute(wallObstacleEClass, WALL_OBSTACLE__WALL_POS_Y);

    fieldSpecificationEClass = createEClass(FIELD_SPECIFICATION);
    createEAttribute(fieldSpecificationEClass, FIELD_SPECIFICATION__NAME);
    createEAttribute(fieldSpecificationEClass, FIELD_SPECIFICATION__ENEMY_COUNT);
    createEReference(fieldSpecificationEClass, FIELD_SPECIFICATION__OBSTACLE);

    fieldInitialisationsEClass = createEClass(FIELD_INITIALISATIONS);

    localFieldInitialisationsEClass = createEClass(LOCAL_FIELD_INITIALISATIONS);
    createEAttribute(localFieldInitialisationsEClass, LOCAL_FIELD_INITIALISATIONS__INITIALISATIONS);

    optionSpecificationEClass = createEClass(OPTION_SPECIFICATION);

    superModeDeclarationEClass = createEClass(SUPER_MODE_DECLARATION);

    startFieldDeclarationEClass = createEClass(START_FIELD_DECLARATION);
    createEReference(startFieldDeclarationEClass, START_FIELD_DECLARATION__FIELD);

    allowRestartMenuEClass = createEClass(ALLOW_RESTART_MENU);

    noOpBehaviourEClass = createEClass(NO_OP_BEHAVIOUR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    directBehaviourEClass.getESuperTypes().add(this.getValue());
    endGameBehaviourEClass.getESuperTypes().add(this.getDirectBehaviour());
    endGameBehaviourEClass.getESuperTypes().add(this.getOptionSpecification());
    stringValueEClass.getESuperTypes().add(this.getValue());
    intValueEClass.getESuperTypes().add(this.getValue());
    waterObstacleEClass.getESuperTypes().add(this.getObstacleMember());
    wallObstacleEClass.getESuperTypes().add(this.getObstacleMember());
    localFieldInitialisationsEClass.getESuperTypes().add(this.getFieldInitialisations());
    superModeDeclarationEClass.getESuperTypes().add(this.getOptionSpecification());
    startFieldDeclarationEClass.getESuperTypes().add(this.getOptionSpecification());
    allowRestartMenuEClass.getESuperTypes().add(this.getOptionSpecification());
    noOpBehaviourEClass.getESuperTypes().add(this.getDirectBehaviour());

    // Initialize classes and features; add operations and parameters
    initEClass(tankWarGameEClass, TankWarGame.class, "TankWarGame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTankWarGame_Name(), ecorePackage.getEString(), "name", null, 0, 1, TankWarGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTankWarGame_Screen(), this.getScreenSpecification(), null, "screen", null, 0, 1, TankWarGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTankWarGame_Fields(), this.getFieldSpecification(), null, "fields", null, 0, -1, TankWarGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTankWarGame_Options(), this.getOptionSpecification(), null, "options", null, 0, -1, TankWarGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(directBehaviourEClass, DirectBehaviour.class, "DirectBehaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(endGameBehaviourEClass, EndGameBehaviour.class, "EndGameBehaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEndGameBehaviour_Win(), ecorePackage.getEString(), "win", null, 0, 1, EndGameBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEndGameBehaviour_Lost(), ecorePackage.getEString(), "lost", null, 0, 1, EndGameBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intValueEClass, IntValue.class, "IntValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntValue_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(screenSpecificationEClass, ScreenSpecification.class, "ScreenSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScreenSpecification_Name(), ecorePackage.getEString(), "name", null, 0, 1, ScreenSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScreenSpecification_ScreenWidth(), ecorePackage.getEInt(), "screenWidth", null, 0, 1, ScreenSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScreenSpecification_ScreenHeight(), ecorePackage.getEInt(), "screenHeight", null, 0, 1, ScreenSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(obstaclepecificationEClass, Obstaclepecification.class, "Obstaclepecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObstaclepecification_Name(), ecorePackage.getEString(), "name", null, 0, 1, Obstaclepecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObstaclepecification_Fields(), this.getObstacleMember(), null, "fields", null, 0, -1, Obstaclepecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(obstacleMemberEClass, ObstacleMember.class, "ObstacleMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObstacleMember_Name(), ecorePackage.getEString(), "name", null, 0, 1, ObstacleMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(waterObstacleEClass, WaterObstacle.class, "WaterObstacle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(wallObstacleEClass, WallObstacle.class, "WallObstacle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWallObstacle_WallWidth(), ecorePackage.getEInt(), "wallWidth", null, 0, 1, WallObstacle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWallObstacle_WallHeight(), ecorePackage.getEInt(), "wallHeight", null, 0, 1, WallObstacle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWallObstacle_WallPosX(), ecorePackage.getEInt(), "wallPosX", null, 0, 1, WallObstacle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWallObstacle_WallPosY(), ecorePackage.getEInt(), "wallPosY", null, 0, 1, WallObstacle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldSpecificationEClass, FieldSpecification.class, "FieldSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFieldSpecification_Name(), ecorePackage.getEString(), "name", null, 0, 1, FieldSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldSpecification_EnemyCount(), ecorePackage.getEInt(), "enemyCount", null, 0, 1, FieldSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFieldSpecification_Obstacle(), this.getObstaclepecification(), null, "obstacle", null, 0, 1, FieldSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldInitialisationsEClass, FieldInitialisations.class, "FieldInitialisations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(localFieldInitialisationsEClass, LocalFieldInitialisations.class, "LocalFieldInitialisations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLocalFieldInitialisations_Initialisations(), ecorePackage.getEString(), "initialisations", null, 0, -1, LocalFieldInitialisations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionSpecificationEClass, OptionSpecification.class, "OptionSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(superModeDeclarationEClass, SuperModeDeclaration.class, "SuperModeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(startFieldDeclarationEClass, StartFieldDeclaration.class, "StartFieldDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStartFieldDeclaration_Field(), this.getFieldSpecification(), null, "field", null, 0, 1, StartFieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(allowRestartMenuEClass, AllowRestartMenu.class, "AllowRestartMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(noOpBehaviourEClass, NoOpBehaviour.class, "NoOpBehaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //TankWarPackageImpl
