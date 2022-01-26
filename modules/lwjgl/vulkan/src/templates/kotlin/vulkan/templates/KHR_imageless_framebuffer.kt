/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_imageless_framebuffer = "KHRImagelessFramebuffer".nativeClassVK("KHR_imageless_framebuffer", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension allows framebuffers to be created without the need for creating images first, allowing more flexibility in how they are used, and avoiding the need for many of the confusing compatibility rules.

        Framebuffers are now created with a small amount of additional metadata about the image views that will be used in ##VkFramebufferAttachmentsCreateInfoKHR, and the actual image views are provided at render pass begin time via ##VkRenderPassAttachmentBeginInfoKHR.

        <h5>Promotion to Vulkan 1.2</h5>
        All functionality in this extension is included in core Vulkan 1.2, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <h5>VK_KHR_imageless_framebuffer</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_imageless_framebuffer}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>109</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRMaintenance2 VK_KHR_maintenance2}</li>
                <li>Requires {@link KHRImageFormatList VK_KHR_image_format_list}</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.2-promotions">Vulkan 1.2</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Tobias Hector <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_imageless_framebuffer]%20@tobias%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_imageless_framebuffer%20extension%3E%3E">tobias</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2018-12-14</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.2 Core</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Tobias Hector</li>
                <li>Graham Wihlidal</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_IMAGELESS_FRAMEBUFFER_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_IMAGELESS_FRAMEBUFFER_EXTENSION_NAME".."VK_KHR_imageless_framebuffer"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES_KHR".."1000108000",
        "STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO_KHR".."1000108001",
        "STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO_KHR".."1000108002",
        "STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO_KHR".."1000108003"
    )

    EnumConstant(
        "Extends {@code VkFramebufferCreateFlagBits}.",

        "FRAMEBUFFER_CREATE_IMAGELESS_BIT_KHR".enum(0x00000001)
    )
}