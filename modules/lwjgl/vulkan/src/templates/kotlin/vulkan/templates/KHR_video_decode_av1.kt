/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_video_decode_av1 = "KHRVideoDecodeAV1".nativeClassVK("KHR_video_decode_av1", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension builds upon the {@link KHRVideoDecodeQueue VK_KHR_video_decode_queue} extension by adding support for decoding elementary video stream sequences compliant with the AV1 video compression standard.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_video_decode_av1}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>513</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRVideoDecodeQueue VK_KHR_video_decode_queue}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Daniel Rakos <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_video_decode_av1]%20@aqnuep%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_video_decode_av1%20extension*">aqnuep</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_video_decode_av1.adoc">VK_KHR_video_decode_av1</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2024-01-02</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Ahmed Abdelkhalek, AMD</li>
                <li>Benjamin Cheng, AMD</li>
                <li>Ho Hin Lau, AMD</li>
                <li>Lynne Iribarren, Independent</li>
                <li>David Airlie, Red Hat, Inc.</li>
                <li>Ping Liu, Intel</li>
                <li>Srinath Kumarapuram, NVIDIA</li>
                <li>Vassili Nikolaev, NVIDIA</li>
                <li>Tony Zlatinski, NVIDIA</li>
                <li>Charlie Turner, Igalia</li>
                <li>Daniel Almeida, Collabora</li>
                <li>Nicolas Dufresne, Collabora</li>
                <li>Daniel Rakos, RasterGrid</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_VIDEO_DECODE_AV1_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_VIDEO_DECODE_AV1_EXTENSION_NAME".."VK_KHR_video_decode_av1"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_VIDEO_DECODE_AV1_CAPABILITIES_KHR".."1000512000",
        "STRUCTURE_TYPE_VIDEO_DECODE_AV1_PICTURE_INFO_KHR".."1000512001",
        "STRUCTURE_TYPE_VIDEO_DECODE_AV1_PROFILE_INFO_KHR".."1000512003",
        "STRUCTURE_TYPE_VIDEO_DECODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR".."1000512004",
        "STRUCTURE_TYPE_VIDEO_DECODE_AV1_DPB_SLOT_INFO_KHR".."1000512005"
    )

    EnumConstant(
        "Extends {@code VkVideoCodecOperationFlagBitsKHR}.",

        "VIDEO_CODEC_OPERATION_DECODE_AV1_BIT_KHR".enum(0x00000004)
    )

    EnumConstant(
        "VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR",

        "MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR".."7"
    )
}