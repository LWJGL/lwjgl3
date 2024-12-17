/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_direct_mode_display = "EXTDirectModeDisplay".nativeClassVK("EXT_direct_mode_display", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_DIRECT_MODE_DISPLAY_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_DIRECT_MODE_DISPLAY_EXTENSION_NAME".."VK_EXT_direct_mode_display"
    )

    VkResult(
        "ReleaseDisplayEXT",

        VkPhysicalDevice("physicalDevice"),
        VkDisplayKHR("display")
    )
}