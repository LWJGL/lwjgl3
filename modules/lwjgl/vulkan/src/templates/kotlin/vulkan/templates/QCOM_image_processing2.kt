/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_image_processing2 = "QCOMImageProcessing2".nativeClassVK("QCOM_image_processing2", type = "device", postfix = "QCOM") {
    IntConstant(
        "QCOM_IMAGE_PROCESSING_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "QCOM_IMAGE_PROCESSING_2_EXTENSION_NAME".."VK_QCOM_image_processing2"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_FEATURES_QCOM".."1000518000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_PROPERTIES_QCOM".."1000518001",
        "STRUCTURE_TYPE_SAMPLER_BLOCK_MATCH_WINDOW_CREATE_INFO_QCOM".."1000518002"
    )

    EnumConstant(
        "BLOCK_MATCH_WINDOW_COMPARE_MODE_MIN_QCOM".."0",
        "BLOCK_MATCH_WINDOW_COMPARE_MODE_MAX_QCOM".."1"
    )
}