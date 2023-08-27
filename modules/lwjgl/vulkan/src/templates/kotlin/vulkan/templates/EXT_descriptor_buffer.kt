/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_descriptor_buffer = "EXTDescriptorBuffer".nativeClassVK("EXT_descriptor_buffer", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension introduces new commands to put shader-accessible descriptors directly in memory, making the management of descriptor data more explicit.

        <h5>VK_EXT_descriptor_buffer</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_descriptor_buffer}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>317</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} and {@link KHRBufferDeviceAddress VK_KHR_buffer_device_address} and {@link KHRSynchronization2 VK_KHR_synchronization2} and {@link EXTDescriptorIndexing VK_EXT_descriptor_indexing}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Tobias Hector <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_descriptor_buffer]%20@tobski%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_descriptor_buffer%20extension*">tobski</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_descriptor_buffer.adoc">VK_EXT_descriptor_buffer</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-06-07</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Tobias Hector, AMD</li>
                <li>Stu Smith, AMD</li>
                <li>Maciej Jesionowski, AMD</li>
                <li>Boris Zanin, AMD</li>
                <li>Hans-Kristian Arntzen, Valve</li>
                <li>Connor Abbott, Valve</li>
                <li>Baldur Karlsson, Valve</li>
                <li>Mike Blumenkrantz, Valve</li>
                <li>Graeme Leese, Broadcom</li>
                <li>Jan-Harald Fredriksen, Arm</li>
                <li>Rodrigo Locatti, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Piers Daniell, NVIDIA</li>
                <li>Jeff Leger, QUALCOMM</li>
                <li>Lionel Landwerlin, Intel</li>
                <li>Slawomir Grajewski, Intel</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_DESCRIPTOR_BUFFER_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_DESCRIPTOR_BUFFER_EXTENSION_NAME".."VK_EXT_descriptor_buffer"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT".."1000316000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_DENSITY_MAP_PROPERTIES_EXT".."1000316001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_FEATURES_EXT".."1000316002",
        "STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT".."1000316003",
        "STRUCTURE_TYPE_DESCRIPTOR_GET_INFO_EXT".."1000316004",
        "STRUCTURE_TYPE_BUFFER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT".."1000316005",
        "STRUCTURE_TYPE_IMAGE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT".."1000316006",
        "STRUCTURE_TYPE_IMAGE_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_EXT".."1000316007",
        "STRUCTURE_TYPE_SAMPLER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT".."1000316008",
        "STRUCTURE_TYPE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT".."1000316010",
        "STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_INFO_EXT".."1000316011",
        "STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_PUSH_DESCRIPTOR_BUFFER_HANDLE_EXT".."1000316012"
    )

    EnumConstant(
        "Extends {@code VkDescriptorSetLayoutCreateFlagBits}.",

        "DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT".enum(0x00000010),
        "DESCRIPTOR_SET_LAYOUT_CREATE_EMBEDDED_IMMUTABLE_SAMPLERS_BIT_EXT".enum(0x00000020)
    )

    EnumConstant(
        "Extends {@code VkBufferUsageFlagBits}.",

        "BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT".enum(0x00200000),
        "BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT".enum(0x00400000),
        "BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT".enum(0x04000000)
    )

    EnumConstant(
        "Extends {@code VkBufferCreateFlagBits}.",

        "BUFFER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT".enum(0x00000020)
    )

    EnumConstant(
        "Extends {@code VkImageCreateFlagBits}.",

        "IMAGE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT".enum(0x00010000)
    )

    EnumConstant(
        "Extends {@code VkImageViewCreateFlagBits}.",

        "IMAGE_VIEW_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT".enum(0x00000004)
    )

    EnumConstant(
        "Extends {@code VkSamplerCreateFlagBits}.",

        "SAMPLER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT".enum(0x00000008)
    )

    EnumConstant(
        "Extends {@code VkAccelerationStructureCreateFlagBitsKHR}.",

        "ACCELERATION_STRUCTURE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT".enum(0x00000008)
    )

    EnumConstantLong(
        "Extends {@code VkAccessFlagBits2}.",

        "ACCESS_2_DESCRIPTOR_BUFFER_READ_BIT_EXT".enum(0x20000000000L)
    )

    EnumConstant(
        "Extends {@code VkPipelineCreateFlagBits}.",

        "PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT".enum(0x20000000)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT".."1000316009"
    )

    void(
        "GetDescriptorSetLayoutSizeEXT",
        """
        Get the size of a descriptor set layout in memory.

        <h5>C Specification</h5>
        To determine the amount of memory needed to store all descriptors with a given layout, call:

        <pre><code>
￿void vkGetDescriptorSetLayoutSizeEXT(
￿    VkDevice                                    device,
￿    VkDescriptorSetLayout                       layout,
￿    VkDeviceSize*                               pLayoutSizeInBytes);</code></pre>

        <h5>Description</h5>
        The size of a descriptor set layout will be at least as large as the sum total of the size of all descriptors in the layout, and <b>may</b> be larger. This size represents the amount of memory that will be required to store all of the descriptors for this layout in memory, when placed according to the layout’s offsets as obtained by #GetDescriptorSetLayoutBindingOffsetEXT().

        If any {@code binding} in {@code layout} is #DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT, the returned size includes space for the maximum {@code descriptorCount} descriptors as declared for that {@code binding}. To compute the required size of a descriptor set with a #DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT:

        <dl>
            <dd><code>size = offset + descriptorSize × variableDescriptorCount</code></dd>
        </dl>

        where <code>offset</code> is obtained by #GetDescriptorSetLayoutBindingOffsetEXT() and <code>descriptorSize</code> is the size of the relevant descriptor as obtained from ##VkPhysicalDeviceDescriptorBufferPropertiesEXT, and <code>variableDescriptorCount</code> is the equivalent of ##VkDescriptorSetVariableDescriptorCountAllocateInfo{@code ::pDescriptorCounts}. For #DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK, <code>variableDescriptorCount</code> is the size in bytes for the inline uniform block, and <code>descriptorSize</code> is 1.

        If ##VkPhysicalDeviceDescriptorBufferPropertiesEXT{@code ::combinedImageSamplerDescriptorSingleArray} is #FALSE and the variable descriptor type is #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, <code>variableDescriptorCount</code> is always considered to be the upper bound.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-descriptorBuffer">{@code descriptorBuffer}</a> feature <b>must</b> be enabled</li>
            <li>{@code layout} <b>must</b> have been created with the #DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT flag set</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code layout} <b>must</b> be a valid {@code VkDescriptorSetLayout} handle</li>
            <li>{@code pLayoutSizeInBytes} <b>must</b> be a valid pointer to a {@code VkDeviceSize} value</li>
            <li>{@code layout} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>
        """,

        VkDevice("device", "the logical device that gets the size."),
        VkDescriptorSetLayout("layout", "the descriptor set layout being queried."),
        Check(1)..VkDeviceSize.p("pLayoutSizeInBytes", "a pointer to {@code VkDeviceSize} where the size in bytes will be written.")
    )

    void(
        "GetDescriptorSetLayoutBindingOffsetEXT",
        """
        Get the offset of a binding within a descriptor set layout.

        <h5>C Specification</h5>
        To get the offset of a binding within a descriptor set layout in memory, call:

        <pre><code>
￿void vkGetDescriptorSetLayoutBindingOffsetEXT(
￿    VkDevice                                    device,
￿    VkDescriptorSetLayout                       layout,
￿    uint32_t                                    binding,
￿    VkDeviceSize*                               pOffset);</code></pre>

        <h5>Description</h5>
        Each binding in a descriptor set layout is assigned an offset in memory by the implementation. When a shader accesses a resource with that binding, it will access the bound descriptor buffer from that offset to look for its descriptor. This command provides an application with that offset, so that descriptors can be placed in the correct locations. The precise location accessed by a shader for a given descriptor is as follows:

        <dl>
            <dd><code>location = bufferAddress + setOffset + descriptorOffset + (arrayElement × descriptorSize)</code></dd>
        </dl>

        where <code>bufferAddress</code> and <code>setOffset</code> are the base address and offset for the identified descriptor set as specified by #CmdBindDescriptorBuffersEXT() and #CmdSetDescriptorBufferOffsetsEXT(), <code>descriptorOffset</code> is the offset for the binding returned by this command, <code>arrayElement</code> is the index into the array specified in the shader, and <code>descriptorSize</code> is the size of the relevant descriptor as obtained from ##VkPhysicalDeviceDescriptorBufferPropertiesEXT. Applications are responsible for placing valid descriptors at the expected location in order for a shader to access it. The overall offset added to <code>bufferAddress</code> to calculate <code>location</code> <b>must</b> be less than ##VkPhysicalDeviceDescriptorBufferPropertiesEXT{@code ::maxSamplerDescriptorBufferRange} for samplers and ##VkPhysicalDeviceDescriptorBufferPropertiesEXT{@code ::maxResourceDescriptorBufferRange} for resources.

        If any {@code binding} in {@code layout} is #DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT, that {@code binding} <b>must</b> have the largest offset of any {@code binding}.

        A descriptor {@code binding} with type #DESCRIPTOR_TYPE_MUTABLE_VALVE <b>can</b> be used. Any potential types in ##VkMutableDescriptorTypeCreateInfoVALVE{@code ::pDescriptorTypes} for {@code binding} share the same offset. If the size of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-mutable">mutable descriptor</a> is larger than the size of a concrete descriptor type being accessed, the padding area is ignored by the implementation.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-descriptorBuffer">{@code descriptorBuffer}</a> feature <b>must</b> be enabled</li>
            <li>{@code layout} <b>must</b> have been created with the #DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT flag set</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code layout} <b>must</b> be a valid {@code VkDescriptorSetLayout} handle</li>
            <li>{@code pOffset} <b>must</b> be a valid pointer to a {@code VkDeviceSize} value</li>
            <li>{@code layout} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>
        """,

        VkDevice("device", "the logical device that gets the offset."),
        VkDescriptorSetLayout("layout", "the descriptor set layout being queried."),
        uint32_t("binding", "the binding number being queried."),
        Check(1)..VkDeviceSize.p("pOffset", "a pointer to {@code VkDeviceSize} where the byte offset of the binding will be written.")
    )

    void(
        "GetDescriptorEXT",
        """
        To get a descriptor to place in a buffer.

        <h5>C Specification</h5>
        To get descriptor data to place in a buffer, call:

        <pre><code>
￿void vkGetDescriptorEXT(
￿    VkDevice                                    device,
￿    const VkDescriptorGetInfoEXT*               pDescriptorInfo,
￿    size_t                                      dataSize,
￿    void*                                       pDescriptor);</code></pre>

        <h5>Description</h5>
        The size of the data for each descriptor type is determined by the value in ##VkPhysicalDeviceDescriptorBufferPropertiesEXT. This value also defines the stride in bytes for arrays of that descriptor type.

        If the ##VkPhysicalDeviceDescriptorBufferPropertiesEXT{@code ::combinedImageSamplerDescriptorSingleArray} property is #FALSE the implementation requires an array of #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER descriptors to be written into a descriptor buffer as an array of image descriptors, immediately followed by an array of sampler descriptors. Applications <b>must</b> write the first ##VkPhysicalDeviceDescriptorBufferPropertiesEXT{@code ::sampledImageDescriptorSize} bytes of the data returned through {@code pDescriptor} to the first array, and the remaining ##VkPhysicalDeviceDescriptorBufferPropertiesEXT{@code ::samplerDescriptorSize} bytes of the data to the second array. For variable-sized descriptor bindings of #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER descriptors, the two arrays each have a size equal to the upper bound {@code descriptorCount} of that binding.

        A descriptor obtained by this command references the underlying {@code VkImageView} or {@code VkSampler}, and these objects <b>must</b> not be destroyed before the last time a descriptor is dynamically accessed. For descriptor types which consume an address instead of an object, the underlying {@code VkBuffer} is referenced instead.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-descriptorBuffer">{@code descriptorBuffer}</a> feature <b>must</b> be enabled</li>
            <li>{@code dataSize} <b>must</b> equal the size of a descriptor of type ##VkDescriptorGetInfoEXT{@code ::type} determined by the value in ##VkPhysicalDeviceDescriptorBufferPropertiesEXT, or ##VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT{@code ::combinedImageSamplerDensityMapDescriptorSize} if {@code pDescriptorInfo} specifies a #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER whose {@code VkSampler} was created with #SAMPLER_CREATE_SUBSAMPLED_BIT_EXT set</li>
            <li>{@code pDescriptor} <b>must</b> be a valid pointer to an array of at least {@code dataSize} bytes</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pDescriptorInfo} <b>must</b> be a valid pointer to a valid ##VkDescriptorGetInfoEXT structure</li>
            <li>{@code pDescriptor} <b>must</b> be a valid pointer to an array of {@code dataSize} bytes</li>
            <li>{@code dataSize} <b>must</b> be greater than 0</li>
        </ul>

        <h5>See Also</h5>
        ##VkDescriptorGetInfoEXT
        """,

        VkDevice("device", "the logical device that gets the descriptor."),
        VkDescriptorGetInfoEXT.const.p("pDescriptorInfo", "a pointer to a ##VkDescriptorGetInfoEXT structure specifying the parameters of the descriptor to get."),
        AutoSize("pDescriptor")..size_t("dataSize", "the amount of the descriptor data to get in bytes."),
        void.p("pDescriptor", "a pointer to a user-allocated buffer where the descriptor will be written.")
    )

    void(
        "CmdBindDescriptorBuffersEXT",
        """
        Binding descriptor buffers to a command buffer.

        <h5>C Specification</h5>
        To bind descriptor buffers to a command buffer, call:

        <pre><code>
￿void vkCmdBindDescriptorBuffersEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    bufferCount,
￿    const VkDescriptorBufferBindingInfoEXT*     pBindingInfos);</code></pre>

        <h5>Description</h5>
        {@code vkCmdBindDescriptorBuffersEXT} causes any offsets previously set by #CmdSetDescriptorBufferOffsetsEXT() that use the bindings numbered [0.. {@code bufferCount}-1] to be no longer valid for subsequent bound pipeline commands. Any previously bound buffers at binding points greater than or equal to {@code bufferCount} are unbound.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-descriptorBuffer">{@code descriptorBuffer}</a> feature <b>must</b> be enabled</li>
            <li>There <b>must</b> be no more than ##VkPhysicalDeviceDescriptorBufferPropertiesEXT{@code ::maxSamplerDescriptorBufferBindings} descriptor buffers containing sampler descriptor data bound</li>
            <li>There <b>must</b> be no more than ##VkPhysicalDeviceDescriptorBufferPropertiesEXT{@code ::maxResourceDescriptorBufferBindings} descriptor buffers containing resource descriptor data bound</li>
            <li>There <b>must</b> be no more than 1 descriptor buffer bound that was created with the #BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT bit set</li>
            <li>{@code bufferCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceDescriptorBufferPropertiesEXT{@code ::maxDescriptorBufferBindings}</li>
            <li>For any element of {@code pBindingInfos}, if the buffer from which {@code address} was queried is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>For any element of {@code pBindingInfos}, the buffer from which {@code address} was queried <b>must</b> have been created with the #BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT bit set if it contains sampler descriptor data</li>
            <li>For any element of {@code pBindingInfos}, the buffer from which {@code address} was queried <b>must</b> have been created with the #BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT bit set if it contains resource descriptor data</li>
            <li>For any element of {@code pBindingInfos}, {@code usage} <b>must</b> match the buffer from which {@code address} was queried</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pBindingInfos} <b>must</b> be a valid pointer to an array of {@code bufferCount} valid ##VkDescriptorBufferBindingInfoEXT structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code bufferCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkDescriptorBufferBindingInfoEXT
        """,

        VkCommandBuffer("commandBuffer", "the command buffer that the descriptor buffers will be bound to."),
        AutoSize("pBindingInfos")..uint32_t("bufferCount", "the number of elements in the {@code pBindingInfos} array."),
        VkDescriptorBufferBindingInfoEXT.const.p("pBindingInfos", "a pointer to an array of ##VkDescriptorBufferBindingInfoEXT structures.")
    )

    void(
        "CmdSetDescriptorBufferOffsetsEXT",
        """
        Setting descriptor buffer offsets in a command buffer.

        <h5>C Specification</h5>
        To set descriptor buffer offsets in a command buffer, call:

        <pre><code>
￿void vkCmdSetDescriptorBufferOffsetsEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkPipelineBindPoint                         pipelineBindPoint,
￿    VkPipelineLayout                            layout,
￿    uint32_t                                    firstSet,
￿    uint32_t                                    setCount,
￿    const uint32_t*                             pBufferIndices,
￿    const VkDeviceSize*                         pOffsets);</code></pre>

        <h5>Description</h5>
        {@code vkCmdSetDescriptorBufferOffsetsEXT} binds {@code setCount} pairs of descriptor buffers, specified by indices into the binding points bound using #CmdBindDescriptorBuffersEXT(), and buffer offsets to set numbers [{@code firstSet}..{@code firstSet}+{@code descriptorSetCount}-1] for subsequent <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-bindpoint-commands">bound pipeline commands</a> set by {@code pipelineBindPoint}. Set [{@code firstSet} + i] is bound to the descriptor buffer at binding {@code pBufferIndices}[i] at an offset of {@code pOffsets}[i]. Any bindings that were previously applied via these sets, or calls to #CmdBindDescriptorSets(), are no longer valid. Other sets will also be invalidated upon calling this command if {@code layout} differs from the pipeline layout used to bind those other sets, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a>.

        After binding descriptors, applications <b>can</b> modify descriptor memory either by performing writes on the host or with device commands. When descriptor memory is updated with device commands, visibility for the shader stage accessing a descriptor is ensured with the #ACCESS_2_DESCRIPTOR_BUFFER_READ_BIT_EXT access flag. Implementations <b>must</b> not access resources referenced by these descriptors unless they are dynamically accessed by shaders. Descriptors bound with this call <b>can</b> be undefined if they are not dynamically accessed by shaders.

        Implementations <b>may</b> read descriptor data for any statically accessed descriptor if the {@code binding} in {@code layout} is not declared with the #DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT flag. If the {@code binding} in {@code layout} is declared with #DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT, implementations <b>must</b> not read descriptor data that is not dynamically accessed.

        Applications <b>must</b> ensure that any descriptor which the implementation <b>may</b> read <b>must</b> be in-bounds of the underlying descriptor buffer binding.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Applications can freely decide how large a variable descriptor buffer binding is, so it may not be safe to read such descriptor payloads statically. The intention of these rules is to allow implementations to speculatively prefetch descriptor payloads where feasible.
        </div>

        Dynamically accessing a resource through descriptor data from an unbound region of a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#sparsememory-partially-resident-buffers">sparse partially-resident buffer</a> will result in invalid descriptor data being read, and therefore undefined behavior.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        For descriptors written by the host, visibility is implied through the automatic visibility operation on queue submit, and there is no need to consider {@code VK_ACCESS_2_DESCRIPTOR_BUFFER_READ_BIT}. Explicit synchronization for descriptors is only required when descriptors are updated on the device.
        </div>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The requirements above imply that all descriptor bindings have been defined with the equivalent of #DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT, #DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT and #DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT, but enabling those features is not required to get this behavior.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-descriptorBuffer">{@code descriptorBuffer}</a> feature <b>must</b> be enabled</li>
            <li>The offsets in {@code pOffsets} <b>must</b> be aligned to ##VkPhysicalDeviceDescriptorBufferPropertiesEXT{@code ::descriptorBufferOffsetAlignment}</li>
            <li>The offsets in {@code pOffsets} <b>must</b> be small enough such that any descriptor binding referenced by {@code layout} without the #DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT flag computes a valid address inside the underlying {@code VkBuffer}</li>
            <li>The offsets in {@code pOffsets} <b>must</b> be small enough such that any location accessed by a shader as a sampler descriptor <b>must</b> be within ##VkPhysicalDeviceDescriptorBufferPropertiesEXT{@code ::maxSamplerDescriptorBufferRange} of the sampler descriptor buffer binding</li>
            <li>The offsets in {@code pOffsets} <b>must</b> be small enough such that any location accessed by a shader as a resource descriptor <b>must</b> be within ##VkPhysicalDeviceDescriptorBufferPropertiesEXT{@code ::maxResourceDescriptorBufferRange} of the resource descriptor buffer binding</li>
            <li>Each element of {@code pBufferIndices} <b>must</b> be less than ##VkPhysicalDeviceDescriptorBufferPropertiesEXT{@code ::maxDescriptorBufferBindings}</li>
            <li>Each element of {@code pBufferIndices} <b>must</b> reference a valid descriptor buffer binding set by a previous call to #CmdBindDescriptorBuffersEXT() in {@code commandBuffer}</li>
            <li>The sum of {@code firstSet} and {@code setCount} <b>must</b> be less than or equal to ##VkPipelineLayoutCreateInfo{@code ::setLayoutCount} provided when {@code layout} was created</li>
            <li>{@code pipelineBindPoint} <b>must</b> be supported by the {@code commandBuffer}’s parent {@code VkCommandPool}’s queue family</li>
            <li>The {@code VkDescriptorSetLayout} for each set from {@code firstSet} to <code>firstSet + setCount</code> when {@code layout} was created <b>must</b> have been created with the #DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT bit set</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
            <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
            <li>{@code pBufferIndices} <b>must</b> be a valid pointer to an array of {@code setCount} {@code uint32_t} values</li>
            <li>{@code pOffsets} <b>must</b> be a valid pointer to an array of {@code setCount} {@code VkDeviceSize} values</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code setCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code commandBuffer}, and {@code layout} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer in which the descriptor buffer offsets will be set."),
        VkPipelineBindPoint("pipelineBindPoint", "a {@code VkPipelineBindPoint} indicating the type of the pipeline that will use the descriptors."),
        VkPipelineLayout("layout", "a {@code VkPipelineLayout} object used to program the bindings."),
        uint32_t("firstSet", "the number of the first set to be bound."),
        AutoSize("pBufferIndices", "pOffsets")..uint32_t("setCount", "the number of elements in the {@code pBufferIndices} and {@code pOffsets} arrays."),
        uint32_t.const.p("pBufferIndices", "a pointer to an array of indices into the descriptor buffer binding points set by #CmdBindDescriptorBuffersEXT()."),
        VkDeviceSize.const.p("pOffsets", "a pointer to an array of {@code VkDeviceSize} offsets to apply to the bound descriptor buffers.")
    )

    void(
        "CmdBindDescriptorBufferEmbeddedSamplersEXT",
        """
        Setting embedded immutable samplers offsets in a command buffer.

        <h5>C Specification</h5>
        To bind an embedded immutable sampler set to a command buffer, call:

        <pre><code>
￿void vkCmdBindDescriptorBufferEmbeddedSamplersEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkPipelineBindPoint                         pipelineBindPoint,
￿    VkPipelineLayout                            layout,
￿    uint32_t                                    set);</code></pre>

        <h5>Description</h5>
        {@code vkCmdBindDescriptorBufferEmbeddedSamplersEXT} binds the embedded immutable samplers in {@code set} of {@code layout} to {@code set} for the command buffer for subsequent <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-bindpoint-commands">bound pipeline commands</a> set by {@code pipelineBindPoint}. Any previous binding to this set by #CmdSetDescriptorBufferOffsetsEXT() or this command is overwritten. Any sets that were last bound by a call to #CmdBindDescriptorSets() are invalidated upon calling this command. Other sets will also be invalidated upon calling this command if {@code layout} differs from the pipeline layout used to bind those other sets, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-descriptorBuffer">{@code descriptorBuffer}</a> feature <b>must</b> be enabled</li>
            <li>{@code pipelineBindPoint} <b>must</b> be supported by the {@code commandBuffer}’s parent {@code VkCommandPool}’s queue family</li>
            <li>The {@code VkDescriptorSetLayout} at index {@code set} when {@code layout} was created <b>must</b> have been created with the #DESCRIPTOR_SET_LAYOUT_CREATE_EMBEDDED_IMMUTABLE_SAMPLERS_BIT_EXT bit set</li>
            <li>{@code set} <b>must</b> be less than or equal to ##VkPipelineLayoutCreateInfo{@code ::setLayoutCount} provided when {@code layout} was created</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
            <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>Both of {@code commandBuffer}, and {@code layout} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer that the embedded immutable samplers will be bound to."),
        VkPipelineBindPoint("pipelineBindPoint", "a {@code VkPipelineBindPoint} indicating the type of the pipeline that will use the embedded immutable samplers."),
        VkPipelineLayout("layout", "a {@code VkPipelineLayout} object used to program the bindings."),
        uint32_t("set", "the number of the set to be bound.")
    )

    VkResult(
        "GetBufferOpaqueCaptureDescriptorDataEXT",
        """
        Get buffer opaque capture descriptor data.

        <h5>C Specification</h5>
        To get the opaque descriptor data for a buffer, call:

        <pre><code>
￿VkResult vkGetBufferOpaqueCaptureDescriptorDataEXT(
￿    VkDevice                                    device,
￿    const VkBufferCaptureDescriptorDataInfoEXT* pInfo,
￿    void*                                       pData);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-descriptorBuffer">{@code descriptorBufferCaptureReplay}</a> feature <b>must</b> be enabled</li>
            <li>{@code pData} <b>must</b> point to a buffer that is at least ##VkPhysicalDeviceDescriptorBufferPropertiesEXT{@code ::bufferCaptureReplayDescriptorDataSize} bytes in size</li>
            <li>If {@code device} was created with multiple physical devices, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-bufferDeviceAddressMultiDevice">{@code bufferDeviceAddressMultiDevice}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkBufferCaptureDescriptorDataInfoEXT structure</li>
            <li>{@code pData} <b>must</b> be a pointer value</li>
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
        ##VkBufferCaptureDescriptorDataInfoEXT
        """,

        VkDevice("device", "the logical device that gets the data."),
        VkBufferCaptureDescriptorDataInfoEXT.const.p("pInfo", "a pointer to a ##VkBufferCaptureDescriptorDataInfoEXT structure specifying the buffer."),
        Check(1)..void.p("pData", "a pointer to a user-allocated buffer where the data will be written.")
    )

    VkResult(
        "GetImageOpaqueCaptureDescriptorDataEXT",
        """
        Get image opaque capture descriptor data.

        <h5>C Specification</h5>
        To get the opaque capture descriptor data for an image, call:

        <pre><code>
￿VkResult vkGetImageOpaqueCaptureDescriptorDataEXT(
￿    VkDevice                                    device,
￿    const VkImageCaptureDescriptorDataInfoEXT*  pInfo,
￿    void*                                       pData);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-descriptorBuffer">{@code descriptorBufferCaptureReplay}</a> feature <b>must</b> be enabled</li>
            <li>{@code pData} <b>must</b> point to a buffer that is at least ##VkPhysicalDeviceDescriptorBufferPropertiesEXT{@code ::imageCaptureReplayDescriptorDataSize} bytes in size</li>
            <li>If {@code device} was created with multiple physical devices, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-bufferDeviceAddressMultiDevice">{@code bufferDeviceAddressMultiDevice}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkImageCaptureDescriptorDataInfoEXT structure</li>
            <li>{@code pData} <b>must</b> be a pointer value</li>
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
        ##VkImageCaptureDescriptorDataInfoEXT
        """,

        VkDevice("device", "the logical device that gets the data."),
        VkImageCaptureDescriptorDataInfoEXT.const.p("pInfo", "a pointer to a ##VkImageCaptureDescriptorDataInfoEXT structure specifying the image."),
        Check(1)..void.p("pData", "a pointer to a user-allocated buffer where the data will be written.")
    )

    VkResult(
        "GetImageViewOpaqueCaptureDescriptorDataEXT",
        """
        Get image view opaque capture descriptor data.

        <h5>C Specification</h5>
        To get the opaque capture descriptor data for an image view, call:

        <pre><code>
￿VkResult vkGetImageViewOpaqueCaptureDescriptorDataEXT(
￿    VkDevice                                    device,
￿    const VkImageViewCaptureDescriptorDataInfoEXT* pInfo,
￿    void*                                       pData);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-descriptorBuffer">{@code descriptorBufferCaptureReplay}</a> feature <b>must</b> be enabled</li>
            <li>{@code pData} <b>must</b> point to a buffer that is at least ##VkPhysicalDeviceDescriptorBufferPropertiesEXT{@code ::imageViewCaptureReplayDescriptorDataSize} bytes in size</li>
            <li>If {@code device} was created with multiple physical devices, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-bufferDeviceAddressMultiDevice">{@code bufferDeviceAddressMultiDevice}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkImageViewCaptureDescriptorDataInfoEXT structure</li>
            <li>{@code pData} <b>must</b> be a pointer value</li>
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
        ##VkImageViewCaptureDescriptorDataInfoEXT
        """,

        VkDevice("device", "the logical device that gets the data."),
        VkImageViewCaptureDescriptorDataInfoEXT.const.p("pInfo", "a pointer to a ##VkImageViewCaptureDescriptorDataInfoEXT structure specifying the image view."),
        Check(1)..void.p("pData", "a pointer to a user-allocated buffer where the data will be written.")
    )

    VkResult(
        "GetSamplerOpaqueCaptureDescriptorDataEXT",
        """
        Get sampler opaque capture descriptor data.

        <h5>C Specification</h5>
        To get the opaque capture descriptor data for a sampler, call:

        <pre><code>
￿VkResult vkGetSamplerOpaqueCaptureDescriptorDataEXT(
￿    VkDevice                                    device,
￿    const VkSamplerCaptureDescriptorDataInfoEXT* pInfo,
￿    void*                                       pData);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-descriptorBuffer">{@code descriptorBufferCaptureReplay}</a> feature <b>must</b> be enabled</li>
            <li>{@code pData} <b>must</b> point to a buffer that is at least ##VkPhysicalDeviceDescriptorBufferPropertiesEXT{@code ::samplerCaptureReplayDescriptorDataSize} bytes in size</li>
            <li>If {@code device} was created with multiple physical devices, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-bufferDeviceAddressMultiDevice">{@code bufferDeviceAddressMultiDevice}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkSamplerCaptureDescriptorDataInfoEXT structure</li>
            <li>{@code pData} <b>must</b> be a pointer value</li>
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
        ##VkSamplerCaptureDescriptorDataInfoEXT
        """,

        VkDevice("device", "the logical device that gets the data."),
        VkSamplerCaptureDescriptorDataInfoEXT.const.p("pInfo", "a pointer to a ##VkSamplerCaptureDescriptorDataInfoEXT structure specifying the sampler."),
        Check(1)..void.p("pData", "a pointer to a user-allocated buffer where the data will be written.")
    )

    DependsOn("""ext.contains("VK_KHR_acceleration_structure") || ext.contains("VK_NV_ray_tracing")""")..VkResult(
        "GetAccelerationStructureOpaqueCaptureDescriptorDataEXT",
        """
        Get acceleration structure opaque capture descriptor data.

        <h5>C Specification</h5>
        To get the opaque capture descriptor data for an acceleration structure, call:

        <pre><code>
￿VkResult vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT(
￿    VkDevice                                    device,
￿    const VkAccelerationStructureCaptureDescriptorDataInfoEXT* pInfo,
￿    void*                                       pData);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-descriptorBuffer">{@code descriptorBufferCaptureReplay}</a> feature <b>must</b> be enabled</li>
            <li>{@code pData} <b>must</b> point to a buffer that is at least ##VkPhysicalDeviceDescriptorBufferPropertiesEXT{@code ::accelerationStructureCaptureReplayDescriptorDataSize} bytes in size</li>
            <li>If {@code device} was created with multiple physical devices, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-bufferDeviceAddressMultiDevice">{@code bufferDeviceAddressMultiDevice}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkAccelerationStructureCaptureDescriptorDataInfoEXT structure</li>
            <li>{@code pData} <b>must</b> be a pointer value</li>
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
        ##VkAccelerationStructureCaptureDescriptorDataInfoEXT
        """,

        VkDevice("device", "the logical device that gets the data."),
        VkAccelerationStructureCaptureDescriptorDataInfoEXT.const.p("pInfo", "a pointer to a ##VkAccelerationStructureCaptureDescriptorDataInfoEXT structure specifying the acceleration structure."),
        Check(1)..void.p("pData", "a pointer to a user-allocated buffer where the data will be written.")
    )
}