/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension adds support for a new image organization, which this extension refers to as “{@code corner-sampled}” images. A corner-sampled image differs from a conventional image in the following ways:
 * 
 * <ul>
 * <li>Texels are centered on integer coordinates. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-unnormalized-to-integer">Unnormalized Texel Coordinate Operations</a></li>
 * <li>Normalized coordinates are scaled using <code>coord × (dim - 1)</code> rather than <code>coord × dim</code>, where dim is the size of one dimension of the image. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-normalized-to-unnormalized">normalized texel coordinate transform</a>.</li>
 * <li>Partial derivatives are scaled using <code>coord × (dim - 1)</code> rather than <code>coord × dim</code>. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-scale-factor">Scale Factor Operation</a>.</li>
 * <li>Calculation of the next higher lod size goes according to <code>⌈dim / 2⌉</code> rather than <code>⌊dim / 2⌋</code>. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-miplevel-sizing">Image Miplevel Sizing</a>.</li>
 * <li>The minimum level size is 2x2 for 2D images and 2x2x2 for 3D images. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-miplevel-sizing">Image Miplevel Sizing</a>.</li>
 * </ul>
 * 
 * <p>This image organization is designed to facilitate a system like Ptex with separate textures for each face of a subdivision or polygon mesh. Placing sample locations at pixel corners allows applications to maintain continuity between adjacent patches by duplicating values along shared edges. Additionally, using the modified mipmapping logic along with texture dimensions of the form <code>2<sup>n</sup>+1</code> allows continuity across shared edges even if the adjacent patches use different level-of-detail values.</p>
 * 
 * <h5>VK_NV_corner_sampled_image</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_corner_sampled_image}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>51</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Daniel Koch <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_corner_sampled_image]%20@dgkoch%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_corner_sampled_image%20extension%3E%3E">dgkoch</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-08-13</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Pat Brown, NVIDIA</li>
 * <li>Chris Lentini, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class NVCornerSampledImage {

    /** The extension specification version. */
    public static final int VK_NV_CORNER_SAMPLED_IMAGE_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_NV_CORNER_SAMPLED_IMAGE_EXTENSION_NAME = "VK_NV_corner_sampled_image";

    /** Extends {@code VkImageCreateFlagBits}. */
    public static final int VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV = 0x2000;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CORNER_SAMPLED_IMAGE_FEATURES_NV = 1000050000;

    private NVCornerSampledImage() {}

}