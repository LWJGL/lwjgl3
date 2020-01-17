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
 * This extension provides a new mechanism allowing applications to generate collections of geometric primitives via programmable mesh shading. It is an alternative to the existing programmable primitive shading pipeline, which relied on generating input primitives by a fixed function assembler as well as fixed function vertex fetch.
 * 
 * <p>There are new programmable shader types -- the task and mesh shader -- to generate these collections to be processed by fixed-function primitive assembly and rasterization logic. When the task and mesh shaders are dispatched, they replace the standard programmable vertex processing pipeline, including vertex array attribute fetching, vertex shader processing, tessellation, and the geometry shader processing.</p>
 * 
 * <p>This extension also adds support for the following SPIR-V extension in Vulkan:</p>
 * 
 * <ul>
 * <li><a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_mesh_shader.html">{@code SPV_NV_mesh_shader}</a></li>
 * </ul>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_mesh_shader}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>203</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Christoph Kubisch <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_NV_mesh_shader:%20&amp;body=@pixeljetstream%20">pixeljetstream</a></li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-07-19</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Pat Brown, NVIDIA</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Pierre Boudier, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class NVMeshShader {

    /** The extension specification version. */
    public static final int VK_NV_MESH_SHADER_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_MESH_SHADER_EXTENSION_NAME = "VK_NV_mesh_shader";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_NV}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_NV   = 1000202000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_NV = 1000202001;

    /**
     * Extends {@code VkShaderStageFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_SHADER_STAGE_TASK_BIT_NV SHADER_STAGE_TASK_BIT_NV}</li>
     * <li>{@link #VK_SHADER_STAGE_MESH_BIT_NV SHADER_STAGE_MESH_BIT_NV}</li>
     * </ul>
     */
    public static final int
        VK_SHADER_STAGE_TASK_BIT_NV = 0x40,
        VK_SHADER_STAGE_MESH_BIT_NV = 0x80;

    /**
     * Extends {@code VkPipelineStageFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_STAGE_TASK_SHADER_BIT_NV PIPELINE_STAGE_TASK_SHADER_BIT_NV}</li>
     * <li>{@link #VK_PIPELINE_STAGE_MESH_SHADER_BIT_NV PIPELINE_STAGE_MESH_SHADER_BIT_NV}</li>
     * </ul>
     */
    public static final int
        VK_PIPELINE_STAGE_TASK_SHADER_BIT_NV = 0x80000,
        VK_PIPELINE_STAGE_MESH_SHADER_BIT_NV = 0x100000;

    protected NVMeshShader() {
        throw new UnsupportedOperationException();
    }

    static boolean checkCapsDevice(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_NV_mesh_shader") && VK.checkExtension("VK_NV_mesh_shader",
               VK.isSupported(provider, "vkCmdDrawMeshTasksNV", caps)
            && VK.isSupported(provider, "vkCmdDrawMeshTasksIndirectNV", caps)
            && VK.isSupported(provider, "vkCmdDrawMeshTasksIndirectCountNV", caps)
        );
    }

    // --- [ vkCmdDrawMeshTasksNV ] ---

    /**
     * Draw mesh task work items.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To record a draw that uses the mesh pipeline, call:</p>
     * 
     * <pre><code>
     * void vkCmdDrawMeshTasksNV(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    taskCount,
     *     uint32_t                                    firstTask);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>When the command is executed, a global workgroup consisting of {@code taskCount} local workgroups is assembled.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If a {@code VkImageView} is sampled with {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR} as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</li>
     * <li>If a {@code VkImageView} is accessed using atomic operations as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT}</li>
     * <li>If a {@code VkImageView} is sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link EXTFilterCubic#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT}</li>
     * <li>Any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering, as specified by {@link VkFilterCubicImageViewImageFormatPropertiesEXT}{@code ::filterCubic} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
     * <li>Any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} with a reduction mode of either {@link VK12#VK_SAMPLER_REDUCTION_MODE_MIN SAMPLER_REDUCTION_MODE_MIN} or {@link VK12#VK_SAMPLER_REDUCTION_MODE_MAX SAMPLER_REDUCTION_MODE_MAX} as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering together with minmax filtering, as specified by {@link VkFilterCubicImageViewImageFormatPropertiesEXT}{@code ::filterCubicMinmax} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
     * <li>Any {@code VkImage} created with a {@link VkImageCreateInfo}{@code ::flags} containing {@link NVCornerSampledImage#VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV IMAGE_CREATE_CORNER_SAMPLED_BIT_NV} sampled as a result of this command <b>must</b> only be sampled using a {@code VkSamplerAddressMode} of {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE}.</li>
     * <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a descriptor set <b>must</b> have been bound to <em>n</em> at the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>For each push constant that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>Descriptors in each bound descriptor set, specified via {@code vkCmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command</li>
     * <li>A valid pipeline <b>must</b> be bound to the pipeline bind point used by this command</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command requires any dynamic state, that state <b>must</b> have been set for {@code commandBuffer}</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link VK10#VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a uniform buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a storage buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer, any resource accessed by the {@code VkPipeline} object bound to the pipeline bind point used by this command <b>must</b> not be a protected resource</li>
     * <li>The current render pass <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}.</li>
     * <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}.</li>
     * <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
     * <li>Image subresources used as attachments in the current render pass <b>must</b> not be accessed in any way other than as an attachment by this command.</li>
     * <li>If the draw is recorded in a render pass instance with multiview enabled, the maximum instance index <b>must</b> be less than or equal to {@link VkPhysicalDeviceMultiviewProperties}{@code ::maxMultiviewInstanceIndex}.</li>
     * <li>If the bound graphics pipeline was created with {@link VkPipelineSampleLocationsStateCreateInfoEXT}{@code ::sampleLocationsEnable} set to {@link VK10#VK_TRUE TRUE} and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the {@link EXTSampleLocations#VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT} bit set</li>
     * <li>{@code taskCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceMeshShaderPropertiesNV}{@code ::maxDrawMeshTasksCount}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called inside of a render pass instance</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param taskCount     the number of local workgroups to dispatch in the X dimension. Y and Z dimension are implicitly set to one.
     * @param firstTask     the X component of the first workgroup ID.
     */
    public static void vkCmdDrawMeshTasksNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int taskCount, @NativeType("uint32_t") int firstTask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawMeshTasksNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), taskCount, firstTask, __functionAddress);
    }

    // --- [ vkCmdDrawMeshTasksIndirectNV ] ---

    /**
     * Issue an indirect mesh tasks draw into a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To record an indirect mesh tasks draw, call:</p>
     * 
     * <pre><code>
     * void vkCmdDrawMeshTasksIndirectNV(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBuffer                                    buffer,
     *     VkDeviceSize                                offset,
     *     uint32_t                                    drawCount,
     *     uint32_t                                    stride);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkCmdDrawMeshTasksIndirectNV} behaves similarly to {@link #vkCmdDrawMeshTasksNV CmdDrawMeshTasksNV} except that the parameters are read by the device from a buffer during execution. {@code drawCount} draws are executed by the command, with parameters taken from {@code buffer} starting at {@code offset} and increasing by {@code stride} bytes for each successive draw. The parameters of each draw are encoded in an array of {@link VkDrawMeshTasksIndirectCommandNV} structures. If {@code drawCount} is less than or equal to one, {@code stride} is ignored.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If a {@code VkImageView} is sampled with {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR} as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</li>
     * <li>If a {@code VkImageView} is accessed using atomic operations as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT}</li>
     * <li>If a {@code VkImageView} is sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link EXTFilterCubic#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT}</li>
     * <li>Any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering, as specified by {@link VkFilterCubicImageViewImageFormatPropertiesEXT}{@code ::filterCubic} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
     * <li>Any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} with a reduction mode of either {@link VK12#VK_SAMPLER_REDUCTION_MODE_MIN SAMPLER_REDUCTION_MODE_MIN} or {@link VK12#VK_SAMPLER_REDUCTION_MODE_MAX SAMPLER_REDUCTION_MODE_MAX} as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering together with minmax filtering, as specified by {@link VkFilterCubicImageViewImageFormatPropertiesEXT}{@code ::filterCubicMinmax} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
     * <li>Any {@code VkImage} created with a {@link VkImageCreateInfo}{@code ::flags} containing {@link NVCornerSampledImage#VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV IMAGE_CREATE_CORNER_SAMPLED_BIT_NV} sampled as a result of this command <b>must</b> only be sampled using a {@code VkSamplerAddressMode} of {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE}.</li>
     * <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a descriptor set <b>must</b> have been bound to <em>n</em> at the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>For each push constant that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>Descriptors in each bound descriptor set, specified via {@code vkCmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command</li>
     * <li>A valid pipeline <b>must</b> be bound to the pipeline bind point used by this command</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command requires any dynamic state, that state <b>must</b> have been set for {@code commandBuffer}</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link VK10#VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a uniform buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a storage buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer, any resource accessed by the {@code VkPipeline} object bound to the pipeline bind point used by this command <b>must</b> not be a protected resource</li>
     * <li>The current render pass <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}.</li>
     * <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}.</li>
     * <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
     * <li>Image subresources used as attachments in the current render pass <b>must</b> not be accessed in any way other than as an attachment by this command.</li>
     * <li>If the draw is recorded in a render pass instance with multiview enabled, the maximum instance index <b>must</b> be less than or equal to {@link VkPhysicalDeviceMultiviewProperties}{@code ::maxMultiviewInstanceIndex}.</li>
     * <li>If the bound graphics pipeline was created with {@link VkPipelineSampleLocationsStateCreateInfoEXT}{@code ::sampleLocationsEnable} set to {@link VK10#VK_TRUE TRUE} and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the {@link EXTSampleLocations#VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT} bit set</li>
     * <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>{@code buffer} <b>must</b> have been created with the {@link VK10#VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT} bit set</li>
     * <li>{@code offset} <b>must</b> be a multiple of 4</li>
     * <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-multiDrawIndirect">multi-draw indirect</a> feature is not enabled, {@code drawCount} <b>must</b> be 0 or 1</li>
     * <li>{@code drawCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxDrawIndirectCount}</li>
     * <li>If {@code drawCount} is greater than 1, {@code stride} <b>must</b> be a multiple of 4 and <b>must</b> be greater than or equal to {@code sizeof}({@link VkDrawMeshTasksIndirectCommandNV})</li>
     * <li>If {@code drawCount} is equal to 1, <code>(offset sizeof({@link VkDrawMeshTasksIndirectCommandNV}))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
     * <li>If {@code drawCount} is greater than 1, <code>(stride × (drawCount - 1) + offset sizeof({@link VkDrawMeshTasksIndirectCommandNV}))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called inside of a render pass instance</li>
     * <li>Both of {@code buffer}, and {@code commandBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command is recorded.
     * @param buffer        the buffer containing draw parameters.
     * @param offset        the byte offset into {@code buffer} where parameters begin.
     * @param drawCount     the number of draws to execute, and <b>can</b> be zero.
     * @param stride        the byte stride between successive sets of draw parameters.
     */
    public static void vkCmdDrawMeshTasksIndirectNV(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset, @NativeType("uint32_t") int drawCount, @NativeType("uint32_t") int stride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawMeshTasksIndirectNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJV(commandBuffer.address(), buffer, offset, drawCount, stride, __functionAddress);
    }

    // --- [ vkCmdDrawMeshTasksIndirectCountNV ] ---

    /**
     * Perform an indirect mesh tasks draw with the draw count sourced from a buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To record an indirect mesh tasks draw with the draw count sourced from a buffer, call:</p>
     * 
     * <pre><code>
     * void vkCmdDrawMeshTasksIndirectCountNV(
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
     * <p>{@code vkCmdDrawMeshTasksIndirectCountNV} behaves similarly to {@link #vkCmdDrawMeshTasksIndirectNV CmdDrawMeshTasksIndirectNV} except that the draw count is read by the device from a buffer during execution. The command will read an unsigned 32-bit integer from {@code countBuffer} located at {@code countBufferOffset} and use this as the draw count.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If a {@code VkImageView} is sampled with {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR} as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</li>
     * <li>If a {@code VkImageView} is accessed using atomic operations as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT}</li>
     * <li>If a {@code VkImageView} is sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command, then the image view&#8217;s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link EXTFilterCubic#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT}</li>
     * <li>Any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering, as specified by {@link VkFilterCubicImageViewImageFormatPropertiesEXT}{@code ::filterCubic} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
     * <li>Any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} with a reduction mode of either {@link VK12#VK_SAMPLER_REDUCTION_MODE_MIN SAMPLER_REDUCTION_MODE_MIN} or {@link VK12#VK_SAMPLER_REDUCTION_MODE_MAX SAMPLER_REDUCTION_MODE_MAX} as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering together with minmax filtering, as specified by {@link VkFilterCubicImageViewImageFormatPropertiesEXT}{@code ::filterCubicMinmax} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
     * <li>Any {@code VkImage} created with a {@link VkImageCreateInfo}{@code ::flags} containing {@link NVCornerSampledImage#VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV IMAGE_CREATE_CORNER_SAMPLED_BIT_NV} sampled as a result of this command <b>must</b> only be sampled using a {@code VkSamplerAddressMode} of {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE}.</li>
     * <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a descriptor set <b>must</b> have been bound to <em>n</em> at the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>For each push constant that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>Descriptors in each bound descriptor set, specified via {@code vkCmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command</li>
     * <li>A valid pipeline <b>must</b> be bound to the pipeline bind point used by this command</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command requires any dynamic state, that state <b>must</b> have been set for {@code commandBuffer}</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link VK10#VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a uniform buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a storage buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer, any resource accessed by the {@code VkPipeline} object bound to the pipeline bind point used by this command <b>must</b> not be a protected resource</li>
     * <li>The current render pass <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}.</li>
     * <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}.</li>
     * <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
     * <li>Image subresources used as attachments in the current render pass <b>must</b> not be accessed in any way other than as an attachment by this command.</li>
     * <li>If the draw is recorded in a render pass instance with multiview enabled, the maximum instance index <b>must</b> be less than or equal to {@link VkPhysicalDeviceMultiviewProperties}{@code ::maxMultiviewInstanceIndex}.</li>
     * <li>If the bound graphics pipeline was created with {@link VkPipelineSampleLocationsStateCreateInfoEXT}{@code ::sampleLocationsEnable} set to {@link VK10#VK_TRUE TRUE} and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the {@link EXTSampleLocations#VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT} bit set</li>
     * <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>{@code buffer} <b>must</b> have been created with the {@link VK10#VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT} bit set</li>
     * <li>{@code offset} <b>must</b> be a multiple of 4</li>
     * <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
     * <li>If {@code countBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>{@code countBuffer} <b>must</b> have been created with the {@link VK10#VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT} bit set</li>
     * <li>{@code countBufferOffset} <b>must</b> be a multiple of 4</li>
     * <li>The count stored in {@code countBuffer} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxDrawIndirectCount}</li>
     * <li>{@code stride} <b>must</b> be a multiple of 4 and <b>must</b> be greater than or equal to {@code sizeof}({@link VkDrawMeshTasksIndirectCommandNV})</li>
     * <li>If {@code maxDrawCount} is greater than or equal to 1, <code>(stride × (maxDrawCount - 1) + offset + sizeof({@link VkDrawMeshTasksIndirectCommandNV}))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
     * <li>If the count stored in {@code countBuffer} is equal to 1, <code>(offset sizeof({@link VkDrawMeshTasksIndirectCommandNV}))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
     * <li>If the count stored in {@code countBuffer} is greater than 1, <code>(stride × (drawCount - 1) + offset + sizeof({@link VkDrawMeshTasksIndirectCommandNV}))</code> <b>must</b> be less than or equal to the size of {@code buffer}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>{@code countBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
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
    public static void vkCmdDrawMeshTasksIndirectCountNV(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset, @NativeType("VkBuffer") long countBuffer, @NativeType("VkDeviceSize") long countBufferOffset, @NativeType("uint32_t") int maxDrawCount, @NativeType("uint32_t") int stride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawMeshTasksIndirectCountNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJJJV(commandBuffer.address(), buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride, __functionAddress);
    }

}