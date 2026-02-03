/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan

import org.lwjgl.generator.*

// Handle types
val VkBuffer = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkBuffer")
val VkImage = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkImage")
val VkInstance = VK_DEFINE_HANDLE("VkInstance")
val VkPhysicalDevice = VK_DEFINE_HANDLE("VkPhysicalDevice")
val VkDevice = VK_DEFINE_HANDLE("VkDevice")
val VkQueue = VK_DEFINE_HANDLE("VkQueue")
val VkSemaphore = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkSemaphore")
val VkCommandBuffer = VK_DEFINE_HANDLE("VkCommandBuffer")
val VkFence = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkFence")
val VkDeviceMemory = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDeviceMemory")
val VkQueryPool = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkQueryPool")
val VkImageView = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkImageView")
val VkCommandPool = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkCommandPool")
val VkRenderPass = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkRenderPass")
val VkFramebuffer = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkFramebuffer")
val VkEvent = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkEvent")
val VkBufferView = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkBufferView")
val VkShaderModule = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkShaderModule")
val VkPipelineCache = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkPipelineCache")
val VkPipelineLayout = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkPipelineLayout")
val VkPipeline = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkPipeline")
val VkDescriptorSetLayout = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDescriptorSetLayout")
val VkSampler = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkSampler")
val VkDescriptorSet = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDescriptorSet")
val VkDescriptorPool = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDescriptorPool")
val VkDescriptorUpdateTemplate = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDescriptorUpdateTemplate")
val VkSamplerYcbcrConversion = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkSamplerYcbcrConversion")
val VkPrivateDataSlot = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkPrivateDataSlot")

// Enum types
val VkResult = "VkResult".enumType
val VkStructureType = "VkStructureType".enumType
val VkImageLayout = "VkImageLayout".enumType
val VkObjectType = "VkObjectType".enumType
val VkVendorId = "VkVendorId".enumType
val VkSystemAllocationScope = "VkSystemAllocationScope".enumType
val VkInternalAllocationType = "VkInternalAllocationType".enumType
val VkFormat = "VkFormat".enumType
val VkFormatFeatureFlagBits = "VkFormatFeatureFlagBits".enumType
val VkImageCreateFlagBits = "VkImageCreateFlagBits".enumType
val VkImageTiling = "VkImageTiling".enumType
val VkImageType = "VkImageType".enumType
val VkImageUsageFlagBits = "VkImageUsageFlagBits".enumType
val VkInstanceCreateFlagBits = "VkInstanceCreateFlagBits".enumType
val VkMemoryHeapFlagBits = "VkMemoryHeapFlagBits".enumType
val VkMemoryPropertyFlagBits = "VkMemoryPropertyFlagBits".enumType
val VkPhysicalDeviceType = "VkPhysicalDeviceType".enumType
val VkQueueFlagBits = "VkQueueFlagBits".enumType
val VkSampleCountFlagBits = "VkSampleCountFlagBits".enumType
val VkPipelineStageFlagBits = "VkPipelineStageFlagBits".enumType
val VkMemoryMapFlagBits = "VkMemoryMapFlagBits".enumType
val VkImageAspectFlagBits = "VkImageAspectFlagBits".enumType
val VkSparseImageFormatFlagBits = "VkSparseImageFormatFlagBits".enumType
val VkSparseMemoryBindFlagBits = "VkSparseMemoryBindFlagBits".enumType
val VkFenceCreateFlagBits = "VkFenceCreateFlagBits".enumType
val VkQueryPoolCreateFlagBits = "VkQueryPoolCreateFlagBits".enumType
val VkQueryType = "VkQueryType".enumType
val VkQueryResultFlagBits = "VkQueryResultFlagBits".enumType
val VkBufferCreateFlagBits = "VkBufferCreateFlagBits".enumType
val VkSharingMode = "VkSharingMode".enumType
val VkBufferUsageFlagBits = "VkBufferUsageFlagBits".enumType
val VkComponentSwizzle = "VkComponentSwizzle".enumType
val VkImageViewCreateFlagBits = "VkImageViewCreateFlagBits".enumType
val VkImageViewType = "VkImageViewType".enumType
val VkAccessFlagBits = "VkAccessFlagBits".enumType
val VkDependencyFlagBits = "VkDependencyFlagBits".enumType
val VkCommandPoolCreateFlagBits = "VkCommandPoolCreateFlagBits".enumType
val VkCommandPoolResetFlagBits = "VkCommandPoolResetFlagBits".enumType
val VkCommandBufferLevel = "VkCommandBufferLevel".enumType
val VkCommandBufferResetFlagBits = "VkCommandBufferResetFlagBits".enumType
val VkCommandBufferUsageFlagBits = "VkCommandBufferUsageFlagBits".enumType
val VkQueryControlFlagBits = "VkQueryControlFlagBits".enumType
val VkIndexType = "VkIndexType".enumType
val VkPipelineCacheHeaderVersion = "VkPipelineCacheHeaderVersion".enumType
val VkEventCreateFlagBits = "VkEventCreateFlagBits".enumType
val VkShaderStageFlagBits = "VkShaderStageFlagBits".enumType
val VkPipelineCreateFlagBits = "VkPipelineCreateFlagBits".enumType
val VkPipelineShaderStageCreateFlagBits = "VkPipelineShaderStageCreateFlagBits".enumType
val VkBorderColor = "VkBorderColor".enumType
val VkFilter = "VkFilter".enumType
val VkSamplerAddressMode = "VkSamplerAddressMode".enumType
val VkSamplerCreateFlagBits = "VkSamplerCreateFlagBits".enumType
val VkSamplerMipmapMode = "VkSamplerMipmapMode".enumType
val VkCompareOp = "VkCompareOp".enumType
val VkDescriptorPoolCreateFlagBits = "VkDescriptorPoolCreateFlagBits".enumType
val VkDescriptorType = "VkDescriptorType".enumType
val VkDescriptorSetLayoutCreateFlagBits = "VkDescriptorSetLayoutCreateFlagBits".enumType
val VkQueryPipelineStatisticFlagBits = "VkQueryPipelineStatisticFlagBits".enumType
val VkPipelineBindPoint = "VkPipelineBindPoint".enumType
val VkBlendFactor = "VkBlendFactor".enumType
val VkBlendOp = "VkBlendOp".enumType
val VkColorComponentFlagBits = "VkColorComponentFlagBits".enumType
val VkCullModeFlagBits = "VkCullModeFlagBits".enumType
val VkDynamicState = "VkDynamicState".enumType
val VkFrontFace = "VkFrontFace".enumType
val VkVertexInputRate = "VkVertexInputRate".enumType
val VkPrimitiveTopology = "VkPrimitiveTopology".enumType
val VkPolygonMode = "VkPolygonMode".enumType
val VkStencilOp = "VkStencilOp".enumType
val VkLogicOp = "VkLogicOp".enumType
val VkAttachmentLoadOp = "VkAttachmentLoadOp".enumType
val VkAttachmentStoreOp = "VkAttachmentStoreOp".enumType
val VkAttachmentDescriptionFlagBits = "VkAttachmentDescriptionFlagBits".enumType
val VkFramebufferCreateFlagBits = "VkFramebufferCreateFlagBits".enumType
val VkRenderPassCreateFlagBits = "VkRenderPassCreateFlagBits".enumType
val VkSubpassDescriptionFlagBits = "VkSubpassDescriptionFlagBits".enumType
val VkStencilFaceFlagBits = "VkStencilFaceFlagBits".enumType
val VkSubpassContents = "VkSubpassContents".enumType
val VkPeerMemoryFeatureFlagBits = "VkPeerMemoryFeatureFlagBits".enumType
val VkMemoryAllocateFlagBits = "VkMemoryAllocateFlagBits".enumType
val VkDeviceQueueCreateFlagBits = "VkDeviceQueueCreateFlagBits".enumType
val VkExternalMemoryHandleTypeFlagBits = "VkExternalMemoryHandleTypeFlagBits".enumType
val VkExternalMemoryFeatureFlagBits = "VkExternalMemoryFeatureFlagBits".enumType
val VkExternalFenceHandleTypeFlagBits = "VkExternalFenceHandleTypeFlagBits".enumType
val VkExternalFenceFeatureFlagBits = "VkExternalFenceFeatureFlagBits".enumType
val VkFenceImportFlagBits = "VkFenceImportFlagBits".enumType
val VkSemaphoreImportFlagBits = "VkSemaphoreImportFlagBits".enumType
val VkExternalSemaphoreHandleTypeFlagBits = "VkExternalSemaphoreHandleTypeFlagBits".enumType
val VkExternalSemaphoreFeatureFlagBits = "VkExternalSemaphoreFeatureFlagBits".enumType
val VkSubgroupFeatureFlagBits = "VkSubgroupFeatureFlagBits".enumType
val VkDescriptorUpdateTemplateType = "VkDescriptorUpdateTemplateType".enumType
val VkSamplerYcbcrModelConversion = "VkSamplerYcbcrModelConversion".enumType
val VkSamplerYcbcrRange = "VkSamplerYcbcrRange".enumType
val VkChromaLocation = "VkChromaLocation".enumType
val VkPointClippingBehavior = "VkPointClippingBehavior".enumType
val VkTessellationDomainOrigin = "VkTessellationDomainOrigin".enumType
val VkDriverId = "VkDriverId".enumType
val VkShaderFloatControlsIndependence = "VkShaderFloatControlsIndependence".enumType
val VkSemaphoreType = "VkSemaphoreType".enumType
val VkSemaphoreWaitFlagBits = "VkSemaphoreWaitFlagBits".enumType
val VkDescriptorBindingFlagBits = "VkDescriptorBindingFlagBits".enumType
val VkSamplerReductionMode = "VkSamplerReductionMode".enumType
val VkResolveModeFlagBits = "VkResolveModeFlagBits".enumType
val VkToolPurposeFlagBits = "VkToolPurposeFlagBits".enumType
val VkPipelineStageFlagBits2 = "VkPipelineStageFlagBits2".enumType
val VkAccessFlagBits2 = "VkAccessFlagBits2".enumType
val VkSubmitFlagBits = "VkSubmitFlagBits".enumType
val VkFormatFeatureFlagBits2 = "VkFormatFeatureFlagBits2".enumType
val VkPipelineCreationFeedbackFlagBits = "VkPipelineCreationFeedbackFlagBits".enumType
val VkPipelineCacheCreateFlagBits = "VkPipelineCacheCreateFlagBits".enumType
val VkRenderingFlagBits = "VkRenderingFlagBits".enumType
val VkPipelineRobustnessBufferBehavior = "VkPipelineRobustnessBufferBehavior".enumType
val VkPipelineRobustnessImageBehavior = "VkPipelineRobustnessImageBehavior".enumType
val VkQueueGlobalPriority = "VkQueueGlobalPriority".enumType
val VkMemoryUnmapFlagBits = "VkMemoryUnmapFlagBits".enumType
val VkBufferUsageFlagBits2 = "VkBufferUsageFlagBits2".enumType
val VkHostImageCopyFlagBits = "VkHostImageCopyFlagBits".enumType
val VkPipelineCreateFlagBits2 = "VkPipelineCreateFlagBits2".enumType
val VkLineRasterizationMode = "VkLineRasterizationMode".enumType

// Bitmask types
val VkAccessFlags = typedef(VkFlags, "VkAccessFlags")
val VkImageAspectFlags = typedef(VkFlags, "VkImageAspectFlags")
val VkFormatFeatureFlags = typedef(VkFlags, "VkFormatFeatureFlags")
val VkImageCreateFlags = typedef(VkFlags, "VkImageCreateFlags")
val VkSampleCountFlags = typedef(VkFlags, "VkSampleCountFlags")
val VkImageUsageFlags = typedef(VkFlags, "VkImageUsageFlags")
val VkInstanceCreateFlags = typedef(VkFlags, "VkInstanceCreateFlags")
val VkMemoryHeapFlags = typedef(VkFlags, "VkMemoryHeapFlags")
val VkMemoryPropertyFlags = typedef(VkFlags, "VkMemoryPropertyFlags")
val VkQueueFlags = typedef(VkFlags, "VkQueueFlags")
val VkDeviceCreateFlags = typedef(VkFlags, "VkDeviceCreateFlags")
val VkDeviceQueueCreateFlags = typedef(VkFlags, "VkDeviceQueueCreateFlags")
val VkPipelineStageFlags = typedef(VkFlags, "VkPipelineStageFlags")
val VkMemoryMapFlags = typedef(VkFlags, "VkMemoryMapFlags")
val VkSparseMemoryBindFlags = typedef(VkFlags, "VkSparseMemoryBindFlags")
val VkSparseImageFormatFlags = typedef(VkFlags, "VkSparseImageFormatFlags")
val VkFenceCreateFlags = typedef(VkFlags, "VkFenceCreateFlags")
val VkSemaphoreCreateFlags = typedef(VkFlags, "VkSemaphoreCreateFlags")
val VkQueryPoolCreateFlags = typedef(VkFlags, "VkQueryPoolCreateFlags")
val VkQueryPipelineStatisticFlags = typedef(VkFlags, "VkQueryPipelineStatisticFlags")
val VkQueryResultFlags = typedef(VkFlags, "VkQueryResultFlags")
val VkBufferCreateFlags = typedef(VkFlags, "VkBufferCreateFlags")
val VkBufferUsageFlags = typedef(VkFlags, "VkBufferUsageFlags")
val VkImageViewCreateFlags = typedef(VkFlags, "VkImageViewCreateFlags")
val VkDependencyFlags = typedef(VkFlags, "VkDependencyFlags")
val VkCommandPoolCreateFlags = typedef(VkFlags, "VkCommandPoolCreateFlags")
val VkCommandPoolResetFlags = typedef(VkFlags, "VkCommandPoolResetFlags")
val VkCommandBufferUsageFlags = typedef(VkFlags, "VkCommandBufferUsageFlags")
val VkQueryControlFlags = typedef(VkFlags, "VkQueryControlFlags")
val VkCommandBufferResetFlags = typedef(VkFlags, "VkCommandBufferResetFlags")
val VkEventCreateFlags = typedef(VkFlags, "VkEventCreateFlags")
val VkBufferViewCreateFlags = typedef(VkFlags, "VkBufferViewCreateFlags")
val VkShaderModuleCreateFlags = typedef(VkFlags, "VkShaderModuleCreateFlags")
val VkPipelineCacheCreateFlags = typedef(VkFlags, "VkPipelineCacheCreateFlags")
val VkPipelineCreateFlags = typedef(VkFlags, "VkPipelineCreateFlags")
val VkPipelineShaderStageCreateFlags = typedef(VkFlags, "VkPipelineShaderStageCreateFlags")
val VkPipelineLayoutCreateFlags = typedef(VkFlags, "VkPipelineLayoutCreateFlags")
val VkShaderStageFlags = typedef(VkFlags, "VkShaderStageFlags")
val VkSamplerCreateFlags = typedef(VkFlags, "VkSamplerCreateFlags")
val VkDescriptorPoolCreateFlags = typedef(VkFlags, "VkDescriptorPoolCreateFlags")
val VkDescriptorPoolResetFlags = typedef(VkFlags, "VkDescriptorPoolResetFlags")
val VkDescriptorSetLayoutCreateFlags = typedef(VkFlags, "VkDescriptorSetLayoutCreateFlags")
val VkColorComponentFlags = typedef(VkFlags, "VkColorComponentFlags")
val VkCullModeFlags = typedef(VkFlags, "VkCullModeFlags")
val VkPipelineVertexInputStateCreateFlags = typedef(VkFlags, "VkPipelineVertexInputStateCreateFlags")
val VkPipelineInputAssemblyStateCreateFlags = typedef(VkFlags, "VkPipelineInputAssemblyStateCreateFlags")
val VkPipelineTessellationStateCreateFlags = typedef(VkFlags, "VkPipelineTessellationStateCreateFlags")
val VkPipelineViewportStateCreateFlags = typedef(VkFlags, "VkPipelineViewportStateCreateFlags")
val VkPipelineRasterizationStateCreateFlags = typedef(VkFlags, "VkPipelineRasterizationStateCreateFlags")
val VkPipelineMultisampleStateCreateFlags = typedef(VkFlags, "VkPipelineMultisampleStateCreateFlags")
val VkPipelineDepthStencilStateCreateFlags = typedef(VkFlags, "VkPipelineDepthStencilStateCreateFlags")
val VkPipelineColorBlendStateCreateFlags = typedef(VkFlags, "VkPipelineColorBlendStateCreateFlags")
val VkPipelineDynamicStateCreateFlags = typedef(VkFlags, "VkPipelineDynamicStateCreateFlags")
val VkAttachmentDescriptionFlags = typedef(VkFlags, "VkAttachmentDescriptionFlags")
val VkFramebufferCreateFlags = typedef(VkFlags, "VkFramebufferCreateFlags")
val VkRenderPassCreateFlags = typedef(VkFlags, "VkRenderPassCreateFlags")
val VkSubpassDescriptionFlags = typedef(VkFlags, "VkSubpassDescriptionFlags")
val VkStencilFaceFlags = typedef(VkFlags, "VkStencilFaceFlags")
val VkPeerMemoryFeatureFlags = typedef(VkFlags, "VkPeerMemoryFeatureFlags")
val VkMemoryAllocateFlags = typedef(VkFlags, "VkMemoryAllocateFlags")
val VkCommandPoolTrimFlags = typedef(VkFlags, "VkCommandPoolTrimFlags")
val VkExternalMemoryHandleTypeFlags = typedef(VkFlags, "VkExternalMemoryHandleTypeFlags")
val VkExternalMemoryFeatureFlags = typedef(VkFlags, "VkExternalMemoryFeatureFlags")
val VkExternalFenceHandleTypeFlags = typedef(VkFlags, "VkExternalFenceHandleTypeFlags")
val VkExternalFenceFeatureFlags = typedef(VkFlags, "VkExternalFenceFeatureFlags")
val VkFenceImportFlags = typedef(VkFlags, "VkFenceImportFlags")
val VkSemaphoreImportFlags = typedef(VkFlags, "VkSemaphoreImportFlags")
val VkExternalSemaphoreHandleTypeFlags = typedef(VkFlags, "VkExternalSemaphoreHandleTypeFlags")
val VkExternalSemaphoreFeatureFlags = typedef(VkFlags, "VkExternalSemaphoreFeatureFlags")
val VkSubgroupFeatureFlags = typedef(VkFlags, "VkSubgroupFeatureFlags")
val VkDescriptorUpdateTemplateCreateFlags = typedef(VkFlags, "VkDescriptorUpdateTemplateCreateFlags")
val VkResolveModeFlags = typedef(VkFlags, "VkResolveModeFlags")
val VkSemaphoreWaitFlags = typedef(VkFlags, "VkSemaphoreWaitFlags")
val VkDescriptorBindingFlags = typedef(VkFlags, "VkDescriptorBindingFlags")
val VkToolPurposeFlags = typedef(VkFlags, "VkToolPurposeFlags")
val VkPrivateDataSlotCreateFlags = typedef(VkFlags, "VkPrivateDataSlotCreateFlags")
val VkPipelineStageFlags2 = typedef(VkFlags64, "VkPipelineStageFlags2")
val VkAccessFlags2 = typedef(VkFlags64, "VkAccessFlags2")
val VkSubmitFlags = typedef(VkFlags, "VkSubmitFlags")
val VkFormatFeatureFlags2 = typedef(VkFlags64, "VkFormatFeatureFlags2")
val VkPipelineCreationFeedbackFlags = typedef(VkFlags, "VkPipelineCreationFeedbackFlags")
val VkRenderingFlags = typedef(VkFlags, "VkRenderingFlags")
val VkMemoryUnmapFlags = typedef(VkFlags, "VkMemoryUnmapFlags")
val VkBufferUsageFlags2 = typedef(VkFlags64, "VkBufferUsageFlags2")
val VkHostImageCopyFlags = typedef(VkFlags, "VkHostImageCopyFlags")
val VkPipelineCreateFlags2 = typedef(VkFlags64, "VkPipelineCreateFlags2")

// Function pointer types
val PFN_vkAllocationFunction = Module.VULKAN.callback {
    void.p(
        "VkAllocationFunction",

        opaque_p("pUserData"),
        size_t("size"),
        size_t("alignment"),
        VkSystemAllocationScope("allocationScope"),

        nativeType = "PFN_vkAllocationFunction"
    ) {}
}

val PFN_vkFreeFunction = Module.VULKAN.callback {
    void(
        "VkFreeFunction",

        opaque_p("pUserData"),
        opaque_p("pMemory"),

        nativeType = "PFN_vkFreeFunction"
    ) {}
}

val PFN_vkInternalAllocationNotification = Module.VULKAN.callback {
    void(
        "VkInternalAllocationNotification",

        opaque_p("pUserData"),
        size_t("size"),
        VkInternalAllocationType("allocationType"),
        VkSystemAllocationScope("allocationScope"),

        nativeType = "PFN_vkInternalAllocationNotification"
    ) {}
}

val PFN_vkInternalFreeNotification = Module.VULKAN.callback {
    void(
        "VkInternalFreeNotification",

        opaque_p("pUserData"),
        size_t("size"),
        VkInternalAllocationType("allocationType"),
        VkSystemAllocationScope("allocationScope"),

        nativeType = "PFN_vkInternalFreeNotification"
    ) {}
}

val PFN_vkReallocationFunction = Module.VULKAN.callback {
    void.p(
        "VkReallocationFunction",

        opaque_p("pUserData"),
        opaque_p("pOriginal"),
        size_t("size"),
        size_t("alignment"),
        VkSystemAllocationScope("allocationScope"),

        nativeType = "PFN_vkReallocationFunction"
    ) {}
}

// Struct types
val VkExtent2D = struct(Module.VULKAN, "VkExtent2D") {
    uint32_t("width")
    uint32_t("height")
}

val VkExtent3D = struct(Module.VULKAN, "VkExtent3D") {
    uint32_t("width")
    uint32_t("height")
    uint32_t("depth")
}

val VkOffset2D = struct(Module.VULKAN, "VkOffset2D") {
    int32_t("x")
    int32_t("y")
}

val VkOffset3D = struct(Module.VULKAN, "VkOffset3D") {
    int32_t("x")
    int32_t("y")
    int32_t("z")
}

val VkRect2D = struct(Module.VULKAN, "VkRect2D") {
    VkOffset2D("offset")
    VkExtent2D("extent")
}

val _VkBaseInStructure = struct(Module.VULKAN, "VkBaseInStructure")
val VkBaseInStructure = struct(Module.VULKAN, "VkBaseInStructure") {
    VkStructureType("sType")
    nullable.._VkBaseInStructure.const.p("pNext")
}

val _VkBaseOutStructure = struct(Module.VULKAN, "VkBaseOutStructure")
val VkBaseOutStructure = struct(Module.VULKAN, "VkBaseOutStructure") {
    VkStructureType("sType")
    nullable.._VkBaseOutStructure.p("pNext")
}

