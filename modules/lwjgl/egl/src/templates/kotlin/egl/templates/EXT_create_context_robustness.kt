/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_create_context_robustness = "EXTCreateContextRobustness".nativeClassEGL("EXT_create_context_robustness", postfix = EXT) {
    IntConstant(
        "CONTEXT_OPENGL_ROBUST_ACCESS_EXT"..0x30BF,
        "CONTEXT_OPENGL_RESET_NOTIFICATION_STRATEGY_EXT"..0x3138,
        "NO_RESET_NOTIFICATION_EXT"..0x31BE,
        "LOSE_CONTEXT_ON_RESET_EXT"..0x31BF
    )
}