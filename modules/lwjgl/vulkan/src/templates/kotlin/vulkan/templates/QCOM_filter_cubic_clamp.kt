/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_filter_cubic_clamp = "QCOMFilterCubicClamp".nativeClassVK("QCOM_filter_cubic_clamp", type = "device", postfix = "QCOM") {
    IntConstant(
        "QCOM_FILTER_CUBIC_CLAMP_SPEC_VERSION".."1"
    )

    StringConstant(
        "QCOM_FILTER_CUBIC_CLAMP_EXTENSION_NAME".."VK_QCOM_filter_cubic_clamp"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_CLAMP_FEATURES_QCOM".."1000521000"
    )

    EnumConstant(
        "SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM".."1000521000"
    )
}