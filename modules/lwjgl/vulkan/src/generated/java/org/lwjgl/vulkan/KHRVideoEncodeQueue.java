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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension builds upon the {@link KHRVideoQueue VK_KHR_video_queue} extension by adding common APIs specific to video encoding and thus enabling implementations to expose queue families supporting video encode operations.
 * 
 * <p>More specifically, it adds video encode specific capabilities and a new command buffer command that allows recording video encode operations against a video session.</p>
 * 
 * <p>This extension is to be used in conjunction with other codec specific video encode extensions that enable encoding video sequences of specific video compression standards.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_video_encode_queue}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>300</dd>
 * <dt><b>Revision</b></dt>
 * <dd>12</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRVideoQueue VK_KHR_video_queue} and {@link KHRSynchronization2 VK_KHR_synchronization2} or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#versions-1.3">Version 1.3</a></dd>
 * <dt><b>API Interactions</b></dt>
 * <dd><ul>
 * <li>Interacts with VK_VERSION_1_3</li>
 * <li>Interacts with VK_KHR_format_feature_flags2</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Ahmed Abdelkhalek <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_video_encode_queue]%20@aabdelkh%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_video_encode_queue%20extension*">aabdelkh</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_video_encode_queue.adoc">VK_KHR_video_encode_queue</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-12-05</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Ahmed Abdelkhalek, AMD</li>
 * <li>Damien Kessler, NVIDIA</li>
 * <li>George Hao, AMD</li>
 * <li>Jake Beju, AMD</li>
 * <li>Peter Fang, AMD</li>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Srinath Kumarapuram, NVIDIA</li>
 * <li>Thomas J. Meier, NVIDIA</li>
 * <li>Tony Zlatinski, NVIDIA</li>
 * <li>Ravi Chaudhary, NVIDIA</li>
 * <li>Yang Liu, AMD</li>
 * <li>Daniel Rakos, RasterGrid</li>
 * <li>Ping Liu, Intel</li>
 * <li>Aidan Fabius, Core Avionics &amp; Industrial Inc.</li>
 * <li>Lynne Iribarren, Independent</li>
 * </ul></dd>
 * </dl>
 */
public class KHRVideoEncodeQueue {

    /** The extension specification version. */
    public static final int VK_KHR_VIDEO_ENCODE_QUEUE_SPEC_VERSION = 12;

    /** The extension name. */
    public static final String VK_KHR_VIDEO_ENCODE_QUEUE_EXTENSION_NAME = "VK_KHR_video_encode_queue";

    /** Extends {@code VkPipelineStageFlagBits2}. */
    public static final long VK_PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR = 0x8000000L;

    /**
     * Extends {@code VkAccessFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR}</li>
     * <li>{@link #VK_ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR}</li>
     * </ul>
     */
    public static final long
        VK_ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR  = 0x2000000000L,
        VK_ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR = 0x4000000000L;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_USAGE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_USAGE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_QUERY_POOL_VIDEO_ENCODE_FEEDBACK_CREATE_INFO_KHR STRUCTURE_TYPE_QUERY_POOL_VIDEO_ENCODE_FEEDBACK_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_GET_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_GET_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_FEEDBACK_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_FEEDBACK_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR                               = 1000299000,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR                  = 1000299001,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR            = 1000299002,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR                       = 1000299003,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_USAGE_INFO_KHR                         = 1000299004,
        VK_STRUCTURE_TYPE_QUERY_POOL_VIDEO_ENCODE_FEEDBACK_CREATE_INFO_KHR    = 1000299005,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR = 1000299006,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_PROPERTIES_KHR           = 1000299007,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR                 = 1000299008,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_GET_INFO_KHR        = 1000299009,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_FEEDBACK_INFO_KHR   = 1000299010;

    /** Extends {@code VkQueueFlagBits}. */
    public static final int VK_QUEUE_VIDEO_ENCODE_BIT_KHR = 0x40;

    /**
     * Extends {@code VkVideoCodingControlFlagBitsKHR}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR}</li>
     * <li>{@link #VK_VIDEO_CODING_CONTROL_ENCODE_QUALITY_LEVEL_BIT_KHR VIDEO_CODING_CONTROL_ENCODE_QUALITY_LEVEL_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR  = 0x2,
        VK_VIDEO_CODING_CONTROL_ENCODE_QUALITY_LEVEL_BIT_KHR = 0x4;

    /**
     * Extends {@code VkBufferUsageFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_BUFFER_USAGE_VIDEO_ENCODE_DST_BIT_KHR BUFFER_USAGE_VIDEO_ENCODE_DST_BIT_KHR}</li>
     * <li>{@link #VK_BUFFER_USAGE_VIDEO_ENCODE_SRC_BIT_KHR BUFFER_USAGE_VIDEO_ENCODE_SRC_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_BUFFER_USAGE_VIDEO_ENCODE_DST_BIT_KHR = 0x8000,
        VK_BUFFER_USAGE_VIDEO_ENCODE_SRC_BIT_KHR = 0x10000;

    /**
     * Extends {@code VkImageUsageFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR}</li>
     * <li>{@link #VK_IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR}</li>
     * <li>{@link #VK_IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR = 0x2000,
        VK_IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR = 0x4000,
        VK_IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR = 0x8000;

    /**
     * Extends {@code VkFormatFeatureFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_FORMAT_FEATURE_VIDEO_ENCODE_INPUT_BIT_KHR FORMAT_FEATURE_VIDEO_ENCODE_INPUT_BIT_KHR}</li>
     * <li>{@link #VK_FORMAT_FEATURE_VIDEO_ENCODE_DPB_BIT_KHR FORMAT_FEATURE_VIDEO_ENCODE_DPB_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_FORMAT_FEATURE_VIDEO_ENCODE_INPUT_BIT_KHR = 0x8000000,
        VK_FORMAT_FEATURE_VIDEO_ENCODE_DPB_BIT_KHR   = 0x10000000;

    /** Extends {@code VkVideoSessionCreateFlagBitsKHR}. */
    public static final int VK_VIDEO_SESSION_CREATE_ALLOW_ENCODE_PARAMETER_OPTIMIZATIONS_BIT_KHR = 0x2;

    /**
     * Extends {@code VkImageLayout}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_IMAGE_LAYOUT_VIDEO_ENCODE_DST_KHR IMAGE_LAYOUT_VIDEO_ENCODE_DST_KHR}</li>
     * <li>{@link #VK_IMAGE_LAYOUT_VIDEO_ENCODE_SRC_KHR IMAGE_LAYOUT_VIDEO_ENCODE_SRC_KHR}</li>
     * <li>{@link #VK_IMAGE_LAYOUT_VIDEO_ENCODE_DPB_KHR IMAGE_LAYOUT_VIDEO_ENCODE_DPB_KHR}</li>
     * </ul>
     */
    public static final int
        VK_IMAGE_LAYOUT_VIDEO_ENCODE_DST_KHR = 1000299000,
        VK_IMAGE_LAYOUT_VIDEO_ENCODE_SRC_KHR = 1000299001,
        VK_IMAGE_LAYOUT_VIDEO_ENCODE_DPB_KHR = 1000299002;

    /** Extends {@code VkQueryType}. */
    public static final int VK_QUERY_TYPE_VIDEO_ENCODE_FEEDBACK_KHR = 1000299000;

    /** Extends {@code VkQueryResultStatusKHR}. */
    public static final int VK_QUERY_RESULT_STATUS_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_KHR = -1000299000;

    /** Extends {@code VkResult}. */
    public static final int VK_ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR = -1000299000;

    /**
     * Extends {@code VkFormatFeatureFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_FORMAT_FEATURE_2_VIDEO_ENCODE_INPUT_BIT_KHR FORMAT_FEATURE_2_VIDEO_ENCODE_INPUT_BIT_KHR}</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_VIDEO_ENCODE_DPB_BIT_KHR FORMAT_FEATURE_2_VIDEO_ENCODE_DPB_BIT_KHR}</li>
     * </ul>
     */
    public static final long
        VK_FORMAT_FEATURE_2_VIDEO_ENCODE_INPUT_BIT_KHR = 0x8000000L,
        VK_FORMAT_FEATURE_2_VIDEO_ENCODE_DPB_BIT_KHR   = 0x10000000L;

