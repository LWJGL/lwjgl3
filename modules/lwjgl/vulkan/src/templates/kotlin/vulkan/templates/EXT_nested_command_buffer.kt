/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_nested_command_buffer = "EXTNestedCommandBuffer".nativeClassVK("EXT_nested_command_buffer", type = "device", postfix = "EXT") {
    documentation =
        """
        With core Vulkan it is not legal to call #CmdExecuteCommands() when recording a secondary command buffer. This extension relaxes that restriction, allowing secondary command buffers to execute other secondary command buffers.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_nested_command_buffer}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>452</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.1">Version 1.1</a></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Piers Daniell <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_nested_command_buffer]%20@pdaniell-nv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_nested_command_buffer%20extension*">pdaniell-nv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-09-18</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Daniel Story, Nintendo</li>
                <li>Peter Kohaut, NVIDIA</li>
                <li>Shahbaz Youssefi, Google</li>
                <li>Slawomir Grajewski, Intel</li>
                <li>Stu Smith, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_NESTED_COMMAND_BUFFER_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_NESTED_COMMAND_BUFFER_EXTENSION_NAME".."VK_EXT_nested_command_buffer"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_NESTED_COMMAND_BUFFER_FEATURES_EXT".."1000451000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_NESTED_COMMAND_BUFFER_PROPERTIES_EXT".."1000451001"
    )

    EnumConstant(
        "Extends {@code VkSubpassContents}.",

        "SUBPASS_CONTENTS_INLINE_AND_SECONDARY_COMMAND_BUFFERS_EXT".."1000451000"
    )

    EnumConstant(
        "Extends {@code VkRenderingFlagBits}.",

        "RENDERING_CONTENTS_INLINE_BIT_EXT".enum(0x00000010)
    )
}