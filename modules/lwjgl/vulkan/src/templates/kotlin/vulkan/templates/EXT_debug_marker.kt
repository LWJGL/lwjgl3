/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_debug_marker = "EXTDebugMarker".nativeClassVK("EXT_debug_marker", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_DEBUG_MARKER_SPEC_VERSION".."4"
    )

    StringConstant(
        "EXT_DEBUG_MARKER_EXTENSION_NAME".."VK_EXT_debug_marker"
    )

    EnumConstant(
        "STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT".."1000022000",
        "STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT".."1000022001",
        "STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT".."1000022002"
    )

    VkResult(
        "DebugMarkerSetObjectTagEXT",

        VkDevice("device"),
        VkDebugMarkerObjectTagInfoEXT.const.p("pTagInfo")
    )

    VkResult(
        "DebugMarkerSetObjectNameEXT",

        VkDevice("device"),
        VkDebugMarkerObjectNameInfoEXT.const.p("pNameInfo")
    )

    void(
        "CmdDebugMarkerBeginEXT",

        VkCommandBuffer("commandBuffer"),
        VkDebugMarkerMarkerInfoEXT.const.p("pMarkerInfo")
    )

    void(
        "CmdDebugMarkerEndEXT",

        VkCommandBuffer("commandBuffer")
    )

    void(
        "CmdDebugMarkerInsertEXT",

        VkCommandBuffer("commandBuffer"),
        VkDebugMarkerMarkerInfoEXT.const.p("pMarkerInfo")
    )
}