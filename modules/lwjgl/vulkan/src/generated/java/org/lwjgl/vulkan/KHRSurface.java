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

public class KHRSurface {

    public static final int VK_KHR_SURFACE_SPEC_VERSION = 25;

    public static final String VK_KHR_SURFACE_EXTENSION_NAME = "VK_KHR_surface";

    public static final int
        VK_ERROR_SURFACE_LOST_KHR         = -1000000000,
        VK_ERROR_NATIVE_WINDOW_IN_USE_KHR = -1000000001;

    public static final int VK_OBJECT_TYPE_SURFACE_KHR = 1000000000;

    public static final int
        VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR                     = 0x1,
        VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR                    = 0x2,
        VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR                   = 0x4,
        VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR                   = 0x8,
        VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR            = 0x10,
        VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR  = 0x20,
        VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR = 0x40,
        VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR = 0x80,
        VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR                      = 0x100;

    public static final int
        VK_PRESENT_MODE_IMMEDIATE_KHR    = 0,
        VK_PRESENT_MODE_MAILBOX_KHR      = 1,
        VK_PRESENT_MODE_FIFO_KHR         = 2,
        VK_PRESENT_MODE_FIFO_RELAXED_KHR = 3;

    public static final int
        VK_COLOR_SPACE_SRGB_NONLINEAR_KHR = 0,
        VK_COLORSPACE_SRGB_NONLINEAR_KHR  = 0;

    public static final int
        VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR          = 0x1,
        VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR  = 0x2,
        VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR = 0x4,
        VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR         = 0x8;

