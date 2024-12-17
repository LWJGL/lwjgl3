/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class INTELPerformanceQuery {

    public static final int VK_INTEL_PERFORMANCE_QUERY_SPEC_VERSION = 2;

    public static final String VK_INTEL_PERFORMANCE_QUERY_EXTENSION_NAME = "VK_INTEL_performance_query";

    public static final int
        VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL = 1000210000,
        VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO_INTEL                   = 1000210000,
        VK_STRUCTURE_TYPE_INITIALIZE_PERFORMANCE_API_INFO_INTEL          = 1000210001,
        VK_STRUCTURE_TYPE_PERFORMANCE_MARKER_INFO_INTEL                  = 1000210002,
        VK_STRUCTURE_TYPE_PERFORMANCE_STREAM_MARKER_INFO_INTEL           = 1000210003,
        VK_STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL                = 1000210004,
        VK_STRUCTURE_TYPE_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO_INTEL   = 1000210005;

    public static final int VK_QUERY_TYPE_PERFORMANCE_QUERY_INTEL = 1000210000;

    public static final int VK_OBJECT_TYPE_PERFORMANCE_CONFIGURATION_INTEL = 1000210000;

    public static final int VK_PERFORMANCE_CONFIGURATION_TYPE_COMMAND_QUEUE_METRICS_DISCOVERY_ACTIVATED_INTEL = 0;

    public static final int VK_QUERY_POOL_SAMPLING_MODE_MANUAL_INTEL = 0;

    public static final int
        VK_PERFORMANCE_OVERRIDE_TYPE_NULL_HARDWARE_INTEL    = 0,
        VK_PERFORMANCE_OVERRIDE_TYPE_FLUSH_GPU_CACHES_INTEL = 1;

    public static final int
        VK_PERFORMANCE_PARAMETER_TYPE_HW_COUNTERS_SUPPORTED_INTEL    = 0,
        VK_PERFORMANCE_PARAMETER_TYPE_STREAM_MARKER_VALID_BITS_INTEL = 1;

    public static final int
        VK_PERFORMANCE_VALUE_TYPE_UINT32_INTEL = 0,
        VK_PERFORMANCE_VALUE_TYPE_UINT64_INTEL = 1,
        VK_PERFORMANCE_VALUE_TYPE_FLOAT_INTEL  = 2,
        VK_PERFORMANCE_VALUE_TYPE_BOOL_INTEL   = 3,
        VK_PERFORMANCE_VALUE_TYPE_STRING_INTEL = 4;

    protected INTELPerformanceQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkInitializePerformanceApiINTEL ] ---

    /** {@code VkResult vkInitializePerformanceApiINTEL(VkDevice device, VkInitializePerformanceApiInfoINTEL const * pInitializeInfo)} */
    public static int nvkInitializePerformanceApiINTEL(VkDevice device, long pInitializeInfo) {
        long __functionAddress = device.getCapabilities().vkInitializePerformanceApiINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pInitializeInfo, __functionAddress);
    }

    /** {@code VkResult vkInitializePerformanceApiINTEL(VkDevice device, VkInitializePerformanceApiInfoINTEL const * pInitializeInfo)} */
    @NativeType("VkResult")
    public static int vkInitializePerformanceApiINTEL(VkDevice device, @NativeType("VkInitializePerformanceApiInfoINTEL const *") VkInitializePerformanceApiInfoINTEL pInitializeInfo) {
        return nvkInitializePerformanceApiINTEL(device, pInitializeInfo.address());
    }

    // --- [ vkUninitializePerformanceApiINTEL ] ---

    /** {@code void vkUninitializePerformanceApiINTEL(VkDevice device)} */
    public static void vkUninitializePerformanceApiINTEL(VkDevice device) {
        long __functionAddress = device.getCapabilities().vkUninitializePerformanceApiINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(device.address(), __functionAddress);
    }

    // --- [ vkCmdSetPerformanceMarkerINTEL ] ---

    /** {@code VkResult vkCmdSetPerformanceMarkerINTEL(VkCommandBuffer commandBuffer, VkPerformanceMarkerInfoINTEL const * pMarkerInfo)} */
    public static int nvkCmdSetPerformanceMarkerINTEL(VkCommandBuffer commandBuffer, long pMarkerInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPerformanceMarkerINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(commandBuffer.address(), pMarkerInfo, __functionAddress);
    }

    /** {@code VkResult vkCmdSetPerformanceMarkerINTEL(VkCommandBuffer commandBuffer, VkPerformanceMarkerInfoINTEL const * pMarkerInfo)} */
    @NativeType("VkResult")
    public static int vkCmdSetPerformanceMarkerINTEL(VkCommandBuffer commandBuffer, @NativeType("VkPerformanceMarkerInfoINTEL const *") VkPerformanceMarkerInfoINTEL pMarkerInfo) {
        return nvkCmdSetPerformanceMarkerINTEL(commandBuffer, pMarkerInfo.address());
    }

    // --- [ vkCmdSetPerformanceStreamMarkerINTEL ] ---

    /** {@code VkResult vkCmdSetPerformanceStreamMarkerINTEL(VkCommandBuffer commandBuffer, VkPerformanceStreamMarkerInfoINTEL const * pMarkerInfo)} */
    public static int nvkCmdSetPerformanceStreamMarkerINTEL(VkCommandBuffer commandBuffer, long pMarkerInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPerformanceStreamMarkerINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(commandBuffer.address(), pMarkerInfo, __functionAddress);
    }

    /** {@code VkResult vkCmdSetPerformanceStreamMarkerINTEL(VkCommandBuffer commandBuffer, VkPerformanceStreamMarkerInfoINTEL const * pMarkerInfo)} */
    @NativeType("VkResult")
    public static int vkCmdSetPerformanceStreamMarkerINTEL(VkCommandBuffer commandBuffer, @NativeType("VkPerformanceStreamMarkerInfoINTEL const *") VkPerformanceStreamMarkerInfoINTEL pMarkerInfo) {
        return nvkCmdSetPerformanceStreamMarkerINTEL(commandBuffer, pMarkerInfo.address());
    }

    // --- [ vkCmdSetPerformanceOverrideINTEL ] ---

    /** {@code VkResult vkCmdSetPerformanceOverrideINTEL(VkCommandBuffer commandBuffer, VkPerformanceOverrideInfoINTEL const * pOverrideInfo)} */
    public static int nvkCmdSetPerformanceOverrideINTEL(VkCommandBuffer commandBuffer, long pOverrideInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPerformanceOverrideINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(commandBuffer.address(), pOverrideInfo, __functionAddress);
    }

    /** {@code VkResult vkCmdSetPerformanceOverrideINTEL(VkCommandBuffer commandBuffer, VkPerformanceOverrideInfoINTEL const * pOverrideInfo)} */
    @NativeType("VkResult")
    public static int vkCmdSetPerformanceOverrideINTEL(VkCommandBuffer commandBuffer, @NativeType("VkPerformanceOverrideInfoINTEL const *") VkPerformanceOverrideInfoINTEL pOverrideInfo) {
        return nvkCmdSetPerformanceOverrideINTEL(commandBuffer, pOverrideInfo.address());
    }

    // --- [ vkAcquirePerformanceConfigurationINTEL ] ---

    /** {@code VkResult vkAcquirePerformanceConfigurationINTEL(VkDevice device, VkPerformanceConfigurationAcquireInfoINTEL const * pAcquireInfo, VkPerformanceConfigurationINTEL * pConfiguration)} */
    public static int nvkAcquirePerformanceConfigurationINTEL(VkDevice device, long pAcquireInfo, long pConfiguration) {
        long __functionAddress = device.getCapabilities().vkAcquirePerformanceConfigurationINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pAcquireInfo, pConfiguration, __functionAddress);
    }

    /** {@code VkResult vkAcquirePerformanceConfigurationINTEL(VkDevice device, VkPerformanceConfigurationAcquireInfoINTEL const * pAcquireInfo, VkPerformanceConfigurationINTEL * pConfiguration)} */
    @NativeType("VkResult")
    public static int vkAcquirePerformanceConfigurationINTEL(VkDevice device, @NativeType("VkPerformanceConfigurationAcquireInfoINTEL const *") VkPerformanceConfigurationAcquireInfoINTEL pAcquireInfo, @NativeType("VkPerformanceConfigurationINTEL *") LongBuffer pConfiguration) {
        if (CHECKS) {
            check(pConfiguration, 1);
        }
        return nvkAcquirePerformanceConfigurationINTEL(device, pAcquireInfo.address(), memAddress(pConfiguration));
    }

    // --- [ vkReleasePerformanceConfigurationINTEL ] ---

    /** {@code VkResult vkReleasePerformanceConfigurationINTEL(VkDevice device, VkPerformanceConfigurationINTEL configuration)} */
    @NativeType("VkResult")
    public static int vkReleasePerformanceConfigurationINTEL(VkDevice device, @NativeType("VkPerformanceConfigurationINTEL") long configuration) {
        long __functionAddress = device.getCapabilities().vkReleasePerformanceConfigurationINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(device.address(), configuration, __functionAddress);
    }

    // --- [ vkQueueSetPerformanceConfigurationINTEL ] ---

    /** {@code VkResult vkQueueSetPerformanceConfigurationINTEL(VkQueue queue, VkPerformanceConfigurationINTEL configuration)} */
    @NativeType("VkResult")
    public static int vkQueueSetPerformanceConfigurationINTEL(VkQueue queue, @NativeType("VkPerformanceConfigurationINTEL") long configuration) {
        long __functionAddress = queue.getCapabilities().vkQueueSetPerformanceConfigurationINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(queue.address(), configuration, __functionAddress);
    }

    // --- [ vkGetPerformanceParameterINTEL ] ---

    /** {@code VkResult vkGetPerformanceParameterINTEL(VkDevice device, VkPerformanceParameterTypeINTEL parameter, VkPerformanceValueINTEL * pValue)} */
    public static int nvkGetPerformanceParameterINTEL(VkDevice device, int parameter, long pValue) {
        long __functionAddress = device.getCapabilities().vkGetPerformanceParameterINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), parameter, pValue, __functionAddress);
    }

    /** {@code VkResult vkGetPerformanceParameterINTEL(VkDevice device, VkPerformanceParameterTypeINTEL parameter, VkPerformanceValueINTEL * pValue)} */
    @NativeType("VkResult")
    public static int vkGetPerformanceParameterINTEL(VkDevice device, @NativeType("VkPerformanceParameterTypeINTEL") int parameter, @NativeType("VkPerformanceValueINTEL *") VkPerformanceValueINTEL pValue) {
        return nvkGetPerformanceParameterINTEL(device, parameter, pValue.address());
    }

    /** {@code VkResult vkAcquirePerformanceConfigurationINTEL(VkDevice device, VkPerformanceConfigurationAcquireInfoINTEL const * pAcquireInfo, VkPerformanceConfigurationINTEL * pConfiguration)} */
    @NativeType("VkResult")
    public static int vkAcquirePerformanceConfigurationINTEL(VkDevice device, @NativeType("VkPerformanceConfigurationAcquireInfoINTEL const *") VkPerformanceConfigurationAcquireInfoINTEL pAcquireInfo, @NativeType("VkPerformanceConfigurationINTEL *") long[] pConfiguration) {
        long __functionAddress = device.getCapabilities().vkAcquirePerformanceConfigurationINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(pConfiguration, 1);
        }
        return callPPPI(device.address(), pAcquireInfo.address(), pConfiguration, __functionAddress);
    }

}