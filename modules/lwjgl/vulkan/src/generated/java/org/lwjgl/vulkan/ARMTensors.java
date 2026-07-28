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

public class ARMTensors {

    public static final int VK_ARM_TENSORS_SPEC_VERSION = 2;

    public static final String VK_ARM_TENSORS_EXTENSION_NAME = "VK_ARM_tensors";

    public static final int
        VK_STRUCTURE_TYPE_TENSOR_CREATE_INFO_ARM                                  = 1000460000,
        VK_STRUCTURE_TYPE_TENSOR_VIEW_CREATE_INFO_ARM                             = 1000460001,
        VK_STRUCTURE_TYPE_BIND_TENSOR_MEMORY_INFO_ARM                             = 1000460002,
        VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_TENSOR_ARM                         = 1000460003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_PROPERTIES_ARM                   = 1000460004,
        VK_STRUCTURE_TYPE_TENSOR_FORMAT_PROPERTIES_ARM                            = 1000460005,
        VK_STRUCTURE_TYPE_TENSOR_DESCRIPTION_ARM                                  = 1000460006,
        VK_STRUCTURE_TYPE_TENSOR_MEMORY_REQUIREMENTS_INFO_ARM                     = 1000460007,
        VK_STRUCTURE_TYPE_TENSOR_MEMORY_BARRIER_ARM                               = 1000460008,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_FEATURES_ARM                     = 1000460009,
        VK_STRUCTURE_TYPE_DEVICE_TENSOR_MEMORY_REQUIREMENTS_ARM                   = 1000460010,
        VK_STRUCTURE_TYPE_COPY_TENSOR_INFO_ARM                                    = 1000460011,
        VK_STRUCTURE_TYPE_TENSOR_COPY_ARM                                         = 1000460012,
        VK_STRUCTURE_TYPE_TENSOR_DEPENDENCY_INFO_ARM                              = 1000460013,
        VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO_TENSOR_ARM               = 1000460014,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_TENSOR_INFO_ARM                = 1000460015,
        VK_STRUCTURE_TYPE_EXTERNAL_TENSOR_PROPERTIES_ARM                          = 1000460016,
        VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_TENSOR_CREATE_INFO_ARM                  = 1000460017,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_FEATURES_ARM   = 1000460018,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_PROPERTIES_ARM = 1000460019,
        VK_STRUCTURE_TYPE_DESCRIPTOR_GET_TENSOR_INFO_ARM                          = 1000460020,
        VK_STRUCTURE_TYPE_TENSOR_CAPTURE_DESCRIPTOR_DATA_INFO_ARM                 = 1000460021,
        VK_STRUCTURE_TYPE_TENSOR_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_ARM            = 1000460022,
        VK_STRUCTURE_TYPE_FRAME_BOUNDARY_TENSORS_ARM                              = 1000460023;

    public static final int
        VK_OBJECT_TYPE_TENSOR_ARM      = 1000460000,
        VK_OBJECT_TYPE_TENSOR_VIEW_ARM = 1000460001;

    public static final int VK_DESCRIPTOR_TYPE_TENSOR_ARM = 1000460000;

    public static final long
        VK_FORMAT_FEATURE_2_TENSOR_SHADER_BIT_ARM         = 0x8000000000L,
        VK_FORMAT_FEATURE_2_TENSOR_IMAGE_ALIASING_BIT_ARM = 0x80000000000L;

    public static final int VK_IMAGE_USAGE_TENSOR_ALIASING_BIT_ARM = 0x800000;

    public static final int VK_IMAGE_LAYOUT_TENSOR_ALIASING_ARM = 1000460000;

    public static final int
        VK_FORMAT_R8_BOOL_ARM                         = 1000460000,
        VK_FORMAT_R16_SFLOAT_FPENCODING_BFLOAT16_ARM  = 1000460001,
        VK_FORMAT_R8_SFLOAT_FPENCODING_FLOAT8E4M3_ARM = 1000460002,
        VK_FORMAT_R8_SFLOAT_FPENCODING_FLOAT8E5M2_ARM = 1000460003;

    public static final long
        VK_TENSOR_CREATE_MUTABLE_FORMAT_BIT_ARM                   = 0x1L,
        VK_TENSOR_CREATE_PROTECTED_BIT_ARM                        = 0x2L,
        VK_TENSOR_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_ARM = 0x4L;

