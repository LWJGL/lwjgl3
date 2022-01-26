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
        <ul>
            <li>#CmdDecodeVideoKHR()</li>
        </ul>

        <h5>VK_KHR_video_decode_queue</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_video_decode_queue}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>25</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRVideoQueue VK_KHR_video_queue}</li>
                <li>Requires {@link KHRSynchronization2 VK_KHR_synchronization2}</li>
                <li>This is a <em>provisional</em> extension and <b>must</b> be used with caution. See the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#boilerplate-provisional-header">description</a> of provisional header files for enablement and stability details.</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li><a target="_blank" href="mailto:jake.beju@amd.com">jake.beju@amd.com</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-09-30</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jake Beju, AMD</li>
                <li>Olivier Lapicque, NVIDIA</li>
                <li>Peter Fang, AMD</li>
                <li>Piers Daniell, NVIDIA</li>
                <li>Srinath Kumarapuram, NVIDIA</li>
                <li>Tony Zlatinski, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_VIDEO_DECODE_QUEUE_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "KHR_VIDEO_DECODE_QUEUE_EXTENSION_NAME".."VK_KHR_video_decode_queue"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR".."1000024000"
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
        VkVideoDecodeFlagBitsKHR - Video Decode Command Flags

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_DECODE_RESERVED_0_BIT_KHR The current version of the specification has reserved this value for future use.</li>
        </ul>
        """,

        "VIDEO_DECODE_DEFAULT_KHR".."0",
        "VIDEO_DECODE_RESERVED_0_BIT_KHR".enum(0x00000001)
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

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pFrameInfo} <b>must</b> be a valid pointer to a valid ##VkVideoDecodeInfoKHR structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support decode operations</li>
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
            <tbody><tr><td>Primary</td><td>Outside</td><td>Decode</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkVideoDecodeInfoKHR
        """,

        VkCommandBuffer("commandBuffer", "the command buffer to be filled with this function for decode frame command."),
        VkVideoDecodeInfoKHR.const.p("pFrameInfo", "a pointer to a ##VkVideoDecodeInfoKHR structure.")
    )
}