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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_device_base.txt">EXT_device_base</a> extension.
 * 
 * <p>Increasingly, EGL and its client APIs are being used in place of "native" rendering APIs to implement the basic graphics functionality of native
 * windowing systems. This creates demand for a method to initialize EGL displays and surfaces directly on top of native GPU or device objects rather than
 * native window system objects. The mechanics of enumerating the underlying native devices and constructing EGL displays and surfaces from them have been
 * solved in various platform and implementation- specific ways. The EGL device family of extensions offers a standardized framework for bootstrapping EGL
 * without the use of any underlying "native" APIs or functionality.</p>
 * 
 * <p>This extension defines the first step of this bootstrapping process: Device enumeration.</p>
 */
public class EXTDeviceBase {

    public static final int
        EGL_BAD_DEVICE_EXT = 0x322B,
        EGL_DEVICE_EXT     = 0x322C;

    public static final long EGL_NO_DEVICE_EXT = 0x0L;

    protected EXTDeviceBase() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglQueryDeviceAttribEXT ] ---

    public static int neglQueryDeviceAttribEXT(long device, int attribute, long value) {
        return EXTDeviceQuery.neglQueryDeviceAttribEXT(device, attribute, value);
    }

    @NativeType("EGLBoolean")
    public static boolean eglQueryDeviceAttribEXT(@NativeType("EGLDeviceEXT") long device, @NativeType("EGLint") int attribute, @NativeType("EGLAttrib *") PointerBuffer value) {
        return EXTDeviceQuery.eglQueryDeviceAttribEXT(device, attribute, value);
    }

    // --- [ eglQueryDeviceStringEXT ] ---

    public static long neglQueryDeviceStringEXT(long device, int name) {
        return EXTDeviceQuery.neglQueryDeviceStringEXT(device, name);
    }

    @Nullable
    @NativeType("char *")
    public static String eglQueryDeviceStringEXT(@NativeType("EGLDeviceEXT") long device, @NativeType("EGLint") int name) {
        return EXTDeviceQuery.eglQueryDeviceStringEXT(device, name);
    }

    // --- [ eglQueryDisplayAttribEXT ] ---

    public static int neglQueryDisplayAttribEXT(long dpy, int attribute, long value) {
        return EXTDeviceQuery.neglQueryDisplayAttribEXT(dpy, attribute, value);
    }

    @NativeType("EGLBoolean")
    public static boolean eglQueryDisplayAttribEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLint") int attribute, @NativeType("EGLAttrib *") PointerBuffer value) {
        return EXTDeviceQuery.eglQueryDisplayAttribEXT(dpy, attribute, value);
    }

    // --- [ eglQueryDevicesEXT ] ---

    public static int neglQueryDevicesEXT(int max_devices, long devices, long num_devices) {
        return EXTDeviceEnumeration.neglQueryDevicesEXT(max_devices, devices, num_devices);
    }

    @NativeType("EGLBoolean")
    public static boolean eglQueryDevicesEXT(@Nullable @NativeType("EGLDeviceEXT *") PointerBuffer devices, @NativeType("EGLint *") IntBuffer num_devices) {
        return EXTDeviceEnumeration.eglQueryDevicesEXT(devices, num_devices);
    }

    /** Array version of: {@link #eglQueryDevicesEXT QueryDevicesEXT} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryDevicesEXT(@Nullable @NativeType("EGLDeviceEXT *") PointerBuffer devices, @NativeType("EGLint *") int[] num_devices) {
        return EXTDeviceEnumeration.eglQueryDevicesEXT(devices, num_devices);
    }

}