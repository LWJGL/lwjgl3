/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan

import org.lwjgl.generator.*

object ValidityProtos {

@JvmField val vkAcquireNextImageKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code swapchain} $must be a valid {@code VkSwapchainKHR} handle",
			"If {@code semaphore} is not #NULL_HANDLE, {@code semaphore} $must be a valid {@code VkSemaphore} handle",
			"If {@code fence} is not #NULL_HANDLE, {@code fence} $must be a valid {@code VkFence} handle",
			"{@code pImageIndex} $must be a pointer to a {@code uint32_t} value",
			"If {@code semaphore} is a valid handle, it $must have been created, allocated, or retrieved from {@code device}",
			"If {@code fence} is a valid handle, it $must have been created, allocated, or retrieved from {@code device}",
			"If {@code semaphore} is not #NULL_HANDLE it $must be unsignaled",
			"""
			If {@code fence} is not #NULL_HANDLE it $must be unsignaled and $mustnot be associated with any other queue command that has not yet completed
			execution on that queue
			"""
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code swapchain} $must be externally synchronized",
			"Host access to {@code semaphore} $must be externally synchronized",
			"Host access to {@code fence} $must be externally synchronized"
		)}"""

@JvmField val vkAllocateCommandBuffers =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pAllocateInfo} $must be a pointer to a valid ##VkCommandBufferAllocateInfo structure",
			"{@code pCommandBuffers} $must be a pointer to an array of {@code pAllocateInfo}->commandBufferCount {@code VkCommandBuffer} handles"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code pAllocateInfo}->commandPool $must be externally synchronized"
		)}"""

@JvmField val vkAllocateDescriptorSets =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pAllocateInfo} $must be a pointer to a valid ##VkDescriptorSetAllocateInfo structure",
			"{@code pDescriptorSets} $must be a pointer to an array of {@code pAllocateInfo}->descriptorSetCount {@code VkDescriptorSet} handles"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code pAllocateInfo}->descriptorPool $must be externally synchronized"
		)}"""

@JvmField val vkAllocateMemory =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pAllocateInfo} $must be a pointer to a valid ##VkMemoryAllocateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pMemory} $must be a pointer to a {@code VkDeviceMemory} handle",
			"""
			The number of currently valid memory objects, allocated from {@code device}, $must be less than
			##VkPhysicalDeviceLimits{@code ::maxMemoryAllocationCount}
			"""
		)}"""

@JvmField val vkBeginCommandBuffer =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code pBeginInfo} $must be a pointer to a valid ##VkCommandBufferBeginInfo structure",
			"{@code commandBuffer} $mustnot be in the recording state",
			"{@code commandBuffer} $mustnot currently be pending execution",
			"""
			If {@code commandBuffer} was allocated from a {@code VkCommandPool} which did not have the #COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT flag set,
			{@code commandBuffer} $must be in the initial state.
			""",
			"""
			If {@code commandBuffer} is a secondary command buffer, the {@code pInheritanceInfo} member of {@code pBeginInfo} $must be a valid
			##VkCommandBufferInheritanceInfo structure
			""",
			"""
			If {@code commandBuffer} is a secondary command buffer and either the {@code occlusionQueryEnable} member of the {@code pInheritanceInfo} member of
			{@code pBeginInfo} is #FALSE, or the precise occlusion queries feature is not enabled, the {@code queryFlags} member of the
			{@code pInheritanceInfo} member {@code pBeginInfo} $mustnot contain #QUERY_CONTROL_PRECISE_BIT
			"""
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkBindBufferMemory =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code buffer} $must be a valid {@code VkBuffer} handle",
			"{@code memory} $must be a valid {@code VkDeviceMemory} handle",
			"{@code buffer} $must have been created, allocated, or retrieved from {@code device}",
			"{@code memory} $must have been created, allocated, or retrieved from {@code device}",
			"{@code buffer} $mustnot already be backed by a memory object",
			"{@code buffer} $mustnot have been created with any sparse memory binding flags",
			"{@code memoryOffset} $must be less than the size of {@code memory}",
			"""
			If {@code buffer} was created with the #BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT or #BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT, {@code memoryOffset} $must
			be a multiple of ##VkPhysicalDeviceLimits{@code ::minTexelBufferOffsetAlignment}
			""",
			"""
			If {@code buffer} was created with the #BUFFER_USAGE_UNIFORM_BUFFER_BIT, {@code memoryOffset} $must be a multiple of
			##VkPhysicalDeviceLimits{@code ::minUniformBufferOffsetAlignment}
			""",
			"""
			If {@code buffer} was created with the #BUFFER_USAGE_STORAGE_BUFFER_BIT, {@code memoryOffset} $must be a multiple of
			##VkPhysicalDeviceLimits{@code ::minStorageBufferOffsetAlignment}
			""",
			"""
			{@code memory} $must have been allocated using one of the memory types allowed in the {@code memoryTypeBits} member of the ##VkMemoryRequirements
			structure returned from a call to #GetBufferMemoryRequirements() with {@code buffer}
			""",
			"""
			{@code memoryOffset} $must be an integer multiple of the {@code alignment} member of the ##VkMemoryRequirements structure returned from a call to
			#GetBufferMemoryRequirements() with {@code buffer}
			""",
			"""
			The {@code size} member of the ##VkMemoryRequirements structure returned from a call to #GetBufferMemoryRequirements() with {@code buffer} $must be
			less than or equal to the size of {@code memory} minus {@code memoryOffset}
			""",
			"""
			If {@code buffer} was created with ##VkDedicatedAllocationBufferCreateInfoNV{@code ::dedicatedAllocation} equal to #TRUE, {@code memory} $must have
			been created with ##VkDedicatedAllocationMemoryAllocateInfoNV{@code ::buffer} equal to {@code buffer} and {@code memoryOffset} $must be zero.
			""",
			"""
			If {@code buffer} was not created with ##VkDedicatedAllocationBufferCreateInfoNV{@code ::dedicatedAllocation} equal to #TRUE, {@code memory} $must
			not have been allocated dedicated for a specific buffer or image
			"""
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code buffer} $must be externally synchronized"
		)}"""

@JvmField val vkBindImageMemory =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code image} $must be a valid {@code VkImage} handle",
			"{@code memory} $must be a valid {@code VkDeviceMemory} handle",
			"{@code image} $must have been created, allocated, or retrieved from {@code device}",
			"{@code memory} $must have been created, allocated, or retrieved from {@code device}",
			"{@code image} $mustnot already be backed by a memory object",
			"{@code image} $mustnot have been created with any sparse memory binding flags",
			"{@code memoryOffset} $must be less than the size of {@code memory}",
			"""
			{@code memory} $must have been allocated using one of the memory types allowed in the {@code memoryTypeBits} member of the ##VkMemoryRequirements
			structure returned from a call to #GetImageMemoryRequirements() with {@code image}
			""",
			"""
			{@code memoryOffset} $must be an integer multiple of the {@code alignment} member of the ##VkMemoryRequirements structure returned from a call to
			#GetImageMemoryRequirements() with {@code image}
			""",
			"""
			The {@code size} member of the ##VkMemoryRequirements structure returned from a call to #GetImageMemoryRequirements() with {@code image} $must be
			less than or equal to the size of {@code memory} minus {@code memoryOffset}
			""",
			"""
			If {@code image} was created with ##VkDedicatedAllocationImageCreateInfoNV{@code ::dedicatedAllocation} equal to #TRUE, {@code memory} $must have
			been created with ##VkDedicatedAllocationMemoryAllocateInfoNV{@code ::image} equal to {@code image} and {@code memoryOffset} $must be zero.
			""",
			"""
			If {@code image} was not created with ##VkDedicatedAllocationImageCreateInfoNV{@code ::dedicatedAllocation} equal to #TRUE, {@code memory} $must
			not have been allocated dedicated for a specific buffer or image
			"""
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code image} $must be externally synchronized"
		)}"""

