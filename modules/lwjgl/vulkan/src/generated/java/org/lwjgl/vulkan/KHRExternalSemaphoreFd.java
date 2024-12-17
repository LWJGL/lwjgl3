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

public class KHRExternalSemaphoreFd {

    public static final int VK_KHR_EXTERNAL_SEMAPHORE_FD_SPEC_VERSION = 1;

    public static final String VK_KHR_EXTERNAL_SEMAPHORE_FD_EXTENSION_NAME = "VK_KHR_external_semaphore_fd";

    public static final int
        VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHR = 1000079000,
        VK_STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR    = 1000079001;

    protected KHRExternalSemaphoreFd() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkImportSemaphoreFdKHR ] ---

    /** {@code VkResult vkImportSemaphoreFdKHR(VkDevice device, VkImportSemaphoreFdInfoKHR const * pImportSemaphoreFdInfo)} */
    public static int nvkImportSemaphoreFdKHR(VkDevice device, long pImportSemaphoreFdInfo) {
        long __functionAddress = device.getCapabilities().vkImportSemaphoreFdKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pImportSemaphoreFdInfo, __functionAddress);
    }

    /** {@code VkResult vkImportSemaphoreFdKHR(VkDevice device, VkImportSemaphoreFdInfoKHR const * pImportSemaphoreFdInfo)} */
    @NativeType("VkResult")
    public static int vkImportSemaphoreFdKHR(VkDevice device, @NativeType("VkImportSemaphoreFdInfoKHR const *") VkImportSemaphoreFdInfoKHR pImportSemaphoreFdInfo) {
        return nvkImportSemaphoreFdKHR(device, pImportSemaphoreFdInfo.address());
    }

    // --- [ vkGetSemaphoreFdKHR ] ---

    /** {@code VkResult vkGetSemaphoreFdKHR(VkDevice device, VkSemaphoreGetFdInfoKHR const * pGetFdInfo, int * pFd)} */
    public static int nvkGetSemaphoreFdKHR(VkDevice device, long pGetFdInfo, long pFd) {
        long __functionAddress = device.getCapabilities().vkGetSemaphoreFdKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pGetFdInfo, pFd, __functionAddress);
    }

    /** {@code VkResult vkGetSemaphoreFdKHR(VkDevice device, VkSemaphoreGetFdInfoKHR const * pGetFdInfo, int * pFd)} */
    @NativeType("VkResult")
    public static int vkGetSemaphoreFdKHR(VkDevice device, @NativeType("VkSemaphoreGetFdInfoKHR const *") VkSemaphoreGetFdInfoKHR pGetFdInfo, @NativeType("int *") IntBuffer pFd) {
        if (CHECKS) {
            check(pFd, 1);
        }
        return nvkGetSemaphoreFdKHR(device, pGetFdInfo.address(), memAddress(pFd));
    }

    /** {@code VkResult vkGetSemaphoreFdKHR(VkDevice device, VkSemaphoreGetFdInfoKHR const * pGetFdInfo, int * pFd)} */
    @NativeType("VkResult")
    public static int vkGetSemaphoreFdKHR(VkDevice device, @NativeType("VkSemaphoreGetFdInfoKHR const *") VkSemaphoreGetFdInfoKHR pGetFdInfo, @NativeType("int *") int[] pFd) {
        long __functionAddress = device.getCapabilities().vkGetSemaphoreFdKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pFd, 1);
        }
        return callPPPI(device.address(), pGetFdInfo.address(), pFd, __functionAddress);
    }

}