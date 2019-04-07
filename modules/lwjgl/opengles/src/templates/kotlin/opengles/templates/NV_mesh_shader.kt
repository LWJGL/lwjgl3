/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_mesh_shader = "NVMeshShader".nativeClassGLES("NV_mesh_shader", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a new mechanism allowing applications to use two new programmable shader types -- the task and mesh shader -- to generate
        collections of geometric primitives to be processed by fixed-function primitive assembly and rasterization logic. When the task and mesh shaders are
        drawn, they replace the standard programmable vertex processing pipeline, including vertex array attribute fetching, vertex shader processing,
        tessellation, and the geometry shader processing.

        Requires ${GLES32.core}.
        """

    IntConstant(
        "Accepted by the {@code type} parameter of #CreateShader() and returned by the {@code params} parameter of #GetShaderiv().",

        "MESH_SHADER_NV"..0x9559,
        "TASK_SHADER_NV"..0x955A
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of #GetIntegerv(), #GetBooleanv(), #GetFloatv(), and #GetInteger64v().",

        "MAX_MESH_UNIFORM_BLOCKS_NV"..0x8E60,
        "MAX_MESH_TEXTURE_IMAGE_UNITS_NV"..0x8E61,
        "MAX_MESH_IMAGE_UNIFORMS_NV"..0x8E62,
        "MAX_MESH_UNIFORM_COMPONENTS_NV"..0x8E63,
        "MAX_MESH_ATOMIC_COUNTER_BUFFERS_NV"..0x8E64,
        "MAX_MESH_ATOMIC_COUNTERS_NV"..0x8E65,
        "MAX_MESH_SHADER_STORAGE_BLOCKS_NV"..0x8E66,
        "MAX_COMBINED_MESH_UNIFORM_COMPONENTS_NV"..0x8E67,
        "MAX_TASK_UNIFORM_BLOCKS_NV"..0x8E68,
        "MAX_TASK_TEXTURE_IMAGE_UNITS_NV"..0x8E69,
        "MAX_TASK_IMAGE_UNIFORMS_NV"..0x8E6A,
        "MAX_TASK_UNIFORM_COMPONENTS_NV"..0x8E6B,
        "MAX_TASK_ATOMIC_COUNTER_BUFFERS_NV"..0x8E6C,
        "MAX_TASK_ATOMIC_COUNTERS_NV"..0x8E6D,
        "MAX_TASK_SHADER_STORAGE_BLOCKS_NV"..0x8E6E,
        "MAX_COMBINED_TASK_UNIFORM_COMPONENTS_NV"..0x8E6F,
        "MAX_MESH_WORK_GROUP_INVOCATIONS_NV"..0x95A2,
        "MAX_TASK_WORK_GROUP_INVOCATIONS_NV"..0x95A3,
        "MAX_MESH_TOTAL_MEMORY_SIZE_NV"..0x9536,
        "MAX_TASK_TOTAL_MEMORY_SIZE_NV"..0x9537,
        "MAX_MESH_OUTPUT_VERTICES_NV"..0x9538,
        "MAX_MESH_OUTPUT_PRIMITIVES_NV"..0x9539,
        "MAX_TASK_OUTPUT_COUNT_NV"..0x953A,
        "MAX_DRAW_MESH_TASKS_COUNT_NV"..0x953D,
        "MAX_MESH_VIEWS_NV"..0x9557,
        "MESH_OUTPUT_PER_VERTEX_GRANULARITY_NV"..0x92DF,
        "MESH_OUTPUT_PER_PRIMITIVE_GRANULARITY_NV"..0x9543
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of #GetIntegeri_v(), #GetBooleani_v(), and #GetInteger64i_v().",

        "MAX_MESH_WORK_GROUP_SIZE_NV"..0x953B,
        "MAX_TASK_WORK_GROUP_SIZE_NV"..0x953C
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of #GetProgramiv().",

        "MESH_WORK_GROUP_SIZE_NV"..0x953E,
        "TASK_WORK_GROUP_SIZE_NV"..0x953F,
        "MESH_VERTICES_OUT_NV"..0x9579,
        "MESH_PRIMITIVES_OUT_NV"..0x957A,
        "MESH_OUTPUT_TYPE_NV"..0x957B
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of #GetActiveUniformBlockiv().",

        "UNIFORM_BLOCK_REFERENCED_BY_MESH_SHADER_NV"..0x959C,
        "UNIFORM_BLOCK_REFERENCED_BY_TASK_SHADER_NV"..0x959D
    )

    IntConstant(
        "Accepted in the {@code props} array of #GetProgramResourceiv().",

        "REFERENCED_BY_MESH_SHADER_NV"..0x95A0,
        "REFERENCED_BY_TASK_SHADER_NV"..0x95A1
    )

    IntConstant(
        "Accepted by the {@code stages} parameter of #UseProgramStages().",

        "MESH_SHADER_BIT_NV"..0x00000040,
        "TASK_SHADER_BIT_NV"..0x00000080
    )

    void(
        "DrawMeshTasksNV",
        "",

        GLuint("first", ""),
        GLuint("count", "")
    )

    void(
        "DrawMeshTasksIndirectNV",
        "",

        GLintptr("indirect", "")
    )

    void(
        "MultiDrawMeshTasksIndirectNV",
        "",

        GLintptr("indirect", ""),
        GLsizei("drawcount", ""),
        GLsizei("stride", "")
    )
}