@JvmField val vkCmdBeginQuery =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code queryPool} $must be a valid {@code VkQueryPool} handle",
			"{@code flags} $must be a valid combination of {@code VkQueryControlFlagBits} values",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics, or compute operations",
			"Both of {@code commandBuffer}, and {@code queryPool} $must have been created, allocated, or retrieved from the same {@code VkDevice}",
			"The query identified by {@code queryPool} and {@code query} $must currently not be active",
			"The query identified by {@code queryPool} and {@code query} $must be unavailable",
			"""
			If the precise occlusion queries feature is not enabled, or the {@code queryType} used to create {@code queryPool} was not #QUERY_TYPE_OCCLUSION,
			{@code flags} $mustnot contain #QUERY_CONTROL_PRECISE_BIT
			""",
			"""
			{@code queryPool} $must have been created with a {@code queryType} that differs from that of any other queries that have been made active, and are
			currently still active within {@code commandBuffer}
			""",
			"{@code query} $must be less than the number of queries in {@code queryPool}",
			"""
			If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_OCCLUSION, the {@code VkCommandPool} that {@code commandBuffer} was
			allocated from $must support graphics operations
			""",
			"""
			If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_PIPELINE_STATISTICS and any of the {@code pipelineStatistics} indicate
			graphics operations, the {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations
			""",
			"""
			If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_PIPELINE_STATISTICS and any of the {@code pipelineStatistics} indicate
			compute operations, the {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support compute operations
			"""
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdBeginRenderPass =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code pRenderPassBegin} $must be a pointer to a valid ##VkRenderPassBeginInfo structure",
			"{@code contents} $must be a valid {@code VkSubpassContents} value",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"This command $must only be called outside of a render pass instance",
			"{@code commandBuffer} $must be a primary {@code VkCommandBuffer}",
			"""
			If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the
			##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin}
			is #IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL then the corresponding attachment image subresource of the framebuffer specified in the
			{@code framebuffer} member of {@code pRenderPassBegin} $must have been created with #IMAGE_USAGE_COLOR_ATTACHMENT_BIT set
			""",
			"""
			If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the
			##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin}
			is #IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL or #IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL then the corresponding attachment image
			subresource of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} $must have been created with
			#IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT set
			""",
			"""
			If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the
			##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin}
			is #IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL then the corresponding attachment image subresource of the framebuffer specified in the
			{@code framebuffer} member of {@code pRenderPassBegin} $must have been created with #IMAGE_USAGE_SAMPLED_BIT or #IMAGE_USAGE_INPUT_ATTACHMENT_BIT
			set
			""",
			"""
			If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the
			##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin}
			is #IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL then the corresponding attachment image subresource of the framebuffer specified in the {@code framebuffer}
			member of {@code pRenderPassBegin} $must have been created with #IMAGE_USAGE_TRANSFER_SRC_BIT set
			""",
			"""
			If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the
			##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin}
			is #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL then the corresponding attachment image subresource of the framebuffer specified in the {@code framebuffer}
			member of {@code pRenderPassBegin} $must have been created with #IMAGE_USAGE_TRANSFER_DST_BIT set
			""",
			"""
			If any of the {@code initialLayout} members of the ##VkAttachmentDescription structures specified when creating the render pass specified in the
			{@code renderPass} member of {@code pRenderPassBegin} is not #IMAGE_LAYOUT_UNDEFINED, then each such {@code initialLayout} $must be equal to the
			current layout of the corresponding attachment image subresource of the framebuffer specified in the {@code framebuffer} member of
			{@code pRenderPassBegin}.
			"""
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdBindDescriptorSets =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code pipelineBindPoint} $must be a valid {@code VkPipelineBindPoint} value",
			"{@code layout} $must be a valid {@code VkPipelineLayout} handle",
			"{@code pDescriptorSets} $must be a pointer to an array of {@code descriptorSetCount} valid {@code VkDescriptorSet} handles",
			"""
			If {@code dynamicOffsetCount} is not 0, {@code pDynamicOffsets} $must be a pointer to an array of {@code dynamicOffsetCount} {@code uint32_t}
			values
			""",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics, or compute operations",
			"{@code descriptorSetCount} $must be greater than 0",
			"""
			Each of {@code commandBuffer}, {@code layout}, and the elements of {@code pDescriptorSets} $must have been created, allocated, or retrieved from
			the same {@code VkDevice}
			""",
			"""
			Any given element of {@code pDescriptorSets} $must have been allocated with a {@code VkDescriptorSetLayout} that matches (is the same as, or
			defined identically to) the {@code VkDescriptorSetLayout} at set {@code n} in {@code layout}, where {@code n} is the sum of {@code firstSet} and
			the index into {@code pDescriptorSets}
			""",
			"{@code dynamicOffsetCount} $must be equal to the total number of dynamic descriptors in {@code pDescriptorSets}",
			"""
			The sum of {@code firstSet} and {@code descriptorSetCount} $must be less than or equal to ##VkPipelineLayoutCreateInfo{@code ::setLayoutCount}
			provided when {@code layout} was created
			""",
			"{@code pipelineBindPoint} $must be supported by the {@code commandBuffer}'s parent {@code VkCommandPool}'s queue family",
			"Any given element of {@code pDynamicOffsets} $must satisfy the required alignment for the corresponding descriptor binding's descriptor type"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdBindIndexBuffer =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code buffer} $must be a valid {@code VkBuffer} handle",
			"{@code indexType} $must be a valid {@code VkIndexType} value",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"Both of {@code buffer}, and {@code commandBuffer} $must have been created, allocated, or retrieved from the same {@code VkDevice}",
			"{@code offset} $must be less than the size of {@code buffer}",
			"""
			The sum of {@code offset} and the address of the range of {@code VkDeviceMemory} object that is backing {@code buffer}, $must be a multiple of the
			type indicated by {@code indexType}
			""",
			"{@code buffer} $must have been created with the #BUFFER_USAGE_INDEX_BUFFER_BIT flag"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdBindPipeline =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code pipelineBindPoint} $must be a valid {@code VkPipelineBindPoint} value",
			"{@code pipeline} $must be a valid {@code VkPipeline} handle",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics, or compute operations",
			"Both of {@code commandBuffer}, and {@code pipeline} $must have been created, allocated, or retrieved from the same {@code VkDevice}",
			"""
			If {@code pipelineBindPoint} is #PIPELINE_BIND_POINT_COMPUTE, the {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support
			compute operations
			""",
			"""
			If {@code pipelineBindPoint} is #PIPELINE_BIND_POINT_GRAPHICS, the {@code VkCommandPool} that {@code commandBuffer} was allocated from $must
			support graphics operations
			""",
			"If {@code pipelineBindPoint} is #PIPELINE_BIND_POINT_COMPUTE, {@code pipeline} $must be a compute pipeline",
			"If {@code pipelineBindPoint} is #PIPELINE_BIND_POINT_GRAPHICS, {@code pipeline} $must be a graphics pipeline",
			"""
			If the variable multisample rate feature is not supported, {@code pipeline} is a graphics pipeline, the current subpass has no attachments, and
			this is not the first call to this function with a graphics pipeline after transitioning to the current subpass, then the sample count specified by
			this pipeline $must match that set in the previous pipeline
			"""
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdBindVertexBuffers =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code pBuffers} $must be a pointer to an array of {@code bindingCount} valid {@code VkBuffer} handles",
			"{@code pOffsets} $must be a pointer to an array of {@code bindingCount} {@code VkDeviceSize} values",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"{@code bindingCount} $must be greater than 0",
			"""
			Both of {@code commandBuffer}, and the elements of {@code pBuffers} $must have been created, allocated, or retrieved from the same {@code VkDevice}
			""",
			"{@code firstBinding} $must be less than ##VkPhysicalDeviceLimits{@code ::maxVertexInputBindings}",
			"The sum of {@code firstBinding} and {@code bindingCount} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxVertexInputBindings}",
			"All elements of {@code pOffsets} $must be less than the size of the corresponding element in {@code pBuffers}",
			"All elements of {@code pBuffers} $must have been created with the #BUFFER_USAGE_VERTEX_BUFFER_BIT flag"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdBlitImage =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code srcImage} $must be a valid {@code VkImage} handle",
			"{@code srcImageLayout} $must be a valid {@code VkImageLayout} value",
			"{@code dstImage} $must be a valid {@code VkImage} handle",
			"{@code dstImageLayout} $must be a valid {@code VkImageLayout} value",
			"{@code pRegions} $must be a pointer to an array of {@code regionCount} valid ##VkImageBlit structures",
			"{@code filter} $must be a valid {@code VkFilter} value",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"This command $must only be called outside of a render pass instance",
			"{@code regionCount} $must be greater than 0",
			"""
			Each of {@code commandBuffer}, {@code dstImage}, and {@code srcImage} $must have been created, allocated, or retrieved from the same
			{@code VkDevice}
			""",
			"The source region specified by a given element of {@code pRegions} $must be a region that is contained within {@code srcImage}",
			"The destination region specified by a given element of {@code pRegions} $must be a region that is contained within {@code dstImage}",
			"""
			The union of all destination regions, specified by the elements of {@code pRegions}, $mustnot overlap in memory with any texel that $may be sampled
			during the blit operation
			""",
			"""
			{@code srcImage} $must use a format that supports #FORMAT_FEATURE_BLIT_SRC_BIT, which is indicated by
			##VkFormatProperties{@code ::linearTilingFeatures} (for linear tiled images) or ##VkFormatProperties{@code ::optimalTilingFeatures} (for optimally
			tiled images) - as returned by #GetPhysicalDeviceFormatProperties()
			""",
			"{@code srcImage} $must have been created with #IMAGE_USAGE_TRANSFER_SRC_BIT usage flag",
			"""
			{@code srcImageLayout} $must specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this
			command is executed on a {@code VkDevice}
			""",
			"{@code srcImageLayout} $must be either of #IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL or #IMAGE_LAYOUT_GENERAL",
			"""
			{@code dstImage} $must use a format that supports #FORMAT_FEATURE_BLIT_DST_BIT, which is indicated by
			##VkFormatProperties{@code ::linearTilingFeatures} (for linear tiled images) or ##VkFormatProperties{@code ::optimalTilingFeatures} (for optimally
			tiled images) - as returned by #GetPhysicalDeviceFormatProperties()
			""",
			"{@code dstImage} $must have been created with #IMAGE_USAGE_TRANSFER_DST_BIT usage flag",
			"""
			{@code dstImageLayout} $must specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this
			command is executed on a {@code VkDevice}
			""",
			"{@code dstImageLayout} $must be either of #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL or #IMAGE_LAYOUT_GENERAL",
			"The sample count of {@code srcImage} and {@code dstImage} $must both be equal to #SAMPLE_COUNT_1_BIT",
			"""
			If either of {@code srcImage} or {@code dstImage} was created with a signed integer {@code VkFormat}, the other $must also have been created with a
			signed integer {@code VkFormat}
			""",
			"""
			If either of {@code srcImage} or {@code dstImage} was created with an unsigned integer {@code VkFormat}, the other $must also have been created
			with an unsigned integer {@code VkFormat}
			""",
			"If either of {@code srcImage} or {@code dstImage} was created with a depth/stencil format, the other $must have exactly the same format",
			"If {@code srcImage} was created with a depth/stencil format, {@code filter} $must be #FILTER_NEAREST",
			"{@code srcImage} $must have been created with a {@code samples} value of #SAMPLE_COUNT_1_BIT",
			"{@code dstImage} $must have been created with a {@code samples} value of #SAMPLE_COUNT_1_BIT",
			"""
			If {@code filter} is #FILTER_LINEAR, {@code srcImage} $must be of a format which supports linear filtering, as specified by the
			#FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or
			##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()
			""",
			"""
			If {@code filter} is #FILTER_CUBIC_IMG, {@code srcImage} $must be of a format which supports cubic filtering, as specified by the
			#FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or
			##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()
			""",
			"If {@code filter} is #FILTER_CUBIC_IMG, {@code srcImage} $must have a {@code VkImageType} of #IMAGE_TYPE_3D"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdClearAttachments =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code pAttachments} $must be a pointer to an array of {@code attachmentCount} valid ##VkClearAttachment structures",
			"{@code pRects} $must be a pointer to an array of {@code rectCount} ##VkClearRect structures",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"This command $must only be called inside of a render pass instance",
			"{@code attachmentCount} $must be greater than 0",
			"{@code rectCount} $must be greater than 0",
			"""
			If the {@code aspectMask} member of any given element of {@code pAttachments} contains #IMAGE_ASPECT_COLOR_BIT, the {@code colorAttachment} member
			of those elements $must refer to a valid color attachment in the current subpass
			""",
			"""
			The rectangular region specified by a given element of {@code pRects} $must be contained within the render area of the current render pass instance
			""",
			"The layers specified by a given element of {@code pRects} $must be contained within every attachment that {@code pAttachments} refers to"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdClearColorImage =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code image} $must be a valid {@code VkImage} handle",
			"{@code imageLayout} $must be a valid {@code VkImageLayout} value",
			"{@code pColor} $must be a pointer to a valid {@code VkClearColorValue} union",
			"{@code pRanges} $must be a pointer to an array of {@code rangeCount} valid ##VkImageSubresourceRange structures",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics, or compute operations",
			"This command $must only be called outside of a render pass instance",
			"{@code rangeCount} $must be greater than 0",
			"Both of {@code commandBuffer}, and {@code image} $must have been created, allocated, or retrieved from the same {@code VkDevice}",
			"{@code image} $must have been created with #IMAGE_USAGE_TRANSFER_DST_BIT usage flag",
			"""
			{@code imageLayout} $must specify the layout of the image subresource ranges of {@code image} specified in {@code pRanges} at the time this command
			is executed on a {@code VkDevice}
			""",
			"{@code imageLayout} $must be either of #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL or #IMAGE_LAYOUT_GENERAL",
			"The image range of any given element of {@code pRanges} $must be an image subresource range that is contained within {@code image}",
			"{@code image} $mustnot have a compressed or depth/stencil format"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdClearDepthStencilImage =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code image} $must be a valid {@code VkImage} handle",
			"{@code imageLayout} $must be a valid {@code VkImageLayout} value",
			"{@code pDepthStencil} $must be a pointer to a valid ##VkClearDepthStencilValue structure",
			"{@code pRanges} $must be a pointer to an array of {@code rangeCount} valid ##VkImageSubresourceRange structures",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"This command $must only be called outside of a render pass instance",
			"{@code rangeCount} $must be greater than 0",
			"Both of {@code commandBuffer}, and {@code image} $must have been created, allocated, or retrieved from the same {@code VkDevice}",
			"{@code image} $must have been created with #IMAGE_USAGE_TRANSFER_DST_BIT usage flag",
			"""
			{@code imageLayout} $must specify the layout of the image subresource ranges of {@code image} specified in {@code pRanges} at the time this command
			is executed on a {@code VkDevice}
			""",
			"{@code imageLayout} $must be either of #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL or #IMAGE_LAYOUT_GENERAL",
			"The image range of any given element of {@code pRanges} $must be an image subresource range that is contained within {@code image}",
			"{@code image} $must have a depth/stencil format"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdCopyBuffer =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code srcBuffer} $must be a valid {@code VkBuffer} handle",
			"{@code dstBuffer} $must be a valid {@code VkBuffer} handle",
			"{@code pRegions} $must be a pointer to an array of {@code regionCount} ##VkBufferCopy structures",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support transfer, graphics, or compute operations",
			"This command $must only be called outside of a render pass instance",
			"{@code regionCount} $must be greater than 0",
			"""
			Each of {@code commandBuffer}, {@code dstBuffer}, and {@code srcBuffer} $must have been created, allocated, or retrieved from the same
			{@code VkDevice}
			""",
			"The {@code size} member of a given element of {@code pRegions} $must be greater than 0",
			"The {@code srcOffset} member of a given element of {@code pRegions} $must be less than the size of {@code srcBuffer}",
			"The {@code dstOffset} member of a given element of {@code pRegions} $must be less than the size of {@code dstBuffer}",
			"""
			The {@code size} member of a given element of {@code pRegions} $must be less than or equal to the size of {@code srcBuffer} minus {@code srcOffset}
			""",
			"""
			The {@code size} member of a given element of {@code pRegions} $must be less than or equal to the size of {@code dstBuffer} minus {@code dstOffset}
			""",
			"""
			The union of the source regions, and the union of the destination regions, specified by the elements of {@code pRegions}, $mustnot overlap in
			memory
			""",
			"{@code srcBuffer} $must have been created with #BUFFER_USAGE_TRANSFER_SRC_BIT usage flag",
			"{@code dstBuffer} $must have been created with #BUFFER_USAGE_TRANSFER_DST_BIT usage flag"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdCopyBufferToImage =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code srcBuffer} $must be a valid {@code VkBuffer} handle",
			"{@code dstImage} $must be a valid {@code VkImage} handle",
			"{@code dstImageLayout} $must be a valid {@code VkImageLayout} value",
			"{@code pRegions} $must be a pointer to an array of {@code regionCount} valid ##VkBufferImageCopy structures",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support transfer, graphics, or compute operations",
			"This command $must only be called outside of a render pass instance",
			"{@code regionCount} $must be greater than 0",
			"""
			Each of {@code commandBuffer}, {@code dstImage}, and {@code srcBuffer} $must have been created, allocated, or retrieved from the same
			{@code VkDevice}
			""",
			"The buffer region specified by a given element of {@code pRegions} $must be a region that is contained within {@code srcBuffer}",
			"The image region specified by a given element of {@code pRegions} $must be a region that is contained within {@code dstImage}",
			"""
			The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, $mustnot overlap in
			memory
			""",
			"{@code srcBuffer} $must have been created with #BUFFER_USAGE_TRANSFER_SRC_BIT usage flag",
			"{@code dstImage} $must have been created with #IMAGE_USAGE_TRANSFER_DST_BIT usage flag",
			"{@code dstImage} $must have a sample count equal to #SAMPLE_COUNT_1_BIT",
			"""
			{@code dstImageLayout} $must specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this
			command is executed on a {@code VkDevice}
			""",
			"{@code dstImageLayout} $must be either of #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL or #IMAGE_LAYOUT_GENERAL"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdCopyImage =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code srcImage} $must be a valid {@code VkImage} handle",
			"{@code srcImageLayout} $must be a valid {@code VkImageLayout} value",
			"{@code dstImage} $must be a valid {@code VkImage} handle",
			"{@code dstImageLayout} $must be a valid {@code VkImageLayout} value",
			"{@code pRegions} $must be a pointer to an array of {@code regionCount} valid ##VkImageCopy structures",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support transfer, graphics, or compute operations",
			"This command $must only be called outside of a render pass instance",
			"{@code regionCount} $must be greater than 0",
			"""
			Each of {@code commandBuffer}, {@code dstImage}, and {@code srcImage} $must have been created, allocated, or retrieved from the same
			{@code VkDevice}
			""",
			"The source region specified by a given element of {@code pRegions} $must be a region that is contained within {@code srcImage}",
			"The destination region specified by a given element of {@code pRegions} $must be a region that is contained within {@code dstImage}",
			"""
			The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, $mustnot overlap in
			memory
			""",
			"{@code srcImage} $must have been created with #IMAGE_USAGE_TRANSFER_SRC_BIT usage flag",
			"""
			{@code srcImageLayout} $must specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this
			command is executed on a {@code VkDevice}
			""",
			"{@code srcImageLayout} $must be either of #IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL or #IMAGE_LAYOUT_GENERAL",
			"{@code dstImage} $must have been created with #IMAGE_USAGE_TRANSFER_DST_BIT usage flag",
			"""
			{@code dstImageLayout} $must specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this
			command is executed on a {@code VkDevice}
			""",
			"{@code dstImageLayout} $must be either of #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL or #IMAGE_LAYOUT_GENERAL",
			"The {@code VkFormat} of each of {@code srcImage} and {@code dstImage} $must be compatible, as defined below",
			"The sample count of {@code srcImage} and {@code dstImage} $must match"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdCopyImageToBuffer =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code srcImage} $must be a valid {@code VkImage} handle",
			"{@code srcImageLayout} $must be a valid {@code VkImageLayout} value",
			"{@code dstBuffer} $must be a valid {@code VkBuffer} handle",
			"{@code pRegions} $must be a pointer to an array of {@code regionCount} valid ##VkBufferImageCopy structures",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support transfer, graphics, or compute operations",
			"This command $must only be called outside of a render pass instance",
			"{@code regionCount} $must be greater than 0",
			"""
			Each of {@code commandBuffer}, {@code dstBuffer}, and {@code srcImage} $must have been created, allocated, or retrieved from the same
			{@code VkDevice}
			""",
			"The image region specified by a given element of {@code pRegions} $must be a region that is contained within {@code srcImage}",
			"The buffer region specified by a given element of {@code pRegions} $must be a region that is contained within {@code dstBuffer}",
			"""
			The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, $mustnot overlap in
			memory
			""",
			"{@code srcImage} $must have been created with #IMAGE_USAGE_TRANSFER_SRC_BIT usage flag",
			"{@code srcImage} $must have a sample count equal to #SAMPLE_COUNT_1_BIT",
			"""
			{@code srcImageLayout} $must specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this
			command is executed on a {@code VkDevice}
			""",
			"{@code srcImageLayout} $must be either of #IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL or #IMAGE_LAYOUT_GENERAL",
			"{@code dstBuffer} $must have been created with #BUFFER_USAGE_TRANSFER_DST_BIT usage flag"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdCopyQueryPoolResults =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code queryPool} $must be a valid {@code VkQueryPool} handle",
			"{@code dstBuffer} $must be a valid {@code VkBuffer} handle",
			"{@code flags} $must be a valid combination of {@code VkQueryResultFlagBits} values",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics, or compute operations",
			"This command $must only be called outside of a render pass instance",
			"""
			Each of {@code commandBuffer}, {@code dstBuffer}, and {@code queryPool} $must have been created, allocated, or retrieved from the same
			{@code VkDevice}
			""",
			"{@code dstOffset} $must be less than the size of {@code dstBuffer}",
			"{@code firstQuery} $must be less than the number of queries in {@code queryPool}",
			"The sum of {@code firstQuery} and {@code queryCount} $must be less than or equal to the number of queries in {@code queryPool}",
			"If #QUERY_RESULT_64_BIT is not set in {@code flags} then {@code dstOffset} and {@code stride} $must be multiples of 4",
			"If #QUERY_RESULT_64_BIT is set in {@code flags} then {@code dstOffset} and {@code stride} $must be multiples of 8",
			"{@code dstBuffer} $must have enough storage, from {@code dstOffset}, to contain the result of each query, as described here",
			"{@code dstBuffer} $must have been created with #BUFFER_USAGE_TRANSFER_DST_BIT usage flag",
			"If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_TIMESTAMP, {@code flags} $mustnot contain #QUERY_RESULT_PARTIAL_BIT"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdDebugMarkerBeginEXT =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code pMarkerInfo} $must be a pointer to a ##VkDebugMarkerMarkerInfoEXT structure",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics, or compute operations"
		)}"""

@JvmField val vkCmdDebugMarkerEndEXT =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics, or compute operations",
			"""
			There $must be an outstanding #CmdDebugMarkerBeginEXT() command prior to the #CmdDebugMarkerEndEXT() on the queue that {@code commandBuffer} is
			submitted to.
			""",
			"""
			If the matching #CmdDebugMarkerBeginEXT() command was in a secondary command buffer, the #CmdDebugMarkerEndEXT() must be in the same
			{@code commandBuffer}.
			"""
		)}"""

