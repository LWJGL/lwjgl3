/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_image_compression_control_swapchain = "EXTImageCompressionControlSwapchain".nativeClassVK("EXT_image_compression_control_swapchain", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension enables fixed-rate image compression and adds the ability to control when this kind of compression can be applied to swapchain images.

        <h5>VK_EXT_image_compression_control_swapchain</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_image_compression_control_swapchain}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>438</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link EXTImageCompressionControl VK_EXT_image_compression_control}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jan-Harald Fredriksen <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_image_compression_control_swapchain]%20@janharaldfredriksen-arm%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_image_compression_control_swapchain%20extension*">janharaldfredriksen-arm</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2022-05-02</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jan-Harald Fredriksen, Arm</li>
                <li>Graeme Leese, Broadcom</li>
                <li>Andrew Garrard, Imagination</li>
                <li>Lisa Wu, Arm</li>
                <li>Peter Kohaut, Arm</li>
                <li>Ian Elliott, Google</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_IMAGE_COMPRESSION_CONTROL_SWAPCHAIN_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_IMAGE_COMPRESSION_CONTROL_SWAPCHAIN_EXTENSION_NAME".."VK_EXT_image_compression_control_swapchain"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_SWAPCHAIN_FEATURES_EXT".."1000437000"
    )
}