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

public class ANDROIDExternalMemoryAndroidHardwareBuffer {

    public static final int VK_ANDROID_EXTERNAL_MEMORY_ANDROID_HARDWARE_BUFFER_SPEC_VERSION = 5;

    public static final String VK_ANDROID_EXTERNAL_MEMORY_ANDROID_HARDWARE_BUFFER_EXTENSION_NAME = "VK_ANDROID_external_memory_android_hardware_buffer";

    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID = 0x400;

    public static final int
        VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_USAGE_ANDROID               = 1000129000,
        VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID          = 1000129001,
        VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID   = 1000129002,
        VK_STRUCTURE_TYPE_IMPORT_ANDROID_HARDWARE_BUFFER_INFO_ANDROID         = 1000129003,
        VK_STRUCTURE_TYPE_MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO_ANDROID     = 1000129004,
        VK_STRUCTURE_TYPE_EXTERNAL_FORMAT_ANDROID                             = 1000129005,
        VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_2_ANDROID = 1000129006;

    protected ANDROIDExternalMemoryAndroidHardwareBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetAndroidHardwareBufferPropertiesANDROID ] ---

    /** {@code VkResult vkGetAndroidHardwareBufferPropertiesANDROID(VkDevice device, AHardwareBuffer const * buffer, VkAndroidHardwareBufferPropertiesANDROID * pProperties)} */
    public static int nvkGetAndroidHardwareBufferPropertiesANDROID(VkDevice device, long buffer, long pProperties) {
        long __functionAddress = device.getCapabilities().vkGetAndroidHardwareBufferPropertiesANDROID;
        if (CHECKS) {
            check(__functionAddress);
            check(buffer);
        }
        return callPPPI(device.address(), buffer, pProperties, __functionAddress);
    }

    /** {@code VkResult vkGetAndroidHardwareBufferPropertiesANDROID(VkDevice device, AHardwareBuffer const * buffer, VkAndroidHardwareBufferPropertiesANDROID * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetAndroidHardwareBufferPropertiesANDROID(VkDevice device, @NativeType("AHardwareBuffer const *") long buffer, @NativeType("VkAndroidHardwareBufferPropertiesANDROID *") VkAndroidHardwareBufferPropertiesANDROID pProperties) {
        return nvkGetAndroidHardwareBufferPropertiesANDROID(device, buffer, pProperties.address());
    }

    // --- [ vkGetMemoryAndroidHardwareBufferANDROID ] ---

    /** {@code VkResult vkGetMemoryAndroidHardwareBufferANDROID(VkDevice device, VkMemoryGetAndroidHardwareBufferInfoANDROID const * pInfo, AHardwareBuffer ** pBuffer)} */
    public static int nvkGetMemoryAndroidHardwareBufferANDROID(VkDevice device, long pInfo, long pBuffer) {
        long __functionAddress = device.getCapabilities().vkGetMemoryAndroidHardwareBufferANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pInfo, pBuffer, __functionAddress);
    }

    /** {@code VkResult vkGetMemoryAndroidHardwareBufferANDROID(VkDevice device, VkMemoryGetAndroidHardwareBufferInfoANDROID const * pInfo, AHardwareBuffer ** pBuffer)} */
    @NativeType("VkResult")
    public static int vkGetMemoryAndroidHardwareBufferANDROID(VkDevice device, @NativeType("VkMemoryGetAndroidHardwareBufferInfoANDROID const *") VkMemoryGetAndroidHardwareBufferInfoANDROID pInfo, @NativeType("AHardwareBuffer **") PointerBuffer pBuffer) {
        if (CHECKS) {
            check(pBuffer, 1);
        }
        return nvkGetMemoryAndroidHardwareBufferANDROID(device, pInfo.address(), memAddress(pBuffer));
    }

}