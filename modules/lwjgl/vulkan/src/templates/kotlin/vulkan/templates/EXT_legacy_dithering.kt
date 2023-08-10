/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_legacy_dithering = "EXTLegacyDithering".nativeClassVK("EXT_legacy_dithering", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension exposes a hardware feature used by some vendors to implement OpenGL’s dithering. The purpose of this extension is to support layering OpenGL over Vulkan, by allowing the layer to take advantage of the same hardware feature and provide equivalent dithering to OpenGL applications.

        <h5>VK_EXT_legacy_dithering</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_legacy_dithering}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>466</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>

            <dt><b>Special Use</b></dt>
            <dd><ul>
                <li><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#extendingvulkan-compatibility-specialuse">OpenGL / ES support</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Shahbaz Youssefi <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_legacy_dithering]%20@syoussefi%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_legacy_dithering%20extension*">syoussefi</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_legacy_dithering.adoc">VK_EXT_legacy_dithering</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2022-03-31</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Shahbaz Youssefi, Google</li>
                <li>Graeme Leese, Broadcom</li>
                <li>Jan-Harald Fredriksen, Arm</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_LEGACY_DITHERING_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_LEGACY_DITHERING_EXTENSION_NAME".."VK_EXT_legacy_dithering"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_DITHERING_FEATURES_EXT".."1000465000"
    )

    EnumConstant(
        "Extends {@code VkSubpassDescriptionFlagBits}.",

        "SUBPASS_DESCRIPTION_ENABLE_LEGACY_DITHERING_BIT_EXT".enum(0x00000080)
    )

    EnumConstant(
        "Extends {@code VkRenderingFlagBits}.",

        "RENDERING_ENABLE_LEGACY_DITHERING_BIT_EXT".enum(0x00000008)
    )
}