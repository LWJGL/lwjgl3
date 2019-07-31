/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_shader_subgroup_partitioned = "NVShaderSubgroupPartitioned".nativeClassGLES("NV_shader_subgroup_partitioned", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension enables support for the {@code NV_shader_subgroup_partitioned} shading language extension in OpenGL.

        This extension adds a new #SUBGROUP_FEATURE_PARTITIONED_BIT_NV feature bit that is returned by queryies for #SUBGROUP_SUPPORTED_FEATURES_KHR.

        In OpenGL implementations supporting SPIR-V, this extension enables support for the {@code SPV_NV_shader_subgroup_partitioned} extension.

        Requires ${GLES31.core} and ${KHR_shader_subgroup.link}.
        """

    IntConstant(
        "Returned as bitfield in the {@code data} argument when #GetIntegerv() is queried with a {@code pname} of #SUBGROUP_SUPPORTED_FEATURES_KHR.",

        "SUBGROUP_FEATURE_PARTITIONED_BIT_NV"..0x00000100
    )
}