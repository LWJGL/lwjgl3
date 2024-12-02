/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val VK14 = "VK14".nativeClass(Module.VULKAN, "VK14", prefix = "VK", binding = VK_BINDING_INSTANCE) {
    extends = VK13
    documentation =
        """
        The core Vulkan 1.4 functionality.
        """

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES".."55",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_PROPERTIES".."56"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO".."1000174000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES".."1000388000",
        "STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES".."1000388001"
    )

    EnumConstant(
        "Extends {@code VkResult}.",

        "ERROR_NOT_PERMITTED".."-1000174001"
    )

    EnumConstant(
        "Extends {@code VkAttachmentLoadOp}.",

        "ATTACHMENT_LOAD_OP_NONE".."1000400000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES".."1000416000"
    )

    EnumConstant(
        "Extends {@code VkSubgroupFeatureFlagBits}.",

        "SUBGROUP_FEATURE_ROTATE_BIT".enum(0x00000200),
        "SUBGROUP_FEATURE_ROTATE_CLUSTERED_BIT".enum(0x00000400)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT_CONTROLS_2_FEATURES".."1000528000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES".."1000544000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES".."1000259000",
        "STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO".."1000259001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES".."1000259002"
    )

    EnumConstant(
        "Extends {@code VkDynamicState}.",

        "DYNAMIC_STATE_LINE_STIPPLE".."1000259000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES".."1000525000",
        "STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO".."1000190001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES".."1000190002"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES".."1000265000"
    )

    EnumConstant(
        "Extends {@code VkIndexType}.",

        "INDEX_TYPE_UINT8".."1000265000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_MEMORY_MAP_INFO".."1000271000",
        "STRUCTURE_TYPE_MEMORY_UNMAP_INFO".."1000271001"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES".."1000470000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES".."1000470001",
        "STRUCTURE_TYPE_RENDERING_AREA_INFO".."1000470003",
        "STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO".."1000470004",
        "STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2".."1000338002",
        "STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2".."1000338003",
        "STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO".."1000470005",
        "STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO".."1000470006"
    )

    EnumConstant(
        "Extends {@code VkFormat}.",

        "FORMAT_A1B5G5R5_UNORM_PACK16".."1000470000",
        "FORMAT_A8_UNORM".."1000470001"
    )

    EnumConstantLong(
        "Extends {@code VkBufferUsageFlagBits2}.",

        "BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT".enum(0x00020000L)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES".."1000080000"
    )

    EnumConstant(
        "Extends {@code VkDescriptorSetLayoutCreateFlagBits}.",

        "DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT".enum(0x00000001)
    )

    EnumConstant(
        "Extends {@code VkDescriptorUpdateTemplateType}.",

        "DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS".."1"
    )

    EnumConstant(
        "Extends {@code VkImageLayout}.",

        "IMAGE_LAYOUT_RENDERING_LOCAL_READ".."1000232000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES".."1000232000",
        "STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO".."1000232001",
        "STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO".."1000232002"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES".."1000545000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES".."1000545001",
        "STRUCTURE_TYPE_BIND_MEMORY_STATUS".."1000545002",
        "STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO".."1000545003",
        "STRUCTURE_TYPE_PUSH_CONSTANTS_INFO".."1000545004",
        "STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO".."1000545005",
        "STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO".."1000545006"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES".."1000466000"
    )

    EnumConstant(
        "Extends {@code VkPipelineCreateFlagBits}.",

        "PIPELINE_CREATE_NO_PROTECTED_ACCESS_BIT".enum(0x08000000),
        "PIPELINE_CREATE_PROTECTED_ACCESS_ONLY_BIT".enum(0x40000000)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO".."1000068000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES".."1000068001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES".."1000068002"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES".."1000270000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES".."1000270001",
        "STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY".."1000270002",
        "STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY".."1000270003",
        "STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO".."1000270004",
        "STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO".."1000270005",
        "STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO".."1000270006",
        "STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO".."1000270007",
        "STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE".."1000270008",
        "STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY".."1000270009"
    )

    EnumConstant(
        "Extends {@code VkImageUsageFlagBits}.",

        "IMAGE_USAGE_HOST_TRANSFER_BIT".enum(0x00400000)
    )

    EnumConstantLong(
        "Extends {@code VkFormatFeatureFlagBits2}.",

        "FORMAT_FEATURE_2_HOST_IMAGE_TRANSFER_BIT".enum(0x400000000000L)
    )

    EnumConstant(
        """
        VkPipelineRobustnessBufferBehavior - Enum controlling the robustness of buffer accesses in a pipeline stage

        <h5>Description</h5>
        <ul>
            <li>#PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DEVICE_DEFAULT specifies that this pipeline stage follows the behavior of robustness features that are enabled that created this pipeline</li>
            <li>#PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DISABLED specifies that buffer accesses by this pipeline stage to the relevant resource types <b>must</b> not be out of bounds</li>
            <li>#PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS specifies that out of bounds accesses by this pipeline stage to the relevant resource types behave as if the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is enabled</li>
            <li>#PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2 specifies that out of bounds accesses by this pipeline stage to the relevant resource types behave as if the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#features-robustBufferAccess2">{@code robustBufferAccess2}</a> feature is enabled</li>
        </ul>

        <h5>See Also</h5>
        ##VkPhysicalDevicePipelineRobustnessProperties, ##VkPhysicalDeviceVulkan14Properties, ##VkPipelineRobustnessCreateInfo
        """,

        "PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DEVICE_DEFAULT".."0",
        "PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DISABLED".."1",
        "PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS".."2",
        "PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2".."3"
    )

    EnumConstant(
        """
        VkPipelineRobustnessImageBehavior - Enum controlling the robustness of image accesses in a pipeline stage

        <h5>Description</h5>
        <ul>
            <li>#PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DEVICE_DEFAULT specifies that this pipeline stage follows the behavior of robustness features that are enabled on the device that created this pipeline</li>
            <li>#PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DISABLED specifies that image accesses by this pipeline stage to the relevant resource types <b>must</b> not be out of bounds</li>
            <li>#PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS specifies that out of bounds accesses by this pipeline stage to images behave as if the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#features-robustImageAccess">{@code robustImageAccess}</a> feature is enabled</li>
            <li>#PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_2 specifies that out of bounds accesses by this pipeline stage to images behave as if the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#features-robustImageAccess2">{@code robustImageAccess2}</a> feature is enabled</li>
        </ul>

        <h5>See Also</h5>
        ##VkPhysicalDevicePipelineRobustnessProperties, ##VkPhysicalDeviceVulkan14Properties, ##VkPipelineRobustnessCreateInfo
        """,

        "PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DEVICE_DEFAULT".."0",
        "PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DISABLED".."1",
        "PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS".."2",
        "PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_2".."3"
    )

    EnumConstant(
        """
        VkQueueGlobalPriority - Values specifying a system-wide queue priority

        <h5>Description</h5>
        Priority values are sorted in ascending order. A comparison operation on the enum values can be used to determine the priority order.

        <ul>
            <li>#QUEUE_GLOBAL_PRIORITY_LOW is below the system default. Useful for non-interactive tasks.</li>
            <li>#QUEUE_GLOBAL_PRIORITY_MEDIUM is the system default priority.</li>
            <li>#QUEUE_GLOBAL_PRIORITY_HIGH is above the system default.</li>
            <li>#QUEUE_GLOBAL_PRIORITY_REALTIME is the highest priority. Useful for critical tasks.</li>
        </ul>

        <h5>See Also</h5>
        ##VkDeviceQueueGlobalPriorityCreateInfo, ##VkQueueFamilyGlobalPriorityProperties
        """,

        "QUEUE_GLOBAL_PRIORITY_LOW".."128",
        "QUEUE_GLOBAL_PRIORITY_MEDIUM".."256",
        "QUEUE_GLOBAL_PRIORITY_HIGH".."512",
        "QUEUE_GLOBAL_PRIORITY_REALTIME".."1024"
    )

    EnumConstant(
        """
        VkLineRasterizationMode - Line rasterization modes

        <h5>Description</h5>
        <ul>
            <li>#LINE_RASTERIZATION_MODE_DEFAULT is equivalent to #LINE_RASTERIZATION_MODE_RECTANGULAR if ##VkPhysicalDeviceLimits{@code ::strictLines} is #TRUE, otherwise lines are drawn as non-{@code strictLines} parallelograms. Both of these modes are defined in <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#primsrast-lines-basic">Basic Line Segment Rasterization</a>.</li>
            <li>#LINE_RASTERIZATION_MODE_RECTANGULAR specifies lines drawn as if they were rectangles extruded from the line</li>
            <li>#LINE_RASTERIZATION_MODE_BRESENHAM specifies lines drawn by determining which pixel diamonds the line intersects and exits, as defined in <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#primsrast-lines-bresenham">Bresenham Line Segment Rasterization</a>.</li>
            <li>#LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH specifies lines drawn if they were rectangles extruded from the line, with alpha falloff, as defined in <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#primsrast-lines-smooth">Smooth Lines</a>.</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineRasterizationLineStateCreateInfo, #CmdSetLineRasterizationModeEXT()
        """,

        "LINE_RASTERIZATION_MODE_DEFAULT".."0",
        "LINE_RASTERIZATION_MODE_RECTANGULAR".."1",
        "LINE_RASTERIZATION_MODE_BRESENHAM".."2",
        "LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH".."3"
    )

    EnumConstantLong(
        """
        VkPipelineCreateFlagBits2 - Bitmask controlling how a pipeline is created

        <h5>Description</h5>
        <ul>
            <li>#PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT specifies that the created pipeline will not be optimized. Using this flag <b>may</b> reduce the time taken to create the pipeline.</li>
            <li>#PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT specifies that the pipeline to be created is allowed to be the parent of a pipeline that will be created in a subsequent pipeline creation call.</li>
            <li>#PIPELINE_CREATE_2_DERIVATIVE_BIT specifies that the pipeline to be created will be a child of a previously created parent pipeline.</li>
            <li>#PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT specifies that any shader input variables decorated as {@code ViewIndex} will be assigned values as if they were decorated as {@code DeviceIndex}.</li>
            <li>#PIPELINE_CREATE_2_DISPATCH_BASE_BIT specifies that a compute pipeline <b>can</b> be used with #CmdDispatchBase() with a non-zero base workgroup.</li>
            <li>#PIPELINE_CREATE_2_DEFER_COMPILE_BIT_NV specifies that a pipeline is created with all shaders in the deferred state. Before using the pipeline the application <b>must</b> call #CompileDeferredNV() exactly once on each shader in the pipeline before using the pipeline.</li>
            <li>#PIPELINE_CREATE_2_CAPTURE_STATISTICS_BIT_KHR specifies that the shader compiler should capture statistics for the pipeline executables produced by the compile process which <b>can</b> later be retrieved by calling #GetPipelineExecutableStatisticsKHR(). Enabling this flag <b>must</b> not affect the final compiled pipeline but <b>may</b> disable pipeline caching or otherwise affect pipeline creation time.</li>
            <li>#PIPELINE_CREATE_2_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR specifies that the shader compiler should capture the internal representations of pipeline executables produced by the compile process which <b>can</b> later be retrieved by calling #GetPipelineExecutableInternalRepresentationsKHR(). Enabling this flag <b>must</b> not affect the final compiled pipeline but <b>may</b> disable pipeline caching or otherwise affect pipeline creation time. When capturing IR from pipelines created with pipeline libraries, there is no guarantee that IR from libraries <b>can</b> be retrieved from the linked pipeline. Applications <b>should</b> retrieve IR from each library, and any linked pipelines, separately.</li>
            <li>#PIPELINE_CREATE_2_LIBRARY_BIT_KHR specifies that the pipeline <b>cannot</b> be used directly, and instead defines a <em>pipeline library</em> that <b>can</b> be combined with other pipelines using the ##VkPipelineLibraryCreateInfoKHR structure. This is available in ray tracing and graphics pipelines.</li>
            <li>#PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR specifies that an any-hit shader will always be present when an any-hit shader would be executed. A NULL any-hit shader is an any-hit shader which is effectively #SHADER_UNUSED_KHR, such as from a shader group consisting entirely of zeros.</li>
            <li>#PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR specifies that a closest hit shader will always be present when a closest hit shader would be executed. A NULL closest hit shader is a closest hit shader which is effectively #SHADER_UNUSED_KHR, such as from a shader group consisting entirely of zeros.</li>
            <li>#PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR specifies that a miss shader will always be present when a miss shader would be executed. A NULL miss shader is a miss shader which is effectively #SHADER_UNUSED_KHR, such as from a shader group consisting entirely of zeros.</li>
            <li>#PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR specifies that an intersection shader will always be present when an intersection shader would be executed. A NULL intersection shader is an intersection shader which is effectively #SHADER_UNUSED_KHR, such as from a shader group consisting entirely of zeros.</li>
            <li>#PIPELINE_CREATE_2_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR specifies that triangle primitives will be skipped during traversal using <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#glossary-pipeline-trace-ray">pipeline trace ray</a> instructions.</li>
            <li>#PIPELINE_CREATE_2_RAY_TRACING_SKIP_AABBS_BIT_KHR specifies that AABB primitives will be skipped during traversal using <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#glossary-pipeline-trace-ray">pipeline trace ray</a> instructions.</li>
            <li>#PIPELINE_CREATE_2_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR specifies that the shader group handles <b>can</b> be saved and reused on a subsequent run (e.g. for trace capture and replay).</li>
            <li>#PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_NV specifies that the pipeline can be used in combination with <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#device-generated-commands">Device-Generated Commands</a>.</li>
            <li>#PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_EXT specifies that the pipeline <b>can</b> be used in a {@code VkIndirectExecutionSetEXT}.</li>
            <li>#PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT specifies that pipeline creation will fail if a compile is required for creation of a valid {@code VkPipeline} object; #PIPELINE_COMPILE_REQUIRED will be returned by pipeline creation, and the {@code VkPipeline} will be #NULL_HANDLE.</li>
            <li>When creating multiple pipelines, #PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT specifies that control will be returned to the application if any individual pipeline returns a result which is not #SUCCESS rather than continuing to create additional pipelines.</li>
            <li>#PIPELINE_CREATE_2_RAY_TRACING_ALLOW_MOTION_BIT_NV specifies that the pipeline is allowed to use {@code OpTraceRayMotionNV}.</li>
            <li>#PIPELINE_CREATE_2_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR specifies that the pipeline will be used with a fragment shading rate attachment.</li>
            <li>#PIPELINE_CREATE_2_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT specifies that the pipeline will be used with a fragment density map attachment.</li>
            <li>#PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT specifies that pipeline libraries being linked into this library <b>should</b> have link time optimizations applied. If this bit is omitted, implementations <b>should</b> instead perform linking as rapidly as possible.</li>
            <li>#PIPELINE_CREATE_2_RETAIN_LINK_TIME_OPTIMIZATION_INFO_BIT_EXT specifies that pipeline libraries should retain any information necessary to later perform an optimal link with #PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT.</li>
            <li>#PIPELINE_CREATE_2_DESCRIPTOR_BUFFER_BIT_EXT specifies that a pipeline will be used with <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#descriptorbuffers">descriptor buffers</a>, rather than <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#descriptorsets">descriptor sets</a>.</li>
            <li>#PIPELINE_CREATE_2_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT specifies that the pipeline <b>may</b> be used with an attachment feedback loop including color attachments.</li>
            <li>#PIPELINE_CREATE_2_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT specifies that the pipeline <b>may</b> be used with an attachment feedback loop including depth-stencil attachments.</li>
            <li>#PIPELINE_CREATE_2_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT specifies that the ray tracing pipeline <b>can</b> be used with acceleration structures which reference an opacity micromap array.</li>
            <li>#PIPELINE_CREATE_2_RAY_TRACING_DISPLACEMENT_MICROMAP_BIT_NV specifies that the ray tracing pipeline <b>can</b> be used with acceleration structures which reference a displacement micromap array.</li>
            <li>#PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT_EXT specifies that the pipeline <b>must</b> not be bound to a protected command buffer.</li>
            <li>#PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT_EXT specifies that the pipeline <b>must</b> not be bound to an unprotected command buffer.</li>
            <li>#PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR specifies that {@code VkPipelineBinaryKHR} objects <b>can</b> be created from the pipeline. If #PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR is used, implementations <b>should</b> not store pipeline data to an internal cache, if such a cache exists as stated by <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#limits-pipelineBinaryInternalCache">{@code pipelineBinaryInternalCache}</a>. If <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#limits-pipelineBinaryPrefersInternalCache">{@code pipelineBinaryPrefersInternalCache}</a> is #TRUE, applications <b>should</b> not use #PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR.</li>
            <li>#PIPELINE_CREATE_2_ENABLE_LEGACY_DITHERING_BIT_EXT specifies that the pipeline will be used in a render pass that is begun with #RENDERING_ENABLE_LEGACY_DITHERING_BIT_EXT.</li>
            <li>#PIPELINE_CREATE_2_EXECUTION_GRAPH_BIT_AMDX specifies that the pipeline will be used in an <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#executiongraphs">execution graph</a></li>
        </ul>

        It is valid to set both #PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT and #PIPELINE_CREATE_2_DERIVATIVE_BIT. This allows a pipeline to be both a parent and possibly a child in a pipeline hierarchy. See <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#pipelines-pipeline-derivatives">Pipeline Derivatives</a> for more information.

        When an implementation is looking up a pipeline in a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#pipelines-cache">pipeline cache</a>, if that pipeline is being created using linked libraries, implementations <b>should</b> always return an equivalent pipeline created with #PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT if available, whether or not that bit was specified.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Using #PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT (or not) when linking pipeline libraries is intended as a performance tradeoff between host and device. If the bit is omitted, linking should be faster and produce a pipeline more rapidly, but performance of the pipeline on the target device may be reduced. If the bit is included, linking may be slower but should produce a pipeline with device performance comparable to a monolithically created pipeline. Using both options can allow latency-sensitive applications to generate a suboptimal but usable pipeline quickly, and then perform an optimal link in the background, substituting the result for the suboptimally linked pipeline as soon as it is available.
        </div>
        """,

        "PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT".enum(0x00000001L),
        "PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT".enum(0x00000002L),
        "PIPELINE_CREATE_2_DERIVATIVE_BIT".enum(0x00000004L),
        "PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT".enum(0x00000008L),
        "PIPELINE_CREATE_2_DISPATCH_BASE_BIT".enum(0x00000010L),
        "PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT".enum(0x00000100L),
        "PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT".enum(0x00000200L),
        "PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT".enum(0x08000000L),
        "PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT".enum(0x40000000L)
    )

    EnumConstantLong(
        """
        VkBufferUsageFlagBits2 - Bitmask controlling how a pipeline is created

        <h5>Description</h5>
        <ul>
            <li>#BUFFER_USAGE_2_TRANSFER_SRC_BIT specifies that the buffer <b>can</b> be used as the source of a <em>transfer command</em> (see the definition of <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#synchronization-pipeline-stages-transfer">#PIPELINE_STAGE_TRANSFER_BIT</a>).</li>
            <li>#BUFFER_USAGE_2_TRANSFER_DST_BIT specifies that the buffer <b>can</b> be used as the destination of a transfer command.</li>
            <li>#BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT specifies that the buffer <b>can</b> be used to create a {@code VkBufferView} suitable for occupying a {@code VkDescriptorSet} slot of type #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER.</li>
            <li>#BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT specifies that the buffer <b>can</b> be used to create a {@code VkBufferView} suitable for occupying a {@code VkDescriptorSet} slot of type #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER.</li>
            <li>#BUFFER_USAGE_2_UNIFORM_BUFFER_BIT specifies that the buffer <b>can</b> be used in a ##VkDescriptorBufferInfo suitable for occupying a {@code VkDescriptorSet} slot either of type #DESCRIPTOR_TYPE_UNIFORM_BUFFER or #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC.</li>
            <li>#BUFFER_USAGE_2_STORAGE_BUFFER_BIT specifies that the buffer <b>can</b> be used in a ##VkDescriptorBufferInfo suitable for occupying a {@code VkDescriptorSet} slot either of type #DESCRIPTOR_TYPE_STORAGE_BUFFER or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC.</li>
            <li>#BUFFER_USAGE_2_INDEX_BUFFER_BIT specifies that the buffer is suitable for passing as the {@code buffer} parameter to #CmdBindIndexBuffer2() and #CmdBindIndexBuffer().</li>
            <li>#BUFFER_USAGE_2_VERTEX_BUFFER_BIT specifies that the buffer is suitable for passing as an element of the {@code pBuffers} array to #CmdBindVertexBuffers().</li>
            <li>#BUFFER_USAGE_2_INDIRECT_BUFFER_BIT specifies that the buffer is suitable for passing as the {@code buffer} parameter to #CmdDrawIndirect(), #CmdDrawIndexedIndirect(), #CmdDrawMeshTasksIndirectNV(), #CmdDrawMeshTasksIndirectCountNV(), {@code vkCmdDrawMeshTasksIndirectEXT}, {@code vkCmdDrawMeshTasksIndirectCountEXT}, #CmdDrawClusterIndirectHUAWEI(), or #CmdDispatchIndirect(). It is also suitable for passing as the {@code buffer} member of ##VkIndirectCommandsStreamNV, or {@code sequencesCountBuffer} or {@code sequencesIndexBuffer} or {@code preprocessedBuffer} member of ##VkGeneratedCommandsInfoNV. It is also suitable for passing as the underlying buffer of either the {@code preprocessAddress} or {@code sequenceCountAddress} members of ##VkGeneratedCommandsInfoEXT.</li>
            <li>#BUFFER_USAGE_2_CONDITIONAL_RENDERING_BIT_EXT specifies that the buffer is suitable for passing as the {@code buffer} parameter to #CmdBeginConditionalRenderingEXT().</li>
            <li>#BUFFER_USAGE_2_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT specifies that the buffer is suitable for using for binding as a transform feedback buffer with #CmdBindTransformFeedbackBuffersEXT().</li>
            <li>#BUFFER_USAGE_2_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT specifies that the buffer is suitable for using as a counter buffer with #CmdBeginTransformFeedbackEXT() and #CmdEndTransformFeedbackEXT().</li>
            <li>#BUFFER_USAGE_2_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT specifies that the buffer is suitable to contain sampler and combined image sampler descriptors when bound as a descriptor buffer. Buffers containing combined image sampler descriptors <b>must</b> also specify #BUFFER_USAGE_2_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT.</li>
            <li>#BUFFER_USAGE_2_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT specifies that the buffer is suitable to contain resource descriptors when bound as a descriptor buffer.</li>
            <li>#BUFFER_USAGE_2_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT specifies that the buffer, when bound, <b>can</b> be used by the implementation to support push descriptors when using descriptor buffers.</li>
            <li>#BUFFER_USAGE_2_RAY_TRACING_BIT_NV specifies that the buffer is suitable for use in #CmdTraceRaysNV().</li>
            <li>#BUFFER_USAGE_2_SHADER_BINDING_TABLE_BIT_KHR specifies that the buffer is suitable for use as a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#shader-binding-table">Shader Binding Table</a>.</li>
            <li>#BUFFER_USAGE_2_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR specifies that the buffer is suitable for use as a read-only input to an <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#acceleration-structure-building">acceleration structure build</a>.</li>
            <li>#BUFFER_USAGE_2_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR specifies that the buffer is suitable for storage space for a {@code VkAccelerationStructureKHR}.</li>
            <li>#BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT specifies that the buffer <b>can</b> be used to retrieve a buffer device address via #GetBufferDeviceAddress() and use that address to access the buffer’s memory from a shader.</li>
            <li>#BUFFER_USAGE_2_VIDEO_DECODE_SRC_BIT_KHR specifies that the buffer <b>can</b> be used as the source video bitstream buffer in a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#video-decode-operations">video decode operation</a>.</li>
            <li>#BUFFER_USAGE_2_VIDEO_DECODE_DST_BIT_KHR is reserved for future use.</li>
            <li>#BUFFER_USAGE_2_VIDEO_ENCODE_DST_BIT_KHR specifies that the buffer <b>can</b> be used as the destination video bitstream buffer in a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#video-encode-operations">video encode operation</a>.</li>
            <li>#BUFFER_USAGE_2_VIDEO_ENCODE_SRC_BIT_KHR is reserved for future use.</li>
            <li>#BUFFER_USAGE_2_EXECUTION_GRAPH_SCRATCH_BIT_AMDX specifies that the buffer <b>can</b> be used for as scratch memory for <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#executiongraphs">execution graph dispatch</a>.</li>
            <li>#BUFFER_USAGE_2_PREPROCESS_BUFFER_BIT_EXT specifies that the buffer <b>can</b> be used as a preprocess buffer for <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#device-generated-commands">Device-Generated Commands</a>.</li>
        </ul>
        """,

        "BUFFER_USAGE_2_TRANSFER_SRC_BIT".enum(0x00000001L),
        "BUFFER_USAGE_2_TRANSFER_DST_BIT".enum(0x00000002L),
        "BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT".enum(0x00000004L),
        "BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT".enum(0x00000008L),
        "BUFFER_USAGE_2_UNIFORM_BUFFER_BIT".enum(0x00000010L),
        "BUFFER_USAGE_2_STORAGE_BUFFER_BIT".enum(0x00000020L),
        "BUFFER_USAGE_2_INDEX_BUFFER_BIT".enum(0x00000040L),
        "BUFFER_USAGE_2_VERTEX_BUFFER_BIT".enum(0x00000080L),
        "BUFFER_USAGE_2_INDIRECT_BUFFER_BIT".enum(0x00000100L)
    )

    EnumConstant(
        """
        VkHostImageCopyFlagBits - Bitmask specifying additional copy parameters

        <h5>Description</h5>
        <ul>
            <li>#HOST_IMAGE_COPY_MEMCPY specifies that no memory layout swizzling is to be applied during data copy. For copies between memory and images, this flag indicates that image data in host memory is swizzled in exactly the same way as the image data on the device. Using this flag indicates that the implementations <b>may</b> use a simple memory copy to transfer the data between the host memory and the device memory. The format of the swizzled data in host memory is platform dependent and is not defined in this specification.</li>
        </ul>
        """,

        "HOST_IMAGE_COPY_MEMCPY".enum(0x00000001)
    )

    // Promoted from VK_KHR_line_rasterization (extension 535) 'Roadmap 2024'

    void(
        "CmdSetLineStipple",
        """
        Set line stipple dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the line stipple state, call:

        <pre><code>
￿void vkCmdSetLineStippleKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    lineStippleFactor,
￿    uint16_t                                    lineStipplePattern);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkCmdSetLineStippleEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    lineStippleFactor,
￿    uint16_t                                    lineStipplePattern);</code></pre>

        <h5>Description</h5>
        This command sets the line stipple state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_LINE_STIPPLE set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineRasterizationLineStateCreateInfo{@code ::lineStippleFactor} and ##VkPipelineRasterizationLineStateCreateInfo{@code ::lineStipplePattern} values used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code lineStippleFactor} <b>must</b> be in the range <code>[1,256]</code></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t("lineStippleFactor", "the repeat factor used in stippled line rasterization."),
        uint16_t("lineStipplePattern", "the bit pattern used in stippled line rasterization.")
    )

    // Promoted from VK_KHR_map_memory2 (extension 272) 'Roadmap 2024'

    VkResult(
        "MapMemory2",
        """
        Map a memory object into application address space.

        <h5>C Specification</h5>
        Alternatively, to retrieve a host virtual address pointer to a region of a mappable memory object, call:

        <pre><code>
￿VkResult vkMapMemory2KHR(
￿    VkDevice                                    device,
￿    const VkMemoryMapInfo*                      pMemoryMapInfo,
￿    void**                                      ppData);</code></pre>

        <h5>Description</h5>
        This function behaves identically to #MapMemory() except that it gets its parameters via an extensible structure pointer rather than directly as function arguments.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pMemoryMapInfo} <b>must</b> be a valid pointer to a valid ##VkMemoryMapInfo structure</li>
            <li>{@code ppData} <b>must</b> be a valid pointer to a pointer value</li>
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
                <li>#ERROR_MEMORY_MAP_FAILED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkMemoryMapInfo
        """,

        VkDevice("device", "the logical device that owns the memory."),
        VkMemoryMapInfo.const.p("pMemoryMapInfo", "a pointer to a ##VkMemoryMapInfo structure describing parameters of the map."),
        Check(1)..void.p.p("ppData", "a pointer to a {@code void *} variable in which is returned a host-accessible pointer to the beginning of the mapped range. This pointer minus ##VkMemoryMapInfo{@code ::offset} <b>must</b> be aligned to at least ##VkPhysicalDeviceLimits{@code ::minMemoryMapAlignment}.")
    )

    VkResult(
        "UnmapMemory2",
        """
        Unmap a previously mapped memory object.

        <h5>C Specification</h5>
        Alternatively, to unmap a memory object once host access to it is no longer needed by the application, call:

        <pre><code>
￿VkResult vkUnmapMemory2KHR(
￿    VkDevice                                    device,
￿    const VkMemoryUnmapInfo*                    pMemoryUnmapInfo);</code></pre>

        <h5>Description</h5>
        This function behaves identically to #UnmapMemory() except that it gets its parameters via an extensible structure pointer rather than directly as function arguments.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pMemoryUnmapInfo} <b>must</b> be a valid pointer to a valid ##VkMemoryUnmapInfo structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_MEMORY_MAP_FAILED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkMemoryUnmapInfo
        """,

        VkDevice("device", "the logical device that owns the memory."),
        VkMemoryUnmapInfo.const.p("pMemoryUnmapInfo", "a pointer to a ##VkMemoryUnmapInfo structure describing parameters of the unmap.")
    )

    // Promoted from VK_KHR_maintenance5 (extension 471) 'Roadmap 2024'

    void(
        "CmdBindIndexBuffer2",
        """
        Bind an index buffer to a command buffer.

        <h5>C Specification</h5>
        To bind an index buffer, along with its size, to a command buffer, call:

        <pre><code>
￿void vkCmdBindIndexBuffer2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBuffer                                    buffer,
￿    VkDeviceSize                                offset,
￿    VkDeviceSize                                size,
￿    VkIndexType                                 indexType);</code></pre>

        <h5>Description</h5>
        {@code size} specifies the bound size of the index buffer starting from {@code offset}. If {@code size} is #WHOLE_SIZE then the bound size is from {@code offset} to the end of the {@code buffer}.

        If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#features-maintenance6">{@code maintenance6}</a> feature is enabled, {@code buffer} <b>can</b> be #NULL_HANDLE. If {@code buffer} is #NULL_HANDLE and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#features-nullDescriptor">{@code nullDescriptor}</a> feature is enabled, every index fetched results in a value of zero.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code offset} <b>must</b> be less than the size of {@code buffer}</li>
            <li>The sum of {@code offset} and the base address of the range of {@code VkDeviceMemory} object that is backing {@code buffer}, <b>must</b> be a multiple of the size of the type indicated by {@code indexType}</li>
            <li>{@code buffer} <b>must</b> have been created with the #BUFFER_USAGE_INDEX_BUFFER_BIT flag</li>
            <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code indexType} <b>must</b> not be #INDEX_TYPE_NONE_KHR</li>
            <li>If {@code indexType} is #INDEX_TYPE_UINT8, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#features-indexTypeUint8">{@code indexTypeUint8}</a> feature <b>must</b> be enabled</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#features-maintenance6">{@code maintenance6}</a> feature is not enabled, {@code buffer} <b>must</b> not be #NULL_HANDLE</li>
            <li>If {@code buffer} is #NULL_HANDLE, offset <b>must</b> be zero</li>
            <li>If {@code size} is not #WHOLE_SIZE, {@code size} <b>must</b> be a multiple of the size of the type indicated by {@code indexType}</li>
            <li>If {@code size} is not #WHOLE_SIZE, the sum of {@code offset} and {@code size} <b>must</b> be less than or equal to the size of {@code buffer}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>If {@code buffer} is not #NULL_HANDLE, {@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code indexType} <b>must</b> be a valid {@code VkIndexType} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>Both of {@code buffer}, and {@code commandBuffer} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        VkBuffer("buffer", "the buffer being bound."),
        VkDeviceSize("offset", "the starting offset in bytes within {@code buffer} used in index buffer address calculations."),
        VkDeviceSize("size", "the size in bytes of index data bound from {@code buffer}."),
        VkIndexType("indexType", "a {@code VkIndexType} value specifying the size of the indices.")
    )

    void(
        "GetRenderingAreaGranularity",
        """
        Returns the granularity for dynamic rendering optimal render area.

        <h5>C Specification</h5>
        To query the render area granularity for a render pass instance, call:

        <pre><code>
￿void vkGetRenderingAreaGranularityKHR(
￿    VkDevice                                    device,
￿    const VkRenderingAreaInfo*                  pRenderingAreaInfo,
￿    VkExtent2D*                                 pGranularity);</code></pre>

        <h5>Description</h5>
        The conditions leading to an optimal {@code renderArea} are:

        <ul>
            <li>the {@code offset.x} member in {@code renderArea} is a multiple of the {@code width} member of the returned ##VkExtent2D (the horizontal granularity).</li>
            <li>the {@code offset.y} member in {@code renderArea} is a multiple of the {@code height} member of the returned ##VkExtent2D (the vertical granularity).</li>
            <li>either the {@code extent.width} member in {@code renderArea} is a multiple of the horizontal granularity or {@code offset.x}+{@code extent.width} is equal to the {@code width} of each attachment used in the render pass instance.</li>
            <li>either the {@code extent.height} member in {@code renderArea} is a multiple of the vertical granularity or {@code offset.y}+{@code extent.height} is equal to the {@code height} of each attachment used in the render pass instance.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pRenderingAreaInfo} <b>must</b> be a valid pointer to a valid ##VkRenderingAreaInfo structure</li>
            <li>{@code pGranularity} <b>must</b> be a valid pointer to a ##VkExtent2D structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkExtent2D, ##VkRenderingAreaInfo
        """,

        VkDevice("device", "the logical device that owns the render pass instance."),
        VkRenderingAreaInfo.const.p("pRenderingAreaInfo", "a pointer to a ##VkRenderingAreaInfo structure specifying details of the render pass instance to query the render area granularity for."),
        VkExtent2D.p("pGranularity", "a pointer to a ##VkExtent2D structure in which the granularity is returned.")
    )

    void(
        "GetDeviceImageSubresourceLayout",
        """
        Retrieve information about an image subresource without an image object.

        <h5>C Specification</h5>
        To query the memory layout of an image subresource, without an image object, call:

        <pre><code>
￿void vkGetDeviceImageSubresourceLayoutKHR(
￿    VkDevice                                    device,
￿    const VkDeviceImageSubresourceInfo*         pInfo,
￿    VkSubresourceLayout2*                       pLayout);</code></pre>

        <h5>Description</h5>
        {@code vkGetDeviceImageSubresourceLayout} behaves similarly to #GetImageSubresourceLayout2(), but uses a ##VkImageCreateInfo structure to specify the image rather than a {@code VkImage} object.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkDeviceImageSubresourceInfo structure</li>
            <li>{@code pLayout} <b>must</b> be a valid pointer to a ##VkSubresourceLayout2 structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkDeviceImageSubresourceInfo, ##VkSubresourceLayout2
        """,

        VkDevice("device", "the logical device that owns the image."),
        VkDeviceImageSubresourceInfo.const.p("pInfo", "a pointer to a ##VkDeviceImageSubresourceInfo structure containing parameters required for the subresource layout query."),
        VkSubresourceLayout2.p("pLayout", "a pointer to a ##VkSubresourceLayout2 structure in which the layout is returned.")
    )

    void(
        "GetImageSubresourceLayout2",
        """
        Retrieve information about an image subresource.

        <h5>C Specification</h5>
        To query the memory layout of an image subresource, call:

        <pre><code>
￿void vkGetImageSubresourceLayout2KHR(
￿    VkDevice                                    device,
￿    VkImage                                     image,
￿    const VkImageSubresource2*                  pSubresource,
￿    VkSubresourceLayout2*                       pLayout);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkGetImageSubresourceLayout2EXT(
￿    VkDevice                                    device,
￿    VkImage                                     image,
￿    const VkImageSubresource2*                  pSubresource,
￿    VkSubresourceLayout2*                       pLayout);</code></pre>

        <h5>Description</h5>
        {@code vkGetImageSubresourceLayout2} behaves similarly to #GetImageSubresourceLayout(), with the ability to specify extended inputs via chained input structures, and to return extended information via chained output structures.

        It is legal to call {@code vkGetImageSubresourceLayout2} with an {@code image} created with {@code tiling} equal to #IMAGE_TILING_OPTIMAL, but the members of ##VkSubresourceLayout2{@code ::subresourceLayout} will have undefined values in this case.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Structures chained from ##VkImageSubresource2{@code ::pNext} will also be updated when {@code tiling} is equal to #IMAGE_TILING_OPTIMAL.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code aspectMask} member of {@code pSubresource} <b>must</b> only have a single bit set</li>
            <li>The {@code mipLevel} member of {@code pSubresource} <b>must</b> be less than the {@code mipLevels} specified in {@code image}</li>
            <li>The {@code arrayLayer} member of {@code pSubresource} <b>must</b> be less than the {@code arrayLayers} specified in {@code image}</li>
            <li>If {@code format} of the {@code image} is a color format that is not a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a>, and {@code tiling} of the {@code image} is #IMAGE_TILING_LINEAR or #IMAGE_TILING_OPTIMAL, the {@code aspectMask} member of {@code pSubresource} <b>must</b> be #IMAGE_ASPECT_COLOR_BIT</li>
            <li>If {@code format} of the {@code image} has a depth component, the {@code aspectMask} member of {@code pSubresource} <b>must</b> contain #IMAGE_ASPECT_DEPTH_BIT</li>
            <li>If {@code format} of the {@code image} has a stencil component, the {@code aspectMask} member of {@code pSubresource} <b>must</b> contain #IMAGE_ASPECT_STENCIL_BIT</li>
            <li>If {@code format} of the {@code image} does not contain a stencil or depth component, the {@code aspectMask} member of {@code pSubresource} <b>must</b> not contain #IMAGE_ASPECT_DEPTH_BIT or #IMAGE_ASPECT_STENCIL_BIT</li>
            <li>If the {@code tiling} of the {@code image} is #IMAGE_TILING_LINEAR and has a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a>, then the {@code aspectMask} member of {@code pSubresource} <b>must</b> be a single valid <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#formats-planes-image-aspect">multi-planar aspect mask</a> bit</li>
            <li>If {@code image} was created with the #EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID external memory handle type, then {@code image} <b>must</b> be bound to memory</li>
            <li>If the {@code tiling} of the {@code image} is #IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT, then the {@code aspectMask} member of {@code pSubresource} <b>must</b> be <code>VK_IMAGE_ASPECT_MEMORY_PLANE<em>_i_</em>BIT_EXT</code> and the index <em>i</em> <b>must</b> be less than the ##VkDrmFormatModifierPropertiesEXT{@code ::drmFormatModifierPlaneCount} associated with the image’s {@code format} and ##VkImageDrmFormatModifierPropertiesEXT{@code ::drmFormatModifier}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code pSubresource} <b>must</b> be a valid pointer to a valid ##VkImageSubresource2 structure</li>
            <li>{@code pLayout} <b>must</b> be a valid pointer to a ##VkSubresourceLayout2 structure</li>
            <li>{@code image} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>See Also</h5>
        ##VkImageSubresource2, ##VkSubresourceLayout2
        """,

        VkDevice("device", "the logical device that owns the image."),
        VkImage("image", "the image whose layout is being queried."),
        VkImageSubresource2.const.p("pSubresource", "a pointer to a ##VkImageSubresource2 structure selecting a specific image for the image subresource."),
        VkSubresourceLayout2.p("pLayout", "a pointer to a ##VkSubresourceLayout2 structure in which the layout is returned.")
    )

    // Promoted from VK_KHR_push_descriptor (extension 81) 'Roadmap 2024'

    void(
        "CmdPushDescriptorSet",
        """
        Pushes descriptor updates into a command buffer.

        <h5>C Specification</h5>
        In addition to allocating descriptor sets and binding them to a command buffer, an application <b>can</b> record descriptor updates into the command buffer.

        To push descriptor updates into a command buffer, call:

        <pre><code>
￿void vkCmdPushDescriptorSetKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    VkPipelineBindPoint                         pipelineBindPoint,
￿    VkPipelineLayout                            layout,
￿    uint32_t                                    set,
￿    uint32_t                                    descriptorWriteCount,
￿    const VkWriteDescriptorSet*                 pDescriptorWrites);</code></pre>

        <h5>Description</h5>
        <em>Push descriptors</em> are a small bank of descriptors whose storage is internally managed by the command buffer rather than being written into a descriptor set and later bound to a command buffer. Push descriptors allow for incremental updates of descriptors without managing the lifetime of descriptor sets.

        When a command buffer begins recording, all push descriptors are undefined. Push descriptors <b>can</b> be updated incrementally and cause shaders to use the updated descriptors for subsequent <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#pipelines-bindpoint-commands">bound pipeline commands</a> with the pipeline type set by {@code pipelineBindPoint} until the descriptor is overwritten, or else until the set is disturbed as described in <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#descriptorsets-compatibility">Pipeline Layout Compatibility</a>. When the set is disturbed or push descriptors with a different descriptor set layout are set, all push descriptors are undefined.

        Push descriptors that are <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#shaders-staticuse">statically used</a> by a pipeline <b>must</b> not be undefined at the time that a drawing or dispatching command is recorded to execute using that pipeline. This includes immutable sampler descriptors, which <b>must</b> be pushed before they are accessed by a pipeline (the immutable samplers are pushed, rather than the samplers in {@code pDescriptorWrites}). Push descriptors that are not statically used <b>can</b> remain undefined.

        Push descriptors do not use dynamic offsets. Instead, the corresponding non-dynamic descriptor types <b>can</b> be used and the {@code offset} member of ##VkDescriptorBufferInfo <b>can</b> be changed each time the descriptor is written.

        Each element of {@code pDescriptorWrites} is interpreted as in ##VkWriteDescriptorSet, except the {@code dstSet} member is ignored.

        To push an immutable sampler, use a ##VkWriteDescriptorSet with {@code dstBinding} and {@code dstArrayElement} selecting the immutable sampler’s binding. If the descriptor type is #DESCRIPTOR_TYPE_SAMPLER, the {@code pImageInfo} parameter is ignored and the immutable sampler is taken from the push descriptor set layout in the pipeline layout. If the descriptor type is #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, the {@code sampler} member of the {@code pImageInfo} parameter is ignored and the immutable sampler is taken from the push descriptor set layout in the pipeline layout.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code set} <b>must</b> be less than ##VkPipelineLayoutCreateInfo{@code ::setLayoutCount} provided when {@code layout} was created</li>
            <li>{@code set} <b>must</b> be the unique set number in the pipeline layout that uses a descriptor set layout that was created with #DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT</li>
            <li>For each element <code>i</code> where {@code pDescriptorWrites}[i].{@code descriptorType} is #DESCRIPTOR_TYPE_SAMPLER, #DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER, #DESCRIPTOR_TYPE_SAMPLED_IMAGE, #DESCRIPTOR_TYPE_STORAGE_IMAGE, or #DESCRIPTOR_TYPE_INPUT_ATTACHMENT, {@code pDescriptorWrites}[i].{@code pImageInfo} <b>must</b> be a valid pointer to an array of {@code pDescriptorWrites}[i].{@code descriptorCount} valid ##VkDescriptorImageInfo structures</li>
            <li>{@code pipelineBindPoint} <b>must</b> be supported by the {@code commandBuffer}’s parent {@code VkCommandPool}’s queue family</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
            <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
            <li>{@code pDescriptorWrites} <b>must</b> be a valid pointer to an array of {@code descriptorWriteCount} valid ##VkWriteDescriptorSet structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code descriptorWriteCount} <b>must</b> be greater than 0</li>
            <li>Both of {@code commandBuffer}, and {@code layout} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkWriteDescriptorSet
        """,

        VkCommandBuffer("commandBuffer", "the command buffer that the descriptors will be recorded in."),
        VkPipelineBindPoint("pipelineBindPoint", "a {@code VkPipelineBindPoint} indicating the type of the pipeline that will use the descriptors. There is a separate set of push descriptor bindings for each pipeline type, so binding one does not disturb the others."),
        VkPipelineLayout("layout", "a {@code VkPipelineLayout} object used to program the bindings."),
        uint32_t("set", "the set number of the descriptor set in the pipeline layout that will be updated."),
        AutoSize("pDescriptorWrites")..uint32_t("descriptorWriteCount", "the number of elements in the {@code pDescriptorWrites} array."),
        VkWriteDescriptorSet.const.p("pDescriptorWrites", "a pointer to an array of ##VkWriteDescriptorSet structures describing the descriptors to be updated.")
    )

    void(
        "CmdPushDescriptorSetWithTemplate",
        """
        Pushes descriptor updates into a command buffer using a descriptor update template.

        <h5>C Specification</h5>
        It is also possible to use a descriptor update template to specify the push descriptors to update. To do so, call:

        <pre><code>
￿void vkCmdPushDescriptorSetWithTemplateKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    VkDescriptorUpdateTemplate                  descriptorUpdateTemplate,
￿    VkPipelineLayout                            layout,
￿    uint32_t                                    set,
￿    const void*                                 pData);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code pipelineBindPoint} specified during the creation of the descriptor update template <b>must</b> be supported by the {@code commandBuffer}’s parent {@code VkCommandPool}’s queue family</li>
            <li>{@code pData} <b>must</b> be a valid pointer to a memory containing one or more valid instances of ##VkDescriptorImageInfo, ##VkDescriptorBufferInfo, or {@code VkBufferView} in a layout defined by {@code descriptorUpdateTemplate} when it was created with #CreateDescriptorUpdateTemplate()</li>
            <li>{@code layout} <b>must</b> be compatible with the layout used to create {@code descriptorUpdateTemplate}</li>
            <li>{@code descriptorUpdateTemplate} <b>must</b> have been created with a {@code templateType} of #DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS</li>
            <li>{@code set} <b>must</b> be the same value used to create {@code descriptorUpdateTemplate}</li>
            <li>{@code set} <b>must</b> be less than ##VkPipelineLayoutCreateInfo{@code ::setLayoutCount} provided when {@code layout} was created</li>
            <li>{@code set} <b>must</b> be the unique set number in the pipeline layout that uses a descriptor set layout that was created with #DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code descriptorUpdateTemplate} <b>must</b> be a valid {@code VkDescriptorUpdateTemplate} handle</li>
            <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>Each of {@code commandBuffer}, {@code descriptorUpdateTemplate}, and {@code layout} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
        </table>

        <pre><code>
￿struct AppDataStructure
￿{
￿    VkDescriptorImageInfo  imageInfo;          // a single image info
￿    // ... some more application-related data
￿};
￿
￿const VkDescriptorUpdateTemplateEntry descriptorUpdateTemplateEntries[] =
￿{
￿    // binding to a single image descriptor
￿    {
￿        .binding = 0,
￿        .dstArrayElement = 0,
￿        .descriptorCount = 1,
￿        .descriptorType = VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER,
￿        .offset = offsetof(AppDataStructure, imageInfo),
￿        .stride = 0     // not required if descriptorCount is 1
￿    }
￿};
￿
￿// create a descriptor update template for push descriptor set updates
￿const VkDescriptorUpdateTemplateCreateInfo createInfo =
￿{
￿    .sType = VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO,
￿    .pNext = NULL,
￿    .flags = 0,
￿    .descriptorUpdateEntryCount = 1,
￿    .pDescriptorUpdateEntries = descriptorUpdateTemplateEntries,
￿    .templateType = VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS,
￿    .descriptorSetLayout = 0,   // ignored by given templateType
￿    .pipelineBindPoint = VK_PIPELINE_BIND_POINT_GRAPHICS,
￿    .pipelineLayout = myPipelineLayout,
￿    .set = 0,
￿};
￿
￿VkDescriptorUpdateTemplate myDescriptorUpdateTemplate;
￿myResult = vkCreateDescriptorUpdateTemplate(
￿    myDevice,
￿    &amp;createInfo,
￿    NULL,
￿    &amp;myDescriptorUpdateTemplate);
￿
￿AppDataStructure appData;
￿// fill appData here or cache it in your engine
￿vkCmdPushDescriptorSetWithTemplate(myCmdBuffer, myDescriptorUpdateTemplate, myPipelineLayout, 0,&amp;appData);</code></pre>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer that the descriptors will be recorded in."),
        VkDescriptorUpdateTemplate("descriptorUpdateTemplate", "a descriptor update template defining how to interpret the descriptor information in {@code pData}."),
        VkPipelineLayout("layout", "a {@code VkPipelineLayout} object used to program the bindings. It <b>must</b> be compatible with the layout used to create the {@code descriptorUpdateTemplate} handle."),
        uint32_t("set", "the set number of the descriptor set in the pipeline layout that will be updated. This <b>must</b> be the same number used to create the {@code descriptorUpdateTemplate} handle."),
        nullable..opaque_const_p("pData", "a pointer to memory containing descriptors for the templated update.")
    )

    // Promoted from VK_KHR_dynamic_rendering_local_read (extension 233) 'Roadmap 2024'

    void(
        "CmdSetRenderingAttachmentLocations",
        """
        Set color attachment location mappings for a command buffer.

        <h5>C Specification</h5>
        To set the fragment output location mappings during rendering, call:

        <pre><code>
￿void vkCmdSetRenderingAttachmentLocationsKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkRenderingAttachmentLocationInfo*    pLocationInfo);</code></pre>

        <h5>Description</h5>
        This command sets the attachment location mappings for subsequent drawing commands, and <b>must</b> match the mappings provided to the bound pipeline, if one is bound, which <b>can</b> be set by chaining ##VkRenderingAttachmentLocationInfo to ##VkGraphicsPipelineCreateInfo.

        Until this command is called, mappings in the command buffer state are treated as each color attachment specified in #CmdBeginRendering() having a location equal to its index in ##VkRenderingInfo{@code ::pColorAttachments}. This state is reset whenever #CmdBeginRendering() is called.

        <h5>Valid Usage</h5>
        <ul>
            <li><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#features-dynamicRenderingLocalRead">{@code dynamicRenderingLocalRead}</a> <b>must</b> be enabled</li>
            <li>{@code pLocationInfo→colorAttachmentCount} <b>must</b> be equal to the value of ##VkRenderingInfo{@code ::colorAttachmentCount} used to begin the current render pass instance</li>
            <li>The current render pass instance <b>must</b> have been started or resumed by #CmdBeginRendering() in this {@code commandBuffer}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pLocationInfo} <b>must</b> be a valid pointer to a valid ##VkRenderingAttachmentLocationInfo structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkRenderingAttachmentLocationInfo
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkRenderingAttachmentLocationInfo.const.p("pLocationInfo", "a ##VkRenderingAttachmentLocationInfo structure indicating the new mappings.")
    )

    void(
        "CmdSetRenderingInputAttachmentIndices",
        """
        Set input attachment index mappings for a command buffer.

        <h5>C Specification</h5>
        To set the input attachment index mappings during dynamic rendering, call:

        <pre><code>
￿void vkCmdSetRenderingInputAttachmentIndicesKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkRenderingInputAttachmentIndexInfo*  pInputAttachmentIndexInfo);</code></pre>

        <h5>Description</h5>
        This command sets the input attachment index mappings for subsequent drawing commands, and <b>must</b> match the mappings provided to the bound pipeline, if one is bound, which <b>can</b> be set by chaining ##VkRenderingInputAttachmentIndexInfo to ##VkGraphicsPipelineCreateInfo.

        Until this command is called, mappings in the command buffer state are treated as each color attachment specified in #CmdBeginRendering() mapping to subpass inputs with a {@code InputAttachmentIndex} equal to its index in ##VkRenderingInfo{@code ::pColorAttachments}, and depth/stencil attachments mapping to input attachments without these decorations. This state is reset whenever #CmdBeginRendering() is called.

        <h5>Valid Usage</h5>
        <ul>
            <li><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#features-dynamicRenderingLocalRead">{@code dynamicRenderingLocalRead}</a> <b>must</b> be enabled</li>
            <li>{@code pInputAttachmentIndexInfo→colorAttachmentCount} <b>must</b> be equal to the value of ##VkRenderingInfo{@code ::colorAttachmentCount} used to begin the current render pass instance</li>
            <li>The current render pass instance <b>must</b> have been started or resumed by #CmdBeginRendering() in this {@code commandBuffer}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pInputAttachmentIndexInfo} <b>must</b> be a valid pointer to a valid ##VkRenderingInputAttachmentIndexInfo structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called inside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkRenderingInputAttachmentIndexInfo
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkRenderingInputAttachmentIndexInfo.const.p("pInputAttachmentIndexInfo", "a ##VkRenderingInputAttachmentIndexInfo structure indicating the new mappings.")
    )

    // Promoted from VK_KHR_maintenance6 (extension 546) 'additional functionality'

    void(
        "CmdBindDescriptorSets2",
        """
        Binds descriptor sets to a command buffer.

        <h5>C Specification</h5>
        Alternatively, to bind one or more descriptor sets to a command buffer, call:

        <pre><code>
￿void vkCmdBindDescriptorSets2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkBindDescriptorSetsInfo*             pBindDescriptorSetsInfo);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>Each bit in {@code pBindDescriptorSetsInfo→stageFlags} <b>must</b> be a stage supported by the {@code commandBuffer}’s parent {@code VkCommandPool}’s queue family</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pBindDescriptorSetsInfo} <b>must</b> be a valid pointer to a valid ##VkBindDescriptorSetsInfo structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkBindDescriptorSetsInfo
        """,

        VkCommandBuffer("commandBuffer", "the command buffer that the descriptor sets will be bound to."),
        VkBindDescriptorSetsInfo.const.p("pBindDescriptorSetsInfo", "a pointer to a ##VkBindDescriptorSetsInfo structure.")
    )

    void(
        "CmdPushConstants2",
        """
        Update the values of push constants.

        <h5>C Specification</h5>
        Alternatively, to update push constants, call:

        <pre><code>
