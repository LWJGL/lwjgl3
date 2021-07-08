/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_rotated_copy_commands = "QCOMRotatedCopyCommands".nativeClassVK("QCOM_rotated_copy_commands", type = "device", postfix = QCOM) {
    documentation =
        """
        This extension extends adds an optional rotation transform to copy commands #CmdBlitImage2KHR(), #CmdCopyImageToBuffer2KHR() and #CmdCopyBufferToImage2KHR(). When copying between two resources, where one resource contains rotated content and the other does not, a rotated copy may be desired. This extension may be used in combination with VK_QCOM_render_pass_transform which adds rotated renderpasses.

        This extension adds an extension structure to the following commands: vkCmdBlitImage2KHR, vkCmdCopyImageToBuffer2KHR and vkCmdCopyBufferToImage2KHR

        <h5>VK_QCOM_rotated_copy_commands</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_QCOM_rotated_copy_commands}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>334</dd>

            <dt><b>Revision</b></dt>
            <dd>0</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRSwapchain VK_KHR_swapchain}</li>
                <li>Requires {@link KHRCopyCommands2 VK_KHR_copy_commands2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Leger <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_QCOM_rotated_copy_commands:%20&amp;body=@jackohound%20">jackohound</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt>Last Modified Date</dt>
            <dd>2020-09-18</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>None</li>
            </ul></dd>

            <dt>Contributors</dt>
            <dd><ul>
                <li>Jeff Leger, Qualcomm Technologies, Inc.</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "QCOM_ROTATED_COPY_COMMANDS_SPEC_VERSION".."0"
    )

    StringConstant(
        "The extension name.",

        "QCOM_ROTATED_COPY_COMMANDS_EXTENSION_NAME".."VK_QCOM_rotated_copy_commands"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_COPY_COMMAND_TRANSFORM_INFO_QCOM".."1000333000"
    )
}