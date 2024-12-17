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
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTDeviceEnumeration {

    protected EXTDeviceEnumeration() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglQueryDevicesEXT ] ---

    /** {@code EGLBoolean eglQueryDevicesEXT(EGLint max_devices, EGLDeviceEXT * devices, EGLint * num_devices)} */
    public static int neglQueryDevicesEXT(int max_devices, long devices, long num_devices) {
        long __functionAddress = EGL.getCapabilities().eglQueryDevicesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(max_devices, devices, num_devices, __functionAddress);
    }

    /** {@code EGLBoolean eglQueryDevicesEXT(EGLint max_devices, EGLDeviceEXT * devices, EGLint * num_devices)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryDevicesEXT(@NativeType("EGLDeviceEXT *") @Nullable PointerBuffer devices, @NativeType("EGLint *") IntBuffer num_devices) {
        if (CHECKS) {
            check(num_devices, 1);
        }
        return neglQueryDevicesEXT(remainingSafe(devices), memAddressSafe(devices), memAddress(num_devices)) != 0;
    }

    /** {@code EGLBoolean eglQueryDevicesEXT(EGLint max_devices, EGLDeviceEXT * devices, EGLint * num_devices)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryDevicesEXT(@NativeType("EGLDeviceEXT *") @Nullable PointerBuffer devices, @NativeType("EGLint *") int[] num_devices) {
        long __functionAddress = EGL.getCapabilities().eglQueryDevicesEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(num_devices, 1);
        }
        return callPPI(remainingSafe(devices), memAddressSafe(devices), num_devices, __functionAddress) != 0;
    }

}