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

import org.lwjgl.system.windows.*;

public class KHRWin32Surface {

    public static final int VK_KHR_WIN32_SURFACE_SPEC_VERSION = 6;

    public static final String VK_KHR_WIN32_SURFACE_EXTENSION_NAME = "VK_KHR_win32_surface";

    public static final int VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR = 1000009000;

    protected KHRWin32Surface() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateWin32SurfaceKHR ] ---

    /** {@code VkResult vkCreateWin32SurfaceKHR(VkInstance instance, VkWin32SurfaceCreateInfoKHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSurfaceKHR * pSurface)} */
    public static int nvkCreateWin32SurfaceKHR(VkInstance instance, long pCreateInfo, long pAllocator, long pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateWin32SurfaceKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkWin32SurfaceCreateInfoKHR.validate(pCreateInfo);
        }
        return callPPPPI(instance.address(), pCreateInfo, pAllocator, pSurface, __functionAddress);
    }

    /** {@code VkResult vkCreateWin32SurfaceKHR(VkInstance instance, VkWin32SurfaceCreateInfoKHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSurfaceKHR * pSurface)} */
    @NativeType("VkResult")
    public static int vkCreateWin32SurfaceKHR(VkInstance instance, @NativeType("VkWin32SurfaceCreateInfoKHR const *") VkWin32SurfaceCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") LongBuffer pSurface) {
        if (CHECKS) {
            check(pSurface, 1);
        }
        return nvkCreateWin32SurfaceKHR(instance, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pSurface));
    }

    // --- [ vkGetPhysicalDeviceWin32PresentationSupportKHR ] ---

    /** {@code VkBool32 vkGetPhysicalDeviceWin32PresentationSupportKHR(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex)} */
    @NativeType("VkBool32")
    public static boolean vkGetPhysicalDeviceWin32PresentationSupportKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceWin32PresentationSupportKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(physicalDevice.address(), queueFamilyIndex, __functionAddress) != 0;
    }

    /** {@code VkResult vkCreateWin32SurfaceKHR(VkInstance instance, VkWin32SurfaceCreateInfoKHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSurfaceKHR * pSurface)} */
    @NativeType("VkResult")
    public static int vkCreateWin32SurfaceKHR(VkInstance instance, @NativeType("VkWin32SurfaceCreateInfoKHR const *") VkWin32SurfaceCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") long[] pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateWin32SurfaceKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pSurface, 1);
            VkWin32SurfaceCreateInfoKHR.validate(pCreateInfo.address());
        }
        return callPPPPI(instance.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pSurface, __functionAddress);
    }

}