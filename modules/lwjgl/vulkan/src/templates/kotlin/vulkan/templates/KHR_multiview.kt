/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_multiview = "KHRMultiview".nativeClassVK("KHR_multiview", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_MULTIVIEW_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_MULTIVIEW_EXTENSION_NAME".."VK_KHR_multiview"
    )

    EnumConstant(
        "STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO_KHR".."1000053000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES_KHR".."1000053001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES_KHR".."1000053002"
    )

    EnumConstant(
        "DEPENDENCY_VIEW_LOCAL_BIT_KHR".enum(0x00000002)
    )
}