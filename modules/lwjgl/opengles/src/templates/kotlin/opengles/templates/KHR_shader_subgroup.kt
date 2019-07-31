/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val KHR_shader_subgroup = "KHRShaderSubgroup".nativeClassGLES("KHR_shader_subgroup", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension enables support for the {@code KHR_shader_subgroup} shading language extension in OpenGL ES.

        The extension adds API queries to be able to query
        ${ul(
            "the size of subgroups in this implementation (#SUBGROUP_SIZE_KHR)",
            "which shader stages support subgroup operations (#SUBGROUP_SUPPORTED_STAGES_KHR)",
            "which subgroup features are supported (#SUBGROUP_SUPPORTED_FEATURES_KHR)",
            "whether quad subgroup operations are supported in all stages supporting subgroup operations (#SUBGROUP_QUAD_ALL_STAGES_KHR)"
        )}

        In OpenGL ES implementations, this extension does NOT add support for SPIR-V or for any of the built-in shading language functions (8.18) that have
        {@code genDType} (double) prototypes.
        
        Requires ${GLES31.core}.        
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