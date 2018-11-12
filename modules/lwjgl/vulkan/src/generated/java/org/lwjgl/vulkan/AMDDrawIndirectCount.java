/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * This extension allows an application to source the number of draw calls for indirect draw calls from a buffer. This enables applications to generate arbitrary amounts of draw commands and execute them without host intervention.
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_AMD_draw_indirect_count}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>34</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VK_KHR_draw_indirect_count">VK_KHR_draw_indirect_count</a> extension</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Daniel Rakos <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_AMD_draw_indirect_count:%20&amp;body=@drakos-amd%20">drakos-amd</a></li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-08-23</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Matthaeus G. Chajdas, AMD</li>
 * <li>Derrick Owens, AMD</li>
 * <li>Graham Sellers, AMD</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Dominik Witczak, AMD</li>
 * </ul></dd>
 * </dl>
 */
public class AMDDrawIndirectCount {

    /** The extension specification version. */
    public static final int VK_AMD_DRAW_INDIRECT_COUNT_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_AMD_DRAW_INDIRECT_COUNT_EXTENSION_NAME = "VK_AMD_draw_indirect_count";

    protected AMDDrawIndirectCount() {
        throw new UnsupportedOperationException();
    }

    static boolean checkCapsDevice(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_AMD_draw_indirect_count") && VK.checkExtension("VK_AMD_draw_indirect_count",
               VK.isSupported(provider, "vkCmdDrawIndirectCountAMD", caps)
            && VK.isSupported(provider, "vkCmdDrawIndexedIndirectCountAMD", caps)
        );
    }

    // --- [ vkCmdDrawIndirectCountAMD ] ---

    /**
     * Perform an indirect draw with the draw count sourced from a buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To record a non-indexed draw call with a draw call count sourced from a buffer, call:</p>
     * 
     * <pre><code>
     * void vkCmdDrawIndirectCountAMD(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBuffer                                    buffer,
     *     VkDeviceSize                                offset,
     *     VkBuffer                                    countBuffer,
     *     VkDeviceSize                                countBufferOffset,
     *     uint32_t                                    maxDrawCount,
     *     uint32_t                                    stride);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkCmdDrawIndirectCountAMD} behaves similarly to {@link VK10#vkCmdDrawIndirect CmdDrawIndirect} except that the draw count is read by the device from a buffer during execution. The command will read an unsigned 32-bit integer from {@code countBuffer} located at {@code countBufferOffset} and use this as the draw count.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>{@code buffer} <b>must</b> have been created with the {@link VK10#VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT} bit set</li>
     * <li>If {@code countBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>{@code countBuffer} <b>must</b> have been created with the {@link VK10#VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT} bit set</li>
     * <li>{@code offset} <b>must</b> be a multiple of 4</li>
     * <li>{@code countBufferOffset} <b>must</b> be a multiple of 4</li>
     * <li>{@code stride} <b>must</b> be a multiple of 4 and <b>must</b> be greater than or equal to {@code sizeof}({@link VkDrawIndirectCommand})</li>
     * <li>If {@code maxDrawCount} is greater than or equal to 1, <code>(stride × (maxDrawCount - 1) + offset + sizeof({@link VkDrawIndirectCommand}))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-drawIndirectFirstInstance">drawIndirectFirstInstance</a> feature is not enabled, all the {@code firstInstance} members of the {@link VkDrawIndirectCommand} structures accessed by this command <b>must</b> be 0</li>
     * <li>The current render pass <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}.</li>
     * <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}.</li>
     * <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, a descriptor set <b>must</b> have been bound to <em>n</em> at {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
     * <li>For each push constant that is statically used by the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, a push constant value <b>must</b> have been set for {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
     * <li>Descriptors in each bound descriptor set, specified via {@code vkCmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the bound {@code VkPipeline} object, specified via {@code vkCmdBindPipeline}</li>
     * <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point&#8217;s interface <b>must</b> have valid buffers bound</li>
     * <li>A valid graphics pipeline <b>must</b> be bound to the current command buffer with {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
     * <li>If the {@code VkPipeline} object bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} requires any dynamic state, that state <b>must</b> have been set on the current command buffer</li>
     * <li>If the count stored in {@code countBuffer} is equal to 1, <code>(offset + sizeof({@link VkDrawIndirectCommand}))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
     * <li>If the count stored in {@code countBuffer} is greater than 1, <code>(stride × (drawCount - 1) + offset + sizeof({@link VkDrawIndirectCommand}))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
     * <li>The count stored in {@code countBuffer} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxDrawIndirectCount}</li>
     * <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
     * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses unnormalized coordinates, it <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link VK10#VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
     * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
     * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} accesses a uniform buffer, it <b>must</b> not access values outside of the range of that buffer specified in the bound descriptor set</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} accesses a storage buffer, it <b>must</b> not access values outside of the range of that buffer specified in the bound descriptor set</li>
     * <li>If a {@code VkImageView} is sampled with {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR} as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}.</li>
     * <li>Image subresources used as attachments in the current render pass <b>must</b> not be accessed in any way other than as an attachment by this command.</li>
     * <li>If the draw is recorded in a render pass instance with multiview enabled, the maximum instance index <b>must</b> be less than or equal to {@link VkPhysicalDeviceMultiviewProperties}{@code ::maxMultiviewInstanceIndex}.</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer, and any pipeline stage in the {@code VkPipeline} object bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} reads from or writes to any image or buffer, that image or buffer <b>must</b> not be a protected image or protected buffer.</li>
     * <li>If {@code commandBuffer} is a protected command buffer, and any pipeline stage in the {@code VkPipeline} object bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} writes to any image or buffer, that image or buffer <b>must</b> not be an unprotected image or unprotected buffer.</li>
     * <li>If {@code commandBuffer} is a protected command buffer, and any pipeline stage other than the framebuffer-space pipeline stages in the {@code VkPipeline} object bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} reads from or writes to any image or buffer, the image or buffer <b>must</b> not be a protected image or protected buffer.</li>
     * <li>If the bound graphics pipeline was created with {@link VkPipelineSampleLocationsStateCreateInfoEXT}{@code ::sampleLocationsEnable} set to {@link VK10#VK_TRUE TRUE} and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the {@link EXTSampleLocations#VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT} bit set</li>
     * <li>Any {@code VkImage} created with a {@link VkImageCreateInfo}{@code ::flags} containing {@link NVCornerSampledImage#VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV IMAGE_CREATE_CORNER_SAMPLED_BIT_NV} sampled as a result of this command <b>must</b> only be sampled using a {@code VkSamplerAddressMode} of {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE}.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>{@code countBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called inside of a render pass instance</li>
     * <li>Each of {@code buffer}, {@code commandBuffer}, and {@code countBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer     the command buffer into which the command is recorded.
     * @param buffer            the buffer containing draw parameters.
     * @param offset            the byte offset into {@code buffer} where parameters begin.
     * @param countBuffer       the buffer containing the draw count.
     * @param countBufferOffset the byte offset into {@code countBuffer} where the draw count begins.
     * @param maxDrawCount      specifies the maximum number of draws that will be executed. The actual number of executed draw calls is the minimum of the count specified in {@code countBuffer} and {@code maxDrawCount}.
     * @param stride            the byte stride between successive sets of draw parameters.
     */
    public static void vkCmdDrawIndirectCountAMD(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset, @NativeType("VkBuffer") long countBuffer, @NativeType("VkDeviceSize") long countBufferOffset, @NativeType("uint32_t") int maxDrawCount, @NativeType("uint32_t") int stride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndirectCountAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJJJV(__functionAddress, commandBuffer.address(), buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride);
    }

    // --- [ vkCmdDrawIndexedIndirectCountAMD ] ---

    /**
     * Perform an indexed indirect draw with the draw count sourced from a buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To record an indexed draw call with a draw call count sourced from a buffer, call:</p>
     * 
     * <pre><code>
     * void vkCmdDrawIndexedIndirectCountAMD(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBuffer                                    buffer,
     *     VkDeviceSize                                offset,
     *     VkBuffer                                    countBuffer,
     *     VkDeviceSize                                countBufferOffset,
     *     uint32_t                                    maxDrawCount,
     *     uint32_t                                    stride);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkCmdDrawIndexedIndirectCountAMD} behaves similarly to {@link VK10#vkCmdDrawIndexedIndirect CmdDrawIndexedIndirect} except that the draw count is read by the device from a buffer during execution. The command will read an unsigned 32-bit integer from {@code countBuffer} located at {@code countBufferOffset} and use this as the draw count.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>{@code buffer} <b>must</b> have been created with the {@link VK10#VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT} bit set</li>
     * <li>If {@code countBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>{@code countBuffer} <b>must</b> have been created with the {@link VK10#VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT} bit set</li>
     * <li>{@code offset} <b>must</b> be a multiple of 4</li>
     * <li>{@code countBufferOffset} <b>must</b> be a multiple of 4</li>
     * <li>{@code stride} <b>must</b> be a multiple of 4 and <b>must</b> be greater than or equal to {@code sizeof}({@link VkDrawIndexedIndirectCommand})</li>
     * <li>If {@code maxDrawCount} is greater than or equal to 1, <code>(stride × (maxDrawCount - 1) + offset + sizeof({@link VkDrawIndexedIndirectCommand}))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-drawIndirectFirstInstance">drawIndirectFirstInstance</a> feature is not enabled, all the {@code firstInstance} members of the {@link VkDrawIndexedIndirectCommand} structures accessed by this command <b>must</b> be 0</li>
     * <li>The current render pass <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}.</li>
     * <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}.</li>
     * <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, a descriptor set <b>must</b> have been bound to <em>n</em> at {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
     * <li>For each push constant that is statically used by the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, a push constant value <b>must</b> have been set for {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#descriptorsets-compatibility">the “Pipeline Layout Compatibility” section</a></li>
     * <li>Descriptors in each bound descriptor set, specified via {@code vkCmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the bound {@code VkPipeline} object, specified via {@code vkCmdBindPipeline}</li>
     * <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point&#8217;s interface <b>must</b> have valid buffers bound</li>
     * <li>A valid graphics pipeline <b>must</b> be bound to the current command buffer with {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
     * <li>If the {@code VkPipeline} object bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} requires any dynamic state, that state <b>must</b> have been set on the current command buffer</li>
     * <li>If count stored in {@code countBuffer} is equal to 1, <code>(offset + sizeof({@link VkDrawIndexedIndirectCommand}))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
     * <li>If count stored in {@code countBuffer} is greater than 1, <code>(stride × (drawCount - 1) + offset + sizeof({@link VkDrawIndexedIndirectCommand}))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
     * <li>{@code drawCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxDrawIndirectCount}</li>
     * <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
     * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses unnormalized coordinates, it <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link VK10#VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
     * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
     * <li>If any {@code VkSampler} object that is accessed from a shader by the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} uses unnormalized coordinates, it <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} accesses a uniform buffer, it <b>must</b> not access values outside of the range of that buffer specified in the bound descriptor set</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-robustBufferAccess">robust buffer access</a> feature is not enabled, and any shader stage in the {@code VkPipeline} object bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} accesses a storage buffer, it <b>must</b> not access values outside of the range of that buffer specified in the bound descriptor set</li>
     * <li>If a {@code VkImageView} is sampled with {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR} as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}.</li>
     * <li>Image subresources used as attachments in the current render pass <b>must</b> not be accessed in any way other than as an attachment by this command.</li>
     * <li>If the draw is recorded in a render pass instance with multiview enabled, the maximum instance index <b>must</b> be less than or equal to {@link VkPhysicalDeviceMultiviewProperties}{@code ::maxMultiviewInstanceIndex}.</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer, and any pipeline stage in the {@code VkPipeline} object bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} reads from or writes to any image or buffer, that image or buffer <b>must</b> not be a protected image or protected buffer.</li>
     * <li>If {@code commandBuffer} is a protected command buffer, and any pipeline stage in the {@code VkPipeline} object bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} writes to any image or buffer, that image or buffer <b>must</b> not be an unprotected image or unprotected buffer.</li>
     * <li>If {@code commandBuffer} is a protected command buffer, and any pipeline stage other than the framebuffer-space pipeline stages in the {@code VkPipeline} object bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} reads from or writes to any image or buffer, the image or buffer <b>must</b> not be a protected image or protected buffer.</li>
     * <li>If the bound graphics pipeline was created with {@link VkPipelineSampleLocationsStateCreateInfoEXT}{@code ::sampleLocationsEnable} set to {@link VK10#VK_TRUE TRUE} and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the {@link EXTSampleLocations#VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT} bit set</li>
     * <li>Any {@code VkImage} created with a {@link VkImageCreateInfo}{@code ::flags} containing {@link NVCornerSampledImage#VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV IMAGE_CREATE_CORNER_SAMPLED_BIT_NV} sampled as a result of this command <b>must</b> only be sampled using a {@code VkSamplerAddressMode} of {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE}.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>{@code countBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called inside of a render pass instance</li>
     * <li>Each of {@code buffer}, {@code commandBuffer}, and {@code countBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer     the command buffer into which the command is recorded.
     * @param buffer            the buffer containing draw parameters.
     * @param offset            the byte offset into {@code buffer} where parameters begin.
     * @param countBuffer       the buffer containing the draw count.
     * @param countBufferOffset the byte offset into {@code countBuffer} where the draw count begins.
     * @param maxDrawCount      specifies the maximum number of draws that will be executed. The actual number of executed draw calls is the minimum of the count specified in {@code countBuffer} and {@code maxDrawCount}.
     * @param stride            the byte stride between successive sets of draw parameters.
     */
    public static void vkCmdDrawIndexedIndirectCountAMD(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset, @NativeType("VkBuffer") long countBuffer, @NativeType("VkDeviceSize") long countBufferOffset, @NativeType("uint32_t") int maxDrawCount, @NativeType("uint32_t") int stride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndexedIndirectCountAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJJJV(__functionAddress, commandBuffer.address(), buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride);
    }

}