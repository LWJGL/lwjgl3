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

public class NVCooperativeMatrix {

    public static final int VK_NV_COOPERATIVE_MATRIX_SPEC_VERSION = 1;

    public static final String VK_NV_COOPERATIVE_MATRIX_EXTENSION_NAME = "VK_NV_cooperative_matrix";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV   = 1000249000,
        VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV                 = 1000249001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_NV = 1000249002;

    public static final int
        VK_SCOPE_DEVICE_NV       = 1,
        VK_SCOPE_WORKGROUP_NV    = 2,
        VK_SCOPE_SUBGROUP_NV     = 3,
        VK_SCOPE_QUEUE_FAMILY_NV = 5;

    public static final int
        VK_COMPONENT_TYPE_FLOAT16_NV = 0,
        VK_COMPONENT_TYPE_FLOAT32_NV = 1,
        VK_COMPONENT_TYPE_FLOAT64_NV = 2,
        VK_COMPONENT_TYPE_SINT8_NV   = 3,
        VK_COMPONENT_TYPE_SINT16_NV  = 4,
        VK_COMPONENT_TYPE_SINT32_NV  = 5,
        VK_COMPONENT_TYPE_SINT64_NV  = 6,
        VK_COMPONENT_TYPE_UINT8_NV   = 7,
        VK_COMPONENT_TYPE_UINT16_NV  = 8,
        VK_COMPONENT_TYPE_UINT32_NV  = 9,
        VK_COMPONENT_TYPE_UINT64_NV  = 10;

    protected NVCooperativeMatrix() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceCooperativeMatrixPropertiesNV ] ---

    /** {@code VkResult vkGetPhysicalDeviceCooperativeMatrixPropertiesNV(VkPhysicalDevice physicalDevice, uint32_t * pPropertyCount, VkCooperativeMatrixPropertiesNV * pProperties)} */
    public static int nvkGetPhysicalDeviceCooperativeMatrixPropertiesNV(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCooperativeMatrixPropertiesNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pPropertyCount, pProperties, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceCooperativeMatrixPropertiesNV(VkPhysicalDevice physicalDevice, uint32_t * pPropertyCount, VkCooperativeMatrixPropertiesNV * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCooperativeMatrixPropertiesNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkCooperativeMatrixPropertiesNV *") VkCooperativeMatrixPropertiesNV.@Nullable Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceCooperativeMatrixPropertiesNV(physicalDevice, memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    /** {@code VkResult vkGetPhysicalDeviceCooperativeMatrixPropertiesNV(VkPhysicalDevice physicalDevice, uint32_t * pPropertyCount, VkCooperativeMatrixPropertiesNV * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCooperativeMatrixPropertiesNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkCooperativeMatrixPropertiesNV *") VkCooperativeMatrixPropertiesNV.@Nullable Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCooperativeMatrixPropertiesNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        return callPPPI(physicalDevice.address(), pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

}