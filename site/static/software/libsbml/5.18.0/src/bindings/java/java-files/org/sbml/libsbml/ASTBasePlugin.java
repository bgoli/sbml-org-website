/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 *  Base class for extensions that plug into AST classes.
 <p>
 * <p style='color: #777; font-style: italic'>
This class of objects is defined by libSBML only and has no direct
equivalent in terms of SBML components.  This class is not prescribed by
the SBML specifications, although it is used to implement features
defined in SBML.
</p>

 * @internal
 */

public class ASTBasePlugin {
   private long swigCPtr;
   protected boolean swigCMemOwn;

   protected ASTBasePlugin(long cPtr, boolean cMemoryOwn)
   {
     swigCMemOwn = cMemoryOwn;
     swigCPtr    = cPtr;
   }

   protected static long getCPtr(ASTBasePlugin obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (ASTBasePlugin obj)
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
        libsbmlJNI.delete_ASTBasePlugin(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public String getStringFor(int type) {
    return libsbmlJNI.ASTBasePlugin_getStringFor(swigCPtr, this, type);
  }

  public String getConstCharFor(int type) {
    return libsbmlJNI.ASTBasePlugin_getConstCharFor(swigCPtr, this, type);
  }

  public String getConstCharCsymbolURLFor(int type) {
    return libsbmlJNI.ASTBasePlugin_getConstCharCsymbolURLFor(swigCPtr, this, type);
  }

  public int getASTNodeTypeFor(String symbol) {
    return libsbmlJNI.ASTBasePlugin_getASTNodeTypeFor(swigCPtr, this, symbol);
  }

  public int getASTNodeTypeForCSymbolURL(String url) {
    return libsbmlJNI.ASTBasePlugin_getASTNodeTypeForCSymbolURL(swigCPtr, this, url);
  }

  public boolean hasCorrectNamespace(SBMLNamespaces namespaces) {
    return libsbmlJNI.ASTBasePlugin_hasCorrectNamespace(swigCPtr, this, SBMLNamespaces.getCPtr(namespaces), namespaces);
  }

  public boolean defines(int type) {
    return libsbmlJNI.ASTBasePlugin_defines__SWIG_0(swigCPtr, this, type);
  }

  public boolean defines(String name, boolean strCmpIsCaseSensitive) {
    return libsbmlJNI.ASTBasePlugin_defines__SWIG_1(swigCPtr, this, name, strCmpIsCaseSensitive);
  }

  public boolean defines(String name) {
    return libsbmlJNI.ASTBasePlugin_defines__SWIG_2(swigCPtr, this, name);
  }

  public boolean isFunction(int type) {
    return libsbmlJNI.ASTBasePlugin_isFunction(swigCPtr, this, type);
  }

  public boolean isLogical(int type) {
    return libsbmlJNI.ASTBasePlugin_isLogical(swigCPtr, this, type);
  }

  public boolean isMathMLNodeTag(String node) {
    return libsbmlJNI.ASTBasePlugin_isMathMLNodeTag__SWIG_0(swigCPtr, this, node);
  }

  public boolean isMathMLNodeTag(int type) {
    return libsbmlJNI.ASTBasePlugin_isMathMLNodeTag__SWIG_1(swigCPtr, this, type);
  }

  public int getExtendedMathType() {
    return libsbmlJNI.ASTBasePlugin_getExtendedMathType(swigCPtr, this);
  }

  public double evaluateASTNode(ASTNode node, Model m) {
    return libsbmlJNI.ASTBasePlugin_evaluateASTNode__SWIG_0(swigCPtr, this, ASTNode.getCPtr(node), node, Model.getCPtr(m), m);
  }

  public double evaluateASTNode(ASTNode node) {
    return libsbmlJNI.ASTBasePlugin_evaluateASTNode__SWIG_1(swigCPtr, this, ASTNode.getCPtr(node), node);
  }

  public UnitDefinition getUnitDefinitionFromPackage(SWIGTYPE_p_UnitFormulaFormatter uff, ASTNode node, boolean inKL, int reactNo) {
    long cPtr = libsbmlJNI.ASTBasePlugin_getUnitDefinitionFromPackage(swigCPtr, this, SWIGTYPE_p_UnitFormulaFormatter.getCPtr(uff), ASTNode.getCPtr(node), node, inKL, reactNo);
    return (cPtr == 0) ? null : new UnitDefinition(cPtr, false);
  }

  public ASTNodeValues_t getASTNodeValue(long n) {
    long cPtr = libsbmlJNI.ASTBasePlugin_getASTNodeValue(swigCPtr, this, n);
    return (cPtr == 0) ? null : new ASTNodeValues_t(cPtr, false);
  }

  
/** * @internal */ public
 int allowedInFunctionDefinition(int type) {
    return libsbmlJNI.ASTBasePlugin_allowedInFunctionDefinition(swigCPtr, this, type);
  }

  
/** * @internal */ public
 ASTBasePlugin cloneObject() {
  return libsbml.DowncastASTBasePlugin(libsbmlJNI.ASTBasePlugin_cloneObject(swigCPtr, this), true);
}

  
/** * @internal */ public
 String getElementNamespace() {
    return libsbmlJNI.ASTBasePlugin_getElementNamespace(swigCPtr, this);
  }

  
/** * @internal */ public
 String getPrefix() {
    return libsbmlJNI.ASTBasePlugin_getPrefix(swigCPtr, this);
  }

  
/** * @internal */ public
 String getPackageName() {
    return libsbmlJNI.ASTBasePlugin_getPackageName(swigCPtr, this);
  }

  
/** * @internal */ public
 int setSBMLExtension(SBMLExtension ext) {
    return libsbmlJNI.ASTBasePlugin_setSBMLExtension(swigCPtr, this, SBMLExtension.getCPtr(ext), ext);
  }

  
/** * @internal */ public
 int setPrefix(String prefix) {
    return libsbmlJNI.ASTBasePlugin_setPrefix(swigCPtr, this, prefix);
  }

  
/** * @internal */ public
 void connectToParent(ASTNode astbase) {
    libsbmlJNI.ASTBasePlugin_connectToParent(swigCPtr, this, ASTNode.getCPtr(astbase), astbase);
  }

  
/** * @internal */ public
 void enablePackageInternal(String pkgURI, String pkgPrefix, boolean flag) {
    libsbmlJNI.ASTBasePlugin_enablePackageInternal(swigCPtr, this, pkgURI, pkgPrefix, flag);
  }

  
/** * @internal */ public
 boolean stripPackage(String pkgPrefix, boolean flag) {
    return libsbmlJNI.ASTBasePlugin_stripPackage(swigCPtr, this, pkgPrefix, flag);
  }

  
/** * @internal */ public
 String getURI() {
    return libsbmlJNI.ASTBasePlugin_getURI(swigCPtr, this);
  }

  
/** * @internal */ public
 ASTNode getParentASTObject() {
    long cPtr = libsbmlJNI.ASTBasePlugin_getParentASTObject__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new ASTNode(cPtr, false);
  }

  
/** * @internal */ public
 int setElementNamespace(String uri) {
    return libsbmlJNI.ASTBasePlugin_setElementNamespace(swigCPtr, this, uri);
  }

  
/** * @internal */ public
 long getLevel() {
    return libsbmlJNI.ASTBasePlugin_getLevel(swigCPtr, this);
  }

  
/** * @internal */ public
 long getVersion() {
    return libsbmlJNI.ASTBasePlugin_getVersion(swigCPtr, this);
  }

  
/** * @internal */ public
 long getPackageVersion() {
    return libsbmlJNI.ASTBasePlugin_getPackageVersion(swigCPtr, this);
  }

  
/** * @internal */ public
 SBMLNamespaces getSBMLNamespaces() {
  return libsbml.DowncastSBMLNamespaces(libsbmlJNI.ASTBasePlugin_getSBMLNamespaces(swigCPtr, this), false);
}

  
/** * @internal */ public
 void renameSIdRefs(String oldid, String newid) {
    libsbmlJNI.ASTBasePlugin_renameSIdRefs(swigCPtr, this, oldid, newid);
  }

  
/** * @internal */ public
 void renameUnitSIdRefs(String oldid, String newid) {
    libsbmlJNI.ASTBasePlugin_renameUnitSIdRefs(swigCPtr, this, oldid, newid);
  }

  
/** * @internal */ public
 void replaceIDWithFunction(String id, ASTNode function) {
    libsbmlJNI.ASTBasePlugin_replaceIDWithFunction(swigCPtr, this, id, ASTNode.getCPtr(function), function);
  }

  
/** * @internal */ public
 int checkNumArguments(ASTNode function, SWIGTYPE_p_std__stringstream error) {
    return libsbmlJNI.ASTBasePlugin_checkNumArguments(swigCPtr, this, ASTNode.getCPtr(function), function, SWIGTYPE_p_std__stringstream.getCPtr(error));
  }

  
/** * @internal */ public
 int getL3PackageInfixPrecedence() {
    return libsbmlJNI.ASTBasePlugin_getL3PackageInfixPrecedence(swigCPtr, this);
  }

  
/** * @internal */ public
 boolean hasCorrectNumArguments(ASTNode function) {
    return libsbmlJNI.ASTBasePlugin_hasCorrectNumArguments(swigCPtr, this, ASTNode.getCPtr(function), function);
  }

  
/** * @internal */ public
 boolean hasPackageOnlyInfixSyntax() {
    return libsbmlJNI.ASTBasePlugin_hasPackageOnlyInfixSyntax(swigCPtr, this);
  }

  
/** * @internal */ public
 boolean hasUnambiguousPackageInfixGrammar(ASTNode child) {
    return libsbmlJNI.ASTBasePlugin_hasUnambiguousPackageInfixGrammar(swigCPtr, this, ASTNode.getCPtr(child), child);
  }

  
/** * @internal */ public
 boolean isPackageInfixFunction() {
    return libsbmlJNI.ASTBasePlugin_isPackageInfixFunction(swigCPtr, this);
  }

}
