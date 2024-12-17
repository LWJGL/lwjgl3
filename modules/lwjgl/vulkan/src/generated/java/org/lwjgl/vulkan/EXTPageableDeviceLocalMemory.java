/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTPageableDeviceLocalMemory {

    public static final int VK_EXT_PAGEABLE_DEVICE_LOCAL_MEMORY_SPEC_VERSION = 1;

    public static final String VK_EXT_PAGEABLE_DEVICE_LOCAL_MEMORY_EXTENSION_NAME = "VK_EXT_pageable_device_local_memory";

    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT = 1000412000;

    protected EXTPageableDeviceLocalMemory() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkSetDeviceMemoryPriorityEXT ] ---

    /** {@code void vkSetDeviceMemoryPriorityEXT(VkDevice device, VkDeviceMemory memory, float priority)} */
    public static void vkSetDeviceMemoryPriorityEXT(VkDevice device, @NativeType("VkDeviceMemory") long memory, float priority) {
        long __functionAddress = device.getCapabilities().vkSetDeviceMemoryPriorityEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(device.address(), memory, priority, __functionAddress);
    }

}