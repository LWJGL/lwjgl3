/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_get_program_binary = "ARBGetProgramBinary".nativeClassGL("ARB_get_program_binary") {
    IntConstant(
        "PROGRAM_BINARY_RETRIEVABLE_HINT"..0x8257
    )

    IntConstant(
        "PROGRAM_BINARY_LENGTH"..0x8741
    )

    IntConstant(
        "NUM_PROGRAM_BINARY_FORMATS"..0x87FE,
        "PROGRAM_BINARY_FORMATS"..0x87FF
    )

    reuse(GL41C, "GetProgramBinary")
    reuse(GL41C, "ProgramBinary")
    reuse(GL41C, "ProgramParameteri")
}