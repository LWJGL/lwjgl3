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

public class EXTDeviceQuery {

    public static final int
        EGL_BAD_DEVICE_EXT = 0x322B,
        EGL_DEVICE_EXT     = 0x322C;

    public static final long EGL_NO_DEVICE_EXT = 0x0L;

    protected EXTDeviceQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglQueryDeviceAttribEXT ] ---

    /** {@code EGLBoolean eglQueryDeviceAttribEXT(EGLDeviceEXT device, EGLint attribute, EGLAttrib * value)} */
    public static int neglQueryDeviceAttribEXT(long device, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglQueryDeviceAttribEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return callPPI(device, attribute, value, __functionAddress);
    }

    /** {@code EGLBoolean eglQueryDeviceAttribEXT(EGLDeviceEXT device, EGLint attribute, EGLAttrib * value)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryDeviceAttribEXT(@NativeType("EGLDeviceEXT") long device, @NativeType("EGLint") int attribute, @NativeType("EGLAttrib *") PointerBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQueryDeviceAttribEXT(device, attribute, memAddress(value)) != 0;
    }

    // --- [ eglQueryDeviceStringEXT ] ---

    /** {@code char * eglQueryDeviceStringEXT(EGLDeviceEXT device, EGLint name)} */
    public static long neglQueryDeviceStringEXT(long device, int name) {
        long __functionAddress = EGL.getCapabilities().eglQueryDeviceStringEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return callPP(device, name, __functionAddress);
    }

    /** {@code char * eglQueryDeviceStringEXT(EGLDeviceEXT device, EGLint name)} */
    @NativeType("char *")
    public static @Nullable String eglQueryDeviceStringEXT(@NativeType("EGLDeviceEXT") long device, @NativeType("EGLint") int name) {
        long __result = neglQueryDeviceStringEXT(device, name);
        return memASCIISafe(__result);
    }

    // --- [ eglQueryDisplayAttribEXT ] ---

    /** {@code EGLBoolean eglQueryDisplayAttribEXT(EGLDisplay dpy, EGLint attribute, EGLAttrib * value)} */
    public static int neglQueryDisplayAttribEXT(long dpy, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglQueryDisplayAttribEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPI(dpy, attribute, value, __functionAddress);
    }

    /** {@code EGLBoolean eglQueryDisplayAttribEXT(EGLDisplay dpy, EGLint attribute, EGLAttrib * value)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryDisplayAttribEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLint") int attribute, @NativeType("EGLAttrib *") PointerBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQueryDisplayAttribEXT(dpy, attribute, memAddress(value)) != 0;
    }

}