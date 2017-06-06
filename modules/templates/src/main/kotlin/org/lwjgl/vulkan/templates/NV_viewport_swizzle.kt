/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val NV_viewport_swizzle = "NVViewportSwizzle".nativeClassVK("NV_viewport_swizzle", type = "device", postfix = NV) {
    documentation =
        """
        This extension provides a new per-viewport swizzle that can modify the position of primitives sent to each viewport. New viewport swizzle state is added for each viewport, and a new position vector is computed for each vertex by selecting from and optionally negating any of the four components of the original position vector.

        This new viewport swizzle is useful for a number of algorithms, including single-pass cubemap rendering (broadcasting a primitive to multiple faces and reorienting the vertex position for each face) and voxel rasterization. The per-viewport component remapping and negation provided by the swizzle allows application code to re-orient three-dimensional geometry with a view along any of the X, Y, or Z axes. If a perspective projection and depth buffering is required, 1/W buffering should be used, as described in the single-pass cubemap rendering example in the "Issues" section below.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_NV_viewport_swizzle</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>99</dd>

            <dt><b>Status</b></dt>
            <dd>Complete</dd>

            <dt><b>Last Modified Data</b></dt>
            <dd>2016-12-22</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
                <li>This extension requires Vulkan 1.0.</li>
                <li>This extension requires {@code multiViewport} and {@code geometryShader} features to be useful.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Daniel Koch, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Piers Daniell (pdaniell 'at' nvidia.com)</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_VIEWPORT_SWIZZLE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_VIEWPORT_SWIZZLE_EXTENSION_NAME".."VK_NV_viewport_swizzle"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV".."1000098000"
    )

    EnumConstant(
        """
        VkViewportCoordinateSwizzleNV - Specify how a viewport coordinate is swizzled

        <h5>Description</h5>
        These values are described in detail in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#vertexpostproc-viewport-swizzle">Viewport Swizzle</a>.

        <h5>See Also</h5>
        ##VkViewportSwizzleNV
        """,

        "VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV".."0",
        "VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV".."1",
        "VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV".."2",
        "VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV".."3",
        "VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV".."4",
        "VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV".."5",
        "VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV".."6",
        "VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV".."7"
    )
}