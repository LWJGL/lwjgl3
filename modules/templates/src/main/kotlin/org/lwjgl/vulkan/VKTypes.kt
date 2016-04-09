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

internal fun Struct.sType() = VkStructureType.member("sType", "the type of this structure")
internal fun Struct.pNext() = nullable.."const void".p.member("pNext", "reserved for use by extensions")

val VkApplicationInfo = struct(VULKAN_PACKAGE, "VkApplicationInfo") {
	documentation =
		"""
		${man("VkApplicationInfo")}<br>
		${spec("VkApplicationInfo")}

		Contains information about the application.

		${ValidityStructs.VkApplicationInfo}
		"""

	sType()
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
		${man("VkInstanceCreateInfo")}<br>
		${spec("VkInstanceCreateInfo")}

		Contains information about how a {@code VkInstance} should be created.

		${ValidityStructs.VkInstanceCreateInfo}
		"""

	sType()
	pNext()
	VkInstanceCreateFlags.member("flags", "reserved for future use")
	nullable..const_VkApplicationInfo_p.member("pApplicationInfo", "a pointer to an instance of ##VkApplicationInfo")
	AutoSize("ppEnabledLayerNames", optional = true)..uint32_t.member("enabledLayerCount", "the number of global layers to enable")
	const_charUTF8_const_p.member(
		"ppEnabledLayerNames",
		"a pointer to an array of {@code enabledLayerCount} null-terminated UTF-8 strings containing the names of layers to enable"
	)
	AutoSize("ppEnabledExtensionNames", optional = true)..uint32_t.member("enabledExtensionCount", "the number of global extensions to enable")
	const_charUTF8_const_p.member(
		"ppEnabledExtensionNames",
		"a pointer to an array of {@code enabledExtensionCount} null-terminated UTF-8 strings containing the names of extensions to enable"
	)
}

val PFN_vkAllocationFunction = "PFN_vkAllocationFunction".callback(
	VULKAN_PACKAGE, void_p, "VkAllocationFunction",
	"Will be called by the Vulkan implementation to allocate memory.",

	voidptr.IN("pUserData", "the value specified for ##VkAllocationCallbacks{@code .pUserData} in the allocator specified by the application"),
	size_t.IN("size", "the size in bytes of the requested allocation"),
	size_t.IN("alignment", "the requested alignment of the allocation in bytes and $must be a power of two"),
	VkSystemAllocationScope.IN("allocationScope", "a {@code VkSystemAllocationScope} value specifying the scope of the lifetime of the allocation"),

	returnDoc =
	"""
	$must either return $NULL (in case of allocation failure or if size is zero) or a valid pointer to a memory allocation containing at least size bytes, and
	with the pointer value being a multiple of alignment.
	"""
) {
	documentation = "Instances of this interface may be set to the {@code pfnAllocation} member of the ##VkAllocationCallbacks struct."
	useSystemCallConvention()
}

val PFN_vkReallocationFunction = "PFN_vkReallocationFunction".callback(
	VULKAN_PACKAGE, void_p, "VkReallocationFunction",
	"Will be called by the Vulkan implementation to reallocate memory.",

	voidptr.IN("pUserData", "the value specified for ##VkAllocationCallbacks{@code .pUserData} in the allocator specified by the application"),
	voidptr.IN("pOriginal", "$must be either $NULL or a pointer previously returned by {@code pfnReallocation} or {@code pfnAllocation} of the same allocator"),
	size_t.IN("size", "the size in bytes of the requested allocation"),
	size_t.IN("alignment", "the requested alignment of the allocation in bytes and $must be a power of two"),
	VkSystemAllocationScope.IN("allocationScope", "a {@code VkSystemAllocationScope} value specifying the scope of the lifetime of the allocation")
) {
	documentation =
		"""
		Instances of this interface may be set to the {@code pfnReallocation} member of the ##VkAllocationCallbacks struct.

		The function must alter the size of the allocation {@code pOriginal}, either by shrinking or growing it, to accommodate the new size.

		If {@code pOriginal} is $NULL, then {@code pfnReallocation} $must behave similarly to ##VkAllocationFunction. If size is zero, then
		{@code pfnReallocation} must behave similarly to ##VkFreeFunction. The contents of the original allocation from bytes zero to
		{@code min(original size, new size) − 1} $must be preserved in the new allocation. If the new allocation is larger than the old allocation, then the
		contents of the additional space are undefined. If {@code pOriginal} is non-$NULL, alignment $must be equal to the originally requested alignment. If
		satisfying these requirements involves creating a new allocation, then the old allocation $must be freed. If this function fails, it $must return $NULL
		and not free the old allocation.
		"""
	useSystemCallConvention()
}

val PFN_vkFreeFunction = "PFN_vkFreeFunction".callback(
	VULKAN_PACKAGE, void, "VkFreeFunction",
	"Will be called by the Vulkan implementation to free memory.",

	voidptr.IN("pUserData", "the value specified for ##VkAllocationCallbacks{@code .pUserData} in the allocator specified by the application"),
	voidptr.IN("pMemory", "the allocation to be freed")
) {
	documentation =
		"""
		Instances of this interface may be set to the {@code pfnFree} member of the ##VkAllocationCallbacks struct.

		{@code pMemory may} be $NULL, which the callback $must handle safely. If {@code pMemory} is non-$NULL, it must be a pointer previously allocated by
		{@code pfnAllocation} or {@code pfnReallocation} and must be freed by the function.
		"""
	useSystemCallConvention()
}

val PFN_vkInternalAllocationNotification = "PFN_vkInternalAllocationNotification".callback(
	VULKAN_PACKAGE, void, "VkInternalAllocationNotification",
	"Will be called by the Vulkan implementation when an internal allocation occurs.",

	voidptr.IN("pUserData", "the value specified for ##VkAllocationCallbacks{@code .pUserData} in the allocator specified by the application"),
	size_t.IN("size", "the requested size of an allocation"),
	VkInternalAllocationType.IN("allocationType", "the requested type of an allocation"),
	VkSystemAllocationScope.IN("allocationScope", "a {@code VkSystemAllocationScope} value specifying the scope of the lifetime of the allocation")
) {
	documentation =
		"""
		Instances of this interface may be set to the {@code pfnInternalAllocation} member of the ##VkAllocationCallbacks struct.

		This is a purely informational callback.
		"""
	useSystemCallConvention()
}

val PFN_vkInternalFreeNotification = "PFN_vkInternalFreeNotification".callback(
	VULKAN_PACKAGE, void, "VkInternalFreeNotification",
	"Will be called by the Vulkan implementation when an internal deallocation occurs.",

	voidptr.IN("pUserData", "the value specified for ##VkAllocationCallbacks{@code .pUserData} in the allocator specified by the application"),
	size_t.IN("size", "the requested size of an allocation"),
	VkInternalAllocationType.IN("allocationType", "the requested type of an allocation"),
	VkSystemAllocationScope.IN("allocationScope", "a {@code VkSystemAllocationScope} value specifying the scope of the lifetime of the allocation")
) {
	documentation =
		"""
		Instances of this interface may be set to the {@code pfnInternalFree} member of the ##VkAllocationCallbacks struct.

		This is a purely informational callback.
		"""
	useSystemCallConvention()
}

val VkAllocationCallbacks_p = struct_p(VULKAN_PACKAGE, "VkAllocationCallbacks") {
	documentation =
		"""
		${man("VkAllocationCallbacks")}<br>
		${spec("memory-allocation")}

		Contains pointers to callback functions that are used to create, reallocate and free host memory allocations on behalf of a Vulkan implementation.

		${ValidityStructs.VkAllocationCallbacks}
		"""

	nullable..voidptr.member(
		"pUserData",
		"""
		a value to be interpreted by the implementation of the callbacks. When any of the callbacks in {@code VkAllocationCallbacks} are called, the Vulkan
		implementation will pass this value as the first parameter to the callback. This value $can vary each time an allocator is passed into a command, even
		when the same object takes an allocator in multiple commands.
		"""
	)
	PFN_vkAllocationFunction.member("pfnAllocation", "a pointer to an application-defined memory allocation function of type {@code PFN_vkAllocationFunction}")
	PFN_vkReallocationFunction.member(
		"pfnReallocation",
		"a pointer to an application-defined memory reallocation function of type {@code PFN_vkReallocationFunction}"
	)
	PFN_vkFreeFunction.member("pfnFree", "a pointer to an application-defined memory free function of type {@code PFN_vkFreeFunction}")
	nullable..PFN_vkInternalAllocationNotification.member(
		"pfnInternalAllocation",
		"""
		a pointer to an application-defined function that is called by the implementation when the implementation makes internal allocations, and it is of type
		{@code PFN_vkInternalAllocationNotification}
		"""
	)
	nullable..PFN_vkInternalFreeNotification.member(
		"pfnInternalFree",
		"""
		a pointer to an application-defined function that is called by the implementation when the implementation frees internal allocations, and it is of type
		{@code PFN_vkInternalFreeNotification}
		"""
	)
}
val pAllocator = nullable..const..VkAllocationCallbacks_p.IN("pAllocator", "controls host memory allocation")

val VkPhysicalDeviceFeatures = struct(VULKAN_PACKAGE, "VkPhysicalDeviceFeatures") {
	documentation =
		"""
		${man("VkPhysicalDeviceFeatures")}<br>
		${spec("VkPhysicalDeviceFeatures")}

		Contains a feature flag for each of the fine-grained features that may be supported by an implementation.

		${ValidityStructs.VkPhysicalDeviceFeatures}
		"""

	VkBool32.member("robustBufferAccess", "indicates that out of bounds accesses to buffers via shader operations are well-defined")
	VkBool32.member(
		"fullDrawIndexUint32",
		"indicates the full 32-bit range of indices is supported for indexed draw calls when using a VkIndexType of #INDEX_TYPE_UINT32"
	)
	VkBool32.member(
		"imageCubeArray",
		"""
		indicates whether image views with a {@code VkImageViewType} of #IMAGE_VIEW_TYPE_CUBE_ARRAY $can be created, and that the corresponding
		<b>SampledCubeArray</b> and <b>ImageCubeArray</b> SPIR-V capabilities $can be used in shader code
		"""
	)
	VkBool32.member("independentBlend", "indicates whether the ##VkPipelineColorBlendAttachmentState settings are controlled independently per-attachment")
	VkBool32.member("geometryShader", "indicates whether geometry shaders are supported")
	VkBool32.member("tessellationShader", "indicates whether tessellation control and evaluation shaders are supported")
	VkBool32.member("sampleRateShading", "indicates whether per-sample shading and multisample interpolation are supported")
	VkBool32.member("dualSrcBlend", "indicates whether blend operations which take two sources are supported")
	VkBool32.member("logicOp", "indicates whether logic operations are supported")
	VkBool32.member("multiDrawIndirect", "indicates whether multiple draw indirect is supported")
	VkBool32.member("drawIndirectFirstInstance", "indicates whether indirect draw calls support the {@code firstInstance} parameter")
	VkBool32.member("depthClamp", "indicates whether depth clamping is supported")
	VkBool32.member("depthBiasClamp", "indicates whether depth bias clamping is supported")
	VkBool32.member("fillModeNonSolid", "indicates whether point and wireframe fill modes are supported")
	VkBool32.member("depthBounds", "indicates whether depth bounds tests are supported")
	VkBool32.member("wideLines", "indicates whether lines with width other than 1.0 are supported")
	VkBool32.member("largePoints", "indicates whether points with size greater than 1.0 are supported")
	VkBool32.member(
		"alphaToOne",
		"""
		indicates whether the implementation is able to replace the alpha value of the color fragment output from the fragment shader with the maximum
		representable alpha value for fixed-point colors or 1.0 for floating-point colors
		"""
	)
	VkBool32.member("multiViewport", "indicates whether more than one viewport is supported")
	VkBool32.member("samplerAnisotropy", "indicates whether anisotropic filtering is supported")
	VkBool32.member("textureCompressionETC2", "indicates whether the ETC2 and EAC compressed texture formats are supported")
	VkBool32.member("textureCompressionASTC_LDR", "indicates whether the ASTC LDR compressed texture formats are supported")
	VkBool32.member("textureCompressionBC", "indicates whether the BC compressed texture formats are supported")
	VkBool32.member("occlusionQueryPrecise", "indicates whether occlusion queries returning actual sample counts are supported")
	VkBool32.member("pipelineStatisticsQuery", "indicates whether the pipeline statistics queries are supported")
	VkBool32.member(
		"vertexPipelineStoresAndAtomics",
		"indicates whether storage buffers and images support stores and atomic operations in the vertex, tessellation, and geometry shader stages"
	)
	VkBool32.member(
		"fragmentStoresAndAtomics",
		"indicates whether storage buffers and images support stores and atomic operations in the fragment shader stage"
	)
	VkBool32.member(
		"shaderTessellationAndGeometryPointSize",
		"""
		indicates whether the {@code PointSize} built-in decoration is available in the tessellation control, tessellation evaluation, and geometry shader
		stages
		"""
	)
	VkBool32.member("shaderImageGatherExtended", "indicates whether the extended set of image gather instructions are available in shader code")
	VkBool32.member("shaderStorageImageExtendedFormats", "indicates whether the extended storage image formats are available in shader code")
	VkBool32.member("shaderStorageImageMultisample", "indicates whether multisampled storage images are supported")
	VkBool32.member(
		"shaderStorageImageReadWithoutFormat",
		"indicates whether storage images require a format qualifier to be specified when reading from storage images"
	)
	VkBool32.member(
		"shaderStorageImageWriteWithoutFormat",
		"indicates whether storage images require a format qualifier to be specified when writing to storage images"
	)
	VkBool32.member(
		"shaderUniformBufferArrayDynamicIndexing",
		"indicates whether arrays of uniform buffers $can be indexed by dynamically uniform integer expressions in shader code"
	)
	VkBool32.member(
		"shaderSampledImageArrayDynamicIndexing",
		"indicates whether arrays of samplers or sampled images $can be indexed by dynamically uniform integer expressions in shader code"
	)
	VkBool32.member(
		"shaderStorageBufferArrayDynamicIndexing",
		"indicates whether arrays of storage buffers $can be indexed by dynamically uniform integer expressions in shader code"
	)
	VkBool32.member(
		"shaderStorageImageArrayDynamicIndexing",
		"indicates whether arrays of storage images $can be indexed by dynamically uniform integer expressions in shader code"
	)
	VkBool32.member("shaderClipDistance", "indicates whether clip distances are supported in shader code")
	VkBool32.member("shaderCullDistance", "indicates whether cull distances are supported in shader code")
	VkBool32.member("shaderFloat64", "indicates whether 64-bit floats (doubles) are supported in shader code")
	VkBool32.member("shaderInt64", "indicates whether 64-bit integers (signed and unsigned) are supported in shader code")
	VkBool32.member("shaderInt16", "indicates whether 16-bit integers (signed and unsigned) are supported in shader code")
	VkBool32.member("shaderResourceResidency", "indicates whether image operations that return resource residency information are supported in shader code")
	VkBool32.member(
		"shaderResourceMinLod",
		"indicates whether image operations that specify the minimum resource level-of-detail (LOD) are supported in shader code"
	)
	VkBool32.member("sparseBinding", "indicates whether resource memory $can be managed at opaque sparse block level instead of at the object level")
	VkBool32.member("sparseResidencyBuffer", "indicates whether the device $can access partially resident buffers")
	VkBool32.member("sparseResidencyImage2D", "indicates whether the device $can access partially resident 2D images with 1 sample per pixel")
	VkBool32.member("sparseResidencyImage3D", "indicates whether the device $can access partially resident 3D images")
	VkBool32.member("sparseResidency2Samples", "indicates whether the physical device $can access partially resident 2D images with 2 samples per pixel")
	VkBool32.member("sparseResidency4Samples", "indicates whether the physical device $can access partially resident 2D images with 4 samples per pixel")
	VkBool32.member("sparseResidency8Samples", "indicates whether the physical device $can access partially resident 2D images with 8 samples per pixel")
	VkBool32.member("sparseResidency16Samples", "indicates whether the physical device $can access partially resident 2D images with 16 samples per pixel")
	VkBool32.member("sparseResidencyAliased", "indicates whether the physical device $can correctly access data aliased into multiple locations")
	VkBool32.member(
		"variableMultisampleRate",
		"""
		indicates whether all pipelines that will be bound to a command buffer during a subpass with no attachments must have the same value for
		##VkPipelineMultisampleStateCreateInfo{@code ::rasterizationSamples}
		"""
	)
	VkBool32.member("inheritedQueries", "indicates whether a secondary command buffer may be executed while a query is active")
}.nativeType

val VkPhysicalDeviceFeatures_p = VkPhysicalDeviceFeatures.p
val const_VkPhysicalDeviceFeatures_p = VkPhysicalDeviceFeatures.const_p

val VkFormatProperties_p = struct_p(VULKAN_PACKAGE, "VkFormatProperties", mutable = false) {
	documentation =
		"""
		${man("VkFormatProperties")}<br>
		${spec("VkFormatProperties")}

		Contains physical device properties for a {@code VkFormat}.
		"""

	VkFormatFeatureFlags.member("linearTilingFeatures", "what features are supported by #IMAGE_TILING_LINEAR images")
	VkFormatFeatureFlags.member("optimalTilingFeatures", "what features are supported by #IMAGE_TILING_OPTIMAL images")
	VkFormatFeatureFlags.member("bufferFeatures", "what features are supported by buffers")
}

val VkExtent3D = struct(VULKAN_PACKAGE, "VkExtent3D") {
	documentation =
		"""
		${man("VkExtent3D")}<br>
		${spec("VkExtent3D")}

		Describes the size of a rectangular region of pixels within a three-dimensional image or framebuffer.
		"""

	uint32_t.member("width", "the region width")
	uint32_t.member("height", "the region height")
	uint32_t.member("depth", "the region depth")
}.nativeType

val VkImageFormatProperties_p = struct_p(VULKAN_PACKAGE, "VkImageFormatProperties", mutable = false) {
	documentation =
		"""
		${man("VkImageFormatProperties")}<br>
		${spec("VkImageFormatProperties")}

		Contains additional capabilities for certain types of images.
		"""

	VkExtent3D.member("maxExtent", "the maximum image dimensions")
	uint32_t.member("maxMipLevels", "the maximum number of mipmap levels")
	uint32_t.member("maxArrayLayers", "the maximum number of array layers")
	VkSampleCountFlags.member("sampleCounts", "a bitmask of {@code VkSampleCountFlagBits} specifying all the supported sample counts for this image")
	VkDeviceSize.member("maxResourceSize", "the maximum total image size in bytes, inclusive of all subresources")
}

val VkPhysicalDeviceLimits = struct(VULKAN_PACKAGE, "VkPhysicalDeviceLimits", mutable = false) {
	documentation =
		"""
		${man("VkPhysicalDeviceLimits")}<br>
		${spec("VkPhysicalDeviceLimits")}

		Contains properties of a physical device.
		"""

	uint32_t.member("maxImageDimension1D", "the maximum dimension ({@code width}) of an image created with an {@code imageType} of #IMAGE_TYPE_1D")
	uint32_t.member(
		"maxImageDimension2D",
		"""
		the maximum dimension ({@code width} or {@code height}) of an image created with an {@code imageType} of #IMAGE_TYPE_2D and without
		#IMAGE_CREATE_CUBE_COMPATIBLE_BIT set in flags
		"""
	)
	uint32_t.member(
		"maxImageDimension3D",
		"the maximum dimension ({@code width}, {@code height}, or {@code depth}) of an image created with an {@code imageType} of #IMAGE_TYPE_3D"
	)
	uint32_t.member(
		"maxImageDimensionCube",
		"""
		the maximum dimension ({@code width} or {@code height}) of an image created with an {@code imageType} of #IMAGE_TYPE_2D and with
		#IMAGE_CREATE_CUBE_COMPATIBLE_BIT set in flags
		"""
	)
	uint32_t.member("maxImageArrayLayers", "the maximum number of layers ({@code arrayLayers}) for an image")
	uint32_t.member(
		"maxTexelBufferElements",
		"""
		the maximum number of addressable texels for a buffer view created on a buffer which was created with the #BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT or
		#BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT set in the usage member of the ##VkBufferCreateInfo structure
		"""
	)
	uint32_t.member(
		"maxUniformBufferRange",
		"""
		the maximum value that $can be specified in the range member of any ##VkDescriptorBufferInfo structures passed to a call to #UpdateDescriptorSets() for
		descriptors of type #DESCRIPTOR_TYPE_UNIFORM_BUFFER or #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC
		"""
	)
	uint32_t.member(
		"maxStorageBufferRange",
		"""
		the maximum value that $can be specified in the range member of any ##VkDescriptorBufferInfo structures passed to a call to #UpdateDescriptorSets() for
		descriptors of type #DESCRIPTOR_TYPE_STORAGE_BUFFER or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC
		"""
	)
	uint32_t.member("maxPushConstantsSize", "the maximum size, in bytes, of the pool of push constant memory")
	uint32_t.member(
		"maxMemoryAllocationCount",
		"the maximum number of device memory allocations, as created by #AllocateMemory(), which $can simultaneously exist"
	)
	uint32_t.member(
		"maxSamplerAllocationCount",
		"the maximum number of sampler objects, as created by #CreateSampler(), which $can simultaneously exist on a device"
	)
	VkDeviceSize.member(
		"bufferImageGranularity",
		"""
		the granularity, in bytes, at which buffer or linear image resources, and optimal image resources $can be bound to adjacent offsets in the same
		{@code VkDeviceMemory} object without aliasing
		"""
	)
	VkDeviceSize.member("sparseAddressSpaceSize", "the total amount of address space available, in bytes, for sparse memory resources")
	uint32_t.member("maxBoundDescriptorSets", "the maximum number of descriptor sets that $can be simultaneously used by a pipeline")
	uint32_t.member("maxPerStageDescriptorSamplers", "the maximum number of samplers that $can be accessible to a single shader stage in a pipeline layout")
	uint32_t.member(
		"maxPerStageDescriptorUniformBuffers",
		"the maximum number of uniform buffers that $can be accessible to a single shader stage in a pipeline layout"
	)
	uint32_t.member(
		"maxPerStageDescriptorStorageBuffers",
		"the maximum number of storage buffers that $can be accessible to a single shader stage in a pipeline layout"
	)
	uint32_t.member(
		"maxPerStageDescriptorSampledImages",
		"the maximum number of sampled images that $can be accessible to a single shader stage in a pipeline layout"
	)
	uint32_t.member(
		"maxPerStageDescriptorStorageImages",
		"the maximum number of storage images that $can be accessible to a single shader stage in a pipeline layout"
	)
	uint32_t.member(
		"maxPerStageDescriptorInputAttachments",
		"the maximum number of input attachments that $can be accessible to a single shader stage in a pipeline layout"
	)
	uint32_t.member("maxPerStageResources", "the maximum number of resources that $can be accessible to a single shader stage in a pipeline layout")
	uint32_t.member(
		"maxDescriptorSetSamplers",
		"""
		the maximum number of samplers that $can be included in descriptor bindings in a pipeline layout across all pipeline shader stages and descriptor set
		numbers
		"""
	)
	uint32_t.member(
		"maxDescriptorSetUniformBuffers",
		"""
		the maximum number of uniform buffers that $can be included in descriptor bindings in a pipeline layout across all pipeline shader stages and descriptor
		set numbers
		"""
	)
	uint32_t.member(
		"maxDescriptorSetUniformBuffersDynamic",
		"""
		the maximum number of dynamic uniform buffers that $can be included in descriptor bindings in a pipeline layout across all pipeline shader stages and
		descriptor set numbers
		"""
	)
	uint32_t.member(
		"maxDescriptorSetStorageBuffers",
		"""
		the maximum number of storage buffers that $can be included in descriptor bindings in a pipeline layout across all pipeline shader stages and descriptor
		set numbers
		"""
	)
	uint32_t.member(
		"maxDescriptorSetStorageBuffersDynamic",
		"""
		the maximum number of dynamic storage buffers that $can be included in descriptor bindings in a pipeline layout across all pipeline shader stages and
		descriptor set numbers
		"""
	)
	uint32_t.member(
		"maxDescriptorSetSampledImages",
		"""
		the maximum number of sampled images that $can be included in descriptor bindings in a pipeline layout across all pipeline shader stages and descriptor
		set numbers
		"""
	)
	uint32_t.member(
		"maxDescriptorSetStorageImages",
		"""
		the maximum number of storage images that $can be included in descriptor bindings in a pipeline layout across all pipeline shader stages and descriptor
		set numbers
		"""
	)
	uint32_t.member(
		"maxDescriptorSetInputAttachments",
		"""
		the maximum number of input attachments that $can be included in descriptor bindings in a pipeline layout across all pipeline shader stages and
		descriptor set numbers
		"""
	)
	uint32_t.member("maxVertexInputAttributes", "the maximum number of vertex input attributes that $can be specified for a graphics pipeline")
	uint32_t.member(
		"maxVertexInputBindings",
		"the maximum number of vertex buffers that $can be specified for providing vertex attributes to a graphics pipeline"
	)
	uint32_t.member("maxVertexInputAttributeOffset", "the maximum vertex input attribute offset that $can be added to the vertex input binding stride")
	uint32_t.member("maxVertexInputBindingStride", "the maximum vertex input binding stride that $can be specified in a vertex input binding")
	uint32_t.member("maxVertexOutputComponents", "the maximum number of components of output variables which $can be output by a vertex shader")
	uint32_t.member(
		"maxTessellationGenerationLevel",
		"the maximum tessellation generation level supported by the fixed-function tessellation primitive generator"
	)
	uint32_t.member(
		"maxTessellationPatchSize",
		"the maximum patch size, in vertices, of patches that $can be processed by the tessellation control shader and tessellation primitive generator"
	)
	uint32_t.member(
		"maxTessellationControlPerVertexInputComponents",
		"the maximum number of components of input variables which $can be provided as per-vertex inputs to the tessellation control shader stage"
	)
	uint32_t.member(
		"maxTessellationControlPerVertexOutputComponents",
		"the maximum number of components of per-vertex output variables which $can be output from the tessellation control shader stage"
	)
	uint32_t.member(
		"maxTessellationControlPerPatchOutputComponents",
		"the maximum number of components of per-patch output variables which $can be output from the tessellation control shader stage"
	)
	uint32_t.member(
		"maxTessellationControlTotalOutputComponents",
		"the maximum total number of components of per-vertex and per-patch output variables which $can be output from the tessellation control shader stage"
	)
	uint32_t.member(
		"maxTessellationEvaluationInputComponents",
		"the maximum number of components of input variables which $can be provided as per-vertex inputs to the tessellation evaluation shader stage"
	)
	uint32_t.member(
		"maxTessellationEvaluationOutputComponents",
		"the maximum number of components of per-vertex output variables which $can be output from the tessellation evaluation shader stage"
	)
	uint32_t.member("maxGeometryShaderInvocations", "the maximum invocation count supported for instanced geometry shaders")
	uint32_t.member(
		"maxGeometryInputComponents",
		"the maximum number of components of input variables which $can be provided as inputs to the geometry shader stage"
	)
	uint32_t.member("maxGeometryOutputComponents", "the maximum number of components of output variables which $can be output from the geometry shader stage")
	uint32_t.member("maxGeometryOutputVertices", "the maximum number of vertices which $can be emitted by any geometry shader")
	uint32_t.member(
		"maxGeometryTotalOutputComponents",
		"the maximum total number of components of output, across all emitted vertices, which $can be output from the geometry shader stage")
	uint32_t.member(
		"maxFragmentInputComponents",
		"the maximum number of components of input variables which $can be provided as inputs to the fragment shader stage"
	)
	uint32_t.member(
		"maxFragmentOutputAttachments",
		"the maximum number of output attachments which $can be written to by the fragment shader stage"
	)
	uint32_t.member(
		"maxFragmentDualSrcAttachments",
		"""
		the maximum number of output attachments which $can be written to by the fragment shader stage when blending is enabled and one of the dual source
		blend modes is in use
		"""
	)
	uint32_t.member(
		"maxFragmentCombinedOutputResources",
		"the total number of storage buffers, storage images, and output buffers which $can be used in the fragment shader stage"
	)
	uint32_t.member(
		"maxComputeSharedMemorySize",
		"""
		the maximum total storage size, in bytes, of all variables declared with the <b>WorkgroupLocal</b> storage class in shader modules (or with the shared
		storage qualifier in GLSL) in the compute shader stage
		"""
	)
	uint32_t.array("maxComputeWorkGroupCount", "the maximum number of local workgroups that $can be dispatched by a single dispatch command", size = 3)
	uint32_t.member("maxComputeWorkGroupInvocations", "the maximum total number of compute shader invocations in a single local workgrou")
	uint32_t.array("maxComputeWorkGroupSize", "the maximum size of a local compute workgroup, per dimension", size = 3)
	uint32_t.member("subPixelPrecisionBits", "the number of bits of subpixel precision in framebuffer coordinates x<sub>f</sub> and y<sub>f</sub>")
	uint32_t.member(
		"subTexelPrecisionBits",
		"the number of bits of precision in the division along an axis of an image used for minification and magnification filters"
	)
	uint32_t.member(
		"mipmapPrecisionBits",
		"""
		the number of bits of division that the LOD calculation for mipmap fetching get snapped to when determining the contribution from each miplevel to the
		mip filtered results
		"""
	)
	uint32_t.member("maxDrawIndexedIndexValue", "the maximum index value that $can be used for indexed draw calls when using 32-bit indices")
	uint32_t.member("maxDrawIndirectCount", "the maximum draw count that is supported for indirect draw calls")
	float.member("maxSamplerLodBias", "the maximum absolute sampler level of detail bias")
	float.member("maxSamplerAnisotropy", "the maximum degree of sampler anisotropy")
	uint32_t.member("maxViewports", "the maximum number of active viewports")
	uint32_t.array("maxViewportDimensions", "the maximum viewport dimensions in the X (width) and Y (height) dimensions, respectively", size = 2)
	float.array("viewportBoundsRange", " the {@code [minimum,maximum]} range that the corners of a viewport must be contained in", size = 2)
	uint32_t.member("viewportSubPixelBits", "the number of bits of subpixel precision for viewport bounds")
	size_t.member("minMemoryMapAlignment", "the minimum required alignment, in bytes, of host visible memory allocations within the host address space")
	VkDeviceSize.member(
		"minTexelBufferOffsetAlignment",
		"the minimum required alignment, in bytes, for the {@code offset} member of the ##VkBufferViewCreateInfo structure for texel buffers"
	)
	VkDeviceSize.member(
		"minUniformBufferOffsetAlignment",
		"the minimum required alignment, in bytes, for the {@code offset} member of the ##VkDescriptorBufferInfo structure for uniform buffers"
	)
	VkDeviceSize.member(
		"minStorageBufferOffsetAlignment",
		"the minimum required alignment, in bytes, for the {@code offset} member of the ##VkDescriptorBufferInfo structure for storage buffers"
	)
	int32_t.member(
		"minTexelOffset",
		"the minimum offset value for the {@code ConstOffset} image operand of any of the {@code OpImageSample*} or {@code OpImageFetch*} image instructions"
	)
	uint32_t.member(
		"maxTexelOffset",
		"the maximum offset value for the {@code ConstOffset} image operand of any of the {@code OpImageSample*} or {@code OpImageFetch*} image instructions"
	)
	int32_t.member(
		"minTexelGatherOffset",
		"the minimum offset value for the {@code Offset} or {@code ConstOffsets} image operands of any of the {@code OpImage*Gather} image instructions"
	)
	uint32_t.member(
		"maxTexelGatherOffset",
		"the maximum offset value for the {@code Offset} or {@code ConstOffsets} image operands of any of the {@code OpImage*Gather} image instructions"
	)
	float.member(
		"minInterpolationOffset",
		"the minimum negative offset value for the {@code offset} operand of the {@code InterpolateAtOffset} extended instruction"
	)
	float.member(
		"maxInterpolationOffset",
		"the maximum positive offset value for the {@code offset} operand of the {@code InterpolateAtOffset} extended instruction"
	)
	uint32_t.member(
		"subPixelInterpolationOffsetBits",
		"""
		the number of subpixel fractional bits that the {@code x} and {@code y} offsets to the {@code InterpolateAtOffset} extended instruction $may be rounded
		to as fixed-point values
		"""
	)
	uint32_t.member("maxFramebufferWidth", "the maximum width for a framebuffer")
	uint32_t.member("maxFramebufferHeight", "the maximum height for a framebuffer")
	uint32_t.member("maxFramebufferLayers", "the maximum layer count for a layered framebuffer")
	VkSampleCountFlags.member(
		"framebufferColorSampleCounts",
		"a bitmask of {@code VkSampleCountFlagBits} bits indicating the supported color sample counts for a framebuffer color attachment"
	)
	VkSampleCountFlags.member(
		"framebufferDepthSampleCounts",
		"""
		a bitmask of {@code VkSampleCountFlagBits} bits indicating the supported depth sample counts for a framebuffer depth/stencil attachment, when the
		format includes a depth component
		"""
	)
	VkSampleCountFlags.member(
		"framebufferStencilSampleCounts",
		"""
		a bitmask of {@code VkSampleCountFlagBits} bits indicating the supported stencil sample counts for a framebuffer depth/stencil attachment, when the
		format includes a stencil component
		"""
	)
	VkSampleCountFlags.member(
		"framebufferNoAttachmentsSampleCounts",
		"a bitmask of {@code VkSampleCountFlagBits} bits indicating the supported sample counts for a framebuffer with no attachments"
	)
	uint32_t.member("maxColorAttachments", "the maximum number of color attachments that $can be used by a subpass in a render pass")
	VkSampleCountFlags.member(
		"sampledImageColorSampleCounts",
		"a bitmask of {@code VkSampleCountFlagBits} bits indicating the sample counts supported for all images with a non-integer color format"
	)
	VkSampleCountFlags.member(
		"sampledImageIntegerSampleCounts",
		"a bitmask of {@code VkSampleCountFlagBits} bits indicating the sample counts supported for all images with a integer color format"
	)
	VkSampleCountFlags.member(
		"sampledImageDepthSampleCounts",
		"a bitmask of {@code VkSampleCountFlagBits} bits indicating the sample counts supported for all images with a depth format"
	)
	VkSampleCountFlags.member(
		"sampledImageStencilSampleCounts",
		"a bitmask of {@code VkSampleCountFlagBits} bits indicating the sample supported for all images with a stencil format"
	)
	VkSampleCountFlags.member(
		"storageImageSampleCounts",
		"a bitmask of {@code VkSampleCountFlagBits} bits indicating the sample counts supported for all images used for storage operations"
	)
	uint32_t.member("maxSampleMaskWords", "the maximum number of array elements of a variable decorated with the {@code SampleMask} built-in decoration")
	VkBool32.member("timestampComputeAndGraphics", "indicates support for timestamps on all graphics and compute queues")
	float.member("timestampPeriod", "the number of nanoseconds required for a timestamp query to be incremented by 1")
	uint32_t.member("maxClipDistances", "the maximum number of clip distances that $can be used in a single shader stage")
	uint32_t.member("maxCullDistances", "the maximum number of cull distances that $can be used in a single shader stage")
	uint32_t.member("maxCombinedClipAndCullDistances", "the maximum combined number of clip and cull distances that $can be used in a single shader stage")
	uint32_t.member(
		"discreteQueuePriorities",
		"""
		the number of discrete priorities that $can be assigned to a queue based on the value of each member of
		##VkDeviceQueueCreateInfo{@code ::pQueuePriorities}
		"""
	)
	float.array("pointSizeRange", "the range {@code [minimum,maximum]} of supported sizes for points", size = 2)
	float.array("lineWidthRange", " the range {@code [minimum,maximum]} of supported widths for lines", size = 2)
	float.member("pointSizeGranularity", "the granularity of supported point sizes")
	float.member("lineWidthGranularity", "the granularity of supported line widths")
	VkBool32.member("strictLines", "indicates whether lines are rasterized according to the preferred method of rasterization")
	VkBool32.member("standardSampleLocations", "indicates whether rasterization uses the standard sample locations")
	VkDeviceSize.member(
		"optimalBufferCopyOffsetAlignment",
		"the optimal buffer offset alignment in bytes for #CmdCopyBufferToImage() and #CmdCopyImageToBuffer()"
	)
	VkDeviceSize.member(
		"optimalBufferCopyRowPitchAlignment",
		"the optimal buffer row pitch alignment in bytes for #CmdCopyBufferToImage() and #CmdCopyImageToBuffer()"
	)
	VkDeviceSize.member("nonCoherentAtomSize", "the size and alignment in bytes that bounds concurrent access to host-mapped device memory")
}.nativeType

val VkPhysicalDeviceSparseProperties = struct(VULKAN_PACKAGE, "VkPhysicalDeviceSparseProperties", mutable = false) {
	documentation =
		"""
		${man("VkPhysicalDeviceSparseProperties")}<br>
		${spec("VkPhysicalDeviceSparseProperties")}

		Some features of the implementation are not possible to disable, and are reported to allow applications to alter their sparse resource usage
		accordingly.
		"""

	VkBool32.member(
		"residencyStandard2DBlockShape",
		"#TRUE if the physical device will access all single-sample 2D sparse resources using the standard sparse image block shapes"
	)
	VkBool32.member(
		"residencyStandard2DMultisampleBlockShape",
		"#TRUE if the physical device will access all multisample 2D sparse resources using the standard sparse image block shapes"
	)
	VkBool32.member(
		"residencyStandard3DBlockShape",
		"#TRUE if the physical device will access all 3D sparse resources using the standard sparse image block shapes"
	)
	VkBool32.member(
		"residencyAlignedMipSize",
		"""
		TRUE if images with mip level dimensions that are not integer multiples of the corresponding dimensions of the sparse image block may be placed in the
		mip tail
		"""
	)
	VkBool32.member("residencyNonResidentStrict", "whether the physical device $can consistently access non-resident regions of a resource")
}.nativeType

val VK_MAX_PHYSICAL_DEVICE_NAME_SIZE = 256
val VK_UUID_SIZE = 16
val VkPhysicalDeviceProperties_p = struct_p(VULKAN_PACKAGE, "VkPhysicalDeviceProperties", mutable = false) {
	documentation =
		"""
		${man("VkPhysicalDeviceProperties")}<br>
		${spec("VkPhysicalDeviceProperties")}

		Contains general properties of a physical device.
		"""

	uint32_t.member("apiVersion", "the version of Vulkan supported by the device")
	uint32_t.member("driverVersion", "the vendor-specified version of the driver")
	uint32_t.member("vendorID", "a unique identifier for the vendor of the physical device")
	uint32_t.member("deviceID", "a unique identifier for the physical device among devices available from the vendor")
	VkPhysicalDeviceType.member("deviceType", "a {@code VkPhysicalDeviceType} specifying the type of device")
	charUTF8.array("deviceName", "a null-terminated UTF-8 string containing the name of the device", size = VK_MAX_PHYSICAL_DEVICE_NAME_SIZE)
	uint8_t.array(
		"pipelineCacheUUID",
		"an array of size {@code VK_UUID_SIZE}, containing 8-bit values that represent a universally unique identifier for the device",
		size = VK_UUID_SIZE
	)
	VkPhysicalDeviceLimits.member("limits", "the ##VkPhysicalDeviceLimits structure which specifies device-specific limits of the physical device")
	VkPhysicalDeviceSparseProperties.member(
		"sparseProperties",
		"the ##VkPhysicalDeviceSparseProperties structure which specifies various sparse related properties of the physical device"
	)
}

val VkQueueFamilyProperties_p = struct_p(VULKAN_PACKAGE, "VkQueueFamilyProperties", mutable = false) {
	documentation =
		"""
		${man("VkQueueFamilyProperties")}<br>
		${spec("VkQueueFamilyProperties")}

		Contains properties of a queue family.
		"""

	VkQueueFlags.member("queueFlags", "contains flags indicating the capabilities of the queues in this queue family")
	uint32_t.member("queueCount", "the unsigned integer count of queues in this queue family")
	uint32_t.member("timestampValidBits", "the unsigned integer count of meaningful bits in the timestamps written via #CmdWriteTimestamp()")
	VkExtent3D.member("minImageTransferGranularity", "the minimum granularity supported for image transfer operations on the queues in this queue family")
}

val VkMemoryType = struct(VULKAN_PACKAGE, "VkMemoryType", mutable = false) {
	documentation =
		"""
		${man("VkMemoryType")}<br>
		${spec("VkMemoryType")}

		Contains information about a memory type.
		"""

	VkMemoryPropertyFlags.member("propertyFlags", "a bitmask of {@code VkMemoryPropertyFlagBits} properties for this memory type")
	uint32_t.member(
		"heapIndex",
		"""
		describes which memory heap this memory type corresponds to, and $must be less than {@code memoryHeapCount} from the ##VkPhysicalDeviceMemoryProperties
		structure
		"""
	)
}.nativeType

val VkMemoryHeap = struct(VULKAN_PACKAGE, "VkMemoryHeap", mutable = false) {
	documentation =
		"""
		${man("VkMemoryHeap")}<br>
		${spec("VkMemoryHeap")}

		Contains information about a memory heap.
		"""

	VkDeviceSize.member("size", "the total memory size in bytes in the heap")
	VkMemoryHeapFlags.member("flags", "a bitmask of {@code VkMemoryHeapFlagBits} attribute flags for the heap")
}.nativeType

val VK_MAX_MEMORY_TYPES = 32
val VK_MAX_MEMORY_HEAPS = 16
val VkPhysicalDeviceMemoryProperties_p = struct_p(VULKAN_PACKAGE, "VkPhysicalDeviceMemoryProperties", mutable = false) {
	documentation =
		"""
		${man("VkPhysicalDeviceMemoryProperties")}<br>
		${spec("VkPhysicalDeviceMemoryProperties")}

		Describes the memory heaps and memory types available to a physical device.
		"""

	AutoSize("memoryTypes")..uint32_t.member("memoryTypeCount", "the number of memory types available across all memory heaps")
	VkMemoryType.array("memoryTypes", "the memory type descriptions", size = VK_MAX_MEMORY_TYPES)
	AutoSize("memoryHeaps")..uint32_t.member("memoryHeapCount", "the number of memory heaps")
	VkMemoryHeap.array("memoryHeaps", "the memory heap descriptions", size = VK_MAX_MEMORY_HEAPS)
}

val VkDeviceQueueCreateInfo = struct(VULKAN_PACKAGE, "VkDeviceQueueCreateInfo") {
	documentation =
		"""
		${man("VkDeviceQueueCreateInfo")}<br>
		${spec("VkDeviceQueueCreateInfo")}

		Contains information about how to create a device queue.

		${ValidityStructs.VkDeviceQueueCreateInfo}
		"""

	sType()
	pNext()
	VkDeviceQueueCreateFlags.member("flags", "reserved for future use")
	uint32_t.member("queueFamilyIndex", "an unsigned integer indicating the index of the queue family to create on this device")
	AutoSize("pQueuePriorities")..uint32_t.member(
		"queueCount",
		"an unsigned integer specifying the number of queues to create in the queue family indicated by {@code queueFamilyIndex}"
	)
	float.const_p.member(
		"pQueuePriorities",
		"an array of {@code queueCount} normalized floating point values, specifying priorities of work that will be submitted to each created queue"
	)
}.nativeType
val const_VkDeviceQueueCreateInfo_p = VkDeviceQueueCreateInfo.const_p

val VkDeviceCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkDeviceCreateInfo") {
	documentation =
		"""
		${man("VkDeviceCreateInfo")}<br>
		${spec("VkDeviceCreateInfo")}

		Contains information about how to create a device.

		${ValidityStructs.VkDeviceCreateInfo}
		"""

	sType()
	pNext()
	VkDeviceCreateFlags.member("flags", "reserved for future use")
	AutoSize("pQueueCreateInfos")..uint32_t.member("queueCreateInfoCount", "the unsigned integer size of the {@code pQueueCreateInfos} array")
	const_VkDeviceQueueCreateInfo_p.buffer(
		"pQueueCreateInfos",
		"a pointer to an array of ##VkDeviceQueueCreateInfo structures describing the queues that are requested to be created along with the logical device"
	)
	AutoSize("ppEnabledLayerNames", optional = true)..uint32_t.member("enabledLayerCount", "the number of device layers to enable")
	const_charUTF8_const_p.member(
		"ppEnabledLayerNames",
		"a pointer to an array of {@code enabledLayerCount} null-terminated UTF-8 strings containing the names of layers to enable for the created device")
	AutoSize("ppEnabledExtensionNames", optional = true)..uint32_t.member("enabledExtensionCount", "the number of device extensions to enable")
	const_charUTF8_const_p.member(
		"ppEnabledExtensionNames",
		"""
		a pointer to an array of {@code enabledExtensionCount} null-terminated UTF-8 strings containing the names of extensions to enable for the created
		device
		"""
	)
	nullable..const_VkPhysicalDeviceFeatures_p.member(
		"pEnabledFeatures",
		"$NULL or a pointer to a ##VkPhysicalDeviceFeatures structure that contains boolean indicators of all the features to be enabled"
	)
}

val VK_MAX_EXTENSION_NAME_SIZE = 256
val VkExtensionProperties_p = struct_p(VULKAN_PACKAGE, "VkExtensionProperties", mutable = false) {
	documentation =
		"""
		${man("VkExtensionProperties")}<br>
		${spec("VkExtensionProperties")}

		Contains information about a physical device extension.
		"""

	charUTF8.array("extensionName", "a null-terminated string specifying the name of the extension", size = VK_MAX_EXTENSION_NAME_SIZE)
	uint32_t.member("specVersion", "the version of this extension")
}

val VK_MAX_DESCRIPTION_SIZE = 256
val VkLayerProperties_p = struct_p(VULKAN_PACKAGE, "VkLayerProperties", mutable = false) {
	documentation =
		"""
		${man("VkLayerProperties")}<br>
		${spec("VkLayerProperties")}

		Contains information about an instance layer.
		"""

	charUTF8.array("layerName", "a null-terminated UTF-8 string specifying the name of the layer", size = VK_MAX_EXTENSION_NAME_SIZE)
	uint32_t.member("specVersion", "the Vulkan version the layer was written to")
	uint32_t.member("implementationVersion", "the version of this layer")
	charUTF8.array(
		"description",
		"a null-terminated UTF-8 string providing additional details that can be used by the application to identify the layer",
		size = VK_MAX_DESCRIPTION_SIZE
	)
}

val VkSubmitInfo_p = struct_p(VULKAN_PACKAGE, "VkSubmitInfo") {
	documentation =
		"""
		${man("VkSubmitInfo")}<br>
		${spec("VkSubmitInfo")}

		Contains information about a batch of work.

		${ValidityStructs.VkSubmitInfo}
		"""

	sType()
	pNext()
	AutoSize("pWaitSemaphores", "pWaitDstStageMask", optional = true)..uint32_t.member(
		"waitSemaphoreCount",
		"the number of semaphores upon which to wait before executing the command buffers for the batch"
	)
	VkSemaphore.const_p.member("pWaitSemaphores", "a pointer to an array of semaphores upon which to wait before executing the command buffers in the batch")
	VkPipelineStageFlags.const_p.member("pWaitDstStageMask", "a pointer to an array of pipeline stages at which each corresponding semaphore wait will occur")
	AutoSize("pCommandBuffers")..uint32_t.member("commandBufferCount", "contains the number of command buffers to execute in the batch")
	VkCommandBuffer.const_p.member("pCommandBuffers", "a pointer to an array of command buffers to execute in the batch")
	AutoSize("pSignalSemaphores", optional = true)..uint32_t.member(
		"signalSemaphoreCount",
		"the number of semaphores to be signaled once the commands specified in {@code pCommandBuffers} have completed execution"
	)
	VkSemaphore.const_p.member(
		"pSignalSemaphores",
		"a pointer to an array of semaphores which will be signaled when the command buffers for this batch have completed execution"
	)
}

val VkMemoryAllocateInfo_p = struct_p(VULKAN_PACKAGE, "VkMemoryAllocateInfo") {
	documentation =
		"""
		${man("VkMemoryAllocateInfo")}<br>
		${spec("VkMemoryAllocateInfo")}

		Describes parameters of a memory allocation.

		${ValidityStructs.VkMemoryAllocateInfo}
		"""

	sType()
	pNext()
	VkDeviceSize.member("allocationSize", "the size of the allocation in bytes")
	uint32_t.member(
		"memoryTypeIndex",
		"the memory type index, which selects the properties of the memory to be allocated, as well as the heap the memory will come from"
	)
}

val VkMappedMemoryRange_p = struct_p(VULKAN_PACKAGE, "VkMappedMemoryRange") {
	documentation =
		"""
		${man("VkMappedMemoryRange")}<br>
		${spec("VkMappedMemoryRange")}

		Describes a memory range.

		${ValidityStructs.VkMappedMemoryRange}
		"""

	sType()
	pNext()
	VkDeviceMemory.member("memory", "the memory object to which this range belongs")
	VkDeviceSize.member("offset", "the zero-based byte offset from the beginning of the memory object")
	VkDeviceSize.member("size", "either the size of range, or #WHOLE_SIZE to affect the range from offset to the end of the current mapping of the allocation")
}

val VkMemoryRequirements_p = struct_p(VULKAN_PACKAGE, "VkMemoryRequirements", mutable = false) {
	documentation =
		"""
		${man("VkMemoryRequirements")}<br>
		${spec("VkMemoryRequirements")}

		Contains information about the memory requirements of an object.
		"""

	VkDeviceSize.member("size", "the size, in bytes, of the memory allocation required for the resource")
	VkDeviceSize.member("alignment", "the alignment, in bytes, of the offset within the allocation required for the resource")
	uint32_t.member("memoryTypeBits", "a bitfield and contains one bit set for every supported memory type for the resource")
}

val VkSparseImageFormatProperties = struct(VULKAN_PACKAGE, "VkSparseImageFormatProperties", mutable = false) {
	documentation =
		"""
		${man("VkSparseImageFormatProperties")}<br>
		${spec("VkSparseImageFormatProperties")}

		Describes properties for a set of image aspects that are bound simultaneously in an image.
		"""

	VkImageAspectFlags.member("aspectMask", "a {@code VkImageAspectFlags} specifying which aspects of the image the properties apply to")
	VkExtent3D.member("imageGranularity", "the width, height, and depth of the sparse image block in texels or compressed texel blocks")
	VkSparseImageFormatFlags.member("flags", "a {@code VkSparseImageFormatFlagBits} bitmask specifying additional information about the sparse resource")
}.nativeType
val VkSparseImageFormatProperties_p = VkSparseImageFormatProperties.p

val VkSparseImageMemoryRequirements_p = struct_p(VULKAN_PACKAGE, "VkSparseImageMemoryRequirements", mutable = false) {
	documentation =
		"""
		${man("VkSparseImageMemoryRequirements")}<br>
		${spec("VkSparseImageMemoryRequirements")}

		Describes the sparse memory requirements for a group of aspects of an image.
		"""

	VkSparseImageFormatProperties.member("formatProperties", "the format properties")
	uint32_t.member("imageMipTailFirstLod", "the first mip level at which subresources are included in the mip tail region")
	VkDeviceSize.member("imageMipTailSize", "the memory size (in bytes) of the mip tail region")
	VkDeviceSize.member("imageMipTailOffset", "he opaque memory offset used with ##VkSparseImageOpaqueMemoryBindInfo to bind the mip tail region(s)")
	VkDeviceSize.member(
		"imageMipTailStride",
		"""
		the offset stride between each array-layer’s mip tail, if {@code formatProperties.flags} does not contain #SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT
		(otherwise the value is undefined)
		"""
	)
}

val VkSparseMemoryBind = struct(VULKAN_PACKAGE, "VkSparseMemoryBind") {
	documentation =
		"""
		${man("VkSparseMemoryBind")}<br>
		${spec("VkSparseMemoryBind")}

		Describes a sparse memory binding.

		${ValidityStructs.VkSparseMemoryBind}
		"""

	VkDeviceSize.member("resourceOffset", "the offset into the resource")
	VkDeviceSize.member("size", "the size of the memory region to be bound")
	VkDeviceMemory.member("memory", "the {@code VkDeviceMemory} object that the range of the resource is bound to")
	VkDeviceSize.member("memoryOffset", "the offset into the {@code VkDeviceMemory} object to bind the resource range to")
	VkSparseMemoryBindFlags.member("flags", "are sparse memory binding flags")
}.nativeType

val VkSparseBufferMemoryBindInfo = struct(VULKAN_PACKAGE, "VkSparseBufferMemoryBindInfo") {
	documentation =
		"""
		${man("VkSparseBufferMemoryBindInfo")}<br>
		${spec("VkSparseBufferMemoryBindInfo")}

		Describes a memory binding to a {@code VkBuffer} object.

		${ValidityStructs.VkSparseBufferMemoryBindInfo}
		"""

	VkBuffer.member("buffer", "the {@code VkBuffer} object to be bound")
	AutoSize("pBinds")..uint32_t.member("bindCount", "the number of {@code VkSparseMemoryBind} structures in the {@code pBinds} array")
	VkSparseMemoryBind.const_p.buffer("pBinds", "a pointer to array of ##VkSparseMemoryBind structures")
}.nativeType

val VkSparseImageOpaqueMemoryBindInfo = struct(VULKAN_PACKAGE, "VkSparseImageOpaqueMemoryBindInfo") {
	documentation =
		"""
		${man("VkSparseImageOpaqueMemoryBindInfo")}<br>
		${spec("VkSparseImageOpaqueMemoryBindInfo")}

		Describes a memory binding to an opaque region of a {@code VkImage} object.

		${ValidityStructs.VkSparseImageOpaqueMemoryBindInfo}
		"""

	VkImage.member("image", "the {@code VkImage} object to be bound")
	AutoSize("pBinds")..uint32_t.member("bindCount", "the number of {@code VkSparseMemoryBind} structures in the {@code pBinds} array")
	VkSparseMemoryBind.const_p.buffer("pBinds", " a pointer to array of ##VkSparseMemoryBind structures")
}.nativeType

val VkSparseImageMemoryBindInfo = struct(VULKAN_PACKAGE, "VkSparseImageMemoryBindInfo") {
	documentation =
		"""
		${man("VkSparseImageMemoryBindInfo")}<br>
		${spec("VkSparseImageMemoryBindInfo")}

		Describes a memory binding to a sparse image block of a {@code VkImage} object.

		${ValidityStructs.VkSparseImageMemoryBindInfo}
		"""

	VkImage.member("image", "the {@code VkImage} object to be bound")
	AutoSize("pBinds")..uint32_t.member("bindCount", "the number of {@code VkSparseImageMemoryBind} structures in {@code pBinds} array")
	VkSparseMemoryBind.const_p.buffer("pBinds", "a pointer to array of ##VkSparseImageMemoryBind structures")
}.nativeType

val VkBindSparseInfo_p = struct_p(VULKAN_PACKAGE, "VkBindSparseInfo") {
	documentation =
		"""
		${man("VkBindSparseInfo")}<br>
		${spec("VkBindSparseInfo")}

		Describes a set of sparse binding operations.

		${ValidityStructs.VkBindSparseInfo}
		"""

	sType()
	pNext()
	AutoSize("pWaitSemaphores", optional = true)..uint32_t.member(
		"waitSemaphoreCount",
		"the number of semaphores upon which to wait before executing the sparse binding operations for the batch"
	)
	VkSemaphore.const_p.member(
		"pWaitSemaphores",
		"a pointer to an array of semaphores upon which to wait before executing the sparse binding operations in the batch"
	)
	AutoSize("pBufferBinds", optional = true)..uint32_t.member("bufferBindCount", "the number of sparse buffer bindings to perform")
	VkSparseBufferMemoryBindInfo.const_p.buffer(
		"pBufferBinds",
		"an array of ##VkSparseBufferMemoryBindInfo structures, indicating sparse buffer bindings to perform"
	)
	AutoSize("pImageOpaqueBinds", optional = true)..uint32_t.member("imageOpaqueBindCount", "the number of opaque sparse image bindings to perform")
	VkSparseImageOpaqueMemoryBindInfo.const_p.buffer(
		"pImageOpaqueBinds",
		"an array of ##VkSparseImageOpaqueMemoryBindInfo structures, indicating opaque sparse image bindings to perform"
	)
	AutoSize("pImageBinds", optional = true)..uint32_t.member("imageBindCount", "the number of sparse image bindings to perform")
	VkSparseImageMemoryBindInfo.const_p.buffer(
		"pImageBinds",
		"an array of ##VkSparseImageMemoryBindInfo structures, indicating sparse image bindings to perform"
	)
	AutoSize("pSignalSemaphores", optional = true)..uint32_t.member(
		"signalSemaphoreCount",
		"the number of semaphores to be signaled once the sparse binding operations specified by the structure have completed execution"
	)
	VkSemaphore.const_p.member(
		"pSignalSemaphores",
		"a pointer to an array of semaphores which will be signaled when the sparse binding operations for this batch have completed execution"
	)
}

val VkFenceCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkFenceCreateInfo") {
	documentation =
		"""
		${man("VkFenceCreateInfo")}<br>
		${spec("VkFenceCreateInfo")}

		Contains information about how a fence object should be created.

		${ValidityStructs.VkFenceCreateInfo}
		"""

	sType()
	pNext()
	VkFenceCreateFlags.member("flags", "contains {@code VkFenceCreateFlags} flags defining the initial state and behavior of the fence")
}

val VkSemaphoreCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkSemaphoreCreateInfo") {
	documentation =
		"""
		${man("VkSemaphoreCreateInfo")}<br>
		${spec("VkSemaphoreCreateInfo")}

		Contains information about how a semaphore object should be created.

		${ValidityStructs.VkSemaphoreCreateInfo}
		"""

	sType()
	pNext()
	VkSemaphoreCreateFlags.member("flags", "reserved for future use")
}

val VkEventCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkEventCreateInfo") {
	documentation =
		"""
		${man("VkEventCreateInfo")}<br>
		${spec("VkEventCreateInfo")}

		Contains information about how an event object should be created.

		${ValidityStructs.VkEventCreateInfo}
		"""

	sType()
	pNext()
	VkEventCreateFlags.member("flags", "reserved for future use")
}

val VkQueryPoolCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkQueryPoolCreateInfo") {
	documentation =
		"""
		${man("VkQueryPoolCreateInfo")}<br>
		${spec("VkQueryPoolCreateInfo")}

		Contains information about how a query pool object should be created.

		${ValidityStructs.VkQueryPoolCreateInfo}
		"""

	sType()
	pNext()
	VkQueryPoolCreateFlags.member("flags", "reserved for future use")
	VkQueryType.member("queryType", "the {@code VkQueryType} type of queries managed by the pool")
	uint32_t.member("queryCount", "the number of queries managed by the pool")
	VkQueryPipelineStatisticFlags.member("pipelineStatistics", "a bitmask indicating which counters will be returned in queries on the new pool")
}

val VkBufferCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkBufferCreateInfo") {
	documentation =
		"""
		${man("VkBufferCreateInfo")}<br>
		${spec("VkBufferCreateInfo")}

		Contains information about how a buffer should be created.

		${ValidityStructs.VkBufferCreateInfo}
		"""

	sType()
	pNext()
	VkBufferCreateFlags.member("flags", "a {@code VkBufferCreateFlagBits} bitfield describing additional parameters of the buffer")
	VkDeviceSize.member("size", "the size in bytes of the buffer to be created")
	VkBufferUsageFlags.member("usage", "a {@code VkBufferUsageFlagBits} bitfield describing the allowed usages of the buffer")
	VkSharingMode.member("sharingMode", "the sharing mode of the buffer when it will be accessed by multiple queue families")
	AutoSize("pQueueFamilyIndices", optional = true)..uint32_t.member(
		"queueFamilyIndexCount",
		"the number of entries in the {@code pQueueFamilyIndices} array"
	)
	uint32_t.const_p.member(
		"pQueueFamilyIndices",
		"a list of queue families that will access this buffer (ignored if {@code sharingMode} is not #SHARING_MODE_CONCURRENT)"
	)
}

val VkBufferViewCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkBufferViewCreateInfo") {
	documentation =
		"""
		${man("VkBufferViewCreateInfo")}<br>
		${spec("VkBufferViewCreateInfo")}

		Contains information about how a buffer view should be created.

		${ValidityStructs.VkBufferViewCreateInfo}
		"""

	sType()
	pNext()
	VkBufferViewCreateFlags.member("flags", "reserved for future use")
	VkBuffer.member("buffer", "a {@code VkBuffer} on which the view will be created")
	VkFormat.member("format", "a {@code VkFormat} describing the format of the data elements in the buffer")
	VkDeviceSize.member("offset", "an offset in bytes from the base address of the buffer")
	VkDeviceSize.member("range", "a size in bytes of the buffer view")
}

val VkImageCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkImageCreateInfo") {
	documentation =
		"""
		${man("VkImageCreateInfo")}<br>
		${spec("VkImageCreateInfo")}

		Contains information about how an image should be created.

		${ValidityStructs.VkImageCreateInfo}
		"""

	sType()
	pNext()
	VkImageCreateFlags.member("flags", "a {@code VkImageCreateFlagBits} bitfield describing additional parameters of the image")
	VkImageType.member("imageType", "the basic dimensionality of the image")
	VkFormat.member("format", "a {@code VkFormat} describing the format and type of the data elements that will be contained in the image")
	VkExtent3D.member("extent", "a ##VkExtent3D describing the number of data elements in each dimension of the base level")
	uint32_t.member("mipLevels", "the number of levels of detail available for minified sampling of the image")
	uint32_t.member("arrayLayers", "the number of layers in the image")
	VkSampleCountFlagBits.member("samples", "the number of sub-data element samples in the image as defined in {@code VkSampleCountFlagBits}")
	VkImageTiling.member("tiling", "the tiling arrangement of the data elements in memory")
	VkImageUsageFlags.member("usage", "a bitfield describing the intended usage of the image")
	VkSharingMode.member("sharingMode", "the sharing mode of the image when it will be accessed by multiple queue families")
	AutoSize("pQueueFamilyIndices", optional = true)..uint32_t.member(
		"queueFamilyIndexCount",
		"the number of entries in the {@code pQueueFamilyIndices} array"
	)
	uint32_t.const_p.member(
		"pQueueFamilyIndices",
		"a list of queue families that will access this image (ignored if {@code sharingMode} is not #SHARING_MODE_CONCURRENT)"
	)
	VkImageLayout.member("initialLayout", "selects the initial {@code VkImageLayout} state of all subresources of the image")
}

val VkImageSubresource_p = struct_p(VULKAN_PACKAGE, "VkImageSubresource") {
	documentation =
		"""
		${man("VkImageSubresource")}<br>
		${spec("VkImageSubresource")}

		Selects a specific image of a subresource (mipLevel/arrayLayer) of an image created with linear tiling.

		${ValidityStructs.VkImageSubresource}
		"""

	VkImageAspectFlags.member("aspectMask", "a {@code VkImageAspectFlags} selecting the image aspect")
	uint32_t.member("mipLevel", "selects the mipmap level")
	uint32_t.member("arrayLayer", "selects the array layer")
}

val VkSubresourceLayout_p = struct_p(VULKAN_PACKAGE, "VkSubresourceLayout", mutable = false) {
	documentation =
		"""
		${man("VkSubresourceLayout")}<br>
		${spec("VkSubresourceLayout")}

		Contains information about the layout of a subresource (mipLevel/arrayLayer) of an image created with linear tiling.
		"""

	VkDeviceSize.member("offset", "the byte offset from the start of the image where the subresource begins")
	VkDeviceSize.member("size", "the size in bytes of the subresource")
	VkDeviceSize.member("rowPitch", "the number of bytes between each row of texels in an image")
	VkDeviceSize.member("arrayPitch", "the number of bytes between each array layer of an image")
	VkDeviceSize.member("depthPitch", "the number of bytes between each slice of 3D image")
}

val VkComponentMapping = struct(VULKAN_PACKAGE, "VkComponentMapping") {
	documentation =
		"""
		${man("VkComponentMapping")}<br>
		${spec("VkComponentMapping")}

		Describes a remapping from components of the image to components of the vector returned by shader image instructions.

		${ValidityStructs.VkComponentMapping}
		"""

	VkComponentSwizzle.member("r", "the value placed in the r component of the output vector")
	VkComponentSwizzle.member("g", "the value placed in the g component of the output vector")
	VkComponentSwizzle.member("b", "the value placed in the b component of the output vector")
	VkComponentSwizzle.member("a", "the value placed in the a component of the output vector")
}.nativeType

val VkImageSubresourceRange = struct(VULKAN_PACKAGE, "VkImageSubresourceRange") {
	documentation =
		"""
		${man("VkImageSubresourceRange")}<br>
		${spec("VkImageSubresourceRange")}

		Describes a range of mipmap levels, array layers, and aspects.

		${ValidityStructs.VkImageSubresourceRange}
		"""

	VkImageAspectFlags.member("aspectMask", "a bitmask indicating which aspect(s) of the image are included in the view")
	uint32_t.member("baseMipLevel", "the first mipmap level accessible to the view")
	uint32_t.member("levelCount", "the number of mipmap levels (starting from {@code baseMipLevel}) accessible to the view")
	uint32_t.member("baseArrayLayer", "the first array layer accessible to the view")
	uint32_t.member("layerCount", "the number of array layers (starting from {@code baseArrayLayer}) accessible to the view")
}.nativeType
val VkImageSubresourceRange_p = VkImageSubresourceRange.p

val VkImageViewCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkImageViewCreateInfo") {
	documentation =
		"""
		${man("VkImageViewCreateInfo")}<br>
		${spec("VkImageViewCreateInfo")}

		${ValidityStructs.VkImageViewCreateInfo}
		"""

	sType()
	pNext()
	VkImageViewCreateFlags.member("flags", "reserved for future use")
	VkImage.member("image", "a {@code VkImage} on which the view will be created")
	VkImageViewType.member("viewType", "the type of the image view")
	VkFormat.member("format", "a {@code VkFormat} describing the format and type used to interpret data elements in the image")
	VkComponentMapping.member(
		"components",
		"a remapping of color components (or of depth or stencil components after they have been converted into color components)"
	)
	VkImageSubresourceRange.member("subresourceRange", "selects the set of mipmap levels and array layers to be accessible to the view")
}

val VkShaderModuleCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkShaderModuleCreateInfo") {
	documentation =
		"""
		${man("VkShaderModuleCreateInfo")}<br>
		${spec("VkShaderModuleCreateInfo")}

		Contains information about how a shader module should be created.

		${ValidityStructs.VkShaderModuleCreateInfo}
		"""

	sType()
	pNext()
	VkShaderModuleCreateFlags.member("flags", "reserved for future use")
	AutoSize("pCode")..size_t.member("codeSize", "the size, in bytes, of the code pointed to by {@code pCode}")
	PointerType("const uint32_t", PointerMapping.DATA_BYTE).member("pCode", "points to code that is used to create the shader module")
}

val VkPipelineCacheCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkPipelineCacheCreateInfo") {
	documentation =
		"""
		${man("VkPipelineCacheCreateInfo")}<br>
		${spec("VkPipelineCacheCreateInfo")}

		Contains information about how a pipeline cache object should be created.

		${ValidityStructs.VkPipelineCacheCreateInfo}
		"""

	sType()
	pNext()
	VkPipelineCacheCreateFlags.member("flags", "reserved for future use")
	AutoSize("pInitialData", optional = true)..size_t.member("initialDataSize", "the number of bytes in {@code pInitialData}")
	const_void_p.member("pInitialData", "a pointer to previously retrieved pipeline cache data")
}

val VkSpecializationMapEntry = struct(VULKAN_PACKAGE, "VkSpecializationMapEntry") {
	documentation =
		"""
		${man("VkSpecializationMapEntry")}<br>
		${spec("VkSpecializationMapEntry")}

		Contains information about a specialization constant.
		"""

	uint32_t.member("constantID", "ID of the specialization constant in SPIR-V")
	uint32_t.member("offset", "byte offset of the specialization constant value within the supplied data buffer")
	size_t.member("size", "byte size of the specialization constant value within the supplied data buffer")
}.nativeType

val VkSpecializationInfo = struct(VULKAN_PACKAGE, "VkSpecializationInfo") {
	documentation =
		"""
		${man("VkSpecializationInfo")}<br>
		${spec("VkSpecializationInfo")}

		Contains information about specialization constants.

		Specialization constants are a mechanism whereby constants in a SPIR-V module can have their constant value specified at the time the
		{@code VkPipeline} is created. This allows a SPIR-V module to have constants that can be modified while executing an application that uses the Vulkan
		API.

		${ValidityStructs.VkSpecializationInfo}
		"""

	AutoSize("pMapEntries", optional = true)..uint32_t.member("mapEntryCount", "the number of entries in the {@code pMapEntries} array")
	VkSpecializationMapEntry.const_p.buffer(
		"pMapEntries",
		"a pointer to an array of ##VkSpecializationMapEntry which maps constant IDs to offsets in {@code pData}"
	)
	AutoSize("pData", optional = true)..size_t.member("dataSize", "the byte size of the {@code pData} buffer")
	const_void_p.member("pData", "contains the actual constant values to specialize with")
}.nativeType

val VkPipelineShaderStageCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineShaderStageCreateInfo") {
	documentation =
		"""
		${man("VkPipelineShaderStageCreateInfo")}<br>
		${spec("VkPipelineShaderStageCreateInfo")}

		Contains information about how a shader stage should be created.

		${ValidityStructs.VkPipelineShaderStageCreateInfo}
		"""

	sType()
	pNext()
	VkPipelineShaderStageCreateFlags.member("flags", "reserved for future use")
	VkShaderStageFlagBits.member("stage", "a {@code VkShaderStageFlagBits} naming the pipeline stage")
	VkShaderModule.member("module", "a {@code VkShaderModule} object that contains the shader for this stage")
	const_charUTF8_p.member("pName", "a pointer to a null-terminated UTF-8 string specifying the entry point name of the shader for this stage")
	nullable..VkSpecializationInfo.const_p.member("pSpecializationInfo", "a pointer to ##VkSpecializationInfo, can be $NULL")
}.nativeType

val VkVertexInputBindingDescription = struct(VULKAN_PACKAGE, "VkVertexInputBindingDescription") {
	documentation =
		"""
		${man("VkVertexInputBindingDescription")}<br>
		${spec("VkVertexInputBindingDescription")}

		${ValidityStructs.VkVertexInputBindingDescription}
		"""

	uint32_t.member("binding", "")
	uint32_t.member("stride", "")
	VkVertexInputRate.member("inputRate", "")
}.nativeType

val VkVertexInputAttributeDescription = struct(VULKAN_PACKAGE, "VkVertexInputAttributeDescription") {
	documentation =
		"""
		${man("VkVertexInputAttributeDescription")}<br>
		${spec("VkVertexInputAttributeDescription")}

		${ValidityStructs.VkVertexInputAttributeDescription}
		"""

	uint32_t.member("location", "")
	uint32_t.member("binding", "")
	VkFormat.member("format", "")
	uint32_t.member("offset", "")
}.nativeType

val VkPipelineVertexInputStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineVertexInputStateCreateInfo") {
	documentation =
		"""
		${man("VkPipelineVertexInputStateCreateInfo")}<br>
		${spec("VkPipelineVertexInputStateCreateInfo")}

		${ValidityStructs.VkPipelineVertexInputStateCreateInfo}
		"""

	sType()
	pNext()
	VkPipelineVertexInputStateCreateFlags.member("flags", "")
	AutoSize("pVertexBindingDescriptions", optional = true)..uint32_t.member("vertexBindingDescriptionCount", "")
	VkVertexInputBindingDescription.const_p.buffer("pVertexBindingDescriptions", "")
	AutoSize("pVertexAttributeDescriptions", optional = true)..uint32_t.member("vertexAttributeDescriptionCount", "")
	VkVertexInputAttributeDescription.const_p.buffer("pVertexAttributeDescriptions", "")
}.nativeType

val VkPipelineInputAssemblyStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineInputAssemblyStateCreateInfo") {
	documentation =
		"""
		${man("VkPipelineInputAssemblyStateCreateInfo")}<br>
		${spec("VkPipelineInputAssemblyStateCreateInfo")}

		${ValidityStructs.VkPipelineInputAssemblyStateCreateInfo}
		"""

	sType()
	pNext()
	VkPipelineInputAssemblyStateCreateFlags.member("flags", "")
	VkPrimitiveTopology.member("topology", "")
	VkBool32.member("primitiveRestartEnable", "")
}.nativeType

val VkPipelineTessellationStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineTessellationStateCreateInfo") {
	documentation =
		"""
		${man("VkPipelineTessellationStateCreateInfo")}<br>
		${spec("VkPipelineTessellationStateCreateInfo")}

		${ValidityStructs.VkPipelineTessellationStateCreateInfo}
		"""

	sType()
	pNext()
	VkPipelineTessellationStateCreateFlags.member("flags", "")
	uint32_t.member("patchControlPoints", "")
}.nativeType

val VkViewport = struct(VULKAN_PACKAGE, "VkViewport") {
	documentation =
		"""
		${man("VkViewport")}<br>
		${spec("VkViewport")}

		${ValidityStructs.VkViewport}
		"""

	float.member("x", "")
	float.member("y", "")
	float.member("width", "")
	float.member("height", "")
	float.member("minDepth", "")
	float.member("maxDepth", "")
}.nativeType

val VkOffset2D = struct(VULKAN_PACKAGE, "VkOffset2D") {
	documentation =
		"""
		${man("VkOffset2D")}<br>
		${spec("VkOffset2D")}
		"""

	int32_t.member("x", "")
	int32_t.member("y", "")
}.nativeType

val VkExtent2D = struct(VULKAN_PACKAGE, "VkExtent2D") {
	documentation =
		"""
		${man("VkExtent2D")}<br>
		${spec("VkExtent2D")}
		"""

	uint32_t.member("width", "")
	uint32_t.member("height", "")
}.nativeType

val VkRect2D = struct(VULKAN_PACKAGE, "VkRect2D") {
	documentation =
		"""
		${man("VkRect2D")}<br>
		${spec("VkRect2D")}
		"""

	VkOffset2D.member("offset", "")
	VkExtent2D.member("extent", "")
}.nativeType

val VkPipelineViewportStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineViewportStateCreateInfo") {
	documentation =
		"""
		${man("VkPipelineViewportStateCreateInfo")}<br>
		${spec("VkPipelineViewportStateCreateInfo")}

		${ValidityStructs.VkPipelineViewportStateCreateInfo}
		"""

	sType()
	pNext()
	VkPipelineViewportStateCreateFlags.member("flags", "")
	AutoSize("pViewports")..uint32_t.member("viewportCount", "")
	nullable..VkViewport.const_p.buffer("pViewports", "")
	AutoSize("pScissors")..uint32_t.member("scissorCount", "")
	nullable..VkRect2D.const_p.buffer("pScissors", "")
}.nativeType

val VkPipelineRasterizationStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineRasterizationStateCreateInfo") {
	documentation =
		"""
		${man("VkPipelineRasterizationStateCreateInfo")}<br>
		${spec("VkPipelineRasterizationStateCreateInfo")}

		${ValidityStructs.VkPipelineRasterizationStateCreateInfo}
		"""

	sType()
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
	documentation =
		"""
		${man("VkPipelineMultisampleStateCreateInfo")}<br>
		${spec("VkPipelineMultisampleStateCreateInfo")}

		${ValidityStructs.VkPipelineMultisampleStateCreateInfo}
		"""

	sType()
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
	documentation =
		"""
		${man("VkStencilOpState")}<br>
		${spec("VkStencilOpState")}

		${ValidityStructs.VkStencilOpState}
		"""

	VkStencilOp.member("failOp", "")
	VkStencilOp.member("passOp", "")
	VkStencilOp.member("depthFailOp", "")
	VkCompareOp.member("compareOp", "")
	uint32_t.member("compareMask", "")
	uint32_t.member("writeMask", "")
	uint32_t.member("reference", "")
}.nativeType

val VkPipelineDepthStencilStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineDepthStencilStateCreateInfo") {
	documentation =
		"""
		${man("VkPipelineDepthStencilStateCreateInfo")}<br>
		${spec("VkPipelineDepthStencilStateCreateInfo")}

		${ValidityStructs.VkPipelineDepthStencilStateCreateInfo}
		"""

	sType()
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
	documentation =
		"""
		${man("VkPipelineColorBlendAttachmentState")}<br>
		${spec("VkPipelineColorBlendAttachmentState")}

		${ValidityStructs.VkPipelineColorBlendAttachmentState}
		"""

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
	documentation =
		"""
		${man("VkPipelineColorBlendStateCreateInfo")}<br>
		${spec("VkPipelineColorBlendStateCreateInfo")}

		${ValidityStructs.VkPipelineColorBlendStateCreateInfo}
		"""

	sType()
	pNext()
	VkPipelineColorBlendStateCreateFlags.member("flags", "")
	VkBool32.member("logicOpEnable", "")
	VkLogicOp.member("logicOp", "")
	AutoSize("pAttachments", optional = true)..uint32_t.member("attachmentCount", "")
	VkPipelineColorBlendAttachmentState.const_p.buffer("pAttachments", "")
	float.array("blendConstants", "", size = 4)
}.nativeType

val VkPipelineDynamicStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineDynamicStateCreateInfo") {
	documentation =
		"""
		${man("VkPipelineDynamicStateCreateInfo")}<br>
		${spec("VkPipelineDynamicStateCreateInfo")}

		${ValidityStructs.VkPipelineDynamicStateCreateInfo}
		"""

	sType()
	pNext()
	VkPipelineDynamicStateCreateFlags.member("flags", "")
	AutoSize("pDynamicStates")..uint32_t.member("dynamicStateCount", "")
	VkDynamicState.const_p.member("pDynamicStates", "")
}.nativeType

val VkGraphicsPipelineCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkGraphicsPipelineCreateInfo") {
	documentation =
		"""
		${man("VkGraphicsPipelineCreateInfo")}<br>
		${spec("VkGraphicsPipelineCreateInfo")}

		${ValidityStructs.VkGraphicsPipelineCreateInfo}
		"""

	sType()
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
	documentation =
		"""
		${man("VkComputePipelineCreateInfo")}<br>
		${spec("VkComputePipelineCreateInfo")}

		${ValidityStructs.VkComputePipelineCreateInfo}
		"""

	sType()
	pNext()
	VkPipelineCreateFlags.member("flags", "")
	VkPipelineShaderStageCreateInfo.member("stage", "")
	VkPipelineLayout.member("layout", "")
	VkPipeline.member("basePipelineHandle", "")
	int32_t.member("basePipelineIndex", "")
}

val VkPushConstantRange = struct(VULKAN_PACKAGE, "VkPushConstantRange") {
	documentation =
		"""
		${man("VkPushConstantRange")}<br>
		${spec("VkPushConstantRange")}

		${ValidityStructs.VkPushConstantRange}
		"""

	VkShaderStageFlags.member("stageFlags", "")
	uint32_t.member("offset", "")
	uint32_t.member("size", "")
}.nativeType

val VkPipelineLayoutCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkPipelineLayoutCreateInfo") {
	documentation =
		"""
		${man("VkPipelineLayoutCreateInfo")}<br>
		${spec("VkPipelineLayoutCreateInfo")}

		${ValidityStructs.VkPipelineLayoutCreateInfo}
		"""

	sType()
	pNext()
	VkPipelineLayoutCreateFlags.member("flags", "")
	AutoSize("pSetLayouts", optional = true)..uint32_t.member("setLayoutCount", "")
	VkDescriptorSetLayout.const_p.member("pSetLayouts", "")
	AutoSize("pPushConstantRanges", optional = true)..uint32_t.member("pushConstantRangeCount", "")
	VkPushConstantRange.const_p.buffer("pPushConstantRanges", "")
}

val VkSamplerCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkSamplerCreateInfo") {
	documentation =
		"""
		${man("VkSamplerCreateInfo")}<br>
		${spec("VkSamplerCreateInfo")}

		${ValidityStructs.VkSamplerCreateInfo}
		"""

	sType()
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
	documentation =
		"""
		${man("VkDescriptorSetLayoutBinding")}<br>
		${spec("VkDescriptorSetLayoutBinding")}

		${ValidityStructs.VkDescriptorSetLayoutBinding}
		"""

	uint32_t.member("binding", "")
	VkDescriptorType.member("descriptorType", "")
	uint32_t.member("descriptorCount", "")
	VkShaderStageFlags.member("stageFlags", "")
	nullable..VkSampler.const_p.member("pImmutableSamplers", "")
}.nativeType

val VkDescriptorSetLayoutCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkDescriptorSetLayoutCreateInfo") {
	documentation =
		"""
		${man("VkDescriptorSetLayoutCreateInfo")}<br>
		${spec("VkDescriptorSetLayoutCreateInfo")}

		${ValidityStructs.VkDescriptorSetLayoutCreateInfo}
		"""

	sType()
	pNext()
	VkDescriptorSetLayoutCreateFlags.member("flags", "")
	AutoSize("pBindings", optional = true)..uint32_t.member("bindingCount", "")
	VkDescriptorSetLayoutBinding.const_p.buffer("pBindings", "")
}

val VkDescriptorPoolSize = struct(VULKAN_PACKAGE, "VkDescriptorPoolSize") {
	documentation =
		"""
		${man("VkDescriptorPoolSize")}<br>
		${spec("VkDescriptorPoolSize")}

		${ValidityStructs.VkDescriptorPoolSize}
		"""

	VkDescriptorType.member("type", "")
	uint32_t.member("descriptorCount", "")
}.nativeType

val VkDescriptorPoolCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkDescriptorPoolCreateInfo") {
	documentation =
		"""
		${man("VkDescriptorPoolCreateInfo")}<br>
		${spec("VkDescriptorPoolCreateInfo")}

		${ValidityStructs.VkDescriptorPoolCreateInfo}
		"""

	sType()
	pNext()
	VkDescriptorPoolCreateFlags.member("flags", "")
	uint32_t.member("maxSets", "")
	AutoSize("pPoolSizes")..uint32_t.member("poolSizeCount", "")
	VkDescriptorPoolSize.const_p.buffer("pPoolSizes", "")
}

val VkDescriptorSetAllocateInfo_p = struct_p(VULKAN_PACKAGE, "VkDescriptorSetAllocateInfo") {
	documentation =
		"""
		${man("VkDescriptorSetAllocateInfo")}<br>
		${spec("VkDescriptorSetAllocateInfo")}

		${ValidityStructs.VkDescriptorSetAllocateInfo}
		"""

	sType()
	pNext()
	VkDescriptorPool.member("descriptorPool", "")
	AutoSize("pSetLayouts")..uint32_t.member("descriptorSetCount", "")
	VkDescriptorSetLayout.const_p.member("pSetLayouts", "")
}

val VkDescriptorImageInfo = struct(VULKAN_PACKAGE, "VkDescriptorImageInfo") {
	documentation =
		"""
		${man("VkDescriptorImageInfo")}<br>
		${spec("VkDescriptorImageInfo")}

		${ValidityStructs.VkDescriptorImageInfo}
		"""

	VkSampler.member("sampler", "")
	VkImageView.member("imageView", "")
	VkImageLayout.member("imageLayout", "")
}.nativeType

val VkDescriptorBufferInfo = struct(VULKAN_PACKAGE, "VkDescriptorBufferInfo") {
	documentation =
		"""
		${man("VkDescriptorBufferInfo")}<br>
		${spec("VkDescriptorBufferInfo")}

		${ValidityStructs.VkDescriptorBufferInfo}
		"""

	VkBuffer.member("buffer", "")
	VkDeviceSize.member("offset", "")
	VkDeviceSize.member("range", "")
}.nativeType

val VkWriteDescriptorSet_p = struct_p(VULKAN_PACKAGE, "VkWriteDescriptorSet") {
	documentation =
		"""
		${man("VkWriteDescriptorSet")}<br>
		${spec("VkWriteDescriptorSet")}

		${ValidityStructs.VkWriteDescriptorSet}
		"""

	sType()
	pNext()
	VkDescriptorSet.member("dstSet", "")
	uint32_t.member("dstBinding", "")
	uint32_t.member("dstArrayElement", "")
	AutoSize("pImageInfo", "pBufferInfo", "pTexelBufferView", atLeastOne = true)..uint32_t.member("descriptorCount", "")
	VkDescriptorType.member("descriptorType", "")
	nullable..VkDescriptorImageInfo.const_p.buffer("pImageInfo", "")
	nullable..VkDescriptorBufferInfo.const_p.buffer("pBufferInfo", "")
	nullable..VkBufferView.const_p.member("pTexelBufferView", "")
}

val VkCopyDescriptorSet_p = struct_p(VULKAN_PACKAGE, "VkCopyDescriptorSet") {
	documentation =
		"""
		${man("VkCopyDescriptorSet")}<br>
		${spec("VkCopyDescriptorSet")}

		${ValidityStructs.VkCopyDescriptorSet}
		"""

	sType()
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
	documentation =
		"""
		${man("VkFramebufferCreateInfo")}<br>
		${spec("VkFramebufferCreateInfo")}

		${ValidityStructs.VkFramebufferCreateInfo}
		"""

	sType()
	pNext()
	VkFramebufferCreateFlags.member("flags", "")
	VkRenderPass.member("renderPass", "")
	AutoSize("pAttachments", optional = true)..uint32_t.member("attachmentCount", "")
	VkImageView.const_p.member("pAttachments", "")
	uint32_t.member("width", "")
	uint32_t.member("height", "")
	uint32_t.member("layers", "")
}

val VkAttachmentDescription = struct(VULKAN_PACKAGE, "VkAttachmentDescription") {
	documentation =
		"""
		${man("VkAttachmentDescription")}<br>
		${spec("VkAttachmentDescription")}

		${ValidityStructs.VkAttachmentDescription}
		"""

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
	documentation =
		"""
		${man("VkAttachmentReference")}<br>
		${spec("VkAttachmentReference")}

		${ValidityStructs.VkAttachmentReference}
		"""

	uint32_t.member("attachment", "")
	VkImageLayout.member("layout", "")
}.nativeType

val VkSubpassDescription = struct(VULKAN_PACKAGE, "VkSubpassDescription") {
	documentation =
		"""
		${man("VkSubpassDescription")}<br>
		${spec("VkSubpassDescription")}

		${ValidityStructs.VkSubpassDescription}
		"""

	VkSubpassDescriptionFlags.member("flags", "")
	VkPipelineBindPoint.member("pipelineBindPoint", "")
	AutoSize("pInputAttachments", optional = true)..uint32_t.member("inputAttachmentCount", "")
	VkAttachmentReference.const_p.buffer("pInputAttachments", "")
	AutoSize("pColorAttachments", "pResolveAttachments", optional = true)..uint32_t.member("colorAttachmentCount", "")
	VkAttachmentReference.const_p.buffer("pColorAttachments", "")
	nullable..VkAttachmentReference.const_p.buffer("pResolveAttachments", "")
	nullable..VkAttachmentReference.const_p.member("pDepthStencilAttachment", "")
	AutoSize("pPreserveAttachments", optional = true)..uint32_t.member("preserveAttachmentCount", "")
	uint32_t.const_p.member("pPreserveAttachments", "")
}.nativeType

val VkSubpassDependency = struct(VULKAN_PACKAGE, "VkSubpassDependency") {
	documentation =
		"""
		${man("VkSubpassDependency")}<br>
		${spec("VkSubpassDependency")}

		${ValidityStructs.VkSubpassDependency}
		"""

	uint32_t.member("srcSubpass", "")
	uint32_t.member("dstSubpass", "")
	VkPipelineStageFlags.member("srcStageMask", "")
	VkPipelineStageFlags.member("dstStageMask", "")
	VkAccessFlags.member("srcAccessMask", "")
	VkAccessFlags.member("dstAccessMask", "")
	VkDependencyFlags.member("dependencyFlags", "")
}.nativeType

val VkRenderPassCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkRenderPassCreateInfo") {
	documentation =
		"""
		${man("VkRenderPassCreateInfo")}<br>
		${spec("VkRenderPassCreateInfo")}

		${ValidityStructs.VkRenderPassCreateInfo}
		"""

	sType()
	pNext()
	VkRenderPassCreateFlags.member("flags", "")
	AutoSize("pAttachments", optional = true)..uint32_t.member("attachmentCount", "")
	VkAttachmentDescription.const_p.buffer("pAttachments", "")
	AutoSize("pSubpasses")..uint32_t.member("subpassCount", "")
	VkSubpassDescription.const_p.buffer("pSubpasses", "")
	AutoSize("pDependencies", optional = true)..uint32_t.member("dependencyCount", "")
	VkSubpassDependency.const_p.buffer("pDependencies", "")
}

val VkCommandPoolCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkCommandPoolCreateInfo") {
	documentation =
		"""
		${man("VkCommandPoolCreateInfo")}<br>
		${spec("VkCommandPoolCreateInfo")}

		${ValidityStructs.VkCommandPoolCreateInfo}
		"""

	sType()
	pNext()
	VkCommandPoolCreateFlags.member("flags", "")
	uint32_t.member("queueFamilyIndex", "")
}

val VkCommandBufferAllocateInfo_p = struct_p(VULKAN_PACKAGE, "VkCommandBufferAllocateInfo") {
	documentation =
		"""
		${man("VkCommandBufferAllocateInfo")}<br>
		${spec("VkCommandBufferAllocateInfo")}

		${ValidityStructs.VkCommandBufferAllocateInfo}
		"""

	sType()
	pNext()
	VkCommandPool.member("commandPool", "")
	VkCommandBufferLevel.member("level", "")
	uint32_t.member("commandBufferCount", "")
}

val VkCommandBufferInheritanceInfo = struct(VULKAN_PACKAGE, "VkCommandBufferInheritanceInfo") {
	documentation =
		"""
		${man("VkCommandBufferInheritanceInfo")}<br>
		${spec("VkCommandBufferInheritanceInfo")}

		${ValidityStructs.VkCommandBufferInheritanceInfo}
		"""

	sType()
	pNext()
	VkRenderPass.member("renderPass", "")
	uint32_t.member("subpass", "")
	VkFramebuffer.member("framebuffer", "")
	VkBool32.member("occlusionQueryEnable", "")
	VkQueryControlFlags.member("queryFlags", "")
	VkQueryPipelineStatisticFlags.member("pipelineStatistics", "")
}.nativeType

val VkCommandBufferBeginInfo_p = struct_p(VULKAN_PACKAGE, "VkCommandBufferBeginInfo") {
	documentation =
		"""
		${man("VkCommandBufferBeginInfo")}<br>
		${spec("VkCommandBufferBeginInfo")}

		${ValidityStructs.VkCommandBufferBeginInfo}
		"""

	sType()
	pNext()
	VkCommandBufferUsageFlags.member("flags", "")
	nullable..VkCommandBufferInheritanceInfo.const_p.member("pInheritanceInfo", "")
}

val VkBufferCopy_p = struct_p(VULKAN_PACKAGE, "VkBufferCopy") {
	documentation =
		"""
		${man("VkBufferCopy")}<br>
		${spec("VkBufferCopy")}
		"""

	VkDeviceSize.member("srcOffset", "")
	VkDeviceSize.member("dstOffset", "")
	VkDeviceSize.member("size", "")
}

val VkImageSubresourceLayers = struct(VULKAN_PACKAGE, "VkImageSubresourceLayers") {
	documentation =
		"""
		${man("VkImageSubresourceLayers")}<br>
		${spec("VkImageSubresourceLayers")}

		${ValidityStructs.VkImageSubresourceLayers}
		"""

	VkImageAspectFlags.member("aspectMask", "")
	uint32_t.member("mipLevel", "")
	uint32_t.member("baseArrayLayer", "")
	uint32_t.member("layerCount", "")
}.nativeType

val VkOffset3D = struct(VULKAN_PACKAGE, "VkOffset3D") {
	documentation =
		"""
		${man("VkOffset3D")}<br>
		${spec("VkOffset3D")}
		"""

	int32_t.member("x", "")
	int32_t.member("y", "")
	int32_t.member("z", "")
}.nativeType

val VkImageCopy_p = struct_p(VULKAN_PACKAGE, "VkImageCopy") {
	documentation =
		"""
		${man("VkImageCopy")}<br>
		${spec("VkImageCopy")}

		${ValidityStructs.VkImageCopy}
		"""

	VkImageSubresourceLayers.member("srcSubresource", "")
	VkOffset3D.member("srcOffset", "")
	VkImageSubresourceLayers.member("dstSubresource", "")
	VkOffset3D.member("dstOffset", "")
	VkExtent3D.member("extent", "")
}

val VkImageBlit_p = struct_p(VULKAN_PACKAGE, "VkImageBlit") {
	documentation =
		"""
		${man("VkImageBlit")}<br>
		${spec("VkImageBlit")}

		${ValidityStructs.VkImageBlit}
		"""

	VkImageSubresourceLayers.member("srcSubresource", "")
	VkOffset3D.array("srcOffsets", "", size = 2)
	VkImageSubresourceLayers.member("dstSubresource", "")
	VkOffset3D.array("dstOffsets", "", size = 2)
}

val VkBufferImageCopy_p = struct_p(VULKAN_PACKAGE, "VkBufferImageCopy") {
	documentation =
		"""
		${man("VkBufferImageCopy")}<br>
		${spec("VkBufferImageCopy")}

		${ValidityStructs.VkBufferImageCopy}
		"""

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
	documentation =
		"""
		${man("VkClearDepthStencilValue")}<br>
		${spec("VkClearDepthStencilValue")}
		"""

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
	documentation =
		"""
		${man("VkClearAttachment")}<br>
		${spec("VkClearAttachment")}

		${ValidityStructs.VkClearAttachment}
		"""

	VkImageAspectFlags.member("aspectMask", "")
	uint32_t.member("colorAttachment", "")
	VkClearValue.member("clearValue", "")
}

val VkClearRect_p = struct_p(VULKAN_PACKAGE, "VkClearRect") {
	documentation =
		"""
		${man("VkClearRect")}<br>
		${spec("VkClearRect")}
		"""

	VkRect2D.member("rect", "")
	uint32_t.member("baseArrayLayer", "")
	uint32_t.member("layerCount", "")
}

val VkImageResolve_p = struct_p(VULKAN_PACKAGE, "VkImageResolve") {
	documentation =
		"""
		${man("VkImageResolve")}<br>
		${spec("VkImageResolve")}

		${ValidityStructs.VkImageResolve}
		"""

	VkImageSubresourceLayers.member("srcSubresource", "")
	VkOffset3D.member("srcOffset", "")
	VkImageSubresourceLayers.member("dstSubresource", "")
	VkOffset3D.member("dstOffset", "")
	VkExtent3D.member("extent", "")
}

val VkMemoryBarrier_p = struct_p(VULKAN_PACKAGE, "VkMemoryBarrier") {
	documentation =
		"""
		${man("VkMemoryBarrier")}<br>
		${spec("VkMemoryBarrier")}

		${ValidityStructs.VkMemoryBarrier}
		"""

	sType()
	pNext()
	VkAccessFlags.member("srcAccessMask", "")
	VkAccessFlags.member("dstAccessMask", "")
}

val VkBufferMemoryBarrier_p = struct_p(VULKAN_PACKAGE, "VkBufferMemoryBarrier") {
	documentation =
		"""
		${man("VkBufferMemoryBarrier")}<br>
		${spec("VkBufferMemoryBarrier")}

		${ValidityStructs.VkBufferMemoryBarrier}
		"""

	sType()
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
	documentation =
		"""
		${man("VkImageMemoryBarrier")}<br>
		${spec("VkImageMemoryBarrier")}

		${ValidityStructs.VkImageMemoryBarrier}
		"""

	sType()
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
	documentation =
		"""
		${man("VkRenderPassBeginInfo")}<br>
		${spec("VkRenderPassBeginInfo")}

		${ValidityStructs.VkRenderPassBeginInfo}
		"""

	sType()
	pNext()
	VkRenderPass.member("renderPass", "")
	VkFramebuffer.member("framebuffer", "")
	VkRect2D.member("renderArea", "")
	AutoSize("pClearValues", optional = true)..uint32_t.member("clearValueCount", "")
	VkClearValue.const_p.buffer("pClearValues", "")
}

// Indirect commands (not used in the API, for reference only)

val VkDispatchIndirectCommand = struct(VULKAN_PACKAGE, "VkDispatchIndirectCommand", mutable = false) {
	documentation =
		"""
		${man("VkDispatchIndirectCommand")}<br>
		${spec("VkDispatchIndirectCommand")}

		${ValidityStructs.VkDispatchIndirectCommand}
		"""

	uint32_t.member("x", "")
    uint32_t.member("y", "")
    uint32_t.member("z", "")
}.nativeType

val VkDrawIndexedIndirectCommand = struct(VULKAN_PACKAGE, "VkDrawIndexedIndirectCommand", mutable = false) {
	documentation =
		"""
		${man("VkDrawIndexedIndirectCommand")}<br>
		${spec("VkDrawIndexedIndirectCommand")}

		${ValidityStructs.VkDrawIndexedIndirectCommand}
		"""

    uint32_t.member("indexCount", "")
    uint32_t.member("instanceCount", "")
    uint32_t.member("firstIndex", "")
    int32_t.member("vertexOffset", "")
    uint32_t.member("firstInstance", "")
}.nativeType

val VkDrawIndirectCommand = struct(VULKAN_PACKAGE, "VkDrawIndirectCommand", mutable = false) {
	documentation =
		"""
		${man("VkDrawIndirectCommand")}<br>
		${spec("VkDrawIndirectCommand")}

		${ValidityStructs.VkDrawIndirectCommand}
		"""

	uint32_t.member("vertexCount", "")
    uint32_t.member("instanceCount", "")
    uint32_t.member("firstVertex", "")
    uint32_t.member("firstInstance", "")
}.nativeType