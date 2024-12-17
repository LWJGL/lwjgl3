/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val IMG_shader_binary = "IMGShaderBinary".nativeClassGLES("IMG_shader_binary", postfix = IMG) {
    IntConstant(
        "SGX_BINARY_IMG"..0x8C0A
    )
}