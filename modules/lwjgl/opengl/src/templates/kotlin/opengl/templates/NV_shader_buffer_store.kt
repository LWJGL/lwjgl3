/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_shader_buffer_store = "NVShaderBufferStore".nativeClassGL("NV_shader_buffer_store", postfix = NV) {
    IntConstant(
        "SHADER_GLOBAL_ACCESS_BARRIER_BIT_NV"..0x00000010
    )
}