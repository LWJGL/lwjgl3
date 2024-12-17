/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_device_generated_commands = "NVDeviceGeneratedCommands".nativeClassVK("NV_device_generated_commands", type = "device", postfix = "NV") {
    IntConstant(
        "NV_DEVICE_GENERATED_COMMANDS_SPEC_VERSION".."3"
    )

    StringConstant(
        "NV_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME".."VK_NV_device_generated_commands"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_NV".."1000277000",
        "STRUCTURE_TYPE_GRAPHICS_SHADER_GROUP_CREATE_INFO_NV".."1000277001",
        "STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV".."1000277002",
        "STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV".."1000277003",
        "STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV".."1000277004",
        "STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV".."1000277005",
        "STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_NV".."1000277006",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_NV".."1000277007"
    )

    EnumConstant(
        "PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV".enum(0x00040000)
    )

    EnumConstant(
        "PIPELINE_STAGE_COMMAND_PREPROCESS_BIT_NV".enum(0x00020000)
    )

    EnumConstant(
        "ACCESS_COMMAND_PREPROCESS_READ_BIT_NV".enum(0x00020000),
        "ACCESS_COMMAND_PREPROCESS_WRITE_BIT_NV".enum(0x00040000)
    )

    EnumConstant(
        "OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NV".."1000277000"
    )

    EnumConstant(
        "INDIRECT_STATE_FLAG_FRONTFACE_BIT_NV".enum(0x00000001)
    )

    EnumConstant(
        "INDIRECT_COMMANDS_TOKEN_TYPE_SHADER_GROUP_NV".."0",
        "INDIRECT_COMMANDS_TOKEN_TYPE_STATE_FLAGS_NV".."1",
        "INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NV".."2",
        "INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NV".."3",
        "INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV".."4",
        "INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NV".."5",
        "INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NV".."6",
        "INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_TASKS_NV".."7"
    )

    EnumConstant(
        "INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_NV".enum(0x00000001),
        "INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NV".enum(0x00000002),
        "INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NV".enum(0x00000004)
    )

    void(
        "GetGeneratedCommandsMemoryRequirementsNV",

        VkDevice("device"),
        VkGeneratedCommandsMemoryRequirementsInfoNV.const.p("pInfo"),
        VkMemoryRequirements2.p("pMemoryRequirements")
    )

    void(
        "CmdPreprocessGeneratedCommandsNV",

        VkCommandBuffer("commandBuffer"),
        VkGeneratedCommandsInfoNV.const.p("pGeneratedCommandsInfo")
    )

    void(
        "CmdExecuteGeneratedCommandsNV",

        VkCommandBuffer("commandBuffer"),
        VkBool32("isPreprocessed"),
        VkGeneratedCommandsInfoNV.const.p("pGeneratedCommandsInfo")
    )

    void(
        "CmdBindPipelineShaderGroupNV",

        VkCommandBuffer("commandBuffer"),
        VkPipelineBindPoint("pipelineBindPoint"),
        VkPipeline("pipeline"),
        uint32_t("groupIndex")
    )

    VkResult(
        "CreateIndirectCommandsLayoutNV",

        VkDevice("device"),
        VkIndirectCommandsLayoutCreateInfoNV.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkIndirectCommandsLayoutNV.p("pIndirectCommandsLayout")
    )

    void(
        "DestroyIndirectCommandsLayoutNV",

        VkDevice("device"),
        VkIndirectCommandsLayoutNV("indirectCommandsLayout"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )
}