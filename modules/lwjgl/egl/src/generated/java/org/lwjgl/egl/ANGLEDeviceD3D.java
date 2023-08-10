/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/ANGLE/EGL_ANGLE_device_d3d.txt">ANGLE_device_d3d</a> extension.
 * 
 * <p>ANGLE has the ability to run GPU commands on a native D3D device. This extension defines a mapping from an EGL device to a D3D device, after it's
 * queried from an EGL display.</p>
 * 
 * <p>Requires {@link EXTDeviceQuery EXT_device_query}.</p>
 */
public final class ANGLEDeviceD3D {

    public static final int
        EGL_D3D9_DEVICE_ANGLE  = 0x33A0,
        EGL_D3D11_DEVICE_ANGLE = 0x33A1;

    private ANGLEDeviceD3D() {}

}