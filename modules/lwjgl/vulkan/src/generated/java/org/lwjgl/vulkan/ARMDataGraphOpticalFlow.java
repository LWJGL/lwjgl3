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

public class ARMDataGraphOpticalFlow {

    public static final int VK_ARM_DATA_GRAPH_OPTICAL_FLOW_SPEC_VERSION = 1;

    public static final String VK_ARM_DATA_GRAPH_OPTICAL_FLOW_EXTENSION_NAME = "VK_ARM_data_graph_optical_flow";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_OPTICAL_FLOW_FEATURES_ARM = 1000631000,
        VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_OPTICAL_FLOW_PROPERTIES_ARM  = 1000631001,
        VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_OPTICAL_FLOW_CREATE_INFO_ARM     = 1000631002,
        VK_STRUCTURE_TYPE_DATA_GRAPH_OPTICAL_FLOW_IMAGE_FORMAT_INFO_ARM        = 1000631003,
        VK_STRUCTURE_TYPE_DATA_GRAPH_OPTICAL_FLOW_IMAGE_FORMAT_PROPERTIES_ARM  = 1000631004,
        VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_OPTICAL_FLOW_DISPATCH_INFO_ARM   = 1000631005,
        VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_RESOURCE_INFO_IMAGE_LAYOUT_ARM   = 1000631006,
        VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SINGLE_NODE_CREATE_INFO_ARM      = 1000631007,
        VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SINGLE_NODE_CONNECTION_ARM       = 1000631008;

    public static final long
        VK_FORMAT_FEATURE_2_DATA_GRAPH_OPTICAL_FLOW_IMAGE_BIT_ARM  = 0x100000000000000L,
        VK_FORMAT_FEATURE_2_DATA_GRAPH_OPTICAL_FLOW_VECTOR_BIT_ARM = 0x200000000000000L,
        VK_FORMAT_FEATURE_2_DATA_GRAPH_OPTICAL_FLOW_COST_BIT_ARM   = 0x400000000000000L;

    public static final int VK_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_TYPE_OPTICAL_FLOW_ARM = 1000631000;

    public static final int
        VK_DATA_GRAPH_PIPELINE_NODE_CONNECTION_TYPE_OPTICAL_FLOW_INPUT_ARM       = 1000631000,
        VK_DATA_GRAPH_PIPELINE_NODE_CONNECTION_TYPE_OPTICAL_FLOW_REFERENCE_ARM   = 1000631001,
        VK_DATA_GRAPH_PIPELINE_NODE_CONNECTION_TYPE_OPTICAL_FLOW_HINT_ARM        = 1000631002,
        VK_DATA_GRAPH_PIPELINE_NODE_CONNECTION_TYPE_OPTICAL_FLOW_FLOW_VECTOR_ARM = 1000631003,
        VK_DATA_GRAPH_PIPELINE_NODE_CONNECTION_TYPE_OPTICAL_FLOW_COST_ARM        = 1000631004;

    public static final int VK_DATA_GRAPH_PIPELINE_NODE_TYPE_OPTICAL_FLOW_ARM = 1000631000;

    public static final long VK_DATA_GRAPH_PIPELINE_SESSION_CREATE_OPTICAL_FLOW_CACHE_BIT_ARM = 0x2L;

    public static final int VK_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_OPTICAL_FLOW_CACHE_ARM = 1000631001;

    public static final int
        VK_DATA_GRAPH_OPTICAL_FLOW_IMAGE_USAGE_UNKNOWN_ARM    = 0,
        VK_DATA_GRAPH_OPTICAL_FLOW_IMAGE_USAGE_INPUT_BIT_ARM  = 0x1,
        VK_DATA_GRAPH_OPTICAL_FLOW_IMAGE_USAGE_OUTPUT_BIT_ARM = 0x2,
        VK_DATA_GRAPH_OPTICAL_FLOW_IMAGE_USAGE_HINT_BIT_ARM   = 0x4,
        VK_DATA_GRAPH_OPTICAL_FLOW_IMAGE_USAGE_COST_BIT_ARM   = 0x8;

