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
            <li>Extensions with commands or functions with a {@code VkPipelineStageFlags} or {@code VkPipelineStageFlagBits} parameter have had those APIs replaced with equivalents using {@code VkPipelineStageFlags2KHR}.</li>
            <li>The new event and barrier interfaces are now more extensible for future changes.</li>
            <li>Relevant pipeline stage masks can now be specified as empty with the new #PIPELINE_STAGE_NONE_KHR and #PIPELINE_STAGE_2_NONE_KHR values.</li>
            <li>##VkMemoryBarrier2KHR can be chained to ##VkSubpassDependency2, overriding the original 32-bit stage and access masks.</li>
        </ul>

        <h5>Promotion to Vulkan 1.3</h5>
        Vulkan APIs in this extension are included in core Vulkan 1.3, with the KHR suffix omitted. External interactions defined by this extension, such as SPIR-V token names, retain their original names. The original Vulkan API names are still available as aliases of the core functionality.

        <h5>Examples</h5>
        See <a href="https://github.com/KhronosGroup/Vulkan-Docs/wiki/Synchronization-Examples">https://github.com/KhronosGroup/Vulkan-Docs/wiki/Synchronization-Examples</a>

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
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.1">Version 1.1</a></dd>

            <dt><b>API Interactions</b></dt>
            <dd><ul>
                <li>Interacts with VK_EXT_blend_operation_advanced</li>
                <li>Interacts with VK_EXT_conditional_rendering</li>
                <li>Interacts with VK_EXT_device_generated_commands</li>
                <li>Interacts with VK_EXT_fragment_density_map</li>
                <li>Interacts with VK_EXT_mesh_shader</li>
                <li>Interacts with VK_EXT_transform_feedback</li>
                <li>Interacts with VK_KHR_acceleration_structure</li>
                <li>Interacts with VK_KHR_fragment_shading_rate</li>
                <li>Interacts with VK_KHR_ray_tracing_pipeline</li>
                <li>Interacts with VK_NV_device_generated_commands</li>
                <li>Interacts with VK_NV_mesh_shader</li>
                <li>Interacts with VK_NV_ray_tracing</li>
                <li>Interacts with VK_NV_shading_rate_image</li>
            </ul></dd>

            <dt><b>Deprecation State</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.3-promotions">Vulkan 1.3</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Tobias Hector <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_synchronization2]%20@tobski%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_synchronization2%20extension*">tobski</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2020-12-03</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
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

        "PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_EXT".enum(0x00020000L)
    )

    EnumConstantLong(
        "Extends {@code VkAccessFlagBits2}.",

        "ACCESS_2_COMMAND_PREPROCESS_READ_BIT_EXT".enum(0x00020000L),
        "ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_EXT".enum(0x00040000L)
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

    EnumConstantLong(
        "Extends {@code VkPipelineStageFlagBits2}.",

        "PIPELINE_STAGE_2_TASK_SHADER_BIT_EXT".enum(0x00080000L),
        "PIPELINE_STAGE_2_MESH_SHADER_BIT_EXT".enum(0x00100000L)
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
        VkPipelineStageFlags2("stageMask", "a {@code VkPipelineStageFlags2} mask of pipeline stages used to determine the first <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#synchronization-dependencies-scopes\">synchronization scope</a>.")
    )

    void(
        "CmdWaitEvents2KHR",
        "See #CmdWaitEvents2().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        AutoSize("pEvents", "pDependencyInfos")..uint32_t("eventCount", "the length of the {@code pEvents} array."),
        VkEvent.const.p("pEvents", "a pointer to an array of {@code eventCount} events to wait on."),
        VkDependencyInfo.const.p("pDependencyInfos", "a pointer to an array of {@code eventCount} ##VkDependencyInfo structures, defining the second <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#synchronization-dependencies-scopes\">synchronization scope</a>.")
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
        VkFence("fence", "an <b>optional</b> handle to a fence to be signaled once all submitted command buffers have completed execution. If {@code fence} is not #NULL_HANDLE, it defines a <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#synchronization-fences-signaling\">fence signal operation</a>.")
    )
}