/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_filter_cubic_weights = "QCOMFilterCubicWeights".nativeClassVK("QCOM_filter_cubic_weights", type = "device", postfix = "QCOM") {
    IntConstant(
        "QCOM_FILTER_CUBIC_WEIGHTS_SPEC_VERSION".."1"
    )

    StringConstant(
        "QCOM_FILTER_CUBIC_WEIGHTS_EXTENSION_NAME".."VK_QCOM_filter_cubic_weights"
    )

    EnumConstant(
        "STRUCTURE_TYPE_SAMPLER_CUBIC_WEIGHTS_CREATE_INFO_QCOM".."1000519000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_WEIGHTS_FEATURES_QCOM".."1000519001",
        "STRUCTURE_TYPE_BLIT_IMAGE_CUBIC_WEIGHTS_INFO_QCOM".."1000519002"
    )

    EnumConstant(
        "CUBIC_FILTER_WEIGHTS_CATMULL_ROM_QCOM".."0",
        "CUBIC_FILTER_WEIGHTS_ZERO_TANGENT_CARDINAL_QCOM".."1",
        "CUBIC_FILTER_WEIGHTS_B_SPLINE_QCOM".."2",
        "CUBIC_FILTER_WEIGHTS_MITCHELL_NETRAVALI_QCOM".."3"
    )
}