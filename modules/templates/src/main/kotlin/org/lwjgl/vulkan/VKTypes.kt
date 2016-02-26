/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan

import org.lwjgl.generator.*

val VULKAN_PACKAGE = "org.lwjgl.vulkan"

fun config() {
	packageInfo(
		VULKAN_PACKAGE,
		"""
		Contains bindings to <a href="https://www.khronos.org/vulkan">Vulkan</a>, a new generation graphics and compute API that provides high-efficiency,
		cross-platform access to modern GPUs used in a wide variety of devices from PCs and consoles to mobile phones and embedded platforms.
		"""
	)
}

val VkFlags = typedef(uint32_t, "VkFlags")
val VkBool32 = typedef(uint32_t, "VkBool32")
val VkBool32_p = VkBool32.p
val VkDeviceSize = typedef(uint64_t, "VkDeviceSize")
val VkDeviceSize_p = VkDeviceSize.p
val VkSampleMask = typedef(uint32_t, "VkSampleMask")

val PFN_vkVoidFunction = "PFN_vkVoidFunction".opaque_p

fun VK_DEFINE_HANDLE(name: String) = ObjectType(name)
fun VK_DEFINE_NON_DISPATCHABLE_HANDLE(name: String) = typedef(uint64_t, name)

val VkInstance = VK_DEFINE_HANDLE("VkInstance")
val VkPhysicalDevice = VK_DEFINE_HANDLE("VkPhysicalDevice")
val VkDevice = VK_DEFINE_HANDLE("VkDevice")
val VkQueue = VK_DEFINE_HANDLE("VkQueue")
val VkSemaphore = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkSemaphore")
val VkCommandBuffer = VK_DEFINE_HANDLE("VkCommandBuffer")
val VkFence = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkFence")
val VkDeviceMemory = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDeviceMemory")
val VkBuffer = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkBuffer")
val VkImage = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkImage")
val VkEvent = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkEvent")
val VkQueryPool = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkQueryPool")
val VkBufferView = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkBufferView")
val VkImageView = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkImageView")
val VkShaderModule = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkShaderModule")
val VkPipelineCache = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkPipelineCache")
val VkPipelineLayout = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkPipelineLayout")
val VkRenderPass = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkRenderPass")
val VkPipeline = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkPipeline")
val VkDescriptorSetLayout = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDescriptorSetLayout")
val VkSampler = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkSampler")
val VkDescriptorPool = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDescriptorPool")
val VkDescriptorSet = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkDescriptorSet")
val VkFramebuffer = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkFramebuffer")
val VkCommandPool = VK_DEFINE_NON_DISPATCHABLE_HANDLE("VkCommandPool")

// enum types
val VkResult = "VkResult".enumType
val VkStructureType = "VkStructureType".enumType
val VkSystemAllocationScope = "VkSystemAllocationScope".enumType
val VkInternalAllocationType = "VkInternalAllocationType".enumType
val VkFormat = "VkFormat".enumType
val VkImageType = "VkImageType".enumType
val VkImageTiling = "VkImageTiling".enumType
val VkPhysicalDeviceType = "VkPhysicalDeviceType".enumType
val VkSampleCountFlagBits = "VkSampleCountFlagBits".enumType
val VkQueryType = "VkQueryType".enumType
val VkSharingMode = "VkSharingMode".enumType
val VkImageLayout = "VkImageLayout".enumType
val VkImageViewType = "VkImageViewType".enumType
val VkComponentSwizzle = "VkComponentSwizzle".enumType
val VkShaderStageFlagBits = "VkShaderStageFlagBits".enumType
val VkVertexInputRate = "VkVertexInputRate".enumType
val VkPrimitiveTopology = "VkPrimitiveTopology".enumType
val VkPolygonMode = "VkPolygonMode".enumType
val VkFrontFace = "VkFrontFace".enumType
val VkStencilOp = "VkStencilOp".enumType
val VkCompareOp = "VkCompareOp".enumType
val VkLogicOp = "VkLogicOp".enumType
val VkBlendFactor = "VkBlendFactor".enumType
val VkBlendOp = "VkBlendOp".enumType
val VkDynamicState = "VkDynamicState".enumType
val VkFilter = "VkFilter".enumType
val VkSamplerMipmapMode = "VkSamplerMipmapMode".enumType
val VkSamplerAddressMode = "VkSamplerAddressMode".enumType
val VkBorderColor = "VkBorderColor".enumType
val VkDescriptorType = "VkDescriptorType".enumType
val VkAttachmentLoadOp = "VkAttachmentLoadOp".enumType
val VkAttachmentStoreOp = "VkAttachmentStoreOp".enumType
val VkPipelineBindPoint = "VkPipelineBindPoint".enumType
val VkCommandBufferLevel = "VkCommandBufferLevel".enumType
val VkIndexType = "VkIndexType".enumType
val VkPipelineStageFlagBits = "VkPipelineStageFlagBits".enumType
val VkSubpassContents = "VkSubpassContents".enumType

// flag types
val VkInstanceCreateFlags = typedef(VkFlags, "VkInstanceCreateFlags")
val VkFormatFeatureFlags = typedef(VkFlags, "VkFormatFeatureFlags")
val VkImageUsageFlags = typedef(VkFlags, "VkImageUsageFlags")
val VkImageCreateFlags = typedef(VkFlags, "VkImageCreateFlags")
val VkSampleCountFlags = typedef(VkFlags, "VkSampleCountFlags")
val VkQueueFlags = typedef(VkFlags, "VkQueueFlags")
val VkMemoryPropertyFlags = typedef(VkFlags, "VkMemoryPropertyFlags")
val VkMemoryHeapFlags = typedef(VkFlags, "VkMemoryHeapFlags")
val VkDeviceCreateFlags = typedef(VkFlags, "VkDeviceCreateFlags")
val VkDeviceQueueCreateFlags = typedef(VkFlags, "VkDeviceQueueCreateFlags")
val VkPipelineStageFlags = typedef(VkFlags, "VkPipelineStageFlags")
val VkMemoryMapFlags = typedef(VkFlags, "VkMemoryMapFlags")
val VkImageAspectFlags = typedef(VkFlags, "VkImageAspectFlags")
val VkSparseImageFormatFlags = typedef(VkFlags, "VkSparseImageFormatFlags")
val VkSparseMemoryBindFlags = typedef(VkFlags, "VkSparseMemoryBindFlags")
val VkFenceCreateFlags = typedef(VkFlags, "VkFenceCreateFlags")
val VkSemaphoreCreateFlags = typedef(VkFlags, "VkSemaphoreCreateFlags")
val VkEventCreateFlags = typedef(VkFlags, "VkEventCreateFlags")
val VkQueryPoolCreateFlags = typedef(VkFlags, "VkQueryPoolCreateFlags")
val VkQueryPipelineStatisticFlags = typedef(VkFlags, "VkQueryPipelineStatisticFlags")
val VkQueryResultFlags = typedef(VkFlags, "VkQueryResultFlags")
val VkBufferCreateFlags = typedef(VkFlags, "VkBufferCreateFlags")
val VkBufferUsageFlags = typedef(VkFlags, "VkBufferUsageFlags")
val VkBufferViewCreateFlags = typedef(VkFlags, "VkBufferViewCreateFlags")
val VkImageViewCreateFlags = typedef(VkFlags, "VkImageViewCreateFlags")
val VkShaderModuleCreateFlags = typedef(VkFlags, "VkShaderModuleCreateFlags")
val VkPipelineCacheCreateFlags = typedef(VkFlags, "VkPipelineCacheCreateFlags")
val VkPipelineCreateFlags = typedef(VkFlags, "VkPipelineCreateFlags")
val VkPipelineShaderStageCreateFlags = typedef(VkFlags, "VkPipelineShaderStageCreateFlags")
val VkPipelineVertexInputStateCreateFlags = typedef(VkFlags, "VkPipelineVertexInputStateCreateFlags")
val VkPipelineInputAssemblyStateCreateFlags = typedef(VkFlags, "VkPipelineInputAssemblyStateCreateFlags")
val VkPipelineTessellationStateCreateFlags = typedef(VkFlags, "VkPipelineTessellationStateCreateFlags")
val VkPipelineViewportStateCreateFlags = typedef(VkFlags, "VkPipelineViewportStateCreateFlags")
val VkPipelineRasterizationStateCreateFlags = typedef(VkFlags, "VkPipelineRasterizationStateCreateFlags")
val VkCullModeFlags = typedef(VkFlags, "VkCullModeFlags")
val VkPipelineMultisampleStateCreateFlags = typedef(VkFlags, "VkPipelineMultisampleStateCreateFlags")
val VkPipelineDepthStencilStateCreateFlags = typedef(VkFlags, "VkPipelineDepthStencilStateCreateFlags")
val VkPipelineColorBlendStateCreateFlags = typedef(VkFlags, "VkPipelineColorBlendStateCreateFlags")
val VkColorComponentFlags = typedef(VkFlags, "VkColorComponentFlags")
val VkPipelineDynamicStateCreateFlags = typedef(VkFlags, "VkPipelineDynamicStateCreateFlags")
val VkPipelineLayoutCreateFlags = typedef(VkFlags, "VkPipelineLayoutCreateFlags")
val VkShaderStageFlags = typedef(VkFlags, "VkShaderStageFlags")
val VkSamplerCreateFlags = typedef(VkFlags, "VkSamplerCreateFlags")
val VkDescriptorSetLayoutCreateFlags = typedef(VkFlags, "VkDescriptorSetLayoutCreateFlags")
val VkDescriptorPoolCreateFlags = typedef(VkFlags, "VkDescriptorPoolCreateFlags")
val VkDescriptorPoolResetFlags = typedef(VkFlags, "VkDescriptorPoolResetFlags")
val VkFramebufferCreateFlags = typedef(VkFlags, "VkFramebufferCreateFlags")
val VkRenderPassCreateFlags = typedef(VkFlags, "VkRenderPassCreateFlags")
val VkAttachmentDescriptionFlags = typedef(VkFlags, "VkAttachmentDescriptionFlags")
val VkSubpassDescriptionFlags = typedef(VkFlags, "VkSubpassDescriptionFlags")
val VkAccessFlags = typedef(VkFlags, "VkAccessFlags")
val VkDependencyFlags = typedef(VkFlags, "VkDependencyFlags")
val VkCommandPoolCreateFlags = typedef(VkFlags, "VkCommandPoolCreateFlags")
val VkCommandPoolResetFlags = typedef(VkFlags, "VkCommandPoolResetFlags")
val VkCommandBufferUsageFlags = typedef(VkFlags, "VkCommandBufferUsageFlags")
val VkQueryControlFlags = typedef(VkFlags, "VkQueryControlFlags")
val VkCommandBufferResetFlags = typedef(VkFlags, "VkCommandBufferResetFlags")
val VkStencilFaceFlags = typedef(VkFlags, "VkStencilFaceFlags")

