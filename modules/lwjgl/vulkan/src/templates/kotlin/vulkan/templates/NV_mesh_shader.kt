/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_mesh_shader = "NVMeshShader".nativeClassVK("NV_mesh_shader", type = "device", postfix = "NV") {
    IntConstant(
        "NV_MESH_SHADER_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_MESH_SHADER_EXTENSION_NAME".."VK_NV_mesh_shader"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_NV".."1000202000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_NV".."1000202001"
    )

    EnumConstant(
        "SHADER_STAGE_TASK_BIT_NV".enum(0x00000040),
        "SHADER_STAGE_MESH_BIT_NV".enum(0x00000080)
    )

    EnumConstant(
        "PIPELINE_STAGE_TASK_SHADER_BIT_NV".enum(0x00080000),
        "PIPELINE_STAGE_MESH_SHADER_BIT_NV".enum(0x00100000)
    )

    EnumConstant(
        "INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_NV_EXT".."1000202002",
        "INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_COUNT_NV_EXT".."1000202003"
    )

    void(
        "CmdDrawMeshTasksNV",

        VkCommandBuffer("commandBuffer"),
        uint32_t("taskCount"),
        uint32_t("firstTask")
    )

    void(
        "CmdDrawMeshTasksIndirectNV",

        VkCommandBuffer("commandBuffer"),
        VkBuffer("buffer"),
        VkDeviceSize("offset"),
        uint32_t("drawCount"),
        uint32_t("stride")
    )

    DependsOn("""ext.contains("VK_KHR_draw_indirect_count") || ext.contains("Vulkan12")""")..void(
        "CmdDrawMeshTasksIndirectCountNV",

        VkCommandBuffer("commandBuffer"),
        VkBuffer("buffer"),
        VkDeviceSize("offset"),
        VkBuffer("countBuffer"),
        VkDeviceSize("countBufferOffset"),
        uint32_t("maxDrawCount"),
        uint32_t("stride")
    )
}