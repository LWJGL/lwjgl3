/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_context_priority_realtime = "NVContextPriorityRealtime".nativeClassEGL("NV_context_priority_realtime", postfix = NV) {
    IntConstant(
        "CONTEXT_PRIORITY_REALTIME_NV"..0x3357
    )
}