// ----
val const_void_p = PointerType("const void", PointerMapping.DATA)
val const_charUTF8_p = charUTF8.const_p
val const_charUTF8_const_p = const_charUTF8_p.p_const_p
// ----

internal fun Struct.pNext() = nullable.."const void".p.member("pNext", "reserved for use by extensions")

val VkApplicationInfo = struct(VULKAN_PACKAGE, "VkApplicationInfo") {
	documentation =
		"""
		Contains information about the application.

		<h3>Valid Usage</h3>
		${ul(
			"{@code sType} $must be VK10#VK_STRUCTURE_TYPE_APPLICATION_INFO",
			"{@code pNext} $must be $NULL",
			"If {@code pApplicationName} is not $NULL, {@code pApplicationName} $must be a null-terminated string",
			"If {@code pEngineName} is not $NULL, {@code pEngineName} $must be a null-terminated string",
			"{@code apiVersion} $must be zero, or otherwise it $must be a version that the implementation supports, or supports an effective substitute for"
		)}

		"""

	VkStructureType.member("sType", "should be set to VK10#VK_STRUCTURE_TYPE_APPLICATION_INFO")
	pNext()
	nullable..const_charUTF8_p.member("pApplicationName", "a pointer to a $NULL-terminated UTF-8 string containing the name of the application")
	uint32_t.member(
		"applicationVersion",
		"""
		contains an application-specific version number. It is recommended that new versions of an existing application specify monotonically increasing values
		for {@code applicationVersion}.
		"""
	)
	nullable..const_charUTF8_p.member(
		"pEngineName",
		"""
		if the application is built on a reusable engine, the name of the engine may be specified in the $NULL-terminated UTF-8 string pointed to by
		{@code pEngineName}
		"""
	)
	uint32_t.member("engineVersion", "the version of the engine used to create the application")
	uint32_t.member("apiVersion", "the version of the Vulkan API that the application expects to use")
}.nativeType
val const_VkApplicationInfo_p = VkApplicationInfo.const_p

val VkInstanceCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkInstanceCreateInfo") {
	documentation =
		"""
		Contains information about how a {@code VkInstance} should be created.

		<h3>Valid Usage</h3>
		${ul(
			"{@code sType} $must be VK10#VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"If {@code pApplicationInfo} is not $NULL, {@code pApplicationInfo} $must be a pointer to a valid ##VkApplicationInfo structure",
			"""
			If {@code enabledLayerCount} is not 0, {@code ppEnabledLayerNames} $must be a pointer to an array of {@code enabledLayerCount} null-terminated
			strings
			""",
			"""
			If {@code enabledExtensionCount} is not 0, {@code ppEnabledExtensionNames} $must be a pointer to an array of {@code enabledExtensionCount}
			null-terminated strings
			""",
			"""
			Any given element of {@code ppEnabledLayerNames} $must be the name of a layer present on the system, exactly matching a string returned in the
			##VkLayerProperties structure by VK10#vkEnumerateInstanceLayerProperties()
			""",
			"""
			Any given element of {@code ppEnabledExtensionNames} $must be the name of an extension present on the system, exactly matching a string returned in
			the ##VkExtensionProperties structure by VK10#vkEnumerateInstanceExtensionProperties()
			""",
			"""
			If an extension listed in {@code ppEnabledExtensionNames} is provided as part of a layer, then both the layer and extension $must be enabled to
			enable that extension
			"""
		)}
		"""

	VkStructureType.member("sType", "the type of this structure")
	pNext()
	VkInstanceCreateFlags.member("flags", "reserved for future use")
	nullable..const_VkApplicationInfo_p.member("pApplicationInfo", "a pointer to an instance of ##VkApplicationInfo")
	AutoSize("ppEnabledLayerNames")..uint32_t.member("enabledLayerCount", "the number of global layers to enable")
	nullable..const_charUTF8_const_p.member(
		"ppEnabledLayerNames",
		"a pointer to an array of {@code enabledLayerCount} null-terminated UTF-8 strings containing the names of layers to enable"
	)
	AutoSize("ppEnabledExtensionNames")..uint32_t.member("enabledExtensionCount", "the number of global extensions to enable")
	nullable..const_charUTF8_const_p.member(
		"ppEnabledExtensionNames",
		"a pointer to an array of {@code enabledExtensionCount} null-terminated UTF-8 strings containing the names of extensions to enable"
	)
}

val PFN_vkAllocationFunction = "PFN_vkAllocationFunction".callback(
	VULKAN_PACKAGE, void_p, "VkAllocationFunction",
	"",

	voidptr.IN("pUserData", ""),
	size_t.IN("size", ""),
	size_t.IN("alignment", ""),
	VkSystemAllocationScope.IN("allocationScope", "")
) {
	documentation = ""
	useSystemCallConvention()
}

val PFN_vkReallocationFunction = "PFN_vkReallocationFunction".callback(
	VULKAN_PACKAGE, void_p, "VkReallocationFunction",
	"",

	voidptr.IN("pUserData", ""),
	voidptr.IN("pOriginal", ""),
	size_t.IN("size", ""),
	size_t.IN("alignment", ""),
	VkSystemAllocationScope.IN("allocationScope", "")
) {
	documentation = ""
	useSystemCallConvention()
}

val PFN_vkFreeFunction = "PFN_vkFreeFunction".callback(
	VULKAN_PACKAGE, void, "VkFreeFunction",
	"",

	voidptr.IN("pUserData", ""),
	voidptr.IN("pMemory", "")
) {
	documentation = ""
	useSystemCallConvention()
}

val PFN_vkInternalAllocationNotification = "PFN_vkInternalAllocationNotification".callback(
	VULKAN_PACKAGE, void, "VkInternalAllocationNotification",
	"",

	voidptr.IN("pUserData", ""),
	size_t.IN("size", ""),
	VkInternalAllocationType.IN("allocationType", ""),
	VkSystemAllocationScope.IN("allocationScope", "")
) {
	documentation = ""
	useSystemCallConvention()
}

