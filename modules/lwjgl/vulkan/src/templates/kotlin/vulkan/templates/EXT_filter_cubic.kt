/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_filter_cubic = "EXTFilterCubic".nativeClassVK("EXT_filter_cubic", type = "device", postfix = "EXT") {
    documentation =
        """
        {@code VK_EXT_filter_cubic} extends {@code VK_IMG_filter_cubic}.

        It documents cubic filtering of other image view types. It adds new structures that <b>can</b> be added to the {@code pNext} chain of ##VkPhysicalDeviceImageFormatInfo2 and ##VkImageFormatProperties2 that <b>can</b> be used to determine which image types and which image view types support cubic filtering.

        <h5>VK_EXT_filter_cubic</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_filter_cubic}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>171</dd>

            <dt><b>Revision</b></dt>
            <dd>3</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Bill Licea-Kane <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_filter_cubic]%20@wwlk%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_filter_cubic%20extension%3E%3E">wwlk</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2019-12-13</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Bill Licea-Kane, Qualcomm Technologies, Inc.</li>
                <li>Andrew Garrard, Samsung</li>
                <li>Daniel Koch, NVIDIA</li>
                <li>Donald Scorgie, Imagination Technologies</li>
                <li>Graeme Leese, Broadcom</li>
                <li>Jan-Herald Fredericksen, ARM</li>
                <li>Jeff Leger, Qualcomm Technologies, Inc.</li>
                <li>Tobias Hector, AMD</li>
                <li>Tom Olson, ARM</li>
                <li>Stuart Smith, Imagination Technologies</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_FILTER_CUBIC_SPEC_VERSION".."3"
    )

    StringConstant(
        "The extension name.",

        "EXT_FILTER_CUBIC_EXTENSION_NAME".."VK_EXT_filter_cubic"
    )

    EnumConstant(
        "Extends {@code VkFilter}.",

        "FILTER_CUBIC_EXT".."1000170000"
    )

    EnumConstant(
        "Extends {@code VkFormatFeatureFlagBits}.",

        "FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT".enum(0x00002000)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_IMAGE_FORMAT_INFO_EXT".."1000170000",
        "STRUCTURE_TYPE_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES_EXT".."1000170001"
    )
}