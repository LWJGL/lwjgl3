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

    EnumConstant(
        "DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT".."0",
        "DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT".."1",
        "DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT".."2",
        "DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT".."3",
        "DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT".."4",
        "DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT".."5",
        "DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT".."6",
        "DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT".."7",
        "DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT".."8",
        "DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT".."9",
        "DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT".."10",
        "DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT".."11",
        "DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT".."12",
        "DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT".."13",
        "DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT".."14",
        "DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT".."15",
        "DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT".."16",
        "DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT".."17",
        "DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT".."18",
        "DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT".."19",
        "DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT".."20",
        "DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT".."21",
        "DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT".."22",
        "DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT".."23",
        "DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT".."24",
        "DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT".."25",
        "DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT".."26",
        "DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT".."27",
        "DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT".."28",
        "DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT".."28",
        "DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT".."29",
        "DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT".."30",
        "DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT".."33",
        "DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT".."33"
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