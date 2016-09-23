/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan

import org.lwjgl.generator.*

object ValidityStructs {

@JvmField val VkAllocationCallbacks =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code pfnAllocation} $must be a pointer to a valid user-defined PFN_vkAllocationFunction",
			"{@code pfnReallocation} $must be a pointer to a valid user-defined PFN_vkReallocationFunction",
			"{@code pfnFree} $must be a pointer to a valid user-defined PFN_vkFreeFunction",
			"If either of {@code pfnInternalAllocation} or {@code pfnInternalFree} is not $NULL, both $must be valid callbacks"
		)}"""

@JvmField val VkAndroidSurfaceCreateInfoKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_ANDROID_SURFACE_CREATE_INFO_KHR",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"{@code window} $must be a pointer to a {@code ANativeWindow} value",
			"{@code window} $must not be in a connected state"
		)}"""

@JvmField val VkApplicationInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_APPLICATION_INFO",
			"{@code pNext} $must be $NULL",
			"If {@code pApplicationName} is not $NULL, {@code pApplicationName} $must be a null-terminated string",
			"If {@code pEngineName} is not $NULL, {@code pEngineName} $must be a null-terminated string",
			"{@code apiVersion} $must be zero, or otherwise it $must be a version that the implementation supports, or supports an effective substitute for"
		)}"""

@JvmField val VkAttachmentDescription =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code flags} $must be a valid combination of {@code VkAttachmentDescriptionFlagBits} values",
			"{@code format} $must be a valid {@code VkFormat} value",
			"{@code samples} $must be a valid {@code VkSampleCountFlagBits} value",
			"{@code loadOp} $must be a valid {@code VkAttachmentLoadOp} value",
			"{@code storeOp} $must be a valid {@code VkAttachmentStoreOp} value",
			"{@code stencilLoadOp} $must be a valid {@code VkAttachmentLoadOp} value",
			"{@code stencilStoreOp} $must be a valid {@code VkAttachmentStoreOp} value",
			"{@code initialLayout} $must be a valid {@code VkImageLayout} value",
			"{@code finalLayout} $must be a valid {@code VkImageLayout} value",
			"{@code finalLayout} $must not be #IMAGE_LAYOUT_UNDEFINED or #IMAGE_LAYOUT_PREINITIALIZED"
		)}"""

@JvmField val VkAttachmentReference =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code layout} $must be a valid {@code VkImageLayout} value",
			"{@code layout} $must not be #IMAGE_LAYOUT_UNDEFINED or #IMAGE_LAYOUT_PREINITIALIZED"
		)}"""

@JvmField val VkBindSparseInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_BIND_SPARSE_INFO",
			"{@code pNext} $must be $NULL",
			"""
			If {@code waitSemaphoreCount} is not 0, {@code pWaitSemaphores} $must be a pointer to an array of {@code waitSemaphoreCount} valid
			{@code VkSemaphore} handles
			""",
			"""
			If {@code bufferBindCount} is not 0, {@code pBufferBinds} $must be a pointer to an array of {@code bufferBindCount} valid
			##VkSparseBufferMemoryBindInfo structures
			""",
			"""
			If {@code imageOpaqueBindCount} is not 0, {@code pImageOpaqueBinds} $must be a pointer to an array of {@code imageOpaqueBindCount} valid
			##VkSparseImageOpaqueMemoryBindInfo structures
			""",
			"""
			If {@code imageBindCount} is not 0, {@code pImageBinds} $must be a pointer to an array of {@code imageBindCount} valid
			##VkSparseImageMemoryBindInfo structures
			""",
			"""
			If {@code signalSemaphoreCount} is not 0, {@code pSignalSemaphores} $must be a pointer to an array of {@code signalSemaphoreCount} valid
			{@code VkSemaphore} handles
			""",
			"""
			Both of the elements of {@code pSignalSemaphores}, and the elements of {@code pWaitSemaphores} that are valid handles $must have been created,
			allocated, or retrieved from the same {@code VkDevice}
			"""
		)}"""

@JvmField val VkBufferCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_BUFFER_CREATE_INFO",
			"{@code pNext} $must be $NULL, or a pointer to a valid instance of {@code VkDedicatedAllocationBufferCreateInfoNV}",
			"{@code flags} $must be a valid combination of {@code VkBufferCreateFlagBits} values",
			"{@code usage} $must be a valid combination of {@code VkBufferUsageFlagBits} values",
			"{@code usage} $must not be 0",
			"{@code sharingMode} $must be a valid {@code VkSharingMode} value",
			"{@code size} $must be greater than 0",
			"""
			If {@code sharingMode} is #SHARING_MODE_CONCURRENT, {@code pQueueFamilyIndices} $must be a pointer to an array of {@code queueFamilyIndexCount}
			{@code uint32_t} values
			""",
			"If {@code sharingMode} is #SHARING_MODE_CONCURRENT, {@code queueFamilyIndexCount} $must be greater than 1",
			"If the sparse bindings feature is not enabled, {@code flags} $must not contain #BUFFER_CREATE_SPARSE_BINDING_BIT",
			"If the sparse buffer residency feature is not enabled, {@code flags} $must not contain #BUFFER_CREATE_SPARSE_RESIDENCY_BIT",
			"If the sparse aliased residency feature is not enabled, {@code flags} $must not contain #BUFFER_CREATE_SPARSE_ALIASED_BIT",
			"""
			If {@code flags} contains #BUFFER_CREATE_SPARSE_RESIDENCY_BIT or #BUFFER_CREATE_SPARSE_ALIASED_BIT, it $must also contain
			#BUFFER_CREATE_SPARSE_BINDING_BIT
			"""
		)}"""

@JvmField val VkBufferImageCopy =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code imageSubresource} $must be a valid ##VkImageSubresourceLayers structure",
			"{@code bufferOffset} $must be a multiple of the calling command's {@code VkImage} parameter's texel size",
			"{@code bufferOffset} $must be a multiple of 4",
			"{@code bufferRowLength} $must be 0, or greater than or equal to the {@code width} member of {@code imageExtent}",
			"{@code bufferImageHeight} $must be 0, or greater than or equal to the {@code height} member of {@code imageExtent}",
			"""
			{@code imageOffset.x} and ({@code imageExtent.width} + {@code imageOffset.x}) $must both be greater than or equal to 0 and less than or equal to
			the image subresource width
			""",
			"""
			{@code imageOffset.y} and (imageExtent.height + {@code imageOffset.y}) $must both be greater than or equal to 0 and less than or equal to the image
			subresource height
			""",
			"""
			{@code imageOffset.z} and (imageExtent.depth + {@code imageOffset.z}) $must both be greater than or equal to 0 and less than or equal to the image
			subresource depth
			""",
			"If the calling command's {@code VkImage} parameter is a compressed format image:",
			"""
			{@code bufferOffset}, {@code bufferRowLength}, {@code bufferImageHeight} and all members of {@code imageOffset} and {@code imageExtent} $must
			respect the image transfer granularity requirements of the queue family that it will be submitted against, as described in Physical Device
			Enumeration
			""",
			"The {@code aspectMask} member of {@code imageSubresource} $must specify aspects present in the calling command's {@code VkImage} parameter",
			"The {@code aspectMask} member of {@code imageSubresource} $must only have a single bit set",
			"""
			If the calling command's {@code VkImage} parameter is of {@code VkImageType} #IMAGE_TYPE_3D, the {@code baseArrayLayer} and {@code layerCount}
			members of {@code imageSubresource} $must be 0 and 1, respectively
			""",
			"When copying to the depth aspect of an image subresource, the data in the source buffer $must be in the range latexmath:[\$[0,1\\]\$]"
		)}"""

@JvmField val VkBufferMemoryBarrier =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER",
			"{@code pNext} $must be $NULL",
			"{@code srcAccessMask} $must be a valid combination of {@code VkAccessFlagBits} values",
			"{@code dstAccessMask} $must be a valid combination of {@code VkAccessFlagBits} values",
			"{@code buffer} $must be a valid {@code VkBuffer} handle",
			"{@code offset} $must be less than the size of {@code buffer}",
			"If {@code size} is not equal to #WHOLE_SIZE, {@code size} $must be greater than 0",
			"If {@code size} is not equal to #WHOLE_SIZE, {@code size} $must be less than or equal to than the size of {@code buffer} minus {@code offset}",
			"""
			If {@code buffer} was created with a sharing mode of #SHARING_MODE_CONCURRENT, {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} $must
			both be #QUEUE_FAMILY_IGNORED
			""",
			"""
			If {@code buffer} was created with a sharing mode of #SHARING_MODE_EXCLUSIVE, {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} $must
			either both be #QUEUE_FAMILY_IGNORED, or both be a valid queue family
			""",
			"""
			If {@code buffer} was created with a sharing mode of #SHARING_MODE_EXCLUSIVE, and {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} are
			valid queue families, at least one of them $must be the same as the family of the queue that will execute this barrier
			"""
		)}"""

@JvmField val VkBufferViewCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"{@code buffer} $must be a valid {@code VkBuffer} handle",
			"{@code format} $must be a valid {@code VkFormat} value",
			"{@code offset} $must be less than the size of {@code buffer}",
			"{@code offset} $must be a multiple of ##VkPhysicalDeviceLimits{@code ::minTexelBufferOffsetAlignment}",
			"If {@code range} is not equal to #WHOLE_SIZE:",
			"""
			{@code buffer} $must have been created with a {@code usage} value containing at least one of #BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT or
			#BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT
			""",
			"""
			If {@code buffer} was created with {@code usage} containing #BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT, {@code format} $must be supported for uniform
			texel buffers, as specified by the #FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT flag in ##VkFormatProperties{@code ::bufferFeatures} returned by
			#GetPhysicalDeviceFormatProperties()
			""",
			"""
			If {@code buffer} was created with {@code usage} containing #BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT, {@code format} $must be supported for storage
			texel buffers, as specified by the #FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT flag in ##VkFormatProperties{@code ::bufferFeatures} returned by
			#GetPhysicalDeviceFormatProperties()
			"""
		)}"""

@JvmField val VkClearAttachment =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code aspectMask} $must be a valid combination of {@code VkImageAspectFlagBits} values",
			"{@code aspectMask} $must not be 0",
			"{@code clearValue} $must be a valid {@code VkClearValue} union",
			"If {@code aspectMask} includes #IMAGE_ASPECT_COLOR_BIT, it $must not include #IMAGE_ASPECT_DEPTH_BIT or #IMAGE_ASPECT_STENCIL_BIT",
			"{@code aspectMask} $must not include #IMAGE_ASPECT_METADATA_BIT"
		)}"""

@JvmField val VkClearDepthStencilValue =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code depth} $must be between {@code 0.0} and {@code 1.0}, inclusive"
		)}"""

@JvmField val VkClearValue =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code depthStencil} $must be a valid ##VkClearDepthStencilValue structure"
		)}"""

@JvmField val VkCommandBufferAllocateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code commandPool} $must be a valid {@code VkCommandPool} handle",
			"{@code level} $must be a valid {@code VkCommandBufferLevel} value",
			"{@code commandBufferCount} $must be greater than 0"
		)}"""

@JvmField val VkCommandBufferBeginInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be a valid combination of {@code VkCommandBufferUsageFlagBits} values",
			"""
			If {@code flags} contains #COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT, the {@code renderPass} member of {@code pInheritanceInfo} $must be a
			valid {@code VkRenderPass}
			""",
			"""
			If {@code flags} contains #COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT, the {@code subpass} member of {@code pInheritanceInfo} $must be a valid
			subpass index within the {@code renderPass} member of {@code pInheritanceInfo}
			""",
			"""
			If {@code flags} contains #COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT, the {@code framebuffer} member of {@code pInheritanceInfo} $must be
			either #NULL_HANDLE, or a valid {@code VkFramebuffer} that is compatible with the {@code renderPass} member of {@code pInheritanceInfo}
			"""
		)}"""

@JvmField val VkCommandBufferInheritanceInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO",
			"{@code pNext} $must be $NULL",
			"""
			Both of {@code framebuffer}, and {@code renderPass} that are valid handles $must have been created, allocated, or retrieved from the same
			{@code VkDevice}
			""",
			"If the inherited queries feature is not enabled, {@code occlusionQueryEnable} $must be #FALSE",
			"If the inherited queries feature is enabled, {@code queryFlags} $must be a valid combination of {@code VkQueryControlFlagBits} values",
			"If the pipeline statistics queries feature is not enabled, {@code pipelineStatistics} $must be 0"
		)}"""

@JvmField val VkCommandPoolCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be a valid combination of {@code VkCommandPoolCreateFlagBits} values",
			"{@code queueFamilyIndex} $must be the index of a queue family available in the calling command's {@code device} parameter"
		)}"""

@JvmField val VkComponentMapping =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code r} $must be a valid {@code VkComponentSwizzle} value",
			"{@code g} $must be a valid {@code VkComponentSwizzle} value",
			"{@code b} $must be a valid {@code VkComponentSwizzle} value",
			"{@code a} $must be a valid {@code VkComponentSwizzle} value"
		)}"""

@JvmField val VkComputePipelineCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be a valid combination of {@code VkPipelineCreateFlagBits} values",
			"{@code stage} $must be a valid ##VkPipelineShaderStageCreateInfo structure",
			"{@code layout} $must be a valid {@code VkPipelineLayout} handle",
			"""
			Both of {@code basePipelineHandle}, and {@code layout} that are valid handles $must have been created, allocated, or retrieved from the same
			{@code VkDevice}
			""",
			"""
			If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineIndex} is not {@code -1}, {@code basePipelineHandle}
			$must be #NULL_HANDLE
			""",
			"""
			If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineIndex} is not {@code -1}, it $must be a valid index into
			the calling command's {@code pCreateInfos} parameter
			""",
			"""
			If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineHandle} is not #NULL_HANDLE, {@code basePipelineIndex}
			$must be {@code -1}
			""",
			"""
			If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineHandle} is not #NULL_HANDLE, {@code basePipelineHandle}
			$must be a valid {@code VkPipeline} handle
			""",
			"""
			If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineHandle} is not #NULL_HANDLE, it $must be a valid handle
			to a compute {@code VkPipeline}
			""",
			"The {@code stage} member of {@code stage} $must be #SHADER_STAGE_COMPUTE_BIT",
			"""
			The shader code for the entry point identified by {@code stage} and the rest of the state identified by this structure $must adhere to the pipeline
			linking rules described in the Shader Interfaces chapter
			""",
			"{@code layout} $must be consistent with all shaders specified in {@code pStages}"
		)}"""

@JvmField val VkCopyDescriptorSet =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_COPY_DESCRIPTOR_SET",
			"{@code pNext} $must be $NULL",
			"{@code srcSet} $must be a valid {@code VkDescriptorSet} handle",
			"{@code dstSet} $must be a valid {@code VkDescriptorSet} handle",
			"Both of {@code dstSet}, and {@code srcSet} $must have been created, allocated, or retrieved from the same {@code VkDevice}",
			"{@code srcBinding} $must be a valid binding within {@code srcSet}",
			"""
			The sum of {@code srcArrayElement} and {@code descriptorCount} $must be less than or equal to the number of array elements in the descriptor set
			binding specified by {@code srcBinding}, and all applicable consecutive bindings
			""",
			"{@code dstBinding} $must be a valid binding within {@code dstSet}",
			"""
			The sum of {@code dstArrayElement} and {@code descriptorCount} $must be less than or equal to the number of array elements in the descriptor set
			binding specified by {@code dstBinding}, and all applicable consecutive bindings
			""",
			"""
			If {@code srcSet} is equal to {@code dstSet}, then the source and destination ranges of descriptors $must not overlap, where the ranges $may
			include array elements from consecutive bindings
			"""
		)}"""

@JvmField val VkDebugMarkerMarkerInfoEXT =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT",
			"{@code pNext} $must be $NULL",
			"{@code pMarkerName} $must be a null-terminated string"
		)}"""

@JvmField val VkDebugMarkerObjectNameInfoEXT =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT",
			"{@code pNext} $must be $NULL",
			"{@code objectType} $must be a valid {@code VkDebugReportObjectTypeEXT} value",
			"{@code pObjectName} $must be a null-terminated string"
		)}"""

