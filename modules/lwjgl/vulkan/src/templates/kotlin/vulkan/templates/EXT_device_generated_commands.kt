/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_device_generated_commands = "EXTDeviceGeneratedCommands".nativeClassVK("EXT_device_generated_commands", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_DEVICE_GENERATED_COMMANDS_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME".."VK_EXT_device_generated_commands"
    )

    EnumConstant(
        "SHADER_CREATE_INDIRECT_BINDABLE_BIT_EXT".enum(0x00000080)
    )

    EnumConstantLong(
        "BUFFER_USAGE_2_PREPROCESS_BUFFER_BIT_EXT".enum(0x80000000L)
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_EXT".."1000572000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_EXT".."1000572001",
        "STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_EXT".."1000572002",
        "STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_CREATE_INFO_EXT".."1000572003",
        "STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT".."1000572004",
        "STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT".."1000572006",
        "STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_EXT".."1000572007",
        "STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_PIPELINE_EXT".."1000572008",
        "STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_SHADER_EXT".."1000572009",
        "STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT".."1000572010",
        "STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT".."1000572011",
        "STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_LAYOUT_INFO_EXT".."1000572012",
        "STRUCTURE_TYPE_GENERATED_COMMANDS_PIPELINE_INFO_EXT".."1000572013",
        "STRUCTURE_TYPE_GENERATED_COMMANDS_SHADER_INFO_EXT".."1000572014"
    )

    EnumConstant(
        "OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_EXT".."1000572000",
        "OBJECT_TYPE_INDIRECT_EXECUTION_SET_EXT".."1000572001"
    )

    EnumConstantLong(
        "PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_EXT".enum(0x4000000000L)
    )

    EnumConstant(
        "PIPELINE_STAGE_COMMAND_PREPROCESS_BIT_EXT".enum(0x00020000)
    )

    EnumConstant(
        "ACCESS_COMMAND_PREPROCESS_READ_BIT_EXT".enum(0x00020000),
        "ACCESS_COMMAND_PREPROCESS_WRITE_BIT_EXT".enum(0x00040000)
    )

    EnumConstant(
        "INDIRECT_COMMANDS_INPUT_MODE_VULKAN_INDEX_BUFFER_EXT".enum(0x00000001),
        "INDIRECT_COMMANDS_INPUT_MODE_DXGI_INDEX_BUFFER_EXT".enum(0x00000002)
    )

    EnumConstant(
        "INDIRECT_EXECUTION_SET_INFO_TYPE_PIPELINES_EXT".."0",
        "INDIRECT_EXECUTION_SET_INFO_TYPE_SHADER_OBJECTS_EXT".."1"
    )

    EnumConstant(
        "INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_EXT".enum(0x00000001),
        "INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_EXT".enum(0x00000002)
    )

    EnumConstant(
        "INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT".."0",
        "INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT".."1",
        "INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT".."2",
        "INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_EXT".."3",
        "INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_EXT".."4",
        "INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_EXT".."5",
        "INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_EXT".."6",
        "INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_COUNT_EXT".."7",
        "INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_COUNT_EXT".."8",
        "INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_EXT".."9"
    )

    void(
        "GetGeneratedCommandsMemoryRequirementsEXT",

        VkDevice("device"),
        VkGeneratedCommandsMemoryRequirementsInfoEXT.const.p("pInfo"),
        VkMemoryRequirements2.p("pMemoryRequirements")
    )

    void(
        "CmdPreprocessGeneratedCommandsEXT",

        VkCommandBuffer("commandBuffer"),
        VkGeneratedCommandsInfoEXT.const.p("pGeneratedCommandsInfo"),
        VkCommandBuffer("stateCommandBuffer")
    )

    void(
        "CmdExecuteGeneratedCommandsEXT",

        VkCommandBuffer("commandBuffer"),
        VkBool32("isPreprocessed"),
        VkGeneratedCommandsInfoEXT.const.p("pGeneratedCommandsInfo")
    )

    VkResult(
        "CreateIndirectCommandsLayoutEXT",

        VkDevice("device"),
        VkIndirectCommandsLayoutCreateInfoEXT.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkIndirectCommandsLayoutEXT.p("pIndirectCommandsLayout")
    )

    void(
        "DestroyIndirectCommandsLayoutEXT",

        VkDevice("device"),
        VkIndirectCommandsLayoutEXT("indirectCommandsLayout"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    VkResult(
        "CreateIndirectExecutionSetEXT",

        VkDevice("device"),
        VkIndirectExecutionSetCreateInfoEXT.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkIndirectExecutionSetEXT.p("pIndirectExecutionSet")
    )

    void(
        "DestroyIndirectExecutionSetEXT",

        VkDevice("device"),
        VkIndirectExecutionSetEXT("indirectExecutionSet"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    void(
        "UpdateIndirectExecutionSetPipelineEXT",

        VkDevice("device"),
        VkIndirectExecutionSetEXT("indirectExecutionSet"),
        AutoSize("pExecutionSetWrites")..uint32_t("executionSetWriteCount"),
        VkWriteIndirectExecutionSetPipelineEXT.const.p("pExecutionSetWrites")
    )

    void(
        "UpdateIndirectExecutionSetShaderEXT",

        VkDevice("device"),
        VkIndirectExecutionSetEXT("indirectExecutionSet"),
        AutoSize("pExecutionSetWrites")..uint32_t("executionSetWriteCount"),
        VkWriteIndirectExecutionSetShaderEXT.const.p("pExecutionSetWrites")
    )
}