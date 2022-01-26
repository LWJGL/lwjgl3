/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_synchronization2 = "KHRSynchronization2".nativeClassVK("KHR_synchronization2", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension modifies the original core synchronization APIs to simplify the interface and improve usability of these APIs. It also adds new pipeline stage and access flag types that extend into the 64-bit range, as we have run out within the 32-bit range. The new flags are identical to the old values within the 32-bit range, with new stages and bits beyond that.

        Pipeline stages and access flags are now specified together in memory barrier structures, making the connection between the two more obvious. Additionally, scoping the pipeline stages into the barrier structs allows the use of the {@code MEMORY_READ} and {@code MEMORY_WRITE} flags without sacrificing precision. The per-stage access flags should be used to disambiguate specific accesses in a given stage or set of stages - for instance, between uniform reads and sampling operations.

        Layout transitions have been simplified as well; rather than requiring a different set of layouts for depth/stencil/color attachments, there are generic #IMAGE_LAYOUT_ATTACHMENT_OPTIMAL_KHR and #IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR layouts which are contextually applied based on the image format. For example, for a depth format image, #IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR is equivalent to #IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL_KHR. #IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR also functionally replaces #IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL.

        Events are now more efficient, because they include memory dependency information when you set them on the device. Previously, this information was only known when waiting on an event, so the dependencies could not be satisfied until the wait occurred. That sometimes meant stalling the pipeline when the wait occurred. The new API provides enough information for implementations to satisfy these dependencies in parallel with other tasks.

        Queue submission has been changed to wrap command buffers and semaphores in extensible structures, which incorporate changes from Vulkan 1.1, {@link KHRDeviceGroup VK_KHR_device_group}, and {@link KHRTimelineSemaphore VK_KHR_timeline_semaphore}. This also adds a pipeline stage to the semaphore signal operation, mirroring the existing pipeline stage specification for wait operations.

        Other miscellaneous changes include:

        <ul>
            <li>Events can now be specified as interacting only with the device, allowing more efficient access to the underlying object.</li>
            <li>
                Image memory barriers that do not perform an image layout transition can be specified by setting {@code oldLayout} equal to {@code newLayout}.
                <ul>
                    <li>E.g. the old and new layout can both be set to #IMAGE_LAYOUT_UNDEFINED, without discarding data in the image.</li>
                </ul>
            </li>
            <li>Queue family ownership transfer parameters are simplified in some cases.</li>
            <li>Where two synchronization commands need to be matched up (queue transfer operations, events), the dependency information specified in each place must now match completely for consistency.</li>
            <li>Extensions with commands or functions with a {@code VkPipelineStageFlags} or {@code VkPipelineStageFlagBits} parameter have had those APIs replaced with equivalents using {@code VkPipelineStageFlags2KHR}.</li>
            <li>The new event and barrier interfaces are now more extensible for future changes.</li>
            <li>Relevant pipeline stage masks can now be specified as empty with the new #PIPELINE_STAGE_NONE_KHR and #PIPELINE_STAGE_2_NONE_KHR values.</li>
            <li>##VkMemoryBarrier2KHR can be chained to ##VkSubpassDependency2, overriding the original 32-bit stage and access masks.</li>
        </ul>

        <h5>Promotion to Vulkan 1.3</h5>
        Functionality in this extension is included in core Vulkan 1.3, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <h5>Examples</h5>
        See <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/wiki/Synchronization-Examples">https://github.com/KhronosGroup/Vulkan-Docs/wiki/Synchronization-Examples</a>

        <h5>VK_KHR_synchronization2</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_synchronization2}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>315</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.3-promotions">Vulkan 1.3</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Tobias Hector <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_synchronization2]%20@tobski%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_synchronization2%20extension%3E%3E">tobski</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2020-12-03</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.3 Core</li>
                <li>Interacts with {@link KHRCreateRenderpass2 VK_KHR_create_renderpass2}</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Tobias Hector</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_SYNCHRONIZATION_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_SYNCHRONIZATION_2_EXTENSION_NAME".."VK_KHR_synchronization2"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_MEMORY_BARRIER_2_KHR".."1000314000",
        "STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2_KHR".."1000314001",
        "STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2_KHR".."1000314002",
        "STRUCTURE_TYPE_DEPENDENCY_INFO_KHR".."1000314003",
        "STRUCTURE_TYPE_SUBMIT_INFO_2_KHR".."1000314004",
        "STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO_KHR".."1000314005",
        "STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO_KHR".."1000314006",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES_KHR".."1000314007"
    )

    EnumConstant(
        "Extends {@code VkEventCreateFlagBits}.",

        "EVENT_CREATE_DEVICE_ONLY_BIT_KHR".enum(0x00000001)
    )

    EnumConstant(
        "Extends {@code VkImageLayout}.",

        "IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR".."1000314000",
        "IMAGE_LAYOUT_ATTACHMENT_OPTIMAL_KHR".."1000314001"
    )

    EnumConstant(
        "Extends {@code VkPipelineStageFlagBits}.",

        "PIPELINE_STAGE_NONE_KHR".."0"
    )

    EnumConstant(
        "Extends {@code VkAccessFlagBits}.",

        "ACCESS_NONE_KHR".."0"
    )

    EnumConstantLong(
        "Extends {@code VkPipelineStageFlagBits2}.",

        "PIPELINE_STAGE_2_NONE_KHR".."0L",
        "PIPELINE_STAGE_2_TOP_OF_PIPE_BIT_KHR".enum(0x00000001L),
        "PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR".enum(0x00000002L),
        "PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR".enum(0x00000004L),
        "PIPELINE_STAGE_2_VERTEX_SHADER_BIT_KHR".enum(0x00000008L),
        "PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR".enum(0x00000010L),
        "PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR".enum(0x00000020L),
        "PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR".enum(0x00000040L),
        "PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR".enum(0x00000080L),
        "PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR".enum(0x00000100L),
        "PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR".enum(0x00000200L),
        "PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR".enum(0x00000400L),
        "PIPELINE_STAGE_2_COMPUTE_SHADER_BIT_KHR".enum(0x00000800L),
        "PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR".enum(0x00001000L),
        "PIPELINE_STAGE_2_TRANSFER_BIT".enum(0x00001000L),
        "PIPELINE_STAGE_2_TRANSFER_BIT_KHR".enum(0x00001000L),
        "PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT_KHR".enum(0x00002000L),
        "PIPELINE_STAGE_2_HOST_BIT_KHR".enum(0x00004000L),
        "PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR".enum(0x00008000L),
        "PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR".enum(0x00010000L),
        "PIPELINE_STAGE_2_COPY_BIT_KHR".enum(0x100000000L),
        "PIPELINE_STAGE_2_RESOLVE_BIT_KHR".enum(0x200000000L),
        "PIPELINE_STAGE_2_BLIT_BIT_KHR".enum(0x400000000L),
        "PIPELINE_STAGE_2_CLEAR_BIT_KHR".enum(0x800000000L),
        "PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR".enum(0x1000000000L),
        "PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR".enum(0x2000000000L),
        "PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT_KHR".enum(0x4000000000L)
    )

    EnumConstantLong(
        "Extends {@code VkAccessFlagBits2}.",

        "ACCESS_2_NONE_KHR".."0L",
        "ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR".enum(0x00000001L),
        "ACCESS_2_INDEX_READ_BIT_KHR".enum(0x00000002L),
        "ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR".enum(0x00000004L),
        "ACCESS_2_UNIFORM_READ_BIT_KHR".enum(0x00000008L),
        "ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR".enum(0x00000010L),
        "ACCESS_2_SHADER_READ_BIT_KHR".enum(0x00000020L),
        "ACCESS_2_SHADER_WRITE_BIT_KHR".enum(0x00000040L),
        "ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR".enum(0x00000080L),
        "ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR".enum(0x00000100L),
        "ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR".enum(0x00000200L),
        "ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR".enum(0x00000400L),
        "ACCESS_2_TRANSFER_READ_BIT_KHR".enum(0x00000800L),
        "ACCESS_2_TRANSFER_WRITE_BIT_KHR".enum(0x00001000L),
        "ACCESS_2_HOST_READ_BIT_KHR".enum(0x00002000L),
        "ACCESS_2_HOST_WRITE_BIT_KHR".enum(0x00004000L),
        "ACCESS_2_MEMORY_READ_BIT_KHR".enum(0x00008000L),
        "ACCESS_2_MEMORY_WRITE_BIT_KHR".enum(0x00010000L),
        "ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR".enum(0x100000000L),
        "ACCESS_2_SHADER_STORAGE_READ_BIT_KHR".enum(0x200000000L),
        "ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR".enum(0x400000000L)
    )

    EnumConstant(
        "Extends {@code VkSubmitFlagBits}.",

        "SUBMIT_PROTECTED_BIT_KHR".enum(0x00000001)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineStageFlagBits2}.",

        "PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT".enum(0x01000000L)
    )

    EnumConstantLong(
        "Extends {@code VkAccessFlagBits2}.",

        "ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT".enum(0x02000000L),
        "ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT".enum(0x04000000L),
        "ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT".enum(0x08000000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineStageFlagBits2}.",

        "PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT".enum(0x00040000L)
    )

    EnumConstantLong(
        "Extends {@code VkAccessFlagBits2}.",

        "ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT".enum(0x00100000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineStageFlagBits2}.",

        "PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV".enum(0x00020000L)
    )

    EnumConstantLong(
        "Extends {@code VkAccessFlagBits2}.",

        "ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV".enum(0x00020000L),
        "ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV".enum(0x00040000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineStageFlagBits2}.",

        "PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR".enum(0x00400000L)
    )

    EnumConstantLong(
        "Extends {@code VkAccessFlagBits2}.",

        "ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR".enum(0x00800000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineStageFlagBits2}.",

        "PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV".enum(0x00400000L)
    )

    EnumConstantLong(
        "Extends {@code VkAccessFlagBits2}.",

        "ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV".enum(0x00800000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineStageFlagBits2}.",

        "PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR".enum(0x02000000L)
    )

    EnumConstantLong(
        "Extends {@code VkAccessFlagBits2}.",

        "ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR".enum(0x00200000L),
        "ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR".enum(0x00400000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineStageFlagBits2}.",

        "PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR".enum(0x00200000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineStageFlagBits2}.",

        "PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_NV".enum(0x00200000L),
        "PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_NV".enum(0x02000000L)
    )

    EnumConstantLong(
        "Extends {@code VkAccessFlagBits2}.",

        "ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_NV".enum(0x00200000L),
        "ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_NV".enum(0x00400000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineStageFlagBits2}.",

        "PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT".enum(0x00800000L)
    )

    EnumConstantLong(
        "Extends {@code VkAccessFlagBits2}.",

        "ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT".enum(0x01000000L)
    )

    EnumConstantLong(
        "Extends {@code VkAccessFlagBits2}.",

        "ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT".enum(0x00080000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineStageFlagBits2}.",

        "PIPELINE_STAGE_2_TASK_SHADER_BIT_NV".enum(0x00080000L),
        "PIPELINE_STAGE_2_MESH_SHADER_BIT_NV".enum(0x00100000L)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_2_NV".."1000314008",
        "STRUCTURE_TYPE_CHECKPOINT_DATA_2_NV".."1000314009"
    )

    void(
        "CmdSetEvent2KHR",
        "See #CmdSetEvent2().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        VkEvent("event", "the event that will be signaled."),
        VkDependencyInfo.const.p("pDependencyInfo", "a pointer to a ##VkDependencyInfo structure defining the first scopes of this operation.")
    )

    void(
        "CmdResetEvent2KHR",
        "See #CmdResetEvent2().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        VkEvent("event", "the event that will be unsignaled."),
        VkPipelineStageFlags2("stageMask", "a {@code VkPipelineStageFlags2} mask of pipeline stages used to determine the first <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#synchronization-dependencies-scopes\">synchronization scope</a>.")
    )

    void(
        "CmdWaitEvents2KHR",
        "See #CmdWaitEvents2().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        AutoSize("pEvents", "pDependencyInfos")..uint32_t("eventCount", "the length of the {@code pEvents} array."),
        VkEvent.const.p("pEvents", "a pointer to an array of {@code eventCount} events to wait on."),
        VkDependencyInfo.const.p("pDependencyInfos", "a pointer to an array of {@code eventCount} ##VkDependencyInfo structures, defining the second <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#synchronization-dependencies-scopes\">synchronization scope</a>.")
    )

    void(
        "CmdPipelineBarrier2KHR",
        "See #CmdPipelineBarrier2().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        VkDependencyInfo.const.p("pDependencyInfo", "a pointer to a ##VkDependencyInfo structure defining the scopes of this operation.")
    )

    void(
        "CmdWriteTimestamp2KHR",
        "See #CmdWriteTimestamp2().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkPipelineStageFlags2("stage", "specifies a stage of the pipeline."),
        VkQueryPool("queryPool", "the query pool that will manage the timestamp."),
        uint32_t("query", "the query within the query pool that will contain the timestamp.")
    )

    VkResult(
        "QueueSubmit2KHR",
        "See #QueueSubmit2().",

        VkQueue("queue", "the queue that the command buffers will be submitted to."),
        AutoSize("pSubmits")..uint32_t("submitCount", "the number of elements in the {@code pSubmits} array."),
        nullable..VkSubmitInfo2.const.p("pSubmits", "a pointer to an array of ##VkSubmitInfo2 structures, each specifying a command buffer submission batch."),
        VkFence("fence", "an <b>optional</b> handle to a fence to be signaled once all submitted command buffers have completed execution. If {@code fence} is not #NULL_HANDLE, it defines a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#synchronization-fences-signaling\">fence signal operation</a>.")
    )

    DependsOn("VK_AMD_buffer_marker")..void(
        "CmdWriteBufferMarker2AMD",
        """
        Execute a pipelined write of a marker value into a buffer.

        <h5>C Specification</h5>
        To write a 32-bit marker value into a buffer as a pipelined operation, call:

        <pre><code>
￿void vkCmdWriteBufferMarker2AMD(
￿    VkCommandBuffer                             commandBuffer,
￿    VkPipelineStageFlags2                       stage,
￿    VkBuffer                                    dstBuffer,
￿    VkDeviceSize                                dstOffset,
￿    uint32_t                                    marker);</code></pre>

        <h5>Description</h5>
        The command will write the 32-bit marker value into the buffer only after all preceding commands have finished executing up to at least the specified pipeline stage. This includes the completion of other preceding {@code vkCmdWriteBufferMarker2AMD} commands so long as their specified pipeline stages occur either at the same time or earlier than this command’s specified {@code stage}.

        While consecutive buffer marker writes with the same {@code stage} parameter implicitly complete in submission order, memory and execution dependencies between buffer marker writes and other operations <b>must</b> still be explicitly ordered using synchronization commands. The access scope for buffer marker writes falls under the #ACCESS_TRANSFER_WRITE_BIT, and the pipeline stages for identifying the synchronization scope <b>must</b> include both {@code stage} and #PIPELINE_STAGE_TRANSFER_BIT.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Similar to {@code vkCmdWriteTimestamp2}, if an implementation is unable to write a marker at any specific pipeline stage, it <b>may</b> instead do so at any logically later stage.
        </div>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Implementations <b>may</b> only support a limited number of pipelined marker write operations in flight at a given time. Thus an excessive number of marker write operations <b>may</b> degrade command execution performance.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-geometryShader">geometry shaders</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT or #PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-conditionalRendering">conditional rendering</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-fragmentDensityMap">fragment density map</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-transformFeedback">transform feedback</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-meshShader">mesh shaders</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_MESH_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-taskShader">task shaders</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_TASK_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shadingRateImage">shading rate image</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-subpassShading">subpass shading</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-invocationMask">invocation mask image</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
            <li>{@code stage} <b>must</b> include only a single pipeline stage</li>
            <li>{@code stage} <b>must</b> include only stages that are valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
            <li>{@code dstOffset} <b>must</b> be less than or equal to the size of {@code dstBuffer} minus 4</li>
            <li>{@code dstBuffer} <b>must</b> have been created with the #BUFFER_USAGE_TRANSFER_DST_BIT usage flag</li>
            <li>If {@code dstBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code dstOffset} <b>must</b> be a multiple of 4</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code stage} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2} values</li>
            <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>Both of {@code commandBuffer}, and {@code dstBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Transfer Graphics Compute</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkPipelineStageFlags2("stage", "specifies the pipeline stage whose completion triggers the marker write."),
        VkBuffer("dstBuffer", "the buffer where the marker will be written."),
        VkDeviceSize("dstOffset", "the byte offset into the buffer where the marker will be written."),
        uint32_t("marker", "the 32-bit value of the marker.")
    )

    DependsOn("VK_NV_device_diagnostic_checkpoints")..void(
        "GetQueueCheckpointData2NV",
        """
        Retrieve diagnostic checkpoint data.

        <h5>C Specification</h5>
        If the device encounters an error during execution, the implementation will return a #ERROR_DEVICE_LOST error to the application at some point during host execution. When this happens, the application <b>can</b> call #GetQueueCheckpointData2NV() to retrieve information on the most recent diagnostic checkpoints that were executed by the device.

        <pre><code>
￿void vkGetQueueCheckpointData2NV(
￿    VkQueue                                     queue,
￿    uint32_t*                                   pCheckpointDataCount,
￿    VkCheckpointData2NV*                        pCheckpointData);</code></pre>

        <h5>Description</h5>
        If {@code pCheckpointData} is {@code NULL}, then the number of checkpoint markers available is returned in {@code pCheckpointDataCount}. Otherwise, {@code pCheckpointDataCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pCheckpointData} array, and on return the variable is overwritten with the number of structures actually written to {@code pCheckpointData}.

        If {@code pCheckpointDataCount} is less than the number of checkpoint markers available, at most {@code pCheckpointDataCount} structures will be written.

        <h5>Valid Usage</h5>
        <ul>
            <li>The device that {@code queue} belongs to <b>must</b> be in the lost state</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
            <li>{@code pCheckpointDataCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pCheckpointDataCount} is not 0, and {@code pCheckpointData} is not {@code NULL}, {@code pCheckpointData} <b>must</b> be a valid pointer to an array of {@code pCheckpointDataCount} ##VkCheckpointData2NV structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkCheckpointData2NV
        """,

        VkQueue("queue", "the {@code VkQueue} object the caller would like to retrieve checkpoint data for"),
        AutoSize("pCheckpointData")..Check(1)..uint32_t.p("pCheckpointDataCount", "a pointer to an integer related to the number of checkpoint markers available or queried, as described below."),
        nullable..VkCheckpointData2NV.p("pCheckpointData", "either {@code NULL} or a pointer to an array of ##VkCheckpointData2NV structures.")
    )
}