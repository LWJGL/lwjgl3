/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class KHRMaintenance10 {

    public static final int VK_KHR_MAINTENANCE_10_SPEC_VERSION = 1;

    public static final String VK_KHR_MAINTENANCE_10_EXTENSION_NAME = "VK_KHR_maintenance10";

    public static final int
        VK_STRUCTURE_TYPE_RENDERING_END_INFO_KHR                        = 1000619003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_10_FEATURES_KHR   = 1000630000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_10_PROPERTIES_KHR = 1000630001,
        VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_FLAGS_INFO_KHR           = 1000630002,
        VK_STRUCTURE_TYPE_RESOLVE_IMAGE_MODE_INFO_KHR                   = 1000630004;

    public static final int
        VK_ATTACHMENT_DESCRIPTION_RESOLVE_SKIP_TRANSFER_FUNCTION_BIT_KHR   = 0x2,
        VK_ATTACHMENT_DESCRIPTION_RESOLVE_ENABLE_TRANSFER_FUNCTION_BIT_KHR = 0x4;

    public static final int VK_RENDERING_LOCAL_READ_CONCURRENT_ACCESS_CONTROL_BIT_KHR = 0x100;

    public static final int
        VK_RENDERING_ATTACHMENT_INPUT_ATTACHMENT_FEEDBACK_BIT_KHR        = 0x1,
        VK_RENDERING_ATTACHMENT_RESOLVE_SKIP_TRANSFER_FUNCTION_BIT_KHR   = 0x2,
        VK_RENDERING_ATTACHMENT_RESOLVE_ENABLE_TRANSFER_FUNCTION_BIT_KHR = 0x4;

    public static final long
        VK_FORMAT_FEATURE_2_DEPTH_COPY_ON_COMPUTE_QUEUE_BIT_KHR    = 0x10000000000000L,
        VK_FORMAT_FEATURE_2_DEPTH_COPY_ON_TRANSFER_QUEUE_BIT_KHR   = 0x20000000000000L,
        VK_FORMAT_FEATURE_2_STENCIL_COPY_ON_COMPUTE_QUEUE_BIT_KHR  = 0x40000000000000L,
        VK_FORMAT_FEATURE_2_STENCIL_COPY_ON_TRANSFER_QUEUE_BIT_KHR = 0x80000000000000L;

    public static final int
        VK_RESOLVE_IMAGE_SKIP_TRANSFER_FUNCTION_BIT_KHR   = 0x1,
        VK_RESOLVE_IMAGE_ENABLE_TRANSFER_FUNCTION_BIT_KHR = 0x2;

    protected KHRMaintenance10() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdEndRendering2KHR ] ---

    /** {@code void vkCmdEndRendering2KHR(VkCommandBuffer commandBuffer, VkRenderingEndInfoKHR const * pRenderingEndInfo)} */
    public static void nvkCmdEndRendering2KHR(VkCommandBuffer commandBuffer, long pRenderingEndInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndRendering2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pRenderingEndInfo, __functionAddress);
    }

    /** {@code void vkCmdEndRendering2KHR(VkCommandBuffer commandBuffer, VkRenderingEndInfoKHR const * pRenderingEndInfo)} */
    public static void vkCmdEndRendering2KHR(VkCommandBuffer commandBuffer, @NativeType("VkRenderingEndInfoKHR const *") @Nullable VkRenderingEndInfoKHR pRenderingEndInfo) {
        nvkCmdEndRendering2KHR(commandBuffer, memAddressSafe(pRenderingEndInfo));
    }

}