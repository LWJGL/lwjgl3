/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_program_interface_query = "ARBProgramInterfaceQuery".nativeClassGL("ARB_program_interface_query") {
    IntConstant(
        "UNIFORM"..0x92E1,
        "UNIFORM_BLOCK"..0x92E2,
        "PROGRAM_INPUT"..0x92E3,
        "PROGRAM_OUTPUT"..0x92E4,
        "BUFFER_VARIABLE"..0x92E5,
        "SHADER_STORAGE_BLOCK"..0x92E6,
        "VERTEX_SUBROUTINE"..0x92E8,
        "TESS_CONTROL_SUBROUTINE"..0x92E9,
        "TESS_EVALUATION_SUBROUTINE"..0x92EA,
        "GEOMETRY_SUBROUTINE"..0x92EB,
        "FRAGMENT_SUBROUTINE"..0x92EC,
        "COMPUTE_SUBROUTINE"..0x92ED,
        "VERTEX_SUBROUTINE_UNIFORM"..0x92EE,
        "TESS_CONTROL_SUBROUTINE_UNIFORM"..0x92EF,
        "TESS_EVALUATION_SUBROUTINE_UNIFORM"..0x92F0,
        "GEOMETRY_SUBROUTINE_UNIFORM"..0x92F1,
        "FRAGMENT_SUBROUTINE_UNIFORM"..0x92F2,
        "COMPUTE_SUBROUTINE_UNIFORM"..0x92F3,
        "TRANSFORM_FEEDBACK_VARYING"..0x92F4
    )

    IntConstant(
        "ACTIVE_RESOURCES"..0x92F5,
        "MAX_NAME_LENGTH"..0x92F6,
        "MAX_NUM_ACTIVE_VARIABLES"..0x92F7,
        "MAX_NUM_COMPATIBLE_SUBROUTINES"..0x92F8
    )

    IntConstant(
        "NAME_LENGTH"..0x92F9,
        "TYPE"..0x92FA,
        "ARRAY_SIZE"..0x92FB,
        "OFFSET"..0x92FC,
        "BLOCK_INDEX"..0x92FD,
        "ARRAY_STRIDE"..0x92FE,
        "MATRIX_STRIDE"..0x92FF,
        "IS_ROW_MAJOR"..0x9300,
        "ATOMIC_COUNTER_BUFFER_INDEX"..0x9301,
        "BUFFER_BINDING"..0x9302,
        "BUFFER_DATA_SIZE"..0x9303,
        "NUM_ACTIVE_VARIABLES"..0x9304,
        "ACTIVE_VARIABLES"..0x9305,
        "REFERENCED_BY_VERTEX_SHADER"..0x9306,
        "REFERENCED_BY_TESS_CONTROL_SHADER"..0x9307,
        "REFERENCED_BY_TESS_EVALUATION_SHADER"..0x9308,
        "REFERENCED_BY_GEOMETRY_SHADER"..0x9309,
        "REFERENCED_BY_FRAGMENT_SHADER"..0x930A,
        "REFERENCED_BY_COMPUTE_SHADER"..0x930B,
        "TOP_LEVEL_ARRAY_SIZE"..0x930C,
        "TOP_LEVEL_ARRAY_STRIDE"..0x930D,
        "LOCATION"..0x930E,
        "LOCATION_INDEX"..0x930F,
        "IS_PER_PATCH"..0x92E7
    )

    reuse(GL43C, "GetProgramInterfaceiv")
    reuse(GL43C, "GetProgramResourceIndex")
    reuse(GL43C, "GetProgramResourceName")
    reuse(GL43C, "GetProgramResourceiv")
    reuse(GL43C, "GetProgramResourceLocation")
    reuse(GL43C, "GetProgramResourceLocationIndex")
}