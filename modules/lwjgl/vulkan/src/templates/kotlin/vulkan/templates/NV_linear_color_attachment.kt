/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_linear_color_attachment = "NVLinearColorAttachment".nativeClassVK("NV_linear_color_attachment", type = "device", postfix = "NV") {
    documentation =
        """
        This extension expands support for using #IMAGE_TILING_LINEAR images as color attachments when all the color attachments in the render pass instance have #IMAGE_TILING_LINEAR tiling. This extension adds a new flag bit #FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV that extends the existing {@code VkFormatFeatureFlagBits2KHR} bits. This flag <b>can</b> be set for renderable color formats in the ##VkFormatProperties3KHR{@code ::linearTilingFeatures} format properties structure member. Formats with the #FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV flag <b>may</b> be used as color attachments as long as all the color attachments in the render pass instance have #IMAGE_TILING_LINEAR tiling, and the formats their images views are created with have ##VkFormatProperties3KHR{@code ::linearTilingFeatures} which include #FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV. This extension supports both dynamic rendering and traditional render passes.

        <h5>VK_NV_linear_color_attachment</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_linear_color_attachment}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>431</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>sourav parmar <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_linear_color_attachment]%20@souravpNV%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_linear_color_attachment%20extension%3E%3E">souravpNV</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-12-02</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires {@link KHRFormatFeatureFlags2 VK_KHR_format_feature_flags2}</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Pat Brown, NVIDIA</li>
                <li>Piers Daniell, NVIDIA</li>
                <li>Sourav Parmar, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_LINEAR_COLOR_ATTACHMENT_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_LINEAR_COLOR_ATTACHMENT_EXTENSION_NAME".."VK_NV_linear_color_attachment"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_LINEAR_COLOR_ATTACHMENT_FEATURES_NV".."1000430000"
    )

    EnumConstantLong(
        "Extends {@code VkFormatFeatureFlagBits2}.",

        "FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV".enum(0x4000000000L)
    )
}