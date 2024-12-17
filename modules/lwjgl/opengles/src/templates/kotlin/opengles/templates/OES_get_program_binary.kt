/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_get_program_binary = "OESGetProgramBinary".nativeClassGLES("OES_get_program_binary", postfix = OES) {
    IntConstant(
        "PROGRAM_BINARY_LENGTH_OES"..0x8741
    )

    IntConstant(
        "NUM_PROGRAM_BINARY_FORMATS_OES"..0x87FE,
        "PROGRAM_BINARY_FORMATS_OES"..0x87FF
    )

    void(
        "GetProgramBinaryOES",

        GLuint("program"),
        AutoSize("binary")..GLsizei("bufSize"),
        nullable..Check(1)..GLsizei.p("length"),
        Check(1)..GLenum.p("binaryFormat"),
        void.p("binary")
    )

    void(
        "ProgramBinaryOES",

        GLuint("program"),
        GLenum("binaryFormat"),
        void.const.p("binary"),
        AutoSize("binary")..GLint("length")
    )
}