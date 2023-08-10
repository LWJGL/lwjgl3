/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * This extension builds upon the {@link KHRVideoQueue VK_KHR_video_queue} extension by adding common APIs specific to video decoding and thus enabling implementations to expose queue families supporting video decode operations.
 * 
 * <p>More specifically, it adds video decode specific capabilities and a new command buffer command that allows recording video decode operations against a video session.</p>
 * 
 * <p>This extension is to be used in conjunction with other codec specific video decode extensions that enable decoding video sequences of specific video compression standards.</p>
 * 
 * <h5>VK_KHR_video_decode_queue</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_video_decode_queue}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>25</dd>
 * <dt><b>Revision</b></dt>
 * <dd>7</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRVideoQueue VK_KHR_video_queue} and {@link KHRSynchronization2 VK_KHR_synchronization2}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li><a href="mailto:jake.beju@amd.com">jake.beju@amd.com</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_video_decode_queue.adoc">VK_KHR_video_decode_queue</a></dd>
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
 * <li>Jake Beju, AMD</li>
 * <li>Olivier Lapicque, NVIDIA</li>
 * <li>Peter Fang, AMD</li>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Srinath Kumarapuram, NVIDIA</li>
 * <li>Tony Zlatinski, NVIDIA</li>
 * <li>Daniel Rakos, RasterGrid</li>
 * </ul></dd>
 * </dl>
 */
public class KHRVideoDecodeQueue {

    /** The extension specification version. */
    public static final int VK_KHR_VIDEO_DECODE_QUEUE_SPEC_VERSION = 7;

    /** The extension name. */
    public static final String VK_KHR_VIDEO_DECODE_QUEUE_EXTENSION_NAME = "VK_KHR_video_decode_queue";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_DECODE_CAPABILITIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_DECODE_USAGE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_USAGE_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR         = 1000024000,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_CAPABILITIES_KHR = 1000024001,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_USAGE_INFO_KHR   = 1000024002;

    /** Extends {@code VkQueueFlagBits}. */
    public static final int VK_QUEUE_VIDEO_DECODE_BIT_KHR = 0x20;

    /** Extends {@code VkPipelineStageFlagBits2}. */
    public static final long VK_PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR = 0x4000000L;

    /**
     * Extends {@code VkAccessFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_2_VIDEO_DECODE_READ_BIT_KHR ACCESS_2_VIDEO_DECODE_READ_BIT_KHR}</li>
     * <li>{@link #VK_ACCESS_2_VIDEO_DECODE_WRITE_BIT_KHR ACCESS_2_VIDEO_DECODE_WRITE_BIT_KHR}</li>
     * </ul>
     */
    public static final long
        VK_ACCESS_2_VIDEO_DECODE_READ_BIT_KHR  = 0x800000000L,
        VK_ACCESS_2_VIDEO_DECODE_WRITE_BIT_KHR = 0x1000000000L;

