/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_sampler_mirror_clamp_to_edge = "KHRSamplerMirrorClampToEdge".nativeClassVK("KHR_sampler_mirror_clamp_to_edge", type = "device", postfix = "KHR") {
    documentation =
        """
        {@code VK_KHR_sampler_mirror_clamp_to_edge} extends the set of sampler address modes to include an additional mode (#SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE) that effectively uses a texture map twice as large as the original image in which the additional half of the new image is a mirror image of the original image.

        This new mode relaxes the need to generate images whose opposite edges match by using the original image to generate a matching “{@code mirror image}”. This mode allows the texture to be mirrored only once in the negative s, t, and r directions.

        <h5>Promotion to Vulkan 1.2</h5>
        All functionality in this extension is included in core Vulkan 1.2. However, if Vulkan 1.2 is supported and this extension is not, the {@code VkSamplerAddressMode} #SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE is optional. Since the original extension did not use an author suffix on the enum #SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE, it is used by both core and extension implementations.

        <h5>Example</h5>
        Creating a sampler with the new address mode in each dimension

        <pre><code>
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
￿        &amp;createInfo,
￿        &amp;sampler);</code></pre>

        <h5>VK_KHR_sampler_mirror_clamp_to_edge</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_sampler_mirror_clamp_to_edge}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>15</dd>

            <dt><b>Revision</b></dt>
            <dd>3</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.2-promotions">Vulkan 1.2</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Tobias Hector <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_sampler_mirror_clamp_to_edge]%20@tobski%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_sampler_mirror_clamp_to_edge%20extension%3E%3E">tobski</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2019-08-17</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.2 Core</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Tobias Hector, Imagination Technologies</li>
                <li>Jon Leech, Khronos</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_SPEC_VERSION".."3"
    )

    StringConstant(
        "The extension name.",

        "KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_EXTENSION_NAME".."VK_KHR_sampler_mirror_clamp_to_edge"
    )

    EnumConstant(
        "Extends {@code VkSamplerAddressMode}.",

        "SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE".."4",
        "SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE_KHR".."4"
    )
}