/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_uniform_buffer_unified_memory = "NVUniformBufferUnifiedMemory".nativeClassGL("NV_uniform_buffer_unified_memory", postfix = NV) {
    IntConstant(
        "UNIFORM_BUFFER_UNIFIED_NV"..0x936E
    )

    IntConstant(
        "UNIFORM_BUFFER_ADDRESS_NV"..0x936F
    )

    IntConstant(
        "UNIFORM_BUFFER_LENGTH_NV"..0x9370
    )
}