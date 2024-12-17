/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_separate_shader_objects = "EXTSeparateShaderObjects".nativeClassGL("EXT_separate_shader_objects", postfix = EXT) {
    IntConstant(
        "ACTIVE_PROGRAM_EXT"..0x8B8D
    )

    void(
        "UseShaderProgramEXT",

        GLenum("type"),
        GLuint("program")
    )

    void(
        "ActiveProgramEXT",

        GLuint("program")
    )

    GLuint(
        "CreateShaderProgramEXT",

        GLenum("type"),
        GLcharUTF8.const.p("string")
    )
}