/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_tile_memory_heap = "QCOMTileMemoryHeap".nativeClassVK("QCOM_tile_memory_heap", type = "device", postfix = "QCOM") {
    IntConstant(
        "QCOM_TILE_MEMORY_HEAP_SPEC_VERSION".."1"
    )

    StringConstant(
        "QCOM_TILE_MEMORY_HEAP_EXTENSION_NAME".."VK_QCOM_tile_memory_heap"
    )

    EnumConstant(
        "MEMORY_HEAP_TILE_MEMORY_BIT_QCOM".enum(0x00000008)
    )

    EnumConstant(
        "BUFFER_USAGE_TILE_MEMORY_BIT_QCOM".enum(0x08000000)
    )

    EnumConstantLong(
        "BUFFER_USAGE_2_TILE_MEMORY_BIT_QCOM".enum(0x08000000L)
    )

    EnumConstant(
        "IMAGE_USAGE_TILE_MEMORY_BIT_QCOM".enum(0x08000000)
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_FEATURES_QCOM".."1000547000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_PROPERTIES_QCOM".."1000547001",
        "STRUCTURE_TYPE_TILE_MEMORY_REQUIREMENTS_QCOM".."1000547002",
        "STRUCTURE_TYPE_TILE_MEMORY_BIND_INFO_QCOM".."1000547003",
        "STRUCTURE_TYPE_TILE_MEMORY_SIZE_INFO_QCOM".."1000547004"
    )

    void(
        "CmdBindTileMemoryQCOM",

        VkCommandBuffer("commandBuffer"),
        nullable..VkTileMemoryBindInfoQCOM.const.p("pTileMemoryBindInfo")
    )
}