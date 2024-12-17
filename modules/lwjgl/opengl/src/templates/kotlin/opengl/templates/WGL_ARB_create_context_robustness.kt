/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val WGL_ARB_create_context_robustness = "WGLARBCreateContextRobustness".nativeClassWGL("WGL_ARB_create_context_robustness", ARB) {
    val wglCreateContextAttribsARB = "WGLARBCreateContext#wglCreateContextAttribsARB()"
    IntConstant(
        "CONTEXT_ROBUST_ACCESS_BIT_ARB"..0x00000004
    )

    IntConstant(
        "CONTEXT_RESET_NOTIFICATION_STRATEGY_ARB"..0x8256
    )

    IntConstant(
        "NO_RESET_NOTIFICATION_ARB"..0x8261,
        "LOSE_CONTEXT_ON_RESET_ARB"..0x8252
    )
}