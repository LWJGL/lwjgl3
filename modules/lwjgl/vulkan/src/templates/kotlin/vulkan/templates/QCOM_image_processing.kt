/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_image_processing = "QCOMImageProcessing".nativeClassVK("QCOM_image_processing", type = "device", postfix = "QCOM") {
    IntConstant(
        "QCOM_IMAGE_PROCESSING_SPEC_VERSION".."1"
    )

    StringConstant(
        "QCOM_IMAGE_PROCESSING_EXTENSION_NAME".."VK_QCOM_image_processing"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_FEATURES_QCOM".."1000440000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_PROPERTIES_QCOM".."1000440001",
        "STRUCTURE_TYPE_IMAGE_VIEW_SAMPLE_WEIGHT_CREATE_INFO_QCOM".."1000440002"
    )

    EnumConstant(
        "SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM".enum(0x00000010)
    )

    EnumConstant(
        "IMAGE_USAGE_SAMPLE_WEIGHT_BIT_QCOM".enum(0x00100000),
        "IMAGE_USAGE_SAMPLE_BLOCK_MATCH_BIT_QCOM".enum(0x00200000)
    )

    EnumConstant(
        "DESCRIPTOR_TYPE_SAMPLE_WEIGHT_IMAGE_QCOM".."1000440000",
        "DESCRIPTOR_TYPE_BLOCK_MATCH_IMAGE_QCOM".."1000440001"
    )

    EnumConstantLong(
        "FORMAT_FEATURE_2_WEIGHT_IMAGE_BIT_QCOM".enum(0x400000000L),
        "FORMAT_FEATURE_2_WEIGHT_SAMPLED_IMAGE_BIT_QCOM".enum(0x800000000L),
        "FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM".enum(0x1000000000L),
        "FORMAT_FEATURE_2_BOX_FILTER_SAMPLED_BIT_QCOM".enum(0x2000000000L)
    )
}