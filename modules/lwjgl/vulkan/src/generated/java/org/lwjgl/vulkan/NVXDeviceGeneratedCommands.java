/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension allows the device to generate a number of critical commands for command buffers.
 * 
 * <p>When rendering a large number of objects, the device can be leveraged to implement a number of critical functions, like updating matrices, or implementing occlusion culling, frustum culling, front to back sorting, etc. Implementing those on the device does not require any special extension, since an application is free to define its own data structure, and just process them using shaders.</p>
 * 
 * <p>However, if the application desires to quickly kick off the rendering of the final stream of objects, then unextended Vulkan forces the application to read back the processed stream and issue graphics command from the host. For very large scenes, the synchronization overhead, and cost to generate the command buffer can become the bottleneck. This extension allows an application to generate a device side stream of state changes and commands, and convert it efficiently into a command buffer without having to read it back on the host.</p>
 * 
 * <p>Furthermore, it allows incremental changes to such command buffers by manipulating only partial sections of a command stream -- for example pipeline bindings. Unextended Vulkan requires re-creation of entire command buffers in such scenario, or updates synchronized on the host.</p>
 * 
 * <p>The intended usage for this extension is for the application to:</p>
 * 
 * <ul>
 * <li>create its objects as in unextended Vulkan</li>
 * <li>create a {@code VkObjectTableNVX}, and register the various Vulkan objects that are needed to evaluate the input parameters.</li>
 * <li>create a {@code VkIndirectCommandsLayoutNVX}, which lists the {@code VkIndirectCommandsTokenTypeNVX} it wants to dynamically change as atomic command sequence. This step likely involves some internal device code compilation, since the intent is for the GPU to generate the command buffer in the pipeline.</li>
 * <li>fill the input buffers with the data for each of the inputs it needs. Each input is an array that will be filled with an index in the object table, instead of using CPU pointers.</li>
 * <li>set up a target secondary command buffer</li>
 * <li>reserve command buffer space via {@link #vkCmdReserveSpaceForCommandsNVX CmdReserveSpaceForCommandsNVX} in a target command buffer at the position you want the generated commands to be executed.</li>
 * <li>call {@link #vkCmdProcessCommandsNVX CmdProcessCommandsNVX} to create the actual device commands for all sequences based on the array contents into a provided target command buffer.</li>
 * <li>execute the target command buffer like a regular secondary command buffer</li>
 * </ul>
 * 
 * <p>For each draw/dispatch, the following can be specified:</p>
 * 
 * <ul>
 * <li>a different pipeline state object</li>
 * <li>a number of descriptor sets, with dynamic offsets</li>
 * <li>a number of vertex buffer bindings, with an optional dynamic offset</li>
 * <li>a different index buffer, with an optional dynamic offset</li>
 * </ul>
 * 
 * <p>Applications <b>should</b> register a small number of objects, and use dynamic offsets whenever possible.</p>
 * 
 * <p>While the GPU can be faster than a CPU to generate the commands, it may not happen asynchronously, therefore the primary use-case is generating "{@code less}" total work (occlusion culling, classification to use specialized shaders, etc.).</p>
 * 
 * <h5>Example Code</h5>
 * 
 * <p>Open-Source samples illustrating the usage of the extension can be found at the following locations:</p>
 * 
 * <p>https://github.com/nvpro-samples/gl_vk_threaded_cadscene/blob/master/doc/vulkan_nvxdevicegenerated.md</p>
 * 
 * <p>https://github.com/NVIDIAGameWorks/GraphicsSamples/tree/master/samples/vk10-kepler/BasicDeviceGeneratedCommandsVk</p>
 * 
 * <pre><code>
 *   // setup secondary command buffer
 *     vkBeginCommandBuffer(generatedCmdBuffer, &amp;beginInfo);
 *     ... setup its state as usual
 * 
 *   // insert the reservation (there can only be one per command buffer)
 *   // where the generated calls should be filled into
 *     VkCmdReserveSpaceForCommandsInfoNVX reserveInfo = { VK_STRUCTURE_TYPE_CMD_RESERVE_SPACE_FOR_COMMANDS_INFO_NVX };
 *     reserveInfo.objectTable = objectTable;
 *     reserveInfo.indirectCommandsLayout = deviceGeneratedLayout;
 *     reserveInfo.maxSequencesCount = myCount;
 *     vkCmdReserveSpaceForCommandsNVX(generatedCmdBuffer, &amp;reserveInfo);
 * 
 *     vkEndCommandBuffer(generatedCmdBuffer);
 * 
 *   // trigger the generation at some point in another primary command buffer
 *     VkCmdProcessCommandsInfoNVX processInfo = { VK_STRUCTURE_TYPE_CMD_PROCESS_COMMANDS_INFO_NVX };
 *     processInfo.objectTable = objectTable;
 *     processInfo.indirectCommandsLayout = deviceGeneratedLayout;
 *     processInfo.maxSequencesCount = myCount;
 *     // set the target of the generation (if null we would directly execute with mainCmd)
 *     processInfo.targetCommandBuffer = generatedCmdBuffer;
 *     // provide input data
 *     processInfo.indirectCommandsTokenCount = 3;
 *     processInfo.pIndirectCommandsTokens = myTokens;
 * 
 *   // If you modify the input buffer data referenced by VkCmdProcessCommandsInfoNVX,
 *   // ensure you have added the appropriate barriers prior generation process.
 *   // When regenerating the content of the same reserved space, ensure prior operations have completed
 * 
 *     VkMemoryBarrier memoryBarrier = { VK_STRUCTURE_TYPE_MEMORY_BARRIER };
 *     memoryBarrier.srcAccessMask = ...;
 *     memoryBarrier.dstAccessMask = VK_ACCESS_COMMAND_PROCESS_READ_BIT_NVX;
 * 
 *     vkCmdPipelineBarrier(mainCmd,
 *                          // srcStageMaskVK_PIPELINE_STAGE_ALL_COMMANDS_BIT,
 *                          // dstStageMaskVK_PIPELINE_STAGE_COMMAND_PROCESS_BIT_NVX,
 *                          // dependencyFlags0,
 *                          // memoryBarrierCount1,
 *                          // pMemoryBarriers&amp;memoryBarrier,
 *                          ...);
 * 
 *     vkCmdProcessCommandsNVX(mainCmd, &amp;processInfo);
 *     ...
 *   // execute the secondary command buffer and ensure the processing that modifies command-buffer content
 *   // has completed
 * 
 *     memoryBarrier.srcAccessMask = VK_ACCESS_COMMAND_PROCESS_WRITE_BIT_NVX;
 *     memoryBarrier.dstAccessMask = VK_ACCESS_INDIRECT_COMMAND_READ_BIT;
 * 
 *     vkCmdPipelineBarrier(mainCmd,
 *                          // srcStageMaskVK_PIPELINE_STAGE_COMMAND_PROCESS_BIT_NVX,
 *                          // dstStageMaskVK_PIPELINE_STAGE_DRAW_INDIRECT_BIT,
 *                          // dependencyFlags0,
 *                          // memoryBarrierCount1,
 *                          // pMemoryBarriers&amp;memoryBarrier,
 *                          ...)
 *     vkCmdExecuteCommands(mainCmd, 1, &amp;generatedCmdBuffer);</code></pre>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NVX_device_generated_commands}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>87</dd>
 * <dt><b>Revision</b></dt>
 * <dd>3</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Christoph Kubisch <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_NVX_device_generated_commands:%20&amp;body=@pixeljetstream%20">pixeljetstream</a></li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-07-25</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Pierre Boudier, NVIDIA</li>
 * <li>Christoph Kubisch, NVIDIA</li>
 * <li>Mathias Schott, NVIDIA</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Eric Werness, NVIDIA</li>
 * <li>Detlef Roettger, NVIDIA</li>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Chris Hebert, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class NVXDeviceGeneratedCommands {

    /** The extension specification version. */
    public static final int VK_NVX_DEVICE_GENERATED_COMMANDS_SPEC_VERSION = 3;

    /** The extension name. */
    public static final String VK_NVX_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME = "VK_NVX_device_generated_commands";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_OBJECT_TABLE_CREATE_INFO_NVX STRUCTURE_TYPE_OBJECT_TABLE_CREATE_INFO_NVX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NVX STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NVX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_CMD_PROCESS_COMMANDS_INFO_NVX STRUCTURE_TYPE_CMD_PROCESS_COMMANDS_INFO_NVX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_CMD_RESERVE_SPACE_FOR_COMMANDS_INFO_NVX STRUCTURE_TYPE_CMD_RESERVE_SPACE_FOR_COMMANDS_INFO_NVX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GENERATED_COMMANDS_LIMITS_NVX STRUCTURE_TYPE_DEVICE_GENERATED_COMMANDS_LIMITS_NVX}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GENERATED_COMMANDS_FEATURES_NVX STRUCTURE_TYPE_DEVICE_GENERATED_COMMANDS_FEATURES_NVX}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_OBJECT_TABLE_CREATE_INFO_NVX             = 1000086000,
        VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NVX = 1000086001,
        VK_STRUCTURE_TYPE_CMD_PROCESS_COMMANDS_INFO_NVX            = 1000086002,
        VK_STRUCTURE_TYPE_CMD_RESERVE_SPACE_FOR_COMMANDS_INFO_NVX  = 1000086003,
        VK_STRUCTURE_TYPE_DEVICE_GENERATED_COMMANDS_LIMITS_NVX     = 1000086004,
        VK_STRUCTURE_TYPE_DEVICE_GENERATED_COMMANDS_FEATURES_NVX   = 1000086005;

    /** Extends {@code VkPipelineStageFlagBits}. */
    public static final int VK_PIPELINE_STAGE_COMMAND_PROCESS_BIT_NVX = 0x20000;

    /**
     * Extends {@code VkAccessFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_COMMAND_PROCESS_READ_BIT_NVX ACCESS_COMMAND_PROCESS_READ_BIT_NVX}</li>
     * <li>{@link #VK_ACCESS_COMMAND_PROCESS_WRITE_BIT_NVX ACCESS_COMMAND_PROCESS_WRITE_BIT_NVX}</li>
     * </ul>
     */
    public static final int
        VK_ACCESS_COMMAND_PROCESS_READ_BIT_NVX  = 0x20000,
        VK_ACCESS_COMMAND_PROCESS_WRITE_BIT_NVX = 0x40000;

    /**
     * Extends {@code VkObjectType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_OBJECT_TYPE_OBJECT_TABLE_NVX OBJECT_TYPE_OBJECT_TABLE_NVX}</li>
     * <li>{@link #VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX}</li>
     * </ul>
     */
    public static final int
        VK_OBJECT_TYPE_OBJECT_TABLE_NVX             = 1000086000,
        VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX = 1000086001;

    /**
     * VkIndirectCommandsLayoutUsageFlagBitsNVX - Bitmask specifying allowed usage of an indirect commands layout
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NVX INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NVX} specifies that the processing of sequences <b>can</b> happen at an implementation-dependent order, which is not guaranteed to be coherent across multiple invocations.</li>
     * <li>{@link #VK_INDIRECT_COMMANDS_LAYOUT_USAGE_SPARSE_SEQUENCES_BIT_NVX INDIRECT_COMMANDS_LAYOUT_USAGE_SPARSE_SEQUENCES_BIT_NVX} specifies that there is likely a high difference between allocated number of sequences and actually used.</li>
     * <li>{@link #VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EMPTY_EXECUTIONS_BIT_NVX INDIRECT_COMMANDS_LAYOUT_USAGE_EMPTY_EXECUTIONS_BIT_NVX} specifies that there are likely many draw or dispatch calls that are zero-sized (zero grid dimension, no primitives to render).</li>
     * <li>{@link #VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NVX INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NVX} specifies that the input data for the sequences is not implicitly indexed from 0..sequencesUsed but a user provided {@code VkBuffer} encoding the index is provided.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkIndirectCommandsLayoutUsageFlagsNVX}</p>
     */
    public static final int
        VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NVX = 0x1,
        VK_INDIRECT_COMMANDS_LAYOUT_USAGE_SPARSE_SEQUENCES_BIT_NVX    = 0x2,
        VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EMPTY_EXECUTIONS_BIT_NVX    = 0x4,
        VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NVX   = 0x8;

    /**
     * VkObjectEntryUsageFlagBitsNVX - Bitmask specifying allowed usage of an object entry
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX} specifies that the resource is bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
     * <li>{@link #VK_OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX} specifies that the resource is bound to {@link VK10#VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkObjectEntryUsageFlagsNVX}</p>
     */
    public static final int
        VK_OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX = 0x1,
        VK_OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX  = 0x2;

    /**
     * VkIndirectCommandsTokenTypeNVX - Enum specifying
     * 
     * <h5>Description</h5>
     * 
     * <h6>Supported indirect command tokens</h6>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>Token type</th><th>Equivalent command</th></tr></thead>
     * <tbody>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NVX INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NVX}</td><td>{@code vkCmdBindPipeline}</td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_DESCRIPTOR_SET_NVX INDIRECT_COMMANDS_TOKEN_TYPE_DESCRIPTOR_SET_NVX}</td><td>{@code vkCmdBindDescriptorSets}</td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NVX INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NVX}</td><td>{@code vkCmdBindIndexBuffer}</td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NVX INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NVX}</td><td>{@code vkCmdBindVertexBuffers}</td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NVX INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NVX}</td><td>{@code vkCmdPushConstants}</td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NVX INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NVX}</td><td>{@code vkCmdDrawIndexedIndirect}</td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NVX INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NVX}</td><td>{@code vkCmdDrawIndirect}</td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NVX INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NVX}</td><td>{@code vkCmdDispatchIndirect}</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkIndirectCommandsLayoutTokenNVX}, {@link VkIndirectCommandsTokenNVX}</p>
     */
    public static final int
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NVX       = 0,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DESCRIPTOR_SET_NVX = 1,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NVX   = 2,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NVX  = 3,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NVX  = 4,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NVX   = 5,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NVX           = 6,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NVX       = 7;

    /**
     * VkObjectEntryTypeNVX - Enum specifying object table entry type
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_OBJECT_ENTRY_TYPE_DESCRIPTOR_SET_NVX OBJECT_ENTRY_TYPE_DESCRIPTOR_SET_NVX} specifies a {@code VkDescriptorSet} resource entry that is registered via {@link VkObjectTableDescriptorSetEntryNVX}.</li>
     * <li>{@link #VK_OBJECT_ENTRY_TYPE_PIPELINE_NVX OBJECT_ENTRY_TYPE_PIPELINE_NVX} specifies a {@code VkPipeline} resource entry that is registered via {@link VkObjectTablePipelineEntryNVX}.</li>
     * <li>{@link #VK_OBJECT_ENTRY_TYPE_INDEX_BUFFER_NVX OBJECT_ENTRY_TYPE_INDEX_BUFFER_NVX} specifies a {@code VkBuffer} resource entry that is registered via {@link VkObjectTableIndexBufferEntryNVX}.</li>
     * <li>{@link #VK_OBJECT_ENTRY_TYPE_VERTEX_BUFFER_NVX OBJECT_ENTRY_TYPE_VERTEX_BUFFER_NVX} specifies a {@code VkBuffer} resource entry that is registered via {@link VkObjectTableVertexBufferEntryNVX}.</li>
     * <li>{@link #VK_OBJECT_ENTRY_TYPE_PUSH_CONSTANT_NVX OBJECT_ENTRY_TYPE_PUSH_CONSTANT_NVX} specifies the resource entry is registered via {@link VkObjectTablePushConstantEntryNVX}.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkObjectTableCreateInfoNVX}, {@link VkObjectTableDescriptorSetEntryNVX}, {@link VkObjectTableEntryNVX}, {@link VkObjectTableIndexBufferEntryNVX}, {@link VkObjectTablePipelineEntryNVX}, {@link VkObjectTablePushConstantEntryNVX}, {@link VkObjectTableVertexBufferEntryNVX}, {@link #vkUnregisterObjectsNVX UnregisterObjectsNVX}</p>
     */
    public static final int
        VK_OBJECT_ENTRY_TYPE_DESCRIPTOR_SET_NVX = 0,
        VK_OBJECT_ENTRY_TYPE_PIPELINE_NVX       = 1,
        VK_OBJECT_ENTRY_TYPE_INDEX_BUFFER_NVX   = 2,
        VK_OBJECT_ENTRY_TYPE_VERTEX_BUFFER_NVX  = 3,
        VK_OBJECT_ENTRY_TYPE_PUSH_CONSTANT_NVX  = 4;

    protected NVXDeviceGeneratedCommands() {
        throw new UnsupportedOperationException();
    }

    static boolean checkCapsInstance(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_NVX_device_generated_commands") && VK.checkExtension("VK_NVX_device_generated_commands",
               VK.isSupported(provider, "vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX", caps)
        );
    }

    static boolean checkCapsDevice(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_NVX_device_generated_commands") && VK.checkExtension("VK_NVX_device_generated_commands",
               VK.isSupported(provider, "vkCmdProcessCommandsNVX", caps)
            && VK.isSupported(provider, "vkCmdReserveSpaceForCommandsNVX", caps)
            && VK.isSupported(provider, "vkCreateIndirectCommandsLayoutNVX", caps)
            && VK.isSupported(provider, "vkDestroyIndirectCommandsLayoutNVX", caps)
            && VK.isSupported(provider, "vkCreateObjectTableNVX", caps)
            && VK.isSupported(provider, "vkDestroyObjectTableNVX", caps)
            && VK.isSupported(provider, "vkRegisterObjectsNVX", caps)
            && VK.isSupported(provider, "vkUnregisterObjectsNVX", caps)
        );
    }

    // --- [ vkCmdProcessCommandsNVX ] ---

    /** Unsafe version of: {@link #vkCmdProcessCommandsNVX CmdProcessCommandsNVX} */
    public static void nvkCmdProcessCommandsNVX(VkCommandBuffer commandBuffer, long pProcessCommandsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdProcessCommandsNVX;
        if (CHECKS) {
            check(__functionAddress);
            VkCmdProcessCommandsInfoNVX.validate(pProcessCommandsInfo);
        }
        callPPV(commandBuffer.address(), pProcessCommandsInfo, __functionAddress);
    }

    /**
     * Performs the generation of commands on the device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The actual generation on the device is handled with:</p>
     * 
     * <pre><code>
     * void vkCmdProcessCommandsNVX(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkCmdProcessCommandsInfoNVX*          pProcessCommandsInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pProcessCommandsInfo} <b>must</b> be a valid pointer to a valid {@link VkCmdProcessCommandsInfoNVX} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics Compute</td><td></td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCmdProcessCommandsInfoNVX}</p>
     *
     * @param commandBuffer        the primary command buffer in which the generation process takes space.
     * @param pProcessCommandsInfo a pointer to a {@link VkCmdProcessCommandsInfoNVX} structure containing parameters affecting the processing of commands.
     */
    public static void vkCmdProcessCommandsNVX(VkCommandBuffer commandBuffer, @NativeType("VkCmdProcessCommandsInfoNVX const *") VkCmdProcessCommandsInfoNVX pProcessCommandsInfo) {
        nvkCmdProcessCommandsNVX(commandBuffer, pProcessCommandsInfo.address());
    }

    // --- [ vkCmdReserveSpaceForCommandsNVX ] ---

    /** Unsafe version of: {@link #vkCmdReserveSpaceForCommandsNVX CmdReserveSpaceForCommandsNVX} */
    public static void nvkCmdReserveSpaceForCommandsNVX(VkCommandBuffer commandBuffer, long pReserveSpaceInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdReserveSpaceForCommandsNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pReserveSpaceInfo, __functionAddress);
    }

    /**
     * Perform a reservation of command buffer space.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Command space for generated commands recorded into a secondary command buffer <b>must</b> be reserved by calling:</p>
     * 
     * <pre><code>
     * void vkCmdReserveSpaceForCommandsNVX(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkCmdReserveSpaceForCommandsInfoNVX*  pReserveSpaceInfo);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The provided {@code commandBuffer} <b>must</b> not have had a prior space reservation since its creation or the last reset.</li>
     * <li>The state of the {@code commandBuffer} <b>must</b> be legal to execute all commands within the sequence provided by the {@code indirectCommandsLayout} member of {@code pProcessCommandsInfo}.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pReserveSpaceInfo} <b>must</b> be a valid pointer to a valid {@link VkCmdReserveSpaceForCommandsInfoNVX} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called inside of a render pass instance</li>
     * <li>{@code commandBuffer} <b>must</b> be a secondary {@code VkCommandBuffer}</li>
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
     * <tbody><tr><td>Secondary</td><td>Inside</td><td>Graphics Compute</td><td></td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCmdReserveSpaceForCommandsInfoNVX}</p>
     *
     * @param commandBuffer the secondary command buffer in which the space for device-generated commands is reserved.
     */
    public static void vkCmdReserveSpaceForCommandsNVX(VkCommandBuffer commandBuffer, @NativeType("VkCmdReserveSpaceForCommandsInfoNVX const *") VkCmdReserveSpaceForCommandsInfoNVX pReserveSpaceInfo) {
        nvkCmdReserveSpaceForCommandsNVX(commandBuffer, pReserveSpaceInfo.address());
    }

    // --- [ vkCreateIndirectCommandsLayoutNVX ] ---

    /** Unsafe version of: {@link #vkCreateIndirectCommandsLayoutNVX CreateIndirectCommandsLayoutNVX} */
    public static int nvkCreateIndirectCommandsLayoutNVX(VkDevice device, long pCreateInfo, long pAllocator, long pIndirectCommandsLayout) {
        long __functionAddress = device.getCapabilities().vkCreateIndirectCommandsLayoutNVX;
        if (CHECKS) {
            check(__functionAddress);
            VkIndirectCommandsLayoutCreateInfoNVX.validate(pCreateInfo);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
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
     * VkResult vkCreateIndirectCommandsLayoutNVX(
     *     VkDevice                                    device,
     *     const VkIndirectCommandsLayoutCreateInfoNVX* pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkIndirectCommandsLayoutNVX*                pIndirectCommandsLayout);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkIndirectCommandsLayoutCreateInfoNVX} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pIndirectCommandsLayout} <b>must</b> be a valid pointer to a {@code VkIndirectCommandsLayoutNVX} handle</li>
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
     * <p>{@link VkAllocationCallbacks}, {@link VkIndirectCommandsLayoutCreateInfoNVX}</p>
     *
     * @param device                  the logical device that creates the indirect command layout.
     * @param pCreateInfo             a pointer to a {@link VkIndirectCommandsLayoutCreateInfoNVX} structure containing parameters affecting creation of the indirect command layout.
     * @param pAllocator              controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pIndirectCommandsLayout a pointer to a {@code VkIndirectCommandsLayoutNVX} handle in which the resulting indirect command layout is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateIndirectCommandsLayoutNVX(VkDevice device, @NativeType("VkIndirectCommandsLayoutCreateInfoNVX const *") VkIndirectCommandsLayoutCreateInfoNVX pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkIndirectCommandsLayoutNVX *") LongBuffer pIndirectCommandsLayout) {
        if (CHECKS) {
            check(pIndirectCommandsLayout, 1);
        }
        return nvkCreateIndirectCommandsLayoutNVX(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pIndirectCommandsLayout));
    }

    // --- [ vkDestroyIndirectCommandsLayoutNVX ] ---

    /** Unsafe version of: {@link #vkDestroyIndirectCommandsLayoutNVX DestroyIndirectCommandsLayoutNVX} */
    public static void nvkDestroyIndirectCommandsLayoutNVX(VkDevice device, long indirectCommandsLayout, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyIndirectCommandsLayoutNVX;
        if (CHECKS) {
            check(__functionAddress);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        callPJPV(device.address(), indirectCommandsLayout, pAllocator, __functionAddress);
    }

    /**
     * Destroy an object table.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Indirect command layouts are destroyed by:</p>
     * 
     * <pre><code>
     * void vkDestroyIndirectCommandsLayoutNVX(
     *     VkDevice                                    device,
     *     VkIndirectCommandsLayoutNVX                 indirectCommandsLayout,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>All submitted commands that refer to {@code indirectCommandsLayout} <b>must</b> have completed execution</li>
     * <li>If {@link VkAllocationCallbacks} were provided when {@code objectTable} was created, a compatible set of callbacks <b>must</b> be provided here</li>
     * <li>If no {@link VkAllocationCallbacks} were provided when {@code objectTable} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code indirectCommandsLayout} <b>must</b> be a valid {@code VkIndirectCommandsLayoutNVX} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code indirectCommandsLayout} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param device                 the logical device that destroys the layout.
     * @param indirectCommandsLayout the table to destroy.
     * @param pAllocator             controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyIndirectCommandsLayoutNVX(VkDevice device, @NativeType("VkIndirectCommandsLayoutNVX") long indirectCommandsLayout, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyIndirectCommandsLayoutNVX(device, indirectCommandsLayout, memAddressSafe(pAllocator));
    }

    // --- [ vkCreateObjectTableNVX ] ---

    /** Unsafe version of: {@link #vkCreateObjectTableNVX CreateObjectTableNVX} */
    public static int nvkCreateObjectTableNVX(VkDevice device, long pCreateInfo, long pAllocator, long pObjectTable) {
        long __functionAddress = device.getCapabilities().vkCreateObjectTableNVX;
        if (CHECKS) {
            check(__functionAddress);
            VkObjectTableCreateInfoNVX.validate(pCreateInfo);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pObjectTable, __functionAddress);
    }

    /**
     * Create an object table.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create object tables, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreateObjectTableNVX(
     *     VkDevice                                    device,
     *     const VkObjectTableCreateInfoNVX*           pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkObjectTableNVX*                           pObjectTable);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkObjectTableCreateInfoNVX} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pObjectTable} <b>must</b> be a valid pointer to a {@code VkObjectTableNVX} handle</li>
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
     * <p>{@link VkAllocationCallbacks}, {@link VkObjectTableCreateInfoNVX}</p>
     *
     * @param device       the logical device that creates the object table.
     * @param pCreateInfo  a pointer to a {@link VkObjectTableCreateInfoNVX} structure containing parameters affecting creation of the table.
     * @param pAllocator   controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pObjectTable a pointer to a {@code VkObjectTableNVX} handle in which the resulting object table is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateObjectTableNVX(VkDevice device, @NativeType("VkObjectTableCreateInfoNVX const *") VkObjectTableCreateInfoNVX pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkObjectTableNVX *") LongBuffer pObjectTable) {
        if (CHECKS) {
            check(pObjectTable, 1);
        }
        return nvkCreateObjectTableNVX(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pObjectTable));
    }

    // --- [ vkDestroyObjectTableNVX ] ---

    /** Unsafe version of: {@link #vkDestroyObjectTableNVX DestroyObjectTableNVX} */
    public static void nvkDestroyObjectTableNVX(VkDevice device, long objectTable, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyObjectTableNVX;
        if (CHECKS) {
            check(__functionAddress);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        callPJPV(device.address(), objectTable, pAllocator, __functionAddress);
    }

    /**
     * Destroy an object table.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To destroy an object table, call:</p>
     * 
     * <pre><code>
     * void vkDestroyObjectTableNVX(
     *     VkDevice                                    device,
     *     VkObjectTableNVX                            objectTable,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>All submitted commands that refer to {@code objectTable} <b>must</b> have completed execution.</li>
     * <li>If {@link VkAllocationCallbacks} were provided when {@code objectTable} was created, a compatible set of callbacks <b>must</b> be provided here.</li>
     * <li>If no {@link VkAllocationCallbacks} were provided when {@code objectTable} was created, {@code pAllocator} <b>must</b> be {@code NULL}.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code objectTable} <b>must</b> be a valid {@code VkObjectTableNVX} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code objectTable} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code objectTable} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param device      the logical device that destroys the table.
     * @param objectTable the table to destroy.
     * @param pAllocator  controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyObjectTableNVX(VkDevice device, @NativeType("VkObjectTableNVX") long objectTable, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyObjectTableNVX(device, objectTable, memAddressSafe(pAllocator));
    }

    // --- [ vkRegisterObjectsNVX ] ---

    /**
     * Unsafe version of: {@link #vkRegisterObjectsNVX RegisterObjectsNVX}
     *
     * @param objectCount the number of resources to register.
     */
    public static int nvkRegisterObjectsNVX(VkDevice device, long objectTable, int objectCount, long ppObjectTableEntries, long pObjectIndices) {
        long __functionAddress = device.getCapabilities().vkRegisterObjectsNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), objectTable, objectCount, ppObjectTableEntries, pObjectIndices, __functionAddress);
    }

    /**
     * Register resource bindings in an object table.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Resource bindings of Vulkan objects are registered at an arbitrary {@code uint32_t} index within an object table. As long as the object table references such objects, they <b>must</b> not be deleted.</p>
     * 
     * <pre><code>
     * VkResult vkRegisterObjectsNVX(
     *     VkDevice                                    device,
     *     VkObjectTableNVX                            objectTable,
     *     uint32_t                                    objectCount,
     *     const VkObjectTableEntryNVX* const*         ppObjectTableEntries,
     *     const uint32_t*                             pObjectIndices);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The contents of {@code pObjectTableEntry} <b>must</b> yield plausible bindings supported by the device.</li>
     * <li>At any {@code pObjectIndices} there <b>must</b> not be a registered resource already.</li>
     * <li>Any value inside {@code pObjectIndices} <b>must</b> be below the appropriate {@link VkObjectTableCreateInfoNVX}{@code ::pObjectEntryCounts} limits provided at {@code objectTable} creation time.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code objectTable} <b>must</b> be a valid {@code VkObjectTableNVX} handle</li>
     * <li>{@code ppObjectTableEntries} <b>must</b> be a valid pointer to an array of {@code objectCount} valid {@link VkObjectTableEntryNVX} structures</li>
     * <li>{@code pObjectIndices} <b>must</b> be a valid pointer to an array of {@code objectCount} {@code uint32_t} values</li>
     * <li>{@code objectCount} <b>must</b> be greater than 0</li>
     * <li>{@code objectTable} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code objectTable} <b>must</b> be externally synchronized</li>
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
     * <p>{@link VkObjectTableEntryNVX}</p>
     *
     * @param device               the logical device that creates the object table.
     * @param objectTable          the table for which the resources are registered.
     * @param ppObjectTableEntries provides an array for detailed binding informations. Each array element is a pointer to a structure of type {@link VkObjectTablePipelineEntryNVX}, {@link VkObjectTableDescriptorSetEntryNVX}, {@link VkObjectTableVertexBufferEntryNVX}, {@link VkObjectTableIndexBufferEntryNVX} or {@link VkObjectTablePushConstantEntryNVX} (see below for details).
     * @param pObjectIndices       are the indices at which each resource is registered.
     */
    @NativeType("VkResult")
    public static int vkRegisterObjectsNVX(VkDevice device, @NativeType("VkObjectTableNVX") long objectTable, @NativeType("VkObjectTableEntryNVX const * const *") PointerBuffer ppObjectTableEntries, @NativeType("uint32_t const *") IntBuffer pObjectIndices) {
        if (CHECKS) {
            check(pObjectIndices, ppObjectTableEntries.remaining());
        }
        return nvkRegisterObjectsNVX(device, objectTable, ppObjectTableEntries.remaining(), memAddress(ppObjectTableEntries), memAddress(pObjectIndices));
    }

    // --- [ vkUnregisterObjectsNVX ] ---

    /**
     * Unsafe version of: {@link #vkUnregisterObjectsNVX UnregisterObjectsNVX}
     *
     * @param objectCount the number of resources being removed from the object table.
     */
    public static int nvkUnregisterObjectsNVX(VkDevice device, long objectTable, int objectCount, long pObjectEntryTypes, long pObjectIndices) {
        long __functionAddress = device.getCapabilities().vkUnregisterObjectsNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), objectTable, objectCount, pObjectEntryTypes, pObjectIndices, __functionAddress);
    }

    /**
     * Unregister resource bindings in an object table.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Use the following command to unregister resources from an object table:</p>
     * 
     * <pre><code>
     * VkResult vkUnregisterObjectsNVX(
     *     VkDevice                                    device,
     *     VkObjectTableNVX                            objectTable,
     *     uint32_t                                    objectCount,
     *     const VkObjectEntryTypeNVX*                 pObjectEntryTypes,
     *     const uint32_t*                             pObjectIndices);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>At any {@code pObjectIndices} there <b>must</b> be a registered resource already.</li>
     * <li>The {@code pObjectEntryTypes} of the resource at {@code pObjectIndices} <b>must</b> match.</li>
     * <li>All operations on the device using the registered resource <b>must</b> have been completed.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code objectTable} <b>must</b> be a valid {@code VkObjectTableNVX} handle</li>
     * <li>{@code pObjectEntryTypes} <b>must</b> be a valid pointer to an array of {@code objectCount} valid {@code VkObjectEntryTypeNVX} values</li>
     * <li>{@code pObjectIndices} <b>must</b> be a valid pointer to an array of {@code objectCount} {@code uint32_t} values</li>
     * <li>{@code objectCount} <b>must</b> be greater than 0</li>
     * <li>{@code objectTable} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code objectTable} <b>must</b> be externally synchronized</li>
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
     * @param device         the logical device that creates the object table.
     * @param objectTable    the table from which the resources are unregistered.
     * @param pObjectIndices provides the array of object indices to be removed.
     */
    @NativeType("VkResult")
    public static int vkUnregisterObjectsNVX(VkDevice device, @NativeType("VkObjectTableNVX") long objectTable, @NativeType("VkObjectEntryTypeNVX const *") IntBuffer pObjectEntryTypes, @NativeType("uint32_t const *") IntBuffer pObjectIndices) {
        if (CHECKS) {
            check(pObjectIndices, pObjectEntryTypes.remaining());
        }
        return nvkUnregisterObjectsNVX(device, objectTable, pObjectEntryTypes.remaining(), memAddress(pObjectEntryTypes), memAddress(pObjectIndices));
    }

    // --- [ vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX GetPhysicalDeviceGeneratedCommandsPropertiesNVX} */
    public static void nvkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(VkPhysicalDevice physicalDevice, long pFeatures, long pLimits) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(physicalDevice.address(), pFeatures, pLimits, __functionAddress);
    }

    /**
     * Returns device-generated commands related properties of a physical device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the support of related features and limitations, call:</p>
     * 
     * <pre><code>
     * void vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(
     *     VkPhysicalDevice                            physicalDevice,
     *     VkDeviceGeneratedCommandsFeaturesNVX*       pFeatures,
     *     VkDeviceGeneratedCommandsLimitsNVX*         pLimits);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pFeatures} <b>must</b> be a valid pointer to a {@link VkDeviceGeneratedCommandsFeaturesNVX} structure</li>
     * <li>{@code pLimits} <b>must</b> be a valid pointer to a {@link VkDeviceGeneratedCommandsLimitsNVX} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDeviceGeneratedCommandsFeaturesNVX}, {@link VkDeviceGeneratedCommandsLimitsNVX}</p>
     *
     * @param physicalDevice the handle to the physical device whose properties will be queried.
     * @param pFeatures      a pointer to a {@link VkDeviceGeneratedCommandsFeaturesNVX} structure in which features are returned.
     * @param pLimits        a pointer to a {@link VkDeviceGeneratedCommandsLimitsNVX} structure in which limitations are returned.
     */
    public static void vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(VkPhysicalDevice physicalDevice, @NativeType("VkDeviceGeneratedCommandsFeaturesNVX *") VkDeviceGeneratedCommandsFeaturesNVX pFeatures, @NativeType("VkDeviceGeneratedCommandsLimitsNVX *") VkDeviceGeneratedCommandsLimitsNVX pLimits) {
        nvkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(physicalDevice, pFeatures.address(), pLimits.address());
    }

    /** Array version of: {@link #vkCreateIndirectCommandsLayoutNVX CreateIndirectCommandsLayoutNVX} */
    @NativeType("VkResult")
    public static int vkCreateIndirectCommandsLayoutNVX(VkDevice device, @NativeType("VkIndirectCommandsLayoutCreateInfoNVX const *") VkIndirectCommandsLayoutCreateInfoNVX pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkIndirectCommandsLayoutNVX *") long[] pIndirectCommandsLayout) {
        long __functionAddress = device.getCapabilities().vkCreateIndirectCommandsLayoutNVX;
        if (CHECKS) {
            check(__functionAddress);
            check(pIndirectCommandsLayout, 1);
            VkIndirectCommandsLayoutCreateInfoNVX.validate(pCreateInfo.address());
            if (pAllocator != null) { VkAllocationCallbacks.validate(pAllocator.address()); }
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pIndirectCommandsLayout, __functionAddress);
    }

    /** Array version of: {@link #vkCreateObjectTableNVX CreateObjectTableNVX} */
    @NativeType("VkResult")
    public static int vkCreateObjectTableNVX(VkDevice device, @NativeType("VkObjectTableCreateInfoNVX const *") VkObjectTableCreateInfoNVX pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkObjectTableNVX *") long[] pObjectTable) {
        long __functionAddress = device.getCapabilities().vkCreateObjectTableNVX;
        if (CHECKS) {
            check(__functionAddress);
            check(pObjectTable, 1);
            VkObjectTableCreateInfoNVX.validate(pCreateInfo.address());
            if (pAllocator != null) { VkAllocationCallbacks.validate(pAllocator.address()); }
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pObjectTable, __functionAddress);
    }

    /** Array version of: {@link #vkRegisterObjectsNVX RegisterObjectsNVX} */
    @NativeType("VkResult")
    public static int vkRegisterObjectsNVX(VkDevice device, @NativeType("VkObjectTableNVX") long objectTable, @NativeType("VkObjectTableEntryNVX const * const *") PointerBuffer ppObjectTableEntries, @NativeType("uint32_t const *") int[] pObjectIndices) {
        long __functionAddress = device.getCapabilities().vkRegisterObjectsNVX;
        if (CHECKS) {
            check(__functionAddress);
            check(pObjectIndices, ppObjectTableEntries.remaining());
        }
        return callPJPPI(device.address(), objectTable, ppObjectTableEntries.remaining(), memAddress(ppObjectTableEntries), pObjectIndices, __functionAddress);
    }

    /** Array version of: {@link #vkUnregisterObjectsNVX UnregisterObjectsNVX} */
    @NativeType("VkResult")
    public static int vkUnregisterObjectsNVX(VkDevice device, @NativeType("VkObjectTableNVX") long objectTable, @NativeType("VkObjectEntryTypeNVX const *") int[] pObjectEntryTypes, @NativeType("uint32_t const *") int[] pObjectIndices) {
        long __functionAddress = device.getCapabilities().vkUnregisterObjectsNVX;
        if (CHECKS) {
            check(__functionAddress);
            check(pObjectIndices, pObjectEntryTypes.length);
        }
        return callPJPPI(device.address(), objectTable, pObjectEntryTypes.length, pObjectEntryTypes, pObjectIndices, __functionAddress);
    }

}