/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_shader_info = "AMDShaderInfo".nativeClassVK("AMD_shader_info", type = "device", postfix = "AMD") {
    IntConstant(
        "AMD_SHADER_INFO_SPEC_VERSION".."1"
    )

    StringConstant(
        "AMD_SHADER_INFO_EXTENSION_NAME".."VK_AMD_shader_info"
    )

    EnumConstant(
        "SHADER_INFO_TYPE_STATISTICS_AMD".."0",
        "SHADER_INFO_TYPE_BINARY_AMD".."1",
        "SHADER_INFO_TYPE_DISASSEMBLY_AMD".."2"
    )

    VkResult(
        "GetShaderInfoAMD",

        VkDevice("device"),
        VkPipeline("pipeline"),
        VkShaderStageFlagBits("shaderStage"),
        VkShaderInfoTypeAMD("infoType"),
        AutoSize("pInfo")..Check(1)..size_t.p("pInfoSize"),
        nullable..void.p("pInfo")
    )
}