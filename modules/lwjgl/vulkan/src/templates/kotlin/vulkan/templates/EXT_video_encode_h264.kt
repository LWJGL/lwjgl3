/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_video_encode_h264 = "EXTVideoEncodeH264".nativeClassVK("EXT_video_encode_h264", type = "device", postfix = EXT) {
    documentation =
        """
        <ul>
            <li>##VkVideoEncodeH264DpbSlotInfoEXT</li>
            <li>##VkVideoEncodeH264NaluSliceEXT</li>
            <li>
                Extending ##VkVideoCapabilitiesKHR:
                <ul>
                    <li>##VkVideoEncodeH264CapabilitiesEXT</li>
                </ul>
            </li>
            <li>
                Extending ##VkVideoEncodeInfoKHR:
                <ul>
                    <li>##VkVideoEncodeH264EmitPictureParametersEXT</li>
                    <li>##VkVideoEncodeH264VclFrameInfoEXT</li>
                </ul>
            </li>
            <li>
                Extending ##VkVideoProfileKHR, ##VkQueryPoolCreateInfo, ##VkFormatProperties2, ##VkImageCreateInfo, ##VkImageViewCreateInfo, ##VkBufferCreateInfo:
                <ul>
                    <li>##VkVideoEncodeH264ProfileEXT</li>
                </ul>
            </li>
            <li>
                Extending ##VkVideoSessionCreateInfoKHR:
                <ul>
                    <li>##VkVideoEncodeH264SessionCreateInfoEXT</li>
                </ul>
            </li>
            <li>
                Extending ##VkVideoSessionParametersCreateInfoKHR:
                <ul>
                    <li>##VkVideoEncodeH264SessionParametersCreateInfoEXT</li>
                </ul>
            </li>
            <li>
                Extending ##VkVideoSessionParametersUpdateInfoKHR:
                <ul>
                    <li>##VkVideoEncodeH264SessionParametersAddInfoEXT</li>
                </ul>
            </li>
        </ul>

        <h5>VK_EXT_video_encode_h264</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_video_encode_h264}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>39</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRVideoEncodeQueue VK_KHR_video_encode_queue}</li>
                <li>This is a <em>provisional</em> extension and <b>must</b> be used with caution. See the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#boilerplate-provisional-header">description</a> of provisional header files for enablement and stability details.</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Ahmed Abdelkhalek <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_video_encode_h264]%20@aabdelkh%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_video_encode_h264%20extension%3E%3E">aabdelkh</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-03-29</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Ahmed Abdelkhalek, AMD</li>
                <li>Daniel Rakos, AMD</li>
                <li>George Hao, AMD</li>
                <li>Jake Beju, AMD</li>
                <li>Peter Fang, AMD</li>
                <li>Ping Liu, Intel</li>
                <li>Srinath Kumarapuram, NVIDIA</li>
                <li>Tony Zlatinski, NVIDIA</li>
                <li>Yang Liu, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_VIDEO_ENCODE_H264_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "EXT_VIDEO_ENCODE_H264_EXTENSION_NAME".."VK_EXT_video_encode_h264"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_EXT".."1000038000",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_CREATE_INFO_EXT".."1000038001",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_CREATE_INFO_EXT".."1000038002",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT".."1000038003",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_VCL_FRAME_INFO_EXT".."1000038004",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_DPB_SLOT_INFO_EXT".."1000038005",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_EXT".."1000038006",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_EMIT_PICTURE_PARAMETERS_EXT".."1000038007",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_PROFILE_EXT".."1000038008"
    )

    EnumConstant(
        "Extends {@code VkVideoCodecOperationFlagBitsKHR}.",

        "VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT".enum(0x00010000)
    )

    EnumConstant(
        """
        VkVideoEncodeH264CapabilityFlagBitsEXT - Video encode H.264 capability flags

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_CABAC_BIT_EXT reports if CABAC entropy coding is supported.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_CAVLC_BIT_EXT reports if CAVLC entropy coding is supported. An implementation <b>must</b> support at least one entropy coding mode.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_WEIGHTED_BI_PRED_IMPLICIT_BIT_EXT reports if using weighted_bipred_idc_flag from StdVideoH264PpsFlags is supported.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_TRANSFORM_8X8_BIT_EXT reports if enabling transform_8x8_mode_flag in StdVideoH264PpsFlags is supported.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_CHROMA_QP_OFFSET_BIT_EXT reports if setting chroma_qp_index_offset in StdVideoH264PictureParameterSet is supported.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_SECOND_CHROMA_QP_OFFSET_BIT_EXT reports if setting second_chroma_qp_index_offset in StdVideoH264PictureParameterSet is supported.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_DEBLOCKING_FILTER_DISABLED_BIT_EXT reports if using STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_DISABLED from StdVideoH264DisableDeblockingFilterIdc is supported.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_DEBLOCKING_FILTER_ENABLED_BIT_EXT reports if using STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_ENABLED from StdVideoH264DisableDeblockingFilterIdc is supported.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_DEBLOCKING_FILTER_PARTIAL_BIT_EXT reports if using STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_PARTIAL from StdVideoH264DisableDeblockingFilterIdc is supported. An implementation <b>must</b> support at least one deblocking filter mode.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_MULTIPLE_SLICE_PER_FRAME_BIT_EXT</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_EVENLY_DISTRIBUTED_SLICE_SIZE_BIT_EXT</li>
        </ul>
        """,

        "VIDEO_ENCODE_H264_CAPABILITY_CABAC_BIT_EXT".enum(0x00000001),
        "VIDEO_ENCODE_H264_CAPABILITY_CAVLC_BIT_EXT".enum(0x00000002),
        "VIDEO_ENCODE_H264_CAPABILITY_WEIGHTED_BI_PRED_IMPLICIT_BIT_EXT".enum(0x00000004),
        "VIDEO_ENCODE_H264_CAPABILITY_TRANSFORM_8X8_BIT_EXT".enum(0x00000008),
        "VIDEO_ENCODE_H264_CAPABILITY_CHROMA_QP_OFFSET_BIT_EXT".enum(0x00000010),
        "VIDEO_ENCODE_H264_CAPABILITY_SECOND_CHROMA_QP_OFFSET_BIT_EXT".enum(0x00000020),
        "VIDEO_ENCODE_H264_CAPABILITY_DEBLOCKING_FILTER_DISABLED_BIT_EXT".enum(0x00000040),
        "VIDEO_ENCODE_H264_CAPABILITY_DEBLOCKING_FILTER_ENABLED_BIT_EXT".enum(0x00000080),
        "VIDEO_ENCODE_H264_CAPABILITY_DEBLOCKING_FILTER_PARTIAL_BIT_EXT".enum(0x00000100),
        "VIDEO_ENCODE_H264_CAPABILITY_MULTIPLE_SLICE_PER_FRAME_BIT_EXT".enum(0x00000200),
        "VIDEO_ENCODE_H264_CAPABILITY_EVENLY_DISTRIBUTED_SLICE_SIZE_BIT_EXT".enum(0x00000400)
    )

    EnumConstant(
        """
        VkVideoEncodeH264InputModeFlagBitsEXT - Video encode H.264 input modes

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_H264_INPUT_MODE_FRAME_BIT_EXT indicates that a single command buffer <b>must</b> at least encode an entire frame. Any non-VCL NALUs <b>must</b> be encoded using the same command buffer as the frame if #VIDEO_ENCODE_H264_INPUT_MODE_NON_VCL_BIT_EXT is not supported.</li>
            <li>#VIDEO_ENCODE_H264_INPUT_MODE_SLICE_BIT_EXT indicates that a single command buffer <b>must</b> at least encode a single slice. Any non-VCL NALUs <b>must</b> be encoded using the same command buffer as the first slice of the frame if #VIDEO_ENCODE_H264_INPUT_MODE_NON_VCL_BIT_EXT is not supported.</li>
            <li>#VIDEO_ENCODE_H264_INPUT_MODE_NON_VCL_BIT_EXT indicates that a single command buffer <b>may</b> encode a non-VCL NALU by itself.</li>
        </ul>

        An implementation <b>must</b> support at least one of #VIDEO_ENCODE_H264_INPUT_MODE_FRAME_BIT_EXT or #VIDEO_ENCODE_H264_INPUT_MODE_SLICE_BIT_EXT.
        """,

        "VIDEO_ENCODE_H264_INPUT_MODE_FRAME_BIT_EXT".enum(0x00000001),
        "VIDEO_ENCODE_H264_INPUT_MODE_SLICE_BIT_EXT".enum(0x00000002),
        "VIDEO_ENCODE_H264_INPUT_MODE_NON_VCL_BIT_EXT".enum(0x00000004)
    )

    EnumConstant(
        """
        VkVideoEncodeH264OutputModeFlagBitsEXT - Video encode H.264 output modes

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_H264_OUTPUT_MODE_FRAME_BIT_EXT indicates that calls to generate all NALUs of a frame <b>must</b> be included within a single begin/end pair. Any non-VCL NALUs <b>must</b> be encoded within the same begin/end pair if #VIDEO_ENCODE_H264_OUTPUT_MODE_NON_VCL_BIT_EXT is not supported.</li>
            <li>#VIDEO_ENCODE_H264_OUTPUT_MODE_SLICE_BIT_EXT indicates that each begin/end pair <b>must</b> encode at least one slice. Any non-VCL NALUs <b>must</b> be encoded within the same begin/end pair as the first slice of the frame if #VIDEO_ENCODE_H264_OUTPUT_MODE_NON_VCL_BIT_EXT is not supported.</li>
            <li>#VIDEO_ENCODE_H264_OUTPUT_MODE_NON_VCL_BIT_EXT indicates that each begin/end pair <b>may</b> encode only a non-VCL NALU by itself. An implementation <b>must</b> support at least one of #VIDEO_ENCODE_H264_OUTPUT_MODE_FRAME_BIT_EXT or #VIDEO_ENCODE_H264_OUTPUT_MODE_SLICE_BIT_EXT.</li>
        </ul>

        A single begin/end pair <b>must</b> not encode more than a single frame.

        The bitstreams of NALUs generated within a single begin/end pair are written continuously into the same bitstream buffer (any padding between the NALUs <b>must</b> be compliant to the H.264 standard).

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

        "VIDEO_ENCODE_H264_OUTPUT_MODE_FRAME_BIT_EXT".enum(0x00000001),
        "VIDEO_ENCODE_H264_OUTPUT_MODE_SLICE_BIT_EXT".enum(0x00000002),
        "VIDEO_ENCODE_H264_OUTPUT_MODE_NON_VCL_BIT_EXT".enum(0x00000004)
    )

    EnumConstant(
        """
        VkVideoEncodeH264CreateFlagBitsEXT - Video encode session creation flags

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_H264_CREATE_DEFAULT_EXT is 0, and specifies no additional creation flags.</li>
            <li>#VIDEO_ENCODE_H264_CREATE_RESERVED_0_BIT_EXT The current version of the specification has reserved this value for future use.</li>
        </ul>
        """,

        "VIDEO_ENCODE_H264_CREATE_DEFAULT_EXT".."0",
        "VIDEO_ENCODE_H264_CREATE_RESERVED_0_BIT_EXT".enum(0x00000001)
    )
}