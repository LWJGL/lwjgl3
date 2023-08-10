/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_create_context_robustness.txt">EXT_create_context_robustness</a> extension.
 * 
 * <p>This extension allows creating an OpenGL or OpenGL ES context supporting robust buffer access behavior and a specified graphics reset notification
 * behavior.</p>
 * 
 * <p>Requires {@link EGL14 EGL 1.4}.</p>
 */
public final class EXTCreateContextRobustness {

    public static final int
        EGL_CONTEXT_OPENGL_ROBUST_ACCESS_EXT               = 0x30BF,
        EGL_CONTEXT_OPENGL_RESET_NOTIFICATION_STRATEGY_EXT = 0x3138,
        EGL_NO_RESET_NOTIFICATION_EXT                      = 0x31BE,
        EGL_LOSE_CONTEXT_ON_RESET_EXT                      = 0x31BF;

    private EXTCreateContextRobustness() {}

}