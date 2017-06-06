/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val AMD_draw_indirect_count = "AMDDrawIndirectCount".nativeClassVK("AMD_draw_indirect_count", type = "device", postfix = AMD) {
    documentation =
        """
        This extension allows an application to source the number of draw calls for indirect draw calls from a buffer. This enables applications to generate arbitrary amounts of draw commands and execute them without host intervention.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_AMD_draw_indirect_count</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>34</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-08-23</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Matthaeus G. Chajdas, AMD</li>
                <li>Derrick Owens, AMD</li>
                <li>Graham Sellers, AMD</li>
                <li>Daniel Rakos, AMD</li>
                <li>Dominik Witczak, AMD</li>
            </ul></dd>

            <dt><b>Contacts</b></dt>
            <dd><ul>
                <li>Matthaeus G. Chajdas, AMD (mailto:matthaeus.chajdas@amd.com[matthaeus.chajdas@amd.com])</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "AMD_DRAW_INDIRECT_COUNT_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "AMD_DRAW_INDIRECT_COUNT_EXTENSION_NAME".."VK_AMD_draw_indirect_count"
    )

    void(
        "CmdDrawIndirectCountAMD",
        """
        Perform an indirect draw with the draw count sourced from a buffer.

        <h5>C Specification</h5>
        To record a non-indexed draw call with a draw call count sourced from a buffer, call:

        <code><pre>
￿void vkCmdDrawIndirectCountAMD(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    buffer,
￿    VkDeviceSize                                offset,
￿    VkBuffer                                    countBuffer,
￿    VkDeviceSize                                countBufferOffset,
￿    uint32_t                                    maxDrawCount,
￿    uint32_t                                    stride);</pre></code>

        <h5>Description</h5>
        #CmdDrawIndirectCountAMD() behaves similar to #CmdDrawIndirect() except that the draw count is read by the device from a buffer during execution. The command will read an unsigned 32-bit integer from {@code countBuffer} located at {@code countBufferOffset} and use this as the draw count.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code offset} <b>must</b> be a multiple of 4</li>
            <li>{@code countBufferOffset} <b>must</b> be a multiple of 4</li>
            <li>{@code stride} <b>must</b> be a multiple of 4 and <b>must</b> be greater than or equal to sizeof(##VkDrawIndirectCommand)</li>
            <li>If {@code maxDrawCount} is greater than or equal to 1, <code>(stride × (maxDrawCount - 1) + offset + sizeof(##VkDrawIndirectCommand))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-drawIndirectFirstInstance">drawIndirectFirstInstance</a> feature is not enabled, all the {@code firstInstance} members of the ##VkDrawIndirectCommand structures accessed by this command <b>must</b> be 0</li>
            <li>The current render pass <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS.</li>
            <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS.</li>
            <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS, a descriptor set <b>must</b> have been bound to <em>n</em> at #PIPELINE_BIND_POINT_GRAPHICS, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
            <li>For each push constant that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS, a push constant value <b>must</b> have been set for #PIPELINE_BIND_POINT_GRAPHICS, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
            <li>Descriptors in each bound descriptor set, specified via #CmdBindDescriptorSets(), <b>must</b> be valid if they are statically used by the currently bound {@code VkPipeline} object, specified via #CmdBindPipeline()</li>
            <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point&#8217;s interface <b>must</b> have valid buffers bound</li>
            <li>A valid graphics pipeline <b>must</b> be bound to the current command buffer with #PIPELINE_BIND_POINT_GRAPHICS</li>
            <li>If the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_GRAPHICS requires any dynamic state, that state <b>must</b> have been set on the current command buffer</li>
            <li>If the count stored in {@code countBuffer} is equal to 1, <code>(offset + sizeof(##VkDrawIndirectCommand))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
            <li>If the count stored in {@code countBuffer} is greater than 1, <code>(stride × (drawCount - 1) + offset + sizeof(##VkDrawIndirectCommand))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
            <li>The count stored in {@code countBuffer} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxDrawIndirectCount}</li>
            <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
            <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses unnormalized coordinates, it <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage</li>
            <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
            <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_GRAPHICS accesses a uniform buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_GRAPHICS accesses a storage buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_LINEAR as a result of this command <b>must</b> be of a format which supports linear filtering, as specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or ##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>If the draw is recorded in a render pass instance with multiview enabled, the maximum instance index <b>must</b> be less than or equal to ##VkPhysicalDeviceMultiviewPropertiesKHX{@code ::maxMultiviewInstanceIndex}.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code countBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
            <li>Each of {@code buffer}, {@code commandBuffer}, and {@code countBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command is recorded."),
        VkBuffer.IN("buffer", "the buffer containing draw parameters."),
        VkDeviceSize.IN("offset", "the byte offset into {@code buffer} where parameters begin."),
        VkBuffer.IN("countBuffer", "the buffer containing the draw count."),
        VkDeviceSize.IN("countBufferOffset", "the byte offset into {@code countBuffer} where the draw count begins."),
        uint32_t.IN("maxDrawCount", "specifies the maximum number of draws that will be executed. The actual number of executed draw calls is the minimum of the count specified in {@code countBuffer} and {@code maxDrawCount}."),
        uint32_t.IN("stride", "the byte stride between successive sets of draw parameters.")
    )

    void(
        "CmdDrawIndexedIndirectCountAMD",
        """
        Perform an indexed indirect draw with the draw count sourced from a buffer.

        <h5>C Specification</h5>
        To record an indexed draw call with a draw call count sourced from a buffer, call:

        <code><pre>
￿void vkCmdDrawIndexedIndirectCountAMD(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    buffer,
￿    VkDeviceSize                                offset,
￿    VkBuffer                                    countBuffer,
￿    VkDeviceSize                                countBufferOffset,
￿    uint32_t                                    maxDrawCount,
￿    uint32_t                                    stride);</pre></code>

        <h5>Description</h5>
        #CmdDrawIndexedIndirectCountAMD() behaves similar to #CmdDrawIndirectCountAMD() except that the draw count is read by the device from a buffer during execution. The command will read an unsigned 32-bit integer from {@code countBuffer} located at {@code countBufferOffset} and use this as the draw count.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code offset} <b>must</b> be a multiple of 4</li>
            <li>{@code countBufferOffset} <b>must</b> be a multiple of 4</li>
            <li>{@code stride} <b>must</b> be a multiple of 4 and <b>must</b> be greater than or equal to sizeof(##VkDrawIndirectCommand)</li>
            <li>If {@code maxDrawCount} is greater than or equal to 1, <code>(stride × (maxDrawCount - 1) + offset + sizeof(##VkDrawIndirectCommand))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-drawIndirectFirstInstance">drawIndirectFirstInstance</a> feature is not enabled, all the {@code firstInstance} members of the ##VkDrawIndexedIndirectCommand structures accessed by this command <b>must</b> be 0</li>
            <li>The current render pass <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS.</li>
            <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS.</li>
            <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS, a descriptor set <b>must</b> have been bound to <em>n</em> at #PIPELINE_BIND_POINT_GRAPHICS, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
            <li>For each push constant that is statically used by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS, a push constant value <b>must</b> have been set for #PIPELINE_BIND_POINT_GRAPHICS, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
            <li>Descriptors in each bound descriptor set, specified via #CmdBindDescriptorSets(), <b>must</b> be valid if they are statically used by the currently bound {@code VkPipeline} object, specified via #CmdBindPipeline()</li>
            <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point&#8217;s interface <b>must</b> have valid buffers bound</li>
            <li>A valid graphics pipeline <b>must</b> be bound to the current command buffer with #PIPELINE_BIND_POINT_GRAPHICS</li>
            <li>If the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_GRAPHICS requires any dynamic state, that state <b>must</b> have been set on the current command buffer</li>
            <li>If count stored in {@code countBuffer} is equal to 1, <code>(offset + sizeof(##VkDrawIndexedIndirectCommand))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
            <li>If count stored in {@code countBuffer} is greater than 1, <code>(stride × (drawCount - 1) + offset + sizeof(##VkDrawIndexedIndirectCommand))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
            <li>{@code drawCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxDrawIndirectCount}</li>
            <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
            <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses unnormalized coordinates, it <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage</li>
            <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
            <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} currently bound to #PIPELINE_BIND_POINT_GRAPHICS uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_GRAPHICS accesses a uniform buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object currently bound to #PIPELINE_BIND_POINT_GRAPHICS accesses a storage buffer, it <b>must</b> not access values outside of the range of that buffer specified in the currently bound descriptor set</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_LINEAR as a result of this command <b>must</b> be of a format which supports linear filtering, as specified by the #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT flag in ##VkFormatProperties{@code ::linearTilingFeatures} (for a linear image) or ##VkFormatProperties{@code ::optimalTilingFeatures}(for an optimally tiled image) returned by #GetPhysicalDeviceFormatProperties()</li>
            <li>If the draw is recorded in a render pass instance with multiview enabled, the maximum instance index <b>must</b> be less than or equal to ##VkPhysicalDeviceMultiviewPropertiesKHX{@code ::maxMultiviewInstanceIndex}.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code countBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
            <li>Each of {@code buffer}, {@code commandBuffer}, and {@code countBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command is recorded."),
        VkBuffer.IN("buffer", "the buffer containing draw parameters."),
        VkDeviceSize.IN("offset", "the byte offset into {@code buffer} where parameters begin."),
        VkBuffer.IN("countBuffer", "the buffer containing the draw count."),
        VkDeviceSize.IN("countBufferOffset", "the byte offset into {@code countBuffer} where the draw count begins."),
        uint32_t.IN("maxDrawCount", "specifies the maximum number of draws that will be executed. The actual number of executed draw calls is the minimum of the count specified in {@code countBuffer} and {@code maxDrawCount}."),
        uint32_t.IN("stride", "the byte stride between successive sets of draw parameters.")
    )
}