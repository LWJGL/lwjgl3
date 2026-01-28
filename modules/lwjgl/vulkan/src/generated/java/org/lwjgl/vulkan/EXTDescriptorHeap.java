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

public class EXTDescriptorHeap {

    public static final int VK_EXT_DESCRIPTOR_HEAP_SPEC_VERSION = 1;

    public static final String VK_EXT_DESCRIPTOR_HEAP_EXTENSION_NAME = "VK_EXT_descriptor_heap";

    public static final int VK_BUFFER_USAGE_DESCRIPTOR_HEAP_BIT_EXT = 0x10000000;

    public static final long VK_BUFFER_USAGE_2_DESCRIPTOR_HEAP_BIT_EXT = 0x10000000L;

    public static final long VK_PIPELINE_CREATE_2_DESCRIPTOR_HEAP_BIT_EXT = 0x1000000000L;

    public static final int VK_IMAGE_CREATE_DESCRIPTOR_HEAP_CAPTURE_REPLAY_BIT_EXT = 0x10000;

    public static final int
        VK_STRUCTURE_TYPE_TEXEL_BUFFER_DESCRIPTOR_INFO_EXT                      = 1000135000,
        VK_STRUCTURE_TYPE_IMAGE_DESCRIPTOR_INFO_EXT                             = 1000135001,
        VK_STRUCTURE_TYPE_RESOURCE_DESCRIPTOR_INFO_EXT                          = 1000135002,
        VK_STRUCTURE_TYPE_BIND_HEAP_INFO_EXT                                    = 1000135003,
        VK_STRUCTURE_TYPE_PUSH_DATA_INFO_EXT                                    = 1000135004,
        VK_STRUCTURE_TYPE_DESCRIPTOR_SET_AND_BINDING_MAPPING_EXT                = 1000135005,
        VK_STRUCTURE_TYPE_SHADER_DESCRIPTOR_SET_AND_BINDING_MAPPING_INFO_EXT    = 1000135006,
        VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DATA_CREATE_INFO_EXT                   = 1000135007,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_PROPERTIES_EXT        = 1000135008,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_FEATURES_EXT          = 1000135009,
        VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_DESCRIPTOR_HEAP_INFO_EXT   = 1000135010,
        VK_STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_INDEX_CREATE_INFO_EXT     = 1000135011,
        VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_PUSH_DATA_TOKEN_NV           = 1000135012,
        VK_STRUCTURE_TYPE_SUBSAMPLED_IMAGE_FORMAT_PROPERTIES_EXT                = 1000135013,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_TENSOR_PROPERTIES_ARM = 1000135014;

    public static final long
        VK_ACCESS_2_SAMPLER_HEAP_READ_BIT_EXT  = 0x200000000000000L,
        VK_ACCESS_2_RESOURCE_HEAP_READ_BIT_EXT = 0x400000000000000L;

    public static final int
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_DATA_EXT                = 1000135000,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_DATA_SEQUENCE_INDEX_EXT = 1000135001;

    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_DATA_NV = 1000135000;

    public static final int VK_SHADER_CREATE_DESCRIPTOR_HEAP_BIT_EXT = 0x400;

    public static final int
        VK_DESCRIPTOR_MAPPING_SOURCE_HEAP_WITH_CONSTANT_OFFSET_EXT      = 0,
        VK_DESCRIPTOR_MAPPING_SOURCE_HEAP_WITH_PUSH_INDEX_EXT           = 1,
        VK_DESCRIPTOR_MAPPING_SOURCE_HEAP_WITH_INDIRECT_INDEX_EXT       = 2,
        VK_DESCRIPTOR_MAPPING_SOURCE_HEAP_WITH_INDIRECT_INDEX_ARRAY_EXT = 3,
        VK_DESCRIPTOR_MAPPING_SOURCE_RESOURCE_HEAP_DATA_EXT             = 4,
        VK_DESCRIPTOR_MAPPING_SOURCE_PUSH_DATA_EXT                      = 5,
        VK_DESCRIPTOR_MAPPING_SOURCE_PUSH_ADDRESS_EXT                   = 6,
        VK_DESCRIPTOR_MAPPING_SOURCE_INDIRECT_ADDRESS_EXT               = 7,
        VK_DESCRIPTOR_MAPPING_SOURCE_HEAP_WITH_SHADER_RECORD_INDEX_EXT  = 8,
        VK_DESCRIPTOR_MAPPING_SOURCE_SHADER_RECORD_DATA_EXT             = 9,
        VK_DESCRIPTOR_MAPPING_SOURCE_SHADER_RECORD_ADDRESS_EXT          = 10;