@JvmField val VkDebugMarkerObjectTagInfoEXT =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT",
			"{@code pNext} $must be $NULL",
			"{@code objectType} $must be a valid {@code VkDebugReportObjectTypeEXT} value",
			"{@code pTag} $must be a pointer to an array of {@code tagSize} bytes",
			"{@code tagSize} $must be greater than 0"
		)}"""

@JvmField val VkDebugReportCallbackCreateInfoEXT =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be a valid combination of {@code VkDebugReportFlagBitsEXT} values",
			"{@code flags} $must not be 0"
		)}"""

@JvmField val VkDebugReportLayerFlagsEXT =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_DEBUG_REPORT_LAYER_FLAGS_EXT",
			"{@code pNext} $must be $NULL"
		)}"""

@JvmField val VkDedicatedAllocationBufferCreateInfoNV =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV",
			"{@code pNext} $must be $NULL",
			"""
			If {@code dedicatedAllocation} is #TRUE, ##VkBufferCreateInfo{@code ::flags} $must not include #BUFFER_CREATE_SPARSE_BINDING_BIT,
			#BUFFER_CREATE_SPARSE_RESIDENCY_BIT, or #BUFFER_CREATE_SPARSE_ALIASED_BIT
			"""
		)}"""

@JvmField val VkDedicatedAllocationImageCreateInfoNV =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV",
			"{@code pNext} $must be $NULL",
			"""
			If {@code dedicatedAllocation} is #TRUE, ##VkImageCreateInfo{@code ::flags} $must not include #IMAGE_CREATE_SPARSE_BINDING_BIT,
			#IMAGE_CREATE_SPARSE_RESIDENCY_BIT, or #IMAGE_CREATE_SPARSE_ALIASED_BIT
			"""
		)}"""

@JvmField val VkDedicatedAllocationMemoryAllocateInfoNV =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV",
			"{@code pNext} $must be $NULL",
			"If {@code image} is not #NULL_HANDLE, {@code image} $must be a valid {@code VkImage} handle",
			"If {@code buffer} is not #NULL_HANDLE, {@code buffer} $must be a valid {@code VkBuffer} handle",
			"Both of {@code buffer}, and {@code image} that are valid handles $must have been created, allocated, or retrieved from the same {@code VkDevice}",
			"At least one of {@code image} and {@code buffer} $must be #NULL_HANDLE",
			"""
			If {@code image} is not #NULL_HANDLE, the image $must have been created with ##VkDedicatedAllocationImageCreateInfoNV{@code ::dedicatedAllocation}
			equal to #TRUE
			""",
			"""
			If {@code buffer} is not #NULL_HANDLE, the buffer $must have been created with
			##VkDedicatedAllocationBufferCreateInfoNV{@code ::dedicatedAllocation} equal to #TRUE
			""",
			"""
			If {@code image} is not #NULL_HANDLE, ##VkMemoryAllocateInfo{@code ::allocationSize} $must equal the ##VkMemoryRequirements{@code ::size} of the
			image
			""",
			"""
			If {@code buffer} is not #NULL_HANDLE, ##VkMemoryAllocateInfo{@code ::allocationSize} $must equal the ##VkMemoryRequirements{@code ::size} of the
			buffer
			"""
		)}"""

@JvmField val VkDescriptorBufferInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code buffer} $must be a valid {@code VkBuffer} handle",
			"{@code offset} $must be less than the size of {@code buffer}",
			"If {@code range} is not equal to #WHOLE_SIZE, {@code range} $must be greater than 0",
			"If {@code range} is not equal to #WHOLE_SIZE, {@code range} $must be less than or equal to the size of {@code buffer} minus {@code offset}"
		)}"""

@JvmField val VkDescriptorImageInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"""
			Both of {@code imageView}, and {@code sampler} that are valid handles $must have been created, allocated, or retrieved from the same
			{@code VkDevice}
			"""
		)}"""

@JvmField val VkDescriptorPoolCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be a valid combination of {@code VkDescriptorPoolCreateFlagBits} values",
			"{@code pPoolSizes} $must be a pointer to an array of {@code poolSizeCount} valid ##VkDescriptorPoolSize structures",
			"{@code poolSizeCount} $must be greater than 0",
			"{@code maxSets} $must be greater than 0"
		)}"""

@JvmField val VkDescriptorPoolSize =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code type} $must be a valid {@code VkDescriptorType} value",
			"{@code descriptorCount} $must be greater than 0"
		)}"""

@JvmField val VkDescriptorSetAllocateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code descriptorPool} $must be a valid {@code VkDescriptorPool} handle",
			"{@code pSetLayouts} $must be a pointer to an array of {@code descriptorSetCount} valid {@code VkDescriptorSetLayout} handles",
			"{@code descriptorSetCount} $must be greater than 0",
			"""
			Both of {@code descriptorPool}, and the elements of {@code pSetLayouts} $must have been created, allocated, or retrieved from the same
			{@code VkDevice}
			""",
			"{@code descriptorSetCount} $must not be greater than the number of sets that are currently available for allocation in {@code descriptorPool}",
			"{@code descriptorPool} $must have enough free descriptor capacity remaining to allocate the descriptor sets of the specified layouts"
		)}"""

@JvmField val VkDescriptorSetLayoutBinding =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code descriptorType} $must be a valid {@code VkDescriptorType} value",
			"""
			If {@code descriptorType} is #DESCRIPTOR_TYPE_SAMPLER or #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, and {@code descriptorCount} is not 0 and
			{@code pImmutableSamplers} is not $NULL, {@code pImmutableSamplers} $must be a pointer to an array of {@code descriptorCount} valid
			{@code VkSampler} handles
			""",
			"If {@code descriptorCount} is not 0, {@code stageFlags} $must be a valid combination of {@code VkShaderStageFlagBits} values"
		)}"""

@JvmField val VkDescriptorSetLayoutCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"""
			If {@code bindingCount} is not 0, {@code pBindings} $must be a pointer to an array of {@code bindingCount} valid ##VkDescriptorSetLayoutBinding
			structures
			"""
		)}"""

@JvmField val VkDeviceCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_DEVICE_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"{@code pQueueCreateInfos} $must be a pointer to an array of {@code queueCreateInfoCount} valid ##VkDeviceQueueCreateInfo structures",
			"""
			If {@code enabledLayerCount} is not 0, {@code ppEnabledLayerNames} $must be a pointer to an array of {@code enabledLayerCount} null-terminated
			strings
			""",
			"""
			If {@code enabledExtensionCount} is not 0, {@code ppEnabledExtensionNames} $must be a pointer to an array of {@code enabledExtensionCount}
			null-terminated strings
			""",
			"If {@code pEnabledFeatures} is not $NULL, {@code pEnabledFeatures} $must be a pointer to a valid ##VkPhysicalDeviceFeatures structure",
			"{@code queueCreateInfoCount} $must be greater than 0",
			"The {@code queueFamilyIndex} member of any given element of {@code pQueueCreateInfos} $must be unique within {@code pQueueCreateInfos}"
		)}"""

@JvmField val VkDeviceQueueCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"{@code pQueuePriorities} $must be a pointer to an array of {@code queueCount} {@code float} values",
			"{@code queueCount} $must be greater than 0",
			"{@code queueFamilyIndex} $must be less than {@code pQueueFamilyPropertyCount} returned by #GetPhysicalDeviceQueueFamilyProperties()",
			"""
			{@code queueCount} $must be less than or equal to the {@code queueCount} member of the ##VkQueueFamilyProperties structure, as returned by
			#GetPhysicalDeviceQueueFamilyProperties() in the {@code pQueueFamilyProperties}[{@code queueFamilyIndex}]
			""",
			"Each element of {@code pQueuePriorities} $must be between {@code 0.0} and {@code 1.0} inclusive"
		)}"""

@JvmField val VkDispatchIndirectCommand =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code x} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[0]",
			"{@code y} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[1]",
			"{@code z} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[2]"
		)}"""

@JvmField val VkDisplayModeCreateInfoKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"The {@code width} and {@code height} members of the {@code visibleRegion} member of {@code parameters} $must be greater than 0",
			"The {@code refreshRate} member of {@code parameters} $must be greater than 0"
		)}"""

@JvmField val VkDisplayModePropertiesKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code displayMode} $must be a valid {@code VkDisplayModeKHR} handle"
		)}"""

@JvmField val VkDisplayPlaneCapabilitiesKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code supportedAlpha} $must be a valid combination of {@code VkDisplayPlaneAlphaFlagBitsKHR} values"
		)}"""

@JvmField val VkDisplayPlanePropertiesKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code currentDisplay} $must be a valid {@code VkDisplayKHR} handle"
		)}"""

@JvmField val VkDisplayPresentInfoKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR",
			"{@code pNext} $must be $NULL",
			"{@code srcRect} $must specify a rectangular region that is a subset of the image being presented",
			"""
			{@code dstRect} $must specify a rectangular region that is a subset of the {@code visibleRegion} parameter of the display mode the swapchain being
			presented uses
			""",
			"""
			If the {@code persistentContent} member of the ##VkDisplayPropertiesKHR structure returned by #GetPhysicalDeviceDisplayPropertiesKHR() for the
			display the present operation targets then {@code persistent} $must be #FALSE
			"""
		)}"""

@JvmField val VkDisplayPropertiesKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code display} $must be a valid {@code VkDisplayKHR} handle",
			"{@code displayName} $must be a null-terminated string",
			"{@code supportedTransforms} $must be a valid combination of {@code VkSurfaceTransformFlagBitsKHR} values"
		)}"""

@JvmField val VkDisplaySurfaceCreateInfoKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"{@code displayMode} $must be a valid {@code VkDisplayModeKHR} handle",
			"{@code transform} $must be a valid {@code VkSurfaceTransformFlagBitsKHR} value",
			"{@code alphaMode} $must be a valid {@code VkDisplayPlaneAlphaFlagBitsKHR} value",
			"""
			{@code planeIndex} $must be less than the number of display planes supported by the device as determined by calling
			#GetPhysicalDeviceDisplayPlanePropertiesKHR()
			""",
			"""
			If the {@code planeReorderPossible} member of the ##VkDisplayPropertiesKHR structure returned by #GetPhysicalDeviceDisplayPropertiesKHR() for the
			display corresponding to {@code displayMode} is #TRUE then {@code planeStackIndex} $must be less than the number of display planes supported by the
			device as determined by calling #GetPhysicalDeviceDisplayPlanePropertiesKHR(); otherwise {@code planeStackIndex} $must equal the
			{@code currentStackIndex} member of {@code VkDisplayPlanePropertiesKHR} returned by #GetPhysicalDeviceDisplayPlanePropertiesKHR() for the display
			plane corresponding to {@code displayMode}
			""",
			"If {@code alphaMode} is #DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR then {@code globalAlpha} $must be between 0 and 1, inclusive",
			"""
			{@code alphaMode} $must be 0 or one of the bits present in the {@code supportedAlpha} member of {@code VkDisplayPlaneCapabilitiesKHR} returned by
			#GetDisplayPlaneCapabilitiesKHR() for the display plane corresponding to {@code displayMode}
			""",
			"""
			The {@code width} and {@code height} members of {@code imageExtent} $must be less than the {@code maxImageDimensions2D} member of
			{@code VkPhysicalDeviceLimits}
			"""
		)}"""

@JvmField val VkDrawIndexedIndirectCommand =
	"""<h5>Valid Usage</h5>
		${ul(
			"For a given vertex buffer binding, any attribute data fetched $must be entirely contained within the corresponding vertex buffer binding",
			"""
			({@code indexSize} * ({@code firstIndex} + {@code indexCount}) + {@code offset}) $must be less than or equal to the size of the currently bound
			index buffer, with {@code indexSize} being based on the type specified by {@code indexType}, where the index buffer, {@code indexType}, and
			{@code offset} are specified via #CmdBindIndexBuffer()
			""",
			"If the drawIndirectFirstInstance feature is not enabled, {@code firstInstance} $must be 0"
		)}"""

@JvmField val VkDrawIndirectCommand =
	"""<h5>Valid Usage</h5>
		${ul(
			"For a given vertex buffer binding, any attribute data fetched $must be entirely contained within the corresponding vertex buffer binding",
			"If the drawIndirectFirstInstance feature is not enabled, {@code firstInstance} $must be 0"
		)}"""

@JvmField val VkEventCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_EVENT_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0"
		)}"""

@JvmField val VkExportMemoryAllocateInfoNV =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV",
			"{@code pNext} $must be $NULL",
			"{@code handleTypes} $must be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values",
			"{@code handleTypes} $must not be 0"
		)}"""

@JvmField val VkExportMemoryWin32HandleInfoNV =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV",
			"{@code pNext} $must be $NULL",
			"{@code pAttributes} $must be a pointer to a valid {@code SECURITY_ATTRIBUTES} value"
		)}"""

@JvmField val VkExternalImageFormatPropertiesNV =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code imageFormatProperties} $must be a valid ##VkImageFormatProperties structure",
			"{@code externalMemoryFeatures} $must be a valid combination of {@code VkExternalMemoryFeatureFlagBitsNV} values",
			"{@code externalMemoryFeatures} $must not be 0",
			"{@code exportFromImportedHandleTypes} $must be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values",
			"{@code exportFromImportedHandleTypes} $must not be 0",
			"{@code compatibleHandleTypes} $must be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values",
			"{@code compatibleHandleTypes} $must not be 0"
		)}"""

@JvmField val VkExternalMemoryImageCreateInfoNV =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_NV",
			"{@code pNext} $must be $NULL",
			"{@code handleTypes} $must be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values",
			"{@code handleTypes} $must not be 0"
		)}"""

@JvmField val VkFenceCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_FENCE_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be a valid combination of {@code VkFenceCreateFlagBits} values"
		)}"""

@JvmField val VkFramebufferCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"{@code renderPass} $must be a valid {@code VkRenderPass} handle",
			"""
			If {@code attachmentCount} is not 0, {@code pAttachments} $must be a pointer to an array of {@code attachmentCount} valid {@code VkImageView}
			handles
			""",
			"""
			Both of {@code renderPass}, and the elements of {@code pAttachments} that are valid handles $must have been created, allocated, or retrieved from
			the same {@code VkDevice}
			""",
			"{@code attachmentCount} $must be equal to the attachment count specified in {@code renderPass}",
			"""
			Any given element of {@code pAttachments} that is used as a color attachment or resolve attachment by {@code renderPass} $must have been created
			with a {@code usage} value including #IMAGE_USAGE_COLOR_ATTACHMENT_BIT
			""",
			"""
			Any given element of {@code pAttachments} that is used as a depth/stencil attachment by {@code renderPass} $must have been created with a
			{@code usage} value including #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT
			""",
			"""
			Any given element of {@code pAttachments} that is used as an input attachment by {@code renderPass} $must have been created with a {@code usage}
			value including #IMAGE_USAGE_INPUT_ATTACHMENT_BIT
			""",
			"""
			Any given element of {@code pAttachments} $must have been created with an {@code VkFormat} value that matches the {@code VkFormat} specified by the
			corresponding {@code VkAttachmentDescription} in {@code renderPass}
			""",
			"""
			Any given element of {@code pAttachments} $must have been created with a {@code samples} value that matches the {@code samples} value specified by
			the corresponding {@code VkAttachmentDescription} in {@code renderPass}
			""",
			"Any given element of {@code pAttachments} $must have dimensions at least as large as the corresponding framebuffer dimension",
			"Any given element of {@code pAttachments} $must only specify a single mip level",
			"Any given element of {@code pAttachments} $must have been created with the identity swizzle",
			"{@code width} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxFramebufferWidth}",
			"{@code height} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxFramebufferHeight}",
			"{@code layers} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxFramebufferLayers}"
		)}"""

