/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class NVMeshShader {

    public static final int VK_NV_MESH_SHADER_SPEC_VERSION = 1;

    public static final String VK_NV_MESH_SHADER_EXTENSION_NAME = "VK_NV_mesh_shader";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_NV   = 1000202000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_NV = 1000202001;

    public static final int
        VK_SHADER_STAGE_TASK_BIT_NV = 0x40,
        VK_SHADER_STAGE_MESH_BIT_NV = 0x80;

    public static final int
        VK_PIPELINE_STAGE_TASK_SHADER_BIT_NV = 0x80000,
        VK_PIPELINE_STAGE_MESH_SHADER_BIT_NV = 0x100000;

    public static final int
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_NV_EXT       = 1000202002,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_COUNT_NV_EXT = 1000202003;

    protected NVMeshShader() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdDrawMeshTasksNV ] ---

    /** {@code void vkCmdDrawMeshTasksNV(VkCommandBuffer commandBuffer, uint32_t taskCount, uint32_t firstTask)} */
    public static void vkCmdDrawMeshTasksNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int taskCount, @NativeType("uint32_t") int firstTask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawMeshTasksNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), taskCount, firstTask, __functionAddress);
    }

    // --- [ vkCmdDrawMeshTasksIndirectNV ] ---

    /** {@code void vkCmdDrawMeshTasksIndirectNV(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, uint32_t drawCount, uint32_t stride)} */
    public static void vkCmdDrawMeshTasksIndirectNV(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset, @NativeType("uint32_t") int drawCount, @NativeType("uint32_t") int stride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawMeshTasksIndirectNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJV(commandBuffer.address(), buffer, offset, drawCount, stride, __functionAddress);
    }

    // --- [ vkCmdDrawMeshTasksIndirectCountNV ] ---

    /** {@code void vkCmdDrawMeshTasksIndirectCountNV(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkBuffer countBuffer, VkDeviceSize countBufferOffset, uint32_t maxDrawCount, uint32_t stride)} */
    public static void vkCmdDrawMeshTasksIndirectCountNV(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset, @NativeType("VkBuffer") long countBuffer, @NativeType("VkDeviceSize") long countBufferOffset, @NativeType("uint32_t") int maxDrawCount, @NativeType("uint32_t") int stride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawMeshTasksIndirectCountNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJJJV(commandBuffer.address(), buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride, __functionAddress);
    }

}