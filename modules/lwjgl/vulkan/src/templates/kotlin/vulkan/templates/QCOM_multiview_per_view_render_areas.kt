/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_multiview_per_view_render_areas = "QCOMMultiviewPerViewRenderAreas".nativeClassVK("QCOM_multiview_per_view_render_areas", type = "device", postfix = "QCOM") {
    IntConstant(
        "QCOM_MULTIVIEW_PER_VIEW_RENDER_AREAS_SPEC_VERSION".."1"
    )

    StringConstant(
        "QCOM_MULTIVIEW_PER_VIEW_RENDER_AREAS_EXTENSION_NAME".."VK_QCOM_multiview_per_view_render_areas"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_RENDER_AREAS_FEATURES_QCOM".."1000510000",
        "STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM".."1000510001"
    )
}