@JvmField val VkGraphicsPipelineCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be a valid combination of {@code VkPipelineCreateFlagBits} values",
			"{@code pStages} $must be a pointer to an array of {@code stageCount} valid ##VkPipelineShaderStageCreateInfo structures",
			"{@code pVertexInputState} $must be a pointer to a valid ##VkPipelineVertexInputStateCreateInfo structure",
			"{@code pInputAssemblyState} $must be a pointer to a valid ##VkPipelineInputAssemblyStateCreateInfo structure",
			"{@code pRasterizationState} $must be a pointer to a valid ##VkPipelineRasterizationStateCreateInfo structure",
			"If {@code pDynamicState} is not $NULL, {@code pDynamicState} $must be a pointer to a valid ##VkPipelineDynamicStateCreateInfo structure",
			"{@code layout} $must be a valid {@code VkPipelineLayout} handle",
			"{@code renderPass} $must be a valid {@code VkRenderPass} handle",
			"{@code stageCount} $must be greater than 0",
			"""
			Each of {@code basePipelineHandle}, {@code layout}, and {@code renderPass} that are valid handles $must have been created, allocated, or retrieved
			from the same {@code VkDevice}
			""",
			"""
			If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineIndex} is not {@code -1}, {@code basePipelineHandle}
			$must be #NULL_HANDLE
			""",
			"""
			If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineIndex} is not {@code -1}, it $must be a valid index into
			the calling command's {@code pCreateInfos} parameter
			""",
			"""
			If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineHandle} is not #NULL_HANDLE, {@code basePipelineIndex}
			$must be {@code -1}
			""",
			"""
			If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineHandle} is not #NULL_HANDLE, {@code basePipelineHandle}
			$must be a valid {@code VkPipeline} handle
			""",
			"""
			If {@code flags} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and {@code basePipelineHandle} is not #NULL_HANDLE, it $must be a valid handle
			to a graphics {@code VkPipeline}
			""",
			"The {@code stage} member of each element of {@code pStages} $must be unique",
			"The {@code stage} member of one element of {@code pStages} $must be #SHADER_STAGE_VERTEX_BIT",
			"The {@code stage} member of any given element of {@code pStages} $must not be #SHADER_STAGE_COMPUTE_BIT",
			"If {@code pStages} includes a tessellation control shader stage, it $must include a tessellation evaluation shader stage",
			"If {@code pStages} includes a tessellation evaluation shader stage, it $must include a tessellation control shader stage",
			"""
			If {@code pStages} includes a tessellation control shader stage and a tessellation evaluation shader stage, {@code pTessellationState} $must not be
			$NULL
			""",
			"""
			If {@code pStages} includes tessellation shader stages, the shader code of at least one stage $must contain an {@code OpExecutionMode} instruction
			that specifies the type of subdivision in the pipeline
			""",
			"""
			If {@code pStages} includes tessellation shader stages, and the shader code of both stages contain an {@code OpExecutionMode} instruction that
			specifies the type of subdivision in the pipeline, they $must both specify the same subdivision mode
			""",
			"""
			If {@code pStages} includes tessellation shader stages, the shader code of at least one stage $must contain an {@code OpExecutionMode} instruction
			that specifies the output patch size in the pipeline
			""",
			"""
			If {@code pStages} includes tessellation shader stages, and the shader code of both contain an {@code OpExecutionMode} instruction that specifies
			the out patch size in the pipeline, they $must both specify the same patch size
			""",
			"""
			If {@code pStages} includes tessellation shader stages, the {@code topology} member of {@code pInputAssembly} $must be
			#PRIMITIVE_TOPOLOGY_PATCH_LIST
			""",
			"""
			If the {@code topology} member of {@code pInputAssembly} is #PRIMITIVE_TOPOLOGY_PATCH_LIST, {@code pStages} $must include tessellation shader
			stages
			""",
			"""
			If {@code pStages} includes a geometry shader stage, and does not include any tessellation shader stages, its shader code $must contain an
			{@code OpExecutionMode} instruction that specifies an input primitive type that is compatible with the primitive topology specified in
			{@code pInputAssembly}
			""",
			"""
			If {@code pStages} includes a geometry shader stage, and also includes tessellation shader stages, its shader code $must contain an
			{@code OpExecutionMode} instruction that specifies an input primitive type that is compatible with the primitive topology that is output by the
			tessellation stages
			""",
			"""
			If {@code pStages} includes a fragment shader stage and a geometry shader stage, and the fragment shader code reads from an input variable that is
			decorated with {@code PrimitiveID}, then the geometry shader code $must write to a matching output variable, decorated with {@code PrimitiveID}, in
			all execution paths
			""",
			"""
			If {@code pStages} includes a fragment shader stage, its shader code $must not read from any input attachment that is defined as #ATTACHMENT_UNUSED
			in {@code subpass}
			""",
			"""
			The shader code for the entry points identified by {@code pStages}, and the rest of the state identified by this structure $must adhere to the
			pipeline linking rules described in the Shader Interfaces chapter
			""",
			"""
			If {@code subpass} uses a depth/stencil attachment in {@code renderpass} that has a layout of #IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL in the
			{@code VkAttachmentReference} defined by {@code subpass}, and {@code pDepthStencilState} is not $NULL, the {@code depthWriteEnable} member of
			{@code pDepthStencilState} $must be #FALSE
			""",
			"""
			If {@code subpass} uses a depth/stencil attachment in {@code renderpass} that has a layout of #IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL in the
			{@code VkAttachmentReference} defined by {@code subpass}, and {@code pDepthStencilState} is not $NULL, the {@code failOp}, {@code passOp} and
			{@code depthFailOp} members of each of the {@code front} and {@code back} members of {@code pDepthStencilState} $must be #STENCIL_OP_KEEP
			""",
			"""
			If {@code pColorBlendState} is not $NULL, the {@code blendEnable} member of each element of the {@code pAttachment} member of
			{@code pColorBlendState} $must be #FALSE if the {@code format} of the attachment referred to in {@code subpass} of {@code renderPass} does not
			support color blend operations, as specified by the #FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT flag in
			##VkFormatProperties{@code ::linearTilingFeatures} or ##VkFormatProperties{@code ::optimalTilingFeatures} returned by
			#GetPhysicalDeviceFormatProperties()
			""",
			"""
			If {@code pColorBlendState} is not $NULL, The {@code attachmentCount} member of {@code pColorBlendState} $must be equal to the
			{@code colorAttachmentCount} used to create {@code subpass}
			""",
			"""
			If no element of the {@code pDynamicStates} member of {@code pDynamicState} is #DYNAMIC_STATE_VIEWPORT, the {@code pViewports} member of
			{@code pViewportState} $must be a pointer to an array of {@code pViewportState}->viewportCount ##VkViewport structures
			""",
			"""
			If no element of the {@code pDynamicStates} member of {@code pDynamicState} is #DYNAMIC_STATE_SCISSOR, the {@code pScissors} member of
			{@code pViewportState} $must be a pointer to an array of {@code pViewportState}->scissorCount ##VkRect2D structures
			""",
			"""
			If the wide lines feature is not enabled, and no element of the {@code pDynamicStates} member of {@code pDynamicState} is
			#DYNAMIC_STATE_LINE_WIDTH, the {@code lineWidth} member of {@code pRasterizationState} $must be {@code 1.0}
			""",
			"""
			If the {@code rasterizerDiscardEnable} member of {@code pRasterizationState} is #FALSE, {@code pViewportState} $must be a pointer to a valid
			##VkPipelineViewportStateCreateInfo structure
			""",
			"""
			If the {@code rasterizerDiscardEnable} member of {@code pRasterizationState} is #FALSE, {@code pMultisampleState} $must be a pointer to a valid
			##VkPipelineMultisampleStateCreateInfo structure
			""",
			"""
			If the {@code rasterizerDiscardEnable} member of {@code pRasterizationState} is #FALSE, and {@code subpass} uses a depth/stencil attachment,
			{@code pDepthStencilState} $must be a pointer to a valid ##VkPipelineDepthStencilStateCreateInfo structure
			""",
			"""
			If the {@code rasterizerDiscardEnable} member of {@code pRasterizationState} is #FALSE, and {@code subpass} uses color attachments,
			{@code pColorBlendState} $must be a pointer to a valid ##VkPipelineColorBlendStateCreateInfo structure
			""",
			"""
			If the depth bias clamping feature is not enabled, no element of the {@code pDynamicStates} member of {@code pDynamicState} is
			#DYNAMIC_STATE_DEPTH_BIAS, and the {@code depthBiasEnable} member of {@code pDepthStencil} is #TRUE, the {@code depthBiasClamp} member of
			{@code pDepthStencil} $must be {@code 0.0}
			""",
			"""
			If no element of the {@code pDynamicStates} member of {@code pDynamicState} is #DYNAMIC_STATE_DEPTH_BOUNDS, and the {@code depthBoundsTestEnable}
			member of {@code pDepthStencil} is #TRUE, the {@code minDepthBounds} and {@code maxDepthBounds} members of {@code pDepthStencil} $must be between
			{@code 0.0} and {@code 1.0}, inclusive
			""",
			"{@code layout} $must be consistent with all shaders specified in {@code pStages}",
			"""
			If {@code subpass} uses color and/or depth/stencil attachments, then the {@code rasterizationSamples} member of {@code pMultisampleState} $must be
			the same as the sample count for those subpass attachments
			""",
			"""
			If {@code subpass} does not use any color and/or depth/stencil attachments, then the {@code rasterizationSamples} member of
			{@code pMultisampleState} $must follow the rules for a zero-attachment subpass
			""",
			"{@code subpass} $must be a valid subpass within {@code renderpass}"
		)}"""

@JvmField val VkImageBlit =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code srcSubresource} $must be a valid ##VkImageSubresourceLayers structure",
			"{@code dstSubresource} $must be a valid ##VkImageSubresourceLayers structure",
			"The {@code aspectMask} member of {@code srcSubresource} and {@code dstSubresource} $must match",
			"The {@code layerCount} member of {@code srcSubresource} and {@code dstSubresource} $must match",
			"""
			If either of the calling command's {@code srcImage} or {@code dstImage} parameters are of {@code VkImageType} #IMAGE_TYPE_3D, the
			{@code baseArrayLayer} and {@code layerCount} members of both {@code srcSubresource} and {@code dstSubresource} $must be 0 and 1, respectively
			""",
			"The {@code aspectMask} member of {@code srcSubresource} $must specify aspects present in the calling command's {@code srcImage}",
			"The {@code aspectMask} member of {@code dstSubresource} $must specify aspects present in the calling command's {@code dstImage}",
			"The {@code layerCount} member of {@code dstSubresource} $must be equal to the {@code layerCount} member of {@code srcSubresource}",
			"""
			{@code srcOffset}[0].x and {@code srcOffset}[1].x $must both be greater than or equal to 0 and less than or equal to the source image subresource
			width
			""",
			"""
			{@code srcOffset}[0].y and {@code srcOffset}[1].y $must both be greater than or equal to 0 and less than or equal to the source image subresource
			height
			""",
			"""
			{@code srcOffset}[0].z and {@code srcOffset}[1].z $must both be greater than or equal to 0 and less than or equal to the source image subresource
			depth
			""",
			"""
			{@code dstOffset}[0].x and {@code dstOffset}[1].x $must both be greater than or equal to 0 and less than or equal to the destination image
			subresource width
			""",
			"""
			{@code dstOffset}[0].y and {@code dstOffset}[1].y $must both be greater than or equal to 0 and less than or equal to the destination image
			subresource height
			""",
			"""
			{@code dstOffset}[0].z and {@code dstOffset}[1].z $must both be greater than or equal to 0 and less than or equal to the destination image
			subresource depth
			"""
		)}"""