    /**
     * VkVideoEncodeCapabilityFlagBitsKHR - Video encode capability flags
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_ENCODE_CAPABILITY_PRECEDING_EXTERNALLY_ENCODED_BYTES_BIT_KHR VIDEO_ENCODE_CAPABILITY_PRECEDING_EXTERNALLY_ENCODED_BYTES_BIT_KHR} indicates that the implementation supports the use of {@link VkVideoEncodeInfoKHR}{@code ::precedingExternallyEncodedBytes}.</li>
     * <li>{@link #VK_VIDEO_ENCODE_CAPABILITY_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_DETECTION_BIT_KHR VIDEO_ENCODE_CAPABILITY_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_DETECTION_BIT_KHR} indicates that the implementation is able to detect and report when the destination video bitstream buffer range provided by the application is not sufficiently large to fit the encoded bitstream data produced by a video encode operation by reporting the {@link #VK_QUERY_RESULT_STATUS_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_KHR QUERY_RESULT_STATUS_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_KHR} <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#query-result-status-codes">query result status code</a>.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Some implementations <b>may</b> not be able to reliably detect insufficient bitstream buffer range conditions in all situations. Such implementations will not report support for the {@link #VK_VIDEO_ENCODE_CAPABILITY_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_DETECTION_BIT_KHR VIDEO_ENCODE_CAPABILITY_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_DETECTION_BIT_KHR} encode capability flag for the video profile, but <b>may</b> still report the {@link #VK_QUERY_RESULT_STATUS_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_KHR QUERY_RESULT_STATUS_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_KHR} query result status code in certain cases. Applications <b>should</b> always check for the specific query result status code {@link #VK_QUERY_RESULT_STATUS_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_KHR QUERY_RESULT_STATUS_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_KHR} even when this encode capability flag is not supported by the implementation for the video profile in question. However, applications <b>must</b> not assume that a different negative query result status code indicating an unsuccessful completion of a video encode operation is not the result of an insufficient bitstream buffer condition unless this encode capability flag is supported.</p>
     * </div>
     * </li>
     * </ul>
     */
    public static final int
        VK_VIDEO_ENCODE_CAPABILITY_PRECEDING_EXTERNALLY_ENCODED_BYTES_BIT_KHR            = 0x1,
        VK_VIDEO_ENCODE_CAPABILITY_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_DETECTION_BIT_KHR = 0x2;

    /**
     * VkVideoEncodeRateControlModeFlagBitsKHR - Video encode rate control modes
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DEFAULT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_DEFAULT_KHR} specifies the use of implementation-specific rate control.</li>
     * <li>{@link #VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR} specifies that rate control is disabled and the application will specify per-operation rate control parameters controlling the encoding quality. In this mode implementations will encode pictures independently of the output bitrate of prior video encode operations.
     * 
     * <ul>
     * <li>When using an <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h264-profile">H.264 encode profile</a>, implementations will use the QP value specified in {@link VkVideoEncodeH264NaluSliceInfoKHR}{@code ::constantQp} to control the quality of the encoded picture.</li>
     * <li>When using an <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-profile">H.265 encode profile</a>, implementations will use the QP value specified in {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR}{@code ::constantQp} to control the quality of the encoded picture.</li>
     * </ul>
     * </li>
     * <li>{@link #VK_VIDEO_ENCODE_RATE_CONTROL_MODE_CBR_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_CBR_BIT_KHR} specifies the use of constant bitrate (CBR) rate control mode. In this mode the implementation will attempt to produce the encoded bitstream at a constant bitrate while conforming to the constraints of other rate control parameters.</li>
     * <li>{@link #VK_VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR} specifies the use of variable bitrate (VBR) rate control mode. In this mode the implementation will produce the encoded bitstream at a variable bitrate according to the constraints of other rate control parameters.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoEncodeQualityLevelPropertiesKHR}, {@link VkVideoEncodeRateControlInfoKHR}</p>
     */
    public static final int
        VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DEFAULT_KHR      = 0,
        VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR = 0x1,
        VK_VIDEO_ENCODE_RATE_CONTROL_MODE_CBR_BIT_KHR      = 0x2,
        VK_VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR      = 0x4;

    /**
     * VkVideoEncodeFeedbackFlagBitsKHR - Bits specifying queried video encode feedback values
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_BUFFER_OFFSET_BIT_KHR VIDEO_ENCODE_FEEDBACK_BITSTREAM_BUFFER_OFFSET_BIT_KHR} specifies that queries managed by the pool will capture the byte offset of the bitstream data written by the video encode operation to the bitstream buffer specified in {@link VkVideoEncodeInfoKHR}{@code ::dstBuffer} relative to the offset specified in {@link VkVideoEncodeInfoKHR}{@code ::dstBufferOffset}. For the first video encode operation issued by any <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#video-encode-commands">video encode command</a>, this value will always be zero, meaning that bitstream data is always written to the buffer specified in {@link VkVideoEncodeInfoKHR}{@code ::dstBuffer} starting from the offset specified in {@link VkVideoEncodeInfoKHR}{@code ::dstBufferOffset}.</li>
     * <li>{@link #VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_BYTES_WRITTEN_BIT_KHR VIDEO_ENCODE_FEEDBACK_BITSTREAM_BYTES_WRITTEN_BIT_KHR} specifies that queries managed by the pool will capture the number of bytes written by the video encode operation to the bitstream buffer specified in {@link VkVideoEncodeInfoKHR}{@code ::dstBuffer}.</li>
     * <li>{@link #VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_HAS_OVERRIDES_BIT_KHR VIDEO_ENCODE_FEEDBACK_BITSTREAM_HAS_OVERRIDES_BIT_KHR} specifies that queries managed by the pool will capture a boolean value indicating that the data written to the bitstream buffer specified in {@link VkVideoEncodeInfoKHR}{@code ::dstBuffer} contains <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-overrides">overridden parameters</a>.</li>
     * </ul>
     * 
     * <p>When retrieving the results of video encode feedback queries, the values corresponding to each enabled video encode feedback are written in the order of the bits defined above, followed by an optional value indicating availability or result status if {@link VK10#VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT} or {@link KHRVideoQueue#VK_QUERY_RESULT_WITH_STATUS_BIT_KHR QUERY_RESULT_WITH_STATUS_BIT_KHR} is specified, respectively.</p>
     * 
     * <p>If the result status of a video encode feedback query is negative, then the results of all enabled video encode feedback values will be undefined.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Thus it is recommended that applications always specify {@link KHRVideoQueue#VK_QUERY_RESULT_WITH_STATUS_BIT_KHR QUERY_RESULT_WITH_STATUS_BIT_KHR} when retrieving the results of video encode feedback queries and ignore such undefined video encode feedback values for any <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-unsuccessful">unsuccessfully</a> completed video encode operations.</p>
     * </div>
     */
    public static final int
        VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_BUFFER_OFFSET_BIT_KHR = 0x1,
        VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_BYTES_WRITTEN_BIT_KHR = 0x2,
        VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_HAS_OVERRIDES_BIT_KHR = 0x4;

