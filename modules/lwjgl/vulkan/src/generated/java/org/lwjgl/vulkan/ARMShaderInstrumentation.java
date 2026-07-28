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

public class ARMShaderInstrumentation {

    public static final int VK_ARM_SHADER_INSTRUMENTATION_SPEC_VERSION = 1;

    public static final String VK_ARM_SHADER_INSTRUMENTATION_EXTENSION_NAME = "VK_ARM_shader_instrumentation";

    public static final int VK_OBJECT_TYPE_SHADER_INSTRUMENTATION_ARM = 1000607000;

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INSTRUMENTATION_FEATURES_ARM   = 1000607000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INSTRUMENTATION_PROPERTIES_ARM = 1000607001,
        VK_STRUCTURE_TYPE_SHADER_INSTRUMENTATION_CREATE_INFO_ARM                = 1000607002,
        VK_STRUCTURE_TYPE_SHADER_INSTRUMENTATION_METRIC_DESCRIPTION_ARM         = 1000607003;

    public static final long VK_PIPELINE_CREATE_2_INSTRUMENT_SHADERS_BIT_ARM = 0x8000000000L;

    public static final int VK_SHADER_CREATE_INSTRUMENT_SHADER_BIT_ARM = 0x800;

    protected ARMShaderInstrumentation() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkEnumeratePhysicalDeviceShaderInstrumentationMetricsARM ] ---

    /** {@code VkResult vkEnumeratePhysicalDeviceShaderInstrumentationMetricsARM(VkPhysicalDevice physicalDevice, uint32_t * pDescriptionCount, VkShaderInstrumentationMetricDescriptionARM * pDescriptions)} */
    public static int nvkEnumeratePhysicalDeviceShaderInstrumentationMetricsARM(VkPhysicalDevice physicalDevice, long pDescriptionCount, long pDescriptions) {
        long __functionAddress = physicalDevice.getCapabilities().vkEnumeratePhysicalDeviceShaderInstrumentationMetricsARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pDescriptionCount, pDescriptions, __functionAddress);
    }

    /** {@code VkResult vkEnumeratePhysicalDeviceShaderInstrumentationMetricsARM(VkPhysicalDevice physicalDevice, uint32_t * pDescriptionCount, VkShaderInstrumentationMetricDescriptionARM * pDescriptions)} */
    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceShaderInstrumentationMetricsARM(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pDescriptionCount, @NativeType("VkShaderInstrumentationMetricDescriptionARM *") VkShaderInstrumentationMetricDescriptionARM.@Nullable Buffer pDescriptions) {
        if (CHECKS) {
            check(pDescriptionCount, 1);
            checkSafe(pDescriptions, pDescriptionCount.get(pDescriptionCount.position()));
        }
        return nvkEnumeratePhysicalDeviceShaderInstrumentationMetricsARM(physicalDevice, memAddress(pDescriptionCount), memAddressSafe(pDescriptions));
    }

    // --- [ vkCreateShaderInstrumentationARM ] ---

    /** {@code VkResult vkCreateShaderInstrumentationARM(VkDevice device, VkShaderInstrumentationCreateInfoARM const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkShaderInstrumentationARM * pInstrumentation)} */
    public static int nvkCreateShaderInstrumentationARM(VkDevice device, long pCreateInfo, long pAllocator, long pInstrumentation) {
        long __functionAddress = device.getCapabilities().vkCreateShaderInstrumentationARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pInstrumentation, __functionAddress);
    }

    /** {@code VkResult vkCreateShaderInstrumentationARM(VkDevice device, VkShaderInstrumentationCreateInfoARM const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkShaderInstrumentationARM * pInstrumentation)} */
    @NativeType("VkResult")
    public static int vkCreateShaderInstrumentationARM(VkDevice device, @NativeType("VkShaderInstrumentationCreateInfoARM const *") VkShaderInstrumentationCreateInfoARM pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkShaderInstrumentationARM *") LongBuffer pInstrumentation) {
        if (CHECKS) {
            check(pInstrumentation, 1);
        }
        return nvkCreateShaderInstrumentationARM(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pInstrumentation));
    }

    // --- [ vkDestroyShaderInstrumentationARM ] ---

    /** {@code void vkDestroyShaderInstrumentationARM(VkDevice device, VkShaderInstrumentationARM instrumentation, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyShaderInstrumentationARM(VkDevice device, long instrumentation, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyShaderInstrumentationARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), instrumentation, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyShaderInstrumentationARM(VkDevice device, VkShaderInstrumentationARM instrumentation, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyShaderInstrumentationARM(VkDevice device, @NativeType("VkShaderInstrumentationARM") long instrumentation, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyShaderInstrumentationARM(device, instrumentation, memAddressSafe(pAllocator));
    }

    // --- [ vkCmdBeginShaderInstrumentationARM ] ---

    /** {@code void vkCmdBeginShaderInstrumentationARM(VkCommandBuffer commandBuffer, VkShaderInstrumentationARM instrumentation)} */
    public static void vkCmdBeginShaderInstrumentationARM(VkCommandBuffer commandBuffer, @NativeType("VkShaderInstrumentationARM") long instrumentation) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginShaderInstrumentationARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(commandBuffer.address(), instrumentation, __functionAddress);
    }

    // --- [ vkCmdEndShaderInstrumentationARM ] ---

    /** {@code void vkCmdEndShaderInstrumentationARM(VkCommandBuffer commandBuffer)} */
    public static void vkCmdEndShaderInstrumentationARM(VkCommandBuffer commandBuffer) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndShaderInstrumentationARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), __functionAddress);
    }

    // --- [ vkGetShaderInstrumentationValuesARM ] ---

    /** {@code VkResult vkGetShaderInstrumentationValuesARM(VkDevice device, VkShaderInstrumentationARM instrumentation, uint32_t * pMetricBlockCount, void * pMetricValues, VkShaderInstrumentationValuesFlagsARM flags)} */
    public static int nvkGetShaderInstrumentationValuesARM(VkDevice device, long instrumentation, long pMetricBlockCount, long pMetricValues, int flags) {
        long __functionAddress = device.getCapabilities().vkGetShaderInstrumentationValuesARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), instrumentation, pMetricBlockCount, pMetricValues, flags, __functionAddress);
    }

    /** {@code VkResult vkGetShaderInstrumentationValuesARM(VkDevice device, VkShaderInstrumentationARM instrumentation, uint32_t * pMetricBlockCount, void * pMetricValues, VkShaderInstrumentationValuesFlagsARM flags)} */
    @NativeType("VkResult")
    public static int vkGetShaderInstrumentationValuesARM(VkDevice device, @NativeType("VkShaderInstrumentationARM") long instrumentation, @NativeType("uint32_t *") IntBuffer pMetricBlockCount, @NativeType("void *") ByteBuffer pMetricValues, @NativeType("VkShaderInstrumentationValuesFlagsARM") int flags) {
        if (CHECKS) {
            check(pMetricBlockCount, 1);
            check(pMetricValues, 1);
        }
        return nvkGetShaderInstrumentationValuesARM(device, instrumentation, memAddress(pMetricBlockCount), memAddress(pMetricValues), flags);
    }

    // --- [ vkClearShaderInstrumentationMetricsARM ] ---

    /** {@code void vkClearShaderInstrumentationMetricsARM(VkDevice device, VkShaderInstrumentationARM instrumentation)} */
    public static void vkClearShaderInstrumentationMetricsARM(VkDevice device, @NativeType("VkShaderInstrumentationARM") long instrumentation) {
        long __functionAddress = device.getCapabilities().vkClearShaderInstrumentationMetricsARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(device.address(), instrumentation, __functionAddress);
    }

    /** {@code VkResult vkEnumeratePhysicalDeviceShaderInstrumentationMetricsARM(VkPhysicalDevice physicalDevice, uint32_t * pDescriptionCount, VkShaderInstrumentationMetricDescriptionARM * pDescriptions)} */
    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceShaderInstrumentationMetricsARM(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pDescriptionCount, @NativeType("VkShaderInstrumentationMetricDescriptionARM *") VkShaderInstrumentationMetricDescriptionARM.@Nullable Buffer pDescriptions) {
        long __functionAddress = physicalDevice.getCapabilities().vkEnumeratePhysicalDeviceShaderInstrumentationMetricsARM;
        if (CHECKS) {
            check(__functionAddress);
            check(pDescriptionCount, 1);
            checkSafe(pDescriptions, pDescriptionCount[0]);
        }
        return callPPPI(physicalDevice.address(), pDescriptionCount, memAddressSafe(pDescriptions), __functionAddress);
    }

    /** {@code VkResult vkCreateShaderInstrumentationARM(VkDevice device, VkShaderInstrumentationCreateInfoARM const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkShaderInstrumentationARM * pInstrumentation)} */
    @NativeType("VkResult")
    public static int vkCreateShaderInstrumentationARM(VkDevice device, @NativeType("VkShaderInstrumentationCreateInfoARM const *") VkShaderInstrumentationCreateInfoARM pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkShaderInstrumentationARM *") long[] pInstrumentation) {
        long __functionAddress = device.getCapabilities().vkCreateShaderInstrumentationARM;
        if (CHECKS) {
            check(__functionAddress);
            check(pInstrumentation, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pInstrumentation, __functionAddress);
    }

    /** {@code VkResult vkGetShaderInstrumentationValuesARM(VkDevice device, VkShaderInstrumentationARM instrumentation, uint32_t * pMetricBlockCount, void * pMetricValues, VkShaderInstrumentationValuesFlagsARM flags)} */
    @NativeType("VkResult")
    public static int vkGetShaderInstrumentationValuesARM(VkDevice device, @NativeType("VkShaderInstrumentationARM") long instrumentation, @NativeType("uint32_t *") int[] pMetricBlockCount, @NativeType("void *") ByteBuffer pMetricValues, @NativeType("VkShaderInstrumentationValuesFlagsARM") int flags) {
        long __functionAddress = device.getCapabilities().vkGetShaderInstrumentationValuesARM;
        if (CHECKS) {
            check(__functionAddress);
            check(pMetricBlockCount, 1);
            check(pMetricValues, 1);
        }
        return callPJPPI(device.address(), instrumentation, pMetricBlockCount, memAddress(pMetricValues), flags, __functionAddress);
    }

}