@JvmField val vkCmdDebugMarkerInsertEXT =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code pMarkerInfo} $must be a pointer to a ##VkDebugMarkerMarkerInfoEXT structure",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics, or compute operations"
		)}"""

@JvmField val vkCmdDispatch =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support compute operations",
			"This command $must only be called outside of a render pass instance",
			"{@code x} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[0]",
			"{@code y} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[1]",
			"{@code z} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxComputeWorkGroupCount}[2]",
			"""
			For each set {@code n} that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_COMPUTE, a descriptor set $must
			have been bound to {@code n} at #PIPELINE_BIND_POINT_COMPUTE, with a {@code VkPipelineLayout} that is compatible for set {@code n}, with the
			{@code VkPipelineLayout} used to create the current {@code VkPipeline}
			""",
			"""
			Descriptors in each bound descriptor set, specified via #CmdBindDescriptorSets(), $must be valid if they are statically used by the currently bound
			{@code VkPipeline} object, specified via #CmdBindPipeline()
			""",
			"A valid compute pipeline $must be bound to the current command buffer with #PIPELINE_BIND_POINT_COMPUTE",
			"""
			For each push constant that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_COMPUTE, a push constant value
			$must have been set for #PIPELINE_BIND_POINT_COMPUTE, with a {@code VkPipelineLayout} that is compatible for push constants with the one used to
			create the current {@code VkPipeline}
			""",
			"""
			If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_COMPUTE uses
			unnormalized coordinates, it $mustnot be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D,
			#IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage
			""",
			"""
			If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_COMPUTE uses
			unnormalized coordinates, it $mustnot be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with
			{@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage
			""",
			"""
			If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_COMPUTE uses
			unnormalized coordinates, it $mustnot be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that
			includes a lod bias or any offset values, in any shader stage
			""",
			"""
			If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
			#PIPELINE_BIND_POINT_COMPUTE accesses a uniform buffer, it $mustnot access values outside of the range of that buffer specified in the currently
			bound descriptor set
			""",
			"""
			If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
			#PIPELINE_BIND_POINT_COMPUTE accesses a storage buffer, it $mustnot access values outside of the range of that buffer specified in the currently
			bound descriptor set
			""",
			"""
			Any {@code VkImageView} being sampled with #FILTER_LINEAR as a result of this command $must be of a format which supports linear filtering, as
			specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or
			##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()
			""",
			"""
			Any {@code VkImageView} being sampled with #FILTER_CUBIC_IMG as a result of this command $must be of a format which supports cubic filtering, as
			specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image)
			or ##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()
			""",
			"""
			Any {@code VkImageView} being sampled with #FILTER_CUBIC_IMG as a result of this command $mustnot have a {@code VkImageViewType} of
			#IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, or #IMAGE_VIEW_TYPE_CUBE_ARRAY
			"""
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdDispatchIndirect =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code buffer} $must be a valid {@code VkBuffer} handle",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support compute operations",
			"This command $must only be called outside of a render pass instance",
			"Both of {@code buffer}, and {@code commandBuffer} $must have been created, allocated, or retrieved from the same {@code VkDevice}",
			"""
			For each set {@code n} that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_COMPUTE, a descriptor set $must
			have been bound to {@code n} at #PIPELINE_BIND_POINT_COMPUTE, with a {@code VkPipelineLayout} that is compatible for set {@code n}, with the
			{@code VkPipelineLayout} used to create the current {@code VkPipeline}
			""",
			"""
			Descriptors in each bound descriptor set, specified via #CmdBindDescriptorSets(), $must be valid if they are statically used by the currently bound
			{@code VkPipeline} object, specified via #CmdBindPipeline()
			""",
			"A valid compute pipeline $must be bound to the current command buffer with #PIPELINE_BIND_POINT_COMPUTE",
			"{@code buffer} $must have been created with the #BUFFER_USAGE_INDIRECT_BUFFER_BIT bit set",
			"{@code offset} $must be a multiple of 4",
			"The sum of {@code offset} and the size of {@code VkDispatchIndirectCommand} $must be less than or equal to the size of {@code buffer}",
			"""
			For each push constant that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_COMPUTE, a push constant value
			$must have been set for #PIPELINE_BIND_POINT_COMPUTE, with a {@code VkPipelineLayout} that is compatible for push constants with the one used to
			create the current {@code VkPipeline}
			""",
			"""
			If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_COMPUTE uses
			unnormalized coordinates, it $mustnot be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D,
			#IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage
			""",
			"""
			If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_COMPUTE uses
			unnormalized coordinates, it $mustnot be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with
			{@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage
			""",
			"""
			If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_COMPUTE uses
			unnormalized coordinates, it $mustnot be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that
			includes a lod bias or any offset values, in any shader stage
			""",
			"""
			If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
			#PIPELINE_BIND_POINT_COMPUTE accesses a uniform buffer, it $mustnot access values outside of the range of that buffer specified in the currently
			bound descriptor set
			""",
			"""
			If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
			#PIPELINE_BIND_POINT_COMPUTE accesses a storage buffer, it $mustnot access values outside of the range of that buffer specified in the currently
			bound descriptor set
			""",
			"""
			Any {@code VkImageView} being sampled with #FILTER_LINEAR as a result of this command $must be of a format which supports linear filtering, as
			specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or
			##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()
			""",
			"""
			Any {@code VkImageView} being sampled with #FILTER_CUBIC_IMG as a result of this command $must be of a format which supports cubic filtering, as
			specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image)
			or ##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()
			""",
			"""
			Any {@code VkImageView} being sampled with #FILTER_CUBIC_IMG as a result of this command $mustnot have a {@code VkImageViewType} of
			#IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, or #IMAGE_VIEW_TYPE_CUBE_ARRAY
			"""
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdDraw =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"This command $must only be called inside of a render pass instance",
			"""
			For each set {@code n} that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS, a descriptor set $must
			have been bound to {@code n} at #PIPELINE_BIND_POINT_GRAPHICS, with a {@code VkPipelineLayout} that is compatible for set {@code n}, with the
			{@code VkPipelineLayout} used to create the current {@code VkPipeline}
			""",
			"""
			For each push constant that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS, a push constant value
			$must have been set for #PIPELINE_BIND_POINT_GRAPHICS, with a {@code VkPipelineLayout} that is compatible for push constants, with the
			{@code VkPipelineLayout} used to create the current {@code VkPipeline}
			""",
			"""
			Descriptors in each bound descriptor set, specified via #CmdBindDescriptorSets(), $must be valid if they are statically used by the currently bound
			{@code VkPipeline} object, specified via #CmdBindPipeline()
			""",
			"""
			All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point's interface $must have valid buffers bound
			""",
			"For a given vertex buffer binding, any attribute data fetched $must be entirely contained within the corresponding vertex buffer binding",
			"A valid graphics pipeline $must be bound to the current command buffer with #PIPELINE_BIND_POINT_GRAPHICS",
			"""
			If the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_GRAPHICS requires any dynamic state, that state $must have been set on the
			current command buffer
			""",
			"Every input attachment used by the current subpass $must be bound to the pipeline via a descriptor set",
			"""
			If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses
			unnormalized coordinates, it $mustnot be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D,
			#IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage
			""",
			"""
			If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses
			unnormalized coordinates, it $mustnot be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with
			{@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage
			""",
			"""
			If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses
			unnormalized coordinates, it $mustnot be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that
			includes a lod bias or any offset values, in any shader stage
			""",
			"""
			If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
			#PIPELINE_BIND_POINT_GRAPHICS accesses a uniform buffer, it $mustnot access values outside of the range of that buffer specified in the currently
			bound descriptor set
			""",
			"""
			If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
			#PIPELINE_BIND_POINT_GRAPHICS accesses a storage buffer, it $mustnot access values outside of the range of that buffer specified in the currently
			bound descriptor set
			""",
			"""
			Any {@code VkImageView} being sampled with #FILTER_LINEAR as a result of this command $must be of a format which supports linear filtering, as
			specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or
			##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()
			""",
			"""
			Any {@code VkImageView} being sampled with #FILTER_CUBIC_IMG as a result of this command $must be of a format which supports cubic filtering, as
			specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image)
			or ##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()
			""",
			"""
			Any {@code VkImageView} being sampled with #FILTER_CUBIC_IMG as a result of this command $mustnot have a {@code VkImageViewType} of
			#IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, or #IMAGE_VIEW_TYPE_CUBE_ARRAY
			"""
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdDrawIndexed =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"This command $must only be called inside of a render pass instance",
			"""
			For each set {@code n} that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS, a descriptor set $must
			have been bound to {@code n} at #PIPELINE_BIND_POINT_GRAPHICS, with a {@code VkPipelineLayout} that is compatible for set {@code n}, with the
			{@code VkPipelineLayout} used to create the current {@code VkPipeline}
			""",
			"""
			For each push constant that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS, a push constant value
			$must have been set for #PIPELINE_BIND_POINT_GRAPHICS, with a {@code VkPipelineLayout} that is compatible for push constants, with the
			{@code VkPipelineLayout} used to create the current {@code VkPipeline}
			""",
			"""
			Descriptors in each bound descriptor set, specified via #CmdBindDescriptorSets(), $must be valid if they are statically used by the currently bound
			{@code VkPipeline} object, specified via #CmdBindPipeline()
			""",
			"""
			All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point's interface $must have valid buffers bound
			""",
			"For a given vertex buffer binding, any attribute data fetched $must be entirely contained within the corresponding vertex buffer binding",
			"A valid graphics pipeline $must be bound to the current command buffer with #PIPELINE_BIND_POINT_GRAPHICS",
			"""
			If the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_GRAPHICS requires any dynamic state, that state $must have been set on the
			current command buffer
			""",
			"""
			({@code indexSize} * ({@code firstIndex} + {@code indexCount}) + {@code offset}) $must be less than or equal to the size of the currently bound
			index buffer, with indexSize being based on the type specified by {@code indexType}, where the index buffer, {@code indexType}, and {@code offset}
			are specified via #CmdBindIndexBuffer()
			""",
			"Every input attachment used by the current subpass $must be bound to the pipeline via a descriptor set",
			"""
			If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses
			unnormalized coordinates, it $mustnot be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D,
			#IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage
			""",
			"""
			If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses
			unnormalized coordinates, it $mustnot be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with
			{@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage
			""",
			"""
			If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses
			unnormalized coordinates, it $mustnot be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that
			includes a lod bias or any offset values, in any shader stage
			""",
			"""
			If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
			#PIPELINE_BIND_POINT_GRAPHICS accesses a uniform buffer, it $mustnot access values outside of the range of that buffer specified in the currently
			bound descriptor set
			""",
			"""
			If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
			#PIPELINE_BIND_POINT_GRAPHICS accesses a storage buffer, it $mustnot access values outside of the range of that buffer specified in the currently
			bound descriptor set
			""",
			"""
			Any {@code VkImageView} being sampled with #FILTER_LINEAR as a result of this command $must be of a format which supports linear filtering, as
			specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or
			##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()
			""",
			"""
			Any {@code VkImageView} being sampled with #FILTER_CUBIC_IMG as a result of this command $must be of a format which supports cubic filtering, as
			specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image)
			or ##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()
			""",
			"""
			Any {@code VkImageView} being sampled with #FILTER_CUBIC_IMG as a result of this command $mustnot have a {@code VkImageViewType} of
			#IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, or #IMAGE_VIEW_TYPE_CUBE_ARRAY
			"""
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdDrawIndexedIndirect =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code buffer} $must be a valid {@code VkBuffer} handle",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"This command $must only be called inside of a render pass instance",
			"Both of {@code buffer}, and {@code commandBuffer} $must have been created, allocated, or retrieved from the same {@code VkDevice}",
			"{@code offset} $must be a multiple of 4",
			"""
			If {@code drawCount} is greater than 1, {@code stride} $must be a multiple of 4 and $must be greater than or equal to
			sizeof({@code VkDrawIndexedIndirectCommand})
			""",
			"If the multi-draw indirect feature is not enabled, {@code drawCount} $must be 0 or 1",
			"""
			If the drawIndirectFirstInstance feature is not enabled, all the {@code firstInstance} members of the ##VkDrawIndexedIndirectCommand structures
			accessed by this command $must be 0
			""",
			"""
			For each set {@code n} that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS, a descriptor set $must
			have been bound to {@code n} at #PIPELINE_BIND_POINT_GRAPHICS, with a {@code VkPipelineLayout} that is compatible for set {@code n}, with the
			{@code VkPipelineLayout} used to create the current {@code VkPipeline}
			""",
			"""
			For each push constant that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS, a push constant value
			$must have been set for #PIPELINE_BIND_POINT_GRAPHICS, with a {@code VkPipelineLayout} that is compatible for push constants, with the
			{@code VkPipelineLayout} used to create the current {@code VkPipeline}
			""",
			"""
			Descriptors in each bound descriptor set, specified via #CmdBindDescriptorSets(), $must be valid if they are statically used by the currently bound
			{@code VkPipeline} object, specified via #CmdBindPipeline()
			""",
			"""
			All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point's interface $must have valid buffers bound
			""",
			"A valid graphics pipeline $must be bound to the current command buffer with #PIPELINE_BIND_POINT_GRAPHICS",
			"""
			If the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_GRAPHICS requires any dynamic state, that state $must have been set on the
			current command buffer
			""",
			"""
			If {@code drawCount} is equal to 1, ({@code offset} + sizeof({@code VkDrawIndexedIndirectCommand})) $must be less than or equal to the size of
			{@code buffer}
			""",
			"""
			If {@code drawCount} is greater than 1, ({@code stride} x ({@code drawCount} - 1) + {@code offset} + sizeof({@code VkDrawIndexedIndirectCommand}))
			$must be less than or equal to the size of {@code buffer}
			""",
			"{@code drawCount} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxDrawIndirectCount}",
			"Every input attachment used by the current subpass $must be bound to the pipeline via a descriptor set",
			"""
			If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses
			unnormalized coordinates, it $mustnot be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D,
			#IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage
			""",
			"""
			If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses
			unnormalized coordinates, it $mustnot be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with
			{@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage
			""",
			"""
			If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses
			unnormalized coordinates, it $mustnot be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that
			includes a lod bias or any offset values, in any shader stage
			""",
			"""
			If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
			#PIPELINE_BIND_POINT_GRAPHICS accesses a uniform buffer, it $mustnot access values outside of the range of that buffer specified in the currently
			bound descriptor set
			""",
			"""
			If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
			#PIPELINE_BIND_POINT_GRAPHICS accesses a storage buffer, it $mustnot access values outside of the range of that buffer specified in the currently
			bound descriptor set
			""",
			"""
			Any {@code VkImageView} being sampled with #FILTER_LINEAR as a result of this command $must be of a format which supports linear filtering, as
			specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or
			##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()
			""",
			"""
			Any {@code VkImageView} being sampled with #FILTER_CUBIC_IMG as a result of this command $must be of a format which supports cubic filtering, as
			specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image)
			or ##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()
			""",
			"""
			Any {@code VkImageView} being sampled with #FILTER_CUBIC_IMG as a result of this command $mustnot have a {@code VkImageViewType} of
			#IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, or #IMAGE_VIEW_TYPE_CUBE_ARRAY
			"""
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdDrawIndexedIndirectCountAMD =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code buffer} $must be a valid {@code VkBuffer} handle",
			"{@code countBuffer} $must be a valid {@code VkBuffer} handle",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"This command $must only be called inside of a render pass instance",
			"""
			Each of {@code buffer}, {@code commandBuffer}, and {@code countBuffer} $must have been created, allocated, or retrieved from the same
			{@code VkDevice}
			""",
			"{@code offset} $must be a multiple of 4",
			"{@code countBufferOffset} $must be a multiple of 4",
			"{@code stride} $must be a multiple of 4 and $must be greater than or equal to sizeof({@code VkDrawIndirectCommand})",
			"""
			If {@code maxDrawCount} is greater than or equal to 1, ({@code stride} x ({@code maxDrawCount} - 1) + {@code offset} +
			sizeof({@code VkDrawIndirectCommand})) $must be less than or equal to the size of {@code buffer}
			""",
			"""
			If the drawIndirectFirstInstance feature is not enabled, all the {@code firstInstance} members of the ##VkDrawIndexedIndirectCommand structures
			accessed by this command $must be 0
			""",
			"""
			For each set {@code n} that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS, a descriptor set $must
			have been bound to {@code n} at #PIPELINE_BIND_POINT_GRAPHICS, with a {@code VkPipelineLayout} that is compatible for set {@code n}, with the
			{@code VkPipelineLayout} used to create the current {@code VkPipeline}
			""",
			"""
			For each push constant that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS, a push constant value
			$must have been set for #PIPELINE_BIND_POINT_GRAPHICS, with a {@code VkPipelineLayout} that is compatible for push constants, with the
			{@code VkPipelineLayout} used to create the current {@code VkPipeline}
			""",
			"""
			Descriptors in each bound descriptor set, specified via #CmdBindDescriptorSets(), $must be valid if they are statically used by the currently bound
			{@code VkPipeline} object, specified via #CmdBindPipeline()
			""",
			"""
			All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point's interface $must have valid buffers bound
			""",
			"A valid graphics pipeline $must be bound to the current command buffer with #PIPELINE_BIND_POINT_GRAPHICS",
			"""
			If the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_GRAPHICS requires any dynamic state, that state $must have been set on the
			current command buffer
			""",
			"""
			If count stored in {@code countBuffer} is equal to 1, ({@code offset} + sizeof({@code VkDrawIndexedIndirectCommand})) $must be less than or equal
			to the size of {@code buffer}
			""",
			"""
			If count stored in {@code countBuffer} is greater than 1, ({@code stride} x ({@code drawCount} - 1) + {@code offset} +
			sizeof({@code VkDrawIndexedIndirectCommand})) $must be less than or equal to the size of {@code buffer}
			""",
			"{@code drawCount} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxDrawIndirectCount}",
			"Every input attachment used by the current subpass $must be bound to the pipeline via a descriptor set",
			"""
			If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses
			unnormalized coordinates, it $mustnot be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D,
			#IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage
			""",
			"""
			If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses
			unnormalized coordinates, it $mustnot be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with
			{@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage
			""",
			"""
			If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses
			unnormalized coordinates, it $mustnot be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that
			includes a lod bias or any offset values, in any shader stage
			""",
			"""
			If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
			#PIPELINE_BIND_POINT_GRAPHICS accesses a uniform buffer, it $mustnot access values outside of the range of that buffer specified in the currently
			bound descriptor set
			""",
			"""
			If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
			#PIPELINE_BIND_POINT_GRAPHICS accesses a storage buffer, it $mustnot access values outside of the range of that buffer specified in the currently
			bound descriptor set
			""",
			"""
			Any {@code VkImageView} being sampled with #FILTER_LINEAR as a result of this command $must be of a format which supports linear filtering, as
			specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or
			##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()
			"""
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdDrawIndirect =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code buffer} $must be a valid {@code VkBuffer} handle",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"This command $must only be called inside of a render pass instance",
			"Both of {@code buffer}, and {@code commandBuffer} $must have been created, allocated, or retrieved from the same {@code VkDevice}",
			"{@code offset} $must be a multiple of 4",
			"""
			If {@code drawCount} is greater than 1, {@code stride} $must be a multiple of 4 and $must be greater than or equal to
			sizeof({@code VkDrawIndirectCommand})
			""",
			"If the multi-draw indirect feature is not enabled, {@code drawCount} $must be 0 or 1",
			"""
			If the drawIndirectFirstInstance feature is not enabled, all the {@code firstInstance} members of the ##VkDrawIndirectCommand structures accessed
			by this command $must be 0
			""",
			"""
			For each set {@code n} that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS, a descriptor set $must
			have been bound to {@code n} at #PIPELINE_BIND_POINT_GRAPHICS, with a {@code VkPipelineLayout} that is compatible for set {@code n}, with the
			{@code VkPipelineLayout} used to create the current {@code VkPipeline}
			""",
			"""
			For each push constant that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS, a push constant value
			$must have been set for #PIPELINE_BIND_POINT_GRAPHICS, with a {@code VkPipelineLayout} that is compatible for push constants, with the
			{@code VkPipelineLayout} used to create the current {@code VkPipeline}
			""",
			"""
			Descriptors in each bound descriptor set, specified via #CmdBindDescriptorSets(), $must be valid if they are statically used by the currently bound
			{@code VkPipeline} object, specified via #CmdBindPipeline()
			""",
			"""
			All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point's interface $must have valid buffers bound
			""",
			"A valid graphics pipeline $must be bound to the current command buffer with #PIPELINE_BIND_POINT_GRAPHICS",
			"""
			If the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_GRAPHICS requires any dynamic state, that state $must have been set on the
			current command buffer
			""",
			"""
			If {@code drawCount} is equal to 1, ({@code offset} + sizeof({@code VkDrawIndirectCommand})) $must be less than or equal to the size of
			{@code buffer}
			""",
			"""
			If {@code drawCount} is greater than 1, ({@code stride} x ({@code drawCount} - 1) + {@code offset} + sizeof({@code VkDrawIndirectCommand})) $must
			be less than or equal to the size of {@code buffer}
			""",
			"{@code drawCount} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxDrawIndirectCount}",
			"Every input attachment used by the current subpass $must be bound to the pipeline via a descriptor set",
			"""
			If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses
			unnormalized coordinates, it $mustnot be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D,
			#IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage
			""",
			"""
			If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses
			unnormalized coordinates, it $mustnot be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with
			{@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage
			""",
			"""
			If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses
			unnormalized coordinates, it $mustnot be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that
			includes a lod bias or any offset values, in any shader stage
			""",
			"""
			If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
			#PIPELINE_BIND_POINT_GRAPHICS accesses a uniform buffer, it $mustnot access values outside of the range of that buffer specified in the currently
			bound descriptor set
			""",
			"""
			If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
			#PIPELINE_BIND_POINT_GRAPHICS accesses a storage buffer, it $mustnot access values outside of the range of that buffer specified in the currently
			bound descriptor set
			""",
			"""
			Any {@code VkImageView} being sampled with #FILTER_LINEAR as a result of this command $must be of a format which supports linear filtering, as
			specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or
			##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()
			""",
			"""
			Any {@code VkImageView} being sampled with #FILTER_CUBIC_IMG as a result of this command $must be of a format which supports cubic filtering, as
			specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image)
			or ##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()
			""",
			"""
			Any {@code VkImageView} being sampled with #FILTER_CUBIC_IMG as a result of this command $mustnot have a {@code VkImageViewType} of
			#IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, or #IMAGE_VIEW_TYPE_CUBE_ARRAY
			"""
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdDrawIndirectCountAMD =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code buffer} $must be a valid {@code VkBuffer} handle",
			"{@code countBuffer} $must be a valid {@code VkBuffer} handle",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"This command $must only be called inside of a render pass instance",
			"""
			Each of {@code buffer}, {@code commandBuffer}, and {@code countBuffer} $must have been created, allocated, or retrieved from the same
			{@code VkDevice}
			""",
			"{@code offset} $must be a multiple of 4",
			"{@code countBufferOffset} $must be a multiple of 4",
			"{@code stride} $must be a multiple of 4 and $must be greater than or equal to sizeof({@code VkDrawIndirectCommand})",
			"""
			If {@code maxDrawCount} is greater than or equal to 1, ({@code stride} x ({@code maxDrawCount} - 1) + {@code offset} +
			sizeof({@code VkDrawIndirectCommand})) $must be less than or equal to the size of {@code buffer}
			""",
			"""
			If the drawIndirectFirstInstance feature is not enabled, all the {@code firstInstance} members of the ##VkDrawIndirectCommand structures accessed
			by this command $must be 0
			""",
			"""
			For each set {@code n} that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS, a descriptor set $must
			have been bound to {@code n} at #PIPELINE_BIND_POINT_GRAPHICS, with a {@code VkPipelineLayout} that is compatible for set {@code n}, with the
			{@code VkPipelineLayout} used to create the current {@code VkPipeline}
			""",
			"""
			For each push constant that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS, a push constant value
			$must have been set for #PIPELINE_BIND_POINT_GRAPHICS, with a {@code VkPipelineLayout} that is compatible for push constants, with the
			{@code VkPipelineLayout} used to create the current {@code VkPipeline}
			""",
			"""
			Descriptors in each bound descriptor set, specified via #CmdBindDescriptorSets(), $must be valid if they are statically used by the currently bound
			{@code VkPipeline} object, specified via #CmdBindPipeline()
			""",
			"""
			All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point's interface $must have valid buffers bound
			""",
			"A valid graphics pipeline $must be bound to the current command buffer with #PIPELINE_BIND_POINT_GRAPHICS",
			"""
			If the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_GRAPHICS requires any dynamic state, that state $must have been set on the
			current command buffer
			""",
			"""
			If the count stored in {@code countBuffer} is equal to 1, ({@code offset} + sizeof({@code VkDrawIndirectCommand})) $must be less than or equal to
			the size of {@code buffer}
			""",
			"""
			If the count stored in {@code countBuffer} is greater than 1, ({@code stride} x ({@code drawCount} - 1) + {@code offset} +
			sizeof({@code VkDrawIndirectCommand})) $must be less than or equal to the size of {@code buffer}
			""",
			"The count stored in {@code countBuffer} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxDrawIndirectCount}",
			"Every input attachment used by the current subpass $must be bound to the pipeline via a descriptor set",
			"""
			If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses
			unnormalized coordinates, it $mustnot be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D,
			#IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage
			""",
			"""
			If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses
			unnormalized coordinates, it $mustnot be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with
			{@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage
			""",
			"""
			If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses
			unnormalized coordinates, it $mustnot be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that
			includes a lod bias or any offset values, in any shader stage
			""",
			"""
			If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
			#PIPELINE_BIND_POINT_GRAPHICS accesses a uniform buffer, it $mustnot access values outside of the range of that buffer specified in the currently
			bound descriptor set
			""",
			"""
			If the robust buffer access feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to
			#PIPELINE_BIND_POINT_GRAPHICS accesses a storage buffer, it $mustnot access values outside of the range of that buffer specified in the currently
			bound descriptor set
			""",
			"""
			Any {@code VkImageView} being sampled with #FILTER_LINEAR as a result of this command $must be of a format which supports linear filtering, as
			specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or
			##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()
			"""
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdEndQuery =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code queryPool} $must be a valid {@code VkQueryPool} handle",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics, or compute operations",
			"Both of {@code commandBuffer}, and {@code queryPool} $must have been created, allocated, or retrieved from the same {@code VkDevice}",
			"The query identified by {@code queryPool} and {@code query} $must currently be active",
			"{@code query} $must be less than the number of queries in {@code queryPool}"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdEndRenderPass =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"This command $must only be called inside of a render pass instance",
			"{@code commandBuffer} $must be a primary {@code VkCommandBuffer}",
			"The current subpass index $must be equal to the number of subpasses in the render pass minus one"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdExecuteCommands =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code pCommandBuffers} $must be a pointer to an array of {@code commandBufferCount} valid {@code VkCommandBuffer} handles",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support transfer, graphics, or compute operations",
			"{@code commandBuffer} $must be a primary {@code VkCommandBuffer}",
			"{@code commandBufferCount} $must be greater than 0",
			"""
			Both of {@code commandBuffer}, and the elements of {@code pCommandBuffers} $must have been created, allocated, or retrieved from the same
			{@code VkDevice}
			""",
			"{@code commandBuffer} $must have been allocated with a {@code level} of #COMMAND_BUFFER_LEVEL_PRIMARY",
			"Any given element of {@code pCommandBuffers} $must have been allocated with a {@code level} of #COMMAND_BUFFER_LEVEL_SECONDARY",
			"""
			Any given element of {@code pCommandBuffers} $mustnot be already pending execution in {@code commandBuffer}, or appear twice in
			{@code pCommandBuffers}, unless it was recorded with the #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT flag
			""",
			"""
			Any given element of {@code pCommandBuffers} $mustnot be already pending execution in any other {@code VkCommandBuffer}, unless it was recorded
			with the #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT flag
			""",
			"Any given element of {@code pCommandBuffers} $must be in the executable state",
			"""
			Any given element of {@code pCommandBuffers} $must have been allocated from a {@code VkCommandPool} that was created for the same queue family as
			the {@code VkCommandPool} from which {@code commandBuffer} was allocated
			""",
			"""
			If #CmdExecuteCommands() is being called within a render pass instance, that render pass instance $must have been begun with the {@code contents}
			parameter of #CmdBeginRenderPass() set to #SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS
			""",
			"""
			If #CmdExecuteCommands() is being called within a render pass instance, any given element of {@code pCommandBuffers} $must have been recorded with
			the #COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT
			""",
			"""
			If #CmdExecuteCommands() is being called within a render pass instance, any given element of {@code pCommandBuffers} $must have been recorded with
			##VkCommandBufferInheritanceInfo{@code ::subpass} set to the index of the subpass which the given command buffer will be executed in
			""",
			"""
			If #CmdExecuteCommands() is being called within a render pass instance, any given element of {@code pCommandBuffers} $must have been recorded with
			a render pass that is compatible with the current render pass
			""",
			"""
			If #CmdExecuteCommands() is being called within a render pass instance, and any given element of {@code pCommandBuffers} was recorded with
			##VkCommandBufferInheritanceInfo{@code ::framebuffer} not equal to #NULL_HANDLE, that {@code VkFramebuffer} $must match the {@code VkFramebuffer}
			used in the current render pass instance
			""",
			"""
			If #CmdExecuteCommands() is not being called within a render pass instance, any given element of {@code pCommandBuffers} $mustnot have been
			recorded with the #COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT
			""",
			"If the inherited queries feature is not enabled, {@code commandBuffer} $mustnot have any queries active",
			"""
			If {@code commandBuffer} has a #QUERY_TYPE_OCCLUSION query active, then each element of {@code pCommandBuffers} $must have been recorded with
			##VkCommandBufferInheritanceInfo{@code ::occlusionQueryEnable} set to #TRUE
			""",
			"""
			If {@code commandBuffer} has a #QUERY_TYPE_OCCLUSION query active, then each element of {@code pCommandBuffers} $must have been recorded with
			##VkCommandBufferInheritanceInfo{@code ::queryFlags} having all bits set that are set for the query
			""",
			"""
			If {@code commandBuffer} has a #QUERY_TYPE_PIPELINE_STATISTICS query active, then each element of {@code pCommandBuffers} $must have been recorded
			with ##VkCommandBufferInheritanceInfo{@code ::pipelineStatistics} having all bits set that are set in the {@code VkQueryPool} the query uses
			""",
			"Any given element of {@code pCommandBuffers} $mustnot begin any query types that are active in {@code commandBuffer}"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdFillBuffer =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code dstBuffer} $must be a valid {@code VkBuffer} handle",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics, or compute operations",
			"This command $must only be called outside of a render pass instance",
			"Both of {@code commandBuffer}, and {@code dstBuffer} $must have been created, allocated, or retrieved from the same {@code VkDevice}",
			"{@code dstOffset} $must be less than the size of {@code dstBuffer}",
			"{@code dstOffset} $must be a multiple of 4",
			"If {@code size} is not equal to #WHOLE_SIZE, {@code size} $must be greater than 0",
			"If {@code size} is not equal to #WHOLE_SIZE, {@code size} $must be less than or equal to the size of {@code dstBuffer} minus {@code dstOffset}",
			"If {@code size} is not equal to #WHOLE_SIZE, {@code size} $must be a multiple of 4",
			"{@code dstBuffer} $must have been created with #BUFFER_USAGE_TRANSFER_DST_BIT usage flag"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdNextSubpass =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code contents} $must be a valid {@code VkSubpassContents} value",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"This command $must only be called inside of a render pass instance",
			"{@code commandBuffer} $must be a primary {@code VkCommandBuffer}",
			"The current subpass index $must be less than the number of subpasses in the render pass minus one"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdPipelineBarrier =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code srcStageMask} $must be a valid combination of {@code VkPipelineStageFlagBits} values",
			"{@code srcStageMask} $mustnot be 0",
			"{@code dstStageMask} $must be a valid combination of {@code VkPipelineStageFlagBits} values",
			"{@code dstStageMask} $mustnot be 0",
			"{@code dependencyFlags} $must be a valid combination of {@code VkDependencyFlagBits} values",
			"""
			If {@code memoryBarrierCount} is not 0, {@code pMemoryBarriers} $must be a pointer to an array of {@code memoryBarrierCount} valid
			##VkMemoryBarrier structures
			""",
			"""
			If {@code bufferMemoryBarrierCount} is not 0, {@code pBufferMemoryBarriers} $must be a pointer to an array of {@code bufferMemoryBarrierCount}
			valid ##VkBufferMemoryBarrier structures
			""",
			"""
			If {@code imageMemoryBarrierCount} is not 0, {@code pImageMemoryBarriers} $must be a pointer to an array of {@code imageMemoryBarrierCount} valid
			##VkImageMemoryBarrier structures
			""",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support transfer, graphics, or compute operations",
			"If the geometry shaders feature is not enabled, {@code srcStageMask} $mustnot contain #PIPELINE_STAGE_GEOMETRY_SHADER_BIT",
			"If the geometry shaders feature is not enabled, {@code dstStageMask} $mustnot contain #PIPELINE_STAGE_GEOMETRY_SHADER_BIT",
			"""
			If the tessellation shaders feature is not enabled, {@code srcStageMask} $mustnot contain #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or
			#PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT
			""",
			"""
			If the tessellation shaders feature is not enabled, {@code dstStageMask} $mustnot contain #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or
			#PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT
			""",
			"""
			If #CmdPipelineBarrier() is called within a render pass instance, the render pass $must have been created with a {@code VkSubpassDependency}
			instance in {@code pDependencies} that expresses a dependency from the current subpass to itself. Additionally:
			""",
			"If #CmdPipelineBarrier() is called within a render pass instance, {@code bufferMemoryBarrierCount} $must be 0",
			"""
			If #CmdPipelineBarrier() is called within a render pass instance, the {@code image} member of any element of {@code pImageMemoryBarriers} $must be
			equal to one of the elements of {@code pAttachments} that the current {@code framebuffer} was created with, that is also referred to by one of the
			elements of the {@code pColorAttachments}, {@code pResolveAttachments} or {@code pDepthStencilAttachment} members of the
			{@code VkSubpassDescription} instance that the current subpass was created with
			""",
			"""
			If #CmdPipelineBarrier() is called within a render pass instance, the {@code oldLayout} and {@code newLayout} members of any element of
			{@code pImageMemoryBarriers} $must be equal to the {@code layout} member of an element of the {@code pColorAttachments},
			{@code pResolveAttachments} or {@code pDepthStencilAttachment} members of the {@code VkSubpassDescription} instance that the current subpass was
			created with, that refers to the same {@code image}
			""",
			"""
			If #CmdPipelineBarrier() is called within a render pass instance, the {@code oldLayout} and {@code newLayout} members of an element of
			{@code pImageMemoryBarriers} $must be equal
			""",
			"""
			If #CmdPipelineBarrier() is called within a render pass instance, the {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} members of any
			element of {@code pImageMemoryBarriers} $must be #QUEUE_FAMILY_IGNORED
			"""
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdPushConstants =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code layout} $must be a valid {@code VkPipelineLayout} handle",
			"{@code stageFlags} $must be a valid combination of {@code VkShaderStageFlagBits} values",
			"{@code stageFlags} $mustnot be 0",
			"{@code pValues} $must be a pointer to an array of {@code size} bytes",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics, or compute operations",
			"{@code size} $must be greater than 0",
			"Both of {@code commandBuffer}, and {@code layout} $must have been created, allocated, or retrieved from the same {@code VkDevice}",
			"{@code stageFlags} $must match exactly the shader stages used in {@code layout} for the range specified by {@code offset} and {@code size}",
			"{@code offset} $must be a multiple of 4",
			"{@code size} $must be a multiple of 4",
			"{@code offset} $must be less than ##VkPhysicalDeviceLimits{@code ::maxPushConstantsSize}",
			"{@code size} $must be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxPushConstantsSize} minus {@code offset}"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdResetEvent =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code event} $must be a valid {@code VkEvent} handle",
			"{@code stageMask} $must be a valid combination of {@code VkPipelineStageFlagBits} values",
			"{@code stageMask} $mustnot be 0",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics, or compute operations",
			"This command $must only be called outside of a render pass instance",
			"Both of {@code commandBuffer}, and {@code event} $must have been created, allocated, or retrieved from the same {@code VkDevice}",
			"If the geometry shaders feature is not enabled, {@code stageMask} $mustnot contain #PIPELINE_STAGE_GEOMETRY_SHADER_BIT",
			"""
			If the tessellation shaders feature is not enabled, {@code stageMask} $mustnot contain #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or
			#PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT
			""",
			"When this command executes, {@code event} $mustnot be waited on by a #CmdWaitEvents() command that is currently executing"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdResetQueryPool =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code queryPool} $must be a valid {@code VkQueryPool} handle",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics, or compute operations",
			"This command $must only be called outside of a render pass instance",
			"Both of {@code commandBuffer}, and {@code queryPool} $must have been created, allocated, or retrieved from the same {@code VkDevice}",
			"{@code firstQuery} $must be less than the number of queries in {@code queryPool}",
			"The sum of {@code firstQuery} and {@code queryCount} $must be less than or equal to the number of queries in {@code queryPool}"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdResolveImage =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code srcImage} $must be a valid {@code VkImage} handle",
			"{@code srcImageLayout} $must be a valid {@code VkImageLayout} value",
			"{@code dstImage} $must be a valid {@code VkImage} handle",
			"{@code dstImageLayout} $must be a valid {@code VkImageLayout} value",
			"{@code pRegions} $must be a pointer to an array of {@code regionCount} valid ##VkImageResolve structures",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"This command $must only be called outside of a render pass instance",
			"{@code regionCount} $must be greater than 0",
			"""
			Each of {@code commandBuffer}, {@code dstImage}, and {@code srcImage} $must have been created, allocated, or retrieved from the same
			{@code VkDevice}
			""",
			"The source region specified by a given element of {@code pRegions} $must be a region that is contained within {@code srcImage}",
			"The destination region specified by a given element of {@code pRegions} $must be a region that is contained within {@code dstImage}",
			"""
			The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, $mustnot overlap in
			memory
			""",
			"{@code srcImage} $must have a sample count equal to any valid sample count value other than #SAMPLE_COUNT_1_BIT",
			"{@code dstImage} $must have a sample count equal to #SAMPLE_COUNT_1_BIT",
			"""
			{@code srcImageLayout} $must specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this
			command is executed on a {@code VkDevice}
			""",
			"{@code srcImageLayout} $must be either of #IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL or #IMAGE_LAYOUT_GENERAL",
			"""
			{@code dstImageLayout} $must specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this
			command is executed on a {@code VkDevice}
			""",
			"{@code dstImageLayout} $must be either of #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL or #IMAGE_LAYOUT_GENERAL",
			"""
			If {@code dstImage} was created with {@code tiling} equal to #IMAGE_TILING_LINEAR, {@code dstImage} $must have been created with a {@code format}
			that supports being a color attachment, as specified by the #FORMAT_FEATURE_COLOR_ATTACHMENT_BIT flag in
			##VkFormatProperties{@code ::linearTilingFeatures} returned by #GetPhysicalDeviceFormatProperties()
			""",
			"""
			If {@code dstImage} was created with {@code tiling} equal to #IMAGE_TILING_OPTIMAL, {@code dstImage} $must have been created with a {@code format}
			that supports being a color attachment, as specified by the #FORMAT_FEATURE_COLOR_ATTACHMENT_BIT flag in
			##VkFormatProperties{@code ::optimalTilingFeatures} returned by #GetPhysicalDeviceFormatProperties()
			"""
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdSetBlendConstants =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"The currently bound graphics pipeline $must have been created with the #DYNAMIC_STATE_BLEND_CONSTANTS dynamic state enabled"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdSetDepthBias =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"The currently bound graphics pipeline $must have been created with the #DYNAMIC_STATE_DEPTH_BIAS dynamic state enabled",
			"If the depth bias clamping feature is not enabled, {@code depthBiasClamp} $must be 0.0"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdSetDepthBounds =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"The currently bound graphics pipeline $must have been created with the #DYNAMIC_STATE_DEPTH_BOUNDS dynamic state enabled",
			"{@code minDepthBounds} $must be between {@code 0.0} and {@code 1.0}, inclusive",
			"{@code maxDepthBounds} $must be between {@code 0.0} and {@code 1.0}, inclusive"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdSetEvent =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code event} $must be a valid {@code VkEvent} handle",
			"{@code stageMask} $must be a valid combination of {@code VkPipelineStageFlagBits} values",
			"{@code stageMask} $mustnot be 0",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics, or compute operations",
			"This command $must only be called outside of a render pass instance",
			"Both of {@code commandBuffer}, and {@code event} $must have been created, allocated, or retrieved from the same {@code VkDevice}",
			"If the geometry shaders feature is not enabled, {@code stageMask} $mustnot contain #PIPELINE_STAGE_GEOMETRY_SHADER_BIT",
			"""
			If the tessellation shaders feature is not enabled, {@code stageMask} $mustnot contain #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or
			#PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT
			"""
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdSetLineWidth =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"The currently bound graphics pipeline $must have been created with the #DYNAMIC_STATE_LINE_WIDTH dynamic state enabled",
			"If the wide lines feature is not enabled, {@code lineWidth} $must be {@code 1.0}"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdSetScissor =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code pScissors} $must be a pointer to an array of {@code scissorCount} ##VkRect2D structures",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"{@code scissorCount} $must be greater than 0",
			"The currently bound graphics pipeline $must have been created with the #DYNAMIC_STATE_SCISSOR dynamic state enabled",
			"{@code firstScissor} $must be less than ##VkPhysicalDeviceLimits{@code ::maxViewports}",
			"The sum of {@code firstScissor} and {@code scissorCount} $must be between 1 and ##VkPhysicalDeviceLimits{@code ::maxViewports}, inclusive",
			"The {@code x} and {@code y} members of {@code offset} $must be greater than or equal to 0",
			"Evaluation of ({@code offset.x} + {@code extent.width}) $mustnot cause a signed integer addition overflow",
			"Evaluation of ({@code offset.y} + {@code extent.height}) $mustnot cause a signed integer addition overflow"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdSetStencilCompareMask =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code faceMask} $must be a valid combination of {@code VkStencilFaceFlagBits} values",
			"{@code faceMask} $mustnot be 0",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"The currently bound graphics pipeline $must have been created with the #DYNAMIC_STATE_STENCIL_COMPARE_MASK dynamic state enabled"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdSetStencilReference =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code faceMask} $must be a valid combination of {@code VkStencilFaceFlagBits} values",
			"{@code faceMask} $mustnot be 0",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"The currently bound graphics pipeline $must have been created with the #DYNAMIC_STATE_STENCIL_REFERENCE dynamic state enabled"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdSetStencilWriteMask =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code faceMask} $must be a valid combination of {@code VkStencilFaceFlagBits} values",
			"{@code faceMask} $mustnot be 0",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"The currently bound graphics pipeline $must have been created with the #DYNAMIC_STATE_STENCIL_WRITE_MASK dynamic state enabled"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdSetViewport =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code pViewports} $must be a pointer to an array of {@code viewportCount} valid ##VkViewport structures",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics operations",
			"{@code viewportCount} $must be greater than 0",
			"The currently bound graphics pipeline $must have been created with the #DYNAMIC_STATE_VIEWPORT dynamic state enabled",
			"{@code firstViewport} $must be less than ##VkPhysicalDeviceLimits{@code ::maxViewports}",
			"The sum of {@code firstViewport} and {@code viewportCount} $must be between 1 and ##VkPhysicalDeviceLimits{@code ::maxViewports}, inclusive"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdUpdateBuffer =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code dstBuffer} $must be a valid {@code VkBuffer} handle",
			"{@code pData} $must be a pointer to an array of {@code dataSize} bytes",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support transfer, graphics, or compute operations",
			"This command $must only be called outside of a render pass instance",
			"{@code dataSize} $must be greater than 0",
			"Both of {@code commandBuffer}, and {@code dstBuffer} $must have been created, allocated, or retrieved from the same {@code VkDevice}",
			"{@code dstOffset} $must be less than the size of {@code dstBuffer}",
			"{@code dataSize} $must be less than or equal to the size of {@code dstBuffer} minus {@code dstOffset}",
			"{@code dstBuffer} $must have been created with #BUFFER_USAGE_TRANSFER_DST_BIT usage flag",
			"{@code dstOffset} $must be a multiple of 4",
			"{@code dataSize} $must be less than or equal to 65536",
			"{@code dataSize} $must be a multiple of 4"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdWaitEvents =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code pEvents} $must be a pointer to an array of {@code eventCount} valid {@code VkEvent} handles",
			"{@code srcStageMask} $must be a valid combination of {@code VkPipelineStageFlagBits} values",
			"{@code srcStageMask} $mustnot be 0",
			"{@code dstStageMask} $must be a valid combination of {@code VkPipelineStageFlagBits} values",
			"{@code dstStageMask} $mustnot be 0",
			"""
			If {@code memoryBarrierCount} is not 0, {@code pMemoryBarriers} $must be a pointer to an array of {@code memoryBarrierCount} valid
			##VkMemoryBarrier structures
			""",
			"""
			If {@code bufferMemoryBarrierCount} is not 0, {@code pBufferMemoryBarriers} $must be a pointer to an array of {@code bufferMemoryBarrierCount}
			valid ##VkBufferMemoryBarrier structures
			""",
			"""
			If {@code imageMemoryBarrierCount} is not 0, {@code pImageMemoryBarriers} $must be a pointer to an array of {@code imageMemoryBarrierCount} valid
			##VkImageMemoryBarrier structures
			""",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics, or compute operations",
			"{@code eventCount} $must be greater than 0",
			"""
			Both of {@code commandBuffer}, and the elements of {@code pEvents} $must have been created, allocated, or retrieved from the same {@code VkDevice}
			""",
			"""
			{@code srcStageMask} $must be the bitwise OR of the {@code stageMask} parameter used in previous calls to #CmdSetEvent() with any of the members of
			{@code pEvents} and #PIPELINE_STAGE_HOST_BIT if any of the members of {@code pEvents} was set using #SetEvent()
			""",
			"If the geometry shaders feature is not enabled, {@code srcStageMask} $mustnot contain #PIPELINE_STAGE_GEOMETRY_SHADER_BIT",
			"If the geometry shaders feature is not enabled, {@code dstStageMask} $mustnot contain #PIPELINE_STAGE_GEOMETRY_SHADER_BIT",
			"""
			If the tessellation shaders feature is not enabled, {@code srcStageMask} $mustnot contain #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or
			#PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT
			""",
			"""
			If the tessellation shaders feature is not enabled, {@code dstStageMask} $mustnot contain #PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT or
			#PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT
			""",
			"""
			If {@code pEvents} includes one or more events that will be signaled by #SetEvent() after {@code commandBuffer} has been submitted to a queue, then
			#CmdWaitEvents() $mustnot be called inside a render pass instance
			"""
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCmdWriteTimestamp =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code pipelineStage} $must be a valid {@code VkPipelineStageFlagBits} value",
			"{@code queryPool} $must be a valid {@code VkQueryPool} handle",
			"{@code commandBuffer} $must be in the recording state",
			"The {@code VkCommandPool} that {@code commandBuffer} was allocated from $must support graphics, or compute operations",
			"Both of {@code commandBuffer}, and {@code queryPool} $must have been created, allocated, or retrieved from the same {@code VkDevice}",
			"The query identified by {@code queryPool} and {@code query} $must be {@code unavailable}",
			"The command pool's queue family $must support a non-zero {@code timestampValidBits}"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkCreateAndroidSurfaceKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code instance} $must be a valid {@code VkInstance} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkAndroidSurfaceCreateInfoKHR structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pSurface} $must be a pointer to a {@code VkSurfaceKHR} handle"
		)}"""

@JvmField val vkCreateBuffer =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkBufferCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pBuffer} $must be a pointer to a {@code VkBuffer} handle",
			"""
			If the {@code flags} member of {@code pCreateInfo} includes #BUFFER_CREATE_SPARSE_BINDING_BIT, creating this {@code VkBuffer} $mustnot cause the
			total required sparse memory for all currently valid sparse resources on the device to exceed
			##VkPhysicalDeviceLimits{@code ::sparseAddressSpaceSize}
			"""
		)}"""

@JvmField val vkCreateBufferView =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkBufferViewCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pView} $must be a pointer to a {@code VkBufferView} handle"
		)}"""

