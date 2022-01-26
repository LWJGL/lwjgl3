/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension allows applications to clamp the minimum LOD value during <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-image-level-selection">Image Level(s) Selection</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-integer-coordinate-operations">Integer Texel Coordinate Operations</a> with a given {@code VkImageView} by {@link VkImageViewMinLodCreateInfoEXT}{@code ::minLod}.
 * 
 * <p>This extension may be useful to restrict a {@code VkImageView} to only mips which have been uploaded, and the use of fractional {@code minLod} can be useful for smoothly introducing new mip levels when using linear mipmap filtering.</p>
 * 
 * <h5>VK_EXT_image_view_min_lod</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_image_view_min_lod}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>392</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Joshua Ashton <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_image_view_min_lod]%20@Joshua-Ashton%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_image_view_min_lod%20extension%3E%3E">Joshua-Ashton</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2021-11-09</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Joshua Ashton, Valve</li>
 * <li>Hans-Kristian Arntzen, Valve</li>
 * <li>Samuel Iglesias Gonsalvez, Igalia</li>
 * <li>Tobias Hector, AMD</li>
 * <li>Jason Ekstrand, Intel</li>
 * <li>Tom Olson, ARM</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTImageViewMinLod {

    /** The extension specification version. */
    public static final int VK_EXT_IMAGE_VIEW_MIN_LOD_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_IMAGE_VIEW_MIN_LOD_EXTENSION_NAME = "VK_EXT_image_view_min_lod";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_MIN_LOD_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_MIN_LOD_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_VIEW_MIN_LOD_CREATE_INFO_EXT STRUCTURE_TYPE_IMAGE_VIEW_MIN_LOD_CREATE_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_MIN_LOD_FEATURES_EXT = 1000391000,
        VK_STRUCTURE_TYPE_IMAGE_VIEW_MIN_LOD_CREATE_INFO_EXT              = 1000391001;

    private EXTImageViewMinLod() {}

}