    /**
     * Extends {@code VkBufferUsageFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_BUFFER_USAGE_VIDEO_DECODE_SRC_BIT_KHR BUFFER_USAGE_VIDEO_DECODE_SRC_BIT_KHR}</li>
     * <li>{@link #VK_BUFFER_USAGE_VIDEO_DECODE_DST_BIT_KHR BUFFER_USAGE_VIDEO_DECODE_DST_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_BUFFER_USAGE_VIDEO_DECODE_SRC_BIT_KHR = 0x2000,
        VK_BUFFER_USAGE_VIDEO_DECODE_DST_BIT_KHR = 0x4000;

    /**
     * Extends {@code VkImageUsageFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR}</li>
     * <li>{@link #VK_IMAGE_USAGE_VIDEO_DECODE_SRC_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_SRC_BIT_KHR}</li>
     * <li>{@link #VK_IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR = 0x400,
        VK_IMAGE_USAGE_VIDEO_DECODE_SRC_BIT_KHR = 0x800,
        VK_IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR = 0x1000;

    /**
     * Extends {@code VkFormatFeatureFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_FORMAT_FEATURE_VIDEO_DECODE_OUTPUT_BIT_KHR FORMAT_FEATURE_VIDEO_DECODE_OUTPUT_BIT_KHR}</li>
     * <li>{@link #VK_FORMAT_FEATURE_VIDEO_DECODE_DPB_BIT_KHR FORMAT_FEATURE_VIDEO_DECODE_DPB_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_FORMAT_FEATURE_VIDEO_DECODE_OUTPUT_BIT_KHR = 0x2000000,
        VK_FORMAT_FEATURE_VIDEO_DECODE_DPB_BIT_KHR    = 0x4000000;

    /**
     * Extends {@code VkImageLayout}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_IMAGE_LAYOUT_VIDEO_DECODE_DST_KHR IMAGE_LAYOUT_VIDEO_DECODE_DST_KHR}</li>
     * <li>{@link #VK_IMAGE_LAYOUT_VIDEO_DECODE_SRC_KHR IMAGE_LAYOUT_VIDEO_DECODE_SRC_KHR}</li>
     * <li>{@link #VK_IMAGE_LAYOUT_VIDEO_DECODE_DPB_KHR IMAGE_LAYOUT_VIDEO_DECODE_DPB_KHR}</li>
     * </ul>
     */
    public static final int
        VK_IMAGE_LAYOUT_VIDEO_DECODE_DST_KHR = 1000024000,
        VK_IMAGE_LAYOUT_VIDEO_DECODE_SRC_KHR = 1000024001,
        VK_IMAGE_LAYOUT_VIDEO_DECODE_DPB_KHR = 1000024002;

    /**
     * Extends {@code VkFormatFeatureFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_FORMAT_FEATURE_2_VIDEO_DECODE_OUTPUT_BIT_KHR FORMAT_FEATURE_2_VIDEO_DECODE_OUTPUT_BIT_KHR}</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_VIDEO_DECODE_DPB_BIT_KHR FORMAT_FEATURE_2_VIDEO_DECODE_DPB_BIT_KHR}</li>
     * </ul>
     */
    public static final long
        VK_FORMAT_FEATURE_2_VIDEO_DECODE_OUTPUT_BIT_KHR = 0x2000000L,
        VK_FORMAT_FEATURE_2_VIDEO_DECODE_DPB_BIT_KHR    = 0x4000000L;

    /**
     * VkVideoDecodeCapabilityFlagBitsKHR - Video decode capability flags
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR} indicates support for using the same video picture resource as the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#reconstructed-picture">reconstructed picture</a> and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-output-picture">decode output picture</a> in a video decode operation.</li>
     * <li>{@link #VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR} indicates support for using distinct video picture resources as the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#reconstructed-picture">reconstructed picture</a> and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-output-picture">decode output picture</a> in a video decode operation.</li>
     * </ul>
     * 
     * <p>Implementations are only <b>required</b> to support one of {@link #VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR} and {@link #VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR}. Accordingly, applications <b>should</b> handle both cases to maximize portability.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note:</h5>
     * 
     * <p>If both {@link #VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR} and {@link #VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR} are supported, an application can choose to create separate images for decode DPB and decode output. E.g. in cases when linear tiling is preferred (and supported) for the decode output picture and the DPB requires optimal tiling, this avoids the need for a separate copy at the expense of additional memory bandwidth requirements during decoding.</p>
     * </div>
     */
    public static final int
        VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR = 0x1,
        VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR = 0x2;