    public static final int
        VK_SPIRV_RESOURCE_TYPE_SAMPLER_BIT_EXT                   = 0x1,
        VK_SPIRV_RESOURCE_TYPE_SAMPLED_IMAGE_BIT_EXT             = 0x2,
        VK_SPIRV_RESOURCE_TYPE_READ_ONLY_IMAGE_BIT_EXT           = 0x4,
        VK_SPIRV_RESOURCE_TYPE_READ_WRITE_IMAGE_BIT_EXT          = 0x8,
        VK_SPIRV_RESOURCE_TYPE_COMBINED_SAMPLED_IMAGE_BIT_EXT    = 0x10,
        VK_SPIRV_RESOURCE_TYPE_UNIFORM_BUFFER_BIT_EXT            = 0x20,
        VK_SPIRV_RESOURCE_TYPE_READ_ONLY_STORAGE_BUFFER_BIT_EXT  = 0x40,
        VK_SPIRV_RESOURCE_TYPE_READ_WRITE_STORAGE_BUFFER_BIT_EXT = 0x80,
        VK_SPIRV_RESOURCE_TYPE_ACCELERATION_STRUCTURE_BIT_EXT    = 0x100,
        VK_SPIRV_RESOURCE_TYPE_TENSOR_BIT_ARM                    = 0x200,
        VK_SPIRV_RESOURCE_TYPE_ALL_EXT                           = 0x7FFFFFFF;

    public static final long VK_TENSOR_CREATE_DESCRIPTOR_HEAP_CAPTURE_REPLAY_BIT_ARM = 0x8L;

