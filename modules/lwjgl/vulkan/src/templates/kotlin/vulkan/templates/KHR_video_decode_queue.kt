/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_video_decode_queue = "KHRVideoDecodeQueue".nativeClassVK("KHR_video_decode_queue", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension builds upon the {@link KHRVideoQueue VK_KHR_video_queue} extension by adding common APIs specific to video decoding and thus enabling implementations to expose queue families supporting video decode operations.

        More specifically, it adds video decode specific capabilities and a new command buffer command that allows recording video decode operations against a video session.

        This extension is to be used in conjunction with other codec specific video decode extensions that enable decoding video sequences of specific video compression standards.

        <h5>VK_KHR_video_decode_queue</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_video_decode_queue}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>25</dd>

            <dt><b>Revision</b></dt>
            <dd>7</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRVideoQueue VK_KHR_video_queue} and {@link KHRSynchronization2 VK_KHR_synchronization2}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li><a href="mailto:jake.beju@amd.com">jake.beju@amd.com</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_video_decode_queue.adoc">VK_KHR_video_decode_queue</a></dd>
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
                <li>Jake Beju, AMD</li>
                <li>Olivier Lapicque, NVIDIA</li>
                <li>Peter Fang, AMD</li>
                <li>Piers Daniell, NVIDIA</li>
                <li>Srinath Kumarapuram, NVIDIA</li>
                <li>Tony Zlatinski, NVIDIA</li>
                <li>Daniel Rakos, RasterGrid</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_VIDEO_DECODE_QUEUE_SPEC_VERSION".."7"
    )

    StringConstant(
        "The extension name.",

        "KHR_VIDEO_DECODE_QUEUE_EXTENSION_NAME".."VK_KHR_video_decode_queue"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR".."1000024000",
        "STRUCTURE_TYPE_VIDEO_DECODE_CAPABILITIES_KHR".."1000024001",
        "STRUCTURE_TYPE_VIDEO_DECODE_USAGE_INFO_KHR".."1000024002"
    )

    EnumConstant(
        "Extends {@code VkQueueFlagBits}.",

        "QUEUE_VIDEO_DECODE_BIT_KHR".enum(0x00000020)
    )

    EnumConstantLong(
        "Extends {@code VkPipelineStageFlagBits2}.",

        "PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR".enum(0x04000000L)
    )

    EnumConstantLong(
        "Extends {@code VkAccessFlagBits2}.",

        "ACCESS_2_VIDEO_DECODE_READ_BIT_KHR".enum(0x800000000L),
        "ACCESS_2_VIDEO_DECODE_WRITE_BIT_KHR".enum(0x1000000000L)
    )

    EnumConstant(
        "Extends {@code VkBufferUsageFlagBits}.",

        "BUFFER_USAGE_VIDEO_DECODE_SRC_BIT_KHR".enum(0x00002000),
        "BUFFER_USAGE_VIDEO_DECODE_DST_BIT_KHR".enum(0x00004000)
    )

    EnumConstant(
        "Extends {@code VkImageUsageFlagBits}.",

        "IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR".enum(0x00000400),
        "IMAGE_USAGE_VIDEO_DECODE_SRC_BIT_KHR".enum(0x00000800),
        "IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR".enum(0x00001000)
    )

    EnumConstant(
        "Extends {@code VkFormatFeatureFlagBits}.",

        "FORMAT_FEATURE_VIDEO_DECODE_OUTPUT_BIT_KHR".enum(0x02000000),
        "FORMAT_FEATURE_VIDEO_DECODE_DPB_BIT_KHR".enum(0x04000000)
    )

    EnumConstant(
        "Extends {@code VkImageLayout}.",

        "IMAGE_LAYOUT_VIDEO_DECODE_DST_KHR".."1000024000",
        "IMAGE_LAYOUT_VIDEO_DECODE_SRC_KHR".."1000024001",
        "IMAGE_LAYOUT_VIDEO_DECODE_DPB_KHR".."1000024002"
    )

    EnumConstantLong(
        "Extends {@code VkFormatFeatureFlagBits2}.",

        "FORMAT_FEATURE_2_VIDEO_DECODE_OUTPUT_BIT_KHR".enum(0x02000000L),
        "FORMAT_FEATURE_2_VIDEO_DECODE_DPB_BIT_KHR".enum(0x04000000L)
    )

    EnumConstant(
        """
        VkVideoDecodeCapabilityFlagBitsKHR - Video decode capability flags

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR indicates support for using the same video picture resource as the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#reconstructed-picture">reconstructed picture</a> and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-output-picture">decode output picture</a> in a video decode operation.</li>
            <li>#VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR indicates support for using distinct video picture resources as the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#reconstructed-picture">reconstructed picture</a> and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-output-picture">decode output picture</a> in a video decode operation.</li>
        </ul>

        Implementations are only <b>required</b> to support one of #VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR and #VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR. Accordingly, applications <b>should</b> handle both cases to maximize portability.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note:</h5>
        If both #VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR and #VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR are supported, an application can choose to create separate images for decode DPB and decode output. E.g. in cases when linear tiling is preferred (and supported) for the decode output picture and the DPB requires optimal tiling, this avoids the need for a separate copy at the expense of additional memory bandwidth requirements during decoding.
        </div>
        """,

        "VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR".enum(0x00000001),
        "VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR".enum(0x00000002)
    )

    EnumConstant(
        """
        VkVideoDecodeUsageFlagBitsKHR - Video decode usage flags

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_DECODE_USAGE_TRANSCODING_BIT_KHR specifies that video decoding is intended to be used in conjunction with video encoding to transcode a video bitstream with the same and/or different codecs.</li>
            <li>#VIDEO_DECODE_USAGE_OFFLINE_BIT_KHR specifies that video decoding is intended to be used to consume a local video bitstream.</li>
            <li>#VIDEO_DECODE_USAGE_STREAMING_BIT_KHR specifies that video decoding is intended to be used to consume a video bitstream received as a continuous flow over network.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        There are no restrictions on the combination of bits that <b>can</b> be specified by the application. However, applications <b>should</b> use reasonable combinations in order for the implementation to be able to select the most appropriate mode of operation for the particular use case.
        </div>
        """,

        "VIDEO_DECODE_USAGE_DEFAULT_KHR".."0",
        "VIDEO_DECODE_USAGE_TRANSCODING_BIT_KHR".enum(0x00000001),
        "VIDEO_DECODE_USAGE_OFFLINE_BIT_KHR".enum(0x00000002),
        "VIDEO_DECODE_USAGE_STREAMING_BIT_KHR".enum(0x00000004)
    )

    void(
        "CmdDecodeVideoKHR",
        """
        Launch a video decode operation.

        <h5>C Specification</h5>
        To launch video decode operations, call:

        <pre><code>
￿void vkCmdDecodeVideoKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkVideoDecodeInfoKHR*                 pDecodeInfo);</code></pre>

        <h5>Description</h5>
        Each call issues one or more video decode operations. The implicit parameter {@code opCount} corresponds to the number of video decode operations issued by the command. After calling this command, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#queries-operation-active-query-index">active query index</a> of each <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#queries-operation-active">active</a> query is incremented by {@code opCount}.

        Currently each call to this command results in the issue of a single video decode operation.

        <dl>
            <dt>Active Reference Picture Information</dt>
            <dd><ul>
                <li>The image subregion within the image subresource <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-image-subresource-reference">referred</a> to by the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-picture-resources">video picture resource</a> used as the reference picture.</li>
                <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dpb-slot">DPB slot</a> index the reference picture is associated with.</li>
                <li>The codec-specific reference information related to the reference picture.</li>
            </ul></dd>
        </dl>

        <dl>
            <dt>Reconstructed Picture Information</dt>
            <dd><ul>
                <li>The image subregion within the image subresource <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-image-subresource-reference">referred</a> to by the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-picture-resources">video picture resource</a> used as the reconstructed picture.</li>
                <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dpb-slot">DPB slot</a> index to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#dpb-slot-states">activate</a> with the reconstructed picture.</li>
                <li>The codec-specific reference information related to the reconstructed picture.</li>
            </ul></dd>
        </dl>

        <dl>
            <dt>Decode Output Picture Information</dt>
            <dd><ul>
                <li>The image subregion within the image subresource <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-image-subresource-reference">referred</a> to by the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-picture-resources">video picture resource</a> used as the decode output picture.</li>
                <li>The codec-specific picture information related to the decode output picture.</li>
            </ul></dd>
        </dl>

        Several limiting values are defined below that are referenced by the relevant valid usage statements of this command.

        <ul>
            <li>
                Let {@code uint32_t activeReferencePictureCount} be the size of the list of active reference pictures used by the video decode operation. Unless otherwise defined, {@code activeReferencePictureCount} is set to the value of {@code pDecodeInfo→referenceSlotCount}.
                <ul>
                    <li>
                        If the bound video session was created with an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-profile">H.264 decode profile</a>, then let {@code activeReferencePictureCount} be the value of {@code pDecodeInfo→referenceSlotCount} plus the number of elements of the {@code pDecodeInfo→pReferenceSlots} array that have a ##VkVideoDecodeH264DpbSlotInfoKHR structure included in their {@code pNext} chain with both {@code pStdReferenceInfo→flags.top_field_flag} and {@code pStdReferenceInfo→flags.bottom_field_flag} set.
                        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        This means that the elements of {@code pDecodeInfo→pReferenceSlots} that include both a top and bottom field reference are counted as two separate active reference pictures, as described in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-active-reference-picture-info">active reference picture list construction rules for H.264 decode operations</a>.
                        </div>
                    </li>
                </ul>
            </li>
            <li>
                Let {@code VkOffset2D codedOffsetGranularity} be the minimum alignment requirement for the coded offset of video picture resources. Unless otherwise defined, the value of the {@code x} and {@code y} members of {@code codedOffsetGranularity} are 0.
                <ul>
                    <li>If the bound video session was created with an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-profile">H.264 decode profile</a> with a ##VkVideoDecodeH264ProfileInfoKHR{@code ::pictureLayout} of #VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_SEPARATE_PLANES_BIT_KHR, then {@code codedOffsetGranularity} is equal to ##VkVideoDecodeH264CapabilitiesKHR{@code ::fieldOffsetGranularity}, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for that video profile.</li>
                </ul>
            </li>
            <li>
                Let {@code uint32_t dpbFrameUseCount[]} be an array of size {@code maxDpbSlots}, where {@code maxDpbSlots} is the ##VkVideoSessionCreateInfoKHR{@code ::maxDpbSlots} the bound video session was created with, with each element indicating the number of times a frame associated with the corresponding DPB slot index is referred to by the video coding operation. Let the initial value of each element of the array be 0.
                <ul>
                    <li>If {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL}, then {@code dpbFrameUseCount[i]} is incremented by one, where {@code i} equals {@code pDecodeInfo→pSetupReferenceSlot→slotIndex}. If the bound video session object was created with an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-profile">H.264 decode profile</a>, then {@code dpbFrameUseCount[i]} is decremented by one if either {@code pStdReferenceInfo→flags.top_field_flag} or {@code pStdReferenceInfo→flags.bottom_field_flag} is set in the ##VkVideoDecodeH264DpbSlotInfoKHR structure in the {@code pDecodeInfo→pSetupReferenceSlot→pNext} chain.</li>
                    <li>For each element of {@code pDecodeInfo→pReferenceSlots}, {@code dpbFrameUseCount[i]} is incremented by one, where {@code i} equals the {@code slotIndex} member of the corresponding element. If the bound video session object was created with an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-profile">H.264 decode profile</a>, then {@code dpbFrameUseCount[i]} is decremented by one if either {@code pStdReferenceInfo→flags.top_field_flag} or {@code pStdReferenceInfo→flags.bottom_field_flag} is set in the ##VkVideoDecodeH264DpbSlotInfoKHR structure in the {@code pNext} chain of the corresponding element of {@code pDecodeInfo→pReferenceSlots}.</li>
                </ul>
            </li>
            <li>
                Let {@code uint32_t dpbTopFieldUseCount[]} and {@code uint32_t dpbBottomFieldUseCount[]} be arrays of size {@code maxDpbSlots}, where {@code maxDpbSlots} is the ##VkVideoSessionCreateInfoKHR{@code ::maxDpbSlots} the bound video session was created with, with each element indicating the number of times the top field or the bottom field, respectively, associated with the corresponding DPB slot index is referred to by the video coding operation. Let the initial value of each element of the arrays be 0.
                <ul>
                    <li>
                        If the bound video session object was created with an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-profile">H.264 decode profile</a> and {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL}, then perform the following:
                        <ul>
                            <li>If {@code pStdReferenceInfo→flags.top_field_flag} is set in the ##VkVideoDecodeH264DpbSlotInfoKHR structure in the {@code pDecodeInfo→pSetupReferenceSlot→pNext} chain, then {@code dpbTopFieldUseCount[i]} is incremented by one, where {@code i} equals {@code pDecodeInfo→pSetupReferenceSlot→slotIndex}.</li>
                            <li>If {@code pStdReferenceInfo→flags.bottom_field_flag} is set in the ##VkVideoDecodeH264DpbSlotInfoKHR structure in the {@code pDecodeInfo→pSetupReferenceSlot→pNext} chain, then {@code dpbBottomFieldUseCount[i]} is incremented by one, where {@code i} equals {@code pDecodeInfo→pSetupReferenceSlot→slotIndex}.</li>
                        </ul>
                    </li>
                    <li>
                        If the bound video session object was created with an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-profile">H.264 decode profile</a>, then perform the following for each element of {@code pDecodeInfo→pReferenceSlots}:
                        <ul>
                            <li>If {@code pStdReferenceInfo→flags.top_field_flag} is set in the ##VkVideoDecodeH264DpbSlotInfoKHR structure in the {@code pNext} chain of the element, then {@code dpbTopFieldUseCount[i]} is incremented by one, where {@code i} equals the {@code slotIndex} member of the element.</li>
                            <li>If {@code pStdReferenceInfo→flags.bottom_field_flag} is set in the ##VkVideoDecodeH264DpbSlotInfoKHR structure in the {@code pNext} chain of the element, then {@code dpbBottomFieldUseCount[i]} is incremented by one, where {@code i} equals the {@code slotIndex} member of the element.</li>
                        </ul>
                    </li>
                </ul>
            </li>
        </ul>

        <h5>Valid Usage</h5>
        <ul>
            <li>The bound video session <b>must</b> not be in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-session-uninitialized">uninitialized</a> state at the time the command is executed on the device</li>
            <li>For each <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#queries-operation-active">active</a> query, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#queries-operation-active-query-index">active query index</a> corresponding to the query type of that query plus {@code opCount} <b>must</b> be less than or equal to the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#queries-operation-last-activatable-query-index">last activatable query index</a> corresponding to the query type of that query plus one</li>
            <li>{@code pDecodeInfo→srcBuffer} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-profile-compatibility">compatible</a> with the video profile the bound video session was created with</li>
            <li>If {@code commandBuffer} is an unprotected command buffer and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, then {@code pDecodeInfo→srcBuffer} <b>must</b> not be a protected buffer</li>
            <li>If {@code commandBuffer} is a protected command buffer and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, then {@code pDecodeInfo→srcBuffer} <b>must</b> be a protected buffer</li>
            <li>{@code pDecodeInfo→srcBufferOffset} <b>must</b> be an integer multiple of ##VkVideoCapabilitiesKHR{@code ::minBitstreamBufferOffsetAlignment}, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with</li>
            <li>{@code pDecodeInfo→srcBufferRange} <b>must</b> be an integer multiple of ##VkVideoCapabilitiesKHR{@code ::minBitstreamBufferSizeAlignment}, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with</li>
            <li>If {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL} and ##VkVideoDecodeCapabilitiesKHR{@code ::flags} does not include #VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with, then the video picture resources specified by {@code pDecodeInfo→dstPictureResource} and {@code pDecodeInfo→pSetupReferenceSlot→pPictureResource} <b>must</b> not <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-picture-resource-matching">match</a></li>
            <li>If {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL} and ##VkVideoDecodeCapabilitiesKHR{@code ::flags} does not include #VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR, as returned by #GetPhysicalDeviceVideoCapabilitiesKHR() for the video profile the bound video session was created with, then the video picture resources specified by {@code pDecodeInfo→dstPictureResource} and {@code pDecodeInfo→pSetupReferenceSlot→pPictureResource} <b>must</b> <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-picture-resource-matching">match</a></li>
            <li>{@code pDecodeInfo→dstPictureResource.imageViewBinding} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-profile-compatibility">compatible</a> with the video profile the bound video session was created with</li>
            <li>The format of {@code pDecodeInfo→dstPictureResource.imageViewBinding} <b>must</b> match the ##VkVideoSessionCreateInfoKHR{@code ::pictureFormat} the bound video session was created with</li>
            <li>{@code pDecodeInfo→dstPictureResource.codedOffset} <b>must</b> be an integer multiple of {@code codedOffsetGranularity}</li>
            <li>{@code pDecodeInfo→dstPictureResource.codedExtent} <b>must</b> be between {@code minCodedExtent} and {@code maxCodedExtent}, inclusive, the bound video session was created with</li>
            <li>{@code pDecodeInfo→dstPictureResource.imageViewBinding} <b>must</b> have been created with #IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR</li>
            <li>If {@code commandBuffer} is an unprotected command buffer and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, then {@code pDecodeInfo→dstPictureResource.imageViewBinding} <b>must</b> not have been created from a protected image</li>
            <li>If {@code commandBuffer} is a protected command buffer and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, then {@code pDecodeInfo→dstPictureResource.imageViewBinding} <b>must</b> have been created from a protected image</li>
            <li>If {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL}, then {@code pDecodeInfo→pSetupReferenceSlot→slotIndex} <b>must</b> be less than the ##VkVideoSessionCreateInfoKHR{@code ::maxDpbSlots} specified when the bound video session was created</li>
            <li>If {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL}, then {@code pDecodeInfo→pSetupReferenceSlot→pPictureResource→codedOffset} <b>must</b> be an integer multiple of {@code codedOffsetGranularity}</li>
            <li>If {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL}, then {@code pDecodeInfo→pSetupReferenceSlot→pPictureResource} <b>must</b> <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-picture-resource-matching">match</a> one of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#bound-reference-picture-resources">bound reference picture resource</a></li>
            <li>{@code activeReferencePictureCount} <b>must</b> be less than or equal to the ##VkVideoSessionCreateInfoKHR{@code ::maxActiveReferencePictures} specified when the bound video session was created</li>
            <li>The {@code slotIndex} member of each element of {@code pDecodeInfo→pReferenceSlots} <b>must</b> be less than the ##VkVideoSessionCreateInfoKHR{@code ::maxDpbSlots} specified when the bound video session was created</li>
            <li>The {@code codedOffset} member of the ##VkVideoPictureResourceInfoKHR structure pointed to by the {@code pPictureResource} member of each element of {@code pDecodeInfo→pReferenceSlots} <b>must</b> be an integer multiple of {@code codedOffsetGranularity}</li>
            <li>The {@code pPictureResource} member of each element of {@code pDecodeInfo→pReferenceSlots} <b>must</b> <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-picture-resource-matching">match</a> one of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#bound-reference-picture-resources">bound reference picture resource</a> associated with the DPB slot index specified in the {@code slotIndex} member of that element</li>
            <li>Each video picture resource corresponding to the {@code pPictureResource} member specified in the elements of {@code pDecodeInfo→pReferenceSlots} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-picture-resource-uniqueness">unique</a> within {@code pDecodeInfo→pReferenceSlots}</li>
            <li>All elements of {@code dpbFrameUseCount} <b>must</b> be less than or equal to 1</li>
            <li>All elements of {@code dpbTopFieldUseCount} <b>must</b> be less than or equal to 1</li>
            <li>All elements of {@code dpbBottomFieldUseCount} <b>must</b> be less than or equal to 1</li>
            <li>If {@code pDecodeInfo→pSetupReferenceSlot} is {@code NULL} or {@code pDecodeInfo→pSetupReferenceSlot→pPictureResource} does not <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-image-subresource-reference">refer</a> to the same image subresource as {@code pDecodeInfo→dstPictureResource}, then the image subresource <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-image-subresource-reference">referred</a> to by {@code pDecodeInfo→dstPictureResource} <b>must</b> be in the #IMAGE_LAYOUT_VIDEO_DECODE_DST_KHR layout at the time the video decode operation is executed on the device</li>
            <li>If {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL} and {@code pDecodeInfo→pSetupReferenceSlot→pPictureResource} <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-image-subresource-reference">refers</a> to the same image subresource as {@code pDecodeInfo→dstPictureResource}, then the image subresource <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-image-subresource-reference">referred</a> to by {@code pDecodeInfo→dstPictureResource} <b>must</b> be in the #IMAGE_LAYOUT_VIDEO_DECODE_DPB_KHR layout at the time the video decode operation is executed on the device</li>
            <li>If {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL}, then the image subresource <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-image-subresource-reference">referred</a> to by {@code pDecodeInfo→pSetupReferenceSlot→pPictureResource} <b>must</b> be in the #IMAGE_LAYOUT_VIDEO_DECODE_DPB_KHR layout at the time the video decode operation is executed on the device</li>
            <li>The image subresource <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-image-subresource-reference">referred</a> to by the {@code pPictureResource} member of each element of {@code pDecodeInfo→pReferenceSlots} <b>must</b> be in the #IMAGE_LAYOUT_VIDEO_DECODE_DPB_KHR layout at the time the video decode operation is executed on the device</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR, then the {@code pNext} chain of {@code pDecodeInfo} <b>must</b> include a ##VkVideoDecodeH264PictureInfoKHR structure</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR but was not created with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-interlaced-support">interlaced frame support</a>, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-output-picture-info">decode output picture</a> <b>must</b> represent a frame</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR, then all elements of the {@code pSliceOffsets} member of the ##VkVideoDecodeH264PictureInfoKHR structure included in the {@code pNext} chain of {@code pDecodeInfo} <b>must</b> be less than {@code pDecodeInfo→srcBufferRange}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR, then the bound video session parameters object <b>must</b> contain a {@code StdVideoH264SequenceParameterSet} entry with {@code seq_parameter_set_id} matching {@code StdVideoDecodeH264PictureInfo}{@code ::seq_parameter_set_id} that is provided in the {@code pStdPictureInfo} member of the ##VkVideoDecodeH264PictureInfoKHR structure included in the {@code pNext} chain of {@code pDecodeInfo}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR, then the bound video session parameters object <b>must</b> contain a {@code StdVideoH264PictureParameterSet} entry with {@code seq_parameter_set_id} and {@code pic_parameter_set_id} matching {@code StdVideoDecodeH264PictureInfo}{@code ::seq_parameter_set_id} and {@code StdVideoDecodeH264PictureInfo}{@code ::pic_parameter_set_id}, respectively, that are provided in the {@code pStdPictureInfo} member of the ##VkVideoDecodeH264PictureInfoKHR structure included in the {@code pNext} chain of {@code pDecodeInfo}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR and {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL}, then the {@code pNext} chain of {@code pDecodeInfo→pSetupReferenceSlot} <b>must</b> include a ##VkVideoDecodeH264DpbSlotInfoKHR structure</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR but was not created with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-interlaced-support">interlaced frame support</a>, and {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-reconstructed-picture-info">reconstructed picture</a> <b>must</b> represent a frame</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR, then the {@code pNext} chain of each element of {@code pDecodeInfo→pReferenceSlots} <b>must</b> include a ##VkVideoDecodeH264DpbSlotInfoKHR structure</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR but was not created with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-interlaced-support">interlaced frame support</a>, then each <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-active-reference-picture-info">active reference picture</a> corresponding to the elements of {@code pDecodeInfo→pReferenceSlots} <b>must</b> represent a frame</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR, {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-output-picture-info">decode output picture</a> represents a frame, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-reconstructed-picture-info">reconstructed picture</a> <b>must</b> also represent a frame</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR, {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-output-picture-info">decode output picture</a> represents a top field, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-reconstructed-picture-info">reconstructed picture</a> <b>must</b> also represent a top field</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR, {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL}, and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-output-picture-info">decode output picture</a> represents a bottom field, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-reconstructed-picture-info">reconstructed picture</a> <b>must</b> also represent a bottom field</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR and an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-active-reference-picture-info">active reference picture</a> corresponding to any element of {@code pDecodeInfo→pReferenceSlots} represents a frame, then the DPB slot index of the bound video session specified by the {@code slotIndex} member of that element <b>must</b> be currently associated with a frame picture <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-picture-resource-matching">matching</a> the video picture resource specified by the {@code pPictureResource} member of the same element at the time the command is executed on the device</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR and an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-active-reference-picture-info">active reference picture</a> corresponding to any element of {@code pDecodeInfo→pReferenceSlots} represents a top field, then the DPB slot index of the bound video session specified by the {@code slotIndex} member of that element <b>must</b> be currently associated with a top field picture <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-picture-resource-matching">matching</a> the video picture resource specified by the {@code pPictureResource} member of the same element at the time the command is executed on the device</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR and an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#decode-h264-active-reference-picture-info">active reference picture</a> corresponding to any element of {@code pDecodeInfo→pReferenceSlots} represents a bottom field, then the DPB slot index of the bound video session specified by the {@code slotIndex} member of that element <b>must</b> be currently associated with a bottom field picture <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-picture-resource-matching">matching</a> the video picture resource specified by the {@code pPictureResource} member of the same element at the time the command is executed on the device</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR, then the {@code pNext} chain of {@code pDecodeInfo} <b>must</b> include a ##VkVideoDecodeH265PictureInfoKHR structure</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR, then all elements of the {@code pSliceSegmentOffsets} member of the ##VkVideoDecodeH265PictureInfoKHR structure included in the {@code pNext} chain of {@code pDecodeInfo} <b>must</b> be less than {@code pDecodeInfo→srcBufferRange}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR, then the bound video session parameters object <b>must</b> contain a {@code StdVideoH265VideoParameterSet} entry with {@code vps_video_parameter_set_id} matching {@code StdVideoDecodeH265PictureInfo}{@code ::sps_video_parameter_set_id} that is provided in the {@code pStdPictureInfo} member of the ##VkVideoDecodeH265PictureInfoKHR structure included in the {@code pNext} chain of {@code pDecodeInfo}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR, then the bound video session parameters object <b>must</b> contain a {@code StdVideoH265SequenceParameterSet} entry with {@code sps_video_parameter_set_id} and {@code sps_seq_parameter_set_id} matching {@code StdVideoDecodeH265PictureInfo}{@code ::sps_video_parameter_set_id} and {@code StdVideoDecodeH265PictureInfo}{@code ::pps_seq_parameter_set_id}, respectively, that are provided in the {@code pStdPictureInfo} member of the ##VkVideoDecodeH265PictureInfoKHR structure included in the {@code pNext} chain of {@code pDecodeInfo}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR, then the bound video session parameters object <b>must</b> contain a {@code StdVideoH265PictureParameterSet} entry with {@code sps_video_parameter_set_id}, {@code pps_seq_parameter_set_id}, and {@code pps_pic_parameter_set_id} matching {@code StdVideoDecodeH265PictureInfo}{@code ::sps_video_parameter_set_id}, {@code StdVideoDecodeH265PictureInfo}{@code ::pps_seq_parameter_set_id}, and {@code StdVideoDecodeH265PictureInfo}{@code ::pps_pic_parameter_set_id}, respectively, that are provided in the {@code pStdPictureInfo} member of the ##VkVideoDecodeH265PictureInfoKHR structure included in the {@code pNext} chain of {@code pDecodeInfo}</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR and {@code pDecodeInfo→pSetupReferenceSlot} is not {@code NULL}, then the {@code pNext} chain of {@code pDecodeInfo→pSetupReferenceSlot} <b>must</b> include a ##VkVideoDecodeH265DpbSlotInfoKHR structure</li>
            <li>If the bound video session was created with the video codec operation #VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR, then the {@code pNext} chain of each element of {@code pDecodeInfo→pReferenceSlots} <b>must</b> include a ##VkVideoDecodeH265DpbSlotInfoKHR structure</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pDecodeInfo} <b>must</b> be a valid pointer to a valid ##VkVideoDecodeInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support decode operations</li>
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
            <tbody><tr><td>Primary</td><td>Outside</td><td>Inside</td><td>Decode</td><td>Action</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkVideoDecodeInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer in which to record the command."),
        VkVideoDecodeInfoKHR.const.p("pDecodeInfo", "a pointer to a ##VkVideoDecodeInfoKHR structure specifying the parameters of the video decode operations.")
    )
}