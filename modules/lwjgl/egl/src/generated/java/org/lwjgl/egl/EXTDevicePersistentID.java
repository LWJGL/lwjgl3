/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_device_persistent_id.txt">EXT_device_persistent_id</a> extension.
 * 
 * <p>Applications can query a list of {@code EGLDeviceEXT} handles, but those handles are only valid within the process that queried them. An application
 * has no way, for example, to record its selection and select the same device when run again later.</p>
 * 
 * <p>This extension provides a vendor name and a set of UUID's, which provide a unique, persistent identifier for {@code EGLDeviceEXT} handles. This allows
 * applications to find the {@code EGLDeviceEXT} for the same device across multiple processes, and across multiple APIs.</p>
 * 
 * <p>Requires {@link EXTDeviceQuery EXT_device_query}.</p>
 */
public class EXTDevicePersistentID {

    /** Accepted by the {@code name} parameter of {@link EXTDeviceQuery#eglQueryDeviceStringEXT QueryDeviceStringEXT}. */
    public static final int EGL_DRIVER_NAME_EXT = 0x335E;

    /** Accepted by the {@code name} parameter of {@link #eglQueryDeviceBinaryEXT QueryDeviceBinaryEXT}. */
    public static final int
        EGL_DEVICE_UUID_EXT = 0x335C,
        EGL_DRIVER_UUID_EXT = 0x335D;

    protected EXTDevicePersistentID() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglQueryDeviceBinaryEXT ] ---

    public static int neglQueryDeviceBinaryEXT(long device, int name, int max_size, long value, long size) {
        long __functionAddress = EGL.getCapabilities().eglQueryDeviceBinaryEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return callPPPI(device, name, max_size, value, size, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglQueryDeviceBinaryEXT(@NativeType("EGLDeviceEXT") long device, @NativeType("EGLint") int name, @Nullable @NativeType("void *") ByteBuffer value, @NativeType("EGLint *") IntBuffer size) {
        if (CHECKS) {
            check(size, 1);
        }
        return neglQueryDeviceBinaryEXT(device, name, remainingSafe(value), memAddressSafe(value), memAddress(size)) != 0;
    }

    /** Array version of: {@link #eglQueryDeviceBinaryEXT QueryDeviceBinaryEXT} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryDeviceBinaryEXT(@NativeType("EGLDeviceEXT") long device, @NativeType("EGLint") int name, @Nullable @NativeType("void *") ByteBuffer value, @NativeType("EGLint *") int[] size) {
        long __functionAddress = EGL.getCapabilities().eglQueryDeviceBinaryEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
            check(size, 1);
        }
        return callPPPI(device, name, remainingSafe(value), memAddressSafe(value), size, __functionAddress) != 0;
    }

}