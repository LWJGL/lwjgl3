/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class ARBComputeVariableGroupSize {

    static { GL.initialize(); }

    public static final int
        GL_MAX_COMPUTE_VARIABLE_GROUP_INVOCATIONS_ARB = 0x9344,
        GL_MAX_COMPUTE_FIXED_GROUP_INVOCATIONS_ARB    = 0x90EB;

    public static final int
        GL_MAX_COMPUTE_VARIABLE_GROUP_SIZE_ARB = 0x9345,
        GL_MAX_COMPUTE_FIXED_GROUP_SIZE_ARB    = 0x91BF;

    protected ARBComputeVariableGroupSize() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDispatchComputeGroupSizeARB ] ---

    /** {@code void glDispatchComputeGroupSizeARB(GLuint num_groups_x, GLuint num_groups_y, GLuint num_groups_z, GLuint group_size_x, GLuint group_size_y, GLuint group_size_z)} */
    public static native void glDispatchComputeGroupSizeARB(@NativeType("GLuint") int num_groups_x, @NativeType("GLuint") int num_groups_y, @NativeType("GLuint") int num_groups_z, @NativeType("GLuint") int group_size_x, @NativeType("GLuint") int group_size_y, @NativeType("GLuint") int group_size_z);

}