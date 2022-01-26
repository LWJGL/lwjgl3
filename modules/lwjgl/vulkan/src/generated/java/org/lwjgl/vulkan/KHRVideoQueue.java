/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <ul>
 * <li>{@code VkVideoSessionKHR}</li>
 * <li>{@code VkVideoSessionParametersKHR}</li>
 * </ul>
 * 
 * <h5>VK_KHR_video_queue</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_video_queue}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>24</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * <li>Requires {@link KHRSamplerYcbcrConversion VK_KHR_sampler_ycbcr_conversion}</li>
 * <li>This is a <em>provisional</em> extension and <b>must</b> be used with caution. See the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#boilerplate-provisional-header">description</a> of provisional header files for enablement and stability details.</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Tony Zlatinski <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_video_queue]%20@tzlatinski%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_video_queue%20extension%3E%3E">tzlatinski</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2021-03-29</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Ahmed Abdelkhalek, AMD</li>
 * <li>George Hao, AMD</li>
 * <li>Jake Beju, AMD</li>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Srinath Kumarapuram, NVIDIA</li>
 * <li>Tobias Hector, AMD</li>
 * <li>Tony Zlatinski, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class KHRVideoQueue {

    /** The extension specification version. */
    public static final int VK_KHR_VIDEO_QUEUE_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_KHR_VIDEO_QUEUE_EXTENSION_NAME = "VK_KHR_video_queue";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_PROFILE_KHR STRUCTURE_TYPE_VIDEO_PROFILE_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_KHR STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_GET_MEMORY_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_GET_MEMORY_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_BIND_MEMORY_KHR STRUCTURE_TYPE_VIDEO_BIND_MEMORY_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_UPDATE_INFO_KHR STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_UPDATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_END_CODING_INFO_KHR STRUCTURE_TYPE_VIDEO_END_CODING_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_CODING_CONTROL_INFO_KHR STRUCTURE_TYPE_VIDEO_CODING_CONTROL_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_KHR STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_QUEUE_FAMILY_PROPERTIES_2_KHR STRUCTURE_TYPE_VIDEO_QUEUE_FAMILY_PROPERTIES_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_PROFILES_KHR STRUCTURE_TYPE_VIDEO_PROFILES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_2_KHR STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_2_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_VIDEO_PROFILE_KHR                                 = 1000023000,
        VK_STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR                            = 1000023001,
        VK_STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_KHR                        = 1000023002,
        VK_STRUCTURE_TYPE_VIDEO_GET_MEMORY_PROPERTIES_KHR                   = 1000023003,
        VK_STRUCTURE_TYPE_VIDEO_BIND_MEMORY_KHR                             = 1000023004,
        VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR                     = 1000023005,
        VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR          = 1000023006,
        VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_UPDATE_INFO_KHR          = 1000023007,
        VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR                       = 1000023008,
        VK_STRUCTURE_TYPE_VIDEO_END_CODING_INFO_KHR                         = 1000023009,
        VK_STRUCTURE_TYPE_VIDEO_CODING_CONTROL_INFO_KHR                     = 1000023010,
        VK_STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_KHR                          = 1000023011,
        VK_STRUCTURE_TYPE_VIDEO_QUEUE_FAMILY_PROPERTIES_2_KHR               = 1000023012,
        VK_STRUCTURE_TYPE_VIDEO_PROFILES_KHR                                = 1000023013,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR             = 1000023014,
        VK_STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR                       = 1000023015,
        VK_STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_2_KHR = 1000023016;

    /**
     * Extends {@code VkObjectType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_OBJECT_TYPE_VIDEO_SESSION_KHR OBJECT_TYPE_VIDEO_SESSION_KHR}</li>
     * <li>{@link #VK_OBJECT_TYPE_VIDEO_SESSION_PARAMETERS_KHR OBJECT_TYPE_VIDEO_SESSION_PARAMETERS_KHR}</li>
     * </ul>
     */
    public static final int
        VK_OBJECT_TYPE_VIDEO_SESSION_KHR            = 1000023000,
        VK_OBJECT_TYPE_VIDEO_SESSION_PARAMETERS_KHR = 1000023001;

    /** Extends {@code VkQueryType}. */
    public static final int VK_QUERY_TYPE_RESULT_STATUS_ONLY_KHR = 1000023000;

    /** Extends {@code VkQueryResultFlagBits}. */
    public static final int VK_QUERY_RESULT_WITH_STATUS_BIT_KHR = 0x10;

    /**
     * VkVideoCodecOperationFlagBitsKHR - Video codec operation types
     * 
     * <h5>Description</h5>
     * 
     * <p>Each decode or encode codec-specific extension extends this enumeration with the appropriate bit corresponding to the extension’s codec operation:</p>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_CODEC_OPERATION_INVALID_BIT_KHR VIDEO_CODEC_OPERATION_INVALID_BIT_KHR} - No video operations are supported for this queue family.</li>
     * <li>{@link EXTVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT} - H.264 video encode operations are supported by this queue family.</li>
     * <li>{@link EXTVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_EXT VIDEO_CODEC_OPERATION_DECODE_H264_BIT_EXT} - H.264 video decode operations are supported by this queue family.</li>
     * <li>{@link EXTVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_EXT VIDEO_CODEC_OPERATION_DECODE_H265_BIT_EXT} - H.265 video decode operations are supported by this queue family.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoProfileKHR}</p>
     */
    public static final int VK_VIDEO_CODEC_OPERATION_INVALID_BIT_KHR = 0;

    /**
     * VkVideoChromaSubsamplingFlagBitsKHR - Video chroma subsampling
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_CHROMA_SUBSAMPLING_MONOCHROME_BIT_KHR VIDEO_CHROMA_SUBSAMPLING_MONOCHROME_BIT_KHR} - the format is monochrome.</li>
     * <li>{@link #VK_VIDEO_CHROMA_SUBSAMPLING_420_BIT_KHR VIDEO_CHROMA_SUBSAMPLING_420_BIT_KHR} - the format is 4:2:0 chroma subsampled. The two chroma components are each subsampled at a factor of 2 both horizontally and vertically.</li>
     * <li>{@link #VK_VIDEO_CHROMA_SUBSAMPLING_422_BIT_KHR VIDEO_CHROMA_SUBSAMPLING_422_BIT_KHR} - the format is 4:2:2 chroma subsampled. The two chroma components are sampled at half the sample rate of luma. The horizontal chroma resolution is halved.</li>
     * <li>{@link #VK_VIDEO_CHROMA_SUBSAMPLING_444_BIT_KHR VIDEO_CHROMA_SUBSAMPLING_444_BIT_KHR} - the format is 4:4:4 chroma sampled. Each of the three YCbCr components have the same sample rate, thus there is no chroma subsampling.</li>
     * </ul>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_CHROMA_SUBSAMPLING_INVALID_BIT_KHR VIDEO_CHROMA_SUBSAMPLING_INVALID_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_VIDEO_CHROMA_SUBSAMPLING_INVALID_BIT_KHR    = 0,
        VK_VIDEO_CHROMA_SUBSAMPLING_MONOCHROME_BIT_KHR = 0x1,
        VK_VIDEO_CHROMA_SUBSAMPLING_420_BIT_KHR        = 0x2,
        VK_VIDEO_CHROMA_SUBSAMPLING_422_BIT_KHR        = 0x4,
        VK_VIDEO_CHROMA_SUBSAMPLING_444_BIT_KHR        = 0x8;

    /**
     * VkVideoComponentBitDepthFlagBitsKHR - Video component bit depth
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_COMPONENT_BIT_DEPTH_8_BIT_KHR VIDEO_COMPONENT_BIT_DEPTH_8_BIT_KHR} - the format component bit depth is 8 bits.</li>
     * <li>{@link #VK_VIDEO_COMPONENT_BIT_DEPTH_10_BIT_KHR VIDEO_COMPONENT_BIT_DEPTH_10_BIT_KHR} - the format component bit depth is 10 bits.</li>
     * <li>{@link #VK_VIDEO_COMPONENT_BIT_DEPTH_12_BIT_KHR VIDEO_COMPONENT_BIT_DEPTH_12_BIT_KHR} - the format component bit depth is 12 bits.</li>
     * </ul>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_COMPONENT_BIT_DEPTH_INVALID_KHR VIDEO_COMPONENT_BIT_DEPTH_INVALID_KHR}</li>
     * </ul>
     */
    public static final int
        VK_VIDEO_COMPONENT_BIT_DEPTH_INVALID_KHR = 0,
        VK_VIDEO_COMPONENT_BIT_DEPTH_8_BIT_KHR   = 0x1,
        VK_VIDEO_COMPONENT_BIT_DEPTH_10_BIT_KHR  = 0x4,
        VK_VIDEO_COMPONENT_BIT_DEPTH_12_BIT_KHR  = 0x10;

    /**
     * VkVideoCapabilityFlagBitsKHR - Video Decode and Encode Capability Flags
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_CAPABILITY_PROTECTED_CONTENT_BIT_KHR VIDEO_CAPABILITY_PROTECTED_CONTENT_BIT_KHR} - the decode or encode session supports protected content.</li>
     * <li>{@link #VK_VIDEO_CAPABILITY_SEPARATE_REFERENCE_IMAGES_BIT_KHR VIDEO_CAPABILITY_SEPARATE_REFERENCE_IMAGES_BIT_KHR} - the DPB or Reconstructed Video Picture Resources for the video session <b>may</b> be created as a separate {@code VkImage} for each DPB picture. If not supported, the DPB <b>must</b> be created as single multi-layered image where each layer represents one of the DPB Video Picture Resources.</li>
     * </ul>
     */
    public static final int
        VK_VIDEO_CAPABILITY_PROTECTED_CONTENT_BIT_KHR         = 0x1,
        VK_VIDEO_CAPABILITY_SEPARATE_REFERENCE_IMAGES_BIT_KHR = 0x2;

    /**
     * VkVideoSessionCreateFlagBitsKHR - Video decode or encode video session creation flags
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_SESSION_CREATE_PROTECTED_CONTENT_BIT_KHR VIDEO_SESSION_CREATE_PROTECTED_CONTENT_BIT_KHR} - create the video session for use with protected video content</li>
     * </ul>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_SESSION_CREATE_DEFAULT_KHR VIDEO_SESSION_CREATE_DEFAULT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_VIDEO_SESSION_CREATE_DEFAULT_KHR               = 0,
        VK_VIDEO_SESSION_CREATE_PROTECTED_CONTENT_BIT_KHR = 0x1;

    /**
     * VkVideoCodingControlFlagBitsKHR - Video Coding Control Command Flags
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_CODING_CONTROL_DEFAULT_KHR VIDEO_CODING_CONTROL_DEFAULT_KHR} indicates a request for the coding control paramaters to be applied to the current state of the bound video session.</li>
     * <li>{@link #VK_VIDEO_CODING_CONTROL_RESET_BIT_KHR VIDEO_CODING_CONTROL_RESET_BIT_KHR} indicates a request for the bound video session device context to be reset before the coding control parameters are applied.</li>
     * </ul>
     * 
     * <p>A newly created video session <b>must</b> be reset before use for video decode or encode operations. The reset operation returns all session DPB slots to the unused state (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#video-session-dpb-slot-states">DPB Slot States</a>). For encode sessions, the reset operation returns rate control configuration to implementation default settings. After decode or encode operations are performed on a session, the reset operation <b>may</b> be used to return the video session device context to the same initial state as after the reset of a newly created video session. This <b>may</b> be used when different video sequences are processed with the same session.</p>
     */
    public static final int
        VK_VIDEO_CODING_CONTROL_DEFAULT_KHR   = 0,
        VK_VIDEO_CODING_CONTROL_RESET_BIT_KHR = 0x1;

    /**
     * VkVideoCodingQualityPresetFlagBitsKHR - Video codec profile types
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_CODING_QUALITY_PRESET_NORMAL_BIT_KHR VIDEO_CODING_QUALITY_PRESET_NORMAL_BIT_KHR} defines normal decode case.</li>
     * <li>{@link #VK_VIDEO_CODING_QUALITY_PRESET_POWER_BIT_KHR VIDEO_CODING_QUALITY_PRESET_POWER_BIT_KHR} defines power efficient case.</li>
     * <li>{@link #VK_VIDEO_CODING_QUALITY_PRESET_QUALITY_BIT_KHR VIDEO_CODING_QUALITY_PRESET_QUALITY_BIT_KHR} defines quality focus case.</li>
     * </ul>
     */
    public static final int
        VK_VIDEO_CODING_QUALITY_PRESET_NORMAL_BIT_KHR  = 0x1,
        VK_VIDEO_CODING_QUALITY_PRESET_POWER_BIT_KHR   = 0x2,
        VK_VIDEO_CODING_QUALITY_PRESET_QUALITY_BIT_KHR = 0x4;

    /**
     * VkQueryResultStatusKHR - Specific status codes for operations
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_QUERY_RESULT_STATUS_NOT_READY_KHR QUERY_RESULT_STATUS_NOT_READY_KHR} specifies that the query result is not yet available.</li>
     * <li>{@link #VK_QUERY_RESULT_STATUS_ERROR_KHR QUERY_RESULT_STATUS_ERROR_KHR} specifies that operations did not complete successfully.</li>
     * <li>{@link #VK_QUERY_RESULT_STATUS_COMPLETE_KHR QUERY_RESULT_STATUS_COMPLETE_KHR} specifies that operations completed successfully and the query result is available.</li>
     * </ul>
     */
    public static final int
        VK_QUERY_RESULT_STATUS_ERROR_KHR     = -1,
        VK_QUERY_RESULT_STATUS_NOT_READY_KHR = 0,
        VK_QUERY_RESULT_STATUS_COMPLETE_KHR  = 1;

    protected KHRVideoQueue() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceVideoCapabilitiesKHR ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} */
    public static int nvkGetPhysicalDeviceVideoCapabilitiesKHR(VkPhysicalDevice physicalDevice, long pVideoProfile, long pCapabilities) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceVideoCapabilitiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pVideoProfile, pCapabilities, __functionAddress);
    }

    /**
     * Query video decode or encode capabilities.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query video decode or encode capabilities for a specific codec, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPhysicalDeviceVideoCapabilitiesKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     const VkVideoProfileKHR*                    pVideoProfile,
     *     VkVideoCapabilitiesKHR*                     pCapabilities);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pVideoProfile} <b>must</b> be a valid pointer to a valid {@link VkVideoProfileKHR} structure</li>
     * <li>{@code pCapabilities} <b>must</b> be a valid pointer to a {@link VkVideoCapabilitiesKHR} structure</li>
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
     * <li>{@link VK10#VK_ERROR_EXTENSION_NOT_PRESENT ERROR_EXTENSION_NOT_PRESENT}</li>
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * <li>{@link VK10#VK_ERROR_FEATURE_NOT_PRESENT ERROR_FEATURE_NOT_PRESENT}</li>
     * <li>{@link VK10#VK_ERROR_FORMAT_NOT_SUPPORTED ERROR_FORMAT_NOT_SUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoCapabilitiesKHR}, {@link VkVideoProfileKHR}</p>
     *
     * @param physicalDevice the physical device whose video decode or encode capabilities will be queried.
     * @param pVideoProfile  a pointer to a {@link VkVideoProfileKHR} structure with a chained codec-operation specific video profile structure.
     * @param pCapabilities  a pointer to a {@link VkVideoCapabilitiesKHR} structure in which the capabilities are returned.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceVideoCapabilitiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkVideoProfileKHR const *") VkVideoProfileKHR pVideoProfile, @NativeType("VkVideoCapabilitiesKHR *") VkVideoCapabilitiesKHR pCapabilities) {
        return nvkGetPhysicalDeviceVideoCapabilitiesKHR(physicalDevice, pVideoProfile.address(), pCapabilities.address());
    }

    // --- [ vkGetPhysicalDeviceVideoFormatPropertiesKHR ] ---

    /**
     * Unsafe version of: {@link #vkGetPhysicalDeviceVideoFormatPropertiesKHR GetPhysicalDeviceVideoFormatPropertiesKHR}
     *
     * @param pVideoFormatPropertyCount a pointer to an integer related to the number of video format properties available or queried, as described below.
     */
    public static int nvkGetPhysicalDeviceVideoFormatPropertiesKHR(VkPhysicalDevice physicalDevice, long pVideoFormatInfo, long pVideoFormatPropertyCount, long pVideoFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceVideoFormatPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(physicalDevice.address(), pVideoFormatInfo, pVideoFormatPropertyCount, pVideoFormatProperties, __functionAddress);
    }

    /**
     * Query supported Video Decode and Encode image formats.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To enumerate the supported output, input and DPB image formats for a specific codec operation and video profile, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPhysicalDeviceVideoFormatPropertiesKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     const VkPhysicalDeviceVideoFormatInfoKHR*   pVideoFormatInfo,
     *     uint32_t*                                   pVideoFormatPropertyCount,
     *     VkVideoFormatPropertiesKHR*                 pVideoFormatProperties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pVideoFormatProperties} is {@code NULL}, then the number of video format properties supported for the given {@code physicalDevice} is returned in {@code pVideoFormatPropertyCount}. Otherwise, {@code pVideoFormatPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pVideoFormatProperties} array, and on return the variable is overwritten with the number of values actually written to {@code pVideoFormatProperties}. If the value of {@code pVideoFormatPropertyCount} is less than the number of video format properties supported, at most {@code pVideoFormatPropertyCount} values will be written to {@code pVideoFormatProperties}, and {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS}, to indicate that not all the available values were returned.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The {@code imageUsage} enum of {@link VkPhysicalDeviceVideoFormatInfoKHR} <b>must</b> contain at least one of the following video image usage bit(s): {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR}, {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR}, {@link KHRVideoEncodeQueue#VK_IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR}, or {@link KHRVideoEncodeQueue#VK_IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR}</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note:</h5>
     * 
     * <p>For most use cases, only decode or encode related usage flags are going to be specified. For a use case such as transcode, if the image were to be shared between decode and encode session(s), then both decode and encode related usage flags <b>can</b> be set.</p>
     * </div>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pVideoFormatInfo} <b>must</b> be a valid pointer to a valid {@link VkPhysicalDeviceVideoFormatInfoKHR} structure</li>
     * <li>{@code pVideoFormatPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pVideoFormatPropertyCount} is not 0, and {@code pVideoFormatProperties} is not {@code NULL}, {@code pVideoFormatProperties} <b>must</b> be a valid pointer to an array of {@code pVideoFormatPropertyCount} {@link VkVideoFormatPropertiesKHR} structures</li>
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
     * <li>{@link VK10#VK_ERROR_EXTENSION_NOT_PRESENT ERROR_EXTENSION_NOT_PRESENT}</li>
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * <li>{@link VK10#VK_ERROR_FORMAT_NOT_SUPPORTED ERROR_FORMAT_NOT_SUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPhysicalDeviceVideoFormatInfoKHR}, {@link VkVideoFormatPropertiesKHR}</p>
     *
     * @param physicalDevice            the physical device being queried.
     * @param pVideoFormatInfo          a pointer to a {@link VkPhysicalDeviceVideoFormatInfoKHR} structure specifying the codec and video profile for which information is returned.
     * @param pVideoFormatPropertyCount a pointer to an integer related to the number of video format properties available or queried, as described below.
     * @param pVideoFormatProperties    a pointer to an array of {@link VkVideoFormatPropertiesKHR} structures in which supported formats are returned.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceVideoFormatPropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceVideoFormatInfoKHR const *") VkPhysicalDeviceVideoFormatInfoKHR pVideoFormatInfo, @NativeType("uint32_t *") IntBuffer pVideoFormatPropertyCount, @Nullable @NativeType("VkVideoFormatPropertiesKHR *") VkVideoFormatPropertiesKHR.Buffer pVideoFormatProperties) {
        if (CHECKS) {
            check(pVideoFormatPropertyCount, 1);
            checkSafe(pVideoFormatProperties, pVideoFormatPropertyCount.get(pVideoFormatPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceVideoFormatPropertiesKHR(physicalDevice, pVideoFormatInfo.address(), memAddress(pVideoFormatPropertyCount), memAddressSafe(pVideoFormatProperties));
    }

    // --- [ vkCreateVideoSessionKHR ] ---

    /** Unsafe version of: {@link #vkCreateVideoSessionKHR CreateVideoSessionKHR} */
    public static int nvkCreateVideoSessionKHR(VkDevice device, long pCreateInfo, long pAllocator, long pVideoSession) {
        long __functionAddress = device.getCapabilities().vkCreateVideoSessionKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkVideoSessionCreateInfoKHR.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pVideoSession, __functionAddress);
    }

    /**
     * Creates a video session object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create a video session object, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreateVideoSessionKHR(
     *     VkDevice                                    device,
     *     const VkVideoSessionCreateInfoKHR*          pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkVideoSessionKHR*                          pVideoSession);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkVideoSessionCreateInfoKHR} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pVideoSession} <b>must</b> be a valid pointer to a {@code VkVideoSessionKHR} handle</li>
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
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * <li>{@link VK10#VK_ERROR_INCOMPATIBLE_DRIVER ERROR_INCOMPATIBLE_DRIVER}</li>
     * <li>{@link VK10#VK_ERROR_FEATURE_NOT_PRESENT ERROR_FEATURE_NOT_PRESENT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkVideoSessionCreateInfoKHR}</p>
     *
     * @param device        the logical device that creates the decode or encode session object.
     * @param pCreateInfo   a pointer to a {@link VkVideoSessionCreateInfoKHR} structure containing parameters specifying the creation of the decode or encode session.
     * @param pAllocator    controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pVideoSession a pointer to a {@code VkVideoSessionKHR} structure specifying the decode or encode video session object which will be created by this function when it returns {@link VK10#VK_SUCCESS SUCCESS}
     */
    @NativeType("VkResult")
    public static int vkCreateVideoSessionKHR(VkDevice device, @NativeType("VkVideoSessionCreateInfoKHR const *") VkVideoSessionCreateInfoKHR pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkVideoSessionKHR *") LongBuffer pVideoSession) {
        if (CHECKS) {
            check(pVideoSession, 1);
        }
        return nvkCreateVideoSessionKHR(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pVideoSession));
    }

    // --- [ vkDestroyVideoSessionKHR ] ---

    /** Unsafe version of: {@link #vkDestroyVideoSessionKHR DestroyVideoSessionKHR} */
    public static void nvkDestroyVideoSessionKHR(VkDevice device, long videoSession, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyVideoSessionKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), videoSession, pAllocator, __functionAddress);
    }

    /**
     * Destroy decode session object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To destroy a decode session object, call:</p>
     * 
     * <pre><code>
     * void vkDestroyVideoSessionKHR(
     *     VkDevice                                    device,
     *     VkVideoSessionKHR                           videoSession,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code videoSession} <b>must</b> be a valid {@code VkVideoSessionKHR} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code videoSession} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param device       the device that was used for the creation of the video session.
     * @param videoSession the decode or encode video session to be destroyed.
     * @param pAllocator   controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyVideoSessionKHR(VkDevice device, @NativeType("VkVideoSessionKHR") long videoSession, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyVideoSessionKHR(device, videoSession, memAddressSafe(pAllocator));
    }

    // --- [ vkGetVideoSessionMemoryRequirementsKHR ] ---

    /**
     * Unsafe version of: {@link #vkGetVideoSessionMemoryRequirementsKHR GetVideoSessionMemoryRequirementsKHR}
     *
     * @param pVideoSessionMemoryRequirementsCount a pointer to an integer related to the number of memory heap requirements available or queried, as described below.
     */
    public static int nvkGetVideoSessionMemoryRequirementsKHR(VkDevice device, long videoSession, long pVideoSessionMemoryRequirementsCount, long pVideoSessionMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetVideoSessionMemoryRequirementsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), videoSession, pVideoSessionMemoryRequirementsCount, pVideoSessionMemoryRequirements, __functionAddress);
    }

    /**
     * Get Memory Requirements.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To get memory requirements for a video session, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetVideoSessionMemoryRequirementsKHR(
     *     VkDevice                                    device,
     *     VkVideoSessionKHR                           videoSession,
     *     uint32_t*                                   pVideoSessionMemoryRequirementsCount,
     *     VkVideoGetMemoryPropertiesKHR*              pVideoSessionMemoryRequirements);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pVideoSessionMemoryRequirements} is {@code NULL}, then the number of memory heap types required for the video session is returned in {@code pVideoSessionMemoryRequirementsCount}. Otherwise, {@code pVideoSessionMemoryRequirementsCount} <b>must</b> point to a variable set by the user with the number of elements in the {@code pVideoSessionMemoryRequirements} array, and on return the variable is overwritten with the number of formats actually written to {@code pVideoSessionMemoryRequirements}. If {@code pVideoSessionMemoryRequirementsCount} is less than the number of memory heap types required for the video session, then at most {@code pVideoSessionMemoryRequirementsCount} elements will be written to {@code pVideoSessionMemoryRequirements}, and {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned, instead of {@link VK10#VK_SUCCESS SUCCESS}, to indicate that not all required memory heap types were returned.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code videoSession} <b>must</b> be a valid {@code VkVideoSessionKHR} handle</li>
     * <li>{@code pVideoSessionMemoryRequirementsCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pVideoSessionMemoryRequirementsCount} is not 0, and {@code pVideoSessionMemoryRequirements} is not {@code NULL}, {@code pVideoSessionMemoryRequirements} <b>must</b> be a valid pointer to an array of {@code pVideoSessionMemoryRequirementsCount} {@link VkVideoGetMemoryPropertiesKHR} structures</li>
     * <li>{@code videoSession} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoGetMemoryPropertiesKHR}</p>
     *
     * @param device                               the logical device that owns the video session.
     * @param videoSession                         the video session to query.
     * @param pVideoSessionMemoryRequirementsCount a pointer to an integer related to the number of memory heap requirements available or queried, as described below.
     * @param pVideoSessionMemoryRequirements      {@code NULL} or a pointer to an array of {@link VkVideoGetMemoryPropertiesKHR} structures in which the memory heap requirements of the video session are returned.
     */
    @NativeType("VkResult")
    public static int vkGetVideoSessionMemoryRequirementsKHR(VkDevice device, @NativeType("VkVideoSessionKHR") long videoSession, @NativeType("uint32_t *") IntBuffer pVideoSessionMemoryRequirementsCount, @Nullable @NativeType("VkVideoGetMemoryPropertiesKHR *") VkVideoGetMemoryPropertiesKHR.Buffer pVideoSessionMemoryRequirements) {
        if (CHECKS) {
            check(pVideoSessionMemoryRequirementsCount, 1);
            checkSafe(pVideoSessionMemoryRequirements, pVideoSessionMemoryRequirementsCount.get(pVideoSessionMemoryRequirementsCount.position()));
        }
        return nvkGetVideoSessionMemoryRequirementsKHR(device, videoSession, memAddress(pVideoSessionMemoryRequirementsCount), memAddressSafe(pVideoSessionMemoryRequirements));
    }

    // --- [ vkBindVideoSessionMemoryKHR ] ---

    /**
     * Unsafe version of: {@link #vkBindVideoSessionMemoryKHR BindVideoSessionMemoryKHR}
     *
     * @param videoSessionBindMemoryCount the number of {@code pVideoSessionBindMemories} to be bound.
     */
    public static int nvkBindVideoSessionMemoryKHR(VkDevice device, long videoSession, int videoSessionBindMemoryCount, long pVideoSessionBindMemories) {
        long __functionAddress = device.getCapabilities().vkBindVideoSessionMemoryKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), videoSession, videoSessionBindMemoryCount, pVideoSessionBindMemories, __functionAddress);
    }

    /**
     * Bind Video Memory.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To attach memory to a video session object, call:</p>
     * 
     * <pre><code>
     * VkResult vkBindVideoSessionMemoryKHR(
     *     VkDevice                                    device,
     *     VkVideoSessionKHR                           videoSession,
     *     uint32_t                                    videoSessionBindMemoryCount,
     *     const VkVideoBindMemoryKHR*                 pVideoSessionBindMemories);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code videoSession} <b>must</b> be a valid {@code VkVideoSessionKHR} handle</li>
     * <li>{@code pVideoSessionBindMemories} <b>must</b> be a valid pointer to an array of {@code videoSessionBindMemoryCount} valid {@link VkVideoBindMemoryKHR} structures</li>
     * <li>{@code videoSessionBindMemoryCount} <b>must</b> be greater than 0</li>
     * <li>{@code videoSession} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoBindMemoryKHR}</p>
     *
     * @param device                    the logical device that owns the video session’s memory.
     * @param videoSession              the video session to be bound with device memory.
     * @param pVideoSessionBindMemories a pointer to an array of {@link VkVideoBindMemoryKHR} structures specifying memory regions to be bound to a device memory heap.
     */
    @NativeType("VkResult")
    public static int vkBindVideoSessionMemoryKHR(VkDevice device, @NativeType("VkVideoSessionKHR") long videoSession, @NativeType("VkVideoBindMemoryKHR const *") VkVideoBindMemoryKHR.Buffer pVideoSessionBindMemories) {
        return nvkBindVideoSessionMemoryKHR(device, videoSession, pVideoSessionBindMemories.remaining(), pVideoSessionBindMemories.address());
    }

    // --- [ vkCreateVideoSessionParametersKHR ] ---

    /** Unsafe version of: {@link #vkCreateVideoSessionParametersKHR CreateVideoSessionParametersKHR} */
    public static int nvkCreateVideoSessionParametersKHR(VkDevice device, long pCreateInfo, long pAllocator, long pVideoSessionParameters) {
        long __functionAddress = device.getCapabilities().vkCreateVideoSessionParametersKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pVideoSessionParameters, __functionAddress);
    }

    /**
     * Creates video session video session parameter object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create a video session parameters object, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreateVideoSessionParametersKHR(
     *     VkDevice                                    device,
     *     const VkVideoSessionParametersCreateInfoKHR* pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkVideoSessionParametersKHR*                pVideoSessionParameters);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkVideoSessionParametersCreateInfoKHR} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pVideoSessionParameters} <b>must</b> be a valid pointer to a {@code VkVideoSessionParametersKHR} handle</li>
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
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkVideoSessionParametersCreateInfoKHR}</p>
     *
     * @param device                  the logical device that was used for the creation of the video session object.
     * @param pCreateInfo             a pointer to {@link VkVideoSessionParametersCreateInfoKHR} structure specifying the video session parameters.
     * @param pAllocator              controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pVideoSessionParameters a pointer to a {@code VkVideoSessionParametersKHR} handle in which the video session parameters object is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateVideoSessionParametersKHR(VkDevice device, @NativeType("VkVideoSessionParametersCreateInfoKHR const *") VkVideoSessionParametersCreateInfoKHR pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkVideoSessionParametersKHR *") LongBuffer pVideoSessionParameters) {
        if (CHECKS) {
            check(pVideoSessionParameters, 1);
        }
        return nvkCreateVideoSessionParametersKHR(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pVideoSessionParameters));
    }

    // --- [ vkUpdateVideoSessionParametersKHR ] ---

    /** Unsafe version of: {@link #vkUpdateVideoSessionParametersKHR UpdateVideoSessionParametersKHR} */
    public static int nvkUpdateVideoSessionParametersKHR(VkDevice device, long videoSessionParameters, long pUpdateInfo) {
        long __functionAddress = device.getCapabilities().vkUpdateVideoSessionParametersKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), videoSessionParameters, pUpdateInfo, __functionAddress);
    }

    /**
     * Update video session video session parameter object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To update, add, or remove video session parameters state, call:</p>
     * 
     * <pre><code>
     * VkResult vkUpdateVideoSessionParametersKHR(
     *     VkDevice                                    device,
     *     VkVideoSessionParametersKHR                 videoSessionParameters,
     *     const VkVideoSessionParametersUpdateInfoKHR* pUpdateInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code videoSessionParameters} <b>must</b> be a valid {@code VkVideoSessionParametersKHR} handle</li>
     * <li>{@code pUpdateInfo} <b>must</b> be a valid pointer to a valid {@link VkVideoSessionParametersUpdateInfoKHR} structure</li>
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
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * <li>{@link VK10#VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoSessionParametersUpdateInfoKHR}</p>
     *
     * @param device                 the logical device that was used for the creation of the video session object.
     * @param videoSessionParameters the video session object that is going to be updated.
     * @param pUpdateInfo            a pointer to a {@link VkVideoSessionParametersUpdateInfoKHR} structure containing the session parameters update information.
     */
    @NativeType("VkResult")
    public static int vkUpdateVideoSessionParametersKHR(VkDevice device, @NativeType("VkVideoSessionParametersKHR") long videoSessionParameters, @NativeType("VkVideoSessionParametersUpdateInfoKHR const *") VkVideoSessionParametersUpdateInfoKHR pUpdateInfo) {
        return nvkUpdateVideoSessionParametersKHR(device, videoSessionParameters, pUpdateInfo.address());
    }

    // --- [ vkDestroyVideoSessionParametersKHR ] ---

    /** Unsafe version of: {@link #vkDestroyVideoSessionParametersKHR DestroyVideoSessionParametersKHR} */
    public static void nvkDestroyVideoSessionParametersKHR(VkDevice device, long videoSessionParameters, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyVideoSessionParametersKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), videoSessionParameters, pAllocator, __functionAddress);
    }

    /**
     * Destroy video session parameters object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To destroy a video session object, call:</p>
     * 
     * <pre><code>
     * void vkDestroyVideoSessionParametersKHR(
     *     VkDevice                                    device,
     *     VkVideoSessionParametersKHR                 videoSessionParameters,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code videoSessionParameters} <b>must</b> be a valid {@code VkVideoSessionParametersKHR} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param device                 the device the video session was created with.
     * @param videoSessionParameters the video session parameters object to be destroyed.
     * @param pAllocator             controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyVideoSessionParametersKHR(VkDevice device, @NativeType("VkVideoSessionParametersKHR") long videoSessionParameters, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyVideoSessionParametersKHR(device, videoSessionParameters, memAddressSafe(pAllocator));
    }

    // --- [ vkCmdBeginVideoCodingKHR ] ---

    /** Unsafe version of: {@link #vkCmdBeginVideoCodingKHR CmdBeginVideoCodingKHR} */
    public static void nvkCmdBeginVideoCodingKHR(VkCommandBuffer commandBuffer, long pBeginInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginVideoCodingKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkVideoBeginCodingInfoKHR.validate(pBeginInfo);
        }
        callPPV(commandBuffer.address(), pBeginInfo, __functionAddress);
    }

    /**
     * Start decode jobs.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To start video decode or encode operations, call:</p>
     * 
     * <pre><code>
     * void vkCmdBeginVideoCodingKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkVideoBeginCodingInfoKHR*            pBeginInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pBeginInfo} <b>must</b> be a valid pointer to a valid {@link VkVideoBeginCodingInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support decode, or encode operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
     * <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary</td><td>Outside</td><td>Decode Encode</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoBeginCodingInfoKHR}</p>
     *
     * @param commandBuffer the command buffer to be used when recording commands for the video decode or encode operations.
     * @param pBeginInfo    a pointer to a {@link VkVideoBeginCodingInfoKHR} structure.
     */
    public static void vkCmdBeginVideoCodingKHR(VkCommandBuffer commandBuffer, @NativeType("VkVideoBeginCodingInfoKHR const *") VkVideoBeginCodingInfoKHR pBeginInfo) {
        nvkCmdBeginVideoCodingKHR(commandBuffer, pBeginInfo.address());
    }

    // --- [ vkCmdEndVideoCodingKHR ] ---

    /** Unsafe version of: {@link #vkCmdEndVideoCodingKHR CmdEndVideoCodingKHR} */
    public static void nvkCmdEndVideoCodingKHR(VkCommandBuffer commandBuffer, long pEndCodingInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndVideoCodingKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pEndCodingInfo, __functionAddress);
    }

    /**
     * End decode jobs.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To end video decode or encode operations, call:</p>
     * 
     * <pre><code>
     * void vkCmdEndVideoCodingKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkVideoEndCodingInfoKHR*              pEndCodingInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pEndCodingInfo} <b>must</b> be a valid pointer to a valid {@link VkVideoEndCodingInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support decode, or encode operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
     * <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary</td><td>Outside</td><td>Decode Encode</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoEndCodingInfoKHR}</p>
     *
     * @param commandBuffer  the command buffer to be filled by this function.
     * @param pEndCodingInfo a pointer to a {@link VkVideoEndCodingInfoKHR} structure.
     */
    public static void vkCmdEndVideoCodingKHR(VkCommandBuffer commandBuffer, @NativeType("VkVideoEndCodingInfoKHR const *") VkVideoEndCodingInfoKHR pEndCodingInfo) {
        nvkCmdEndVideoCodingKHR(commandBuffer, pEndCodingInfo.address());
    }

    // --- [ vkCmdControlVideoCodingKHR ] ---

    /** Unsafe version of: {@link #vkCmdControlVideoCodingKHR CmdControlVideoCodingKHR} */
    public static void nvkCmdControlVideoCodingKHR(VkCommandBuffer commandBuffer, long pCodingControlInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdControlVideoCodingKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pCodingControlInfo, __functionAddress);
    }

    /**
     * Set encode rate control parameters.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To apply dynamic controls to video decode or video encode operations, call:</p>
     * 
     * <pre><code>
     * void vkCmdControlVideoCodingKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkVideoCodingControlInfoKHR*          pCodingControlInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pCodingControlInfo} <b>must</b> be a valid pointer to a valid {@link VkVideoCodingControlInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support decode, or encode operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
     * <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary</td><td>Outside</td><td>Decode Encode</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoCodingControlInfoKHR}</p>
     *
     * @param commandBuffer      the command buffer to be filled by this function.
     * @param pCodingControlInfo a pointer to a {@link VkVideoCodingControlInfoKHR} structure.
     */
    public static void vkCmdControlVideoCodingKHR(VkCommandBuffer commandBuffer, @NativeType("VkVideoCodingControlInfoKHR const *") VkVideoCodingControlInfoKHR pCodingControlInfo) {
        nvkCmdControlVideoCodingKHR(commandBuffer, pCodingControlInfo.address());
    }

    /** Array version of: {@link #vkGetPhysicalDeviceVideoFormatPropertiesKHR GetPhysicalDeviceVideoFormatPropertiesKHR} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceVideoFormatPropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceVideoFormatInfoKHR const *") VkPhysicalDeviceVideoFormatInfoKHR pVideoFormatInfo, @NativeType("uint32_t *") int[] pVideoFormatPropertyCount, @Nullable @NativeType("VkVideoFormatPropertiesKHR *") VkVideoFormatPropertiesKHR.Buffer pVideoFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceVideoFormatPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pVideoFormatPropertyCount, 1);
            checkSafe(pVideoFormatProperties, pVideoFormatPropertyCount[0]);
        }
        return callPPPPI(physicalDevice.address(), pVideoFormatInfo.address(), pVideoFormatPropertyCount, memAddressSafe(pVideoFormatProperties), __functionAddress);
    }

    /** Array version of: {@link #vkCreateVideoSessionKHR CreateVideoSessionKHR} */
    @NativeType("VkResult")
    public static int vkCreateVideoSessionKHR(VkDevice device, @NativeType("VkVideoSessionCreateInfoKHR const *") VkVideoSessionCreateInfoKHR pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkVideoSessionKHR *") long[] pVideoSession) {
        long __functionAddress = device.getCapabilities().vkCreateVideoSessionKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pVideoSession, 1);
            VkVideoSessionCreateInfoKHR.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pVideoSession, __functionAddress);
    }

    /** Array version of: {@link #vkGetVideoSessionMemoryRequirementsKHR GetVideoSessionMemoryRequirementsKHR} */
    @NativeType("VkResult")
    public static int vkGetVideoSessionMemoryRequirementsKHR(VkDevice device, @NativeType("VkVideoSessionKHR") long videoSession, @NativeType("uint32_t *") int[] pVideoSessionMemoryRequirementsCount, @Nullable @NativeType("VkVideoGetMemoryPropertiesKHR *") VkVideoGetMemoryPropertiesKHR.Buffer pVideoSessionMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetVideoSessionMemoryRequirementsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pVideoSessionMemoryRequirementsCount, 1);
            checkSafe(pVideoSessionMemoryRequirements, pVideoSessionMemoryRequirementsCount[0]);
        }
        return callPJPPI(device.address(), videoSession, pVideoSessionMemoryRequirementsCount, memAddressSafe(pVideoSessionMemoryRequirements), __functionAddress);
    }

    /** Array version of: {@link #vkCreateVideoSessionParametersKHR CreateVideoSessionParametersKHR} */
    @NativeType("VkResult")
    public static int vkCreateVideoSessionParametersKHR(VkDevice device, @NativeType("VkVideoSessionParametersCreateInfoKHR const *") VkVideoSessionParametersCreateInfoKHR pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkVideoSessionParametersKHR *") long[] pVideoSessionParameters) {
        long __functionAddress = device.getCapabilities().vkCreateVideoSessionParametersKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pVideoSessionParameters, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pVideoSessionParameters, __functionAddress);
    }

}