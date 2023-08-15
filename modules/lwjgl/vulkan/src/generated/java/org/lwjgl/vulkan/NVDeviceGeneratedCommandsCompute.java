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
 * This extension allows the device to generate commands for binding compute pipelines, setting push constants and launching compute dispatches.
 * 
 * <h5>VK_NV_device_generated_commands_compute</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_device_generated_commands_compute}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>429</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link NVDeviceGeneratedCommands VK_NV_device_generated_commands}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Vikram Kushwaha <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_device_generated_commands_compute]%20@vkushwaha-nv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_device_generated_commands_compute%20extension*">vkushwaha-nv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-07-21</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Vikram Kushwaha, NVIDIA</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Christoph Kubisch, NVIDIA</li>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Hans-Kristian Arntzen, Valve</li>
 * <li>Mike Blumenkrantz, VALVE</li>
 * </ul></dd>
 * </dl>
 */
public class NVDeviceGeneratedCommandsCompute {

    /** The extension specification version. */
    public static final int VK_NV_DEVICE_GENERATED_COMMANDS_COMPUTE_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_NV_DEVICE_GENERATED_COMMANDS_COMPUTE_EXTENSION_NAME = "VK_NV_device_generated_commands_compute";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_INDIRECT_DEVICE_ADDRESS_INFO_NV STRUCTURE_TYPE_PIPELINE_INDIRECT_DEVICE_ADDRESS_INFO_NV}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV = 1000428000,
        VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV                      = 1000428001,
        VK_STRUCTURE_TYPE_PIPELINE_INDIRECT_DEVICE_ADDRESS_INFO_NV                      = 1000428002;

    /**
     * Extends {@code VkIndirectCommandsTokenTypeNV}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NV INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NV}</li>
     * <li>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NV INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NV}</li>
     * </ul>
     */
    public static final int
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NV = 1000428003,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NV = 1000428004;

    /** Extends {@code VkDescriptorSetLayoutCreateFlagBits}. */
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_INDIRECT_BINDABLE_BIT_NV = 0x80;

    protected NVDeviceGeneratedCommandsCompute() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPipelineIndirectMemoryRequirementsNV ] ---

    /** Unsafe version of: {@link #vkGetPipelineIndirectMemoryRequirementsNV GetPipelineIndirectMemoryRequirementsNV} */
    public static void nvkGetPipelineIndirectMemoryRequirementsNV(VkDevice device, long pCreateInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetPipelineIndirectMemoryRequirementsNV;
        if (CHECKS) {
            check(__functionAddress);
            VkComputePipelineCreateInfo.validate(pCreateInfo);
        }
        callPPPV(device.address(), pCreateInfo, pMemoryRequirements, __functionAddress);
    }

    /**
     * Get the memory requirements for the compute indirect pipeline.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To determine the memory requirements for a compute pipeline’s metadata, call:</p>
     * 
     * <pre><code>
     * void vkGetPipelineIndirectMemoryRequirementsNV(
     *     VkDevice                                    device,
     *     const VkComputePipelineCreateInfo*          pCreateInfo,
     *     VkMemoryRequirements2*                      pMemoryRequirements);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pCreateInfo}{@code ::pNext} chain includes a pointer to a {@link VkComputePipelineIndirectBufferInfoNV} structure, then the contents of that structure are ignored.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-deviceGeneratedComputePipelines">{@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV}{@code ::deviceGeneratedComputePipelines}</a> feature <b>must</b> be enabled</li>
     * <li>{@code pCreateInfo}{@code ::flags} <b>must</b> include {@link NVDeviceGeneratedCommands#VK_PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkComputePipelineCreateInfo} structure</li>
     * <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a {@link VkMemoryRequirements2} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkComputePipelineCreateInfo}, {@link VkMemoryRequirements2}</p>
     *
     * @param device              the logical device that owns the buffer.
     * @param pCreateInfo         a {@link VkComputePipelineCreateInfo} structure specifying the creation parameters of the compute pipeline whose memory requirements are being queried.
     * @param pMemoryRequirements a pointer to a {@link VkMemoryRequirements2} structure in which the requested pipeline’s memory requirements are returned.
     */
    public static void vkGetPipelineIndirectMemoryRequirementsNV(VkDevice device, @NativeType("VkComputePipelineCreateInfo const *") VkComputePipelineCreateInfo pCreateInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetPipelineIndirectMemoryRequirementsNV(device, pCreateInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkCmdUpdatePipelineIndirectBufferNV ] ---

    /**
     * Update the indirect compute pipeline’s metadata.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To save a compute pipeline’s metadata at a device address call:</p>
     * 
     * <pre><code>
     * void vkCmdUpdatePipelineIndirectBufferNV(
     *     VkCommandBuffer                             commandBuffer,
     *     VkPipelineBindPoint                         pipelineBindPoint,
     *     VkPipeline                                  pipeline);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkCmdUpdatePipelineIndirectBufferNV} is only allowed outside of a render pass. This command is treated as a “{@code transfer}” operation for the purposes of synchronization barriers. The writes to the address <b>must</b> be synchronized using stages {@link VK13#VK_PIPELINE_STAGE_2_COPY_BIT PIPELINE_STAGE_2_COPY_BIT} and {@link NVDeviceGeneratedCommands#VK_PIPELINE_STAGE_COMMAND_PREPROCESS_BIT_NV PIPELINE_STAGE_COMMAND_PREPROCESS_BIT_NV} and with access masks {@link VK10#VK_ACCESS_MEMORY_WRITE_BIT ACCESS_MEMORY_WRITE_BIT} and {@link NVDeviceGeneratedCommands#VK_ACCESS_COMMAND_PREPROCESS_READ_BIT_NV ACCESS_COMMAND_PREPROCESS_READ_BIT_NV} respectively before using the results in preprocessing.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code pipelineBindPoint} <b>must</b> be {@link VK10#VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}</li>
     * <li>{@code pipeline} <b>must</b> have been created with {@link NVDeviceGeneratedCommands#VK_PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV} flag set</li>
     * <li>{@code pipeline} <b>must</b> have been created with {@link VkComputePipelineIndirectBufferInfoNV} structure specifying a valid address where its metadata will be saved</li>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-deviceGeneratedComputePipelines">{@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV}{@code ::deviceGeneratedComputePipelines}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
     * <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Outside</td><td>Transfer Graphics Compute</td><td>Action</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer     the command buffer into which the command will be recorded.
     * @param pipelineBindPoint a {@code VkPipelineBindPoint} value specifying the type of pipeline whose metadata will be saved.
     * @param pipeline          the pipeline whose metadata will be saved.
     */
    public static void vkCmdUpdatePipelineIndirectBufferNV(VkCommandBuffer commandBuffer, @NativeType("VkPipelineBindPoint") int pipelineBindPoint, @NativeType("VkPipeline") long pipeline) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdUpdatePipelineIndirectBufferNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(commandBuffer.address(), pipelineBindPoint, pipeline, __functionAddress);
    }

    // --- [ vkGetPipelineIndirectDeviceAddressNV ] ---

    /** Unsafe version of: {@link #vkGetPipelineIndirectDeviceAddressNV GetPipelineIndirectDeviceAddressNV} */
    public static long nvkGetPipelineIndirectDeviceAddressNV(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetPipelineIndirectDeviceAddressNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJ(device.address(), pInfo, __functionAddress);
    }

    /**
     * Get pipeline’s 64-bit device address.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query a compute pipeline’s 64-bit device address, call:</p>
     * 
     * <pre><code>
     * VkDeviceAddress vkGetPipelineIndirectDeviceAddressNV(
     *     VkDevice                                    device,
     *     const VkPipelineIndirectDeviceAddressInfoNV* pInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkPipelineIndirectDeviceAddressInfoNV} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPipelineIndirectDeviceAddressInfoNV}</p>
     */
    @NativeType("VkDeviceAddress")
    public static long vkGetPipelineIndirectDeviceAddressNV(VkDevice device, @NativeType("VkPipelineIndirectDeviceAddressInfoNV const *") VkPipelineIndirectDeviceAddressInfoNV pInfo) {
        return nvkGetPipelineIndirectDeviceAddressNV(device, pInfo.address());
    }

}