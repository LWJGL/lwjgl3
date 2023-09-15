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
    documentation =
        """
        The core Vulkan 1.2 functionality.
        """

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES".."49",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES".."50",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES".."51",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES".."52"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO".."1000147000"
    )

    EnumConstant(
        "Extends {@code VkSamplerAddressMode}.",

        "SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE".."4"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2".."1000109000",
        "STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2".."1000109001",
        "STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2".."1000109002",
        "STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2".."1000109003",
        "STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2".."1000109004",
        "STRUCTURE_TYPE_SUBPASS_BEGIN_INFO".."1000109005",
        "STRUCTURE_TYPE_SUBPASS_END_INFO".."1000109006"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES".."1000177000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES".."1000196000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES".."1000180000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES".."1000082000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES".."1000197000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO".."1000161000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES".."1000161001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES".."1000161002",
        "STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO".."1000161003",
        "STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT".."1000161004"
    )

    EnumConstant(
        "Extends {@code VkDescriptorPoolCreateFlagBits}.",

        "DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT".enum(0x00000002)
    )

    EnumConstant(
        "Extends {@code VkDescriptorSetLayoutCreateFlagBits}.",

        "DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT".enum(0x00000002)
    )

    EnumConstant(
        "Extends {@code VkResult}.",

        "ERROR_FRAGMENTATION".."-1000161000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES".."1000199000",
        "STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE".."1000199001"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES".."1000221000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO".."1000246000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES".."1000130000",
        "STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO".."1000130001"
    )

    EnumConstant(
        "Extends {@code VkFormatFeatureFlagBits}.",

        "FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT".enum(0x00010000)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES".."1000211000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES".."1000108000",
        "STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO".."1000108001",
        "STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO".."1000108002",
        "STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO".."1000108003"
    )

    EnumConstant(
        "Extends {@code VkFramebufferCreateFlagBits}.",

        "FRAMEBUFFER_CREATE_IMAGELESS_BIT".enum(0x00000001)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES".."1000253000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES".."1000175000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES".."1000241000",
        "STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT".."1000241001",
        "STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT".."1000241002"
    )

    EnumConstant(
        "Extends {@code VkImageLayout}.",

        "IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL".."1000241000",
        "IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL".."1000241001",
        "IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL".."1000241002",
        "IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL".."1000241003"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES".."1000261000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES".."1000207000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES".."1000207001",
        "STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO".."1000207002",
        "STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO".."1000207003",
        "STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO".."1000207004",
        "STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO".."1000207005"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES".."1000257000",
        "STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO".."1000244001",
        "STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO".."1000257002",
        "STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO".."1000257003",
        "STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO".."1000257004"
    )

    EnumConstant(
        "Extends {@code VkBufferUsageFlagBits}.",

        "BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT".enum(0x00020000)
    )

    EnumConstant(
        "Extends {@code VkBufferCreateFlagBits}.",

        "BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT".enum(0x00000010)
    )

    EnumConstant(
        "Extends {@code VkMemoryAllocateFlagBits}.",

        "MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT".enum(0x00000002),
        "MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT".enum(0x00000004)
    )

    EnumConstant(
        "Extends {@code VkResult}.",

        "ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS".."-1000257000"
    )

    EnumConstant(
        """
        VkDriverId - Khronos driver IDs

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Khronos driver IDs may be allocated by vendors at any time. There may be multiple driver IDs for the same vendor, representing different drivers (for e.g. different platforms, proprietary or open source, etc.). Only the latest canonical versions of this Specification, of the corresponding {@code vk.xml} API Registry, and of the corresponding {@code vulkan_core.h} header file <b>must</b> contain all reserved Khronos driver IDs.

        Only driver IDs registered with Khronos are given symbolic names. There <b>may</b> be unregistered driver IDs returned.
        </div>

        <h5>See Also</h5>
        ##VkPhysicalDeviceDriverProperties, ##VkPhysicalDeviceVulkan12Properties
        """,

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
        "DRIVER_ID_IMAGINATION_OPEN_SOURCE_MESA".."25"
    )

    EnumConstant(
        """
        VkShaderFloatControlsIndependence - Bitmask specifying whether, and how, shader float controls can be set separately

        <h5>Description</h5>
        <ul>
            <li>#SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY specifies that shader float controls for 32-bit floating point <b>can</b> be set independently; other bit widths <b>must</b> be set identically to each other.</li>
            <li>#SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL specifies that shader float controls for all bit widths <b>can</b> be set independently.</li>
            <li>#SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE specifies that shader float controls for all bit widths <b>must</b> be set identically.</li>
        </ul>

        <h5>See Also</h5>
        ##VkPhysicalDeviceFloatControlsProperties, ##VkPhysicalDeviceVulkan12Properties
        """,

        "SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY".."0",
        "SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL".."1",
        "SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE".."2"
    )

    EnumConstant(
        """
        VkResolveModeFlagBits - Bitmask indicating supported depth and stencil resolve modes

        <h5>Description</h5>
        <ul>
            <li>#RESOLVE_MODE_NONE indicates that no resolve operation is done.</li>
            <li>#RESOLVE_MODE_SAMPLE_ZERO_BIT indicates that result of the resolve operation is equal to the value of sample 0.</li>
            <li>#RESOLVE_MODE_AVERAGE_BIT indicates that result of the resolve operation is the average of the sample values.</li>
            <li>#RESOLVE_MODE_MIN_BIT indicates that result of the resolve operation is the minimum of the sample values.</li>
            <li>#RESOLVE_MODE_MAX_BIT indicates that result of the resolve operation is the maximum of the sample values.</li>
        </ul>

        When no resolve mode is specified, #RESOLVE_MODE_AVERAGE_BIT is used.

        <h5>See Also</h5>
        ##VkRenderingAttachmentInfo, ##VkSubpassDescriptionDepthStencilResolve
        """,

        "RESOLVE_MODE_NONE".."0",
        "RESOLVE_MODE_SAMPLE_ZERO_BIT".enum(0x00000001),
        "RESOLVE_MODE_AVERAGE_BIT".enum(0x00000002),
        "RESOLVE_MODE_MIN_BIT".enum(0x00000004),
        "RESOLVE_MODE_MAX_BIT".enum(0x00000008)
    )

    EnumConstant(
        """
        VkDescriptorBindingFlagBits - Bitmask specifying descriptor set layout binding properties

        <h5>Description</h5>
        <ul>
            <li>#DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT indicates that if descriptors in this binding are updated between when the descriptor set is bound in a command buffer and when that command buffer is submitted to a queue, then the submission will use the most recently set descriptors for this binding and the updates do not invalidate the command buffer. Descriptor bindings created with this flag are also partially exempt from the external synchronization requirement in #UpdateDescriptorSetWithTemplateKHR() and #UpdateDescriptorSets(). Multiple descriptors with this flag set <b>can</b> be updated concurrently in different threads, though the same descriptor <b>must</b> not be updated concurrently by two threads. Descriptors with this flag set <b>can</b> be updated concurrently with the set being bound to a command buffer in another thread, but not concurrently with the set being reset or freed.</li>
            <li>#DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT indicates that descriptors in this binding that are not <em>dynamically used</em> need not contain valid descriptors at the time the descriptors are consumed. A descriptor is dynamically used if any shader invocation executes an instruction that performs any memory access using the descriptor. If a descriptor is not dynamically used, any resource referenced by the descriptor is not considered to be referenced during command execution.</li>
            <li>#DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT indicates that descriptors in this binding <b>can</b> be updated after a command buffer has bound this descriptor set, or while a command buffer that uses this descriptor set is pending execution, as long as the descriptors that are updated are not used by those command buffers. Descriptor bindings created with this flag are also partially exempt from the external synchronization requirement in #UpdateDescriptorSetWithTemplateKHR() and #UpdateDescriptorSets() in the same way as for #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT. If #DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT is also set, then descriptors <b>can</b> be updated as long as they are not dynamically used by any shader invocations. If #DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT is not set, then descriptors <b>can</b> be updated as long as they are not statically used by any shader invocations.</li>
            <li>#DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT indicates that this is a <em>variable-sized descriptor binding</em> whose size will be specified when a descriptor set is allocated using this layout. The value of {@code descriptorCount} is treated as an upper bound on the size of the binding. This <b>must</b> only be used for the last binding in the descriptor set layout (i.e. the binding with the largest value of {@code binding}). For the purposes of counting against limits such as {@code maxDescriptorSet}* and {@code maxPerStageDescriptor}*, the full value of {@code descriptorCount} is counted, except for descriptor bindings with a descriptor type of #DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK, when ##VkDescriptorSetLayoutCreateInfo{@code ::flags} does not contain #DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT. In this case, {@code descriptorCount} specifies the upper bound on the byte size of the binding; thus it counts against the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-maxInlineUniformBlockSize">{@code maxInlineUniformBlockSize}</a> and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-maxInlineUniformTotalSize">{@code maxInlineUniformTotalSize}</a> limits instead.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Note that while #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT and #DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT both involve updates to descriptor sets after they are bound, #DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT is a weaker requirement since it is only about descriptors that are not used, whereas #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT requires the implementation to observe updates to descriptors that are used.
        </div>
        """,

        "DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT".enum(0x00000001),
        "DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT".enum(0x00000002),
        "DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT".enum(0x00000004),
        "DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT".enum(0x00000008)
    )

    EnumConstant(
        """
        VkSamplerReductionMode - Specify reduction mode for texture filtering

        <h5>Description</h5>
        <ul>
            <li>#SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE specifies that texel values are combined by computing a weighted average of values in the footprint, using weights as specified in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#textures-unnormalized-to-integer">the image operations chapter</a>.</li>
            <li>#SAMPLER_REDUCTION_MODE_MIN specifies that texel values are combined by taking the component-wise minimum of values in the footprint with non-zero weights.</li>
            <li>#SAMPLER_REDUCTION_MODE_MAX specifies that texel values are combined by taking the component-wise maximum of values in the footprint with non-zero weights.</li>
            <li>#SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM specifies values are combined as described by #SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE, followed by a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#textures-texel-range-clamp">texel range clamp</a>.</li>
        </ul>

        <h5>See Also</h5>
        ##VkSamplerReductionModeCreateInfo
        """,

        "SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE".."0",
        "SAMPLER_REDUCTION_MODE_MIN".."1",
        "SAMPLER_REDUCTION_MODE_MAX".."2"
    )

    EnumConstant(
        """
        VkSemaphoreType - Specifies the type of a semaphore object

        <h5>Description</h5>
        <ul>
            <li>#SEMAPHORE_TYPE_BINARY specifies a <em>binary semaphore</em> type that has a boolean payload indicating whether the semaphore is currently signaled or unsignaled. When created, the semaphore is in the unsignaled state.</li>
            <li>#SEMAPHORE_TYPE_TIMELINE specifies a <em>timeline semaphore</em> type that has a strictly increasing 64-bit unsigned integer payload indicating whether the semaphore is signaled with respect to a particular reference value. When created, the semaphore payload has the value given by the {@code initialValue} field of ##VkSemaphoreTypeCreateInfo.</li>
        </ul>

        <h5>See Also</h5>
        ##VkSemaphoreTypeCreateInfo
        """,

        "SEMAPHORE_TYPE_BINARY".."0",
        "SEMAPHORE_TYPE_TIMELINE".."1"
    )

    EnumConstant(
        """
        VkSemaphoreWaitFlagBits - Bitmask specifying additional parameters of a semaphore wait operation

        <h5>Description</h5>
        <ul>
            <li>#SEMAPHORE_WAIT_ANY_BIT specifies that the semaphore wait condition is that at least one of the semaphores in ##VkSemaphoreWaitInfo{@code ::pSemaphores} has reached the value specified by the corresponding element of ##VkSemaphoreWaitInfo{@code ::pValues}. If #SEMAPHORE_WAIT_ANY_BIT is not set, the semaphore wait condition is that all of the semaphores in ##VkSemaphoreWaitInfo{@code ::pSemaphores} have reached the value specified by the corresponding element of ##VkSemaphoreWaitInfo{@code ::pValues}.</li>
        </ul>
        """,

        "SEMAPHORE_WAIT_ANY_BIT".enum(0x00000001)
    )

    // Promoted from VK_KHR_draw_indirect_count (extension 170)

    void(
        "CmdDrawIndirectCount",
        """
        Draw primitives with indirect parameters and draw count.

        <h5>C Specification</h5>
        To record a non-indexed draw call with a draw call count sourced from a buffer, call:

        <pre><code>
￿void vkCmdDrawIndirectCount(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    buffer,
￿    VkDeviceSize                                offset,
￿    VkBuffer                                    countBuffer,
￿    VkDeviceSize                                countBufferOffset,
￿    uint32_t                                    maxDrawCount,
￿    uint32_t                                    stride);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdDrawIndirectCountKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    buffer,
￿    VkDeviceSize                                offset,
￿    VkBuffer                                    countBuffer,
￿    VkDeviceSize                                countBufferOffset,
￿    uint32_t                                    maxDrawCount,
￿    uint32_t                                    stride);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdDrawIndirectCountAMD(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    buffer,
￿    VkDeviceSize                                offset,
￿    VkBuffer                                    countBuffer,
￿    VkDeviceSize                                countBufferOffset,
￿    uint32_t                                    maxDrawCount,
￿    uint32_t                                    stride);</code></pre>

        <h5>Description</h5>
        {@code vkCmdDrawIndirectCount} behaves similarly to #CmdDrawIndirect() except that the draw count is read by the device from a buffer during execution. The command will read an unsigned 32-bit integer from {@code countBuffer} located at {@code countBufferOffset} and use this as the draw count.

        <h5>Valid Usage</h5>
        <ul>
            <li>If a {@code VkSampler} created with {@code magFilter} or {@code minFilter} equal to #FILTER_LINEAR and {@code compareEnable} equal to #FALSE is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT</li>
            <li>If a {@code VkSampler} created with {@code mipmapMode} equal to #SAMPLER_MIPMAP_MODE_LINEAR and {@code compareEnable} equal to #FALSE is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT</li>
            <li>If a {@code VkImageView} is sampled with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#textures-depth-compare-operation">depth comparison</a>, the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT</li>
            <li>If a {@code VkImageView} is accessed using atomic operations as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT</li>
            <li>If a #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER descriptor is accessed using atomic operations as a result of this command, then the storage texel buffer’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-buffer-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT</li>
            <li>If a {@code VkImageView} is sampled with #FILTER_CUBIC_EXT as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT</li>
            <li>If the {@link EXTFilterCubic VK_EXT_filter_cubic} extension is not enabled and any {@code VkImageView} is sampled with #FILTER_CUBIC_EXT as a result of this command, it <b>must</b> not have a {@code VkImageViewType} of #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, or #IMAGE_VIEW_TYPE_CUBE_ARRAY</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering, as specified by ##VkFilterCubicImageViewImageFormatPropertiesEXT{@code ::filterCubic} returned by #GetPhysicalDeviceImageFormatProperties2()</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT with a reduction mode of either #SAMPLER_REDUCTION_MODE_MIN or #SAMPLER_REDUCTION_MODE_MAX as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering together with minmax filtering, as specified by ##VkFilterCubicImageViewImageFormatPropertiesEXT{@code ::filterCubicMinmax} returned by #GetPhysicalDeviceImageFormatProperties2()</li>
            <li>
                If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-filter-cubic-range-clamp">{@code cubicRangeClamp}</a> feature is not enabled, then any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT as a result of this command
                <dl>
            <dt><b>must</b> not have a ##VkSamplerReductionModeCreateInfo</dt>
                    <dd>{@code reductionMode} equal to #SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM</dd>
                </dl>
            </li>
            <li>Any {@code VkImageView} being sampled with a ##VkSamplerReductionModeCreateInfo{@code ::reductionMode} equal to #SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM as a result of this command <b>must</b> sample with #FILTER_CUBIC_EXT</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-filter-cubic-weight-selection">{@code selectableCubicWeights}</a> feature is not enabled, then any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT as a result of this command <b>must</b> have ##VkSamplerCubicWeightsCreateInfoQCOM{@code ::cubicWeights} equal to #CUBIC_FILTER_WEIGHTS_CATMULL_ROM_QCOM</li>
            <li>Any {@code VkImage} created with a ##VkImageCreateInfo{@code ::flags} containing #IMAGE_CREATE_CORNER_SAMPLED_BIT_NV sampled as a result of this command <b>must</b> only be sampled using a {@code VkSamplerAddressMode} of #SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE</li>
            <li>For any {@code VkImageView} being written as a storage image where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT</li>
            <li>For any {@code VkImageView} being read as a storage image where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT</li>
            <li>For any {@code VkBufferView} being written as a storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkFormatProperties3">buffer features</a> <b>must</b> contain #FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT</li>
            <li>Any {@code VkBufferView} being read as a storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown} then the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkFormatProperties3">buffer features</a> <b>must</b> contain #FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT</li>
            <li>For each set <em>n</em> that is statically used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-binding">a bound shader</a>, a descriptor set <b>must</b> have been bound to <em>n</em> at the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} or {@code VkDescriptorSetLayout} array that was used to create the current {@code VkPipeline} or {@code VkShaderEXT}, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>For each push constant that is statically used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-binding">a bound shader</a>, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} or {@code VkDescriptorSetLayout} and ##VkPushConstantRange arrays used to create the current {@code VkPipeline} or {@code VkShaderEXT}, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-maintenance4">{@code maintenance4}</a> feature is not enabled, then for each push constant that is statically used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-binding">a bound shader</a>, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} or {@code VkDescriptorSetLayout} and ##VkPushConstantRange arrays used to create the current {@code VkPipeline} or {@code VkShaderEXT}, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>Descriptors in each bound descriptor set, specified via #CmdBindDescriptorSets(), <b>must</b> be valid if they are statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command and the bound {@code VkPipeline} was not created with #PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT</li>
            <li>If the descriptors used by the {@code VkPipeline} bound to the pipeline bind point were specified via #CmdBindDescriptorSets(), the bound {@code VkPipeline} <b>must</b> have been created without #PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT</li>
            <li>Descriptors in bound descriptor buffers, specified via #CmdSetDescriptorBufferOffsetsEXT(), <b>must</b> be valid if they are dynamically used by the {@code VkPipeline} bound to the pipeline bind point used by this command and the bound {@code VkPipeline} was created with #PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT</li>
            <li>Descriptors in bound descriptor buffers, specified via #CmdSetDescriptorBufferOffsetsEXT(), <b>must</b> be valid if they are dynamically used by any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command</li>
            <li>If the descriptors used by the {@code VkPipeline} bound to the pipeline bind point were specified via #CmdSetDescriptorBufferOffsetsEXT(), the bound {@code VkPipeline} <b>must</b> have been created with #PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT</li>
            <li>If a descriptor is dynamically used with a {@code VkPipeline} created with #PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT, the descriptor memory <b>must</b> be resident</li>
            <li>If a descriptor is dynamically used with a {@code VkShaderEXT} created with a {@code VkDescriptorSetLayout} that was created with #DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT, the descriptor memory <b>must</b> be resident</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature is not enabled, a valid pipeline <b>must</b> be bound to the pipeline bind point used by this command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> is enabled, either a valid pipeline <b>must</b> be bound to the pipeline bind point used by this command, or a valid combination of valid and #NULL_HANDLE shader objects <b>must</b> be bound to every supported shader stage corresponding to the pipeline bind point used by this command</li>
            <li>If a pipeline is bound to the pipeline bind point used by this command, there <b>must</b> not have been any calls to dynamic state setting commands for any state not specified as dynamic in the {@code VkPipeline} object bound to the pipeline bind point used by this command, since that pipeline was bound</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
            <li>If any stage of the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a uniform buffer, and that stage was created without enabling either #PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT or #PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT for {@code uniformBuffers}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, that stage <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, and any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a uniform buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If any stage of the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a storage buffer, and that stage was created without enabling either #PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT or #PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT for {@code storageBuffers}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, that stage <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, and any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a storage buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If {@code commandBuffer} is an unprotected command buffer and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, any resource accessed by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-binding">bound shaders</a> <b>must</b> not be a protected resource</li>
            <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-binding">a bound shader</a> accesses a {@code VkSampler} or {@code VkImageView} object that enables <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> only be used with {@code OpImageSample*} or {@code OpImageSparseSample*} instructions</li>
            <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-binding">a bound shader</a> accesses a {@code VkSampler} or {@code VkImageView} object that enables <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> not use the {@code ConstOffset} and {@code Offset} operands</li>
            <li>If a {@code VkImageView} is accessed as a result of this command, then the image view’s {@code viewType} <b>must</b> match the {@code Dim} operand of the {@code OpTypeImage} as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#textures-operation-validation">textures-operation-validation</a></li>
            <li>If a {@code VkImageView} is accessed as a result of this command, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#formats-numericformat">numeric type</a> of the image view’s {@code format} and the {@code Sampled} {@code Type} operand of the {@code OpTypeImage} <b>must</b> match</li>
            <li>If a {@code VkImageView} created with a format other than #FORMAT_A8_UNORM_KHR is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have at least as many components as the image view’s format</li>
            <li>If a {@code VkImageView} created with the format #FORMAT_A8_UNORM_KHR is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have four components</li>
            <li>If a {@code VkBufferView} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have at least as many components as the buffer view’s format</li>
            <li>If a {@code VkImageView} with a {@code VkFormat} that has a 64-bit component width is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 64</li>
            <li>If a {@code VkImageView} with a {@code VkFormat} that has a component width less than 64-bit is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 32</li>
            <li>If a {@code VkBufferView} with a {@code VkFormat} that has a 64-bit component width is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 64</li>
            <li>If a {@code VkBufferView} with a {@code VkFormat} that has a component width less than 64-bit is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 32</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-sparseImageInt64Atomics">{@code sparseImageInt64Atomics}</a> feature is not enabled, {@code VkImage} objects created with the #IMAGE_CREATE_SPARSE_RESIDENCY_BIT flag <b>must</b> not be accessed by atomic instructions through an {@code OpTypeImage} with a {@code SampledType} with a {@code Width} of 64 by this command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-sparseImageInt64Atomics">{@code sparseImageInt64Atomics}</a> feature is not enabled, {@code VkBuffer} objects created with the #BUFFER_CREATE_SPARSE_RESIDENCY_BIT flag <b>must</b> not be accessed by atomic instructions through an {@code OpTypeImage} with a {@code SampledType} with a {@code Width} of 64 by this command</li>
            <li>If {@code OpImageWeightedSampleQCOM} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_WEIGHT_SAMPLED_IMAGE_BIT_QCOM</li>
            <li>If {@code OpImageWeightedSampleQCOM} uses a {@code VkImageView} as a sample weight image as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_WEIGHT_IMAGE_BIT_QCOM</li>
            <li>If {@code OpImageBoxFilterQCOM} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_BOX_FILTER_SAMPLED_BIT_QCOM</li>
            <li>If {@code OpImageBlockMatchSSDQCOM} is used to read from an {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM</li>
            <li>If {@code OpImageBlockMatchSADQCOM} is used to read from an {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM</li>
            <li>If {@code OpImageBlockMatchSADQCOM} or OpImageBlockMatchSSDQCOM is used to read from a reference image as result of this command, then the specified reference coordinates <b>must</b> not fail <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#textures-integer-coordinate-validation">integer texel coordinate validation</a></li>
            <li>If {@code OpImageWeightedSampleQCOM}, {@code OpImageBoxFilterQCOM}, {@code OpImageBlockMatchWindowSSDQCOM}, {@code OpImageBlockMatchWindowSADQCOM}, {@code OpImageBlockMatchGatherSSDQCOM}, {@code OpImageBlockMatchGatherSADQCOM}, {@code OpImageBlockMatchSSDQCOM}, or {@code OpImageBlockMatchSADQCOM} uses a {@code VkSampler} as a result of this command, then the sampler <b>must</b> have been created with #SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM</li>
            <li>If any command other than {@code OpImageWeightedSampleQCOM}, {@code OpImageBoxFilterQCOM}, {@code OpImageBlockMatchWindowSSDQCOM}, {@code OpImageBlockMatchWindowSADQCOM}, {@code OpImageBlockMatchGatherSSDQCOM}, {@code OpImageBlockMatchGatherSADQCOM}, {@code OpImageBlockMatchSSDQCOM}, or {@code OpImageBlockMatchSADQCOM} uses a {@code VkSampler} as a result of this command, then the sampler <b>must</b> not have been created with #SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM</li>
            <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} instruction is used to read from an {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM</li>
            <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} instruction is used to read from an {@code VkImageView} as a result of this command, then the image view’s format <b>must</b> be a single-component format.</li>
            <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} read from a reference image as result of this command, then the specified reference coordinates <b>must</b> not fail <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#textures-integer-coordinate-validation">integer texel coordinate validation</a></li>
            <li>Any shader invocation executed by this command <b>must</b> <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-termination">terminate</a></li>
            <li>The current render pass <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} bound to #PIPELINE_BIND_POINT_GRAPHICS</li>
            <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} bound to #PIPELINE_BIND_POINT_GRAPHICS</li>
            <li>If any shader statically accesses an input attachment, a valid descriptor <b>must</b> be bound to the pipeline via a descriptor set</li>
            <li>If any shader executed by this pipeline accesses an {@code OpTypeImage} variable with a {@code Dim} operand of {@code SubpassData}, it <b>must</b> be decorated with an {@code InputAttachmentIndex} that corresponds to a valid input attachment in the current subpass</li>
            <li>Input attachment views accessed in a subpass <b>must</b> be created with the same {@code VkFormat} as the corresponding subpass definition, and be created with a {@code VkImageView} that is compatible with the attachment referenced by the subpass' {@code pInputAttachments}[{@code InputAttachmentIndex}] in the currently bound {@code VkFramebuffer} as specified by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#compatibility-inputattachment">Fragment Input Attachment Compatibility</a></li>
            <li>Memory backing image subresources used as attachments in the current render pass <b>must</b> not be written in any way other than as an attachment by this command</li>
            <li>
                If a color attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it is not in the #IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT image layout, and either:
                <ul>
                    <li>the #PIPELINE_CREATE_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT is set on the currently bound pipeline or</li>
                    <li>
                        the last call to #CmdSetAttachmentFeedbackLoopEnableEXT() included #IMAGE_ASPECT_COLOR_BIT and
                        <ul>
                            <li>there is no currently bound graphics pipeline or</li>
                            <li>the currently bound graphics pipeline was created with #DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT it <b>must</b> not be accessed in any way other than as an attachment by this command</li>
                        </ul>
                    </li>
                </ul>
            </li>
            <li>
                If a depth attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it is not in the #IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT image layout, and either:
                <ul>
                    <li>the #PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT is set on the currently bound pipeline or</li>
                    <li>
                        the last call to #CmdSetAttachmentFeedbackLoopEnableEXT() included #IMAGE_ASPECT_DEPTH_BIT and
                        <ul>
                            <li>there is no currently bound graphics pipeline or</li>
                            <li>the currently bound graphics pipeline was created with #DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT it <b>must</b> not be accessed in any way other than as an attachment by this command</li>
                        </ul>
                    </li>
                </ul>
            </li>
            <li>
                If a stencil attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it is not in the #IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT image layout, and either:
                <ul>
                    <li>the #PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT is set on the currently bound pipeline or</li>
                    <li>
                        the last call to #CmdSetAttachmentFeedbackLoopEnableEXT() included #IMAGE_ASPECT_STENCIL_BIT and
                        <ul>
                            <li>there is no currently bound graphics pipeline or</li>
                            <li>the currently bound graphics pipeline was created with #DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT it <b>must</b> not be accessed in any way other than as an attachment by this command</li>
                        </ul>
                    </li>
                </ul>
            </li>
            <li>If an attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it <b>must</b> not be accessed in any way other than as an attachment, storage image, or sampled image by this command</li>
            <li>If any previously recorded command in the current subpass accessed an image subresource used as an attachment in this subpass in any way other than as an attachment, this command <b>must</b> not write to that image subresource as an attachment</li>
            <li>If the current render pass instance uses a depth/stencil attachment with a read-only layout for the depth aspect, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fragops-depth-write">depth writes</a> <b>must</b> be disabled</li>
            <li>If the current render pass instance uses a depth/stencil attachment with a read-only layout for the stencil aspect, both front and back {@code writeMask} are not zero, and stencil test is enabled, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fragops-stencil">all stencil ops</a> <b>must</b> be #STENCIL_OP_KEEP</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT dynamic state enabled then #CmdSetViewport() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SCISSOR dynamic state enabled then #CmdSetScissor() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_WIDTH dynamic state enabled then #CmdSetLineWidth() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetPolygonModeEXT() in the current command buffer set {@code polygonMode} to #POLYGON_MODE_LINE, #CmdSetLineWidth() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to the #SHADER_STAGE_VERTEX_BIT stage, and the most recent call to #CmdSetPrimitiveTopology() in the current command buffer set {@code primitiveTopology} to any line topology, #CmdSetLineWidth() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object that outputs line primitives is bound to the #SHADER_STAGE_TESSELLATION_EVALUATION_BIT or #SHADER_STAGE_GEOMETRY_BIT stage, #CmdSetLineWidth() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_BIAS dynamic state enabled then #CmdSetDepthBias() or #CmdSetDepthBias2EXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetDepthBiasEnable() in the current command buffer set {@code depthBiasEnable} to #TRUE, #CmdSetDepthBias() or #CmdSetDepthBias2EXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_BLEND_CONSTANTS dynamic state enabled then #CmdSetBlendConstants() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetColorBlendEnableEXT() in the current command buffer set any element of {@code pColorBlendEnables} to #TRUE, and the most recent call to #CmdSetColorBlendEquationEXT() in the current command buffer set the same element of {@code pColorBlendEquations} to a ##VkColorBlendEquationEXT structure with any {@code VkBlendFactor} member with a value of #BLEND_FACTOR_CONSTANT_COLOR, #BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR, #BLEND_FACTOR_CONSTANT_ALPHA, or #BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA, #CmdSetBlendConstants() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_BOUNDS dynamic state enabled then #CmdSetDepthBounds() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetDepthBoundsTestEnable() in the current command buffer set {@code depthBoundsTestEnable} to #TRUE, then #CmdSetDepthBounds() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_STENCIL_COMPARE_MASK dynamic state enabled then #CmdSetStencilCompareMask() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetStencilTestEnable() in the current command buffer set {@code stencilTestEnable} to #TRUE, #CmdSetStencilCompareMask() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_STENCIL_WRITE_MASK dynamic state enabled then #CmdSetStencilWriteMask() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetStencilTestEnable() in the current command buffer set {@code stencilTestEnable} to #TRUE, #CmdSetStencilWriteMask() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_STENCIL_REFERENCE dynamic state enabled then #CmdSetStencilReference() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetStencilTestEnable() in the current command buffer set {@code stencilTestEnable} to #TRUE, #CmdSetStencilReference() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the draw is recorded in a render pass instance with multiview enabled, the maximum instance index <b>must</b> be less than or equal to ##VkPhysicalDeviceMultiviewProperties{@code ::maxMultiviewInstanceIndex}</li>
            <li>If the bound graphics pipeline was created with ##VkPipelineSampleLocationsStateCreateInfoEXT{@code ::sampleLocationsEnable} set to #TRUE and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the #IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT bit set</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT dynamic state enabled then #CmdSetSampleLocationsEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetSampleLocationsEnableEXT() in the current command buffer set {@code sampleLocationsEnable} to #TRUE, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetSampleLocationsEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state enabled, then the {@code sampleLocationsPerPixel} member of {@code pSampleLocationsInfo} in the last call to #CmdSetSampleLocationsEXT() <b>must</b> equal the {@code rasterizationSamples} member of the ##VkPipelineMultisampleStateCreateInfo structure the bound graphics pipeline has been created with</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_CULL_MODE dynamic state enabled then #CmdSetCullMode() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetCullMode() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_FRONT_FACE dynamic state enabled then #CmdSetFrontFace() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetFrontFace() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_TEST_ENABLE dynamic state enabled then #CmdSetDepthTestEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetDepthTestEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_WRITE_ENABLE dynamic state enabled then #CmdSetDepthWriteEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetDepthWriteEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_COMPARE_OP dynamic state enabled then #CmdSetDepthCompareOp() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetDepthTestEnable() in the current command buffer set {@code depthTestEnable} to #TRUE, then #CmdSetDepthCompareOp() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE dynamic state enabled then #CmdSetDepthBoundsTestEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-depthBounds">{@code depthBounds}</a> feature is enabled, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then the #CmdSetDepthBoundsTestEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_STENCIL_TEST_ENABLE dynamic state enabled then #CmdSetStencilTestEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetStencilTestEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_STENCIL_OP dynamic state enabled then #CmdSetStencilOp() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetStencilTestEnable() in the current command buffer set {@code stencilTestEnable} to #TRUE, then #CmdSetStencilOp() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled, but not the #DYNAMIC_STATE_SCISSOR_WITH_COUNT dynamic state enabled, then #CmdSetViewportWithCount() <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> match the ##VkPipelineViewportStateCreateInfo{@code ::scissorCount} of the pipeline</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SCISSOR_WITH_COUNT dynamic state enabled, but not the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled, then #CmdSetScissorWithCount() <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code scissorCount} parameter of {@code vkCmdSetScissorWithCount} <b>must</b> match the ##VkPipelineViewportStateCreateInfo{@code ::viewportCount} of the pipeline</li>
            <li>If the bound graphics pipeline state was created with both the #DYNAMIC_STATE_SCISSOR_WITH_COUNT and #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic states enabled then both #CmdSetViewportWithCount() and #CmdSetScissorWithCount() <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> match the {@code scissorCount} parameter of {@code vkCmdSetScissorWithCount}</li>
            <li>If a shader object is bound to any graphics stage, then both #CmdSetViewportWithCount() and #CmdSetScissorWithCount() <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> match the {@code scissorCount} parameter of {@code vkCmdSetScissorWithCount}</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled, but not the #DYNAMIC_STATE_VIEWPORT_W_SCALING_NV dynamic state enabled, then the bound graphics pipeline <b>must</b> have been created with ##VkPipelineViewportWScalingStateCreateInfoNV{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT and #DYNAMIC_STATE_VIEWPORT_W_SCALING_NV dynamic states enabled then the {@code viewportCount} parameter in the last call to #CmdSetViewportWScalingNV() <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If a shader object is bound to any graphics stage, and the {@link NVClipSpaceWScaling VK_NV_clip_space_w_scaling} extension is enabled on the device, then #CmdSetViewportWScalingNV() must have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the {@link NVClipSpaceWScaling VK_NV_clip_space_w_scaling} extension is enabled on the device, then the {@code viewportCount} parameter in the last call to #CmdSetViewportWScalingNV() <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled, but not the #DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV dynamic state enabled, then the bound graphics pipeline <b>must</b> have been created with ##VkPipelineViewportShadingRateImageStateCreateInfoNV{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT and #DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV dynamic states enabled then the {@code viewportCount} parameter in the last call to #CmdSetViewportShadingRatePaletteNV() <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set rasterizerDiscardEnable to #FALSE, then #CmdSetCoarseSampleOrderNV() must have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled on the device, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set rasterizerDiscardEnable to #FALSE, and the most recent call to #CmdSetShadingRateImageEnableNV() in the current command buffer set shadingRateImageEnable to #TRUE, then #CmdSetViewportShadingRatePaletteNV() must have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled on the device, then the {@code viewportCount} parameter in the last call to #CmdSetViewportShadingRatePaletteNV() <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled and a ##VkPipelineViewportSwizzleStateCreateInfoNV structure chained from ##VkPipelineViewportStateCreateInfo, then the bound graphics pipeline <b>must</b> have been created with ##VkPipelineViewportSwizzleStateCreateInfoNV{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled and a ##VkPipelineViewportExclusiveScissorStateCreateInfoNV structure chained from ##VkPipelineViewportStateCreateInfo, then the bound graphics pipeline <b>must</b> have been created with ##VkPipelineViewportExclusiveScissorStateCreateInfoNV{@code ::exclusiveScissorCount} greater or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV dynamic state enabled then #CmdSetExclusiveScissorEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV dynamic state enabled then #CmdSetExclusiveScissorNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-exclusiveScissor">{@code exclusiveScissor}</a> feature is enabled, then #CmdSetExclusiveScissorEnableNV() must have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetExclusiveScissorEnableNV() in the current command buffer set any element of {@code pExclusiveScissorEnables} to #TRUE, then #CmdSetExclusiveScissorNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE dynamic state enabled then #CmdSetRasterizerDiscardEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, then #CmdSetRasterizerDiscardEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_BIAS_ENABLE dynamic state enabled then #CmdSetDepthBiasEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetDepthBiasEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LOGIC_OP_EXT dynamic state enabled then #CmdSetLogicOpEXT() <b>must</b> have been called in the current command buffer prior to this drawing command and the {@code logicOp} <b>must</b> be a valid {@code VkLogicOp} value</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-logicOp">{@code logicOp}</a> feature is enabled on the device, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetLogicOpEXT() <b>must</b> have been called in the current command buffer prior to this drawing command and the {@code logicOp} <b>must</b> be a valid {@code VkLogicOp} value</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-primitiveFragmentShadingRateWithMultipleViewports">{@code primitiveFragmentShadingRateWithMultipleViewports}</a> limit is not supported, the bound graphics pipeline was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled, and any of the shader stages of the bound graphics pipeline write to the {@code PrimitiveShadingRateKHR} built-in, then #CmdSetViewportWithCount() <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> be 1</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-primitiveFragmentShadingRateWithMultipleViewports">{@code primitiveFragmentShadingRateWithMultipleViewports}</a> limit is not supported, and any shader object bound to a graphics stage writes to the {@code PrimitiveShadingRateKHR} built-in, then #CmdSetViewportWithCount() <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> be 1</li>
            <li>If rasterization is not disabled in the bound graphics pipeline, then for each color attachment in the subpass, if the corresponding image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> do not contain #FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT, then the {@code blendEnable} member of the corresponding element of the {@code pAttachments} member of {@code pColorBlendState} <b>must</b> be #FALSE</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then for each color attachment in the render pass, if the corresponding image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> do not contain #FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT, then the corresponding member of {@code pColorBlendEnables} in the most recent call to {@code vkCmdSetColorBlendEnableEXT} in the current command buffer that affected that attachment index <b>must</b> have been #FALSE</li>
            <li>If rasterization is not disabled in the bound graphics pipeline, and none of the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} extension, the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension, or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is enabled, then {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be the same as the current subpass color and/or depth/stencil attachments</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and none of the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} extension, the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension, or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is enabled, then the most recent call to #CmdSetRasterizationSamplesEXT() in the current command buffer <b>must</b> have set {@code rasterizationSamples} to be the same as the number of samples for the current render pass color and/or depth/stencil attachments</li>
            <li>If a shader object is bound to any graphics stage, the current render pass instance <b>must</b> have been begun with #CmdBeginRendering()</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the {@code imageView} member of {@code pDepthAttachment} is not #NULL_HANDLE, and the {@code layout} member of {@code pDepthAttachment} is #IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL, this command <b>must</b> not write any values to the depth attachment</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the {@code imageView} member of {@code pStencilAttachment} is not #NULL_HANDLE, and the {@code layout} member of {@code pStencilAttachment} is #IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL, this command <b>must</b> not write any values to the stencil attachment</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the {@code imageView} member of {@code pDepthAttachment} is not #NULL_HANDLE, and the {@code layout} member of {@code pDepthAttachment} is #IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL, this command <b>must</b> not write any values to the depth attachment</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the {@code imageView} member of {@code pStencilAttachment} is not #NULL_HANDLE, and the {@code layout} member of {@code pStencilAttachment} is #IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL, this command <b>must</b> not write any values to the stencil attachment</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the {@code imageView} member of {@code pDepthAttachment} is not #NULL_HANDLE, and the {@code layout} member of {@code pDepthAttachment} is #IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL, this command <b>must</b> not write any values to the depth attachment</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the {@code imageView} member of {@code pStencilAttachment} is not #NULL_HANDLE, and the {@code layout} member of {@code pStencilAttachment} is #IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL, this command <b>must</b> not write any values to the stencil attachment</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the currently bound graphics pipeline <b>must</b> have been created with a ##VkPipelineRenderingCreateInfo{@code ::viewMask} equal to ##VkRenderingInfo{@code ::viewMask}</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the currently bound graphics pipeline <b>must</b> have been created with a ##VkPipelineRenderingCreateInfo{@code ::colorAttachmentCount} equal to ##VkRenderingInfo{@code ::colorAttachmentCount}</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and the current render pass instance was begun with #CmdBeginRendering() and ##VkRenderingInfo{@code ::colorAttachmentCount} greater than 0, then each element of the ##VkRenderingInfo{@code ::pColorAttachments} array with a {@code imageView} not equal to #NULL_HANDLE <b>must</b> have been created with a {@code VkFormat} equal to the corresponding element of ##VkPipelineRenderingCreateInfo{@code ::pColorAttachmentFormats} used to create the currently bound graphics pipeline</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is enabled, and the current render pass instance was begun with #CmdBeginRendering() and ##VkRenderingInfo{@code ::colorAttachmentCount} greater than 0, then each element of the ##VkRenderingInfo{@code ::pColorAttachments} array with a {@code imageView} not equal to #NULL_HANDLE <b>must</b> have been created with a {@code VkFormat} equal to the corresponding element of ##VkPipelineRenderingCreateInfo{@code ::pColorAttachmentFormats} used to create the currently bound graphics pipeline, or the corresponding element of ##VkPipelineRenderingCreateInfo{@code ::pColorAttachmentFormats}, if it exists, <b>must</b> be #FORMAT_UNDEFINED</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and the current render pass instance was begun with #CmdBeginRendering() and ##VkRenderingInfo{@code ::colorAttachmentCount} greater than 0, then each element of the ##VkRenderingInfo{@code ::pColorAttachments} array with a {@code imageView} equal to #NULL_HANDLE <b>must</b> have the corresponding element of ##VkPipelineRenderingCreateInfo{@code ::pColorAttachmentFormats} used to create the currently bound pipeline equal to #FORMAT_UNDEFINED</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT dynamic state enabled then #CmdSetColorWriteEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-colorWriteEnable">{@code colorWriteEnable}</a> feature is enabled on the device, and a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetColorWriteEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT dynamic state enabled then the {@code attachmentCount} parameter of {@code vkCmdSetColorWriteEnableEXT} <b>must</b> be greater than or equal to the ##VkPipelineColorBlendStateCreateInfo{@code ::attachmentCount} of the currently bound graphics pipeline</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-colorWriteEnable">{@code colorWriteEnable}</a> feature is enabled on the device, and a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then the {@code attachmentCount} parameter of most recent call to {@code vkCmdSetColorWriteEnableEXT} in the current command buffer <b>must</b> be greater than or equal to the number of color attachments in the current render pass instance</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DISCARD_RECTANGLE_EXT dynamic state enabled then #CmdSetDiscardRectangleEXT() <b>must</b> have been called in the current command buffer prior to this drawing command for each discard rectangle in ##VkPipelineDiscardRectangleStateCreateInfoEXT{@code ::discardRectangleCount}</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DISCARD_RECTANGLE_ENABLE_EXT dynamic state enabled then #CmdSetDiscardRectangleEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTDiscardRectangles VK_EXT_discard_rectangles} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetDiscardRectangleEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTDiscardRectangles VK_EXT_discard_rectangles} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetDiscardRectangleEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DISCARD_RECTANGLE_MODE_EXT dynamic state enabled then #CmdSetDiscardRectangleModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTDiscardRectangles VK_EXT_discard_rectangles} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetDiscardRectangleEnableEXT() in the current command buffer set {@code discardRectangleEnable} to #TRUE, then #CmdSetDiscardRectangleModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and ##VkRenderingInfo{@code ::pDepthAttachment→imageView} was #NULL_HANDLE, the value of ##VkPipelineRenderingCreateInfo{@code ::depthAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to #FORMAT_UNDEFINED</li>
            <li>If current render pass instance was begun with #CmdBeginRendering(), the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and ##VkRenderingInfo{@code ::pDepthAttachment→imageView} was not #NULL_HANDLE, the value of ##VkPipelineRenderingCreateInfo{@code ::depthAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to the {@code VkFormat} used to create ##VkRenderingInfo{@code ::pDepthAttachment→imageView}</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is enabled, ##VkRenderingInfo{@code ::pDepthAttachment→imageView} was not #NULL_HANDLE, and the value of ##VkPipelineRenderingCreateInfo{@code ::depthAttachmentFormat} used to create the currently bound graphics pipeline was not equal to the {@code VkFormat} used to create ##VkRenderingInfo{@code ::pDepthAttachment→imageView}, the value of the format <b>must</b> be #FORMAT_UNDEFINED</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and ##VkRenderingInfo{@code ::pStencilAttachment→imageView} was #NULL_HANDLE, the value of ##VkPipelineRenderingCreateInfo{@code ::stencilAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to #FORMAT_UNDEFINED</li>
            <li>If current render pass instance was begun with #CmdBeginRendering(), the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and ##VkRenderingInfo{@code ::pStencilAttachment→imageView} was not #NULL_HANDLE, the value of ##VkPipelineRenderingCreateInfo{@code ::stencilAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to the {@code VkFormat} used to create ##VkRenderingInfo{@code ::pStencilAttachment→imageView}</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is enabled, ##VkRenderingInfo{@code ::pStencilAttachment→imageView} was not #NULL_HANDLE, and the value of ##VkPipelineRenderingCreateInfo{@code ::stencilAttachmentFormat} used to create the currently bound graphics pipeline was not equal to the {@code VkFormat} used to create ##VkRenderingInfo{@code ::pStencilAttachment→imageView}, the value of the format <b>must</b> be #FORMAT_UNDEFINED</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering() and ##VkRenderingFragmentShadingRateAttachmentInfoKHR{@code ::imageView} was not #NULL_HANDLE, the currently bound graphics pipeline <b>must</b> have been created with #PIPELINE_CREATE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering() and ##VkRenderingFragmentDensityMapAttachmentInfoEXT{@code ::imageView} was not #NULL_HANDLE, the currently bound graphics pipeline <b>must</b> have been created with #PIPELINE_CREATE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT</li>
            <li>If the currently bound pipeline was created with a ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV structure, and the current render pass instance was begun with #CmdBeginRendering() with a ##VkRenderingInfo{@code ::colorAttachmentCount} parameter greater than 0, then each element of the ##VkRenderingInfo{@code ::pColorAttachments} array with a {@code imageView} not equal to #NULL_HANDLE <b>must</b> have been created with a sample count equal to the corresponding element of the {@code pColorAttachmentSamples} member of ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV used to create the currently bound graphics pipeline</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the currently bound pipeline was created with a ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV structure, and ##VkRenderingInfo{@code ::pDepthAttachment→imageView} was not #NULL_HANDLE, the value of the {@code depthStencilAttachmentSamples} member of ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV used to create the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create ##VkRenderingInfo{@code ::pDepthAttachment→imageView}</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the currently bound pipeline was created with a ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV structure, and ##VkRenderingInfo{@code ::pStencilAttachment→imageView} was not #NULL_HANDLE, the value of the {@code depthStencilAttachmentSamples} member of ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV used to create the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create ##VkRenderingInfo{@code ::pStencilAttachment→imageView}</li>
            <li>If the currently bound pipeline was created without a ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV structure, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is not enabled, and the current render pass instance was begun with #CmdBeginRendering() with a ##VkRenderingInfo{@code ::colorAttachmentCount} parameter greater than 0, then each element of the ##VkRenderingInfo{@code ::pColorAttachments} array with a {@code imageView} not equal to #NULL_HANDLE <b>must</b> have been created with a sample count equal to the value of {@code rasterizationSamples} for the currently bound graphics pipeline</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the currently bound pipeline was created without a ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV structure, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is not enabled, and ##VkRenderingInfo{@code ::pDepthAttachment→imageView} was not #NULL_HANDLE, the value of {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create ##VkRenderingInfo{@code ::pDepthAttachment→imageView}</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the currently bound pipeline was created without a ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV structure, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is not enabled, and ##VkRenderingInfo{@code ::pStencilAttachment→imageView} was not #NULL_HANDLE, the value of {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create ##VkRenderingInfo{@code ::pStencilAttachment→imageView}</li>
            <li>If this command has been called inside a render pass instance started with #CmdBeginRendering(), and the {@code pNext} chain of ##VkRenderingInfo includes a ##VkMultisampledRenderToSingleSampledInfoEXT structure with {@code multisampledRenderToSingleSampledEnable} equal to #TRUE, then the value of {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be equal to ##VkMultisampledRenderToSingleSampledInfoEXT{@code ::rasterizationSamples}</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the currently bound pipeline <b>must</b> have been created with a ##VkGraphicsPipelineCreateInfo{@code ::renderPass} equal to #NULL_HANDLE</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), there is a graphics pipeline bound with a fragment shader that statically writes to a color attachment, the color write mask is not zero, color writes are enabled, and the corresponding element of the ##VkRenderingInfo{@code ::pColorAttachments→imageView} was not #NULL_HANDLE, then the corresponding element of ##VkPipelineRenderingCreateInfo{@code ::pColorAttachmentFormats} used to create the pipeline <b>must</b> not be #FORMAT_UNDEFINED</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), there is a graphics pipeline bound, depth test is enabled, depth write is enabled, and the ##VkRenderingInfo{@code ::pDepthAttachment→imageView} was not #NULL_HANDLE, then the ##VkPipelineRenderingCreateInfo{@code ::depthAttachmentFormat} used to create the pipeline <b>must</b> not be #FORMAT_UNDEFINED</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), there is a graphics pipeline bound, stencil test is enabled and the ##VkRenderingInfo{@code ::pStencilAttachment→imageView} was not #NULL_HANDLE, then the ##VkPipelineRenderingCreateInfo{@code ::stencilAttachmentFormat} used to create the pipeline <b>must</b> not be #FORMAT_UNDEFINED</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-primitivesGeneratedQueryWithRasterizerDiscard">{@code primitivesGeneratedQueryWithRasterizerDiscard}</a> feature is not enabled and the #QUERY_TYPE_PRIMITIVES_GENERATED_EXT query is active, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#primsrast-discard">rasterization discard</a> <b>must</b> not be enabled</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-primitivesGeneratedQueryWithNonZeroStreams">{@code primitivesGeneratedQueryWithNonZeroStreams}</a> feature is not enabled and the #QUERY_TYPE_PRIMITIVES_GENERATED_EXT query is active, the bound graphics pipeline <b>must</b> not have been created with a non-zero value in ##VkPipelineRasterizationStateStreamCreateInfoEXT{@code ::rasterizationStream}</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_TESSELLATION_DOMAIN_ORIGIN_EXT dynamic state enabled then #CmdSetTessellationDomainOriginEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_CLAMP_ENABLE_EXT dynamic state enabled then #CmdSetDepthClampEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to the #SHADER_STAGE_TESSELLATION_EVALUATION_BIT stage, then #CmdSetTessellationDomainOriginEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-depthClamp">{@code depthClamp}</a> feature is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetDepthClampEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_POLYGON_MODE_EXT dynamic state enabled then #CmdSetPolygonModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetPolygonModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT dynamic state enabled then #CmdSetRasterizationSamplesEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetRasterizationSamplesEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_MASK_EXT dynamic state enabled then #CmdSetSampleMaskEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetSampleMaskEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT dynamic state enabled then #CmdSetAlphaToCoverageEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT dynamic state enabled, and {@code alphaToCoverageEnable} was #TRUE in the last call to #CmdSetAlphaToCoverageEnableEXT(), then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#interfaces-fragmentoutput">Fragment Output Interface</a> <b>must</b> contain a variable for the alpha {@code Component} word in {@code Location} 0 at {@code Index} 0</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetAlphaToCoverageEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetAlphaToCoverageEnableEXT() in the current command buffer set {@code alphaToCoverageEnable} to #TRUE, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#interfaces-fragmentoutput">Fragment Output Interface</a> <b>must</b> contain a variable for the alpha {@code Component} word in {@code Location} 0 at {@code Index} 0</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_ALPHA_TO_ONE_ENABLE_EXT dynamic state enabled then #CmdSetAlphaToOneEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-alphaToOne">{@code alphaToOne}</a> feature is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetAlphaToOneEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LOGIC_OP_ENABLE_EXT dynamic state enabled then #CmdSetLogicOpEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-logicOp">{@code logicOp}</a> feature is enabled, and a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetLogicOpEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT dynamic state enabled then #CmdSetColorBlendEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetColorBlendEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT dynamic state enabled then #CmdSetColorBlendEquationEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetColorBlendEnableEXT() for any attachment set that attachment’s value in {@code pColorBlendEnables} to #TRUE, then #CmdSetColorBlendEquationEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_WRITE_MASK_EXT dynamic state enabled then #CmdSetColorWriteMaskEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetColorWriteMaskEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_RASTERIZATION_STREAM_EXT dynamic state enabled then #CmdSetRasterizationStreamEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-geometryStreams">{@code geometryStreams}</a> feature is enabled, and a shader object is bound to the #SHADER_STAGE_GEOMETRY_BIT stage, then #CmdSetRasterizationStreamEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT dynamic state enabled then #CmdSetConservativeRasterizationModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTConservativeRasterization VK_EXT_conservative_rasterization} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetConservativeRasterizationModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT dynamic state enabled then #CmdSetExtraPrimitiveOverestimationSizeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTConservativeRasterization VK_EXT_conservative_rasterization} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetConservativeRasterizationModeEXT() in the current command buffer set {@code conservativeRasterizationMode} to #CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT, then #CmdSetExtraPrimitiveOverestimationSizeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT dynamic state enabled then #CmdSetDepthClipEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-depthClipEnable">{@code depthClipEnable}</a> feature is enabled, and a shader object is bound to any graphics stage, then #CmdSetDepthClipEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT dynamic state enabled then #CmdSetSampleLocationsEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTSampleLocations VK_EXT_sample_locations} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetSampleLocationsEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT dynamic state enabled then #CmdSetColorBlendAdvancedEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_PROVOKING_VERTEX_MODE_EXT dynamic state enabled then #CmdSetProvokingVertexModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTProvokingVertex VK_EXT_provoking_vertex} extension is enabled, and a shader object is bound to the #SHADER_STAGE_VERTEX_BIT stage, then #CmdSetProvokingVertexModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT dynamic state enabled then #CmdSetLineRasterizationModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetPolygonModeEXT() in the current command buffer set {@code polygonMode} to #POLYGON_MODE_LINE, then #CmdSetLineRasterizationModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object is bound to the vertex stage, and the most recent call to #CmdSetPrimitiveTopology() in the current command buffer set {@code primitiveTopology} to any line topology, then #CmdSetLineRasterizationModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object that outputs line primitives is bound to the tessellation evaluation or geometry stage, then #CmdSetLineRasterizationModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT dynamic state enabled then #CmdSetLineStippleEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetPolygonModeEXT() in the current command buffer set {@code polygonMode} to #POLYGON_MODE_LINE, then #CmdSetLineStippleEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object is bound to the vertex stage, and the most recent call to #CmdSetPrimitiveTopology() in the current command buffer set {@code primitiveTopology} to any line topology, then #CmdSetLineStippleEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object that outputs line primitives is bound to the tessellation evaluation or geometry stage, then #CmdSetLineStippleEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_STIPPLE_EXT dynamic state enabled then #CmdSetLineStippleEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetLineStippleEnableEXT() in the current command buffer set {@code stippledLineEnable} to #TRUE, then #CmdSetLineStippleEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT dynamic state enabled then #CmdSetDepthClipNegativeOneToOneEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-depthClipControl">{@code depthClipControl}</a> feature is enabled, and a shader object is bound to any graphics stage, then #CmdSetDepthClipNegativeOneToOneEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_W_SCALING_ENABLE_NV dynamic state enabled then #CmdSetViewportWScalingEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVClipSpaceWScaling VK_NV_clip_space_w_scaling} extension is enabled, and a shader object is bound to any graphics stage, then #CmdSetViewportWScalingEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV dynamic state enabled then #CmdSetViewportSwizzleNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVViewportSwizzle VK_NV_viewport_swizzle} extension is enabled, and a shader object is bound to any graphics stage, then #CmdSetViewportSwizzleNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV dynamic state enabled then #CmdSetCoverageToColorEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVFragmentCoverageToColor VK_NV_fragment_coverage_to_color} extension is enabled, and a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetCoverageToColorEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_TO_COLOR_LOCATION_NV dynamic state enabled then #CmdSetCoverageToColorLocationNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVFragmentCoverageToColor VK_NV_fragment_coverage_to_color} extension is enabled, and a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetCoverageToColorEnableNV() in the current command buffer set {@code coverageToColorEnable} to #TRUE, then #CmdSetCoverageToColorLocationNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_MODULATION_MODE_NV dynamic state enabled then #CmdSetCoverageModulationModeNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetCoverageModulationModeNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV dynamic state enabled then #CmdSetCoverageModulationTableEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetCoverageModulationModeNV() in the current command buffer set coverageModulationMode to any value other than #COVERAGE_MODULATION_MODE_NONE_NV, then #CmdSetCoverageModulationTableEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_NV dynamic state enabled then #CmdSetCoverageModulationTableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetCoverageModulationTableEnableNV() in the current command buffer set {@code coverageModulationTableEnable} to #TRUE, then #CmdSetCoverageModulationTableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SHADING_RATE_IMAGE_ENABLE_NV dynamic state enabled then #CmdSetShadingRateImageEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-pipelineFragmentShadingRate">{@code pipelineFragmentShadingRate}</a> feature is enabled, and a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set rasterizerDiscardEnable to #FALSE, then #CmdSetFragmentShadingRateKHR() must have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetShadingRateImageEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV dynamic state enabled then #CmdSetRepresentativeFragmentTestEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-representativeFragmentTest">{@code representativeFragmentTest}</a> feature is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetRepresentativeFragmentTestEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_REDUCTION_MODE_NV dynamic state enabled then #CmdSetCoverageReductionModeNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-coverageReductionMode">{@code coverageReductionMode}</a> feature is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetCoverageReductionModeNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT state enabled and the last call to #CmdSetColorBlendEnableEXT() set {@code pColorBlendEnables} for any attachment to #TRUE, then for those attachments in the subpass the corresponding image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, and the current subpass does not use any color and/or depth/stencil attachments, then the {@code rasterizationSamples} in the last call to #CmdSetRasterizationSamplesEXT() <b>must</b> follow the rules for a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#renderpass-noattachments">zero-attachment subpass</a></li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_MASK_EXT state enabled and the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state disabled, then the {@code samples} parameter in the last call to #CmdSetSampleMaskEXT() <b>must</b> be greater or equal to the ##VkPipelineMultisampleStateCreateInfo{@code ::rasterizationSamples} parameter used to create the bound graphics pipeline</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_MASK_EXT state and #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT states enabled, then the {@code samples} parameter in the last call to #CmdSetSampleMaskEXT() <b>must</b> be greater or equal to the {@code rasterizationSamples} parameter in the last call to #CmdSetRasterizationSamplesEXT()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, and neither the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} nor the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extensions are enabled, then the {@code rasterizationSamples} in the last call to #CmdSetRasterizationSamplesEXT() <b>must</b> be the same as the current subpass color and/or depth/stencil attachments</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, or a shader object is bound to any graphics stage, and the current render pass instance includes a ##VkMultisampledRenderToSingleSampledInfoEXT structure with {@code multisampledRenderToSingleSampledEnable} equal to #TRUE, then the {@code rasterizationSamples} in the last call to #CmdSetRasterizationSamplesEXT() <b>must</b> be the same as the {@code rasterizationSamples} member of that structure</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT dynamic state enabled then #CmdSetColorBlendEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorBlendEnableEXT} calls <b>must</b> specify an enable for all active color attachments in the current subpass</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT dynamic state enabled then #CmdSetColorBlendEquationEXT() <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorBlendEquationEXT} calls <b>must</b> specify the blend equations for all active color attachments in the current subpass where blending is enabled</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_WRITE_MASK_EXT dynamic state enabled then #CmdSetColorWriteMaskEXT() <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorWriteMaskEXT} calls <b>must</b> specify the color write mask for all active color attachments in the current subpass</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT dynamic state enabled then #CmdSetColorBlendAdvancedEXT() <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorBlendAdvancedEXT} calls <b>must</b> specify the advanced blend equations for all active color attachments in the current subpass where blending is enabled</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT and #DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT dynamic states enabled and the last calls to #CmdSetColorBlendEnableEXT() and #CmdSetColorBlendAdvancedEXT() have enabled advanced blending, then the number of active color attachments in the current subpass <b>must</b> not exceed <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-advancedBlendMaxColorAttachments">{@code advancedBlendMaxColorAttachments}</a></li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-primitivesGeneratedQueryWithNonZeroStreams">{@code primitivesGeneratedQueryWithNonZeroStreams}</a> feature is not enabled and the #QUERY_TYPE_PRIMITIVES_GENERATED_EXT query is active, and the bound graphics pipeline was created with #DYNAMIC_STATE_RASTERIZATION_STREAM_EXT state enabled, the last call to #CmdSetRasterizationStreamEXT() <b>must</b> have set the {@code rasterizationStream} to zero</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state enabled and the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state disabled, then the {@code sampleLocationsPerPixel} member of {@code pSampleLocationsInfo} in the last call to #CmdSetSampleLocationsEXT() <b>must</b> equal the {@code rasterizationSamples} member of the ##VkPipelineMultisampleStateCreateInfo structure the bound graphics pipeline has been created with</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state enabled and the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, then the {@code sampleLocationsPerPixel} member of {@code pSampleLocationsInfo} in the last call to #CmdSetSampleLocationsEXT() <b>must</b> equal the {@code rasterizationSamples} parameter of the last call to #CmdSetRasterizationSamplesEXT()</li>
            <li>If the bound graphics pipeline was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT state enabled, and {@code sampleLocationsEnable} was #TRUE in the last call to #CmdSetSampleLocationsEnableEXT(), and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the #IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT bit set</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state enabled and the #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT state enabled, and if {@code sampleLocationsEnable} was #TRUE in the last call to #CmdSetSampleLocationsEnableEXT(), then the {@code sampleLocationsInfo.sampleLocationGridSize.width} in the last call to #CmdSetSampleLocationsEXT() <b>must</b> evenly divide ##VkMultisamplePropertiesEXT{@code ::sampleLocationGridSize.width} as returned by #GetPhysicalDeviceMultisamplePropertiesEXT() with a {@code samples} parameter equaling {@code rasterizationSamples}</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state enabled and the #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT state enabled, and if {@code sampleLocationsEnable} was #TRUE in the last call to #CmdSetSampleLocationsEnableEXT(), then the {@code sampleLocationsInfo.sampleLocationGridSize.height} in the last call to #CmdSetSampleLocationsEXT() <b>must</b> evenly divide ##VkMultisamplePropertiesEXT{@code ::sampleLocationGridSize.height} as returned by #GetPhysicalDeviceMultisamplePropertiesEXT() with a {@code samples} parameter equaling {@code rasterizationSamples}</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT state enabled, and if {@code sampleLocationsEnable} was #TRUE in the last call to #CmdSetSampleLocationsEnableEXT(), the fragment shader code <b>must</b> not statically use the extended instruction {@code InterpolateAtSample}</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state disabled and the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, the {@code sampleLocationsEnable} member of a ##VkPipelineSampleLocationsStateCreateInfoEXT{@code ::sampleLocationsEnable} in the bound graphics pipeline is #TRUE or #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT state enabled, then, {@code sampleLocationsInfo.sampleLocationGridSize.width} <b>must</b> evenly divide ##VkMultisamplePropertiesEXT{@code ::sampleLocationGridSize.width} as returned by #GetPhysicalDeviceMultisamplePropertiesEXT() with a {@code samples} parameter equaling the value of {@code rasterizationSamples} in the last call to #CmdSetRasterizationSamplesEXT()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state disabled and the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, the {@code sampleLocationsEnable} member of a ##VkPipelineSampleLocationsStateCreateInfoEXT{@code ::sampleLocationsEnable} in the bound graphics pipeline is #TRUE or #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT state enabled, then, {@code sampleLocationsInfo.sampleLocationGridSize.height} <b>must</b> evenly divide ##VkMultisamplePropertiesEXT{@code ::sampleLocationGridSize.height} as returned by #GetPhysicalDeviceMultisamplePropertiesEXT() with a {@code samples} parameter equaling the value of {@code rasterizationSamples} in the last call to #CmdSetRasterizationSamplesEXT()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state disabled and the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, the {@code sampleLocationsEnable} member of a ##VkPipelineSampleLocationsStateCreateInfoEXT{@code ::sampleLocationsEnable} in the bound graphics pipeline is #TRUE or #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT state enabled, then, {@code sampleLocationsInfo.sampleLocationsPerPixel} <b>must</b> equal {@code rasterizationSamples} in the last call to #CmdSetRasterizationSamplesEXT()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV state enabled and the last call to #CmdSetCoverageModulationTableEnableNV() set {@code coverageModulationTableEnable} to #TRUE, then the {@code coverageModulationTableCount} parameter in the last call to #CmdSetCoverageModulationTableNV() <b>must</b> equal the current {@code rasterizationSamples} divided by the number of color samples in the current subpass</li>
            <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and if current subpass has a depth/stencil attachment and depth test, stencil test, or depth bounds test are enabled in the currently bound pipeline state, then the current {@code rasterizationSamples} <b>must</b> be the same as the sample count of the depth/stencil attachment</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV state enabled and the last call to #CmdSetCoverageToColorEnableNV() set the {@code coverageToColorEnable} to #TRUE, then the current subpass <b>must</b> have a color attachment at the location selected by the last call to #CmdSetCoverageToColorLocationNV() {@code coverageToColorLocation}, with a {@code VkFormat} of #FORMAT_R8_UINT, #FORMAT_R8_SINT, #FORMAT_R16_UINT, #FORMAT_R16_SINT, #FORMAT_R32_UINT, or #FORMAT_R32_SINT</li>
            <li>If this {@link NVCoverageReductionMode VK_NV_coverage_reduction_mode} extension is enabled, the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV and #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT states enabled, the current coverage reduction mode {@code coverageReductionMode}, then the current {@code rasterizationSamples}, and the sample counts for the color and depth/stencil attachments (if the subpass has them) <b>must</b> be a valid combination returned by #GetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled, but not the #DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV dynamic state enabled, then the bound graphics pipeline <b>must</b> have been created with ##VkPipelineViewportSwizzleStateCreateInfoNV{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT and #DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV dynamic states enabled then the {@code viewportCount} parameter in the last call to #CmdSetViewportSwizzleNV() <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and if the current subpass has any color attachments and {@code rasterizationSamples} of the last call to #CmdSetRasterizationSamplesEXT() is greater than the number of color samples, then the pipeline {@code sampleShadingEnable} <b>must</b> be #FALSE</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT or #DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT dynamic states enabled, and if the current {@code stippledLineEnable} state is #TRUE and the current {@code lineRasterizationMode} state is #LINE_RASTERIZATION_MODE_RECTANGULAR_EXT, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledRectangularLines">{@code stippledRectangularLines}</a> feature <b>must</b> be enabled</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT or #DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT dynamic states enabled, and if the current {@code stippledLineEnable} state is #TRUE and the current {@code lineRasterizationMode} state is #LINE_RASTERIZATION_MODE_BRESENHAM_EXT, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledBresenhamLines">{@code stippledBresenhamLines}</a> feature <b>must</b> be enabled</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT or #DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT dynamic states enabled, and if the current {@code stippledLineEnable} state is #TRUE and the current {@code lineRasterizationMode} state is #LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledSmoothLines">{@code stippledSmoothLines}</a> feature <b>must</b> be enabled</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT or #DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT dynamic states enabled, and if the current {@code stippledLineEnable} state is #TRUE and the current {@code lineRasterizationMode} state is #LINE_RASTERIZATION_MODE_DEFAULT_EXT, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledRectangularLines">{@code stippledRectangularLines}</a> feature <b>must</b> be enabled and ##VkPhysicalDeviceLimits{@code ::strictLines} <b>must</b> be #TRUE</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT dynamic state enabled, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-conservativePointAndLineRasterization">{@code conservativePointAndLineRasterization}</a> is not supported, and the effective primitive topology output by the last pre-rasterization shader stage is a line or point, then the {@code conservativeRasterizationMode} set by the last call to #CmdSetConservativeRasterizationModeEXT() <b>must</b> be #CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT</li>
            <li>If the currently bound pipeline was created with the ##VkPipelineShaderStageCreateInfo{@code ::stage} member of an element of ##VkGraphicsPipelineCreateInfo{@code ::pStages} set to #SHADER_STAGE_VERTEX_BIT, #SHADER_STAGE_TESSELLATION_CONTROL_BIT, #SHADER_STAGE_TESSELLATION_EVALUATION_BIT or #SHADER_STAGE_GEOMETRY_BIT, then <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#queries-mesh-shader">Mesh Shader Queries</a> <b>must</b> not be active</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT dynamic state #CmdSetAttachmentFeedbackLoopEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If dynamic state was inherited from ##VkCommandBufferInheritanceViewportScissorInfoNV, it <b>must</b> be set in the current command buffer prior to this drawing command</li>
            <li>If there is no bound graphics pipeline, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of #SHADER_STAGE_VERTEX_BIT</li>
            <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-tessellationShader">{@code tessellationShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of #SHADER_STAGE_TESSELLATION_CONTROL_BIT</li>
            <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-tessellationShader">{@code tessellationShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of #SHADER_STAGE_TESSELLATION_EVALUATION_BIT</li>
            <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-geometryShader">{@code geometryShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of #SHADER_STAGE_GEOMETRY_BIT</li>
            <li>If there is no bound graphics pipeline, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of #SHADER_STAGE_FRAGMENT_BIT</li>
            <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-taskShader">{@code taskShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of #SHADER_STAGE_TASK_BIT_EXT</li>
            <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-meshShader">{@code meshShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of #SHADER_STAGE_MESH_BIT_EXT</li>
            <li>If there is no bound graphics pipeline, and at least one of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-taskShader">{@code taskShader}</a> and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-meshShader">{@code meshShader}</a> features is enabled, one of the #SHADER_STAGE_VERTEX_BIT or #SHADER_STAGE_MESH_BIT_EXT stages <b>must</b> have a valid {@code VkShaderEXT} bound, and the other <b>must</b> have no {@code VkShaderEXT} bound</li>
            <li>If there is no bound graphics pipeline, and both the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-taskShader">{@code taskShader}</a> and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-meshShader">{@code meshShader}</a> features are enabled, and a valid {@code VkShaderEXT} is bound the to the #SHADER_STAGE_MESH_BIT_EXT stage, and that {@code VkShaderEXT} was created without the #SHADER_CREATE_NO_TASK_SHADER_BIT_EXT flag, a valid {@code VkShaderEXT} <b>must</b> be bound to the #SHADER_STAGE_TASK_BIT_EXT stage</li>
            <li>If there is no bound graphics pipeline, and both the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-taskShader">{@code taskShader}</a> and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-meshShader">{@code meshShader}</a> features are enabled, and a valid {@code VkShaderEXT} is bound the to the #SHADER_STAGE_MESH_BIT_EXT stage, and that {@code VkShaderEXT} was created with the #SHADER_CREATE_NO_TASK_SHADER_BIT_EXT flag, there <b>must</b> be no {@code VkShaderEXT} bound to the #SHADER_STAGE_TASK_BIT_EXT stage</li>
            <li>If there is no bound graphics pipeline, and a valid {@code VkShaderEXT} is bound to the #SHADER_STAGE_VERTEX_BIT stage, there <b>must</b> be no {@code VkShaderEXT} bound to either the #SHADER_STAGE_TASK_BIT_EXT stage or the #SHADER_STAGE_MESH_BIT_EXT stage</li>
            <li>If any graphics shader is bound which was created with the #SHADER_CREATE_LINK_STAGE_BIT_EXT flag, then all shaders created with the #SHADER_CREATE_LINK_STAGE_BIT_EXT flag in the same #CreateShadersEXT() call <b>must</b> also be bound</li>
            <li>If any graphics shader is bound which was created with the #SHADER_CREATE_LINK_STAGE_BIT_EXT flag, any stages in between stages whose shaders which did not create a shader with the #SHADER_CREATE_LINK_STAGE_BIT_EXT flag as part of the same #CreateShadersEXT() call <b>must</b> not have any {@code VkShaderEXT} bound</li>
            <li>All bound graphics shader objects <b>must</b> have been created with identical or identically defined push constant ranges</li>
            <li>All bound graphics shader objects <b>must</b> have been created with identical or identically defined arrays of descriptor set layouts</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-attachmentFeedbackLoopDynamicState">attachmentFeedbackLoopDynamicState</a> feature is enabled on the device, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE #CmdSetAttachmentFeedbackLoopEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state includes a fragment shader stage, was created with #DYNAMIC_STATE_DEPTH_WRITE_ENABLE set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}, and the fragment shader declares the {@code EarlyFragmentTests} execution mode and uses {@code OpDepthAttachmentReadEXT}, the {@code depthWriteEnable} parameter in the last call to #CmdSetDepthWriteEnable() <b>must</b> be #FALSE</li>
            <li>If the bound graphics pipeline state includes a fragment shader stage, was created with #DYNAMIC_STATE_STENCIL_WRITE_MASK set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}, and the fragment shader declares the {@code EarlyFragmentTests} execution mode and uses {@code OpStencilAttachmentReadEXT}, the {@code writeMask} parameter in the last call to #CmdSetStencilWriteMask() <b>must</b> be 0</li>
            <li>If a shader object is bound to any graphics stage or the currently bound graphics pipeline was created with #DYNAMIC_STATE_COLOR_WRITE_MASK_EXT, and the format of any color attachment is #FORMAT_E5B9G9R9_UFLOAT_PACK32, the corresponding element of the {@code pColorWriteMasks} parameter of #CmdSetColorWriteMaskEXT() <b>must</b> either include all of #COLOR_COMPONENT_R_BIT, #COLOR_COMPONENT_G_BIT, and #COLOR_COMPONENT_B_BIT, or none of them</li>
            <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#framebuffer-blending">blending</a> is enabled for any attachment where either the source or destination blend factors for that attachment <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#framebuffer-dsb">use the secondary color input</a>, the maximum value of {@code Location} for any output attachment <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-staticuse">statically used</a> in the {@code Fragment} {@code Execution} {@code Model} executed by this command <b>must</b> be less than <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-maxFragmentDualSrcAttachments">{@code maxFragmentDualSrcAttachments}</a></li>
        </ul>

        <ul>
            <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point’s interface <b>must</b> have either valid or #NULL_HANDLE buffers bound</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-nullDescriptor">{@code nullDescriptor}</a> feature is not enabled, all vertex input bindings accessed via vertex input variables declared in the vertex shader entry point’s interface <b>must</b> not be #NULL_HANDLE</li>
            <li>For a given vertex buffer binding, any attribute data fetched <b>must</b> be entirely contained within the corresponding vertex buffer binding, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fxvertex-input">Vertex Input Description</a></li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_PRIMITIVE_TOPOLOGY dynamic state enabled then #CmdSetPrimitiveTopology() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_PRIMITIVE_TOPOLOGY dynamic state enabled and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-dynamicPrimitiveTopologyUnrestricted">{@code dynamicPrimitiveTopologyUnrestricted}</a> is #FALSE, then the {@code primitiveTopology} parameter of {@code vkCmdSetPrimitiveTopology} <b>must</b> be of the same <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#drawing-primitive-topology-class">topology class</a> as the pipeline ##VkPipelineInputAssemblyStateCreateInfo{@code ::topology} state</li>
            <li>If the bound graphics pipeline was created with both the #DYNAMIC_STATE_VERTEX_INPUT_EXT and #DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT dynamic states enabled, then #CmdSetVertexInputEXT() <b>must</b> have been called in the current command buffer prior to this draw command</li>
            <li>If the bound graphics pipeline was created with the #DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT dynamic state enabled, but not the #DYNAMIC_STATE_VERTEX_INPUT_EXT dynamic state enabled, then #CmdBindVertexBuffers2EXT() <b>must</b> have been called in the current command buffer prior to this draw command, and the {@code pStrides} parameter of #CmdBindVertexBuffers2EXT() <b>must</b> not be {@code NULL}</li>
            <li>If a shader object is bound to the #SHADER_STAGE_VERTEX_BIT stage, then #CmdSetPrimitiveTopology() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VERTEX_INPUT_EXT dynamic state enabled, then #CmdSetVertexInputEXT() <b>must</b> have been called in the current command buffer prior to this draw command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VERTEX_INPUT_EXT dynamic state enabled, then all variables with the {@code Input} storage class decorated with {@code Location} in the {@code Vertex} {@code Execution} {@code Model} {@code OpEntryPoint} <b>must</b> contain a location in ##VkVertexInputAttributeDescription2EXT{@code ::location}</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VERTEX_INPUT_EXT dynamic state enabled, then the numeric type associated with all {@code Input} variables of the corresponding {@code Location} in the {@code Vertex} {@code Execution} {@code Model} {@code OpEntryPoint} <b>must</b> be the same as ##VkVertexInputAttributeDescription2EXT{@code ::format}</li>
            <li>If there is a shader object bound to a graphics stage or the currently bound graphics pipeline was created with the #DYNAMIC_STATE_VERTEX_INPUT_EXT dynamic state enabled, and ##VkVertexInputAttributeDescription2EXT{@code ::format} has a 64-bit component, then the scalar width associated with all {@code Input} variables of the corresponding {@code Location} in the {@code Vertex} {@code Execution} {@code Model} {@code OpEntryPoint} <b>must</b> be 64-bit</li>
            <li>If there is a shader object bound to a graphics stage or the currently bound graphics pipeline was created with the #DYNAMIC_STATE_VERTEX_INPUT_EXT dynamic state enabled, and the scalar width associated with a {@code Location} decorated {@code Input} variable in the {@code Vertex} {@code Execution} {@code Model} {@code OpEntryPoint} is 64-bit, then the corresponding ##VkVertexInputAttributeDescription2EXT{@code ::format} <b>must</b> have a 64-bit component</li>
            <li>If there is a shader object bound to a graphics stage or the currently bound graphics pipeline was created with the #DYNAMIC_STATE_VERTEX_INPUT_EXT dynamic state enabled, and ##VkVertexInputAttributeDescription2EXT{@code ::format} has a 64-bit component, then all {@code Input} variables at the corresponding {@code Location} in the {@code Vertex} {@code Execution} {@code Model} {@code OpEntryPoint} <b>must</b> not use components that are not present in the format</li>
            <li>If a shader object is bound to the #SHADER_STAGE_VERTEX_BIT stage, then #CmdSetVertexInputEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT dynamic state enabled then #CmdSetPatchControlPointsEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to the #SHADER_STAGE_TESSELLATION_EVALUATION_BIT stage, then #CmdSetPatchControlPointsEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE dynamic state enabled then #CmdSetPrimitiveRestartEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, #CmdSetPrimitiveRestartEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>The bound graphics pipeline <b>must</b> not have been created with the ##VkPipelineShaderStageCreateInfo{@code ::stage} member of an element of ##VkGraphicsPipelineCreateInfo{@code ::pStages} set to #SHADER_STAGE_TASK_BIT_EXT or #SHADER_STAGE_MESH_BIT_EXT</li>
            <li>There <b>must</b> be no shader object bound to either of the #SHADER_STAGE_TASK_BIT_EXT or #SHADER_STAGE_MESH_BIT_EXT stages</li>
        </ul>

        <ul>
            <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code buffer} <b>must</b> have been created with the #BUFFER_USAGE_INDIRECT_BUFFER_BIT bit set</li>
            <li>{@code offset} <b>must</b> be a multiple of 4</li>
            <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
        </ul>

        <ul>
            <li>If {@code countBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code countBuffer} <b>must</b> have been created with the #BUFFER_USAGE_INDIRECT_BUFFER_BIT bit set</li>
            <li>{@code countBufferOffset} <b>must</b> be a multiple of 4</li>
            <li>The count stored in {@code countBuffer} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxDrawIndirectCount}</li>
            <li><code>(countBufferOffset + sizeof(uint32_t))</code> <b>must</b> be less than or equal to the size of {@code countBuffer}</li>
            <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-drawIndirectCount">{@code drawIndirectCount}</a> is not enabled this function <b>must</b> not be used</li>
            <li>{@code stride} <b>must</b> be a multiple of 4 and <b>must</b> be greater than or equal to sizeof(##VkDrawIndirectCommand)</li>
            <li>If {@code maxDrawCount} is greater than or equal to 1, <code>(stride × (maxDrawCount - 1) + offset + sizeof(##VkDrawIndirectCommand))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
            <li>If the count stored in {@code countBuffer} is equal to 1, <code>(offset + sizeof(##VkDrawIndirectCommand))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
            <li>If the count stored in {@code countBuffer} is greater than 1, <code>(stride × (drawCount - 1) + offset + sizeof(##VkDrawIndirectCommand))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code countBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>Each of {@code buffer}, {@code commandBuffer}, and {@code countBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Outside</td><td>Graphics</td><td>Action</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        VkBuffer("buffer", "the buffer containing draw parameters."),
        VkDeviceSize("offset", "the byte offset into {@code buffer} where parameters begin."),
        VkBuffer("countBuffer", "the buffer containing the draw count."),
        VkDeviceSize("countBufferOffset", "the byte offset into {@code countBuffer} where the draw count begins."),
        uint32_t("maxDrawCount", "specifies the maximum number of draws that will be executed. The actual number of executed draw calls is the minimum of the count specified in {@code countBuffer} and {@code maxDrawCount}."),
        uint32_t("stride", "the byte stride between successive sets of draw parameters.")
    )

    void(
        "CmdDrawIndexedIndirectCount",
        """
        Draw parameters with indirect parameters, indexed vertices, and draw count.

        <h5>C Specification</h5>
        To record an indexed draw call with a draw call count sourced from a buffer, call:

        <pre><code>
￿void vkCmdDrawIndexedIndirectCount(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    buffer,
￿    VkDeviceSize                                offset,
￿    VkBuffer                                    countBuffer,
￿    VkDeviceSize                                countBufferOffset,
￿    uint32_t                                    maxDrawCount,
￿    uint32_t                                    stride);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdDrawIndexedIndirectCountKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    buffer,
￿    VkDeviceSize                                offset,
￿    VkBuffer                                    countBuffer,
￿    VkDeviceSize                                countBufferOffset,
￿    uint32_t                                    maxDrawCount,
￿    uint32_t                                    stride);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdDrawIndexedIndirectCountAMD(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    buffer,
￿    VkDeviceSize                                offset,
￿    VkBuffer                                    countBuffer,
￿    VkDeviceSize                                countBufferOffset,
￿    uint32_t                                    maxDrawCount,
￿    uint32_t                                    stride);</code></pre>

        <h5>Description</h5>
        {@code vkCmdDrawIndexedIndirectCount} behaves similarly to #CmdDrawIndexedIndirect() except that the draw count is read by the device from a buffer during execution. The command will read an unsigned 32-bit integer from {@code countBuffer} located at {@code countBufferOffset} and use this as the draw count.

        <h5>Valid Usage</h5>
        <ul>
            <li>If a {@code VkSampler} created with {@code magFilter} or {@code minFilter} equal to #FILTER_LINEAR and {@code compareEnable} equal to #FALSE is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT</li>
            <li>If a {@code VkSampler} created with {@code mipmapMode} equal to #SAMPLER_MIPMAP_MODE_LINEAR and {@code compareEnable} equal to #FALSE is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT</li>
            <li>If a {@code VkImageView} is sampled with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#textures-depth-compare-operation">depth comparison</a>, the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT</li>
            <li>If a {@code VkImageView} is accessed using atomic operations as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT</li>
            <li>If a #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER descriptor is accessed using atomic operations as a result of this command, then the storage texel buffer’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-buffer-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT</li>
            <li>If a {@code VkImageView} is sampled with #FILTER_CUBIC_EXT as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT</li>
            <li>If the {@link EXTFilterCubic VK_EXT_filter_cubic} extension is not enabled and any {@code VkImageView} is sampled with #FILTER_CUBIC_EXT as a result of this command, it <b>must</b> not have a {@code VkImageViewType} of #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, or #IMAGE_VIEW_TYPE_CUBE_ARRAY</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering, as specified by ##VkFilterCubicImageViewImageFormatPropertiesEXT{@code ::filterCubic} returned by #GetPhysicalDeviceImageFormatProperties2()</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT with a reduction mode of either #SAMPLER_REDUCTION_MODE_MIN or #SAMPLER_REDUCTION_MODE_MAX as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering together with minmax filtering, as specified by ##VkFilterCubicImageViewImageFormatPropertiesEXT{@code ::filterCubicMinmax} returned by #GetPhysicalDeviceImageFormatProperties2()</li>
            <li>
                If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-filter-cubic-range-clamp">{@code cubicRangeClamp}</a> feature is not enabled, then any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT as a result of this command
                <dl>
            <dt><b>must</b> not have a ##VkSamplerReductionModeCreateInfo</dt>
                    <dd>{@code reductionMode} equal to #SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM</dd>
                </dl>
            </li>
            <li>Any {@code VkImageView} being sampled with a ##VkSamplerReductionModeCreateInfo{@code ::reductionMode} equal to #SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM as a result of this command <b>must</b> sample with #FILTER_CUBIC_EXT</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-filter-cubic-weight-selection">{@code selectableCubicWeights}</a> feature is not enabled, then any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT as a result of this command <b>must</b> have ##VkSamplerCubicWeightsCreateInfoQCOM{@code ::cubicWeights} equal to #CUBIC_FILTER_WEIGHTS_CATMULL_ROM_QCOM</li>
            <li>Any {@code VkImage} created with a ##VkImageCreateInfo{@code ::flags} containing #IMAGE_CREATE_CORNER_SAMPLED_BIT_NV sampled as a result of this command <b>must</b> only be sampled using a {@code VkSamplerAddressMode} of #SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE</li>
            <li>For any {@code VkImageView} being written as a storage image where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT</li>
            <li>For any {@code VkImageView} being read as a storage image where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT</li>
            <li>For any {@code VkBufferView} being written as a storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkFormatProperties3">buffer features</a> <b>must</b> contain #FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT</li>
            <li>Any {@code VkBufferView} being read as a storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown} then the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkFormatProperties3">buffer features</a> <b>must</b> contain #FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT</li>
            <li>For each set <em>n</em> that is statically used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-binding">a bound shader</a>, a descriptor set <b>must</b> have been bound to <em>n</em> at the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} or {@code VkDescriptorSetLayout} array that was used to create the current {@code VkPipeline} or {@code VkShaderEXT}, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>For each push constant that is statically used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-binding">a bound shader</a>, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} or {@code VkDescriptorSetLayout} and ##VkPushConstantRange arrays used to create the current {@code VkPipeline} or {@code VkShaderEXT}, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-maintenance4">{@code maintenance4}</a> feature is not enabled, then for each push constant that is statically used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-binding">a bound shader</a>, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} or {@code VkDescriptorSetLayout} and ##VkPushConstantRange arrays used to create the current {@code VkPipeline} or {@code VkShaderEXT}, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>Descriptors in each bound descriptor set, specified via #CmdBindDescriptorSets(), <b>must</b> be valid if they are statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command and the bound {@code VkPipeline} was not created with #PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT</li>
            <li>If the descriptors used by the {@code VkPipeline} bound to the pipeline bind point were specified via #CmdBindDescriptorSets(), the bound {@code VkPipeline} <b>must</b> have been created without #PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT</li>
            <li>Descriptors in bound descriptor buffers, specified via #CmdSetDescriptorBufferOffsetsEXT(), <b>must</b> be valid if they are dynamically used by the {@code VkPipeline} bound to the pipeline bind point used by this command and the bound {@code VkPipeline} was created with #PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT</li>
            <li>Descriptors in bound descriptor buffers, specified via #CmdSetDescriptorBufferOffsetsEXT(), <b>must</b> be valid if they are dynamically used by any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command</li>
            <li>If the descriptors used by the {@code VkPipeline} bound to the pipeline bind point were specified via #CmdSetDescriptorBufferOffsetsEXT(), the bound {@code VkPipeline} <b>must</b> have been created with #PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT</li>
            <li>If a descriptor is dynamically used with a {@code VkPipeline} created with #PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT, the descriptor memory <b>must</b> be resident</li>
            <li>If a descriptor is dynamically used with a {@code VkShaderEXT} created with a {@code VkDescriptorSetLayout} that was created with #DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT, the descriptor memory <b>must</b> be resident</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature is not enabled, a valid pipeline <b>must</b> be bound to the pipeline bind point used by this command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> is enabled, either a valid pipeline <b>must</b> be bound to the pipeline bind point used by this command, or a valid combination of valid and #NULL_HANDLE shader objects <b>must</b> be bound to every supported shader stage corresponding to the pipeline bind point used by this command</li>
            <li>If a pipeline is bound to the pipeline bind point used by this command, there <b>must</b> not have been any calls to dynamic state setting commands for any state not specified as dynamic in the {@code VkPipeline} object bound to the pipeline bind point used by this command, since that pipeline was bound</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
            <li>If any stage of the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a uniform buffer, and that stage was created without enabling either #PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT or #PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT for {@code uniformBuffers}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, that stage <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, and any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a uniform buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If any stage of the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a storage buffer, and that stage was created without enabling either #PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT or #PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT for {@code storageBuffers}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, that stage <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, and any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a storage buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If {@code commandBuffer} is an unprotected command buffer and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, any resource accessed by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-binding">bound shaders</a> <b>must</b> not be a protected resource</li>
            <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-binding">a bound shader</a> accesses a {@code VkSampler} or {@code VkImageView} object that enables <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> only be used with {@code OpImageSample*} or {@code OpImageSparseSample*} instructions</li>
            <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-binding">a bound shader</a> accesses a {@code VkSampler} or {@code VkImageView} object that enables <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> not use the {@code ConstOffset} and {@code Offset} operands</li>
            <li>If a {@code VkImageView} is accessed as a result of this command, then the image view’s {@code viewType} <b>must</b> match the {@code Dim} operand of the {@code OpTypeImage} as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#textures-operation-validation">textures-operation-validation</a></li>
            <li>If a {@code VkImageView} is accessed as a result of this command, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#formats-numericformat">numeric type</a> of the image view’s {@code format} and the {@code Sampled} {@code Type} operand of the {@code OpTypeImage} <b>must</b> match</li>
            <li>If a {@code VkImageView} created with a format other than #FORMAT_A8_UNORM_KHR is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have at least as many components as the image view’s format</li>
            <li>If a {@code VkImageView} created with the format #FORMAT_A8_UNORM_KHR is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have four components</li>
            <li>If a {@code VkBufferView} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have at least as many components as the buffer view’s format</li>
            <li>If a {@code VkImageView} with a {@code VkFormat} that has a 64-bit component width is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 64</li>
            <li>If a {@code VkImageView} with a {@code VkFormat} that has a component width less than 64-bit is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 32</li>
            <li>If a {@code VkBufferView} with a {@code VkFormat} that has a 64-bit component width is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 64</li>
            <li>If a {@code VkBufferView} with a {@code VkFormat} that has a component width less than 64-bit is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 32</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-sparseImageInt64Atomics">{@code sparseImageInt64Atomics}</a> feature is not enabled, {@code VkImage} objects created with the #IMAGE_CREATE_SPARSE_RESIDENCY_BIT flag <b>must</b> not be accessed by atomic instructions through an {@code OpTypeImage} with a {@code SampledType} with a {@code Width} of 64 by this command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-sparseImageInt64Atomics">{@code sparseImageInt64Atomics}</a> feature is not enabled, {@code VkBuffer} objects created with the #BUFFER_CREATE_SPARSE_RESIDENCY_BIT flag <b>must</b> not be accessed by atomic instructions through an {@code OpTypeImage} with a {@code SampledType} with a {@code Width} of 64 by this command</li>
            <li>If {@code OpImageWeightedSampleQCOM} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_WEIGHT_SAMPLED_IMAGE_BIT_QCOM</li>
            <li>If {@code OpImageWeightedSampleQCOM} uses a {@code VkImageView} as a sample weight image as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_WEIGHT_IMAGE_BIT_QCOM</li>
            <li>If {@code OpImageBoxFilterQCOM} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_BOX_FILTER_SAMPLED_BIT_QCOM</li>
            <li>If {@code OpImageBlockMatchSSDQCOM} is used to read from an {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM</li>
            <li>If {@code OpImageBlockMatchSADQCOM} is used to read from an {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM</li>
            <li>If {@code OpImageBlockMatchSADQCOM} or OpImageBlockMatchSSDQCOM is used to read from a reference image as result of this command, then the specified reference coordinates <b>must</b> not fail <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#textures-integer-coordinate-validation">integer texel coordinate validation</a></li>
            <li>If {@code OpImageWeightedSampleQCOM}, {@code OpImageBoxFilterQCOM}, {@code OpImageBlockMatchWindowSSDQCOM}, {@code OpImageBlockMatchWindowSADQCOM}, {@code OpImageBlockMatchGatherSSDQCOM}, {@code OpImageBlockMatchGatherSADQCOM}, {@code OpImageBlockMatchSSDQCOM}, or {@code OpImageBlockMatchSADQCOM} uses a {@code VkSampler} as a result of this command, then the sampler <b>must</b> have been created with #SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM</li>
            <li>If any command other than {@code OpImageWeightedSampleQCOM}, {@code OpImageBoxFilterQCOM}, {@code OpImageBlockMatchWindowSSDQCOM}, {@code OpImageBlockMatchWindowSADQCOM}, {@code OpImageBlockMatchGatherSSDQCOM}, {@code OpImageBlockMatchGatherSADQCOM}, {@code OpImageBlockMatchSSDQCOM}, or {@code OpImageBlockMatchSADQCOM} uses a {@code VkSampler} as a result of this command, then the sampler <b>must</b> not have been created with #SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM</li>
            <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} instruction is used to read from an {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM</li>
            <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} instruction is used to read from an {@code VkImageView} as a result of this command, then the image view’s format <b>must</b> be a single-component format.</li>
            <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} read from a reference image as result of this command, then the specified reference coordinates <b>must</b> not fail <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#textures-integer-coordinate-validation">integer texel coordinate validation</a></li>
            <li>Any shader invocation executed by this command <b>must</b> <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-termination">terminate</a></li>
            <li>The current render pass <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} bound to #PIPELINE_BIND_POINT_GRAPHICS</li>
            <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} bound to #PIPELINE_BIND_POINT_GRAPHICS</li>
            <li>If any shader statically accesses an input attachment, a valid descriptor <b>must</b> be bound to the pipeline via a descriptor set</li>
            <li>If any shader executed by this pipeline accesses an {@code OpTypeImage} variable with a {@code Dim} operand of {@code SubpassData}, it <b>must</b> be decorated with an {@code InputAttachmentIndex} that corresponds to a valid input attachment in the current subpass</li>
            <li>Input attachment views accessed in a subpass <b>must</b> be created with the same {@code VkFormat} as the corresponding subpass definition, and be created with a {@code VkImageView} that is compatible with the attachment referenced by the subpass' {@code pInputAttachments}[{@code InputAttachmentIndex}] in the currently bound {@code VkFramebuffer} as specified by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#compatibility-inputattachment">Fragment Input Attachment Compatibility</a></li>
            <li>Memory backing image subresources used as attachments in the current render pass <b>must</b> not be written in any way other than as an attachment by this command</li>
            <li>
                If a color attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it is not in the #IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT image layout, and either:
                <ul>
                    <li>the #PIPELINE_CREATE_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT is set on the currently bound pipeline or</li>
                    <li>
                        the last call to #CmdSetAttachmentFeedbackLoopEnableEXT() included #IMAGE_ASPECT_COLOR_BIT and
                        <ul>
                            <li>there is no currently bound graphics pipeline or</li>
                            <li>the currently bound graphics pipeline was created with #DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT it <b>must</b> not be accessed in any way other than as an attachment by this command</li>
                        </ul>
                    </li>
                </ul>
            </li>
            <li>
                If a depth attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it is not in the #IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT image layout, and either:
                <ul>
                    <li>the #PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT is set on the currently bound pipeline or</li>
                    <li>
                        the last call to #CmdSetAttachmentFeedbackLoopEnableEXT() included #IMAGE_ASPECT_DEPTH_BIT and
                        <ul>
                            <li>there is no currently bound graphics pipeline or</li>
                            <li>the currently bound graphics pipeline was created with #DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT it <b>must</b> not be accessed in any way other than as an attachment by this command</li>
                        </ul>
                    </li>
                </ul>
            </li>
            <li>
                If a stencil attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it is not in the #IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT image layout, and either:
                <ul>
                    <li>the #PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT is set on the currently bound pipeline or</li>
                    <li>
                        the last call to #CmdSetAttachmentFeedbackLoopEnableEXT() included #IMAGE_ASPECT_STENCIL_BIT and
                        <ul>
                            <li>there is no currently bound graphics pipeline or</li>
                            <li>the currently bound graphics pipeline was created with #DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT it <b>must</b> not be accessed in any way other than as an attachment by this command</li>
                        </ul>
                    </li>
                </ul>
            </li>
            <li>If an attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it <b>must</b> not be accessed in any way other than as an attachment, storage image, or sampled image by this command</li>
            <li>If any previously recorded command in the current subpass accessed an image subresource used as an attachment in this subpass in any way other than as an attachment, this command <b>must</b> not write to that image subresource as an attachment</li>
            <li>If the current render pass instance uses a depth/stencil attachment with a read-only layout for the depth aspect, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fragops-depth-write">depth writes</a> <b>must</b> be disabled</li>
            <li>If the current render pass instance uses a depth/stencil attachment with a read-only layout for the stencil aspect, both front and back {@code writeMask} are not zero, and stencil test is enabled, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fragops-stencil">all stencil ops</a> <b>must</b> be #STENCIL_OP_KEEP</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT dynamic state enabled then #CmdSetViewport() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SCISSOR dynamic state enabled then #CmdSetScissor() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_WIDTH dynamic state enabled then #CmdSetLineWidth() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetPolygonModeEXT() in the current command buffer set {@code polygonMode} to #POLYGON_MODE_LINE, #CmdSetLineWidth() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to the #SHADER_STAGE_VERTEX_BIT stage, and the most recent call to #CmdSetPrimitiveTopology() in the current command buffer set {@code primitiveTopology} to any line topology, #CmdSetLineWidth() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object that outputs line primitives is bound to the #SHADER_STAGE_TESSELLATION_EVALUATION_BIT or #SHADER_STAGE_GEOMETRY_BIT stage, #CmdSetLineWidth() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_BIAS dynamic state enabled then #CmdSetDepthBias() or #CmdSetDepthBias2EXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetDepthBiasEnable() in the current command buffer set {@code depthBiasEnable} to #TRUE, #CmdSetDepthBias() or #CmdSetDepthBias2EXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_BLEND_CONSTANTS dynamic state enabled then #CmdSetBlendConstants() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetColorBlendEnableEXT() in the current command buffer set any element of {@code pColorBlendEnables} to #TRUE, and the most recent call to #CmdSetColorBlendEquationEXT() in the current command buffer set the same element of {@code pColorBlendEquations} to a ##VkColorBlendEquationEXT structure with any {@code VkBlendFactor} member with a value of #BLEND_FACTOR_CONSTANT_COLOR, #BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR, #BLEND_FACTOR_CONSTANT_ALPHA, or #BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA, #CmdSetBlendConstants() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_BOUNDS dynamic state enabled then #CmdSetDepthBounds() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetDepthBoundsTestEnable() in the current command buffer set {@code depthBoundsTestEnable} to #TRUE, then #CmdSetDepthBounds() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_STENCIL_COMPARE_MASK dynamic state enabled then #CmdSetStencilCompareMask() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetStencilTestEnable() in the current command buffer set {@code stencilTestEnable} to #TRUE, #CmdSetStencilCompareMask() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_STENCIL_WRITE_MASK dynamic state enabled then #CmdSetStencilWriteMask() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetStencilTestEnable() in the current command buffer set {@code stencilTestEnable} to #TRUE, #CmdSetStencilWriteMask() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_STENCIL_REFERENCE dynamic state enabled then #CmdSetStencilReference() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetStencilTestEnable() in the current command buffer set {@code stencilTestEnable} to #TRUE, #CmdSetStencilReference() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the draw is recorded in a render pass instance with multiview enabled, the maximum instance index <b>must</b> be less than or equal to ##VkPhysicalDeviceMultiviewProperties{@code ::maxMultiviewInstanceIndex}</li>
            <li>If the bound graphics pipeline was created with ##VkPipelineSampleLocationsStateCreateInfoEXT{@code ::sampleLocationsEnable} set to #TRUE and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the #IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT bit set</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT dynamic state enabled then #CmdSetSampleLocationsEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetSampleLocationsEnableEXT() in the current command buffer set {@code sampleLocationsEnable} to #TRUE, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetSampleLocationsEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state enabled, then the {@code sampleLocationsPerPixel} member of {@code pSampleLocationsInfo} in the last call to #CmdSetSampleLocationsEXT() <b>must</b> equal the {@code rasterizationSamples} member of the ##VkPipelineMultisampleStateCreateInfo structure the bound graphics pipeline has been created with</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_CULL_MODE dynamic state enabled then #CmdSetCullMode() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetCullMode() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_FRONT_FACE dynamic state enabled then #CmdSetFrontFace() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetFrontFace() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_TEST_ENABLE dynamic state enabled then #CmdSetDepthTestEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetDepthTestEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_WRITE_ENABLE dynamic state enabled then #CmdSetDepthWriteEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetDepthWriteEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_COMPARE_OP dynamic state enabled then #CmdSetDepthCompareOp() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetDepthTestEnable() in the current command buffer set {@code depthTestEnable} to #TRUE, then #CmdSetDepthCompareOp() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE dynamic state enabled then #CmdSetDepthBoundsTestEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-depthBounds">{@code depthBounds}</a> feature is enabled, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then the #CmdSetDepthBoundsTestEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_STENCIL_TEST_ENABLE dynamic state enabled then #CmdSetStencilTestEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetStencilTestEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_STENCIL_OP dynamic state enabled then #CmdSetStencilOp() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetStencilTestEnable() in the current command buffer set {@code stencilTestEnable} to #TRUE, then #CmdSetStencilOp() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled, but not the #DYNAMIC_STATE_SCISSOR_WITH_COUNT dynamic state enabled, then #CmdSetViewportWithCount() <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> match the ##VkPipelineViewportStateCreateInfo{@code ::scissorCount} of the pipeline</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SCISSOR_WITH_COUNT dynamic state enabled, but not the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled, then #CmdSetScissorWithCount() <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code scissorCount} parameter of {@code vkCmdSetScissorWithCount} <b>must</b> match the ##VkPipelineViewportStateCreateInfo{@code ::viewportCount} of the pipeline</li>
            <li>If the bound graphics pipeline state was created with both the #DYNAMIC_STATE_SCISSOR_WITH_COUNT and #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic states enabled then both #CmdSetViewportWithCount() and #CmdSetScissorWithCount() <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> match the {@code scissorCount} parameter of {@code vkCmdSetScissorWithCount}</li>
            <li>If a shader object is bound to any graphics stage, then both #CmdSetViewportWithCount() and #CmdSetScissorWithCount() <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> match the {@code scissorCount} parameter of {@code vkCmdSetScissorWithCount}</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled, but not the #DYNAMIC_STATE_VIEWPORT_W_SCALING_NV dynamic state enabled, then the bound graphics pipeline <b>must</b> have been created with ##VkPipelineViewportWScalingStateCreateInfoNV{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT and #DYNAMIC_STATE_VIEWPORT_W_SCALING_NV dynamic states enabled then the {@code viewportCount} parameter in the last call to #CmdSetViewportWScalingNV() <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If a shader object is bound to any graphics stage, and the {@link NVClipSpaceWScaling VK_NV_clip_space_w_scaling} extension is enabled on the device, then #CmdSetViewportWScalingNV() must have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the {@link NVClipSpaceWScaling VK_NV_clip_space_w_scaling} extension is enabled on the device, then the {@code viewportCount} parameter in the last call to #CmdSetViewportWScalingNV() <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled, but not the #DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV dynamic state enabled, then the bound graphics pipeline <b>must</b> have been created with ##VkPipelineViewportShadingRateImageStateCreateInfoNV{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT and #DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV dynamic states enabled then the {@code viewportCount} parameter in the last call to #CmdSetViewportShadingRatePaletteNV() <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set rasterizerDiscardEnable to #FALSE, then #CmdSetCoarseSampleOrderNV() must have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled on the device, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set rasterizerDiscardEnable to #FALSE, and the most recent call to #CmdSetShadingRateImageEnableNV() in the current command buffer set shadingRateImageEnable to #TRUE, then #CmdSetViewportShadingRatePaletteNV() must have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled on the device, then the {@code viewportCount} parameter in the last call to #CmdSetViewportShadingRatePaletteNV() <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled and a ##VkPipelineViewportSwizzleStateCreateInfoNV structure chained from ##VkPipelineViewportStateCreateInfo, then the bound graphics pipeline <b>must</b> have been created with ##VkPipelineViewportSwizzleStateCreateInfoNV{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled and a ##VkPipelineViewportExclusiveScissorStateCreateInfoNV structure chained from ##VkPipelineViewportStateCreateInfo, then the bound graphics pipeline <b>must</b> have been created with ##VkPipelineViewportExclusiveScissorStateCreateInfoNV{@code ::exclusiveScissorCount} greater or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV dynamic state enabled then #CmdSetExclusiveScissorEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV dynamic state enabled then #CmdSetExclusiveScissorNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-exclusiveScissor">{@code exclusiveScissor}</a> feature is enabled, then #CmdSetExclusiveScissorEnableNV() must have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetExclusiveScissorEnableNV() in the current command buffer set any element of {@code pExclusiveScissorEnables} to #TRUE, then #CmdSetExclusiveScissorNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE dynamic state enabled then #CmdSetRasterizerDiscardEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, then #CmdSetRasterizerDiscardEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_BIAS_ENABLE dynamic state enabled then #CmdSetDepthBiasEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetDepthBiasEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LOGIC_OP_EXT dynamic state enabled then #CmdSetLogicOpEXT() <b>must</b> have been called in the current command buffer prior to this drawing command and the {@code logicOp} <b>must</b> be a valid {@code VkLogicOp} value</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-logicOp">{@code logicOp}</a> feature is enabled on the device, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetLogicOpEXT() <b>must</b> have been called in the current command buffer prior to this drawing command and the {@code logicOp} <b>must</b> be a valid {@code VkLogicOp} value</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-primitiveFragmentShadingRateWithMultipleViewports">{@code primitiveFragmentShadingRateWithMultipleViewports}</a> limit is not supported, the bound graphics pipeline was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled, and any of the shader stages of the bound graphics pipeline write to the {@code PrimitiveShadingRateKHR} built-in, then #CmdSetViewportWithCount() <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> be 1</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-primitiveFragmentShadingRateWithMultipleViewports">{@code primitiveFragmentShadingRateWithMultipleViewports}</a> limit is not supported, and any shader object bound to a graphics stage writes to the {@code PrimitiveShadingRateKHR} built-in, then #CmdSetViewportWithCount() <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> be 1</li>
            <li>If rasterization is not disabled in the bound graphics pipeline, then for each color attachment in the subpass, if the corresponding image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> do not contain #FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT, then the {@code blendEnable} member of the corresponding element of the {@code pAttachments} member of {@code pColorBlendState} <b>must</b> be #FALSE</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then for each color attachment in the render pass, if the corresponding image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> do not contain #FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT, then the corresponding member of {@code pColorBlendEnables} in the most recent call to {@code vkCmdSetColorBlendEnableEXT} in the current command buffer that affected that attachment index <b>must</b> have been #FALSE</li>
            <li>If rasterization is not disabled in the bound graphics pipeline, and none of the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} extension, the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension, or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is enabled, then {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be the same as the current subpass color and/or depth/stencil attachments</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and none of the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} extension, the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension, or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is enabled, then the most recent call to #CmdSetRasterizationSamplesEXT() in the current command buffer <b>must</b> have set {@code rasterizationSamples} to be the same as the number of samples for the current render pass color and/or depth/stencil attachments</li>
            <li>If a shader object is bound to any graphics stage, the current render pass instance <b>must</b> have been begun with #CmdBeginRendering()</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the {@code imageView} member of {@code pDepthAttachment} is not #NULL_HANDLE, and the {@code layout} member of {@code pDepthAttachment} is #IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL, this command <b>must</b> not write any values to the depth attachment</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the {@code imageView} member of {@code pStencilAttachment} is not #NULL_HANDLE, and the {@code layout} member of {@code pStencilAttachment} is #IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL, this command <b>must</b> not write any values to the stencil attachment</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the {@code imageView} member of {@code pDepthAttachment} is not #NULL_HANDLE, and the {@code layout} member of {@code pDepthAttachment} is #IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL, this command <b>must</b> not write any values to the depth attachment</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the {@code imageView} member of {@code pStencilAttachment} is not #NULL_HANDLE, and the {@code layout} member of {@code pStencilAttachment} is #IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL, this command <b>must</b> not write any values to the stencil attachment</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the {@code imageView} member of {@code pDepthAttachment} is not #NULL_HANDLE, and the {@code layout} member of {@code pDepthAttachment} is #IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL, this command <b>must</b> not write any values to the depth attachment</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the {@code imageView} member of {@code pStencilAttachment} is not #NULL_HANDLE, and the {@code layout} member of {@code pStencilAttachment} is #IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL, this command <b>must</b> not write any values to the stencil attachment</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the currently bound graphics pipeline <b>must</b> have been created with a ##VkPipelineRenderingCreateInfo{@code ::viewMask} equal to ##VkRenderingInfo{@code ::viewMask}</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the currently bound graphics pipeline <b>must</b> have been created with a ##VkPipelineRenderingCreateInfo{@code ::colorAttachmentCount} equal to ##VkRenderingInfo{@code ::colorAttachmentCount}</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and the current render pass instance was begun with #CmdBeginRendering() and ##VkRenderingInfo{@code ::colorAttachmentCount} greater than 0, then each element of the ##VkRenderingInfo{@code ::pColorAttachments} array with a {@code imageView} not equal to #NULL_HANDLE <b>must</b> have been created with a {@code VkFormat} equal to the corresponding element of ##VkPipelineRenderingCreateInfo{@code ::pColorAttachmentFormats} used to create the currently bound graphics pipeline</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is enabled, and the current render pass instance was begun with #CmdBeginRendering() and ##VkRenderingInfo{@code ::colorAttachmentCount} greater than 0, then each element of the ##VkRenderingInfo{@code ::pColorAttachments} array with a {@code imageView} not equal to #NULL_HANDLE <b>must</b> have been created with a {@code VkFormat} equal to the corresponding element of ##VkPipelineRenderingCreateInfo{@code ::pColorAttachmentFormats} used to create the currently bound graphics pipeline, or the corresponding element of ##VkPipelineRenderingCreateInfo{@code ::pColorAttachmentFormats}, if it exists, <b>must</b> be #FORMAT_UNDEFINED</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and the current render pass instance was begun with #CmdBeginRendering() and ##VkRenderingInfo{@code ::colorAttachmentCount} greater than 0, then each element of the ##VkRenderingInfo{@code ::pColorAttachments} array with a {@code imageView} equal to #NULL_HANDLE <b>must</b> have the corresponding element of ##VkPipelineRenderingCreateInfo{@code ::pColorAttachmentFormats} used to create the currently bound pipeline equal to #FORMAT_UNDEFINED</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT dynamic state enabled then #CmdSetColorWriteEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-colorWriteEnable">{@code colorWriteEnable}</a> feature is enabled on the device, and a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetColorWriteEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT dynamic state enabled then the {@code attachmentCount} parameter of {@code vkCmdSetColorWriteEnableEXT} <b>must</b> be greater than or equal to the ##VkPipelineColorBlendStateCreateInfo{@code ::attachmentCount} of the currently bound graphics pipeline</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-colorWriteEnable">{@code colorWriteEnable}</a> feature is enabled on the device, and a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then the {@code attachmentCount} parameter of most recent call to {@code vkCmdSetColorWriteEnableEXT} in the current command buffer <b>must</b> be greater than or equal to the number of color attachments in the current render pass instance</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DISCARD_RECTANGLE_EXT dynamic state enabled then #CmdSetDiscardRectangleEXT() <b>must</b> have been called in the current command buffer prior to this drawing command for each discard rectangle in ##VkPipelineDiscardRectangleStateCreateInfoEXT{@code ::discardRectangleCount}</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DISCARD_RECTANGLE_ENABLE_EXT dynamic state enabled then #CmdSetDiscardRectangleEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTDiscardRectangles VK_EXT_discard_rectangles} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetDiscardRectangleEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTDiscardRectangles VK_EXT_discard_rectangles} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetDiscardRectangleEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DISCARD_RECTANGLE_MODE_EXT dynamic state enabled then #CmdSetDiscardRectangleModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTDiscardRectangles VK_EXT_discard_rectangles} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetDiscardRectangleEnableEXT() in the current command buffer set {@code discardRectangleEnable} to #TRUE, then #CmdSetDiscardRectangleModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and ##VkRenderingInfo{@code ::pDepthAttachment→imageView} was #NULL_HANDLE, the value of ##VkPipelineRenderingCreateInfo{@code ::depthAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to #FORMAT_UNDEFINED</li>
            <li>If current render pass instance was begun with #CmdBeginRendering(), the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and ##VkRenderingInfo{@code ::pDepthAttachment→imageView} was not #NULL_HANDLE, the value of ##VkPipelineRenderingCreateInfo{@code ::depthAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to the {@code VkFormat} used to create ##VkRenderingInfo{@code ::pDepthAttachment→imageView}</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is enabled, ##VkRenderingInfo{@code ::pDepthAttachment→imageView} was not #NULL_HANDLE, and the value of ##VkPipelineRenderingCreateInfo{@code ::depthAttachmentFormat} used to create the currently bound graphics pipeline was not equal to the {@code VkFormat} used to create ##VkRenderingInfo{@code ::pDepthAttachment→imageView}, the value of the format <b>must</b> be #FORMAT_UNDEFINED</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and ##VkRenderingInfo{@code ::pStencilAttachment→imageView} was #NULL_HANDLE, the value of ##VkPipelineRenderingCreateInfo{@code ::stencilAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to #FORMAT_UNDEFINED</li>
            <li>If current render pass instance was begun with #CmdBeginRendering(), the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and ##VkRenderingInfo{@code ::pStencilAttachment→imageView} was not #NULL_HANDLE, the value of ##VkPipelineRenderingCreateInfo{@code ::stencilAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to the {@code VkFormat} used to create ##VkRenderingInfo{@code ::pStencilAttachment→imageView}</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is enabled, ##VkRenderingInfo{@code ::pStencilAttachment→imageView} was not #NULL_HANDLE, and the value of ##VkPipelineRenderingCreateInfo{@code ::stencilAttachmentFormat} used to create the currently bound graphics pipeline was not equal to the {@code VkFormat} used to create ##VkRenderingInfo{@code ::pStencilAttachment→imageView}, the value of the format <b>must</b> be #FORMAT_UNDEFINED</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering() and ##VkRenderingFragmentShadingRateAttachmentInfoKHR{@code ::imageView} was not #NULL_HANDLE, the currently bound graphics pipeline <b>must</b> have been created with #PIPELINE_CREATE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering() and ##VkRenderingFragmentDensityMapAttachmentInfoEXT{@code ::imageView} was not #NULL_HANDLE, the currently bound graphics pipeline <b>must</b> have been created with #PIPELINE_CREATE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT</li>
            <li>If the currently bound pipeline was created with a ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV structure, and the current render pass instance was begun with #CmdBeginRendering() with a ##VkRenderingInfo{@code ::colorAttachmentCount} parameter greater than 0, then each element of the ##VkRenderingInfo{@code ::pColorAttachments} array with a {@code imageView} not equal to #NULL_HANDLE <b>must</b> have been created with a sample count equal to the corresponding element of the {@code pColorAttachmentSamples} member of ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV used to create the currently bound graphics pipeline</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the currently bound pipeline was created with a ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV structure, and ##VkRenderingInfo{@code ::pDepthAttachment→imageView} was not #NULL_HANDLE, the value of the {@code depthStencilAttachmentSamples} member of ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV used to create the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create ##VkRenderingInfo{@code ::pDepthAttachment→imageView}</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the currently bound pipeline was created with a ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV structure, and ##VkRenderingInfo{@code ::pStencilAttachment→imageView} was not #NULL_HANDLE, the value of the {@code depthStencilAttachmentSamples} member of ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV used to create the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create ##VkRenderingInfo{@code ::pStencilAttachment→imageView}</li>
            <li>If the currently bound pipeline was created without a ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV structure, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is not enabled, and the current render pass instance was begun with #CmdBeginRendering() with a ##VkRenderingInfo{@code ::colorAttachmentCount} parameter greater than 0, then each element of the ##VkRenderingInfo{@code ::pColorAttachments} array with a {@code imageView} not equal to #NULL_HANDLE <b>must</b> have been created with a sample count equal to the value of {@code rasterizationSamples} for the currently bound graphics pipeline</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the currently bound pipeline was created without a ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV structure, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is not enabled, and ##VkRenderingInfo{@code ::pDepthAttachment→imageView} was not #NULL_HANDLE, the value of {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create ##VkRenderingInfo{@code ::pDepthAttachment→imageView}</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the currently bound pipeline was created without a ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV structure, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is not enabled, and ##VkRenderingInfo{@code ::pStencilAttachment→imageView} was not #NULL_HANDLE, the value of {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create ##VkRenderingInfo{@code ::pStencilAttachment→imageView}</li>
            <li>If this command has been called inside a render pass instance started with #CmdBeginRendering(), and the {@code pNext} chain of ##VkRenderingInfo includes a ##VkMultisampledRenderToSingleSampledInfoEXT structure with {@code multisampledRenderToSingleSampledEnable} equal to #TRUE, then the value of {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be equal to ##VkMultisampledRenderToSingleSampledInfoEXT{@code ::rasterizationSamples}</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the currently bound pipeline <b>must</b> have been created with a ##VkGraphicsPipelineCreateInfo{@code ::renderPass} equal to #NULL_HANDLE</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), there is a graphics pipeline bound with a fragment shader that statically writes to a color attachment, the color write mask is not zero, color writes are enabled, and the corresponding element of the ##VkRenderingInfo{@code ::pColorAttachments→imageView} was not #NULL_HANDLE, then the corresponding element of ##VkPipelineRenderingCreateInfo{@code ::pColorAttachmentFormats} used to create the pipeline <b>must</b> not be #FORMAT_UNDEFINED</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), there is a graphics pipeline bound, depth test is enabled, depth write is enabled, and the ##VkRenderingInfo{@code ::pDepthAttachment→imageView} was not #NULL_HANDLE, then the ##VkPipelineRenderingCreateInfo{@code ::depthAttachmentFormat} used to create the pipeline <b>must</b> not be #FORMAT_UNDEFINED</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), there is a graphics pipeline bound, stencil test is enabled and the ##VkRenderingInfo{@code ::pStencilAttachment→imageView} was not #NULL_HANDLE, then the ##VkPipelineRenderingCreateInfo{@code ::stencilAttachmentFormat} used to create the pipeline <b>must</b> not be #FORMAT_UNDEFINED</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-primitivesGeneratedQueryWithRasterizerDiscard">{@code primitivesGeneratedQueryWithRasterizerDiscard}</a> feature is not enabled and the #QUERY_TYPE_PRIMITIVES_GENERATED_EXT query is active, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#primsrast-discard">rasterization discard</a> <b>must</b> not be enabled</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-primitivesGeneratedQueryWithNonZeroStreams">{@code primitivesGeneratedQueryWithNonZeroStreams}</a> feature is not enabled and the #QUERY_TYPE_PRIMITIVES_GENERATED_EXT query is active, the bound graphics pipeline <b>must</b> not have been created with a non-zero value in ##VkPipelineRasterizationStateStreamCreateInfoEXT{@code ::rasterizationStream}</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_TESSELLATION_DOMAIN_ORIGIN_EXT dynamic state enabled then #CmdSetTessellationDomainOriginEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_CLAMP_ENABLE_EXT dynamic state enabled then #CmdSetDepthClampEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to the #SHADER_STAGE_TESSELLATION_EVALUATION_BIT stage, then #CmdSetTessellationDomainOriginEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-depthClamp">{@code depthClamp}</a> feature is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetDepthClampEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_POLYGON_MODE_EXT dynamic state enabled then #CmdSetPolygonModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetPolygonModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT dynamic state enabled then #CmdSetRasterizationSamplesEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetRasterizationSamplesEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_MASK_EXT dynamic state enabled then #CmdSetSampleMaskEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetSampleMaskEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT dynamic state enabled then #CmdSetAlphaToCoverageEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT dynamic state enabled, and {@code alphaToCoverageEnable} was #TRUE in the last call to #CmdSetAlphaToCoverageEnableEXT(), then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#interfaces-fragmentoutput">Fragment Output Interface</a> <b>must</b> contain a variable for the alpha {@code Component} word in {@code Location} 0 at {@code Index} 0</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetAlphaToCoverageEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetAlphaToCoverageEnableEXT() in the current command buffer set {@code alphaToCoverageEnable} to #TRUE, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#interfaces-fragmentoutput">Fragment Output Interface</a> <b>must</b> contain a variable for the alpha {@code Component} word in {@code Location} 0 at {@code Index} 0</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_ALPHA_TO_ONE_ENABLE_EXT dynamic state enabled then #CmdSetAlphaToOneEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-alphaToOne">{@code alphaToOne}</a> feature is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetAlphaToOneEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LOGIC_OP_ENABLE_EXT dynamic state enabled then #CmdSetLogicOpEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-logicOp">{@code logicOp}</a> feature is enabled, and a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetLogicOpEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT dynamic state enabled then #CmdSetColorBlendEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetColorBlendEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT dynamic state enabled then #CmdSetColorBlendEquationEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetColorBlendEnableEXT() for any attachment set that attachment’s value in {@code pColorBlendEnables} to #TRUE, then #CmdSetColorBlendEquationEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_WRITE_MASK_EXT dynamic state enabled then #CmdSetColorWriteMaskEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetColorWriteMaskEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_RASTERIZATION_STREAM_EXT dynamic state enabled then #CmdSetRasterizationStreamEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-geometryStreams">{@code geometryStreams}</a> feature is enabled, and a shader object is bound to the #SHADER_STAGE_GEOMETRY_BIT stage, then #CmdSetRasterizationStreamEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT dynamic state enabled then #CmdSetConservativeRasterizationModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTConservativeRasterization VK_EXT_conservative_rasterization} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetConservativeRasterizationModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT dynamic state enabled then #CmdSetExtraPrimitiveOverestimationSizeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTConservativeRasterization VK_EXT_conservative_rasterization} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetConservativeRasterizationModeEXT() in the current command buffer set {@code conservativeRasterizationMode} to #CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT, then #CmdSetExtraPrimitiveOverestimationSizeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT dynamic state enabled then #CmdSetDepthClipEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-depthClipEnable">{@code depthClipEnable}</a> feature is enabled, and a shader object is bound to any graphics stage, then #CmdSetDepthClipEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT dynamic state enabled then #CmdSetSampleLocationsEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTSampleLocations VK_EXT_sample_locations} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetSampleLocationsEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT dynamic state enabled then #CmdSetColorBlendAdvancedEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_PROVOKING_VERTEX_MODE_EXT dynamic state enabled then #CmdSetProvokingVertexModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTProvokingVertex VK_EXT_provoking_vertex} extension is enabled, and a shader object is bound to the #SHADER_STAGE_VERTEX_BIT stage, then #CmdSetProvokingVertexModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT dynamic state enabled then #CmdSetLineRasterizationModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetPolygonModeEXT() in the current command buffer set {@code polygonMode} to #POLYGON_MODE_LINE, then #CmdSetLineRasterizationModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object is bound to the vertex stage, and the most recent call to #CmdSetPrimitiveTopology() in the current command buffer set {@code primitiveTopology} to any line topology, then #CmdSetLineRasterizationModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object that outputs line primitives is bound to the tessellation evaluation or geometry stage, then #CmdSetLineRasterizationModeEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT dynamic state enabled then #CmdSetLineStippleEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetPolygonModeEXT() in the current command buffer set {@code polygonMode} to #POLYGON_MODE_LINE, then #CmdSetLineStippleEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object is bound to the vertex stage, and the most recent call to #CmdSetPrimitiveTopology() in the current command buffer set {@code primitiveTopology} to any line topology, then #CmdSetLineStippleEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object that outputs line primitives is bound to the tessellation evaluation or geometry stage, then #CmdSetLineStippleEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_STIPPLE_EXT dynamic state enabled then #CmdSetLineStippleEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTLineRasterization VK_EXT_line_rasterization} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetLineStippleEnableEXT() in the current command buffer set {@code stippledLineEnable} to #TRUE, then #CmdSetLineStippleEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT dynamic state enabled then #CmdSetDepthClipNegativeOneToOneEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-depthClipControl">{@code depthClipControl}</a> feature is enabled, and a shader object is bound to any graphics stage, then #CmdSetDepthClipNegativeOneToOneEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_W_SCALING_ENABLE_NV dynamic state enabled then #CmdSetViewportWScalingEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVClipSpaceWScaling VK_NV_clip_space_w_scaling} extension is enabled, and a shader object is bound to any graphics stage, then #CmdSetViewportWScalingEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV dynamic state enabled then #CmdSetViewportSwizzleNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVViewportSwizzle VK_NV_viewport_swizzle} extension is enabled, and a shader object is bound to any graphics stage, then #CmdSetViewportSwizzleNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV dynamic state enabled then #CmdSetCoverageToColorEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVFragmentCoverageToColor VK_NV_fragment_coverage_to_color} extension is enabled, and a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetCoverageToColorEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_TO_COLOR_LOCATION_NV dynamic state enabled then #CmdSetCoverageToColorLocationNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVFragmentCoverageToColor VK_NV_fragment_coverage_to_color} extension is enabled, and a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetCoverageToColorEnableNV() in the current command buffer set {@code coverageToColorEnable} to #TRUE, then #CmdSetCoverageToColorLocationNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_MODULATION_MODE_NV dynamic state enabled then #CmdSetCoverageModulationModeNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetCoverageModulationModeNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV dynamic state enabled then #CmdSetCoverageModulationTableEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetCoverageModulationModeNV() in the current command buffer set coverageModulationMode to any value other than #COVERAGE_MODULATION_MODE_NONE_NV, then #CmdSetCoverageModulationTableEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_NV dynamic state enabled then #CmdSetCoverageModulationTableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetCoverageModulationTableEnableNV() in the current command buffer set {@code coverageModulationTableEnable} to #TRUE, then #CmdSetCoverageModulationTableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SHADING_RATE_IMAGE_ENABLE_NV dynamic state enabled then #CmdSetShadingRateImageEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-pipelineFragmentShadingRate">{@code pipelineFragmentShadingRate}</a> feature is enabled, and a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set rasterizerDiscardEnable to #FALSE, then #CmdSetFragmentShadingRateKHR() must have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetShadingRateImageEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV dynamic state enabled then #CmdSetRepresentativeFragmentTestEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-representativeFragmentTest">{@code representativeFragmentTest}</a> feature is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetRepresentativeFragmentTestEnableNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_REDUCTION_MODE_NV dynamic state enabled then #CmdSetCoverageReductionModeNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-coverageReductionMode">{@code coverageReductionMode}</a> feature is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetCoverageReductionModeNV() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT state enabled and the last call to #CmdSetColorBlendEnableEXT() set {@code pColorBlendEnables} for any attachment to #TRUE, then for those attachments in the subpass the corresponding image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, and the current subpass does not use any color and/or depth/stencil attachments, then the {@code rasterizationSamples} in the last call to #CmdSetRasterizationSamplesEXT() <b>must</b> follow the rules for a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#renderpass-noattachments">zero-attachment subpass</a></li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_MASK_EXT state enabled and the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state disabled, then the {@code samples} parameter in the last call to #CmdSetSampleMaskEXT() <b>must</b> be greater or equal to the ##VkPipelineMultisampleStateCreateInfo{@code ::rasterizationSamples} parameter used to create the bound graphics pipeline</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_MASK_EXT state and #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT states enabled, then the {@code samples} parameter in the last call to #CmdSetSampleMaskEXT() <b>must</b> be greater or equal to the {@code rasterizationSamples} parameter in the last call to #CmdSetRasterizationSamplesEXT()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, and neither the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} nor the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extensions are enabled, then the {@code rasterizationSamples} in the last call to #CmdSetRasterizationSamplesEXT() <b>must</b> be the same as the current subpass color and/or depth/stencil attachments</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, or a shader object is bound to any graphics stage, and the current render pass instance includes a ##VkMultisampledRenderToSingleSampledInfoEXT structure with {@code multisampledRenderToSingleSampledEnable} equal to #TRUE, then the {@code rasterizationSamples} in the last call to #CmdSetRasterizationSamplesEXT() <b>must</b> be the same as the {@code rasterizationSamples} member of that structure</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT dynamic state enabled then #CmdSetColorBlendEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorBlendEnableEXT} calls <b>must</b> specify an enable for all active color attachments in the current subpass</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT dynamic state enabled then #CmdSetColorBlendEquationEXT() <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorBlendEquationEXT} calls <b>must</b> specify the blend equations for all active color attachments in the current subpass where blending is enabled</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_WRITE_MASK_EXT dynamic state enabled then #CmdSetColorWriteMaskEXT() <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorWriteMaskEXT} calls <b>must</b> specify the color write mask for all active color attachments in the current subpass</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT dynamic state enabled then #CmdSetColorBlendAdvancedEXT() <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorBlendAdvancedEXT} calls <b>must</b> specify the advanced blend equations for all active color attachments in the current subpass where blending is enabled</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT and #DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT dynamic states enabled and the last calls to #CmdSetColorBlendEnableEXT() and #CmdSetColorBlendAdvancedEXT() have enabled advanced blending, then the number of active color attachments in the current subpass <b>must</b> not exceed <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-advancedBlendMaxColorAttachments">{@code advancedBlendMaxColorAttachments}</a></li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-primitivesGeneratedQueryWithNonZeroStreams">{@code primitivesGeneratedQueryWithNonZeroStreams}</a> feature is not enabled and the #QUERY_TYPE_PRIMITIVES_GENERATED_EXT query is active, and the bound graphics pipeline was created with #DYNAMIC_STATE_RASTERIZATION_STREAM_EXT state enabled, the last call to #CmdSetRasterizationStreamEXT() <b>must</b> have set the {@code rasterizationStream} to zero</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state enabled and the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state disabled, then the {@code sampleLocationsPerPixel} member of {@code pSampleLocationsInfo} in the last call to #CmdSetSampleLocationsEXT() <b>must</b> equal the {@code rasterizationSamples} member of the ##VkPipelineMultisampleStateCreateInfo structure the bound graphics pipeline has been created with</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state enabled and the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, then the {@code sampleLocationsPerPixel} member of {@code pSampleLocationsInfo} in the last call to #CmdSetSampleLocationsEXT() <b>must</b> equal the {@code rasterizationSamples} parameter of the last call to #CmdSetRasterizationSamplesEXT()</li>
            <li>If the bound graphics pipeline was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT state enabled, and {@code sampleLocationsEnable} was #TRUE in the last call to #CmdSetSampleLocationsEnableEXT(), and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the #IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT bit set</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state enabled and the #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT state enabled, and if {@code sampleLocationsEnable} was #TRUE in the last call to #CmdSetSampleLocationsEnableEXT(), then the {@code sampleLocationsInfo.sampleLocationGridSize.width} in the last call to #CmdSetSampleLocationsEXT() <b>must</b> evenly divide ##VkMultisamplePropertiesEXT{@code ::sampleLocationGridSize.width} as returned by #GetPhysicalDeviceMultisamplePropertiesEXT() with a {@code samples} parameter equaling {@code rasterizationSamples}</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state enabled and the #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT state enabled, and if {@code sampleLocationsEnable} was #TRUE in the last call to #CmdSetSampleLocationsEnableEXT(), then the {@code sampleLocationsInfo.sampleLocationGridSize.height} in the last call to #CmdSetSampleLocationsEXT() <b>must</b> evenly divide ##VkMultisamplePropertiesEXT{@code ::sampleLocationGridSize.height} as returned by #GetPhysicalDeviceMultisamplePropertiesEXT() with a {@code samples} parameter equaling {@code rasterizationSamples}</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT state enabled, and if {@code sampleLocationsEnable} was #TRUE in the last call to #CmdSetSampleLocationsEnableEXT(), the fragment shader code <b>must</b> not statically use the extended instruction {@code InterpolateAtSample}</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state disabled and the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, the {@code sampleLocationsEnable} member of a ##VkPipelineSampleLocationsStateCreateInfoEXT{@code ::sampleLocationsEnable} in the bound graphics pipeline is #TRUE or #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT state enabled, then, {@code sampleLocationsInfo.sampleLocationGridSize.width} <b>must</b> evenly divide ##VkMultisamplePropertiesEXT{@code ::sampleLocationGridSize.width} as returned by #GetPhysicalDeviceMultisamplePropertiesEXT() with a {@code samples} parameter equaling the value of {@code rasterizationSamples} in the last call to #CmdSetRasterizationSamplesEXT()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state disabled and the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, the {@code sampleLocationsEnable} member of a ##VkPipelineSampleLocationsStateCreateInfoEXT{@code ::sampleLocationsEnable} in the bound graphics pipeline is #TRUE or #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT state enabled, then, {@code sampleLocationsInfo.sampleLocationGridSize.height} <b>must</b> evenly divide ##VkMultisamplePropertiesEXT{@code ::sampleLocationGridSize.height} as returned by #GetPhysicalDeviceMultisamplePropertiesEXT() with a {@code samples} parameter equaling the value of {@code rasterizationSamples} in the last call to #CmdSetRasterizationSamplesEXT()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state disabled and the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, the {@code sampleLocationsEnable} member of a ##VkPipelineSampleLocationsStateCreateInfoEXT{@code ::sampleLocationsEnable} in the bound graphics pipeline is #TRUE or #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT state enabled, then, {@code sampleLocationsInfo.sampleLocationsPerPixel} <b>must</b> equal {@code rasterizationSamples} in the last call to #CmdSetRasterizationSamplesEXT()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV state enabled and the last call to #CmdSetCoverageModulationTableEnableNV() set {@code coverageModulationTableEnable} to #TRUE, then the {@code coverageModulationTableCount} parameter in the last call to #CmdSetCoverageModulationTableNV() <b>must</b> equal the current {@code rasterizationSamples} divided by the number of color samples in the current subpass</li>
            <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and if current subpass has a depth/stencil attachment and depth test, stencil test, or depth bounds test are enabled in the currently bound pipeline state, then the current {@code rasterizationSamples} <b>must</b> be the same as the sample count of the depth/stencil attachment</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV state enabled and the last call to #CmdSetCoverageToColorEnableNV() set the {@code coverageToColorEnable} to #TRUE, then the current subpass <b>must</b> have a color attachment at the location selected by the last call to #CmdSetCoverageToColorLocationNV() {@code coverageToColorLocation}, with a {@code VkFormat} of #FORMAT_R8_UINT, #FORMAT_R8_SINT, #FORMAT_R16_UINT, #FORMAT_R16_SINT, #FORMAT_R32_UINT, or #FORMAT_R32_SINT</li>
            <li>If this {@link NVCoverageReductionMode VK_NV_coverage_reduction_mode} extension is enabled, the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV and #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT states enabled, the current coverage reduction mode {@code coverageReductionMode}, then the current {@code rasterizationSamples}, and the sample counts for the color and depth/stencil attachments (if the subpass has them) <b>must</b> be a valid combination returned by #GetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled, but not the #DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV dynamic state enabled, then the bound graphics pipeline <b>must</b> have been created with ##VkPipelineViewportSwizzleStateCreateInfoNV{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT and #DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV dynamic states enabled then the {@code viewportCount} parameter in the last call to #CmdSetViewportSwizzleNV() <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and if the current subpass has any color attachments and {@code rasterizationSamples} of the last call to #CmdSetRasterizationSamplesEXT() is greater than the number of color samples, then the pipeline {@code sampleShadingEnable} <b>must</b> be #FALSE</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT or #DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT dynamic states enabled, and if the current {@code stippledLineEnable} state is #TRUE and the current {@code lineRasterizationMode} state is #LINE_RASTERIZATION_MODE_RECTANGULAR_EXT, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledRectangularLines">{@code stippledRectangularLines}</a> feature <b>must</b> be enabled</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT or #DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT dynamic states enabled, and if the current {@code stippledLineEnable} state is #TRUE and the current {@code lineRasterizationMode} state is #LINE_RASTERIZATION_MODE_BRESENHAM_EXT, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledBresenhamLines">{@code stippledBresenhamLines}</a> feature <b>must</b> be enabled</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT or #DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT dynamic states enabled, and if the current {@code stippledLineEnable} state is #TRUE and the current {@code lineRasterizationMode} state is #LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledSmoothLines">{@code stippledSmoothLines}</a> feature <b>must</b> be enabled</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT or #DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT dynamic states enabled, and if the current {@code stippledLineEnable} state is #TRUE and the current {@code lineRasterizationMode} state is #LINE_RASTERIZATION_MODE_DEFAULT_EXT, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledRectangularLines">{@code stippledRectangularLines}</a> feature <b>must</b> be enabled and ##VkPhysicalDeviceLimits{@code ::strictLines} <b>must</b> be #TRUE</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT dynamic state enabled, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-conservativePointAndLineRasterization">{@code conservativePointAndLineRasterization}</a> is not supported, and the effective primitive topology output by the last pre-rasterization shader stage is a line or point, then the {@code conservativeRasterizationMode} set by the last call to #CmdSetConservativeRasterizationModeEXT() <b>must</b> be #CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT</li>
            <li>If the currently bound pipeline was created with the ##VkPipelineShaderStageCreateInfo{@code ::stage} member of an element of ##VkGraphicsPipelineCreateInfo{@code ::pStages} set to #SHADER_STAGE_VERTEX_BIT, #SHADER_STAGE_TESSELLATION_CONTROL_BIT, #SHADER_STAGE_TESSELLATION_EVALUATION_BIT or #SHADER_STAGE_GEOMETRY_BIT, then <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#queries-mesh-shader">Mesh Shader Queries</a> <b>must</b> not be active</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT dynamic state #CmdSetAttachmentFeedbackLoopEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If dynamic state was inherited from ##VkCommandBufferInheritanceViewportScissorInfoNV, it <b>must</b> be set in the current command buffer prior to this drawing command</li>
            <li>If there is no bound graphics pipeline, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of #SHADER_STAGE_VERTEX_BIT</li>
            <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-tessellationShader">{@code tessellationShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of #SHADER_STAGE_TESSELLATION_CONTROL_BIT</li>
            <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-tessellationShader">{@code tessellationShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of #SHADER_STAGE_TESSELLATION_EVALUATION_BIT</li>
            <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-geometryShader">{@code geometryShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of #SHADER_STAGE_GEOMETRY_BIT</li>
            <li>If there is no bound graphics pipeline, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of #SHADER_STAGE_FRAGMENT_BIT</li>
            <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-taskShader">{@code taskShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of #SHADER_STAGE_TASK_BIT_EXT</li>
            <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-meshShader">{@code meshShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of #SHADER_STAGE_MESH_BIT_EXT</li>
            <li>If there is no bound graphics pipeline, and at least one of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-taskShader">{@code taskShader}</a> and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-meshShader">{@code meshShader}</a> features is enabled, one of the #SHADER_STAGE_VERTEX_BIT or #SHADER_STAGE_MESH_BIT_EXT stages <b>must</b> have a valid {@code VkShaderEXT} bound, and the other <b>must</b> have no {@code VkShaderEXT} bound</li>
            <li>If there is no bound graphics pipeline, and both the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-taskShader">{@code taskShader}</a> and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-meshShader">{@code meshShader}</a> features are enabled, and a valid {@code VkShaderEXT} is bound the to the #SHADER_STAGE_MESH_BIT_EXT stage, and that {@code VkShaderEXT} was created without the #SHADER_CREATE_NO_TASK_SHADER_BIT_EXT flag, a valid {@code VkShaderEXT} <b>must</b> be bound to the #SHADER_STAGE_TASK_BIT_EXT stage</li>
            <li>If there is no bound graphics pipeline, and both the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-taskShader">{@code taskShader}</a> and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-meshShader">{@code meshShader}</a> features are enabled, and a valid {@code VkShaderEXT} is bound the to the #SHADER_STAGE_MESH_BIT_EXT stage, and that {@code VkShaderEXT} was created with the #SHADER_CREATE_NO_TASK_SHADER_BIT_EXT flag, there <b>must</b> be no {@code VkShaderEXT} bound to the #SHADER_STAGE_TASK_BIT_EXT stage</li>
            <li>If there is no bound graphics pipeline, and a valid {@code VkShaderEXT} is bound to the #SHADER_STAGE_VERTEX_BIT stage, there <b>must</b> be no {@code VkShaderEXT} bound to either the #SHADER_STAGE_TASK_BIT_EXT stage or the #SHADER_STAGE_MESH_BIT_EXT stage</li>
            <li>If any graphics shader is bound which was created with the #SHADER_CREATE_LINK_STAGE_BIT_EXT flag, then all shaders created with the #SHADER_CREATE_LINK_STAGE_BIT_EXT flag in the same #CreateShadersEXT() call <b>must</b> also be bound</li>
            <li>If any graphics shader is bound which was created with the #SHADER_CREATE_LINK_STAGE_BIT_EXT flag, any stages in between stages whose shaders which did not create a shader with the #SHADER_CREATE_LINK_STAGE_BIT_EXT flag as part of the same #CreateShadersEXT() call <b>must</b> not have any {@code VkShaderEXT} bound</li>
            <li>All bound graphics shader objects <b>must</b> have been created with identical or identically defined push constant ranges</li>
            <li>All bound graphics shader objects <b>must</b> have been created with identical or identically defined arrays of descriptor set layouts</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-attachmentFeedbackLoopDynamicState">attachmentFeedbackLoopDynamicState</a> feature is enabled on the device, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE #CmdSetAttachmentFeedbackLoopEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state includes a fragment shader stage, was created with #DYNAMIC_STATE_DEPTH_WRITE_ENABLE set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}, and the fragment shader declares the {@code EarlyFragmentTests} execution mode and uses {@code OpDepthAttachmentReadEXT}, the {@code depthWriteEnable} parameter in the last call to #CmdSetDepthWriteEnable() <b>must</b> be #FALSE</li>
            <li>If the bound graphics pipeline state includes a fragment shader stage, was created with #DYNAMIC_STATE_STENCIL_WRITE_MASK set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}, and the fragment shader declares the {@code EarlyFragmentTests} execution mode and uses {@code OpStencilAttachmentReadEXT}, the {@code writeMask} parameter in the last call to #CmdSetStencilWriteMask() <b>must</b> be 0</li>
            <li>If a shader object is bound to any graphics stage or the currently bound graphics pipeline was created with #DYNAMIC_STATE_COLOR_WRITE_MASK_EXT, and the format of any color attachment is #FORMAT_E5B9G9R9_UFLOAT_PACK32, the corresponding element of the {@code pColorWriteMasks} parameter of #CmdSetColorWriteMaskEXT() <b>must</b> either include all of #COLOR_COMPONENT_R_BIT, #COLOR_COMPONENT_G_BIT, and #COLOR_COMPONENT_B_BIT, or none of them</li>
            <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#framebuffer-blending">blending</a> is enabled for any attachment where either the source or destination blend factors for that attachment <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#framebuffer-dsb">use the secondary color input</a>, the maximum value of {@code Location} for any output attachment <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-staticuse">statically used</a> in the {@code Fragment} {@code Execution} {@code Model} executed by this command <b>must</b> be less than <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-maxFragmentDualSrcAttachments">{@code maxFragmentDualSrcAttachments}</a></li>
        </ul>

        <ul>
            <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point’s interface <b>must</b> have either valid or #NULL_HANDLE buffers bound</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-nullDescriptor">{@code nullDescriptor}</a> feature is not enabled, all vertex input bindings accessed via vertex input variables declared in the vertex shader entry point’s interface <b>must</b> not be #NULL_HANDLE</li>
            <li>For a given vertex buffer binding, any attribute data fetched <b>must</b> be entirely contained within the corresponding vertex buffer binding, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fxvertex-input">Vertex Input Description</a></li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_PRIMITIVE_TOPOLOGY dynamic state enabled then #CmdSetPrimitiveTopology() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_PRIMITIVE_TOPOLOGY dynamic state enabled and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-dynamicPrimitiveTopologyUnrestricted">{@code dynamicPrimitiveTopologyUnrestricted}</a> is #FALSE, then the {@code primitiveTopology} parameter of {@code vkCmdSetPrimitiveTopology} <b>must</b> be of the same <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#drawing-primitive-topology-class">topology class</a> as the pipeline ##VkPipelineInputAssemblyStateCreateInfo{@code ::topology} state</li>
            <li>If the bound graphics pipeline was created with both the #DYNAMIC_STATE_VERTEX_INPUT_EXT and #DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT dynamic states enabled, then #CmdSetVertexInputEXT() <b>must</b> have been called in the current command buffer prior to this draw command</li>
            <li>If the bound graphics pipeline was created with the #DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT dynamic state enabled, but not the #DYNAMIC_STATE_VERTEX_INPUT_EXT dynamic state enabled, then #CmdBindVertexBuffers2EXT() <b>must</b> have been called in the current command buffer prior to this draw command, and the {@code pStrides} parameter of #CmdBindVertexBuffers2EXT() <b>must</b> not be {@code NULL}</li>
            <li>If a shader object is bound to the #SHADER_STAGE_VERTEX_BIT stage, then #CmdSetPrimitiveTopology() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VERTEX_INPUT_EXT dynamic state enabled, then #CmdSetVertexInputEXT() <b>must</b> have been called in the current command buffer prior to this draw command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VERTEX_INPUT_EXT dynamic state enabled, then all variables with the {@code Input} storage class decorated with {@code Location} in the {@code Vertex} {@code Execution} {@code Model} {@code OpEntryPoint} <b>must</b> contain a location in ##VkVertexInputAttributeDescription2EXT{@code ::location}</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VERTEX_INPUT_EXT dynamic state enabled, then the numeric type associated with all {@code Input} variables of the corresponding {@code Location} in the {@code Vertex} {@code Execution} {@code Model} {@code OpEntryPoint} <b>must</b> be the same as ##VkVertexInputAttributeDescription2EXT{@code ::format}</li>
            <li>If there is a shader object bound to a graphics stage or the currently bound graphics pipeline was created with the #DYNAMIC_STATE_VERTEX_INPUT_EXT dynamic state enabled, and ##VkVertexInputAttributeDescription2EXT{@code ::format} has a 64-bit component, then the scalar width associated with all {@code Input} variables of the corresponding {@code Location} in the {@code Vertex} {@code Execution} {@code Model} {@code OpEntryPoint} <b>must</b> be 64-bit</li>
            <li>If there is a shader object bound to a graphics stage or the currently bound graphics pipeline was created with the #DYNAMIC_STATE_VERTEX_INPUT_EXT dynamic state enabled, and the scalar width associated with a {@code Location} decorated {@code Input} variable in the {@code Vertex} {@code Execution} {@code Model} {@code OpEntryPoint} is 64-bit, then the corresponding ##VkVertexInputAttributeDescription2EXT{@code ::format} <b>must</b> have a 64-bit component</li>
            <li>If there is a shader object bound to a graphics stage or the currently bound graphics pipeline was created with the #DYNAMIC_STATE_VERTEX_INPUT_EXT dynamic state enabled, and ##VkVertexInputAttributeDescription2EXT{@code ::format} has a 64-bit component, then all {@code Input} variables at the corresponding {@code Location} in the {@code Vertex} {@code Execution} {@code Model} {@code OpEntryPoint} <b>must</b> not use components that are not present in the format</li>
            <li>If a shader object is bound to the #SHADER_STAGE_VERTEX_BIT stage, then #CmdSetVertexInputEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT dynamic state enabled then #CmdSetPatchControlPointsEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to the #SHADER_STAGE_TESSELLATION_EVALUATION_BIT stage, then #CmdSetPatchControlPointsEXT() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE dynamic state enabled then #CmdSetPrimitiveRestartEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, #CmdSetPrimitiveRestartEnable() <b>must</b> have been called in the current command buffer prior to this drawing command</li>
            <li>The bound graphics pipeline <b>must</b> not have been created with the ##VkPipelineShaderStageCreateInfo{@code ::stage} member of an element of ##VkGraphicsPipelineCreateInfo{@code ::pStages} set to #SHADER_STAGE_TASK_BIT_EXT or #SHADER_STAGE_MESH_BIT_EXT</li>
            <li>There <b>must</b> be no shader object bound to either of the #SHADER_STAGE_TASK_BIT_EXT or #SHADER_STAGE_MESH_BIT_EXT stages</li>
        </ul>

        <ul>
            <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code buffer} <b>must</b> have been created with the #BUFFER_USAGE_INDIRECT_BUFFER_BIT bit set</li>
            <li>{@code offset} <b>must</b> be a multiple of 4</li>
            <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
        </ul>

        <ul>
            <li>If {@code countBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code countBuffer} <b>must</b> have been created with the #BUFFER_USAGE_INDIRECT_BUFFER_BIT bit set</li>
            <li>{@code countBufferOffset} <b>must</b> be a multiple of 4</li>
            <li>The count stored in {@code countBuffer} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxDrawIndirectCount}</li>
            <li><code>(countBufferOffset + sizeof(uint32_t))</code> <b>must</b> be less than or equal to the size of {@code countBuffer}</li>
            <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-drawIndirectCount">{@code drawIndirectCount}</a> is not enabled this function <b>must</b> not be used</li>
        </ul>

        <ul>
            <li>An index buffer <b>must</b> be bound</li>
            <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustBufferAccess2">{@code robustBufferAccess2}</a> is not enabled, <code>(indexSize × (firstIndex + indexCount) + offset)</code> <b>must</b> be less than or equal to the size of the bound index buffer, with {@code indexSize} being based on the type specified by {@code indexType}, where the index buffer, {@code indexType}, and {@code offset} are specified via {@code vkCmdBindIndexBuffer}</li>
            <li>{@code stride} <b>must</b> be a multiple of 4 and <b>must</b> be greater than or equal to sizeof(##VkDrawIndexedIndirectCommand)</li>
            <li>If {@code maxDrawCount} is greater than or equal to 1, <code>(stride × (maxDrawCount - 1) + offset + sizeof(##VkDrawIndexedIndirectCommand))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
            <li>If count stored in {@code countBuffer} is equal to 1, <code>(offset + sizeof(##VkDrawIndexedIndirectCommand))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
            <li>If count stored in {@code countBuffer} is greater than 1, <code>(stride × (drawCount - 1) + offset + sizeof(##VkDrawIndexedIndirectCommand))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code countBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>Each of {@code buffer}, {@code commandBuffer}, and {@code countBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Outside</td><td>Graphics</td><td>Action</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        VkBuffer("buffer", "the buffer containing draw parameters."),
        VkDeviceSize("offset", "the byte offset into {@code buffer} where parameters begin."),
        VkBuffer("countBuffer", "the buffer containing the draw count."),
        VkDeviceSize("countBufferOffset", "the byte offset into {@code countBuffer} where the draw count begins."),
        uint32_t("maxDrawCount", "specifies the maximum number of draws that will be executed. The actual number of executed draw calls is the minimum of the count specified in {@code countBuffer} and {@code maxDrawCount}."),
        uint32_t("stride", "the byte stride between successive sets of draw parameters.")
    )

    // Promoted from VK_KHR_create_renderpass2 (extension 110)

    VkResult(
        "CreateRenderPass2",
        """
        Create a new render pass object.

        <h5>C Specification</h5>
        To create a render pass, call:

        <pre><code>
￿VkResult vkCreateRenderPass2(
￿    VkDevice                                    device,
￿    const VkRenderPassCreateInfo2*              pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkRenderPass*                               pRenderPass);</code></pre>

        or the equivalent command

        <pre><code>
￿VkResult vkCreateRenderPass2KHR(
￿    VkDevice                                    device,
￿    const VkRenderPassCreateInfo2*              pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkRenderPass*                               pRenderPass);</code></pre>

        <h5>Description</h5>
        This command is functionally identical to #CreateRenderPass(), but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkRenderPassCreateInfo2 structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pRenderPass} <b>must</b> be a valid pointer to a {@code VkRenderPass} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkRenderPassCreateInfo2
        """,

        VkDevice("device", "the logical device that creates the render pass."),
        VkRenderPassCreateInfo2.const.p("pCreateInfo", "a pointer to a ##VkRenderPassCreateInfo2 structure describing the parameters of the render pass."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkRenderPass.p("pRenderPass", "a pointer to a {@code VkRenderPass} handle in which the resulting render pass object is returned.")
    )

    void(
        "CmdBeginRenderPass2",
        """
        Begin a new render pass.

        <h5>C Specification</h5>
        Alternatively to begin a render pass, call:

        <pre><code>
￿void vkCmdBeginRenderPass2(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkRenderPassBeginInfo*                pRenderPassBegin,
￿    const VkSubpassBeginInfo*                   pSubpassBeginInfo);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdBeginRenderPass2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkRenderPassBeginInfo*                pRenderPassBegin,
￿    const VkSubpassBeginInfo*                   pSubpassBeginInfo);</code></pre>

        <h5>Description</h5>
        After beginning a render pass instance, the command buffer is ready to record the commands for the first subpass of that render pass.

        <h5>Valid Usage</h5>
        <ul>
            <li>Both the {@code framebuffer} and {@code renderPass} members of {@code pRenderPassBegin} <b>must</b> have been created on the same {@code VkDevice} that {@code commandBuffer} was allocated on</li>
            <li>If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the ##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is #IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including #IMAGE_USAGE_COLOR_ATTACHMENT_BIT</li>
            <li>If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the ##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is #IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL, #IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL, #IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL, or #IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT</li>
            <li>If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the ##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is #IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL, or #IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL, #IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL, or #IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT</li>
            <li>If any of the {@code stencilInitialLayout} or {@code stencilFinalLayout} member of the ##VkAttachmentDescriptionStencilLayout structures or the {@code stencilLayout} member of the ##VkAttachmentReferenceStencilLayout structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is #IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL, or #IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT</li>
            <li>If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the ##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is #IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including #IMAGE_USAGE_SAMPLED_BIT or #IMAGE_USAGE_INPUT_ATTACHMENT_BIT</li>
            <li>If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the ##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is #IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including #IMAGE_USAGE_TRANSFER_SRC_BIT</li>
            <li>If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the ##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is #IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including #IMAGE_USAGE_TRANSFER_DST_BIT</li>
            <li>If the {@code initialLayout} member of any of the ##VkAttachmentDescription structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is not #IMAGE_LAYOUT_UNDEFINED, then each such {@code initialLayout} <b>must</b> be equal to the current layout of the corresponding attachment image subresource of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin}</li>
            <li>The {@code srcStageMask} members of any element of the {@code pDependencies} member of ##VkRenderPassCreateInfo used to create {@code renderPass} <b>must</b> be supported by the capabilities of the queue family identified by the {@code queueFamilyIndex} member of the ##VkCommandPoolCreateInfo used to create the command pool which {@code commandBuffer} was allocated from</li>
            <li>The {@code dstStageMask} members of any element of the {@code pDependencies} member of ##VkRenderPassCreateInfo used to create {@code renderPass} <b>must</b> be supported by the capabilities of the queue family identified by the {@code queueFamilyIndex} member of the ##VkCommandPoolCreateInfo used to create the command pool which {@code commandBuffer} was allocated from</li>
            <li>For any attachment in {@code framebuffer} that is used by {@code renderPass} and is bound to memory locations that are also bound to another attachment used by {@code renderPass}, and if at least one of those uses causes either attachment to be written to, both attachments <b>must</b> have had the #ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT set</li>
            <li>If any attachments specified in {@code framebuffer} are used by {@code renderPass} and are bound to overlapping memory locations, there <b>must</b> be only one that is used as a color attachment, depth/stencil, or resolve attachment in any subpass</li>
            <li>If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the ##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is #IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value including either the #IMAGE_USAGE_COLOR_ATTACHMENT_BIT or #IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT and either the #IMAGE_USAGE_INPUT_ATTACHMENT_BIT or #IMAGE_USAGE_SAMPLED_BIT usage bits</li>
            <li>If any of the {@code initialLayout} or {@code finalLayout} member of the ##VkAttachmentDescription structures or the {@code layout} member of the ##VkAttachmentReference structures specified when creating the render pass specified in the {@code renderPass} member of {@code pRenderPassBegin} is #IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT then the corresponding attachment image view of the framebuffer specified in the {@code framebuffer} member of {@code pRenderPassBegin} <b>must</b> have been created with a {@code usage} value the #IMAGE_USAGE_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT usage bit</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pRenderPassBegin} <b>must</b> be a valid pointer to a valid ##VkRenderPassBeginInfo structure</li>
            <li>{@code pSubpassBeginInfo} <b>must</b> be a valid pointer to a valid ##VkSubpassBeginInfo structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Outside</td><td>Outside</td><td>Graphics</td><td>Action State Synchronization</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkRenderPassBeginInfo, ##VkSubpassBeginInfo
        """,

        VkCommandBuffer("commandBuffer", "the command buffer in which to record the command."),
        VkRenderPassBeginInfo.const.p("pRenderPassBegin", "a pointer to a ##VkRenderPassBeginInfo structure specifying the render pass to begin an instance of, and the framebuffer the instance uses."),
        VkSubpassBeginInfo.const.p("pSubpassBeginInfo", "a pointer to a ##VkSubpassBeginInfo structure containing information about the subpass which is about to begin rendering.")
    )

    void(
        "CmdNextSubpass2",
        """
        Transition to the next subpass of a render pass.

        <h5>C Specification</h5>
        To transition to the next subpass in the render pass instance after recording the commands for a subpass, call:

        <pre><code>
￿void vkCmdNextSubpass2(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkSubpassBeginInfo*                   pSubpassBeginInfo,
￿    const VkSubpassEndInfo*                     pSubpassEndInfo);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdNextSubpass2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkSubpassBeginInfo*                   pSubpassBeginInfo,
￿    const VkSubpassEndInfo*                     pSubpassEndInfo);</code></pre>

        <h5>Description</h5>
        {@code vkCmdNextSubpass2} is semantically identical to #CmdNextSubpass(), except that it is extensible, and that {@code contents} is provided as part of an extensible structure instead of as a flat parameter.

        <h5>Valid Usage</h5>
        <ul>
            <li>The current subpass index <b>must</b> be less than the number of subpasses in the render pass minus one</li>
            <li>This command <b>must</b> not be recorded when transform feedback is active</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pSubpassBeginInfo} <b>must</b> be a valid pointer to a valid ##VkSubpassBeginInfo structure</li>
            <li>{@code pSubpassEndInfo} <b>must</b> be a valid pointer to a valid ##VkSubpassEndInfo structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Inside</td><td>Outside</td><td>Graphics</td><td>Action State Synchronization</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkSubpassBeginInfo, ##VkSubpassEndInfo
        """,

        VkCommandBuffer("commandBuffer", "the command buffer in which to record the command."),
        VkSubpassBeginInfo.const.p("pSubpassBeginInfo", "a pointer to a ##VkSubpassBeginInfo structure containing information about the subpass which is about to begin rendering."),
        VkSubpassEndInfo.const.p("pSubpassEndInfo", "a pointer to a ##VkSubpassEndInfo structure containing information about how the previous subpass will be ended.")
    )

    void(
        "CmdEndRenderPass2",
        """
        End the current render pass.

        <h5>C Specification</h5>
        To record a command to end a render pass instance after recording the commands for the last subpass, call:

        <pre><code>
￿void vkCmdEndRenderPass2(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkSubpassEndInfo*                     pSubpassEndInfo);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdEndRenderPass2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkSubpassEndInfo*                     pSubpassEndInfo);</code></pre>

        <h5>Description</h5>
        {@code vkCmdEndRenderPass2} is semantically identical to #CmdEndRenderPass(), except that it is extensible.

        <h5>Valid Usage</h5>
        <ul>
            <li>The current subpass index <b>must</b> be equal to the number of subpasses in the render pass minus one</li>
            <li>This command <b>must</b> not be recorded when transform feedback is active</li>
            <li>The current render pass instance <b>must</b> not have been begun with #CmdBeginRendering()</li>
            <li>If {@code vkCmdBeginQuery}* was called within a subpass of the render pass, the corresponding {@code vkCmdEndQuery}* <b>must</b> have been called subsequently within the same subpass</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pSubpassEndInfo} <b>must</b> be a valid pointer to a valid ##VkSubpassEndInfo structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Inside</td><td>Outside</td><td>Graphics</td><td>Action State Synchronization</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkSubpassEndInfo
        """,

        VkCommandBuffer("commandBuffer", "the command buffer in which to end the current render pass instance."),
        VkSubpassEndInfo.const.p("pSubpassEndInfo", "a pointer to a ##VkSubpassEndInfo structure containing information about how the last subpass will be ended.")
    )

    // Promoted from VK_EXT_host_query_reset (extension 262)

    void(
        "ResetQueryPool",
        """
        Reset queries in a query pool.

        <h5>C Specification</h5>
        To reset a range of queries in a query pool on the host, call:

        <pre><code>
￿void vkResetQueryPool(
￿    VkDevice                                    device,
￿    VkQueryPool                                 queryPool,
￿    uint32_t                                    firstQuery,
￿    uint32_t                                    queryCount);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkResetQueryPoolEXT(
￿    VkDevice                                    device,
￿    VkQueryPool                                 queryPool,
￿    uint32_t                                    firstQuery,
￿    uint32_t                                    queryCount);</code></pre>

        <h5>Description</h5>
        This command sets the status of query indices <code>[firstQuery, firstQuery + queryCount - 1]</code> to unavailable.

        If {@code queryPool} is #QUERY_TYPE_PERFORMANCE_QUERY_KHR this command sets the status of query indices <code>[firstQuery, firstQuery + queryCount - 1]</code> to unavailable for each pass.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-hostQueryReset">{@code hostQueryReset}</a> feature <b>must</b> be enabled</li>
            <li>{@code firstQuery} <b>must</b> be less than the number of queries in {@code queryPool}</li>
            <li>The sum of {@code firstQuery} and {@code queryCount} <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
            <li>Submitted commands that refer to the range specified by {@code firstQuery} and {@code queryCount} in {@code queryPool} <b>must</b> have completed execution</li>
            <li>The range of queries specified by {@code firstQuery} and {@code queryCount} in {@code queryPool} <b>must</b> not be in use by calls to #GetQueryPoolResults() or {@code vkResetQueryPool} in other threads</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
            <li>{@code queryPool} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>
        """,

        VkDevice("device", "the logical device that owns the query pool."),
        VkQueryPool("queryPool", "the handle of the query pool managing the queries being reset."),
        uint32_t("firstQuery", "the initial query index to reset."),
        uint32_t("queryCount", "the number of queries to reset.")
    )

    // Promoted from VK_KHR_timeline_semaphore (extension 208)

    VkResult(
        "GetSemaphoreCounterValue",
        """
        Query the current state of a timeline semaphore.

        <h5>C Specification</h5>
        To query the current counter value of a semaphore created with a {@code VkSemaphoreType} of #SEMAPHORE_TYPE_TIMELINE from the host, call:

        <pre><code>
￿VkResult vkGetSemaphoreCounterValue(
￿    VkDevice                                    device,
￿    VkSemaphore                                 semaphore,
￿    uint64_t*                                   pValue);</code></pre>

        or the equivalent command

        <pre><code>
￿VkResult vkGetSemaphoreCounterValueKHR(
￿    VkDevice                                    device,
￿    VkSemaphore                                 semaphore,
￿    uint64_t*                                   pValue);</code></pre>

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        If a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#devsandqueues-submission">queue submission</a> command is pending execution, then the value returned by this command <b>may</b> immediately be out of date.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code semaphore} <b>must</b> have been created with a {@code VkSemaphoreType} of #SEMAPHORE_TYPE_TIMELINE</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
            <li>{@code pValue} <b>must</b> be a valid pointer to a {@code uint64_t} value</li>
            <li>{@code semaphore} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_DEVICE_LOST</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the logical device that owns the semaphore."),
        VkSemaphore("semaphore", "the handle of the semaphore to query."),
        Check(1)..uint64_t.p("pValue", "a pointer to a 64-bit integer value in which the current counter value of the semaphore is returned.")
    )

    VkResult(
        "WaitSemaphores",
        """
        Wait for timeline semaphores on the host.

        <h5>C Specification</h5>
        To wait for a set of semaphores created with a {@code VkSemaphoreType} of #SEMAPHORE_TYPE_TIMELINE to reach particular counter values on the host, call:

        <pre><code>
￿VkResult vkWaitSemaphores(
￿    VkDevice                                    device,
￿    const VkSemaphoreWaitInfo*                  pWaitInfo,
￿    uint64_t                                    timeout);</code></pre>

        or the equivalent command

        <pre><code>
￿VkResult vkWaitSemaphoresKHR(
￿    VkDevice                                    device,
￿    const VkSemaphoreWaitInfo*                  pWaitInfo,
￿    uint64_t                                    timeout);</code></pre>

        <h5>Description</h5>
        If the condition is satisfied when {@code vkWaitSemaphores} is called, then {@code vkWaitSemaphores} returns immediately. If the condition is not satisfied at the time {@code vkWaitSemaphores} is called, then {@code vkWaitSemaphores} will block and wait until the condition is satisfied or the {@code timeout} has expired, whichever is sooner.

        If {@code timeout} is zero, then {@code vkWaitSemaphores} does not wait, but simply returns information about the current state of the semaphores. #TIMEOUT will be returned in this case if the condition is not satisfied, even though no actual wait was performed.

        If the condition is satisfied before the {@code timeout} has expired, {@code vkWaitSemaphores} returns #SUCCESS. Otherwise, {@code vkWaitSemaphores} returns #TIMEOUT after the {@code timeout} has expired.

        If device loss occurs (see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#devsandqueues-lost-device">Lost Device</a>) before the timeout has expired, {@code vkWaitSemaphores} <b>must</b> return in finite time with either #SUCCESS or #ERROR_DEVICE_LOST.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pWaitInfo} <b>must</b> be a valid pointer to a valid ##VkSemaphoreWaitInfo structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#TIMEOUT</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_DEVICE_LOST</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkSemaphoreWaitInfo
        """,

        VkDevice("device", "the logical device that owns the semaphores."),
        VkSemaphoreWaitInfo.const.p("pWaitInfo", "a pointer to a ##VkSemaphoreWaitInfo structure containing information about the wait condition."),
        uint64_t("timeout", "the timeout period in units of nanoseconds. {@code timeout} is adjusted to the closest value allowed by the implementation-dependent timeout accuracy, which <b>may</b> be substantially longer than one nanosecond, and <b>may</b> be longer than the requested period.")
    )

    VkResult(
        "SignalSemaphore",
        """
        Signal a timeline semaphore on the host.

        <h5>C Specification</h5>
        To signal a semaphore created with a {@code VkSemaphoreType} of #SEMAPHORE_TYPE_TIMELINE with a particular counter value, on the host, call:

        <pre><code>
￿VkResult vkSignalSemaphore(
￿    VkDevice                                    device,
￿    const VkSemaphoreSignalInfo*                pSignalInfo);</code></pre>

        or the equivalent command

        <pre><code>
￿VkResult vkSignalSemaphoreKHR(
￿    VkDevice                                    device,
￿    const VkSemaphoreSignalInfo*                pSignalInfo);</code></pre>

        <h5>Description</h5>
        When {@code vkSignalSemaphore} is executed on the host, it defines and immediately executes a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-semaphores-signaling"><em>semaphore signal operation</em></a> which sets the timeline semaphore to the given value.

        The first synchronization scope is defined by the host execution model, but includes execution of {@code vkSignalSemaphore} on the host and anything that happened-before it.

        The second synchronization scope is empty.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pSignalInfo} <b>must</b> be a valid pointer to a valid ##VkSemaphoreSignalInfo structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkSemaphoreSignalInfo
        """,

        VkDevice("device", "the logical device that owns the semaphore."),
        VkSemaphoreSignalInfo.const.p("pSignalInfo", "a pointer to a ##VkSemaphoreSignalInfo structure containing information about the signal operation.")
    )

    // Promoted from VK_KHR_buffer_device_address (extension 258)

    VkDeviceAddress(
        "GetBufferDeviceAddress",
        """
        Query an address of a buffer.

        <h5>C Specification</h5>
        To query a 64-bit buffer device address value through which buffer memory <b>can</b> be accessed in a shader, call:

        <pre><code>
￿VkDeviceAddress vkGetBufferDeviceAddress(
￿    VkDevice                                    device,
￿    const VkBufferDeviceAddressInfo*            pInfo);</code></pre>

        or the equivalent command

        <pre><code>
￿VkDeviceAddress vkGetBufferDeviceAddressKHR(
￿    VkDevice                                    device,
￿    const VkBufferDeviceAddressInfo*            pInfo);</code></pre>

        or the equivalent command

        <pre><code>
￿VkDeviceAddress vkGetBufferDeviceAddressEXT(
￿    VkDevice                                    device,
￿    const VkBufferDeviceAddressInfo*            pInfo);</code></pre>

        <h5>Description</h5>
        The 64-bit return value is an address of the start of {@code pInfo→buffer}. The address range starting at this value and whose size is the size of the buffer <b>can</b> be used in a shader to access the memory bound to that buffer, using the {@code SPV_KHR_physical_storage_buffer} extension or the equivalent {@code SPV_EXT_physical_storage_buffer} extension and the {@code PhysicalStorageBuffer} storage class. For example, this value <b>can</b> be stored in a uniform buffer, and the shader <b>can</b> read the value from the uniform buffer and use it to do a dependent read/write to this buffer. A value of zero is reserved as a “{@code null}” pointer and <b>must</b> not be returned as a valid buffer device address. All loads, stores, and atomics in a shader through {@code PhysicalStorageBuffer} pointers <b>must</b> access addresses in the address range of some buffer.

        If the buffer was created with a non-zero value of ##VkBufferOpaqueCaptureAddressCreateInfo{@code ::opaqueCaptureAddress} or ##VkBufferDeviceAddressCreateInfoEXT{@code ::deviceAddress}, the return value will be the same address that was returned at capture time.

        The returned address <b>must</b> satisfy the alignment requirement specified by ##VkMemoryRequirements{@code ::alignment} for the buffer in ##VkBufferDeviceAddressInfo{@code ::buffer}.

        If multiple {@code VkBuffer} objects are bound to overlapping ranges of {@code VkDeviceMemory}, implementations <b>may</b> return address ranges which overlap. In this case, it is ambiguous which {@code VkBuffer} is associated with any given device address. For purposes of valid usage, if multiple {@code VkBuffer} objects <b>can</b> be attributed to a device address, a {@code VkBuffer} is selected such that valid usage passes, if it exists.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-bufferDeviceAddress">{@code bufferDeviceAddress}</a> or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-bufferDeviceAddressEXT">##VkPhysicalDeviceBufferDeviceAddressFeaturesEXT{@code ::bufferDeviceAddress}</a> feature <b>must</b> be enabled</li>
            <li>If {@code device} was created with multiple physical devices, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-bufferDeviceAddressMultiDevice">{@code bufferDeviceAddressMultiDevice}</a> or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-bufferDeviceAddressMultiDeviceEXT">##VkPhysicalDeviceBufferDeviceAddressFeaturesEXT{@code ::bufferDeviceAddressMultiDevice}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkBufferDeviceAddressInfo structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkBufferDeviceAddressInfo
        """,

        VkDevice("device", "the logical device that the buffer was created on."),
        VkBufferDeviceAddressInfo.const.p("pInfo", "a pointer to a ##VkBufferDeviceAddressInfo structure specifying the buffer to retrieve an address for.")
    )

    uint64_t(
        "GetBufferOpaqueCaptureAddress",
        """
        Query an opaque capture address of a buffer.

        <h5>C Specification</h5>
        To query a 64-bit buffer opaque capture address, call:

        <pre><code>
￿uint64_t vkGetBufferOpaqueCaptureAddress(
￿    VkDevice                                    device,
￿    const VkBufferDeviceAddressInfo*            pInfo);</code></pre>

        or the equivalent command

        <pre><code>
￿uint64_t vkGetBufferOpaqueCaptureAddressKHR(
￿    VkDevice                                    device,
￿    const VkBufferDeviceAddressInfo*            pInfo);</code></pre>

        <h5>Description</h5>
        The 64-bit return value is an opaque capture address of the start of {@code pInfo→buffer}.

        If the buffer was created with a non-zero value of ##VkBufferOpaqueCaptureAddressCreateInfo{@code ::opaqueCaptureAddress} the return value <b>must</b> be the same address.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-bufferDeviceAddress">{@code bufferDeviceAddress}</a> feature <b>must</b> be enabled</li>
            <li>If {@code device} was created with multiple physical devices, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-bufferDeviceAddressMultiDevice">{@code bufferDeviceAddressMultiDevice}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkBufferDeviceAddressInfo structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkBufferDeviceAddressInfo
        """,

        VkDevice("device", "the logical device that the buffer was created on."),
        VkBufferDeviceAddressInfo.const.p("pInfo", "a pointer to a ##VkBufferDeviceAddressInfo structure specifying the buffer to retrieve an address for.")
    )

    uint64_t(
        "GetDeviceMemoryOpaqueCaptureAddress",
        """
        Query an opaque capture address of a memory object.

        <h5>C Specification</h5>
        To query a 64-bit opaque capture address value from a memory object, call:

        <pre><code>
￿uint64_t vkGetDeviceMemoryOpaqueCaptureAddress(
￿    VkDevice                                    device,
￿    const VkDeviceMemoryOpaqueCaptureAddressInfo* pInfo);</code></pre>

        or the equivalent command

        <pre><code>
￿uint64_t vkGetDeviceMemoryOpaqueCaptureAddressKHR(
￿    VkDevice                                    device,
￿    const VkDeviceMemoryOpaqueCaptureAddressInfo* pInfo);</code></pre>

        <h5>Description</h5>
        The 64-bit return value is an opaque address representing the start of {@code pInfo→memory}.

        If the memory object was allocated with a non-zero value of ##VkMemoryOpaqueCaptureAddressAllocateInfo{@code ::opaqueCaptureAddress}, the return value <b>must</b> be the same address.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The expected usage for these opaque addresses is only for trace capture/replay tools to store these addresses in a trace and subsequently specify them during replay.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-bufferDeviceAddress">{@code bufferDeviceAddress}</a> feature <b>must</b> be enabled</li>
            <li>If {@code device} was created with multiple physical devices, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-bufferDeviceAddressMultiDevice">{@code bufferDeviceAddressMultiDevice}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkDeviceMemoryOpaqueCaptureAddressInfo structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkDeviceMemoryOpaqueCaptureAddressInfo
        """,

        VkDevice("device", "the logical device that the memory object was allocated on."),
        VkDeviceMemoryOpaqueCaptureAddressInfo.const.p("pInfo", "a pointer to a ##VkDeviceMemoryOpaqueCaptureAddressInfo structure specifying the memory object to retrieve an address for.")
    )

}