/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val VIV_shader_binary = "VIVShaderBinary".nativeClassGLES("VIV_shader_binary", postfix = VIV) {
    IntConstant(
        "SHADER_BINARY_VIV"..0x8FC4
    )
}