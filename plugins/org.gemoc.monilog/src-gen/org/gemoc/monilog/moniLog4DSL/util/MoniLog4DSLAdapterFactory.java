/**
 * generated by Xtext 2.22.0
 */
package org.gemoc.monilog.moniLog4DSL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gemoc.monilog.moniLog4DSL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage
 * @generated
 */
public class MoniLog4DSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MoniLog4DSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoniLog4DSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MoniLog4DSLPackage.eINSTANCE;
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
  protected MoniLog4DSLSwitch<Adapter> modelSwitch =
    new MoniLog4DSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseDocument(Document object)
      {
        return createDocumentAdapter();
      }
      @Override
      public Adapter caseAppender(Appender object)
      {
        return createAppenderAdapter();
      }
      @Override
      public Adapter caseLocalAppender(LocalAppender object)
      {
        return createLocalAppenderAdapter();
      }
      @Override
      public Adapter caseExternalAppender(ExternalAppender object)
      {
        return createExternalAppenderAdapter();
      }
      @Override
      public Adapter caseLayout(Layout object)
      {
        return createLayoutAdapter();
      }
      @Override
      public Adapter caseLocalLayout(LocalLayout object)
      {
        return createLocalLayoutAdapter();
      }
      @Override
      public Adapter caseExternalLayout(ExternalLayout object)
      {
        return createExternalLayoutAdapter();
      }
      @Override
      public Adapter caseMoniLogger(MoniLogger object)
      {
        return createMoniLoggerAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseASTEvent(ASTEvent object)
      {
        return createASTEventAdapter();
      }
      @Override
      public Adapter caseComplexEvent(ComplexEvent object)
      {
        return createComplexEventAdapter();
      }
      @Override
      public Adapter caseUserEvent(UserEvent object)
      {
        return createUserEventAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseTemporalPattern(TemporalPattern object)
      {
        return createTemporalPatternAdapter();
      }
      @Override
      public Adapter casePattern(Pattern object)
      {
        return createPatternAdapter();
      }
      @Override
      public Adapter caseBoundType(BoundType object)
      {
        return createBoundTypeAdapter();
      }
      @Override
      public Adapter caseExactBound(ExactBound object)
      {
        return createExactBoundAdapter();
      }
      @Override
      public Adapter caseLowerBound(LowerBound object)
      {
        return createLowerBoundAdapter();
      }
      @Override
      public Adapter caseUpperBound(UpperBound object)
      {
        return createUpperBoundAdapter();
      }
      @Override
      public Adapter caseScope(Scope object)
      {
        return createScopeAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseAppenderCall(AppenderCall object)
      {
        return createAppenderCallAdapter();
      }
      @Override
      public Adapter caseAppenderRef(AppenderRef object)
      {
        return createAppenderRefAdapter();
      }
      @Override
      public Adapter caseAppenderCallArgument(AppenderCallArgument object)
      {
        return createAppenderCallArgumentAdapter();
      }
      @Override
      public Adapter caseLayoutCall(LayoutCall object)
      {
        return createLayoutCallAdapter();
      }
      @Override
      public Adapter caseLayoutRef(LayoutRef object)
      {
        return createLayoutRefAdapter();
      }
      @Override
      public Adapter caseEmitEvent(EmitEvent object)
      {
        return createEmitEventAdapter();
      }
      @Override
      public Adapter caseMoniLoggerCall(MoniLoggerCall object)
      {
        return createMoniLoggerCallAdapter();
      }
      @Override
      public Adapter caseStreamEvent(StreamEvent object)
      {
        return createStreamEventAdapter();
      }
      @Override
      public Adapter caseEmptyOrPropertyValue(EmptyOrPropertyValue object)
      {
        return createEmptyOrPropertyValueAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseParameterReference(ParameterReference object)
      {
        return createParameterReferenceAdapter();
      }
      @Override
      public Adapter caseLanguageExpression(LanguageExpression object)
      {
        return createLanguageExpressionAdapter();
      }
      @Override
      public Adapter caseLanguageExpressionCondition(LanguageExpressionCondition object)
      {
        return createLanguageExpressionConditionAdapter();
      }
      @Override
      public Adapter caseExistence(Existence object)
      {
        return createExistenceAdapter();
      }
      @Override
      public Adapter caseUniversality(Universality object)
      {
        return createUniversalityAdapter();
      }
      @Override
      public Adapter caseAbsence(Absence object)
      {
        return createAbsenceAdapter();
      }
      @Override
      public Adapter casePrecedence(Precedence object)
      {
        return createPrecedenceAdapter();
      }
      @Override
      public Adapter caseResponse(Response object)
      {
        return createResponseAdapter();
      }
      @Override
      public Adapter caseGlobally(Globally object)
      {
        return createGloballyAdapter();
      }
      @Override
      public Adapter caseAfter(After object)
      {
        return createAfterAdapter();
      }
      @Override
      public Adapter caseBefore(Before object)
      {
        return createBeforeAdapter();
      }
      @Override
      public Adapter caseBetween(Between object)
      {
        return createBetweenAdapter();
      }
      @Override
      public Adapter caseAfterUntil(AfterUntil object)
      {
        return createAfterUntilAdapter();
      }
      @Override
      public Adapter caseStartMoniLogger(StartMoniLogger object)
      {
        return createStartMoniLoggerAdapter();
      }
      @Override
      public Adapter caseStopMoniLogger(StopMoniLogger object)
      {
        return createStopMoniLoggerAdapter();
      }
      @Override
      public Adapter caseEmpty(Empty object)
      {
        return createEmptyAdapter();
      }
      @Override
      public Adapter casePropertyValue(PropertyValue object)
      {
        return createPropertyValueAdapter();
      }
      @Override
      public Adapter caseExplicitLanguageExpression(ExplicitLanguageExpression object)
      {
        return createExplicitLanguageExpressionAdapter();
      }
      @Override
      public Adapter caseDefaultLanguageExpression(DefaultLanguageExpression object)
      {
        return createDefaultLanguageExpressionAdapter();
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
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.Document <em>Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.Document
   * @generated
   */
  public Adapter createDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.Appender <em>Appender</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.Appender
   * @generated
   */
  public Adapter createAppenderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.LocalAppender <em>Local Appender</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.LocalAppender
   * @generated
   */
  public Adapter createLocalAppenderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.ExternalAppender <em>External Appender</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.ExternalAppender
   * @generated
   */
  public Adapter createExternalAppenderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.Layout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.Layout
   * @generated
   */
  public Adapter createLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.LocalLayout <em>Local Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.LocalLayout
   * @generated
   */
  public Adapter createLocalLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.ExternalLayout <em>External Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.ExternalLayout
   * @generated
   */
  public Adapter createExternalLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.MoniLogger <em>Moni Logger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.MoniLogger
   * @generated
   */
  public Adapter createMoniLoggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.ASTEvent <em>AST Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.ASTEvent
   * @generated
   */
  public Adapter createASTEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.ComplexEvent <em>Complex Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.ComplexEvent
   * @generated
   */
  public Adapter createComplexEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.UserEvent <em>User Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.UserEvent
   * @generated
   */
  public Adapter createUserEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.TemporalPattern <em>Temporal Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.TemporalPattern
   * @generated
   */
  public Adapter createTemporalPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.Pattern
   * @generated
   */
  public Adapter createPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.BoundType <em>Bound Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.BoundType
   * @generated
   */
  public Adapter createBoundTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.ExactBound <em>Exact Bound</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.ExactBound
   * @generated
   */
  public Adapter createExactBoundAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.LowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.LowerBound
   * @generated
   */
  public Adapter createLowerBoundAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.UpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.UpperBound
   * @generated
   */
  public Adapter createUpperBoundAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.Scope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.Scope
   * @generated
   */
  public Adapter createScopeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.AppenderCall <em>Appender Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.AppenderCall
   * @generated
   */
  public Adapter createAppenderCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.AppenderRef <em>Appender Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.AppenderRef
   * @generated
   */
  public Adapter createAppenderRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.AppenderCallArgument <em>Appender Call Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.AppenderCallArgument
   * @generated
   */
  public Adapter createAppenderCallArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.LayoutCall <em>Layout Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.LayoutCall
   * @generated
   */
  public Adapter createLayoutCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.LayoutRef <em>Layout Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.LayoutRef
   * @generated
   */
  public Adapter createLayoutRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.EmitEvent <em>Emit Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.EmitEvent
   * @generated
   */
  public Adapter createEmitEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.MoniLoggerCall <em>Moni Logger Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.MoniLoggerCall
   * @generated
   */
  public Adapter createMoniLoggerCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.StreamEvent <em>Stream Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.StreamEvent
   * @generated
   */
  public Adapter createStreamEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.EmptyOrPropertyValue <em>Empty Or Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.EmptyOrPropertyValue
   * @generated
   */
  public Adapter createEmptyOrPropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.ParameterReference <em>Parameter Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.ParameterReference
   * @generated
   */
  public Adapter createParameterReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.LanguageExpression <em>Language Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.LanguageExpression
   * @generated
   */
  public Adapter createLanguageExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.LanguageExpressionCondition <em>Language Expression Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.LanguageExpressionCondition
   * @generated
   */
  public Adapter createLanguageExpressionConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.Existence <em>Existence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.Existence
   * @generated
   */
  public Adapter createExistenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.Universality <em>Universality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.Universality
   * @generated
   */
  public Adapter createUniversalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.Absence <em>Absence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.Absence
   * @generated
   */
  public Adapter createAbsenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.Precedence <em>Precedence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.Precedence
   * @generated
   */
  public Adapter createPrecedenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.Response <em>Response</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.Response
   * @generated
   */
  public Adapter createResponseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.Globally <em>Globally</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.Globally
   * @generated
   */
  public Adapter createGloballyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.After <em>After</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.After
   * @generated
   */
  public Adapter createAfterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.Before <em>Before</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.Before
   * @generated
   */
  public Adapter createBeforeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.Between <em>Between</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.Between
   * @generated
   */
  public Adapter createBetweenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.AfterUntil <em>After Until</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.AfterUntil
   * @generated
   */
  public Adapter createAfterUntilAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.StartMoniLogger <em>Start Moni Logger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.StartMoniLogger
   * @generated
   */
  public Adapter createStartMoniLoggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.StopMoniLogger <em>Stop Moni Logger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.StopMoniLogger
   * @generated
   */
  public Adapter createStopMoniLoggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.Empty <em>Empty</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.Empty
   * @generated
   */
  public Adapter createEmptyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.PropertyValue <em>Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.PropertyValue
   * @generated
   */
  public Adapter createPropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.ExplicitLanguageExpression <em>Explicit Language Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.ExplicitLanguageExpression
   * @generated
   */
  public Adapter createExplicitLanguageExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog4DSL.DefaultLanguageExpression <em>Default Language Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog4DSL.DefaultLanguageExpression
   * @generated
   */
  public Adapter createDefaultLanguageExpressionAdapter()
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

} //MoniLog4DSLAdapterFactory
