/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_attachment_feedback_loop_layout = "EXTAttachmentFeedbackLoopLayout".nativeClassVK("EXT_attachment_feedback_loop_layout", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension adds a new image layout, #IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT, which allows applications to have an image layout in which they are able to both render to and sample/fetch from the same subresource of an image in a given render pass.

        <h5>VK_EXT_attachment_feedback_loop_layout</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_attachment_feedback_loop_layout}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>340</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Joshua Ashton <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_attachment_feedback_loop_layout]%20@Joshua-Ashton%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_attachment_feedback_loop_layout%20extension*">Joshua-Ashton</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_attachment_feedback_loop_layout.adoc">VK_EXT_attachment_feedback_loop_layout</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2022-04-04</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Joshua Ashton, Valve</li>
                <li>Faith Ekstrand, Collabora</li>
                <li>Bas Nieuwenhuizen, Google</li>
                <li>Samuel Iglesias Gonsálvez, Igalia</li>
                <li>Ralph Potter, Samsung</li>
                <li>Jan-Harald Fredriksen, Arm</li>
                <li>Ricardo Garcia, Igalia</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_ATTACHMENT_FEEDBACK_LOOP_LAYOUT_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "EXT_ATTACHMENT_FEEDBACK_LOOP_LAYOUT_EXTENSION_NAME".."VK_EXT_attachment_feedback_loop_layout"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_LAYOUT_FEATURES_EXT".."1000339000"
    )

    EnumConstant(
        "Extends {@code VkImageLayout}.",

        "IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT".."1000339000"
    )

    EnumConstant(
        "Extends {@code VkImageUsageFlagBits}.",

        "IMAGE_USAGE_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT".enum(0x00080000)
    )

    EnumConstant(
        "Extends {@code VkPipelineCreateFlagBits}.",

        "PIPELINE_CREATE_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT".enum(0x02000000),
        "PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT".enum(0x04000000)
    )

    EnumConstant(
        "Extends {@code VkDependencyFlagBits}.",

        "DEPENDENCY_FEEDBACK_LOOP_BIT_EXT".enum(0x00000008)
    )
}