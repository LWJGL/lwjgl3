/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_shader_subroutine = "ARBShaderSubroutine".nativeClassGL("ARB_shader_subroutine") {
    IntConstant(
        "ACTIVE_SUBROUTINES"..0x8DE5,
        "ACTIVE_SUBROUTINE_UNIFORMS"..0x8DE6,
        "ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS"..0x8E47,
        "ACTIVE_SUBROUTINE_MAX_LENGTH"..0x8E48,
        "ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH"..0x8E49
    )

    IntConstant(
        "MAX_SUBROUTINES"..0x8DE7,
        "MAX_SUBROUTINE_UNIFORM_LOCATIONS"..0x8DE8
    )

    IntConstant(
        "NUM_COMPATIBLE_SUBROUTINES"..0x8E4A,
        "COMPATIBLE_SUBROUTINES"..0x8E4B
    )

    reuse(GL40C, "GetSubroutineUniformLocation")
    reuse(GL40C, "GetSubroutineIndex")
    reuse(GL40C, "GetActiveSubroutineUniformiv")
    reuse(GL40C, "GetActiveSubroutineUniformName")
    reuse(GL40C, "GetActiveSubroutineName")
    reuse(GL40C, "UniformSubroutinesuiv")
    reuse(GL40C, "GetUniformSubroutineuiv")
    reuse(GL40C, "GetProgramStageiv")
}