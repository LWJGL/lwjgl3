/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_copy_memory_indirect = "NVCopyMemoryIndirect".nativeClassVK("NV_copy_memory_indirect", type = "device", postfix = "NV") {
    IntConstant(
        "NV_COPY_MEMORY_INDIRECT_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_COPY_MEMORY_INDIRECT_EXTENSION_NAME".."VK_NV_copy_memory_indirect"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_NV".."1000426000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_NV".."1000426001"
    )

    void(
        "CmdCopyMemoryIndirectNV",

        VkCommandBuffer("commandBuffer"),
        VkDeviceAddress("copyBufferAddress"),
        uint32_t("copyCount"),
        uint32_t("stride")
    )

    void(
        "CmdCopyMemoryToImageIndirectNV",

        VkCommandBuffer("commandBuffer"),
        VkDeviceAddress("copyBufferAddress"),
        AutoSize("pImageSubresources")..uint32_t("copyCount"),
        uint32_t("stride"),
        VkImage("dstImage"),
        VkImageLayout("dstImageLayout"),
        VkImageSubresourceLayers.const.p("pImageSubresources")
    )
}