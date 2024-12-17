/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_shader_module_identifier = "EXTShaderModuleIdentifier".nativeClassVK("EXT_shader_module_identifier", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_SHADER_MODULE_IDENTIFIER_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_SHADER_MODULE_IDENTIFIER_EXTENSION_NAME".."VK_EXT_shader_module_identifier"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_FEATURES_EXT".."1000462000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_PROPERTIES_EXT".."1000462001",
        "STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT".."1000462002",
        "STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT".."1000462003"
    )

    EnumConstant(
        "MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT".."32"
    )

    void(
        "GetShaderModuleIdentifierEXT",

        VkDevice("device"),
        VkShaderModule("shaderModule"),
        VkShaderModuleIdentifierEXT.p("pIdentifier")
    )

    void(
        "GetShaderModuleCreateInfoIdentifierEXT",

        VkDevice("device"),
        VkShaderModuleCreateInfo.const.p("pCreateInfo"),
        VkShaderModuleIdentifierEXT.p("pIdentifier")
    )
}