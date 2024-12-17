/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class ARBComputeShader {

    static { GL.initialize(); }

    public static final int GL_COMPUTE_SHADER = 0x91B9;

    public static final int
        GL_MAX_COMPUTE_UNIFORM_BLOCKS              = 0x91BB,
        GL_MAX_COMPUTE_TEXTURE_IMAGE_UNITS         = 0x91BC,
        GL_MAX_COMPUTE_IMAGE_UNIFORMS              = 0x91BD,
        GL_MAX_COMPUTE_SHARED_MEMORY_SIZE          = 0x8262,
        GL_MAX_COMPUTE_UNIFORM_COMPONENTS          = 0x8263,
        GL_MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS      = 0x8264,
        GL_MAX_COMPUTE_ATOMIC_COUNTERS             = 0x8265,
        GL_MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS = 0x8266,
        GL_MAX_COMPUTE_WORK_GROUP_INVOCATIONS      = 0x90EB;

    public static final int
        GL_MAX_COMPUTE_WORK_GROUP_COUNT = 0x91BE,
        GL_MAX_COMPUTE_WORK_GROUP_SIZE  = 0x91BF;

    public static final int GL_COMPUTE_WORK_GROUP_SIZE = 0x8267;

    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_COMPUTE_SHADER = 0x90EC;

    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_COMPUTE_SHADER = 0x90ED;

    public static final int GL_DISPATCH_INDIRECT_BUFFER = 0x90EE;

    public static final int GL_DISPATCH_INDIRECT_BUFFER_BINDING = 0x90EF;

    public static final int GL_COMPUTE_SHADER_BIT = 0x20;

    protected ARBComputeShader() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDispatchCompute ] ---

    /** {@code void glDispatchCompute(GLuint num_groups_x, GLuint num_groups_y, GLuint num_groups_z)} */
    public static void glDispatchCompute(@NativeType("GLuint") int num_groups_x, @NativeType("GLuint") int num_groups_y, @NativeType("GLuint") int num_groups_z) {
        GL43C.glDispatchCompute(num_groups_x, num_groups_y, num_groups_z);
    }

    // --- [ glDispatchComputeIndirect ] ---

    /** {@code void glDispatchComputeIndirect(GLintptr indirect)} */
    public static void glDispatchComputeIndirect(@NativeType("GLintptr") long indirect) {
        GL43C.glDispatchComputeIndirect(indirect);
    }

}