/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/WGL_ARB_create_context_robustness.txt">WGL_ARB_create_context_robustness</a> extension.
 * 
 * <p>This extension allows creating an OpenGL context supporting robust buffer access behavior and a specified graphics reset notification behavior.</p>
 * 
 * <p>Requires {@link WGLARBExtensionsString WGL_ARB_extensions_string}, {@link WGLARBCreateContext WGL_ARB_create_context} and {@link ARBRobustness ARB_robustness}.</p>
 */
public final class WGLARBCreateContextRobustness {

    /**
     * Accepted as a bit in the attribute value for {@link WGLARBCreateContext#WGL_CONTEXT_FLAGS_ARB CONTEXT_FLAGS_ARB} in the {@code attrib_list} argument to
     * {@link WGLARBCreateContext#wglCreateContextAttribsARB CreateContextAttribsARB}.
     */
    public static final int WGL_CONTEXT_ROBUST_ACCESS_BIT_ARB = 0x4;

    /** Accepted as an attribute name in the {@code attrib_list} argument to {@link WGLARBCreateContext#wglCreateContextAttribsARB CreateContextAttribsARB}. */
    public static final int WGL_CONTEXT_RESET_NOTIFICATION_STRATEGY_ARB = 0x8256;

    /**
     * Accepted as an attribute value for {@link #WGL_CONTEXT_RESET_NOTIFICATION_STRATEGY_ARB CONTEXT_RESET_NOTIFICATION_STRATEGY_ARB} in the {@code attrib_list} argument to
     * {@link WGLARBCreateContext#wglCreateContextAttribsARB CreateContextAttribsARB}.
     */
    public static final int
        WGL_NO_RESET_NOTIFICATION_ARB = 0x8261,
        WGL_LOSE_CONTEXT_ON_RESET_ARB = 0x8252;

    private WGLARBCreateContextRobustness() {}

}