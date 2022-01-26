/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_copy_commands2 = "KHRCopyCommands2".nativeClassVK("KHR_copy_commands2", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension provides extensible versions of the Vulkan buffer and image copy commands. The new commands are functionally identical to the core commands, except that their copy parameters are specified using extensible structures that can be used to pass extension-specific information.

        The following extensible copy commands are introduced with this extension: #CmdCopyBuffer2KHR(), #CmdCopyImage2KHR(), #CmdCopyBufferToImage2KHR(), #CmdCopyImageToBuffer2KHR(), #CmdBlitImage2KHR(), and #CmdResolveImage2KHR(). Each command contains an stext:*Info2KHR structure parameter that includes {@code sType}/{@code pNext} members. Lower level structures describing each region to be copied are also extended with {@code sType}/{@code pNext} members.

        <h5>Promotion to Vulkan 1.3</h5>
        Functionality in this extension is included in core Vulkan 1.3, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <h5>VK_KHR_copy_commands2</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_copy_commands2}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>338</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.3-promotions">Vulkan 1.3</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Leger <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_copy_commands2]%20@jackohound%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_copy_commands2%20extension%3E%3E">jackohound</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2020-07-06</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.3 Core</li>
            </ul></dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>None</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Leger, Qualcomm</li>
                <li>Tobias Hector, AMD</li>
                <li>Jan-Harald Fredriksen, ARM</li>
                <li>Tom Olson, ARM</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_COPY_COMMANDS_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_COPY_COMMANDS_2_EXTENSION_NAME".."VK_KHR_copy_commands2"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_COPY_BUFFER_INFO_2_KHR".."1000337000",
        "STRUCTURE_TYPE_COPY_IMAGE_INFO_2_KHR".."1000337001",
        "STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2_KHR".."1000337002",
        "STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2_KHR".."1000337003",
        "STRUCTURE_TYPE_BLIT_IMAGE_INFO_2_KHR".."1000337004",
        "STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2_KHR".."1000337005",
        "STRUCTURE_TYPE_BUFFER_COPY_2_KHR".."1000337006",
        "STRUCTURE_TYPE_IMAGE_COPY_2_KHR".."1000337007",
        "STRUCTURE_TYPE_IMAGE_BLIT_2_KHR".."1000337008",
        "STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2_KHR".."1000337009",
        "STRUCTURE_TYPE_IMAGE_RESOLVE_2_KHR".."1000337010"
    )

    void(
        "CmdCopyBuffer2KHR",
        "See #CmdCopyBuffer2().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCopyBufferInfo2.const.p("pCopyBufferInfo", "a pointer to a ##VkCopyBufferInfo2 structure describing the copy parameters.")
    )

    void(
        "CmdCopyImage2KHR",
        "See #CmdCopyImage2().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCopyImageInfo2.const.p("pCopyImageInfo", "a pointer to a ##VkCopyImageInfo2 structure describing the copy parameters.")
    )

    void(
        "CmdCopyBufferToImage2KHR",
        "See #CmdCopyBufferToImage2().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCopyBufferToImageInfo2.const.p("pCopyBufferToImageInfo", "a pointer to a ##VkCopyBufferToImageInfo2 structure describing the copy parameters.")
    )

    void(
        "CmdCopyImageToBuffer2KHR",
        "See #CmdCopyImageToBuffer2().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCopyImageToBufferInfo2.const.p("pCopyImageToBufferInfo", "a pointer to a ##VkCopyImageToBufferInfo2 structure describing the copy parameters.")
    )

    void(
        "CmdBlitImage2KHR",
        "See #CmdBlitImage2().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBlitImageInfo2.const.p("pBlitImageInfo", "a pointer to a ##VkBlitImageInfo2 structure describing the blit parameters.")
    )

    void(
        "CmdResolveImage2KHR",
        "See #CmdResolveImage2().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkResolveImageInfo2.const.p("pResolveImageInfo", "a pointer to a ##VkResolveImageInfo2 structure describing the resolve parameters.")
    )
}