/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val AMD_interleaved_elements = "AMDInterleavedElements".nativeClassGL("AMD_interleaved_elements", postfix = AMD) {
    IntConstant(
        "VERTEX_ELEMENT_SWIZZLE_AMD"..0x91A4
    )

    IntConstant(
        "VERTEX_ID_SWIZZLE_AMD"..0x91A5
    )

    void(
        "VertexAttribParameteriAMD",

        GLuint("index"),
        GLenum("pname"),
        GLint("param")
    )
}