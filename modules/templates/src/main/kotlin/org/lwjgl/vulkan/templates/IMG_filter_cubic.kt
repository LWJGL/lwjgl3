/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val IMG_filter_cubic = "IMGFilterCubic".nativeClassVK("IMG_filter_cubic", type = "device", postfix = IMG) {
    documentation =
        """
        {@code VK_IMG_filter_cubic} adds an additional, high quality cubic filtering mode to Vulkan, using a Catmull-Rom bicubic filter. Performing this kind of filtering can be done in a shader by using 16 samples and a number of instructions, but this can be inefficient. The cubic filter mode exposes an optimized high quality texture sampling using fixed texture sampling hardware.

        <h5>Example</h5>
        Creating a sampler with the new filter for both magnification and minification

        <code><pre>
￿    VkSamplerCreateInfo createInfo =
￿    {
￿        VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO // sType
￿        // Other members set to application-desired values
￿    };
￿
￿    createInfo.magFilter = VK_FILTER_CUBIC_IMG;
￿    createInfo.minFilter = VK_FILTER_CUBIC_IMG;
￿
￿    VkSampler sampler;
￿    VkResult result = vkCreateSampler(
￿        device,
￿        &createInfo,
￿        &sampler);</pre></code>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_IMG_filter_cubic</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>16</dd>

            <dt><b>Status</b></dt>
            <dd>Final</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-02-23</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Tobias Hector, Imagination Technologies</li>
            </ul></dd>

            <dt><b>Contacts</b></dt>
            <dd><ul>
                <li>Tobias Hector (mailto:tobias.hector@imgtec.com[tobias.hector@imgtec.com])</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "IMG_FILTER_CUBIC_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "IMG_FILTER_CUBIC_EXTENSION_NAME".."VK_IMG_filter_cubic"
    )

    EnumConstant(
        "Extends {@code VkFilter}.",

        "FILTER_CUBIC_IMG".."1000015000"
    )

    EnumConstant(
        "Extends {@code VkFormatFeatureFlagBits}.",

        "FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG".enum(0x00002000)
    )
}