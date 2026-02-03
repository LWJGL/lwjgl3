/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_cooperative_matrix_conversion = "QCOMCooperativeMatrixConversion".nativeClassVK("QCOM_cooperative_matrix_conversion", type = "device", postfix = "QCOM") {
    IntConstant(
        "QCOM_COOPERATIVE_MATRIX_CONVERSION_SPEC_VERSION".."1"
    )

    StringConstant(
        "QCOM_COOPERATIVE_MATRIX_CONVERSION_EXTENSION_NAME".."VK_QCOM_cooperative_matrix_conversion"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_CONVERSION_FEATURES_QCOM".."1000172000"
    )
}