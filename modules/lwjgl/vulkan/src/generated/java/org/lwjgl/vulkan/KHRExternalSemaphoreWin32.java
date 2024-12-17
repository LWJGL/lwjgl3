/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.system.windows.*;

public class KHRExternalSemaphoreWin32 {

    public static final int VK_KHR_EXTERNAL_SEMAPHORE_WIN32_SPEC_VERSION = 1;

    public static final String VK_KHR_EXTERNAL_SEMAPHORE_WIN32_EXTENSION_NAME = "VK_KHR_external_semaphore_win32";

    public static final int
        VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR = 1000078000,
        VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR = 1000078001,
        VK_STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR            = 1000078002,
        VK_STRUCTURE_TYPE_SEMAPHORE_GET_WIN32_HANDLE_INFO_KHR    = 1000078003;

    protected KHRExternalSemaphoreWin32() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkImportSemaphoreWin32HandleKHR ] ---

    /** {@code VkResult vkImportSemaphoreWin32HandleKHR(VkDevice device, VkImportSemaphoreWin32HandleInfoKHR const * pImportSemaphoreWin32HandleInfo)} */
    public static int nvkImportSemaphoreWin32HandleKHR(VkDevice device, long pImportSemaphoreWin32HandleInfo) {
        long __functionAddress = device.getCapabilities().vkImportSemaphoreWin32HandleKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkImportSemaphoreWin32HandleInfoKHR.validate(pImportSemaphoreWin32HandleInfo);
        }
        return callPPI(device.address(), pImportSemaphoreWin32HandleInfo, __functionAddress);
    }

    /** {@code VkResult vkImportSemaphoreWin32HandleKHR(VkDevice device, VkImportSemaphoreWin32HandleInfoKHR const * pImportSemaphoreWin32HandleInfo)} */
    @NativeType("VkResult")
    public static int vkImportSemaphoreWin32HandleKHR(VkDevice device, @NativeType("VkImportSemaphoreWin32HandleInfoKHR const *") VkImportSemaphoreWin32HandleInfoKHR pImportSemaphoreWin32HandleInfo) {
        return nvkImportSemaphoreWin32HandleKHR(device, pImportSemaphoreWin32HandleInfo.address());
    }

    // --- [ vkGetSemaphoreWin32HandleKHR ] ---

    /** {@code VkResult vkGetSemaphoreWin32HandleKHR(VkDevice device, VkSemaphoreGetWin32HandleInfoKHR const * pGetWin32HandleInfo, HANDLE * pHandle)} */
    public static int nvkGetSemaphoreWin32HandleKHR(VkDevice device, long pGetWin32HandleInfo, long pHandle) {
        long __functionAddress = device.getCapabilities().vkGetSemaphoreWin32HandleKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pGetWin32HandleInfo, pHandle, __functionAddress);
    }

    /** {@code VkResult vkGetSemaphoreWin32HandleKHR(VkDevice device, VkSemaphoreGetWin32HandleInfoKHR const * pGetWin32HandleInfo, HANDLE * pHandle)} */
    @NativeType("VkResult")
    public static int vkGetSemaphoreWin32HandleKHR(VkDevice device, @NativeType("VkSemaphoreGetWin32HandleInfoKHR const *") VkSemaphoreGetWin32HandleInfoKHR pGetWin32HandleInfo, @NativeType("HANDLE *") PointerBuffer pHandle) {
        if (CHECKS) {
            check(pHandle, 1);
        }
        return nvkGetSemaphoreWin32HandleKHR(device, pGetWin32HandleInfo.address(), memAddress(pHandle));
    }

}