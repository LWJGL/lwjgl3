/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/KHR/EGL_KHR_platform_x11.txt">KHR_platform_x11</a> extension.
 * 
 * <p>This extension defines how to create EGL resources from native X11 resources using the EGL 1.5 platform functionality.</p>
 * 
 * <p>This extension only defines how to create EGL resources from Xlib resources. It does not define how to do so from xcb resources. All X11 types
 * discussed here are defined by the header `Xlib.h`.</p>
 * 
 * <p>Requires {@link EGL15 EGL 1.5}.</p>
 */
public final class KHRPlatformX11 {

    public static final int
        EGL_PLATFORM_X11_KHR        = 0x31D5,
        EGL_PLATFORM_X11_SCREEN_KHR = 0x31D6;

    private KHRPlatformX11() {}

}