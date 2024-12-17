/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_context_flush_control = "KHRContextFlushControl".nativeClassEGL("KHR_context_flush_control", postfix = KHR) {
    IntConstant(
        "CONTEXT_RELEASE_BEHAVIOR_KHR"..0x2097
    )

    IntConstant(
        "CONTEXT_RELEASE_BEHAVIOR_NONE_KHR"..0x0000,
        "CONTEXT_RELEASE_BEHAVIOR_FLUSH_KHR"..0x2098
    )
}