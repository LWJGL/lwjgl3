/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * The ray tracing pipeline API provides some ability to reorder for locality, but it is useful to have more control over how the reordering happens and what information is included in the reordering. The shader API provides a hit object to contain result information from the hit which can be used as part of the explicit sorting plus options that contain an integer for hint bits to use to add more locality.
 * 
 * <h5>VK_NV_ray_tracing_invocation_reorder</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_ray_tracing_invocation_reorder}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>491</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRRayTracingPipeline VK_KHR_ray_tracing_pipeline}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Eric Werness <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_ray_tracing_invocation_reorder]%20@ewerness-nv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_ray_tracing_invocation_reorder%20extension*">ewerness-nv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2022-11-02</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_shader_invocation_reorder.html">{@code SPV_NV_shader_invocation_reorder}</a></li>
 * <li>This extension provides API support for <a href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/nv/GLSL_NV_shader_invocation_reorder.txt">{@code GL_NV_shader_invocation_reorder}</a></li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Eric Werness, NVIDIA</li>
 * <li>Ashwin Lele, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class NVRayTracingInvocationReorder {

    /** The extension specification version. */
    public static final int VK_NV_RAY_TRACING_INVOCATION_REORDER_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_RAY_TRACING_INVOCATION_REORDER_EXTENSION_NAME = "VK_NV_ray_tracing_invocation_reorder";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_FEATURES_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_NV}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_FEATURES_NV   = 1000490000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_NV = 1000490001;

    /**
     * VkRayTracingInvocationReorderModeNV - Enum providing a hint on how the application <b>may</b> reorder
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_RAY_TRACING_INVOCATION_REORDER_MODE_NONE_NV RAY_TRACING_INVOCATION_REORDER_MODE_NONE_NV} indicates that the implementation is likely to not reorder at reorder calls.</li>
     * <li>{@link #VK_RAY_TRACING_INVOCATION_REORDER_MODE_REORDER_NV RAY_TRACING_INVOCATION_REORDER_MODE_REORDER_NV} indicates that the implementation is likely to reorder at reorder calls.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV}</p>
     */
    public static final int
        VK_RAY_TRACING_INVOCATION_REORDER_MODE_NONE_NV    = 0,
        VK_RAY_TRACING_INVOCATION_REORDER_MODE_REORDER_NV = 1;

    private NVRayTracingInvocationReorder() {}

}