    public static final long VK_TENSOR_VIEW_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_ARM = 0x1L;

    public static final long
        VK_TENSOR_USAGE_SHADER_BIT_ARM         = 0x2L,
        VK_TENSOR_USAGE_TRANSFER_SRC_BIT_ARM   = 0x4L,
        VK_TENSOR_USAGE_TRANSFER_DST_BIT_ARM   = 0x8L,
        VK_TENSOR_USAGE_IMAGE_ALIASING_BIT_ARM = 0x10L;

    public static final int
        VK_TENSOR_TILING_OPTIMAL_ARM = 0,
        VK_TENSOR_TILING_LINEAR_ARM  = 1;

    protected ARMTensors() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateTensorARM ] ---

    /** {@code VkResult vkCreateTensorARM(VkDevice device, VkTensorCreateInfoARM const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkTensorARM * pTensor)} */
    public static int nvkCreateTensorARM(VkDevice device, long pCreateInfo, long pAllocator, long pTensor) {
        long __functionAddress = device.getCapabilities().vkCreateTensorARM;
        if (CHECKS) {
            check(__functionAddress);
            VkTensorCreateInfoARM.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pTensor, __functionAddress);
    }

    /** {@code VkResult vkCreateTensorARM(VkDevice device, VkTensorCreateInfoARM const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkTensorARM * pTensor)} */
    @NativeType("VkResult")
    public static int vkCreateTensorARM(VkDevice device, @NativeType("VkTensorCreateInfoARM const *") VkTensorCreateInfoARM pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkTensorARM *") LongBuffer pTensor) {
        if (CHECKS) {
            check(pTensor, 1);
        }
        return nvkCreateTensorARM(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pTensor));
    }

    // --- [ vkDestroyTensorARM ] ---

    /** {@code void vkDestroyTensorARM(VkDevice device, VkTensorARM tensor, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyTensorARM(VkDevice device, long tensor, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyTensorARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), tensor, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyTensorARM(VkDevice device, VkTensorARM tensor, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyTensorARM(VkDevice device, @NativeType("VkTensorARM") long tensor, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyTensorARM(device, tensor, memAddressSafe(pAllocator));
    }

    // --- [ vkCreateTensorViewARM ] ---

    /** {@code VkResult vkCreateTensorViewARM(VkDevice device, VkTensorViewCreateInfoARM const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkTensorViewARM * pView)} */
    public static int nvkCreateTensorViewARM(VkDevice device, long pCreateInfo, long pAllocator, long pView) {
        long __functionAddress = device.getCapabilities().vkCreateTensorViewARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pView, __functionAddress);
    }

    /** {@code VkResult vkCreateTensorViewARM(VkDevice device, VkTensorViewCreateInfoARM const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkTensorViewARM * pView)} */
    @NativeType("VkResult")
    public static int vkCreateTensorViewARM(VkDevice device, @NativeType("VkTensorViewCreateInfoARM const *") VkTensorViewCreateInfoARM pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkTensorViewARM *") LongBuffer pView) {
        if (CHECKS) {
            check(pView, 1);
        }
        return nvkCreateTensorViewARM(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pView));
    }

    // --- [ vkDestroyTensorViewARM ] ---

    /** {@code void vkDestroyTensorViewARM(VkDevice device, VkTensorViewARM tensorView, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyTensorViewARM(VkDevice device, long tensorView, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyTensorViewARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), tensorView, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyTensorViewARM(VkDevice device, VkTensorViewARM tensorView, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyTensorViewARM(VkDevice device, @NativeType("VkTensorViewARM") long tensorView, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyTensorViewARM(device, tensorView, memAddressSafe(pAllocator));
    }

    // --- [ vkGetTensorMemoryRequirementsARM ] ---

    /** {@code void vkGetTensorMemoryRequirementsARM(VkDevice device, VkTensorMemoryRequirementsInfoARM const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void nvkGetTensorMemoryRequirementsARM(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetTensorMemoryRequirementsARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    /** {@code void vkGetTensorMemoryRequirementsARM(VkDevice device, VkTensorMemoryRequirementsInfoARM const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void vkGetTensorMemoryRequirementsARM(VkDevice device, @NativeType("VkTensorMemoryRequirementsInfoARM const *") VkTensorMemoryRequirementsInfoARM pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetTensorMemoryRequirementsARM(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkBindTensorMemoryARM ] ---

    /** {@code VkResult vkBindTensorMemoryARM(VkDevice device, uint32_t bindInfoCount, VkBindTensorMemoryInfoARM const * pBindInfos)} */
    public static int nvkBindTensorMemoryARM(VkDevice device, int bindInfoCount, long pBindInfos) {
        long __functionAddress = device.getCapabilities().vkBindTensorMemoryARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), bindInfoCount, pBindInfos, __functionAddress);
    }

    /** {@code VkResult vkBindTensorMemoryARM(VkDevice device, uint32_t bindInfoCount, VkBindTensorMemoryInfoARM const * pBindInfos)} */
    @NativeType("VkResult")
    public static int vkBindTensorMemoryARM(VkDevice device, @NativeType("VkBindTensorMemoryInfoARM const *") VkBindTensorMemoryInfoARM.Buffer pBindInfos) {
        return nvkBindTensorMemoryARM(device, pBindInfos.remaining(), pBindInfos.address());
    }

    // --- [ vkGetDeviceTensorMemoryRequirementsARM ] ---

    /** {@code void vkGetDeviceTensorMemoryRequirementsARM(VkDevice device, VkDeviceTensorMemoryRequirementsARM const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void nvkGetDeviceTensorMemoryRequirementsARM(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceTensorMemoryRequirementsARM;
        if (CHECKS) {
            check(__functionAddress);
            VkDeviceTensorMemoryRequirementsARM.validate(pInfo);
        }
        callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    /** {@code void vkGetDeviceTensorMemoryRequirementsARM(VkDevice device, VkDeviceTensorMemoryRequirementsARM const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void vkGetDeviceTensorMemoryRequirementsARM(VkDevice device, @NativeType("VkDeviceTensorMemoryRequirementsARM const *") VkDeviceTensorMemoryRequirementsARM pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetDeviceTensorMemoryRequirementsARM(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkCmdCopyTensorARM ] ---

    /** {@code void vkCmdCopyTensorARM(VkCommandBuffer commandBuffer, VkCopyTensorInfoARM const * pCopyTensorInfo)} */
    public static void nvkCmdCopyTensorARM(VkCommandBuffer commandBuffer, long pCopyTensorInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyTensorARM;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyTensorInfoARM.validate(pCopyTensorInfo);
        }
        callPPV(commandBuffer.address(), pCopyTensorInfo, __functionAddress);
    }

    /** {@code void vkCmdCopyTensorARM(VkCommandBuffer commandBuffer, VkCopyTensorInfoARM const * pCopyTensorInfo)} */
    public static void vkCmdCopyTensorARM(VkCommandBuffer commandBuffer, @NativeType("VkCopyTensorInfoARM const *") VkCopyTensorInfoARM pCopyTensorInfo) {
        nvkCmdCopyTensorARM(commandBuffer, pCopyTensorInfo.address());
    }

    // --- [ vkGetPhysicalDeviceExternalTensorPropertiesARM ] ---

    /** {@code void vkGetPhysicalDeviceExternalTensorPropertiesARM(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalTensorInfoARM const * pExternalTensorInfo, VkExternalTensorPropertiesARM * pExternalTensorProperties)} */
    public static void nvkGetPhysicalDeviceExternalTensorPropertiesARM(VkPhysicalDevice physicalDevice, long pExternalTensorInfo, long pExternalTensorProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceExternalTensorPropertiesARM;
        if (CHECKS) {
            check(__functionAddress);
            VkPhysicalDeviceExternalTensorInfoARM.validate(pExternalTensorInfo);
        }
        callPPPV(physicalDevice.address(), pExternalTensorInfo, pExternalTensorProperties, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceExternalTensorPropertiesARM(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalTensorInfoARM const * pExternalTensorInfo, VkExternalTensorPropertiesARM * pExternalTensorProperties)} */
    public static void vkGetPhysicalDeviceExternalTensorPropertiesARM(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceExternalTensorInfoARM const *") VkPhysicalDeviceExternalTensorInfoARM pExternalTensorInfo, @NativeType("VkExternalTensorPropertiesARM *") VkExternalTensorPropertiesARM pExternalTensorProperties) {
        nvkGetPhysicalDeviceExternalTensorPropertiesARM(physicalDevice, pExternalTensorInfo.address(), pExternalTensorProperties.address());
    }

    // --- [ vkGetTensorOpaqueCaptureDescriptorDataARM ] ---

    /** {@code VkResult vkGetTensorOpaqueCaptureDescriptorDataARM(VkDevice device, VkTensorCaptureDescriptorDataInfoARM const * pInfo, void * pData)} */
    public static int nvkGetTensorOpaqueCaptureDescriptorDataARM(VkDevice device, long pInfo, long pData) {
        long __functionAddress = device.getCapabilities().vkGetTensorOpaqueCaptureDescriptorDataARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pInfo, pData, __functionAddress);
    }

    /** {@code VkResult vkGetTensorOpaqueCaptureDescriptorDataARM(VkDevice device, VkTensorCaptureDescriptorDataInfoARM const * pInfo, void * pData)} */
    @NativeType("VkResult")
    public static int vkGetTensorOpaqueCaptureDescriptorDataARM(VkDevice device, @NativeType("VkTensorCaptureDescriptorDataInfoARM const *") VkTensorCaptureDescriptorDataInfoARM pInfo, @NativeType("void *") ByteBuffer pData) {
        if (CHECKS) {
            check(pData, 1);
        }
        return nvkGetTensorOpaqueCaptureDescriptorDataARM(device, pInfo.address(), memAddress(pData));
    }

    // --- [ vkGetTensorViewOpaqueCaptureDescriptorDataARM ] ---

    /** {@code VkResult vkGetTensorViewOpaqueCaptureDescriptorDataARM(VkDevice device, VkTensorViewCaptureDescriptorDataInfoARM const * pInfo, void * pData)} */
    public static int nvkGetTensorViewOpaqueCaptureDescriptorDataARM(VkDevice device, long pInfo, long pData) {
        long __functionAddress = device.getCapabilities().vkGetTensorViewOpaqueCaptureDescriptorDataARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pInfo, pData, __functionAddress);
    }

    /** {@code VkResult vkGetTensorViewOpaqueCaptureDescriptorDataARM(VkDevice device, VkTensorViewCaptureDescriptorDataInfoARM const * pInfo, void * pData)} */
    @NativeType("VkResult")
    public static int vkGetTensorViewOpaqueCaptureDescriptorDataARM(VkDevice device, @NativeType("VkTensorViewCaptureDescriptorDataInfoARM const *") VkTensorViewCaptureDescriptorDataInfoARM pInfo, @NativeType("void *") ByteBuffer pData) {
        if (CHECKS) {
            check(pData, 1);
        }
        return nvkGetTensorViewOpaqueCaptureDescriptorDataARM(device, pInfo.address(), memAddress(pData));
    }

    /** {@code VkResult vkCreateTensorARM(VkDevice device, VkTensorCreateInfoARM const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkTensorARM * pTensor)} */
    @NativeType("VkResult")
    public static int vkCreateTensorARM(VkDevice device, @NativeType("VkTensorCreateInfoARM const *") VkTensorCreateInfoARM pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkTensorARM *") long[] pTensor) {
        long __functionAddress = device.getCapabilities().vkCreateTensorARM;
        if (CHECKS) {
            check(__functionAddress);
            check(pTensor, 1);
            VkTensorCreateInfoARM.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pTensor, __functionAddress);
    }

    /** {@code VkResult vkCreateTensorViewARM(VkDevice device, VkTensorViewCreateInfoARM const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkTensorViewARM * pView)} */
    @NativeType("VkResult")
    public static int vkCreateTensorViewARM(VkDevice device, @NativeType("VkTensorViewCreateInfoARM const *") VkTensorViewCreateInfoARM pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkTensorViewARM *") long[] pView) {
        long __functionAddress = device.getCapabilities().vkCreateTensorViewARM;
        if (CHECKS) {
            check(__functionAddress);
            check(pView, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pView, __functionAddress);
    }

}