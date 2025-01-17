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

public class EXTDescriptorBuffer {

    public static final int VK_EXT_DESCRIPTOR_BUFFER_SPEC_VERSION = 1;

    public static final String VK_EXT_DESCRIPTOR_BUFFER_EXTENSION_NAME = "VK_EXT_descriptor_buffer";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT             = 1000316000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_DENSITY_MAP_PROPERTIES_EXT = 1000316001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_FEATURES_EXT               = 1000316002,
        VK_STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT                                  = 1000316003,
        VK_STRUCTURE_TYPE_DESCRIPTOR_GET_INFO_EXT                                      = 1000316004,
        VK_STRUCTURE_TYPE_BUFFER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT                      = 1000316005,
        VK_STRUCTURE_TYPE_IMAGE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT                       = 1000316006,
        VK_STRUCTURE_TYPE_IMAGE_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_EXT                  = 1000316007,
        VK_STRUCTURE_TYPE_SAMPLER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT                     = 1000316008,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT      = 1000316009,
        VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT               = 1000316010,
        VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_INFO_EXT                           = 1000316011,
        VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_PUSH_DESCRIPTOR_BUFFER_HANDLE_EXT  = 1000316012;

    public static final int
        VK_DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT           = 0x10,
        VK_DESCRIPTOR_SET_LAYOUT_CREATE_EMBEDDED_IMMUTABLE_SAMPLERS_BIT_EXT = 0x20;

    public static final int
        VK_BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT          = 0x200000,
        VK_BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT         = 0x400000,
        VK_BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT = 0x4000000;

    public static final int VK_BUFFER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 0x20;

    public static final int VK_IMAGE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 0x10000;

    public static final int VK_IMAGE_VIEW_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 0x4;

    public static final int VK_SAMPLER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 0x8;

    public static final int VK_ACCELERATION_STRUCTURE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 0x8;

    public static final long VK_ACCESS_2_DESCRIPTOR_BUFFER_READ_BIT_EXT = 0x20000000000L;

    public static final int VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT = 0x20000000;