@JvmField val VkImageCopy =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code srcSubresource} $must be a valid ##VkImageSubresourceLayers structure",
			"{@code dstSubresource} $must be a valid ##VkImageSubresourceLayers structure",
			"The {@code aspectMask} member of {@code srcSubresource} and {@code dstSubresource} $must match",
			"The {@code layerCount} member of {@code srcSubresource} and {@code dstSubresource} $must match",
			"""
			If either of the calling command's {@code srcImage} or {@code dstImage} parameters are of {@code VkImageType} #IMAGE_TYPE_3D, the
			{@code baseArrayLayer} and {@code layerCount} members of both {@code srcSubresource} and {@code dstSubresource} $must be 0 and 1, respectively
			""",
			"The {@code aspectMask} member of {@code srcSubresource} $must specify aspects present in the calling command's {@code srcImage}",
			"The {@code aspectMask} member of {@code dstSubresource} $must specify aspects present in the calling command's {@code dstImage}",
			"""
			{@code srcOffset.x} and ({@code extent.width} + {@code srcOffset.x}) $must both be greater than or equal to 0 and less than or equal to the source
			image subresource width
			""",
			"""
			{@code srcOffset.y} and ({@code extent.height} + {@code srcOffset.y}) $must both be greater than or equal to 0 and less than or equal to the source
			image subresource height
			""",
			"""
			{@code srcOffset.z} and ({@code extent.depth} + {@code srcOffset.z}) $must both be greater than or equal to 0 and less than or equal to the source
			image subresource depth
			""",
			"""
			{@code dstOffset.x} and ({@code extent.width} + {@code dstOffset.x}) $must both be greater than or equal to 0 and less than or equal to the
			destination image subresource width
			""",
			"""
			{@code dstOffset.y} and ({@code extent.height} + {@code dstOffset.y}) $must both be greater than or equal to 0 and less than or equal to the
			destination image subresource height
			""",
			"""
			{@code dstOffset.z} and ({@code extent.depth} + {@code dstOffset.z}) $must both be greater than or equal to 0 and less than or equal to the
			destination image subresource depth
			""",
			"If the calling command's {@code srcImage} is a compressed format image:",
			"If the calling command's {@code dstImage} is a compressed format image:",
			"""
			{@code srcOffset}, {@code dstOffset}, and {@code extent} $must respect the image transfer granularity requirements of the queue family that it will
			be submitted against, as described in Physical Device Enumeration
			"""
		)}"""

@JvmField val VkImageCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_IMAGE_CREATE_INFO",
			"{@code pNext} $must be $NULL, or a pointer to a valid instance of {@code VkDedicatedAllocationImageCreateInfoNV}",
			"{@code flags} $must be a valid combination of {@code VkImageCreateFlagBits} values",
			"{@code imageType} $must be a valid {@code VkImageType} value",
			"{@code format} $must be a valid {@code VkFormat} value",
			"{@code samples} $must be a valid {@code VkSampleCountFlagBits} value",
			"{@code tiling} $must be a valid {@code VkImageTiling} value",
			"{@code usage} $must be a valid combination of {@code VkImageUsageFlagBits} values",
			"{@code usage} $must not be 0",
			"{@code sharingMode} $must be a valid {@code VkSharingMode} value",
			"{@code initialLayout} $must be a valid {@code VkImageLayout} value",
			"""
			If {@code sharingMode} is #SHARING_MODE_CONCURRENT, {@code pQueueFamilyIndices} $must be a pointer to an array of {@code queueFamilyIndexCount}
			{@code uint32_t} values
			""",
			"If {@code sharingMode} is #SHARING_MODE_CONCURRENT, {@code queueFamilyIndexCount} $must be greater than 1",
			"{@code format} $must not be #FORMAT_UNDEFINED",
			"The {@code width}, {@code height}, and {@code depth} members of {@code extent} $must all be greater than 0",
			"{@code mipLevels} $must be greater than 0",
			"{@code arrayLayers} $must be greater than 0",
			"If {@code flags} contains #IMAGE_CREATE_CUBE_COMPATIBLE_BIT, {@code imageType} must be #IMAGE_TYPE_2D",
			"""
			If {@code imageType} is #IMAGE_TYPE_1D, {@code extent.width} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxImageDimension1D},
			or ##VkImageFormatProperties{@code ::maxExtent}.width (as returned by #GetPhysicalDeviceImageFormatProperties() with {@code format}, {@code type},
			{@code tiling}, {@code usage}, and {@code flags} equal to those in this structure) - whichever is higher
			""",
			"""
			If {@code imageType} is #IMAGE_TYPE_2D and {@code flags} does not contain #IMAGE_CREATE_CUBE_COMPATIBLE_BIT, {@code extent.width} and
			{@code extent.height} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxImageDimension2D}, or
			##VkImageFormatProperties{@code ::maxExtent}.width/height (as returned by #GetPhysicalDeviceImageFormatProperties() with {@code format},
			{@code type}, {@code tiling}, {@code usage}, and {@code flags} equal to those in this structure) - whichever is higher
			""",
			"""
			If {@code imageType} is #IMAGE_TYPE_2D and {@code flags} contains #IMAGE_CREATE_CUBE_COMPATIBLE_BIT, {@code extent.width} and {@code extent.height}
			$must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxImageDimensionCube}, or
			##VkImageFormatProperties{@code ::maxExtent}.width/height (as returned by #GetPhysicalDeviceImageFormatProperties() with {@code format},
			{@code type}, {@code tiling}, {@code usage}, and {@code flags} equal to those in this structure) - whichever is higher
			""",
			"""
			If {@code imageType} is #IMAGE_TYPE_2D and {@code flags} contains #IMAGE_CREATE_CUBE_COMPATIBLE_BIT, {@code extent.width} and {@code extent.height}
			$must be equal and {@code arrayLayers} $must be greater than or equal to 6
			""",
			"""
			If {@code imageType} is #IMAGE_TYPE_3D, {@code extent.width}, {@code extent.height} and {@code extent.depth} $must be less than or equal to
			##VkPhysicalDeviceLimits{@code ::maxImageDimension3D}, or ##VkImageFormatProperties{@code ::maxExtent}.width/height/depth (as returned by
			#GetPhysicalDeviceImageFormatProperties() with {@code format}, {@code type}, {@code tiling}, {@code usage}, and {@code flags} equal to those in
			this structure) - whichever is higher
			""",
			"If {@code imageType} is #IMAGE_TYPE_1D, both {@code extent.height} and {@code extent.depth} $must be 1",
			"If {@code imageType} is #IMAGE_TYPE_2D, {@code extent.depth} $must be 1",
			"""
			{@code mipLevels} $must be less than or equal to ${code("floor(log<sub>2</sub>(max(extent.width, extent.height, extent.depth))) + 1")}
			""",
			"""
			If any of {@code extent.width}, {@code extent.height}, or {@code extent.depth} are greater than the equivalently named members of
			##VkPhysicalDeviceLimits{@code ::maxImageDimension3D}, {@code mipLevels} $must be less than or equal to
			##VkImageFormatProperties{@code ::maxMipLevels} (as returned by #GetPhysicalDeviceImageFormatProperties() with {@code format}, {@code type},
			{@code tiling}, {@code usage}, and {@code flags} equal to those in this structure)
			""",
			"""
			{@code arrayLayers} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxImageArrayLayers}, or
			##VkImageFormatProperties{@code ::maxArrayLayers} (as returned by #GetPhysicalDeviceImageFormatProperties() with {@code format}, {@code type},
			{@code tiling}, {@code usage}, and {@code flags} equal to those in this structure) - whichever is higher
			""",
			"""
			If {@code samples} is not #SAMPLE_COUNT_1_BIT, {@code imageType} $must be #IMAGE_TYPE_2D, {@code flags} $must not contain
			#IMAGE_CREATE_CUBE_COMPATIBLE_BIT, {@code tiling} $must be #IMAGE_TILING_OPTIMAL, and {@code mipLevels} $must be equal to 1
			""",
			"""
			If {@code usage} includes #IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT, then bits other than #IMAGE_USAGE_COLOR_ATTACHMENT_BIT,
			#IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT, and #IMAGE_USAGE_INPUT_ATTACHMENT_BIT $must not be set
			""",
			"""
			If {@code usage} includes #IMAGE_USAGE_COLOR_ATTACHMENT_BIT, #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT, #IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT, or
			#IMAGE_USAGE_INPUT_ATTACHMENT_BIT, {@code extent.width} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxFramebufferWidth}
			""",
			"""
			If {@code usage} includes #IMAGE_USAGE_COLOR_ATTACHMENT_BIT, #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT, #IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT, or
			#IMAGE_USAGE_INPUT_ATTACHMENT_BIT, {@code extent.height} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxFramebufferHeight}
			""",
			"""
			{@code samples} $must be a bit value that is set in ##VkImageFormatProperties{@code ::sampleCounts} returned by
			#GetPhysicalDeviceImageFormatProperties() with {@code format}, {@code type}, {@code tiling}, {@code usage}, and {@code flags} equal to those in
			this structure
			""",
			"""
			If the ETC2 texture compression feature is not enabled, {@code format} $must not be #FORMAT_ETC2_R8G8B8_UNORM_BLOCK,
			#FORMAT_ETC2_R8G8B8_SRGB_BLOCK, #FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK, #FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK, #FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK,
			#FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK, #FORMAT_EAC_R11_UNORM_BLOCK, #FORMAT_EAC_R11_SNORM_BLOCK, #FORMAT_EAC_R11G11_UNORM_BLOCK, or
			#FORMAT_EAC_R11G11_SNORM_BLOCK
			""",
			"""
			If the ASTC LDR texture compression feature is not enabled, {@code format} $must not be #FORMAT_ASTC_4x4_UNORM_BLOCK, #FORMAT_ASTC_4x4_SRGB_BLOCK,
			#FORMAT_ASTC_5x4_UNORM_BLOCK, #FORMAT_ASTC_5x4_SRGB_BLOCK, #FORMAT_ASTC_5x5_UNORM_BLOCK, #FORMAT_ASTC_5x5_SRGB_BLOCK, #FORMAT_ASTC_6x5_UNORM_BLOCK,
			#FORMAT_ASTC_6x5_SRGB_BLOCK, #FORMAT_ASTC_6x6_UNORM_BLOCK, #FORMAT_ASTC_6x6_SRGB_BLOCK, #FORMAT_ASTC_8x5_UNORM_BLOCK, #FORMAT_ASTC_8x5_SRGB_BLOCK,
			#FORMAT_ASTC_8x6_UNORM_BLOCK, #FORMAT_ASTC_8x6_SRGB_BLOCK, #FORMAT_ASTC_8x8_UNORM_BLOCK, #FORMAT_ASTC_8x8_SRGB_BLOCK,
			#FORMAT_ASTC_10x5_UNORM_BLOCK, #FORMAT_ASTC_10x5_SRGB_BLOCK, #FORMAT_ASTC_10x6_UNORM_BLOCK, #FORMAT_ASTC_10x6_SRGB_BLOCK,
			#FORMAT_ASTC_10x8_UNORM_BLOCK, #FORMAT_ASTC_10x8_SRGB_BLOCK, #FORMAT_ASTC_10x10_UNORM_BLOCK, #FORMAT_ASTC_10x10_SRGB_BLOCK,
			#FORMAT_ASTC_12x10_UNORM_BLOCK, #FORMAT_ASTC_12x10_SRGB_BLOCK, #FORMAT_ASTC_12x12_UNORM_BLOCK, or #FORMAT_ASTC_12x12_SRGB_BLOCK
			""",
			"""
			If the BC texture compression feature is not enabled, {@code format} $must not be #FORMAT_BC1_RGB_UNORM_BLOCK, #FORMAT_BC1_RGB_SRGB_BLOCK,
			#FORMAT_BC1_RGBA_UNORM_BLOCK, #FORMAT_BC1_RGBA_SRGB_BLOCK, #FORMAT_BC2_UNORM_BLOCK, #FORMAT_BC2_SRGB_BLOCK, #FORMAT_BC3_UNORM_BLOCK,
			#FORMAT_BC3_SRGB_BLOCK, #FORMAT_BC4_UNORM_BLOCK, #FORMAT_BC4_SNORM_BLOCK, #FORMAT_BC5_UNORM_BLOCK, #FORMAT_BC5_SNORM_BLOCK,
			#FORMAT_BC6H_UFLOAT_BLOCK, #FORMAT_BC6H_SFLOAT_BLOCK, #FORMAT_BC7_UNORM_BLOCK, or #FORMAT_BC7_SRGB_BLOCK
			""",
			"""
			If the multisampled storage images feature is not enabled, and {@code usage} contains #IMAGE_USAGE_STORAGE_BIT, {@code samples} $must be
			#SAMPLE_COUNT_1_BIT
			""",
			"If the sparse bindings feature is not enabled, {@code flags} $must not contain #IMAGE_CREATE_SPARSE_BINDING_BIT",
			"""
			If the sparse residency for 2D images feature is not enabled, and {@code imageType} is #IMAGE_TYPE_2D, {@code flags} $must not contain
			#IMAGE_CREATE_SPARSE_RESIDENCY_BIT
			""",
			"""
			If the sparse residency for 3D images feature is not enabled, and {@code imageType} is #IMAGE_TYPE_3D, {@code flags} $must not contain
			#IMAGE_CREATE_SPARSE_RESIDENCY_BIT
			""",
			"""
			If the sparse residency for images with 2 samples feature is not enabled, {@code imageType} is #IMAGE_TYPE_2D, and {@code samples} is
			#SAMPLE_COUNT_2_BIT, {@code flags} $must not contain #IMAGE_CREATE_SPARSE_RESIDENCY_BIT
			""",
			"""
			If the sparse residency for images with 4 samples feature is not enabled, {@code imageType} is #IMAGE_TYPE_2D, and {@code samples} is
			#SAMPLE_COUNT_4_BIT, {@code flags} $must not contain #IMAGE_CREATE_SPARSE_RESIDENCY_BIT
			""",
			"""
			If the sparse residency for images with 8 samples feature is not enabled, {@code imageType} is #IMAGE_TYPE_2D, and {@code samples} is
			#SAMPLE_COUNT_8_BIT, {@code flags} $must not contain #IMAGE_CREATE_SPARSE_RESIDENCY_BIT
			""",
			"""
			If the sparse residency for images with 16 samples feature is not enabled, {@code imageType} is #IMAGE_TYPE_2D, and {@code samples} is
			#SAMPLE_COUNT_16_BIT, {@code flags} $must not contain #IMAGE_CREATE_SPARSE_RESIDENCY_BIT
			""",
			"""
			If {@code tiling} is #IMAGE_TILING_LINEAR, {@code format} $must be a format that has at least one supported feature bit present in the value of
			##VkFormatProperties{@code ::linearTilingFeatures} returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}
			""",
			"""
			If {@code tiling} is #IMAGE_TILING_LINEAR, and ##VkFormatProperties{@code ::linearTilingFeatures} (as returned by
			#GetPhysicalDeviceFormatProperties() with the same value of {@code format}) does not include #FORMAT_FEATURE_SAMPLED_IMAGE_BIT, {@code usage} $must
			not contain #IMAGE_USAGE_SAMPLED_BIT
			""",
			"""
			If {@code tiling} is #IMAGE_TILING_LINEAR, and ##VkFormatProperties{@code ::linearTilingFeatures} (as returned by
			#GetPhysicalDeviceFormatProperties() with the same value of {@code format}) does not include #FORMAT_FEATURE_STORAGE_IMAGE_BIT, {@code usage} $must
			not contain #IMAGE_USAGE_STORAGE_BIT
			""",
			"""
			If {@code tiling} is #IMAGE_TILING_LINEAR, and ##VkFormatProperties{@code ::linearTilingFeatures} (as returned by
			#GetPhysicalDeviceFormatProperties() with the same value of {@code format}) does not include #FORMAT_FEATURE_COLOR_ATTACHMENT_BIT, {@code usage}
			$must not contain #IMAGE_USAGE_COLOR_ATTACHMENT_BIT
			""",
			"""
			If {@code tiling} is #IMAGE_TILING_LINEAR, and ##VkFormatProperties{@code ::linearTilingFeatures} (as returned by
			#GetPhysicalDeviceFormatProperties() with the same value of {@code format}) does not include #FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT,
			{@code usage} $must not contain #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT
			""",
			"""
			If {@code tiling} is #IMAGE_TILING_OPTIMAL, {@code format} $must be a format that has at least one supported feature bit present in the value of
			##VkFormatProperties{@code ::optimalTilingFeatures} returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}
			""",
			"""
			If {@code tiling} is #IMAGE_TILING_OPTIMAL, and ##VkFormatProperties{@code ::optimalTilingFeatures} (as returned by
			#GetPhysicalDeviceFormatProperties() with the same value of {@code format}) does not include #FORMAT_FEATURE_SAMPLED_IMAGE_BIT, {@code usage} $must
			not contain #IMAGE_USAGE_SAMPLED_BIT
			""",
			"""
			If {@code tiling} is #IMAGE_TILING_OPTIMAL, and ##VkFormatProperties{@code ::optimalTilingFeatures} (as returned by
			#GetPhysicalDeviceFormatProperties() with the same value of {@code format}) does not include #FORMAT_FEATURE_STORAGE_IMAGE_BIT, {@code usage} $must
			not contain #IMAGE_USAGE_STORAGE_BIT
			""",
			"""
			If {@code tiling} is #IMAGE_TILING_OPTIMAL, and ##VkFormatProperties{@code ::optimalTilingFeatures} (as returned by
			#GetPhysicalDeviceFormatProperties() with the same value of {@code format}) does not include #FORMAT_FEATURE_COLOR_ATTACHMENT_BIT, {@code usage}
			$must not contain #IMAGE_USAGE_COLOR_ATTACHMENT_BIT
			""",
			"""
			If {@code tiling} is #IMAGE_TILING_OPTIMAL, and ##VkFormatProperties{@code ::optimalTilingFeatures} (as returned by
			#GetPhysicalDeviceFormatProperties() with the same value of {@code format}) does not include #FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT,
			{@code usage} $must not contain #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT
			""",
			"""
			If {@code flags} contains #IMAGE_CREATE_SPARSE_RESIDENCY_BIT or #IMAGE_CREATE_SPARSE_ALIASED_BIT, it $must also contain
			#IMAGE_CREATE_SPARSE_BINDING_BIT
			"""
		)}"""

@JvmField val VkImageMemoryBarrier =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER",
			"{@code pNext} $must be $NULL",
			"{@code srcAccessMask} $must be a valid combination of {@code VkAccessFlagBits} values",
			"{@code dstAccessMask} $must be a valid combination of {@code VkAccessFlagBits} values",
			"{@code oldLayout} $must be a valid {@code VkImageLayout} value",
			"{@code newLayout} $must be a valid {@code VkImageLayout} value",
			"{@code image} $must be a valid {@code VkImage} handle",
			"{@code subresourceRange} $must be a valid ##VkImageSubresourceRange structure",
			"{@code oldLayout} $must be #IMAGE_LAYOUT_UNDEFINED or the current layout of the image subresources affected by the barrier",
			"{@code newLayout} $must not be #IMAGE_LAYOUT_UNDEFINED or #IMAGE_LAYOUT_PREINITIALIZED",
			"""
			If {@code image} was created with a sharing mode of #SHARING_MODE_CONCURRENT, {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} $must
			both be #QUEUE_FAMILY_IGNORED
			""",
			"""
			If {@code image} was created with a sharing mode of #SHARING_MODE_EXCLUSIVE, {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} $must
			either both be #QUEUE_FAMILY_IGNORED, or both be a valid queue family
			""",
			"""
			If {@code image} was created with a sharing mode of #SHARING_MODE_EXCLUSIVE, and {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} are
			valid queue families, at least one of them $must be the same as the family of the queue that will execute this barrier
			""",
			"{@code subresourceRange} $must be a valid image subresource range for the image",
			"""
			If {@code image} has a depth/stencil format with both depth and stencil components, then {@code aspectMask} member of {@code subresourceRange}
			$must include both #IMAGE_ASPECT_DEPTH_BIT and #IMAGE_ASPECT_STENCIL_BIT
			""",
			"""
			If either {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL then {@code image} $must have been created with
			#IMAGE_USAGE_COLOR_ATTACHMENT_BIT set
			""",
			"""
			If either {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL then {@code image} $must have been created with
			#IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT set
			""",
			"""
			If either {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL then {@code image} $must have been created with
			#IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT set
			""",
			"""
			If either {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL then {@code image} $must have been created with
			#IMAGE_USAGE_SAMPLED_BIT or #IMAGE_USAGE_INPUT_ATTACHMENT_BIT set
			""",
			"""
			If either {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL then {@code image} $must have been created with
			#IMAGE_USAGE_TRANSFER_SRC_BIT set
			""",
			"""
			If either {@code oldLayout} or {@code newLayout} is #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL then {@code image} $must have been created with
			#IMAGE_USAGE_TRANSFER_DST_BIT set
			"""
		)}"""

@JvmField val VkImageResolve =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code srcSubresource} $must be a valid ##VkImageSubresourceLayers structure",
			"{@code dstSubresource} $must be a valid ##VkImageSubresourceLayers structure",
			"The {@code aspectMask} member of {@code srcSubresource} and {@code dstSubresource} $must only contain #IMAGE_ASPECT_COLOR_BIT",
			"The {@code layerCount} member of {@code srcSubresource} and {@code dstSubresource} $must match",
			"""
			If either of the calling command's {@code srcImage} or {@code dstImage} parameters are of {@code VkImageType} #IMAGE_TYPE_3D, the
			{@code baseArrayLayer} and {@code layerCount} members of both {@code srcSubresource} and {@code dstSubresource} $must be 0 and 1, respectively
			"""
		)}"""

