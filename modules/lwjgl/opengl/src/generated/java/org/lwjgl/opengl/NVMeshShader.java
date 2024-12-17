/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class NVMeshShader {

    static { GL.initialize(); }

    public static final int
        GL_MESH_SHADER_NV = 0x9559,
        GL_TASK_SHADER_NV = 0x955A;

    public static final int
        GL_MAX_MESH_UNIFORM_BLOCKS_NV               = 0x8E60,
        GL_MAX_MESH_TEXTURE_IMAGE_UNITS_NV          = 0x8E61,
        GL_MAX_MESH_IMAGE_UNIFORMS_NV               = 0x8E62,
        GL_MAX_MESH_UNIFORM_COMPONENTS_NV           = 0x8E63,
        GL_MAX_MESH_ATOMIC_COUNTER_BUFFERS_NV       = 0x8E64,
        GL_MAX_MESH_ATOMIC_COUNTERS_NV              = 0x8E65,
        GL_MAX_MESH_SHADER_STORAGE_BLOCKS_NV        = 0x8E66,
        GL_MAX_COMBINED_MESH_UNIFORM_COMPONENTS_NV  = 0x8E67,
        GL_MAX_TASK_UNIFORM_BLOCKS_NV               = 0x8E68,
        GL_MAX_TASK_TEXTURE_IMAGE_UNITS_NV          = 0x8E69,
        GL_MAX_TASK_IMAGE_UNIFORMS_NV               = 0x8E6A,
        GL_MAX_TASK_UNIFORM_COMPONENTS_NV           = 0x8E6B,
        GL_MAX_TASK_ATOMIC_COUNTER_BUFFERS_NV       = 0x8E6C,
        GL_MAX_TASK_ATOMIC_COUNTERS_NV              = 0x8E6D,
        GL_MAX_TASK_SHADER_STORAGE_BLOCKS_NV        = 0x8E6E,
        GL_MAX_COMBINED_TASK_UNIFORM_COMPONENTS_NV  = 0x8E6F,
        GL_MAX_MESH_WORK_GROUP_INVOCATIONS_NV       = 0x95A2,
        GL_MAX_TASK_WORK_GROUP_INVOCATIONS_NV       = 0x95A3,
        GL_MAX_MESH_TOTAL_MEMORY_SIZE_NV            = 0x9536,
        GL_MAX_TASK_TOTAL_MEMORY_SIZE_NV            = 0x9537,
        GL_MAX_MESH_OUTPUT_VERTICES_NV              = 0x9538,
        GL_MAX_MESH_OUTPUT_PRIMITIVES_NV            = 0x9539,
        GL_MAX_TASK_OUTPUT_COUNT_NV                 = 0x953A,
        GL_MAX_DRAW_MESH_TASKS_COUNT_NV             = 0x953D,
        GL_MAX_MESH_VIEWS_NV                        = 0x9557,
        GL_MESH_OUTPUT_PER_VERTEX_GRANULARITY_NV    = 0x92DF,
        GL_MESH_OUTPUT_PER_PRIMITIVE_GRANULARITY_NV = 0x9543;

    public static final int
        GL_MAX_MESH_WORK_GROUP_SIZE_NV = 0x953B,
        GL_MAX_TASK_WORK_GROUP_SIZE_NV = 0x953C;

    public static final int
        GL_MESH_WORK_GROUP_SIZE_NV = 0x953E,
        GL_TASK_WORK_GROUP_SIZE_NV = 0x953F,
        GL_MESH_VERTICES_OUT_NV    = 0x9579,
        GL_MESH_PRIMITIVES_OUT_NV  = 0x957A,
        GL_MESH_OUTPUT_TYPE_NV     = 0x957B;

    public static final int
        GL_UNIFORM_BLOCK_REFERENCED_BY_MESH_SHADER_NV = 0x959C,
        GL_UNIFORM_BLOCK_REFERENCED_BY_TASK_SHADER_NV = 0x959D;

    public static final int
        GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_MESH_SHADER_NV = 0x959E,
        GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TASK_SHADER_NV = 0x959F;

    public static final int
        GL_REFERENCED_BY_MESH_SHADER_NV = 0x95A0,
        GL_REFERENCED_BY_TASK_SHADER_NV = 0x95A1;

    public static final int
        GL_MESH_SUBROUTINE_NV         = 0x957C,
        GL_TASK_SUBROUTINE_NV         = 0x957D,
        GL_MESH_SUBROUTINE_UNIFORM_NV = 0x957E,
        GL_TASK_SUBROUTINE_UNIFORM_NV = 0x957F;

    public static final int
        GL_MESH_SHADER_BIT_NV = 0x40,
        GL_TASK_SHADER_BIT_NV = 0x80;

    protected NVMeshShader() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawMeshTasksNV ] ---

    /** {@code void glDrawMeshTasksNV(GLuint first, GLuint count)} */
    public static native void glDrawMeshTasksNV(@NativeType("GLuint") int first, @NativeType("GLuint") int count);

    // --- [ glDrawMeshTasksIndirectNV ] ---

    /** {@code void glDrawMeshTasksIndirectNV(GLintptr indirect)} */
    public static native void glDrawMeshTasksIndirectNV(@NativeType("GLintptr") long indirect);

    // --- [ glMultiDrawMeshTasksIndirectNV ] ---

    /** {@code void glMultiDrawMeshTasksIndirectNV(GLintptr indirect, GLsizei drawcount, GLsizei stride)} */
    public static native void glMultiDrawMeshTasksIndirectNV(@NativeType("GLintptr") long indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride);

    // --- [ glMultiDrawMeshTasksIndirectCountNV ] ---

    /** {@code void glMultiDrawMeshTasksIndirectCountNV(GLintptr indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static native void glMultiDrawMeshTasksIndirectCountNV(@NativeType("GLintptr") long indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride);

}