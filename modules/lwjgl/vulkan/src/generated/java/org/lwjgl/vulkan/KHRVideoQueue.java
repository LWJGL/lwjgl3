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
 * This extension provides common APIs to enable exposing queue families with support for video codec operations by introducing the following new object types and related functionalities:
 * 
 * <ul>
 * <li>Video session objects that represent and maintain the state needed to perform video codec operations.</li>
 * <li>Video session parameters objects that act as a container for codec specific parameters.</li>
 * </ul>
 * 
 * <p>In addition, it also introduces query commands that allow applications to determine video coding related capabilities, and command buffer commands that enable recording video coding operations against a video session.</p>
 * 
 * <p>This extension is to be used in conjunction with other extensions that enable specific video coding operations.</p>
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
 * <dd>8</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.1">Version 1.1</a> and {@link KHRSynchronization2 VK_KHR_synchronization2}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Tony Zlatinski <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_video_queue]%20@tzlatinski%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_video_queue%20extension*">tzlatinski</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_video_queue.adoc">VK_KHR_video_queue</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2022-09-29</dd>
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
 * <li>Daniel Rakos, RasterGrid</li>
 * </ul></dd>
 * </dl>
 */
public class KHRVideoQueue {

    /** The extension specification version. */
    public static final int VK_KHR_VIDEO_QUEUE_SPEC_VERSION = 8;

