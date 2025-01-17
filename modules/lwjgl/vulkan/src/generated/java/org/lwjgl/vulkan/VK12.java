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

public class VK12 extends VK11 {

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES                     = 49,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES                   = 50,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES                     = 51,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES                   = 52,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES            = 1000082000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGELESS_FRAMEBUFFER_FEATURES          = 1000108000,
        VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO                     = 1000108001,
        VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO                       = 1000108002,
        VK_STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO                       = 1000108003,
        VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2                                = 1000109000,
        VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2                                  = 1000109001,
        VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2                                   = 1000109002,
        VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2                                    = 1000109003,
        VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2                               = 1000109004,
        VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO                                      = 1000109005,
        VK_STRUCTURE_TYPE_SUBPASS_END_INFO                                        = 1000109006,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES        = 1000130000,
        VK_STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO                      = 1000130001,
        VK_STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO                           = 1000147000,
        VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO         = 1000161000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES            = 1000161001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES          = 1000161002,
        VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO  = 1000161003,
        VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT = 1000161004,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES = 1000175000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES                   = 1000177000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES            = 1000180000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES                       = 1000196000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES               = 1000197000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES        = 1000199000,
        VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE               = 1000199001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES             = 1000207000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES           = 1000207001,
        VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO                              = 1000207002,
        VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO                          = 1000207003,
        VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO                                     = 1000207004,
        VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO                                   = 1000207005,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES            = 1000211000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES            = 1000221000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES = 1000241000,
        VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT                     = 1000241001,
        VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT                   = 1000241002,
        VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO                              = 1000244001,
        VK_STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO                         = 1000246000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES = 1000253000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES          = 1000257000,
        VK_STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO               = 1000257002,
        VK_STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO             = 1000257003,
        VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO               = 1000257004,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES               = 1000261000;

    public static final int VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE = 4;

    public static final int VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT = 0x2;

    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT = 0x2;

    public static final int
        VK_ERROR_FRAGMENTATION                  = -1000161000,
        VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS = -1000257000;

    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT = 0x10000;

    public static final int VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT = 0x1;

    public static final int
        VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL   = 1000241000,
        VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL    = 1000241001,
        VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL = 1000241002,
        VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL  = 1000241003;

    public static final int VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT = 0x20000;

    public static final int VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT = 0x10;

    public static final int
        VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT                = 0x2,
        VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT = 0x4;

    public static final int
        VK_DRIVER_ID_AMD_PROPRIETARY               = 1,
        VK_DRIVER_ID_AMD_OPEN_SOURCE               = 2,
        VK_DRIVER_ID_MESA_RADV                     = 3,
        VK_DRIVER_ID_NVIDIA_PROPRIETARY            = 4,
        VK_DRIVER_ID_INTEL_PROPRIETARY_WINDOWS     = 5,
        VK_DRIVER_ID_INTEL_OPEN_SOURCE_MESA        = 6,
        VK_DRIVER_ID_IMAGINATION_PROPRIETARY       = 7,
        VK_DRIVER_ID_QUALCOMM_PROPRIETARY          = 8,
        VK_DRIVER_ID_ARM_PROPRIETARY               = 9,
        VK_DRIVER_ID_GOOGLE_SWIFTSHADER            = 10,
        VK_DRIVER_ID_GGP_PROPRIETARY               = 11,
        VK_DRIVER_ID_BROADCOM_PROPRIETARY          = 12,
        VK_DRIVER_ID_MESA_LLVMPIPE                 = 13,
        VK_DRIVER_ID_MOLTENVK                      = 14,
        VK_DRIVER_ID_COREAVI_PROPRIETARY           = 15,
        VK_DRIVER_ID_JUICE_PROPRIETARY             = 16,
        VK_DRIVER_ID_VERISILICON_PROPRIETARY       = 17,
        VK_DRIVER_ID_MESA_TURNIP                   = 18,
        VK_DRIVER_ID_MESA_V3DV                     = 19,
        VK_DRIVER_ID_MESA_PANVK                    = 20,
        VK_DRIVER_ID_SAMSUNG_PROPRIETARY           = 21,
        VK_DRIVER_ID_MESA_VENUS                    = 22,
        VK_DRIVER_ID_MESA_DOZEN                    = 23,
        VK_DRIVER_ID_MESA_NVK                      = 24,
        VK_DRIVER_ID_IMAGINATION_OPEN_SOURCE_MESA  = 25,
        VK_DRIVER_ID_MESA_HONEYKRISP               = 26,
        VK_DRIVER_ID_VULKAN_SC_EMULATION_ON_VULKAN = 27;

    public static final int
        VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY = 0,
        VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL         = 1,
        VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE        = 2;

