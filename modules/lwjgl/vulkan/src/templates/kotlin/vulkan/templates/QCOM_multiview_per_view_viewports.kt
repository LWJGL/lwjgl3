/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_multiview_per_view_viewports = "QCOMMultiviewPerViewViewports".nativeClassVK("QCOM_multiview_per_view_viewports", type = "device", postfix = "QCOM") {
    IntConstant(
        "QCOM_MULTIVIEW_PER_VIEW_VIEWPORTS_SPEC_VERSION".."1"
    )

    StringConstant(
        "QCOM_MULTIVIEW_PER_VIEW_VIEWPORTS_EXTENSION_NAME".."VK_QCOM_multiview_per_view_viewports"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_VIEWPORTS_FEATURES_QCOM".."1000488000"
    )
}