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

public class KHRDisplay {

    public static final int VK_KHR_DISPLAY_SPEC_VERSION = 23;

    public static final String VK_KHR_DISPLAY_EXTENSION_NAME = "VK_KHR_display";

    public static final int
        VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR    = 1000002000,
        VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR = 1000002001;

    public static final int
        VK_OBJECT_TYPE_DISPLAY_KHR      = 1000002000,
        VK_OBJECT_TYPE_DISPLAY_MODE_KHR = 1000002001;

    public static final int
        VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR                  = 0x1,
        VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR                  = 0x2,
        VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR               = 0x4,
        VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR = 0x8;

    protected KHRDisplay() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceDisplayPropertiesKHR ] ---

    /** {@code VkResult vkGetPhysicalDeviceDisplayPropertiesKHR(VkPhysicalDevice physicalDevice, uint32_t * pPropertyCount, VkDisplayPropertiesKHR * pProperties)} */
    public static int nvkGetPhysicalDeviceDisplayPropertiesKHR(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDisplayPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pPropertyCount, pProperties, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceDisplayPropertiesKHR(VkPhysicalDevice physicalDevice, uint32_t * pPropertyCount, VkDisplayPropertiesKHR * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayPropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkDisplayPropertiesKHR *") VkDisplayPropertiesKHR.@Nullable Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceDisplayPropertiesKHR(physicalDevice, memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    // --- [ vkGetPhysicalDeviceDisplayPlanePropertiesKHR ] ---

    /** {@code VkResult vkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkPhysicalDevice physicalDevice, uint32_t * pPropertyCount, VkDisplayPlanePropertiesKHR * pProperties)} */
    public static int nvkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDisplayPlanePropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pPropertyCount, pProperties, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkPhysicalDevice physicalDevice, uint32_t * pPropertyCount, VkDisplayPlanePropertiesKHR * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkDisplayPlanePropertiesKHR *") VkDisplayPlanePropertiesKHR.@Nullable Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceDisplayPlanePropertiesKHR(physicalDevice, memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    // --- [ vkGetDisplayPlaneSupportedDisplaysKHR ] ---

    /** {@code VkResult vkGetDisplayPlaneSupportedDisplaysKHR(VkPhysicalDevice physicalDevice, uint32_t planeIndex, uint32_t * pDisplayCount, VkDisplayKHR * pDisplays)} */
    public static int nvkGetDisplayPlaneSupportedDisplaysKHR(VkPhysicalDevice physicalDevice, int planeIndex, long pDisplayCount, long pDisplays) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDisplayPlaneSupportedDisplaysKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), planeIndex, pDisplayCount, pDisplays, __functionAddress);
    }

    /** {@code VkResult vkGetDisplayPlaneSupportedDisplaysKHR(VkPhysicalDevice physicalDevice, uint32_t planeIndex, uint32_t * pDisplayCount, VkDisplayKHR * pDisplays)} */
    @NativeType("VkResult")
    public static int vkGetDisplayPlaneSupportedDisplaysKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int planeIndex, @NativeType("uint32_t *") IntBuffer pDisplayCount, @NativeType("VkDisplayKHR *") @Nullable LongBuffer pDisplays) {
        if (CHECKS) {
            check(pDisplayCount, 1);
            checkSafe(pDisplays, pDisplayCount.get(pDisplayCount.position()));
        }
        return nvkGetDisplayPlaneSupportedDisplaysKHR(physicalDevice, planeIndex, memAddress(pDisplayCount), memAddressSafe(pDisplays));
    }

    // --- [ vkGetDisplayModePropertiesKHR ] ---

    /** {@code VkResult vkGetDisplayModePropertiesKHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, uint32_t * pPropertyCount, VkDisplayModePropertiesKHR * pProperties)} */
    public static int nvkGetDisplayModePropertiesKHR(VkPhysicalDevice physicalDevice, long display, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDisplayModePropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(physicalDevice.address(), display, pPropertyCount, pProperties, __functionAddress);
    }

    /** {@code VkResult vkGetDisplayModePropertiesKHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, uint32_t * pPropertyCount, VkDisplayModePropertiesKHR * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetDisplayModePropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayKHR") long display, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkDisplayModePropertiesKHR *") VkDisplayModePropertiesKHR.@Nullable Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetDisplayModePropertiesKHR(physicalDevice, display, memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    // --- [ vkCreateDisplayModeKHR ] ---

    /** {@code VkResult vkCreateDisplayModeKHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, VkDisplayModeCreateInfoKHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkDisplayModeKHR * pMode)} */
    public static int nvkCreateDisplayModeKHR(VkPhysicalDevice physicalDevice, long display, long pCreateInfo, long pAllocator, long pMode) {
        long __functionAddress = physicalDevice.getCapabilities().vkCreateDisplayModeKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPPI(physicalDevice.address(), display, pCreateInfo, pAllocator, pMode, __functionAddress);
    }

    /** {@code VkResult vkCreateDisplayModeKHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, VkDisplayModeCreateInfoKHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkDisplayModeKHR * pMode)} */
    @NativeType("VkResult")
    public static int vkCreateDisplayModeKHR(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayKHR") long display, @NativeType("VkDisplayModeCreateInfoKHR const *") VkDisplayModeCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkDisplayModeKHR *") LongBuffer pMode) {
        if (CHECKS) {
            check(pMode, 1);
        }
        return nvkCreateDisplayModeKHR(physicalDevice, display, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pMode));
    }

    // --- [ vkGetDisplayPlaneCapabilitiesKHR ] ---

    /** {@code VkResult vkGetDisplayPlaneCapabilitiesKHR(VkPhysicalDevice physicalDevice, VkDisplayModeKHR mode, uint32_t planeIndex, VkDisplayPlaneCapabilitiesKHR * pCapabilities)} */
    public static int nvkGetDisplayPlaneCapabilitiesKHR(VkPhysicalDevice physicalDevice, long mode, int planeIndex, long pCapabilities) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDisplayPlaneCapabilitiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(physicalDevice.address(), mode, planeIndex, pCapabilities, __functionAddress);
    }

    /** {@code VkResult vkGetDisplayPlaneCapabilitiesKHR(VkPhysicalDevice physicalDevice, VkDisplayModeKHR mode, uint32_t planeIndex, VkDisplayPlaneCapabilitiesKHR * pCapabilities)} */
    @NativeType("VkResult")
    public static int vkGetDisplayPlaneCapabilitiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayModeKHR") long mode, @NativeType("uint32_t") int planeIndex, @NativeType("VkDisplayPlaneCapabilitiesKHR *") VkDisplayPlaneCapabilitiesKHR pCapabilities) {
        return nvkGetDisplayPlaneCapabilitiesKHR(physicalDevice, mode, planeIndex, pCapabilities.address());
    }

    // --- [ vkCreateDisplayPlaneSurfaceKHR ] ---

    /** {@code VkResult vkCreateDisplayPlaneSurfaceKHR(VkInstance instance, VkDisplaySurfaceCreateInfoKHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSurfaceKHR * pSurface)} */
    public static int nvkCreateDisplayPlaneSurfaceKHR(VkInstance instance, long pCreateInfo, long pAllocator, long pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateDisplayPlaneSurfaceKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(instance.address(), pCreateInfo, pAllocator, pSurface, __functionAddress);
    }

    /** {@code VkResult vkCreateDisplayPlaneSurfaceKHR(VkInstance instance, VkDisplaySurfaceCreateInfoKHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSurfaceKHR * pSurface)} */
    @NativeType("VkResult")
    public static int vkCreateDisplayPlaneSurfaceKHR(VkInstance instance, @NativeType("VkDisplaySurfaceCreateInfoKHR const *") VkDisplaySurfaceCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") LongBuffer pSurface) {
        if (CHECKS) {
            check(pSurface, 1);
        }
        return nvkCreateDisplayPlaneSurfaceKHR(instance, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pSurface));
    }

    /** {@code VkResult vkGetPhysicalDeviceDisplayPropertiesKHR(VkPhysicalDevice physicalDevice, uint32_t * pPropertyCount, VkDisplayPropertiesKHR * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayPropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkDisplayPropertiesKHR *") VkDisplayPropertiesKHR.@Nullable Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDisplayPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        return callPPPI(physicalDevice.address(), pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkPhysicalDevice physicalDevice, uint32_t * pPropertyCount, VkDisplayPlanePropertiesKHR * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkDisplayPlanePropertiesKHR *") VkDisplayPlanePropertiesKHR.@Nullable Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDisplayPlanePropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        return callPPPI(physicalDevice.address(), pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

    /** {@code VkResult vkGetDisplayPlaneSupportedDisplaysKHR(VkPhysicalDevice physicalDevice, uint32_t planeIndex, uint32_t * pDisplayCount, VkDisplayKHR * pDisplays)} */
    @NativeType("VkResult")
    public static int vkGetDisplayPlaneSupportedDisplaysKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int planeIndex, @NativeType("uint32_t *") int[] pDisplayCount, @NativeType("VkDisplayKHR *") long @Nullable [] pDisplays) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDisplayPlaneSupportedDisplaysKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pDisplayCount, 1);
            checkSafe(pDisplays, pDisplayCount[0]);
        }
        return callPPPI(physicalDevice.address(), planeIndex, pDisplayCount, pDisplays, __functionAddress);
    }

    /** {@code VkResult vkGetDisplayModePropertiesKHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, uint32_t * pPropertyCount, VkDisplayModePropertiesKHR * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetDisplayModePropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayKHR") long display, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkDisplayModePropertiesKHR *") VkDisplayModePropertiesKHR.@Nullable Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetDisplayModePropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        return callPJPPI(physicalDevice.address(), display, pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

    /** {@code VkResult vkCreateDisplayModeKHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, VkDisplayModeCreateInfoKHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkDisplayModeKHR * pMode)} */
    @NativeType("VkResult")
    public static int vkCreateDisplayModeKHR(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayKHR") long display, @NativeType("VkDisplayModeCreateInfoKHR const *") VkDisplayModeCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkDisplayModeKHR *") long[] pMode) {
        long __functionAddress = physicalDevice.getCapabilities().vkCreateDisplayModeKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pMode, 1);
        }
        return callPJPPPI(physicalDevice.address(), display, pCreateInfo.address(), memAddressSafe(pAllocator), pMode, __functionAddress);
    }

    /** {@code VkResult vkCreateDisplayPlaneSurfaceKHR(VkInstance instance, VkDisplaySurfaceCreateInfoKHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSurfaceKHR * pSurface)} */
    @NativeType("VkResult")
    public static int vkCreateDisplayPlaneSurfaceKHR(VkInstance instance, @NativeType("VkDisplaySurfaceCreateInfoKHR const *") VkDisplaySurfaceCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") long[] pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateDisplayPlaneSurfaceKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pSurface, 1);
        }
        return callPPPPI(instance.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pSurface, __functionAddress);
    }

}