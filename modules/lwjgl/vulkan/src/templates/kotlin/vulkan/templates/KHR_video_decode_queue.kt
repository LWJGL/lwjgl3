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
            <dd>6</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires support for Vulkan 1.0</li>
                <li>Requires {@link KHRVideoQueue VK_KHR_video_queue} to be enabled for any device-level functionality</li>
                <li>Requires {@link KHRSynchronization2 VK_KHR_synchronization2} to be enabled for any device-level functionality</li>
                <li>This is a <em>provisional</em> extension and <b>must</b> be used with caution. See the <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#boilerplate-provisional-header">description</a> of provisional header files for enablement and stability details.</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li><a target="_blank" href="mailto:jake.beju@amd.com">jake.beju@amd.com</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2022-08-12</dd>

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

        "KHR_VIDEO_DECODE_QUEUE_SPEC_VERSION".."6"
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
            <li>#VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR - reports the implementation supports using the same <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-picture-resources">Video Picture Resource</a> for decode DPB and decode output.</li>
            <li>#VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR - reports the implementation supports using distinct <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#video-picture-resources">Video Picture Resources</a> for decode DPB and decode output.</li>
        </ul>

        An implementation <b>must</b> report at least one of #VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR or #VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR as supported.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note:</h5>
        If both #VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR and #VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR are supported, an application <b>may</b> choose to create separate images for decode DPB and decode output in the case where linear tiling is required for output but optimal tiling <b>must</b> still be used for DPB. This avoids scheduling layout transitions at the expense of extra overhead during decoding to write both images and the additional memory requirements.
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
        Decode a frame.

        <h5>C Specification</h5>
        To decode a frame, call:

        <pre><code>
￿void vkCmdDecodeVideoKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkVideoDecodeInfoKHR*                 pFrameInfo);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The bound video session object <b>must</b> not be in <em>uninitialized</em> state</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pFrameInfo} <b>must</b> be a valid pointer to a valid ##VkVideoDecodeInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support decode operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>This command <b>must</b> only be called inside of a video coding scope</li>
            <li>{@code commandBuffer} <b>must</b> be a primary {@code VkCommandBuffer}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary</td><td>Outside</td><td>Inside</td><td>Decode</td><td>Action</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkVideoDecodeInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer to be filled with this function for decode frame command."),
        VkVideoDecodeInfoKHR.const.p("pFrameInfo", "a pointer to a ##VkVideoDecodeInfoKHR structure.")
    )
}