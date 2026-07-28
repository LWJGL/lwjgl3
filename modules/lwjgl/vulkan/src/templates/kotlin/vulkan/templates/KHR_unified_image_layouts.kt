/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_unified_image_layouts = "KHRUnifiedImageLayouts".nativeClassVK("KHR_unified_image_layouts", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_UNIFIED_IMAGE_LAYOUTS_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_UNIFIED_IMAGE_LAYOUTS_EXTENSION_NAME".."VK_KHR_unified_image_layouts"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFIED_IMAGE_LAYOUTS_FEATURES_KHR".."1000527000",
        "STRUCTURE_TYPE_ATTACHMENT_FEEDBACK_LOOP_INFO_EXT".."1000527001"
    )
}