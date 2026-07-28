/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ARMDataGraphInstructionSetTosa {

    public static final int VK_ARM_DATA_GRAPH_INSTRUCTION_SET_TOSA_SPEC_VERSION = 1;

    public static final String VK_ARM_DATA_GRAPH_INSTRUCTION_SET_TOSA_EXTENSION_NAME = "VK_ARM_data_graph_instruction_set_tosa";

    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_TOSA_PROPERTIES_ARM = 1000508000;

    public static final int VK_MAX_DATA_GRAPH_TOSA_NAME_SIZE_ARM = 128;

    public static final int
        VK_DATA_GRAPH_TOSA_QUALITY_ACCELERATED_ARM  = 0x1,
        VK_DATA_GRAPH_TOSA_QUALITY_CONFORMANT_ARM   = 0x2,
        VK_DATA_GRAPH_TOSA_QUALITY_EXPERIMENTAL_ARM = 0x4,
        VK_DATA_GRAPH_TOSA_QUALITY_DEPRECATED_ARM   = 0x8;

    public static final int
        VK_DATA_GRAPH_TOSA_LEVEL_NONE_ARM = 0,
        VK_DATA_GRAPH_TOSA_LEVEL_8K_ARM   = 1;

    protected ARMDataGraphInstructionSetTosa() {
        throw new UnsupportedOperationException();
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

}