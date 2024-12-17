/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRVideoDecodeQueue {

    public static final int VK_KHR_VIDEO_DECODE_QUEUE_SPEC_VERSION = 8;

    public static final String VK_KHR_VIDEO_DECODE_QUEUE_EXTENSION_NAME = "VK_KHR_video_decode_queue";

    public static final int
        VK_STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR         = 1000024000,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_CAPABILITIES_KHR = 1000024001,
        VK_STRUCTURE_TYPE_VIDEO_DECODE_USAGE_INFO_KHR   = 1000024002;

    public static final int VK_QUEUE_VIDEO_DECODE_BIT_KHR = 0x20;

    public static final long VK_PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR = 0x4000000L;

    public static final long
        VK_ACCESS_2_VIDEO_DECODE_READ_BIT_KHR  = 0x800000000L,
        VK_ACCESS_2_VIDEO_DECODE_WRITE_BIT_KHR = 0x1000000000L;

    public static final int
        VK_BUFFER_USAGE_VIDEO_DECODE_SRC_BIT_KHR = 0x2000,
        VK_BUFFER_USAGE_VIDEO_DECODE_DST_BIT_KHR = 0x4000;

    public static final int
        VK_IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR = 0x400,
        VK_IMAGE_USAGE_VIDEO_DECODE_SRC_BIT_KHR = 0x800,
        VK_IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR = 0x1000;

    public static final int
        VK_FORMAT_FEATURE_VIDEO_DECODE_OUTPUT_BIT_KHR = 0x2000000,
        VK_FORMAT_FEATURE_VIDEO_DECODE_DPB_BIT_KHR    = 0x4000000;

    public static final int
        VK_IMAGE_LAYOUT_VIDEO_DECODE_DST_KHR = 1000024000,
        VK_IMAGE_LAYOUT_VIDEO_DECODE_SRC_KHR = 1000024001,
        VK_IMAGE_LAYOUT_VIDEO_DECODE_DPB_KHR = 1000024002;

    public static final long
        VK_FORMAT_FEATURE_2_VIDEO_DECODE_OUTPUT_BIT_KHR = 0x2000000L,
        VK_FORMAT_FEATURE_2_VIDEO_DECODE_DPB_BIT_KHR    = 0x4000000L;

    public static final int
        VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR = 0x1,
        VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR = 0x2;

    public static final int
        VK_VIDEO_DECODE_USAGE_DEFAULT_KHR         = 0,
        VK_VIDEO_DECODE_USAGE_TRANSCODING_BIT_KHR = 0x1,
        VK_VIDEO_DECODE_USAGE_OFFLINE_BIT_KHR     = 0x2,
        VK_VIDEO_DECODE_USAGE_STREAMING_BIT_KHR   = 0x4;

    protected KHRVideoDecodeQueue() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdDecodeVideoKHR ] ---

    /** {@code void vkCmdDecodeVideoKHR(VkCommandBuffer commandBuffer, VkVideoDecodeInfoKHR const * pDecodeInfo)} */
    public static void nvkCmdDecodeVideoKHR(VkCommandBuffer commandBuffer, long pDecodeInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDecodeVideoKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkVideoDecodeInfoKHR.validate(pDecodeInfo);
        }
        callPPV(commandBuffer.address(), pDecodeInfo, __functionAddress);
    }

    /** {@code void vkCmdDecodeVideoKHR(VkCommandBuffer commandBuffer, VkVideoDecodeInfoKHR const * pDecodeInfo)} */
    public static void vkCmdDecodeVideoKHR(VkCommandBuffer commandBuffer, @NativeType("VkVideoDecodeInfoKHR const *") VkVideoDecodeInfoKHR pDecodeInfo) {
        nvkCmdDecodeVideoKHR(commandBuffer, pDecodeInfo.address());
    }

}