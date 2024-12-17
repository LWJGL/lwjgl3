/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_cl_event = "ARBCLEvent".dependsOn(Module.OPENCL)?.nativeClassGL("ARB_cl_event", postfix = ARB) {
    IntConstant(
        "SYNC_CL_EVENT_ARB"..0x8240
    )

    IntConstant(
        "SYNC_CL_EVENT_COMPLETE_ARB"..0x8241
    )

    GLsync(
        "CreateSyncFromCLeventARB",

        "cl_context".handle("context"),
        "cl_event".handle("event"),
        GLbitfield("flags")
    )
}