    public static final int
        VK_DATA_GRAPH_OPTICAL_FLOW_CREATE_ENABLE_HINT_BIT_ARM = 0x1,
        VK_DATA_GRAPH_OPTICAL_FLOW_CREATE_ENABLE_COST_BIT_ARM = 0x2,
        VK_DATA_GRAPH_OPTICAL_FLOW_CREATE_RESERVED_30_BIT_ARM = 0x40000000;

    public static final int
        VK_DATA_GRAPH_OPTICAL_FLOW_PERFORMANCE_LEVEL_UNKNOWN_ARM = 0,
        VK_DATA_GRAPH_OPTICAL_FLOW_PERFORMANCE_LEVEL_SLOW_ARM    = 1,
        VK_DATA_GRAPH_OPTICAL_FLOW_PERFORMANCE_LEVEL_MEDIUM_ARM  = 2,
        VK_DATA_GRAPH_OPTICAL_FLOW_PERFORMANCE_LEVEL_FAST_ARM    = 3;

    public static final int
        VK_DATA_GRAPH_OPTICAL_FLOW_GRID_SIZE_UNKNOWN_ARM = 0,
        VK_DATA_GRAPH_OPTICAL_FLOW_GRID_SIZE_1X1_BIT_ARM = 0x1,
        VK_DATA_GRAPH_OPTICAL_FLOW_GRID_SIZE_2X2_BIT_ARM = 0x2,
        VK_DATA_GRAPH_OPTICAL_FLOW_GRID_SIZE_4X4_BIT_ARM = 0x4,
        VK_DATA_GRAPH_OPTICAL_FLOW_GRID_SIZE_8X8_BIT_ARM = 0x8;

    public static final int
        VK_DATA_GRAPH_OPTICAL_FLOW_EXECUTE_DISABLE_TEMPORAL_HINTS_BIT_ARM      = 0x1,
        VK_DATA_GRAPH_OPTICAL_FLOW_EXECUTE_INPUT_UNCHANGED_BIT_ARM             = 0x2,
        VK_DATA_GRAPH_OPTICAL_FLOW_EXECUTE_REFERENCE_UNCHANGED_BIT_ARM         = 0x4,
        VK_DATA_GRAPH_OPTICAL_FLOW_EXECUTE_INPUT_IS_PREVIOUS_REFERENCE_BIT_ARM = 0x8,
        VK_DATA_GRAPH_OPTICAL_FLOW_EXECUTE_REFERENCE_IS_PREVIOUS_INPUT_BIT_ARM = 0x10;

