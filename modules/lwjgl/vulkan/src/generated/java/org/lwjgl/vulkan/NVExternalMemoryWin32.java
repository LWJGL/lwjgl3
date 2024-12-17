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

public class NVExternalMemoryWin32 {

    public static final int VK_NV_EXTERNAL_MEMORY_WIN32_SPEC_VERSION = 1;

    public static final String VK_NV_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME = "VK_NV_external_memory_win32";

    public static final int
        VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV = 1000057000,
        VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV = 1000057001;

    protected NVExternalMemoryWin32() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetMemoryWin32HandleNV ] ---

    /** {@code VkResult vkGetMemoryWin32HandleNV(VkDevice device, VkDeviceMemory memory, VkExternalMemoryHandleTypeFlagsNV handleType, HANDLE * pHandle)} */
    public static int nvkGetMemoryWin32HandleNV(VkDevice device, long memory, int handleType, long pHandle) {
        long __functionAddress = device.getCapabilities().vkGetMemoryWin32HandleNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), memory, handleType, pHandle, __functionAddress);
    }

    /** {@code VkResult vkGetMemoryWin32HandleNV(VkDevice device, VkDeviceMemory memory, VkExternalMemoryHandleTypeFlagsNV handleType, HANDLE * pHandle)} */
    @NativeType("VkResult")
    public static int vkGetMemoryWin32HandleNV(VkDevice device, @NativeType("VkDeviceMemory") long memory, @NativeType("VkExternalMemoryHandleTypeFlagsNV") int handleType, @NativeType("HANDLE *") PointerBuffer pHandle) {
        if (CHECKS) {
            check(pHandle, 1);
        }
        return nvkGetMemoryWin32HandleNV(device, memory, handleType, memAddress(pHandle));
    }

}