/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/KHR/KHR_context_flush_control.txt">GLX_ARB_context_flush_control</a> extension.
 * 
 * <p>The GLX version of {@link KHRContextFlushControl}. This extension adds new context creation parameters the allow an application to specify the behavior
 * that is desired when a context is made non-current, and specifically to opt out of the implicit flush behavior.</p>
 */
public final class GLXARBContextFlushControl {

    /** Accepted as an attribute name in the {@code *attrib_list} argument to {@link GLXARBCreateContext#glXCreateContextAttribsARB CreateContextAttribsARB}. */
    public static final int GLX_CONTEXT_RELEASE_BEHAVIOR_ARB = 0x2097;

    /**
     * Accepted as an attribute value for {@link #GLX_CONTEXT_RELEASE_BEHAVIOR_ARB CONTEXT_RELEASE_BEHAVIOR_ARB} in the {@code *attrib_list} argument to
     * {@link GLXARBCreateContext#glXCreateContextAttribsARB CreateContextAttribsARB}.
     */
    public static final int
        GLX_CONTEXT_RELEASE_BEHAVIOR_NONE_ARB  = 0x0,
        GLX_CONTEXT_RELEASE_BEHAVIOR_FLUSH_ARB = 0x2098;

    private GLXARBContextFlushControl() {}

}