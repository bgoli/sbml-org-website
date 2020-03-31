/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 * <span class="pkg-marker pkg-color-layout"><a href="group__layout.html">layout</a></span>

 Representation of a point.
 <p>
 * A point is specified via the required attributes 'x', 'y' and an optional
 * attribute 'z', all of which are of type double. If the attribute z is not
 * specified, the object is a two dimensional object.  The {@link Point} class also
 * has an optional attribute id of type SId. While not used in the
 * &ldquo;layout&rdquo; package, it can be used by programs to refer to the
 * elements.
 */

public class Point extends SBase {
   private long swigCPtr;

   protected Point(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.Point_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(Point obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (Point obj)
   {
     long ptr = 0;

     if (obj != null)
     {
       ptr             = obj.swigCPtr;
       obj.swigCMemOwn = false;
     }

     return ptr;
   }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libsbmlJNI.delete_Point(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new point with x,y and z set to 0.0.
   <p>
   * @param level the SBML Level.
   * @param version the Version within the SBML Level.
   * @param pkgVersion the version of the package.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 Point(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Point__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Creates a new point with x,y and z set to 0.0.
   <p>
   * @param level the SBML Level.
   * @param version the Version within the SBML Level.
   * @param pkgVersion the version of the package.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 Point(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Point__SWIG_1(level, version), true);
  }

  
/**
   * Creates a new point with x,y and z set to 0.0.
   <p>
   * @param level the SBML Level.
   * @param version the Version within the SBML Level.
   * @param pkgVersion the version of the package.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 Point(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Point__SWIG_2(level), true);
  }

  
/**
   * Creates a new point with x,y and z set to 0.0.
   <p>
   * @param level the SBML Level.
   * @param version the Version within the SBML Level.
   * @param pkgVersion the version of the package.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 Point() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Point__SWIG_3(), true);
  }

  
/**
   * Constructor.
   <p>
   * <p>
 * The package namespaces object used in this constructor is derived from a
 * {@link SBMLNamespaces} object, which encapsulates SBML Level/Version/namespaces
 * information.  It is used to communicate the SBML Level, Version, and 
 * package version and name information used in addition to SBML Level&nbsp;3 Core.  A
 * common approach to using libSBML's {@link SBMLNamespaces} facilities is to create an
 * package namespace object somewhere in a program once, then hand that object
 * as needed to object constructors of that package that accept it as and
 * argument, such as this one.
   <p>
   * @param layoutns the {@link LayoutPkgNamespaces} object.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 Point(LayoutPkgNamespaces layoutns) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Point__SWIG_4(LayoutPkgNamespaces.getCPtr(layoutns), layoutns), true);
  }

  
/**
   * Copy constructor.
   <p>
   * @param orig the instance to copy.
   */ public
 Point(Point orig) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Point__SWIG_5(Point.getCPtr(orig), orig), true);
  }

  
/**
   * Creates a new point with the given coordinates.
   */ public
 Point(LayoutPkgNamespaces layoutns, double x, double y, double z) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Point__SWIG_6(LayoutPkgNamespaces.getCPtr(layoutns), layoutns, x, y, z), true);
  }

  
/**
   * Creates a new point with the given coordinates.
   */ public
 Point(LayoutPkgNamespaces layoutns, double x, double y) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Point__SWIG_7(LayoutPkgNamespaces.getCPtr(layoutns), layoutns, x, y), true);
  }

  
/**
   * Creates a new {@link Point} from the given {@link XMLNode}
   */ public
 Point(XMLNode node, long l2version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Point__SWIG_8(XMLNode.getCPtr(node), node, l2version), true);
  }

  
/**
   * Creates a new {@link Point} from the given {@link XMLNode}
   */ public
 Point(XMLNode node) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Point__SWIG_9(XMLNode.getCPtr(node), node), true);
  }

  
/**
   * Returns the x offset.
   */ public
 double x() {
    return libsbmlJNI.Point_x(swigCPtr, this);
  }

  
/**
   * Returns the y offset.
   */ public
 double y() {
    return libsbmlJNI.Point_y(swigCPtr, this);
  }

  
/**
   * Returns the z offset.
   */ public
 double z() {
    return libsbmlJNI.Point_z(swigCPtr, this);
  }

  
