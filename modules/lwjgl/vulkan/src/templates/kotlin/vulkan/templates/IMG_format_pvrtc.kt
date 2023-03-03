/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val IMG_format_pvrtc = "IMGFormatPVRTC".nativeClassVK("IMG_format_pvrtc", type = "device", postfix = "IMG") {
    documentation =
        """
        {@code VK_IMG_format_pvrtc} provides additional texture compression functionality specific to Imagination Technologies PowerVR Texture compression format (called PVRTC).

        <h5>Deprecation</h5>
        Both PVRTC1 and PVRTC2 are slower than standard image formats on PowerVR GPUs, and support will be removed from future hardware.

        <h5>VK_IMG_format_pvrtc</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_IMG_format_pvrtc}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>55</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Deprecated</em> without replacement</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Stuart Smith</li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2019-09-02</dd>

            <dt><b>IP Status</b></dt>
            <dd>Imagination Technologies Proprietary</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Stuart Smith, Imagination Technologies</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "IMG_FORMAT_PVRTC_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "IMG_FORMAT_PVRTC_EXTENSION_NAME".."VK_IMG_format_pvrtc"
    )

    EnumConstant(
        "Extends {@code VkFormat}.",

        "FORMAT_PVRTC1_2BPP_UNORM_BLOCK_IMG".."1000054000",
        "FORMAT_PVRTC1_4BPP_UNORM_BLOCK_IMG".."1000054001",
        "FORMAT_PVRTC2_2BPP_UNORM_BLOCK_IMG".."1000054002",
        "FORMAT_PVRTC2_4BPP_UNORM_BLOCK_IMG".."1000054003",
        "FORMAT_PVRTC1_2BPP_SRGB_BLOCK_IMG".."1000054004",
        "FORMAT_PVRTC1_4BPP_SRGB_BLOCK_IMG".."1000054005",
        "FORMAT_PVRTC2_2BPP_SRGB_BLOCK_IMG".."1000054006",
        "FORMAT_PVRTC2_4BPP_SRGB_BLOCK_IMG".."1000054007"
    )
}