￿void vkCmdPushConstants2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkPushConstantsInfo*                  pPushConstantsInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pPushConstantsInfo} <b>must</b> be a valid pointer to a valid ##VkPushConstantsInfo structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkPushConstantsInfo
        """,

        VkCommandBuffer("commandBuffer", "the command buffer in which the push constant update will be recorded."),
        VkPushConstantsInfo.const.p("pPushConstantsInfo", "a pointer to a ##VkPushConstantsInfo structure.")
    )

    void(
        "CmdPushDescriptorSet2",
        """
        Pushes descriptor updates into a command buffer.

        <h5>C Specification</h5>
        Alternatively, to push descriptor updates into a command buffer, call:

        <pre><code>
￿void vkCmdPushDescriptorSet2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkPushDescriptorSetInfo*              pPushDescriptorSetInfo);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>Each bit in {@code pPushDescriptorSetInfo→stageFlags} <b>must</b> be a stage supported by the {@code commandBuffer}’s parent {@code VkCommandPool}’s queue family</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pPushDescriptorSetInfo} <b>must</b> be a valid pointer to a valid ##VkPushDescriptorSetInfo structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkPushDescriptorSetInfo
        """,

        VkCommandBuffer("commandBuffer", "the command buffer that the descriptors will be recorded in."),
        VkPushDescriptorSetInfo.const.p("pPushDescriptorSetInfo", "a pointer to a ##VkPushDescriptorSetInfo structure.")
    )

    void(
        "CmdPushDescriptorSetWithTemplate2",
        """
        Pushes descriptor updates into a command buffer using a descriptor update template.

        <h5>C Specification</h5>
        Alternatively, to use a descriptor update template to specify the push descriptors to update, call:

        <pre><code>
