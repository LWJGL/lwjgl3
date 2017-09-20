/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_relaxed_block_layout = "KHRRelaxedBlockLayout".nativeClassVK("KHR_relaxed_block_layout", type = "device", postfix = KHR) {
    documentation =
        """
        The {@code VK_KHR_relaxed_block_layout} extension allows implementations to indicate they can support more variation in block {@code Offset} decorations. For example, placing a vector of three floats at an offset of 16*N + 4.

        See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#interfaces-resources-layout">Offset and Stride Assignment</a> for details.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_relaxed_block_layout}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>145</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>John Kessenich @johnk</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-03-26</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>John Kessenich, Google</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_RELAXED_BLOCK_LAYOUT_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_RELAXED_BLOCK_LAYOUT_EXTENSION_NAME".."VK_KHR_relaxed_block_layout"
    )
}