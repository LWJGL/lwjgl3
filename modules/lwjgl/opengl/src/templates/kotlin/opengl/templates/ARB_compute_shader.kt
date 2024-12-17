/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_compute_shader = "ARBComputeShader".nativeClassGL("ARB_compute_shader") {
    IntConstant(
        "COMPUTE_SHADER"..0x91B9
    )

    IntConstant(
        "MAX_COMPUTE_UNIFORM_BLOCKS"..0x91BB,
        "MAX_COMPUTE_TEXTURE_IMAGE_UNITS"..0x91BC,
        "MAX_COMPUTE_IMAGE_UNIFORMS"..0x91BD,
        "MAX_COMPUTE_SHARED_MEMORY_SIZE"..0x8262,
        "MAX_COMPUTE_UNIFORM_COMPONENTS"..0x8263,
        "MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS"..0x8264,
        "MAX_COMPUTE_ATOMIC_COUNTERS"..0x8265,
        "MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS"..0x8266,
        "MAX_COMPUTE_WORK_GROUP_INVOCATIONS"..0x90EB
    )

    IntConstant(
        "MAX_COMPUTE_WORK_GROUP_COUNT"..0x91BE,
        "MAX_COMPUTE_WORK_GROUP_SIZE"..0x91BF
    )

    IntConstant(
        "COMPUTE_WORK_GROUP_SIZE"..0x8267
    )

    IntConstant(
        "UNIFORM_BLOCK_REFERENCED_BY_COMPUTE_SHADER"..0x90EC
    )

    IntConstant(
        "ATOMIC_COUNTER_BUFFER_REFERENCED_BY_COMPUTE_SHADER"..0x90ED
    )

    IntConstant(
        "DISPATCH_INDIRECT_BUFFER"..0x90EE
    )

    IntConstant(
        "DISPATCH_INDIRECT_BUFFER_BINDING"..0x90EF
    )

    IntConstant(
        "COMPUTE_SHADER_BIT"..0x00000020
    )

    reuse(GL43C, "DispatchCompute")
    reuse(GL43C, "DispatchComputeIndirect")
}