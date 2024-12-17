/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val ANGLE_translated_shader_source = "ANGLETranslatedShaderSource".nativeClassGLES("ANGLE_translated_shader_source", postfix = ANGLE) {
    IntConstant(
        "TRANSLATED_SHADER_SOURCE_LENGTH_ANGLE"..0x93A0
    )

    void(
        "GetTranslatedShaderSourceANGLE",

        GLuint("shader"),
        AutoSize("source")..GLsizei("bufsize"),
        nullable..Check(1)..GLsizei.p("length"),
        Return("length", "GLES20.glGetShaderi(shader, GL_TRANSLATED_SHADER_SOURCE_LENGTH_ANGLE)", heapAllocate = true)..GLcharUTF8.p("source")
    )
}