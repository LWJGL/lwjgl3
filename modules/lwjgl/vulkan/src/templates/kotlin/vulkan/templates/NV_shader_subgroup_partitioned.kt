/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_shader_subgroup_partitioned = "NVShaderSubgroupPartitioned".nativeClassVK("NV_shader_subgroup_partitioned", type = "device", postfix = NV) {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "NV_SHADER_SUBGROUP_PARTITIONED_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_SHADER_SUBGROUP_PARTITIONED_EXTENSION_NAME".."VK_NV_shader_subgroup_partitioned"
    )

    EnumConstant(
        "Extends {@code VkSubgroupFeatureFlagBits}.",

        "SUBGROUP_FEATURE_PARTITIONED_BIT_NV".enum(0x00000100)
    )
}