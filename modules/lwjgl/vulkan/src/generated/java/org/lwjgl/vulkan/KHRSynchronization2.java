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

public class KHRSynchronization2 {

    public static final int VK_KHR_SYNCHRONIZATION_2_SPEC_VERSION = 1;

    public static final String VK_KHR_SYNCHRONIZATION_2_EXTENSION_NAME = "VK_KHR_synchronization2";

    public static final int
        VK_STRUCTURE_TYPE_MEMORY_BARRIER_2_KHR                           = 1000314000,
        VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2_KHR                    = 1000314001,
        VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2_KHR                     = 1000314002,
        VK_STRUCTURE_TYPE_DEPENDENCY_INFO_KHR                            = 1000314003,
        VK_STRUCTURE_TYPE_SUBMIT_INFO_2_KHR                              = 1000314004,
        VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO_KHR                      = 1000314005,
        VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO_KHR                 = 1000314006,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES_KHR = 1000314007;

    public static final int VK_EVENT_CREATE_DEVICE_ONLY_BIT_KHR = 0x1;

    public static final int
        VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR  = 1000314000,
        VK_IMAGE_LAYOUT_ATTACHMENT_OPTIMAL_KHR = 1000314001;

    public static final int VK_PIPELINE_STAGE_NONE_KHR = 0;

    public static final int VK_ACCESS_NONE_KHR = 0;

    public static final long
        VK_ACCESS_2_NONE_KHR                                      = 0L,
        VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR                 = 0x1L,
        VK_ACCESS_2_INDEX_READ_BIT_KHR                            = 0x2L,
        VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR                 = 0x4L,
        VK_ACCESS_2_UNIFORM_READ_BIT_KHR                          = 0x8L,
        VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR                 = 0x10L,
        VK_ACCESS_2_SHADER_READ_BIT_KHR                           = 0x20L,
        VK_ACCESS_2_SHADER_WRITE_BIT_KHR                          = 0x40L,
        VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR                 = 0x80L,
        VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR                = 0x100L,
        VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR         = 0x200L,
        VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR        = 0x400L,
        VK_ACCESS_2_TRANSFER_READ_BIT_KHR                         = 0x800L,
        VK_ACCESS_2_TRANSFER_WRITE_BIT_KHR                        = 0x1000L,
        VK_ACCESS_2_HOST_READ_BIT_KHR                             = 0x2000L,
        VK_ACCESS_2_HOST_WRITE_BIT_KHR                            = 0x4000L,
        VK_ACCESS_2_MEMORY_READ_BIT_KHR                           = 0x8000L,
        VK_ACCESS_2_MEMORY_WRITE_BIT_KHR                          = 0x10000L,
        VK_ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV                = 0x20000L,
        VK_ACCESS_2_COMMAND_PREPROCESS_READ_BIT_EXT               = 0x20000L,
        VK_ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV               = 0x40000L,
        VK_ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_EXT              = 0x40000L,
        VK_ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT     = 0x80000L,
        VK_ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT            = 0x100000L,
        VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR           = 0x200000L,
        VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_NV            = 0x200000L,
        VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR          = 0x400000L,
        VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_NV           = 0x400000L,
        VK_ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR = 0x800000L,
        VK_ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV                = 0x800000L,
        VK_ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT             = 0x1000000L,
        VK_ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT              = 0x2000000L,
        VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT       = 0x4000000L,
        VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT      = 0x8000000L,
        VK_ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR                   = 0x100000000L,
        VK_ACCESS_2_SHADER_STORAGE_READ_BIT_KHR                   = 0x200000000L,
        VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR                  = 0x400000000L;

