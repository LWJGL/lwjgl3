/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

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
 * <h5>VK_KHR_video_encode_queue</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_video_encode_queue}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>300</dd>
 * <dt><b>Revision</b></dt>
 * <dd>10</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRVideoQueue VK_KHR_video_queue} and {@link KHRSynchronization2 VK_KHR_synchronization2}
 * 
 * <ul>
 * <li>This is a <em>provisional</em> extension and <b>must</b> be used with caution. See the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#boilerplate-provisional-header">description</a> of provisional header files for enablement and stability details.</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Ahmed Abdelkhalek <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_video_encode_queue]%20@aabdelkh%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_video_encode_queue%20extension*">aabdelkh</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-07-19</dd>
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
 * </ul></dd>
 * </dl>
 */
public class KHRVideoEncodeQueue {

    /** The extension specification version. */
    public static final int VK_KHR_VIDEO_ENCODE_QUEUE_SPEC_VERSION = 10;

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
     * <li>{@link #VK_VIDEO_ENCODE_CAPABILITY_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_DETECTION_BIT_KHR VIDEO_ENCODE_CAPABILITY_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_DETECTION_BIT_KHR} indicates that the implementation is able to detect and report when the destination video bitstream buffer range provided by the application is not sufficiently large to fit the encoded bitstream data produced by a video encode operation by reporting the {@link #VK_QUERY_RESULT_STATUS_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_KHR QUERY_RESULT_STATUS_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_KHR} <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#query-result-status-codes">query result status code</a>.
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
     * <li>{@link #VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR} specifies that rate control is disabled and any quality control parameters for the encoding are provided on a per-picture basis. In this mode implementations will encode pictures independently of the output bitrate of prior video encode operations. When using an H.264 encode profile, implementations will use the QP values specified in the {@link VkVideoEncodeH264RateControlInfoEXT} structure for the encoded picture. When using an H.265 encode profile, implementations will use the QP values specified in the {@link VkVideoEncodeH265RateControlInfoEXT} structure for the encoded picture.</li>
     * <li>{@link #VK_VIDEO_ENCODE_RATE_CONTROL_MODE_CBR_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_CBR_BIT_KHR} specifies the use of constant bitrate rate control mode.</li>
     * <li>{@link #VK_VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR} specifies the use of variable bitrate rate control mode.</li>
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
     * <li>{@link #VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_BUFFER_OFFSET_BIT_KHR VIDEO_ENCODE_FEEDBACK_BITSTREAM_BUFFER_OFFSET_BIT_KHR} specifies that queries managed by the pool will capture the byte offset of the bitstream data written by the video encode operation to the bitstream buffer specified in {@link VkVideoEncodeInfoKHR}{@code ::dstBuffer} relative to the offset specified in {@link VkVideoEncodeInfoKHR}{@code ::dstBufferOffset}.</li>
     * <li>{@link #VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_BYTES_WRITTEN_BIT_KHR VIDEO_ENCODE_FEEDBACK_BITSTREAM_BYTES_WRITTEN_BIT_KHR} specifies that queries managed by the pool will capture the number of bytes written by the video encode operation to the bitstream buffer specified in {@link VkVideoEncodeInfoKHR}{@code ::dstBuffer}.</li>
     * <li>{@link #VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_HAS_OVERRIDES_BIT_KHR VIDEO_ENCODE_FEEDBACK_BITSTREAM_HAS_OVERRIDES_BIT_KHR} specifies that queries managed by the pool will capture a boolean value indicating that the data written to the bitstream buffer specified in {@link VkVideoEncodeInfoKHR}{@code ::dstBuffer} contains overridden parameters.</li>
     * </ul>
     * 
     * <p>When retrieving the results of video encode feedback queries, the values corresponding to each enabled video encode feedback are written in the order of the bits defined above, followed by an optional value indicating availability or result status if {@link VK10#VK_QUERY_RESULT_WITH_AVAILABILITY_BIT QUERY_RESULT_WITH_AVAILABILITY_BIT} or {@link KHRVideoQueue#VK_QUERY_RESULT_WITH_STATUS_BIT_KHR QUERY_RESULT_WITH_STATUS_BIT_KHR} is specified, respectively.</p>
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
     * <p>If {@code pFeedbackInfo} is not {@code NULL} then the members of the {@link VkVideoEncodeSessionParametersFeedbackInfoKHR} structure and any additional structures included in its {@code pNext} chain that are applicable to the video session parameters object specified in {@code pVideoSessionParametersInfo}{@code ::videoSessionParameters} will be filled with feedback about the requested parameter data on all successful calls to this command.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note:</h5>
     * 
     * <p>This includes the cases when {@code pData} is {@code NULL} or when {@link VK10#VK_INCOMPLETE INCOMPLETE} is returned by the command, and enables the application to determine whether the implementation overrode any of the requested video session parameters without actually needing to retrieve the encoded parameter data itself.</p>
     * </div>
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
    public static int vkGetEncodedVideoSessionParametersKHR(VkDevice device, @NativeType("VkVideoEncodeSessionParametersGetInfoKHR const *") VkVideoEncodeSessionParametersGetInfoKHR pVideoSessionParametersInfo, @Nullable @NativeType("VkVideoEncodeSessionParametersFeedbackInfoKHR *") VkVideoEncodeSessionParametersFeedbackInfoKHR pFeedbackInfo, @NativeType("size_t *") PointerBuffer pDataSize, @Nullable @NativeType("void *") ByteBuffer pData) {
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
     * Encode operation for bitstream generation.
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
     * <p>Each call issues one or more video encode operations. The implicit parameter {@code opCount} corresponds to the number of video encode operations issued by the command. After calling this command, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#queries-operation-active-query-index">active query index</a> of each <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#queries-operation-active">active</a> query is incremented by {@code opCount}.</p>
     * 
     * <p>Currently each call to this command results in the issue of a single video encode operation.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>For each <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#queries-operation-active">active</a> query, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#queries-operation-active-query-index">active query index</a> corresponding to the query type of that query plus {@code opCount} <b>must</b> be less than or equal to the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#queries-operation-last-activatable-query-index">last activatable query index</a> corresponding to the query type of that query plus one</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pEncodeInfo} <b>must</b> be a valid pointer to a valid {@link VkVideoEncodeInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary</td><td>Outside</td><td>Inside</td><td>Encode</td><td>Action</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoEncodeInfoKHR}</p>
     *
     * @param commandBuffer the command buffer to be filled with this function for encoding to generate a bitstream.
     * @param pEncodeInfo   a pointer to a {@link VkVideoEncodeInfoKHR} structure.
     */
    public static void vkCmdEncodeVideoKHR(VkCommandBuffer commandBuffer, @NativeType("VkVideoEncodeInfoKHR const *") VkVideoEncodeInfoKHR pEncodeInfo) {
        nvkCmdEncodeVideoKHR(commandBuffer, pEncodeInfo.address());
    }

}