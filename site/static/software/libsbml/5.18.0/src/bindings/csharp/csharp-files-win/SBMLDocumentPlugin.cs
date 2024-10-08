//------------------------------------------------------------------------------
// <auto-generated />
//
// This file was automatically generated by SWIG (http://www.swig.org).
// Version 3.0.12
//
// Do not make changes to this file unless you know what you are doing--modify
// the SWIG interface file instead.
//------------------------------------------------------------------------------

namespace libsbml {

 using System;
 using System.Runtime.InteropServices;

/** 
 * @sbmlpackage{core}
 *
@htmlinclude pkg-marker-core.html Base class for extending SBMLDocument in packages.
 *
 * @htmlinclude not-sbml-warning.html
 *
 * The SBMLDocumentPlugin class is a specialization of SBasePlugin
 * designed specifically for extending SBMLDocument.  All package
 * extensions must extend SBMLDocument to implement support for SBML
 * Level&nbsp;3 packages; these extensions can be subclasses of this
 * class or from a derived class of this class.
 *
 * All packages must additionally define a
 * required flag named <code>required</code>, which indicates whether 
 * that package's constructs can be used to change the core mathematics of the
 * <code>&lt;model&gt;</code> child of the <code>&lt;sbml&gt;</code> element.
 * If they can, this attribute must be set @c true, and if they cannot, this 
 * attribute must be set @c false.
 *
 * @if clike
 * @section sbmldocumentplugin-howto How to extend SBMLDocumentPlugin for a package implementation
 *
 * 
 * The following subsections detail the basic steps necessary to use
 * SBMLDocumentPlugin to extend SBMLDocument for a given package extension.
 *
 *
 * @subsection sdp-identify 1. Identify the changes necessary to SBMLDocument
 *
 * The specification for a SBML Level&nbsp;3 package will define the
 * changes to the SBML <code>&lt;sbml&gt;</code> element.  Packages
 * typically do not make any changes beyond adding an attribute named
 * 'required' (discussed below), so in most cases, the extension of
 * SBMLDocument is very simple.  However, some packages do more.  For
 * instance, the Hierarchical %Model Composition package adds subobjects
 * for lists of model definitions.  SBMLDocumentPlugin supports all these
 * cases.
 *
 *
 * @subsection sdp-implement 2. Create the SBMLDocumentPlugin subclass
 *
 * A package extension will only define one subclass of SBMLDocumentPlugin.
 * Below, we describe in detail the different parts of a subclass
 * definition.
 *
 *
 * @subsubsection sdp-class  2.1 Override SBasePlugin class-related methods
 *
 * The derived class must override the constructor, copy constructor, assignment
 * operator (<code>operator=</code>) and <code>clone()</code> methods from
 * SBasePlugin.
 *
 *
 * @subsubsection sdp-required 2.2 Determine the necessary value of the 'required' attribute
 *
 * At minimum, it is necessary for a package implementation to add the
 * 'required' attribute to the SBML <code>&lt;sbml&gt;</code> element
 * mandated by SBML for all Level&nbsp;3 packages, and this is done using
 * this class as a base.  If the 'required' attribute is the @em only
 * addition necessary for a particular SBML Level&nbsp;3 package, then the
 * subclass of SBMLDocumentPlugin for the package can have a very simple
 * implementation.  Some Level&nbsp;3 packages add additional attributes or
 * elements to <code>&lt;sbml&gt;</code>, and their implementations would
 * go into the subclassed SBMLDocumentPlugin.
 *
 * SBMLDocumentPlugin provides methods with default implementations that
 * support managing the 'required' attribute, so package extension code
 * does not need to provide implementations&mdash;they only need to set the
 * correct value for the SBML Level&nbsp;3 package based on its
 * specification.  The following are the virtual methods for working with
 * the 'required' attribute.  Package extensions would only need to
 * override them in special circumstances:
 *
 * @li <code>setRequired(bool value)</code>: This method sets the value
 * of the flag.
 *
 * @li <code>getRequired()</code>: This method gets the value of the
 * 'required' flag.
 *
 * @li <code>isSetRequired()</code>: This method tests if the value has
 * been set.
 *
 * @li <code>unsetRequired()</code>: This method unsets the value of the
 * 'required' flag.
 *
 *
 * @subsubsection sdp-protected 2.3 Define protected data members
 *
 * An extended SBMLDocument object may need more than just the 'required'
 * attribute, depending on what is defined in the specification for the
 * package being implemented.  Data attributes on the extended
 * <code>&lt;sbml&gt;</code> object in an SBML package will have one of the
 * data types <code>string</code>, <code>double</code>,
 * <code>int</code>, or <code>bool</code>.  Subelements/subobjects will
 * normally be derived from the ListOf class or from SBase.
 *
 * The additional data members must be properly initialized in the class
 * constructor, and must be properly copied in the copy constructor and
 * assignment operator.
 *
 *
 * @subsubsection sdp-methods-attribs 2.4 Override virtual methods for attributes
 *
 * If the extended component is defined by the SBML Level&nbsp;3 package to
 * have attributes, then the extended SBMLDocumentPlugin class definition
 * needs to override the following internal methods that come from
 * SBasePlugin (the base class of SBMLDocumentPlugin) and provide
 * appropriate implementations:
 *
 * @li <code>addExpectedAttributes(ExpectedAttributes& attributes)</code>: This
 * method should add the attributes that are expected to be found on this kind
 * of extended component in an SBML file or data stream.
 *
 * @li <code>readAttributes(XMLAttributes attributes, ExpectedAttributes&
 * expectedAttributes)</code>: This method should read the attributes
 * expected to be found on this kind of extended component in an SBML file or
 * data stream.
 *
 * @li <code>hasRequiredAttributes()</code>: This method should return @c true
 * if all of the required attribute for this extended component are present on
 * instance of the object.
 *
 * @li <code>writeAttributes(XMLOutputStream stream)</code>: This method should
 * write out the attributes of an extended component.  The implementation should
 * use the different kinds of <code>writeAttribute</code> methods defined by
 * XMLOutputStream to achieve this.
 *
 *
 * @subsubsection sdp-methods-elem 2.5 Override virtual methods for subcomponents
 *
 * If the extended component is defined by the Level&nbsp;3 package to have
 * subcomponents (i.e., full XML elements rather than mere attributes),
 * then the extended class definition needs to override the following
 * internal methods on SBasePlugin (the base class of SBMLDocumentPlugin)
 * and provide appropriate implementations:
 *
 * @li <code>createObject(XMLInputStream stream)</code>: Subclasses must
 * override this method to create, store, and then return an SBML object
 * corresponding to the next XMLToken in the XMLInputStream.  To do this,
 * implementations can use methods like <code>peek()</code> on XMLInputStream to
 * test if the next object in the stream is something expected for the package.
 * For example, LayoutModelPlugin uses <code>peek()</code> to examine the next
 * element in the input stream, then tests that element against the Layout
 * namespace and the element name <code>'listOfLayouts'</code> to see if it's
 * the single subcomponent (ListOfLayouts) permitted on a Model object using the
 * Layout package.  If it is, it returns the appropriate object.
 *
 * @li <code>connectToParent(SBase sbase)</code>: This creates a parent-child
 * relationship between a given extended component and its subcomponent(s).
 *
 * @li <code>setSBMLDocument(SBMLDocument d)</code>: This method should set the
 * parent SBMLDocument object on the subcomponent object instances, so that the
 * subcomponent instances know which SBMLDocument contains them.
 *
 * @li <code>enablePackageInternal(string& pkgURI, string& pkgPrefix,
 * bool flag)</code>: This method should enable or disable the subcomponent
 * based on whether a given XML namespace is active.
 *
 * @li <code>writeElements(XMLOutputStream stream)</code>: This method must be
 * overridden to provide an implementation that will write out the expected
 * subcomponents/subelements to the XML output stream.
 *
 * @li <code>readOtherXML(SBase parentObject, XMLInputStream stream)</code>:
 * This function should be overridden if elements of annotation, notes, MathML
 * content, etc., need to be directly parsed from the given XMLInputStream
 * object.
 *
 * @li <code>hasRequiredElements()</code>: This method should return @c true if
 * a given object contains all the required subcomponents defined by the
 * specification for that SBML Level&nbsp;3 package.
 *
 *
 * @subsubsection sdp-methods-xmlns 2.6 Override virtual methods for XML namespaces
 *
 * If the package needs to add additional <code>xmlns</code> attributes to
 * declare additional XML namespace URIs, the extended class should
 * override the following method coming from SBasePlugin (the parent class
 * of SBMLDocumentPlugin):
 *
 * @li <code>writeXMLNS(XMLOutputStream stream)</code>: This method should
 * write out any additional XML namespaces that might be needed by a package
 * implementation.
 *
 *
 * @subsubsection sdp-methods-hooks 2.7 Implement additional methods as needed
 *
 * Extended SBMLDocumentPlugin implementations can add whatever additional
 * utility methods are useful for their implementation.
 *
 *
 * @else
 *
 * @section ext-basics Basic principles of SBML package extensions in libSBML
 *
 * 
 * SBML Level&nbsp;3's package structure permits modular extensions to the
 * core SBML format.  In libSBML, support for SBML Level&nbsp;3 packages is
 * provided through optional <em>package extensions</em> that can be plugged
 * into libSBML at the time it is built/compiled.  Users of libSBML can thus
 * choose which extensions are enabled in their software applications.
 *
 * LibSBML defines a number of classes that developers of package extensions
 * can use to implement support for an SBML Level&nbsp;3 package.  These
 * classes make it easier to extend libSBML objects with new attributes
 * and/or subobjects as needed by a particular Level&nbsp;3 package.
 * Three overall categories of classes make up libSBML's facilities for
 * implementing package extensions.  There are (1) classes that serve as base
 * classes meant to be subclassed, (2) template classes meant to be
 * instantiated rather than subclassed, and (3) support classes that provide
 * utility features. A given package implementation for libSBML will take
 * the form of code using these and other libSBML classes, placed in a
 * subdirectory of <code>src/sbml/packages/</code>.
 *
 * The basic libSBML distribution includes a number of package extensions
 * implementing support for officially-endorsed SBML Level&nbsp;3 packages;
 * among these are <em>Flux Balance Constraints</em> ('fbc'),
 * <em>Hierarchical %Model Composition</em> ('comp'), <em>%Layout</em>
 * ('layout'), and <em>Qualitative Models</em> ('qual').  They can serve as
 * working examples for developers working to implement other packages.
 *
 * Extensions in libSBML can currently only be implemented in C++ or C;
 * there is no mechanism to implement them first in languages such as
 * Java or Python.  However, once implemented in C++ or C, language
 * interfaces can be generated semi-automatically using the framework in
 * place in libSBML.  (The approach is based on using <a target='_blank'
 * href='http://www.swig.org'>SWIG</a> and facilities in libSBML's build
 * system.)
 *
 *
 * @endif
 */

public class SBMLDocumentPlugin : SBasePlugin {
	private HandleRef swigCPtr;
	
