/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 * <span class="pkg-marker pkg-color-multi"><a href="group__multi.html">multi</a></span>
 Extension of {@link Model}.
 <p>
 * <p style='color: #777; font-style: italic'>
This class of objects is defined by libSBML only and has no direct
equivalent in terms of SBML components.  This class is not prescribed by
the SBML specifications, although it is used to implement features
defined in SBML.
</p>

 <p>
 * The {@link MultiModelPlugin} object is used to extend the standard SBML {@link Model}
 * object to allow a {@link ListOfSpeciesTypes} child.
 */

public class MultiModelPlugin extends SBasePlugin {
   private long swigCPtr;

   protected MultiModelPlugin(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.MultiModelPlugin_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(MultiModelPlugin obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (MultiModelPlugin obj)
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
        libsbmlJNI.delete_MultiModelPlugin(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link MultiModelPlugin} object using the given parameters.
   <p>
   * <p>
 * In the XML representation of an SBML document, XML namespaces are used to
 * identify the origin of each XML construct used.  XML namespaces are
 * identified by their unique resource identifiers (URIs).  The core SBML
 * specifications stipulate the namespaces that must be used for core SBML
 * constructs; for example, all XML elements that belong to SBML Level&nbsp;3
 * Version&nbsp;1 Core must be placed in the XML namespace identified by the URI
 * <code>'http://www.sbml.org/sbml/level3/version1/core'</code>.  Individual
 * SBML Level&nbsp;3 packages define their own XML namespaces; for example,
 * all elements belonging to the SBML Level&nbsp;3 Layout Version&nbsp;1
 * package must be placed in the XML namespace
 * <code>'http://www.sbml.org/sbml/level3/version1/layout/version1/'</code>.
   <p>
   * <p>
 * The {@link SBMLNamespaces} object encapsulates SBML Level/Version/namespaces
 * information.  It is used to communicate the SBML Level, Version, and (in
 * Level&nbsp;3) packages used in addition to SBML Level&nbsp;3 Core.  A
 * common approach to using libSBML's {@link SBMLNamespaces} facilities is to create an
 * {@link SBMLNamespaces} object somewhere in a program once, then hand that object
 * as needed to object constructors that accept {@link SBMLNamespaces} as arguments.
   <p>
   * @param uri the URI of the SBML Level&nbsp;3 package implemented by
   * this libSBML package extension.
   <p>
   * @param prefix the XML namespace prefix being used for the package.
   <p>
   * @param multins the namespaces object for the package.
   */ public
 MultiModelPlugin(String uri, String prefix, MultiPkgNamespaces multins) {
    this(libsbmlJNI.new_MultiModelPlugin__SWIG_0(uri, prefix, MultiPkgNamespaces.getCPtr(multins), multins), true);
  }

  
/**
   * Copy constructor for {@link MultiModelPlugin}.
   <p>
   * @param orig the {@link MultiModelPlugin} instance to copy.
   */ public
 MultiModelPlugin(MultiModelPlugin orig) {
    this(libsbmlJNI.new_MultiModelPlugin__SWIG_1(MultiModelPlugin.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link MultiModelPlugin} object.
   <p>
   * @return a (deep) copy of this {@link MultiModelPlugin} object.
   */ public
 SBasePlugin cloneObject() {
    long cPtr = libsbmlJNI.MultiModelPlugin_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new MultiModelPlugin(cPtr, true);
  }

  
/** * @internal */ public
 SBase createObject(XMLInputStream stream) {
  return libsbml.DowncastSBase(libsbmlJNI.MultiModelPlugin_createObject(swigCPtr, this, XMLInputStream.getCPtr(stream), stream), false);
}

  
/**
   * Returns <code>true</code> if this object has all the required elements.
   <p>
   * @return <code>true</code> if this object has all the elements required by the
   * package specification; otherwise, <code>false</code> will be returned.
   */ public
 boolean hasRequiredElements() {
    return libsbmlJNI.MultiModelPlugin_hasRequiredElements(swigCPtr, this);
  }

  
/**
   * Returns the {@link ListOfMultiSpeciesTypes} in this plugin object.
   <p>
   * @return {@link ListOfMultiSpeciesTypes} object in this plugin object.
   */ public
 ListOfMultiSpeciesTypes getListOfMultiSpeciesTypes() {
    long cPtr = libsbmlJNI.MultiModelPlugin_getListOfMultiSpeciesTypes__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new ListOfMultiSpeciesTypes(cPtr, false);
  }

  
/**
   * Returns the {@link MultiSpeciesType} object that belongs to the given index. If the 
   * index is invalid, null is returned.
   <p>
   * @param n the index number of the {@link MultiSpeciesType} to get
   <p>
   * @return the nth {@link MultiSpeciesType} in the {@link ListOfMultiSpeciesTypes}
   * If the index <code>n</code> is invalid, <code>null</code> is returned.
   */ public
 MultiSpeciesType getMultiSpeciesType(long n) {
	return (MultiSpeciesType) libsbml.DowncastSBase(libsbmlJNI.MultiModelPlugin_getMultiSpeciesType__SWIG_0(swigCPtr, this, n), false);
}

  
/**
   * Returns the {@link MultiSpeciesType} object based on its identifier.
   <p>
   * @param sid a string representing the id of the {@link MultiSpeciesType} to get
   <p>
   * @return {@link MultiSpeciesType} in the {@link ListOfMultiSpeciesTypes} with the given id
   * or <code>null</code> if no such {@link MultiSpeciesType} exists.
   */ public
 MultiSpeciesType getMultiSpeciesType(String sid) {
	return (MultiSpeciesType) libsbml.DowncastSBase(libsbmlJNI.MultiModelPlugin_getMultiSpeciesType__SWIG_2(swigCPtr, this, sid), false);
}

  
/**
   * Adds a copy of the given {@link MultiSpeciesType} to the {@link ListOfMultiSpeciesTypes} in this plugin object.
   <p>
   * @param multiSpeciesType the multiSpeciesType to be added.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int addMultiSpeciesType(MultiSpeciesType multiSpeciesType) {
    return libsbmlJNI.MultiModelPlugin_addMultiSpeciesType(swigCPtr, this, MultiSpeciesType.getCPtr(multiSpeciesType), multiSpeciesType);
  }

  
/**
   * Creates a new {@link MultiSpeciesType} object and adds it to the {@link ListOfMultiSpeciesTypes} in this plugin object.
   <p>
   * @return the newly created {@link MultiSpeciesType} object.
   */ public
 MultiSpeciesType createMultiSpeciesType() {
	return (MultiSpeciesType) libsbml.DowncastSBase(libsbmlJNI.MultiModelPlugin_createMultiSpeciesType(swigCPtr, this), false);
}

  
/**
   * Creates a new {@link BindingSiteSpeciesType} object and adds it to the {@link ListOfMultiSpeciesTypes} in this plugin object.
   <p>
   * @return the newly created {@link BindingSiteSpeciesType} object.
   */ public
 BindingSiteSpeciesType createBindingSiteSpeciesType() {
    long cPtr = libsbmlJNI.MultiModelPlugin_createBindingSiteSpeciesType(swigCPtr, this);
    return (cPtr == 0) ? null : new BindingSiteSpeciesType(cPtr, false);
  }

  
/**
   * Removes the nth {@link MultiSpeciesType} object from this plugin object
   * and returns a pointer to it.
   <p>
   * The caller owns the returned object and is responsible for
   * deleting it.
   <p>
   * @param n the index of the {@link MultiSpeciesType} to remove
   <p>
   * @return the {@link MultiSpeciesType} object removed 
   * or <code>null</code> index was out of range.
   */ public
 MultiSpeciesType removeMultiSpeciesType(long n) {
	return (MultiSpeciesType) libsbml.DowncastSBase(libsbmlJNI.MultiModelPlugin_removeMultiSpeciesType__SWIG_0(swigCPtr, this, n), true);
}

  
/**
   * Removes the {@link MultiSpeciesType} object with the given id from this plugin object
   * and returns a pointer to it.
   <p>
   * The caller owns the returned object and is responsible for
   * deleting it.
   <p>
   * @param sid a string representing the id of the {@link MultiSpeciesType} to remove
   <p>
   * @return the {@link MultiSpeciesType} object removed 
   * or <code>null</code> if no such {@link MultiSpeciesType} exists.
   */ public
 MultiSpeciesType removeMultiSpeciesType(String sid) {
	return (MultiSpeciesType) libsbml.DowncastSBase(libsbmlJNI.MultiModelPlugin_removeMultiSpeciesType__SWIG_1(swigCPtr, this, sid), true);
}

  
/**
   * Returns the number of {@link MultiSpeciesType} objects in this plugin object.
   <p>
   * @return the number of {@link MultiSpeciesType} objects in this plugin object.
   */ public
 long getNumMultiSpeciesTypes() {
    return libsbmlJNI.MultiModelPlugin_getNumMultiSpeciesTypes(swigCPtr, this);
  }

  
/**
   * Creates a new {@link IntraSpeciesReaction} object and adds it to the {@link ListOfReactions}.
   <p>
   * @return the newly created {@link IntraSpeciesReaction} object.
   */ public
 IntraSpeciesReaction createIntraSpeciesReaction() {
    long cPtr = libsbmlJNI.MultiModelPlugin_createIntraSpeciesReaction(swigCPtr, this);
    return (cPtr == 0) ? null : new IntraSpeciesReaction(cPtr, false);
  }

  
/** * @internal */ public
 void connectToParent(SBase sbase) {
    libsbmlJNI.MultiModelPlugin_connectToParent(swigCPtr, this, SBase.getCPtr(sbase), sbase);
  }

  
/** * @internal */ public
 void enablePackageInternal(String pkgURI, String pkgPrefix, boolean flag) {
    libsbmlJNI.MultiModelPlugin_enablePackageInternal(swigCPtr, this, pkgURI, pkgPrefix, flag);
  }

}
