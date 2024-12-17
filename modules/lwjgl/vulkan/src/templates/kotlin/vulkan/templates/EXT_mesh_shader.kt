/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_mesh_shader = "EXTMeshShader".nativeClassVK("EXT_mesh_shader", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_MESH_SHADER_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_MESH_SHADER_EXTENSION_NAME".."VK_EXT_mesh_shader"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_EXT".."1000328000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_EXT".."1000328001"
    )

    EnumConstant(
        "SHADER_STAGE_TASK_BIT_EXT".enum(0x00000040),
        "SHADER_STAGE_MESH_BIT_EXT".enum(0x00000080)
    )

    EnumConstant(
        "PIPELINE_STAGE_TASK_SHADER_BIT_EXT".enum(0x00080000),
        "PIPELINE_STAGE_MESH_SHADER_BIT_EXT".enum(0x00100000)
    )

    EnumConstant(
        "QUERY_TYPE_MESH_PRIMITIVES_GENERATED_EXT".."1000328000"
    )

    EnumConstant(
        "QUERY_PIPELINE_STATISTIC_TASK_SHADER_INVOCATIONS_BIT_EXT".enum(0x00000800),
        "QUERY_PIPELINE_STATISTIC_MESH_SHADER_INVOCATIONS_BIT_EXT".enum(0x00001000)
    )

    EnumConstant(
        "INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_NV".."1000328000"
    )

    EnumConstant(
        "INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_EXT".."1000328000",
        "INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_COUNT_EXT".."1000328001"
    )

    void(
        "CmdDrawMeshTasksEXT",

        VkCommandBuffer("commandBuffer"),
        uint32_t("groupCountX"),
        uint32_t("groupCountY"),
        uint32_t("groupCountZ")
    )

    void(
        "CmdDrawMeshTasksIndirectEXT",

        VkCommandBuffer("commandBuffer"),
        VkBuffer("buffer"),
        VkDeviceSize("offset"),
        uint32_t("drawCount"),
        uint32_t("stride")
    )

    DependsOn("""ext.contains("VK_KHR_draw_indirect_count") || ext.contains("Vulkan12")""")..void(
        "CmdDrawMeshTasksIndirectCountEXT",

        VkCommandBuffer("commandBuffer"),
        VkBuffer("buffer"),
        VkDeviceSize("offset"),
        VkBuffer("countBuffer"),
        VkDeviceSize("countBufferOffset"),
        uint32_t("maxDrawCount"),
        uint32_t("stride")
    )
}