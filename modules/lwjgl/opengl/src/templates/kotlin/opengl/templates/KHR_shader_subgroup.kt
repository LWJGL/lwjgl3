/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val KHR_shader_subgroup = "KHRShaderSubgroup".nativeClassGL("KHR_shader_subgroup", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension enables support for the {@code KHR_shader_subgroup} shading language extension in OpenGL.

        The extension adds API queries to be able to query
        ${ul(
            "the size of subgroups in this implementation (#SUBGROUP_SIZE_KHR)",
            "which shader stages support subgroup operations (#SUBGROUP_SUPPORTED_STAGES_KHR)",
            "which subgroup features are supported (#SUBGROUP_SUPPORTED_FEATURES_KHR)",
            "whether quad subgroup operations are supported in all stages supporting subgroup operations (#SUBGROUP_QUAD_ALL_STAGES_KHR)"
        )}

        In OpenGL implementations supporting SPIR-V, this extension enables the minimal subset of SPIR-V 1.3 which is required to support the subgroup features
        that are supported by the implementation.
        
        Requires ${GL43.core}.        
        """

    IntConstant(
        "Accepted as the {@code pname} argument for #GetIntegerv() and #GetInteger64v().",

        "SUBGROUP_SIZE_KHR"..0x9532,
        "SUBGROUP_SUPPORTED_STAGES_KHR"..0x9533,
        "SUBGROUP_SUPPORTED_FEATURES_KHR"..0x9534
    )

    IntConstant(
        "Accepted as the {@code pname} argument for #GetBooleanv().",

        "SUBGROUP_QUAD_ALL_STAGES_KHR"..0x9535
    )

    IntConstant(
        "Returned as bitfield in the {@code data} argument when #GetIntegerv() is queried with a {@code pname} of #SUBGROUP_SUPPORTED_FEATURES_KHR.",

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