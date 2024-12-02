/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension allows the device to generate a number of commands for command buffers. It provides a subset of functionality from both {@code VK_NV_device_generated_commands} and {@code VK_NV_device_generated_commands_compute} as well as some new features.
 * 
 * <p>When rendering a large number of objects, the device can be leveraged to implement a number of critical functions, like updating matrices, or implementing occlusion culling, frustum culling, front to back sorting, etc. Implementing those on the device does not require any special extension, since an application is free to define its own data structures, and just process them using shaders.</p>
 * 
 * <p>To render objects which have been processed on the device, Vulkan has several ways to perform indirect rendering, from the most basic {@code vkCmdDrawIndirect} with one indirect draw to {@code vkCmdDrawIndirectCount} which supports multiple indirect draws batched together, with a way to determine number of draws at device execution time.</p>
 * 
 * <p>However, if rendering state needs to change between the indirect draws, then unextended Vulkan forces the application to speculatively record a prohibitive number of redundant indirect commands covering all possible state combinations - which could end up processing nothing after culling - or read back the processed stream and issue graphics command from the host. For very large scenes, the synchronization overhead and cost to generate the command buffer can become the bottleneck. This extension allows an application to generate a device side stream of state changes and commands, and convert it efficiently into a command buffer without having to read it back to the host.</p>
 * 
 * <p>Furthermore, it allows incremental changes to such command buffers by manipulating only partial sections of a command stream — for example pipeline and shader object bindings. Unextended Vulkan requires re-creation of entire command buffers in such a scenario, or updates synchronized on the host.</p>
 * 
 * <p>The intended usage for this extension is for the application to:</p>
 * 
 * <ul>
 * <li>create {@code VkBuffer} objects and retrieve physical addresses from them via {@link VK12#vkGetBufferDeviceAddress GetBufferDeviceAddress}</li>
 * <li>create a {@code VkIndirectExecutionSetEXT} for the ability to change shaders on the device.</li>
 * <li>create a {@code VkIndirectCommandsLayoutEXT}, which lists the {@code VkIndirectCommandsTokenTypeEXT} it wants to dynamically execute as an atomic command sequence. This step likely involves some internal device code compilation, since the intent is for the GPU to generate the command buffer based on the layout.</li>
 * <li>fill the input stream buffers with the data for each of the inputs it needs. Each input is an array that will be filled with token-dependent data.</li>
 * <li>set up a preprocess {@code VkBuffer} that uses memory according to the information retrieved via {@link #vkGetGeneratedCommandsMemoryRequirementsEXT GetGeneratedCommandsMemoryRequirementsEXT}.</li>
 * <li>optionally preprocess the generated content using {@link #vkCmdPreprocessGeneratedCommandsEXT CmdPreprocessGeneratedCommandsEXT}, for example on an asynchronous compute queue, or for the purpose of re-using the data in multiple executions.</li>
 * <li>call {@link #vkCmdExecuteGeneratedCommandsEXT CmdExecuteGeneratedCommandsEXT} to create and execute the actual device commands for all sequences based on the inputs provided.</li>
 * </ul>
 * 
 * <p>For each draw in a sequence, the following can be specified:</p>
 * 
 * <ul>
 * <li>a number of vertex buffer bindings</li>
 * <li>a different index buffer, with an optional dynamic offset and index type</li>
 * <li>a number of different push constants</li>
 * <li>updates to bound shader stages</li>
 * </ul>
 * 
 * <p>For each dispatch in a sequence, the following can be specified:</p>
 * 
 * <ul>
 * <li>a number of different push constants</li>
 * <li>updates to bound shader stages</li>
 * </ul>
 * 
 * <p>For each trace rays in a sequence, the following can be specified:</p>
 * 
 * <ul>
 * <li>a number of different push constants</li>
 * <li>updates to bound shader stages</li>
 * </ul>
 * 
 * <p>While the GPU can be faster than a CPU to generate the commands, it will not happen asynchronously to the device, therefore the primary use case is generating “{@code less}” total work (occlusion culling, classification to use specialized shaders, etc.).</p>
 * 
 * <h5>Example Code</h5>
 * 
 * <p>TODO</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_device_generated_commands}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>573</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRBufferDeviceAddress VK_KHR_buffer_device_address} and {@link KHRMaintenance5 VK_KHR_maintenance5}</dd>
 * <dt><b>API Interactions</b></dt>
 * <dd><ul>
 * <li>Interacts with VK_EXT_shader_object</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Mike Blumenkrantz <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_device_generated_commands]%20@zmike%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_device_generated_commands%20extension*">zmike</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_device_generated_commands.adoc">VK_EXT_device_generated_commands</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2024-02-23</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires Vulkan 1.1</li>
 * <li>This extension requires {@code VK_EXT_buffer_device_address} or {@code VK_KHR_buffer_device_address} or Vulkan 1.2 for the ability to bind vertex and index buffers on the device.</li>
 * <li>This extension requires {@code VK_KHR_maintenance5} for the ability to use VkPipelineCreateFlags2KHR.</li>
 * <li>This extension interacts with {@code VK_NV_mesh_shader}. If the latter extension is not supported, remove the command tokens to initiate NV mesh tasks drawing in this extension.</li>
 * <li>This extension interacts with {@code VK_EXT_mesh_shader}. If the latter extension is not supported, remove the command tokens to initiate EXT mesh tasks drawing in this extension.</li>
 * <li>This extension interacts with {@code VK_KHR_ray_tracing_pipeline}. If the latter extension is not supported, remove the command tokens to initiate ray tracing in this extension.</li>
 * <li>This extension interacts with {@code VK_EXT_shader_object}. If the latter extension is not supported, remove references to shader objects in this extension.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Mike Blumenkrantz, VALVE</li>
 * <li>Hans-Kristian Arntzen, VALVE</li>
 * <li>Jan-Harald Fredriksen, ARM</li>
 * <li>Spencer Fricke, LunarG</li>
 * <li>Ricardo Garcia, Igalia</li>
 * <li>Tobias Hector, AMD</li>
 * <li>Baldur Karlsson, VALVE</li>
 * <li>Christoph Kubisch, NVIDIA</li>
 * <li>Lionel Landwerlin, INTEL</li>
 * <li>Jon Leech, Khronos</li>
 * <li>Ting Wei, ARM</li>
 * <li>Ken Shanyi Zhang, AMD</li>
 * <li>Faith Ekstrand, Collabora</li>
 * <li>Vikram Kushwaha, NVIDIA</li>
 * <li>Connor Abbott, VALVE</li>
 * <li>Samuel Pitoiset, VALVE</li>
 * </ul></dd>
 * </dl>
 */
public class EXTDeviceGeneratedCommands {

    /** The extension specification version. */
    public static final int VK_EXT_DEVICE_GENERATED_COMMANDS_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME = "VK_EXT_device_generated_commands";

    /** Extends {@code VkShaderCreateFlagBitsEXT}. */
    public static final int VK_SHADER_CREATE_INDIRECT_BINDABLE_BIT_EXT = 0x80;

    /** Extends {@code VkBufferUsageFlagBits2KHR}. */
    public static final long VK_BUFFER_USAGE_2_PREPROCESS_BUFFER_BIT_EXT = 0x80000000L;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_EXT STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_CREATE_INFO_EXT STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_CREATE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_EXT STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_PIPELINE_EXT STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_PIPELINE_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_SHADER_EXT STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_SHADER_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_LAYOUT_INFO_EXT STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_LAYOUT_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_GENERATED_COMMANDS_PIPELINE_INFO_EXT STRUCTURE_TYPE_GENERATED_COMMANDS_PIPELINE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_GENERATED_COMMANDS_SHADER_INFO_EXT STRUCTURE_TYPE_GENERATED_COMMANDS_SHADER_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_EXT   = 1000572000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_EXT = 1000572001,
        VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_EXT          = 1000572002,
        VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_CREATE_INFO_EXT                   = 1000572003,
        VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT                              = 1000572004,
        VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT                 = 1000572006,
        VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_EXT                       = 1000572007,
        VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_PIPELINE_EXT                = 1000572008,
        VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_SHADER_EXT                  = 1000572009,
        VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT                 = 1000572010,
        VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT                   = 1000572011,
        VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_LAYOUT_INFO_EXT            = 1000572012,
        VK_STRUCTURE_TYPE_GENERATED_COMMANDS_PIPELINE_INFO_EXT                     = 1000572013,
        VK_STRUCTURE_TYPE_GENERATED_COMMANDS_SHADER_INFO_EXT                       = 1000572014;

    /**
     * Extends {@code VkObjectType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_EXT OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_EXT}</li>
     * <li>{@link #VK_OBJECT_TYPE_INDIRECT_EXECUTION_SET_EXT OBJECT_TYPE_INDIRECT_EXECUTION_SET_EXT}</li>
     * </ul>
     */
    public static final int
        VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_EXT = 1000572000,
        VK_OBJECT_TYPE_INDIRECT_EXECUTION_SET_EXT   = 1000572001;

    /** Extends {@code VkPipelineCreateFlagBits2KHR}. */
    public static final long VK_PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_EXT = 0x4000000000L;

    /** Extends {@code VkPipelineStageFlagBits}. */
    public static final int VK_PIPELINE_STAGE_COMMAND_PREPROCESS_BIT_EXT = 0x20000;

    /**
     * Extends {@code VkAccessFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_COMMAND_PREPROCESS_READ_BIT_EXT ACCESS_COMMAND_PREPROCESS_READ_BIT_EXT}</li>
     * <li>{@link #VK_ACCESS_COMMAND_PREPROCESS_WRITE_BIT_EXT ACCESS_COMMAND_PREPROCESS_WRITE_BIT_EXT}</li>
     * </ul>
     */
    public static final int
        VK_ACCESS_COMMAND_PREPROCESS_READ_BIT_EXT  = 0x20000,
        VK_ACCESS_COMMAND_PREPROCESS_WRITE_BIT_EXT = 0x40000;

    /**
     * VkIndirectCommandsInputModeFlagBitsEXT - Bitmask specifying allowed usage of an indirect commands layout
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_INDIRECT_COMMANDS_INPUT_MODE_VULKAN_INDEX_BUFFER_EXT INDIRECT_COMMANDS_INPUT_MODE_VULKAN_INDEX_BUFFER_EXT} indicates that the indirect buffer contains {@link VkBindIndexBufferIndirectCommandEXT}.</li>
     * <li>{@link #VK_INDIRECT_COMMANDS_INPUT_MODE_DXGI_INDEX_BUFFER_EXT INDIRECT_COMMANDS_INPUT_MODE_DXGI_INDEX_BUFFER_EXT} indicates that the indirect buffer contains {@code D3D12_INDEX_BUFFER_VIEW}.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkIndirectCommandsIndexBufferTokenEXT}</p>
     */
    public static final int
        VK_INDIRECT_COMMANDS_INPUT_MODE_VULKAN_INDEX_BUFFER_EXT = 0x1,
        VK_INDIRECT_COMMANDS_INPUT_MODE_DXGI_INDEX_BUFFER_EXT   = 0x2;

    /**
     * VkIndirectExecutionSetInfoTypeEXT - Enum specifying allowed usage of an indirect execution set
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_INDIRECT_EXECUTION_SET_INFO_TYPE_PIPELINES_EXT INDIRECT_EXECUTION_SET_INFO_TYPE_PIPELINES_EXT} specifies that the indirect execution set contains {@code VkPipeline} objects.</li>
     * <li>{@link #VK_INDIRECT_EXECUTION_SET_INFO_TYPE_SHADER_OBJECTS_EXT INDIRECT_EXECUTION_SET_INFO_TYPE_SHADER_OBJECTS_EXT} specifies that the indirect execution set contains {@code VkShaderEXT} objects.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkIndirectCommandsExecutionSetTokenEXT}, {@link VkIndirectExecutionSetCreateInfoEXT}</p>
     */
    public static final int
        VK_INDIRECT_EXECUTION_SET_INFO_TYPE_PIPELINES_EXT      = 0,
        VK_INDIRECT_EXECUTION_SET_INFO_TYPE_SHADER_OBJECTS_EXT = 1;

    /**
     * VkIndirectCommandsLayoutUsageFlagBitsEXT - Bitmask specifying allowed usage of an indirect commands layout
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_EXT INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_EXT} specifies that the layout is always used with the manual preprocessing step through calling {@link #vkCmdPreprocessGeneratedCommandsEXT CmdPreprocessGeneratedCommandsEXT} and executed by {@link #vkCmdExecuteGeneratedCommandsEXT CmdExecuteGeneratedCommandsEXT} with {@code isPreprocessed} set to {@link VK10#VK_TRUE TRUE}.</li>
     * <li>{@link #VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_EXT INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_EXT} specifies that the processing of sequences will happen at an implementation-dependent order, which is not guaranteed to be deterministic using the same input data. This flag is ignored when the {@code shaderStages} is {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT} as it is implied that the dispatch sequence is always unordered.</li>
     * </ul>
     */
    public static final int
        VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_EXT = 0x1,
        VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_EXT = 0x2;

    /**
     * VkIndirectCommandsTokenTypeEXT - Enum specifying token commands
     * 
     * <h5>Description</h5>
     * 
     * <h6>Supported Indirect Command Tokens</h6>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><b>Common Tokens</b></th><th><b>Command Data</b></th></tr></thead>
     * <tbody>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT}</td><td>{@code u32[]} array of indices into the indirect execution set</td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT}</td><td>{@code u32[]} raw data</td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT}</td><td>{@code u32} placeholder data (not accessed by shader)</td></tr>
     * <tr><td><b>Compute Tokens</b></td><td></td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_EXT INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_EXT}</td><td>{@link VkDispatchIndirectCommand}</td></tr>
     * <tr><td><b>Ray Tracing Tokens</b></td><td></td></tr>
     * <tr><td>{@link KHRRayTracingMaintenance1#VK_INDIRECT_COMMANDS_TOKEN_TYPE_TRACE_RAYS2_EXT INDIRECT_COMMANDS_TOKEN_TYPE_TRACE_RAYS2_EXT}</td><td>{@link VkTraceRaysIndirectCommand2KHR}</td></tr>
     * <tr><td><b>Graphics State Tokens</b></td><td></td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_EXT INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_EXT}</td><td>{@link VkBindIndexBufferIndirectCommandEXT}</td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_EXT INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_EXT}</td><td>{@link VkBindVertexBufferIndirectCommandEXT}</td></tr>
     * <tr><td><b>Graphics Draw Tokens</b></td><td></td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_EXT INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_EXT}</td><td>{@link VkDrawIndexedIndirectCommand}</td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_EXT INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_EXT}</td><td>{@link VkDrawIndirectCommand}</td></tr>
     * <tr><td>{@link EXTMeshShader#VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_EXT INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_EXT}</td><td>{@link VkDrawMeshTasksIndirectCommandEXT}</td></tr>
     * <tr><td>{@link NVMeshShader#VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_NV_EXT INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_NV_EXT}</td><td>{@link VkDrawMeshTasksIndirectCommandNV}</td></tr>
     * <tr><td><b>Graphics Draw Count Tokens</b></td><td></td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_COUNT_EXT INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_COUNT_EXT}</td><td>{@link VkDrawIndirectCountIndirectCommandEXT} with VkDrawIndexedIndirectCommand</td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_COUNT_EXT INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_COUNT_EXT}</td><td>{@link VkDrawIndirectCountIndirectCommandEXT} with VkDrawIndirectCommand</td></tr>
     * <tr><td>{@link EXTMeshShader#VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_COUNT_EXT INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_COUNT_EXT}</td><td>{@link VkDrawIndirectCountIndirectCommandEXT} with VkDrawMeshTasksIndirectCommandEXT</td></tr>
     * <tr><td>{@link NVMeshShader#VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_COUNT_NV_EXT INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_COUNT_NV_EXT}</td><td>{@link VkDrawIndirectCountIndirectCommandEXT} with VkDrawMeshTasksIndirectCommandNV</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkIndirectCommandsLayoutTokenEXT}</p>
     */
    public static final int
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT      = 0,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT      = 1,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT     = 2,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_EXT       = 3,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_EXT      = 4,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_EXT       = 5,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_EXT               = 6,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_COUNT_EXT = 7,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_COUNT_EXT         = 8,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_EXT           = 9;

    protected EXTDeviceGeneratedCommands() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetGeneratedCommandsMemoryRequirementsEXT ] ---

    /** Unsafe version of: {@link #vkGetGeneratedCommandsMemoryRequirementsEXT GetGeneratedCommandsMemoryRequirementsEXT} */
    public static void nvkGetGeneratedCommandsMemoryRequirementsEXT(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetGeneratedCommandsMemoryRequirementsEXT;
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
     * <p>With {@link EXTDeviceGeneratedCommands VK_EXT_device_generated_commands}, to retrieve the memory size and alignment requirements of a particular execution state call:</p>
     * 
     * <pre><code>
     * void vkGetGeneratedCommandsMemoryRequirementsEXT(
     *     VkDevice                                    device,
     *     const VkGeneratedCommandsMemoryRequirementsInfoEXT* pInfo,
     *     VkMemoryRequirements2*                      pMemoryRequirements);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If the size returned is zero, the preprocessing step can be skipped for this layout.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkGeneratedCommandsMemoryRequirementsInfoEXT} structure</li>
     * <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a {@link VkMemoryRequirements2} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkGeneratedCommandsMemoryRequirementsInfoEXT}, {@link VkMemoryRequirements2}</p>
     *
     * @param device              the logical device that owns the buffer.
     * @param pInfo               a pointer to a {@link VkGeneratedCommandsMemoryRequirementsInfoEXT} structure containing parameters required for the memory requirements query.
     * @param pMemoryRequirements a pointer to a {@link VkMemoryRequirements2} structure in which the memory requirements of the buffer object are returned.
     */
    public static void vkGetGeneratedCommandsMemoryRequirementsEXT(VkDevice device, @NativeType("VkGeneratedCommandsMemoryRequirementsInfoEXT const *") VkGeneratedCommandsMemoryRequirementsInfoEXT pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetGeneratedCommandsMemoryRequirementsEXT(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkCmdPreprocessGeneratedCommandsEXT ] ---

    /** Unsafe version of: {@link #vkCmdPreprocessGeneratedCommandsEXT CmdPreprocessGeneratedCommandsEXT} */
    public static void nvkCmdPreprocessGeneratedCommandsEXT(VkCommandBuffer commandBuffer, long pGeneratedCommandsInfo, VkCommandBuffer stateCommandBuffer) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPreprocessGeneratedCommandsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(commandBuffer.address(), pGeneratedCommandsInfo, stateCommandBuffer.address(), __functionAddress);
    }

    /**
     * Performs preprocessing for generated commands.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Commands <b>can</b> be preprocessed prior execution using the following command:</p>
     * 
     * <pre><code>
     * void vkCmdPreprocessGeneratedCommandsEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkGeneratedCommandsInfoEXT*           pGeneratedCommandsInfo,
     *     VkCommandBuffer                             stateCommandBuffer);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>{@code stateCommandBuffer} access is not synchronized by the driver, meaning that this command buffer <b>must</b> not be modified between threads in an unsafe manner.</p>
     * </div>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
     * <li>{@code pGeneratedCommandsInfo}’s {@code indirectCommandsLayout} <b>must</b> have been created with the {@link #VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_EXT INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_EXT} bit set</li>
     * <li>If the token sequence of the passed {@link VkGeneratedCommandsInfoEXT}{@code ::indirectCommandsLayout} contains a {@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT} token, the initial shader state of {@link VkGeneratedCommandsInfoEXT}{@code ::indirectExecutionSet} <b>must</b> be bound on {@code stateCommandBuffer}</li>
     * <li>{@code stateCommandBuffer} <b>must</b> be in the recording state</li>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-deviceGeneratedCommands">{@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT}{@code ::deviceGeneratedCommands}</a> feature <b>must</b> be enabled</li>
     * <li>Only stages specified in <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-supportedIndirectCommandsShaderStages">{@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT}{@code ::supportedIndirectCommandsShaderStages}</a> <b>can</b> be set in {@code pGeneratedCommandsInfo→shaderStages}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pGeneratedCommandsInfo} <b>must</b> be a valid pointer to a valid {@link VkGeneratedCommandsInfoEXT} structure</li>
     * <li>{@code stateCommandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
     * <li>Both of {@code commandBuffer}, and {@code stateCommandBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to {@code stateCommandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary</td><td>Outside</td><td>Outside</td><td>Graphics Compute</td><td>Action</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkGeneratedCommandsInfoEXT}</p>
     *
     * @param commandBuffer          the command buffer which does the preprocessing.
     * @param pGeneratedCommandsInfo a pointer to a {@link VkGeneratedCommandsInfoEXT} structure containing parameters affecting the preprocessing step.
     * @param stateCommandBuffer     a command buffer from which to snapshot current states affecting the preprocessing step. When a graphics command action token is used, graphics state is snapshotted. When a compute action command token is used, compute state is snapshotted. When a ray tracing action command token is used, ray tracing state is snapshotted. It can be deleted at any time after this command has been recorded.
     */
    public static void vkCmdPreprocessGeneratedCommandsEXT(VkCommandBuffer commandBuffer, @NativeType("VkGeneratedCommandsInfoEXT const *") VkGeneratedCommandsInfoEXT pGeneratedCommandsInfo, VkCommandBuffer stateCommandBuffer) {
        nvkCmdPreprocessGeneratedCommandsEXT(commandBuffer, pGeneratedCommandsInfo.address(), stateCommandBuffer);
    }

    // --- [ vkCmdExecuteGeneratedCommandsEXT ] ---

    /** Unsafe version of: {@link #vkCmdExecuteGeneratedCommandsEXT CmdExecuteGeneratedCommandsEXT} */
    public static void nvkCmdExecuteGeneratedCommandsEXT(VkCommandBuffer commandBuffer, int isPreprocessed, long pGeneratedCommandsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdExecuteGeneratedCommandsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), isPreprocessed, pGeneratedCommandsInfo, __functionAddress);
    }

    /**
     * Generate and execute commands on the device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>With {@link EXTDeviceGeneratedCommands VK_EXT_device_generated_commands}, the actual generation of commands as well as their execution on the device is handled as single action with:</p>
     * 
     * <pre><code>
     * void vkCmdExecuteGeneratedCommandsEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    isPreprocessed,
     *     const VkGeneratedCommandsInfoEXT*           pGeneratedCommandsInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If the {@link #VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_EXT INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_EXT} flag was used to create the {@link VkGeneratedCommandsInfoEXT}{@code ::indirectCommandsLayout} then the execution of sequences through this command <b>may</b> use implementation-defined ordering which is not guaranteed to be coherent using the same input data. It does not affect the order of token processing within a sequence. This is the implied ordering with {@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_EXT INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_EXT}.</p>
     * 
     * <p>After a call to {@code vkCmdExecuteGeneratedCommandsEXT}, command buffer state will become undefined according to the tokens executed. This table specifies the relationship between tokens used and state invalidation.</p>
     * 
     * <h6>Indirect Execution State Invalidation</h6>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><b>Common Tokens</b></th><th><b>States Invalidated</b></th></tr></thead>
     * <tbody>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT}</td><td>Bound shaders and pipelines</td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT}</td><td>Push constant data</td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT}</td><td>Push constant data</td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_EXT INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_EXT}</td><td>Index buffer</td></tr>
     * <tr><td>{@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_EXT INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_EXT}</td><td>Vertex buffer</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If a {@code VkSampler} created with {@code magFilter} or {@code minFilter} equal to {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR}, {@code reductionMode} equal to {@link VK12#VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE}, and {@code compareEnable} equal to {@link VK10#VK_FALSE FALSE} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</li>
     * <li>If a {@code VkSampler} created with {@code magFilter} or {@code minFilter} equal to {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR} and {@code reductionMode} equal to either {@link VK12#VK_SAMPLER_REDUCTION_MODE_MIN SAMPLER_REDUCTION_MODE_MIN} or {@link VK12#VK_SAMPLER_REDUCTION_MODE_MAX SAMPLER_REDUCTION_MODE_MAX} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK12#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT}</li>
     * <li>If a {@code VkSampler} created with {@code mipmapMode} equal to {@link VK10#VK_SAMPLER_MIPMAP_MODE_LINEAR SAMPLER_MIPMAP_MODE_LINEAR}, {@code reductionMode} equal to {@link VK12#VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE}, and {@code compareEnable} equal to {@link VK10#VK_FALSE FALSE} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</li>
     * <li>If a {@code VkSampler} created with {@code mipmapMode} equal to {@link VK10#VK_SAMPLER_MIPMAP_MODE_LINEAR SAMPLER_MIPMAP_MODE_LINEAR} and {@code reductionMode} equal to either {@link VK12#VK_SAMPLER_REDUCTION_MODE_MIN SAMPLER_REDUCTION_MODE_MIN} or {@link VK12#VK_SAMPLER_REDUCTION_MODE_MAX SAMPLER_REDUCTION_MODE_MAX} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK12#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT}</li>
     * <li>If a {@code VkSampler} created with {@code unnormalizedCoordinates} equal to {@link VK10#VK_TRUE TRUE} is used to sample a {@code VkImageView} as a result of this command, then the image view’s {@code levelCount} and {@code layerCount} <b>must</b> be 1</li>
     * <li>If a {@code VkSampler} created with {@code unnormalizedCoordinates} equal to {@link VK10#VK_TRUE TRUE} is used to sample a {@code VkImageView} as a result of this command, then the image view’s {@code viewType} <b>must</b> be {@link VK10#VK_IMAGE_VIEW_TYPE_1D IMAGE_VIEW_TYPE_1D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D}</li>
     * <li>If a {@code VkImageView} is sampled with <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#textures-depth-compare-operation">depth comparison</a>, the image view’s <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT}</li>
     * <li>If a {@code VkImageView} is accessed using atomic operations as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT}</li>
     * <li>If a {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} descriptor is accessed using atomic operations as a result of this command, then the storage texel buffer’s <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#resources-buffer-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT}</li>
     * <li>If a {@code VkImageView} is sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link EXTFilterCubic#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT}</li>
     * <li>If the {@link EXTFilterCubic VK_EXT_filter_cubic} extension is not enabled and any {@code VkImageView} is sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command, it <b>must</b> not have a {@code VkImageViewType} of {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, or {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}</li>
     * <li>Any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering, as specified by {@link VkFilterCubicImageViewImageFormatPropertiesEXT}{@code ::filterCubic} returned by {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2}</li>
     * <li>Any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} with a reduction mode of either {@link VK12#VK_SAMPLER_REDUCTION_MODE_MIN SAMPLER_REDUCTION_MODE_MIN} or {@link VK12#VK_SAMPLER_REDUCTION_MODE_MAX SAMPLER_REDUCTION_MODE_MAX} as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering together with minmax filtering, as specified by {@link VkFilterCubicImageViewImageFormatPropertiesEXT}{@code ::filterCubicMinmax} returned by {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-filter-cubic-range-clamp">{@code cubicRangeClamp}</a> feature is not enabled, then any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command <b>must</b> not have a {@link VkSamplerReductionModeCreateInfo}{@code ::reductionMode} equal to {@link QCOMFilterCubicClamp#VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM}</li>
     * <li>Any {@code VkImageView} being sampled with a {@link VkSamplerReductionModeCreateInfo}{@code ::reductionMode} equal to {@link QCOMFilterCubicClamp#VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM} as a result of this command <b>must</b> sample with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-filter-cubic-weight-selection">{@code selectableCubicWeights}</a> feature is not enabled, then any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command <b>must</b> have {@link VkSamplerCubicWeightsCreateInfoQCOM}{@code ::cubicWeights} equal to {@link QCOMFilterCubicWeights#VK_CUBIC_FILTER_WEIGHTS_CATMULL_ROM_QCOM CUBIC_FILTER_WEIGHTS_CATMULL_ROM_QCOM}</li>
     * <li>Any {@code VkImage} created with a {@link VkImageCreateInfo}{@code ::flags} containing {@link NVCornerSampledImage#VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV IMAGE_CREATE_CORNER_SAMPLED_BIT_NV} sampled as a result of this command <b>must</b> only be sampled using a {@code VkSamplerAddressMode} of {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE}</li>
     * <li>For any {@code VkImageView} being written as a storage image where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT}</li>
     * <li>For any {@code VkImageView} being read as a storage image where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT}</li>
     * <li>For any {@code VkBufferView} being written as a storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkFormatProperties3">buffer features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT}</li>
     * <li>Any {@code VkBufferView} being read as a storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown} then the view’s <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkFormatProperties3">buffer features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT}</li>
     * <li>For each set <em>n</em> that is statically used by <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#shaders-binding">a bound shader</a>, a descriptor set <b>must</b> have been bound to <em>n</em> at the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline} or the {@code VkDescriptorSetLayout} array used to create the current {@code VkShaderEXT} , as described in <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>For each push constant that is statically used by <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#shaders-binding">a bound shader</a>, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline} or the {@code VkDescriptorSetLayout} array used to create the current {@code VkShaderEXT} , as described in <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>For each array of resources that is used by <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#shaders-binding">a bound shader</a>, the indices used to access members of the array <b>must</b> be less than the descriptor count for the identified binding in the descriptor sets used by this command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-maintenance4">{@code maintenance4}</a> feature is not enabled, then for each push constant that is statically used by <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#shaders-binding">a bound shader</a>, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline} or the {@code VkDescriptorSetLayout} and {@link VkPushConstantRange} arrays used to create the current {@code VkShaderEXT} , as described in <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>Descriptors in each bound descriptor set, specified via {@link VK10#vkCmdBindDescriptorSets CmdBindDescriptorSets}, <b>must</b> be valid as described by <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#descriptor-validity">descriptor validity</a> if they are statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command and the bound {@code VkPipeline} was not created with {@link EXTDescriptorBuffer#VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * <li>If the descriptors used by the {@code VkPipeline} bound to the pipeline bind point were specified via {@link VK10#vkCmdBindDescriptorSets CmdBindDescriptorSets}, the bound {@code VkPipeline} <b>must</b> have been created without {@link EXTDescriptorBuffer#VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * <li>Descriptors in bound descriptor buffers, specified via {@link EXTDescriptorBuffer#vkCmdSetDescriptorBufferOffsetsEXT CmdSetDescriptorBufferOffsetsEXT}, <b>must</b> be valid if they are dynamically used by the {@code VkPipeline} bound to the pipeline bind point used by this command and the bound {@code VkPipeline} was created with {@link EXTDescriptorBuffer#VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * <li>Descriptors in bound descriptor buffers, specified via {@link EXTDescriptorBuffer#vkCmdSetDescriptorBufferOffsetsEXT CmdSetDescriptorBufferOffsetsEXT}, <b>must</b> be valid if they are dynamically used by any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command</li>
     * <li>If the descriptors used by the {@code VkPipeline} bound to the pipeline bind point were specified via {@link EXTDescriptorBuffer#vkCmdSetDescriptorBufferOffsetsEXT CmdSetDescriptorBufferOffsetsEXT}, the bound {@code VkPipeline} <b>must</b> have been created with {@link EXTDescriptorBuffer#VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * <li>If a descriptor is dynamically used with a {@code VkPipeline} created with {@link EXTDescriptorBuffer#VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}, the descriptor memory <b>must</b> be resident</li>
     * <li>If a descriptor is dynamically used with a {@code VkShaderEXT} created with a {@code VkDescriptorSetLayout} that was created with {@link EXTDescriptorBuffer#VK_DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}, the descriptor memory <b>must</b> be resident</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature is not enabled, a valid pipeline <b>must</b> be bound to the pipeline bind point used by this command</li>
     * <li>If a pipeline is bound to the pipeline bind point used by this command, there <b>must</b> not have been any calls to dynamic state setting commands for any state specified statically in the {@code VkPipeline} object bound to the pipeline bind point used by this command, since that pipeline was bound</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link VK10#VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-shaderObject">{@code shaderObject}</a> feature is enabled, either a valid pipeline <b>must</b> be bound to the pipeline bind point used by this command, or a valid combination of valid and {@link VK10#VK_NULL_HANDLE NULL_HANDLE} shader objects <b>must</b> be bound to every supported shader stage corresponding to the pipeline bind point used by this command</li>
     * <li>If any stage of the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a uniform buffer, and that stage was created without enabling either {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT} or {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT} for {@code uniformBuffers}, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, that stage <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, and any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a uniform buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If any stage of the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a storage buffer, and that stage was created without enabling either {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT} or {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT} for {@code storageBuffers}, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, that stage <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, and any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a storage buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer and <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, any resource accessed by <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#shaders-binding">bound shaders</a> <b>must</b> not be a protected resource</li>
     * <li>If <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#shaders-binding">a bound shader</a> accesses a {@code VkSampler} or {@code VkImageView} object that enables <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> only be used with {@code OpImageSample*} or {@code OpImageSparseSample*} instructions</li>
     * <li>If <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#shaders-binding">a bound shader</a> accesses a {@code VkSampler} or {@code VkImageView} object that enables <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> not use the {@code ConstOffset} and {@code Offset} operands</li>
     * <li>If a {@code VkImageView} is accessed as a result of this command, then the image view’s {@code viewType} <b>must</b> match the {@code Dim} operand of the {@code OpTypeImage} as described in <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#spirvenv-image-dimensions">Compatibility Between SPIR-V Image Dimensions and Vulkan ImageView Types</a></li>
     * <li>If a {@code VkImageView} is accessed as a result of this command, then the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-numericformat">numeric type</a> of the image view’s {@code format} and the {@code Sampled} {@code Type} operand of the {@code OpTypeImage} <b>must</b> match</li>
     * <li>If a {@code VkImageView} created with a format other than {@link KHRMaintenance5#VK_FORMAT_A8_UNORM_KHR FORMAT_A8_UNORM_KHR} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have at least as many components as the image view’s format</li>
     * <li>If a {@code VkImageView} created with the format {@link KHRMaintenance5#VK_FORMAT_A8_UNORM_KHR FORMAT_A8_UNORM_KHR} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have four components</li>
     * <li>If a {@code VkBufferView} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have at least as many components as the buffer view’s format</li>
     * <li>If a {@code VkImageView} with a {@code VkFormat} that has a 64-bit component width is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 64</li>
     * <li>If a {@code VkImageView} with a {@code VkFormat} that has a component width less than 64-bit is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 32</li>
     * <li>If a {@code VkBufferView} with a {@code VkFormat} that has a 64-bit component width is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 64</li>
     * <li>If a {@code VkBufferView} with a {@code VkFormat} that has a component width less than 64-bit is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 32</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-sparseImageInt64Atomics">{@code sparseImageInt64Atomics}</a> feature is not enabled, {@code VkImage} objects created with the {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} flag <b>must</b> not be accessed by atomic instructions through an {@code OpTypeImage} with a {@code SampledType} with a {@code Width} of 64 by this command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-sparseImageInt64Atomics">{@code sparseImageInt64Atomics}</a> feature is not enabled, {@code VkBuffer} objects created with the {@link VK10#VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT BUFFER_CREATE_SPARSE_RESIDENCY_BIT} flag <b>must</b> not be accessed by atomic instructions through an {@code OpTypeImage} with a {@code SampledType} with a {@code Width} of 64 by this command</li>
     * <li>If {@code OpImageWeightedSampleQCOM} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_WEIGHT_SAMPLED_IMAGE_BIT_QCOM FORMAT_FEATURE_2_WEIGHT_SAMPLED_IMAGE_BIT_QCOM}</li>
     * <li>If {@code OpImageWeightedSampleQCOM} uses a {@code VkImageView} as a sample weight image as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_WEIGHT_IMAGE_BIT_QCOM FORMAT_FEATURE_2_WEIGHT_IMAGE_BIT_QCOM}</li>
     * <li>If {@code OpImageBoxFilterQCOM} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_BOX_FILTER_SAMPLED_BIT_QCOM FORMAT_FEATURE_2_BOX_FILTER_SAMPLED_BIT_QCOM}</li>
     * <li>If {@code OpImageBlockMatchSSDQCOM} is used to read from an {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM}</li>
     * <li>If {@code OpImageBlockMatchSADQCOM} is used to read from an {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM}</li>
     * <li>If {@code OpImageBlockMatchSADQCOM} or OpImageBlockMatchSSDQCOM is used to read from a reference image as result of this command, then the specified reference coordinates <b>must</b> not fail <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#textures-integer-coordinate-validation">integer texel coordinate validation</a></li>
     * <li>If {@code OpImageWeightedSampleQCOM}, {@code OpImageBoxFilterQCOM}, {@code OpImageBlockMatchWindowSSDQCOM}, {@code OpImageBlockMatchWindowSADQCOM}, {@code OpImageBlockMatchGatherSSDQCOM}, {@code OpImageBlockMatchGatherSADQCOM}, {@code OpImageBlockMatchSSDQCOM}, or {@code OpImageBlockMatchSADQCOM} uses a {@code VkSampler} as a result of this command, then the sampler <b>must</b> have been created with {@link QCOMImageProcessing#VK_SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM}</li>
     * <li>If any command other than {@code OpImageWeightedSampleQCOM}, {@code OpImageBoxFilterQCOM}, {@code OpImageBlockMatchWindowSSDQCOM}, {@code OpImageBlockMatchWindowSADQCOM}, {@code OpImageBlockMatchGatherSSDQCOM}, {@code OpImageBlockMatchGatherSADQCOM}, {@code OpImageBlockMatchSSDQCOM}, or {@code OpImageBlockMatchSADQCOM} uses a {@code VkSampler} as a result of this command, then the sampler <b>must</b> not have been created with {@link QCOMImageProcessing#VK_SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM}</li>
     * <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} instruction is used to read from an {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link QCOMImageProcessing#VK_FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM}</li>
     * <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} instruction is used to read from an {@code VkImageView} as a result of this command, then the image view’s format <b>must</b> be a single-component format</li>
     * <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} read from a reference image as result of this command, then the specified reference coordinates <b>must</b> not fail <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#textures-integer-coordinate-validation">integer texel coordinate validation</a></li>
     * <li>Any shader invocation executed by this command <b>must</b> <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#shaders-termination">terminate</a></li>
     * <li>If a descriptor with type equal to any of {@link QCOMImageProcessing#VK_DESCRIPTOR_TYPE_SAMPLE_WEIGHT_IMAGE_QCOM DESCRIPTOR_TYPE_SAMPLE_WEIGHT_IMAGE_QCOM}, {@link QCOMImageProcessing#VK_DESCRIPTOR_TYPE_BLOCK_MATCH_IMAGE_QCOM DESCRIPTOR_TYPE_BLOCK_MATCH_IMAGE_QCOM}, {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, or {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT} is accessed as a result of this command, the image subresource identified by that descriptor <b>must</b> be in the image layout identified when the descriptor was written</li>
     * <li>The current render pass <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
     * <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
     * <li>If any shader statically accesses an input attachment, a valid descriptor <b>must</b> be bound to the pipeline via a descriptor set</li>
     * <li>If any shader executed by this pipeline accesses an {@code OpTypeImage} variable with a {@code Dim} operand of {@code SubpassData}, it <b>must</b> be decorated with an {@code InputAttachmentIndex} that corresponds to a valid input attachment in the current subpass</li>
     * <li>Input attachment views accessed in a subpass <b>must</b> be created with the same {@code VkFormat} as the corresponding subpass definition, and be created with a {@code VkImageView} that is compatible with the attachment referenced by the subpass' {@code pInputAttachments}[{@code InputAttachmentIndex}] in the currently bound {@code VkFramebuffer} as specified by <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#compatibility-inputattachment">Fragment Input Attachment Compatibility</a></li>
     * <li>Input attachment views accessed in a dynamic render pass with a {@code InputAttachmentIndex} referenced by {@link VkRenderingInputAttachmentIndexInfoKHR}, or no {@code InputAttachmentIndex} if {@link VkRenderingInputAttachmentIndexInfoKHR}:{@code pDepthInputAttachmentIndex} or {@link VkRenderingInputAttachmentIndexInfoKHR}:{@code pStencilInputAttachmentIndex} are {@code NULL}, <b>must</b> be created with a {@code VkImageView} that is compatible with the corresponding color, depth, or stencil attachment in {@link VkRenderingInfo}</li>
     * <li>Input attachment views accessed in a dynamic render pass via a shader object <b>must</b> have an {@code InputAttachmentIndex} if both {@link VkRenderingInputAttachmentIndexInfoKHR}:{@code pDepthInputAttachmentIndex} and {@link VkRenderingInputAttachmentIndexInfoKHR}:{@code pStencilInputAttachmentIndex} are non-{@code NULL}</li>
     * <li>If an input attachment view accessed in a dynamic render pass via a shader object has an {@code InputAttachmentIndex}, the {@code InputAttachmentIndex} <b>must</b> match an index in {@link VkRenderingInputAttachmentIndexInfoKHR}</li>
     * <li>Memory backing image subresources used as attachments in the current render pass <b>must</b> not be written in any way other than as an attachment by this command</li>
     * <li>If a color attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it is not in the {@link EXTAttachmentFeedbackLoopLayout#VK_IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT} image layout, and either:
     * 
     * <ul>
     * <li>the {@link EXTAttachmentFeedbackLoopLayout#VK_PIPELINE_CREATE_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT PIPELINE_CREATE_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT} is set on the currently bound pipeline or</li>
     * <li>the last call to {@link EXTAttachmentFeedbackLoopDynamicState#vkCmdSetAttachmentFeedbackLoopEnableEXT CmdSetAttachmentFeedbackLoopEnableEXT} included {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT} and
     * 
     * <ul>
     * <li>there is no currently bound graphics pipeline or</li>
     * <li>the currently bound graphics pipeline was created with {@link EXTAttachmentFeedbackLoopDynamicState#VK_DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT}</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <p>it <b>must</b> not be accessed in any way other than as an attachment by this command</p>
     * </li>
     * <li>If a depth attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it is not in the {@link EXTAttachmentFeedbackLoopLayout#VK_IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT} image layout, and either:
     * 
     * <ul>
     * <li>the {@link EXTAttachmentFeedbackLoopLayout#VK_PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT} is set on the currently bound pipeline or</li>
     * <li>the last call to {@link EXTAttachmentFeedbackLoopDynamicState#vkCmdSetAttachmentFeedbackLoopEnableEXT CmdSetAttachmentFeedbackLoopEnableEXT} included {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} and
     * 
     * <ul>
     * <li>there is no currently bound graphics pipeline or</li>
     * <li>the currently bound graphics pipeline was created with {@link EXTAttachmentFeedbackLoopDynamicState#VK_DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT}</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <p>it <b>must</b> not be accessed in any way other than as an attachment by this command</p>
     * </li>
     * <li>If a stencil attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it is not in the {@link EXTAttachmentFeedbackLoopLayout#VK_IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT} image layout, and either:
     * 
     * <ul>
     * <li>the {@link EXTAttachmentFeedbackLoopLayout#VK_PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT} is set on the currently bound pipeline or</li>
     * <li>the last call to {@link EXTAttachmentFeedbackLoopDynamicState#vkCmdSetAttachmentFeedbackLoopEnableEXT CmdSetAttachmentFeedbackLoopEnableEXT} included {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT} and
     * 
     * <ul>
     * <li>there is no currently bound graphics pipeline or</li>
     * <li>the currently bound graphics pipeline was created with {@link EXTAttachmentFeedbackLoopDynamicState#VK_DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT}</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <p>it <b>must</b> not be accessed in any way other than as an attachment by this command</p>
     * </li>
     * <li>If an attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it <b>must</b> not be accessed in any way other than as an attachment, storage image, or sampled image by this command</li>
     * <li>If any previously recorded command in the current subpass accessed an image subresource used as an attachment in this subpass in any way other than as an attachment, this command <b>must</b> not write to that image subresource as an attachment</li>
     * <li>If the current render pass instance uses a depth/stencil attachment with a read-only layout for the depth aspect, <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#fragops-depth-write">depth writes</a> <b>must</b> be disabled</li>
     * <li>If the current render pass instance uses a depth/stencil attachment with a read-only layout for the stencil aspect, both front and back {@code writeMask} are not zero, and stencil test is enabled, <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#fragops-stencil">all stencil ops</a> <b>must</b> be {@link VK10#VK_STENCIL_OP_KEEP STENCIL_OP_KEEP}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK10#VK_DYNAMIC_STATE_VIEWPORT DYNAMIC_STATE_VIEWPORT} dynamic state enabled then {@link VK10#vkCmdSetViewport CmdSetViewport} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK10#VK_DYNAMIC_STATE_SCISSOR DYNAMIC_STATE_SCISSOR} dynamic state enabled then {@link VK10#vkCmdSetScissor CmdSetScissor} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK10#VK_DYNAMIC_STATE_LINE_WIDTH DYNAMIC_STATE_LINE_WIDTH} dynamic state enabled then {@link VK10#vkCmdSetLineWidth CmdSetLineWidth} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link EXTShaderObject#vkCmdSetPolygonModeEXT CmdSetPolygonModeEXT} in the current command buffer set {@code polygonMode} to {@link VK10#VK_POLYGON_MODE_LINE POLYGON_MODE_LINE}, {@link VK10#vkCmdSetLineWidth CmdSetLineWidth} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link VK13#vkCmdSetPrimitiveTopology CmdSetPrimitiveTopology} in the current command buffer set {@code primitiveTopology} to any line topology, {@link VK10#vkCmdSetLineWidth CmdSetLineWidth} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object that outputs line primitives is bound to the {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT} or {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, {@link VK10#vkCmdSetLineWidth CmdSetLineWidth} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link VK10#VK_DYNAMIC_STATE_DEPTH_BIAS DYNAMIC_STATE_DEPTH_BIAS} dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code depthBiasEnable} is {@link VK10#VK_TRUE TRUE}, then {@link VK10#vkCmdSetDepthBounds CmdSetDepthBounds} or {@link EXTDepthBiasControl#vkCmdSetDepthBias2EXT CmdSetDepthBias2EXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK10#VK_DYNAMIC_STATE_BLEND_CONSTANTS DYNAMIC_STATE_BLEND_CONSTANTS} dynamic state enabled then {@link VK10#vkCmdSetBlendConstants CmdSetBlendConstants} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link EXTShaderObject#vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} in the current command buffer set any element of {@code pColorBlendEnables} to {@link VK10#VK_TRUE TRUE}, and the most recent call to {@link EXTShaderObject#vkCmdSetColorBlendEquationEXT CmdSetColorBlendEquationEXT} in the current command buffer set the same element of {@code pColorBlendEquations} to a {@link VkColorBlendEquationEXT} structure with any {@code VkBlendFactor} member with a value of {@link VK10#VK_BLEND_FACTOR_CONSTANT_COLOR BLEND_FACTOR_CONSTANT_COLOR}, {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR}, {@link VK10#VK_BLEND_FACTOR_CONSTANT_ALPHA BLEND_FACTOR_CONSTANT_ALPHA}, or {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA}, {@link VK10#vkCmdSetBlendConstants CmdSetBlendConstants} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link VK10#VK_DYNAMIC_STATE_DEPTH_BOUNDS DYNAMIC_STATE_DEPTH_BOUNDS} dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code depthBoundsTestEnable} is {@link VK10#VK_TRUE TRUE}, then {@link VK10#vkCmdSetDepthBounds CmdSetDepthBounds} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link VK10#VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK DYNAMIC_STATE_STENCIL_COMPARE_MASK} dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code stencilTestEnable} is {@link VK10#VK_TRUE TRUE}, then {@link VK10#vkCmdSetStencilCompareMask CmdSetStencilCompareMask} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link VK10#VK_DYNAMIC_STATE_STENCIL_WRITE_MASK DYNAMIC_STATE_STENCIL_WRITE_MASK} dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code stencilTestEnable} is {@link VK10#VK_TRUE TRUE}, then {@link VK10#vkCmdSetStencilWriteMask CmdSetStencilWriteMask} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link VK10#VK_DYNAMIC_STATE_STENCIL_REFERENCE DYNAMIC_STATE_STENCIL_REFERENCE} dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of and {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code stencilTestEnable} is {@link VK10#VK_TRUE TRUE}, then {@link VK10#vkCmdSetStencilReference CmdSetStencilReference} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the draw is recorded in a render pass instance with multiview enabled, the maximum instance index <b>must</b> be less than or equal to {@link VkPhysicalDeviceMultiviewProperties}{@code ::maxMultiviewInstanceIndex}</li>
     * <li>If the bound graphics pipeline was created with {@link VkPipelineSampleLocationsStateCreateInfoEXT}{@code ::sampleLocationsEnable} set to {@link VK10#VK_TRUE TRUE} and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the {@link EXTSampleLocations#VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT} bit set</li>
     * <li>If the {@link EXTSampleLocations VK_EXT_sample_locations} extension is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT} dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetSampleLocationsEnableEXT CmdSetSampleLocationsEnableEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTSampleLocations VK_EXT_sample_locations} extension is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code sampleLocationsEnable} is {@link VK10#VK_TRUE TRUE}, then {@link EXTSampleLocations#vkCmdSetSampleLocationsEXT CmdSetSampleLocationsEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link VK13#VK_DYNAMIC_STATE_CULL_MODE DYNAMIC_STATE_CULL_MODE} dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, then {@link VK13#vkCmdSetCullMode CmdSetCullMode} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link VK13#VK_DYNAMIC_STATE_FRONT_FACE DYNAMIC_STATE_FRONT_FACE} dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, then {@link VK13#vkCmdSetFrontFace CmdSetFrontFace} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link VK13#VK_DYNAMIC_STATE_DEPTH_TEST_ENABLE DYNAMIC_STATE_DEPTH_TEST_ENABLE} dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, {@link VK13#vkCmdSetDepthTestEnable CmdSetDepthTestEnable} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link VK13#VK_DYNAMIC_STATE_DEPTH_WRITE_ENABLE DYNAMIC_STATE_DEPTH_WRITE_ENABLE} dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, then {@link VK13#vkCmdSetDepthWriteEnable CmdSetDepthWriteEnable} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link VK13#VK_DYNAMIC_STATE_DEPTH_COMPARE_OP DYNAMIC_STATE_DEPTH_COMPARE_OP} dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code depthTestEnable} is {@link VK10#VK_TRUE TRUE}, then {@link VK13#vkCmdSetDepthCompareOp CmdSetDepthCompareOp} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-depthBounds">{@code depthBounds}</a> feature is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link VK13#VK_DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE} dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, then {@link VK13#vkCmdSetDepthBoundsTestEnable CmdSetDepthBoundsTestEnable} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link VK13#VK_DYNAMIC_STATE_STENCIL_TEST_ENABLE DYNAMIC_STATE_STENCIL_TEST_ENABLE} dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, then {@link VK13#vkCmdSetStencilTestEnable CmdSetStencilTestEnable} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link VK13#VK_DYNAMIC_STATE_STENCIL_OP DYNAMIC_STATE_STENCIL_OP} dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code stencilTestEnable} is {@link VK10#VK_TRUE TRUE}, then {@link VK13#vkCmdSetStencilOp CmdSetStencilOp} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, and the state is not inherited, then {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link VK13#VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT DYNAMIC_STATE_SCISSOR_WITH_COUNT} dynamic state enabled, and the state is not inherited, then {@link VK13#vkCmdSetScissorWithCount CmdSetScissorWithCount} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing</li>
     * <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with both the {@link VK13#VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT DYNAMIC_STATE_SCISSOR_WITH_COUNT} and {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic states enabled, and the state is not inherited, then the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> match the {@code scissorCount} parameter of {@code vkCmdSetScissorWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, but not the {@link NVClipSpaceWScaling#VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV DYNAMIC_STATE_VIEWPORT_W_SCALING_NV} dynamic state enabled, then the bound graphics pipeline <b>must</b> have been created with {@link VkPipelineViewportWScalingStateCreateInfoNV}{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the {@link NVClipSpaceWScaling VK_NV_clip_space_w_scaling} extension is enabled, and a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} and {@link NVClipSpaceWScaling#VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV DYNAMIC_STATE_VIEWPORT_W_SCALING_NV} dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code viewportWScalingEnable} is {@link VK10#VK_TRUE TRUE}, then {@link NVClipSpaceWScaling#vkCmdSetViewportWScalingNV CmdSetViewportWScalingNV} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the {@link NVClipSpaceWScaling VK_NV_clip_space_w_scaling} extension is enabled, and a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} and {@link NVClipSpaceWScaling#VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV DYNAMIC_STATE_VIEWPORT_W_SCALING_NV} dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code viewportWScalingEnable} is {@link VK10#VK_TRUE TRUE}, then the {@code viewportCount} parameter in the last call to {@link NVClipSpaceWScaling#vkCmdSetViewportWScalingNV CmdSetViewportWScalingNV} <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, but not the {@link NVShadingRateImage#VK_DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV} dynamic state enabled, then the bound graphics pipeline <b>must</b> have been created with {@link VkPipelineViewportShadingRateImageStateCreateInfoNV}{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled, and a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link NVShadingRateImage#VK_DYNAMIC_STATE_VIEWPORT_COARSE_SAMPLE_ORDER_NV DYNAMIC_STATE_VIEWPORT_COARSE_SAMPLE_ORDER_NV} and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, then {@link NVShadingRateImage#vkCmdSetCoarseSampleOrderNV CmdSetCoarseSampleOrderNV} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled, and a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} and {@link NVShadingRateImage#VK_DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV} dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code shadingRateImageEnable} is {@link VK10#VK_TRUE TRUE}, then {@link NVShadingRateImage#vkCmdSetViewportShadingRatePaletteNV CmdSetViewportShadingRatePaletteNV} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled, and a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} and {@link NVShadingRateImage#VK_DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV} dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code shadingRateImageEnable} is {@link VK10#VK_TRUE TRUE}, then the {@code viewportCount} parameter in the last call to {@link NVShadingRateImage#vkCmdSetViewportShadingRatePaletteNV CmdSetViewportShadingRatePaletteNV} <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled and a {@link VkPipelineViewportSwizzleStateCreateInfoNV} structure chained from {@link VkPipelineViewportStateCreateInfo}, then the bound graphics pipeline <b>must</b> have been created with {@link VkPipelineViewportSwizzleStateCreateInfoNV}{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled and a {@link VkPipelineViewportExclusiveScissorStateCreateInfoNV} structure chained from {@link VkPipelineViewportStateCreateInfo}, then the bound graphics pipeline <b>must</b> have been created with {@link VkPipelineViewportExclusiveScissorStateCreateInfoNV}{@code ::exclusiveScissorCount} greater or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-exclusiveScissor">{@code exclusiveScissor}</a> feature is enabled, and a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link NVScissorExclusive#VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV} dynamic state enabled, then {@link NVScissorExclusive#vkCmdSetExclusiveScissorEnableNV CmdSetExclusiveScissorEnableNV} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-exclusiveScissor">{@code exclusiveScissor}</a> feature is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link NVScissorExclusive#VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV} dynamic state enabled, and the most recent call to {@link NVScissorExclusive#vkCmdSetExclusiveScissorEnableNV CmdSetExclusiveScissorEnableNV} in the current command buffer set any element of {@code pExclusiveScissorEnables} to {@link VK10#VK_TRUE TRUE}, then {@link NVScissorExclusive#vkCmdSetExclusiveScissorNV CmdSetExclusiveScissorNV} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link VK13#VK_DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE} dynamic state enabled, then {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link VK13#VK_DYNAMIC_STATE_DEPTH_BIAS_ENABLE DYNAMIC_STATE_DEPTH_BIAS_ENABLE} dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, then {@link VK13#vkCmdSetDepthBiasEnable CmdSetDepthBiasEnable} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState2#VK_DYNAMIC_STATE_LOGIC_OP_EXT DYNAMIC_STATE_LOGIC_OP_EXT} dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code logicOpEnable} is {@link VK10#VK_TRUE TRUE}, then {@link EXTShaderObject#vkCmdSetLogicOpEXT CmdSetLogicOpEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-primitiveFragmentShadingRateWithMultipleViewports">{@code primitiveFragmentShadingRateWithMultipleViewports}</a> limit is not supported, the bound graphics pipeline was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, and any of the shader stages of the bound graphics pipeline write to the {@code PrimitiveShadingRateKHR} built-in, then {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount} <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> be 1</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-primitiveFragmentShadingRateWithMultipleViewports">{@code primitiveFragmentShadingRateWithMultipleViewports}</a> limit is not supported, and any shader object bound to a graphics stage writes to the {@code PrimitiveShadingRateKHR} built-in, then {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount} <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> be 1</li>
     * <li>If rasterization is not disabled in the bound graphics pipeline, then for each color attachment in the subpass, if the corresponding image view’s <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#resources-image-view-format-features">format features</a> do not contain {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT}, then the {@code blendEnable} member of the corresponding element of the {@code pAttachments} member of {@code pColorBlendState} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then for each color attachment in the render pass, if the corresponding image view’s <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#resources-image-view-format-features">format features</a> do not contain {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT}, then the corresponding member of {@code pColorBlendEnables} in the most recent call to {@code vkCmdSetColorBlendEnableEXT} in the current command buffer that affected that attachment index <b>must</b> have been {@link VK10#VK_FALSE FALSE}</li>
     * <li>If rasterization is not disabled in the bound graphics pipeline, and none of the following is enabled:
     * 
     * <ul>
     * <li>the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} extension</li>
     * <li>the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension</li>
     * <li>the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature</li>
     * </ul>
     * 
     * <p>then {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be the same as the current subpass color and/or depth/stencil attachments</p>
     * </li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and none of the following is enabled:
     * 
     * <ul>
     * <li>the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} extension</li>
     * <li>the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension</li>
     * <li>the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature</li>
     * </ul>
     * 
     * <p>then the most recent call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT} in the current command buffer <b>must</b> have set {@code rasterizationSamples} to be the same as the number of samples for the current render pass color and/or depth/stencil attachments</p>
     * </li>
     * <li>If a shader object is bound to any graphics stage, the current render pass instance <b>must</b> have been begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pDepthAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pDepthAttachment} is {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, this command <b>must</b> not write any values to the depth attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pStencilAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pStencilAttachment} is {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, this command <b>must</b> not write any values to the stencil attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pDepthAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pDepthAttachment} is {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}, this command <b>must</b> not write any values to the depth attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pStencilAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pStencilAttachment} is {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL}, this command <b>must</b> not write any values to the stencil attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pDepthAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pDepthAttachment} is {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, this command <b>must</b> not write any values to the depth attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pStencilAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pStencilAttachment} is {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}, this command <b>must</b> not write any values to the stencil attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound graphics pipeline <b>must</b> have been created with a {@link VkPipelineRenderingCreateInfo}{@code ::viewMask} equal to {@link VkRenderingInfo}{@code ::viewMask}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled and the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound graphics pipeline <b>must</b> have been created with a {@link VkPipelineRenderingCreateInfo}{@code ::colorAttachmentCount} equal to {@link VkRenderingInfo}{@code ::colorAttachmentCount}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and {@link VkRenderingInfo}{@code ::colorAttachmentCount} greater than 0, then each element of the {@link VkRenderingInfo}{@code ::pColorAttachments} array with an {@code imageView} not equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> have been created with a {@code VkFormat} equal to the corresponding element of {@link VkPipelineRenderingCreateInfo}{@code ::pColorAttachmentFormats} used to create the currently bound graphics pipeline</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and {@link VkRenderingInfo}{@code ::colorAttachmentCount} greater than 0, then each element of the {@link VkRenderingInfo}{@code ::pColorAttachments} array with an {@code imageView} equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> have the corresponding element of {@link VkPipelineRenderingCreateInfo}{@code ::pColorAttachmentFormats} used to create the currently bound pipeline equal to {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is enabled, and the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and {@link VkRenderingInfo}{@code ::colorAttachmentCount} greater than 0, then each element of the {@link VkRenderingInfo}{@code ::pColorAttachments} array with an {@code imageView} not equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> have been created with a {@code VkFormat} equal to the corresponding element of {@link VkPipelineRenderingCreateInfo}{@code ::pColorAttachmentFormats} used to create the currently bound graphics pipeline, or the corresponding element of {@link VkPipelineRenderingCreateInfo}{@code ::pColorAttachmentFormats}, if it exists, <b>must</b> be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, with a {@link VkRenderingInfo}{@code ::colorAttachmentCount} equal to 1, there is no shader object bound to any graphics stage, and a color attachment with a resolve mode of {@link ANDROIDExternalFormatResolve#VK_RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID}, each element of the {@link VkRenderingInfo}{@code ::pColorAttachments} array with a {@code resolveImageView} not equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> have been created with an image created with a {@link VkExternalFormatANDROID}{@code ::externalFormat} value equal to the {@link VkExternalFormatANDROID}{@code ::externalFormat} value used to create the currently bound graphics pipeline</li>
     * <li>If there is no shader object bound to any graphics stage, the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and a {@link VkRenderingInfo}{@code ::colorAttachmentCount} equal to 1, and a color attachment with a resolve mode of {@link ANDROIDExternalFormatResolve#VK_RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID}, each element of the {@link VkRenderingInfo}{@code ::pColorAttachments} array with a {@code imageView} not equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> have been created with an image created with a {@link VkExternalFormatANDROID}{@code ::externalFormat} value equal to the {@link VkExternalFormatANDROID}{@code ::externalFormat} value used to create the currently bound graphics pipeline</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, there is no shader object bound to any graphics stage, and the currently bound graphics pipeline was created with a non-zero {@link VkExternalFormatANDROID}{@code ::externalFormat} value and with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT} dynamic state enabled, then {@link EXTShaderObject#vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} <b>must</b> have set the blend enable to {@link VK10#VK_FALSE FALSE} prior to this drawing command</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, there is no shader object bound to any graphics stage, and the currently bound graphics pipeline was created with a non-zero {@link VkExternalFormatANDROID}{@code ::externalFormat} value and with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} dynamic state enabled, then {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT} <b>must</b> have set {@code rasterizationSamples} to {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT} prior to this drawing command</li>
     * <li>If there is a shader object bound to any graphics stage, and the current render pass includes a color attachment that uses the {@link ANDROIDExternalFormatResolve#VK_RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID} resolve mode, then {@link EXTShaderObject#vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} <b>must</b> have set blend enable to {@link VK10#VK_FALSE FALSE} prior to this drawing command</li>
     * <li>If there is a shader object bound to any graphics stage, and the current render pass includes a color attachment that uses the {@link ANDROIDExternalFormatResolve#VK_RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID} resolve mode, then {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT} <b>must</b> have set {@code rasterizationSamples} to {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT} prior to this drawing command</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, there is no shader object bound to any graphics stage, and the currently bound graphics pipeline was created with a non-zero {@link VkExternalFormatANDROID}{@code ::externalFormat} value and with the {@link KHRFragmentShadingRate#VK_DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR} dynamic state enabled, then {@link KHRFragmentShadingRate#vkCmdSetFragmentShadingRateKHR CmdSetFragmentShadingRateKHR} <b>must</b> have set {@code pFragmentSize→width} to 1 prior to this drawing command</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, there is no shader object bound to any graphics stage, and the currently bound graphics pipeline was created with a non-zero {@link VkExternalFormatANDROID}{@code ::externalFormat} value and with the {@link KHRFragmentShadingRate#VK_DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR} dynamic state enabled, then {@link KHRFragmentShadingRate#vkCmdSetFragmentShadingRateKHR CmdSetFragmentShadingRateKHR} <b>must</b> have set {@code pFragmentSize→height} to 1 prior to this drawing command</li>
     * <li>If there is a shader object bound to any graphics stage, and the current render pass includes a color attachment that uses the {@link ANDROIDExternalFormatResolve#VK_RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID} resolve mode, then {@link KHRFragmentShadingRate#vkCmdSetFragmentShadingRateKHR CmdSetFragmentShadingRateKHR} <b>must</b> have set {@code pFragmentSize→width} to 1 prior to this drawing command</li>
     * <li>If there is a shader object bound to any graphics stage, and the current render pass includes a color attachment that uses the {@link ANDROIDExternalFormatResolve#VK_RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID} resolve mode, then {@link KHRFragmentShadingRate#vkCmdSetFragmentShadingRateKHR CmdSetFragmentShadingRateKHR} <b>must</b> have set {@code pFragmentSize→height} to 1 prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTColorWriteEnable#VK_DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT} dynamic state enabled then {@link EXTColorWriteEnable#vkCmdSetColorWriteEnableEXT CmdSetColorWriteEnableEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-colorWriteEnable">{@code colorWriteEnable}</a> feature is enabled on the device, and a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTColorWriteEnable#vkCmdSetColorWriteEnableEXT CmdSetColorWriteEnableEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTColorWriteEnable#VK_DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT} dynamic state enabled then the {@code attachmentCount} parameter of {@code vkCmdSetColorWriteEnableEXT} <b>must</b> be greater than or equal to the {@link VkPipelineColorBlendStateCreateInfo}{@code ::attachmentCount} of the currently bound graphics pipeline</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-colorWriteEnable">{@code colorWriteEnable}</a> feature is enabled on the device, and a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then the {@code attachmentCount} parameter of most recent call to {@code vkCmdSetColorWriteEnableEXT} in the current command buffer <b>must</b> be greater than or equal to the number of color attachments in the current render pass instance</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTDiscardRectangles#VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT DYNAMIC_STATE_DISCARD_RECTANGLE_EXT} dynamic state enabled then {@link EXTDiscardRectangles#vkCmdSetDiscardRectangleEXT CmdSetDiscardRectangleEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command for each discard rectangle in {@link VkPipelineDiscardRectangleStateCreateInfoEXT}{@code ::discardRectangleCount}</li>
     * <li>If the {@link EXTDiscardRectangles VK_EXT_discard_rectangles} extension is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link EXTDiscardRectangles#VK_DYNAMIC_STATE_DISCARD_RECTANGLE_ENABLE_EXT DYNAMIC_STATE_DISCARD_RECTANGLE_ENABLE_EXT} dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, then {@link EXTDiscardRectangles#vkCmdSetDiscardRectangleEnableEXT CmdSetDiscardRectangleEnableEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTDiscardRectangles VK_EXT_discard_rectangles} extension is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link EXTDiscardRectangles#VK_DYNAMIC_STATE_DISCARD_RECTANGLE_MODE_EXT DYNAMIC_STATE_DISCARD_RECTANGLE_MODE_EXT} dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code discardRectangleEnable} is {@link VK10#VK_TRUE TRUE}, then {@link EXTDiscardRectangles#vkCmdSetDiscardRectangleModeEXT CmdSetDiscardRectangleModeEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTDiscardRectangles VK_EXT_discard_rectangles} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link EXTDiscardRectangles#vkCmdSetDiscardRectangleEnableEXT CmdSetDiscardRectangleEnableEXT} in the current command buffer set {@code discardRectangleEnable} to {@link VK10#VK_TRUE TRUE}, then {@link EXTDiscardRectangles#vkCmdSetDiscardRectangleEXT CmdSetDiscardRectangleEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView} was {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@link VkPipelineRenderingCreateInfo}{@code ::depthAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@link VkPipelineRenderingCreateInfo}{@code ::depthAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to the {@code VkFormat} used to create {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is enabled, {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the value of {@link VkPipelineRenderingCreateInfo}{@code ::depthAttachmentFormat} used to create the currently bound graphics pipeline was not equal to the {@code VkFormat} used to create {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView}, the value of the format <b>must</b> be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView} was {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@link VkPipelineRenderingCreateInfo}{@code ::stencilAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@link VkPipelineRenderingCreateInfo}{@code ::stencilAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to the {@code VkFormat} used to create {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is enabled, {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the value of {@link VkPipelineRenderingCreateInfo}{@code ::stencilAttachmentFormat} used to create the currently bound graphics pipeline was not equal to the {@code VkFormat} used to create {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView}, the value of the format <b>must</b> be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and {@link VkRenderingFragmentShadingRateAttachmentInfoKHR}{@code ::imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the currently bound graphics pipeline <b>must</b> have been created with {@link KHRFragmentShadingRate#VK_PIPELINE_CREATE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR PIPELINE_CREATE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and {@link VkRenderingFragmentDensityMapAttachmentInfoEXT}{@code ::imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the currently bound graphics pipeline <b>must</b> have been created with {@link EXTFragmentDensityMap#VK_PIPELINE_CREATE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT PIPELINE_CREATE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT}</li>
     * <li>If the currently bound pipeline was created with a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} with a {@link VkRenderingInfo}{@code ::colorAttachmentCount} parameter greater than 0, then each element of the {@link VkRenderingInfo}{@code ::pColorAttachments} array with a {@code imageView} not equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> have been created with a sample count equal to the corresponding element of the {@code pColorAttachmentSamples} member of {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} used to create the currently bound graphics pipeline</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound pipeline was created with a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of the {@code depthStencilAttachmentSamples} member of {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} used to create the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound pipeline was created with a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of the {@code depthStencilAttachmentSamples} member of {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} used to create the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView}</li>
     * <li>If the currently bound pipeline was created without a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is not enabled, and the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} with a {@link VkRenderingInfo}{@code ::colorAttachmentCount} parameter greater than 0, then each element of the {@link VkRenderingInfo}{@code ::pColorAttachments} array with a {@code imageView} not equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> have been created with a sample count equal to the value of {@code rasterizationSamples} for the currently bound graphics pipeline</li>
     * <li>If the currently bound pipeline was created without a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is not enabled, and {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView}</li>
     * <li>If the currently bound pipeline was created without a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is not enabled, and {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView}</li>
     * <li>If this command has been called inside a render pass instance started with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, and the {@code pNext} chain of {@link VkRenderingInfo} includes a {@link VkMultisampledRenderToSingleSampledInfoEXT} structure with {@code multisampledRenderToSingleSampledEnable} equal to {@link VK10#VK_TRUE TRUE}, then the value of {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be equal to {@link VkMultisampledRenderToSingleSampledInfoEXT}{@code ::rasterizationSamples}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound pipeline <b>must</b> have been created with a {@link VkGraphicsPipelineCreateInfo}{@code ::renderPass} equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, there is a graphics pipeline bound with a fragment shader that statically writes to a color attachment, the color write mask is not zero, color writes are enabled, and the corresponding element of the {@link VkRenderingInfo}{@code ::pColorAttachments→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then the corresponding element of {@link VkPipelineRenderingCreateInfo}{@code ::pColorAttachmentFormats} used to create the pipeline <b>must</b> not be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, there is a graphics pipeline bound, depth test is enabled, depth write is enabled, and the {@link VkRenderingInfo}{@code ::pDepthAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then the {@link VkPipelineRenderingCreateInfo}{@code ::depthAttachmentFormat} used to create the pipeline <b>must</b> not be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, there is a graphics pipeline bound, stencil test is enabled and the {@link VkRenderingInfo}{@code ::pStencilAttachment→imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then the {@link VkPipelineRenderingCreateInfo}{@code ::stencilAttachmentFormat} used to create the pipeline <b>must</b> not be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-primitivesGeneratedQueryWithRasterizerDiscard">{@code primitivesGeneratedQueryWithRasterizerDiscard}</a> feature is not enabled and the {@link EXTPrimitivesGeneratedQuery#VK_QUERY_TYPE_PRIMITIVES_GENERATED_EXT QUERY_TYPE_PRIMITIVES_GENERATED_EXT} query is active, <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#primsrast-discard">rasterization discard</a> <b>must</b> not be enabled</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-primitivesGeneratedQueryWithNonZeroStreams">{@code primitivesGeneratedQueryWithNonZeroStreams}</a> feature is not enabled and the {@link EXTPrimitivesGeneratedQuery#VK_QUERY_TYPE_PRIMITIVES_GENERATED_EXT QUERY_TYPE_PRIMITIVES_GENERATED_EXT} query is active, the bound graphics pipeline <b>must</b> not have been created with a non-zero value in {@link VkPipelineRasterizationStateStreamCreateInfoEXT}{@code ::rasterizationStream}</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT} stage or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_TESSELLATION_DOMAIN_ORIGIN_EXT DYNAMIC_STATE_TESSELLATION_DOMAIN_ORIGIN_EXT} dynamic state enabled, then {@link EXTShaderObject#vkCmdSetTessellationDomainOriginEXT CmdSetTessellationDomainOriginEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-depthClamp">{@code depthClamp}</a> feature is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_DEPTH_CLAMP_ENABLE_EXT DYNAMIC_STATE_DEPTH_CLAMP_ENABLE_EXT} dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetDepthClampEnableEXT CmdSetDepthClampEnableEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_POLYGON_MODE_EXT DYNAMIC_STATE_POLYGON_MODE_EXT} dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetPolygonModeEXT CmdSetPolygonModeEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_MASK_EXT DYNAMIC_STATE_SAMPLE_MASK_EXT} dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetSampleMaskEXT CmdSetSampleMaskEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT} dynamic state enabled, and {@code alphaToCoverageEnable} was {@link VK10#VK_TRUE TRUE} in the last call to {@link EXTShaderObject#vkCmdSetAlphaToCoverageEnableEXT CmdSetAlphaToCoverageEnableEXT}, then the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#interfaces-fragmentoutput">Fragment Output Interface</a> <b>must</b> contain a variable for the alpha {@code Component} word in {@code Location} 0 at {@code Index} 0</li>
     * <li>If a shader object is bound to any graphics stage, and the most recent call to {@link EXTShaderObject#vkCmdSetAlphaToCoverageEnableEXT CmdSetAlphaToCoverageEnableEXT} in the current command buffer set {@code alphaToCoverageEnable} to {@link VK10#VK_TRUE TRUE}, then the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#interfaces-fragmentoutput">Fragment Output Interface</a> <b>must</b> contain a variable for the alpha {@code Component} word in {@code Location} 0 at {@code Index} 0</li>
     * <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT} dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetAlphaToCoverageEnableEXT CmdSetAlphaToCoverageEnableEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-alphaToOne">{@code alphaToOne}</a> feature is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_ALPHA_TO_ONE_ENABLE_EXT DYNAMIC_STATE_ALPHA_TO_ONE_ENABLE_EXT} dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetAlphaToOneEnableEXT CmdSetAlphaToOneEnableEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-logicOp">{@code logicOp}</a> feature is enabled, a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LOGIC_OP_ENABLE_EXT DYNAMIC_STATE_LOGIC_OP_ENABLE_EXT} dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetLogicOpEnableEXT CmdSetLogicOpEnableEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and both the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE} and there are color attachments bound, then {@link EXTShaderObject#vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetColorBlendEquationEXT CmdSetColorBlendEquationEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link EXTShaderObject#vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} for any attachment set that attachment’s value in {@code pColorBlendEnables} to {@link VK10#VK_TRUE TRUE}, then {@link EXTShaderObject#vkCmdSetColorBlendEquationEXT CmdSetColorBlendEquationEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_WRITE_MASK_EXT DYNAMIC_STATE_COLOR_WRITE_MASK_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetColorWriteMaskEXT CmdSetColorWriteMaskEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and both the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE} and there are color attachments bound, then {@link EXTShaderObject#vkCmdSetColorWriteMaskEXT CmdSetColorWriteMaskEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-geometryStreams">{@code geometryStreams}</a> feature is enabled, and a shader object is bound to the {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT} stage or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_STREAM_EXT DYNAMIC_STATE_RASTERIZATION_STREAM_EXT} dynamic state enabled, then {@link EXTShaderObject#vkCmdSetRasterizationStreamEXT CmdSetRasterizationStreamEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTConservativeRasterization VK_EXT_conservative_rasterization} extension is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT} dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetConservativeRasterizationModeEXT CmdSetConservativeRasterizationModeEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTConservativeRasterization VK_EXT_conservative_rasterization} extension is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT DYNAMIC_STATE_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT} dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code conservativeRasterizationMode} is {@link EXTConservativeRasterization#VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT}, then {@link EXTShaderObject#vkCmdSetExtraPrimitiveOverestimationSizeEXT CmdSetExtraPrimitiveOverestimationSizeEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-depthClipEnable">{@code depthClipEnable}</a> feature is enabled, and a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT} dynamic state, then {@link EXTShaderObject#vkCmdSetDepthClipEnableEXT CmdSetDepthClipEnableEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetColorBlendAdvancedEXT CmdSetColorBlendAdvancedEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTBlendOperationAdvanced VK_EXT_blend_operation_advanced} extension is enabled, and a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then at least one of {@link EXTShaderObject#vkCmdSetColorBlendEquationEXT CmdSetColorBlendEquationEXT} and {@link EXTShaderObject#vkCmdSetColorBlendAdvancedEXT CmdSetColorBlendAdvancedEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the {@link EXTProvokingVertex VK_EXT_provoking_vertex} extension is enabled, a shader object is bound to the {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT} stage or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_PROVOKING_VERTEX_MODE_EXT DYNAMIC_STATE_PROVOKING_VERTEX_MODE_EXT} dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetProvokingVertexModeEXT CmdSetProvokingVertexModeEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetLineRasterizationModeEXT CmdSetLineRasterizationModeEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If any of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-stippledRectangularLines">{@code stippledRectangularLines}</a>, <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-stippledBresenhamLines">{@code stippledBresenhamLines}</a> or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-stippledSmoothLines">{@code stippledSmoothLines}</a> features are enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link EXTShaderObject#vkCmdSetPolygonModeEXT CmdSetPolygonModeEXT} in the current command buffer set {@code polygonMode} to {@link VK10#VK_POLYGON_MODE_LINE POLYGON_MODE_LINE}, then {@link EXTShaderObject#vkCmdSetLineRasterizationModeEXT CmdSetLineRasterizationModeEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If any of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-stippledRectangularLines">{@code stippledRectangularLines}</a>, <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-stippledBresenhamLines">{@code stippledBresenhamLines}</a> or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-stippledSmoothLines">{@code stippledSmoothLines}</a> features are enabled, and a shader object is bound to the {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link VK13#vkCmdSetPrimitiveTopology CmdSetPrimitiveTopology} in the current command buffer set {@code primitiveTopology} to any line topology, then {@link EXTShaderObject#vkCmdSetLineRasterizationModeEXT CmdSetLineRasterizationModeEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If any of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-stippledRectangularLines">{@code stippledRectangularLines}</a>, <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-stippledBresenhamLines">{@code stippledBresenhamLines}</a> or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-stippledSmoothLines">{@code stippledSmoothLines}</a> features are enabled, and a shader object that outputs line primitives is bound to the {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT} or {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetLineRasterizationModeEXT CmdSetLineRasterizationModeEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetLineStippleEnableEXT CmdSetLineStippleEnableEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If any of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-stippledRectangularLines">{@code stippledRectangularLines}</a>, <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-stippledBresenhamLines">{@code stippledBresenhamLines}</a> or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-stippledSmoothLines">{@code stippledSmoothLines}</a> features are enabled, and a shader object is bound to any graphics stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link EXTShaderObject#vkCmdSetPolygonModeEXT CmdSetPolygonModeEXT} in the current command buffer set {@code polygonMode} to {@link VK10#VK_POLYGON_MODE_LINE POLYGON_MODE_LINE}, then {@link EXTShaderObject#vkCmdSetLineStippleEnableEXT CmdSetLineStippleEnableEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If any of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-stippledRectangularLines">{@code stippledRectangularLines}</a>, <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-stippledBresenhamLines">{@code stippledBresenhamLines}</a> or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-stippledSmoothLines">{@code stippledSmoothLines}</a> features are enabled, and a shader object is bound to the {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the most recent call to {@link VK13#vkCmdSetPrimitiveTopology CmdSetPrimitiveTopology} in the current command buffer set {@code primitiveTopology} to any line topology, then {@link EXTShaderObject#vkCmdSetLineStippleEnableEXT CmdSetLineStippleEnableEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If any of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-stippledRectangularLines">{@code stippledRectangularLines}</a>, <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-stippledBresenhamLines">{@code stippledBresenhamLines}</a> or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-stippledSmoothLines">{@code stippledSmoothLines}</a> features are enabled, and a shader object that outputs line primitives is bound to the {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT} or {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetLineStippleEnableEXT CmdSetLineStippleEnableEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If any of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-stippledRectangularLines">{@code stippledRectangularLines}</a>, <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-stippledBresenhamLines">{@code stippledBresenhamLines}</a> or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-stippledSmoothLines">{@code stippledSmoothLines}</a> features are enabled and a shader object is bound to any graphics stage, or a bound graphics pipeline state was created with the {@link KHRLineRasterization#VK_DYNAMIC_STATE_LINE_STIPPLE_KHR DYNAMIC_STATE_LINE_STIPPLE_KHR} dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code stippledLineEnable} is {@link VK10#VK_TRUE TRUE}, then {@link KHRLineRasterization#vkCmdSetLineStippleKHR CmdSetLineStippleKHR} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-depthClipControl">{@code depthClipControl}</a> feature is enabled, and a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT DYNAMIC_STATE_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT} dynamic state enabled, then {@link EXTShaderObject#vkCmdSetDepthClipNegativeOneToOneEXT CmdSetDepthClipNegativeOneToOneEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-depthClampControl">{@code depthClampControl}</a> feature is enabled, and a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link EXTDepthClampControl#VK_DYNAMIC_STATE_DEPTH_CLAMP_RANGE_EXT DYNAMIC_STATE_DEPTH_CLAMP_RANGE_EXT} dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code depthClampEnable} is {@link VK10#VK_TRUE TRUE}, then {@link EXTShaderObject#vkCmdSetDepthClampRangeEXT CmdSetDepthClampRangeEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the {@link NVClipSpaceWScaling VK_NV_clip_space_w_scaling} extension is enabled, and a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_ENABLE_NV DYNAMIC_STATE_VIEWPORT_W_SCALING_ENABLE_NV} dynamic state enabled, then {@link EXTShaderObject#vkCmdSetViewportWScalingEnableNV CmdSetViewportWScalingEnableNV} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the {@link NVViewportSwizzle VK_NV_viewport_swizzle} extension is enabled, and a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV} dynamic state enabled, then {@link EXTShaderObject#vkCmdSetViewportSwizzleNV CmdSetViewportSwizzleNV} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the {@link NVFragmentCoverageToColor VK_NV_fragment_coverage_to_color} extension is enabled, a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV} dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetCoverageToColorEnableNV CmdSetCoverageToColorEnableNV} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the {@link NVFragmentCoverageToColor VK_NV_fragment_coverage_to_color} extension is enabled, a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_LOCATION_NV DYNAMIC_STATE_COVERAGE_TO_COLOR_LOCATION_NV} dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code coverageToColorEnable} is {@link VK10#VK_TRUE TRUE}, then {@link EXTShaderObject#vkCmdSetCoverageToColorLocationNV CmdSetCoverageToColorLocationNV} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_MODULATION_MODE_NV DYNAMIC_STATE_COVERAGE_MODULATION_MODE_NV} dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetCoverageModulationModeNV CmdSetCoverageModulationModeNV} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV} dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code coverageModulationMode} is any value other than {@link NVFramebufferMixedSamples#VK_COVERAGE_MODULATION_MODE_NONE_NV COVERAGE_MODULATION_MODE_NONE_NV}, then {@link EXTShaderObject#vkCmdSetCoverageModulationTableEnableNV CmdSetCoverageModulationTableEnableNV} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_NV DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_NV} dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code coverageModulationTableEnable} is {@link VK10#VK_TRUE TRUE}, then {@link EXTShaderObject#vkCmdSetCoverageModulationTableNV CmdSetCoverageModulationTableNV} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SHADING_RATE_IMAGE_ENABLE_NV DYNAMIC_STATE_SHADING_RATE_IMAGE_ENABLE_NV} dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetShadingRateImageEnableNV CmdSetShadingRateImageEnableNV} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-pipelineFragmentShadingRate">{@code pipelineFragmentShadingRate}</a> feature is enabled, a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage or a graphics pipeline is bound which was created with the {@link KHRFragmentShadingRate#VK_DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR} dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, then {@link KHRFragmentShadingRate#vkCmdSetFragmentShadingRateKHR CmdSetFragmentShadingRateKHR} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-representativeFragmentTest">{@code representativeFragmentTest}</a> feature is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV DYNAMIC_STATE_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV} dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetRepresentativeFragmentTestEnableNV CmdSetRepresentativeFragmentTestEnableNV} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-coverageReductionMode">{@code coverageReductionMode}</a> feature is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_REDUCTION_MODE_NV DYNAMIC_STATE_COVERAGE_REDUCTION_MODE_NV} dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetCoverageReductionModeNV CmdSetCoverageReductionModeNV} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT} state enabled and the last call to {@link EXTShaderObject#vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} set {@code pColorBlendEnables} for any attachment to {@link VK10#VK_TRUE TRUE}, then for those attachments in the subpass the corresponding image view’s <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state enabled, and the current subpass does not use any color and/or depth/stencil attachments, then the {@code rasterizationSamples} in the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT} <b>must</b> follow the rules for a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#renderpass-noattachments">zero-attachment subpass</a></li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_MASK_EXT DYNAMIC_STATE_SAMPLE_MASK_EXT} state enabled and the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state disabled, then the {@code samples} parameter in the last call to {@link EXTShaderObject#vkCmdSetSampleMaskEXT CmdSetSampleMaskEXT} <b>must</b> be greater or equal to the {@link VkPipelineMultisampleStateCreateInfo}{@code ::rasterizationSamples} parameter used to create the bound graphics pipeline</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_MASK_EXT DYNAMIC_STATE_SAMPLE_MASK_EXT} state and {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} states enabled, then the {@code samples} parameter in the last call to {@link EXTShaderObject#vkCmdSetSampleMaskEXT CmdSetSampleMaskEXT} <b>must</b> be greater or equal to the {@code rasterizationSamples} parameter in the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is not enabled, and neither the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} nor the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extensions are enabled, then the {@code rasterizationSamples} in the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT} <b>must</b> be the same as the current subpass color and/or depth/stencil attachments</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state enabled, or a shader object is bound to any graphics stage, and the current render pass instance includes a {@link VkMultisampledRenderToSingleSampledInfoEXT} structure with {@code multisampledRenderToSingleSampledEnable} equal to {@link VK10#VK_TRUE TRUE}, then the {@code rasterizationSamples} in the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT} <b>must</b> be the same as the {@code rasterizationSamples} member of that structure</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorBlendEnableEXT} calls <b>must</b> specify an enable for all active color attachments in the current subpass</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorBlendEnableEXT} calls <b>must</b> specify an enable for all active color attachments in the current subpass</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetColorBlendEquationEXT CmdSetColorBlendEquationEXT} <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorBlendEquationEXT} calls <b>must</b> specify the blend equations for all active color attachments in the current subpass where blending is enabled</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and both the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE} and there are color attachments bound, then {@link EXTShaderObject#vkCmdSetColorBlendEquationEXT CmdSetColorBlendEquationEXT} <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorBlendEquationEXT} calls <b>must</b> specify the blend equations for all active color attachments in the current subpass where blending is enabled</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_WRITE_MASK_EXT DYNAMIC_STATE_COLOR_WRITE_MASK_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetColorWriteMaskEXT CmdSetColorWriteMaskEXT} <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorWriteMaskEXT} calls <b>must</b> specify the color write mask for all active color attachments in the current subpass</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, then {@link EXTShaderObject#vkCmdSetColorWriteMaskEXT CmdSetColorWriteMaskEXT} <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorWriteMaskEXT} calls <b>must</b> specify the color write mask for all active color attachments in the current subpass</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT} dynamic state enabled then {@link EXTShaderObject#vkCmdSetColorBlendAdvancedEXT CmdSetColorBlendAdvancedEXT} <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorBlendAdvancedEXT} calls <b>must</b> specify the advanced blend equations for all active color attachments in the current subpass where blending is enabled</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT} and {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT} dynamic states enabled and the last calls to {@link EXTShaderObject#vkCmdSetColorBlendEnableEXT CmdSetColorBlendEnableEXT} and {@link EXTShaderObject#vkCmdSetColorBlendAdvancedEXT CmdSetColorBlendAdvancedEXT} have enabled advanced blending, then the number of active color attachments in the current subpass <b>must</b> not exceed <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-advancedBlendMaxColorAttachments">{@code advancedBlendMaxColorAttachments}</a></li>
     * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-primitivesGeneratedQueryWithNonZeroStreams">{@code primitivesGeneratedQueryWithNonZeroStreams}</a> feature is not enabled and the {@link EXTPrimitivesGeneratedQuery#VK_QUERY_TYPE_PRIMITIVES_GENERATED_EXT QUERY_TYPE_PRIMITIVES_GENERATED_EXT} query is active, and the bound graphics pipeline was created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_STREAM_EXT DYNAMIC_STATE_RASTERIZATION_STREAM_EXT} state enabled, the last call to {@link EXTShaderObject#vkCmdSetRasterizationStreamEXT CmdSetRasterizationStreamEXT} <b>must</b> have set the {@code rasterizationStream} to zero</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} state enabled and the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state disabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code sampleLocationsEnable} is {@link VK10#VK_TRUE TRUE}, then the {@code sampleLocationsPerPixel} member of {@code pSampleLocationsInfo} in the last call to {@link EXTSampleLocations#vkCmdSetSampleLocationsEXT CmdSetSampleLocationsEXT} <b>must</b> equal the {@code rasterizationSamples} member of the {@link VkPipelineMultisampleStateCreateInfo} structure the bound graphics pipeline has been created with</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} state enabled and the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code sampleLocationsEnable} is {@link VK10#VK_TRUE TRUE}, then the {@code sampleLocationsPerPixel} member of {@code pSampleLocationsInfo} in the last call to {@link EXTSampleLocations#vkCmdSetSampleLocationsEXT CmdSetSampleLocationsEXT} <b>must</b> equal the {@code rasterizationSamples} parameter of the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT}</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, or the bound graphics pipeline was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT} state enabled, and {@code sampleLocationsEnable} was {@link VK10#VK_TRUE TRUE} in the last call to {@link EXTShaderObject#vkCmdSetSampleLocationsEnableEXT CmdSetSampleLocationsEnableEXT}, and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the {@link EXTSampleLocations#VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT} bit set</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, or the bound graphics pipeline state was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} state enabled and the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT} state enabled, and if {@code sampleLocationsEnable} was {@link VK10#VK_TRUE TRUE} in the last call to {@link EXTShaderObject#vkCmdSetSampleLocationsEnableEXT CmdSetSampleLocationsEnableEXT}, then the {@code sampleLocationsInfo.sampleLocationGridSize.width} in the last call to {@link EXTSampleLocations#vkCmdSetSampleLocationsEXT CmdSetSampleLocationsEXT} <b>must</b> evenly divide {@link VkMultisamplePropertiesEXT}{@code ::sampleLocationGridSize.width} as returned by {@link EXTSampleLocations#vkGetPhysicalDeviceMultisamplePropertiesEXT GetPhysicalDeviceMultisamplePropertiesEXT} with a {@code samples} parameter equaling {@code rasterizationSamples}</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, or the bound graphics pipeline state was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} state enabled and the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT} state enabled, and if {@code sampleLocationsEnable} was {@link VK10#VK_TRUE TRUE} in the last call to {@link EXTShaderObject#vkCmdSetSampleLocationsEnableEXT CmdSetSampleLocationsEnableEXT}, then the {@code sampleLocationsInfo.sampleLocationGridSize.height} in the last call to {@link EXTSampleLocations#vkCmdSetSampleLocationsEXT CmdSetSampleLocationsEXT} <b>must</b> evenly divide {@link VkMultisamplePropertiesEXT}{@code ::sampleLocationGridSize.height} as returned by {@link EXTSampleLocations#vkGetPhysicalDeviceMultisamplePropertiesEXT GetPhysicalDeviceMultisamplePropertiesEXT} with a {@code samples} parameter equaling {@code rasterizationSamples}</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, or the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT} state enabled, and if {@code sampleLocationsEnable} was {@link VK10#VK_TRUE TRUE} in the last call to {@link EXTShaderObject#vkCmdSetSampleLocationsEnableEXT CmdSetSampleLocationsEnableEXT}, the fragment shader code <b>must</b> not statically use the extended instruction {@code InterpolateAtSample}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} state disabled and the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code sampleLocationsEnable} is {@link VK10#VK_TRUE TRUE}, then {@code sampleLocationsInfo.sampleLocationGridSize.width} <b>must</b> evenly divide {@link VkMultisamplePropertiesEXT}{@code ::sampleLocationGridSize.width} as returned by {@link EXTSampleLocations#vkGetPhysicalDeviceMultisamplePropertiesEXT GetPhysicalDeviceMultisamplePropertiesEXT} with a {@code samples} parameter equaling the value of {@code rasterizationSamples} in the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} state disabled and the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code sampleLocationsEnable} is {@link VK10#VK_TRUE TRUE}, then {@code sampleLocationsInfo.sampleLocationGridSize.height} <b>must</b> evenly divide {@link VkMultisamplePropertiesEXT}{@code ::sampleLocationGridSize.height} as returned by {@link EXTSampleLocations#vkGetPhysicalDeviceMultisamplePropertiesEXT GetPhysicalDeviceMultisamplePropertiesEXT} with a {@code samples} parameter equaling the value of {@code rasterizationSamples} in the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTSampleLocations#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT} state disabled and the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code sampleLocationsEnable} is {@link VK10#VK_TRUE TRUE}, then {@code sampleLocationsInfo.sampleLocationsPerPixel} <b>must</b> equal {@code rasterizationSamples} in the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT}</li>
     * <li>If a shader object is bound to any graphics stage or the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV} state enabled, and the last call to {@link EXTShaderObject#vkCmdSetCoverageModulationTableEnableNV CmdSetCoverageModulationTableEnableNV} set {@code coverageModulationTableEnable} to {@link VK10#VK_TRUE TRUE}, then the {@code coverageModulationTableCount} parameter in the last call to {@link EXTShaderObject#vkCmdSetCoverageModulationTableNV CmdSetCoverageModulationTableNV} <b>must</b> equal the current {@code rasterizationSamples} divided by the number of color samples in the current subpass</li>
     * <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and if current subpass has a depth/stencil attachment and depth test, stencil test, or depth bounds test are enabled in the currently bound pipeline state, then the current {@code rasterizationSamples} <b>must</b> be the same as the sample count of the depth/stencil attachment</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV} state enabled and the last call to {@link EXTShaderObject#vkCmdSetCoverageToColorEnableNV CmdSetCoverageToColorEnableNV} set the {@code coverageToColorEnable} to {@link VK10#VK_TRUE TRUE}, then the current subpass <b>must</b> have a color attachment at the location selected by the last call to {@link EXTShaderObject#vkCmdSetCoverageToColorLocationNV CmdSetCoverageToColorLocationNV} {@code coverageToColorLocation}, with a {@code VkFormat} of {@link VK10#VK_FORMAT_R8_UINT FORMAT_R8_UINT}, {@link VK10#VK_FORMAT_R8_SINT FORMAT_R8_SINT}, {@link VK10#VK_FORMAT_R16_UINT FORMAT_R16_UINT}, {@link VK10#VK_FORMAT_R16_SINT FORMAT_R16_SINT}, {@link VK10#VK_FORMAT_R32_UINT FORMAT_R32_UINT}, or {@link VK10#VK_FORMAT_R32_SINT FORMAT_R32_SINT}</li>
     * <li>If the {@link NVFragmentCoverageToColor VK_NV_fragment_coverage_to_color} extension is enabled, and a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage, and the most recent call to {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} in the current command buffer set {@code rasterizerDiscardEnable} to {@link VK10#VK_FALSE FALSE}, and the last call to {@link EXTShaderObject#vkCmdSetCoverageToColorEnableNV CmdSetCoverageToColorEnableNV} set the {@code coverageToColorEnable} to {@link VK10#VK_TRUE TRUE}, then the current subpass <b>must</b> have a color attachment at the location selected by the last call to {@link EXTShaderObject#vkCmdSetCoverageToColorLocationNV CmdSetCoverageToColorLocationNV} {@code coverageToColorLocation}, with a {@code VkFormat} of {@link VK10#VK_FORMAT_R8_UINT FORMAT_R8_UINT}, {@link VK10#VK_FORMAT_R8_SINT FORMAT_R8_SINT}, {@link VK10#VK_FORMAT_R16_UINT FORMAT_R16_UINT}, {@link VK10#VK_FORMAT_R16_SINT FORMAT_R16_SINT}, {@link VK10#VK_FORMAT_R32_UINT FORMAT_R32_UINT}, or {@link VK10#VK_FORMAT_R32_SINT FORMAT_R32_SINT}</li>
     * <li>If this {@link NVCoverageReductionMode VK_NV_coverage_reduction_mode} extension is enabled, the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV} and {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT} states enabled, the current coverage reduction mode {@code coverageReductionMode}, then the current {@code rasterizationSamples}, and the sample counts for the color and depth/stencil attachments (if the subpass has them) <b>must</b> be a valid combination returned by {@link NVCoverageReductionMode#vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV GetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, but not the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV} dynamic state enabled, then the bound graphics pipeline <b>must</b> have been created with {@link VkPipelineViewportSwizzleStateCreateInfoNV}{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} and {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV} dynamic states enabled then the {@code viewportCount} parameter in the last call to {@link EXTShaderObject#vkCmdSetViewportSwizzleNV CmdSetViewportSwizzleNV} <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the {@link NVViewportSwizzle VK_NV_viewport_swizzle} extension is enabled, and a shader object is bound to any graphics stage, then the {@code viewportCount} parameter in the last call to {@link EXTShaderObject#vkCmdSetViewportSwizzleNV CmdSetViewportSwizzleNV} <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and if the current subpass has any color attachments and {@code rasterizationSamples} of the last call to {@link EXTShaderObject#vkCmdSetRasterizationSamplesEXT CmdSetRasterizationSamplesEXT} is greater than the number of color samples, then the pipeline {@code sampleShadingEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT} or {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT} dynamic states enabled, and if the current {@code stippledLineEnable} state is {@link VK10#VK_TRUE TRUE} and the current {@code lineRasterizationMode} state is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_RECTANGULAR_KHR LINE_RASTERIZATION_MODE_RECTANGULAR_KHR}, then the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-stippledRectangularLines">{@code stippledRectangularLines}</a> feature <b>must</b> be enabled</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT} or {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT} dynamic states enabled, and if the current {@code stippledLineEnable} state is {@link VK10#VK_TRUE TRUE} and the current {@code lineRasterizationMode} state is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_BRESENHAM_KHR LINE_RASTERIZATION_MODE_BRESENHAM_KHR}, then the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-stippledBresenhamLines">{@code stippledBresenhamLines}</a> feature <b>must</b> be enabled</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT} or {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT} dynamic states enabled, and if the current {@code stippledLineEnable} state is {@link VK10#VK_TRUE TRUE} and the current {@code lineRasterizationMode} state is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_KHR LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_KHR}, then the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-stippledSmoothLines">{@code stippledSmoothLines}</a> feature <b>must</b> be enabled</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT} or {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT} dynamic states enabled, and if the current {@code stippledLineEnable} state is {@link VK10#VK_TRUE TRUE} and the current {@code lineRasterizationMode} state is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_DEFAULT_KHR LINE_RASTERIZATION_MODE_DEFAULT_KHR}, then the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-stippledRectangularLines">{@code stippledRectangularLines}</a> feature <b>must</b> be enabled and {@link VkPhysicalDeviceLimits}{@code ::strictLines} <b>must</b> be {@link VK10#VK_TRUE TRUE}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT} dynamic state enabled, <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-conservativePointAndLineRasterization">{@code conservativePointAndLineRasterization}</a> is not supported, and the effective primitive topology output by the last pre-rasterization shader stage is a line or point, then the {@code conservativeRasterizationMode} set by the last call to {@link EXTShaderObject#vkCmdSetConservativeRasterizationModeEXT CmdSetConservativeRasterizationModeEXT} <b>must</b> be {@link EXTConservativeRasterization#VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT}</li>
     * <li>If the currently bound pipeline was created with the {@link VkPipelineShaderStageCreateInfo}{@code ::stage} member of an element of {@link VkGraphicsPipelineCreateInfo}{@code ::pStages} set to {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT}, {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT}, {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT} or {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}, then <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#queries-mesh-shader">Mesh Shader Queries</a> <b>must</b> not be active</li>
     * <li>If a shader object is bound to the {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} stage or a graphics pipeline is bound which was created with the {@link EXTAttachmentFeedbackLoopDynamicState#VK_DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT} dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is {@link VK10#VK_FALSE FALSE}, then {@link EXTAttachmentFeedbackLoopDynamicState#vkCmdSetAttachmentFeedbackLoopEnableEXT CmdSetAttachmentFeedbackLoopEnableEXT} <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
     * <li>If dynamic state was inherited from {@link VkCommandBufferInheritanceViewportScissorInfoNV}, it <b>must</b> be set in the current command buffer prior to this drawing command</li>
     * <li>If there is no bound graphics pipeline, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT}</li>
     * <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-tessellationShader">{@code tessellationShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT}</li>
     * <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-tessellationShader">{@code tessellationShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}</li>
     * <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-geometryShader">{@code geometryShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}</li>
     * <li>If there is no bound graphics pipeline, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}</li>
     * <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-taskShader">{@code taskShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT}</li>
     * <li>If there is no bound graphics pipeline, and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-meshShader">{@code meshShader}</a> feature is enabled, {@code vkCmdBindShadersEXT} <b>must</b> have been called in the current command buffer with {@code pStages} with an element of {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT}</li>
     * <li>If there is no bound graphics pipeline, and at least one of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-taskShader">{@code taskShader}</a> and <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-meshShader">{@code meshShader}</a> features is enabled, one of the {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT} or {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT} stages <b>must</b> have a valid {@code VkShaderEXT} bound, and the other <b>must</b> have no {@code VkShaderEXT} bound</li>
     * <li>If there is no bound graphics pipeline, and both the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-taskShader">{@code taskShader}</a> and <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-meshShader">{@code meshShader}</a> features are enabled, and a valid {@code VkShaderEXT} is bound the to the {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT} stage, and that {@code VkShaderEXT} was created without the {@link EXTShaderObject#VK_SHADER_CREATE_NO_TASK_SHADER_BIT_EXT SHADER_CREATE_NO_TASK_SHADER_BIT_EXT} flag, a valid {@code VkShaderEXT} <b>must</b> be bound to the {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT} stage</li>
     * <li>If there is no bound graphics pipeline, and both the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-taskShader">{@code taskShader}</a> and <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-meshShader">{@code meshShader}</a> features are enabled, and a valid {@code VkShaderEXT} is bound the to the {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT} stage, and that {@code VkShaderEXT} was created with the {@link EXTShaderObject#VK_SHADER_CREATE_NO_TASK_SHADER_BIT_EXT SHADER_CREATE_NO_TASK_SHADER_BIT_EXT} flag, there <b>must</b> be no {@code VkShaderEXT} bound to the {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT} stage</li>
     * <li>If there is no bound graphics pipeline, and a valid {@code VkShaderEXT} is bound to the {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT} stage, there <b>must</b> be no {@code VkShaderEXT} bound to either the {@link EXTMeshShader#VK_SHADER_STAGE_TASK_BIT_EXT SHADER_STAGE_TASK_BIT_EXT} stage or the {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT} stage</li>
     * <li>If any graphics shader is bound which was created with the {@link EXTShaderObject#VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT} flag, then all shaders created with the {@link EXTShaderObject#VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT} flag in the same {@link EXTShaderObject#vkCreateShadersEXT CreateShadersEXT} call <b>must</b> also be bound</li>
     * <li>If any graphics shader is bound which was created with the {@link EXTShaderObject#VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT} flag, any stages in between stages whose shaders which did not create a shader with the {@link EXTShaderObject#VK_SHADER_CREATE_LINK_STAGE_BIT_EXT SHADER_CREATE_LINK_STAGE_BIT_EXT} flag as part of the same {@link EXTShaderObject#vkCreateShadersEXT CreateShadersEXT} call <b>must</b> not have any {@code VkShaderEXT} bound</li>
     * <li>All bound graphics shader objects <b>must</b> have been created with identical or identically defined push constant ranges</li>
     * <li>All bound graphics shader objects <b>must</b> have been created with identical or identically defined arrays of descriptor set layouts</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and a {@link VkRenderingInfo}{@code ::colorAttachmentCount} equal to 1, a color attachment with a resolve mode of {@link ANDROIDExternalFormatResolve#VK_RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID}, and a fragment shader is bound, it <b>must</b> not declare the {@code DepthReplacing} or {@code StencilRefReplacingEXT} execution modes</li>
     * <li>If the bound graphics pipeline state includes a fragment shader stage, was created with {@link VK13#VK_DYNAMIC_STATE_DEPTH_WRITE_ENABLE DYNAMIC_STATE_DEPTH_WRITE_ENABLE} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}, and the fragment shader declares the {@code EarlyFragmentTests} execution mode and uses {@code OpDepthAttachmentReadEXT}, the {@code depthWriteEnable} parameter in the last call to {@link VK13#vkCmdSetDepthWriteEnable CmdSetDepthWriteEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
     * <li>If the bound graphics pipeline state includes a fragment shader stage, was created with {@link VK10#VK_DYNAMIC_STATE_STENCIL_WRITE_MASK DYNAMIC_STATE_STENCIL_WRITE_MASK} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}, and the fragment shader declares the {@code EarlyFragmentTests} execution mode and uses {@code OpStencilAttachmentReadEXT}, the {@code writeMask} parameter in the last call to {@link VK10#vkCmdSetStencilWriteMask CmdSetStencilWriteMask} <b>must</b> be 0</li>
     * <li>If a shader object is bound to any graphics stage or the currently bound graphics pipeline was created with {@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_WRITE_MASK_EXT DYNAMIC_STATE_COLOR_WRITE_MASK_EXT}, and the format of any color attachment is {@link VK10#VK_FORMAT_E5B9G9R9_UFLOAT_PACK32 FORMAT_E5B9G9R9_UFLOAT_PACK32}, the corresponding element of the {@code pColorWriteMasks} parameter of {@link EXTShaderObject#vkCmdSetColorWriteMaskEXT CmdSetColorWriteMaskEXT} <b>must</b> either include all of {@link VK10#VK_COLOR_COMPONENT_R_BIT COLOR_COMPONENT_R_BIT}, {@link VK10#VK_COLOR_COMPONENT_G_BIT COLOR_COMPONENT_G_BIT}, and {@link VK10#VK_COLOR_COMPONENT_B_BIT COLOR_COMPONENT_B_BIT}, or none of them</li>
     * <li>If <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#framebuffer-blending">blending</a> is enabled for any attachment where either the source or destination blend factors for that attachment <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#framebuffer-dsb">use the secondary color input</a>, the maximum value of {@code Location} for any output attachment <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#shaders-staticuse">statically used</a> in the {@code Fragment} {@code Execution} {@code Model} executed by this command <b>must</b> be less than <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-maxFragmentDualSrcAttachments">{@code maxFragmentDualSrcAttachments}</a></li>
     * <li>If the current render pass was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, and there is no shader object bound to any graphics stage, the value of each element of {@link VkRenderingAttachmentLocationInfoKHR}{@code ::pColorAttachmentLocations} set by {@link KHRDynamicRenderingLocalRead#vkCmdSetRenderingAttachmentLocationsKHR CmdSetRenderingAttachmentLocationsKHR} <b>must</b> match the value set for the corresponding element in the currently bound pipeline</li>
     * <li>If the current render pass was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, and there is no shader object bound to any graphics stage, input attachment index mappings in the currently bound pipeline <b>must</b> match those set for the current render pass instance via {@link VkRenderingInputAttachmentIndexInfoKHR}</li>
     * <li>If the current render pass was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} with the {@link EXTLegacyDithering#VK_RENDERING_ENABLE_LEGACY_DITHERING_BIT_EXT RENDERING_ENABLE_LEGACY_DITHERING_BIT_EXT} flag, the bound graphics pipeline <b>must</b> have been created with {@link KHRMaintenance5#VK_PIPELINE_CREATE_2_ENABLE_LEGACY_DITHERING_BIT_EXT PIPELINE_CREATE_2_ENABLE_LEGACY_DITHERING_BIT_EXT}</li>
     * <li>If the bound graphics pipeline was created with {@link KHRMaintenance5#VK_PIPELINE_CREATE_2_ENABLE_LEGACY_DITHERING_BIT_EXT PIPELINE_CREATE_2_ENABLE_LEGACY_DITHERING_BIT_EXT}, the current render pass <b>must</b> have begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} with the {@link EXTLegacyDithering#VK_RENDERING_ENABLE_LEGACY_DITHERING_BIT_EXT RENDERING_ENABLE_LEGACY_DITHERING_BIT_EXT} flag</li>
     * </ul>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
     * <li>If {@code isPreprocessed} is {@link VK10#VK_TRUE TRUE} and {@link #vkGetGeneratedCommandsMemoryRequirementsEXT GetGeneratedCommandsMemoryRequirementsEXT} did not return a required size of zero then {@link #vkCmdPreprocessGeneratedCommandsEXT CmdPreprocessGeneratedCommandsEXT} <b>must</b> have already been executed on the device before this command executes, and the preprocessing command <b>must</b> have used the same {@code pGeneratedCommandsInfo} content as well as the content of the input buffers it references (all except {@link VkGeneratedCommandsInfoEXT}{@code ::preprocessBuffer})</li>
     * <li>If {@code isPreprocessed} is {@link VK10#VK_TRUE TRUE} then the {@code indirectCommandsLayout} member of {@code pGeneratedCommandsInfo} <b>must</b> have been created with the {@link #VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_EXT INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_EXT} bit set</li>
     * <li>If the {@code indirectCommandsLayout} member of {@code pGeneratedCommandsInfo} was created with the {@link #VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_EXT INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_EXT} bit set, then {@code isPreprocessed} <b>must</b> be {@link VK10#VK_TRUE TRUE}</li>
     * <li>The contents of the {@code preprocessAddress} member of {@code pGeneratedCommandsInfo} <b>must</b> not have been previously used to record another {@link #vkCmdExecuteGeneratedCommandsEXT CmdExecuteGeneratedCommandsEXT}</li>
     * <li>If {@code isPreprocessed} is {@link VK10#VK_TRUE TRUE} then the bound descriptor sets and push constants <b>must</b> match identically with those bound during recording of the corresponding call to {@link #vkCmdPreprocessGeneratedCommandsEXT CmdPreprocessGeneratedCommandsEXT}</li>
     * <li>If {@code isPreprocessed} is {@link VK10#VK_TRUE TRUE} then the conditional render state and its predicate value <b>must</b> match identically with the state and value set during execution of the corresponding call to {@link #vkCmdPreprocessGeneratedCommandsEXT CmdPreprocessGeneratedCommandsEXT}</li>
     * <li>If {@code isPreprocessed} is {@link VK10#VK_TRUE TRUE} and the {@code indirectCommandsLayout} member of {@code pGeneratedCommandsInfo} contains a draw token, then the graphics state bound on {@code commandBuffer} <b>must</b> match identically with the graphics state bound on the {@code stateCommandBuffer} passed to {@link #vkCmdPreprocessGeneratedCommandsEXT CmdPreprocessGeneratedCommandsEXT}</li>
     * <li>If {@code isPreprocessed} is {@link VK10#VK_TRUE TRUE}, then the queue family index of {@code commandBuffer} <b>must</b> be the same as the queue family index used to allocate the {@code stateCommandBuffer} passed to {@link #vkCmdPreprocessGeneratedCommandsEXT CmdPreprocessGeneratedCommandsEXT}</li>
     * <li>If {@code isPreprocessed} is {@link VK10#VK_TRUE TRUE} and the {@code indirectCommandsLayout} member of {@code pGeneratedCommandsInfo} contains a dispatch token, then the compute state bound on {@code commandBuffer} <b>must</b> match identically with the compute state bound on the {@code stateCommandBuffer} passed to {@link #vkCmdPreprocessGeneratedCommandsEXT CmdPreprocessGeneratedCommandsEXT}</li>
     * <li>If {@code isPreprocessed} is {@link VK10#VK_TRUE TRUE} and the {@code indirectCommandsLayout} member of {@code pGeneratedCommandsInfo} contains a ray tracing token, then the ray tracing state bound on {@code commandBuffer} <b>must</b> match identically with the ray tracing state bound on the {@code stateCommandBuffer} passed to {@link #vkCmdPreprocessGeneratedCommandsEXT CmdPreprocessGeneratedCommandsEXT}</li>
     * <li>If {@code isPreprocessed} is {@link VK10#VK_TRUE TRUE} and the {@code indirectCommandsLayout} member of {@code pGeneratedCommandsInfo} contains a ray tracing token, the queue family index {@code commandBuffer} was allocated from <b>must</b> be the same queue family index used to allocate the {@code stateCommandBuffer} passed to {@link #vkCmdPreprocessGeneratedCommandsEXT CmdPreprocessGeneratedCommandsEXT}</li>
     * <li>If the token sequence of the passed {@link VkGeneratedCommandsInfoEXT}{@code ::indirectCommandsLayout} contains a {@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT} token, the initial shader state of {@link VkGeneratedCommandsInfoEXT}{@code ::indirectExecutionSet} <b>must</b> be bound on {@code commandBuffer}</li>
     * <li>If {@code indirectCommandsLayout} was created with a token sequence that contained the {@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT} token and {@code indirectExecutionSet} was created using {@link #VK_INDIRECT_EXECUTION_SET_INFO_TYPE_SHADER_OBJECTS_EXT INDIRECT_EXECUTION_SET_INFO_TYPE_SHADER_OBJECTS_EXT}, every executed {@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT} token <b>must</b> bind all the shader stages set in the {@link VkIndirectCommandsExecutionSetTokenEXT}{@code ::shaderStages} used to create {@code indirectCommandsLayout}</li>
     * <li>If {@code isPreprocessed} is {@link VK10#VK_TRUE TRUE} and the token sequence of the passed {@link VkGeneratedCommandsInfoEXT}{@code ::indirectCommandsLayout} contains a {@link #VK_INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT} token, the members of {@link VkGeneratedCommandsInfoEXT}{@code ::indirectExecutionSet} accessed by this command <b>must</b> not have been modified since the preprocess buffer was generated</li>
     * <li>If the {@code indirectCommandsLayout} member of {@code pGeneratedCommandsInfo} contains a draw token, then the active render pass <b>must</b> not have a specified fragment density map</li>
     * <li>If <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-deviceGeneratedCommandsTransformFeedback">{@code deviceGeneratedCommandsTransformFeedback}</a> is not supported on device, transform feedback <b>must</b> not be active</li>
     * <li>If transform feedback is active, {@link VkGeneratedCommandsInfoEXT}{@code ::indirectExecutionSet} <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-deviceGeneratedCommands">{@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT}{@code ::deviceGeneratedCommands}</a> feature <b>must</b> be enabled</li>
     * <li>The currently bound shader stages <b>must</b> be supported by <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-supportedIndirectCommandsShaderStages">{@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT}{@code ::supportedIndirectCommandsShaderStages}</a></li>
     * <li>Only stages specified in <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-supportedIndirectCommandsShaderStages">{@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT}{@code ::supportedIndirectCommandsShaderStages}</a> <b>can</b> be set in {@code pGeneratedCommandsInfo→shaderStages}</li>
     * <li>If a rendering pass is currently active, the view mask <b>must</b> be 0</li>
     * <li>{@code commandBuffer} <b>must</b> not have been created with {@link VK10#VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pGeneratedCommandsInfo} <b>must</b> be a valid pointer to a valid {@link VkGeneratedCommandsInfoEXT} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>Action Indirection</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkGeneratedCommandsInfoEXT}</p>
     *
     * @param commandBuffer          the command buffer into which the command is recorded.
     * @param isPreprocessed         represents whether the input data has already been preprocessed on the device. If it is {@link VK10#VK_FALSE FALSE} this command will implicitly trigger the preprocessing step, otherwise not.
     * @param pGeneratedCommandsInfo a pointer to a {@link VkGeneratedCommandsInfoEXT} structure containing parameters affecting the generation of commands.
     */
    public static void vkCmdExecuteGeneratedCommandsEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean isPreprocessed, @NativeType("VkGeneratedCommandsInfoEXT const *") VkGeneratedCommandsInfoEXT pGeneratedCommandsInfo) {
        nvkCmdExecuteGeneratedCommandsEXT(commandBuffer, isPreprocessed ? 1 : 0, pGeneratedCommandsInfo.address());
    }

    // --- [ vkCreateIndirectCommandsLayoutEXT ] ---

    /** Unsafe version of: {@link #vkCreateIndirectCommandsLayoutEXT CreateIndirectCommandsLayoutEXT} */
    public static int nvkCreateIndirectCommandsLayoutEXT(VkDevice device, long pCreateInfo, long pAllocator, long pIndirectCommandsLayout) {
        long __functionAddress = device.getCapabilities().vkCreateIndirectCommandsLayoutEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkIndirectCommandsLayoutCreateInfoEXT.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pIndirectCommandsLayout, __functionAddress);
    }

    /**
     * Create an indirect command layout object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Indirect command layouts for {@link EXTDeviceGeneratedCommands VK_EXT_device_generated_commands} are created by:</p>
     * 
     * <pre><code>
     * VkResult vkCreateIndirectCommandsLayoutEXT(
     *     VkDevice                                    device,
     *     const VkIndirectCommandsLayoutCreateInfoEXT* pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkIndirectCommandsLayoutEXT*                pIndirectCommandsLayout);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-deviceGeneratedCommands">{@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT}{@code ::deviceGeneratedCommands}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkIndirectCommandsLayoutCreateInfoEXT} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pIndirectCommandsLayout} <b>must</b> be a valid pointer to a {@code VkIndirectCommandsLayoutEXT} handle</li>
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
     * <p>{@link VkAllocationCallbacks}, {@link VkIndirectCommandsLayoutCreateInfoEXT}</p>
     *
     * @param device                  the logical device that creates the indirect command layout.
     * @param pCreateInfo             a pointer to a {@link VkIndirectCommandsLayoutCreateInfoEXT} structure containing parameters affecting creation of the indirect command layout.
     * @param pAllocator              controls host memory allocation as described in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pIndirectCommandsLayout a pointer to a {@code VkIndirectCommandsLayoutEXT} handle in which the resulting indirect command layout is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateIndirectCommandsLayoutEXT(VkDevice device, @NativeType("VkIndirectCommandsLayoutCreateInfoEXT const *") VkIndirectCommandsLayoutCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkIndirectCommandsLayoutEXT *") LongBuffer pIndirectCommandsLayout) {
        if (CHECKS) {
            check(pIndirectCommandsLayout, 1);
        }
        return nvkCreateIndirectCommandsLayoutEXT(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pIndirectCommandsLayout));
    }

    // --- [ vkDestroyIndirectCommandsLayoutEXT ] ---

    /** Unsafe version of: {@link #vkDestroyIndirectCommandsLayoutEXT DestroyIndirectCommandsLayoutEXT} */
    public static void nvkDestroyIndirectCommandsLayoutEXT(VkDevice device, long indirectCommandsLayout, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyIndirectCommandsLayoutEXT;
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
     * <p>Indirect command layouts for {@link EXTDeviceGeneratedCommands VK_EXT_device_generated_commands} are destroyed by:</p>
     * 
     * <pre><code>
     * void vkDestroyIndirectCommandsLayoutEXT(
     *     VkDevice                                    device,
     *     VkIndirectCommandsLayoutEXT                 indirectCommandsLayout,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>All submitted commands that refer to {@code indirectCommandsLayout} <b>must</b> have completed execution</li>
     * <li>If {@link VkAllocationCallbacks} were provided when {@code indirectCommandsLayout} was created, a compatible set of callbacks <b>must</b> be provided here</li>
     * <li>If no {@link VkAllocationCallbacks} were provided when {@code indirectCommandsLayout} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code indirectCommandsLayout} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code indirectCommandsLayout} <b>must</b> be a valid {@code VkIndirectCommandsLayoutEXT} handle</li>
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
     * @param pAllocator             controls host memory allocation as described in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyIndirectCommandsLayoutEXT(VkDevice device, @NativeType("VkIndirectCommandsLayoutEXT") long indirectCommandsLayout, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyIndirectCommandsLayoutEXT(device, indirectCommandsLayout, memAddressSafe(pAllocator));
    }

    // --- [ vkCreateIndirectExecutionSetEXT ] ---

    /** Unsafe version of: {@link #vkCreateIndirectExecutionSetEXT CreateIndirectExecutionSetEXT} */
    public static int nvkCreateIndirectExecutionSetEXT(VkDevice device, long pCreateInfo, long pAllocator, long pIndirectExecutionSet) {
        long __functionAddress = device.getCapabilities().vkCreateIndirectExecutionSetEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pIndirectExecutionSet, __functionAddress);
    }

    /**
     * Create an indirect execution set.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Indirect Execution Sets are created by calling:</p>
     * 
     * <pre><code>
     * VkResult vkCreateIndirectExecutionSetEXT(
     *     VkDevice                                    device,
     *     const VkIndirectExecutionSetCreateInfoEXT*  pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkIndirectExecutionSetEXT*                  pIndirectExecutionSet);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-deviceGeneratedCommands">{@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT}{@code ::deviceGeneratedCommands}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkIndirectExecutionSetCreateInfoEXT} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pIndirectExecutionSet} <b>must</b> be a valid pointer to a {@code VkIndirectExecutionSetEXT} handle</li>
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
     * <p>{@link VkAllocationCallbacks}, {@link VkIndirectExecutionSetCreateInfoEXT}</p>
     *
     * @param device                the logical device that creates the indirect execution set.
     * @param pCreateInfo           a pointer to a {@link VkIndirectExecutionSetCreateInfoEXT} structure containing parameters affecting creation of the indirect execution set.
     * @param pAllocator            controls host memory allocation as described in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pIndirectExecutionSet a pointer to a {@code VkIndirectExecutionSetEXT} handle in which the resulting indirect execution set is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateIndirectExecutionSetEXT(VkDevice device, @NativeType("VkIndirectExecutionSetCreateInfoEXT const *") VkIndirectExecutionSetCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkIndirectExecutionSetEXT *") LongBuffer pIndirectExecutionSet) {
        if (CHECKS) {
            check(pIndirectExecutionSet, 1);
        }
        return nvkCreateIndirectExecutionSetEXT(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pIndirectExecutionSet));
    }

    // --- [ vkDestroyIndirectExecutionSetEXT ] ---

    /** Unsafe version of: {@link #vkDestroyIndirectExecutionSetEXT DestroyIndirectExecutionSetEXT} */
    public static void nvkDestroyIndirectExecutionSetEXT(VkDevice device, long indirectExecutionSet, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyIndirectExecutionSetEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), indirectExecutionSet, pAllocator, __functionAddress);
    }

    /**
     * Destroy an indirect execution set.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Destroy an Indirect Execution Set by calling:</p>
     * 
     * <pre><code>
     * void vkDestroyIndirectExecutionSetEXT(
     *     VkDevice                                    device,
     *     VkIndirectExecutionSetEXT                   indirectExecutionSet,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>All submitted commands that refer to {@code indirectExecutionSet} <b>must</b> have completed execution</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code indirectExecutionSet} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code indirectExecutionSet} <b>must</b> be a valid {@code VkIndirectExecutionSetEXT} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>If {@code indirectExecutionSet} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code indirectExecutionSet} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param device               the logical device that owns the indirect execution set.
     * @param indirectExecutionSet the indirect execution set to destroy.
     * @param pAllocator           controls host memory allocation as described in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyIndirectExecutionSetEXT(VkDevice device, @NativeType("VkIndirectExecutionSetEXT") long indirectExecutionSet, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyIndirectExecutionSetEXT(device, indirectExecutionSet, memAddressSafe(pAllocator));
    }

    // --- [ vkUpdateIndirectExecutionSetPipelineEXT ] ---

    /**
     * Unsafe version of: {@link #vkUpdateIndirectExecutionSetPipelineEXT UpdateIndirectExecutionSetPipelineEXT}
     *
     * @param executionSetWriteCount the number of elements in the {@code pExecutionSetWrites} array.
     */
    public static void nvkUpdateIndirectExecutionSetPipelineEXT(VkDevice device, long indirectExecutionSet, int executionSetWriteCount, long pExecutionSetWrites) {
        long __functionAddress = device.getCapabilities().vkUpdateIndirectExecutionSetPipelineEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), indirectExecutionSet, executionSetWriteCount, pExecutionSetWrites, __functionAddress);
    }

    /**
     * Update the contents of an indirect execution set.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Pipeline elements in an Indirect Execution Set can be updated by calling:</p>
     * 
     * <pre><code>
     * void vkUpdateIndirectExecutionSetPipelineEXT(
     *     VkDevice                                    device,
     *     VkIndirectExecutionSetEXT                   indirectExecutionSet,
     *     uint32_t                                    executionSetWriteCount,
     *     const VkWriteIndirectExecutionSetPipelineEXT* pExecutionSetWrites);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code indirectExecutionSet} <b>must</b> have been created with type {@link #VK_INDIRECT_EXECUTION_SET_INFO_TYPE_PIPELINES_EXT INDIRECT_EXECUTION_SET_INFO_TYPE_PIPELINES_EXT}</li>
     * <li>{@code executionSetWriteCount} <b>must</b> be less than or equal to {@link VkIndirectExecutionSetPipelineInfoEXT}{@code ::maxPipelineCount}</li>
     * <li>Each element in the {@code pExecutionSetWrites} array must have a unique {@link VkWriteIndirectExecutionSetPipelineEXT}{@code ::index}</li>
     * <li>Each member of the Indirect Execution Set referenced by the update command <b>must</b> not be in use by the device</li>
     * <li>The layout of each pipeline in {@code pExecutionSetWrites} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#descriptorsets-compatibility">compatible</a> with the {@code initialPipeline} used to create the Indirect Execution Set</li>
     * <li>Each pipeline in the Indirect Execution Set <b>must</b> have identically defined static and dynamic state values to the {@code initialPipeline} used to create the Indirect Execution Set</li>
     * <li>Each pipeline in the Indirect Execution Set <b>must</b> have identically defined <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#interfaces-fragmentoutput">fragment outputs interface</a> to the {@code initialPipeline} used to create the Indirect Execution Set</li>
     * <li>Each pipeline in the Indirect Execution Set <b>must</b> match the {@code initialPipeline} used to create the Indirect Execution Set in its included shader stages</li>
     * <li>Each pipeline in the Indirect Execution Set <b>must</b> match the {@code initialPipeline} used to create the Indirect Execution Set in its use of {@code FragDepth}</li>
     * <li>Each pipeline in the Indirect Execution Set <b>must</b> match the {@code initialPipeline} used to create the Indirect Execution Set in its use of {@code SampleMask}</li>
     * <li>Each pipeline in the Indirect Execution Set <b>must</b> match the {@code initialPipeline} used to create the Indirect Execution Set in its use of {@code StencilExportEXT}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code indirectExecutionSet} <b>must</b> be a valid {@code VkIndirectExecutionSetEXT} handle</li>
     * <li>{@code pExecutionSetWrites} <b>must</b> be a valid pointer to an array of {@code executionSetWriteCount} valid {@link VkWriteIndirectExecutionSetPipelineEXT} structures</li>
     * <li>{@code executionSetWriteCount} <b>must</b> be greater than 0</li>
     * <li>{@code indirectExecutionSet} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code indirectExecutionSet} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkWriteIndirectExecutionSetPipelineEXT}</p>
     *
     * @param device               the logical device that owns the indirect execution set.
     * @param indirectExecutionSet the indirect execution set being updated.
     * @param pExecutionSetWrites  a pointer to an array of {@link VkWriteIndirectExecutionSetPipelineEXT} structures describing the elements to update.
     */
    public static void vkUpdateIndirectExecutionSetPipelineEXT(VkDevice device, @NativeType("VkIndirectExecutionSetEXT") long indirectExecutionSet, @NativeType("VkWriteIndirectExecutionSetPipelineEXT const *") VkWriteIndirectExecutionSetPipelineEXT.Buffer pExecutionSetWrites) {
        nvkUpdateIndirectExecutionSetPipelineEXT(device, indirectExecutionSet, pExecutionSetWrites.remaining(), pExecutionSetWrites.address());
    }

    // --- [ vkUpdateIndirectExecutionSetShaderEXT ] ---

    /**
     * Unsafe version of: {@link #vkUpdateIndirectExecutionSetShaderEXT UpdateIndirectExecutionSetShaderEXT}
     *
     * @param executionSetWriteCount the number of elements in the {@code pExecutionSetWrites} array.
     */
    public static void nvkUpdateIndirectExecutionSetShaderEXT(VkDevice device, long indirectExecutionSet, int executionSetWriteCount, long pExecutionSetWrites) {
        long __functionAddress = device.getCapabilities().vkUpdateIndirectExecutionSetShaderEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), indirectExecutionSet, executionSetWriteCount, pExecutionSetWrites, __functionAddress);
    }

    /**
     * Update the contents of an indirect execution set.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Shader object elements in an Indirect Execution Set can be updated by calling:</p>
     * 
     * <pre><code>
     * void vkUpdateIndirectExecutionSetShaderEXT(
     *     VkDevice                                    device,
     *     VkIndirectExecutionSetEXT                   indirectExecutionSet,
     *     uint32_t                                    executionSetWriteCount,
     *     const VkWriteIndirectExecutionSetShaderEXT* pExecutionSetWrites);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code indirectExecutionSet} <b>must</b> have been created with type {@link #VK_INDIRECT_EXECUTION_SET_INFO_TYPE_SHADER_OBJECTS_EXT INDIRECT_EXECUTION_SET_INFO_TYPE_SHADER_OBJECTS_EXT}</li>
     * <li>Each element in the {@code pExecutionSetWrites} array must have a unique {@link VkWriteIndirectExecutionSetShaderEXT}{@code ::index}</li>
     * <li>Each member of the Indirect Execution Set referenced by the update command <b>must</b> not be in use by the device</li>
     * <li>The descriptor layout of each shader in {@code pExecutionSetWrites} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#descriptorsets-compatibility">compatible</a> with the initial layout info used to create the Indirect Execution Set</li>
     * <li>Each fragment shader element in the Indirect Execution Set <b>must</b> have identically defined <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#interfaces-fragmentoutput">fragment outputs interface</a> to the initial shader state used to create the Indirect Execution Set</li>
     * <li>Each fragment shader element in the Indirect Execution Set <b>must</b> match the initial shader state used to create the Indirect Execution Set in its use of {@code FragDepth}</li>
     * <li>Each fragment shader element in the Indirect Execution Set <b>must</b> match the initial shader state used to create the Indirect Execution Set in its use of {@code SampleMask}</li>
     * <li>Each fragment shader element in the Indirect Execution Set <b>must</b> match the initial shader state used to create the Indirect Execution Set in its use of {@code StencilExportEXT}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code indirectExecutionSet} <b>must</b> be a valid {@code VkIndirectExecutionSetEXT} handle</li>
     * <li>{@code pExecutionSetWrites} <b>must</b> be a valid pointer to an array of {@code executionSetWriteCount} valid {@link VkWriteIndirectExecutionSetShaderEXT} structures</li>
     * <li>{@code executionSetWriteCount} <b>must</b> be greater than 0</li>
     * <li>{@code indirectExecutionSet} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code indirectExecutionSet} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkWriteIndirectExecutionSetShaderEXT}</p>
     *
     * @param device               the logical device that owns the indirect execution set.
     * @param indirectExecutionSet the indirect execution set being updated.
     * @param pExecutionSetWrites  a pointer to an array of {@link VkWriteIndirectExecutionSetShaderEXT} structures describing the elements to update.
     */
    public static void vkUpdateIndirectExecutionSetShaderEXT(VkDevice device, @NativeType("VkIndirectExecutionSetEXT") long indirectExecutionSet, @NativeType("VkWriteIndirectExecutionSetShaderEXT const *") VkWriteIndirectExecutionSetShaderEXT.Buffer pExecutionSetWrites) {
        nvkUpdateIndirectExecutionSetShaderEXT(device, indirectExecutionSet, pExecutionSetWrites.remaining(), pExecutionSetWrites.address());
    }

    /** Array version of: {@link #vkCreateIndirectCommandsLayoutEXT CreateIndirectCommandsLayoutEXT} */
    @NativeType("VkResult")
    public static int vkCreateIndirectCommandsLayoutEXT(VkDevice device, @NativeType("VkIndirectCommandsLayoutCreateInfoEXT const *") VkIndirectCommandsLayoutCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkIndirectCommandsLayoutEXT *") long[] pIndirectCommandsLayout) {
        long __functionAddress = device.getCapabilities().vkCreateIndirectCommandsLayoutEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pIndirectCommandsLayout, 1);
            VkIndirectCommandsLayoutCreateInfoEXT.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pIndirectCommandsLayout, __functionAddress);
    }

    /** Array version of: {@link #vkCreateIndirectExecutionSetEXT CreateIndirectExecutionSetEXT} */
    @NativeType("VkResult")
    public static int vkCreateIndirectExecutionSetEXT(VkDevice device, @NativeType("VkIndirectExecutionSetCreateInfoEXT const *") VkIndirectExecutionSetCreateInfoEXT pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkIndirectExecutionSetEXT *") long[] pIndirectExecutionSet) {
        long __functionAddress = device.getCapabilities().vkCreateIndirectExecutionSetEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pIndirectExecutionSet, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pIndirectExecutionSet, __functionAddress);
    }

}