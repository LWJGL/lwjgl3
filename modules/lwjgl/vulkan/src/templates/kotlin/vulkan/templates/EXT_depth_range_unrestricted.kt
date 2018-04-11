/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_depth_range_unrestricted = "EXTDepthRangeUnrestricted".nativeClassVK("EXT_depth_range_unrestricted", type = "device", postfix = EXT) {
    documentation =
        """
        This extension removes the ##VkViewport {@code minDepth} and {@code maxDepth} restrictions that the values must be between {@code 0.0} and {@code 1.0}, inclusive. It also removes the same restriction on ##VkPipelineDepthStencilStateCreateInfo {@code minDepthBounds} and {@code maxDepthBounds}. Finally it removes the restriction on the {@code depth} value in ##VkClearDepthStencilValue.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_depth_range_unrestricted}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>14</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Piers Daniell @pdaniell</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-06-22</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Daniel Koch, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_DEPTH_RANGE_UNRESTRICTED_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_DEPTH_RANGE_UNRESTRICTED_EXTENSION_NAME".."VK_EXT_depth_range_unrestricted"
    )
}