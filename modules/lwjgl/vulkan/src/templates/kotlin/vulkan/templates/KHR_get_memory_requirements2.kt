/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_get_memory_requirements2 = "KHRGetMemoryRequirements2".nativeClassVK("KHR_get_memory_requirements2", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_GET_MEMORY_REQUIREMENTS_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_GET_MEMORY_REQUIREMENTS_2_EXTENSION_NAME".."VK_KHR_get_memory_requirements2"
    )

    EnumConstant(
        "STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2_KHR".."1000146000",
        "STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2_KHR".."1000146001",
        "STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2_KHR".."1000146002",
        "STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2_KHR".."1000146003",
        "STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2_KHR".."1000146004"
    )

    void(
        "GetImageMemoryRequirements2KHR",

        VkDevice("device"),
        VkImageMemoryRequirementsInfo2.const.p("pInfo"),
        VkMemoryRequirements2.p("pMemoryRequirements")
    )

    void(
        "GetBufferMemoryRequirements2KHR",

        VkDevice("device"),
        VkBufferMemoryRequirementsInfo2.const.p("pInfo"),
        VkMemoryRequirements2.p("pMemoryRequirements")
    )

    void(
        "GetImageSparseMemoryRequirements2KHR",

        VkDevice("device"),
        VkImageSparseMemoryRequirementsInfo2.const.p("pInfo"),
        AutoSize("pSparseMemoryRequirements")..Check(1)..uint32_t.p("pSparseMemoryRequirementCount"),
        nullable..VkSparseImageMemoryRequirements2.p("pSparseMemoryRequirements")
    )
}