    public static final long
        VK_PIPELINE_STAGE_2_NONE_KHR                                 = 0L,
        VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT_KHR                      = 0x1L,
        VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR                    = 0x2L,
        VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR                     = 0x4L,
        VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT_KHR                    = 0x8L,
        VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR      = 0x10L,
        VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR   = 0x20L,
        VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR                  = 0x40L,
        VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR                  = 0x80L,
        VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR             = 0x100L,
        VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR              = 0x200L,
        VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR          = 0x400L,
        VK_PIPELINE_STAGE_2_COMPUTE_SHADER_BIT_KHR                   = 0x800L,
        VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR                     = 0x1000L,
        VK_PIPELINE_STAGE_2_TRANSFER_BIT_KHR                         = 0x1000L,
        VK_PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT_KHR                   = 0x2000L,
        VK_PIPELINE_STAGE_2_HOST_BIT_KHR                             = 0x4000L,
        VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR                     = 0x8000L,
        VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR                     = 0x10000L,
        VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV                = 0x20000L,
        VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_EXT               = 0x20000L,
        VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT            = 0x40000L,
        VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV                       = 0x80000L,
        VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_EXT                      = 0x80000L,
        VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV                       = 0x100000L,
        VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_EXT                      = 0x100000L,
        VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR               = 0x200000L,
        VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_NV                = 0x200000L,
        VK_PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 0x400000L,
        VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV                = 0x400000L,
        VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT         = 0x800000L,
        VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT               = 0x1000000L,
        VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR     = 0x2000000L,
        VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_NV      = 0x2000000L,
        VK_PIPELINE_STAGE_2_COPY_BIT_KHR                             = 0x100000000L,
        VK_PIPELINE_STAGE_2_RESOLVE_BIT_KHR                          = 0x200000000L,
        VK_PIPELINE_STAGE_2_BLIT_BIT_KHR                             = 0x400000000L,
        VK_PIPELINE_STAGE_2_CLEAR_BIT_KHR                            = 0x800000000L,
        VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR                      = 0x1000000000L,
        VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR           = 0x2000000000L,
        VK_PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT_KHR        = 0x4000000000L;

    public static final int VK_SUBMIT_PROTECTED_BIT_KHR = 0x1;

