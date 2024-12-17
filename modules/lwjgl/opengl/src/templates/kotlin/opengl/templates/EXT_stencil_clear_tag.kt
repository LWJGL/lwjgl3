/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_stencil_clear_tag = "EXTStencilClearTag".nativeClassGL("EXT_stencil_clear_tag", postfix = EXT) {
    IntConstant(
        "STENCIL_TAG_BITS_EXT"..0x88F2,
        "STENCIL_CLEAR_TAG_VALUE_EXT"..0x88F3
    )

    void(
        "StencilClearTagEXT",

        GLsizei("stencilTagBits"),
        GLuint("stencilClearTag")
    )
}