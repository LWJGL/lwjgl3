/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_device_generated_commands = "EXTDeviceGeneratedCommands".nativeClassVK("EXT_device_generated_commands", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension allows the device to generate a number of commands for command buffers. It provides a subset of functionality from both {@code VK_NV_device_generated_commands} and {@code VK_NV_device_generated_commands_compute} as well as some new features.

        When rendering a large number of objects, the device can be leveraged to implement a number of critical functions, like updating matrices, or implementing occlusion culling, frustum culling, front to back sorting, etc. Implementing those on the device does not require any special extension, since an application is free to define its own data structures, and just process them using shaders.

        To render objects which have been processed on the device, Vulkan has several ways to perform indirect rendering, from the most basic {@code vkCmdDrawIndirect} with one indirect draw to {@code vkCmdDrawIndirectCount} which supports multiple indirect draws batched together, with a way to determine number of draws at device execution time.

        However, if rendering state needs to change between the indirect draws, then unextended Vulkan forces the application to speculatively record a prohibitive number of redundant indirect commands covering all possible state combinations - which could end up processing nothing after culling - or read back the processed stream and issue graphics command from the host. For very large scenes, the synchronization overhead and cost to generate the command buffer can become the bottleneck. This extension allows an application to generate a device side stream of state changes and commands, and convert it efficiently into a command buffer without having to read it back to the host.

        Furthermore, it allows incremental changes to such command buffers by manipulating only partial sections of a command stream — for example pipeline and shader object bindings. Unextended Vulkan requires re-creation of entire command buffers in such a scenario, or updates synchronized on the host.

        The intended usage for this extension is for the application to:

        <ul>
            <li>create {@code VkBuffer} objects and retrieve physical addresses from them via #GetBufferDeviceAddress()</li>
            <li>create a {@code VkIndirectExecutionSetEXT} for the ability to change shaders on the device.</li>
            <li>create a {@code VkIndirectCommandsLayoutEXT}, which lists the {@code VkIndirectCommandsTokenTypeEXT} it wants to dynamically execute as an atomic command sequence. This step likely involves some internal device code compilation, since the intent is for the GPU to generate the command buffer based on the layout.</li>
            <li>fill the input stream buffers with the data for each of the inputs it needs. Each input is an array that will be filled with token-dependent data.</li>
            <li>set up a preprocess {@code VkBuffer} that uses memory according to the information retrieved via #GetGeneratedCommandsMemoryRequirementsEXT().</li>
            <li>optionally preprocess the generated content using #CmdPreprocessGeneratedCommandsEXT(), for example on an asynchronous compute queue, or for the purpose of re-using the data in multiple executions.</li>
            <li>call #CmdExecuteGeneratedCommandsEXT() to create and execute the actual device commands for all sequences based on the inputs provided.</li>
        </ul>

        For each draw in a sequence, the following can be specified:

        <ul>
            <li>a number of vertex buffer bindings</li>
            <li>a different index buffer, with an optional dynamic offset and index type</li>
            <li>a number of different push constants</li>
            <li>updates to bound shader stages</li>
        </ul>

        For each dispatch in a sequence, the following can be specified:

        <ul>
            <li>a number of different push constants</li>
            <li>updates to bound shader stages</li>
        </ul>

        For each trace rays in a sequence, the following can be specified:

        <ul>
            <li>a number of different push constants</li>
            <li>updates to bound shader stages</li>
        </ul>

        While the GPU can be faster than a CPU to generate the commands, it will not happen asynchronously to the device, therefore the primary use case is generating “{@code less}” total work (occlusion culling, classification to use specialized shaders, etc.).

        <h5>Example Code</h5>
        TODO

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_device_generated_commands}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>573</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRBufferDeviceAddress VK_KHR_buffer_device_address} and {@link KHRMaintenance5 VK_KHR_maintenance5}</dd>

            <dt><b>API Interactions</b></dt>
            <dd><ul>
                <li>Interacts with VK_EXT_shader_object</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Mike Blumenkrantz <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_device_generated_commands]%20@zmike%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_device_generated_commands%20extension*">zmike</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_device_generated_commands.adoc">VK_EXT_device_generated_commands</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2024-02-23</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires Vulkan 1.1</li>
                <li>This extension requires {@code VK_EXT_buffer_device_address} or {@code VK_KHR_buffer_device_address} or Vulkan 1.2 for the ability to bind vertex and index buffers on the device.</li>
                <li>This extension requires {@code VK_KHR_maintenance5} for the ability to use VkPipelineCreateFlags2KHR.</li>
                <li>This extension interacts with {@code VK_NV_mesh_shader}. If the latter extension is not supported, remove the command tokens to initiate NV mesh tasks drawing in this extension.</li>
                <li>This extension interacts with {@code VK_EXT_mesh_shader}. If the latter extension is not supported, remove the command tokens to initiate EXT mesh tasks drawing in this extension.</li>
                <li>This extension interacts with {@code VK_KHR_ray_tracing_pipeline}. If the latter extension is not supported, remove the command tokens to initiate ray tracing in this extension.</li>
                <li>This extension interacts with {@code VK_EXT_shader_object}. If the latter extension is not supported, remove references to shader objects in this extension.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Mike Blumenkrantz, VALVE</li>
                <li>Hans-Kristian Arntzen, VALVE</li>
                <li>Jan-Harald Fredriksen, ARM</li>
                <li>Spencer Fricke, LunarG</li>
                <li>Ricardo Garcia, Igalia</li>
                <li>Tobias Hector, AMD</li>
                <li>Baldur Karlsson, VALVE</li>
                <li>Christoph Kubisch, NVIDIA</li>
                <li>Lionel Landwerlin, INTEL</li>
                <li>Jon Leech, Khronos</li>
                <li>Ting Wei, ARM</li>
                <li>Ken Shanyi Zhang, AMD</li>
                <li>Faith Ekstrand, Collabora</li>
                <li>Vikram Kushwaha, NVIDIA</li>
                <li>Connor Abbott, VALVE</li>
                <li>Samuel Pitoiset, VALVE</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_DEVICE_GENERATED_COMMANDS_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME".."VK_EXT_device_generated_commands"
    )

    EnumConstant(
        "Extends {@code VkShaderCreateFlagBitsEXT}.",

        "SHADER_CREATE_INDIRECT_BINDABLE_BIT_EXT".enum(0x00000080)
    )

    EnumConstantLong(
        "Extends {@code VkBufferUsageFlagBits2KHR}.",

        "BUFFER_USAGE_2_PREPROCESS_BUFFER_BIT_EXT".enum(0x80000000L)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_EXT".."1000572000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_EXT".."1000572001",
        "STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_EXT".."1000572002",
        "STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_CREATE_INFO_EXT".."1000572003",
        "STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT".."1000572004",
        "STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT".."1000572006",
        "STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_EXT".."1000572007",
        "STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_PIPELINE_EXT".."1000572008",
        "STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_SHADER_EXT".."1000572009",
        "STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT".."1000572010",
        "STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT".."1000572011",
        "STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_LAYOUT_INFO_EXT".."1000572012",
        "STRUCTURE_TYPE_GENERATED_COMMANDS_PIPELINE_INFO_EXT".."1000572013",
        "STRUCTURE_TYPE_GENERATED_COMMANDS_SHADER_INFO_EXT".."1000572014"
    )

    EnumConstant(
        "Extends {@code VkObjectType}.",

        "OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_EXT".."1000572000",
        "OBJECT_TYPE_INDIRECT_EXECUTION_SET_EXT".."1000572001"
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2KHR}.",

        "PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_EXT".enum(0x4000000000L)
    )

    EnumConstant(
        "Extends {@code VkPipelineStageFlagBits}.",

        "PIPELINE_STAGE_COMMAND_PREPROCESS_BIT_EXT".enum(0x00020000)
    )

    EnumConstant(
        "Extends {@code VkAccessFlagBits}.",

        "ACCESS_COMMAND_PREPROCESS_READ_BIT_EXT".enum(0x00020000),
        "ACCESS_COMMAND_PREPROCESS_WRITE_BIT_EXT".enum(0x00040000)
    )

    EnumConstant(
        """
        VkIndirectCommandsInputModeFlagBitsEXT - Bitmask specifying allowed usage of an indirect commands layout

        <h5>Description</h5>
        <ul>
            <li>#INDIRECT_COMMANDS_INPUT_MODE_VULKAN_INDEX_BUFFER_EXT indicates that the indirect buffer contains ##VkBindIndexBufferIndirectCommandEXT.</li>
            <li>#INDIRECT_COMMANDS_INPUT_MODE_DXGI_INDEX_BUFFER_EXT indicates that the indirect buffer contains {@code D3D12_INDEX_BUFFER_VIEW}.</li>
        </ul>

        <h5>See Also</h5>
        ##VkIndirectCommandsIndexBufferTokenEXT
        """,

        "INDIRECT_COMMANDS_INPUT_MODE_VULKAN_INDEX_BUFFER_EXT".enum(0x00000001),
        "INDIRECT_COMMANDS_INPUT_MODE_DXGI_INDEX_BUFFER_EXT".enum(0x00000002)
    )

    EnumConstant(
        """
        VkIndirectExecutionSetInfoTypeEXT - Enum specifying allowed usage of an indirect execution set

        <h5>Description</h5>
        <ul>
            <li>#INDIRECT_EXECUTION_SET_INFO_TYPE_PIPELINES_EXT specifies that the indirect execution set contains {@code VkPipeline} objects.</li>
            <li>#INDIRECT_EXECUTION_SET_INFO_TYPE_SHADER_OBJECTS_EXT specifies that the indirect execution set contains {@code VkShaderEXT} objects.</li>
        </ul>

        <h5>See Also</h5>
        ##VkIndirectCommandsExecutionSetTokenEXT, ##VkIndirectExecutionSetCreateInfoEXT
        """,

        "INDIRECT_EXECUTION_SET_INFO_TYPE_PIPELINES_EXT".."0",
        "INDIRECT_EXECUTION_SET_INFO_TYPE_SHADER_OBJECTS_EXT".."1"
    )

    EnumConstant(
        """
        VkIndirectCommandsLayoutUsageFlagBitsEXT - Bitmask specifying allowed usage of an indirect commands layout

        <h5>Description</h5>
        <ul>
            <li>#INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_EXT specifies that the layout is always used with the manual preprocessing step through calling #CmdPreprocessGeneratedCommandsEXT() and executed by #CmdExecuteGeneratedCommandsEXT() with {@code isPreprocessed} set to #TRUE.</li>
            <li>#INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_EXT specifies that the processing of sequences will happen at an implementation-dependent order, which is not guaranteed to be deterministic using the same input data. This flag is ignored when the {@code shaderStages} is #SHADER_STAGE_COMPUTE_BIT as it is implied that the dispatch sequence is always unordered.</li>
        </ul>
        """,

        "INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_EXT".enum(0x00000001),
        "INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_EXT".enum(0x00000002)
    )

    EnumConstant(
        """
        VkIndirectCommandsTokenTypeEXT - Enum specifying token commands

        <h5>Description</h5>
        <h6>Supported Indirect Command Tokens</h6>
        <table class="lwjgl">
            <thead><tr><th><b>Common Tokens</b></th><th><b>Command Data</b></th></tr></thead>
            <tbody>
                <tr><td>#INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT</td><td>{@code u32[]} array of indices into the indirect execution set</td></tr>
                <tr><td>#INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT</td><td>{@code u32[]} raw data</td></tr>
                <tr><td>#INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT</td><td>{@code u32} placeholder data (not accessed by shader)</td></tr>
                <tr><td><b>Compute Tokens</b></td><td></td></tr>
                <tr><td>#INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_EXT</td><td>##VkDispatchIndirectCommand</td></tr>
                <tr><td><b>Ray Tracing Tokens</b></td><td></td></tr>
                <tr><td>#INDIRECT_COMMANDS_TOKEN_TYPE_TRACE_RAYS2_EXT</td><td>##VkTraceRaysIndirectCommand2KHR</td></tr>
                <tr><td><b>Graphics State Tokens</b></td><td></td></tr>
                <tr><td>#INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_EXT</td><td>##VkBindIndexBufferIndirectCommandEXT</td></tr>
                <tr><td>#INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_EXT</td><td>##VkBindVertexBufferIndirectCommandEXT</td></tr>
                <tr><td><b>Graphics Draw Tokens</b></td><td></td></tr>
                <tr><td>#INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_EXT</td><td>##VkDrawIndexedIndirectCommand</td></tr>
                <tr><td>#INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_EXT</td><td>##VkDrawIndirectCommand</td></tr>
                <tr><td>#INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_EXT</td><td>##VkDrawMeshTasksIndirectCommandEXT</td></tr>
                <tr><td>#INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_NV_EXT</td><td>##VkDrawMeshTasksIndirectCommandNV</td></tr>
                <tr><td><b>Graphics Draw Count Tokens</b></td><td></td></tr>
                <tr><td>#INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_COUNT_EXT</td><td>##VkDrawIndirectCountIndirectCommandEXT with VkDrawIndexedIndirectCommand</td></tr>
                <tr><td>#INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_COUNT_EXT</td><td>##VkDrawIndirectCountIndirectCommandEXT with VkDrawIndirectCommand</td></tr>
                <tr><td>#INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_COUNT_EXT</td><td>##VkDrawIndirectCountIndirectCommandEXT with VkDrawMeshTasksIndirectCommandEXT</td></tr>
                <tr><td>#INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_COUNT_NV_EXT</td><td>##VkDrawIndirectCountIndirectCommandEXT with VkDrawMeshTasksIndirectCommandNV</td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        ##VkIndirectCommandsLayoutTokenEXT
        """,

        "INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT".."0",
        "INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT".."1",
        "INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT".."2",
        "INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_EXT".."3",
        "INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_EXT".."4",
        "INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_EXT".."5",
        "INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_EXT".."6",
        "INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_COUNT_EXT".."7",
        "INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_COUNT_EXT".."8",
        "INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_EXT".."9"
    )

    void(
        "GetGeneratedCommandsMemoryRequirementsEXT",
        """
        Retrieve the buffer allocation requirements for generated commands.

        <h5>C Specification</h5>
        With {@link EXTDeviceGeneratedCommands VK_EXT_device_generated_commands}, to retrieve the memory size and alignment requirements of a particular execution state call:

        <pre><code>
￿void vkGetGeneratedCommandsMemoryRequirementsEXT(
￿    VkDevice                                    device,
￿    const VkGeneratedCommandsMemoryRequirementsInfoEXT* pInfo,
￿    VkMemoryRequirements2*                      pMemoryRequirements);</code></pre>

        <h5>Description</h5>
        If the size returned is zero, the preprocessing step can be skipped for this layout.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkGeneratedCommandsMemoryRequirementsInfoEXT structure</li>
            <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a ##VkMemoryRequirements2 structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkGeneratedCommandsMemoryRequirementsInfoEXT, ##VkMemoryRequirements2
        """,

        VkDevice("device", "the logical device that owns the buffer."),
        VkGeneratedCommandsMemoryRequirementsInfoEXT.const.p("pInfo", "a pointer to a ##VkGeneratedCommandsMemoryRequirementsInfoEXT structure containing parameters required for the memory requirements query."),
        VkMemoryRequirements2.p("pMemoryRequirements", "a pointer to a ##VkMemoryRequirements2 structure in which the memory requirements of the buffer object are returned.")
    )

    void(
        "CmdPreprocessGeneratedCommandsEXT",
        """
        Performs preprocessing for generated commands.

        <h5>C Specification</h5>
        Commands <b>can</b> be preprocessed prior execution using the following command:

        <pre><code>
￿void vkCmdPreprocessGeneratedCommandsEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkGeneratedCommandsInfoEXT*           pGeneratedCommandsInfo,
￿    VkCommandBuffer                             stateCommandBuffer);</code></pre>

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        {@code stateCommandBuffer} access is not synchronized by the driver, meaning that this command buffer <b>must</b> not be modified between threads in an unsafe manner.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
            <li>{@code pGeneratedCommandsInfo}’s {@code indirectCommandsLayout} <b>must</b> have been created with the #INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_EXT bit set</li>
            <li>If the token sequence of the passed ##VkGeneratedCommandsInfoEXT{@code ::indirectCommandsLayout} contains a #INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT token, the initial shader state of ##VkGeneratedCommandsInfoEXT{@code ::indirectExecutionSet} <b>must</b> be bound on {@code stateCommandBuffer}</li>
            <li>{@code stateCommandBuffer} <b>must</b> be in the recording state</li>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-deviceGeneratedCommands">##VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT{@code ::deviceGeneratedCommands}</a> feature <b>must</b> be enabled</li>
            <li>Only stages specified in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-supportedIndirectCommandsShaderStages">##VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT{@code ::supportedIndirectCommandsShaderStages}</a> <b>can</b> be set in {@code pGeneratedCommandsInfo→shaderStages}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pGeneratedCommandsInfo} <b>must</b> be a valid pointer to a valid ##VkGeneratedCommandsInfoEXT structure</li>
            <li>{@code stateCommandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
            <li>Both of {@code commandBuffer}, and {@code stateCommandBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to {@code stateCommandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Outside</td><td>Outside</td><td>Graphics Compute</td><td>Action</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkGeneratedCommandsInfoEXT
        """,

        VkCommandBuffer("commandBuffer", "the command buffer which does the preprocessing."),
        VkGeneratedCommandsInfoEXT.const.p("pGeneratedCommandsInfo", "a pointer to a ##VkGeneratedCommandsInfoEXT structure containing parameters affecting the preprocessing step."),
        VkCommandBuffer("stateCommandBuffer", "a command buffer from which to snapshot current states affecting the preprocessing step. When a graphics command action token is used, graphics state is snapshotted. When a compute action command token is used, compute state is snapshotted. When a ray tracing action command token is used, ray tracing state is snapshotted. It can be deleted at any time after this command has been recorded.")
    )

    void(
        "CmdExecuteGeneratedCommandsEXT",
        """
        Generate and execute commands on the device.

        <h5>C Specification</h5>
        With {@link EXTDeviceGeneratedCommands VK_EXT_device_generated_commands}, the actual generation of commands as well as their execution on the device is handled as single action with:

        <pre><code>
￿void vkCmdExecuteGeneratedCommandsEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    isPreprocessed,
￿    const VkGeneratedCommandsInfoEXT*           pGeneratedCommandsInfo);</code></pre>

        <h5>Description</h5>
        If the #INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_EXT flag was used to create the ##VkGeneratedCommandsInfoEXT{@code ::indirectCommandsLayout} then the execution of sequences through this command <b>may</b> use implementation-defined ordering which is not guaranteed to be coherent using the same input data. It does not affect the order of token processing within a sequence. This is the implied ordering with #INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_EXT.

        After a call to {@code vkCmdExecuteGeneratedCommandsEXT}, command buffer state will become undefined according to the tokens executed. This table specifies the relationship between tokens used and state invalidation.

        <h6>Indirect Execution State Invalidation</h6>
        <table class="lwjgl">
            <thead><tr><th><b>Common Tokens</b></th><th><b>States Invalidated</b></th></tr></thead>
            <tbody>
                <tr><td>#INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT</td><td>Bound shaders and pipelines</td></tr>
                <tr><td>#INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT</td><td>Push constant data</td></tr>
                <tr><td>#INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT</td><td>Push constant data</td></tr>
                <tr><td>#INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_EXT</td><td>Index buffer</td></tr>
                <tr><td>#INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_EXT</td><td>Vertex buffer</td></tr>
            </tbody>
        </table>

        <h5>Valid Usage</h5>
        <ul>
            <li>If a {@code VkSampler} created with {@code magFilter} or {@code minFilter} equal to #FILTER_LINEAR, {@code reductionMode} equal to #SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE, and {@code compareEnable} equal to #FALSE is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT</li>
            <li>If a {@code VkSampler} created with {@code magFilter} or {@code minFilter} equal to #FILTER_LINEAR and {@code reductionMode} equal to either #SAMPLER_REDUCTION_MODE_MIN or #SAMPLER_REDUCTION_MODE_MAX is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT</li>
            <li>If a {@code VkSampler} created with {@code mipmapMode} equal to #SAMPLER_MIPMAP_MODE_LINEAR, {@code reductionMode} equal to #SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE, and {@code compareEnable} equal to #FALSE is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT</li>
            <li>If a {@code VkSampler} created with {@code mipmapMode} equal to #SAMPLER_MIPMAP_MODE_LINEAR and {@code reductionMode} equal to either #SAMPLER_REDUCTION_MODE_MIN or #SAMPLER_REDUCTION_MODE_MAX is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT</li>
            <li>If a {@code VkSampler} created with {@code unnormalizedCoordinates} equal to #TRUE is used to sample a {@code VkImageView} as a result of this command, then the image view’s {@code levelCount} and {@code layerCount} <b>must</b> be 1</li>
            <li>If a {@code VkSampler} created with {@code unnormalizedCoordinates} equal to #TRUE is used to sample a {@code VkImageView} as a result of this command, then the image view’s {@code viewType} <b>must</b> be #IMAGE_VIEW_TYPE_1D or #IMAGE_VIEW_TYPE_2D</li>
            <li>If a {@code VkImageView} is sampled with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#textures-depth-compare-operation">depth comparison</a>, the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT</li>
            <li>If a {@code VkImageView} is accessed using atomic operations as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT</li>
            <li>If a #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER descriptor is accessed using atomic operations as a result of this command, then the storage texel buffer’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-buffer-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT</li>
            <li>If a {@code VkImageView} is sampled with #FILTER_CUBIC_EXT as a result of this command, then the image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT</li>
            <li>If the {@link EXTFilterCubic VK_EXT_filter_cubic} extension is not enabled and any {@code VkImageView} is sampled with #FILTER_CUBIC_EXT as a result of this command, it <b>must</b> not have a {@code VkImageViewType} of #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, or #IMAGE_VIEW_TYPE_CUBE_ARRAY</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering, as specified by ##VkFilterCubicImageViewImageFormatPropertiesEXT{@code ::filterCubic} returned by #GetPhysicalDeviceImageFormatProperties2()</li>
            <li>Any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT with a reduction mode of either #SAMPLER_REDUCTION_MODE_MIN or #SAMPLER_REDUCTION_MODE_MAX as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering together with minmax filtering, as specified by ##VkFilterCubicImageViewImageFormatPropertiesEXT{@code ::filterCubicMinmax} returned by #GetPhysicalDeviceImageFormatProperties2()</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-filter-cubic-range-clamp">{@code cubicRangeClamp}</a> feature is not enabled, then any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT as a result of this command <b>must</b> not have a ##VkSamplerReductionModeCreateInfo{@code ::reductionMode} equal to #SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM</li>
            <li>Any {@code VkImageView} being sampled with a ##VkSamplerReductionModeCreateInfo{@code ::reductionMode} equal to #SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM as a result of this command <b>must</b> sample with #FILTER_CUBIC_EXT</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-filter-cubic-weight-selection">{@code selectableCubicWeights}</a> feature is not enabled, then any {@code VkImageView} being sampled with #FILTER_CUBIC_EXT as a result of this command <b>must</b> have ##VkSamplerCubicWeightsCreateInfoQCOM{@code ::cubicWeights} equal to #CUBIC_FILTER_WEIGHTS_CATMULL_ROM_QCOM</li>
            <li>Any {@code VkImage} created with a ##VkImageCreateInfo{@code ::flags} containing #IMAGE_CREATE_CORNER_SAMPLED_BIT_NV sampled as a result of this command <b>must</b> only be sampled using a {@code VkSamplerAddressMode} of #SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE</li>
            <li>For any {@code VkImageView} being written as a storage image where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT</li>
            <li>For any {@code VkImageView} being read as a storage image where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT</li>
            <li>For any {@code VkBufferView} being written as a storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown}, the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkFormatProperties3">buffer features</a> <b>must</b> contain #FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT</li>
            <li>Any {@code VkBufferView} being read as a storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown} then the view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkFormatProperties3">buffer features</a> <b>must</b> contain #FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT</li>
            <li>For each set <em>n</em> that is statically used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-binding">a bound shader</a>, a descriptor set <b>must</b> have been bound to <em>n</em> at the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline} or the {@code VkDescriptorSetLayout} array used to create the current {@code VkShaderEXT} , as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>For each push constant that is statically used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-binding">a bound shader</a>, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline} or the {@code VkDescriptorSetLayout} array used to create the current {@code VkShaderEXT} , as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>For each array of resources that is used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-binding">a bound shader</a>, the indices used to access members of the array <b>must</b> be less than the descriptor count for the identified binding in the descriptor sets used by this command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-maintenance4">{@code maintenance4}</a> feature is not enabled, then for each push constant that is statically used by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-binding">a bound shader</a>, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline} or the {@code VkDescriptorSetLayout} and ##VkPushConstantRange arrays used to create the current {@code VkShaderEXT} , as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
            <li>Descriptors in each bound descriptor set, specified via #CmdBindDescriptorSets(), <b>must</b> be valid as described by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptor-validity">descriptor validity</a> if they are statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command and the bound {@code VkPipeline} was not created with #PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT</li>
            <li>If the descriptors used by the {@code VkPipeline} bound to the pipeline bind point were specified via #CmdBindDescriptorSets(), the bound {@code VkPipeline} <b>must</b> have been created without #PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT</li>
            <li>Descriptors in bound descriptor buffers, specified via #CmdSetDescriptorBufferOffsetsEXT(), <b>must</b> be valid if they are dynamically used by the {@code VkPipeline} bound to the pipeline bind point used by this command and the bound {@code VkPipeline} was created with #PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT</li>
            <li>Descriptors in bound descriptor buffers, specified via #CmdSetDescriptorBufferOffsetsEXT(), <b>must</b> be valid if they are dynamically used by any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command</li>
            <li>If the descriptors used by the {@code VkPipeline} bound to the pipeline bind point were specified via #CmdSetDescriptorBufferOffsetsEXT(), the bound {@code VkPipeline} <b>must</b> have been created with #PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT</li>
            <li>If a descriptor is dynamically used with a {@code VkPipeline} created with #PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT, the descriptor memory <b>must</b> be resident</li>
            <li>If a descriptor is dynamically used with a {@code VkShaderEXT} created with a {@code VkDescriptorSetLayout} that was created with #DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT, the descriptor memory <b>must</b> be resident</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature is not enabled, a valid pipeline <b>must</b> be bound to the pipeline bind point used by this command</li>
            <li>If a pipeline is bound to the pipeline bind point used by this command, there <b>must</b> not have been any calls to dynamic state setting commands for any state specified statically in the {@code VkPipeline} object bound to the pipeline bind point used by this command, since that pipeline was bound</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type #IMAGE_VIEW_TYPE_3D, #IMAGE_VIEW_TYPE_CUBE, #IMAGE_VIEW_TYPE_1D_ARRAY, #IMAGE_VIEW_TYPE_2D_ARRAY or #IMAGE_VIEW_TYPE_CUBE_ARRAY, in any shader stage</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
            <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command or any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature is enabled, either a valid pipeline <b>must</b> be bound to the pipeline bind point used by this command, or a valid combination of valid and #NULL_HANDLE shader objects <b>must</b> be bound to every supported shader stage corresponding to the pipeline bind point used by this command</li>
            <li>If any stage of the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a uniform buffer, and that stage was created without enabling either #PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT or #PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT for {@code uniformBuffers}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, that stage <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, and any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a uniform buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If any stage of the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a storage buffer, and that stage was created without enabling either #PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT or #PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT for {@code storageBuffers}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, that stage <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is not enabled, and any {@code VkShaderEXT} bound to a stage corresponding to the pipeline bind point used by this command accesses a storage buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
            <li>If {@code commandBuffer} is an unprotected command buffer and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, any resource accessed by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-binding">bound shaders</a> <b>must</b> not be a protected resource</li>
            <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-binding">a bound shader</a> accesses a {@code VkSampler} or {@code VkImageView} object that enables <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> only be used with {@code OpImageSample*} or {@code OpImageSparseSample*} instructions</li>
            <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-binding">a bound shader</a> accesses a {@code VkSampler} or {@code VkImageView} object that enables <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> not use the {@code ConstOffset} and {@code Offset} operands</li>
            <li>If a {@code VkImageView} is accessed as a result of this command, then the image view’s {@code viewType} <b>must</b> match the {@code Dim} operand of the {@code OpTypeImage} as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#spirvenv-image-dimensions">Compatibility Between SPIR-V Image Dimensions and Vulkan ImageView Types</a></li>
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
            <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} instruction is used to read from an {@code VkImageView} as a result of this command, then the image view’s format <b>must</b> be a single-component format</li>
            <li>If a {@code OpImageBlockMatchWindow*QCOM} or {@code OpImageBlockMatchGather*QCOM} read from a reference image as result of this command, then the specified reference coordinates <b>must</b> not fail <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#textures-integer-coordinate-validation">integer texel coordinate validation</a></li>
            <li>Any shader invocation executed by this command <b>must</b> <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-termination">terminate</a></li>
            <li>If a descriptor with type equal to any of #DESCRIPTOR_TYPE_SAMPLE_WEIGHT_IMAGE_QCOM, #DESCRIPTOR_TYPE_BLOCK_MATCH_IMAGE_QCOM, #DESCRIPTOR_TYPE_SAMPLED_IMAGE, #DESCRIPTOR_TYPE_STORAGE_IMAGE, or #DESCRIPTOR_TYPE_INPUT_ATTACHMENT is accessed as a result of this command, the image subresource identified by that descriptor <b>must</b> be in the image layout identified when the descriptor was written</li>
            <li>The current render pass <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} bound to #PIPELINE_BIND_POINT_GRAPHICS</li>
            <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the ##VkGraphicsPipelineCreateInfo structure specified when creating the {@code VkPipeline} bound to #PIPELINE_BIND_POINT_GRAPHICS</li>
            <li>If any shader statically accesses an input attachment, a valid descriptor <b>must</b> be bound to the pipeline via a descriptor set</li>
            <li>If any shader executed by this pipeline accesses an {@code OpTypeImage} variable with a {@code Dim} operand of {@code SubpassData}, it <b>must</b> be decorated with an {@code InputAttachmentIndex} that corresponds to a valid input attachment in the current subpass</li>
            <li>Input attachment views accessed in a subpass <b>must</b> be created with the same {@code VkFormat} as the corresponding subpass definition, and be created with a {@code VkImageView} that is compatible with the attachment referenced by the subpass' {@code pInputAttachments}[{@code InputAttachmentIndex}] in the currently bound {@code VkFramebuffer} as specified by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#compatibility-inputattachment">Fragment Input Attachment Compatibility</a></li>
            <li>Input attachment views accessed in a dynamic render pass with a {@code InputAttachmentIndex} referenced by ##VkRenderingInputAttachmentIndexInfoKHR, or no {@code InputAttachmentIndex} if ##VkRenderingInputAttachmentIndexInfoKHR:{@code pDepthInputAttachmentIndex} or ##VkRenderingInputAttachmentIndexInfoKHR:{@code pStencilInputAttachmentIndex} are {@code NULL}, <b>must</b> be created with a {@code VkImageView} that is compatible with the corresponding color, depth, or stencil attachment in ##VkRenderingInfo</li>
            <li>Input attachment views accessed in a dynamic render pass via a shader object <b>must</b> have an {@code InputAttachmentIndex} if both ##VkRenderingInputAttachmentIndexInfoKHR:{@code pDepthInputAttachmentIndex} and ##VkRenderingInputAttachmentIndexInfoKHR:{@code pStencilInputAttachmentIndex} are non-{@code NULL}</li>
            <li>If an input attachment view accessed in a dynamic render pass via a shader object has an {@code InputAttachmentIndex}, the {@code InputAttachmentIndex} <b>must</b> match an index in ##VkRenderingInputAttachmentIndexInfoKHR</li>
            <li>Memory backing image subresources used as attachments in the current render pass <b>must</b> not be written in any way other than as an attachment by this command</li>
            <li>
                If a color attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it is not in the #IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT image layout, and either:
                <ul>
                    <li>the #PIPELINE_CREATE_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT is set on the currently bound pipeline or</li>
                    <li>
                        the last call to #CmdSetAttachmentFeedbackLoopEnableEXT() included #IMAGE_ASPECT_COLOR_BIT and
                        <ul>
                            <li>there is no currently bound graphics pipeline or</li>
                            <li>the currently bound graphics pipeline was created with #DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT</li>
                        </ul>
                    </li>
                </ul>

                it <b>must</b> not be accessed in any way other than as an attachment by this command
            </li>
            <li>
                If a depth attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it is not in the #IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT image layout, and either:
                <ul>
                    <li>the #PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT is set on the currently bound pipeline or</li>
                    <li>
                        the last call to #CmdSetAttachmentFeedbackLoopEnableEXT() included #IMAGE_ASPECT_DEPTH_BIT and
                        <ul>
                            <li>there is no currently bound graphics pipeline or</li>
                            <li>the currently bound graphics pipeline was created with #DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT</li>
                        </ul>
                    </li>
                </ul>

                it <b>must</b> not be accessed in any way other than as an attachment by this command
            </li>
            <li>
                If a stencil attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it is not in the #IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT image layout, and either:
                <ul>
                    <li>the #PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT is set on the currently bound pipeline or</li>
                    <li>
                        the last call to #CmdSetAttachmentFeedbackLoopEnableEXT() included #IMAGE_ASPECT_STENCIL_BIT and
                        <ul>
                            <li>there is no currently bound graphics pipeline or</li>
                            <li>the currently bound graphics pipeline was created with #DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT</li>
                        </ul>
                    </li>
                </ul>

                it <b>must</b> not be accessed in any way other than as an attachment by this command
            </li>
            <li>If an attachment is written by any prior command in this subpass or by the load, store, or resolve operations for this subpass, it <b>must</b> not be accessed in any way other than as an attachment, storage image, or sampled image by this command</li>
            <li>If any previously recorded command in the current subpass accessed an image subresource used as an attachment in this subpass in any way other than as an attachment, this command <b>must</b> not write to that image subresource as an attachment</li>
            <li>If the current render pass instance uses a depth/stencil attachment with a read-only layout for the depth aspect, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fragops-depth-write">depth writes</a> <b>must</b> be disabled</li>
            <li>If the current render pass instance uses a depth/stencil attachment with a read-only layout for the stencil aspect, both front and back {@code writeMask} are not zero, and stencil test is enabled, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fragops-stencil">all stencil ops</a> <b>must</b> be #STENCIL_OP_KEEP</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT dynamic state enabled then #CmdSetViewport() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SCISSOR dynamic state enabled then #CmdSetScissor() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_WIDTH dynamic state enabled then #CmdSetLineWidth() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetPolygonModeEXT() in the current command buffer set {@code polygonMode} to #POLYGON_MODE_LINE, #CmdSetLineWidth() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetPrimitiveTopology() in the current command buffer set {@code primitiveTopology} to any line topology, #CmdSetLineWidth() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object that outputs line primitives is bound to the #SHADER_STAGE_TESSELLATION_EVALUATION_BIT or #SHADER_STAGE_GEOMETRY_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, #CmdSetLineWidth() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_DEPTH_BIAS dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code depthBiasEnable} is #TRUE, then #CmdSetDepthBounds() or #CmdSetDepthBias2EXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_BLEND_CONSTANTS dynamic state enabled then #CmdSetBlendConstants() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetColorBlendEnableEXT() in the current command buffer set any element of {@code pColorBlendEnables} to #TRUE, and the most recent call to #CmdSetColorBlendEquationEXT() in the current command buffer set the same element of {@code pColorBlendEquations} to a ##VkColorBlendEquationEXT structure with any {@code VkBlendFactor} member with a value of #BLEND_FACTOR_CONSTANT_COLOR, #BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR, #BLEND_FACTOR_CONSTANT_ALPHA, or #BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA, #CmdSetBlendConstants() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_DEPTH_BOUNDS dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code depthBoundsTestEnable} is #TRUE, then #CmdSetDepthBounds() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_STENCIL_COMPARE_MASK dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code stencilTestEnable} is #TRUE, then #CmdSetStencilCompareMask() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_STENCIL_WRITE_MASK dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code stencilTestEnable} is #TRUE, then #CmdSetStencilWriteMask() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_STENCIL_REFERENCE dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of and {@code rasterizerDiscardEnable} is #FALSE, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code stencilTestEnable} is #TRUE, then #CmdSetStencilReference() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the draw is recorded in a render pass instance with multiview enabled, the maximum instance index <b>must</b> be less than or equal to ##VkPhysicalDeviceMultiviewProperties{@code ::maxMultiviewInstanceIndex}</li>
            <li>If the bound graphics pipeline was created with ##VkPipelineSampleLocationsStateCreateInfoEXT{@code ::sampleLocationsEnable} set to #TRUE and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the #IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT bit set</li>
            <li>If the {@link EXTSampleLocations VK_EXT_sample_locations} extension is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, then #CmdSetSampleLocationsEnableEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTSampleLocations VK_EXT_sample_locations} extension is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code sampleLocationsEnable} is #TRUE, then #CmdSetSampleLocationsEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_CULL_MODE dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, then #CmdSetCullMode() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_FRONT_FACE dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, then #CmdSetFrontFace() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_DEPTH_TEST_ENABLE dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, #CmdSetDepthTestEnable() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_DEPTH_WRITE_ENABLE dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, then #CmdSetDepthWriteEnable() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_DEPTH_COMPARE_OP dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code depthTestEnable} is #TRUE, then #CmdSetDepthCompareOp() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-depthBounds">{@code depthBounds}</a> feature is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, then #CmdSetDepthBoundsTestEnable() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_STENCIL_TEST_ENABLE dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, then #CmdSetStencilTestEnable() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_STENCIL_OP dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code stencilTestEnable} is #TRUE, then #CmdSetStencilOp() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled, and the state is not inherited, then #CmdSetViewportWithCount() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_SCISSOR_WITH_COUNT dynamic state enabled, and the state is not inherited, then #CmdSetScissorWithCount() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing</li>
            <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with both the #DYNAMIC_STATE_SCISSOR_WITH_COUNT and #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic states enabled, and the state is not inherited, then the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> match the {@code scissorCount} parameter of {@code vkCmdSetScissorWithCount}</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled, but not the #DYNAMIC_STATE_VIEWPORT_W_SCALING_NV dynamic state enabled, then the bound graphics pipeline <b>must</b> have been created with ##VkPipelineViewportWScalingStateCreateInfoNV{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the {@link NVClipSpaceWScaling VK_NV_clip_space_w_scaling} extension is enabled, and a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT and #DYNAMIC_STATE_VIEWPORT_W_SCALING_NV dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code viewportWScalingEnable} is #TRUE, then #CmdSetViewportWScalingNV() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVClipSpaceWScaling VK_NV_clip_space_w_scaling} extension is enabled, and a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT and #DYNAMIC_STATE_VIEWPORT_W_SCALING_NV dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code viewportWScalingEnable} is #TRUE, then the {@code viewportCount} parameter in the last call to #CmdSetViewportWScalingNV() <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled, but not the #DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV dynamic state enabled, then the bound graphics pipeline <b>must</b> have been created with ##VkPipelineViewportShadingRateImageStateCreateInfoNV{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled, and a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_VIEWPORT_COARSE_SAMPLE_ORDER_NV and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, then #CmdSetCoarseSampleOrderNV() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled, and a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT and #DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code shadingRateImageEnable} is #TRUE, then #CmdSetViewportShadingRatePaletteNV() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled, and a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT and #DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code shadingRateImageEnable} is #TRUE, then the {@code viewportCount} parameter in the last call to #CmdSetViewportShadingRatePaletteNV() <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled and a ##VkPipelineViewportSwizzleStateCreateInfoNV structure chained from ##VkPipelineViewportStateCreateInfo, then the bound graphics pipeline <b>must</b> have been created with ##VkPipelineViewportSwizzleStateCreateInfoNV{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled and a ##VkPipelineViewportExclusiveScissorStateCreateInfoNV structure chained from ##VkPipelineViewportStateCreateInfo, then the bound graphics pipeline <b>must</b> have been created with ##VkPipelineViewportExclusiveScissorStateCreateInfoNV{@code ::exclusiveScissorCount} greater or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-exclusiveScissor">{@code exclusiveScissor}</a> feature is enabled, and a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV dynamic state enabled, then #CmdSetExclusiveScissorEnableNV() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-exclusiveScissor">{@code exclusiveScissor}</a> feature is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV dynamic state enabled, and the most recent call to #CmdSetExclusiveScissorEnableNV() in the current command buffer set any element of {@code pExclusiveScissorEnables} to #TRUE, then #CmdSetExclusiveScissorNV() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE dynamic state enabled, then #CmdSetRasterizerDiscardEnable() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_DEPTH_BIAS_ENABLE dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, then #CmdSetDepthBiasEnable() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_LOGIC_OP_EXT dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code logicOpEnable} is #TRUE, then #CmdSetLogicOpEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-primitiveFragmentShadingRateWithMultipleViewports">{@code primitiveFragmentShadingRateWithMultipleViewports}</a> limit is not supported, the bound graphics pipeline was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled, and any of the shader stages of the bound graphics pipeline write to the {@code PrimitiveShadingRateKHR} built-in, then #CmdSetViewportWithCount() <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> be 1</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-primitiveFragmentShadingRateWithMultipleViewports">{@code primitiveFragmentShadingRateWithMultipleViewports}</a> limit is not supported, and any shader object bound to a graphics stage writes to the {@code PrimitiveShadingRateKHR} built-in, then #CmdSetViewportWithCount() <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> be 1</li>
            <li>If rasterization is not disabled in the bound graphics pipeline, then for each color attachment in the subpass, if the corresponding image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> do not contain #FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT, then the {@code blendEnable} member of the corresponding element of the {@code pAttachments} member of {@code pColorBlendState} <b>must</b> be #FALSE</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then for each color attachment in the render pass, if the corresponding image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> do not contain #FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT, then the corresponding member of {@code pColorBlendEnables} in the most recent call to {@code vkCmdSetColorBlendEnableEXT} in the current command buffer that affected that attachment index <b>must</b> have been #FALSE</li>
            <li>
                If rasterization is not disabled in the bound graphics pipeline, and none of the following is enabled:
                <ul>
                    <li>the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} extension</li>
                    <li>the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension</li>
                    <li>the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature</li>
                </ul>

                then {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be the same as the current subpass color and/or depth/stencil attachments
            </li>
            <li>
                If a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and none of the following is enabled:
                <ul>
                    <li>the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} extension</li>
                    <li>the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension</li>
                    <li>the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature</li>
                </ul>

                then the most recent call to #CmdSetRasterizationSamplesEXT() in the current command buffer <b>must</b> have set {@code rasterizationSamples} to be the same as the number of samples for the current render pass color and/or depth/stencil attachments
            </li>
            <li>If a shader object is bound to any graphics stage, the current render pass instance <b>must</b> have been begun with #CmdBeginRendering()</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the {@code imageView} member of {@code pDepthAttachment} is not #NULL_HANDLE, and the {@code layout} member of {@code pDepthAttachment} is #IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL, this command <b>must</b> not write any values to the depth attachment</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the {@code imageView} member of {@code pStencilAttachment} is not #NULL_HANDLE, and the {@code layout} member of {@code pStencilAttachment} is #IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL, this command <b>must</b> not write any values to the stencil attachment</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the {@code imageView} member of {@code pDepthAttachment} is not #NULL_HANDLE, and the {@code layout} member of {@code pDepthAttachment} is #IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL, this command <b>must</b> not write any values to the depth attachment</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the {@code imageView} member of {@code pStencilAttachment} is not #NULL_HANDLE, and the {@code layout} member of {@code pStencilAttachment} is #IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL, this command <b>must</b> not write any values to the stencil attachment</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the {@code imageView} member of {@code pDepthAttachment} is not #NULL_HANDLE, and the {@code layout} member of {@code pDepthAttachment} is #IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL, this command <b>must</b> not write any values to the depth attachment</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the {@code imageView} member of {@code pStencilAttachment} is not #NULL_HANDLE, and the {@code layout} member of {@code pStencilAttachment} is #IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL, this command <b>must</b> not write any values to the stencil attachment</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the currently bound graphics pipeline <b>must</b> have been created with a ##VkPipelineRenderingCreateInfo{@code ::viewMask} equal to ##VkRenderingInfo{@code ::viewMask}</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled and the current render pass instance was begun with #CmdBeginRendering(), the currently bound graphics pipeline <b>must</b> have been created with a ##VkPipelineRenderingCreateInfo{@code ::colorAttachmentCount} equal to ##VkRenderingInfo{@code ::colorAttachmentCount}</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and the current render pass instance was begun with #CmdBeginRendering() and ##VkRenderingInfo{@code ::colorAttachmentCount} greater than 0, then each element of the ##VkRenderingInfo{@code ::pColorAttachments} array with an {@code imageView} not equal to #NULL_HANDLE <b>must</b> have been created with a {@code VkFormat} equal to the corresponding element of ##VkPipelineRenderingCreateInfo{@code ::pColorAttachmentFormats} used to create the currently bound graphics pipeline</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is not enabled, and the current render pass instance was begun with #CmdBeginRendering() and ##VkRenderingInfo{@code ::colorAttachmentCount} greater than 0, then each element of the ##VkRenderingInfo{@code ::pColorAttachments} array with an {@code imageView} equal to #NULL_HANDLE <b>must</b> have the corresponding element of ##VkPipelineRenderingCreateInfo{@code ::pColorAttachmentFormats} used to create the currently bound pipeline equal to #FORMAT_UNDEFINED</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRenderingUnusedAttachments">{@code dynamicRenderingUnusedAttachments}</a> feature is enabled, and the current render pass instance was begun with #CmdBeginRendering() and ##VkRenderingInfo{@code ::colorAttachmentCount} greater than 0, then each element of the ##VkRenderingInfo{@code ::pColorAttachments} array with an {@code imageView} not equal to #NULL_HANDLE <b>must</b> have been created with a {@code VkFormat} equal to the corresponding element of ##VkPipelineRenderingCreateInfo{@code ::pColorAttachmentFormats} used to create the currently bound graphics pipeline, or the corresponding element of ##VkPipelineRenderingCreateInfo{@code ::pColorAttachmentFormats}, if it exists, <b>must</b> be #FORMAT_UNDEFINED</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), with a ##VkRenderingInfo{@code ::colorAttachmentCount} equal to 1, there is no shader object bound to any graphics stage, and a color attachment with a resolve mode of #RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID, each element of the ##VkRenderingInfo{@code ::pColorAttachments} array with a {@code resolveImageView} not equal to #NULL_HANDLE <b>must</b> have been created with an image created with a ##VkExternalFormatANDROID{@code ::externalFormat} value equal to the ##VkExternalFormatANDROID{@code ::externalFormat} value used to create the currently bound graphics pipeline</li>
            <li>If there is no shader object bound to any graphics stage, the current render pass instance was begun with #CmdBeginRendering() and a ##VkRenderingInfo{@code ::colorAttachmentCount} equal to 1, and a color attachment with a resolve mode of #RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID, each element of the ##VkRenderingInfo{@code ::pColorAttachments} array with a {@code imageView} not equal to #NULL_HANDLE <b>must</b> have been created with an image created with a ##VkExternalFormatANDROID{@code ::externalFormat} value equal to the ##VkExternalFormatANDROID{@code ::externalFormat} value used to create the currently bound graphics pipeline</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), there is no shader object bound to any graphics stage, and the currently bound graphics pipeline was created with a non-zero ##VkExternalFormatANDROID{@code ::externalFormat} value and with the #DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT dynamic state enabled, then #CmdSetColorBlendEnableEXT() <b>must</b> have set the blend enable to #FALSE prior to this drawing command</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), there is no shader object bound to any graphics stage, and the currently bound graphics pipeline was created with a non-zero ##VkExternalFormatANDROID{@code ::externalFormat} value and with the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT dynamic state enabled, then #CmdSetRasterizationSamplesEXT() <b>must</b> have set {@code rasterizationSamples} to #SAMPLE_COUNT_1_BIT prior to this drawing command</li>
            <li>If there is a shader object bound to any graphics stage, and the current render pass includes a color attachment that uses the #RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID resolve mode, then #CmdSetColorBlendEnableEXT() <b>must</b> have set blend enable to #FALSE prior to this drawing command</li>
            <li>If there is a shader object bound to any graphics stage, and the current render pass includes a color attachment that uses the #RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID resolve mode, then #CmdSetRasterizationSamplesEXT() <b>must</b> have set {@code rasterizationSamples} to #SAMPLE_COUNT_1_BIT prior to this drawing command</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), there is no shader object bound to any graphics stage, and the currently bound graphics pipeline was created with a non-zero ##VkExternalFormatANDROID{@code ::externalFormat} value and with the #DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR dynamic state enabled, then #CmdSetFragmentShadingRateKHR() <b>must</b> have set {@code pFragmentSize→width} to 1 prior to this drawing command</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), there is no shader object bound to any graphics stage, and the currently bound graphics pipeline was created with a non-zero ##VkExternalFormatANDROID{@code ::externalFormat} value and with the #DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR dynamic state enabled, then #CmdSetFragmentShadingRateKHR() <b>must</b> have set {@code pFragmentSize→height} to 1 prior to this drawing command</li>
            <li>If there is a shader object bound to any graphics stage, and the current render pass includes a color attachment that uses the #RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID resolve mode, then #CmdSetFragmentShadingRateKHR() <b>must</b> have set {@code pFragmentSize→width} to 1 prior to this drawing command</li>
            <li>If there is a shader object bound to any graphics stage, and the current render pass includes a color attachment that uses the #RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID resolve mode, then #CmdSetFragmentShadingRateKHR() <b>must</b> have set {@code pFragmentSize→height} to 1 prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT dynamic state enabled then #CmdSetColorWriteEnableEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-colorWriteEnable">{@code colorWriteEnable}</a> feature is enabled on the device, and a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetColorWriteEnableEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT dynamic state enabled then the {@code attachmentCount} parameter of {@code vkCmdSetColorWriteEnableEXT} <b>must</b> be greater than or equal to the ##VkPipelineColorBlendStateCreateInfo{@code ::attachmentCount} of the currently bound graphics pipeline</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-colorWriteEnable">{@code colorWriteEnable}</a> feature is enabled on the device, and a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then the {@code attachmentCount} parameter of most recent call to {@code vkCmdSetColorWriteEnableEXT} in the current command buffer <b>must</b> be greater than or equal to the number of color attachments in the current render pass instance</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_DISCARD_RECTANGLE_EXT dynamic state enabled then #CmdSetDiscardRectangleEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command for each discard rectangle in ##VkPipelineDiscardRectangleStateCreateInfoEXT{@code ::discardRectangleCount}</li>
            <li>If the {@link EXTDiscardRectangles VK_EXT_discard_rectangles} extension is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_DISCARD_RECTANGLE_ENABLE_EXT dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, then #CmdSetDiscardRectangleEnableEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTDiscardRectangles VK_EXT_discard_rectangles} extension is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_DISCARD_RECTANGLE_MODE_EXT dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code discardRectangleEnable} is #TRUE, then #CmdSetDiscardRectangleModeEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTDiscardRectangles VK_EXT_discard_rectangles} extension is enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetDiscardRectangleEnableEXT() in the current command buffer set {@code discardRectangleEnable} to #TRUE, then #CmdSetDiscardRectangleEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
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
            <li>If the currently bound pipeline was created without a ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV structure, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is not enabled, and ##VkRenderingInfo{@code ::pDepthAttachment→imageView} was not #NULL_HANDLE, the value of {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create ##VkRenderingInfo{@code ::pDepthAttachment→imageView}</li>
            <li>If the currently bound pipeline was created without a ##VkAttachmentSampleCountInfoAMD or ##VkAttachmentSampleCountInfoNV structure, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is not enabled, and ##VkRenderingInfo{@code ::pStencilAttachment→imageView} was not #NULL_HANDLE, the value of {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create ##VkRenderingInfo{@code ::pStencilAttachment→imageView}</li>
            <li>If this command has been called inside a render pass instance started with #CmdBeginRendering(), and the {@code pNext} chain of ##VkRenderingInfo includes a ##VkMultisampledRenderToSingleSampledInfoEXT structure with {@code multisampledRenderToSingleSampledEnable} equal to #TRUE, then the value of {@code rasterizationSamples} for the currently bound graphics pipeline <b>must</b> be equal to ##VkMultisampledRenderToSingleSampledInfoEXT{@code ::rasterizationSamples}</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), the currently bound pipeline <b>must</b> have been created with a ##VkGraphicsPipelineCreateInfo{@code ::renderPass} equal to #NULL_HANDLE</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), there is a graphics pipeline bound with a fragment shader that statically writes to a color attachment, the color write mask is not zero, color writes are enabled, and the corresponding element of the ##VkRenderingInfo{@code ::pColorAttachments→imageView} was not #NULL_HANDLE, then the corresponding element of ##VkPipelineRenderingCreateInfo{@code ::pColorAttachmentFormats} used to create the pipeline <b>must</b> not be #FORMAT_UNDEFINED</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), there is a graphics pipeline bound, depth test is enabled, depth write is enabled, and the ##VkRenderingInfo{@code ::pDepthAttachment→imageView} was not #NULL_HANDLE, then the ##VkPipelineRenderingCreateInfo{@code ::depthAttachmentFormat} used to create the pipeline <b>must</b> not be #FORMAT_UNDEFINED</li>
            <li>If the current render pass instance was begun with #CmdBeginRendering(), there is a graphics pipeline bound, stencil test is enabled and the ##VkRenderingInfo{@code ::pStencilAttachment→imageView} was not #NULL_HANDLE, then the ##VkPipelineRenderingCreateInfo{@code ::stencilAttachmentFormat} used to create the pipeline <b>must</b> not be #FORMAT_UNDEFINED</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-primitivesGeneratedQueryWithRasterizerDiscard">{@code primitivesGeneratedQueryWithRasterizerDiscard}</a> feature is not enabled and the #QUERY_TYPE_PRIMITIVES_GENERATED_EXT query is active, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#primsrast-discard">rasterization discard</a> <b>must</b> not be enabled</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-primitivesGeneratedQueryWithNonZeroStreams">{@code primitivesGeneratedQueryWithNonZeroStreams}</a> feature is not enabled and the #QUERY_TYPE_PRIMITIVES_GENERATED_EXT query is active, the bound graphics pipeline <b>must</b> not have been created with a non-zero value in ##VkPipelineRasterizationStateStreamCreateInfoEXT{@code ::rasterizationStream}</li>
            <li>If a shader object is bound to the #SHADER_STAGE_TESSELLATION_EVALUATION_BIT stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_TESSELLATION_DOMAIN_ORIGIN_EXT dynamic state enabled, then #CmdSetTessellationDomainOriginEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-depthClamp">{@code depthClamp}</a> feature is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_DEPTH_CLAMP_ENABLE_EXT dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, then #CmdSetDepthClampEnableEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_POLYGON_MODE_EXT dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, then #CmdSetPolygonModeEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, then #CmdSetRasterizationSamplesEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_SAMPLE_MASK_EXT dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, then #CmdSetSampleMaskEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT dynamic state enabled, and {@code alphaToCoverageEnable} was #TRUE in the last call to #CmdSetAlphaToCoverageEnableEXT(), then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#interfaces-fragmentoutput">Fragment Output Interface</a> <b>must</b> contain a variable for the alpha {@code Component} word in {@code Location} 0 at {@code Index} 0</li>
            <li>If a shader object is bound to any graphics stage, and the most recent call to #CmdSetAlphaToCoverageEnableEXT() in the current command buffer set {@code alphaToCoverageEnable} to #TRUE, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#interfaces-fragmentoutput">Fragment Output Interface</a> <b>must</b> contain a variable for the alpha {@code Component} word in {@code Location} 0 at {@code Index} 0</li>
            <li>If a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, then #CmdSetAlphaToCoverageEnableEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-alphaToOne">{@code alphaToOne}</a> feature is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_ALPHA_TO_ONE_ENABLE_EXT dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, then #CmdSetAlphaToOneEnableEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-logicOp">{@code logicOp}</a> feature is enabled, a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_LOGIC_OP_ENABLE_EXT dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, then #CmdSetLogicOpEnableEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT dynamic state enabled then #CmdSetColorBlendEnableEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and both the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE and there are color attachments bound, then #CmdSetColorBlendEnableEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT dynamic state enabled then #CmdSetColorBlendEquationEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetColorBlendEnableEXT() for any attachment set that attachment’s value in {@code pColorBlendEnables} to #TRUE, then #CmdSetColorBlendEquationEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_WRITE_MASK_EXT dynamic state enabled then #CmdSetColorWriteMaskEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and both the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE and there are color attachments bound, then #CmdSetColorWriteMaskEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-geometryStreams">{@code geometryStreams}</a> feature is enabled, and a shader object is bound to the #SHADER_STAGE_GEOMETRY_BIT stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_RASTERIZATION_STREAM_EXT dynamic state enabled, then #CmdSetRasterizationStreamEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTConservativeRasterization VK_EXT_conservative_rasterization} extension is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, then #CmdSetConservativeRasterizationModeEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTConservativeRasterization VK_EXT_conservative_rasterization} extension is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code conservativeRasterizationMode} is #CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT, then #CmdSetExtraPrimitiveOverestimationSizeEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-depthClipEnable">{@code depthClipEnable}</a> feature is enabled, and a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT dynamic state, then #CmdSetDepthClipEnableEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT dynamic state enabled then #CmdSetColorBlendAdvancedEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTBlendOperationAdvanced VK_EXT_blend_operation_advanced} extension is enabled, and a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then at least one of #CmdSetColorBlendEquationEXT() and #CmdSetColorBlendAdvancedEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the {@link EXTProvokingVertex VK_EXT_provoking_vertex} extension is enabled, a shader object is bound to the #SHADER_STAGE_VERTEX_BIT stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_PROVOKING_VERTEX_MODE_EXT dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, then #CmdSetProvokingVertexModeEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT dynamic state enabled then #CmdSetLineRasterizationModeEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If any of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledRectangularLines">{@code stippledRectangularLines}</a>, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledBresenhamLines">{@code stippledBresenhamLines}</a> or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledSmoothLines">{@code stippledSmoothLines}</a> features are enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetPolygonModeEXT() in the current command buffer set {@code polygonMode} to #POLYGON_MODE_LINE, then #CmdSetLineRasterizationModeEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If any of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledRectangularLines">{@code stippledRectangularLines}</a>, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledBresenhamLines">{@code stippledBresenhamLines}</a> or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledSmoothLines">{@code stippledSmoothLines}</a> features are enabled, and a shader object is bound to the #SHADER_STAGE_VERTEX_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetPrimitiveTopology() in the current command buffer set {@code primitiveTopology} to any line topology, then #CmdSetLineRasterizationModeEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If any of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledRectangularLines">{@code stippledRectangularLines}</a>, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledBresenhamLines">{@code stippledBresenhamLines}</a> or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledSmoothLines">{@code stippledSmoothLines}</a> features are enabled, and a shader object that outputs line primitives is bound to the #SHADER_STAGE_TESSELLATION_EVALUATION_BIT or #SHADER_STAGE_GEOMETRY_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetLineRasterizationModeEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT dynamic state enabled then #CmdSetLineStippleEnableEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If any of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledRectangularLines">{@code stippledRectangularLines}</a>, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledBresenhamLines">{@code stippledBresenhamLines}</a> or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledSmoothLines">{@code stippledSmoothLines}</a> features are enabled, and a shader object is bound to any graphics stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetPolygonModeEXT() in the current command buffer set {@code polygonMode} to #POLYGON_MODE_LINE, then #CmdSetLineStippleEnableEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If any of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledRectangularLines">{@code stippledRectangularLines}</a>, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledBresenhamLines">{@code stippledBresenhamLines}</a> or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledSmoothLines">{@code stippledSmoothLines}</a> features are enabled, and a shader object is bound to the #SHADER_STAGE_VERTEX_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the most recent call to #CmdSetPrimitiveTopology() in the current command buffer set {@code primitiveTopology} to any line topology, then #CmdSetLineStippleEnableEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If any of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledRectangularLines">{@code stippledRectangularLines}</a>, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledBresenhamLines">{@code stippledBresenhamLines}</a> or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledSmoothLines">{@code stippledSmoothLines}</a> features are enabled, and a shader object that outputs line primitives is bound to the #SHADER_STAGE_TESSELLATION_EVALUATION_BIT or #SHADER_STAGE_GEOMETRY_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetLineStippleEnableEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If any of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledRectangularLines">{@code stippledRectangularLines}</a>, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledBresenhamLines">{@code stippledBresenhamLines}</a> or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledSmoothLines">{@code stippledSmoothLines}</a> features are enabled and a shader object is bound to any graphics stage, or a bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_STIPPLE_KHR dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code stippledLineEnable} is #TRUE, then #CmdSetLineStippleKHR() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-depthClipControl">{@code depthClipControl}</a> feature is enabled, and a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT dynamic state enabled, then #CmdSetDepthClipNegativeOneToOneEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-depthClampControl">{@code depthClampControl}</a> feature is enabled, and a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_DEPTH_CLAMP_RANGE_EXT dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code depthClampEnable} is #TRUE, then #CmdSetDepthClampRangeEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVClipSpaceWScaling VK_NV_clip_space_w_scaling} extension is enabled, and a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_VIEWPORT_W_SCALING_ENABLE_NV dynamic state enabled, then #CmdSetViewportWScalingEnableNV() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVViewportSwizzle VK_NV_viewport_swizzle} extension is enabled, and a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV dynamic state enabled, then #CmdSetViewportSwizzleNV() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVFragmentCoverageToColor VK_NV_fragment_coverage_to_color} extension is enabled, a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, then #CmdSetCoverageToColorEnableNV() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVFragmentCoverageToColor VK_NV_fragment_coverage_to_color} extension is enabled, a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_COVERAGE_TO_COLOR_LOCATION_NV dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code coverageToColorEnable} is #TRUE, then #CmdSetCoverageToColorLocationNV() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_COVERAGE_MODULATION_MODE_NV dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, then #CmdSetCoverageModulationModeNV() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code coverageModulationMode} is any value other than #COVERAGE_MODULATION_MODE_NONE_NV, then #CmdSetCoverageModulationTableEnableNV() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_NV dynamic state enabled, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code coverageModulationTableEnable} is #TRUE, then #CmdSetCoverageModulationTableNV() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shadingRateImage">{@code shadingRateImage}</a> feature is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_SHADING_RATE_IMAGE_ENABLE_NV dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, then #CmdSetShadingRateImageEnableNV() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-pipelineFragmentShadingRate">{@code pipelineFragmentShadingRate}</a> feature is enabled, a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, then #CmdSetFragmentShadingRateKHR() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-representativeFragmentTest">{@code representativeFragmentTest}</a> feature is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, then #CmdSetRepresentativeFragmentTestEnableNV() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-coverageReductionMode">{@code coverageReductionMode}</a> feature is enabled, a shader object is bound to any graphics stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_COVERAGE_REDUCTION_MODE_NV dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, then #CmdSetCoverageReductionModeNV() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT state enabled and the last call to #CmdSetColorBlendEnableEXT() set {@code pColorBlendEnables} for any attachment to #TRUE, then for those attachments in the subpass the corresponding image view’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#resources-image-view-format-features">format features</a> <b>must</b> contain #FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, and the current subpass does not use any color and/or depth/stencil attachments, then the {@code rasterizationSamples} in the last call to #CmdSetRasterizationSamplesEXT() <b>must</b> follow the rules for a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#renderpass-noattachments">zero-attachment subpass</a></li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_MASK_EXT state enabled and the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state disabled, then the {@code samples} parameter in the last call to #CmdSetSampleMaskEXT() <b>must</b> be greater or equal to the ##VkPipelineMultisampleStateCreateInfo{@code ::rasterizationSamples} parameter used to create the bound graphics pipeline</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_MASK_EXT state and #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT states enabled, then the {@code samples} parameter in the last call to #CmdSetSampleMaskEXT() <b>must</b> be greater or equal to the {@code rasterizationSamples} parameter in the last call to #CmdSetRasterizationSamplesEXT()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multisampledRenderToSingleSampled">{@code multisampledRenderToSingleSampled}</a> feature is not enabled, and neither the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} nor the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extensions are enabled, then the {@code rasterizationSamples} in the last call to #CmdSetRasterizationSamplesEXT() <b>must</b> be the same as the current subpass color and/or depth/stencil attachments</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, or a shader object is bound to any graphics stage, and the current render pass instance includes a ##VkMultisampledRenderToSingleSampledInfoEXT structure with {@code multisampledRenderToSingleSampledEnable} equal to #TRUE, then the {@code rasterizationSamples} in the last call to #CmdSetRasterizationSamplesEXT() <b>must</b> be the same as the {@code rasterizationSamples} member of that structure</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT dynamic state enabled then #CmdSetColorBlendEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorBlendEnableEXT} calls <b>must</b> specify an enable for all active color attachments in the current subpass</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetColorBlendEnableEXT() <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorBlendEnableEXT} calls <b>must</b> specify an enable for all active color attachments in the current subpass</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT dynamic state enabled then #CmdSetColorBlendEquationEXT() <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorBlendEquationEXT} calls <b>must</b> specify the blend equations for all active color attachments in the current subpass where blending is enabled</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and both the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE and there are color attachments bound, then #CmdSetColorBlendEquationEXT() <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorBlendEquationEXT} calls <b>must</b> specify the blend equations for all active color attachments in the current subpass where blending is enabled</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_WRITE_MASK_EXT dynamic state enabled then #CmdSetColorWriteMaskEXT() <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorWriteMaskEXT} calls <b>must</b> specify the color write mask for all active color attachments in the current subpass</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, then #CmdSetColorWriteMaskEXT() <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorWriteMaskEXT} calls <b>must</b> specify the color write mask for all active color attachments in the current subpass</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT dynamic state enabled then #CmdSetColorBlendAdvancedEXT() <b>must</b> have been called in the current command buffer prior to this drawing command, and the attachments specified by the {@code firstAttachment} and {@code attachmentCount} parameters of {@code vkCmdSetColorBlendAdvancedEXT} calls <b>must</b> specify the advanced blend equations for all active color attachments in the current subpass where blending is enabled</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT and #DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT dynamic states enabled and the last calls to #CmdSetColorBlendEnableEXT() and #CmdSetColorBlendAdvancedEXT() have enabled advanced blending, then the number of active color attachments in the current subpass <b>must</b> not exceed <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-advancedBlendMaxColorAttachments">{@code advancedBlendMaxColorAttachments}</a></li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-primitivesGeneratedQueryWithNonZeroStreams">{@code primitivesGeneratedQueryWithNonZeroStreams}</a> feature is not enabled and the #QUERY_TYPE_PRIMITIVES_GENERATED_EXT query is active, and the bound graphics pipeline was created with #DYNAMIC_STATE_RASTERIZATION_STREAM_EXT state enabled, the last call to #CmdSetRasterizationStreamEXT() <b>must</b> have set the {@code rasterizationStream} to zero</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state enabled and the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state disabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code sampleLocationsEnable} is #TRUE, then the {@code sampleLocationsPerPixel} member of {@code pSampleLocationsInfo} in the last call to #CmdSetSampleLocationsEXT() <b>must</b> equal the {@code rasterizationSamples} member of the ##VkPipelineMultisampleStateCreateInfo structure the bound graphics pipeline has been created with</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state enabled and the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code sampleLocationsEnable} is #TRUE, then the {@code sampleLocationsPerPixel} member of {@code pSampleLocationsInfo} in the last call to #CmdSetSampleLocationsEXT() <b>must</b> equal the {@code rasterizationSamples} parameter of the last call to #CmdSetRasterizationSamplesEXT()</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, or the bound graphics pipeline was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT state enabled, and {@code sampleLocationsEnable} was #TRUE in the last call to #CmdSetSampleLocationsEnableEXT(), and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the #IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT bit set</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, or the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state enabled and the #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT state enabled, and if {@code sampleLocationsEnable} was #TRUE in the last call to #CmdSetSampleLocationsEnableEXT(), then the {@code sampleLocationsInfo.sampleLocationGridSize.width} in the last call to #CmdSetSampleLocationsEXT() <b>must</b> evenly divide ##VkMultisamplePropertiesEXT{@code ::sampleLocationGridSize.width} as returned by #GetPhysicalDeviceMultisamplePropertiesEXT() with a {@code samples} parameter equaling {@code rasterizationSamples}</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, or the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state enabled and the #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT state enabled, and if {@code sampleLocationsEnable} was #TRUE in the last call to #CmdSetSampleLocationsEnableEXT(), then the {@code sampleLocationsInfo.sampleLocationGridSize.height} in the last call to #CmdSetSampleLocationsEXT() <b>must</b> evenly divide ##VkMultisamplePropertiesEXT{@code ::sampleLocationGridSize.height} as returned by #GetPhysicalDeviceMultisamplePropertiesEXT() with a {@code samples} parameter equaling {@code rasterizationSamples}</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, or the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT state enabled, and if {@code sampleLocationsEnable} was #TRUE in the last call to #CmdSetSampleLocationsEnableEXT(), the fragment shader code <b>must</b> not statically use the extended instruction {@code InterpolateAtSample}</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state disabled and the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code sampleLocationsEnable} is #TRUE, then {@code sampleLocationsInfo.sampleLocationGridSize.width} <b>must</b> evenly divide ##VkMultisamplePropertiesEXT{@code ::sampleLocationGridSize.width} as returned by #GetPhysicalDeviceMultisamplePropertiesEXT() with a {@code samples} parameter equaling the value of {@code rasterizationSamples} in the last call to #CmdSetRasterizationSamplesEXT()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state disabled and the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code sampleLocationsEnable} is #TRUE, then {@code sampleLocationsInfo.sampleLocationGridSize.height} <b>must</b> evenly divide ##VkMultisamplePropertiesEXT{@code ::sampleLocationGridSize.height} as returned by #GetPhysicalDeviceMultisamplePropertiesEXT() with a {@code samples} parameter equaling the value of {@code rasterizationSamples} in the last call to #CmdSetRasterizationSamplesEXT()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT state disabled and the #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code sampleLocationsEnable} is #TRUE, then {@code sampleLocationsInfo.sampleLocationsPerPixel} <b>must</b> equal {@code rasterizationSamples} in the last call to #CmdSetRasterizationSamplesEXT()</li>
            <li>If a shader object is bound to any graphics stage or the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV state enabled, and the last call to #CmdSetCoverageModulationTableEnableNV() set {@code coverageModulationTableEnable} to #TRUE, then the {@code coverageModulationTableCount} parameter in the last call to #CmdSetCoverageModulationTableNV() <b>must</b> equal the current {@code rasterizationSamples} divided by the number of color samples in the current subpass</li>
            <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and if current subpass has a depth/stencil attachment and depth test, stencil test, or depth bounds test are enabled in the currently bound pipeline state, then the current {@code rasterizationSamples} <b>must</b> be the same as the sample count of the depth/stencil attachment</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV state enabled and the last call to #CmdSetCoverageToColorEnableNV() set the {@code coverageToColorEnable} to #TRUE, then the current subpass <b>must</b> have a color attachment at the location selected by the last call to #CmdSetCoverageToColorLocationNV() {@code coverageToColorLocation}, with a {@code VkFormat} of #FORMAT_R8_UINT, #FORMAT_R8_SINT, #FORMAT_R16_UINT, #FORMAT_R16_SINT, #FORMAT_R32_UINT, or #FORMAT_R32_SINT</li>
            <li>If the {@link NVFragmentCoverageToColor VK_NV_fragment_coverage_to_color} extension is enabled, and a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage, and the most recent call to #CmdSetRasterizerDiscardEnable() in the current command buffer set {@code rasterizerDiscardEnable} to #FALSE, and the last call to #CmdSetCoverageToColorEnableNV() set the {@code coverageToColorEnable} to #TRUE, then the current subpass <b>must</b> have a color attachment at the location selected by the last call to #CmdSetCoverageToColorLocationNV() {@code coverageToColorLocation}, with a {@code VkFormat} of #FORMAT_R8_UINT, #FORMAT_R8_SINT, #FORMAT_R16_UINT, #FORMAT_R16_SINT, #FORMAT_R32_UINT, or #FORMAT_R32_SINT</li>
            <li>If this {@link NVCoverageReductionMode VK_NV_coverage_reduction_mode} extension is enabled, the bound graphics pipeline state was created with the #DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV and #DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT states enabled, the current coverage reduction mode {@code coverageReductionMode}, then the current {@code rasterizationSamples}, and the sample counts for the color and depth/stencil attachments (if the subpass has them) <b>must</b> be a valid combination returned by #GetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT dynamic state enabled, but not the #DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV dynamic state enabled, then the bound graphics pipeline <b>must</b> have been created with ##VkPipelineViewportSwizzleStateCreateInfoNV{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_VIEWPORT_WITH_COUNT and #DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV dynamic states enabled then the {@code viewportCount} parameter in the last call to #CmdSetViewportSwizzleNV() <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the {@link NVViewportSwizzle VK_NV_viewport_swizzle} extension is enabled, and a shader object is bound to any graphics stage, then the {@code viewportCount} parameter in the last call to #CmdSetViewportSwizzleNV() <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to #CmdSetViewportWithCount()</li>
            <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, and if the current subpass has any color attachments and {@code rasterizationSamples} of the last call to #CmdSetRasterizationSamplesEXT() is greater than the number of color samples, then the pipeline {@code sampleShadingEnable} <b>must</b> be #FALSE</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT or #DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT dynamic states enabled, and if the current {@code stippledLineEnable} state is #TRUE and the current {@code lineRasterizationMode} state is #LINE_RASTERIZATION_MODE_RECTANGULAR_KHR, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledRectangularLines">{@code stippledRectangularLines}</a> feature <b>must</b> be enabled</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT or #DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT dynamic states enabled, and if the current {@code stippledLineEnable} state is #TRUE and the current {@code lineRasterizationMode} state is #LINE_RASTERIZATION_MODE_BRESENHAM_KHR, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledBresenhamLines">{@code stippledBresenhamLines}</a> feature <b>must</b> be enabled</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT or #DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT dynamic states enabled, and if the current {@code stippledLineEnable} state is #TRUE and the current {@code lineRasterizationMode} state is #LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_KHR, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledSmoothLines">{@code stippledSmoothLines}</a> feature <b>must</b> be enabled</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT or #DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT dynamic states enabled, and if the current {@code stippledLineEnable} state is #TRUE and the current {@code lineRasterizationMode} state is #LINE_RASTERIZATION_MODE_DEFAULT_KHR, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-stippledRectangularLines">{@code stippledRectangularLines}</a> feature <b>must</b> be enabled and ##VkPhysicalDeviceLimits{@code ::strictLines} <b>must</b> be #TRUE</li>
            <li>If the bound graphics pipeline state was created with the #DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT dynamic state enabled, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-conservativePointAndLineRasterization">{@code conservativePointAndLineRasterization}</a> is not supported, and the effective primitive topology output by the last pre-rasterization shader stage is a line or point, then the {@code conservativeRasterizationMode} set by the last call to #CmdSetConservativeRasterizationModeEXT() <b>must</b> be #CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT</li>
            <li>If the currently bound pipeline was created with the ##VkPipelineShaderStageCreateInfo{@code ::stage} member of an element of ##VkGraphicsPipelineCreateInfo{@code ::pStages} set to #SHADER_STAGE_VERTEX_BIT, #SHADER_STAGE_TESSELLATION_CONTROL_BIT, #SHADER_STAGE_TESSELLATION_EVALUATION_BIT or #SHADER_STAGE_GEOMETRY_BIT, then <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#queries-mesh-shader">Mesh Shader Queries</a> <b>must</b> not be active</li>
            <li>If a shader object is bound to the #SHADER_STAGE_FRAGMENT_BIT stage or a graphics pipeline is bound which was created with the #DYNAMIC_STATE_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT dynamic state enabled, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-current-value">current value</a> of {@code rasterizerDiscardEnable} is #FALSE, then #CmdSetAttachmentFeedbackLoopEnableEXT() <b>must</b> have been called and not subsequently <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dynamic-state-lifetime">invalidated</a> in the current command buffer prior to this drawing command</li>
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
            <li>If the current render pass instance was begun with #CmdBeginRendering() and a ##VkRenderingInfo{@code ::colorAttachmentCount} equal to 1, a color attachment with a resolve mode of #RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID, and a fragment shader is bound, it <b>must</b> not declare the {@code DepthReplacing} or {@code StencilRefReplacingEXT} execution modes</li>
            <li>If the bound graphics pipeline state includes a fragment shader stage, was created with #DYNAMIC_STATE_DEPTH_WRITE_ENABLE set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}, and the fragment shader declares the {@code EarlyFragmentTests} execution mode and uses {@code OpDepthAttachmentReadEXT}, the {@code depthWriteEnable} parameter in the last call to #CmdSetDepthWriteEnable() <b>must</b> be #FALSE</li>
            <li>If the bound graphics pipeline state includes a fragment shader stage, was created with #DYNAMIC_STATE_STENCIL_WRITE_MASK set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}, and the fragment shader declares the {@code EarlyFragmentTests} execution mode and uses {@code OpStencilAttachmentReadEXT}, the {@code writeMask} parameter in the last call to #CmdSetStencilWriteMask() <b>must</b> be 0</li>
            <li>If a shader object is bound to any graphics stage or the currently bound graphics pipeline was created with #DYNAMIC_STATE_COLOR_WRITE_MASK_EXT, and the format of any color attachment is #FORMAT_E5B9G9R9_UFLOAT_PACK32, the corresponding element of the {@code pColorWriteMasks} parameter of #CmdSetColorWriteMaskEXT() <b>must</b> either include all of #COLOR_COMPONENT_R_BIT, #COLOR_COMPONENT_G_BIT, and #COLOR_COMPONENT_B_BIT, or none of them</li>
            <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#framebuffer-blending">blending</a> is enabled for any attachment where either the source or destination blend factors for that attachment <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#framebuffer-dsb">use the secondary color input</a>, the maximum value of {@code Location} for any output attachment <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-staticuse">statically used</a> in the {@code Fragment} {@code Execution} {@code Model} executed by this command <b>must</b> be less than <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-maxFragmentDualSrcAttachments">{@code maxFragmentDualSrcAttachments}</a></li>
            <li>If the current render pass was begun with #CmdBeginRendering(), and there is no shader object bound to any graphics stage, the value of each element of ##VkRenderingAttachmentLocationInfoKHR{@code ::pColorAttachmentLocations} set by #CmdSetRenderingAttachmentLocationsKHR() <b>must</b> match the value set for the corresponding element in the currently bound pipeline</li>
            <li>If the current render pass was begun with #CmdBeginRendering(), and there is no shader object bound to any graphics stage, input attachment index mappings in the currently bound pipeline <b>must</b> match those set for the current render pass instance via ##VkRenderingInputAttachmentIndexInfoKHR</li>
            <li>If the current render pass was begun with #CmdBeginRendering() with the #RENDERING_ENABLE_LEGACY_DITHERING_BIT_EXT flag, the bound graphics pipeline <b>must</b> have been created with #PIPELINE_CREATE_2_ENABLE_LEGACY_DITHERING_BIT_EXT</li>
            <li>If the bound graphics pipeline was created with #PIPELINE_CREATE_2_ENABLE_LEGACY_DITHERING_BIT_EXT, the current render pass <b>must</b> have begun with #CmdBeginRendering() with the #RENDERING_ENABLE_LEGACY_DITHERING_BIT_EXT flag</li>
        </ul>

        <ul>
            <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
            <li>If {@code isPreprocessed} is #TRUE and #GetGeneratedCommandsMemoryRequirementsEXT() did not return a required size of zero then #CmdPreprocessGeneratedCommandsEXT() <b>must</b> have already been executed on the device before this command executes, and the preprocessing command <b>must</b> have used the same {@code pGeneratedCommandsInfo} content as well as the content of the input buffers it references (all except ##VkGeneratedCommandsInfoEXT{@code ::preprocessBuffer})</li>
            <li>If {@code isPreprocessed} is #TRUE then the {@code indirectCommandsLayout} member of {@code pGeneratedCommandsInfo} <b>must</b> have been created with the #INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_EXT bit set</li>
            <li>If the {@code indirectCommandsLayout} member of {@code pGeneratedCommandsInfo} was created with the #INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_EXT bit set, then {@code isPreprocessed} <b>must</b> be #TRUE</li>
            <li>The contents of the {@code preprocessAddress} member of {@code pGeneratedCommandsInfo} <b>must</b> not have been previously used to record another #CmdExecuteGeneratedCommandsEXT()</li>
            <li>If {@code isPreprocessed} is #TRUE then the bound descriptor sets and push constants <b>must</b> match identically with those bound during recording of the corresponding call to #CmdPreprocessGeneratedCommandsEXT()</li>
            <li>If {@code isPreprocessed} is #TRUE then the conditional render state and its predicate value <b>must</b> match identically with the state and value set during execution of the corresponding call to #CmdPreprocessGeneratedCommandsEXT()</li>
            <li>If {@code isPreprocessed} is #TRUE and the {@code indirectCommandsLayout} member of {@code pGeneratedCommandsInfo} contains a draw token, then the graphics state bound on {@code commandBuffer} <b>must</b> match identically with the graphics state bound on the {@code stateCommandBuffer} passed to #CmdPreprocessGeneratedCommandsEXT()</li>
            <li>If {@code isPreprocessed} is #TRUE, then the queue family index of {@code commandBuffer} <b>must</b> be the same as the queue family index used to allocate the {@code stateCommandBuffer} passed to #CmdPreprocessGeneratedCommandsEXT()</li>
            <li>If {@code isPreprocessed} is #TRUE and the {@code indirectCommandsLayout} member of {@code pGeneratedCommandsInfo} contains a dispatch token, then the compute state bound on {@code commandBuffer} <b>must</b> match identically with the compute state bound on the {@code stateCommandBuffer} passed to #CmdPreprocessGeneratedCommandsEXT()</li>
            <li>If {@code isPreprocessed} is #TRUE and the {@code indirectCommandsLayout} member of {@code pGeneratedCommandsInfo} contains a ray tracing token, then the ray tracing state bound on {@code commandBuffer} <b>must</b> match identically with the ray tracing state bound on the {@code stateCommandBuffer} passed to #CmdPreprocessGeneratedCommandsEXT()</li>
            <li>If {@code isPreprocessed} is #TRUE and the {@code indirectCommandsLayout} member of {@code pGeneratedCommandsInfo} contains a ray tracing token, the queue family index {@code commandBuffer} was allocated from <b>must</b> be the same queue family index used to allocate the {@code stateCommandBuffer} passed to #CmdPreprocessGeneratedCommandsEXT()</li>
            <li>If the token sequence of the passed ##VkGeneratedCommandsInfoEXT{@code ::indirectCommandsLayout} contains a #INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT token, the initial shader state of ##VkGeneratedCommandsInfoEXT{@code ::indirectExecutionSet} <b>must</b> be bound on {@code commandBuffer}</li>
            <li>If {@code indirectCommandsLayout} was created with a token sequence that contained the #INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT token and {@code indirectExecutionSet} was created using #INDIRECT_EXECUTION_SET_INFO_TYPE_SHADER_OBJECTS_EXT, every executed #INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT token <b>must</b> bind all the shader stages set in the ##VkIndirectCommandsExecutionSetTokenEXT{@code ::shaderStages} used to create {@code indirectCommandsLayout}</li>
            <li>If {@code isPreprocessed} is #TRUE and the token sequence of the passed ##VkGeneratedCommandsInfoEXT{@code ::indirectCommandsLayout} contains a #INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT token, the members of ##VkGeneratedCommandsInfoEXT{@code ::indirectExecutionSet} accessed by this command <b>must</b> not have been modified since the preprocess buffer was generated</li>
            <li>If the {@code indirectCommandsLayout} member of {@code pGeneratedCommandsInfo} contains a draw token, then the active render pass <b>must</b> not have a specified fragment density map</li>
            <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-deviceGeneratedCommandsTransformFeedback">{@code deviceGeneratedCommandsTransformFeedback}</a> is not supported on device, transform feedback <b>must</b> not be active</li>
            <li>If transform feedback is active, ##VkGeneratedCommandsInfoEXT{@code ::indirectExecutionSet} <b>must</b> be #NULL_HANDLE</li>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-deviceGeneratedCommands">##VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT{@code ::deviceGeneratedCommands}</a> feature <b>must</b> be enabled</li>
            <li>The currently bound shader stages <b>must</b> be supported by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-supportedIndirectCommandsShaderStages">##VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT{@code ::supportedIndirectCommandsShaderStages}</a></li>
            <li>Only stages specified in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-supportedIndirectCommandsShaderStages">##VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT{@code ::supportedIndirectCommandsShaderStages}</a> <b>can</b> be set in {@code pGeneratedCommandsInfo→shaderStages}</li>
            <li>If a rendering pass is currently active, the view mask <b>must</b> be 0</li>
            <li>{@code commandBuffer} <b>must</b> not have been created with #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pGeneratedCommandsInfo} <b>must</b> be a valid pointer to a valid ##VkGeneratedCommandsInfoEXT structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
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
            <tbody><tr><td>Primary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>Action Indirection</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkGeneratedCommandsInfoEXT
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        VkBool32("isPreprocessed", "represents whether the input data has already been preprocessed on the device. If it is #FALSE this command will implicitly trigger the preprocessing step, otherwise not."),
        VkGeneratedCommandsInfoEXT.const.p("pGeneratedCommandsInfo", "a pointer to a ##VkGeneratedCommandsInfoEXT structure containing parameters affecting the generation of commands.")
    )

    VkResult(
        "CreateIndirectCommandsLayoutEXT",
        """
        Create an indirect command layout object.

        <h5>C Specification</h5>
        Indirect command layouts for {@link EXTDeviceGeneratedCommands VK_EXT_device_generated_commands} are created by:

        <pre><code>
￿VkResult vkCreateIndirectCommandsLayoutEXT(
￿    VkDevice                                    device,
￿    const VkIndirectCommandsLayoutCreateInfoEXT* pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkIndirectCommandsLayoutEXT*                pIndirectCommandsLayout);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-deviceGeneratedCommands">##VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT{@code ::deviceGeneratedCommands}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkIndirectCommandsLayoutCreateInfoEXT structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pIndirectCommandsLayout} <b>must</b> be a valid pointer to a {@code VkIndirectCommandsLayoutEXT} handle</li>
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
        ##VkAllocationCallbacks, ##VkIndirectCommandsLayoutCreateInfoEXT
        """,

        VkDevice("device", "the logical device that creates the indirect command layout."),
        VkIndirectCommandsLayoutCreateInfoEXT.const.p("pCreateInfo", "a pointer to a ##VkIndirectCommandsLayoutCreateInfoEXT structure containing parameters affecting creation of the indirect command layout."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkIndirectCommandsLayoutEXT.p("pIndirectCommandsLayout", "a pointer to a {@code VkIndirectCommandsLayoutEXT} handle in which the resulting indirect command layout is returned.")
    )

    void(
        "DestroyIndirectCommandsLayoutEXT",
        """
        Destroy an indirect commands layout.

        <h5>C Specification</h5>
        Indirect command layouts for {@link EXTDeviceGeneratedCommands VK_EXT_device_generated_commands} are destroyed by:

        <pre><code>
￿void vkDestroyIndirectCommandsLayoutEXT(
￿    VkDevice                                    device,
￿    VkIndirectCommandsLayoutEXT                 indirectCommandsLayout,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code indirectCommandsLayout} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code indirectCommandsLayout} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code indirectCommandsLayout} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code indirectCommandsLayout} is not #NULL_HANDLE, {@code indirectCommandsLayout} <b>must</b> be a valid {@code VkIndirectCommandsLayoutEXT} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code indirectCommandsLayout} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code indirectCommandsLayout} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the layout."),
        VkIndirectCommandsLayoutEXT("indirectCommandsLayout", "the layout to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "CreateIndirectExecutionSetEXT",
        """
        Create an indirect execution set.

        <h5>C Specification</h5>
        Indirect Execution Sets are created by calling:

        <pre><code>
￿VkResult vkCreateIndirectExecutionSetEXT(
￿    VkDevice                                    device,
￿    const VkIndirectExecutionSetCreateInfoEXT*  pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkIndirectExecutionSetEXT*                  pIndirectExecutionSet);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-deviceGeneratedCommands">##VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT{@code ::deviceGeneratedCommands}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkIndirectExecutionSetCreateInfoEXT structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pIndirectExecutionSet} <b>must</b> be a valid pointer to a {@code VkIndirectExecutionSetEXT} handle</li>
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
        ##VkAllocationCallbacks, ##VkIndirectExecutionSetCreateInfoEXT
        """,

        VkDevice("device", "the logical device that creates the indirect execution set."),
        VkIndirectExecutionSetCreateInfoEXT.const.p("pCreateInfo", "a pointer to a ##VkIndirectExecutionSetCreateInfoEXT structure containing parameters affecting creation of the indirect execution set."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkIndirectExecutionSetEXT.p("pIndirectExecutionSet", "a pointer to a {@code VkIndirectExecutionSetEXT} handle in which the resulting indirect execution set is returned.")
    )

    void(
        "DestroyIndirectExecutionSetEXT",
        """
        Destroy an indirect execution set.

        <h5>C Specification</h5>
        Destroy an Indirect Execution Set by calling:

        <pre><code>
￿void vkDestroyIndirectExecutionSetEXT(
￿    VkDevice                                    device,
￿    VkIndirectExecutionSetEXT                   indirectExecutionSet,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code indirectExecutionSet} <b>must</b> have completed execution</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code indirectExecutionSet} is not #NULL_HANDLE, {@code indirectExecutionSet} <b>must</b> be a valid {@code VkIndirectExecutionSetEXT} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code indirectExecutionSet} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code indirectExecutionSet} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that owns the indirect execution set."),
        VkIndirectExecutionSetEXT("indirectExecutionSet", "the indirect execution set to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    void(
        "UpdateIndirectExecutionSetPipelineEXT",
        """
        Update the contents of an indirect execution set.

        <h5>C Specification</h5>
        Pipeline elements in an Indirect Execution Set can be updated by calling:

        <pre><code>
￿void vkUpdateIndirectExecutionSetPipelineEXT(
￿    VkDevice                                    device,
￿    VkIndirectExecutionSetEXT                   indirectExecutionSet,
￿    uint32_t                                    executionSetWriteCount,
￿    const VkWriteIndirectExecutionSetPipelineEXT* pExecutionSetWrites);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code indirectExecutionSet} <b>must</b> have been created with type #INDIRECT_EXECUTION_SET_INFO_TYPE_PIPELINES_EXT</li>
            <li>{@code executionSetWriteCount} <b>must</b> be less than or equal to ##VkIndirectExecutionSetPipelineInfoEXT{@code ::maxPipelineCount}</li>
            <li>Each element in the {@code pExecutionSetWrites} array must have a unique ##VkWriteIndirectExecutionSetPipelineEXT{@code ::index}</li>
            <li>Each member of the Indirect Execution Set referenced by the update command <b>must</b> not be in use by the device</li>
            <li>The layout of each pipeline in {@code pExecutionSetWrites} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-compatibility">compatible</a> with the {@code initialPipeline} used to create the Indirect Execution Set</li>
            <li>Each pipeline in the Indirect Execution Set <b>must</b> have identically defined static and dynamic state values to the {@code initialPipeline} used to create the Indirect Execution Set</li>
            <li>Each pipeline in the Indirect Execution Set <b>must</b> have identically defined <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#interfaces-fragmentoutput">fragment outputs interface</a> to the {@code initialPipeline} used to create the Indirect Execution Set</li>
            <li>Each pipeline in the Indirect Execution Set <b>must</b> match the {@code initialPipeline} used to create the Indirect Execution Set in its included shader stages</li>
            <li>Each pipeline in the Indirect Execution Set <b>must</b> match the {@code initialPipeline} used to create the Indirect Execution Set in its use of {@code FragDepth}</li>
            <li>Each pipeline in the Indirect Execution Set <b>must</b> match the {@code initialPipeline} used to create the Indirect Execution Set in its use of {@code SampleMask}</li>
            <li>Each pipeline in the Indirect Execution Set <b>must</b> match the {@code initialPipeline} used to create the Indirect Execution Set in its use of {@code StencilExportEXT}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code indirectExecutionSet} <b>must</b> be a valid {@code VkIndirectExecutionSetEXT} handle</li>
            <li>{@code pExecutionSetWrites} <b>must</b> be a valid pointer to an array of {@code executionSetWriteCount} valid ##VkWriteIndirectExecutionSetPipelineEXT structures</li>
            <li>{@code executionSetWriteCount} <b>must</b> be greater than 0</li>
            <li>{@code indirectExecutionSet} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code indirectExecutionSet} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkWriteIndirectExecutionSetPipelineEXT
        """,

        VkDevice("device", "the logical device that owns the indirect execution set."),
        VkIndirectExecutionSetEXT("indirectExecutionSet", "the indirect execution set being updated."),
        AutoSize("pExecutionSetWrites")..uint32_t("executionSetWriteCount", "the number of elements in the {@code pExecutionSetWrites} array."),
        VkWriteIndirectExecutionSetPipelineEXT.const.p("pExecutionSetWrites", "a pointer to an array of ##VkWriteIndirectExecutionSetPipelineEXT structures describing the elements to update.")
    )

    void(
        "UpdateIndirectExecutionSetShaderEXT",
        """
        Update the contents of an indirect execution set.

        <h5>C Specification</h5>
        Shader object elements in an Indirect Execution Set can be updated by calling:

        <pre><code>
