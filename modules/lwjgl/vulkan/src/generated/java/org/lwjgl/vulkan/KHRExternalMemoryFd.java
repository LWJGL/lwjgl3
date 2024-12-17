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

public class KHRExternalMemoryFd {

    public static final int VK_KHR_EXTERNAL_MEMORY_FD_SPEC_VERSION = 1;

    public static final String VK_KHR_EXTERNAL_MEMORY_FD_EXTENSION_NAME = "VK_KHR_external_memory_fd";

    public static final int
        VK_STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR = 1000074000,
        VK_STRUCTURE_TYPE_MEMORY_FD_PROPERTIES_KHR  = 1000074001,
        VK_STRUCTURE_TYPE_MEMORY_GET_FD_INFO_KHR    = 1000074002;

    protected KHRExternalMemoryFd() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetMemoryFdKHR ] ---

    /** {@code VkResult vkGetMemoryFdKHR(VkDevice device, VkMemoryGetFdInfoKHR const * pGetFdInfo, int * pFd)} */
    public static int nvkGetMemoryFdKHR(VkDevice device, long pGetFdInfo, long pFd) {
        long __functionAddress = device.getCapabilities().vkGetMemoryFdKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pGetFdInfo, pFd, __functionAddress);
    }

    /** {@code VkResult vkGetMemoryFdKHR(VkDevice device, VkMemoryGetFdInfoKHR const * pGetFdInfo, int * pFd)} */
    @NativeType("VkResult")
    public static int vkGetMemoryFdKHR(VkDevice device, @NativeType("VkMemoryGetFdInfoKHR const *") VkMemoryGetFdInfoKHR pGetFdInfo, @NativeType("int *") IntBuffer pFd) {
        if (CHECKS) {
            check(pFd, 1);
        }
        return nvkGetMemoryFdKHR(device, pGetFdInfo.address(), memAddress(pFd));
    }

    // --- [ vkGetMemoryFdPropertiesKHR ] ---

    /** {@code VkResult vkGetMemoryFdPropertiesKHR(VkDevice device, VkExternalMemoryHandleTypeFlagBits handleType, int fd, VkMemoryFdPropertiesKHR * pMemoryFdProperties)} */
    public static int nvkGetMemoryFdPropertiesKHR(VkDevice device, int handleType, int fd, long pMemoryFdProperties) {
        long __functionAddress = device.getCapabilities().vkGetMemoryFdPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), handleType, fd, pMemoryFdProperties, __functionAddress);
    }

    /** {@code VkResult vkGetMemoryFdPropertiesKHR(VkDevice device, VkExternalMemoryHandleTypeFlagBits handleType, int fd, VkMemoryFdPropertiesKHR * pMemoryFdProperties)} */
    @NativeType("VkResult")
    public static int vkGetMemoryFdPropertiesKHR(VkDevice device, @NativeType("VkExternalMemoryHandleTypeFlagBits") int handleType, int fd, @NativeType("VkMemoryFdPropertiesKHR *") VkMemoryFdPropertiesKHR pMemoryFdProperties) {
        return nvkGetMemoryFdPropertiesKHR(device, handleType, fd, pMemoryFdProperties.address());
    }

    /** {@code VkResult vkGetMemoryFdKHR(VkDevice device, VkMemoryGetFdInfoKHR const * pGetFdInfo, int * pFd)} */
    @NativeType("VkResult")
    public static int vkGetMemoryFdKHR(VkDevice device, @NativeType("VkMemoryGetFdInfoKHR const *") VkMemoryGetFdInfoKHR pGetFdInfo, @NativeType("int *") int[] pFd) {
        long __functionAddress = device.getCapabilities().vkGetMemoryFdKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pFd, 1);
        }
        return callPPPI(device.address(), pGetFdInfo.address(), pFd, __functionAddress);
    }

}