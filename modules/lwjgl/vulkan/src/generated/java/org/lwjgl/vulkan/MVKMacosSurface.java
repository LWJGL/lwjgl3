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

public class MVKMacosSurface {

    public static final int VK_MVK_MACOS_SURFACE_SPEC_VERSION = 3;

    public static final String VK_MVK_MACOS_SURFACE_EXTENSION_NAME = "VK_MVK_macos_surface";

    public static final int VK_STRUCTURE_TYPE_MACOS_SURFACE_CREATE_INFO_MVK = 1000123000;

    protected MVKMacosSurface() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateMacOSSurfaceMVK ] ---

    /** {@code VkResult vkCreateMacOSSurfaceMVK(VkInstance instance, VkMacOSSurfaceCreateInfoMVK const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSurfaceKHR * pSurface)} */
    public static int nvkCreateMacOSSurfaceMVK(VkInstance instance, long pCreateInfo, long pAllocator, long pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateMacOSSurfaceMVK;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(instance.address(), pCreateInfo, pAllocator, pSurface, __functionAddress);
    }

    /** {@code VkResult vkCreateMacOSSurfaceMVK(VkInstance instance, VkMacOSSurfaceCreateInfoMVK const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSurfaceKHR * pSurface)} */
    @NativeType("VkResult")
    public static int vkCreateMacOSSurfaceMVK(VkInstance instance, @NativeType("VkMacOSSurfaceCreateInfoMVK const *") VkMacOSSurfaceCreateInfoMVK pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") LongBuffer pSurface) {
        if (CHECKS) {
            check(pSurface, 1);
        }
        return nvkCreateMacOSSurfaceMVK(instance, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pSurface));
    }

    /** {@code VkResult vkCreateMacOSSurfaceMVK(VkInstance instance, VkMacOSSurfaceCreateInfoMVK const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSurfaceKHR * pSurface)} */
    @NativeType("VkResult")
    public static int vkCreateMacOSSurfaceMVK(VkInstance instance, @NativeType("VkMacOSSurfaceCreateInfoMVK const *") VkMacOSSurfaceCreateInfoMVK pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") long[] pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateMacOSSurfaceMVK;
        if (CHECKS) {
            check(__functionAddress);
            check(pSurface, 1);
        }
        return callPPPPI(instance.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pSurface, __functionAddress);
    }

}