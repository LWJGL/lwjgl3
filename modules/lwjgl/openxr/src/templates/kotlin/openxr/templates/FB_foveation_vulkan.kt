/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_foveation_vulkan = "FBFoveationVulkan".nativeClassXR("FB_foveation_vulkan", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_foveation_vulkan_SPEC_VERSION".."1"
    )

    StringConstant(
        "FB_FOVEATION_VULKAN_EXTENSION_NAME".."XR_FB_foveation_vulkan"
    )

    EnumConstant(
        "TYPE_SWAPCHAIN_IMAGE_FOVEATION_VULKAN_FB".."1000160000"
    )
}