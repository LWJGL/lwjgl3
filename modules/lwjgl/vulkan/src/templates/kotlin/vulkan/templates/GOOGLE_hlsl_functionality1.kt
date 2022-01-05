/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val GOOGLE_hlsl_functionality1 = "GOOGLEHlslFunctionality1".nativeClassVK("GOOGLE_hlsl_functionality1", type = "device", postfix = "GOOGLE") {
    documentation =
        """
        The {@code VK_GOOGLE_hlsl_functionality1} extension allows use of the {@code SPV_GOOGLE_hlsl_functionality1} extension in SPIR-V shader modules.

        <h5>VK_GOOGLE_hlsl_functionality1</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_GOOGLE_hlsl_functionality1}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>224</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Hai Nguyen <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_GOOGLE_hlsl_functionality1]%20@chaoticbob%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_GOOGLE_hlsl_functionality1%20extension%3E%3E">chaoticbob</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2018-07-09</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/GOOGLE/SPV_GOOGLE_hlsl_functionality1.html">{@code SPV_GOOGLE_hlsl_functionality1}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Hai Nguyen, Google</li>
                <li>Neil Henning, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "GOOGLE_HLSL_FUNCTIONALITY_1_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "GOOGLE_HLSL_FUNCTIONALITY_1_EXTENSION_NAME".."VK_GOOGLE_hlsl_functionality1"
    )

    IntConstant(
        "The extension specification version.",

        "GOOGLE_HLSL_FUNCTIONALITY1_SPEC_VERSION".."VK_GOOGLE_HLSL_FUNCTIONALITY_1_SPEC_VERSION"
    )

    StringConstant(
        "The extension name.",

        "GOOGLE_HLSL_FUNCTIONALITY1_EXTENSION_NAME".expr("VK_GOOGLE_HLSL_FUNCTIONALITY_1_EXTENSION_NAME")
    )
}