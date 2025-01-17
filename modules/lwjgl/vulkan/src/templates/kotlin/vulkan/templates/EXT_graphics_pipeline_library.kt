/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_graphics_pipeline_library = "EXTGraphicsPipelineLibrary".nativeClassVK("EXT_graphics_pipeline_library", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_GRAPHICS_PIPELINE_LIBRARY_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_GRAPHICS_PIPELINE_LIBRARY_EXTENSION_NAME".."VK_EXT_graphics_pipeline_library"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_FEATURES_EXT".."1000320000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_PROPERTIES_EXT".."1000320001",
        "STRUCTURE_TYPE_GRAPHICS_PIPELINE_LIBRARY_CREATE_INFO_EXT".."1000320002"
    )

    EnumConstant(
        "PIPELINE_CREATE_LINK_TIME_OPTIMIZATION_BIT_EXT".enum(0x00000400),
        "PIPELINE_CREATE_RETAIN_LINK_TIME_OPTIMIZATION_INFO_BIT_EXT".enum(0x00800000)
    )

    EnumConstant(
        "PIPELINE_LAYOUT_CREATE_INDEPENDENT_SETS_BIT_EXT".enum(0x00000002)
    )

    EnumConstant(
        "GRAPHICS_PIPELINE_LIBRARY_VERTEX_INPUT_INTERFACE_BIT_EXT".enum(0x00000001),
        "GRAPHICS_PIPELINE_LIBRARY_PRE_RASTERIZATION_SHADERS_BIT_EXT".enum(0x00000002),
        "GRAPHICS_PIPELINE_LIBRARY_FRAGMENT_SHADER_BIT_EXT".enum(0x00000004),
        "GRAPHICS_PIPELINE_LIBRARY_FRAGMENT_OUTPUT_INTERFACE_BIT_EXT".enum(0x00000008)
    )
}