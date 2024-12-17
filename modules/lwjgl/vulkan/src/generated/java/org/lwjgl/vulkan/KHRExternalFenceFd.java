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

public class KHRExternalFenceFd {

    public static final int VK_KHR_EXTERNAL_FENCE_FD_SPEC_VERSION = 1;

    public static final String VK_KHR_EXTERNAL_FENCE_FD_EXTENSION_NAME = "VK_KHR_external_fence_fd";

    public static final int
        VK_STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR = 1000115000,
        VK_STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR    = 1000115001;

    protected KHRExternalFenceFd() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkImportFenceFdKHR ] ---

    /** {@code VkResult vkImportFenceFdKHR(VkDevice device, VkImportFenceFdInfoKHR const * pImportFenceFdInfo)} */
    public static int nvkImportFenceFdKHR(VkDevice device, long pImportFenceFdInfo) {
        long __functionAddress = device.getCapabilities().vkImportFenceFdKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pImportFenceFdInfo, __functionAddress);
    }

    /** {@code VkResult vkImportFenceFdKHR(VkDevice device, VkImportFenceFdInfoKHR const * pImportFenceFdInfo)} */
    @NativeType("VkResult")
    public static int vkImportFenceFdKHR(VkDevice device, @NativeType("VkImportFenceFdInfoKHR const *") VkImportFenceFdInfoKHR pImportFenceFdInfo) {
        return nvkImportFenceFdKHR(device, pImportFenceFdInfo.address());
    }

    // --- [ vkGetFenceFdKHR ] ---

    /** {@code VkResult vkGetFenceFdKHR(VkDevice device, VkFenceGetFdInfoKHR const * pGetFdInfo, int * pFd)} */
    public static int nvkGetFenceFdKHR(VkDevice device, long pGetFdInfo, long pFd) {
        long __functionAddress = device.getCapabilities().vkGetFenceFdKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pGetFdInfo, pFd, __functionAddress);
    }

    /** {@code VkResult vkGetFenceFdKHR(VkDevice device, VkFenceGetFdInfoKHR const * pGetFdInfo, int * pFd)} */
    @NativeType("VkResult")
    public static int vkGetFenceFdKHR(VkDevice device, @NativeType("VkFenceGetFdInfoKHR const *") VkFenceGetFdInfoKHR pGetFdInfo, @NativeType("int *") IntBuffer pFd) {
        if (CHECKS) {
            check(pFd, 1);
        }
        return nvkGetFenceFdKHR(device, pGetFdInfo.address(), memAddress(pFd));
    }

    /** {@code VkResult vkGetFenceFdKHR(VkDevice device, VkFenceGetFdInfoKHR const * pGetFdInfo, int * pFd)} */
    @NativeType("VkResult")
    public static int vkGetFenceFdKHR(VkDevice device, @NativeType("VkFenceGetFdInfoKHR const *") VkFenceGetFdInfoKHR pGetFdInfo, @NativeType("int *") int[] pFd) {
        long __functionAddress = device.getCapabilities().vkGetFenceFdKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pFd, 1);
        }
        return callPPPI(device.address(), pGetFdInfo.address(), pFd, __functionAddress);
    }

}