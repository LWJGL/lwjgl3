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

public class VK13 extends VK12 {

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES                         = 53,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES                       = 54,
        VK_STRUCTURE_TYPE_RENDERING_INFO                                              = 1000044000,
        VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO                                   = 1000044001,
        VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO                              = 1000044002,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES                  = 1000044003,
        VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO                   = 1000044004,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES       = 1000066000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES               = 1000138000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES             = 1000138001,
        VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK                   = 1000138002,
        VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO            = 1000138003,
        VK_STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO                      = 1000192000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES        = 1000215000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES            = 1000225000,
        VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO    = 1000225001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES              = 1000225002,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES                             = 1000245000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES = 1000276000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES         = 1000280000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES       = 1000280001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES           = 1000281001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES                       = 1000295000,
        VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO                             = 1000295001,
        VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO                               = 1000295002,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES    = 1000297000,
        VK_STRUCTURE_TYPE_MEMORY_BARRIER_2                                            = 1000314000,
        VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2                                     = 1000314001,
        VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2                                      = 1000314002,
        VK_STRUCTURE_TYPE_DEPENDENCY_INFO                                             = 1000314003,
        VK_STRUCTURE_TYPE_SUBMIT_INFO_2                                               = 1000314004,
        VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO                                       = 1000314005,
        VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO                                  = 1000314006,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES                  = 1000314007,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES   = 1000325000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES                   = 1000335000,
        VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2                                          = 1000337000,
        VK_STRUCTURE_TYPE_COPY_IMAGE_INFO_2                                           = 1000337001,
        VK_STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2                                 = 1000337002,
        VK_STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2                                 = 1000337003,
        VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2                                           = 1000337004,
        VK_STRUCTURE_TYPE_RESOLVE_IMAGE_INFO_2                                        = 1000337005,
        VK_STRUCTURE_TYPE_BUFFER_COPY_2                                               = 1000337006,
        VK_STRUCTURE_TYPE_IMAGE_COPY_2                                                = 1000337007,
        VK_STRUCTURE_TYPE_IMAGE_BLIT_2                                                = 1000337008,
        VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2                                         = 1000337009,
        VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2                                             = 1000337010,
        VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_3                                         = 1000360000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES                      = 1000413000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES                    = 1000413001,
        VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS                           = 1000413002,
        VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS                            = 1000413003;

    public static final int VK_OBJECT_TYPE_PRIVATE_DATA_SLOT = 1000295000;

    public static final int
        VK_PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT = 0x100,
        VK_PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT           = 0x200;

    public static final int VK_PIPELINE_COMPILE_REQUIRED = 1000297000;

    public static final int VK_PIPELINE_CACHE_CREATE_EXTERNALLY_SYNCHRONIZED_BIT = 0x1;

    public static final int VK_EVENT_CREATE_DEVICE_ONLY_BIT = 0x1;

    public static final int
        VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL  = 1000314000,
        VK_IMAGE_LAYOUT_ATTACHMENT_OPTIMAL = 1000314001;

    public static final int VK_PIPELINE_STAGE_NONE = 0;

    public static final int VK_ACCESS_NONE = 0;

    public static final int
        VK_PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT = 0x1,
        VK_PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT      = 0x2;

    public static final int VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK = 1000138000;

    public static final int
        VK_FORMAT_ASTC_4x4_SFLOAT_BLOCK                     = 1000066000,
        VK_FORMAT_ASTC_5x4_SFLOAT_BLOCK                     = 1000066001,
        VK_FORMAT_ASTC_5x5_SFLOAT_BLOCK                     = 1000066002,
        VK_FORMAT_ASTC_6x5_SFLOAT_BLOCK                     = 1000066003,
        VK_FORMAT_ASTC_6x6_SFLOAT_BLOCK                     = 1000066004,
        VK_FORMAT_ASTC_8x5_SFLOAT_BLOCK                     = 1000066005,
        VK_FORMAT_ASTC_8x6_SFLOAT_BLOCK                     = 1000066006,
        VK_FORMAT_ASTC_8x8_SFLOAT_BLOCK                     = 1000066007,
        VK_FORMAT_ASTC_10x5_SFLOAT_BLOCK                    = 1000066008,
        VK_FORMAT_ASTC_10x6_SFLOAT_BLOCK                    = 1000066009,
        VK_FORMAT_ASTC_10x8_SFLOAT_BLOCK                    = 1000066010,
        VK_FORMAT_ASTC_10x10_SFLOAT_BLOCK                   = 1000066011,
        VK_FORMAT_ASTC_12x10_SFLOAT_BLOCK                   = 1000066012,
        VK_FORMAT_ASTC_12x12_SFLOAT_BLOCK                   = 1000066013,
        VK_FORMAT_G8_B8R8_2PLANE_444_UNORM                  = 1000330000,
        VK_FORMAT_G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16 = 1000330001,
        VK_FORMAT_G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16 = 1000330002,
        VK_FORMAT_G16_B16R16_2PLANE_444_UNORM               = 1000330003,
        VK_FORMAT_A4R4G4B4_UNORM_PACK16                     = 1000340000,
        VK_FORMAT_A4B4G4R4_UNORM_PACK16                     = 1000340001;

    public static final int VK_ATTACHMENT_STORE_OP_NONE = 1000301000;

