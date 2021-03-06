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

 The Render extension of the layout {@link GraphicalObject} class.
 <p>
 * The Render package extends the {@link GraphicalObject} object from the {@link Layout} package 
 * with the addition of the objectRole attribute, which specifies with which {@link Style}
 * the object should be rendered.
 */

public class RenderGraphicalObjectPlugin extends SBasePlugin {
   private long swigCPtr;

   protected RenderGraphicalObjectPlugin(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.RenderGraphicalObjectPlugin_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(RenderGraphicalObjectPlugin obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (RenderGraphicalObjectPlugin obj)
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
        libsbmlJNI.delete_RenderGraphicalObjectPlugin(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Constructor
   */ public
 RenderGraphicalObjectPlugin(String uri, String prefix, RenderPkgNamespaces groupsns) {
    this(libsbmlJNI.new_RenderGraphicalObjectPlugin__SWIG_0(uri, prefix, RenderPkgNamespaces.getCPtr(groupsns), groupsns), true);
  }

  
/**
   * Copy constructor. Creates a copy of this {@link SBase} object.
   */ public
 RenderGraphicalObjectPlugin(RenderGraphicalObjectPlugin orig) {
    this(libsbmlJNI.new_RenderGraphicalObjectPlugin__SWIG_1(RenderGraphicalObjectPlugin.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link RenderGraphicalObjectPlugin}  object.
   <p>
   * @return a (deep) copy of this {@link RenderGraphicalObjectPlugin} object
   */ public
 SBasePlugin cloneObject() {
    long cPtr = libsbmlJNI.RenderGraphicalObjectPlugin_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new RenderGraphicalObjectPlugin(cPtr, true);
  }

  
/** * @internal */ public
 void addExpectedAttributes(SWIGTYPE_p_ExpectedAttributes attributes) {
    libsbmlJNI.RenderGraphicalObjectPlugin_addExpectedAttributes(swigCPtr, this, SWIGTYPE_p_ExpectedAttributes.getCPtr(attributes));
  }

  
/** * @internal */ public
 void readAttributes(XMLAttributes attributes, SWIGTYPE_p_ExpectedAttributes expectedAttributes) {
    libsbmlJNI.RenderGraphicalObjectPlugin_readAttributes(swigCPtr, this, XMLAttributes.getCPtr(attributes), attributes, SWIGTYPE_p_ExpectedAttributes.getCPtr(expectedAttributes));
  }

  
/** * @internal */ public
 void writeAttributes(XMLOutputStream stream) {
    libsbmlJNI.RenderGraphicalObjectPlugin_writeAttributes(swigCPtr, this, XMLOutputStream.getCPtr(stream), stream);
  }

  
/**
     * Returns the object role string for the object.
     */ public
 String getObjectRole() {
    return libsbmlJNI.RenderGraphicalObjectPlugin_getObjectRole(swigCPtr, this);
  }

  
/**
     * Sets the object role string for the object.
     */ public
 void setObjectRole(String role) {
    libsbmlJNI.RenderGraphicalObjectPlugin_setObjectRole(swigCPtr, this, role);
  }

  
/**
     * Returns whether the object role has been set or not.
     */ public
 boolean isSetObjectRole() {
    return libsbmlJNI.RenderGraphicalObjectPlugin_isSetObjectRole(swigCPtr, this);
  }

}
