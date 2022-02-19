/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension allows the device to generate a number of critical graphics commands for command buffers.
 * 
 * <p>When rendering a large number of objects, the device can be leveraged to implement a number of critical functions, like updating matrices, or implementing occlusion culling, frustum culling, front to back sorting, etc. Implementing those on the device does not require any special extension, since an application is free to define its own data structures, and just process them using shaders.</p>
 * 
 * <p>However, if the application desires to quickly kick off the rendering of the final stream of objects, then unextended Vulkan forces the application to read back the processed stream and issue graphics command from the host. For very large scenes, the synchronization overhead and cost to generate the command buffer can become the bottleneck. This extension allows an application to generate a device side stream of state changes and commands, and convert it efficiently into a command buffer without having to read it back to the host.</p>
 * 
 * <p>Furthermore, it allows incremental changes to such command buffers by manipulating only partial sections of a command stream — for example pipeline bindings. Unextended Vulkan requires re-creation of entire command buffers in such a scenario, or updates synchronized on the host.</p>
 * 
 * <p>The intended usage for this extension is for the application to:</p>
 * 
 * <ul>
 * <li>create {@code VkBuffer} objects and retrieve physical addresses from them via {@link EXTBufferDeviceAddress#vkGetBufferDeviceAddressEXT GetBufferDeviceAddressEXT}</li>
 * <li>create a graphics pipeline using {@link VkGraphicsPipelineShaderGroupsCreateInfoNV} for the ability to change shaders on the device.</li>
 * <li>create a {@code VkIndirectCommandsLayoutNV}, which lists the {@code VkIndirectCommandsTokenTypeNV} it wants to dynamically execute as an atomic command sequence. This step likely involves some internal device code compilation, since the intent is for the GPU to generate the command buffer in the pipeline.</li>
 * <li>fill the input stream buffers with the data for each of the inputs it needs. Each input is an array that will be filled with token-dependent data.</li>
 * <li>set up a preprocess {@code VkBuffer} that uses memory according to the information retrieved via {@link #vkGetGeneratedCommandsMemoryRequirementsNV GetGeneratedCommandsMemoryRequirementsNV}.</li>
 * <li>optionally preprocess the generated content using {@link #vkCmdPreprocessGeneratedCommandsNV CmdPreprocessGeneratedCommandsNV}, for example on an asynchronous compute queue, or for the purpose of re-using the data in multiple executions.</li>
 * <li>call {@link #vkCmdExecuteGeneratedCommandsNV CmdExecuteGeneratedCommandsNV} to create and execute the actual device commands for all sequences based on the inputs provided.</li>
 * </ul>
 * 
 * <p>For each draw in a sequence, the following can be specified:</p>
 * 
 * <ul>
 * <li>a different shader group</li>
 * <li>a number of vertex buffer bindings</li>
 * <li>a different index buffer, with an optional dynamic offset and index type</li>
 * <li>a number of different push constants</li>
 * <li>a flag that encodes the primitive winding</li>
 * </ul>
 * 
 * <p>While the GPU can be faster than a CPU to generate the commands, it will not happen asynchronously to the device, therefore the primary use-case is generating “{@code less}” total work (occlusion culling, classification to use specialized shaders, etc.).</p>
 * 
 * <h5>Example Code</h5>
 * 
 * <p>Open-Source samples illustrating the usage of the extension can be found at the following location (may not yet exist at time of writing):</p>
 * 
 * <p><a target="_blank" href="https://github.com/nvpro-samples/vk_device_generated_cmds">https://github.com/nvpro-samples/vk_device_generated_cmds</a></p>
 * 
 * <h5>VK_NV_device_generated_commands</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_device_generated_commands}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>278</dd>
 * <dt><b>Revision</b></dt>
 * <dd>3</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.1</li>
 * <li>Requires {@link KHRBufferDeviceAddress VK_KHR_buffer_device_address}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Christoph Kubisch <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_device_generated_commands]%20@pixeljetstream%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_device_generated_commands%20extension%3E%3E">pixeljetstream</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2020-02-20</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires Vulkan 1.1</li>
 * <li>This extension requires {@code VK_EXT_buffer_device_address} or {@code VK_KHR_buffer_device_address} or Vulkan 1.2 for the ability to bind vertex and index buffers on the device.</li>
 * <li>This extension interacts with {@code VK_NV_mesh_shader}. If the latter extension is not supported, remove the command token to initiate mesh tasks drawing in this extension.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Christoph Kubisch, NVIDIA</li>
 * <li>Pierre Boudier, NVIDIA</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Eric Werness, NVIDIA</li>
 * <li>Yuriy O’Donnell, Epic Games</li>
 * <li>Baldur Karlsson, Valve</li>
 * <li>Mathias Schott, NVIDIA</li>
 * <li>Tyson Smith, NVIDIA</li>
 * <li>Ingo Esser, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class NVDeviceGeneratedCommands {

    /** The extension specification version. */
    public static final int VK_NV_DEVICE_GENERATED_COMMANDS_SPEC_VERSION = 3;

    /** The extension name. */
    public static final String VK_NV_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME = "VK_NV_device_generated_commands";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_GRAPHICS_SHADER_GROUP_CREATE_INFO_NV STRUCTURE_TYPE_GRAPHICS_SHADER_GROUP_CREATE_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_NV STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_NV}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_NV = 1000277000,
        VK_STRUCTURE_TYPE_GRAPHICS_SHADER_GROUP_CREATE_INFO_NV                    = 1000277001,
        VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV          = 1000277002,
        VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV                       = 1000277003,
        VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV                 = 1000277004,
        VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV                              = 1000277005,
        VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_NV          = 1000277006,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_NV   = 1000277007;

    /** Extends {@code VkPipelineCreateFlagBits}. */
    public static final int VK_PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV = 0x40000;

    /** Extends {@code VkPipelineStageFlagBits}. */
    public static final int VK_PIPELINE_STAGE_COMMAND_PREPROCESS_BIT_NV = 0x20000;

    /**
     * Extends {@code VkAccessFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_COMMAND_PREPROCESS_READ_BIT_NV ACCESS_COMMAND_PREPROCESS_READ_BIT_NV}</li>
     * <li>{@link #VK_ACCESS_COMMAND_PREPROCESS_WRITE_BIT_NV ACCESS_COMMAND_PREPROCESS_WRITE_BIT_NV}</li>
     * </ul>
     */
    public static final int
        VK_ACCESS_COMMAND_PREPROCESS_READ_BIT_NV  = 0x20000,
        VK_ACCESS_COMMAND_PREPROCESS_WRITE_BIT_NV = 0x40000;

    /** Extends {@code VkObjectType}. */
    public static final int VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NV = 1000277000;

    /**
     * VkIndirectStateFlagBitsNV - Bitmask specifiying state that can be altered on the device
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_INDIRECT_STATE_FLAG_FRONTFACE_BIT_NV INDIRECT_STATE_FLAG_FRONTFACE_BIT_NV} allows to toggle the {@code VkFrontFace} rasterization state for subsequent draw operations.</li>
     * </ul>
     */
    public static final int VK_INDIRECT_STATE_FLAG_FRONTFACE_BIT_NV = 0x1;

    /**
     * VkIndirectCommandsTokenTypeNV - Enum specifying token commands
     * 
     * <h5>Description</h5>
     * 
     * <h6>Supported indirect command tokens</h6>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>Token type</th><th>Equivalent command</th></tr></thead>
     * <tbody>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_SHADER_GROUP_NV INDIRECT_COMMANDS_TOKEN_TYPE_SHADER_GROUP_NV}</td><td>{@link #vkCmdBindPipelineShaderGroupNV CmdBindPipelineShaderGroupNV}</td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_STATE_FLAGS_NV INDIRECT_COMMANDS_TOKEN_TYPE_STATE_FLAGS_NV}</td><td>-</td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NV INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NV}</td><td>{@link VK10#vkCmdBindIndexBuffer CmdBindIndexBuffer}</td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NV INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NV}</td><td>{@link VK10#vkCmdBindVertexBuffers CmdBindVertexBuffers}</td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV}</td><td>{@link VK10#vkCmdPushConstants CmdPushConstants}</td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NV INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NV}</td><td>{@link VK10#vkCmdDrawIndexedIndirect CmdDrawIndexedIndirect}</td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NV INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NV}</td><td>{@link VK10#vkCmdDrawIndirect CmdDrawIndirect}</td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_TASKS_NV INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_TASKS_NV}</td><td>{@link NVMeshShader#vkCmdDrawMeshTasksIndirectNV CmdDrawMeshTasksIndirectNV}</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkIndirectCommandsLayoutTokenNV}</p>
     */
    public static final int
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_SHADER_GROUP_NV  = 0,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_STATE_FLAGS_NV   = 1,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NV  = 2,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NV = 3,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV = 4,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NV  = 5,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NV          = 6,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_TASKS_NV    = 7;

    /**
     * VkIndirectCommandsLayoutUsageFlagBitsNV - Bitmask specifying allowed usage of an indirect commands layout
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_NV INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_NV} specifies that the layout is always used with the manual preprocessing step through calling {@link #vkCmdPreprocessGeneratedCommandsNV CmdPreprocessGeneratedCommandsNV} and executed by {@link #vkCmdExecuteGeneratedCommandsNV CmdExecuteGeneratedCommandsNV} with {@code isPreprocessed} set to {@link VK10#VK_TRUE TRUE}.</li>
     * <li>{@link #VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NV INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NV} specifies that the input data for the sequences is not implicitly indexed from 0..sequencesUsed but a user provided {@code VkBuffer} encoding the index is provided.</li>
     * <li>{@link #VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NV INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NV} specifies that the processing of sequences <b>can</b> happen at an implementation-dependent order, which is not: guaranteed to be coherent using the same input data.</li>
     * </ul>
     */
    public static final int
        VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_NV = 0x1,
        VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NV   = 0x2,
        VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NV = 0x4;

    protected NVDeviceGeneratedCommands() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetGeneratedCommandsMemoryRequirementsNV ] ---

    /** Unsafe version of: {@link #vkGetGeneratedCommandsMemoryRequirementsNV GetGeneratedCommandsMemoryRequirementsNV} */
    public static void nvkGetGeneratedCommandsMemoryRequirementsNV(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetGeneratedCommandsMemoryRequirementsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    /**
     * Retrieve the buffer allocation requirements for generated commands.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The generation of commands on the device requires a {@code preprocess} buffer. To retrieve the memory size and alignment requirements of a particular execution state call:</p>
     * 
     * <pre><code>
     * void vkGetGeneratedCommandsMemoryRequirementsNV(
     *     VkDevice                                    device,
     *     const VkGeneratedCommandsMemoryRequirementsInfoNV* pInfo,
     *     VkMemoryRequirements2*                      pMemoryRequirements);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-deviceGeneratedCommands">{@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV}{@code ::deviceGeneratedCommands}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkGeneratedCommandsMemoryRequirementsInfoNV} structure</li>
     * <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a {@link VkMemoryRequirements2} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkGeneratedCommandsMemoryRequirementsInfoNV}, {@link VkMemoryRequirements2}</p>
     *
     * @param device              the logical device that owns the buffer.
     * @param pInfo               a pointer to a {@link VkGeneratedCommandsMemoryRequirementsInfoNV} structure containing parameters required for the memory requirements query.
     * @param pMemoryRequirements a pointer to a {@link VkMemoryRequirements2} structure in which the memory requirements of the buffer object are returned.
     */
    public static void vkGetGeneratedCommandsMemoryRequirementsNV(VkDevice device, @NativeType("VkGeneratedCommandsMemoryRequirementsInfoNV const *") VkGeneratedCommandsMemoryRequirementsInfoNV pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetGeneratedCommandsMemoryRequirementsNV(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkCmdPreprocessGeneratedCommandsNV ] ---

    /** Unsafe version of: {@link #vkCmdPreprocessGeneratedCommandsNV CmdPreprocessGeneratedCommandsNV} */
    public static void nvkCmdPreprocessGeneratedCommandsNV(VkCommandBuffer commandBuffer, long pGeneratedCommandsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPreprocessGeneratedCommandsNV;
        if (CHECKS) {
            check(__functionAddress);
            VkGeneratedCommandsInfoNV.validate(pGeneratedCommandsInfo);
        }
        callPPV(commandBuffer.address(), pGeneratedCommandsInfo, __functionAddress);
    }

    /**
     * Performs preprocessing for generated commands.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Commands <b>can</b> be preprocessed prior execution using the following command:</p>
     * 
     * <pre><code>
     * void vkCmdPreprocessGeneratedCommandsNV(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkGeneratedCommandsInfoNV*            pGeneratedCommandsInfo);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
     * <li>{@code pGeneratedCommandsInfo}`s {@code indirectCommandsLayout} <b>must</b> have been created with the {@link #VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_NV INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_NV} bit set</li>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-deviceGeneratedCommands">{@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV}{@code ::deviceGeneratedCommands}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pGeneratedCommandsInfo} <b>must</b> be a valid pointer to a valid {@link VkGeneratedCommandsInfoNV} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics Compute</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkGeneratedCommandsInfoNV}</p>
     *
     * @param commandBuffer          the command buffer which does the preprocessing.
     * @param pGeneratedCommandsInfo a pointer to a {@link VkGeneratedCommandsInfoNV} structure containing parameters affecting the preprocessing step.
     */
    public static void vkCmdPreprocessGeneratedCommandsNV(VkCommandBuffer commandBuffer, @NativeType("VkGeneratedCommandsInfoNV const *") VkGeneratedCommandsInfoNV pGeneratedCommandsInfo) {
        nvkCmdPreprocessGeneratedCommandsNV(commandBuffer, pGeneratedCommandsInfo.address());
    }

    // --- [ vkCmdExecuteGeneratedCommandsNV ] ---

    /** Unsafe version of: {@link #vkCmdExecuteGeneratedCommandsNV CmdExecuteGeneratedCommandsNV} */
    public static void nvkCmdExecuteGeneratedCommandsNV(VkCommandBuffer commandBuffer, int isPreprocessed, long pGeneratedCommandsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdExecuteGeneratedCommandsNV;
        if (CHECKS) {
            check(__functionAddress);
            VkGeneratedCommandsInfoNV.validate(pGeneratedCommandsInfo);
        }
        callPPV(commandBuffer.address(), isPreprocessed, pGeneratedCommandsInfo, __functionAddress);
    }

    /**
     * Generate and execute commands on the device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The actual generation of commands as well as their execution on the device is handled as single action with:</p>
     * 
     * <pre><code>
     * void vkCmdExecuteGeneratedCommandsNV(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    isPreprocessed,
     *     const VkGeneratedCommandsInfoNV*            pGeneratedCommandsInfo);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If a {@code VkSampler} created with {@code magFilter} or {@code minFilter} equal to {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR} and {@code compareEnable} equal to {@link VK10#VK_FALSE FALSE} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</li>
     * <li>If a {@code VkSampler} created with {@code mipmapMode} equal to {@link VK10#VK_SAMPLER_MIPMAP_MODE_LINEAR SAMPLER_MIPMAP_MODE_LINEAR} and {@code compareEnable} equal to {@link VK10#VK_FALSE FALSE} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</li>
     * <li>If a {@code VkImageView} is sampled with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-depth-compare-operation">depth comparison</a>, the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT}</li>
     * <li>If a {@code VkImageView} is accessed using atomic operations as a result of this command, then the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT}</li>
     * <li>If a {@code VkImageView} is sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command, then the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link EXTFilterCubic#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT}</li>
     * <li>Any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering, as specified by {@link VkFilterCubicImageViewImageFormatPropertiesEXT}{@code ::filterCubic} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
     * <li>Any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} with a reduction mode of either {@link VK12#VK_SAMPLER_REDUCTION_MODE_MIN SAMPLER_REDUCTION_MODE_MIN} or {@link VK12#VK_SAMPLER_REDUCTION_MODE_MAX SAMPLER_REDUCTION_MODE_MAX} as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering together with minmax filtering, as specified by {@link VkFilterCubicImageViewImageFormatPropertiesEXT}{@code ::filterCubicMinmax} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
     * <li>Any {@code VkImage} created with a {@link VkImageCreateInfo}{@code ::flags} containing {@link NVCornerSampledImage#VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV IMAGE_CREATE_CORNER_SAMPLED_BIT_NV} sampled as a result of this command <b>must</b> only be sampled using a {@code VkSamplerAddressMode} of {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE}</li>
     * <li>Any {@code VkImageView} or {@code VkBufferView} being written as a storage image or storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown} then the view’s format feature <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT}</li>
     * <li>Any {@code VkImageView} or {@code VkBufferView} being read as a storage image or storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown} then the view’s format feature <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT}</li>
     * <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a descriptor set <b>must</b> have been bound to <em>n</em> at the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-maintenance4">{@code maintenance4}</a> feature is not enabled, then for each push constant that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>Descriptors in each bound descriptor set, specified via {@code vkCmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command</li>
     * <li>A valid pipeline <b>must</b> be bound to the pipeline bind point used by this command</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command requires any dynamic state, that state <b>must</b> have been set or inherited (if the {@link NVInheritedViewportScissor VK_NV_inherited_viewport_scissor} extension is enabled) for {@code commandBuffer}, and done so after any previously bound pipeline with the corresponding state not specified as dynamic</li>
     * <li>There <b>must</b> not have been any calls to dynamic state setting commands for any state not specified as dynamic in the {@code VkPipeline} object bound to the pipeline bind point used by this command, since that pipeline was bound</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link VK10#VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a uniform buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a storage buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, any resource accessed by the {@code VkPipeline} object bound to the pipeline bind point used by this command <b>must</b> not be a protected resource</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} or {@code VkImageView} object that enables <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> only be used with {@code OpImageSample*} or {@code OpImageSparseSample*} instructions</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} or {@code VkImageView} object that enables <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> not use the {@code ConstOffset} and {@code Offset} operands</li>
     * <li>If a {@code VkImageView} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have at least as many components as the image view’s format</li>
     * <li>If a {@code VkBufferView} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have at least as many components as the buffer view’s format</li>
     * <li>If a {@code VkImageView} with a {@code VkFormat} that has a 64-bit component width is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 64</li>
     * <li>If a {@code VkImageView} with a {@code VkFormat} that has a component width less than 64-bit is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 32</li>
     * <li>If a {@code VkBufferView} with a {@code VkFormat} that has a 64-bit component width is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 64</li>
     * <li>If a {@code VkBufferView} with a {@code VkFormat} that has a component width less than 64-bit is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 32</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-sparseImageInt64Atomics">{@code sparseImageInt64Atomics}</a> feature is not enabled, {@code VkImage} objects created with the {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} flag <b>must</b> not be accessed by atomic instructions through an {@code OpTypeImage} with a {@code SampledType} with a {@code Width} of 64 by this command</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-sparseImageInt64Atomics">{@code sparseImageInt64Atomics}</a> feature is not enabled, {@code VkBuffer} objects created with the {@link VK10#VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT BUFFER_CREATE_SPARSE_RESIDENCY_BIT} flag <b>must</b> not be accessed by atomic instructions through an {@code OpTypeImage} with a {@code SampledType} with a {@code Width} of 64 by this command</li>
     * <li>The current render pass <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
     * <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
     * <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
     * <li>Memory backing image subresources used as attachments in the current render pass <b>must</b> not be written in any way other than as an attachment by this command</li>
     * <li>If any recorded command in the current subpass will write to an image subresource as an attachment, this command <b>must</b> not read from the memory backing that image subresource in any other way than as an attachment</li>
     * <li>If any recorded command in the current subpass will read from an image subresource used as an attachment in any way other than as an attachment, this command <b>must</b> not write to that image subresource as an attachment</li>
     * <li>If the draw is recorded in a render pass instance with multiview enabled, the maximum instance index <b>must</b> be less than or equal to {@link VkPhysicalDeviceMultiviewProperties}{@code ::maxMultiviewInstanceIndex}</li>
     * <li>If the bound graphics pipeline was created with {@link VkPipelineSampleLocationsStateCreateInfoEXT}{@code ::sampleLocationsEnable} set to {@link VK10#VK_TRUE TRUE} and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the {@link EXTSampleLocations#VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT} bit set</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, but not the {@link VK13#VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT DYNAMIC_STATE_SCISSOR_WITH_COUNT} dynamic state enabled, then {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount} <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> match the {@link VkPipelineViewportStateCreateInfo}{@code ::scissorCount} of the pipeline</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT DYNAMIC_STATE_SCISSOR_WITH_COUNT} dynamic state enabled, but not the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, then {@link VK13#vkCmdSetScissorWithCount CmdSetScissorWithCount} <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code scissorCount} parameter of {@code vkCmdSetScissorWithCount} <b>must</b> match the {@link VkPipelineViewportStateCreateInfo}{@code ::viewportCount} of the pipeline</li>
     * <li>If the bound graphics pipeline state was created with both the {@link VK13#VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT DYNAMIC_STATE_SCISSOR_WITH_COUNT} and {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic states enabled then both {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount} and {@link VK13#vkCmdSetScissorWithCount CmdSetScissorWithCount} <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> match the {@code scissorCount} parameter of {@code vkCmdSetScissorWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, but not the {@link NVClipSpaceWScaling#VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV DYNAMIC_STATE_VIEWPORT_W_SCALING_NV} dynamic state enabled, then the bound graphics pipeline <b>must</b> have been created with {@link VkPipelineViewportWScalingStateCreateInfoNV}{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} and {@link NVClipSpaceWScaling#VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV DYNAMIC_STATE_VIEWPORT_W_SCALING_NV} dynamic states enabled then the {@code viewportCount} parameter in the last call to {@link NVClipSpaceWScaling#vkCmdSetViewportWScalingNV CmdSetViewportWScalingNV} <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, but not the {@link NVShadingRateImage#VK_DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV} dynamic state enabled, then the bound graphics pipeline <b>must</b> have been created with {@link VkPipelineViewportShadingRateImageStateCreateInfoNV}{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} and {@link NVShadingRateImage#VK_DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV} dynamic states enabled then the {@code viewportCount} parameter in the last call to {@link NVShadingRateImage#vkCmdSetViewportShadingRatePaletteNV CmdSetViewportShadingRatePaletteNV} <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled and a {@link VkPipelineViewportSwizzleStateCreateInfoNV} structure chained from {@code VkPipelineVieportCreateInfo}, then the bound graphics pipeline <b>must</b> have been created with {@link VkPipelineViewportSwizzleStateCreateInfoNV}{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled and a {@link VkPipelineViewportExclusiveScissorStateCreateInfoNV} structure chained from {@code VkPipelineVieportCreateInfo}, then the bound graphics pipeline <b>must</b> have been created with {@link VkPipelineViewportExclusiveScissorStateCreateInfoNV}{@code ::exclusiveScissorCount} greater or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE} dynamic state enabled then {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_DEPTH_BIAS_ENABLE DYNAMIC_STATE_DEPTH_BIAS_ENABLE} dynamic state enabled then {@link VK13#vkCmdSetDepthBiasEnable CmdSetDepthBiasEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState2#VK_DYNAMIC_STATE_LOGIC_OP_EXT DYNAMIC_STATE_LOGIC_OP_EXT} dynamic state enabled then {@link EXTExtendedDynamicState2#vkCmdSetLogicOpEXT CmdSetLogicOpEXT} <b>must</b> have been called in the current command buffer prior to this drawing command and the {@code logicOp} <b>must</b> be a valid {@code VkLogicOp} value</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-primitiveFragmentShadingRateWithMultipleViewports">{@code primitiveFragmentShadingRateWithMultipleViewports}</a> limit is not supported, the bound graphics pipeline was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, and any of the shader stages of the bound graphics pipeline write to the {@code PrimitiveShadingRateKHR} built-in, then {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount} <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> be 1</li>
     * <li>If rasterization is not disabled in the bound graphics pipeline, then for each color attachment in the subpass, if the corresponding image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> do not contain {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT}, then the {@code blendEnable} member of the corresponding element of the {@code pAttachments} member of {@code pColorBlendState} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
     * <li>If rasterization is not disabled in the bound graphics pipeline, and neither the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} nor the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extensions are enabled, then {@link VkPipelineMultisampleStateCreateInfo}{@code ::rasterizationSamples} <b>must</b> be the same as the current subpass color and/or depth/stencil attachments</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pDepthAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pDepthAttachment} is {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, this command <b>must</b> not write any values to the depth attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pStencilAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pStencilAttachment} is {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, this command <b>must</b> not write any values to the stencil attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pDepthAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pDepthAttachment} is {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}, this command <b>must</b> not write any values to the depth attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pStencilAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pStencilAttachment} is {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL}, this command <b>must</b> not write any values to the stencil attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pDepthAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pDepthAttachment} is {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, this command <b>must</b> not write any values to the depth attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pStencilAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pStencilAttachment} is {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}, this command <b>must</b> not write any values to the stencil attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound graphics pipeline <b>must</b> have been created with a {@link VkPipelineRenderingCreateInfo}{@code ::viewMask} equal to {@link VkRenderingInfo}{@code ::viewMask}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound graphics pipeline <b>must</b> have been created with a {@link VkPipelineRenderingCreateInfo}{@code ::colorAttachmentCount} equal to {@link VkRenderingInfo}{@code ::colorAttachmentCount}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and {@link VkRenderingInfo}{@code ::colorAttachmentCount} greater than 0, then each element of the {@link VkRenderingInfo}{@code ::pColorAttachments} array with a {@code imageView} not equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> have been created with a {@code VkFormat} equal to the corresponding element of {@link VkPipelineRenderingCreateInfo}{@code ::pColorAttachmentFormats} used to create the currently bound graphics pipeline</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and {@link VkRenderingInfo}{@code ::pDepthAttachment→pname}:imageView was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@link VkPipelineRenderingCreateInfo}{@code ::depthAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to the {@code VkFormat} used to create {@link VkRenderingInfo}{@code ::pDepthAttachment→pname}:imageView</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and {@link VkRenderingInfo}{@code ::pStencilAttachment→pname}:imageView was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@link VkPipelineRenderingCreateInfo}{@code ::stencilAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to the {@code VkFormat} used to create {@link VkRenderingInfo}{@code ::pStencilAttachment→pname}:imageView</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and {@link VkRenderingFragmentShadingRateAttachmentInfoKHR}{@code ::imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the currently bound graphics pipeline <b>must</b> have been created with {@link KHRDynamicRendering#VK_PIPELINE_CREATE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR PIPELINE_CREATE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and {@link VkRenderingFragmentDensityMapAttachmentInfoEXT}{@code ::imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the currently bound graphics pipeline <b>must</b> have been created with {@link KHRDynamicRendering#VK_PIPELINE_CREATE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT PIPELINE_CREATE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT}</li>
     * <li>If the currently bound pipeline was created with a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} with a {@link VkRenderingInfo}{@code ::colorAttachmentCount} parameter greater than 0, then each element of the {@link VkRenderingInfo}{@code ::pColorAttachments} array with a {@code imageView} not equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> have been created with a sample count equal to the corresponding element of the {@code pColorAttachmentSamples} member of {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} used to create the currently bound graphics pipeline</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound pipeline was created with a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and {@link VkRenderingInfo}{@code ::pDepthAttachment→pname}:imageView was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of the {@code depthStencilAttachmentSamples} member of {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} used to create the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create {@link VkRenderingInfo}{@code ::pDepthAttachment→pname}:imageView</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound pipeline was created with a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and {@link VkRenderingInfo}{@code ::pStencilAttachment→pname}:imageView was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of the {@code depthStencilAttachmentSamples} member of {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} used to create the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create {@link VkRenderingInfo}{@code ::pStencilAttachment→pname}:imageView</li>
     * <li>If the currently bound pipeline was created without a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} with a {@link VkRenderingInfo}{@code ::colorAttachmentCount} parameter greater than 0, then each element of the {@link VkRenderingInfo}{@code ::pColorAttachments} array with a {@code imageView} not equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> have been created with a sample count equal to the value of {@link VkPipelineMultisampleStateCreateInfo}{@code ::rasterizationSamples} used to create the currently bound graphics pipeline</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound pipeline was created without a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and {@link VkRenderingInfo}{@code ::pDepthAttachment→pname}:imageView was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@link VkPipelineMultisampleStateCreateInfo}{@code ::rasterizationSamples} used to create the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create {@link VkRenderingInfo}{@code ::pDepthAttachment→pname}:imageView</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound pipeline was created without a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and {@link VkRenderingInfo}{@code ::pStencilAttachment→pname}:imageView was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@link VkPipelineMultisampleStateCreateInfo}{@code ::rasterizationSamples} used to create the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create {@link VkRenderingInfo}{@code ::pStencilAttachment→pname}:imageView</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound pipeline <b>must</b> have been created with a {@link VkGraphicsPipelineCreateInfo}{@code ::renderPass} equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * </ul>
     * 
     * <ul>
     * <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point’s interface <b>must</b> have either valid or {@link VK10#VK_NULL_HANDLE NULL_HANDLE} buffers bound</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-nullDescriptor">nullDescriptor</a> feature is not enabled, all vertex input bindings accessed via vertex input variables declared in the vertex shader entry point’s interface <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>For a given vertex buffer binding, any attribute data fetched <b>must</b> be entirely contained within the corresponding vertex buffer binding, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#fxvertex-input">Vertex Input Description</a></li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState#VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY_EXT DYNAMIC_STATE_PRIMITIVE_TOPOLOGY_EXT} dynamic state enabled then {@link EXTExtendedDynamicState#vkCmdSetPrimitiveTopologyEXT CmdSetPrimitiveTopologyEXT} <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code primitiveTopology} parameter of {@code vkCmdSetPrimitiveTopologyEXT} <b>must</b> be of the same <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#drawing-primitive-topology-class">topology class</a> as the pipeline {@link VkPipelineInputAssemblyStateCreateInfo}{@code ::topology} state</li>
     * <li>If the bound graphics pipeline was created with both the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} and {@link EXTExtendedDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT} dynamic states enabled, then {@link EXTVertexInputDynamicState#vkCmdSetVertexInputEXT CmdSetVertexInputEXT} <b>must</b> have been called in the current command buffer prior to this draw command</li>
     * <li>If the bound graphics pipeline was created with the {@link EXTExtendedDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT} dynamic state enabled, but not the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} dynamic state enabled, then {@link EXTExtendedDynamicState#vkCmdBindVertexBuffers2EXT CmdBindVertexBuffers2EXT} <b>must</b> have been called in the current command buffer prior to this draw command, and the {@code pStrides} parameter of {@link EXTExtendedDynamicState#vkCmdBindVertexBuffers2EXT CmdBindVertexBuffers2EXT} <b>must</b> not be {@code NULL}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} dynamic state enabled, then {@link EXTVertexInputDynamicState#vkCmdSetVertexInputEXT CmdSetVertexInputEXT} <b>must</b> have been called in the current command buffer prior to this draw command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState2#VK_DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT} dynamic state enabled then {@link EXTExtendedDynamicState2#vkCmdSetPatchControlPointsEXT CmdSetPatchControlPointsEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState2#VK_DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE_EXT DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE_EXT} dynamic state enabled then {@link EXTExtendedDynamicState2#vkCmdSetPrimitiveRestartEnableEXT CmdSetPrimitiveRestartEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>The bound graphics pipeline <b>must</b> not have been created with the {@link VkPipelineShaderStageCreateInfo}{@code ::stage} member of an element of {@link VkGraphicsPipelineCreateInfo}{@code ::pStages} set to {@link NVMeshShader#VK_SHADER_STAGE_TASK_BIT_NV SHADER_STAGE_TASK_BIT_NV} or {@link NVMeshShader#VK_SHADER_STAGE_MESH_BIT_NV SHADER_STAGE_MESH_BIT_NV}</li>
     * <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
     * <li>If {@code isPreprocessed} is {@link VK10#VK_TRUE TRUE} then {@link #vkCmdPreprocessGeneratedCommandsNV CmdPreprocessGeneratedCommandsNV} <b>must</b> have already been executed on the device, using the same {@code pGeneratedCommandsInfo} content as well as the content of the input buffers it references (all except {@link VkGeneratedCommandsInfoNV}{@code ::preprocessBuffer}). Furthermore {@code pGeneratedCommandsInfo}`s {@code indirectCommandsLayout} <b>must</b> have been created with the {@link #VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_NV INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_NV} bit set</li>
     * <li>{@link VkGeneratedCommandsInfoNV}{@code ::pipeline} <b>must</b> match the current bound pipeline at {@link VkGeneratedCommandsInfoNV}{@code ::pipelineBindPoint}</li>
     * <li>Transform feedback <b>must</b> not be active</li>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-deviceGeneratedCommands">{@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV}{@code ::deviceGeneratedCommands}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pGeneratedCommandsInfo} <b>must</b> be a valid pointer to a valid {@link VkGeneratedCommandsInfoNV} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics Compute</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkGeneratedCommandsInfoNV}</p>
     *
     * @param commandBuffer          the command buffer into which the command is recorded.
     * @param isPreprocessed         represents whether the input data has already been preprocessed on the device. If it is {@link VK10#VK_FALSE FALSE} this command will implicitly trigger the preprocessing step, otherwise not.
     * @param pGeneratedCommandsInfo a pointer to a {@link VkGeneratedCommandsInfoNV} structure containing parameters affecting the generation of commands.
     */
    public static void vkCmdExecuteGeneratedCommandsNV(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean isPreprocessed, @NativeType("VkGeneratedCommandsInfoNV const *") VkGeneratedCommandsInfoNV pGeneratedCommandsInfo) {
        nvkCmdExecuteGeneratedCommandsNV(commandBuffer, isPreprocessed ? 1 : 0, pGeneratedCommandsInfo.address());
    }

    // --- [ vkCmdBindPipelineShaderGroupNV ] ---

    /**
     * Bind a pipeline object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>For pipelines that were created with the support of multiple shader groups (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#graphics-shadergroups">Graphics Pipeline Shader Groups</a>), the regular {@code vkCmdBindPipeline} command will bind Shader Group 0. To explicitly bind a shader group use:</p>
     * 
     * <pre><code>
     * void vkCmdBindPipelineShaderGroupNV(
     *     VkCommandBuffer                             commandBuffer,
     *     VkPipelineBindPoint                         pipelineBindPoint,
     *     VkPipeline                                  pipeline,
     *     uint32_t                                    groupIndex);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code groupIndex} <b>must</b> be 0 or less than the effective {@link VkGraphicsPipelineShaderGroupsCreateInfoNV}{@code ::groupCount} including the referenced pipelines</li>
     * <li>The {@code pipelineBindPoint} <b>must</b> be {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
     * <li>The same restrictions as {@link VK10#vkCmdBindPipeline CmdBindPipeline} apply as if the bound pipeline was created only with the Shader Group from the {@code groupIndex} information</li>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-deviceGeneratedCommands">{@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV}{@code ::deviceGeneratedCommands}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
     * <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>Both of {@code commandBuffer}, and {@code pipeline} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer     the command buffer that the pipeline will be bound to.
     * @param pipelineBindPoint a {@code VkPipelineBindPoint} value specifying the bind point to which the pipeline will be bound.
     * @param pipeline          the pipeline to be bound.
     * @param groupIndex        the shader group to be bound.
     */
    public static void vkCmdBindPipelineShaderGroupNV(VkCommandBuffer commandBuffer, @NativeType("VkPipelineBindPoint") int pipelineBindPoint, @NativeType("VkPipeline") long pipeline, @NativeType("uint32_t") int groupIndex) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindPipelineShaderGroupNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(commandBuffer.address(), pipelineBindPoint, pipeline, groupIndex, __functionAddress);
    }

    // --- [ vkCreateIndirectCommandsLayoutNV ] ---

    /** Unsafe version of: {@link #vkCreateIndirectCommandsLayoutNV CreateIndirectCommandsLayoutNV} */
    public static int nvkCreateIndirectCommandsLayoutNV(VkDevice device, long pCreateInfo, long pAllocator, long pIndirectCommandsLayout) {
        long __functionAddress = device.getCapabilities().vkCreateIndirectCommandsLayoutNV;
        if (CHECKS) {
            check(__functionAddress);
            VkIndirectCommandsLayoutCreateInfoNV.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pIndirectCommandsLayout, __functionAddress);
    }

    /**
     * Create an indirect command layout object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Indirect command layouts are created by:</p>
     * 
     * <pre><code>
     * VkResult vkCreateIndirectCommandsLayoutNV(
     *     VkDevice                                    device,
     *     const VkIndirectCommandsLayoutCreateInfoNV* pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkIndirectCommandsLayoutNV*                 pIndirectCommandsLayout);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-deviceGeneratedCommands">{@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV}{@code ::deviceGeneratedCommands}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkIndirectCommandsLayoutCreateInfoNV} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pIndirectCommandsLayout} <b>must</b> be a valid pointer to a {@code VkIndirectCommandsLayoutNV} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkIndirectCommandsLayoutCreateInfoNV}</p>
     *
     * @param device                  the logical device that creates the indirect command layout.
     * @param pCreateInfo             a pointer to a {@link VkIndirectCommandsLayoutCreateInfoNV} structure containing parameters affecting creation of the indirect command layout.
     * @param pAllocator              controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pIndirectCommandsLayout a pointer to a {@code VkIndirectCommandsLayoutNV} handle in which the resulting indirect command layout is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateIndirectCommandsLayoutNV(VkDevice device, @NativeType("VkIndirectCommandsLayoutCreateInfoNV const *") VkIndirectCommandsLayoutCreateInfoNV pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkIndirectCommandsLayoutNV *") LongBuffer pIndirectCommandsLayout) {
        if (CHECKS) {
            check(pIndirectCommandsLayout, 1);
        }
        return nvkCreateIndirectCommandsLayoutNV(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pIndirectCommandsLayout));
    }

    // --- [ vkDestroyIndirectCommandsLayoutNV ] ---

    /** Unsafe version of: {@link #vkDestroyIndirectCommandsLayoutNV DestroyIndirectCommandsLayoutNV} */
    public static void nvkDestroyIndirectCommandsLayoutNV(VkDevice device, long indirectCommandsLayout, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyIndirectCommandsLayoutNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), indirectCommandsLayout, pAllocator, __functionAddress);
    }

    /**
     * Destroy an indirect commands layout.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Indirect command layouts are destroyed by:</p>
     * 
     * <pre><code>
     * void vkDestroyIndirectCommandsLayoutNV(
     *     VkDevice                                    device,
     *     VkIndirectCommandsLayoutNV                  indirectCommandsLayout,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>All submitted commands that refer to {@code indirectCommandsLayout} <b>must</b> have completed execution</li>
     * <li>If {@link VkAllocationCallbacks} were provided when {@code indirectCommandsLayout} was created, a compatible set of callbacks <b>must</b> be provided here</li>
     * <li>If no {@link VkAllocationCallbacks} were provided when {@code indirectCommandsLayout} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-deviceGeneratedCommands">{@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV}{@code ::deviceGeneratedCommands}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code indirectCommandsLayout} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code indirectCommandsLayout} <b>must</b> be a valid {@code VkIndirectCommandsLayoutNV} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>If {@code indirectCommandsLayout} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code indirectCommandsLayout} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param device                 the logical device that destroys the layout.
     * @param indirectCommandsLayout the layout to destroy.
     * @param pAllocator             controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyIndirectCommandsLayoutNV(VkDevice device, @NativeType("VkIndirectCommandsLayoutNV") long indirectCommandsLayout, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyIndirectCommandsLayoutNV(device, indirectCommandsLayout, memAddressSafe(pAllocator));
    }

    /** Array version of: {@link #vkCreateIndirectCommandsLayoutNV CreateIndirectCommandsLayoutNV} */
    @NativeType("VkResult")
    public static int vkCreateIndirectCommandsLayoutNV(VkDevice device, @NativeType("VkIndirectCommandsLayoutCreateInfoNV const *") VkIndirectCommandsLayoutCreateInfoNV pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkIndirectCommandsLayoutNV *") long[] pIndirectCommandsLayout) {
        long __functionAddress = device.getCapabilities().vkCreateIndirectCommandsLayoutNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pIndirectCommandsLayout, 1);
            VkIndirectCommandsLayoutCreateInfoNV.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pIndirectCommandsLayout, __functionAddress);
    }

}