/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_compute_variable_group_size = "ARBComputeVariableGroupSize".nativeClassGL("ARB_compute_variable_group_size", postfix = ARB) {
    IntConstant(
        "MAX_COMPUTE_VARIABLE_GROUP_INVOCATIONS_ARB"..0x9344,
        "MAX_COMPUTE_FIXED_GROUP_INVOCATIONS_ARB"..0x90EB
    )

    IntConstant(
        "MAX_COMPUTE_VARIABLE_GROUP_SIZE_ARB"..0x9345,
        "MAX_COMPUTE_FIXED_GROUP_SIZE_ARB"..0x91BF
    )

    val src = GL43["DispatchCompute"]
    void(
        "DispatchComputeGroupSizeARB",

        src["num_groups_x"],
        src["num_groups_y"],
        src["num_groups_z"],
        GLuint("group_size_x"),
        GLuint("group_size_y"),
        GLuint("group_size_z")
    )
}