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
 * <ul>
 * <li>{@link #vkCmdDecodeVideoKHR CmdDecodeVideoKHR}</li>
 * </ul>
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
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRVideoQueue VK_KHR_video_queue}</li>
 * <li>Requires {@link KHRSynchronization2 VK_KHR_synchronization2}</li>
 * <li>This is a <em>provisional</em> extension and <b>must</b> be used with caution. See the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#boilerplate-provisional-header">description</a> of provisional header files for enablement and stability details.</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li><a target="_blank" href="mailto:jake.beju@amd.com">jake.beju@amd.com</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2021-09-30</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jake Beju, AMD</li>
 * <li>Olivier Lapicque, NVIDIA</li>
 * <li>Peter Fang, AMD</li>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Srinath Kumarapuram, NVIDIA</li>
 * <li>Tony Zlatinski, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class KHRVideoDecodeQueue {

    /** The extension specification version. */
    public static final int VK_KHR_VIDEO_DECODE_QUEUE_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_KHR_VIDEO_DECODE_QUEUE_EXTENSION_NAME = "VK_KHR_video_decode_queue";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR = 1000024000;

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
     * VkVideoDecodeFlagBitsKHR - Video Decode Command Flags
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_DECODE_RESERVED_0_BIT_KHR VIDEO_DECODE_RESERVED_0_BIT_KHR} The current version of the specification has reserved this value for future use.</li>
     * </ul>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_DECODE_DEFAULT_KHR VIDEO_DECODE_DEFAULT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_VIDEO_DECODE_DEFAULT_KHR        = 0,
        VK_VIDEO_DECODE_RESERVED_0_BIT_KHR = 0x1;

    protected KHRVideoDecodeQueue() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdDecodeVideoKHR ] ---

    /** Unsafe version of: {@link #vkCmdDecodeVideoKHR CmdDecodeVideoKHR} */
    public static void nvkCmdDecodeVideoKHR(VkCommandBuffer commandBuffer, long pFrameInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDecodeVideoKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkVideoDecodeInfoKHR.validate(pFrameInfo);
        }
        callPPV(commandBuffer.address(), pFrameInfo, __functionAddress);
    }

    /**
     * Decode a frame.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To decode a frame, call:</p>
     * 
     * <pre><code>
     * void vkCmdDecodeVideoKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkVideoDecodeInfoKHR*                 pFrameInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pFrameInfo} <b>must</b> be a valid pointer to a valid {@link VkVideoDecodeInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support decode operations</li>
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
     * <tbody><tr><td>Primary</td><td>Outside</td><td>Decode</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoDecodeInfoKHR}</p>
     *
     * @param commandBuffer the command buffer to be filled with this function for decode frame command.
     * @param pFrameInfo    a pointer to a {@link VkVideoDecodeInfoKHR} structure.
     */
    public static void vkCmdDecodeVideoKHR(VkCommandBuffer commandBuffer, @NativeType("VkVideoDecodeInfoKHR const *") VkVideoDecodeInfoKHR pFrameInfo) {
        nvkCmdDecodeVideoKHR(commandBuffer, pFrameInfo.address());
    }

}