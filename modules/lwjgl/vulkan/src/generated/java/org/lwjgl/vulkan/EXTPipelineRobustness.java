/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension allows users to request robustness on a per-pipeline stage basis.
 * 
 * <p>As <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> and other robustness features may have an adverse effect on performance, this extension is designed to allow users to request robust behavior only where it may be needed.</p>
 * 
 * <h5>Promotion to Vulkan 1.4</h5>
 * 
 * <p>Functionality in this extension is included in core Vulkan 1.4 with the EXT suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_pipeline_robustness}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>69</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#versions-1.1">Version 1.1</a></dd>
 * <dt><b>Deprecation State</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to Vulkan 1.4</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jarred Davies</li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2022-07-12</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Interacts with {@link EXTRobustness2 VK_EXT_robustness2}</li>
 * <li>Interacts with {@link EXTImageRobustness VK_EXT_image_robustness}</li>
 * <li>Interacts with {@link KHRRayTracingPipeline VK_KHR_ray_tracing_pipeline}</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jarred Davies, Imagination Technologies</li>
 * <li>Alex Walters, Imagination Technologies</li>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Graeme Leese, Broadcom Corporation</li>
 * <li>Jeff Leger, Qualcomm Technologies, Inc.</li>
 * <li>Faith Ekstrand, Intel</li>
 * <li>Lionel Landwerlin, Intel</li>
 * <li>Shahbaz Youssefi, Google, Inc.</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTPipelineRobustness {

    /** The extension specification version. */
    public static final int VK_EXT_PIPELINE_ROBUSTNESS_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_PIPELINE_ROBUSTNESS_EXTENSION_NAME = "VK_EXT_pipeline_robustness";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO_EXT                = 1000068000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES_EXT   = 1000068001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES_EXT = 1000068002;

    /**
     * Extends {@code VkPipelineRobustnessBufferBehavior}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DEVICE_DEFAULT_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DEVICE_DEFAULT_EXT}</li>
     * <li>{@link #VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DISABLED_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DISABLED_EXT}</li>
     * <li>{@link #VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT}</li>
     * <li>{@link #VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT}</li>
     * </ul>
     */
    public static final int
        VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DEVICE_DEFAULT_EXT         = 0,
        VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DISABLED_EXT               = 1,
        VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT   = 2,
        VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT = 3;

    /**
     * Extends {@code VkPipelineRobustnessImageBehavior}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DEVICE_DEFAULT_EXT PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DEVICE_DEFAULT_EXT}</li>
     * <li>{@link #VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DISABLED_EXT PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DISABLED_EXT}</li>
     * <li>{@link #VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_EXT PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_EXT}</li>
     * <li>{@link #VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_2_EXT PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_2_EXT}</li>
     * </ul>
     */
    public static final int
        VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DEVICE_DEFAULT_EXT        = 0,
        VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DISABLED_EXT              = 1,
        VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_EXT   = 2,
        VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_2_EXT = 3;

    private EXTPipelineRobustness() {}

}