val PFN_vkInternalFreeNotification = "PFN_vkInternalFreeNotification".callback(
	VULKAN_PACKAGE, void, "VkInternalFreeNotification",
	"",

	voidptr.IN("pUserData", ""),
	size_t.IN("size", ""),
	VkInternalAllocationType.IN("allocationType", ""),
	VkSystemAllocationScope.IN("allocationScope", "")
) {
	documentation = ""
	useSystemCallConvention()
}

val VkAllocationCallbacks_p = struct_p(VULKAN_PACKAGE, "VkAllocationCallbacks") {
	documentation = ""

	nullable..voidptr.member("pUserData", "")
	PFN_vkAllocationFunction.member("pfnAllocation", "")
	PFN_vkReallocationFunction.member("pfnReallocation", "")
	PFN_vkFreeFunction.member("pfnFree", "")
	nullable..PFN_vkInternalAllocationNotification.member("pfnInternalAllocation", "")
	nullable..PFN_vkInternalFreeNotification.member("pfnInternalFree", "")
}

val VkPhysicalDeviceFeatures = struct(VULKAN_PACKAGE, "VkPhysicalDeviceFeatures") {
	documentation = ""

	VkBool32.member("robustBufferAccess", "")
	VkBool32.member("fullDrawIndexUint32", "")
	VkBool32.member("imageCubeArray", "")
	VkBool32.member("independentBlend", "")
	VkBool32.member("geometryShader", "")
	VkBool32.member("tessellationShader", "")
	VkBool32.member("sampleRateShading", "")
	VkBool32.member("dualSrcBlend", "")
	VkBool32.member("logicOp", "")
	VkBool32.member("multiDrawIndirect", "")
	VkBool32.member("drawIndirectFirstInstance", "")
	VkBool32.member("depthClamp", "")
	VkBool32.member("depthBiasClamp", "")
	VkBool32.member("fillModeNonSolid", "")
	VkBool32.member("depthBounds", "")
	VkBool32.member("wideLines", "")
	VkBool32.member("largePoints", "")
	VkBool32.member("alphaToOne", "")
	VkBool32.member("multiViewport", "")
	VkBool32.member("samplerAnisotropy", "")
	VkBool32.member("textureCompressionETC2", "")
	VkBool32.member("textureCompressionASTC_LDR", "")
	VkBool32.member("textureCompressionBC", "")
	VkBool32.member("occlusionQueryPrecise", "")
	VkBool32.member("pipelineStatisticsQuery", "")
	VkBool32.member("vertexPipelineStoresAndAtomics", "")
	VkBool32.member("fragmentStoresAndAtomics", "")
	VkBool32.member("shaderTessellationAndGeometryPointSize", "")
	VkBool32.member("shaderImageGatherExtended", "")
	VkBool32.member("shaderStorageImageExtendedFormats", "")
	VkBool32.member("shaderStorageImageMultisample", "")
	VkBool32.member("shaderStorageImageReadWithoutFormat", "")
	VkBool32.member("shaderStorageImageWriteWithoutFormat", "")
	VkBool32.member("shaderUniformBufferArrayDynamicIndexing", "")
	VkBool32.member("shaderSampledImageArrayDynamicIndexing", "")
	VkBool32.member("shaderStorageBufferArrayDynamicIndexing", "")
	VkBool32.member("shaderStorageImageArrayDynamicIndexing", "")
	VkBool32.member("shaderClipDistance", "")
	VkBool32.member("shaderCullDistance", "")
	VkBool32.member("shaderFloat64", "")
	VkBool32.member("shaderInt64", "")
	VkBool32.member("shaderInt16", "")
	VkBool32.member("shaderResourceResidency", "")
	VkBool32.member("shaderResourceMinLod", "")
	VkBool32.member("sparseBinding", "")
	VkBool32.member("sparseResidencyBuffer", "")
	VkBool32.member("sparseResidencyImage2D", "")
	VkBool32.member("sparseResidencyImage3D", "")
	VkBool32.member("sparseResidency2Samples", "")
	VkBool32.member("sparseResidency4Samples", "")
	VkBool32.member("sparseResidency8Samples", "")
	VkBool32.member("sparseResidency16Samples", "")
	VkBool32.member("sparseResidencyAliased", "")
	VkBool32.member("variableMultisampleRate", "")
	VkBool32.member("inheritedQueries", "")
}.nativeType

val VkPhysicalDeviceFeatures_p = VkPhysicalDeviceFeatures.p
val const_VkPhysicalDeviceFeatures_p = VkPhysicalDeviceFeatures.const_p

val VkFormatProperties_p = struct_p(VULKAN_PACKAGE, "VkFormatProperties", mutable = false) {
	documentation = ""

	VkFormatFeatureFlags.member("linearTilingFeatures", "")
	VkFormatFeatureFlags.member("optimalTilingFeatures", "")
	VkFormatFeatureFlags.member("bufferFeatures", "")
}

val VkExtent3D = struct(VULKAN_PACKAGE, "VkExtent3D") {
	documentation = ""

	uint32_t.member("width", "")
	uint32_t.member("height", "")
	uint32_t.member("depth", "")
}.nativeType

val VkImageFormatProperties_p = struct_p(VULKAN_PACKAGE, "VkImageFormatProperties", mutable = false) {
	documentation = ""

	VkExtent3D.member("maxExtent", "")
	uint32_t.member("maxMipLevels", "")
	uint32_t.member("maxArrayLayers", "")
	VkSampleCountFlags.member("sampleCounts", "")
	VkDeviceSize.member("maxResourceSize", "")
}

