/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_image_processing3 = "QCOMImageProcessing3".nativeClassVK("QCOM_image_processing3", type = "device", postfix = "QCOM") {
    IntConstant(
        "QCOM_IMAGE_PROCESSING_3_SPEC_VERSION".."1"
    )

    StringConstant(
        "QCOM_IMAGE_PROCESSING_3_EXTENSION_NAME".."VK_QCOM_image_processing3"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_3_FEATURES_QCOM".."1000303000"
    )

    EnumConstantLong(
        "FORMAT_FEATURE_2_BLOCK_MATCHING_SXD_BIT_QCOM".enum(0x100000000000L)
    )
}