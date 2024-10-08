/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 * <span class="pkg-marker pkg-color-fbc"><a href="group__fbc.html">fbc</a></span>
 A list of {@link Objective} objects.
 <p>
 * The {@link ListOfObjectives} is a container for the SBML extended {@link Model}
 * that lists all the possible {@link Objective} elements in the model.
 <p>
 * Unlike most other {@link ListOf} subclasses in SBML, SBML Level&nbsp;3 <a href='../../../extensions-summary.html#fbc'>Flux Balance Constraints</a>
 * Version&nbsp;2 defines an additional required attribute on
 * ListOfObjectives: the 'activeObjective' attribute.  This attribute is of
 * type <code>SIdRef</code> and can only refer to the id of an existing
 * {@link Objective}. This required attribute exists so that when multiple
 * {@link Objective}'s are included in a single model, the model will always be well
 * described; i.e., there will be a single, primary objective function which
 * defines a single optimum and its associated solution space.
 <p>
 * <p>
 * The various ListOf___ classes in SBML
 * are merely containers used for organizing the main components of an SBML
 * model.  In libSBML's implementation, ListOf___
 * classes are derived from the
 * intermediate utility class {@link ListOf}, which
 * is not defined by the SBML specifications but serves as a useful
 * programmatic construct.  {@link ListOf} is itself is in turn derived from {@link SBase},
 * which provides all of the various ListOf___
 * classes with common features
 * defined by the SBML specification, such as 'metaid' attributes and
 * annotations.
 <p>
 * The relationship between the lists and the rest of an SBML model is
 * illustrated by the following (for SBML Level&nbsp;2 Version&nbsp;4):
 <p>
 * <figure>
  <object type="image/svg+xml" data="listof-illustration.svg" class="centered"></object>
</figure>

 <p>
 * SBML Level&nbsp;3 Version&nbsp;1 has essentially the same structure as 
 * Level&nbsp;2 Version&nbsp;4, depicted above, but SBML Level&nbsp;3 
 * Version&nbsp;2 allows
 * containers to contain zero or more of the relevant object, instead of 
 * requiring at least one.  As such, libsbml will write out an 
 * otherwise-empty ListOf___ element that has any optional attribute set 
 * (such as 'id' or 'metaid'), that has an optional child (such 
 * as a 'notes' or 'annotation'), or that has attributes or children set
 * from any SBML Level&nbsp;3 package, whether or not the ListOf___ has 
 * any other children.
 <p>
 * Readers may wonder about the motivations for using the ListOf___
 * containers in SBML.  A simpler approach in XML might be to place the
 * components all directly at the top level of the model definition.  The
 * choice made in SBML is to group them within XML elements named after
 * ListOf<em>Classname</em>, in part because it helps organize the
 * components.  More importantly, the fact that the container classes are
 * derived from {@link SBase} means that software tools can add information <em>about</em>
 * the lists themselves into each list container's 'annotation'.
 <p>
 * @see ListOfFunctionDefinitions
 * @see ListOfUnitDefinitions
 * @see ListOfCompartmentTypes
 * @see ListOfSpeciesTypes
 * @see ListOfCompartments
 * @see ListOfSpecies
 * @see ListOfParameters
 * @see ListOfInitialAssignments
 * @see ListOfRules
 * @see ListOfConstraints
 * @see ListOfReactions
 * @see ListOfEvents
 <p>
 * 
 * @warning The required attribute 'activeObjective' on {@link ListOfObjectives} is
 * an additional attribute that is not present on typical {@link ListOf} classes.
 * The introduction of an attribute on {@link ListOf} is perfectly legal in SBML, but
 * uncommon, and software developers may have grown accustomed to {@link ListOf}
 * classes all having the same attributes and no others.  We are belaboring
 * this point so that developers are more likely to notice the presence of an
 * additional attribute on {@link ListOfObjectives}.
 <p>
   * @see GeneProduct
 * @see FbcModelPlugin
 */

public class ListOfObjectives extends ListOf {
   private long swigCPtr;

   protected ListOfObjectives(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.ListOfObjectives_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(ListOfObjectives obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (ListOfObjectives obj)
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
        libsbmlJNI.delete_ListOfObjectives(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link ListOfObjectives} with the given SBML Level, Version, and
   * &ldquo;fbc&rdquo;package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ListOfObjectives}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ListOfObjectives}.
   <p>
   * @param pkgVersion a long integer, the SBML Fbc Version to assign to
   * this {@link ListOfObjectives}.
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
 ListOfObjectives(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfObjectives__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Creates a new {@link ListOfObjectives} with the given SBML Level, Version, and
   * &ldquo;fbc&rdquo;package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ListOfObjectives}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ListOfObjectives}.
   <p>
   * @param pkgVersion a long integer, the SBML Fbc Version to assign to
   * this {@link ListOfObjectives}.
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
 ListOfObjectives(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfObjectives__SWIG_1(level, version), true);
  }

  