@JvmField val VkImageSubresource =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code aspectMask} $must be a valid combination of {@code VkImageAspectFlagBits} values",
			"{@code aspectMask} $must not be 0",
			"{@code mipLevel} $must be less than the {@code mipLevels} specified in {@code VkImageCreateInfo} when the image was created",
			"{@code arrayLayer} $must be less than the {@code arrayLayers} specified in {@code VkImageCreateInfo} when the image was created"
		)}"""

@JvmField val VkImageSubresourceLayers =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code aspectMask} $must be a valid combination of {@code VkImageAspectFlagBits} values",
			"{@code aspectMask} $must not be 0",
			"If {@code aspectMask} contains #IMAGE_ASPECT_COLOR_BIT, it $must not contain either of #IMAGE_ASPECT_DEPTH_BIT or #IMAGE_ASPECT_STENCIL_BIT",
			"{@code aspectMask} $must not contain #IMAGE_ASPECT_METADATA_BIT",
			"{@code mipLevel} $must be less than the {@code mipLevels} specified in {@code VkImageCreateInfo} when the image was created",
			"""
			{@code baseArrayLayer + layerCount} $must be less than or equal to the {@code arrayLayers} specified in {@code VkImageCreateInfo} when
			the image was created
			"""
		)}"""

@JvmField val VkImageSubresourceRange =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code aspectMask} $must be a valid combination of {@code VkImageAspectFlagBits} values",
			"{@code aspectMask} $must not be 0",
			"""
			If {@code levelCount} is not #REMAINING_MIP_LEVELS, {@code baseMipLevel + levelCount} $must be less than or equal to the
			{@code mipLevels} specified in {@code VkImageCreateInfo} when the image was created
			""",
			"""
			If {@code layerCount} is not #REMAINING_ARRAY_LAYERS, {@code baseArrayLayer + layerCount} $must be less than or equal to the
			{@code arrayLayers} specified in {@code VkImageCreateInfo} when the image was created
			"""
		)}"""

@JvmField val VkImageViewCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"{@code image} $must be a valid {@code VkImage} handle",
			"{@code viewType} $must be a valid {@code VkImageViewType} value",
			"{@code format} $must be a valid {@code VkFormat} value",
			"{@code components} $must be a valid ##VkComponentMapping structure",
			"{@code subresourceRange} $must be a valid ##VkImageSubresourceRange structure",
			"""
			If {@code image} was not created with #IMAGE_CREATE_CUBE_COMPATIBLE_BIT then {@code viewType} $must not be #IMAGE_VIEW_TYPE_CUBE or
			#IMAGE_VIEW_TYPE_CUBE_ARRAY
			""",
			"If the image cubemap arrays feature is not enabled, {@code viewType} $must not be #IMAGE_VIEW_TYPE_CUBE_ARRAY",
			"""
			If the ETC2 texture compression feature is not enabled, {@code format} $must not be #FORMAT_ETC2_R8G8B8_UNORM_BLOCK,
			#FORMAT_ETC2_R8G8B8_SRGB_BLOCK, #FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK, #FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK, #FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK,
			#FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK, #FORMAT_EAC_R11_UNORM_BLOCK, #FORMAT_EAC_R11_SNORM_BLOCK, #FORMAT_EAC_R11G11_UNORM_BLOCK, or
			#FORMAT_EAC_R11G11_SNORM_BLOCK
			""",
			"""
			If the ASTC LDR texture compression feature is not enabled, {@code format} $must not be #FORMAT_ASTC_4x4_UNORM_BLOCK, #FORMAT_ASTC_4x4_SRGB_BLOCK,
			#FORMAT_ASTC_5x4_UNORM_BLOCK, #FORMAT_ASTC_5x4_SRGB_BLOCK, #FORMAT_ASTC_5x5_UNORM_BLOCK, #FORMAT_ASTC_5x5_SRGB_BLOCK, #FORMAT_ASTC_6x5_UNORM_BLOCK,
			#FORMAT_ASTC_6x5_SRGB_BLOCK, #FORMAT_ASTC_6x6_UNORM_BLOCK, #FORMAT_ASTC_6x6_SRGB_BLOCK, #FORMAT_ASTC_8x5_UNORM_BLOCK, #FORMAT_ASTC_8x5_SRGB_BLOCK,
			#FORMAT_ASTC_8x6_UNORM_BLOCK, #FORMAT_ASTC_8x6_SRGB_BLOCK, #FORMAT_ASTC_8x8_UNORM_BLOCK, #FORMAT_ASTC_8x8_SRGB_BLOCK,
			#FORMAT_ASTC_10x5_UNORM_BLOCK, #FORMAT_ASTC_10x5_SRGB_BLOCK, #FORMAT_ASTC_10x6_UNORM_BLOCK, #FORMAT_ASTC_10x6_SRGB_BLOCK,
			#FORMAT_ASTC_10x8_UNORM_BLOCK, #FORMAT_ASTC_10x8_SRGB_BLOCK, #FORMAT_ASTC_10x10_UNORM_BLOCK, #FORMAT_ASTC_10x10_SRGB_BLOCK,
			#FORMAT_ASTC_12x10_UNORM_BLOCK, #FORMAT_ASTC_12x10_SRGB_BLOCK, #FORMAT_ASTC_12x12_UNORM_BLOCK, or #FORMAT_ASTC_12x12_SRGB_BLOCK
			""",
			"""
			If the BC texture compression feature is not enabled, {@code format} $must not be #FORMAT_BC1_RGB_UNORM_BLOCK, #FORMAT_BC1_RGB_SRGB_BLOCK,
			#FORMAT_BC1_RGBA_UNORM_BLOCK, #FORMAT_BC1_RGBA_SRGB_BLOCK, #FORMAT_BC2_UNORM_BLOCK, #FORMAT_BC2_SRGB_BLOCK, #FORMAT_BC3_UNORM_BLOCK,
			#FORMAT_BC3_SRGB_BLOCK, #FORMAT_BC4_UNORM_BLOCK, #FORMAT_BC4_SNORM_BLOCK, #FORMAT_BC5_UNORM_BLOCK, #FORMAT_BC5_SNORM_BLOCK,
			#FORMAT_BC6H_UFLOAT_BLOCK, #FORMAT_BC6H_SFLOAT_BLOCK, #FORMAT_BC7_UNORM_BLOCK, or #FORMAT_BC7_SRGB_BLOCK
			""",
			"""
			If {@code image} was created with #IMAGE_TILING_LINEAR, {@code format} $must be format that has at least one supported feature bit present in the
			value of ##VkFormatProperties{@code ::linearTilingFeatures} returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}
			""",
			"""
			If {@code image} was created with #IMAGE_TILING_LINEAR and {@code usage} containing #IMAGE_USAGE_SAMPLED_BIT, {@code format} $must be supported for
			sampled images, as specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} returned by
			#GetPhysicalDeviceFormatProperties() with the same value of {@code format}
			""",
			"""
			If {@code image} was created with #IMAGE_TILING_LINEAR and {@code usage} containing #IMAGE_USAGE_STORAGE_BIT, {@code format} $must be supported for
			storage images, as specified by the #FORMAT_FEATURE_STORAGE_IMAGE_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} returned by
			#GetPhysicalDeviceFormatProperties() with the same value of {@code format}
			""",
			"""
			If {@code image} was created with #IMAGE_TILING_LINEAR and {@code usage} containing #IMAGE_USAGE_COLOR_ATTACHMENT_BIT, {@code format} $must be
			supported for color attachments, as specified by the #FORMAT_FEATURE_COLOR_ATTACHMENT_BIT flag in
			##VkFormatProperties{@code ::linearTilingFeatures} returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}
			""",
			"""
			If {@code image} was created with #IMAGE_TILING_LINEAR and {@code usage} containing #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT, {@code format} $must
			be supported for depth/stencil attachments, as specified by the #FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT flag in
			##VkFormatProperties{@code ::linearTilingFeatures} returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}
			""",
			"""
			If {@code image} was created with #IMAGE_TILING_OPTIMAL, {@code format} $must be format that has at least one supported feature bit present in the
			value of ##VkFormatProperties{@code ::optimalTilingFeatures} returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}
			""",
			"""
			If {@code image} was created with #IMAGE_TILING_OPTIMAL and {@code usage} containing #IMAGE_USAGE_SAMPLED_BIT, {@code format} $must be supported
			for sampled images, as specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_BIT flag in ##VkFormatProperties{@code ::optimalTilingFeatures} returned by
			#GetPhysicalDeviceFormatProperties() with the same value of {@code format}
			""",
			"""
			If {@code image} was created with #IMAGE_TILING_OPTIMAL and {@code usage} containing #IMAGE_USAGE_STORAGE_BIT, {@code format} $must be supported
			for storage images, as specified by the #FORMAT_FEATURE_STORAGE_IMAGE_BIT flag in ##VkFormatProperties{@code ::optimalTilingFeatures} returned by
			#GetPhysicalDeviceFormatProperties() with the same value of {@code format}
			""",
			"""
			If {@code image} was created with #IMAGE_TILING_OPTIMAL and {@code usage} containing #IMAGE_USAGE_COLOR_ATTACHMENT_BIT, {@code format} $must be
			supported for color attachments, as specified by the #FORMAT_FEATURE_COLOR_ATTACHMENT_BIT flag in
			##VkFormatProperties{@code ::optimalTilingFeatures} returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}
			""",
			"""
			If {@code image} was created with #IMAGE_TILING_OPTIMAL and {@code usage} containing #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT, {@code format}
			$must be supported for depth/stencil attachments, as specified by the #FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT flag in
			##VkFormatProperties{@code ::optimalTilingFeatures} returned by #GetPhysicalDeviceFormatProperties() with the same value of {@code format}
			""",
			"{@code subresourceRange} $must be a valid image subresource range for {@code image}",
			"""
			If {@code image} was created with the #IMAGE_CREATE_MUTABLE_FORMAT_BIT flag, {@code format} $must be compatible with the {@code format} used to
			create {@code image}, as defined in Format Compatibility Classes
			""",
			"""
			If {@code image} was not created with the #IMAGE_CREATE_MUTABLE_FORMAT_BIT flag, {@code format} $must be identical to the {@code format} used to
			create {@code image}
			""",
			"{@code subResourceRange} and {@code viewType} $must be compatible with the image, as described in the compatibility table"
		)}"""

@JvmField val VkImportMemoryWin32HandleInfoNV =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV",
			"{@code pNext} $must be $NULL",
			"{@code handleType} $must be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values",
			"{@code handleType} $must not be 0"
		)}"""

@JvmField val VkInstanceCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_INSTANCE_CREATE_INFO",
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
			"""
		)}"""

@JvmField val VkMappedMemoryRange =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_MAPPED_MEMORY_RANGE",
			"{@code pNext} $must be $NULL",
			"{@code memory} $must be a valid {@code VkDeviceMemory} handle",
			"{@code memory} $must currently be mapped",
			"""
			If {@code size} is not equal to #WHOLE_SIZE, {@code offset} and {@code size} $must specify a range contained within the currently mapped range of
			{@code memory}
			""",
			"If {@code size} is equal to #WHOLE_SIZE, {@code offset} $must be within the currently mapped range of {@code memory}",
			"{@code offset} $must be a multiple of ##VkPhysicalDeviceLimits{@code ::nonCoherentAtomSize}",
			"If {@code size} is not equal to #WHOLE_SIZE, {@code size} $must be a multiple of ##VkPhysicalDeviceLimits{@code ::nonCoherentAtomSize}"
		)}"""

@JvmField val VkMemoryAllocateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO",
			"{@code pNext} $must be $NULL, or a pointer to a valid instance of {@code VkDedicatedAllocationMemoryAllocateInfoNV}",
			"""
			{@code allocationSize} $must be less than or equal to the amount of memory available to the {@code VkMemoryHeap} specified by
			{@code memoryTypeIndex} and the calling command's {@code VkDevice}
			""",
			"{@code allocationSize} $must be greater than 0"
		)}"""

@JvmField val VkMemoryBarrier =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_MEMORY_BARRIER",
			"{@code pNext} $must be $NULL",
			"{@code srcAccessMask} $must be a valid combination of {@code VkAccessFlagBits} values",
			"{@code dstAccessMask} $must be a valid combination of {@code VkAccessFlagBits} values"
		)}"""

@JvmField val VkMirSurfaceCreateInfoKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_MIR_SURFACE_CREATE_INFO_KHR",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"{@code connection} $must be a pointer to a {@code MirConnection} value",
			"{@code mirSurface} $must be a pointer to a {@code MirSurface} value"
		)}"""

@JvmField val VkPhysicalDeviceFeatures =
	"""<h5>Valid Usage</h5>
		${ul(
			"""
			If any member of this structure is #FALSE, as returned by #GetPhysicalDeviceFeatures(), then it $must be #FALSE when passed as part of the
			##VkDeviceCreateInfo struct when creating a device
			"""
		)}"""

@JvmField val VkPipelineCacheCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"If {@code initialDataSize} is not 0, {@code pInitialData} $must be a pointer to an array of {@code initialDataSize} bytes",
			"""
			If {@code initialDataSize} is not 0, it $must be equal to the size of {@code pInitialData}, as returned by #GetPipelineCacheData() when
			{@code pInitialData} was originally retrieved
			""",
			"If {@code initialDataSize} is not 0, {@code pInitialData} $must have been retrieved from a previous call to #GetPipelineCacheData()"
		)}"""

@JvmField val VkPipelineColorBlendAttachmentState =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code srcColorBlendFactor} $must be a valid {@code VkBlendFactor} value",
			"{@code dstColorBlendFactor} $must be a valid {@code VkBlendFactor} value",
			"{@code colorBlendOp} $must be a valid {@code VkBlendOp} value",
			"{@code srcAlphaBlendFactor} $must be a valid {@code VkBlendFactor} value",
			"{@code dstAlphaBlendFactor} $must be a valid {@code VkBlendFactor} value",
			"{@code alphaBlendOp} $must be a valid {@code VkBlendOp} value",
			"{@code colorWriteMask} $must be a valid combination of {@code VkColorComponentFlagBits} values",
			"""
			If the dual source blending feature is not enabled, {@code srcColorBlendFactor} $must not be #BLEND_FACTOR_SRC1_COLOR,
			#BLEND_FACTOR_ONE_MINUS_SRC1_COLOR, #BLEND_FACTOR_SRC1_ALPHA, or #BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA
			""",
			"""
			If the dual source blending feature is not enabled, {@code dstColorBlendFactor} $must not be #BLEND_FACTOR_SRC1_COLOR,
			#BLEND_FACTOR_ONE_MINUS_SRC1_COLOR, #BLEND_FACTOR_SRC1_ALPHA, or #BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA
			""",
			"""
			If the dual source blending feature is not enabled, {@code srcAlphaBlendFactor} $must not be #BLEND_FACTOR_SRC1_COLOR,
			#BLEND_FACTOR_ONE_MINUS_SRC1_COLOR, #BLEND_FACTOR_SRC1_ALPHA, or #BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA
			""",
			"""
			If the dual source blending feature is not enabled, {@code dstAlphaBlendFactor} $must not be #BLEND_FACTOR_SRC1_COLOR,
			#BLEND_FACTOR_ONE_MINUS_SRC1_COLOR, #BLEND_FACTOR_SRC1_ALPHA, or #BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA
			"""
		)}"""

@JvmField val VkPipelineColorBlendStateCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"""
			If {@code attachmentCount} is not 0, {@code pAttachments} $must be a pointer to an array of {@code attachmentCount} valid
			##VkPipelineColorBlendAttachmentState structures
			""",
			"If the independent blending feature is not enabled, all elements of {@code pAttachments} $must be identical",
			"If the logic operations feature is not enabled, {@code logicOpEnable} $must be #FALSE",
			"If {@code logicOpEnable} is #TRUE, {@code logicOp} $must be a valid {@code VkLogicOp} value"
		)}"""

@JvmField val VkPipelineDepthStencilStateCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"{@code depthCompareOp} $must be a valid {@code VkCompareOp} value",
			"{@code front} $must be a valid ##VkStencilOpState structure",
			"{@code back} $must be a valid ##VkStencilOpState structure",
			"If the depth bounds testing feature is not enabled, {@code depthBoundsTestEnable} $must be #FALSE"
		)}"""

@JvmField val VkPipelineDynamicStateCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"{@code pDynamicStates} $must be a pointer to an array of {@code dynamicStateCount} valid {@code VkDynamicState} values",
			"{@code dynamicStateCount} $must be greater than 0"
		)}"""

@JvmField val VkPipelineInputAssemblyStateCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"{@code topology} $must be a valid {@code VkPrimitiveTopology} value",
			"""
			If {@code topology} is #PRIMITIVE_TOPOLOGY_POINT_LIST, #PRIMITIVE_TOPOLOGY_LINE_LIST, #PRIMITIVE_TOPOLOGY_TRIANGLE_LIST,
			#PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY, #PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY or #PRIMITIVE_TOPOLOGY_PATCH_LIST,
			{@code primitiveRestartEnable} $must be #FALSE
			""",
			"""
			If the geometry shaders feature is not enabled, {@code topology} $must not be any of #PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY,
			#PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY, #PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY or
			#PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY
			""",
			"If the tessellation shaders feature is not enabled, {@code topology} $must not be #PRIMITIVE_TOPOLOGY_PATCH_LIST"
		)}"""

@JvmField val VkPipelineLayoutCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"""
			If {@code setLayoutCount} is not 0, {@code pSetLayouts} $must be a pointer to an array of {@code setLayoutCount} valid
			{@code VkDescriptorSetLayout} handles
			""",
			"""
			If {@code pushConstantRangeCount} is not 0, {@code pPushConstantRanges} $must be a pointer to an array of {@code pushConstantRangeCount} valid
			##VkPushConstantRange structures
			""",
			"{@code setLayoutCount} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxBoundDescriptorSets}",
			"""
			The total number of descriptors of the type #DESCRIPTOR_TYPE_SAMPLER and #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER accessible to any given shader
			stage across all elements of {@code pSetLayouts} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxPerStageDescriptorSamplers}
			""",
			"""
			The total number of descriptors of the type #DESCRIPTOR_TYPE_UNIFORM_BUFFER and #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC accessible to any given
			shader stage across all elements of {@code pSetLayouts} $must be less than or equal to
			##VkPhysicalDeviceLimits{@code ::maxPerStageDescriptorUniformBuffers}
			""",
			"""
			The total number of descriptors of the type #DESCRIPTOR_TYPE_STORAGE_BUFFER and #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC accessible to any given
			shader stage across all elements of {@code pSetLayouts} $must be less than or equal to
			##VkPhysicalDeviceLimits{@code ::maxPerStageDescriptorStorageBuffers}
			""",
			"""
			The total number of descriptors of the type #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, #DESCRIPTOR_TYPE_SAMPLED_IMAGE, and
			#DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER accessible to any given shader stage across all elements of {@code pSetLayouts} $must be less than or equal
			to ##VkPhysicalDeviceLimits{@code ::maxPerStageDescriptorSampledImages}
			""",
			"""
			The total number of descriptors of the type #DESCRIPTOR_TYPE_STORAGE_IMAGE, and #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER accessible to any given
			shader stage across all elements of {@code pSetLayouts} $must be less than or equal to
			##VkPhysicalDeviceLimits{@code ::maxPerStageDescriptorStorageImages}
			"""
		)}"""

@JvmField val VkPipelineMultisampleStateCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"{@code rasterizationSamples} $must be a valid {@code VkSampleCountFlagBits} value",
			"""
			If {@code pSampleMask} is not $NULL, {@code pSampleMask} $must be a pointer to an array of {@code ceil(rasterizationSamples / 32)} {@code VkSampleMask} values
			""",
			"If the sample rate shading feature is not enabled, {@code sampleShadingEnable} $must be #FALSE",
			"If the alpha to one feature is not enabled, {@code alphaToOneEnable} $must be #FALSE",
			"{@code minSampleShading} $must be in the range {@code [0,1]}"
		)}"""

@JvmField val VkPipelineRasterizationStateCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO",
			"{@code pNext} $must be $NULL, or a pointer to a valid instance of {@code VkPipelineRasterizationStateRasterizationOrderAMD}",
			"{@code flags} $must be 0",
			"{@code polygonMode} $must be a valid {@code VkPolygonMode} value",
			"{@code cullMode} $must be a valid combination of {@code VkCullModeFlagBits} values",
			"{@code frontFace} $must be a valid {@code VkFrontFace} value",
			"If the depth clamping feature is not enabled, {@code depthClampEnable} $must be #FALSE",
			"If the non-solid fill modes feature is not enabled, {@code polygonMode} $must be #POLYGON_MODE_FILL"
		)}"""

@JvmField val VkPipelineRasterizationStateRasterizationOrderAMD =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD",
			"{@code pNext} $must be $NULL",
			"{@code rasterizationOrder} $must be a valid {@code VkRasterizationOrderAMD} value"
		)}"""

@JvmField val VkPipelineShaderStageCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"{@code stage} $must be a valid {@code VkShaderStageFlagBits} value",
			"{@code module} $must be a valid {@code VkShaderModule} handle",
			"{@code pName} $must be a null-terminated string",
			"If {@code pSpecializationInfo} is not $NULL, {@code pSpecializationInfo} $must be a pointer to a valid ##VkSpecializationInfo structure",
			"If the geometry shaders feature is not enabled, {@code stage} $must not be #SHADER_STAGE_GEOMETRY_BIT",
			"""
			If the tessellation shaders feature is not enabled, {@code stage} $must not be #SHADER_STAGE_TESSELLATION_CONTROL_BIT or
			#SHADER_STAGE_TESSELLATION_EVALUATION_BIT
			""",
			"{@code stage} $must not be #SHADER_STAGE_ALL_GRAPHICS, or #SHADER_STAGE_ALL",
			"{@code pName} $must be the name of an {@code OpEntryPoint} in {@code module} with an execution model that matches {@code stage}",
			"""
			If the identified entry point includes any variable in its interface that is declared with the {@code ClipDistance} {@code BuiltIn} decoration,
			that variable $must not have an array size greater than ##VkPhysicalDeviceLimits{@code ::maxClipDistances}
			""",
			"""
			If the identified entry point includes any variable in its interface that is declared with the {@code CullDistance} {@code BuiltIn} decoration,
			that variable $must not have an array size greater than ##VkPhysicalDeviceLimits{@code ::maxCullDistances}
			""",
			"""
			If the identified entry point includes any variables in its interface that are declared with the {@code ClipDistance} or {@code CullDistance}
			{@code BuiltIn} decoration, those variables $must not have array sizes which sum to more than
			##VkPhysicalDeviceLimits{@code ::maxCombinedClipAndCullDistances}
			""",
			"""
			If the identified entry point includes any variable in its interface that is declared with the {@code SampleMask} {@code BuiltIn} decoration, that
			variable $must not have an array size greater than ##VkPhysicalDeviceLimits{@code ::maxSampleMaskWords}
			""",
			"""
			If {@code stage} is #SHADER_STAGE_VERTEX_BIT, the identified entry point $must not include any input variable in its interface that is decorated
			with {@code CullDistance}
			""",
			"""
			If {@code stage} is #SHADER_STAGE_TESSELLATION_CONTROL_BIT or #SHADER_STAGE_TESSELLATION_EVALUATION_BIT, and the identified entry point has an
			{@code OpExecutionMode} instruction that specifies a patch size with {@code OutputVertices}, the patch size $must be greater than 0 and less than
			or equal to ##VkPhysicalDeviceLimits{@code ::maxTessellationPatchSize}
			""",
			"""
			If {@code stage} is #SHADER_STAGE_GEOMETRY_BIT, the identified entry point $must have an {@code OpExecutionMode} instruction that specifies a
			maximum output vertex count that is greater than 0 and less than or equal to ##VkPhysicalDeviceLimits{@code ::maxGeometryOutputVertices}
			""",
			"""
			If {@code stage} is #SHADER_STAGE_GEOMETRY_BIT, the identified entry point $must have an {@code OpExecutionMode} instruction that specifies an
			invocation count that is greater than 0 and less than or equal to ##VkPhysicalDeviceLimits{@code ::maxGeometryShaderInvocations}
			""",
			"""
			If {@code stage} is #SHADER_STAGE_GEOMETRY_BIT, and the identified entry point writes to {@code Layer} for any primitive, it $must write the same
			value to {@code Layer} for all vertices of a given primitive
			""",
			"""
			If {@code stage} is #SHADER_STAGE_GEOMETRY_BIT, and the identified entry point writes to {@code ViewportIndex} for any primitive, it $must write
			the same value to {@code ViewportIndex} for all vertices of a given primitive
			""",
			"""
			If {@code stage} is #SHADER_STAGE_FRAGMENT_BIT, the identified entry point $must not include any output variables in its interface decorated with
			{@code CullDistance}
			""",
			"""
			If {@code stage} is #SHADER_STAGE_FRAGMENT_BIT, and the identified entry point writes to {@code FragDepth} in any execution path, it $must write to
			{@code FragDepth} in all execution paths
			"""
		)}"""

@JvmField val VkPipelineTessellationStateCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"{@code patchControlPoints} $must be greater than zero and less than or equal to ##VkPhysicalDeviceLimits{@code ::maxTessellationPatchSize}"
		)}"""

@JvmField val VkPipelineVertexInputStateCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"""
			If {@code vertexBindingDescriptionCount} is not 0, {@code pVertexBindingDescriptions} $must be a pointer to an array of
			{@code vertexBindingDescriptionCount} valid ##VkVertexInputBindingDescription structures
			""",
			"""
			If {@code vertexAttributeDescriptionCount} is not 0, {@code pVertexAttributeDescriptions} $must be a pointer to an array of
			{@code vertexAttributeDescriptionCount} valid ##VkVertexInputAttributeDescription structures
			""",
			"{@code vertexBindingDescriptionCount} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxVertexInputBindings}",
			"{@code vertexAttributeDescriptionCount} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxVertexInputAttributes}",
			"""
			For every {@code binding} specified by any given element of {@code pVertexAttributeDescriptions}, a {@code VkVertexInputBindingDescription} $must
			exist in {@code pVertexBindingDescriptions} with the same value of {@code binding}
			""",
			"All elements of {@code pVertexBindingDescriptions} $must describe distinct binding numbers",
			"All elements of {@code pVertexAttributeDescriptions} $must describe distinct attribute locations"
		)}"""

@JvmField val VkPipelineViewportStateCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"{@code viewportCount} $must be greater than 0",
			"{@code scissorCount} $must be greater than 0",
			"If the multiple viewports feature is not enabled, {@code viewportCount} $must be 1",
			"If the multiple viewports feature is not enabled, {@code scissorCount} $must be 1",
			"{@code viewportCount} $must be between 1 and ##VkPhysicalDeviceLimits{@code ::maxViewports}, inclusive",
			"{@code scissorCount} $must be between 1 and ##VkPhysicalDeviceLimits{@code ::maxViewports}, inclusive",
			"{@code scissorCount} and {@code viewportCount} $must be identical"
		)}"""

@JvmField val VkPresentInfoKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_PRESENT_INFO_KHR",
			"{@code pNext} $must be $NULL",
			"""
			If {@code waitSemaphoreCount} is not 0, and {@code pWaitSemaphores} is not $NULL, {@code pWaitSemaphores} $must be a pointer to an array of
			{@code waitSemaphoreCount} valid {@code VkSemaphore} handles
			""",
			"{@code pSwapchains} $must be a pointer to an array of {@code swapchainCount} valid {@code VkSwapchainKHR} handles",
			"{@code pImageIndices} $must be a pointer to an array of {@code swapchainCount} {@code uint32_t} values",
			"If {@code pResults} is not $NULL, {@code pResults} $must be a pointer to an array of {@code swapchainCount} {@code VkResult} values",
			"{@code swapchainCount} $must be greater than 0",
			"""
			Any given element of {@code pImageIndices} $must be the index of a presentable image acquired from the swapchain specified by the corresponding
			element of the {@code pSwapchains} array
			""",
			"""
			Any given element of {@code VkSemaphore} in {@code pWaitSemaphores} $must refer to a prior signal of that {@code VkSemaphore} that will not be
			consumed by any other wait on that semaphore
			"""
		)}"""

@JvmField val VkPushConstantRange =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code stageFlags} $must be a valid combination of {@code VkShaderStageFlagBits} values",
			"{@code stageFlags} $must not be 0",
			"{@code offset} $must be less than ##VkPhysicalDeviceLimits{@code ::maxPushConstantsSize}",
			"{@code size} $must be greater than 0",
			"{@code size} $must be a multiple of 4",
			"{@code size} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxPushConstantsSize} minus {@code offset}"
		)}"""

@JvmField val VkQueryPoolCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"{@code queryType} $must be a valid {@code VkQueryType} value",
			"If the pipeline statistics queries feature is not enabled, {@code queryType} $must not be #QUERY_TYPE_PIPELINE_STATISTICS",
			"""
			If {@code queryType} is #QUERY_TYPE_PIPELINE_STATISTICS, {@code pipelineStatistics} $must be a valid combination of
			{@code VkQueryPipelineStatisticFlagBits} values
			"""
		)}"""

@JvmField val VkRenderPassBeginInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO",
			"{@code pNext} $must be $NULL",
			"{@code renderPass} $must be a valid {@code VkRenderPass} handle",
			"{@code framebuffer} $must be a valid {@code VkFramebuffer} handle",
			"""
			If {@code clearValueCount} is not 0, {@code pClearValues} $must be a pointer to an array of {@code clearValueCount} valid {@code VkClearValue}
			unions
			""",
			"Both of {@code framebuffer}, and {@code renderPass} $must have been created, allocated, or retrieved from the same {@code VkDevice}",
			"""
			{@code clearValueCount} $must be greater than the largest attachment index in {@code renderPass} that specifies a {@code loadOp} (or
			{@code stencilLoadOp}, if the attachment has a depth/stencil format) of #ATTACHMENT_LOAD_OP_CLEAR
			"""
		)}"""

@JvmField val VkRenderPassCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"""
			If {@code attachmentCount} is not 0, {@code pAttachments} $must be a pointer to an array of {@code attachmentCount} valid ##VkAttachmentDescription
			structures
			""",
			"{@code pSubpasses} $must be a pointer to an array of {@code subpassCount} valid ##VkSubpassDescription structures",
			"""
			If {@code dependencyCount} is not 0, {@code pDependencies} $must be a pointer to an array of {@code dependencyCount} valid ##VkSubpassDependency
			structures
			""",
			"{@code subpassCount} $must be greater than 0",
			"""
			If any two subpasses operate on attachments with overlapping ranges of the same {@code VkDeviceMemory} object, and at least one subpass writes to
			that area of {@code VkDeviceMemory}, a subpass dependency $must be included (either directly or via some intermediate subpasses) between them
			""",
			"""
			If the {@code attachment} member of any element of {@code pInputAttachments}, {@code pColorAttachments}, {@code pResolveAttachments} or
			{@code pDepthStencilAttachment}, or the attachment indexed by any element of {@code pPreserveAttachments} in any given element of
			{@code pSubpasses} is bound to a range of a {@code VkDeviceMemory} object that overlaps with any other attachment in any subpass (including the
			same subpass), the ##VkAttachmentDescription structures describing them $must include #ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT in {@code flags}
			""",
			"""
			If the {@code attachment} member of any element of {@code pInputAttachments}, {@code pColorAttachments}, {@code pResolveAttachments} or
			{@code pDepthStencilAttachment}, or any element of {@code pPreserveAttachments} in any given element of {@code pSubpasses} is not
			#ATTACHMENT_UNUSED, it $must be less than {@code attachmentCount}
			""",
			"The value of any element of the {@code pPreserveAttachments} member in any given element of {@code pSubpasses} $must not be #ATTACHMENT_UNUSED"
		)}"""

