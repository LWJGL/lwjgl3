/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val VK12 = "VK12".nativeClass(Module.VULKAN, "VK12", prefix = "VK", binding = VK_BINDING_INSTANCE) {
    extends = VK11
    
    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES".."49",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES".."50",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES".."51",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES".."52",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES".."1000082000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES".."1000108000",
        "STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO".."1000108001",
        "STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO".."1000108002",
        "STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO".."1000108003",
        "STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2".."1000109000",
        "STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2".."1000109001",
        "STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2".."1000109002",
        "STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2".."1000109003",
        "STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2".."1000109004",
        "STRUCTURE_TYPE_SUBPASS_BEGIN_INFO".."1000109005",
        "STRUCTURE_TYPE_SUBPASS_END_INFO".."1000109006",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES".."1000130000",
        "STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO".."1000130001",
        "STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO".."1000147000",
        "STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO".."1000161000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES".."1000161001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES".."1000161002",
        "STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO".."1000161003",
        "STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT".."1000161004",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES".."1000175000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES".."1000177000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES".."1000180000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES".."1000196000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES".."1000197000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES".."1000199000",
        "STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE".."1000199001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES".."1000207000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES".."1000207001",
        "STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO".."1000207002",
        "STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO".."1000207003",
        "STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO".."1000207004",
        "STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO".."1000207005",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES".."1000211000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES".."1000221000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES".."1000241000",
        "STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT".."1000241001",
        "STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT".."1000241002",
        "STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO".."1000244001",
        "STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO".."1000246000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES".."1000253000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES".."1000257000",
        "STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO".."1000257002",
        "STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO".."1000257003",
        "STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO".."1000257004",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES".."1000261000"
    )

    EnumConstant(
        "SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE".."4"
    )

    EnumConstant(
        "DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT".enum(0x00000002)
    )

    EnumConstant(
        "DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT".enum(0x00000002)
    )

    EnumConstant(
        "ERROR_FRAGMENTATION".."-1000161000",
        "ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS".."-1000257000"
    )

    EnumConstant(
        "FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT".enum(0x00010000)
    )

    EnumConstant(
        "FRAMEBUFFER_CREATE_IMAGELESS_BIT".enum(0x00000001)
    )

    EnumConstant(
        "IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL".."1000241000",
        "IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL".."1000241001",
        "IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL".."1000241002",
        "IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL".."1000241003"
    )

    EnumConstant(
        "BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT".enum(0x00020000)
    )

    EnumConstant(
        "BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT".enum(0x00000010)
    )

    EnumConstant(
        "MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT".enum(0x00000002),
        "MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT".enum(0x00000004)
    )

    EnumConstant(
        "DRIVER_ID_AMD_PROPRIETARY".."1",
        "DRIVER_ID_AMD_OPEN_SOURCE".."2",
        "DRIVER_ID_MESA_RADV".."3",
        "DRIVER_ID_NVIDIA_PROPRIETARY".."4",
        "DRIVER_ID_INTEL_PROPRIETARY_WINDOWS".."5",
        "DRIVER_ID_INTEL_OPEN_SOURCE_MESA".."6",
        "DRIVER_ID_IMAGINATION_PROPRIETARY".."7",
        "DRIVER_ID_QUALCOMM_PROPRIETARY".."8",
        "DRIVER_ID_ARM_PROPRIETARY".."9",
        "DRIVER_ID_GOOGLE_SWIFTSHADER".."10",
        "DRIVER_ID_GGP_PROPRIETARY".."11",
        "DRIVER_ID_BROADCOM_PROPRIETARY".."12",
        "DRIVER_ID_MESA_LLVMPIPE".."13",
        "DRIVER_ID_MOLTENVK".."14",
        "DRIVER_ID_COREAVI_PROPRIETARY".."15",
        "DRIVER_ID_JUICE_PROPRIETARY".."16",
        "DRIVER_ID_VERISILICON_PROPRIETARY".."17",
        "DRIVER_ID_MESA_TURNIP".."18",
        "DRIVER_ID_MESA_V3DV".."19",
        "DRIVER_ID_MESA_PANVK".."20",
        "DRIVER_ID_SAMSUNG_PROPRIETARY".."21",
        "DRIVER_ID_MESA_VENUS".."22",
        "DRIVER_ID_MESA_DOZEN".."23",
        "DRIVER_ID_MESA_NVK".."24",
        "DRIVER_ID_IMAGINATION_OPEN_SOURCE_MESA".."25",
        "DRIVER_ID_MESA_HONEYKRISP".."26",
        "DRIVER_ID_VULKAN_SC_EMULATION_ON_VULKAN".."27"
    )

    EnumConstant(
        "SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY".."0",
        "SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL".."1",
        "SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE".."2"
    )

    EnumConstant(
        "RESOLVE_MODE_NONE".."0",
        "RESOLVE_MODE_SAMPLE_ZERO_BIT".enum(0x00000001),
        "RESOLVE_MODE_AVERAGE_BIT".enum(0x00000002),
        "RESOLVE_MODE_MIN_BIT".enum(0x00000004),
        "RESOLVE_MODE_MAX_BIT".enum(0x00000008)
    )

    EnumConstant(
        "DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT".enum(0x00000001),
        "DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT".enum(0x00000002),
        "DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT".enum(0x00000004),
        "DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT".enum(0x00000008)
    )

    EnumConstant(
        "SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE".."0",
        "SAMPLER_REDUCTION_MODE_MIN".."1",
        "SAMPLER_REDUCTION_MODE_MAX".."2"
    )

    EnumConstant(
        "SEMAPHORE_TYPE_BINARY".."0",
        "SEMAPHORE_TYPE_TIMELINE".."1"
    )

    EnumConstant(
        "SEMAPHORE_WAIT_ANY_BIT".enum(0x00000001)
    )

    // Promoted from VK_KHR_draw_indirect_count (extension 170)

    void(
        "CmdDrawIndirectCount",

        VkCommandBuffer("commandBuffer"),
        VkBuffer("buffer"),
        VkDeviceSize("offset"),
        VkBuffer("countBuffer"),
        VkDeviceSize("countBufferOffset"),
        uint32_t("maxDrawCount"),
        uint32_t("stride")
    )

    void(
        "CmdDrawIndexedIndirectCount",

        VkCommandBuffer("commandBuffer"),
        VkBuffer("buffer"),
        VkDeviceSize("offset"),
        VkBuffer("countBuffer"),
        VkDeviceSize("countBufferOffset"),
        uint32_t("maxDrawCount"),
        uint32_t("stride")
    )

    // Promoted from VK_KHR_create_renderpass2 (extension 110)

    VkResult(
        "CreateRenderPass2",

        VkDevice("device"),
        VkRenderPassCreateInfo2.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkRenderPass.p("pRenderPass")
    )

    void(
        "CmdBeginRenderPass2",

        VkCommandBuffer("commandBuffer"),
        VkRenderPassBeginInfo.const.p("pRenderPassBegin"),
        VkSubpassBeginInfo.const.p("pSubpassBeginInfo")
    )

    void(
        "CmdNextSubpass2",

        VkCommandBuffer("commandBuffer"),
        VkSubpassBeginInfo.const.p("pSubpassBeginInfo"),
        VkSubpassEndInfo.const.p("pSubpassEndInfo")
    )

    void(
        "CmdEndRenderPass2",

        VkCommandBuffer("commandBuffer"),
        VkSubpassEndInfo.const.p("pSubpassEndInfo")
    )

    // Promoted from VK_EXT_host_query_reset (extension 262)

    void(
        "ResetQueryPool",

        VkDevice("device"),
        VkQueryPool("queryPool"),
        uint32_t("firstQuery"),
        uint32_t("queryCount")
    )

    // Promoted from VK_KHR_timeline_semaphore (extension 208)

    VkResult(
        "GetSemaphoreCounterValue",

        VkDevice("device"),
        VkSemaphore("semaphore"),
        Check(1)..uint64_t.p("pValue")
    )

    VkResult(
        "WaitSemaphores",

        VkDevice("device"),
        VkSemaphoreWaitInfo.const.p("pWaitInfo"),
        uint64_t("timeout")
    )

    VkResult(
        "SignalSemaphore",

        VkDevice("device"),
        VkSemaphoreSignalInfo.const.p("pSignalInfo")
    )

    // Promoted from VK_KHR_buffer_device_address (extension 258)

    VkDeviceAddress(
        "GetBufferDeviceAddress",

        VkDevice("device"),
        VkBufferDeviceAddressInfo.const.p("pInfo")
    )

    uint64_t(
        "GetBufferOpaqueCaptureAddress",

        VkDevice("device"),
        VkBufferDeviceAddressInfo.const.p("pInfo")
    )

    uint64_t(
        "GetDeviceMemoryOpaqueCaptureAddress",

        VkDevice("device"),
        VkDeviceMemoryOpaqueCaptureAddressInfo.const.p("pInfo")
    )

}