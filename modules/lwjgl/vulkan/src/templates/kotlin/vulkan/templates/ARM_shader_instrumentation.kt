/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val ARM_shader_instrumentation = "ARMShaderInstrumentation".nativeClassVK("ARM_shader_instrumentation", type = "device", postfix = "ARM") {
    IntConstant(
        "ARM_SHADER_INSTRUMENTATION_SPEC_VERSION".."1"
    )

    StringConstant(
        "ARM_SHADER_INSTRUMENTATION_EXTENSION_NAME".."VK_ARM_shader_instrumentation"
    )

    EnumConstant(
        "OBJECT_TYPE_SHADER_INSTRUMENTATION_ARM".."1000607000"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INSTRUMENTATION_FEATURES_ARM".."1000607000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INSTRUMENTATION_PROPERTIES_ARM".."1000607001",
        "STRUCTURE_TYPE_SHADER_INSTRUMENTATION_CREATE_INFO_ARM".."1000607002",
        "STRUCTURE_TYPE_SHADER_INSTRUMENTATION_METRIC_DESCRIPTION_ARM".."1000607003"
    )

    EnumConstantLong(
        "PIPELINE_CREATE_2_INSTRUMENT_SHADERS_BIT_ARM".enum(0x8000000000L)
    )

    EnumConstant(
        "SHADER_CREATE_INSTRUMENT_SHADER_BIT_ARM".enum(0x00000800)
    )

    VkResult(
        "EnumeratePhysicalDeviceShaderInstrumentationMetricsARM",

        VkPhysicalDevice("physicalDevice"),
        AutoSize("pDescriptions")..Check(1)..uint32_t.p("pDescriptionCount"),
        nullable..VkShaderInstrumentationMetricDescriptionARM.p("pDescriptions")
    )

    VkResult(
        "CreateShaderInstrumentationARM",

        VkDevice("device"),
        VkShaderInstrumentationCreateInfoARM.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkShaderInstrumentationARM.p("pInstrumentation")
    )

    void(
        "DestroyShaderInstrumentationARM",

        VkDevice("device"),
        VkShaderInstrumentationARM("instrumentation"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    void(
        "CmdBeginShaderInstrumentationARM",

        VkCommandBuffer("commandBuffer"),
        VkShaderInstrumentationARM("instrumentation")
    )

    void(
        "CmdEndShaderInstrumentationARM",

        VkCommandBuffer("commandBuffer")
    )

    VkResult(
        "GetShaderInstrumentationValuesARM",

        VkDevice("device"),
        VkShaderInstrumentationARM("instrumentation"),
        Check(1)..uint32_t.p("pMetricBlockCount"),
        Check(1)..void.p("pMetricValues"),
        VkShaderInstrumentationValuesFlagsARM("flags")
    )

    void(
        "ClearShaderInstrumentationMetricsARM",

        VkDevice("device"),
        VkShaderInstrumentationARM("instrumentation")
    )
}