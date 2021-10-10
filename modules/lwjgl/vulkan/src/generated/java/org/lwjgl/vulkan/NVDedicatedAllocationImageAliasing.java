/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension allows applications to alias images on dedicated allocations, subject to specific restrictions: the extent and the number of layers in the image being aliased must be smaller than or equal to those of the original image for which the allocation was created, and every other image parameter must match.
 * 
 * <h5>VK_NV_dedicated_allocation_image_aliasing</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_dedicated_allocation_image_aliasing}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>241</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRDedicatedAllocation VK_KHR_dedicated_allocation}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Nuno Subtil <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_dedicated_allocation_image_aliasing]%20@nsubtil%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_dedicated_allocation_image_aliasing%20extension%3E%3E">nsubtil</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-01-04</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Nuno Subtil, NVIDIA</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Eric Werness, NVIDIA</li>
 * <li>Axel Gneiting, id Software</li>
 * </ul></dd>
 * </dl>
 */
public final class NVDedicatedAllocationImageAliasing {

    /** The extension specification version. */
    public static final int VK_NV_DEDICATED_ALLOCATION_IMAGE_ALIASING_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_DEDICATED_ALLOCATION_IMAGE_ALIASING_EXTENSION_NAME = "VK_NV_dedicated_allocation_image_aliasing";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEDICATED_ALLOCATION_IMAGE_ALIASING_FEATURES_NV = 1000240000;

    private NVDedicatedAllocationImageAliasing() {}

}