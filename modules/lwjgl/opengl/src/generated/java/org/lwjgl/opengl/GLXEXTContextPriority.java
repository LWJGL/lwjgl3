/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/GLX_EXT_context_priority.txt">GLX_EXT_context_priority</a> extension.
 * 
 * <p>This extension allows a {@code GLXContext} to be created with a priority hint. It is possible that an implementation will not honour the hint,
 * especially if there are constraints on the number of high priority contexts available in the system, or system policy limits access to high priority
 * contexts to appropriate system privilege level. A query is provided to find the real priority level assigned to the context after creation.</p>
 * 
 * <p>Requires {@link GLXARBCreateContext GLX_ARB_create_context}.</p>
 */
public final class GLXEXTContextPriority {

    /** New attributes accepted by the {@code attrib_list} argument of {@link GLXARBCreateContext#glXCreateContextAttribsARB CreateContextAttribsARB}. */
    public static final int GLX_CONTEXT_PRIORITY_LEVEL_EXT = 0x3100;

    /** New attribute values accepted in the {@code attrib_list} argument of {@link GLXARBCreateContext#glXCreateContextAttribsARB CreateContextAttribsARB}. */
    public static final int
        GLX_CONTEXT_PRIORITY_HIGH_EXT   = 0x3101,
        GLX_CONTEXT_PRIORITY_MEDIUM_EXT = 0x3102,
        GLX_CONTEXT_PRIORITY_LOW_EXT    = 0x3103;

    private GLXEXTContextPriority() {}

}