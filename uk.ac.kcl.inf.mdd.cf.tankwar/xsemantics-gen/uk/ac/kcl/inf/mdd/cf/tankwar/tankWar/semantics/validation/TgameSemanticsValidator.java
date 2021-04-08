package uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.semantics.validation;

import com.google.inject.Inject;
import org.eclipse.xsemantics.runtime.validation.XsemanticsValidatorErrorGenerator;
import org.eclipse.xtext.validation.Check;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.EndGameBehaviour;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.VariableDeclaration;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.semantics.TgameSemantics;
import uk.ac.kcl.inf.mdd.cf.tankwar.validation.AbstractTankWarValidator;

@SuppressWarnings("all")
public class TgameSemanticsValidator extends AbstractTankWarValidator {
  @Inject
  protected XsemanticsValidatorErrorGenerator errorGenerator;
  
  @Inject
  protected TgameSemantics xsemanticsSystem;
  
  protected TgameSemantics getXsemanticsSystem() {
    return this.xsemanticsSystem;
  }
  
  @Check
  public void checkVariableDeclaration(final VariableDeclaration variable) {
    errorGenerator.generateErrors(this,
    	getXsemanticsSystem().checkVariableDeclaration(variable),
    		variable);
  }
  
  @Check
  public void checkMessage(final EndGameBehaviour endGame) {
    errorGenerator.generateErrors(this,
    	getXsemanticsSystem().checkMessage(endGame),
    		endGame);
  }
}
