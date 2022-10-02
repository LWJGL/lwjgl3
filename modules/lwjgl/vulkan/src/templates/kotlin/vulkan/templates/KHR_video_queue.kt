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
            <dd>7</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires support for Vulkan 1.1</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} to be enabled for any device-level functionality</li>
                <li>Requires {@link KHRSynchronization2 VK_KHR_synchronization2} to be enabled for any device-level functionality</li>
                <li>This is a <em>provisional</em> extension and <b>must</b> be used with caution. See the <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#boilerplate-provisional-header">description</a> of provisional header files for enablement and stability details.</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Tony Zlatinski <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_video_queue]%20@tzlatinski%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_video_queue%20extension*">tzlatinski</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2022-09-26</dd>

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

        "KHR_VIDEO_QUEUE_SPEC_VERSION".."7"
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
        VkVideoCodecOperationFlagBitsKHR - Video codec operation types

        <h5>Description</h5>
        Each decode or encode codec-specific extension extends this enumeration with the appropriate bit corresponding to the extension’s codec operation:

        <ul>
            <li>#VIDEO_CODEC_OPERATION_NONE_KHR indicates no support for any video codec operations.</li>
            <li>#VIDEO_CODEC_OPERATION_DECODE_H264_BIT_EXT specifies support for H.264 video decode operations.</li>
            <li>#VIDEO_CODEC_OPERATION_DECODE_H265_BIT_EXT specifies support for H.265 video decode operations.</li>
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
        VkVideoChromaSubsamplingFlagBitsKHR - Video chroma subsampling

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_CHROMA_SUBSAMPLING_MONOCHROME_BIT_KHR - the format is monochrome.</li>
            <li>#VIDEO_CHROMA_SUBSAMPLING_420_BIT_KHR - the format is 4:2:0 chroma subsampled. The two chroma components are each subsampled at a factor of 2 both horizontally and vertically.</li>
            <li>#VIDEO_CHROMA_SUBSAMPLING_422_BIT_KHR - the format is 4:2:2 chroma subsampled. The two chroma components are sampled at half the sample rate of luma. The horizontal chroma resolution is halved.</li>
            <li>#VIDEO_CHROMA_SUBSAMPLING_444_BIT_KHR - the format is 4:4:4 chroma sampled. Each of the three YCbCr components have the same sample rate, thus there is no chroma subsampling.</li>
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
        VkVideoComponentBitDepthFlagBitsKHR - Video component bit depth

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_COMPONENT_BIT_DEPTH_8_BIT_KHR - the format component bit depth is 8 bits.</li>
            <li>#VIDEO_COMPONENT_BIT_DEPTH_10_BIT_KHR - the format component bit depth is 10 bits.</li>
            <li>#VIDEO_COMPONENT_BIT_DEPTH_12_BIT_KHR - the format component bit depth is 12 bits.</li>
        </ul>
        """,

        "VIDEO_COMPONENT_BIT_DEPTH_INVALID_KHR".."0",
        "VIDEO_COMPONENT_BIT_DEPTH_8_BIT_KHR".enum(0x00000001),
        "VIDEO_COMPONENT_BIT_DEPTH_10_BIT_KHR".enum(0x00000004),
        "VIDEO_COMPONENT_BIT_DEPTH_12_BIT_KHR".enum(0x00000010)
    )

    EnumConstant(
        """
        VkVideoCapabilityFlagBitsKHR - Video Decode and Encode Capability Flags

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_CAPABILITY_PROTECTED_CONTENT_BIT_KHR - the decode or encode session supports protected content.</li>
            <li>#VIDEO_CAPABILITY_SEPARATE_REFERENCE_IMAGES_BIT_KHR - the DPB or Reconstructed Video Picture Resources for the video session <b>may</b> be created as a separate {@code VkImage} for each DPB picture. If not supported, the DPB <b>must</b> be created as single multi-layered image where each layer represents one of the DPB Video Picture Resources.</li>
        </ul>
        """,

        "VIDEO_CAPABILITY_PROTECTED_CONTENT_BIT_KHR".enum(0x00000001),
        "VIDEO_CAPABILITY_SEPARATE_REFERENCE_IMAGES_BIT_KHR".enum(0x00000002)
    )

    EnumConstant(
        """
        VkVideoSessionCreateFlagBitsKHR - Video decode or encode video session creation flags

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_SESSION_CREATE_PROTECTED_CONTENT_BIT_KHR - create the video session for use with protected video content</li>
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
            <li>#VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_LAYER_BIT_KHR indicates that the coding control parameters include video encode rate control layer parameters (see ##VkVideoEncodeRateControlLayerInfoKHR).</li>
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
        </ul>
        """,

        "QUERY_RESULT_STATUS_ERROR_KHR".."-1",
        "QUERY_RESULT_STATUS_NOT_READY_KHR".."0",
        "QUERY_RESULT_STATUS_COMPLETE_KHR".."1"
    )

    VkResult(
        "GetPhysicalDeviceVideoCapabilitiesKHR",
        """
        Query video decode or encode capabilities.

        <h5>C Specification</h5>
        To query video decode or encode capabilities for a specific codec, call:

        <pre><code>
