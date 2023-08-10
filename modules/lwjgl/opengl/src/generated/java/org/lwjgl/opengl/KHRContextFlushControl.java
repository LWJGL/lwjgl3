/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

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
 * <p>This extension allows querying the context flush behavior.</p>
 * 
 * <p>Promoted to core in {@link GL45 OpenGL 4.5}.</p>
 */
public final class KHRContextFlushControl {

    /** Accepted by the {@code pname} parameter of GetIntegerv, GetFloatv, GetBooleanv GetDoublev and GetInteger64v. */
    public static final int GL_CONTEXT_RELEASE_BEHAVIOR = 0x82FB;

    /** Returned in {@code data} by GetIntegerv, GetFloatv, GetBooleanv GetDoublev and GetInteger64v when {@code pname} is {@link #GL_CONTEXT_RELEASE_BEHAVIOR CONTEXT_RELEASE_BEHAVIOR}. */
    public static final int GL_CONTEXT_RELEASE_BEHAVIOR_FLUSH = 0x82FC;

    private KHRContextFlushControl() {}

}