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

public class KHRPipelineExecutableProperties {

    public static final int VK_KHR_PIPELINE_EXECUTABLE_PROPERTIES_SPEC_VERSION = 1;

    public static final String VK_KHR_PIPELINE_EXECUTABLE_PROPERTIES_EXTENSION_NAME = "VK_KHR_pipeline_executable_properties";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_EXECUTABLE_PROPERTIES_FEATURES_KHR = 1000269000,
        VK_STRUCTURE_TYPE_PIPELINE_INFO_KHR                                           = 1000269001,
        VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_PROPERTIES_KHR                          = 1000269002,
        VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR                                = 1000269003,
        VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_STATISTIC_KHR                           = 1000269004,
        VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR             = 1000269005;

    public static final int
        VK_PIPELINE_CREATE_CAPTURE_STATISTICS_BIT_KHR               = 0x40,
        VK_PIPELINE_CREATE_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR = 0x80;

    public static final int
        VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_BOOL32_KHR  = 0,
        VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_INT64_KHR   = 1,
        VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_UINT64_KHR  = 2,
        VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_FLOAT64_KHR = 3;

    protected KHRPipelineExecutableProperties() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPipelineExecutablePropertiesKHR ] ---

    /** {@code VkResult vkGetPipelineExecutablePropertiesKHR(VkDevice device, VkPipelineInfoKHR const * pPipelineInfo, uint32_t * pExecutableCount, VkPipelineExecutablePropertiesKHR * pProperties)} */
    public static int nvkGetPipelineExecutablePropertiesKHR(VkDevice device, long pPipelineInfo, long pExecutableCount, long pProperties) {
        long __functionAddress = device.getCapabilities().vkGetPipelineExecutablePropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pPipelineInfo, pExecutableCount, pProperties, __functionAddress);
    }

    /** {@code VkResult vkGetPipelineExecutablePropertiesKHR(VkDevice device, VkPipelineInfoKHR const * pPipelineInfo, uint32_t * pExecutableCount, VkPipelineExecutablePropertiesKHR * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetPipelineExecutablePropertiesKHR(VkDevice device, @NativeType("VkPipelineInfoKHR const *") VkPipelineInfoKHR pPipelineInfo, @NativeType("uint32_t *") IntBuffer pExecutableCount, @NativeType("VkPipelineExecutablePropertiesKHR *") VkPipelineExecutablePropertiesKHR.@Nullable Buffer pProperties) {
        if (CHECKS) {
            check(pExecutableCount, 1);
            checkSafe(pProperties, pExecutableCount.get(pExecutableCount.position()));
        }
        return nvkGetPipelineExecutablePropertiesKHR(device, pPipelineInfo.address(), memAddress(pExecutableCount), memAddressSafe(pProperties));
    }

    // --- [ vkGetPipelineExecutableStatisticsKHR ] ---

    /** {@code VkResult vkGetPipelineExecutableStatisticsKHR(VkDevice device, VkPipelineExecutableInfoKHR const * pExecutableInfo, uint32_t * pStatisticCount, VkPipelineExecutableStatisticKHR * pStatistics)} */
    public static int nvkGetPipelineExecutableStatisticsKHR(VkDevice device, long pExecutableInfo, long pStatisticCount, long pStatistics) {
        long __functionAddress = device.getCapabilities().vkGetPipelineExecutableStatisticsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pExecutableInfo, pStatisticCount, pStatistics, __functionAddress);
    }

    /** {@code VkResult vkGetPipelineExecutableStatisticsKHR(VkDevice device, VkPipelineExecutableInfoKHR const * pExecutableInfo, uint32_t * pStatisticCount, VkPipelineExecutableStatisticKHR * pStatistics)} */
    @NativeType("VkResult")
    public static int vkGetPipelineExecutableStatisticsKHR(VkDevice device, @NativeType("VkPipelineExecutableInfoKHR const *") VkPipelineExecutableInfoKHR pExecutableInfo, @NativeType("uint32_t *") IntBuffer pStatisticCount, @NativeType("VkPipelineExecutableStatisticKHR *") VkPipelineExecutableStatisticKHR.@Nullable Buffer pStatistics) {
        if (CHECKS) {
            check(pStatisticCount, 1);
            checkSafe(pStatistics, pStatisticCount.get(pStatisticCount.position()));
        }
        return nvkGetPipelineExecutableStatisticsKHR(device, pExecutableInfo.address(), memAddress(pStatisticCount), memAddressSafe(pStatistics));
    }

    // --- [ vkGetPipelineExecutableInternalRepresentationsKHR ] ---

    /** {@code VkResult vkGetPipelineExecutableInternalRepresentationsKHR(VkDevice device, VkPipelineExecutableInfoKHR const * pExecutableInfo, uint32_t * pInternalRepresentationCount, VkPipelineExecutableInternalRepresentationKHR * pInternalRepresentations)} */
    public static int nvkGetPipelineExecutableInternalRepresentationsKHR(VkDevice device, long pExecutableInfo, long pInternalRepresentationCount, long pInternalRepresentations) {
        long __functionAddress = device.getCapabilities().vkGetPipelineExecutableInternalRepresentationsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pExecutableInfo, pInternalRepresentationCount, pInternalRepresentations, __functionAddress);
    }

    /** {@code VkResult vkGetPipelineExecutableInternalRepresentationsKHR(VkDevice device, VkPipelineExecutableInfoKHR const * pExecutableInfo, uint32_t * pInternalRepresentationCount, VkPipelineExecutableInternalRepresentationKHR * pInternalRepresentations)} */
    @NativeType("VkResult")
    public static int vkGetPipelineExecutableInternalRepresentationsKHR(VkDevice device, @NativeType("VkPipelineExecutableInfoKHR const *") VkPipelineExecutableInfoKHR pExecutableInfo, @NativeType("uint32_t *") IntBuffer pInternalRepresentationCount, @NativeType("VkPipelineExecutableInternalRepresentationKHR *") VkPipelineExecutableInternalRepresentationKHR.@Nullable Buffer pInternalRepresentations) {
        if (CHECKS) {
            check(pInternalRepresentationCount, 1);
            checkSafe(pInternalRepresentations, pInternalRepresentationCount.get(pInternalRepresentationCount.position()));
        }
        return nvkGetPipelineExecutableInternalRepresentationsKHR(device, pExecutableInfo.address(), memAddress(pInternalRepresentationCount), memAddressSafe(pInternalRepresentations));
    }

    /** {@code VkResult vkGetPipelineExecutablePropertiesKHR(VkDevice device, VkPipelineInfoKHR const * pPipelineInfo, uint32_t * pExecutableCount, VkPipelineExecutablePropertiesKHR * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetPipelineExecutablePropertiesKHR(VkDevice device, @NativeType("VkPipelineInfoKHR const *") VkPipelineInfoKHR pPipelineInfo, @NativeType("uint32_t *") int[] pExecutableCount, @NativeType("VkPipelineExecutablePropertiesKHR *") VkPipelineExecutablePropertiesKHR.@Nullable Buffer pProperties) {
        long __functionAddress = device.getCapabilities().vkGetPipelineExecutablePropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pExecutableCount, 1);
            checkSafe(pProperties, pExecutableCount[0]);
        }
        return callPPPPI(device.address(), pPipelineInfo.address(), pExecutableCount, memAddressSafe(pProperties), __functionAddress);
    }

    /** {@code VkResult vkGetPipelineExecutableStatisticsKHR(VkDevice device, VkPipelineExecutableInfoKHR const * pExecutableInfo, uint32_t * pStatisticCount, VkPipelineExecutableStatisticKHR * pStatistics)} */
    @NativeType("VkResult")
    public static int vkGetPipelineExecutableStatisticsKHR(VkDevice device, @NativeType("VkPipelineExecutableInfoKHR const *") VkPipelineExecutableInfoKHR pExecutableInfo, @NativeType("uint32_t *") int[] pStatisticCount, @NativeType("VkPipelineExecutableStatisticKHR *") VkPipelineExecutableStatisticKHR.@Nullable Buffer pStatistics) {
        long __functionAddress = device.getCapabilities().vkGetPipelineExecutableStatisticsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pStatisticCount, 1);
            checkSafe(pStatistics, pStatisticCount[0]);
        }
        return callPPPPI(device.address(), pExecutableInfo.address(), pStatisticCount, memAddressSafe(pStatistics), __functionAddress);
    }

    /** {@code VkResult vkGetPipelineExecutableInternalRepresentationsKHR(VkDevice device, VkPipelineExecutableInfoKHR const * pExecutableInfo, uint32_t * pInternalRepresentationCount, VkPipelineExecutableInternalRepresentationKHR * pInternalRepresentations)} */
    @NativeType("VkResult")
    public static int vkGetPipelineExecutableInternalRepresentationsKHR(VkDevice device, @NativeType("VkPipelineExecutableInfoKHR const *") VkPipelineExecutableInfoKHR pExecutableInfo, @NativeType("uint32_t *") int[] pInternalRepresentationCount, @NativeType("VkPipelineExecutableInternalRepresentationKHR *") VkPipelineExecutableInternalRepresentationKHR.@Nullable Buffer pInternalRepresentations) {
        long __functionAddress = device.getCapabilities().vkGetPipelineExecutableInternalRepresentationsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pInternalRepresentationCount, 1);
            checkSafe(pInternalRepresentations, pInternalRepresentationCount[0]);
        }
        return callPPPPI(device.address(), pExecutableInfo.address(), pInternalRepresentationCount, memAddressSafe(pInternalRepresentations), __functionAddress);
    }

}