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

public class KHRSwapchain {

    public static final int VK_KHR_SWAPCHAIN_SPEC_VERSION = 70;

    public static final String VK_KHR_SWAPCHAIN_EXTENSION_NAME = "VK_KHR_swapchain";

    public static final int
        VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR              = 1000001000,
        VK_STRUCTURE_TYPE_PRESENT_INFO_KHR                       = 1000001001,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR  = 1000060007,
        VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR        = 1000060008,
        VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR   = 1000060009,
        VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR            = 1000060010,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR          = 1000060011,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR = 1000060012;

    public static final int VK_IMAGE_LAYOUT_PRESENT_SRC_KHR = 1000001002;

    public static final int
        VK_SUBOPTIMAL_KHR        = 1000001003,
        VK_ERROR_OUT_OF_DATE_KHR = -1000001004;

    public static final int VK_OBJECT_TYPE_SWAPCHAIN_KHR = 1000001000;

    public static final int
        VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR = 0x1,
        VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR                   = 0x2;

    public static final int
        VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR              = 0x1,
        VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR             = 0x2,
        VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR                = 0x4,
        VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR = 0x8;

    protected KHRSwapchain() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateSwapchainKHR ] ---

    /** {@code VkResult vkCreateSwapchainKHR(VkDevice device, VkSwapchainCreateInfoKHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSwapchainKHR * pSwapchain)} */
    public static int nvkCreateSwapchainKHR(VkDevice device, long pCreateInfo, long pAllocator, long pSwapchain) {
        long __functionAddress = device.getCapabilities().vkCreateSwapchainKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pSwapchain, __functionAddress);
    }

    /** {@code VkResult vkCreateSwapchainKHR(VkDevice device, VkSwapchainCreateInfoKHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSwapchainKHR * pSwapchain)} */
    @NativeType("VkResult")
    public static int vkCreateSwapchainKHR(VkDevice device, @NativeType("VkSwapchainCreateInfoKHR const *") VkSwapchainCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkSwapchainKHR *") LongBuffer pSwapchain) {
        if (CHECKS) {
            check(pSwapchain, 1);
        }
        return nvkCreateSwapchainKHR(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pSwapchain));
    }

    // --- [ vkDestroySwapchainKHR ] ---

    /** {@code void vkDestroySwapchainKHR(VkDevice device, VkSwapchainKHR swapchain, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroySwapchainKHR(VkDevice device, long swapchain, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroySwapchainKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), swapchain, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroySwapchainKHR(VkDevice device, VkSwapchainKHR swapchain, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroySwapchainKHR(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroySwapchainKHR(device, swapchain, memAddressSafe(pAllocator));
    }

    // --- [ vkGetSwapchainImagesKHR ] ---

    /** {@code VkResult vkGetSwapchainImagesKHR(VkDevice device, VkSwapchainKHR swapchain, uint32_t * pSwapchainImageCount, VkImage * pSwapchainImages)} */
    public static int nvkGetSwapchainImagesKHR(VkDevice device, long swapchain, long pSwapchainImageCount, long pSwapchainImages) {
        long __functionAddress = device.getCapabilities().vkGetSwapchainImagesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), swapchain, pSwapchainImageCount, pSwapchainImages, __functionAddress);
    }

    /** {@code VkResult vkGetSwapchainImagesKHR(VkDevice device, VkSwapchainKHR swapchain, uint32_t * pSwapchainImageCount, VkImage * pSwapchainImages)} */
    @NativeType("VkResult")
    public static int vkGetSwapchainImagesKHR(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("uint32_t *") IntBuffer pSwapchainImageCount, @NativeType("VkImage *") @Nullable LongBuffer pSwapchainImages) {
        if (CHECKS) {
            check(pSwapchainImageCount, 1);
            checkSafe(pSwapchainImages, pSwapchainImageCount.get(pSwapchainImageCount.position()));
        }
        return nvkGetSwapchainImagesKHR(device, swapchain, memAddress(pSwapchainImageCount), memAddressSafe(pSwapchainImages));
    }

    // --- [ vkAcquireNextImageKHR ] ---

    /** {@code VkResult vkAcquireNextImageKHR(VkDevice device, VkSwapchainKHR swapchain, uint64_t timeout, VkSemaphore semaphore, VkFence fence, uint32_t * pImageIndex)} */
    public static int nvkAcquireNextImageKHR(VkDevice device, long swapchain, long timeout, long semaphore, long fence, long pImageIndex) {
        long __functionAddress = device.getCapabilities().vkAcquireNextImageKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJJJJPI(device.address(), swapchain, timeout, semaphore, fence, pImageIndex, __functionAddress);
    }

    /** {@code VkResult vkAcquireNextImageKHR(VkDevice device, VkSwapchainKHR swapchain, uint64_t timeout, VkSemaphore semaphore, VkFence fence, uint32_t * pImageIndex)} */
    @NativeType("VkResult")
    public static int vkAcquireNextImageKHR(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("uint64_t") long timeout, @NativeType("VkSemaphore") long semaphore, @NativeType("VkFence") long fence, @NativeType("uint32_t *") IntBuffer pImageIndex) {
        if (CHECKS) {
            check(pImageIndex, 1);
        }
        return nvkAcquireNextImageKHR(device, swapchain, timeout, semaphore, fence, memAddress(pImageIndex));
    }

    // --- [ vkQueuePresentKHR ] ---

    /** {@code VkResult vkQueuePresentKHR(VkQueue queue, VkPresentInfoKHR const * pPresentInfo)} */
    public static int nvkQueuePresentKHR(VkQueue queue, long pPresentInfo) {
        long __functionAddress = queue.getCapabilities().vkQueuePresentKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkPresentInfoKHR.validate(pPresentInfo);
        }
        return callPPI(queue.address(), pPresentInfo, __functionAddress);
    }

    /** {@code VkResult vkQueuePresentKHR(VkQueue queue, VkPresentInfoKHR const * pPresentInfo)} */
    @NativeType("VkResult")
    public static int vkQueuePresentKHR(VkQueue queue, @NativeType("VkPresentInfoKHR const *") VkPresentInfoKHR pPresentInfo) {
        return nvkQueuePresentKHR(queue, pPresentInfo.address());
    }

    // --- [ vkGetDeviceGroupPresentCapabilitiesKHR ] ---

    /** {@code VkResult vkGetDeviceGroupPresentCapabilitiesKHR(VkDevice device, VkDeviceGroupPresentCapabilitiesKHR * pDeviceGroupPresentCapabilities)} */
    public static int nvkGetDeviceGroupPresentCapabilitiesKHR(VkDevice device, long pDeviceGroupPresentCapabilities) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupPresentCapabilitiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pDeviceGroupPresentCapabilities, __functionAddress);
    }

    /** {@code VkResult vkGetDeviceGroupPresentCapabilitiesKHR(VkDevice device, VkDeviceGroupPresentCapabilitiesKHR * pDeviceGroupPresentCapabilities)} */
    @NativeType("VkResult")
    public static int vkGetDeviceGroupPresentCapabilitiesKHR(VkDevice device, @NativeType("VkDeviceGroupPresentCapabilitiesKHR *") VkDeviceGroupPresentCapabilitiesKHR pDeviceGroupPresentCapabilities) {
        return nvkGetDeviceGroupPresentCapabilitiesKHR(device, pDeviceGroupPresentCapabilities.address());
    }

    // --- [ vkGetDeviceGroupSurfacePresentModesKHR ] ---

    /** {@code VkResult vkGetDeviceGroupSurfacePresentModesKHR(VkDevice device, VkSurfaceKHR surface, VkDeviceGroupPresentModeFlagsKHR * pModes)} */
    public static int nvkGetDeviceGroupSurfacePresentModesKHR(VkDevice device, long surface, long pModes) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupSurfacePresentModesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), surface, pModes, __functionAddress);
    }

    /** {@code VkResult vkGetDeviceGroupSurfacePresentModesKHR(VkDevice device, VkSurfaceKHR surface, VkDeviceGroupPresentModeFlagsKHR * pModes)} */
    @NativeType("VkResult")
    public static int vkGetDeviceGroupSurfacePresentModesKHR(VkDevice device, @NativeType("VkSurfaceKHR") long surface, @NativeType("VkDeviceGroupPresentModeFlagsKHR *") IntBuffer pModes) {
        if (CHECKS) {
            check(pModes, 1);
        }
        return nvkGetDeviceGroupSurfacePresentModesKHR(device, surface, memAddress(pModes));
    }

    // --- [ vkGetPhysicalDevicePresentRectanglesKHR ] ---

    /** {@code VkResult vkGetPhysicalDevicePresentRectanglesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, uint32_t * pRectCount, VkRect2D * pRects)} */
    public static int nvkGetPhysicalDevicePresentRectanglesKHR(VkPhysicalDevice physicalDevice, long surface, long pRectCount, long pRects) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDevicePresentRectanglesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(physicalDevice.address(), surface, pRectCount, pRects, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDevicePresentRectanglesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, uint32_t * pRectCount, VkRect2D * pRects)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDevicePresentRectanglesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkSurfaceKHR") long surface, @NativeType("uint32_t *") IntBuffer pRectCount, @NativeType("VkRect2D *") VkRect2D.@Nullable Buffer pRects) {
        if (CHECKS) {
            check(pRectCount, 1);
            checkSafe(pRects, pRectCount.get(pRectCount.position()));
        }
        return nvkGetPhysicalDevicePresentRectanglesKHR(physicalDevice, surface, memAddress(pRectCount), memAddressSafe(pRects));
    }

    // --- [ vkAcquireNextImage2KHR ] ---

    /** {@code VkResult vkAcquireNextImage2KHR(VkDevice device, VkAcquireNextImageInfoKHR const * pAcquireInfo, uint32_t * pImageIndex)} */
    public static int nvkAcquireNextImage2KHR(VkDevice device, long pAcquireInfo, long pImageIndex) {
        long __functionAddress = device.getCapabilities().vkAcquireNextImage2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pAcquireInfo, pImageIndex, __functionAddress);
    }

    /** {@code VkResult vkAcquireNextImage2KHR(VkDevice device, VkAcquireNextImageInfoKHR const * pAcquireInfo, uint32_t * pImageIndex)} */
    @NativeType("VkResult")
    public static int vkAcquireNextImage2KHR(VkDevice device, @NativeType("VkAcquireNextImageInfoKHR const *") VkAcquireNextImageInfoKHR pAcquireInfo, @NativeType("uint32_t *") IntBuffer pImageIndex) {
        if (CHECKS) {
            check(pImageIndex, 1);
        }
        return nvkAcquireNextImage2KHR(device, pAcquireInfo.address(), memAddress(pImageIndex));
    }

    /** {@code VkResult vkCreateSwapchainKHR(VkDevice device, VkSwapchainCreateInfoKHR const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSwapchainKHR * pSwapchain)} */
    @NativeType("VkResult")
    public static int vkCreateSwapchainKHR(VkDevice device, @NativeType("VkSwapchainCreateInfoKHR const *") VkSwapchainCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkSwapchainKHR *") long[] pSwapchain) {
        long __functionAddress = device.getCapabilities().vkCreateSwapchainKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pSwapchain, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pSwapchain, __functionAddress);
    }

    /** {@code VkResult vkGetSwapchainImagesKHR(VkDevice device, VkSwapchainKHR swapchain, uint32_t * pSwapchainImageCount, VkImage * pSwapchainImages)} */
    @NativeType("VkResult")
    public static int vkGetSwapchainImagesKHR(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("uint32_t *") int[] pSwapchainImageCount, @NativeType("VkImage *") long @Nullable [] pSwapchainImages) {
        long __functionAddress = device.getCapabilities().vkGetSwapchainImagesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pSwapchainImageCount, 1);
            checkSafe(pSwapchainImages, pSwapchainImageCount[0]);
        }
        return callPJPPI(device.address(), swapchain, pSwapchainImageCount, pSwapchainImages, __functionAddress);
    }

    /** {@code VkResult vkAcquireNextImageKHR(VkDevice device, VkSwapchainKHR swapchain, uint64_t timeout, VkSemaphore semaphore, VkFence fence, uint32_t * pImageIndex)} */
    @NativeType("VkResult")
    public static int vkAcquireNextImageKHR(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("uint64_t") long timeout, @NativeType("VkSemaphore") long semaphore, @NativeType("VkFence") long fence, @NativeType("uint32_t *") int[] pImageIndex) {
        long __functionAddress = device.getCapabilities().vkAcquireNextImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pImageIndex, 1);
        }
        return callPJJJJPI(device.address(), swapchain, timeout, semaphore, fence, pImageIndex, __functionAddress);
    }

    /** {@code VkResult vkGetDeviceGroupSurfacePresentModesKHR(VkDevice device, VkSurfaceKHR surface, VkDeviceGroupPresentModeFlagsKHR * pModes)} */
    @NativeType("VkResult")
    public static int vkGetDeviceGroupSurfacePresentModesKHR(VkDevice device, @NativeType("VkSurfaceKHR") long surface, @NativeType("VkDeviceGroupPresentModeFlagsKHR *") int[] pModes) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupSurfacePresentModesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pModes, 1);
        }
        return callPJPI(device.address(), surface, pModes, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDevicePresentRectanglesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, uint32_t * pRectCount, VkRect2D * pRects)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDevicePresentRectanglesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkSurfaceKHR") long surface, @NativeType("uint32_t *") int[] pRectCount, @NativeType("VkRect2D *") VkRect2D.@Nullable Buffer pRects) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDevicePresentRectanglesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pRectCount, 1);
            checkSafe(pRects, pRectCount[0]);
        }
        return callPJPPI(physicalDevice.address(), surface, pRectCount, memAddressSafe(pRects), __functionAddress);
    }

    /** {@code VkResult vkAcquireNextImage2KHR(VkDevice device, VkAcquireNextImageInfoKHR const * pAcquireInfo, uint32_t * pImageIndex)} */
    @NativeType("VkResult")
    public static int vkAcquireNextImage2KHR(VkDevice device, @NativeType("VkAcquireNextImageInfoKHR const *") VkAcquireNextImageInfoKHR pAcquireInfo, @NativeType("uint32_t *") int[] pImageIndex) {
        long __functionAddress = device.getCapabilities().vkAcquireNextImage2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pImageIndex, 1);
        }
        return callPPPI(device.address(), pAcquireInfo.address(), pImageIndex, __functionAddress);
    }

}