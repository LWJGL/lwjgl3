/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_context_priority_realtime = "NVContextPriorityRealtime".nativeClassEGL("NV_context_priority_realtime", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows an {@code EGLContext} to be created with one extra priority level in addition to three priority levels that are part of
        {@code EGL_IMG_context_priority} extension.

        This new level has extra privileges that are not available to other three levels. Some of the privileges may include:
        ${ul(
            "Allow realtime priority to only few contexts",
            "Allow realtime priority only to trusted applications",
            "Make sure realtime priority contexts are executed immediately",
            "Preempt any current context running on GPU on submission of commands for realtime context"
        )}

        The mechanism for determining which EGL context is allowed to use this priority level is platform dependent.

        Requires ${IMG_context_priority.link}.
        """

    IntConstant(
        "New attribute value accepted for the #CONTEXT_PRIORITY_LEVEL_IMG attribute in the {@code attrib_list} argument of #CreateContext().",

        "CONTEXT_PRIORITY_REALTIME_NV"..0x3357
    )
}