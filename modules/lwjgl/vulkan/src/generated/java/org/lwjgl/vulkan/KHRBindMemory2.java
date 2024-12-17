/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRBindMemory2 {

    public static final int VK_KHR_BIND_MEMORY_2_SPEC_VERSION = 1;

    public static final String VK_KHR_BIND_MEMORY_2_EXTENSION_NAME = "VK_KHR_bind_memory2";

    public static final int
        VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO_KHR = 1000157000,
        VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO_KHR  = 1000157001;

    public static final int VK_IMAGE_CREATE_ALIAS_BIT_KHR = 0x400;

    protected KHRBindMemory2() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkBindBufferMemory2KHR ] ---

    /** {@code VkResult vkBindBufferMemory2KHR(VkDevice device, uint32_t bindInfoCount, VkBindBufferMemoryInfo const * pBindInfos)} */
    public static int nvkBindBufferMemory2KHR(VkDevice device, int bindInfoCount, long pBindInfos) {
        long __functionAddress = device.getCapabilities().vkBindBufferMemory2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), bindInfoCount, pBindInfos, __functionAddress);
    }

    /** {@code VkResult vkBindBufferMemory2KHR(VkDevice device, uint32_t bindInfoCount, VkBindBufferMemoryInfo const * pBindInfos)} */
    @NativeType("VkResult")
    public static int vkBindBufferMemory2KHR(VkDevice device, @NativeType("VkBindBufferMemoryInfo const *") VkBindBufferMemoryInfo.Buffer pBindInfos) {
        return nvkBindBufferMemory2KHR(device, pBindInfos.remaining(), pBindInfos.address());
    }

    // --- [ vkBindImageMemory2KHR ] ---

    /** {@code VkResult vkBindImageMemory2KHR(VkDevice device, uint32_t bindInfoCount, VkBindImageMemoryInfo const * pBindInfos)} */
    public static int nvkBindImageMemory2KHR(VkDevice device, int bindInfoCount, long pBindInfos) {
        long __functionAddress = device.getCapabilities().vkBindImageMemory2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), bindInfoCount, pBindInfos, __functionAddress);
    }

    /** {@code VkResult vkBindImageMemory2KHR(VkDevice device, uint32_t bindInfoCount, VkBindImageMemoryInfo const * pBindInfos)} */
    @NativeType("VkResult")
    public static int vkBindImageMemory2KHR(VkDevice device, @NativeType("VkBindImageMemoryInfo const *") VkBindImageMemoryInfo.Buffer pBindInfos) {
        return nvkBindImageMemory2KHR(device, pBindInfos.remaining(), pBindInfos.address());
    }

}