/**
   * Returns the x offset.
   */ public
 double getXOffset() {
    return libsbmlJNI.Point_getXOffset(swigCPtr, this);
  }

  
/**
   * Returns the y offset.
   */ public
 double getYOffset() {
    return libsbmlJNI.Point_getYOffset(swigCPtr, this);
  }

  
/**
   * Returns the z offset.
   */ public
 double getZOffset() {
    return libsbmlJNI.Point_getZOffset(swigCPtr, this);
  }

  
/**
   * Sets the x offset.
   */ public
 void setX(double x) {
    libsbmlJNI.Point_setX(swigCPtr, this, x);
  }

  
/**
   * Sets the y offset.
   */ public
 void setY(double y) {
    libsbmlJNI.Point_setY(swigCPtr, this, y);
  }

  
/**
   * Sets the z offset.
   */ public
 void setZ(double z) {
    libsbmlJNI.Point_setZ(swigCPtr, this, z);
  }

  
/**
   * Sets the x offset.
   */ public
 void setXOffset(double x) {
    libsbmlJNI.Point_setXOffset(swigCPtr, this, x);
  }

  
/**
   * Sets the y offset.
   */ public
 void setYOffset(double y) {
    libsbmlJNI.Point_setYOffset(swigCPtr, this, y);
  }

  
/**
   * Sets the z offset.
   */ public
 void setZOffset(double z) {
    libsbmlJNI.Point_setZOffset(swigCPtr, this, z);
  }

  
/**
   * Sets the coordinates to the given values.
   */ public
 void setOffsets(double x, double y, double z) {
    libsbmlJNI.Point_setOffsets__SWIG_0(swigCPtr, this, x, y, z);
  }

  
/**
   * Sets the coordinates to the given values.
   */ public
 void setOffsets(double x, double y) {
    libsbmlJNI.Point_setOffsets__SWIG_1(swigCPtr, this, x, y);
  }

  
/** */ public
 boolean getZOffsetExplicitlySet() {
    return libsbmlJNI.Point_getZOffsetExplicitlySet(swigCPtr, this);
  }

  
/**
   * Sets the Z offset to 0.0.
   */ public
 void initDefaults() {
    libsbmlJNI.Point_initDefaults(swigCPtr, this);
  }

  
