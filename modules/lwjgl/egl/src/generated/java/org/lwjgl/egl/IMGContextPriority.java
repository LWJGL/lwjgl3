/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/IMG/EGL_IMG_context_priority.txt">IMG_context_priority</a> extension.
 * 
 * <p>This extension allows an EGLContext to be created with a priority hint. It is possible that an implementation will not honour the hint, especially if
 * there are constraints on the number of high priority contexts available in the system, or system policy limits access to high priority contexts to
 * appropriate system privilege level. A query is provided to find the real priority level assigned to the context after creation.</p>
 */
public final class IMGContextPriority {

    public static final int
        EGL_CONTEXT_PRIORITY_LEVEL_IMG  = 0x3100,
        EGL_CONTEXT_PRIORITY_HIGH_IMG   = 0x3101,
        EGL_CONTEXT_PRIORITY_MEDIUM_IMG = 0x3102,
        EGL_CONTEXT_PRIORITY_LOW_IMG    = 0x3103;

    private IMGContextPriority() {}

}