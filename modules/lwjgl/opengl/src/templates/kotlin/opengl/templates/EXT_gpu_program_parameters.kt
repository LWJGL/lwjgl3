/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_gpu_program_parameters = "EXTGPUProgramParameters".nativeClassGL("EXT_gpu_program_parameters", postfix = EXT) {
    void(
        "ProgramEnvParameters4fvEXT",

        GLenum("target"),
        GLuint("index"),
        AutoSize(4, "params")..GLsizei("count"),
        GLfloat.const.p("params")
    )

    void(
        "ProgramLocalParameters4fvEXT",

        GLenum("target"),
        GLuint("index"),
        AutoSize(4, "params")..GLsizei("count"),
        GLfloat.const.p("params")
    )
}