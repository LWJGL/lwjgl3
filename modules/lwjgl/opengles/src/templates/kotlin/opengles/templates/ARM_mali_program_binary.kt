/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val ARM_mali_program_binary = "ARMMaliProgramBinary".nativeClassGLES("ARM_mali_program_binary", postfix = ARM) {
    IntConstant(
        "MALI_PROGRAM_BINARY_ARM"..0x8F61
    )
}