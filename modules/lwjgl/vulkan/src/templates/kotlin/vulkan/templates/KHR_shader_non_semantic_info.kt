/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_shader_non_semantic_info = "KHRShaderNonSemanticInfo".nativeClassVK("KHR_shader_non_semantic_info", type = "device", postfix = KHR) {
    documentation =
        """
        This extension allows the use of the {@code SPV_KHR_non_semantic_info} extension in SPIR-V shader modules.

        <h5>VK_KHR_shader_non_semantic_info</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_shader_non_semantic_info}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>294</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Baldur Karlsson <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_shader_non_semantic_info:%20&amp;body=@baldurk%20">baldurk</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2019-10-16</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_non_semantic_info.html">{@code SPV_KHR_non_semantic_info}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Baldur Karlsson, Valve</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_SHADER_NON_SEMANTIC_INFO_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_SHADER_NON_SEMANTIC_INFO_EXTENSION_NAME".."VK_KHR_shader_non_semantic_info"
    )
}