￿VkResult vkGetPhysicalDeviceVideoCapabilitiesKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkVideoProfileInfoKHR*                pVideoProfile,
￿    VkVideoCapabilitiesKHR*                     pCapabilities);</code></pre>

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

        VkPhysicalDevice("physicalDevice", "the physical device whose video decode or encode capabilities will be queried."),
        VkVideoProfileInfoKHR.const.p("pVideoProfile", "a pointer to a ##VkVideoProfileInfoKHR structure with a chained codec-operation specific video profile structure."),
        VkVideoCapabilitiesKHR.p("pCapabilities", "a pointer to a ##VkVideoCapabilitiesKHR structure in which the capabilities are returned.")
    )

    VkResult(
        "GetPhysicalDeviceVideoFormatPropertiesKHR",
        """
        Query supported Video Decode and Encode image formats.

        <h5>C Specification</h5>
        To enumerate the supported output, input and DPB image formats for a specific codec operation and video profile, call:

        <pre><code>
￿VkResult vkGetPhysicalDeviceVideoFormatPropertiesKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkPhysicalDeviceVideoFormatInfoKHR*   pVideoFormatInfo,
￿    uint32_t*                                   pVideoFormatPropertyCount,
￿    VkVideoFormatPropertiesKHR*                 pVideoFormatProperties);</code></pre>

        <h5>Description</h5>
        If {@code pVideoFormatProperties} is {@code NULL}, then the number of video format properties supported for the given {@code physicalDevice} is returned in {@code pVideoFormatPropertyCount}. Otherwise, {@code pVideoFormatPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pVideoFormatProperties} array, and on return the variable is overwritten with the number of values actually written to {@code pVideoFormatProperties}. If the value of {@code pVideoFormatPropertyCount} is less than the number of video format properties supported, at most {@code pVideoFormatPropertyCount} values will be written to {@code pVideoFormatProperties}, and #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available values were returned.

        If an implementation reports #VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR is supported but #VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR is not supported in ##VkVideoDecodeCapabilitiesKHR{@code ::flags}, then to query for video format properties for decode DPB or output, ##VkPhysicalDeviceVideoFormatInfoKHR{@code ::imageUsage} <b>must</b> have both #IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR and #IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR set. Otherwise, the call will fail with #ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR.

        If an implementation reports #VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR is supported but #VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR is not supported in ##VkVideoDecodeCapabilitiesKHR{@code ::flags}, then to query for video format properties for decode DPB, ##VkPhysicalDeviceVideoFormatInfoKHR{@code ::imageUsage} <b>must</b> have #IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR set and #IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR not set. Otherwise, the call will fail with #ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR. Similarly, to query for video format properties for decode output, ##VkPhysicalDeviceVideoFormatInfoKHR{@code ::imageUsage} <b>must</b> have #IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR set and #IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR not set. Otherwise, the call will fail with #ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR.

        The {@code imageUsage} member of the ##VkPhysicalDeviceVideoFormatInfoKHR structure specifies the expected video usage flags that the returned video formats <b>must</b> support. Correspondingly, the {@code imageUsageFlags} member of each ##VkVideoFormatPropertiesKHR structure returned will contain at least the same set of image usage flags.

        If the implementation supports using video input, output, or DPB images of a particular format in operations other than video decode/encode then the {@code imageUsageFlags} member of the corresponding ##VkVideoFormatPropertiesKHR structure returned will include additional image usage flags indicating that.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note:</h5>
        For most use cases, only decode or encode related usage flags are going to be specified. For a use case such as transcode, if the image were to be shared between decode and encode session(s), then both decode and encode related usage flags <b>can</b> be set.
        </div>

        Video format properties are always queried with respect to a specific set of video profiles, as defined by the ##VkVideoProfileInfoKHR structure. These are specified by chaining the ##VkVideoProfileListInfoKHR structure to {@code pVideoFormatInfo}.

        For most use cases, the images are used by a single video session and a single video profile is provided. For a use case such as transcode, where a decode session output image <b>can</b> be used as encode input in one or more encode sessions, multiple video profiles corresponding to the video sessions that will share the image <b>must</b> be provided.

        If any of the profiles specified via ##VkVideoProfileListInfoKHR{@code ::pProfiles} are not supported, then {@code vkGetPhysicalDeviceVideoFormatPropertiesKHR} returns one of the <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-profile-error-codes">video-profile-specific error codes</a>. Furthermore, if ##VkPhysicalDeviceVideoFormatInfoKHR{@code ::imageUsage} includes any image usage flags not supported by the specified video profiles then {@code vkGetPhysicalDeviceVideoFormatPropertiesKHR} returns #ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR.

        Multiple ##VkVideoFormatPropertiesKHR entries <b>may</b> be returned with the same {@code format} member with different {@code componentMapping}, {@code imageType}, or {@code imageTiling} values, as described later.

        In addition, a different set of ##VkVideoFormatPropertiesKHR entries <b>may</b> be returned depending on the {@code imageUsage} member of the ##VkPhysicalDeviceVideoFormatInfoKHR structure, even for the same set of video profiles, for example, based on whether encode input, encode DPB, decode output, and/or decode DPB usage is requested.

        The application <b>can</b> select the parameters returned in the ##VkVideoFormatPropertiesKHR entries and use compatible parameters when creating the input, output, and DPB images. The implementation will report all image creation and usage flags that are valid for images used with the requested video profiles but applications <b>should</b> create images only with those that are necessary for the particular use case.

        Before creating an image, the application <b>can</b> obtain the complete set of supported image format features by calling #GetPhysicalDeviceImageFormatProperties2() using parameters derived from the members of one of the reported ##VkVideoFormatPropertiesKHR entries and adding the same ##VkVideoProfileListInfoKHR structure to the {@code pNext} chain of ##VkPhysicalDeviceImageFormatInfo2.

        The {@code componentMapping} member of ##VkVideoFormatPropertiesKHR defines the ordering of the Y′C<sub>B</sub>C<sub>R</sub> color channels from the perspective of the video codec operations specified in ##VkVideoProfileListInfoKHR. For example, if the implementation produces video decode output with the format #FORMAT_G8_B8R8_2PLANE_420_UNORM where the blue and red chrominance channels are swapped then the {@code componentMapping} member of the corresponding ##VkVideoFormatPropertiesKHR structure will have the following member values:

        <pre><code>
￿components.r = VK_COMPONENT_SWIZZLE_B;        // Cb component
￿components.g = VK_COMPONENT_SWIZZLE_IDENTITY; // Y component
￿components.b = VK_COMPONENT_SWIZZLE_R;        // Cr component
￿components.a = VK_COMPONENT_SWIZZLE_IDENTITY; // unused, defaults to 1.0</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code pNext} chain of {@code pVideoFormatInfo} <b>must</b> include a valid ##VkVideoProfileListInfoKHR structure with {@code profileCount} greater than 0</li>
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

        VkPhysicalDevice("physicalDevice", "the physical device being queried."),
        VkPhysicalDeviceVideoFormatInfoKHR.const.p("pVideoFormatInfo", "a pointer to a ##VkPhysicalDeviceVideoFormatInfoKHR structure specifying the codec and video profile for which information is returned."),
        AutoSize("pVideoFormatProperties")..Check(1)..uint32_t.p("pVideoFormatPropertyCount", "a pointer to an integer related to the number of video format properties available or queried, as described below."),
        nullable..VkVideoFormatPropertiesKHR.p("pVideoFormatProperties", "a pointer to an array of ##VkVideoFormatPropertiesKHR structures in which supported formats and image parameters are returned.")
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
        Video session objects are created in <em>uninitialized</em> state. In order to transition the video session into <em>initial</em> state, the application <b>must</b> issue a #CmdControlVideoCodingKHR() command with the {@code flags} member of ##VkVideoCodingControlInfoKHR including #VIDEO_CODING_CONTROL_RESET_BIT_KHR.

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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkVideoSessionCreateInfoKHR
        """,

        VkDevice("device", "the logical device that creates the decode or encode session object."),
        VkVideoSessionCreateInfoKHR.const.p("pCreateInfo", "a pointer to a ##VkVideoSessionCreateInfoKHR structure containing parameters specifying the creation of the decode or encode session."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkVideoSessionKHR.p("pVideoSession", "a pointer to a {@code VkVideoSessionKHR} structure specifying the decode or encode video session object which will be created by this function when it returns #SUCCESS")
    )

    void(
        "DestroyVideoSessionKHR",
        """
        Destroy decode session object.

        <h5>C Specification</h5>
        To destroy a decode session object, call:

        <pre><code>
￿void vkDestroyVideoSessionKHR(
￿    VkDevice                                    device,
￿    VkVideoSessionKHR                           videoSession,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

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

        VkDevice("device", "the device that was used for the creation of the video session."),
        VkVideoSessionKHR("videoSession", "the decode or encode video session to be destroyed."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "GetVideoSessionMemoryRequirementsKHR",
        """
        Get Memory Requirements.

        <h5>C Specification</h5>
        To get memory requirements for a video session, call:

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

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_INITIALIZATION_FAILED</li>
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
                <li>#ERROR_INITIALIZATION_FAILED</li>
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
        Creates video session video session parameter object.

        <h5>C Specification</h5>
        To create a video session parameters object, call:

        <pre><code>
￿VkResult vkCreateVideoSessionParametersKHR(
￿    VkDevice                                    device,
￿    const VkVideoSessionParametersCreateInfoKHR* pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkVideoSessionParametersKHR*                pVideoSessionParameters);</code></pre>

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
                <li>#ERROR_INITIALIZATION_FAILED</li>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_TOO_MANY_OBJECTS</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkVideoSessionParametersCreateInfoKHR
        """,

        VkDevice("device", "the logical device that was used for the creation of the video session object."),
        VkVideoSessionParametersCreateInfoKHR.const.p("pCreateInfo", "a pointer to ##VkVideoSessionParametersCreateInfoKHR structure specifying the video session parameters."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkVideoSessionParametersKHR.p("pVideoSessionParameters", "a pointer to a {@code VkVideoSessionParametersKHR} handle in which the video session parameters object is returned.")
    )

    VkResult(
        "UpdateVideoSessionParametersKHR",
        """
        Update video session video session parameter object.

        <h5>C Specification</h5>
        To update, add, or remove video session parameters state, call:

        <pre><code>
￿VkResult vkUpdateVideoSessionParametersKHR(
￿    VkDevice                                    device,
￿    VkVideoSessionParametersKHR                 videoSessionParameters,
￿    const VkVideoSessionParametersUpdateInfoKHR* pUpdateInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code videoSessionParameters} <b>must</b> be a valid {@code VkVideoSessionParametersKHR} handle</li>
            <li>{@code pUpdateInfo} <b>must</b> be a valid pointer to a valid ##VkVideoSessionParametersUpdateInfoKHR structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_INITIALIZATION_FAILED</li>
                <li>#ERROR_TOO_MANY_OBJECTS</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkVideoSessionParametersUpdateInfoKHR
        """,

        VkDevice("device", "the logical device that was used for the creation of the video session object."),
        VkVideoSessionParametersKHR("videoSessionParameters", "the video session parameters object that is going to be updated."),
        VkVideoSessionParametersUpdateInfoKHR.const.p("pUpdateInfo", "a pointer to a ##VkVideoSessionParametersUpdateInfoKHR structure containing the session parameters update information.")
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

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code videoSessionParameters} is not #NULL_HANDLE, {@code videoSessionParameters} <b>must</b> be a valid {@code VkVideoSessionParametersKHR} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code videoSessionParameters} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the device the video session parameters object was created with."),
        VkVideoSessionParametersKHR("videoSessionParameters", "the video session parameters object to be destroyed."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    void(
        "CmdBeginVideoCodingKHR",
        """
        Start decode jobs.

        <h5>C Specification</h5>
        To begin a video coding scope, call:

        <pre><code>
￿void vkCmdBeginVideoCodingKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkVideoBeginCodingInfoKHR*            pBeginInfo);</code></pre>

        <h5>Description</h5>
        After beginning a video coding scope, the session object specified by the {@code videoSession} member of ##VkVideoBeginCodingInfoKHR is <em>bound</em> to the command buffer, and the command buffer is ready to record video coding operations.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pBeginInfo} <b>must</b> be a valid pointer to a valid ##VkVideoBeginCodingInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
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
            <thead><tr><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Outside</td><td>Outside</td><td>Decode Encode</td><td>Action State</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkVideoBeginCodingInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer to be used when recording commands for the video decode or encode operations."),
        VkVideoBeginCodingInfoKHR.const.p("pBeginInfo", "a pointer to a ##VkVideoBeginCodingInfoKHR structure.")
    )

    void(
        "CmdEndVideoCodingKHR",
        """
        End decode jobs.

        <h5>C Specification</h5>
        To end a video coding scope, call:

        <pre><code>
￿void vkCmdEndVideoCodingKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkVideoEndCodingInfoKHR*              pEndCodingInfo);</code></pre>

        <h5>Description</h5>
        After ending a video coding scope, the session object previously bound by the corresponding #CmdBeginVideoCodingKHR() command is <em>unbound</em>.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pEndCodingInfo} <b>must</b> be a valid pointer to a valid ##VkVideoEndCodingInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
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
            <thead><tr><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Outside</td><td>Inside</td><td>Decode Encode</td><td>Action State</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkVideoEndCodingInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer to be filled by this function."),
        VkVideoEndCodingInfoKHR.const.p("pEndCodingInfo", "a pointer to a ##VkVideoEndCodingInfoKHR structure.")
    )

    void(
        "CmdControlVideoCodingKHR",
        """
        Set encode rate control parameters.

        <h5>C Specification</h5>
        To apply dynamic controls to the currently bound video session object, call:

        <pre><code>
￿void vkCmdControlVideoCodingKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkVideoCodingControlInfoKHR*          pCodingControlInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pCodingControlInfo} <b>must</b> be a valid pointer to a valid ##VkVideoCodingControlInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
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
            <thead><tr><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Outside</td><td>Inside</td><td>Decode Encode</td><td>Action</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkVideoCodingControlInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer to be filled by this function."),
        VkVideoCodingControlInfoKHR.const.p("pCodingControlInfo", "a pointer to a ##VkVideoCodingControlInfoKHR structure.")
    )
}