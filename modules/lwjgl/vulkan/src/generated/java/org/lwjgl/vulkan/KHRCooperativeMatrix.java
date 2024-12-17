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

public class KHRCooperativeMatrix {

    public static final int VK_KHR_COOPERATIVE_MATRIX_SPEC_VERSION = 2;

    public static final String VK_KHR_COOPERATIVE_MATRIX_EXTENSION_NAME = "VK_KHR_cooperative_matrix";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_KHR   = 1000506000,
        VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_KHR                 = 1000506001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_KHR = 1000506002;

    public static final int
        VK_COMPONENT_TYPE_FLOAT16_KHR = 0,
        VK_COMPONENT_TYPE_FLOAT32_KHR = 1,
        VK_COMPONENT_TYPE_FLOAT64_KHR = 2,
        VK_COMPONENT_TYPE_SINT8_KHR   = 3,
        VK_COMPONENT_TYPE_SINT16_KHR  = 4,
        VK_COMPONENT_TYPE_SINT32_KHR  = 5,
        VK_COMPONENT_TYPE_SINT64_KHR  = 6,
        VK_COMPONENT_TYPE_UINT8_KHR   = 7,
        VK_COMPONENT_TYPE_UINT16_KHR  = 8,
        VK_COMPONENT_TYPE_UINT32_KHR  = 9,
        VK_COMPONENT_TYPE_UINT64_KHR  = 10;

    public static final int
        VK_SCOPE_DEVICE_KHR       = 1,
        VK_SCOPE_WORKGROUP_KHR    = 2,
        VK_SCOPE_SUBGROUP_KHR     = 3,
        VK_SCOPE_QUEUE_FAMILY_KHR = 5;

    protected KHRCooperativeMatrix() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR ] ---

    /** {@code VkResult vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR(VkPhysicalDevice physicalDevice, uint32_t * pPropertyCount, VkCooperativeMatrixPropertiesKHR * pProperties)} */
    public static int nvkGetPhysicalDeviceCooperativeMatrixPropertiesKHR(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pPropertyCount, pProperties, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR(VkPhysicalDevice physicalDevice, uint32_t * pPropertyCount, VkCooperativeMatrixPropertiesKHR * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkCooperativeMatrixPropertiesKHR *") VkCooperativeMatrixPropertiesKHR.@Nullable Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceCooperativeMatrixPropertiesKHR(physicalDevice, memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    /** {@code VkResult vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR(VkPhysicalDevice physicalDevice, uint32_t * pPropertyCount, VkCooperativeMatrixPropertiesKHR * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkCooperativeMatrixPropertiesKHR *") VkCooperativeMatrixPropertiesKHR.@Nullable Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        return callPPPI(physicalDevice.address(), pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

}