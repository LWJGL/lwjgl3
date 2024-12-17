/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_cooperative_matrix2 = "NVCooperativeMatrix2".nativeClassVK("NV_cooperative_matrix2", type = "device", postfix = "NV") {
    IntConstant(
        "NV_COOPERATIVE_MATRIX_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_COOPERATIVE_MATRIX_2_EXTENSION_NAME".."VK_NV_cooperative_matrix2"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_FEATURES_NV".."1000593000",
        "STRUCTURE_TYPE_COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_PROPERTIES_NV".."1000593001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_PROPERTIES_NV".."1000593002"
    )

    VkResult(
        "GetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV",

        VkPhysicalDevice("physicalDevice"),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount"),
        nullable..VkCooperativeMatrixFlexibleDimensionsPropertiesNV.p("pProperties")
    )
}