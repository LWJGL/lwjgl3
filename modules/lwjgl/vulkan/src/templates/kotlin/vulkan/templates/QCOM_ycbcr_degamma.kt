/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_ycbcr_degamma = "QCOMYcbcrDegamma".nativeClassVK("QCOM_ycbcr_degamma", type = "device", postfix = "QCOM") {
    IntConstant(
        "QCOM_YCBCR_DEGAMMA_SPEC_VERSION".."1"
    )

    StringConstant(
        "QCOM_YCBCR_DEGAMMA_EXTENSION_NAME".."VK_QCOM_ycbcr_degamma"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_DEGAMMA_FEATURES_QCOM".."1000520000",
        "STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_YCBCR_DEGAMMA_CREATE_INFO_QCOM".."1000520001"
    )
}