￿void vkCmdPushDescriptorSetWithTemplate2KHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkPushDescriptorSetWithTemplateInfo*  pPushDescriptorSetWithTemplateInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pPushDescriptorSetWithTemplateInfo} <b>must</b> be a valid pointer to a valid ##VkPushDescriptorSetWithTemplateInfo structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics Compute</td><td>State</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkPushDescriptorSetWithTemplateInfo
        """,

        VkCommandBuffer("commandBuffer", "the command buffer that the descriptors will be recorded in."),
        VkPushDescriptorSetWithTemplateInfo.const.p("pPushDescriptorSetWithTemplateInfo", "a pointer to a ##VkPushDescriptorSetWithTemplateInfo structure.")
    )

    // Promoted (as optional feature) from VK_EXT_host_image_copy (extension 271) 'streaming transfers'

    VkResult(
        "CopyMemoryToImage",
        """
        Copy data from host memory into an image.

        <h5>C Specification</h5>
        To copy data from host memory to an image object, call:

        <pre><code>
￿VkResult vkCopyMemoryToImageEXT(
￿    VkDevice                                    device,
￿    const VkCopyMemoryToImageInfo*              pCopyMemoryToImageInfo);</code></pre>

        <h5>Description</h5>
        This command is functionally similar to #CmdCopyBufferToImage2(), except it is executed on the host and reads from host memory instead of a buffer. The memory of {@code pCopyMemoryToImageInfo→dstImage} is accessed by the host as if <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#memory-coherent">coherent</a>.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Because queue submissions <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#synchronization-submission-host-writes">automatically make host memory visible to the device</a>, there would not be a need for a memory barrier before using the results of this copy operation on the device.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCopyMemoryToImageInfo} <b>must</b> be a valid pointer to a valid ##VkCopyMemoryToImageInfo structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_INITIALIZATION_FAILED</li>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_MEMORY_MAP_FAILED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkCopyMemoryToImageInfo
        """,

        VkDevice("device", "the device which owns {@code pCopyMemoryToImageInfo→dstImage}."),
        VkCopyMemoryToImageInfo.const.p("pCopyMemoryToImageInfo", "a pointer to a ##VkCopyMemoryToImageInfo structure describing the copy parameters.")
    )

    VkResult(
        "CopyImageToMemory",
        """
        Copy image data into host memory.

        <h5>C Specification</h5>
        To copy data from an image object to host memory, call:

        <pre><code>
