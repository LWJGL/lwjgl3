/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_copy_memory_indirect = "KHRCopyMemoryIndirect".nativeClassVK("KHR_copy_memory_indirect", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_COPY_MEMORY_INDIRECT_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_COPY_MEMORY_INDIRECT_EXTENSION_NAME".."VK_KHR_copy_memory_indirect"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_KHR".."1000426001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_KHR".."1000549000",
        "STRUCTURE_TYPE_COPY_MEMORY_INDIRECT_INFO_KHR".."1000549002",
        "STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INDIRECT_INFO_KHR".."1000549003"
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_COPY_INDIRECT_BIT_KHR".enum(0x400000000000L)
    )

    EnumConstantLong(
        "FORMAT_FEATURE_2_COPY_IMAGE_INDIRECT_DST_BIT_KHR".enum(0x800000000000000L)
    )

    EnumConstant(
        "ADDRESS_COPY_DEVICE_LOCAL_BIT_KHR".enum(0x00000001),
        "ADDRESS_COPY_SPARSE_BIT_KHR".enum(0x00000002),
        "ADDRESS_COPY_PROTECTED_BIT_KHR".enum(0x00000004)
    )

    void(
        "CmdCopyMemoryIndirectKHR",

        VkCommandBuffer("commandBuffer"),
        VkCopyMemoryIndirectInfoKHR.const.p("pCopyMemoryIndirectInfo")
    )

    void(
        "CmdCopyMemoryToImageIndirectKHR",

        VkCommandBuffer("commandBuffer"),
        VkCopyMemoryToImageIndirectInfoKHR.const.p("pCopyMemoryToImageIndirectInfo")
    )
}