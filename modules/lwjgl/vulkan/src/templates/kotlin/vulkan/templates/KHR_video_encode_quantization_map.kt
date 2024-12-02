/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_video_encode_quantization_map = "KHRVideoEncodeQuantizationMap".nativeClassVK("KHR_video_encode_quantization_map", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension builds upon the {@link KHRVideoEncodeQueue VK_KHR_video_encode_queue} extension by enabling fine grained control of codec-specific quantization parameters in video encode operations.

        More specifically, it adds support for quantization maps:

        <ul>
            <li>Quantization delta maps to directly control the relative value of quantization parameter values on a per-block basis for all rate control modes (including when rate control is disabled).</li>
            <li>Emphasis maps to indirectly control the relative quantization parameter values on a per-block basis when rate control is not disabled and the rate control mode is not configured to the implementation-defined default mode.</li>
        </ul>

        This extension is to be used in conjunction with other codec specific video encode extensions that specify the codec specific quantization parameters these maps control.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_video_encode_quantization_map}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>554</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRVideoEncodeQueue VK_KHR_video_encode_queue} and {@link KHRFormatFeatureFlags2 VK_KHR_format_feature_flags2}</dd>

            <dt><b>API Interactions</b></dt>
            <dd><ul>
                <li>Interacts with VK_KHR_video_encode_av1</li>
                <li>Interacts with VK_KHR_video_encode_h264</li>
                <li>Interacts with VK_KHR_video_encode_h265</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Ahmed Abdelkhalek <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_video_encode_quantization_map]%20@aabdelkh%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_video_encode_quantization_map%20extension*">aabdelkh</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_video_encode_quantization_map.adoc">VK_KHR_video_encode_quantization_map</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2024-09-23</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Ahmed Abdelkhalek, AMD</li>
                <li>Benjamin Cheng, AMD</li>
                <li>Srinath Kumarapuram, NVIDIA</li>
                <li>Tony Zlatinski, NVIDIA</li>
                <li>Ping Liu, Intel</li>
                <li>Daniel Rakos, RasterGrid</li>
                <li>Lynne Iribarren, Independent</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_VIDEO_ENCODE_QUANTIZATION_MAP_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "KHR_VIDEO_ENCODE_QUANTIZATION_MAP_EXTENSION_NAME".."VK_KHR_video_encode_quantization_map"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_CAPABILITIES_KHR".."1000553000",
        "STRUCTURE_TYPE_VIDEO_FORMAT_QUANTIZATION_MAP_PROPERTIES_KHR".."1000553001",
        "STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_INFO_KHR".."1000553002",
        "STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_SESSION_PARAMETERS_CREATE_INFO_KHR".."1000553005",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_QUANTIZATION_MAP_FEATURES_KHR".."1000553009"
    )

    EnumConstant(
        "Extends {@code VkVideoEncodeCapabilityFlagBitsKHR}.",

        "VIDEO_ENCODE_CAPABILITY_QUANTIZATION_DELTA_MAP_BIT_KHR".enum(0x00000004),
        "VIDEO_ENCODE_CAPABILITY_EMPHASIS_MAP_BIT_KHR".enum(0x00000008)
    )

    EnumConstant(
        "Extends {@code VkVideoSessionCreateFlagBitsKHR}.",

        "VIDEO_SESSION_CREATE_ALLOW_ENCODE_QUANTIZATION_DELTA_MAP_BIT_KHR".enum(0x00000008),
        "VIDEO_SESSION_CREATE_ALLOW_ENCODE_EMPHASIS_MAP_BIT_KHR".enum(0x00000010)
    )

    EnumConstant(
        "Extends {@code VkVideoSessionParametersCreateFlagBitsKHR}.",

        "VIDEO_SESSION_PARAMETERS_CREATE_QUANTIZATION_MAP_COMPATIBLE_BIT_KHR".enum(0x00000001)
    )

    EnumConstant(
        "Extends {@code VkVideoEncodeFlagBitsKHR}.",

        "VIDEO_ENCODE_WITH_QUANTIZATION_DELTA_MAP_BIT_KHR".enum(0x00000001),
        "VIDEO_ENCODE_WITH_EMPHASIS_MAP_BIT_KHR".enum(0x00000002)
    )

    EnumConstant(
        "Extends {@code VkImageUsageFlagBits}.",

        "IMAGE_USAGE_VIDEO_ENCODE_QUANTIZATION_DELTA_MAP_BIT_KHR".enum(0x02000000),
        "IMAGE_USAGE_VIDEO_ENCODE_EMPHASIS_MAP_BIT_KHR".enum(0x04000000)
    )

    EnumConstantLong(
        "Extends {@code VkFormatFeatureFlagBits2}.",

        "FORMAT_FEATURE_2_VIDEO_ENCODE_QUANTIZATION_DELTA_MAP_BIT_KHR".enum(0x2000000000000L),
        "FORMAT_FEATURE_2_VIDEO_ENCODE_EMPHASIS_MAP_BIT_KHR".enum(0x4000000000000L)
    )

    EnumConstant(
        "Extends {@code VkImageLayout}.",

        "IMAGE_LAYOUT_VIDEO_ENCODE_QUANTIZATION_MAP_KHR".."1000553000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_QUANTIZATION_MAP_CAPABILITIES_KHR".."1000553003"
    )

    EnumConstant(
        "Extends {@code VkVideoEncodeH264CapabilityFlagBitsKHR}.",

        "VIDEO_ENCODE_H264_CAPABILITY_MB_QP_DIFF_WRAPAROUND_BIT_KHR".enum(0x00000200)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_QUANTIZATION_MAP_CAPABILITIES_KHR".."1000553004",
        "STRUCTURE_TYPE_VIDEO_FORMAT_H265_QUANTIZATION_MAP_PROPERTIES_KHR".."1000553006"
    )

    EnumConstant(
        "Extends {@code VkVideoEncodeH265CapabilityFlagBitsKHR}.",

        "VIDEO_ENCODE_H265_CAPABILITY_CU_QP_DIFF_WRAPAROUND_BIT_KHR".enum(0x00000400)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_VIDEO_ENCODE_AV1_QUANTIZATION_MAP_CAPABILITIES_KHR".."1000553007",
        "STRUCTURE_TYPE_VIDEO_FORMAT_AV1_QUANTIZATION_MAP_PROPERTIES_KHR".."1000553008"
    )
}