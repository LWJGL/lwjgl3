/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRCopyCommands2 {

    public static final int VK_KHR_COPY_COMMANDS_2_SPEC_VERSION = 1;

    public static final String VK_KHR_COPY_COMMANDS_2_EXTENSION_NAME = "VK_KHR_copy_commands2";

    public static final int
        VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2_KHR          = 1000337000,
        VK_STRUCTURE_TYPE_COPY_IMAGE_INFO_2_KHR           = 1000337001,
        VK_STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2_KHR = 1000337002,
        VK_STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2_KHR = 1000337003,
        VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2_KHR           = 1000337004,
        VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2_KHR        = 1000337005,
        VK_STRUCTURE_TYPE_BUFFER_COPY_2_KHR               = 1000337006,
        VK_STRUCTURE_TYPE_IMAGE_COPY_2_KHR                = 1000337007,
        VK_STRUCTURE_TYPE_IMAGE_BLIT_2_KHR                = 1000337008,
        VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2_KHR         = 1000337009,
        VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2_KHR             = 1000337010;

    protected KHRCopyCommands2() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdCopyBuffer2KHR ] ---

    /** {@code void vkCmdCopyBuffer2KHR(VkCommandBuffer commandBuffer, VkCopyBufferInfo2 const * pCopyBufferInfo)} */
    public static void nvkCmdCopyBuffer2KHR(VkCommandBuffer commandBuffer, long pCopyBufferInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyBuffer2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyBufferInfo2.validate(pCopyBufferInfo);
        }
        callPPV(commandBuffer.address(), pCopyBufferInfo, __functionAddress);
    }

    /** {@code void vkCmdCopyBuffer2KHR(VkCommandBuffer commandBuffer, VkCopyBufferInfo2 const * pCopyBufferInfo)} */
    public static void vkCmdCopyBuffer2KHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyBufferInfo2 const *") VkCopyBufferInfo2 pCopyBufferInfo) {
        nvkCmdCopyBuffer2KHR(commandBuffer, pCopyBufferInfo.address());
    }

    // --- [ vkCmdCopyImage2KHR ] ---

    /** {@code void vkCmdCopyImage2KHR(VkCommandBuffer commandBuffer, VkCopyImageInfo2 const * pCopyImageInfo)} */
    public static void nvkCmdCopyImage2KHR(VkCommandBuffer commandBuffer, long pCopyImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyImage2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyImageInfo2.validate(pCopyImageInfo);
        }
        callPPV(commandBuffer.address(), pCopyImageInfo, __functionAddress);
    }

    /** {@code void vkCmdCopyImage2KHR(VkCommandBuffer commandBuffer, VkCopyImageInfo2 const * pCopyImageInfo)} */
    public static void vkCmdCopyImage2KHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyImageInfo2 const *") VkCopyImageInfo2 pCopyImageInfo) {
        nvkCmdCopyImage2KHR(commandBuffer, pCopyImageInfo.address());
    }

    // --- [ vkCmdCopyBufferToImage2KHR ] ---

    /** {@code void vkCmdCopyBufferToImage2KHR(VkCommandBuffer commandBuffer, VkCopyBufferToImageInfo2 const * pCopyBufferToImageInfo)} */
    public static void nvkCmdCopyBufferToImage2KHR(VkCommandBuffer commandBuffer, long pCopyBufferToImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyBufferToImage2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyBufferToImageInfo2.validate(pCopyBufferToImageInfo);
        }
        callPPV(commandBuffer.address(), pCopyBufferToImageInfo, __functionAddress);
    }

    /** {@code void vkCmdCopyBufferToImage2KHR(VkCommandBuffer commandBuffer, VkCopyBufferToImageInfo2 const * pCopyBufferToImageInfo)} */
    public static void vkCmdCopyBufferToImage2KHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyBufferToImageInfo2 const *") VkCopyBufferToImageInfo2 pCopyBufferToImageInfo) {
        nvkCmdCopyBufferToImage2KHR(commandBuffer, pCopyBufferToImageInfo.address());
    }

    // --- [ vkCmdCopyImageToBuffer2KHR ] ---

    /** {@code void vkCmdCopyImageToBuffer2KHR(VkCommandBuffer commandBuffer, VkCopyImageToBufferInfo2 const * pCopyImageToBufferInfo)} */
    public static void nvkCmdCopyImageToBuffer2KHR(VkCommandBuffer commandBuffer, long pCopyImageToBufferInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyImageToBuffer2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyImageToBufferInfo2.validate(pCopyImageToBufferInfo);
        }
        callPPV(commandBuffer.address(), pCopyImageToBufferInfo, __functionAddress);
    }

    /** {@code void vkCmdCopyImageToBuffer2KHR(VkCommandBuffer commandBuffer, VkCopyImageToBufferInfo2 const * pCopyImageToBufferInfo)} */
    public static void vkCmdCopyImageToBuffer2KHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyImageToBufferInfo2 const *") VkCopyImageToBufferInfo2 pCopyImageToBufferInfo) {
        nvkCmdCopyImageToBuffer2KHR(commandBuffer, pCopyImageToBufferInfo.address());
    }

    // --- [ vkCmdBlitImage2KHR ] ---

    /** {@code void vkCmdBlitImage2KHR(VkCommandBuffer commandBuffer, VkBlitImageInfo2 const * pBlitImageInfo)} */
    public static void nvkCmdBlitImage2KHR(VkCommandBuffer commandBuffer, long pBlitImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBlitImage2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkBlitImageInfo2.validate(pBlitImageInfo);
        }
        callPPV(commandBuffer.address(), pBlitImageInfo, __functionAddress);
    }

    /** {@code void vkCmdBlitImage2KHR(VkCommandBuffer commandBuffer, VkBlitImageInfo2 const * pBlitImageInfo)} */
    public static void vkCmdBlitImage2KHR(VkCommandBuffer commandBuffer, @NativeType("VkBlitImageInfo2 const *") VkBlitImageInfo2 pBlitImageInfo) {
        nvkCmdBlitImage2KHR(commandBuffer, pBlitImageInfo.address());
    }

    // --- [ vkCmdResolveImage2KHR ] ---

    /** {@code void vkCmdResolveImage2KHR(VkCommandBuffer commandBuffer, VkResolveImageInfo2 const * pResolveImageInfo)} */
    public static void nvkCmdResolveImage2KHR(VkCommandBuffer commandBuffer, long pResolveImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdResolveImage2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkResolveImageInfo2.validate(pResolveImageInfo);
        }
        callPPV(commandBuffer.address(), pResolveImageInfo, __functionAddress);
    }

    /** {@code void vkCmdResolveImage2KHR(VkCommandBuffer commandBuffer, VkResolveImageInfo2 const * pResolveImageInfo)} */
    public static void vkCmdResolveImage2KHR(VkCommandBuffer commandBuffer, @NativeType("VkResolveImageInfo2 const *") VkResolveImageInfo2 pResolveImageInfo) {
        nvkCmdResolveImage2KHR(commandBuffer, pResolveImageInfo.address());
    }

}