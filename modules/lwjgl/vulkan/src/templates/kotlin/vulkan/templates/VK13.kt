/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val VK13 = "VK13".nativeClass(Module.VULKAN, "VK13", prefix = "VK", binding = VK_BINDING_INSTANCE) {
    extends = VK12
    documentation =
        """
        The core Vulkan 1.3 functionality.
        """

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES".."53",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES".."54"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO".."1000192000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES".."1000215000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES".."1000245000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES".."1000276000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES".."1000295000",
        "STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO".."1000295001",
        "STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO".."1000295002"
    )

    EnumConstant(
        "Extends {@code VkObjectType}.",

        "OBJECT_TYPE_PRIVATE_DATA_SLOT".."1000295000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES".."1000297000"
    )

    EnumConstant(
        "Extends {@code VkPipelineCreateFlagBits}.",

        "PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT".enum(0x00000100),
        "PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT".enum(0x00000200)
    )

    EnumConstant(
        "Extends {@code VkResult}.",

        "PIPELINE_COMPILE_REQUIRED".."1000297000"
    )

    EnumConstant(
        "Extends {@code VkPipelineCacheCreateFlagBits}.",

        "PIPELINE_CACHE_CREATE_EXTERNALLY_SYNCHRONIZED_BIT".enum(0x00000001)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_MEMORY_BARRIER_2".."1000314000",
        "STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2".."1000314001",
        "STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2".."1000314002",
        "STRUCTURE_TYPE_DEPENDENCY_INFO".."1000314003",
        "STRUCTURE_TYPE_SUBMIT_INFO_2".."1000314004",
        "STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO".."1000314005",
        "STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO".."1000314006",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES".."1000314007"
    )

    EnumConstant(
        "Extends {@code VkEventCreateFlagBits}.",

        "EVENT_CREATE_DEVICE_ONLY_BIT".enum(0x00000001)
    )

    EnumConstant(
        "Extends {@code VkImageLayout}.",

        "IMAGE_LAYOUT_READ_ONLY_OPTIMAL".."1000314000",
        "IMAGE_LAYOUT_ATTACHMENT_OPTIMAL".."1000314001"
    )

    EnumConstant(
        "Extends {@code VkPipelineStageFlagBits}.",

        "PIPELINE_STAGE_NONE".."0"
    )

    EnumConstant(
        "Extends {@code VkAccessFlagBits}.",

        "ACCESS_NONE".."0"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES".."1000325000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES".."1000335000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_COPY_BUFFER_INFO_2".."1000337000",
        "STRUCTURE_TYPE_COPY_IMAGE_INFO_2".."1000337001",
        "STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2".."1000337002",
        "STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2".."1000337003",
        "STRUCTURE_TYPE_BLIT_IMAGE_INFO_2".."1000337004",
        "STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2".."1000337005",
        "STRUCTURE_TYPE_BUFFER_COPY_2".."1000337006",
        "STRUCTURE_TYPE_IMAGE_COPY_2".."1000337007",
        "STRUCTURE_TYPE_IMAGE_BLIT_2".."1000337008",
        "STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2".."1000337009",
        "STRUCTURE_TYPE_IMAGE_RESOLVE_2".."1000337010"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES".."1000225000",
        "STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO".."1000225001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES".."1000225002"
    )

    EnumConstant(
        "Extends {@code VkPipelineShaderStageCreateFlagBits}.",

        "PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT".enum(0x00000001),
        "PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT".enum(0x00000002)
    )

    EnumConstant(
        "Extends {@code VkDescriptorType}.",

        "DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK".."1000138000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES".."1000138000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES".."1000138001",
        "STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK".."1000138002",
        "STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO".."1000138003"
    )

    EnumConstant(
        "Extends {@code VkFormat}.",

        "FORMAT_G8_B8R8_2PLANE_444_UNORM".."1000330000",
        "FORMAT_G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16".."1000330001",
        "FORMAT_G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16".."1000330002",
        "FORMAT_G16_B16R16_2PLANE_444_UNORM".."1000330003"
    )

    EnumConstant(
        "Extends {@code VkFormat}.",

        "FORMAT_A4R4G4B4_UNORM_PACK16".."1000340000",
        "FORMAT_A4B4G4R4_UNORM_PACK16".."1000340001"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES".."1000066000"
    )

    EnumConstant(
        "Extends {@code VkFormat}.",

        "FORMAT_ASTC_4x4_SFLOAT_BLOCK".."1000066000",
        "FORMAT_ASTC_5x4_SFLOAT_BLOCK".."1000066001",
        "FORMAT_ASTC_5x5_SFLOAT_BLOCK".."1000066002",
        "FORMAT_ASTC_6x5_SFLOAT_BLOCK".."1000066003",
        "FORMAT_ASTC_6x6_SFLOAT_BLOCK".."1000066004",
        "FORMAT_ASTC_8x5_SFLOAT_BLOCK".."1000066005",
        "FORMAT_ASTC_8x6_SFLOAT_BLOCK".."1000066006",
        "FORMAT_ASTC_8x8_SFLOAT_BLOCK".."1000066007",
        "FORMAT_ASTC_10x5_SFLOAT_BLOCK".."1000066008",
        "FORMAT_ASTC_10x6_SFLOAT_BLOCK".."1000066009",
        "FORMAT_ASTC_10x8_SFLOAT_BLOCK".."1000066010",
        "FORMAT_ASTC_10x10_SFLOAT_BLOCK".."1000066011",
        "FORMAT_ASTC_12x10_SFLOAT_BLOCK".."1000066012",
        "FORMAT_ASTC_12x12_SFLOAT_BLOCK".."1000066013"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_RENDERING_INFO".."1000044000",
        "STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO".."1000044001",
        "STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO".."1000044002",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES".."1000044003",
        "STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO".."1000044004"
    )

    EnumConstant(
        "Extends {@code VkAttachmentStoreOp}.",

        "ATTACHMENT_STORE_OP_NONE".."1000301000"
    )

    EnumConstant(
        "Extends {@code VkDynamicState}.",

        "DYNAMIC_STATE_CULL_MODE".."1000267000",
        "DYNAMIC_STATE_FRONT_FACE".."1000267001",
        "DYNAMIC_STATE_PRIMITIVE_TOPOLOGY".."1000267002",
        "DYNAMIC_STATE_VIEWPORT_WITH_COUNT".."1000267003",
        "DYNAMIC_STATE_SCISSOR_WITH_COUNT".."1000267004",
        "DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE".."1000267005",
        "DYNAMIC_STATE_DEPTH_TEST_ENABLE".."1000267006",
        "DYNAMIC_STATE_DEPTH_WRITE_ENABLE".."1000267007",
        "DYNAMIC_STATE_DEPTH_COMPARE_OP".."1000267008",
        "DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE".."1000267009",
        "DYNAMIC_STATE_STENCIL_TEST_ENABLE".."1000267010",
        "DYNAMIC_STATE_STENCIL_OP".."1000267011"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES".."1000280000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES".."1000280001"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES".."1000281001"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_FORMAT_PROPERTIES_3".."1000360000"
    )

    EnumConstant(
        "Extends {@code VkDynamicState}.",

        "DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE".."1000377001",
        "DYNAMIC_STATE_DEPTH_BIAS_ENABLE".."1000377002",
        "DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE".."1000377004"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES".."1000413000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES".."1000413001",
        "STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS".."1000413002",
        "STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS".."1000413003"
    )

    EnumConstant(
        "Extends {@code VkImageAspectFlagBits}.",

        "IMAGE_ASPECT_NONE".."0"
    )

    EnumConstant(
        """
        VkPipelineCreationFeedbackFlagBits - Bitmask specifying pipeline or pipeline stage creation feedback

        <h5>Description</h5>
        <ul>
            <li>#PIPELINE_CREATION_FEEDBACK_VALID_BIT indicates that the feedback information is valid.</li>
            <li>
                #PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT indicates that a readily usable pipeline or pipeline stage was found in the {@code pipelineCache} specified by the application in the pipeline creation command.
                An implementation <b>should</b> set the #PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT bit if it was able to avoid the large majority of pipeline or pipeline stage creation work by using the {@code pipelineCache} parameter of #CreateGraphicsPipelines(), #CreateRayTracingPipelinesKHR(), #CreateRayTracingPipelinesNV(), or #CreateComputePipelines(). When an implementation sets this bit for the entire pipeline, it <b>may</b> leave it unset for any stage.

                <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Implementations are encouraged to provide a meaningful signal to applications using this bit. The intention is to communicate to the application that the pipeline or pipeline stage was created "as fast as it gets" using the pipeline cache provided by the application. If an implementation uses an internal cache, it is discouraged from setting this bit as the feedback would be unactionable.
                </div>
            </li>
            <li>
                #PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT indicates that the base pipeline specified by the {@code basePipelineHandle} or {@code basePipelineIndex} member of the stext:Vk*PipelineCreateInfo structure was used to accelerate the creation of the pipeline.
                An implementation <b>should</b> set the #PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT bit if it was able to avoid a significant amount of work by using the base pipeline.

                <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        While "significant amount of work" is subjective, implementations are encouraged to provide a meaningful signal to applications using this bit. For example, a 1% reduction in duration may not warrant setting this bit, while a 50% reduction would.
                </div>
            </li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineCreationFeedback, ##VkPipelineCreationFeedbackCreateInfo
        """,

        "PIPELINE_CREATION_FEEDBACK_VALID_BIT".enum(0x00000001),
        "PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT".enum(0x00000002),
        "PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT".enum(0x00000004)
    )

    EnumConstant(
        """
        VkToolPurposeFlagBits - Bitmask specifying the purposes of an active tool

        <h5>Description</h5>
        <ul>
            <li>#TOOL_PURPOSE_VALIDATION_BIT specifies that the tool provides validation of API usage.</li>
            <li>#TOOL_PURPOSE_PROFILING_BIT specifies that the tool provides profiling of API usage.</li>
            <li>#TOOL_PURPOSE_TRACING_BIT specifies that the tool is capturing data about the application’s API usage, including anything from simple logging to capturing data for later replay.</li>
            <li>#TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT specifies that the tool provides additional API features/extensions on top of the underlying implementation.</li>
            <li>#TOOL_PURPOSE_MODIFYING_FEATURES_BIT specifies that the tool modifies the API features/limits/extensions presented to the application.</li>
            <li>#TOOL_PURPOSE_DEBUG_REPORTING_BIT_EXT specifies that the tool reports additional information to the application via callbacks specified by #CreateDebugReportCallbackEXT() or #CreateDebugUtilsMessengerEXT()</li>
            <li>#TOOL_PURPOSE_DEBUG_MARKERS_BIT_EXT specifies that the tool consumes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#debugging-debug-markers">debug markers</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#debugging-object-debug-annotation">object debug annotation</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#debugging-queue-labels">queue labels</a>, or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#debugging-command-buffer-labels">command buffer labels</a></li>
        </ul>
        """,

        "TOOL_PURPOSE_VALIDATION_BIT".enum(0x00000001),
        "TOOL_PURPOSE_PROFILING_BIT".enum(0x00000002),
        "TOOL_PURPOSE_TRACING_BIT".enum(0x00000004),
        "TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT".enum(0x00000008),
        "TOOL_PURPOSE_MODIFYING_FEATURES_BIT".enum(0x00000010)
    )

    EnumConstantLong(
        """
        VkPipelineStageFlagBits2 - Pipeline stage flags for VkPipelineStageFlags2

        <h5>Description</h5>
        <ul>
            <li>#PIPELINE_STAGE_2_NONE specifies no stages of execution.</li>
            <li>#PIPELINE_STAGE_2_DRAW_INDIRECT_BIT specifies the stage of the pipeline where indirect command parameters are consumed. This stage also includes reading commands written by #CmdPreprocessGeneratedCommandsNV().</li>
            <li>#PIPELINE_STAGE_2_TASK_SHADER_BIT_NV specifies the task shader stage.</li>
            <li>#PIPELINE_STAGE_2_MESH_SHADER_BIT_NV specifies the mesh shader stage.</li>
            <li>#PIPELINE_STAGE_2_INDEX_INPUT_BIT specifies the stage of the pipeline where index buffers are consumed.</li>
            <li>#PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT specifies the stage of the pipeline where vertex buffers are consumed.</li>
            <li>
                #PIPELINE_STAGE_2_VERTEX_INPUT_BIT is equivalent to the logical OR of:
                <ul>
                    <li>#PIPELINE_STAGE_2_INDEX_INPUT_BIT</li>
                    <li>#PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT</li>
                </ul>
            </li>
            <li>#PIPELINE_STAGE_2_VERTEX_SHADER_BIT specifies the vertex shader stage.</li>
            <li>#PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT specifies the tessellation control shader stage.</li>
            <li>#PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT specifies the tessellation evaluation shader stage.</li>
            <li>#PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT specifies the geometry shader stage.</li>
            <li>
                #PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT is equivalent to specifying all supported <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader stages</a>:
                <ul>
                    <li>#PIPELINE_STAGE_2_VERTEX_SHADER_BIT</li>
                    <li>#PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT</li>
                    <li>#PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT</li>
                    <li>#PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT</li>
                    <li>#PIPELINE_STAGE_2_TASK_SHADER_BIT_NV</li>
                    <li>#PIPELINE_STAGE_2_MESH_SHADER_BIT_NV</li>
                </ul>
            </li>
            <li>#PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT specifies the fragment shader stage.</li>
            <li>#PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT specifies the stage of the pipeline where early fragment tests (depth and stencil tests before fragment shading) are performed. This stage also includes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#renderpass-load-store-ops">subpass load operations</a> for framebuffer attachments with a depth/stencil format.</li>
            <li>#PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT specifies the stage of the pipeline where late fragment tests (depth and stencil tests after fragment shading) are performed. This stage also includes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#renderpass-load-store-ops">subpass store operations</a> for framebuffer attachments with a depth/stencil format.</li>
            <li>#PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT specifies the stage of the pipeline after blending where the final color values are output from the pipeline. This stage also includes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#renderpass-load-store-ops">subpass load and store operations</a> and multisample resolve operations for framebuffer attachments with a color or depth/stencil format.</li>
            <li>#PIPELINE_STAGE_2_COMPUTE_SHADER_BIT specifies the compute shader stage.</li>
            <li>#PIPELINE_STAGE_2_HOST_BIT specifies a pseudo-stage indicating execution on the host of reads/writes of device memory. This stage is not invoked by any commands recorded in a command buffer.</li>
            <li>#PIPELINE_STAGE_2_COPY_BIT specifies the execution of all <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#copies">copy commands</a>, including #CmdCopyQueryPoolResults().</li>
            <li>#PIPELINE_STAGE_2_BLIT_BIT specifies the execution of #CmdBlitImage().</li>
            <li>#PIPELINE_STAGE_2_RESOLVE_BIT specifies the execution of #CmdResolveImage().</li>
            <li>#PIPELINE_STAGE_2_CLEAR_BIT specifies the execution of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#clears">clear commands</a>, with the exception of #CmdClearAttachments().</li>
            <li>
                #PIPELINE_STAGE_2_ALL_TRANSFER_BIT is equivalent to specifying all of:
                <ul>
                    <li>#PIPELINE_STAGE_2_COPY_BIT</li>
                    <li>#PIPELINE_STAGE_2_BLIT_BIT</li>
                    <li>#PIPELINE_STAGE_2_RESOLVE_BIT</li>
                    <li>#PIPELINE_STAGE_2_CLEAR_BIT</li>
                </ul>
            </li>
            <li>#PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR specifies the execution of the ray tracing shader stages.</li>
            <li>#PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR specifies the execution of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#acceleration-structure">acceleration structure commands</a>.</li>
            <li>
                #PIPELINE_STAGE_2_ALL_GRAPHICS_BIT specifies the execution of all graphics pipeline stages, and is equivalent to the logical OR of:
                <ul>
                    <li>#PIPELINE_STAGE_2_DRAW_INDIRECT_BIT</li>
                    <li>#PIPELINE_STAGE_2_TASK_SHADER_BIT_NV</li>
                    <li>#PIPELINE_STAGE_2_MESH_SHADER_BIT_NV</li>
                    <li>#PIPELINE_STAGE_2_VERTEX_INPUT_BIT</li>
                    <li>#PIPELINE_STAGE_2_VERTEX_SHADER_BIT</li>
                    <li>#PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT</li>
                    <li>#PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT</li>
                    <li>#PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT</li>
                    <li>#PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT</li>
                    <li>#PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT</li>
                    <li>#PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT</li>
                    <li>#PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT</li>
                    <li>#PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT</li>
                    <li>#PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT</li>
                    <li>#PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV</li>
                    <li>#PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT</li>
                    <li>#PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI</li>
                </ul>
            </li>
            <li>#PIPELINE_STAGE_2_ALL_COMMANDS_BIT specifies all operations performed by all commands supported on the queue it is used with.</li>
            <li>#PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT specifies the stage of the pipeline where the predicate of conditional rendering is consumed.</li>
            <li>#PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT specifies the stage of the pipeline where vertex attribute output values are written to the transform feedback buffers.</li>
            <li>#PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV specifies the stage of the pipeline where device-side generation of commands via #CmdPreprocessGeneratedCommandsNV() is handled.</li>
            <li>#PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR specifies the stage of the pipeline where the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#primsrast-fragment-shading-rate-attachment">fragment shading rate attachment</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#primsrast-shading-rate-image">shading rate image</a> is read to determine the fragment shading rate for portions of a rasterized primitive.</li>
            <li>#PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT specifies the stage of the pipeline where the fragment density map is read to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#fragmentdensitymapops">generate the fragment areas</a>.</li>
            <li>#PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI specifies the stage of the pipeline where the invocation mask image is read by the implementation to optimize the ray dispatch.</li>
            <li>#PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR specifies the stage of the pipeline where <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#video-decode-operations">video decode operation</a> are performed.</li>
            <li>#PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR specifies the stage of the pipeline where <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#video-encode-operations">video encode operation</a> are performed.</li>
            <li>#PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI specifies the subpass shading shader stage.</li>
            <li>#PIPELINE_STAGE_2_TOP_OF_PIPE_BIT is equivalent to #PIPELINE_STAGE_2_ALL_COMMANDS_BIT with {@code VkAccessFlags2} set to 0 when specified in the second synchronization scope, but equivalent to #PIPELINE_STAGE_2_NONE in the first scope.</li>
            <li>#PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT is equivalent to #PIPELINE_STAGE_2_ALL_COMMANDS_BIT with {@code VkAccessFlags2} set to 0 when specified in the first synchronization scope, but equivalent to #PIPELINE_STAGE_2_NONE in the second scope.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The {@code TOP} and {@code BOTTOM} pipeline stages are deprecated, and applications should prefer #PIPELINE_STAGE_2_ALL_COMMANDS_BIT and #PIPELINE_STAGE_2_NONE.
        </div>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The {@code VkPipelineStageFlags2} bitmask goes beyond the 31 individual bit flags allowable within a C99 enum, which is how {@code VkPipelineStageFlagBits} is defined. The first 31 values are common to both, and are interchangeable.
        </div>
        """,

        "PIPELINE_STAGE_2_NONE".."0L",
        "PIPELINE_STAGE_2_TOP_OF_PIPE_BIT".enum(0x00000001L),
        "PIPELINE_STAGE_2_DRAW_INDIRECT_BIT".enum(0x00000002L),
        "PIPELINE_STAGE_2_VERTEX_INPUT_BIT".enum(0x00000004L),
        "PIPELINE_STAGE_2_VERTEX_SHADER_BIT".enum(0x00000008L),
        "PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT".enum(0x00000010L),
        "PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT".enum(0x00000020L),
        "PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT".enum(0x00000040L),
        "PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT".enum(0x00000080L),
        "PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT".enum(0x00000100L),
        "PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT".enum(0x00000200L),
        "PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT".enum(0x00000400L),
        "PIPELINE_STAGE_2_COMPUTE_SHADER_BIT".enum(0x00000800L),
        "PIPELINE_STAGE_2_ALL_TRANSFER_BIT".enum(0x00001000L),
        "PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT".enum(0x00002000L),
        "PIPELINE_STAGE_2_HOST_BIT".enum(0x00004000L),
        "PIPELINE_STAGE_2_ALL_GRAPHICS_BIT".enum(0x00008000L),
        "PIPELINE_STAGE_2_ALL_COMMANDS_BIT".enum(0x00010000L),
        "PIPELINE_STAGE_2_COPY_BIT".enum(0x100000000L),
        "PIPELINE_STAGE_2_RESOLVE_BIT".enum(0x200000000L),
        "PIPELINE_STAGE_2_BLIT_BIT".enum(0x400000000L),
        "PIPELINE_STAGE_2_CLEAR_BIT".enum(0x800000000L),
        "PIPELINE_STAGE_2_INDEX_INPUT_BIT".enum(0x1000000000L),
        "PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT".enum(0x2000000000L),
        "PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT".enum(0x4000000000L)
    )

    EnumConstantLong(
        """
        VkAccessFlagBits2 - Access flags for VkAccessFlags2

        <h5>Description</h5>
        <ul>
            <li>#ACCESS_2_NONE specifies no accesses.</li>
            <li>#ACCESS_2_MEMORY_READ_BIT specifies all read accesses. It is always valid in any access mask, and is treated as equivalent to setting all {@code READ} access flags that are valid where it is used.</li>
            <li>#ACCESS_2_MEMORY_WRITE_BIT specifies all write accesses. It is always valid in any access mask, and is treated as equivalent to setting all {@code WRITE} access flags that are valid where it is used.</li>
            <li>#ACCESS_2_INDIRECT_COMMAND_READ_BIT specifies read access to command data read from indirect buffers as part of an indirect build, trace, drawing or dispatch command. Such access occurs in the #PIPELINE_STAGE_2_DRAW_INDIRECT_BIT pipeline stage.</li>
            <li>#ACCESS_2_INDEX_READ_BIT specifies read access to an index buffer as part of an indexed drawing command, bound by #CmdBindIndexBuffer(). Such access occurs in the #PIPELINE_STAGE_2_INDEX_INPUT_BIT pipeline stage.</li>
            <li>#ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT specifies read access to a vertex buffer as part of a drawing command, bound by #CmdBindVertexBuffers(). Such access occurs in the #PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT pipeline stage.</li>
            <li>#ACCESS_2_UNIFORM_READ_BIT specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-uniformbuffer">uniform buffer</a> in any shader pipeline stage.</li>
            <li>#ACCESS_2_INPUT_ATTACHMENT_READ_BIT specifies read access to an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#renderpass">input attachment</a> within a render pass during subpass shading or fragment shading. Such access occurs in the #PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI or #PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT pipeline stage.</li>
            <li>#ACCESS_2_SHADER_SAMPLED_READ_BIT specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-uniformtexelbuffer">uniform texel buffer</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-sampledimage">sampled image</a> in any shader pipeline stage.</li>
            <li>#ACCESS_2_SHADER_STORAGE_READ_BIT specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-storagebuffer">storage buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-physical-storage-buffer">physical storage buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-storagetexelbuffer">storage texel buffer</a>, or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-storageimage">storage image</a> in any shader pipeline stage.</li>
            <li>
                #ACCESS_2_SHADER_READ_BIT specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#shader-binding-table">shader binding table</a> in any shader pipeline. In addition, it is equivalent to the logical OR of:
                <ul>
                    <li>#ACCESS_2_UNIFORM_READ_BIT</li>
                    <li>#ACCESS_2_SHADER_SAMPLED_READ_BIT</li>
                    <li>#ACCESS_2_SHADER_STORAGE_READ_BIT</li>
                </ul>
            </li>
            <li>#ACCESS_2_SHADER_STORAGE_WRITE_BIT specifies write access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-storagebuffer">storage buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-physical-storage-buffer">physical storage buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-storagetexelbuffer">storage texel buffer</a>, or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-storageimage">storage image</a> in any shader pipeline stage.</li>
            <li>#ACCESS_2_SHADER_WRITE_BIT is equivalent to #ACCESS_2_SHADER_STORAGE_WRITE_BIT.</li>
            <li>#ACCESS_2_COLOR_ATTACHMENT_READ_BIT specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#renderpass">color attachment</a>, such as via <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#framebuffer-blending">blending</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#framebuffer-logicop">logic operations</a>, or via certain <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#renderpass-load-store-ops">subpass load operations</a>. It does not include <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#framebuffer-blend-advanced">advanced blend operations</a>. Such access occurs in the #PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT pipeline stage.</li>
            <li>#ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT specifies write access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#renderpass">color, resolve, or depth/stencil resolve attachment</a> during a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#renderpass">render pass</a> or via certain <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#renderpass-load-store-ops">subpass load and store operations</a>. Such access occurs in the #PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT pipeline stage.</li>
            <li>#ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#renderpass">depth/stencil attachment</a>, via <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#fragops-ds-state">depth or stencil operations</a> or via certain <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#renderpass-load-store-ops">subpass load operations</a>. Such access occurs in the #PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT or #PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT pipeline stages.</li>
            <li>#ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT specifies write access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#renderpass">depth/stencil attachment</a>, via <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#fragops-ds-state">depth or stencil operations</a> or via certain <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#renderpass-load-store-ops">subpass load and store operations</a>. Such access occurs in the #PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT or #PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT pipeline stages.</li>
            <li>#ACCESS_2_TRANSFER_READ_BIT specifies read access to an image or buffer in a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#copies">copy</a> operation. Such access occurs in the #PIPELINE_STAGE_2_COPY_BIT, #PIPELINE_STAGE_2_BLIT_BIT, or #PIPELINE_STAGE_2_RESOLVE_BIT pipeline stages.</li>
            <li>#ACCESS_2_TRANSFER_WRITE_BIT specifies write access to an image or buffer in a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#clears">clear</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#copies">copy</a> operation. Such access occurs in the #PIPELINE_STAGE_2_COPY_BIT, #PIPELINE_STAGE_2_BLIT_BIT, #PIPELINE_STAGE_2_CLEAR_BIT, or #PIPELINE_STAGE_2_RESOLVE_BIT pipeline stages.</li>
            <li>#ACCESS_2_HOST_READ_BIT specifies read access by a host operation. Accesses of this type are not performed through a resource, but directly on memory. Such access occurs in the #PIPELINE_STAGE_2_HOST_BIT pipeline stage.</li>
            <li>#ACCESS_2_HOST_WRITE_BIT specifies write access by a host operation. Accesses of this type are not performed through a resource, but directly on memory. Such access occurs in the #PIPELINE_STAGE_2_HOST_BIT pipeline stage.</li>
            <li>#ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT specifies read access to a predicate as part of conditional rendering. Such access occurs in the #PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT pipeline stage.</li>
            <li>#ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT specifies write access to a transform feedback buffer made when transform feedback is active. Such access occurs in the #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT pipeline stage.</li>
            <li>#ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT specifies read access to a transform feedback counter buffer which is read when #CmdBeginTransformFeedbackEXT() executes. Such access occurs in the #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT pipeline stage.</li>
            <li>#ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT specifies write access to a transform feedback counter buffer which is written when #CmdEndTransformFeedbackEXT() executes. Such access occurs in the #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT pipeline stage.</li>
            <li>#ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV specifies reads from buffer inputs to #CmdPreprocessGeneratedCommandsNV(). Such access occurs in the #PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV pipeline stage.</li>
            <li>#ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV specifies writes to the target command buffer preprocess outputs. Such access occurs in the #PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV pipeline stage.</li>
            <li>#ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT specifies read access to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#renderpass">color attachments</a>, including <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#framebuffer-blend-advanced">advanced blend operations</a>. Such access occurs in the #PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT pipeline stage.</li>
            <li>#ACCESS_2_INVOCATION_MASK_READ_BIT_HUAWEI specifies read access to a invocation mask image in the #PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI pipeline stage.</li>
            <li>#ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR specifies read access to an acceleration structure as part of a trace, build, or copy command, or to an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#acceleration-structure-scratch">acceleration structure scratch buffer</a> as part of a build command. Such access occurs in the #PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR pipeline stage or #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR pipeline stage.</li>
            <li>#ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR specifies write access to an acceleration structure or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#acceleration-structure-scratch">acceleration structure scratch buffer</a> as part of a build or copy command. Such access occurs in the #PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR pipeline stage.</li>
            <li>#ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#renderpass-fragmentdensitymapattachment">fragment density map attachment</a> during dynamic <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#fragmentdensitymapops">fragment density map operations</a>. Such access occurs in the #PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT pipeline stage.</li>
            <li>#ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR specifies read access to a fragment shading rate attachment during rasterization. Such access occurs in the #PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR pipeline stage.</li>
            <li>#ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV specifies read access to a shading rate image during rasterization. Such access occurs in the #PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV pipeline stage. It is equivalent to #ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR.</li>
            <li>#ACCESS_2_VIDEO_DECODE_READ_BIT_KHR specifies read access to an image or buffer resource as part of a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#video-decode-operations">video decode operation</a>. Such access occurs in the #PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR pipeline stage.</li>
            <li>#ACCESS_2_VIDEO_DECODE_WRITE_BIT_KHR specifies write access to an image or buffer resource as part of a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#video-decode-operations">video decode operation</a>. Such access occurs in the #PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR pipeline stage.</li>
            <li>#ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR specifies read access to an image or buffer resource as part of a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#video-encode-operations">video encode operation</a>. Such access occurs in the #PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR pipeline stage.</li>
            <li>#ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR specifies write access to an image or buffer resource as part of a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#video-encode-operations">video encode operation</a>. Such access occurs in the #PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR pipeline stage.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        In situations where an application wishes to select all access types for a given set of pipeline stages, #ACCESS_2_MEMORY_READ_BIT or #ACCESS_2_MEMORY_WRITE_BIT can be used. This is particularly useful when specifying stages that only have a single access type.
        </div>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The {@code VkAccessFlags2} bitmask goes beyond the 31 individual bit flags allowable within a C99 enum, which is how {@code VkAccessFlagBits} is defined. The first 31 values are common to both, and are interchangeable.
        </div>
        """,

        "ACCESS_2_NONE".."0L",
        "ACCESS_2_INDIRECT_COMMAND_READ_BIT".enum(0x00000001L),
        "ACCESS_2_INDEX_READ_BIT".enum(0x00000002L),
        "ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT".enum(0x00000004L),
        "ACCESS_2_UNIFORM_READ_BIT".enum(0x00000008L),
        "ACCESS_2_INPUT_ATTACHMENT_READ_BIT".enum(0x00000010L),
        "ACCESS_2_SHADER_READ_BIT".enum(0x00000020L),
        "ACCESS_2_SHADER_WRITE_BIT".enum(0x00000040L),
        "ACCESS_2_COLOR_ATTACHMENT_READ_BIT".enum(0x00000080L),
        "ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT".enum(0x00000100L),
        "ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT".enum(0x00000200L),
        "ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT".enum(0x00000400L),
        "ACCESS_2_TRANSFER_READ_BIT".enum(0x00000800L),
        "ACCESS_2_TRANSFER_WRITE_BIT".enum(0x00001000L),
        "ACCESS_2_HOST_READ_BIT".enum(0x00002000L),
        "ACCESS_2_HOST_WRITE_BIT".enum(0x00004000L),
        "ACCESS_2_MEMORY_READ_BIT".enum(0x00008000L),
        "ACCESS_2_MEMORY_WRITE_BIT".enum(0x00010000L),
        "ACCESS_2_SHADER_SAMPLED_READ_BIT".enum(0x100000000L),
        "ACCESS_2_SHADER_STORAGE_READ_BIT".enum(0x200000000L),
        "ACCESS_2_SHADER_STORAGE_WRITE_BIT".enum(0x400000000L)
    )

    EnumConstant(
        """
        VkSubmitFlagBits - Bitmask specifying behavior of a submission

        <h5>Description</h5>
        <ul>
            <li>#SUBMIT_PROTECTED_BIT specifies that this batch is a protected submission.</li>
        </ul>
        """,

        "SUBMIT_PROTECTED_BIT".enum(0x00000001)
    )

    EnumConstant(
        """
        VkRenderingFlagBits - Bitmask specifying additional properties of a dynamic render pass instance

        <h5>Description</h5>
        <ul>
            <li>#RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT specifies that draw calls for the render pass instance will be recorded in secondary command buffers.</li>
            <li>#RENDERING_RESUMING_BIT specifies that the render pass instance is resuming an earlier suspended render pass instance.</li>
            <li>#RENDERING_SUSPENDING_BIT specifies that the render pass instance will be suspended.</li>
        </ul>

        The contents of {@code pRenderingInfo} <b>must</b> match between suspended render pass instances and the render pass instances that resume them, other than the presence or absence of the #RENDERING_RESUMING_BIT, #RENDERING_SUSPENDING_BIT, and #RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT flags. No action or synchronization commands, or other render pass instances, are allowed between suspending and resuming render pass instances.
        """,

        "RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT".enum(0x00000001),
        "RENDERING_SUSPENDING_BIT".enum(0x00000002),
        "RENDERING_RESUMING_BIT".enum(0x00000004)
    )

    EnumConstantLong(
        """
        VkFormatFeatureFlagBits2 - Bitmask specifying features supported by a buffer

        <h5>Description</h5>
        The following bits <b>may</b> be set in {@code linearTilingFeatures} and {@code optimalTilingFeatures}, specifying that the features are supported by images ({@code VkImage}) or image views ({@code VkImageView}) or sampler Y′C<sub>B</sub>C<sub>R</sub> conversion objects ({@code VkSamplerYcbcrConversion}) created with the queried #GetPhysicalDeviceFormatProperties2(){@code ::format}:

        <ul>
            <li>#FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT specifies that an image view <b>can</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-sampledimage">sampled from</a>.</li>
            <li>#FORMAT_FEATURE_2_STORAGE_IMAGE_BIT specifies that an image view <b>can</b> be used as a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-storageimage">storage image</a>.</li>
            <li>#FORMAT_FEATURE_2_STORAGE_IMAGE_ATOMIC_BIT specifies that an image view <b>can</b> be used as storage image that supports atomic operations.</li>
            <li>#FORMAT_FEATURE_2_COLOR_ATTACHMENT_BIT specifies that an image view <b>can</b> be used as a framebuffer color attachment and as an input attachment.</li>
            <li>#FORMAT_FEATURE_2_COLOR_ATTACHMENT_BLEND_BIT specifies that an image view <b>can</b> be used as a framebuffer color attachment that supports blending and as an input attachment.</li>
            <li>#FORMAT_FEATURE_2_DEPTH_STENCIL_ATTACHMENT_BIT specifies that an image view <b>can</b> be used as a framebuffer depth/stencil attachment and as an input attachment.</li>
            <li>#FORMAT_FEATURE_2_BLIT_SRC_BIT specifies that an image <b>can</b> be used as the {@code srcImage} for #CmdBlitImage2() and #CmdBlitImage().</li>
            <li>#FORMAT_FEATURE_2_BLIT_DST_BIT specifies that an image <b>can</b> be used as the {@code dstImage} for #CmdBlitImage2() and #CmdBlitImage().</li>
            <li>
                #FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_LINEAR_BIT specifies that if #FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT is also set, an image view <b>can</b> be used with a sampler that has either of {@code magFilter} or {@code minFilter} set to #FILTER_LINEAR, or {@code mipmapMode} set to #SAMPLER_MIPMAP_MODE_LINEAR. If #FORMAT_FEATURE_2_BLIT_SRC_BIT is also set, an image can be used as the {@code srcImage} for #CmdBlitImage2() and {@code vkCmdBlitImage} with a {@code filter} of #FILTER_LINEAR. This bit <b>must</b> only be exposed for formats that also support the #FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT or #FORMAT_FEATURE_2_BLIT_SRC_BIT.
                If the format being queried is a depth/stencil format, this bit only specifies that the depth aspect (not the stencil aspect) of an image of this format supports linear filtering. Where depth comparison is supported it <b>may</b> be linear filtered whether this bit is present or not, but where this bit is not present the filtered value <b>may</b> be computed in an implementation-dependent manner which differs from the normal rules of linear filtering. The resulting value <b>must</b> be in the range <code>[0,1]</code> and <b>should</b> be proportional to, or a weighted average of, the number of comparison passes or failures.
            </li>
            <li>#FORMAT_FEATURE_2_TRANSFER_SRC_BIT specifies that an image <b>can</b> be used as a source image for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#copies">copy commands</a>.</li>
            <li>#FORMAT_FEATURE_2_TRANSFER_DST_BIT specifies that an image <b>can</b> be used as a destination image for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#copies">copy commands</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#clears">clear commands</a>.</li>
            <li>#FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_MINMAX_BIT specifies {@code VkImage} <b>can</b> be used as a sampled image with a min or max {@code VkSamplerReductionMode}. This bit <b>must</b> only be exposed for formats that also support the #FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT.</li>
            <li>#FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_CUBIC_BIT specifies that {@code VkImage} <b>can</b> be used with a sampler that has either of {@code magFilter} or {@code minFilter} set to #FILTER_CUBIC_EXT, or be the source image for a blit with {@code filter} set to #FILTER_CUBIC_EXT. This bit <b>must</b> only be exposed for formats that also support the #FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT. If the format being queried is a depth/stencil format, this only specifies that the depth aspect is cubic filterable.</li>
            <li>#FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT specifies that an application <b>can</b> define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> using this format as a source, and that an image of this format <b>can</b> be used with a ##VkSamplerYcbcrConversionCreateInfo {@code xChromaOffset} and/or {@code yChromaOffset} of #CHROMA_LOCATION_MIDPOINT. Otherwise both {@code xChromaOffset} and {@code yChromaOffset} <b>must</b> be #CHROMA_LOCATION_COSITED_EVEN. If a format does not incorporate chroma downsampling (it is not a “422” or “420” format) but the implementation supports sampler Y′C<sub>B</sub>C<sub>R</sub> conversion for this format, the implementation <b>must</b> set #FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT.</li>
            <li>#FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT specifies that an application <b>can</b> define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> using this format as a source, and that an image of this format <b>can</b> be used with a ##VkSamplerYcbcrConversionCreateInfo {@code xChromaOffset} and/or {@code yChromaOffset} of #CHROMA_LOCATION_COSITED_EVEN. Otherwise both {@code xChromaOffset} and {@code yChromaOffset} <b>must</b> be #CHROMA_LOCATION_MIDPOINT. If neither #FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT nor #FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT is set, the application <b>must</b> not define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> using this format as a source.</li>
            <li>#FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT specifies that an application <b>can</b> define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> using this format as a source with {@code chromaFilter} set to #FILTER_LINEAR.</li>
            <li>#FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT specifies that the format can have different chroma, min, and mag filters.</li>
            <li>#FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT specifies that reconstruction is explicit, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#textures-chroma-reconstruction">Chroma Reconstruction</a>. If this bit is not present, reconstruction is implicit by default.</li>
            <li>#FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT specifies that reconstruction <b>can</b> be forcibly made explicit by setting ##VkSamplerYcbcrConversionCreateInfo{@code ::forceExplicitReconstruction} to #TRUE. If the format being queried supports #FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT it <b>must</b> also support #FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT.</li>
            <li>#FORMAT_FEATURE_2_DISJOINT_BIT specifies that a multi-planar image <b>can</b> have the #IMAGE_CREATE_DISJOINT_BIT set during image creation. An implementation <b>must</b> not set #FORMAT_FEATURE_2_DISJOINT_BIT for <em>single-plane formats</em>.</li>
            <li>#FORMAT_FEATURE_2_FRAGMENT_DENSITY_MAP_BIT_EXT specifies that an image view <b>can</b> be used as a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#renderpass-fragmentdensitymapattachment">fragment density map attachment</a>.</li>
            <li>#FORMAT_FEATURE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR specifies that an image view <b>can</b> be used as a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#primsrast-fragment-shading-rate-attachment">fragment shading rate attachment</a>. An implementation <b>must</b> not set this feature for formats with numeric type other than {@code *UINT}, or set it as a buffer feature.</li>
            <li>#FORMAT_FEATURE_2_VIDEO_DECODE_OUTPUT_BIT_KHR specifies that an image view with this format <b>can</b> be used as an output for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#video-decode-operations">video decode operations</a></li>
            <li>#FORMAT_FEATURE_2_VIDEO_DECODE_DPB_BIT_KHR specifies that an image view with this format <b>can</b> be used as a DPB for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#video-decode-operations">video decode operations</a></li>
            <li>#FORMAT_FEATURE_2_VIDEO_ENCODE_INPUT_BIT_KHR specifies that an image view with this format <b>can</b> be used as an input to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#video-encode-operations">video encode operations</a></li>
            <li>#FORMAT_FEATURE_2_VIDEO_ENCODE_DPB_BIT_KHR specifies that an image view with this format <b>can</b> be used as a DPB for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#video-encode-operations">video encode operations</a></li>
            <li>#FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT specifies that image views created with this format <b>can</b> be used as <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-storageimage">storage images</a> for read operations without specifying a format.</li>
            <li>#FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT specifies that image views created with this format <b>can</b> be used as <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets-storageimage">storage images</a> for write operations without specifying a format.</li>
            <li>#FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT specifies that image views created with this format <b>can</b> be used for depth comparison performed by {@code OpImage*Dref} instructions.</li>
            <li>#FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV specifies that the format is supported as a renderable <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#glossary">Linear Color Attachment</a>. This bit will be set for renderable color formats in the {@code linearTilingFeatures}. This <b>must</b> not be set in the {@code optimalTilingFeatures} or {@code bufferFeatures} members.</li>
        </ul>

        The following bits <b>may</b> be set in {@code bufferFeatures}, specifying that the features are supported by buffers ({@code VkBuffer}) or buffer views ({@code VkBufferView}) created with the queried #GetPhysicalDeviceFormatProperties2(){@code ::format}:

        <ul>
            <li>#FORMAT_FEATURE_2_UNIFORM_TEXEL_BUFFER_BIT specifies that the format <b>can</b> be used to create a buffer view that <b>can</b> be bound to a #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER descriptor.</li>
            <li>#FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_BIT specifies that the format <b>can</b> be used to create a buffer view that <b>can</b> be bound to a #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER descriptor.</li>
            <li>#FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_ATOMIC_BIT specifies that atomic operations are supported on #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER with this format.</li>
            <li>#FORMAT_FEATURE_2_VERTEX_BUFFER_BIT specifies that the format <b>can</b> be used as a vertex attribute format (##VkVertexInputAttributeDescription{@code ::format}).</li>
            <li>#FORMAT_FEATURE_2_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR specifies that the format <b>can</b> be used as the vertex format when creating an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#acceleration-structure">acceleration structure</a> (##VkAccelerationStructureGeometryTrianglesDataKHR{@code ::vertexFormat}). This format <b>can</b> also be used as the vertex format in host memory when doing <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#host-acceleration-structure">host acceleration structure</a> builds.</li>
        </ul>
        """,

        "FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT".enum(0x00000001L),
        "FORMAT_FEATURE_2_STORAGE_IMAGE_BIT".enum(0x00000002L),
        "FORMAT_FEATURE_2_STORAGE_IMAGE_ATOMIC_BIT".enum(0x00000004L),
        "FORMAT_FEATURE_2_UNIFORM_TEXEL_BUFFER_BIT".enum(0x00000008L),
        "FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_BIT".enum(0x00000010L),
        "FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_ATOMIC_BIT".enum(0x00000020L),
        "FORMAT_FEATURE_2_VERTEX_BUFFER_BIT".enum(0x00000040L),
        "FORMAT_FEATURE_2_COLOR_ATTACHMENT_BIT".enum(0x00000080L),
        "FORMAT_FEATURE_2_COLOR_ATTACHMENT_BLEND_BIT".enum(0x00000100L),
        "FORMAT_FEATURE_2_DEPTH_STENCIL_ATTACHMENT_BIT".enum(0x00000200L),
        "FORMAT_FEATURE_2_BLIT_SRC_BIT".enum(0x00000400L),
        "FORMAT_FEATURE_2_BLIT_DST_BIT".enum(0x00000800L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_LINEAR_BIT".enum(0x00001000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_CUBIC_BIT".enum(0x00002000L),
        "FORMAT_FEATURE_2_TRANSFER_SRC_BIT".enum(0x00004000L),
        "FORMAT_FEATURE_2_TRANSFER_DST_BIT".enum(0x00008000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_MINMAX_BIT".enum(0x00010000L),
        "FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT".enum(0x00020000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT".enum(0x00040000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT".enum(0x00080000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT".enum(0x00100000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT".enum(0x00200000L),
        "FORMAT_FEATURE_2_DISJOINT_BIT".enum(0x00400000L),
        "FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT".enum(0x00800000L),
        "FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT".enum(0x80000000L),
        "FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT".enum(0x100000000L),
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT".enum(0x200000000L)
    )

    // Promoted from VK_EXT_tooling_info (extension 246)

    VkResult(
        "GetPhysicalDeviceToolProperties",
        """
        Reports properties of tools active on the specified physical device.

        <h5>C Specification</h5>
        Information about tools providing debugging, profiling, or similar services, active for a given physical device, can be obtained by calling:

        <pre><code>
￿VkResult vkGetPhysicalDeviceToolProperties(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t*                                   pToolCount,
￿    VkPhysicalDeviceToolProperties*             pToolProperties);</code></pre>

        or the equivalent command

        <pre><code>
￿VkResult vkGetPhysicalDeviceToolPropertiesEXT(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t*                                   pToolCount,
￿    VkPhysicalDeviceToolProperties*             pToolProperties);</code></pre>

        <h5>Description</h5>
        If {@code pToolProperties} is {@code NULL}, then the number of tools currently active on {@code physicalDevice} is returned in {@code pToolCount}. Otherwise, {@code pToolCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pToolProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pToolProperties}. If {@code pToolCount} is less than the number of currently active tools, at most {@code pToolCount} structures will be written.

        The count and properties of active tools <b>may</b> change in response to events outside the scope of the specification. An application <b>should</b> assume these properties might change at any given time.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pToolCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pToolCount} is not 0, and {@code pToolProperties} is not {@code NULL}, {@code pToolProperties} <b>must</b> be a valid pointer to an array of {@code pToolCount} ##VkPhysicalDeviceToolProperties structures</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkPhysicalDeviceToolProperties
        """,

        VkPhysicalDevice("physicalDevice", "the handle to the physical device to query for active tools."),
        AutoSize("pToolProperties")..Check(1)..uint32_t.p("pToolCount", "a pointer to an integer describing the number of tools active on {@code physicalDevice}."),
        nullable..VkPhysicalDeviceToolProperties.p("pToolProperties", "either {@code NULL} or a pointer to an array of ##VkPhysicalDeviceToolProperties structures.")
    )

    // Promoted from VK_EXT_private_data (extension 296)

    VkResult(
        "CreatePrivateDataSlot",
        """
        Create a slot for private data storage.

        <h5>C Specification</h5>
        To create a private data slot, call:

        <pre><code>
￿VkResult vkCreatePrivateDataSlot(
￿    VkDevice                                    device,
￿    const VkPrivateDataSlotCreateInfo*          pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkPrivateDataSlot*                          pPrivateDataSlot);</code></pre>

        or the equivalent command

        <pre><code>
￿VkResult vkCreatePrivateDataSlotEXT(
￿    VkDevice                                    device,
￿    const VkPrivateDataSlotCreateInfo*          pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkPrivateDataSlot*                          pPrivateDataSlot);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-privateData">{@code privateData}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkPrivateDataSlotCreateInfo structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pPrivateDataSlot} <b>must</b> be a valid pointer to a {@code VkPrivateDataSlot} handle</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkPrivateDataSlotCreateInfo
        """,

        VkDevice("device", "the logical device associated with the creation of the object(s) holding the private data slot."),
        VkPrivateDataSlotCreateInfo.const.p("pCreateInfo", "a pointer to a ##VkPrivateDataSlotCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkPrivateDataSlot.p("pPrivateDataSlot", "a pointer to a {@code VkPrivateDataSlot} handle in which the resulting private data slot is returned")
    )

    void(
        "DestroyPrivateDataSlot",
        """
        Destroy a private data slot.

        <h5>C Specification</h5>
        To destroy a private data slot, call:

        <pre><code>
￿void vkDestroyPrivateDataSlot(
￿    VkDevice                                    device,
￿    VkPrivateDataSlot                           privateDataSlot,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkDestroyPrivateDataSlotEXT(
￿    VkDevice                                    device,
￿    VkPrivateDataSlot                           privateDataSlot,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>If ##VkAllocationCallbacks were provided when {@code privateDataSlot} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code privateDataSlot} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code privateDataSlot} is not #NULL_HANDLE, {@code privateDataSlot} <b>must</b> be a valid {@code VkPrivateDataSlot} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code privateDataSlot} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code privateDataSlot} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device associated with the creation of the object(s) holding the private data slot."),
        VkPrivateDataSlot("privateDataSlot", "the private data slot to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "SetPrivateData",
        """
        Associate data with a Vulkan object.

        <h5>C Specification</h5>
        To store user defined data in a slot associated with a Vulkan object, call:

        <pre><code>
￿VkResult vkSetPrivateData(
￿    VkDevice                                    device,
￿    VkObjectType                                objectType,
￿    uint64_t                                    objectHandle,
￿    VkPrivateDataSlot                           privateDataSlot,
￿    uint64_t                                    data);</code></pre>

        or the equivalent command

        <pre><code>
￿VkResult vkSetPrivateDataEXT(
￿    VkDevice                                    device,
￿    VkObjectType                                objectType,
￿    uint64_t                                    objectHandle,
￿    VkPrivateDataSlot                           privateDataSlot,
￿    uint64_t                                    data);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code objectHandle} <b>must</b> be {@code device} or a child of {@code device}</li>
            <li>{@code objectHandle} <b>must</b> be a valid handle to an object of type {@code objectType}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code objectType} <b>must</b> be a valid {@code VkObjectType} value</li>
            <li>{@code privateDataSlot} <b>must</b> be a valid {@code VkPrivateDataSlot} handle</li>
            <li>{@code privateDataSlot} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the device that created the object."),
        VkObjectType("objectType", "a {@code VkObjectType} specifying the type of object to associate data with."),
        uint64_t("objectHandle", "a handle to the object to associate data with."),
        VkPrivateDataSlot("privateDataSlot", "a handle to a {@code VkPrivateDataSlot} specifying location of private data storage."),
        uint64_t("data", "user defined data to associate the object with. This data will be stored at {@code privateDataSlot}.")
    )

    void(
        "GetPrivateData",
        """
        Retrieve data associated with a Vulkan object.

        <h5>C Specification</h5>
        To retrieve user defined data from a slot associated with a Vulkan object, call:

        <pre><code>
￿void vkGetPrivateData(
￿    VkDevice                                    device,
￿    VkObjectType                                objectType,
￿    uint64_t                                    objectHandle,
￿    VkPrivateDataSlot                           privateDataSlot,
￿    uint64_t*                                   pData);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkGetPrivateDataEXT(
￿    VkDevice                                    device,
￿    VkObjectType                                objectType,
￿    uint64_t                                    objectHandle,
￿    VkPrivateDataSlot                           privateDataSlot,
￿    uint64_t*                                   pData);</code></pre>

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Due to platform details on Android, implementations might not be able to reliably return 0 from calls to {@code vkGetPrivateData} for {@code VkSwapchainKHR} objects on which {@code vkSetPrivateData} has not previously been called. This erratum is exclusive to the Android platform and objects of type {@code VkSwapchainKHR}.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code objectType} <b>must</b> be #OBJECT_TYPE_DEVICE, or an object type whose parent is {@code VkDevice}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code objectType} <b>must</b> be a valid {@code VkObjectType} value</li>
            <li>{@code privateDataSlot} <b>must</b> be a valid {@code VkPrivateDataSlot} handle</li>
            <li>{@code pData} <b>must</b> be a valid pointer to a {@code uint64_t} value</li>
            <li>{@code privateDataSlot} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>
        """,

        VkDevice("device", "the device that created the object"),
        VkObjectType("objectType", "a {@code VkObjectType} specifying the type of object data is associated with."),
        uint64_t("objectHandle", "a handle to the object data is associated with."),
        VkPrivateDataSlot("privateDataSlot", "a handle to a {@code VkPrivateDataSlot} specifying location of private data pointer storage."),
        Check(1)..uint64_t.p("pData", "a pointer to specify where user data is returned. 0 will be written in the absence of a previous call to {@code vkSetPrivateData} using the object specified by {@code objectHandle}.")
    )

    // Promoted from VK_KHR_synchronization2 (extension 315)

    void(
        "CmdSetEvent2",
        """
        Set an event object to signaled state.

        <h5>C Specification</h5>
        To signal an event from a device, call:

        <pre><code>
￿void vkCmdSetEvent2(
￿    VkCommandBuffer                             commandBuffer,
￿    VkEvent                                     event,
￿    const VkDependencyInfo*                     pDependencyInfo);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdSetEvent2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    VkEvent                                     event,
￿    const VkDependencyInfo*                     pDependencyInfo);</code></pre>

        <h5>Description</h5>
        When #CmdSetEvent2() is submitted to a queue, it defines the first half of memory dependencies defined by {@code pDependencyInfo}, as well as an event signal operation which sets the event to the signaled state. A memory dependency is defined between the event signal operation and commands that occur earlier in submission order.

        The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> are defined by the union of all the memory dependencies defined by {@code pDependencyInfo}, and are applied to all operations that occur earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a>. <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-queue-transfers">Queue family ownership transfers</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transitions</a> defined by {@code pDependencyInfo} are also included in the first scopes.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes only the event signal operation, and any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family ownership transfers</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transitions</a> defined by {@code pDependencyInfo}.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> includes only <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-queue-transfers">queue family ownership transfers</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-image-layout-transitions">image layout transitions</a>.

        Future #CmdWaitEvents2() commands rely on all values of each element in {@code pDependencyInfo} matching exactly with those used to signal the corresponding event. #CmdWaitEvents() <b>must</b> not be used to wait on the result of a signal operation defined by {@code vkCmdSetEvent2}.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The extra information provided by #CmdSetEvent2() compared to #CmdSetEvent() allows implementations to more efficiently schedule the operations required to satisfy the requested dependencies. With #CmdSetEvent(), the full dependency information is not known until #CmdWaitEvents() is recorded, forcing implementations to insert the required operations at that point and not before.
        </div>

        If {@code event} is already in the signaled state when #CmdSetEvent2() is executed on the device, then #CmdSetEvent2() has no effect, no event signal operation occurs, and no dependency is generated.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
            <li>The {@code dependencyFlags} member of {@code pDependencyInfo} <b>must</b> be 0</li>
            <li>The current device mask of {@code commandBuffer} <b>must</b> include exactly one physical device</li>
            <li>The {@code srcStageMask} member of any element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, or {@code pImageMemoryBarriers} members of {@code pDependencyInfo} <b>must</b> only include pipeline stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
            <li>The {@code dstStageMask} member of any element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, or {@code pImageMemoryBarriers} members of {@code pDependencyInfo} <b>must</b> only include pipeline stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
            <li>{@code pDependencyInfo} <b>must</b> be a valid pointer to a valid ##VkDependencyInfo structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
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
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics Compute</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkDependencyInfo
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        VkEvent("event", "the event that will be signaled."),
        VkDependencyInfo.const.p("pDependencyInfo", "a pointer to a ##VkDependencyInfo structure defining the first scopes of this operation.")
    )

    void(
        "CmdResetEvent2",
        """
        Reset an event object to non-signaled state.

        <h5>C Specification</h5>
        To unsignal the event from a device, call:

        <pre><code>
￿void vkCmdResetEvent2(
￿    VkCommandBuffer                             commandBuffer,
￿    VkEvent                                     event,
￿    VkPipelineStageFlags2                       stageMask);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdResetEvent2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    VkEvent                                     event,
￿    VkPipelineStageFlags2                       stageMask);</code></pre>

        <h5>Description</h5>
        When #CmdResetEvent2() is submitted to a queue, it defines an execution dependency on commands that were submitted before it, and defines an event unsignal operation which resets the event to the unsignaled state.

        The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes all commands that occur earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a>. The synchronization scope is limited to operations by {@code stageMask} or stages that are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-pipeline-stages-order">logically earlier</a> than {@code stageMask}.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes only the event unsignal operation.

        If {@code event} is already in the unsignaled state when #CmdResetEvent2() is executed on the device, then this command has no effect, no event unsignal operation occurs, and no execution dependency is generated.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-geometryShader">geometry shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT or #PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-conditionalRendering">conditional rendering</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-fragmentDensityMap">fragment density map</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-transformFeedback">transform feedback</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-meshShader">mesh shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_2_MESH_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-taskShader">task shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_2_TASK_SHADER_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shadingRateImage">shading rate image</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-subpassShading">subpass shading</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-invocationMask">invocation mask image</a> feature is not enabled, {@code stageMask} <b>must</b> not contain #PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
            <li>{@code stageMask} <b>must</b> not include #PIPELINE_STAGE_2_HOST_BIT</li>
            <li>There <b>must</b> be an execution dependency between {@code vkCmdResetEvent2} and the execution of any #CmdWaitEvents() that includes {@code event} in its {@code pEvents} parameter</li>
            <li>There <b>must</b> be an execution dependency between {@code vkCmdResetEvent2} and the execution of any #CmdWaitEvents2() that includes {@code event} in its {@code pEvents} parameter</li>
            <li>{@code commandBuffer}’s current device mask <b>must</b> include exactly one physical device</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
            <li>{@code stageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2} values</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
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
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics Compute</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        VkEvent("event", "the event that will be unsignaled."),
        VkPipelineStageFlags2("stageMask", "a {@code VkPipelineStageFlags2} mask of pipeline stages used to determine the first <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#synchronization-dependencies-scopes\">synchronization scope</a>.")
    )

    void(
        "CmdWaitEvents2",
        """
        Wait for one or more events.

        <h5>C Specification</h5>
        To wait for one or more events to enter the signaled state on a device, call:

        <pre><code>
￿void vkCmdWaitEvents2(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    eventCount,
￿    const VkEvent*                              pEvents,
￿    const VkDependencyInfo*                     pDependencyInfos);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdWaitEvents2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    eventCount,
￿    const VkEvent*                              pEvents,
￿    const VkDependencyInfo*                     pDependencyInfos);</code></pre>

        <h5>Description</h5>
        When {@code vkCmdWaitEvents2} is submitted to a queue, it inserts memory dependencies according to the elements of {@code pDependencyInfos} and each corresponding element of {@code pEvents}. {@code vkCmdWaitEvents2} <b>must</b> not be used to wait on event signal operations occurring on other queues, or signal operations executed by #CmdSetEvent().

        The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> of each memory dependency defined by any element <code>i</code> of {@code pDependencyInfos} are applied to operations that occurred earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a> than the last event signal operation on element <code>i</code> of {@code pEvents}.

        Signal operations for an event at index <code>i</code> are only included if:

        <ul>
            <li>The event was signaled by a #CmdSetEvent2() command that occurred earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a> with a {@code dependencyInfo} parameter exactly equal to the element of {@code pDependencyInfos} at index <code>i</code> ; or</li>
            <li>The event was created without #EVENT_CREATE_DEVICE_ONLY_BIT, and the first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> defined by the element of {@code pDependencyInfos} at index <code>i</code> only includes host operations (#PIPELINE_STAGE_2_HOST_BIT).</li>
        </ul>

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> of each memory dependency defined by any element <code>i</code> of {@code pDependencyInfos} are applied to operations that occurred later in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a> than {@code vkCmdWaitEvents2}.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        #CmdWaitEvents2() is used with #CmdSetEvent2() to define a memory dependency between two sets of action commands, roughly in the same way as pipeline barriers, but split into two commands such that work between the two <b>may</b> execute unhindered.
        </div>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Applications should be careful to avoid race conditions when using events. There is no direct ordering guarantee between {@code vkCmdSetEvent2} and #CmdResetEvent2(), #CmdResetEvent(), or #CmdSetEvent(). Another execution dependency (e.g. a pipeline barrier or semaphore with #PIPELINE_STAGE_2_ALL_COMMANDS_BIT) is needed to prevent such a race condition.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
            <li>Members of {@code pEvents} <b>must</b> not have been signaled by #CmdSetEvent()</li>
            <li>For any element <code>i</code> of {@code pEvents}, if that event is signaled by #CmdSetEvent2(), that command’s {@code dependencyInfo} parameter <b>must</b> be exactly equal to the <code>i</code>th element of {@code pDependencyInfos}</li>
            <li>For any element <code>i</code> of {@code pEvents}, if that event is signaled by #SetEvent(), barriers in the <code>i</code>th element of {@code pDependencyInfos} <b>must</b> include only host operations in their first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a></li>
            <li>For any element <code>i</code> of {@code pEvents}, if barriers in the <code>i</code>th element of {@code pDependencyInfos} include only host operations, the <code>i</code>th element of {@code pEvents} <b>must</b> be signaled before #CmdWaitEvents2() is executed</li>
            <li>For any element <code>i</code> of {@code pEvents}, if barriers in the <code>i</code>th element of {@code pDependencyInfos} do not include host operations, the <code>i</code>th element of {@code pEvents} <b>must</b> be signaled by a corresponding #CmdSetEvent2() that occurred earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a></li>
            <li>The {@code srcStageMask} member of any element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, or {@code pImageMemoryBarriers} members of {@code pDependencyInfos} <b>must</b> either include only pipeline stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from, or include only #PIPELINE_STAGE_2_HOST_BIT</li>
            <li>The {@code dstStageMask} member of any element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, or {@code pImageMemoryBarriers} members of {@code pDependencyInfos} <b>must</b> only include pipeline stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
            <li>The {@code dependencyFlags} member of any element of {@code pDependencyInfo} <b>must</b> be 0</li>
            <li>If {@code pEvents} includes one or more events that will be signaled by #SetEvent() after {@code commandBuffer} has been submitted to a queue, then {@code vkCmdWaitEvents2} <b>must</b> not be called inside a render pass instance</li>
            <li>{@code commandBuffer}’s current device mask <b>must</b> include exactly one physical device</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pEvents} <b>must</b> be a valid pointer to an array of {@code eventCount} valid {@code VkEvent} handles</li>
            <li>{@code pDependencyInfos} <b>must</b> be a valid pointer to an array of {@code eventCount} valid ##VkDependencyInfo structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
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
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkDependencyInfo
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        AutoSize("pEvents", "pDependencyInfos")..uint32_t("eventCount", "the length of the {@code pEvents} array."),
        VkEvent.const.p("pEvents", "a pointer to an array of {@code eventCount} events to wait on."),
        VkDependencyInfo.const.p("pDependencyInfos", "a pointer to an array of {@code eventCount} ##VkDependencyInfo structures, defining the second <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#synchronization-dependencies-scopes\">synchronization scope</a>.")
    )

    void(
        "CmdPipelineBarrier2",
        """
        Insert a memory dependency.

        <h5>C Specification</h5>
        To record a pipeline barrier, call:

        <pre><code>
￿void vkCmdPipelineBarrier2(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkDependencyInfo*                     pDependencyInfo);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdPipelineBarrier2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkDependencyInfo*                     pDependencyInfo);</code></pre>

        <h5>Description</h5>
        When #CmdPipelineBarrier2() is submitted to a queue, it defines memory dependencies between commands that were submitted before it, and those submitted after it.

        The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> of each memory dependency defined by {@code pDependencyInfo} are applied to operations that occurred earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a>.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scope</a> of each memory dependency defined by {@code pDependencyInfo} are applied to operations that occurred later in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a>.

        If {@code vkCmdPipelineBarrier2} is recorded within a render pass instance, the synchronization scopes are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-pipeline-barriers-subpass-self-dependencies">limited to operations within the same subpass</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code vkCmdPipelineBarrier2} is called within a render pass instance, the render pass <b>must</b> have been created with at least one ##VkSubpassDependency instance in ##VkRenderPassCreateInfo{@code ::pDependencies} that expresses a dependency from the current subpass to itself, with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scopes</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies-access-scopes">access scopes</a> that are all supersets of the scopes defined in this command</li>
            <li>If {@code vkCmdPipelineBarrier2} is called within a render pass instance, it <b>must</b> not include any buffer memory barriers</li>
            <li>If {@code vkCmdPipelineBarrier2} is called within a render pass instance, the {@code image} member of any image memory barrier included in this command <b>must</b> be an attachment used in the current subpass both as an input attachment, and as either a color or depth/stencil attachment</li>
            <li>If {@code vkCmdPipelineBarrier2} is called within a render pass instance, the {@code oldLayout} and {@code newLayout} members of any image memory barrier included in this command <b>must</b> be equal</li>
            <li>If {@code vkCmdPipelineBarrier2} is called within a render pass instance, the {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} members of any image memory barrier included in this command <b>must</b> be equal</li>
            <li>If {@code vkCmdPipelineBarrier2} is called outside of a render pass instance, #DEPENDENCY_VIEW_LOCAL_BIT <b>must</b> not be included in the dependency flags</li>
            <li>If {@code vkCmdPipelineBarrier2} is called within a render pass instance, the render pass <b>must</b> not have been started with #CmdBeginRendering()</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
            <li>The {@code srcStageMask} member of any element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, or {@code pImageMemoryBarriers} members of {@code pDependencyInfo} <b>must</b> only include pipeline stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
            <li>The {@code dstStageMask} member of any element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, or {@code pImageMemoryBarriers} members of {@code pDependencyInfo} <b>must</b> only include pipeline stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pDependencyInfo} <b>must</b> be a valid pointer to a valid ##VkDependencyInfo structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
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

        <h5>See Also</h5>
        ##VkDependencyInfo
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        VkDependencyInfo.const.p("pDependencyInfo", "a pointer to a ##VkDependencyInfo structure defining the scopes of this operation.")
    )

    void(
        "CmdWriteTimestamp2",
        """
        Write a device timestamp into a query object.

        <h5>C Specification</h5>
        To request a timestamp, call:

        <pre><code>
￿void vkCmdWriteTimestamp2(
￿    VkCommandBuffer                             commandBuffer,
￿    VkPipelineStageFlags2                       stage,
￿    VkQueryPool                                 queryPool,
￿    uint32_t                                    query);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdWriteTimestamp2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    VkPipelineStageFlags2                       stage,
￿    VkQueryPool                                 queryPool,
￿    uint32_t                                    query);</code></pre>

        <h5>Description</h5>
        When {@code vkCmdWriteTimestamp2} is submitted to a queue, it defines an execution dependency on commands that were submitted before it, and writes a timestamp to a query pool.

        The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes all commands that occur earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a>. The synchronization scope is limited to operations on the pipeline stage specified by {@code stage}.

        The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> includes only the timestamp write operation.

        When the timestamp value is written, the availability status of the query is set to available.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        If an implementation is unable to detect completion and latch the timer at any specific stage of the pipeline, it <b>may</b> instead do so at any logically later stage.
        </div>

        Comparisons between timestamps are not meaningful if the timestamps are written by commands submitted to different queues.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        An example of such a comparison is subtracting an older timestamp from a newer one to determine the execution time of a sequence of commands.
        </div>

        If {@code vkCmdWriteTimestamp2} is called while executing a render pass instance that has multiview enabled, the timestamp uses <code>N</code> consecutive query indices in the query pool (starting at {@code query}) where <code>N</code> is the number of bits set in the view mask of the subpass the command is executed in. The resulting query values are determined by an implementation-dependent choice of one of the following behaviors:

        <ul>
            <li>The first query is a timestamp value and (if more than one bit is set in the view mask) zero is written to the remaining queries. If two timestamps are written in the same subpass, the sum of the execution time of all views between those commands is the difference between the first query written by each command.</li>
            <li>All <code>N</code> queries are timestamp values. If two timestamps are written in the same subpass, the sum of the execution time of all views between those commands is the sum of the difference between corresponding queries written by each command. The difference between corresponding queries <b>may</b> be the execution time of a single view.</li>
        </ul>

        In either case, the application <b>can</b> sum the differences between all <code>N</code> queries to determine the total execution time.

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
            <li>{@code stage} <b>must</b> only include a single pipeline stage</li>
            <li>{@code stage} <b>must</b> only include stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
            <li>{@code queryPool} <b>must</b> have been created with a {@code queryType} of #QUERY_TYPE_TIMESTAMP</li>
            <li>The query identified by {@code queryPool} and {@code query} <b>must</b> be <em>unavailable</em></li>
            <li>The command pool’s queue family <b>must</b> support a non-zero {@code timestampValidBits}</li>
            <li>{@code query} <b>must</b> be less than the number of queries in {@code queryPool}</li>
            <li>All queries used by the command <b>must</b> be unavailable</li>
            <li>If {@code vkCmdWriteTimestamp2} is called within a render pass instance, the sum of {@code query} and the number of bits set in the current subpass’s view mask <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code stage} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2} values</li>
            <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, compute, decode, or encode operations</li>
            <li>Both of {@code commandBuffer}, and {@code queryPool} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Transfer Graphics Compute Decode Encode</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkPipelineStageFlags2("stage", "specifies a stage of the pipeline."),
        VkQueryPool("queryPool", "the query pool that will manage the timestamp."),
        uint32_t("query", "the query within the query pool that will contain the timestamp.")
    )

    VkResult(
        "QueueSubmit2",
        """
        Submits command buffers to a queue.

        <h5>C Specification</h5>
        To submit command buffers to a queue, call:

        <pre><code>
￿VkResult vkQueueSubmit2(
￿    VkQueue                                     queue,
￿    uint32_t                                    submitCount,
￿    const VkSubmitInfo2*                        pSubmits,
￿    VkFence                                     fence);</code></pre>

        or the equivalent command

        <pre><code>
￿VkResult vkQueueSubmit2KHR(
￿    VkQueue                                     queue,
￿    uint32_t                                    submitCount,
￿    const VkSubmitInfo2*                        pSubmits,
￿    VkFence                                     fence);</code></pre>

        <h5>Description</h5>
        {@code vkQueueSubmit2} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#devsandqueues-submission">queue submission command</a>, with each batch defined by an element of {@code pSubmits}.

        Semaphore operations submitted with #QueueSubmit2() have additional ordering constraints compared to other submission commands, with dependencies involving previous and subsequent queue operations. Information about these additional constraints can be found in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-semaphores">semaphore</a> section of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization">the synchronization chapter</a>.

        If any command buffer submitted to this queue is in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">executable state</a>, it is moved to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending state</a>. Once execution of all submissions of a command buffer complete, it moves from the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending state</a>, back to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">executable state</a>. If a command buffer was recorded with the #COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT flag, it instead moves back to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">invalid state</a>.

        If {@code vkQueueSubmit2} fails, it <b>may</b> return #ERROR_OUT_OF_HOST_MEMORY or #ERROR_OUT_OF_DEVICE_MEMORY. If it does, the implementation <b>must</b> ensure that the state and contents of any resources or synchronization primitives referenced by the submitted command buffers and any semaphores referenced by {@code pSubmits} is unaffected by the call or its failure. If {@code vkQueueSubmit2} fails in such a way that the implementation is unable to make that guarantee, the implementation <b>must</b> return #ERROR_DEVICE_LOST. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#devsandqueues-lost-device">Lost Device</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code fence} is not #NULL_HANDLE, {@code fence} <b>must</b> be unsignaled</li>
            <li>If {@code fence} is not #NULL_HANDLE, {@code fence} <b>must</b> not be associated with any other queue command that has not yet completed execution on that queue</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
            <li>If a command recorded into the {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} referenced an {@code VkEvent}, that event <b>must</b> not be referenced by a command that has been submitted to another queue and is still in the <em>pending state</em></li>
            <li>The {@code semaphore} member of any binary semaphore element of the {@code pSignalSemaphoreInfos} member of any element of {@code pSubmits} <b>must</b> be unsignaled when the semaphore signal operation it defines is executed on the device</li>
            <li>The {@code stageMask} member of any element of the {@code pSignalSemaphoreInfos} member of any element of {@code pSubmits} <b>must</b> only include pipeline stages that are supported by the queue family which {@code queue} belongs to</li>
            <li>The {@code stageMask} member of any element of the {@code pWaitSemaphoreInfos} member of any element of {@code pSubmits} <b>must</b> only include pipeline stages that are supported by the queue family which {@code queue} belongs to</li>
            <li>When a semaphore wait operation for a binary semaphore is executed, as defined by the {@code semaphore} member of any element of the {@code pWaitSemaphoreInfos} member of any element of {@code pSubmits}, there <b>must</b> be no other queues waiting on the same semaphore</li>
            <li>The {@code semaphore} member of any element of the {@code pWaitSemaphoreInfos} member of any element of {@code pSubmits} <b>must</b> be semaphores that are signaled, or have <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-semaphores-signaling">semaphore signal operations</a> previously submitted for execution</li>
            <li>Any {@code semaphore} member of any element of the {@code pWaitSemaphoreInfos} member of any element of {@code pSubmits} that was created with a {@code VkSemaphoreTypeKHR} of #SEMAPHORE_TYPE_BINARY_KHR <b>must</b> reference a semaphore signal operation that has been submitted for execution and any semaphore signal operations on which it depends (if any) <b>must</b> have also been submitted for execution</li>
            <li>The {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending or executable state</a></li>
            <li>If a command recorded into the {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} was not recorded with the #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT, it <b>must</b> not be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending state</a></li>
            <li>Any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-secondary">secondary command buffers recorded</a> into the {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending or executable state</a></li>
            <li>If any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-secondary">secondary command buffers recorded</a> into the {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} was not recorded with the #COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT, it <b>must</b> not be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">pending state</a></li>
            <li>The {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} <b>must</b> have been allocated from a {@code VkCommandPool} that was created for the same queue family {@code queue} belongs to</li>
            <li>If a command recorded into the {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} includes a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-queue-transfers-acquire">Queue Family Transfer Acquire Operation</a>, there <b>must</b> exist a previously submitted <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-queue-transfers-release">Queue Family Transfer Release Operation</a> on a queue in the queue family identified by the acquire operation, with parameters matching the acquire operation as defined in the definition of such <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-queue-transfers-acquire">acquire operations</a>, and which happens before the acquire operation</li>
            <li>If a command recorded into the {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} was a #CmdBeginQuery() whose {@code queryPool} was created with a {@code queryType} of #QUERY_TYPE_PERFORMANCE_QUERY_KHR, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#profiling-lock">profiling lock</a> <b>must</b> have been held continuously on the {@code VkDevice} that {@code queue} was retrieved from, throughout recording of those command buffers</li>
            <li>If {@code queue} was not created with #DEVICE_QUEUE_CREATE_PROTECTED_BIT, the {@code flags} member of any element of {@code pSubmits} <b>must</b> not include #SUBMIT_PROTECTED_BIT_KHR</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
            <li>If {@code submitCount} is not 0, {@code pSubmits} <b>must</b> be a valid pointer to an array of {@code submitCount} valid ##VkSubmitInfo2 structures</li>
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
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
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
        ##VkSubmitInfo2
        """,

        VkQueue("queue", "the queue that the command buffers will be submitted to."),
        AutoSize("pSubmits")..uint32_t("submitCount", "the number of elements in the {@code pSubmits} array."),
        nullable..VkSubmitInfo2.const.p("pSubmits", "a pointer to an array of ##VkSubmitInfo2 structures, each specifying a command buffer submission batch."),
        VkFence("fence", "an <b>optional</b> handle to a fence to be signaled once all submitted command buffers have completed execution. If {@code fence} is not #NULL_HANDLE, it defines a <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#synchronization-fences-signaling\">fence signal operation</a>.")
    )

    // Promoted from VK_KHR_copy_commands2 (extension 338)

    void(
        "CmdCopyBuffer2",
        """
        Copy data between buffer regions.

        <h5>C Specification</h5>
        To copy data between buffer objects, call:

        <pre><code>
￿void vkCmdCopyBuffer2(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkCopyBufferInfo2*                    pCopyBufferInfo);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdCopyBuffer2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkCopyBufferInfo2*                    pCopyBufferInfo);</code></pre>

        <h5>Description</h5>
        This command is functionally identical to #CmdCopyBuffer(), but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code srcBuffer} <b>must</b> not be a protected buffer</li>
            <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code dstBuffer} <b>must</b> not be a protected buffer</li>
            <li>If {@code commandBuffer} is a protected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code dstBuffer} <b>must</b> not be an unprotected buffer</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pCopyBufferInfo} <b>must</b> be a valid pointer to a valid ##VkCopyBufferInfo2 structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer Graphics Compute</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkCopyBufferInfo2
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCopyBufferInfo2.const.p("pCopyBufferInfo", "a pointer to a ##VkCopyBufferInfo2 structure describing the copy parameters.")
    )

    void(
        "CmdCopyImage2",
        """
        Copy data between images.

        <h5>C Specification</h5>
        To copy data between image objects, call:

        <pre><code>
￿void vkCmdCopyImage2(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkCopyImageInfo2*                     pCopyImageInfo);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdCopyImage2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkCopyImageInfo2*                     pCopyImageInfo);</code></pre>

        <h5>Description</h5>
        This command is functionally identical to #CmdCopyImage(), but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code srcImage} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code dstImage} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is a protected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code dstImage} <b>must</b> not be an unprotected image</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pCopyImageInfo} <b>must</b> be a valid pointer to a valid ##VkCopyImageInfo2 structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer Graphics Compute</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkCopyImageInfo2
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCopyImageInfo2.const.p("pCopyImageInfo", "a pointer to a ##VkCopyImageInfo2 structure describing the copy parameters.")
    )

    void(
        "CmdCopyBufferToImage2",
        """
        Copy data from a buffer into an image.

        <h5>C Specification</h5>
        To copy data from a buffer object to an image object, call:

        <pre><code>
￿void vkCmdCopyBufferToImage2(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkCopyBufferToImageInfo2*             pCopyBufferToImageInfo);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdCopyBufferToImage2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkCopyBufferToImageInfo2*             pCopyBufferToImageInfo);</code></pre>

        <h5>Description</h5>
        This command is functionally identical to #CmdCopyBufferToImage(), but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code srcBuffer} <b>must</b> not be a protected buffer</li>
            <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code dstImage} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is a protected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code dstImage} <b>must</b> not be an unprotected image</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pCopyBufferToImageInfo} <b>must</b> be a valid pointer to a valid ##VkCopyBufferToImageInfo2 structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer Graphics Compute</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkCopyBufferToImageInfo2
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCopyBufferToImageInfo2.const.p("pCopyBufferToImageInfo", "a pointer to a ##VkCopyBufferToImageInfo2 structure describing the copy parameters.")
    )

    void(
        "CmdCopyImageToBuffer2",
        """
        Copy image data into a buffer.

        <h5>C Specification</h5>
        To copy data from an image object to a buffer object, call:

        <pre><code>
￿void vkCmdCopyImageToBuffer2(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkCopyImageToBufferInfo2*             pCopyImageToBufferInfo);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdCopyImageToBuffer2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkCopyImageToBufferInfo2*             pCopyImageToBufferInfo);</code></pre>

        <h5>Description</h5>
        This command is functionally identical to #CmdCopyImageToBuffer(), but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code srcImage} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code dstBuffer} <b>must</b> not be a protected buffer</li>
            <li>If {@code commandBuffer} is a protected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code dstBuffer} <b>must</b> not be an unprotected buffer</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pCopyImageToBufferInfo} <b>must</b> be a valid pointer to a valid ##VkCopyImageToBufferInfo2 structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Transfer Graphics Compute</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkCopyImageToBufferInfo2
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCopyImageToBufferInfo2.const.p("pCopyImageToBufferInfo", "a pointer to a ##VkCopyImageToBufferInfo2 structure describing the copy parameters.")
    )

    void(
        "CmdBlitImage2",
        """
        Copy regions of an image, potentially performing format conversion,.

        <h5>C Specification</h5>
        To copy regions of a source image into a destination image, potentially performing format conversion, arbitrary scaling, and filtering, call:

        <pre><code>
￿void vkCmdBlitImage2(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkBlitImageInfo2*                     pBlitImageInfo);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdBlitImage2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkBlitImageInfo2*                     pBlitImageInfo);</code></pre>

        <h5>Description</h5>
        This command is functionally identical to #CmdBlitImage(), but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code srcImage} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code dstImage} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is a protected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code dstImage} <b>must</b> not be an unprotected image</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pBlitImageInfo} <b>must</b> be a valid pointer to a valid ##VkBlitImageInfo2 structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkBlitImageInfo2
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBlitImageInfo2.const.p("pBlitImageInfo", "a pointer to a ##VkBlitImageInfo2 structure describing the blit parameters.")
    )

    void(
        "CmdResolveImage2",
        """
        Resolve regions of an image.

        <h5>C Specification</h5>
        To resolve a multisample image to a non-multisample image, call:

        <pre><code>
￿void vkCmdResolveImage2(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkResolveImageInfo2*                  pResolveImageInfo);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdResolveImage2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkResolveImageInfo2*                  pResolveImageInfo);</code></pre>

        <h5>Description</h5>
        This command is functionally identical to #CmdResolveImage(), but includes extensible sub-structures that include {@code sType} and {@code pNext} parameters, allowing them to be more easily extended.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code srcImage} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code dstImage} <b>must</b> not be a protected image</li>
            <li>If {@code commandBuffer} is a protected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, {@code dstImage} <b>must</b> not be an unprotected image</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pResolveImageInfo} <b>must</b> be a valid pointer to a valid ##VkResolveImageInfo2 structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkResolveImageInfo2
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkResolveImageInfo2.const.p("pResolveImageInfo", "a pointer to a ##VkResolveImageInfo2 structure describing the resolve parameters.")
    )

    // Promoted from VK_KHR_dynamic_rendering (extension 45)

    void(
        "CmdBeginRendering",
        """
        Begin a dynamic render pass instance.

        <h5>C Specification</h5>
        To begin a render pass instance, call:

        <pre><code>
￿void vkCmdBeginRendering(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkRenderingInfo*                      pRenderingInfo);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdBeginRenderingKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkRenderingInfo*                      pRenderingInfo);</code></pre>

        <h5>Description</h5>
        After beginning a render pass instance, the command buffer is ready to record <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#drawing">draw commands</a>.

        If {@code pRenderingInfo→flags} includes #RENDERING_RESUMING_BIT then this render pass is resumed from a render pass instance that has been suspended earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-dynamicRendering">{@code dynamicRendering}</a> feature <b>must</b> be enabled</li>
            <li>If {@code commandBuffer} is a secondary command buffer, {@code pRenderingInfo→flags} <b>must</b> not include #RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pRenderingInfo} <b>must</b> be a valid pointer to a valid ##VkRenderingInfo structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkRenderingInfo
        """,

        VkCommandBuffer("commandBuffer", "the command buffer in which to record the command."),
        VkRenderingInfo.const.p("pRenderingInfo", "a pointer to a ##VkRenderingInfo structure specifying details of the render pass instance to begin.")
    )

    void(
        "CmdEndRendering",
        """
        End a dynamic render pass instance.

        <h5>C Specification</h5>
        To end a render pass instance, call:

        <pre><code>