    protected EXTDescriptorBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetDescriptorSetLayoutSizeEXT ] ---

    /** {@code void vkGetDescriptorSetLayoutSizeEXT(VkDevice device, VkDescriptorSetLayout layout, VkDeviceSize * pLayoutSizeInBytes)} */
    public static void nvkGetDescriptorSetLayoutSizeEXT(VkDevice device, long layout, long pLayoutSizeInBytes) {
        long __functionAddress = device.getCapabilities().vkGetDescriptorSetLayoutSizeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), layout, pLayoutSizeInBytes, __functionAddress);
    }

    /** {@code void vkGetDescriptorSetLayoutSizeEXT(VkDevice device, VkDescriptorSetLayout layout, VkDeviceSize * pLayoutSizeInBytes)} */
    public static void vkGetDescriptorSetLayoutSizeEXT(VkDevice device, @NativeType("VkDescriptorSetLayout") long layout, @NativeType("VkDeviceSize *") LongBuffer pLayoutSizeInBytes) {
        if (CHECKS) {
            check(pLayoutSizeInBytes, 1);
        }
        nvkGetDescriptorSetLayoutSizeEXT(device, layout, memAddress(pLayoutSizeInBytes));
    }

    // --- [ vkGetDescriptorSetLayoutBindingOffsetEXT ] ---

    /** {@code void vkGetDescriptorSetLayoutBindingOffsetEXT(VkDevice device, VkDescriptorSetLayout layout, uint32_t binding, VkDeviceSize * pOffset)} */
    public static void nvkGetDescriptorSetLayoutBindingOffsetEXT(VkDevice device, long layout, int binding, long pOffset) {
        long __functionAddress = device.getCapabilities().vkGetDescriptorSetLayoutBindingOffsetEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), layout, binding, pOffset, __functionAddress);
    }

    /** {@code void vkGetDescriptorSetLayoutBindingOffsetEXT(VkDevice device, VkDescriptorSetLayout layout, uint32_t binding, VkDeviceSize * pOffset)} */
    public static void vkGetDescriptorSetLayoutBindingOffsetEXT(VkDevice device, @NativeType("VkDescriptorSetLayout") long layout, @NativeType("uint32_t") int binding, @NativeType("VkDeviceSize *") LongBuffer pOffset) {
        if (CHECKS) {
            check(pOffset, 1);
        }
        nvkGetDescriptorSetLayoutBindingOffsetEXT(device, layout, binding, memAddress(pOffset));
    }

    // --- [ vkGetDescriptorEXT ] ---

    /** {@code void vkGetDescriptorEXT(VkDevice device, VkDescriptorGetInfoEXT const * pDescriptorInfo, size_t dataSize, void * pDescriptor)} */
    public static void nvkGetDescriptorEXT(VkDevice device, long pDescriptorInfo, long dataSize, long pDescriptor) {
        long __functionAddress = device.getCapabilities().vkGetDescriptorEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(device.address(), pDescriptorInfo, dataSize, pDescriptor, __functionAddress);
    }

    /** {@code void vkGetDescriptorEXT(VkDevice device, VkDescriptorGetInfoEXT const * pDescriptorInfo, size_t dataSize, void * pDescriptor)} */
    public static void vkGetDescriptorEXT(VkDevice device, @NativeType("VkDescriptorGetInfoEXT const *") VkDescriptorGetInfoEXT pDescriptorInfo, @NativeType("void *") ByteBuffer pDescriptor) {
        nvkGetDescriptorEXT(device, pDescriptorInfo.address(), pDescriptor.remaining(), memAddress(pDescriptor));
    }

    // --- [ vkCmdBindDescriptorBuffersEXT ] ---

    /** {@code void vkCmdBindDescriptorBuffersEXT(VkCommandBuffer commandBuffer, uint32_t bufferCount, VkDescriptorBufferBindingInfoEXT const * pBindingInfos)} */
    public static void nvkCmdBindDescriptorBuffersEXT(VkCommandBuffer commandBuffer, int bufferCount, long pBindingInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindDescriptorBuffersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), bufferCount, pBindingInfos, __functionAddress);
    }

    /** {@code void vkCmdBindDescriptorBuffersEXT(VkCommandBuffer commandBuffer, uint32_t bufferCount, VkDescriptorBufferBindingInfoEXT const * pBindingInfos)} */
    public static void vkCmdBindDescriptorBuffersEXT(VkCommandBuffer commandBuffer, @NativeType("VkDescriptorBufferBindingInfoEXT const *") VkDescriptorBufferBindingInfoEXT.Buffer pBindingInfos) {
        nvkCmdBindDescriptorBuffersEXT(commandBuffer, pBindingInfos.remaining(), pBindingInfos.address());
    }

    // --- [ vkCmdSetDescriptorBufferOffsetsEXT ] ---

    /** {@code void vkCmdSetDescriptorBufferOffsetsEXT(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipelineLayout layout, uint32_t firstSet, uint32_t setCount, uint32_t const * pBufferIndices, VkDeviceSize const * pOffsets)} */
    public static void nvkCmdSetDescriptorBufferOffsetsEXT(VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int firstSet, int setCount, long pBufferIndices, long pOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDescriptorBufferOffsetsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPPV(commandBuffer.address(), pipelineBindPoint, layout, firstSet, setCount, pBufferIndices, pOffsets, __functionAddress);
    }

    /** {@code void vkCmdSetDescriptorBufferOffsetsEXT(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipelineLayout layout, uint32_t firstSet, uint32_t setCount, uint32_t const * pBufferIndices, VkDeviceSize const * pOffsets)} */
    public static void vkCmdSetDescriptorBufferOffsetsEXT(VkCommandBuffer commandBuffer, @NativeType("VkPipelineBindPoint") int pipelineBindPoint, @NativeType("VkPipelineLayout") long layout, @NativeType("uint32_t") int firstSet, @NativeType("uint32_t const *") IntBuffer pBufferIndices, @NativeType("VkDeviceSize const *") LongBuffer pOffsets) {
        if (CHECKS) {
            check(pOffsets, pBufferIndices.remaining());
        }
        nvkCmdSetDescriptorBufferOffsetsEXT(commandBuffer, pipelineBindPoint, layout, firstSet, pBufferIndices.remaining(), memAddress(pBufferIndices), memAddress(pOffsets));
    }

    // --- [ vkCmdBindDescriptorBufferEmbeddedSamplersEXT ] ---

    /** {@code void vkCmdBindDescriptorBufferEmbeddedSamplersEXT(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipelineLayout layout, uint32_t set)} */
    public static void vkCmdBindDescriptorBufferEmbeddedSamplersEXT(VkCommandBuffer commandBuffer, @NativeType("VkPipelineBindPoint") int pipelineBindPoint, @NativeType("VkPipelineLayout") long layout, @NativeType("uint32_t") int set) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindDescriptorBufferEmbeddedSamplersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(commandBuffer.address(), pipelineBindPoint, layout, set, __functionAddress);
    }

    // --- [ vkGetBufferOpaqueCaptureDescriptorDataEXT ] ---

    /** {@code VkResult vkGetBufferOpaqueCaptureDescriptorDataEXT(VkDevice device, VkBufferCaptureDescriptorDataInfoEXT const * pInfo, void * pData)} */
    public static int nvkGetBufferOpaqueCaptureDescriptorDataEXT(VkDevice device, long pInfo, long pData) {
        long __functionAddress = device.getCapabilities().vkGetBufferOpaqueCaptureDescriptorDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pInfo, pData, __functionAddress);
    }

    /** {@code VkResult vkGetBufferOpaqueCaptureDescriptorDataEXT(VkDevice device, VkBufferCaptureDescriptorDataInfoEXT const * pInfo, void * pData)} */
    @NativeType("VkResult")
    public static int vkGetBufferOpaqueCaptureDescriptorDataEXT(VkDevice device, @NativeType("VkBufferCaptureDescriptorDataInfoEXT const *") VkBufferCaptureDescriptorDataInfoEXT pInfo, @NativeType("void *") ByteBuffer pData) {
        if (CHECKS) {
            check(pData, 1);
        }
        return nvkGetBufferOpaqueCaptureDescriptorDataEXT(device, pInfo.address(), memAddress(pData));
    }

    // --- [ vkGetImageOpaqueCaptureDescriptorDataEXT ] ---

    /** {@code VkResult vkGetImageOpaqueCaptureDescriptorDataEXT(VkDevice device, VkImageCaptureDescriptorDataInfoEXT const * pInfo, void * pData)} */
    public static int nvkGetImageOpaqueCaptureDescriptorDataEXT(VkDevice device, long pInfo, long pData) {
        long __functionAddress = device.getCapabilities().vkGetImageOpaqueCaptureDescriptorDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pInfo, pData, __functionAddress);
    }

    /** {@code VkResult vkGetImageOpaqueCaptureDescriptorDataEXT(VkDevice device, VkImageCaptureDescriptorDataInfoEXT const * pInfo, void * pData)} */
    @NativeType("VkResult")
    public static int vkGetImageOpaqueCaptureDescriptorDataEXT(VkDevice device, @NativeType("VkImageCaptureDescriptorDataInfoEXT const *") VkImageCaptureDescriptorDataInfoEXT pInfo, @NativeType("void *") ByteBuffer pData) {
        if (CHECKS) {
            check(pData, 1);
        }
        return nvkGetImageOpaqueCaptureDescriptorDataEXT(device, pInfo.address(), memAddress(pData));
    }

    // --- [ vkGetImageViewOpaqueCaptureDescriptorDataEXT ] ---

    /** {@code VkResult vkGetImageViewOpaqueCaptureDescriptorDataEXT(VkDevice device, VkImageViewCaptureDescriptorDataInfoEXT const * pInfo, void * pData)} */
    public static int nvkGetImageViewOpaqueCaptureDescriptorDataEXT(VkDevice device, long pInfo, long pData) {
        long __functionAddress = device.getCapabilities().vkGetImageViewOpaqueCaptureDescriptorDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pInfo, pData, __functionAddress);
    }

    /** {@code VkResult vkGetImageViewOpaqueCaptureDescriptorDataEXT(VkDevice device, VkImageViewCaptureDescriptorDataInfoEXT const * pInfo, void * pData)} */
    @NativeType("VkResult")
    public static int vkGetImageViewOpaqueCaptureDescriptorDataEXT(VkDevice device, @NativeType("VkImageViewCaptureDescriptorDataInfoEXT const *") VkImageViewCaptureDescriptorDataInfoEXT pInfo, @NativeType("void *") ByteBuffer pData) {
        if (CHECKS) {
            check(pData, 1);
        }
        return nvkGetImageViewOpaqueCaptureDescriptorDataEXT(device, pInfo.address(), memAddress(pData));
    }

    // --- [ vkGetSamplerOpaqueCaptureDescriptorDataEXT ] ---

    /** {@code VkResult vkGetSamplerOpaqueCaptureDescriptorDataEXT(VkDevice device, VkSamplerCaptureDescriptorDataInfoEXT const * pInfo, void * pData)} */
    public static int nvkGetSamplerOpaqueCaptureDescriptorDataEXT(VkDevice device, long pInfo, long pData) {
        long __functionAddress = device.getCapabilities().vkGetSamplerOpaqueCaptureDescriptorDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pInfo, pData, __functionAddress);
    }

    /** {@code VkResult vkGetSamplerOpaqueCaptureDescriptorDataEXT(VkDevice device, VkSamplerCaptureDescriptorDataInfoEXT const * pInfo, void * pData)} */
    @NativeType("VkResult")
    public static int vkGetSamplerOpaqueCaptureDescriptorDataEXT(VkDevice device, @NativeType("VkSamplerCaptureDescriptorDataInfoEXT const *") VkSamplerCaptureDescriptorDataInfoEXT pInfo, @NativeType("void *") ByteBuffer pData) {
        if (CHECKS) {
            check(pData, 1);
        }
        return nvkGetSamplerOpaqueCaptureDescriptorDataEXT(device, pInfo.address(), memAddress(pData));
    }

    // --- [ vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT ] ---

    /** {@code VkResult vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT(VkDevice device, VkAccelerationStructureCaptureDescriptorDataInfoEXT const * pInfo, void * pData)} */
    public static int nvkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT(VkDevice device, long pInfo, long pData) {
        long __functionAddress = device.getCapabilities().vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pInfo, pData, __functionAddress);
    }

    /** {@code VkResult vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT(VkDevice device, VkAccelerationStructureCaptureDescriptorDataInfoEXT const * pInfo, void * pData)} */
    @NativeType("VkResult")
    public static int vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT(VkDevice device, @NativeType("VkAccelerationStructureCaptureDescriptorDataInfoEXT const *") VkAccelerationStructureCaptureDescriptorDataInfoEXT pInfo, @NativeType("void *") ByteBuffer pData) {
        if (CHECKS) {
            check(pData, 1);
        }
        return nvkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT(device, pInfo.address(), memAddress(pData));
    }

    /** {@code void vkGetDescriptorSetLayoutSizeEXT(VkDevice device, VkDescriptorSetLayout layout, VkDeviceSize * pLayoutSizeInBytes)} */
    public static void vkGetDescriptorSetLayoutSizeEXT(VkDevice device, @NativeType("VkDescriptorSetLayout") long layout, @NativeType("VkDeviceSize *") long[] pLayoutSizeInBytes) {
        long __functionAddress = device.getCapabilities().vkGetDescriptorSetLayoutSizeEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pLayoutSizeInBytes, 1);
        }
        callPJPV(device.address(), layout, pLayoutSizeInBytes, __functionAddress);
    }

    /** {@code void vkGetDescriptorSetLayoutBindingOffsetEXT(VkDevice device, VkDescriptorSetLayout layout, uint32_t binding, VkDeviceSize * pOffset)} */
    public static void vkGetDescriptorSetLayoutBindingOffsetEXT(VkDevice device, @NativeType("VkDescriptorSetLayout") long layout, @NativeType("uint32_t") int binding, @NativeType("VkDeviceSize *") long[] pOffset) {
        long __functionAddress = device.getCapabilities().vkGetDescriptorSetLayoutBindingOffsetEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pOffset, 1);
        }
        callPJPV(device.address(), layout, binding, pOffset, __functionAddress);
    }

    /** {@code void vkCmdSetDescriptorBufferOffsetsEXT(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipelineLayout layout, uint32_t firstSet, uint32_t setCount, uint32_t const * pBufferIndices, VkDeviceSize const * pOffsets)} */
    public static void vkCmdSetDescriptorBufferOffsetsEXT(VkCommandBuffer commandBuffer, @NativeType("VkPipelineBindPoint") int pipelineBindPoint, @NativeType("VkPipelineLayout") long layout, @NativeType("uint32_t") int firstSet, @NativeType("uint32_t const *") int[] pBufferIndices, @NativeType("VkDeviceSize const *") long[] pOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDescriptorBufferOffsetsEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pOffsets, pBufferIndices.length);
        }
        callPJPPV(commandBuffer.address(), pipelineBindPoint, layout, firstSet, pBufferIndices.length, pBufferIndices, pOffsets, __functionAddress);
    }

}