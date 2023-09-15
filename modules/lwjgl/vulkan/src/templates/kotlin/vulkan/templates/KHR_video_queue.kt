/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_video_queue = "KHRVideoQueue".nativeClassVK("KHR_video_queue", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension provides common APIs to enable exposing queue families with support for video codec operations by introducing the following new object types and related functionalities:

        <ul>
            <li>Video session objects that represent and maintain the state needed to perform video codec operations.</li>
            <li>Video session parameters objects that act as a container for codec specific parameters.</li>
        </ul>

        In addition, it also introduces query commands that allow applications to determine video coding related capabilities, and command buffer commands that enable recording video coding operations against a video session.

        This extension is to be used in conjunction with other extensions that enable specific video coding operations.

        <h5>VK_KHR_video_queue</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_video_queue}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>24</dd>

            <dt><b>Revision</b></dt>
            <dd>8</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.1">Version 1.1</a> and {@link KHRSynchronization2 VK_KHR_synchronization2}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Tony Zlatinski <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_video_queue]%20@tzlatinski%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_video_queue%20extension*">tzlatinski</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_video_queue.adoc">VK_KHR_video_queue</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2022-09-29</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Ahmed Abdelkhalek, AMD</li>
                <li>George Hao, AMD</li>
                <li>Jake Beju, AMD</li>
                <li>Piers Daniell, NVIDIA</li>
                <li>Srinath Kumarapuram, NVIDIA</li>
                <li>Tobias Hector, AMD</li>
                <li>Tony Zlatinski, NVIDIA</li>
                <li>Daniel Rakos, RasterGrid</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_VIDEO_QUEUE_SPEC_VERSION".."8"
    )

    StringConstant(
        "The extension name.",

        "KHR_VIDEO_QUEUE_EXTENSION_NAME".."VK_KHR_video_queue"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_VIDEO_PROFILE_INFO_KHR".."1000023000",
        "STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR".."1000023001",
        "STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_INFO_KHR".."1000023002",
        "STRUCTURE_TYPE_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR".."1000023003",
        "STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR".."1000023004",
        "STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR".."1000023005",
        "STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR".."1000023006",
        "STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_UPDATE_INFO_KHR".."1000023007",
        "STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR".."1000023008",
        "STRUCTURE_TYPE_VIDEO_END_CODING_INFO_KHR".."1000023009",
        "STRUCTURE_TYPE_VIDEO_CODING_CONTROL_INFO_KHR".."1000023010",
        "STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_INFO_KHR".."1000023011",
        "STRUCTURE_TYPE_QUEUE_FAMILY_VIDEO_PROPERTIES_KHR".."1000023012",
        "STRUCTURE_TYPE_VIDEO_PROFILE_LIST_INFO_KHR".."1000023013",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR".."1000023014",
        "STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR".."1000023015",
        "STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_KHR".."1000023016"
    )

    EnumConstant(
        "Extends {@code VkObjectType}.",

        "OBJECT_TYPE_VIDEO_SESSION_KHR".."1000023000",
        "OBJECT_TYPE_VIDEO_SESSION_PARAMETERS_KHR".."1000023001"
    )

    EnumConstant(
        "Extends {@code VkQueryType}.",

        "QUERY_TYPE_RESULT_STATUS_ONLY_KHR".."1000023000"
    )

    EnumConstant(
        "Extends {@code VkQueryResultFlagBits}.",

        "QUERY_RESULT_WITH_STATUS_BIT_KHR".enum(0x00000010)
    )

    EnumConstant(
        "Extends {@code VkResult}.",

        "ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR".."-1000023000",
        "ERROR_VIDEO_PICTURE_LAYOUT_NOT_SUPPORTED_KHR".."-1000023001",
        "ERROR_VIDEO_PROFILE_OPERATION_NOT_SUPPORTED_KHR".."-1000023002",
        "ERROR_VIDEO_PROFILE_FORMAT_NOT_SUPPORTED_KHR".."-1000023003",
        "ERROR_VIDEO_PROFILE_CODEC_NOT_SUPPORTED_KHR".."-1000023004",
        "ERROR_VIDEO_STD_VERSION_NOT_SUPPORTED_KHR".."-1000023005"
    )

    EnumConstant(
        """
        VkVideoCodecOperationFlagBitsKHR - Video codec operation bits

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_CODEC_OPERATION_NONE_KHR indicates no support for any video codec operations.</li>
            <li>#VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR specifies support for H.264 video decode operations.</li>
            <li>#VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR specifies support for H.265 video decode operations.</li>
            <li>#VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT specifies support for H.264 video encode operations.</li>
            <li>#VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT specifies support for H.265 video encode operations.</li>
        </ul>

        <h5>See Also</h5>
        ##VkVideoProfileInfoKHR
        """,

        "VIDEO_CODEC_OPERATION_NONE_KHR".."0"
    )

    EnumConstant(
        """
        VkVideoChromaSubsamplingFlagBitsKHR - Video format chroma subsampling bits

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_CHROMA_SUBSAMPLING_MONOCHROME_BIT_KHR specifies that the format is monochrome.</li>
            <li>#VIDEO_CHROMA_SUBSAMPLING_420_BIT_KHR specified that the format is 4:2:0 chroma subsampled, i.e. the two chroma components are sampled horizontally and vertically at half the sample rate of the luma component.</li>
            <li>#VIDEO_CHROMA_SUBSAMPLING_422_BIT_KHR - the format is 4:2:2 chroma subsampled, i.e. the two chroma components are sampled horizontally at half the sample rate of luma component.</li>
            <li>#VIDEO_CHROMA_SUBSAMPLING_444_BIT_KHR - the format is 4:4:4 chroma sampled, i.e. all three components of the Y′C<sub>B</sub>C<sub>R</sub> format are sampled at the same rate, thus there is no chroma subsampling.</li>
        </ul>
        """,

        "VIDEO_CHROMA_SUBSAMPLING_INVALID_KHR".."0",
        "VIDEO_CHROMA_SUBSAMPLING_MONOCHROME_BIT_KHR".enum(0x00000001),
        "VIDEO_CHROMA_SUBSAMPLING_420_BIT_KHR".enum(0x00000002),
        "VIDEO_CHROMA_SUBSAMPLING_422_BIT_KHR".enum(0x00000004),
        "VIDEO_CHROMA_SUBSAMPLING_444_BIT_KHR".enum(0x00000008)
    )

    EnumConstant(
        """
        VkVideoComponentBitDepthFlagBitsKHR - Video format component bit depth

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_COMPONENT_BIT_DEPTH_8_BIT_KHR specifies a component bit depth of 8 bits.</li>
            <li>#VIDEO_COMPONENT_BIT_DEPTH_10_BIT_KHR specifies a component bit depth of 10 bits.</li>
            <li>#VIDEO_COMPONENT_BIT_DEPTH_12_BIT_KHR specifies a component bit depth of 12 bits.</li>
        </ul>
        """,

        "VIDEO_COMPONENT_BIT_DEPTH_INVALID_KHR".."0",
        "VIDEO_COMPONENT_BIT_DEPTH_8_BIT_KHR".enum(0x00000001),
        "VIDEO_COMPONENT_BIT_DEPTH_10_BIT_KHR".enum(0x00000004),
        "VIDEO_COMPONENT_BIT_DEPTH_12_BIT_KHR".enum(0x00000010)
    )

    EnumConstant(
        """
        VkVideoCapabilityFlagBitsKHR - Video decode and encode capability bits

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_CAPABILITY_PROTECTED_CONTENT_BIT_KHR specifies that video sessions support producing and consuming protected content.</li>
            <li>#VIDEO_CAPABILITY_SEPARATE_REFERENCE_IMAGES_BIT_KHR specifies that the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-picture-resources">video picture resources</a> associated with the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dpb-slot">DPB slots</a> of a video session <b>can</b> be backed by separate {@code VkImage} objects. If this capability flag is not present, then all DPB slots of a video session <b>must</b> be associated with video picture resources backed by the same {@code VkImage} object (e.g. using different layers of the same image).</li>
        </ul>
        """,

        "VIDEO_CAPABILITY_PROTECTED_CONTENT_BIT_KHR".enum(0x00000001),
        "VIDEO_CAPABILITY_SEPARATE_REFERENCE_IMAGES_BIT_KHR".enum(0x00000002)
    )

    EnumConstant(
        """
        VkVideoSessionCreateFlagBitsKHR - Video session creation flags

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_SESSION_CREATE_PROTECTED_CONTENT_BIT_KHR specifies that the video session uses protected video content.</li>
            <li>#VIDEO_SESSION_CREATE_ALLOW_ENCODE_PARAMETER_OPTIMIZATIONS_BIT_KHR specifies that the implementation is allowed to override video session parameters and other codec-specific encoding parameters to optimize video encode operations based on the specific use case defined by the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-profiles">video profile</a> and the used video encode quality level.</li>
        </ul>
        """,

        "VIDEO_SESSION_CREATE_PROTECTED_CONTENT_BIT_KHR".enum(0x00000001)
    )

    EnumConstant(
        """
        VkVideoCodingControlFlagBitsKHR - Video coding control flags

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_CODING_CONTROL_RESET_BIT_KHR indicates a request for the bound video session to be reset before other coding control parameters are applied.</li>
            <li>#VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR indicates that the coding control parameters include video encode rate control parameters (see ##VkVideoEncodeRateControlInfoKHR).</li>
            <li>#VIDEO_CODING_CONTROL_ENCODE_QUALITY_LEVEL_BIT_KHR indicates that the coding control parameters include video encode quality level parameters (see ##VkVideoEncodeQualityLevelInfoKHR).</li>
        </ul>
        """,

        "VIDEO_CODING_CONTROL_RESET_BIT_KHR".enum(0x00000001)
    )

    EnumConstant(
        """
        VkQueryResultStatusKHR - Specific status codes for operations

        <h5>Description</h5>
        <ul>
            <li>#QUERY_RESULT_STATUS_NOT_READY_KHR specifies that the query result is not yet available.</li>
            <li>#QUERY_RESULT_STATUS_ERROR_KHR specifies that operations did not complete successfully.</li>
            <li>#QUERY_RESULT_STATUS_COMPLETE_KHR specifies that operations completed successfully and the query result is available.</li>
            <li>#QUERY_RESULT_STATUS_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_KHR indicates that a video encode operation did not complete successfully due to the destination video bitstream buffer range not being sufficiently large to fit the encoded bitstream data.</li>
        </ul>
        """,

        "QUERY_RESULT_STATUS_ERROR_KHR".."-1",
        "QUERY_RESULT_STATUS_NOT_READY_KHR".."0",
        "QUERY_RESULT_STATUS_COMPLETE_KHR".."1"
    )

    VkResult(
        "GetPhysicalDeviceVideoCapabilitiesKHR",
        """
        Query video coding capabilities.

        <h5>C Specification</h5>
        To query video coding capabilities for a specific video profile, call:

        <pre><code>
￿VkResult vkGetPhysicalDeviceVideoCapabilitiesKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkVideoProfileInfoKHR*                pVideoProfile,
￿    VkVideoCapabilitiesKHR*                     pCapabilities);</code></pre>

        <h5>Description</h5>
        If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-profiles">video profile</a> described by {@code pVideoProfile} is supported by the implementation, then this command returns #SUCCESS and {@code pCapabilities} is filled with the capabilities supported with the specified video profile. Otherwise, one of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-profile-error-codes">video-profile-specific error codes</a> are returned.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code pVideoProfile→videoCodecOperation} specifies a decode operation, then the {@code pNext} chain of {@code pCapabilities} <b>must</b> include a ##VkVideoDecodeCapabilitiesKHR structure</li>
            <li>If {@code pVideoProfile→videoCodecOperation} is #VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR, then the {@code pNext} chain of {@code pCapabilities} <b>must</b> include a ##VkVideoDecodeH264CapabilitiesKHR structure</li>
            <li>If {@code pVideoProfile→videoCodecOperation} is #VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR, then the {@code pNext} chain of {@code pCapabilities} <b>must</b> include a ##VkVideoDecodeH265CapabilitiesKHR structure</li>
            <li>If {@code pVideoProfile→videoCodecOperation} specifies an encode operation, then the {@code pNext} chain of {@code pCapabilities} <b>must</b> include a ##VkVideoEncodeCapabilitiesKHR structure</li>
            <li>If {@code pVideoProfile→videoCodecOperation} is #VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT, then the {@code pNext} chain of {@code pCapabilities} <b>must</b> include a ##VkVideoEncodeH264CapabilitiesEXT structure</li>
            <li>If {@code pVideoProfile→videoCodecOperation} is #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT, then the {@code pNext} chain of {@code pCapabilities} <b>must</b> include a ##VkVideoEncodeH265CapabilitiesEXT structure</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pVideoProfile} <b>must</b> be a valid pointer to a valid ##VkVideoProfileInfoKHR structure</li>
            <li>{@code pCapabilities} <b>must</b> be a valid pointer to a ##VkVideoCapabilitiesKHR structure</li>
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
        ##VkVideoCapabilitiesKHR, ##VkVideoProfileInfoKHR
        """,

        VkPhysicalDevice("physicalDevice", "the physical device from which to query the video decode or encode capabilities."),
        VkVideoProfileInfoKHR.const.p("pVideoProfile", "a pointer to a ##VkVideoProfileInfoKHR structure."),
        VkVideoCapabilitiesKHR.p("pCapabilities", "a pointer to a ##VkVideoCapabilitiesKHR structure in which the capabilities are returned.")
    )

    VkResult(
        "GetPhysicalDeviceVideoFormatPropertiesKHR",
        """
        Query supported video decode and encode image formats and capabilities.

        <h5>C Specification</h5>
        To enumerate the supported output, input and DPB image formats and corresponding capabilities for a specific video profile, call:

        <pre><code>
￿VkResult vkGetPhysicalDeviceVideoFormatPropertiesKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkPhysicalDeviceVideoFormatInfoKHR*   pVideoFormatInfo,
￿    uint32_t*                                   pVideoFormatPropertyCount,
￿    VkVideoFormatPropertiesKHR*                 pVideoFormatProperties);</code></pre>

        <h5>Description</h5>
        If {@code pVideoFormatProperties} is {@code NULL}, then the number of video format properties supported for the given {@code physicalDevice} is returned in {@code pVideoFormatPropertyCount}. Otherwise, {@code pVideoFormatPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pVideoFormatProperties} array, and on return the variable is overwritten with the number of values actually written to {@code pVideoFormatProperties}. If the value of {@code pVideoFormatPropertyCount} is less than the number of video format properties supported, at most {@code pVideoFormatPropertyCount} values will be written to {@code pVideoFormatProperties}, and #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available values were returned.

        Video format properties are always queried with respect to a specific set of video profiles. These are specified by chaining the ##VkVideoProfileListInfoKHR structure to {@code pVideoFormatInfo}.

        For most use cases, the images are used by a single video session and a single video profile is provided. For a use case such as video transcoding, where a decode session output image <b>can</b> be used as encode input in one or more encode sessions, multiple video profiles corresponding to the video sessions that will share the image <b>must</b> be provided.

        If any of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-profiles">video profiles</a> specified via ##VkVideoProfileListInfoKHR{@code ::pProfiles} are not supported, then this command returns one of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-profile-error-codes">video-profile-specific error codes</a>. Furthermore, if ##VkPhysicalDeviceVideoFormatInfoKHR{@code ::imageUsage} includes any image usage flags not supported by the specified video profiles, then this command returns #ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR.

        This command also returns #ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR if ##VkPhysicalDeviceVideoFormatInfoKHR{@code ::imageUsage} does not include the appropriate flags as dictated by the decode capability flags returned in ##VkVideoDecodeCapabilitiesKHR{@code ::flags} for any of the profiles specified in the ##VkVideoProfileListInfoKHR structure provided in the {@code pNext} chain of {@code pVideoFormatInfo}.

        If the decode capability flags include #VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR but not #VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR, then in order to query video format properties for decode DPB and output usage, ##VkPhysicalDeviceVideoFormatInfoKHR{@code ::imageUsage} <b>must</b> include both #IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR and #IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR. Otherwise, the call will fail with #ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR.

        If the decode capability flags include #VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR but not #VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR, then in order to query video format properties for decode DPB usage, ##VkPhysicalDeviceVideoFormatInfoKHR{@code ::imageUsage} <b>must</b> include #IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR, but not #IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR. Otherwise, the call will fail with #ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR. Similarly, to query video format properties for decode output usage, ##VkPhysicalDeviceVideoFormatInfoKHR{@code ::imageUsage} <b>must</b> include #IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR, but not #IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR. Otherwise, the call will fail with #ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR.

        The {@code imageUsage} member of the ##VkPhysicalDeviceVideoFormatInfoKHR structure specifies the expected video usage flags that the returned video formats <b>must</b> support. Correspondingly, the {@code imageUsageFlags} member of each ##VkVideoFormatPropertiesKHR structure returned will contain at least the same set of image usage flags.

        If the implementation supports using video input, output, or DPB images of a particular format in operations other than video decode/encode then the {@code imageUsageFlags} member of the corresponding ##VkVideoFormatPropertiesKHR structure returned will include additional image usage flags indicating that.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note:</h5>
        For most use cases, only decode or encode related usage flags are going to be specified. For a use case such as transcode, if the image were to be shared between decode and encode session(s), then both decode and encode related usage flags <b>can</b> be set.
        </div>

        Multiple ##VkVideoFormatPropertiesKHR entries <b>may</b> be returned with the same {@code format} member with different {@code componentMapping}, {@code imageType}, or {@code imageTiling} values, as described later.

        In addition, a different set of ##VkVideoFormatPropertiesKHR entries <b>may</b> be returned depending on the {@code imageUsage} member of the ##VkPhysicalDeviceVideoFormatInfoKHR structure, even for the same set of video profiles, for example, based on whether encode input, encode DPB, decode output, and/or decode DPB usage is requested.

        The application <b>can</b> select the parameters returned in the ##VkVideoFormatPropertiesKHR entries and use compatible parameters when creating the input, output, and DPB images. The implementation will report all image creation and usage flags that are valid for images used with the requested video profiles but applications <b>should</b> create images only with those that are necessary for the particular use case.

        Before creating an image, the application <b>can</b> obtain the complete set of supported image format features by calling #GetPhysicalDeviceImageFormatProperties2() using parameters derived from the members of one of the reported ##VkVideoFormatPropertiesKHR entries and adding the same ##VkVideoProfileListInfoKHR structure to the {@code pNext} chain of ##VkPhysicalDeviceImageFormatInfo2.

        The following applies to all ##VkVideoFormatPropertiesKHR entries returned by {@code vkGetPhysicalDeviceVideoFormatPropertiesKHR}:

        <ul>
            <li>#GetPhysicalDeviceFormatProperties2() <b>must</b> succeed when called with ##VkVideoFormatPropertiesKHR{@code ::format}</li>
            <li>If ##VkVideoFormatPropertiesKHR{@code ::imageTiling} is #IMAGE_TILING_OPTIMAL, then the {@code optimalTilingFeatures} returned by #GetPhysicalDeviceFormatProperties2() <b>must</b> include all format features required by the image usage flags reported in ##VkVideoFormatPropertiesKHR{@code ::imageUsageFlags} for the format, as indicated in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#format-feature-dependent-usage-flags">Format Feature Dependent Usage Flags</a> section.</li>
            <li>If ##VkVideoFormatPropertiesKHR{@code ::imageTiling} is #IMAGE_TILING_LINEAR, then the {@code linearTilingFeatures} returned by #GetPhysicalDeviceFormatProperties2() <b>must</b> include all format features required by the image usage flags reported in ##VkVideoFormatPropertiesKHR{@code ::imageUsageFlags} for the format, as indicated in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#format-feature-dependent-usage-flags">Format Feature Dependent Usage Flags</a> section.</li>
            <li>
                #GetPhysicalDeviceImageFormatProperties2() <b>must</b> succeed when called with a ##VkPhysicalDeviceImageFormatInfo2 structure containing the following information:
                <ul>
                    <li>The {@code pNext} chain including the same ##VkVideoProfileListInfoKHR structure used to call {@code vkGetPhysicalDeviceVideoFormatPropertiesKHR}.</li>
                    <li>{@code format} set to the value of ##VkVideoFormatPropertiesKHR{@code ::format}.</li>
                    <li>{@code type} set to the value of ##VkVideoFormatPropertiesKHR{@code ::imageType}.</li>
                    <li>{@code tiling} set to the value of ##VkVideoFormatPropertiesKHR{@code ::imageTiling}.</li>
                    <li>{@code usage} set to the value of ##VkVideoFormatPropertiesKHR{@code ::imageUsageFlags}.</li>
                    <li>{@code flags} set to the value of ##VkVideoFormatPropertiesKHR{@code ::imageCreateFlags}.</li>
                </ul>
            </li>
        </ul>

        The {@code componentMapping} member of ##VkVideoFormatPropertiesKHR defines the ordering of the Y′C<sub>B</sub>C<sub>R</sub> color channels from the perspective of the video codec operations specified in ##VkVideoProfileListInfoKHR. For example, if the implementation produces video decode output with the format #FORMAT_G8_B8R8_2PLANE_420_UNORM where the blue and red chrominance channels are swapped then the {@code componentMapping} member of the corresponding ##VkVideoFormatPropertiesKHR structure will have the following member values:

        <pre><code>
￿components.r = VK_COMPONENT_SWIZZLE_B;        // Cb component
￿components.g = VK_COMPONENT_SWIZZLE_IDENTITY; // Y component
￿components.b = VK_COMPONENT_SWIZZLE_R;        // Cr component
￿components.a = VK_COMPONENT_SWIZZLE_IDENTITY; // unused, defaults to 1.0</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code pNext} chain of {@code pVideoFormatInfo} <b>must</b> include a ##VkVideoProfileListInfoKHR structure with {@code profileCount} greater than 0</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pVideoFormatInfo} <b>must</b> be a valid pointer to a valid ##VkPhysicalDeviceVideoFormatInfoKHR structure</li>
            <li>{@code pVideoFormatPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pVideoFormatPropertyCount} is not 0, and {@code pVideoFormatProperties} is not {@code NULL}, {@code pVideoFormatProperties} <b>must</b> be a valid pointer to an array of {@code pVideoFormatPropertyCount} ##VkVideoFormatPropertiesKHR structures</li>
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
                <li>#ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR</li>
                <li>#ERROR_VIDEO_PROFILE_OPERATION_NOT_SUPPORTED_KHR</li>
                <li>#ERROR_VIDEO_PROFILE_FORMAT_NOT_SUPPORTED_KHR</li>
                <li>#ERROR_VIDEO_PICTURE_LAYOUT_NOT_SUPPORTED_KHR</li>
                <li>#ERROR_VIDEO_PROFILE_CODEC_NOT_SUPPORTED_KHR</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkPhysicalDeviceVideoFormatInfoKHR, ##VkVideoFormatPropertiesKHR
        """,

        VkPhysicalDevice("physicalDevice", "the physical device from which to query the video format properties."),
        VkPhysicalDeviceVideoFormatInfoKHR.const.p("pVideoFormatInfo", "a pointer to a ##VkPhysicalDeviceVideoFormatInfoKHR structure specifying the usage and video profiles for which supported image formats and capabilities are returned."),
        AutoSize("pVideoFormatProperties")..Check(1)..uint32_t.p("pVideoFormatPropertyCount", "a pointer to an integer related to the number of video format properties available or queried, as described below."),
        nullable..VkVideoFormatPropertiesKHR.p("pVideoFormatProperties", "a pointer to an array of ##VkVideoFormatPropertiesKHR structures in which supported image formats and capabilities are returned.")
    )

    VkResult(
        "CreateVideoSessionKHR",
        """
        Creates a video session object.

        <h5>C Specification</h5>
        To create a video session object, call:

        <pre><code>
￿VkResult vkCreateVideoSessionKHR(
￿    VkDevice                                    device,
￿    const VkVideoSessionCreateInfoKHR*          pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkVideoSessionKHR*                          pVideoSession);</code></pre>

        <h5>Description</h5>
        The resulting video session object is said to be created with the video codec operation specified in {@code pCreateInfo→pVideoProfile→videoCodecOperation}.

        The name and version of the codec-specific Video Std header to be used with the video session is specified by the ##VkExtensionProperties structure pointed to by {@code pCreateInfo→pStdHeaderVersion}. If a non-existent or unsupported Video Std header version is specified in {@code pCreateInfo→pStdHeaderVersion→specVersion}, then this command returns #ERROR_VIDEO_STD_VERSION_NOT_SUPPORTED_KHR.

        Video session objects are created in <em>uninitialized</em> state. In order to transition the video session into <em>initial</em> state, the application <b>must</b> issue a #CmdControlVideoCodingKHR() command with ##VkVideoCodingControlInfoKHR{@code ::flags} including #VIDEO_CODING_CONTROL_RESET_BIT_KHR.

        Video session objects also maintain the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dpb-state-and-backing-store">state</a> of the DPB. The number of DPB slots usable with the created video session is specified in {@code pCreateInfo→maxDpbSlots}, and each slot is initially in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dpb-slot-states">inactive state</a>.

        Each <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dpb-slot">DPB slot</a> maintained by the created video session <b>can</b> refer to a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#reference-picture">reference picture</a> representing a video frame.

        In addition, if the {@code videoCodecOperation} member of the ##VkVideoProfileInfoKHR structure pointed to by {@code pCreateInfo→pVideoProfile} is #VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR and the {@code pictureLayout} member of the ##VkVideoDecodeH264ProfileInfoKHR structure provided in the ##VkVideoProfileInfoKHR{@code ::pNext} chain is not #VIDEO_DECODE_H264_PICTURE_LAYOUT_PROGRESSIVE_KHR, then the created video session supports <em>interlaced</em> frames and each <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dpb-slot">DPB slot</a> maintained by the created video session <b>can</b> instead refer to separate top field and bottom field <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#reference-picture">reference pictures</a> that together <b>can</b> represent a full video frame. In this case, it is up to the application, driven by the video content, whether it associates any individual DPB slot with separate top and/or bottom field pictures or a single picture representing a full frame.

        The created video session <b>can</b> be used to perform video coding operations using video frames up to the maximum size specified in {@code pCreateInfo→maxCodedExtent}. The minimum frame size allowed is implicitly derived from ##VkVideoCapabilitiesKHR{@code ::minCodedExtent}, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile specified by {@code pCreateInfo→pVideoProfile}. Accordingly, the created video session is said to be created with a {@code minCodedExtent} equal to that.

        In case of video session objects created with a video encode operation, implementations <b>may</b> return the #ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR error if any of the specified Video Std parameters do not adhere to the syntactic or semantic requirements of the used video compression standard, or if values derived from parameters according to the rules defined by the used video compression standard do not adhere to the capabilities of the video compression standard or the implementation.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Applications <b>should</b> not rely on the #ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR error being returned by any command as a means to verify Video Std parameters, as implementations are not required to report the error in any specific set of cases.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkVideoSessionCreateInfoKHR structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pVideoSession} <b>must</b> be a valid pointer to a {@code VkVideoSessionKHR} handle</li>
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
                <li>#ERROR_INITIALIZATION_FAILED</li>
                <li>#ERROR_VIDEO_STD_VERSION_NOT_SUPPORTED_KHR</li>
                <li>#ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkVideoSessionCreateInfoKHR
        """,

        VkDevice("device", "the logical device that creates the video session."),
        VkVideoSessionCreateInfoKHR.const.p("pCreateInfo", "a pointer to a ##VkVideoSessionCreateInfoKHR structure containing parameters to be used to create the video session."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkVideoSessionKHR.p("pVideoSession", "a pointer to a {@code VkVideoSessionKHR} handle in which the resulting video session object is returned.")
    )

    void(
        "DestroyVideoSessionKHR",
        """
        Destroy video session object.

        <h5>C Specification</h5>
        To destroy a video session, call:

        <pre><code>
￿void vkDestroyVideoSessionKHR(
￿    VkDevice                                    device,
￿    VkVideoSessionKHR                           videoSession,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code videoSession} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code videoSession} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code videoSession} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code videoSession} is not #NULL_HANDLE, {@code videoSession} <b>must</b> be a valid {@code VkVideoSessionKHR} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code videoSession} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code videoSession} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the video session."),
        VkVideoSessionKHR("videoSession", "the video session to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "GetVideoSessionMemoryRequirementsKHR",
        """
        Get the memory requirements for a video session.

        <h5>C Specification</h5>
        To determine the memory requirements for a video session object, call:

        <pre><code>
￿VkResult vkGetVideoSessionMemoryRequirementsKHR(
￿    VkDevice                                    device,
￿    VkVideoSessionKHR                           videoSession,
￿    uint32_t*                                   pMemoryRequirementsCount,
￿    VkVideoSessionMemoryRequirementsKHR*        pMemoryRequirements);</code></pre>

        <h5>Description</h5>
        If {@code pMemoryRequirements} is {@code NULL}, then the number of memory bindings required for the video session is returned in {@code pMemoryRequirementsCount}. Otherwise, {@code pMemoryRequirementsCount} <b>must</b> point to a variable set by the user with the number of elements in the {@code pMemoryRequirements} array, and on return the variable is overwritten with the number of memory binding requirements actually written to {@code pMemoryRequirements}. If {@code pMemoryRequirementsCount} is less than the number of memory bindings required for the video session, then at most {@code pMemoryRequirementsCount} elements will be written to {@code pMemoryRequirements}, and #INCOMPLETE will be returned, instead of #SUCCESS, to indicate that not all required memory binding requirements were returned.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code videoSession} <b>must</b> be a valid {@code VkVideoSessionKHR} handle</li>
            <li>{@code pMemoryRequirementsCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pMemoryRequirementsCount} is not 0, and {@code pMemoryRequirements} is not {@code NULL}, {@code pMemoryRequirements} <b>must</b> be a valid pointer to an array of {@code pMemoryRequirementsCount} ##VkVideoSessionMemoryRequirementsKHR structures</li>
            <li>{@code videoSession} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkVideoSessionMemoryRequirementsKHR
        """,

        VkDevice("device", "the logical device that owns the video session."),
        VkVideoSessionKHR("videoSession", "the video session to query."),
        AutoSize("pMemoryRequirements")..Check(1)..uint32_t.p("pMemoryRequirementsCount", "a pointer to an integer related to the number of memory binding requirements available or queried, as described below."),
        nullable..VkVideoSessionMemoryRequirementsKHR.p("pMemoryRequirements", "{@code NULL} or a pointer to an array of ##VkVideoSessionMemoryRequirementsKHR structures in which the memory binding requirements of the video session are returned.")
    )

    VkResult(
        "BindVideoSessionMemoryKHR",
        """
        Bind Video Memory.

        <h5>C Specification</h5>
        To attach memory to a video session object, call:

        <pre><code>
￿VkResult vkBindVideoSessionMemoryKHR(
￿    VkDevice                                    device,
￿    VkVideoSessionKHR                           videoSession,
￿    uint32_t                                    bindSessionMemoryInfoCount,
￿    const VkBindVideoSessionMemoryInfoKHR*      pBindSessionMemoryInfos);</code></pre>

        <h5>Description</h5>
        The valid usage statements below refer to the ##VkMemoryRequirements structure corresponding to a specific element of {@code pBindSessionMemoryInfos}, which is defined as follows:

        <ul>
            <li>If the {@code memoryBindIndex} member of the element of {@code pBindSessionMemoryInfos} in question matches the {@code memoryBindIndex} member of one of the elements returned in {@code pMemoryRequirements} when #GetVideoSessionMemoryRequirementsKHR() is called with the same {@code videoSession} and with {@code pMemoryRequirementsCount} equal to {@code bindSessionMemoryInfoCount}, then the {@code memoryRequirements} member of that element of {@code pMemoryRequirements} is the ##VkMemoryRequirements structure corresponding to the element of {@code pBindSessionMemoryInfos} in question.</li>
            <li>Otherwise the element of {@code pBindSessionMemoryInfos} in question is said to not have a corresponding ##VkMemoryRequirements structure.</li>
        </ul>

        <h5>Valid Usage</h5>
        <ul>
            <li>The memory binding of {@code videoSession} identified by the {@code memoryBindIndex} member of any element of {@code pBindSessionMemoryInfos} <b>must</b> not already be backed by a memory object</li>
            <li>The {@code memoryBindIndex} member of each element of {@code pBindSessionMemoryInfos} <b>must</b> be unique within {@code pBindSessionMemoryInfos}</li>
            <li>Each element of {@code pBindSessionMemoryInfos} <b>must</b> have a corresponding ##VkMemoryRequirements structure</li>
            <li>If an element of {@code pBindSessionMemoryInfos} has a corresponding ##VkMemoryRequirements structure, then the {@code memory} member of that element of {@code pBindSessionMemoryInfos} <b>must</b> have been allocated using one of the memory types allowed in the {@code memoryTypeBits} member of the corresponding ##VkMemoryRequirements structure</li>
            <li>If an element of {@code pBindSessionMemoryInfos} has a corresponding ##VkMemoryRequirements structure, then the {@code memoryOffset} member of that element of {@code pBindSessionMemoryInfos} <b>must</b> be an integer multiple of the {@code alignment} member of the corresponding ##VkMemoryRequirements structure</li>
            <li>If an element of {@code pBindSessionMemoryInfos} has a corresponding ##VkMemoryRequirements structure, then the {@code memorySize} member of that element of {@code pBindSessionMemoryInfos} <b>must</b> equal the {@code size} member of the corresponding ##VkMemoryRequirements structure</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code videoSession} <b>must</b> be a valid {@code VkVideoSessionKHR} handle</li>
            <li>{@code pBindSessionMemoryInfos} <b>must</b> be a valid pointer to an array of {@code bindSessionMemoryInfoCount} valid ##VkBindVideoSessionMemoryInfoKHR structures</li>
            <li>{@code bindSessionMemoryInfoCount} <b>must</b> be greater than 0</li>
            <li>{@code videoSession} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code videoSession} <b>must</b> be externally synchronized</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkBindVideoSessionMemoryInfoKHR
        """,

        VkDevice("device", "the logical device that owns the video session."),
        VkVideoSessionKHR("videoSession", "the video session to be bound with device memory."),
        AutoSize("pBindSessionMemoryInfos")..uint32_t("bindSessionMemoryInfoCount", "the number of elements in {@code pBindSessionMemoryInfos}."),
        VkBindVideoSessionMemoryInfoKHR.const.p("pBindSessionMemoryInfos", "a pointer to an array of {@code bindSessionMemoryInfoCount} ##VkBindVideoSessionMemoryInfoKHR structures specifying memory regions to be bound to specific memory bindings of the video session.")
    )

    VkResult(
        "CreateVideoSessionParametersKHR",
        """
        Creates video session parameters object.

        <h5>C Specification</h5>
        To create a video session parameters object, call:

        <pre><code>
￿VkResult vkCreateVideoSessionParametersKHR(
￿    VkDevice                                    device,
￿    const VkVideoSessionParametersCreateInfoKHR* pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkVideoSessionParametersKHR*                pVideoSessionParameters);</code></pre>

        <h5>Description</h5>
        The resulting video session parameters object is said to be created with the video codec operation {@code pCreateInfo→videoSession} was created with.

        If {@code pCreateInfo→videoSessionParametersTemplate} is not #NULL_HANDLE, then it will be used as a template for constructing the new video session parameters object. This happens by first adding any parameters according to the additional creation parameters provided in the {@code pCreateInfo→pNext} chain, followed by adding any parameters from the template object that have a key that does not match the key of any of the already added parameters.

        If {@code pCreateInfo→videoSession} was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR, then the created video session parameters object will initially contain the following sets of parameter entries:

        <ul>
            <li>
                {@code StdVideoH264SequenceParameterSet} structures representing <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-sps">H.264 SPS</a> entries, as follows:
                <ul>
                    <li>If the {@code pParametersAddInfo} member of the ##VkVideoDecodeH264SessionParametersCreateInfoKHR structure provided in the {@code pCreateInfo→pNext} chain is not {@code NULL}, then the set of {@code StdVideoH264SequenceParameterSet} entries specified in {@code pParametersAddInfo→pStdSPSs} are added first;</li>
                    <li>If {@code pCreateInfo→videoSessionParametersTemplate} is not #NULL_HANDLE, then each {@code StdVideoH264SequenceParameterSet} entry stored in it is copied to the created video session parameters object if the created object does not already contain such an entry with the same {@code seq_parameter_set_id}.</li>
                </ul>
            </li>
            <li>
                {@code StdVideoH264PictureParameterSet} structures representing <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-pps">H.264 PPS</a> entries, as follows:
                <ul>
                    <li>If the {@code pParametersAddInfo} member of the ##VkVideoDecodeH264SessionParametersCreateInfoKHR structure provided in the {@code pCreateInfo→pNext} chain is not {@code NULL}, then the set of {@code StdVideoH264PictureParameterSet} entries specified in {@code pParametersAddInfo→pStdPPSs} are added first;</li>
                    <li>If {@code pCreateInfo→videoSessionParametersTemplate} is not #NULL_HANDLE, then each {@code StdVideoH264PictureParameterSet} entry stored in it is copied to the created video session parameters object if the created object does not already contain such an entry with the same {@code seq_parameter_set_id} and {@code pic_parameter_set_id}.</li>
                </ul>
            </li>
        </ul>

        If {@code pCreateInfo→videoSession} was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR, then the created video session parameters object will initially contain the following sets of parameter entries:

        <ul>
            <li>
                {@code StdVideoH265VideoParameterSet} structures representing <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h265-vps">H.265 VPS</a> entries, as follows:
                <ul>
                    <li>If the {@code pParametersAddInfo} member of the ##VkVideoDecodeH265SessionParametersCreateInfoKHR structure provided in the {@code pCreateInfo→pNext} chain is not {@code NULL}, then the set of {@code StdVideoH265VideoParameterSet} entries specified in {@code pParametersAddInfo→pStdVPSs} are added first;</li>
                    <li>If {@code pCreateInfo→videoSessionParametersTemplate} is not #NULL_HANDLE, then each {@code StdVideoH265VideoParameterSet} entry stored in it is copied to the created video session parameters object if the created object does not already contain such an entry with the same {@code vps_video_parameter_set_id}.</li>
                </ul>
            </li>
            <li>
                {@code StdVideoH265SequenceParameterSet} structures representing <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h265-sps">H.265 SPS</a> entries, as follows:
                <ul>
                    <li>If the {@code pParametersAddInfo} member of the ##VkVideoDecodeH265SessionParametersCreateInfoKHR structure provided in the {@code pCreateInfo→pNext} chain is not {@code NULL}, then the set of {@code StdVideoH265SequenceParameterSet} entries specified in {@code pParametersAddInfo→pStdSPSs} are added first;</li>
                    <li>If {@code pCreateInfo→videoSessionParametersTemplate} is not #NULL_HANDLE, then each {@code StdVideoH265SequenceParameterSet} entry stored in it is copied to the created video session parameters object if the created object does not already contain such an entry with the same {@code sps_video_parameter_set_id} and {@code sps_seq_parameter_set_id}.</li>
                </ul>
            </li>
            <li>
                {@code StdVideoH265PictureParameterSet} structures representing <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h265-pps">H.265 PPS</a> entries, as follows:
                <ul>
                    <li>If the {@code pParametersAddInfo} member of the ##VkVideoDecodeH265SessionParametersCreateInfoKHR structure provided in the {@code pCreateInfo→pNext} chain is not {@code NULL}, then the set of {@code StdVideoH265PictureParameterSet} entries specified in {@code pParametersAddInfo→pStdPPSs} are added first;</li>
                    <li>If {@code pCreateInfo→videoSessionParametersTemplate} is not #NULL_HANDLE, then each {@code StdVideoH265PictureParameterSet} entry stored in it is copied to the created video session parameters object if the created object does not already contain such an entry with the same {@code sps_video_parameter_set_id}, {@code pps_seq_parameter_set_id}, and {@code pps_pic_parameter_set_id}.</li>
                </ul>
            </li>
        </ul>

        In case of video session parameters objects created with a video encode operation, implementations <b>may</b> return the #ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR error if any of the specified Video Std parameters do not adhere to the syntactic or semantic requirements of the used video compression standard, or if values derived from parameters according to the rules defined by the used video compression standard do not adhere to the capabilities of the video compression standard or the implementation.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Applications <b>should</b> not rely on the #ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR error being returned by any command as a means to verify Video Std parameters, as implementations are not required to report the error in any specific set of cases.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkVideoSessionParametersCreateInfoKHR structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pVideoSessionParameters} <b>must</b> be a valid pointer to a {@code VkVideoSessionParametersKHR} handle</li>
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
                <li>#ERROR_INITIALIZATION_FAILED</li>
                <li>#ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkVideoSessionParametersCreateInfoKHR
        """,

        VkDevice("device", "the logical device that creates the video session parameters object."),
        VkVideoSessionParametersCreateInfoKHR.const.p("pCreateInfo", "a pointer to ##VkVideoSessionParametersCreateInfoKHR structure containing parameters to be used to create the video session parameters object."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkVideoSessionParametersKHR.p("pVideoSessionParameters", "a pointer to a {@code VkVideoSessionParametersKHR} handle in which the resulting video session parameters object is returned.")
    )

    VkResult(
        "UpdateVideoSessionParametersKHR",
        """
        Update video session parameters object.

        <h5>C Specification</h5>
        To update video session parameters object with new parameters, call:

        <pre><code>
￿VkResult vkUpdateVideoSessionParametersKHR(
￿    VkDevice                                    device,
￿    VkVideoSessionParametersKHR                 videoSessionParameters,
￿    const VkVideoSessionParametersUpdateInfoKHR* pUpdateInfo);</code></pre>

        <h5>Description</h5>
        After a successful call to this command, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-session-parameters">update sequence counter</a> of {@code videoSessionParameters} is changed to the value specified in {@code pUpdateInfo→updateSequenceCount}.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note:</h5>
        As each update issued to a video session parameters object needs to specify the next available update sequence count value, concurrent updates of the same video session parameters object are inherently disallowed. However, recording video coding operations to command buffers referring to parameters previously added to the video session parameters object is allowed, even if there is a concurrent update in progress adding some new entries to the object.
        </div>

        If {@code videoSessionParameters} was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR and the {@code pUpdateInfo→pNext} chain includes a ##VkVideoDecodeH264SessionParametersAddInfoKHR structure, then this command adds the following parameter entries to {@code videoSessionParameters}:

        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-sps">H.264 SPS</a> entries specified in ##VkVideoDecodeH264SessionParametersAddInfoKHR{@code ::pStdSPSs}.</li>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-pps">H.264 PPS</a> entries specified in ##VkVideoDecodeH264SessionParametersAddInfoKHR{@code ::pStdPPSs}.</li>
        </ul>

        If {@code videoSessionParameters} was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR and the {@code pUpdateInfo→pNext} chain includes a ##VkVideoDecodeH265SessionParametersAddInfoKHR structure, then this command adds the following parameter entries to {@code videoSessionParameters}:

        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h265-vps">H.265 VPS</a> entries specified in ##VkVideoDecodeH265SessionParametersAddInfoKHR{@code ::pStdVPSs}.</li>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h265-sps">H.265 SPS</a> entries specified in ##VkVideoDecodeH265SessionParametersAddInfoKHR{@code ::pStdSPSs}.</li>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h265-pps">H.265 PPS</a> entries specified in ##VkVideoDecodeH265SessionParametersAddInfoKHR{@code ::pStdPPSs}.</li>
        </ul>

        In case of video session parameters objects created with a video encode operation, implementations <b>may</b> return the #ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR error if any of the specified Video Std parameters do not adhere to the syntactic or semantic requirements of the used video compression standard, or if values derived from parameters according to the rules defined by the used video compression standard do not adhere to the capabilities of the video compression standard or the implementation.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Applications <b>should</b> not rely on the #ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR error being returned by any command as a means to verify Video Std parameters, as implementations are not required to report the error in any specific set of cases.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code pUpdateInfo→updateSequenceCount} <b>must</b> equal the current <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-session-parameters">update sequence counter</a> of {@code videoSessionParameters} plus one</li>
            <li>If {@code videoSessionParameters} was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR and the {@code pNext} chain of {@code pUpdateInfo} includes a ##VkVideoDecodeH264SessionParametersAddInfoKHR structure, then {@code videoSessionParameters} <b>must</b> not already contain a {@code StdVideoH264SequenceParameterSet} entry with {@code seq_parameter_set_id} matching any of the elements of ##VkVideoDecodeH264SessionParametersAddInfoKHR{@code ::pStdSPSs}</li>
            <li>If {@code videoSessionParameters} was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR, then the number of {@code StdVideoH264SequenceParameterSet} entries already stored in it plus the value of the {@code stdSPSCount} member of the ##VkVideoDecodeH264SessionParametersAddInfoKHR structure included in the {@code pUpdateInfo→pNext} chain <b>must</b> be less than or equal to the ##VkVideoDecodeH264SessionParametersCreateInfoKHR{@code ::maxStdSPSCount} {@code videoSessionParameters} was created with</li>
            <li>If {@code videoSessionParameters} was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR and the {@code pNext} chain of {@code pUpdateInfo} includes a ##VkVideoDecodeH264SessionParametersAddInfoKHR structure, then {@code videoSessionParameters} <b>must</b> not already contain a {@code StdVideoH264PictureParameterSet} entry with both {@code seq_parameter_set_id} and {@code pic_parameter_set_id} matching any of the elements of ##VkVideoDecodeH264SessionParametersAddInfoKHR{@code ::pStdPPSs}</li>
            <li>If {@code videoSessionParameters} was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR, then the number of {@code StdVideoH264PictureParameterSet} entries already stored in it plus the value of the {@code stdPPSCount} member of the ##VkVideoDecodeH264SessionParametersAddInfoKHR structure included in the {@code pUpdateInfo→pNext} chain <b>must</b> be less than or equal to the ##VkVideoDecodeH264SessionParametersCreateInfoKHR{@code ::maxStdPPSCount} {@code videoSessionParameters} was created with</li>
            <li>If {@code videoSessionParameters} was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR and the {@code pNext} chain of {@code pUpdateInfo} includes a ##VkVideoDecodeH265SessionParametersAddInfoKHR structure, then {@code videoSessionParameters} <b>must</b> not already contain a {@code StdVideoH265VideoParameterSet} entry with {@code vps_video_parameter_set_id} matching any of the elements of ##VkVideoDecodeH265SessionParametersAddInfoKHR{@code ::pStdVPSs}</li>
            <li>If {@code videoSessionParameters} was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR, then the number of {@code StdVideoH265VideoParameterSet} entries already stored in it plus the value of the {@code stdVPSCount} member of the ##VkVideoDecodeH265SessionParametersAddInfoKHR structure included in the {@code pUpdateInfo→pNext} chain <b>must</b> be less than or equal to the ##VkVideoDecodeH265SessionParametersCreateInfoKHR{@code ::maxStdVPSCount} {@code videoSessionParameters} was created with</li>
            <li>If {@code videoSessionParameters} was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR and the {@code pNext} chain of {@code pUpdateInfo} includes a ##VkVideoDecodeH265SessionParametersAddInfoKHR structure, then {@code videoSessionParameters} <b>must</b> not already contain a {@code StdVideoH265SequenceParameterSet} entry with both {@code sps_video_parameter_set_id} and {@code sps_seq_parameter_set_id} matching any of the elements of ##VkVideoDecodeH265SessionParametersAddInfoKHR{@code ::pStdSPSs}</li>
            <li>If {@code videoSessionParameters} was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR, then the number of {@code StdVideoH265SequenceParameterSet} entries already stored in it plus the value of the {@code stdSPSCount} member of the ##VkVideoDecodeH265SessionParametersAddInfoKHR structure included in the {@code pUpdateInfo→pNext} chain <b>must</b> be less than or equal to the ##VkVideoDecodeH265SessionParametersCreateInfoKHR{@code ::maxStdSPSCount} {@code videoSessionParameters} was created with</li>
            <li>If {@code videoSessionParameters} was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR and the {@code pNext} chain of {@code pUpdateInfo} includes a ##VkVideoDecodeH265SessionParametersAddInfoKHR structure, then {@code videoSessionParameters} <b>must</b> not already contain a {@code StdVideoH265PictureParameterSet} entry with {@code sps_video_parameter_set_id}, {@code pps_seq_parameter_set_id}, and {@code pps_pic_parameter_set_id} all matching any of the elements of ##VkVideoDecodeH265SessionParametersAddInfoKHR{@code ::pStdPPSs}</li>
            <li>If {@code videoSessionParameters} was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR, then the number of {@code StdVideoH265PictureParameterSet} entries already stored in it plus the value of the {@code stdPPSCount} member of the ##VkVideoDecodeH265SessionParametersAddInfoKHR structure included in the {@code pUpdateInfo→pNext} chain <b>must</b> be less than or equal to the ##VkVideoDecodeH265SessionParametersCreateInfoKHR{@code ::maxStdPPSCount} {@code videoSessionParameters} was created with</li>
            <li>If {@code videoSessionParameters} was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT and the {@code pNext} chain of {@code pUpdateInfo} includes a ##VkVideoEncodeH264SessionParametersAddInfoEXT structure, then {@code videoSessionParameters} <b>must</b> not already contain a {@code StdVideoH264SequenceParameterSet} entry with {@code seq_parameter_set_id} matching any of the elements of ##VkVideoEncodeH264SessionParametersAddInfoEXT{@code ::pStdSPSs}</li>
            <li>If {@code videoSessionParameters} was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT and the {@code pNext} chain of {@code pUpdateInfo} includes a ##VkVideoEncodeH264SessionParametersAddInfoEXT structure, then {@code videoSessionParameters} <b>must</b> not already contain a {@code StdVideoH264PictureParameterSet} entry with both {@code seq_parameter_set_id} and {@code pic_parameter_set_id} matching any of the elements of ##VkVideoEncodeH264SessionParametersAddInfoEXT{@code ::pStdPPSs}</li>
            <li>If {@code videoSessionParameters} was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT and the {@code pNext} chain of {@code pUpdateInfo} includes a ##VkVideoEncodeH265SessionParametersAddInfoEXT structure, then {@code videoSessionParameters} <b>must</b> not already contain a {@code StdVideoH265VideoParameterSet} entry with {@code vps_video_parameter_set_id} matching any of the elements of ##VkVideoEncodeH265SessionParametersAddInfoEXT{@code ::pStdVPSs}</li>
            <li>If {@code videoSessionParameters} was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT and the {@code pNext} chain of {@code pUpdateInfo} includes a ##VkVideoEncodeH265SessionParametersAddInfoEXT structure, then {@code videoSessionParameters} <b>must</b> not already contain a {@code StdVideoH265SequenceParameterSet} entry with both {@code sps_video_parameter_set_id} and {@code sps_seq_parameter_set_id} matching any of the elements of ##VkVideoEncodeH265SessionParametersAddInfoEXT{@code ::pStdSPSs}</li>
            <li>If {@code videoSessionParameters} was created with the video codec operation #VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT and the {@code pNext} chain of {@code pUpdateInfo} includes a ##VkVideoEncodeH265SessionParametersAddInfoEXT structure, then {@code videoSessionParameters} <b>must</b> not already contain a {@code StdVideoH265PictureParameterSet} entry with {@code sps_video_parameter_set_id}, {@code pps_seq_parameter_set_id}, and {@code pps_pic_parameter_set_id} all matching any of the elements of ##VkVideoEncodeH265SessionParametersAddInfoEXT{@code ::pStdPPSs}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code videoSessionParameters} <b>must</b> be a valid {@code VkVideoSessionParametersKHR} handle</li>
            <li>{@code pUpdateInfo} <b>must</b> be a valid pointer to a valid ##VkVideoSessionParametersUpdateInfoKHR structure</li>
            <li>{@code videoSessionParameters} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
                <li>#ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkVideoSessionParametersUpdateInfoKHR
        """,

        VkDevice("device", "the logical device that updates the video session parameters."),
        VkVideoSessionParametersKHR("videoSessionParameters", "the video session parameters object to update."),
        VkVideoSessionParametersUpdateInfoKHR.const.p("pUpdateInfo", "a pointer to a ##VkVideoSessionParametersUpdateInfoKHR structure specifying the parameter update information.")
    )

    void(
        "DestroyVideoSessionParametersKHR",
        """
        Destroy video session parameters object.

        <h5>C Specification</h5>
        To destroy a video session parameters object, call:

        <pre><code>
￿void vkDestroyVideoSessionParametersKHR(
￿    VkDevice                                    device,
￿    VkVideoSessionParametersKHR                 videoSessionParameters,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code videoSessionParameters} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code videoSessionParameters} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code videoSessionParameters} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code videoSessionParameters} is not #NULL_HANDLE, {@code videoSessionParameters} <b>must</b> be a valid {@code VkVideoSessionParametersKHR} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code videoSessionParameters} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code videoSessionParameters} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the video session parameters object."),
        VkVideoSessionParametersKHR("videoSessionParameters", "the video session parameters object to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    void(
        "CmdBeginVideoCodingKHR",
        """
        Begin video coding scope.

        <h5>C Specification</h5>
        To begin a video coding scope, call:

        <pre><code>
￿void vkCmdBeginVideoCodingKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkVideoBeginCodingInfoKHR*            pBeginInfo);</code></pre>

        <h5>Description</h5>
        After beginning a video coding scope, the video session object specified in {@code pBeginInfo→videoSession} is <em>bound</em> to the command buffer, and the command buffer is ready to record video coding operations. Similarly, if {@code pBeginInfo→videoSessionParameters} is not #NULL_HANDLE, it is also <em>bound</em> to the command buffer, and video coding operations <b>can</b> refer to the codec-specific parameters stored in it.

        This command also establishes the set of <em>bound reference picture resources</em> that <b>can</b> be used as <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#reconstructed-picture">reconstructed pictures</a> or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#reference-picture">reference pictures</a> within the video coding scope. Each element of this set consists of a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-picture-resources">video picture resource</a> and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dpb-slot">DPB slot</a> index associated with it, if there is one.

        The set of bound reference picture resources is immutable within a video coding scope, however, the DPB slot index associated with any of the bound reference picture resources <b>can</b> change during the video coding scope in response to video coding operations.

        The ##VkVideoReferenceSlotInfoKHR structures provided as the elements of {@code pBeginInfo→pReferenceSlots} are interpreted by this command as follows:

        <ul>
            <li>If {@code slotIndex} is non-negative and {@code pPictureResource} is not {@code NULL}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-picture-resources">video picture resource</a> defined by the ##VkVideoPictureResourceInfoKHR structure pointed to by {@code pPictureResource} is added to the set of bound reference picture resources and is associated with the DPB slot index specified in {@code slotIndex}.</li>
            <li>If {@code slotIndex} is non-negative and {@code pPictureResource} is {@code NULL}, then the DPB slot with index {@code slotIndex} is <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dpb-slot-states">deactivated</a> by this command.</li>
            <li>If {@code slotIndex} is negative and {@code pPictureResource} is not {@code NULL}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-picture-resources">video picture resource</a> defined by the ##VkVideoPictureResourceInfoKHR structure pointed to by {@code pPictureResource} is added to the set of bound reference picture resources without an associated DPB slot. Such a picture resource <b>can</b> be subsequently used as a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#reconstructed-picture">reconstructed picture</a> to associate it with a DPB slot.</li>
            <li>If {@code slotIndex} is negative and {@code pPictureResource} is {@code NULL}, then the element is ignored.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note:</h5>
        It is possible for multiple bound reference picture resources to be associated with the same DPB slot index, or for a single bound reference picture to refer to multiple separate reference pictures. For example, in case of an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-profile">H.264 decode profile</a> with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-interlaced-support">interlaced frame support</a> a single DPB slot can refer to two separate pictures for the top and bottom fields. Depending on the picture layout used by the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-profile">H.264 decode profile</a>, the following special cases <b>may</b> arise:

        <ul>
            <li>If the picture layout is #VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_INTERLEAVED_LINES_BIT_KHR, then the top and bottom field pictures are physically co-located in the same video picture resource with even scanlines corresponding to the top field and odd scanlines corresponding to the bottom field, respectively.</li>
            <li>If the picture layout is #VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_SEPARATE_PLANES_BIT_KHR, then the top and bottom field pictures are stored in separate video picture resources (in separate subregions of the same image layer, in separate layers of the same image, or in entirely separate images), hence two elements of ##VkVideoBeginCodingInfoKHR{@code ::pReferenceSlots} <b>can</b> contain the same {@code slotIndex} but specify different video picture resources in their {@code pPictureResource} members.</li>
        </ul>
        </div>

        All non-negative {@code slotIndex} values specified in the elements of {@code pBeginInfo→pReferenceSlots} <b>must</b> identify DPB slots of the video session that are in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dpb-slot-states">active state</a> at the time this command is executed on the device.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note:</h5>
        The application does not have to specify an entry in {@code pBeginInfo→pReferenceSlots} corresponding to all active DPB slots of the video session, but only for those which are intended to be used in the video coding scope. This way the application can avoid any potential runtime cost associated with binding the corresponding picture resources to the command buffer.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support the video codec operation {@code pBeginInfo→videoSession} was created with, as returned by #GetPhysicalDeviceQueueFamilyProperties2() in ##VkQueueFamilyVideoPropertiesKHR{@code ::videoCodecOperations}</li>
            <li>There <b>must</b> be no <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#queries-operation-active">active</a> queries</li>
            <li>If {@code commandBuffer} is an unprotected command buffer and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, then {@code pBeginInfo→videoSession} <b>must</b> not have been created with #VIDEO_SESSION_CREATE_PROTECTED_CONTENT_BIT_KHR</li>
            <li>If {@code commandBuffer} is a protected command buffer and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, then {@code pBeginInfo→videoSession} <b>must</b> have been created with #VIDEO_SESSION_CREATE_PROTECTED_CONTENT_BIT_KHR</li>
            <li>If {@code commandBuffer} is an unprotected command buffer, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, and the {@code pPictureResource} member of any element of {@code pBeginInfo→pReferenceSlots} is not {@code NULL}, then {@code pPictureResource→imageViewBinding} for that element <b>must</b> not specify an image view created from a protected image</li>
            <li>If {@code commandBuffer} is a protected command buffer <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, and the {@code pPictureResource} member of any element of {@code pBeginInfo→pReferenceSlots} is not {@code NULL}, then {@code pPictureResource→imageViewBinding} for that element <b>must</b> specify an image view created from a protected image</li>
            <li>If the {@code slotIndex} member of any element of {@code pBeginInfo→pReferenceSlots} is not negative, then it <b>must</b> specify the index of a DPB slot that is in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dpb-slot-states">active state</a> in {@code pBeginInfo→videoSession} at the time the command is executed on the device</li>
            <li>Each video picture resource specified by any non-{@code NULL} {@code pPictureResource} member specified in the elements of {@code pBeginInfo→pReferenceSlots} for which {@code slotIndex} is not negative <b>must</b> <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-picture-resource-matching">match</a> one of the video picture resources currently associated with the DPB slot index of {@code pBeginInfo→videoSession} specified by {@code slotIndex} at the time the command is executed on the device</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pBeginInfo} <b>must</b> be a valid pointer to a valid ##VkVideoBeginCodingInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support decode, or encode operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
            <tbody><tr><td>Primary</td><td>Outside</td><td>Outside</td><td>Decode Encode</td><td>Action State</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkVideoBeginCodingInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer in which to record the command."),
        VkVideoBeginCodingInfoKHR.const.p("pBeginInfo", "a pointer to a ##VkVideoBeginCodingInfoKHR structure specifying the parameters of the video coding scope, including the video session and video session parameters object to use.")
    )

    void(
        "CmdEndVideoCodingKHR",
        """
        End video coding scope.

        <h5>C Specification</h5>
        To end a video coding scope, call:

        <pre><code>
￿void vkCmdEndVideoCodingKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkVideoEndCodingInfoKHR*              pEndCodingInfo);</code></pre>

        <h5>Description</h5>
        After ending a video coding scope, the video session object, the optional video session parameters object, and all <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#bound-reference-picture-resources">reference picture resources</a> previously bound by the corresponding #CmdBeginVideoCodingKHR() command are <em>unbound</em>.

        <h5>Valid Usage</h5>
        <ul>
            <li>There <b>must</b> be no <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#queries-operation-active">active</a> queries</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pEndCodingInfo} <b>must</b> be a valid pointer to a valid ##VkVideoEndCodingInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support decode, or encode operations</li>
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
            <tbody><tr><td>Primary</td><td>Outside</td><td>Inside</td><td>Decode Encode</td><td>Action State</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkVideoEndCodingInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer in which to record the command."),
        VkVideoEndCodingInfoKHR.const.p("pEndCodingInfo", "a pointer to a ##VkVideoEndCodingInfoKHR structure specifying the parameters for ending the video coding scope.")
    )

    void(
        "CmdControlVideoCodingKHR",
        """
        Control video coding parameters.

        <h5>C Specification</h5>
        To apply dynamic controls to the currently bound video session object, call:

        <pre><code>
￿void vkCmdControlVideoCodingKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkVideoCodingControlInfoKHR*          pCodingControlInfo);</code></pre>

        <h5>Description</h5>
        The control parameters provided in this call are applied to the video session at the time the command executes on the device and are in effect until a subsequent call to this command with the same video session bound changes the corresponding control parameters.

        A newly created video session <b>must</b> be reset before performing video coding operations using it by including #VIDEO_CODING_CONTROL_RESET_BIT_KHR in {@code pCodingControlInfo→flags}. The reset operation also returns all DPB slots of the video session to the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dpb-slot-states">inactive state</a>. Correspondingly, any DPB slot index associated with the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#bound-reference-picture-resources">bound reference picture resources</a> is removed.

        For encode sessions, the reset operation returns rate control configuration to implementation default settings and sets the video encode quality level to zero.

        After video coding operations are performed using a video session, the reset operation <b>can</b> be used to return the video session to the same <em>initial</em> state as after the reset of a newly created video session. This <b>can</b> be used, for example, when different video sequences are needed to be processed with the same video session object.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code pCodingControlInfo→flags} does not include #VIDEO_CODING_CONTROL_RESET_BIT_KHR, then the bound video session <b>must</b> not be in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-session-uninitialized">uninitialized</a> state at the time the command is executed on the device</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pCodingControlInfo} <b>must</b> be a valid pointer to a valid ##VkVideoCodingControlInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support decode, or encode operations</li>
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
            <tbody><tr><td>Primary</td><td>Outside</td><td>Inside</td><td>Decode Encode</td><td>Action</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkVideoCodingControlInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer in which to record the command."),
        VkVideoCodingControlInfoKHR.const.p("pCodingControlInfo", "a pointer to a ##VkVideoCodingControlInfoKHR structure specifying the control parameters.")
    )
}