/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import javax.annotation.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_device_query.txt">EXT_device_query</a> extension.
 * 
 * <p>Increasingly, EGL and its client APIs are being used in place of "native" rendering APIs to implement the basic graphics functionality of native
 * windowing systems. This creates demand for a method to access native GPU or device objects directly rather than calling EGL or GL entry points.</p>
 * 
 * <p>This extension defines the method for an application to query native device objects from an EGL Display.</p>
 * 
 * <p>Requires {@link EGL15 EGL 1.5} or an earlier verison of EGL with the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_client_extensions.txt">EXT_device_query</a> extension.</p>
 */
public class EXTDeviceQuery {

    public static final int
        EGL_BAD_DEVICE_EXT = 0x322B,
        EGL_DEVICE_EXT     = 0x322C;

    public static final long EGL_NO_DEVICE_EXT = 0x0L;

    protected EXTDeviceQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglQueryDeviceAttribEXT ] ---

    public static int neglQueryDeviceAttribEXT(long device, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglQueryDeviceAttribEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return callPPI(device, attribute, value, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglQueryDeviceAttribEXT(@NativeType("EGLDeviceEXT") long device, @NativeType("EGLint") int attribute, @NativeType("EGLAttrib *") PointerBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQueryDeviceAttribEXT(device, attribute, memAddress(value)) != 0;
    }

    // --- [ eglQueryDeviceStringEXT ] ---

    public static long neglQueryDeviceStringEXT(long device, int name) {
        long __functionAddress = EGL.getCapabilities().eglQueryDeviceStringEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return callPP(device, name, __functionAddress);
    }

    @Nullable
    @NativeType("char *")
    public static String eglQueryDeviceStringEXT(@NativeType("EGLDeviceEXT") long device, @NativeType("EGLint") int name) {
        long __result = neglQueryDeviceStringEXT(device, name);
        return memASCIISafe(__result);
    }

    // --- [ eglQueryDisplayAttribEXT ] ---

    public static int neglQueryDisplayAttribEXT(long dpy, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglQueryDisplayAttribEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPI(dpy, attribute, value, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglQueryDisplayAttribEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLint") int attribute, @NativeType("EGLAttrib *") PointerBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQueryDisplayAttribEXT(dpy, attribute, memAddress(value)) != 0;
    }

}