/**
   * Creates a new {@link ListOfObjectives} with the given SBML Level, Version, and
   * &ldquo;fbc&rdquo;package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ListOfObjectives}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ListOfObjectives}.
   <p>
   * @param pkgVersion a long integer, the SBML Fbc Version to assign to
   * this {@link ListOfObjectives}.
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
 ListOfObjectives(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfObjectives__SWIG_2(level), true);
  }

  
/**
   * Creates a new {@link ListOfObjectives} with the given SBML Level, Version, and
   * &ldquo;fbc&rdquo;package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ListOfObjectives}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ListOfObjectives}.
   <p>
   * @param pkgVersion a long integer, the SBML Fbc Version to assign to
   * this {@link ListOfObjectives}.
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
 ListOfObjectives() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfObjectives__SWIG_3(), true);
  }

  
/**
   * Creates a new {@link ListOfObjectives} with the given {@link FbcPkgNamespaces} object.
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
   * @param fbcns the {@link FbcPkgNamespaces} object.
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
 ListOfObjectives(FbcPkgNamespaces fbcns) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfObjectives__SWIG_4(FbcPkgNamespaces.getCPtr(fbcns), fbcns), true);
  }

  
/**
   * Copy Constructor.
   <p>
   * @param other the instance to copy.
   */ public
 ListOfObjectives(ListOfObjectives other) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfObjectives__SWIG_5(ListOfObjectives.getCPtr(other), other), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link ListOfObjectives} object.
   <p>
   * @return a (deep) copy of this {@link ListOfObjectives} object.
   */ public
 ListOfObjectives cloneObject() {
    long cPtr = libsbmlJNI.ListOfObjectives_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new ListOfObjectives(cPtr, true);
  }

  
/**
   * Get an {@link Objective} from the {@link ListOfObjectives}.
   <p>
   * @param n the index number of the {@link Objective} to get.
   <p>
   * @return the nth {@link Objective} in this {@link ListOfObjectives}.
   * If the index <code>n</code> is invalid, <code>null</code> is returned.
   <p>
   * @see #size()
   */ public
 Objective get(long n) {
    long cPtr = libsbmlJNI.ListOfObjectives_get__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new Objective(cPtr, false);
  }

  
