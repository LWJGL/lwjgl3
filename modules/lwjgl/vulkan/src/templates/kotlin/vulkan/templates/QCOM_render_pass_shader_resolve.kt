/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_render_pass_shader_resolve = "QCOMRenderPassShaderResolve".nativeClassVK("QCOM_render_pass_shader_resolve", type = "device", postfix = "QCOM") {
    documentation =
        """
        This extension allows a shader resolve to replace fixed-function resolve.

        Fixed-function resolve is limited in function to simple filters of multisample buffers to a single sample buffer.

        Fixed-function resolve is more performance efficient and/or power efficient than shader resolve for such simple filters.

        Shader resolve allows a shader writer to create complex, non-linear filtering of a multisample buffer in the last subpass of a subpass dependency chain.

        This extension also provides a bit which <b>can</b> be used to enlarge a sample region dependency to a fragment region dependency, so that a framebuffer-region dependency <b>can</b> replace a framebuffer-global dependency in some cases.

        <h5>VK_QCOM_render_pass_shader_resolve</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_QCOM_render_pass_shader_resolve}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>172</dd>

            <dt><b>Revision</b></dt>
            <dd>4</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Bill Licea-Kane <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_QCOM_render_pass_shader_resolve]%20@wwlk%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_QCOM_render_pass_shader_resolve%20extension%3E%3E">wwlk</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2019-11-07</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd>None.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Srihari Babu Alla, Qualcomm</li>
                <li>Bill Licea-Kane, Qualcomm</li>
                <li>Jeff Leger, Qualcomm</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "QCOM_RENDER_PASS_SHADER_RESOLVE_SPEC_VERSION".."4"
    )

    StringConstant(
        "The extension name.",

        "QCOM_RENDER_PASS_SHADER_RESOLVE_EXTENSION_NAME".."VK_QCOM_render_pass_shader_resolve"
    )

    EnumConstant(
        "Extends {@code VkSubpassDescriptionFlagBits}.",

        "SUBPASS_DESCRIPTION_FRAGMENT_REGION_BIT_QCOM".enum(0x00000004),
        "SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM".enum(0x00000008)
    )
}