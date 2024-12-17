/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_blend_func_extended = "ARBBlendFuncExtended".nativeClassGL("ARB_blend_func_extended") {
    IntConstant(
        "SRC1_COLOR"..0x88F9,
        "ONE_MINUS_SRC1_COLOR"..0x88FA,
        "ONE_MINUS_SRC1_ALPHA"..0x88FB
    )

    IntConstant(
        "MAX_DUAL_SOURCE_DRAW_BUFFERS"..0x88FC
    )

    reuse(GL33C, "BindFragDataLocationIndexed")
    reuse(GL33C, "GetFragDataIndex")
}