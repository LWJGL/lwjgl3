/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTDisplaySurfaceCounter {

    public static final int VK_EXT_DISPLAY_SURFACE_COUNTER_SPEC_VERSION = 1;

    public static final String VK_EXT_DISPLAY_SURFACE_COUNTER_EXTENSION_NAME = "VK_EXT_display_surface_counter";

    public static final int
        VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT = 1000090000,
        VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES2_EXT  = 1000090000;

    public static final int
        VK_SURFACE_COUNTER_VBLANK_BIT_EXT = 0x1,
        VK_SURFACE_COUNTER_VBLANK_EXT     = 0x1;

    protected EXTDisplaySurfaceCounter() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceSurfaceCapabilities2EXT ] ---

    /** {@code VkResult vkGetPhysicalDeviceSurfaceCapabilities2EXT(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkSurfaceCapabilities2EXT * pSurfaceCapabilities)} */
    public static int nvkGetPhysicalDeviceSurfaceCapabilities2EXT(VkPhysicalDevice physicalDevice, long surface, long pSurfaceCapabilities) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceCapabilities2EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(physicalDevice.address(), surface, pSurfaceCapabilities, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceSurfaceCapabilities2EXT(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkSurfaceCapabilities2EXT * pSurfaceCapabilities)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfaceCapabilities2EXT(VkPhysicalDevice physicalDevice, @NativeType("VkSurfaceKHR") long surface, @NativeType("VkSurfaceCapabilities2EXT *") VkSurfaceCapabilities2EXT pSurfaceCapabilities) {
        return nvkGetPhysicalDeviceSurfaceCapabilities2EXT(physicalDevice, surface, pSurfaceCapabilities.address());
    }

}