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

public class KHRExternalMemoryWin32 {

    public static final int VK_KHR_EXTERNAL_MEMORY_WIN32_SPEC_VERSION = 1;

    public static final String VK_KHR_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME = "VK_KHR_external_memory_win32";

    public static final int
        VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR = 1000073000,
        VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR = 1000073001,
        VK_STRUCTURE_TYPE_MEMORY_WIN32_HANDLE_PROPERTIES_KHR  = 1000073002,
        VK_STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR    = 1000073003;

    protected KHRExternalMemoryWin32() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetMemoryWin32HandleKHR ] ---

    /** {@code VkResult vkGetMemoryWin32HandleKHR(VkDevice device, VkMemoryGetWin32HandleInfoKHR const * pGetWin32HandleInfo, HANDLE * pHandle)} */
    public static int nvkGetMemoryWin32HandleKHR(VkDevice device, long pGetWin32HandleInfo, long pHandle) {
        long __functionAddress = device.getCapabilities().vkGetMemoryWin32HandleKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pGetWin32HandleInfo, pHandle, __functionAddress);
    }

    /** {@code VkResult vkGetMemoryWin32HandleKHR(VkDevice device, VkMemoryGetWin32HandleInfoKHR const * pGetWin32HandleInfo, HANDLE * pHandle)} */
    @NativeType("VkResult")
    public static int vkGetMemoryWin32HandleKHR(VkDevice device, @NativeType("VkMemoryGetWin32HandleInfoKHR const *") VkMemoryGetWin32HandleInfoKHR pGetWin32HandleInfo, @NativeType("HANDLE *") PointerBuffer pHandle) {
        if (CHECKS) {
            check(pHandle, 1);
        }
        return nvkGetMemoryWin32HandleKHR(device, pGetWin32HandleInfo.address(), memAddress(pHandle));
    }

    // --- [ vkGetMemoryWin32HandlePropertiesKHR ] ---

    /** {@code VkResult vkGetMemoryWin32HandlePropertiesKHR(VkDevice device, VkExternalMemoryHandleTypeFlagBits handleType, HANDLE handle, VkMemoryWin32HandlePropertiesKHR * pMemoryWin32HandleProperties)} */
    public static int nvkGetMemoryWin32HandlePropertiesKHR(VkDevice device, int handleType, long handle, long pMemoryWin32HandleProperties) {
        long __functionAddress = device.getCapabilities().vkGetMemoryWin32HandlePropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(handle);
        }
        return callPPPI(device.address(), handleType, handle, pMemoryWin32HandleProperties, __functionAddress);
    }

    /** {@code VkResult vkGetMemoryWin32HandlePropertiesKHR(VkDevice device, VkExternalMemoryHandleTypeFlagBits handleType, HANDLE handle, VkMemoryWin32HandlePropertiesKHR * pMemoryWin32HandleProperties)} */
    @NativeType("VkResult")
    public static int vkGetMemoryWin32HandlePropertiesKHR(VkDevice device, @NativeType("VkExternalMemoryHandleTypeFlagBits") int handleType, @NativeType("HANDLE") long handle, @NativeType("VkMemoryWin32HandlePropertiesKHR *") VkMemoryWin32HandlePropertiesKHR pMemoryWin32HandleProperties) {
        return nvkGetMemoryWin32HandlePropertiesKHR(device, handleType, handle, pMemoryWin32HandleProperties.address());
    }

}