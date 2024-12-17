/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_display_native_hdr = "AMDDisplayNativeHdr".nativeClassVK("AMD_display_native_hdr", type = "device", postfix = "AMD") {
    IntConstant(
        "AMD_DISPLAY_NATIVE_HDR_SPEC_VERSION".."1"
    )

    StringConstant(
        "AMD_DISPLAY_NATIVE_HDR_EXTENSION_NAME".."VK_AMD_display_native_hdr"
    )

    EnumConstant(
        "STRUCTURE_TYPE_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES_AMD".."1000213000",
        "STRUCTURE_TYPE_SWAPCHAIN_DISPLAY_NATIVE_HDR_CREATE_INFO_AMD".."1000213001"
    )

    EnumConstant(
        "COLOR_SPACE_DISPLAY_NATIVE_AMD".."1000213000"
    )

    void(
        "SetLocalDimmingAMD",

        VkDevice("device"),
        VkSwapchainKHR("swapChain"),
        VkBool32("localDimmingEnable")
    )
}