@JvmField val vkCreateCommandPool =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkCommandPoolCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pCommandPool} $must be a pointer to a {@code VkCommandPool} handle"
		)}"""

@JvmField val vkCreateComputePipelines =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code pipelineCache} is not #NULL_HANDLE, {@code pipelineCache} $must be a valid {@code VkPipelineCache} handle",
			"{@code pCreateInfos} $must be a pointer to an array of {@code createInfoCount} valid ##VkComputePipelineCreateInfo structures",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pPipelines} $must be a pointer to an array of {@code createInfoCount} {@code VkPipeline} handles",
			"{@code createInfoCount} $must be greater than 0",
			"If {@code pipelineCache} is a valid handle, it $must have been created, allocated, or retrieved from {@code device}",
			"""
			If the {@code flags} member of any given element of {@code pCreateInfos} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and the
			{@code basePipelineIndex} member of that same element is not {@code -1}, {@code basePipelineIndex} $must be less than the index into
			{@code pCreateInfos} that corresponds to that element
			"""
		)}"""

@JvmField val vkCreateDebugReportCallbackEXT =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code instance} $must be a valid {@code VkInstance} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkDebugReportCallbackCreateInfoEXT structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pCallback} $must be a pointer to a {@code VkDebugReportCallbackEXT} handle"
		)}"""

@JvmField val vkCreateDescriptorPool =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkDescriptorPoolCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pDescriptorPool} $must be a pointer to a {@code VkDescriptorPool} handle"
		)}"""