￿VkResult vkCopyImageToMemoryEXT(
￿    VkDevice                                    device,
￿    const VkCopyImageToMemoryInfo*              pCopyImageToMemoryInfo);</code></pre>

        <h5>Description</h5>
        This command is functionally similar to #CmdCopyImageToBuffer2(), except it is executed on the host and writes to host memory instead of a buffer. The memory of {@code pCopyImageToMemoryInfo→srcImage} is accessed by the host as if <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#memory-coherent">coherent</a>.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        If the device has written to the image memory, it is not automatically made available to the host. Before this copy command can be called, a memory barrier for this image <b>must</b> have been issued on the device with the second <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> including #PIPELINE_STAGE_HOST_BIT and #ACCESS_HOST_READ_BIT.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCopyImageToMemoryInfo} <b>must</b> be a valid pointer to a valid ##VkCopyImageToMemoryInfo structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_INITIALIZATION_FAILED</li>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_MEMORY_MAP_FAILED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkCopyImageToMemoryInfo
        """,

        VkDevice("device", "the device which owns {@code pCopyImageToMemoryInfo→srcImage}."),
        VkCopyImageToMemoryInfo.const.p("pCopyImageToMemoryInfo", "a pointer to a ##VkCopyImageToMemoryInfo structure describing the copy parameters.")
    )

    VkResult(
        "CopyImageToImage",
        """
        Copy image data using the host.

        <h5>C Specification</h5>
        To copy data from an image object to another image object using the host, call:

        <pre><code>
