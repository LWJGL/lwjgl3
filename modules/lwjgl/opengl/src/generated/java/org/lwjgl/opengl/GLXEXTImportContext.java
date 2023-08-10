/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/GLX_EXT_import_context.txt">GLX_EXT_import_context</a> extension.
 * 
 * <p>This extension allows multiple X clients to share an indirect rendering context.</p>
 * 
 * <p>Additional convenience procedures to get the current Display* bound to a context as well as other context information are also added.</p>
 */
public class GLXEXTImportContext {

    /** Accepted by the {@code attribute} parameter of {@link #glXQueryContextInfoEXT QueryContextInfoEXT}. */
    public static final int
        GLX_SHARE_CONTEXT_EXT = 0x800A,
        GLX_VISUAL_ID_EXT     = 0x800B,
        GLX_SCREEN_EXT        = 0x800C;

    protected GLXEXTImportContext() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXGetCurrentDisplayEXT ] ---

    /** Returns the display associated with the current context. */
    @NativeType("Display *")
    public static long glXGetCurrentDisplayEXT() {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetCurrentDisplayEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(__functionAddress);
    }

    // --- [ glXQueryContextInfoEXT ] ---

    /** Unsafe version of: {@link #glXQueryContextInfoEXT QueryContextInfoEXT} */
    public static int nglXQueryContextInfoEXT(long display, long context, int attribute, long value) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryContextInfoEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(context);
        }
        return callPPPI(display, context, attribute, value, __functionAddress);
    }

    /**
     * Obtains the value of a context's attribute.
     *
     * @param display   the connection to the X server
     * @param context   the context being queried
     * @param attribute the attribute to query
     * @param value     returns the attribute value
     */
    public static int glXQueryContextInfoEXT(@NativeType("Display *") long display, @NativeType("GLXContext") long context, int attribute, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nglXQueryContextInfoEXT(display, context, attribute, memAddress(value));
    }

    // --- [ glXGetContextIDEXT ] ---

    /**
     * Returns the XID of a GLXContext.
     *
     * @param context the context
     */
    @NativeType("GLXContextID")
    public static long glXGetContextIDEXT(@NativeType("GLXContext const") long context) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetContextIDEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPN(context, __functionAddress);
    }

    // --- [ glXImportContextEXT ] ---

    /**
     * May be used in place of glXCreateContext to share another process's indirect rendering context.
     *
     * @param display   the connection to the X server
     * @param contextID the context XID
     */
    @NativeType("GLXContext")
    public static long glXImportContextEXT(@NativeType("Display *") long display, @NativeType("GLXContextID") long contextID) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXImportContextEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
        }
        return callPNP(display, contextID, __functionAddress);
    }

    // --- [ glXFreeContextEXT ] ---

    /**
     * Frees the client-side part of a GLXContext that was created  with {@link #glXImportContextEXT ImportContextEXT}.
     *
     * @param display the connection to the X server
     * @param context the context to free
     */
    public static void glXFreeContextEXT(@NativeType("Display *") long display, @NativeType("GLXContext") long context) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXFreeContextEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(context);
        }
        callPPV(display, context, __functionAddress);
    }

    /** Array version of: {@link #glXQueryContextInfoEXT QueryContextInfoEXT} */
    public static int glXQueryContextInfoEXT(@NativeType("Display *") long display, @NativeType("GLXContext") long context, int attribute, @NativeType("int *") int[] value) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryContextInfoEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(context);
            check(value, 1);
        }
        return callPPPI(display, context, attribute, value, __functionAddress);
    }

}