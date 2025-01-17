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

public class EXTFullScreenExclusive {

    public static final int VK_EXT_FULL_SCREEN_EXCLUSIVE_SPEC_VERSION = 4;

    public static final String VK_EXT_FULL_SCREEN_EXCLUSIVE_EXTENSION_NAME = "VK_EXT_full_screen_exclusive";

    public static final int
        VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_INFO_EXT         = 1000255000,
        VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO_EXT   = 1000255001,
        VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_FULL_SCREEN_EXCLUSIVE_EXT = 1000255002;

    public static final int VK_ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT = -1000255000;

    public static final int
        VK_FULL_SCREEN_EXCLUSIVE_DEFAULT_EXT                = 0,
        VK_FULL_SCREEN_EXCLUSIVE_ALLOWED_EXT                = 1,
        VK_FULL_SCREEN_EXCLUSIVE_DISALLOWED_EXT             = 2,
        VK_FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT = 3;

    protected EXTFullScreenExclusive() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceSurfacePresentModes2EXT ] ---

    /** {@code VkResult vkGetPhysicalDeviceSurfacePresentModes2EXT(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR const * pSurfaceInfo, uint32_t * pPresentModeCount, VkPresentModeKHR * pPresentModes)} */
    public static int nvkGetPhysicalDeviceSurfacePresentModes2EXT(VkPhysicalDevice physicalDevice, long pSurfaceInfo, long pPresentModeCount, long pPresentModes) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfacePresentModes2EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(physicalDevice.address(), pSurfaceInfo, pPresentModeCount, pPresentModes, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceSurfacePresentModes2EXT(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR const * pSurfaceInfo, uint32_t * pPresentModeCount, VkPresentModeKHR * pPresentModes)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfacePresentModes2EXT(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceSurfaceInfo2KHR const *") VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, @NativeType("uint32_t *") IntBuffer pPresentModeCount, @NativeType("VkPresentModeKHR *") @Nullable IntBuffer pPresentModes) {
        if (CHECKS) {
            check(pPresentModeCount, 1);
            checkSafe(pPresentModes, pPresentModeCount.get(pPresentModeCount.position()));
        }
        return nvkGetPhysicalDeviceSurfacePresentModes2EXT(physicalDevice, pSurfaceInfo.address(), memAddress(pPresentModeCount), memAddressSafe(pPresentModes));
    }

    // --- [ vkAcquireFullScreenExclusiveModeEXT ] ---

    /** {@code VkResult vkAcquireFullScreenExclusiveModeEXT(VkDevice device, VkSwapchainKHR swapchain)} */
    @NativeType("VkResult")
    public static int vkAcquireFullScreenExclusiveModeEXT(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain) {
        long __functionAddress = device.getCapabilities().vkAcquireFullScreenExclusiveModeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(device.address(), swapchain, __functionAddress);
    }

    // --- [ vkReleaseFullScreenExclusiveModeEXT ] ---

    /** {@code VkResult vkReleaseFullScreenExclusiveModeEXT(VkDevice device, VkSwapchainKHR swapchain)} */
    @NativeType("VkResult")
    public static int vkReleaseFullScreenExclusiveModeEXT(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain) {
        long __functionAddress = device.getCapabilities().vkReleaseFullScreenExclusiveModeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(device.address(), swapchain, __functionAddress);
    }

    // --- [ vkGetDeviceGroupSurfacePresentModes2EXT ] ---

    /** {@code VkResult vkGetDeviceGroupSurfacePresentModes2EXT(VkDevice device, VkPhysicalDeviceSurfaceInfo2KHR const * pSurfaceInfo, VkDeviceGroupPresentModeFlagsKHR * pModes)} */
    public static int nvkGetDeviceGroupSurfacePresentModes2EXT(VkDevice device, long pSurfaceInfo, long pModes) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupSurfacePresentModes2EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pSurfaceInfo, pModes, __functionAddress);
    }

    /** {@code VkResult vkGetDeviceGroupSurfacePresentModes2EXT(VkDevice device, VkPhysicalDeviceSurfaceInfo2KHR const * pSurfaceInfo, VkDeviceGroupPresentModeFlagsKHR * pModes)} */
    @NativeType("VkResult")
    public static int vkGetDeviceGroupSurfacePresentModes2EXT(VkDevice device, @NativeType("VkPhysicalDeviceSurfaceInfo2KHR const *") VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, @NativeType("VkDeviceGroupPresentModeFlagsKHR *") IntBuffer pModes) {
        if (CHECKS) {
            check(pModes, 1);
        }
        return nvkGetDeviceGroupSurfacePresentModes2EXT(device, pSurfaceInfo.address(), memAddress(pModes));
    }

    /** {@code VkResult vkGetPhysicalDeviceSurfacePresentModes2EXT(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSurfaceInfo2KHR const * pSurfaceInfo, uint32_t * pPresentModeCount, VkPresentModeKHR * pPresentModes)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfacePresentModes2EXT(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceSurfaceInfo2KHR const *") VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, @NativeType("uint32_t *") int[] pPresentModeCount, @NativeType("VkPresentModeKHR *") int @Nullable [] pPresentModes) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfacePresentModes2EXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pPresentModeCount, 1);
            checkSafe(pPresentModes, pPresentModeCount[0]);
        }
        return callPPPPI(physicalDevice.address(), pSurfaceInfo.address(), pPresentModeCount, pPresentModes, __functionAddress);
    }

    /** {@code VkResult vkGetDeviceGroupSurfacePresentModes2EXT(VkDevice device, VkPhysicalDeviceSurfaceInfo2KHR const * pSurfaceInfo, VkDeviceGroupPresentModeFlagsKHR * pModes)} */
    @NativeType("VkResult")
    public static int vkGetDeviceGroupSurfacePresentModes2EXT(VkDevice device, @NativeType("VkPhysicalDeviceSurfaceInfo2KHR const *") VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, @NativeType("VkDeviceGroupPresentModeFlagsKHR *") int[] pModes) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupSurfacePresentModes2EXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pModes, 1);
        }
        return callPPPI(device.address(), pSurfaceInfo.address(), pModes, __functionAddress);
    }

}