val VkPhysicalDeviceLimits = struct(VULKAN_PACKAGE, "VkPhysicalDeviceLimits", mutable = false) {
	documentation = ""

	uint32_t.member("maxImageDimension1D", "")
	uint32_t.member("maxImageDimension2D", "")
	uint32_t.member("maxImageDimension3D", "")
	uint32_t.member("maxImageDimensionCube", "")
	uint32_t.member("maxImageArrayLayers", "")
	uint32_t.member("maxTexelBufferElements", "")
	uint32_t.member("maxUniformBufferRange", "")
	uint32_t.member("maxStorageBufferRange", "")
	uint32_t.member("maxPushConstantsSize", "")
	uint32_t.member("maxMemoryAllocationCount", "")
	uint32_t.member("maxSamplerAllocationCount", "")
	VkDeviceSize.member("bufferImageGranularity", "")
	VkDeviceSize.member("sparseAddressSpaceSize", "")
	uint32_t.member("maxBoundDescriptorSets", "")
	uint32_t.member("maxPerStageDescriptorSamplers", "")
	uint32_t.member("maxPerStageDescriptorUniformBuffers", "")
	uint32_t.member("maxPerStageDescriptorStorageBuffers", "")
	uint32_t.member("maxPerStageDescriptorSampledImages", "")
	uint32_t.member("maxPerStageDescriptorStorageImages", "")
	uint32_t.member("maxPerStageDescriptorInputAttachments", "")
	uint32_t.member("maxPerStageResources", "")
	uint32_t.member("maxDescriptorSetSamplers", "")
	uint32_t.member("maxDescriptorSetUniformBuffers", "")
	uint32_t.member("maxDescriptorSetUniformBuffersDynamic", "")
	uint32_t.member("maxDescriptorSetStorageBuffers", "")
	uint32_t.member("maxDescriptorSetStorageBuffersDynamic", "")
	uint32_t.member("maxDescriptorSetSampledImages", "")
	uint32_t.member("maxDescriptorSetStorageImages", "")
	uint32_t.member("maxDescriptorSetInputAttachments", "")
	uint32_t.member("maxVertexInputAttributes", "")
	uint32_t.member("maxVertexInputBindings", "")
	uint32_t.member("maxVertexInputAttributeOffset", "")
	uint32_t.member("maxVertexInputBindingStride", "")
	uint32_t.member("maxVertexOutputComponents", "")
	uint32_t.member("maxTessellationGenerationLevel", "")
	uint32_t.member("maxTessellationPatchSize", "")
	uint32_t.member("maxTessellationControlPerVertexInputComponents", "")
	uint32_t.member("maxTessellationControlPerVertexOutputComponents", "")
	uint32_t.member("maxTessellationControlPerPatchOutputComponents", "")
	uint32_t.member("maxTessellationControlTotalOutputComponents", "")
	uint32_t.member("maxTessellationEvaluationInputComponents", "")
	uint32_t.member("maxTessellationEvaluationOutputComponents", "")
	uint32_t.member("maxGeometryShaderInvocations", "")
	uint32_t.member("maxGeometryInputComponents", "")
	uint32_t.member("maxGeometryOutputComponents", "")
	uint32_t.member("maxGeometryOutputVertices", "")
	uint32_t.member("maxGeometryTotalOutputComponents", "")
	uint32_t.member("maxFragmentInputComponents", "")
	uint32_t.member("maxFragmentOutputAttachments", "")
	uint32_t.member("maxFragmentDualSrcAttachments", "")
	uint32_t.member("maxFragmentCombinedOutputResources", "")
	uint32_t.member("maxComputeSharedMemorySize", "")
	uint32_t.array("maxComputeWorkGroupCount", "", size = 3)
	uint32_t.member("maxComputeWorkGroupInvocations", "")
	uint32_t.array("maxComputeWorkGroupSize", "", size = 3)
	uint32_t.member("subPixelPrecisionBits", "")
	uint32_t.member("subTexelPrecisionBits", "")
	uint32_t.member("mipmapPrecisionBits", "")
	uint32_t.member("maxDrawIndexedIndexValue", "")
	uint32_t.member("maxDrawIndirectCount", "")
	float.member("maxSamplerLodBias", "")
	float.member("maxSamplerAnisotropy", "")
	uint32_t.member("maxViewports", "")
	uint32_t.array("maxViewportDimensions", "", size = 2)
	float.array("viewportBoundsRange", "", size = 2)
	uint32_t.member("viewportSubPixelBits", "")
	size_t.member("minMemoryMapAlignment", "")
	VkDeviceSize.member("minTexelBufferOffsetAlignment", "")
	VkDeviceSize.member("minUniformBufferOffsetAlignment", "")
	VkDeviceSize.member("minStorageBufferOffsetAlignment", "")
	int32_t.member("minTexelOffset", "")
	uint32_t.member("maxTexelOffset", "")
	int32_t.member("minTexelGatherOffset", "")
	uint32_t.member("maxTexelGatherOffset", "")
	float.member("minInterpolationOffset", "")
	float.member("maxInterpolationOffset", "")
	uint32_t.member("subPixelInterpolationOffsetBits", "")
	uint32_t.member("maxFramebufferWidth", "")
	uint32_t.member("maxFramebufferHeight", "")
	uint32_t.member("maxFramebufferLayers", "")
	VkSampleCountFlags.member("framebufferColorSampleCounts", "")
	VkSampleCountFlags.member("framebufferDepthSampleCounts", "")
	VkSampleCountFlags.member("framebufferStencilSampleCounts", "")
	VkSampleCountFlags.member("framebufferNoAttachmentsSampleCounts", "")
	uint32_t.member("maxColorAttachments", "")
	VkSampleCountFlags.member("sampledImageColorSampleCounts", "")
	VkSampleCountFlags.member("sampledImageIntegerSampleCounts", "")
	VkSampleCountFlags.member("sampledImageDepthSampleCounts", "")
	VkSampleCountFlags.member("sampledImageStencilSampleCounts", "")
	VkSampleCountFlags.member("storageImageSampleCounts", "")
	uint32_t.member("maxSampleMaskWords", "")
	VkBool32.member("timestampComputeAndGraphics", "")
	float.member("timestampPeriod", "")
	uint32_t.member("maxClipDistances", "")
	uint32_t.member("maxCullDistances", "")
	uint32_t.member("maxCombinedClipAndCullDistances", "")
	uint32_t.member("discreteQueuePriorities", "")
	float.array("pointSizeRange", "", size = 2)
	float.array("lineWidthRange", "", size = 2)
	float.member("pointSizeGranularity", "")
	float.member("lineWidthGranularity", "")
	VkBool32.member("strictLines", "")
	VkBool32.member("standardSampleLocations", "")
	VkDeviceSize.member("optimalBufferCopyOffsetAlignment", "")
	VkDeviceSize.member("optimalBufferCopyRowPitchAlignment", "")
	VkDeviceSize.member("nonCoherentAtomSize", "")
}.nativeType

val VkPhysicalDeviceSparseProperties = struct(VULKAN_PACKAGE, "VkPhysicalDeviceSparseProperties", mutable = false) {
	documentation = ""

	VkBool32.member("residencyStandard2DBlockShape", "")
	VkBool32.member("residencyStandard2DMultisampleBlockShape", "")
	VkBool32.member("residencyStandard3DBlockShape", "")
	VkBool32.member("residencyAlignedMipSize", "")
	VkBool32.member("residencyNonResidentStrict", "")
}.nativeType

val VK_MAX_PHYSICAL_DEVICE_NAME_SIZE = 256
val VK_UUID_SIZE = 16
val VkPhysicalDeviceProperties_p = struct_p(VULKAN_PACKAGE, "VkPhysicalDeviceProperties", mutable = false) {
	documentation = ""

	uint32_t.member("apiVersion", "")
	uint32_t.member("driverVersion", "")
	uint32_t.member("vendorID", "")
	uint32_t.member("deviceID", "")
	VkPhysicalDeviceType.member("deviceType", "")
	charUTF8.array("deviceName", "", size = VK_MAX_PHYSICAL_DEVICE_NAME_SIZE)
	uint8_t.array("pipelineCacheUUID", "", size = VK_UUID_SIZE)
	VkPhysicalDeviceLimits.member("limits", "")
	VkPhysicalDeviceSparseProperties.member("sparseProperties", "")
}

val VkQueueFamilyProperties_p = struct_p(VULKAN_PACKAGE, "VkQueueFamilyProperties", mutable = false) {
	documentation = ""

	VkQueueFlags.member("queueFlags", "")
	uint32_t.member("queueCount", "")
	uint32_t.member("timestampValidBits", "")
	VkExtent3D.member("minImageTransferGranularity", "")
}

val VkMemoryType = struct(VULKAN_PACKAGE, "VkMemoryType", mutable = false) {
	documentation = ""

	VkMemoryPropertyFlags.member("propertyFlags", "")
	uint32_t.member("heapIndex", "")
}.nativeType

val VkMemoryHeap = struct(VULKAN_PACKAGE, "VkMemoryHeap", mutable = false) {
	documentation = ""

	VkDeviceSize.member("size", "")
	VkMemoryHeapFlags.member("flags", "")
}.nativeType

val VK_MAX_MEMORY_TYPES = 32
val VK_MAX_MEMORY_HEAPS = 16
val VkPhysicalDeviceMemoryProperties_p = struct_p(VULKAN_PACKAGE, "VkPhysicalDeviceMemoryProperties", mutable = false) {
	documentation = ""

	AutoSize("memoryTypes")..uint32_t.member("memoryTypeCount", "")
	VkMemoryType.array("memoryTypes", "", size = VK_MAX_MEMORY_TYPES)
	AutoSize("memoryHeaps")..uint32_t.member("memoryHeapCount", "")
	VkMemoryHeap.array("memoryHeaps", "", size = VK_MAX_MEMORY_HEAPS)
}

val VkDeviceQueueCreateInfo = struct(VULKAN_PACKAGE, "VkDeviceQueueCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkDeviceQueueCreateFlags.member("flags", "")
	uint32_t.member("queueFamilyIndex", "")
	AutoSize("pQueuePriorities")..uint32_t.member("queueCount", "")
	float.const_p.member("pQueuePriorities", "")
}.nativeType
val const_VkDeviceQueueCreateInfo_p = VkDeviceQueueCreateInfo.const_p

val VkDeviceCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkDeviceCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkDeviceCreateFlags.member("flags", "")
	AutoSize("pQueueCreateInfos")..uint32_t.member("queueCreateInfoCount", "")
	const_VkDeviceQueueCreateInfo_p.buffer("pQueueCreateInfos", "")
	AutoSize("ppEnabledLayerNames")..uint32_t.member("enabledLayerCount", "")
	nullable..const_charUTF8_const_p.member("ppEnabledLayerNames", "")
	AutoSize("ppEnabledExtensionNames")..uint32_t.member("enabledExtensionCount", "")
	nullable..const_charUTF8_const_p.member("ppEnabledExtensionNames", "")
	nullable..const_VkPhysicalDeviceFeatures_p.member("pEnabledFeatures", "")
}

val VK_MAX_EXTENSION_NAME_SIZE = 256
val VkExtensionProperties_p = struct_p(VULKAN_PACKAGE, "VkExtensionProperties", mutable = false) {
	documentation = ""

	charUTF8.array("extensionName", "", size = VK_MAX_EXTENSION_NAME_SIZE)
	uint32_t.member("specVersion", "")
}

