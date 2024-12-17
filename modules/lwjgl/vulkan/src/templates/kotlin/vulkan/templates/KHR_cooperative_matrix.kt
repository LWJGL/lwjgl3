/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_cooperative_matrix = "KHRCooperativeMatrix".nativeClassVK("KHR_cooperative_matrix", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_COOPERATIVE_MATRIX_SPEC_VERSION".."2"
    )

    StringConstant(
        "KHR_COOPERATIVE_MATRIX_EXTENSION_NAME".."VK_KHR_cooperative_matrix"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_KHR".."1000506000",
        "STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_KHR".."1000506001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_KHR".."1000506002"
    )

    EnumConstant(
        "COMPONENT_TYPE_FLOAT16_KHR".."0",
        "COMPONENT_TYPE_FLOAT32_KHR".."1",
        "COMPONENT_TYPE_FLOAT64_KHR".."2",
        "COMPONENT_TYPE_SINT8_KHR".."3",
        "COMPONENT_TYPE_SINT16_KHR".."4",
        "COMPONENT_TYPE_SINT32_KHR".."5",
        "COMPONENT_TYPE_SINT64_KHR".."6",
        "COMPONENT_TYPE_UINT8_KHR".."7",
        "COMPONENT_TYPE_UINT16_KHR".."8",
        "COMPONENT_TYPE_UINT32_KHR".."9",
        "COMPONENT_TYPE_UINT64_KHR".."10"
    )

    EnumConstant(
        "SCOPE_DEVICE_KHR".."1",
        "SCOPE_WORKGROUP_KHR".."2",
        "SCOPE_SUBGROUP_KHR".."3",
        "SCOPE_QUEUE_FAMILY_KHR".."5"
    )

    VkResult(
        "GetPhysicalDeviceCooperativeMatrixPropertiesKHR",

        VkPhysicalDevice("physicalDevice"),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount"),
        nullable..VkCooperativeMatrixPropertiesKHR.p("pProperties")
    )
}