    protected KHRSurface() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkDestroySurfaceKHR ] ---

    /** {@code void vkDestroySurfaceKHR(VkInstance instance, VkSurfaceKHR surface, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroySurfaceKHR(VkInstance instance, long surface, long pAllocator) {
        long __functionAddress = instance.getCapabilities().vkDestroySurfaceKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(instance.address(), surface, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroySurfaceKHR(VkInstance instance, VkSurfaceKHR surface, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroySurfaceKHR(VkInstance instance, @NativeType("VkSurfaceKHR") long surface, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroySurfaceKHR(instance, surface, memAddressSafe(pAllocator));
    }

    // --- [ vkGetPhysicalDeviceSurfaceSupportKHR ] ---

    /** {@code VkResult vkGetPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, VkSurfaceKHR surface, VkBool32 * pSupported)} */
    public static int nvkGetPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, int queueFamilyIndex, long surface, long pSupported) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceSupportKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(physicalDevice.address(), queueFamilyIndex, surface, pSupported, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, VkSurfaceKHR surface, VkBool32 * pSupported)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("VkSurfaceKHR") long surface, @NativeType("VkBool32 *") IntBuffer pSupported) {
        if (CHECKS) {
            check(pSupported, 1);
        }
        return nvkGetPhysicalDeviceSurfaceSupportKHR(physicalDevice, queueFamilyIndex, surface, memAddress(pSupported));
    }

    // --- [ vkGetPhysicalDeviceSurfaceCapabilitiesKHR ] ---

    /** {@code VkResult vkGetPhysicalDeviceSurfaceCapabilitiesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkSurfaceCapabilitiesKHR * pSurfaceCapabilities)} */
    public static int nvkGetPhysicalDeviceSurfaceCapabilitiesKHR(VkPhysicalDevice physicalDevice, long surface, long pSurfaceCapabilities) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceCapabilitiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(physicalDevice.address(), surface, pSurfaceCapabilities, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceSurfaceCapabilitiesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, VkSurfaceCapabilitiesKHR * pSurfaceCapabilities)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfaceCapabilitiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkSurfaceKHR") long surface, @NativeType("VkSurfaceCapabilitiesKHR *") VkSurfaceCapabilitiesKHR pSurfaceCapabilities) {
        return nvkGetPhysicalDeviceSurfaceCapabilitiesKHR(physicalDevice, surface, pSurfaceCapabilities.address());
    }

    // --- [ vkGetPhysicalDeviceSurfaceFormatsKHR ] ---

    /** {@code VkResult vkGetPhysicalDeviceSurfaceFormatsKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, uint32_t * pSurfaceFormatCount, VkSurfaceFormatKHR * pSurfaceFormats)} */
    public static int nvkGetPhysicalDeviceSurfaceFormatsKHR(VkPhysicalDevice physicalDevice, long surface, long pSurfaceFormatCount, long pSurfaceFormats) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceFormatsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(physicalDevice.address(), surface, pSurfaceFormatCount, pSurfaceFormats, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceSurfaceFormatsKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, uint32_t * pSurfaceFormatCount, VkSurfaceFormatKHR * pSurfaceFormats)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfaceFormatsKHR(VkPhysicalDevice physicalDevice, @NativeType("VkSurfaceKHR") long surface, @NativeType("uint32_t *") IntBuffer pSurfaceFormatCount, @NativeType("VkSurfaceFormatKHR *") VkSurfaceFormatKHR.@Nullable Buffer pSurfaceFormats) {
        if (CHECKS) {
            check(pSurfaceFormatCount, 1);
            checkSafe(pSurfaceFormats, pSurfaceFormatCount.get(pSurfaceFormatCount.position()));
        }
        return nvkGetPhysicalDeviceSurfaceFormatsKHR(physicalDevice, surface, memAddress(pSurfaceFormatCount), memAddressSafe(pSurfaceFormats));
    }

    // --- [ vkGetPhysicalDeviceSurfacePresentModesKHR ] ---

    /** {@code VkResult vkGetPhysicalDeviceSurfacePresentModesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, uint32_t * pPresentModeCount, VkPresentModeKHR * pPresentModes)} */
    public static int nvkGetPhysicalDeviceSurfacePresentModesKHR(VkPhysicalDevice physicalDevice, long surface, long pPresentModeCount, long pPresentModes) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfacePresentModesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(physicalDevice.address(), surface, pPresentModeCount, pPresentModes, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceSurfacePresentModesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, uint32_t * pPresentModeCount, VkPresentModeKHR * pPresentModes)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfacePresentModesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkSurfaceKHR") long surface, @NativeType("uint32_t *") IntBuffer pPresentModeCount, @NativeType("VkPresentModeKHR *") @Nullable IntBuffer pPresentModes) {
        if (CHECKS) {
            check(pPresentModeCount, 1);
            checkSafe(pPresentModes, pPresentModeCount.get(pPresentModeCount.position()));
        }
        return nvkGetPhysicalDeviceSurfacePresentModesKHR(physicalDevice, surface, memAddress(pPresentModeCount), memAddressSafe(pPresentModes));
    }

    /** {@code VkResult vkGetPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, VkSurfaceKHR surface, VkBool32 * pSupported)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("VkSurfaceKHR") long surface, @NativeType("VkBool32 *") int[] pSupported) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceSupportKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pSupported, 1);
        }
        return callPJPI(physicalDevice.address(), queueFamilyIndex, surface, pSupported, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceSurfaceFormatsKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, uint32_t * pSurfaceFormatCount, VkSurfaceFormatKHR * pSurfaceFormats)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfaceFormatsKHR(VkPhysicalDevice physicalDevice, @NativeType("VkSurfaceKHR") long surface, @NativeType("uint32_t *") int[] pSurfaceFormatCount, @NativeType("VkSurfaceFormatKHR *") VkSurfaceFormatKHR.@Nullable Buffer pSurfaceFormats) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceFormatsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pSurfaceFormatCount, 1);
            checkSafe(pSurfaceFormats, pSurfaceFormatCount[0]);
        }
        return callPJPPI(physicalDevice.address(), surface, pSurfaceFormatCount, memAddressSafe(pSurfaceFormats), __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceSurfacePresentModesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, uint32_t * pPresentModeCount, VkPresentModeKHR * pPresentModes)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfacePresentModesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkSurfaceKHR") long surface, @NativeType("uint32_t *") int[] pPresentModeCount, @NativeType("VkPresentModeKHR *") int @Nullable [] pPresentModes) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfacePresentModesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pPresentModeCount, 1);
            checkSafe(pPresentModes, pPresentModeCount[0]);
        }
        return callPJPPI(physicalDevice.address(), surface, pPresentModeCount, pPresentModes, __functionAddress);
    }

}