/**
   * Get an {@link Objective} from the {@link ListOfObjectives} based on its identifier.
   <p>
   * @param sid a string representing the identifier of the {@link Objective} to get.
   <p>
   * @return {@link Objective} in this {@link ListOfObjectives} with the given id or <code>null</code> if
   * no such {@link Objective} exists.
   <p>
   * @see #get(long n)
   * @see #size()
   */ public
 Objective get(String sid) {
    long cPtr = libsbmlJNI.ListOfObjectives_get__SWIG_2(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new Objective(cPtr, false);
  }

  
/**
   * Adds a copy the given {@link Objective} to this {@link ListOfObjectives}.
   <p>
   * @param o the {@link Objective} object to add.
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
 int addObjective(Objective o) {
    return libsbmlJNI.ListOfObjectives_addObjective(swigCPtr, this, Objective.getCPtr(o), o);
  }

  
/**
   * Get the number of {@link Objective} objects in this {@link ListOfObjectives}.
   <p>
   * @return the number of {@link Objective} objects in this {@link ListOfObjectives}.
   */ public
 long getNumObjectives() {
    return libsbmlJNI.ListOfObjectives_getNumObjectives(swigCPtr, this);
  }

  
/**
   * Creates a new {@link Objective} object, adds it to the
   * {@link ListOfObjectives} and returns the {@link Objective} object created. 
   <p>
   * @return a new {@link Objective} object instance.
   <p>
   * @see #addObjective(Objective o)
   */ public
 Objective createObjective() {
    long cPtr = libsbmlJNI.ListOfObjectives_createObjective(swigCPtr, this);
    return (cPtr == 0) ? null : new Objective(cPtr, false);
  }

  
/**
   * Removes the nth {@link Objective} from this {@link ListOfObjectives}
   * and returns a pointer to it.
   <p>
   * The caller owns the returned item and is responsible for deleting it.
   <p>
   * @param n the index of the {@link Objective} to remove.
   <p>
   * @see #size()
   */ public
 Objective remove(long n) {
    long cPtr = libsbmlJNI.ListOfObjectives_remove__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new Objective(cPtr, true);
  }

  
/**
   * Removes the {@link Objective} from this {@link ListOfObjectives} with the given identifier
   * and returns a pointer to it.
   <p>
   * The caller owns the returned item and is responsible for deleting it.
   * If none of the items in this list have the identifier <code>sid</code>, then
   * <code>null</code> is returned.
   <p>
   * @param sid the identifier of the {@link Objective} to remove.
   <p>
   * @return the {@link Objective} removed. As mentioned above, the caller owns the
   * returned item.
   */ public
 Objective remove(String sid) {
    long cPtr = libsbmlJNI.ListOfObjectives_remove__SWIG_1(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new Objective(cPtr, true);
  }

  
/**
   * Returns the XML element name of this object.
   <p>
   * For {@link ListOfObjectives}, the XML element name is always <code>'listOfObjectives'.</code>
   <p>
   * @return the name of this element, i.e. <code>'listOfObjectives'.</code>
   */ public
 String getElementName() {
    return libsbmlJNI.ListOfObjectives_getElementName(swigCPtr, this);
  }

  
/**
  * Predicate returning <code>true</code> if this ListOfObjective's 'activeObjective'
  * attribute is set.
  <p>
  * @return <code>true</code> if this ListOfObjective's 'activeObjective' attribute has been set,
  * otherwise <code>false</code> is returned.
  */ public
 boolean isSetActiveObjective() {
    return libsbmlJNI.ListOfObjectives_isSetActiveObjective(swigCPtr, this);
  }

  
/**
  * Sets the value of the 'activeObjective' attribute of this {@link ListOfObjectives}.
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
 int setActiveObjective(String activeObjective) {
    return libsbmlJNI.ListOfObjectives_setActiveObjective(swigCPtr, this, activeObjective);
  }

  
/**
  * Returns the value of the 'activeObjective' attribute of this {@link ListOfObjectives}.
  <p>
  * @return the value of the 'activeObjective' attribute of this {@link ListOfObjectives}.
  */ public
 String getActiveObjective() {
    return libsbmlJNI.ListOfObjectives_getActiveObjective(swigCPtr, this);
  }

  
/**
  * Unsets the value of the 'activeObjective' attribute of this {@link ListOfObjectives}.
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
 int unsetActiveObjective() {
    return libsbmlJNI.ListOfObjectives_unsetActiveObjective(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code for this SBML object.
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
   * {@link libsbmlConstants#SBML_LIST_OF SBML_LIST_OF} (default).
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
    return libsbmlJNI.ListOfObjectives_getTypeCode(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code for the objects contained in this {@link ListOf}.
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
   * @return the SBML type code for the objects contained in this {@link ListOf}
   * instance: {@link libsbmlConstants#SBML_FBC_OBJECTIVE SBML_FBC_OBJECTIVE} (default).
   <p>
   * @see #getElementName()
   * @see #getPackageName()
   */ public
 int getItemTypeCode() {
    return libsbmlJNI.ListOfObjectives_getItemTypeCode(swigCPtr, this);
  }

  
/**
  * Adds a clone of all items in the provided {@link ListOf} to this object.
  <p>
  * This means that when this {@link ListOf} is destroyed, the original items will
  * not be destroyed.  In addition, copy over the input {@link ListOfObjectives}'
  * 'activeObjective' attribute, if none is set for this element.
  <p>
  * @param list a list of items to be added.
  <p>
  * @see #append(SBase item)
  */ public
 int appendFrom(ListOf list) {
    return libsbmlJNI.ListOfObjectives_appendFrom(swigCPtr, this, ListOf.getCPtr(list), list);
  }

  
/**
  * <p>
 * Replaces all uses of a given <code>SIdRef</code> type attribute value with another
 * value.
 <p>
 * <p>
 * In SBML, object identifiers are of a data type called <code>SId</code>.
 * In SBML Level&nbsp;3, an explicit data type called <code>SIdRef</code> was
 * introduced for attribute values that refer to <code>SId</code> values; in
 * previous Levels of SBML, this data type did not exist and attributes were
 * simply described to as 'referring to an identifier', but the effective
 * data type was the same as <code>SIdRef</code> in Level&nbsp;3.  These and
 * other methods of libSBML refer to the type <code>SIdRef</code> for all
 * Levels of SBML, even if the corresponding SBML specification did not
 * explicitly name the data type.
 <p>
 * This method works by looking at all attributes and (if appropriate)
 * mathematical formulas in MathML content, comparing the referenced
 * identifiers to the value of <code>oldid</code>.  If any matches are found, the
 * matching values are replaced with <code>newid</code>.  The method does <em>not</em>
 * descend into child elements.
 <p>
 * @param oldid the old identifier.
 * @param newid the new identifier.
  */ public
 void renameSIdRefs(String oldid, String newid) {
    libsbmlJNI.ListOfObjectives_renameSIdRefs(swigCPtr, this, oldid, newid);
  }

}
