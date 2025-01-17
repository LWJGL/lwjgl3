/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NVX_multiview_per_view_attributes = "NVXMultiviewPerViewAttributes".nativeClassVK("NVX_multiview_per_view_attributes", type = "device", postfix = "NVX") {
    IntConstant(
        "NVX_MULTIVIEW_PER_VIEW_ATTRIBUTES_SPEC_VERSION".."1"
    )

    StringConstant(
        "NVX_MULTIVIEW_PER_VIEW_ATTRIBUTES_EXTENSION_NAME".."VK_NVX_multiview_per_view_attributes"
    )

    EnumConstant(
        "STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_ATTRIBUTES_INFO_NVX".."1000044009",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES_NVX".."1000097000"
    )

    EnumConstant(
        "SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX".enum(0x00000001),
        "SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX".enum(0x00000002)
    )
}