/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_maintenance5 = "KHRMaintenance5".nativeClassVK("KHR_maintenance5", type = "device", postfix = "KHR") {
    documentation =
        """
        {@code VK_KHR_maintenance5} adds a collection of minor features, none of which would warrant an entire extension of their own.

        The new features are as follows:

        <ul>
            <li>A new #FORMAT_A1B5G5R5_UNORM_PACK16_KHR format</li>
            <li>A new #FORMAT_A8_UNORM_KHR format</li>
            <li>A property to indicate that multisample coverage operations are performed after sample counting in EarlyFragmentTests mode</li>
            <li>Relax VkBufferView creation requirements by allowing subsets of the associated VkBuffer usage using ##VkBufferUsageFlags2CreateInfoKHR</li>
            <li>A new entry point #CmdBindIndexBuffer2KHR(), allowing a range of memory to be bound as an index buffer</li>
            <li>#GetDeviceProcAddr() must return {@code NULL} for supported core functions beyond the version requested by the application.</li>
            <li>A property to indicate that the sample mask test is performed after sample counting in EarlyFragmentTests mode</li>
            <li>{@code vkCmdBindVertexBuffers2} now supports using {@code VK_WHOLE_SIZE} in the {@code pSizes} parameter.</li>
            <li>A default size of 1.0 is used if {@code PointSize} is not written</li>
            <li>Shader modules are deprecated - applications can now pass ##VkShaderModuleCreateInfo as a chained struct to pipeline creation via ##VkPipelineShaderStageCreateInfo</li>
            <li>A function #GetRenderingAreaGranularityKHR() to query the optimal render area for a dynamic rendering instance.</li>
            <li>A property to indicate that depth/stencil texturing operations with #COMPONENT_SWIZZLE_ONE have defined behavior</li>
            <li>Add #GetImageSubresourceLayout2KHR() and a new function #GetDeviceImageSubresourceLayoutKHR() to allow the application to query the image memory layout without having to create an image object and query it.</li>
            <li>Allow #REMAINING_ARRAY_LAYERS as the {@code layerCount} member of ##VkImageSubresourceLayers</li>
            <li>Adds stronger guarantees for propagation of #ERROR_DEVICE_LOST return values</li>
            <li>A property to indicate whether {@code PointSize} controls the final rasterization of polygons if <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#primsrast-polygonmode">polygon mode</a> is #POLYGON_MODE_POINT</li>
            <li>Two properties to indicate the non-strict line rasterization algorithm used</li>
            <li>Two new flags words {@code VkPipelineCreateFlagBits2KHR} and {@code VkBufferUsageFlagBits2KHR}</li>
            <li>Physical-device-level functions can now be called with any value in the valid range for a type beyond the defined enumerants, such that applications can avoid checking individual features, extensions, or versions before querying supported properties of a particular enumerant.</li>
            <li>Clarification that copies between images of any type are allowed, treating 1D images as 2D images with a height of 1.</li>
        </ul>

        <h5>VK_KHR_maintenance5</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_maintenance5}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>471</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.1">Version 1.1</a> and {@link KHRDynamicRendering VK_KHR_dynamic_rendering}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Stu Smith <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_maintenance5]%20@stu-s%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_maintenance5%20extension*">stu-s</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_maintenance5.adoc">VK_KHR_maintenance5</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-05-02</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Stu Smith, AMD</li>
                <li>Tobias Hector, AMD</li>
                <li>Shahbaz Youssefi, Google</li>
                <li>Slawomir Cygan, Intel</li>
                <li>Lionel Landwerlin, Intel</li>
                <li>James Fitzpatrick, Imagination Technologies</li>
                <li>Andrew Garrard, Imagination Technologies</li>
                <li>Ralph Potter, Samsung</li>
                <li>Pan Gao, Huawei</li>
                <li>Jan-Harald Fredriksen, ARM</li>
                <li>Jon Leech, Khronos</li>
                <li>Mike Blumenkrantz, Valve</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_MAINTENANCE_5_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_MAINTENANCE_5_EXTENSION_NAME".."VK_KHR_maintenance5"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES_KHR".."1000470000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES_KHR".."1000470001",
        "STRUCTURE_TYPE_RENDERING_AREA_INFO_KHR".."1000470003",
        "STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO_KHR".."1000470004",
        "STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_KHR".."1000338002",
        "STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_KHR".."1000338003"
    )

    EnumConstant(
        "Extends {@code VkFormat}.",

        "FORMAT_A1B5G5R5_UNORM_PACK16_KHR".."1000470000",
        "FORMAT_A8_UNORM_KHR".."1000470001"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO_KHR".."1000470005",
        "STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO_KHR".."1000470006"
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2KHR}.",

        "PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR".enum(0x00000008L),
        "PIPELINE_CREATE_2_DISPATCH_BASE_BIT_KHR".enum(0x00000010L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2KHR}.",

        "PIPELINE_CREATE_2_DEFER_COMPILE_BIT_NV".enum(0x00000020L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2KHR}.",

        "PIPELINE_CREATE_2_CAPTURE_STATISTICS_BIT_KHR".enum(0x00000040L),
        "PIPELINE_CREATE_2_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR".enum(0x00000080L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2KHR}.",

        "PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_KHR".enum(0x00000100L),
        "PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT_KHR".enum(0x00000200L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2KHR}.",

        "PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT".enum(0x00000400L),
        "PIPELINE_CREATE_2_RETAIN_LINK_TIME_OPTIMIZATION_INFO_BIT_EXT".enum(0x00800000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2KHR}.",

        "PIPELINE_CREATE_2_LIBRARY_BIT_KHR".enum(0x00000800L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2KHR}.",

        "PIPELINE_CREATE_2_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR".enum(0x00001000L),
        "PIPELINE_CREATE_2_RAY_TRACING_SKIP_AABBS_BIT_KHR".enum(0x00002000L),
        "PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR".enum(0x00004000L),
        "PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR".enum(0x00008000L),
        "PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR".enum(0x00010000L),
        "PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR".enum(0x00020000L),
        "PIPELINE_CREATE_2_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR".enum(0x00080000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2KHR}.",

        "PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_NV".enum(0x00040000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2KHR}.",

        "PIPELINE_CREATE_2_RAY_TRACING_ALLOW_MOTION_BIT_NV".enum(0x00100000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2KHR}.",

        "PIPELINE_CREATE_2_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR".enum(0x00200000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2KHR}.",

        "PIPELINE_CREATE_2_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT".enum(0x00400000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2KHR}.",

        "PIPELINE_CREATE_2_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT".enum(0x01000000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2KHR}.",

        "PIPELINE_CREATE_2_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT".enum(0x02000000L),
        "PIPELINE_CREATE_2_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT".enum(0x04000000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2KHR}.",

        "PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT_EXT".enum(0x08000000L),
        "PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT_EXT".enum(0x40000000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2KHR}.",

        "PIPELINE_CREATE_2_RAY_TRACING_DISPLACEMENT_MICROMAP_BIT_NV".enum(0x10000000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2KHR}.",

        "PIPELINE_CREATE_2_DESCRIPTOR_BUFFER_BIT_EXT".enum(0x20000000L)
    )

    EnumConstantLong(
        "Extends {@code VkBufferUsageFlagBits2KHR}.",

        "BUFFER_USAGE_2_CONDITIONAL_RENDERING_BIT_EXT".enum(0x00000200L)
    )

    EnumConstantLong(
        "Extends {@code VkBufferUsageFlagBits2KHR}.",

        "BUFFER_USAGE_2_SHADER_BINDING_TABLE_BIT_KHR".enum(0x00000400L)
    )

    EnumConstantLong(
        "Extends {@code VkBufferUsageFlagBits2KHR}.",

        "BUFFER_USAGE_2_RAY_TRACING_BIT_NV".enum(0x00000400L)
    )

    EnumConstantLong(
        "Extends {@code VkBufferUsageFlagBits2KHR}.",

        "BUFFER_USAGE_2_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT".enum(0x00000800L),
        "BUFFER_USAGE_2_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT".enum(0x00001000L)
    )

    EnumConstantLong(
        "Extends {@code VkBufferUsageFlagBits2KHR}.",

        "BUFFER_USAGE_2_VIDEO_DECODE_SRC_BIT_KHR".enum(0x00002000L),
        "BUFFER_USAGE_2_VIDEO_DECODE_DST_BIT_KHR".enum(0x00004000L)
    )

    EnumConstantLong(
        "Extends {@code VkBufferUsageFlagBits2KHR}.",

        "BUFFER_USAGE_2_VIDEO_ENCODE_DST_BIT_KHR".enum(0x00008000L),
        "BUFFER_USAGE_2_VIDEO_ENCODE_SRC_BIT_KHR".enum(0x00010000L)
    )

    EnumConstantLong(
        "Extends {@code VkBufferUsageFlagBits2KHR}.",

        "BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT_KHR".enum(0x00020000L)
    )

    EnumConstantLong(
        "Extends {@code VkBufferUsageFlagBits2KHR}.",

        "BUFFER_USAGE_2_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR".enum(0x00080000L),
        "BUFFER_USAGE_2_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR".enum(0x00100000L)
    )

    EnumConstantLong(
        "Extends {@code VkBufferUsageFlagBits2KHR}.",

        "BUFFER_USAGE_2_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT".enum(0x00200000L),
        "BUFFER_USAGE_2_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT".enum(0x00400000L),
        "BUFFER_USAGE_2_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT".enum(0x04000000L)
    )

    EnumConstantLong(
        "Extends {@code VkBufferUsageFlagBits2KHR}.",

        "BUFFER_USAGE_2_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT".enum(0x00800000L),
        "BUFFER_USAGE_2_MICROMAP_STORAGE_BIT_EXT".enum(0x01000000L)
    )

    EnumConstantLong(
        """
        VkPipelineCreateFlagBits2KHR - Bitmask controlling how a pipeline is created

        <h5>Description</h5>
        <ul>
            <li>#PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT_KHR specifies that the created pipeline will not be optimized. Using this flag <b>may</b> reduce the time taken to create the pipeline.</li>
            <li>#PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT_KHR specifies that the pipeline to be created is allowed to be the parent of a pipeline that will be created in a subsequent pipeline creation call.</li>
            <li>#PIPELINE_CREATE_2_DERIVATIVE_BIT_KHR specifies that the pipeline to be created will be a child of a previously created parent pipeline.</li>
            <li>#PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR specifies that any shader input variables decorated as {@code ViewIndex} will be assigned values as if they were decorated as {@code DeviceIndex}.</li>
            <li>#PIPELINE_CREATE_2_DISPATCH_BASE_BIT_KHR specifies that a compute pipeline <b>can</b> be used with #CmdDispatchBase() with a non-zero base workgroup.</li>
            <li>#PIPELINE_CREATE_2_DEFER_COMPILE_BIT_NV specifies that a pipeline is created with all shaders in the deferred state. Before using the pipeline the application <b>must</b> call #CompileDeferredNV() exactly once on each shader in the pipeline before using the pipeline.</li>
            <li>#PIPELINE_CREATE_2_CAPTURE_STATISTICS_BIT_KHR specifies that the shader compiler should capture statistics for the pipeline executables produced by the compile process which <b>can</b> later be retrieved by calling #GetPipelineExecutableStatisticsKHR(). Enabling this flag <b>must</b> not affect the final compiled pipeline but <b>may</b> disable pipeline caching or otherwise affect pipeline creation time.</li>
            <li>#PIPELINE_CREATE_2_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR specifies that the shader compiler should capture the internal representations of pipeline executables produced by the compile process which <b>can</b> later be retrieved by calling #GetPipelineExecutableInternalRepresentationsKHR(). Enabling this flag <b>must</b> not affect the final compiled pipeline but <b>may</b> disable pipeline caching or otherwise affect pipeline creation time. When capturing IR from pipelines created with pipeline libraries, there is no guarantee that IR from libraries <b>can</b> be retrieved from the linked pipeline. Applications <b>should</b> retrieve IR from each library, and any linked pipelines, separately.</li>
            <li>#PIPELINE_CREATE_2_LIBRARY_BIT_KHR specifies that the pipeline <b>cannot</b> be used directly, and instead defines a <em>pipeline library</em> that <b>can</b> be combined with other pipelines using the ##VkPipelineLibraryCreateInfoKHR structure. This is available in ray tracing and graphics pipelines.</li>
            <li>#PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR specifies that an any-hit shader will always be present when an any-hit shader would be executed. A NULL any-hit shader is an any-hit shader which is effectively #SHADER_UNUSED_KHR, such as from a shader group consisting entirely of zeros.</li>
            <li>#PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR specifies that a closest hit shader will always be present when a closest hit shader would be executed. A NULL closest hit shader is a closest hit shader which is effectively #SHADER_UNUSED_KHR, such as from a shader group consisting entirely of zeros.</li>
            <li>#PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR specifies that a miss shader will always be present when a miss shader would be executed. A NULL miss shader is a miss shader which is effectively #SHADER_UNUSED_KHR, such as from a shader group consisting entirely of zeros.</li>
            <li>#PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR specifies that an intersection shader will always be present when an intersection shader would be executed. A NULL intersection shader is an intersection shader which is effectively #SHADER_UNUSED_KHR, such as from a shader group consisting entirely of zeros.</li>
            <li>#PIPELINE_CREATE_2_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR specifies that triangle primitives will be skipped during traversal using {@code OpTraceRayKHR}.</li>
            <li>#PIPELINE_CREATE_2_RAY_TRACING_SKIP_AABBS_BIT_KHR specifies that AABB primitives will be skipped during traversal using {@code OpTraceRayKHR}.</li>
            <li>#PIPELINE_CREATE_2_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR specifies that the shader group handles <b>can</b> be saved and reused on a subsequent run (e.g. for trace capture and replay).</li>
            <li>#PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_NV specifies that the pipeline can be used in combination with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#device-generated-commands">Device-Generated Commands</a>.</li>
            <li>#PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_KHR specifies that pipeline creation will fail if a compile is required for creation of a valid {@code VkPipeline} object; #PIPELINE_COMPILE_REQUIRED will be returned by pipeline creation, and the {@code VkPipeline} will be set to #NULL_HANDLE.</li>
            <li>When creating multiple pipelines, #PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT_KHR specifies that control will be returned to the application if any individual pipeline returns a result which is not #SUCCESS rather than continuing to create additional pipelines.</li>
            <li>#PIPELINE_CREATE_2_RAY_TRACING_ALLOW_MOTION_BIT_NV specifies that the pipeline is allowed to use {@code OpTraceRayMotionNV}.</li>
            <li>#PIPELINE_CREATE_2_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR specifies that the pipeline will be used with a fragment shading rate attachment.</li>
            <li>#PIPELINE_CREATE_2_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT specifies that the pipeline will be used with a fragment density map attachment.</li>
            <li>#PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT specifies that pipeline libraries being linked into this library <b>should</b> have link time optimizations applied. If this bit is omitted, implementations <b>should</b> instead perform linking as rapidly as possible.</li>
            <li>#PIPELINE_CREATE_2_RETAIN_LINK_TIME_OPTIMIZATION_INFO_BIT_EXT specifies that pipeline libraries should retain any information necessary to later perform an optimal link with #PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT.</li>
            <li>#PIPELINE_CREATE_2_DESCRIPTOR_BUFFER_BIT_EXT specifies that a pipeline will be used with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorbuffers">descriptor buffers</a>, rather than <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#descriptorsets">descriptor sets</a>.</li>
            <li>#PIPELINE_CREATE_2_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT specifies that the pipeline <b>may</b> be used with an attachment feedback loop including color attachments.</li>
            <li>#PIPELINE_CREATE_2_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT specifies that the pipeline <b>may</b> be used with an attachment feedback loop including depth-stencil attachments.</li>
            <li>#PIPELINE_CREATE_2_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT specifies that the pipeline <b>can</b> be used with acceleration structures which reference an opacity micromap array.</li>
            <li>#PIPELINE_CREATE_2_RAY_TRACING_DISPLACEMENT_MICROMAP_BIT_NV specifies that the pipeline <b>can</b> be used with aceleration structures which reference a displacement micromap array.</li>
            <li>#PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT_EXT specifies that the pipeline <b>must</b> not be bound to a protected command buffer.</li>
            <li>#PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT_EXT specifies that the pipeline <b>must</b> not be bound to an unprotected command buffer.</li>
        </ul>

        It is valid to set both #PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT_KHR and #PIPELINE_CREATE_2_DERIVATIVE_BIT_KHR. This allows a pipeline to be both a parent and possibly a child in a pipeline hierarchy. See <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-pipeline-derivatives">Pipeline Derivatives</a> for more information.

        When an implementation is looking up a pipeline in a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-cache">pipeline cache</a>, if that pipeline is being created using linked libraries, implementations <b>should</b> always return an equivalent pipeline created with #PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT if available, whether or not that bit was specified.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Using #PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT (or not) when linking pipeline libraries is intended as a performance tradeoff between host and device. If the bit is omitted, linking should be faster and produce a pipeline more rapidly, but performance of the pipeline on the target device may be reduced. If the bit is included, linking may be slower but should produce a pipeline with device performance comparable to a monolithically created pipeline. Using both options can allow latency-sensitive applications to generate a suboptimal but usable pipeline quickly, and then perform an optimal link in the background, substituting the result for the suboptimally linked pipeline as soon as it is available.
        </div>
        """,

        "PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT_KHR".enum(0x00000001L),
        "PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT_KHR".enum(0x00000002L),
        "PIPELINE_CREATE_2_DERIVATIVE_BIT_KHR".enum(0x00000004L)
    )

    EnumConstantLong(
        """
        VkBufferUsageFlagBits2KHR - Bitmask controlling how a pipeline is created

        <h5>Description</h5>
        <ul>
            <li>#BUFFER_USAGE_2_TRANSFER_SRC_BIT_KHR specifies that the buffer <b>can</b> be used as the source of a <em>transfer command</em> (see the definition of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-pipeline-stages-transfer">#PIPELINE_STAGE_TRANSFER_BIT</a>).</li>
            <li>#BUFFER_USAGE_2_TRANSFER_DST_BIT_KHR specifies that the buffer <b>can</b> be used as the destination of a transfer command.</li>
            <li>#BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT_KHR specifies that the buffer <b>can</b> be used to create a {@code VkBufferView} suitable for occupying a {@code VkDescriptorSet} slot of type #DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER.</li>
            <li>#BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT_KHR specifies that the buffer <b>can</b> be used to create a {@code VkBufferView} suitable for occupying a {@code VkDescriptorSet} slot of type #DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER.</li>
            <li>#BUFFER_USAGE_2_UNIFORM_BUFFER_BIT_KHR specifies that the buffer <b>can</b> be used in a ##VkDescriptorBufferInfo suitable for occupying a {@code VkDescriptorSet} slot either of type #DESCRIPTOR_TYPE_UNIFORM_BUFFER or #DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC.</li>
            <li>#BUFFER_USAGE_2_STORAGE_BUFFER_BIT_KHR specifies that the buffer <b>can</b> be used in a ##VkDescriptorBufferInfo suitable for occupying a {@code VkDescriptorSet} slot either of type #DESCRIPTOR_TYPE_STORAGE_BUFFER or #DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC.</li>
            <li>#BUFFER_USAGE_2_INDEX_BUFFER_BIT_KHR specifies that the buffer is suitable for passing as the {@code buffer} parameter to #CmdBindIndexBuffer2KHR() and #CmdBindIndexBuffer().</li>
            <li>#BUFFER_USAGE_2_VERTEX_BUFFER_BIT_KHR specifies that the buffer is suitable for passing as an element of the {@code pBuffers} array to #CmdBindVertexBuffers().</li>
            <li>#BUFFER_USAGE_2_INDIRECT_BUFFER_BIT_KHR specifies that the buffer is suitable for passing as the {@code buffer} parameter to #CmdDrawIndirect(), #CmdDrawIndexedIndirect(), #CmdDrawMeshTasksIndirectNV(), #CmdDrawMeshTasksIndirectCountNV(), {@code vkCmdDrawMeshTasksIndirectEXT}, {@code vkCmdDrawMeshTasksIndirectCountEXT}, #CmdDrawClusterIndirectHUAWEI(), or #CmdDispatchIndirect(). It is also suitable for passing as the {@code buffer} member of ##VkIndirectCommandsStreamNV, or {@code sequencesCountBuffer} or {@code sequencesIndexBuffer} or {@code preprocessedBuffer} member of ##VkGeneratedCommandsInfoNV</li>
            <li>#BUFFER_USAGE_2_CONDITIONAL_RENDERING_BIT_EXT specifies that the buffer is suitable for passing as the {@code buffer} parameter to #CmdBeginConditionalRenderingEXT().</li>
            <li>#BUFFER_USAGE_2_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT specifies that the buffer is suitable for using for binding as a transform feedback buffer with #CmdBindTransformFeedbackBuffersEXT().</li>
            <li>#BUFFER_USAGE_2_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT specifies that the buffer is suitable for using as a counter buffer with #CmdBeginTransformFeedbackEXT() and #CmdEndTransformFeedbackEXT().</li>
            <li>#BUFFER_USAGE_2_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT specifies that the buffer is suitable to contain sampler and combined image sampler descriptors when bound as a descriptor buffer. Buffers containing combined image sampler descriptors <b>must</b> also specify #BUFFER_USAGE_2_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT.</li>
            <li>#BUFFER_USAGE_2_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT specifies that the buffer is suitable to contain resource descriptors when bound as a descriptor buffer.</li>
            <li>#BUFFER_USAGE_2_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT specifies that the buffer, when bound, <b>can</b> be used by the implementation to support push descriptors when using descriptor buffers.</li>
            <li>#BUFFER_USAGE_2_RAY_TRACING_BIT_NV specifies that the buffer is suitable for use in #CmdTraceRaysNV().</li>
            <li>#BUFFER_USAGE_2_SHADER_BINDING_TABLE_BIT_KHR specifies that the buffer is suitable for use as a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shader-binding-table">Shader Binding Table</a>.</li>
            <li>#BUFFER_USAGE_2_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR specifies that the buffer is suitable for use as a read-only input to an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#acceleration-structure-building">acceleration structure build</a>.</li>
            <li>#BUFFER_USAGE_2_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR specifies that the buffer is suitable for storage space for a {@code VkAccelerationStructureKHR}.</li>
            <li>#BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT_KHR specifies that the buffer <b>can</b> be used to retrieve a buffer device address via #GetBufferDeviceAddress() and use that address to access the buffer’s memory from a shader.</li>
            <li>#BUFFER_USAGE_2_VIDEO_DECODE_SRC_BIT_KHR specifies that the buffer <b>can</b> be used as the source video bitstream buffer in a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-decode-operations">video decode operation</a>.</li>
            <li>#BUFFER_USAGE_2_VIDEO_DECODE_DST_BIT_KHR is reserved for future use.</li>
            <li>#BUFFER_USAGE_2_VIDEO_ENCODE_DST_BIT_KHR specifies that the buffer <b>can</b> be used as the destination video bitstream buffer in a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-encode-operations">video encode operation</a>.</li>
            <li>#BUFFER_USAGE_2_VIDEO_ENCODE_SRC_BIT_KHR is reserved for future use.</li>
            <li>#BUFFER_USAGE_2_EXECUTION_GRAPH_SCRATCH_BIT_AMDX specifies that the buffer <b>can</b> be used for as scratch memory for <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#executiongraphs">execution graph dispatch</a>.</li>
        </ul>
        """,

        "BUFFER_USAGE_2_TRANSFER_SRC_BIT_KHR".enum(0x00000001L),
        "BUFFER_USAGE_2_TRANSFER_DST_BIT_KHR".enum(0x00000002L),
        "BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT_KHR".enum(0x00000004L),
        "BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT_KHR".enum(0x00000008L),
        "BUFFER_USAGE_2_UNIFORM_BUFFER_BIT_KHR".enum(0x00000010L),
        "BUFFER_USAGE_2_STORAGE_BUFFER_BIT_KHR".enum(0x00000020L),
        "BUFFER_USAGE_2_INDEX_BUFFER_BIT_KHR".enum(0x00000040L),
        "BUFFER_USAGE_2_VERTEX_BUFFER_BIT_KHR".enum(0x00000080L),
        "BUFFER_USAGE_2_INDIRECT_BUFFER_BIT_KHR".enum(0x00000100L)
    )

    void(
        "CmdBindIndexBuffer2KHR",
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

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code offset} <b>must</b> be less than the size of {@code buffer}</li>
            <li>The sum of {@code offset} and the base address of the range of {@code VkDeviceMemory} object that is backing {@code buffer}, <b>must</b> be a multiple of the size of the type indicated by {@code indexType}</li>
            <li>{@code buffer} <b>must</b> have been created with the #BUFFER_USAGE_INDEX_BUFFER_BIT flag</li>
            <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>{@code indexType} <b>must</b> not be #INDEX_TYPE_NONE_KHR</li>
            <li>If {@code indexType} is #INDEX_TYPE_UINT8_EXT, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-indexTypeUint8">{@code indexTypeUint8}</a> feature <b>must</b> be enabled</li>
            <li>If {@code size} is not #WHOLE_SIZE, {@code size} <b>must</b> be a multiple of the size of the type indicated by {@code indexType}</li>
            <li>If {@code size} is not #WHOLE_SIZE, the sum of {@code offset} and {@code size} <b>must</b> be less than or equal to the size of {@code buffer}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
            <li>{@code indexType} <b>must</b> be a valid {@code VkIndexType} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>Both of {@code buffer}, and {@code commandBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
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
        "GetRenderingAreaGranularityKHR",
        """
        Returns the granularity for dynamic rendering optimal render area.

        <h5>C Specification</h5>
        To query the render area granularity for a render pass instance, call:

        <pre><code>
￿void vkGetRenderingAreaGranularityKHR(
￿    VkDevice                                    device,
￿    const VkRenderingAreaInfoKHR*               pRenderingAreaInfo,
￿    VkExtent2D*                                 pGranularity);</code></pre>

        <h5>Description</h5>
        The conditions leading to an optimal {@code renderArea} are:

        <ul>
            <li>the {@code offset.x} member in {@code renderArea} is a multiple of the {@code width} member of the returned ##VkExtent2D (the horizontal granularity).</li>
            <li>the {@code offset.y} member in {@code renderArea} is a multiple of the {@code height} member of the returned ##VkExtent2D (the vertical granularity).</li>
            <li>either the {@code extent.width} member in {@code renderArea} is a multiple of the horizontal granularity or {@code offset.x}+{@code extent.width} is equal to the {@code width} of the {@code framebuffer} in the ##VkRenderPassBeginInfo.</li>
            <li>either the {@code extent.height} member in {@code renderArea} is a multiple of the vertical granularity or {@code offset.y}+{@code extent.height} is equal to the {@code height} of the {@code framebuffer} in the ##VkRenderPassBeginInfo.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pRenderingAreaInfo} <b>must</b> be a valid pointer to a valid ##VkRenderingAreaInfoKHR structure</li>
            <li>{@code pGranularity} <b>must</b> be a valid pointer to a ##VkExtent2D structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkExtent2D, ##VkRenderingAreaInfoKHR
        """,

        VkDevice("device", "the logical device that owns the render pass instance."),
        VkRenderingAreaInfoKHR.const.p("pRenderingAreaInfo", "a pointer to a ##VkRenderingAreaInfoKHR structure specifying details of the render pass instance to query the render area granularity for."),
        VkExtent2D.p("pGranularity", "a pointer to a ##VkExtent2D structure in which the granularity is returned.")
    )

    void(
        "GetDeviceImageSubresourceLayoutKHR",
        """
        Retrieve information about an image subresource without an image object.

        <h5>C Specification</h5>
        To query the memory layout of an image subresource, without an image object, call:

        <pre><code>
￿void vkGetDeviceImageSubresourceLayoutKHR(
￿    VkDevice                                    device,
￿    const VkDeviceImageSubresourceInfoKHR*      pInfo,
￿    VkSubresourceLayout2KHR*                    pLayout);</code></pre>

        <h5>Description</h5>
        {@code vkGetDeviceImageSubresourceLayoutKHR} behaves similarly to #GetImageSubresourceLayout2KHR(), but uses a ##VkImageCreateInfo structure to specify the image rather than a {@code VkImage} object.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkDeviceImageSubresourceInfoKHR structure</li>
            <li>{@code pLayout} <b>must</b> be a valid pointer to a ##VkSubresourceLayout2KHR structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkDeviceImageSubresourceInfoKHR, ##VkSubresourceLayout2KHR
        """,

        VkDevice("device", "the logical device that owns the image."),
        VkDeviceImageSubresourceInfoKHR.const.p("pInfo", "a pointer to a ##VkDeviceImageSubresourceInfoKHR structure containing parameters required for the subresource layout query."),
        VkSubresourceLayout2KHR.p("pLayout", "a pointer to a ##VkSubresourceLayout2KHR structure in which the layout is returned.")
    )

    void(
        "GetImageSubresourceLayout2KHR",
        """
        Retrieve information about an image subresource.

        <h5>C Specification</h5>
        To query the memory layout of an image subresource, call:

        <pre><code>
￿void vkGetImageSubresourceLayout2KHR(
￿    VkDevice                                    device,
￿    VkImage                                     image,
￿    const VkImageSubresource2KHR*               pSubresource,
￿    VkSubresourceLayout2KHR*                    pLayout);</code></pre>

        or the equivalent command

        <pre><code>
￿void vkGetImageSubresourceLayout2EXT(
￿    VkDevice                                    device,
￿    VkImage                                     image,
￿    const VkImageSubresource2KHR*               pSubresource,
￿    VkSubresourceLayout2KHR*                    pLayout);</code></pre>

        <h5>Description</h5>
        {@code vkGetImageSubresourceLayout2KHR} behaves similarly to #GetImageSubresourceLayout(), with the ability to specify extended inputs via chained input structures, and to return extended information via chained output structures.

        It is legal to call {@code vkGetImageSubresourceLayout2KHR} with a {@code image} created with {@code tiling} equal to #IMAGE_TILING_OPTIMAL, but the members of ##VkSubresourceLayout2KHR{@code ::subresourceLayout} will have undefined values in this case.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Structures chained from ##VkImageSubresource2KHR{@code ::pNext} will also be updated when {@code tiling} is equal to #IMAGE_TILING_OPTIMAL.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code aspectMask} member of {@code pSubresource} <b>must</b> only have a single bit set</li>
            <li>The {@code mipLevel} member of {@code pSubresource} <b>must</b> be less than the {@code mipLevels} specified in ##VkImageCreateInfo when {@code image} was created</li>
            <li>The {@code arrayLayer} member of {@code pSubresource} <b>must</b> be less than the {@code arrayLayers} specified in ##VkImageCreateInfo when {@code image} was created</li>
            <li>If {@code format} of the {@code image} is a color format, {@code tiling} of the {@code image} is #IMAGE_TILING_LINEAR or #IMAGE_TILING_OPTIMAL, and does not have a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a>, the {@code aspectMask} member of {@code pSubresource} <b>must</b> be #IMAGE_ASPECT_COLOR_BIT</li>
            <li>If {@code format} of the {@code image} has a depth component, the {@code aspectMask} member of {@code pSubresource} <b>must</b> contain #IMAGE_ASPECT_DEPTH_BIT</li>
            <li>If {@code format} of the {@code image} has a stencil component, the {@code aspectMask} member of {@code pSubresource} <b>must</b> contain #IMAGE_ASPECT_STENCIL_BIT</li>
            <li>If {@code format} of the {@code image} does not contain a stencil or depth component, the {@code aspectMask} member of {@code pSubresource} <b>must</b> not contain #IMAGE_ASPECT_DEPTH_BIT or #IMAGE_ASPECT_STENCIL_BIT</li>
            <li>If the {@code tiling} of the {@code image} is #IMAGE_TILING_LINEAR and has a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a>, then the {@code aspectMask} member of {@code pSubresource} <b>must</b> be a single valid <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#formats-planes-image-aspect">multi-planar aspect mask</a> bit</li>
            <li>If {@code image} was created with the #EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID external memory handle type, then {@code image} <b>must</b> be bound to memory</li>
            <li>If the {@code tiling} of the {@code image} is #IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT, then the {@code aspectMask} member of {@code pSubresource} <b>must</b> be <code>VK_IMAGE_ASPECT_MEMORY_PLANE<em>_i_</em>BIT_EXT</code> and the index <em>i</em> <b>must</b> be less than the ##VkDrmFormatModifierPropertiesEXT{@code ::drmFormatModifierPlaneCount} associated with the image’s {@code format} and ##VkImageDrmFormatModifierPropertiesEXT{@code ::drmFormatModifier}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
            <li>{@code pSubresource} <b>must</b> be a valid pointer to a valid ##VkImageSubresource2KHR structure</li>
            <li>{@code pLayout} <b>must</b> be a valid pointer to a ##VkSubresourceLayout2KHR structure</li>
            <li>{@code image} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>See Also</h5>
        ##VkImageSubresource2KHR, ##VkSubresourceLayout2KHR
        """,

        VkDevice("device", "the logical device that owns the image."),
        VkImage("image", "the image whose layout is being queried."),
        VkImageSubresource2KHR.const.p("pSubresource", "a pointer to a ##VkImageSubresource2KHR structure selecting a specific image for the image subresource."),
        VkSubresourceLayout2KHR.p("pLayout", "a pointer to a ##VkSubresourceLayout2KHR structure in which the layout is returned.")
    )
}