val VkBufferMemoryBarrier = struct(Module.VULKAN, "VkBufferMemoryBarrier") {
    Expression("#STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER")..VkStructureType("sType")
    PointerSetter(
        "VkExternalMemoryAcquireUnmodifiedEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkAccessFlags("srcAccessMask")
    VkAccessFlags("dstAccessMask")
    uint32_t("srcQueueFamilyIndex")
    uint32_t("dstQueueFamilyIndex")
    VkBuffer("buffer")
    VkDeviceSize("offset")
    VkDeviceSize("size")
}

val VkImageSubresourceRange = struct(Module.VULKAN, "VkImageSubresourceRange") {
    VkImageAspectFlags("aspectMask")
    uint32_t("baseMipLevel")
    uint32_t("levelCount")
    uint32_t("baseArrayLayer")
    uint32_t("layerCount")
}

val VkImageMemoryBarrier = struct(Module.VULKAN, "VkImageMemoryBarrier") {
    Expression("#STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER")..VkStructureType("sType")
    PointerSetter(
        "VkExternalMemoryAcquireUnmodifiedEXT", "VkSampleLocationsInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkAccessFlags("srcAccessMask")
    VkAccessFlags("dstAccessMask")
    VkImageLayout("oldLayout")
    VkImageLayout("newLayout")
    uint32_t("srcQueueFamilyIndex")
    uint32_t("dstQueueFamilyIndex")
    VkImage("image")
    VkImageSubresourceRange("subresourceRange")
}

val VkMemoryBarrier = struct(Module.VULKAN, "VkMemoryBarrier") {
    Expression("#STRUCTURE_TYPE_MEMORY_BARRIER")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkAccessFlags("srcAccessMask")
    VkAccessFlags("dstAccessMask")
}

val VkAllocationCallbacks = struct(Module.VULKAN, "VkAllocationCallbacks") {
    nullable..opaque_p("pUserData")
    nullable..PFN_vkAllocationFunction("pfnAllocation")
    nullable..PFN_vkReallocationFunction("pfnReallocation")
    nullable..PFN_vkFreeFunction("pfnFree")
    nullable..PFN_vkInternalAllocationNotification("pfnInternalAllocation")
    nullable..PFN_vkInternalFreeNotification("pfnInternalFree")
}

val VkApplicationInfo = struct(Module.VULKAN, "VkApplicationInfo") {
    Expression("#STRUCTURE_TYPE_APPLICATION_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    nullable..charUTF8.const.p("pApplicationName")
    uint32_t("applicationVersion")
    nullable..charUTF8.const.p("pEngineName")
    uint32_t("engineVersion")
    uint32_t("apiVersion")
}

val VkFormatProperties = struct(Module.VULKAN, "VkFormatProperties", mutable = false) {
    VkFormatFeatureFlags("linearTilingFeatures")
    VkFormatFeatureFlags("optimalTilingFeatures")
    VkFormatFeatureFlags("bufferFeatures")
}

val VkImageFormatProperties = struct(Module.VULKAN, "VkImageFormatProperties", mutable = false) {
    VkExtent3D("maxExtent")
    uint32_t("maxMipLevels")
    uint32_t("maxArrayLayers")
    VkSampleCountFlags("sampleCounts")
    VkDeviceSize("maxResourceSize")
}

val VkInstanceCreateInfo = struct(Module.VULKAN, "VkInstanceCreateInfo") {
    Expression("#STRUCTURE_TYPE_INSTANCE_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkDebugReportCallbackCreateInfoEXT", "VkDebugUtilsMessengerCreateInfoEXT", "VkDirectDriverLoadingListLUNARG", "VkExportMetalObjectCreateInfoEXT", "VkLayerSettingsCreateInfoEXT", "VkValidationFeaturesEXT", "VkValidationFlagsEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkInstanceCreateFlags("flags")
    nullable..VkApplicationInfo.const.p("pApplicationInfo")
    AutoSize("ppEnabledLayerNames", optional = true)..uint32_t("enabledLayerCount")
    charUTF8.const.p.const.p("ppEnabledLayerNames")
    AutoSize("ppEnabledExtensionNames", optional = true)..uint32_t("enabledExtensionCount")
    charUTF8.const.p.const.p("ppEnabledExtensionNames")
}

val VkMemoryHeap = struct(Module.VULKAN, "VkMemoryHeap", mutable = false) {
    VkDeviceSize("size")
    VkMemoryHeapFlags("flags")
}

val VkMemoryType = struct(Module.VULKAN, "VkMemoryType", mutable = false) {
    VkMemoryPropertyFlags("propertyFlags")
    uint32_t("heapIndex")
}

val VkPhysicalDeviceFeatures = struct(Module.VULKAN, "VkPhysicalDeviceFeatures") {
    VkBool32("robustBufferAccess")
    VkBool32("fullDrawIndexUint32")
    VkBool32("imageCubeArray")
    VkBool32("independentBlend")
    VkBool32("geometryShader")
    VkBool32("tessellationShader")
    VkBool32("sampleRateShading")
    VkBool32("dualSrcBlend")
    VkBool32("logicOp")
    VkBool32("multiDrawIndirect")
    VkBool32("drawIndirectFirstInstance")
    VkBool32("depthClamp")
    VkBool32("depthBiasClamp")
    VkBool32("fillModeNonSolid")
    VkBool32("depthBounds")
    VkBool32("wideLines")
    VkBool32("largePoints")
    VkBool32("alphaToOne")
    VkBool32("multiViewport")
    VkBool32("samplerAnisotropy")
    VkBool32("textureCompressionETC2")
    VkBool32("textureCompressionASTC_LDR")
    VkBool32("textureCompressionBC")
    VkBool32("occlusionQueryPrecise")
    VkBool32("pipelineStatisticsQuery")
    VkBool32("vertexPipelineStoresAndAtomics")
    VkBool32("fragmentStoresAndAtomics")
    VkBool32("shaderTessellationAndGeometryPointSize")
    VkBool32("shaderImageGatherExtended")
    VkBool32("shaderStorageImageExtendedFormats")
    VkBool32("shaderStorageImageMultisample")
    VkBool32("shaderStorageImageReadWithoutFormat")
    VkBool32("shaderStorageImageWriteWithoutFormat")
    VkBool32("shaderUniformBufferArrayDynamicIndexing")
    VkBool32("shaderSampledImageArrayDynamicIndexing")
    VkBool32("shaderStorageBufferArrayDynamicIndexing")
    VkBool32("shaderStorageImageArrayDynamicIndexing")
    VkBool32("shaderClipDistance")
    VkBool32("shaderCullDistance")
    VkBool32("shaderFloat64")
    VkBool32("shaderInt64")
    VkBool32("shaderInt16")
    VkBool32("shaderResourceResidency")
    VkBool32("shaderResourceMinLod")
    VkBool32("sparseBinding")
    VkBool32("sparseResidencyBuffer")
    VkBool32("sparseResidencyImage2D")
    VkBool32("sparseResidencyImage3D")
    VkBool32("sparseResidency2Samples")
    VkBool32("sparseResidency4Samples")
    VkBool32("sparseResidency8Samples")
    VkBool32("sparseResidency16Samples")
    VkBool32("sparseResidencyAliased")
    VkBool32("variableMultisampleRate")
    VkBool32("inheritedQueries")
}

val VkPhysicalDeviceLimits = struct(Module.VULKAN, "VkPhysicalDeviceLimits", mutable = false) {
    uint32_t("maxImageDimension1D")
    uint32_t("maxImageDimension2D")
    uint32_t("maxImageDimension3D")
    uint32_t("maxImageDimensionCube")
    uint32_t("maxImageArrayLayers")
    uint32_t("maxTexelBufferElements")
    uint32_t("maxUniformBufferRange")
    uint32_t("maxStorageBufferRange")
    uint32_t("maxPushConstantsSize")
    uint32_t("maxMemoryAllocationCount")
    uint32_t("maxSamplerAllocationCount")
    VkDeviceSize("bufferImageGranularity")
    VkDeviceSize("sparseAddressSpaceSize")
    uint32_t("maxBoundDescriptorSets")
    uint32_t("maxPerStageDescriptorSamplers")
    uint32_t("maxPerStageDescriptorUniformBuffers")
    uint32_t("maxPerStageDescriptorStorageBuffers")
    uint32_t("maxPerStageDescriptorSampledImages")
    uint32_t("maxPerStageDescriptorStorageImages")
    uint32_t("maxPerStageDescriptorInputAttachments")
    uint32_t("maxPerStageResources")
    uint32_t("maxDescriptorSetSamplers")
    uint32_t("maxDescriptorSetUniformBuffers")
    uint32_t("maxDescriptorSetUniformBuffersDynamic")
    uint32_t("maxDescriptorSetStorageBuffers")
    uint32_t("maxDescriptorSetStorageBuffersDynamic")
    uint32_t("maxDescriptorSetSampledImages")
    uint32_t("maxDescriptorSetStorageImages")
    uint32_t("maxDescriptorSetInputAttachments")
    uint32_t("maxVertexInputAttributes")
    uint32_t("maxVertexInputBindings")
    uint32_t("maxVertexInputAttributeOffset")
    uint32_t("maxVertexInputBindingStride")
    uint32_t("maxVertexOutputComponents")
    uint32_t("maxTessellationGenerationLevel")
    uint32_t("maxTessellationPatchSize")
    uint32_t("maxTessellationControlPerVertexInputComponents")
    uint32_t("maxTessellationControlPerVertexOutputComponents")
    uint32_t("maxTessellationControlPerPatchOutputComponents")
    uint32_t("maxTessellationControlTotalOutputComponents")
    uint32_t("maxTessellationEvaluationInputComponents")
    uint32_t("maxTessellationEvaluationOutputComponents")
    uint32_t("maxGeometryShaderInvocations")
    uint32_t("maxGeometryInputComponents")
    uint32_t("maxGeometryOutputComponents")
    uint32_t("maxGeometryOutputVertices")
    uint32_t("maxGeometryTotalOutputComponents")
    uint32_t("maxFragmentInputComponents")
    uint32_t("maxFragmentOutputAttachments")
    uint32_t("maxFragmentDualSrcAttachments")
    uint32_t("maxFragmentCombinedOutputResources")
    uint32_t("maxComputeSharedMemorySize")
    uint32_t("maxComputeWorkGroupCount")[3]
    uint32_t("maxComputeWorkGroupInvocations")
    uint32_t("maxComputeWorkGroupSize")[3]
    uint32_t("subPixelPrecisionBits")
    uint32_t("subTexelPrecisionBits")
    uint32_t("mipmapPrecisionBits")
    uint32_t("maxDrawIndexedIndexValue")
    uint32_t("maxDrawIndirectCount")
    float("maxSamplerLodBias")
    float("maxSamplerAnisotropy")
    uint32_t("maxViewports")
    uint32_t("maxViewportDimensions")[2]
    float("viewportBoundsRange")[2]
    uint32_t("viewportSubPixelBits")
    size_t("minMemoryMapAlignment")
    VkDeviceSize("minTexelBufferOffsetAlignment")
    VkDeviceSize("minUniformBufferOffsetAlignment")
    VkDeviceSize("minStorageBufferOffsetAlignment")
    int32_t("minTexelOffset")
    uint32_t("maxTexelOffset")
    int32_t("minTexelGatherOffset")
    uint32_t("maxTexelGatherOffset")
    float("minInterpolationOffset")
    float("maxInterpolationOffset")
    uint32_t("subPixelInterpolationOffsetBits")
    uint32_t("maxFramebufferWidth")
    uint32_t("maxFramebufferHeight")
    uint32_t("maxFramebufferLayers")
    VkSampleCountFlags("framebufferColorSampleCounts")
    VkSampleCountFlags("framebufferDepthSampleCounts")
    VkSampleCountFlags("framebufferStencilSampleCounts")
    VkSampleCountFlags("framebufferNoAttachmentsSampleCounts")
    uint32_t("maxColorAttachments")
    VkSampleCountFlags("sampledImageColorSampleCounts")
    VkSampleCountFlags("sampledImageIntegerSampleCounts")
    VkSampleCountFlags("sampledImageDepthSampleCounts")
    VkSampleCountFlags("sampledImageStencilSampleCounts")
    VkSampleCountFlags("storageImageSampleCounts")
    uint32_t("maxSampleMaskWords")
    VkBool32("timestampComputeAndGraphics")
    float("timestampPeriod")
    uint32_t("maxClipDistances")
    uint32_t("maxCullDistances")
    uint32_t("maxCombinedClipAndCullDistances")
    uint32_t("discreteQueuePriorities")
    float("pointSizeRange")[2]
    float("lineWidthRange")[2]
    float("pointSizeGranularity")
    float("lineWidthGranularity")
    VkBool32("strictLines")
    VkBool32("standardSampleLocations")
    VkDeviceSize("optimalBufferCopyOffsetAlignment")
    VkDeviceSize("optimalBufferCopyRowPitchAlignment")
    VkDeviceSize("nonCoherentAtomSize")
}

val VkPhysicalDeviceMemoryProperties = struct(Module.VULKAN, "VkPhysicalDeviceMemoryProperties", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    AutoSize("memoryTypes")..uint32_t("memoryTypeCount")
    VkMemoryType("memoryTypes")["VK_MAX_MEMORY_TYPES"]
    AutoSize("memoryHeaps")..uint32_t("memoryHeapCount")
    VkMemoryHeap("memoryHeaps")["VK_MAX_MEMORY_HEAPS"]
}

val VkPhysicalDeviceSparseProperties = struct(Module.VULKAN, "VkPhysicalDeviceSparseProperties", mutable = false) {
    VkBool32("residencyStandard2DBlockShape")
    VkBool32("residencyStandard2DMultisampleBlockShape")
    VkBool32("residencyStandard3DBlockShape")
    VkBool32("residencyAlignedMipSize")
    VkBool32("residencyNonResidentStrict")
}

val VkPhysicalDeviceProperties = struct(Module.VULKAN, "VkPhysicalDeviceProperties", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    uint32_t("apiVersion")
    uint32_t("driverVersion")
    uint32_t("vendorID")
    uint32_t("deviceID")
    VkPhysicalDeviceType("deviceType")
    charUTF8("deviceName")["VK_MAX_PHYSICAL_DEVICE_NAME_SIZE"]
    uint8_t("pipelineCacheUUID")["VK_UUID_SIZE"]
    VkPhysicalDeviceLimits("limits")
    VkPhysicalDeviceSparseProperties("sparseProperties")
}

val VkQueueFamilyProperties = struct(Module.VULKAN, "VkQueueFamilyProperties", mutable = false) {
    VkQueueFlags("queueFlags")
    uint32_t("queueCount")
    uint32_t("timestampValidBits")
    VkExtent3D("minImageTransferGranularity")
}

val VkDeviceQueueCreateInfo = struct(Module.VULKAN, "VkDeviceQueueCreateInfo") {
    Expression("#STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkDeviceQueueGlobalPriorityCreateInfo", "VkDeviceQueueGlobalPriorityCreateInfoEXT", "VkDeviceQueueGlobalPriorityCreateInfoKHR", "VkDeviceQueueShaderCoreControlCreateInfoARM",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkDeviceQueueCreateFlags("flags")
    uint32_t("queueFamilyIndex")
    AutoSize("pQueuePriorities")..uint32_t("queueCount")
    float.const.p("pQueuePriorities")
}

val VkDeviceCreateInfo = struct(Module.VULKAN, "VkDeviceCreateInfo") {
    Expression("#STRUCTURE_TYPE_DEVICE_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkDeviceDeviceMemoryReportCreateInfoEXT", "VkDeviceDiagnosticsConfigCreateInfoNV", "VkDeviceGroupDeviceCreateInfo", "VkDeviceGroupDeviceCreateInfoKHR", "VkDeviceMemoryOverallocationCreateInfoAMD", "VkDevicePipelineBinaryInternalCacheControlKHR", "VkDevicePrivateDataCreateInfo", "VkDevicePrivateDataCreateInfoEXT", "VkDeviceQueueShaderCoreControlCreateInfoARM", "VkExternalComputeQueueDeviceCreateInfoNV", "VkPhysicalDevice16BitStorageFeatures", "VkPhysicalDevice16BitStorageFeaturesKHR", "VkPhysicalDevice4444FormatsFeaturesEXT", "VkPhysicalDevice8BitStorageFeatures", "VkPhysicalDevice8BitStorageFeaturesKHR", "VkPhysicalDeviceASTCDecodeFeaturesEXT", "VkPhysicalDeviceAccelerationStructureFeaturesKHR", "VkPhysicalDeviceAddressBindingReportFeaturesEXT", "VkPhysicalDeviceAmigoProfilingFeaturesSEC", "VkPhysicalDeviceAntiLagFeaturesAMD", "VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT", "VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT", "VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT", "VkPhysicalDeviceBorderColorSwizzleFeaturesEXT", "VkPhysicalDeviceBufferAddressFeaturesEXT", "VkPhysicalDeviceBufferDeviceAddressFeatures", "VkPhysicalDeviceBufferDeviceAddressFeaturesEXT", "VkPhysicalDeviceBufferDeviceAddressFeaturesKHR", "VkPhysicalDeviceClusterAccelerationStructureFeaturesNV", "VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI", "VkPhysicalDeviceCoherentMemoryFeaturesAMD", "VkPhysicalDeviceColorWriteEnableFeaturesEXT", "VkPhysicalDeviceCommandBufferInheritanceFeaturesNV", "VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV", "VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR", "VkPhysicalDeviceComputeShaderDerivativesFeaturesNV", "VkPhysicalDeviceConditionalRenderingFeaturesEXT", "VkPhysicalDeviceCooperativeMatrix2FeaturesNV", "VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM", "VkPhysicalDeviceCooperativeMatrixFeaturesKHR", "VkPhysicalDeviceCooperativeMatrixFeaturesNV", "VkPhysicalDeviceCooperativeVectorFeaturesNV", "VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR", "VkPhysicalDeviceCopyMemoryIndirectFeaturesNV", "VkPhysicalDeviceCornerSampledImageFeaturesNV", "VkPhysicalDeviceCoverageReductionModeFeaturesNV", "VkPhysicalDeviceCubicClampFeaturesQCOM", "VkPhysicalDeviceCubicWeightsFeaturesQCOM", "VkPhysicalDeviceCudaKernelLaunchFeaturesNV", "VkPhysicalDeviceCustomBorderColorFeaturesEXT", "VkPhysicalDeviceCustomResolveFeaturesEXT", "VkPhysicalDeviceDataGraphFeaturesARM", "VkPhysicalDeviceDataGraphModelFeaturesQCOM", "VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV", "VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX", "VkPhysicalDeviceDepthBiasControlFeaturesEXT", "VkPhysicalDeviceDepthClampControlFeaturesEXT", "VkPhysicalDeviceDepthClampZeroOneFeaturesEXT", "VkPhysicalDeviceDepthClampZeroOneFeaturesKHR", "VkPhysicalDeviceDepthClipControlFeaturesEXT", "VkPhysicalDeviceDepthClipEnableFeaturesEXT", "VkPhysicalDeviceDescriptorBufferFeaturesEXT", "VkPhysicalDeviceDescriptorBufferTensorFeaturesARM", "VkPhysicalDeviceDescriptorHeapFeaturesEXT", "VkPhysicalDeviceDescriptorIndexingFeatures", "VkPhysicalDeviceDescriptorIndexingFeaturesEXT", "VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV", "VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE", "VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV", "VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT", "VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV", "VkPhysicalDeviceDeviceMemoryReportFeaturesEXT", "VkPhysicalDeviceDiagnosticsConfigFeaturesNV", "VkPhysicalDeviceDisplacementMicromapFeaturesNV", "VkPhysicalDeviceDynamicRenderingFeatures", "VkPhysicalDeviceDynamicRenderingFeaturesKHR", "VkPhysicalDeviceDynamicRenderingLocalReadFeatures", "VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR", "VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT", "VkPhysicalDeviceExclusiveScissorFeaturesNV", "VkPhysicalDeviceExtendedDynamicState2FeaturesEXT", "VkPhysicalDeviceExtendedDynamicState3FeaturesEXT", "VkPhysicalDeviceExtendedDynamicStateFeaturesEXT", "VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV", "VkPhysicalDeviceExternalFormatResolveFeaturesANDROID", "VkPhysicalDeviceExternalMemoryRDMAFeaturesNV", "VkPhysicalDeviceFaultFeaturesEXT", "VkPhysicalDeviceFeatures2", "VkPhysicalDeviceFeatures2KHR", "VkPhysicalDeviceFloat16Int8FeaturesKHR", "VkPhysicalDeviceFormatPackFeaturesARM", "VkPhysicalDeviceFragmentDensityMap2FeaturesEXT", "VkPhysicalDeviceFragmentDensityMapFeaturesEXT", "VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE", "VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT", "VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM", "VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR", "VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV", "VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT", "VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV", "VkPhysicalDeviceFragmentShadingRateFeaturesKHR", "VkPhysicalDeviceFrameBoundaryFeaturesEXT", "VkPhysicalDeviceGlobalPriorityQueryFeatures", "VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT", "VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR", "VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT", "VkPhysicalDeviceHdrVividFeaturesHUAWEI", "VkPhysicalDeviceHostImageCopyFeatures", "VkPhysicalDeviceHostImageCopyFeaturesEXT", "VkPhysicalDeviceHostQueryResetFeatures", "VkPhysicalDeviceHostQueryResetFeaturesEXT", "VkPhysicalDeviceImage2DViewOf3DFeaturesEXT", "VkPhysicalDeviceImageAlignmentControlFeaturesMESA", "VkPhysicalDeviceImageCompressionControlFeaturesEXT", "VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT", "VkPhysicalDeviceImageProcessing2FeaturesQCOM", "VkPhysicalDeviceImageProcessingFeaturesQCOM", "VkPhysicalDeviceImageRobustnessFeatures", "VkPhysicalDeviceImageRobustnessFeaturesEXT", "VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT", "VkPhysicalDeviceImageViewMinLodFeaturesEXT", "VkPhysicalDeviceImagelessFramebufferFeatures", "VkPhysicalDeviceImagelessFramebufferFeaturesKHR", "VkPhysicalDeviceIndexTypeUint8Features", "VkPhysicalDeviceIndexTypeUint8FeaturesEXT", "VkPhysicalDeviceIndexTypeUint8FeaturesKHR", "VkPhysicalDeviceInheritedViewportScissorFeaturesNV", "VkPhysicalDeviceInlineUniformBlockFeatures", "VkPhysicalDeviceInlineUniformBlockFeaturesEXT", "VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR", "VkPhysicalDeviceInvocationMaskFeaturesHUAWEI", "VkPhysicalDeviceLegacyDitheringFeaturesEXT", "VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT", "VkPhysicalDeviceLineRasterizationFeatures", "VkPhysicalDeviceLineRasterizationFeaturesEXT", "VkPhysicalDeviceLineRasterizationFeaturesKHR", "VkPhysicalDeviceLinearColorAttachmentFeaturesNV", "VkPhysicalDeviceMaintenance10FeaturesKHR", "VkPhysicalDeviceMaintenance4Features", "VkPhysicalDeviceMaintenance4FeaturesKHR", "VkPhysicalDeviceMaintenance5Features", "VkPhysicalDeviceMaintenance5FeaturesKHR", "VkPhysicalDeviceMaintenance6Features", "VkPhysicalDeviceMaintenance6FeaturesKHR", "VkPhysicalDeviceMaintenance7FeaturesKHR", "VkPhysicalDeviceMaintenance8FeaturesKHR", "VkPhysicalDeviceMaintenance9FeaturesKHR", "VkPhysicalDeviceMapMemoryPlacedFeaturesEXT", "VkPhysicalDeviceMemoryDecompressionFeaturesEXT", "VkPhysicalDeviceMemoryDecompressionFeaturesNV", "VkPhysicalDeviceMemoryPriorityFeaturesEXT", "VkPhysicalDeviceMeshShaderFeaturesEXT", "VkPhysicalDeviceMeshShaderFeaturesNV", "VkPhysicalDeviceMultiDrawFeaturesEXT", "VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT", "VkPhysicalDeviceMultiviewFeatures", "VkPhysicalDeviceMultiviewFeaturesKHR", "VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM", "VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM", "VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT", "VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE", "VkPhysicalDeviceNestedCommandBufferFeaturesEXT", "VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT", "VkPhysicalDeviceOpacityMicromapFeaturesEXT", "VkPhysicalDeviceOpticalFlowFeaturesNV", "VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT", "VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV", "VkPhysicalDevicePerStageDescriptorSetFeaturesNV", "VkPhysicalDevicePerformanceCountersByRegionFeaturesARM", "VkPhysicalDevicePerformanceQueryFeaturesKHR", "VkPhysicalDevicePipelineBinaryFeaturesKHR", "VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC", "VkPhysicalDevicePipelineCreationCacheControlFeatures", "VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT", "VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR", "VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT", "VkPhysicalDevicePipelineOpacityMicromapFeaturesARM", "VkPhysicalDevicePipelinePropertiesFeaturesEXT", "VkPhysicalDevicePipelineProtectedAccessFeatures", "VkPhysicalDevicePipelineProtectedAccessFeaturesEXT", "VkPhysicalDevicePipelineRobustnessFeatures", "VkPhysicalDevicePipelineRobustnessFeaturesEXT", "VkPhysicalDevicePortabilitySubsetFeaturesKHR", "VkPhysicalDevicePresentBarrierFeaturesNV", "VkPhysicalDevicePresentId2FeaturesKHR", "VkPhysicalDevicePresentIdFeaturesKHR", "VkPhysicalDevicePresentMeteringFeaturesNV", "VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT", "VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR", "VkPhysicalDevicePresentTimingFeaturesEXT", "VkPhysicalDevicePresentWait2FeaturesKHR", "VkPhysicalDevicePresentWaitFeaturesKHR", "VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT", "VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT", "VkPhysicalDevicePrivateDataFeatures", "VkPhysicalDevicePrivateDataFeaturesEXT", "VkPhysicalDeviceProtectedMemoryFeatures", "VkPhysicalDeviceProvokingVertexFeaturesEXT", "VkPhysicalDevicePushConstantBankFeaturesNV", "VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT", "VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM", "VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT", "VkPhysicalDeviceRawAccessChainsFeaturesNV", "VkPhysicalDeviceRayQueryFeaturesKHR", "VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT", "VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV", "VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV", "VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR", "VkPhysicalDeviceRayTracingMotionBlurFeaturesNV", "VkPhysicalDeviceRayTracingPipelineFeaturesKHR", "VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR", "VkPhysicalDeviceRayTracingValidationFeaturesNV", "VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG", "VkPhysicalDeviceRenderPassStripedFeaturesARM", "VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV", "VkPhysicalDeviceRobustness2FeaturesEXT", "VkPhysicalDeviceRobustness2FeaturesKHR", "VkPhysicalDeviceSamplerYcbcrConversionFeatures", "VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR", "VkPhysicalDeviceScalarBlockLayoutFeatures", "VkPhysicalDeviceScalarBlockLayoutFeaturesEXT", "VkPhysicalDeviceSchedulingControlsFeaturesARM", "VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures", "VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR", "VkPhysicalDeviceShader64BitIndexingFeaturesEXT", "VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV", "VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT", "VkPhysicalDeviceShaderAtomicFloatFeaturesEXT", "VkPhysicalDeviceShaderAtomicInt64Features", "VkPhysicalDeviceShaderAtomicInt64FeaturesKHR", "VkPhysicalDeviceShaderBfloat16FeaturesKHR", "VkPhysicalDeviceShaderClockFeaturesKHR", "VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM", "VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures", "VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT", "VkPhysicalDeviceShaderDrawParameterFeatures", "VkPhysicalDeviceShaderDrawParametersFeatures", "VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD", "VkPhysicalDeviceShaderEnqueueFeaturesAMDX", "VkPhysicalDeviceShaderExpectAssumeFeatures", "VkPhysicalDeviceShaderExpectAssumeFeaturesKHR", "VkPhysicalDeviceShaderFloat16Int8Features", "VkPhysicalDeviceShaderFloat16Int8FeaturesKHR", "VkPhysicalDeviceShaderFloat8FeaturesEXT", "VkPhysicalDeviceShaderFloatControls2Features", "VkPhysicalDeviceShaderFloatControls2FeaturesKHR", "VkPhysicalDeviceShaderFmaFeaturesKHR", "VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT", "VkPhysicalDeviceShaderImageFootprintFeaturesNV", "VkPhysicalDeviceShaderIntegerDotProductFeatures", "VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR", "VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL", "VkPhysicalDeviceShaderLongVectorFeaturesEXT", "VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR", "VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT", "VkPhysicalDeviceShaderObjectFeaturesEXT", "VkPhysicalDeviceShaderQuadControlFeaturesKHR", "VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR", "VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT", "VkPhysicalDeviceShaderSMBuiltinsFeaturesNV", "VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures", "VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR", "VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT", "VkPhysicalDeviceShaderSubgroupRotateFeatures", "VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR", "VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR", "VkPhysicalDeviceShaderTerminateInvocationFeatures", "VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR", "VkPhysicalDeviceShaderTileImageFeaturesEXT", "VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT", "VkPhysicalDeviceShaderUntypedPointersFeaturesKHR", "VkPhysicalDeviceShadingRateImageFeaturesNV", "VkPhysicalDeviceSubgroupSizeControlFeatures", "VkPhysicalDeviceSubgroupSizeControlFeaturesEXT", "VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT", "VkPhysicalDeviceSubpassShadingFeaturesHUAWEI", "VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT", "VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR", "VkPhysicalDeviceSynchronization2Features", "VkPhysicalDeviceSynchronization2FeaturesKHR", "VkPhysicalDeviceTensorFeaturesARM", "VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT", "VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT", "VkPhysicalDeviceTextureCompressionASTCHDRFeatures", "VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT", "VkPhysicalDeviceTileMemoryHeapFeaturesQCOM", "VkPhysicalDeviceTilePropertiesFeaturesQCOM", "VkPhysicalDeviceTileShadingFeaturesQCOM", "VkPhysicalDeviceTimelineSemaphoreFeatures", "VkPhysicalDeviceTimelineSemaphoreFeaturesKHR", "VkPhysicalDeviceTransformFeedbackFeaturesEXT", "VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR", "VkPhysicalDeviceUniformBufferStandardLayoutFeatures", "VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR", "VkPhysicalDeviceVariablePointerFeatures", "VkPhysicalDeviceVariablePointerFeaturesKHR", "VkPhysicalDeviceVariablePointersFeatures", "VkPhysicalDeviceVariablePointersFeaturesKHR", "VkPhysicalDeviceVertexAttributeDivisorFeatures", "VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT", "VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR", "VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT", "VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT", "VkPhysicalDeviceVideoDecodeVP9FeaturesKHR", "VkPhysicalDeviceVideoEncodeAV1FeaturesKHR", "VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR", "VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR", "VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE", "VkPhysicalDeviceVideoMaintenance1FeaturesKHR", "VkPhysicalDeviceVideoMaintenance2FeaturesKHR", "VkPhysicalDeviceVulkan11Features", "VkPhysicalDeviceVulkan12Features", "VkPhysicalDeviceVulkan13Features", "VkPhysicalDeviceVulkan14Features", "VkPhysicalDeviceVulkanMemoryModelFeatures", "VkPhysicalDeviceVulkanMemoryModelFeaturesKHR", "VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR", "VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT", "VkPhysicalDeviceYcbcrDegammaFeaturesQCOM", "VkPhysicalDeviceYcbcrImageArraysFeaturesEXT", "VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT", "VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures", "VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkDeviceCreateFlags("flags")
    AutoSize("pQueueCreateInfos", optional = true)..uint32_t("queueCreateInfoCount")
    VkDeviceQueueCreateInfo.const.p("pQueueCreateInfos")
    AutoSize("ppEnabledLayerNames", optional = true)..uint32_t("enabledLayerCount")
    charUTF8.const.p.const.p("ppEnabledLayerNames")
    AutoSize("ppEnabledExtensionNames", optional = true)..uint32_t("enabledExtensionCount")
    charUTF8.const.p.const.p("ppEnabledExtensionNames")
    nullable..VkPhysicalDeviceFeatures.const.p("pEnabledFeatures")
}

val VkExtensionProperties = struct(Module.VULKAN, "VkExtensionProperties", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    charUTF8("extensionName")["VK_MAX_EXTENSION_NAME_SIZE"]
    uint32_t("specVersion")
}

val VkLayerProperties = struct(Module.VULKAN, "VkLayerProperties", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    charUTF8("layerName")["VK_MAX_EXTENSION_NAME_SIZE"]
    uint32_t("specVersion")
    uint32_t("implementationVersion")
    charUTF8("description")["VK_MAX_DESCRIPTION_SIZE"]
}

val VkSubmitInfo = struct(Module.VULKAN, "VkSubmitInfo") {
    Expression("#STRUCTURE_TYPE_SUBMIT_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkAmigoProfilingSubmitInfoSEC", "VkD3D12FenceSubmitInfoKHR", "VkDeviceGroupSubmitInfo", "VkDeviceGroupSubmitInfoKHR", "VkFrameBoundaryEXT", "VkFrameBoundaryTensorsARM", "VkLatencySubmissionPresentIdNV", "VkPerformanceQuerySubmitInfoKHR", "VkProtectedSubmitInfo", "VkTimelineSemaphoreSubmitInfo", "VkTimelineSemaphoreSubmitInfoKHR", "VkWin32KeyedMutexAcquireReleaseInfoKHR", "VkWin32KeyedMutexAcquireReleaseInfoNV",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    AutoSize("pWaitSemaphores", "pWaitDstStageMask", optional = true)..uint32_t("waitSemaphoreCount")
    VkSemaphore.const.p("pWaitSemaphores")
    nullable..VkPipelineStageFlags.const.p("pWaitDstStageMask")
    AutoSize("pCommandBuffers", optional = true)..uint32_t("commandBufferCount")
    VkCommandBuffer.const.p("pCommandBuffers")
    AutoSize("pSignalSemaphores", optional = true)..uint32_t("signalSemaphoreCount")
    VkSemaphore.const.p("pSignalSemaphores")
}

val VkMappedMemoryRange = struct(Module.VULKAN, "VkMappedMemoryRange") {
    Expression("#STRUCTURE_TYPE_MAPPED_MEMORY_RANGE")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceMemory("memory")
    VkDeviceSize("offset")
    VkDeviceSize("size")
}

val VkMemoryAllocateInfo = struct(Module.VULKAN, "VkMemoryAllocateInfo") {
    Expression("#STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkDedicatedAllocationMemoryAllocateInfoNV", "VkExportMemoryAllocateInfo", "VkExportMemoryAllocateInfoKHR", "VkExportMemoryAllocateInfoNV", "VkExportMemoryWin32HandleInfoKHR", "VkExportMemoryWin32HandleInfoNV", "VkExportMetalObjectCreateInfoEXT", "VkImportAndroidHardwareBufferInfoANDROID", "VkImportMemoryFdInfoKHR", "VkImportMemoryHostPointerInfoEXT", "VkImportMemoryMetalHandleInfoEXT", "VkImportMemoryWin32HandleInfoKHR", "VkImportMemoryWin32HandleInfoNV", "VkImportMetalBufferInfoEXT", "VkMemoryAllocateFlagsInfo", "VkMemoryAllocateFlagsInfoKHR", "VkMemoryDedicatedAllocateInfo", "VkMemoryDedicatedAllocateInfoKHR", "VkMemoryDedicatedAllocateInfoTensorARM", "VkMemoryOpaqueCaptureAddressAllocateInfo", "VkMemoryOpaqueCaptureAddressAllocateInfoKHR", "VkMemoryPriorityAllocateInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkDeviceSize("allocationSize")
    uint32_t("memoryTypeIndex")
}

val VkMemoryRequirements = struct(Module.VULKAN, "VkMemoryRequirements", mutable = false) {
    VkDeviceSize("size")
    VkDeviceSize("alignment")
    uint32_t("memoryTypeBits")
}

val VkSparseMemoryBind = struct(Module.VULKAN, "VkSparseMemoryBind") {
    VkDeviceSize("resourceOffset")
    VkDeviceSize("size")
    VkDeviceMemory("memory")
    VkDeviceSize("memoryOffset")
    VkSparseMemoryBindFlags("flags")
}

val VkSparseBufferMemoryBindInfo = struct(Module.VULKAN, "VkSparseBufferMemoryBindInfo") {
    VkBuffer("buffer")
    AutoSize("pBinds")..uint32_t("bindCount")
    VkSparseMemoryBind.const.p("pBinds")
}

val VkSparseImageOpaqueMemoryBindInfo = struct(Module.VULKAN, "VkSparseImageOpaqueMemoryBindInfo") {
    VkImage("image")
    AutoSize("pBinds")..uint32_t("bindCount")
    VkSparseMemoryBind.const.p("pBinds")
}

val VkImageSubresource = struct(Module.VULKAN, "VkImageSubresource") {
    VkImageAspectFlags("aspectMask")
    uint32_t("mipLevel")
    uint32_t("arrayLayer")
}

val VkSparseImageMemoryBind = struct(Module.VULKAN, "VkSparseImageMemoryBind") {
    VkImageSubresource("subresource")
    VkOffset3D("offset")
    VkExtent3D("extent")
    VkDeviceMemory("memory")
    VkDeviceSize("memoryOffset")
    VkSparseMemoryBindFlags("flags")
}

val VkSparseImageMemoryBindInfo = struct(Module.VULKAN, "VkSparseImageMemoryBindInfo") {
    VkImage("image")
    AutoSize("pBinds")..uint32_t("bindCount")
    VkSparseImageMemoryBind.const.p("pBinds")
}

val VkBindSparseInfo = struct(Module.VULKAN, "VkBindSparseInfo") {
    Expression("#STRUCTURE_TYPE_BIND_SPARSE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkDeviceGroupBindSparseInfo", "VkDeviceGroupBindSparseInfoKHR", "VkFrameBoundaryEXT", "VkFrameBoundaryTensorsARM", "VkTimelineSemaphoreSubmitInfo", "VkTimelineSemaphoreSubmitInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    AutoSize("pWaitSemaphores", optional = true)..uint32_t("waitSemaphoreCount")
    VkSemaphore.const.p("pWaitSemaphores")
    AutoSize("pBufferBinds", optional = true)..uint32_t("bufferBindCount")
    VkSparseBufferMemoryBindInfo.const.p("pBufferBinds")
    AutoSize("pImageOpaqueBinds", optional = true)..uint32_t("imageOpaqueBindCount")
    VkSparseImageOpaqueMemoryBindInfo.const.p("pImageOpaqueBinds")
    AutoSize("pImageBinds", optional = true)..uint32_t("imageBindCount")
    VkSparseImageMemoryBindInfo.const.p("pImageBinds")
    AutoSize("pSignalSemaphores", optional = true)..uint32_t("signalSemaphoreCount")
    VkSemaphore.const.p("pSignalSemaphores")
}

val VkSparseImageFormatProperties = struct(Module.VULKAN, "VkSparseImageFormatProperties", mutable = false) {
    VkImageAspectFlags("aspectMask")
    VkExtent3D("imageGranularity")
    VkSparseImageFormatFlags("flags")
}

val VkSparseImageMemoryRequirements = struct(Module.VULKAN, "VkSparseImageMemoryRequirements", mutable = false) {
    VkSparseImageFormatProperties("formatProperties")
    uint32_t("imageMipTailFirstLod")
    VkDeviceSize("imageMipTailSize")
    VkDeviceSize("imageMipTailOffset")
    VkDeviceSize("imageMipTailStride")
}

val VkFenceCreateInfo = struct(Module.VULKAN, "VkFenceCreateInfo") {
    Expression("#STRUCTURE_TYPE_FENCE_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkExportFenceCreateInfo", "VkExportFenceCreateInfoKHR", "VkExportFenceWin32HandleInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkFenceCreateFlags("flags")
}

val VkSemaphoreCreateInfo = struct(Module.VULKAN, "VkSemaphoreCreateInfo") {
    Expression("#STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkExportMetalObjectCreateInfoEXT", "VkExportSemaphoreCreateInfo", "VkExportSemaphoreCreateInfoKHR", "VkExportSemaphoreWin32HandleInfoKHR", "VkImportMetalSharedEventInfoEXT", "VkQueryLowLatencySupportNV", "VkSemaphoreTypeCreateInfo", "VkSemaphoreTypeCreateInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkSemaphoreCreateFlags("flags")
}

val VkQueryPoolCreateInfo = struct(Module.VULKAN, "VkQueryPoolCreateInfo") {
    Expression("#STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkQueryPoolCreateInfoINTEL", "VkQueryPoolPerformanceCreateInfoKHR", "VkQueryPoolPerformanceQueryCreateInfoINTEL", "VkQueryPoolVideoEncodeFeedbackCreateInfoKHR", "VkVideoDecodeAV1ProfileInfoKHR", "VkVideoDecodeH264ProfileInfoKHR", "VkVideoDecodeH265ProfileInfoKHR", "VkVideoDecodeUsageInfoKHR", "VkVideoDecodeVP9ProfileInfoKHR", "VkVideoEncodeAV1ProfileInfoKHR", "VkVideoEncodeH264ProfileInfoKHR", "VkVideoEncodeH265ProfileInfoKHR", "VkVideoEncodeUsageInfoKHR", "VkVideoProfileInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkQueryPoolCreateFlags("flags")
    VkQueryType("queryType")
    uint32_t("queryCount")
    VkQueryPipelineStatisticFlags("pipelineStatistics")
}

val VkBufferCreateInfo = struct(Module.VULKAN, "VkBufferCreateInfo") {
    Expression("#STRUCTURE_TYPE_BUFFER_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkBufferDeviceAddressCreateInfoEXT", "VkBufferOpaqueCaptureAddressCreateInfo", "VkBufferOpaqueCaptureAddressCreateInfoKHR", "VkBufferUsageFlags2CreateInfo", "VkBufferUsageFlags2CreateInfoKHR", "VkDedicatedAllocationBufferCreateInfoNV", "VkExternalMemoryBufferCreateInfo", "VkExternalMemoryBufferCreateInfoKHR", "VkOpaqueCaptureDescriptorDataCreateInfoEXT", "VkVideoProfileListInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkBufferCreateFlags("flags")
    VkDeviceSize("size")
    VkBufferUsageFlags("usage")
    VkSharingMode("sharingMode")
    AutoSize("pQueueFamilyIndices", optional = true)..uint32_t("queueFamilyIndexCount")
    nullable..uint32_t.const.p("pQueueFamilyIndices")
}

val VkImageCreateInfo = struct(Module.VULKAN, "VkImageCreateInfo") {
    Expression("#STRUCTURE_TYPE_IMAGE_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkDedicatedAllocationImageCreateInfoNV", "VkExportMetalObjectCreateInfoEXT", "VkExternalFormatANDROID", "VkExternalMemoryImageCreateInfo", "VkExternalMemoryImageCreateInfoKHR", "VkExternalMemoryImageCreateInfoNV", "VkImageAlignmentControlCreateInfoMESA", "VkImageCompressionControlEXT", "VkImageDrmFormatModifierExplicitCreateInfoEXT", "VkImageDrmFormatModifierListCreateInfoEXT", "VkImageFormatListCreateInfo", "VkImageFormatListCreateInfoKHR", "VkImageStencilUsageCreateInfo", "VkImageStencilUsageCreateInfoEXT", "VkImageSwapchainCreateInfoKHR", "VkImportMetalIOSurfaceInfoEXT", "VkImportMetalTextureInfoEXT", "VkOpaqueCaptureDataCreateInfoEXT", "VkOpaqueCaptureDescriptorDataCreateInfoEXT", "VkOpticalFlowImageFormatInfoNV", "VkVideoProfileListInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkImageCreateFlags("flags")
    VkImageType("imageType")
    VkFormat("format")
    VkExtent3D("extent")
    uint32_t("mipLevels")
    uint32_t("arrayLayers")
    VkSampleCountFlagBits("samples")
    VkImageTiling("tiling")
    VkImageUsageFlags("usage")
    VkSharingMode("sharingMode")
    AutoSize("pQueueFamilyIndices", optional = true)..uint32_t("queueFamilyIndexCount")
    nullable..uint32_t.const.p("pQueueFamilyIndices")
    VkImageLayout("initialLayout")
}

val VkSubresourceLayout = struct(Module.VULKAN, "VkSubresourceLayout") {
    VkDeviceSize("offset")
    VkDeviceSize("size")
    VkDeviceSize("rowPitch")
    VkDeviceSize("arrayPitch")
    VkDeviceSize("depthPitch")
}

val VkComponentMapping = struct(Module.VULKAN, "VkComponentMapping") {
    VkComponentSwizzle("r")
    VkComponentSwizzle("g")
    VkComponentSwizzle("b")
    VkComponentSwizzle("a")
}

val VkImageViewCreateInfo = struct(Module.VULKAN, "VkImageViewCreateInfo") {
    Expression("#STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkExportMetalObjectCreateInfoEXT", "VkImageViewASTCDecodeModeEXT", "VkImageViewMinLodCreateInfoEXT", "VkImageViewSampleWeightCreateInfoQCOM", "VkImageViewSlicedCreateInfoEXT", "VkImageViewUsageCreateInfo", "VkImageViewUsageCreateInfoKHR", "VkOpaqueCaptureDescriptorDataCreateInfoEXT", "VkSamplerYcbcrConversionInfo", "VkSamplerYcbcrConversionInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkImageViewCreateFlags("flags")
    VkImage("image")
    VkImageViewType("viewType")
    VkFormat("format")
    VkComponentMapping("components")
    VkImageSubresourceRange("subresourceRange")
}

val VkCommandPoolCreateInfo = struct(Module.VULKAN, "VkCommandPoolCreateInfo") {
    Expression("#STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkDataGraphProcessingEngineCreateInfoARM",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkCommandPoolCreateFlags("flags")
    uint32_t("queueFamilyIndex")
}

val VkCommandBufferAllocateInfo = struct(Module.VULKAN, "VkCommandBufferAllocateInfo") {
    Expression("#STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkCommandPool("commandPool")
    VkCommandBufferLevel("level")
    uint32_t("commandBufferCount")
}

val VkCommandBufferInheritanceInfo = struct(Module.VULKAN, "VkCommandBufferInheritanceInfo") {
    Expression("#STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkAttachmentSampleCountInfoAMD", "VkAttachmentSampleCountInfoNV", "VkCommandBufferInheritanceConditionalRenderingInfoEXT", "VkCommandBufferInheritanceDescriptorHeapInfoEXT", "VkCommandBufferInheritanceRenderPassTransformInfoQCOM", "VkCommandBufferInheritanceRenderingInfo", "VkCommandBufferInheritanceRenderingInfoKHR", "VkCommandBufferInheritanceViewportScissorInfoNV", "VkCustomResolveCreateInfoEXT", "VkExternalFormatANDROID", "VkMultiviewPerViewAttributesInfoNVX", "VkRenderPassTileShadingCreateInfoQCOM", "VkRenderingAttachmentLocationInfo", "VkRenderingAttachmentLocationInfoKHR", "VkRenderingInputAttachmentIndexInfo", "VkRenderingInputAttachmentIndexInfoKHR", "VkTileMemoryBindInfoQCOM",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkRenderPass("renderPass")
    uint32_t("subpass")
    VkFramebuffer("framebuffer")
    VkBool32("occlusionQueryEnable")
    VkQueryControlFlags("queryFlags")
    VkQueryPipelineStatisticFlags("pipelineStatistics")
}

val VkCommandBufferBeginInfo = struct(Module.VULKAN, "VkCommandBufferBeginInfo") {
    Expression("#STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkDeviceGroupCommandBufferBeginInfo", "VkDeviceGroupCommandBufferBeginInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkCommandBufferUsageFlags("flags")
    nullable..VkCommandBufferInheritanceInfo.const.p("pInheritanceInfo")
}

val VkBufferCopy = struct(Module.VULKAN, "VkBufferCopy") {
    VkDeviceSize("srcOffset")
    VkDeviceSize("dstOffset")
    VkDeviceSize("size")
}

val VkImageSubresourceLayers = struct(Module.VULKAN, "VkImageSubresourceLayers") {
    VkImageAspectFlags("aspectMask")
    uint32_t("mipLevel")
    uint32_t("baseArrayLayer")
    uint32_t("layerCount")
}

val VkBufferImageCopy = struct(Module.VULKAN, "VkBufferImageCopy") {
    VkDeviceSize("bufferOffset")
    uint32_t("bufferRowLength")
    uint32_t("bufferImageHeight")
    VkImageSubresourceLayers("imageSubresource")
    VkOffset3D("imageOffset")
    VkExtent3D("imageExtent")
}

val VkImageCopy = struct(Module.VULKAN, "VkImageCopy") {
    VkImageSubresourceLayers("srcSubresource")
    VkOffset3D("srcOffset")
    VkImageSubresourceLayers("dstSubresource")
    VkOffset3D("dstOffset")
    VkExtent3D("extent")
}

val VkDispatchIndirectCommand = struct(Module.VULKAN, "VkDispatchIndirectCommand") {
    uint32_t("x")
    uint32_t("y")
    uint32_t("z")
}

val VkPipelineCacheHeaderVersionOne = struct(Module.VULKAN, "VkPipelineCacheHeaderVersionOne") {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    uint32_t("headerSize")
    VkPipelineCacheHeaderVersion("headerVersion")
    uint32_t("vendorID")
    uint32_t("deviceID")
    uint8_t("pipelineCacheUUID")["VK_UUID_SIZE"]
}

val VkEventCreateInfo = struct(Module.VULKAN, "VkEventCreateInfo") {
    Expression("#STRUCTURE_TYPE_EVENT_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkExportMetalObjectCreateInfoEXT", "VkImportMetalSharedEventInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkEventCreateFlags("flags")
}

val VkBufferViewCreateInfo = struct(Module.VULKAN, "VkBufferViewCreateInfo") {
    Expression("#STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkBufferUsageFlags2CreateInfo", "VkBufferUsageFlags2CreateInfoKHR", "VkExportMetalObjectCreateInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkBufferViewCreateFlags("flags")
    VkBuffer("buffer")
    VkFormat("format")
    VkDeviceSize("offset")
    VkDeviceSize("range")
}

val VkShaderModuleCreateInfo = struct(Module.VULKAN, "VkShaderModuleCreateInfo") {
    Expression("#STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkShaderModuleValidationCacheCreateInfoEXT", "VkValidationFeaturesEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkShaderModuleCreateFlags("flags")
    size_t("codeSize")
    uint32_t.const.p("pCode")
}

val VkPipelineCacheCreateInfo = struct(Module.VULKAN, "VkPipelineCacheCreateInfo") {
    Expression("#STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineCacheCreateFlags("flags")
    AutoSize("pInitialData", optional = true)..size_t("initialDataSize")
    void.const.p("pInitialData")
}

val VkSpecializationMapEntry = struct(Module.VULKAN, "VkSpecializationMapEntry") {
    uint32_t("constantID")
    uint32_t("offset")
    size_t("size")
}

val VkSpecializationInfo = struct(Module.VULKAN, "VkSpecializationInfo") {
    AutoSize("pMapEntries", optional = true)..uint32_t("mapEntryCount")
    VkSpecializationMapEntry.const.p("pMapEntries")
    AutoSize("pData", optional = true)..size_t("dataSize")
    void.const.p("pData")
}

val VkPipelineShaderStageCreateInfo = struct(Module.VULKAN, "VkPipelineShaderStageCreateInfo") {
    Expression("#STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkDebugUtilsObjectNameInfoEXT", "VkPipelineRobustnessCreateInfo", "VkPipelineRobustnessCreateInfoEXT", "VkPipelineShaderStageModuleIdentifierCreateInfoEXT", "VkPipelineShaderStageNodeCreateInfoAMDX", "VkPipelineShaderStageRequiredSubgroupSizeCreateInfo", "VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT", "VkShaderDescriptorSetAndBindingMappingInfoEXT", "VkShaderModuleCreateInfo", "VkShaderModuleValidationCacheCreateInfoEXT", "VkShaderRequiredSubgroupSizeCreateInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkPipelineShaderStageCreateFlags("flags")
    VkShaderStageFlagBits("stage")
    VkShaderModule("module")
    charUTF8.const.p("pName")
    nullable..VkSpecializationInfo.const.p("pSpecializationInfo")
}

val VkComputePipelineCreateInfo = struct(Module.VULKAN, "VkComputePipelineCreateInfo") {
    Expression("#STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkComputePipelineIndirectBufferInfoNV", "VkPipelineBinaryInfoKHR", "VkPipelineCompilerControlCreateInfoAMD", "VkPipelineCreateFlags2CreateInfo", "VkPipelineCreateFlags2CreateInfoKHR", "VkPipelineCreationFeedbackCreateInfo", "VkPipelineCreationFeedbackCreateInfoEXT", "VkPipelineRobustnessCreateInfo", "VkPipelineRobustnessCreateInfoEXT", "VkSubpassShadingPipelineCreateInfoHUAWEI",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkPipelineCreateFlags("flags")
    VkPipelineShaderStageCreateInfo("stage")
    VkPipelineLayout("layout")
    VkPipeline("basePipelineHandle")
    int32_t("basePipelineIndex")
}

val VkPushConstantRange = struct(Module.VULKAN, "VkPushConstantRange") {
    VkShaderStageFlags("stageFlags")
    uint32_t("offset")
    uint32_t("size")
}

val VkPipelineLayoutCreateInfo = struct(Module.VULKAN, "VkPipelineLayoutCreateInfo") {
    Expression("#STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineLayoutCreateFlags("flags")
    AutoSize("pSetLayouts", optional = true)..uint32_t("setLayoutCount")
    nullable..VkDescriptorSetLayout.const.p("pSetLayouts")
    AutoSize("pPushConstantRanges", optional = true)..uint32_t("pushConstantRangeCount")
    VkPushConstantRange.const.p("pPushConstantRanges")
}

val VkSamplerCreateInfo = struct(Module.VULKAN, "VkSamplerCreateInfo") {
    Expression("#STRUCTURE_TYPE_SAMPLER_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkDebugUtilsObjectNameInfoEXT", "VkOpaqueCaptureDescriptorDataCreateInfoEXT", "VkSamplerBlockMatchWindowCreateInfoQCOM", "VkSamplerBorderColorComponentMappingCreateInfoEXT", "VkSamplerCubicWeightsCreateInfoQCOM", "VkSamplerCustomBorderColorCreateInfoEXT", "VkSamplerCustomBorderColorIndexCreateInfoEXT", "VkSamplerReductionModeCreateInfo", "VkSamplerReductionModeCreateInfoEXT", "VkSamplerYcbcrConversionInfo", "VkSamplerYcbcrConversionInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkSamplerCreateFlags("flags")
    VkFilter("magFilter")
    VkFilter("minFilter")
    VkSamplerMipmapMode("mipmapMode")
    VkSamplerAddressMode("addressModeU")
    VkSamplerAddressMode("addressModeV")
    VkSamplerAddressMode("addressModeW")
    float("mipLodBias")
    VkBool32("anisotropyEnable")
    float("maxAnisotropy")
    VkBool32("compareEnable")
    VkCompareOp("compareOp")
    float("minLod")
    float("maxLod")
    VkBorderColor("borderColor")
    VkBool32("unnormalizedCoordinates")
}

val VkCopyDescriptorSet = struct(Module.VULKAN, "VkCopyDescriptorSet") {
    Expression("#STRUCTURE_TYPE_COPY_DESCRIPTOR_SET")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDescriptorSet("srcSet")
    uint32_t("srcBinding")
    uint32_t("srcArrayElement")
    VkDescriptorSet("dstSet")
    uint32_t("dstBinding")
    uint32_t("dstArrayElement")
    uint32_t("descriptorCount")
}

val VkDescriptorBufferInfo = struct(Module.VULKAN, "VkDescriptorBufferInfo") {
    VkBuffer("buffer")
    VkDeviceSize("offset")
    VkDeviceSize("range")
}

val VkDescriptorImageInfo = struct(Module.VULKAN, "VkDescriptorImageInfo") {
    VkSampler("sampler")
    VkImageView("imageView")
    VkImageLayout("imageLayout")
}

val VkDescriptorPoolSize = struct(Module.VULKAN, "VkDescriptorPoolSize") {
    VkDescriptorType("type")
    uint32_t("descriptorCount")
}

val VkDescriptorPoolCreateInfo = struct(Module.VULKAN, "VkDescriptorPoolCreateInfo") {
    Expression("#STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkDataGraphProcessingEngineCreateInfoARM", "VkDescriptorPoolInlineUniformBlockCreateInfo", "VkDescriptorPoolInlineUniformBlockCreateInfoEXT", "VkMutableDescriptorTypeCreateInfoEXT", "VkMutableDescriptorTypeCreateInfoVALVE",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkDescriptorPoolCreateFlags("flags")
    uint32_t("maxSets")
    AutoSize("pPoolSizes", optional = true)..uint32_t("poolSizeCount")
    VkDescriptorPoolSize.const.p("pPoolSizes")
}

val VkDescriptorSetAllocateInfo = struct(Module.VULKAN, "VkDescriptorSetAllocateInfo") {
    Expression("#STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkDescriptorSetVariableDescriptorCountAllocateInfo", "VkDescriptorSetVariableDescriptorCountAllocateInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkDescriptorPool("descriptorPool")
    AutoSize("pSetLayouts")..uint32_t("descriptorSetCount")
    VkDescriptorSetLayout.const.p("pSetLayouts")
}

val VkDescriptorSetLayoutBinding = struct(Module.VULKAN, "VkDescriptorSetLayoutBinding") {
    uint32_t("binding")
    VkDescriptorType("descriptorType")
    AutoSize("pImmutableSamplers", optional = true)..uint32_t("descriptorCount")
    VkShaderStageFlags("stageFlags")
    nullable..VkSampler.const.p("pImmutableSamplers")
}

val VkDescriptorSetLayoutCreateInfo = struct(Module.VULKAN, "VkDescriptorSetLayoutCreateInfo") {
    Expression("#STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkDescriptorSetLayoutBindingFlagsCreateInfo", "VkDescriptorSetLayoutBindingFlagsCreateInfoEXT", "VkMutableDescriptorTypeCreateInfoEXT", "VkMutableDescriptorTypeCreateInfoVALVE",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkDescriptorSetLayoutCreateFlags("flags")
    AutoSize("pBindings", optional = true)..uint32_t("bindingCount")
    VkDescriptorSetLayoutBinding.const.p("pBindings")
}

val VkWriteDescriptorSet = struct(Module.VULKAN, "VkWriteDescriptorSet") {
    Expression("#STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET")..VkStructureType("sType")
    PointerSetter(
        "VkWriteDescriptorSetAccelerationStructureKHR", "VkWriteDescriptorSetAccelerationStructureNV", "VkWriteDescriptorSetInlineUniformBlock", "VkWriteDescriptorSetInlineUniformBlockEXT", "VkWriteDescriptorSetPartitionedAccelerationStructureNV", "VkWriteDescriptorSetTensorARM",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkDescriptorSet("dstSet")
    uint32_t("dstBinding")
    uint32_t("dstArrayElement")
    AutoSize("pImageInfo", "pBufferInfo", "pTexelBufferView", optional = true)..uint32_t("descriptorCount")
    VkDescriptorType("descriptorType")
    nullable..VkDescriptorImageInfo.const.p("pImageInfo")
    nullable..VkDescriptorBufferInfo.const.p("pBufferInfo")
    nullable..VkBufferView.const.p("pTexelBufferView")
}

val VkClearColorValue = union(Module.VULKAN, "VkClearColorValue") {
    float("float32")[4]
    int32_t("int32")[4]
    uint32_t("uint32")[4]
}

val VkDrawIndexedIndirectCommand = struct(Module.VULKAN, "VkDrawIndexedIndirectCommand") {
    uint32_t("indexCount")
    uint32_t("instanceCount")
    uint32_t("firstIndex")
    int32_t("vertexOffset")
    uint32_t("firstInstance")
}

val VkDrawIndirectCommand = struct(Module.VULKAN, "VkDrawIndirectCommand") {
    uint32_t("vertexCount")
    uint32_t("instanceCount")
    uint32_t("firstVertex")
    uint32_t("firstInstance")
}

val VkVertexInputBindingDescription = struct(Module.VULKAN, "VkVertexInputBindingDescription") {
    uint32_t("binding")
    uint32_t("stride")
    VkVertexInputRate("inputRate")
}

val VkVertexInputAttributeDescription = struct(Module.VULKAN, "VkVertexInputAttributeDescription") {
    uint32_t("location")
    uint32_t("binding")
    VkFormat("format")
    uint32_t("offset")
}

val VkPipelineVertexInputStateCreateInfo = struct(Module.VULKAN, "VkPipelineVertexInputStateCreateInfo") {
    Expression("#STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkPipelineVertexInputDivisorStateCreateInfo", "VkPipelineVertexInputDivisorStateCreateInfoEXT", "VkPipelineVertexInputDivisorStateCreateInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkPipelineVertexInputStateCreateFlags("flags")
    AutoSize("pVertexBindingDescriptions", optional = true)..uint32_t("vertexBindingDescriptionCount")
    VkVertexInputBindingDescription.const.p("pVertexBindingDescriptions")
    AutoSize("pVertexAttributeDescriptions", optional = true)..uint32_t("vertexAttributeDescriptionCount")
    VkVertexInputAttributeDescription.const.p("pVertexAttributeDescriptions")
}

val VkPipelineInputAssemblyStateCreateInfo = struct(Module.VULKAN, "VkPipelineInputAssemblyStateCreateInfo") {
    Expression("#STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineInputAssemblyStateCreateFlags("flags")
    VkPrimitiveTopology("topology")
    VkBool32("primitiveRestartEnable")
}

val VkPipelineTessellationStateCreateInfo = struct(Module.VULKAN, "VkPipelineTessellationStateCreateInfo") {
    Expression("#STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkPipelineTessellationDomainOriginStateCreateInfo", "VkPipelineTessellationDomainOriginStateCreateInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkPipelineTessellationStateCreateFlags("flags")
    uint32_t("patchControlPoints")
}

val VkViewport = struct(Module.VULKAN, "VkViewport") {
    float("x")
    float("y")
    float("width")
    float("height")
    float("minDepth")
    float("maxDepth")
}

val VkPipelineViewportStateCreateInfo = struct(Module.VULKAN, "VkPipelineViewportStateCreateInfo") {
    Expression("#STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkPipelineViewportCoarseSampleOrderStateCreateInfoNV", "VkPipelineViewportDepthClampControlCreateInfoEXT", "VkPipelineViewportDepthClipControlCreateInfoEXT", "VkPipelineViewportExclusiveScissorStateCreateInfoNV", "VkPipelineViewportShadingRateImageStateCreateInfoNV", "VkPipelineViewportSwizzleStateCreateInfoNV", "VkPipelineViewportWScalingStateCreateInfoNV",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkPipelineViewportStateCreateFlags("flags")
    AutoSize("pViewports", optional = true)..uint32_t("viewportCount")
    nullable..VkViewport.const.p("pViewports")
    AutoSize("pScissors", optional = true)..uint32_t("scissorCount")
    nullable..VkRect2D.const.p("pScissors")
}

val VkPipelineRasterizationStateCreateInfo = struct(Module.VULKAN, "VkPipelineRasterizationStateCreateInfo") {
    Expression("#STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkDepthBiasRepresentationInfoEXT", "VkPipelineRasterizationConservativeStateCreateInfoEXT", "VkPipelineRasterizationDepthClipStateCreateInfoEXT", "VkPipelineRasterizationLineStateCreateInfo", "VkPipelineRasterizationLineStateCreateInfoEXT", "VkPipelineRasterizationLineStateCreateInfoKHR", "VkPipelineRasterizationProvokingVertexStateCreateInfoEXT", "VkPipelineRasterizationStateRasterizationOrderAMD", "VkPipelineRasterizationStateStreamCreateInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkPipelineRasterizationStateCreateFlags("flags")
    VkBool32("depthClampEnable")
    VkBool32("rasterizerDiscardEnable")
    VkPolygonMode("polygonMode")
    VkCullModeFlags("cullMode")
    VkFrontFace("frontFace")
    VkBool32("depthBiasEnable")
    float("depthBiasConstantFactor")
    float("depthBiasClamp")
    float("depthBiasSlopeFactor")
    float("lineWidth")
}

val VkPipelineMultisampleStateCreateInfo = struct(Module.VULKAN, "VkPipelineMultisampleStateCreateInfo") {
    Expression("#STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkPipelineCoverageModulationStateCreateInfoNV", "VkPipelineCoverageReductionStateCreateInfoNV", "VkPipelineCoverageToColorStateCreateInfoNV", "VkPipelineSampleLocationsStateCreateInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkPipelineMultisampleStateCreateFlags("flags")
    VkSampleCountFlagBits("rasterizationSamples")
    VkBool32("sampleShadingEnable")
    float("minSampleShading")
    nullable..VkSampleMask.const.p("pSampleMask")
    VkBool32("alphaToCoverageEnable")
    VkBool32("alphaToOneEnable")
}

val VkStencilOpState = struct(Module.VULKAN, "VkStencilOpState") {
    VkStencilOp("failOp")
    VkStencilOp("passOp")
    VkStencilOp("depthFailOp")
    VkCompareOp("compareOp")
    uint32_t("compareMask")
    uint32_t("writeMask")
    uint32_t("reference")
}

val VkPipelineDepthStencilStateCreateInfo = struct(Module.VULKAN, "VkPipelineDepthStencilStateCreateInfo") {
    Expression("#STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineDepthStencilStateCreateFlags("flags")
    VkBool32("depthTestEnable")
    VkBool32("depthWriteEnable")
    VkCompareOp("depthCompareOp")
    VkBool32("depthBoundsTestEnable")
    VkBool32("stencilTestEnable")
    VkStencilOpState("front")
    VkStencilOpState("back")
    float("minDepthBounds")
    float("maxDepthBounds")
}

val VkPipelineColorBlendAttachmentState = struct(Module.VULKAN, "VkPipelineColorBlendAttachmentState") {
    VkBool32("blendEnable")
    VkBlendFactor("srcColorBlendFactor")
    VkBlendFactor("dstColorBlendFactor")
    VkBlendOp("colorBlendOp")
    VkBlendFactor("srcAlphaBlendFactor")
    VkBlendFactor("dstAlphaBlendFactor")
    VkBlendOp("alphaBlendOp")
    VkColorComponentFlags("colorWriteMask")
}

val VkPipelineColorBlendStateCreateInfo = struct(Module.VULKAN, "VkPipelineColorBlendStateCreateInfo") {
    Expression("#STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkPipelineColorBlendAdvancedStateCreateInfoEXT", "VkPipelineColorWriteCreateInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkPipelineColorBlendStateCreateFlags("flags")
    VkBool32("logicOpEnable")
    VkLogicOp("logicOp")
    AutoSize("pAttachments", optional = true)..uint32_t("attachmentCount")
    nullable..VkPipelineColorBlendAttachmentState.const.p("pAttachments")
    float("blendConstants")[4]
}

val VkPipelineDynamicStateCreateInfo = struct(Module.VULKAN, "VkPipelineDynamicStateCreateInfo") {
    Expression("#STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineDynamicStateCreateFlags("flags")
    AutoSize("pDynamicStates", optional = true)..uint32_t("dynamicStateCount")
    VkDynamicState.const.p("pDynamicStates")
}

val VkGraphicsPipelineCreateInfo = struct(Module.VULKAN, "VkGraphicsPipelineCreateInfo") {
    Expression("#STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkAttachmentSampleCountInfoAMD", "VkAttachmentSampleCountInfoNV", "VkCustomResolveCreateInfoEXT", "VkExternalFormatANDROID", "VkGraphicsPipelineLibraryCreateInfoEXT", "VkGraphicsPipelineShaderGroupsCreateInfoNV", "VkMultiviewPerViewAttributesInfoNVX", "VkPipelineBinaryInfoKHR", "VkPipelineCompilerControlCreateInfoAMD", "VkPipelineCreateFlags2CreateInfo", "VkPipelineCreateFlags2CreateInfoKHR", "VkPipelineCreationFeedbackCreateInfo", "VkPipelineCreationFeedbackCreateInfoEXT", "VkPipelineDiscardRectangleStateCreateInfoEXT", "VkPipelineFragmentDensityMapLayeredCreateInfoVALVE", "VkPipelineFragmentShadingRateEnumStateCreateInfoNV", "VkPipelineFragmentShadingRateStateCreateInfoKHR", "VkPipelineLibraryCreateInfoKHR", "VkPipelineRenderingCreateInfo", "VkPipelineRenderingCreateInfoKHR", "VkPipelineRepresentativeFragmentTestStateCreateInfoNV", "VkPipelineRobustnessCreateInfo", "VkPipelineRobustnessCreateInfoEXT", "VkRenderingAttachmentLocationInfo", "VkRenderingAttachmentLocationInfoKHR", "VkRenderingInputAttachmentIndexInfo", "VkRenderingInputAttachmentIndexInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkPipelineCreateFlags("flags")
    AutoSize("pStages", optional = true)..uint32_t("stageCount")
    nullable..VkPipelineShaderStageCreateInfo.const.p("pStages")
    nullable..VkPipelineVertexInputStateCreateInfo.const.p("pVertexInputState")
    nullable..VkPipelineInputAssemblyStateCreateInfo.const.p("pInputAssemblyState")
    nullable..VkPipelineTessellationStateCreateInfo.const.p("pTessellationState")
    nullable..VkPipelineViewportStateCreateInfo.const.p("pViewportState")
    nullable..VkPipelineRasterizationStateCreateInfo.const.p("pRasterizationState")
    nullable..VkPipelineMultisampleStateCreateInfo.const.p("pMultisampleState")
    nullable..VkPipelineDepthStencilStateCreateInfo.const.p("pDepthStencilState")
    nullable..VkPipelineColorBlendStateCreateInfo.const.p("pColorBlendState")
    nullable..VkPipelineDynamicStateCreateInfo.const.p("pDynamicState")
    VkPipelineLayout("layout")
    VkRenderPass("renderPass")
    uint32_t("subpass")
    VkPipeline("basePipelineHandle")
    int32_t("basePipelineIndex")
}

val VkAttachmentDescription = struct(Module.VULKAN, "VkAttachmentDescription") {
    VkAttachmentDescriptionFlags("flags")
    VkFormat("format")
    VkSampleCountFlagBits("samples")
    VkAttachmentLoadOp("loadOp")
    VkAttachmentStoreOp("storeOp")
    VkAttachmentLoadOp("stencilLoadOp")
    VkAttachmentStoreOp("stencilStoreOp")
    VkImageLayout("initialLayout")
    VkImageLayout("finalLayout")
}

val VkAttachmentReference = struct(Module.VULKAN, "VkAttachmentReference") {
    uint32_t("attachment")
    VkImageLayout("layout")
}

val VkFramebufferCreateInfo = struct(Module.VULKAN, "VkFramebufferCreateInfo") {
    Expression("#STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkFramebufferAttachmentsCreateInfo", "VkFramebufferAttachmentsCreateInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkFramebufferCreateFlags("flags")
    VkRenderPass("renderPass")
    AutoSize("pAttachments", optional = true)..uint32_t("attachmentCount")
    nullable..VkImageView.const.p("pAttachments")
    uint32_t("width")
    uint32_t("height")
    uint32_t("layers")
}

val VkSubpassDescription = struct(Module.VULKAN, "VkSubpassDescription") {
    VkSubpassDescriptionFlags("flags")
    VkPipelineBindPoint("pipelineBindPoint")
    AutoSize("pInputAttachments", optional = true)..uint32_t("inputAttachmentCount")
    VkAttachmentReference.const.p("pInputAttachments")
    AutoSize("pColorAttachments", "pResolveAttachments", optional = true)..uint32_t("colorAttachmentCount")
    VkAttachmentReference.const.p("pColorAttachments")
    nullable..VkAttachmentReference.const.p("pResolveAttachments")
    nullable..VkAttachmentReference.const.p("pDepthStencilAttachment")
    AutoSize("pPreserveAttachments", optional = true)..uint32_t("preserveAttachmentCount")
    uint32_t.const.p("pPreserveAttachments")
}

val VkSubpassDependency = struct(Module.VULKAN, "VkSubpassDependency") {
    uint32_t("srcSubpass")
    uint32_t("dstSubpass")
    VkPipelineStageFlags("srcStageMask")
    VkPipelineStageFlags("dstStageMask")
    VkAccessFlags("srcAccessMask")
    VkAccessFlags("dstAccessMask")
    VkDependencyFlags("dependencyFlags")
}

val VkRenderPassCreateInfo = struct(Module.VULKAN, "VkRenderPassCreateInfo") {
    Expression("#STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkRenderPassFragmentDensityMapCreateInfoEXT", "VkRenderPassInputAttachmentAspectCreateInfo", "VkRenderPassInputAttachmentAspectCreateInfoKHR", "VkRenderPassMultiviewCreateInfo", "VkRenderPassMultiviewCreateInfoKHR", "VkRenderPassTileShadingCreateInfoQCOM", "VkTileMemorySizeInfoQCOM",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkRenderPassCreateFlags("flags")
    AutoSize("pAttachments", optional = true)..uint32_t("attachmentCount")
    VkAttachmentDescription.const.p("pAttachments")
    AutoSize("pSubpasses")..uint32_t("subpassCount")
    VkSubpassDescription.const.p("pSubpasses")
    AutoSize("pDependencies", optional = true)..uint32_t("dependencyCount")
    VkSubpassDependency.const.p("pDependencies")
}

val VkClearDepthStencilValue = struct(Module.VULKAN, "VkClearDepthStencilValue") {
    float("depth")
    uint32_t("stencil")
}

val VkClearValue = union(Module.VULKAN, "VkClearValue") {
    VkClearColorValue("color")
    VkClearDepthStencilValue("depthStencil")
}

val VkClearAttachment = struct(Module.VULKAN, "VkClearAttachment") {
    VkImageAspectFlags("aspectMask")
    uint32_t("colorAttachment")
    VkClearValue("clearValue")
}

val VkClearRect = struct(Module.VULKAN, "VkClearRect") {
    VkRect2D("rect")
    uint32_t("baseArrayLayer")
    uint32_t("layerCount")
}

val VkImageBlit = struct(Module.VULKAN, "VkImageBlit") {
    VkImageSubresourceLayers("srcSubresource")
    VkOffset3D("srcOffsets")[2]
    VkImageSubresourceLayers("dstSubresource")
    VkOffset3D("dstOffsets")[2]
}

val VkImageResolve = struct(Module.VULKAN, "VkImageResolve") {
    VkImageSubresourceLayers("srcSubresource")
    VkOffset3D("srcOffset")
    VkImageSubresourceLayers("dstSubresource")
    VkOffset3D("dstOffset")
    VkExtent3D("extent")
}

val VkRenderPassBeginInfo = struct(Module.VULKAN, "VkRenderPassBeginInfo") {
    Expression("#STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkDeviceGroupRenderPassBeginInfo", "VkDeviceGroupRenderPassBeginInfoKHR", "VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM", "VkRenderPassAttachmentBeginInfo", "VkRenderPassAttachmentBeginInfoKHR", "VkRenderPassPerformanceCountersByRegionBeginInfoARM", "VkRenderPassSampleLocationsBeginInfoEXT", "VkRenderPassStripeBeginInfoARM", "VkRenderPassTransformBeginInfoQCOM",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkRenderPass("renderPass")
    VkFramebuffer("framebuffer")
    VkRect2D("renderArea")
    AutoSize("pClearValues", optional = true)..uint32_t("clearValueCount")
    nullable..VkClearValue.const.p("pClearValues")
}

val VkBindBufferMemoryInfo = struct(Module.VULKAN, "VkBindBufferMemoryInfo") {
    Expression("#STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkBindBufferMemoryDeviceGroupInfo", "VkBindBufferMemoryDeviceGroupInfoKHR", "VkBindMemoryStatus", "VkBindMemoryStatusKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkBuffer("buffer")
    VkDeviceMemory("memory")
    VkDeviceSize("memoryOffset")
}

val VkBindImageMemoryInfo = struct(Module.VULKAN, "VkBindImageMemoryInfo") {
    Expression("#STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkBindImageMemoryDeviceGroupInfo", "VkBindImageMemoryDeviceGroupInfoKHR", "VkBindImageMemorySwapchainInfoKHR", "VkBindImagePlaneMemoryInfo", "VkBindImagePlaneMemoryInfoKHR", "VkBindMemoryStatus", "VkBindMemoryStatusKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkImage("image")
    VkDeviceMemory("memory")
    VkDeviceSize("memoryOffset")
}

val VkMemoryDedicatedRequirements = struct(Module.VULKAN, "VkMemoryDedicatedRequirements", mutable = false) {
    Expression("#STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("prefersDedicatedAllocation")
    VkBool32("requiresDedicatedAllocation")
}

val VkMemoryDedicatedAllocateInfo = struct(Module.VULKAN, "VkMemoryDedicatedAllocateInfo") {
    Expression("#STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImage("image")
    VkBuffer("buffer")
}

val VkMemoryAllocateFlagsInfo = struct(Module.VULKAN, "VkMemoryAllocateFlagsInfo") {
    Expression("#STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkMemoryAllocateFlags("flags")
    uint32_t("deviceMask")
}

val VkDeviceGroupCommandBufferBeginInfo = struct(Module.VULKAN, "VkDeviceGroupCommandBufferBeginInfo") {
    Expression("#STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("deviceMask")
}

val VkDeviceGroupSubmitInfo = struct(Module.VULKAN, "VkDeviceGroupSubmitInfo") {
    Expression("#STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pWaitSemaphoreDeviceIndices", optional = true)..uint32_t("waitSemaphoreCount")
    uint32_t.const.p("pWaitSemaphoreDeviceIndices")
    AutoSize("pCommandBufferDeviceMasks", optional = true)..uint32_t("commandBufferCount")
    uint32_t.const.p("pCommandBufferDeviceMasks")
    AutoSize("pSignalSemaphoreDeviceIndices", optional = true)..uint32_t("signalSemaphoreCount")
    uint32_t.const.p("pSignalSemaphoreDeviceIndices")
}

val VkDeviceGroupBindSparseInfo = struct(Module.VULKAN, "VkDeviceGroupBindSparseInfo") {
    Expression("#STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("resourceDeviceIndex")
    uint32_t("memoryDeviceIndex")
}

val VkBindBufferMemoryDeviceGroupInfo = struct(Module.VULKAN, "VkBindBufferMemoryDeviceGroupInfo") {
    Expression("#STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pDeviceIndices", optional = true)..uint32_t("deviceIndexCount")
    uint32_t.const.p("pDeviceIndices")
}

val VkBindImageMemoryDeviceGroupInfo = struct(Module.VULKAN, "VkBindImageMemoryDeviceGroupInfo") {
    Expression("#STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pDeviceIndices", optional = true)..uint32_t("deviceIndexCount")
    uint32_t.const.p("pDeviceIndices")
    AutoSize("pSplitInstanceBindRegions", optional = true)..uint32_t("splitInstanceBindRegionCount")
    VkRect2D.const.p("pSplitInstanceBindRegions")
}

val VkPhysicalDeviceGroupProperties = struct(Module.VULKAN, "VkPhysicalDeviceGroupProperties", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK11.*")
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    AutoSize("physicalDevices")..uint32_t("physicalDeviceCount")
    VkPhysicalDevice("physicalDevices")["VK_MAX_DEVICE_GROUP_SIZE"]
    VkBool32("subsetAllocation")
}

val VkDeviceGroupDeviceCreateInfo = struct(Module.VULKAN, "VkDeviceGroupDeviceCreateInfo") {
    Expression("#STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pPhysicalDevices", optional = true)..uint32_t("physicalDeviceCount")
    VkPhysicalDevice.const.p("pPhysicalDevices")
}

val VkBufferMemoryRequirementsInfo2 = struct(Module.VULKAN, "VkBufferMemoryRequirementsInfo2") {
    Expression("#STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBuffer("buffer")
}

val VkImageMemoryRequirementsInfo2 = struct(Module.VULKAN, "VkImageMemoryRequirementsInfo2") {
    Expression("#STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2")..VkStructureType("sType")
    PointerSetter(
        "VkImagePlaneMemoryRequirementsInfo", "VkImagePlaneMemoryRequirementsInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkImage("image")
}

val VkImageSparseMemoryRequirementsInfo2 = struct(Module.VULKAN, "VkImageSparseMemoryRequirementsInfo2") {
    Expression("#STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImage("image")
}

val VkMemoryRequirements2 = struct(Module.VULKAN, "VkMemoryRequirements2", mutable = false) {
    Expression("#STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2")..VkStructureType("sType").mutable()
    PointerSetter(
        "VkMemoryDedicatedRequirements", "VkMemoryDedicatedRequirementsKHR", "VkTileMemoryRequirementsQCOM",
        prepend = true
    )..nullable..opaque_p("pNext").mutable()
    VkMemoryRequirements("memoryRequirements")
}

val VkSparseImageMemoryRequirements2 = struct(Module.VULKAN, "VkSparseImageMemoryRequirements2", mutable = false) {
    Expression("#STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkSparseImageMemoryRequirements("memoryRequirements")
}

val VkPhysicalDeviceFeatures2 = struct(Module.VULKAN, "VkPhysicalDeviceFeatures2") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2")..VkStructureType("sType")
    PointerSetter(
        "VkPhysicalDevice16BitStorageFeatures", "VkPhysicalDevice16BitStorageFeaturesKHR", "VkPhysicalDevice4444FormatsFeaturesEXT", "VkPhysicalDevice8BitStorageFeatures", "VkPhysicalDevice8BitStorageFeaturesKHR", "VkPhysicalDeviceASTCDecodeFeaturesEXT", "VkPhysicalDeviceAccelerationStructureFeaturesKHR", "VkPhysicalDeviceAddressBindingReportFeaturesEXT", "VkPhysicalDeviceAmigoProfilingFeaturesSEC", "VkPhysicalDeviceAntiLagFeaturesAMD", "VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT", "VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT", "VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT", "VkPhysicalDeviceBorderColorSwizzleFeaturesEXT", "VkPhysicalDeviceBufferAddressFeaturesEXT", "VkPhysicalDeviceBufferDeviceAddressFeatures", "VkPhysicalDeviceBufferDeviceAddressFeaturesEXT", "VkPhysicalDeviceBufferDeviceAddressFeaturesKHR", "VkPhysicalDeviceClusterAccelerationStructureFeaturesNV", "VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI", "VkPhysicalDeviceCoherentMemoryFeaturesAMD", "VkPhysicalDeviceColorWriteEnableFeaturesEXT", "VkPhysicalDeviceCommandBufferInheritanceFeaturesNV", "VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV", "VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR", "VkPhysicalDeviceComputeShaderDerivativesFeaturesNV", "VkPhysicalDeviceConditionalRenderingFeaturesEXT", "VkPhysicalDeviceCooperativeMatrix2FeaturesNV", "VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM", "VkPhysicalDeviceCooperativeMatrixFeaturesKHR", "VkPhysicalDeviceCooperativeMatrixFeaturesNV", "VkPhysicalDeviceCooperativeVectorFeaturesNV", "VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR", "VkPhysicalDeviceCopyMemoryIndirectFeaturesNV", "VkPhysicalDeviceCornerSampledImageFeaturesNV", "VkPhysicalDeviceCoverageReductionModeFeaturesNV", "VkPhysicalDeviceCubicClampFeaturesQCOM", "VkPhysicalDeviceCubicWeightsFeaturesQCOM", "VkPhysicalDeviceCudaKernelLaunchFeaturesNV", "VkPhysicalDeviceCustomBorderColorFeaturesEXT", "VkPhysicalDeviceCustomResolveFeaturesEXT", "VkPhysicalDeviceDataGraphFeaturesARM", "VkPhysicalDeviceDataGraphModelFeaturesQCOM", "VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV", "VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX", "VkPhysicalDeviceDepthBiasControlFeaturesEXT", "VkPhysicalDeviceDepthClampControlFeaturesEXT", "VkPhysicalDeviceDepthClampZeroOneFeaturesEXT", "VkPhysicalDeviceDepthClampZeroOneFeaturesKHR", "VkPhysicalDeviceDepthClipControlFeaturesEXT", "VkPhysicalDeviceDepthClipEnableFeaturesEXT", "VkPhysicalDeviceDescriptorBufferFeaturesEXT", "VkPhysicalDeviceDescriptorBufferTensorFeaturesARM", "VkPhysicalDeviceDescriptorHeapFeaturesEXT", "VkPhysicalDeviceDescriptorIndexingFeatures", "VkPhysicalDeviceDescriptorIndexingFeaturesEXT", "VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV", "VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE", "VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV", "VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT", "VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV", "VkPhysicalDeviceDeviceMemoryReportFeaturesEXT", "VkPhysicalDeviceDiagnosticsConfigFeaturesNV", "VkPhysicalDeviceDisplacementMicromapFeaturesNV", "VkPhysicalDeviceDynamicRenderingFeatures", "VkPhysicalDeviceDynamicRenderingFeaturesKHR", "VkPhysicalDeviceDynamicRenderingLocalReadFeatures", "VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR", "VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT", "VkPhysicalDeviceExclusiveScissorFeaturesNV", "VkPhysicalDeviceExtendedDynamicState2FeaturesEXT", "VkPhysicalDeviceExtendedDynamicState3FeaturesEXT", "VkPhysicalDeviceExtendedDynamicStateFeaturesEXT", "VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV", "VkPhysicalDeviceExternalFormatResolveFeaturesANDROID", "VkPhysicalDeviceExternalMemoryRDMAFeaturesNV", "VkPhysicalDeviceFaultFeaturesEXT", "VkPhysicalDeviceFloat16Int8FeaturesKHR", "VkPhysicalDeviceFormatPackFeaturesARM", "VkPhysicalDeviceFragmentDensityMap2FeaturesEXT", "VkPhysicalDeviceFragmentDensityMapFeaturesEXT", "VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE", "VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT", "VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM", "VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR", "VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV", "VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT", "VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV", "VkPhysicalDeviceFragmentShadingRateFeaturesKHR", "VkPhysicalDeviceFrameBoundaryFeaturesEXT", "VkPhysicalDeviceGlobalPriorityQueryFeatures", "VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT", "VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR", "VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT", "VkPhysicalDeviceHdrVividFeaturesHUAWEI", "VkPhysicalDeviceHostImageCopyFeatures", "VkPhysicalDeviceHostImageCopyFeaturesEXT", "VkPhysicalDeviceHostQueryResetFeatures", "VkPhysicalDeviceHostQueryResetFeaturesEXT", "VkPhysicalDeviceImage2DViewOf3DFeaturesEXT", "VkPhysicalDeviceImageAlignmentControlFeaturesMESA", "VkPhysicalDeviceImageCompressionControlFeaturesEXT", "VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT", "VkPhysicalDeviceImageProcessing2FeaturesQCOM", "VkPhysicalDeviceImageProcessingFeaturesQCOM", "VkPhysicalDeviceImageRobustnessFeatures", "VkPhysicalDeviceImageRobustnessFeaturesEXT", "VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT", "VkPhysicalDeviceImageViewMinLodFeaturesEXT", "VkPhysicalDeviceImagelessFramebufferFeatures", "VkPhysicalDeviceImagelessFramebufferFeaturesKHR", "VkPhysicalDeviceIndexTypeUint8Features", "VkPhysicalDeviceIndexTypeUint8FeaturesEXT", "VkPhysicalDeviceIndexTypeUint8FeaturesKHR", "VkPhysicalDeviceInheritedViewportScissorFeaturesNV", "VkPhysicalDeviceInlineUniformBlockFeatures", "VkPhysicalDeviceInlineUniformBlockFeaturesEXT", "VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR", "VkPhysicalDeviceInvocationMaskFeaturesHUAWEI", "VkPhysicalDeviceLegacyDitheringFeaturesEXT", "VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT", "VkPhysicalDeviceLineRasterizationFeatures", "VkPhysicalDeviceLineRasterizationFeaturesEXT", "VkPhysicalDeviceLineRasterizationFeaturesKHR", "VkPhysicalDeviceLinearColorAttachmentFeaturesNV", "VkPhysicalDeviceMaintenance10FeaturesKHR", "VkPhysicalDeviceMaintenance4Features", "VkPhysicalDeviceMaintenance4FeaturesKHR", "VkPhysicalDeviceMaintenance5Features", "VkPhysicalDeviceMaintenance5FeaturesKHR", "VkPhysicalDeviceMaintenance6Features", "VkPhysicalDeviceMaintenance6FeaturesKHR", "VkPhysicalDeviceMaintenance7FeaturesKHR", "VkPhysicalDeviceMaintenance8FeaturesKHR", "VkPhysicalDeviceMaintenance9FeaturesKHR", "VkPhysicalDeviceMapMemoryPlacedFeaturesEXT", "VkPhysicalDeviceMemoryDecompressionFeaturesEXT", "VkPhysicalDeviceMemoryDecompressionFeaturesNV", "VkPhysicalDeviceMemoryPriorityFeaturesEXT", "VkPhysicalDeviceMeshShaderFeaturesEXT", "VkPhysicalDeviceMeshShaderFeaturesNV", "VkPhysicalDeviceMultiDrawFeaturesEXT", "VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT", "VkPhysicalDeviceMultiviewFeatures", "VkPhysicalDeviceMultiviewFeaturesKHR", "VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM", "VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM", "VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT", "VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE", "VkPhysicalDeviceNestedCommandBufferFeaturesEXT", "VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT", "VkPhysicalDeviceOpacityMicromapFeaturesEXT", "VkPhysicalDeviceOpticalFlowFeaturesNV", "VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT", "VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV", "VkPhysicalDevicePerStageDescriptorSetFeaturesNV", "VkPhysicalDevicePerformanceCountersByRegionFeaturesARM", "VkPhysicalDevicePerformanceQueryFeaturesKHR", "VkPhysicalDevicePipelineBinaryFeaturesKHR", "VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC", "VkPhysicalDevicePipelineCreationCacheControlFeatures", "VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT", "VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR", "VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT", "VkPhysicalDevicePipelineOpacityMicromapFeaturesARM", "VkPhysicalDevicePipelinePropertiesFeaturesEXT", "VkPhysicalDevicePipelineProtectedAccessFeatures", "VkPhysicalDevicePipelineProtectedAccessFeaturesEXT", "VkPhysicalDevicePipelineRobustnessFeatures", "VkPhysicalDevicePipelineRobustnessFeaturesEXT", "VkPhysicalDevicePortabilitySubsetFeaturesKHR", "VkPhysicalDevicePresentBarrierFeaturesNV", "VkPhysicalDevicePresentId2FeaturesKHR", "VkPhysicalDevicePresentIdFeaturesKHR", "VkPhysicalDevicePresentMeteringFeaturesNV", "VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT", "VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR", "VkPhysicalDevicePresentTimingFeaturesEXT", "VkPhysicalDevicePresentWait2FeaturesKHR", "VkPhysicalDevicePresentWaitFeaturesKHR", "VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT", "VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT", "VkPhysicalDevicePrivateDataFeatures", "VkPhysicalDevicePrivateDataFeaturesEXT", "VkPhysicalDeviceProtectedMemoryFeatures", "VkPhysicalDeviceProvokingVertexFeaturesEXT", "VkPhysicalDevicePushConstantBankFeaturesNV", "VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT", "VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM", "VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT", "VkPhysicalDeviceRawAccessChainsFeaturesNV", "VkPhysicalDeviceRayQueryFeaturesKHR", "VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT", "VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV", "VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV", "VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR", "VkPhysicalDeviceRayTracingMotionBlurFeaturesNV", "VkPhysicalDeviceRayTracingPipelineFeaturesKHR", "VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR", "VkPhysicalDeviceRayTracingValidationFeaturesNV", "VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG", "VkPhysicalDeviceRenderPassStripedFeaturesARM", "VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV", "VkPhysicalDeviceRobustness2FeaturesEXT", "VkPhysicalDeviceRobustness2FeaturesKHR", "VkPhysicalDeviceSamplerYcbcrConversionFeatures", "VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR", "VkPhysicalDeviceScalarBlockLayoutFeatures", "VkPhysicalDeviceScalarBlockLayoutFeaturesEXT", "VkPhysicalDeviceSchedulingControlsFeaturesARM", "VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures", "VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR", "VkPhysicalDeviceShader64BitIndexingFeaturesEXT", "VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV", "VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT", "VkPhysicalDeviceShaderAtomicFloatFeaturesEXT", "VkPhysicalDeviceShaderAtomicInt64Features", "VkPhysicalDeviceShaderAtomicInt64FeaturesKHR", "VkPhysicalDeviceShaderBfloat16FeaturesKHR", "VkPhysicalDeviceShaderClockFeaturesKHR", "VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM", "VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures", "VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT", "VkPhysicalDeviceShaderDrawParameterFeatures", "VkPhysicalDeviceShaderDrawParametersFeatures", "VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD", "VkPhysicalDeviceShaderEnqueueFeaturesAMDX", "VkPhysicalDeviceShaderExpectAssumeFeatures", "VkPhysicalDeviceShaderExpectAssumeFeaturesKHR", "VkPhysicalDeviceShaderFloat16Int8Features", "VkPhysicalDeviceShaderFloat16Int8FeaturesKHR", "VkPhysicalDeviceShaderFloat8FeaturesEXT", "VkPhysicalDeviceShaderFloatControls2Features", "VkPhysicalDeviceShaderFloatControls2FeaturesKHR", "VkPhysicalDeviceShaderFmaFeaturesKHR", "VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT", "VkPhysicalDeviceShaderImageFootprintFeaturesNV", "VkPhysicalDeviceShaderIntegerDotProductFeatures", "VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR", "VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL", "VkPhysicalDeviceShaderLongVectorFeaturesEXT", "VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR", "VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT", "VkPhysicalDeviceShaderObjectFeaturesEXT", "VkPhysicalDeviceShaderQuadControlFeaturesKHR", "VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR", "VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT", "VkPhysicalDeviceShaderSMBuiltinsFeaturesNV", "VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures", "VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR", "VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT", "VkPhysicalDeviceShaderSubgroupRotateFeatures", "VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR", "VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR", "VkPhysicalDeviceShaderTerminateInvocationFeatures", "VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR", "VkPhysicalDeviceShaderTileImageFeaturesEXT", "VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT", "VkPhysicalDeviceShaderUntypedPointersFeaturesKHR", "VkPhysicalDeviceShadingRateImageFeaturesNV", "VkPhysicalDeviceSubgroupSizeControlFeatures", "VkPhysicalDeviceSubgroupSizeControlFeaturesEXT", "VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT", "VkPhysicalDeviceSubpassShadingFeaturesHUAWEI", "VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT", "VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR", "VkPhysicalDeviceSynchronization2Features", "VkPhysicalDeviceSynchronization2FeaturesKHR", "VkPhysicalDeviceTensorFeaturesARM", "VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT", "VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT", "VkPhysicalDeviceTextureCompressionASTCHDRFeatures", "VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT", "VkPhysicalDeviceTileMemoryHeapFeaturesQCOM", "VkPhysicalDeviceTilePropertiesFeaturesQCOM", "VkPhysicalDeviceTileShadingFeaturesQCOM", "VkPhysicalDeviceTimelineSemaphoreFeatures", "VkPhysicalDeviceTimelineSemaphoreFeaturesKHR", "VkPhysicalDeviceTransformFeedbackFeaturesEXT", "VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR", "VkPhysicalDeviceUniformBufferStandardLayoutFeatures", "VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR", "VkPhysicalDeviceVariablePointerFeatures", "VkPhysicalDeviceVariablePointerFeaturesKHR", "VkPhysicalDeviceVariablePointersFeatures", "VkPhysicalDeviceVariablePointersFeaturesKHR", "VkPhysicalDeviceVertexAttributeDivisorFeatures", "VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT", "VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR", "VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT", "VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT", "VkPhysicalDeviceVideoDecodeVP9FeaturesKHR", "VkPhysicalDeviceVideoEncodeAV1FeaturesKHR", "VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR", "VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR", "VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE", "VkPhysicalDeviceVideoMaintenance1FeaturesKHR", "VkPhysicalDeviceVideoMaintenance2FeaturesKHR", "VkPhysicalDeviceVulkan11Features", "VkPhysicalDeviceVulkan12Features", "VkPhysicalDeviceVulkan13Features", "VkPhysicalDeviceVulkan14Features", "VkPhysicalDeviceVulkanMemoryModelFeatures", "VkPhysicalDeviceVulkanMemoryModelFeaturesKHR", "VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR", "VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT", "VkPhysicalDeviceYcbcrDegammaFeaturesQCOM", "VkPhysicalDeviceYcbcrImageArraysFeaturesEXT", "VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT", "VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures", "VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR",
        prepend = true
    )..nullable..opaque_p("pNext")
    VkPhysicalDeviceFeatures("features")
}

val VkPhysicalDeviceProperties2 = struct(Module.VULKAN, "VkPhysicalDeviceProperties2", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2")..VkStructureType("sType").mutable()
    PointerSetter(
        "VkPhysicalDeviceAccelerationStructurePropertiesKHR", "VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT", "VkPhysicalDeviceClusterAccelerationStructurePropertiesNV", "VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI", "VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR", "VkPhysicalDeviceConservativeRasterizationPropertiesEXT", "VkPhysicalDeviceCooperativeMatrix2PropertiesNV", "VkPhysicalDeviceCooperativeMatrixPropertiesKHR", "VkPhysicalDeviceCooperativeMatrixPropertiesNV", "VkPhysicalDeviceCooperativeVectorPropertiesNV", "VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR", "VkPhysicalDeviceCopyMemoryIndirectPropertiesNV", "VkPhysicalDeviceCudaKernelLaunchPropertiesNV", "VkPhysicalDeviceCustomBorderColorPropertiesEXT", "VkPhysicalDeviceDepthStencilResolveProperties", "VkPhysicalDeviceDepthStencilResolvePropertiesKHR", "VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT", "VkPhysicalDeviceDescriptorBufferPropertiesEXT", "VkPhysicalDeviceDescriptorBufferTensorPropertiesARM", "VkPhysicalDeviceDescriptorHeapPropertiesEXT", "VkPhysicalDeviceDescriptorHeapTensorPropertiesARM", "VkPhysicalDeviceDescriptorIndexingProperties", "VkPhysicalDeviceDescriptorIndexingPropertiesEXT", "VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT", "VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV", "VkPhysicalDeviceDiscardRectanglePropertiesEXT", "VkPhysicalDeviceDisplacementMicromapPropertiesNV", "VkPhysicalDeviceDriverProperties", "VkPhysicalDeviceDriverPropertiesKHR", "VkPhysicalDeviceDrmPropertiesEXT", "VkPhysicalDeviceExtendedDynamicState3PropertiesEXT", "VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV", "VkPhysicalDeviceExternalComputeQueuePropertiesNV", "VkPhysicalDeviceExternalFormatResolvePropertiesANDROID", "VkPhysicalDeviceExternalMemoryHostPropertiesEXT", "VkPhysicalDeviceFloatControlsProperties", "VkPhysicalDeviceFloatControlsPropertiesKHR", "VkPhysicalDeviceFragmentDensityMap2PropertiesEXT", "VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE", "VkPhysicalDeviceFragmentDensityMapOffsetPropertiesEXT", "VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM", "VkPhysicalDeviceFragmentDensityMapPropertiesEXT", "VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR", "VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV", "VkPhysicalDeviceFragmentShadingRatePropertiesKHR", "VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT", "VkPhysicalDeviceHostImageCopyProperties", "VkPhysicalDeviceHostImageCopyPropertiesEXT", "VkPhysicalDeviceIDProperties", "VkPhysicalDeviceIDPropertiesKHR", "VkPhysicalDeviceImageAlignmentControlPropertiesMESA", "VkPhysicalDeviceImageProcessing2PropertiesQCOM", "VkPhysicalDeviceImageProcessingPropertiesQCOM", "VkPhysicalDeviceInlineUniformBlockProperties", "VkPhysicalDeviceInlineUniformBlockPropertiesEXT", "VkPhysicalDeviceLayeredApiPropertiesListKHR", "VkPhysicalDeviceLayeredDriverPropertiesMSFT", "VkPhysicalDeviceLegacyVertexAttributesPropertiesEXT", "VkPhysicalDeviceLineRasterizationProperties", "VkPhysicalDeviceLineRasterizationPropertiesEXT", "VkPhysicalDeviceLineRasterizationPropertiesKHR", "VkPhysicalDeviceMaintenance10PropertiesKHR", "VkPhysicalDeviceMaintenance3Properties", "VkPhysicalDeviceMaintenance3PropertiesKHR", "VkPhysicalDeviceMaintenance4Properties", "VkPhysicalDeviceMaintenance4PropertiesKHR", "VkPhysicalDeviceMaintenance5Properties", "VkPhysicalDeviceMaintenance5PropertiesKHR", "VkPhysicalDeviceMaintenance6Properties", "VkPhysicalDeviceMaintenance6PropertiesKHR", "VkPhysicalDeviceMaintenance7PropertiesKHR", "VkPhysicalDeviceMaintenance9PropertiesKHR", "VkPhysicalDeviceMapMemoryPlacedPropertiesEXT", "VkPhysicalDeviceMemoryDecompressionPropertiesEXT", "VkPhysicalDeviceMemoryDecompressionPropertiesNV", "VkPhysicalDeviceMeshShaderPropertiesEXT", "VkPhysicalDeviceMeshShaderPropertiesNV", "VkPhysicalDeviceMultiDrawPropertiesEXT", "VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX", "VkPhysicalDeviceMultiviewProperties", "VkPhysicalDeviceMultiviewPropertiesKHR", "VkPhysicalDeviceNestedCommandBufferPropertiesEXT", "VkPhysicalDeviceOpacityMicromapPropertiesEXT", "VkPhysicalDeviceOpticalFlowPropertiesNV", "VkPhysicalDevicePCIBusInfoPropertiesEXT", "VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV", "VkPhysicalDevicePerformanceCountersByRegionPropertiesARM", "VkPhysicalDevicePerformanceQueryPropertiesKHR", "VkPhysicalDevicePipelineBinaryPropertiesKHR", "VkPhysicalDevicePipelineRobustnessProperties", "VkPhysicalDevicePipelineRobustnessPropertiesEXT", "VkPhysicalDevicePointClippingProperties", "VkPhysicalDevicePointClippingPropertiesKHR", "VkPhysicalDevicePortabilitySubsetPropertiesKHR", "VkPhysicalDeviceProtectedMemoryProperties", "VkPhysicalDeviceProvokingVertexPropertiesEXT", "VkPhysicalDevicePushConstantBankPropertiesNV", "VkPhysicalDevicePushDescriptorProperties", "VkPhysicalDevicePushDescriptorPropertiesKHR", "VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT", "VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV", "VkPhysicalDeviceRayTracingPipelinePropertiesKHR", "VkPhysicalDeviceRayTracingPropertiesNV", "VkPhysicalDeviceRenderPassStripedPropertiesARM", "VkPhysicalDeviceRobustness2PropertiesEXT", "VkPhysicalDeviceRobustness2PropertiesKHR", "VkPhysicalDeviceSampleLocationsPropertiesEXT", "VkPhysicalDeviceSamplerFilterMinmaxProperties", "VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT", "VkPhysicalDeviceSchedulingControlsPropertiesARM", "VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM", "VkPhysicalDeviceShaderCoreProperties2AMD", "VkPhysicalDeviceShaderCorePropertiesAMD", "VkPhysicalDeviceShaderCorePropertiesARM", "VkPhysicalDeviceShaderEnqueuePropertiesAMDX", "VkPhysicalDeviceShaderIntegerDotProductProperties", "VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR", "VkPhysicalDeviceShaderLongVectorPropertiesEXT", "VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT", "VkPhysicalDeviceShaderObjectPropertiesEXT", "VkPhysicalDeviceShaderSMBuiltinsPropertiesNV", "VkPhysicalDeviceShaderTileImagePropertiesEXT", "VkPhysicalDeviceShadingRateImagePropertiesNV", "VkPhysicalDeviceSubgroupProperties", "VkPhysicalDeviceSubgroupSizeControlProperties", "VkPhysicalDeviceSubgroupSizeControlPropertiesEXT", "VkPhysicalDeviceSubpassShadingPropertiesHUAWEI", "VkPhysicalDeviceTensorPropertiesARM", "VkPhysicalDeviceTexelBufferAlignmentProperties", "VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT", "VkPhysicalDeviceTileMemoryHeapPropertiesQCOM", "VkPhysicalDeviceTileShadingPropertiesQCOM", "VkPhysicalDeviceTimelineSemaphoreProperties", "VkPhysicalDeviceTimelineSemaphorePropertiesKHR", "VkPhysicalDeviceTransformFeedbackPropertiesEXT", "VkPhysicalDeviceVertexAttributeDivisorProperties", "VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT", "VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR", "VkPhysicalDeviceVulkan11Properties", "VkPhysicalDeviceVulkan12Properties", "VkPhysicalDeviceVulkan13Properties", "VkPhysicalDeviceVulkan14Properties",
        prepend = true
    )..nullable..opaque_p("pNext").mutable()
    VkPhysicalDeviceProperties("properties")
}

val VkFormatProperties2 = struct(Module.VULKAN, "VkFormatProperties2", mutable = false) {
    Expression("#STRUCTURE_TYPE_FORMAT_PROPERTIES_2")..VkStructureType("sType").mutable()
    PointerSetter(
        "VkDrmFormatModifierPropertiesList2EXT", "VkDrmFormatModifierPropertiesListEXT", "VkFormatProperties3", "VkFormatProperties3KHR", "VkSubpassResolvePerformanceQueryEXT", "VkTensorFormatPropertiesARM",
        prepend = true
    )..nullable..opaque_p("pNext").mutable()
    VkFormatProperties("formatProperties")
}

val VkImageFormatProperties2 = struct(Module.VULKAN, "VkImageFormatProperties2", mutable = false) {
    Expression("#STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2")..VkStructureType("sType").mutable()
    PointerSetter(
        "VkAndroidHardwareBufferUsageANDROID", "VkExternalImageFormatProperties", "VkExternalImageFormatPropertiesKHR", "VkFilterCubicImageViewImageFormatPropertiesEXT", "VkHostImageCopyDevicePerformanceQuery", "VkHostImageCopyDevicePerformanceQueryEXT", "VkImageCompressionPropertiesEXT", "VkSamplerYcbcrConversionImageFormatProperties", "VkSamplerYcbcrConversionImageFormatPropertiesKHR", "VkSubsampledImageFormatPropertiesEXT", "VkTextureLODGatherFormatPropertiesAMD",
        prepend = true
    )..nullable..opaque_p("pNext").mutable()
    VkImageFormatProperties("imageFormatProperties")
}

val VkPhysicalDeviceImageFormatInfo2 = struct(Module.VULKAN, "VkPhysicalDeviceImageFormatInfo2") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2")..VkStructureType("sType")
    PointerSetter(
        "VkImageCompressionControlEXT", "VkImageFormatListCreateInfo", "VkImageFormatListCreateInfoKHR", "VkImageStencilUsageCreateInfo", "VkImageStencilUsageCreateInfoEXT", "VkOpticalFlowImageFormatInfoNV", "VkPhysicalDeviceExternalImageFormatInfo", "VkPhysicalDeviceExternalImageFormatInfoKHR", "VkPhysicalDeviceImageDrmFormatModifierInfoEXT", "VkPhysicalDeviceImageViewImageFormatInfoEXT", "VkVideoProfileListInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkFormat("format")
    VkImageType("type")
    VkImageTiling("tiling")
    VkImageUsageFlags("usage")
    VkImageCreateFlags("flags")
}

val VkQueueFamilyProperties2 = struct(Module.VULKAN, "VkQueueFamilyProperties2", mutable = false) {
    Expression("#STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2")..VkStructureType("sType").mutable()
    PointerSetter(
        "VkQueueFamilyCheckpointProperties2NV", "VkQueueFamilyCheckpointPropertiesNV", "VkQueueFamilyGlobalPriorityProperties", "VkQueueFamilyGlobalPriorityPropertiesEXT", "VkQueueFamilyGlobalPriorityPropertiesKHR", "VkQueueFamilyOwnershipTransferPropertiesKHR", "VkQueueFamilyQueryResultStatusPropertiesKHR", "VkQueueFamilyVideoPropertiesKHR",
        prepend = true
    )..nullable..opaque_p("pNext").mutable()
    VkQueueFamilyProperties("queueFamilyProperties")
}

val VkPhysicalDeviceMemoryProperties2 = struct(Module.VULKAN, "VkPhysicalDeviceMemoryProperties2", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2")..VkStructureType("sType").mutable()
    PointerSetter(
        "VkPhysicalDeviceMemoryBudgetPropertiesEXT",
        prepend = true
    )..nullable..opaque_p("pNext").mutable()
    VkPhysicalDeviceMemoryProperties("memoryProperties")
}

val VkSparseImageFormatProperties2 = struct(Module.VULKAN, "VkSparseImageFormatProperties2", mutable = false) {
    Expression("#STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkSparseImageFormatProperties("properties")
}

val VkPhysicalDeviceSparseImageFormatInfo2 = struct(Module.VULKAN, "VkPhysicalDeviceSparseImageFormatInfo2") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkFormat("format")
    VkImageType("type")
    VkSampleCountFlagBits("samples")
    VkImageUsageFlags("usage")
    VkImageTiling("tiling")
}

val VkImageViewUsageCreateInfo = struct(Module.VULKAN, "VkImageViewUsageCreateInfo") {
    Expression("#STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageUsageFlags("usage")
}

val VkPhysicalDeviceProtectedMemoryFeatures = struct(Module.VULKAN, "VkPhysicalDeviceProtectedMemoryFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("protectedMemory")
}

val VkPhysicalDeviceProtectedMemoryProperties = struct(Module.VULKAN, "VkPhysicalDeviceProtectedMemoryProperties", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("protectedNoFault")
}

val VkDeviceQueueInfo2 = struct(Module.VULKAN, "VkDeviceQueueInfo2") {
    Expression("#STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceQueueCreateFlags("flags")
    uint32_t("queueFamilyIndex")
    uint32_t("queueIndex")
}

val VkProtectedSubmitInfo = struct(Module.VULKAN, "VkProtectedSubmitInfo") {
    Expression("#STRUCTURE_TYPE_PROTECTED_SUBMIT_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBool32("protectedSubmit")
}

val VkBindImagePlaneMemoryInfo = struct(Module.VULKAN, "VkBindImagePlaneMemoryInfo") {
    Expression("#STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageAspectFlagBits("planeAspect")
}

val VkImagePlaneMemoryRequirementsInfo = struct(Module.VULKAN, "VkImagePlaneMemoryRequirementsInfo") {
    Expression("#STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageAspectFlagBits("planeAspect")
}

val VkExternalMemoryProperties = struct(Module.VULKAN, "VkExternalMemoryProperties", mutable = false) {
    VkExternalMemoryFeatureFlags("externalMemoryFeatures")
    VkExternalMemoryHandleTypeFlags("exportFromImportedHandleTypes")
    VkExternalMemoryHandleTypeFlags("compatibleHandleTypes")
}

val VkPhysicalDeviceExternalImageFormatInfo = struct(Module.VULKAN, "VkPhysicalDeviceExternalImageFormatInfo") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExternalMemoryHandleTypeFlagBits("handleType")
}

val VkExternalImageFormatProperties = struct(Module.VULKAN, "VkExternalImageFormatProperties", mutable = false) {
    Expression("#STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkExternalMemoryProperties("externalMemoryProperties")
}

val VkPhysicalDeviceExternalBufferInfo = struct(Module.VULKAN, "VkPhysicalDeviceExternalBufferInfo") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkBufferUsageFlags2CreateInfo", "VkBufferUsageFlags2CreateInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkBufferCreateFlags("flags")
    VkBufferUsageFlags("usage")
    VkExternalMemoryHandleTypeFlagBits("handleType")
}

val VkExternalBufferProperties = struct(Module.VULKAN, "VkExternalBufferProperties", mutable = false) {
    Expression("#STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkExternalMemoryProperties("externalMemoryProperties")
}

val VkPhysicalDeviceIDProperties = struct(Module.VULKAN, "VkPhysicalDeviceIDProperties", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    javaImport("static org.lwjgl.vulkan.VK11.*")
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint8_t("deviceUUID")["VK_UUID_SIZE"]
    uint8_t("driverUUID")["VK_UUID_SIZE"]
    uint8_t("deviceLUID")["VK_LUID_SIZE"]
    uint32_t("deviceNodeMask")
    VkBool32("deviceLUIDValid")
}

val VkExternalMemoryImageCreateInfo = struct(Module.VULKAN, "VkExternalMemoryImageCreateInfo") {
    Expression("#STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExternalMemoryHandleTypeFlags("handleTypes")
}

val VkExternalMemoryBufferCreateInfo = struct(Module.VULKAN, "VkExternalMemoryBufferCreateInfo") {
    Expression("#STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExternalMemoryHandleTypeFlags("handleTypes")
}

val VkExportMemoryAllocateInfo = struct(Module.VULKAN, "VkExportMemoryAllocateInfo") {
    Expression("#STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExternalMemoryHandleTypeFlags("handleTypes")
}

val VkPhysicalDeviceExternalFenceInfo = struct(Module.VULKAN, "VkPhysicalDeviceExternalFenceInfo") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExternalFenceHandleTypeFlagBits("handleType")
}

val VkExternalFenceProperties = struct(Module.VULKAN, "VkExternalFenceProperties", mutable = false) {
    Expression("#STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkExternalFenceHandleTypeFlags("exportFromImportedHandleTypes")
    VkExternalFenceHandleTypeFlags("compatibleHandleTypes")
    VkExternalFenceFeatureFlags("externalFenceFeatures")
}

val VkExportFenceCreateInfo = struct(Module.VULKAN, "VkExportFenceCreateInfo") {
    Expression("#STRUCTURE_TYPE_EXPORT_FENCE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExternalFenceHandleTypeFlags("handleTypes")
}

val VkExportSemaphoreCreateInfo = struct(Module.VULKAN, "VkExportSemaphoreCreateInfo") {
    Expression("#STRUCTURE_TYPE_EXPORT_SEMAPHORE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkExternalSemaphoreHandleTypeFlags("handleTypes")
}

val VkPhysicalDeviceExternalSemaphoreInfo = struct(Module.VULKAN, "VkPhysicalDeviceExternalSemaphoreInfo") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkSemaphoreTypeCreateInfo", "VkSemaphoreTypeCreateInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkExternalSemaphoreHandleTypeFlagBits("handleType")
}

val VkExternalSemaphoreProperties = struct(Module.VULKAN, "VkExternalSemaphoreProperties", mutable = false) {
    Expression("#STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkExternalSemaphoreHandleTypeFlags("exportFromImportedHandleTypes")
    VkExternalSemaphoreHandleTypeFlags("compatibleHandleTypes")
    VkExternalSemaphoreFeatureFlags("externalSemaphoreFeatures")
}

val VkPhysicalDeviceSubgroupProperties = struct(Module.VULKAN, "VkPhysicalDeviceSubgroupProperties", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("subgroupSize")
    VkShaderStageFlags("supportedStages")
    VkSubgroupFeatureFlags("supportedOperations")
    VkBool32("quadOperationsInAllStages")
}

val VkPhysicalDevice16BitStorageFeatures = struct(Module.VULKAN, "VkPhysicalDevice16BitStorageFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("storageBuffer16BitAccess")
    VkBool32("uniformAndStorageBuffer16BitAccess")
    VkBool32("storagePushConstant16")
    VkBool32("storageInputOutput16")
}

val _VkPhysicalDeviceVariablePointersFeatures = struct(Module.VULKAN, "VkPhysicalDeviceVariablePointersFeatures")
val VkPhysicalDeviceVariablePointerFeatures = struct(Module.VULKAN, "VkPhysicalDeviceVariablePointerFeatures", alias = _VkPhysicalDeviceVariablePointersFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("variablePointersStorageBuffer")
    VkBool32("variablePointers")
}

val VkPhysicalDeviceVariablePointersFeatures = struct(Module.VULKAN, "VkPhysicalDeviceVariablePointersFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("variablePointersStorageBuffer")
    VkBool32("variablePointers")
}

val VkDescriptorUpdateTemplateEntry = struct(Module.VULKAN, "VkDescriptorUpdateTemplateEntry") {
    uint32_t("dstBinding")
    uint32_t("dstArrayElement")
    uint32_t("descriptorCount")
    VkDescriptorType("descriptorType")
    size_t("offset")
    size_t("stride")
}

val VkDescriptorUpdateTemplateCreateInfo = struct(Module.VULKAN, "VkDescriptorUpdateTemplateCreateInfo") {
    Expression("#STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDescriptorUpdateTemplateCreateFlags("flags")
    AutoSize("pDescriptorUpdateEntries")..uint32_t("descriptorUpdateEntryCount")
    VkDescriptorUpdateTemplateEntry.const.p("pDescriptorUpdateEntries")
    VkDescriptorUpdateTemplateType("templateType")
    VkDescriptorSetLayout("descriptorSetLayout")
    VkPipelineBindPoint("pipelineBindPoint")
    VkPipelineLayout("pipelineLayout")
    uint32_t("set")
}

val VkPhysicalDeviceMaintenance3Properties = struct(Module.VULKAN, "VkPhysicalDeviceMaintenance3Properties", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxPerSetDescriptors")
    VkDeviceSize("maxMemoryAllocationSize")
}

val VkDescriptorSetLayoutSupport = struct(Module.VULKAN, "VkDescriptorSetLayoutSupport", mutable = false) {
    Expression("#STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT")..VkStructureType("sType").mutable()
    PointerSetter(
        "VkDescriptorSetVariableDescriptorCountLayoutSupport", "VkDescriptorSetVariableDescriptorCountLayoutSupportEXT",
        prepend = true
    )..nullable..opaque_p("pNext").mutable()
    VkBool32("supported")
}

val VkSamplerYcbcrConversionCreateInfo = struct(Module.VULKAN, "VkSamplerYcbcrConversionCreateInfo") {
    Expression("#STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkExternalFormatANDROID", "VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkFormat("format")
    VkSamplerYcbcrModelConversion("ycbcrModel")
    VkSamplerYcbcrRange("ycbcrRange")
    VkComponentMapping("components")
    VkChromaLocation("xChromaOffset")
    VkChromaLocation("yChromaOffset")
    VkFilter("chromaFilter")
    VkBool32("forceExplicitReconstruction")
}

val VkSamplerYcbcrConversionInfo = struct(Module.VULKAN, "VkSamplerYcbcrConversionInfo") {
    Expression("#STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSamplerYcbcrConversion("conversion")
}

val VkPhysicalDeviceSamplerYcbcrConversionFeatures = struct(Module.VULKAN, "VkPhysicalDeviceSamplerYcbcrConversionFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("samplerYcbcrConversion")
}

val VkSamplerYcbcrConversionImageFormatProperties = struct(Module.VULKAN, "VkSamplerYcbcrConversionImageFormatProperties", mutable = false) {
    Expression("#STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("combinedImageSamplerDescriptorCount")
}

val VkDeviceGroupRenderPassBeginInfo = struct(Module.VULKAN, "VkDeviceGroupRenderPassBeginInfo") {
    Expression("#STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("deviceMask")
    AutoSize("pDeviceRenderAreas", optional = true)..uint32_t("deviceRenderAreaCount")
    VkRect2D.const.p("pDeviceRenderAreas")
}

val VkPhysicalDevicePointClippingProperties = struct(Module.VULKAN, "VkPhysicalDevicePointClippingProperties", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkPointClippingBehavior("pointClippingBehavior")
}

val VkInputAttachmentAspectReference = struct(Module.VULKAN, "VkInputAttachmentAspectReference") {
    uint32_t("subpass")
    uint32_t("inputAttachmentIndex")
    VkImageAspectFlags("aspectMask")
}

val VkRenderPassInputAttachmentAspectCreateInfo = struct(Module.VULKAN, "VkRenderPassInputAttachmentAspectCreateInfo") {
    Expression("#STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pAspectReferences")..uint32_t("aspectReferenceCount")
    VkInputAttachmentAspectReference.const.p("pAspectReferences")
}

val VkPipelineTessellationDomainOriginStateCreateInfo = struct(Module.VULKAN, "VkPipelineTessellationDomainOriginStateCreateInfo") {
    Expression("#STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkTessellationDomainOrigin("domainOrigin")
}

val VkRenderPassMultiviewCreateInfo = struct(Module.VULKAN, "VkRenderPassMultiviewCreateInfo") {
    Expression("#STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pViewMasks", optional = true)..uint32_t("subpassCount")
    uint32_t.const.p("pViewMasks")
    AutoSize("pViewOffsets", optional = true)..uint32_t("dependencyCount")
    int32_t.const.p("pViewOffsets")
    AutoSize("pCorrelationMasks", optional = true)..uint32_t("correlationMaskCount")
    uint32_t.const.p("pCorrelationMasks")
}

val VkPhysicalDeviceMultiviewFeatures = struct(Module.VULKAN, "VkPhysicalDeviceMultiviewFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("multiview")
    VkBool32("multiviewGeometryShader")
    VkBool32("multiviewTessellationShader")
}

val VkPhysicalDeviceMultiviewProperties = struct(Module.VULKAN, "VkPhysicalDeviceMultiviewProperties", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxMultiviewViewCount")
    uint32_t("maxMultiviewInstanceIndex")
}

val _VkPhysicalDeviceShaderDrawParametersFeatures = struct(Module.VULKAN, "VkPhysicalDeviceShaderDrawParametersFeatures")
val VkPhysicalDeviceShaderDrawParameterFeatures = struct(Module.VULKAN, "VkPhysicalDeviceShaderDrawParameterFeatures", alias = _VkPhysicalDeviceShaderDrawParametersFeatures) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderDrawParameters")
}

val VkPhysicalDeviceShaderDrawParametersFeatures = struct(Module.VULKAN, "VkPhysicalDeviceShaderDrawParametersFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderDrawParameters")
}

val VkPhysicalDeviceVulkan11Features = struct(Module.VULKAN, "VkPhysicalDeviceVulkan11Features") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("storageBuffer16BitAccess")
    VkBool32("uniformAndStorageBuffer16BitAccess")
    VkBool32("storagePushConstant16")
    VkBool32("storageInputOutput16")
    VkBool32("multiview")
    VkBool32("multiviewGeometryShader")
    VkBool32("multiviewTessellationShader")
    VkBool32("variablePointersStorageBuffer")
    VkBool32("variablePointers")
    VkBool32("protectedMemory")
    VkBool32("samplerYcbcrConversion")
    VkBool32("shaderDrawParameters")
}

val VkPhysicalDeviceVulkan11Properties = struct(Module.VULKAN, "VkPhysicalDeviceVulkan11Properties", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    javaImport("static org.lwjgl.vulkan.VK11.*")
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint8_t("deviceUUID")["VK_UUID_SIZE"]
    uint8_t("driverUUID")["VK_UUID_SIZE"]
    uint8_t("deviceLUID")["VK_LUID_SIZE"]
    uint32_t("deviceNodeMask")
    VkBool32("deviceLUIDValid")
    uint32_t("subgroupSize")
    VkShaderStageFlags("subgroupSupportedStages")
    VkSubgroupFeatureFlags("subgroupSupportedOperations")
    VkBool32("subgroupQuadOperationsInAllStages")
    VkPointClippingBehavior("pointClippingBehavior")
    uint32_t("maxMultiviewViewCount")
    uint32_t("maxMultiviewInstanceIndex")
    VkBool32("protectedNoFault")
    uint32_t("maxPerSetDescriptors")
    VkDeviceSize("maxMemoryAllocationSize")
}

val VkPhysicalDeviceVulkan12Features = struct(Module.VULKAN, "VkPhysicalDeviceVulkan12Features") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("samplerMirrorClampToEdge")
    VkBool32("drawIndirectCount")
    VkBool32("storageBuffer8BitAccess")
    VkBool32("uniformAndStorageBuffer8BitAccess")
    VkBool32("storagePushConstant8")
    VkBool32("shaderBufferInt64Atomics")
    VkBool32("shaderSharedInt64Atomics")
    VkBool32("shaderFloat16")
    VkBool32("shaderInt8")
    VkBool32("descriptorIndexing")
    VkBool32("shaderInputAttachmentArrayDynamicIndexing")
    VkBool32("shaderUniformTexelBufferArrayDynamicIndexing")
    VkBool32("shaderStorageTexelBufferArrayDynamicIndexing")
    VkBool32("shaderUniformBufferArrayNonUniformIndexing")
    VkBool32("shaderSampledImageArrayNonUniformIndexing")
    VkBool32("shaderStorageBufferArrayNonUniformIndexing")
    VkBool32("shaderStorageImageArrayNonUniformIndexing")
    VkBool32("shaderInputAttachmentArrayNonUniformIndexing")
    VkBool32("shaderUniformTexelBufferArrayNonUniformIndexing")
    VkBool32("shaderStorageTexelBufferArrayNonUniformIndexing")
    VkBool32("descriptorBindingUniformBufferUpdateAfterBind")
    VkBool32("descriptorBindingSampledImageUpdateAfterBind")
    VkBool32("descriptorBindingStorageImageUpdateAfterBind")
    VkBool32("descriptorBindingStorageBufferUpdateAfterBind")
    VkBool32("descriptorBindingUniformTexelBufferUpdateAfterBind")
    VkBool32("descriptorBindingStorageTexelBufferUpdateAfterBind")
    VkBool32("descriptorBindingUpdateUnusedWhilePending")
    VkBool32("descriptorBindingPartiallyBound")
    VkBool32("descriptorBindingVariableDescriptorCount")
    VkBool32("runtimeDescriptorArray")
    VkBool32("samplerFilterMinmax")
    VkBool32("scalarBlockLayout")
    VkBool32("imagelessFramebuffer")
    VkBool32("uniformBufferStandardLayout")
    VkBool32("shaderSubgroupExtendedTypes")
    VkBool32("separateDepthStencilLayouts")
    VkBool32("hostQueryReset")
    VkBool32("timelineSemaphore")
    VkBool32("bufferDeviceAddress")
    VkBool32("bufferDeviceAddressCaptureReplay")
    VkBool32("bufferDeviceAddressMultiDevice")
    VkBool32("vulkanMemoryModel")
    VkBool32("vulkanMemoryModelDeviceScope")
    VkBool32("vulkanMemoryModelAvailabilityVisibilityChains")
    VkBool32("shaderOutputViewportIndex")
    VkBool32("shaderOutputLayer")
    VkBool32("subgroupBroadcastDynamicId")
}

val VkConformanceVersion = struct(Module.VULKAN, "VkConformanceVersion") {
    uint8_t("major")
    uint8_t("minor")
    uint8_t("subminor")
    uint8_t("patch")
}

val VkPhysicalDeviceVulkan12Properties = struct(Module.VULKAN, "VkPhysicalDeviceVulkan12Properties", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK12.*")
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkDriverId("driverID")
    charUTF8("driverName")["VK_MAX_DRIVER_NAME_SIZE"]
    charUTF8("driverInfo")["VK_MAX_DRIVER_INFO_SIZE"]
    VkConformanceVersion("conformanceVersion")
    VkShaderFloatControlsIndependence("denormBehaviorIndependence")
    VkShaderFloatControlsIndependence("roundingModeIndependence")
    VkBool32("shaderSignedZeroInfNanPreserveFloat16")
    VkBool32("shaderSignedZeroInfNanPreserveFloat32")
    VkBool32("shaderSignedZeroInfNanPreserveFloat64")
    VkBool32("shaderDenormPreserveFloat16")
    VkBool32("shaderDenormPreserveFloat32")
    VkBool32("shaderDenormPreserveFloat64")
    VkBool32("shaderDenormFlushToZeroFloat16")
    VkBool32("shaderDenormFlushToZeroFloat32")
    VkBool32("shaderDenormFlushToZeroFloat64")
    VkBool32("shaderRoundingModeRTEFloat16")
    VkBool32("shaderRoundingModeRTEFloat32")
    VkBool32("shaderRoundingModeRTEFloat64")
    VkBool32("shaderRoundingModeRTZFloat16")
    VkBool32("shaderRoundingModeRTZFloat32")
    VkBool32("shaderRoundingModeRTZFloat64")
    uint32_t("maxUpdateAfterBindDescriptorsInAllPools")
    VkBool32("shaderUniformBufferArrayNonUniformIndexingNative")
    VkBool32("shaderSampledImageArrayNonUniformIndexingNative")
    VkBool32("shaderStorageBufferArrayNonUniformIndexingNative")
    VkBool32("shaderStorageImageArrayNonUniformIndexingNative")
    VkBool32("shaderInputAttachmentArrayNonUniformIndexingNative")
    VkBool32("robustBufferAccessUpdateAfterBind")
    VkBool32("quadDivergentImplicitLod")
    uint32_t("maxPerStageDescriptorUpdateAfterBindSamplers")
    uint32_t("maxPerStageDescriptorUpdateAfterBindUniformBuffers")
    uint32_t("maxPerStageDescriptorUpdateAfterBindStorageBuffers")
    uint32_t("maxPerStageDescriptorUpdateAfterBindSampledImages")
    uint32_t("maxPerStageDescriptorUpdateAfterBindStorageImages")
    uint32_t("maxPerStageDescriptorUpdateAfterBindInputAttachments")
    uint32_t("maxPerStageUpdateAfterBindResources")
    uint32_t("maxDescriptorSetUpdateAfterBindSamplers")
    uint32_t("maxDescriptorSetUpdateAfterBindUniformBuffers")
    uint32_t("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic")
    uint32_t("maxDescriptorSetUpdateAfterBindStorageBuffers")
    uint32_t("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic")
    uint32_t("maxDescriptorSetUpdateAfterBindSampledImages")
    uint32_t("maxDescriptorSetUpdateAfterBindStorageImages")
    uint32_t("maxDescriptorSetUpdateAfterBindInputAttachments")
    VkResolveModeFlags("supportedDepthResolveModes")
    VkResolveModeFlags("supportedStencilResolveModes")
    VkBool32("independentResolveNone")
    VkBool32("independentResolve")
    VkBool32("filterMinmaxSingleComponentFormats")
    VkBool32("filterMinmaxImageComponentMapping")
    uint64_t("maxTimelineSemaphoreValueDifference")
    VkSampleCountFlags("framebufferIntegerColorSampleCounts")
}

val VkImageFormatListCreateInfo = struct(Module.VULKAN, "VkImageFormatListCreateInfo") {
    Expression("#STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pViewFormats", optional = true)..uint32_t("viewFormatCount")
    VkFormat.const.p("pViewFormats")
}

val VkPhysicalDeviceDriverProperties = struct(Module.VULKAN, "VkPhysicalDeviceDriverProperties", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK12.*")
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkDriverId("driverID")
    charUTF8("driverName")["VK_MAX_DRIVER_NAME_SIZE"]
    charUTF8("driverInfo")["VK_MAX_DRIVER_INFO_SIZE"]
    VkConformanceVersion("conformanceVersion")
}

val VkPhysicalDeviceVulkanMemoryModelFeatures = struct(Module.VULKAN, "VkPhysicalDeviceVulkanMemoryModelFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("vulkanMemoryModel")
    VkBool32("vulkanMemoryModelDeviceScope")
    VkBool32("vulkanMemoryModelAvailabilityVisibilityChains")
}

val VkPhysicalDeviceHostQueryResetFeatures = struct(Module.VULKAN, "VkPhysicalDeviceHostQueryResetFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("hostQueryReset")
}

val VkPhysicalDeviceTimelineSemaphoreFeatures = struct(Module.VULKAN, "VkPhysicalDeviceTimelineSemaphoreFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("timelineSemaphore")
}

val VkPhysicalDeviceTimelineSemaphoreProperties = struct(Module.VULKAN, "VkPhysicalDeviceTimelineSemaphoreProperties", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint64_t("maxTimelineSemaphoreValueDifference")
}

val VkSemaphoreTypeCreateInfo = struct(Module.VULKAN, "VkSemaphoreTypeCreateInfo") {
    Expression("#STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSemaphoreType("semaphoreType")
    uint64_t("initialValue")
}

val VkTimelineSemaphoreSubmitInfo = struct(Module.VULKAN, "VkTimelineSemaphoreSubmitInfo") {
    Expression("#STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pWaitSemaphoreValues", optional = true)..uint32_t("waitSemaphoreValueCount")
    nullable..uint64_t.const.p("pWaitSemaphoreValues")
    AutoSize("pSignalSemaphoreValues", optional = true)..uint32_t("signalSemaphoreValueCount")
    nullable..uint64_t.const.p("pSignalSemaphoreValues")
}

val VkSemaphoreWaitInfo = struct(Module.VULKAN, "VkSemaphoreWaitInfo") {
    Expression("#STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSemaphoreWaitFlags("flags")
    AutoSize("pSemaphores", "pValues")..uint32_t("semaphoreCount")
    VkSemaphore.const.p("pSemaphores")
    uint64_t.const.p("pValues")
}

val VkSemaphoreSignalInfo = struct(Module.VULKAN, "VkSemaphoreSignalInfo") {
    Expression("#STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSemaphore("semaphore")
    uint64_t("value")
}

val VkPhysicalDeviceBufferDeviceAddressFeatures = struct(Module.VULKAN, "VkPhysicalDeviceBufferDeviceAddressFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("bufferDeviceAddress")
    VkBool32("bufferDeviceAddressCaptureReplay")
    VkBool32("bufferDeviceAddressMultiDevice")
}

val VkBufferDeviceAddressInfo = struct(Module.VULKAN, "VkBufferDeviceAddressInfo") {
    Expression("#STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBuffer("buffer")
}

val VkBufferOpaqueCaptureAddressCreateInfo = struct(Module.VULKAN, "VkBufferOpaqueCaptureAddressCreateInfo") {
    Expression("#STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint64_t("opaqueCaptureAddress")
}

val VkMemoryOpaqueCaptureAddressAllocateInfo = struct(Module.VULKAN, "VkMemoryOpaqueCaptureAddressAllocateInfo") {
    Expression("#STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint64_t("opaqueCaptureAddress")
}

val VkDeviceMemoryOpaqueCaptureAddressInfo = struct(Module.VULKAN, "VkDeviceMemoryOpaqueCaptureAddressInfo") {
    Expression("#STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceMemory("memory")
}

val VkPhysicalDevice8BitStorageFeatures = struct(Module.VULKAN, "VkPhysicalDevice8BitStorageFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("storageBuffer8BitAccess")
    VkBool32("uniformAndStorageBuffer8BitAccess")
    VkBool32("storagePushConstant8")
}

val VkPhysicalDeviceShaderAtomicInt64Features = struct(Module.VULKAN, "VkPhysicalDeviceShaderAtomicInt64Features") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderBufferInt64Atomics")
    VkBool32("shaderSharedInt64Atomics")
}

val VkPhysicalDeviceShaderFloat16Int8Features = struct(Module.VULKAN, "VkPhysicalDeviceShaderFloat16Int8Features") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderFloat16")
    VkBool32("shaderInt8")
}

val VkPhysicalDeviceFloatControlsProperties = struct(Module.VULKAN, "VkPhysicalDeviceFloatControlsProperties", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkShaderFloatControlsIndependence("denormBehaviorIndependence")
    VkShaderFloatControlsIndependence("roundingModeIndependence")
    VkBool32("shaderSignedZeroInfNanPreserveFloat16")
    VkBool32("shaderSignedZeroInfNanPreserveFloat32")
    VkBool32("shaderSignedZeroInfNanPreserveFloat64")
    VkBool32("shaderDenormPreserveFloat16")
    VkBool32("shaderDenormPreserveFloat32")
    VkBool32("shaderDenormPreserveFloat64")
    VkBool32("shaderDenormFlushToZeroFloat16")
    VkBool32("shaderDenormFlushToZeroFloat32")
    VkBool32("shaderDenormFlushToZeroFloat64")
    VkBool32("shaderRoundingModeRTEFloat16")
    VkBool32("shaderRoundingModeRTEFloat32")
    VkBool32("shaderRoundingModeRTEFloat64")
    VkBool32("shaderRoundingModeRTZFloat16")
    VkBool32("shaderRoundingModeRTZFloat32")
    VkBool32("shaderRoundingModeRTZFloat64")
}

val VkDescriptorSetLayoutBindingFlagsCreateInfo = struct(Module.VULKAN, "VkDescriptorSetLayoutBindingFlagsCreateInfo") {
    Expression("#STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pBindingFlags", optional = true)..uint32_t("bindingCount")
    nullable..VkDescriptorBindingFlags.const.p("pBindingFlags")
}

val VkPhysicalDeviceDescriptorIndexingFeatures = struct(Module.VULKAN, "VkPhysicalDeviceDescriptorIndexingFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderInputAttachmentArrayDynamicIndexing")
    VkBool32("shaderUniformTexelBufferArrayDynamicIndexing")
    VkBool32("shaderStorageTexelBufferArrayDynamicIndexing")
    VkBool32("shaderUniformBufferArrayNonUniformIndexing")
    VkBool32("shaderSampledImageArrayNonUniformIndexing")
    VkBool32("shaderStorageBufferArrayNonUniformIndexing")
    VkBool32("shaderStorageImageArrayNonUniformIndexing")
    VkBool32("shaderInputAttachmentArrayNonUniformIndexing")
    VkBool32("shaderUniformTexelBufferArrayNonUniformIndexing")
    VkBool32("shaderStorageTexelBufferArrayNonUniformIndexing")
    VkBool32("descriptorBindingUniformBufferUpdateAfterBind")
    VkBool32("descriptorBindingSampledImageUpdateAfterBind")
    VkBool32("descriptorBindingStorageImageUpdateAfterBind")
    VkBool32("descriptorBindingStorageBufferUpdateAfterBind")
    VkBool32("descriptorBindingUniformTexelBufferUpdateAfterBind")
    VkBool32("descriptorBindingStorageTexelBufferUpdateAfterBind")
    VkBool32("descriptorBindingUpdateUnusedWhilePending")
    VkBool32("descriptorBindingPartiallyBound")
    VkBool32("descriptorBindingVariableDescriptorCount")
    VkBool32("runtimeDescriptorArray")
}

val VkPhysicalDeviceDescriptorIndexingProperties = struct(Module.VULKAN, "VkPhysicalDeviceDescriptorIndexingProperties", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxUpdateAfterBindDescriptorsInAllPools")
    VkBool32("shaderUniformBufferArrayNonUniformIndexingNative")
    VkBool32("shaderSampledImageArrayNonUniformIndexingNative")
    VkBool32("shaderStorageBufferArrayNonUniformIndexingNative")
    VkBool32("shaderStorageImageArrayNonUniformIndexingNative")
    VkBool32("shaderInputAttachmentArrayNonUniformIndexingNative")
    VkBool32("robustBufferAccessUpdateAfterBind")
    VkBool32("quadDivergentImplicitLod")
    uint32_t("maxPerStageDescriptorUpdateAfterBindSamplers")
    uint32_t("maxPerStageDescriptorUpdateAfterBindUniformBuffers")
    uint32_t("maxPerStageDescriptorUpdateAfterBindStorageBuffers")
    uint32_t("maxPerStageDescriptorUpdateAfterBindSampledImages")
    uint32_t("maxPerStageDescriptorUpdateAfterBindStorageImages")
    uint32_t("maxPerStageDescriptorUpdateAfterBindInputAttachments")
    uint32_t("maxPerStageUpdateAfterBindResources")
    uint32_t("maxDescriptorSetUpdateAfterBindSamplers")
    uint32_t("maxDescriptorSetUpdateAfterBindUniformBuffers")
    uint32_t("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic")
    uint32_t("maxDescriptorSetUpdateAfterBindStorageBuffers")
    uint32_t("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic")
    uint32_t("maxDescriptorSetUpdateAfterBindSampledImages")
    uint32_t("maxDescriptorSetUpdateAfterBindStorageImages")
    uint32_t("maxDescriptorSetUpdateAfterBindInputAttachments")
}

val VkDescriptorSetVariableDescriptorCountAllocateInfo = struct(Module.VULKAN, "VkDescriptorSetVariableDescriptorCountAllocateInfo") {
    Expression("#STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pDescriptorCounts", optional = true)..uint32_t("descriptorSetCount")
    uint32_t.const.p("pDescriptorCounts")
}

val VkDescriptorSetVariableDescriptorCountLayoutSupport = struct(Module.VULKAN, "VkDescriptorSetVariableDescriptorCountLayoutSupport", mutable = false) {
    Expression("#STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxVariableDescriptorCount")
}

val VkPhysicalDeviceScalarBlockLayoutFeatures = struct(Module.VULKAN, "VkPhysicalDeviceScalarBlockLayoutFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("scalarBlockLayout")
}

val VkSamplerReductionModeCreateInfo = struct(Module.VULKAN, "VkSamplerReductionModeCreateInfo") {
    Expression("#STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSamplerReductionMode("reductionMode")
}

val VkPhysicalDeviceSamplerFilterMinmaxProperties = struct(Module.VULKAN, "VkPhysicalDeviceSamplerFilterMinmaxProperties", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("filterMinmaxSingleComponentFormats")
    VkBool32("filterMinmaxImageComponentMapping")
}

val VkPhysicalDeviceUniformBufferStandardLayoutFeatures = struct(Module.VULKAN, "VkPhysicalDeviceUniformBufferStandardLayoutFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("uniformBufferStandardLayout")
}

val VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures = struct(Module.VULKAN, "VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderSubgroupExtendedTypes")
}

val VkAttachmentDescription2 = struct(Module.VULKAN, "VkAttachmentDescription2") {
    Expression("#STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2")..VkStructureType("sType")
    PointerSetter(
        "VkAttachmentDescriptionStencilLayout", "VkAttachmentDescriptionStencilLayoutKHR", "VkExternalFormatANDROID",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkAttachmentDescriptionFlags("flags")
    VkFormat("format")
    VkSampleCountFlagBits("samples")
    VkAttachmentLoadOp("loadOp")
    VkAttachmentStoreOp("storeOp")
    VkAttachmentLoadOp("stencilLoadOp")
    VkAttachmentStoreOp("stencilStoreOp")
    VkImageLayout("initialLayout")
    VkImageLayout("finalLayout")
}

val VkAttachmentReference2 = struct(Module.VULKAN, "VkAttachmentReference2") {
    Expression("#STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2")..VkStructureType("sType")
    PointerSetter(
        "VkAttachmentReferenceStencilLayout", "VkAttachmentReferenceStencilLayoutKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    uint32_t("attachment")
    VkImageLayout("layout")
    VkImageAspectFlags("aspectMask")
}

val VkSubpassDescription2 = struct(Module.VULKAN, "VkSubpassDescription2") {
    Expression("#STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2")..VkStructureType("sType")
    PointerSetter(
        "VkFragmentShadingRateAttachmentInfoKHR", "VkMultisampledRenderToSingleSampledInfoEXT", "VkRenderPassCreationControlEXT", "VkRenderPassSubpassFeedbackCreateInfoEXT", "VkSubpassDescriptionDepthStencilResolve", "VkSubpassDescriptionDepthStencilResolveKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkSubpassDescriptionFlags("flags")
    VkPipelineBindPoint("pipelineBindPoint")
    uint32_t("viewMask")
    AutoSize("pInputAttachments", optional = true)..uint32_t("inputAttachmentCount")
    VkAttachmentReference2.const.p("pInputAttachments")
    AutoSize("pColorAttachments", "pResolveAttachments", optional = true)..uint32_t("colorAttachmentCount")
    VkAttachmentReference2.const.p("pColorAttachments")
    nullable..VkAttachmentReference2.const.p("pResolveAttachments")
    nullable..VkAttachmentReference2.const.p("pDepthStencilAttachment")
    AutoSize("pPreserveAttachments", optional = true)..uint32_t("preserveAttachmentCount")
    uint32_t.const.p("pPreserveAttachments")
}

val VkSubpassDependency2 = struct(Module.VULKAN, "VkSubpassDependency2") {
    Expression("#STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2")..VkStructureType("sType")
    PointerSetter(
        "VkMemoryBarrier2", "VkMemoryBarrier2KHR", "VkMemoryBarrierAccessFlags3KHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    uint32_t("srcSubpass")
    uint32_t("dstSubpass")
    VkPipelineStageFlags("srcStageMask")
    VkPipelineStageFlags("dstStageMask")
    VkAccessFlags("srcAccessMask")
    VkAccessFlags("dstAccessMask")
    VkDependencyFlags("dependencyFlags")
    int32_t("viewOffset")
}

val VkRenderPassCreateInfo2 = struct(Module.VULKAN, "VkRenderPassCreateInfo2") {
    Expression("#STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2")..VkStructureType("sType")
    PointerSetter(
        "VkRenderPassCreationControlEXT", "VkRenderPassCreationFeedbackCreateInfoEXT", "VkRenderPassFragmentDensityMapCreateInfoEXT", "VkRenderPassTileShadingCreateInfoQCOM", "VkTileMemorySizeInfoQCOM",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkRenderPassCreateFlags("flags")
    AutoSize("pAttachments", optional = true)..uint32_t("attachmentCount")
    VkAttachmentDescription2.const.p("pAttachments")
    AutoSize("pSubpasses")..uint32_t("subpassCount")
    VkSubpassDescription2.const.p("pSubpasses")
    AutoSize("pDependencies", optional = true)..uint32_t("dependencyCount")
    VkSubpassDependency2.const.p("pDependencies")
    AutoSize("pCorrelatedViewMasks", optional = true)..uint32_t("correlatedViewMaskCount")
    uint32_t.const.p("pCorrelatedViewMasks")
}

val VkSubpassBeginInfo = struct(Module.VULKAN, "VkSubpassBeginInfo") {
    Expression("#STRUCTURE_TYPE_SUBPASS_BEGIN_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSubpassContents("contents")
}

val VkSubpassEndInfo = struct(Module.VULKAN, "VkSubpassEndInfo") {
    Expression("#STRUCTURE_TYPE_SUBPASS_END_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkRenderPassFragmentDensityMapOffsetEndInfoEXT", "VkSubpassFragmentDensityMapOffsetEndInfoQCOM",
        prepend = true
    )..nullable..opaque_const_p("pNext")
}

val VkSubpassDescriptionDepthStencilResolve = struct(Module.VULKAN, "VkSubpassDescriptionDepthStencilResolve") {
    Expression("#STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkResolveModeFlagBits("depthResolveMode")
    VkResolveModeFlagBits("stencilResolveMode")
    nullable..VkAttachmentReference2.const.p("pDepthStencilResolveAttachment")
}

val VkPhysicalDeviceDepthStencilResolveProperties = struct(Module.VULKAN, "VkPhysicalDeviceDepthStencilResolveProperties", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkResolveModeFlags("supportedDepthResolveModes")
    VkResolveModeFlags("supportedStencilResolveModes")
    VkBool32("independentResolveNone")
    VkBool32("independentResolve")
}

val VkImageStencilUsageCreateInfo = struct(Module.VULKAN, "VkImageStencilUsageCreateInfo") {
    Expression("#STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageUsageFlags("stencilUsage")
}

val VkPhysicalDeviceImagelessFramebufferFeatures = struct(Module.VULKAN, "VkPhysicalDeviceImagelessFramebufferFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("imagelessFramebuffer")
}

val VkFramebufferAttachmentImageInfo = struct(Module.VULKAN, "VkFramebufferAttachmentImageInfo") {
    Expression("#STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageCreateFlags("flags")
    VkImageUsageFlags("usage")
    uint32_t("width")
    uint32_t("height")
    uint32_t("layerCount")
    AutoSize("pViewFormats", optional = true)..uint32_t("viewFormatCount")
    VkFormat.const.p("pViewFormats")
}

val VkFramebufferAttachmentsCreateInfo = struct(Module.VULKAN, "VkFramebufferAttachmentsCreateInfo") {
    Expression("#STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pAttachmentImageInfos", optional = true)..uint32_t("attachmentImageInfoCount")
    VkFramebufferAttachmentImageInfo.const.p("pAttachmentImageInfos")
}

val VkRenderPassAttachmentBeginInfo = struct(Module.VULKAN, "VkRenderPassAttachmentBeginInfo") {
    Expression("#STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pAttachments", optional = true)..uint32_t("attachmentCount")
    VkImageView.const.p("pAttachments")
}

val VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures = struct(Module.VULKAN, "VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("separateDepthStencilLayouts")
}

val VkAttachmentReferenceStencilLayout = struct(Module.VULKAN, "VkAttachmentReferenceStencilLayout") {
    Expression("#STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkImageLayout("stencilLayout")
}

val VkAttachmentDescriptionStencilLayout = struct(Module.VULKAN, "VkAttachmentDescriptionStencilLayout") {
    Expression("#STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkImageLayout("stencilInitialLayout")
    VkImageLayout("stencilFinalLayout")
}

val VkPhysicalDeviceVulkan13Features = struct(Module.VULKAN, "VkPhysicalDeviceVulkan13Features") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("robustImageAccess")
    VkBool32("inlineUniformBlock")
    VkBool32("descriptorBindingInlineUniformBlockUpdateAfterBind")
    VkBool32("pipelineCreationCacheControl")
    VkBool32("privateData")
    VkBool32("shaderDemoteToHelperInvocation")
    VkBool32("shaderTerminateInvocation")
    VkBool32("subgroupSizeControl")
    VkBool32("computeFullSubgroups")
    VkBool32("synchronization2")
    VkBool32("textureCompressionASTC_HDR")
    VkBool32("shaderZeroInitializeWorkgroupMemory")
    VkBool32("dynamicRendering")
    VkBool32("shaderIntegerDotProduct")
    VkBool32("maintenance4")
}

val VkPhysicalDeviceVulkan13Properties = struct(Module.VULKAN, "VkPhysicalDeviceVulkan13Properties", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("minSubgroupSize")
    uint32_t("maxSubgroupSize")
    uint32_t("maxComputeWorkgroupSubgroups")
    VkShaderStageFlags("requiredSubgroupSizeStages")
    uint32_t("maxInlineUniformBlockSize")
    uint32_t("maxPerStageDescriptorInlineUniformBlocks")
    uint32_t("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks")
    uint32_t("maxDescriptorSetInlineUniformBlocks")
    uint32_t("maxDescriptorSetUpdateAfterBindInlineUniformBlocks")
    uint32_t("maxInlineUniformTotalSize")
    VkBool32("integerDotProduct8BitUnsignedAccelerated")
    VkBool32("integerDotProduct8BitSignedAccelerated")
    VkBool32("integerDotProduct8BitMixedSignednessAccelerated")
    VkBool32("integerDotProduct4x8BitPackedUnsignedAccelerated")
    VkBool32("integerDotProduct4x8BitPackedSignedAccelerated")
    VkBool32("integerDotProduct4x8BitPackedMixedSignednessAccelerated")
    VkBool32("integerDotProduct16BitUnsignedAccelerated")
    VkBool32("integerDotProduct16BitSignedAccelerated")
    VkBool32("integerDotProduct16BitMixedSignednessAccelerated")
    VkBool32("integerDotProduct32BitUnsignedAccelerated")
    VkBool32("integerDotProduct32BitSignedAccelerated")
    VkBool32("integerDotProduct32BitMixedSignednessAccelerated")
    VkBool32("integerDotProduct64BitUnsignedAccelerated")
    VkBool32("integerDotProduct64BitSignedAccelerated")
    VkBool32("integerDotProduct64BitMixedSignednessAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating8BitSignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating16BitSignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating32BitSignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating64BitSignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated")
    VkDeviceSize("storageTexelBufferOffsetAlignmentBytes")
    VkBool32("storageTexelBufferOffsetSingleTexelAlignment")
    VkDeviceSize("uniformTexelBufferOffsetAlignmentBytes")
    VkBool32("uniformTexelBufferOffsetSingleTexelAlignment")
    VkDeviceSize("maxBufferSize")
}

val VkPhysicalDeviceToolProperties = struct(Module.VULKAN, "VkPhysicalDeviceToolProperties", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    charUTF8("name")["VK_MAX_EXTENSION_NAME_SIZE"]
    charUTF8("version")["VK_MAX_EXTENSION_NAME_SIZE"]
    VkToolPurposeFlags("purposes")
    charUTF8("description")["VK_MAX_DESCRIPTION_SIZE"]
    charUTF8("layer")["VK_MAX_EXTENSION_NAME_SIZE"]
}

val VkPhysicalDevicePrivateDataFeatures = struct(Module.VULKAN, "VkPhysicalDevicePrivateDataFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("privateData")
}

val VkDevicePrivateDataCreateInfo = struct(Module.VULKAN, "VkDevicePrivateDataCreateInfo") {
    Expression("#STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("privateDataSlotRequestCount")
}

val VkPrivateDataSlotCreateInfo = struct(Module.VULKAN, "VkPrivateDataSlotCreateInfo") {
    Expression("#STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPrivateDataSlotCreateFlags("flags")
}

val VkMemoryBarrier2 = struct(Module.VULKAN, "VkMemoryBarrier2") {
    Expression("#STRUCTURE_TYPE_MEMORY_BARRIER_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineStageFlags2("srcStageMask")
    VkAccessFlags2("srcAccessMask")
    VkPipelineStageFlags2("dstStageMask")
    VkAccessFlags2("dstAccessMask")
}

val VkBufferMemoryBarrier2 = struct(Module.VULKAN, "VkBufferMemoryBarrier2") {
    Expression("#STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2")..VkStructureType("sType")
    PointerSetter(
        "VkExternalMemoryAcquireUnmodifiedEXT", "VkMemoryBarrierAccessFlags3KHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkPipelineStageFlags2("srcStageMask")
    VkAccessFlags2("srcAccessMask")
    VkPipelineStageFlags2("dstStageMask")
    VkAccessFlags2("dstAccessMask")
    uint32_t("srcQueueFamilyIndex")
    uint32_t("dstQueueFamilyIndex")
    VkBuffer("buffer")
    VkDeviceSize("offset")
    VkDeviceSize("size")
}

val VkImageMemoryBarrier2 = struct(Module.VULKAN, "VkImageMemoryBarrier2") {
    Expression("#STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2")..VkStructureType("sType")
    PointerSetter(
        "VkExternalMemoryAcquireUnmodifiedEXT", "VkMemoryBarrierAccessFlags3KHR", "VkSampleLocationsInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkPipelineStageFlags2("srcStageMask")
    VkAccessFlags2("srcAccessMask")
    VkPipelineStageFlags2("dstStageMask")
    VkAccessFlags2("dstAccessMask")
    VkImageLayout("oldLayout")
    VkImageLayout("newLayout")
    uint32_t("srcQueueFamilyIndex")
    uint32_t("dstQueueFamilyIndex")
    VkImage("image")
    VkImageSubresourceRange("subresourceRange")
}

val VkDependencyInfo = struct(Module.VULKAN, "VkDependencyInfo") {
    Expression("#STRUCTURE_TYPE_DEPENDENCY_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkTensorDependencyInfoARM", "VkTensorMemoryBarrierARM",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkDependencyFlags("dependencyFlags")
    AutoSize("pMemoryBarriers", optional = true)..uint32_t("memoryBarrierCount")
    VkMemoryBarrier2.const.p("pMemoryBarriers")
    AutoSize("pBufferMemoryBarriers", optional = true)..uint32_t("bufferMemoryBarrierCount")
    VkBufferMemoryBarrier2.const.p("pBufferMemoryBarriers")
    AutoSize("pImageMemoryBarriers", optional = true)..uint32_t("imageMemoryBarrierCount")
    VkImageMemoryBarrier2.const.p("pImageMemoryBarriers")
}

val VkSemaphoreSubmitInfo = struct(Module.VULKAN, "VkSemaphoreSubmitInfo") {
    Expression("#STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkSemaphore("semaphore")
    uint64_t("value")
    VkPipelineStageFlags2("stageMask")
    uint32_t("deviceIndex")
}

val VkCommandBufferSubmitInfo = struct(Module.VULKAN, "VkCommandBufferSubmitInfo") {
    Expression("#STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkRenderPassStripeSubmitInfoARM",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkCommandBuffer("commandBuffer")
    uint32_t("deviceMask")
}

val VkSubmitInfo2 = struct(Module.VULKAN, "VkSubmitInfo2") {
    Expression("#STRUCTURE_TYPE_SUBMIT_INFO_2")..VkStructureType("sType")
    PointerSetter(
        "VkFrameBoundaryEXT", "VkFrameBoundaryTensorsARM", "VkLatencySubmissionPresentIdNV", "VkPerformanceQuerySubmitInfoKHR", "VkWin32KeyedMutexAcquireReleaseInfoKHR", "VkWin32KeyedMutexAcquireReleaseInfoNV",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkSubmitFlags("flags")
    AutoSize("pWaitSemaphoreInfos", optional = true)..uint32_t("waitSemaphoreInfoCount")
    VkSemaphoreSubmitInfo.const.p("pWaitSemaphoreInfos")
    AutoSize("pCommandBufferInfos", optional = true)..uint32_t("commandBufferInfoCount")
    VkCommandBufferSubmitInfo.const.p("pCommandBufferInfos")
    AutoSize("pSignalSemaphoreInfos", optional = true)..uint32_t("signalSemaphoreInfoCount")
    VkSemaphoreSubmitInfo.const.p("pSignalSemaphoreInfos")
}

val VkPhysicalDeviceSynchronization2Features = struct(Module.VULKAN, "VkPhysicalDeviceSynchronization2Features") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("synchronization2")
}

val VkBufferCopy2 = struct(Module.VULKAN, "VkBufferCopy2") {
    Expression("#STRUCTURE_TYPE_BUFFER_COPY_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkDeviceSize("srcOffset")
    VkDeviceSize("dstOffset")
    VkDeviceSize("size")
}

val VkCopyBufferInfo2 = struct(Module.VULKAN, "VkCopyBufferInfo2") {
    Expression("#STRUCTURE_TYPE_COPY_BUFFER_INFO_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBuffer("srcBuffer")
    VkBuffer("dstBuffer")
    AutoSize("pRegions")..uint32_t("regionCount")
    VkBufferCopy2.const.p("pRegions")
}

val VkImageCopy2 = struct(Module.VULKAN, "VkImageCopy2") {
    Expression("#STRUCTURE_TYPE_IMAGE_COPY_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageSubresourceLayers("srcSubresource")
    VkOffset3D("srcOffset")
    VkImageSubresourceLayers("dstSubresource")
    VkOffset3D("dstOffset")
    VkExtent3D("extent")
}

val VkCopyImageInfo2 = struct(Module.VULKAN, "VkCopyImageInfo2") {
    Expression("#STRUCTURE_TYPE_COPY_IMAGE_INFO_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImage("srcImage")
    VkImageLayout("srcImageLayout")
    VkImage("dstImage")
    VkImageLayout("dstImageLayout")
    AutoSize("pRegions")..uint32_t("regionCount")
    VkImageCopy2.const.p("pRegions")
}

val VkBufferImageCopy2 = struct(Module.VULKAN, "VkBufferImageCopy2") {
    Expression("#STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2")..VkStructureType("sType")
    PointerSetter(
        "VkCopyCommandTransformInfoQCOM",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkDeviceSize("bufferOffset")
    uint32_t("bufferRowLength")
    uint32_t("bufferImageHeight")
    VkImageSubresourceLayers("imageSubresource")
    VkOffset3D("imageOffset")
    VkExtent3D("imageExtent")
}

val VkCopyBufferToImageInfo2 = struct(Module.VULKAN, "VkCopyBufferToImageInfo2") {
    Expression("#STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBuffer("srcBuffer")
    VkImage("dstImage")
    VkImageLayout("dstImageLayout")
    AutoSize("pRegions")..uint32_t("regionCount")
    VkBufferImageCopy2.const.p("pRegions")
}

val VkCopyImageToBufferInfo2 = struct(Module.VULKAN, "VkCopyImageToBufferInfo2") {
    Expression("#STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImage("srcImage")
    VkImageLayout("srcImageLayout")
    VkBuffer("dstBuffer")
    AutoSize("pRegions")..uint32_t("regionCount")
    VkBufferImageCopy2.const.p("pRegions")
}

val VkPhysicalDeviceTextureCompressionASTCHDRFeatures = struct(Module.VULKAN, "VkPhysicalDeviceTextureCompressionASTCHDRFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("textureCompressionASTC_HDR")
}

val VkFormatProperties3 = struct(Module.VULKAN, "VkFormatProperties3", mutable = false) {
    Expression("#STRUCTURE_TYPE_FORMAT_PROPERTIES_3")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkFormatFeatureFlags2("linearTilingFeatures")
    VkFormatFeatureFlags2("optimalTilingFeatures")
    VkFormatFeatureFlags2("bufferFeatures")
}

val VkPhysicalDeviceMaintenance4Features = struct(Module.VULKAN, "VkPhysicalDeviceMaintenance4Features") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("maintenance4")
}

val VkPhysicalDeviceMaintenance4Properties = struct(Module.VULKAN, "VkPhysicalDeviceMaintenance4Properties", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkDeviceSize("maxBufferSize")
}

val VkDeviceBufferMemoryRequirements = struct(Module.VULKAN, "VkDeviceBufferMemoryRequirements") {
    Expression("#STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBufferCreateInfo.const.p("pCreateInfo")
}

val VkDeviceImageMemoryRequirements = struct(Module.VULKAN, "VkDeviceImageMemoryRequirements") {
    Expression("#STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageCreateInfo.const.p("pCreateInfo")
    VkImageAspectFlagBits("planeAspect")
}

val VkPipelineCreationFeedback = struct(Module.VULKAN, "VkPipelineCreationFeedback", mutable = false) {
    VkPipelineCreationFeedbackFlags("flags")
    uint64_t("duration")
}

val VkPipelineCreationFeedbackCreateInfo = struct(Module.VULKAN, "VkPipelineCreationFeedbackCreateInfo") {
    Expression("#STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineCreationFeedback.p("pPipelineCreationFeedback")
    AutoSize("pPipelineStageCreationFeedbacks", optional = true)..uint32_t("pipelineStageCreationFeedbackCount")
    VkPipelineCreationFeedback.p("pPipelineStageCreationFeedbacks")
}

val VkPhysicalDeviceShaderTerminateInvocationFeatures = struct(Module.VULKAN, "VkPhysicalDeviceShaderTerminateInvocationFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderTerminateInvocation")
}

val VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures = struct(Module.VULKAN, "VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderDemoteToHelperInvocation")
}

val VkPhysicalDevicePipelineCreationCacheControlFeatures = struct(Module.VULKAN, "VkPhysicalDevicePipelineCreationCacheControlFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("pipelineCreationCacheControl")
}

val VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures = struct(Module.VULKAN, "VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderZeroInitializeWorkgroupMemory")
}

val VkPhysicalDeviceImageRobustnessFeatures = struct(Module.VULKAN, "VkPhysicalDeviceImageRobustnessFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("robustImageAccess")
}

val VkPhysicalDeviceSubgroupSizeControlFeatures = struct(Module.VULKAN, "VkPhysicalDeviceSubgroupSizeControlFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("subgroupSizeControl")
    VkBool32("computeFullSubgroups")
}

val VkPhysicalDeviceSubgroupSizeControlProperties = struct(Module.VULKAN, "VkPhysicalDeviceSubgroupSizeControlProperties", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("minSubgroupSize")
    uint32_t("maxSubgroupSize")
    uint32_t("maxComputeWorkgroupSubgroups")
    VkShaderStageFlags("requiredSubgroupSizeStages")
}

val VkPipelineShaderStageRequiredSubgroupSizeCreateInfo = struct(Module.VULKAN, "VkPipelineShaderStageRequiredSubgroupSizeCreateInfo") {
    Expression("#STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("requiredSubgroupSize")
}

val VkPhysicalDeviceInlineUniformBlockFeatures = struct(Module.VULKAN, "VkPhysicalDeviceInlineUniformBlockFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("inlineUniformBlock")
    VkBool32("descriptorBindingInlineUniformBlockUpdateAfterBind")
}

val VkPhysicalDeviceInlineUniformBlockProperties = struct(Module.VULKAN, "VkPhysicalDeviceInlineUniformBlockProperties", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxInlineUniformBlockSize")
    uint32_t("maxPerStageDescriptorInlineUniformBlocks")
    uint32_t("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks")
    uint32_t("maxDescriptorSetInlineUniformBlocks")
    uint32_t("maxDescriptorSetUpdateAfterBindInlineUniformBlocks")
}

val VkWriteDescriptorSetInlineUniformBlock = struct(Module.VULKAN, "VkWriteDescriptorSetInlineUniformBlock") {
    Expression("#STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pData")..uint32_t("dataSize")
    void.const.p("pData")
}

val VkDescriptorPoolInlineUniformBlockCreateInfo = struct(Module.VULKAN, "VkDescriptorPoolInlineUniformBlockCreateInfo") {
    Expression("#STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("maxInlineUniformBlockBindings")
}

val VkPhysicalDeviceShaderIntegerDotProductFeatures = struct(Module.VULKAN, "VkPhysicalDeviceShaderIntegerDotProductFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderIntegerDotProduct")
}

val VkPhysicalDeviceShaderIntegerDotProductProperties = struct(Module.VULKAN, "VkPhysicalDeviceShaderIntegerDotProductProperties", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("integerDotProduct8BitUnsignedAccelerated")
    VkBool32("integerDotProduct8BitSignedAccelerated")
    VkBool32("integerDotProduct8BitMixedSignednessAccelerated")
    VkBool32("integerDotProduct4x8BitPackedUnsignedAccelerated")
    VkBool32("integerDotProduct4x8BitPackedSignedAccelerated")
    VkBool32("integerDotProduct4x8BitPackedMixedSignednessAccelerated")
    VkBool32("integerDotProduct16BitUnsignedAccelerated")
    VkBool32("integerDotProduct16BitSignedAccelerated")
    VkBool32("integerDotProduct16BitMixedSignednessAccelerated")
    VkBool32("integerDotProduct32BitUnsignedAccelerated")
    VkBool32("integerDotProduct32BitSignedAccelerated")
    VkBool32("integerDotProduct32BitMixedSignednessAccelerated")
    VkBool32("integerDotProduct64BitUnsignedAccelerated")
    VkBool32("integerDotProduct64BitSignedAccelerated")
    VkBool32("integerDotProduct64BitMixedSignednessAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating8BitSignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating16BitSignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating32BitSignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating64BitSignedAccelerated")
    VkBool32("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated")
}

val VkPhysicalDeviceTexelBufferAlignmentProperties = struct(Module.VULKAN, "VkPhysicalDeviceTexelBufferAlignmentProperties", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkDeviceSize("storageTexelBufferOffsetAlignmentBytes")
    VkBool32("storageTexelBufferOffsetSingleTexelAlignment")
    VkDeviceSize("uniformTexelBufferOffsetAlignmentBytes")
    VkBool32("uniformTexelBufferOffsetSingleTexelAlignment")
}

val VkImageBlit2 = struct(Module.VULKAN, "VkImageBlit2") {
    Expression("#STRUCTURE_TYPE_IMAGE_BLIT_2")..VkStructureType("sType")
    PointerSetter(
        "VkCopyCommandTransformInfoQCOM",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkImageSubresourceLayers("srcSubresource")
    VkOffset3D("srcOffsets")[2]
    VkImageSubresourceLayers("dstSubresource")
    VkOffset3D("dstOffsets")[2]
}

val VkBlitImageInfo2 = struct(Module.VULKAN, "VkBlitImageInfo2") {
    Expression("#STRUCTURE_TYPE_BLIT_IMAGE_INFO_2")..VkStructureType("sType")
    PointerSetter(
        "VkBlitImageCubicWeightsInfoQCOM",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkImage("srcImage")
    VkImageLayout("srcImageLayout")
    VkImage("dstImage")
    VkImageLayout("dstImageLayout")
    AutoSize("pRegions")..uint32_t("regionCount")
    VkImageBlit2.const.p("pRegions")
    VkFilter("filter")
}

val VkImageResolve2 = struct(Module.VULKAN, "VkImageResolve2") {
    Expression("#STRUCTURE_TYPE_IMAGE_RESOLVE_2")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageSubresourceLayers("srcSubresource")
    VkOffset3D("srcOffset")
    VkImageSubresourceLayers("dstSubresource")
    VkOffset3D("dstOffset")
    VkExtent3D("extent")
}

val VkResolveImageInfo2 = struct(Module.VULKAN, "VkResolveImageInfo2") {
    Expression("#STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2")..VkStructureType("sType")
    PointerSetter(
        "VkResolveImageModeInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkImage("srcImage")
    VkImageLayout("srcImageLayout")
    VkImage("dstImage")
    VkImageLayout("dstImageLayout")
    AutoSize("pRegions")..uint32_t("regionCount")
    VkImageResolve2.const.p("pRegions")
}

val VkRenderingAttachmentInfo = struct(Module.VULKAN, "VkRenderingAttachmentInfo") {
    Expression("#STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkAttachmentFeedbackLoopInfoEXT", "VkRenderingAttachmentFlagsInfoKHR",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkImageView("imageView")
    VkImageLayout("imageLayout")
    VkResolveModeFlagBits("resolveMode")
    VkImageView("resolveImageView")
    VkImageLayout("resolveImageLayout")
    VkAttachmentLoadOp("loadOp")
    VkAttachmentStoreOp("storeOp")
    VkClearValue("clearValue")
}

val VkRenderingInfo = struct(Module.VULKAN, "VkRenderingInfo") {
    Expression("#STRUCTURE_TYPE_RENDERING_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkDeviceGroupRenderPassBeginInfo", "VkDeviceGroupRenderPassBeginInfoKHR", "VkMultisampledRenderToSingleSampledInfoEXT", "VkMultiviewPerViewAttributesInfoNVX", "VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM", "VkRenderPassPerformanceCountersByRegionBeginInfoARM", "VkRenderPassStripeBeginInfoARM", "VkRenderPassTileShadingCreateInfoQCOM", "VkRenderingFragmentDensityMapAttachmentInfoEXT", "VkRenderingFragmentShadingRateAttachmentInfoKHR", "VkTileMemorySizeInfoQCOM",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkRenderingFlags("flags")
    VkRect2D("renderArea")
    uint32_t("layerCount")
    uint32_t("viewMask")
    AutoSize("pColorAttachments", optional = true)..uint32_t("colorAttachmentCount")
    VkRenderingAttachmentInfo.const.p("pColorAttachments")
    nullable..VkRenderingAttachmentInfo.const.p("pDepthAttachment")
    nullable..VkRenderingAttachmentInfo.const.p("pStencilAttachment")
}

val VkPipelineRenderingCreateInfo = struct(Module.VULKAN, "VkPipelineRenderingCreateInfo") {
    Expression("#STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("viewMask")
    AutoSize("pColorAttachmentFormats", optional = true)..uint32_t("colorAttachmentCount")
    nullable..VkFormat.const.p("pColorAttachmentFormats")
    VkFormat("depthAttachmentFormat")
    VkFormat("stencilAttachmentFormat")
}

val VkPhysicalDeviceDynamicRenderingFeatures = struct(Module.VULKAN, "VkPhysicalDeviceDynamicRenderingFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("dynamicRendering")
}

val VkCommandBufferInheritanceRenderingInfo = struct(Module.VULKAN, "VkCommandBufferInheritanceRenderingInfo") {
    Expression("#STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkRenderingFlags("flags")
    uint32_t("viewMask")
    AutoSize("pColorAttachmentFormats", optional = true)..uint32_t("colorAttachmentCount")
    VkFormat.const.p("pColorAttachmentFormats")
    VkFormat("depthAttachmentFormat")
    VkFormat("stencilAttachmentFormat")
    VkSampleCountFlagBits("rasterizationSamples")
}

val VkPhysicalDeviceVulkan14Features = struct(Module.VULKAN, "VkPhysicalDeviceVulkan14Features") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("globalPriorityQuery")
    VkBool32("shaderSubgroupRotate")
    VkBool32("shaderSubgroupRotateClustered")
    VkBool32("shaderFloatControls2")
    VkBool32("shaderExpectAssume")
    VkBool32("rectangularLines")
    VkBool32("bresenhamLines")
    VkBool32("smoothLines")
    VkBool32("stippledRectangularLines")
    VkBool32("stippledBresenhamLines")
    VkBool32("stippledSmoothLines")
    VkBool32("vertexAttributeInstanceRateDivisor")
    VkBool32("vertexAttributeInstanceRateZeroDivisor")
    VkBool32("indexTypeUint8")
    VkBool32("dynamicRenderingLocalRead")
    VkBool32("maintenance5")
    VkBool32("maintenance6")
    VkBool32("pipelineProtectedAccess")
    VkBool32("pipelineRobustness")
    VkBool32("hostImageCopy")
    VkBool32("pushDescriptor")
}

val VkPhysicalDeviceVulkan14Properties = struct(Module.VULKAN, "VkPhysicalDeviceVulkan14Properties", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("lineSubPixelPrecisionBits")
    uint32_t("maxVertexAttribDivisor")
    VkBool32("supportsNonZeroFirstInstance")
    uint32_t("maxPushDescriptors")
    VkBool32("dynamicRenderingLocalReadDepthStencilAttachments")
    VkBool32("dynamicRenderingLocalReadMultisampledAttachments")
    VkBool32("earlyFragmentMultisampleCoverageAfterSampleCounting")
    VkBool32("earlyFragmentSampleMaskTestBeforeSampleCounting")
    VkBool32("depthStencilSwizzleOneSupport")
    VkBool32("polygonModePointSize")
    VkBool32("nonStrictSinglePixelWideLinesUseParallelogram")
    VkBool32("nonStrictWideLinesUseParallelogram")
    VkBool32("blockTexelViewCompatibleMultipleLayers")
    uint32_t("maxCombinedImageSamplerDescriptorCount")
    VkBool32("fragmentShadingRateClampCombinerInputs")
    VkPipelineRobustnessBufferBehavior("defaultRobustnessStorageBuffers")
    VkPipelineRobustnessBufferBehavior("defaultRobustnessUniformBuffers")
    VkPipelineRobustnessBufferBehavior("defaultRobustnessVertexInputs")
    VkPipelineRobustnessImageBehavior("defaultRobustnessImages")
    AutoSize("pCopySrcLayouts", optional = true)..uint32_t("copySrcLayoutCount")
    nullable..VkImageLayout.p("pCopySrcLayouts")
    AutoSize("pCopyDstLayouts", optional = true)..uint32_t("copyDstLayoutCount")
    nullable..VkImageLayout.p("pCopyDstLayouts")
    uint8_t("optimalTilingLayoutUUID")["VK_UUID_SIZE"]
    VkBool32("identicalMemoryTypeRequirements")
}

val VkDeviceQueueGlobalPriorityCreateInfo = struct(Module.VULKAN, "VkDeviceQueueGlobalPriorityCreateInfo") {
    Expression("#STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkQueueGlobalPriority("globalPriority")
}

val VkPhysicalDeviceGlobalPriorityQueryFeatures = struct(Module.VULKAN, "VkPhysicalDeviceGlobalPriorityQueryFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("globalPriorityQuery")
}

val VkQueueFamilyGlobalPriorityProperties = struct(Module.VULKAN, "VkQueueFamilyGlobalPriorityProperties", mutable = false) {
    javaImport("static org.lwjgl.vulkan.VK14.*")
    Expression("#STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    AutoSize("priorities")..uint32_t("priorityCount")
    VkQueueGlobalPriority("priorities")["VK_MAX_GLOBAL_PRIORITY_SIZE"]
}

val VkPhysicalDeviceIndexTypeUint8Features = struct(Module.VULKAN, "VkPhysicalDeviceIndexTypeUint8Features") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("indexTypeUint8")
}

val VkMemoryMapInfo = struct(Module.VULKAN, "VkMemoryMapInfo") {
    Expression("#STRUCTURE_TYPE_MEMORY_MAP_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkMemoryMapPlacedInfoEXT",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkMemoryMapFlags("flags")
    VkDeviceMemory("memory")
    VkDeviceSize("offset")
    VkDeviceSize("size")
}

val VkMemoryUnmapInfo = struct(Module.VULKAN, "VkMemoryUnmapInfo") {
    Expression("#STRUCTURE_TYPE_MEMORY_UNMAP_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkMemoryUnmapFlags("flags")
    VkDeviceMemory("memory")
}

val VkPhysicalDeviceMaintenance5Features = struct(Module.VULKAN, "VkPhysicalDeviceMaintenance5Features") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("maintenance5")
}

val VkPhysicalDeviceMaintenance5Properties = struct(Module.VULKAN, "VkPhysicalDeviceMaintenance5Properties", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("earlyFragmentMultisampleCoverageAfterSampleCounting")
    VkBool32("earlyFragmentSampleMaskTestBeforeSampleCounting")
    VkBool32("depthStencilSwizzleOneSupport")
    VkBool32("polygonModePointSize")
    VkBool32("nonStrictSinglePixelWideLinesUseParallelogram")
    VkBool32("nonStrictWideLinesUseParallelogram")
}

val VkImageSubresource2 = struct(Module.VULKAN, "VkImageSubresource2") {
    Expression("#STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkImageSubresource("imageSubresource")
}

val VkDeviceImageSubresourceInfo = struct(Module.VULKAN, "VkDeviceImageSubresourceInfo") {
    Expression("#STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImageCreateInfo.const.p("pCreateInfo")
    VkImageSubresource2.const.p("pSubresource")
}

val VkSubresourceLayout2 = struct(Module.VULKAN, "VkSubresourceLayout2", mutable = false) {
    Expression("#STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2")..VkStructureType("sType").mutable()
    PointerSetter(
        "VkImageCompressionPropertiesEXT", "VkSubresourceHostMemcpySize", "VkSubresourceHostMemcpySizeEXT",
        prepend = true
    )..nullable..opaque_p("pNext").mutable()
    VkSubresourceLayout("subresourceLayout")
}

val VkBufferUsageFlags2CreateInfo = struct(Module.VULKAN, "VkBufferUsageFlags2CreateInfo") {
    Expression("#STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkBufferUsageFlags2("usage")
}

val VkPhysicalDeviceMaintenance6Features = struct(Module.VULKAN, "VkPhysicalDeviceMaintenance6Features") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("maintenance6")
}

val VkPhysicalDeviceMaintenance6Properties = struct(Module.VULKAN, "VkPhysicalDeviceMaintenance6Properties", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("blockTexelViewCompatibleMultipleLayers")
    uint32_t("maxCombinedImageSamplerDescriptorCount")
    VkBool32("fragmentShadingRateClampCombinerInputs")
}

val VkBindMemoryStatus = struct(Module.VULKAN, "VkBindMemoryStatus") {
    Expression("#STRUCTURE_TYPE_BIND_MEMORY_STATUS")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkResult.p("pResult")
}

val VkPhysicalDeviceHostImageCopyFeatures = struct(Module.VULKAN, "VkPhysicalDeviceHostImageCopyFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("hostImageCopy")
}

val VkPhysicalDeviceHostImageCopyProperties = struct(Module.VULKAN, "VkPhysicalDeviceHostImageCopyProperties") {
    javaImport("static org.lwjgl.vulkan.VK10.*")
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    AutoSize("pCopySrcLayouts", optional = true)..uint32_t("copySrcLayoutCount")
    nullable..VkImageLayout.p("pCopySrcLayouts")
    AutoSize("pCopyDstLayouts", optional = true)..uint32_t("copyDstLayoutCount")
    nullable..VkImageLayout.p("pCopyDstLayouts")
    uint8_t("optimalTilingLayoutUUID")["VK_UUID_SIZE"]
    VkBool32("identicalMemoryTypeRequirements")
}

val VkMemoryToImageCopy = struct(Module.VULKAN, "VkMemoryToImageCopy") {
    Expression("#STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    opaque_const_p("pHostPointer")
    uint32_t("memoryRowLength")
    uint32_t("memoryImageHeight")
    VkImageSubresourceLayers("imageSubresource")
    VkOffset3D("imageOffset")
    VkExtent3D("imageExtent")
}

val VkImageToMemoryCopy = struct(Module.VULKAN, "VkImageToMemoryCopy") {
    Expression("#STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    opaque_p("pHostPointer")
    uint32_t("memoryRowLength")
    uint32_t("memoryImageHeight")
    VkImageSubresourceLayers("imageSubresource")
    VkOffset3D("imageOffset")
    VkExtent3D("imageExtent")
}

val VkCopyMemoryToImageInfo = struct(Module.VULKAN, "VkCopyMemoryToImageInfo") {
    Expression("#STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkHostImageCopyFlags("flags")
    VkImage("dstImage")
    VkImageLayout("dstImageLayout")
    AutoSize("pRegions")..uint32_t("regionCount")
    VkMemoryToImageCopy.const.p("pRegions")
}

val VkCopyImageToMemoryInfo = struct(Module.VULKAN, "VkCopyImageToMemoryInfo") {
    Expression("#STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkHostImageCopyFlags("flags")
    VkImage("srcImage")
    VkImageLayout("srcImageLayout")
    AutoSize("pRegions")..uint32_t("regionCount")
    VkImageToMemoryCopy.const.p("pRegions")
}

val VkCopyImageToImageInfo = struct(Module.VULKAN, "VkCopyImageToImageInfo") {
    Expression("#STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkHostImageCopyFlags("flags")
    VkImage("srcImage")
    VkImageLayout("srcImageLayout")
    VkImage("dstImage")
    VkImageLayout("dstImageLayout")
    AutoSize("pRegions")..uint32_t("regionCount")
    VkImageCopy2.const.p("pRegions")
}

val VkHostImageLayoutTransitionInfo = struct(Module.VULKAN, "VkHostImageLayoutTransitionInfo") {
    Expression("#STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkImage("image")
    VkImageLayout("oldLayout")
    VkImageLayout("newLayout")
    VkImageSubresourceRange("subresourceRange")
}

val VkSubresourceHostMemcpySize = struct(Module.VULKAN, "VkSubresourceHostMemcpySize", mutable = false) {
    Expression("#STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkDeviceSize("size")
}

val VkHostImageCopyDevicePerformanceQuery = struct(Module.VULKAN, "VkHostImageCopyDevicePerformanceQuery", mutable = false) {
    Expression("#STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkBool32("optimalDeviceAccess")
    VkBool32("identicalMemoryLayout")
}

val VkPhysicalDeviceShaderSubgroupRotateFeatures = struct(Module.VULKAN, "VkPhysicalDeviceShaderSubgroupRotateFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderSubgroupRotate")
    VkBool32("shaderSubgroupRotateClustered")
}

val VkPhysicalDeviceShaderFloatControls2Features = struct(Module.VULKAN, "VkPhysicalDeviceShaderFloatControls2Features") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT_CONTROLS_2_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderFloatControls2")
}

val VkPhysicalDeviceShaderExpectAssumeFeatures = struct(Module.VULKAN, "VkPhysicalDeviceShaderExpectAssumeFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("shaderExpectAssume")
}

val VkPipelineCreateFlags2CreateInfo = struct(Module.VULKAN, "VkPipelineCreateFlags2CreateInfo") {
    Expression("#STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineCreateFlags2("flags")
}

val VkPhysicalDevicePushDescriptorProperties = struct(Module.VULKAN, "VkPhysicalDevicePushDescriptorProperties", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxPushDescriptors")
}

val VkBindDescriptorSetsInfo = struct(Module.VULKAN, "VkBindDescriptorSetsInfo") {
    Expression("#STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkPipelineLayoutCreateInfo",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkShaderStageFlags("stageFlags")
    VkPipelineLayout("layout")
    uint32_t("firstSet")
    AutoSize("pDescriptorSets")..uint32_t("descriptorSetCount")
    VkDescriptorSet.const.p("pDescriptorSets")
    AutoSize("pDynamicOffsets", optional = true)..uint32_t("dynamicOffsetCount")
    nullable..uint32_t.const.p("pDynamicOffsets")
}

val VkPushConstantsInfo = struct(Module.VULKAN, "VkPushConstantsInfo") {
    Expression("#STRUCTURE_TYPE_PUSH_CONSTANTS_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkPipelineLayoutCreateInfo", "VkPushConstantBankInfoNV",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkPipelineLayout("layout")
    VkShaderStageFlags("stageFlags")
    uint32_t("offset")
    AutoSize("pValues")..uint32_t("size")
    void.const.p("pValues")
}

val VkPushDescriptorSetInfo = struct(Module.VULKAN, "VkPushDescriptorSetInfo") {
    Expression("#STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkPipelineLayoutCreateInfo",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkShaderStageFlags("stageFlags")
    VkPipelineLayout("layout")
    uint32_t("set")
    AutoSize("pDescriptorWrites")..uint32_t("descriptorWriteCount")
    VkWriteDescriptorSet.const.p("pDescriptorWrites")
}

val VkPushDescriptorSetWithTemplateInfo = struct(Module.VULKAN, "VkPushDescriptorSetWithTemplateInfo") {
    Expression("#STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO")..VkStructureType("sType")
    PointerSetter(
        "VkPipelineLayoutCreateInfo",
        prepend = true
    )..nullable..opaque_const_p("pNext")
    VkDescriptorUpdateTemplate("descriptorUpdateTemplate")
    VkPipelineLayout("layout")
    uint32_t("set")
    opaque_const_p("pData")
}

val VkPhysicalDevicePipelineProtectedAccessFeatures = struct(Module.VULKAN, "VkPhysicalDevicePipelineProtectedAccessFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("pipelineProtectedAccess")
}

val VkPhysicalDevicePipelineRobustnessFeatures = struct(Module.VULKAN, "VkPhysicalDevicePipelineRobustnessFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("pipelineRobustness")
}

val VkPhysicalDevicePipelineRobustnessProperties = struct(Module.VULKAN, "VkPhysicalDevicePipelineRobustnessProperties", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    VkPipelineRobustnessBufferBehavior("defaultRobustnessStorageBuffers")
    VkPipelineRobustnessBufferBehavior("defaultRobustnessUniformBuffers")
    VkPipelineRobustnessBufferBehavior("defaultRobustnessVertexInputs")
    VkPipelineRobustnessImageBehavior("defaultRobustnessImages")
}

val VkPipelineRobustnessCreateInfo = struct(Module.VULKAN, "VkPipelineRobustnessCreateInfo") {
    Expression("#STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkPipelineRobustnessBufferBehavior("storageBuffers")
    VkPipelineRobustnessBufferBehavior("uniformBuffers")
    VkPipelineRobustnessBufferBehavior("vertexInputs")
    VkPipelineRobustnessImageBehavior("images")
}

val VkPhysicalDeviceLineRasterizationFeatures = struct(Module.VULKAN, "VkPhysicalDeviceLineRasterizationFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("rectangularLines")
    VkBool32("bresenhamLines")
    VkBool32("smoothLines")
    VkBool32("stippledRectangularLines")
    VkBool32("stippledBresenhamLines")
    VkBool32("stippledSmoothLines")
}

val VkPhysicalDeviceLineRasterizationProperties = struct(Module.VULKAN, "VkPhysicalDeviceLineRasterizationProperties", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("lineSubPixelPrecisionBits")
}

val VkPipelineRasterizationLineStateCreateInfo = struct(Module.VULKAN, "VkPipelineRasterizationLineStateCreateInfo") {
    Expression("#STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    VkLineRasterizationMode("lineRasterizationMode")
    VkBool32("stippledLineEnable")
    uint32_t("lineStippleFactor")
    uint16_t("lineStipplePattern")
}

val VkPhysicalDeviceVertexAttributeDivisorProperties = struct(Module.VULKAN, "VkPhysicalDeviceVertexAttributeDivisorProperties", mutable = false) {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES")..VkStructureType("sType").mutable()
    nullable..opaque_p("pNext").mutable()
    uint32_t("maxVertexAttribDivisor")
    VkBool32("supportsNonZeroFirstInstance")
}

val VkVertexInputBindingDivisorDescription = struct(Module.VULKAN, "VkVertexInputBindingDivisorDescription") {
    uint32_t("binding")
    uint32_t("divisor")
}

val VkPipelineVertexInputDivisorStateCreateInfo = struct(Module.VULKAN, "VkPipelineVertexInputDivisorStateCreateInfo") {
    Expression("#STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pVertexBindingDivisors")..uint32_t("vertexBindingDivisorCount")
    VkVertexInputBindingDivisorDescription.const.p("pVertexBindingDivisors")
}

val VkPhysicalDeviceVertexAttributeDivisorFeatures = struct(Module.VULKAN, "VkPhysicalDeviceVertexAttributeDivisorFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("vertexAttributeInstanceRateDivisor")
    VkBool32("vertexAttributeInstanceRateZeroDivisor")
}

val VkRenderingAreaInfo = struct(Module.VULKAN, "VkRenderingAreaInfo") {
    Expression("#STRUCTURE_TYPE_RENDERING_AREA_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    uint32_t("viewMask")
    AutoSize("pColorAttachmentFormats", optional = true)..uint32_t("colorAttachmentCount")
    nullable..VkFormat.const.p("pColorAttachmentFormats")
    VkFormat("depthAttachmentFormat")
    VkFormat("stencilAttachmentFormat")
}

val VkPhysicalDeviceDynamicRenderingLocalReadFeatures = struct(Module.VULKAN, "VkPhysicalDeviceDynamicRenderingLocalReadFeatures") {
    Expression("#STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES")..VkStructureType("sType")
    nullable..opaque_p("pNext")
    VkBool32("dynamicRenderingLocalRead")
}

val VkRenderingAttachmentLocationInfo = struct(Module.VULKAN, "VkRenderingAttachmentLocationInfo") {
    Expression("#STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pColorAttachmentLocations", optional = true)..uint32_t("colorAttachmentCount")
    nullable..uint32_t.const.p("pColorAttachmentLocations")
}

val VkRenderingInputAttachmentIndexInfo = struct(Module.VULKAN, "VkRenderingInputAttachmentIndexInfo") {
    Expression("#STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO")..VkStructureType("sType")
    nullable..opaque_const_p("pNext")
    AutoSize("pColorAttachmentInputIndices", optional = true)..uint32_t("colorAttachmentCount")
    nullable..uint32_t.const.p("pColorAttachmentInputIndices")
    nullable..uint32_t.const.p("pDepthInputAttachmentIndex")
    nullable..uint32_t.const.p("pStencilInputAttachmentIndex")
}