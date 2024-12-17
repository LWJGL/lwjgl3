/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_fragment_program = "ARBFragmentProgram".nativeClassGL("ARB_fragment_program", postfix = ARB) {
    IntConstant(
        "FRAGMENT_PROGRAM_ARB"..0x8804
    )

    IntConstant(
        "PROGRAM_ALU_INSTRUCTIONS_ARB"..0x8805,
        "PROGRAM_TEX_INSTRUCTIONS_ARB"..0x8806,
        "PROGRAM_TEX_INDIRECTIONS_ARB"..0x8807,
        "PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB"..0x8808,
        "PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB"..0x8809,
        "PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB"..0x880A,
        "MAX_PROGRAM_ALU_INSTRUCTIONS_ARB"..0x880B,
        "MAX_PROGRAM_TEX_INSTRUCTIONS_ARB"..0x880C,
        "MAX_PROGRAM_TEX_INDIRECTIONS_ARB"..0x880D,
        "MAX_PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB"..0x880E,
        "MAX_PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB"..0x880F,
        "MAX_PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB"..0x8810
    )

    IntConstant(
        "MAX_TEXTURE_COORDS_ARB"..0x8871,
        "MAX_TEXTURE_IMAGE_UNITS_ARB"..0x8872
    )

}