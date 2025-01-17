/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class VK11 extends VK10 {

    public static final int
        VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO                     = 1000053000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES                    = 1000053001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES                  = 1000053002,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2                            = 1000059000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2                          = 1000059001,
        VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_2                                   = 1000059002,
        VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2                             = 1000059003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2                   = 1000059004,
        VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2                             = 1000059005,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2                   = 1000059006,
        VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2                      = 1000059007,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2            = 1000059008,
        VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO                            = 1000060000,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO                   = 1000060003,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO                = 1000060004,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO                              = 1000060005,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO                         = 1000060006,
        VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO                  = 1000060013,
        VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO                   = 1000060014,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES       = 1000063000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETER_FEATURES        = 1000063000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES                      = 1000070000,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO                       = 1000070001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO            = 1000071000,
        VK_STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES                      = 1000071001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO                  = 1000071002,
        VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES                            = 1000071003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES                         = 1000071004,
        VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO                    = 1000072000,
        VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO                     = 1000072001,
        VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO                           = 1000072002,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO               = 1000076000,
        VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES                         = 1000076001,
        VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_CREATE_INFO                          = 1000077000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES                = 1000083000,
        VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO                = 1000085000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES                   = 1000094000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO                   = 1000112000,
        VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES                             = 1000112001,
        VK_STRUCTURE_TYPE_EXPORT_FENCE_CREATE_INFO                              = 1000113000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES             = 1000117000,
        VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO       = 1000117001,
        VK_STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO                          = 1000117002,
        VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO = 1000117003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES            = 1000120000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES             = 1000120000,
        VK_STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS                         = 1000127000,
        VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO                        = 1000127001,
        VK_STRUCTURE_TYPE_PROTECTED_SUBMIT_INFO                                 = 1000145000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_FEATURES             = 1000145001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_PROPERTIES           = 1000145002,
        VK_STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2                                   = 1000145003,
        VK_STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2                     = 1000146000,
        VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2                      = 1000146001,
        VK_STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2               = 1000146002,
        VK_STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2                                 = 1000146003,
        VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2                    = 1000146004,
        VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO                  = 1000156000,
        VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO                         = 1000156001,
        VK_STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO                          = 1000156002,
        VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO                  = 1000156003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES     = 1000156004,
        VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES      = 1000156005,
        VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO                               = 1000157000,
        VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO                                = 1000157001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES              = 1000168000,
        VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT                         = 1000168001;

    public static final int
        VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT         = 0x20,
        VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT = 0x40,
        VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT = 0x80,
        VK_IMAGE_CREATE_EXTENDED_USAGE_BIT              = 0x100,
        VK_IMAGE_CREATE_DISJOINT_BIT                    = 0x200,
        VK_IMAGE_CREATE_ALIAS_BIT                       = 0x400,
        VK_IMAGE_CREATE_PROTECTED_BIT                   = 0x800;

    public static final int
        VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT = 0x8,
        VK_PIPELINE_CREATE_DISPATCH_BASE_BIT                = 0x10,
        VK_PIPELINE_CREATE_DISPATCH_BASE                    = 0x10;

    public static final int
        VK_DEPENDENCY_VIEW_LOCAL_BIT   = 0x2,
        VK_DEPENDENCY_DEVICE_GROUP_BIT = 0x4;

    public static final int VK_MEMORY_HEAP_MULTI_INSTANCE_BIT = 0x2;

    public static final int
        VK_ERROR_OUT_OF_POOL_MEMORY      = -1000069000,
        VK_ERROR_INVALID_EXTERNAL_HANDLE = -1000072003;

    public static final int
        VK_FORMAT_FEATURE_TRANSFER_SRC_BIT                                                            = 0x4000,
        VK_FORMAT_FEATURE_TRANSFER_DST_BIT                                                            = 0x8000,
        VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT                                                 = 0x20000,
        VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT                            = 0x40000,
        VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT           = 0x80000,
        VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT           = 0x100000,
        VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT = 0x200000,
        VK_FORMAT_FEATURE_DISJOINT_BIT                                                                = 0x400000,
        VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT                                                  = 0x800000;

    public static final int
        VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL = 1000117000,
        VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL = 1000117001;

    public static final int VK_QUEUE_PROTECTED_BIT = 0x10;

    public static final int VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT = 0x1;

    public static final int VK_MEMORY_PROPERTY_PROTECTED_BIT = 0x20;

    public static final int VK_BUFFER_CREATE_PROTECTED_BIT = 0x8;

    public static final int VK_COMMAND_POOL_CREATE_PROTECTED_BIT = 0x4;

    public static final int
        VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE = 1000085000,
        VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION   = 1000156000;

    public static final int
        VK_FORMAT_G8B8G8R8_422_UNORM                         = 1000156000,
        VK_FORMAT_B8G8R8G8_422_UNORM                         = 1000156001,
        VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM                  = 1000156002,
        VK_FORMAT_G8_B8R8_2PLANE_420_UNORM                   = 1000156003,
        VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM                  = 1000156004,
        VK_FORMAT_G8_B8R8_2PLANE_422_UNORM                   = 1000156005,
        VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM                  = 1000156006,
        VK_FORMAT_R10X6_UNORM_PACK16                         = 1000156007,
        VK_FORMAT_R10X6G10X6_UNORM_2PACK16                   = 1000156008,
        VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16         = 1000156009,
        VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16     = 1000156010,
        VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16     = 1000156011,
        VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16 = 1000156012,
        VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16  = 1000156013,
        VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16 = 1000156014,
        VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16  = 1000156015,
        VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16 = 1000156016,
        VK_FORMAT_R12X4_UNORM_PACK16                         = 1000156017,
        VK_FORMAT_R12X4G12X4_UNORM_2PACK16                   = 1000156018,
        VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16         = 1000156019,
        VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16     = 1000156020,
        VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16     = 1000156021,
        VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16 = 1000156022,
        VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16  = 1000156023,
        VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16 = 1000156024,
        VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16  = 1000156025,
        VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16 = 1000156026,
        VK_FORMAT_G16B16G16R16_422_UNORM                     = 1000156027,
        VK_FORMAT_B16G16R16G16_422_UNORM                     = 1000156028,
        VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM               = 1000156029,
        VK_FORMAT_G16_B16R16_2PLANE_420_UNORM                = 1000156030,
        VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM               = 1000156031,
        VK_FORMAT_G16_B16R16_2PLANE_422_UNORM                = 1000156032,
        VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM               = 1000156033;

    public static final int
        VK_IMAGE_ASPECT_PLANE_0_BIT = 0x10,
        VK_IMAGE_ASPECT_PLANE_1_BIT = 0x20,
        VK_IMAGE_ASPECT_PLANE_2_BIT = 0x40;

    public static final int
        VK_SUBGROUP_FEATURE_BASIC_BIT            = 0x1,
        VK_SUBGROUP_FEATURE_VOTE_BIT             = 0x2,
        VK_SUBGROUP_FEATURE_ARITHMETIC_BIT       = 0x4,
        VK_SUBGROUP_FEATURE_BALLOT_BIT           = 0x8,
        VK_SUBGROUP_FEATURE_SHUFFLE_BIT          = 0x10,
        VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT = 0x20,
        VK_SUBGROUP_FEATURE_CLUSTERED_BIT        = 0x40,
        VK_SUBGROUP_FEATURE_QUAD_BIT             = 0x80;

    public static final int
        VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT    = 0x1,
        VK_PEER_MEMORY_FEATURE_COPY_DST_BIT    = 0x2,
        VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT = 0x4,
        VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT = 0x8;

    public static final int VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT = 0x1;

    public static final int
        VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES       = 0,
        VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY = 1;

    public static final int
        VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT = 0,
        VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT = 1;

    public static final int
        VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY   = 0,
        VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY = 1,
        VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709      = 2,
        VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601      = 3,
        VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020     = 4;

    public static final int
        VK_SAMPLER_YCBCR_RANGE_ITU_FULL   = 0,
        VK_SAMPLER_YCBCR_RANGE_ITU_NARROW = 1;

    public static final int
        VK_CHROMA_LOCATION_COSITED_EVEN = 0,
        VK_CHROMA_LOCATION_MIDPOINT     = 1;

    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET = 0;

    public static final int
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT         = 0x1,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT      = 0x2,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT  = 0x4,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT     = 0x8,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT = 0x10,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT        = 0x20,
        VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT    = 0x40;

    public static final int
        VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT = 0x1,
        VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT     = 0x2,
        VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT     = 0x4;

    public static final int
        VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT        = 0x1,
        VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT     = 0x2,
        VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT = 0x4,
        VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT          = 0x8;

    public static final int
        VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT = 0x1,
        VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT = 0x2;

    public static final int VK_FENCE_IMPORT_TEMPORARY_BIT = 0x1;

    public static final int VK_SEMAPHORE_IMPORT_TEMPORARY_BIT = 0x1;

    public static final int
        VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT        = 0x1,
        VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT     = 0x2,
        VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT = 0x4,
        VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT      = 0x8,
        VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_FENCE_BIT      = 0x8,
        VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT          = 0x10;

    public static final int
        VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT = 0x1,
        VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT = 0x2;

    public static final int VK_API_VERSION_1_1 = VK_MAKE_API_VERSION(0, 1, 1, 0);

    public static final int
        VK_LUID_SIZE             = 8,
        VK_QUEUE_FAMILY_EXTERNAL = (~0-1),
        VK_MAX_DEVICE_GROUP_SIZE = 32;

    protected VK11() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkEnumerateInstanceVersion ] ---

    /** {@code VkResult vkEnumerateInstanceVersion(uint32_t * pApiVersion)} */
    public static int nvkEnumerateInstanceVersion(long pApiVersion) {
        long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceVersion;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pApiVersion, __functionAddress);
    }

    /** {@code VkResult vkEnumerateInstanceVersion(uint32_t * pApiVersion)} */
    @NativeType("VkResult")
    public static int vkEnumerateInstanceVersion(@NativeType("uint32_t *") IntBuffer pApiVersion) {
        if (CHECKS) {
            check(pApiVersion, 1);
        }
        return nvkEnumerateInstanceVersion(memAddress(pApiVersion));
    }

    // --- [ vkBindBufferMemory2 ] ---

    /** {@code VkResult vkBindBufferMemory2(VkDevice device, uint32_t bindInfoCount, VkBindBufferMemoryInfo const * pBindInfos)} */
    public static int nvkBindBufferMemory2(VkDevice device, int bindInfoCount, long pBindInfos) {
        long __functionAddress = device.getCapabilities().vkBindBufferMemory2;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), bindInfoCount, pBindInfos, __functionAddress);
    }

    /** {@code VkResult vkBindBufferMemory2(VkDevice device, uint32_t bindInfoCount, VkBindBufferMemoryInfo const * pBindInfos)} */
    @NativeType("VkResult")
    public static int vkBindBufferMemory2(VkDevice device, @NativeType("VkBindBufferMemoryInfo const *") VkBindBufferMemoryInfo.Buffer pBindInfos) {
        return nvkBindBufferMemory2(device, pBindInfos.remaining(), pBindInfos.address());
    }

    // --- [ vkBindImageMemory2 ] ---

    /** {@code VkResult vkBindImageMemory2(VkDevice device, uint32_t bindInfoCount, VkBindImageMemoryInfo const * pBindInfos)} */
    public static int nvkBindImageMemory2(VkDevice device, int bindInfoCount, long pBindInfos) {
        long __functionAddress = device.getCapabilities().vkBindImageMemory2;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), bindInfoCount, pBindInfos, __functionAddress);
    }

    /** {@code VkResult vkBindImageMemory2(VkDevice device, uint32_t bindInfoCount, VkBindImageMemoryInfo const * pBindInfos)} */
    @NativeType("VkResult")
    public static int vkBindImageMemory2(VkDevice device, @NativeType("VkBindImageMemoryInfo const *") VkBindImageMemoryInfo.Buffer pBindInfos) {
        return nvkBindImageMemory2(device, pBindInfos.remaining(), pBindInfos.address());
    }

    // --- [ vkGetDeviceGroupPeerMemoryFeatures ] ---

    /** {@code void vkGetDeviceGroupPeerMemoryFeatures(VkDevice device, uint32_t heapIndex, uint32_t localDeviceIndex, uint32_t remoteDeviceIndex, VkPeerMemoryFeatureFlags * pPeerMemoryFeatures)} */
    public static void nvkGetDeviceGroupPeerMemoryFeatures(VkDevice device, int heapIndex, int localDeviceIndex, int remoteDeviceIndex, long pPeerMemoryFeatures) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupPeerMemoryFeatures;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(device.address(), heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures, __functionAddress);
    }

    /** {@code void vkGetDeviceGroupPeerMemoryFeatures(VkDevice device, uint32_t heapIndex, uint32_t localDeviceIndex, uint32_t remoteDeviceIndex, VkPeerMemoryFeatureFlags * pPeerMemoryFeatures)} */
    public static void vkGetDeviceGroupPeerMemoryFeatures(VkDevice device, @NativeType("uint32_t") int heapIndex, @NativeType("uint32_t") int localDeviceIndex, @NativeType("uint32_t") int remoteDeviceIndex, @NativeType("VkPeerMemoryFeatureFlags *") IntBuffer pPeerMemoryFeatures) {
        if (CHECKS) {
            check(pPeerMemoryFeatures, 1);
        }
        nvkGetDeviceGroupPeerMemoryFeatures(device, heapIndex, localDeviceIndex, remoteDeviceIndex, memAddress(pPeerMemoryFeatures));
    }

    // --- [ vkCmdSetDeviceMask ] ---

    /** {@code void vkCmdSetDeviceMask(VkCommandBuffer commandBuffer, uint32_t deviceMask)} */
    public static void vkCmdSetDeviceMask(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int deviceMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDeviceMask;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), deviceMask, __functionAddress);
    }

    // --- [ vkCmdDispatchBase ] ---

    /** {@code void vkCmdDispatchBase(VkCommandBuffer commandBuffer, uint32_t baseGroupX, uint32_t baseGroupY, uint32_t baseGroupZ, uint32_t groupCountX, uint32_t groupCountY, uint32_t groupCountZ)} */
    public static void vkCmdDispatchBase(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int baseGroupX, @NativeType("uint32_t") int baseGroupY, @NativeType("uint32_t") int baseGroupZ, @NativeType("uint32_t") int groupCountX, @NativeType("uint32_t") int groupCountY, @NativeType("uint32_t") int groupCountZ) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDispatchBase;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), baseGroupX, baseGroupY, baseGroupZ, groupCountX, groupCountY, groupCountZ, __functionAddress);
    }

    // --- [ vkEnumeratePhysicalDeviceGroups ] ---

    /** {@code VkResult vkEnumeratePhysicalDeviceGroups(VkInstance instance, uint32_t * pPhysicalDeviceGroupCount, VkPhysicalDeviceGroupProperties * pPhysicalDeviceGroupProperties)} */
    public static int nvkEnumeratePhysicalDeviceGroups(VkInstance instance, long pPhysicalDeviceGroupCount, long pPhysicalDeviceGroupProperties) {
        long __functionAddress = instance.getCapabilities().vkEnumeratePhysicalDeviceGroups;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(instance.address(), pPhysicalDeviceGroupCount, pPhysicalDeviceGroupProperties, __functionAddress);
    }

    /** {@code VkResult vkEnumeratePhysicalDeviceGroups(VkInstance instance, uint32_t * pPhysicalDeviceGroupCount, VkPhysicalDeviceGroupProperties * pPhysicalDeviceGroupProperties)} */
    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceGroups(VkInstance instance, @NativeType("uint32_t *") IntBuffer pPhysicalDeviceGroupCount, @NativeType("VkPhysicalDeviceGroupProperties *") VkPhysicalDeviceGroupProperties.@Nullable Buffer pPhysicalDeviceGroupProperties) {
        if (CHECKS) {
            check(pPhysicalDeviceGroupCount, 1);
            checkSafe(pPhysicalDeviceGroupProperties, pPhysicalDeviceGroupCount.get(pPhysicalDeviceGroupCount.position()));
        }
        return nvkEnumeratePhysicalDeviceGroups(instance, memAddress(pPhysicalDeviceGroupCount), memAddressSafe(pPhysicalDeviceGroupProperties));
    }

    // --- [ vkGetImageMemoryRequirements2 ] ---

    /** {@code void vkGetImageMemoryRequirements2(VkDevice device, VkImageMemoryRequirementsInfo2 const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void nvkGetImageMemoryRequirements2(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetImageMemoryRequirements2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    /** {@code void vkGetImageMemoryRequirements2(VkDevice device, VkImageMemoryRequirementsInfo2 const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void vkGetImageMemoryRequirements2(VkDevice device, @NativeType("VkImageMemoryRequirementsInfo2 const *") VkImageMemoryRequirementsInfo2 pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetImageMemoryRequirements2(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkGetBufferMemoryRequirements2 ] ---

    /** {@code void vkGetBufferMemoryRequirements2(VkDevice device, VkBufferMemoryRequirementsInfo2 const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void nvkGetBufferMemoryRequirements2(VkDevice device, long pInfo, long pMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetBufferMemoryRequirements2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(device.address(), pInfo, pMemoryRequirements, __functionAddress);
    }

    /** {@code void vkGetBufferMemoryRequirements2(VkDevice device, VkBufferMemoryRequirementsInfo2 const * pInfo, VkMemoryRequirements2 * pMemoryRequirements)} */
    public static void vkGetBufferMemoryRequirements2(VkDevice device, @NativeType("VkBufferMemoryRequirementsInfo2 const *") VkBufferMemoryRequirementsInfo2 pInfo, @NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 pMemoryRequirements) {
        nvkGetBufferMemoryRequirements2(device, pInfo.address(), pMemoryRequirements.address());
    }

    // --- [ vkGetImageSparseMemoryRequirements2 ] ---

    /** {@code void vkGetImageSparseMemoryRequirements2(VkDevice device, VkImageSparseMemoryRequirementsInfo2 const * pInfo, uint32_t * pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2 * pSparseMemoryRequirements)} */
    public static void nvkGetImageSparseMemoryRequirements2(VkDevice device, long pInfo, long pSparseMemoryRequirementCount, long pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetImageSparseMemoryRequirements2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(device.address(), pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements, __functionAddress);
    }

    /** {@code void vkGetImageSparseMemoryRequirements2(VkDevice device, VkImageSparseMemoryRequirementsInfo2 const * pInfo, uint32_t * pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2 * pSparseMemoryRequirements)} */
    public static void vkGetImageSparseMemoryRequirements2(VkDevice device, @NativeType("VkImageSparseMemoryRequirementsInfo2 const *") VkImageSparseMemoryRequirementsInfo2 pInfo, @NativeType("uint32_t *") IntBuffer pSparseMemoryRequirementCount, @NativeType("VkSparseImageMemoryRequirements2 *") VkSparseImageMemoryRequirements2.@Nullable Buffer pSparseMemoryRequirements) {
        if (CHECKS) {
            check(pSparseMemoryRequirementCount, 1);
            checkSafe(pSparseMemoryRequirements, pSparseMemoryRequirementCount.get(pSparseMemoryRequirementCount.position()));
        }
        nvkGetImageSparseMemoryRequirements2(device, pInfo.address(), memAddress(pSparseMemoryRequirementCount), memAddressSafe(pSparseMemoryRequirements));
    }

    // --- [ vkGetPhysicalDeviceFeatures2 ] ---

    /** {@code void vkGetPhysicalDeviceFeatures2(VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures2 * pFeatures)} */
    public static void nvkGetPhysicalDeviceFeatures2(VkPhysicalDevice physicalDevice, long pFeatures) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFeatures2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(physicalDevice.address(), pFeatures, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceFeatures2(VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures2 * pFeatures)} */
    public static void vkGetPhysicalDeviceFeatures2(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceFeatures2 *") VkPhysicalDeviceFeatures2 pFeatures) {
        nvkGetPhysicalDeviceFeatures2(physicalDevice, pFeatures.address());
    }

    // --- [ vkGetPhysicalDeviceProperties2 ] ---

    /** {@code void vkGetPhysicalDeviceProperties2(VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties2 * pProperties)} */
    public static void nvkGetPhysicalDeviceProperties2(VkPhysicalDevice physicalDevice, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceProperties2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(physicalDevice.address(), pProperties, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceProperties2(VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties2 * pProperties)} */
    public static void vkGetPhysicalDeviceProperties2(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceProperties2 *") VkPhysicalDeviceProperties2 pProperties) {
        nvkGetPhysicalDeviceProperties2(physicalDevice, pProperties.address());
    }

    // --- [ vkGetPhysicalDeviceFormatProperties2 ] ---

    /** {@code void vkGetPhysicalDeviceFormatProperties2(VkPhysicalDevice physicalDevice, VkFormat format, VkFormatProperties2 * pFormatProperties)} */
    public static void nvkGetPhysicalDeviceFormatProperties2(VkPhysicalDevice physicalDevice, int format, long pFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFormatProperties2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(physicalDevice.address(), format, pFormatProperties, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceFormatProperties2(VkPhysicalDevice physicalDevice, VkFormat format, VkFormatProperties2 * pFormatProperties)} */
    public static void vkGetPhysicalDeviceFormatProperties2(VkPhysicalDevice physicalDevice, @NativeType("VkFormat") int format, @NativeType("VkFormatProperties2 *") VkFormatProperties2 pFormatProperties) {
        nvkGetPhysicalDeviceFormatProperties2(physicalDevice, format, pFormatProperties.address());
    }

    // --- [ vkGetPhysicalDeviceImageFormatProperties2 ] ---

    /** {@code VkResult vkGetPhysicalDeviceImageFormatProperties2(VkPhysicalDevice physicalDevice, VkPhysicalDeviceImageFormatInfo2 const * pImageFormatInfo, VkImageFormatProperties2 * pImageFormatProperties)} */
    public static int nvkGetPhysicalDeviceImageFormatProperties2(VkPhysicalDevice physicalDevice, long pImageFormatInfo, long pImageFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceImageFormatProperties2;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pImageFormatInfo, pImageFormatProperties, __functionAddress);
    }

    /** {@code VkResult vkGetPhysicalDeviceImageFormatProperties2(VkPhysicalDevice physicalDevice, VkPhysicalDeviceImageFormatInfo2 const * pImageFormatInfo, VkImageFormatProperties2 * pImageFormatProperties)} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceImageFormatProperties2(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceImageFormatInfo2 const *") VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo, @NativeType("VkImageFormatProperties2 *") VkImageFormatProperties2 pImageFormatProperties) {
        return nvkGetPhysicalDeviceImageFormatProperties2(physicalDevice, pImageFormatInfo.address(), pImageFormatProperties.address());
    }

    // --- [ vkGetPhysicalDeviceQueueFamilyProperties2 ] ---

    /** {@code void vkGetPhysicalDeviceQueueFamilyProperties2(VkPhysicalDevice physicalDevice, uint32_t * pQueueFamilyPropertyCount, VkQueueFamilyProperties2 * pQueueFamilyProperties)} */
    public static void nvkGetPhysicalDeviceQueueFamilyProperties2(VkPhysicalDevice physicalDevice, long pQueueFamilyPropertyCount, long pQueueFamilyProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyProperties2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(physicalDevice.address(), pQueueFamilyPropertyCount, pQueueFamilyProperties, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceQueueFamilyProperties2(VkPhysicalDevice physicalDevice, uint32_t * pQueueFamilyPropertyCount, VkQueueFamilyProperties2 * pQueueFamilyProperties)} */
    public static void vkGetPhysicalDeviceQueueFamilyProperties2(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pQueueFamilyPropertyCount, @NativeType("VkQueueFamilyProperties2 *") VkQueueFamilyProperties2.@Nullable Buffer pQueueFamilyProperties) {
        if (CHECKS) {
            check(pQueueFamilyPropertyCount, 1);
            checkSafe(pQueueFamilyProperties, pQueueFamilyPropertyCount.get(pQueueFamilyPropertyCount.position()));
        }
        nvkGetPhysicalDeviceQueueFamilyProperties2(physicalDevice, memAddress(pQueueFamilyPropertyCount), memAddressSafe(pQueueFamilyProperties));
    }

    // --- [ vkGetPhysicalDeviceMemoryProperties2 ] ---

    /** {@code void vkGetPhysicalDeviceMemoryProperties2(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties2 * pMemoryProperties)} */
    public static void nvkGetPhysicalDeviceMemoryProperties2(VkPhysicalDevice physicalDevice, long pMemoryProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceMemoryProperties2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(physicalDevice.address(), pMemoryProperties, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceMemoryProperties2(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties2 * pMemoryProperties)} */
    public static void vkGetPhysicalDeviceMemoryProperties2(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceMemoryProperties2 *") VkPhysicalDeviceMemoryProperties2 pMemoryProperties) {
        nvkGetPhysicalDeviceMemoryProperties2(physicalDevice, pMemoryProperties.address());
    }

    // --- [ vkGetPhysicalDeviceSparseImageFormatProperties2 ] ---

    /** {@code void vkGetPhysicalDeviceSparseImageFormatProperties2(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSparseImageFormatInfo2 const * pFormatInfo, uint32_t * pPropertyCount, VkSparseImageFormatProperties2 * pProperties)} */
    public static void nvkGetPhysicalDeviceSparseImageFormatProperties2(VkPhysicalDevice physicalDevice, long pFormatInfo, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSparseImageFormatProperties2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(physicalDevice.address(), pFormatInfo, pPropertyCount, pProperties, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceSparseImageFormatProperties2(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSparseImageFormatInfo2 const * pFormatInfo, uint32_t * pPropertyCount, VkSparseImageFormatProperties2 * pProperties)} */
    public static void vkGetPhysicalDeviceSparseImageFormatProperties2(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceSparseImageFormatInfo2 const *") VkPhysicalDeviceSparseImageFormatInfo2 pFormatInfo, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkSparseImageFormatProperties2 *") VkSparseImageFormatProperties2.@Nullable Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        nvkGetPhysicalDeviceSparseImageFormatProperties2(physicalDevice, pFormatInfo.address(), memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    // --- [ vkTrimCommandPool ] ---

    /** {@code void vkTrimCommandPool(VkDevice device, VkCommandPool commandPool, VkCommandPoolTrimFlags flags)} */
    public static void vkTrimCommandPool(VkDevice device, @NativeType("VkCommandPool") long commandPool, @NativeType("VkCommandPoolTrimFlags") int flags) {
        long __functionAddress = device.getCapabilities().vkTrimCommandPool;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(device.address(), commandPool, flags, __functionAddress);
    }

    // --- [ vkGetDeviceQueue2 ] ---

    /** {@code void vkGetDeviceQueue2(VkDevice device, VkDeviceQueueInfo2 const * pQueueInfo, VkQueue * pQueue)} */
    public static void nvkGetDeviceQueue2(VkDevice device, long pQueueInfo, long pQueue) {
        long __functionAddress = device.getCapabilities().vkGetDeviceQueue2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(device.address(), pQueueInfo, pQueue, __functionAddress);
    }

    /** {@code void vkGetDeviceQueue2(VkDevice device, VkDeviceQueueInfo2 const * pQueueInfo, VkQueue * pQueue)} */
    public static void vkGetDeviceQueue2(VkDevice device, @NativeType("VkDeviceQueueInfo2 const *") VkDeviceQueueInfo2 pQueueInfo, @NativeType("VkQueue *") PointerBuffer pQueue) {
        if (CHECKS) {
            check(pQueue, 1);
        }
        nvkGetDeviceQueue2(device, pQueueInfo.address(), memAddress(pQueue));
    }

    // --- [ vkCreateSamplerYcbcrConversion ] ---

    /** {@code VkResult vkCreateSamplerYcbcrConversion(VkDevice device, VkSamplerYcbcrConversionCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSamplerYcbcrConversion * pYcbcrConversion)} */
    public static int nvkCreateSamplerYcbcrConversion(VkDevice device, long pCreateInfo, long pAllocator, long pYcbcrConversion) {
        long __functionAddress = device.getCapabilities().vkCreateSamplerYcbcrConversion;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pYcbcrConversion, __functionAddress);
    }

    /** {@code VkResult vkCreateSamplerYcbcrConversion(VkDevice device, VkSamplerYcbcrConversionCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSamplerYcbcrConversion * pYcbcrConversion)} */
    @NativeType("VkResult")
    public static int vkCreateSamplerYcbcrConversion(VkDevice device, @NativeType("VkSamplerYcbcrConversionCreateInfo const *") VkSamplerYcbcrConversionCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkSamplerYcbcrConversion *") LongBuffer pYcbcrConversion) {
        if (CHECKS) {
            check(pYcbcrConversion, 1);
        }
        return nvkCreateSamplerYcbcrConversion(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pYcbcrConversion));
    }

    // --- [ vkDestroySamplerYcbcrConversion ] ---

    /** {@code void vkDestroySamplerYcbcrConversion(VkDevice device, VkSamplerYcbcrConversion ycbcrConversion, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroySamplerYcbcrConversion(VkDevice device, long ycbcrConversion, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroySamplerYcbcrConversion;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), ycbcrConversion, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroySamplerYcbcrConversion(VkDevice device, VkSamplerYcbcrConversion ycbcrConversion, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroySamplerYcbcrConversion(VkDevice device, @NativeType("VkSamplerYcbcrConversion") long ycbcrConversion, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroySamplerYcbcrConversion(device, ycbcrConversion, memAddressSafe(pAllocator));
    }

    // --- [ vkCreateDescriptorUpdateTemplate ] ---

    /** {@code VkResult vkCreateDescriptorUpdateTemplate(VkDevice device, VkDescriptorUpdateTemplateCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkDescriptorUpdateTemplate * pDescriptorUpdateTemplate)} */
    public static int nvkCreateDescriptorUpdateTemplate(VkDevice device, long pCreateInfo, long pAllocator, long pDescriptorUpdateTemplate) {
        long __functionAddress = device.getCapabilities().vkCreateDescriptorUpdateTemplate;
        if (CHECKS) {
            check(__functionAddress);
            VkDescriptorUpdateTemplateCreateInfo.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pDescriptorUpdateTemplate, __functionAddress);
    }

    /** {@code VkResult vkCreateDescriptorUpdateTemplate(VkDevice device, VkDescriptorUpdateTemplateCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkDescriptorUpdateTemplate * pDescriptorUpdateTemplate)} */
    @NativeType("VkResult")
    public static int vkCreateDescriptorUpdateTemplate(VkDevice device, @NativeType("VkDescriptorUpdateTemplateCreateInfo const *") VkDescriptorUpdateTemplateCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkDescriptorUpdateTemplate *") LongBuffer pDescriptorUpdateTemplate) {
        if (CHECKS) {
            check(pDescriptorUpdateTemplate, 1);
        }
        return nvkCreateDescriptorUpdateTemplate(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pDescriptorUpdateTemplate));
    }

    // --- [ vkDestroyDescriptorUpdateTemplate ] ---

    /** {@code void vkDestroyDescriptorUpdateTemplate(VkDevice device, VkDescriptorUpdateTemplate descriptorUpdateTemplate, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyDescriptorUpdateTemplate(VkDevice device, long descriptorUpdateTemplate, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyDescriptorUpdateTemplate;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), descriptorUpdateTemplate, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyDescriptorUpdateTemplate(VkDevice device, VkDescriptorUpdateTemplate descriptorUpdateTemplate, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyDescriptorUpdateTemplate(VkDevice device, @NativeType("VkDescriptorUpdateTemplate") long descriptorUpdateTemplate, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyDescriptorUpdateTemplate(device, descriptorUpdateTemplate, memAddressSafe(pAllocator));
    }

    // --- [ vkUpdateDescriptorSetWithTemplate ] ---

    /** {@code void vkUpdateDescriptorSetWithTemplate(VkDevice device, VkDescriptorSet descriptorSet, VkDescriptorUpdateTemplate descriptorUpdateTemplate, void const * pData)} */
    public static void vkUpdateDescriptorSetWithTemplate(VkDevice device, @NativeType("VkDescriptorSet") long descriptorSet, @NativeType("VkDescriptorUpdateTemplate") long descriptorUpdateTemplate, @NativeType("void const *") long pData) {
        long __functionAddress = device.getCapabilities().vkUpdateDescriptorSetWithTemplate;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJPV(device.address(), descriptorSet, descriptorUpdateTemplate, pData, __functionAddress);
    }

    // --- [ vkGetPhysicalDeviceExternalBufferProperties ] ---

    /** {@code void vkGetPhysicalDeviceExternalBufferProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalBufferInfo const * pExternalBufferInfo, VkExternalBufferProperties * pExternalBufferProperties)} */
    public static void nvkGetPhysicalDeviceExternalBufferProperties(VkPhysicalDevice physicalDevice, long pExternalBufferInfo, long pExternalBufferProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceExternalBufferProperties;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(physicalDevice.address(), pExternalBufferInfo, pExternalBufferProperties, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceExternalBufferProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalBufferInfo const * pExternalBufferInfo, VkExternalBufferProperties * pExternalBufferProperties)} */
    public static void vkGetPhysicalDeviceExternalBufferProperties(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceExternalBufferInfo const *") VkPhysicalDeviceExternalBufferInfo pExternalBufferInfo, @NativeType("VkExternalBufferProperties *") VkExternalBufferProperties pExternalBufferProperties) {
        nvkGetPhysicalDeviceExternalBufferProperties(physicalDevice, pExternalBufferInfo.address(), pExternalBufferProperties.address());
    }

    // --- [ vkGetPhysicalDeviceExternalFenceProperties ] ---

    /** {@code void vkGetPhysicalDeviceExternalFenceProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalFenceInfo const * pExternalFenceInfo, VkExternalFenceProperties * pExternalFenceProperties)} */
    public static void nvkGetPhysicalDeviceExternalFenceProperties(VkPhysicalDevice physicalDevice, long pExternalFenceInfo, long pExternalFenceProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceExternalFenceProperties;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(physicalDevice.address(), pExternalFenceInfo, pExternalFenceProperties, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceExternalFenceProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalFenceInfo const * pExternalFenceInfo, VkExternalFenceProperties * pExternalFenceProperties)} */
    public static void vkGetPhysicalDeviceExternalFenceProperties(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceExternalFenceInfo const *") VkPhysicalDeviceExternalFenceInfo pExternalFenceInfo, @NativeType("VkExternalFenceProperties *") VkExternalFenceProperties pExternalFenceProperties) {
        nvkGetPhysicalDeviceExternalFenceProperties(physicalDevice, pExternalFenceInfo.address(), pExternalFenceProperties.address());
    }

    // --- [ vkGetPhysicalDeviceExternalSemaphoreProperties ] ---

    /** {@code void vkGetPhysicalDeviceExternalSemaphoreProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalSemaphoreInfo const * pExternalSemaphoreInfo, VkExternalSemaphoreProperties * pExternalSemaphoreProperties)} */
    public static void nvkGetPhysicalDeviceExternalSemaphoreProperties(VkPhysicalDevice physicalDevice, long pExternalSemaphoreInfo, long pExternalSemaphoreProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceExternalSemaphoreProperties;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(physicalDevice.address(), pExternalSemaphoreInfo, pExternalSemaphoreProperties, __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceExternalSemaphoreProperties(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalSemaphoreInfo const * pExternalSemaphoreInfo, VkExternalSemaphoreProperties * pExternalSemaphoreProperties)} */
    public static void vkGetPhysicalDeviceExternalSemaphoreProperties(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceExternalSemaphoreInfo const *") VkPhysicalDeviceExternalSemaphoreInfo pExternalSemaphoreInfo, @NativeType("VkExternalSemaphoreProperties *") VkExternalSemaphoreProperties pExternalSemaphoreProperties) {
        nvkGetPhysicalDeviceExternalSemaphoreProperties(physicalDevice, pExternalSemaphoreInfo.address(), pExternalSemaphoreProperties.address());
    }

    // --- [ vkGetDescriptorSetLayoutSupport ] ---

    /** {@code void vkGetDescriptorSetLayoutSupport(VkDevice device, VkDescriptorSetLayoutCreateInfo const * pCreateInfo, VkDescriptorSetLayoutSupport * pSupport)} */
    public static void nvkGetDescriptorSetLayoutSupport(VkDevice device, long pCreateInfo, long pSupport) {
        long __functionAddress = device.getCapabilities().vkGetDescriptorSetLayoutSupport;
        if (CHECKS) {
            check(__functionAddress);
            VkDescriptorSetLayoutCreateInfo.validate(pCreateInfo);
        }
        callPPPV(device.address(), pCreateInfo, pSupport, __functionAddress);
    }

    /** {@code void vkGetDescriptorSetLayoutSupport(VkDevice device, VkDescriptorSetLayoutCreateInfo const * pCreateInfo, VkDescriptorSetLayoutSupport * pSupport)} */
    public static void vkGetDescriptorSetLayoutSupport(VkDevice device, @NativeType("VkDescriptorSetLayoutCreateInfo const *") VkDescriptorSetLayoutCreateInfo pCreateInfo, @NativeType("VkDescriptorSetLayoutSupport *") VkDescriptorSetLayoutSupport pSupport) {
        nvkGetDescriptorSetLayoutSupport(device, pCreateInfo.address(), pSupport.address());
    }

    /** {@code VkResult vkEnumerateInstanceVersion(uint32_t * pApiVersion)} */
    @NativeType("VkResult")
    public static int vkEnumerateInstanceVersion(@NativeType("uint32_t *") int[] pApiVersion) {
        long __functionAddress = VK.getGlobalCommands().vkEnumerateInstanceVersion;
        if (CHECKS) {
            check(__functionAddress);
            check(pApiVersion, 1);
        }
        return callPI(pApiVersion, __functionAddress);
    }

    /** {@code void vkGetDeviceGroupPeerMemoryFeatures(VkDevice device, uint32_t heapIndex, uint32_t localDeviceIndex, uint32_t remoteDeviceIndex, VkPeerMemoryFeatureFlags * pPeerMemoryFeatures)} */
    public static void vkGetDeviceGroupPeerMemoryFeatures(VkDevice device, @NativeType("uint32_t") int heapIndex, @NativeType("uint32_t") int localDeviceIndex, @NativeType("uint32_t") int remoteDeviceIndex, @NativeType("VkPeerMemoryFeatureFlags *") int[] pPeerMemoryFeatures) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupPeerMemoryFeatures;
        if (CHECKS) {
            check(__functionAddress);
            check(pPeerMemoryFeatures, 1);
        }
        callPPV(device.address(), heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures, __functionAddress);
    }

    /** {@code VkResult vkEnumeratePhysicalDeviceGroups(VkInstance instance, uint32_t * pPhysicalDeviceGroupCount, VkPhysicalDeviceGroupProperties * pPhysicalDeviceGroupProperties)} */
    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceGroups(VkInstance instance, @NativeType("uint32_t *") int[] pPhysicalDeviceGroupCount, @NativeType("VkPhysicalDeviceGroupProperties *") VkPhysicalDeviceGroupProperties.@Nullable Buffer pPhysicalDeviceGroupProperties) {
        long __functionAddress = instance.getCapabilities().vkEnumeratePhysicalDeviceGroups;
        if (CHECKS) {
            check(__functionAddress);
            check(pPhysicalDeviceGroupCount, 1);
            checkSafe(pPhysicalDeviceGroupProperties, pPhysicalDeviceGroupCount[0]);
        }
        return callPPPI(instance.address(), pPhysicalDeviceGroupCount, memAddressSafe(pPhysicalDeviceGroupProperties), __functionAddress);
    }

    /** {@code void vkGetImageSparseMemoryRequirements2(VkDevice device, VkImageSparseMemoryRequirementsInfo2 const * pInfo, uint32_t * pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2 * pSparseMemoryRequirements)} */
    public static void vkGetImageSparseMemoryRequirements2(VkDevice device, @NativeType("VkImageSparseMemoryRequirementsInfo2 const *") VkImageSparseMemoryRequirementsInfo2 pInfo, @NativeType("uint32_t *") int[] pSparseMemoryRequirementCount, @NativeType("VkSparseImageMemoryRequirements2 *") VkSparseImageMemoryRequirements2.@Nullable Buffer pSparseMemoryRequirements) {
        long __functionAddress = device.getCapabilities().vkGetImageSparseMemoryRequirements2;
        if (CHECKS) {
            check(__functionAddress);
            check(pSparseMemoryRequirementCount, 1);
            checkSafe(pSparseMemoryRequirements, pSparseMemoryRequirementCount[0]);
        }
        callPPPPV(device.address(), pInfo.address(), pSparseMemoryRequirementCount, memAddressSafe(pSparseMemoryRequirements), __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceQueueFamilyProperties2(VkPhysicalDevice physicalDevice, uint32_t * pQueueFamilyPropertyCount, VkQueueFamilyProperties2 * pQueueFamilyProperties)} */
    public static void vkGetPhysicalDeviceQueueFamilyProperties2(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pQueueFamilyPropertyCount, @NativeType("VkQueueFamilyProperties2 *") VkQueueFamilyProperties2.@Nullable Buffer pQueueFamilyProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyProperties2;
        if (CHECKS) {
            check(__functionAddress);
            check(pQueueFamilyPropertyCount, 1);
            checkSafe(pQueueFamilyProperties, pQueueFamilyPropertyCount[0]);
        }
        callPPPV(physicalDevice.address(), pQueueFamilyPropertyCount, memAddressSafe(pQueueFamilyProperties), __functionAddress);
    }

    /** {@code void vkGetPhysicalDeviceSparseImageFormatProperties2(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSparseImageFormatInfo2 const * pFormatInfo, uint32_t * pPropertyCount, VkSparseImageFormatProperties2 * pProperties)} */
    public static void vkGetPhysicalDeviceSparseImageFormatProperties2(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceSparseImageFormatInfo2 const *") VkPhysicalDeviceSparseImageFormatInfo2 pFormatInfo, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkSparseImageFormatProperties2 *") VkSparseImageFormatProperties2.@Nullable Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSparseImageFormatProperties2;
        if (CHECKS) {
            check(__functionAddress);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        callPPPPV(physicalDevice.address(), pFormatInfo.address(), pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

    /** {@code VkResult vkCreateSamplerYcbcrConversion(VkDevice device, VkSamplerYcbcrConversionCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkSamplerYcbcrConversion * pYcbcrConversion)} */
    @NativeType("VkResult")
    public static int vkCreateSamplerYcbcrConversion(VkDevice device, @NativeType("VkSamplerYcbcrConversionCreateInfo const *") VkSamplerYcbcrConversionCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkSamplerYcbcrConversion *") long[] pYcbcrConversion) {
        long __functionAddress = device.getCapabilities().vkCreateSamplerYcbcrConversion;
        if (CHECKS) {
            check(__functionAddress);
            check(pYcbcrConversion, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pYcbcrConversion, __functionAddress);
    }

    /** {@code VkResult vkCreateDescriptorUpdateTemplate(VkDevice device, VkDescriptorUpdateTemplateCreateInfo const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkDescriptorUpdateTemplate * pDescriptorUpdateTemplate)} */
    @NativeType("VkResult")
    public static int vkCreateDescriptorUpdateTemplate(VkDevice device, @NativeType("VkDescriptorUpdateTemplateCreateInfo const *") VkDescriptorUpdateTemplateCreateInfo pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkDescriptorUpdateTemplate *") long[] pDescriptorUpdateTemplate) {
        long __functionAddress = device.getCapabilities().vkCreateDescriptorUpdateTemplate;
        if (CHECKS) {
            check(__functionAddress);
            check(pDescriptorUpdateTemplate, 1);
            VkDescriptorUpdateTemplateCreateInfo.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pDescriptorUpdateTemplate, __functionAddress);
    }

}