/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_device_address_commands = "KHRDeviceAddressCommands".nativeClassVK("KHR_device_address_commands", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_DEVICE_ADDRESS_COMMANDS_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_DEVICE_ADDRESS_COMMANDS_EXTENSION_NAME".."VK_KHR_device_address_commands"
    )

    EnumConstant(
        "STRUCTURE_TYPE_DEVICE_MEMORY_COPY_KHR".."1000318000",
        "STRUCTURE_TYPE_COPY_DEVICE_MEMORY_INFO_KHR".."1000318001",
        "STRUCTURE_TYPE_DEVICE_MEMORY_IMAGE_COPY_KHR".."1000318002",
        "STRUCTURE_TYPE_COPY_DEVICE_MEMORY_IMAGE_INFO_KHR".."1000318003",
        "STRUCTURE_TYPE_MEMORY_RANGE_BARRIERS_INFO_KHR".."1000318004",
        "STRUCTURE_TYPE_MEMORY_RANGE_BARRIER_KHR".."1000318005",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_ADDRESS_COMMANDS_FEATURES_KHR".."1000318006",
        "STRUCTURE_TYPE_BIND_INDEX_BUFFER_3_INFO_KHR".."1000318007",
        "STRUCTURE_TYPE_BIND_VERTEX_BUFFER_3_INFO_KHR".."1000318008",
        "STRUCTURE_TYPE_DRAW_INDIRECT_2_INFO_KHR".."1000318009",
        "STRUCTURE_TYPE_DRAW_INDIRECT_COUNT_2_INFO_KHR".."1000318010",
        "STRUCTURE_TYPE_DISPATCH_INDIRECT_2_INFO_KHR".."1000318011",
        "STRUCTURE_TYPE_CONDITIONAL_RENDERING_BEGIN_INFO_2_EXT".."1000318012",
        "STRUCTURE_TYPE_BIND_TRANSFORM_FEEDBACK_BUFFER_2_INFO_EXT".."1000318013",
        "STRUCTURE_TYPE_MEMORY_MARKER_INFO_AMD".."1000318014",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_2_KHR".."1000318015"
    )

    EnumConstant(
        "ADDRESS_COMMAND_PROTECTED_BIT_KHR".enum(0x00000001),
        "ADDRESS_COMMAND_FULLY_BOUND_BIT_KHR".enum(0x00000002),
        "ADDRESS_COMMAND_STORAGE_BUFFER_USAGE_BIT_KHR".enum(0x00000004),
        "ADDRESS_COMMAND_UNKNOWN_STORAGE_BUFFER_USAGE_BIT_KHR".enum(0x00000008),
        "ADDRESS_COMMAND_TRANSFORM_FEEDBACK_BUFFER_USAGE_BIT_KHR".enum(0x00000010),
        "ADDRESS_COMMAND_UNKNOWN_TRANSFORM_FEEDBACK_BUFFER_USAGE_BIT_KHR".enum(0x00000020)
    )

    void(
        "CmdBindIndexBuffer3KHR",

        VkCommandBuffer("commandBuffer"),
        VkBindIndexBuffer3InfoKHR.const.p("pInfo")
    )

    void(
        "CmdBindVertexBuffers3KHR",

        VkCommandBuffer("commandBuffer"),
        uint32_t("firstBinding"),
        AutoSize("pBindingInfos")..uint32_t("bindingCount"),
        VkBindVertexBuffer3InfoKHR.const.p("pBindingInfos")
    )

    void(
        "CmdDrawIndirect2KHR",

        VkCommandBuffer("commandBuffer"),
        VkDrawIndirect2InfoKHR.const.p("pInfo")
    )

    void(
        "CmdDrawIndexedIndirect2KHR",

        VkCommandBuffer("commandBuffer"),
        VkDrawIndirect2InfoKHR.const.p("pInfo")
    )

    void(
        "CmdDispatchIndirect2KHR",

        VkCommandBuffer("commandBuffer"),
        VkDispatchIndirect2InfoKHR.const.p("pInfo")
    )

    void(
        "CmdCopyMemoryKHR",

        VkCommandBuffer("commandBuffer"),
        nullable..VkCopyDeviceMemoryInfoKHR.const.p("pCopyMemoryInfo")
    )

    void(
        "CmdCopyMemoryToImageKHR",

        VkCommandBuffer("commandBuffer"),
        nullable..VkCopyDeviceMemoryImageInfoKHR.const.p("pCopyMemoryInfo")
    )

    void(
        "CmdCopyImageToMemoryKHR",

        VkCommandBuffer("commandBuffer"),
        nullable..VkCopyDeviceMemoryImageInfoKHR.const.p("pCopyMemoryInfo")
    )

    void(
        "CmdUpdateMemoryKHR",

        VkCommandBuffer("commandBuffer"),
        VkDeviceAddressRangeKHR.const.p("pDstRange"),
        VkAddressCommandFlagsKHR("dstFlags"),
        AutoSize("pData")..VkDeviceSize("dataSize"),
        void.const.p("pData")
    )

    void(
        "CmdFillMemoryKHR",

        VkCommandBuffer("commandBuffer"),
        VkDeviceAddressRangeKHR.const.p("pDstRange"),
        VkAddressCommandFlagsKHR("dstFlags"),
        uint32_t("data")
    )

    void(
        "CmdCopyQueryPoolResultsToMemoryKHR",

        VkCommandBuffer("commandBuffer"),
        VkQueryPool("queryPool"),
        uint32_t("firstQuery"),
        uint32_t("queryCount"),
        VkStridedDeviceAddressRangeKHR.const.p("pDstRange"),
        VkAddressCommandFlagsKHR("dstFlags"),
        VkQueryResultFlags("queryResultFlags")
    )

    DependsOn("""ext.contains("VK_KHR_draw_indirect_count") || ext.contains("Vulkan12")""")..void(
        "CmdDrawIndirectCount2KHR",

        VkCommandBuffer("commandBuffer"),
        VkDrawIndirectCount2InfoKHR.const.p("pInfo")
    )

    DependsOn("""ext.contains("VK_KHR_draw_indirect_count") || ext.contains("Vulkan12")""")..void(
        "CmdDrawIndexedIndirectCount2KHR",

        VkCommandBuffer("commandBuffer"),
        VkDrawIndirectCount2InfoKHR.const.p("pInfo")
    )

    DependsOn("VK_EXT_conditional_rendering")..void(
        "CmdBeginConditionalRendering2EXT",

        VkCommandBuffer("commandBuffer"),
        VkConditionalRenderingBeginInfo2EXT.const.p("pConditionalRenderingBegin")
    )

    DependsOn("VK_EXT_transform_feedback")..void(
        "CmdBindTransformFeedbackBuffers2EXT",

        VkCommandBuffer("commandBuffer"),
        uint32_t("firstBinding"),
        AutoSize("pBindingInfos")..uint32_t("bindingCount"),
        nullable..VkBindTransformFeedbackBuffer2InfoEXT.const.p("pBindingInfos")
    )

    DependsOn("VK_EXT_transform_feedback")..void(
        "CmdBeginTransformFeedback2EXT",

        VkCommandBuffer("commandBuffer"),
        uint32_t("firstCounterRange"),
        AutoSize("pCounterInfos")..uint32_t("counterRangeCount"),
        nullable..VkBindTransformFeedbackBuffer2InfoEXT.const.p("pCounterInfos")
    )

    DependsOn("VK_EXT_transform_feedback")..void(
        "CmdEndTransformFeedback2EXT",

        VkCommandBuffer("commandBuffer"),
        uint32_t("firstCounterRange"),
        AutoSize("pCounterInfos")..uint32_t("counterRangeCount"),
        nullable..VkBindTransformFeedbackBuffer2InfoEXT.const.p("pCounterInfos")
    )

    DependsOn("VK_EXT_transform_feedback")..void(
        "CmdDrawIndirectByteCount2EXT",

        VkCommandBuffer("commandBuffer"),
        uint32_t("instanceCount"),
        uint32_t("firstInstance"),
        VkBindTransformFeedbackBuffer2InfoEXT.const.p("pCounterInfo"),
        uint32_t("counterOffset"),
        uint32_t("vertexStride")
    )

    DependsOn("VK_EXT_mesh_shader")..void(
        "CmdDrawMeshTasksIndirect2EXT",

        VkCommandBuffer("commandBuffer"),
        VkDrawIndirect2InfoKHR.const.p("pInfo")
    )

    DependsOn("""(ext.contains("VK_KHR_draw_indirect_count") || ext.contains("Vulkan12")) && ext.contains("VK_EXT_mesh_shader")""")..void(
        "CmdDrawMeshTasksIndirectCount2EXT",

        VkCommandBuffer("commandBuffer"),
        VkDrawIndirectCount2InfoKHR.const.p("pInfo")
    )

    DependsOn("VK_AMD_buffer_marker")..void(
        "CmdWriteMarkerToMemoryAMD",

        VkCommandBuffer("commandBuffer"),
        VkMemoryMarkerInfoAMD.const.p("pInfo")
    )

    DependsOn("VK_KHR_acceleration_structure")..VkResult(
        "CreateAccelerationStructure2KHR",

        VkDevice("device"),
        VkAccelerationStructureCreateInfo2KHR.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkAccelerationStructureKHR.p("pAccelerationStructure")
    )
}