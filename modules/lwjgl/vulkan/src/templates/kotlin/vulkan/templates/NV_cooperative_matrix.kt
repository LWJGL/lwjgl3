/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_cooperative_matrix = "NVCooperativeMatrix".nativeClassVK("NV_cooperative_matrix", type = "device", postfix = "NV") {
    IntConstant(
        "NV_COOPERATIVE_MATRIX_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_COOPERATIVE_MATRIX_EXTENSION_NAME".."VK_NV_cooperative_matrix"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV".."1000249000",
        "STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV".."1000249001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_NV".."1000249002"
    )

    EnumConstant(
        "SCOPE_DEVICE_NV".."1",
        "SCOPE_WORKGROUP_NV".."2",
        "SCOPE_SUBGROUP_NV".."3",
        "SCOPE_QUEUE_FAMILY_NV".."5"
    )

    EnumConstant(
        "COMPONENT_TYPE_FLOAT16_NV".."0",
        "COMPONENT_TYPE_FLOAT32_NV".."1",
        "COMPONENT_TYPE_FLOAT64_NV".."2",
        "COMPONENT_TYPE_SINT8_NV".."3",
        "COMPONENT_TYPE_SINT16_NV".."4",
        "COMPONENT_TYPE_SINT32_NV".."5",
        "COMPONENT_TYPE_SINT64_NV".."6",
        "COMPONENT_TYPE_UINT8_NV".."7",
        "COMPONENT_TYPE_UINT16_NV".."8",
        "COMPONENT_TYPE_UINT32_NV".."9",
        "COMPONENT_TYPE_UINT64_NV".."10"
    )

    VkResult(
        "GetPhysicalDeviceCooperativeMatrixPropertiesNV",

        VkPhysicalDevice("physicalDevice"),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount"),
        nullable..VkCooperativeMatrixPropertiesNV.p("pProperties")
    )
}