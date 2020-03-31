/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 * <span class="pkg-marker pkg-color-render"><a href="group__render.html">render</a></span>

 A color at a certain location in a color gradient.
 <p>
 * The gradient stop concept was more or less taken from the corresponding
 * concept in SVG.  A {@link GradientStop} object represents the color at a certain
 * location in a linear or radial gradient.  Each gradient should contain two
 * or more gradient stops which mark the edges of a region within this region
 * color are interpolated based on the distance of the location to the edges
 * of the region.
 <p>
 * A gradient stop has two attributes. The first attribute is an offset which
 * determines the location for the gradient stop within the object the
 * gradient is applied to.  The offset can either be an absolute value or a
 * relative value or a combination of absolute and relative value.  For
 * example, a value of '50%' for the offset means that the gradient stop is
 * located at 50% of the gradient vector. For more information and examples,
 * see the render extension specification or the SVG specification.
 <p>
 * The second attribute defines the color for the gradient stop. The color
 * can either be defined be a color value string or by the id of a
 * {@link ColorDefinition} object.
 <p>
 * @see ColorDefinition
 */

public class GradientStop extends SBase {
   private long swigCPtr;

   protected GradientStop(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.GradientStop_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(GradientStop obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (GradientStop obj)
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
        libsbmlJNI.delete_GradientStop(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link GradientStop} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link GradientStop}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link GradientStop}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link GradientStop}.
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
 GradientStop(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_GradientStop__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Creates a new {@link GradientStop} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link GradientStop}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link GradientStop}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link GradientStop}.
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
 GradientStop(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_GradientStop__SWIG_1(level, version), true);
  }

  
/**
   * Creates a new {@link GradientStop} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link GradientStop}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link GradientStop}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link GradientStop}.
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
 GradientStop(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_GradientStop__SWIG_2(level), true);
  }

  
/**
   * Creates a new {@link GradientStop} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link GradientStop}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link GradientStop}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link GradientStop}.
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
 GradientStop() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_GradientStop__SWIG_3(), true);
  }

  
/**
   * Creates a new {@link GradientStop} using the given {@link RenderPkgNamespaces} object.
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
   * @param renderns the {@link RenderPkgNamespaces} object.
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
 GradientStop(RenderPkgNamespaces renderns) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_GradientStop__SWIG_4(RenderPkgNamespaces.getCPtr(renderns), renderns), true);
  }

  
/**
   * Creates a new {@link GradientStop} object from the given {@link XMLNode} object.
   * The {@link XMLNode} object has to contain a valid XML representation of a 
   * {@link GradientStop} object as defined in the render extension specification.
   * This method is normally called when render information is read from a file and 
   * should normally not have to be called explicitly.
   <p>
   * @param node the {@link XMLNode} object reference that describes the {@link GradientStop}
   * object to be instantiated.
   <p>
   * @param l2version an integer indicating the version of SBML Level&nbsp;2
   */ public
 GradientStop(XMLNode node, long l2version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_GradientStop__SWIG_5(XMLNode.getCPtr(node), node, l2version), true);
  }

  
/**
   * Creates a new {@link GradientStop} object from the given {@link XMLNode} object.
   * The {@link XMLNode} object has to contain a valid XML representation of a 
   * {@link GradientStop} object as defined in the render extension specification.
   * This method is normally called when render information is read from a file and 
   * should normally not have to be called explicitly.
   <p>
   * @param node the {@link XMLNode} object reference that describes the {@link GradientStop}
   * object to be instantiated.
   <p>
   * @param l2version an integer indicating the version of SBML Level&nbsp;2
   */ public
 GradientStop(XMLNode node) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_GradientStop__SWIG_6(XMLNode.getCPtr(node), node), true);
  }

  
/**
   * Copy constructor for {@link GradientStop}.
   <p>
   * @param orig the {@link GradientStop} instance to copy.
   */ public
 GradientStop(GradientStop orig) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_GradientStop__SWIG_7(GradientStop.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link GradientStop} object.
   <p>
   * @return a (deep) copy of this {@link GradientStop} object.
   */ public
 SBase cloneObject() {
    long cPtr = libsbmlJNI.GradientStop_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new GradientStop(cPtr, true);
  }

  
