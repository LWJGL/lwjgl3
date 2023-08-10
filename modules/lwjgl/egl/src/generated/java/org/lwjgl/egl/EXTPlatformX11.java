/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_platform_x11.txt">EXT_platform_x11</a> extension.
 * 
 * <p>This extension defines how to create EGL resources from native X11 resources using the functions defined by EGL_EXT_platform_base.</p>
 * 
 * <p>This extension defines only how to create EGL resources from Xlib resources. It does not define how to do so from xcb resources. All X11 types
 * discussed here are defined by the header `Xlib.h`.</p>
 * 
 * <p>Requires {@link EXTPlatformBase EXT_platform_base} and <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_client_extensions.txt">EXT_platform_x11</a> to query its existence without a display.</p>
 */
public final class EXTPlatformX11 {

    public static final int
        EGL_PLATFORM_X11_EXT        = 0x31D5,
        EGL_PLATFORM_X11_SCREEN_EXT = 0x31D6;

    private EXTPlatformX11() {}

}