	internal SBMLDocumentPlugin(IntPtr cPtr, bool cMemoryOwn) : base(libsbmlPINVOKE.SBMLDocumentPlugin_SWIGUpcast(cPtr), cMemoryOwn)
	{
		//super(libsbmlPINVOKE.SBMLDocumentPluginUpcast(cPtr), cMemoryOwn);
		swigCPtr = new HandleRef(this, cPtr);
	}
	
	internal static HandleRef getCPtr(SBMLDocumentPlugin obj)
	{
		return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
	}
	
	internal static HandleRef getCPtrAndDisown (SBMLDocumentPlugin obj)
	{
		HandleRef ptr = new HandleRef(null, IntPtr.Zero);
		
		if (obj != null)
		{
			ptr             = obj.swigCPtr;
			obj.swigCMemOwn = false;
		}
		
		return ptr;
	}

  ~SBMLDocumentPlugin() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          libsbmlPINVOKE.delete_SBMLDocumentPlugin(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  
/**
   * Creates a new SBMLDocumentPlugin object using the given parameters.
   *
   *
 * 
 * In the XML representation of an SBML document, XML namespaces are used to
 * identify the origin of each XML construct used.  XML namespaces are
 * identified by their unique resource identifiers (URIs).  The core SBML
 * specifications stipulate the namespaces that must be used for core SBML
 * constructs; for example, all XML elements that belong to SBML Level&nbsp;3
 * Version&nbsp;1 Core must be placed in the XML namespace identified by the URI
 * <code>'http://www.sbml.org/sbml/level3/version1/core'</code>.  Individual
 * SBML Level&nbsp;3 packages define their own XML namespaces; for example,
 * all elements belonging to the SBML Level&nbsp;3 %Layout Version&nbsp;1
 * package must be placed in the XML namespace
 * <code>'http://www.sbml.org/sbml/level3/version1/layout/version1/'</code>.
 *
 *
   *
   *
 * 
 * The SBMLNamespaces object encapsulates SBML Level/Version/namespaces
 * information.  It is used to communicate the SBML Level, Version, and (in
 * Level&nbsp;3) packages used in addition to SBML Level&nbsp;3 Core.  A
 * common approach to using libSBML's SBMLNamespaces facilities is to create an
 * SBMLNamespaces object somewhere in a program once, then hand that object
 * as needed to object constructors that accept SBMLNamespaces as arguments.
 *
 *
   *
   * @param uri the URI of the SBML Level&nbsp;3 package implemented by
   * this libSBML package extension.
   *
   * @param prefix the XML namespace prefix being used for the package.
   *
   * @param sbmlns the SBMLNamespaces object for the package.
   */ public
 SBMLDocumentPlugin(string uri, string prefix, SBMLNamespaces sbmlns) : this(libsbmlPINVOKE.new_SBMLDocumentPlugin__SWIG_0(uri, prefix, SBMLNamespaces.getCPtr(sbmlns)), true) {
  }

  
/**
   * Copy constructor.
   *
   * This creates a copy of this object.
   *
   * @param orig the SBMLDocumentPlugin instance to copy.
   */ public
 SBMLDocumentPlugin(SBMLDocumentPlugin orig) : this(libsbmlPINVOKE.new_SBMLDocumentPlugin__SWIG_1(SBMLDocumentPlugin.getCPtr(orig)), true) {
    if (libsbmlPINVOKE.SWIGPendingException.Pending) throw libsbmlPINVOKE.SWIGPendingException.Retrieve();
  }

  
/**
   * Creates and returns a deep copy of this SBMLDocumentPlugin object.
   *
   * @return the (deep) copy of this SBMLDocumentPlugin object.
   */ public new
 SBasePlugin clone() {
    global::System.IntPtr cPtr = libsbmlPINVOKE.SBMLDocumentPlugin_clone(swigCPtr);
    SBMLDocumentPlugin ret = (cPtr == global::System.IntPtr.Zero) ? null : new SBMLDocumentPlugin(cPtr, true);
    return ret;
  }

  
/**
   * Sets the SBML 'required' attribute value.
   *
   *
 * 
 * SBML Level&nbsp;3 requires that every package defines an attribute named
 * 'required' on the root <code>&lt;sbml&gt;</code> element in an SBML file
 * or data stream.  The attribute, being in the namespace of the Level&nbsp;3
 * package in question, must be prefixed by the XML namespace prefix
 * associated with the package.  The value of the 'required' attribute
 * indicates whether constructs in that package may change the mathematical
 * interpretation of constructs defined in SBML Level&nbsp;3 Core.  A
 * 'required' value of @c true indicates that the package may do so.  The
 * value of the attribute is set by the Level&nbsp;3 package specification,
 * and does @em not depend on the actual presence or absence of particular
 * package constructs in a given SBML document: in other words, if the
 * package specification defines any construct that can change the model's
 * meaning, the value of the 'required' attribute must always be set to
 * @c true in any SBML document that uses the package.
 *
 * The XML namespace declaration for an SBML Level&nbsp;3 package is an
 * indication that a model makes use of features defined by that package,
 * while the 'required' attribute indicates whether the features may be
 * ignored without compromising the mathematical meaning of the model.  Both
 * are necessary for a complete reference to an SBML Level&nbsp;3 package.
 *
 *
   *
   * @param value the value to be assigned to the 'required' attribute.
   * The 'required' attribute takes a Boolean value, either @c true or
   * @c false.
   *
   *
 * @return integer value indicating success/failure of the
 * function.  @if clike The value is drawn from the
 * enumeration #OperationReturnValues_t. @endif The possible values
 * returned by this function are:
 * @li @link libsbml#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS@endlink
   * @li @link libsbml#LIBSBML_UNEXPECTED_ATTRIBUTE LIBSBML_UNEXPECTED_ATTRIBUTE@endlink
   *
   * @see getRequired()
   * @see isSetRequired()
   * @see unsetRequired()
   */ public new
 int setRequired(bool value) {
    int ret = libsbmlPINVOKE.SBMLDocumentPlugin_setRequired(swigCPtr, value);
    return ret;
  }

  
/**
   * Returns the value of the 'required' attribute.
   *
   *
 * 
 * SBML Level&nbsp;3 requires that every package defines an attribute named
 * 'required' on the root <code>&lt;sbml&gt;</code> element in an SBML file
 * or data stream.  The attribute, being in the namespace of the Level&nbsp;3
 * package in question, must be prefixed by the XML namespace prefix
 * associated with the package.  The value of the 'required' attribute
 * indicates whether constructs in that package may change the mathematical
 * interpretation of constructs defined in SBML Level&nbsp;3 Core.  A
 * 'required' value of @c true indicates that the package may do so.  The
 * value of the attribute is set by the Level&nbsp;3 package specification,
 * and does @em not depend on the actual presence or absence of particular
 * package constructs in a given SBML document: in other words, if the
 * package specification defines any construct that can change the model's
 * meaning, the value of the 'required' attribute must always be set to
 * @c true in any SBML document that uses the package.
 *
 * The XML namespace declaration for an SBML Level&nbsp;3 package is an
 * indication that a model makes use of features defined by that package,
 * while the 'required' attribute indicates whether the features may be
 * ignored without compromising the mathematical meaning of the model.  Both
 * are necessary for a complete reference to an SBML Level&nbsp;3 package.
 *
 *
   *
   * @return the bool value of 'required' attribute for the SBML package.
   *
   * @see setRequired(bool value)
   * @see isSetRequired()
   * @see unsetRequired()
   */ public new
 bool getRequired() {
    bool ret = libsbmlPINVOKE.SBMLDocumentPlugin_getRequired(swigCPtr);
    return ret;
  }

  
/**
   * Returns the value of the 'required' attribute.
   *
   *
 * 
 * SBML Level&nbsp;3 requires that every package defines an attribute named
 * 'required' on the root <code>&lt;sbml&gt;</code> element in an SBML file
 * or data stream.  The attribute, being in the namespace of the Level&nbsp;3
 * package in question, must be prefixed by the XML namespace prefix
 * associated with the package.  The value of the 'required' attribute
 * indicates whether constructs in that package may change the mathematical
 * interpretation of constructs defined in SBML Level&nbsp;3 Core.  A
 * 'required' value of @c true indicates that the package may do so.  The
 * value of the attribute is set by the Level&nbsp;3 package specification,
 * and does @em not depend on the actual presence or absence of particular
 * package constructs in a given SBML document: in other words, if the
 * package specification defines any construct that can change the model's
 * meaning, the value of the 'required' attribute must always be set to
 * @c true in any SBML document that uses the package.
 *
 * The XML namespace declaration for an SBML Level&nbsp;3 package is an
 * indication that a model makes use of features defined by that package,
 * while the 'required' attribute indicates whether the features may be
 * ignored without compromising the mathematical meaning of the model.  Both
 * are necessary for a complete reference to an SBML Level&nbsp;3 package.
 *
 *
   *
   * @return @c true if the 'required' attribute of this SBMLDocument
   * has been set to @c true, @c false otherwise.
   */ public new
 bool isSetRequired() {
    bool ret = libsbmlPINVOKE.SBMLDocumentPlugin_isSetRequired(swigCPtr);
    return ret;
  }

  
/**
   * Unsets the value of the 'required' attribute of this SBMLDocumentPlugin.
   *
   *
 * @return integer value indicating success/failure of the
 * function.  @if clike The value is drawn from the
 * enumeration #OperationReturnValues_t. @endif The possible values
 * returned by this function are:
 * @li @link libsbml#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS@endlink
   */ public new
 int unsetRequired() {
    int ret = libsbmlPINVOKE.SBMLDocumentPlugin_unsetRequired(swigCPtr);
    return ret;
  }

  
/** */ /* libsbml-internal */ public new
 bool isCompFlatteningImplemented() {
    bool ret = libsbmlPINVOKE.SBMLDocumentPlugin_isCompFlatteningImplemented(swigCPtr);
    return ret;
  }

  
/** */ /* libsbml-internal */ public new
 long checkConsistency() { return (long)libsbmlPINVOKE.SBMLDocumentPlugin_checkConsistency(swigCPtr); }

}

}