    /** The extension name. */
    public static final String VK_KHR_VIDEO_QUEUE_EXTENSION_NAME = "VK_KHR_video_queue";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_PROFILE_INFO_KHR STRUCTURE_TYPE_VIDEO_PROFILE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_INFO_KHR STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR STRUCTURE_TYPE_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_UPDATE_INFO_KHR STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_UPDATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_END_CODING_INFO_KHR STRUCTURE_TYPE_VIDEO_END_CODING_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_CODING_CONTROL_INFO_KHR STRUCTURE_TYPE_VIDEO_CODING_CONTROL_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_INFO_KHR STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_QUEUE_FAMILY_VIDEO_PROPERTIES_KHR STRUCTURE_TYPE_QUEUE_FAMILY_VIDEO_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_PROFILE_LIST_INFO_KHR STRUCTURE_TYPE_VIDEO_PROFILE_LIST_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_KHR STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_VIDEO_PROFILE_INFO_KHR                          = 1000023000,
        VK_STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR                          = 1000023001,
        VK_STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_INFO_KHR                 = 1000023002,
        VK_STRUCTURE_TYPE_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR           = 1000023003,
        VK_STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR              = 1000023004,
        VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR                   = 1000023005,
        VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR        = 1000023006,
        VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_UPDATE_INFO_KHR        = 1000023007,
        VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR                     = 1000023008,
        VK_STRUCTURE_TYPE_VIDEO_END_CODING_INFO_KHR                       = 1000023009,
        VK_STRUCTURE_TYPE_VIDEO_CODING_CONTROL_INFO_KHR                   = 1000023010,
        VK_STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_INFO_KHR                   = 1000023011,
        VK_STRUCTURE_TYPE_QUEUE_FAMILY_VIDEO_PROPERTIES_KHR               = 1000023012,
        VK_STRUCTURE_TYPE_VIDEO_PROFILE_LIST_INFO_KHR                     = 1000023013,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR           = 1000023014,
        VK_STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR                     = 1000023015,
        VK_STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_KHR = 1000023016;

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
     * Extends {@code VkResult}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR}</li>
     * <li>{@link #VK_ERROR_VIDEO_PICTURE_LAYOUT_NOT_SUPPORTED_KHR ERROR_VIDEO_PICTURE_LAYOUT_NOT_SUPPORTED_KHR}</li>
     * <li>{@link #VK_ERROR_VIDEO_PROFILE_OPERATION_NOT_SUPPORTED_KHR ERROR_VIDEO_PROFILE_OPERATION_NOT_SUPPORTED_KHR}</li>
     * <li>{@link #VK_ERROR_VIDEO_PROFILE_FORMAT_NOT_SUPPORTED_KHR ERROR_VIDEO_PROFILE_FORMAT_NOT_SUPPORTED_KHR}</li>
     * <li>{@link #VK_ERROR_VIDEO_PROFILE_CODEC_NOT_SUPPORTED_KHR ERROR_VIDEO_PROFILE_CODEC_NOT_SUPPORTED_KHR}</li>
     * <li>{@link #VK_ERROR_VIDEO_STD_VERSION_NOT_SUPPORTED_KHR ERROR_VIDEO_STD_VERSION_NOT_SUPPORTED_KHR}</li>
     * </ul>
     */
    public static final int
        VK_ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR             = -1000023000,
        VK_ERROR_VIDEO_PICTURE_LAYOUT_NOT_SUPPORTED_KHR    = -1000023001,
        VK_ERROR_VIDEO_PROFILE_OPERATION_NOT_SUPPORTED_KHR = -1000023002,
        VK_ERROR_VIDEO_PROFILE_FORMAT_NOT_SUPPORTED_KHR    = -1000023003,
        VK_ERROR_VIDEO_PROFILE_CODEC_NOT_SUPPORTED_KHR     = -1000023004,
        VK_ERROR_VIDEO_STD_VERSION_NOT_SUPPORTED_KHR       = -1000023005;

    /**
     * VkVideoCodecOperationFlagBitsKHR - Video codec operation bits
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_CODEC_OPERATION_NONE_KHR VIDEO_CODEC_OPERATION_NONE_KHR} indicates no support for any video codec operations.</li>
     * <li>{@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR} specifies support for H.264 video decode operations.</li>
     * <li>{@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR} specifies support for H.265 video decode operations.</li>
     * <li>{@link EXTVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT} specifies support for H.264 video encode operations.</li>
     * <li>{@link EXTVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT} specifies support for H.265 video encode operations.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoProfileInfoKHR}</p>
     */
    public static final int VK_VIDEO_CODEC_OPERATION_NONE_KHR = 0;

    /**
     * VkVideoChromaSubsamplingFlagBitsKHR - Video format chroma subsampling bits
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_CHROMA_SUBSAMPLING_MONOCHROME_BIT_KHR VIDEO_CHROMA_SUBSAMPLING_MONOCHROME_BIT_KHR} specifies that the format is monochrome.</li>
     * <li>{@link #VK_VIDEO_CHROMA_SUBSAMPLING_420_BIT_KHR VIDEO_CHROMA_SUBSAMPLING_420_BIT_KHR} specified that the format is 4:2:0 chroma subsampled, i.e. the two chroma components are sampled horizontally and vertically at half the sample rate of the luma component.</li>
     * <li>{@link #VK_VIDEO_CHROMA_SUBSAMPLING_422_BIT_KHR VIDEO_CHROMA_SUBSAMPLING_422_BIT_KHR} - the format is 4:2:2 chroma subsampled, i.e. the two chroma components are sampled horizontally at half the sample rate of luma component.</li>
     * <li>{@link #VK_VIDEO_CHROMA_SUBSAMPLING_444_BIT_KHR VIDEO_CHROMA_SUBSAMPLING_444_BIT_KHR} - the format is 4:4:4 chroma sampled, i.e. all three components of the Y′C<sub>B</sub>C<sub>R</sub> format are sampled at the same rate, thus there is no chroma subsampling.</li>
     * </ul>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_CHROMA_SUBSAMPLING_INVALID_KHR VIDEO_CHROMA_SUBSAMPLING_INVALID_KHR}</li>
     * </ul>
     */
    public static final int
        VK_VIDEO_CHROMA_SUBSAMPLING_INVALID_KHR        = 0,
        VK_VIDEO_CHROMA_SUBSAMPLING_MONOCHROME_BIT_KHR = 0x1,
        VK_VIDEO_CHROMA_SUBSAMPLING_420_BIT_KHR        = 0x2,
        VK_VIDEO_CHROMA_SUBSAMPLING_422_BIT_KHR        = 0x4,
        VK_VIDEO_CHROMA_SUBSAMPLING_444_BIT_KHR        = 0x8;

    /**
     * VkVideoComponentBitDepthFlagBitsKHR - Video format component bit depth
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_COMPONENT_BIT_DEPTH_8_BIT_KHR VIDEO_COMPONENT_BIT_DEPTH_8_BIT_KHR} specifies a component bit depth of 8 bits.</li>
     * <li>{@link #VK_VIDEO_COMPONENT_BIT_DEPTH_10_BIT_KHR VIDEO_COMPONENT_BIT_DEPTH_10_BIT_KHR} specifies a component bit depth of 10 bits.</li>
     * <li>{@link #VK_VIDEO_COMPONENT_BIT_DEPTH_12_BIT_KHR VIDEO_COMPONENT_BIT_DEPTH_12_BIT_KHR} specifies a component bit depth of 12 bits.</li>
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
     * VkVideoCapabilityFlagBitsKHR - Video decode and encode capability bits
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_CAPABILITY_PROTECTED_CONTENT_BIT_KHR VIDEO_CAPABILITY_PROTECTED_CONTENT_BIT_KHR} specifies that video sessions support producing and consuming protected content.</li>
     * <li>{@link #VK_VIDEO_CAPABILITY_SEPARATE_REFERENCE_IMAGES_BIT_KHR VIDEO_CAPABILITY_SEPARATE_REFERENCE_IMAGES_BIT_KHR} specifies that the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-picture-resources">video picture resources</a> associated with the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB slots</a> of a video session <b>can</b> be backed by separate {@code VkImage} objects. If this capability flag is not present, then all DPB slots of a video session <b>must</b> be associated with video picture resources backed by the same {@code VkImage} object (e.g. using different layers of the same image).</li>
     * </ul>
     */
    public static final int
        VK_VIDEO_CAPABILITY_PROTECTED_CONTENT_BIT_KHR         = 0x1,
        VK_VIDEO_CAPABILITY_SEPARATE_REFERENCE_IMAGES_BIT_KHR = 0x2;

    /**
     * VkVideoSessionCreateFlagBitsKHR - Video session creation flags
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_SESSION_CREATE_PROTECTED_CONTENT_BIT_KHR VIDEO_SESSION_CREATE_PROTECTED_CONTENT_BIT_KHR} specifies that the video session uses protected video content.</li>
     * <li>{@link KHRVideoEncodeQueue#VK_VIDEO_SESSION_CREATE_ALLOW_ENCODE_PARAMETER_OPTIMIZATIONS_BIT_KHR VIDEO_SESSION_CREATE_ALLOW_ENCODE_PARAMETER_OPTIMIZATIONS_BIT_KHR} specifies that the implementation is allowed to override video session parameters and other codec-specific encoding parameters to optimize video encode operations based on the specific use case defined by the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-profiles">video profile</a> and the used video encode quality level.</li>
     * </ul>
     */
    public static final int VK_VIDEO_SESSION_CREATE_PROTECTED_CONTENT_BIT_KHR = 0x1;

    /**
     * VkVideoCodingControlFlagBitsKHR - Video coding control flags
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_CODING_CONTROL_RESET_BIT_KHR VIDEO_CODING_CONTROL_RESET_BIT_KHR} indicates a request for the bound video session to be reset before other coding control parameters are applied.</li>
     * <li>{@link KHRVideoEncodeQueue#VK_VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR} indicates that the coding control parameters include video encode rate control parameters (see {@link VkVideoEncodeRateControlInfoKHR}).</li>
     * <li>{@link KHRVideoEncodeQueue#VK_VIDEO_CODING_CONTROL_ENCODE_QUALITY_LEVEL_BIT_KHR VIDEO_CODING_CONTROL_ENCODE_QUALITY_LEVEL_BIT_KHR} indicates that the coding control parameters include video encode quality level parameters (see {@link VkVideoEncodeQualityLevelInfoKHR}).</li>
     * </ul>
     */
    public static final int VK_VIDEO_CODING_CONTROL_RESET_BIT_KHR = 0x1;

    /**
     * VkQueryResultStatusKHR - Specific status codes for operations
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_QUERY_RESULT_STATUS_NOT_READY_KHR QUERY_RESULT_STATUS_NOT_READY_KHR} specifies that the query result is not yet available.</li>
     * <li>{@link #VK_QUERY_RESULT_STATUS_ERROR_KHR QUERY_RESULT_STATUS_ERROR_KHR} specifies that operations did not complete successfully.</li>
     * <li>{@link #VK_QUERY_RESULT_STATUS_COMPLETE_KHR QUERY_RESULT_STATUS_COMPLETE_KHR} specifies that operations completed successfully and the query result is available.</li>
     * <li>{@link KHRVideoEncodeQueue#VK_QUERY_RESULT_STATUS_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_KHR QUERY_RESULT_STATUS_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_KHR} indicates that a video encode operation did not complete successfully due to the destination video bitstream buffer range not being sufficiently large to fit the encoded bitstream data.</li>
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
     * Query video coding capabilities.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query video coding capabilities for a specific video profile, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPhysicalDeviceVideoCapabilitiesKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     const VkVideoProfileInfoKHR*                pVideoProfile,
     *     VkVideoCapabilitiesKHR*                     pCapabilities);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-profiles">video profile</a> described by {@code pVideoProfile} is supported by the implementation, then this command returns {@link VK10#VK_SUCCESS SUCCESS} and {@code pCapabilities} is filled with the capabilities supported with the specified video profile. Otherwise, one of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-profile-error-codes">video-profile-specific error codes</a> are returned.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code pVideoProfile→videoCodecOperation} specifies a decode operation, then the {@code pNext} chain of {@code pCapabilities} <b>must</b> include a {@link VkVideoDecodeCapabilitiesKHR} structure</li>
     * <li>If {@code pVideoProfile→videoCodecOperation} is {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR}, then the {@code pNext} chain of {@code pCapabilities} <b>must</b> include a {@link VkVideoDecodeH264CapabilitiesKHR} structure</li>
     * <li>If {@code pVideoProfile→videoCodecOperation} is {@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR}, then the {@code pNext} chain of {@code pCapabilities} <b>must</b> include a {@link VkVideoDecodeH265CapabilitiesKHR} structure</li>
     * <li>If {@code pVideoProfile→videoCodecOperation} specifies an encode operation, then the {@code pNext} chain of {@code pCapabilities} <b>must</b> include a {@link VkVideoEncodeCapabilitiesKHR} structure</li>
     * <li>If {@code pVideoProfile→videoCodecOperation} is {@link EXTVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT}, then the {@code pNext} chain of {@code pCapabilities} <b>must</b> include a {@link VkVideoEncodeH264CapabilitiesEXT} structure</li>
     * <li>If {@code pVideoProfile→videoCodecOperation} is {@link EXTVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT}, then the {@code pNext} chain of {@code pCapabilities} <b>must</b> include a {@link VkVideoEncodeH265CapabilitiesEXT} structure</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pVideoProfile} <b>must</b> be a valid pointer to a valid {@link VkVideoProfileInfoKHR} structure</li>
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
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link #VK_ERROR_VIDEO_PROFILE_OPERATION_NOT_SUPPORTED_KHR ERROR_VIDEO_PROFILE_OPERATION_NOT_SUPPORTED_KHR}</li>
     * <li>{@link #VK_ERROR_VIDEO_PROFILE_FORMAT_NOT_SUPPORTED_KHR ERROR_VIDEO_PROFILE_FORMAT_NOT_SUPPORTED_KHR}</li>
     * <li>{@link #VK_ERROR_VIDEO_PICTURE_LAYOUT_NOT_SUPPORTED_KHR ERROR_VIDEO_PICTURE_LAYOUT_NOT_SUPPORTED_KHR}</li>
     * <li>{@link #VK_ERROR_VIDEO_PROFILE_CODEC_NOT_SUPPORTED_KHR ERROR_VIDEO_PROFILE_CODEC_NOT_SUPPORTED_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoCapabilitiesKHR}, {@link VkVideoProfileInfoKHR}</p>
     *
     * @param physicalDevice the physical device from which to query the video decode or encode capabilities.
     * @param pVideoProfile  a pointer to a {@link VkVideoProfileInfoKHR} structure.
     * @param pCapabilities  a pointer to a {@link VkVideoCapabilitiesKHR} structure in which the capabilities are returned.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceVideoCapabilitiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkVideoProfileInfoKHR const *") VkVideoProfileInfoKHR pVideoProfile, @NativeType("VkVideoCapabilitiesKHR *") VkVideoCapabilitiesKHR pCapabilities) {
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
     * Query supported video decode and encode image formats and capabilities.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To enumerate the supported output, input and DPB image formats and corresponding capabilities for a specific video profile, call:</p>
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
     * <p>Video format properties are always queried with respect to a specific set of video profiles. These are specified by chaining the {@link VkVideoProfileListInfoKHR} structure to {@code pVideoFormatInfo}.</p>
     * 
     * <p>For most use cases, the images are used by a single video session and a single video profile is provided. For a use case such as video transcoding, where a decode session output image <b>can</b> be used as encode input in one or more encode sessions, multiple video profiles corresponding to the video sessions that will share the image <b>must</b> be provided.</p>
     * 
     * <p>If any of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-profiles">video profiles</a> specified via {@link VkVideoProfileListInfoKHR}{@code ::pProfiles} are not supported, then this command returns one of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-profile-error-codes">video-profile-specific error codes</a>. Furthermore, if {@link VkPhysicalDeviceVideoFormatInfoKHR}{@code ::imageUsage} includes any image usage flags not supported by the specified video profiles, then this command returns {@link #VK_ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR}.</p>
     * 
     * <p>This command also returns {@link #VK_ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR} if {@link VkPhysicalDeviceVideoFormatInfoKHR}{@code ::imageUsage} does not include the appropriate flags as dictated by the decode capability flags returned in {@link VkVideoDecodeCapabilitiesKHR}{@code ::flags} for any of the profiles specified in the {@link VkVideoProfileListInfoKHR} structure provided in the {@code pNext} chain of {@code pVideoFormatInfo}.</p>
     * 
     * <p>If the decode capability flags include {@link KHRVideoDecodeQueue#VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR} but not {@link KHRVideoDecodeQueue#VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR}, then in order to query video format properties for decode DPB and output usage, {@link VkPhysicalDeviceVideoFormatInfoKHR}{@code ::imageUsage} <b>must</b> include both {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR} and {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR}. Otherwise, the call will fail with {@link #VK_ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR}.</p>
     * 
     * <p>If the decode capability flags include {@link KHRVideoDecodeQueue#VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR} but not {@link KHRVideoDecodeQueue#VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR}, then in order to query video format properties for decode DPB usage, {@link VkPhysicalDeviceVideoFormatInfoKHR}{@code ::imageUsage} <b>must</b> include {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR}, but not {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR}. Otherwise, the call will fail with {@link #VK_ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR}. Similarly, to query video format properties for decode output usage, {@link VkPhysicalDeviceVideoFormatInfoKHR}{@code ::imageUsage} <b>must</b> include {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR}, but not {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR}. Otherwise, the call will fail with {@link #VK_ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR}.</p>
     * 
     * <p>The {@code imageUsage} member of the {@link VkPhysicalDeviceVideoFormatInfoKHR} structure specifies the expected video usage flags that the returned video formats <b>must</b> support. Correspondingly, the {@code imageUsageFlags} member of each {@link VkVideoFormatPropertiesKHR} structure returned will contain at least the same set of image usage flags.</p>
     * 
     * <p>If the implementation supports using video input, output, or DPB images of a particular format in operations other than video decode/encode then the {@code imageUsageFlags} member of the corresponding {@link VkVideoFormatPropertiesKHR} structure returned will include additional image usage flags indicating that.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note:</h5>
     * 
     * <p>For most use cases, only decode or encode related usage flags are going to be specified. For a use case such as transcode, if the image were to be shared between decode and encode session(s), then both decode and encode related usage flags <b>can</b> be set.</p>
     * </div>
     * 
     * <p>Multiple {@link VkVideoFormatPropertiesKHR} entries <b>may</b> be returned with the same {@code format} member with different {@code componentMapping}, {@code imageType}, or {@code imageTiling} values, as described later.</p>
     * 
     * <p>In addition, a different set of {@link VkVideoFormatPropertiesKHR} entries <b>may</b> be returned depending on the {@code imageUsage} member of the {@link VkPhysicalDeviceVideoFormatInfoKHR} structure, even for the same set of video profiles, for example, based on whether encode input, encode DPB, decode output, and/or decode DPB usage is requested.</p>
     * 
     * <p>The application <b>can</b> select the parameters returned in the {@link VkVideoFormatPropertiesKHR} entries and use compatible parameters when creating the input, output, and DPB images. The implementation will report all image creation and usage flags that are valid for images used with the requested video profiles but applications <b>should</b> create images only with those that are necessary for the particular use case.</p>
     * 
     * <p>Before creating an image, the application <b>can</b> obtain the complete set of supported image format features by calling {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2} using parameters derived from the members of one of the reported {@link VkVideoFormatPropertiesKHR} entries and adding the same {@link VkVideoProfileListInfoKHR} structure to the {@code pNext} chain of {@link VkPhysicalDeviceImageFormatInfo2}.</p>
     * 
     * <p>The following applies to all {@link VkVideoFormatPropertiesKHR} entries returned by {@code vkGetPhysicalDeviceVideoFormatPropertiesKHR}:</p>
     * 
     * <ul>
     * <li>{@link VK11#vkGetPhysicalDeviceFormatProperties2 GetPhysicalDeviceFormatProperties2} <b>must</b> succeed when called with {@link VkVideoFormatPropertiesKHR}{@code ::format}</li>
     * <li>If {@link VkVideoFormatPropertiesKHR}{@code ::imageTiling} is {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, then the {@code optimalTilingFeatures} returned by {@link VK11#vkGetPhysicalDeviceFormatProperties2 GetPhysicalDeviceFormatProperties2} <b>must</b> include all format features required by the image usage flags reported in {@link VkVideoFormatPropertiesKHR}{@code ::imageUsageFlags} for the format, as indicated in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#format-feature-dependent-usage-flags">Format Feature Dependent Usage Flags</a> section.</li>
     * <li>If {@link VkVideoFormatPropertiesKHR}{@code ::imageTiling} is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, then the {@code linearTilingFeatures} returned by {@link VK11#vkGetPhysicalDeviceFormatProperties2 GetPhysicalDeviceFormatProperties2} <b>must</b> include all format features required by the image usage flags reported in {@link VkVideoFormatPropertiesKHR}{@code ::imageUsageFlags} for the format, as indicated in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#format-feature-dependent-usage-flags">Format Feature Dependent Usage Flags</a> section.</li>
     * <li>{@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2} <b>must</b> succeed when called with a {@link VkPhysicalDeviceImageFormatInfo2} structure containing the following information:
     * 
     * <ul>
     * <li>The {@code pNext} chain including the same {@link VkVideoProfileListInfoKHR} structure used to call {@code vkGetPhysicalDeviceVideoFormatPropertiesKHR}.</li>
     * <li>{@code format} set to the value of {@link VkVideoFormatPropertiesKHR}{@code ::format}.</li>
     * <li>{@code type} set to the value of {@link VkVideoFormatPropertiesKHR}{@code ::imageType}.</li>
     * <li>{@code tiling} set to the value of {@link VkVideoFormatPropertiesKHR}{@code ::imageTiling}.</li>
     * <li>{@code usage} set to the value of {@link VkVideoFormatPropertiesKHR}{@code ::imageUsageFlags}.</li>
     * <li>{@code flags} set to the value of {@link VkVideoFormatPropertiesKHR}{@code ::imageCreateFlags}.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <p>The {@code componentMapping} member of {@link VkVideoFormatPropertiesKHR} defines the ordering of the Y′C<sub>B</sub>C<sub>R</sub> color channels from the perspective of the video codec operations specified in {@link VkVideoProfileListInfoKHR}. For example, if the implementation produces video decode output with the format {@link VK11#VK_FORMAT_G8_B8R8_2PLANE_420_UNORM FORMAT_G8_B8R8_2PLANE_420_UNORM} where the blue and red chrominance channels are swapped then the {@code componentMapping} member of the corresponding {@link VkVideoFormatPropertiesKHR} structure will have the following member values:</p>
     * 
     * <pre><code>
     * components.r = VK_COMPONENT_SWIZZLE_B;        // Cb component
     * components.g = VK_COMPONENT_SWIZZLE_IDENTITY; // Y component
     * components.b = VK_COMPONENT_SWIZZLE_R;        // Cr component
     * components.a = VK_COMPONENT_SWIZZLE_IDENTITY; // unused, defaults to 1.0</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The {@code pNext} chain of {@code pVideoFormatInfo} <b>must</b> include a {@link VkVideoProfileListInfoKHR} structure with {@code profileCount} greater than 0</li>
     * </ul>
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
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link #VK_ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR}</li>
     * <li>{@link #VK_ERROR_VIDEO_PROFILE_OPERATION_NOT_SUPPORTED_KHR ERROR_VIDEO_PROFILE_OPERATION_NOT_SUPPORTED_KHR}</li>
     * <li>{@link #VK_ERROR_VIDEO_PROFILE_FORMAT_NOT_SUPPORTED_KHR ERROR_VIDEO_PROFILE_FORMAT_NOT_SUPPORTED_KHR}</li>
     * <li>{@link #VK_ERROR_VIDEO_PICTURE_LAYOUT_NOT_SUPPORTED_KHR ERROR_VIDEO_PICTURE_LAYOUT_NOT_SUPPORTED_KHR}</li>
     * <li>{@link #VK_ERROR_VIDEO_PROFILE_CODEC_NOT_SUPPORTED_KHR ERROR_VIDEO_PROFILE_CODEC_NOT_SUPPORTED_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPhysicalDeviceVideoFormatInfoKHR}, {@link VkVideoFormatPropertiesKHR}</p>
     *
     * @param physicalDevice            the physical device from which to query the video format properties.
     * @param pVideoFormatInfo          a pointer to a {@link VkPhysicalDeviceVideoFormatInfoKHR} structure specifying the usage and video profiles for which supported image formats and capabilities are returned.
     * @param pVideoFormatPropertyCount a pointer to an integer related to the number of video format properties available or queried, as described below.
     * @param pVideoFormatProperties    a pointer to an array of {@link VkVideoFormatPropertiesKHR} structures in which supported image formats and capabilities are returned.
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
     * <h5>Description</h5>
     * 
     * <p>The resulting video session object is said to be created with the video codec operation specified in {@code pCreateInfo→pVideoProfile→videoCodecOperation}.</p>
     * 
     * <p>The name and version of the codec-specific Video Std header to be used with the video session is specified by the {@link VkExtensionProperties} structure pointed to by {@code pCreateInfo→pStdHeaderVersion}. If a non-existent or unsupported Video Std header version is specified in {@code pCreateInfo→pStdHeaderVersion→specVersion}, then this command returns {@link #VK_ERROR_VIDEO_STD_VERSION_NOT_SUPPORTED_KHR ERROR_VIDEO_STD_VERSION_NOT_SUPPORTED_KHR}.</p>
     * 
     * <p>Video session objects are created in <em>uninitialized</em> state. In order to transition the video session into <em>initial</em> state, the application <b>must</b> issue a {@link #vkCmdControlVideoCodingKHR CmdControlVideoCodingKHR} command with {@link VkVideoCodingControlInfoKHR}{@code ::flags} including {@link #VK_VIDEO_CODING_CONTROL_RESET_BIT_KHR VIDEO_CODING_CONTROL_RESET_BIT_KHR}.</p>
     * 
     * <p>Video session objects also maintain the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-state-and-backing-store">state</a> of the DPB. The number of DPB slots usable with the created video session is specified in {@code pCreateInfo→maxDpbSlots}, and each slot is initially in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot-states">inactive state</a>.</p>
     * 
     * <p>Each <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB slot</a> maintained by the created video session <b>can</b> refer to a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#reference-picture">reference picture</a> representing a video frame.</p>
     * 
     * <p>In addition, if the {@code videoCodecOperation} member of the {@link VkVideoProfileInfoKHR} structure pointed to by {@code pCreateInfo→pVideoProfile} is {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR} and the {@code pictureLayout} member of the {@link VkVideoDecodeH264ProfileInfoKHR} structure provided in the {@link VkVideoProfileInfoKHR}{@code ::pNext} chain is not {@link KHRVideoDecodeH264#VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_PROGRESSIVE_KHR VIDEO_DECODE_H264_PICTURE_LAYOUT_PROGRESSIVE_KHR}, then the created video session supports <em>interlaced</em> frames and each <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB slot</a> maintained by the created video session <b>can</b> instead refer to separate top field and bottom field <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#reference-picture">reference pictures</a> that together <b>can</b> represent a full video frame. In this case, it is up to the application, driven by the video content, whether it associates any individual DPB slot with separate top and/or bottom field pictures or a single picture representing a full frame.</p>
     * 
     * <p>The created video session <b>can</b> be used to perform video coding operations using video frames up to the maximum size specified in {@code pCreateInfo→maxCodedExtent}. The minimum frame size allowed is implicitly derived from {@link VkVideoCapabilitiesKHR}{@code ::minCodedExtent}, as returned by {@link #vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile specified by {@code pCreateInfo→pVideoProfile}. Accordingly, the created video session is said to be created with a {@code minCodedExtent} equal to that.</p>
     * 
     * <p>In case of video session objects created with a video encode operation, implementations <b>may</b> return the {@link KHRVideoEncodeQueue#VK_ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR} error if any of the specified Video Std parameters do not adhere to the syntactic or semantic requirements of the used video compression standard, or if values derived from parameters according to the rules defined by the used video compression standard do not adhere to the capabilities of the video compression standard or the implementation.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Applications <b>should</b> not rely on the {@link KHRVideoEncodeQueue#VK_ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR} error being returned by any command as a means to verify Video Std parameters, as implementations are not required to report the error in any specific set of cases.</p>
     * </div>
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
     * <li>{@link #VK_ERROR_VIDEO_STD_VERSION_NOT_SUPPORTED_KHR ERROR_VIDEO_STD_VERSION_NOT_SUPPORTED_KHR}</li>
     * <li>{@link KHRVideoEncodeQueue#VK_ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkVideoSessionCreateInfoKHR}</p>
     *
     * @param device        the logical device that creates the video session.
     * @param pCreateInfo   a pointer to a {@link VkVideoSessionCreateInfoKHR} structure containing parameters to be used to create the video session.
     * @param pAllocator    controls host memory allocation as described in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pVideoSession a pointer to a {@code VkVideoSessionKHR} handle in which the resulting video session object is returned.
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
     * Destroy video session object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To destroy a video session, call:</p>
     * 
     * <pre><code>
     * void vkDestroyVideoSessionKHR(
     *     VkDevice                                    device,
     *     VkVideoSessionKHR                           videoSession,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>All submitted commands that refer to {@code videoSession} <b>must</b> have completed execution</li>
     * <li>If {@link VkAllocationCallbacks} were provided when {@code videoSession} was created, a compatible set of callbacks <b>must</b> be provided here</li>
     * <li>If no {@link VkAllocationCallbacks} were provided when {@code videoSession} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code videoSession} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code videoSession} <b>must</b> be a valid {@code VkVideoSessionKHR} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>If {@code videoSession} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code videoSession} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param device       the logical device that destroys the video session.
     * @param videoSession the video session to destroy.
     * @param pAllocator   controls host memory allocation as described in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyVideoSessionKHR(VkDevice device, @NativeType("VkVideoSessionKHR") long videoSession, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyVideoSessionKHR(device, videoSession, memAddressSafe(pAllocator));
    }

    // --- [ vkGetVideoSessionMemoryRequirementsKHR ] ---

    /**
     * Unsafe version of: {@link #vkGetVideoSessionMemoryRequirementsKHR GetVideoSessionMemoryRequirementsKHR}
     *
     * @param pMemoryRequirementsCount a pointer to an integer related to the number of memory binding requirements available or queried, as described below.
     */
    public static int nvkGetVideoSessionMemoryRequirementsKHR(VkDevice device, long videoSession, long pMemoryRequirementsCount, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetVideoSessionMemoryRequirementsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), videoSession, pMemoryRequirementsCount, pMemoryRequirements, __functionAddress);
    }

    /**
     * Get the memory requirements for a video session.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To determine the memory requirements for a video session object, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetVideoSessionMemoryRequirementsKHR(
     *     VkDevice                                    device,
     *     VkVideoSessionKHR                           videoSession,
     *     uint32_t*                                   pMemoryRequirementsCount,
     *     VkVideoSessionMemoryRequirementsKHR*        pMemoryRequirements);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pMemoryRequirements} is {@code NULL}, then the number of memory bindings required for the video session is returned in {@code pMemoryRequirementsCount}. Otherwise, {@code pMemoryRequirementsCount} <b>must</b> point to a variable set by the user with the number of elements in the {@code pMemoryRequirements} array, and on return the variable is overwritten with the number of memory binding requirements actually written to {@code pMemoryRequirements}. If {@code pMemoryRequirementsCount} is less than the number of memory bindings required for the video session, then at most {@code pMemoryRequirementsCount} elements will be written to {@code pMemoryRequirements}, and {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned, instead of {@link VK10#VK_SUCCESS SUCCESS}, to indicate that not all required memory binding requirements were returned.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code videoSession} <b>must</b> be a valid {@code VkVideoSessionKHR} handle</li>
     * <li>{@code pMemoryRequirementsCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pMemoryRequirementsCount} is not 0, and {@code pMemoryRequirements} is not {@code NULL}, {@code pMemoryRequirements} <b>must</b> be a valid pointer to an array of {@code pMemoryRequirementsCount} {@link VkVideoSessionMemoryRequirementsKHR} structures</li>
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
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoSessionMemoryRequirementsKHR}</p>
     *
     * @param device                   the logical device that owns the video session.
     * @param videoSession             the video session to query.
     * @param pMemoryRequirementsCount a pointer to an integer related to the number of memory binding requirements available or queried, as described below.
     * @param pMemoryRequirements      {@code NULL} or a pointer to an array of {@link VkVideoSessionMemoryRequirementsKHR} structures in which the memory binding requirements of the video session are returned.
     */
    @NativeType("VkResult")
    public static int vkGetVideoSessionMemoryRequirementsKHR(VkDevice device, @NativeType("VkVideoSessionKHR") long videoSession, @NativeType("uint32_t *") IntBuffer pMemoryRequirementsCount, @Nullable @NativeType("VkVideoSessionMemoryRequirementsKHR *") VkVideoSessionMemoryRequirementsKHR.Buffer pMemoryRequirements) {
        if (CHECKS) {
            check(pMemoryRequirementsCount, 1);
            checkSafe(pMemoryRequirements, pMemoryRequirementsCount.get(pMemoryRequirementsCount.position()));
        }
        return nvkGetVideoSessionMemoryRequirementsKHR(device, videoSession, memAddress(pMemoryRequirementsCount), memAddressSafe(pMemoryRequirements));
    }

    // --- [ vkBindVideoSessionMemoryKHR ] ---

    /**
     * Unsafe version of: {@link #vkBindVideoSessionMemoryKHR BindVideoSessionMemoryKHR}
     *
     * @param bindSessionMemoryInfoCount the number of elements in {@code pBindSessionMemoryInfos}.
     */
    public static int nvkBindVideoSessionMemoryKHR(VkDevice device, long videoSession, int bindSessionMemoryInfoCount, long pBindSessionMemoryInfos) {
        long __functionAddress = device.getCapabilities().vkBindVideoSessionMemoryKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), videoSession, bindSessionMemoryInfoCount, pBindSessionMemoryInfos, __functionAddress);
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
     *     uint32_t                                    bindSessionMemoryInfoCount,
     *     const VkBindVideoSessionMemoryInfoKHR*      pBindSessionMemoryInfos);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The valid usage statements below refer to the {@link VkMemoryRequirements} structure corresponding to a specific element of {@code pBindSessionMemoryInfos}, which is defined as follows:</p>
     * 
     * <ul>
     * <li>If the {@code memoryBindIndex} member of the element of {@code pBindSessionMemoryInfos} in question matches the {@code memoryBindIndex} member of one of the elements returned in {@code pMemoryRequirements} when {@link #vkGetVideoSessionMemoryRequirementsKHR GetVideoSessionMemoryRequirementsKHR} is called with the same {@code videoSession} and with {@code pMemoryRequirementsCount} equal to {@code bindSessionMemoryInfoCount}, then the {@code memoryRequirements} member of that element of {@code pMemoryRequirements} is the {@link VkMemoryRequirements} structure corresponding to the element of {@code pBindSessionMemoryInfos} in question.</li>
     * <li>Otherwise the element of {@code pBindSessionMemoryInfos} in question is said to not have a corresponding {@link VkMemoryRequirements} structure.</li>
     * </ul>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The memory binding of {@code videoSession} identified by the {@code memoryBindIndex} member of any element of {@code pBindSessionMemoryInfos} <b>must</b> not already be backed by a memory object</li>
     * <li>The {@code memoryBindIndex} member of each element of {@code pBindSessionMemoryInfos} <b>must</b> be unique within {@code pBindSessionMemoryInfos}</li>
     * <li>Each element of {@code pBindSessionMemoryInfos} <b>must</b> have a corresponding {@link VkMemoryRequirements} structure</li>
     * <li>If an element of {@code pBindSessionMemoryInfos} has a corresponding {@link VkMemoryRequirements} structure, then the {@code memory} member of that element of {@code pBindSessionMemoryInfos} <b>must</b> have been allocated using one of the memory types allowed in the {@code memoryTypeBits} member of the corresponding {@link VkMemoryRequirements} structure</li>
     * <li>If an element of {@code pBindSessionMemoryInfos} has a corresponding {@link VkMemoryRequirements} structure, then the {@code memoryOffset} member of that element of {@code pBindSessionMemoryInfos} <b>must</b> be an integer multiple of the {@code alignment} member of the corresponding {@link VkMemoryRequirements} structure</li>
     * <li>If an element of {@code pBindSessionMemoryInfos} has a corresponding {@link VkMemoryRequirements} structure, then the {@code memorySize} member of that element of {@code pBindSessionMemoryInfos} <b>must</b> equal the {@code size} member of the corresponding {@link VkMemoryRequirements} structure</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code videoSession} <b>must</b> be a valid {@code VkVideoSessionKHR} handle</li>
     * <li>{@code pBindSessionMemoryInfos} <b>must</b> be a valid pointer to an array of {@code bindSessionMemoryInfoCount} valid {@link VkBindVideoSessionMemoryInfoKHR} structures</li>
     * <li>{@code bindSessionMemoryInfoCount} <b>must</b> be greater than 0</li>
     * <li>{@code videoSession} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code videoSession} <b>must</b> be externally synchronized</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkBindVideoSessionMemoryInfoKHR}</p>
     *
     * @param device                  the logical device that owns the video session.
     * @param videoSession            the video session to be bound with device memory.
     * @param pBindSessionMemoryInfos a pointer to an array of {@code bindSessionMemoryInfoCount} {@link VkBindVideoSessionMemoryInfoKHR} structures specifying memory regions to be bound to specific memory bindings of the video session.
     */
    @NativeType("VkResult")
    public static int vkBindVideoSessionMemoryKHR(VkDevice device, @NativeType("VkVideoSessionKHR") long videoSession, @NativeType("VkBindVideoSessionMemoryInfoKHR const *") VkBindVideoSessionMemoryInfoKHR.Buffer pBindSessionMemoryInfos) {
        return nvkBindVideoSessionMemoryKHR(device, videoSession, pBindSessionMemoryInfos.remaining(), pBindSessionMemoryInfos.address());
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
     * Creates video session parameters object.
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
     * <h5>Description</h5>
     * 
     * <p>The resulting video session parameters object is said to be created with the video codec operation {@code pCreateInfo→videoSession} was created with.</p>
     * 
     * <p>If {@code pCreateInfo→videoSessionParametersTemplate} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then it will be used as a template for constructing the new video session parameters object. This happens by first adding any parameters according to the additional creation parameters provided in the {@code pCreateInfo→pNext} chain, followed by adding any parameters from the template object that have a key that does not match the key of any of the already added parameters.</p>
     * 
     * <p>If {@code pCreateInfo→videoSession} was created with the video codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR}, then the created video session parameters object will initially contain the following sets of parameter entries:</p>
     * 
     * <ul>
     * <li>{@code StdVideoH264SequenceParameterSet} structures representing <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-sps">H.264 SPS</a> entries, as follows:
     * 
     * <ul>
     * <li>If the {@code pParametersAddInfo} member of the {@link VkVideoDecodeH264SessionParametersCreateInfoKHR} structure provided in the {@code pCreateInfo→pNext} chain is not {@code NULL}, then the set of {@code StdVideoH264SequenceParameterSet} entries specified in {@code pParametersAddInfo→pStdSPSs} are added first;</li>
     * <li>If {@code pCreateInfo→videoSessionParametersTemplate} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then each {@code StdVideoH264SequenceParameterSet} entry stored in it is copied to the created video session parameters object if the created object does not already contain such an entry with the same {@code seq_parameter_set_id}.</li>
     * </ul>
     * </li>
     * <li>{@code StdVideoH264PictureParameterSet} structures representing <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-pps">H.264 PPS</a> entries, as follows:
     * 
     * <ul>
     * <li>If the {@code pParametersAddInfo} member of the {@link VkVideoDecodeH264SessionParametersCreateInfoKHR} structure provided in the {@code pCreateInfo→pNext} chain is not {@code NULL}, then the set of {@code StdVideoH264PictureParameterSet} entries specified in {@code pParametersAddInfo→pStdPPSs} are added first;</li>
     * <li>If {@code pCreateInfo→videoSessionParametersTemplate} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then each {@code StdVideoH264PictureParameterSet} entry stored in it is copied to the created video session parameters object if the created object does not already contain such an entry with the same {@code seq_parameter_set_id} and {@code pic_parameter_set_id}.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <p>If {@code pCreateInfo→videoSession} was created with the video codec operation {@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR}, then the created video session parameters object will initially contain the following sets of parameter entries:</p>
     * 
     * <ul>
     * <li>{@code StdVideoH265VideoParameterSet} structures representing <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h265-vps">H.265 VPS</a> entries, as follows:
     * 
     * <ul>
     * <li>If the {@code pParametersAddInfo} member of the {@link VkVideoDecodeH265SessionParametersCreateInfoKHR} structure provided in the {@code pCreateInfo→pNext} chain is not {@code NULL}, then the set of {@code StdVideoH265VideoParameterSet} entries specified in {@code pParametersAddInfo→pStdVPSs} are added first;</li>
     * <li>If {@code pCreateInfo→videoSessionParametersTemplate} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then each {@code StdVideoH265VideoParameterSet} entry stored in it is copied to the created video session parameters object if the created object does not already contain such an entry with the same {@code vps_video_parameter_set_id}.</li>
     * </ul>
     * </li>
     * <li>{@code StdVideoH265SequenceParameterSet} structures representing <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h265-sps">H.265 SPS</a> entries, as follows:
     * 
     * <ul>
     * <li>If the {@code pParametersAddInfo} member of the {@link VkVideoDecodeH265SessionParametersCreateInfoKHR} structure provided in the {@code pCreateInfo→pNext} chain is not {@code NULL}, then the set of {@code StdVideoH265SequenceParameterSet} entries specified in {@code pParametersAddInfo→pStdSPSs} are added first;</li>
     * <li>If {@code pCreateInfo→videoSessionParametersTemplate} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then each {@code StdVideoH265SequenceParameterSet} entry stored in it is copied to the created video session parameters object if the created object does not already contain such an entry with the same {@code sps_video_parameter_set_id} and {@code sps_seq_parameter_set_id}.</li>
     * </ul>
     * </li>
     * <li>{@code StdVideoH265PictureParameterSet} structures representing <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h265-pps">H.265 PPS</a> entries, as follows:
     * 
     * <ul>
     * <li>If the {@code pParametersAddInfo} member of the {@link VkVideoDecodeH265SessionParametersCreateInfoKHR} structure provided in the {@code pCreateInfo→pNext} chain is not {@code NULL}, then the set of {@code StdVideoH265PictureParameterSet} entries specified in {@code pParametersAddInfo→pStdPPSs} are added first;</li>
     * <li>If {@code pCreateInfo→videoSessionParametersTemplate} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then each {@code StdVideoH265PictureParameterSet} entry stored in it is copied to the created video session parameters object if the created object does not already contain such an entry with the same {@code sps_video_parameter_set_id}, {@code pps_seq_parameter_set_id}, and {@code pps_pic_parameter_set_id}.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <p>In case of video session parameters objects created with a video encode operation, implementations <b>may</b> return the {@link KHRVideoEncodeQueue#VK_ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR} error if any of the specified Video Std parameters do not adhere to the syntactic or semantic requirements of the used video compression standard, or if values derived from parameters according to the rules defined by the used video compression standard do not adhere to the capabilities of the video compression standard or the implementation.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Applications <b>should</b> not rely on the {@link KHRVideoEncodeQueue#VK_ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR} error being returned by any command as a means to verify Video Std parameters, as implementations are not required to report the error in any specific set of cases.</p>
     * </div>
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
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * <li>{@link KHRVideoEncodeQueue#VK_ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkVideoSessionParametersCreateInfoKHR}</p>
     *
     * @param device                  the logical device that creates the video session parameters object.
     * @param pCreateInfo             a pointer to {@link VkVideoSessionParametersCreateInfoKHR} structure containing parameters to be used to create the video session parameters object.
     * @param pAllocator              controls host memory allocation as described in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pVideoSessionParameters a pointer to a {@code VkVideoSessionParametersKHR} handle in which the resulting video session parameters object is returned.
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
     * Update video session parameters object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To update video session parameters object with new parameters, call:</p>
     * 
     * <pre><code>
     * VkResult vkUpdateVideoSessionParametersKHR(
     *     VkDevice                                    device,
     *     VkVideoSessionParametersKHR                 videoSessionParameters,
     *     const VkVideoSessionParametersUpdateInfoKHR* pUpdateInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>After a successful call to this command, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-session-parameters">update sequence counter</a> of {@code videoSessionParameters} is changed to the value specified in {@code pUpdateInfo→updateSequenceCount}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note:</h5>
     * 
     * <p>As each update issued to a video session parameters object needs to specify the next available update sequence count value, concurrent updates of the same video session parameters object are inherently disallowed. However, recording video coding operations to command buffers referring to parameters previously added to the video session parameters object is allowed, even if there is a concurrent update in progress adding some new entries to the object.</p>
     * </div>
     * 
     * <p>If {@code videoSessionParameters} was created with the video codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR} and the {@code pUpdateInfo→pNext} chain includes a {@link VkVideoDecodeH264SessionParametersAddInfoKHR} structure, then this command adds the following parameter entries to {@code videoSessionParameters}:</p>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-sps">H.264 SPS</a> entries specified in {@link VkVideoDecodeH264SessionParametersAddInfoKHR}{@code ::pStdSPSs}.</li>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-pps">H.264 PPS</a> entries specified in {@link VkVideoDecodeH264SessionParametersAddInfoKHR}{@code ::pStdPPSs}.</li>
     * </ul>
     * 
     * <p>If {@code videoSessionParameters} was created with the video codec operation {@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR} and the {@code pUpdateInfo→pNext} chain includes a {@link VkVideoDecodeH265SessionParametersAddInfoKHR} structure, then this command adds the following parameter entries to {@code videoSessionParameters}:</p>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h265-vps">H.265 VPS</a> entries specified in {@link VkVideoDecodeH265SessionParametersAddInfoKHR}{@code ::pStdVPSs}.</li>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h265-sps">H.265 SPS</a> entries specified in {@link VkVideoDecodeH265SessionParametersAddInfoKHR}{@code ::pStdSPSs}.</li>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h265-pps">H.265 PPS</a> entries specified in {@link VkVideoDecodeH265SessionParametersAddInfoKHR}{@code ::pStdPPSs}.</li>
     * </ul>
     * 
     * <p>In case of video session parameters objects created with a video encode operation, implementations <b>may</b> return the {@link KHRVideoEncodeQueue#VK_ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR} error if any of the specified Video Std parameters do not adhere to the syntactic or semantic requirements of the used video compression standard, or if values derived from parameters according to the rules defined by the used video compression standard do not adhere to the capabilities of the video compression standard or the implementation.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Applications <b>should</b> not rely on the {@link KHRVideoEncodeQueue#VK_ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR} error being returned by any command as a means to verify Video Std parameters, as implementations are not required to report the error in any specific set of cases.</p>
     * </div>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code pUpdateInfo→updateSequenceCount} <b>must</b> equal the current <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-session-parameters">update sequence counter</a> of {@code videoSessionParameters} plus one</li>
     * <li>If {@code videoSessionParameters} was created with the video codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR} and the {@code pNext} chain of {@code pUpdateInfo} includes a {@link VkVideoDecodeH264SessionParametersAddInfoKHR} structure, then {@code videoSessionParameters} <b>must</b> not already contain a {@code StdVideoH264SequenceParameterSet} entry with {@code seq_parameter_set_id} matching any of the elements of {@link VkVideoDecodeH264SessionParametersAddInfoKHR}{@code ::pStdSPSs}</li>
     * <li>If {@code videoSessionParameters} was created with the video codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR}, then the number of {@code StdVideoH264SequenceParameterSet} entries already stored in it plus the value of the {@code stdSPSCount} member of the {@link VkVideoDecodeH264SessionParametersAddInfoKHR} structure included in the {@code pUpdateInfo→pNext} chain <b>must</b> be less than or equal to the {@link VkVideoDecodeH264SessionParametersCreateInfoKHR}{@code ::maxStdSPSCount} {@code videoSessionParameters} was created with</li>
     * <li>If {@code videoSessionParameters} was created with the video codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR} and the {@code pNext} chain of {@code pUpdateInfo} includes a {@link VkVideoDecodeH264SessionParametersAddInfoKHR} structure, then {@code videoSessionParameters} <b>must</b> not already contain a {@code StdVideoH264PictureParameterSet} entry with both {@code seq_parameter_set_id} and {@code pic_parameter_set_id} matching any of the elements of {@link VkVideoDecodeH264SessionParametersAddInfoKHR}{@code ::pStdPPSs}</li>
     * <li>If {@code videoSessionParameters} was created with the video codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR}, then the number of {@code StdVideoH264PictureParameterSet} entries already stored in it plus the value of the {@code stdPPSCount} member of the {@link VkVideoDecodeH264SessionParametersAddInfoKHR} structure included in the {@code pUpdateInfo→pNext} chain <b>must</b> be less than or equal to the {@link VkVideoDecodeH264SessionParametersCreateInfoKHR}{@code ::maxStdPPSCount} {@code videoSessionParameters} was created with</li>
     * <li>If {@code videoSessionParameters} was created with the video codec operation {@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR} and the {@code pNext} chain of {@code pUpdateInfo} includes a {@link VkVideoDecodeH265SessionParametersAddInfoKHR} structure, then {@code videoSessionParameters} <b>must</b> not already contain a {@code StdVideoH265VideoParameterSet} entry with {@code vps_video_parameter_set_id} matching any of the elements of {@link VkVideoDecodeH265SessionParametersAddInfoKHR}{@code ::pStdVPSs}</li>
     * <li>If {@code videoSessionParameters} was created with the video codec operation {@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR}, then the number of {@code StdVideoH265VideoParameterSet} entries already stored in it plus the value of the {@code stdVPSCount} member of the {@link VkVideoDecodeH265SessionParametersAddInfoKHR} structure included in the {@code pUpdateInfo→pNext} chain <b>must</b> be less than or equal to the {@link VkVideoDecodeH265SessionParametersCreateInfoKHR}{@code ::maxStdVPSCount} {@code videoSessionParameters} was created with</li>
     * <li>If {@code videoSessionParameters} was created with the video codec operation {@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR} and the {@code pNext} chain of {@code pUpdateInfo} includes a {@link VkVideoDecodeH265SessionParametersAddInfoKHR} structure, then {@code videoSessionParameters} <b>must</b> not already contain a {@code StdVideoH265SequenceParameterSet} entry with both {@code sps_video_parameter_set_id} and {@code sps_seq_parameter_set_id} matching any of the elements of {@link VkVideoDecodeH265SessionParametersAddInfoKHR}{@code ::pStdSPSs}</li>
     * <li>If {@code videoSessionParameters} was created with the video codec operation {@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR}, then the number of {@code StdVideoH265SequenceParameterSet} entries already stored in it plus the value of the {@code stdSPSCount} member of the {@link VkVideoDecodeH265SessionParametersAddInfoKHR} structure included in the {@code pUpdateInfo→pNext} chain <b>must</b> be less than or equal to the {@link VkVideoDecodeH265SessionParametersCreateInfoKHR}{@code ::maxStdSPSCount} {@code videoSessionParameters} was created with</li>
     * <li>If {@code videoSessionParameters} was created with the video codec operation {@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR} and the {@code pNext} chain of {@code pUpdateInfo} includes a {@link VkVideoDecodeH265SessionParametersAddInfoKHR} structure, then {@code videoSessionParameters} <b>must</b> not already contain a {@code StdVideoH265PictureParameterSet} entry with {@code sps_video_parameter_set_id}, {@code pps_seq_parameter_set_id}, and {@code pps_pic_parameter_set_id} all matching any of the elements of {@link VkVideoDecodeH265SessionParametersAddInfoKHR}{@code ::pStdPPSs}</li>
     * <li>If {@code videoSessionParameters} was created with the video codec operation {@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR}, then the number of {@code StdVideoH265PictureParameterSet} entries already stored in it plus the value of the {@code stdPPSCount} member of the {@link VkVideoDecodeH265SessionParametersAddInfoKHR} structure included in the {@code pUpdateInfo→pNext} chain <b>must</b> be less than or equal to the {@link VkVideoDecodeH265SessionParametersCreateInfoKHR}{@code ::maxStdPPSCount} {@code videoSessionParameters} was created with</li>
     * <li>If {@code videoSessionParameters} was created with the video codec operation {@link EXTVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT} and the {@code pNext} chain of {@code pUpdateInfo} includes a {@link VkVideoEncodeH264SessionParametersAddInfoEXT} structure, then {@code videoSessionParameters} <b>must</b> not already contain a {@code StdVideoH264SequenceParameterSet} entry with {@code seq_parameter_set_id} matching any of the elements of {@link VkVideoEncodeH264SessionParametersAddInfoEXT}{@code ::pStdSPSs}</li>
     * <li>If {@code videoSessionParameters} was created with the video codec operation {@link EXTVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT} and the {@code pNext} chain of {@code pUpdateInfo} includes a {@link VkVideoEncodeH264SessionParametersAddInfoEXT} structure, then {@code videoSessionParameters} <b>must</b> not already contain a {@code StdVideoH264PictureParameterSet} entry with both {@code seq_parameter_set_id} and {@code pic_parameter_set_id} matching any of the elements of {@link VkVideoEncodeH264SessionParametersAddInfoEXT}{@code ::pStdPPSs}</li>
     * <li>If {@code videoSessionParameters} was created with the video codec operation {@link EXTVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT} and the {@code pNext} chain of {@code pUpdateInfo} includes a {@link VkVideoEncodeH265SessionParametersAddInfoEXT} structure, then {@code videoSessionParameters} <b>must</b> not already contain a {@code StdVideoH265VideoParameterSet} entry with {@code vps_video_parameter_set_id} matching any of the elements of {@link VkVideoEncodeH265SessionParametersAddInfoEXT}{@code ::pStdVPSs}</li>
     * <li>If {@code videoSessionParameters} was created with the video codec operation {@link EXTVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT} and the {@code pNext} chain of {@code pUpdateInfo} includes a {@link VkVideoEncodeH265SessionParametersAddInfoEXT} structure, then {@code videoSessionParameters} <b>must</b> not already contain a {@code StdVideoH265SequenceParameterSet} entry with both {@code sps_video_parameter_set_id} and {@code sps_seq_parameter_set_id} matching any of the elements of {@link VkVideoEncodeH265SessionParametersAddInfoEXT}{@code ::pStdSPSs}</li>
     * <li>If {@code videoSessionParameters} was created with the video codec operation {@link EXTVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT} and the {@code pNext} chain of {@code pUpdateInfo} includes a {@link VkVideoEncodeH265SessionParametersAddInfoEXT} structure, then {@code videoSessionParameters} <b>must</b> not already contain a {@code StdVideoH265PictureParameterSet} entry with {@code sps_video_parameter_set_id}, {@code pps_seq_parameter_set_id}, and {@code pps_pic_parameter_set_id} all matching any of the elements of {@link VkVideoEncodeH265SessionParametersAddInfoEXT}{@code ::pStdPPSs}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code videoSessionParameters} <b>must</b> be a valid {@code VkVideoSessionParametersKHR} handle</li>
     * <li>{@code pUpdateInfo} <b>must</b> be a valid pointer to a valid {@link VkVideoSessionParametersUpdateInfoKHR} structure</li>
     * <li>{@code videoSessionParameters} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
     * <li>{@link KHRVideoEncodeQueue#VK_ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoSessionParametersUpdateInfoKHR}</p>
     *
     * @param device                 the logical device that updates the video session parameters.
     * @param videoSessionParameters the video session parameters object to update.
     * @param pUpdateInfo            a pointer to a {@link VkVideoSessionParametersUpdateInfoKHR} structure specifying the parameter update information.
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
     * <p>To destroy a video session parameters object, call:</p>
     * 
     * <pre><code>
     * void vkDestroyVideoSessionParametersKHR(
     *     VkDevice                                    device,
     *     VkVideoSessionParametersKHR                 videoSessionParameters,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>All submitted commands that refer to {@code videoSessionParameters} <b>must</b> have completed execution</li>
     * <li>If {@link VkAllocationCallbacks} were provided when {@code videoSessionParameters} was created, a compatible set of callbacks <b>must</b> be provided here</li>
     * <li>If no {@link VkAllocationCallbacks} were provided when {@code videoSessionParameters} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code videoSessionParameters} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code videoSessionParameters} <b>must</b> be a valid {@code VkVideoSessionParametersKHR} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>If {@code videoSessionParameters} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code videoSessionParameters} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param device                 the logical device that destroys the video session parameters object.
     * @param videoSessionParameters the video session parameters object to destroy.
     * @param pAllocator             controls host memory allocation as described in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
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
     * Begin video coding scope.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To begin a video coding scope, call:</p>
     * 
     * <pre><code>
     * void vkCmdBeginVideoCodingKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkVideoBeginCodingInfoKHR*            pBeginInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>After beginning a video coding scope, the video session object specified in {@code pBeginInfo→videoSession} is <em>bound</em> to the command buffer, and the command buffer is ready to record video coding operations. Similarly, if {@code pBeginInfo→videoSessionParameters} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it is also <em>bound</em> to the command buffer, and video coding operations <b>can</b> refer to the codec-specific parameters stored in it.</p>
     * 
     * <p>This command also establishes the set of <em>bound reference picture resources</em> that <b>can</b> be used as <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#reconstructed-picture">reconstructed pictures</a> or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#reference-picture">reference pictures</a> within the video coding scope. Each element of this set consists of a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-picture-resources">video picture resource</a> and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB slot</a> index associated with it, if there is one.</p>
     * 
     * <p>The set of bound reference picture resources is immutable within a video coding scope, however, the DPB slot index associated with any of the bound reference picture resources <b>can</b> change during the video coding scope in response to video coding operations.</p>
     * 
     * <p>The {@link VkVideoReferenceSlotInfoKHR} structures provided as the elements of {@code pBeginInfo→pReferenceSlots} are interpreted by this command as follows:</p>
     * 
     * <ul>
     * <li>If {@code slotIndex} is non-negative and {@code pPictureResource} is not {@code NULL}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-picture-resources">video picture resource</a> defined by the {@link VkVideoPictureResourceInfoKHR} structure pointed to by {@code pPictureResource} is added to the set of bound reference picture resources and is associated with the DPB slot index specified in {@code slotIndex}.</li>
     * <li>If {@code slotIndex} is non-negative and {@code pPictureResource} is {@code NULL}, then the DPB slot with index {@code slotIndex} is <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot-states">deactivated</a> by this command.</li>
     * <li>If {@code slotIndex} is negative and {@code pPictureResource} is not {@code NULL}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-picture-resources">video picture resource</a> defined by the {@link VkVideoPictureResourceInfoKHR} structure pointed to by {@code pPictureResource} is added to the set of bound reference picture resources without an associated DPB slot. Such a picture resource <b>can</b> be subsequently used as a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#reconstructed-picture">reconstructed picture</a> to associate it with a DPB slot.</li>
     * <li>If {@code slotIndex} is negative and {@code pPictureResource} is {@code NULL}, then the element is ignored.</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note:</h5>
     * 
     * <p>It is possible for multiple bound reference picture resources to be associated with the same DPB slot index, or for a single bound reference picture to refer to multiple separate reference pictures. For example, in case of an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-profile">H.264 decode profile</a> with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-interlaced-support">interlaced frame support</a> a single DPB slot can refer to two separate pictures for the top and bottom fields. Depending on the picture layout used by the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-profile">H.264 decode profile</a>, the following special cases <b>may</b> arise:</p>
     * 
     * <ul>
     * <li>If the picture layout is {@link KHRVideoDecodeH264#VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_INTERLEAVED_LINES_BIT_KHR VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_INTERLEAVED_LINES_BIT_KHR}, then the top and bottom field pictures are physically co-located in the same video picture resource with even scanlines corresponding to the top field and odd scanlines corresponding to the bottom field, respectively.</li>
     * <li>If the picture layout is {@link KHRVideoDecodeH264#VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_SEPARATE_PLANES_BIT_KHR VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_SEPARATE_PLANES_BIT_KHR}, then the top and bottom field pictures are stored in separate video picture resources (in separate subregions of the same image layer, in separate layers of the same image, or in entirely separate images), hence two elements of {@link VkVideoBeginCodingInfoKHR}{@code ::pReferenceSlots} <b>can</b> contain the same {@code slotIndex} but specify different video picture resources in their {@code pPictureResource} members.</li>
     * </ul>
     * </div>
     * 
     * <p>All non-negative {@code slotIndex} values specified in the elements of {@code pBeginInfo→pReferenceSlots} <b>must</b> identify DPB slots of the video session that are in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot-states">active state</a> at the time this command is executed on the device.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note:</h5>
     * 
     * <p>The application does not have to specify an entry in {@code pBeginInfo→pReferenceSlots} corresponding to all active DPB slots of the video session, but only for those which are intended to be used in the video coding scope. This way the application can avoid any potential runtime cost associated with binding the corresponding picture resources to the command buffer.</p>
     * </div>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support the video codec operation {@code pBeginInfo→videoSession} was created with, as returned by {@link VK11#vkGetPhysicalDeviceQueueFamilyProperties2 GetPhysicalDeviceQueueFamilyProperties2} in {@link VkQueueFamilyVideoPropertiesKHR}{@code ::videoCodecOperations}</li>
     * <li>There <b>must</b> be no <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#queries-operation-active">active</a> queries</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, then {@code pBeginInfo→videoSession} <b>must</b> not have been created with {@link #VK_VIDEO_SESSION_CREATE_PROTECTED_CONTENT_BIT_KHR VIDEO_SESSION_CREATE_PROTECTED_CONTENT_BIT_KHR}</li>
     * <li>If {@code commandBuffer} is a protected command buffer and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, then {@code pBeginInfo→videoSession} <b>must</b> have been created with {@link #VK_VIDEO_SESSION_CREATE_PROTECTED_CONTENT_BIT_KHR VIDEO_SESSION_CREATE_PROTECTED_CONTENT_BIT_KHR}</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, and the {@code pPictureResource} member of any element of {@code pBeginInfo→pReferenceSlots} is not {@code NULL}, then {@code pPictureResource→imageViewBinding} for that element <b>must</b> not specify an image view created from a protected image</li>
     * <li>If {@code commandBuffer} is a protected command buffer <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, and the {@code pPictureResource} member of any element of {@code pBeginInfo→pReferenceSlots} is not {@code NULL}, then {@code pPictureResource→imageViewBinding} for that element <b>must</b> specify an image view created from a protected image</li>
     * <li>If the {@code slotIndex} member of any element of {@code pBeginInfo→pReferenceSlots} is not negative, then it <b>must</b> specify the index of a DPB slot that is in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot-states">active state</a> in {@code pBeginInfo→videoSession} at the time the command is executed on the device</li>
     * <li>Each video picture resource specified by any non-{@code NULL} {@code pPictureResource} member specified in the elements of {@code pBeginInfo→pReferenceSlots} for which {@code slotIndex} is not negative <b>must</b> <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-picture-resource-matching">match</a> one of the video picture resources currently associated with the DPB slot index of {@code pBeginInfo→videoSession} specified by {@code slotIndex} at the time the command is executed on the device</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pBeginInfo} <b>must</b> be a valid pointer to a valid {@link VkVideoBeginCodingInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support decode, or encode operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <tbody><tr><td>Primary</td><td>Outside</td><td>Outside</td><td>Decode Encode</td><td>Action State</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoBeginCodingInfoKHR}</p>
     *
     * @param commandBuffer the command buffer in which to record the command.
     * @param pBeginInfo    a pointer to a {@link VkVideoBeginCodingInfoKHR} structure specifying the parameters of the video coding scope, including the video session and video session parameters object to use.
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
     * End video coding scope.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To end a video coding scope, call:</p>
     * 
     * <pre><code>
     * void vkCmdEndVideoCodingKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkVideoEndCodingInfoKHR*              pEndCodingInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>After ending a video coding scope, the video session object, the optional video session parameters object, and all <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#bound-reference-picture-resources">reference picture resources</a> previously bound by the corresponding {@link #vkCmdBeginVideoCodingKHR CmdBeginVideoCodingKHR} command are <em>unbound</em>.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>There <b>must</b> be no <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#queries-operation-active">active</a> queries</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pEndCodingInfo} <b>must</b> be a valid pointer to a valid {@link VkVideoEndCodingInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support decode, or encode operations</li>
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
     * <tbody><tr><td>Primary</td><td>Outside</td><td>Inside</td><td>Decode Encode</td><td>Action State</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoEndCodingInfoKHR}</p>
     *
     * @param commandBuffer  the command buffer in which to record the command.
     * @param pEndCodingInfo a pointer to a {@link VkVideoEndCodingInfoKHR} structure specifying the parameters for ending the video coding scope.
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
     * Control video coding parameters.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To apply dynamic controls to the currently bound video session object, call:</p>
     * 
     * <pre><code>
     * void vkCmdControlVideoCodingKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkVideoCodingControlInfoKHR*          pCodingControlInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The control parameters provided in this call are applied to the video session at the time the command executes on the device and are in effect until a subsequent call to this command with the same video session bound changes the corresponding control parameters.</p>
     * 
     * <p>A newly created video session <b>must</b> be reset before performing video coding operations using it by including {@link #VK_VIDEO_CODING_CONTROL_RESET_BIT_KHR VIDEO_CODING_CONTROL_RESET_BIT_KHR} in {@code pCodingControlInfo→flags}. The reset operation also returns all DPB slots of the video session to the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot-states">inactive state</a>. Correspondingly, any DPB slot index associated with the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#bound-reference-picture-resources">bound reference picture resources</a> is removed.</p>
     * 
     * <p>For encode sessions, the reset operation returns rate control configuration to implementation default settings and sets the video encode quality level to zero.</p>
     * 
     * <p>After video coding operations are performed using a video session, the reset operation <b>can</b> be used to return the video session to the same <em>initial</em> state as after the reset of a newly created video session. This <b>can</b> be used, for example, when different video sequences are needed to be processed with the same video session object.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code pCodingControlInfo→flags} does not include {@link #VK_VIDEO_CODING_CONTROL_RESET_BIT_KHR VIDEO_CODING_CONTROL_RESET_BIT_KHR}, then the bound video session <b>must</b> not be in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-session-uninitialized">uninitialized</a> state at the time the command is executed on the device</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pCodingControlInfo} <b>must</b> be a valid pointer to a valid {@link VkVideoCodingControlInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support decode, or encode operations</li>
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
     * <tbody><tr><td>Primary</td><td>Outside</td><td>Inside</td><td>Decode Encode</td><td>Action</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoCodingControlInfoKHR}</p>
     *
     * @param commandBuffer      the command buffer in which to record the command.
     * @param pCodingControlInfo a pointer to a {@link VkVideoCodingControlInfoKHR} structure specifying the control parameters.
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
    public static int vkGetVideoSessionMemoryRequirementsKHR(VkDevice device, @NativeType("VkVideoSessionKHR") long videoSession, @NativeType("uint32_t *") int[] pMemoryRequirementsCount, @Nullable @NativeType("VkVideoSessionMemoryRequirementsKHR *") VkVideoSessionMemoryRequirementsKHR.Buffer pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetVideoSessionMemoryRequirementsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pMemoryRequirementsCount, 1);
            checkSafe(pMemoryRequirements, pMemoryRequirementsCount[0]);
        }
        return callPJPPI(device.address(), videoSession, pMemoryRequirementsCount, memAddressSafe(pMemoryRequirements), __functionAddress);
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