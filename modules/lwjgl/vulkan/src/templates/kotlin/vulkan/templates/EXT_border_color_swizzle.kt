/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_border_color_swizzle = "EXTBorderColorSwizzle".nativeClassVK("EXT_border_color_swizzle", type = "device", postfix = "EXT") {
    documentation =
        """
        After the publication of VK_EXT_custom_border_color, it was discovered that some implementations had undefined behavior when combining a sampler that uses a custom border color with image views whose component mapping is not the identity mapping.

        Since VK_EXT_custom_border_color has already shipped, this new extension VK_EXT_border_color_swizzle was created to define the interaction between custom border colors and non-identity image view swizzles, and provide a work-around for implementations that must pre-swizzle the sampler border color to match the image view component mapping it is combined with.

        This extension also defines the behavior between samplers with an opaque black border color and image views with a non-identity component swizzle, which was previously left undefined.

        <h5>VK_EXT_border_color_swizzle</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_border_color_swizzle}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>412</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link EXTCustomBorderColor VK_EXT_custom_border_color}</li>
            </ul></dd>

            <dt><b>Special Uses</b></dt>
            <dd><ul>
                <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#extendingvulkan-compatibility-specialuse">OpenGL / ES support</a></li>
                <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#extendingvulkan-compatibility-specialuse">D3D support</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Piers Daniell <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_border_color_swizzle]%20@pdaniell-nv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_border_color_swizzle%20extension%3E%3E">pdaniell-nv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-10-12</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Graeme Leese, Broadcom</li>
                <li>Jan-Harald Fredriksen, Arm</li>
                <li>Ricardo Garcia, Igalia</li>
                <li>Shahbaz Youssefi, Google</li>
                <li>Stu Smith, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_BORDER_COLOR_SWIZZLE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_BORDER_COLOR_SWIZZLE_EXTENSION_NAME".."VK_EXT_border_color_swizzle"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_BORDER_COLOR_SWIZZLE_FEATURES_EXT".."1000411000",
        "STRUCTURE_TYPE_SAMPLER_BORDER_COLOR_COMPONENT_MAPPING_CREATE_INFO_EXT".."1000411001"
    )
}