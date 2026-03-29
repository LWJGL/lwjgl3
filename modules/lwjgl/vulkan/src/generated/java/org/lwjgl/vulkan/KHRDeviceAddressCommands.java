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

public class KHRDeviceAddressCommands {

    public static final int VK_KHR_DEVICE_ADDRESS_COMMANDS_SPEC_VERSION = 1;

    public static final String VK_KHR_DEVICE_ADDRESS_COMMANDS_EXTENSION_NAME = "VK_KHR_device_address_commands";

    public static final int
        VK_STRUCTURE_TYPE_DEVICE_MEMORY_COPY_KHR                               = 1000318000,
        VK_STRUCTURE_TYPE_COPY_DEVICE_MEMORY_INFO_KHR                          = 1000318001,
        VK_STRUCTURE_TYPE_DEVICE_MEMORY_IMAGE_COPY_KHR                         = 1000318002,
        VK_STRUCTURE_TYPE_COPY_DEVICE_MEMORY_IMAGE_INFO_KHR                    = 1000318003,
        VK_STRUCTURE_TYPE_MEMORY_RANGE_BARRIERS_INFO_KHR                       = 1000318004,
        VK_STRUCTURE_TYPE_MEMORY_RANGE_BARRIER_KHR                             = 1000318005,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_ADDRESS_COMMANDS_FEATURES_KHR = 1000318006,
        VK_STRUCTURE_TYPE_BIND_INDEX_BUFFER_3_INFO_KHR                         = 1000318007,
        VK_STRUCTURE_TYPE_BIND_VERTEX_BUFFER_3_INFO_KHR                        = 1000318008,
        VK_STRUCTURE_TYPE_DRAW_INDIRECT_2_INFO_KHR                             = 1000318009,
        VK_STRUCTURE_TYPE_DRAW_INDIRECT_COUNT_2_INFO_KHR                       = 1000318010,
        VK_STRUCTURE_TYPE_DISPATCH_INDIRECT_2_INFO_KHR                         = 1000318011,
        VK_STRUCTURE_TYPE_CONDITIONAL_RENDERING_BEGIN_INFO_2_EXT               = 1000318012,
        VK_STRUCTURE_TYPE_BIND_TRANSFORM_FEEDBACK_BUFFER_2_INFO_EXT            = 1000318013,
        VK_STRUCTURE_TYPE_MEMORY_MARKER_INFO_AMD                               = 1000318014,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_2_KHR             = 1000318015;

    public static final int
        VK_ADDRESS_COMMAND_PROTECTED_BIT_KHR                               = 0x1,
        VK_ADDRESS_COMMAND_FULLY_BOUND_BIT_KHR                             = 0x2,
        VK_ADDRESS_COMMAND_STORAGE_BUFFER_USAGE_BIT_KHR                    = 0x4,
        VK_ADDRESS_COMMAND_UNKNOWN_STORAGE_BUFFER_USAGE_BIT_KHR            = 0x8,
        VK_ADDRESS_COMMAND_TRANSFORM_FEEDBACK_BUFFER_USAGE_BIT_KHR         = 0x10,
        VK_ADDRESS_COMMAND_UNKNOWN_TRANSFORM_FEEDBACK_BUFFER_USAGE_BIT_KHR = 0x20;

