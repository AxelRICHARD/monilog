/**
 * generated by Xtext 2.21.0
 */
package org.gemoc.monilog.moniLog.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gemoc.monilog.moniLog.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.monilog.moniLog.MoniLogPackage
 * @generated
 */
public class MoniLogAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MoniLogPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoniLogAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MoniLogPackage.eINSTANCE;
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
  protected MoniLogSwitch<Adapter> modelSwitch =
    new MoniLogSwitch<Adapter>()
    {
      @Override
      public Adapter caseDocument(Document object)
      {
        return createDocumentAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
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
      public Adapter caseParameterDecl(ParameterDecl object)
      {
        return createParameterDeclAdapter();
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
      public Adapter caseASTEventKind(ASTEventKind object)
      {
        return createASTEventKindAdapter();
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
      public Adapter caseCallArgument(CallArgument object)
      {
        return createCallArgumentAdapter();
      }
      @Override
      public Adapter caseLayoutCall(LayoutCall object)
      {
        return createLayoutCallAdapter();
      }
      @Override
      public Adapter caseEmitEvent(EmitEvent object)
      {
        return createEmitEventAdapter();
      }
      @Override
      public Adapter caseSetVariable(SetVariable object)
      {
        return createSetVariableAdapter();
      }
      @Override
      public Adapter caseMoniloggerCall(MoniloggerCall object)
      {
        return createMoniloggerCallAdapter();
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
      public Adapter casePropertyValue(PropertyValue object)
      {
        return createPropertyValueAdapter();
      }
      @Override
      public Adapter caseLanguageExpression(LanguageExpression object)
      {
        return createLanguageExpressionAdapter();
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
      public Adapter caseBeforeASTEvent(BeforeASTEvent object)
      {
        return createBeforeASTEventAdapter();
      }
      @Override
      public Adapter caseAfterASTEvent(AfterASTEvent object)
      {
        return createAfterASTEventAdapter();
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
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.Document <em>Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.Document
   * @generated
   */
  public Adapter createDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.Appender <em>Appender</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.Appender
   * @generated
   */
  public Adapter createAppenderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.LocalAppender <em>Local Appender</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.LocalAppender
   * @generated
   */
  public Adapter createLocalAppenderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.ExternalAppender <em>External Appender</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.ExternalAppender
   * @generated
   */
  public Adapter createExternalAppenderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.Layout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.Layout
   * @generated
   */
  public Adapter createLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.LocalLayout <em>Local Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.LocalLayout
   * @generated
   */
  public Adapter createLocalLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.ExternalLayout <em>External Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.ExternalLayout
   * @generated
   */
  public Adapter createExternalLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.ParameterDecl <em>Parameter Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.ParameterDecl
   * @generated
   */
  public Adapter createParameterDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.MoniLogger <em>Moni Logger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.MoniLogger
   * @generated
   */
  public Adapter createMoniLoggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.ASTEventKind <em>AST Event Kind</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.ASTEventKind
   * @generated
   */
  public Adapter createASTEventKindAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.TemporalPattern <em>Temporal Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.TemporalPattern
   * @generated
   */
  public Adapter createTemporalPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.Pattern
   * @generated
   */
  public Adapter createPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.BoundType <em>Bound Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.BoundType
   * @generated
   */
  public Adapter createBoundTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.ExactBound <em>Exact Bound</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.ExactBound
   * @generated
   */
  public Adapter createExactBoundAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.LowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.LowerBound
   * @generated
   */
  public Adapter createLowerBoundAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.UpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.UpperBound
   * @generated
   */
  public Adapter createUpperBoundAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.Scope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.Scope
   * @generated
   */
  public Adapter createScopeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.AppenderCall <em>Appender Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.AppenderCall
   * @generated
   */
  public Adapter createAppenderCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.CallArgument <em>Call Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.CallArgument
   * @generated
   */
  public Adapter createCallArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.LayoutCall <em>Layout Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.LayoutCall
   * @generated
   */
  public Adapter createLayoutCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.EmitEvent <em>Emit Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.EmitEvent
   * @generated
   */
  public Adapter createEmitEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.SetVariable <em>Set Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.SetVariable
   * @generated
   */
  public Adapter createSetVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.MoniloggerCall <em>Monilogger Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.MoniloggerCall
   * @generated
   */
  public Adapter createMoniloggerCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.StreamEvent <em>Stream Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.StreamEvent
   * @generated
   */
  public Adapter createStreamEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.EmptyOrPropertyValue <em>Empty Or Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.EmptyOrPropertyValue
   * @generated
   */
  public Adapter createEmptyOrPropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.ParameterReference <em>Parameter Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.ParameterReference
   * @generated
   */
  public Adapter createParameterReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.PropertyValue <em>Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.PropertyValue
   * @generated
   */
  public Adapter createPropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.LanguageExpression <em>Language Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.LanguageExpression
   * @generated
   */
  public Adapter createLanguageExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.ASTEvent <em>AST Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.ASTEvent
   * @generated
   */
  public Adapter createASTEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.ComplexEvent <em>Complex Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.ComplexEvent
   * @generated
   */
  public Adapter createComplexEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.UserEvent <em>User Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.UserEvent
   * @generated
   */
  public Adapter createUserEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.BeforeASTEvent <em>Before AST Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.BeforeASTEvent
   * @generated
   */
  public Adapter createBeforeASTEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.AfterASTEvent <em>After AST Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.AfterASTEvent
   * @generated
   */
  public Adapter createAfterASTEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.Existence <em>Existence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.Existence
   * @generated
   */
  public Adapter createExistenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.Universality <em>Universality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.Universality
   * @generated
   */
  public Adapter createUniversalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.Absence <em>Absence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.Absence
   * @generated
   */
  public Adapter createAbsenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.Precedence <em>Precedence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.Precedence
   * @generated
   */
  public Adapter createPrecedenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.Response <em>Response</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.Response
   * @generated
   */
  public Adapter createResponseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.Globally <em>Globally</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.Globally
   * @generated
   */
  public Adapter createGloballyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.After <em>After</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.After
   * @generated
   */
  public Adapter createAfterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.Before <em>Before</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.Before
   * @generated
   */
  public Adapter createBeforeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.Between <em>Between</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.Between
   * @generated
   */
  public Adapter createBetweenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.AfterUntil <em>After Until</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.AfterUntil
   * @generated
   */
  public Adapter createAfterUntilAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.StartMoniLogger <em>Start Moni Logger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.StartMoniLogger
   * @generated
   */
  public Adapter createStartMoniLoggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.StopMoniLogger <em>Stop Moni Logger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.StopMoniLogger
   * @generated
   */
  public Adapter createStopMoniLoggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.gemoc.monilog.moniLog.Empty <em>Empty</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.gemoc.monilog.moniLog.Empty
   * @generated
   */
  public Adapter createEmptyAdapter()
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

} //MoniLogAdapterFactory