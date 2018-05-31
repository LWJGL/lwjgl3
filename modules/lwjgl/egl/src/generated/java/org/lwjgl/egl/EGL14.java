/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** The core EGL 1.4 functionality. */
public class EGL14 extends EGL13 {

    public static final int
        EGL_MULTISAMPLE_RESOLVE_BOX_BIT = 0x200,
        EGL_MULTISAMPLE_RESOLVE         = 0x3099,
        EGL_MULTISAMPLE_RESOLVE_DEFAULT = 0x309A,
        EGL_MULTISAMPLE_RESOLVE_BOX     = 0x309B,
        EGL_OPENGL_API                  = 0x30A2,
        EGL_OPENGL_BIT                  = 0x8,
        EGL_SWAP_BEHAVIOR_PRESERVED_BIT = 0x400;

    public static final long EGL_DEFAULT_DISPLAY = 0x0L;

    protected EGL14() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(EGLCapabilities caps) {
        return checkFunctions(
            caps.eglGetCurrentContext
        );
    }

    // --- [ eglGetCurrentContext ] ---

    /** <a target="_blank" href="https://www.khronos.org/registry/EGL/sdk/docs/man/html/eglGetCurrentContext.xhtml">Reference Page</a> */
    @NativeType("EGLContext")
    public static long eglGetCurrentContext() {
        long __functionAddress = EGL.getCapabilities().eglGetCurrentContext;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(__functionAddress);
    }

}