/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_dynamic_rendering_local_read = "KHRDynamicRenderingLocalRead".nativeClassVK("KHR_dynamic_rendering_local_read", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_DYNAMIC_RENDERING_LOCAL_READ_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_DYNAMIC_RENDERING_LOCAL_READ_EXTENSION_NAME".."VK_KHR_dynamic_rendering_local_read"
    )

    EnumConstant(
        "IMAGE_LAYOUT_RENDERING_LOCAL_READ_KHR".."1000232000"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES_KHR".."1000232000",
        "STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO_KHR".."1000232001",
        "STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO_KHR".."1000232002"
    )

    void(
        "CmdSetRenderingAttachmentLocationsKHR",

        VkCommandBuffer("commandBuffer"),
        VkRenderingAttachmentLocationInfo.const.p("pLocationInfo")
    )

    void(
        "CmdSetRenderingInputAttachmentIndicesKHR",

        VkCommandBuffer("commandBuffer"),
        VkRenderingInputAttachmentIndexInfo.const.p("pInputAttachmentIndexInfo")
    )
}