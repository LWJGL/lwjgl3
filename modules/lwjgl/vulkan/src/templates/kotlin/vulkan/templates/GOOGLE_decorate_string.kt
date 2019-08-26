/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val GOOGLE_decorate_string = "GOOGLEDecorateString".nativeClassVK("GOOGLE_decorate_string", type = "device", postfix = GOOGLE) {
    documentation =
        """
        The {@code VK_GOOGLE_decorate_string} extension allows use of the {@code SPV_GOOGLE_decorate_string} extension in SPIR-V shader modules.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_GOOGLE_decorate_string}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>225</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Hai Nguyen <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_GOOGLE_decorate_string:%20&amp;body=@chaoticbob%20">chaoticbob</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2018-07-09</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Requires the <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/GOOGLE/SPV_GOOGLE_decorate_string.html">{@code SPV_GOOGLE_decorate_string}</a> SPIR-V extension.</li>
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

        "GOOGLE_DECORATE_STRING_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "GOOGLE_DECORATE_STRING_EXTENSION_NAME".."VK_GOOGLE_decorate_string"
    )
}