/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_device_generated_commands_compute = "NVDeviceGeneratedCommandsCompute".nativeClassVK("NV_device_generated_commands_compute", type = "device", postfix = "NV") {
    documentation =
        """
        This extension allows the device to generate commands for binding compute pipelines, setting push constants and launching compute dispatches.

        <h5>VK_NV_device_generated_commands_compute</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_device_generated_commands_compute}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>429</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link NVDeviceGeneratedCommands VK_NV_device_generated_commands}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Vikram Kushwaha <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_device_generated_commands_compute]%20@vkushwaha-nv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_device_generated_commands_compute%20extension*">vkushwaha-nv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-07-21</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Vikram Kushwaha, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Christoph Kubisch, NVIDIA</li>
                <li>Piers Daniell, NVIDIA</li>
                <li>Daniel Koch, NVIDIA</li>
                <li>Hans-Kristian Arntzen, Valve</li>
                <li>Mike Blumenkrantz, VALVE</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_DEVICE_GENERATED_COMMANDS_COMPUTE_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "NV_DEVICE_GENERATED_COMMANDS_COMPUTE_EXTENSION_NAME".."VK_NV_device_generated_commands_compute"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV".."1000428000",
        "STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV".."1000428001",
        "STRUCTURE_TYPE_PIPELINE_INDIRECT_DEVICE_ADDRESS_INFO_NV".."1000428002"
    )

    EnumConstant(
        "Extends {@code VkIndirectCommandsTokenTypeNV}.",

        "INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NV".."1000428003",
        "INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NV".."1000428004"
    )

    EnumConstant(
        "Extends {@code VkDescriptorSetLayoutCreateFlagBits}.",

        "DESCRIPTOR_SET_LAYOUT_CREATE_INDIRECT_BINDABLE_BIT_NV".enum(0x00000080)
    )

    void(
        "GetPipelineIndirectMemoryRequirementsNV",
        """
        Get the memory requirements for the compute indirect pipeline.

        <h5>C Specification</h5>
        To determine the memory requirements for a compute pipeline’s metadata, call:

        <pre><code>
￿void vkGetPipelineIndirectMemoryRequirementsNV(
￿    VkDevice                                    device,
￿    const VkComputePipelineCreateInfo*          pCreateInfo,
￿    VkMemoryRequirements2*                      pMemoryRequirements);</code></pre>

        <h5>Description</h5>
        If {@code pCreateInfo}{@code ::pNext} chain includes a pointer to a ##VkComputePipelineIndirectBufferInfoNV structure, then the contents of that structure are ignored.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-deviceGeneratedComputePipelines">##VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV{@code ::deviceGeneratedComputePipelines}</a> feature <b>must</b> be enabled</li>
            <li>{@code pCreateInfo}{@code ::flags} <b>must</b> include #PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkComputePipelineCreateInfo structure</li>
            <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a ##VkMemoryRequirements2 structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkComputePipelineCreateInfo, ##VkMemoryRequirements2
        """,

        VkDevice("device", "the logical device that owns the buffer."),
        VkComputePipelineCreateInfo.const.p("pCreateInfo", "a ##VkComputePipelineCreateInfo structure specifying the creation parameters of the compute pipeline whose memory requirements are being queried."),
        VkMemoryRequirements2.p("pMemoryRequirements", "a pointer to a ##VkMemoryRequirements2 structure in which the requested pipeline’s memory requirements are returned.")
    )

    void(
        "CmdUpdatePipelineIndirectBufferNV",
        """
        Update the indirect compute pipeline’s metadata.

        <h5>C Specification</h5>
        To save a compute pipeline’s metadata at a device address call:

        <pre><code>
￿void vkCmdUpdatePipelineIndirectBufferNV(
￿    VkCommandBuffer                             commandBuffer,
￿    VkPipelineBindPoint                         pipelineBindPoint,
￿    VkPipeline                                  pipeline);</code></pre>

        <h5>Description</h5>
        {@code vkCmdUpdatePipelineIndirectBufferNV} is only allowed outside of a render pass. This command is treated as a “{@code transfer}” operation for the purposes of synchronization barriers. The writes to the address <b>must</b> be synchronized using stages #PIPELINE_STAGE_2_COPY_BIT and #PIPELINE_STAGE_COMMAND_PREPROCESS_BIT_NV and with access masks #ACCESS_MEMORY_WRITE_BIT and #ACCESS_COMMAND_PREPROCESS_READ_BIT_NV respectively before using the results in preprocessing.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code pipelineBindPoint} <b>must</b> be #PIPELINE_BIND_POINT_COMPUTE</li>
            <li>{@code pipeline} <b>must</b> have been created with #PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV flag set</li>
            <li>{@code pipeline} <b>must</b> have been created with ##VkComputePipelineIndirectBufferInfoNV structure specifying a valid address where its metadata will be saved</li>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-deviceGeneratedComputePipelines">##VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV{@code ::deviceGeneratedComputePipelines}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
            <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>Both of {@code commandBuffer}, and {@code pipeline} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Outside</td><td>Transfer Graphics Compute</td><td>Action</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkPipelineBindPoint("pipelineBindPoint", "a {@code VkPipelineBindPoint} value specifying the type of pipeline whose metadata will be saved."),
        VkPipeline("pipeline", "the pipeline whose metadata will be saved.")
    )

    VkDeviceAddress(
        "GetPipelineIndirectDeviceAddressNV",
        """
        Get pipeline’s 64-bit device address.

        <h5>C Specification</h5>
        To query a compute pipeline’s 64-bit device address, call:

        <pre><code>
￿VkDeviceAddress vkGetPipelineIndirectDeviceAddressNV(
￿    VkDevice                                    device,
￿    const VkPipelineIndirectDeviceAddressInfoNV* pInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkPipelineIndirectDeviceAddressInfoNV structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineIndirectDeviceAddressInfoNV
        """,

        VkDevice("device", ""),
        VkPipelineIndirectDeviceAddressInfoNV.const.p("pInfo", "")
    )
}