    protected ARMDataGraphOpticalFlow() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceQueueFamilyDataGraphOpticalFlowImageFormatsARM ] ---

    /** {@code VkResult vkGetPhysicalDeviceQueueFamilyDataGraphOpticalFlowImageFormatsARM(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, VkQueueFamilyDataGraphPropertiesARM const * pQueueFamilyDataGraphProperties, VkDataGraphOpticalFlowImageFormatInfoARM const * pOpticalFlowImageFormatInfo, uint32_t * pFormatCount, VkDataGraphOpticalFlowImageFormatPropertiesARM * pImageFormatProperties)} */
    public static int nvkGetPhysicalDeviceQueueFamilyDataGraphOpticalFlowImageFormatsARM(VkPhysicalDevice physicalDevice, int queueFamilyIndex, long pQueueFamilyDataGraphProperties, long pOpticalFlowImageFormatInfo, long pFormatCount, long pImageFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyDataGraphOpticalFlowImageFormatsARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPI(physicalDevice.address(), queueFamilyIndex, pQueueFamilyDataGraphProperties, pOpticalFlowImageFormatInfo, pFormatCount, pImageFormatProperties, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceQueueFamilyDataGraphOpticalFlowImageFormatsARM(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, VkQueueFamilyDataGraphPropertiesARM const * pQueueFamilyDataGraphProperties, VkDataGraphOpticalFlowImageFormatInfoARM const * pOpticalFlowImageFormatInfo, uint32_t * pFormatCount, VkDataGraphOpticalFlowImageFormatPropertiesARM * pImageFormatProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceQueueFamilyDataGraphOpticalFlowImageFormatsARM(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("VkQueueFamilyDataGraphPropertiesARM const *") VkQueueFamilyDataGraphPropertiesARM pQueueFamilyDataGraphProperties, @NativeType("VkDataGraphOpticalFlowImageFormatInfoARM const *") VkDataGraphOpticalFlowImageFormatInfoARM pOpticalFlowImageFormatInfo, @NativeType("uint32_t *") IntBuffer pFormatCount, @NativeType("VkDataGraphOpticalFlowImageFormatPropertiesARM *") VkDataGraphOpticalFlowImageFormatPropertiesARM.@Nullable Buffer pImageFormatProperties) {
        if (CHECKS) {
            check(pFormatCount, 1);
            checkSafe(pImageFormatProperties, pFormatCount.get(pFormatCount.position()));
        }
        return nvkGetPhysicalDeviceQueueFamilyDataGraphOpticalFlowImageFormatsARM(physicalDevice, queueFamilyIndex, pQueueFamilyDataGraphProperties.address(), pOpticalFlowImageFormatInfo.address(), memAddress(pFormatCount), memAddressSafe(pImageFormatProperties));
    }

    // --- [ vkGetPhysicalDeviceQueueFamilyDataGraphEngineOperationPropertiesARM ] ---

    /** {@code VkResult vkGetPhysicalDeviceQueueFamilyDataGraphEngineOperationPropertiesARM(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, VkQueueFamilyDataGraphPropertiesARM const * pQueueFamilyDataGraphProperties, VkBaseOutStructure * pProperties)} */
    public static int nvkGetPhysicalDeviceQueueFamilyDataGraphEngineOperationPropertiesARM(VkPhysicalDevice physicalDevice, int queueFamilyIndex, long pQueueFamilyDataGraphProperties, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyDataGraphEngineOperationPropertiesARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), queueFamilyIndex, pQueueFamilyDataGraphProperties, pProperties, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceQueueFamilyDataGraphEngineOperationPropertiesARM(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, VkQueueFamilyDataGraphPropertiesARM const * pQueueFamilyDataGraphProperties, VkBaseOutStructure * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceQueueFamilyDataGraphEngineOperationPropertiesARM(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("VkQueueFamilyDataGraphPropertiesARM const *") VkQueueFamilyDataGraphPropertiesARM pQueueFamilyDataGraphProperties, @NativeType("VkBaseOutStructure *") @Nullable VkBaseOutStructure pProperties) {
        return nvkGetPhysicalDeviceQueueFamilyDataGraphEngineOperationPropertiesARM(physicalDevice, queueFamilyIndex, pQueueFamilyDataGraphProperties.address(), memAddressSafe(pProperties));
    }

    /** {@code VkResult vkGetPhysicalDeviceQueueFamilyDataGraphOpticalFlowImageFormatsARM(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, VkQueueFamilyDataGraphPropertiesARM const * pQueueFamilyDataGraphProperties, VkDataGraphOpticalFlowImageFormatInfoARM const * pOpticalFlowImageFormatInfo, uint32_t * pFormatCount, VkDataGraphOpticalFlowImageFormatPropertiesARM * pImageFormatProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceQueueFamilyDataGraphOpticalFlowImageFormatsARM(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("VkQueueFamilyDataGraphPropertiesARM const *") VkQueueFamilyDataGraphPropertiesARM pQueueFamilyDataGraphProperties, @NativeType("VkDataGraphOpticalFlowImageFormatInfoARM const *") VkDataGraphOpticalFlowImageFormatInfoARM pOpticalFlowImageFormatInfo, @NativeType("uint32_t *") int[] pFormatCount, @NativeType("VkDataGraphOpticalFlowImageFormatPropertiesARM *") VkDataGraphOpticalFlowImageFormatPropertiesARM.@Nullable Buffer pImageFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyDataGraphOpticalFlowImageFormatsARM;
        if (CHECKS) {
            check(__functionAddress);
            check(pFormatCount, 1);
            checkSafe(pImageFormatProperties, pFormatCount[0]);
        }
        return callPPPPPI(physicalDevice.address(), queueFamilyIndex, pQueueFamilyDataGraphProperties.address(), pOpticalFlowImageFormatInfo.address(), pFormatCount, memAddressSafe(pImageFormatProperties), __functionAddress);
    }

}