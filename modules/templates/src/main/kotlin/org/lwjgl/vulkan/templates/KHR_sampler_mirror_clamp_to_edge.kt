/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_sampler_mirror_clamp_to_edge = "KHRSamplerMirrorClampToEdge".nativeClassVK("KHR_sampler_mirror_clamp_to_edge", type = "device", postfix = KHR) {
    documentation =
        """
        {@code VK_KHR_sampler_mirror_clamp_to_edge} extends the set of sampler address modes to include an additional mode (#SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE) that effectively uses a texture map twice as large as the original image in which the additional half of the new image is a mirror image of the original image.

        This new mode relaxes the need to generate images whose opposite edges match by using the original image to generate a matching "{@code mirror image}". This mode allows the texture to be mirrored only once in the negative s, t, and r directions.

        <h5>Example</h5>
        Creating a sampler with the new address mode in each dimension

        <code><pre>
￿    VkSamplerCreateInfo createInfo =
￿    {
￿        VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO // sType
￿        // Other members set to application-desired values
￿    };
￿
￿    createInfo.addressModeU = VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE;
￿    createInfo.addressModeV = VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE;
￿    createInfo.addressModeW = VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE;
￿
￿    VkSampler sampler;
￿    VkResult result = vkCreateSampler(
￿        device,
￿        &createInfo,
￿        &sampler);</pre></code>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_KHR_sampler_mirror_clamp_to_edge</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>15</dd>

            <dt><b>Status</b></dt>
            <dd>Final</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-02-16</dd>

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

        "KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_EXTENSION_NAME".."VK_KHR_sampler_mirror_clamp_to_edge"
    )

    EnumConstant(
        "",

        "SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE".."4"
    )
}