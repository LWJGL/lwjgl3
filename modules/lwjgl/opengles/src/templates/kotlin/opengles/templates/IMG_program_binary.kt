/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val IMG_program_binary = "IMGProgramBinary".nativeClassGLES("IMG_program_binary", postfix = IMG) {
    IntConstant(
        "SGX_PROGRAM_BINARY_IMG"..0x9130
    )
}