    protected EXTDescriptorHeap() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkWriteSamplerDescriptorsEXT ] ---

    /** {@code VkResult vkWriteSamplerDescriptorsEXT(VkDevice device, uint32_t samplerCount, VkSamplerCreateInfo const * pSamplers, VkHostAddressRangeEXT const * pDescriptors)} */
    public static int nvkWriteSamplerDescriptorsEXT(VkDevice device, int samplerCount, long pSamplers, long pDescriptors) {
        long __functionAddress = device.getCapabilities().vkWriteSamplerDescriptorsEXT;
        if (CHECKS) {
            check(__functionAddress);
            Struct.validate(pDescriptors, samplerCount, VkHostAddressRangeEXT.SIZEOF, VkHostAddressRangeEXT::validate);
        }
        return callPPPI(device.address(), samplerCount, pSamplers, pDescriptors, __functionAddress);
    }

    /** {@code VkResult vkWriteSamplerDescriptorsEXT(VkDevice device, uint32_t samplerCount, VkSamplerCreateInfo const * pSamplers, VkHostAddressRangeEXT const * pDescriptors)} */
    @NativeType("VkResult")
    public static int vkWriteSamplerDescriptorsEXT(VkDevice device, @NativeType("VkSamplerCreateInfo const *") VkSamplerCreateInfo.Buffer pSamplers, @NativeType("VkHostAddressRangeEXT const *") VkHostAddressRangeEXT.Buffer pDescriptors) {
        if (CHECKS) {
            check(pDescriptors, pSamplers.remaining());
        }
        return nvkWriteSamplerDescriptorsEXT(device, pSamplers.remaining(), pSamplers.address(), pDescriptors.address());
    }

    // --- [ vkWriteResourceDescriptorsEXT ] ---

    /** {@code VkResult vkWriteResourceDescriptorsEXT(VkDevice device, uint32_t resourceCount, VkResourceDescriptorInfoEXT const * pResources, VkHostAddressRangeEXT const * pDescriptors)} */
    public static int nvkWriteResourceDescriptorsEXT(VkDevice device, int resourceCount, long pResources, long pDescriptors) {
        long __functionAddress = device.getCapabilities().vkWriteResourceDescriptorsEXT;
        if (CHECKS) {
            check(__functionAddress);
            Struct.validate(pDescriptors, resourceCount, VkHostAddressRangeEXT.SIZEOF, VkHostAddressRangeEXT::validate);
        }
        return callPPPI(device.address(), resourceCount, pResources, pDescriptors, __functionAddress);
    }

    /** {@code VkResult vkWriteResourceDescriptorsEXT(VkDevice device, uint32_t resourceCount, VkResourceDescriptorInfoEXT const * pResources, VkHostAddressRangeEXT const * pDescriptors)} */
    @NativeType("VkResult")
    public static int vkWriteResourceDescriptorsEXT(VkDevice device, @NativeType("VkResourceDescriptorInfoEXT const *") VkResourceDescriptorInfoEXT.Buffer pResources, @NativeType("VkHostAddressRangeEXT const *") VkHostAddressRangeEXT.Buffer pDescriptors) {
        if (CHECKS) {
            check(pDescriptors, pResources.remaining());
        }
        return nvkWriteResourceDescriptorsEXT(device, pResources.remaining(), pResources.address(), pDescriptors.address());
    }

    // --- [ vkCmdBindSamplerHeapEXT ] ---

    /** {@code void vkCmdBindSamplerHeapEXT(VkCommandBuffer commandBuffer, VkBindHeapInfoEXT const * pBindInfo)} */
    public static void nvkCmdBindSamplerHeapEXT(VkCommandBuffer commandBuffer, long pBindInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindSamplerHeapEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pBindInfo, __functionAddress);
    }

    /** {@code void vkCmdBindSamplerHeapEXT(VkCommandBuffer commandBuffer, VkBindHeapInfoEXT const * pBindInfo)} */
    public static void vkCmdBindSamplerHeapEXT(VkCommandBuffer commandBuffer, @NativeType("VkBindHeapInfoEXT const *") VkBindHeapInfoEXT pBindInfo) {
        nvkCmdBindSamplerHeapEXT(commandBuffer, pBindInfo.address());
    }

    // --- [ vkCmdBindResourceHeapEXT ] ---

    /** {@code void vkCmdBindResourceHeapEXT(VkCommandBuffer commandBuffer, VkBindHeapInfoEXT const * pBindInfo)} */
    public static void nvkCmdBindResourceHeapEXT(VkCommandBuffer commandBuffer, long pBindInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindResourceHeapEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pBindInfo, __functionAddress);
    }

    /** {@code void vkCmdBindResourceHeapEXT(VkCommandBuffer commandBuffer, VkBindHeapInfoEXT const * pBindInfo)} */
    public static void vkCmdBindResourceHeapEXT(VkCommandBuffer commandBuffer, @NativeType("VkBindHeapInfoEXT const *") VkBindHeapInfoEXT pBindInfo) {
        nvkCmdBindResourceHeapEXT(commandBuffer, pBindInfo.address());
    }

    // --- [ vkCmdPushDataEXT ] ---

    /** {@code void vkCmdPushDataEXT(VkCommandBuffer commandBuffer, VkPushDataInfoEXT const * pPushDataInfo)} */
    public static void nvkCmdPushDataEXT(VkCommandBuffer commandBuffer, long pPushDataInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushDataEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkPushDataInfoEXT.validate(pPushDataInfo);
        }
        callPPV(commandBuffer.address(), pPushDataInfo, __functionAddress);
    }

    /** {@code void vkCmdPushDataEXT(VkCommandBuffer commandBuffer, VkPushDataInfoEXT const * pPushDataInfo)} */
    public static void vkCmdPushDataEXT(VkCommandBuffer commandBuffer, @NativeType("VkPushDataInfoEXT const *") VkPushDataInfoEXT pPushDataInfo) {
        nvkCmdPushDataEXT(commandBuffer, pPushDataInfo.address());
    }

    // --- [ vkGetImageOpaqueCaptureDataEXT ] ---

    /** {@code VkResult vkGetImageOpaqueCaptureDataEXT(VkDevice device, uint32_t imageCount, VkImage const * pImages, VkHostAddressRangeEXT * pDatas)} */
    public static int nvkGetImageOpaqueCaptureDataEXT(VkDevice device, int imageCount, long pImages, long pDatas) {
        long __functionAddress = device.getCapabilities().vkGetImageOpaqueCaptureDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), imageCount, pImages, pDatas, __functionAddress);
    }

    /** {@code VkResult vkGetImageOpaqueCaptureDataEXT(VkDevice device, uint32_t imageCount, VkImage const * pImages, VkHostAddressRangeEXT * pDatas)} */
    @NativeType("VkResult")
    public static int vkGetImageOpaqueCaptureDataEXT(VkDevice device, @NativeType("VkImage const *") LongBuffer pImages, @NativeType("VkHostAddressRangeEXT *") VkHostAddressRangeEXT.Buffer pDatas) {
        if (CHECKS) {
            check(pDatas, pImages.remaining());
        }
        return nvkGetImageOpaqueCaptureDataEXT(device, pImages.remaining(), memAddress(pImages), pDatas.address());
    }

    // --- [ vkGetPhysicalDeviceDescriptorSizeEXT ] ---

    /** {@code VkDeviceSize vkGetPhysicalDeviceDescriptorSizeEXT(VkPhysicalDevice physicalDevice, VkDescriptorType descriptorType)} */
    @NativeType("VkDeviceSize")
    public static long vkGetPhysicalDeviceDescriptorSizeEXT(VkPhysicalDevice physicalDevice, @NativeType("VkDescriptorType") int descriptorType) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceDescriptorSizeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJ(physicalDevice.address(), descriptorType, __functionAddress);
    }

    // --- [ vkRegisterCustomBorderColorEXT ] ---

    /** {@code VkResult vkRegisterCustomBorderColorEXT(VkDevice device, VkSamplerCustomBorderColorCreateInfoEXT const * pBorderColor, VkBool32 requestIndex, uint32_t * pIndex)} */
    public static int nvkRegisterCustomBorderColorEXT(VkDevice device, long pBorderColor, int requestIndex, long pIndex) {
        long __functionAddress = device.getCapabilities().vkRegisterCustomBorderColorEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pBorderColor, requestIndex, pIndex, __functionAddress);
    }

    /** {@code VkResult vkRegisterCustomBorderColorEXT(VkDevice device, VkSamplerCustomBorderColorCreateInfoEXT const * pBorderColor, VkBool32 requestIndex, uint32_t * pIndex)} */
    @NativeType("VkResult")
    public static int vkRegisterCustomBorderColorEXT(VkDevice device, @NativeType("VkSamplerCustomBorderColorCreateInfoEXT const *") VkSamplerCustomBorderColorCreateInfoEXT pBorderColor, @NativeType("VkBool32") boolean requestIndex, @NativeType("uint32_t *") IntBuffer pIndex) {
        if (CHECKS) {
            check(pIndex, 1);
        }
        return nvkRegisterCustomBorderColorEXT(device, pBorderColor.address(), requestIndex ? 1 : 0, memAddress(pIndex));
    }

    // --- [ vkUnregisterCustomBorderColorEXT ] ---

    /** {@code void vkUnregisterCustomBorderColorEXT(VkDevice device, uint32_t index)} */
    public static void vkUnregisterCustomBorderColorEXT(VkDevice device, @NativeType("uint32_t") int index) {
        long __functionAddress = device.getCapabilities().vkUnregisterCustomBorderColorEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(device.address(), index, __functionAddress);
    }

    // --- [ vkGetTensorOpaqueCaptureDataARM ] ---

    /** {@code VkResult vkGetTensorOpaqueCaptureDataARM(VkDevice device, uint32_t tensorCount, VkTensorARM const * pTensors, VkHostAddressRangeEXT * pDatas)} */
    public static int nvkGetTensorOpaqueCaptureDataARM(VkDevice device, int tensorCount, long pTensors, long pDatas) {
        long __functionAddress = device.getCapabilities().vkGetTensorOpaqueCaptureDataARM;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), tensorCount, pTensors, pDatas, __functionAddress);
    }

    /** {@code VkResult vkGetTensorOpaqueCaptureDataARM(VkDevice device, uint32_t tensorCount, VkTensorARM const * pTensors, VkHostAddressRangeEXT * pDatas)} */
    @NativeType("VkResult")
    public static int vkGetTensorOpaqueCaptureDataARM(VkDevice device, @NativeType("VkTensorARM const *") LongBuffer pTensors, @NativeType("VkHostAddressRangeEXT *") VkHostAddressRangeEXT.Buffer pDatas) {
        if (CHECKS) {
            check(pDatas, pTensors.remaining());
        }
        return nvkGetTensorOpaqueCaptureDataARM(device, pTensors.remaining(), memAddress(pTensors), pDatas.address());
    }

    /** {@code VkResult vkGetImageOpaqueCaptureDataEXT(VkDevice device, uint32_t imageCount, VkImage const * pImages, VkHostAddressRangeEXT * pDatas)} */
    @NativeType("VkResult")
    public static int vkGetImageOpaqueCaptureDataEXT(VkDevice device, @NativeType("VkImage const *") long[] pImages, @NativeType("VkHostAddressRangeEXT *") VkHostAddressRangeEXT.Buffer pDatas) {
        long __functionAddress = device.getCapabilities().vkGetImageOpaqueCaptureDataEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pDatas, pImages.length);
        }
        return callPPPI(device.address(), pImages.length, pImages, pDatas.address(), __functionAddress);
    }

    /** {@code VkResult vkRegisterCustomBorderColorEXT(VkDevice device, VkSamplerCustomBorderColorCreateInfoEXT const * pBorderColor, VkBool32 requestIndex, uint32_t * pIndex)} */
    @NativeType("VkResult")
    public static int vkRegisterCustomBorderColorEXT(VkDevice device, @NativeType("VkSamplerCustomBorderColorCreateInfoEXT const *") VkSamplerCustomBorderColorCreateInfoEXT pBorderColor, @NativeType("VkBool32") boolean requestIndex, @NativeType("uint32_t *") int[] pIndex) {
        long __functionAddress = device.getCapabilities().vkRegisterCustomBorderColorEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pIndex, 1);
        }
        return callPPPI(device.address(), pBorderColor.address(), requestIndex ? 1 : 0, pIndex, __functionAddress);
    }

    /** {@code VkResult vkGetTensorOpaqueCaptureDataARM(VkDevice device, uint32_t tensorCount, VkTensorARM const * pTensors, VkHostAddressRangeEXT * pDatas)} */
    @NativeType("VkResult")
    public static int vkGetTensorOpaqueCaptureDataARM(VkDevice device, @NativeType("VkTensorARM const *") long[] pTensors, @NativeType("VkHostAddressRangeEXT *") VkHostAddressRangeEXT.Buffer pDatas) {
        long __functionAddress = device.getCapabilities().vkGetTensorOpaqueCaptureDataARM;
        if (CHECKS) {
            check(__functionAddress);
            check(pDatas, pTensors.length);
        }
        return callPPPI(device.address(), pTensors.length, pTensors, pDatas.address(), __functionAddress);
    }

}