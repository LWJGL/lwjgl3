/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_platform_device.txt">EXT_platform_device</a> extension.
 * 
 * <p>Increasingly, EGL and its client APIs are being used in place of "native" rendering APIs to implement the basic graphics functionality of native
 * windowing systems. This creates demand for a method to initialize EGL displays and surfaces directly on top of native GPU or device objects rather than
 * native window system objects. The mechanics of enumerating the underlying native devices and constructing EGL displays and surfaces from them have been
 * solved in various platform and implementation- specific ways. The EGL device family of extensions offers a standardized framework for bootstrapping EGL
 * without the use of any underlying "native" APIs or functionality.</p>
 * 
 * <p>This extension defines a method to create an EGLDisplay from an EGLDeviceEXT by treating the EGLDeviceEXT as an EGLNativeDisplay object.</p>
 * 
 * <p>Requires {@link EXTDeviceBase EXT_device_base} and {@link EXTPlatformBase EXT_platform_base} or {@link EGL15 EGL 1.5}.</p>
 */
public final class EXTPlatformDevice {

    public static final int EGL_PLATFORM_DEVICE_EXT = 0x313F;

    private EXTPlatformDevice() {}

}