￿void vkUpdateIndirectExecutionSetShaderEXT(
￿    VkDevice                                    device,
￿    VkIndirectExecutionSetEXT                   indirectExecutionSet,
￿    uint32_t                                    executionSetWriteCount,
￿    const VkWriteIndirectExecutionSetShaderEXT* pExecutionSetWrites);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code indirectExecutionSet} <b>must</b> have been created with type #INDIRECT_EXECUTION_SET_INFO_TYPE_SHADER_OBJECTS_EXT</li>
            <li>Each element in the {@code pExecutionSetWrites} array must have a unique ##VkWriteIndirectExecutionSetShaderEXT{@code ::index}</li>
            <li>Each member of the Indirect Execution Set referenced by the update command <b>must</b> not be in use by the device</li>
            <li>The descriptor layout of each shader in {@code pExecutionSetWrites} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-compatibility">compatible</a> with the initial layout info used to create the Indirect Execution Set</li>
            <li>Each fragment shader element in the Indirect Execution Set <b>must</b> have identically defined <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#interfaces-fragmentoutput">fragment outputs interface</a> to the initial shader state used to create the Indirect Execution Set</li>
            <li>Each fragment shader element in the Indirect Execution Set <b>must</b> match the initial shader state used to create the Indirect Execution Set in its use of {@code FragDepth}</li>
            <li>Each fragment shader element in the Indirect Execution Set <b>must</b> match the initial shader state used to create the Indirect Execution Set in its use of {@code SampleMask}</li>
            <li>Each fragment shader element in the Indirect Execution Set <b>must</b> match the initial shader state used to create the Indirect Execution Set in its use of {@code StencilExportEXT}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code indirectExecutionSet} <b>must</b> be a valid {@code VkIndirectExecutionSetEXT} handle</li>
            <li>{@code pExecutionSetWrites} <b>must</b> be a valid pointer to an array of {@code executionSetWriteCount} valid ##VkWriteIndirectExecutionSetShaderEXT structures</li>
            <li>{@code executionSetWriteCount} <b>must</b> be greater than 0</li>
            <li>{@code indirectExecutionSet} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code indirectExecutionSet} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkWriteIndirectExecutionSetShaderEXT
        """,

        VkDevice("device", "the logical device that owns the indirect execution set."),
        VkIndirectExecutionSetEXT("indirectExecutionSet", "the indirect execution set being updated."),
        AutoSize("pExecutionSetWrites")..uint32_t("executionSetWriteCount", "the number of elements in the {@code pExecutionSetWrites} array."),
        VkWriteIndirectExecutionSetShaderEXT.const.p("pExecutionSetWrites", "a pointer to an array of ##VkWriteIndirectExecutionSetShaderEXT structures describing the elements to update.")
    )
}