￿void vkCmdEndRendering(
￿    VkCommandBuffer                             commandBuffer);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdEndRenderingKHR(
￿    VkCommandBuffer                             commandBuffer);</code></pre>

        <h5>Description</h5>
        If the value of {@code pRenderingInfo→flags} used to begin this render pass instance included #RENDERING_SUSPENDING_BIT, then this render pass is suspended and will be resumed later in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-submission-order">submission order</a>.

        <h5>Valid Usage</h5>
        <ul>
            <li>The current render pass instance <b>must</b> have been begun with #CmdBeginRendering()</li>
            <li>The current render pass instance <b>must</b> have been begun in {@code commandBuffer}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer in which to record the command.")
    )

    // Promoted from VK_EXT_extended_dynamic_state (Feature struct is not promoted) (extension 268)

    void(
        "CmdSetCullMode",
        """
        Set cull mode dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the cull mode, call:

        <pre><code>
￿void vkCmdSetCullMode(
￿    VkCommandBuffer                             commandBuffer,
￿    VkCullModeFlags                             cullMode);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdSetCullModeEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkCullModeFlags                             cullMode);</code></pre>

        <h5>Description</h5>
        This command sets the cull mode for subsequent drawing commands when the graphics pipeline is created with #DYNAMIC_STATE_CULL_MODE set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineRasterizationStateCreateInfo{@code ::cullMode} value used to create the currently active pipeline.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code cullMode} <b>must</b> be a valid combination of {@code VkCullModeFlagBits} values</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCullModeFlags("cullMode", "specifies the cull mode property to use for drawing.")
    )

    void(
        "CmdSetFrontFace",
        """
        Set front face orientation dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the front face orientation, call:

        <pre><code>
￿void vkCmdSetFrontFace(
￿    VkCommandBuffer                             commandBuffer,
￿    VkFrontFace                                 frontFace);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdSetFrontFaceEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkFrontFace                                 frontFace);</code></pre>

        <h5>Description</h5>
        This command sets the front face orientation for subsequent drawing commands when the graphics pipeline is created with #DYNAMIC_STATE_FRONT_FACE set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineRasterizationStateCreateInfo{@code ::frontFace} value used to create the currently active pipeline.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code frontFace} <b>must</b> be a valid {@code VkFrontFace} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkFrontFace("frontFace", "a {@code VkFrontFace} value specifying the front-facing triangle orientation to be used for culling.")
    )

    void(
        "CmdSetPrimitiveTopology",
        """
        Set primitive topology state dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> primitive topology, call:

        <pre><code>
￿void vkCmdSetPrimitiveTopology(
￿    VkCommandBuffer                             commandBuffer,
￿    VkPrimitiveTopology                         primitiveTopology);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdSetPrimitiveTopologyEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkPrimitiveTopology                         primitiveTopology);</code></pre>

        <h5>Description</h5>
        This command sets the primitive topology for subsequent drawing commands when the graphics pipeline is created with #DYNAMIC_STATE_PRIMITIVE_TOPOLOGY set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineInputAssemblyStateCreateInfo{@code ::topology} value used to create the currently active pipeline.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code primitiveTopology} <b>must</b> be a valid {@code VkPrimitiveTopology} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkPrimitiveTopology("primitiveTopology", "specifies the primitive topology to use for drawing.")
    )

    void(
        "CmdSetViewportWithCount",
        """
        Set the viewport count and viewports dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the viewport count and viewports, call:

        <pre><code>
￿void vkCmdSetViewportWithCount(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    viewportCount,
￿    const VkViewport*                           pViewports);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdSetViewportWithCountEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    viewportCount,
￿    const VkViewport*                           pViewports);</code></pre>

        <h5>Description</h5>
        This command sets the viewport count and viewports state for subsequent drawing commands when the graphics pipeline is created with #DYNAMIC_STATE_VIEWPORT_WITH_COUNT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the corresponding ##VkPipelineViewportStateCreateInfo{@code ::viewportCount} and {@code pViewports} values used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code viewportCount} <b>must</b> be between 1 and ##VkPhysicalDeviceLimits{@code ::maxViewports}, inclusive</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multiViewport">multiple viewports</a> feature is not enabled, {@code viewportCount} <b>must</b> be 1</li>
            <li>{@code commandBuffer} <b>must</b> not have ##VkCommandBufferInheritanceViewportScissorInfoNV{@code ::viewportScissor2D} enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pViewports} <b>must</b> be a valid pointer to an array of {@code viewportCount} valid ##VkViewport structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>{@code viewportCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkViewport
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        AutoSize("pViewports")..uint32_t("viewportCount", "specifies the viewport count."),
        VkViewport.const.p("pViewports", "specifies the viewports to use for drawing.")
    )

    void(
        "CmdSetScissorWithCount",
        """
        Set the scissor count and scissor rectangular bounds dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the scissor count and scissor rectangular bounds, call:

        <pre><code>
￿void vkCmdSetScissorWithCount(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    scissorCount,
￿    const VkRect2D*                             pScissors);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdSetScissorWithCountEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    scissorCount,
￿    const VkRect2D*                             pScissors);</code></pre>

        <h5>Description</h5>
        This command sets the scissor count and scissor rectangular bounds state for subsequence drawing commands when the graphics pipeline is created with #DYNAMIC_STATE_SCISSOR_WITH_COUNT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the corresponding ##VkPipelineViewportStateCreateInfo{@code ::scissorCount} and {@code pScissors} values used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code scissorCount} <b>must</b> be between 1 and ##VkPhysicalDeviceLimits{@code ::maxViewports}, inclusive</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multiViewport">multiple viewports</a> feature is not enabled, {@code scissorCount} <b>must</b> be 1</li>
            <li>The {@code x} and {@code y} members of {@code offset} member of any element of {@code pScissors} <b>must</b> be greater than or equal to 0</li>
            <li>Evaluation of <code>(offset.x + extent.width)</code> <b>must</b> not cause a signed integer addition overflow for any element of {@code pScissors}</li>
            <li>Evaluation of <code>(offset.y + extent.height)</code> <b>must</b> not cause a signed integer addition overflow for any element of {@code pScissors}</li>
            <li>{@code commandBuffer} <b>must</b> not have ##VkCommandBufferInheritanceViewportScissorInfoNV{@code ::viewportScissor2D} enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pScissors} <b>must</b> be a valid pointer to an array of {@code scissorCount} ##VkRect2D structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>{@code scissorCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkRect2D
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        AutoSize("pScissors")..uint32_t("scissorCount", "specifies the scissor count."),
        VkRect2D.const.p("pScissors", "specifies the scissors to use for drawing.")
    )

    void(
        "CmdBindVertexBuffers2",
        """
        Bind vertex buffers to a command buffer and dynamically set strides.

        <h5>C Specification</h5>
        Alternatively, to bind vertex buffers, along with their sizes and strides, to a command buffer for use in subsequent drawing commands, call:

        <pre><code>
￿void vkCmdBindVertexBuffers2(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    firstBinding,
￿    uint32_t                                    bindingCount,
￿    const VkBuffer*                             pBuffers,
￿    const VkDeviceSize*                         pOffsets,
￿    const VkDeviceSize*                         pSizes,
￿    const VkDeviceSize*                         pStrides);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdBindVertexBuffers2EXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    firstBinding,
￿    uint32_t                                    bindingCount,
￿    const VkBuffer*                             pBuffers,
￿    const VkDeviceSize*                         pOffsets,
￿    const VkDeviceSize*                         pSizes,
￿    const VkDeviceSize*                         pStrides);</code></pre>

        <h5>Description</h5>
        The values taken from elements <code>i</code> of {@code pBuffers} and {@code pOffsets} replace the current state for the vertex input binding <code>firstBinding + i</code>, for <code>i</code> in <code>[0, bindingCount)</code>. The vertex input binding is updated to start at the offset indicated by {@code pOffsets}[i] from the start of the buffer {@code pBuffers}[i]. If {@code pSizes} is not {@code NULL} then {@code pSizes}[i] specifies the bound size of the vertex buffer starting from the corresponding elements of {@code pBuffers}[i] plus {@code pOffsets}[i]. All vertex input attributes that use each of these bindings will use these updated addresses in their address calculations for subsequent drawing commands. If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-nullDescriptor">nullDescriptor</a> feature is enabled, elements of {@code pBuffers} <b>can</b> be #NULL_HANDLE, and <b>can</b> be used by the vertex shader. If a vertex input attribute is bound to a vertex input binding that is #NULL_HANDLE, the values taken from memory are considered to be zero, and missing G, B, or A components are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#fxvertex-input-extraction">filled with <code>(0,0,1)</code></a>.

        This command also <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically sets</a> the byte strides between consecutive elements within buffer {@code pBuffers}[i] to the corresponding {@code pStrides}[i] value when the graphics pipeline is created with #DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, strides are specified by the ##VkVertexInputBindingDescription{@code ::stride} values used to create the currently active pipeline.

        If the bound pipeline state object was also created with the #DYNAMIC_STATE_VERTEX_INPUT_EXT dynamic state enabled then #CmdSetVertexInputEXT() <b>can</b> be used instead of {@code vkCmdBindVertexBuffers2} to set the stride.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code firstBinding} <b>must</b> be less than ##VkPhysicalDeviceLimits{@code ::maxVertexInputBindings}</li>
            <li>The sum of {@code firstBinding} and {@code bindingCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxVertexInputBindings}</li>
            <li>All elements of {@code pOffsets} <b>must</b> be less than the size of the corresponding element in {@code pBuffers}</li>
            <li>If {@code pSizes} is not {@code NULL}, all elements of {@code pOffsets} plus {@code pSizes} <b>must</b> be less than or equal to the size of the corresponding element in {@code pBuffers}</li>
            <li>All elements of {@code pBuffers} <b>must</b> have been created with the #BUFFER_USAGE_VERTEX_BUFFER_BIT flag</li>
            <li>Each element of {@code pBuffers} that is non-sparse <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-nullDescriptor">nullDescriptor</a> feature is not enabled, all elements of {@code pBuffers} <b>must</b> not be #NULL_HANDLE</li>
            <li>If an element of {@code pBuffers} is #NULL_HANDLE, then the corresponding element of {@code pOffsets} <b>must</b> be zero</li>
            <li>If {@code pStrides} is not {@code NULL} each element of {@code pStrides} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxVertexInputBindingStride}</li>
            <li>If {@code pStrides} is not {@code NULL} each element of {@code pStrides} <b>must</b> be either 0 or greater than or equal to the maximum extent of all vertex input attributes fetched from the corresponding binding, where the extent is calculated as the ##VkVertexInputAttributeDescription{@code ::offset} plus ##VkVertexInputAttributeDescription{@code ::format} size</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pBuffers} <b>must</b> be a valid pointer to an array of {@code bindingCount} valid or #NULL_HANDLE {@code VkBuffer} handles</li>
            <li>{@code pOffsets} <b>must</b> be a valid pointer to an array of {@code bindingCount} {@code VkDeviceSize} values</li>
            <li>If {@code pSizes} is not {@code NULL}, {@code pSizes} <b>must</b> be a valid pointer to an array of {@code bindingCount} {@code VkDeviceSize} values</li>
            <li>If {@code pStrides} is not {@code NULL}, {@code pStrides} <b>must</b> be a valid pointer to an array of {@code bindingCount} {@code VkDeviceSize} values</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>If any of {@code pSizes}, or {@code pStrides} are not {@code NULL}, {@code bindingCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code commandBuffer}, and the elements of {@code pBuffers} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        uint32_t("firstBinding", "the index of the first vertex input binding whose state is updated by the command."),
        AutoSize("pBuffers", "pOffsets", "pSizes", "pStrides")..uint32_t("bindingCount", "the number of vertex input bindings whose state is updated by the command."),
        VkBuffer.const.p("pBuffers", "a pointer to an array of buffer handles."),
        VkDeviceSize.const.p("pOffsets", "a pointer to an array of buffer offsets."),
        nullable..VkDeviceSize.const.p("pSizes", "{@code NULL} or a pointer to an array of the size in bytes of vertex data bound from {@code pBuffers}."),
        nullable..VkDeviceSize.const.p("pStrides", "{@code NULL} or a pointer to an array of buffer strides.")
    )

    void(
        "CmdSetDepthTestEnable",
        """
        Set depth test enable dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically enable or disable</a> the depth test, call:

        <pre><code>
￿void vkCmdSetDepthTestEnable(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    depthTestEnable);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdSetDepthTestEnableEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    depthTestEnable);</code></pre>

        <h5>Description</h5>
        This command sets the depth test enable for subsequent drawing commands when the graphics pipeline is created with #DYNAMIC_STATE_DEPTH_TEST_ENABLE set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineDepthStencilStateCreateInfo{@code ::depthTestEnable} value used to create the currently active pipeline.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("depthTestEnable", "specifies if the depth test is enabled.")
    )

    void(
        "CmdSetDepthWriteEnable",
        """
        Set depth write enable dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the depth write enable, call:

        <pre><code>
￿void vkCmdSetDepthWriteEnable(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    depthWriteEnable);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdSetDepthWriteEnableEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    depthWriteEnable);</code></pre>

        <h5>Description</h5>
        This command sets the depth write enable for subsequent drawing commands when the graphics pipeline is created with #DYNAMIC_STATE_DEPTH_WRITE_ENABLE set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineDepthStencilStateCreateInfo{@code ::depthWriteEnable} value used to create the currently active pipeline.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("depthWriteEnable", "specifies if depth writes are enabled.")
    )

    void(
        "CmdSetDepthCompareOp",
        """
        Set depth comparison operator dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the depth compare operator, call:

        <pre><code>
￿void vkCmdSetDepthCompareOp(
￿    VkCommandBuffer                             commandBuffer,
￿    VkCompareOp                                 depthCompareOp);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdSetDepthCompareOpEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkCompareOp                                 depthCompareOp);</code></pre>

        <h5>Description</h5>
        This command sets the depth comparison operator for subsequent drawing commands when the graphics pipeline is created with #DYNAMIC_STATE_DEPTH_COMPARE_OP set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineDepthStencilStateCreateInfo{@code ::depthCompareOp} value used to create the currently active pipeline.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code depthCompareOp} <b>must</b> be a valid {@code VkCompareOp} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCompareOp("depthCompareOp", "specifies the depth comparison operator.")
    )

    void(
        "CmdSetDepthBoundsTestEnable",
        """
        Set depth bounds test enable dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically enable or disable</a> the depth bounds test, call:

        <pre><code>
￿void vkCmdSetDepthBoundsTestEnable(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    depthBoundsTestEnable);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdSetDepthBoundsTestEnableEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    depthBoundsTestEnable);</code></pre>

        <h5>Description</h5>
        This command sets the depth bounds enable for subsequent drawing commands when the graphics pipeline is created with #DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineDepthStencilStateCreateInfo{@code ::depthBoundsTestEnable} value used to create the currently active pipeline.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("depthBoundsTestEnable", "specifies if the depth bounds test is enabled.")
    )

    void(
        "CmdSetStencilTestEnable",
        """
        Set stencil test enable dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically enable or disable</a> the stencil test, call:

        <pre><code>
￿void vkCmdSetStencilTestEnable(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    stencilTestEnable);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdSetStencilTestEnableEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    stencilTestEnable);</code></pre>

        <h5>Description</h5>
        This command sets the stencil test enable for subsequent drawing commands when the graphics pipeline is created with #DYNAMIC_STATE_STENCIL_TEST_ENABLE set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineDepthStencilStateCreateInfo{@code ::stencilTestEnable} value used to create the currently active pipeline.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("stencilTestEnable", "specifies if the stencil test is enabled.")
    )

    void(
        "CmdSetStencilOp",
        """
        Set stencil operation dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the stencil operation, call:

        <pre><code>
￿void vkCmdSetStencilOp(
￿    VkCommandBuffer                             commandBuffer,
￿    VkStencilFaceFlags                          faceMask,
￿    VkStencilOp                                 failOp,
￿    VkStencilOp                                 passOp,
￿    VkStencilOp                                 depthFailOp,
￿    VkCompareOp                                 compareOp);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdSetStencilOpEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkStencilFaceFlags                          faceMask,
￿    VkStencilOp                                 failOp,
￿    VkStencilOp                                 passOp,
￿    VkStencilOp                                 depthFailOp,
￿    VkCompareOp                                 compareOp);</code></pre>

        <h5>Description</h5>
        This command sets the stencil operation for subsequent drawing commands when the graphics pipeline is created with #DYNAMIC_STATE_STENCIL_OP set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the corresponding ##VkPipelineDepthStencilStateCreateInfo{@code ::failOp}, {@code passOp}, {@code depthFailOp}, and {@code compareOp} values used to create the currently active pipeline, for both front and back faces.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code faceMask} <b>must</b> be a valid combination of {@code VkStencilFaceFlagBits} values</li>
            <li>{@code faceMask} <b>must</b> not be 0</li>
            <li>{@code failOp} <b>must</b> be a valid {@code VkStencilOp} value</li>
            <li>{@code passOp} <b>must</b> be a valid {@code VkStencilOp} value</li>
            <li>{@code depthFailOp} <b>must</b> be a valid {@code VkStencilOp} value</li>
            <li>{@code compareOp} <b>must</b> be a valid {@code VkCompareOp} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkStencilFaceFlags("faceMask", "a bitmask of {@code VkStencilFaceFlagBits} specifying the set of stencil state for which to update the stencil operation."),
        VkStencilOp("failOp", "a {@code VkStencilOp} value specifying the action performed on samples that fail the stencil test."),
        VkStencilOp("passOp", "a {@code VkStencilOp} value specifying the action performed on samples that pass both the depth and stencil tests."),
        VkStencilOp("depthFailOp", "a {@code VkStencilOp} value specifying the action performed on samples that pass the stencil test and fail the depth test."),
        VkCompareOp("compareOp", "a {@code VkCompareOp} value specifying the comparison operator used in the stencil test.")
    )

    // Promoted from VK_EXT_extended_dynamic_state2 (Feature struct and optional state are not promoted) (extension 378)

    void(
        "CmdSetRasterizerDiscardEnable",
        """
        Control whether primitives are discarded before the rasterization stage dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically enable</a> whether primitives are discarded before the rasterization stage, call:

        <pre><code>
￿void vkCmdSetRasterizerDiscardEnable(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    rasterizerDiscardEnable);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdSetRasterizerDiscardEnableEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    rasterizerDiscardEnable);</code></pre>

        <h5>Description</h5>
        This command sets the discard enable for subsequent drawing commands when the graphics pipeline is created with #DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineRasterizationStateCreateInfo{@code ::rasterizerDiscardEnable} value used to create the currently active pipeline.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("rasterizerDiscardEnable", "controls whether primitives are discarded immediately before the rasterization stage.")
    )

    void(
        "CmdSetDepthBiasEnable",
        """
        Control whether to bias fragment depth values dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically enable</a> whether to bias fragment depth values, call:

        <pre><code>
￿void vkCmdSetDepthBiasEnable(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    depthBiasEnable);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdSetDepthBiasEnableEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    depthBiasEnable);</code></pre>

        <h5>Description</h5>
        This command sets the depth bias enable for subsequent drawing commands when the graphics pipeline is created with #DYNAMIC_STATE_DEPTH_BIAS_ENABLE set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineRasterizationStateCreateInfo{@code ::depthBiasEnable} value used to create the currently active pipeline.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("depthBiasEnable", "controls whether to bias fragment depth values.")
    )

    void(
        "CmdSetPrimitiveRestartEnable",
        """
        Set primitive assembly restart state dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically control</a> whether a special vertex index value is treated as restarting the assembly of primitives, call:

        <pre><code>
￿void vkCmdSetPrimitiveRestartEnable(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    primitiveRestartEnable);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdSetPrimitiveRestartEnableEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    primitiveRestartEnable);</code></pre>

        <h5>Description</h5>
        This command sets the primitive restart enable for subsequent drawing commands when the graphics pipeline is created with #DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineInputAssemblyStateCreateInfo{@code ::primitiveRestartEnable} value used to create the currently active pipeline.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("primitiveRestartEnable", "controls whether a special vertex index value is treated as restarting the assembly of primitives. It behaves in the same way as ##VkPipelineInputAssemblyStateCreateInfo{@code ::primitiveRestartEnable}")
    )

    // Promoted from VK_KHR_maintenance4 (extension 414)

    void(
        "GetDeviceBufferMemoryRequirements",
        """
        Returns the memory requirements for specified Vulkan object.

        <h5>C Specification</h5>
        To determine the memory requirements for a buffer resource without creating an object, call:

        <pre><code>
￿void vkGetDeviceBufferMemoryRequirements(
￿    VkDevice                                    device,
￿    const VkDeviceBufferMemoryRequirements*     pInfo,
￿    VkMemoryRequirements2*                      pMemoryRequirements);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkGetDeviceBufferMemoryRequirementsKHR(
￿    VkDevice                                    device,
￿    const VkDeviceBufferMemoryRequirements*     pInfo,
￿    VkMemoryRequirements2*                      pMemoryRequirements);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkDeviceBufferMemoryRequirements structure</li>
            <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a ##VkMemoryRequirements2 structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkDeviceBufferMemoryRequirements, ##VkMemoryRequirements2
        """,

        VkDevice("device", "the logical device intended to own the buffer."),
        VkDeviceBufferMemoryRequirements.const.p("pInfo", "a pointer to a ##VkDeviceBufferMemoryRequirements structure containing parameters required for the memory requirements query."),
        VkMemoryRequirements2.p("pMemoryRequirements", "a pointer to a ##VkMemoryRequirements2 structure in which the memory requirements of the buffer object are returned.")
    )

    void(
        "GetDeviceImageMemoryRequirements",
        """
        Returns the memory requirements for specified Vulkan object.

        <h5>C Specification</h5>
        To determine the memory requirements for an image resource without creating an object, call:

        <pre><code>
￿void vkGetDeviceImageMemoryRequirements(
￿    VkDevice                                    device,
￿    const VkDeviceImageMemoryRequirements*      pInfo,
￿    VkMemoryRequirements2*                      pMemoryRequirements);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkGetDeviceImageMemoryRequirementsKHR(
￿    VkDevice                                    device,
￿    const VkDeviceImageMemoryRequirements*      pInfo,
￿    VkMemoryRequirements2*                      pMemoryRequirements);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkDeviceImageMemoryRequirements structure</li>
            <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a ##VkMemoryRequirements2 structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkDeviceImageMemoryRequirements, ##VkMemoryRequirements2
        """,

        VkDevice("device", "the logical device intended to own the image."),
        VkDeviceImageMemoryRequirements.const.p("pInfo", "a pointer to a ##VkDeviceImageMemoryRequirements structure containing parameters required for the memory requirements query."),
        VkMemoryRequirements2.p("pMemoryRequirements", "a pointer to a ##VkMemoryRequirements2 structure in which the memory requirements of the image object are returned.")
    )

    void(
        "GetDeviceImageSparseMemoryRequirements",
        """
        Query the memory requirements for a sparse image.

        <h5>C Specification</h5>
        To determine the sparse memory requirements for an image resource without creating an object, call:

        <pre><code>
￿void vkGetDeviceImageSparseMemoryRequirements(
￿    VkDevice                                    device,
￿    const VkDeviceImageMemoryRequirements*      pInfo,
￿    uint32_t*                                   pSparseMemoryRequirementCount,
￿    VkSparseImageMemoryRequirements2*           pSparseMemoryRequirements);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkGetDeviceImageSparseMemoryRequirementsKHR(
￿    VkDevice                                    device,
￿    const VkDeviceImageMemoryRequirements*      pInfo,
￿    uint32_t*                                   pSparseMemoryRequirementCount,
￿    VkSparseImageMemoryRequirements2*           pSparseMemoryRequirements);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkDeviceImageMemoryRequirements structure</li>
            <li>{@code pSparseMemoryRequirementCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pSparseMemoryRequirementCount} is not 0, and {@code pSparseMemoryRequirements} is not {@code NULL}, {@code pSparseMemoryRequirements} <b>must</b> be a valid pointer to an array of {@code pSparseMemoryRequirementCount} ##VkSparseImageMemoryRequirements2 structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkDeviceImageMemoryRequirements, ##VkSparseImageMemoryRequirements2
        """,

        VkDevice("device", "the logical device intended to own the image."),
        VkDeviceImageMemoryRequirements.const.p("pInfo", "a pointer to a ##VkDeviceImageMemoryRequirements structure containing parameters required for the memory requirements query."),
        AutoSize("pSparseMemoryRequirements")..Check(1)..uint32_t.p("pSparseMemoryRequirementCount", "a pointer to an integer related to the number of sparse memory requirements available or queried, as described below."),
        nullable..VkSparseImageMemoryRequirements2.p("pSparseMemoryRequirements", "either {@code NULL} or a pointer to an array of ##VkSparseImageMemoryRequirements2 structures.")
    )

}