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

public class KHRExternalFenceWin32 {

    public static final int VK_KHR_EXTERNAL_FENCE_WIN32_SPEC_VERSION = 1;

    public static final String VK_KHR_EXTERNAL_FENCE_WIN32_EXTENSION_NAME = "VK_KHR_external_fence_win32";

    public static final int
        VK_STRUCTURE_TYPE_IMPORT_FENCE_WIN32_HANDLE_INFO_KHR = 1000114000,
        VK_STRUCTURE_TYPE_EXPORT_FENCE_WIN32_HANDLE_INFO_KHR = 1000114001,
        VK_STRUCTURE_TYPE_FENCE_GET_WIN32_HANDLE_INFO_KHR    = 1000114002;

    protected KHRExternalFenceWin32() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkImportFenceWin32HandleKHR ] ---

    /** {@code VkResult vkImportFenceWin32HandleKHR(VkDevice device, VkImportFenceWin32HandleInfoKHR const * pImportFenceWin32HandleInfo)} */
    public static int nvkImportFenceWin32HandleKHR(VkDevice device, long pImportFenceWin32HandleInfo) {
        long __functionAddress = device.getCapabilities().vkImportFenceWin32HandleKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkImportFenceWin32HandleInfoKHR.validate(pImportFenceWin32HandleInfo);
        }
        return callPPI(device.address(), pImportFenceWin32HandleInfo, __functionAddress);
    }

    /** {@code VkResult vkImportFenceWin32HandleKHR(VkDevice device, VkImportFenceWin32HandleInfoKHR const * pImportFenceWin32HandleInfo)} */
    @NativeType("VkResult")
    public static int vkImportFenceWin32HandleKHR(VkDevice device, @NativeType("VkImportFenceWin32HandleInfoKHR const *") VkImportFenceWin32HandleInfoKHR pImportFenceWin32HandleInfo) {
        return nvkImportFenceWin32HandleKHR(device, pImportFenceWin32HandleInfo.address());
    }

    // --- [ vkGetFenceWin32HandleKHR ] ---

    /** {@code VkResult vkGetFenceWin32HandleKHR(VkDevice device, VkFenceGetWin32HandleInfoKHR const * pGetWin32HandleInfo, HANDLE * pHandle)} */
    public static int nvkGetFenceWin32HandleKHR(VkDevice device, long pGetWin32HandleInfo, long pHandle) {
        long __functionAddress = device.getCapabilities().vkGetFenceWin32HandleKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pGetWin32HandleInfo, pHandle, __functionAddress);
    }

    /** {@code VkResult vkGetFenceWin32HandleKHR(VkDevice device, VkFenceGetWin32HandleInfoKHR const * pGetWin32HandleInfo, HANDLE * pHandle)} */
    @NativeType("VkResult")
    public static int vkGetFenceWin32HandleKHR(VkDevice device, @NativeType("VkFenceGetWin32HandleInfoKHR const *") VkFenceGetWin32HandleInfoKHR pGetWin32HandleInfo, @NativeType("HANDLE *") PointerBuffer pHandle) {
        if (CHECKS) {
            check(pHandle, 1);
        }
        return nvkGetFenceWin32HandleKHR(device, pGetWin32HandleInfo.address(), memAddress(pHandle));
    }

}