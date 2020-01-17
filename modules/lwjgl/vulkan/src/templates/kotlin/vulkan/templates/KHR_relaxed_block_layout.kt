/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_relaxed_block_layout = "KHRRelaxedBlockLayout".nativeClassVK("KHR_relaxed_block_layout", type = "device", postfix = KHR) {
    documentation =
        """
        The {@code VK_KHR_relaxed_block_layout} extension allows implementations to indicate they can support more variation in block {@code Offset} decorations. For example, placing a vector of three floats at an offset of <code>16×N + 4</code>.

        See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#interfaces-resources-layout">Offset and Stride Assignment</a> for details.

        <h5>Promotion to Vulkan 1.1</h5>
        All functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

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

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#versions-1.1-promotions">Vulkan 1.1</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>John Kessenich <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_relaxed_block_layout:%20&amp;body=@johnkslang%20">johnkslang</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-03-26</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.1 Core</li>
            </ul></dd>

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