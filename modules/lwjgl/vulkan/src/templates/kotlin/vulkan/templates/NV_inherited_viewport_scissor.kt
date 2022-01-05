/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_inherited_viewport_scissor = "NVInheritedViewportScissor".nativeClassVK("NV_inherited_viewport_scissor", type = "device", postfix = "NV") {
    documentation =
        """
        This extension adds the ability for a secondary command buffer to inherit the dynamic viewport and scissor state from a primary command buffer, or a previous secondary command buffer executed within the same #CmdExecuteCommands() call. It addresses a frequent scenario in applications that deal with window resizing and want to improve utilization of re-usable secondary command buffers. The functionality is provided through ##VkCommandBufferInheritanceViewportScissorInfoNV. Viewport inheritance is effectively limited to the 2D rectangle; secondary command buffers must re-specify the inherited depth range values.

        <h5>VK_NV_inherited_viewport_scissor</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_inherited_viewport_scissor}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>279</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>David Zhao Akeley <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_inherited_viewport_scissor]%20@akeley98%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_inherited_viewport_scissor%20extension%3E%3E">akeley98</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-02-04</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>David Zhao Akeley, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Piers Daniell, NVIDIA</li>
                <li>Christoph Kubisch, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_INHERITED_VIEWPORT_SCISSOR_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_INHERITED_VIEWPORT_SCISSOR_EXTENSION_NAME".."VK_NV_inherited_viewport_scissor"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_INHERITED_VIEWPORT_SCISSOR_FEATURES_NV".."1000278000",
        "STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV".."1000278001"
    )
}