/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/NV/EGL_NV_context_priority_realtime.txt">NV_context_priority_realtime</a> extension.
 * 
 * <p>This extension allows an {@code EGLContext} to be created with one extra priority level in addition to three priority levels that are part of
 * {@code EGL_IMG_context_priority} extension.</p>
 * 
 * <p>This new level has extra privileges that are not available to other three levels. Some of the privileges may include:</p>
 * 
 * <ul>
 * <li>Allow realtime priority to only few contexts</li>
 * <li>Allow realtime priority only to trusted applications</li>
 * <li>Make sure realtime priority contexts are executed immediately</li>
 * <li>Preempt any current context running on GPU on submission of commands for realtime context</li>
 * </ul>
 * 
 * <p>The mechanism for determining which EGL context is allowed to use this priority level is platform dependent.</p>
 * 
 * <p>Requires {@link IMGContextPriority IMG_context_priority}.</p>
 */
public final class NVContextPriorityRealtime {

    /** New attribute value accepted for the {@link IMGContextPriority#EGL_CONTEXT_PRIORITY_LEVEL_IMG CONTEXT_PRIORITY_LEVEL_IMG} attribute in the {@code attrib_list} argument of {@link EGL10#eglCreateContext CreateContext}. */
    public static final int EGL_CONTEXT_PRIORITY_REALTIME_NV = 0x3357;

    private NVContextPriorityRealtime() {}

}