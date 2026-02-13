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

public class SECUbmSurface {

    public static final int VK_SEC_UBM_SURFACE_SPEC_VERSION = 1;

    public static final String VK_SEC_UBM_SURFACE_EXTENSION_NAME = "VK_SEC_ubm_surface";

    public static final int VK_STRUCTURE_TYPE_UBM_SURFACE_CREATE_INFO_SEC = 1000664000;

    protected SECUbmSurface() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateUbmSurfaceSEC ] ---

    /** {@code VkResult vkCreateUbmSurfaceSEC(VkInstance instance, VkUbmSurfaceCreateInfoSEC const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSurfaceKHR * pSurface)} */
    public static int nvkCreateUbmSurfaceSEC(VkInstance instance, long pCreateInfo, long pAllocator, long pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateUbmSurfaceSEC;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(instance.address(), pCreateInfo, pAllocator, pSurface, __functionAddress);
    }

    /** {@code VkResult vkCreateUbmSurfaceSEC(VkInstance instance, VkUbmSurfaceCreateInfoSEC const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSurfaceKHR * pSurface)} */
    @NativeType("VkResult")
    public static int vkCreateUbmSurfaceSEC(VkInstance instance, @NativeType("VkUbmSurfaceCreateInfoSEC const *") VkUbmSurfaceCreateInfoSEC pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") LongBuffer pSurface) {
        if (CHECKS) {
            check(pSurface, 1);
        }
        return nvkCreateUbmSurfaceSEC(instance, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pSurface));
    }

    // --- [ vkGetPhysicalDeviceUbmPresentationSupportSEC ] ---

    /** {@code VkBool32 vkGetPhysicalDeviceUbmPresentationSupportSEC(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, ubm_device * ubm_device)} */
    @NativeType("VkBool32")
    public static boolean vkGetPhysicalDeviceUbmPresentationSupportSEC(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("ubm_device *") long ubm_device) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceUbmPresentationSupportSEC;
        if (CHECKS) {
            check(__functionAddress);
            check(ubm_device);
        }
        return callPPI(physicalDevice.address(), queueFamilyIndex, ubm_device, __functionAddress) != 0;
    }

    /** {@code VkResult vkCreateUbmSurfaceSEC(VkInstance instance, VkUbmSurfaceCreateInfoSEC const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSurfaceKHR * pSurface)} */
    @NativeType("VkResult")
    public static int vkCreateUbmSurfaceSEC(VkInstance instance, @NativeType("VkUbmSurfaceCreateInfoSEC const *") VkUbmSurfaceCreateInfoSEC pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") long[] pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateUbmSurfaceSEC;
        if (CHECKS) {
            check(__functionAddress);
            check(pSurface, 1);
        }
        return callPPPPI(instance.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pSurface, __functionAddress);
    }

}