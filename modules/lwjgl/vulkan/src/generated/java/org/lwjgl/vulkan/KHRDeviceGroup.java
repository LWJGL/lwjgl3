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

public class KHRDeviceGroup {

    public static final int VK_KHR_DEVICE_GROUP_SPEC_VERSION = 4;

    public static final String VK_KHR_DEVICE_GROUP_EXTENSION_NAME = "VK_KHR_device_group";

    public static final int
        VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO_KHR             = 1000060000,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHR    = 1000060003,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO_KHR = 1000060004,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO_KHR               = 1000060005,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO_KHR          = 1000060006,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR      = 1000060007,
        VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR            = 1000060008,
        VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR       = 1000060009,
        VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR                = 1000060010,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR              = 1000060011,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR     = 1000060012,
        VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO_KHR   = 1000060013,
        VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO_KHR    = 1000060014;

    public static final int
        VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHR    = 0x1,
        VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHR    = 0x2,
        VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHR = 0x4,
        VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHR = 0x8;

    public static final int VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHR = 0x1;

    public static final int
        VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR = 0x8,
        VK_PIPELINE_CREATE_DISPATCH_BASE_KHR                    = 0x10;

    public static final int VK_DEPENDENCY_DEVICE_GROUP_BIT_KHR = 0x4;

    public static final int VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR = 0x40;

    public static final int VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR = 0x1;

    protected KHRDeviceGroup() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetDeviceGroupPeerMemoryFeaturesKHR ] ---

    /** {@code void vkGetDeviceGroupPeerMemoryFeaturesKHR(VkDevice device, uint32_t heapIndex, uint32_t localDeviceIndex, uint32_t remoteDeviceIndex, VkPeerMemoryFeatureFlags * pPeerMemoryFeatures)} */
    public static void nvkGetDeviceGroupPeerMemoryFeaturesKHR(VkDevice device, int heapIndex, int localDeviceIndex, int remoteDeviceIndex, long pPeerMemoryFeatures) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupPeerMemoryFeaturesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(device.address(), heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures, __functionAddress);
    }

    /** {@code void vkGetDeviceGroupPeerMemoryFeaturesKHR(VkDevice device, uint32_t heapIndex, uint32_t localDeviceIndex, uint32_t remoteDeviceIndex, VkPeerMemoryFeatureFlags * pPeerMemoryFeatures)} */
    public static void vkGetDeviceGroupPeerMemoryFeaturesKHR(VkDevice device, @NativeType("uint32_t") int heapIndex, @NativeType("uint32_t") int localDeviceIndex, @NativeType("uint32_t") int remoteDeviceIndex, @NativeType("VkPeerMemoryFeatureFlags *") IntBuffer pPeerMemoryFeatures) {
        if (CHECKS) {
            check(pPeerMemoryFeatures, 1);
        }
        nvkGetDeviceGroupPeerMemoryFeaturesKHR(device, heapIndex, localDeviceIndex, remoteDeviceIndex, memAddress(pPeerMemoryFeatures));
    }

    // --- [ vkCmdSetDeviceMaskKHR ] ---

    /** {@code void vkCmdSetDeviceMaskKHR(VkCommandBuffer commandBuffer, uint32_t deviceMask)} */
    public static void vkCmdSetDeviceMaskKHR(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int deviceMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDeviceMaskKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), deviceMask, __functionAddress);
    }

    // --- [ vkCmdDispatchBaseKHR ] ---

    /** {@code void vkCmdDispatchBaseKHR(VkCommandBuffer commandBuffer, uint32_t baseGroupX, uint32_t baseGroupY, uint32_t baseGroupZ, uint32_t groupCountX, uint32_t groupCountY, uint32_t groupCountZ)} */
    public static void vkCmdDispatchBaseKHR(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int baseGroupX, @NativeType("uint32_t") int baseGroupY, @NativeType("uint32_t") int baseGroupZ, @NativeType("uint32_t") int groupCountX, @NativeType("uint32_t") int groupCountY, @NativeType("uint32_t") int groupCountZ) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDispatchBaseKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), baseGroupX, baseGroupY, baseGroupZ, groupCountX, groupCountY, groupCountZ, __functionAddress);
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

    /** {@code void vkGetDeviceGroupPeerMemoryFeaturesKHR(VkDevice device, uint32_t heapIndex, uint32_t localDeviceIndex, uint32_t remoteDeviceIndex, VkPeerMemoryFeatureFlags * pPeerMemoryFeatures)} */
    public static void vkGetDeviceGroupPeerMemoryFeaturesKHR(VkDevice device, @NativeType("uint32_t") int heapIndex, @NativeType("uint32_t") int localDeviceIndex, @NativeType("uint32_t") int remoteDeviceIndex, @NativeType("VkPeerMemoryFeatureFlags *") int[] pPeerMemoryFeatures) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupPeerMemoryFeaturesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pPeerMemoryFeatures, 1);
        }
        callPPV(device.address(), heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures, __functionAddress);
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