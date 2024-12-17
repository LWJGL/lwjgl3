/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_gpu_shader5 = "ARBGPUShader5".nativeClassGL("ARB_gpu_shader5") {
    IntConstant(
        "GEOMETRY_SHADER_INVOCATIONS"..0x887F
    )

    IntConstant(
        "MAX_GEOMETRY_SHADER_INVOCATIONS"..0x8E5A,
        "MIN_FRAGMENT_INTERPOLATION_OFFSET"..0x8E5B,
        "MAX_FRAGMENT_INTERPOLATION_OFFSET"..0x8E5C,
        "FRAGMENT_INTERPOLATION_OFFSET_BITS"..0x8E5D,
        "MAX_VERTEX_STREAMS"..0x8E71
    )
}