@JvmField val vkCreateDescriptorSetLayout =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkDescriptorSetLayoutCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pSetLayout} $must be a pointer to a {@code VkDescriptorSetLayout} handle"
		)}"""

@JvmField val vkCreateDevice =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkDeviceCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pDevice} $must be a pointer to a {@code VkDevice} handle"
		)}"""

@JvmField val vkCreateDisplayModeKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code display} $must be a valid {@code VkDisplayKHR} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkDisplayModeCreateInfoKHR structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pMode} $must be a pointer to a {@code VkDisplayModeKHR} handle"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code display} $must be externally synchronized"
		)}"""

@JvmField val vkCreateDisplayPlaneSurfaceKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code instance} $must be a valid {@code VkInstance} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkDisplaySurfaceCreateInfoKHR structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pSurface} $must be a pointer to a {@code VkSurfaceKHR} handle"
		)}"""

@JvmField val vkCreateEvent =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkEventCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pEvent} $must be a pointer to a {@code VkEvent} handle"
		)}"""

@JvmField val vkCreateFence =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkFenceCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pFence} $must be a pointer to a {@code VkFence} handle"
		)}"""

@JvmField val vkCreateFramebuffer =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkFramebufferCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pFramebuffer} $must be a pointer to a {@code VkFramebuffer} handle"
		)}"""

@JvmField val vkCreateGraphicsPipelines =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code pipelineCache} is not #NULL_HANDLE, {@code pipelineCache} $must be a valid {@code VkPipelineCache} handle",
			"{@code pCreateInfos} $must be a pointer to an array of {@code createInfoCount} valid ##VkGraphicsPipelineCreateInfo structures",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pPipelines} $must be a pointer to an array of {@code createInfoCount} {@code VkPipeline} handles",
			"{@code createInfoCount} $must be greater than 0",
			"If {@code pipelineCache} is a valid handle, it $must have been created, allocated, or retrieved from {@code device}",
			"""
			If the {@code flags} member of any given element of {@code pCreateInfos} contains the #PIPELINE_CREATE_DERIVATIVE_BIT flag, and the
			{@code basePipelineIndex} member of that same element is not {@code -1}, {@code basePipelineIndex} $must be less than the index into
			{@code pCreateInfos} that corresponds to that element
			"""
		)}"""