    /**
     * VkVideoDecodeUsageFlagBitsKHR - Video decode usage flags
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_DECODE_USAGE_TRANSCODING_BIT_KHR VIDEO_DECODE_USAGE_TRANSCODING_BIT_KHR} specifies that video decoding is intended to be used in conjunction with video encoding to transcode a video bitstream with the same and/or different codecs.</li>
     * <li>{@link #VK_VIDEO_DECODE_USAGE_OFFLINE_BIT_KHR VIDEO_DECODE_USAGE_OFFLINE_BIT_KHR} specifies that video decoding is intended to be used to consume a local video bitstream.</li>
     * <li>{@link #VK_VIDEO_DECODE_USAGE_STREAMING_BIT_KHR VIDEO_DECODE_USAGE_STREAMING_BIT_KHR} specifies that video decoding is intended to be used to consume a video bitstream received as a continuous flow over network.</li>
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
     * <li>{@link #VK_VIDEO_DECODE_USAGE_DEFAULT_KHR VIDEO_DECODE_USAGE_DEFAULT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_VIDEO_DECODE_USAGE_DEFAULT_KHR         = 0,
        VK_VIDEO_DECODE_USAGE_TRANSCODING_BIT_KHR = 0x1,
        VK_VIDEO_DECODE_USAGE_OFFLINE_BIT_KHR     = 0x2,
        VK_VIDEO_DECODE_USAGE_STREAMING_BIT_KHR   = 0x4;

    protected KHRVideoDecodeQueue() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdDecodeVideoKHR ] ---

    /** Unsafe version of: {@link #vkCmdDecodeVideoKHR CmdDecodeVideoKHR} */
    public static void nvkCmdDecodeVideoKHR(VkCommandBuffer commandBuffer, long pDecodeInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDecodeVideoKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkVideoDecodeInfoKHR.validate(pDecodeInfo);
        }
        callPPV(commandBuffer.address(), pDecodeInfo, __functionAddress);
    }

    /**
     * Launch a video decode operation.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To launch video decode operations, call:</p>
     * 
     * <pre><code>
     * void vkCmdDecodeVideoKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkVideoDecodeInfoKHR*                 pDecodeInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Each call issues one or more video decode operations. The implicit parameter {@code opCount} corresponds to the number of video decode operations issued by the command. After calling this command, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#queries-operation-active-query-index">active query index</a> of each <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#queries-operation-active">active</a> query is incremented by {@code opCount}.</p>
     * 
     * <p>Currently each call to this command results in the issue of a single video decode operation.</p>
     * 
     * <dl>
     * <dt>Active Reference Picture Information</dt>
     * <dd><ul>
     * <li>The image subregion within the image subresource <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-image-subresource-reference">referred</a> to by the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-picture-resources">video picture resource</a> used as the reference picture.</li>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB slot</a> index the reference picture is associated with.</li>
     * <li>The codec-specific reference information related to the reference picture.</li>
     * </ul></dd>
     * </dl>
     * 
     * <dl>
     * <dt>Reconstructed Picture Information</dt>
     * <dd><ul>
     * <li>The image subregion within the image subresource <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-image-subresource-reference">referred</a> to by the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-picture-resources">video picture resource</a> used as the reconstructed picture.</li>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB slot</a> index to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot-states">activate</a> with the reconstructed picture.</li>
     * <li>The codec-specific reference information related to the reconstructed picture.</li>
     * </ul></dd>
     * </dl>
     * 
     * <dl>
     * <dt>Decode Output Picture Information</dt>
     * <dd><ul>
     * <li>The image subregion within the image subresource <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-image-subresource-reference">referred</a> to by the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-picture-resources">video picture resource</a> used as the decode output picture.</li>
     * <li>The codec-specific picture information related to the decode output picture.</li>
     * </ul></dd>
     * </dl>
     * 
     * <p>Several limiting values are defined below that are referenced by the relevant valid usage statements of this command.</p>
     * 
     * <ul>
     * <li>Let {@code uint32_t activeReferencePictureCount} be the size of the list of active reference pictures used by the video decode operation. Unless otherwise defined, {@code activeReferencePictureCount} is set to the value of {@code pDecodeInfo→referenceSlotCount}.
     * 
     * <ul>
     * <li>If the bound video session was created with an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-profile">H.264 decode profile</a>, then let {@code activeReferencePictureCount} be the value of {@code pDecodeInfo→referenceSlotCount} plus the number of elements of the {@code pDecodeInfo→pReferenceSlots} array that have a {@link VkVideoDecodeH264DpbSlotInfoKHR} structure included in their {@code pNext} chain with both {@code pStdReferenceInfo→flags.top_field_flag} and {@code pStdReferenceInfo→flags.bottom_field_flag} set.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>This means that the elements of {@code pDecodeInfo→pReferenceSlots} that include both a top and bottom field reference are counted as two separate active reference pictures, as described in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-active-reference-picture-info">active reference picture list construction rules for H.264 decode operations</a>.</p>
     * </div>
     * </li>
     * </ul>
     * </li>
     * <li>Let {@code VkOffset2D codedOffsetGranularity} be the minimum alignment requirement for the coded offset of video picture resources. Unless otherwise defined, the value of the {@code x} and {@code y} members of {@code codedOffsetGranularity} are 0.
     * 
     * <ul>
     * <li>If the bound video session was created with an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-profile">H.264 decode profile</a> with a {@link VkVideoDecodeH264ProfileInfoKHR}{@code ::pictureLayout} of {@link KHRVideoDecodeH264#VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_SEPARATE_PLANES_BIT_KHR VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_SEPARATE_PLANES_BIT_KHR}, then {@code codedOffsetGranularity} is equal to {@link VkVideoDecodeH264CapabilitiesKHR}{@code ::fieldOffsetGranularity}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for that video profile.</li>
     * </ul>
     * </li>
     * <li>Let {@code uint32_t dpbFrameUseCount[]} be an array of size {@code maxDpbSlots}, where {@code maxDpbSlots} is the {@link VkVideoSessionCreateInfoKHR}{@code ::maxDpbSlots} the bound video session was created with, with each element indicating the number of times a frame associated with the corresponding DPB slot index is referred to by the video coding operation. Let the initial value of each element of the array be 0.
     * 
     * <ul>
     * <li>If {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL}, then {@code dpbFrameUseCount[i]} is incremented by one, where {@code i} equals {@code pDecodeInfo→pSetupReferenceSlot→slotIndex}. If the bound video session object was created with an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-profile">H.264 decode profile</a>, then {@code dpbFrameUseCount[i]} is decremented by one if either {@code pStdReferenceInfo→flags.top_field_flag} or {@code pStdReferenceInfo→flags.bottom_field_flag} is set in the {@link VkVideoDecodeH264DpbSlotInfoKHR} structure in the {@code pDecodeInfo→pSetupReferenceSlot→pNext} chain.</li>
     * <li>For each element of {@code pDecodeInfo→pReferenceSlots}, {@code dpbFrameUseCount[i]} is incremented by one, where {@code i} equals the {@code slotIndex} member of the corresponding element. If the bound video session object was created with an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-profile">H.264 decode profile</a>, then {@code dpbFrameUseCount[i]} is decremented by one if either {@code pStdReferenceInfo→flags.top_field_flag} or {@code pStdReferenceInfo→flags.bottom_field_flag} is set in the {@link VkVideoDecodeH264DpbSlotInfoKHR} structure in the {@code pNext} chain of the corresponding element of {@code pDecodeInfo→pReferenceSlots}.</li>
     * </ul>
     * </li>
     * <li>Let {@code uint32_t dpbTopFieldUseCount[]} and {@code uint32_t dpbBottomFieldUseCount[]} be arrays of size {@code maxDpbSlots}, where {@code maxDpbSlots} is the {@link VkVideoSessionCreateInfoKHR}{@code ::maxDpbSlots} the bound video session was created with, with each element indicating the number of times the top field or the bottom field, respectively, associated with the corresponding DPB slot index is referred to by the video coding operation. Let the initial value of each element of the arrays be 0.
     * 
     * <ul>
     * <li>If the bound video session object was created with an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-profile">H.264 decode profile</a> and {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL}, then perform the following:
     * 
     * <ul>
     * <li>If {@code pStdReferenceInfo→flags.top_field_flag} is set in the {@link VkVideoDecodeH264DpbSlotInfoKHR} structure in the {@code pDecodeInfo→pSetupReferenceSlot→pNext} chain, then {@code dpbTopFieldUseCount[i]} is incremented by one, where {@code i} equals {@code pDecodeInfo→pSetupReferenceSlot→slotIndex}.</li>
     * <li>If {@code pStdReferenceInfo→flags.bottom_field_flag} is set in the {@link VkVideoDecodeH264DpbSlotInfoKHR} structure in the {@code pDecodeInfo→pSetupReferenceSlot→pNext} chain, then {@code dpbBottomFieldUseCount[i]} is incremented by one, where {@code i} equals {@code pDecodeInfo→pSetupReferenceSlot→slotIndex}.</li>
     * </ul>
     * </li>
     * <li>If the bound video session object was created with an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-profile">H.264 decode profile</a>, then perform the following for each element of {@code pDecodeInfo→pReferenceSlots}:
     * 
     * <ul>
     * <li>If {@code pStdReferenceInfo→flags.top_field_flag} is set in the {@link VkVideoDecodeH264DpbSlotInfoKHR} structure in the {@code pNext} chain of the element, then {@code dpbTopFieldUseCount[i]} is incremented by one, where {@code i} equals the {@code slotIndex} member of the element.</li>
     * <li>If {@code pStdReferenceInfo→flags.bottom_field_flag} is set in the {@link VkVideoDecodeH264DpbSlotInfoKHR} structure in the {@code pNext} chain of the element, then {@code dpbBottomFieldUseCount[i]} is incremented by one, where {@code i} equals the {@code slotIndex} member of the element.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The bound video session <b>must</b> not be in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-session-uninitialized">uninitialized</a> state at the time the command is executed on the device</li>
     * <li>For each <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#queries-operation-active">active</a> query, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#queries-operation-active-query-index">active query index</a> corresponding to the query type of that query plus {@code opCount} <b>must</b> be less than or equal to the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#queries-operation-last-activatable-query-index">last activatable query index</a> corresponding to the query type of that query plus one</li>
     * <li>{@code pDecodeInfo→srcBuffer} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-profile-compatibility">compatible</a> with the video profile the bound video session was created with</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, then {@code pDecodeInfo→srcBuffer} <b>must</b> not be a protected buffer</li>
     * <li>If {@code commandBuffer} is a protected command buffer and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, then {@code pDecodeInfo→srcBuffer} <b>must</b> be a protected buffer</li>
     * <li>{@code pDecodeInfo→srcBufferOffset} <b>must</b> be an integer multiple of {@link VkVideoCapabilitiesKHR}{@code ::minBitstreamBufferOffsetAlignment}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile the bound video session was created with</li>
     * <li>{@code pDecodeInfo→srcBufferRange} <b>must</b> be an integer multiple of {@link VkVideoCapabilitiesKHR}{@code ::minBitstreamBufferSizeAlignment}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile the bound video session was created with</li>
     * <li>If {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL} and {@link VkVideoDecodeCapabilitiesKHR}{@code ::flags} does not include {@link #VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile the bound video session was created with, then the video picture resources specified by {@code pDecodeInfo→dstPictureResource} and {@code pDecodeInfo→pSetupReferenceSlot→pPictureResource} <b>must</b> not <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-picture-resource-matching">match</a></li>
     * <li>If {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL} and {@link VkVideoDecodeCapabilitiesKHR}{@code ::flags} does not include {@link #VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile the bound video session was created with, then the video picture resources specified by {@code pDecodeInfo→dstPictureResource} and {@code pDecodeInfo→pSetupReferenceSlot→pPictureResource} <b>must</b> <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-picture-resource-matching">match</a></li>
     * <li>{@code pDecodeInfo→dstPictureResource.imageViewBinding} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-profile-compatibility">compatible</a> with the video profile the bound video session was created with</li>
     * <li>The format of {@code pDecodeInfo→dstPictureResource.imageViewBinding} <b>must</b> match the {@link VkVideoSessionCreateInfoKHR}{@code ::pictureFormat} the bound video session was created with</li>
     * <li>{@code pDecodeInfo→dstPictureResource.codedOffset} <b>must</b> be an integer multiple of {@code codedOffsetGranularity}</li>
     * <li>{@code pDecodeInfo→dstPictureResource.codedExtent} <b>must</b> be between {@code minCodedExtent} and {@code maxCodedExtent}, inclusive, the bound video session was created with</li>
     * <li>{@code pDecodeInfo→dstPictureResource.imageViewBinding} <b>must</b> have been created with {@link #VK_IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR}</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, then {@code pDecodeInfo→dstPictureResource.imageViewBinding} <b>must</b> not have been created from a protected image</li>
     * <li>If {@code commandBuffer} is a protected command buffer and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, then {@code pDecodeInfo→dstPictureResource.imageViewBinding} <b>must</b> have been created from a protected image</li>
     * <li>If {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL}, then {@code pDecodeInfo→pSetupReferenceSlot→slotIndex} <b>must</b> be less than the {@link VkVideoSessionCreateInfoKHR}{@code ::maxDpbSlots} specified when the bound video session was created</li>
     * <li>If {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL}, then {@code pDecodeInfo→pSetupReferenceSlot→pPictureResource→codedOffset} <b>must</b> be an integer multiple of {@code codedOffsetGranularity}</li>
     * <li>If {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL}, then {@code pDecodeInfo→pSetupReferenceSlot→pPictureResource} <b>must</b> <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-picture-resource-matching">match</a> one of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#bound-reference-picture-resources">bound reference picture resource</a></li>
     * <li>{@code activeReferencePictureCount} <b>must</b> be less than or equal to the {@link VkVideoSessionCreateInfoKHR}{@code ::maxActiveReferencePictures} specified when the bound video session was created</li>
     * <li>The {@code slotIndex} member of each element of {@code pDecodeInfo→pReferenceSlots} <b>must</b> be less than the {@link VkVideoSessionCreateInfoKHR}{@code ::maxDpbSlots} specified when the bound video session was created</li>
     * <li>The {@code codedOffset} member of the {@link VkVideoPictureResourceInfoKHR} structure pointed to by the {@code pPictureResource} member of each element of {@code pDecodeInfo→pReferenceSlots} <b>must</b> be an integer multiple of {@code codedOffsetGranularity}</li>
     * <li>The {@code pPictureResource} member of each element of {@code pDecodeInfo→pReferenceSlots} <b>must</b> <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-picture-resource-matching">match</a> one of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#bound-reference-picture-resources">bound reference picture resource</a> associated with the DPB slot index specified in the {@code slotIndex} member of that element</li>
     * <li>Each video picture resource corresponding to the {@code pPictureResource} member specified in the elements of {@code pDecodeInfo→pReferenceSlots} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-picture-resource-uniqueness">unique</a> within {@code pDecodeInfo→pReferenceSlots}</li>
     * <li>All elements of {@code dpbFrameUseCount} <b>must</b> be less than or equal to 1</li>
     * <li>All elements of {@code dpbTopFieldUseCount} <b>must</b> be less than or equal to 1</li>
     * <li>All elements of {@code dpbBottomFieldUseCount} <b>must</b> be less than or equal to 1</li>
     * <li>If {@code pDecodeInfo→pSetupReferenceSlot} is {@code NULL} or {@code pDecodeInfo→pSetupReferenceSlot→pPictureResource} does not <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-image-subresource-reference">refer</a> to the same image subresource as {@code pDecodeInfo→dstPictureResource}, then the image subresource <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-image-subresource-reference">referred</a> to by {@code pDecodeInfo→dstPictureResource} <b>must</b> be in the {@link #VK_IMAGE_LAYOUT_VIDEO_DECODE_DST_KHR IMAGE_LAYOUT_VIDEO_DECODE_DST_KHR} layout at the time the video decode operation is executed on the device</li>
     * <li>If {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL} and {@code pDecodeInfo→pSetupReferenceSlot→pPictureResource} <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-image-subresource-reference">refers</a> to the same image subresource as {@code pDecodeInfo→dstPictureResource}, then the image subresource <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-image-subresource-reference">referred</a> to by {@code pDecodeInfo→dstPictureResource} <b>must</b> be in the {@link #VK_IMAGE_LAYOUT_VIDEO_DECODE_DPB_KHR IMAGE_LAYOUT_VIDEO_DECODE_DPB_KHR} layout at the time the video decode operation is executed on the device</li>
     * <li>If {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL}, then the image subresource <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-image-subresource-reference">referred</a> to by {@code pDecodeInfo→pSetupReferenceSlot→pPictureResource} <b>must</b> be in the {@link #VK_IMAGE_LAYOUT_VIDEO_DECODE_DPB_KHR IMAGE_LAYOUT_VIDEO_DECODE_DPB_KHR} layout at the time the video decode operation is executed on the device</li>
     * <li>The image subresource <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-image-subresource-reference">referred</a> to by the {@code pPictureResource} member of each element of {@code pDecodeInfo→pReferenceSlots} <b>must</b> be in the {@link #VK_IMAGE_LAYOUT_VIDEO_DECODE_DPB_KHR IMAGE_LAYOUT_VIDEO_DECODE_DPB_KHR} layout at the time the video decode operation is executed on the device</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR}, then the {@code pNext} chain of {@code pDecodeInfo} <b>must</b> include a {@link VkVideoDecodeH264PictureInfoKHR} structure</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR} but was not created with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-interlaced-support">interlaced frame support</a>, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-output-picture-info">decode output picture</a> <b>must</b> represent a frame</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR}, then all elements of the {@code pSliceOffsets} member of the {@link VkVideoDecodeH264PictureInfoKHR} structure included in the {@code pNext} chain of {@code pDecodeInfo} <b>must</b> be less than {@code pDecodeInfo→srcBufferRange}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR}, then the bound video session parameters object <b>must</b> contain a {@code StdVideoH264SequenceParameterSet} entry with {@code seq_parameter_set_id} matching {@code StdVideoDecodeH264PictureInfo}{@code ::seq_parameter_set_id} that is provided in the {@code pStdPictureInfo} member of the {@link VkVideoDecodeH264PictureInfoKHR} structure included in the {@code pNext} chain of {@code pDecodeInfo}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR}, then the bound video session parameters object <b>must</b> contain a {@code StdVideoH264PictureParameterSet} entry with {@code seq_parameter_set_id} and {@code pic_parameter_set_id} matching {@code StdVideoDecodeH264PictureInfo}{@code ::seq_parameter_set_id} and {@code StdVideoDecodeH264PictureInfo}{@code ::pic_parameter_set_id}, respectively, that are provided in the {@code pStdPictureInfo} member of the {@link VkVideoDecodeH264PictureInfoKHR} structure included in the {@code pNext} chain of {@code pDecodeInfo}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR} and {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL}, then the {@code pNext} chain of {@code pDecodeInfo→pSetupReferenceSlot} <b>must</b> include a {@link VkVideoDecodeH264DpbSlotInfoKHR} structure</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR} but was not created with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-interlaced-support">interlaced frame support</a>, and {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-reconstructed-picture-info">reconstructed picture</a> <b>must</b> represent a frame</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR}, then the {@code pNext} chain of each element of {@code pDecodeInfo→pReferenceSlots} <b>must</b> include a {@link VkVideoDecodeH264DpbSlotInfoKHR} structure</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR} but was not created with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-interlaced-support">interlaced frame support</a>, then each <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-active-reference-picture-info">active reference picture</a> corresponding to the elements of {@code pDecodeInfo→pReferenceSlots} <b>must</b> represent a frame</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR}, {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-output-picture-info">decode output picture</a> represents a frame, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-reconstructed-picture-info">reconstructed picture</a> <b>must</b> also represent a frame</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR}, {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-output-picture-info">decode output picture</a> represents a top field, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-reconstructed-picture-info">reconstructed picture</a> <b>must</b> also represent a top field</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR}, {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-output-picture-info">decode output picture</a> represents a bottom field, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-reconstructed-picture-info">reconstructed picture</a> <b>must</b> also represent a bottom field</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR} and an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-active-reference-picture-info">active reference picture</a> corresponding to any element of {@code pDecodeInfo→pReferenceSlots} represents a frame, then the DPB slot index of the bound video session specified by the {@code slotIndex} member of that element <b>must</b> be currently associated with a frame picture <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-picture-resource-matching">matching</a> the video picture resource specified by the {@code pPictureResource} member of the same element at the time the command is executed on the device</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR} and an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-active-reference-picture-info">active reference picture</a> corresponding to any element of {@code pDecodeInfo→pReferenceSlots} represents a top field, then the DPB slot index of the bound video session specified by the {@code slotIndex} member of that element <b>must</b> be currently associated with a top field picture <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-picture-resource-matching">matching</a> the video picture resource specified by the {@code pPictureResource} member of the same element at the time the command is executed on the device</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR} and an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-active-reference-picture-info">active reference picture</a> corresponding to any element of {@code pDecodeInfo→pReferenceSlots} represents a bottom field, then the DPB slot index of the bound video session specified by the {@code slotIndex} member of that element <b>must</b> be currently associated with a bottom field picture <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-picture-resource-matching">matching</a> the video picture resource specified by the {@code pPictureResource} member of the same element at the time the command is executed on the device</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR}, then the {@code pNext} chain of {@code pDecodeInfo} <b>must</b> include a {@link VkVideoDecodeH265PictureInfoKHR} structure</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR}, then all elements of the {@code pSliceSegmentOffsets} member of the {@link VkVideoDecodeH265PictureInfoKHR} structure included in the {@code pNext} chain of {@code pDecodeInfo} <b>must</b> be less than {@code pDecodeInfo→srcBufferRange}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR}, then the bound video session parameters object <b>must</b> contain a {@code StdVideoH265VideoParameterSet} entry with {@code vps_video_parameter_set_id} matching {@code StdVideoDecodeH265PictureInfo}{@code ::sps_video_parameter_set_id} that is provided in the {@code pStdPictureInfo} member of the {@link VkVideoDecodeH265PictureInfoKHR} structure included in the {@code pNext} chain of {@code pDecodeInfo}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR}, then the bound video session parameters object <b>must</b> contain a {@code StdVideoH265SequenceParameterSet} entry with {@code sps_video_parameter_set_id} and {@code sps_seq_parameter_set_id} matching {@code StdVideoDecodeH265PictureInfo}{@code ::sps_video_parameter_set_id} and {@code StdVideoDecodeH265PictureInfo}{@code ::pps_seq_parameter_set_id}, respectively, that are provided in the {@code pStdPictureInfo} member of the {@link VkVideoDecodeH265PictureInfoKHR} structure included in the {@code pNext} chain of {@code pDecodeInfo}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR}, then the bound video session parameters object <b>must</b> contain a {@code StdVideoH265PictureParameterSet} entry with {@code sps_video_parameter_set_id}, {@code pps_seq_parameter_set_id}, and {@code pps_pic_parameter_set_id} matching {@code StdVideoDecodeH265PictureInfo}{@code ::sps_video_parameter_set_id}, {@code StdVideoDecodeH265PictureInfo}{@code ::pps_seq_parameter_set_id}, and {@code StdVideoDecodeH265PictureInfo}{@code ::pps_pic_parameter_set_id}, respectively, that are provided in the {@code pStdPictureInfo} member of the {@link VkVideoDecodeH265PictureInfoKHR} structure included in the {@code pNext} chain of {@code pDecodeInfo}</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR} and {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL}, then the {@code pNext} chain of {@code pDecodeInfo→pSetupReferenceSlot} <b>must</b> include a {@link VkVideoDecodeH265DpbSlotInfoKHR} structure</li>
     * <li>If the bound video session was created with the video codec operation {@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR}, then the {@code pNext} chain of each element of {@code pDecodeInfo→pReferenceSlots} <b>must</b> include a {@link VkVideoDecodeH265DpbSlotInfoKHR} structure</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pDecodeInfo} <b>must</b> be a valid pointer to a valid {@link VkVideoDecodeInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support decode operations</li>
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
     * <tbody><tr><td>Primary</td><td>Outside</td><td>Inside</td><td>Decode</td><td>Action</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoDecodeInfoKHR}</p>
     *
     * @param commandBuffer the command buffer in which to record the command.
     * @param pDecodeInfo   a pointer to a {@link VkVideoDecodeInfoKHR} structure specifying the parameters of the video decode operations.
     */
    public static void vkCmdDecodeVideoKHR(VkCommandBuffer commandBuffer, @NativeType("VkVideoDecodeInfoKHR const *") VkVideoDecodeInfoKHR pDecodeInfo) {
        nvkCmdDecodeVideoKHR(commandBuffer, pDecodeInfo.address());
    }

}