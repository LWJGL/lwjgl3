/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class VK14 extends VK13 {

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES                   = 55,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_PROPERTIES                 = 56,
        VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO                       = 1000068000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES          = 1000068001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES        = 1000068002,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES            = 1000080000,
        VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO              = 1000174000,
        VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO       = 1000190001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES     = 1000190002,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES = 1000232000,
        VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO                    = 1000232001,
        VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO                 = 1000232002,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES           = 1000259000,
        VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO         = 1000259001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES         = 1000259002,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES             = 1000265000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES              = 1000270000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES            = 1000270001,
        VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY                                  = 1000270002,
        VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY                                  = 1000270003,
        VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO                             = 1000270004,
        VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO                             = 1000270005,
        VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO                     = 1000270006,
        VK_STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO                              = 1000270007,
        VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE                          = 1000270008,
        VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY              = 1000270009,
        VK_STRUCTURE_TYPE_MEMORY_MAP_INFO                                       = 1000271000,
        VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO                                     = 1000271001,
        VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2                                  = 1000338002,
        VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2                                   = 1000338003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES        = 1000388000,
        VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES               = 1000388001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES       = 1000416000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES    = 1000466000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES                = 1000470000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES              = 1000470001,
        VK_STRUCTURE_TYPE_RENDERING_AREA_INFO                                   = 1000470003,
        VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO                         = 1000470004,
        VK_STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO                   = 1000470005,
        VK_STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO                      = 1000470006,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES   = 1000525000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT_CONTROLS_2_FEATURES      = 1000528000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES         = 1000544000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES                = 1000545000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES              = 1000545001,
        VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS                                    = 1000545002,
        VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO                             = 1000545003,
        VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO                                   = 1000545004,
        VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO                              = 1000545005,
        VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO                = 1000545006;

    public static final int VK_ERROR_NOT_PERMITTED = -1000174001;

    public static final int VK_ATTACHMENT_LOAD_OP_NONE = 1000400000;

    public static final int
        VK_SUBGROUP_FEATURE_ROTATE_BIT           = 0x200,
        VK_SUBGROUP_FEATURE_ROTATE_CLUSTERED_BIT = 0x400;

    public static final int VK_DYNAMIC_STATE_LINE_STIPPLE = 1000259000;

    public static final int VK_INDEX_TYPE_UINT8 = 1000265000;

    public static final int
        VK_FORMAT_A1B5G5R5_UNORM_PACK16 = 1000470000,
        VK_FORMAT_A8_UNORM              = 1000470001;

    public static final long
        VK_BUFFER_USAGE_2_TRANSFER_SRC_BIT          = 0x1L,
        VK_BUFFER_USAGE_2_TRANSFER_DST_BIT          = 0x2L,
        VK_BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT  = 0x4L,
        VK_BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT  = 0x8L,
        VK_BUFFER_USAGE_2_UNIFORM_BUFFER_BIT        = 0x10L,
        VK_BUFFER_USAGE_2_STORAGE_BUFFER_BIT        = 0x20L,
        VK_BUFFER_USAGE_2_INDEX_BUFFER_BIT          = 0x40L,
        VK_BUFFER_USAGE_2_VERTEX_BUFFER_BIT         = 0x80L,
        VK_BUFFER_USAGE_2_INDIRECT_BUFFER_BIT       = 0x100L,
        VK_BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT = 0x20000L;

    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT = 0x1;

    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS = 1;

    public static final int VK_IMAGE_LAYOUT_RENDERING_LOCAL_READ = 1000232000;

    public static final int
        VK_PIPELINE_CREATE_NO_PROTECTED_ACCESS_BIT   = 0x8000000,
        VK_PIPELINE_CREATE_PROTECTED_ACCESS_ONLY_BIT = 0x40000000;

    public static final int VK_IMAGE_USAGE_HOST_TRANSFER_BIT = 0x400000;

    public static final long VK_FORMAT_FEATURE_2_HOST_IMAGE_TRANSFER_BIT = 0x400000000000L;

    public static final int
        VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DEVICE_DEFAULT         = 0,
        VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DISABLED               = 1,
        VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS   = 2,
        VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2 = 3;

    public static final int
        VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DEVICE_DEFAULT        = 0,
        VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DISABLED              = 1,
        VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS   = 2,
        VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_2 = 3;

    public static final int
        VK_QUEUE_GLOBAL_PRIORITY_LOW      = 128,
        VK_QUEUE_GLOBAL_PRIORITY_MEDIUM   = 256,
        VK_QUEUE_GLOBAL_PRIORITY_HIGH     = 512,
        VK_QUEUE_GLOBAL_PRIORITY_REALTIME = 1024;

    public static final int
        VK_LINE_RASTERIZATION_MODE_DEFAULT            = 0,
        VK_LINE_RASTERIZATION_MODE_RECTANGULAR        = 1,
        VK_LINE_RASTERIZATION_MODE_BRESENHAM          = 2,
        VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH = 3;

    public static final long
        VK_PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT              = 0x1L,
        VK_PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT                 = 0x2L,
        VK_PIPELINE_CREATE_2_DERIVATIVE_BIT                        = 0x4L,
        VK_PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT      = 0x8L,
        VK_PIPELINE_CREATE_2_DISPATCH_BASE_BIT                     = 0x10L,
        VK_PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT = 0x100L,
        VK_PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT           = 0x200L,
        VK_PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT               = 0x8000000L,
        VK_PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT             = 0x40000000L;

    public static final int VK_HOST_IMAGE_COPY_MEMCPY = 0x1;

    public static final int VK_API_VERSION_1_4 = VK_MAKE_API_VERSION(0, 1, 4, 0);

    public static final int VK_MAX_GLOBAL_PRIORITY_SIZE = 16;

    protected VK14() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetLineStipple ] ---

    /** {@code void vkCmdSetLineStipple(VkCommandBuffer commandBuffer, uint32_t lineStippleFactor, uint16_t lineStipplePattern)} */
    public static void vkCmdSetLineStipple(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int lineStippleFactor, @NativeType("uint16_t") short lineStipplePattern) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLineStipple;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPCV(commandBuffer.address(), lineStippleFactor, lineStipplePattern, __functionAddress);
    }

    // --- [ vkMapMemory2 ] ---

    /** {@code VkResult vkMapMemory2(VkDevice device, VkMemoryMapInfo const * pMemoryMapInfo, void ** ppData)} */
    public static int nvkMapMemory2(VkDevice device, long pMemoryMapInfo, long ppData) {
        long __functionAddress = device.getCapabilities().vkMapMemory2;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pMemoryMapInfo, ppData, __functionAddress);
    }

    /** {@code VkResult vkMapMemory2(VkDevice device, VkMemoryMapInfo const * pMemoryMapInfo, void ** ppData)} */
    @NativeType("VkResult")
    public static int vkMapMemory2(VkDevice device, @NativeType("VkMemoryMapInfo const *") VkMemoryMapInfo pMemoryMapInfo, @NativeType("void **") PointerBuffer ppData) {
        if (CHECKS) {
            check(ppData, 1);
        }
        return nvkMapMemory2(device, pMemoryMapInfo.address(), memAddress(ppData));
    }

    // --- [ vkUnmapMemory2 ] ---

    /** {@code VkResult vkUnmapMemory2(VkDevice device, VkMemoryUnmapInfo const * pMemoryUnmapInfo)} */
    public static int nvkUnmapMemory2(VkDevice device, long pMemoryUnmapInfo) {
        long __functionAddress = device.getCapabilities().vkUnmapMemory2;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pMemoryUnmapInfo, __functionAddress);
    }

    /** {@code VkResult vkUnmapMemory2(VkDevice device, VkMemoryUnmapInfo const * pMemoryUnmapInfo)} */
    @NativeType("VkResult")
    public static int vkUnmapMemory2(VkDevice device, @NativeType("VkMemoryUnmapInfo const *") VkMemoryUnmapInfo pMemoryUnmapInfo) {
        return nvkUnmapMemory2(device, pMemoryUnmapInfo.address());
    }

    // --- [ vkCmdBindIndexBuffer2 ] ---

    /** {@code void vkCmdBindIndexBuffer2(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkDeviceSize size, VkIndexType indexType)} */
    public static void vkCmdBindIndexBuffer2(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset, @NativeType("VkDeviceSize") long size, @NativeType("VkIndexType") int indexType) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindIndexBuffer2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJJV(commandBuffer.address(), buffer, offset, size, indexType, __functionAddress);
    }

    // --- [ vkGetRenderingAreaGranularity ] ---

    /** {@code void vkGetRenderingAreaGranularity(VkDevice device, VkRenderingAreaInfo const * pRenderingAreaInfo, VkExtent2D * pGranularity)} */
    public static void nvkGetRenderingAreaGranularity(VkDevice device, long pRenderingAreaInfo, long pGranularity) {
        long __functionAddress = device.getCapabilities().vkGetRenderingAreaGranularity;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(device.address(), pRenderingAreaInfo, pGranularity, __functionAddress);
    }

    /** {@code void vkGetRenderingAreaGranularity(VkDevice device, VkRenderingAreaInfo const * pRenderingAreaInfo, VkExtent2D * pGranularity)} */
    public static void vkGetRenderingAreaGranularity(VkDevice device, @NativeType("VkRenderingAreaInfo const *") VkRenderingAreaInfo pRenderingAreaInfo, @NativeType("VkExtent2D *") VkExtent2D pGranularity) {
        nvkGetRenderingAreaGranularity(device, pRenderingAreaInfo.address(), pGranularity.address());
    }

    // --- [ vkGetDeviceImageSubresourceLayout ] ---

    /** {@code void vkGetDeviceImageSubresourceLayout(VkDevice device, VkDeviceImageSubresourceInfo const * pInfo, VkSubresourceLayout2 * pLayout)} */
    public static void nvkGetDeviceImageSubresourceLayout(VkDevice device, long pInfo, long pLayout) {
        long __functionAddress = device.getCapabilities().vkGetDeviceImageSubresourceLayout;
        if (CHECKS) {
            check(__functionAddress);
            VkDeviceImageSubresourceInfo.validate(pInfo);
        }
        callPPPV(device.address(), pInfo, pLayout, __functionAddress);
    }

    /** {@code void vkGetDeviceImageSubresourceLayout(VkDevice device, VkDeviceImageSubresourceInfo const * pInfo, VkSubresourceLayout2 * pLayout)} */
    public static void vkGetDeviceImageSubresourceLayout(VkDevice device, @NativeType("VkDeviceImageSubresourceInfo const *") VkDeviceImageSubresourceInfo pInfo, @NativeType("VkSubresourceLayout2 *") VkSubresourceLayout2 pLayout) {
        nvkGetDeviceImageSubresourceLayout(device, pInfo.address(), pLayout.address());
    }

    // --- [ vkGetImageSubresourceLayout2 ] ---

    /** {@code void vkGetImageSubresourceLayout2(VkDevice device, VkImage image, VkImageSubresource2 const * pSubresource, VkSubresourceLayout2 * pLayout)} */
    public static void nvkGetImageSubresourceLayout2(VkDevice device, long image, long pSubresource, long pLayout) {
        long __functionAddress = device.getCapabilities().vkGetImageSubresourceLayout2;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPPV(device.address(), image, pSubresource, pLayout, __functionAddress);
    }

    /** {@code void vkGetImageSubresourceLayout2(VkDevice device, VkImage image, VkImageSubresource2 const * pSubresource, VkSubresourceLayout2 * pLayout)} */
    public static void vkGetImageSubresourceLayout2(VkDevice device, @NativeType("VkImage") long image, @NativeType("VkImageSubresource2 const *") VkImageSubresource2 pSubresource, @NativeType("VkSubresourceLayout2 *") VkSubresourceLayout2 pLayout) {
        nvkGetImageSubresourceLayout2(device, image, pSubresource.address(), pLayout.address());
    }

    // --- [ vkCmdPushDescriptorSet ] ---

    /** {@code void vkCmdPushDescriptorSet(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipelineLayout layout, uint32_t set, uint32_t descriptorWriteCount, VkWriteDescriptorSet const * pDescriptorWrites)} */
    public static void nvkCmdPushDescriptorSet(VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int set, int descriptorWriteCount, long pDescriptorWrites) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushDescriptorSet;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(commandBuffer.address(), pipelineBindPoint, layout, set, descriptorWriteCount, pDescriptorWrites, __functionAddress);
    }

    /** {@code void vkCmdPushDescriptorSet(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipelineLayout layout, uint32_t set, uint32_t descriptorWriteCount, VkWriteDescriptorSet const * pDescriptorWrites)} */
    public static void vkCmdPushDescriptorSet(VkCommandBuffer commandBuffer, @NativeType("VkPipelineBindPoint") int pipelineBindPoint, @NativeType("VkPipelineLayout") long layout, @NativeType("uint32_t") int set, @NativeType("VkWriteDescriptorSet const *") VkWriteDescriptorSet.Buffer pDescriptorWrites) {
        nvkCmdPushDescriptorSet(commandBuffer, pipelineBindPoint, layout, set, pDescriptorWrites.remaining(), pDescriptorWrites.address());
    }

    // --- [ vkCmdPushDescriptorSetWithTemplate ] ---

    /** {@code void vkCmdPushDescriptorSetWithTemplate(VkCommandBuffer commandBuffer, VkDescriptorUpdateTemplate descriptorUpdateTemplate, VkPipelineLayout layout, uint32_t set, void const * pData)} */
    public static void vkCmdPushDescriptorSetWithTemplate(VkCommandBuffer commandBuffer, @NativeType("VkDescriptorUpdateTemplate") long descriptorUpdateTemplate, @NativeType("VkPipelineLayout") long layout, @NativeType("uint32_t") int set, @NativeType("void const *") long pData) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushDescriptorSetWithTemplate;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJPV(commandBuffer.address(), descriptorUpdateTemplate, layout, set, pData, __functionAddress);
    }

    // --- [ vkCmdSetRenderingAttachmentLocations ] ---

    /** {@code void vkCmdSetRenderingAttachmentLocations(VkCommandBuffer commandBuffer, VkRenderingAttachmentLocationInfo const * pLocationInfo)} */
    public static void nvkCmdSetRenderingAttachmentLocations(VkCommandBuffer commandBuffer, long pLocationInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRenderingAttachmentLocations;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pLocationInfo, __functionAddress);
    }

    /** {@code void vkCmdSetRenderingAttachmentLocations(VkCommandBuffer commandBuffer, VkRenderingAttachmentLocationInfo const * pLocationInfo)} */
    public static void vkCmdSetRenderingAttachmentLocations(VkCommandBuffer commandBuffer, @NativeType("VkRenderingAttachmentLocationInfo const *") VkRenderingAttachmentLocationInfo pLocationInfo) {
        nvkCmdSetRenderingAttachmentLocations(commandBuffer, pLocationInfo.address());
    }

    // --- [ vkCmdSetRenderingInputAttachmentIndices ] ---

    /** {@code void vkCmdSetRenderingInputAttachmentIndices(VkCommandBuffer commandBuffer, VkRenderingInputAttachmentIndexInfo const * pInputAttachmentIndexInfo)} */
    public static void nvkCmdSetRenderingInputAttachmentIndices(VkCommandBuffer commandBuffer, long pInputAttachmentIndexInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRenderingInputAttachmentIndices;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInputAttachmentIndexInfo, __functionAddress);
    }

    /** {@code void vkCmdSetRenderingInputAttachmentIndices(VkCommandBuffer commandBuffer, VkRenderingInputAttachmentIndexInfo const * pInputAttachmentIndexInfo)} */
    public static void vkCmdSetRenderingInputAttachmentIndices(VkCommandBuffer commandBuffer, @NativeType("VkRenderingInputAttachmentIndexInfo const *") VkRenderingInputAttachmentIndexInfo pInputAttachmentIndexInfo) {
        nvkCmdSetRenderingInputAttachmentIndices(commandBuffer, pInputAttachmentIndexInfo.address());
    }

    // --- [ vkCmdBindDescriptorSets2 ] ---

    /** {@code void vkCmdBindDescriptorSets2(VkCommandBuffer commandBuffer, VkBindDescriptorSetsInfo const * pBindDescriptorSetsInfo)} */
    public static void nvkCmdBindDescriptorSets2(VkCommandBuffer commandBuffer, long pBindDescriptorSetsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindDescriptorSets2;
        if (CHECKS) {
            check(__functionAddress);
            VkBindDescriptorSetsInfo.validate(pBindDescriptorSetsInfo);
        }
        callPPV(commandBuffer.address(), pBindDescriptorSetsInfo, __functionAddress);
    }

    /** {@code void vkCmdBindDescriptorSets2(VkCommandBuffer commandBuffer, VkBindDescriptorSetsInfo const * pBindDescriptorSetsInfo)} */
    public static void vkCmdBindDescriptorSets2(VkCommandBuffer commandBuffer, @NativeType("VkBindDescriptorSetsInfo const *") VkBindDescriptorSetsInfo pBindDescriptorSetsInfo) {
        nvkCmdBindDescriptorSets2(commandBuffer, pBindDescriptorSetsInfo.address());
    }

    // --- [ vkCmdPushConstants2 ] ---

    /** {@code void vkCmdPushConstants2(VkCommandBuffer commandBuffer, VkPushConstantsInfo const * pPushConstantsInfo)} */
    public static void nvkCmdPushConstants2(VkCommandBuffer commandBuffer, long pPushConstantsInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushConstants2;
        if (CHECKS) {
            check(__functionAddress);
            VkPushConstantsInfo.validate(pPushConstantsInfo);
        }
        callPPV(commandBuffer.address(), pPushConstantsInfo, __functionAddress);
    }

    /** {@code void vkCmdPushConstants2(VkCommandBuffer commandBuffer, VkPushConstantsInfo const * pPushConstantsInfo)} */
    public static void vkCmdPushConstants2(VkCommandBuffer commandBuffer, @NativeType("VkPushConstantsInfo const *") VkPushConstantsInfo pPushConstantsInfo) {
        nvkCmdPushConstants2(commandBuffer, pPushConstantsInfo.address());
    }

    // --- [ vkCmdPushDescriptorSet2 ] ---

    /** {@code void vkCmdPushDescriptorSet2(VkCommandBuffer commandBuffer, VkPushDescriptorSetInfo const * pPushDescriptorSetInfo)} */
    public static void nvkCmdPushDescriptorSet2(VkCommandBuffer commandBuffer, long pPushDescriptorSetInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushDescriptorSet2;
        if (CHECKS) {
            check(__functionAddress);
            VkPushDescriptorSetInfo.validate(pPushDescriptorSetInfo);
        }
        callPPV(commandBuffer.address(), pPushDescriptorSetInfo, __functionAddress);
    }

    /** {@code void vkCmdPushDescriptorSet2(VkCommandBuffer commandBuffer, VkPushDescriptorSetInfo const * pPushDescriptorSetInfo)} */
    public static void vkCmdPushDescriptorSet2(VkCommandBuffer commandBuffer, @NativeType("VkPushDescriptorSetInfo const *") VkPushDescriptorSetInfo pPushDescriptorSetInfo) {
        nvkCmdPushDescriptorSet2(commandBuffer, pPushDescriptorSetInfo.address());
    }

    // --- [ vkCmdPushDescriptorSetWithTemplate2 ] ---

    /** {@code void vkCmdPushDescriptorSetWithTemplate2(VkCommandBuffer commandBuffer, VkPushDescriptorSetWithTemplateInfo const * pPushDescriptorSetWithTemplateInfo)} */
    public static void nvkCmdPushDescriptorSetWithTemplate2(VkCommandBuffer commandBuffer, long pPushDescriptorSetWithTemplateInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPushDescriptorSetWithTemplate2;
        if (CHECKS) {
            check(__functionAddress);
            VkPushDescriptorSetWithTemplateInfo.validate(pPushDescriptorSetWithTemplateInfo);
        }
        callPPV(commandBuffer.address(), pPushDescriptorSetWithTemplateInfo, __functionAddress);
    }

    /** {@code void vkCmdPushDescriptorSetWithTemplate2(VkCommandBuffer commandBuffer, VkPushDescriptorSetWithTemplateInfo const * pPushDescriptorSetWithTemplateInfo)} */
    public static void vkCmdPushDescriptorSetWithTemplate2(VkCommandBuffer commandBuffer, @NativeType("VkPushDescriptorSetWithTemplateInfo const *") VkPushDescriptorSetWithTemplateInfo pPushDescriptorSetWithTemplateInfo) {
        nvkCmdPushDescriptorSetWithTemplate2(commandBuffer, pPushDescriptorSetWithTemplateInfo.address());
    }

    // --- [ vkCopyMemoryToImage ] ---

    /** {@code VkResult vkCopyMemoryToImage(VkDevice device, VkCopyMemoryToImageInfo const * pCopyMemoryToImageInfo)} */
    public static int nvkCopyMemoryToImage(VkDevice device, long pCopyMemoryToImageInfo) {
        long __functionAddress = device.getCapabilities().vkCopyMemoryToImage;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyMemoryToImageInfo.validate(pCopyMemoryToImageInfo);
        }
        return callPPI(device.address(), pCopyMemoryToImageInfo, __functionAddress);
    }

    /** {@code VkResult vkCopyMemoryToImage(VkDevice device, VkCopyMemoryToImageInfo const * pCopyMemoryToImageInfo)} */
    @NativeType("VkResult")
    public static int vkCopyMemoryToImage(VkDevice device, @NativeType("VkCopyMemoryToImageInfo const *") VkCopyMemoryToImageInfo pCopyMemoryToImageInfo) {
        return nvkCopyMemoryToImage(device, pCopyMemoryToImageInfo.address());
    }

    // --- [ vkCopyImageToMemory ] ---

    /** {@code VkResult vkCopyImageToMemory(VkDevice device, VkCopyImageToMemoryInfo const * pCopyImageToMemoryInfo)} */
    public static int nvkCopyImageToMemory(VkDevice device, long pCopyImageToMemoryInfo) {
        long __functionAddress = device.getCapabilities().vkCopyImageToMemory;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyImageToMemoryInfo.validate(pCopyImageToMemoryInfo);
        }
        return callPPI(device.address(), pCopyImageToMemoryInfo, __functionAddress);
    }

    /** {@code VkResult vkCopyImageToMemory(VkDevice device, VkCopyImageToMemoryInfo const * pCopyImageToMemoryInfo)} */
    @NativeType("VkResult")
    public static int vkCopyImageToMemory(VkDevice device, @NativeType("VkCopyImageToMemoryInfo const *") VkCopyImageToMemoryInfo pCopyImageToMemoryInfo) {
        return nvkCopyImageToMemory(device, pCopyImageToMemoryInfo.address());
    }

    // --- [ vkCopyImageToImage ] ---

    /** {@code VkResult vkCopyImageToImage(VkDevice device, VkCopyImageToImageInfo const * pCopyImageToImageInfo)} */
    public static int nvkCopyImageToImage(VkDevice device, long pCopyImageToImageInfo) {
        long __functionAddress = device.getCapabilities().vkCopyImageToImage;
        if (CHECKS) {
            check(__functionAddress);
            VkCopyImageToImageInfo.validate(pCopyImageToImageInfo);
        }
        return callPPI(device.address(), pCopyImageToImageInfo, __functionAddress);
    }

    /** {@code VkResult vkCopyImageToImage(VkDevice device, VkCopyImageToImageInfo const * pCopyImageToImageInfo)} */
    @NativeType("VkResult")
    public static int vkCopyImageToImage(VkDevice device, @NativeType("VkCopyImageToImageInfo const *") VkCopyImageToImageInfo pCopyImageToImageInfo) {
        return nvkCopyImageToImage(device, pCopyImageToImageInfo.address());
    }

    // --- [ vkTransitionImageLayout ] ---

    /** {@code VkResult vkTransitionImageLayout(VkDevice device, uint32_t transitionCount, VkHostImageLayoutTransitionInfo const * pTransitions)} */
    public static int nvkTransitionImageLayout(VkDevice device, int transitionCount, long pTransitions) {
        long __functionAddress = device.getCapabilities().vkTransitionImageLayout;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), transitionCount, pTransitions, __functionAddress);
    }

    /** {@code VkResult vkTransitionImageLayout(VkDevice device, uint32_t transitionCount, VkHostImageLayoutTransitionInfo const * pTransitions)} */
    @NativeType("VkResult")
    public static int vkTransitionImageLayout(VkDevice device, @NativeType("VkHostImageLayoutTransitionInfo const *") VkHostImageLayoutTransitionInfo.Buffer pTransitions) {
        return nvkTransitionImageLayout(device, pTransitions.remaining(), pTransitions.address());
    }

}