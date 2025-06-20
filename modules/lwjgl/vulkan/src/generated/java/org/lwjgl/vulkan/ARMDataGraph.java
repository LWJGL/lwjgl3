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

public class ARMDataGraph {

    public static final int VK_ARM_DATA_GRAPH_SPEC_VERSION = 1;

    public static final String VK_ARM_DATA_GRAPH_EXTENSION_NAME = "VK_ARM_data_graph";

    public static final int
        VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CREATE_INFO_ARM                                   = 1000507000,
        VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_CREATE_INFO_ARM                           = 1000507001,
        VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_RESOURCE_INFO_ARM                                 = 1000507002,
        VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_ARM                                      = 1000507003,
        VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_MEMORY_REQUIREMENTS_INFO_ARM              = 1000507004,
        VK_STRUCTURE_TYPE_BIND_DATA_GRAPH_PIPELINE_SESSION_MEMORY_INFO_ARM                      = 1000507005,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_FEATURES_ARM                               = 1000507006,
        VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SHADER_MODULE_CREATE_INFO_ARM                     = 1000507007,
        VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_PROPERTY_QUERY_RESULT_ARM                         = 1000507008,
        VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_INFO_ARM                                          = 1000507009,
        VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_COMPILER_CONTROL_CREATE_INFO_ARM                  = 1000507010,
        VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENTS_INFO_ARM          = 1000507011,
        VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENT_ARM                = 1000507012,
        VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_IDENTIFIER_CREATE_INFO_ARM                        = 1000507013,
        VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_DISPATCH_INFO_ARM                                 = 1000507014,
        VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_CONSTANT_TENSOR_SEMI_STRUCTURED_SPARSITY_INFO_ARM = 1000507015,
        VK_STRUCTURE_TYPE_DATA_GRAPH_PROCESSING_ENGINE_CREATE_INFO_ARM                          = 1000507016,
        VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_PROPERTIES_ARM              = 1000507017,
        VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROPERTIES_ARM                                = 1000507018,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_INFO_ARM    = 1000507019;

    public static final int VK_OBJECT_TYPE_DATA_GRAPH_PIPELINE_SESSION_ARM = 1000507000;

    public static final int VK_PIPELINE_BIND_POINT_DATA_GRAPH_ARM = 1000507000;

    public static final int VK_QUEUE_DATA_GRAPH_BIT_ARM = 0x400;

    public static final long VK_PIPELINE_STAGE_2_DATA_GRAPH_BIT_ARM = 0x40000000000L;

    public static final long
        VK_ACCESS_2_DATA_GRAPH_READ_BIT_ARM  = 0x800000000000L,
        VK_ACCESS_2_DATA_GRAPH_WRITE_BIT_ARM = 0x1000000000000L;

    public static final long VK_TENSOR_USAGE_DATA_GRAPH_BIT_ARM = 0x20L;

    public static final long VK_FORMAT_FEATURE_2_TENSOR_DATA_GRAPH_BIT_ARM = 0x1000000000000L;

    public static final long VK_BUFFER_USAGE_2_DATA_GRAPH_FOREIGN_DESCRIPTOR_BIT_ARM = 0x20000000L;

    public static final int VK_MAX_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_SET_NAME_SIZE_ARM = 128;

    public static final int VK_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_TRANSIENT_ARM = 0;

    public static final int VK_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_TYPE_MEMORY_ARM = 0;

    public static final long VK_DATA_GRAPH_PIPELINE_SESSION_CREATE_PROTECTED_BIT_ARM = 0x1L;

    public static final int
        VK_DATA_GRAPH_PIPELINE_PROPERTY_CREATION_LOG_ARM = 0,
        VK_DATA_GRAPH_PIPELINE_PROPERTY_IDENTIFIER_ARM   = 1;

    public static final int VK_PHYSICAL_DEVICE_DATA_GRAPH_PROCESSING_ENGINE_TYPE_DEFAULT_ARM = 0;

    public static final int VK_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_TYPE_SPIRV_EXTENDED_INSTRUCTION_SET_ARM = 0;

