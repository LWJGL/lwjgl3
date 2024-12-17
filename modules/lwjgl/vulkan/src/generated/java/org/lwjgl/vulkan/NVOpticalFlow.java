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

public class NVOpticalFlow {

    public static final int VK_NV_OPTICAL_FLOW_SPEC_VERSION = 1;

    public static final String VK_NV_OPTICAL_FLOW_EXTENSION_NAME = "VK_NV_optical_flow";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_FEATURES_NV         = 1000464000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_PROPERTIES_NV       = 1000464001,
        VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_INFO_NV                = 1000464002,
        VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_PROPERTIES_NV          = 1000464003,
        VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_INFO_NV              = 1000464004,
        VK_STRUCTURE_TYPE_OPTICAL_FLOW_EXECUTE_INFO_NV                     = 1000464005,
        VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV = 1000464010;

    public static final int
        VK_FORMAT_R16G16_SFIXED5_NV = 1000464000,
        VK_FORMAT_R16G16_S10_5_NV   = 1000464000;

    public static final int VK_OBJECT_TYPE_OPTICAL_FLOW_SESSION_NV = 1000464000;

    public static final int VK_QUEUE_OPTICAL_FLOW_BIT_NV = 0x100;

    public static final long VK_PIPELINE_STAGE_2_OPTICAL_FLOW_BIT_NV = 0x20000000L;

    public static final long
        VK_ACCESS_2_OPTICAL_FLOW_READ_BIT_NV  = 0x40000000000L,
        VK_ACCESS_2_OPTICAL_FLOW_WRITE_BIT_NV = 0x80000000000L;

    public static final long
        VK_FORMAT_FEATURE_2_OPTICAL_FLOW_IMAGE_BIT_NV  = 0x10000000000L,
        VK_FORMAT_FEATURE_2_OPTICAL_FLOW_VECTOR_BIT_NV = 0x20000000000L,
        VK_FORMAT_FEATURE_2_OPTICAL_FLOW_COST_BIT_NV   = 0x40000000000L;

    public static final int
        VK_OPTICAL_FLOW_GRID_SIZE_UNKNOWN_NV = 0,
        VK_OPTICAL_FLOW_GRID_SIZE_1X1_BIT_NV = 0x1,
        VK_OPTICAL_FLOW_GRID_SIZE_2X2_BIT_NV = 0x2,
        VK_OPTICAL_FLOW_GRID_SIZE_4X4_BIT_NV = 0x4,
        VK_OPTICAL_FLOW_GRID_SIZE_8X8_BIT_NV = 0x8;

    public static final int
        VK_OPTICAL_FLOW_USAGE_UNKNOWN_NV         = 0,
        VK_OPTICAL_FLOW_USAGE_INPUT_BIT_NV       = 0x1,
        VK_OPTICAL_FLOW_USAGE_OUTPUT_BIT_NV      = 0x2,
        VK_OPTICAL_FLOW_USAGE_HINT_BIT_NV        = 0x4,
        VK_OPTICAL_FLOW_USAGE_COST_BIT_NV        = 0x8,
        VK_OPTICAL_FLOW_USAGE_GLOBAL_FLOW_BIT_NV = 0x10;

    public static final int
        VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_UNKNOWN_NV = 0,
        VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_SLOW_NV    = 1,
        VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_MEDIUM_NV  = 2,
        VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_FAST_NV    = 3;

    public static final int
        VK_OPTICAL_FLOW_SESSION_BINDING_POINT_UNKNOWN_NV              = 0,
        VK_OPTICAL_FLOW_SESSION_BINDING_POINT_INPUT_NV                = 1,
        VK_OPTICAL_FLOW_SESSION_BINDING_POINT_REFERENCE_NV            = 2,
        VK_OPTICAL_FLOW_SESSION_BINDING_POINT_HINT_NV                 = 3,
        VK_OPTICAL_FLOW_SESSION_BINDING_POINT_FLOW_VECTOR_NV          = 4,
        VK_OPTICAL_FLOW_SESSION_BINDING_POINT_BACKWARD_FLOW_VECTOR_NV = 5,
        VK_OPTICAL_FLOW_SESSION_BINDING_POINT_COST_NV                 = 6,
        VK_OPTICAL_FLOW_SESSION_BINDING_POINT_BACKWARD_COST_NV        = 7,
        VK_OPTICAL_FLOW_SESSION_BINDING_POINT_GLOBAL_FLOW_NV          = 8;

