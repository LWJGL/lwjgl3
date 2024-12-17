/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_shader_thread_group = "NVShaderThreadGroup".nativeClassGL("NV_shader_thread_group", postfix = NV) {
    IntConstant(
        "WARP_SIZE_NV"..0x9339,
        "WARPS_PER_SM_NV"..0x933A,
        "SM_COUNT_NV"..0x933B
    )
}