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
 * <li>{@link #vkCmdEncodeVideoKHR CmdEncodeVideoKHR}</li>
 * </ul>
 * 
 * <h5>VK_KHR_video_encode_queue</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_video_encode_queue}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>300</dd>
 * <dt><b>Revision</b></dt>
 * <dd>4</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRVideoQueue VK_KHR_video_queue}</li>
 * <li>Requires {@link KHRSynchronization2 VK_KHR_synchronization2}</li>
 * <li>This is a <em>provisional</em> extension and <b>must</b> be used with caution. See the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#boilerplate-provisional-header">description</a> of provisional header files for enablement and stability details.</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Ahmed Abdelkhalek <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_video_encode_queue]%20@aabdelkh%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_video_encode_queue%20extension%3E%3E">aabdelkh</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2022-02-10</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Ahmed Abdelkhalek, AMD</li>
 * <li>Damien Kessler, NVIDIA</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>George Hao, AMD</li>
 * <li>Jake Beju, AMD</li>
 * <li>Peter Fang, AMD</li>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Srinath Kumarapuram, NVIDIA</li>
 * <li>Thomas J. Meier, NVIDIA</li>
 * <li>Tony Zlatinski, NVIDIA</li>
 * <li>Yang Liu, AMD</li>
 * </ul></dd>
 * </dl>
 */
public class KHRVideoEncodeQueue {

    /** The extension specification version. */
    public static final int VK_KHR_VIDEO_ENCODE_QUEUE_SPEC_VERSION = 4;

    /** The extension name. */
    public static final String VK_KHR_VIDEO_ENCODE_QUEUE_EXTENSION_NAME = "VK_KHR_video_encode_queue";

    /** Extends {@code VkPipelineStageFlagBits2}. */
    public static final long VK_PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR = 0x8000000L;

    /**
     * Extends {@code VkAccessFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR}</li>
     * <li>{@link #VK_ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR}</li>
     * </ul>
     */
    public static final long
        VK_ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR  = 0x2000000000L,
        VK_ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR = 0x4000000000L;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR                    = 1000299000,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR       = 1000299001,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR = 1000299002,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR            = 1000299003;

    /** Extends {@code VkQueueFlagBits}. */
    public static final int VK_QUEUE_VIDEO_ENCODE_BIT_KHR = 0x40;

    /**
     * Extends {@code VkBufferUsageFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_BUFFER_USAGE_VIDEO_ENCODE_DST_BIT_KHR BUFFER_USAGE_VIDEO_ENCODE_DST_BIT_KHR}</li>
     * <li>{@link #VK_BUFFER_USAGE_VIDEO_ENCODE_SRC_BIT_KHR BUFFER_USAGE_VIDEO_ENCODE_SRC_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_BUFFER_USAGE_VIDEO_ENCODE_DST_BIT_KHR = 0x8000,
        VK_BUFFER_USAGE_VIDEO_ENCODE_SRC_BIT_KHR = 0x10000;

    /**
     * Extends {@code VkImageUsageFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR}</li>
     * <li>{@link #VK_IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR}</li>
     * <li>{@link #VK_IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR = 0x2000,
        VK_IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR = 0x4000,
        VK_IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR = 0x8000;

    /**
     * Extends {@code VkFormatFeatureFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_FORMAT_FEATURE_VIDEO_ENCODE_INPUT_BIT_KHR FORMAT_FEATURE_VIDEO_ENCODE_INPUT_BIT_KHR}</li>
     * <li>{@link #VK_FORMAT_FEATURE_VIDEO_ENCODE_DPB_BIT_KHR FORMAT_FEATURE_VIDEO_ENCODE_DPB_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_FORMAT_FEATURE_VIDEO_ENCODE_INPUT_BIT_KHR = 0x8000000,
        VK_FORMAT_FEATURE_VIDEO_ENCODE_DPB_BIT_KHR   = 0x10000000;

    /**
     * Extends {@code VkImageLayout}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_IMAGE_LAYOUT_VIDEO_ENCODE_DST_KHR IMAGE_LAYOUT_VIDEO_ENCODE_DST_KHR}</li>
     * <li>{@link #VK_IMAGE_LAYOUT_VIDEO_ENCODE_SRC_KHR IMAGE_LAYOUT_VIDEO_ENCODE_SRC_KHR}</li>
     * <li>{@link #VK_IMAGE_LAYOUT_VIDEO_ENCODE_DPB_KHR IMAGE_LAYOUT_VIDEO_ENCODE_DPB_KHR}</li>
     * </ul>
     */
    public static final int
        VK_IMAGE_LAYOUT_VIDEO_ENCODE_DST_KHR = 1000299000,
        VK_IMAGE_LAYOUT_VIDEO_ENCODE_SRC_KHR = 1000299001,
        VK_IMAGE_LAYOUT_VIDEO_ENCODE_DPB_KHR = 1000299002;

    /** Extends {@code VkQueryType}. */
    public static final int VK_QUERY_TYPE_VIDEO_ENCODE_BITSTREAM_BUFFER_RANGE_KHR = 1000299000;