    /**
     * VkVideoEncodeUsageFlagBitsKHR - Video encode usage flags
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_ENCODE_USAGE_TRANSCODING_BIT_KHR VIDEO_ENCODE_USAGE_TRANSCODING_BIT_KHR} specifies that video encoding is intended to be used in conjunction with video decoding to transcode a video bitstream with the same and/or different codecs.</li>
     * <li>{@link #VK_VIDEO_ENCODE_USAGE_STREAMING_BIT_KHR VIDEO_ENCODE_USAGE_STREAMING_BIT_KHR} specifies that video encoding is intended to be used to produce a video bitstream that is expected to be sent as a continuous flow over network.</li>
     * <li>{@link #VK_VIDEO_ENCODE_USAGE_RECORDING_BIT_KHR VIDEO_ENCODE_USAGE_RECORDING_BIT_KHR} specifies that video encoding is intended to be used for real-time recording for offline consumption.</li>
     * <li>{@link #VK_VIDEO_ENCODE_USAGE_CONFERENCING_BIT_KHR VIDEO_ENCODE_USAGE_CONFERENCING_BIT_KHR} specifies that video encoding is intended to be used in a video conferencing scenario.</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>There are no restrictions on the combination of bits that <b>can</b> be specified by the application. However, applications <b>should</b> use reasonable combinations in order for the implementation to be able to select the most appropriate mode of operation for the particular use case.</p>
     * </div>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_ENCODE_USAGE_DEFAULT_KHR VIDEO_ENCODE_USAGE_DEFAULT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_VIDEO_ENCODE_USAGE_DEFAULT_KHR          = 0,
        VK_VIDEO_ENCODE_USAGE_TRANSCODING_BIT_KHR  = 0x1,
        VK_VIDEO_ENCODE_USAGE_STREAMING_BIT_KHR    = 0x2,
        VK_VIDEO_ENCODE_USAGE_RECORDING_BIT_KHR    = 0x4,
        VK_VIDEO_ENCODE_USAGE_CONFERENCING_BIT_KHR = 0x8;

    /**
     * VkVideoEncodeContentFlagBitsKHR - Video encode content flags
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_ENCODE_CONTENT_CAMERA_BIT_KHR VIDEO_ENCODE_CONTENT_CAMERA_BIT_KHR} specifies that video encoding is intended to be used to encode camera content.</li>
     * <li>{@link #VK_VIDEO_ENCODE_CONTENT_DESKTOP_BIT_KHR VIDEO_ENCODE_CONTENT_DESKTOP_BIT_KHR} specifies that video encoding is intended to be used to encode desktop content.</li>
     * <li>{@link #VK_VIDEO_ENCODE_CONTENT_RENDERED_BIT_KHR VIDEO_ENCODE_CONTENT_RENDERED_BIT_KHR} specified that video encoding is intended to be used to encode rendered (e.g. game) content.</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>There are no restrictions on the combination of bits that <b>can</b> be specified by the application. However, applications <b>should</b> use reasonable combinations in order for the implementation to be able to select the most appropriate mode of operation for the particular content type.</p>
     * </div>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_ENCODE_CONTENT_DEFAULT_KHR VIDEO_ENCODE_CONTENT_DEFAULT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_VIDEO_ENCODE_CONTENT_DEFAULT_KHR      = 0,
        VK_VIDEO_ENCODE_CONTENT_CAMERA_BIT_KHR   = 0x1,
        VK_VIDEO_ENCODE_CONTENT_DESKTOP_BIT_KHR  = 0x2,
        VK_VIDEO_ENCODE_CONTENT_RENDERED_BIT_KHR = 0x4;

    /**
     * VkVideoEncodeTuningModeKHR - Video encode tuning mode
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_ENCODE_TUNING_MODE_DEFAULT_KHR VIDEO_ENCODE_TUNING_MODE_DEFAULT_KHR} specifies the default tuning mode.</li>
     * <li>{@link #VK_VIDEO_ENCODE_TUNING_MODE_HIGH_QUALITY_KHR VIDEO_ENCODE_TUNING_MODE_HIGH_QUALITY_KHR} specifies that video encoding is tuned for high quality. When using this tuning mode, the implementation <b>may</b> compromise the latency of video encoding operations to improve quality.</li>
     * <li>{@link #VK_VIDEO_ENCODE_TUNING_MODE_LOW_LATENCY_KHR VIDEO_ENCODE_TUNING_MODE_LOW_LATENCY_KHR} specifies that video encoding is tuned for low latency. When using this tuning mode, the implementation <b>may</b> compromise quality to increase the performance and lower the latency of video encode operations.</li>
     * <li>{@link #VK_VIDEO_ENCODE_TUNING_MODE_ULTRA_LOW_LATENCY_KHR VIDEO_ENCODE_TUNING_MODE_ULTRA_LOW_LATENCY_KHR} specifies that video encoding is tuned for ultra-low latency. When using this tuning mode, the implementation <b>may</b> compromise quality to maximize the performance and minimize the latency of video encoding operations.</li>
     * <li>{@link #VK_VIDEO_ENCODE_TUNING_MODE_LOSSLESS_KHR VIDEO_ENCODE_TUNING_MODE_LOSSLESS_KHR} specifies that video encoding is tuned for lossless encoding. When using this tuning mode, video encode operations produce lossless output.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoEncodeUsageInfoKHR}</p>
     */
    public static final int
        VK_VIDEO_ENCODE_TUNING_MODE_DEFAULT_KHR           = 0,
        VK_VIDEO_ENCODE_TUNING_MODE_HIGH_QUALITY_KHR      = 1,
        VK_VIDEO_ENCODE_TUNING_MODE_LOW_LATENCY_KHR       = 2,
        VK_VIDEO_ENCODE_TUNING_MODE_ULTRA_LOW_LATENCY_KHR = 3,
        VK_VIDEO_ENCODE_TUNING_MODE_LOSSLESS_KHR          = 4;