    public static final int
        VK_RESOLVE_MODE_NONE            = 0,
        VK_RESOLVE_MODE_SAMPLE_ZERO_BIT = 0x1,
        VK_RESOLVE_MODE_AVERAGE_BIT     = 0x2,
        VK_RESOLVE_MODE_MIN_BIT         = 0x4,
        VK_RESOLVE_MODE_MAX_BIT         = 0x8;

    public static final int
        VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT           = 0x1,
        VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT = 0x2,
        VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT             = 0x4,
        VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT   = 0x8;

    public static final int
        VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE = 0,
        VK_SAMPLER_REDUCTION_MODE_MIN              = 1,
        VK_SAMPLER_REDUCTION_MODE_MAX              = 2;

    public static final int
        VK_SEMAPHORE_TYPE_BINARY   = 0,
        VK_SEMAPHORE_TYPE_TIMELINE = 1;

    public static final int VK_SEMAPHORE_WAIT_ANY_BIT = 0x1;

    public static final int VK_API_VERSION_1_2 = VK_MAKE_API_VERSION(0, 1, 2, 0);

    public static final int
        VK_MAX_DRIVER_NAME_SIZE = 256,
        VK_MAX_DRIVER_INFO_SIZE = 256;

    protected VK12() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdDrawIndirectCount ] ---

    /** {@code void vkCmdDrawIndirectCount(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkBuffer countBuffer, VkDeviceSize countBufferOffset, uint32_t maxDrawCount, uint32_t stride)} */
    public static void vkCmdDrawIndirectCount(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset, @NativeType("VkBuffer") long countBuffer, @NativeType("VkDeviceSize") long countBufferOffset, @NativeType("uint32_t") int maxDrawCount, @NativeType("uint32_t") int stride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndirectCount;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJJJV(commandBuffer.address(), buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride, __functionAddress);
    }

    // --- [ vkCmdDrawIndexedIndirectCount ] ---

    /** {@code void vkCmdDrawIndexedIndirectCount(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkBuffer countBuffer, VkDeviceSize countBufferOffset, uint32_t maxDrawCount, uint32_t stride)} */
    public static void vkCmdDrawIndexedIndirectCount(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset, @NativeType("VkBuffer") long countBuffer, @NativeType("VkDeviceSize") long countBufferOffset, @NativeType("uint32_t") int maxDrawCount, @NativeType("uint32_t") int stride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndexedIndirectCount;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJJJV(commandBuffer.address(), buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride, __functionAddress);
    }

    // --- [ vkCreateRenderPass2 ] ---

    /** {@code VkResult vkCreateRenderPass2(VkDevice device, VkRenderPassCreateInfo2 const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkRenderPass * pRenderPass)} */
    public static int nvkCreateRenderPass2(VkDevice device, long pCreateInfo, long pAllocator, long pRenderPass) {
        long __functionAddress = device.getCapabilities().vkCreateRenderPass2;
        if (CHECKS) {
            check(__functionAddress);
            VkRenderPassCreateInfo2.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pRenderPass, __functionAddress);
    }

    /** {@code VkResult vkCreateRenderPass2(VkDevice device, VkRenderPassCreateInfo2 const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkRenderPass * pRenderPass)} */
    @NativeType("VkResult")
    public static int vkCreateRenderPass2(VkDevice device, @NativeType("VkRenderPassCreateInfo2 const *") VkRenderPassCreateInfo2 pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkRenderPass *") LongBuffer pRenderPass) {
        if (CHECKS) {
            check(pRenderPass, 1);
        }
        return nvkCreateRenderPass2(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pRenderPass));
    }

    // --- [ vkCmdBeginRenderPass2 ] ---

    /** {@code void vkCmdBeginRenderPass2(VkCommandBuffer commandBuffer, VkRenderPassBeginInfo const * pRenderPassBegin, VkSubpassBeginInfo const * pSubpassBeginInfo)} */
    public static void nvkCmdBeginRenderPass2(VkCommandBuffer commandBuffer, long pRenderPassBegin, long pSubpassBeginInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginRenderPass2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(commandBuffer.address(), pRenderPassBegin, pSubpassBeginInfo, __functionAddress);
    }

    /** {@code void vkCmdBeginRenderPass2(VkCommandBuffer commandBuffer, VkRenderPassBeginInfo const * pRenderPassBegin, VkSubpassBeginInfo const * pSubpassBeginInfo)} */
    public static void vkCmdBeginRenderPass2(VkCommandBuffer commandBuffer, @NativeType("VkRenderPassBeginInfo const *") VkRenderPassBeginInfo pRenderPassBegin, @NativeType("VkSubpassBeginInfo const *") VkSubpassBeginInfo pSubpassBeginInfo) {
        nvkCmdBeginRenderPass2(commandBuffer, pRenderPassBegin.address(), pSubpassBeginInfo.address());
    }

    // --- [ vkCmdNextSubpass2 ] ---

    /** {@code void vkCmdNextSubpass2(VkCommandBuffer commandBuffer, VkSubpassBeginInfo const * pSubpassBeginInfo, VkSubpassEndInfo const * pSubpassEndInfo)} */
    public static void nvkCmdNextSubpass2(VkCommandBuffer commandBuffer, long pSubpassBeginInfo, long pSubpassEndInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdNextSubpass2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(commandBuffer.address(), pSubpassBeginInfo, pSubpassEndInfo, __functionAddress);
    }

    /** {@code void vkCmdNextSubpass2(VkCommandBuffer commandBuffer, VkSubpassBeginInfo const * pSubpassBeginInfo, VkSubpassEndInfo const * pSubpassEndInfo)} */
    public static void vkCmdNextSubpass2(VkCommandBuffer commandBuffer, @NativeType("VkSubpassBeginInfo const *") VkSubpassBeginInfo pSubpassBeginInfo, @NativeType("VkSubpassEndInfo const *") VkSubpassEndInfo pSubpassEndInfo) {
        nvkCmdNextSubpass2(commandBuffer, pSubpassBeginInfo.address(), pSubpassEndInfo.address());
    }

    // --- [ vkCmdEndRenderPass2 ] ---

    /** {@code void vkCmdEndRenderPass2(VkCommandBuffer commandBuffer, VkSubpassEndInfo const * pSubpassEndInfo)} */
    public static void nvkCmdEndRenderPass2(VkCommandBuffer commandBuffer, long pSubpassEndInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndRenderPass2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pSubpassEndInfo, __functionAddress);
    }

    /** {@code void vkCmdEndRenderPass2(VkCommandBuffer commandBuffer, VkSubpassEndInfo const * pSubpassEndInfo)} */
    public static void vkCmdEndRenderPass2(VkCommandBuffer commandBuffer, @NativeType("VkSubpassEndInfo const *") VkSubpassEndInfo pSubpassEndInfo) {
        nvkCmdEndRenderPass2(commandBuffer, pSubpassEndInfo.address());
    }

    // --- [ vkResetQueryPool ] ---

    /** {@code void vkResetQueryPool(VkDevice device, VkQueryPool queryPool, uint32_t firstQuery, uint32_t queryCount)} */
    public static void vkResetQueryPool(VkDevice device, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery, @NativeType("uint32_t") int queryCount) {
        long __functionAddress = device.getCapabilities().vkResetQueryPool;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(device.address(), queryPool, firstQuery, queryCount, __functionAddress);
    }

    // --- [ vkGetSemaphoreCounterValue ] ---

    /** {@code VkResult vkGetSemaphoreCounterValue(VkDevice device, VkSemaphore semaphore, uint64_t * pValue)} */
    public static int nvkGetSemaphoreCounterValue(VkDevice device, long semaphore, long pValue) {
        long __functionAddress = device.getCapabilities().vkGetSemaphoreCounterValue;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), semaphore, pValue, __functionAddress);
    }

    /** {@code VkResult vkGetSemaphoreCounterValue(VkDevice device, VkSemaphore semaphore, uint64_t * pValue)} */
    @NativeType("VkResult")
    public static int vkGetSemaphoreCounterValue(VkDevice device, @NativeType("VkSemaphore") long semaphore, @NativeType("uint64_t *") LongBuffer pValue) {
        if (CHECKS) {
            check(pValue, 1);
        }
        return nvkGetSemaphoreCounterValue(device, semaphore, memAddress(pValue));
    }

    // --- [ vkWaitSemaphores ] ---

    /** {@code VkResult vkWaitSemaphores(VkDevice device, VkSemaphoreWaitInfo const * pWaitInfo, uint64_t timeout)} */
    public static int nvkWaitSemaphores(VkDevice device, long pWaitInfo, long timeout) {
        long __functionAddress = device.getCapabilities().vkWaitSemaphores;
        if (CHECKS) {
            check(__functionAddress);
            VkSemaphoreWaitInfo.validate(pWaitInfo);
        }
        return callPPJI(device.address(), pWaitInfo, timeout, __functionAddress);
    }

    /** {@code VkResult vkWaitSemaphores(VkDevice device, VkSemaphoreWaitInfo const * pWaitInfo, uint64_t timeout)} */
    @NativeType("VkResult")
    public static int vkWaitSemaphores(VkDevice device, @NativeType("VkSemaphoreWaitInfo const *") VkSemaphoreWaitInfo pWaitInfo, @NativeType("uint64_t") long timeout) {
        return nvkWaitSemaphores(device, pWaitInfo.address(), timeout);
    }

    // --- [ vkSignalSemaphore ] ---

    /** {@code VkResult vkSignalSemaphore(VkDevice device, VkSemaphoreSignalInfo const * pSignalInfo)} */
    public static int nvkSignalSemaphore(VkDevice device, long pSignalInfo) {
        long __functionAddress = device.getCapabilities().vkSignalSemaphore;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pSignalInfo, __functionAddress);
    }

    /** {@code VkResult vkSignalSemaphore(VkDevice device, VkSemaphoreSignalInfo const * pSignalInfo)} */
    @NativeType("VkResult")
    public static int vkSignalSemaphore(VkDevice device, @NativeType("VkSemaphoreSignalInfo const *") VkSemaphoreSignalInfo pSignalInfo) {
        return nvkSignalSemaphore(device, pSignalInfo.address());
    }

    // --- [ vkGetBufferDeviceAddress ] ---

    /** {@code VkDeviceAddress vkGetBufferDeviceAddress(VkDevice device, VkBufferDeviceAddressInfo const * pInfo)} */
    public static long nvkGetBufferDeviceAddress(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetBufferDeviceAddress;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJ(device.address(), pInfo, __functionAddress);
    }

    /** {@code VkDeviceAddress vkGetBufferDeviceAddress(VkDevice device, VkBufferDeviceAddressInfo const * pInfo)} */
    @NativeType("VkDeviceAddress")
    public static long vkGetBufferDeviceAddress(VkDevice device, @NativeType("VkBufferDeviceAddressInfo const *") VkBufferDeviceAddressInfo pInfo) {
        return nvkGetBufferDeviceAddress(device, pInfo.address());
    }

    // --- [ vkGetBufferOpaqueCaptureAddress ] ---

    /** {@code uint64_t vkGetBufferOpaqueCaptureAddress(VkDevice device, VkBufferDeviceAddressInfo const * pInfo)} */
    public static long nvkGetBufferOpaqueCaptureAddress(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetBufferOpaqueCaptureAddress;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJ(device.address(), pInfo, __functionAddress);
    }

    /** {@code uint64_t vkGetBufferOpaqueCaptureAddress(VkDevice device, VkBufferDeviceAddressInfo const * pInfo)} */
    @NativeType("uint64_t")
    public static long vkGetBufferOpaqueCaptureAddress(VkDevice device, @NativeType("VkBufferDeviceAddressInfo const *") VkBufferDeviceAddressInfo pInfo) {
        return nvkGetBufferOpaqueCaptureAddress(device, pInfo.address());
    }

    // --- [ vkGetDeviceMemoryOpaqueCaptureAddress ] ---

    /** {@code uint64_t vkGetDeviceMemoryOpaqueCaptureAddress(VkDevice device, VkDeviceMemoryOpaqueCaptureAddressInfo const * pInfo)} */
    public static long nvkGetDeviceMemoryOpaqueCaptureAddress(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetDeviceMemoryOpaqueCaptureAddress;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJ(device.address(), pInfo, __functionAddress);
    }

    /** {@code uint64_t vkGetDeviceMemoryOpaqueCaptureAddress(VkDevice device, VkDeviceMemoryOpaqueCaptureAddressInfo const * pInfo)} */
    @NativeType("uint64_t")
    public static long vkGetDeviceMemoryOpaqueCaptureAddress(VkDevice device, @NativeType("VkDeviceMemoryOpaqueCaptureAddressInfo const *") VkDeviceMemoryOpaqueCaptureAddressInfo pInfo) {
        return nvkGetDeviceMemoryOpaqueCaptureAddress(device, pInfo.address());
    }

    /** {@code VkResult vkCreateRenderPass2(VkDevice device, VkRenderPassCreateInfo2 const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkRenderPass * pRenderPass)} */
    @NativeType("VkResult")
    public static int vkCreateRenderPass2(VkDevice device, @NativeType("VkRenderPassCreateInfo2 const *") VkRenderPassCreateInfo2 pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkRenderPass *") long[] pRenderPass) {
        long __functionAddress = device.getCapabilities().vkCreateRenderPass2;
        if (CHECKS) {
            check(__functionAddress);
            check(pRenderPass, 1);
            VkRenderPassCreateInfo2.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pRenderPass, __functionAddress);
    }

    /** {@code VkResult vkGetSemaphoreCounterValue(VkDevice device, VkSemaphore semaphore, uint64_t * pValue)} */
    @NativeType("VkResult")
    public static int vkGetSemaphoreCounterValue(VkDevice device, @NativeType("VkSemaphore") long semaphore, @NativeType("uint64_t *") long[] pValue) {
        long __functionAddress = device.getCapabilities().vkGetSemaphoreCounterValue;
        if (CHECKS) {
            check(__functionAddress);
            check(pValue, 1);
        }
        return callPJPI(device.address(), semaphore, pValue, __functionAddress);
    }

}