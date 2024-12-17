/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val FJ_shader_binary_GCCSO = "FJShaderBinaryGCCSO".nativeClassGLES("FJ_shader_binary_GCCSO", postfix = FJ) {
    IntConstant(
        "GCCSO_SHADER_BINARY_FJ"..0x9260
    )
}