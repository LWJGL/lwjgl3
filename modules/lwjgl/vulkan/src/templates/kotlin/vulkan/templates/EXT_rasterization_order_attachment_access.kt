/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_rasterization_order_attachment_access = "EXTRasterizationOrderAttachmentAccess".nativeClassVK("EXT_rasterization_order_attachment_access", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension extends the mechanism of input attachments to allow access to framebuffer attachments that are used both as input and as color or depth/stencil attachments from one fragment to the next, in rasterization order, without explicit synchronization.

        <h5>Examples</h5>
        None.

        <h5>VK_EXT_rasterization_order_attachment_access</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_rasterization_order_attachment_access}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>464</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jan-Harald Fredriksen <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_rasterization_order_attachment_access]%20@janharaldfredriksen-arm%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_rasterization_order_attachment_access%20extension*">janharaldfredriksen-arm</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_rasterization_order_attachment_access.adoc">VK_EXT_rasterization_order_attachment_access</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2022-07-04</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Tobias Hector, AMD</li>
                <li>Jan-Harald Fredriksen, Arm</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_EXTENSION_NAME".."VK_EXT_rasterization_order_attachment_access"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_EXT".."1000342000"
    )

    EnumConstant(
        "Extends {@code VkPipelineColorBlendStateCreateFlagBits}.",

        "PIPELINE_COLOR_BLEND_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_BIT_EXT".enum(0x00000001)
    )

    EnumConstant(
        "Extends {@code VkPipelineDepthStencilStateCreateFlagBits}.",

        "PIPELINE_DEPTH_STENCIL_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_DEPTH_ACCESS_BIT_EXT".enum(0x00000001),
        "PIPELINE_DEPTH_STENCIL_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_STENCIL_ACCESS_BIT_EXT".enum(0x00000002)
    )

    EnumConstant(
        "Extends {@code VkSubpassDescriptionFlagBits}.",

        "SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_COLOR_ACCESS_BIT_EXT".enum(0x00000010),
        "SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_DEPTH_ACCESS_BIT_EXT".enum(0x00000020),
        "SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_STENCIL_ACCESS_BIT_EXT".enum(0x00000040)
    )
}