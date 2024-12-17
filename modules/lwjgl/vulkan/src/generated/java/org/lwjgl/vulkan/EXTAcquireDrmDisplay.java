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

public class EXTAcquireDrmDisplay {

    public static final int VK_EXT_ACQUIRE_DRM_DISPLAY_SPEC_VERSION = 1;

    public static final String VK_EXT_ACQUIRE_DRM_DISPLAY_EXTENSION_NAME = "VK_EXT_acquire_drm_display";

    protected EXTAcquireDrmDisplay() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkAcquireDrmDisplayEXT ] ---

    /** {@code VkResult vkAcquireDrmDisplayEXT(VkPhysicalDevice physicalDevice, int32_t drmFd, VkDisplayKHR display)} */
    @NativeType("VkResult")
    public static int vkAcquireDrmDisplayEXT(VkPhysicalDevice physicalDevice, @NativeType("int32_t") int drmFd, @NativeType("VkDisplayKHR") long display) {
        long __functionAddress = physicalDevice.getCapabilities().vkAcquireDrmDisplayEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(physicalDevice.address(), drmFd, display, __functionAddress);
    }

    // --- [ vkGetDrmDisplayEXT ] ---

    /** {@code VkResult vkGetDrmDisplayEXT(VkPhysicalDevice physicalDevice, int32_t drmFd, uint32_t connectorId, VkDisplayKHR * display)} */
    public static int nvkGetDrmDisplayEXT(VkPhysicalDevice physicalDevice, int drmFd, int connectorId, long display) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDrmDisplayEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(physicalDevice.address(), drmFd, connectorId, display, __functionAddress);
    }

    /** {@code VkResult vkGetDrmDisplayEXT(VkPhysicalDevice physicalDevice, int32_t drmFd, uint32_t connectorId, VkDisplayKHR * display)} */
    @NativeType("VkResult")
    public static int vkGetDrmDisplayEXT(VkPhysicalDevice physicalDevice, @NativeType("int32_t") int drmFd, @NativeType("uint32_t") int connectorId, @NativeType("VkDisplayKHR *") LongBuffer display) {
        if (CHECKS) {
            check(display, 1);
        }
        return nvkGetDrmDisplayEXT(physicalDevice, drmFd, connectorId, memAddress(display));
    }

    /** {@code VkResult vkGetDrmDisplayEXT(VkPhysicalDevice physicalDevice, int32_t drmFd, uint32_t connectorId, VkDisplayKHR * display)} */
    @NativeType("VkResult")
    public static int vkGetDrmDisplayEXT(VkPhysicalDevice physicalDevice, @NativeType("int32_t") int drmFd, @NativeType("uint32_t") int connectorId, @NativeType("VkDisplayKHR *") long[] display) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDrmDisplayEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(display, 1);
        }
        return callPPI(physicalDevice.address(), drmFd, connectorId, display, __functionAddress);
    }

}