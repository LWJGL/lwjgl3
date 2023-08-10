/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/KHR/KHR_context_flush_control.txt">KHR_context_flush_control</a> extension.
 * 
 * <p>OpenGL and OpenGL ES have long supported multiple contexts. The semantics of switching contexts is generally left to window system binding APIs such as
 * WGL, GLX and EGL. Most of these APIs (if not all) specify that when the current context for a thread is changed, the outgoing context performs an
 * implicit flush of any commands that have been issued to that point. OpenGL and OpenGL ES define a flush as sending any pending commands for execution
 * and that this action will result in their completion in finite time.</p>
 * 
 * <p>This behavior has subtle consequences. For example, if an application is rendering to the front buffer and switches contexts, it may assume that any
 * rendering performed thus far will eventually be visible to the user. With recent introduction of shared memory buffers, there become inumerable ways in
 * which applications may observe side effects of an implicit flush (or lack thereof).</p>
 * 
 * <p>In general, a full flush is not the desired behavior of the application. Nonetheless, applications that switch contexts frequently suffer the
 * performance consequences of this unless implementations make special considerations for them, which is generally untenable.</p>
 * 
 * <p>The EGL, GLX, and WGL extensions add new context creation parameters that allow an application to specify the behavior that is desired when a context
 * is made non-current, and specifically to opt out of the implicit flush behavior. The GL extension allows querying the context flush behavior.</p>
 */
public final class KHRContextFlushControl {

    /** Accepted as an attribute name in the {@code *attrib_list} argument to {@link EGL10#eglCreateContext CreateContext}. */
    public static final int EGL_CONTEXT_RELEASE_BEHAVIOR_KHR = 0x2097;

    /** Accepted as an attribute value for {@link #EGL_CONTEXT_RELEASE_BEHAVIOR_KHR CONTEXT_RELEASE_BEHAVIOR_KHR} in the {@code *attrib_list} argument to {@link EGL10#eglCreateContext CreateContext}. */
    public static final int
        EGL_CONTEXT_RELEASE_BEHAVIOR_NONE_KHR  = 0x0,
        EGL_CONTEXT_RELEASE_BEHAVIOR_FLUSH_KHR = 0x2098;

    private KHRContextFlushControl() {}

}