    public static final int
        VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_HINT_BIT_NV        = 0x1,
        VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_COST_BIT_NV        = 0x2,
        VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_GLOBAL_FLOW_BIT_NV = 0x4,
        VK_OPTICAL_FLOW_SESSION_CREATE_ALLOW_REGIONS_BIT_NV      = 0x8,
        VK_OPTICAL_FLOW_SESSION_CREATE_BOTH_DIRECTIONS_BIT_NV    = 0x10;

    public static final int VK_OPTICAL_FLOW_EXECUTE_DISABLE_TEMPORAL_HINTS_BIT_NV = 0x1;

    protected NVOpticalFlow() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceOpticalFlowImageFormatsNV ] ---

    /** {@code VkResult vkGetPhysicalDeviceOpticalFlowImageFormatsNV(VkPhysicalDevice physicalDevice, VkOpticalFlowImageFormatInfoNV const * pOpticalFlowImageFormatInfo, uint32_t * pFormatCount, VkOpticalFlowImageFormatPropertiesNV * pImageFormatProperties)} */
    public static int nvkGetPhysicalDeviceOpticalFlowImageFormatsNV(VkPhysicalDevice physicalDevice, long pOpticalFlowImageFormatInfo, long pFormatCount, long pImageFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceOpticalFlowImageFormatsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(physicalDevice.address(), pOpticalFlowImageFormatInfo, pFormatCount, pImageFormatProperties, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceOpticalFlowImageFormatsNV(VkPhysicalDevice physicalDevice, VkOpticalFlowImageFormatInfoNV const * pOpticalFlowImageFormatInfo, uint32_t * pFormatCount, VkOpticalFlowImageFormatPropertiesNV * pImageFormatProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceOpticalFlowImageFormatsNV(VkPhysicalDevice physicalDevice, @NativeType("VkOpticalFlowImageFormatInfoNV const *") VkOpticalFlowImageFormatInfoNV pOpticalFlowImageFormatInfo, @NativeType("uint32_t *") IntBuffer pFormatCount, @NativeType("VkOpticalFlowImageFormatPropertiesNV *") VkOpticalFlowImageFormatPropertiesNV.@Nullable Buffer pImageFormatProperties) {
        if (CHECKS) {
            check(pFormatCount, 1);
            checkSafe(pImageFormatProperties, pFormatCount.get(pFormatCount.position()));
        }
        return nvkGetPhysicalDeviceOpticalFlowImageFormatsNV(physicalDevice, pOpticalFlowImageFormatInfo.address(), memAddress(pFormatCount), memAddressSafe(pImageFormatProperties));
    }

    // --- [ vkCreateOpticalFlowSessionNV ] ---

    /** {@code VkResult vkCreateOpticalFlowSessionNV(VkDevice device, VkOpticalFlowSessionCreateInfoNV const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkOpticalFlowSessionNV * pSession)} */
    public static int nvkCreateOpticalFlowSessionNV(VkDevice device, long pCreateInfo, long pAllocator, long pSession) {
        long __functionAddress = device.getCapabilities().vkCreateOpticalFlowSessionNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pSession, __functionAddress);
    }

    /** {@code VkResult vkCreateOpticalFlowSessionNV(VkDevice device, VkOpticalFlowSessionCreateInfoNV const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkOpticalFlowSessionNV * pSession)} */
    @NativeType("VkResult")
    public static int vkCreateOpticalFlowSessionNV(VkDevice device, @NativeType("VkOpticalFlowSessionCreateInfoNV const *") VkOpticalFlowSessionCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkOpticalFlowSessionNV *") LongBuffer pSession) {
        if (CHECKS) {
            check(pSession, 1);
        }
        return nvkCreateOpticalFlowSessionNV(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pSession));
    }

    // --- [ vkDestroyOpticalFlowSessionNV ] ---

    /** {@code void vkDestroyOpticalFlowSessionNV(VkDevice device, VkOpticalFlowSessionNV session, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyOpticalFlowSessionNV(VkDevice device, long session, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyOpticalFlowSessionNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), session, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyOpticalFlowSessionNV(VkDevice device, VkOpticalFlowSessionNV session, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyOpticalFlowSessionNV(VkDevice device, @NativeType("VkOpticalFlowSessionNV") long session, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyOpticalFlowSessionNV(device, session, memAddressSafe(pAllocator));
    }

    // --- [ vkBindOpticalFlowSessionImageNV ] ---

    /** {@code VkResult vkBindOpticalFlowSessionImageNV(VkDevice device, VkOpticalFlowSessionNV session, VkOpticalFlowSessionBindingPointNV bindingPoint, VkImageView view, VkImageLayout layout)} */
    @NativeType("VkResult")
    public static int vkBindOpticalFlowSessionImageNV(VkDevice device, @NativeType("VkOpticalFlowSessionNV") long session, @NativeType("VkOpticalFlowSessionBindingPointNV") int bindingPoint, @NativeType("VkImageView") long view, @NativeType("VkImageLayout") int layout) {
        long __functionAddress = device.getCapabilities().vkBindOpticalFlowSessionImageNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJJI(device.address(), session, bindingPoint, view, layout, __functionAddress);
    }

    // --- [ vkCmdOpticalFlowExecuteNV ] ---

    /** {@code void vkCmdOpticalFlowExecuteNV(VkCommandBuffer commandBuffer, VkOpticalFlowSessionNV session, VkOpticalFlowExecuteInfoNV const * pExecuteInfo)} */
    public static void nvkCmdOpticalFlowExecuteNV(VkCommandBuffer commandBuffer, long session, long pExecuteInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdOpticalFlowExecuteNV;
        if (CHECKS) {
            check(__functionAddress);
            VkOpticalFlowExecuteInfoNV.validate(pExecuteInfo);
        }
        callPJPV(commandBuffer.address(), session, pExecuteInfo, __functionAddress);
    }

    /** {@code void vkCmdOpticalFlowExecuteNV(VkCommandBuffer commandBuffer, VkOpticalFlowSessionNV session, VkOpticalFlowExecuteInfoNV const * pExecuteInfo)} */
    public static void vkCmdOpticalFlowExecuteNV(VkCommandBuffer commandBuffer, @NativeType("VkOpticalFlowSessionNV") long session, @NativeType("VkOpticalFlowExecuteInfoNV const *") VkOpticalFlowExecuteInfoNV pExecuteInfo) {
        nvkCmdOpticalFlowExecuteNV(commandBuffer, session, pExecuteInfo.address());
    }

    /** {@code VkResult vkGetPhysicalDeviceOpticalFlowImageFormatsNV(VkPhysicalDevice physicalDevice, VkOpticalFlowImageFormatInfoNV const * pOpticalFlowImageFormatInfo, uint32_t * pFormatCount, VkOpticalFlowImageFormatPropertiesNV * pImageFormatProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceOpticalFlowImageFormatsNV(VkPhysicalDevice physicalDevice, @NativeType("VkOpticalFlowImageFormatInfoNV const *") VkOpticalFlowImageFormatInfoNV pOpticalFlowImageFormatInfo, @NativeType("uint32_t *") int[] pFormatCount, @NativeType("VkOpticalFlowImageFormatPropertiesNV *") VkOpticalFlowImageFormatPropertiesNV.@Nullable Buffer pImageFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceOpticalFlowImageFormatsNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pFormatCount, 1);
            checkSafe(pImageFormatProperties, pFormatCount[0]);
        }
        return callPPPPI(physicalDevice.address(), pOpticalFlowImageFormatInfo.address(), pFormatCount, memAddressSafe(pImageFormatProperties), __functionAddress);
    }

    /** {@code VkResult vkCreateOpticalFlowSessionNV(VkDevice device, VkOpticalFlowSessionCreateInfoNV const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkOpticalFlowSessionNV * pSession)} */
    @NativeType("VkResult")
    public static int vkCreateOpticalFlowSessionNV(VkDevice device, @NativeType("VkOpticalFlowSessionCreateInfoNV const *") VkOpticalFlowSessionCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkOpticalFlowSessionNV *") long[] pSession) {
        long __functionAddress = device.getCapabilities().vkCreateOpticalFlowSessionNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pSession, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pSession, __functionAddress);
    }

}