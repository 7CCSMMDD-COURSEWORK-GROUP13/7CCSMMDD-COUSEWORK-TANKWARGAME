package uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.semantics;

import com.google.common.collect.Iterables;
import com.google.inject.Provider;
import java.util.Collections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xsemantics.runtime.ErrorInformation;
import org.eclipse.xsemantics.runtime.Result;
import org.eclipse.xsemantics.runtime.RuleApplicationTrace;
import org.eclipse.xsemantics.runtime.RuleEnvironment;
import org.eclipse.xsemantics.runtime.RuleFailedException;
import org.eclipse.xsemantics.runtime.XsemanticsProvider;
import org.eclipse.xsemantics.runtime.XsemanticsRuntimeSystem;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.kcl.inf.mdd.cf.tankwar.semantics.TgameType;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Addition;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.EndGameBehaviour;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Expression;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.IntLiteral;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.IntVarExpression;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Multiplication;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.RealLiteral;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.VariableDeclaration;

@SuppressWarnings("all")
public class TgameSemantics extends XsemanticsRuntimeSystem {
  public static final String TYPEEXPRESSIONS = "uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.semantics.TypeExpressions";
  
  public static final String TINTLIT = "uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.semantics.TIntLit";
  
  public static final String TREALLIT = "uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.semantics.TRealLit";
  
  public static final String TVARREF = "uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.semantics.TVarRef";
  
  public static final String TMULTIPLICATION = "uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.semantics.TMultiplication";
  
  public static final String TADDITION = "uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.semantics.TAddition";
  
  private PolymorphicDispatcher<TgameType> typeExpressionsDispatcher;
  
  private PolymorphicDispatcher<Result<TgameType>> typeDispatcher;
  
  private PolymorphicDispatcher<Result<Boolean>> subTypeDispatcher;
  
  public TgameSemantics() {
    init();
  }
  
  public void init() {
    typeDispatcher = buildPolymorphicDispatcher1(
    	"typeImpl", 3, "|-", ":");
    subTypeDispatcher = buildPolymorphicDispatcher1(
    	"subTypeImpl", 4, "|-", "<:");
    typeExpressionsDispatcher = buildPolymorphicDispatcher(
    	"typeExpressionsImpl", 2);
  }
  
  public TgameType typeExpressions(final Iterable<Expression> exps) throws RuleFailedException {
    return typeExpressions(null, exps);
  }
  
  public TgameType typeExpressions(final RuleApplicationTrace _trace_, final Iterable<Expression> exps) throws RuleFailedException {
    try {
    	return typeExpressionsInternal(_trace_, exps);
    } catch (Exception _e_typeExpressions) {
    	throw extractRuleFailedException(_e_typeExpressions);
    }
  }
  
  public Result<TgameType> type(final Expression exp) {
    return type(new RuleEnvironment(), null, exp);
  }
  
  public Result<TgameType> type(final RuleEnvironment _environment_, final Expression exp) {
    return type(_environment_, null, exp);
  }
  
  public Result<TgameType> type(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final Expression exp) {
    return getFromCache("type", _environment_, _trace_,
    	new XsemanticsProvider<Result<TgameType>>(_environment_, _trace_) {
    		public Result<TgameType> doGet() {
    			try {
    				return typeInternal(_environment_, _trace_, exp);
    			} catch (Exception _e_type) {
    				return resultForFailure(_e_type);
    			}
    		}
    	}, exp);
  }
  
  public Result<Boolean> subType(final TgameType left, final TgameType right) {
    return subType(new RuleEnvironment(), null, left, right);
  }
  
  public Result<Boolean> subType(final RuleEnvironment _environment_, final TgameType left, final TgameType right) {
    return subType(_environment_, null, left, right);
  }
  
  public Result<Boolean> subType(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final TgameType left, final TgameType right) {
    try {
    	return subTypeInternal(_environment_, _trace_, left, right);
    } catch (Exception _e_subType) {
    	return resultForFailure(_e_subType);
    }
  }
  
  public Boolean subTypeSucceeded(final TgameType left, final TgameType right) {
    return subTypeSucceeded(new RuleEnvironment(), null, left, right);
  }
  
  public Boolean subTypeSucceeded(final RuleEnvironment _environment_, final TgameType left, final TgameType right) {
    return subTypeSucceeded(_environment_, null, left, right);
  }
  
  public Boolean subTypeSucceeded(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final TgameType left, final TgameType right) {
    try {
    	subTypeInternal(_environment_, _trace_, left, right);
    	return true;
    } catch (Exception _e_subType) {
    	return false;
    }
  }
  
  public Result<Boolean> checkBaseEnemyCount(final VariableDeclaration variable) {
    return checkBaseEnemyCount(null, variable);
  }
  
