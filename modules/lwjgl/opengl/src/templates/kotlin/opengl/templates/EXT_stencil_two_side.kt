/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_stencil_two_side = "EXTStencilTwoSide".nativeClassGL("EXT_stencil_two_side", postfix = EXT) {
    IntConstant(
        "STENCIL_TEST_TWO_SIDE_EXT"..0x8910
    )

    IntConstant(
        "ACTIVE_STENCIL_FACE_EXT"..0x8911
    )

    void(
        "ActiveStencilFaceEXT",

        GLenum("face")
    )
}