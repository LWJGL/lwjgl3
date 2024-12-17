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

public class KHRGetSurfaceCapabilities2 {

    public static final int VK_KHR_GET_SURFACE_CAPABILITIES_2_SPEC_VERSION = 1;

    public static final String VK_KHR_GET_SURFACE_CAPABILITIES_2_EXTENSION_NAME = "VK_KHR_get_surface_capabilities2";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR = 1000119000,
        VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR         = 1000119001,
        VK_STRUCTURE_TYPE_SURFACE_FORMAT_2_KHR               = 1000119002;

    protected KHRGetSurfaceCapabilities2() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceSurfaceCapabilities2KHR ] ---

    /** {@code VkResult vkGetPhysicalDeviceSurfaceCapabilities2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR const * pSurfaceInfo, VkSurfaceCapabilities2KHR * pSurfaceCapabilities)} */
    public static int nvkGetPhysicalDeviceSurfaceCapabilities2KHR(VkPhysicalDevice physicalDevice, long pSurfaceInfo, long pSurfaceCapabilities) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceCapabilities2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pSurfaceInfo, pSurfaceCapabilities, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceSurfaceCapabilities2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR const * pSurfaceInfo, VkSurfaceCapabilities2KHR * pSurfaceCapabilities)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfaceCapabilities2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceSurfaceInfo2KHR const *") VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, @NativeType("VkSurfaceCapabilities2KHR *") VkSurfaceCapabilities2KHR pSurfaceCapabilities) {
        return nvkGetPhysicalDeviceSurfaceCapabilities2KHR(physicalDevice, pSurfaceInfo.address(), pSurfaceCapabilities.address());
    }

    // --- [ vkGetPhysicalDeviceSurfaceFormats2KHR ] ---

    /** {@code VkResult vkGetPhysicalDeviceSurfaceFormats2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR const * pSurfaceInfo, uint32_t * pSurfaceFormatCount, VkSurfaceFormat2KHR * pSurfaceFormats)} */
    public static int nvkGetPhysicalDeviceSurfaceFormats2KHR(VkPhysicalDevice physicalDevice, long pSurfaceInfo, long pSurfaceFormatCount, long pSurfaceFormats) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceFormats2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(physicalDevice.address(), pSurfaceInfo, pSurfaceFormatCount, pSurfaceFormats, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceSurfaceFormats2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR const * pSurfaceInfo, uint32_t * pSurfaceFormatCount, VkSurfaceFormat2KHR * pSurfaceFormats)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfaceFormats2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceSurfaceInfo2KHR const *") VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, @NativeType("uint32_t *") IntBuffer pSurfaceFormatCount, @NativeType("VkSurfaceFormat2KHR *") VkSurfaceFormat2KHR.@Nullable Buffer pSurfaceFormats) {
        if (CHECKS) {
            check(pSurfaceFormatCount, 1);
            checkSafe(pSurfaceFormats, pSurfaceFormatCount.get(pSurfaceFormatCount.position()));
        }
        return nvkGetPhysicalDeviceSurfaceFormats2KHR(physicalDevice, pSurfaceInfo.address(), memAddress(pSurfaceFormatCount), memAddressSafe(pSurfaceFormats));
    }

    /** {@code VkResult vkGetPhysicalDeviceSurfaceFormats2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR const * pSurfaceInfo, uint32_t * pSurfaceFormatCount, VkSurfaceFormat2KHR * pSurfaceFormats)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfaceFormats2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceSurfaceInfo2KHR const *") VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, @NativeType("uint32_t *") int[] pSurfaceFormatCount, @NativeType("VkSurfaceFormat2KHR *") VkSurfaceFormat2KHR.@Nullable Buffer pSurfaceFormats) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceFormats2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pSurfaceFormatCount, 1);
            checkSafe(pSurfaceFormats, pSurfaceFormatCount[0]);
        }
        return callPPPPI(physicalDevice.address(), pSurfaceInfo.address(), pSurfaceFormatCount, memAddressSafe(pSurfaceFormats), __functionAddress);
    }

}