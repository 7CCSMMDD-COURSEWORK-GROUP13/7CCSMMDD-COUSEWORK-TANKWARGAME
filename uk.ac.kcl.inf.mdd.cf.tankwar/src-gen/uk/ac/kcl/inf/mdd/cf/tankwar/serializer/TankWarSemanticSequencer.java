/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.mdd.cf.tankwar.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import uk.ac.kcl.inf.mdd.cf.tankwar.services.TankWarGrammarAccess;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Addition;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.AllowRestartMenu;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.EndGameBehaviour;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.FieldSpecification;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.IntLiteral;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.IntVarExpression;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Multiplication;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Obstaclepecification;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.RealLiteral;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.ScreenSpecification;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.StartFieldDeclaration;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.SuperModeDeclaration;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarGame;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarPackage;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.VariableDeclaration;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.WallObstacle;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.WaterObstacle;

@SuppressWarnings("all")
public class TankWarSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TankWarGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TankWarPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TankWarPackage.ADDITION:
				sequence_Addition(context, (Addition) semanticObject); 
				return; 
			case TankWarPackage.ALLOW_RESTART_MENU:
				sequence_AllowRestartMenu(context, (AllowRestartMenu) semanticObject); 
				return; 
			case TankWarPackage.END_GAME_BEHAVIOUR:
				sequence_EndGameBehaviour(context, (EndGameBehaviour) semanticObject); 
				return; 
			case TankWarPackage.FIELD_SPECIFICATION:
				sequence_FieldSpecification(context, (FieldSpecification) semanticObject); 
				return; 
			case TankWarPackage.INT_LITERAL:
				sequence_IntLiteral(context, (IntLiteral) semanticObject); 
				return; 
			case TankWarPackage.INT_VAR_EXPRESSION:
				sequence_IntVarExpression(context, (IntVarExpression) semanticObject); 
				return; 
			case TankWarPackage.MULTIPLICATION:
				sequence_Multiplication(context, (Multiplication) semanticObject); 
				return; 
			case TankWarPackage.OBSTACLEPECIFICATION:
				sequence_Obstaclepecification(context, (Obstaclepecification) semanticObject); 
				return; 
			case TankWarPackage.REAL_LITERAL:
				sequence_RealLiteral(context, (RealLiteral) semanticObject); 
				return; 
			case TankWarPackage.SCREEN_SPECIFICATION:
				sequence_ScreenSpecification(context, (ScreenSpecification) semanticObject); 
				return; 
			case TankWarPackage.START_FIELD_DECLARATION:
				sequence_StartFieldDeclaration(context, (StartFieldDeclaration) semanticObject); 
				return; 
			case TankWarPackage.SUPER_MODE_DECLARATION:
				sequence_SuperModeDeclaration(context, (SuperModeDeclaration) semanticObject); 
				return; 
			case TankWarPackage.TANK_WAR_GAME:
				sequence_TankWarGame(context, (TankWarGame) semanticObject); 
				return; 
			case TankWarPackage.VARIABLE_DECLARATION:
				sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
				return; 
			case TankWarPackage.WALL_OBSTACLE:
				sequence_WallObstacle(context, (WallObstacle) semanticObject); 
				return; 
			case TankWarPackage.WATER_OBSTACLE:
				sequence_WaterObstacle(context, (WaterObstacle) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Addition returns Addition
	 *     Addition.Addition_1_0 returns Addition
	 *     Multiplication returns Addition
	 *     Multiplication.Multiplication_1_0 returns Addition
	 *     Primary returns Addition
	 *
	 * Constraint:
	 *     (left=Addition_Addition_1_0 (operator+='+' | operator+='-') right+=Multiplication)
	 */
	protected void sequence_Addition(ISerializationContext context, Addition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OptionSpecification returns AllowRestartMenu
	 *     AllowRestartMenu returns AllowRestartMenu
	 *
	 * Constraint:
	 *     {AllowRestartMenu}
	 */
	protected void sequence_AllowRestartMenu(ISerializationContext context, AllowRestartMenu semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EndGameBehaviour returns EndGameBehaviour
	 *     OptionSpecification returns EndGameBehaviour
	 *
	 * Constraint:
	 *     (win=STRING lost=STRING)
	 */
	protected void sequence_EndGameBehaviour(ISerializationContext context, EndGameBehaviour semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TankWarPackage.Literals.END_GAME_BEHAVIOUR__WIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TankWarPackage.Literals.END_GAME_BEHAVIOUR__WIN));
			if (transientValues.isValueTransient(semanticObject, TankWarPackage.Literals.END_GAME_BEHAVIOUR__LOST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TankWarPackage.Literals.END_GAME_BEHAVIOUR__LOST));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEndGameBehaviourAccess().getWinSTRINGTerminalRuleCall_2_0(), semanticObject.getWin());
		feeder.accept(grammarAccess.getEndGameBehaviourAccess().getLostSTRINGTerminalRuleCall_4_0(), semanticObject.getLost());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FieldSpecification returns FieldSpecification
	 *
	 * Constraint:
	 *     (name=ID enemyCount=Addition obstacle=Obstaclepecification nextLevel=[FieldSpecification|ID])
	 */
	protected void sequence_FieldSpecification(ISerializationContext context, FieldSpecification semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TankWarPackage.Literals.FIELD_SPECIFICATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TankWarPackage.Literals.FIELD_SPECIFICATION__NAME));
			if (transientValues.isValueTransient(semanticObject, TankWarPackage.Literals.FIELD_SPECIFICATION__ENEMY_COUNT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TankWarPackage.Literals.FIELD_SPECIFICATION__ENEMY_COUNT));
			if (transientValues.isValueTransient(semanticObject, TankWarPackage.Literals.FIELD_SPECIFICATION__OBSTACLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TankWarPackage.Literals.FIELD_SPECIFICATION__OBSTACLE));
			if (transientValues.isValueTransient(semanticObject, TankWarPackage.Literals.FIELD_SPECIFICATION__NEXT_LEVEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TankWarPackage.Literals.FIELD_SPECIFICATION__NEXT_LEVEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFieldSpecificationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFieldSpecificationAccess().getEnemyCountAdditionParserRuleCall_5_0(), semanticObject.getEnemyCount());
		feeder.accept(grammarAccess.getFieldSpecificationAccess().getObstacleObstaclepecificationParserRuleCall_6_0(), semanticObject.getObstacle());
		feeder.accept(grammarAccess.getFieldSpecificationAccess().getNextLevelFieldSpecificationIDTerminalRuleCall_9_0_1(), semanticObject.eGet(TankWarPackage.Literals.FIELD_SPECIFICATION__NEXT_LEVEL, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Addition returns IntLiteral
	 *     Addition.Addition_1_0 returns IntLiteral
	 *     Multiplication returns IntLiteral
	 *     Multiplication.Multiplication_1_0 returns IntLiteral
	 *     Primary returns IntLiteral
	 *     IntLiteral returns IntLiteral
	 *
	 * Constraint:
	 *     val=INT
	 */
	protected void sequence_IntLiteral(ISerializationContext context, IntLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TankWarPackage.Literals.INT_LITERAL__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TankWarPackage.Literals.INT_LITERAL__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Addition returns IntVarExpression
	 *     Addition.Addition_1_0 returns IntVarExpression
	 *     Multiplication returns IntVarExpression
	 *     Multiplication.Multiplication_1_0 returns IntVarExpression
	 *     Primary returns IntVarExpression
	 *     IntVarExpression returns IntVarExpression
	 *
	 * Constraint:
	 *     var=[VariableDeclaration|ID]
	 */
	protected void sequence_IntVarExpression(ISerializationContext context, IntVarExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TankWarPackage.Literals.INT_VAR_EXPRESSION__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TankWarPackage.Literals.INT_VAR_EXPRESSION__VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1(), semanticObject.eGet(TankWarPackage.Literals.INT_VAR_EXPRESSION__VAR, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Addition returns Multiplication
	 *     Addition.Addition_1_0 returns Multiplication
	 *     Multiplication returns Multiplication
	 *     Multiplication.Multiplication_1_0 returns Multiplication
	 *     Primary returns Multiplication
	 *
	 * Constraint:
	 *     (left=Multiplication_Multiplication_1_0 (operator+='*' | operator+='/') right+=Primary)
	 */
	protected void sequence_Multiplication(ISerializationContext context, Multiplication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Obstaclepecification returns Obstaclepecification
	 *
	 * Constraint:
	 *     (name=ID fields+=ObstacleMember*)
	 */
	protected void sequence_Obstaclepecification(ISerializationContext context, Obstaclepecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Addition returns RealLiteral
	 *     Addition.Addition_1_0 returns RealLiteral
	 *     Multiplication returns RealLiteral
	 *     Multiplication.Multiplication_1_0 returns RealLiteral
	 *     Primary returns RealLiteral
	 *     RealLiteral returns RealLiteral
	 *
	 * Constraint:
	 *     val=REAL
	 */
	protected void sequence_RealLiteral(ISerializationContext context, RealLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TankWarPackage.Literals.REAL_LITERAL__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TankWarPackage.Literals.REAL_LITERAL__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRealLiteralAccess().getValREALParserRuleCall_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ScreenSpecification returns ScreenSpecification
	 *
	 * Constraint:
	 *     (name=ID screenWidth=INT screenHeight=INT)
	 */
	protected void sequence_ScreenSpecification(ISerializationContext context, ScreenSpecification semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TankWarPackage.Literals.SCREEN_SPECIFICATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TankWarPackage.Literals.SCREEN_SPECIFICATION__NAME));
			if (transientValues.isValueTransient(semanticObject, TankWarPackage.Literals.SCREEN_SPECIFICATION__SCREEN_WIDTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TankWarPackage.Literals.SCREEN_SPECIFICATION__SCREEN_WIDTH));
			if (transientValues.isValueTransient(semanticObject, TankWarPackage.Literals.SCREEN_SPECIFICATION__SCREEN_HEIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TankWarPackage.Literals.SCREEN_SPECIFICATION__SCREEN_HEIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getScreenSpecificationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getScreenSpecificationAccess().getScreenWidthINTTerminalRuleCall_5_0(), semanticObject.getScreenWidth());
		feeder.accept(grammarAccess.getScreenSpecificationAccess().getScreenHeightINTTerminalRuleCall_8_0(), semanticObject.getScreenHeight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     OptionSpecification returns StartFieldDeclaration
	 *     StartFieldDeclaration returns StartFieldDeclaration
	 *
	 * Constraint:
	 *     field=[FieldSpecification|ID]
	 */
	protected void sequence_StartFieldDeclaration(ISerializationContext context, StartFieldDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TankWarPackage.Literals.START_FIELD_DECLARATION__FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TankWarPackage.Literals.START_FIELD_DECLARATION__FIELD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStartFieldDeclarationAccess().getFieldFieldSpecificationIDTerminalRuleCall_2_0_1(), semanticObject.eGet(TankWarPackage.Literals.START_FIELD_DECLARATION__FIELD, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     OptionSpecification returns SuperModeDeclaration
	 *     SuperModeDeclaration returns SuperModeDeclaration
	 *
	 * Constraint:
	 *     {SuperModeDeclaration}
	 */
	protected void sequence_SuperModeDeclaration(ISerializationContext context, SuperModeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TankWarGame returns TankWarGame
	 *
	 * Constraint:
	 *     (name=ID variable+=VariableDeclaration? screen=ScreenSpecification fields+=FieldSpecification+ options+=OptionSpecification+)
	 */
	protected void sequence_TankWarGame(ISerializationContext context, TankWarGame semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VariableDeclaration returns VariableDeclaration
	 *
	 * Constraint:
	 *     (name=ID value=INT)
	 */
	protected void sequence_VariableDeclaration(ISerializationContext context, VariableDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TankWarPackage.Literals.VARIABLE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TankWarPackage.Literals.VARIABLE_DECLARATION__NAME));
			if (transientValues.isValueTransient(semanticObject, TankWarPackage.Literals.VARIABLE_DECLARATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TankWarPackage.Literals.VARIABLE_DECLARATION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ObstacleMember returns WallObstacle
	 *     WallObstacle returns WallObstacle
	 *
	 * Constraint:
	 *     (name=ID wallWidth=INT wallHeight=INT wallPosX=INT wallPosY=INT)
	 */
	protected void sequence_WallObstacle(ISerializationContext context, WallObstacle semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TankWarPackage.Literals.OBSTACLE_MEMBER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TankWarPackage.Literals.OBSTACLE_MEMBER__NAME));
			if (transientValues.isValueTransient(semanticObject, TankWarPackage.Literals.WALL_OBSTACLE__WALL_WIDTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TankWarPackage.Literals.WALL_OBSTACLE__WALL_WIDTH));
			if (transientValues.isValueTransient(semanticObject, TankWarPackage.Literals.WALL_OBSTACLE__WALL_HEIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TankWarPackage.Literals.WALL_OBSTACLE__WALL_HEIGHT));
			if (transientValues.isValueTransient(semanticObject, TankWarPackage.Literals.WALL_OBSTACLE__WALL_POS_X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TankWarPackage.Literals.WALL_OBSTACLE__WALL_POS_X));
			if (transientValues.isValueTransient(semanticObject, TankWarPackage.Literals.WALL_OBSTACLE__WALL_POS_Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TankWarPackage.Literals.WALL_OBSTACLE__WALL_POS_Y));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWallObstacleAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getWallObstacleAccess().getWallWidthINTTerminalRuleCall_5_0(), semanticObject.getWallWidth());
		feeder.accept(grammarAccess.getWallObstacleAccess().getWallHeightINTTerminalRuleCall_8_0(), semanticObject.getWallHeight());
		feeder.accept(grammarAccess.getWallObstacleAccess().getWallPosXINTTerminalRuleCall_11_0(), semanticObject.getWallPosX());
		feeder.accept(grammarAccess.getWallObstacleAccess().getWallPosYINTTerminalRuleCall_14_0(), semanticObject.getWallPosY());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ObstacleMember returns WaterObstacle
	 *     WaterObstacle returns WaterObstacle
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_WaterObstacle(ISerializationContext context, WaterObstacle semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TankWarPackage.Literals.OBSTACLE_MEMBER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TankWarPackage.Literals.OBSTACLE_MEMBER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWaterObstacleAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
