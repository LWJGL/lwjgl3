/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/ANDROID/EGL_ANDROID_framebuffer_target.txt">ANDROID_framebuffer_target</a> extension.
 * 
 * <p>Android supports a number of different ANativeWindow implementations that can be used to create an EGLSurface. One implementation, which is used to
 * send the result of performing window composition to a display, may have some device-specific restrictions. Because of this, some EGLConfigs may be
 * incompatible with these ANativeWindows. This extension introduces a new boolean EGLConfig attribute that indicates whether the EGLConfig supports
 * rendering to an ANativeWindow for which the buffers are passed to the HWComposer HAL as a framebuffer target layer.</p>
 */
public final class ANDROIDFramebufferTarget {

    public static final int EGL_FRAMEBUFFER_TARGET_ANDROID = 0x3147;

    private ANDROIDFramebufferTarget() {}

}