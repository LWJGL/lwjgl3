/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_synchronization2 = "KHRSynchronization2".nativeClassVK("KHR_synchronization2", type = "device", postfix = KHR) {
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

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Tobias Hector <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_synchronization2:%20&amp;body=@tobski%20">tobski</a></li>
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

    EnumConstant(
        "Extends {@code VkPipelineStageFlagBits2KHR}.",

        "PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT".enum(0x01000000)
    )

    EnumConstant(
        "Extends {@code VkAccessFlagBits2KHR}.",

        "ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT".enum(0x02000000),
        "ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT".enum(0x04000000),
        "ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT".enum(0x08000000)
    )

    EnumConstant(
        "Extends {@code VkPipelineStageFlagBits2KHR}.",

        "PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT".enum(0x00040000)
    )

    EnumConstant(
        "Extends {@code VkAccessFlagBits2KHR}.",

        "ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT".enum(0x00100000)
    )

    EnumConstant(
        "Extends {@code VkPipelineStageFlagBits2KHR}.",

        "PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV".enum(0x00020000)
    )

    EnumConstant(
        "Extends {@code VkAccessFlagBits2KHR}.",

        "ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV".enum(0x00020000),
        "ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV".enum(0x00040000)
    )

    EnumConstant(
        "Extends {@code VkPipelineStageFlagBits2KHR}.",

        "PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR".enum(0x00400000)
    )

    EnumConstant(
        "Extends {@code VkAccessFlagBits2KHR}.",

        "ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR".enum(0x00800000)
    )

    EnumConstant(
        "Extends {@code VkPipelineStageFlagBits2KHR}.",

        "PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV".enum(0x00400000)
    )

    EnumConstant(
        "Extends {@code VkAccessFlagBits2KHR}.",

        "ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV".enum(0x00800000)
    )

    EnumConstant(
        "Extends {@code VkPipelineStageFlagBits2KHR}.",

        "PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR".enum(0x02000000)
    )

    EnumConstant(
        "Extends {@code VkAccessFlagBits2KHR}.",

        "ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR".enum(0x00200000),
        "ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR".enum(0x00400000)
    )

    EnumConstant(
        "Extends {@code VkPipelineStageFlagBits2KHR}.",

        "PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR".enum(0x00200000)
    )

    EnumConstant(
        "Extends {@code VkPipelineStageFlagBits2KHR}.",

        "PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_NV".enum(0x00200000),
        "PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_NV".enum(0x02000000)
    )

    EnumConstant(
        "Extends {@code VkAccessFlagBits2KHR}.",

        "ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_NV".enum(0x00200000),
        "ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_NV".enum(0x00400000)
    )

    EnumConstant(
        "Extends {@code VkPipelineStageFlagBits2KHR}.",

        "PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT".enum(0x00800000)
    )

    EnumConstant(
        "Extends {@code VkAccessFlagBits2KHR}.",

        "ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT".enum(0x01000000)
    )

    EnumConstant(
        "Extends {@code VkAccessFlagBits2KHR}.",

        "ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT".enum(0x00080000)
    )

    EnumConstant(
        "Extends {@code VkPipelineStageFlagBits2KHR}.",

        "PIPELINE_STAGE_2_TASK_SHADER_BIT_NV".enum(0x00080000),
        "PIPELINE_STAGE_2_MESH_SHADER_BIT_NV".enum(0x00100000)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_2_NV".."1000314008",
        "STRUCTURE_TYPE_CHECKPOINT_DATA_2_NV".."1000314009"
    )

    EnumConstant(
        """
        VkPipelineStageFlagBits2KHR - Pipeline stage flags for VkPipelineStageFlags2KHR

        <h5>Description</h5>
        <ul>
            <li>#PIPELINE_STAGE_2_NONE_KHR specifies no stages of execution.</li>
            <li>#PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR specifies the stage of the pipeline where indirect command parameters are consumed. This stage also includes reading commands written by #CmdPreprocessGeneratedCommandsNV().</li>
            <li>#PIPELINE_STAGE_2_TASK_SHADER_BIT_NV specifies the task shader stage.</li>
            <li>#PIPELINE_STAGE_2_MESH_SHADER_BIT_NV specifies the mesh shader stage.</li>
            <li>#PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR specifies the stage of the pipeline where index buffers are consumed.</li>
            <li>#PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR specifies the stage of the pipeline where vertex buffers are consumed.</li>
            <li>
                #PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR is equivalent to the logical OR of:
                <ul>
                    <li>#PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR</li>
                    <li>#PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR</li>
                </ul>
            </li>
            <li>#PIPELINE_STAGE_2_VERTEX_SHADER_BIT_KHR specifies the vertex shader stage.</li>
            <li>#PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR specifies the tessellation control shader stage.</li>
            <li>#PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR specifies the tessellation evaluation shader stage.</li>
            <li>#PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR specifies the geometry shader stage.</li>
            <li>
                #PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT_KHR is equivalent to specifying all supported <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader stages</a>:
                <ul>
                    <li>#PIPELINE_STAGE_2_VERTEX_SHADER_BIT_KHR</li>
                    <li>#PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR</li>
                    <li>#PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR</li>
                    <li>#PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR</li>
                    <li>#PIPELINE_STAGE_2_TASK_SHADER_BIT_NV</li>
                    <li>#PIPELINE_STAGE_2_MESH_SHADER_BIT_NV</li>
                </ul>
            </li>
            <li>#PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR specifies the fragment shader stage.</li>
            <li>#PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR specifies the stage of the pipeline where early fragment tests (depth and stencil tests before fragment shading) are performed. This stage also includes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass-load-store-ops">subpass load operations</a> for framebuffer attachments with a depth/stencil format.</li>
            <li>#PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR specifies the stage of the pipeline where late fragment tests (depth and stencil tests after fragment shading) are performed. This stage also includes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass-load-store-ops">subpass store operations</a> for framebuffer attachments with a depth/stencil format.</li>
            <li>#PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR specifies the stage of the pipeline after blending where the final color values are output from the pipeline. This stage also includes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass-load-store-ops">subpass load and store operations</a> and multisample resolve operations for framebuffer attachments with a color or depth/stencil format.</li>
            <li>#PIPELINE_STAGE_2_COMPUTE_SHADER_BIT_KHR specifies the compute shader stage.</li>
            <li>#PIPELINE_STAGE_2_HOST_BIT_KHR specifies a pseudo-stage indicating execution on the host of reads/writes of device memory. This stage is not invoked by any commands recorded in a command buffer.</li>
            <li>#PIPELINE_STAGE_2_COPY_BIT_KHR specifies the execution of all <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#copies">copy commands</a>, including #CmdCopyQueryPoolResults().</li>
            <li>#PIPELINE_STAGE_2_BLIT_BIT_KHR specifies the execution of #CmdBlitImage().</li>
            <li>#PIPELINE_STAGE_2_RESOLVE_BIT_KHR specifies the execution of #CmdResolveImage().</li>
            <li>#PIPELINE_STAGE_2_CLEAR_BIT_KHR specifies the execution of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#clears">clear commands</a>, with the exception of #CmdClearAttachments().</li>
            <li>
                #PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR is equivalent to specifying all of:
                <ul>
                    <li>#PIPELINE_STAGE_2_COPY_BIT_KHR</li>
                    <li>#PIPELINE_STAGE_2_BLIT_BIT_KHR</li>
                    <li>#PIPELINE_STAGE_2_RESOLVE_BIT_KHR</li>
                    <li>#PIPELINE_STAGE_2_CLEAR_BIT_KHR</li>
                </ul>
            </li>
            <li>#PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR specifies the execution of the ray tracing shader stages.</li>
            <li>#PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR specifies the execution of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#acceleration-structure">acceleration structure commands</a>.</li>
            <li>
                #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR specifies the execution of all graphics pipeline stages, and is equivalent to the logical OR of:
                <ul>
                    <li>#PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR</li>
                    <li>#PIPELINE_STAGE_2_TASK_SHADER_BIT_NV</li>
                    <li>#PIPELINE_STAGE_2_MESH_SHADER_BIT_NV</li>
                    <li>#PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR</li>
                    <li>#PIPELINE_STAGE_2_VERTEX_SHADER_BIT_KHR</li>
                    <li>#PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR</li>
                    <li>#PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR</li>
                    <li>#PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR</li>
                    <li>#PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR</li>
                    <li>#PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR</li>
                    <li>#PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR</li>
                    <li>#PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR</li>
                    <li>#PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT</li>
                    <li>#PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT</li>
                    <li>#PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV</li>
                    <li>#PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT</li>
                    <li>#PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI</li>
                </ul>
            </li>
            <li>#PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR specifies all operations performed by all commands supported on the queue it is used with.</li>
            <li>#PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT specifies the stage of the pipeline where the predicate of conditional rendering is consumed.</li>
            <li>#PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT specifies the stage of the pipeline where vertex attribute output values are written to the transform feedback buffers.</li>
            <li>#PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV specifies the stage of the pipeline where device-side generation of commands via #CmdPreprocessGeneratedCommandsNV() is handled.</li>
            <li>#PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR specifies the stage of the pipeline where the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#primsrast-fragment-shading-rate-attachment">fragment shading rate attachment</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#primsrast-shading-rate-attachment">shading rate image</a> is read to determine the fragment shading rate for portions of a rasterized primitive.</li>
            <li>#PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT specifies the stage of the pipeline where the fragment density map is read to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#fragmentdensitymapops">generate the fragment areas</a>.</li>
            <li>#PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI specifies the stage of the pipeline where the invocation mask image is read by the implementation to optimize the ray dispatch.</li>
            <li>#PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR specifies the stage of the pipeline where <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#video-decode-operations">video decode operation</a> are performed.</li>
            <li>#PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR specifies the stage of the pipeline where <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#video-encode-operations">video encode operation</a> are performed.</li>
            <li>#PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI specifies the subpass shading shader stage.</li>
            <li>#PIPELINE_STAGE_2_TOP_OF_PIPE_BIT_KHR is equivalent to #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR with {@code VkAccessFlags2KHR} set to 0 when specified in the second synchronization scope, but equivalent to #PIPELINE_STAGE_2_NONE_KHR in the first scope.</li>
            <li>#PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT_KHR is equivalent to #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR with {@code VkAccessFlags2KHR} set to 0 when specified in the first synchronization scope, but equivalent to #PIPELINE_STAGE_2_NONE_KHR in the second scope.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The {@code TOP} and {@code BOTTOM} pipeline stages are deprecated, and applications should prefer #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR and #PIPELINE_STAGE_2_NONE_KHR.
        </div>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The {@code VkPipelineStageFlags2KHR} bitmask goes beyond the 31 individual bit flags allowable within a C99 enum, which is how {@code VkPipelineStageFlagBits} is defined. The first 31 values are common to both, and are interchangeable.
        </div>
        """,

        "PIPELINE_STAGE_2_NONE_KHR".."0",
        "PIPELINE_STAGE_2_TOP_OF_PIPE_BIT_KHR".enum(0x00000001),
        "PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR".enum(0x00000002),
        "PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR".enum(0x00000004),
        "PIPELINE_STAGE_2_VERTEX_SHADER_BIT_KHR".enum(0x00000008),
        "PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR".enum(0x00000010),
        "PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR".enum(0x00000020),
        "PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR".enum(0x00000040),
        "PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR".enum(0x00000080),
        "PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR".enum(0x00000100),
        "PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR".enum(0x00000200),
        "PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR".enum(0x00000400),
        "PIPELINE_STAGE_2_COMPUTE_SHADER_BIT_KHR".enum(0x00000800),
        "PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR".enum(0x00001000),
        "PIPELINE_STAGE_2_TRANSFER_BIT_KHR".enum(0x00001000),
        "PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT_KHR".enum(0x00002000),
        "PIPELINE_STAGE_2_HOST_BIT_KHR".enum(0x00004000),
        "PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR".enum(0x00008000),
        "PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR".enum(0x00010000),
        "PIPELINE_STAGE_2_COPY_BIT_KHR".enum(0x00000001),
        "PIPELINE_STAGE_2_RESOLVE_BIT_KHR".enum(0x00000002),
        "PIPELINE_STAGE_2_BLIT_BIT_KHR".enum(0x00000004),
        "PIPELINE_STAGE_2_CLEAR_BIT_KHR".enum(0x00000008),
        "PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR".enum(0x00000010),
        "PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR".enum(0x00000020),
        "PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT_KHR".enum(0x00000040)
    )

    EnumConstant(
        """
        VkAccessFlagBits2KHR - Access flags for VkAccessFlags2KHR

        <h5>Description</h5>
        <ul>
            <li>#ACCESS_2_NONE_KHR specifies no accesses.</li>
            <li>#ACCESS_2_MEMORY_READ_BIT_KHR specifies all read accesses. It is always valid in any access mask, and is treated as equivalent to setting all {@code READ} access flags that are valid where it is used.</li>
            <li>#ACCESS_2_MEMORY_WRITE_BIT_KHR specifies all write accesses. It is always valid in any access mask, and is treated as equivalent to setting all {@code WRITE} access flags that are valid where it is used.</li>
            <li>#ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR specifies read access to command data read from indirect buffers as part of an indirect build, trace, drawing or dispatch command. Such access occurs in the #PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR pipeline stage.</li>
            <li>#ACCESS_2_INDEX_READ_BIT_KHR specifies read access to an index buffer as part of an indexed drawing command, bound by #CmdBindIndexBuffer(). Such access occurs in the #PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR pipeline stage.</li>
            <li>#ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR specifies read access to a vertex buffer as part of a drawing command, bound by #CmdBindVertexBuffers(). Such access occurs in the #PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR pipeline stage.</li>
            <li>#ACCESS_2_UNIFORM_READ_BIT_KHR specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-uniformbuffer">uniform buffer</a> in any shader pipeline stage.</li>
            <li>#ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR specifies read access to an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass">input attachment</a> within a render pass during subpass shading or fragment shading. Such access occurs in the #PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI or #PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR pipeline stage.</li>
            <li>#ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-uniformtexelbuffer">uniform texel buffer</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-sampledimage">sampled image</a> in any shader pipeline stage.</li>
            <li>#ACCESS_2_SHADER_STORAGE_READ_BIT_KHR specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-storagebuffer">storage buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-physical-storage-buffer">physical storage buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-storagetexelbuffer">storage texel buffer</a>, or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-storageimage">storage image</a> in any shader pipeline stage.</li>
            <li>
                #ACCESS_2_SHADER_READ_BIT_KHR specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#shader-binding-table">shader binding table</a> in any shader pipeline. In addition, it is equivalent to the logical OR of:
                <ul>
                    <li>VK_ACCESS_2_UNIFORM_READ_BIT_KHR</li>
                    <li>VK_ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR</li>
                    <li>VK_ACCESS_2_SHADER_STORAGE_READ_BIT_KHR</li>
                </ul>
            </li>
            <li>#ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR specifies write access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-storagebuffer">storage buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-physical-storage-buffer">physical storage buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-storagetexelbuffer">storage texel buffer</a>, or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#descriptorsets-storageimage">storage image</a> in any shader pipeline stage.</li>
            <li>#ACCESS_2_SHADER_WRITE_BIT_KHR is equivalent to #ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR.</li>
            <li>#ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass">color attachment</a>, such as via <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#framebuffer-blending">blending</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#framebuffer-logicop">logic operations</a>, or via certain <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass-load-store-ops">subpass load operations</a>. It does not include <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#framebuffer-blend-advanced">advanced blend operations</a>. Such access occurs in the #PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR pipeline stage.</li>
            <li>#ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR specifies write access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass">color, resolve, or depth/stencil resolve attachment</a> during a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass">render pass</a> or via certain <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass-load-store-ops">subpass load and store operations</a>. Such access occurs in the #PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR pipeline stage.</li>
            <li>#ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass">depth/stencil attachment</a>, via <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#fragops-ds-state">depth or stencil operations</a> or via certain <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass-load-store-ops">subpass load operations</a>. Such access occurs in the #PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR or #PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR pipeline stages.</li>
            <li>#ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR specifies write access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass">depth/stencil attachment</a>, via <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#fragops-ds-state">depth or stencil operations</a> or via certain <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass-load-store-ops">subpass load and store operations</a>. Such access occurs in the #PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR or #PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR pipeline stages.</li>
            <li>#ACCESS_2_TRANSFER_READ_BIT_KHR specifies read access to an image or buffer in a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#copies">copy</a> operation. Such access occurs in the #PIPELINE_STAGE_2_COPY_BIT_KHR, #PIPELINE_STAGE_2_BLIT_BIT_KHR, or #PIPELINE_STAGE_2_RESOLVE_BIT_KHR pipeline stages.</li>
            <li>#ACCESS_2_TRANSFER_WRITE_BIT_KHR specifies write access to an image or buffer in a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#clears">clear</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#copies">copy</a> operation. Such access occurs in the #PIPELINE_STAGE_2_COPY_BIT_KHR, #PIPELINE_STAGE_2_BLIT_BIT_KHR, #PIPELINE_STAGE_2_CLEAR_BIT_KHR, or #PIPELINE_STAGE_2_RESOLVE_BIT_KHR pipeline stages.</li>
            <li>#ACCESS_2_HOST_READ_BIT_KHR specifies read access by a host operation. Accesses of this type are not performed through a resource, but directly on memory. Such access occurs in the #PIPELINE_STAGE_2_HOST_BIT_KHR pipeline stage.</li>
            <li>#ACCESS_2_HOST_WRITE_BIT_KHR specifies write access by a host operation. Accesses of this type are not performed through a resource, but directly on memory. Such access occurs in the #PIPELINE_STAGE_2_HOST_BIT_KHR pipeline stage.</li>
            <li>#ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT specifies read access to a predicate as part of conditional rendering. Such access occurs in the #PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT pipeline stage.</li>
            <li>#ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT specifies write access to a transform feedback buffer made when transform feedback is active. Such access occurs in the #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT pipeline stage.</li>
            <li>#ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT specifies read access to a transform feedback counter buffer which is read when #CmdBeginTransformFeedbackEXT() executes. Such access occurs in the #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT pipeline stage.</li>
            <li>#ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT specifies write access to a transform feedback counter buffer which is written when #CmdEndTransformFeedbackEXT() executes. Such access occurs in the #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT pipeline stage.</li>
            <li>#ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV specifies reads from buffer inputs to #CmdPreprocessGeneratedCommandsNV(). Such access occurs in the #PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV pipeline stage.</li>
            <li>#ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV specifies writes to the target command buffer preprocess outputs. Such access occurs in the #PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV pipeline stage.</li>
            <li>#ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT specifies read access to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass">color attachments</a>, including <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#framebuffer-blend-advanced">advanced blend operations</a>. Such access occurs in the #PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR pipeline stage.</li>
            <li>#ACCESS_2_INVOCATION_MASK_READ_BIT_HUAWEI specifies read access to a invocation mask image in the #PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI pipeline stage.</li>
            <li>#ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR specifies read access to an acceleration structure as part of a trace, build, or copy command, or to an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#acceleration-structure-scratch">acceleration structure scratch buffer</a> as part of a build command. Such access occurs in the #PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR pipeline stage or #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR pipeline stage.</li>
            <li>#ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR specifies write access to an acceleration structure or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#acceleration-structure-scratch">acceleration structure scratch buffer</a> as part of a build or copy command. Such access occurs in the #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR pipeline stage.</li>
            <li>#ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#renderpass-fragmentdensitymapattachment">fragment density map attachment</a> during dynamic <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#fragmentdensitymapops">fragment density map operations</a>. Such access occurs in the #PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT pipeline stage.</li>
            <li>#ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR specifies read access to a fragment shading rate attachment during rasterization. Such access occurs in the #PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR pipeline stage.</li>
            <li>#ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV specifies read access to a shading rate image during rasterization. Such access occurs in the #PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV pipeline stage. It is equivalent to #ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR.</li>
            <li>#ACCESS_2_VIDEO_DECODE_READ_BIT_KHR specifies read access to an image or buffer resource as part of a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#video-decode-operations">video decode operation</a>. Such access occurs in the #PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR pipeline stage.</li>
            <li>#ACCESS_2_VIDEO_DECODE_WRITE_BIT_KHR specifies write access to an image or buffer resource as part of a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#video-decode-operations">video decode operation</a>. Such access occurs in the #PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR pipeline stage.</li>
            <li>#ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR specifies read access to an image or buffer resource as part of a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#video-encode-operations">video encode operation</a>. Such access occurs in the #PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR pipeline stage.</li>
            <li>#ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR specifies write access to an image or buffer resource as part of a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#video-encode-operations">video encode operation</a>. Such access occurs in the #PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR pipeline stage.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        In situations where an application wishes to select all access types for a given set of pipeline stages, #ACCESS_2_MEMORY_READ_BIT_KHR or #ACCESS_2_MEMORY_WRITE_BIT_KHR can be used. This is particularly useful when specifying stages that only have a single access type.
        </div>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The {@code VkAccessFlags2KHR} bitmask goes beyond the 31 individual bit flags allowable within a C99 enum, which is how {@code VkAccessFlagBits} is defined. The first 31 values are common to both, and are interchangeable.
        </div>
        """,

        "ACCESS_2_NONE_KHR".."0",
        "ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR".enum(0x00000001),
        "ACCESS_2_INDEX_READ_BIT_KHR".enum(0x00000002),
        "ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR".enum(0x00000004),
        "ACCESS_2_UNIFORM_READ_BIT_KHR".enum(0x00000008),
        "ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR".enum(0x00000010),
        "ACCESS_2_SHADER_READ_BIT_KHR".enum(0x00000020),
        "ACCESS_2_SHADER_WRITE_BIT_KHR".enum(0x00000040),
        "ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR".enum(0x00000080),
        "ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR".enum(0x00000100),
        "ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR".enum(0x00000200),
        "ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR".enum(0x00000400),
        "ACCESS_2_TRANSFER_READ_BIT_KHR".enum(0x00000800),
        "ACCESS_2_TRANSFER_WRITE_BIT_KHR".enum(0x00001000),
        "ACCESS_2_HOST_READ_BIT_KHR".enum(0x00002000),
        "ACCESS_2_HOST_WRITE_BIT_KHR".enum(0x00004000),
        "ACCESS_2_MEMORY_READ_BIT_KHR".enum(0x00008000),
        "ACCESS_2_MEMORY_WRITE_BIT_KHR".enum(0x00010000),
        "ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR".enum(0x00000001),
        "ACCESS_2_SHADER_STORAGE_READ_BIT_KHR".enum(0x00000002),
        "ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR".enum(0x00000004)
    )

    EnumConstant(
        """
        VkSubmitFlagBitsKHR - Bitmask specifying behavior of a submission

        <h5>Description</h5>
        <ul>
            <li>#SUBMIT_PROTECTED_BIT_KHR specifies that this batch is a protected submission.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkSubmitFlagsKHR}
        """,

        "SUBMIT_PROTECTED_BIT_KHR".enum(0x00000001)
    )

    void(
        "CmdSetEvent2KHR",
        """
        Set an event object to signaled state.

        <h5>C Specification</h5>
        To signal an event from a device, call:

        <pre><code>
￿void vkCmdSetEvent2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    VkEvent                                     event,
￿    const VkDependencyInfoKHR*                  pDependencyInfo);</code></pre>

        <h5>Description</h5>
        When #CmdSetEvent2KHR() is submitted to a queue, it defines the first half of memory dependencies defined by {@code pDependencyInfo}, as well as an event signal operation which sets the event to the signaled state. A memory dependency is defined between the event signal operation and commands that occur earlier in submission order.

        The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> are defined by the union of all the memory dependencies defined by {@code pDependencyInfo}, and are applied to all operations that occur earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a>. <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">Queue family ownership transfers</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transitions</a> defined by {@code pDependencyInfo} are also included in the first scopes.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes only the event signal operation, and any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family ownership transfers</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transitions</a> defined by {@code pDependencyInfo}.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> includes only <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family ownership transfers</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transitions</a>.

        Future #CmdWaitEvents2KHR() commands rely on all values of each element in {@code pDependencyInfo} matching exactly with those used to signal the corresponding event. #CmdWaitEvents() <b>must</b> not be used to wait on the result of a signal operation defined by {@code vkCmdSetEvent2KHR}.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The extra information provided by #CmdSetEvent2KHR() compared to #CmdSetEvent() allows implementations to more efficiently schedule the operations required to satisfy the requested dependencies. With #CmdSetEvent(), the full dependency information is not known until #CmdWaitEvents() is recorded, forcing implementations to insert the required operations at that point and not before.
        </div>

        If {@code event} is already in the signaled state when #CmdSetEvent2KHR() is executed on the device, then #CmdSetEvent2KHR() has no effect, no event signal operation occurs, and no dependency is generated.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
            <li>The {@code dependencyFlags} member of {@code pDependencyInfo} <b>must</b> be 0</li>
            <li>The current device mask of {@code commandBuffer} <b>must</b> include exactly one physical device</li>
            <li>The {@code srcStageMask} member of any element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, or {@code pImageMemoryBarriers} members of {@code pDependencyInfo} <b>must</b> only include pipeline stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
            <li>The {@code dstStageMask} member of any element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, or {@code pImageMemoryBarriers} members of {@code pDependencyInfo} <b>must</b> only include pipeline stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
            <li>{@code pDependencyInfo} <b>must</b> be a valid pointer to a valid ##VkDependencyInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>Both of {@code commandBuffer}, and {@code event} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics Compute</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkDependencyInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        VkEvent("event", "the event that will be signaled."),
        VkDependencyInfoKHR.const.p("pDependencyInfo", "a pointer to a ##VkDependencyInfoKHR structure defining the first scopes of this operation.")
    )

    void(
        "CmdResetEvent2KHR",
        """
        Reset an event object to non-signaled state.

        <h5>C Specification</h5>
        To unsignal the event from a device, call:

        <pre><code>
￿void vkCmdResetEvent2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    VkEvent                                     event,
￿    VkPipelineStageFlags2KHR                    stageMask);</code></pre>

        <h5>Description</h5>
        When #CmdResetEvent2KHR() is submitted to a queue, it defines an execution dependency on commands that were submitted before it, and defines an event unsignal operation which resets the event to the unsignaled state.

        The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes all commands that occur earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a>. The synchronization scope is limited to operations by {@code stageMask} or stages that are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-order">logically earlier</a> than {@code stageMask}.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes only the event unsignal operation.

        If {@code event} is already in the unsignaled state when #CmdResetEvent2KHR() is executed on the device, then this command has no effect, no event unsignal operation occurs, and no execution dependency is generated.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-geometryShader">geometry shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR or #PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-conditionalRendering">conditional rendering</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-fragmentDensityMap">fragment density map</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-transformFeedback">transform feedback</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-meshShader">mesh shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_2_MESH_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-taskShader">task shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_2_TASK_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-shadingRateImage">shading rate image</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-subpassShading">subpass shading</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-invocationMask">invocation mask image</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
            <li>{@code stageMask} <b>must</b> not include #PIPELINE_STAGE_2_HOST_BIT_KHR</li>
            <li>There <b>must</b> be an execution dependency between {@code vkCmdResetEvent2KHR} and the execution of any #CmdWaitEvents() that includes {@code event} in its {@code pEvents} parameter</li>
            <li>There <b>must</b> be an execution dependency between {@code vkCmdResetEvent2KHR} and the execution of any #CmdWaitEvents2KHR() that includes {@code event} in its {@code pEvents} parameter</li>
            <li>{@code commandBuffer}’s current device mask <b>must</b> include exactly one physical device.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
            <li>{@code stageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2KHR} values</li>
            <li>{@code stageMask} <b>must</b> not be 0</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>Both of {@code commandBuffer}, and {@code event} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics Compute</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        VkEvent("event", "the event that will be unsignaled."),
        VkPipelineStageFlags2KHR("stageMask", "a {@code VkPipelineStageFlags2KHR} mask of pipeline stages used to determine the first <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-dependencies-scopes\">synchronization scope</a>.")
    )

    void(
        "CmdWaitEvents2KHR",
        """
        Wait for one or more events.

        <h5>C Specification</h5>
        To wait for one or more events to enter the signaled state on a device, call:

        <pre><code>
￿void vkCmdWaitEvents2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    eventCount,
￿    const VkEvent*                              pEvents,
￿    const VkDependencyInfoKHR*                  pDependencyInfos);</code></pre>

        <h5>Description</h5>
        When {@code vkCmdWaitEvents2KHR} is submitted to a queue, it inserts memory dependencies according to the elements of {@code pDependencyInfos} and each corresponding element of {@code pEvents}. {@code vkCmdWaitEvents2KHR} <b>must</b> not be used to wait on event signal operations occurring on other queues, or signal operations execyted by #CmdSetEvent().

        The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> of each memory dependency defined by any element <code>i</code> of {@code pDependencyInfos} are applied to operations that occurred earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a> than the last event signal operation on element <code>i</code> of {@code pEvents}.

        Signal operations for an event at index <code>i</code> are only included if:

        <ul>
            <li>The event was signaled by a #CmdSetEvent2KHR() command that occurred earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a> with a {@code dependencyInfo} parameter exactly equal to the element of {@code pDependencyInfos} at index <code>i</code> ; or</li>
            <li>The event was created without #EVENT_CREATE_DEVICE_ONLY_BIT_KHR, and the first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> defined by the element of {@code pDependencyInfos} at index <code>i</code> only includes host operations (#PIPELINE_STAGE_2_HOST_BIT_KHR).</li>
        </ul>

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> of each memory dependency defined by any element <code>i</code> of {@code pDependencyInfos} are applied to operations that occurred later in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a> than {@code vkCmdWaitEvents2KHR}.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        #CmdWaitEvents2KHR() is used with #CmdSetEvent2KHR() to define a memory dependency between two sets of action commands, roughly in the same way as pipeline barriers, but split into two commands such that work between the two <b>may</b> execute unhindered.
        </div>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Applications should be careful to avoid race conditions when using events. There is no direct ordering guarantee between {@code vkCmdSetEvent2KHR} and #CmdResetEvent2KHR(), #CmdResetEvent(), or #CmdSetEvent(). Another execution dependency (e.g. a pipeline barrier or semaphore with #PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR) is needed to prevent such a race condition.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
            <li>Members of {@code pEvents} <b>must</b> not have been signaled by #CmdSetEvent()</li>
            <li>For any element <code>i</code> of {@code pEvents}, if that event is signaled by #CmdSetEvent2KHR(), that command’s {@code dependencyInfo} parameter <b>must</b> be exactly equal to the <code>i</code>th element of {@code pDependencyInfos}</li>
            <li>For any element <code>i</code> of {@code pEvents}, if that event is signaled by #SetEvent(), barriers in the <code>i</code>th element of {@code pDependencyInfos} <b>must</b> include only host operations in their first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a></li>
            <li>For any element <code>i</code> of {@code pEvents}, if barriers in the <code>i</code>th element of {@code pDependencyInfos} include only host operations, the <code>i</code>th element of {@code pEvents} <b>must</b> be signaled before #CmdWaitEvents2KHR() is executed</li>
            <li>For any element <code>i</code> of {@code pEvents}, if barriers in the <code>i</code>th element of {@code pDependencyInfos} do not include host operations, the <code>i</code>th element of {@code pEvents} <b>must</b> be signaled by a corresponding #CmdSetEvent2KHR() that occurred earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a></li>
            <li>The {@code srcStageMask} member of any element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, or {@code pImageMemoryBarriers} members of {@code pDependencyInfos} <b>must</b> either include only pipeline stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from, or include only #PIPELINE_STAGE_2_HOST_BIT_KHR</li>
            <li>The {@code dstStageMask} member of any element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, or {@code pImageMemoryBarriers} members of {@code pDependencyInfos} <b>must</b> only include pipeline stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
            <li>The {@code dependencyFlags} member of any element of {@code pDependencyInfo} <b>must</b> be 0</li>
            <li>If {@code pEvents} includes one or more events that will be signaled by #SetEvent() after {@code commandBuffer} has been submitted to a queue, then {@code vkCmdWaitEvents2KHR} <b>must</b> not be called inside a render pass instance</li>
            <li>{@code commandBuffer}’s current device mask <b>must</b> include exactly one physical device</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pEvents} <b>must</b> be a valid pointer to an array of {@code eventCount} valid {@code VkEvent} handles</li>
            <li>{@code pDependencyInfos} <b>must</b> be a valid pointer to an array of {@code eventCount} valid ##VkDependencyInfoKHR structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>{@code eventCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code commandBuffer}, and the elements of {@code pEvents} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkDependencyInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        AutoSize("pEvents", "pDependencyInfos")..uint32_t("eventCount", "the length of the {@code pEvents} array."),
        VkEvent.const.p("pEvents", "a pointer to an array of {@code eventCount} events to wait on."),
        VkDependencyInfoKHR.const.p("pDependencyInfos", "a pointer to an array of {@code eventCount} ##VkDependencyInfoKHR structures, defining the second <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-dependencies-scopes\">synchronization scope</a>.")
    )

    void(
        "CmdPipelineBarrier2KHR",
        """
        Insert a memory dependency.

        <h5>C Specification</h5>
        To record a pipeline barrier, call:

        <pre><code>
￿void vkCmdPipelineBarrier2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkDependencyInfoKHR*                  pDependencyInfo);</code></pre>

        <h5>Description</h5>
        When #CmdPipelineBarrier2KHR() is submitted to a queue, it defines memory dependencies between commands that were submitted before it, and those submitted after it.

        The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> of each memory dependency defined by any element <code>i</code> of {@code pDependencyInfos} are applied to operations that occurred earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a>.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> of each memory dependency defined by any element <code>i</code> of {@code pDependencyInfos} are applied to operations that occurred later in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a>.

        If {@code vkCmdPipelineBarrier2KHR} is recorded within a render pass instance, the synchronization scopes are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-barriers-subpass-self-dependencies">limited to operations within the same subpass</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code vkCmdPipelineBarrier2KHR} is called within a render pass instance, the render pass <b>must</b> have been created with at least one ##VkSubpassDependency instance in ##VkRenderPassCreateInfo{@code ::pDependencies} that expresses a dependency from the current subpass to itself, with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scopes</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scopes</a> that are all supersets of the scopes defined in this command</li>
            <li>If {@code vkCmdPipelineBarrier2KHR} is called within a render pass instance, it <b>must</b> not include any buffer memory barriers</li>
            <li>If {@code vkCmdPipelineBarrier2KHR} is called within a render pass instance, the {@code image} member of any image memory barrier included in this command <b>must</b> be an attachment used in the current subpass both as an input attachment, and as either a color or depth/stencil attachment</li>
            <li>If {@code vkCmdPipelineBarrier2KHR} is called within a render pass instance, the {@code oldLayout} and {@code newLayout} members of any image memory barrier included in this command <b>must</b> be equal</li>
            <li>If {@code vkCmdPipelineBarrier2KHR} is called within a render pass instance, the {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} members of any image memory barrier included in this command <b>must</b> be equal</li>
            <li>If {@code vkCmdPipelineBarrier2KHR} is called outside of a render pass instance, #DEPENDENCY_VIEW_LOCAL_BIT <b>must</b> not be included in the dependency flags</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
            <li>The {@code srcStageMask} member of any element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, or {@code pImageMemoryBarriers} members of {@code pDependencyInfo} <b>must</b> only include pipeline stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
            <li>The {@code dstStageMask} member of any element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, or {@code pImageMemoryBarriers} members of {@code pDependencyInfo} <b>must</b> only include pipeline stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pDependencyInfo} <b>must</b> be a valid pointer to a valid ##VkDependencyInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Transfer Graphics Compute</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkDependencyInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        VkDependencyInfoKHR.const.p("pDependencyInfo", "a pointer to a ##VkDependencyInfoKHR structure defining the scopes of this operation.")
    )

    void(
        "CmdWriteTimestamp2KHR",
        """
        Write a device timestamp into a query object.

        <h5>C Specification</h5>
        To request a timestamp, call:

        <pre><code>
￿void vkCmdWriteTimestamp2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    VkPipelineStageFlags2KHR                    stage,
￿    VkQueryPool                                 queryPool,
￿    uint32_t                                    query);</code></pre>

        <h5>Description</h5>
        When {@code vkCmdWriteTimestamp2KHR} is submitted to a queue, it defines an execution dependency on commands that were submitted before it, and writes a timestamp to a query pool.

        The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes all commands that occur earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a>. The synchronization scope is limited to operations on the pipeline stage specified by {@code stage}.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes only the timestamp write operation.

        When the timestamp value is written, the availability status of the query is set to available.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        If an implementation is unable to detect completion and latch the timer at any specific stage of the pipeline, it <b>may</b> instead do so at any logically later stage.
        </div>

        Comparisons between timestamps are not meaningful if the timestamps are written by commands submitted to different queues.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        An example of such a comparison is subtracting an older timestamp from a newer one to determine the execution time of a sequence of commands.
        </div>

        If {@code vkCmdWriteTimestamp2KHR} is called while executing a render pass instance that has multiview enabled, the timestamp uses <code>N</code> consecutive query indices in the query pool (starting at {@code query}) where <code>N</code> is the number of bits set in the view mask of the subpass the command is executed in. The resulting query values are determined by an implementation-dependent choice of one of the following behaviors:

        <ul>
            <li>The first query is a timestamp value and (if more than one bit is set in the view mask) zero is written to the remaining queries. If two timestamps are written in the same subpass, the sum of the execution time of all views between those commands is the difference between the first query written by each command.</li>
            <li>All <code>N</code> queries are timestamp values. If two timestamps are written in the same subpass, the sum of the execution time of all views between those commands is the sum of the difference between corresponding queries written by each command. The difference between corresponding queries <b>may</b> be the execution time of a single view.</li>
        </ul>

        In either case, the application <b>can</b> sum the differences between all <code>N</code> queries to determine the total execution time.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-geometryShader">geometry shaders</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR or #PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-conditionalRendering">conditional rendering</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-fragmentDensityMap">fragment density map</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-transformFeedback">transform feedback</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-meshShader">mesh shaders</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_MESH_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-taskShader">task shaders</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_TASK_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-shadingRateImage">shading rate image</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-subpassShading">subpass shading</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-invocationMask">invocation mask image</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
            <li>{@code stage} <b>must</b> only include a single pipeline stage</li>
            <li>{@code stage} <b>must</b> only include stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
            <li>{@code queryPool} <b>must</b> have been created with a {@code queryType} of #QUERY_TYPE_TIMESTAMP</li>
            <li>The query identified by {@code queryPool} and {@code query} <b>must</b> be <em>unavailable</em></li>
            <li>The command pool’s queue family <b>must</b> support a non-zero {@code timestampValidBits}</li>
            <li>{@code query} <b>must</b> be less than the number of queries in {@code queryPool}</li>
            <li>All queries used by the command <b>must</b> be unavailable</li>
            <li>If {@code vkCmdWriteTimestamp2KHR} is called within a render pass instance, the sum of {@code query} and the number of bits set in the current subpass’s view mask <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code stage} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2KHR} values</li>
            <li>{@code stage} <b>must</b> not be 0</li>
            <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>Both of {@code commandBuffer}, and {@code queryPool} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Transfer Graphics Compute</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkPipelineStageFlags2KHR("stage", "specifies a stage of the pipeline."),
        VkQueryPool("queryPool", "the query pool that will manage the timestamp."),
        uint32_t("query", "the query within the query pool that will contain the timestamp.")
    )

    VkResult(
        "QueueSubmit2KHR",
        """
        Submits command buffers to a queue.

        <h5>C Specification</h5>
        To submit command buffers to a queue, call:

        <pre><code>
￿VkResult vkQueueSubmit2KHR(
￿    VkQueue                                     queue,
￿    uint32_t                                    submitCount,
￿    const VkSubmitInfo2KHR*                     pSubmits,
￿    VkFence                                     fence);</code></pre>

        <h5>Description</h5>
        {@code vkQueueSubmit2KHR} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#devsandqueues-submission">queue submission command</a>, with each batch defined by an element of {@code pSubmits} as an instance of the ##VkSubmitInfo2KHR structure.

        Semaphore operations submitted with #QueueSubmit2KHR() have additional ordering constraints compared to other submission commands, with dependencies involving previous and subsequent queue operations. Information about these additional constraints can be found in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-semaphores">semaphore</a> section of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization">the synchronization chapter</a>.

        If any command buffer submitted to this queue is in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">executable state</a>, it is moved to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending state</a>. Once execution of all submissions of a command buffer complete, it moves from the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending state</a>, back to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">executable state</a>. If a command buffer was recorded with the #COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT flag, it instead moves back to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">invalid state</a>.

        If {@code vkQueueSubmit2KHR} fails, it <b>may</b> return #ERROR_OUT_OF_HOST_MEMORY or #ERROR_OUT_OF_DEVICE_MEMORY. If it does, the implementation <b>must</b> ensure that the state and contents of any resources or synchronization primitives referenced by the submitted command buffers and any semaphores referenced by {@code pSubmits} is unaffected by the call or its failure. If {@code vkQueueSubmit2KHR} fails in such a way that the implementation is unable to make that guarantee, the implementation <b>must</b> return #ERROR_DEVICE_LOST. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#devsandqueues-lost-device">Lost Device</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code fence} is not #NULL_HANDLE, {@code fence} <b>must</b> be unsignaled</li>
            <li>If {@code fence} is not #NULL_HANDLE, {@code fence} <b>must</b> not be associated with any other queue command that has not yet completed execution on that queue</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
            <li>If a command recorded into the {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} referenced an {@code VkEvent}, that event <b>must</b> not be referenced by a command that has been submitted to another queue and is still in the <em>pending state</em></li>
            <li>The {@code semaphore} member of any binary semaphore element of the {@code pSignalSemaphoreInfos} member of any element of {@code pSubmits} <b>must</b> be unsignaled when the semaphore signal operation it defines is executed on the device</li>
            <li>The {@code stageMask} member of any element of the {@code pSignalSemaphoreInfos} member of any element of {@code pSubmits} <b>must</b> only include pipeline stages that are supported by the queue family which {@code queue} belongs to</li>
            <li>The {@code stageMask} member of any element of the {@code pWaitSemaphoreInfos} member of any element of {@code pSubmits} <b>must</b> only include pipeline stages that are supported by the queue family which {@code queue} belongs to</li>
            <li>When a semaphore wait operation for a binary semaphore is executed, as defined by the {@code semaphore} member of any element of the {@code pWaitSemaphoreInfos} member of any element of {@code pSubmits}, there <b>must</b> be no other queues waiting on the same semaphore</li>
            <li>The {@code semaphore} member of any element of the {@code pWaitSemaphoreInfos} member of any element of {@code pSubmits} <b>must</b> be semaphores that are signaled, or have <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-semaphores-signaling">semaphore signal operations</a> previously submitted for execution</li>
            <li>Any {@code semaphore} member of any element of the {@code pWaitSemaphoreInfos} member of any element of {@code pSubmits} that was created with a {@code VkSemaphoreTypeKHR} of #SEMAPHORE_TYPE_BINARY_KHR <b>must</b> reference a semaphore signal operation that has been submitted for execution and any semaphore signal operations on which it depends (if any) <b>must</b> have also been submitted for execution</li>
            <li>The {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending or executable state</a></li>
            <li>If a command recorded into the {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} was not recorded with the #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT, it <b>must</b> not be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending state</a></li>
            <li>Any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-secondary">secondary command buffers recorded</a> into the {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending or executable state</a></li>
            <li>If any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-secondary">secondary command buffers recorded</a> into the {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} was not recorded with the #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT, it <b>must</b> not be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending state</a></li>
            <li>The {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} <b>must</b> have been allocated from a {@code VkCommandPool} that was created for the same queue family {@code queue} belongs to</li>
            <li>If a command recorded into the {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} includes a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers-acquire">Queue Family Transfer Acquire Operation</a>, there <b>must</b> exist a previously submitted <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers-release">Queue Family Transfer Release Operation</a> on a queue in the queue family identified by the acquire operation, with parameters matching the acquire operation as defined in the definition of such <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-queue-transfers-acquire">acquire operations</a>, and which happens before the acquire operation</li>
            <li>If a command recorded into the {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} was a #CmdBeginQuery() whose {@code queryPool} was created with a {@code queryType} of #QUERY_TYPE_PERFORMANCE_QUERY_KHR, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#profiling-lock">profiling lock</a> <b>must</b> have been held continuously on the {@code VkDevice} that {@code queue} was retrieved from, throughout recording of those command buffers</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
            <li>If {@code submitCount} is not 0, {@code pSubmits} <b>must</b> be a valid pointer to an array of {@code submitCount} valid ##VkSubmitInfo2KHR structures</li>
            <li>If {@code fence} is not #NULL_HANDLE, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
            <li>Both of {@code fence}, and {@code queue} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code queue} <b>must</b> be externally synchronized</li>
            <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>-</td><td>-</td><td>Any</td></tr></tbody>
        </table>

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
                <li>#ERROR_DEVICE_LOST</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkSubmitInfo2KHR
        """,

        VkQueue("queue", "the queue that the command buffers will be submitted to."),
        AutoSize("pSubmits")..uint32_t("submitCount", "the number of elements in the {@code pSubmits} array."),
        nullable..VkSubmitInfo2KHR.const.p("pSubmits", "a pointer to an array of ##VkSubmitInfo2KHR structures, each specifying a command buffer submission batch."),
        VkFence("fence", "an <b>optional</b> handle to a fence to be signaled once all submitted command buffers have completed execution. If {@code fence} is not #NULL_HANDLE, it defines a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#synchronization-fences-signaling\">fence signal operation</a>.")
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
￿    VkPipelineStageFlags2KHR                    stage,
￿    VkBuffer                                    dstBuffer,
￿    VkDeviceSize                                dstOffset,
￿    uint32_t                                    marker);</code></pre>

        <h5>Description</h5>
        The command will write the 32-bit marker value into the buffer only after all preceding commands have finished executing up to at least the specified pipeline stage. This includes the completion of other preceding {@code vkCmdWriteBufferMarker2AMD} commands so long as their specified pipeline stages occur either at the same time or earlier than this command’s specified {@code stage}.

        While consecutive buffer marker writes with the same {@code stage} parameter implicitly complete in submission order, memory and execution dependencies between buffer marker writes and other operations <b>must</b> still be explicitly ordered using synchronization commands. The access scope for buffer marker writes falls under the #ACCESS_TRANSFER_WRITE_BIT, and the pipeline stages for identifying the synchronization scope <b>must</b> include both {@code stage} and #PIPELINE_STAGE_TRANSFER_BIT.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Similar to {@code vkCmdWriteTimestamp2KHR}, if an implementation is unable to write a marker at any specific pipeline stage, it <b>may</b> instead do so at any logically later stage.
        </div>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Implementations <b>may</b> only support a limited number of pipelined marker write operations in flight at a given time. Thus an excessive number of marker write operations <b>may</b> degrade command execution performance.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-geometryShader">geometry shaders</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR or #PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-conditionalRendering">conditional rendering</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-fragmentDensityMap">fragment density map</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-transformFeedback">transform feedback</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-meshShader">mesh shaders</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_MESH_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-taskShader">task shaders</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_TASK_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-shadingRateImage">shading rate image</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-subpassShading">subpass shading</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-invocationMask">invocation mask image</a> feature is not enabled, {@code stage} <b>must</b> not contain #PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
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
            <li>{@code stage} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2KHR} values</li>
            <li>{@code stage} <b>must</b> not be 0</li>
            <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
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
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Transfer Graphics Compute</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkPipelineStageFlags2KHR("stage", "specifies the pipeline stage whose completion triggers the marker write."),
        VkBuffer("dstBuffer", "the buffer where the marker will be written."),
        VkDeviceSize("dstOffset", "the byte offset into the buffer where the marker will be written."),
        uint32_t("marker", "the 32-bit value of the marker.")
    )

    DependsOn("VK_NV_device_diagnostic_checkpoints")..void(
        "GetQueueCheckpointData2NV",
        """
        retrieve diagnostic checkpoint data.

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