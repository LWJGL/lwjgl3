/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_memory_decompression = "EXTMemoryDecompression".nativeClassVK("EXT_memory_decompression", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_MEMORY_DECOMPRESSION_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_MEMORY_DECOMPRESSION_EXTENSION_NAME".."VK_EXT_memory_decompression"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_EXT".."1000427000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_EXT".."1000427001",
        "STRUCTURE_TYPE_DECOMPRESS_MEMORY_INFO_EXT".."1000550002"
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_MEMORY_DECOMPRESSION_BIT_EXT".enum(0x200000000000L)
    )

    EnumConstantLong(
        "ACCESS_2_MEMORY_DECOMPRESSION_READ_BIT_EXT".enum(0x80000000000000L),
        "ACCESS_2_MEMORY_DECOMPRESSION_WRITE_BIT_EXT".enum(0x100000000000000L)
    )

    EnumConstantLong(
        "BUFFER_USAGE_2_MEMORY_DECOMPRESSION_BIT_EXT".enum(0x100000000L)
    )

    EnumConstantLong(
        "MEMORY_DECOMPRESSION_METHOD_GDEFLATE_1_0_BIT_EXT".enum(0x00000001L),
        "MEMORY_DECOMPRESSION_METHOD_GDEFLATE_1_0_BIT_NV".enum(0x00000001L)
    )

    void(
        "CmdDecompressMemoryEXT",

        VkCommandBuffer("commandBuffer"),
        VkDecompressMemoryInfoEXT.const.p("pDecompressMemoryInfoEXT")
    )

    void(
        "CmdDecompressMemoryIndirectCountEXT",

        VkCommandBuffer("commandBuffer"),
        VkMemoryDecompressionMethodFlagsEXT("decompressionMethod"),
        VkDeviceAddress("indirectCommandsAddress"),
        VkDeviceAddress("indirectCommandsCountAddress"),
        uint32_t("maxDecompressionCount"),
        uint32_t("stride")
    )
}