/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_shader_subroutine = "ARBShaderSubroutine".nativeClassGL("ARB_shader_subroutine") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds support to shaders for "indirect subroutine calls", where a single shader can include many subroutines and dynamically select
        through the API which subroutine is called from each call site. Switching subroutines dynamically in this fashion can avoid the cost of recompiling and
        managing multiple shaders, while still retaining most of the performance of specialized shaders.

        Requires ${ARB_gpu_shader5.link}. ${GL40.promoted}
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetProgramStageiv.",

        "ACTIVE_SUBROUTINES"..0x8DE5,
        "ACTIVE_SUBROUTINE_UNIFORMS"..0x8DE6,
        "ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS"..0x8E47,
        "ACTIVE_SUBROUTINE_MAX_LENGTH"..0x8E48,
        "ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH"..0x8E49
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.",

        "MAX_SUBROUTINES"..0x8DE7,
        "MAX_SUBROUTINE_UNIFORM_LOCATIONS"..0x8DE8
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetActiveSubroutineUniformiv.",

        "NUM_COMPATIBLE_SUBROUTINES"..0x8E4A,
        "COMPATIBLE_SUBROUTINES"..0x8E4B
    )

    GL40C reuse "GetSubroutineUniformLocation"
    GL40C reuse "GetSubroutineIndex"
    GL40C reuse "GetActiveSubroutineUniformiv"
    GL40C reuse "GetActiveSubroutineUniformName"
    GL40C reuse "GetActiveSubroutineName"
    GL40C reuse "UniformSubroutinesuiv"
    GL40C reuse "GetUniformSubroutineuiv"
    GL40C reuse "GetProgramStageiv"
}