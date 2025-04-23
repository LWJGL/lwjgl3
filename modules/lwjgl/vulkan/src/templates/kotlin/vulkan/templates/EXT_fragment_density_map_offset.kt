/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_fragment_density_map_offset = "EXTFragmentDensityMapOffset".nativeClassVK("EXT_fragment_density_map_offset", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_FRAGMENT_DENSITY_MAP_OFFSET_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_FRAGMENT_DENSITY_MAP_OFFSET_EXTENSION_NAME".."VK_EXT_fragment_density_map_offset"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_EXT".."1000425000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_PROPERTIES_EXT".."1000425001",
        "STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_EXT".."1000425002",
        "STRUCTURE_TYPE_RENDERING_END_INFO_EXT".."1000619003"
    )

    EnumConstant(
        "IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_EXT".enum(0x00008000)
    )

    void(
        "CmdEndRendering2EXT",

        VkCommandBuffer("commandBuffer"),
        nullable..VkRenderingEndInfoEXT.const.p("pRenderingEndInfo")
    )
}