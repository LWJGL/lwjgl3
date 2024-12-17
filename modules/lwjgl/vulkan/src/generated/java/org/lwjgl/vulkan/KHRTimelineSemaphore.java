/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class KHRTimelineSemaphore {

    public static final int VK_KHR_TIMELINE_SEMAPHORE_SPEC_VERSION = 2;

    public static final String VK_KHR_TIMELINE_SEMAPHORE_EXTENSION_NAME = "VK_KHR_timeline_semaphore";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES_KHR   = 1000207000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES_KHR = 1000207001,
        VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO_KHR                    = 1000207002,
        VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO_KHR                = 1000207003,
        VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO_KHR                           = 1000207004,
        VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO_KHR                         = 1000207005;

    public static final int
        VK_SEMAPHORE_TYPE_BINARY_KHR   = 0,
        VK_SEMAPHORE_TYPE_TIMELINE_KHR = 1;

    public static final int VK_SEMAPHORE_WAIT_ANY_BIT_KHR = 0x1;

    protected KHRTimelineSemaphore() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetSemaphoreCounterValueKHR ] ---

    /** {@code VkResult vkGetSemaphoreCounterValueKHR(VkDevice device, VkSemaphore semaphore, uint64_t * pValue)} */
    public static int nvkGetSemaphoreCounterValueKHR(VkDevice device, long semaphore, long pValue) {
        long __functionAddress = device.getCapabilities().vkGetSemaphoreCounterValueKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), semaphore, pValue, __functionAddress);
    }

    /** {@code VkResult vkGetSemaphoreCounterValueKHR(VkDevice device, VkSemaphore semaphore, uint64_t * pValue)} */
    @NativeType("VkResult")
    public static int vkGetSemaphoreCounterValueKHR(VkDevice device, @NativeType("VkSemaphore") long semaphore, @NativeType("uint64_t *") LongBuffer pValue) {
        if (CHECKS) {
            check(pValue, 1);
        }
        return nvkGetSemaphoreCounterValueKHR(device, semaphore, memAddress(pValue));
    }

    // --- [ vkWaitSemaphoresKHR ] ---

    /** {@code VkResult vkWaitSemaphoresKHR(VkDevice device, VkSemaphoreWaitInfo const * pWaitInfo, uint64_t timeout)} */
    public static int nvkWaitSemaphoresKHR(VkDevice device, long pWaitInfo, long timeout) {
        long __functionAddress = device.getCapabilities().vkWaitSemaphoresKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkSemaphoreWaitInfo.validate(pWaitInfo);
        }
        return callPPJI(device.address(), pWaitInfo, timeout, __functionAddress);
    }

    /** {@code VkResult vkWaitSemaphoresKHR(VkDevice device, VkSemaphoreWaitInfo const * pWaitInfo, uint64_t timeout)} */
    @NativeType("VkResult")
    public static int vkWaitSemaphoresKHR(VkDevice device, @NativeType("VkSemaphoreWaitInfo const *") VkSemaphoreWaitInfo pWaitInfo, @NativeType("uint64_t") long timeout) {
        return nvkWaitSemaphoresKHR(device, pWaitInfo.address(), timeout);
    }

    // --- [ vkSignalSemaphoreKHR ] ---

    /** {@code VkResult vkSignalSemaphoreKHR(VkDevice device, VkSemaphoreSignalInfo const * pSignalInfo)} */
    public static int nvkSignalSemaphoreKHR(VkDevice device, long pSignalInfo) {
        long __functionAddress = device.getCapabilities().vkSignalSemaphoreKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pSignalInfo, __functionAddress);
    }

    /** {@code VkResult vkSignalSemaphoreKHR(VkDevice device, VkSemaphoreSignalInfo const * pSignalInfo)} */
    @NativeType("VkResult")
    public static int vkSignalSemaphoreKHR(VkDevice device, @NativeType("VkSemaphoreSignalInfo const *") VkSemaphoreSignalInfo pSignalInfo) {
        return nvkSignalSemaphoreKHR(device, pSignalInfo.address());
    }

    /** {@code VkResult vkGetSemaphoreCounterValueKHR(VkDevice device, VkSemaphore semaphore, uint64_t * pValue)} */
    @NativeType("VkResult")
    public static int vkGetSemaphoreCounterValueKHR(VkDevice device, @NativeType("VkSemaphore") long semaphore, @NativeType("uint64_t *") long[] pValue) {
        long __functionAddress = device.getCapabilities().vkGetSemaphoreCounterValueKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pValue, 1);
        }
        return callPJPI(device.address(), semaphore, pValue, __functionAddress);
    }

}