/**
   * Returns the value of the 'id' attribute of this {@link Point}.
   <p>
   * <p>
 * The identifier given by an object's 'id' attribute value
 * is used to identify the object within the SBML model definition.
 * Other objects can refer to the component using this identifier.  The
 * data type of 'id' is always <code>SId</code> or a type derived
 * from that, such as <code>UnitSId</code>, depending on the object in 
 * question.  All data types are defined as follows:
 * <pre style='margin-left: 2em; border: none; font-weight: bold; color: black'>
 *   letter .= 'a'..'z','A'..'Z'
 *   digit  .= '0'..'9'
 *   idChar .= letter | digit | '_'
 *   SId    .= ( letter | '_' ) idChar*
 * </pre>
 * The characters <code>(</code> and <code>)</code> are used for grouping,
 * the character <code>*</code> 'zero or more times', and the character
 * <code>|</code> indicates logical 'or'.  The equality of SBML identifiers
 * is determined by an exact character sequence match; i.e., comparisons must
 * be performed in a case-sensitive manner.  This applies to all uses of
 * <code>SId</code>, <code>SIdRef</code>, and derived types.
 <p>
 * Users need to be aware of some important API issues that are the result of
 * the history of SBML and libSBML.  Prior to SBML Level&nbsp;3
 * Version&nbsp;2, SBML defined 'id' and 'name' attributes on only a subset
 * of SBML objects.  To simplify the work of programmers, libSBML's API
 * provided get, set, check, and unset on the {@link SBase} object class itself
 * instead of on individual subobject classes. This made the
 * get/set/etc. methods uniformly available on all objects in the libSBML
 * API.  LibSBML simply returned empty strings or otherwise did not act when
 * the methods were applied to SBML objects that were not defined by the SBML
 * specification to have 'id' or 'name' attributes.  Additional complications
 * arose with the rule and assignment objects: {@link InitialAssignment},
 * {@link EventAssignment}, {@link AssignmentRule}, and {@link RateRule}.  In early versions of SBML,
 * the rule object hierarchy was different, and in addition, then as now,
 * they possess different attributes: 'variable' (for the rules and event
 * assignments), 'symbol' (for initial assignments), or neither (for
 * algebraic rules).  Prior to SBML Level&nbsp;3 Version&nbsp;2, getId()
 * would always return an empty string, and isSetId() would always return 
 * <code>false</code> for objects of these classes.
 <p>
 * With the addition of 'id' and 'name' attributes on {@link SBase} in Level&nbsp;3
 * Version&nbsp;2, it became necessary to introduce a new way to interact
 * with the attributes more consistently in libSBML to avoid breaking
 * backward compatibility in the behavior of the original 'id' methods.  For
 * this reason, libSBML provides four functions (getIdAttribute(),
 * setIdAttribute(String), isSetIdAttribute(), and
 * unsetIdAttribute()) that always act on the actual 'id' attribute inherited
 * from {@link SBase}, regardless of the object's type.  <strong>These new methods
 * should be used instead of the older getId()/setId()/etc. methods</strong>
 * unless the old behavior is somehow necessary.  Regardless of the Level and
 * Version of the SBML, these functions allow client applications to use more
 * generalized code in some situations (for instance, when manipulating
 * objects that are all known to have identifiers).  If the object in
 * question does not posess an 'id' attribute according to the SBML
 * specification for the Level and Version in use, libSBML will not allow the
 * identifier to be set, nor will it read or write 'id' attributes for those
 * objects.
   <p>
   * @return the id of this {@link Point}.
   <p>
   * @note Because of the inconsistent behavior of this function with 
   * respect to assignments and rules, it is now recommended to
   * use the getIdAttribute() function instead.
   <p>
   * @see #getIdAttribute()
   * @see #setIdAttribute(String sid)
   * @see #isSetIdAttribute()
   * @see #unsetIdAttribute()
   */ public
 String getId() {
    return libsbmlJNI.Point_getId(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> or <code>false</code> depending on whether this
   * {@link Point}'s 'id' attribute has been set.
   <p>
   * <p>
 * <p>
 * The identifier given by an object's 'id' attribute value
 * is used to identify the object within the SBML model definition.
 * Other objects can refer to the component using this identifier.  The
 * data type of 'id' is always <code>SId</code> or a type derived
 * from that, such as <code>UnitSId</code>, depending on the object in 
 * question.  All data types are defined as follows:
 * <pre style='margin-left: 2em; border: none; font-weight: bold; color: black'>
 *   letter .= 'a'..'z','A'..'Z'
 *   digit  .= '0'..'9'
 *   idChar .= letter | digit | '_'
 *   SId    .= ( letter | '_' ) idChar*
 * </pre>
 * The characters <code>(</code> and <code>)</code> are used for grouping,
 * the character <code>*</code> 'zero or more times', and the character
 * <code>|</code> indicates logical 'or'.  The equality of SBML identifiers
 * is determined by an exact character sequence match; i.e., comparisons must
 * be performed in a case-sensitive manner.  This applies to all uses of
 * <code>SId</code>, <code>SIdRef</code>, and derived types.
 <p>
 * Users need to be aware of some important API issues that are the result of
 * the history of SBML and libSBML.  Prior to SBML Level&nbsp;3
 * Version&nbsp;2, SBML defined 'id' and 'name' attributes on only a subset
 * of SBML objects.  To simplify the work of programmers, libSBML's API
 * provided get, set, check, and unset on the {@link SBase} object class itself
 * instead of on individual subobject classes. This made the
 * get/set/etc. methods uniformly available on all objects in the libSBML
 * API.  LibSBML simply returned empty strings or otherwise did not act when
 * the methods were applied to SBML objects that were not defined by the SBML
 * specification to have 'id' or 'name' attributes.  Additional complications
 * arose with the rule and assignment objects: {@link InitialAssignment},
 * {@link EventAssignment}, {@link AssignmentRule}, and {@link RateRule}.  In early versions of SBML,
 * the rule object hierarchy was different, and in addition, then as now,
 * they possess different attributes: 'variable' (for the rules and event
 * assignments), 'symbol' (for initial assignments), or neither (for
 * algebraic rules).  Prior to SBML Level&nbsp;3 Version&nbsp;2, getId()
 * would always return an empty string, and isSetId() would always return 
 * <code>false</code> for objects of these classes.
 <p>
 * With the addition of 'id' and 'name' attributes on {@link SBase} in Level&nbsp;3
 * Version&nbsp;2, it became necessary to introduce a new way to interact
 * with the attributes more consistently in libSBML to avoid breaking
 * backward compatibility in the behavior of the original 'id' methods.  For
 * this reason, libSBML provides four functions (getIdAttribute(),
 * setIdAttribute(String), isSetIdAttribute(), and
 * unsetIdAttribute()) that always act on the actual 'id' attribute inherited
 * from {@link SBase}, regardless of the object's type.  <strong>These new methods
 * should be used instead of the older getId()/setId()/etc. methods</strong>
 * unless the old behavior is somehow necessary.  Regardless of the Level and
 * Version of the SBML, these functions allow client applications to use more
 * generalized code in some situations (for instance, when manipulating
 * objects that are all known to have identifiers).  If the object in
 * question does not posess an 'id' attribute according to the SBML
 * specification for the Level and Version in use, libSBML will not allow the
 * identifier to be set, nor will it read or write 'id' attributes for those
 * objects.
 <p>
 * @return <code>true</code> if the 'id' attribute of this SBML object is
 * set, <code>false</code> otherwise.
 <p>
 * @note Because of the inconsistent behavior of this function with
 * respect to assignments and rules, it is recommended that callers
 * use isSetIdAttribute() instead.
 <p>
 * @see #getIdAttribute()
 * @see #setIdAttribute(String sid)
 * @see #unsetIdAttribute()
 * @see #isSetIdAttribute()
   */ public
 boolean isSetId() {
    return libsbmlJNI.Point_isSetId(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'id' attribute of this {@link Point}.
   <p>
   * <p>
 * The string <code>sid</code> is copied.
 <p>
 * <p>
 * The identifier given by an object's 'id' attribute value
 * is used to identify the object within the SBML model definition.
 * Other objects can refer to the component using this identifier.  The
 * data type of 'id' is always <code>SId</code> or a type derived
 * from that, such as <code>UnitSId</code>, depending on the object in 
 * question.  All data types are defined as follows:
 * <pre style='margin-left: 2em; border: none; font-weight: bold; color: black'>
 *   letter .= 'a'..'z','A'..'Z'
 *   digit  .= '0'..'9'
 *   idChar .= letter | digit | '_'
 *   SId    .= ( letter | '_' ) idChar*
 * </pre>
 * The characters <code>(</code> and <code>)</code> are used for grouping,
 * the character <code>*</code> 'zero or more times', and the character
 * <code>|</code> indicates logical 'or'.  The equality of SBML identifiers
 * is determined by an exact character sequence match; i.e., comparisons must
 * be performed in a case-sensitive manner.  This applies to all uses of
 * <code>SId</code>, <code>SIdRef</code>, and derived types.
 <p>
 * Users need to be aware of some important API issues that are the result of
 * the history of SBML and libSBML.  Prior to SBML Level&nbsp;3
 * Version&nbsp;2, SBML defined 'id' and 'name' attributes on only a subset
 * of SBML objects.  To simplify the work of programmers, libSBML's API
 * provided get, set, check, and unset on the {@link SBase} object class itself
 * instead of on individual subobject classes. This made the
 * get/set/etc. methods uniformly available on all objects in the libSBML
 * API.  LibSBML simply returned empty strings or otherwise did not act when
 * the methods were applied to SBML objects that were not defined by the SBML
 * specification to have 'id' or 'name' attributes.  Additional complications
 * arose with the rule and assignment objects: {@link InitialAssignment},
 * {@link EventAssignment}, {@link AssignmentRule}, and {@link RateRule}.  In early versions of SBML,
 * the rule object hierarchy was different, and in addition, then as now,
 * they possess different attributes: 'variable' (for the rules and event
 * assignments), 'symbol' (for initial assignments), or neither (for
 * algebraic rules).  Prior to SBML Level&nbsp;3 Version&nbsp;2, getId()
 * would always return an empty string, and isSetId() would always return 
 * <code>false</code> for objects of these classes.
 <p>
 * With the addition of 'id' and 'name' attributes on {@link SBase} in Level&nbsp;3
 * Version&nbsp;2, it became necessary to introduce a new way to interact
 * with the attributes more consistently in libSBML to avoid breaking
 * backward compatibility in the behavior of the original 'id' methods.  For
 * this reason, libSBML provides four functions (getIdAttribute(),
 * setIdAttribute(String), isSetIdAttribute(), and
 * unsetIdAttribute()) that always act on the actual 'id' attribute inherited
 * from {@link SBase}, regardless of the object's type.  <strong>These new methods
 * should be used instead of the older getId()/setId()/etc. methods</strong>
 * unless the old behavior is somehow necessary.  Regardless of the Level and
 * Version of the SBML, these functions allow client applications to use more
 * generalized code in some situations (for instance, when manipulating
 * objects that are all known to have identifiers).  If the object in
 * question does not posess an 'id' attribute according to the SBML
 * specification for the Level and Version in use, libSBML will not allow the
 * identifier to be set, nor will it read or write 'id' attributes for those
 * objects.
 <p>
 * @param sid the string to use as the identifier of this object.
 <p>
 * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
 * <ul>
 * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
 * <li> {@link libsbmlConstants#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE}
 * <li> {@link libsbmlConstants#LIBSBML_UNEXPECTED_ATTRIBUTE LIBSBML_UNEXPECTED_ATTRIBUTE}
 *
 * </ul> <p>
 * @see #getIdAttribute()
 * @see #setIdAttribute(String sid)
 * @see #isSetIdAttribute()
 * @see #unsetIdAttribute()
   */ public
 int setId(String sid) {
    return libsbmlJNI.Point_setId(swigCPtr, this, sid);
  }

  
/**
   * Unsets the value of the 'id' attribute of this {@link Point}.
   <p>
   * <p>
 * <p>
 * The identifier given by an object's 'id' attribute value
 * is used to identify the object within the SBML model definition.
 * Other objects can refer to the component using this identifier.  The
 * data type of 'id' is always <code>SId</code> or a type derived
 * from that, such as <code>UnitSId</code>, depending on the object in 
 * question.  All data types are defined as follows:
 * <pre style='margin-left: 2em; border: none; font-weight: bold; color: black'>
 *   letter .= 'a'..'z','A'..'Z'
 *   digit  .= '0'..'9'
 *   idChar .= letter | digit | '_'
 *   SId    .= ( letter | '_' ) idChar*
 * </pre>
 * The characters <code>(</code> and <code>)</code> are used for grouping,
 * the character <code>*</code> 'zero or more times', and the character
 * <code>|</code> indicates logical 'or'.  The equality of SBML identifiers
 * is determined by an exact character sequence match; i.e., comparisons must
 * be performed in a case-sensitive manner.  This applies to all uses of
 * <code>SId</code>, <code>SIdRef</code>, and derived types.
 <p>
 * Users need to be aware of some important API issues that are the result of
 * the history of SBML and libSBML.  Prior to SBML Level&nbsp;3
 * Version&nbsp;2, SBML defined 'id' and 'name' attributes on only a subset
 * of SBML objects.  To simplify the work of programmers, libSBML's API
 * provided get, set, check, and unset on the {@link SBase} object class itself
 * instead of on individual subobject classes. This made the
 * get/set/etc. methods uniformly available on all objects in the libSBML
 * API.  LibSBML simply returned empty strings or otherwise did not act when
 * the methods were applied to SBML objects that were not defined by the SBML
 * specification to have 'id' or 'name' attributes.  Additional complications
 * arose with the rule and assignment objects: {@link InitialAssignment},
 * {@link EventAssignment}, {@link AssignmentRule}, and {@link RateRule}.  In early versions of SBML,
 * the rule object hierarchy was different, and in addition, then as now,
 * they possess different attributes: 'variable' (for the rules and event
 * assignments), 'symbol' (for initial assignments), or neither (for
 * algebraic rules).  Prior to SBML Level&nbsp;3 Version&nbsp;2, getId()
 * would always return an empty string, and isSetId() would always return 
 * <code>false</code> for objects of these classes.
 <p>
 * With the addition of 'id' and 'name' attributes on {@link SBase} in Level&nbsp;3
 * Version&nbsp;2, it became necessary to introduce a new way to interact
 * with the attributes more consistently in libSBML to avoid breaking
 * backward compatibility in the behavior of the original 'id' methods.  For
 * this reason, libSBML provides four functions (getIdAttribute(),
 * setIdAttribute(String), isSetIdAttribute(), and
 * unsetIdAttribute()) that always act on the actual 'id' attribute inherited
 * from {@link SBase}, regardless of the object's type.  <strong>These new methods
 * should be used instead of the older getId()/setId()/etc. methods</strong>
 * unless the old behavior is somehow necessary.  Regardless of the Level and
 * Version of the SBML, these functions allow client applications to use more
 * generalized code in some situations (for instance, when manipulating
 * objects that are all known to have identifiers).  If the object in
 * question does not posess an 'id' attribute according to the SBML
 * specification for the Level and Version in use, libSBML will not allow the
 * identifier to be set, nor will it read or write 'id' attributes for those
 * objects.
 <p>
 * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
 * <ul>
 * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
 * <li> {@link libsbmlConstants#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED}
 *
 * </ul> <p>
 * @see #getIdAttribute()
 * @see #setIdAttribute(String sid)
 * @see #isSetIdAttribute()
 * @see #unsetIdAttribute()
   */ public
 int unsetId() {
    return libsbmlJNI.Point_unsetId(swigCPtr, this);
  }

  
/**
   * Sets the element name to be returned by getElementName().
   */ public
 void setElementName(String name) {
    libsbmlJNI.Point_setElementName(swigCPtr, this, name);
  }

  
/**
   * Returns the XML element name of
   * this SBML object.
   <p>
   * @return the string of the name of this element.
   */ public
 String getElementName() {
    return libsbmlJNI.Point_getElementName(swigCPtr, this);
  }

  
/**
   * Creates and returns a deep copy of this {@link Point}.
   <p>
   * @return a (deep) copy of this {@link Point}.
   */ public
 Point cloneObject() {
    long cPtr = libsbmlJNI.Point_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new Point(cPtr, true);
  }

  
/**
   * Returns the libSBML type code of this object instance.
   <p>
   * <p>
 * LibSBML attaches an identifying code to every kind of SBML object.  These
 * are integer constants known as <em>SBML type codes</em>.  The names of all
 * the codes begin with the characters <code>SBML_</code>.
 * In the Java language interface for libSBML, the
 * type codes are defined as static integer constants in the interface class
 * {@link libsbmlConstants}.    Note that different Level&nbsp;3
 * package plug-ins may use overlapping type codes; to identify the package
 * to which a given object belongs, call the 
 * <code>{@link SBase#getPackageName()}
 * </code>
 * method on the object.
 <p>
 * The exception to this is lists:  all SBML-style list elements have the type 
 * {@link libsbmlConstants#SBML_LIST_OF SBML_LIST_OF}, regardless of what package they 
 * are from.
   <p>
   * @return the SBML type code for this object:
   * {@link libsbmlConstants#SBML_LAYOUT_POINT SBML_LAYOUT_POINT}.
   <p>
   * <p>
 * @warning <span class='warning'>The specific integer values of the possible
 * type codes may be reused by different libSBML plug-ins for SBML Level&nbsp;3.
 * packages,  To fully identify the correct code, <strong>it is necessary to
 * invoke both getPackageName() and getTypeCode()</strong> (or 
 * {@link ListOf#getItemTypeCode()}).</span>
   <p>
   * @see #getElementName()
   * @see #getPackageName()
   */ public
 int getTypeCode() {
    return libsbmlJNI.Point_getTypeCode(swigCPtr, this);
  }

  
/**
    * Creates an {@link XMLNode} object from this.
    */ public
 XMLNode toXML(String name) {
    return new XMLNode(libsbmlJNI.Point_toXML(swigCPtr, this, name), true);
  }

}