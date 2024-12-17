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

public class EXTTransformFeedback {

    public static final int VK_EXT_TRANSFORM_FEEDBACK_SPEC_VERSION = 1;

    public static final String VK_EXT_TRANSFORM_FEEDBACK_EXTENSION_NAME = "VK_EXT_transform_feedback";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT     = 1000028000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT   = 1000028001,
        VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT = 1000028002;

    public static final int VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT = 1000028004;

    public static final int
        VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT         = 0x800,
        VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT = 0x1000;

    public static final int
        VK_ACCESS_TRANSFORM_FEEDBACK_WRITE_BIT_EXT         = 0x2000000,
        VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT  = 0x4000000,
        VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT = 0x8000000;

    public static final int VK_PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT = 0x1000000;

    protected EXTTransformFeedback() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdBindTransformFeedbackBuffersEXT ] ---

    /** {@code void vkCmdBindTransformFeedbackBuffersEXT(VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, VkBuffer const * pBuffers, VkDeviceSize const * pOffsets, VkDeviceSize const * pSizes)} */
    public static void nvkCmdBindTransformFeedbackBuffersEXT(VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, long pBuffers, long pOffsets, long pSizes) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindTransformFeedbackBuffersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(commandBuffer.address(), firstBinding, bindingCount, pBuffers, pOffsets, pSizes, __functionAddress);
    }

    /** {@code void vkCmdBindTransformFeedbackBuffersEXT(VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, VkBuffer const * pBuffers, VkDeviceSize const * pOffsets, VkDeviceSize const * pSizes)} */
    public static void vkCmdBindTransformFeedbackBuffersEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") LongBuffer pBuffers, @NativeType("VkDeviceSize const *") LongBuffer pOffsets, @NativeType("VkDeviceSize const *") @Nullable LongBuffer pSizes) {
        if (CHECKS) {
            check(pOffsets, pBuffers.remaining());
            checkSafe(pSizes, pBuffers.remaining());
        }
        nvkCmdBindTransformFeedbackBuffersEXT(commandBuffer, firstBinding, pBuffers.remaining(), memAddress(pBuffers), memAddress(pOffsets), memAddressSafe(pSizes));
    }

    // --- [ vkCmdBeginTransformFeedbackEXT ] ---

    /** {@code void vkCmdBeginTransformFeedbackEXT(VkCommandBuffer commandBuffer, uint32_t firstCounterBuffer, uint32_t counterBufferCount, VkBuffer const * pCounterBuffers, VkDeviceSize const * pCounterBufferOffsets)} */
    public static void nvkCmdBeginTransformFeedbackEXT(VkCommandBuffer commandBuffer, int firstCounterBuffer, int counterBufferCount, long pCounterBuffers, long pCounterBufferOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginTransformFeedbackEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(commandBuffer.address(), firstCounterBuffer, counterBufferCount, pCounterBuffers, pCounterBufferOffsets, __functionAddress);
    }

    /** {@code void vkCmdBeginTransformFeedbackEXT(VkCommandBuffer commandBuffer, uint32_t firstCounterBuffer, uint32_t counterBufferCount, VkBuffer const * pCounterBuffers, VkDeviceSize const * pCounterBufferOffsets)} */
    public static void vkCmdBeginTransformFeedbackEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstCounterBuffer, @NativeType("VkBuffer const *") @Nullable LongBuffer pCounterBuffers, @NativeType("VkDeviceSize const *") @Nullable LongBuffer pCounterBufferOffsets) {
        if (CHECKS) {
            checkSafe(pCounterBufferOffsets, remainingSafe(pCounterBuffers));
        }
        nvkCmdBeginTransformFeedbackEXT(commandBuffer, firstCounterBuffer, remainingSafe(pCounterBuffers), memAddressSafe(pCounterBuffers), memAddressSafe(pCounterBufferOffsets));
    }

    // --- [ vkCmdEndTransformFeedbackEXT ] ---

    /** {@code void vkCmdEndTransformFeedbackEXT(VkCommandBuffer commandBuffer, uint32_t firstCounterBuffer, uint32_t counterBufferCount, VkBuffer const * pCounterBuffers, VkDeviceSize const * pCounterBufferOffsets)} */
    public static void nvkCmdEndTransformFeedbackEXT(VkCommandBuffer commandBuffer, int firstCounterBuffer, int counterBufferCount, long pCounterBuffers, long pCounterBufferOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndTransformFeedbackEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(commandBuffer.address(), firstCounterBuffer, counterBufferCount, pCounterBuffers, pCounterBufferOffsets, __functionAddress);
    }

    /** {@code void vkCmdEndTransformFeedbackEXT(VkCommandBuffer commandBuffer, uint32_t firstCounterBuffer, uint32_t counterBufferCount, VkBuffer const * pCounterBuffers, VkDeviceSize const * pCounterBufferOffsets)} */
    public static void vkCmdEndTransformFeedbackEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstCounterBuffer, @NativeType("VkBuffer const *") @Nullable LongBuffer pCounterBuffers, @NativeType("VkDeviceSize const *") @Nullable LongBuffer pCounterBufferOffsets) {
        if (CHECKS) {
            checkSafe(pCounterBufferOffsets, remainingSafe(pCounterBuffers));
        }
        nvkCmdEndTransformFeedbackEXT(commandBuffer, firstCounterBuffer, remainingSafe(pCounterBuffers), memAddressSafe(pCounterBuffers), memAddressSafe(pCounterBufferOffsets));
    }

    // --- [ vkCmdBeginQueryIndexedEXT ] ---

    /** {@code void vkCmdBeginQueryIndexedEXT(VkCommandBuffer commandBuffer, VkQueryPool queryPool, uint32_t query, VkQueryControlFlags flags, uint32_t index)} */
    public static void vkCmdBeginQueryIndexedEXT(VkCommandBuffer commandBuffer, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int query, @NativeType("VkQueryControlFlags") int flags, @NativeType("uint32_t") int index) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginQueryIndexedEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(commandBuffer.address(), queryPool, query, flags, index, __functionAddress);
    }

    // --- [ vkCmdEndQueryIndexedEXT ] ---

    /** {@code void vkCmdEndQueryIndexedEXT(VkCommandBuffer commandBuffer, VkQueryPool queryPool, uint32_t query, uint32_t index)} */
    public static void vkCmdEndQueryIndexedEXT(VkCommandBuffer commandBuffer, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int query, @NativeType("uint32_t") int index) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndQueryIndexedEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(commandBuffer.address(), queryPool, query, index, __functionAddress);
    }

    // --- [ vkCmdDrawIndirectByteCountEXT ] ---

    /** {@code void vkCmdDrawIndirectByteCountEXT(VkCommandBuffer commandBuffer, uint32_t instanceCount, uint32_t firstInstance, VkBuffer counterBuffer, VkDeviceSize counterBufferOffset, uint32_t counterOffset, uint32_t vertexStride)} */
    public static void vkCmdDrawIndirectByteCountEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int instanceCount, @NativeType("uint32_t") int firstInstance, @NativeType("VkBuffer") long counterBuffer, @NativeType("VkDeviceSize") long counterBufferOffset, @NativeType("uint32_t") int counterOffset, @NativeType("uint32_t") int vertexStride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndirectByteCountEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJV(commandBuffer.address(), instanceCount, firstInstance, counterBuffer, counterBufferOffset, counterOffset, vertexStride, __functionAddress);
    }

    /** {@code void vkCmdBindTransformFeedbackBuffersEXT(VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, VkBuffer const * pBuffers, VkDeviceSize const * pOffsets, VkDeviceSize const * pSizes)} */
    public static void vkCmdBindTransformFeedbackBuffersEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") long[] pBuffers, @NativeType("VkDeviceSize const *") long[] pOffsets, @NativeType("VkDeviceSize const *") long @Nullable [] pSizes) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindTransformFeedbackBuffersEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pOffsets, pBuffers.length);
            checkSafe(pSizes, pBuffers.length);
        }
        callPPPPV(commandBuffer.address(), firstBinding, pBuffers.length, pBuffers, pOffsets, pSizes, __functionAddress);
    }

    /** {@code void vkCmdBeginTransformFeedbackEXT(VkCommandBuffer commandBuffer, uint32_t firstCounterBuffer, uint32_t counterBufferCount, VkBuffer const * pCounterBuffers, VkDeviceSize const * pCounterBufferOffsets)} */
    public static void vkCmdBeginTransformFeedbackEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstCounterBuffer, @NativeType("VkBuffer const *") long @Nullable [] pCounterBuffers, @NativeType("VkDeviceSize const *") long @Nullable [] pCounterBufferOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginTransformFeedbackEXT;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(pCounterBufferOffsets, lengthSafe(pCounterBuffers));
        }
        callPPPV(commandBuffer.address(), firstCounterBuffer, lengthSafe(pCounterBuffers), pCounterBuffers, pCounterBufferOffsets, __functionAddress);
    }

    /** {@code void vkCmdEndTransformFeedbackEXT(VkCommandBuffer commandBuffer, uint32_t firstCounterBuffer, uint32_t counterBufferCount, VkBuffer const * pCounterBuffers, VkDeviceSize const * pCounterBufferOffsets)} */
    public static void vkCmdEndTransformFeedbackEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstCounterBuffer, @NativeType("VkBuffer const *") long @Nullable [] pCounterBuffers, @NativeType("VkDeviceSize const *") long @Nullable [] pCounterBufferOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndTransformFeedbackEXT;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(pCounterBufferOffsets, lengthSafe(pCounterBuffers));
        }
        callPPPV(commandBuffer.address(), firstCounterBuffer, lengthSafe(pCounterBuffers), pCounterBuffers, pCounterBufferOffsets, __functionAddress);
    }

}