  public Result<Boolean> checkBaseEnemyCount(final RuleApplicationTrace _trace_, final VariableDeclaration variable) {
    try {
    	return checkBaseEnemyCountInternal(_trace_, variable);
    } catch (Exception _e_checkBaseEnemyCount) {
    	return resultForFailure(_e_checkBaseEnemyCount);
    }
  }
  
  protected Result<Boolean> checkBaseEnemyCountInternal(final RuleApplicationTrace _trace_, final VariableDeclaration variable) throws RuleFailedException {
    int _value = variable.getValue();
    /* variable.value < 20 */
    if (!(_value < 20)) {
      sneakyThrowRuleFailedException("variable.value < 20");
    }
    return new Result<Boolean>(true);
  }
  
  public Result<Boolean> checkMessage(final EndGameBehaviour endGame) {
    return checkMessage(null, endGame);
  }
  
  public Result<Boolean> checkMessage(final RuleApplicationTrace _trace_, final EndGameBehaviour endGame) {
    try {
    	return checkMessageInternal(_trace_, endGame);
    } catch (Exception _e_checkMessage) {
    	return resultForFailure(_e_checkMessage);
    }
  }
  
  protected Result<Boolean> checkMessageInternal(final RuleApplicationTrace _trace_, final EndGameBehaviour endGame) throws RuleFailedException {
    /* endGame.win.length() < 30 && endGame.lost.length() < 30 */
    if (!((endGame.getWin().length() < 30) && 
      (endGame.getLost().length() < 30))) {
      sneakyThrowRuleFailedException("endGame.win.length() < 30 && endGame.lost.length() < 30");
    }
    return new Result<Boolean>(true);
  }
  
  protected TgameType typeExpressionsInternal(final RuleApplicationTrace _trace_, final Iterable<Expression> exps) {
    return getFromCache("typeExpressionsInternal", (RuleEnvironment)null, _trace_,
    	new XsemanticsProvider<TgameType>(null, _trace_) {
    		public TgameType doGet() {
    			try {
    				checkParamsNotNull(exps);
    				return typeExpressionsDispatcher.invoke(_trace_, exps);
    			} catch (Exception _e_typeExpressions) {
    				sneakyThrowRuleFailedException(_e_typeExpressions);
    				return null;
    			}
    		}
    	}, exps);
  }
  
  protected void typeExpressionsThrowException(final String _error, final String _issue, final Exception _ex, final Iterable<Expression> exps, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    throwRuleFailedException(_error, _issue, _ex, _errorInformations);
  }
  