    protected KHRSynchronization2() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetEvent2KHR ] ---

    /** {@code void vkCmdSetEvent2KHR(VkCommandBuffer commandBuffer, VkEvent event, VkDependencyInfo const * pDependencyInfo)} */
    public static void nvkCmdSetEvent2KHR(VkCommandBuffer commandBuffer, long event, long pDependencyInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetEvent2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkDependencyInfo.validate(pDependencyInfo);
        }
        callPJPV(commandBuffer.address(), event, pDependencyInfo, __functionAddress);
    }

    /** {@code void vkCmdSetEvent2KHR(VkCommandBuffer commandBuffer, VkEvent event, VkDependencyInfo const * pDependencyInfo)} */
    public static void vkCmdSetEvent2KHR(VkCommandBuffer commandBuffer, @NativeType("VkEvent") long event, @NativeType("VkDependencyInfo const *") VkDependencyInfo pDependencyInfo) {
        nvkCmdSetEvent2KHR(commandBuffer, event, pDependencyInfo.address());
    }

    // --- [ vkCmdResetEvent2KHR ] ---

    /** {@code void vkCmdResetEvent2KHR(VkCommandBuffer commandBuffer, VkEvent event, VkPipelineStageFlags2 stageMask)} */
    public static void vkCmdResetEvent2KHR(VkCommandBuffer commandBuffer, @NativeType("VkEvent") long event, @NativeType("VkPipelineStageFlags2") long stageMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdResetEvent2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJV(commandBuffer.address(), event, stageMask, __functionAddress);
    }

    // --- [ vkCmdWaitEvents2KHR ] ---

    /** {@code void vkCmdWaitEvents2KHR(VkCommandBuffer commandBuffer, uint32_t eventCount, VkEvent const * pEvents, VkDependencyInfo const * pDependencyInfos)} */
    public static void nvkCmdWaitEvents2KHR(VkCommandBuffer commandBuffer, int eventCount, long pEvents, long pDependencyInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWaitEvents2KHR;
        if (CHECKS) {
            check(__functionAddress);
            Struct.validate(pDependencyInfos, eventCount, VkDependencyInfo.SIZEOF, VkDependencyInfo::validate);
        }
        callPPPV(commandBuffer.address(), eventCount, pEvents, pDependencyInfos, __functionAddress);
    }

    /** {@code void vkCmdWaitEvents2KHR(VkCommandBuffer commandBuffer, uint32_t eventCount, VkEvent const * pEvents, VkDependencyInfo const * pDependencyInfos)} */
    public static void vkCmdWaitEvents2KHR(VkCommandBuffer commandBuffer, @NativeType("VkEvent const *") LongBuffer pEvents, @NativeType("VkDependencyInfo const *") VkDependencyInfo.Buffer pDependencyInfos) {
        if (CHECKS) {
            check(pDependencyInfos, pEvents.remaining());
        }
        nvkCmdWaitEvents2KHR(commandBuffer, pEvents.remaining(), memAddress(pEvents), pDependencyInfos.address());
    }

    // --- [ vkCmdPipelineBarrier2KHR ] ---

    /** {@code void vkCmdPipelineBarrier2KHR(VkCommandBuffer commandBuffer, VkDependencyInfo const * pDependencyInfo)} */
    public static void nvkCmdPipelineBarrier2KHR(VkCommandBuffer commandBuffer, long pDependencyInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPipelineBarrier2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkDependencyInfo.validate(pDependencyInfo);
        }
        callPPV(commandBuffer.address(), pDependencyInfo, __functionAddress);
    }

    /** {@code void vkCmdPipelineBarrier2KHR(VkCommandBuffer commandBuffer, VkDependencyInfo const * pDependencyInfo)} */
    public static void vkCmdPipelineBarrier2KHR(VkCommandBuffer commandBuffer, @NativeType("VkDependencyInfo const *") VkDependencyInfo pDependencyInfo) {
        nvkCmdPipelineBarrier2KHR(commandBuffer, pDependencyInfo.address());
    }

    // --- [ vkCmdWriteTimestamp2KHR ] ---

    /** {@code void vkCmdWriteTimestamp2KHR(VkCommandBuffer commandBuffer, VkPipelineStageFlags2 stage, VkQueryPool queryPool, uint32_t query)} */
    public static void vkCmdWriteTimestamp2KHR(VkCommandBuffer commandBuffer, @NativeType("VkPipelineStageFlags2") long stage, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int query) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteTimestamp2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJV(commandBuffer.address(), stage, queryPool, query, __functionAddress);
    }

    // --- [ vkQueueSubmit2KHR ] ---

    /** {@code VkResult vkQueueSubmit2KHR(VkQueue queue, uint32_t submitCount, VkSubmitInfo2 const * pSubmits, VkFence fence)} */
    public static int nvkQueueSubmit2KHR(VkQueue queue, int submitCount, long pSubmits, long fence) {
        long __functionAddress = queue.getCapabilities().vkQueueSubmit2KHR;
        if (CHECKS) {
            check(__functionAddress);
            if (pSubmits != NULL) { Struct.validate(pSubmits, submitCount, VkSubmitInfo2.SIZEOF, VkSubmitInfo2::validate); }
        }
        return callPPJI(queue.address(), submitCount, pSubmits, fence, __functionAddress);
    }

    /** {@code VkResult vkQueueSubmit2KHR(VkQueue queue, uint32_t submitCount, VkSubmitInfo2 const * pSubmits, VkFence fence)} */
    @NativeType("VkResult")
    public static int vkQueueSubmit2KHR(VkQueue queue, @NativeType("VkSubmitInfo2 const *") VkSubmitInfo2.@Nullable Buffer pSubmits, @NativeType("VkFence") long fence) {
        return nvkQueueSubmit2KHR(queue, remainingSafe(pSubmits), memAddressSafe(pSubmits), fence);
    }

    /** {@code void vkCmdWaitEvents2KHR(VkCommandBuffer commandBuffer, uint32_t eventCount, VkEvent const * pEvents, VkDependencyInfo const * pDependencyInfos)} */
    public static void vkCmdWaitEvents2KHR(VkCommandBuffer commandBuffer, @NativeType("VkEvent const *") long[] pEvents, @NativeType("VkDependencyInfo const *") VkDependencyInfo.Buffer pDependencyInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWaitEvents2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pDependencyInfos, pEvents.length);
            Struct.validate(pDependencyInfos.address(), pEvents.length, VkDependencyInfo.SIZEOF, VkDependencyInfo::validate);
        }
        callPPPV(commandBuffer.address(), pEvents.length, pEvents, pDependencyInfos.address(), __functionAddress);
    }

}