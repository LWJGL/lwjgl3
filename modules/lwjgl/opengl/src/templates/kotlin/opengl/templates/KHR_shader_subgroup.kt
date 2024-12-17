/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val KHR_shader_subgroup = "KHRShaderSubgroup".nativeClassGL("KHR_shader_subgroup", postfix = KHR) {
    IntConstant(
        "SUBGROUP_SIZE_KHR"..0x9532,
        "SUBGROUP_SUPPORTED_STAGES_KHR"..0x9533,
        "SUBGROUP_SUPPORTED_FEATURES_KHR"..0x9534
    )

    IntConstant(
        "SUBGROUP_QUAD_ALL_STAGES_KHR"..0x9535
    )

    IntConstant(
        "SUBGROUP_FEATURE_BASIC_BIT_KHR"..0x00000001,
        "SUBGROUP_FEATURE_VOTE_BIT_KHR"..0x00000002,
        "SUBGROUP_FEATURE_ARITHMETIC_BIT_KHR"..0x00000004,
        "SUBGROUP_FEATURE_BALLOT_BIT_KHR"..0x00000008,
        "SUBGROUP_FEATURE_SHUFFLE_BIT_KHR"..0x00000010,
        "SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT_KHR"..0x00000020,
        "SUBGROUP_FEATURE_CLUSTERED_BIT_KHR"..0x00000040,
        "SUBGROUP_FEATURE_QUAD_BIT_KHR"..0x00000080
    )
}