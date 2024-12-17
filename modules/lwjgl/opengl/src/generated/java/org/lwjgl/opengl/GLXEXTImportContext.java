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

public class GLXEXTImportContext {

    public static final int
        GLX_SHARE_CONTEXT_EXT = 0x800A,
        GLX_VISUAL_ID_EXT     = 0x800B,
        GLX_SCREEN_EXT        = 0x800C;

    protected GLXEXTImportContext() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXGetCurrentDisplayEXT ] ---

    /** {@code Display * glXGetCurrentDisplayEXT(void)} */
    @NativeType("Display *")
    public static long glXGetCurrentDisplayEXT() {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetCurrentDisplayEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(__functionAddress);
    }

    // --- [ glXQueryContextInfoEXT ] ---

    /** {@code int glXQueryContextInfoEXT(Display * display, GLXContext context, int attribute, int * value)} */
    public static int nglXQueryContextInfoEXT(long display, long context, int attribute, long value) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXQueryContextInfoEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(context);
        }
        return callPPPI(display, context, attribute, value, __functionAddress);
    }

    /** {@code int glXQueryContextInfoEXT(Display * display, GLXContext context, int attribute, int * value)} */
    public static int glXQueryContextInfoEXT(@NativeType("Display *") long display, @NativeType("GLXContext") long context, int attribute, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nglXQueryContextInfoEXT(display, context, attribute, memAddress(value));
    }

    // --- [ glXGetContextIDEXT ] ---

    /** {@code GLXContextID glXGetContextIDEXT(GLXContext const context)} */
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

    /** {@code GLXContext glXImportContextEXT(Display * display, GLXContextID contextID)} */
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

    /** {@code void glXFreeContextEXT(Display * display, GLXContext context)} */
    public static void glXFreeContextEXT(@NativeType("Display *") long display, @NativeType("GLXContext") long context) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXFreeContextEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
            check(context);
        }
        callPPV(display, context, __functionAddress);
    }

    /** {@code int glXQueryContextInfoEXT(Display * display, GLXContext context, int attribute, int * value)} */
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