/**
   * Returns the value of the 'stop-color' attribute of this {@link GradientStop}.
   <p>
   * @return the value of the 'stop-color' attribute of this {@link GradientStop} as a
   * string.
   */ public
 String getStopColor() {
    return libsbmlJNI.GradientStop_getStopColor(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link GradientStop}'s 'stop-color' attribute
   * is set.
   <p>
   * @return <code>true</code> if this {@link GradientStop}'s 'stop-color' attribute has been
   * set, otherwise <code>false</code> is returned.
   */ public
 boolean isSetStopColor() {
    return libsbmlJNI.GradientStop_isSetStopColor(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'stop-color' attribute of this {@link GradientStop}.
   <p>
   * @param stopColor String& value of the 'stop-color' attribute to be
   * set.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   *
   * </ul> <p>
   * Calling this function with <code>stopColor</code> = <code>null</code> or an empty string is
   * equivalent to calling unsetStopColor().
   */ public
 int setStopColor(String stopColor) {
    return libsbmlJNI.GradientStop_setStopColor(swigCPtr, this, stopColor);
  }

  
/**
   * Unsets the value of the 'stop-color' attribute of this {@link GradientStop}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED}
   * </ul>
   */ public
 int unsetStopColor() {
    return libsbmlJNI.GradientStop_unsetStopColor(swigCPtr, this);
  }

  
/**
   * Returns the value of the 'offset' element of this {@link GradientStop}.
   <p>
   * @return the value of the 'offset' element of this {@link GradientStop} as a
   * {@link RelAbsVector}.
   */ public
 RelAbsVector getOffset() {
    return new RelAbsVector(libsbmlJNI.GradientStop_getOffset__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link GradientStop}'s 'offset' element is
   * set.
   <p>
   * @return <code>true</code> if this {@link GradientStop}'s 'offset' element has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetOffset() {
    return libsbmlJNI.GradientStop_isSetOffset(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'offset' element of this {@link GradientStop}.
   <p>
   * @param offset {@link RelAbsVector} value of the 'offset' element to be set.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE}
   * </ul>
   */ public
 int setOffset(RelAbsVector offset) {
    return libsbmlJNI.GradientStop_setOffset__SWIG_0(swigCPtr, this, RelAbsVector.getCPtr(offset), offset);
  }

  
/**
   * Sets the offset for the gradient stop.
   <p>
   * @param abs the absolute value of the offset.
   <p>
   * @param rel the relative value of the offset.
   */ public
 void setOffset(double abs, double rel) {
    libsbmlJNI.GradientStop_setOffset__SWIG_1(swigCPtr, this, abs, rel);
  }

  
/**
   * Sets the offset to the value specified by the given string.
   * The string has to represent a combination of an absolute 
   * and relative value.
   * Valid value string would e.g. be '45.0', '30%' or
   * '10+5%'. If the value is a combination of both relative and 
   * absolute value, the absolute value has to come before the relative
   * value. Number can be given as integer values or floating point values
   * and the two components can be combined by '+' or '-'. Depending on
   * whethr the relative value should be added or subtracted from the 
   * absolute value.
   * If the given string is not valid, the offset will have an absolute 
   * and a relative value of NaN.
   <p>
   * @param co a string representing a valid offset value.
   */ public
 void setOffset(String co) {
    libsbmlJNI.GradientStop_setOffset__SWIG_2(swigCPtr, this, co);
  }

  
/**
   * Unsets the value of the 'offset' element of this {@link GradientStop}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED}
   * </ul>
   */ public
 int unsetOffset() {
    return libsbmlJNI.GradientStop_unsetOffset(swigCPtr, this);
  }

  
/**
   * Returns the XML element name of this {@link GradientStop} object.
   <p>
   * For {@link GradientStop}, the XML element name is always <code>'stop'.</code>
   <p>
   * @return the name of this element, i.e. <code>'stop'.</code>
   */ public
 String getElementName() {
    return libsbmlJNI.GradientStop_getElementName(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code for this {@link GradientStop} object.
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
   * {@link libsbmlConstants#SBML_RENDER_GRADIENT_STOP SBML_RENDER_GRADIENT_STOP}.
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
    return libsbmlJNI.GradientStop_getTypeCode(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if all the required attributes for this
   * {@link GradientStop} object have been set.
   <p>
   * @return <code>true</code> to indicate that all the required attributes of this
   * {@link GradientStop} have been set, otherwise <code>false</code> is returned.
   <p>
   * @note The required attributes for the {@link GradientStop} object are:
   * <ul>
   * <li> 'stop-color'
   * </ul>
   */ public
 boolean hasRequiredAttributes() {
    return libsbmlJNI.GradientStop_hasRequiredAttributes(swigCPtr, this);
  }

  
/**
   * Creates an {@link XMLNode} object from this {@link GradientStop} object.
   <p>
   * @return the {@link XMLNode} with the XML representation for the 
   * {@link GradientStop} object.
   */ public
 XMLNode toXML() {
    return new XMLNode(libsbmlJNI.GradientStop_toXML(swigCPtr, this), true);
  }

}