/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class KHRCreateRenderpass2 {

    public static final int VK_KHR_CREATE_RENDERPASS_2_SPEC_VERSION = 1;

    public static final String VK_KHR_CREATE_RENDERPASS_2_EXTENSION_NAME = "VK_KHR_create_renderpass2";

    public static final int
        VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2_KHR  = 1000109000,
        VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2_KHR    = 1000109001,
        VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2_KHR     = 1000109002,
        VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2_KHR      = 1000109003,
        VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2_KHR = 1000109004,
        VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO_KHR        = 1000109005,
        VK_STRUCTURE_TYPE_SUBPASS_END_INFO_KHR          = 1000109006;

    protected KHRCreateRenderpass2() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateRenderPass2KHR ] ---

    /** {@code VkResult vkCreateRenderPass2KHR(VkDevice device, VkRenderPassCreateInfo2 const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkRenderPass * pRenderPass)} */
    public static int nvkCreateRenderPass2KHR(VkDevice device, long pCreateInfo, long pAllocator, long pRenderPass) {
        long __functionAddress = device.getCapabilities().vkCreateRenderPass2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkRenderPassCreateInfo2.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pRenderPass, __functionAddress);
    }

    /** {@code VkResult vkCreateRenderPass2KHR(VkDevice device, VkRenderPassCreateInfo2 const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkRenderPass * pRenderPass)} */
    @NativeType("VkResult")
    public static int vkCreateRenderPass2KHR(VkDevice device, @NativeType("VkRenderPassCreateInfo2 const *") VkRenderPassCreateInfo2 pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkRenderPass *") LongBuffer pRenderPass) {
        if (CHECKS) {
            check(pRenderPass, 1);
        }
        return nvkCreateRenderPass2KHR(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pRenderPass));
    }

    // --- [ vkCmdBeginRenderPass2KHR ] ---

    /** {@code void vkCmdBeginRenderPass2KHR(VkCommandBuffer commandBuffer, VkRenderPassBeginInfo const * pRenderPassBegin, VkSubpassBeginInfo const * pSubpassBeginInfo)} */
    public static void nvkCmdBeginRenderPass2KHR(VkCommandBuffer commandBuffer, long pRenderPassBegin, long pSubpassBeginInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginRenderPass2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(commandBuffer.address(), pRenderPassBegin, pSubpassBeginInfo, __functionAddress);
    }

    /** {@code void vkCmdBeginRenderPass2KHR(VkCommandBuffer commandBuffer, VkRenderPassBeginInfo const * pRenderPassBegin, VkSubpassBeginInfo const * pSubpassBeginInfo)} */
    public static void vkCmdBeginRenderPass2KHR(VkCommandBuffer commandBuffer, @NativeType("VkRenderPassBeginInfo const *") VkRenderPassBeginInfo pRenderPassBegin, @NativeType("VkSubpassBeginInfo const *") VkSubpassBeginInfo pSubpassBeginInfo) {
        nvkCmdBeginRenderPass2KHR(commandBuffer, pRenderPassBegin.address(), pSubpassBeginInfo.address());
    }

    // --- [ vkCmdNextSubpass2KHR ] ---

    /** {@code void vkCmdNextSubpass2KHR(VkCommandBuffer commandBuffer, VkSubpassBeginInfo const * pSubpassBeginInfo, VkSubpassEndInfo const * pSubpassEndInfo)} */
    public static void nvkCmdNextSubpass2KHR(VkCommandBuffer commandBuffer, long pSubpassBeginInfo, long pSubpassEndInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdNextSubpass2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(commandBuffer.address(), pSubpassBeginInfo, pSubpassEndInfo, __functionAddress);
    }

    /** {@code void vkCmdNextSubpass2KHR(VkCommandBuffer commandBuffer, VkSubpassBeginInfo const * pSubpassBeginInfo, VkSubpassEndInfo const * pSubpassEndInfo)} */
    public static void vkCmdNextSubpass2KHR(VkCommandBuffer commandBuffer, @NativeType("VkSubpassBeginInfo const *") VkSubpassBeginInfo pSubpassBeginInfo, @NativeType("VkSubpassEndInfo const *") VkSubpassEndInfo pSubpassEndInfo) {
        nvkCmdNextSubpass2KHR(commandBuffer, pSubpassBeginInfo.address(), pSubpassEndInfo.address());
    }

    // --- [ vkCmdEndRenderPass2KHR ] ---

    /** {@code void vkCmdEndRenderPass2KHR(VkCommandBuffer commandBuffer, VkSubpassEndInfo const * pSubpassEndInfo)} */
    public static void nvkCmdEndRenderPass2KHR(VkCommandBuffer commandBuffer, long pSubpassEndInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndRenderPass2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pSubpassEndInfo, __functionAddress);
    }

    /** {@code void vkCmdEndRenderPass2KHR(VkCommandBuffer commandBuffer, VkSubpassEndInfo const * pSubpassEndInfo)} */
    public static void vkCmdEndRenderPass2KHR(VkCommandBuffer commandBuffer, @NativeType("VkSubpassEndInfo const *") VkSubpassEndInfo pSubpassEndInfo) {
        nvkCmdEndRenderPass2KHR(commandBuffer, pSubpassEndInfo.address());
    }

    /** {@code VkResult vkCreateRenderPass2KHR(VkDevice device, VkRenderPassCreateInfo2 const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkRenderPass * pRenderPass)} */
    @NativeType("VkResult")
    public static int vkCreateRenderPass2KHR(VkDevice device, @NativeType("VkRenderPassCreateInfo2 const *") VkRenderPassCreateInfo2 pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkRenderPass *") long[] pRenderPass) {
        long __functionAddress = device.getCapabilities().vkCreateRenderPass2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pRenderPass, 1);
            VkRenderPassCreateInfo2.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pRenderPass, __functionAddress);
    }

}