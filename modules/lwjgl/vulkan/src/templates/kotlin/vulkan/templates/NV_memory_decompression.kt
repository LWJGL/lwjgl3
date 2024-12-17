/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_memory_decompression = "NVMemoryDecompression".nativeClassVK("NV_memory_decompression", type = "device", postfix = "NV") {
    IntConstant(
        "NV_MEMORY_DECOMPRESSION_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_MEMORY_DECOMPRESSION_EXTENSION_NAME".."VK_NV_memory_decompression"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_NV".."1000427000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_NV".."1000427001"
    )

    EnumConstantLong(
        "MEMORY_DECOMPRESSION_METHOD_GDEFLATE_1_0_BIT_NV".enum(0x00000001L)
    )

    void(
        "CmdDecompressMemoryNV",

        VkCommandBuffer("commandBuffer"),
        AutoSize("pDecompressMemoryRegions")..uint32_t("decompressRegionCount"),
        VkDecompressMemoryRegionNV.const.p("pDecompressMemoryRegions")
    )

    void(
        "CmdDecompressMemoryIndirectCountNV",

        VkCommandBuffer("commandBuffer"),
        VkDeviceAddress("indirectCommandsAddress"),
        VkDeviceAddress("indirectCommandsCountAddress"),
        uint32_t("stride")
    )
}