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

public class NVCooperativeVector {

    public static final int VK_NV_COOPERATIVE_VECTOR_SPEC_VERSION = 4;

    public static final String VK_NV_COOPERATIVE_VECTOR_EXTENSION_NAME = "VK_NV_cooperative_vector";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_FEATURES_NV   = 1000491000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_PROPERTIES_NV = 1000491001,
        VK_STRUCTURE_TYPE_COOPERATIVE_VECTOR_PROPERTIES_NV                 = 1000491002,
        VK_STRUCTURE_TYPE_CONVERT_COOPERATIVE_VECTOR_MATRIX_INFO_NV        = 1000491004;

    public static final int
        VK_COMPONENT_TYPE_SINT8_PACKED_NV = 1000491000,
        VK_COMPONENT_TYPE_UINT8_PACKED_NV = 1000491001,
        VK_COMPONENT_TYPE_FLOAT_E4M3_NV   = 1000491002,
        VK_COMPONENT_TYPE_FLOAT_E5M2_NV   = 1000491003;

    public static final long VK_PIPELINE_STAGE_2_CONVERT_COOPERATIVE_VECTOR_MATRIX_BIT_NV = 0x100000000000L;

    public static final int
        VK_COOPERATIVE_VECTOR_MATRIX_LAYOUT_ROW_MAJOR_NV           = 0,
        VK_COOPERATIVE_VECTOR_MATRIX_LAYOUT_COLUMN_MAJOR_NV        = 1,
        VK_COOPERATIVE_VECTOR_MATRIX_LAYOUT_INFERENCING_OPTIMAL_NV = 2,
        VK_COOPERATIVE_VECTOR_MATRIX_LAYOUT_TRAINING_OPTIMAL_NV    = 3;

    protected NVCooperativeVector() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceCooperativeVectorPropertiesNV ] ---

    /** {@code VkResult vkGetPhysicalDeviceCooperativeVectorPropertiesNV(VkPhysicalDevice physicalDevice, uint32_t * pPropertyCount, VkCooperativeVectorPropertiesNV * pProperties)} */
    public static int nvkGetPhysicalDeviceCooperativeVectorPropertiesNV(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCooperativeVectorPropertiesNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pPropertyCount, pProperties, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceCooperativeVectorPropertiesNV(VkPhysicalDevice physicalDevice, uint32_t * pPropertyCount, VkCooperativeVectorPropertiesNV * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCooperativeVectorPropertiesNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkCooperativeVectorPropertiesNV *") VkCooperativeVectorPropertiesNV.@Nullable Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceCooperativeVectorPropertiesNV(physicalDevice, memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    // --- [ vkConvertCooperativeVectorMatrixNV ] ---

    /** {@code VkResult vkConvertCooperativeVectorMatrixNV(VkDevice device, VkConvertCooperativeVectorMatrixInfoNV const * pInfo)} */
    public static int nvkConvertCooperativeVectorMatrixNV(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkConvertCooperativeVectorMatrixNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pInfo, __functionAddress);
    }

    /** {@code VkResult vkConvertCooperativeVectorMatrixNV(VkDevice device, VkConvertCooperativeVectorMatrixInfoNV const * pInfo)} */
    @NativeType("VkResult")
    public static int vkConvertCooperativeVectorMatrixNV(VkDevice device, @NativeType("VkConvertCooperativeVectorMatrixInfoNV const *") VkConvertCooperativeVectorMatrixInfoNV pInfo) {
        return nvkConvertCooperativeVectorMatrixNV(device, pInfo.address());
    }

    // --- [ vkCmdConvertCooperativeVectorMatrixNV ] ---

    /** {@code void vkCmdConvertCooperativeVectorMatrixNV(VkCommandBuffer commandBuffer, uint32_t infoCount, VkConvertCooperativeVectorMatrixInfoNV const * pInfos)} */
    public static void nvkCmdConvertCooperativeVectorMatrixNV(VkCommandBuffer commandBuffer, int infoCount, long pInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdConvertCooperativeVectorMatrixNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), infoCount, pInfos, __functionAddress);
    }

    /** {@code void vkCmdConvertCooperativeVectorMatrixNV(VkCommandBuffer commandBuffer, uint32_t infoCount, VkConvertCooperativeVectorMatrixInfoNV const * pInfos)} */
    public static void vkCmdConvertCooperativeVectorMatrixNV(VkCommandBuffer commandBuffer, @NativeType("VkConvertCooperativeVectorMatrixInfoNV const *") VkConvertCooperativeVectorMatrixInfoNV.Buffer pInfos) {
        nvkCmdConvertCooperativeVectorMatrixNV(commandBuffer, pInfos.remaining(), pInfos.address());
    }

    /** {@code VkResult vkGetPhysicalDeviceCooperativeVectorPropertiesNV(VkPhysicalDevice physicalDevice, uint32_t * pPropertyCount, VkCooperativeVectorPropertiesNV * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCooperativeVectorPropertiesNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkCooperativeVectorPropertiesNV *") VkCooperativeVectorPropertiesNV.@Nullable Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCooperativeVectorPropertiesNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        return callPPPI(physicalDevice.address(), pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

}