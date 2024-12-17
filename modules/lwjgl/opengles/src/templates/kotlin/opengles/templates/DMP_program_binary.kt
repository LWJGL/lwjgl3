/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val DMP_program_binary = "DMPProgramBinary".nativeClassGLES("DMP_program_binary", postfix = DMP) {
    IntConstant(
        "SMAPHS30_PROGRAM_BINARY_DMP"..0x9251,
        "SMAPHS_PROGRAM_BINARY_DMP"..0x9252,
        "DMP_PROGRAM_BINARY_DMP"..0x9253
    )
}