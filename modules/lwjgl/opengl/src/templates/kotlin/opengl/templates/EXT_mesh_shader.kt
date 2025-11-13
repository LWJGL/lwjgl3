/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_mesh_shader = "EXTMeshShader".nativeClassGL("EXT_mesh_shader", postfix = EXT) {
    IntConstant(
        "MESH_SHADER_EXT"..0x9559,
        "TASK_SHADER_EXT"..0x955A
    )

    IntConstant(
        "MAX_TASK_UNIFORM_BLOCKS_EXT"..0x8E68,
        "MAX_TASK_TEXTURE_IMAGE_UNITS_EXT"..0x8E69,
        "MAX_TASK_IMAGE_UNIFORMS_EXT"..0x8E6A,
        "MAX_TASK_UNIFORM_COMPONENTS_EXT"..0x8E6B,
        "MAX_TASK_ATOMIC_COUNTER_BUFFERS_EXT"..0x8E6C,
        "MAX_TASK_ATOMIC_COUNTERS_EXT"..0x8E6D,
        "MAX_TASK_SHADER_STORAGE_BLOCKS_EXT"..0x8E6E,
        "MAX_COMBINED_TASK_UNIFORM_COMPONENTS_EXT"..0x8E6F,
        "MAX_MESH_UNIFORM_BLOCKS_EXT"..0x8E60,
        "MAX_MESH_TEXTURE_IMAGE_UNITS_EXT"..0x8E61,
        "MAX_MESH_IMAGE_UNIFORMS_EXT"..0x8E62,
        "MAX_MESH_UNIFORM_COMPONENTS_EXT"..0x8E63,
        "MAX_MESH_ATOMIC_COUNTER_BUFFERS_EXT"..0x8E64,
        "MAX_MESH_ATOMIC_COUNTERS_EXT"..0x8E65,
        "MAX_MESH_SHADER_STORAGE_BLOCKS_EXT"..0x8E66,
        "MAX_COMBINED_MESH_UNIFORM_COMPONENTS_EXT"..0x8E67,
        "MAX_TASK_WORK_GROUP_TOTAL_COUNT_EXT"..0x9740,
        "MAX_MESH_WORK_GROUP_TOTAL_COUNT_EXT"..0x9741,
        "MAX_MESH_WORK_GROUP_INVOCATIONS_EXT"..0x9757,
        "MAX_TASK_WORK_GROUP_INVOCATIONS_EXT"..0x9759,
        "MAX_TASK_PAYLOAD_SIZE_EXT"..0x9742,
        "MAX_TASK_SHARED_MEMORY_SIZE_EXT"..0x9743,
        "MAX_MESH_SHARED_MEMORY_SIZE_EXT"..0x9744,
        "MAX_TASK_PAYLOAD_AND_SHARED_MEMORY_SIZE_EXT"..0x9745,
        "MAX_MESH_PAYLOAD_AND_SHARED_MEMORY_SIZE_EXT"..0x9746,
        "MAX_MESH_OUTPUT_MEMORY_SIZE_EXT"..0x9747,
        "MAX_MESH_PAYLOAD_AND_OUTPUT_MEMORY_SIZE_EXT"..0x9748,
        "MAX_MESH_OUTPUT_VERTICES_EXT"..0x9538,
        "MAX_MESH_OUTPUT_PRIMITIVES_EXT"..0x9756,
        "MAX_MESH_OUTPUT_COMPONENTS_EXT"..0x9749,
        "MAX_MESH_OUTPUT_LAYERS_EXT"..0x974A,
        "MAX_MESH_MULTIVIEW_VIEW_COUNT_EXT"..0x9557,
        "MESH_OUTPUT_PER_VERTEX_GRANULARITY_EXT"..0x92DF,
        "MESH_OUTPUT_PER_PRIMITIVE_GRANULARITY_EXT"..0x9543,
        "MAX_PREFERRED_TASK_WORK_GROUP_INVOCATIONS_EXT"..0x974B,
        "MAX_PREFERRED_MESH_WORK_GROUP_INVOCATIONS_EXT"..0x974C
    )

    IntConstant(
        "MESH_PREFERS_LOCAL_INVOCATION_VERTEX_OUTPUT_EXT"..0x974D,
        "MESH_PREFERS_LOCAL_INVOCATION_PRIMITIVE_OUTPUT_EXT"..0x974E,
        "MESH_PREFERS_COMPACT_VERTEX_OUTPUT_EXT"..0x974F,
        "MESH_PREFERS_COMPACT_PRIMITIVE_OUTPUT_EXT"..0x9750
    )

    IntConstant(
        "MAX_TASK_WORK_GROUP_COUNT_EXT"..0x9751,
        "MAX_MESH_WORK_GROUP_COUNT_EXT"..0x9752,
        "MAX_TASK_WORK_GROUP_SIZE_EXT"..0x975A,
        "MAX_MESH_WORK_GROUP_SIZE_EXT"..0x9758
    )

    IntConstant(
        "TASK_WORK_GROUP_SIZE_EXT"..0x953F,
        "MESH_WORK_GROUP_SIZE_EXT"..0x953E,
        "MESH_VERTICES_OUT_EXT"..0x9579,
        "MESH_PRIMITIVES_OUT_EXT"..0x957A,
        "MESH_OUTPUT_TYPE_EXT"..0x957B
    )

    IntConstant(
        "UNIFORM_BLOCK_REFERENCED_BY_MESH_SHADER_EXT"..0x959C,
        "UNIFORM_BLOCK_REFERENCED_BY_TASK_SHADER_EXT"..0x959D
    )

    IntConstant(
        "ATOMIC_COUNTER_BUFFER_REFERENCED_BY_MESH_SHADER_EXT"..0x959E,
        "ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TASK_SHADER_EXT"..0x959F
    )

    IntConstant(
        "REFERENCED_BY_MESH_SHADER_EXT"..0x95A0,
        "REFERENCED_BY_TASK_SHADER_EXT"..0x95A1
    )

    IntConstant(
        "MESH_SUBROUTINE_EXT"..0x957C,
        "TASK_SUBROUTINE_EXT"..0x957D,
        "MESH_SUBROUTINE_UNIFORM_EXT"..0x957E,
        "TASK_SUBROUTINE_UNIFORM_EXT"..0x957F
    )

    IntConstant(
        "TASK_SHADER_INVOCATIONS_EXT"..0x9753,
        "MESH_SHADER_INVOCATIONS_EXT"..0x9754,
        "MESH_PRIMITIVES_GENERATED_EXT"..0x9755
    )

    IntConstant(
        "MESH_SHADER_BIT_EXT"..0x00000040,
        "TASK_SHADER_BIT_EXT"..0x00000080
    )

    void(
        "DrawMeshTasksEXT",

        GLuint("num_groups_x"),
        GLuint("num_groups_y"),
        GLuint("num_groups_z")
    )

    void(
        "DrawMeshTasksIndirectEXT",

        GLintptr("indirect")
    )

    void(
        "MultiDrawMeshTasksIndirectEXT",

        GLintptr("indirect"),
        GLsizei("drawcount"),
        GLsizei("stride")
    )

    void(
        "MultiDrawMeshTasksIndirectCountEXT",

        GLintptr("indirect"),
        GLintptr("drawcount"),
        GLsizei("maxdrawcount"),
        GLsizei("stride")
    )
}