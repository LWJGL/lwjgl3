/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRMaintenance5 {

    public static final int VK_KHR_MAINTENANCE_5_SPEC_VERSION = 1;

    public static final String VK_KHR_MAINTENANCE_5_EXTENSION_NAME = "VK_KHR_maintenance5";

    public static final int
        VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_KHR                     = 1000338002,
        VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_KHR                      = 1000338003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES_KHR   = 1000470000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES_KHR = 1000470001,
        VK_STRUCTURE_TYPE_RENDERING_AREA_INFO_KHR                      = 1000470003,
        VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO_KHR            = 1000470004,
        VK_STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO_KHR      = 1000470005,
        VK_STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO_KHR         = 1000470006;

    public static final int
        VK_FORMAT_A1B5G5R5_UNORM_PACK16_KHR = 1000470000,
        VK_FORMAT_A8_UNORM_KHR              = 1000470001;

    public static final long
        VK_PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT_KHR                           = 0x1L,
        VK_PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT_KHR                              = 0x2L,
        VK_PIPELINE_CREATE_2_DERIVATIVE_BIT_KHR                                     = 0x4L,
        VK_PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR                   = 0x8L,
        VK_PIPELINE_CREATE_2_DISPATCH_BASE_BIT_KHR                                  = 0x10L,
        VK_PIPELINE_CREATE_2_DEFER_COMPILE_BIT_NV                                   = 0x20L,
        VK_PIPELINE_CREATE_2_CAPTURE_STATISTICS_BIT_KHR                             = 0x40L,
        VK_PIPELINE_CREATE_2_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR               = 0x80L,
        VK_PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_KHR              = 0x100L,
        VK_PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT_KHR                        = 0x200L,
        VK_PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT                         = 0x400L,
        VK_PIPELINE_CREATE_2_LIBRARY_BIT_KHR                                        = 0x800L,
        VK_PIPELINE_CREATE_2_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR                     = 0x1000L,
        VK_PIPELINE_CREATE_2_RAY_TRACING_SKIP_AABBS_BIT_KHR                         = 0x2000L,
        VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR            = 0x4000L,
        VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR        = 0x8000L,
        VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR               = 0x10000L,
        VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR       = 0x20000L,
        VK_PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_NV                               = 0x40000L,
        VK_PIPELINE_CREATE_2_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR = 0x80000L,
        VK_PIPELINE_CREATE_2_RAY_TRACING_ALLOW_MOTION_BIT_NV                        = 0x100000L,
        VK_PIPELINE_CREATE_2_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR     = 0x200000L,
        VK_PIPELINE_CREATE_2_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT      = 0x400000L,
        VK_PIPELINE_CREATE_2_RETAIN_LINK_TIME_OPTIMIZATION_INFO_BIT_EXT             = 0x800000L,
        VK_PIPELINE_CREATE_2_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT                   = 0x1000000L,
        VK_PIPELINE_CREATE_2_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT                 = 0x2000000L,
        VK_PIPELINE_CREATE_2_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT         = 0x4000000L,
        VK_PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT_EXT                            = 0x8000000L,
        VK_PIPELINE_CREATE_2_RAY_TRACING_DISPLACEMENT_MICROMAP_BIT_NV               = 0x10000000L,
        VK_PIPELINE_CREATE_2_DESCRIPTOR_BUFFER_BIT_EXT                              = 0x20000000L,
        VK_PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT_EXT                          = 0x40000000L,
        VK_PIPELINE_CREATE_2_DISALLOW_OPACITY_MICROMAP_BIT_ARM                      = 0x2000000000L;

    public static final long
        VK_BUFFER_USAGE_2_TRANSFER_SRC_BIT_KHR                                 = 0x1L,
        VK_BUFFER_USAGE_2_TRANSFER_DST_BIT_KHR                                 = 0x2L,
        VK_BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT_KHR                         = 0x4L,
        VK_BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT_KHR                         = 0x8L,
        VK_BUFFER_USAGE_2_UNIFORM_BUFFER_BIT_KHR                               = 0x10L,
        VK_BUFFER_USAGE_2_STORAGE_BUFFER_BIT_KHR                               = 0x20L,
        VK_BUFFER_USAGE_2_INDEX_BUFFER_BIT_KHR                                 = 0x40L,
        VK_BUFFER_USAGE_2_VERTEX_BUFFER_BIT_KHR                                = 0x80L,
        VK_BUFFER_USAGE_2_INDIRECT_BUFFER_BIT_KHR                              = 0x100L,
        VK_BUFFER_USAGE_2_CONDITIONAL_RENDERING_BIT_EXT                        = 0x200L,
        VK_BUFFER_USAGE_2_SHADER_BINDING_TABLE_BIT_KHR                         = 0x400L,
        VK_BUFFER_USAGE_2_RAY_TRACING_BIT_NV                                   = 0x400L,
        VK_BUFFER_USAGE_2_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT                    = 0x800L,
        VK_BUFFER_USAGE_2_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT            = 0x1000L,
        VK_BUFFER_USAGE_2_VIDEO_DECODE_SRC_BIT_KHR                             = 0x2000L,
        VK_BUFFER_USAGE_2_VIDEO_DECODE_DST_BIT_KHR                             = 0x4000L,
        VK_BUFFER_USAGE_2_VIDEO_ENCODE_DST_BIT_KHR                             = 0x8000L,
        VK_BUFFER_USAGE_2_VIDEO_ENCODE_SRC_BIT_KHR                             = 0x10000L,
        VK_BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT_KHR                        = 0x20000L,
        VK_BUFFER_USAGE_2_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR = 0x80000L,
        VK_BUFFER_USAGE_2_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR               = 0x100000L,
        VK_BUFFER_USAGE_2_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT                    = 0x200000L,
        VK_BUFFER_USAGE_2_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT                   = 0x400000L,
        VK_BUFFER_USAGE_2_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT               = 0x800000L,
        VK_BUFFER_USAGE_2_MICROMAP_STORAGE_BIT_EXT                             = 0x1000000L,
        VK_BUFFER_USAGE_2_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT           = 0x4000000L;

    protected KHRMaintenance5() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdBindIndexBuffer2KHR ] ---

    /** {@code void vkCmdBindIndexBuffer2KHR(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkDeviceSize size, VkIndexType indexType)} */
    public static void vkCmdBindIndexBuffer2KHR(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset, @NativeType("VkDeviceSize") long size, @NativeType("VkIndexType") int indexType) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindIndexBuffer2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJJV(commandBuffer.address(), buffer, offset, size, indexType, __functionAddress);
    }

    // --- [ vkGetRenderingAreaGranularityKHR ] ---

    /** {@code void vkGetRenderingAreaGranularityKHR(VkDevice device, VkRenderingAreaInfo const * pRenderingAreaInfo, VkExtent2D * pGranularity)} */
    public static void nvkGetRenderingAreaGranularityKHR(VkDevice device, long pRenderingAreaInfo, long pGranularity) {
        long __functionAddress = device.getCapabilities().vkGetRenderingAreaGranularityKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(device.address(), pRenderingAreaInfo, pGranularity, __functionAddress);
    }

    /** {@code void vkGetRenderingAreaGranularityKHR(VkDevice device, VkRenderingAreaInfo const * pRenderingAreaInfo, VkExtent2D * pGranularity)} */
    public static void vkGetRenderingAreaGranularityKHR(VkDevice device, @NativeType("VkRenderingAreaInfo const *") VkRenderingAreaInfo pRenderingAreaInfo, @NativeType("VkExtent2D *") VkExtent2D pGranularity) {
        nvkGetRenderingAreaGranularityKHR(device, pRenderingAreaInfo.address(), pGranularity.address());
    }

    // --- [ vkGetDeviceImageSubresourceLayoutKHR ] ---

    /** {@code void vkGetDeviceImageSubresourceLayoutKHR(VkDevice device, VkDeviceImageSubresourceInfo const * pInfo, VkSubresourceLayout2 * pLayout)} */
    public static void nvkGetDeviceImageSubresourceLayoutKHR(VkDevice device, long pInfo, long pLayout) {
        long __functionAddress = device.getCapabilities().vkGetDeviceImageSubresourceLayoutKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkDeviceImageSubresourceInfo.validate(pInfo);
        }
        callPPPV(device.address(), pInfo, pLayout, __functionAddress);
    }

    /** {@code void vkGetDeviceImageSubresourceLayoutKHR(VkDevice device, VkDeviceImageSubresourceInfo const * pInfo, VkSubresourceLayout2 * pLayout)} */
    public static void vkGetDeviceImageSubresourceLayoutKHR(VkDevice device, @NativeType("VkDeviceImageSubresourceInfo const *") VkDeviceImageSubresourceInfo pInfo, @NativeType("VkSubresourceLayout2 *") VkSubresourceLayout2 pLayout) {
        nvkGetDeviceImageSubresourceLayoutKHR(device, pInfo.address(), pLayout.address());
    }

    // --- [ vkGetImageSubresourceLayout2KHR ] ---

    /** {@code void vkGetImageSubresourceLayout2KHR(VkDevice device, VkImage image, VkImageSubresource2 const * pSubresource, VkSubresourceLayout2 * pLayout)} */
    public static void nvkGetImageSubresourceLayout2KHR(VkDevice device, long image, long pSubresource, long pLayout) {
        long __functionAddress = device.getCapabilities().vkGetImageSubresourceLayout2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPPV(device.address(), image, pSubresource, pLayout, __functionAddress);
    }

    /** {@code void vkGetImageSubresourceLayout2KHR(VkDevice device, VkImage image, VkImageSubresource2 const * pSubresource, VkSubresourceLayout2 * pLayout)} */
    public static void vkGetImageSubresourceLayout2KHR(VkDevice device, @NativeType("VkImage") long image, @NativeType("VkImageSubresource2 const *") VkImageSubresource2 pSubresource, @NativeType("VkSubresourceLayout2 *") VkSubresourceLayout2 pLayout) {
        nvkGetImageSubresourceLayout2KHR(device, image, pSubresource.address(), pLayout.address());
    }

}