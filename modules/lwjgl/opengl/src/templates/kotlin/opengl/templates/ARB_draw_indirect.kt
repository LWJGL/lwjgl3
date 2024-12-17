/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_draw_indirect = "ARBDrawIndirect".nativeClassGL("ARB_draw_indirect") {
    IntConstant(
        "DRAW_INDIRECT_BUFFER"..0x8F3F
    )

    IntConstant(
        "DRAW_INDIRECT_BUFFER_BINDING"..0x8F43
    )

    reuse(GL40C, "DrawArraysIndirect")
    reuse(GL40C, "DrawElementsIndirect")
}