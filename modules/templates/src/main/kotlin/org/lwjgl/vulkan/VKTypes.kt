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

private val STRUCTURE_TYPE_REGEX = "([a-z])([A-Z])".toRegex()
internal fun Struct.sType(struct: Struct) = VkStructureType.member("sType", "the type of this structure. Must be: #STRUCTURE_TYPE_${struct
	.className
	.substring(2)
	.replace(STRUCTURE_TYPE_REGEX, "$1_$2")
	.toUpperCase()
}")
internal fun Struct.pNext() = nullable.."const void".p.member("pNext", "reserved for use by extensions")

val VkApplicationInfo = struct(VULKAN_PACKAGE, "VkApplicationInfo") {
	documentation =
		"""
		${man("VkApplicationInfo")}<br>
		${spec("VkApplicationInfo")}

		Contains information about the application.

		${ValidityStructs.VkApplicationInfo}
		"""

	sType(this)
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

	sType(this)
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

	sType(this)
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

	sType(this)
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

	sType(this)
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

	sType(this)
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

	sType(this)
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

	sType(this)
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

	sType(this)
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

	sType(this)
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

	sType(this)
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

	sType(this)
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

	sType(this)
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

	sType(this)
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

	sType(this)
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

	sType(this)
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

	sType(this)
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

	sType(this)
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

	sType(this)
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

		Describes a vertex input binding.

		${ValidityStructs.VkVertexInputBindingDescription}
		"""

	uint32_t.member("binding", "the binding number that this structure describes")
	uint32_t.member("stride", "the distance in bytes between two consecutive elements within the buffer")
	VkVertexInputRate.member(
		"inputRate",
		"a {@code VkVertexInputRate} value that specifies whether vertex attribute addressing is a function of the vertex index or of the instance index"
	)
}.nativeType

val VkVertexInputAttributeDescription = struct(VULKAN_PACKAGE, "VkVertexInputAttributeDescription") {
	documentation =
		"""
		${man("VkVertexInputAttributeDescription")}<br>
		${spec("VkVertexInputAttributeDescription")}

		Describes a vertex input attribute.

		${ValidityStructs.VkVertexInputAttributeDescription}
		"""

	uint32_t.member("location", "the shader binding location number for this attribute")
	uint32_t.member("binding", "the binding number which this attribute takes its data from")
	VkFormat.member("format", "the size and type of the vertex attribute data")
	uint32_t.member("offset", "a byte offset of this attribute relative to the start of an element in the vertex input binding")
}.nativeType

val VkPipelineVertexInputStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineVertexInputStateCreateInfo") {
	documentation =
		"""
		${man("VkPipelineVertexInputStateCreateInfo")}<br>
		${spec("VkPipelineVertexInputStateCreateInfo")}

		Contains vertex input attribute and vertex input binding descriptions as part of graphics pipeline creation.

		${ValidityStructs.VkPipelineVertexInputStateCreateInfo}
		"""

	sType(this)
	pNext()
	VkPipelineVertexInputStateCreateFlags.member("flags", "reserved for future use")
	AutoSize("pVertexBindingDescriptions", optional = true)..uint32_t.member(
		"vertexBindingDescriptionCount",
		"the number of vertex binding descriptions provided in {@code pVertexBindingDescriptions}"
	)
	VkVertexInputBindingDescription.const_p.buffer("pVertexBindingDescriptions", "a pointer to an array of ##VkVertexInputBindingDescription structures")
	AutoSize("pVertexAttributeDescriptions", optional = true)..uint32_t.member(
		"vertexAttributeDescriptionCount",
		"the number of vertex attribute descriptions provided in {@code pVertexAttributeDescriptions}"
	)
	VkVertexInputAttributeDescription.const_p.buffer("pVertexAttributeDescriptions", "a pointer to an array of ##VkVertexInputAttributeDescription structures")
}.nativeType

val VkPipelineInputAssemblyStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineInputAssemblyStateCreateInfo") {
	documentation =
		"""
		${man("VkPipelineInputAssemblyStateCreateInfo")}<br>
		${spec("VkPipelineInputAssemblyStateCreateInfo")}

		Contains information about input assembly behavior.

		${ValidityStructs.VkPipelineInputAssemblyStateCreateInfo}
		"""

	sType(this)
	pNext()
	VkPipelineInputAssemblyStateCreateFlags.member("flags", "reserved for future use")
	VkPrimitiveTopology.member("topology", "a {@code VkPrimitiveTopology} defining the primitive topology")
	VkBool32.member("primitiveRestartEnable", "controls whether a special vertex index value is treated as restarting the assembly of primitives")
}.nativeType

val VkPipelineTessellationStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineTessellationStateCreateInfo") {
	documentation =
		"""
		${man("VkPipelineTessellationStateCreateInfo")}<br>
		${spec("VkPipelineTessellationStateCreateInfo")}

		Contains information about the tessellation state as part of graphics pipeline creation.

		${ValidityStructs.VkPipelineTessellationStateCreateInfo}
		"""

	sType(this)
	pNext()
	VkPipelineTessellationStateCreateFlags.member("flags", "reserved for future use")
	uint32_t.member("patchControlPoints", "the number of control points per patch")
}.nativeType

val VkViewport = struct(VULKAN_PACKAGE, "VkViewport") {
	documentation =
		"""
		${man("VkViewport")}<br>
		${spec("VkViewport")}

		Describes viewport transformation parameters.

		${ValidityStructs.VkViewport}
		"""

	float.member("x", "the viewport's left bound")
	float.member("y", "the viewport's upper bound")
	float.member("width", "the viewport's width")
	float.member("height", "the viewport's height")
	float.member("minDepth", "the minimum viewport depth")
	float.member("maxDepth", "the maximum viewport depth")
}.nativeType

val VkOffset2D = struct(VULKAN_PACKAGE, "VkOffset2D") {
	documentation =
		"""
		${man("VkOffset2D")}<br>
		${spec("VkOffset2D")}

		Describes a 2D offset.
		"""

	int32_t.member("x", "the x offset")
	int32_t.member("y", "the y offset")
}.nativeType

val VkExtent2D = struct(VULKAN_PACKAGE, "VkExtent2D") {
	documentation =
		"""
		${man("VkExtent2D")}<br>
		${spec("VkExtent2D")}

		Describes a 2D extent.
		"""

	uint32_t.member("width", "the width")
	uint32_t.member("height", "the height")
}.nativeType

val VkRect2D = struct(VULKAN_PACKAGE, "VkRect2D") {
	documentation =
		"""
		${man("VkRect2D")}<br>
		${spec("VkRect2D")}

		Describes a 2D rectangular region.
		"""

	VkOffset2D.member("offset", "the region offset")
	VkExtent2D.member("extent", "the region extent")
}.nativeType

val VkPipelineViewportStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineViewportStateCreateInfo") {
	documentation =
		"""
		${man("VkPipelineViewportStateCreateInfo")}<br>
		${spec("VkPipelineViewportStateCreateInfo")}

		Contains information about viewports as part of graphics pipeline creation.

		${ValidityStructs.VkPipelineViewportStateCreateInfo}
		"""

	sType(this)
	pNext()
	VkPipelineViewportStateCreateFlags.member("flags", "reserved for future use")
	AutoSize("pViewports")..uint32_t.member("viewportCount", "the number of viewports used by the pipeline")
	nullable..VkViewport.const_p.buffer(
		"pViewports",
		"a pointer to an array of ##VkViewport structs, defining the viewport transforms. If the viewport state is dynamic, this member is ignored."
	)
	AutoSize("pScissors")..uint32_t.member("scissorCount", "the number of scissors and $must match the number of viewports")
	nullable..VkRect2D.const_p.buffer(
		"pScissors",
		"""
		a pointer to an array of ##VkRect2D structs which define the rectangular bounds of the scissor for the corresponding viewport. If the scissor state is
		dynamic, this member is ignored.
		"""
	)
}.nativeType

val VkPipelineRasterizationStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineRasterizationStateCreateInfo") {
	documentation =
		"""
		${man("VkPipelineRasterizationStateCreateInfo")}<br>
		${spec("VkPipelineRasterizationStateCreateInfo")}

		Contains information about rasterization as part of graphics pipeline creation.

		${ValidityStructs.VkPipelineRasterizationStateCreateInfo}
		"""

	sType(this)
	pNext()
	VkPipelineRasterizationStateCreateFlags.member("flags", "reserved for future use")
	VkBool32.member("depthClampEnable", "controls whether to clamp the fragment’s depth values instead of clipping primitives to the z planes of the frustum")
	VkBool32.member("rasterizerDiscardEnable", "controls whether primitives are discarded immediately before the rasterization stage")
	VkPolygonMode.member("polygonMode", "the triangle rendering mode")
	VkCullModeFlags.member("cullMode", "the triangle facing direction used for primitive culling")
	VkFrontFace.member("frontFace", "the front-facing triangle orientation to be used for culling")
	VkBool32.member("depthBiasEnable", "controls whether to bias fragment depth values")
	float.member("depthBiasConstantFactor", "a scalar factor controlling the constant depth value added to each fragment")
	float.member("depthBiasClamp", "the maximum (or minimum) depth bias of a fragment")
	float.member("depthBiasSlopeFactor", "a scalar factor applied to a fragment’s slope in depth bias calculations")
	float.member("lineWidth", "the width of rasterized line segments")
}.nativeType

val VkPipelineMultisampleStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineMultisampleStateCreateInfo") {
	documentation =
		"""
		${man("VkPipelineMultisampleStateCreateInfo")}<br>
		${spec("VkPipelineMultisampleStateCreateInfo")}

		Contains information about multisampling as part of graphics pipeline creation.

		${ValidityStructs.VkPipelineMultisampleStateCreateInfo}
		"""

	sType(this)
	pNext()
	VkPipelineMultisampleStateCreateFlags.member("flags", "reserved for future use")
	VkSampleCountFlagBits.member("rasterizationSamples", "a {@code VkSampleCountFlagBits} specifying the number of samples per pixel used in rasterization")
	VkBool32.member("sampleShadingEnable", "specifies that fragment shading executes per-sample if #TRUE, or per-fragment if #FALSE")
	float.member("minSampleShading", "the minimum fraction of sample shading")
	nullable..VkSampleMask.const_p.member(
		"pSampleMask",
		"a bitmask of static coverage information that is ANDed with the coverage information generated during rasterization"
	)
	VkBool32.member(
		"alphaToCoverageEnable",
		"controls whether a temporary coverage value is generated based on the alpha component of the fragment’s first color output"
	)
	VkBool32.member("alphaToOneEnable", "controls whether the alpha component of the fragment’s first color output is replaced with one")
}.nativeType

val VkStencilOpState = struct(VULKAN_PACKAGE, "VkStencilOpState") {
	documentation =
		"""
		${man("VkStencilOpState")}<br>
		${spec("VkStencilOpState")}

		Contains information about the stencil test as part of graphics pipeline creation.

		${ValidityStructs.VkStencilOpState}
		"""

	VkStencilOp.member("failOp", "the action performed on samples that fail the stencil test")
	VkStencilOp.member("passOp", "the action performed on samples that pass both the depth and stencil tests")
	VkStencilOp.member("depthFailOp", "the action performed on samples that pass the stencil test and fail the depth test")
	VkCompareOp.member("compareOp", "the comparison operator used in the stencil test")
	uint32_t.member("compareMask", "selects the bits of the unsigned integer stencil values participating in the stencil test")
	uint32_t.member("writeMask", "selects the bits of the unsigned integer stencil values updated by the stencil test in the stencil framebuffer attachment")
	uint32_t.member("reference", "an integer reference value that is used in the unsigned stencil comparison")
}.nativeType

val VkPipelineDepthStencilStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineDepthStencilStateCreateInfo") {
	documentation =
		"""
		${man("VkPipelineDepthStencilStateCreateInfo")}<br>
		${spec("VkPipelineDepthStencilStateCreateInfo")}

		Contains information about depth bounds tests, stencil test and depth test as part of graphics pipeline creation.

		${ValidityStructs.VkPipelineDepthStencilStateCreateInfo}
		"""

	sType(this)
	pNext()
	VkPipelineDepthStencilStateCreateFlags.member("flags", "reserved for future use")
	VkBool32.member("depthTestEnable", "controls whether depth testing is enabled")
	VkBool32.member("depthWriteEnable", "controls whether depth writes are enabled")
	VkCompareOp.member("depthCompareOp", "the comparison operator used in the depth test")
	VkBool32.member("depthBoundsTestEnable", "controls whether depth bounds testing is enabled")
	VkBool32.member("stencilTestEnable", "controls whether stencil testing is enabled")
	VkStencilOpState.member("front", "control the parameters of the stencil test for front facing primitives")
	VkStencilOpState.member("back", "control the parameters of the stencil test for back facing primitives")
	float.member("minDepthBounds", "the minimum depths bounds test value")
	float.member("maxDepthBounds", "the maximum depths bounds test value")
}.nativeType

val VkPipelineColorBlendAttachmentState = struct(VULKAN_PACKAGE, "VkPipelineColorBlendAttachmentState") {
	documentation =
		"""
		${man("VkPipelineColorBlendAttachmentState")}<br>
		${spec("VkPipelineColorBlendAttachmentState")}

		Contains information about per-target blending state as part of graphics pipeline creation.

		${ValidityStructs.VkPipelineColorBlendAttachmentState}
		"""

	VkBool32.member("blendEnable", "controls whether blending is enabled for the corresponding color attachment")
	VkBlendFactor.member("srcColorBlendFactor", "selects which blend factor is used to determine the source factors S<sub>r</sub>,S<sub>g</sub>,S<sub>b</sub>")
	VkBlendFactor.member(
		"dstColorBlendFactor",
		"selects which blend factor is used to determine the destination factors D<sub>r</sub>,D<sub>g</sub>,D<sub>b</sub>"
	)
	VkBlendOp.member("colorBlendOp", "selects which blend operation is used to calculate the RGB values to write to the color attachment")
	VkBlendFactor.member("srcAlphaBlendFactor", "selects which blend factor is used to determine the source factor S<sub>a</sub>")
	VkBlendFactor.member("dstAlphaBlendFactor", "selects which blend factor is used to determine the destination factor D<sub>a</sub>")
	VkBlendOp.member("alphaBlendOp", "selects which blend operation is use to calculate the alpha values to write to the color attachment")
	VkColorComponentFlags.member("colorWriteMask", "a bitmask selecting which of the R, G, B, and/or A components are enabled for writing")
}.nativeType

val VkPipelineColorBlendStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineColorBlendStateCreateInfo") {
	documentation =
		"""
		${man("VkPipelineColorBlendStateCreateInfo")}<br>
		${spec("VkPipelineColorBlendStateCreateInfo")}

		Contains information about the blend state as part of graphics pipeline creation.

		${ValidityStructs.VkPipelineColorBlendStateCreateInfo}
		"""

	sType(this)
	pNext()
	VkPipelineColorBlendStateCreateFlags.member("flags", "reserved for future use")
	VkBool32.member("logicOpEnable", "controls whether to apply logical operations")
	VkLogicOp.member("logicOp", "selects which logical operation to apply")
	AutoSize("pAttachments", optional = true)..uint32_t.member(
		"attachmentCount",
		"the number of ##VkPipelineColorBlendAttachmentState elements in {@code pAttachments}"
	)
	VkPipelineColorBlendAttachmentState.const_p.buffer("pAttachments", "pointer to array of per target attachment states")
	float.array(
		"blendConstants",
		"an array of four values used as the R, G, B, and A components of the blend constant that are used in blending, depending on the blend factor",
		size = 4
	)
}.nativeType

val VkPipelineDynamicStateCreateInfo = struct(VULKAN_PACKAGE, "VkPipelineDynamicStateCreateInfo") {
	documentation =
		"""
		${man("VkPipelineDynamicStateCreateInfo")}<br>
		${spec("VkPipelineDynamicStateCreateInfo")}

		Contains information about dynamic state as part of graphics pipeline creation.

		${ValidityStructs.VkPipelineDynamicStateCreateInfo}
		"""

	sType(this)
	pNext()
	VkPipelineDynamicStateCreateFlags.member("flags", "reserved for future use")
	AutoSize("pDynamicStates")..uint32_t.member("dynamicStateCount", "the number of elements in the {@code pDynamicStates} array")
	VkDynamicState.const_p.member(
		"pDynamicStates",
		"""
		an array of {@code VkDynamicState} enums which indicate which pieces of pipeline state will use the values from dynamic state commands rather than from
		the pipeline state creation info
		"""
	)
}.nativeType

val VkGraphicsPipelineCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkGraphicsPipelineCreateInfo") {
	documentation =
		"""
		${man("VkGraphicsPipelineCreateInfo")}<br>
		${spec("VkGraphicsPipelineCreateInfo")}

		Includes an array of shader create info structures containing all the desired active shader stages, as well as creation info to define all relevant
		fixed-function stages, and a pipeline layout.

		${ValidityStructs.VkGraphicsPipelineCreateInfo}
		"""

	sType(this)
	pNext()
	VkPipelineCreateFlags.member("flags", "a bitfield of {@code VkPipelineCreateFlagBits} controlling how the pipeline will be generated")
	AutoSize("pStages")..uint32_t.member("stageCount", "the number of entries in the {@code pStages} array")
	VkPipelineShaderStageCreateInfo.const_p.buffer(
		"pStages",
		"""
		an array of size {@code stageCount} structures of type ##VkPipelineShaderStageCreateInfo describing the set of the shader stages to be included in the
		graphics pipeline
		"""
	)
	VkPipelineVertexInputStateCreateInfo.const_p.member(
		"pVertexInputState",
		"a pointer to an instance of the ##VkPipelineVertexInputStateCreateInfo structure"
	)
	VkPipelineInputAssemblyStateCreateInfo.const_p.member(
		"pInputAssemblyState",
		"a pointer to an instance of the ##VkPipelineInputAssemblyStateCreateInfo structure which determines input assembly behavior"
	)
	nullable..VkPipelineTessellationStateCreateInfo.const_p.member(
		"pTessellationState",
		"""
		a pointer to an instance of the ##VkPipelineTessellationStateCreateInfo structure, or $NULL if the pipeline does not include a tessellation control
		shader stage and tessellation evaluation shader stage
		"""
	)
	nullable..VkPipelineViewportStateCreateInfo.const_p.member(
		"pViewportState",
		"a pointer to an instance of the ##VkPipelineViewportStateCreateInfo structure, or $NULL if the pipeline has rasterization disabled"
	)
	VkPipelineRasterizationStateCreateInfo.const_p.member(
		"pRasterizationState",
		"a pointer to an instance of the ##VkPipelineRasterizationStateCreateInfo structure"
	)
	nullable..VkPipelineMultisampleStateCreateInfo.const_p.member(
		"pMultisampleState",
		"a pointer to an instance of the ##VkPipelineMultisampleStateCreateInfo, or $NULL if the pipeline has rasterization disabled"
	)
	nullable..VkPipelineDepthStencilStateCreateInfo.const_p.member(
		"pDepthStencilState",
		"""
		a pointer to an instance of the ##VkPipelineDepthStencilStateCreateInfo structure, or $NULL if the pipeline has rasterization disabled or if the
		subpass of the render pass the pipeline is created against does not use a depth/stencil attachment
		"""
	)
	nullable..VkPipelineColorBlendStateCreateInfo.const_p.member(
		"pColorBlendState",
		"""
		a pointer to an instance of the ##VkPipelineColorBlendStateCreateInfo structure, or $NULL if the pipeline has rasterization disabled or if the subpass
		of the render pass the pipeline is created against does not use any color attachments
		"""
	)
	nullable..VkPipelineDynamicStateCreateInfo.const_p.member(
		"pDynamicState",
		"""
		a pointer to ##VkPipelineDynamicStateCreateInfo and is used to indicate which properties of the pipeline state object are dynamic and can be changed
		independently of the pipeline state. This can be $NULL, which means no state in the pipeline is considered dynamic.
		"""
	)
	VkPipelineLayout.member("layout", "the description of binding locations used by both the pipeline and descriptor sets used with the pipeline")
	VkRenderPass.member(
		"renderPass",
		"""
		a handle to a render pass object describing the environment in which the pipeline will be used; the pipeline can be used with an instance of any render
		pass compatible with the one provided
		"""
	)
	uint32_t.member("subpass", "the index of the subpass in {@code renderPass} where this pipeline will be used")
	VkPipeline.member("basePipelineHandle", "a pipeline to derive from")
	int32_t.member("basePipelineIndex", "an index into the {@code pCreateInfos} parameter to use as a pipeline to derive from")
}

val VkComputePipelineCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkComputePipelineCreateInfo") {
	documentation =
		"""
		${man("VkComputePipelineCreateInfo")}<br>
		${spec("VkComputePipelineCreateInfo")}

		Contains information about how a compute pipeline should be created.

		${ValidityStructs.VkComputePipelineCreateInfo}
		"""

	sType(this)
	pNext()
	VkPipelineCreateFlags.member("flags", "provides options for pipeline creation, and is of type {@code VkPipelineCreateFlagBits}")
	VkPipelineShaderStageCreateInfo.member("stage", "a ##VkPipelineShaderStageCreateInfo describing the compute shader")
	VkPipelineLayout.member("layout", "the description of binding locations used by both the pipeline and descriptor sets used with the pipeline")
	VkPipeline.member("basePipelineHandle", "a pipeline to derive from")
	int32_t.member("basePipelineIndex", "an index into the {@code pCreateInfos} parameter to use as a pipeline to derive from")
}

val VkPushConstantRange = struct(VULKAN_PACKAGE, "VkPushConstantRange") {
	documentation =
		"""
		${man("VkPushConstantRange")}<br>
		${spec("VkPushConstantRange")}

		Describes a push constant range.

		${ValidityStructs.VkPushConstantRange}
		"""

	VkShaderStageFlags.member("stageFlags", "a set of stage flags describing the shader stages that will access a range of push constants")
	uint32_t.member("offset", "the start offset, in bytes, consumed by the range")
	uint32_t.member("size", "the size, in bytes, consumed by the range")
}.nativeType

val VkPipelineLayoutCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkPipelineLayoutCreateInfo") {
	documentation =
		"""
		${man("VkPipelineLayoutCreateInfo")}<br>
		${spec("VkPipelineLayoutCreateInfo")}

		Contains information about how a pipeline layout should be created.

		${ValidityStructs.VkPipelineLayoutCreateInfo}
		"""

	sType(this)
	pNext()
	VkPipelineLayoutCreateFlags.member("flags", "reserved for future use")
	AutoSize("pSetLayouts", optional = true)..uint32_t.member("setLayoutCount", "the number of descriptor sets included in the pipeline layout")
	VkDescriptorSetLayout.const_p.member("pSetLayouts", "a pointer to an array of {@code VkDescriptorSetLayout} objects")
	AutoSize("pPushConstantRanges", optional = true)..uint32_t.member(
		"pushConstantRangeCount",
		"the number of push constant ranges included in the pipeline layout"
	)
	VkPushConstantRange.const_p.buffer(
		"pPushConstantRanges",
		"a pointer to an array of ##VkPushConstantRange structures defining a set of push constant ranges for use in a single pipeline layout"
	)
}

val VkSamplerCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkSamplerCreateInfo") {
	documentation =
		"""
		${man("VkSamplerCreateInfo")}<br>
		${spec("VkSamplerCreateInfo")}

		Contains information about how a sampler object should be created.

		${ValidityStructs.VkSamplerCreateInfo}
		"""

	sType(this)
	pNext()
	VkSamplerCreateFlags.member("flags", "reserved for future use")
	VkFilter.member("magFilter", "the magnification filter to apply to lookups")
	VkFilter.member("minFilter", "the minification filter to apply to lookups")
	VkSamplerMipmapMode.member("mipmapMode", "the mipmap filter to apply to lookups")
	VkSamplerAddressMode.member("addressModeU", "the addressing mode for outside [0..1] range for U coordinate")
	VkSamplerAddressMode.member("addressModeV", "the addressing mode for outside [0..1] range for V coordinate")
	VkSamplerAddressMode.member("addressModeW", "the addressing mode for outside [0..1] range for W coordinate")
	float.member("mipLodBias", "the bias to be added to mipmap LOD calculation and bias provided by image sampling functions in SPIR-V")
	VkBool32.member("anisotropyEnable", "is #TRUE to enable anisotropic filtering, or #FALSE otherwise")
	float.member("maxAnisotropy", "the anisotropy value clamp")
	VkBool32.member("compareEnable", "is #TRUE to enable comparison against a reference value during lookups, or #FALSE otherwise")
	VkCompareOp.member("compareOp", "the comparison function to apply to fetched data before filtering")
	float.member("minLod", "the minimum value to which the computed level-of-detail value will be clamped")
	float.member("maxLod", "the maximum value to which the computed level-of-detail value will be clamped")
	VkBorderColor.member("borderColor", "the predefined border color to use")
	VkBool32.member("unnormalizedCoordinates", "controls whether to use unnormalized or normalized texel coordinates to address texels of the image")
}

val VkDescriptorSetLayoutBinding = struct(VULKAN_PACKAGE, "VkDescriptorSetLayoutBinding") {
	documentation =
		"""
		${man("VkDescriptorSetLayoutBinding")}<br>
		${spec("VkDescriptorSetLayoutBinding")}

		An entry in a descriptor set layout corresponding to zero or more descriptors of a single descriptor type in a set.

		${ValidityStructs.VkDescriptorSetLayoutBinding}
		"""

	uint32_t.member("binding", "the binding number of this entry and corresponds to a resource of the same binding number in the shader stages")
	VkDescriptorType.member("descriptorType", "a {@code VkDescriptorType} specifying which type of resource descriptors are used for this binding")
	uint32_t.member(
		"descriptorCount",
		"""
		the number of descriptors contained in the binding, accessed in a shader as an array. If {@code descriptorCount} is zero this binding entry is reserved
		and the resource must not be accessed from any stage via this binding within any pipeline using the set layout.
		"""
	)
	VkShaderStageFlags.member(
		"stageFlags",
		"a bitfield of {@code VkShaderStageFlagBits} specifying which pipeline shader stages can access a resource for this binding"
	)
	nullable..VkSampler.const_p.member(
		"pImmutableSamplers",
		"""
		affects initialization of samplers. If {@code descriptorType} specifies a #DESCRIPTOR_TYPE_SAMPLER or #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER type
		descriptor, then {@code pImmutableSamplers} can be used to initialize a set of immutable samplers. Immutable samplers are permanently bound into the
		set layout; later binding a sampler into an immutable sampler slot in a descriptor set is not allowed. If {@code pImmutableSamplers} is not $NULL, then
		it is considered to be a pointer to an array of sampler handles that will be consumed by the set layout and used for the corresponding binding. If
		{@code pImmutableSamplers} is $NULL, then the sampler slots are dynamic and sampler handles must be bound into descriptor sets using this layout. If
		{@code descriptorType} is not one of these descriptor types, then {@code pImmutableSamplers} is ignored.
		"""
	)
}.nativeType

val VkDescriptorSetLayoutCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkDescriptorSetLayoutCreateInfo") {
	documentation =
		"""
		${man("VkDescriptorSetLayoutCreateInfo")}<br>
		${spec("VkDescriptorSetLayoutCreateInfo")}

		Contains information about how a descriptor set layout should be created.

		${ValidityStructs.VkDescriptorSetLayoutCreateInfo}
		"""

	sType(this)
	pNext()
	VkDescriptorSetLayoutCreateFlags.member("flags", "reserved for future use")
	AutoSize("pBindings", optional = true)..uint32_t.member("bindingCount", "the number of elements in {@code pBindings}")
	VkDescriptorSetLayoutBinding.const_p.buffer("pBindings", "a pointer to an array of ##VkDescriptorSetLayoutBinding structures")
}

val VkDescriptorPoolSize = struct(VULKAN_PACKAGE, "VkDescriptorPoolSize") {
	documentation =
		"""
		${man("VkDescriptorPoolSize")}<br>
		${spec("VkDescriptorPoolSize")}

		Contains a descriptor type and number of descriptors of that type to be allocated in a pool.

		${ValidityStructs.VkDescriptorPoolSize}
		"""

	VkDescriptorType.member("type", "the type of descriptor")
	uint32_t.member("descriptorCount", "the number of descriptors of that type to allocate")
}.nativeType

val VkDescriptorPoolCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkDescriptorPoolCreateInfo") {
	documentation =
		"""
		${man("VkDescriptorPoolCreateInfo")}<br>
		${spec("VkDescriptorPoolCreateInfo")}

		Contains information about how a descriptor pool should be created.

		${ValidityStructs.VkDescriptorPoolCreateInfo}
		"""

	sType(this)
	pNext()
	VkDescriptorPoolCreateFlags.member("flags", "specifies certain supported operations on the pool")
	uint32_t.member("maxSets", "the maximum number of descriptor sets that $can be allocated from the pool")
	AutoSize("pPoolSizes")..uint32_t.member("poolSizeCount", " the number of elements in {@code pPoolSizes}")
	VkDescriptorPoolSize.const_p.buffer(
		"pPoolSizes",
		"""
		a pointer to an array of ##VkDescriptorPoolSize structures, each containing a descriptor type and number of descriptors of that type to be allocated in
		the pool
		"""
	)
}

val VkDescriptorSetAllocateInfo_p = struct_p(VULKAN_PACKAGE, "VkDescriptorSetAllocateInfo") {
	documentation =
		"""
		${man("VkDescriptorSetAllocateInfo")}<br>
		${spec("VkDescriptorSetAllocateInfo")}

		Contains information about how a descriptor set should be allocated.

		${ValidityStructs.VkDescriptorSetAllocateInfo}
		"""

	sType(this)
	pNext()
	VkDescriptorPool.member("descriptorPool", "the pool which the sets will be allocated from")
	AutoSize("pSetLayouts")..uint32_t.member("descriptorSetCount", "the number of descriptor sets to be allocated from the pool")
	VkDescriptorSetLayout.const_p.member(
		"pSetLayouts",
		"an array of descriptor set layouts, with each member specifying how the corresponding descriptor set is allocated"
	)
}

val VkDescriptorImageInfo = struct(VULKAN_PACKAGE, "VkDescriptorImageInfo") {
	documentation =
		"""
		${man("VkDescriptorImageInfo")}<br>
		${spec("VkDescriptorImageInfo")}

		${ValidityStructs.VkDescriptorImageInfo}
		"""

	VkSampler.member(
		"sampler",
		"""
		a sampler handle, and is used in descriptor updates for types #DESCRIPTOR_TYPE_SAMPLER and #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER if the binding being
		updated does not use immutable samplers
		"""
	)
	VkImageView.member(
		"imageView",
		"""
		an image view handle, and is used in descriptor updates for types #DESCRIPTOR_TYPE_SAMPLED_IMAGE, #DESCRIPTOR_TYPE_STORAGE_IMAGE,
		#DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, and #DESCRIPTOR_TYPE_INPUT_ATTACHMENT
		"""
	)
	VkImageLayout.member(
		"imageLayout",
		"""
		the layout that the image will be in at the time this descriptor is accessed. {@code imageLayout} is used in descriptor updates for types
		#DESCRIPTOR_TYPE_SAMPLED_IMAGE, #DESCRIPTOR_TYPE_STORAGE_IMAGE, #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, and #DESCRIPTOR_TYPE_INPUT_ATTACHMENT.
		"""
	)
}.nativeType

val VkDescriptorBufferInfo = struct(VULKAN_PACKAGE, "VkDescriptorBufferInfo") {
	documentation =
		"""
		${man("VkDescriptorBufferInfo")}<br>
		${spec("VkDescriptorBufferInfo")}

		${ValidityStructs.VkDescriptorBufferInfo}
		"""

	VkBuffer.member("buffer", "the buffer resource")
	VkDeviceSize.member(
		"offset",
		"the offset in bytes from the start of buffer. Access to buffer memory via this descriptor uses addressing that is relative to this starting offset."
	)
	VkDeviceSize.member(
		"range",
		"the size in bytes that is used for this descriptor update, or #WHOLE_SIZE to use the range from offset to the end of the buffer"
	)
}.nativeType

val VkWriteDescriptorSet_p = struct_p(VULKAN_PACKAGE, "VkWriteDescriptorSet") {
	documentation =
		"""
		${man("VkWriteDescriptorSet")}<br>
		${spec("VkWriteDescriptorSet")}

		Describes an operation updating the descriptor set using descriptors for resources specified in the structure.

		${ValidityStructs.VkWriteDescriptorSet}
		"""

	sType(this)
	pNext()
	VkDescriptorSet.member("dstSet", "the destination descriptor set to update")
	uint32_t.member("dstBinding", "the descriptor binding within that set")
	uint32_t.member("dstArrayElement", "the starting element in that array")
	AutoSize("pImageInfo", "pBufferInfo", "pTexelBufferView", atLeastOne = true)..uint32_t.member(
		"descriptorCount",
		"the number of descriptors to update (the number of elements in {@code pImageInfO}, {@code pBufferInfO}, or {@code pTexelBufferVieW})"
	)
	VkDescriptorType.member(
		"descriptorType",
		"""
		the type of each descriptor in {@code pImageInfo}, {@code pBufferInfo}, or {@code pTexelBufferView}, and must be the same type as what was specified in
		##VkDescriptorSetLayoutBinding for {@code dstSet} at {@code dstBinding}. The type of the descriptor also controls which array the descriptors are taken
		from.
		"""
	)
	nullable..VkDescriptorImageInfo.const_p.buffer("pImageInfo", "points to an array of ##VkDescriptorImageInfo structures or is ignored")
	nullable..VkDescriptorBufferInfo.const_p.buffer("pBufferInfo", "points to an array of ##VkDescriptorBufferInfo structures or is ignored")
	nullable..VkBufferView.const_p.member("pTexelBufferView", "points to an array of {@code VkBufferView} handles or is ignored")
}

val VkCopyDescriptorSet_p = struct_p(VULKAN_PACKAGE, "VkCopyDescriptorSet") {
	documentation =
		"""
		${man("VkCopyDescriptorSet")}<br>
		${spec("VkCopyDescriptorSet")}

		Describes descriptor sets to copy between.

		${ValidityStructs.VkCopyDescriptorSet}
		"""

	sType(this)
	pNext()
	VkDescriptorSet.member("srcSet", "the source set")
	uint32_t.member("srcBinding", "the source binding")
	uint32_t.member("srcArrayElement", "the source array element")
	VkDescriptorSet.member("dstSet", "the destination set")
	uint32_t.member("dstBinding", "the destination binding")
	uint32_t.member("dstArrayElement", "the destination array element")
	uint32_t.member(
		"descriptorCount",
		"""
		the number of descriptors to copy from the source to destination. If {@code descriptorCount} is greater than the number of remaining array elements in
		the source or destination binding, those affect consecutive bindings in a manner similar to ##VkWriteDescriptorSet.
		"""
	)
}

val VkFramebufferCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkFramebufferCreateInfo") {
	documentation =
		"""
		${man("VkFramebufferCreateInfo")}<br>
		${spec("VkFramebufferCreateInfo")}

		Contains information about how a framebuffer should be created.

		${ValidityStructs.VkFramebufferCreateInfo}
		"""

	sType(this)
	pNext()
	VkFramebufferCreateFlags.member("flags", "reserved for future use")
	VkRenderPass.member("renderPass", "a render pass that defines what render passes the framebuffer will be compatible with")
	AutoSize("pAttachments", optional = true)..uint32_t.member("attachmentCount", "the number of attachments")
	VkImageView.const_p.member(
		"pAttachments",
		"an array of {@code VkImageView} handles, each of which will be used as the corresponding attachment in a render pass instance"
	)
	uint32_t.member("width", "the framebuffer width")
	uint32_t.member("height", "the framebuffer height")
	uint32_t.member("layers", "the number of layers in the framebuffer")
}

val VkAttachmentDescription = struct(VULKAN_PACKAGE, "VkAttachmentDescription") {
	documentation =
		"""
		${man("VkAttachmentDescription")}<br>
		${spec("VkAttachmentDescription")}

		Describes properties of an attachment.

		${ValidityStructs.VkAttachmentDescription}
		"""

	VkAttachmentDescriptionFlags.member("flags", "a bitfield of {@code VkAttachmentDescriptionFlagBits} describing additional properties of the attachment")
	VkFormat.member("format", "a {@code VkFormat} value specifying the format of the image that will be used for the attachment")
	VkSampleCountFlagBits.member("samples", "the number of samples of the image as defined in {@code VkSampleCountFlagBits}")
	VkAttachmentLoadOp.member(
		"loadOp",
		"specifies how the contents of color and depth components of the attachment are treated at the beginning of the subpass where it is first used"
	)
	VkAttachmentStoreOp.member(
		"storeOp",
		"specifies how the contents of color and depth components of the attachment are treated at the end of the subpass where it is last used"
	)
	VkAttachmentLoadOp.member(
		"stencilLoadOp",
		"""
		specifies how the contents of stencil components of the attachment are treated at the beginning of the subpass where it is first used, and must be one
		of the same values allowed for {@code loadOp}
		"""
	)
	VkAttachmentStoreOp.member(
		"stencilStoreOp",
		"""
		specifies how the contents of stencil components of the attachment are treated at the end of the last subpass where it is used, and must be one of the
		same values allowed for {@code storeOp}
		"""
	)
	VkImageLayout.member("initialLayout", "the layout the attachment image subresource will be in when a render pass instance begins")
	VkImageLayout.member("finalLayout", "a bitfield of {@code VkAttachmentDescriptionFlagBits} describing additional properties of the attachment")
}.nativeType

val VkAttachmentReference = struct(VULKAN_PACKAGE, "VkAttachmentReference") {
	documentation =
		"""
		${man("VkAttachmentReference")}<br>
		${spec("VkAttachmentReference")}

		Describes a render pass attachment and what layout the attachment image will be in during a subpass.

		${ValidityStructs.VkAttachmentReference}
		"""

	uint32_t.member(
		"attachment",
		"""
		the index of the attachment of the render pass, and corresponds to the index of the corresponding element in the {@code pAttachments} array of the
		##VkRenderPassCreateInfo structure. If any color or depth/stencil attachments are #ATTACHMENT_UNUSED, then no writes occur for those attachments.
		"""
	)
	VkImageLayout.member(
		"layout",
		"""
		a {@code VkImageLayout} value specifying the layout the attachment uses during the subpass. The implementation will automatically perform layout
		transitions as needed between subpasses to make each subpass use the requested layouts.
		"""
	)
}.nativeType

val VkSubpassDescription = struct(VULKAN_PACKAGE, "VkSubpassDescription") {
	documentation =
		"""
		${man("VkSubpassDescription")}<br>
		${spec("VkSubpassDescription")}

		Describes the subpass that a fragment shader is executed in.

		${ValidityStructs.VkSubpassDescription}
		"""

	VkSubpassDescriptionFlags.member("flags", "reserved for future use")
	VkPipelineBindPoint.member(
		"pipelineBindPoint",
		"a {@code VkPipelineBindPoint} value specifying whether this is a compute or graphics subpass. Currently, only graphics subpasses are supported."
	)
	AutoSize("pInputAttachments", optional = true)..uint32_t.member("inputAttachmentCount", "the number of input attachments")
	VkAttachmentReference.const_p.buffer(
		"pInputAttachments",
		"""
		an array of ##VkAttachmentReference structures that lists which of the render pass’s attachments can be read in the shader during the subpass, and what
		layout the attachment images will be in during the subpass
		"""
	)
	AutoSize("pColorAttachments", "pResolveAttachments", optional = true)..uint32_t.member("colorAttachmentCount", "the number of color attachments")
	VkAttachmentReference.const_p.buffer(
		"pColorAttachments",
		"""
		an array of {@code colorAttachmentCount} ##VkAttachmentReference structures that lists which of the render pass’s attachments will be used as color
		attachments in the subpass, and what layout the attachment images will be in during the subpass
		"""
	)
	nullable..VkAttachmentReference.const_p.buffer(
		"pResolveAttachments",
		"""
		$NULL or a pointer to an array of ##VkAttachmentReference structures. If {@code pResolveAttachments} is not $NULL, each of its elements corresponds to
		a color attachment (the element in {@code pColorAttachments} at the same index)
		"""
	)
	nullable..VkAttachmentReference.const_p.member(
		"pDepthStencilAttachment",
		"a pointer to a ##VkAttachmentReference specifying which attachment will be used for depth/stencil data and the layout it will be in during the subpass"
	)
	AutoSize("pPreserveAttachments", optional = true)..uint32_t.member("preserveAttachmentCount", "the number of preserved attachments")
	uint32_t.const_p.member(
		"pPreserveAttachments",
		"""
		an array of {@code preserveAttachmentCount} render pass attachment indices describing the attachments that are not used by a subpass, but whose
		contents must be preserved throughout the subpass
		"""
	)
}.nativeType

val VkSubpassDependency = struct(VULKAN_PACKAGE, "VkSubpassDependency") {
	documentation =
		"""
		${man("VkSubpassDependency")}<br>
		${spec("VkSubpassDependency")}

		Describes dependencies between pairs of subpasses.

		${ValidityStructs.VkSubpassDependency}
		"""

	uint32_t.member("srcSubpass", "the subpass index of the producer subpass")
	uint32_t.member("dstSubpass", "the subpass index of the consumer subpass")
	VkPipelineStageFlags.member("srcStageMask", "a combination of {@code VkPipelineStageFlagBits} values")
	VkPipelineStageFlags.member("dstStageMask", "a combination of {@code VkPipelineStageFlagBits} values")
	VkAccessFlags.member("srcAccessMask", "a combination of {@code VkAccessFlagBits} values")
	VkAccessFlags.member("dstAccessMask", "a combination of {@code VkAccessFlagBits} values")
	VkDependencyFlags.member("dependencyFlags", "a combination of {@code VkDependencyFlagBits} values")
}.nativeType

val VkRenderPassCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkRenderPassCreateInfo") {
	documentation =
		"""
		${man("VkRenderPassCreateInfo")}<br>
		${spec("VkRenderPassCreateInfo")}

		Contains information about how a render pass should be created.

		${ValidityStructs.VkRenderPassCreateInfo}
		"""

	sType(this)
	pNext()
	VkRenderPassCreateFlags.member("flags", "reserved for future use")
	AutoSize("pAttachments", optional = true)..uint32_t.member(
		"attachmentCount",
		"the number of attachments used by this render pass, or zero indicating no attachments"
	)
	VkAttachmentDescription.const_p.buffer(
		"pAttachments",
		"""
		points to an array of {@code attachmentCount} number of ##VkAttachmentDescription structures describing properties of the attachments, or $NULL if
		{@code attachmentCount} is zero
		"""
	)
	AutoSize("pSubpasses")..uint32_t.member("subpassCount", "the number of subpasses to create for this render pass")
	VkSubpassDescription.const_p.buffer(
		"pSubpasses",
		"points to an array of {@code subpassCount} number of ##VkSubpassDescription structures describing properties of the subpasses"
	)
	AutoSize("pDependencies", optional = true)..uint32_t.member(
		"dependencyCount",
		"the number of dependencies between pairs of subpasses, or zero indicating no dependencies"
	)
	VkSubpassDependency.const_p.buffer(
		"pDependencies",
		"""
		points to an array of {@code dependencyCount} number of ##VkSubpassDependency structures describing dependencies between pairs of subpasses, or $NULL
		if {@code dependencyCount} is zero
		"""
	)
}

val VkCommandPoolCreateInfo_p = struct_p(VULKAN_PACKAGE, "VkCommandPoolCreateInfo") {
	documentation =
		"""
		${man("VkCommandPoolCreateInfo")}<br>
		${spec("VkCommandPoolCreateInfo")}

		Contains information about how a command pool should be created.

		${ValidityStructs.VkCommandPoolCreateInfo}
		"""

	sType(this)
	pNext()
	VkCommandPoolCreateFlags.member("flags", "a combination of bitfield flags indicating usage behavior for the pool and command buffers allocated from it")
	uint32_t.member("queueFamilyIndex", "designates a queue family")
}

val VkCommandBufferAllocateInfo_p = struct_p(VULKAN_PACKAGE, "VkCommandBufferAllocateInfo") {
	documentation =
		"""
		${man("VkCommandBufferAllocateInfo")}<br>
		${spec("VkCommandBufferAllocateInfo")}

		Contains information about how a command buffer should be allocated.

		${ValidityStructs.VkCommandBufferAllocateInfo}
		"""

	sType(this)
	pNext()
	VkCommandPool.member("commandPool", "the name of the command pool that the command buffers allocate their memory from")
	VkCommandBufferLevel.member("level", "determines whether the command buffers are primary or secondary command buffers")
	uint32_t.member("commandBufferCount", "the number of command buffers to allocate from the pool")
}

val VkCommandBufferInheritanceInfo = struct(VULKAN_PACKAGE, "VkCommandBufferInheritanceInfo") {
	documentation =
		"""
		${man("VkCommandBufferInheritanceInfo")}<br>
		${spec("VkCommandBufferInheritanceInfo")}

		Defines any state that will be inherited from a primary command buffer to a secondary command buffer.

		${ValidityStructs.VkCommandBufferInheritanceInfo}
		"""

	sType(this)
	pNext()
	VkRenderPass.member(
		"renderPass",
		"""
		a {@code VkRenderPass} object that must be compatible with the one that is bound when the {@code VkCommandBuffer} is executed if the command buffer was
		allocated with the #COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT set
		"""
	)
	uint32_t.member(
		"subpass",
		"""
		the index of the subpass within {@code renderPass} that the {@code VkCommandBuffer} will be rendering against if it was allocated with the
		#COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT set
		"""
	)
	VkFramebuffer.member(
		"framebuffer",
		"""
		refers to the {@code VkFramebuffer} object that the {@code VkCommandBuffer} will be rendering to if it was allocated with the
		#COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT set. It can be #NULL_HANDLE if the framebuffer is not known.
		"""
	)
	VkBool32.member(
		"occlusionQueryEnable",
		"indicates whether the command buffer can be executed while an occlusion query is active in the primary command buffer"
	)
	VkQueryControlFlags.member(
		"queryFlags",
		"indicates the query flags that can be used by an active occlusion query in the primary command buffer when this secondary command buffer is executed"
	)
	VkQueryPipelineStatisticFlags.member(
		"pipelineStatistics",
		"""
		indicates the set of pipeline statistics that can be counted by an active query in the primary command buffer when this secondary command buffer is
		executed
		"""
	)
}.nativeType

val VkCommandBufferBeginInfo_p = struct_p(VULKAN_PACKAGE, "VkCommandBufferBeginInfo") {
	documentation =
		"""
		${man("VkCommandBufferBeginInfo")}<br>
		${spec("VkCommandBufferBeginInfo")}

		Contrains information about a command buffer recording.

		${ValidityStructs.VkCommandBufferBeginInfo}
		"""

	sType(this)
	pNext()
	VkCommandBufferUsageFlags.member("flags", "a combination of bitfield flags indicating usage behavior for the command buffer")
	nullable..VkCommandBufferInheritanceInfo.const_p.member(
		"pInheritanceInfo",
		"""
		a pointer to a ##VkCommandBufferInheritanceInfo structure, which is used if {@code commandBuffer} is a secondary command buffer. If this is a primary
		command buffer, then this value is ignored.
		"""
	)
}

val VkBufferCopy_p = struct_p(VULKAN_PACKAGE, "VkBufferCopy") {
	documentation =
		"""
		${man("VkBufferCopy")}<br>
		${spec("VkBufferCopy")}

		Specifies a buffer regions to copy.
		"""

	VkDeviceSize.member("srcOffset", "the starting offset in bytes from the start of {@code srcBuffer}")
	VkDeviceSize.member("dstOffset", "the starting offset in bytes from the start of {@code dstBuffer}")
	VkDeviceSize.member("size", "the number of bytes to copy")
}

val VkImageSubresourceLayers = struct(VULKAN_PACKAGE, "VkImageSubresourceLayers") {
	documentation =
		"""
		${man("VkImageSubresourceLayers")}<br>
		${spec("VkImageSubresourceLayers")}

		Specifies a subresource of an image.

		${ValidityStructs.VkImageSubresourceLayers}
		"""

	VkImageAspectFlags.member("aspectMask", "a combination of {@code VkImageAspectFlagBits}, selecting the color, depth and/or stencil aspects")
	uint32_t.member("mipLevel", "the mipmap level")
	uint32_t.member("baseArrayLayer", "the starting layer")
	uint32_t.member("layerCount", "the number of layers")
}.nativeType

val VkOffset3D = struct(VULKAN_PACKAGE, "VkOffset3D") {
	documentation =
		"""
		${man("VkOffset3D")}<br>
		${spec("VkOffset3D")}

		Describes a 3D offset.
		"""

	int32_t.member("x", "the x offset")
	int32_t.member("y", "the y offset")
	int32_t.member("z", "the z offset")
}.nativeType

val VkImageCopy_p = struct_p(VULKAN_PACKAGE, "VkImageCopy") {
	documentation =
		"""
		${man("VkImageCopy")}<br>
		${spec("VkImageCopy")}

		Specifies the image regions to copy.

		${ValidityStructs.VkImageCopy}
		"""

	VkImageSubresourceLayers.member(
		"srcSubresource",
		"a ##VkImageSubresourceLayers structure specifying the subresource of the image used for the source image data"
	)
	VkOffset3D.member("srcOffset", "selects the initial x, y, and z offsets in texels of the sub-regions of the source image data")
	VkImageSubresourceLayers.member(
		"dstSubresource",
		"an ##VkImageSubresourceLayers structure specifying the subresource of the image used for the destination image data"
	)
	VkOffset3D.member("dstOffset", "selects the initial x, y, and z offsets in texels of the sub-regions of the destination image data")
	VkExtent3D.member("extent", "the size in texels of the source image to copy in width, height and depth")
}

val VkImageBlit_p = struct_p(VULKAN_PACKAGE, "VkImageBlit") {
	documentation =
		"""
		${man("VkImageBlit")}<br>
		${spec("VkImageBlit")}

		Specifies an image region to blit.

		${ValidityStructs.VkImageBlit}
		"""

	VkImageSubresourceLayers.member("srcSubresource", "the source image subresource")
	VkOffset3D.array("srcOffsets", "the source region", size = 2)
	VkImageSubresourceLayers.member("dstSubresource", "the destination image subresource")
	VkOffset3D.array("dstOffsets", "the destination region", size = 2)
}

val VkBufferImageCopy_p = struct_p(VULKAN_PACKAGE, "VkBufferImageCopy") {
	documentation =
		"""
		${man("VkBufferImageCopy")}<br>
		${spec("VkBufferImageCopy")}

		Specifies a region to copy.

		${ValidityStructs.VkBufferImageCopy}
		"""

	VkDeviceSize.member("bufferOffset", "the offset in bytes from the start of the buffer object where the image data is copied from or to")
	uint32_t.member("bufferRowLength", "the buffer row length")
	uint32_t.member("bufferImageHeight", "the buffer image height")
	VkImageSubresourceLayers.member(
		"imageSubresource",
		"a ##VkImageSubresourceLayers used to specify the specific subresources of the image used for the source or destination image data"
	)
	VkOffset3D.member("imageOffset", "selects the initial x, y, z offsets in texels of the sub-region of the source or destination image data")
	VkExtent3D.member("imageExtent", "the size in texels of the image to copy in width, height and depth")
}

val VkClearColorValue = union(VULKAN_PACKAGE, "VkClearColorValue") {
	documentation =
		"""
		${man("VkClearColorValue")}<br>
		${spec("VkClearColorValue")}

		Specifies the color image clear values to use when clearing a color image or attachment.
		"""

	float.array("float32", "used for floating point, unorm, snorm, uscaled, packed float, and sRGB formats", size = 4)
	int32_t.array("int32", "used for signed integer formats", size = 4)
	uint32_t.array("uint32", "used for unsigned integer formats", size = 4)
}.nativeType
val VkClearColorValue_p = VkClearColorValue.p

val VkClearDepthStencilValue = struct(VULKAN_PACKAGE, "VkClearDepthStencilValue") {
	documentation =
		"""
		${man("VkClearDepthStencilValue")}<br>
		${spec("VkClearDepthStencilValue")}

		Specifies the depth and stencil clear values to use when clearing a depth/stencil image or attachment.
		"""

	float.member(
		"depth",
		"""
		the clear value for the depth aspect of the depth/stencil attachment. It is a floating-point value which is automatically converted to the attachment’s
		format.
		"""
	)
	uint32_t.member(
		"stencil",
		"""
		the clear value for the stencil aspect of the depth/stencil attachment. It is a 32-bit integer value which is converted to the attachment’s format by
		taking the appropriate number of LSBs.
		"""
	)
}.nativeType
val VkClearDepthStencilValue_p = VkClearDepthStencilValue.p

val VkClearValue = union(VULKAN_PACKAGE, "VkClearValue") {
	documentation =
		"""
		${man("VkClearValue")}<br>
		${spec("VkClearValue")}

		Specifies the color or depth/stencil value to clear an attachment to.
		"""

	VkClearColorValue.member("color", "the color image clear values to use when clearing a color image or attachment")
	VkClearDepthStencilValue.member("depthStencil", "the depth and stencil clear values to use when clearing a depth/stencil image or attachment")
}.nativeType

val VkClearAttachment_p = struct_p(VULKAN_PACKAGE, "VkClearAttachment") {
	documentation =
		"""
		${man("VkClearAttachment")}<br>
		${spec("VkClearAttachment")}

		Defines an attachment to clear and the clear values to use.

		${ValidityStructs.VkClearAttachment}
		"""

	VkImageAspectFlags.member("aspectMask", "a mask selecting the color, depth and/or stencil aspects of the attachment to be cleared")
	uint32_t.member(
		"colorAttachment",
		"""
		is only meaningful if #IMAGE_ASPECT_COLOR_BIT is set in {@code aspectMask}, in which case it is an index to the {@code pColorAttachments} array in the
		##VkSubpassDescription structure of the current subpass which selects the color attachment to clear
		"""
	)
	VkClearValue.member("clearValue", "the color or depth/stencil value to clear the attachment to")
}

val VkClearRect_p = struct_p(VULKAN_PACKAGE, "VkClearRect") {
	documentation =
		"""
		${man("VkClearRect")}<br>
		${spec("VkClearRect")}

		Defines a region within an attachment to clear.
		"""

	VkRect2D.member("rect", "the two-dimensional region to be cleared")
	uint32_t.member("baseArrayLayer", "the first layer to be cleared")
	uint32_t.member("layerCount", "the number of layers to clear")
}

val VkImageResolve_p = struct_p(VULKAN_PACKAGE, "VkImageResolve") {
	documentation =
		"""
		${man("VkImageResolve")}<br>
		${spec("VkImageResolve")}

		Specifies a region to resolve.

		${ValidityStructs.VkImageResolve}
		"""

	VkImageSubresourceLayers.member(
		"srcSubresource",
		"a ##VkImageSubresourceLayers structure specifying the subresource of the image used for the source image data"
	)
	VkOffset3D.member("srcOffset", "selects the initial x, y, and z offsets in texels of the sub-region of the source image data")
	VkImageSubresourceLayers.member(
		"dstSubresource",
		"a ##VkImageSubresourceLayers structure specifying the subresource of the image used for the destination image data")
	VkOffset3D.member("dstOffset", "selects the initial x, y, and z offsets in texels of the sub-region of the destination image data")
	VkExtent3D.member("extent", "the size in texels of the source image to resolve in width, height and depth")
}

val VkMemoryBarrier_p = struct_p(VULKAN_PACKAGE, "VkMemoryBarrier") {
	documentation =
		"""
		${man("VkMemoryBarrier")}<br>
		${spec("VkMemoryBarrier")}

		Specifies a global memory barrier. This type of barrier applies to memory accesses involving all memory objects that exist at the time of its
		execution.

		${ValidityStructs.VkMemoryBarrier}
		"""

	sType(this)
	pNext()
	VkAccessFlags.member(
		"srcAccessMask",
		"a mask of the classes of memory accesses performed by the first set of commands that will participate in the dependency"
	)
	VkAccessFlags.member(
		"dstAccessMask",
		"a mask of the classes of memory accesses performed by the second set of commands that will participate in the dependency"
	)
}

val VkBufferMemoryBarrier_p = struct_p(VULKAN_PACKAGE, "VkBufferMemoryBarrier") {
	documentation =
		"""
		${man("VkBufferMemoryBarrier")}<br>
		${spec("VkBufferMemoryBarrier")}

		Specifies a buffer memory barrier. This type of barrier only applies to memory accesses involving a specific range of the specified buffer object. That
		is, a memory dependency formed from a buffer memory barrier is scoped to the specified range of the buffer. It is also used to transfer ownership of a
		buffer range from one queue family to another.

		${ValidityStructs.VkBufferMemoryBarrier}
		"""

	sType(this)
	pNext()
	VkAccessFlags.member(
		"srcAccessMask",
		"a mask of the classes of memory accesses performed by the first set of commands that will participate in the dependency"
	)
	VkAccessFlags.member(
		"dstAccessMask",
		"a mask of the classes of memory accesses performed by the second set of commands that will participate in the dependency"
	)
	uint32_t.member(
		"srcQueueFamilyIndex",
		"""
		the queue family that is relinquishing ownership of the range of buffer to another queue, or #QUEUE_FAMILY_IGNORED if there is no transfer of
		ownership
		"""
	)
	uint32_t.member(
		"dstQueueFamilyIndex",
		"the queue family that is acquiring ownership of the range of buffer from another queue, or #QUEUE_FAMILY_IGNORED if there is no transfer of ownership"
	)
	VkBuffer.member("buffer", "a handle to the buffer whose backing memory is affected by the barrier")
	VkDeviceSize.member("offset", "an offset in bytes into the backing memory for buffer; this is relative to the base offset as bound to the buffer")
	VkDeviceSize.member(
		"size",
		"a size in bytes of the affected area of backing memory for buffer, or #WHOLE_SIZE to use the range from offset to the end of the buffer"
	)
}

val VkImageMemoryBarrier_p = struct_p(VULKAN_PACKAGE, "VkImageMemoryBarrier") {
	documentation =
		"""
		${man("VkImageMemoryBarrier")}<br>
		${spec("VkImageMemoryBarrier")}

		Specifies an image memory barrier. This type of barrier only applies to memory accesses involving a specific subresource range of the specified image
		object. That is, a memory dependency formed from a image memory barrier is scoped to the specified subresources of the image. It is also used to
		perform a layout transition for an image subresource range, or to transfer ownership of an image subresource range from one queue family to another.

		${ValidityStructs.VkImageMemoryBarrier}
		"""

	sType(this)
	pNext()
	VkAccessFlags.member(
		"srcAccessMask",
		"a mask of the classes of memory accesses performed by the first set of commands that will participate in the dependency"
	)
	VkAccessFlags.member(
		"dstAccessMask",
		"a mask of the classes of memory accesses performed by the second set of commands that will participate in the dependency"
	)
	VkImageLayout.member("oldLayout", "describes the current layout of the image subresource(s)")
	VkImageLayout.member("newLayout", "describes the new layout of the image subresource(s)")
	uint32_t.member(
		"srcQueueFamilyIndex",
		"""
		the queue family that is relinquishing ownership of the image subresource(s) to another queue, or #QUEUE_FAMILY_IGNORED if there is no transfer of
		ownership)
		"""
	)
	uint32_t.member(
		"dstQueueFamilyIndex",
		"""
		the queue family that is acquiring ownership of the image subresource(s) from another queue, or #QUEUE_FAMILY_IGNORED if there is no transfer of
		ownership)
		"""
	)
	VkImage.member("image", "a handle to the image whose backing memory is affected by the barrier")
	VkImageSubresourceRange.member(
		"subresourceRange",
		"describes an area of the backing memory for image, as well as the set of subresources whose image layouts are modified"
	)
}

val VkRenderPassBeginInfo_p = struct_p(VULKAN_PACKAGE, "VkRenderPassBeginInfo") {
	documentation =
		"""
		${man("VkRenderPassBeginInfo")}<br>
		${spec("VkRenderPassBeginInfo")}

		Indicates the render pass to begin an instance of, and the framebuffer the instance uses.

		${ValidityStructs.VkRenderPassBeginInfo}
		"""

	sType(this)
	pNext()
	VkRenderPass.member("renderPass", "the render pass to begin an instance of")
	VkFramebuffer.member("framebuffer", "the framebuffer containing the attachments that are used with the render pass")
	VkRect2D.member("renderArea", "the render area that is affected by the render pass instance")
	AutoSize("pClearValues", optional = true)..uint32_t.member("clearValueCount", "the number of elements in {@code pClearValues}")
	VkClearValue.const_p.buffer(
		"pClearValues",
		"""
		an array of ##VkClearValue structures that contains clear values for each attachment, if the attachment uses a {@code loadOp} value of
		#ATTACHMENT_LOAD_OP_CLEAR. The array is indexed by attachment number, with elements corresponding to uncleared attachments being unused.
		"""
	)
}

// Indirect commands (not used in the API, for reference only)

val VkDispatchIndirectCommand = struct(VULKAN_PACKAGE, "VkDispatchIndirectCommand", mutable = false) {
	documentation =
		"""
		${man("VkDispatchIndirectCommand")}<br>
		${spec("VkDispatchIndirectCommand")}

		Describes an indirect dispatch command.

		${ValidityStructs.VkDispatchIndirectCommand}
		"""

	uint32_t.member("x", "the number of local workgroups to dispatch in the X dimension")
    uint32_t.member("y", "the number of local workgroups to dispatch in the Y dimension")
    uint32_t.member("z", "the number of local workgroups to dispatch in the Z dimension")
}.nativeType

val VkDrawIndexedIndirectCommand = struct(VULKAN_PACKAGE, "VkDrawIndexedIndirectCommand", mutable = false) {
	documentation =
		"""
		${man("VkDrawIndexedIndirectCommand")}<br>
		${spec("VkDrawIndexedIndirectCommand")}

		Describes an indirect indexed draw command.

		${ValidityStructs.VkDrawIndexedIndirectCommand}
		"""

    uint32_t.member("indexCount", "the number of vertices to draw")
    uint32_t.member("instanceCount", "the number of instances to draw")
    uint32_t.member("firstIndex", "the base index within the index buffer")
    int32_t.member("vertexOffset", "the value added to the vertex index before indexing into the vertex buffer")
    uint32_t.member("firstInstance", "the instance ID of the first instance to draw")
}.nativeType

val VkDrawIndirectCommand = struct(VULKAN_PACKAGE, "VkDrawIndirectCommand", mutable = false) {
	documentation =
		"""
		${man("VkDrawIndirectCommand")}<br>
		${spec("VkDrawIndirectCommand")}

		Describes an indirect draw command.

		${ValidityStructs.VkDrawIndirectCommand}
		"""

	uint32_t.member("vertexCount", "the number of vertices to draw")
    uint32_t.member("instanceCount", "the number of instances to draw")
    uint32_t.member("firstVertex", "the index of the first vertex to draw")
    uint32_t.member("firstInstance", "the instance ID of the first instance to draw")
}.nativeType