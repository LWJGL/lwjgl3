/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

public class EXTDeviceBase {

    public static final int
        EGL_BAD_DEVICE_EXT = 0x322B,
        EGL_DEVICE_EXT     = 0x322C;

    public static final long EGL_NO_DEVICE_EXT = 0x0L;

    protected EXTDeviceBase() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglQueryDeviceAttribEXT ] ---

    /** {@code EGLBoolean eglQueryDeviceAttribEXT(EGLDeviceEXT device, EGLint attribute, EGLAttrib * value)} */
    public static int neglQueryDeviceAttribEXT(long device, int attribute, long value) {
        return EXTDeviceQuery.neglQueryDeviceAttribEXT(device, attribute, value);
    }

    /** {@code EGLBoolean eglQueryDeviceAttribEXT(EGLDeviceEXT device, EGLint attribute, EGLAttrib * value)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryDeviceAttribEXT(@NativeType("EGLDeviceEXT") long device, @NativeType("EGLint") int attribute, @NativeType("EGLAttrib *") PointerBuffer value) {
        return EXTDeviceQuery.eglQueryDeviceAttribEXT(device, attribute, value);
    }

    // --- [ eglQueryDeviceStringEXT ] ---

    /** {@code char * eglQueryDeviceStringEXT(EGLDeviceEXT device, EGLint name)} */
    public static long neglQueryDeviceStringEXT(long device, int name) {
        return EXTDeviceQuery.neglQueryDeviceStringEXT(device, name);
    }

    /** {@code char * eglQueryDeviceStringEXT(EGLDeviceEXT device, EGLint name)} */
    @NativeType("char *")
    public static @Nullable String eglQueryDeviceStringEXT(@NativeType("EGLDeviceEXT") long device, @NativeType("EGLint") int name) {
        return EXTDeviceQuery.eglQueryDeviceStringEXT(device, name);
    }

    // --- [ eglQueryDisplayAttribEXT ] ---

    /** {@code EGLBoolean eglQueryDisplayAttribEXT(EGLDisplay dpy, EGLint attribute, EGLAttrib * value)} */
    public static int neglQueryDisplayAttribEXT(long dpy, int attribute, long value) {
        return EXTDeviceQuery.neglQueryDisplayAttribEXT(dpy, attribute, value);
    }

    /** {@code EGLBoolean eglQueryDisplayAttribEXT(EGLDisplay dpy, EGLint attribute, EGLAttrib * value)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryDisplayAttribEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLint") int attribute, @NativeType("EGLAttrib *") PointerBuffer value) {
        return EXTDeviceQuery.eglQueryDisplayAttribEXT(dpy, attribute, value);
    }

    // --- [ eglQueryDevicesEXT ] ---

    /** {@code EGLBoolean eglQueryDevicesEXT(EGLint max_devices, EGLDeviceEXT * devices, EGLint * num_devices)} */
    public static int neglQueryDevicesEXT(int max_devices, long devices, long num_devices) {
        return EXTDeviceEnumeration.neglQueryDevicesEXT(max_devices, devices, num_devices);
    }

    /** {@code EGLBoolean eglQueryDevicesEXT(EGLint max_devices, EGLDeviceEXT * devices, EGLint * num_devices)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryDevicesEXT(@NativeType("EGLDeviceEXT *") @Nullable PointerBuffer devices, @NativeType("EGLint *") IntBuffer num_devices) {
        return EXTDeviceEnumeration.eglQueryDevicesEXT(devices, num_devices);
    }

    /** {@code EGLBoolean eglQueryDevicesEXT(EGLint max_devices, EGLDeviceEXT * devices, EGLint * num_devices)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryDevicesEXT(@NativeType("EGLDeviceEXT *") @Nullable PointerBuffer devices, @NativeType("EGLint *") int[] num_devices) {
        return EXTDeviceEnumeration.eglQueryDevicesEXT(devices, num_devices);
    }

}