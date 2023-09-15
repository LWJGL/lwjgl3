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

        <h5>VK_KHR_video_encode_queue</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_video_encode_queue}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>300</dd>

            <dt><b>Revision</b></dt>
            <dd>10</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRVideoQueue VK_KHR_video_queue} and {@link KHRSynchronization2 VK_KHR_synchronization2}

            <ul>
                <li>This is a <em>provisional</em> extension and <b>must</b> be used with caution. See the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#boilerplate-provisional-header">description</a> of provisional header files for enablement and stability details.</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Ahmed Abdelkhalek <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_video_encode_queue]%20@aabdelkh%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_video_encode_queue%20extension*">aabdelkh</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-07-19</dd>

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
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_VIDEO_ENCODE_QUEUE_SPEC_VERSION".."10"
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
            <li>#VIDEO_ENCODE_CAPABILITY_PRECEDING_EXTERNALLY_ENCODED_BYTES_BIT_KHR indicates that the implementation supports the use of ##VkVideoEncodeInfoKHR{@code ::precedingExternallyEncodedBytes}.</li>
            <li>
                #VIDEO_ENCODE_CAPABILITY_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_DETECTION_BIT_KHR indicates that the implementation is able to detect and report when the destination video bitstream buffer range provided by the application is not sufficiently large to fit the encoded bitstream data produced by a video encode operation by reporting the #QUERY_RESULT_STATUS_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_KHR <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#query-result-status-codes">query result status code</a>.
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
            <li>#VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR specifies that rate control is disabled and any quality control parameters for the encoding are provided on a per-picture basis. In this mode implementations will encode pictures independently of the output bitrate of prior video encode operations. When using an H.264 encode profile, implementations will use the QP values specified in the ##VkVideoEncodeH264RateControlInfoEXT structure for the encoded picture. When using an H.265 encode profile, implementations will use the QP values specified in the ##VkVideoEncodeH265RateControlInfoEXT structure for the encoded picture.</li>
            <li>#VIDEO_ENCODE_RATE_CONTROL_MODE_CBR_BIT_KHR specifies the use of constant bitrate rate control mode.</li>
            <li>#VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR specifies the use of variable bitrate rate control mode.</li>
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
            <li>#VIDEO_ENCODE_FEEDBACK_BITSTREAM_BUFFER_OFFSET_BIT_KHR specifies that queries managed by the pool will capture the byte offset of the bitstream data written by the video encode operation to the bitstream buffer specified in ##VkVideoEncodeInfoKHR{@code ::dstBuffer} relative to the offset specified in ##VkVideoEncodeInfoKHR{@code ::dstBufferOffset}.</li>
            <li>#VIDEO_ENCODE_FEEDBACK_BITSTREAM_BYTES_WRITTEN_BIT_KHR specifies that queries managed by the pool will capture the number of bytes written by the video encode operation to the bitstream buffer specified in ##VkVideoEncodeInfoKHR{@code ::dstBuffer}.</li>
            <li>#VIDEO_ENCODE_FEEDBACK_BITSTREAM_HAS_OVERRIDES_BIT_KHR specifies that queries managed by the pool will capture a boolean value indicating that the data written to the bitstream buffer specified in ##VkVideoEncodeInfoKHR{@code ::dstBuffer} contains overridden parameters.</li>
        </ul>

        When retrieving the results of video encode feedback queries, the values corresponding to each enabled video encode feedback are written in the order of the bits defined above, followed by an optional value indicating availability or result status if #QUERY_RESULT_WITH_AVAILABILITY_BIT or #QUERY_RESULT_WITH_STATUS_BIT_KHR is specified, respectively.
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

        If {@code pFeedbackInfo} is not {@code NULL} then the members of the ##VkVideoEncodeSessionParametersFeedbackInfoKHR structure and any additional structures included in its {@code pNext} chain that are applicable to the video session parameters object specified in {@code pVideoSessionParametersInfo}{@code ::videoSessionParameters} will be filled with feedback about the requested parameter data on all successful calls to this command.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note:</h5>
        This includes the cases when {@code pData} is {@code NULL} or when #INCOMPLETE is returned by the command, and enables the application to determine whether the implementation overrode any of the requested video session parameters without actually needing to retrieve the encoded parameter data itself.
        </div>

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
        Encode operation for bitstream generation.

        <h5>C Specification</h5>
        To launch video encode operations, call:

        <pre><code>
￿void vkCmdEncodeVideoKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkVideoEncodeInfoKHR*                 pEncodeInfo);</code></pre>

        <h5>Description</h5>
        Each call issues one or more video encode operations. The implicit parameter {@code opCount} corresponds to the number of video encode operations issued by the command. After calling this command, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#queries-operation-active-query-index">active query index</a> of each <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#queries-operation-active">active</a> query is incremented by {@code opCount}.

        Currently each call to this command results in the issue of a single video encode operation.

        <h5>Valid Usage</h5>
        <ul>
            <li>For each <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#queries-operation-active">active</a> query, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#queries-operation-active-query-index">active query index</a> corresponding to the query type of that query plus {@code opCount} <b>must</b> be less than or equal to the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#queries-operation-last-activatable-query-index">last activatable query index</a> corresponding to the query type of that query plus one</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pEncodeInfo} <b>must</b> be a valid pointer to a valid ##VkVideoEncodeInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
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
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Outside</td><td>Inside</td><td>Encode</td><td>Action</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkVideoEncodeInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer to be filled with this function for encoding to generate a bitstream."),
        VkVideoEncodeInfoKHR.const.p("pEncodeInfo", "a pointer to a ##VkVideoEncodeInfoKHR structure.")
    )
}