    public static final int
        VK_DYNAMIC_STATE_CULL_MODE                   = 1000267000,
        VK_DYNAMIC_STATE_FRONT_FACE                  = 1000267001,
        VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY          = 1000267002,
        VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT         = 1000267003,
        VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT          = 1000267004,
        VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE = 1000267005,
        VK_DYNAMIC_STATE_DEPTH_TEST_ENABLE           = 1000267006,
        VK_DYNAMIC_STATE_DEPTH_WRITE_ENABLE          = 1000267007,
        VK_DYNAMIC_STATE_DEPTH_COMPARE_OP            = 1000267008,
        VK_DYNAMIC_STATE_DEPTH_BOUNDS_TEST_ENABLE    = 1000267009,
        VK_DYNAMIC_STATE_STENCIL_TEST_ENABLE         = 1000267010,
        VK_DYNAMIC_STATE_STENCIL_OP                  = 1000267011,
        VK_DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE   = 1000377001,
        VK_DYNAMIC_STATE_DEPTH_BIAS_ENABLE           = 1000377002,
        VK_DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE    = 1000377004;

    public static final long
        VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT                                                           = 0x1L,
        VK_FORMAT_FEATURE_2_STORAGE_IMAGE_BIT                                                           = 0x2L,
        VK_FORMAT_FEATURE_2_STORAGE_IMAGE_ATOMIC_BIT                                                    = 0x4L,
        VK_FORMAT_FEATURE_2_UNIFORM_TEXEL_BUFFER_BIT                                                    = 0x8L,
        VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_BIT                                                    = 0x10L,
        VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_ATOMIC_BIT                                             = 0x20L,
        VK_FORMAT_FEATURE_2_VERTEX_BUFFER_BIT                                                           = 0x40L,
        VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BIT                                                        = 0x80L,
        VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BLEND_BIT                                                  = 0x100L,
        VK_FORMAT_FEATURE_2_DEPTH_STENCIL_ATTACHMENT_BIT                                                = 0x200L,
        VK_FORMAT_FEATURE_2_BLIT_SRC_BIT                                                                = 0x400L,
        VK_FORMAT_FEATURE_2_BLIT_DST_BIT                                                                = 0x800L,
        VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_LINEAR_BIT                                             = 0x1000L,
        VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_CUBIC_BIT                                              = 0x2000L,
        VK_FORMAT_FEATURE_2_TRANSFER_SRC_BIT                                                            = 0x4000L,
        VK_FORMAT_FEATURE_2_TRANSFER_DST_BIT                                                            = 0x8000L,
        VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_MINMAX_BIT                                             = 0x10000L,
        VK_FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT                                                 = 0x20000L,
        VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT                            = 0x40000L,
        VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT           = 0x80000L,
        VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT           = 0x100000L,
        VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT = 0x200000L,
        VK_FORMAT_FEATURE_2_DISJOINT_BIT                                                                = 0x400000L,
        VK_FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT                                                  = 0x800000L,
        VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT                                             = 0x80000000L,
        VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT                                            = 0x100000000L,
        VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT                                          = 0x200000000L;

    public static final int VK_IMAGE_ASPECT_NONE = 0;

    public static final int
        VK_PIPELINE_CREATION_FEEDBACK_VALID_BIT                          = 0x1,
        VK_PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT = 0x2,
        VK_PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT     = 0x4;

    public static final int
        VK_TOOL_PURPOSE_VALIDATION_BIT          = 0x1,
        VK_TOOL_PURPOSE_PROFILING_BIT           = 0x2,
        VK_TOOL_PURPOSE_TRACING_BIT             = 0x4,
        VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT = 0x8,
        VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT  = 0x10;

    public static final long
        VK_PIPELINE_STAGE_2_NONE                               = 0L,
        VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT                    = 0x1L,
        VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT                  = 0x2L,
        VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT                   = 0x4L,
        VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT                  = 0x8L,
        VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT    = 0x10L,
        VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT = 0x20L,
        VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT                = 0x40L,
        VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT                = 0x80L,
        VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT           = 0x100L,
        VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT            = 0x200L,
        VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT        = 0x400L,
        VK_PIPELINE_STAGE_2_COMPUTE_SHADER_BIT                 = 0x800L,
        VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT                   = 0x1000L,
        VK_PIPELINE_STAGE_2_TRANSFER_BIT                       = 0x1000L,
        VK_PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT                 = 0x2000L,
        VK_PIPELINE_STAGE_2_HOST_BIT                           = 0x4000L,
        VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT                   = 0x8000L,
        VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT                   = 0x10000L,
        VK_PIPELINE_STAGE_2_COPY_BIT                           = 0x100000000L,
        VK_PIPELINE_STAGE_2_RESOLVE_BIT                        = 0x200000000L,
        VK_PIPELINE_STAGE_2_BLIT_BIT                           = 0x400000000L,
        VK_PIPELINE_STAGE_2_CLEAR_BIT                          = 0x800000000L,
        VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT                    = 0x1000000000L,
        VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT         = 0x2000000000L,
        VK_PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT      = 0x4000000000L;

    public static final long
        VK_ACCESS_2_NONE                               = 0L,
        VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT          = 0x1L,
        VK_ACCESS_2_INDEX_READ_BIT                     = 0x2L,
        VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT          = 0x4L,
        VK_ACCESS_2_UNIFORM_READ_BIT                   = 0x8L,
        VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT          = 0x10L,
        VK_ACCESS_2_SHADER_READ_BIT                    = 0x20L,
        VK_ACCESS_2_SHADER_WRITE_BIT                   = 0x40L,
        VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT          = 0x80L,
        VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT         = 0x100L,
        VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT  = 0x200L,
        VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT = 0x400L,
        VK_ACCESS_2_TRANSFER_READ_BIT                  = 0x800L,
        VK_ACCESS_2_TRANSFER_WRITE_BIT                 = 0x1000L,
        VK_ACCESS_2_HOST_READ_BIT                      = 0x2000L,
        VK_ACCESS_2_HOST_WRITE_BIT                     = 0x4000L,
        VK_ACCESS_2_MEMORY_READ_BIT                    = 0x8000L,
        VK_ACCESS_2_MEMORY_WRITE_BIT                   = 0x10000L,
        VK_ACCESS_2_SHADER_SAMPLED_READ_BIT            = 0x100000000L,
        VK_ACCESS_2_SHADER_STORAGE_READ_BIT            = 0x200000000L,
        VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT           = 0x400000000L;