    protected KHRDeviceAddressCommands() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdBindIndexBuffer3KHR ] ---

    /** {@code void vkCmdBindIndexBuffer3KHR(VkCommandBuffer commandBuffer, VkBindIndexBuffer3InfoKHR const * pInfo)} */
    public static void nvkCmdBindIndexBuffer3KHR(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindIndexBuffer3KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    /** {@code void vkCmdBindIndexBuffer3KHR(VkCommandBuffer commandBuffer, VkBindIndexBuffer3InfoKHR const * pInfo)} */
    public static void vkCmdBindIndexBuffer3KHR(VkCommandBuffer commandBuffer, @NativeType("VkBindIndexBuffer3InfoKHR const *") VkBindIndexBuffer3InfoKHR pInfo) {
        nvkCmdBindIndexBuffer3KHR(commandBuffer, pInfo.address());
    }

    // --- [ vkCmdBindVertexBuffers3KHR ] ---

    /** {@code void vkCmdBindVertexBuffers3KHR(VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, VkBindVertexBuffer3InfoKHR const * pBindingInfos)} */
    public static void nvkCmdBindVertexBuffers3KHR(VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, long pBindingInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindVertexBuffers3KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstBinding, bindingCount, pBindingInfos, __functionAddress);
    }

    /** {@code void vkCmdBindVertexBuffers3KHR(VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, VkBindVertexBuffer3InfoKHR const * pBindingInfos)} */
    public static void vkCmdBindVertexBuffers3KHR(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBindVertexBuffer3InfoKHR const *") VkBindVertexBuffer3InfoKHR.Buffer pBindingInfos) {
        nvkCmdBindVertexBuffers3KHR(commandBuffer, firstBinding, pBindingInfos.remaining(), pBindingInfos.address());
    }

    // --- [ vkCmdDrawIndirect2KHR ] ---

    /** {@code void vkCmdDrawIndirect2KHR(VkCommandBuffer commandBuffer, VkDrawIndirect2InfoKHR const * pInfo)} */
    public static void nvkCmdDrawIndirect2KHR(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndirect2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    /** {@code void vkCmdDrawIndirect2KHR(VkCommandBuffer commandBuffer, VkDrawIndirect2InfoKHR const * pInfo)} */
    public static void vkCmdDrawIndirect2KHR(VkCommandBuffer commandBuffer, @NativeType("VkDrawIndirect2InfoKHR const *") VkDrawIndirect2InfoKHR pInfo) {
        nvkCmdDrawIndirect2KHR(commandBuffer, pInfo.address());
    }

    // --- [ vkCmdDrawIndexedIndirect2KHR ] ---

    /** {@code void vkCmdDrawIndexedIndirect2KHR(VkCommandBuffer commandBuffer, VkDrawIndirect2InfoKHR const * pInfo)} */
    public static void nvkCmdDrawIndexedIndirect2KHR(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndexedIndirect2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    /** {@code void vkCmdDrawIndexedIndirect2KHR(VkCommandBuffer commandBuffer, VkDrawIndirect2InfoKHR const * pInfo)} */
    public static void vkCmdDrawIndexedIndirect2KHR(VkCommandBuffer commandBuffer, @NativeType("VkDrawIndirect2InfoKHR const *") VkDrawIndirect2InfoKHR pInfo) {
        nvkCmdDrawIndexedIndirect2KHR(commandBuffer, pInfo.address());
    }

    // --- [ vkCmdDispatchIndirect2KHR ] ---

    /** {@code void vkCmdDispatchIndirect2KHR(VkCommandBuffer commandBuffer, VkDispatchIndirect2InfoKHR const * pInfo)} */
    public static void nvkCmdDispatchIndirect2KHR(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDispatchIndirect2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    /** {@code void vkCmdDispatchIndirect2KHR(VkCommandBuffer commandBuffer, VkDispatchIndirect2InfoKHR const * pInfo)} */
    public static void vkCmdDispatchIndirect2KHR(VkCommandBuffer commandBuffer, @NativeType("VkDispatchIndirect2InfoKHR const *") VkDispatchIndirect2InfoKHR pInfo) {
        nvkCmdDispatchIndirect2KHR(commandBuffer, pInfo.address());
    }

    // --- [ vkCmdCopyMemoryKHR ] ---

    /** {@code void vkCmdCopyMemoryKHR(VkCommandBuffer commandBuffer, VkCopyDeviceMemoryInfoKHR const * pCopyMemoryInfo)} */
    public static void nvkCmdCopyMemoryKHR(VkCommandBuffer commandBuffer, long pCopyMemoryInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyMemoryKHR;
        if (CHECKS) {
            check(__functionAddress);
            if (pCopyMemoryInfo != NULL) { VkCopyDeviceMemoryInfoKHR.validate(pCopyMemoryInfo); }
        }
        callPPV(commandBuffer.address(), pCopyMemoryInfo, __functionAddress);
    }

    /** {@code void vkCmdCopyMemoryKHR(VkCommandBuffer commandBuffer, VkCopyDeviceMemoryInfoKHR const * pCopyMemoryInfo)} */
    public static void vkCmdCopyMemoryKHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyDeviceMemoryInfoKHR const *") @Nullable VkCopyDeviceMemoryInfoKHR pCopyMemoryInfo) {
        nvkCmdCopyMemoryKHR(commandBuffer, memAddressSafe(pCopyMemoryInfo));
    }

    // --- [ vkCmdCopyMemoryToImageKHR ] ---

    /** {@code void vkCmdCopyMemoryToImageKHR(VkCommandBuffer commandBuffer, VkCopyDeviceMemoryImageInfoKHR const * pCopyMemoryInfo)} */
    public static void nvkCmdCopyMemoryToImageKHR(VkCommandBuffer commandBuffer, long pCopyMemoryInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyMemoryToImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            if (pCopyMemoryInfo != NULL) { VkCopyDeviceMemoryImageInfoKHR.validate(pCopyMemoryInfo); }
        }
        callPPV(commandBuffer.address(), pCopyMemoryInfo, __functionAddress);
    }

    /** {@code void vkCmdCopyMemoryToImageKHR(VkCommandBuffer commandBuffer, VkCopyDeviceMemoryImageInfoKHR const * pCopyMemoryInfo)} */
    public static void vkCmdCopyMemoryToImageKHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyDeviceMemoryImageInfoKHR const *") @Nullable VkCopyDeviceMemoryImageInfoKHR pCopyMemoryInfo) {
        nvkCmdCopyMemoryToImageKHR(commandBuffer, memAddressSafe(pCopyMemoryInfo));
    }

    // --- [ vkCmdCopyImageToMemoryKHR ] ---

    /** {@code void vkCmdCopyImageToMemoryKHR(VkCommandBuffer commandBuffer, VkCopyDeviceMemoryImageInfoKHR const * pCopyMemoryInfo)} */
    public static void nvkCmdCopyImageToMemoryKHR(VkCommandBuffer commandBuffer, long pCopyMemoryInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyImageToMemoryKHR;
        if (CHECKS) {
            check(__functionAddress);
            if (pCopyMemoryInfo != NULL) { VkCopyDeviceMemoryImageInfoKHR.validate(pCopyMemoryInfo); }
        }
        callPPV(commandBuffer.address(), pCopyMemoryInfo, __functionAddress);
    }

    /** {@code void vkCmdCopyImageToMemoryKHR(VkCommandBuffer commandBuffer, VkCopyDeviceMemoryImageInfoKHR const * pCopyMemoryInfo)} */
    public static void vkCmdCopyImageToMemoryKHR(VkCommandBuffer commandBuffer, @NativeType("VkCopyDeviceMemoryImageInfoKHR const *") @Nullable VkCopyDeviceMemoryImageInfoKHR pCopyMemoryInfo) {
        nvkCmdCopyImageToMemoryKHR(commandBuffer, memAddressSafe(pCopyMemoryInfo));
    }

    // --- [ vkCmdUpdateMemoryKHR ] ---

    /** {@code void vkCmdUpdateMemoryKHR(VkCommandBuffer commandBuffer, VkDeviceAddressRangeKHR const * pDstRange, VkAddressCommandFlagsKHR dstFlags, VkDeviceSize dataSize, void const * pData)} */
    public static void nvkCmdUpdateMemoryKHR(VkCommandBuffer commandBuffer, long pDstRange, int dstFlags, long dataSize, long pData) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdUpdateMemoryKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPJPV(commandBuffer.address(), pDstRange, dstFlags, dataSize, pData, __functionAddress);
    }

    /** {@code void vkCmdUpdateMemoryKHR(VkCommandBuffer commandBuffer, VkDeviceAddressRangeKHR const * pDstRange, VkAddressCommandFlagsKHR dstFlags, VkDeviceSize dataSize, void const * pData)} */
    public static void vkCmdUpdateMemoryKHR(VkCommandBuffer commandBuffer, @NativeType("VkDeviceAddressRangeKHR const *") VkDeviceAddressRangeKHR pDstRange, @NativeType("VkAddressCommandFlagsKHR") int dstFlags, @NativeType("void const *") ByteBuffer pData) {
        nvkCmdUpdateMemoryKHR(commandBuffer, pDstRange.address(), dstFlags, pData.remaining(), memAddress(pData));
    }

    // --- [ vkCmdFillMemoryKHR ] ---

    /** {@code void vkCmdFillMemoryKHR(VkCommandBuffer commandBuffer, VkDeviceAddressRangeKHR const * pDstRange, VkAddressCommandFlagsKHR dstFlags, uint32_t data)} */
    public static void nvkCmdFillMemoryKHR(VkCommandBuffer commandBuffer, long pDstRange, int dstFlags, int data) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdFillMemoryKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pDstRange, dstFlags, data, __functionAddress);
    }

    /** {@code void vkCmdFillMemoryKHR(VkCommandBuffer commandBuffer, VkDeviceAddressRangeKHR const * pDstRange, VkAddressCommandFlagsKHR dstFlags, uint32_t data)} */
    public static void vkCmdFillMemoryKHR(VkCommandBuffer commandBuffer, @NativeType("VkDeviceAddressRangeKHR const *") VkDeviceAddressRangeKHR pDstRange, @NativeType("VkAddressCommandFlagsKHR") int dstFlags, @NativeType("uint32_t") int data) {
        nvkCmdFillMemoryKHR(commandBuffer, pDstRange.address(), dstFlags, data);
    }

    // --- [ vkCmdCopyQueryPoolResultsToMemoryKHR ] ---

    /** {@code void vkCmdCopyQueryPoolResultsToMemoryKHR(VkCommandBuffer commandBuffer, VkQueryPool queryPool, uint32_t firstQuery, uint32_t queryCount, VkStridedDeviceAddressRangeKHR const * pDstRange, VkAddressCommandFlagsKHR dstFlags, VkQueryResultFlags queryResultFlags)} */
    public static void nvkCmdCopyQueryPoolResultsToMemoryKHR(VkCommandBuffer commandBuffer, long queryPool, int firstQuery, int queryCount, long pDstRange, int dstFlags, int queryResultFlags) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyQueryPoolResultsToMemoryKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(commandBuffer.address(), queryPool, firstQuery, queryCount, pDstRange, dstFlags, queryResultFlags, __functionAddress);
    }

    /** {@code void vkCmdCopyQueryPoolResultsToMemoryKHR(VkCommandBuffer commandBuffer, VkQueryPool queryPool, uint32_t firstQuery, uint32_t queryCount, VkStridedDeviceAddressRangeKHR const * pDstRange, VkAddressCommandFlagsKHR dstFlags, VkQueryResultFlags queryResultFlags)} */
    public static void vkCmdCopyQueryPoolResultsToMemoryKHR(VkCommandBuffer commandBuffer, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery, @NativeType("uint32_t") int queryCount, @NativeType("VkStridedDeviceAddressRangeKHR const *") VkStridedDeviceAddressRangeKHR pDstRange, @NativeType("VkAddressCommandFlagsKHR") int dstFlags, @NativeType("VkQueryResultFlags") int queryResultFlags) {
        nvkCmdCopyQueryPoolResultsToMemoryKHR(commandBuffer, queryPool, firstQuery, queryCount, pDstRange.address(), dstFlags, queryResultFlags);
    }

    // --- [ vkCmdDrawIndirectCount2KHR ] ---

    /** {@code void vkCmdDrawIndirectCount2KHR(VkCommandBuffer commandBuffer, VkDrawIndirectCount2InfoKHR const * pInfo)} */
    public static void nvkCmdDrawIndirectCount2KHR(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndirectCount2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    /** {@code void vkCmdDrawIndirectCount2KHR(VkCommandBuffer commandBuffer, VkDrawIndirectCount2InfoKHR const * pInfo)} */
    public static void vkCmdDrawIndirectCount2KHR(VkCommandBuffer commandBuffer, @NativeType("VkDrawIndirectCount2InfoKHR const *") VkDrawIndirectCount2InfoKHR pInfo) {
        nvkCmdDrawIndirectCount2KHR(commandBuffer, pInfo.address());
    }

    // --- [ vkCmdDrawIndexedIndirectCount2KHR ] ---

    /** {@code void vkCmdDrawIndexedIndirectCount2KHR(VkCommandBuffer commandBuffer, VkDrawIndirectCount2InfoKHR const * pInfo)} */
    public static void nvkCmdDrawIndexedIndirectCount2KHR(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndexedIndirectCount2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    /** {@code void vkCmdDrawIndexedIndirectCount2KHR(VkCommandBuffer commandBuffer, VkDrawIndirectCount2InfoKHR const * pInfo)} */
    public static void vkCmdDrawIndexedIndirectCount2KHR(VkCommandBuffer commandBuffer, @NativeType("VkDrawIndirectCount2InfoKHR const *") VkDrawIndirectCount2InfoKHR pInfo) {
        nvkCmdDrawIndexedIndirectCount2KHR(commandBuffer, pInfo.address());
    }

    // --- [ vkCmdBeginConditionalRendering2EXT ] ---

    /** {@code void vkCmdBeginConditionalRendering2EXT(VkCommandBuffer commandBuffer, VkConditionalRenderingBeginInfo2EXT const * pConditionalRenderingBegin)} */
    public static void nvkCmdBeginConditionalRendering2EXT(VkCommandBuffer commandBuffer, long pConditionalRenderingBegin) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginConditionalRendering2EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pConditionalRenderingBegin, __functionAddress);
    }

    /** {@code void vkCmdBeginConditionalRendering2EXT(VkCommandBuffer commandBuffer, VkConditionalRenderingBeginInfo2EXT const * pConditionalRenderingBegin)} */
    public static void vkCmdBeginConditionalRendering2EXT(VkCommandBuffer commandBuffer, @NativeType("VkConditionalRenderingBeginInfo2EXT const *") VkConditionalRenderingBeginInfo2EXT pConditionalRenderingBegin) {
        nvkCmdBeginConditionalRendering2EXT(commandBuffer, pConditionalRenderingBegin.address());
    }

    // --- [ vkCmdBindTransformFeedbackBuffers2EXT ] ---

    /** {@code void vkCmdBindTransformFeedbackBuffers2EXT(VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, VkBindTransformFeedbackBuffer2InfoEXT const * pBindingInfos)} */
    public static void nvkCmdBindTransformFeedbackBuffers2EXT(VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, long pBindingInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindTransformFeedbackBuffers2EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstBinding, bindingCount, pBindingInfos, __functionAddress);
    }

    /** {@code void vkCmdBindTransformFeedbackBuffers2EXT(VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, VkBindTransformFeedbackBuffer2InfoEXT const * pBindingInfos)} */
    public static void vkCmdBindTransformFeedbackBuffers2EXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBindTransformFeedbackBuffer2InfoEXT const *") VkBindTransformFeedbackBuffer2InfoEXT.@Nullable Buffer pBindingInfos) {
        nvkCmdBindTransformFeedbackBuffers2EXT(commandBuffer, firstBinding, remainingSafe(pBindingInfos), memAddressSafe(pBindingInfos));
    }

    // --- [ vkCmdBeginTransformFeedback2EXT ] ---

    /** {@code void vkCmdBeginTransformFeedback2EXT(VkCommandBuffer commandBuffer, uint32_t firstCounterRange, uint32_t counterRangeCount, VkBindTransformFeedbackBuffer2InfoEXT const * pCounterInfos)} */
    public static void nvkCmdBeginTransformFeedback2EXT(VkCommandBuffer commandBuffer, int firstCounterRange, int counterRangeCount, long pCounterInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginTransformFeedback2EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstCounterRange, counterRangeCount, pCounterInfos, __functionAddress);
    }

    /** {@code void vkCmdBeginTransformFeedback2EXT(VkCommandBuffer commandBuffer, uint32_t firstCounterRange, uint32_t counterRangeCount, VkBindTransformFeedbackBuffer2InfoEXT const * pCounterInfos)} */
    public static void vkCmdBeginTransformFeedback2EXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstCounterRange, @NativeType("VkBindTransformFeedbackBuffer2InfoEXT const *") VkBindTransformFeedbackBuffer2InfoEXT.@Nullable Buffer pCounterInfos) {
        nvkCmdBeginTransformFeedback2EXT(commandBuffer, firstCounterRange, remainingSafe(pCounterInfos), memAddressSafe(pCounterInfos));
    }

    // --- [ vkCmdEndTransformFeedback2EXT ] ---

    /** {@code void vkCmdEndTransformFeedback2EXT(VkCommandBuffer commandBuffer, uint32_t firstCounterRange, uint32_t counterRangeCount, VkBindTransformFeedbackBuffer2InfoEXT const * pCounterInfos)} */
    public static void nvkCmdEndTransformFeedback2EXT(VkCommandBuffer commandBuffer, int firstCounterRange, int counterRangeCount, long pCounterInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndTransformFeedback2EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstCounterRange, counterRangeCount, pCounterInfos, __functionAddress);
    }

    /** {@code void vkCmdEndTransformFeedback2EXT(VkCommandBuffer commandBuffer, uint32_t firstCounterRange, uint32_t counterRangeCount, VkBindTransformFeedbackBuffer2InfoEXT const * pCounterInfos)} */
    public static void vkCmdEndTransformFeedback2EXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstCounterRange, @NativeType("VkBindTransformFeedbackBuffer2InfoEXT const *") VkBindTransformFeedbackBuffer2InfoEXT.@Nullable Buffer pCounterInfos) {
        nvkCmdEndTransformFeedback2EXT(commandBuffer, firstCounterRange, remainingSafe(pCounterInfos), memAddressSafe(pCounterInfos));
    }

    // --- [ vkCmdDrawIndirectByteCount2EXT ] ---

    /** {@code void vkCmdDrawIndirectByteCount2EXT(VkCommandBuffer commandBuffer, uint32_t instanceCount, uint32_t firstInstance, VkBindTransformFeedbackBuffer2InfoEXT const * pCounterInfo, uint32_t counterOffset, uint32_t vertexStride)} */
    public static void nvkCmdDrawIndirectByteCount2EXT(VkCommandBuffer commandBuffer, int instanceCount, int firstInstance, long pCounterInfo, int counterOffset, int vertexStride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndirectByteCount2EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), instanceCount, firstInstance, pCounterInfo, counterOffset, vertexStride, __functionAddress);
    }

    /** {@code void vkCmdDrawIndirectByteCount2EXT(VkCommandBuffer commandBuffer, uint32_t instanceCount, uint32_t firstInstance, VkBindTransformFeedbackBuffer2InfoEXT const * pCounterInfo, uint32_t counterOffset, uint32_t vertexStride)} */
    public static void vkCmdDrawIndirectByteCount2EXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int instanceCount, @NativeType("uint32_t") int firstInstance, @NativeType("VkBindTransformFeedbackBuffer2InfoEXT const *") VkBindTransformFeedbackBuffer2InfoEXT pCounterInfo, @NativeType("uint32_t") int counterOffset, @NativeType("uint32_t") int vertexStride) {
        nvkCmdDrawIndirectByteCount2EXT(commandBuffer, instanceCount, firstInstance, pCounterInfo.address(), counterOffset, vertexStride);
    }

    // --- [ vkCmdDrawMeshTasksIndirect2EXT ] ---

    /** {@code void vkCmdDrawMeshTasksIndirect2EXT(VkCommandBuffer commandBuffer, VkDrawIndirect2InfoKHR const * pInfo)} */
    public static void nvkCmdDrawMeshTasksIndirect2EXT(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawMeshTasksIndirect2EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    /** {@code void vkCmdDrawMeshTasksIndirect2EXT(VkCommandBuffer commandBuffer, VkDrawIndirect2InfoKHR const * pInfo)} */
    public static void vkCmdDrawMeshTasksIndirect2EXT(VkCommandBuffer commandBuffer, @NativeType("VkDrawIndirect2InfoKHR const *") VkDrawIndirect2InfoKHR pInfo) {
        nvkCmdDrawMeshTasksIndirect2EXT(commandBuffer, pInfo.address());
    }

    // --- [ vkCmdDrawMeshTasksIndirectCount2EXT ] ---

    /** {@code void vkCmdDrawMeshTasksIndirectCount2EXT(VkCommandBuffer commandBuffer, VkDrawIndirectCount2InfoKHR const * pInfo)} */
    public static void nvkCmdDrawMeshTasksIndirectCount2EXT(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawMeshTasksIndirectCount2EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    /** {@code void vkCmdDrawMeshTasksIndirectCount2EXT(VkCommandBuffer commandBuffer, VkDrawIndirectCount2InfoKHR const * pInfo)} */
    public static void vkCmdDrawMeshTasksIndirectCount2EXT(VkCommandBuffer commandBuffer, @NativeType("VkDrawIndirectCount2InfoKHR const *") VkDrawIndirectCount2InfoKHR pInfo) {
        nvkCmdDrawMeshTasksIndirectCount2EXT(commandBuffer, pInfo.address());
    }

    // --- [ vkCmdWriteMarkerToMemoryAMD ] ---

    /** {@code void vkCmdWriteMarkerToMemoryAMD(VkCommandBuffer commandBuffer, VkMemoryMarkerInfoAMD const * pInfo)} */
    public static void nvkCmdWriteMarkerToMemoryAMD(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteMarkerToMemoryAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    /** {@code void vkCmdWriteMarkerToMemoryAMD(VkCommandBuffer commandBuffer, VkMemoryMarkerInfoAMD const * pInfo)} */
    public static void vkCmdWriteMarkerToMemoryAMD(VkCommandBuffer commandBuffer, @NativeType("VkMemoryMarkerInfoAMD const *") VkMemoryMarkerInfoAMD pInfo) {
        nvkCmdWriteMarkerToMemoryAMD(commandBuffer, pInfo.address());
    }

    // --- [ vkCreateAccelerationStructure2KHR ] ---

    /** {@code VkResult vkCreateAccelerationStructure2KHR(VkDevice device, VkAccelerationStructureCreateInfo2KHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkAccelerationStructureKHR * pAccelerationStructure)} */
    public static int nvkCreateAccelerationStructure2KHR(VkDevice device, long pCreateInfo, long pAllocator, long pAccelerationStructure) {
        long __functionAddress = device.getCapabilities().vkCreateAccelerationStructure2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pAccelerationStructure, __functionAddress);
    }

    /** {@code VkResult vkCreateAccelerationStructure2KHR(VkDevice device, VkAccelerationStructureCreateInfo2KHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkAccelerationStructureKHR * pAccelerationStructure)} */
    @NativeType("VkResult")
    public static int vkCreateAccelerationStructure2KHR(VkDevice device, @NativeType("VkAccelerationStructureCreateInfo2KHR const *") VkAccelerationStructureCreateInfo2KHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkAccelerationStructureKHR *") LongBuffer pAccelerationStructure) {
        if (CHECKS) {
            check(pAccelerationStructure, 1);
        }
        return nvkCreateAccelerationStructure2KHR(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pAccelerationStructure));
    }

    /** {@code VkResult vkCreateAccelerationStructure2KHR(VkDevice device, VkAccelerationStructureCreateInfo2KHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkAccelerationStructureKHR * pAccelerationStructure)} */
    @NativeType("VkResult")
    public static int vkCreateAccelerationStructure2KHR(VkDevice device, @NativeType("VkAccelerationStructureCreateInfo2KHR const *") VkAccelerationStructureCreateInfo2KHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkAccelerationStructureKHR *") long[] pAccelerationStructure) {
        long __functionAddress = device.getCapabilities().vkCreateAccelerationStructure2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pAccelerationStructure, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pAccelerationStructure, __functionAddress);
    }

}