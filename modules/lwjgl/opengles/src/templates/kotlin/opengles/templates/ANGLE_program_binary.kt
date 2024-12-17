/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val ANGLE_program_binary = "ANGLEProgramBinary".nativeClassGLES("ANGLE_program_binary", postfix = ANGLE) {
    IntConstant(
        "PROGRAM_BINARY_ANGLE"..0x93A6
    )
}