val VK_MAX_DESCRIPTION_SIZE = 256
val VkLayerProperties_p = struct_p(VULKAN_PACKAGE, "VkLayerProperties", mutable = false) {
	documentation = ""

	charUTF8.array("layerName", "", size = VK_MAX_EXTENSION_NAME_SIZE)
	uint32_t.member("specVersion", "")
	uint32_t.member("implementationVersion", "")
	charUTF8.array("description", "", size = VK_MAX_DESCRIPTION_SIZE)
}

val VkSubmitInfo_p = struct_p(VULKAN_PACKAGE, "VkSubmitInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	AutoSize("pWaitSemaphores", "pWaitDstStageMask")..uint32_t.member("waitSemaphoreCount", "")
	nullable..VkSemaphore.const_p.member("pWaitSemaphores", "")
	nullable..VkPipelineStageFlags.const_p.member("pWaitDstStageMask", "")
	AutoSize("pCommandBuffers")..uint32_t.member("commandBufferCount", "")
	VkCommandBuffer.const_p.member("pCommandBuffers", "")
	AutoSize("pSignalSemaphores")..uint32_t.member("signalSemaphoreCount", "")
	nullable..VkSemaphore.const_p.member("pSignalSemaphores", "")
}

val VkMemoryAllocateInfo_p = struct_p(VULKAN_PACKAGE, "VkMemoryAllocateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkDeviceSize.member("allocationSize", "")
	uint32_t.member("memoryTypeIndex", "")
}

val VkMappedMemoryRange_p = struct_p(VULKAN_PACKAGE, "VkMappedMemoryRange") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkDeviceMemory.member("memory", "")
	VkDeviceSize.member("offset", "")
	VkDeviceSize.member("size", "")
}

val VkMemoryRequirements_p = struct_p(VULKAN_PACKAGE, "VkMemoryRequirements", mutable = false) {
	documentation = ""

	VkDeviceSize.member("size", "")
	VkDeviceSize.member("alignment", "")
	uint32_t.member("memoryTypeBits", "")
}

val VkSparseImageFormatProperties = struct(VULKAN_PACKAGE, "VkSparseImageFormatProperties", mutable = false) {
	documentation = ""

	VkImageAspectFlags.member("aspectMask", "")
	VkExtent3D.member("imageGranularity", "")
	VkSparseImageFormatFlags.member("flags", "")
}.nativeType
val VkSparseImageFormatProperties_p = VkSparseImageFormatProperties.p

val VkSparseImageMemoryRequirements_p = struct_p(VULKAN_PACKAGE, "VkSparseImageMemoryRequirements", mutable = false) {
	documentation = ""

	VkSparseImageFormatProperties.member("formatProperties", "")
	uint32_t.member("imageMipTailFirstLod", "")
	VkDeviceSize.member("imageMipTailSize", "")
	VkDeviceSize.member("imageMipTailOffset", "")
	VkDeviceSize.member("imageMipTailStride", "")
}

val VkSparseMemoryBind = struct(VULKAN_PACKAGE, "VkSparseMemoryBind") {
	documentation = ""

	VkDeviceSize.member("resourceOffset", "")
	VkDeviceSize.member("size", "")
	VkDeviceMemory.member("memory", "")
	VkDeviceSize.member("memoryOffset", "")
	VkSparseMemoryBindFlags.member("flags", "")
}.nativeType

val VkSparseBufferMemoryBindInfo = struct(VULKAN_PACKAGE, "VkSparseBufferMemoryBindInfo") {
	documentation = ""

	VkBuffer.member("buffer", "")
	AutoSize("pBinds")..uint32_t.member("bindCount", "")
	VkSparseMemoryBind.const_p.buffer("pBinds", "")
}.nativeType

val VkSparseImageOpaqueMemoryBindInfo = struct(VULKAN_PACKAGE, "VkSparseImageOpaqueMemoryBindInfo") {
	documentation = ""

	VkImage.member("image", "")
	AutoSize("pBinds")..uint32_t.member("bindCount", "")
	VkSparseMemoryBind.const_p.buffer("pBinds", "")
}.nativeType

val VkSparseImageMemoryBindInfo = struct(VULKAN_PACKAGE, "VkSparseImageMemoryBindInfo") {
	documentation = ""

	VkImage.member("image", "")
	AutoSize("pBinds")..uint32_t.member("bindCount", "")
	VkSparseMemoryBind.const_p.buffer("pBinds", "")
}.nativeType

val VkBindSparseInfo_p = struct_p(VULKAN_PACKAGE, "VkBindSparseInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	AutoSize("pWaitSemaphores")..uint32_t.member("waitSemaphoreCount", "")
	nullable..VkSemaphore.const_p.member("pWaitSemaphores", "")
	AutoSize("pBufferBinds")..uint32_t.member("bufferBindCount", "")
	nullable..VkSparseBufferMemoryBindInfo.const_p.buffer("pBufferBinds", "")
	AutoSize("pImageOpaqueBinds")..uint32_t.member("imageOpaqueBindCount", "")
	nullable..VkSparseImageOpaqueMemoryBindInfo.const_p.buffer("pImageOpaqueBinds", "")
	AutoSize("pImageBinds")..uint32_t.member("imageBindCount", "")
	nullable..VkSparseImageMemoryBindInfo.const_p.buffer("pImageBinds", "")
	AutoSize("pSignalSemaphores")..uint32_t.member("signalSemaphoreCount", "")
	nullable..VkSemaphore.const_p.member("pSignalSemaphores", "")
}

val VkFenceCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkFenceCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkFenceCreateFlags.member("flags", "")
}

val VkSemaphoreCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkSemaphoreCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkSemaphoreCreateFlags.member("flags", "")
}

val VkEventCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkEventCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkEventCreateFlags.member("flags", "")
}

val VkQueryPoolCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkQueryPoolCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkQueryPoolCreateFlags.member("flags", "")
	VkQueryType.member("queryType", "")
	uint32_t.member("queryCount", "")
	VkQueryPipelineStatisticFlags.member("pipelineStatistics", "")
}

val VkBufferCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkBufferCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkBufferCreateFlags.member("flags", "")
	VkDeviceSize.member("size", "")
	VkBufferUsageFlags.member("usage", "")
	VkSharingMode.member("sharingMode", "")
	AutoSize("pQueueFamilyIndices")..uint32_t.member("queueFamilyIndexCount", "")
	nullable..uint32_t.const_p.member("pQueueFamilyIndices", "")
}

val VkBufferViewCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkBufferViewCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkBufferViewCreateFlags.member("flags", "")
	VkBuffer.member("buffer", "")
	VkFormat.member("format", "")
	VkDeviceSize.member("offset", "")
	VkDeviceSize.member("range", "")
}

val VkImageCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkImageCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkImageCreateFlags.member("flags", "")
	VkImageType.member("imageType", "")
	VkFormat.member("format", "")
	VkExtent3D.member("extent", "")
	uint32_t.member("mipLevels", "")
	uint32_t.member("arrayLayers", "")
	VkSampleCountFlagBits.member("samples", "")
	VkImageTiling.member("tiling", "")
	VkImageUsageFlags.member("usage", "")
	VkSharingMode.member("sharingMode", "")
	AutoSize("pQueueFamilyIndices")..uint32_t.member("queueFamilyIndexCount", "")
	nullable..uint32_t.const_p.member("pQueueFamilyIndices", "")
	VkImageLayout.member("initialLayout", "")
}

val VkImageSubresource_p = struct_p(VULKAN_PACKAGE, "VkImageSubresource") {
	documentation = ""

	VkImageAspectFlags.member("aspectMask", "")
	uint32_t.member("mipLevel", "")
	uint32_t.member("arrayLayer", "")
}

val VkSubresourceLayout_p = struct_p(VULKAN_PACKAGE, "VkSubresourceLayout", mutable = false) {
	documentation = ""

	VkDeviceSize.member("offset", "")
	VkDeviceSize.member("size", "")
	VkDeviceSize.member("rowPitch", "")
	VkDeviceSize.member("arrayPitch", "")
	VkDeviceSize.member("depthPitch", "")
}

val VkComponentMapping = struct(VULKAN_PACKAGE, "VkComponentMapping") {
	documentation = ""

	VkComponentSwizzle.member("r", "")
	VkComponentSwizzle.member("g", "")
	VkComponentSwizzle.member("b", "")
	VkComponentSwizzle.member("a", "")
}.nativeType

val VkImageSubresourceRange = struct(VULKAN_PACKAGE, "VkImageSubresourceRange") {
	documentation = ""

	VkImageAspectFlags.member("aspectMask", "")
	uint32_t.member("baseMipLevel", "")
	uint32_t.member("levelCount", "")
	uint32_t.member("baseArrayLayer", "")
	uint32_t.member("layerCount", "")
}.nativeType
val VkImageSubresourceRange_p = VkImageSubresourceRange.p

val VkImageViewCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkImageViewCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkImageViewCreateFlags.member("flags", "")
	VkImage.member("image", "")
	VkImageViewType.member("viewType", "")
	VkFormat.member("format", "")
	VkComponentMapping.member("components", "")
	VkImageSubresourceRange.member("subresourceRange", "")
}

val VkShaderModuleCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkShaderModuleCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkShaderModuleCreateFlags.member("flags", "")
	AutoSize("pCode")..size_t.member("codeSize", "")
	PointerType("const uint32_t", PointerMapping.DATA_BYTE).member("pCode", "")
}

val VkPipelineCacheCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkPipelineCacheCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkPipelineCacheCreateFlags.member("flags", "")
	AutoSize("pInitialData")..size_t.member("initialDataSize", "")
	nullable..const_void_p.member("pInitialData", "")
}

val VkSpecializationMapEntry = struct(VULKAN_PACKAGE, "VkSpecializationMapEntry") {
	documentation = ""

	uint32_t.member("constantID", "")
	uint32_t.member("offset", "")
	size_t.member("size", "")
}.nativeType

val VkSpecializationInfo = struct(VULKAN_PACKAGE, "VkSpecializationInfo") {
	documentation = ""

	AutoSize("pMapEntries")..uint32_t.member("mapEntryCount", "")
	VkSpecializationMapEntry.const_p.buffer("pMapEntries", "")
	AutoSize("pData")..size_t.member("dataSize", "")
	nullable..const_void_p.member("pData", "")
}.nativeType

val VkPipelineShaderStageCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineShaderStageCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkPipelineShaderStageCreateFlags.member("flags", "")
	VkShaderStageFlagBits.member("stage", "")
	VkShaderModule.member("module", "")
	const_charUTF8_p.member("pName", "")
	nullable..VkSpecializationInfo.const_p.member("pSpecializationInfo", "")
}.nativeType

val VkVertexInputBindingDescription = struct(VULKAN_PACKAGE, "VkVertexInputBindingDescription") {
	documentation = ""

	uint32_t.member("binding", "")
	uint32_t.member("stride", "")
	VkVertexInputRate.member("inputRate", "")
}.nativeType

val VkVertexInputAttributeDescription = struct(VULKAN_PACKAGE, "VkVertexInputAttributeDescription") {
	documentation = ""

	uint32_t.member("location", "")
	uint32_t.member("binding", "")
	VkFormat.member("format", "")
	uint32_t.member("offset", "")
}.nativeType

val VkPipelineVertexInputStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineVertexInputStateCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkPipelineVertexInputStateCreateFlags.member("flags", "")
	AutoSize("pVertexBindingDescriptions")..uint32_t.member("vertexBindingDescriptionCount", "")
	nullable..VkVertexInputBindingDescription.const_p.buffer("pVertexBindingDescriptions", "")
	AutoSize("pVertexAttributeDescriptions")..uint32_t.member("vertexAttributeDescriptionCount", "")
	nullable..VkVertexInputAttributeDescription.const_p.buffer("pVertexAttributeDescriptions", "")
}.nativeType

val VkPipelineInputAssemblyStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineInputAssemblyStateCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkPipelineInputAssemblyStateCreateFlags.member("flags", "")
	VkPrimitiveTopology.member("topology", "")
	VkBool32.member("primitiveRestartEnable", "")
}.nativeType

val VkPipelineTessellationStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineTessellationStateCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkPipelineTessellationStateCreateFlags.member("flags", "")
	uint32_t.member("patchControlPoints", "")
}.nativeType

val VkViewport = struct(VULKAN_PACKAGE, "VkViewport") {
	documentation = ""

	float.member("x", "")
	float.member("y", "")
	float.member("width", "")
	float.member("height", "")
	float.member("minDepth", "")
	float.member("maxDepth", "")
}.nativeType

val VkOffset2D = struct(VULKAN_PACKAGE, "VkOffset2D") {
	documentation = ""

	int32_t.member("x", "")
	int32_t.member("y", "")
}.nativeType

val VkExtent2D = struct(VULKAN_PACKAGE, "VkExtent2D") {
	documentation = ""

	uint32_t.member("width", "")
	uint32_t.member("height", "")
}.nativeType

val VkRect2D = struct(VULKAN_PACKAGE, "VkRect2D") {
	documentation = ""

	VkOffset2D.member("offset", "")
	VkExtent2D.member("extent", "")
}.nativeType

val VkPipelineViewportStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineViewportStateCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkPipelineViewportStateCreateFlags.member("flags", "")
	AutoSize("pViewports", keepSetter = true)..uint32_t.member("viewportCount", "")
	nullable..VkViewport.const_p.buffer("pViewports", "")
	AutoSize("pScissors", keepSetter = true)..uint32_t.member("scissorCount", "")
	nullable..VkRect2D.const_p.buffer("pScissors", "")
}.nativeType

val VkPipelineRasterizationStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineRasterizationStateCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkPipelineRasterizationStateCreateFlags.member("flags", "")
	VkBool32.member("depthClampEnable", "")
	VkBool32.member("rasterizerDiscardEnable", "")
	VkPolygonMode.member("polygonMode", "")
	VkCullModeFlags.member("cullMode", "")
	VkFrontFace.member("frontFace", "")
	VkBool32.member("depthBiasEnable", "")
	float.member("depthBiasConstantFactor", "")
	float.member("depthBiasClamp", "")
	float.member("depthBiasSlopeFactor", "")
	float.member("lineWidth", "")
}.nativeType

val VkPipelineMultisampleStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineMultisampleStateCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkPipelineMultisampleStateCreateFlags.member("flags", "")
	VkSampleCountFlagBits.member("rasterizationSamples", "")
	VkBool32.member("sampleShadingEnable", "")
	float.member("minSampleShading", "")
	nullable..VkSampleMask.const_p.member("pSampleMask", "")
	VkBool32.member("alphaToCoverageEnable", "")
	VkBool32.member("alphaToOneEnable", "")
}.nativeType

val VkStencilOpState = struct(VULKAN_PACKAGE, "VkStencilOpState") {
	documentation = ""

	VkStencilOp.member("failOp", "")
	VkStencilOp.member("passOp", "")
	VkStencilOp.member("depthFailOp", "")
	VkCompareOp.member("compareOp", "")
	uint32_t.member("compareMask", "")
	uint32_t.member("writeMask", "")
	uint32_t.member("reference", "")
}.nativeType

val VkPipelineDepthStencilStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineDepthStencilStateCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkPipelineDepthStencilStateCreateFlags.member("flags", "")
	VkBool32.member("depthTestEnable", "")
	VkBool32.member("depthWriteEnable", "")
	VkCompareOp.member("depthCompareOp", "")
	VkBool32.member("depthBoundsTestEnable", "")
	VkBool32.member("stencilTestEnable", "")
	VkStencilOpState.member("front", "")
	VkStencilOpState.member("back", "")
	float.member("minDepthBounds", "")
	float.member("maxDepthBounds", "")
}.nativeType

val VkPipelineColorBlendAttachmentState = struct(VULKAN_PACKAGE, "VkPipelineColorBlendAttachmentState") {
	documentation = ""

	VkBool32.member("blendEnable", "")
	VkBlendFactor.member("srcColorBlendFactor", "")
	VkBlendFactor.member("dstColorBlendFactor", "")
	VkBlendOp.member("colorBlendOp", "")
	VkBlendFactor.member("srcAlphaBlendFactor", "")
	VkBlendFactor.member("dstAlphaBlendFactor", "")
	VkBlendOp.member("alphaBlendOp", "")
	VkColorComponentFlags.member("colorWriteMask", "")
}.nativeType

val VkPipelineColorBlendStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineColorBlendStateCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkPipelineColorBlendStateCreateFlags.member("flags", "")
	VkBool32.member("logicOpEnable", "")
	VkLogicOp.member("logicOp", "")
	AutoSize("pAttachments")..uint32_t.member("attachmentCount", "")
	nullable..VkPipelineColorBlendAttachmentState.const_p.buffer("pAttachments", "")
	float.array("blendConstants", "", size = 4)
}.nativeType

val VkPipelineDynamicStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineDynamicStateCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkPipelineDynamicStateCreateFlags.member("flags", "")
	AutoSize("pDynamicStates")..uint32_t.member("dynamicStateCount", "")
	VkDynamicState.const_p.member("pDynamicStates", "")
}.nativeType

val VkGraphicsPipelineCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkGraphicsPipelineCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkPipelineCreateFlags.member("flags", "")
	AutoSize("pStages")..uint32_t.member("stageCount", "")
	VkPipelineShaderStageCreateInfo.const_p.buffer("pStages", "")
	VkPipelineVertexInputStateCreateInfo.const_p.member("pVertexInputState", "")
	VkPipelineInputAssemblyStateCreateInfo.const_p.member("pInputAssemblyState", "")
	nullable..VkPipelineTessellationStateCreateInfo.const_p.member("pTessellationState", "")
	nullable..VkPipelineViewportStateCreateInfo.const_p.member("pViewportState", "")
	VkPipelineRasterizationStateCreateInfo.const_p.member("pRasterizationState", "")
	nullable..VkPipelineMultisampleStateCreateInfo.const_p.member("pMultisampleState", "")
	nullable..VkPipelineDepthStencilStateCreateInfo.const_p.member("pDepthStencilState", "")
	nullable..VkPipelineColorBlendStateCreateInfo.const_p.member("pColorBlendState", "")
	nullable..VkPipelineDynamicStateCreateInfo.const_p.member("pDynamicState", "")
	VkPipelineLayout.member("layout", "")
	VkRenderPass.member("renderPass", "")
	uint32_t.member("subpass", "")
	VkPipeline.member("basePipelineHandle", "")
	int32_t.member("basePipelineIndex", "")
}

val VkComputePipelineCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkComputePipelineCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkPipelineCreateFlags.member("flags", "")
	VkPipelineShaderStageCreateInfo.member("stage", "")
	VkPipelineLayout.member("layout", "")
	VkPipeline.member("basePipelineHandle", "")
	int32_t.member("basePipelineIndex", "")
}

val VkPushConstantRange = struct(VULKAN_PACKAGE, "VkPushConstantRange") {
	documentation = ""

	VkShaderStageFlags.member("stageFlags", "")
	uint32_t.member("offset", "")
	uint32_t.member("size", "")
}.nativeType

val VkPipelineLayoutCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkPipelineLayoutCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkPipelineLayoutCreateFlags.member("flags", "")
	AutoSize("pSetLayouts")..uint32_t.member("setLayoutCount", "")
	nullable..VkDescriptorSetLayout.const_p.member("pSetLayouts", "")
	AutoSize("pPushConstantRanges")..uint32_t.member("pushConstantRangeCount", "")
	nullable..VkPushConstantRange.const_p.buffer("pPushConstantRanges", "")
}

val VkSamplerCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkSamplerCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkSamplerCreateFlags.member("flags", "")
	VkFilter.member("magFilter", "")
	VkFilter.member("minFilter", "")
	VkSamplerMipmapMode.member("mipmapMode", "")
	VkSamplerAddressMode.member("addressModeU", "")
	VkSamplerAddressMode.member("addressModeV", "")
	VkSamplerAddressMode.member("addressModeW", "")
	float.member("mipLodBias", "")
	VkBool32.member("anisotropyEnable", "")
	float.member("maxAnisotropy", "")
	VkBool32.member("compareEnable", "")
	VkCompareOp.member("compareOp", "")
	float.member("minLod", "")
	float.member("maxLod", "")
	VkBorderColor.member("borderColor", "")
	VkBool32.member("unnormalizedCoordinates", "")
}

val VkDescriptorSetLayoutBinding = struct(VULKAN_PACKAGE, "VkDescriptorSetLayoutBinding") {
	documentation = ""

	uint32_t.member("binding", "")
	VkDescriptorType.member("descriptorType", "")
	uint32_t.member("descriptorCount", "")
	VkShaderStageFlags.member("stageFlags", "")
	nullable..VkSampler.const_p.member("pImmutableSamplers", "")
}.nativeType

val VkDescriptorSetLayoutCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkDescriptorSetLayoutCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkDescriptorSetLayoutCreateFlags.member("flags", "")
	AutoSize("pBindings")..uint32_t.member("bindingCount", "")
	nullable..VkDescriptorSetLayoutBinding.const_p.buffer("pBindings", "")
}

val VkDescriptorPoolSize = struct(VULKAN_PACKAGE, "VkDescriptorPoolSize") {
	documentation = ""

	VkDescriptorType.member("type", "")
	uint32_t.member("descriptorCount", "")
}.nativeType

val VkDescriptorPoolCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkDescriptorPoolCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkDescriptorPoolCreateFlags.member("flags", "")
	uint32_t.member("maxSets", "")
	AutoSize("pPoolSizes")..uint32_t.member("poolSizeCount", "")
	VkDescriptorPoolSize.const_p.buffer("pPoolSizes", "")
}

val VkDescriptorSetAllocateInfo_p = struct_p(VULKAN_PACKAGE, "VkDescriptorSetAllocateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkDescriptorPool.member("descriptorPool", "")
	AutoSize("pSetLayouts")..uint32_t.member("descriptorSetCount", "")
	VkDescriptorSetLayout.const_p.member("pSetLayouts", "")
}

val VkDescriptorImageInfo = struct(VULKAN_PACKAGE, "VkDescriptorImageInfo") {
	documentation = ""

	VkSampler.member("sampler", "")
	VkImageView.member("imageView", "")
	VkImageLayout.member("imageLayout", "")
}.nativeType

val VkDescriptorBufferInfo = struct(VULKAN_PACKAGE, "VkDescriptorBufferInfo") {
	documentation = ""

	VkBuffer.member("buffer", "")
	VkDeviceSize.member("offset", "")
	VkDeviceSize.member("range", "")
}.nativeType

val VkWriteDescriptorSet_p = struct_p(VULKAN_PACKAGE, "VkWriteDescriptorSet") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkDescriptorSet.member("dstSet", "")
	uint32_t.member("dstBinding", "")
	uint32_t.member("dstArrayElement", "")
	AutoSize("pImageInfo", "pBufferInfo", "pTexelBufferView", exclusive = true)..uint32_t.member("descriptorCount", "")
	VkDescriptorType.member("descriptorType", "")
	nullable..VkDescriptorImageInfo.const_p.buffer("pImageInfo", "")
	nullable..VkDescriptorBufferInfo.const_p.buffer("pBufferInfo", "")
	nullable..VkBufferView.const_p.member("pTexelBufferView", "")
}

val VkCopyDescriptorSet_p = struct_p(VULKAN_PACKAGE, "VkCopyDescriptorSet") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkDescriptorSet.member("srcSet", "")
	uint32_t.member("srcBinding", "")
	uint32_t.member("srcArrayElement", "")
	VkDescriptorSet.member("dstSet", "")
	uint32_t.member("dstBinding", "")
	uint32_t.member("dstArrayElement", "")
	uint32_t.member("descriptorCount", "")
}

val VkFramebufferCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkFramebufferCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkFramebufferCreateFlags.member("flags", "")
	VkRenderPass.member("renderPass", "")
	AutoSize("pAttachments")..uint32_t.member("attachmentCount", "")
	nullable..VkImageView.const_p.member("pAttachments", "")
	uint32_t.member("width", "")
	uint32_t.member("height", "")
	uint32_t.member("layers", "")
}

val VkAttachmentDescription = struct(VULKAN_PACKAGE, "VkAttachmentDescription") {
	documentation = ""

	VkAttachmentDescriptionFlags.member("flags", "")
	VkFormat.member("format", "")
	VkSampleCountFlagBits.member("samples", "")
	VkAttachmentLoadOp.member("loadOp", "")
	VkAttachmentStoreOp.member("storeOp", "")
	VkAttachmentLoadOp.member("stencilLoadOp", "")
	VkAttachmentStoreOp.member("stencilStoreOp", "")
	VkImageLayout.member("initialLayout", "")
	VkImageLayout.member("finalLayout", "")
}.nativeType

val VkAttachmentReference = struct(VULKAN_PACKAGE, "VkAttachmentReference") {
	documentation = ""

	uint32_t.member("attachment", "")
	VkImageLayout.member("layout", "")
}.nativeType

