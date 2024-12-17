/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTMeshShader {

    public static final int VK_EXT_MESH_SHADER_SPEC_VERSION = 1;

    public static final String VK_EXT_MESH_SHADER_EXTENSION_NAME = "VK_EXT_mesh_shader";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_EXT   = 1000328000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_EXT = 1000328001;

    public static final int
        VK_SHADER_STAGE_TASK_BIT_EXT = 0x40,
        VK_SHADER_STAGE_MESH_BIT_EXT = 0x80;

    public static final int
        VK_PIPELINE_STAGE_TASK_SHADER_BIT_EXT = 0x80000,
        VK_PIPELINE_STAGE_MESH_SHADER_BIT_EXT = 0x100000;

    public static final int VK_QUERY_TYPE_MESH_PRIMITIVES_GENERATED_EXT = 1000328000;

    public static final int
        VK_QUERY_PIPELINE_STATISTIC_TASK_SHADER_INVOCATIONS_BIT_EXT = 0x800,
        VK_QUERY_PIPELINE_STATISTIC_MESH_SHADER_INVOCATIONS_BIT_EXT = 0x1000;

    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_NV = 1000328000;

    public static final int
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_EXT       = 1000328000,
        VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_COUNT_EXT = 1000328001;

    protected EXTMeshShader() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdDrawMeshTasksEXT ] ---

    /** {@code void vkCmdDrawMeshTasksEXT(VkCommandBuffer commandBuffer, uint32_t groupCountX, uint32_t groupCountY, uint32_t groupCountZ)} */
    public static void vkCmdDrawMeshTasksEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int groupCountX, @NativeType("uint32_t") int groupCountY, @NativeType("uint32_t") int groupCountZ) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawMeshTasksEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), groupCountX, groupCountY, groupCountZ, __functionAddress);
    }

    // --- [ vkCmdDrawMeshTasksIndirectEXT ] ---

    /** {@code void vkCmdDrawMeshTasksIndirectEXT(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, uint32_t drawCount, uint32_t stride)} */
    public static void vkCmdDrawMeshTasksIndirectEXT(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset, @NativeType("uint32_t") int drawCount, @NativeType("uint32_t") int stride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawMeshTasksIndirectEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJV(commandBuffer.address(), buffer, offset, drawCount, stride, __functionAddress);
    }

    // --- [ vkCmdDrawMeshTasksIndirectCountEXT ] ---

    /** {@code void vkCmdDrawMeshTasksIndirectCountEXT(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkBuffer countBuffer, VkDeviceSize countBufferOffset, uint32_t maxDrawCount, uint32_t stride)} */
    public static void vkCmdDrawMeshTasksIndirectCountEXT(VkCommandBuffer commandBuffer, @NativeType("VkBuffer") long buffer, @NativeType("VkDeviceSize") long offset, @NativeType("VkBuffer") long countBuffer, @NativeType("VkDeviceSize") long countBufferOffset, @NativeType("uint32_t") int maxDrawCount, @NativeType("uint32_t") int stride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawMeshTasksIndirectCountEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJJJV(commandBuffer.address(), buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride, __functionAddress);
    }

}