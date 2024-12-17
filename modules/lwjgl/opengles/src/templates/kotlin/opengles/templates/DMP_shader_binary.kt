/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val DMP_shader_binary = "DMPShaderBinary".nativeClassGLES("DMP_shader_binary", postfix = DMP) {
    IntConstant(
        "SHADER_BINARY_DMP"..0x9250
    )
}