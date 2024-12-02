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
            <li>A new command #CmdBindIndexBuffer2KHR(), allowing a range of memory to be bound as an index buffer</li>
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
            <li>A property to indicate whether {@code PointSize} controls the final rasterization of polygons if <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#primsrast-polygonmode">polygon mode</a> is #POLYGON_MODE_POINT</li>
            <li>Two properties to indicate the non-strict line rasterization algorithm used</li>
            <li>Two new flags words {@code VkPipelineCreateFlagBits2KHR} and {@code VkBufferUsageFlagBits2KHR}</li>
            <li>Physical-device-level functions can now be called with any value in the valid range for a type beyond the defined enumerants, such that applications can avoid checking individual features, extensions, or versions before querying supported properties of a particular enumerant.</li>
            <li>Clarification that copies between images of any type are allowed, treating 1D images as 2D images with a height of 1.</li>
        </ul>

        <h5>Promotion to Vulkan 1.4</h5>
        Functionality in this extension is included in core Vulkan 1.4 with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

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
            <dd><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#versions-1.1">Version 1.1</a> and {@link KHRDynamicRendering VK_KHR_dynamic_rendering} or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#versions-1.3">Version 1.3</a></dd>

            <dt><b>API Interactions</b></dt>
            <dd><ul>
                <li>Interacts with VK_VERSION_1_2</li>
                <li>Interacts with VK_VERSION_1_3</li>
                <li>Interacts with VK_VERSION_1_4</li>
                <li>Interacts with VK_EXT_attachment_feedback_loop_layout</li>
                <li>Interacts with VK_EXT_buffer_device_address</li>
                <li>Interacts with VK_EXT_conditional_rendering</li>
                <li>Interacts with VK_EXT_descriptor_buffer</li>
                <li>Interacts with VK_EXT_fragment_density_map</li>
                <li>Interacts with VK_EXT_graphics_pipeline_library</li>
                <li>Interacts with VK_EXT_opacity_micromap</li>
                <li>Interacts with VK_EXT_pipeline_creation_cache_control</li>
                <li>Interacts with VK_EXT_pipeline_protected_access</li>
                <li>Interacts with VK_EXT_transform_feedback</li>
                <li>Interacts with VK_KHR_acceleration_structure</li>
                <li>Interacts with VK_KHR_buffer_device_address</li>
                <li>Interacts with VK_KHR_dynamic_rendering</li>
                <li>Interacts with VK_KHR_fragment_shading_rate</li>
                <li>Interacts with VK_KHR_pipeline_executable_properties</li>
                <li>Interacts with VK_KHR_pipeline_library</li>
                <li>Interacts with VK_KHR_ray_tracing_pipeline</li>
                <li>Interacts with VK_KHR_video_decode_queue</li>
                <li>Interacts with VK_KHR_video_encode_queue</li>
                <li>Interacts with VK_NV_device_generated_commands</li>
                <li>Interacts with VK_NV_displacement_micromap</li>
                <li>Interacts with VK_NV_ray_tracing</li>
                <li>Interacts with VK_NV_ray_tracing_motion_blur</li>
            </ul></dd>

            <dt><b>Deprecation State</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to Vulkan 1.4</li>
            </ul></dd>

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

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2}.",

        "PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT_KHR".enum(0x00000001L),
        "PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT_KHR".enum(0x00000002L),
        "PIPELINE_CREATE_2_DERIVATIVE_BIT_KHR".enum(0x00000004L),
        "PIPELINE_CREATE_2_ENABLE_LEGACY_DITHERING_BIT_EXT".enum(0x400000000L), // TODO: bug in Vulkan-Docs?
        "PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR".enum(0x00000008L),
        "PIPELINE_CREATE_2_DISPATCH_BASE_BIT_KHR".enum(0x00000010L)
    )

    EnumConstantLong(
        "Extends {@code VkBufferUsageFlagBits2}.",

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

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO_KHR".."1000470005",
        "STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO_KHR".."1000470006"
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2}.",

        "PIPELINE_CREATE_2_DEFER_COMPILE_BIT_NV".enum(0x00000020L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2}.",

        "PIPELINE_CREATE_2_CAPTURE_STATISTICS_BIT_KHR".enum(0x00000040L),
        "PIPELINE_CREATE_2_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR".enum(0x00000080L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2}.",

        "PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_KHR".enum(0x00000100L),
        "PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT_KHR".enum(0x00000200L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2}.",

        "PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT".enum(0x00000400L),
        "PIPELINE_CREATE_2_RETAIN_LINK_TIME_OPTIMIZATION_INFO_BIT_EXT".enum(0x00800000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2}.",

        "PIPELINE_CREATE_2_LIBRARY_BIT_KHR".enum(0x00000800L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2}.",

        "PIPELINE_CREATE_2_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR".enum(0x00001000L),
        "PIPELINE_CREATE_2_RAY_TRACING_SKIP_AABBS_BIT_KHR".enum(0x00002000L),
        "PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR".enum(0x00004000L),
        "PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR".enum(0x00008000L),
        "PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR".enum(0x00010000L),
        "PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR".enum(0x00020000L),
        "PIPELINE_CREATE_2_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR".enum(0x00080000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2}.",

        "PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_NV".enum(0x00040000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2}.",

        "PIPELINE_CREATE_2_RAY_TRACING_ALLOW_MOTION_BIT_NV".enum(0x00100000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2}.",

        "PIPELINE_CREATE_2_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR".enum(0x00200000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2}.",

        "PIPELINE_CREATE_2_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT".enum(0x00400000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2}.",

        "PIPELINE_CREATE_2_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT".enum(0x01000000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2}.",

        "PIPELINE_CREATE_2_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT".enum(0x02000000L),
        "PIPELINE_CREATE_2_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT".enum(0x04000000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2}.",

        "PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT_EXT".enum(0x08000000L),
        "PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT_EXT".enum(0x40000000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2}.",

        "PIPELINE_CREATE_2_RAY_TRACING_DISPLACEMENT_MICROMAP_BIT_NV".enum(0x10000000L)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2}.",

        "PIPELINE_CREATE_2_DESCRIPTOR_BUFFER_BIT_EXT".enum(0x20000000L)
    )

    EnumConstantLong(
        "Extends {@code VkBufferUsageFlagBits2}.",

        "BUFFER_USAGE_2_CONDITIONAL_RENDERING_BIT_EXT".enum(0x00000200L)
    )

    EnumConstantLong(
        "Extends {@code VkBufferUsageFlagBits2}.",

        "BUFFER_USAGE_2_SHADER_BINDING_TABLE_BIT_KHR".enum(0x00000400L)
    )

    EnumConstantLong(
        "Extends {@code VkBufferUsageFlagBits2}.",

        "BUFFER_USAGE_2_RAY_TRACING_BIT_NV".enum(0x00000400L)
    )

    EnumConstantLong(
        "Extends {@code VkBufferUsageFlagBits2}.",

        "BUFFER_USAGE_2_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT".enum(0x00000800L),
        "BUFFER_USAGE_2_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT".enum(0x00001000L)
    )

    EnumConstantLong(
        "Extends {@code VkBufferUsageFlagBits2}.",

        "BUFFER_USAGE_2_VIDEO_DECODE_SRC_BIT_KHR".enum(0x00002000L),
        "BUFFER_USAGE_2_VIDEO_DECODE_DST_BIT_KHR".enum(0x00004000L)
    )

    EnumConstantLong(
        "Extends {@code VkBufferUsageFlagBits2}.",

        "BUFFER_USAGE_2_VIDEO_ENCODE_DST_BIT_KHR".enum(0x00008000L),
        "BUFFER_USAGE_2_VIDEO_ENCODE_SRC_BIT_KHR".enum(0x00010000L)
    )

    EnumConstantLong(
        "Extends {@code VkBufferUsageFlagBits2}.",

        "BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT_KHR".enum(0x00020000L)
    )

    EnumConstantLong(
        "Extends {@code VkBufferUsageFlagBits2}.",

        "BUFFER_USAGE_2_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR".enum(0x00080000L),
        "BUFFER_USAGE_2_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR".enum(0x00100000L)
    )

    EnumConstantLong(
        "Extends {@code VkBufferUsageFlagBits2}.",

        "BUFFER_USAGE_2_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT".enum(0x00200000L),
        "BUFFER_USAGE_2_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT".enum(0x00400000L),
        "BUFFER_USAGE_2_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT".enum(0x04000000L)
    )

    EnumConstantLong(
        "Extends {@code VkBufferUsageFlagBits2}.",

        "BUFFER_USAGE_2_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT".enum(0x00800000L),
        "BUFFER_USAGE_2_MICROMAP_STORAGE_BIT_EXT".enum(0x01000000L)
    )

    void(
        "CmdBindIndexBuffer2KHR",
        "See #CmdBindIndexBuffer2().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command is recorded."),
        VkBuffer("buffer", "the buffer being bound."),
        VkDeviceSize("offset", "the starting offset in bytes within {@code buffer} used in index buffer address calculations."),
        VkDeviceSize("size", "the size in bytes of index data bound from {@code buffer}."),
        VkIndexType("indexType", "a {@code VkIndexType} value specifying the size of the indices.")
    )

    void(
        "GetRenderingAreaGranularityKHR",
        "See #GetRenderingAreaGranularity().",

        VkDevice("device", "the logical device that owns the render pass instance."),
        VkRenderingAreaInfo.const.p("pRenderingAreaInfo", "a pointer to a ##VkRenderingAreaInfo structure specifying details of the render pass instance to query the render area granularity for."),
        VkExtent2D.p("pGranularity", "a pointer to a ##VkExtent2D structure in which the granularity is returned.")
    )

    void(
        "GetDeviceImageSubresourceLayoutKHR",
        "See #GetDeviceImageSubresourceLayout().",

        VkDevice("device", "the logical device that owns the image."),
        VkDeviceImageSubresourceInfo.const.p("pInfo", "a pointer to a ##VkDeviceImageSubresourceInfo structure containing parameters required for the subresource layout query."),
        VkSubresourceLayout2.p("pLayout", "a pointer to a ##VkSubresourceLayout2 structure in which the layout is returned.")
    )

    void(
        "GetImageSubresourceLayout2KHR",
        "See #GetImageSubresourceLayout2().",

        VkDevice("device", "the logical device that owns the image."),
        VkImage("image", "the image whose layout is being queried."),
        VkImageSubresource2.const.p("pSubresource", "a pointer to a ##VkImageSubresource2 structure selecting a specific image for the image subresource."),
        VkSubresourceLayout2.p("pLayout", "a pointer to a ##VkSubresourceLayout2 structure in which the layout is returned.")
    )
}