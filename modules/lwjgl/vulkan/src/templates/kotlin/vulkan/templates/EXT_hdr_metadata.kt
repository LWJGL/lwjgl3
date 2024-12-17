/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_hdr_metadata = "EXTHdrMetadata".nativeClassVK("EXT_hdr_metadata", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_HDR_METADATA_SPEC_VERSION".."3"
    )

    StringConstant(
        "EXT_HDR_METADATA_EXTENSION_NAME".."VK_EXT_hdr_metadata"
    )

    EnumConstant(
        "STRUCTURE_TYPE_HDR_METADATA_EXT".."1000105000"
    )

    void(
        "SetHdrMetadataEXT",

        VkDevice("device"),
        AutoSize("pSwapchains", "pMetadata")..uint32_t("swapchainCount"),
        VkSwapchainKHR.const.p("pSwapchains"),
        VkHdrMetadataEXT.const.p("pMetadata")
    )
}