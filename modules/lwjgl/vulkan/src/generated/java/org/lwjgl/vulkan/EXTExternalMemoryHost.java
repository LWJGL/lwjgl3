/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTExternalMemoryHost {

    public static final int VK_EXT_EXTERNAL_MEMORY_HOST_SPEC_VERSION = 1;

    public static final String VK_EXT_EXTERNAL_MEMORY_HOST_EXTENSION_NAME = "VK_EXT_external_memory_host";

    public static final int
        VK_STRUCTURE_TYPE_IMPORT_MEMORY_HOST_POINTER_INFO_EXT                 = 1000178000,
        VK_STRUCTURE_TYPE_MEMORY_HOST_POINTER_PROPERTIES_EXT                  = 1000178001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_HOST_PROPERTIES_EXT = 1000178002;

    public static final int
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT            = 0x80,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT = 0x100;

    protected EXTExternalMemoryHost() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetMemoryHostPointerPropertiesEXT ] ---

    /** {@code VkResult vkGetMemoryHostPointerPropertiesEXT(VkDevice device, VkExternalMemoryHandleTypeFlagBits handleType, void const * pHostPointer, VkMemoryHostPointerPropertiesEXT * pMemoryHostPointerProperties)} */
    public static int nvkGetMemoryHostPointerPropertiesEXT(VkDevice device, int handleType, long pHostPointer, long pMemoryHostPointerProperties) {
        long __functionAddress = device.getCapabilities().vkGetMemoryHostPointerPropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pHostPointer);
        }
        return callPPPI(device.address(), handleType, pHostPointer, pMemoryHostPointerProperties, __functionAddress);
    }

    /** {@code VkResult vkGetMemoryHostPointerPropertiesEXT(VkDevice device, VkExternalMemoryHandleTypeFlagBits handleType, void const * pHostPointer, VkMemoryHostPointerPropertiesEXT * pMemoryHostPointerProperties)} */
    @NativeType("VkResult")
    public static int vkGetMemoryHostPointerPropertiesEXT(VkDevice device, @NativeType("VkExternalMemoryHandleTypeFlagBits") int handleType, @NativeType("void const *") long pHostPointer, @NativeType("VkMemoryHostPointerPropertiesEXT *") VkMemoryHostPointerPropertiesEXT pMemoryHostPointerProperties) {
        return nvkGetMemoryHostPointerPropertiesEXT(device, handleType, pHostPointer, pMemoryHostPointerProperties.address());
    }

}