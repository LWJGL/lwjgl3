/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class KHRGetDisplayProperties2 {

    public static final int VK_KHR_GET_DISPLAY_PROPERTIES_2_SPEC_VERSION = 1;

    public static final String VK_KHR_GET_DISPLAY_PROPERTIES_2_EXTENSION_NAME = "VK_KHR_get_display_properties2";

    public static final int
        VK_STRUCTURE_TYPE_DISPLAY_PROPERTIES_2_KHR         = 1000121000,
        VK_STRUCTURE_TYPE_DISPLAY_PLANE_PROPERTIES_2_KHR   = 1000121001,
        VK_STRUCTURE_TYPE_DISPLAY_MODE_PROPERTIES_2_KHR    = 1000121002,
        VK_STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR         = 1000121003,
        VK_STRUCTURE_TYPE_DISPLAY_PLANE_CAPABILITIES_2_KHR = 1000121004;

    protected KHRGetDisplayProperties2() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceDisplayProperties2KHR ] ---

    /** {@code VkResult vkGetPhysicalDeviceDisplayProperties2KHR(VkPhysicalDevice physicalDevice, uint32_t * pPropertyCount, VkDisplayProperties2KHR * pProperties)} */
    public static int nvkGetPhysicalDeviceDisplayProperties2KHR(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDisplayProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pPropertyCount, pProperties, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceDisplayProperties2KHR(VkPhysicalDevice physicalDevice, uint32_t * pPropertyCount, VkDisplayProperties2KHR * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkDisplayProperties2KHR *") VkDisplayProperties2KHR.@Nullable Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceDisplayProperties2KHR(physicalDevice, memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    // --- [ vkGetPhysicalDeviceDisplayPlaneProperties2KHR ] ---

    /** {@code VkResult vkGetPhysicalDeviceDisplayPlaneProperties2KHR(VkPhysicalDevice physicalDevice, uint32_t * pPropertyCount, VkDisplayPlaneProperties2KHR * pProperties)} */
    public static int nvkGetPhysicalDeviceDisplayPlaneProperties2KHR(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDisplayPlaneProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pPropertyCount, pProperties, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceDisplayPlaneProperties2KHR(VkPhysicalDevice physicalDevice, uint32_t * pPropertyCount, VkDisplayPlaneProperties2KHR * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayPlaneProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkDisplayPlaneProperties2KHR *") VkDisplayPlaneProperties2KHR.@Nullable Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceDisplayPlaneProperties2KHR(physicalDevice, memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    // --- [ vkGetDisplayModeProperties2KHR ] ---

    /** {@code VkResult vkGetDisplayModeProperties2KHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, uint32_t * pPropertyCount, VkDisplayModeProperties2KHR * pProperties)} */
    public static int nvkGetDisplayModeProperties2KHR(VkPhysicalDevice physicalDevice, long display, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDisplayModeProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(physicalDevice.address(), display, pPropertyCount, pProperties, __functionAddress);
    }

    /** {@code VkResult vkGetDisplayModeProperties2KHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, uint32_t * pPropertyCount, VkDisplayModeProperties2KHR * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetDisplayModeProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayKHR") long display, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkDisplayModeProperties2KHR *") VkDisplayModeProperties2KHR.@Nullable Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetDisplayModeProperties2KHR(physicalDevice, display, memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    // --- [ vkGetDisplayPlaneCapabilities2KHR ] ---

    /** {@code VkResult vkGetDisplayPlaneCapabilities2KHR(VkPhysicalDevice physicalDevice, VkDisplayPlaneInfo2KHR const * pDisplayPlaneInfo, VkDisplayPlaneCapabilities2KHR * pCapabilities)} */
    public static int nvkGetDisplayPlaneCapabilities2KHR(VkPhysicalDevice physicalDevice, long pDisplayPlaneInfo, long pCapabilities) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDisplayPlaneCapabilities2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pDisplayPlaneInfo, pCapabilities, __functionAddress);
    }

    /** {@code VkResult vkGetDisplayPlaneCapabilities2KHR(VkPhysicalDevice physicalDevice, VkDisplayPlaneInfo2KHR const * pDisplayPlaneInfo, VkDisplayPlaneCapabilities2KHR * pCapabilities)} */
    @NativeType("VkResult")
    public static int vkGetDisplayPlaneCapabilities2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayPlaneInfo2KHR const *") VkDisplayPlaneInfo2KHR pDisplayPlaneInfo, @NativeType("VkDisplayPlaneCapabilities2KHR *") VkDisplayPlaneCapabilities2KHR pCapabilities) {
        return nvkGetDisplayPlaneCapabilities2KHR(physicalDevice, pDisplayPlaneInfo.address(), pCapabilities.address());
    }

    /** {@code VkResult vkGetPhysicalDeviceDisplayProperties2KHR(VkPhysicalDevice physicalDevice, uint32_t * pPropertyCount, VkDisplayProperties2KHR * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkDisplayProperties2KHR *") VkDisplayProperties2KHR.@Nullable Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDisplayProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        return callPPPI(physicalDevice.address(), pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceDisplayPlaneProperties2KHR(VkPhysicalDevice physicalDevice, uint32_t * pPropertyCount, VkDisplayPlaneProperties2KHR * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayPlaneProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkDisplayPlaneProperties2KHR *") VkDisplayPlaneProperties2KHR.@Nullable Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDisplayPlaneProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        return callPPPI(physicalDevice.address(), pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

    /** {@code VkResult vkGetDisplayModeProperties2KHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, uint32_t * pPropertyCount, VkDisplayModeProperties2KHR * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetDisplayModeProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayKHR") long display, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkDisplayModeProperties2KHR *") VkDisplayModeProperties2KHR.@Nullable Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDisplayModeProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        return callPJPPI(physicalDevice.address(), display, pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

}