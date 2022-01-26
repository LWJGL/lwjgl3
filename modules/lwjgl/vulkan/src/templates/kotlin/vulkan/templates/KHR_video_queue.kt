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
        <ul>
            <li>{@code VkVideoSessionKHR}</li>
            <li>{@code VkVideoSessionParametersKHR}</li>
        </ul>

        <h5>VK_KHR_video_queue</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_video_queue}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>24</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
                <li>Requires {@link KHRSamplerYcbcrConversion VK_KHR_sampler_ycbcr_conversion}</li>
                <li>This is a <em>provisional</em> extension and <b>must</b> be used with caution. See the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#boilerplate-provisional-header">description</a> of provisional header files for enablement and stability details.</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Tony Zlatinski <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_video_queue]%20@tzlatinski%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_video_queue%20extension%3E%3E">tzlatinski</a></li>
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
                <li>George Hao, AMD</li>
                <li>Jake Beju, AMD</li>
                <li>Piers Daniell, NVIDIA</li>
                <li>Srinath Kumarapuram, NVIDIA</li>
                <li>Tobias Hector, AMD</li>
                <li>Tony Zlatinski, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_VIDEO_QUEUE_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "KHR_VIDEO_QUEUE_EXTENSION_NAME".."VK_KHR_video_queue"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_VIDEO_PROFILE_KHR".."1000023000",
        "STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR".."1000023001",
        "STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_KHR".."1000023002",
        "STRUCTURE_TYPE_VIDEO_GET_MEMORY_PROPERTIES_KHR".."1000023003",
        "STRUCTURE_TYPE_VIDEO_BIND_MEMORY_KHR".."1000023004",
        "STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR".."1000023005",
        "STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR".."1000023006",
        "STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_UPDATE_INFO_KHR".."1000023007",
        "STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR".."1000023008",
        "STRUCTURE_TYPE_VIDEO_END_CODING_INFO_KHR".."1000023009",
        "STRUCTURE_TYPE_VIDEO_CODING_CONTROL_INFO_KHR".."1000023010",
        "STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_KHR".."1000023011",
        "STRUCTURE_TYPE_VIDEO_QUEUE_FAMILY_PROPERTIES_2_KHR".."1000023012",
        "STRUCTURE_TYPE_VIDEO_PROFILES_KHR".."1000023013",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR".."1000023014",
        "STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR".."1000023015",
        "STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_2_KHR".."1000023016"
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
        """
        VkVideoCodecOperationFlagBitsKHR - Video codec operation types

        <h5>Description</h5>
        Each decode or encode codec-specific extension extends this enumeration with the appropriate bit corresponding to the extension’s codec operation:

        <ul>
            <li>#VIDEO_CODEC_OPERATION_INVALID_BIT_KHR - No video operations are supported for this queue family.</li>
            <li>#VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT - H.264 video encode operations are supported by this queue family.</li>
            <li>#VIDEO_CODEC_OPERATION_DECODE_H264_BIT_EXT - H.264 video decode operations are supported by this queue family.</li>
            <li>#VIDEO_CODEC_OPERATION_DECODE_H265_BIT_EXT - H.265 video decode operations are supported by this queue family.</li>
        </ul>

        <h5>See Also</h5>
        ##VkVideoProfileKHR
        """,

        "VIDEO_CODEC_OPERATION_INVALID_BIT_KHR".."0"
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

        "VIDEO_CHROMA_SUBSAMPLING_INVALID_BIT_KHR".."0",
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

        "VIDEO_SESSION_CREATE_DEFAULT_KHR".."0",
        "VIDEO_SESSION_CREATE_PROTECTED_CONTENT_BIT_KHR".enum(0x00000001)
    )

    EnumConstant(
        """
        VkVideoCodingControlFlagBitsKHR - Video Coding Control Command Flags

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_CODING_CONTROL_DEFAULT_KHR indicates a request for the coding control paramaters to be applied to the current state of the bound video session.</li>
            <li>#VIDEO_CODING_CONTROL_RESET_BIT_KHR indicates a request for the bound video session device context to be reset before the coding control parameters are applied.</li>
        </ul>

        A newly created video session <b>must</b> be reset before use for video decode or encode operations. The reset operation returns all session DPB slots to the unused state (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#video-session-dpb-slot-states">DPB Slot States</a>). For encode sessions, the reset operation returns rate control configuration to implementation default settings. After decode or encode operations are performed on a session, the reset operation <b>may</b> be used to return the video session device context to the same initial state as after the reset of a newly created video session. This <b>may</b> be used when different video sequences are processed with the same session.
        """,

        "VIDEO_CODING_CONTROL_DEFAULT_KHR".."0",
        "VIDEO_CODING_CONTROL_RESET_BIT_KHR".enum(0x00000001)
    )

    EnumConstant(
        """
        VkVideoCodingQualityPresetFlagBitsKHR - Video codec profile types

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_CODING_QUALITY_PRESET_NORMAL_BIT_KHR defines normal decode case.</li>
            <li>#VIDEO_CODING_QUALITY_PRESET_POWER_BIT_KHR defines power efficient case.</li>
            <li>#VIDEO_CODING_QUALITY_PRESET_QUALITY_BIT_KHR defines quality focus case.</li>
        </ul>
        """,

        "VIDEO_CODING_QUALITY_PRESET_NORMAL_BIT_KHR".enum(0x00000001),
        "VIDEO_CODING_QUALITY_PRESET_POWER_BIT_KHR".enum(0x00000002),
        "VIDEO_CODING_QUALITY_PRESET_QUALITY_BIT_KHR".enum(0x00000004)
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
￿    const VkVideoProfileKHR*                    pVideoProfile,
￿    VkVideoCapabilitiesKHR*                     pCapabilities);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pVideoProfile} <b>must</b> be a valid pointer to a valid ##VkVideoProfileKHR structure</li>
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
                <li>#ERROR_EXTENSION_NOT_PRESENT</li>
                <li>#ERROR_INITIALIZATION_FAILED</li>
                <li>#ERROR_FEATURE_NOT_PRESENT</li>
                <li>#ERROR_FORMAT_NOT_SUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkVideoCapabilitiesKHR, ##VkVideoProfileKHR
        """,

        VkPhysicalDevice("physicalDevice", "the physical device whose video decode or encode capabilities will be queried."),
        VkVideoProfileKHR.const.p("pVideoProfile", "a pointer to a ##VkVideoProfileKHR structure with a chained codec-operation specific video profile structure."),
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

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code imageUsage} enum of ##VkPhysicalDeviceVideoFormatInfoKHR <b>must</b> contain at least one of the following video image usage bit(s): #IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR, #IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR, #IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR, or #IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note:</h5>
        For most use cases, only decode or encode related usage flags are going to be specified. For a use case such as transcode, if the image were to be shared between decode and encode session(s), then both decode and encode related usage flags <b>can</b> be set.
        </div>

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
                <li>#ERROR_EXTENSION_NOT_PRESENT</li>
                <li>#ERROR_INITIALIZATION_FAILED</li>
                <li>#ERROR_FORMAT_NOT_SUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkPhysicalDeviceVideoFormatInfoKHR, ##VkVideoFormatPropertiesKHR
        """,

        VkPhysicalDevice("physicalDevice", "the physical device being queried."),
        VkPhysicalDeviceVideoFormatInfoKHR.const.p("pVideoFormatInfo", "a pointer to a ##VkPhysicalDeviceVideoFormatInfoKHR structure specifying the codec and video profile for which information is returned."),
        AutoSize("pVideoFormatProperties")..Check(1)..uint32_t.p("pVideoFormatPropertyCount", "a pointer to an integer related to the number of video format properties available or queried, as described below."),
        nullable..VkVideoFormatPropertiesKHR.p("pVideoFormatProperties", "a pointer to an array of ##VkVideoFormatPropertiesKHR structures in which supported formats are returned.")
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
                <li>#ERROR_INCOMPATIBLE_DRIVER</li>
                <li>#ERROR_FEATURE_NOT_PRESENT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkVideoSessionCreateInfoKHR
        """,

        VkDevice("device", "the logical device that creates the decode or encode session object."),
        VkVideoSessionCreateInfoKHR.const.p("pCreateInfo", "a pointer to a ##VkVideoSessionCreateInfoKHR structure containing parameters specifying the creation of the decode or encode session."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
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
            <li>{@code videoSession} <b>must</b> be a valid {@code VkVideoSessionKHR} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code videoSession} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the device that was used for the creation of the video session."),
        VkVideoSessionKHR("videoSession", "the decode or encode video session to be destroyed."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
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
￿    uint32_t*                                   pVideoSessionMemoryRequirementsCount,
￿    VkVideoGetMemoryPropertiesKHR*              pVideoSessionMemoryRequirements);</code></pre>

        <h5>Description</h5>
        If {@code pVideoSessionMemoryRequirements} is {@code NULL}, then the number of memory heap types required for the video session is returned in {@code pVideoSessionMemoryRequirementsCount}. Otherwise, {@code pVideoSessionMemoryRequirementsCount} <b>must</b> point to a variable set by the user with the number of elements in the {@code pVideoSessionMemoryRequirements} array, and on return the variable is overwritten with the number of formats actually written to {@code pVideoSessionMemoryRequirements}. If {@code pVideoSessionMemoryRequirementsCount} is less than the number of memory heap types required for the video session, then at most {@code pVideoSessionMemoryRequirementsCount} elements will be written to {@code pVideoSessionMemoryRequirements}, and #INCOMPLETE will be returned, instead of #SUCCESS, to indicate that not all required memory heap types were returned.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code videoSession} <b>must</b> be a valid {@code VkVideoSessionKHR} handle</li>
            <li>{@code pVideoSessionMemoryRequirementsCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pVideoSessionMemoryRequirementsCount} is not 0, and {@code pVideoSessionMemoryRequirements} is not {@code NULL}, {@code pVideoSessionMemoryRequirements} <b>must</b> be a valid pointer to an array of {@code pVideoSessionMemoryRequirementsCount} ##VkVideoGetMemoryPropertiesKHR structures</li>
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
        ##VkVideoGetMemoryPropertiesKHR
        """,

        VkDevice("device", "the logical device that owns the video session."),
        VkVideoSessionKHR("videoSession", "the video session to query."),
        AutoSize("pVideoSessionMemoryRequirements")..Check(1)..uint32_t.p("pVideoSessionMemoryRequirementsCount", "a pointer to an integer related to the number of memory heap requirements available or queried, as described below."),
        nullable..VkVideoGetMemoryPropertiesKHR.p("pVideoSessionMemoryRequirements", "{@code NULL} or a pointer to an array of ##VkVideoGetMemoryPropertiesKHR structures in which the memory heap requirements of the video session are returned.")
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
￿    uint32_t                                    videoSessionBindMemoryCount,
￿    const VkVideoBindMemoryKHR*                 pVideoSessionBindMemories);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code videoSession} <b>must</b> be a valid {@code VkVideoSessionKHR} handle</li>
            <li>{@code pVideoSessionBindMemories} <b>must</b> be a valid pointer to an array of {@code videoSessionBindMemoryCount} valid ##VkVideoBindMemoryKHR structures</li>
            <li>{@code videoSessionBindMemoryCount} <b>must</b> be greater than 0</li>
            <li>{@code videoSession} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
        ##VkVideoBindMemoryKHR
        """,

        VkDevice("device", "the logical device that owns the video session’s memory."),
        VkVideoSessionKHR("videoSession", "the video session to be bound with device memory."),
        AutoSize("pVideoSessionBindMemories")..uint32_t("videoSessionBindMemoryCount", "the number of {@code pVideoSessionBindMemories} to be bound."),
        VkVideoBindMemoryKHR.const.p("pVideoSessionBindMemories", "a pointer to an array of ##VkVideoBindMemoryKHR structures specifying memory regions to be bound to a device memory heap.")
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
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
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
        VkVideoSessionParametersKHR("videoSessionParameters", "the video session object that is going to be updated."),
        VkVideoSessionParametersUpdateInfoKHR.const.p("pUpdateInfo", "a pointer to a ##VkVideoSessionParametersUpdateInfoKHR structure containing the session parameters update information.")
    )

    void(
        "DestroyVideoSessionParametersKHR",
        """
        Destroy video session parameters object.

        <h5>C Specification</h5>
        To destroy a video session object, call:

        <pre><code>
