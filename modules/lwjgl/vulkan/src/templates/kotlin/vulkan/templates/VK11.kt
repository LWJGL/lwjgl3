/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val VK11 = "VK11".nativeClass(Module.VULKAN, "VK11", prefix = "VK", binding = VK_BINDING_INSTANCE) {
    extends = VK10
    
    EnumConstant(
        "STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO".."1000053000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES".."1000053001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES".."1000053002",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2".."1000059000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2".."1000059001",
        "STRUCTURE_TYPE_FORMAT_PROPERTIES_2".."1000059002",
        "STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2".."1000059003",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2".."1000059004",
        "STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2".."1000059005",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2".."1000059006",
        "STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2".."1000059007",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2".."1000059008",
        "STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO".."1000060000",
        "STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO".."1000060003",
        "STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO".."1000060004",
        "STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO".."1000060005",
        "STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO".."1000060006",
        "STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO".."1000060013",
        "STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO".."1000060014",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES".."1000063000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETER_FEATURES".."1000063000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES".."1000070000",
        "STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO".."1000070001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO".."1000071000",
        "STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES".."1000071001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO".."1000071002",
        "STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES".."1000071003",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES".."1000071004",
        "STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO".."1000072000",
        "STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO".."1000072001",
        "STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO".."1000072002",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO".."1000076000",
        "STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES".."1000076001",
        "STRUCTURE_TYPE_EXPORT_SEMAPHORE_CREATE_INFO".."1000077000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES".."1000083000",
        "STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO".."1000085000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES".."1000094000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO".."1000112000",
        "STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES".."1000112001",
        "STRUCTURE_TYPE_EXPORT_FENCE_CREATE_INFO".."1000113000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES".."1000117000",
        "STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO".."1000117001",
        "STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO".."1000117002",
        "STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO".."1000117003",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES".."1000120000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES".."1000120000",
        "STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS".."1000127000",
        "STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO".."1000127001",
        "STRUCTURE_TYPE_PROTECTED_SUBMIT_INFO".."1000145000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_FEATURES".."1000145001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_PROPERTIES".."1000145002",
        "STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2".."1000145003",
        "STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2".."1000146000",
        "STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2".."1000146001",
        "STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2".."1000146002",
        "STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2".."1000146003",
        "STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2".."1000146004",
        "STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO".."1000156000",
        "STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO".."1000156001",
        "STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO".."1000156002",
        "STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO".."1000156003",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES".."1000156004",
        "STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES".."1000156005",
        "STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO".."1000157000",
        "STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO".."1000157001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES".."1000168000",
        "STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT".."1000168001"
    )

    EnumConstant(
        "IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT".enum(0x00000020),
        "IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT".enum(0x00000040),
        "IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT".enum(0x00000080),
        "IMAGE_CREATE_EXTENDED_USAGE_BIT".enum(0x00000100),
        "IMAGE_CREATE_DISJOINT_BIT".enum(0x00000200),
        "IMAGE_CREATE_ALIAS_BIT".enum(0x00000400),
        "IMAGE_CREATE_PROTECTED_BIT".enum(0x00000800)
    )

    EnumConstant(
        "PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT".enum(0x00000008),
        "PIPELINE_CREATE_DISPATCH_BASE_BIT".enum(0x00000010),
        "PIPELINE_CREATE_DISPATCH_BASE".enum(0x00000010)
    )

    EnumConstant(
        "DEPENDENCY_VIEW_LOCAL_BIT".enum(0x00000002),
        "DEPENDENCY_DEVICE_GROUP_BIT".enum(0x00000004)
    )

    EnumConstant(
        "MEMORY_HEAP_MULTI_INSTANCE_BIT".enum(0x00000002)
    )

    EnumConstant(
        "ERROR_OUT_OF_POOL_MEMORY".."-1000069000",
        "ERROR_INVALID_EXTERNAL_HANDLE".."-1000072003"
    )

    EnumConstant(
        "FORMAT_FEATURE_TRANSFER_SRC_BIT".enum(0x00004000),
        "FORMAT_FEATURE_TRANSFER_DST_BIT".enum(0x00008000),
        "FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT".enum(0x00020000),
        "FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT".enum(0x00040000),
        "FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT".enum(0x00080000),
        "FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT".enum(0x00100000),
        "FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT".enum(0x00200000),
        "FORMAT_FEATURE_DISJOINT_BIT".enum(0x00400000),
        "FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT".enum(0x00800000)
    )

    EnumConstant(
        "IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL".."1000117000",
        "IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL".."1000117001"
    )

    EnumConstant(
        "QUEUE_PROTECTED_BIT".enum(0x00000010)
    )

    EnumConstant(
        "DEVICE_QUEUE_CREATE_PROTECTED_BIT".enum(0x00000001)
    )

    EnumConstant(
        "MEMORY_PROPERTY_PROTECTED_BIT".enum(0x00000020)
    )

    EnumConstant(
        "BUFFER_CREATE_PROTECTED_BIT".enum(0x00000008)
    )

    EnumConstant(
        "COMMAND_POOL_CREATE_PROTECTED_BIT".enum(0x00000004)
    )

    EnumConstant(
        "OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE".."1000085000",
        "OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION".."1000156000"
    )

    EnumConstant(
        "FORMAT_G8B8G8R8_422_UNORM".."1000156000",
        "FORMAT_B8G8R8G8_422_UNORM".."1000156001",
        "FORMAT_G8_B8_R8_3PLANE_420_UNORM".."1000156002",
        "FORMAT_G8_B8R8_2PLANE_420_UNORM".."1000156003",
        "FORMAT_G8_B8_R8_3PLANE_422_UNORM".."1000156004",
        "FORMAT_G8_B8R8_2PLANE_422_UNORM".."1000156005",
        "FORMAT_G8_B8_R8_3PLANE_444_UNORM".."1000156006",
        "FORMAT_R10X6_UNORM_PACK16".."1000156007",
        "FORMAT_R10X6G10X6_UNORM_2PACK16".."1000156008",
        "FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16".."1000156009",
        "FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16".."1000156010",
        "FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16".."1000156011",
        "FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16".."1000156012",
        "FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16".."1000156013",
        "FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16".."1000156014",
        "FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16".."1000156015",
        "FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16".."1000156016",
        "FORMAT_R12X4_UNORM_PACK16".."1000156017",
        "FORMAT_R12X4G12X4_UNORM_2PACK16".."1000156018",
        "FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16".."1000156019",
        "FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16".."1000156020",
        "FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16".."1000156021",
        "FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16".."1000156022",
        "FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16".."1000156023",
        "FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16".."1000156024",
        "FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16".."1000156025",
        "FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16".."1000156026",
        "FORMAT_G16B16G16R16_422_UNORM".."1000156027",
        "FORMAT_B16G16R16G16_422_UNORM".."1000156028",
        "FORMAT_G16_B16_R16_3PLANE_420_UNORM".."1000156029",
        "FORMAT_G16_B16R16_2PLANE_420_UNORM".."1000156030",
        "FORMAT_G16_B16_R16_3PLANE_422_UNORM".."1000156031",
        "FORMAT_G16_B16R16_2PLANE_422_UNORM".."1000156032",
        "FORMAT_G16_B16_R16_3PLANE_444_UNORM".."1000156033"
    )

    EnumConstant(
        "IMAGE_ASPECT_PLANE_0_BIT".enum(0x00000010),
        "IMAGE_ASPECT_PLANE_1_BIT".enum(0x00000020),
        "IMAGE_ASPECT_PLANE_2_BIT".enum(0x00000040)
    )

    EnumConstant(
        "SUBGROUP_FEATURE_BASIC_BIT".enum(0x00000001),
        "SUBGROUP_FEATURE_VOTE_BIT".enum(0x00000002),
        "SUBGROUP_FEATURE_ARITHMETIC_BIT".enum(0x00000004),
        "SUBGROUP_FEATURE_BALLOT_BIT".enum(0x00000008),
        "SUBGROUP_FEATURE_SHUFFLE_BIT".enum(0x00000010),
        "SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT".enum(0x00000020),
        "SUBGROUP_FEATURE_CLUSTERED_BIT".enum(0x00000040),
        "SUBGROUP_FEATURE_QUAD_BIT".enum(0x00000080)
    )

    EnumConstant(
        "PEER_MEMORY_FEATURE_COPY_SRC_BIT".enum(0x00000001),
        "PEER_MEMORY_FEATURE_COPY_DST_BIT".enum(0x00000002),
        "PEER_MEMORY_FEATURE_GENERIC_SRC_BIT".enum(0x00000004),
        "PEER_MEMORY_FEATURE_GENERIC_DST_BIT".enum(0x00000008)
    )

    EnumConstant(
        "MEMORY_ALLOCATE_DEVICE_MASK_BIT".enum(0x00000001)
    )

    EnumConstant(
        "POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES".."0",
        "POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY".."1"
    )

    EnumConstant(
        "TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT".."0",
        "TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT".."1"
    )

    EnumConstant(
        "SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY".."0",
        "SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY".."1",
        "SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709".."2",
        "SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601".."3",
        "SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020".."4"
    )

    EnumConstant(
        "SAMPLER_YCBCR_RANGE_ITU_FULL".."0",
        "SAMPLER_YCBCR_RANGE_ITU_NARROW".."1"
    )

    EnumConstant(
        "CHROMA_LOCATION_COSITED_EVEN".."0",
        "CHROMA_LOCATION_MIDPOINT".."1"
    )

    EnumConstant(
        "DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET".."0"
    )

    EnumConstant(
        "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT".enum(0x00000001),
        "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT".enum(0x00000002),
        "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT".enum(0x00000004),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT".enum(0x00000008),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT".enum(0x00000010),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT".enum(0x00000020),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT".enum(0x00000040)
    )

    EnumConstant(
        "EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT".enum(0x00000001),
        "EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT".enum(0x00000002),
        "EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT".enum(0x00000004)
    )

    EnumConstant(
        "EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT".enum(0x00000001),
        "EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT".enum(0x00000002),
        "EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT".enum(0x00000004),
        "EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT".enum(0x00000008)
    )

    EnumConstant(
        "EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT".enum(0x00000001),
        "EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT".enum(0x00000002)
    )

    EnumConstant(
        "FENCE_IMPORT_TEMPORARY_BIT".enum(0x00000001)
    )

    EnumConstant(
        "SEMAPHORE_IMPORT_TEMPORARY_BIT".enum(0x00000001)
    )

    EnumConstant(
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT".enum(0x00000001),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT".enum(0x00000002),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT".enum(0x00000004),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT".enum(0x00000008),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_FENCE_BIT".enum(0x00000008),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT".enum(0x00000010)
    )

    EnumConstant(
        "EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT".enum(0x00000001),
        "EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT".enum(0x00000002)
    )

    // Device Initialization

    GlobalCommand..VkResult(
        "EnumerateInstanceVersion",

        Check(1)..uint32_t.p("pApiVersion")
    )

    // Promoted from VK_KHR_bind_memory2

    VkResult(
        "BindBufferMemory2",

        VkDevice("device"),
        AutoSize("pBindInfos")..uint32_t("bindInfoCount"),
        VkBindBufferMemoryInfo.const.p("pBindInfos")
    )

    VkResult(
        "BindImageMemory2",

        VkDevice("device"),
        AutoSize("pBindInfos")..uint32_t("bindInfoCount"),
        VkBindImageMemoryInfo.const.p("pBindInfos")
    )

    // Promoted from VK_KHR_device_group

    void(
        "GetDeviceGroupPeerMemoryFeatures",

        VkDevice("device"),
        uint32_t("heapIndex"),
        uint32_t("localDeviceIndex"),
        uint32_t("remoteDeviceIndex"),
        Check(1)..VkPeerMemoryFeatureFlags.p("pPeerMemoryFeatures")
    )

    void(
        "CmdSetDeviceMask",

        VkCommandBuffer("commandBuffer"),
        uint32_t("deviceMask")
    )

    void(
        "CmdDispatchBase",

        VkCommandBuffer("commandBuffer"),
        uint32_t("baseGroupX"),
        uint32_t("baseGroupY"),
        uint32_t("baseGroupZ"),
        uint32_t("groupCountX"),
        uint32_t("groupCountY"),
        uint32_t("groupCountZ")
    )

    // Promoted from VK_KHR_device_group_creation

    VkResult(
        "EnumeratePhysicalDeviceGroups",

        VkInstance("instance"),
        AutoSize("pPhysicalDeviceGroupProperties")..Check(1)..uint32_t.p("pPhysicalDeviceGroupCount"),
        nullable..VkPhysicalDeviceGroupProperties.p("pPhysicalDeviceGroupProperties")
    )

    // Promoted from VK_KHR_get_memory_requirements2

    void(
        "GetImageMemoryRequirements2",

        VkDevice("device"),
        VkImageMemoryRequirementsInfo2.const.p("pInfo"),
        VkMemoryRequirements2.p("pMemoryRequirements")
    )

    void(
        "GetBufferMemoryRequirements2",

        VkDevice("device"),
        VkBufferMemoryRequirementsInfo2.const.p("pInfo"),
        VkMemoryRequirements2.p("pMemoryRequirements")
    )

    void(
        "GetImageSparseMemoryRequirements2",

        VkDevice("device"),
        VkImageSparseMemoryRequirementsInfo2.const.p("pInfo"),
        AutoSize("pSparseMemoryRequirements")..Check(1)..uint32_t.p("pSparseMemoryRequirementCount"),
        nullable..VkSparseImageMemoryRequirements2.p("pSparseMemoryRequirements")
    )

    // Promoted from VK_KHR_get_physical_device_properties2

    void(
        "GetPhysicalDeviceFeatures2",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceFeatures2.p("pFeatures")
    )

    void(
        "GetPhysicalDeviceProperties2",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceProperties2.p("pProperties")
    )

    void(
        "GetPhysicalDeviceFormatProperties2",

        VkPhysicalDevice("physicalDevice"),
        VkFormat("format"),
        VkFormatProperties2.p("pFormatProperties")
    )

    VkResult(
        "GetPhysicalDeviceImageFormatProperties2",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceImageFormatInfo2.const.p("pImageFormatInfo"),
        VkImageFormatProperties2.p("pImageFormatProperties")
    )

    void(
        "GetPhysicalDeviceQueueFamilyProperties2",

        VkPhysicalDevice("physicalDevice"),
        AutoSize("pQueueFamilyProperties")..Check(1)..uint32_t.p("pQueueFamilyPropertyCount"),
        nullable..VkQueueFamilyProperties2.p("pQueueFamilyProperties")
    )

    void(
        "GetPhysicalDeviceMemoryProperties2",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceMemoryProperties2.p("pMemoryProperties")
    )

    void(
        "GetPhysicalDeviceSparseImageFormatProperties2",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceSparseImageFormatInfo2.const.p("pFormatInfo"),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount"),
        nullable..VkSparseImageFormatProperties2.p("pProperties")
    )

    // Promoted from VK_KHR_maintenance1

    void(
        "TrimCommandPool",

        VkDevice("device"),
        VkCommandPool("commandPool"),
        VkCommandPoolTrimFlags("flags")
    )

    // Originally based on VK_KHR_protected_memory (extension 146), which was never published; thus the mystifying large value= numbers below. These are not aliased since they were not actually promoted from an extension.

    void(
        "GetDeviceQueue2",

        VkDevice("device"),
        VkDeviceQueueInfo2.const.p("pQueueInfo"),
        Check(1)..VkQueue.p("pQueue")
    )

    // Promoted from VK_KHR_sampler_ycbcr_conversion

    VkResult(
        "CreateSamplerYcbcrConversion",

        VkDevice("device"),
        VkSamplerYcbcrConversionCreateInfo.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkSamplerYcbcrConversion.p("pYcbcrConversion")
    )

    void(
        "DestroySamplerYcbcrConversion",

        VkDevice("device"),
        VkSamplerYcbcrConversion("ycbcrConversion"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    // Promoted from VK_KHR_descriptor_update_template

    VkResult(
        "CreateDescriptorUpdateTemplate",

        VkDevice("device"),
        VkDescriptorUpdateTemplateCreateInfo.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkDescriptorUpdateTemplate.p("pDescriptorUpdateTemplate")
    )

    void(
        "DestroyDescriptorUpdateTemplate",

        VkDevice("device"),
        VkDescriptorUpdateTemplate("descriptorUpdateTemplate"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    void(
        "UpdateDescriptorSetWithTemplate",

        VkDevice("device"),
        VkDescriptorSet("descriptorSet"),
        VkDescriptorUpdateTemplate("descriptorUpdateTemplate"),
        nullable..opaque_const_p("pData")
    )

    // Promoted from VK_KHR_external_memory_capabilities

    void(
        "GetPhysicalDeviceExternalBufferProperties",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceExternalBufferInfo.const.p("pExternalBufferInfo"),
        VkExternalBufferProperties.p("pExternalBufferProperties")
    )

    // Promoted from VK_KHR_external_fence_capabilities

    void(
        "GetPhysicalDeviceExternalFenceProperties",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceExternalFenceInfo.const.p("pExternalFenceInfo"),
        VkExternalFenceProperties.p("pExternalFenceProperties")
    )

    // Promoted from VK_KHR_external_semaphore_capabilities

    void(
        "GetPhysicalDeviceExternalSemaphoreProperties",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceExternalSemaphoreInfo.const.p("pExternalSemaphoreInfo"),
        VkExternalSemaphoreProperties.p("pExternalSemaphoreProperties")
    )

    // Promoted from VK_KHR_maintenance3

    void(
        "GetDescriptorSetLayoutSupport",

        VkDevice("device"),
        VkDescriptorSetLayoutCreateInfo.const.p("pCreateInfo"),
        VkDescriptorSetLayoutSupport.p("pSupport")
    )

}