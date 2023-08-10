/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * {@link EXTSurfaceMaintenance1 VK_EXT_surface_maintenance1} adds a collection of window system integration features that were intentionally left out or overlooked in the original {@link KHRSurface VK_KHR_surface} extension.
 * 
 * <p>The new features are as follows:</p>
 * 
 * <ul>
 * <li>Allow querying number of min/max images from a surface for a particular presentation mode.</li>
 * <li>Allow querying a surface’s scaled presentation capabilities.</li>
 * <li>Allow querying a surface for the set of presentation modes which can be easily switched between without requiring swapchain recreation.</li>
 * </ul>
 * 
 * <h5>VK_EXT_surface_maintenance1</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_surface_maintenance1}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>275</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRSurface VK_KHR_surface} and {@link KHRGetSurfaceCapabilities2 VK_KHR_get_surface_capabilities2}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Shahbaz Youssefi <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_surface_maintenance1]%20@syoussefi%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_surface_maintenance1%20extension*">syoussefi</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_surface_maintenance1.adoc">VK_EXT_surface_maintenance1</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2022-11-09</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Juliano, NVIDIA</li>
 * <li>Lionel Landwerlin, Intel</li>
 * <li>Shahbaz Youssefi, Google</li>
 * <li>Chris Forbes, Google</li>
 * <li>Ian Elliott, Google</li>
 * <li>Hans-Kristian Arntzen, Valve</li>
 * <li>Daniel Stone, Collabora</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTSurfaceMaintenance1 {

    /** The extension specification version. */
    public static final int VK_EXT_SURFACE_MAINTENANCE_1_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_SURFACE_MAINTENANCE_1_EXTENSION_NAME = "VK_EXT_surface_maintenance1";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_EXT STRUCTURE_TYPE_SURFACE_PRESENT_MODE_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_EXT STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_EXT STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_EXT                 = 1000274000,
        VK_STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_EXT = 1000274001,
        VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_EXT   = 1000274002;

    /**
     * VkPresentScalingFlagBitsEXT - Bitmask specifying presentation scaling methods
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_PRESENT_SCALING_ONE_TO_ONE_BIT_EXT PRESENT_SCALING_ONE_TO_ONE_BIT_EXT} specifies that no scaling occurs, and pixels in the swapchain image are mapped to one and only one pixel in the surface. The mapping between pixels is defined by the chosen presentation gravity.</li>
     * <li>{@link #VK_PRESENT_SCALING_ASPECT_RATIO_STRETCH_BIT_EXT PRESENT_SCALING_ASPECT_RATIO_STRETCH_BIT_EXT} specifies that the swapchain image will be minified or magnified such that at least one of the resulting width or height is equal to the corresponding surface dimension, and the other resulting dimension is less than or equal to the corresponding surface dimension, with the aspect ratio of the resulting image being identical to that of the original swapchain image.</li>
     * <li>{@link #VK_PRESENT_SCALING_STRETCH_BIT_EXT PRESENT_SCALING_STRETCH_BIT_EXT} specifies that the swapchain image will be minified or magnified such that the resulting image dimensions are equal to those of the surface.</li>
     * </ul>
     */
    public static final int
        VK_PRESENT_SCALING_ONE_TO_ONE_BIT_EXT           = 0x1,
        VK_PRESENT_SCALING_ASPECT_RATIO_STRETCH_BIT_EXT = 0x2,
        VK_PRESENT_SCALING_STRETCH_BIT_EXT              = 0x4;

    /**
     * VkPresentGravityFlagBitsEXT - Bitmask specifying presentation pixel gravity on either the x or y axis
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_PRESENT_GRAVITY_MIN_BIT_EXT PRESENT_GRAVITY_MIN_BIT_EXT} means that the pixels will gravitate towards the top or left side of the surface.</li>
     * <li>{@link #VK_PRESENT_GRAVITY_MAX_BIT_EXT PRESENT_GRAVITY_MAX_BIT_EXT} means that the pixels will gravitate towards the bottom or right side of the surface.</li>
     * <li>{@link #VK_PRESENT_GRAVITY_CENTERED_BIT_EXT PRESENT_GRAVITY_CENTERED_BIT_EXT} means that the pixels will be centered in the surface.</li>
     * </ul>
     * 
     * <p>If the value in {@link VkSurfaceCapabilitiesKHR}{@code ::currentTransform} is not {@link KHRSurface#VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR SURFACE_TRANSFORM_IDENTITY_BIT_KHR}, it is implementation-defined whether the gravity configuration applies to the presented image before or after transformation.</p>
     */
    public static final int
        VK_PRESENT_GRAVITY_MIN_BIT_EXT      = 0x1,
        VK_PRESENT_GRAVITY_MAX_BIT_EXT      = 0x2,
        VK_PRESENT_GRAVITY_CENTERED_BIT_EXT = 0x4;

    private EXTSurfaceMaintenance1() {}

}