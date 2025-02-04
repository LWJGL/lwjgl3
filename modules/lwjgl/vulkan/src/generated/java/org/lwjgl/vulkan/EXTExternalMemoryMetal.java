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

public class EXTExternalMemoryMetal {

    public static final int VK_EXT_EXTERNAL_MEMORY_METAL_SPEC_VERSION = 1;

    public static final String VK_EXT_EXTERNAL_MEMORY_METAL_EXTENSION_NAME = "VK_EXT_external_memory_metal";

    public static final int
        VK_STRUCTURE_TYPE_IMPORT_MEMORY_METAL_HANDLE_INFO_EXT = 1000602000,
        VK_STRUCTURE_TYPE_MEMORY_METAL_HANDLE_PROPERTIES_EXT  = 1000602001,
        VK_STRUCTURE_TYPE_MEMORY_GET_METAL_HANDLE_INFO_EXT    = 1000602002;

    public static final int
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_MTLBUFFER_BIT_EXT  = 0x10000,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_MTLTEXTURE_BIT_EXT = 0x20000,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_MTLHEAP_BIT_EXT    = 0x40000;

    protected EXTExternalMemoryMetal() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetMemoryMetalHandleEXT ] ---

    /** {@code VkResult vkGetMemoryMetalHandleEXT(VkDevice device, VkMemoryGetMetalHandleInfoEXT const * pGetMetalHandleInfo, void ** pHandle)} */
    public static int nvkGetMemoryMetalHandleEXT(VkDevice device, long pGetMetalHandleInfo, long pHandle) {
        long __functionAddress = device.getCapabilities().vkGetMemoryMetalHandleEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pGetMetalHandleInfo, pHandle, __functionAddress);
    }

    /** {@code VkResult vkGetMemoryMetalHandleEXT(VkDevice device, VkMemoryGetMetalHandleInfoEXT const * pGetMetalHandleInfo, void ** pHandle)} */
    @NativeType("VkResult")
    public static int vkGetMemoryMetalHandleEXT(VkDevice device, @NativeType("VkMemoryGetMetalHandleInfoEXT const *") VkMemoryGetMetalHandleInfoEXT pGetMetalHandleInfo, @NativeType("void **") PointerBuffer pHandle) {
        if (CHECKS) {
            check(pHandle, 1);
        }
        return nvkGetMemoryMetalHandleEXT(device, pGetMetalHandleInfo.address(), memAddress(pHandle));
    }

    // --- [ vkGetMemoryMetalHandlePropertiesEXT ] ---

    /** {@code VkResult vkGetMemoryMetalHandlePropertiesEXT(VkDevice device, VkExternalMemoryHandleTypeFlagBits handleType, void const * pHandle, VkMemoryMetalHandlePropertiesEXT * pMemoryMetalHandleProperties)} */
    public static int nvkGetMemoryMetalHandlePropertiesEXT(VkDevice device, int handleType, long pHandle, long pMemoryMetalHandleProperties) {
        long __functionAddress = device.getCapabilities().vkGetMemoryMetalHandlePropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pHandle);
        }
        return callPPPI(device.address(), handleType, pHandle, pMemoryMetalHandleProperties, __functionAddress);
    }

    /** {@code VkResult vkGetMemoryMetalHandlePropertiesEXT(VkDevice device, VkExternalMemoryHandleTypeFlagBits handleType, void const * pHandle, VkMemoryMetalHandlePropertiesEXT * pMemoryMetalHandleProperties)} */
    @NativeType("VkResult")
    public static int vkGetMemoryMetalHandlePropertiesEXT(VkDevice device, @NativeType("VkExternalMemoryHandleTypeFlagBits") int handleType, @NativeType("void const *") long pHandle, @NativeType("VkMemoryMetalHandlePropertiesEXT *") VkMemoryMetalHandlePropertiesEXT pMemoryMetalHandleProperties) {
        return nvkGetMemoryMetalHandlePropertiesEXT(device, handleType, pHandle, pMemoryMetalHandleProperties.address());
    }

}