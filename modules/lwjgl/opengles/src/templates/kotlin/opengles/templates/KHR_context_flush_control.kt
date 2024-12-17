/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val KHR_context_flush_control = "KHRContextFlushControl".nativeClassGLES("KHR_context_flush_control", postfix = KHR) {
    IntConstant(
        "CONTEXT_RELEASE_BEHAVIOR_KHR"..0x82FB
    )

    IntConstant(
        "CONTEXT_RELEASE_BEHAVIOR_FLUSH_KHR"..0x82FC
    )
}