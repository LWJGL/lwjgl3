/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_depth_stencil_resolve = "KHRDepthStencilResolve".nativeClassVK("KHR_depth_stencil_resolve", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension adds support for automatically resolving multisampled depth/stencil attachments in a subpass in a similar manner as for color attachments.

        Multisampled color attachments can be resolved at the end of a subpass by specifying {@code pResolveAttachments} entries corresponding to the {@code pColorAttachments} array entries. This does not allow for a way to map the resolve attachments to the depth/stencil attachment. The #CmdResolveImage() command does not allow for depth/stencil images. While there are other ways to resolve the depth/stencil attachment, they can give sub-optimal performance. Extending the ##VkSubpassDescription2 in this extension allows an application to add a {@code pDepthStencilResolveAttachment}, that is similar to the color {@code pResolveAttachments}, that the {@code pDepthStencilAttachment} can be resolved into.

        Depth and stencil samples are resolved to a single value based on the resolve mode. The set of possible resolve modes is defined in the {@code VkResolveModeFlagBits} enum. The #RESOLVE_MODE_SAMPLE_ZERO_BIT mode is the only mode that is required of all implementations (that support the extension or support Vulkan 1.2 or higher). Some implementations may also support averaging (the same as color sample resolve) or taking the minimum or maximum sample, which may be more suitable for depth/stencil resolve.

        <h5>Promotion to Vulkan 1.2</h5>
        All functionality in this extension is included in core Vulkan 1.2, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <h5>VK_KHR_depth_stencil_resolve</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_depth_stencil_resolve}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>200</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRCreateRenderpass2 VK_KHR_create_renderpass2}</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.2-promotions">Vulkan 1.2</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jan-Harald Fredriksen <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_depth_stencil_resolve]%20@janharald%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_depth_stencil_resolve%20extension%3E%3E">janharald</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2018-04-09</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.2 Core</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jan-Harald Fredriksen, Arm</li>
                <li>Andrew Garrard, Samsung Electronics</li>
                <li>Soowan Park, Samsung Electronics</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Daniel Rakos, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_DEPTH_STENCIL_RESOLVE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_DEPTH_STENCIL_RESOLVE_EXTENSION_NAME".."VK_KHR_depth_stencil_resolve"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES_KHR".."1000199000",
        "STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE_KHR".."1000199001"
    )

    EnumConstant(
        "Extends {@code VkResolveModeFlagBits}.",

        "RESOLVE_MODE_NONE_KHR".."0",
        "RESOLVE_MODE_SAMPLE_ZERO_BIT_KHR".enum(0x00000001),
        "RESOLVE_MODE_AVERAGE_BIT_KHR".enum(0x00000002),
        "RESOLVE_MODE_MIN_BIT_KHR".enum(0x00000004),
        "RESOLVE_MODE_MAX_BIT_KHR".enum(0x00000008)
    )
}