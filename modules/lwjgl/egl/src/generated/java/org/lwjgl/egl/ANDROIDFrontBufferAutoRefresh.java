/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/ANDROID/EGL_ANDROID_front_buffer_auto_refresh.txt">ANDROID_front_buffer_auto_refresh</a> extension.
 * 
 * <p>This extension is intended for latency-sensitive applications that are doing front-buffer rendering. It allows them to indicate to the Android
 * compositor that it should perform composition every time the display refreshes. This removes the overhead of having to notify the compositor that the
 * window surface has been updated, but it comes at the cost of doing potentially unneeded composition work if the window surface has not been updated.</p>
 */
public final class ANDROIDFrontBufferAutoRefresh {

    /**
     * When used as an attribute in {@link EGL11#eglSurfaceAttrib SurfaceAttrib}, the value specifies whether to enable or disable auto-refresh in the Android compositor when doing
     * front-buffer rendering.
     */
    public static final int EGL_FRONT_BUFFER_AUTO_REFRESH_ANDROID = 0x314C;

    private ANDROIDFrontBufferAutoRefresh() {}

}