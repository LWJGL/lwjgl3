/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTDevicePersistentID {

    public static final int EGL_DRIVER_NAME_EXT = 0x335E;

    public static final int
        EGL_DEVICE_UUID_EXT = 0x335C,
        EGL_DRIVER_UUID_EXT = 0x335D;

    protected EXTDevicePersistentID() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglQueryDeviceBinaryEXT ] ---

    /** {@code EGLBoolean eglQueryDeviceBinaryEXT(EGLDeviceEXT device, EGLint name, EGLint max_size, void * value, EGLint * size)} */
    public static int neglQueryDeviceBinaryEXT(long device, int name, int max_size, long value, long size) {
        long __functionAddress = EGL.getCapabilities().eglQueryDeviceBinaryEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return callPPPI(device, name, max_size, value, size, __functionAddress);
    }

    /** {@code EGLBoolean eglQueryDeviceBinaryEXT(EGLDeviceEXT device, EGLint name, EGLint max_size, void * value, EGLint * size)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryDeviceBinaryEXT(@NativeType("EGLDeviceEXT") long device, @NativeType("EGLint") int name, @NativeType("void *") @Nullable ByteBuffer value, @NativeType("EGLint *") IntBuffer size) {
        if (CHECKS) {
            check(size, 1);
        }
        return neglQueryDeviceBinaryEXT(device, name, remainingSafe(value), memAddressSafe(value), memAddress(size)) != 0;
    }

    /** {@code EGLBoolean eglQueryDeviceBinaryEXT(EGLDeviceEXT device, EGLint name, EGLint max_size, void * value, EGLint * size)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryDeviceBinaryEXT(@NativeType("EGLDeviceEXT") long device, @NativeType("EGLint") int name, @NativeType("void *") @Nullable ByteBuffer value, @NativeType("EGLint *") int[] size) {
        long __functionAddress = EGL.getCapabilities().eglQueryDeviceBinaryEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
            check(size, 1);
        }
        return callPPPI(device, name, remainingSafe(value), memAddressSafe(value), size, __functionAddress) != 0;
    }

}