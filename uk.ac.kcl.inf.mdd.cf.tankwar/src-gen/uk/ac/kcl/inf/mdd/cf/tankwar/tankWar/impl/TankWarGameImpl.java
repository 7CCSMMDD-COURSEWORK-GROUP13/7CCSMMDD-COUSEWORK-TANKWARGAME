/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.FieldSpecification;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.OptionSpecification;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.ScreenSpecification;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarGame;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.impl.TankWarGameImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.impl.TankWarGameImpl#getScreen <em>Screen</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.impl.TankWarGameImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.impl.TankWarGameImpl#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TankWarGameImpl extends MinimalEObjectImpl.Container implements TankWarGame
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getScreen() <em>Screen</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScreen()
   * @generated
   * @ordered
   */
  protected ScreenSpecification screen;

  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<FieldSpecification> fields;

  /**
   * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptions()
   * @generated
   * @ordered
   */
  protected EList<OptionSpecification> options;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TankWarGameImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TankWarPackage.Literals.TANK_WAR_GAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TankWarPackage.TANK_WAR_GAME__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ScreenSpecification getScreen()
  {
    return screen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScreen(ScreenSpecification newScreen, NotificationChain msgs)
  {
    ScreenSpecification oldScreen = screen;
    screen = newScreen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TankWarPackage.TANK_WAR_GAME__SCREEN, oldScreen, newScreen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setScreen(ScreenSpecification newScreen)
  {
    if (newScreen != screen)
    {
      NotificationChain msgs = null;
      if (screen != null)
        msgs = ((InternalEObject)screen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TankWarPackage.TANK_WAR_GAME__SCREEN, null, msgs);
      if (newScreen != null)
        msgs = ((InternalEObject)newScreen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TankWarPackage.TANK_WAR_GAME__SCREEN, null, msgs);
      msgs = basicSetScreen(newScreen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TankWarPackage.TANK_WAR_GAME__SCREEN, newScreen, newScreen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<FieldSpecification> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<FieldSpecification>(FieldSpecification.class, this, TankWarPackage.TANK_WAR_GAME__FIELDS);
    }
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<OptionSpecification> getOptions()
  {
    if (options == null)
    {
      options = new EObjectContainmentEList<OptionSpecification>(OptionSpecification.class, this, TankWarPackage.TANK_WAR_GAME__OPTIONS);
    }
    return options;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TankWarPackage.TANK_WAR_GAME__SCREEN:
        return basicSetScreen(null, msgs);
      case TankWarPackage.TANK_WAR_GAME__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
      case TankWarPackage.TANK_WAR_GAME__OPTIONS:
        return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TankWarPackage.TANK_WAR_GAME__NAME:
        return getName();
      case TankWarPackage.TANK_WAR_GAME__SCREEN:
        return getScreen();
      case TankWarPackage.TANK_WAR_GAME__FIELDS:
        return getFields();
      case TankWarPackage.TANK_WAR_GAME__OPTIONS:
        return getOptions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TankWarPackage.TANK_WAR_GAME__NAME:
        setName((String)newValue);
        return;
      case TankWarPackage.TANK_WAR_GAME__SCREEN:
        setScreen((ScreenSpecification)newValue);
        return;
      case TankWarPackage.TANK_WAR_GAME__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends FieldSpecification>)newValue);
        return;
      case TankWarPackage.TANK_WAR_GAME__OPTIONS:
        getOptions().clear();
        getOptions().addAll((Collection<? extends OptionSpecification>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TankWarPackage.TANK_WAR_GAME__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TankWarPackage.TANK_WAR_GAME__SCREEN:
        setScreen((ScreenSpecification)null);
        return;
      case TankWarPackage.TANK_WAR_GAME__FIELDS:
        getFields().clear();
        return;
      case TankWarPackage.TANK_WAR_GAME__OPTIONS:
        getOptions().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TankWarPackage.TANK_WAR_GAME__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TankWarPackage.TANK_WAR_GAME__SCREEN:
        return screen != null;
      case TankWarPackage.TANK_WAR_GAME__FIELDS:
        return fields != null && !fields.isEmpty();
      case TankWarPackage.TANK_WAR_GAME__OPTIONS:
        return options != null && !options.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //TankWarGameImpl
