/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.jspecify.annotations.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTSyncReuse {

    protected EXTSyncReuse() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglUnsignalSyncEXT ] ---

    /** {@code EGLBoolean eglUnsignalSyncEXT(EGLDisplay dpy, EGLSync sync, EGLAttrib const * attrib_list)} */
    public static int neglUnsignalSyncEXT(long dpy, long sync, long attrib_list) {
        long __functionAddress = EGL.getCapabilities().eglUnsignalSyncEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(sync);
        }
        return callPPPI(dpy, sync, attrib_list, __functionAddress);
    }

    /** {@code EGLBoolean eglUnsignalSyncEXT(EGLDisplay dpy, EGLSync sync, EGLAttrib const * attrib_list)} */
    @NativeType("EGLBoolean")
    public static boolean eglUnsignalSyncEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLSync") long sync, @NativeType("EGLAttrib const *") @Nullable PointerBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
        }
        return neglUnsignalSyncEXT(dpy, sync, memAddressSafe(attrib_list)) != 0;
    }

}