@JvmField val vkCreateImage =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkImageCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pImage} $must be a pointer to a {@code VkImage} handle",
			"""
			If the {@code flags} member of {@code pCreateInfo} includes #IMAGE_CREATE_SPARSE_BINDING_BIT, creating this {@code VkImage} $mustnot cause the
			total required sparse memory for all currently valid sparse resources on the device to exceed
			##VkPhysicalDeviceLimits{@code ::sparseAddressSpaceSize}
			"""
		)}"""

@JvmField val vkCreateImageView =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkImageViewCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pView} $must be a pointer to a {@code VkImageView} handle"
		)}"""

@JvmField val vkCreateInstance =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code pCreateInfo} $must be a pointer to a valid ##VkInstanceCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pInstance} $must be a pointer to a {@code VkInstance} handle"
		)}"""

@JvmField val vkCreateMirSurfaceKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code instance} $must be a valid {@code VkInstance} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkMirSurfaceCreateInfoKHR structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pSurface} $must be a pointer to a {@code VkSurfaceKHR} handle"
		)}"""

@JvmField val vkCreatePipelineCache =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkPipelineCacheCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pPipelineCache} $must be a pointer to a {@code VkPipelineCache} handle"
		)}"""

@JvmField val vkCreatePipelineLayout =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkPipelineLayoutCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pPipelineLayout} $must be a pointer to a {@code VkPipelineLayout} handle"
		)}"""

@JvmField val vkCreateQueryPool =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkQueryPoolCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pQueryPool} $must be a pointer to a {@code VkQueryPool} handle"
		)}"""

@JvmField val vkCreateRenderPass =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkRenderPassCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pRenderPass} $must be a pointer to a {@code VkRenderPass} handle"
		)}"""

@JvmField val vkCreateSampler =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkSamplerCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pSampler} $must be a pointer to a {@code VkSampler} handle"
		)}"""

@JvmField val vkCreateSemaphore =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkSemaphoreCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pSemaphore} $must be a pointer to a {@code VkSemaphore} handle"
		)}"""

@JvmField val vkCreateShaderModule =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkShaderModuleCreateInfo structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pShaderModule} $must be a pointer to a {@code VkShaderModule} handle"
		)}"""

@JvmField val vkCreateSharedSwapchainsKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfos} $must be a pointer to an array of {@code swapchainCount} valid ##VkSwapchainCreateInfoKHR structures",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pSwapchains} $must be a pointer to an array of {@code swapchainCount} {@code VkSwapchainKHR} handles",
			"{@code swapchainCount} $must be greater than 0"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code pCreateInfos}[].surface $must be externally synchronized",
			"Host access to {@code pCreateInfos}[].oldSwapchain $must be externally synchronized"
		)}"""

@JvmField val vkCreateSwapchainKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkSwapchainCreateInfoKHR structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pSwapchain} $must be a pointer to a {@code VkSwapchainKHR} handle"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code pCreateInfo.surface} $must be externally synchronized",
			"Host access to {@code pCreateInfo.oldSwapchain} $must be externally synchronized"
		)}"""

@JvmField val vkCreateWaylandSurfaceKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code instance} $must be a valid {@code VkInstance} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkWaylandSurfaceCreateInfoKHR structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pSurface} $must be a pointer to a {@code VkSurfaceKHR} handle"
		)}"""

@JvmField val vkCreateWin32SurfaceKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code instance} $must be a valid {@code VkInstance} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkWin32SurfaceCreateInfoKHR structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pSurface} $must be a pointer to a {@code VkSurfaceKHR} handle"
		)}"""

@JvmField val vkCreateXcbSurfaceKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code instance} $must be a valid {@code VkInstance} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkXcbSurfaceCreateInfoKHR structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pSurface} $must be a pointer to a {@code VkSurfaceKHR} handle"
		)}"""

@JvmField val vkCreateXlibSurfaceKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code instance} $must be a valid {@code VkInstance} handle",
			"{@code pCreateInfo} $must be a pointer to a valid ##VkXlibSurfaceCreateInfoKHR structure",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code pSurface} $must be a pointer to a {@code VkSurfaceKHR} handle"
		)}"""

@JvmField val vkDebugMarkerSetObjectNameEXT =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pNameInfo} $must be a pointer to a ##VkDebugMarkerObjectNameInfoEXT structure",
			"{@code pNameInfo.object} $must be a Vulkan object"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code pNameInfo.object} $must be externally synchronized"
		)}"""

@JvmField val vkDebugMarkerSetObjectTagEXT =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pTagInfo} $must be a pointer to a ##VkDebugMarkerObjectTagInfoEXT structure",
			"{@code pTagInfo.object} $must be a Vulkan object",
			"{@code pTagInfo.tagName} $mustnot be 0"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code pTagInfo.object} $must be externally synchronized"
		)}"""

@JvmField val vkDebugReportMessageEXT =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code instance} $must be a valid {@code VkInstance} handle",
			"{@code flags} $must be a valid combination of {@code VkDebugReportFlagBitsEXT} values",
			"{@code flags} $mustnot be 0",
			"{@code objectType} $must be a valid {@code VkDebugReportObjectTypeEXT} value",
			"{@code pLayerPrefix} $must be a pointer to a valid ",
			"{@code pMessage} $must be a pointer to a valid ",
			"{@code instance} $must be a valid {@code VkInstance} handle",
			"{@code flags} $must be a combination of one or more of {@code VkDebugReportFlagBitsEXT}",
			"{@code objType} $must be one of {@code VkDebugReportObjectTypeEXT}, #DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT if {@code object} is $NULL",
			"{@code object} $may be a Vulkan object",
			"{@code pLayerPrefix} $must be a $NULL terminated string.",
			"{@code pMsg} $must be a $NULL terminated string."
		)}"""

@JvmField val vkDestroyBuffer =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code buffer} is not #NULL_HANDLE, {@code buffer} $must be a valid {@code VkBuffer} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code buffer} is a valid handle, it $must have been created, allocated, or retrieved from {@code device}",
			"All submitted commands that refer to {@code buffer}, either directly or via a {@code VkBufferView}, $must have completed execution",
			"If {@code VkAllocationCallbacks} were provided when {@code buffer} was created, a compatible set of callbacks $must be provided here",
			"If no {@code VkAllocationCallbacks} were provided when {@code buffer} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code buffer} $must be externally synchronized"
		)}"""

@JvmField val vkDestroyBufferView =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code bufferView} is not #NULL_HANDLE, {@code bufferView} $must be a valid {@code VkBufferView} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code bufferView} is a valid handle, it $must have been created, allocated, or retrieved from {@code device}",
			"All submitted commands that refer to {@code bufferView} $must have completed execution",
			"If {@code VkAllocationCallbacks} were provided when {@code bufferView} was created, a compatible set of callbacks $must be provided here",
			"If no {@code VkAllocationCallbacks} were provided when {@code bufferView} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code bufferView} $must be externally synchronized"
		)}"""

@JvmField val vkDestroyCommandPool =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code commandPool} is not #NULL_HANDLE, {@code commandPool} $must be a valid {@code VkCommandPool} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code commandPool} is a valid handle, it $must have been created, allocated, or retrieved from {@code device}",
			"All {@code VkCommandBuffer} objects allocated from {@code commandPool} $mustnot be pending execution",
			"If {@code VkAllocationCallbacks} were provided when {@code commandPool} was created, a compatible set of callbacks $must be provided here",
			"If no {@code VkAllocationCallbacks} were provided when {@code commandPool} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandPool} $must be externally synchronized"
		)}"""

@JvmField val vkDestroyDebugReportCallbackEXT =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code instance} $must be a valid {@code VkInstance} handle",
			"{@code callback} $must be a valid {@code VkDebugReportCallbackEXT} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"{@code callback} $must have been created, allocated, or retrieved from {@code instance}",
			"If {@code VkAllocationCallbacks} were provided when {@code instance} was created, a compatible set of callbacks $must be provided here",
			"If no {@code VkAllocationCallbacks} were provided when {@code instance} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code callback} $must be externally synchronized"
		)}"""

@JvmField val vkDestroyDescriptorPool =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code descriptorPool} is not #NULL_HANDLE, {@code descriptorPool} $must be a valid {@code VkDescriptorPool} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code descriptorPool} is a valid handle, it $must have been created, allocated, or retrieved from {@code device}",
			"All submitted commands that refer to {@code descriptorPool} (via any allocated descriptor sets) $must have completed execution",
			"If {@code VkAllocationCallbacks} were provided when {@code descriptorPool} was created, a compatible set of callbacks $must be provided here",
			"If no {@code VkAllocationCallbacks} were provided when {@code descriptorPool} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code descriptorPool} $must be externally synchronized"
		)}"""

@JvmField val vkDestroyDescriptorSetLayout =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code descriptorSetLayout} is not #NULL_HANDLE, {@code descriptorSetLayout} $must be a valid {@code VkDescriptorSetLayout} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code descriptorSetLayout} is a valid handle, it $must have been created, allocated, or retrieved from {@code device}",
			"""
			If {@code VkAllocationCallbacks} were provided when {@code descriptorSetLayout} was created, a compatible set of callbacks $must be provided here
			""",
			"If no {@code VkAllocationCallbacks} were provided when {@code descriptorSetLayout} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code descriptorSetLayout} $must be externally synchronized"
		)}"""

@JvmField val vkDestroyDevice =
	"""<h5>Valid Usage</h5>
		${ul(
			"If {@code device} is not $NULL, {@code device} $must be a valid {@code VkDevice} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"All child objects created on {@code device} $must have been destroyed prior to destroying {@code device}",
			"If {@code VkAllocationCallbacks} were provided when {@code device} was created, a compatible set of callbacks $must be provided here",
			"If no {@code VkAllocationCallbacks} were provided when {@code device} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code device} $must be externally synchronized"
		)}"""

@JvmField val vkDestroyEvent =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code event} is not #NULL_HANDLE, {@code event} $must be a valid {@code VkEvent} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code event} is a valid handle, it $must have been created, allocated, or retrieved from {@code device}",
			"All submitted commands that refer to {@code event} $must have completed execution",
			"If {@code VkAllocationCallbacks} were provided when {@code event} was created, a compatible set of callbacks $must be provided here",
			"If no {@code VkAllocationCallbacks} were provided when {@code event} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code event} $must be externally synchronized"
		)}"""

@JvmField val vkDestroyFence =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code fence} is not #NULL_HANDLE, {@code fence} $must be a valid {@code VkFence} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code fence} is a valid handle, it $must have been created, allocated, or retrieved from {@code device}",
			"{@code fence} $mustnot be associated with any queue command that has not yet completed execution on that queue",
			"If {@code VkAllocationCallbacks} were provided when {@code fence} was created, a compatible set of callbacks $must be provided here",
			"If no {@code VkAllocationCallbacks} were provided when {@code fence} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code fence} $must be externally synchronized"
		)}"""

@JvmField val vkDestroyFramebuffer =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code framebuffer} is not #NULL_HANDLE, {@code framebuffer} $must be a valid {@code VkFramebuffer} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code framebuffer} is a valid handle, it $must have been created, allocated, or retrieved from {@code device}",
			"All submitted commands that refer to {@code framebuffer} $must have completed execution",
			"If {@code VkAllocationCallbacks} were provided when {@code framebuffer} was created, a compatible set of callbacks $must be provided here",
			"If no {@code VkAllocationCallbacks} were provided when {@code framebuffer} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code framebuffer} $must be externally synchronized"
		)}"""

@JvmField val vkDestroyImage =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code image} is not #NULL_HANDLE, {@code image} $must be a valid {@code VkImage} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code image} is a valid handle, it $must have been created, allocated, or retrieved from {@code device}",
			"All submitted commands that refer to {@code image}, either directly or via a {@code VkImageView}, $must have completed execution",
			"If {@code VkAllocationCallbacks} were provided when {@code image} was created, a compatible set of callbacks $must be provided here",
			"If no {@code VkAllocationCallbacks} were provided when {@code image} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code image} $must be externally synchronized"
		)}"""

@JvmField val vkDestroyImageView =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code imageView} is not #NULL_HANDLE, {@code imageView} $must be a valid {@code VkImageView} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code imageView} is a valid handle, it $must have been created, allocated, or retrieved from {@code device}",
			"All submitted commands that refer to {@code imageView} $must have completed execution",
			"If {@code VkAllocationCallbacks} were provided when {@code imageView} was created, a compatible set of callbacks $must be provided here",
			"If no {@code VkAllocationCallbacks} were provided when {@code imageView} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code imageView} $must be externally synchronized"
		)}"""

@JvmField val vkDestroyInstance =
	"""<h5>Valid Usage</h5>
		${ul(
			"If {@code instance} is not $NULL, {@code instance} $must be a valid {@code VkInstance} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"All child objects created using {@code instance} $must have been destroyed prior to destroying {@code instance}",
			"If {@code VkAllocationCallbacks} were provided when {@code instance} was created, a compatible set of callbacks $must be provided here",
			"If no {@code VkAllocationCallbacks} were provided when {@code instance} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code instance} $must be externally synchronized"
		)}"""

@JvmField val vkDestroyPipeline =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code pipeline} is not #NULL_HANDLE, {@code pipeline} $must be a valid {@code VkPipeline} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code pipeline} is a valid handle, it $must have been created, allocated, or retrieved from {@code device}",
			"All submitted commands that refer to {@code pipeline} $must have completed execution",
			"If {@code VkAllocationCallbacks} were provided when {@code pipeline} was created, a compatible set of callbacks $must be provided here",
			"If no {@code VkAllocationCallbacks} were provided when {@code pipeline} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code pipeline} $must be externally synchronized"
		)}"""

@JvmField val vkDestroyPipelineCache =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code pipelineCache} is not #NULL_HANDLE, {@code pipelineCache} $must be a valid {@code VkPipelineCache} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code pipelineCache} is a valid handle, it $must have been created, allocated, or retrieved from {@code device}",
			"If {@code VkAllocationCallbacks} were provided when {@code pipelineCache} was created, a compatible set of callbacks $must be provided here",
			"If no {@code VkAllocationCallbacks} were provided when {@code pipelineCache} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code pipelineCache} $must be externally synchronized"
		)}"""

@JvmField val vkDestroyPipelineLayout =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code pipelineLayout} is not #NULL_HANDLE, {@code pipelineLayout} $must be a valid {@code VkPipelineLayout} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code pipelineLayout} is a valid handle, it $must have been created, allocated, or retrieved from {@code device}",
			"If {@code VkAllocationCallbacks} were provided when {@code pipelineLayout} was created, a compatible set of callbacks $must be provided here",
			"If no {@code VkAllocationCallbacks} were provided when {@code pipelineLayout} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code pipelineLayout} $must be externally synchronized"
		)}"""

