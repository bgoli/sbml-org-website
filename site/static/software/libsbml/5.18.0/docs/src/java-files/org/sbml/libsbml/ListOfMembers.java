/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 * <span class="pkg-marker pkg-color-groups"><a href="group__groups.html">groups</a></span>
 A list of {@link Member} objects.
 <p>
 * In the SBML Level&nbsp;3 Groups package, the membership of a group is
 * defined by placing {@link Member} objects within a {@link ListOfMembers} object contained
 * within a {@link Group} object.  A {@link ListOfMembers} object is optional, but, if
 * present, it must contain at least one {@link Member} object.  In common with other
 * ListOf___ classes in SBML, {@link ListOfMembers} is derived from {@link SBase}.  However,
 * an uncommon feature of {@link ListOfMembers} is that it has optional 'id' and
 * 'name' attributes that can be used in a manner discussed below.
 <p>
 * A {@link ListOfMembers} must have one or more {@link Member} children. Since {@link ListOfMembers}
 * is derived from {@link SBase}, it inherits the 'sboTerm' and 'metaid' attributes,
 * as well as the optional children Notes and Annotation. Unlike most lists
 * of objects in SBML, however, the 'sboTerm' attribute and the Notes and
 * Annotation children are taken here to apply directly to every SBML element
 * referenced by each child {@link Member} of this {@link ListOfMembers}, if that referenced
 * element has no such definition. Thus, if a referenced element has no
 * defined 'sboTerm' attribute or child Notes or Annotation objects, that
 * element should be considered to now have the 'sboTerm', child Notes, or
 * child Annotation of the {@link ListOfMembers}.
 <p>
 * If multiple {@link ListOfMembers} have child {@link Member} elements that reference
 * the same SBML element, and more than one {@link ListOfMembers} or {@link Member} has
 * a value for an sboTerm attribute, Notes, or Annotation element, those
 * {@link Member} elements should be consistent with each other: the 'sboTerm'
 * attributes should either be identical, or one should inherit from
 * the other; Notes should say the same or similar things; and Annotation
 * elements should not conflict. Interpreters may choose to resolve any
 * such conflicts arbitrarily.
 <p>
 * An uncommon feature about {@link ListOfMembers} is that, if it is referenced by a
 * {@link Member} of a different {@link Group}, the <em>children</em> of the referenced
 * {@link ListOfMembers} are also considered to be members of the referencing group.
 * In this way, groups may be nested semantically to create larger groups out
 * of subgroups.
 <p>
 * <h2>Semantics of group memberships</h2>
 <p>
 * <p>
 * If a {@link Member} object within a {@link Group} object's {@link ListOfMembers} references
 * another {@link Group} object, it is the <em>referenced {@link Group} itself</em> that is
 * considered to be a member of the parent {@link Group}, <em>not</em> the corresponding
 * referenced model component(s).  This is true regardless of whether those
 * components themselves happen to point to other components using some
 * mechanism defined by another SBML Level&nbsp;3 package (as happens, for
 * example, in the SBML Level&nbsp;3 Hierarchical Model Composition package
 * and its use of {@link SBaseRef}).  However, if instead a {@link Member} object references
 * a {@link ListOfMembers} object (using the 'id' attribute permitted on
 * {@link ListOfMembers} objects), it is the components of that {@link ListOfMembers} that
 * are considered to be part of the parent {@link Group}.  In other words: if in some
 * {@link Group} <em>G</em>, a {@link Member} <em>M</em> references another {@link Group}, that {@link Group} is the
 * member of <em>G</em>; if <em>M</em> references a {@link ListOfMembers}, it is the entities
 * referenced by the {@link Member} objects within the {@link ListOfMembers} that are
 * the members of <em>G</em> and not the {@link ListOfMembers} object itself.
 <p>
 * The implication of this is that any rule that applies to members of a
 * group (such the meaning of the 'kind' attribute, or the restrictions on
 * the application of 'sboTerm' attributes on a {@link ListOfMembers}) applies to the
 * child group when referenced by the {@link Group} 'id', and to the members of the
 * child group when referenced by the {@link ListOfMembers} 'id'. In an example
 * situation where a parent group includes two {@link Species} plus a {@link Group} which
 * itself contains three other {@link Species}, if the parent group's {@link ListOfMembers}
 * is given an 'sboTerm' attribute value, that {@link SBO} term applies to the two
 * species and the group, not to the three child species members of the
 * second group.  (Note also that in such a case, the parent group's 'kind'
 * attribute value would almost certainly be <code>'collection'</code> or
 * <code>'partonomy'</code>, and not <code>'classification'</code>, as two species and a group are
 * very unlikely to be classified as the same thing.)  In contrast, in the
 * situation where a parent group includes two {@link Species} plus a {@link ListOfMembers}
 * which contains three other {@link Species}, the parent group's {@link ListOfMembers}
 * 'sboTerm' would apply to the five {@link Species}, and could be more reasonably
 * marked as a <code>'classification'.</code>
 <p>
 * In a future version of this SBML Level&nbsp;3 Groups specification, it may
 * be possible to perform set operations on groups, but for now, this type of
 * union is the only set operation that is possible.
 <p>
 * Groups are not permitted to be circular: no {@link Member} may reference itself,
 * its parent {@link ListOfMembers}, nor its parent {@link Group}. If a {@link Member} references a
 * {@link Group}, the same restrictions apply to that subgroup's children: they may
 * not reference the {@link Member}, its parent {@link ListOfMembers}, nor its parent {@link Group},
 * and if any of those children reference a {@link Group}, the same restrictions apply
 * to them, etc.
 <p>
 * If a {@link Member} has a 'idRef' or 'metaIdRef' attribute which references an
 * object from a namespace that is not understood by the interpreter of the
 * SBML model, that {@link Member} must be ignored. The referenced object will not be
 * understood by the interpreter, and therefore has no need to become a
 * member of the group. If an interpreter cannot tell whether a referenced
 * object does not exist or if exists in an unparsed namespace, it may choose
 * to produce a warning.
 <p>
 * @see Group
 * @see Member
 * @see ListOfGroups
 */

