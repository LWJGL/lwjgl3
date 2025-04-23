/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_fragment_density_map_offset = "QCOMFragmentDensityMapOffset".nativeClassVK("QCOM_fragment_density_map_offset", type = "device", postfix = "QCOM") {
    IntConstant(
        "QCOM_FRAGMENT_DENSITY_MAP_OFFSET_SPEC_VERSION".."3"
    )

    StringConstant(
        "QCOM_FRAGMENT_DENSITY_MAP_OFFSET_EXTENSION_NAME".."VK_QCOM_fragment_density_map_offset"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_QCOM".."1000425000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_PROPERTIES_QCOM".."1000425001",
        "STRUCTURE_TYPE_SUBPASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_QCOM".."1000425002"
    )

    EnumConstant(
        "IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_QCOM".enum(0x00008000)
    )
}