    public static final int VK_SUBMIT_PROTECTED_BIT = 0x1;

    public static final int
        VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT = 0x1,
        VK_RENDERING_SUSPENDING_BIT                         = 0x2,
        VK_RENDERING_RESUMING_BIT                           = 0x4;

    public static final int VK_API_VERSION_1_3 = VK_MAKE_API_VERSION(0, 1, 3, 0);

    protected VK13() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceToolProperties ] ---

    /** {@code VkResult vkGetPhysicalDeviceToolProperties(VkPhysicalDevice physicalDevice, uint32_t * pToolCount, VkPhysicalDeviceToolProperties * pToolProperties)} */
    public static int nvkGetPhysicalDeviceToolProperties(VkPhysicalDevice physicalDevice, long pToolCount, long pToolProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceToolProperties;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pToolCount, pToolProperties, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceToolProperties(VkPhysicalDevice physicalDevice, uint32_t * pToolCount, VkPhysicalDeviceToolProperties * pToolProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceToolProperties(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pToolCount, @NativeType("VkPhysicalDeviceToolProperties *") VkPhysicalDeviceToolProperties.@Nullable Buffer pToolProperties) {
        if (CHECKS) {
            check(pToolCount, 1);
            checkSafe(pToolProperties, pToolCount.get(pToolCount.position()));
        }
        return nvkGetPhysicalDeviceToolProperties(physicalDevice, memAddress(pToolCount), memAddressSafe(pToolProperties));
    }

    // --- [ vkCreatePrivateDataSlot ] ---

    /** {@code VkResult vkCreatePrivateDataSlot(VkDevice device, VkPrivateDataSlotCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkPrivateDataSlot * pPrivateDataSlot)} */
    public static int nvkCreatePrivateDataSlot(VkDevice device, long pCreateInfo, long pAllocator, long pPrivateDataSlot) {
        long __functionAddress = device.getCapabilities().vkCreatePrivateDataSlot;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pPrivateDataSlot, __functionAddress);
    }

    /** {@code VkResult vkCreatePrivateDataSlot(VkDevice device, VkPrivateDataSlotCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkPrivateDataSlot * pPrivateDataSlot)} */
    @NativeType("VkResult")
    public static int vkCreatePrivateDataSlot(VkDevice device, @NativeType("VkPrivateDataSlotCreateInfo const *") VkPrivateDataSlotCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkPrivateDataSlot *") LongBuffer pPrivateDataSlot) {
        if (CHECKS) {
            check(pPrivateDataSlot, 1);
        }
        return nvkCreatePrivateDataSlot(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pPrivateDataSlot));
    }

    // --- [ vkDestroyPrivateDataSlot ] ---

    /** {@code void vkDestroyPrivateDataSlot(VkDevice device, VkPrivateDataSlot privateDataSlot, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyPrivateDataSlot(VkDevice device, long privateDataSlot, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyPrivateDataSlot;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), privateDataSlot, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyPrivateDataSlot(VkDevice device, VkPrivateDataSlot privateDataSlot, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyPrivateDataSlot(VkDevice device, @NativeType("VkPrivateDataSlot") long privateDataSlot, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyPrivateDataSlot(device, privateDataSlot, memAddressSafe(pAllocator));
    }

    // --- [ vkSetPrivateData ] ---

    /** {@code VkResult vkSetPrivateData(VkDevice device, VkObjectType objectType, uint64_t objectHandle, VkPrivateDataSlot privateDataSlot, uint64_t data)} */
    @NativeType("VkResult")
    public static int vkSetPrivateData(VkDevice device, @NativeType("VkObjectType") int objectType, @NativeType("uint64_t") long objectHandle, @NativeType("VkPrivateDataSlot") long privateDataSlot, @NativeType("uint64_t") long data) {
        long __functionAddress = device.getCapabilities().vkSetPrivateData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJJJI(device.address(), objectType, objectHandle, privateDataSlot, data, __functionAddress);
    }

    // --- [ vkGetPrivateData ] ---

    /** {@code void vkGetPrivateData(VkDevice device, VkObjectType objectType, uint64_t objectHandle, VkPrivateDataSlot privateDataSlot, uint64_t * pData)} */
    public static void nvkGetPrivateData(VkDevice device, int objectType, long objectHandle, long privateDataSlot, long pData) {
        long __functionAddress = device.getCapabilities().vkGetPrivateData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJPV(device.address(), objectType, objectHandle, privateDataSlot, pData, __functionAddress);
    }

    /** {@code void vkGetPrivateData(VkDevice device, VkObjectType objectType, uint64_t objectHandle, VkPrivateDataSlot privateDataSlot, uint64_t * pData)} */
    public static void vkGetPrivateData(VkDevice device, @NativeType("VkObjectType") int objectType, @NativeType("uint64_t") long objectHandle, @NativeType("VkPrivateDataSlot") long privateDataSlot, @NativeType("uint64_t *") LongBuffer pData) {
        if (CHECKS) {
            check(pData, 1);
        }
        nvkGetPrivateData(device, objectType, objectHandle, privateDataSlot, memAddress(pData));
    }

    // --- [ vkCmdSetEvent2 ] ---

    /** {@code void vkCmdSetEvent2(VkCommandBuffer commandBuffer, VkEvent event, VkDependencyInfo const * pDependencyInfo)} */
    public static void nvkCmdSetEvent2(VkCommandBuffer commandBuffer, long event, long pDependencyInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetEvent2;
        if (CHECKS) {
            check(__functionAddress);
            VkDependencyInfo.validate(pDependencyInfo);
        }
        callPJPV(commandBuffer.address(), event, pDependencyInfo, __functionAddress);
    }

    /** {@code void vkCmdSetEvent2(VkCommandBuffer commandBuffer, VkEvent event, VkDependencyInfo const * pDependencyInfo)} */
    public static void vkCmdSetEvent2(VkCommandBuffer commandBuffer, @NativeType("VkEvent") long event, @NativeType("VkDependencyInfo const *") VkDependencyInfo pDependencyInfo) {
        nvkCmdSetEvent2(commandBuffer, event, pDependencyInfo.address());
    }

    // --- [ vkCmdResetEvent2 ] ---

    /** {@code void vkCmdResetEvent2(VkCommandBuffer commandBuffer, VkEvent event, VkPipelineStageFlags2 stageMask)} */
    public static void vkCmdResetEvent2(VkCommandBuffer commandBuffer, @NativeType("VkEvent") long event, @NativeType("VkPipelineStageFlags2") long stageMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdResetEvent2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJV(commandBuffer.address(), event, stageMask, __functionAddress);
    }

    // --- [ vkCmdWaitEvents2 ] ---

    /** {@code void vkCmdWaitEvents2(VkCommandBuffer commandBuffer, uint32_t eventCount, VkEvent const * pEvents, VkDependencyInfo const * pDependencyInfos)} */
    public static void nvkCmdWaitEvents2(VkCommandBuffer commandBuffer, int eventCount, long pEvents, long pDependencyInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWaitEvents2;
        if (CHECKS) {
            check(__functionAddress);
            Struct.validate(pDependencyInfos, eventCount, VkDependencyInfo.SIZEOF, VkDependencyInfo::validate);
        }
        callPPPV(commandBuffer.address(), eventCount, pEvents, pDependencyInfos, __functionAddress);
    }

    /** {@code void vkCmdWaitEvents2(VkCommandBuffer commandBuffer, uint32_t eventCount, VkEvent const * pEvents, VkDependencyInfo const * pDependencyInfos)} */
    public static void vkCmdWaitEvents2(VkCommandBuffer commandBuffer, @NativeType("VkEvent const *") LongBuffer pEvents, @NativeType("VkDependencyInfo const *") VkDependencyInfo.Buffer pDependencyInfos) {
        if (CHECKS) {
            check(pDependencyInfos, pEvents.remaining());
        }
        nvkCmdWaitEvents2(commandBuffer, pEvents.remaining(), memAddress(pEvents), pDependencyInfos.address());
    }

    // --- [ vkCmdPipelineBarrier2 ] ---

    /** {@code void vkCmdPipelineBarrier2(VkCommandBuffer commandBuffer, VkDependencyInfo const * pDependencyInfo)} */
    public static void nvkCmdPipelineBarrier2(VkCommandBuffer commandBuffer, long pDependencyInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPipelineBarrier2;
        if (CHECKS) {
            check(__functionAddress);
            VkDependencyInfo.validate(pDependencyInfo);
        }
        callPPV(commandBuffer.address(), pDependencyInfo, __functionAddress);
    }

    /** {@code void vkCmdPipelineBarrier2(VkCommandBuffer commandBuffer, VkDependencyInfo const * pDependencyInfo)} */
    public static void vkCmdPipelineBarrier2(VkCommandBuffer commandBuffer, @NativeType("VkDependencyInfo const *") VkDependencyInfo pDependencyInfo) {
        nvkCmdPipelineBarrier2(commandBuffer, pDependencyInfo.address());
    }

    // --- [ vkCmdWriteTimestamp2 ] ---

    /** {@code void vkCmdWriteTimestamp2(VkCommandBuffer commandBuffer, VkPipelineStageFlags2 stage, VkQueryPool queryPool, uint32_t query)} */
    public static void vkCmdWriteTimestamp2(VkCommandBuffer commandBuffer, @NativeType("VkPipelineStageFlags2") long stage, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int query) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteTimestamp2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJV(commandBuffer.address(), stage, queryPool, query, __functionAddress);
    }

    // --- [ vkQueueSubmit2 ] ---

    /** {@code VkResult vkQueueSubmit2(VkQueue queue, uint32_t submitCount, VkSubmitInfo2 const * pSubmits, VkFence fence)} */
    public static int nvkQueueSubmit2(VkQueue queue, int submitCount, long pSubmits, long fence) {
        long __functionAddress = queue.getCapabilities().vkQueueSubmit2;
        if (CHECKS) {
            check(__functionAddress);
            if (pSubmits != NULL) { Struct.validate(pSubmits, submitCount, VkSubmitInfo2.SIZEOF, VkSubmitInfo2::validate); }
        }
        return callPPJI(queue.address(), submitCount, pSubmits, fence, __functionAddress);
    }

    /** {@code VkResult vkQueueSubmit2(VkQueue queue, uint32_t submitCount, VkSubmitInfo2 const * pSubmits, VkFence fence)} */
    @NativeType("VkResult")
    public static int vkQueueSubmit2(VkQueue queue, @NativeType("VkSubmitInfo2 const *") VkSubmitInfo2.@Nullable Buffer pSubmits, @NativeType("VkFence") long fence) {
        return nvkQueueSubmit2(queue, remainingSafe(pSubmits), memAddressSafe(pSubmits), fence);
    }

    // --- [ vkCmdCopyBuffer2 ] ---

    /** {@code void vkCmdCopyBuffer2(VkCommandBuffer commandBuffer, VkCopyBufferInfo2 const * pCopyBufferInfo)} */
    public static void nvkCmdCopyBuffer2(VkCommandBuffer commandBuffer, long pCopyBufferInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyBuffer2;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyBufferInfo2.validate(pCopyBufferInfo);
        }
        callPPV(commandBuffer.address(), pCopyBufferInfo, __functionAddress);
    }

    /** {@code void vkCmdCopyBuffer2(VkCommandBuffer commandBuffer, VkCopyBufferInfo2 const * pCopyBufferInfo)} */
    public static void vkCmdCopyBuffer2(VkCommandBuffer commandBuffer, @NativeType("VkCopyBufferInfo2 const *") VkCopyBufferInfo2 pCopyBufferInfo) {
        nvkCmdCopyBuffer2(commandBuffer, pCopyBufferInfo.address());
    }

    // --- [ vkCmdCopyImage2 ] ---

    /** {@code void vkCmdCopyImage2(VkCommandBuffer commandBuffer, VkCopyImageInfo2 const * pCopyImageInfo)} */
    public static void nvkCmdCopyImage2(VkCommandBuffer commandBuffer, long pCopyImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyImage2;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyImageInfo2.validate(pCopyImageInfo);
        }
        callPPV(commandBuffer.address(), pCopyImageInfo, __functionAddress);
    }

    /** {@code void vkCmdCopyImage2(VkCommandBuffer commandBuffer, VkCopyImageInfo2 const * pCopyImageInfo)} */
    public static void vkCmdCopyImage2(VkCommandBuffer commandBuffer, @NativeType("VkCopyImageInfo2 const *") VkCopyImageInfo2 pCopyImageInfo) {
        nvkCmdCopyImage2(commandBuffer, pCopyImageInfo.address());
    }

    // --- [ vkCmdCopyBufferToImage2 ] ---

    /** {@code void vkCmdCopyBufferToImage2(VkCommandBuffer commandBuffer, VkCopyBufferToImageInfo2 const * pCopyBufferToImageInfo)} */
    public static void nvkCmdCopyBufferToImage2(VkCommandBuffer commandBuffer, long pCopyBufferToImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyBufferToImage2;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyBufferToImageInfo2.validate(pCopyBufferToImageInfo);
        }
        callPPV(commandBuffer.address(), pCopyBufferToImageInfo, __functionAddress);
    }

    /** {@code void vkCmdCopyBufferToImage2(VkCommandBuffer commandBuffer, VkCopyBufferToImageInfo2 const * pCopyBufferToImageInfo)} */
    public static void vkCmdCopyBufferToImage2(VkCommandBuffer commandBuffer, @NativeType("VkCopyBufferToImageInfo2 const *") VkCopyBufferToImageInfo2 pCopyBufferToImageInfo) {
        nvkCmdCopyBufferToImage2(commandBuffer, pCopyBufferToImageInfo.address());
    }

    // --- [ vkCmdCopyImageToBuffer2 ] ---

    /** {@code void vkCmdCopyImageToBuffer2(VkCommandBuffer commandBuffer, VkCopyImageToBufferInfo2 const * pCopyImageToBufferInfo)} */
    public static void nvkCmdCopyImageToBuffer2(VkCommandBuffer commandBuffer, long pCopyImageToBufferInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyImageToBuffer2;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyImageToBufferInfo2.validate(pCopyImageToBufferInfo);
        }
        callPPV(commandBuffer.address(), pCopyImageToBufferInfo, __functionAddress);
    }

    /** {@code void vkCmdCopyImageToBuffer2(VkCommandBuffer commandBuffer, VkCopyImageToBufferInfo2 const * pCopyImageToBufferInfo)} */
    public static void vkCmdCopyImageToBuffer2(VkCommandBuffer commandBuffer, @NativeType("VkCopyImageToBufferInfo2 const *") VkCopyImageToBufferInfo2 pCopyImageToBufferInfo) {
        nvkCmdCopyImageToBuffer2(commandBuffer, pCopyImageToBufferInfo.address());
    }

    // --- [ vkCmdBlitImage2 ] ---

    /** {@code void vkCmdBlitImage2(VkCommandBuffer commandBuffer, VkBlitImageInfo2 const * pBlitImageInfo)} */
    public static void nvkCmdBlitImage2(VkCommandBuffer commandBuffer, long pBlitImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBlitImage2;
        if (CHECKS) {
            check(__functionAddress);
            VkBlitImageInfo2.validate(pBlitImageInfo);
        }
        callPPV(commandBuffer.address(), pBlitImageInfo, __functionAddress);
    }

    /** {@code void vkCmdBlitImage2(VkCommandBuffer commandBuffer, VkBlitImageInfo2 const * pBlitImageInfo)} */
    public static void vkCmdBlitImage2(VkCommandBuffer commandBuffer, @NativeType("VkBlitImageInfo2 const *") VkBlitImageInfo2 pBlitImageInfo) {
        nvkCmdBlitImage2(commandBuffer, pBlitImageInfo.address());
    }

    // --- [ vkCmdResolveImage2 ] ---

    /** {@code void vkCmdResolveImage2(VkCommandBuffer commandBuffer, VkResolveImageInfo2 const * pResolveImageInfo)} */
    public static void nvkCmdResolveImage2(VkCommandBuffer commandBuffer, long pResolveImageInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdResolveImage2;
        if (CHECKS) {
            check(__functionAddress);
            VkResolveImageInfo2.validate(pResolveImageInfo);
        }
        callPPV(commandBuffer.address(), pResolveImageInfo, __functionAddress);
    }

    /** {@code void vkCmdResolveImage2(VkCommandBuffer commandBuffer, VkResolveImageInfo2 const * pResolveImageInfo)} */
    public static void vkCmdResolveImage2(VkCommandBuffer commandBuffer, @NativeType("VkResolveImageInfo2 const *") VkResolveImageInfo2 pResolveImageInfo) {
        nvkCmdResolveImage2(commandBuffer, pResolveImageInfo.address());
    }

    // --- [ vkCmdBeginRendering ] ---

    /** {@code void vkCmdBeginRendering(VkCommandBuffer commandBuffer, VkRenderingInfo const * pRenderingInfo)} */
    public static void nvkCmdBeginRendering(VkCommandBuffer commandBuffer, long pRenderingInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginRendering;
        if (CHECKS) {
            check(__functionAddress);
            VkRenderingInfo.validate(pRenderingInfo);
        }
        callPPV(commandBuffer.address(), pRenderingInfo, __functionAddress);
    }

    /** {@code void vkCmdBeginRendering(VkCommandBuffer commandBuffer, VkRenderingInfo const * pRenderingInfo)} */
    public static void vkCmdBeginRendering(VkCommandBuffer commandBuffer, @NativeType("VkRenderingInfo const *") VkRenderingInfo pRenderingInfo) {
        nvkCmdBeginRendering(commandBuffer, pRenderingInfo.address());
    }

    // --- [ vkCmdEndRendering ] ---

    /** {@code void vkCmdEndRendering(VkCommandBuffer commandBuffer)} */
    public static void vkCmdEndRendering(VkCommandBuffer commandBuffer) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndRendering;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), __functionAddress);
    }

    // --- [ vkCmdSetCullMode ] ---

    /** {@code void vkCmdSetCullMode(VkCommandBuffer commandBuffer, VkCullModeFlags cullMode)} */
    public static void vkCmdSetCullMode(VkCommandBuffer commandBuffer, @NativeType("VkCullModeFlags") int cullMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCullMode;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), cullMode, __functionAddress);
    }

    // --- [ vkCmdSetFrontFace ] ---

    /** {@code void vkCmdSetFrontFace(VkCommandBuffer commandBuffer, VkFrontFace frontFace)} */
    public static void vkCmdSetFrontFace(VkCommandBuffer commandBuffer, @NativeType("VkFrontFace") int frontFace) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetFrontFace;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), frontFace, __functionAddress);
    }

    // --- [ vkCmdSetPrimitiveTopology ] ---

    /** {@code void vkCmdSetPrimitiveTopology(VkCommandBuffer commandBuffer, VkPrimitiveTopology primitiveTopology)} */
    public static void vkCmdSetPrimitiveTopology(VkCommandBuffer commandBuffer, @NativeType("VkPrimitiveTopology") int primitiveTopology) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPrimitiveTopology;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), primitiveTopology, __functionAddress);
    }

    // --- [ vkCmdSetViewportWithCount ] ---

    /** {@code void vkCmdSetViewportWithCount(VkCommandBuffer commandBuffer, uint32_t viewportCount, VkViewport const * pViewports)} */
    public static void nvkCmdSetViewportWithCount(VkCommandBuffer commandBuffer, int viewportCount, long pViewports) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetViewportWithCount;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), viewportCount, pViewports, __functionAddress);
    }

    /** {@code void vkCmdSetViewportWithCount(VkCommandBuffer commandBuffer, uint32_t viewportCount, VkViewport const * pViewports)} */
    public static void vkCmdSetViewportWithCount(VkCommandBuffer commandBuffer, @NativeType("VkViewport const *") VkViewport.Buffer pViewports) {
        nvkCmdSetViewportWithCount(commandBuffer, pViewports.remaining(), pViewports.address());
    }

    // --- [ vkCmdSetScissorWithCount ] ---

    /** {@code void vkCmdSetScissorWithCount(VkCommandBuffer commandBuffer, uint32_t scissorCount, VkRect2D const * pScissors)} */
    public static void nvkCmdSetScissorWithCount(VkCommandBuffer commandBuffer, int scissorCount, long pScissors) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetScissorWithCount;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), scissorCount, pScissors, __functionAddress);
    }

    /** {@code void vkCmdSetScissorWithCount(VkCommandBuffer commandBuffer, uint32_t scissorCount, VkRect2D const * pScissors)} */
    public static void vkCmdSetScissorWithCount(VkCommandBuffer commandBuffer, @NativeType("VkRect2D const *") VkRect2D.Buffer pScissors) {
        nvkCmdSetScissorWithCount(commandBuffer, pScissors.remaining(), pScissors.address());
    }

    // --- [ vkCmdBindVertexBuffers2 ] ---

    /** {@code void vkCmdBindVertexBuffers2(VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, VkBuffer const * pBuffers, VkDeviceSize const * pOffsets, VkDeviceSize const * pSizes, VkDeviceSize const * pStrides)} */
    public static void nvkCmdBindVertexBuffers2(VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, long pBuffers, long pOffsets, long pSizes, long pStrides) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindVertexBuffers2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPPV(commandBuffer.address(), firstBinding, bindingCount, pBuffers, pOffsets, pSizes, pStrides, __functionAddress);
    }

    /** {@code void vkCmdBindVertexBuffers2(VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, VkBuffer const * pBuffers, VkDeviceSize const * pOffsets, VkDeviceSize const * pSizes, VkDeviceSize const * pStrides)} */
    public static void vkCmdBindVertexBuffers2(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") LongBuffer pBuffers, @NativeType("VkDeviceSize const *") LongBuffer pOffsets, @NativeType("VkDeviceSize const *") @Nullable LongBuffer pSizes, @NativeType("VkDeviceSize const *") @Nullable LongBuffer pStrides) {
        if (CHECKS) {
            check(pOffsets, pBuffers.remaining());
            checkSafe(pSizes, pBuffers.remaining());
            checkSafe(pStrides, pBuffers.remaining());
        }
        nvkCmdBindVertexBuffers2(commandBuffer, firstBinding, pBuffers.remaining(), memAddress(pBuffers), memAddress(pOffsets), memAddressSafe(pSizes), memAddressSafe(pStrides));
    }

    // --- [ vkCmdSetDepthTestEnable ] ---

    /** {@code void vkCmdSetDepthTestEnable(VkCommandBuffer commandBuffer, VkBool32 depthTestEnable)} */
    public static void vkCmdSetDepthTestEnable(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthTestEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthTestEnable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthTestEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetDepthWriteEnable ] ---

    /** {@code void vkCmdSetDepthWriteEnable(VkCommandBuffer commandBuffer, VkBool32 depthWriteEnable)} */
    public static void vkCmdSetDepthWriteEnable(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthWriteEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthWriteEnable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthWriteEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetDepthCompareOp ] ---

    /** {@code void vkCmdSetDepthCompareOp(VkCommandBuffer commandBuffer, VkCompareOp depthCompareOp)} */
    public static void vkCmdSetDepthCompareOp(VkCommandBuffer commandBuffer, @NativeType("VkCompareOp") int depthCompareOp) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthCompareOp;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthCompareOp, __functionAddress);
    }

    // --- [ vkCmdSetDepthBoundsTestEnable ] ---

    /** {@code void vkCmdSetDepthBoundsTestEnable(VkCommandBuffer commandBuffer, VkBool32 depthBoundsTestEnable)} */
    public static void vkCmdSetDepthBoundsTestEnable(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthBoundsTestEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthBoundsTestEnable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthBoundsTestEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetStencilTestEnable ] ---

    /** {@code void vkCmdSetStencilTestEnable(VkCommandBuffer commandBuffer, VkBool32 stencilTestEnable)} */
    public static void vkCmdSetStencilTestEnable(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean stencilTestEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilTestEnable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), stencilTestEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetStencilOp ] ---

    /** {@code void vkCmdSetStencilOp(VkCommandBuffer commandBuffer, VkStencilFaceFlags faceMask, VkStencilOp failOp, VkStencilOp passOp, VkStencilOp depthFailOp, VkCompareOp compareOp)} */
    public static void vkCmdSetStencilOp(VkCommandBuffer commandBuffer, @NativeType("VkStencilFaceFlags") int faceMask, @NativeType("VkStencilOp") int failOp, @NativeType("VkStencilOp") int passOp, @NativeType("VkStencilOp") int depthFailOp, @NativeType("VkCompareOp") int compareOp) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilOp;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), faceMask, failOp, passOp, depthFailOp, compareOp, __functionAddress);
    }

    // --- [ vkCmdSetRasterizerDiscardEnable ] ---

    /** {@code void vkCmdSetRasterizerDiscardEnable(VkCommandBuffer commandBuffer, VkBool32 rasterizerDiscardEnable)} */
    public static void vkCmdSetRasterizerDiscardEnable(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean rasterizerDiscardEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRasterizerDiscardEnable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), rasterizerDiscardEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetDepthBiasEnable ] ---

    /** {@code void vkCmdSetDepthBiasEnable(VkCommandBuffer commandBuffer, VkBool32 depthBiasEnable)} */
    public static void vkCmdSetDepthBiasEnable(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthBiasEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthBiasEnable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthBiasEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetPrimitiveRestartEnable ] ---

    /** {@code void vkCmdSetPrimitiveRestartEnable(VkCommandBuffer commandBuffer, VkBool32 primitiveRestartEnable)} */
    public static void vkCmdSetPrimitiveRestartEnable(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean primitiveRestartEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPrimitiveRestartEnable;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), primitiveRestartEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkGetDeviceBufferMemoryRequirements ] ---

    /** {@code void vkGetDeviceBufferMemoryRequirements(VkDevice device, VkDeviceBufferMemoryRequirements const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void nvkGetDeviceBufferMemoryRequirements(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceBufferMemoryRequirements;
        if (CHECKS) {
            check(__functionAddress);
            VkDeviceBufferMemoryRequirements.validate(pInfo);
        }
        callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    /** {@code void vkGetDeviceBufferMemoryRequirements(VkDevice device, VkDeviceBufferMemoryRequirements const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void vkGetDeviceBufferMemoryRequirements(VkDevice device, @NativeType("VkDeviceBufferMemoryRequirements const *") VkDeviceBufferMemoryRequirements pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetDeviceBufferMemoryRequirements(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkGetDeviceImageMemoryRequirements ] ---

    /** {@code void vkGetDeviceImageMemoryRequirements(VkDevice device, VkDeviceImageMemoryRequirements const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void nvkGetDeviceImageMemoryRequirements(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceImageMemoryRequirements;
        if (CHECKS) {
            check(__functionAddress);
            VkDeviceImageMemoryRequirements.validate(pInfo);
        }
        callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    /** {@code void vkGetDeviceImageMemoryRequirements(VkDevice device, VkDeviceImageMemoryRequirements const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void vkGetDeviceImageMemoryRequirements(VkDevice device, @NativeType("VkDeviceImageMemoryRequirements const *") VkDeviceImageMemoryRequirements pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetDeviceImageMemoryRequirements(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkGetDeviceImageSparseMemoryRequirements ] ---

    /** {@code void vkGetDeviceImageSparseMemoryRequirements(VkDevice device, VkDeviceImageMemoryRequirements const * pInfo, uint32_t * pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2 * pSparseMemoryRequirements)} */
    public static void nvkGetDeviceImageSparseMemoryRequirements(VkDevice device, long pInfo, long pSparseMemoryRequirementCount, long pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceImageSparseMemoryRequirements;
        if (CHECKS) {
            check(__functionAddress);
            VkDeviceImageMemoryRequirements.validate(pInfo);
        }
        callPPPPV(device.address(), pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements, __functionAddress);
    }

    /** {@code void vkGetDeviceImageSparseMemoryRequirements(VkDevice device, VkDeviceImageMemoryRequirements const * pInfo, uint32_t * pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2 * pSparseMemoryRequirements)} */
    public static void vkGetDeviceImageSparseMemoryRequirements(VkDevice device, @NativeType("VkDeviceImageMemoryRequirements const *") VkDeviceImageMemoryRequirements pInfo, @NativeType("uint32_t *") IntBuffer pSparseMemoryRequirementCount, @NativeType("VkSparseImageMemoryRequirements2 *") VkSparseImageMemoryRequirements2.@Nullable Buffer pSparseMemoryRequirements) {
        if (CHECKS) {
            check(pSparseMemoryRequirementCount, 1);
            checkSafe(pSparseMemoryRequirements, pSparseMemoryRequirementCount.get(pSparseMemoryRequirementCount.position()));
        }
        nvkGetDeviceImageSparseMemoryRequirements(device, pInfo.address(), memAddress(pSparseMemoryRequirementCount), memAddressSafe(pSparseMemoryRequirements));
    }

    /** {@code VkResult vkGetPhysicalDeviceToolProperties(VkPhysicalDevice physicalDevice, uint32_t * pToolCount, VkPhysicalDeviceToolProperties * pToolProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceToolProperties(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pToolCount, @NativeType("VkPhysicalDeviceToolProperties *") VkPhysicalDeviceToolProperties.@Nullable Buffer pToolProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceToolProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(pToolCount, 1);
            checkSafe(pToolProperties, pToolCount[0]);
        }
        return callPPPI(physicalDevice.address(), pToolCount, memAddressSafe(pToolProperties), __functionAddress);
    }

    /** {@code VkResult vkCreatePrivateDataSlot(VkDevice device, VkPrivateDataSlotCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkPrivateDataSlot * pPrivateDataSlot)} */
    @NativeType("VkResult")
    public static int vkCreatePrivateDataSlot(VkDevice device, @NativeType("VkPrivateDataSlotCreateInfo const *") VkPrivateDataSlotCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkPrivateDataSlot *") long[] pPrivateDataSlot) {
        long __functionAddress = device.getCapabilities().vkCreatePrivateDataSlot;
        if (CHECKS) {
            check(__functionAddress);
            check(pPrivateDataSlot, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pPrivateDataSlot, __functionAddress);
    }

    /** {@code void vkGetPrivateData(VkDevice device, VkObjectType objectType, uint64_t objectHandle, VkPrivateDataSlot privateDataSlot, uint64_t * pData)} */
    public static void vkGetPrivateData(VkDevice device, @NativeType("VkObjectType") int objectType, @NativeType("uint64_t") long objectHandle, @NativeType("VkPrivateDataSlot") long privateDataSlot, @NativeType("uint64_t *") long[] pData) {
        long __functionAddress = device.getCapabilities().vkGetPrivateData;
        if (CHECKS) {
            check(__functionAddress);
            check(pData, 1);
        }
        callPJJPV(device.address(), objectType, objectHandle, privateDataSlot, pData, __functionAddress);
    }

    /** {@code void vkCmdWaitEvents2(VkCommandBuffer commandBuffer, uint32_t eventCount, VkEvent const * pEvents, VkDependencyInfo const * pDependencyInfos)} */
    public static void vkCmdWaitEvents2(VkCommandBuffer commandBuffer, @NativeType("VkEvent const *") long[] pEvents, @NativeType("VkDependencyInfo const *") VkDependencyInfo.Buffer pDependencyInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWaitEvents2;
        if (CHECKS) {
            check(__functionAddress);
            check(pDependencyInfos, pEvents.length);
            Struct.validate(pDependencyInfos.address(), pEvents.length, VkDependencyInfo.SIZEOF, VkDependencyInfo::validate);
        }
        callPPPV(commandBuffer.address(), pEvents.length, pEvents, pDependencyInfos.address(), __functionAddress);
    }

    /** {@code void vkCmdBindVertexBuffers2(VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, VkBuffer const * pBuffers, VkDeviceSize const * pOffsets, VkDeviceSize const * pSizes, VkDeviceSize const * pStrides)} */
    public static void vkCmdBindVertexBuffers2(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") long[] pBuffers, @NativeType("VkDeviceSize const *") long[] pOffsets, @NativeType("VkDeviceSize const *") long @Nullable [] pSizes, @NativeType("VkDeviceSize const *") long @Nullable [] pStrides) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindVertexBuffers2;
        if (CHECKS) {
            check(__functionAddress);
            check(pOffsets, pBuffers.length);
            checkSafe(pSizes, pBuffers.length);
            checkSafe(pStrides, pBuffers.length);
        }
        callPPPPPV(commandBuffer.address(), firstBinding, pBuffers.length, pBuffers, pOffsets, pSizes, pStrides, __functionAddress);
    }

    /** {@code void vkGetDeviceImageSparseMemoryRequirements(VkDevice device, VkDeviceImageMemoryRequirements const * pInfo, uint32_t * pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2 * pSparseMemoryRequirements)} */
    public static void vkGetDeviceImageSparseMemoryRequirements(VkDevice device, @NativeType("VkDeviceImageMemoryRequirements const *") VkDeviceImageMemoryRequirements pInfo, @NativeType("uint32_t *") int[] pSparseMemoryRequirementCount, @NativeType("VkSparseImageMemoryRequirements2 *") VkSparseImageMemoryRequirements2.@Nullable Buffer pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetDeviceImageSparseMemoryRequirements;
        if (CHECKS) {
            check(__functionAddress);
            check(pSparseMemoryRequirementCount, 1);
            checkSafe(pSparseMemoryRequirements, pSparseMemoryRequirementCount[0]);
            VkDeviceImageMemoryRequirements.validate(pInfo.address());
        }
        callPPPPV(device.address(), pInfo.address(), pSparseMemoryRequirementCount, memAddressSafe(pSparseMemoryRequirements), __functionAddress);
    }

}