    /**
     * Extends {@code VkFormatFeatureFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_FORMAT_FEATURE_2_VIDEO_ENCODE_INPUT_BIT_KHR FORMAT_FEATURE_2_VIDEO_ENCODE_INPUT_BIT_KHR}</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_VIDEO_ENCODE_DPB_BIT_KHR FORMAT_FEATURE_2_VIDEO_ENCODE_DPB_BIT_KHR}</li>
     * </ul>
     */
    public static final long
        VK_FORMAT_FEATURE_2_VIDEO_ENCODE_INPUT_BIT_KHR = 0x8000000L,
        VK_FORMAT_FEATURE_2_VIDEO_ENCODE_DPB_BIT_KHR   = 0x10000000L;

    /**
     * VkVideoEncodeFlagBitsKHR - Video Encode Command Flags
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_ENCODE_RESERVED_0_BIT_KHR VIDEO_ENCODE_RESERVED_0_BIT_KHR} The current version of the specification has reserved this value for future use.</li>
     * </ul>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_ENCODE_DEFAULT_KHR VIDEO_ENCODE_DEFAULT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_VIDEO_ENCODE_DEFAULT_KHR        = 0,
        VK_VIDEO_ENCODE_RESERVED_0_BIT_KHR = 0x1;

    /**
     * VkVideoEncodeCapabilityFlagBitsKHR - Video encode capability flags
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_ENCODE_CAPABILITY_PRECEDING_EXTERNALLY_ENCODED_BYTES_BIT_KHR VIDEO_ENCODE_CAPABILITY_PRECEDING_EXTERNALLY_ENCODED_BYTES_BIT_KHR} reports that the implementation supports use of {@link VkVideoEncodeInfoKHR}{@code ::precedingExternallyEncodedBytes}.</li>
     * </ul>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_ENCODE_CAPABILITY_DEFAULT_KHR VIDEO_ENCODE_CAPABILITY_DEFAULT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_VIDEO_ENCODE_CAPABILITY_DEFAULT_KHR                                = 0,
        VK_VIDEO_ENCODE_CAPABILITY_PRECEDING_EXTERNALLY_ENCODED_BYTES_BIT_KHR = 0x1;

    /**
     * VkVideoEncodeRateControlModeFlagBitsKHR - Video encode rate control modes
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR} for disabling rate control.</li>
     * <li>{@link #VK_VIDEO_ENCODE_RATE_CONTROL_MODE_CBR_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_CBR_BIT_KHR} for constant bitrate rate control mode.</li>
     * <li>{@link #VK_VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR} for variable bitrate rate control mode.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoEncodeRateControlInfoKHR}</p>
     */
    public static final int
        VK_VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR = 0,
        VK_VIDEO_ENCODE_RATE_CONTROL_MODE_CBR_BIT_KHR  = 1,
        VK_VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR  = 2;

    /**
     * VkVideoEncodeRateControlFlagBitsKHR - Reserved for future use
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code VkVideoEncodeRateControlFlagBitsKHR} defines bits which may be set in a {@code VkVideoEncodeRateControlFlagsKHR} value, but is currently unused.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_ENCODE_RATE_CONTROL_DEFAULT_KHR VIDEO_ENCODE_RATE_CONTROL_DEFAULT_KHR}</li>
     * <li>{@link #VK_VIDEO_ENCODE_RATE_CONTROL_RESERVED_0_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_RESERVED_0_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_VIDEO_ENCODE_RATE_CONTROL_DEFAULT_KHR        = 0,
        VK_VIDEO_ENCODE_RATE_CONTROL_RESERVED_0_BIT_KHR = 0x1;

    protected KHRVideoEncodeQueue() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdEncodeVideoKHR ] ---

    /** Unsafe version of: {@link #vkCmdEncodeVideoKHR CmdEncodeVideoKHR} */
    public static void nvkCmdEncodeVideoKHR(VkCommandBuffer commandBuffer, long pEncodeInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEncodeVideoKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkVideoEncodeInfoKHR.validate(pEncodeInfo);
        }
        callPPV(commandBuffer.address(), pEncodeInfo, __functionAddress);
    }

    /**
     * Encode operation for bitstream generation.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To launch an encode operation that results in bitstream generation, call:</p>
     * 
     * <pre><code>
     * void vkCmdEncodeVideoKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkVideoEncodeInfoKHR*                 pEncodeInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pEncodeInfo} <b>must</b> be a valid pointer to a valid {@link VkVideoEncodeInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support encode operations</li>
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
     * <tbody><tr><td>Primary</td><td>Outside</td><td>Encode</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoEncodeInfoKHR}</p>
     *
     * @param commandBuffer the command buffer to be filled with this function for encoding to generate a bitstream.
     * @param pEncodeInfo   a pointer to a {@link VkVideoEncodeInfoKHR} structure.
     */
    public static void vkCmdEncodeVideoKHR(VkCommandBuffer commandBuffer, @NativeType("VkVideoEncodeInfoKHR const *") VkVideoEncodeInfoKHR pEncodeInfo) {
        nvkCmdEncodeVideoKHR(commandBuffer, pEncodeInfo.address());
    }

}