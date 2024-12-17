/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_device_generated_commands_compute = "NVDeviceGeneratedCommandsCompute".nativeClassVK("NV_device_generated_commands_compute", type = "device", postfix = "NV") {
    IntConstant(
        "NV_DEVICE_GENERATED_COMMANDS_COMPUTE_SPEC_VERSION".."2"
    )

    StringConstant(
        "NV_DEVICE_GENERATED_COMMANDS_COMPUTE_EXTENSION_NAME".."VK_NV_device_generated_commands_compute"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV".."1000428000",
        "STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV".."1000428001",
        "STRUCTURE_TYPE_PIPELINE_INDIRECT_DEVICE_ADDRESS_INFO_NV".."1000428002"
    )

    EnumConstant(
        "INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NV".."1000428003",
        "INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NV".."1000428004"
    )

    EnumConstant(
        "DESCRIPTOR_SET_LAYOUT_CREATE_INDIRECT_BINDABLE_BIT_NV".enum(0x00000080)
    )

    void(
        "GetPipelineIndirectMemoryRequirementsNV",

        VkDevice("device"),
        VkComputePipelineCreateInfo.const.p("pCreateInfo"),
        VkMemoryRequirements2.p("pMemoryRequirements")
    )

    void(
        "CmdUpdatePipelineIndirectBufferNV",

        VkCommandBuffer("commandBuffer"),
        VkPipelineBindPoint("pipelineBindPoint"),
        VkPipeline("pipeline")
    )

    VkDeviceAddress(
        "GetPipelineIndirectDeviceAddressNV",

        VkDevice("device"),
        VkPipelineIndirectDeviceAddressInfoNV.const.p("pInfo")
    )
}