/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * {@code VK_IMG_filter_cubic} adds an additional, high quality cubic filtering mode to Vulkan, using a Catmull-Rom bicubic filter. Performing this kind of filtering can be done in a shader by using 16 samples and a number of instructions, but this can be inefficient. The cubic filter mode exposes an optimized high quality texture sampling using fixed texture sampling functionality.
 * 
 * <h5>Example</h5>
 * 
 * <p>Creating a sampler with the new filter for both magnification and minification</p>
 * 
 * <pre><code>
 *     VkSamplerCreateInfo createInfo =
 *     {
 *         VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO // sType
 *         // Other members set to application-desired values
 *     };
 * 
 *     createInfo.magFilter = VK_FILTER_CUBIC_IMG;
 *     createInfo.minFilter = VK_FILTER_CUBIC_IMG;
 * 
 *     VkSampler sampler;
 *     VkResult result = vkCreateSampler(
 *         device,
 *         &amp;createInfo,
 *         &amp;sampler);</code></pre>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_IMG_filter_cubic}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>16</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Tobias Hector <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_IMG_filter_cubic:%20&amp;body=@tobski%20">tobski</a></li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-02-23</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Tobias Hector, Imagination Technologies</li>
 * </ul></dd>
 * </dl>
 */
public final class IMGFilterCubic {

    /** The extension specification version. */
    public static final int VK_IMG_FILTER_CUBIC_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_IMG_FILTER_CUBIC_EXTENSION_NAME = "VK_IMG_filter_cubic";

    /** Extends {@code VkFilter}. */
    public static final int VK_FILTER_CUBIC_IMG = 1000015000;

    /** Extends {@code VkFormatFeatureFlagBits}. */
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG = 0x2000;

    private IMGFilterCubic() {}

}