    protected ARMDataGraph() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateDataGraphPipelinesARM ] ---

    /** {@code VkResult vkCreateDataGraphPipelinesARM(VkDevice device, VkDeferredOperationKHR deferredOperation, VkPipelineCache pipelineCache, uint32_t createInfoCount, VkDataGraphPipelineCreateInfoARM const * pCreateInfos, VkAllocationCallbacks const * pAllocator, VkPipeline * pPipelines)} */
    public static int nvkCreateDataGraphPipelinesARM(VkDevice device, long deferredOperation, long pipelineCache, int createInfoCount, long pCreateInfos, long pAllocator, long pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateDataGraphPipelinesARM;
        if (CHECKS) {
            check(__functionAddress);
            Struct.validate(pCreateInfos, createInfoCount, VkDataGraphPipelineCreateInfoARM.SIZEOF, VkDataGraphPipelineCreateInfoARM::validate);
        }
        return callPJJPPPI(device.address(), deferredOperation, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines, __functionAddress);
    }

    /** {@code VkResult vkCreateDataGraphPipelinesARM(VkDevice device, VkDeferredOperationKHR deferredOperation, VkPipelineCache pipelineCache, uint32_t createInfoCount, VkDataGraphPipelineCreateInfoARM const * pCreateInfos, VkAllocationCallbacks const * pAllocator, VkPipeline * pPipelines)} */
    @NativeType("VkResult")
    public static int vkCreateDataGraphPipelinesARM(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkDataGraphPipelineCreateInfoARM const *") VkDataGraphPipelineCreateInfoARM.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") LongBuffer pPipelines) {
        if (CHECKS) {
            check(pPipelines, pCreateInfos.remaining());
        }
        return nvkCreateDataGraphPipelinesARM(device, deferredOperation, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), memAddress(pPipelines));
    }

    // --- [ vkCreateDataGraphPipelineSessionARM ] ---

    /** {@code VkResult vkCreateDataGraphPipelineSessionARM(VkDevice device, VkDataGraphPipelineSessionCreateInfoARM const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkDataGraphPipelineSessionARM * pSession)} */
    public static int nvkCreateDataGraphPipelineSessionARM(VkDevice device, long pCreateInfo, long pAllocator, long pSession) {
        long __functionAddress = device.getCapabilities().vkCreateDataGraphPipelineSessionARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pSession, __functionAddress);
    }

    /** {@code VkResult vkCreateDataGraphPipelineSessionARM(VkDevice device, VkDataGraphPipelineSessionCreateInfoARM const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkDataGraphPipelineSessionARM * pSession)} */
    @NativeType("VkResult")
    public static int vkCreateDataGraphPipelineSessionARM(VkDevice device, @NativeType("VkDataGraphPipelineSessionCreateInfoARM const *") VkDataGraphPipelineSessionCreateInfoARM pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkDataGraphPipelineSessionARM *") LongBuffer pSession) {
        if (CHECKS) {
            check(pSession, 1);
        }
        return nvkCreateDataGraphPipelineSessionARM(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pSession));
    }

    // --- [ vkGetDataGraphPipelineSessionBindPointRequirementsARM ] ---

    /** {@code VkResult vkGetDataGraphPipelineSessionBindPointRequirementsARM(VkDevice device, VkDataGraphPipelineSessionBindPointRequirementsInfoARM const * pInfo, uint32_t * pBindPointRequirementCount, VkDataGraphPipelineSessionBindPointRequirementARM * pBindPointRequirements)} */
    public static int nvkGetDataGraphPipelineSessionBindPointRequirementsARM(VkDevice device, long pInfo, long pBindPointRequirementCount, long pBindPointRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDataGraphPipelineSessionBindPointRequirementsARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pInfo, pBindPointRequirementCount, pBindPointRequirements, __functionAddress);
    }

    /** {@code VkResult vkGetDataGraphPipelineSessionBindPointRequirementsARM(VkDevice device, VkDataGraphPipelineSessionBindPointRequirementsInfoARM const * pInfo, uint32_t * pBindPointRequirementCount, VkDataGraphPipelineSessionBindPointRequirementARM * pBindPointRequirements)} */
    @NativeType("VkResult")
    public static int vkGetDataGraphPipelineSessionBindPointRequirementsARM(VkDevice device, @NativeType("VkDataGraphPipelineSessionBindPointRequirementsInfoARM const *") VkDataGraphPipelineSessionBindPointRequirementsInfoARM pInfo, @NativeType("uint32_t *") IntBuffer pBindPointRequirementCount, @NativeType("VkDataGraphPipelineSessionBindPointRequirementARM *") VkDataGraphPipelineSessionBindPointRequirementARM.@Nullable Buffer pBindPointRequirements) {
        if (CHECKS) {
            check(pBindPointRequirementCount, 1);
            checkSafe(pBindPointRequirements, pBindPointRequirementCount.get(pBindPointRequirementCount.position()));
        }
        return nvkGetDataGraphPipelineSessionBindPointRequirementsARM(device, pInfo.address(), memAddress(pBindPointRequirementCount), memAddressSafe(pBindPointRequirements));
    }

    // --- [ vkGetDataGraphPipelineSessionMemoryRequirementsARM ] ---

    /** {@code void vkGetDataGraphPipelineSessionMemoryRequirementsARM(VkDevice device, VkDataGraphPipelineSessionMemoryRequirementsInfoARM const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void nvkGetDataGraphPipelineSessionMemoryRequirementsARM(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDataGraphPipelineSessionMemoryRequirementsARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    /** {@code void vkGetDataGraphPipelineSessionMemoryRequirementsARM(VkDevice device, VkDataGraphPipelineSessionMemoryRequirementsInfoARM const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void vkGetDataGraphPipelineSessionMemoryRequirementsARM(VkDevice device, @NativeType("VkDataGraphPipelineSessionMemoryRequirementsInfoARM const *") VkDataGraphPipelineSessionMemoryRequirementsInfoARM pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetDataGraphPipelineSessionMemoryRequirementsARM(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkBindDataGraphPipelineSessionMemoryARM ] ---

    /** {@code VkResult vkBindDataGraphPipelineSessionMemoryARM(VkDevice device, uint32_t bindInfoCount, VkBindDataGraphPipelineSessionMemoryInfoARM const * pBindInfos)} */
    public static int nvkBindDataGraphPipelineSessionMemoryARM(VkDevice device, int bindInfoCount, long pBindInfos) {
        long __functionAddress = device.getCapabilities().vkBindDataGraphPipelineSessionMemoryARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), bindInfoCount, pBindInfos, __functionAddress);
    }

    /** {@code VkResult vkBindDataGraphPipelineSessionMemoryARM(VkDevice device, uint32_t bindInfoCount, VkBindDataGraphPipelineSessionMemoryInfoARM const * pBindInfos)} */
    @NativeType("VkResult")
    public static int vkBindDataGraphPipelineSessionMemoryARM(VkDevice device, @NativeType("VkBindDataGraphPipelineSessionMemoryInfoARM const *") VkBindDataGraphPipelineSessionMemoryInfoARM.Buffer pBindInfos) {
        return nvkBindDataGraphPipelineSessionMemoryARM(device, pBindInfos.remaining(), pBindInfos.address());
    }

    // --- [ vkDestroyDataGraphPipelineSessionARM ] ---

    /** {@code void vkDestroyDataGraphPipelineSessionARM(VkDevice device, VkDataGraphPipelineSessionARM session, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyDataGraphPipelineSessionARM(VkDevice device, long session, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyDataGraphPipelineSessionARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), session, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyDataGraphPipelineSessionARM(VkDevice device, VkDataGraphPipelineSessionARM session, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyDataGraphPipelineSessionARM(VkDevice device, @NativeType("VkDataGraphPipelineSessionARM") long session, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyDataGraphPipelineSessionARM(device, session, memAddressSafe(pAllocator));
    }

    // --- [ vkCmdDispatchDataGraphARM ] ---

    /** {@code void vkCmdDispatchDataGraphARM(VkCommandBuffer commandBuffer, VkDataGraphPipelineSessionARM session, VkDataGraphPipelineDispatchInfoARM const * pInfo)} */
    public static void nvkCmdDispatchDataGraphARM(VkCommandBuffer commandBuffer, long session, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDispatchDataGraphARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(commandBuffer.address(), session, pInfo, __functionAddress);
    }

    /** {@code void vkCmdDispatchDataGraphARM(VkCommandBuffer commandBuffer, VkDataGraphPipelineSessionARM session, VkDataGraphPipelineDispatchInfoARM const * pInfo)} */
    public static void vkCmdDispatchDataGraphARM(VkCommandBuffer commandBuffer, @NativeType("VkDataGraphPipelineSessionARM") long session, @NativeType("VkDataGraphPipelineDispatchInfoARM const *") @Nullable VkDataGraphPipelineDispatchInfoARM pInfo) {
        nvkCmdDispatchDataGraphARM(commandBuffer, session, memAddressSafe(pInfo));
    }

    // --- [ vkGetDataGraphPipelineAvailablePropertiesARM ] ---

    /** {@code VkResult vkGetDataGraphPipelineAvailablePropertiesARM(VkDevice device, VkDataGraphPipelineInfoARM const * pPipelineInfo, uint32_t * pPropertiesCount, VkDataGraphPipelinePropertyARM * pProperties)} */
    public static int nvkGetDataGraphPipelineAvailablePropertiesARM(VkDevice device, long pPipelineInfo, long pPropertiesCount, long pProperties) {
        long __functionAddress = device.getCapabilities().vkGetDataGraphPipelineAvailablePropertiesARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pPipelineInfo, pPropertiesCount, pProperties, __functionAddress);
    }

    /** {@code VkResult vkGetDataGraphPipelineAvailablePropertiesARM(VkDevice device, VkDataGraphPipelineInfoARM const * pPipelineInfo, uint32_t * pPropertiesCount, VkDataGraphPipelinePropertyARM * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetDataGraphPipelineAvailablePropertiesARM(VkDevice device, @NativeType("VkDataGraphPipelineInfoARM const *") VkDataGraphPipelineInfoARM pPipelineInfo, @NativeType("uint32_t *") IntBuffer pPropertiesCount, @NativeType("VkDataGraphPipelinePropertyARM *") @Nullable IntBuffer pProperties) {
        if (CHECKS) {
            check(pPropertiesCount, 1);
            checkSafe(pProperties, pPropertiesCount.get(pPropertiesCount.position()));
        }
        return nvkGetDataGraphPipelineAvailablePropertiesARM(device, pPipelineInfo.address(), memAddress(pPropertiesCount), memAddressSafe(pProperties));
    }

    // --- [ vkGetDataGraphPipelinePropertiesARM ] ---

    /** {@code VkResult vkGetDataGraphPipelinePropertiesARM(VkDevice device, VkDataGraphPipelineInfoARM const * pPipelineInfo, uint32_t propertiesCount, VkDataGraphPipelinePropertyQueryResultARM * pProperties)} */
    public static int nvkGetDataGraphPipelinePropertiesARM(VkDevice device, long pPipelineInfo, int propertiesCount, long pProperties) {
        long __functionAddress = device.getCapabilities().vkGetDataGraphPipelinePropertiesARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pPipelineInfo, propertiesCount, pProperties, __functionAddress);
    }

    /** {@code VkResult vkGetDataGraphPipelinePropertiesARM(VkDevice device, VkDataGraphPipelineInfoARM const * pPipelineInfo, uint32_t propertiesCount, VkDataGraphPipelinePropertyQueryResultARM * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetDataGraphPipelinePropertiesARM(VkDevice device, @NativeType("VkDataGraphPipelineInfoARM const *") VkDataGraphPipelineInfoARM pPipelineInfo, @NativeType("VkDataGraphPipelinePropertyQueryResultARM *") VkDataGraphPipelinePropertyQueryResultARM.Buffer pProperties) {
        return nvkGetDataGraphPipelinePropertiesARM(device, pPipelineInfo.address(), pProperties.remaining(), pProperties.address());
    }

    // --- [ vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM ] ---

    /** {@code VkResult vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, uint32_t * pQueueFamilyDataGraphPropertyCount, VkQueueFamilyDataGraphPropertiesARM * pQueueFamilyDataGraphProperties)} */
    public static int nvkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM(VkPhysicalDevice physicalDevice, int queueFamilyIndex, long pQueueFamilyDataGraphPropertyCount, long pQueueFamilyDataGraphProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), queueFamilyIndex, pQueueFamilyDataGraphPropertyCount, pQueueFamilyDataGraphProperties, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, uint32_t * pQueueFamilyDataGraphPropertyCount, VkQueueFamilyDataGraphPropertiesARM * pQueueFamilyDataGraphProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("uint32_t *") IntBuffer pQueueFamilyDataGraphPropertyCount, @NativeType("VkQueueFamilyDataGraphPropertiesARM *") VkQueueFamilyDataGraphPropertiesARM.@Nullable Buffer pQueueFamilyDataGraphProperties) {
        if (CHECKS) {
            check(pQueueFamilyDataGraphPropertyCount, 1);
            checkSafe(pQueueFamilyDataGraphProperties, pQueueFamilyDataGraphPropertyCount.get(pQueueFamilyDataGraphPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM(physicalDevice, queueFamilyIndex, memAddress(pQueueFamilyDataGraphPropertyCount), memAddressSafe(pQueueFamilyDataGraphProperties));
    }

    // --- [ vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM ] ---

    /** {@code void vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM(VkPhysicalDevice physicalDevice, VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM const * pQueueFamilyDataGraphProcessingEngineInfo, VkQueueFamilyDataGraphProcessingEnginePropertiesARM * pQueueFamilyDataGraphProcessingEngineProperties)} */
    public static void nvkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM(VkPhysicalDevice physicalDevice, long pQueueFamilyDataGraphProcessingEngineInfo, long pQueueFamilyDataGraphProcessingEngineProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(physicalDevice.address(), pQueueFamilyDataGraphProcessingEngineInfo, pQueueFamilyDataGraphProcessingEngineProperties, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM(VkPhysicalDevice physicalDevice, VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM const * pQueueFamilyDataGraphProcessingEngineInfo, VkQueueFamilyDataGraphProcessingEnginePropertiesARM * pQueueFamilyDataGraphProcessingEngineProperties)} */
    public static void vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM const *") VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM pQueueFamilyDataGraphProcessingEngineInfo, @NativeType("VkQueueFamilyDataGraphProcessingEnginePropertiesARM *") VkQueueFamilyDataGraphProcessingEnginePropertiesARM pQueueFamilyDataGraphProcessingEngineProperties) {
        nvkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM(physicalDevice, pQueueFamilyDataGraphProcessingEngineInfo.address(), pQueueFamilyDataGraphProcessingEngineProperties.address());
    }

    /** {@code VkResult vkCreateDataGraphPipelinesARM(VkDevice device, VkDeferredOperationKHR deferredOperation, VkPipelineCache pipelineCache, uint32_t createInfoCount, VkDataGraphPipelineCreateInfoARM const * pCreateInfos, VkAllocationCallbacks const * pAllocator, VkPipeline * pPipelines)} */
    @NativeType("VkResult")
    public static int vkCreateDataGraphPipelinesARM(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkPipelineCache") long pipelineCache, @NativeType("VkDataGraphPipelineCreateInfoARM const *") VkDataGraphPipelineCreateInfoARM.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkPipeline *") long[] pPipelines) {
        long __functionAddress = device.getCapabilities().vkCreateDataGraphPipelinesARM;
        if (CHECKS) {
            check(__functionAddress);
            check(pPipelines, pCreateInfos.remaining());
            Struct.validate(pCreateInfos.address(), pCreateInfos.remaining(), VkDataGraphPipelineCreateInfoARM.SIZEOF, VkDataGraphPipelineCreateInfoARM::validate);
        }
        return callPJJPPPI(device.address(), deferredOperation, pipelineCache, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), pPipelines, __functionAddress);
    }

    /** {@code VkResult vkCreateDataGraphPipelineSessionARM(VkDevice device, VkDataGraphPipelineSessionCreateInfoARM const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkDataGraphPipelineSessionARM * pSession)} */
    @NativeType("VkResult")
    public static int vkCreateDataGraphPipelineSessionARM(VkDevice device, @NativeType("VkDataGraphPipelineSessionCreateInfoARM const *") VkDataGraphPipelineSessionCreateInfoARM pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkDataGraphPipelineSessionARM *") long[] pSession) {
        long __functionAddress = device.getCapabilities().vkCreateDataGraphPipelineSessionARM;
        if (CHECKS) {
            check(__functionAddress);
            check(pSession, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pSession, __functionAddress);
    }

    /** {@code VkResult vkGetDataGraphPipelineSessionBindPointRequirementsARM(VkDevice device, VkDataGraphPipelineSessionBindPointRequirementsInfoARM const * pInfo, uint32_t * pBindPointRequirementCount, VkDataGraphPipelineSessionBindPointRequirementARM * pBindPointRequirements)} */
    @NativeType("VkResult")
    public static int vkGetDataGraphPipelineSessionBindPointRequirementsARM(VkDevice device, @NativeType("VkDataGraphPipelineSessionBindPointRequirementsInfoARM const *") VkDataGraphPipelineSessionBindPointRequirementsInfoARM pInfo, @NativeType("uint32_t *") int[] pBindPointRequirementCount, @NativeType("VkDataGraphPipelineSessionBindPointRequirementARM *") VkDataGraphPipelineSessionBindPointRequirementARM.@Nullable Buffer pBindPointRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDataGraphPipelineSessionBindPointRequirementsARM;
        if (CHECKS) {
            check(__functionAddress);
            check(pBindPointRequirementCount, 1);
            checkSafe(pBindPointRequirements, pBindPointRequirementCount[0]);
        }
        return callPPPPI(device.address(), pInfo.address(), pBindPointRequirementCount, memAddressSafe(pBindPointRequirements), __functionAddress);
    }

    /** {@code VkResult vkGetDataGraphPipelineAvailablePropertiesARM(VkDevice device, VkDataGraphPipelineInfoARM const * pPipelineInfo, uint32_t * pPropertiesCount, VkDataGraphPipelinePropertyARM * pProperties)} */
    @NativeType("VkResult")
    public static int vkGetDataGraphPipelineAvailablePropertiesARM(VkDevice device, @NativeType("VkDataGraphPipelineInfoARM const *") VkDataGraphPipelineInfoARM pPipelineInfo, @NativeType("uint32_t *") int[] pPropertiesCount, @NativeType("VkDataGraphPipelinePropertyARM *") int @Nullable [] pProperties) {
        long __functionAddress = device.getCapabilities().vkGetDataGraphPipelineAvailablePropertiesARM;
        if (CHECKS) {
            check(__functionAddress);
            check(pPropertiesCount, 1);
            checkSafe(pProperties, pPropertiesCount[0]);
        }
        return callPPPPI(device.address(), pPipelineInfo.address(), pPropertiesCount, pProperties, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, uint32_t * pQueueFamilyDataGraphPropertyCount, VkQueueFamilyDataGraphPropertiesARM * pQueueFamilyDataGraphProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("uint32_t *") int[] pQueueFamilyDataGraphPropertyCount, @NativeType("VkQueueFamilyDataGraphPropertiesARM *") VkQueueFamilyDataGraphPropertiesARM.@Nullable Buffer pQueueFamilyDataGraphProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM;
        if (CHECKS) {
            check(__functionAddress);
            check(pQueueFamilyDataGraphPropertyCount, 1);
            checkSafe(pQueueFamilyDataGraphProperties, pQueueFamilyDataGraphPropertyCount[0]);
        }
        return callPPPI(physicalDevice.address(), queueFamilyIndex, pQueueFamilyDataGraphPropertyCount, memAddressSafe(pQueueFamilyDataGraphProperties), __functionAddress);
    }

}