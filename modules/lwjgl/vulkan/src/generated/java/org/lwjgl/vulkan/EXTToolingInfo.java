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

public class EXTToolingInfo {

    public static final int VK_EXT_TOOLING_INFO_SPEC_VERSION = 1;

    public static final String VK_EXT_TOOLING_INFO_EXTENSION_NAME = "VK_EXT_tooling_info";

    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES_EXT = 1000245000;

    public static final int
        VK_TOOL_PURPOSE_VALIDATION_BIT_EXT          = 0x1,
        VK_TOOL_PURPOSE_PROFILING_BIT_EXT           = 0x2,
        VK_TOOL_PURPOSE_TRACING_BIT_EXT             = 0x4,
        VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT_EXT = 0x8,
        VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT_EXT  = 0x10,
        VK_TOOL_PURPOSE_DEBUG_REPORTING_BIT_EXT     = 0x20,
        VK_TOOL_PURPOSE_DEBUG_MARKERS_BIT_EXT       = 0x40;

    protected EXTToolingInfo() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceToolPropertiesEXT ] ---

    /** {@code VkResult vkGetPhysicalDeviceToolPropertiesEXT(VkPhysicalDevice physicalDevice, uint32_t * pToolCount, VkPhysicalDeviceToolProperties * pToolProperties)} */
    public static int nvkGetPhysicalDeviceToolPropertiesEXT(VkPhysicalDevice physicalDevice, long pToolCount, long pToolProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceToolPropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pToolCount, pToolProperties, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceToolPropertiesEXT(VkPhysicalDevice physicalDevice, uint32_t * pToolCount, VkPhysicalDeviceToolProperties * pToolProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceToolPropertiesEXT(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pToolCount, @NativeType("VkPhysicalDeviceToolProperties *") VkPhysicalDeviceToolProperties.@Nullable Buffer pToolProperties) {
        if (CHECKS) {
            check(pToolCount, 1);
            checkSafe(pToolProperties, pToolCount.get(pToolCount.position()));
        }
        return nvkGetPhysicalDeviceToolPropertiesEXT(physicalDevice, memAddress(pToolCount), memAddressSafe(pToolProperties));
    }

    /** {@code VkResult vkGetPhysicalDeviceToolPropertiesEXT(VkPhysicalDevice physicalDevice, uint32_t * pToolCount, VkPhysicalDeviceToolProperties * pToolProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceToolPropertiesEXT(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pToolCount, @NativeType("VkPhysicalDeviceToolProperties *") VkPhysicalDeviceToolProperties.@Nullable Buffer pToolProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceToolPropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pToolCount, 1);
            checkSafe(pToolProperties, pToolCount[0]);
        }
        return callPPPI(physicalDevice.address(), pToolCount, memAddressSafe(pToolProperties), __functionAddress);
    }

}