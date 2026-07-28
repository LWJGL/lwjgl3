/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class EXTMeshShader {

    static { GL.initialize(); }

    public static final int
        GL_MESH_SHADER_EXT = 0x9559,
        GL_TASK_SHADER_EXT = 0x955A;

    public static final int
        GL_MAX_TASK_UNIFORM_BLOCKS_EXT                   = 0x8E68,
        GL_MAX_TASK_TEXTURE_IMAGE_UNITS_EXT              = 0x8E69,
        GL_MAX_TASK_IMAGE_UNIFORMS_EXT                   = 0x8E6A,
        GL_MAX_TASK_UNIFORM_COMPONENTS_EXT               = 0x8E6B,
        GL_MAX_TASK_ATOMIC_COUNTER_BUFFERS_EXT           = 0x8E6C,
        GL_MAX_TASK_ATOMIC_COUNTERS_EXT                  = 0x8E6D,
        GL_MAX_TASK_SHADER_STORAGE_BLOCKS_EXT            = 0x8E6E,
        GL_MAX_COMBINED_TASK_UNIFORM_COMPONENTS_EXT      = 0x8E6F,
        GL_MAX_MESH_UNIFORM_BLOCKS_EXT                   = 0x8E60,
        GL_MAX_MESH_TEXTURE_IMAGE_UNITS_EXT              = 0x8E61,
        GL_MAX_MESH_IMAGE_UNIFORMS_EXT                   = 0x8E62,
        GL_MAX_MESH_UNIFORM_COMPONENTS_EXT               = 0x8E63,
        GL_MAX_MESH_ATOMIC_COUNTER_BUFFERS_EXT           = 0x8E64,
        GL_MAX_MESH_ATOMIC_COUNTERS_EXT                  = 0x8E65,
        GL_MAX_MESH_SHADER_STORAGE_BLOCKS_EXT            = 0x8E66,
        GL_MAX_COMBINED_MESH_UNIFORM_COMPONENTS_EXT      = 0x8E67,
        GL_MAX_TASK_WORK_GROUP_TOTAL_COUNT_EXT           = 0x9740,
        GL_MAX_MESH_WORK_GROUP_TOTAL_COUNT_EXT           = 0x9741,
        GL_MAX_MESH_WORK_GROUP_INVOCATIONS_EXT           = 0x9757,
        GL_MAX_TASK_WORK_GROUP_INVOCATIONS_EXT           = 0x9759,
        GL_MAX_TASK_PAYLOAD_SIZE_EXT                     = 0x9742,
        GL_MAX_TASK_SHARED_MEMORY_SIZE_EXT               = 0x9743,
        GL_MAX_MESH_SHARED_MEMORY_SIZE_EXT               = 0x9744,
        GL_MAX_TASK_PAYLOAD_AND_SHARED_MEMORY_SIZE_EXT   = 0x9745,
        GL_MAX_MESH_PAYLOAD_AND_SHARED_MEMORY_SIZE_EXT   = 0x9746,
        GL_MAX_MESH_OUTPUT_MEMORY_SIZE_EXT               = 0x9747,
        GL_MAX_MESH_PAYLOAD_AND_OUTPUT_MEMORY_SIZE_EXT   = 0x9748,
        GL_MAX_MESH_OUTPUT_VERTICES_EXT                  = 0x9538,
        GL_MAX_MESH_OUTPUT_PRIMITIVES_EXT                = 0x9756,
        GL_MAX_MESH_OUTPUT_COMPONENTS_EXT                = 0x9749,
        GL_MAX_MESH_OUTPUT_LAYERS_EXT                    = 0x974A,
        GL_MAX_MESH_MULTIVIEW_VIEW_COUNT_EXT             = 0x9557,
        GL_MESH_OUTPUT_PER_VERTEX_GRANULARITY_EXT        = 0x92DF,
        GL_MESH_OUTPUT_PER_PRIMITIVE_GRANULARITY_EXT     = 0x9543,
        GL_MAX_PREFERRED_TASK_WORK_GROUP_INVOCATIONS_EXT = 0x974B,
        GL_MAX_PREFERRED_MESH_WORK_GROUP_INVOCATIONS_EXT = 0x974C;

    public static final int
        GL_MESH_PREFERS_LOCAL_INVOCATION_VERTEX_OUTPUT_EXT    = 0x974D,
        GL_MESH_PREFERS_LOCAL_INVOCATION_PRIMITIVE_OUTPUT_EXT = 0x974E,
        GL_MESH_PREFERS_COMPACT_VERTEX_OUTPUT_EXT             = 0x974F,
        GL_MESH_PREFERS_COMPACT_PRIMITIVE_OUTPUT_EXT          = 0x9750;

    public static final int
        GL_MAX_TASK_WORK_GROUP_COUNT_EXT = 0x9751,
        GL_MAX_MESH_WORK_GROUP_COUNT_EXT = 0x9752,
        GL_MAX_TASK_WORK_GROUP_SIZE_EXT  = 0x975A,
        GL_MAX_MESH_WORK_GROUP_SIZE_EXT  = 0x9758;

    public static final int
        GL_TASK_WORK_GROUP_SIZE_EXT = 0x953F,
        GL_MESH_WORK_GROUP_SIZE_EXT = 0x953E,
        GL_MESH_VERTICES_OUT_EXT    = 0x9579,
        GL_MESH_PRIMITIVES_OUT_EXT  = 0x957A,
        GL_MESH_OUTPUT_TYPE_EXT     = 0x957B;

    public static final int
        GL_UNIFORM_BLOCK_REFERENCED_BY_MESH_SHADER_EXT = 0x959C,
        GL_UNIFORM_BLOCK_REFERENCED_BY_TASK_SHADER_EXT = 0x959D;

    public static final int
        GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_MESH_SHADER_EXT = 0x959E,
        GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TASK_SHADER_EXT = 0x959F;

    public static final int
        GL_REFERENCED_BY_MESH_SHADER_EXT = 0x95A0,
        GL_REFERENCED_BY_TASK_SHADER_EXT = 0x95A1;

    public static final int
        GL_MESH_SUBROUTINE_EXT         = 0x957C,
        GL_TASK_SUBROUTINE_EXT         = 0x957D,
        GL_MESH_SUBROUTINE_UNIFORM_EXT = 0x957E,
        GL_TASK_SUBROUTINE_UNIFORM_EXT = 0x957F;

    public static final int
        GL_TASK_SHADER_INVOCATIONS_EXT   = 0x9753,
        GL_MESH_SHADER_INVOCATIONS_EXT   = 0x9754,
        GL_MESH_PRIMITIVES_GENERATED_EXT = 0x9755;

    public static final int
        GL_MESH_SHADER_BIT_EXT = 0x40,
        GL_TASK_SHADER_BIT_EXT = 0x80;

    protected EXTMeshShader() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawMeshTasksEXT ] ---

    /** {@code void glDrawMeshTasksEXT(GLuint num_groups_x, GLuint num_groups_y, GLuint num_groups_z)} */
    public static native void glDrawMeshTasksEXT(@NativeType("GLuint") int num_groups_x, @NativeType("GLuint") int num_groups_y, @NativeType("GLuint") int num_groups_z);

    // --- [ glDrawMeshTasksIndirectEXT ] ---

    /** {@code void glDrawMeshTasksIndirectEXT(GLintptr indirect)} */
    public static native void glDrawMeshTasksIndirectEXT(@NativeType("GLintptr") long indirect);

    // --- [ glMultiDrawMeshTasksIndirectEXT ] ---

    /** {@code void glMultiDrawMeshTasksIndirectEXT(GLintptr indirect, GLsizei drawcount, GLsizei stride)} */
    public static native void glMultiDrawMeshTasksIndirectEXT(@NativeType("GLintptr") long indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride);

    // --- [ glMultiDrawMeshTasksIndirectCountEXT ] ---

    /** {@code void glMultiDrawMeshTasksIndirectCountEXT(GLintptr indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static native void glMultiDrawMeshTasksIndirectCountEXT(@NativeType("GLintptr") long indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride);

}