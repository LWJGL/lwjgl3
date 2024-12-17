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

public class KHRMapMemory2 {

    public static final int VK_KHR_MAP_MEMORY_2_SPEC_VERSION = 1;

    public static final String VK_KHR_MAP_MEMORY_2_EXTENSION_NAME = "VK_KHR_map_memory2";

    public static final int
        VK_STRUCTURE_TYPE_MEMORY_MAP_INFO_KHR   = 1000271000,
        VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO_KHR = 1000271001;

    protected KHRMapMemory2() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkMapMemory2KHR ] ---

    /** {@code VkResult vkMapMemory2KHR(VkDevice device, VkMemoryMapInfo const * pMemoryMapInfo, void ** ppData)} */
    public static int nvkMapMemory2KHR(VkDevice device, long pMemoryMapInfo, long ppData) {
        long __functionAddress = device.getCapabilities().vkMapMemory2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pMemoryMapInfo, ppData, __functionAddress);
    }

    /** {@code VkResult vkMapMemory2KHR(VkDevice device, VkMemoryMapInfo const * pMemoryMapInfo, void ** ppData)} */
    @NativeType("VkResult")
    public static int vkMapMemory2KHR(VkDevice device, @NativeType("VkMemoryMapInfo const *") VkMemoryMapInfo pMemoryMapInfo, @NativeType("void **") PointerBuffer ppData) {
        if (CHECKS) {
            check(ppData, 1);
        }
        return nvkMapMemory2KHR(device, pMemoryMapInfo.address(), memAddress(ppData));
    }

    // --- [ vkUnmapMemory2KHR ] ---

    /** {@code VkResult vkUnmapMemory2KHR(VkDevice device, VkMemoryUnmapInfo const * pMemoryUnmapInfo)} */
    public static int nvkUnmapMemory2KHR(VkDevice device, long pMemoryUnmapInfo) {
        long __functionAddress = device.getCapabilities().vkUnmapMemory2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pMemoryUnmapInfo, __functionAddress);
    }

    /** {@code VkResult vkUnmapMemory2KHR(VkDevice device, VkMemoryUnmapInfo const * pMemoryUnmapInfo)} */
    @NativeType("VkResult")
    public static int vkUnmapMemory2KHR(VkDevice device, @NativeType("VkMemoryUnmapInfo const *") VkMemoryUnmapInfo pMemoryUnmapInfo) {
        return nvkUnmapMemory2KHR(device, pMemoryUnmapInfo.address());
    }

}