@JvmField val VkSamplerCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_SAMPLER_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"{@code magFilter} $must be a valid {@code VkFilter} value",
			"{@code minFilter} $must be a valid {@code VkFilter} value",
			"{@code mipmapMode} $must be a valid {@code VkSamplerMipmapMode} value",
			"{@code addressModeU} $must be a valid {@code VkSamplerAddressMode} value",
			"{@code addressModeV} $must be a valid {@code VkSamplerAddressMode} value",
			"{@code addressModeW} $must be a valid {@code VkSamplerAddressMode} value",
			"The absolute value of {@code mipLodBias} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxSamplerLodBias}",
			"If the anisotropic sampling feature is not enabled, {@code anisotropyEnable} $must be #FALSE",
			"""
			If {@code anisotropyEnable} is #TRUE, {@code maxAnisotropy} $must be between {@code 1.0} and
			##VkPhysicalDeviceLimits{@code ::maxSamplerAnisotropy}, inclusive
			""",
			"If {@code unnormalizedCoordinates} is #TRUE, {@code minFilter} and {@code magFilter} $must be equal",
			"If {@code unnormalizedCoordinates} is #TRUE, {@code mipmapMode} $must be #SAMPLER_MIPMAP_MODE_NEAREST",
			"If {@code unnormalizedCoordinates} is #TRUE, {@code minLod} and {@code maxLod} $must be zero",
			"""
			If {@code unnormalizedCoordinates} is #TRUE, {@code addressModeU} and {@code addressModeV} $must each be either #SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE
			or #SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER
			""",
			"If {@code unnormalizedCoordinates} is #TRUE, {@code anisotropyEnable} $must be #FALSE",
			"If {@code unnormalizedCoordinates} is #TRUE, {@code compareEnable} $must be #FALSE",
			"""
			If any of {@code addressModeU}, {@code addressModeV} or {@code addressModeW} are #SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER, {@code borderColor} $must
			be a valid {@code VkBorderColor} value
			""",
			"""
			If the {@code VK_KHR_sampler_mirror_clamp_to_edge} extension is not enabled, {@code addressModeU}, {@code addressModeV} and {@code addressModeW}
			$must not be #SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE
			""",
			"If {@code compareEnable} is #TRUE, {@code compareOp} $must be a valid {@code VkCompareOp} value",
			"If either {@code magFilter} or {@code minFilter} is #FILTER_CUBIC_IMG, {@code anisotropyEnable} $must be #FALSE"
		)}"""

@JvmField val VkSemaphoreCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0"
		)}"""

@JvmField val VkShaderModuleCreateInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"{@code pCode} $must be a pointer to an array of {@code codeSize / 4} {@code uint32_t} values",
			"{@code codeSize} $must be greater than 0",
			"""
			{@code codeSize} $must be a multiple of 4. If the +VK_NV_glsl_shader extension+ is enabled and {@code pCode} references GLSL code {@code codeSize}
			can be a multiple of 1
			""",
			"""
			{@code pCode} $must point to valid SPIR-V code, formatted and packed as described by the Khronos SPIR-V Specification. If the
			{@code VK_NV_glsl_shader} extension is enabled {@code pCode} can instead reference valid GLSL code and $must be written to the
			{@code GL_KHR_vulkan_glsl} extension specification
			""",
			"""
			{@code pCode} $must adhere to the validation rules described by the Validation Rules within a Module section of the SPIR-V Environment appendix. If
			the {@code VK_NV_glsl_shader} extension is enabled {@code pCode} can be valid GLSL code with respect to the {@code GL_KHR_vulkan_glsl} GLSL
			extension specification
			""",
			"{@code pCode} $must declare the {@code Shader} capability for SPIR-V code",
			"""
			{@code pCode} $must not declare any capability that is not supported by the API, as described by the Capabilities section of the SPIR-V Environment
			appendix
			""",
			"""
			If {@code pCode} declares any of the capabilities that are listed as not required by the implementation, the relevant feature $must be enabled, as
			listed in the SPIR-V Environment appendix
			"""
		)}"""

@JvmField val VkSparseBufferMemoryBindInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code buffer} $must be a valid {@code VkBuffer} handle",
			"{@code pBinds} $must be a pointer to an array of {@code bindCount} valid ##VkSparseMemoryBind structures",
			"{@code bindCount} $must be greater than 0"
		)}"""

@JvmField val VkSparseImageMemoryBind =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code subresource} $must be a valid ##VkImageSubresource structure",
			"If {@code memory} is not #NULL_HANDLE, {@code memory} $must be a valid {@code VkDeviceMemory} handle",
			"{@code flags} $must be a valid combination of {@code VkSparseMemoryBindFlagBits} values",
			"""
			If the sparse aliased residency feature is not enabled, and if any other resources are bound to ranges of {@code memory}, the range of
			{@code memory} being bound $must not overlap with those bound ranges
			""",
			"{@code memory} and {@code memoryOffset} $must match the memory requirements of the calling command's {@code image}",
			"{@code subresource} $must be a valid image subresource for {@code image}",
			"""
			{@code offset.x} $must be a multiple of the sparse image block width (##VkSparseImageFormatProperties{@code ::imageGranularity}.width) of the image
			""",
			"""
			{@code extent.width} $must either be a multiple of the sparse image block width of the image, or else {@code extent.width} + {@code offset.x} $must
			equal the width of the image subresource
			""",
			"""
			{@code offset.y} $must be a multiple of the sparse image block height (##VkSparseImageFormatProperties{@code ::imageGranularity}.height) of the
			image
			""",
			"""
			{@code extent.height} $must either be a multiple of the sparse image block height of the image, or else {@code extent.height} + {@code offset.y}
			$must equal the height of the image subresource
			""",
			"""
			{@code offset.z} $must be a multiple of the sparse image block depth (##VkSparseImageFormatProperties{@code ::imageGranularity}.depth) of the image
			""",
			"""
			{@code extent.depth} $must either be a multiple of the sparse image block depth of the image, or else {@code extent.depth} + {@code offset.z} $must
			equal the depth of the image subresource
			"""
		)}"""

@JvmField val VkSparseImageMemoryBindInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code image} $must be a valid {@code VkImage} handle",
			"{@code pBinds} $must be a pointer to an array of {@code bindCount} valid ##VkSparseImageMemoryBind structures",
			"{@code bindCount} $must be greater than 0"
		)}"""

@JvmField val VkSparseImageOpaqueMemoryBindInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code image} $must be a valid {@code VkImage} handle",
			"{@code pBinds} $must be a pointer to an array of {@code bindCount} valid ##VkSparseMemoryBind structures",
			"{@code bindCount} $must be greater than 0",
			"""
			For any given element of {@code pBinds}, if the {@code flags} member of that element contains #SPARSE_MEMORY_BIND_METADATA_BIT, the binding range
			defined $must be within the mip tail region of the metadata aspect of {@code image}
			"""
		)}"""

@JvmField val VkSparseMemoryBind =
	"""<h5>Valid Usage</h5>
		${ul(
			"If {@code memory} is not #NULL_HANDLE, {@code memory} $must be a valid {@code VkDeviceMemory} handle",
			"{@code flags} $must be a valid combination of {@code VkSparseMemoryBindFlagBits} values",
			"If {@code memory} is not #NULL_HANDLE, {@code memory} and {@code memoryOffset} $must match the memory requirements of the resource",
			"""
			If {@code memory} is not #NULL_HANDLE, {@code memory} $must not have been created with a memory type that reports
			#MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT bit set
			""",
			"{@code size} $must be greater than 0",
			"{@code resourceOffset} $must be less than the size of the resource",
			"{@code size} $must be less than or equal to the size of the resource minus {@code resourceOffset}",
			"{@code memoryOffset} $must be less than the size of {@code memory}",
			"{@code size} $must be less than or equal to the size of {@code memory} minus {@code memoryOffset}"
		)}"""

@JvmField val VkSpecializationInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"""
			If {@code mapEntryCount} is not 0, {@code pMapEntries} $must be a pointer to an array of {@code mapEntryCount} valid ##VkSpecializationMapEntry
			structures
			""",
			"If {@code dataSize} is not 0, {@code pData} $must be a pointer to an array of {@code dataSize} bytes",
			"The {@code offset} member of any given element of {@code pMapEntries} $must be less than {@code dataSize}",
			"For any given element of {@code pMapEntries}, {@code size} $must be less than or equal to {@code dataSize} minus {@code offset}"
		)}"""

@JvmField val VkSpecializationMapEntry =
	"""<h5>Valid Usage</h5>
		${ul(
			"""
			For a {@code constantID} specialization constant declared in a shader, {@code size} $must match the byte size of the {@code constantID}. If the
			specialization constant is of type {@code boolean}, {@code size} $must be the byte size of VkBool32
			"""
		)}"""

@JvmField val VkStencilOpState =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code failOp} $must be a valid {@code VkStencilOp} value",
			"{@code passOp} $must be a valid {@code VkStencilOp} value",
			"{@code depthFailOp} $must be a valid {@code VkStencilOp} value",
			"{@code compareOp} $must be a valid {@code VkCompareOp} value"
		)}"""

@JvmField val VkSubmitInfo =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_SUBMIT_INFO",
			"{@code pNext} $must be $NULL",
			"""
			If {@code waitSemaphoreCount} is not 0, {@code pWaitSemaphores} $must be a pointer to an array of {@code waitSemaphoreCount} valid
			{@code VkSemaphore} handles
			""",
			"""
			If {@code waitSemaphoreCount} is not 0, {@code pWaitDstStageMask} $must be a pointer to an array of {@code waitSemaphoreCount} valid combinations
			of {@code VkPipelineStageFlagBits} values
			""",
			"Each element of {@code pWaitDstStageMask} $must not be 0",
			"""
			If {@code commandBufferCount} is not 0, {@code pCommandBuffers} $must be a pointer to an array of {@code commandBufferCount} valid
			{@code VkCommandBuffer} handles
			""",
			"""
			If {@code signalSemaphoreCount} is not 0, {@code pSignalSemaphores} $must be a pointer to an array of {@code signalSemaphoreCount} valid
			{@code VkSemaphore} handles
			""",
			"""
			Each of the elements of {@code pCommandBuffers}, the elements of {@code pSignalSemaphores}, and the elements of {@code pWaitSemaphores} that are
			valid handles $must have been created, allocated, or retrieved from the same {@code VkDevice}
			""",
			"Any given element of {@code pSignalSemaphores} $must currently be unsignaled",
			"""
			Any given element of {@code pCommandBuffers} $must either have been recorded with the #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT, or not currently
			be executing on the device
			""",
			"Any given element of {@code pCommandBuffers} $must be in the executable state",
			"""
			If any given element of {@code pCommandBuffers} contains commands that execute secondary command buffers, those secondary command buffers $must
			have been recorded with the #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT, or not currently be executing on the device
			""",
			"""
			If any given element of {@code pCommandBuffers} was recorded with #COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT, it $must not have been previously
			submitted without re-recording that command buffer
			""",
			"""
			If any given element of {@code pCommandBuffers} contains commands that execute secondary command buffers recorded with
			#COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT, each such secondary command buffer $must not have been previously submitted without re-recording that
			command buffer
			""",
			"""
			Any given element of {@code pCommandBuffers} $must not contain commands that execute a secondary command buffer, if that secondary command buffer
			has been recorded in another primary command buffer after it was recorded into this {@code VkCommandBuffer}
			""",
			"""
			Any given element of {@code pCommandBuffers} $must have been allocated from a {@code VkCommandPool} that was created for the same queue family that
			the calling command's {@code queue} belongs to
			""",
			"Any given element of {@code pCommandBuffers} $must not have been allocated with #COMMAND_BUFFER_LEVEL_SECONDARY",
			"""
			Any given element of {@code VkSemaphore} in {@code pWaitSemaphores} $must refer to a prior signal of that {@code VkSemaphore} that will not be
			consumed by any other wait on that semaphore
			""",
			"""
			If the geometry shaders feature is not enabled, any given element of {@code pWaitDstStageMask} $must not contain
			#PIPELINE_STAGE_GEOMETRY_SHADER_BIT
			""",
			"""
			If the tessellation shaders feature is not enabled, any given element of {@code pWaitDstStageMask} $must not contain
			#PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT
			"""
		)}"""

@JvmField val VkSubpassDependency =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code srcStageMask} $must be a valid combination of {@code VkPipelineStageFlagBits} values",
			"{@code srcStageMask} $must not be 0",
			"{@code dstStageMask} $must be a valid combination of {@code VkPipelineStageFlagBits} values",
			"{@code dstStageMask} $must not be 0",
			"{@code srcAccessMask} $must be a valid combination of {@code VkAccessFlagBits} values",
			"{@code dstAccessMask} $must be a valid combination of {@code VkAccessFlagBits} values",
			"{@code dependencyFlags} $must be a valid combination of {@code VkDependencyFlagBits} values",
			"If the geometry shaders feature is not enabled, {@code srcStageMask} $must not contain #PIPELINE_STAGE_GEOMETRY_SHADER_BIT",
			"If the geometry shaders feature is not enabled, {@code dstStageMask} $must not contain #PIPELINE_STAGE_GEOMETRY_SHADER_BIT",
			"""
			If the tessellation shaders feature is not enabled, {@code srcStageMask} $must not contain #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or
			#PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT
			""",
			"""
			If the tessellation shaders feature is not enabled, {@code dstStageMask} $must not contain #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or
			#PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT
			""",
			"""
			{@code srcSubpass} $must be less than or equal to {@code dstSubpass}, unless one of them is #SUBPASS_EXTERNAL, to avoid cyclic dependencies and
			ensure a valid execution order
			""",
			"{@code srcSubpass} and {@code dstSubpass} $must not both be equal to #SUBPASS_EXTERNAL",
			"""
			If {@code srcSubpass} is equal to {@code dstSubpass}, {@code srcStageMask} and {@code dstStageMask} $must only contain one of
			#PIPELINE_STAGE_TOP_OF_PIPE_BIT, #PIPELINE_STAGE_DRAW_INDIRECT_BIT, #PIPELINE_STAGE_VERTEX_INPUT_BIT, #PIPELINE_STAGE_VERTEX_SHADER_BIT,
			#PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT, #PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT, #PIPELINE_STAGE_GEOMETRY_SHADER_BIT,
			#PIPELINE_STAGE_FRAGMENT_SHADER_BIT, #PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT, #PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT,
			#PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT, #PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT, or #PIPELINE_STAGE_ALL_GRAPHICS_BIT
			""",
			"""
			If {@code srcSubpass} is equal to {@code dstSubpass}, the highest bit value included in {@code srcStageMask} $must be less than or equal to the
			lowest bit value in {@code dstStageMask}
			"""
		)}"""

@JvmField val VkSubpassDescription =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code flags} $must be 0",
			"{@code pipelineBindPoint} $must be a valid {@code VkPipelineBindPoint} value",
			"""
			If {@code inputAttachmentCount} is not 0, {@code pInputAttachments} $must be a pointer to an array of {@code inputAttachmentCount} valid
			##VkAttachmentReference structures
			""",
			"""
			If {@code colorAttachmentCount} is not 0, {@code pColorAttachments} $must be a pointer to an array of {@code colorAttachmentCount} valid
			##VkAttachmentReference structures
			""",
			"""
			If {@code colorAttachmentCount} is not 0, and {@code pResolveAttachments} is not $NULL, {@code pResolveAttachments} $must be a pointer to an array
			of {@code colorAttachmentCount} valid ##VkAttachmentReference structures
			""",
			"If {@code pDepthStencilAttachment} is not $NULL, {@code pDepthStencilAttachment} $must be a pointer to a valid ##VkAttachmentReference structure",
			"""
			If {@code preserveAttachmentCount} is not 0, {@code pPreserveAttachments} $must be a pointer to an array of {@code preserveAttachmentCount}
			{@code uint32_t} values
			""",
			"{@code pipelineBindPoint} $must be #PIPELINE_BIND_POINT_GRAPHICS",
			"{@code colorCount} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxColorAttachments}",
			"""
			If the first use of an attachment in this render pass is as an input attachment, and the attachment is not also used as a color or depth/stencil
			attachment in the same subpass, then {@code loadOp} $must not be #ATTACHMENT_LOAD_OP_CLEAR
			""",
			"""
			If {@code pResolveAttachments} is not $NULL, for each resolve attachment that does not have the value #ATTACHMENT_UNUSED, the corresponding color
			attachment $must not have the value #ATTACHMENT_UNUSED
			""",
			"""
			If {@code pResolveAttachments} is not $NULL, the sample count of each element of {@code pColorAttachments} $must be anything other than
			#SAMPLE_COUNT_1_BIT
			""",
			"Any given element of {@code pResolveAttachments} $must have a sample count of #SAMPLE_COUNT_1_BIT",
			"Any given element of {@code pResolveAttachments} $must have the same {@code VkFormat} as its corresponding color attachment",
			"""
			All attachments in {@code pColorAttachments} and {@code pDepthStencilAttachment} that are not #ATTACHMENT_UNUSED $must have the same sample count
			""",
			"""
			If any input attachments are #ATTACHMENT_UNUSED, then any pipelines bound during the subpass $must not access those input attachments from the
			fragment shader
			""",
			"The {@code attachment} member of any element of {@code pPreserveAttachments} $must not be #ATTACHMENT_UNUSED",
			"Any given element of {@code pPreserveAttachments} $must not also be an element of any other member of the subpass description",
			"If any attachment is used as both an input attachment and a color or depth/stencil attachment, then each use $must use the same {@code layout}"
		)}"""

@JvmField val VkSurfaceCapabilitiesKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code supportedTransforms} $must be a valid combination of {@code VkSurfaceTransformFlagBitsKHR} values",
			"{@code currentTransform} $must be a valid {@code VkSurfaceTransformFlagBitsKHR} value",
			"{@code supportedCompositeAlpha} $must be a valid combination of {@code VkCompositeAlphaFlagBitsKHR} values",
			"{@code supportedUsageFlags} $must be a valid combination of {@code VkImageUsageFlagBits} values"
		)}"""

@JvmField val VkSurfaceFormatKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code format} $must be a valid {@code VkFormat} value",
			"{@code colorSpace} $must be a valid {@code VkColorSpaceKHR} value"
		)}"""

@JvmField val VkSwapchainCreateInfoKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"{@code surface} $must be a valid {@code VkSurfaceKHR} handle",
			"{@code imageFormat} $must be a valid {@code VkFormat} value",
			"{@code imageColorSpace} $must be a valid {@code VkColorSpaceKHR} value",
			"{@code imageUsage} $must be a valid combination of {@code VkImageUsageFlagBits} values",
			"{@code imageUsage} $must not be 0",
			"{@code imageSharingMode} $must be a valid {@code VkSharingMode} value",
			"{@code preTransform} $must be a valid {@code VkSurfaceTransformFlagBitsKHR} value",
			"{@code compositeAlpha} $must be a valid {@code VkCompositeAlphaFlagBitsKHR} value",
			"{@code presentMode} $must be a valid {@code VkPresentModeKHR} value",
			"If {@code oldSwapchain} is not #NULL_HANDLE, {@code oldSwapchain} $must be a valid {@code VkSwapchainKHR} handle",
			"If {@code oldSwapchain} is a valid handle, it $must have been created, allocated, or retrieved from {@code surface}",
			"{@code surface} $must be a surface that is supported by the device as determined using #GetPhysicalDeviceSurfaceSupportKHR()",
			"""
			The native window referred to by {@code surface} $must not already be associated with a swapchain other than {@code oldSwapchain}, or with a
			non-Vulkan graphics API surface
			""",
			"""
			{@code minImageCount} $must be greater than or equal to the value returned in the {@code minImageCount} member of the ##VkSurfaceCapabilitiesKHR
			structure returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR() for the surface
			""",
			"""
			{@code minImageCount} $must be less than or equal to the value returned in the {@code maxImageCount} member of the ##VkSurfaceCapabilitiesKHR
			structure returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR() for the surface if the returned {@code maxImageCount} is not zero
			""",
			"""
			{@code imageFormat} and {@code imageColorspace} $must match the {@code format} and {@code colorSpace} members, respectively, of one of the
			##VkSurfaceFormatKHR structures returned by #GetPhysicalDeviceSurfaceFormatsKHR() for the surface
			""",
			"""
			{@code imageExtent} $must be between {@code minImageExtent} and {@code maxImageExtent}, inclusive, where {@code minImageExtent} and
			{@code maxImageExtent} are members of the ##VkSurfaceCapabilitiesKHR structure returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR() for the
			surface
			""",
			"""
			{@code imageArrayLayers} $must be greater than 0 and less than or equal to the {@code maxImageArrayLayers} member of the ##VkSurfaceCapabilitiesKHR
			structure returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR() for the surface
			""",
			"""
			{@code imageUsage} $must be a subset of the supported usage flags present in the {@code supportedUsageFlags} member of the
			##VkSurfaceCapabilitiesKHR structure returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR() for the surface
			""",
			"""
			If {@code imageSharingMode} is #SHARING_MODE_CONCURRENT, {@code pQueueFamilyIndices} $must be a pointer to an array of
			{@code queueFamilyIndexCount} {@code uint32_t} values
			""",
			"If {@code imageSharingMode} is #SHARING_MODE_CONCURRENT, {@code queueFamilyIndexCount} $must be greater than 1",
			"""
			{@code preTransform} $must be one of the bits present in the {@code supportedTransforms} member of the ##VkSurfaceCapabilitiesKHR structure
			returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR() for the surface
			""",
			"""
			{@code compositeAlpha} $must be one of the bits present in the {@code supportedCompositeAlpha} member of the ##VkSurfaceCapabilitiesKHR structure
			returned by #GetPhysicalDeviceSurfaceCapabilitiesKHR() for the surface
			""",
			"{@code presentMode} $must be one of the ename:VkPresentModeKHR values returned by #GetPhysicalDeviceSurfacePresentModesKHR() for the surface"
		)}"""

@JvmField val VkValidationFlagsEXT =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_VALIDATION_FLAGS_EXT",
			"{@code pNext} $must be $NULL",
			"{@code pDisabledValidationChecks} $must be a pointer to an array of {@code disabledValidationCheckCount} {@code VkValidationCheckEXT} values",
			"{@code disabledValidationCheckCount} $must be greater than 0"
		)}"""

@JvmField val VkVertexInputAttributeDescription =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code format} $must be a valid {@code VkFormat} value",
			"{@code location} $must be less than ##VkPhysicalDeviceLimits{@code ::maxVertexInputAttributes}",
			"{@code binding} $must be less than ##VkPhysicalDeviceLimits{@code ::maxVertexInputBindings}",
			"{@code offset} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxVertexInputAttributeOffset}",
			"""
			{@code format} $must be allowed as a vertex buffer format, as specified by the #FORMAT_FEATURE_VERTEX_BUFFER_BIT flag in
			##VkFormatProperties{@code ::bufferFeatures} returned by #GetPhysicalDeviceFormatProperties()
			"""
		)}"""

@JvmField val VkVertexInputBindingDescription =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code inputRate} $must be a valid {@code VkVertexInputRate} value",
			"{@code binding} $must be less than ##VkPhysicalDeviceLimits{@code ::maxVertexInputBindings}",
			"{@code stride} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxVertexInputBindingStride}"
		)}"""

@JvmField val VkViewport =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code width} $must be greater than {@code 0.0} and less than or equal to ##VkPhysicalDeviceLimits{@code ::maxViewportDimensions}[0]",
			"{@code height} $must be greater than {@code 0.0} and less than or equal to ##VkPhysicalDeviceLimits{@code ::maxViewportDimensions}[1]",
			"{@code x} and {@code y} $must each be between {@code viewportBoundsRange}[0] and {@code viewportBoundsRange}[1], inclusive",
			"{@code x} + {@code width} $must be less than or equal to {@code viewportBoundsRange}[1]",
			"{@code y} + {@code height} $must be less than or equal to {@code viewportBoundsRange}[1]",
			"{@code minDepth} $must be between {@code 0.0} and {@code 1.0}, inclusive",
			"{@code maxDepth} $must be between {@code 0.0} and {@code 1.0}, inclusive",
			"If the {@code VK_AMD_negative_viewport_height} extension is enabled, {@code height} $can also be negative"
		)}"""

@JvmField val VkWaylandSurfaceCreateInfoKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_WAYLAND_SURFACE_CREATE_INFO_KHR",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"{@code display} $must be a pointer to a {@code wl_display} value",
			"{@code surface} $must be a pointer to a {@code wl_surface} value"
		)}"""

@JvmField val VkWin32KeyedMutexAcquireReleaseInfoNV =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_NV",
			"{@code pNext} $must be $NULL",
			"{@code pAcquireSyncs} $must be a pointer to a valid {@code VkDeviceMemory} handle",
			"{@code pAcquireKeys} $must be a pointer to a valid {@code uint64_t} value",
			"{@code pAcquireTimeoutMilliseconds} $must be a pointer to a valid {@code uint32_t} value",
			"{@code pReleaseSyncs} $must be a pointer to a valid {@code VkDeviceMemory} handle",
			"{@code pReleaseKeys} $must be a pointer to a valid {@code uint64_t} value",
			"Both of {@code pAcquireSyncs}, and {@code pReleaseSyncs} $must have been created, allocated, or retrieved from the same {@code VkDevice}"
		)}"""

@JvmField val VkWin32SurfaceCreateInfoKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0"
		)}"""

@JvmField val VkWriteDescriptorSet =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET",
			"{@code pNext} $must be $NULL",
			"{@code dstSet} $must be a valid {@code VkDescriptorSet} handle",
			"{@code descriptorType} $must be a valid {@code VkDescriptorType} value",
			"{@code descriptorCount} $must be greater than 0",
			"""
			Both of {@code dstSet}, and the elements of {@code pTexelBufferView} that are valid handles $must have been created, allocated, or retrieved from
			the same {@code VkDevice}
			""",
			"{@code dstBinding} $must be a valid binding point within {@code dstSet}",
			"{@code descriptorType} $must match the type of {@code dstBinding} within {@code dstSet}",
			"""
			The sum of {@code dstArrayElement} and {@code descriptorCount} $must be less than or equal to the number of array elements in the descriptor set
			binding specified by {@code dstBinding}, and all applicable consecutive bindings
			""",
			"""
			If {@code descriptorType} is #DESCRIPTOR_TYPE_SAMPLER, #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, #DESCRIPTOR_TYPE_SAMPLED_IMAGE,
			#DESCRIPTOR_TYPE_STORAGE_IMAGE, or #DESCRIPTOR_TYPE_INPUT_ATTACHMENT, {@code pImageInfo} $must be a pointer to an array of {@code descriptorCount}
			valid ##VkDescriptorImageInfo structures
			""",
			"""
			If {@code descriptorType} is #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER or #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER, {@code pTexelBufferView} $must be a
			pointer to an array of {@code descriptorCount} valid {@code VkBufferView} handles
			""",
			"""
			If {@code descriptorType} is #DESCRIPTOR_TYPE_UNIFORM_BUFFER, #DESCRIPTOR_TYPE_STORAGE_BUFFER, #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC, or
			#DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC, {@code pBufferInfo} $must be a pointer to an array of {@code descriptorCount} valid
			##VkDescriptorBufferInfo structures
			""",
			"""
			If {@code descriptorType} is #DESCRIPTOR_TYPE_SAMPLER or #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, and {@code dstSet} was not allocated with a
			layout that included immutable samplers for {@code dstBinding} with {@code descriptorType}, the {@code sampler} member of any given element of
			{@code pImageInfo} $must be a valid {@code VkSampler} object
			""",
			"""
			If {@code descriptorType} is #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, #DESCRIPTOR_TYPE_SAMPLED_IMAGE, #DESCRIPTOR_TYPE_STORAGE_IMAGE, or
			#DESCRIPTOR_TYPE_INPUT_ATTACHMENT, the {@code imageView} and {@code imageLayout} members of any given element of {@code pImageInfo} $must be a
			valid {@code VkImageView} and {@code VkImageLayout}, respectively
			""",
			"""
			If {@code descriptorType} is #DESCRIPTOR_TYPE_UNIFORM_BUFFER or #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC, the {@code offset} member of any given
			element of {@code pBufferInfo} $must be a multiple of ##VkPhysicalDeviceLimits{@code ::minUniformBufferOffsetAlignment}
			""",
			"""
			If {@code descriptorType} is #DESCRIPTOR_TYPE_STORAGE_BUFFER or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC, the {@code offset} member of any given
			element of {@code pBufferInfo} $must be a multiple of ##VkPhysicalDeviceLimits{@code ::minStorageBufferOffsetAlignment}
			""",
			"""
			If {@code descriptorType} is #DESCRIPTOR_TYPE_UNIFORM_BUFFER or #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC, the {@code buffer} member of any given
			element of {@code pBufferInfo} $must have been created with #BUFFER_USAGE_UNIFORM_BUFFER_BIT set
			""",
			"""
			If {@code descriptorType} is #DESCRIPTOR_TYPE_STORAGE_BUFFER or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC, the {@code buffer} member of any given
			element of {@code pBufferInfo} $must have been created with #BUFFER_USAGE_STORAGE_BUFFER_BIT set
			""",
			"""
			If {@code descriptorType} is #DESCRIPTOR_TYPE_UNIFORM_BUFFER or #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC, the {@code range} member of any given
			element of {@code pBufferInfo}, or the effective range if {@code range} is #WHOLE_SIZE, $must be less than or equal to
			##VkPhysicalDeviceLimits{@code ::maxUniformBufferRange}
			""",
			"""
			If {@code descriptorType} is #DESCRIPTOR_TYPE_STORAGE_BUFFER or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC, the {@code range} member of any given
			element of {@code pBufferInfo}, or the effective range if {@code range} is #WHOLE_SIZE, $must be less than or equal to
			##VkPhysicalDeviceLimits{@code ::maxStorageBufferRange}
			""",
			"""
			If {@code descriptorType} is #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER, the {@code VkBuffer} that any given element of {@code pTexelBufferView} was
			created from $must have been created with #BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT set
			""",
			"""
			If {@code descriptorType} is #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER, the {@code VkBuffer} that any given element of {@code pTexelBufferView} was
			created from $must have been created with #BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT set
			""",
			"""
			If {@code descriptorType} is #DESCRIPTOR_TYPE_STORAGE_IMAGE or #DESCRIPTOR_TYPE_INPUT_ATTACHMENT, the {@code imageView} member of any given element
			of {@code pImageInfo} $must have been created with the identity swizzle
			"""
		)}"""

@JvmField val VkXcbSurfaceCreateInfoKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_XCB_SURFACE_CREATE_INFO_KHR",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"{@code connection} $must be a pointer to a {@code xcb_connection_t} value"
		)}"""

@JvmField val VkXlibSurfaceCreateInfoKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code sType} $must be #STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR",
			"{@code pNext} $must be $NULL",
			"{@code flags} $must be 0",
			"{@code dpy} $must be a pointer to a {@code Display} value"
		)}"""

}