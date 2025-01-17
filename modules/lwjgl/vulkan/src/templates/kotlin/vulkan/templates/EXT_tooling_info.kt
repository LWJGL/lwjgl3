/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_tooling_info = "EXTToolingInfo".nativeClassVK("EXT_tooling_info", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_TOOLING_INFO_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_TOOLING_INFO_EXTENSION_NAME".."VK_EXT_tooling_info"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES_EXT".."1000245000"
    )

    EnumConstant(
        "TOOL_PURPOSE_VALIDATION_BIT_EXT".enum(0x00000001),
        "TOOL_PURPOSE_PROFILING_BIT_EXT".enum(0x00000002),
        "TOOL_PURPOSE_TRACING_BIT_EXT".enum(0x00000004),
        "TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT_EXT".enum(0x00000008),
        "TOOL_PURPOSE_MODIFYING_FEATURES_BIT_EXT".enum(0x00000010),
        "TOOL_PURPOSE_DEBUG_REPORTING_BIT_EXT".enum(0x00000020),
        "TOOL_PURPOSE_DEBUG_MARKERS_BIT_EXT".enum(0x00000040)
    )

    VkResult(
        "GetPhysicalDeviceToolPropertiesEXT",

        VkPhysicalDevice("physicalDevice"),
        AutoSize("pToolProperties")..Check(1)..uint32_t.p("pToolCount"),
        nullable..VkPhysicalDeviceToolProperties.p("pToolProperties")
    )
}