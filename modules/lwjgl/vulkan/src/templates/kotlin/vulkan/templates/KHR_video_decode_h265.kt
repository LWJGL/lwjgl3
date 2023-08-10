/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_video_decode_h265 = "KHRVideoDecodeH265".nativeClassVK("KHR_video_decode_h265", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension builds upon the {@link KHRVideoDecodeQueue VK_KHR_video_decode_queue} extension by adding support for decoding elementary video stream sequences compliant with the H.265/HEVC video compression standard.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        This extension was promoted to {@code KHR} from the provisional extension {@code VK_EXT_video_decode_h265}.
        </div>

        <h5>VK_KHR_video_decode_h265</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_video_decode_h265}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>188</dd>

            <dt><b>Revision</b></dt>
            <dd>7</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRVideoDecodeQueue VK_KHR_video_decode_queue}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li><a href="mailto:peter.fang@amd.com">peter.fang@amd.com</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_video_decode_h265.adoc">VK_KHR_video_decode_h265</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2022-11-14</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Ahmed Abdelkhalek, AMD</li>
                <li>HoHin Lau, AMD</li>
                <li>Jake Beju, AMD</li>
                <li>Peter Fang, AMD</li>
                <li>Ping Liu, Intel</li>
                <li>Srinath Kumarapuram, NVIDIA</li>
                <li>Tony Zlatinski, NVIDIA</li>
                <li>Daniel Rakos, RasterGrid</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_VIDEO_DECODE_H265_SPEC_VERSION".."7"
    )

    StringConstant(
        "The extension name.",

        "KHR_VIDEO_DECODE_H265_EXTENSION_NAME".."VK_KHR_video_decode_h265"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_VIDEO_DECODE_H265_CAPABILITIES_KHR".."1000187000",
        "STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR".."1000187001",
        "STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR".."1000187002",
        "STRUCTURE_TYPE_VIDEO_DECODE_H265_PROFILE_INFO_KHR".."1000187003",
        "STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_KHR".."1000187004",
        "STRUCTURE_TYPE_VIDEO_DECODE_H265_DPB_SLOT_INFO_KHR".."1000187005"
    )

    EnumConstant(
        "Extends {@code VkVideoCodecOperationFlagBitsKHR}.",

        "VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR".enum(0x00000002)
    )
}