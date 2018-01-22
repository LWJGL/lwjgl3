/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val IMG_context_priority = "IMGContextPriority".nativeClassEGL("IMG_context_priority", postfix = IMG) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows an EGLContext to be created with a priority hint. It is possible that an implementation will not honour the hint, especially if
        there are constraints on the number of high priority contexts available in the system, or system policy limits access to high priority contexts to
        appropriate system privilege level. A query is provided to find the real priority level assigned to the context after creation.
        """

    IntConstant(
        "",

        "CONTEXT_PRIORITY_LEVEL_IMG"..0x3100,
        "CONTEXT_PRIORITY_HIGH_IMG"..0x3101,
        "CONTEXT_PRIORITY_MEDIUM_IMG"..0x3102,
        "CONTEXT_PRIORITY_LOW_IMG"..0x3103
    )
}