val VkSubpassDescription = struct(VULKAN_PACKAGE, "VkSubpassDescription") {
	documentation = ""

	VkSubpassDescriptionFlags.member("flags", "")
	VkPipelineBindPoint.member("pipelineBindPoint", "")
	AutoSize("pInputAttachments")..uint32_t.member("inputAttachmentCount", "")
	nullable..VkAttachmentReference.const_p.buffer("pInputAttachments", "")
	AutoSize("pColorAttachments", "pResolveAttachments")..uint32_t.member("colorAttachmentCount", "")
	nullable..VkAttachmentReference.const_p.buffer("pColorAttachments", "")
	nullable..VkAttachmentReference.const_p.buffer("pResolveAttachments", "")
	nullable..VkAttachmentReference.const_p.member("pDepthStencilAttachment", "")
	AutoSize("pPreserveAttachments")..uint32_t.member("preserveAttachmentCount", "")
	nullable..uint32_t.const_p.member("pPreserveAttachments", "")
}.nativeType

val VkSubpassDependency = struct(VULKAN_PACKAGE, "VkSubpassDependency") {
	documentation = ""

	uint32_t.member("srcSubpass", "")
	uint32_t.member("dstSubpass", "")
	VkPipelineStageFlags.member("srcStageMask", "")
	VkPipelineStageFlags.member("dstStageMask", "")
	VkAccessFlags.member("srcAccessMask", "")
	VkAccessFlags.member("dstAccessMask", "")
	VkDependencyFlags.member("dependencyFlags", "")
}.nativeType

val VkRenderPassCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkRenderPassCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkRenderPassCreateFlags.member("flags", "")
	AutoSize("pAttachments")..uint32_t.member("attachmentCount", "")
	nullable..VkAttachmentDescription.const_p.buffer("pAttachments", "")
	AutoSize("pSubpasses")..uint32_t.member("subpassCount", "")
	VkSubpassDescription.const_p.buffer("pSubpasses", "")
	AutoSize("pDependencies")..uint32_t.member("dependencyCount", "")
	nullable..VkSubpassDependency.const_p.buffer("pDependencies", "")
}

val VkCommandPoolCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkCommandPoolCreateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkCommandPoolCreateFlags.member("flags", "")
	uint32_t.member("queueFamilyIndex", "")
}

val VkCommandBufferAllocateInfo_p = struct_p(VULKAN_PACKAGE, "VkCommandBufferAllocateInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkCommandPool.member("commandPool", "")
	VkCommandBufferLevel.member("level", "")
	uint32_t.member("commandBufferCount", "")
}

val VkCommandBufferInheritanceInfo = struct(VULKAN_PACKAGE, "VkCommandBufferInheritanceInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkRenderPass.member("renderPass", "")
	uint32_t.member("subpass", "")
	VkFramebuffer.member("framebuffer", "")
	VkBool32.member("occlusionQueryEnable", "")
	VkQueryControlFlags.member("queryFlags", "")
	VkQueryPipelineStatisticFlags.member("pipelineStatistics", "")
}.nativeType

val VkCommandBufferBeginInfo_p = struct_p(VULKAN_PACKAGE, "VkCommandBufferBeginInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkCommandBufferUsageFlags.member("flags", "")
	nullable..VkCommandBufferInheritanceInfo.const_p.member("pInheritanceInfo", "")
}

val VkBufferCopy_p = struct_p(VULKAN_PACKAGE, "VkBufferCopy") {
	documentation = ""

	VkDeviceSize.member("srcOffset", "")
	VkDeviceSize.member("dstOffset", "")
	VkDeviceSize.member("size", "")
}

val VkImageSubresourceLayers = struct(VULKAN_PACKAGE, "VkImageSubresourceLayers") {
	documentation = ""

	VkImageAspectFlags.member("aspectMask", "")
	uint32_t.member("mipLevel", "")
	uint32_t.member("baseArrayLayer", "")
	uint32_t.member("layerCount", "")
}.nativeType

val VkOffset3D = struct(VULKAN_PACKAGE, "VkOffset3D") {
	documentation = ""

	int32_t.member("x", "")
	int32_t.member("y", "")
	int32_t.member("z", "")
}.nativeType

val VkImageCopy_p = struct_p(VULKAN_PACKAGE, "VkImageCopy") {
	documentation = ""

	VkImageSubresourceLayers.member("srcSubresource", "")
	VkOffset3D.member("srcOffset", "")
	VkImageSubresourceLayers.member("dstSubresource", "")
	VkOffset3D.member("dstOffset", "")
	VkExtent3D.member("extent", "")
}

val VkImageBlit_p = struct_p(VULKAN_PACKAGE, "VkImageBlit") {
	documentation = ""

	VkImageSubresourceLayers.member("srcSubresource", "")
	VkOffset3D.array("srcOffsets", "", size = 2)
	VkImageSubresourceLayers.member("dstSubresource", "")
	VkOffset3D.array("dstOffsets", "", size = 2)
}

val VkBufferImageCopy_p = struct_p(VULKAN_PACKAGE, "VkBufferImageCopy") {
	documentation = ""

	VkDeviceSize.member("bufferOffset", "")
	uint32_t.member("bufferRowLength", "")
	uint32_t.member("bufferImageHeight", "")
	VkImageSubresourceLayers.member("imageSubresource", "")
	VkOffset3D.member("imageOffset", "")
	VkExtent3D.member("imageExtent", "")
}

val VkClearColorValue = union(VULKAN_PACKAGE, "VkClearColorValue") {
	documentation = ""

	float.array("float32", "", size = 4)
	int32_t.array("int32", "", size = 4)
	uint32_t.array("uint32", "", size = 4)
}.nativeType
val VkClearColorValue_p = VkClearColorValue.p

val VkClearDepthStencilValue = struct(VULKAN_PACKAGE, "VkClearDepthStencilValue") {
	documentation = ""

	float.member("depth", "")
	uint32_t.member("stencil", "")
}.nativeType
val VkClearDepthStencilValue_p = VkClearDepthStencilValue.p

val VkClearValue = union(VULKAN_PACKAGE, "VkClearValue") {
	documentation = ""

	VkClearColorValue.member("color", "")
	VkClearDepthStencilValue.member("depthStencil", "")
}.nativeType

val VkClearAttachment_p = struct_p(VULKAN_PACKAGE, "VkClearAttachment") {
	documentation = ""

	VkImageAspectFlags.member("aspectMask", "")
	uint32_t.member("colorAttachment", "")
	VkClearValue.member("clearValue", "")
}

val VkClearRect_p = struct_p(VULKAN_PACKAGE, "VkClearRect") {
	documentation = ""

	VkRect2D.member("rect", "")
	uint32_t.member("baseArrayLayer", "")
	uint32_t.member("layerCount", "")
}

val VkImageResolve_p = struct_p(VULKAN_PACKAGE, "VkImageResolve") {
	documentation = ""

	VkImageSubresourceLayers.member("srcSubresource", "")
	VkOffset3D.member("srcOffset", "")
	VkImageSubresourceLayers.member("dstSubresource", "")
	VkOffset3D.member("dstOffset", "")
	VkExtent3D.member("extent", "")
}

val VkMemoryBarrier_p = struct_p(VULKAN_PACKAGE, "VkMemoryBarrier") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkAccessFlags.member("srcAccessMask", "")
	VkAccessFlags.member("dstAccessMask", "")
}

val VkBufferMemoryBarrier_p = struct_p(VULKAN_PACKAGE, "VkBufferMemoryBarrier") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkAccessFlags.member("srcAccessMask", "")
	VkAccessFlags.member("dstAccessMask", "")
	uint32_t.member("srcQueueFamilyIndex", "")
	uint32_t.member("dstQueueFamilyIndex", "")
	VkBuffer.member("buffer", "")
	VkDeviceSize.member("offset", "")
	VkDeviceSize.member("size", "")
}

val VkImageMemoryBarrier_p = struct_p(VULKAN_PACKAGE, "VkImageMemoryBarrier") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkAccessFlags.member("srcAccessMask", "")
	VkAccessFlags.member("dstAccessMask", "")
	VkImageLayout.member("oldLayout", "")
	VkImageLayout.member("newLayout", "")
	uint32_t.member("srcQueueFamilyIndex", "")
	uint32_t.member("dstQueueFamilyIndex", "")
	VkImage.member("image", "")
	VkImageSubresourceRange.member("subresourceRange", "")
}

val VkRenderPassBeginInfo_p = struct_p(VULKAN_PACKAGE, "VkRenderPassBeginInfo") {
	documentation = ""

	VkStructureType.member("sType", "")
	pNext()
	VkRenderPass.member("renderPass", "")
	VkFramebuffer.member("framebuffer", "")
	VkRect2D.member("renderArea", "")
	AutoSize("pClearValues")..uint32_t.member("clearValueCount", "")
	nullable..VkClearValue.const_p.buffer("pClearValues", "")
}