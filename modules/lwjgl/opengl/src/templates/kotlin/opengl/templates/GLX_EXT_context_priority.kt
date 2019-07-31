/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GLX_EXT_context_priority = "GLXEXTContextPriority".nativeClassGLX("GLX_EXT_context_priority", EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows a {@code GLXContext} to be created with a priority hint. It is possible that an implementation will not honour the hint,
        especially if there are constraints on the number of high priority contexts available in the system, or system policy limits access to high priority
        contexts to appropriate system privilege level. A query is provided to find the real priority level assigned to the context after creation.
        
        Requires ${GLX_ARB_create_context.link}.
        """

    IntConstant(
        "New attributes accepted by the {@code attrib_list} argument of GLXARBCreateContext#glXCreateContextAttribsARB().",

        "CONTEXT_PRIORITY_LEVEL_EXT"..0x3100
    )

    IntConstant(
        "New attribute values accepted in the {@code attrib_list} argument of GLXARBCreateContext#glXCreateContextAttribsARB().",

        "CONTEXT_PRIORITY_HIGH_EXT"..0x3101,
        "CONTEXT_PRIORITY_MEDIUM_EXT"..0x3102,
        "CONTEXT_PRIORITY_LOW_EXT"..0x3103
    )
}