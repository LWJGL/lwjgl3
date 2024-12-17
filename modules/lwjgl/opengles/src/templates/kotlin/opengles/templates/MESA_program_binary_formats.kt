/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val MESA_program_binary_formats = "MESAProgramBinaryFormats".nativeClassGLES("MESA_program_binary_formats", postfix = MESA) {
    IntConstant(
        "PROGRAM_BINARY_FORMAT_MESA"..0x875F
    )
}