@JvmField val vkDestroyQueryPool =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code queryPool} is not #NULL_HANDLE, {@code queryPool} $must be a valid {@code VkQueryPool} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code queryPool} is a valid handle, it $must have been created, allocated, or retrieved from {@code device}",
			"All submitted commands that refer to {@code queryPool} $must have completed execution",
			"If {@code VkAllocationCallbacks} were provided when {@code queryPool} was created, a compatible set of callbacks $must be provided here",
			"If no {@code VkAllocationCallbacks} were provided when {@code queryPool} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code queryPool} $must be externally synchronized"
		)}"""

@JvmField val vkDestroyRenderPass =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code renderPass} is not #NULL_HANDLE, {@code renderPass} $must be a valid {@code VkRenderPass} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code renderPass} is a valid handle, it $must have been created, allocated, or retrieved from {@code device}",
			"All submitted commands that refer to {@code renderPass} $must have completed execution",
			"If {@code VkAllocationCallbacks} were provided when {@code renderPass} was created, a compatible set of callbacks $must be provided here",
			"If no {@code VkAllocationCallbacks} were provided when {@code renderPass} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code renderPass} $must be externally synchronized"
		)}"""

@JvmField val vkDestroySampler =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code sampler} is not #NULL_HANDLE, {@code sampler} $must be a valid {@code VkSampler} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code sampler} is a valid handle, it $must have been created, allocated, or retrieved from {@code device}",
			"All submitted commands that refer to {@code sampler} $must have completed execution",
			"If {@code VkAllocationCallbacks} were provided when {@code sampler} was created, a compatible set of callbacks $must be provided here",
			"If no {@code VkAllocationCallbacks} were provided when {@code sampler} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code sampler} $must be externally synchronized"
		)}"""

@JvmField val vkDestroySemaphore =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code semaphore} is not #NULL_HANDLE, {@code semaphore} $must be a valid {@code VkSemaphore} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code semaphore} is a valid handle, it $must have been created, allocated, or retrieved from {@code device}",
			"{@code semaphore} $mustnot be associated with any queue command that has not yet completed execution on that queue",
			"If {@code VkAllocationCallbacks} were provided when {@code semaphore} was created, a compatible set of callbacks $must be provided here",
			"If no {@code VkAllocationCallbacks} were provided when {@code semaphore} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code semaphore} $must be externally synchronized"
		)}"""

@JvmField val vkDestroyShaderModule =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code shaderModule} is not #NULL_HANDLE, {@code shaderModule} $must be a valid {@code VkShaderModule} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code shaderModule} is a valid handle, it $must have been created, allocated, or retrieved from {@code device}",
			"If {@code VkAllocationCallbacks} were provided when {@code shaderModule} was created, a compatible set of callbacks $must be provided here",
			"If no {@code VkAllocationCallbacks} were provided when {@code shaderModule} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code shaderModule} $must be externally synchronized"
		)}"""

@JvmField val vkDestroySurfaceKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code instance} $must be a valid {@code VkInstance} handle",
			"If {@code surface} is not #NULL_HANDLE, {@code surface} $must be a valid {@code VkSurfaceKHR} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code surface} is a valid handle, it $must have been created, allocated, or retrieved from {@code instance}",
			"All {@code VkSwapchainKHR} objects created for {@code surface} $must have been destroyed prior to destroying {@code surface}",
			"If {@code VkAllocationCallbacks} were provided when {@code surface} was created, a compatible set of callbacks $must be provided here",
			"If no {@code VkAllocationCallbacks} were provided when {@code surface} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code surface} $must be externally synchronized"
		)}"""

@JvmField val vkDestroySwapchainKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code swapchain} is not #NULL_HANDLE, {@code swapchain} $must be a valid {@code VkSwapchainKHR} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"All uses of presentable images acquired from {@code swapchain} $must have completed execution",
			"If {@code VkAllocationCallbacks} were provided when {@code swapchain} was created, a compatible set of callbacks $must be provided here",
			"If no {@code VkAllocationCallbacks} were provided when {@code swapchain} was created, {@code pAllocator} $must be $NULL"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code swapchain} $must be externally synchronized"
		)}"""

@JvmField val vkDeviceWaitIdle =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to all {@code VkQueue} objects created from {@code device} $must be externally synchronized"
		)}"""

@JvmField val vkEndCommandBuffer =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code commandBuffer} $must be in the recording state",
			"If {@code commandBuffer} is a primary command buffer, there $mustnot be an active render pass instance",
			"All queries made active during the recording of {@code commandBuffer} $must have been made inactive"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkEnumerateDeviceExtensionProperties =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"If {@code pLayerName} is not $NULL, {@code pLayerName} $must be a null-terminated string",
			"{@code pPropertyCount} $must be a pointer to a {@code uint32_t} value",
			"""
			If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not $NULL, {@code pProperties} $must be a pointer to an
			array of {@code pPropertyCount} ##VkExtensionProperties structures
			""",
			"If {@code pLayerName} is not $NULL, it $must be the name of a layer returned by #EnumerateDeviceLayerProperties()"
		)}"""

@JvmField val vkEnumerateDeviceLayerProperties =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code pPropertyCount} $must be a pointer to a {@code uint32_t} value",
			"""
			If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not $NULL, {@code pProperties} $must be a pointer to an
			array of {@code pPropertyCount} ##VkLayerProperties structures
			"""
		)}"""

@JvmField val vkEnumerateInstanceExtensionProperties =
	"""<h5>Valid Usage</h5>
		${ul(
			"If {@code pLayerName} is not $NULL, {@code pLayerName} $must be a null-terminated string",
			"{@code pPropertyCount} $must be a pointer to a {@code uint32_t} value",
			"""
			If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not $NULL, {@code pProperties} $must be a pointer to an
			array of {@code pPropertyCount} ##VkExtensionProperties structures
			""",
			"If {@code pLayerName} is not $NULL, it $must be the name of a layer returned by #EnumerateInstanceLayerProperties()"
		)}"""

@JvmField val vkEnumerateInstanceLayerProperties =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code pPropertyCount} $must be a pointer to a {@code uint32_t} value",
			"""
			If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not $NULL, {@code pProperties} $must be a pointer to an
			array of {@code pPropertyCount} ##VkLayerProperties structures
			"""
		)}"""

@JvmField val vkEnumeratePhysicalDevices =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code instance} $must be a valid {@code VkInstance} handle",
			"{@code pPhysicalDeviceCount} $must be a pointer to a {@code uint32_t} value",
			"""
			If the value referenced by {@code pPhysicalDeviceCount} is not 0, and {@code pPhysicalDevices} is not $NULL, {@code pPhysicalDevices} $must be a
			pointer to an array of {@code pPhysicalDeviceCount} {@code VkPhysicalDevice} handles
			"""
		)}"""

@JvmField val vkFlushMappedMemoryRanges =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pMemoryRanges} $must be a pointer to an array of {@code memoryRangeCount} valid ##VkMappedMemoryRange structures",
			"{@code memoryRangeCount} $must be greater than 0"
		)}"""

@JvmField val vkFreeCommandBuffers =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code commandPool} $must be a valid {@code VkCommandPool} handle",
			"{@code commandBufferCount} $must be greater than 0",
			"{@code commandPool} $must have been created, allocated, or retrieved from {@code device}",
			"Each element of {@code pCommandBuffers} that is a valid handle $must have been created, allocated, or retrieved from {@code commandPool}",
			"All elements of {@code pCommandBuffers} $mustnot be pending execution",
			"""
			{@code pCommandBuffers} $must be a pointer to an array of {@code commandBufferCount} {@code VkCommandBuffer} handles, each element of which $must
			either be a valid handle or #NULL_HANDLE
			"""
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandPool} $must be externally synchronized",
			"Host access to each member of {@code pCommandBuffers} $must be externally synchronized"
		)}"""

@JvmField val vkFreeDescriptorSets =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code descriptorPool} $must be a valid {@code VkDescriptorPool} handle",
			"{@code descriptorSetCount} $must be greater than 0",
			"{@code descriptorPool} $must have been created, allocated, or retrieved from {@code device}",
			"Each element of {@code pDescriptorSets} that is a valid handle $must have been created, allocated, or retrieved from {@code descriptorPool}",
			"All submitted commands that refer to any element of {@code pDescriptorSets} $must have completed execution",
			"""
			{@code pDescriptorSets} $must be a pointer to an array of {@code descriptorSetCount} {@code VkDescriptorSet} handles, each element of which $must
			either be a valid handle or #NULL_HANDLE
			""",
			"Each valid handle in {@code pDescriptorSets} $must have been allocated from {@code descriptorPool}",
			"{@code descriptorPool} $must have been created with the #DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT flag"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code descriptorPool} $must be externally synchronized",
			"Host access to each member of {@code pDescriptorSets} $must be externally synchronized"
		)}"""

@JvmField val vkFreeMemory =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"If {@code memory} is not #NULL_HANDLE, {@code memory} $must be a valid {@code VkDeviceMemory} handle",
			"If {@code pAllocator} is not $NULL, {@code pAllocator} $must be a pointer to a valid ##VkAllocationCallbacks structure",
			"If {@code memory} is a valid handle, it $must have been created, allocated, or retrieved from {@code device}",
			"All submitted commands that refer to {@code memory} (via images or buffers) $must have completed execution"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code memory} $must be externally synchronized"
		)}"""

@JvmField val vkGetBufferMemoryRequirements =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code buffer} $must be a valid {@code VkBuffer} handle",
			"{@code pMemoryRequirements} $must be a pointer to a ##VkMemoryRequirements structure",
			"{@code buffer} $must have been created, allocated, or retrieved from {@code device}"
		)}"""

@JvmField val vkGetDeviceMemoryCommitment =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code memory} $must be a valid {@code VkDeviceMemory} handle",
			"{@code pCommittedMemoryInBytes} $must be a pointer to a {@code VkDeviceSize} value",
			"{@code memory} $must have been created, allocated, or retrieved from {@code device}",
			"{@code memory} $must have been created with a memory type that reports #MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT"
		)}"""

@JvmField val vkGetDeviceProcAddr =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pName} $must be a null-terminated string"
		)}"""

@JvmField val vkGetDeviceQueue =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pQueue} $must be a pointer to a {@code VkQueue} handle",
			"""
			{@code queueFamilyIndex} $must be one of the queue family indices specified when {@code device} was created, via the ##VkDeviceQueueCreateInfo
			structure
			""",
			"""
			{@code queueIndex} $must be less than the number of queues created for the specified queue family index when {@code device} was created, via the
			{@code queueCount} member of the ##VkDeviceQueueCreateInfo structure
			"""
		)}"""

@JvmField val vkGetDisplayModePropertiesKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code display} $must be a valid {@code VkDisplayKHR} handle",
			"{@code pPropertyCount} $must be a pointer to a {@code uint32_t} value",
			"""
			If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not $NULL, {@code pProperties} $must be a pointer to an
			array of {@code pPropertyCount} ##VkDisplayModePropertiesKHR structures
			"""
		)}"""

@JvmField val vkGetDisplayPlaneCapabilitiesKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code mode} $must be a valid {@code VkDisplayModeKHR} handle",
			"{@code pCapabilities} $must be a pointer to a ##VkDisplayPlaneCapabilitiesKHR structure"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code mode} $must be externally synchronized"
		)}"""

@JvmField val vkGetDisplayPlaneSupportedDisplaysKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code pDisplayCount} $must be a pointer to a {@code uint32_t} value",
			"""
			If the value referenced by {@code pDisplayCount} is not 0, and {@code pDisplays} is not $NULL, {@code pDisplays} $must be a pointer to an array of
			{@code pDisplayCount} {@code VkDisplayKHR} handles
			""",
			"""
			{@code planeIndex} $must be less than the number of display planes supported by the device as determined by calling
			#GetPhysicalDeviceDisplayPlanePropertiesKHR()
			"""
		)}"""

@JvmField val vkGetEventStatus =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code event} $must be a valid {@code VkEvent} handle",
			"{@code event} $must have been created, allocated, or retrieved from {@code device}"
		)}"""

@JvmField val vkGetFenceStatus =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code fence} $must be a valid {@code VkFence} handle",
			"{@code fence} $must have been created, allocated, or retrieved from {@code device}"
		)}"""

@JvmField val vkGetImageMemoryRequirements =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code image} $must be a valid {@code VkImage} handle",
			"{@code pMemoryRequirements} $must be a pointer to a ##VkMemoryRequirements structure",
			"{@code image} $must have been created, allocated, or retrieved from {@code device}"
		)}"""

@JvmField val vkGetImageSparseMemoryRequirements =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code image} $must be a valid {@code VkImage} handle",
			"{@code pSparseMemoryRequirementCount} $must be a pointer to a {@code uint32_t} value",
			"""
			If the value referenced by {@code pSparseMemoryRequirementCount} is not 0, and {@code pSparseMemoryRequirements} is not $NULL,
			{@code pSparseMemoryRequirements} $must be a pointer to an array of {@code pSparseMemoryRequirementCount} ##VkSparseImageMemoryRequirements
			structures
			""",
			"{@code image} $must have been created, allocated, or retrieved from {@code device}"
		)}"""

@JvmField val vkGetImageSubresourceLayout =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code image} $must be a valid {@code VkImage} handle",
			"{@code pSubresource} $must be a pointer to a valid ##VkImageSubresource structure",
			"{@code pLayout} $must be a pointer to a ##VkSubresourceLayout structure",
			"{@code image} $must have been created, allocated, or retrieved from {@code device}",
			"{@code image} $must have been created with {@code tiling} equal to #IMAGE_TILING_LINEAR",
			"The {@code aspectMask} member of {@code pSubresource} $must only have a single bit set"
		)}"""

@JvmField val vkGetInstanceProcAddr =
	"""<h5>Valid Usage</h5>
		${ul(
			"If {@code instance} is not $NULL, {@code instance} $must be a valid {@code VkInstance} handle",
			"{@code pName} $must be a null-terminated string"
		)}"""

@JvmField val vkGetMemoryWin32HandleNV =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code memory} $must be a valid {@code VkDeviceMemory} handle",
			"{@code handleType} $must be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values",
			"{@code handleType} $mustnot be 0",
			"{@code pHandle} $must be a pointer to a {@code HANDLE} value",
			"{@code memory} $must have been created, allocated, or retrieved from {@code device}"
		)}"""

@JvmField val vkGetPhysicalDeviceDisplayPlanePropertiesKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code pPropertyCount} $must be a pointer to a {@code uint32_t} value",
			"""
			If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not $NULL, {@code pProperties} $must be a pointer to an
			array of {@code pPropertyCount} ##VkDisplayPlanePropertiesKHR structures
			"""
		)}"""

@JvmField val vkGetPhysicalDeviceDisplayPropertiesKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code pPropertyCount} $must be a pointer to a {@code uint32_t} value",
			"""
			If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not $NULL, {@code pProperties} $must be a pointer to an
			array of {@code pPropertyCount} ##VkDisplayPropertiesKHR structures
			"""
		)}"""

@JvmField val vkGetPhysicalDeviceExternalImageFormatPropertiesNV =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code format} $must be a valid {@code VkFormat} value",
			"{@code type} $must be a valid {@code VkImageType} value",
			"{@code tiling} $must be a valid {@code VkImageTiling} value",
			"{@code usage} $must be a valid combination of {@code VkImageUsageFlagBits} values",
			"{@code usage} $mustnot be 0",
			"{@code flags} $must be a valid combination of {@code VkImageCreateFlagBits} values",
			"{@code flags} $mustnot be 0",
			"{@code externalHandleType} $must be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values",
			"{@code externalHandleType} $mustnot be 0",
			"{@code pExternalImageFormatProperties} $must be a pointer to a ##VkExternalImageFormatPropertiesNV structure"
		)}"""

@JvmField val vkGetPhysicalDeviceFeatures =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code pFeatures} $must be a pointer to a ##VkPhysicalDeviceFeatures structure"
		)}"""

@JvmField val vkGetPhysicalDeviceFormatProperties =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code format} $must be a valid {@code VkFormat} value",
			"{@code pFormatProperties} $must be a pointer to a ##VkFormatProperties structure"
		)}"""

@JvmField val vkGetPhysicalDeviceImageFormatProperties =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code format} $must be a valid {@code VkFormat} value",
			"{@code type} $must be a valid {@code VkImageType} value",
			"{@code tiling} $must be a valid {@code VkImageTiling} value",
			"{@code usage} $must be a valid combination of {@code VkImageUsageFlagBits} values",
			"{@code usage} $mustnot be 0",
			"{@code flags} $must be a valid combination of {@code VkImageCreateFlagBits} values",
			"{@code pImageFormatProperties} $must be a pointer to a ##VkImageFormatProperties structure"
		)}"""

@JvmField val vkGetPhysicalDeviceMemoryProperties =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code pMemoryProperties} $must be a pointer to a ##VkPhysicalDeviceMemoryProperties structure"
		)}"""