￿VkResult vkCopyImageToImageEXT(
￿    VkDevice                                    device,
￿    const VkCopyImageToImageInfo*               pCopyImageToImageInfo);</code></pre>

        <h5>Description</h5>
        This command is functionally similar to #CmdCopyImage2(), except it is executed on the host. The memory of {@code pCopyImageToImageInfo→srcImage} and {@code pCopyImageToImageInfo→dstImage} is accessed by the host as if <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#memory-coherent">coherent</a>.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        If the device has written to the memory of {@code pCopyImageToImageInfo→srcImage}, it is not automatically made available to the host. Before this copy command can be called, a memory barrier for this image <b>must</b> have been issued on the device with the second <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#synchronization-dependencies-scopes">synchronization scope</a> including #PIPELINE_STAGE_HOST_BIT and #ACCESS_HOST_READ_BIT.

        Because queue submissions <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#synchronization-submission-host-writes">automatically make host memory visible to the device</a>, there would not be a need for a memory barrier before using the results of this copy operation in {@code pCopyMemoryToImageInfo→dstImage} on the device.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCopyImageToImageInfo} <b>must</b> be a valid pointer to a valid ##VkCopyImageToImageInfo structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_INITIALIZATION_FAILED</li>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_MEMORY_MAP_FAILED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkCopyImageToImageInfo
        """,

        VkDevice("device", "the device which owns {@code pCopyImageToImageInfo→srcImage} and {@code pCopyImageToImageInfo→dstImage}."),
        VkCopyImageToImageInfo.const.p("pCopyImageToImageInfo", "a pointer to a ##VkCopyImageToImageInfo structure describing the copy parameters.")
    )

    VkResult(
        "TransitionImageLayout",
        """
        Perform an image layout transition on the host.

        <h5>C Specification</h5>
        To perform an image layout transition on the host, call:

        <pre><code>
￿VkResult vkTransitionImageLayoutEXT(
￿    VkDevice                                    device,
￿    uint32_t                                    transitionCount,
￿    const VkHostImageLayoutTransitionInfo*      pTransitions);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pTransitions} <b>must</b> be a valid pointer to an array of {@code transitionCount} valid ##VkHostImageLayoutTransitionInfo structures</li>
            <li>{@code transitionCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_INITIALIZATION_FAILED</li>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_MEMORY_MAP_FAILED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkHostImageLayoutTransitionInfo
        """,

        VkDevice("device", "the device which owns {@code pTransitions}[i].{@code image}."),
        AutoSize("pTransitions")..uint32_t("transitionCount", "the number of image layout transitions to perform."),
        VkHostImageLayoutTransitionInfo.const.p("pTransitions", "a pointer to an array of ##VkHostImageLayoutTransitionInfo structures specifying the image and <a href=\"https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\\#resources-image-views\">subresource ranges</a> within them to transition.")
    )

}