    protected KHRVideoEncodeQueue() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR GetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR} */
    public static int nvkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR(VkPhysicalDevice physicalDevice, long pQualityLevelInfo, long pQualityLevelProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.validate(pQualityLevelInfo);
        }
        return callPPPI(physicalDevice.address(), pQualityLevelInfo, pQualityLevelProperties, __functionAddress);
    }

    /**
     * Query video encode quality level properties.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query properties for a specific video encode quality level supported by a video encode profile, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     const VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR* pQualityLevelInfo,
     *     VkVideoEncodeQualityLevelPropertiesKHR*     pQualityLevelProperties);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code pQualityLevelInfo→pVideoProfile→videoCodecOperation} is {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR}, then the {@code pNext} chain of {@code pQualityLevelProperties} <b>must</b> include a {@link VkVideoEncodeH264QualityLevelPropertiesKHR} structure</li>
     * <li>If {@code pQualityLevelInfo→pVideoProfile→videoCodecOperation} is {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, then the {@code pNext} chain of {@code pQualityLevelProperties} <b>must</b> include a {@link VkVideoEncodeH265QualityLevelPropertiesKHR} structure</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pQualityLevelInfo} <b>must</b> be a valid pointer to a valid {@link VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR} structure</li>
     * <li>{@code pQualityLevelProperties} <b>must</b> be a valid pointer to a {@link VkVideoEncodeQualityLevelPropertiesKHR} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link KHRVideoQueue#VK_ERROR_VIDEO_PROFILE_OPERATION_NOT_SUPPORTED_KHR ERROR_VIDEO_PROFILE_OPERATION_NOT_SUPPORTED_KHR}</li>
     * <li>{@link KHRVideoQueue#VK_ERROR_VIDEO_PROFILE_FORMAT_NOT_SUPPORTED_KHR ERROR_VIDEO_PROFILE_FORMAT_NOT_SUPPORTED_KHR}</li>
     * <li>{@link KHRVideoQueue#VK_ERROR_VIDEO_PICTURE_LAYOUT_NOT_SUPPORTED_KHR ERROR_VIDEO_PICTURE_LAYOUT_NOT_SUPPORTED_KHR}</li>
     * <li>{@link KHRVideoQueue#VK_ERROR_VIDEO_PROFILE_CODEC_NOT_SUPPORTED_KHR ERROR_VIDEO_PROFILE_CODEC_NOT_SUPPORTED_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR}, {@link VkVideoEncodeQualityLevelPropertiesKHR}</p>
     *
     * @param physicalDevice          the physical device to query the video encode quality level properties for.
     * @param pQualityLevelInfo       a pointer to a {@link VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR} structure specifying the video encode profile and quality level to query properties for.
     * @param pQualityLevelProperties a pointer to a {@link VkVideoEncodeQualityLevelPropertiesKHR} structure in which the properties are returned.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR const *") VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR pQualityLevelInfo, @NativeType("VkVideoEncodeQualityLevelPropertiesKHR *") VkVideoEncodeQualityLevelPropertiesKHR pQualityLevelProperties) {
        return nvkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR(physicalDevice, pQualityLevelInfo.address(), pQualityLevelProperties.address());
    }

    // --- [ vkGetEncodedVideoSessionParametersKHR ] ---

    /**
     * Unsafe version of: {@link #vkGetEncodedVideoSessionParametersKHR GetEncodedVideoSessionParametersKHR}
     *
     * @param pDataSize a pointer to a {@code size_t} value related to the amount of encode parameter data returned, as described below.
     */
    public static int nvkGetEncodedVideoSessionParametersKHR(VkDevice device, long pVideoSessionParametersInfo, long pFeedbackInfo, long pDataSize, long pData) {
        long __functionAddress = device.getCapabilities().vkGetEncodedVideoSessionParametersKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPI(device.address(), pVideoSessionParametersInfo, pFeedbackInfo, pDataSize, pData, __functionAddress);
    }

    /**
     * Get encoded parameter sets from a video session parameters object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Encoded parameter data <b>can</b> be retrieved from a video session parameters object created with a video encode operation using the command:</p>
     * 
     * <pre><code>
     * VkResult vkGetEncodedVideoSessionParametersKHR(
     *     VkDevice                                    device,
     *     const VkVideoEncodeSessionParametersGetInfoKHR* pVideoSessionParametersInfo,
     *     VkVideoEncodeSessionParametersFeedbackInfoKHR* pFeedbackInfo,
     *     size_t*                                     pDataSize,
     *     void*                                       pData);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pData} is {@code NULL}, then the size of the encoded parameter data, in bytes, that <b>can</b> be retrieved is returned in {@code pDataSize}. Otherwise, {@code pDataSize} <b>must</b> point to a variable set by the application to the size of the buffer, in bytes, pointed to by {@code pData}, and on return the variable is overwritten with the number of bytes actually written to {@code pData}. If {@code pDataSize} is less than the size of the encoded parameter data that <b>can</b> be retrieved, then no data will be written to {@code pData}, zero will be written to {@code pDataSize}, and {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS}, to indicate that no encoded parameter data was returned.</p>
     * 
     * <p>If {@code pFeedbackInfo} is not {@code NULL} then the members of the {@link VkVideoEncodeSessionParametersFeedbackInfoKHR} structure and any additional structures included in its {@code pNext} chain that are applicable to the video session parameters object specified in {@code pVideoSessionParametersInfo→videoSessionParameters} will be filled with feedback about the requested parameter data on all successful calls to this command.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>This includes the cases when {@code pData} is {@code NULL} or when {@link VK10#VK_INCOMPLETE INCOMPLETE} is returned by the command, and enables the application to determine whether the implementation <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-overrides">overrode</a> any of the requested video session parameters without actually needing to retrieve the encoded parameter data itself.</p>
     * </div>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code pVideoSessionParametersInfo→videoSessionParameters} <b>must</b> have been created with an encode operation</li>
     * <li>If {@code pVideoSessionParametersInfo→videoSessionParameters} was created with the video codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR}, then the {@code pNext} chain of {@code pVideoSessionParametersInfo} <b>must</b> include a {@link VkVideoEncodeH264SessionParametersGetInfoKHR} structure</li>
     * <li>If {@code pVideoSessionParametersInfo→videoSessionParameters} was created with the video codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR}, then for the {@link VkVideoEncodeH264SessionParametersGetInfoKHR} structure included in the {@code pNext} chain of {@code pVideoSessionParametersInfo}, if its {@code writeStdSPS} member is {@link VK10#VK_TRUE TRUE}, then {@code pVideoSessionParametersInfo→videoSessionParameters} <b>must</b> contain a {@code StdVideoH264SequenceParameterSet} entry with {@code seq_parameter_set_id} matching {@link VkVideoEncodeH264SessionParametersGetInfoKHR}{@code ::stdSPSId}</li>
     * <li>If {@code pVideoSessionParametersInfo→videoSessionParameters} was created with the video codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR}, then for the {@link VkVideoEncodeH264SessionParametersGetInfoKHR} structure included in the {@code pNext} chain of {@code pVideoSessionParametersInfo}, if its {@code writeStdPPS} member is {@link VK10#VK_TRUE TRUE}, then {@code pVideoSessionParametersInfo→videoSessionParameters} <b>must</b> contain a {@code StdVideoH264PictureParameterSet} entry with {@code seq_parameter_set_id} and {@code pic_parameter_set_id} matching {@link VkVideoEncodeH264SessionParametersGetInfoKHR}{@code ::stdSPSId} and {@link VkVideoEncodeH264SessionParametersGetInfoKHR}{@code ::stdPPSId}, respectively</li>
     * <li>If {@code pVideoSessionParametersInfo→videoSessionParameters} was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, then the {@code pNext} chain of {@code pVideoSessionParametersInfo} <b>must</b> include a {@link VkVideoEncodeH265SessionParametersGetInfoKHR} structure</li>
     * <li>If {@code pVideoSessionParametersInfo→videoSessionParameters} was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, then for the {@link VkVideoEncodeH265SessionParametersGetInfoKHR} structure included in the {@code pNext} chain of {@code pVideoSessionParametersInfo}, if its {@code writeStdVPS} member is {@link VK10#VK_TRUE TRUE}, then {@code pVideoSessionParametersInfo→videoSessionParameters} <b>must</b> contain a {@code StdVideoH265VideoParameterSet} entry with {@code vps_video_parameter_set_id} matching {@link VkVideoEncodeH265SessionParametersGetInfoKHR}{@code ::stdVPSId}</li>
     * <li>If {@code pVideoSessionParametersInfo→videoSessionParameters} was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, then for the {@link VkVideoEncodeH265SessionParametersGetInfoKHR} structure included in the {@code pNext} chain of {@code pVideoSessionParametersInfo}, if its {@code writeStdSPS} member is {@link VK10#VK_TRUE TRUE}, then {@code pVideoSessionParametersInfo→videoSessionParameters} <b>must</b> contain a {@code StdVideoH265SequenceParameterSet} entry with {@code sps_video_parameter_set_id} and {@code sps_seq_parameter_set_id} matching {@link VkVideoEncodeH265SessionParametersGetInfoKHR}{@code ::stdVPSId} and {@link VkVideoEncodeH265SessionParametersGetInfoKHR}{@code ::stdSPSId}, respectively</li>
     * <li>If {@code pVideoSessionParametersInfo→videoSessionParameters} was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, then for the {@link VkVideoEncodeH265SessionParametersGetInfoKHR} structure included in the {@code pNext} chain of {@code pVideoSessionParametersInfo}, if its {@code writeStdPPS} member is {@link VK10#VK_TRUE TRUE}, then {@code pVideoSessionParametersInfo→videoSessionParameters} <b>must</b> contain a {@code StdVideoH265PictureParameterSet} entry with {@code sps_video_parameter_set_id}, {@code pps_seq_parameter_set_id}, and {@code pps_pic_parameter_set_id} matching {@link VkVideoEncodeH265SessionParametersGetInfoKHR}{@code ::stdVPSId}, {@link VkVideoEncodeH265SessionParametersGetInfoKHR}{@code ::stdSPSId}, and {@link VkVideoEncodeH265SessionParametersGetInfoKHR}{@code ::stdPPSId}, respectively</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pVideoSessionParametersInfo} <b>must</b> be a valid pointer to a valid {@link VkVideoEncodeSessionParametersGetInfoKHR} structure</li>
     * <li>If {@code pFeedbackInfo} is not {@code NULL}, {@code pFeedbackInfo} <b>must</b> be a valid pointer to a {@link VkVideoEncodeSessionParametersFeedbackInfoKHR} structure</li>
     * <li>{@code pDataSize} <b>must</b> be a valid pointer to a {@code size_t} value</li>
     * <li>If the value referenced by {@code pDataSize} is not 0, and {@code pData} is not {@code NULL}, {@code pData} <b>must</b> be a valid pointer to an array of {@code pDataSize} bytes</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_INCOMPLETE INCOMPLETE}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoEncodeSessionParametersFeedbackInfoKHR}, {@link VkVideoEncodeSessionParametersGetInfoKHR}</p>
     *
     * @param device                      the logical device that owns the video session parameters object.
     * @param pVideoSessionParametersInfo a pointer to a {@link VkVideoEncodeSessionParametersGetInfoKHR} structure specifying the parameters of the encoded parameter data to retrieve.
     * @param pFeedbackInfo               either {@code NULL} or a pointer to a {@link VkVideoEncodeSessionParametersFeedbackInfoKHR} structure in which feedback about the requested parameter data is returned.
     * @param pDataSize                   a pointer to a {@code size_t} value related to the amount of encode parameter data returned, as described below.
     * @param pData                       either {@code NULL} or a pointer to a buffer to write the encoded parameter data to.
     */
    @NativeType("VkResult")
    public static int vkGetEncodedVideoSessionParametersKHR(VkDevice device, @NativeType("VkVideoEncodeSessionParametersGetInfoKHR const *") VkVideoEncodeSessionParametersGetInfoKHR pVideoSessionParametersInfo, @NativeType("VkVideoEncodeSessionParametersFeedbackInfoKHR *") @Nullable VkVideoEncodeSessionParametersFeedbackInfoKHR pFeedbackInfo, @NativeType("size_t *") PointerBuffer pDataSize, @NativeType("void *") @Nullable ByteBuffer pData) {
        if (CHECKS) {
            check(pDataSize, 1);
            checkSafe(pData, pDataSize.get(pDataSize.position()));
        }
        return nvkGetEncodedVideoSessionParametersKHR(device, pVideoSessionParametersInfo.address(), memAddressSafe(pFeedbackInfo), memAddress(pDataSize), memAddressSafe(pData));
    }

    // --- [ vkCmdEncodeVideoKHR ] ---

    /** Unsafe version of: {@link #vkCmdEncodeVideoKHR CmdEncodeVideoKHR} */
    public static void nvkCmdEncodeVideoKHR(VkCommandBuffer commandBuffer, long pEncodeInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEncodeVideoKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkVideoEncodeInfoKHR.validate(pEncodeInfo);
        }
        callPPV(commandBuffer.address(), pEncodeInfo, __functionAddress);
    }

    /**
     * Launch video encode operations.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To launch video encode operations, call:</p>
     * 
     * <pre><code>
     * void vkCmdEncodeVideoKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkVideoEncodeInfoKHR*                 pEncodeInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Each call issues one or more video encode operations. The implicit parameter {@code opCount} corresponds to the number of video encode operations issued by the command. After calling this command, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#queries-operation-active-query-index">active query index</a> of each <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#queries-operation-active">active</a> query is incremented by {@code opCount}.</p>
     * 
     * <p>Currently each call to this command results in the issue of a single video encode operation.</p>
     * 
     * <p>If the bound video session was created with {@link KHRVideoMaintenance1#VK_VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR} and the {@code pNext} chain of {@code pEncodeInfo} includes a {@link VkVideoInlineQueryInfoKHR} structure with its {@code queryPool} member specifying a valid {@code VkQueryPool} handle, then this command will execute a query for each video encode operation issued by it.</p>
     * 
     * <dl>
     * <dt>Active Reference Picture Information</dt>
     * <dd><ul>
     * <li>The image subregion within the image subresource <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#video-image-subresource-reference">referred</a> to by the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#video-picture-resources">video picture resource</a> used as the reference picture.</li>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dpb-slot">DPB slot</a> index the reference picture is associated with.</li>
     * <li>The codec-specific reference information related to the reference picture.</li>
     * </ul></dd>
     * </dl>
     * 
     * <dl>
     * <dt>Reconstructed Picture Information</dt>
     * <dd><ul>
     * <li>The image subregion within the image subresource <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#video-image-subresource-reference">referred</a> to by the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#video-picture-resources">video picture resource</a> used as the reconstructed picture.</li>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dpb-slot">DPB slot</a> index to use for picture reconstruction.</li>
     * <li>The codec-specific reference information related to the reconstructed picture.</li>
     * </ul></dd>
     * </dl>
     * 
     * <p>Specifying a valid {@link VkVideoReferenceSlotInfoKHR} structure in {@code pEncodeInfo→pSetupReferenceSlot} is always required, unless the video session was created with {@link VkVideoSessionCreateInfoKHR}{@code ::maxDpbSlot} equal to zero. However, the DPB slot identified by {@code pEncodeInfo→pSetupReferenceSlot→slotIndex} is only <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dpb-slot-states">activated</a> with the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#reconstructed-picture">reconstructed picture</a> specified in {@code pEncodeInfo→pSetupReferenceSlot→pPictureResource} if reference picture setup is requested according to the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-codec-specific-semantics">codec-specific semantics</a>.</p>
     * 
     * <p>If reconstructed picture information is specified, but reference picture setup is not requested, according to the codec-specific semantics, the contents of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#video-picture-resources">video picture resource</a> corresponding to the reconstructed picture will be undefined after the video encode operation.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Some implementations may always output the reconstructed picture or use it as temporary storage during the video encode operation even when the reconstructed picture is not marked for future reference.</p>
     * </div>
     * 
     * <dl>
     * <dt>Encode Input Picture Information</dt>
     * <dd><ul>
     * <li>The image subregion within the image subresource <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#video-image-subresource-reference">referred</a> to by the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#video-picture-resources">video picture resource</a> used as the encode input picture.</li>
     * <li>The codec-specific picture information related to the encoded picture.</li>
     * </ul></dd>
     * </dl>
     * 
     * <p>Several limiting values are defined below that are referenced by the relevant valid usage statements of this command.</p>
     * 
     * <ul>
     * <li>Let {@code uint32_t activeReferencePictureCount} be the size of the list of active reference pictures used by the video encode operation. Unless otherwise defined, {@code activeReferencePictureCount} is set to the value of {@code pEncodeInfo→referenceSlotCount}.</li>
     * <li>Let {@code VkOffset2D codedOffsetGranularity} be the minimum alignment requirement for the coded offset of video picture resources. Unless otherwise defined, the value of the {@code x} and {@code y} members of {@code codedOffsetGranularity} are 0.</li>
     * <li>Let {@code uint32_t dpbFrameUseCount[]} be an array of size {@code maxDpbSlots}, where {@code maxDpbSlots} is the {@link VkVideoSessionCreateInfoKHR}{@code ::maxDpbSlots} the bound video session was created with, with each element indicating the number of times a frame associated with the corresponding DPB slot index is referred to by the video coding operation. Let the initial value of each element of the array be 0.
     * 
     * <ul>
     * <li>If {@code pEncodeInfo→pSetupReferenceSlot} is not {@code NULL}, then {@code dpbFrameUseCount[i]} is incremented by one, where {@code i} equals {@code pEncodeInfo→pSetupReferenceSlot→slotIndex}.</li>
     * <li>For each element of {@code pEncodeInfo→pReferenceSlots}, {@code dpbFrameUseCount[i]} is incremented by one, where {@code i} equals the {@code slotIndex} member of the corresponding element.</li>
     * </ul>
     * </li>
     * <li>Let {@code VkExtent2D maxCodingBlockSize} be the maximum codec-specific coding block size that <b>may</b> be used by the video encode operation.
     * 
     * <ul>
     * <li>If the bound video session object was created with an <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h264-profile">H.264 encode profile</a>, then let {@code maxCodingBlockSize} be equal to the size of an H.264 macroblock, i.e. {@code {16,16}}.</li>
     * <li>If the bound video session object was created with an <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-profile">H.265 encode profile</a>, then let {@code maxCodingBlockSize} be equal to the maximum H.265 coding block size that <b>may</b> be used by the video encode operation derived as the maximum of the CTB sizes corresponding to the {@code VkVideoEncodeH265CtbSizeFlagBitsKHR} bits set in {@link VkVideoEncodeH265CapabilitiesKHR}{@code ::ctbSizes}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile the bound video session was created with.</li>
     * <li>Otherwise, {@code maxCodingBlockSize} is undefined.</li>
     * </ul>
     * </li>
     * <li>If {@code maxCodingBlockSize} is defined, then let {@code VkExtent2D minCodingBlockExtent} be the coded extent of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-input-picture">encode input picture</a> expressed in terms of codec-specific coding blocks, assuming the maximum size of such coding blocks, as defined by {@code maxCodingBlockSize}, calculated from the value of the {@code codedExtent} member of {@code pEncodeInfo→srcPictureResource} as follows:
     * 
     * <ul>
     * <li><code>minCodingBlockExtent.width = (codedExtent.width maxCodingBlockSize.width - 1) / maxCodingBlockSize.width</code></li>
     * <li><code>minCodingBlockExtent.height = (codedExtent.height maxCodingBlockSize.height - 1) / maxCodingBlockSize.height</code></li>
     * </ul>
     * </li>
     * <li>If the bound video session object was created with an <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h264-profile">H.264 encode profile</a>, then:
     * 
     * <ul>
     * <li>Let {@code StdVideoH264PictureType h264PictureType} be the picture type of the encoded picture set to the value of {@code pStdPictureInfo→primary_pic_type} specified in the {@link VkVideoEncodeH264PictureInfoKHR} structure included in the {@code pEncodeInfo→pNext} chain.</li>
     * <li>Let {@code StdVideoH264PictureType h264L0PictureTypes[]} and {@code StdVideoH264PictureType h264L1PictureTypes[]} be the picture types of the reference pictures in the L0 and L1 reference lists, respectively. If {@code pStdPictureInfo→pRefLists} specified in the {@link VkVideoEncodeH264PictureInfoKHR} structure included in the {@code pEncodeInfo→pNext} chain is not {@code NULL}, then for each reference index specified in the elements of the {@code pStdPictureInfo→pRefLists→RefPicList0} and {@code pStdPictureInfo→pRefLists→RefPicList1} arrays, if the reference index is not {@code STD_VIDEO_H264_NO_REFERENCE_PICTURE}, {@code pStdReferenceInfo→primary_pic_type} is added to {@code h264L0PictureTypes} or {@code h264L1PictureTypes}, respectively, where {@code pStdReferenceInfo} is the member of the {@link VkVideoEncodeH264DpbSlotInfoKHR} structure included in the {@code pNext} chain of the element of {@code pEncodeInfo→pReferenceSlots} for which {@code slotIndex} equals the reference index in question.</li>
     * </ul>
     * </li>
     * <li>If the bound video session object was created with an <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h264-profile">H.265 encode profile</a>, then:
     * 
     * <ul>
     * <li>Let {@code StdVideoH265PictureType h265PictureType} be the picture type of the encoded picture set to the value of {@code pStdPictureInfo→pic_type} specified in the {@link VkVideoEncodeH265PictureInfoKHR} structure included in the {@code pEncodeInfo→pNext} chain.</li>
     * <li>Let {@code StdVideoH265PictureType h265L0PictureTypes[]} and {@code StdVideoH265PictureType h265L1PictureTypes[]} be the picture types of the reference pictures in the L0 and L1 reference lists, respectively. If {@code pStdPictureInfo→pRefLists} specified in the {@link VkVideoEncodeH265PictureInfoKHR} structure included in the {@code pEncodeInfo→pNext} chain is not {@code NULL}, then for each reference index specified in the elements of the {@code pStdPictureInfo→pRefLists→RefPicList0} and {@code pStdPictureInfo→pRefLists→RefPicList1} arrays, if the reference index is not {@code STD_VIDEO_H265_NO_REFERENCE_PICTURE}, {@code pStdReferenceInfo→pic_type} is added to {@code h265L0PictureTypes} or {@code h265L1PictureTypes}, respectively, where {@code pStdReferenceInfo} is the member of the {@link VkVideoEncodeH265DpbSlotInfoKHR} structure included in the {@code pNext} chain of the element of {@code pEncodeInfo→pReferenceSlots} for which {@code slotIndex} equals the reference index in question.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The bound video session <b>must</b> have been created with an encode operation</li>
     * <li>The bound video session <b>must</b> not be in <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#video-session-uninitialized">uninitialized</a> state at the time the command is executed on the device</li>
     * <li>The bound video session parameters object <b>must</b> have been created with the currently set <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-quality-level">video encode quality level</a> for the bound video session at the time the command is executed on the device</li>
     * <li>For each <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#queries-operation-active">active</a> query, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#queries-operation-active-query-index">active query index</a> corresponding to the query type of that query plus {@code opCount} <b>must</b> be less than or equal to the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#queries-operation-last-activatable-query-index">last activatable query index</a> corresponding to the query type of that query plus one</li>
     * <li>If the bound video session was created with {@link KHRVideoMaintenance1#VK_VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR}, and the {@code pNext} chain of {@code pEncodeInfo} includes a {@link VkVideoInlineQueryInfoKHR} structure with its {@code queryPool} member specifying a valid {@code VkQueryPool} handle, then {@link VkVideoInlineQueryInfoKHR}::queryCount <b>must</b> equal {@code opCount}</li>
     * <li>If the bound video session was created with {@link KHRVideoMaintenance1#VK_VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR}, and the {@code pNext} chain of {@code pEncodeInfo} includes a {@link VkVideoInlineQueryInfoKHR} structure with its {@code queryPool} member specifying a valid {@code VkQueryPool} handle, then all the queries used by the command, as specified by the {@link VkVideoInlineQueryInfoKHR} structure, <b>must</b> be <em>unavailable</em></li>
     * <li>If the bound video session was created with {@link KHRVideoMaintenance1#VK_VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR}, then the {@code queryType} used to create the {@code queryPool} specified in the {@link VkVideoInlineQueryInfoKHR} structure included in the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> be {@link KHRVideoQueue#VK_QUERY_TYPE_RESULT_STATUS_ONLY_KHR QUERY_TYPE_RESULT_STATUS_ONLY_KHR} or {@link #VK_QUERY_TYPE_VIDEO_ENCODE_FEEDBACK_KHR QUERY_TYPE_VIDEO_ENCODE_FEEDBACK_KHR}</li>
     * <li>If the bound video session was created with {@link KHRVideoMaintenance1#VK_VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR}, then the {@code queryPool} specified in the {@link VkVideoInlineQueryInfoKHR} structure included in the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> have been created with a {@link VkVideoProfileInfoKHR} structure included in the {@code pNext} chain of {@link VkQueryPoolCreateInfo} identical to the one specified in {@link VkVideoSessionCreateInfoKHR}{@code ::pVideoProfile} the bound video session was created with</li>
     * <li>If the bound video session was created with {@link KHRVideoMaintenance1#VK_VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR}, and the {@code queryType} used to create the {@code queryPool} specified in the {@link VkVideoInlineQueryInfoKHR} structure included in the {@code pNext} chain of {@code pEncodeInfo} is {@link KHRVideoQueue#VK_QUERY_TYPE_RESULT_STATUS_ONLY_KHR QUERY_TYPE_RESULT_STATUS_ONLY_KHR}, then the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> have been created with a queue family index that supports <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#queries-result-status-only">result status queries</a>, as indicated by {@link VkQueueFamilyQueryResultStatusPropertiesKHR}{@code ::queryResultStatusSupport}</li>
     * <li>{@code pEncodeInfo→dstBuffer} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#video-profile-compatibility">compatible</a> with the video profile the bound video session was created with</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer and <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, then {@code pEncodeInfo→dstBuffer} <b>must</b> not be a protected buffer</li>
     * <li>If {@code commandBuffer} is a protected command buffer and <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, then {@code pEncodeInfo→dstBuffer} <b>must</b> be a protected buffer</li>
     * <li>{@code pEncodeInfo→dstBufferOffset} <b>must</b> be an integer multiple of {@link VkVideoCapabilitiesKHR}{@code ::minBitstreamBufferOffsetAlignment}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile the bound video session was created with</li>
     * <li>{@code pEncodeInfo→dstBufferRange} <b>must</b> be an integer multiple of {@link VkVideoCapabilitiesKHR}{@code ::minBitstreamBufferSizeAlignment}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile the bound video session was created with</li>
     * <li>{@code pEncodeInfo→srcPictureResource.imageViewBinding} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#video-profile-compatibility">compatible</a> with the video profile the bound video session was created with</li>
     * <li>The format of {@code pEncodeInfo→srcPictureResource.imageViewBinding} <b>must</b> match the {@link VkVideoSessionCreateInfoKHR}{@code ::pictureFormat} the bound video session was created with</li>
     * <li>{@code pEncodeInfo→srcPictureResource.codedOffset} <b>must</b> be an integer multiple of {@code codedOffsetGranularity}</li>
     * <li>{@code pEncodeInfo→srcPictureResource.codedExtent} <b>must</b> be between {@code minCodedExtent} and {@code maxCodedExtent}, inclusive, the bound video session was created with</li>
     * <li>{@code pEncodeInfo→srcPictureResource.imageViewBinding} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR}</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer and <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, then {@code pEncodeInfo→srcPictureResource.imageViewBinding} <b>must</b> not have been created from a protected image</li>
     * <li>If {@code commandBuffer} is a protected command buffer and <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, then {@code pEncodeInfo→srcPictureResource.imageViewBinding} <b>must</b> have been created from a protected image</li>
     * <li>{@code pEncodeInfo→pSetupReferenceSlot} <b>must</b> not be {@code NULL} unless the bound video session was created with {@link VkVideoSessionCreateInfoKHR}{@code ::maxDpbSlots} equal to zero</li>
     * <li>If {@code pEncodeInfo→pSetupReferenceSlot} is not {@code NULL}, then {@code pEncodeInfo→pSetupReferenceSlot→slotIndex} <b>must</b> be less than the {@link VkVideoSessionCreateInfoKHR}{@code ::maxDpbSlots} specified when the bound video session was created</li>
     * <li>If {@code pEncodeInfo→pSetupReferenceSlot} is not {@code NULL}, then {@code pEncodeInfo→pSetupReferenceSlot→pPictureResource→codedOffset} <b>must</b> be an integer multiple of {@code codedOffsetGranularity}</li>
     * <li>If {@code pEncodeInfo→pSetupReferenceSlot} is not {@code NULL}, then {@code pEncodeInfo→pSetupReferenceSlot→pPictureResource} <b>must</b> <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#video-picture-resource-matching">match</a> one of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#bound-reference-picture-resources">bound reference picture resource</a></li>
     * <li>{@code activeReferencePictureCount} <b>must</b> be less than or equal to the {@link VkVideoSessionCreateInfoKHR}{@code ::maxActiveReferencePictures} specified when the bound video session was created</li>
     * <li>The {@code slotIndex} member of each element of {@code pEncodeInfo→pReferenceSlots} <b>must</b> be less than the {@link VkVideoSessionCreateInfoKHR}{@code ::maxDpbSlots} specified when the bound video session was created</li>
     * <li>The {@code codedOffset} member of the {@link VkVideoPictureResourceInfoKHR} structure pointed to by the {@code pPictureResource} member of each element of {@code pEncodeInfo→pReferenceSlots} <b>must</b> be an integer multiple of {@code codedOffsetGranularity}</li>
     * <li>The {@code pPictureResource} member of each element of {@code pEncodeInfo→pReferenceSlots} <b>must</b> <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#video-picture-resource-matching">match</a> one of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#bound-reference-picture-resources">bound reference picture resource</a> associated with the DPB slot index specified in the {@code slotIndex} member of that element</li>
     * <li>Each video picture resource corresponding to the {@code pPictureResource} member specified in the elements of {@code pEncodeInfo→pReferenceSlots} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#video-picture-resource-uniqueness">unique</a> within {@code pEncodeInfo→pReferenceSlots}</li>
     * <li>All elements of {@code dpbFrameUseCount} <b>must</b> be less than or equal to 1</li>
     * <li>The image subresource <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#video-image-subresource-reference">referred</a> to by {@code pEncodeInfo→srcPictureResource} <b>must</b> be in the {@link #VK_IMAGE_LAYOUT_VIDEO_ENCODE_SRC_KHR IMAGE_LAYOUT_VIDEO_ENCODE_SRC_KHR} layout at the time the video encode operation is executed on the device</li>
     * <li>If {@code pEncodeInfo→pSetupReferenceSlot} is not {@code NULL}, then the image subresource <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#video-image-subresource-reference">referred</a> to by {@code pEncodeInfo→pSetupReferenceSlot→pPictureResource} <b>must</b> be in the {@link #VK_IMAGE_LAYOUT_VIDEO_ENCODE_DPB_KHR IMAGE_LAYOUT_VIDEO_ENCODE_DPB_KHR} layout at the time the video encode operation is executed on the device</li>
     * <li>The image subresource <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#video-image-subresource-reference">referred</a> to by the {@code pPictureResource} member of each element of {@code pEncodeInfo→pReferenceSlots} <b>must</b> be in the {@link #VK_IMAGE_LAYOUT_VIDEO_ENCODE_DPB_KHR IMAGE_LAYOUT_VIDEO_ENCODE_DPB_KHR} layout at the time the video encode operation is executed on the device</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR}, then the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> include a {@link VkVideoEncodeH264PictureInfoKHR} structure</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR}, then the bound video session parameters object <b>must</b> contain a {@code StdVideoH264SequenceParameterSet} entry with {@code seq_parameter_set_id} matching {@code StdVideoEncodeH264PictureInfo}{@code ::seq_parameter_set_id} that is provided in the {@code pStdPictureInfo} member of the {@link VkVideoEncodeH264PictureInfoKHR} structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR}, then the bound video session parameters object <b>must</b> contain a {@code StdVideoH264PictureParameterSet} entry with {@code seq_parameter_set_id} and {@code pic_parameter_set_id} matching {@code StdVideoEncodeH264PictureInfo}{@code ::seq_parameter_set_id} and {@code StdVideoEncodeH264PictureInfo}{@code ::pic_parameter_set_id}, respectively, that are provided in the {@code pStdPictureInfo} member of the {@link VkVideoEncodeH264PictureInfoKHR} structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR} and {@code pEncodeInfo→pSetupReferenceSlot} is not {@code NULL}, then the {@code pNext} chain of {@code pEncodeInfo→pSetupReferenceSlot} <b>must</b> include a {@link VkVideoEncodeH264DpbSlotInfoKHR} structure</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR}, then the {@code pNext} chain of each element of {@code pEncodeInfo→pReferenceSlots} <b>must</b> include a {@link VkVideoEncodeH264DpbSlotInfoKHR} structure</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR} and the current <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-rate-control-modes">rate control mode</a> is not {@link #VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR}, then {@link VkVideoEncodeH264NaluSliceInfoKHR}{@code ::constantQp} <b>must</b> be zero for each element of the {@code pNaluSliceEntries} member of the {@link VkVideoEncodeH264PictureInfoKHR} structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR} and the current <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-rate-control-modes">rate control mode</a> is {@link #VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR}, then {@link VkVideoEncodeH264NaluSliceInfoKHR}{@code ::constantQp} <b>must</b> be between {@link VkVideoEncodeH264CapabilitiesKHR}{@code ::minQp} and {@link VkVideoEncodeH264CapabilitiesKHR}{@code ::maxQp}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile the bound video session was created with, for each element of the {@code pNaluSliceEntries} member of the {@link VkVideoEncodeH264PictureInfoKHR} structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR} and {@link VkVideoEncodeH264CapabilitiesKHR}{@code ::flags} does not include {@link KHRVideoEncodeH264#VK_VIDEO_ENCODE_H264_CAPABILITY_PER_SLICE_CONSTANT_QP_BIT_KHR VIDEO_ENCODE_H264_CAPABILITY_PER_SLICE_CONSTANT_QP_BIT_KHR}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile the bound video session was created with, then {@link VkVideoEncodeH264NaluSliceInfoKHR}{@code ::constantQp} <b>must</b> have the same value for each element of the {@code pNaluSliceEntries} member of the {@link VkVideoEncodeH264PictureInfoKHR} structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR}, then the {@code naluSliceEntryCount} member of the {@link VkVideoEncodeH264PictureInfoKHR} structure included in the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> be less than or equal to {@code minCodingBlockExtent.width} multiplied by {@code minCodingBlockExtent.height}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR} and {@link VkVideoEncodeH264CapabilitiesKHR}{@code ::flags} does not include {@link KHRVideoEncodeH264#VK_VIDEO_ENCODE_H264_CAPABILITY_ROW_UNALIGNED_SLICE_BIT_KHR VIDEO_ENCODE_H264_CAPABILITY_ROW_UNALIGNED_SLICE_BIT_KHR}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile the bound video session was created with, then the {@code naluSliceEntryCount} member of the {@link VkVideoEncodeH264PictureInfoKHR} structure included in the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> be less than or equal to {@code minCodingBlockExtent.height}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR}, the {@code pNext} chain of {@code pEncodeInfo} includes a {@link VkVideoEncodeH264PictureInfoKHR} structure, and {@code pEncodeInfo→referenceSlotCount} is greater than zero, then {@link VkVideoEncodeH264PictureInfoKHR}{@code ::pStdPictureInfo→pRefLists} <b>must</b> not be {@code NULL}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR}, the {@code pNext} chain of {@code pEncodeInfo} includes a {@link VkVideoEncodeH264PictureInfoKHR} structure, and {@link VkVideoEncodeH264PictureInfoKHR}{@code ::pStdPictureInfo→pRefLists} is not {@code NULL}, then each element of the {@code RefPicList0} and {@code RefPicList1} array members of the {@code StdVideoEncodeH264ReferenceListsInfo} structure pointed to by {@link VkVideoEncodeH264PictureInfoKHR}{@code ::pStdPictureInfo→pRefLists} <b>must</b> either be {@code STD_VIDEO_H264_NO_REFERENCE_PICTURE} or <b>must</b> equal the {@code slotIndex} member of one of the elements of {@code pEncodeInfo→pReferenceSlots}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR}, the {@code pNext} chain of {@code pEncodeInfo} includes a {@link VkVideoEncodeH264PictureInfoKHR} structure, and {@code pEncodeInfo→referenceSlotCount} is greater than zero, then the {@code slotIndex} member of each element of {@code pEncodeInfo→pReferenceSlots} <b>must</b> equal one of the elements of the {@code RefPicList0} or {@code RefPicList1} array members of the {@code StdVideoEncodeH264ReferenceListsInfo} structure pointed to by {@link VkVideoEncodeH264PictureInfoKHR}{@code ::pStdPictureInfo→pRefLists}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR} and {@link VkVideoEncodeH264CapabilitiesKHR}{@code ::maxPPictureL0ReferenceCount} is zero, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile the bound video session was created with, then {@code h264PictureType} and each element of {@code h264L0PictureTypes} and {@code h264L1PictureTypes} <b>must</b> not be {@code STD_VIDEO_H264_PICTURE_TYPE_P}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR} and {@link VkVideoEncodeH264CapabilitiesKHR}{@code ::maxBPictureL0ReferenceCount} and {@link VkVideoEncodeH264CapabilitiesKHR}{@code ::maxL1ReferenceCount} are both zero, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile the bound video session was created with, then {@code h264PictureType} and each element of {@code h264L0PictureTypes} and {@code h264L1PictureTypes} <b>must</b> not be {@code STD_VIDEO_H264_PICTURE_TYPE_B}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR} and {@link VkVideoEncodeH264CapabilitiesKHR}{@code ::flags} does not include {@link KHRVideoEncodeH264#VK_VIDEO_ENCODE_H264_CAPABILITY_B_FRAME_IN_L0_LIST_BIT_KHR VIDEO_ENCODE_H264_CAPABILITY_B_FRAME_IN_L0_LIST_BIT_KHR}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile the bound video session was created with, then each element of {@code h264L0PictureTypes} <b>must</b> not be {@code STD_VIDEO_H264_PICTURE_TYPE_B}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR} and {@link VkVideoEncodeH264CapabilitiesKHR}{@code ::flags} does not include {@link KHRVideoEncodeH264#VK_VIDEO_ENCODE_H264_CAPABILITY_B_FRAME_IN_L1_LIST_BIT_KHR VIDEO_ENCODE_H264_CAPABILITY_B_FRAME_IN_L1_LIST_BIT_KHR}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile the bound video session was created with, then each element of {@code h264L1PictureTypes} <b>must</b> not be {@code STD_VIDEO_H264_PICTURE_TYPE_B}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, then the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> include a {@link VkVideoEncodeH265PictureInfoKHR} structure</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, then the bound video session parameters object <b>must</b> contain a {@code StdVideoH265VideoParameterSet} entry with {@code vps_video_parameter_set_id} matching {@code StdVideoEncodeH265PictureInfo}{@code ::sps_video_parameter_set_id} that is provided in the {@code pStdPictureInfo} member of the {@link VkVideoEncodeH265PictureInfoKHR} structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, then the bound video session parameters object <b>must</b> contain a {@code StdVideoH265SequenceParameterSet} entry with {@code sps_video_parameter_set_id} and {@code sps_seq_parameter_set_id} matching {@code StdVideoEncodeH265PictureInfo}{@code ::sps_video_parameter_set_id} and {@code StdVideoEncodeH265PictureInfo}{@code ::pps_seq_parameter_set_id}, respectively, that are provided in the {@code pStdPictureInfo} member of the {@link VkVideoEncodeH265PictureInfoKHR} structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, then the bound video session parameters object <b>must</b> contain a {@code StdVideoH265PictureParameterSet} entry with {@code sps_video_parameter_set_id}, {@code pps_seq_parameter_set_id}, and {@code pps_pic_parameter_set_id} matching {@code StdVideoEncodeH265PictureInfo}{@code ::sps_video_parameter_set_id}, {@code StdVideoEncodeH265PictureInfo}{@code ::pps_seq_parameter_set_id}, and {@code StdVideoEncodeH265PictureInfo}{@code ::pps_pic_parameter_set_id}, respectively, that are provided in the {@code pStdPictureInfo} member of the {@link VkVideoEncodeH265PictureInfoKHR} structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR} and {@code pEncodeInfo→pSetupReferenceSlot} is not {@code NULL}, then the {@code pNext} chain of {@code pEncodeInfo→pSetupReferenceSlot} <b>must</b> include a {@link VkVideoEncodeH265DpbSlotInfoKHR} structure</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, then the {@code pNext} chain of each element of {@code pEncodeInfo→pReferenceSlots} <b>must</b> include a {@link VkVideoEncodeH265DpbSlotInfoKHR} structure</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR} and the current <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-rate-control-modes">rate control mode</a> is not {@link #VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR}, then {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR}{@code ::constantQp} <b>must</b> be zero for each element of the {@code pNaluSliceSegmentEntries} member of the {@link VkVideoEncodeH265PictureInfoKHR} structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR} and the current <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-rate-control-modes">rate control mode</a> is {@link #VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR}, then {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR}{@code ::constantQp} <b>must</b> be between {@link VkVideoEncodeH265CapabilitiesKHR}{@code ::minQp} and {@link VkVideoEncodeH265CapabilitiesKHR}{@code ::maxQp}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile the bound video session was created with, for each element of the {@code pNaluSliceSegmentEntries} member of the {@link VkVideoEncodeH265PictureInfoKHR} structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR} and {@link VkVideoEncodeH265CapabilitiesKHR}{@code ::flags} does not include {@link KHRVideoEncodeH265#VK_VIDEO_ENCODE_H265_CAPABILITY_PER_SLICE_SEGMENT_CONSTANT_QP_BIT_KHR VIDEO_ENCODE_H265_CAPABILITY_PER_SLICE_SEGMENT_CONSTANT_QP_BIT_KHR}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile the bound video session was created with, then {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR}{@code ::constantQp} <b>must</b> have the same value for each element of the {@code pNaluSliceSegmentEntries} member of the {@link VkVideoEncodeH264PictureInfoKHR} structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, then the {@code naluSliceSegmentEntryCount} member of the {@link VkVideoEncodeH265PictureInfoKHR} structure included in the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> be less than or equal to {@code minCodingBlockExtent.width} multiplied by {@code minCodingBlockExtent.height}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR} and {@link VkVideoEncodeH265CapabilitiesKHR}{@code ::flags} does not include {@link KHRVideoEncodeH265#VK_VIDEO_ENCODE_H265_CAPABILITY_ROW_UNALIGNED_SLICE_SEGMENT_BIT_KHR VIDEO_ENCODE_H265_CAPABILITY_ROW_UNALIGNED_SLICE_SEGMENT_BIT_KHR}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile the bound video session was created with, then the {@code naluSliceSegmentEntryCount} member of the {@link VkVideoEncodeH265PictureInfoKHR} structure included in the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> be less than or equal to {@code minCodingBlockExtent.height}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, the {@code pNext} chain of {@code pEncodeInfo} includes a {@link VkVideoEncodeH265PictureInfoKHR} structure, and {@code pEncodeInfo→referenceSlotCount} is greater than zero, then {@link VkVideoEncodeH265PictureInfoKHR}{@code ::pStdPictureInfo→pRefLists} <b>must</b> not be {@code NULL}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, the {@code pNext} chain of {@code pEncodeInfo} includes a {@link VkVideoEncodeH265PictureInfoKHR} structure, and {@link VkVideoEncodeH265PictureInfoKHR}{@code ::pStdPictureInfo→pRefLists} is not {@code NULL}, then each element of the {@code RefPicList0} and {@code RefPicList1} array members of the {@code StdVideoEncodeH265ReferenceListsInfo} structure pointed to by {@link VkVideoEncodeH265PictureInfoKHR}{@code ::pStdPictureInfo→pRefLists} <b>must</b> either be {@code STD_VIDEO_H265_NO_REFERENCE_PICTURE} or <b>must</b> equal the {@code slotIndex} member of one of the elements of {@code pEncodeInfo→pReferenceSlots}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, the {@code pNext} chain of {@code pEncodeInfo} includes a {@link VkVideoEncodeH265PictureInfoKHR} structure, and {@code pEncodeInfo→referenceSlotCount} is greater than zero, then the {@code slotIndex} member of each element of {@code pEncodeInfo→pReferenceSlots} <b>must</b> equal one of the elements of the {@code RefPicList0} or {@code RefPicList1} array members of the {@code StdVideoEncodeH265ReferenceListsInfo} structure pointed to by {@link VkVideoEncodeH265PictureInfoKHR}{@code ::pStdPictureInfo→pRefLists}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR} and {@link VkVideoEncodeH265CapabilitiesKHR}{@code ::maxPPictureL0ReferenceCount} is zero, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile the bound video session was created with, then {@code h265PictureType} and each element of {@code h265L0PictureTypes} and {@code h265L1PictureTypes} <b>must</b> not be {@code STD_VIDEO_H265_PICTURE_TYPE_P}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR} and {@link VkVideoEncodeH265CapabilitiesKHR}{@code ::maxBPictureL0ReferenceCount} and {@link VkVideoEncodeH265CapabilitiesKHR}{@code ::maxL1ReferenceCount} are both zero, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile the bound video session was created with, then {@code h265PictureType} and each element of {@code h265L0PictureTypes} and {@code h265L1PictureTypes} <b>must</b> not be {@code STD_VIDEO_H265_PICTURE_TYPE_B}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR} and {@link VkVideoEncodeH265CapabilitiesKHR}{@code ::flags} does not include {@link KHRVideoEncodeH265#VK_VIDEO_ENCODE_H265_CAPABILITY_B_FRAME_IN_L0_LIST_BIT_KHR VIDEO_ENCODE_H265_CAPABILITY_B_FRAME_IN_L0_LIST_BIT_KHR}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile the bound video session was created with, then each element of {@code h265L0PictureTypes} <b>must</b> not be {@code STD_VIDEO_H264_PICTURE_TYPE_B}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR} and {@link VkVideoEncodeH265CapabilitiesKHR}{@code ::flags} does not include {@link KHRVideoEncodeH265#VK_VIDEO_ENCODE_H265_CAPABILITY_B_FRAME_IN_L1_LIST_BIT_KHR VIDEO_ENCODE_H265_CAPABILITY_B_FRAME_IN_L1_LIST_BIT_KHR}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile the bound video session was created with, then each element of {@code h265L1PictureTypes} <b>must</b> not be {@code STD_VIDEO_H265_PICTURE_TYPE_B}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pEncodeInfo} <b>must</b> be a valid pointer to a valid {@link VkVideoEncodeInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support encode operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
     * <li>This command <b>must</b> only be called inside of a video coding scope</li>
     * <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary</td><td>Outside</td><td>Inside</td><td>Encode</td><td>Action</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoEncodeInfoKHR}</p>
     *
     * @param commandBuffer the command buffer in which to record the command.
     * @param pEncodeInfo   a pointer to a {@link VkVideoEncodeInfoKHR} structure specifying the parameters of the video encode operations.
     */
    public static void vkCmdEncodeVideoKHR(VkCommandBuffer commandBuffer, @NativeType("VkVideoEncodeInfoKHR const *") VkVideoEncodeInfoKHR pEncodeInfo) {
        nvkCmdEncodeVideoKHR(commandBuffer, pEncodeInfo.address());
    }

}