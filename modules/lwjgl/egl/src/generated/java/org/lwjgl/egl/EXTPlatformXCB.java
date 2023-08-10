/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_platform_xcb.txt">EXT_platform_xcb</a> extension.
 * 
 * <p>This extension defines how to create EGL resources from native X11 resources using the functions defined by {@code EGL_EXT_platform_base}.</p>
 * 
 * <p>The native X11 resources required by this extension are xcb resources. All X11 types discussed here are defined by the header {@code xcb.h}.</p>
 * 
 * <p>Requires {@link EXTPlatformBase EXT_platform_base} and <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_client_extensions.txt">EXT_platform_xcb</a> to query its existence without a display.</p>
 */
public final class EXTPlatformXCB {

    /** Accepted as the {@code platform} argument of {@link EXTPlatformBase#eglGetPlatformDisplayEXT GetPlatformDisplayEXT}. */
    public static final int EGL_PLATFORM_XCB_EXT = 0x31DC;

    /** Accepted as an attribute name in the {@code attrib_list} argument of {@link EXTPlatformBase#eglGetPlatformDisplayEXT GetPlatformDisplayEXT}. */
    public static final int EGL_PLATFORM_XCB_SCREEN_EXT = 0x31DE;

    private EXTPlatformXCB() {}

}