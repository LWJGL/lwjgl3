/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension allows images of a format that requires <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion"> Y′C<sub>B</sub>C<sub>R</sub> conversion</a> to be created with multiple array layers, which is otherwise restricted.
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_ycbcr_image_arrays}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>253</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRSamplerYcbcrConversion VK_KHR_sampler_ycbcr_conversion}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Piers Daniell <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_EXT_ycbcr_image_arrays:%20&amp;body=@pdaniell-nv%20">pdaniell-nv</a></li>
 * </ul></dd>
 * <dt>Last Modified Date</dt>
 * <dd>2019-01-15</dd>
 * <dt>Contributors</dt>
 * <dd><ul>
 * <li>Piers Daniell, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTYcbcrImageArrays {

    /** The extension specification version. */
    public static final int VK_EXT_YCBCR_IMAGE_ARRAYS_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_YCBCR_IMAGE_ARRAYS_EXTENSION_NAME = "VK_EXT_ycbcr_image_arrays";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_IMAGE_ARRAYS_FEATURES_EXT = 1000252000;

    private EXTYcbcrImageArrays() {}

}