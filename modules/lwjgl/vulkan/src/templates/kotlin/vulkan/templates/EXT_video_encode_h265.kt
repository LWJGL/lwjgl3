/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_video_encode_h265 = "EXTVideoEncodeH265".nativeClassVK("EXT_video_encode_h265", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension allows applications to compress a raw video sequence by using the H.265/HEVC video compression standard.

        <h5>VK_EXT_video_encode_h265</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_video_encode_h265}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>40</dd>

            <dt><b>Revision</b></dt>
            <dd>3</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRVideoEncodeQueue VK_KHR_video_encode_queue}</li>
                <li>This is a <em>provisional</em> extension and <b>must</b> be used with caution. See the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#boilerplate-provisional-header">description</a> of provisional header files for enablement and stability details.</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Ahmed Abdelkhalek <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_video_encode_h265]%20@aabdelkh%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_video_encode_h265%20extension%3E%3E">aabdelkh</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-12-08</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Ahmed Abdelkhalek, AMD</li>
                <li>George Hao, AMD</li>
                <li>Jake Beju, AMD</li>
                <li>Chunbo Chen, Intel</li>
                <li>Ping Liu, Intel</li>
                <li>Srinath Kumarapuram, NVIDIA</li>
                <li>Tony Zlatinski, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_VIDEO_ENCODE_H265_SPEC_VERSION".."3"
    )

    StringConstant(
        "The extension name.",

        "EXT_VIDEO_ENCODE_H265_EXTENSION_NAME".."VK_EXT_video_encode_h265"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT".."1000039000",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_CREATE_INFO_EXT".."1000039001",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_CREATE_INFO_EXT".."1000039002",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_EXT".."1000039003",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_VCL_FRAME_INFO_EXT".."1000039004",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_DPB_SLOT_INFO_EXT".."1000039005",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_EXT".."1000039006",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_EMIT_PICTURE_PARAMETERS_EXT".."1000039007",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_PROFILE_EXT".."1000039008",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_REFERENCE_LISTS_EXT".."1000039009",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_INFO_EXT".."1000039010",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_EXT".."1000039011"
    )

    EnumConstant(
        "Extends {@code VkVideoCodecOperationFlagBitsKHR}.",

        "VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT".enum(0x00020000)
    )

    EnumConstant(
        """
        VkVideoEncodeH265InputModeFlagBitsEXT - Video encode H.265 input modes

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_H265_INPUT_MODE_FRAME_BIT_EXT indicates that a single command buffer <b>must</b> at least encode an entire frame. Any non-VCL NALUs <b>must</b> be encoded using the same command buffer as the frame if #VIDEO_ENCODE_H265_INPUT_MODE_NON_VCL_BIT_EXT is not supported.</li>
            <li>#VIDEO_ENCODE_H265_INPUT_MODE_SLICE_BIT_EXT indicates that a single command buffer <b>must</b> at least encode a single slice. Any non-VCL NALUs <b>must</b> be encoded using the same command buffer as the first slice of the frame if #VIDEO_ENCODE_H265_INPUT_MODE_NON_VCL_BIT_EXT is not supported.</li>
            <li>#VIDEO_ENCODE_H265_INPUT_MODE_NON_VCL_BIT_EXT indicates that a single command buffer <b>may</b> encode a non-VCL NALU by itself.</li>
        </ul>

        An implementation <b>must</b> support at least one of #VIDEO_ENCODE_H265_INPUT_MODE_FRAME_BIT_EXT or #VIDEO_ENCODE_H265_INPUT_MODE_SLICE_BIT_EXT.
        """,

        "VIDEO_ENCODE_H265_INPUT_MODE_FRAME_BIT_EXT".enum(0x00000001),
        "VIDEO_ENCODE_H265_INPUT_MODE_SLICE_BIT_EXT".enum(0x00000002),
        "VIDEO_ENCODE_H265_INPUT_MODE_NON_VCL_BIT_EXT".enum(0x00000004)
    )

    EnumConstant(
        """
        VkVideoEncodeH265OutputModeFlagBitsEXT - Video encode H.265 output modes

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_H265_OUTPUT_MODE_FRAME_BIT_EXT indicates that calls to generate all NALUs of a frame <b>must</b> be included within a single begin/end pair. Any non-VCL NALUs <b>must</b> be encoded within the same begin/end pair if #VIDEO_ENCODE_H265_OUTPUT_MODE_NON_VCL_BIT_EXT is not supported.</li>
            <li>#VIDEO_ENCODE_H265_OUTPUT_MODE_SLICE_BIT_EXT indicates that each begin/end pair <b>must</b> encode at least one slice. Any non-VCL NALUs <b>must</b> be encoded within the same begin/end pair as the first slice of the frame if #VIDEO_ENCODE_H265_OUTPUT_MODE_NON_VCL_BIT_EXT is not supported.</li>
            <li>#VIDEO_ENCODE_H265_OUTPUT_MODE_NON_VCL_BIT_EXT indicates that each begin/end pair <b>may</b> encode only a non-VCL NALU by itself. An implementation <b>must</b> support at least one of #VIDEO_ENCODE_H265_OUTPUT_MODE_FRAME_BIT_EXT or #VIDEO_ENCODE_H265_OUTPUT_MODE_SLICE_BIT_EXT.</li>
        </ul>

        A single begin/end pair <b>must</b> not encode more than a single frame.

        The bitstreams of NALUs generated within a single begin/end pair are written continuously into the same bitstream buffer (any padding between the NALUs <b>must</b> be compliant to the H.265 standard).

        The supported input modes <b>must</b> be coarser or equal to the supported output modes. For example, it is illegal to report slice input is supported but only frame output is supported.

        An implementation <b>must</b> report one of the following combinations of input/output modes:

        <ul>
            <li>Input: Frame, Output: Frame</li>
            <li>Input: Frame, Output: Frame and Non-VCL</li>
            <li>Input: Frame, Output: Slice</li>
            <li>Input: Frame, Output: Slice and Non-VCL</li>
            <li>Input: Slice, Output: Slice</li>
            <li>Input: Slice, Output: Slice and Non-VCL</li>
            <li>Input: Frame and Non-VCL, Output: Frame and Non-VCL</li>
            <li>Input: Frame and Non-VCL, Output: Slice and Non-VCL</li>
            <li>Input: Slice and Non-VCL, Output: Slice and Non-VCL</li>
        </ul>
        """,

        "VIDEO_ENCODE_H265_OUTPUT_MODE_FRAME_BIT_EXT".enum(0x00000001),
        "VIDEO_ENCODE_H265_OUTPUT_MODE_SLICE_BIT_EXT".enum(0x00000002),
        "VIDEO_ENCODE_H265_OUTPUT_MODE_NON_VCL_BIT_EXT".enum(0x00000004)
    )

    EnumConstant(
        """
        VkVideoEncodeH265CtbSizeFlagBitsEXT - Supported CTB sizes for H.265 video encode

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_H265_CTB_SIZE_8_BIT_EXT specifies that a CTB size of 8x8 is supported.</li>
            <li>#VIDEO_ENCODE_H265_CTB_SIZE_16_BIT_EXT specifies that a CTB size of 16x16 is supported.</li>
            <li>#VIDEO_ENCODE_H265_CTB_SIZE_32_BIT_EXT specifies that a CTB size of 32x32 is supported.</li>
            <li>#VIDEO_ENCODE_H265_CTB_SIZE_64_BIT_EXT specifies that a CTB size of 64x64 is supported.</li>
        </ul>
        """,

        "VIDEO_ENCODE_H265_CTB_SIZE_8_BIT_EXT".enum(0x00000001),
        "VIDEO_ENCODE_H265_CTB_SIZE_16_BIT_EXT".enum(0x00000002),
        "VIDEO_ENCODE_H265_CTB_SIZE_32_BIT_EXT".enum(0x00000004),
        "VIDEO_ENCODE_H265_CTB_SIZE_64_BIT_EXT".enum(0x00000008)
    )

    EnumConstant(
        """
        VkVideoEncodeH265RateControlStructureFlagBitsEXT - Video encode H.265 rate control structure flags

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_H265_RATE_CONTROL_STRUCTURE_UNKNOWN_EXT is 0, and specifies a reference structure unknown at the time of stream rate control configuration.</li>
            <li>#VIDEO_ENCODE_H265_RATE_CONTROL_STRUCTURE_FLAT_BIT_EXT specifies a flat reference structure.</li>
            <li>#VIDEO_ENCODE_H265_RATE_CONTROL_STRUCTURE_DYADIC_BIT_EXT specifies a dyadic reference structure.</li>
        </ul>

        <h5>See Also</h5>
        ##VkVideoEncodeH265RateControlInfoEXT
        """,

        "VIDEO_ENCODE_H265_RATE_CONTROL_STRUCTURE_UNKNOWN_EXT".."0",
        "VIDEO_ENCODE_H265_RATE_CONTROL_STRUCTURE_FLAT_BIT_EXT".enum(0x00000001),
        "VIDEO_ENCODE_H265_RATE_CONTROL_STRUCTURE_DYADIC_BIT_EXT".enum(0x00000002)
    )
}