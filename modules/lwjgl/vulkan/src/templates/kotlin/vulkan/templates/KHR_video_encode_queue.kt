/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_video_encode_queue = "KHRVideoEncodeQueue".nativeClassVK("KHR_video_encode_queue", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension builds upon the {@link KHRVideoQueue VK_KHR_video_queue} extension by adding common APIs specific to video encoding and thus enabling implementations to expose queue families supporting video encode operations.

        More specifically, it adds video encode specific capabilities and a new command buffer command that allows recording video encode operations against a video session.

        This extension is to be used in conjunction with other codec specific video encode extensions that enable encoding video sequences of specific video compression standards.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_video_encode_queue}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>300</dd>

            <dt><b>Revision</b></dt>
            <dd>12</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRVideoQueue VK_KHR_video_queue} and {@link KHRSynchronization2 VK_KHR_synchronization2} or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#versions-1.3">Version 1.3</a></dd>

            <dt><b>API Interactions</b></dt>
            <dd><ul>
                <li>Interacts with VK_VERSION_1_3</li>
                <li>Interacts with VK_KHR_format_feature_flags2</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Ahmed Abdelkhalek <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_video_encode_queue]%20@aabdelkh%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_video_encode_queue%20extension*">aabdelkh</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_video_encode_queue.adoc">VK_KHR_video_encode_queue</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-12-05</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Ahmed Abdelkhalek, AMD</li>
                <li>Damien Kessler, NVIDIA</li>
                <li>George Hao, AMD</li>
                <li>Jake Beju, AMD</li>
                <li>Peter Fang, AMD</li>
                <li>Piers Daniell, NVIDIA</li>
                <li>Srinath Kumarapuram, NVIDIA</li>
                <li>Thomas J. Meier, NVIDIA</li>
                <li>Tony Zlatinski, NVIDIA</li>
                <li>Ravi Chaudhary, NVIDIA</li>
                <li>Yang Liu, AMD</li>
                <li>Daniel Rakos, RasterGrid</li>
                <li>Ping Liu, Intel</li>
                <li>Aidan Fabius, Core Avionics &amp; Industrial Inc.</li>
                <li>Lynne Iribarren, Independent</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_VIDEO_ENCODE_QUEUE_SPEC_VERSION".."12"
    )

    StringConstant(
        "The extension name.",

        "KHR_VIDEO_ENCODE_QUEUE_EXTENSION_NAME".."VK_KHR_video_encode_queue"
    )

    EnumConstantLong(
        "Extends {@code VkPipelineStageFlagBits2}.",

        "PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR".enum(0x08000000L)
    )

    EnumConstantLong(
        "Extends {@code VkAccessFlagBits2}.",

        "ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR".enum(0x2000000000L),
        "ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR".enum(0x4000000000L)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR".."1000299000",
        "STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR".."1000299001",
        "STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR".."1000299002",
        "STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR".."1000299003",
        "STRUCTURE_TYPE_VIDEO_ENCODE_USAGE_INFO_KHR".."1000299004",
        "STRUCTURE_TYPE_QUERY_POOL_VIDEO_ENCODE_FEEDBACK_CREATE_INFO_KHR".."1000299005",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR".."1000299006",
        "STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_PROPERTIES_KHR".."1000299007",
        "STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR".."1000299008",
        "STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_GET_INFO_KHR".."1000299009",
        "STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_FEEDBACK_INFO_KHR".."1000299010"
    )

    EnumConstant(
        "Extends {@code VkQueueFlagBits}.",

        "QUEUE_VIDEO_ENCODE_BIT_KHR".enum(0x00000040)
    )

    EnumConstant(
        "Extends {@code VkVideoCodingControlFlagBitsKHR}.",

        "VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR".enum(0x00000002),
        "VIDEO_CODING_CONTROL_ENCODE_QUALITY_LEVEL_BIT_KHR".enum(0x00000004)
    )

    EnumConstant(
        "Extends {@code VkBufferUsageFlagBits}.",

        "BUFFER_USAGE_VIDEO_ENCODE_DST_BIT_KHR".enum(0x00008000),
        "BUFFER_USAGE_VIDEO_ENCODE_SRC_BIT_KHR".enum(0x00010000)
    )

    EnumConstant(
        "Extends {@code VkImageUsageFlagBits}.",

        "IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR".enum(0x00002000),
        "IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR".enum(0x00004000),
        "IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR".enum(0x00008000)
    )

    EnumConstant(
        "Extends {@code VkFormatFeatureFlagBits}.",

        "FORMAT_FEATURE_VIDEO_ENCODE_INPUT_BIT_KHR".enum(0x08000000),
        "FORMAT_FEATURE_VIDEO_ENCODE_DPB_BIT_KHR".enum(0x10000000)
    )

    EnumConstant(
        "Extends {@code VkVideoSessionCreateFlagBitsKHR}.",

        "VIDEO_SESSION_CREATE_ALLOW_ENCODE_PARAMETER_OPTIMIZATIONS_BIT_KHR".enum(0x00000002)
    )

    EnumConstant(
        "Extends {@code VkImageLayout}.",

        "IMAGE_LAYOUT_VIDEO_ENCODE_DST_KHR".."1000299000",
        "IMAGE_LAYOUT_VIDEO_ENCODE_SRC_KHR".."1000299001",
        "IMAGE_LAYOUT_VIDEO_ENCODE_DPB_KHR".."1000299002"
    )

    EnumConstant(
        "Extends {@code VkQueryType}.",

        "QUERY_TYPE_VIDEO_ENCODE_FEEDBACK_KHR".."1000299000"
    )

    EnumConstant(
        "Extends {@code VkQueryResultStatusKHR}.",

        "QUERY_RESULT_STATUS_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_KHR".."-1000299000"
    )

    EnumConstant(
        "Extends {@code VkResult}.",

        "ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR".."-1000299000"
    )

    EnumConstantLong(
        "Extends {@code VkFormatFeatureFlagBits2}.",

        "FORMAT_FEATURE_2_VIDEO_ENCODE_INPUT_BIT_KHR".enum(0x08000000L),
        "FORMAT_FEATURE_2_VIDEO_ENCODE_DPB_BIT_KHR".enum(0x10000000L)
    )

    EnumConstant(
        """
        VkVideoEncodeCapabilityFlagBitsKHR - Video encode capability flags

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_CAPABILITY_PRECEDING_EXTERNALLY_ENCODED_BYTES_BIT_KHR specifies that the implementation supports the use of ##VkVideoEncodeInfoKHR{@code ::precedingExternallyEncodedBytes}.</li>
            <li>
                #VIDEO_ENCODE_CAPABILITY_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_DETECTION_BIT_KHR specifies that the implementation is able to detect and report when the destination video bitstream buffer range provided by the application is not sufficiently large to fit the encoded bitstream data produced by a video encode operation by reporting the #QUERY_RESULT_STATUS_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_KHR <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#query-result-status-codes">query result status code</a>.
                <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
                Some implementations <b>may</b> not be able to reliably detect insufficient bitstream buffer range conditions in all situations. Such implementations will not report support for the #VIDEO_ENCODE_CAPABILITY_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_DETECTION_BIT_KHR encode capability flag for the video profile, but <b>may</b> still report the #QUERY_RESULT_STATUS_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_KHR query result status code in certain cases. Applications <b>should</b> always check for the specific query result status code #QUERY_RESULT_STATUS_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_KHR even when this encode capability flag is not supported by the implementation for the video profile in question. However, applications <b>must</b> not assume that a different negative query result status code indicating an unsuccessful completion of a video encode operation is not the result of an insufficient bitstream buffer condition unless this encode capability flag is supported.
                </div>
            </li>
        </ul>
        """,

        "VIDEO_ENCODE_CAPABILITY_PRECEDING_EXTERNALLY_ENCODED_BYTES_BIT_KHR".enum(0x00000001),
        "VIDEO_ENCODE_CAPABILITY_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_DETECTION_BIT_KHR".enum(0x00000002)
    )

    EnumConstant(
        """
        VkVideoEncodeRateControlModeFlagBitsKHR - Video encode rate control modes

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_RATE_CONTROL_MODE_DEFAULT_KHR specifies the use of implementation-specific rate control.</li>
            <li>
                #VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR specifies that rate control is disabled and the application will specify per-operation rate control parameters controlling the encoding quality. In this mode implementations will encode pictures independently of the output bitrate of prior video encode operations.
                <ul>
                    <li>When using an <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-profile">H.264 encode profile</a>, implementations will use the QP value specified in ##VkVideoEncodeH264NaluSliceInfoKHR{@code ::constantQp} to control the quality of the encoded picture.</li>
                    <li>When using an <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h265-profile">H.265 encode profile</a>, implementations will use the QP value specified in ##VkVideoEncodeH265NaluSliceSegmentInfoKHR{@code ::constantQp} to control the quality of the encoded picture.</li>
                    <li>When using an <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-av1-profile">AV1 encode profile</a>, implementations will use the quantizer index value specified in ##VkVideoEncodeAV1PictureInfoKHR{@code ::constantQIndex} to control the quality of the encoded picture.</li>
                </ul>
            </li>
            <li>#VIDEO_ENCODE_RATE_CONTROL_MODE_CBR_BIT_KHR specifies the use of constant bitrate (CBR) rate control mode. In this mode the implementation will attempt to produce the encoded bitstream at a constant bitrate while conforming to the constraints of other rate control parameters.</li>
            <li>#VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR specifies the use of variable bitrate (VBR) rate control mode. In this mode the implementation will produce the encoded bitstream at a variable bitrate according to the constraints of other rate control parameters.</li>
        </ul>

        <h5>See Also</h5>
        ##VkVideoEncodeQualityLevelPropertiesKHR, ##VkVideoEncodeRateControlInfoKHR
        """,

        "VIDEO_ENCODE_RATE_CONTROL_MODE_DEFAULT_KHR".."0",
        "VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR".enum(0x00000001),
        "VIDEO_ENCODE_RATE_CONTROL_MODE_CBR_BIT_KHR".enum(0x00000002),
        "VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR".enum(0x00000004)
    )

    EnumConstant(
        """
        VkVideoEncodeFeedbackFlagBitsKHR - Bits specifying queried video encode feedback values

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_FEEDBACK_BITSTREAM_BUFFER_OFFSET_BIT_KHR specifies that queries managed by the pool will capture the byte offset of the bitstream data written by the video encode operation to the bitstream buffer specified in ##VkVideoEncodeInfoKHR{@code ::dstBuffer} relative to the offset specified in ##VkVideoEncodeInfoKHR{@code ::dstBufferOffset}. For the first video encode operation issued by any <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#video-encode-commands">video encode command</a>, this value will always be zero, meaning that bitstream data is always written to the buffer specified in ##VkVideoEncodeInfoKHR{@code ::dstBuffer} starting from the offset specified in ##VkVideoEncodeInfoKHR{@code ::dstBufferOffset}.</li>
            <li>#VIDEO_ENCODE_FEEDBACK_BITSTREAM_BYTES_WRITTEN_BIT_KHR specifies that queries managed by the pool will capture the number of bytes written by the video encode operation to the bitstream buffer specified in ##VkVideoEncodeInfoKHR{@code ::dstBuffer}.</li>
            <li>#VIDEO_ENCODE_FEEDBACK_BITSTREAM_HAS_OVERRIDES_BIT_KHR specifies that queries managed by the pool will capture a boolean value indicating that the data written to the bitstream buffer specified in ##VkVideoEncodeInfoKHR{@code ::dstBuffer} contains <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-overrides">overridden parameters</a>.</li>
        </ul>

        When retrieving the results of video encode feedback queries, the values corresponding to each enabled video encode feedback are written in the order of the bits defined above, followed by an optional value indicating availability or result status if #QUERY_RESULT_WITH_AVAILABILITY_BIT or #QUERY_RESULT_WITH_STATUS_BIT_KHR is specified, respectively.

        If the result status of a video encode feedback query is negative, then the results of all enabled video encode feedback values will be undefined.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Applications should always specify #QUERY_RESULT_WITH_STATUS_BIT_KHR when retrieving the results of video encode feedback queries and ignore such undefined video encode feedback values for any <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-unsuccessful">unsuccessfully</a> completed video encode operations.
        </div>
        """,

        "VIDEO_ENCODE_FEEDBACK_BITSTREAM_BUFFER_OFFSET_BIT_KHR".enum(0x00000001),
        "VIDEO_ENCODE_FEEDBACK_BITSTREAM_BYTES_WRITTEN_BIT_KHR".enum(0x00000002),
        "VIDEO_ENCODE_FEEDBACK_BITSTREAM_HAS_OVERRIDES_BIT_KHR".enum(0x00000004)
    )

    EnumConstant(
        """
        VkVideoEncodeUsageFlagBitsKHR - Video encode usage flags

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_USAGE_TRANSCODING_BIT_KHR specifies that video encoding is intended to be used in conjunction with video decoding to transcode a video bitstream with the same and/or different codecs.</li>
            <li>#VIDEO_ENCODE_USAGE_STREAMING_BIT_KHR specifies that video encoding is intended to be used to produce a video bitstream that is expected to be sent as a continuous flow over network.</li>
            <li>#VIDEO_ENCODE_USAGE_RECORDING_BIT_KHR specifies that video encoding is intended to be used for real-time recording for offline consumption.</li>
            <li>#VIDEO_ENCODE_USAGE_CONFERENCING_BIT_KHR specifies that video encoding is intended to be used in a video conferencing scenario.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        There are no restrictions on the combination of bits that <b>can</b> be specified by the application. However, applications <b>should</b> use reasonable combinations in order for the implementation to be able to select the most appropriate mode of operation for the particular use case.
        </div>
        """,

        "VIDEO_ENCODE_USAGE_DEFAULT_KHR".."0",
        "VIDEO_ENCODE_USAGE_TRANSCODING_BIT_KHR".enum(0x00000001),
        "VIDEO_ENCODE_USAGE_STREAMING_BIT_KHR".enum(0x00000002),
        "VIDEO_ENCODE_USAGE_RECORDING_BIT_KHR".enum(0x00000004),
        "VIDEO_ENCODE_USAGE_CONFERENCING_BIT_KHR".enum(0x00000008)
    )

    EnumConstant(
        """
        VkVideoEncodeContentFlagBitsKHR - Video encode content flags

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_CONTENT_CAMERA_BIT_KHR specifies that video encoding is intended to be used to encode camera content.</li>
            <li>#VIDEO_ENCODE_CONTENT_DESKTOP_BIT_KHR specifies that video encoding is intended to be used to encode desktop content.</li>
            <li>#VIDEO_ENCODE_CONTENT_RENDERED_BIT_KHR specified that video encoding is intended to be used to encode rendered (e.g. game) content.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        There are no restrictions on the combination of bits that <b>can</b> be specified by the application. However, applications <b>should</b> use reasonable combinations in order for the implementation to be able to select the most appropriate mode of operation for the particular content type.
        </div>
        """,

        "VIDEO_ENCODE_CONTENT_DEFAULT_KHR".."0",
        "VIDEO_ENCODE_CONTENT_CAMERA_BIT_KHR".enum(0x00000001),
        "VIDEO_ENCODE_CONTENT_DESKTOP_BIT_KHR".enum(0x00000002),
        "VIDEO_ENCODE_CONTENT_RENDERED_BIT_KHR".enum(0x00000004)
    )

    EnumConstant(
        """
        VkVideoEncodeTuningModeKHR - Video encode tuning mode

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_TUNING_MODE_DEFAULT_KHR specifies the default tuning mode.</li>
            <li>#VIDEO_ENCODE_TUNING_MODE_HIGH_QUALITY_KHR specifies that video encoding is tuned for high quality. When using this tuning mode, the implementation <b>may</b> compromise the latency of video encoding operations to improve quality.</li>
            <li>#VIDEO_ENCODE_TUNING_MODE_LOW_LATENCY_KHR specifies that video encoding is tuned for low latency. When using this tuning mode, the implementation <b>may</b> compromise quality to increase the performance and lower the latency of video encode operations.</li>
            <li>#VIDEO_ENCODE_TUNING_MODE_ULTRA_LOW_LATENCY_KHR specifies that video encoding is tuned for ultra-low latency. When using this tuning mode, the implementation <b>may</b> compromise quality to maximize the performance and minimize the latency of video encoding operations.</li>
            <li>#VIDEO_ENCODE_TUNING_MODE_LOSSLESS_KHR specifies that video encoding is tuned for lossless encoding. When using this tuning mode, video encode operations produce lossless output.</li>
        </ul>

        <h5>See Also</h5>
        ##VkVideoEncodeUsageInfoKHR
        """,

        "VIDEO_ENCODE_TUNING_MODE_DEFAULT_KHR".."0",
        "VIDEO_ENCODE_TUNING_MODE_HIGH_QUALITY_KHR".."1",
        "VIDEO_ENCODE_TUNING_MODE_LOW_LATENCY_KHR".."2",
        "VIDEO_ENCODE_TUNING_MODE_ULTRA_LOW_LATENCY_KHR".."3",
        "VIDEO_ENCODE_TUNING_MODE_LOSSLESS_KHR".."4"
    )

    VkResult(
        "GetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR",
        """
        Query video encode quality level properties.

        <h5>C Specification</h5>
        To query properties for a specific video encode quality level supported by a video encode profile, call:

        <pre><code>
￿VkResult vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR* pQualityLevelInfo,
￿    VkVideoEncodeQualityLevelPropertiesKHR*     pQualityLevelProperties);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code pQualityLevelInfo→pVideoProfile→videoCodecOperation} is #VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR, then the {@code pNext} chain of {@code pQualityLevelProperties} <b>must</b> include a ##VkVideoEncodeH264QualityLevelPropertiesKHR structure</li>
            <li>If {@code pQualityLevelInfo→pVideoProfile→videoCodecOperation} is #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR, then the {@code pNext} chain of {@code pQualityLevelProperties} <b>must</b> include a ##VkVideoEncodeH265QualityLevelPropertiesKHR structure</li>
            <li>If {@code pQualityLevelInfo→pVideoProfile→videoCodecOperation} is #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR, then the {@code pNext} chain of {@code pQualityLevelProperties} <b>must</b> include a ##VkVideoEncodeAV1QualityLevelPropertiesKHR structure</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pQualityLevelInfo} <b>must</b> be a valid pointer to a valid ##VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR structure</li>
            <li>{@code pQualityLevelProperties} <b>must</b> be a valid pointer to a ##VkVideoEncodeQualityLevelPropertiesKHR structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_VIDEO_PROFILE_OPERATION_NOT_SUPPORTED_KHR</li>
                <li>#ERROR_VIDEO_PROFILE_FORMAT_NOT_SUPPORTED_KHR</li>
                <li>#ERROR_VIDEO_PICTURE_LAYOUT_NOT_SUPPORTED_KHR</li>
                <li>#ERROR_VIDEO_PROFILE_CODEC_NOT_SUPPORTED_KHR</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR, ##VkVideoEncodeQualityLevelPropertiesKHR
        """,

        VkPhysicalDevice("physicalDevice", "the physical device to query the video encode quality level properties for."),
        VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.const.p("pQualityLevelInfo", "a pointer to a ##VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR structure specifying the video encode profile and quality level to query properties for."),
        VkVideoEncodeQualityLevelPropertiesKHR.p("pQualityLevelProperties", "a pointer to a ##VkVideoEncodeQualityLevelPropertiesKHR structure in which the properties are returned.")
    )

    VkResult(
        "GetEncodedVideoSessionParametersKHR",
        """
        Get encoded parameter sets from a video session parameters object.

        <h5>C Specification</h5>
        Encoded parameter data <b>can</b> be retrieved from a video session parameters object created with a video encode operation using the command:

        <pre><code>
￿VkResult vkGetEncodedVideoSessionParametersKHR(
￿    VkDevice                                    device,
￿    const VkVideoEncodeSessionParametersGetInfoKHR* pVideoSessionParametersInfo,
￿    VkVideoEncodeSessionParametersFeedbackInfoKHR* pFeedbackInfo,
￿    size_t*                                     pDataSize,
￿    void*                                       pData);</code></pre>

        <h5>Description</h5>
        If {@code pData} is {@code NULL}, then the size of the encoded parameter data, in bytes, that <b>can</b> be retrieved is returned in {@code pDataSize}. Otherwise, {@code pDataSize} <b>must</b> point to a variable set by the application to the size of the buffer, in bytes, pointed to by {@code pData}, and on return the variable is overwritten with the number of bytes actually written to {@code pData}. If {@code pDataSize} is less than the size of the encoded parameter data that <b>can</b> be retrieved, then no data will be written to {@code pData}, zero will be written to {@code pDataSize}, and #INCOMPLETE will be returned instead of #SUCCESS, to indicate that no encoded parameter data was returned.

        If {@code pFeedbackInfo} is not {@code NULL} then the members of the ##VkVideoEncodeSessionParametersFeedbackInfoKHR structure and any additional structures included in its {@code pNext} chain that are applicable to the video session parameters object specified in {@code pVideoSessionParametersInfo→videoSessionParameters} will be filled with feedback about the requested parameter data on all successful calls to this command.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        This includes the cases when {@code pData} is {@code NULL} or when #INCOMPLETE is returned by the command, and enables the application to determine whether the implementation <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-overrides">overrode</a> any of the requested video session parameters without actually needing to retrieve the encoded parameter data itself.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code pVideoSessionParametersInfo→videoSessionParameters} <b>must</b> have been created with an encode operation</li>
            <li>If {@code pVideoSessionParametersInfo→videoSessionParameters} was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR, then the {@code pNext} chain of {@code pVideoSessionParametersInfo} <b>must</b> include a ##VkVideoEncodeH264SessionParametersGetInfoKHR structure</li>
            <li>If {@code pVideoSessionParametersInfo→videoSessionParameters} was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR, then for the ##VkVideoEncodeH264SessionParametersGetInfoKHR structure included in the {@code pNext} chain of {@code pVideoSessionParametersInfo}, if its {@code writeStdSPS} member is #TRUE, then {@code pVideoSessionParametersInfo→videoSessionParameters} <b>must</b> contain a {@code StdVideoH264SequenceParameterSet} entry with {@code seq_parameter_set_id} matching ##VkVideoEncodeH264SessionParametersGetInfoKHR{@code ::stdSPSId}</li>
            <li>If {@code pVideoSessionParametersInfo→videoSessionParameters} was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR, then for the ##VkVideoEncodeH264SessionParametersGetInfoKHR structure included in the {@code pNext} chain of {@code pVideoSessionParametersInfo}, if its {@code writeStdPPS} member is #TRUE, then {@code pVideoSessionParametersInfo→videoSessionParameters} <b>must</b> contain a {@code StdVideoH264PictureParameterSet} entry with {@code seq_parameter_set_id} and {@code pic_parameter_set_id} matching ##VkVideoEncodeH264SessionParametersGetInfoKHR{@code ::stdSPSId} and ##VkVideoEncodeH264SessionParametersGetInfoKHR{@code ::stdPPSId}, respectively</li>
            <li>If {@code pVideoSessionParametersInfo→videoSessionParameters} was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR, then the {@code pNext} chain of {@code pVideoSessionParametersInfo} <b>must</b> include a ##VkVideoEncodeH265SessionParametersGetInfoKHR structure</li>
            <li>If {@code pVideoSessionParametersInfo→videoSessionParameters} was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR, then for the ##VkVideoEncodeH265SessionParametersGetInfoKHR structure included in the {@code pNext} chain of {@code pVideoSessionParametersInfo}, if its {@code writeStdVPS} member is #TRUE, then {@code pVideoSessionParametersInfo→videoSessionParameters} <b>must</b> contain a {@code StdVideoH265VideoParameterSet} entry with {@code vps_video_parameter_set_id} matching ##VkVideoEncodeH265SessionParametersGetInfoKHR{@code ::stdVPSId}</li>
            <li>If {@code pVideoSessionParametersInfo→videoSessionParameters} was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR, then for the ##VkVideoEncodeH265SessionParametersGetInfoKHR structure included in the {@code pNext} chain of {@code pVideoSessionParametersInfo}, if its {@code writeStdSPS} member is #TRUE, then {@code pVideoSessionParametersInfo→videoSessionParameters} <b>must</b> contain a {@code StdVideoH265SequenceParameterSet} entry with {@code sps_video_parameter_set_id} and {@code sps_seq_parameter_set_id} matching ##VkVideoEncodeH265SessionParametersGetInfoKHR{@code ::stdVPSId} and ##VkVideoEncodeH265SessionParametersGetInfoKHR{@code ::stdSPSId}, respectively</li>
            <li>If {@code pVideoSessionParametersInfo→videoSessionParameters} was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR, then for the ##VkVideoEncodeH265SessionParametersGetInfoKHR structure included in the {@code pNext} chain of {@code pVideoSessionParametersInfo}, if its {@code writeStdPPS} member is #TRUE, then {@code pVideoSessionParametersInfo→videoSessionParameters} <b>must</b> contain a {@code StdVideoH265PictureParameterSet} entry with {@code sps_video_parameter_set_id}, {@code pps_seq_parameter_set_id}, and {@code pps_pic_parameter_set_id} matching ##VkVideoEncodeH265SessionParametersGetInfoKHR{@code ::stdVPSId}, ##VkVideoEncodeH265SessionParametersGetInfoKHR{@code ::stdSPSId}, and ##VkVideoEncodeH265SessionParametersGetInfoKHR{@code ::stdPPSId}, respectively</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pVideoSessionParametersInfo} <b>must</b> be a valid pointer to a valid ##VkVideoEncodeSessionParametersGetInfoKHR structure</li>
            <li>If {@code pFeedbackInfo} is not {@code NULL}, {@code pFeedbackInfo} <b>must</b> be a valid pointer to a ##VkVideoEncodeSessionParametersFeedbackInfoKHR structure</li>
            <li>{@code pDataSize} <b>must</b> be a valid pointer to a {@code size_t} value</li>
            <li>If the value referenced by {@code pDataSize} is not 0, and {@code pData} is not {@code NULL}, {@code pData} <b>must</b> be a valid pointer to an array of {@code pDataSize} bytes</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkVideoEncodeSessionParametersFeedbackInfoKHR, ##VkVideoEncodeSessionParametersGetInfoKHR
        """,

        VkDevice("device", "the logical device that owns the video session parameters object."),
        VkVideoEncodeSessionParametersGetInfoKHR.const.p("pVideoSessionParametersInfo", "a pointer to a ##VkVideoEncodeSessionParametersGetInfoKHR structure specifying the parameters of the encoded parameter data to retrieve."),
        nullable..VkVideoEncodeSessionParametersFeedbackInfoKHR.p("pFeedbackInfo", "either {@code NULL} or a pointer to a ##VkVideoEncodeSessionParametersFeedbackInfoKHR structure in which feedback about the requested parameter data is returned."),
        AutoSize("pData")..Check(1)..size_t.p("pDataSize", "a pointer to a {@code size_t} value related to the amount of encode parameter data returned, as described below."),
        nullable..void.p("pData", "either {@code NULL} or a pointer to a buffer to write the encoded parameter data to.")
    )

    void(
        "CmdEncodeVideoKHR",
        """
        Launch video encode operations.

        <h5>C Specification</h5>
        To launch video encode operations, call:

        <pre><code>
￿void vkCmdEncodeVideoKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkVideoEncodeInfoKHR*                 pEncodeInfo);</code></pre>

        <h5>Description</h5>
        Each call issues one or more video encode operations. The implicit parameter {@code opCount} corresponds to the number of video encode operations issued by the command. After calling this command, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#queries-operation-active-query-index">active query index</a> of each <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#queries-operation-active">active</a> query is incremented by {@code opCount}.

        Currently each call to this command results in the issue of a single video encode operation.

        If the bound video session was created with #VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR and the {@code pNext} chain of {@code pEncodeInfo} includes a ##VkVideoInlineQueryInfoKHR structure with its {@code queryPool} member specifying a valid {@code VkQueryPool} handle, then this command will execute a query for each video encode operation issued by it.

        <dl>
            <dt>Active Reference Picture Information</dt>
            <dd><ul>
                <li>The image subregion within the image subresource <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#video-image-subresource-reference">referred</a> to by the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#video-picture-resources">video picture resource</a> used as the reference picture.</li>
                <li>The <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#dpb-slot">DPB slot</a> index the reference picture is associated with.</li>
                <li>The codec-specific reference information related to the reference picture.</li>
            </ul></dd>
        </dl>

        <dl>
            <dt>Reconstructed Picture Information</dt>
            <dd><ul>
                <li>The image subregion within the image subresource <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#video-image-subresource-reference">referred</a> to by the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#video-picture-resources">video picture resource</a> used as the reconstructed picture.</li>
                <li>The <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#dpb-slot">DPB slot</a> index to use for picture reconstruction.</li>
                <li>The codec-specific reference information related to the reconstructed picture.</li>
            </ul></dd>
        </dl>

        Specifying a valid ##VkVideoReferenceSlotInfoKHR structure in {@code pEncodeInfo→pSetupReferenceSlot} is always required, unless the video session was created with ##VkVideoSessionCreateInfoKHR{@code ::maxDpbSlot} equal to zero. However, the DPB slot identified by {@code pEncodeInfo→pSetupReferenceSlot→slotIndex} is only <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#dpb-slot-states">activated</a> with the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#reconstructed-picture">reconstructed picture</a> specified in {@code pEncodeInfo→pSetupReferenceSlot→pPictureResource} if reference picture setup is requested according to the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-codec-specific-semantics">codec-specific semantics</a>.

        If reconstructed picture information is specified, but reference picture setup is not requested, according to the codec-specific semantics, the contents of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#video-picture-resources">video picture resource</a> corresponding to the reconstructed picture will be undefined after the video encode operation.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Some implementations may always output the reconstructed picture or use it as temporary storage during the video encode operation even when the reconstructed picture is not marked for future reference.
        </div>

        <dl>
            <dt>Encode Input Picture Information</dt>
            <dd><ul>
                <li>The image subregion within the image subresource <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#video-image-subresource-reference">referred</a> to by the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#video-picture-resources">video picture resource</a> used as the encode input picture.</li>
                <li>The codec-specific picture information related to the encoded picture.</li>
            </ul></dd>
        </dl>

        Several limiting values are defined below that are referenced by the relevant valid usage statements of this command.

        <ul>
            <li>Let {@code uint32_t activeReferencePictureCount} be the size of the list of active reference pictures used by the video encode operation. Unless otherwise defined, {@code activeReferencePictureCount} is set to the value of {@code pEncodeInfo→referenceSlotCount}.</li>
            <li>Let {@code VkOffset2D codedOffsetGranularity} be the minimum alignment requirement for the coded offset of video picture resources. Unless otherwise defined, the value of the {@code x} and {@code y} members of {@code codedOffsetGranularity} are 0.</li>
            <li>
                Let {@code uint32_t dpbFrameUseCount[]} be an array of size {@code maxDpbSlots}, where {@code maxDpbSlots} is the ##VkVideoSessionCreateInfoKHR{@code ::maxDpbSlots} the bound video session was created with, with each element indicating the number of times a frame associated with the corresponding DPB slot index is referred to by the video coding operation. Let the initial value of each element of the array be 0.
                <ul>
                    <li>If {@code pEncodeInfo→pSetupReferenceSlot} is not {@code NULL}, then {@code dpbFrameUseCount[i]} is incremented by one, where {@code i} equals {@code pEncodeInfo→pSetupReferenceSlot→slotIndex}.</li>
                    <li>For each element of {@code pEncodeInfo→pReferenceSlots}, {@code dpbFrameUseCount[i]} is incremented by one, where {@code i} equals the {@code slotIndex} member of the corresponding element.</li>
                </ul>
            </li>
            <li>If there is a bound video session parameters object created with #VIDEO_SESSION_PARAMETERS_CREATE_QUANTIZATION_MAP_COMPATIBLE_BIT_KHR, then let {@code VkExtent2D quantizationMapTexelSize} be the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-quantization-map-texel-size">quantization map texel size</a> the bound video session parameters object was created with.</li>
            <li>
                Let {@code VkExtent2D maxCodingBlockSize} be the maximum codec-specific coding block size that <b>may</b> be used by the video encode operation.
                <ul>
                    <li>If the bound video session object was created with an <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-profile">H.264 encode profile</a>, then let {@code maxCodingBlockSize} be equal to the size of an H.264 macroblock, i.e. {@code {16,16}}.</li>
                    <li>If the bound video session object was created with an <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h265-profile">H.265 encode profile</a>, then let {@code maxCodingBlockSize} be equal to the maximum H.265 coding block size that <b>may</b> be used by the video encode operation derived as the maximum of the CTB sizes corresponding to the {@code VkVideoEncodeH265CtbSizeFlagBitsKHR} bits set in ##VkVideoEncodeH265CapabilitiesKHR{@code ::ctbSizes}, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with.</li>
                    <li>If the bound video session object was created with an <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-av1-profile">AV1 encode profile</a>, then let {@code maxCodingBlockSize} be equal to the maximum AV1 superblock size that <b>may</b> be used by the video encode operation derived as the maximum of the superblock sizes corresponding to the {@code VkVideoEncodeAV1SuperblockSizeFlagBitsKHR} bits set in ##VkVideoEncodeAV1CapabilitiesKHR{@code ::superblockSizes}, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with.</li>
                    <li>Otherwise, {@code maxCodingBlockSize} is undefined.</li>
                </ul>
            </li>
            <li>
                If {@code maxCodingBlockSize} is defined, then let {@code VkExtent2D minCodingBlockExtent} be the coded extent of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-input-picture">encode input picture</a> expressed in terms of codec-specific coding blocks, assuming the maximum size of such coding blocks, as defined by {@code maxCodingBlockSize}, calculated from the value of the {@code codedExtent} member of {@code pEncodeInfo→srcPictureResource} as follows:
                <ul>
                    <li><code>minCodingBlockExtent.width = (codedExtent.width maxCodingBlockSize.width - 1) / maxCodingBlockSize.width</code></li>
                    <li><code>minCodingBlockExtent.height = (codedExtent.height maxCodingBlockSize.height - 1) / maxCodingBlockSize.height</code></li>
                </ul>
            </li>
            <li>
                If the bound video session object was created with an <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-profile">H.264 encode profile</a>, then:
                <ul>
                    <li>Let {@code StdVideoH264PictureType h264PictureType} be the picture type of the encoded picture set to the value of {@code pStdPictureInfo→primary_pic_type} specified in the ##VkVideoEncodeH264PictureInfoKHR structure included in the {@code pEncodeInfo→pNext} chain.</li>
                    <li>Let {@code StdVideoH264PictureType h264L0PictureTypes[]} and {@code StdVideoH264PictureType h264L1PictureTypes[]} be the picture types of the reference pictures in the L0 and L1 reference lists, respectively. If {@code pStdPictureInfo→pRefLists} specified in the ##VkVideoEncodeH264PictureInfoKHR structure included in the {@code pEncodeInfo→pNext} chain is not {@code NULL}, then for each reference index specified in the elements of the {@code pStdPictureInfo→pRefLists→RefPicList0} and {@code pStdPictureInfo→pRefLists→RefPicList1} arrays, if the reference index is not {@code STD_VIDEO_H264_NO_REFERENCE_PICTURE}, {@code pStdReferenceInfo→primary_pic_type} is added to {@code h264L0PictureTypes} or {@code h264L1PictureTypes}, respectively, where {@code pStdReferenceInfo} is the member of the ##VkVideoEncodeH264DpbSlotInfoKHR structure included in the {@code pNext} chain of the element of {@code pEncodeInfo→pReferenceSlots} for which {@code slotIndex} equals the reference index in question.</li>
                </ul>
            </li>
            <li>
                If the bound video session object was created with an <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-profile">H.265 encode profile</a>, then:
                <ul>
                    <li>Let {@code StdVideoH265PictureType h265PictureType} be the picture type of the encoded picture set to the value of {@code pStdPictureInfo→pic_type} specified in the ##VkVideoEncodeH265PictureInfoKHR structure included in the {@code pEncodeInfo→pNext} chain.</li>
                    <li>Let {@code StdVideoH265PictureType h265L0PictureTypes[]} and {@code StdVideoH265PictureType h265L1PictureTypes[]} be the picture types of the reference pictures in the L0 and L1 reference lists, respectively. If {@code pStdPictureInfo→pRefLists} specified in the ##VkVideoEncodeH265PictureInfoKHR structure included in the {@code pEncodeInfo→pNext} chain is not {@code NULL}, then for each reference index specified in the elements of the {@code pStdPictureInfo→pRefLists→RefPicList0} and {@code pStdPictureInfo→pRefLists→RefPicList1} arrays, if the reference index is not {@code STD_VIDEO_H265_NO_REFERENCE_PICTURE}, {@code pStdReferenceInfo→pic_type} is added to {@code h265L0PictureTypes} or {@code h265L1PictureTypes}, respectively, where {@code pStdReferenceInfo} is the member of the ##VkVideoEncodeH265DpbSlotInfoKHR structure included in the {@code pNext} chain of the element of {@code pEncodeInfo→pReferenceSlots} for which {@code slotIndex} equals the reference index in question.</li>
                </ul>
            </li>
            <li>
                If the bound video session object was created with an <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-av1-profile">AV1 encode profile</a>, then:
                <ul>
                    <li>If the {@code primaryReferenceCdfOnly} member of the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pEncodeInfo→pNext} chain is set to #TRUE, then let {@code int32_t cdfOnlyReferenceIndex} be the value of ##VkVideoEncodeAV1PictureInfoKHR{@code ::pStdPictureInfo→primary_ref_frame}.</li>
                    <li>Otherwise let {@code int32_t cdfOnlyReferenceIndex} be {@code -1}.</li>
                </ul>
            </li>
        </ul>

        <h5>Valid Usage</h5>
        <ul>
            <li>The bound video session <b>must</b> have been created with an encode operation</li>
            <li>The bound video session <b>must</b> not be in <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#video-session-uninitialized">uninitialized</a> state at the time the command is executed on the device</li>
            <li>The bound video session parameters object <b>must</b> have been created with the currently set <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-quality-level">video encode quality level</a> for the bound video session at the time the command is executed on the device</li>
            <li>For each <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#queries-operation-active">active</a> query, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#queries-operation-active-query-index">active query index</a> corresponding to the query type of that query plus {@code opCount} <b>must</b> be less than or equal to the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#queries-operation-last-activatable-query-index">last activatable query index</a> corresponding to the query type of that query plus one</li>
            <li>If the bound video session was created with #VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR, and the {@code pNext} chain of {@code pEncodeInfo} includes a ##VkVideoInlineQueryInfoKHR structure with its {@code queryPool} member specifying a valid {@code VkQueryPool} handle, then ##VkVideoInlineQueryInfoKHR::queryCount <b>must</b> equal {@code opCount}</li>
            <li>If the bound video session was created with #VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR, and the {@code pNext} chain of {@code pEncodeInfo} includes a ##VkVideoInlineQueryInfoKHR structure with its {@code queryPool} member specifying a valid {@code VkQueryPool} handle, then all the queries used by the command, as specified by the ##VkVideoInlineQueryInfoKHR structure, <b>must</b> be <em>unavailable</em></li>
            <li>If the bound video session was created with #VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR, then the {@code queryType} used to create the {@code queryPool} specified in the ##VkVideoInlineQueryInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> be #QUERY_TYPE_RESULT_STATUS_ONLY_KHR or #QUERY_TYPE_VIDEO_ENCODE_FEEDBACK_KHR</li>
            <li>If the bound video session was created with #VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR, then the {@code queryPool} specified in the ##VkVideoInlineQueryInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> have been created with a ##VkVideoProfileInfoKHR structure included in the {@code pNext} chain of ##VkQueryPoolCreateInfo identical to the one specified in ##VkVideoSessionCreateInfoKHR{@code ::pVideoProfile} the bound video session was created with</li>
            <li>If the bound video session was created with #VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR, and the {@code queryType} used to create the {@code queryPool} specified in the ##VkVideoInlineQueryInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} is #QUERY_TYPE_RESULT_STATUS_ONLY_KHR, then the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> have been created with a queue family index that supports <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#queries-result-status-only">result status queries</a>, as indicated by ##VkQueueFamilyQueryResultStatusPropertiesKHR{@code ::queryResultStatusSupport}</li>
            <li>{@code pEncodeInfo→dstBuffer} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#video-profile-compatibility">compatible</a> with the video profile the bound video session was created with</li>
            <li>If {@code commandBuffer} is an unprotected command buffer and <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, then {@code pEncodeInfo→dstBuffer} <b>must</b> not be a protected buffer</li>
            <li>If {@code commandBuffer} is a protected command buffer and <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, then {@code pEncodeInfo→dstBuffer} <b>must</b> be a protected buffer</li>
            <li>{@code pEncodeInfo→dstBufferOffset} <b>must</b> be an integer multiple of ##VkVideoCapabilitiesKHR{@code ::minBitstreamBufferOffsetAlignment}, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with</li>
            <li>{@code pEncodeInfo→dstBufferRange} <b>must</b> be an integer multiple of ##VkVideoCapabilitiesKHR{@code ::minBitstreamBufferSizeAlignment}, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with</li>
            <li>{@code pEncodeInfo→srcPictureResource.imageViewBinding} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#video-profile-compatibility">compatible</a> with the video profile the bound video session was created with</li>
            <li>The format of {@code pEncodeInfo→srcPictureResource.imageViewBinding} <b>must</b> match the ##VkVideoSessionCreateInfoKHR{@code ::pictureFormat} the bound video session was created with</li>
            <li>{@code pEncodeInfo→srcPictureResource.codedOffset} <b>must</b> be an integer multiple of {@code codedOffsetGranularity}</li>
            <li>{@code pEncodeInfo→srcPictureResource.codedExtent} <b>must</b> be between {@code minCodedExtent} and {@code maxCodedExtent}, inclusive, the bound video session was created with</li>
            <li>{@code pEncodeInfo→srcPictureResource.imageViewBinding} <b>must</b> have been created with #IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR</li>
            <li>If {@code commandBuffer} is an unprotected command buffer and <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, then {@code pEncodeInfo→srcPictureResource.imageViewBinding} <b>must</b> not have been created from a protected image</li>
            <li>{@code pEncodeInfo→pSetupReferenceSlot} <b>must</b> not be {@code NULL} unless the bound video session was created with ##VkVideoSessionCreateInfoKHR{@code ::maxDpbSlots} equal to zero</li>
            <li>If {@code pEncodeInfo→pSetupReferenceSlot} is not {@code NULL}, then {@code pEncodeInfo→pSetupReferenceSlot→slotIndex} <b>must</b> be less than the ##VkVideoSessionCreateInfoKHR{@code ::maxDpbSlots} specified when the bound video session was created</li>
            <li>If {@code pEncodeInfo→pSetupReferenceSlot} is not {@code NULL}, then {@code pEncodeInfo→pSetupReferenceSlot→pPictureResource→codedOffset} <b>must</b> be an integer multiple of {@code codedOffsetGranularity}</li>
            <li>If {@code pEncodeInfo→pSetupReferenceSlot} is not {@code NULL}, then {@code pEncodeInfo→pSetupReferenceSlot→pPictureResource} <b>must</b> <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#video-picture-resource-matching">match</a> one of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#bound-reference-picture-resources">bound reference picture resource</a></li>
            <li>{@code activeReferencePictureCount} <b>must</b> be less than or equal to the ##VkVideoSessionCreateInfoKHR{@code ::maxActiveReferencePictures} specified when the bound video session was created</li>
            <li>The {@code slotIndex} member of each element of {@code pEncodeInfo→pReferenceSlots} <b>must</b> be less than the ##VkVideoSessionCreateInfoKHR{@code ::maxDpbSlots} specified when the bound video session was created</li>
            <li>The {@code codedOffset} member of the ##VkVideoPictureResourceInfoKHR structure pointed to by the {@code pPictureResource} member of each element of {@code pEncodeInfo→pReferenceSlots} <b>must</b> be an integer multiple of {@code codedOffsetGranularity}</li>
            <li>The {@code pPictureResource} member of each element of {@code pEncodeInfo→pReferenceSlots} <b>must</b> <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#video-picture-resource-matching">match</a> one of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#bound-reference-picture-resources">bound reference picture resource</a> associated with the DPB slot index specified in the {@code slotIndex} member of that element</li>
            <li>Each video picture resource corresponding to the {@code pPictureResource} member specified in the elements of {@code pEncodeInfo→pReferenceSlots} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#video-picture-resource-uniqueness">unique</a> within {@code pEncodeInfo→pReferenceSlots}</li>
            <li>All elements of {@code dpbFrameUseCount} <b>must</b> be less than or equal to 1</li>
            <li>The image subresource <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#video-image-subresource-reference">referred</a> to by {@code pEncodeInfo→srcPictureResource} <b>must</b> be in the #IMAGE_LAYOUT_VIDEO_ENCODE_SRC_KHR layout at the time the video encode operation is executed on the device</li>
            <li>If {@code pEncodeInfo→pSetupReferenceSlot} is not {@code NULL}, then the image subresource <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#video-image-subresource-reference">referred</a> to by {@code pEncodeInfo→pSetupReferenceSlot→pPictureResource} <b>must</b> be in the #IMAGE_LAYOUT_VIDEO_ENCODE_DPB_KHR layout at the time the video encode operation is executed on the device</li>
            <li>The image subresource <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#video-image-subresource-reference">referred</a> to by the {@code pPictureResource} member of each element of {@code pEncodeInfo→pReferenceSlots} <b>must</b> be in the #IMAGE_LAYOUT_VIDEO_ENCODE_DPB_KHR layout at the time the video encode operation is executed on the device</li>
            <li>If {@code pEncodeInfo→flags} includes #VIDEO_ENCODE_WITH_QUANTIZATION_DELTA_MAP_BIT_KHR, then the bound video session <b>must</b> have been created with #VIDEO_SESSION_CREATE_ALLOW_ENCODE_QUANTIZATION_DELTA_MAP_BIT_KHR</li>
            <li>If {@code pEncodeInfo→flags} includes #VIDEO_ENCODE_WITH_EMPHASIS_MAP_BIT_KHR, then the bound video session <b>must</b> have been created with #VIDEO_SESSION_CREATE_ALLOW_ENCODE_EMPHASIS_MAP_BIT_KHR</li>
            <li>If the current <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-rate-control-modes">rate control mode</a> is #VIDEO_ENCODE_RATE_CONTROL_MODE_DEFAULT_KHR or #VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR, then {@code pEncodeInfo→flags} <b>must</b> not include #VIDEO_ENCODE_WITH_EMPHASIS_MAP_BIT_KHR</li>
            <li>If {@code pEncodeInfo→flags} includes #VIDEO_ENCODE_WITH_QUANTIZATION_DELTA_MAP_BIT_KHR or #VIDEO_ENCODE_WITH_EMPHASIS_MAP_BIT_KHR, then the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> include a ##VkVideoEncodeQuantizationMapInfoKHR structure with its {@code quantizationMap} member specifying a valid {@code VkImageView} handle</li>
            <li>If {@code pEncodeInfo→flags} includes #VIDEO_ENCODE_WITH_QUANTIZATION_DELTA_MAP_BIT_KHR or #VIDEO_ENCODE_WITH_EMPHASIS_MAP_BIT_KHR, then the {@code VkImageView} specified by the {@code quantizationMap} member of the ##VkVideoEncodeQuantizationMapInfoKHR structure included in the {@code pNext} chain <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#video-profile-compatibility">compatible</a> with the video profile the bound video session was created with</li>
            <li>If {@code pEncodeInfo→flags} includes #VIDEO_ENCODE_WITH_QUANTIZATION_DELTA_MAP_BIT_KHR, then the {@code VkImageView} specified by the {@code quantizationMap} member of the ##VkVideoEncodeQuantizationMapInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> have been created with #IMAGE_USAGE_VIDEO_ENCODE_QUANTIZATION_DELTA_MAP_BIT_KHR</li>
            <li>If {@code pEncodeInfo→flags} includes #VIDEO_ENCODE_WITH_EMPHASIS_MAP_BIT_KHR, then the {@code VkImageView} specified by the {@code quantizationMap} member of the ##VkVideoEncodeQuantizationMapInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> have been created with #IMAGE_USAGE_VIDEO_ENCODE_EMPHASIS_MAP_BIT_KHR</li>
            <li>If an instance of the ##VkVideoEncodeQuantizationMapInfoKHR structure is included in the {@code pNext} chain of {@code pEncodeInfo}, its {@code quantizationMap} member is not #NULL_HANDLE, {@code commandBuffer} is an unprotected command buffer, and <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, then ##VkVideoEncodeQuantizationMapInfoKHR{@code ::quantizationMap} <b>must</b> not have been created from a protected image</li>
            <li>If an instance of the ##VkVideoEncodeQuantizationMapInfoKHR structure is included in the {@code pNext} chain of {@code pEncodeInfo} and its {@code quantizationMap} member is not #NULL_HANDLE, then the image subresource range referenced by {@code quantizationMap} <b>must</b> be in the #IMAGE_LAYOUT_VIDEO_ENCODE_QUANTIZATION_MAP_KHR layout at the time the video encode operation is executed on the device</li>
            <li>If an instance of the ##VkVideoEncodeQuantizationMapInfoKHR structure is included in the {@code pNext} chain of {@code pEncodeInfo} and its {@code quantizationMap} member is not #NULL_HANDLE, and there is a bound video session parameters object, then the bound video session parameters object <b>must</b> have been created with #VIDEO_SESSION_PARAMETERS_CREATE_QUANTIZATION_MAP_COMPATIBLE_BIT_KHR</li>
            <li>If an instance of the ##VkVideoEncodeQuantizationMapInfoKHR structure is included in the {@code pNext} chain of {@code pEncodeInfo}, its {@code quantizationMap} member is not #NULL_HANDLE, and there is a bound video session parameters object created with #VIDEO_SESSION_PARAMETERS_CREATE_QUANTIZATION_MAP_COMPATIBLE_BIT_KHR, then {@code quantizationMapExtent} <b>must</b> equal <code>⌈pEncodeInfo→srcPictureResource.codedExtent / quantizationMapTexelSize⌉</code></li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR, then the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> include a ##VkVideoEncodeH264PictureInfoKHR structure</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR, then the bound video session parameters object <b>must</b> contain a {@code StdVideoH264SequenceParameterSet} entry with {@code seq_parameter_set_id} matching {@code StdVideoEncodeH264PictureInfo}{@code ::seq_parameter_set_id} that is provided in the {@code pStdPictureInfo} member of the ##VkVideoEncodeH264PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR, then the bound video session parameters object <b>must</b> contain a {@code StdVideoH264PictureParameterSet} entry with {@code seq_parameter_set_id} and {@code pic_parameter_set_id} matching {@code StdVideoEncodeH264PictureInfo}{@code ::seq_parameter_set_id} and {@code StdVideoEncodeH264PictureInfo}{@code ::pic_parameter_set_id}, respectively, that are provided in the {@code pStdPictureInfo} member of the ##VkVideoEncodeH264PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR and {@code pEncodeInfo→pSetupReferenceSlot} is not {@code NULL}, then the {@code pNext} chain of {@code pEncodeInfo→pSetupReferenceSlot} <b>must</b> include a ##VkVideoEncodeH264DpbSlotInfoKHR structure</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR, then the {@code pNext} chain of each element of {@code pEncodeInfo→pReferenceSlots} <b>must</b> include a ##VkVideoEncodeH264DpbSlotInfoKHR structure</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR and the current <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-rate-control-modes">rate control mode</a> is not #VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR, then ##VkVideoEncodeH264NaluSliceInfoKHR{@code ::constantQp} <b>must</b> be zero for each element of the {@code pNaluSliceEntries} member of the ##VkVideoEncodeH264PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR and the current <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-rate-control-modes">rate control mode</a> is #VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR, then ##VkVideoEncodeH264NaluSliceInfoKHR{@code ::constantQp} <b>must</b> be between ##VkVideoEncodeH264CapabilitiesKHR{@code ::minQp} and ##VkVideoEncodeH264CapabilitiesKHR{@code ::maxQp}, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with, for each element of the {@code pNaluSliceEntries} member of the ##VkVideoEncodeH264PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR and ##VkVideoEncodeH264CapabilitiesKHR{@code ::flags} does not include #VIDEO_ENCODE_H264_CAPABILITY_PER_SLICE_CONSTANT_QP_BIT_KHR, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with, then ##VkVideoEncodeH264NaluSliceInfoKHR{@code ::constantQp} <b>must</b> have the same value for each element of the {@code pNaluSliceEntries} member of the ##VkVideoEncodeH264PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR, then the {@code naluSliceEntryCount} member of the ##VkVideoEncodeH264PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> be less than or equal to {@code minCodingBlockExtent.width} multiplied by {@code minCodingBlockExtent.height}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR and ##VkVideoEncodeH264CapabilitiesKHR{@code ::flags} does not include #VIDEO_ENCODE_H264_CAPABILITY_ROW_UNALIGNED_SLICE_BIT_KHR, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with, then the {@code naluSliceEntryCount} member of the ##VkVideoEncodeH264PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> be less than or equal to {@code minCodingBlockExtent.height}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR, the {@code pNext} chain of {@code pEncodeInfo} includes a ##VkVideoEncodeH264PictureInfoKHR structure, and {@code pEncodeInfo→referenceSlotCount} is greater than zero, then ##VkVideoEncodeH264PictureInfoKHR{@code ::pStdPictureInfo→pRefLists} <b>must</b> not be {@code NULL}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR, the {@code pNext} chain of {@code pEncodeInfo} includes a ##VkVideoEncodeH264PictureInfoKHR structure, and ##VkVideoEncodeH264PictureInfoKHR{@code ::pStdPictureInfo→pRefLists} is not {@code NULL}, then each element of the {@code RefPicList0} and {@code RefPicList1} array members of the {@code StdVideoEncodeH264ReferenceListsInfo} structure pointed to by ##VkVideoEncodeH264PictureInfoKHR{@code ::pStdPictureInfo→pRefLists} <b>must</b> either be {@code STD_VIDEO_H264_NO_REFERENCE_PICTURE} or <b>must</b> equal the {@code slotIndex} member of one of the elements of {@code pEncodeInfo→pReferenceSlots}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR, the {@code pNext} chain of {@code pEncodeInfo} includes a ##VkVideoEncodeH264PictureInfoKHR structure, and {@code pEncodeInfo→referenceSlotCount} is greater than zero, then the {@code slotIndex} member of each element of {@code pEncodeInfo→pReferenceSlots} <b>must</b> equal one of the elements of the {@code RefPicList0} or {@code RefPicList1} array members of the {@code StdVideoEncodeH264ReferenceListsInfo} structure pointed to by ##VkVideoEncodeH264PictureInfoKHR{@code ::pStdPictureInfo→pRefLists}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR and ##VkVideoEncodeH264CapabilitiesKHR{@code ::maxPPictureL0ReferenceCount} is zero, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with, then {@code h264PictureType} and each element of {@code h264L0PictureTypes} and {@code h264L1PictureTypes} <b>must</b> not be {@code STD_VIDEO_H264_PICTURE_TYPE_P}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR and ##VkVideoEncodeH264CapabilitiesKHR{@code ::maxBPictureL0ReferenceCount} and ##VkVideoEncodeH264CapabilitiesKHR{@code ::maxL1ReferenceCount} are both zero, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with, then {@code h264PictureType} and each element of {@code h264L0PictureTypes} and {@code h264L1PictureTypes} <b>must</b> not be {@code STD_VIDEO_H264_PICTURE_TYPE_B}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR and ##VkVideoEncodeH264CapabilitiesKHR{@code ::flags} does not include #VIDEO_ENCODE_H264_CAPABILITY_B_FRAME_IN_L0_LIST_BIT_KHR, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with, then each element of {@code h264L0PictureTypes} <b>must</b> not be {@code STD_VIDEO_H264_PICTURE_TYPE_B}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR and ##VkVideoEncodeH264CapabilitiesKHR{@code ::flags} does not include #VIDEO_ENCODE_H264_CAPABILITY_B_FRAME_IN_L1_LIST_BIT_KHR, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with, then each element of {@code h264L1PictureTypes} <b>must</b> not be {@code STD_VIDEO_H264_PICTURE_TYPE_B}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR, then the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> include a ##VkVideoEncodeH265PictureInfoKHR structure</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR, then the bound video session parameters object <b>must</b> contain a {@code StdVideoH265VideoParameterSet} entry with {@code vps_video_parameter_set_id} matching {@code StdVideoEncodeH265PictureInfo}{@code ::sps_video_parameter_set_id} that is provided in the {@code pStdPictureInfo} member of the ##VkVideoEncodeH265PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR, then the bound video session parameters object <b>must</b> contain a {@code StdVideoH265SequenceParameterSet} entry with {@code sps_video_parameter_set_id} and {@code sps_seq_parameter_set_id} matching {@code StdVideoEncodeH265PictureInfo}{@code ::sps_video_parameter_set_id} and {@code StdVideoEncodeH265PictureInfo}{@code ::pps_seq_parameter_set_id}, respectively, that are provided in the {@code pStdPictureInfo} member of the ##VkVideoEncodeH265PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR, then the bound video session parameters object <b>must</b> contain a {@code StdVideoH265PictureParameterSet} entry with {@code sps_video_parameter_set_id}, {@code pps_seq_parameter_set_id}, and {@code pps_pic_parameter_set_id} matching {@code StdVideoEncodeH265PictureInfo}{@code ::sps_video_parameter_set_id}, {@code StdVideoEncodeH265PictureInfo}{@code ::pps_seq_parameter_set_id}, and {@code StdVideoEncodeH265PictureInfo}{@code ::pps_pic_parameter_set_id}, respectively, that are provided in the {@code pStdPictureInfo} member of the ##VkVideoEncodeH265PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR and {@code pEncodeInfo→pSetupReferenceSlot} is not {@code NULL}, then the {@code pNext} chain of {@code pEncodeInfo→pSetupReferenceSlot} <b>must</b> include a ##VkVideoEncodeH265DpbSlotInfoKHR structure</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR, then the {@code pNext} chain of each element of {@code pEncodeInfo→pReferenceSlots} <b>must</b> include a ##VkVideoEncodeH265DpbSlotInfoKHR structure</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR and the current <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-rate-control-modes">rate control mode</a> is not #VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR, then ##VkVideoEncodeH265NaluSliceSegmentInfoKHR{@code ::constantQp} <b>must</b> be zero for each element of the {@code pNaluSliceSegmentEntries} member of the ##VkVideoEncodeH265PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR and the current <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-rate-control-modes">rate control mode</a> is #VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR, then ##VkVideoEncodeH265NaluSliceSegmentInfoKHR{@code ::constantQp} <b>must</b> be between ##VkVideoEncodeH265CapabilitiesKHR{@code ::minQp} and ##VkVideoEncodeH265CapabilitiesKHR{@code ::maxQp}, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with, for each element of the {@code pNaluSliceSegmentEntries} member of the ##VkVideoEncodeH265PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR and ##VkVideoEncodeH265CapabilitiesKHR{@code ::flags} does not include #VIDEO_ENCODE_H265_CAPABILITY_PER_SLICE_SEGMENT_CONSTANT_QP_BIT_KHR, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with, then ##VkVideoEncodeH265NaluSliceSegmentInfoKHR{@code ::constantQp} <b>must</b> have the same value for each element of the {@code pNaluSliceSegmentEntries} member of the ##VkVideoEncodeH264PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR, then the {@code naluSliceSegmentEntryCount} member of the ##VkVideoEncodeH265PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> be less than or equal to {@code minCodingBlockExtent.width} multiplied by {@code minCodingBlockExtent.height}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR and ##VkVideoEncodeH265CapabilitiesKHR{@code ::flags} does not include #VIDEO_ENCODE_H265_CAPABILITY_ROW_UNALIGNED_SLICE_SEGMENT_BIT_KHR, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with, then the {@code naluSliceSegmentEntryCount} member of the ##VkVideoEncodeH265PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> be less than or equal to {@code minCodingBlockExtent.height}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR, the {@code pNext} chain of {@code pEncodeInfo} includes a ##VkVideoEncodeH265PictureInfoKHR structure, and {@code pEncodeInfo→referenceSlotCount} is greater than zero, then ##VkVideoEncodeH265PictureInfoKHR{@code ::pStdPictureInfo→pRefLists} <b>must</b> not be {@code NULL}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR, the {@code pNext} chain of {@code pEncodeInfo} includes a ##VkVideoEncodeH265PictureInfoKHR structure, and ##VkVideoEncodeH265PictureInfoKHR{@code ::pStdPictureInfo→pRefLists} is not {@code NULL}, then each element of the {@code RefPicList0} and {@code RefPicList1} array members of the {@code StdVideoEncodeH265ReferenceListsInfo} structure pointed to by ##VkVideoEncodeH265PictureInfoKHR{@code ::pStdPictureInfo→pRefLists} <b>must</b> either be {@code STD_VIDEO_H265_NO_REFERENCE_PICTURE} or <b>must</b> equal the {@code slotIndex} member of one of the elements of {@code pEncodeInfo→pReferenceSlots}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR, the {@code pNext} chain of {@code pEncodeInfo} includes a ##VkVideoEncodeH265PictureInfoKHR structure, and {@code pEncodeInfo→referenceSlotCount} is greater than zero, then the {@code slotIndex} member of each element of {@code pEncodeInfo→pReferenceSlots} <b>must</b> equal one of the elements of the {@code RefPicList0} or {@code RefPicList1} array members of the {@code StdVideoEncodeH265ReferenceListsInfo} structure pointed to by ##VkVideoEncodeH265PictureInfoKHR{@code ::pStdPictureInfo→pRefLists}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR and ##VkVideoEncodeH265CapabilitiesKHR{@code ::maxPPictureL0ReferenceCount} is zero, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with, then {@code h265PictureType} and each element of {@code h265L0PictureTypes} and {@code h265L1PictureTypes} <b>must</b> not be {@code STD_VIDEO_H265_PICTURE_TYPE_P}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR and ##VkVideoEncodeH265CapabilitiesKHR{@code ::maxBPictureL0ReferenceCount} and ##VkVideoEncodeH265CapabilitiesKHR{@code ::maxL1ReferenceCount} are both zero, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with, then {@code h265PictureType} and each element of {@code h265L0PictureTypes} and {@code h265L1PictureTypes} <b>must</b> not be {@code STD_VIDEO_H265_PICTURE_TYPE_B}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR and ##VkVideoEncodeH265CapabilitiesKHR{@code ::flags} does not include #VIDEO_ENCODE_H265_CAPABILITY_B_FRAME_IN_L0_LIST_BIT_KHR, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with, then each element of {@code h265L0PictureTypes} <b>must</b> not be {@code STD_VIDEO_H264_PICTURE_TYPE_B}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR and ##VkVideoEncodeH265CapabilitiesKHR{@code ::flags} does not include #VIDEO_ENCODE_H265_CAPABILITY_B_FRAME_IN_L1_LIST_BIT_KHR, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with, then each element of {@code h265L1PictureTypes} <b>must</b> not be {@code STD_VIDEO_H265_PICTURE_TYPE_B}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR, then the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> include a ##VkVideoEncodeAV1PictureInfoKHR structure</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and {@code pEncodeInfo→pSetupReferenceSlot} is not {@code NULL}, then the {@code pNext} chain of {@code pEncodeInfo→pSetupReferenceSlot} <b>must</b> include a ##VkVideoEncodeAV1DpbSlotInfoKHR structure</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR, then the {@code pNext} chain of each element of {@code pEncodeInfo→pReferenceSlots} <b>must</b> include a ##VkVideoEncodeAV1DpbSlotInfoKHR structure</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and the current <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-rate-control-modes">rate control mode</a> is not #VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR, then the {@code constantQIndex} member of the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> be zero</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and the current <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-rate-control-modes">rate control mode</a> is #VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR, then the {@code constantQIndex} member of the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> be between ##VkVideoEncodeAV1CapabilitiesKHR{@code ::minQIndex} and ##VkVideoEncodeAV1CapabilitiesKHR{@code ::maxQIndex}, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and ##VkVideoEncodeAV1CapabilitiesKHR{@code ::flags} does not include #VIDEO_ENCODE_AV1_CAPABILITY_FRAME_SIZE_OVERRIDE_BIT_KHR, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with, then ##VkVideoEncodeAV1PictureInfoKHR{@code ::pStdPictureInfo→flags.frame_size_override_flag} <b>must</b> be zero for the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and ##VkVideoEncodeAV1CapabilitiesKHR{@code ::flags} does not include #VIDEO_ENCODE_AV1_CAPABILITY_FRAME_SIZE_OVERRIDE_BIT_KHR, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with, then {@code pEncodeInfo→srcPictureResource.codedExtent.width} <b>must</b> equal <code>StdVideoAV1SequenceHeader::max_frame_width_minus_1 + 1</code> of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-av1-active-sequence-header">active AV1 sequence header</a></li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and ##VkVideoEncodeAV1CapabilitiesKHR{@code ::flags} does not include #VIDEO_ENCODE_AV1_CAPABILITY_FRAME_SIZE_OVERRIDE_BIT_KHR, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with, then {@code pEncodeInfo→srcPictureResource.codedExtent.height} <b>must</b> equal <code>StdVideoAV1SequenceHeader::max_frame_height_minus_1 + 1</code> of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-av1-active-sequence-header">active AV1 sequence header</a></li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and ##VkVideoEncodeAV1CapabilitiesKHR{@code ::flags} does not include #VIDEO_ENCODE_AV1_CAPABILITY_MOTION_VECTOR_SCALING_BIT_KHR, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with, then for each element <code>i</code> of {@code pEncodeInfo→pReferenceSlots} {@code pEncodeInfo→pReferenceSlots}[i].{@code pPictureResource→codedExtent} <b>must</b> match {@code pEncodeInfo→srcPictureResource.codedExtent}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and the {@code predictionMode} member of the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} is #VIDEO_ENCODE_AV1_PREDICTION_MODE_INTRA_ONLY_KHR, then ##VkVideoEncodeAV1PictureInfoKHR{@code ::pStdPictureInfo→frame_type} <b>must</b> be {@code STD_VIDEO_AV1_FRAME_TYPE_KEY} or {@code STD_VIDEO_AV1_FRAME_TYPE_INTRA_ONLY}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and {@code pStdPictureInfo→frame_type} for the {@code pStdPictureInfo} member of the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} is {@code STD_VIDEO_AV1_FRAME_TYPE_KEY} or {@code STD_VIDEO_AV1_FRAME_TYPE_INTRA_ONLY}, then ##VkVideoEncodeAV1PictureInfoKHR{@code ::predictionMode} <b>must</b> be #VIDEO_ENCODE_AV1_PREDICTION_MODE_INTRA_ONLY_KHR</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and ##VkVideoEncodeAV1CapabilitiesKHR{@code ::maxSingleReferenceCount} is zero, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with, then the {@code predictionMode} member of the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> not be #VIDEO_ENCODE_AV1_PREDICTION_MODE_SINGLE_REFERENCE_KHR</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and the {@code predictionMode} member of the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} is #VIDEO_ENCODE_AV1_PREDICTION_MODE_SINGLE_REFERENCE_KHR, then there <b>must</b> be at least one non-negative element of ##VkVideoEncodeAV1PictureInfoKHR{@code ::referenceNameSlotIndices} with element index <code>i</code> that does not equal {@code cdfOnlyReferenceIndex} and for which bit index <code>i</code> is set in ##VkVideoEncodeAV1CapabilitiesKHR{@code ::singleReferenceNameMask}, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and ##VkVideoEncodeAV1CapabilitiesKHR{@code ::maxUnidirectionalCompoundReferenceCount} is zero, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with, then the {@code predictionMode} member of the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> not be #VIDEO_ENCODE_AV1_PREDICTION_MODE_UNIDIRECTIONAL_COMPOUND_KHR</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and the {@code predictionMode} member of the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} is #VIDEO_ENCODE_AV1_PREDICTION_MODE_UNIDIRECTIONAL_COMPOUND_KHR, then there <b>must</b> be at least two non-negative elements of ##VkVideoEncodeAV1PictureInfoKHR{@code ::referenceNameSlotIndices} with element indices <code>i</code> and <code>j</code> where <code>(i,j) ∈ {(0,1),(0,2),(0,3),(4,6)}</code>, such that neither element equals {@code cdfOnlyReferenceIndex} and for which bit indices <code>i</code> and <code>j</code> are set in ##VkVideoEncodeAV1CapabilitiesKHR{@code ::unidirectionalCompoundReferenceNameMask}, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and ##VkVideoEncodeAV1CapabilitiesKHR{@code ::maxBidirectionalCompoundReferenceCount} is zero, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with, then the {@code predictionMode} member of the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> not be #VIDEO_ENCODE_AV1_PREDICTION_MODE_BIDIRECTIONAL_COMPOUND_KHR</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and the {@code predictionMode} member of the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} is #VIDEO_ENCODE_AV1_PREDICTION_MODE_BIDIRECTIONAL_COMPOUND_KHR, then there <b>must</b> be at least two non-negative elements of ##VkVideoEncodeAV1PictureInfoKHR{@code ::referenceNameSlotIndices} with element indices <code>i ∈ {0,1,2,3}</code> and <code>j ∈ {4,5,6}</code>, respectively, such that neither element equals {@code cdfOnlyReferenceIndex}, and for which bit indices <code>i</code> and <code>j</code> are set in ##VkVideoEncodeAV1CapabilitiesKHR{@code ::bidirectionalCompoundReferenceNameMask}, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR, then each element of the {@code referenceNameSlotIndices} array member of the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> either be negative or <b>must</b> equal the {@code slotIndex} member of one of the elements of {@code pEncodeInfo→pReferenceSlots}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR, then the {@code slotIndex} member of each element of {@code pEncodeInfo→pReferenceSlots} <b>must</b> equal one of the elements of the {@code referenceNameSlotIndices} array member of the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and the {@code pExtensionHeader} member of ##VkVideoEncodeAV1PictureInfoKHR{@code ::pStdPictureInfo} for the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} is not {@code NULL}, then {@code pExtensionHeader→temporal_id} <b>must</b> be less than ##VkVideoEncodeAV1CapabilitiesKHR{@code ::maxTemporalLayerCount}, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and the {@code pExtensionHeader} member of ##VkVideoEncodeAV1PictureInfoKHR{@code ::pStdPictureInfo} for the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} is not {@code NULL}, then {@code pExtensionHeader→spatial_id} <b>must</b> be less than ##VkVideoEncodeAV1CapabilitiesKHR{@code ::maxSpatialLayerCount}, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and {@code pEncodeInfo→pSetupReferenceSlot} is not {@code NULL}, then the {@code pExtensionHeader} member of ##VkVideoEncodeAV1DpbSlotInfoKHR{@code ::pStdReferenceInfo} for the ##VkVideoEncodeAV1DpbSlotInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo→pSetupReferenceSlot} and the {@code pExtensionHeader} member of ##VkVideoEncodeAV1PictureInfoKHR{@code ::pStdPictureInfo} for the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> both be {@code NULL} or not {@code NULL}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR, {@code pEncodeInfo→pSetupReferenceSlot} is not {@code NULL}, and the {@code pExtensionHeader} member of ##VkVideoEncodeAV1DpbSlotInfoKHR{@code ::pStdReferenceInfo} for the ##VkVideoEncodeAV1DpbSlotInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo→pSetupReferenceSlot} is not {@code NULL}, then {@code pExtensionHeader→temporal_id} <b>must</b> equal {@code pStdPictureInfo→pExtensionHeader→temporal_id} in the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR, {@code pEncodeInfo→pSetupReferenceSlot} is not {@code NULL}, and the {@code pExtensionHeader} member of ##VkVideoEncodeAV1DpbSlotInfoKHR{@code ::pStdReferenceInfo} for the ##VkVideoEncodeAV1DpbSlotInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo→pSetupReferenceSlot} is not {@code NULL}, then {@code pExtensionHeader→spatial_id} <b>must</b> equal {@code pStdPictureInfo→pExtensionHeader→spatial_id} in the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and the {@code pExtensionHeader} member of ##VkVideoEncodeAV1DpbSlotInfoKHR{@code ::pStdReferenceInfo} for any of the ##VkVideoEncodeAV1DpbSlotInfoKHR structures included in the {@code pNext} chain of any element of {@code pEncodeInfo→pReferenceSlots} is not {@code NULL}, then {@code pExtensionHeader→temporal_id} <b>must</b> be less than ##VkVideoEncodeAV1CapabilitiesKHR{@code ::maxTemporalLayerCount}, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and the {@code pExtensionHeader} member of ##VkVideoEncodeAV1DpbSlotInfoKHR{@code ::pStdReferenceInfo} for any of the ##VkVideoEncodeAV1DpbSlotInfoKHR structures included in the {@code pNext} chain of any element of {@code pEncodeInfo→pReferenceSlots} is not {@code NULL}, then {@code pExtensionHeader→spatial_id} <b>must</b> be less than ##VkVideoEncodeAV1CapabilitiesKHR{@code ::maxSpatialLayerCount}, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and the {@code pTileInfo} member of ##VkVideoEncodeAV1PictureInfoKHR{@code ::pStdPictureInfo} for the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} is not {@code NULL}, then {@code pTileInfo→TileCols} <b>must</b> be greater than 0</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and the {@code pTileInfo} member of ##VkVideoEncodeAV1PictureInfoKHR{@code ::pStdPictureInfo} for the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} is not {@code NULL}, then {@code pTileInfo→TileRows} <b>must</b> be greater than 0</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and the {@code pTileInfo} member of ##VkVideoEncodeAV1PictureInfoKHR{@code ::pStdPictureInfo} for the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} is not {@code NULL}, then {@code pTileInfo→TileCols} <b>must</b> be less than or equal to ##VkVideoEncodeAV1CapabilitiesKHR{@code ::maxTiles.width}, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and the {@code pTileInfo} member of ##VkVideoEncodeAV1PictureInfoKHR{@code ::pStdPictureInfo} for the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} is not {@code NULL}, then {@code pTileInfo→TileRows} <b>must</b> be less than or equal to ##VkVideoEncodeAV1CapabilitiesKHR{@code ::maxTiles.height}, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and the {@code pTileInfo} member of ##VkVideoEncodeAV1PictureInfoKHR{@code ::pStdPictureInfo} for the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} is not {@code NULL}, then <code>⌈pEncodeInfo→srcPictureResource.codedExtent.width / pTileInfo→TileCols⌉</code> <b>must</b> be between ##VkVideoEncodeAV1CapabilitiesKHR{@code ::minTileSize.width} and ##VkVideoEncodeAV1CapabilitiesKHR{@code ::maxTileSize.width}, inclusive, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR and the {@code pTileInfo} member of ##VkVideoEncodeAV1PictureInfoKHR{@code ::pStdPictureInfo} for the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} is not {@code NULL}, then <code>⌈pEncodeInfo→srcPictureResource.codedExtent.height / pTileInfo→TileRows⌉</code> <b>must</b> be between ##VkVideoEncodeAV1CapabilitiesKHR{@code ::minTileSize.height} and ##VkVideoEncodeAV1CapabilitiesKHR{@code ::maxTileSize.height}, inclusive, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR, then ##VkVideoEncodeAV1PictureInfoKHR{@code ::pStdPictureInfo→flags.segmentation_enabled} for the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> be zero</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR, then ##VkVideoEncodeAV1PictureInfoKHR{@code ::pStdPictureInfo→pSegmentation} for the ##VkVideoEncodeAV1PictureInfoKHR structure included in the {@code pNext} chain of {@code pEncodeInfo} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pEncodeInfo} <b>must</b> be a valid pointer to a valid ##VkVideoEncodeInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support encode operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>This command <b>must</b> only be called inside of a video coding scope</li>
            <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Outside</td><td>Inside</td><td>Encode</td><td>Action</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkVideoEncodeInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer in which to record the command."),
        VkVideoEncodeInfoKHR.const.p("pEncodeInfo", "a pointer to a ##VkVideoEncodeInfoKHR structure specifying the parameters of the video encode operations.")
    )
}