@JvmField val vkGetPhysicalDeviceMirPresentationSupportKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code connection} $must be a pointer to a {@code MirConnection} value",
			"""
			{@code queueFamilyIndex} $must be less than {@code pQueueFamilyPropertyCount} returned by #GetPhysicalDeviceQueueFamilyProperties() for the given
			{@code physicalDevice}
			"""
		)}"""

@JvmField val vkGetPhysicalDeviceProperties =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code pProperties} $must be a pointer to a ##VkPhysicalDeviceProperties structure"
		)}"""

@JvmField val vkGetPhysicalDeviceQueueFamilyProperties =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code pQueueFamilyPropertyCount} $must be a pointer to a {@code uint32_t} value",
			"""
			If the value referenced by {@code pQueueFamilyPropertyCount} is not 0, and {@code pQueueFamilyProperties} is not $NULL,
			{@code pQueueFamilyProperties} $must be a pointer to an array of {@code pQueueFamilyPropertyCount} ##VkQueueFamilyProperties structures
			"""
		)}"""

@JvmField val vkGetPhysicalDeviceSparseImageFormatProperties =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code format} $must be a valid {@code VkFormat} value",
			"{@code type} $must be a valid {@code VkImageType} value",
			"{@code samples} $must be a valid {@code VkSampleCountFlagBits} value",
			"{@code usage} $must be a valid combination of {@code VkImageUsageFlagBits} values",
			"{@code usage} $mustnot be 0",
			"{@code tiling} $must be a valid {@code VkImageTiling} value",
			"{@code pPropertyCount} $must be a pointer to a {@code uint32_t} value",
			"""
			If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not $NULL, {@code pProperties} $must be a pointer to an
			array of {@code pPropertyCount} ##VkSparseImageFormatProperties structures
			""",
			"""
			{@code samples} $must be a bit value that is set in ##VkImageFormatProperties{@code ::sampleCounts} returned by
			#GetPhysicalDeviceImageFormatProperties() with {@code format}, {@code type}, {@code tiling}, and {@code usage} equal to those in this command and
			{@code flags} equal to the value that is set in sname::VkImageCreateInfo::pname::flags when the image is created
			"""
		)}"""

@JvmField val vkGetPhysicalDeviceSurfaceCapabilitiesKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code surface} $must be a valid {@code VkSurfaceKHR} handle",
			"{@code pSurfaceCapabilities} $must be a pointer to a ##VkSurfaceCapabilitiesKHR structure"
		)}"""

@JvmField val vkGetPhysicalDeviceSurfaceFormatsKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code surface} $must be a valid {@code VkSurfaceKHR} handle",
			"{@code pSurfaceFormatCount} $must be a pointer to a {@code uint32_t} value",
			"""
			If the value referenced by {@code pSurfaceFormatCount} is not 0, and {@code pSurfaceFormats} is not $NULL, {@code pSurfaceFormats} $must be a
			pointer to an array of {@code pSurfaceFormatCount} ##VkSurfaceFormatKHR structures
			"""
		)}"""

@JvmField val vkGetPhysicalDeviceSurfacePresentModesKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code surface} $must be a valid {@code VkSurfaceKHR} handle",
			"{@code pPresentModeCount} $must be a pointer to a {@code uint32_t} value",
			"""
			If the value referenced by {@code pPresentModeCount} is not 0, and {@code pPresentModes} is not $NULL, {@code pPresentModes} $must be a pointer to
			an array of {@code pPresentModeCount} {@code VkPresentModeKHR} values
			"""
		)}"""

@JvmField val vkGetPhysicalDeviceSurfaceSupportKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code surface} $must be a valid {@code VkSurfaceKHR} handle",
			"{@code pSupported} $must be a pointer to a {@code VkBool32} value",
			"""
			{@code queueFamilyIndex} $must be less than {@code pQueueFamilyPropertyCount} returned by #GetPhysicalDeviceQueueFamilyProperties() for the given
			{@code physicalDevice}
			"""
		)}"""

@JvmField val vkGetPhysicalDeviceWaylandPresentationSupportKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code display} $must be a pointer to a {@code wl_display} value",
			"""
			{@code queueFamilyIndex} $must be less than {@code pQueueFamilyPropertyCount} returned by #GetPhysicalDeviceQueueFamilyProperties() for the given
			{@code physicalDevice}
			"""
		)}"""

@JvmField val vkGetPhysicalDeviceWin32PresentationSupportKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"""
			{@code queueFamilyIndex} $must be less than {@code pQueueFamilyPropertyCount} returned by #GetPhysicalDeviceQueueFamilyProperties() for the given
			{@code physicalDevice}
			"""
		)}"""

@JvmField val vkGetPhysicalDeviceXcbPresentationSupportKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code connection} $must be a pointer to a {@code xcb_connection_t} value",
			"""
			{@code queueFamilyIndex} $must be less than {@code pQueueFamilyPropertyCount} returned by #GetPhysicalDeviceQueueFamilyProperties() for the given
			{@code physicalDevice}
			"""
		)}"""

@JvmField val vkGetPhysicalDeviceXlibPresentationSupportKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code physicalDevice} $must be a valid {@code VkPhysicalDevice} handle",
			"{@code dpy} $must be a pointer to a {@code Display} value",
			"""
			{@code queueFamilyIndex} $must be less than {@code pQueueFamilyPropertyCount} returned by #GetPhysicalDeviceQueueFamilyProperties() for the given
			{@code physicalDevice}
			"""
		)}"""

@JvmField val vkGetPipelineCacheData =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pipelineCache} $must be a valid {@code VkPipelineCache} handle",
			"{@code pDataSize} $must be a pointer to a {@code size_t} value",
			"""
			If the value referenced by {@code pDataSize} is not 0, and {@code pData} is not $NULL, {@code pData} $must be a pointer to an array of
			{@code pDataSize} bytes
			""",
			"{@code pipelineCache} $must have been created, allocated, or retrieved from {@code device}"
		)}"""

@JvmField val vkGetQueryPoolResults =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code queryPool} $must be a valid {@code VkQueryPool} handle",
			"{@code pData} $must be a pointer to an array of {@code dataSize} bytes",
			"{@code flags} $must be a valid combination of {@code VkQueryResultFlagBits} values",
			"{@code dataSize} $must be greater than 0",
			"{@code queryPool} $must have been created, allocated, or retrieved from {@code device}",
			"{@code firstQuery} $must be less than the number of queries in {@code queryPool}",
			"If #QUERY_RESULT_64_BIT is not set in {@code flags} then {@code pData} and {@code stride} $must be multiples of 4",
			"If #QUERY_RESULT_64_BIT is set in {@code flags} then {@code pData} and {@code stride} $must be multiples of 8",
			"The sum of {@code firstQuery} and {@code queryCount} $must be less than or equal to the number of queries in {@code queryPool}",
			"{@code dataSize} $must be large enough to contain the result of each query, as described here",
			"If the {@code queryType} used to create {@code queryPool} was #QUERY_TYPE_TIMESTAMP, {@code flags} $mustnot contain #QUERY_RESULT_PARTIAL_BIT"
		)}"""

@JvmField val vkGetRenderAreaGranularity =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code renderPass} $must be a valid {@code VkRenderPass} handle",
			"{@code pGranularity} $must be a pointer to a ##VkExtent2D structure",
			"{@code renderPass} $must have been created, allocated, or retrieved from {@code device}"
		)}"""

@JvmField val vkGetSwapchainImagesKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code swapchain} $must be a valid {@code VkSwapchainKHR} handle",
			"{@code pSwapchainImageCount} $must be a pointer to a {@code uint32_t} value",
			"""
			If the value referenced by {@code pSwapchainImageCount} is not 0, and {@code pSwapchainImages} is not $NULL, {@code pSwapchainImages} $must be a
			pointer to an array of {@code pSwapchainImageCount} {@code VkImage} handles
			"""
		)}"""

@JvmField val vkInvalidateMappedMemoryRanges =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pMemoryRanges} $must be a pointer to an array of {@code memoryRangeCount} valid ##VkMappedMemoryRange structures",
			"{@code memoryRangeCount} $must be greater than 0"
		)}"""

@JvmField val vkMapMemory =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code memory} $must be a valid {@code VkDeviceMemory} handle",
			"{@code flags} $must be 0",
			"{@code ppData} $must be a pointer to a pointer",
			"{@code memory} $must have been created, allocated, or retrieved from {@code device}",
			"{@code memory} $mustnot currently be mapped",
			"{@code offset} $must be less than the size of {@code memory}",
			"If {@code size} is not equal to #WHOLE_SIZE, {@code size} $must be greater than 0",
			"If {@code size} is not equal to #WHOLE_SIZE, {@code size} $must be less than or equal to the size of the {@code memory} minus {@code offset}",
			"{@code memory} $must have been created with a memory type that reports #MEMORY_PROPERTY_HOST_VISIBLE_BIT"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code memory} $must be externally synchronized"
		)}"""

@JvmField val vkMergePipelineCaches =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code dstCache} $must be a valid {@code VkPipelineCache} handle",
			"{@code pSrcCaches} $must be a pointer to an array of {@code srcCacheCount} valid {@code VkPipelineCache} handles",
			"{@code srcCacheCount} $must be greater than 0",
			"{@code dstCache} $must have been created, allocated, or retrieved from {@code device}",
			"Each element of {@code pSrcCaches} $must have been created, allocated, or retrieved from {@code device}",
			"{@code dstCache} $mustnot appear in the list of source caches"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code dstCache} $must be externally synchronized"
		)}"""

@JvmField val vkQueueBindSparse =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code queue} $must be a valid {@code VkQueue} handle",
			"If {@code bindInfoCount} is not 0, {@code pBindInfo} $must be a pointer to an array of {@code bindInfoCount} valid ##VkBindSparseInfo structures",
			"If {@code fence} is not #NULL_HANDLE, {@code fence} $must be a valid {@code VkFence} handle",
			"The {@code queue} $must support sparse binding operations",
			"Both of {@code fence}, and {@code queue} that are valid handles $must have been created, allocated, or retrieved from the same {@code VkDevice}",
			"{@code fence} $must be unsignaled",
			"{@code fence} $mustnot be associated with any other queue command that has not yet completed execution on that queue"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code queue} $must be externally synchronized",
			"Host access to {@code pBindInfo}[].pWaitSemaphores[] $must be externally synchronized",
			"Host access to {@code pBindInfo}[].pSignalSemaphores[] $must be externally synchronized",
			"Host access to {@code pBindInfo}[].pBufferBinds[].buffer $must be externally synchronized",
			"Host access to {@code pBindInfo}[].pImageOpaqueBinds[].image $must be externally synchronized",
			"Host access to {@code pBindInfo}[].pImageBinds[].image $must be externally synchronized",
			"Host access to {@code fence} $must be externally synchronized"
		)}"""

@JvmField val vkQueuePresentKHR =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code queue} $must be a valid {@code VkQueue} handle",
			"{@code pPresentInfo} $must be a pointer to a valid ##VkPresentInfoKHR structure",
			"""
			Any given element of {@code pSwapchains} member of {@code pPresentInfo} $must be a swapchain that is created for a surface for which presentation
			is supported from {@code queue} as determined using a call to #GetPhysicalDeviceSurfaceSupportKHR()
			""",
			"""
			If more than one member of 'pSwapchains' was created from a display surface, all display surfaces referenced that refer to the same display $must
			use the same display mode.
			"""
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code queue} $must be externally synchronized",
			"Host access to {@code pPresentInfo.pWaitSemaphores}[] $must be externally synchronized",
			"Host access to {@code pPresentInfo.pSwapchains}[] $must be externally synchronized"
		)}"""

@JvmField val vkQueueSubmit =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code queue} $must be a valid {@code VkQueue} handle",
			"If {@code submitCount} is not 0, {@code pSubmits} $must be a pointer to an array of {@code submitCount} valid ##VkSubmitInfo structures",
			"If {@code fence} is not #NULL_HANDLE, {@code fence} $must be a valid {@code VkFence} handle",
			"Both of {@code fence}, and {@code queue} that are valid handles $must have been created, allocated, or retrieved from the same {@code VkDevice}",
			"If {@code fence} is not #NULL_HANDLE, {@code fence} $must be unsignaled",
			"""
			If {@code fence} is not #NULL_HANDLE, {@code fence} $mustnot be associated with any other queue command that has not yet completed execution on
			that queue
			"""
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code queue} $must be externally synchronized",
			"Host access to {@code pSubmits}[].pWaitSemaphores[] $must be externally synchronized",
			"Host access to {@code pSubmits}[].pSignalSemaphores[] $must be externally synchronized",
			"Host access to {@code fence} $must be externally synchronized"
		)}"""

@JvmField val vkQueueWaitIdle =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code queue} $must be a valid {@code VkQueue} handle"
		)}"""

@JvmField val vkResetCommandBuffer =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code commandBuffer} $must be a valid {@code VkCommandBuffer} handle",
			"{@code flags} $must be a valid combination of {@code VkCommandBufferResetFlagBits} values",
			"{@code commandBuffer} $mustnot currently be pending execution",
			"{@code commandBuffer} $must have been allocated from a pool that was created with the #COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandBuffer} $must be externally synchronized"
		)}"""

@JvmField val vkResetCommandPool =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code commandPool} $must be a valid {@code VkCommandPool} handle",
			"{@code flags} $must be a valid combination of {@code VkCommandPoolResetFlagBits} values",
			"{@code commandPool} $must have been created, allocated, or retrieved from {@code device}",
			"All {@code VkCommandBuffer} objects allocated from {@code commandPool} $mustnot currently be pending execution"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code commandPool} $must be externally synchronized"
		)}"""

@JvmField val vkResetDescriptorPool =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code descriptorPool} $must be a valid {@code VkDescriptorPool} handle",
			"{@code flags} $must be 0",
			"{@code descriptorPool} $must have been created, allocated, or retrieved from {@code device}",
			"All uses of {@code descriptorPool} (via any allocated descriptor sets) $must have completed execution"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code descriptorPool} $must be externally synchronized",
			"Host access to any {@code VkDescriptorSet} objects allocated from {@code descriptorPool} $must be externally synchronized"
		)}"""

@JvmField val vkResetEvent =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code event} $must be a valid {@code VkEvent} handle",
			"{@code event} $must have been created, allocated, or retrieved from {@code device}",
			"{@code event} $mustnot be waited on by a #CmdWaitEvents() command that is currently executing"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code event} $must be externally synchronized"
		)}"""

@JvmField val vkResetFences =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pFences} $must be a pointer to an array of {@code fenceCount} valid {@code VkFence} handles",
			"{@code fenceCount} $must be greater than 0",
			"Each element of {@code pFences} $must have been created, allocated, or retrieved from {@code device}",
			"Any given element of {@code pFences} $mustnot currently be associated with any queue command that has not yet completed execution on that queue"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to each member of {@code pFences} $must be externally synchronized"
		)}"""

@JvmField val vkSetEvent =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code event} $must be a valid {@code VkEvent} handle",
			"{@code event} $must have been created, allocated, or retrieved from {@code device}"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code event} $must be externally synchronized"
		)}"""

@JvmField val vkUnmapMemory =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code memory} $must be a valid {@code VkDeviceMemory} handle",
			"{@code memory} $must have been created, allocated, or retrieved from {@code device}",
			"{@code memory} $must currently be mapped"
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code memory} $must be externally synchronized"
		)}"""

@JvmField val vkUpdateDescriptorSets =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"""
			If {@code descriptorWriteCount} is not 0, {@code pDescriptorWrites} $must be a pointer to an array of {@code descriptorWriteCount} valid
			##VkWriteDescriptorSet structures
			""",
			"""
			If {@code descriptorCopyCount} is not 0, {@code pDescriptorCopies} $must be a pointer to an array of {@code descriptorCopyCount} valid
			##VkCopyDescriptorSet structures
			"""
		)}

		<h5>Host Synchronization</h5>
		${ul(
			"Host access to {@code pDescriptorWrites}[].dstSet $must be externally synchronized",
			"Host access to {@code pDescriptorCopies}[].dstSet $must be externally synchronized"
		)}"""

@JvmField val vkWaitForFences =
	"""<h5>Valid Usage</h5>
		${ul(
			"{@code device} $must be a valid {@code VkDevice} handle",
			"{@code pFences} $must be a pointer to an array of {@code fenceCount} valid {@code VkFence} handles",
			"{@code fenceCount} $must be greater than 0",
			"Each element of {@code pFences} $must have been created, allocated, or retrieved from {@code device}"
		)}"""

}