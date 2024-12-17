/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val AMD_program_binary_Z400 = "AMDProgramBinaryZ400".nativeClassGLES("AMD_program_binary_Z400", postfix = AMD) {
    IntConstant(
        "Z400_BINARY_AMD"..0x8740
    )
}