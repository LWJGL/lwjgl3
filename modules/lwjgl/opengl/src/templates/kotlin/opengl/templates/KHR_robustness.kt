/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val KHR_robustness = "KHRRobustness".nativeClassGL("KHR_robustness") {
    IntConstant(
        "NO_ERROR"..0x0000,
        "GUILTY_CONTEXT_RESET"..0x8253,
        "INNOCENT_CONTEXT_RESET"..0x8254,
        "UNKNOWN_CONTEXT_RESET"..0x8255
    )

    IntConstant(
        "CONTEXT_ROBUST_ACCESS"..0x90F3,
        "RESET_NOTIFICATION_STRATEGY"..0x8256
    )

    IntConstant(
        "LOSE_CONTEXT_ON_RESET"..0x8252,
        "NO_RESET_NOTIFICATION"..0x8261
    )

    IntConstant(
        "CONTEXT_LOST"..0x0507
    )

    reuse(GL45C, "GetGraphicsResetStatus")
    reuse(GL45C, "ReadnPixels")
    reuse(GL45C, "GetnUniformfv")
    reuse(GL45C, "GetnUniformiv")
    reuse(GL45C, "GetnUniformuiv")
}