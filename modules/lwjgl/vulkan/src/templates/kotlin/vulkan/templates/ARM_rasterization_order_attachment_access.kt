/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val ARM_rasterization_order_attachment_access = "ARMRasterizationOrderAttachmentAccess".nativeClassVK("ARM_rasterization_order_attachment_access", type = "device", postfix = "ARM") {
    documentation =
        """
        Renderpasses, and specifically <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-pipeline-barriers-subpass-self-dependencies">subpass self-dependencies</a> enable much of the same functionality as the framebuffer fetch and pixel local storage extensions did for OpenGL ES. But certain techniques such as programmable blending are awkward or impractical to implement with these alone, in part because a self-dependency is required every time a fragment will read a value at a given sample coordinate.

        This extension extends the mechanism of input attachments to allow access to framebuffer attachments when used as both input and color, or depth/stencil, attachments from one fragment to the next, in rasterization order, without explicit synchronization.

        See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#renderpass-feedbackloop">renderpass feedback loops</a> for more information.

        <h5>Examples</h5>
        None.

        <h5>VK_ARM_rasterization_order_attachment_access</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_ARM_rasterization_order_attachment_access}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>343</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jan-Harald Fredriksen <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_ARM_rasterization_order_attachment_access]%20@janharaldfredriksen-arm%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_ARM_rasterization_order_attachment_access%20extension%3E%3E">janharaldfredriksen-arm</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-11-12</dd>

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

        "ARM_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "ARM_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_EXTENSION_NAME".."VK_ARM_rasterization_order_attachment_access"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_ARM".."1000342000"
    )

    EnumConstant(
        "Extends {@code VkPipelineColorBlendStateCreateFlagBits}.",

        "PIPELINE_COLOR_BLEND_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_BIT_ARM".enum(0x00000001)
    )

    EnumConstant(
        "Extends {@code VkPipelineDepthStencilStateCreateFlagBits}.",

        "PIPELINE_DEPTH_STENCIL_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_DEPTH_ACCESS_BIT_ARM".enum(0x00000001),
        "PIPELINE_DEPTH_STENCIL_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_STENCIL_ACCESS_BIT_ARM".enum(0x00000002)
    )

    EnumConstant(
        "Extends {@code VkSubpassDescriptionFlagBits}.",

        "SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_COLOR_ACCESS_BIT_ARM".enum(0x00000010),
        "SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_DEPTH_ACCESS_BIT_ARM".enum(0x00000020),
        "SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_STENCIL_ACCESS_BIT_ARM".enum(0x00000040)
    )
}