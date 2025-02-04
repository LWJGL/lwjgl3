/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_cooperative_vector = "NVCooperativeVector".nativeClassVK("NV_cooperative_vector", type = "device", postfix = "NV") {
    IntConstant(
        "NV_COOPERATIVE_VECTOR_SPEC_VERSION".."4"
    )

    StringConstant(
        "NV_COOPERATIVE_VECTOR_EXTENSION_NAME".."VK_NV_cooperative_vector"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_FEATURES_NV".."1000491000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_PROPERTIES_NV".."1000491001",
        "STRUCTURE_TYPE_COOPERATIVE_VECTOR_PROPERTIES_NV".."1000491002",
        "STRUCTURE_TYPE_CONVERT_COOPERATIVE_VECTOR_MATRIX_INFO_NV".."1000491004"
    )

    EnumConstant(
        "COMPONENT_TYPE_SINT8_PACKED_NV".."1000491000",
        "COMPONENT_TYPE_UINT8_PACKED_NV".."1000491001",
        "COMPONENT_TYPE_FLOAT_E4M3_NV".."1000491002",
        "COMPONENT_TYPE_FLOAT_E5M2_NV".."1000491003"
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_CONVERT_COOPERATIVE_VECTOR_MATRIX_BIT_NV".enum(0x100000000000L)
    )

    EnumConstant(
        "COOPERATIVE_VECTOR_MATRIX_LAYOUT_ROW_MAJOR_NV".."0",
        "COOPERATIVE_VECTOR_MATRIX_LAYOUT_COLUMN_MAJOR_NV".."1",
        "COOPERATIVE_VECTOR_MATRIX_LAYOUT_INFERENCING_OPTIMAL_NV".."2",
        "COOPERATIVE_VECTOR_MATRIX_LAYOUT_TRAINING_OPTIMAL_NV".."3"
    )

    VkResult(
        "GetPhysicalDeviceCooperativeVectorPropertiesNV",

        VkPhysicalDevice("physicalDevice"),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount"),
        nullable..VkCooperativeVectorPropertiesNV.p("pProperties")
    )

    VkResult(
        "ConvertCooperativeVectorMatrixNV",

        VkDevice("device"),
        VkConvertCooperativeVectorMatrixInfoNV.const.p("pInfo")
    )

    void(
        "CmdConvertCooperativeVectorMatrixNV",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pInfos")..uint32_t("infoCount"),
        VkConvertCooperativeVectorMatrixInfoNV.const.p("pInfos")
    )
}