public class ListOfMembers extends ListOf {
   private long swigCPtr;

   protected ListOfMembers(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.ListOfMembers_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(ListOfMembers obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (ListOfMembers obj)
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
        libsbmlJNI.delete_ListOfMembers(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link ListOfMembers} using the given SBML Level, Version and
   * &ldquo;groups&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ListOfMembers}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ListOfMembers}.
   <p>
   * @param pkgVersion a long integer, the SBML Groups Version to assign to
   * this {@link ListOfMembers}.
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
 ListOfMembers(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfMembers__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Creates a new {@link ListOfMembers} using the given SBML Level, Version and
   * &ldquo;groups&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ListOfMembers}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ListOfMembers}.
   <p>
   * @param pkgVersion a long integer, the SBML Groups Version to assign to
   * this {@link ListOfMembers}.
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
 ListOfMembers(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfMembers__SWIG_1(level, version), true);
  }

  
/**
   * Creates a new {@link ListOfMembers} using the given SBML Level, Version and
   * &ldquo;groups&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ListOfMembers}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ListOfMembers}.
   <p>
   * @param pkgVersion a long integer, the SBML Groups Version to assign to
   * this {@link ListOfMembers}.
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
 ListOfMembers(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfMembers__SWIG_2(level), true);
  }

  
/**
   * Creates a new {@link ListOfMembers} using the given SBML Level, Version and
   * &ldquo;groups&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ListOfMembers}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ListOfMembers}.
   <p>
   * @param pkgVersion a long integer, the SBML Groups Version to assign to
   * this {@link ListOfMembers}.
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
 ListOfMembers() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfMembers__SWIG_3(), true);
  }

  
/**
   * Creates a new {@link ListOfMembers} using the given {@link GroupsPkgNamespaces} object.
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
   * @param groupsns the {@link GroupsPkgNamespaces} object.
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
 ListOfMembers(GroupsPkgNamespaces groupsns) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfMembers__SWIG_4(GroupsPkgNamespaces.getCPtr(groupsns), groupsns), true);
  }

  
/**
   * Copy constructor for {@link ListOfMembers}.
   <p>
   * @param orig the {@link ListOfMembers} instance to copy.
   */ public
 ListOfMembers(ListOfMembers orig) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfMembers__SWIG_5(ListOfMembers.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link ListOfMembers} object.
   <p>
   * @return a (deep) copy of this {@link ListOfMembers} object.
   */ public
 ListOfMembers cloneObject() {
    long cPtr = libsbmlJNI.ListOfMembers_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new ListOfMembers(cPtr, true);
  }

  