￿void vkDestroyVideoSessionParametersKHR(
￿    VkDevice                                    device,
￿    VkVideoSessionParametersKHR                 videoSessionParameters,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code videoSessionParameters} <b>must</b> be a valid {@code VkVideoSessionParametersKHR} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the device the video session was created with."),
        VkVideoSessionParametersKHR("videoSessionParameters", "the video session parameters object to be destroyed."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    void(
        "CmdBeginVideoCodingKHR",
        """
        Start decode jobs.

        <h5>C Specification</h5>
        To start video decode or encode operations, call:

        <pre><code>
￿void vkCmdBeginVideoCodingKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkVideoBeginCodingInfoKHR*            pBeginInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pBeginInfo} <b>must</b> be a valid pointer to a valid ##VkVideoBeginCodingInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support decode, or encode operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Outside</td><td>Decode Encode</td></tr></tbody>
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
        To end video decode or encode operations, call:

        <pre><code>
￿void vkCmdEndVideoCodingKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkVideoEndCodingInfoKHR*              pEndCodingInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pEndCodingInfo} <b>must</b> be a valid pointer to a valid ##VkVideoEndCodingInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support decode, or encode operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Outside</td><td>Decode Encode</td></tr></tbody>
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
        To apply dynamic controls to video decode or video encode operations, call:

        <pre><code>
￿void vkCmdControlVideoCodingKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkVideoCodingControlInfoKHR*          pCodingControlInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pCodingControlInfo} <b>must</b> be a valid pointer to a valid ##VkVideoCodingControlInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support decode, or encode operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Outside</td><td>Decode Encode</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkVideoCodingControlInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer to be filled by this function."),
        VkVideoCodingControlInfoKHR.const.p("pCodingControlInfo", "a pointer to a ##VkVideoCodingControlInfoKHR structure.")
    )
}