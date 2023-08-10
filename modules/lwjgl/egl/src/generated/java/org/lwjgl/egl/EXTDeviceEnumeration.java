/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_device_enumeration.txt">EXT_device_enumeration</a> extension.
 * 
 * <p>Increasingly, EGL and its client APIs are being used in place of "native" rendering APIs to implement the basic graphics functionality of native
 * windowing systems. This creates demand for a method to initialize EGL displays and surfaces directly on top of native GPU or device objects rather than
 * native window system objects. The mechanics of enumerating the underlying native devices and constructing EGL displays and surfaces from them have been
 * solved in various platform and implementation- specific ways. The EGL device family of extensions offers a standardized framework for bootstrapping EGL
 * without the use of any underlying "native" APIs or functionality.</p>
 * 
 * <p>The original EGL_EXT_device_base extension combined the conceptually separate operations of querying the underlying device used by a given EGLDisplay
 * and enumerating devices from scratch. It was later identified that the former is useful even in EGL implementations that have no need or ability to
 * allow enumerating all the devices available on a system. To accommodate this, the extension was split in two.</p>
 * 
 * <p>Requires {@link EGL15 EGL 1.5} or an earlier verison of EGL with the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_client_extensions.txt">EXT_device_enumeration</a> extension.</p>
 */
public class EXTDeviceEnumeration {

    protected EXTDeviceEnumeration() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglQueryDevicesEXT ] ---

    public static int neglQueryDevicesEXT(int max_devices, long devices, long num_devices) {
        long __functionAddress = EGL.getCapabilities().eglQueryDevicesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(max_devices, devices, num_devices, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglQueryDevicesEXT(@Nullable @NativeType("EGLDeviceEXT *") PointerBuffer devices, @NativeType("EGLint *") IntBuffer num_devices) {
        if (CHECKS) {
            check(num_devices, 1);
        }
        return neglQueryDevicesEXT(remainingSafe(devices), memAddressSafe(devices), memAddress(num_devices)) != 0;
    }

    /** Array version of: {@link #eglQueryDevicesEXT QueryDevicesEXT} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryDevicesEXT(@Nullable @NativeType("EGLDeviceEXT *") PointerBuffer devices, @NativeType("EGLint *") int[] num_devices) {
        long __functionAddress = EGL.getCapabilities().eglQueryDevicesEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(num_devices, 1);
        }
        return callPPI(remainingSafe(devices), memAddressSafe(devices), num_devices, __functionAddress) != 0;
    }

}