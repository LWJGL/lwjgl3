/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_fill_rectangle = "NVFillRectangle".nativeClassVK("NV_fill_rectangle", type = "device", postfix = "NV") {
    documentation =
        """
        This extension adds a new {@code VkPolygonMode} {@code enum} where a triangle is rasterized by computing and filling its axis-aligned screen-space bounding box, disregarding the actual triangle edges. This can be useful for drawing a rectangle without being split into two triangles with an internal edge. It is also useful to minimize the number of primitives that need to be drawn, particularly for a user interface.

        <h5>VK_NV_fill_rectangle</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_fill_rectangle}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>154</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_fill_rectangle]%20@jeffbolznv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_fill_rectangle%20extension%3E%3E">jeffbolznv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2017-05-22</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_FILL_RECTANGLE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_FILL_RECTANGLE_EXTENSION_NAME".."VK_NV_fill_rectangle"
    )

    EnumConstant(
        "Extends {@code VkPolygonMode}.",

        "POLYGON_MODE_FILL_RECTANGLE_NV".."1000153000"
    )
}