/**
   * Returns the value of the 'id' attribute of this {@link ListOfMembers}.
   <p>
   * @return the value of the 'id' attribute of this {@link ListOfMembers} as a string.
   */ public
 String getId() {
    return libsbmlJNI.ListOfMembers_getId(swigCPtr, this);
  }

  
/**
   * Returns the value of the 'name' attribute of this {@link ListOfMembers}.
   <p>
   * @return the value of the 'name' attribute of this {@link ListOfMembers} as a
   * string.
   */ public
 String getName() {
    return libsbmlJNI.ListOfMembers_getName(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link ListOfMembers}'s 'id' attribute is set.
   <p>
   * @return <code>true</code> if this {@link ListOfMembers}'s 'id' attribute has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetId() {
    return libsbmlJNI.ListOfMembers_isSetId(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link ListOfMembers}'s 'name' attribute is
   * set.
   <p>
   * @return <code>true</code> if this {@link ListOfMembers}'s 'name' attribute has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetName() {
    return libsbmlJNI.ListOfMembers_isSetName(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'id' attribute of this {@link ListOfMembers}.
   <p>
   * @param id String& value of the 'id' attribute to be set.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE}
   *
   * </ul> <p>
   * Calling this function with <code>id</code> = <code>null</code> or an empty string is
   * equivalent to calling unsetId().
   */ public
 int setId(String id) {
    return libsbmlJNI.ListOfMembers_setId(swigCPtr, this, id);
  }

  
/**
   * Sets the value of the 'name' attribute of this {@link ListOfMembers}.
   <p>
   * @param name String& value of the 'name' attribute to be set.
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
   * Calling this function with <code>name</code> = <code>null</code> or an empty string is
   * equivalent to calling unsetName().
   */ public
 int setName(String name) {
    return libsbmlJNI.ListOfMembers_setName(swigCPtr, this, name);
  }

  
/**
   * Unsets the value of the 'id' attribute of this {@link ListOfMembers}.
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
 int unsetId() {
    return libsbmlJNI.ListOfMembers_unsetId(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'name' attribute of this {@link ListOfMembers}.
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
 int unsetName() {
    return libsbmlJNI.ListOfMembers_unsetName(swigCPtr, this);
  }

  
/**
   * Get a {@link Member} from the {@link ListOfMembers}.
   <p>
   * @param n a long integer representing the index of the {@link Member} to retrieve.
   <p>
   * @return the nth {@link Member} in this {@link ListOfMembers}.
   * If the index <code>n</code> is invalid, <code>null</code> is returned.
   <p>
   * <p>
 * @note
 * The pointer that is returned by this function is not owned by the caller,
 * but may be queried and modified.  Any changes made will be reflected in any
 * resulting SBML document containing the pointer's parent.
   <p>
   * @see #addMember(Member object)
   * @see #createMember()
   * @see #get(String sid)
   * @see #getNumMembers()
   * @see #remove(String sid)
   * @see #remove(long n)
   */ public
 Member get(long n) {
    long cPtr = libsbmlJNI.ListOfMembers_get__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new Member(cPtr, false);
  }

  
/**
   * Get a {@link Member} from the {@link ListOfMembers} based on its identifier.
   <p>
   * @param sid a string representing the identifier of the {@link Member} to retrieve.
   <p>
   * @return the {@link Member} in this {@link ListOfMembers} with the given <code>sid</code> or <code>null</code>
   * if no such {@link Member} exists.
   <p>
   * <p>
 * @note
 * The pointer that is returned by this function is not owned by the caller,
 * but may be queried and modified.  Any changes made will be reflected in any
 * resulting SBML document containing the pointer's parent.
   <p>
   * @see #addMember(Member object)
   * @see #createMember()
   * @see #get(long n)
   * @see #getNumMembers()
   * @see #remove(String sid)
   * @see #remove(long n)
   */ public
 Member get(String sid) {
    long cPtr = libsbmlJNI.ListOfMembers_get__SWIG_2(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new Member(cPtr, false);
  }

  
/**
   * Removes the nth {@link Member} from this {@link ListOfMembers} and returns a pointer to
   * it.
   <p>
   * @param n a long integer representing the index of the {@link Member} to remove.
   <p>
   * @return a pointer to the nth {@link Member} in this {@link ListOfMembers}.
   <p>
   * <p>
 * @warning
 * <span class='warning'>The pointer that is returned by this function is owned
 * by the caller, who is responsible for deleting it.  Any changes made to the
 * element will not be reflected in any resulting SBML document unless the
 * element is added to an SBML Document.  Even in this case, the element's
 * deletion is still the responsibility of the caller with two exceptions: if
 * it is used as the 'disownedItem' in the * {@link ListOf#appendAndOwn()} or {@link ListOf#insertAndOwn()} 
 * functions.  All other functions in libsbml add a copy of the element,
 * and do not transfer ownership of the pointer.</span>
   <p>
   * @see #addMember(Member object)
   * @see #createMember()
   * @see #get(String sid)
   * @see #get(long n)
   * @see #getNumMembers()
   * @see #remove(String sid)
   */ public
 Member remove(long n) {
    long cPtr = libsbmlJNI.ListOfMembers_remove__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new Member(cPtr, true);
  }

  
/**
   * Removes the {@link Member} from this {@link ListOfMembers} based on its identifier and
   * returns a pointer to it.
   <p>
   * @param sid a string representing the identifier of the {@link Member} to remove.
   <p>
   * @return the {@link Member} in this {@link ListOfMembers} based on the identifier or null
   * if no such {@link Member} exists.
   <p>
   * <p>
 * @warning
 * <span class='warning'>The pointer that is returned by this function is owned
 * by the caller, who is responsible for deleting it.  Any changes made to the
 * element will not be reflected in any resulting SBML document unless the
 * element is added to an SBML Document.  Even in this case, the element's
 * deletion is still the responsibility of the caller with two exceptions: if
 * it is used as the 'disownedItem' in the * {@link ListOf#appendAndOwn()} or {@link ListOf#insertAndOwn()} 
 * functions.  All other functions in libsbml add a copy of the element,
 * and do not transfer ownership of the pointer.</span>
   <p>
   * @see #addMember(Member object)
   * @see #createMember()
   * @see #get(String sid)
   * @see #get(long n)
   * @see #getNumMembers()
   * @see #remove(long n)
   */ public
 Member remove(String sid) {
    long cPtr = libsbmlJNI.ListOfMembers_remove__SWIG_1(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new Member(cPtr, true);
  }

  
/**
   * Adds a copy of the given {@link Member} to this {@link ListOfMembers}.
   <p>
   * @param m the {@link Member} object to add.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_OBJECT LIBSBML_INVALID_OBJECT}
   * <li> {@link libsbmlConstants#LIBSBML_LEVEL_MISMATCH LIBSBML_LEVEL_MISMATCH}
   * <li> {@link libsbmlConstants#LIBSBML_VERSION_MISMATCH LIBSBML_VERSION_MISMATCH}
   * <li> {@link libsbmlConstants#LIBSBML_PKG_VERSION_MISMATCH LIBSBML_PKG_VERSION_MISMATCH}
   * <li> {@link libsbmlConstants#LIBSBML_DUPLICATE_OBJECT_ID LIBSBML_DUPLICATE_OBJECT_ID}
   *
   * </ul> <p>
   * <p>
 * @note This method should be used with some caution.  The fact that this
 * method <em>copies</em> the object passed to it means that the caller will be
 * left holding a physically different object instance than the one contained
 * inside this object.  Changes made to the original object instance (such as
 * resetting attribute values) will <em>not affect the instance in this
 * object</em>.  In addition, the caller should make sure to free the
 * original object if it is no longer being used, or else a memory leak will
 * result.  Please see other methods on this class (particularly a
 * corresponding method whose name begins with the word <code>create</code>)
 * for alternatives that do not lead to these issues.
   <p>
   * @see #createMember()
   * @see #get(String sid)
   * @see #get(long n)
   * @see #getNumMembers()
   * @see #remove(String sid)
   * @see #remove(long n)
   */ public
 int addMember(Member m) {
    return libsbmlJNI.ListOfMembers_addMember(swigCPtr, this, Member.getCPtr(m), m);
  }

  
/**
   * Get the number of {@link Member} objects in this {@link ListOfMembers}.
   <p>
   * @return the number of {@link Member} objects in this {@link ListOfMembers}.
   <p>
   * @see #addMember(Member object)
   * @see #createMember()
   * @see #get(String sid)
   * @see #get(long n)
   * @see #remove(String sid)
   * @see #remove(long n)
   */ public
 long getNumMembers() {
    return libsbmlJNI.ListOfMembers_getNumMembers(swigCPtr, this);
  }

  
/**
   * Creates a new {@link Member} object, adds it to this {@link ListOfMembers} object and
   * returns the {@link Member} object created.
   <p>
   * @return a new {@link Member} object instance.
   <p>
   * <p>
 * @note
 * The pointer that is returned by this function is not owned by the caller,
 * but may be queried and modified.  Any changes made will be reflected in any
 * resulting SBML document containing the pointer's parent.
   <p>
   * @see #addMember(Member object)
   * @see #get(String sid)
   * @see #get(long n)
   * @see #getNumMembers()
   * @see #remove(String sid)
   * @see #remove(long n)
   */ public
 Member createMember() {
    long cPtr = libsbmlJNI.ListOfMembers_createMember(swigCPtr, this);
    return (cPtr == 0) ? null : new Member(cPtr, false);
  }

  
/**
   * Get a {@link Member} from the {@link ListOfMembers} based on the element to which it
   * refers.
   <p>
   * @param sid a string representing the 'idRef' attribute of the {@link Member}
   * object to retrieve.
   <p>
   * @return the first {@link Member} in this {@link ListOfMembers} based on the given idRef
   * attribute or null if no such {@link Member} exists.
   <p>
   * <p>
 * @note
 * The pointer that is returned by this function is not owned by the caller,
 * but may be queried and modified.  Any changes made will be reflected in any
 * resulting SBML document containing the pointer's parent.
   */ public
 Member getByIdRef(String sid) {
    long cPtr = libsbmlJNI.ListOfMembers_getByIdRef__SWIG_0(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new Member(cPtr, false);
  }

  
/**
   * Returns the XML element name of this {@link ListOfMembers} object.
   <p>
   * For {@link ListOfMembers}, the XML element name is always <code>'listOfMembers'.</code>
   <p>
   * @return the name of this element, i.e. <code>'listOfMembers'.</code>
   */ public
 String getElementName() {
    return libsbmlJNI.ListOfMembers_getElementName(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code for this {@link ListOfMembers} object.
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
   * {@link libsbmlConstants#SBML_LIST_OF SBML_LIST_OF}.
   <p>
   * <p>
 * @warning <span class='warning'>The specific integer values of the possible
 * type codes may be reused by different libSBML plug-ins for SBML Level&nbsp;3.
 * packages,  To fully identify the correct code, <strong>it is necessary to
 * invoke both getPackageName() and getTypeCode()</strong> (or 
 * {@link ListOf#getItemTypeCode()}).</span>
   */ public
 int getTypeCode() {
    return libsbmlJNI.ListOfMembers_getTypeCode(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code for the SBML objects contained in this
   * {@link ListOfMembers} object.
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
   * @return the SBML typecode for the objects contained in this ListOfMembers:
   * {@link libsbmlConstants#SBML_GROUPS_MEMBER SBML_GROUPS_MEMBER}.
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
 int getItemTypeCode() {
    return libsbmlJNI.ListOfMembers_getItemTypeCode(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if all the required attributes for this
   * {@link ListOfMembers} object have been set.
   <p>
   * @return <code>true</code> to indicate that all the required attributes of this
   * {@link ListOfMembers} have been set, otherwise <code>false</code> is returned.
   */ public
 boolean hasRequiredAttributes() {
    return libsbmlJNI.ListOfMembers_hasRequiredAttributes(swigCPtr, this);
  }

}
