/**
 * generated by Xtext 2.24.0
 */
package org.gemoc.monilog.moniLog4DSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Log Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getLogLevel()
 * @model
 * @generated
 */
public enum LogLevel implements Enumerator
{
  /**
   * The '<em><b>Info</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INFO_VALUE
   * @generated
   * @ordered
   */
  INFO(0, "info", "INFO"),

  /**
   * The '<em><b>Config</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONFIG_VALUE
   * @generated
   * @ordered
   */
  CONFIG(1, "config", "CONFIG"),

  /**
   * The '<em><b>Fine</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FINE_VALUE
   * @generated
   * @ordered
   */
  FINE(2, "fine", "FINE"),

  /**
   * The '<em><b>Finer</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FINER_VALUE
   * @generated
   * @ordered
   */
  FINER(3, "finer", "FINER"),

  /**
   * The '<em><b>Finest</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FINEST_VALUE
   * @generated
   * @ordered
   */
  FINEST(4, "finest", "FINEST"),

  /**
   * The '<em><b>Severe</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SEVERE_VALUE
   * @generated
   * @ordered
   */
  SEVERE(5, "severe", "SEVERE"),

  /**
   * The '<em><b>Warning</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WARNING_VALUE
   * @generated
   * @ordered
   */
  WARNING(6, "warning", "WARNING");

  /**
   * The '<em><b>Info</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INFO
   * @model name="info" literal="INFO"
   * @generated
   * @ordered
   */
  public static final int INFO_VALUE = 0;

  /**
   * The '<em><b>Config</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONFIG
   * @model name="config" literal="CONFIG"
   * @generated
   * @ordered
   */
  public static final int CONFIG_VALUE = 1;

  /**
   * The '<em><b>Fine</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FINE
   * @model name="fine" literal="FINE"
   * @generated
   * @ordered
   */
  public static final int FINE_VALUE = 2;

  /**
   * The '<em><b>Finer</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FINER
   * @model name="finer" literal="FINER"
   * @generated
   * @ordered
   */
  public static final int FINER_VALUE = 3;

  /**
   * The '<em><b>Finest</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FINEST
   * @model name="finest" literal="FINEST"
   * @generated
   * @ordered
   */
  public static final int FINEST_VALUE = 4;

  /**
   * The '<em><b>Severe</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SEVERE
   * @model name="severe" literal="SEVERE"
   * @generated
   * @ordered
   */
  public static final int SEVERE_VALUE = 5;

  /**
   * The '<em><b>Warning</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WARNING
   * @model name="warning" literal="WARNING"
   * @generated
   * @ordered
   */
  public static final int WARNING_VALUE = 6;

  /**
   * An array of all the '<em><b>Log Level</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final LogLevel[] VALUES_ARRAY =
    new LogLevel[]
    {
      INFO,
      CONFIG,
      FINE,
      FINER,
      FINEST,
      SEVERE,
      WARNING,
    };

  /**
   * A public read-only list of all the '<em><b>Log Level</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<LogLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Log Level</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static LogLevel get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LogLevel result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Log Level</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static LogLevel getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LogLevel result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Log Level</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static LogLevel get(int value)
  {
    switch (value)
    {
      case INFO_VALUE: return INFO;
      case CONFIG_VALUE: return CONFIG;
      case FINE_VALUE: return FINE;
      case FINER_VALUE: return FINER;
      case FINEST_VALUE: return FINEST;
      case SEVERE_VALUE: return SEVERE;
      case WARNING_VALUE: return WARNING;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private LogLevel(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //LogLevel