  protected Result<TgameType> typeInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final Expression exp) {
    return getFromCache("typeInternal", _environment_, _trace_,
    	new XsemanticsProvider<Result<TgameType>>(_environment_, _trace_) {
    		public Result<TgameType> doGet() {
    			try {
    				checkParamsNotNull(exp);
    				return typeDispatcher.invoke(_environment_, _trace_, exp);
    			} catch (Exception _e_type) {
    				sneakyThrowRuleFailedException(_e_type);
    				return null;
    			}
    		}
    	}, exp);
  }
  
  protected void typeThrowException(final String _error, final String _issue, final Exception _ex, final Expression exp, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    String _stringRep = this.stringRep(exp);
    String _plus = ("cannot type " + _stringRep);
    String error = _plus;
    throwRuleFailedException(error,
    	_issue, _ex, new ErrorInformation(null, null));
  }
  
  protected Result<Boolean> subTypeInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final TgameType left, final TgameType right) {
    try {
    	checkParamsNotNull(left, right);
    	return subTypeDispatcher.invoke(_environment_, _trace_, left, right);
    } catch (Exception _e_subType) {
    	sneakyThrowRuleFailedException(_e_subType);
    	return null;
    }
  }
  
  protected void subTypeThrowException(final String _error, final String _issue, final Exception _ex, final TgameType left, final TgameType right, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    String _stringRep = this.stringRep(left);
    String _plus = (_stringRep + " is not a subtype of ");
    String _stringRep_1 = this.stringRep(right);
    String _plus_1 = (_plus + _stringRep_1);
    String error = _plus_1;
    throwRuleFailedException(error,
    	_issue, _ex, new ErrorInformation(null, null));
  }
  
  protected TgameType typeExpressionsImpl(final RuleApplicationTrace _trace_, final Iterable<Expression> exps) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final TgameType _result_ = applyAuxFunTypeExpressions(_subtrace_, exps);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return auxFunName("typeExpressions") + "(" + stringRep(exps)+ ")" + " = " + stringRep(_result_);
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyAuxFunTypeExpressions) {
    	typeExpressionsThrowException(auxFunName("typeExpressions") + "(" + stringRep(exps)+ ")",
    		TYPEEXPRESSIONS,
    		e_applyAuxFunTypeExpressions, exps, new ErrorInformation[] {});
    	return null;
    }
  }
  
  protected TgameType applyAuxFunTypeExpressions(final RuleApplicationTrace _trace_, final Iterable<Expression> exps) throws RuleFailedException {
    final Function1<Expression, Boolean> _function = (Expression exp) -> {
      boolean _xblockexpression = false;
      {
        /* empty |- exp : var TgameType exp2Type */
        TgameType exp2Type = null;
        Result<TgameType> result = typeInternal(emptyEnvironment(), _trace_, exp);
        checkAssignableTo(result.getFirst(), TgameType.class);
        exp2Type = (TgameType) result.getFirst();
        
        _xblockexpression = (exp2Type == TgameType.INT);
      }
      return Boolean.valueOf(_xblockexpression);
    };
    boolean _forall = IterableExtensions.<Expression>forall(exps, _function);
    if (_forall) {
      return TgameType.INT;
    } else {
      return TgameType.REAL;
    }
  }
  
  protected Result<TgameType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final IntLiteral exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<TgameType> _result_ = applyRuleTIntLit(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TIntLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTIntLit) {
    	typeThrowException(ruleName("TIntLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "TgameType",
    		TINTLIT,
    		e_applyRuleTIntLit, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<TgameType> applyRuleTIntLit(final RuleEnvironment G, final RuleApplicationTrace _trace_, final IntLiteral exp) throws RuleFailedException {
    
    return new Result<TgameType>(_applyRuleTIntLit_1(G, exp));
  }
  
  private TgameType _applyRuleTIntLit_1(final RuleEnvironment G, final IntLiteral exp) throws RuleFailedException {
    return TgameType.INT;
  }
  
  protected Result<TgameType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final RealLiteral exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<TgameType> _result_ = applyRuleTRealLit(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TRealLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTRealLit) {
    	typeThrowException(ruleName("TRealLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "TgameType",
    		TREALLIT,
    		e_applyRuleTRealLit, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<TgameType> applyRuleTRealLit(final RuleEnvironment G, final RuleApplicationTrace _trace_, final RealLiteral exp) throws RuleFailedException {
    
    return new Result<TgameType>(_applyRuleTRealLit_1(G, exp));
  }
  
  private TgameType _applyRuleTRealLit_1(final RuleEnvironment G, final RealLiteral exp) throws RuleFailedException {
    return TgameType.REAL;
  }
  
  protected Result<TgameType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final IntVarExpression exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<TgameType> _result_ = applyRuleTVarRef(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TVarRef") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTVarRef) {
    	typeThrowException(ruleName("TVarRef") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "TgameType",
    		TVARREF,
    		e_applyRuleTVarRef, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<TgameType> applyRuleTVarRef(final RuleEnvironment G, final RuleApplicationTrace _trace_, final IntVarExpression exp) throws RuleFailedException {
    
    return new Result<TgameType>(_applyRuleTVarRef_1(G, exp));
  }
  
  private TgameType _applyRuleTVarRef_1(final RuleEnvironment G, final IntVarExpression exp) throws RuleFailedException {
    return TgameType.INT;
  }
  
  protected Result<TgameType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Multiplication exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<TgameType> _result_ = applyRuleTMultiplication(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TMultiplication") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTMultiplication) {
    	typeThrowException(ruleName("TMultiplication") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "TgameType",
    		TMULTIPLICATION,
    		e_applyRuleTMultiplication, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<TgameType> applyRuleTMultiplication(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Multiplication exp) throws RuleFailedException {
    TgameType t = null; // output parameter
    EList<Expression> _right = exp.getRight();
    Expression _left = exp.getLeft();
    t = this.typeExpressionsInternal(_trace_, Iterables.<Expression>concat(_right, Collections.<Expression>unmodifiableList(CollectionLiterals.<Expression>newArrayList(_left))));
    return new Result<TgameType>(t);
  }
  
  protected Result<TgameType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Addition exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<TgameType> _result_ = applyRuleTAddition(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TAddition") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTAddition) {
    	typeThrowException(ruleName("TAddition") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "TgameType",
    		TADDITION,
    		e_applyRuleTAddition, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<TgameType> applyRuleTAddition(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Addition exp) throws RuleFailedException {
    TgameType t = null; // output parameter
    EList<Expression> _right = exp.getRight();
    Expression _left = exp.getLeft();
    t = this.typeExpressionsInternal(_trace_, Iterables.<Expression>concat(_right, Collections.<Expression>unmodifiableList(CollectionLiterals.<Expression>newArrayList(_left))));
    return new Result<TgameType>(t);
  }
}
