/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_mesh_shader.txt">NV_mesh_shader</a> extension.
 * 
 * <p>This extension provides a new mechanism allowing applications to use two new programmable shader types -- the task and mesh shader -- to generate
 * collections of geometric primitives to be processed by fixed-function primitive assembly and rasterization logic. When the task and mesh shaders are
 * drawn, they replace the standard programmable vertex processing pipeline, including vertex array attribute fetching, vertex shader processing,
 * tessellation, and the geometry shader processing.</p>
 * 
 * <p>Requires {@link GL45 OpenGL 4.5}.</p>
 */
public class NVMeshShader {

    static { GL.initialize(); }

    /** Accepted by the {@code type} parameter of {@link GL20C#glCreateShader CreateShader} and returned by the {@code params} parameter of {@link GL20C#glGetShaderiv GetShaderiv}. */
    public static final int
        GL_MESH_SHADER_NV = 0x9559,
        GL_TASK_SHADER_NV = 0x955A;

    /** Accepted by the {@code pname} parameter of {@link GL11C#glGetIntegerv GetIntegerv}, {@link GL11C#glGetBooleanv GetBooleanv}, {@link GL11C#glGetFloatv GetFloatv}, {@link GL11C#glGetDoublev GetDoublev} and {@link GL32C#glGetInteger64v GetInteger64v}. */
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

    /** Accepted by the {@code pname} parameter of {@link GL30C#glGetIntegeri_v GetIntegeri_v}, {@link GL30C#glGetBooleani_v GetBooleani_v}, {@link GL41C#glGetFloati_v GetFloati_v}, {@link GL41C#glGetDoublei_v GetDoublei_v} and {@link GL32C#glGetInteger64i_v GetInteger64i_v}. */
    public static final int
        GL_MAX_MESH_WORK_GROUP_SIZE_NV = 0x953B,
        GL_MAX_TASK_WORK_GROUP_SIZE_NV = 0x953C;

    /** Accepted by the {@code pname} parameter of {@link GL20C#glGetProgramiv GetProgramiv}. */
    public static final int
        GL_MESH_WORK_GROUP_SIZE_NV = 0x953E,
        GL_TASK_WORK_GROUP_SIZE_NV = 0x953F,
        GL_MESH_VERTICES_OUT_NV    = 0x9579,
        GL_MESH_PRIMITIVES_OUT_NV  = 0x957A,
        GL_MESH_OUTPUT_TYPE_NV     = 0x957B;

    /** Accepted by the {@code pname} parameter of {@link GL31C#glGetActiveUniformBlockiv GetActiveUniformBlockiv}. */
    public static final int
        GL_UNIFORM_BLOCK_REFERENCED_BY_MESH_SHADER_NV = 0x959C,
        GL_UNIFORM_BLOCK_REFERENCED_BY_TASK_SHADER_NV = 0x959D;

    /** Accepted by the {@code pname} parameter of {@link GL42C#glGetActiveAtomicCounterBufferiv GetActiveAtomicCounterBufferiv}. */
    public static final int
        GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_MESH_SHADER_NV = 0x959E,
        GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TASK_SHADER_NV = 0x959F;

    /** Accepted in the {@code props} array of {@link GL43C#glGetProgramResourceiv GetProgramResourceiv}. */
    public static final int
        GL_REFERENCED_BY_MESH_SHADER_NV = 0x95A0,
        GL_REFERENCED_BY_TASK_SHADER_NV = 0x95A1;

    /**
     * Accepted by the {@code programInterface} parameter of {@link GL43C#glGetProgramInterfaceiv GetProgramInterfaceiv}, {@link GL43C#glGetProgramResourceIndex GetProgramResourceIndex}, {@link GL43C#glGetProgramResourceName GetProgramResourceName},
     * {@link GL43C#glGetProgramResourceiv GetProgramResourceiv}, {@link GL43C#glGetProgramResourceLocation GetProgramResourceLocation}, and {@link GL43C#glGetProgramResourceLocationIndex GetProgramResourceLocationIndex}.
     */
    public static final int
        GL_MESH_SUBROUTINE_NV         = 0x957C,
        GL_TASK_SUBROUTINE_NV         = 0x957D,
        GL_MESH_SUBROUTINE_UNIFORM_NV = 0x957E,
        GL_TASK_SUBROUTINE_UNIFORM_NV = 0x957F;

    /** Accepted by the {@code stages} parameter of {@link GL41C#glUseProgramStages UseProgramStages}. */
    public static final int
        GL_MESH_SHADER_BIT_NV = 0x40,
        GL_TASK_SHADER_BIT_NV = 0x80;

    protected NVMeshShader() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawMeshTasksNV ] ---

    public static native void glDrawMeshTasksNV(@NativeType("GLuint") int first, @NativeType("GLuint") int count);

    // --- [ glDrawMeshTasksIndirectNV ] ---

    public static native void glDrawMeshTasksIndirectNV(@NativeType("GLintptr") long indirect);

    // --- [ glMultiDrawMeshTasksIndirectNV ] ---

    public static native void glMultiDrawMeshTasksIndirectNV(@NativeType("GLintptr") long indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride);

    // --- [ glMultiDrawMeshTasksIndirectCountNV ] ---

    public static native void glMultiDrawMeshTasksIndirectCountNV(@NativeType("GLintptr") long indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride);

}