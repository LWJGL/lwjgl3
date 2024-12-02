/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * {@code VK_KHR_maintenance5} adds a collection of minor features, none of which would warrant an entire extension of their own.
 * 
 * <p>The new features are as follows:</p>
 * 
 * <ul>
 * <li>A new {@link #VK_FORMAT_A1B5G5R5_UNORM_PACK16_KHR FORMAT_A1B5G5R5_UNORM_PACK16_KHR} format</li>
 * <li>A new {@link #VK_FORMAT_A8_UNORM_KHR FORMAT_A8_UNORM_KHR} format</li>
 * <li>A property to indicate that multisample coverage operations are performed after sample counting in EarlyFragmentTests mode</li>
 * <li>Relax VkBufferView creation requirements by allowing subsets of the associated VkBuffer usage using {@link VkBufferUsageFlags2CreateInfoKHR}</li>
 * <li>A new command {@link #vkCmdBindIndexBuffer2KHR CmdBindIndexBuffer2KHR}, allowing a range of memory to be bound as an index buffer</li>
 * <li>{@link VK10#vkGetDeviceProcAddr GetDeviceProcAddr} must return {@code NULL} for supported core functions beyond the version requested by the application.</li>
 * <li>A property to indicate that the sample mask test is performed after sample counting in EarlyFragmentTests mode</li>
 * <li>{@code vkCmdBindVertexBuffers2} now supports using {@code VK_WHOLE_SIZE} in the {@code pSizes} parameter.</li>
 * <li>A default size of 1.0 is used if {@code PointSize} is not written</li>
 * <li>Shader modules are deprecated - applications can now pass {@link VkShaderModuleCreateInfo} as a chained struct to pipeline creation via {@link VkPipelineShaderStageCreateInfo}</li>
 * <li>A function {@link #vkGetRenderingAreaGranularityKHR GetRenderingAreaGranularityKHR} to query the optimal render area for a dynamic rendering instance.</li>
 * <li>A property to indicate that depth/stencil texturing operations with {@link VK10#VK_COMPONENT_SWIZZLE_ONE COMPONENT_SWIZZLE_ONE} have defined behavior</li>
 * <li>Add {@link #vkGetImageSubresourceLayout2KHR GetImageSubresourceLayout2KHR} and a new function {@link #vkGetDeviceImageSubresourceLayoutKHR GetDeviceImageSubresourceLayoutKHR} to allow the application to query the image memory layout without having to create an image object and query it.</li>
 * <li>Allow {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS} as the {@code layerCount} member of {@link VkImageSubresourceLayers}</li>
 * <li>Adds stronger guarantees for propagation of {@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST} return values</li>
 * <li>A property to indicate whether {@code PointSize} controls the final rasterization of polygons if <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#primsrast-polygonmode">polygon mode</a> is {@link VK10#VK_POLYGON_MODE_POINT POLYGON_MODE_POINT}</li>
 * <li>Two properties to indicate the non-strict line rasterization algorithm used</li>
 * <li>Two new flags words {@code VkPipelineCreateFlagBits2KHR} and {@code VkBufferUsageFlagBits2KHR}</li>
 * <li>Physical-device-level functions can now be called with any value in the valid range for a type beyond the defined enumerants, such that applications can avoid checking individual features, extensions, or versions before querying supported properties of a particular enumerant.</li>
 * <li>Clarification that copies between images of any type are allowed, treating 1D images as 2D images with a height of 1.</li>
 * </ul>
 * 
 * <h5>Promotion to Vulkan 1.4</h5>
 * 
 * <p>Functionality in this extension is included in core Vulkan 1.4 with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_maintenance5}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>471</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#versions-1.1">Version 1.1</a> and {@link KHRDynamicRendering VK_KHR_dynamic_rendering} or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#versions-1.3">Version 1.3</a></dd>
 * <dt><b>API Interactions</b></dt>
 * <dd><ul>
 * <li>Interacts with VK_VERSION_1_2</li>
 * <li>Interacts with VK_VERSION_1_3</li>
 * <li>Interacts with VK_VERSION_1_4</li>
 * <li>Interacts with VK_EXT_attachment_feedback_loop_layout</li>
 * <li>Interacts with VK_EXT_buffer_device_address</li>
 * <li>Interacts with VK_EXT_conditional_rendering</li>
 * <li>Interacts with VK_EXT_descriptor_buffer</li>
 * <li>Interacts with VK_EXT_fragment_density_map</li>
 * <li>Interacts with VK_EXT_graphics_pipeline_library</li>
 * <li>Interacts with VK_EXT_opacity_micromap</li>
 * <li>Interacts with VK_EXT_pipeline_creation_cache_control</li>
 * <li>Interacts with VK_EXT_pipeline_protected_access</li>
 * <li>Interacts with VK_EXT_transform_feedback</li>
 * <li>Interacts with VK_KHR_acceleration_structure</li>
 * <li>Interacts with VK_KHR_buffer_device_address</li>
 * <li>Interacts with VK_KHR_dynamic_rendering</li>
 * <li>Interacts with VK_KHR_fragment_shading_rate</li>
 * <li>Interacts with VK_KHR_pipeline_executable_properties</li>
 * <li>Interacts with VK_KHR_pipeline_library</li>
 * <li>Interacts with VK_KHR_ray_tracing_pipeline</li>
 * <li>Interacts with VK_KHR_video_decode_queue</li>
 * <li>Interacts with VK_KHR_video_encode_queue</li>
 * <li>Interacts with VK_NV_device_generated_commands</li>
 * <li>Interacts with VK_NV_displacement_micromap</li>
 * <li>Interacts with VK_NV_ray_tracing</li>
 * <li>Interacts with VK_NV_ray_tracing_motion_blur</li>
 * </ul></dd>
 * <dt><b>Deprecation State</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to Vulkan 1.4</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Stu Smith <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_maintenance5]%20@stu-s%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_maintenance5%20extension*">stu-s</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_maintenance5.adoc">VK_KHR_maintenance5</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-05-02</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Stu Smith, AMD</li>
 * <li>Tobias Hector, AMD</li>
 * <li>Shahbaz Youssefi, Google</li>
 * <li>Slawomir Cygan, Intel</li>
 * <li>Lionel Landwerlin, Intel</li>
 * <li>James Fitzpatrick, Imagination Technologies</li>
 * <li>Andrew Garrard, Imagination Technologies</li>
 * <li>Ralph Potter, Samsung</li>
 * <li>Pan Gao, Huawei</li>
 * <li>Jan-Harald Fredriksen, ARM</li>
 * <li>Jon Leech, Khronos</li>
 * <li>Mike Blumenkrantz, Valve</li>
 * </ul></dd>
 * </dl>
 */
public class KHRMaintenance5 {

    /** The extension specification version. */
    public static final int VK_KHR_MAINTENANCE_5_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_MAINTENANCE_5_EXTENSION_NAME = "VK_KHR_maintenance5";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDERING_AREA_INFO_KHR STRUCTURE_TYPE_RENDERING_AREA_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO_KHR STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_KHR STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_KHR STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES_KHR   = 1000470000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES_KHR = 1000470001,
        VK_STRUCTURE_TYPE_RENDERING_AREA_INFO_KHR                      = 1000470003,
        VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO_KHR            = 1000470004,
        VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_KHR                     = 1000338002,
        VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_KHR                      = 1000338003;

    /**
     * Extends {@code VkFormat}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_FORMAT_A1B5G5R5_UNORM_PACK16_KHR FORMAT_A1B5G5R5_UNORM_PACK16_KHR}</li>
     * <li>{@link #VK_FORMAT_A8_UNORM_KHR FORMAT_A8_UNORM_KHR}</li>
     * </ul>
     */
    public static final int
        VK_FORMAT_A1B5G5R5_UNORM_PACK16_KHR = 1000470000,
        VK_FORMAT_A8_UNORM_KHR              = 1000470001;

    /**
     * Extends {@code VkPipelineCreateFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT_KHR PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT_KHR PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_CREATE_2_DERIVATIVE_BIT_KHR PIPELINE_CREATE_2_DERIVATIVE_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_CREATE_2_ENABLE_LEGACY_DITHERING_BIT_EXT PIPELINE_CREATE_2_ENABLE_LEGACY_DITHERING_BIT_EXT}</li>
     * <li>{@link #VK_PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_CREATE_2_DISPATCH_BASE_BIT_KHR PIPELINE_CREATE_2_DISPATCH_BASE_BIT_KHR}</li>
     * </ul>
     */
    public static final long
        VK_PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT_KHR         = 0x1L,
        VK_PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT_KHR            = 0x2L,
        VK_PIPELINE_CREATE_2_DERIVATIVE_BIT_KHR                   = 0x4L,
        VK_PIPELINE_CREATE_2_ENABLE_LEGACY_DITHERING_BIT_EXT      = 0x400000000L,
        VK_PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR = 0x8L,
        VK_PIPELINE_CREATE_2_DISPATCH_BASE_BIT_KHR                = 0x10L;

    /**
     * Extends {@code VkBufferUsageFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_BUFFER_USAGE_2_TRANSFER_SRC_BIT_KHR BUFFER_USAGE_2_TRANSFER_SRC_BIT_KHR}</li>
     * <li>{@link #VK_BUFFER_USAGE_2_TRANSFER_DST_BIT_KHR BUFFER_USAGE_2_TRANSFER_DST_BIT_KHR}</li>
     * <li>{@link #VK_BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT_KHR BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT_KHR}</li>
     * <li>{@link #VK_BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT_KHR BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT_KHR}</li>
     * <li>{@link #VK_BUFFER_USAGE_2_UNIFORM_BUFFER_BIT_KHR BUFFER_USAGE_2_UNIFORM_BUFFER_BIT_KHR}</li>
     * <li>{@link #VK_BUFFER_USAGE_2_STORAGE_BUFFER_BIT_KHR BUFFER_USAGE_2_STORAGE_BUFFER_BIT_KHR}</li>
     * <li>{@link #VK_BUFFER_USAGE_2_INDEX_BUFFER_BIT_KHR BUFFER_USAGE_2_INDEX_BUFFER_BIT_KHR}</li>
     * <li>{@link #VK_BUFFER_USAGE_2_VERTEX_BUFFER_BIT_KHR BUFFER_USAGE_2_VERTEX_BUFFER_BIT_KHR}</li>
     * <li>{@link #VK_BUFFER_USAGE_2_INDIRECT_BUFFER_BIT_KHR BUFFER_USAGE_2_INDIRECT_BUFFER_BIT_KHR}</li>
     * </ul>
     */
    public static final long
        VK_BUFFER_USAGE_2_TRANSFER_SRC_BIT_KHR         = 0x1L,
        VK_BUFFER_USAGE_2_TRANSFER_DST_BIT_KHR         = 0x2L,
        VK_BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT_KHR = 0x4L,
        VK_BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT_KHR = 0x8L,
        VK_BUFFER_USAGE_2_UNIFORM_BUFFER_BIT_KHR       = 0x10L,
        VK_BUFFER_USAGE_2_STORAGE_BUFFER_BIT_KHR       = 0x20L,
        VK_BUFFER_USAGE_2_INDEX_BUFFER_BIT_KHR         = 0x40L,
        VK_BUFFER_USAGE_2_VERTEX_BUFFER_BIT_KHR        = 0x80L,
        VK_BUFFER_USAGE_2_INDIRECT_BUFFER_BIT_KHR      = 0x100L;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO_KHR STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO_KHR STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO_KHR = 1000470005,
        VK_STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO_KHR    = 1000470006;

    /** Extends {@code VkPipelineCreateFlagBits2}. */
    public static final long VK_PIPELINE_CREATE_2_DEFER_COMPILE_BIT_NV = 0x20L;

    /**
     * Extends {@code VkPipelineCreateFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_CREATE_2_CAPTURE_STATISTICS_BIT_KHR PIPELINE_CREATE_2_CAPTURE_STATISTICS_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_CREATE_2_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR PIPELINE_CREATE_2_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR}</li>
     * </ul>
     */
    public static final long
        VK_PIPELINE_CREATE_2_CAPTURE_STATISTICS_BIT_KHR               = 0x40L,
        VK_PIPELINE_CREATE_2_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR = 0x80L;

    /**
     * Extends {@code VkPipelineCreateFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_KHR PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT_KHR PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT_KHR}</li>
     * </ul>
     */
    public static final long
        VK_PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_KHR = 0x100L,
        VK_PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT_KHR           = 0x200L;

    /**
     * Extends {@code VkPipelineCreateFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT}</li>
     * <li>{@link #VK_PIPELINE_CREATE_2_RETAIN_LINK_TIME_OPTIMIZATION_INFO_BIT_EXT PIPELINE_CREATE_2_RETAIN_LINK_TIME_OPTIMIZATION_INFO_BIT_EXT}</li>
     * </ul>
     */
    public static final long
        VK_PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT             = 0x400L,
        VK_PIPELINE_CREATE_2_RETAIN_LINK_TIME_OPTIMIZATION_INFO_BIT_EXT = 0x800000L;

    /** Extends {@code VkPipelineCreateFlagBits2}. */
    public static final long VK_PIPELINE_CREATE_2_LIBRARY_BIT_KHR = 0x800L;

    /**
     * Extends {@code VkPipelineCreateFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_CREATE_2_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR PIPELINE_CREATE_2_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_CREATE_2_RAY_TRACING_SKIP_AABBS_BIT_KHR PIPELINE_CREATE_2_RAY_TRACING_SKIP_AABBS_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_CREATE_2_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR PIPELINE_CREATE_2_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR}</li>
     * </ul>
     */
    public static final long
        VK_PIPELINE_CREATE_2_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR                     = 0x1000L,
        VK_PIPELINE_CREATE_2_RAY_TRACING_SKIP_AABBS_BIT_KHR                         = 0x2000L,
        VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR            = 0x4000L,
        VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR        = 0x8000L,
        VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR               = 0x10000L,
        VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR       = 0x20000L,
        VK_PIPELINE_CREATE_2_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR = 0x80000L;

    /** Extends {@code VkPipelineCreateFlagBits2}. */
    public static final long VK_PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_NV = 0x40000L;

    /** Extends {@code VkPipelineCreateFlagBits2}. */
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_ALLOW_MOTION_BIT_NV = 0x100000L;

    /** Extends {@code VkPipelineCreateFlagBits2}. */
    public static final long VK_PIPELINE_CREATE_2_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 0x200000L;

    /** Extends {@code VkPipelineCreateFlagBits2}. */
    public static final long VK_PIPELINE_CREATE_2_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT = 0x400000L;

    /** Extends {@code VkPipelineCreateFlagBits2}. */
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT = 0x1000000L;

    /**
     * Extends {@code VkPipelineCreateFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_CREATE_2_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT PIPELINE_CREATE_2_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT}</li>
     * <li>{@link #VK_PIPELINE_CREATE_2_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT PIPELINE_CREATE_2_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT}</li>
     * </ul>
     */
    public static final long
        VK_PIPELINE_CREATE_2_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT         = 0x2000000L,
        VK_PIPELINE_CREATE_2_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT = 0x4000000L;

    /**
     * Extends {@code VkPipelineCreateFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT_EXT PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT_EXT}</li>
     * <li>{@link #VK_PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT_EXT PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT_EXT}</li>
     * </ul>
     */
    public static final long
        VK_PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT_EXT   = 0x8000000L,
        VK_PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT_EXT = 0x40000000L;

    /** Extends {@code VkPipelineCreateFlagBits2}. */
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_DISPLACEMENT_MICROMAP_BIT_NV = 0x10000000L;

    /** Extends {@code VkPipelineCreateFlagBits2}. */
    public static final long VK_PIPELINE_CREATE_2_DESCRIPTOR_BUFFER_BIT_EXT = 0x20000000L;

    /** Extends {@code VkBufferUsageFlagBits2}. */
    public static final long VK_BUFFER_USAGE_2_CONDITIONAL_RENDERING_BIT_EXT = 0x200L;

    /** Extends {@code VkBufferUsageFlagBits2}. */
    public static final long VK_BUFFER_USAGE_2_SHADER_BINDING_TABLE_BIT_KHR = 0x400L;

    /** Extends {@code VkBufferUsageFlagBits2}. */
    public static final long VK_BUFFER_USAGE_2_RAY_TRACING_BIT_NV = 0x400L;

    /**
     * Extends {@code VkBufferUsageFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_BUFFER_USAGE_2_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT BUFFER_USAGE_2_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT}</li>
     * <li>{@link #VK_BUFFER_USAGE_2_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT BUFFER_USAGE_2_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT}</li>
     * </ul>
     */
    public static final long
        VK_BUFFER_USAGE_2_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT         = 0x800L,
        VK_BUFFER_USAGE_2_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT = 0x1000L;

    /**
     * Extends {@code VkBufferUsageFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_BUFFER_USAGE_2_VIDEO_DECODE_SRC_BIT_KHR BUFFER_USAGE_2_VIDEO_DECODE_SRC_BIT_KHR}</li>
     * <li>{@link #VK_BUFFER_USAGE_2_VIDEO_DECODE_DST_BIT_KHR BUFFER_USAGE_2_VIDEO_DECODE_DST_BIT_KHR}</li>
     * </ul>
     */
    public static final long
        VK_BUFFER_USAGE_2_VIDEO_DECODE_SRC_BIT_KHR = 0x2000L,
        VK_BUFFER_USAGE_2_VIDEO_DECODE_DST_BIT_KHR = 0x4000L;

    /**
     * Extends {@code VkBufferUsageFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_BUFFER_USAGE_2_VIDEO_ENCODE_DST_BIT_KHR BUFFER_USAGE_2_VIDEO_ENCODE_DST_BIT_KHR}</li>
     * <li>{@link #VK_BUFFER_USAGE_2_VIDEO_ENCODE_SRC_BIT_KHR BUFFER_USAGE_2_VIDEO_ENCODE_SRC_BIT_KHR}</li>
     * </ul>
     */
    public static final long
        VK_BUFFER_USAGE_2_VIDEO_ENCODE_DST_BIT_KHR = 0x8000L,
        VK_BUFFER_USAGE_2_VIDEO_ENCODE_SRC_BIT_KHR = 0x10000L;

    /** Extends {@code VkBufferUsageFlagBits2}. */
    public static final long VK_BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT_KHR = 0x20000L;

    /**
     * Extends {@code VkBufferUsageFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_BUFFER_USAGE_2_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR BUFFER_USAGE_2_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR}</li>
     * <li>{@link #VK_BUFFER_USAGE_2_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR BUFFER_USAGE_2_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR}</li>
     * </ul>
     */
    public static final long
        VK_BUFFER_USAGE_2_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR = 0x80000L,
        VK_BUFFER_USAGE_2_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR               = 0x100000L;

    /**
     * Extends {@code VkBufferUsageFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_BUFFER_USAGE_2_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_2_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * <li>{@link #VK_BUFFER_USAGE_2_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_2_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * <li>{@link #VK_BUFFER_USAGE_2_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT BUFFER_USAGE_2_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT}</li>
     * </ul>
     */
    public static final long
        VK_BUFFER_USAGE_2_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT          = 0x200000L,
        VK_BUFFER_USAGE_2_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT         = 0x400000L,
        VK_BUFFER_USAGE_2_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT = 0x4000000L;

    /**
     * Extends {@code VkBufferUsageFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_BUFFER_USAGE_2_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT BUFFER_USAGE_2_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT}</li>
     * <li>{@link #VK_BUFFER_USAGE_2_MICROMAP_STORAGE_BIT_EXT BUFFER_USAGE_2_MICROMAP_STORAGE_BIT_EXT}</li>
     * </ul>
     */
    public static final long
        VK_BUFFER_USAGE_2_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT = 0x800000L,
        VK_BUFFER_USAGE_2_MICROMAP_STORAGE_BIT_EXT               = 0x1000000L;

    protected KHRMaintenance5() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdBindIndexBuffer2KHR ] ---

    /**
     * See {@link VK14#vkCmdBindIndexBuffer2 CmdBindIndexBuffer2}.
     *
     * @param commandBuffer the command buffer into which the command is recorded.
     * @param buffer        the buffer being bound.
     * @param offset        the starting offset in bytes within {@code buffer} used in index buffer address calculations.
     * @param size          the size in bytes of index data bound from {@code buffer}.
     * @param indexType     a {@code VkIndexType} value specifying the size of the indices.
     */
    public static void vkCmdBindIndexBuffer2KHR(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset, @NativeType("VkDeviceSize") long size, @NativeType("VkIndexType") int indexType) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindIndexBuffer2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJJV(commandBuffer.address(), buffer, offset, size, indexType, __functionAddress);
    }

    // --- [ vkGetRenderingAreaGranularityKHR ] ---

    /** Unsafe version of: {@link #vkGetRenderingAreaGranularityKHR GetRenderingAreaGranularityKHR} */
    public static void nvkGetRenderingAreaGranularityKHR(VkDevice device, long pRenderingAreaInfo, long pGranularity) {
        long __functionAddress = device.getCapabilities().vkGetRenderingAreaGranularityKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(device.address(), pRenderingAreaInfo, pGranularity, __functionAddress);
    }

    /**
     * See {@link VK14#vkGetRenderingAreaGranularity GetRenderingAreaGranularity}.
     *
     * @param device             the logical device that owns the render pass instance.
     * @param pRenderingAreaInfo a pointer to a {@link VkRenderingAreaInfo} structure specifying details of the render pass instance to query the render area granularity for.
     * @param pGranularity       a pointer to a {@link VkExtent2D} structure in which the granularity is returned.
     */
    public static void vkGetRenderingAreaGranularityKHR(VkDevice device, @NativeType("VkRenderingAreaInfo const *") VkRenderingAreaInfo pRenderingAreaInfo, @NativeType("VkExtent2D *") VkExtent2D pGranularity) {
        nvkGetRenderingAreaGranularityKHR(device, pRenderingAreaInfo.address(), pGranularity.address());
    }

    // --- [ vkGetDeviceImageSubresourceLayoutKHR ] ---

    /** Unsafe version of: {@link #vkGetDeviceImageSubresourceLayoutKHR GetDeviceImageSubresourceLayoutKHR} */
    public static void nvkGetDeviceImageSubresourceLayoutKHR(VkDevice device, long pInfo, long pLayout) {
        long __functionAddress = device.getCapabilities().vkGetDeviceImageSubresourceLayoutKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkDeviceImageSubresourceInfo.validate(pInfo);
        }
        callPPPV(device.address(), pInfo, pLayout, __functionAddress);
    }

    /**
     * See {@link VK14#vkGetDeviceImageSubresourceLayout GetDeviceImageSubresourceLayout}.
     *
     * @param device  the logical device that owns the image.
     * @param pInfo   a pointer to a {@link VkDeviceImageSubresourceInfo} structure containing parameters required for the subresource layout query.
     * @param pLayout a pointer to a {@link VkSubresourceLayout2} structure in which the layout is returned.
     */
    public static void vkGetDeviceImageSubresourceLayoutKHR(VkDevice device, @NativeType("VkDeviceImageSubresourceInfo const *") VkDeviceImageSubresourceInfo pInfo, @NativeType("VkSubresourceLayout2 *") VkSubresourceLayout2 pLayout) {
        nvkGetDeviceImageSubresourceLayoutKHR(device, pInfo.address(), pLayout.address());
    }

    // --- [ vkGetImageSubresourceLayout2KHR ] ---

    /** Unsafe version of: {@link #vkGetImageSubresourceLayout2KHR GetImageSubresourceLayout2KHR} */
    public static void nvkGetImageSubresourceLayout2KHR(VkDevice device, long image, long pSubresource, long pLayout) {
        long __functionAddress = device.getCapabilities().vkGetImageSubresourceLayout2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPPV(device.address(), image, pSubresource, pLayout, __functionAddress);
    }

    /**
     * See {@link VK14#vkGetImageSubresourceLayout2 GetImageSubresourceLayout2}.
     *
     * @param device       the logical device that owns the image.
     * @param image        the image whose layout is being queried.
     * @param pSubresource a pointer to a {@link VkImageSubresource2} structure selecting a specific image for the image subresource.
     * @param pLayout      a pointer to a {@link VkSubresourceLayout2} structure in which the layout is returned.
     */
    public static void vkGetImageSubresourceLayout2KHR(VkDevice device, @NativeType("VkImage") long image, @NativeType("VkImageSubresource2 const *") VkImageSubresource2 pSubresource, @NativeType("VkSubresourceLayout2 *") VkSubresourceLayout2 pLayout) {
        nvkGetImageSubresourceLayout2KHR(device, image, pSubresource.address(), pLayout.address());
    }

}