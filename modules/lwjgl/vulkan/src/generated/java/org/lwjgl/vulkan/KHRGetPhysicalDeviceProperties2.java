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

public class KHRGetPhysicalDeviceProperties2 {

    public static final int VK_KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_SPEC_VERSION = 2;

    public static final String VK_KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_EXTENSION_NAME = "VK_KHR_get_physical_device_properties2";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2_KHR                 = 1000059000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2_KHR               = 1000059001,
        VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_2_KHR                        = 1000059002,
        VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2_KHR                  = 1000059003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2_KHR        = 1000059004,
        VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2_KHR                  = 1000059005,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2_KHR        = 1000059006,
        VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2_KHR           = 1000059007,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2_KHR = 1000059008;

    protected KHRGetPhysicalDeviceProperties2() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceFeatures2KHR ] ---

    /** {@code void vkGetPhysicalDeviceFeatures2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures2 * pFeatures)} */
    public static void nvkGetPhysicalDeviceFeatures2KHR(VkPhysicalDevice physicalDevice, long pFeatures) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFeatures2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(physicalDevice.address(), pFeatures, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceFeatures2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures2 * pFeatures)} */
    public static void vkGetPhysicalDeviceFeatures2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceFeatures2 *") VkPhysicalDeviceFeatures2 pFeatures) {
        nvkGetPhysicalDeviceFeatures2KHR(physicalDevice, pFeatures.address());
    }

    // --- [ vkGetPhysicalDeviceProperties2KHR ] ---

    /** {@code void vkGetPhysicalDeviceProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties2 * pProperties)} */
    public static void nvkGetPhysicalDeviceProperties2KHR(VkPhysicalDevice physicalDevice, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(physicalDevice.address(), pProperties, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties2 * pProperties)} */
    public static void vkGetPhysicalDeviceProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceProperties2 *") VkPhysicalDeviceProperties2 pProperties) {
        nvkGetPhysicalDeviceProperties2KHR(physicalDevice, pProperties.address());
    }

    // --- [ vkGetPhysicalDeviceFormatProperties2KHR ] ---

    /** {@code void vkGetPhysicalDeviceFormatProperties2KHR(VkPhysicalDevice physicalDevice, VkFormat format, VkFormatProperties2 * pFormatProperties)} */
    public static void nvkGetPhysicalDeviceFormatProperties2KHR(VkPhysicalDevice physicalDevice, int format, long pFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFormatProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(physicalDevice.address(), format, pFormatProperties, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceFormatProperties2KHR(VkPhysicalDevice physicalDevice, VkFormat format, VkFormatProperties2 * pFormatProperties)} */
    public static void vkGetPhysicalDeviceFormatProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkFormat") int format, @NativeType("VkFormatProperties2 *") VkFormatProperties2 pFormatProperties) {
        nvkGetPhysicalDeviceFormatProperties2KHR(physicalDevice, format, pFormatProperties.address());
    }

    // --- [ vkGetPhysicalDeviceImageFormatProperties2KHR ] ---

    /** {@code VkResult vkGetPhysicalDeviceImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceImageFormatInfo2 const * pImageFormatInfo, VkImageFormatProperties2 * pImageFormatProperties)} */
    public static int nvkGetPhysicalDeviceImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, long pImageFormatInfo, long pImageFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceImageFormatProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pImageFormatInfo, pImageFormatProperties, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceImageFormatInfo2 const * pImageFormatInfo, VkImageFormatProperties2 * pImageFormatProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceImageFormatInfo2 const *") VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo, @NativeType("VkImageFormatProperties2 *") VkImageFormatProperties2 pImageFormatProperties) {
        return nvkGetPhysicalDeviceImageFormatProperties2KHR(physicalDevice, pImageFormatInfo.address(), pImageFormatProperties.address());
    }

    // --- [ vkGetPhysicalDeviceQueueFamilyProperties2KHR ] ---

    /** {@code void vkGetPhysicalDeviceQueueFamilyProperties2KHR(VkPhysicalDevice physicalDevice, uint32_t * pQueueFamilyPropertyCount, VkQueueFamilyProperties2 * pQueueFamilyProperties)} */
    public static void nvkGetPhysicalDeviceQueueFamilyProperties2KHR(VkPhysicalDevice physicalDevice, long pQueueFamilyPropertyCount, long pQueueFamilyProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(physicalDevice.address(), pQueueFamilyPropertyCount, pQueueFamilyProperties, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceQueueFamilyProperties2KHR(VkPhysicalDevice physicalDevice, uint32_t * pQueueFamilyPropertyCount, VkQueueFamilyProperties2 * pQueueFamilyProperties)} */
    public static void vkGetPhysicalDeviceQueueFamilyProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pQueueFamilyPropertyCount, @NativeType("VkQueueFamilyProperties2 *") VkQueueFamilyProperties2.@Nullable Buffer pQueueFamilyProperties) {
        if (CHECKS) {
            check(pQueueFamilyPropertyCount, 1);
            checkSafe(pQueueFamilyProperties, pQueueFamilyPropertyCount.get(pQueueFamilyPropertyCount.position()));
        }
        nvkGetPhysicalDeviceQueueFamilyProperties2KHR(physicalDevice, memAddress(pQueueFamilyPropertyCount), memAddressSafe(pQueueFamilyProperties));
    }

    // --- [ vkGetPhysicalDeviceMemoryProperties2KHR ] ---

    /** {@code void vkGetPhysicalDeviceMemoryProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties2 * pMemoryProperties)} */
    public static void nvkGetPhysicalDeviceMemoryProperties2KHR(VkPhysicalDevice physicalDevice, long pMemoryProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceMemoryProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(physicalDevice.address(), pMemoryProperties, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceMemoryProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties2 * pMemoryProperties)} */
    public static void vkGetPhysicalDeviceMemoryProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceMemoryProperties2 *") VkPhysicalDeviceMemoryProperties2 pMemoryProperties) {
        nvkGetPhysicalDeviceMemoryProperties2KHR(physicalDevice, pMemoryProperties.address());
    }

    // --- [ vkGetPhysicalDeviceSparseImageFormatProperties2KHR ] ---

    /** {@code void vkGetPhysicalDeviceSparseImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSparseImageFormatInfo2 const * pFormatInfo, uint32_t * pPropertyCount, VkSparseImageFormatProperties2 * pProperties)} */
    public static void nvkGetPhysicalDeviceSparseImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, long pFormatInfo, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSparseImageFormatProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(physicalDevice.address(), pFormatInfo, pPropertyCount, pProperties, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceSparseImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSparseImageFormatInfo2 const * pFormatInfo, uint32_t * pPropertyCount, VkSparseImageFormatProperties2 * pProperties)} */
    public static void vkGetPhysicalDeviceSparseImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceSparseImageFormatInfo2 const *") VkPhysicalDeviceSparseImageFormatInfo2 pFormatInfo, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkSparseImageFormatProperties2 *") VkSparseImageFormatProperties2.@Nullable Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        nvkGetPhysicalDeviceSparseImageFormatProperties2KHR(physicalDevice, pFormatInfo.address(), memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    /** {@code void vkGetPhysicalDeviceQueueFamilyProperties2KHR(VkPhysicalDevice physicalDevice, uint32_t * pQueueFamilyPropertyCount, VkQueueFamilyProperties2 * pQueueFamilyProperties)} */
    public static void vkGetPhysicalDeviceQueueFamilyProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pQueueFamilyPropertyCount, @NativeType("VkQueueFamilyProperties2 *") VkQueueFamilyProperties2.@Nullable Buffer pQueueFamilyProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pQueueFamilyPropertyCount, 1);
            checkSafe(pQueueFamilyProperties, pQueueFamilyPropertyCount[0]);
        }
        callPPPV(physicalDevice.address(), pQueueFamilyPropertyCount, memAddressSafe(pQueueFamilyProperties), __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceSparseImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSparseImageFormatInfo2 const * pFormatInfo, uint32_t * pPropertyCount, VkSparseImageFormatProperties2 * pProperties)} */
    public static void vkGetPhysicalDeviceSparseImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceSparseImageFormatInfo2 const *") VkPhysicalDeviceSparseImageFormatInfo2 pFormatInfo, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkSparseImageFormatProperties2 *") VkSparseImageFormatProperties2.@Nullable Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSparseImageFormatProperties2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        callPPPPV(physicalDevice.address(), pFormatInfo.address(), pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

}