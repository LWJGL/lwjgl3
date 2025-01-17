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

public class NVDeviceDiagnosticCheckpoints {

    public static final int VK_NV_DEVICE_DIAGNOSTIC_CHECKPOINTS_SPEC_VERSION = 2;

    public static final String VK_NV_DEVICE_DIAGNOSTIC_CHECKPOINTS_EXTENSION_NAME = "VK_NV_device_diagnostic_checkpoints";

    public static final int
        VK_STRUCTURE_TYPE_CHECKPOINT_DATA_NV                      = 1000206000,
        VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV   = 1000206001,
        VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_2_NV = 1000314008,
        VK_STRUCTURE_TYPE_CHECKPOINT_DATA_2_NV                    = 1000314009;

    protected NVDeviceDiagnosticCheckpoints() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetCheckpointNV ] ---

    /** {@code void vkCmdSetCheckpointNV(VkCommandBuffer commandBuffer, void const * pCheckpointMarker)} */
    public static void vkCmdSetCheckpointNV(VkCommandBuffer commandBuffer, @NativeType("void const *") long pCheckpointMarker) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCheckpointNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pCheckpointMarker, __functionAddress);
    }

    // --- [ vkGetQueueCheckpointDataNV ] ---

    /** {@code void vkGetQueueCheckpointDataNV(VkQueue queue, uint32_t * pCheckpointDataCount, VkCheckpointDataNV * pCheckpointData)} */
    public static void nvkGetQueueCheckpointDataNV(VkQueue queue, long pCheckpointDataCount, long pCheckpointData) {
        long __functionAddress = queue.getCapabilities().vkGetQueueCheckpointDataNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(queue.address(), pCheckpointDataCount, pCheckpointData, __functionAddress);
    }

    /** {@code void vkGetQueueCheckpointDataNV(VkQueue queue, uint32_t * pCheckpointDataCount, VkCheckpointDataNV * pCheckpointData)} */
    public static void vkGetQueueCheckpointDataNV(VkQueue queue, @NativeType("uint32_t *") IntBuffer pCheckpointDataCount, @NativeType("VkCheckpointDataNV *") VkCheckpointDataNV.@Nullable Buffer pCheckpointData) {
        if (CHECKS) {
            check(pCheckpointDataCount, 1);
            checkSafe(pCheckpointData, pCheckpointDataCount.get(pCheckpointDataCount.position()));
        }
        nvkGetQueueCheckpointDataNV(queue, memAddress(pCheckpointDataCount), memAddressSafe(pCheckpointData));
    }

    // --- [ vkGetQueueCheckpointData2NV ] ---

    /** {@code void vkGetQueueCheckpointData2NV(VkQueue queue, uint32_t * pCheckpointDataCount, VkCheckpointData2NV * pCheckpointData)} */
    public static void nvkGetQueueCheckpointData2NV(VkQueue queue, long pCheckpointDataCount, long pCheckpointData) {
        long __functionAddress = queue.getCapabilities().vkGetQueueCheckpointData2NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(queue.address(), pCheckpointDataCount, pCheckpointData, __functionAddress);
    }

    /** {@code void vkGetQueueCheckpointData2NV(VkQueue queue, uint32_t * pCheckpointDataCount, VkCheckpointData2NV * pCheckpointData)} */
    public static void vkGetQueueCheckpointData2NV(VkQueue queue, @NativeType("uint32_t *") IntBuffer pCheckpointDataCount, @NativeType("VkCheckpointData2NV *") VkCheckpointData2NV.@Nullable Buffer pCheckpointData) {
        if (CHECKS) {
            check(pCheckpointDataCount, 1);
            checkSafe(pCheckpointData, pCheckpointDataCount.get(pCheckpointDataCount.position()));
        }
        nvkGetQueueCheckpointData2NV(queue, memAddress(pCheckpointDataCount), memAddressSafe(pCheckpointData));
    }

    /** {@code void vkGetQueueCheckpointDataNV(VkQueue queue, uint32_t * pCheckpointDataCount, VkCheckpointDataNV * pCheckpointData)} */
    public static void vkGetQueueCheckpointDataNV(VkQueue queue, @NativeType("uint32_t *") int[] pCheckpointDataCount, @NativeType("VkCheckpointDataNV *") VkCheckpointDataNV.@Nullable Buffer pCheckpointData) {
        long __functionAddress = queue.getCapabilities().vkGetQueueCheckpointDataNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pCheckpointDataCount, 1);
            checkSafe(pCheckpointData, pCheckpointDataCount[0]);
        }
        callPPPV(queue.address(), pCheckpointDataCount, memAddressSafe(pCheckpointData), __functionAddress);
    }

    /** {@code void vkGetQueueCheckpointData2NV(VkQueue queue, uint32_t * pCheckpointDataCount, VkCheckpointData2NV * pCheckpointData)} */
    public static void vkGetQueueCheckpointData2NV(VkQueue queue, @NativeType("uint32_t *") int[] pCheckpointDataCount, @NativeType("VkCheckpointData2NV *") VkCheckpointData2NV.@Nullable Buffer pCheckpointData) {
        long __functionAddress = queue.getCapabilities().vkGetQueueCheckpointData2NV;
        if (CHECKS) {
            check(__functionAddress);
            check(pCheckpointDataCount, 1);
            checkSafe(pCheckpointData, pCheckpointDataCount[0]);
        }
        callPPPV(queue.address(), pCheckpointDataCount, memAddressSafe(pCheckpointData), __functionAddress);
    }

}