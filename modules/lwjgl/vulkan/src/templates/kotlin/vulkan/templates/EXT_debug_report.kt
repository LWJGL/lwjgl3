/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_debug_report = "EXTDebugReport".nativeClassVK("EXT_debug_report", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_DEBUG_REPORT_SPEC_VERSION".."10"
    )

    StringConstant(
        "EXT_DEBUG_REPORT_EXTENSION_NAME".."VK_EXT_debug_report"
    )

    EnumConstant(
        "STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT".."1000011000",
        "STRUCTURE_TYPE_DEBUG_REPORT_CREATE_INFO_EXT".."1000011000"
    )

    EnumConstant(
        "ERROR_VALIDATION_FAILED_EXT".."-1000011001"
    )

    EnumConstant(
        "OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT".."1000011000"
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
        "DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT".."33",
        "DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT".."1000085000",
        "DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT".."1000156000"
    )

    EnumConstant(
        "DEBUG_REPORT_INFORMATION_BIT_EXT".enum(0x00000001),
        "DEBUG_REPORT_WARNING_BIT_EXT".enum(0x00000002),
        "DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT".enum(0x00000004),
        "DEBUG_REPORT_ERROR_BIT_EXT".enum(0x00000008),
        "DEBUG_REPORT_DEBUG_BIT_EXT".enum(0x00000010)
    )

    VkResult(
        "CreateDebugReportCallbackEXT",

        VkInstance("instance"),
        VkDebugReportCallbackCreateInfoEXT.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkDebugReportCallbackEXT.p("pCallback")
    )

    void(
        "DestroyDebugReportCallbackEXT",

        VkInstance("instance"),
        VkDebugReportCallbackEXT("callback"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    void(
        "DebugReportMessageEXT",

        VkInstance("instance"),
        VkDebugReportFlagsEXT("flags"),
        VkDebugReportObjectTypeEXT("objectType"),
        uint64_t("object"),
        size_t("location"),
        int32_t("messageCode"),
        charUTF8.const.p("pLayerPrefix"),
        charUTF8.const.p("pMessage")
    )
}