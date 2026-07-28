/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_custom_resolve = "EXTCustomResolve".nativeClassVK("EXT_custom_resolve", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_CUSTOM_RESOLVE_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_CUSTOM_RESOLVE_EXTENSION_NAME".."VK_EXT_custom_resolve"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_RESOLVE_FEATURES_EXT".."1000628000",
        "STRUCTURE_TYPE_BEGIN_CUSTOM_RESOLVE_INFO_EXT".."1000628001",
        "STRUCTURE_TYPE_CUSTOM_RESOLVE_CREATE_INFO_EXT".."1000628002"
    )

    EnumConstant(
        "SUBPASS_DESCRIPTION_FRAGMENT_REGION_BIT_EXT".enum(0x00000004),
        "SUBPASS_DESCRIPTION_CUSTOM_RESOLVE_BIT_EXT".enum(0x00000008)
    )

    EnumConstant(
        "RENDERING_FRAGMENT_REGION_BIT_EXT".enum(0x00000040),
        "RENDERING_CUSTOM_RESOLVE_BIT_EXT".enum(0x00000080)
    )

    EnumConstant(
        "RESOLVE_MODE_CUSTOM_BIT_EXT".enum(0x00000020)
    )

    DependsOn("""ext.contains("VK_KHR_dynamic_rendering") || ext.contains("Vulkan13")""")..void(
        "CmdBeginCustomResolveEXT",

        VkCommandBuffer("commandBuffer"),
        nullable..VkBeginCustomResolveInfoEXT.const.p("pBeginCustomResolveInfo")
    )
}