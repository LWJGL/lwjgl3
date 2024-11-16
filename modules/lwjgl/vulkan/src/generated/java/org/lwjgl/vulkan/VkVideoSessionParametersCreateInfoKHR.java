/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying parameters of a newly created video session parameters object.
 * 
 * <h5>Description</h5>
 * 
 * <p>Limiting values are defined below that are referenced by the relevant valid usage statements of this structure.</p>
 * 
 * <ul>
 * <li>If {@code videoSession} was created with the codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR}, then let {@code StdVideoH264SequenceParameterSet spsAddList[]} be the list of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-sps">H.264 SPS</a> entries to add to the created video session parameters object, defined as follows:
 * 
 * <ul>
 * <li>If the {@code pParametersAddInfo} member of the {@link VkVideoDecodeH264SessionParametersCreateInfoKHR} structure provided in the {@code pNext} chain is not {@code NULL}, then the set of {@code StdVideoH264SequenceParameterSet} entries specified in {@code pParametersAddInfo→pStdSPSs} are added to {@code spsAddList};</li>
 * <li>If {@code videoSessionParametersTemplate} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then each {@code StdVideoH264SequenceParameterSet} entry stored in it with {@code seq_parameter_set_id} not matching any of the entries already in {@code spsAddList} is added to {@code spsAddList}.</li>
 * </ul>
 * </li>
 * <li>If {@code videoSession} was created with the codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR}, then let {@code StdVideoH264PictureParameterSet ppsAddList[]} be the list of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-pps">H.264 PPS</a> entries to add to the created video session parameters object, defined as follows:
 * 
 * <ul>
 * <li>If the {@code pParametersAddInfo} member of the {@link VkVideoDecodeH264SessionParametersCreateInfoKHR} structure provided in the {@code pNext} chain is not {@code NULL}, then the set of {@code StdVideoH264PictureParameterSet} entries specified in {@code pParametersAddInfo→pStdPPSs} are added to {@code ppsAddList};</li>
 * <li>If {@code videoSessionParametersTemplate} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then each {@code StdVideoH264PictureParameterSet} entry stored in it with {@code seq_parameter_set_id} or {@code pic_parameter_set_id} not matching any of the entries already in {@code ppsAddList} is added to {@code ppsAddList}.</li>
 * </ul>
 * </li>
 * <li>If {@code videoSession} was created with the codec operation {@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR}, then let {@code StdVideoH265VideoParameterSet vpsAddList[]} be the list of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h265-vps">H.265 VPS</a> entries to add to the created video session parameters object, defined as follows:
 * 
 * <ul>
 * <li>If the {@code pParametersAddInfo} member of the {@link VkVideoDecodeH265SessionParametersCreateInfoKHR} structure provided in the {@code pNext} chain is not {@code NULL}, then the set of {@code StdVideoH265VideoParameterSet} entries specified in {@code pParametersAddInfo→pStdVPSs} are added to {@code vpsAddList};</li>
 * <li>If {@code videoSessionParametersTemplate} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then each {@code StdVideoH265VideoParameterSet} entry stored in it with {@code vps_video_parameter_set_id} not matching any of the entries already in {@code vpsAddList} is added to {@code vpsAddList}.</li>
 * </ul>
 * </li>
 * <li>If {@code videoSession} was created with the codec operation {@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR}, then let {@code StdVideoH265SequenceParameterSet spsAddList[]} be the list of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h265-sps">H.265 SPS</a> entries to add to the created video session parameters object, defined as follows:
 * 
 * <ul>
 * <li>If the {@code pParametersAddInfo} member of the {@link VkVideoDecodeH265SessionParametersCreateInfoKHR} structure provided in the {@code pNext} chain is not {@code NULL}, then the set of {@code StdVideoH265SequenceParameterSet} entries specified in {@code pParametersAddInfo→pStdSPSs} are added to {@code spsAddList};</li>
 * <li>If {@code videoSessionParametersTemplate} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then each {@code StdVideoH265SequenceParameterSet} entry stored in it with {@code sps_video_parameter_set_id} or {@code sps_seq_parameter_set_id} not matching any of the entries already in {@code spsAddList} is added to {@code spsAddList}.</li>
 * </ul>
 * </li>
 * <li>If {@code videoSession} was created with the codec operation {@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR}, then let {@code StdVideoH265PictureParameterSet ppsAddList[]} be the list of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h265-pps">H.265 PPS</a> entries to add to the created video session parameters object, defined as follows:
 * 
 * <ul>
 * <li>If the {@code pParametersAddInfo} member of the {@link VkVideoDecodeH265SessionParametersCreateInfoKHR} structure provided in the {@code pNext} chain is not {@code NULL}, then the set of {@code StdVideoH265PictureParameterSet} entries specified in {@code pParametersAddInfo→pStdPPSs} are added to {@code ppsAddList};</li>
 * <li>If {@code videoSessionParametersTemplate} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then each {@code StdVideoH265PictureParameterSet} entry stored in it with {@code sps_video_parameter_set_id}, {@code pps_seq_parameter_set_id}, or {@code pps_pic_parameter_set_id} not matching any of the entries already in {@code ppsAddList} is added to {@code ppsAddList}.</li>
 * </ul>
 * </li>
 * <li>If {@code videoSession} was created with an encode operation, then let {@code uint32_t qualityLevel} be the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-quality-level">video encode quality level</a> of the created video session parameters object, defined as follows:
 * 
 * <ul>
 * <li>If the {@code pNext} chain of this structure includes a {@link VkVideoEncodeQualityLevelInfoKHR} structure, then {@code qualityLevel} is equal to {@link VkVideoEncodeQualityLevelInfoKHR}{@code ::qualityLevel}.</li>
 * <li>Otherwise {@code qualityLevel} is 0</li>
 * </ul>
 * </li>
 * <li>If {@code videoSession} was created with the codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR}, then let {@code StdVideoH264SequenceParameterSet spsAddList[]} be the list of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h264-sps">H.264 SPS</a> entries to add to the created video session parameters object, defined as follows:
 * 
 * <ul>
 * <li>If the {@code pParametersAddInfo} member of the {@link VkVideoEncodeH264SessionParametersCreateInfoKHR} structure provided in the {@code pNext} chain is not {@code NULL}, then the set of {@code StdVideoH264SequenceParameterSet} entries specified in {@code pParametersAddInfo→pStdSPSs} are added to {@code spsAddList};</li>
 * <li>If {@code videoSessionParametersTemplate} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then each {@code StdVideoH264SequenceParameterSet} entry stored in it with {@code seq_parameter_set_id} not matching any of the entries already in {@code spsAddList} is added to {@code spsAddList}.</li>
 * </ul>
 * </li>
 * <li>If {@code videoSession} was created with the codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR}, then let {@code StdVideoH264PictureParameterSet ppsAddList[]} be the list of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h264-pps">H.264 PPS</a> entries to add to the created video session parameters object, defined as follows:
 * 
 * <ul>
 * <li>If the {@code pParametersAddInfo} member of the {@link VkVideoEncodeH264SessionParametersCreateInfoKHR} structure provided in the {@code pNext} chain is not {@code NULL}, then the set of {@code StdVideoH264PictureParameterSet} entries specified in {@code pParametersAddInfo→pStdPPSs} are added to {@code ppsAddList};</li>
 * <li>If {@code videoSessionParametersTemplate} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then each {@code StdVideoH264PictureParameterSet} entry stored in it with {@code seq_parameter_set_id} or {@code pic_parameter_set_id} not matching any of the entries already in {@code ppsAddList} is added to {@code ppsAddList}.</li>
 * </ul>
 * </li>
 * <li>If {@code videoSession} was created with the codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, then let {@code StdVideoH265VideoParameterSet vpsAddList[]} be the list of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-vps">H.265 VPS</a> entries to add to the created video session parameters object, defined as follows:
 * 
 * <ul>
 * <li>If the {@code pParametersAddInfo} member of the {@link VkVideoEncodeH265SessionParametersCreateInfoKHR} structure provided in the {@code pNext} chain is not {@code NULL}, then the set of {@code StdVideoH265VideoParameterSet} entries specified in {@code pParametersAddInfo→pStdVPSs} are added to {@code vpsAddList};</li>
 * <li>If {@code videoSessionParametersTemplate} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then each {@code StdVideoH265VideoParameterSet} entry stored in it with {@code vps_video_parameter_set_id} not matching any of the entries already in {@code vpsAddList} is added to {@code vpsAddList}.</li>
 * </ul>
 * </li>
 * <li>If {@code videoSession} was created with the codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, then let {@code StdVideoH265SequenceParameterSet spsAddList[]} be the list of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-sps">H.265 SPS</a> entries to add to the created video session parameters object, defined as follows:
 * 
 * <ul>
 * <li>If the {@code pParametersAddInfo} member of the {@link VkVideoEncodeH265SessionParametersCreateInfoKHR} structure provided in the {@code pNext} chain is not {@code NULL}, then the set of {@code StdVideoH265SequenceParameterSet} entries specified in {@code pParametersAddInfo→pStdSPSs} are added to {@code spsAddList};</li>
 * <li>If {@code videoSessionParametersTemplate} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then each {@code StdVideoH265SequenceParameterSet} entry stored in it with {@code sps_video_parameter_set_id} or {@code sps_seq_parameter_set_id} not matching any of the entries already in {@code spsAddList} is added to {@code spsAddList}.</li>
 * </ul>
 * </li>
 * <li>If {@code videoSession} was created with the codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, then let {@code StdVideoH265PictureParameterSet ppsAddList[]} be the list of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-pps">H.265 PPS</a> entries to add to the created video session parameters object, defined as follows:
 * 
 * <ul>
 * <li>If the {@code pParametersAddInfo} member of the {@link VkVideoEncodeH265SessionParametersCreateInfoKHR} structure provided in the {@code pNext} chain is not {@code NULL}, then the set of {@code StdVideoH265PictureParameterSet} entries specified in {@code pParametersAddInfo→pStdPPSs} are added to {@code ppsAddList};</li>
 * <li>If {@code videoSessionParametersTemplate} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then each {@code StdVideoH265PictureParameterSet} entry stored in it with {@code sps_video_parameter_set_id}, {@code pps_seq_parameter_set_id}, or {@code pps_pic_parameter_set_id} not matching any of the entries already in {@code ppsAddList} is added to {@code ppsAddList}.</li>
 * </ul>
 * </li>
 * </ul>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code videoSessionParametersTemplate} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it <b>must</b> have been created against {@code videoSession}</li>
 * <li>If {@code videoSessionParametersTemplate} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and {@code videoSession} was created with an encode operation, then {@code qualityLevel} <b>must</b> equal the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-quality-level">video encode quality</a> level {@code videoSessionParametersTemplate} was created with</li>
 * <li>If {@code videoSession} was created with the video codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR}, then the {@code pNext} chain <b>must</b> include a {@link VkVideoDecodeH264SessionParametersCreateInfoKHR} structure</li>
 * <li>If {@code videoSession} was created with the video codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR}, then the number of elements of {@code spsAddList} <b>must</b> be less than or equal to the {@code maxStdSPSCount} specified in the {@link VkVideoDecodeH264SessionParametersCreateInfoKHR} structure included in the {@code pNext} chain</li>
 * <li>If {@code videoSession} was created with the video codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR}, then the number of elements of {@code ppsAddList} <b>must</b> be less than or equal to the {@code maxStdPPSCount} specified in the {@link VkVideoDecodeH264SessionParametersCreateInfoKHR} structure included in the {@code pNext} chain</li>
 * <li>If {@code videoSession} was created with the video codec operation {@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR}, then the {@code pNext} chain <b>must</b> include a {@link VkVideoDecodeH265SessionParametersCreateInfoKHR} structure</li>
 * <li>If {@code videoSession} was created with the video codec operation {@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR}, then the number of elements of {@code vpsAddList} <b>must</b> be less than or equal to the {@code maxStdVPSCount} specified in the {@link VkVideoDecodeH265SessionParametersCreateInfoKHR} structure included in the {@code pNext} chain</li>
 * <li>If {@code videoSession} was created with the video codec operation {@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR}, then the number of elements of {@code spsAddList} <b>must</b> be less than or equal to the {@code maxStdSPSCount} specified in the {@link VkVideoDecodeH265SessionParametersCreateInfoKHR} structure included in the {@code pNext} chain</li>
 * <li>If {@code videoSession} was created with the video codec operation {@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR}, then the number of elements of {@code ppsAddList} <b>must</b> be less than or equal to the {@code maxStdPPSCount} specified in the {@link VkVideoDecodeH265SessionParametersCreateInfoKHR} structure included in the {@code pNext} chain</li>
 * <li>If {@code videoSession} was created with the video codec operation {@link KHRVideoDecodeAV1#VK_VIDEO_CODEC_OPERATION_DECODE_AV1_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_AV1_BIT_KHR}, then {@code videoSessionParametersTemplate} <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@code videoSession} was created with the video codec operation {@link KHRVideoDecodeAV1#VK_VIDEO_CODEC_OPERATION_DECODE_AV1_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_AV1_BIT_KHR}, then the {@code pNext} chain <b>must</b> include a {@link VkVideoDecodeAV1SessionParametersCreateInfoKHR} structure</li>
 * <li>If {@code videoSession} was created with the video codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR}, then the {@code pNext} chain <b>must</b> include a {@link VkVideoEncodeH264SessionParametersCreateInfoKHR} structure</li>
 * <li>If {@code videoSession} was created with the video codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR}, then the number of elements of {@code spsAddList} <b>must</b> be less than or equal to the {@code maxStdSPSCount} specified in the {@link VkVideoEncodeH264SessionParametersCreateInfoKHR} structure included in the {@code pNext} chain</li>
 * <li>If {@code videoSession} was created with the video codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR}, then the number of elements of {@code ppsAddList} <b>must</b> be less than or equal to the {@code maxStdPPSCount} specified in the {@link VkVideoEncodeH264SessionParametersCreateInfoKHR} structure included in the {@code pNext} chain</li>
 * <li>If {@code videoSession} was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, then the {@code pNext} chain <b>must</b> include a {@link VkVideoEncodeH265SessionParametersCreateInfoKHR} structure</li>
 * <li>If {@code videoSession} was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, then the number of elements of {@code vpsAddList} <b>must</b> be less than or equal to the {@code maxStdVPSCount} specified in the {@link VkVideoEncodeH265SessionParametersCreateInfoKHR} structure included in the {@code pNext} chain</li>
 * <li>If {@code videoSession} was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, then the number of elements of {@code spsAddList} <b>must</b> be less than or equal to the {@code maxStdSPSCount} specified in the {@link VkVideoEncodeH265SessionParametersCreateInfoKHR} structure included in the {@code pNext} chain</li>
 * <li>If {@code videoSession} was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, then the number of elements of {@code ppsAddList} <b>must</b> be less than or equal to the {@code maxStdPPSCount} specified in the {@link VkVideoEncodeH265SessionParametersCreateInfoKHR} structure included in the {@code pNext} chain</li>
 * <li>If {@code videoSession} was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, then {@code num_tile_columns_minus1} <b>must</b> be less than {@link VkVideoEncodeH265CapabilitiesKHR}{@code ::maxTiles.width}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile {@code videoSession} was created with, for each element of {@code ppsAddList}</li>
 * <li>If {@code videoSession} was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, then {@code num_tile_rows_minus1} <b>must</b> be less than {@link VkVideoEncodeH265CapabilitiesKHR}{@code ::maxTiles.height}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile {@code videoSession} was created with, for each element of {@code ppsAddList}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkVideoDecodeAV1SessionParametersCreateInfoKHR}, {@link VkVideoDecodeH264SessionParametersCreateInfoKHR}, {@link VkVideoDecodeH265SessionParametersCreateInfoKHR}, {@link VkVideoEncodeH264SessionParametersCreateInfoKHR}, {@link VkVideoEncodeH265SessionParametersCreateInfoKHR}, or {@link VkVideoEncodeQualityLevelInfoKHR}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>If {@code videoSessionParametersTemplate} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code videoSessionParametersTemplate} <b>must</b> be a valid {@code VkVideoSessionParametersKHR} handle</li>
 * <li>{@code videoSession} <b>must</b> be a valid {@code VkVideoSessionKHR} handle</li>
 * <li>If {@code videoSessionParametersTemplate} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code videoSession}</li>
 * <li>Both of {@code videoSession}, and {@code videoSessionParametersTemplate} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRVideoQueue#vkCreateVideoSessionParametersKHR CreateVideoSessionParametersKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoSessionParametersCreateInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoSessionParametersCreateFlagsKHR {@link #flags};
 *     VkVideoSessionParametersKHR {@link #videoSessionParametersTemplate};
 *     VkVideoSessionKHR {@link #videoSession};
 * }</code></pre>
 */
public class VkVideoSessionParametersCreateInfoKHR extends Struct<VkVideoSessionParametersCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        VIDEOSESSIONPARAMETERSTEMPLATE,
        VIDEOSESSION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        VIDEOSESSIONPARAMETERSTEMPLATE = layout.offsetof(3);
        VIDEOSESSION = layout.offsetof(4);
    }

    protected VkVideoSessionParametersCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoSessionParametersCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoSessionParametersCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoSessionParametersCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoSessionParametersCreateInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** reserved for future use. */
    @NativeType("VkVideoSessionParametersCreateFlagsKHR")
    public int flags() { return nflags(address()); }
    /** {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or a valid handle to a {@code VkVideoSessionParametersKHR} object used as a template for constructing the new video session parameters object. */
    @NativeType("VkVideoSessionParametersKHR")
    public long videoSessionParametersTemplate() { return nvideoSessionParametersTemplate(address()); }
    /** the video session object against which the video session parameters object is going to be created. */
    @NativeType("VkVideoSessionKHR")
    public long videoSession() { return nvideoSession(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoSessionParametersCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoSessionParametersCreateInfoKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoSessionParametersCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoDecodeAV1SessionParametersCreateInfoKHR} value to the {@code pNext} chain. */
    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoDecodeAV1SessionParametersCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoDecodeH264SessionParametersCreateInfoKHR} value to the {@code pNext} chain. */
    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoDecodeH264SessionParametersCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoDecodeH265SessionParametersCreateInfoKHR} value to the {@code pNext} chain. */
    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoDecodeH265SessionParametersCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH264SessionParametersCreateInfoKHR} value to the {@code pNext} chain. */
    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoEncodeH264SessionParametersCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265SessionParametersCreateInfoKHR} value to the {@code pNext} chain. */
    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoEncodeH265SessionParametersCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeQualityLevelInfoKHR} value to the {@code pNext} chain. */
    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoEncodeQualityLevelInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkVideoSessionParametersCreateInfoKHR flags(@NativeType("VkVideoSessionParametersCreateFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #videoSessionParametersTemplate} field. */
    public VkVideoSessionParametersCreateInfoKHR videoSessionParametersTemplate(@NativeType("VkVideoSessionParametersKHR") long value) { nvideoSessionParametersTemplate(address(), value); return this; }
    /** Sets the specified value to the {@link #videoSession} field. */
    public VkVideoSessionParametersCreateInfoKHR videoSession(@NativeType("VkVideoSessionKHR") long value) { nvideoSession(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoSessionParametersCreateInfoKHR set(
        int sType,
        long pNext,
        int flags,
        long videoSessionParametersTemplate,
        long videoSession
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        videoSessionParametersTemplate(videoSessionParametersTemplate);
        videoSession(videoSession);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoSessionParametersCreateInfoKHR set(VkVideoSessionParametersCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoSessionParametersCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoSessionParametersCreateInfoKHR malloc() {
        return new VkVideoSessionParametersCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoSessionParametersCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoSessionParametersCreateInfoKHR calloc() {
        return new VkVideoSessionParametersCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoSessionParametersCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoSessionParametersCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoSessionParametersCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoSessionParametersCreateInfoKHR} instance for the specified memory address. */
    public static VkVideoSessionParametersCreateInfoKHR create(long address) {
        return new VkVideoSessionParametersCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoSessionParametersCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoSessionParametersCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoSessionParametersCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionParametersCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoSessionParametersCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionParametersCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoSessionParametersCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionParametersCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoSessionParametersCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionParametersCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoSessionParametersCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoSessionParametersCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoSessionParametersCreateInfoKHR malloc(MemoryStack stack) {
        return new VkVideoSessionParametersCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoSessionParametersCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoSessionParametersCreateInfoKHR calloc(MemoryStack stack) {
        return new VkVideoSessionParametersCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoSessionParametersCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionParametersCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoSessionParametersCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionParametersCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoSessionParametersCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoSessionParametersCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkVideoSessionParametersCreateInfoKHR.FLAGS); }
    /** Unsafe version of {@link #videoSessionParametersTemplate}. */
    public static long nvideoSessionParametersTemplate(long struct) { return memGetLong(struct + VkVideoSessionParametersCreateInfoKHR.VIDEOSESSIONPARAMETERSTEMPLATE); }
    /** Unsafe version of {@link #videoSession}. */
    public static long nvideoSession(long struct) { return memGetLong(struct + VkVideoSessionParametersCreateInfoKHR.VIDEOSESSION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoSessionParametersCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoSessionParametersCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkVideoSessionParametersCreateInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #videoSessionParametersTemplate(long) videoSessionParametersTemplate}. */
    public static void nvideoSessionParametersTemplate(long struct, long value) { memPutLong(struct + VkVideoSessionParametersCreateInfoKHR.VIDEOSESSIONPARAMETERSTEMPLATE, value); }
    /** Unsafe version of {@link #videoSession(long) videoSession}. */
    public static void nvideoSession(long struct, long value) { memPutLong(struct + VkVideoSessionParametersCreateInfoKHR.VIDEOSESSION, value); }

    // -----------------------------------

    /** An array of {@link VkVideoSessionParametersCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoSessionParametersCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoSessionParametersCreateInfoKHR ELEMENT_FACTORY = VkVideoSessionParametersCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoSessionParametersCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoSessionParametersCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkVideoSessionParametersCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoSessionParametersCreateInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoSessionParametersCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoSessionParametersCreateInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoSessionParametersCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoSessionParametersCreateInfoKHR#flags} field. */
        @NativeType("VkVideoSessionParametersCreateFlagsKHR")
        public int flags() { return VkVideoSessionParametersCreateInfoKHR.nflags(address()); }
        /** @return the value of the {@link VkVideoSessionParametersCreateInfoKHR#videoSessionParametersTemplate} field. */
        @NativeType("VkVideoSessionParametersKHR")
        public long videoSessionParametersTemplate() { return VkVideoSessionParametersCreateInfoKHR.nvideoSessionParametersTemplate(address()); }
        /** @return the value of the {@link VkVideoSessionParametersCreateInfoKHR#videoSession} field. */
        @NativeType("VkVideoSessionKHR")
        public long videoSession() { return VkVideoSessionParametersCreateInfoKHR.nvideoSession(address()); }

        /** Sets the specified value to the {@link VkVideoSessionParametersCreateInfoKHR#sType} field. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoSessionParametersCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR} value to the {@link VkVideoSessionParametersCreateInfoKHR#sType} field. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoSessionParametersCreateInfoKHR#pNext} field. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoSessionParametersCreateInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoDecodeAV1SessionParametersCreateInfoKHR} value to the {@code pNext} chain. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer pNext(VkVideoDecodeAV1SessionParametersCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoDecodeH264SessionParametersCreateInfoKHR} value to the {@code pNext} chain. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer pNext(VkVideoDecodeH264SessionParametersCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoDecodeH265SessionParametersCreateInfoKHR} value to the {@code pNext} chain. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer pNext(VkVideoDecodeH265SessionParametersCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH264SessionParametersCreateInfoKHR} value to the {@code pNext} chain. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer pNext(VkVideoEncodeH264SessionParametersCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265SessionParametersCreateInfoKHR} value to the {@code pNext} chain. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer pNext(VkVideoEncodeH265SessionParametersCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeQualityLevelInfoKHR} value to the {@code pNext} chain. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer pNext(VkVideoEncodeQualityLevelInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkVideoSessionParametersCreateInfoKHR#flags} field. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer flags(@NativeType("VkVideoSessionParametersCreateFlagsKHR") int value) { VkVideoSessionParametersCreateInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoSessionParametersCreateInfoKHR#videoSessionParametersTemplate} field. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer videoSessionParametersTemplate(@NativeType("VkVideoSessionParametersKHR") long value) { VkVideoSessionParametersCreateInfoKHR.nvideoSessionParametersTemplate(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoSessionParametersCreateInfoKHR#videoSession} field. */
        public VkVideoSessionParametersCreateInfoKHR.Buffer videoSession(@NativeType("VkVideoSessionKHR") long value) { VkVideoSessionParametersCreateInfoKHR.nvideoSession(address(), value); return this; }

    }

}