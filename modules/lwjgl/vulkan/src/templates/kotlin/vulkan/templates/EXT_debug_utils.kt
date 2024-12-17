/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_debug_utils = "EXTDebugUtils".nativeClassVK("EXT_debug_utils", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_DEBUG_UTILS_SPEC_VERSION".."2"
    )

    StringConstant(
        "EXT_DEBUG_UTILS_EXTENSION_NAME".."VK_EXT_debug_utils"
    )

    EnumConstant(
        "STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT".."1000128000",
        "STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT".."1000128001",
        "STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT".."1000128002",
        "STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT".."1000128003",
        "STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT".."1000128004"
    )

    EnumConstant(
        "OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT".."1000128000"
    )

    EnumConstant(
        "DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT".enum(0x00000001),
        "DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT".enum(0x00000010),
        "DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT".enum(0x00000100),
        "DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT".enum(0x00001000)
    )

    EnumConstant(
        "DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT".enum(0x00000001),
        "DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT".enum(0x00000002),
        "DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT".enum(0x00000004)
    )

    VkResult(
        "SetDebugUtilsObjectNameEXT",

        VkDevice("device"),
        VkDebugUtilsObjectNameInfoEXT.const.p("pNameInfo")
    )

    VkResult(
        "SetDebugUtilsObjectTagEXT",

        VkDevice("device"),
        VkDebugUtilsObjectTagInfoEXT.const.p("pTagInfo")
    )

    void(
        "QueueBeginDebugUtilsLabelEXT",

        VkQueue("queue"),
        VkDebugUtilsLabelEXT.const.p("pLabelInfo")
    )

    void(
        "QueueEndDebugUtilsLabelEXT",

        VkQueue("queue")
    )

    void(
        "QueueInsertDebugUtilsLabelEXT",

        VkQueue("queue"),
        VkDebugUtilsLabelEXT.const.p("pLabelInfo")
    )

    void(
        "CmdBeginDebugUtilsLabelEXT",

        VkCommandBuffer("commandBuffer"),
        VkDebugUtilsLabelEXT.const.p("pLabelInfo")
    )

    void(
        "CmdEndDebugUtilsLabelEXT",

        VkCommandBuffer("commandBuffer")
    )

    void(
        "CmdInsertDebugUtilsLabelEXT",

        VkCommandBuffer("commandBuffer"),
        VkDebugUtilsLabelEXT.const.p("pLabelInfo")
    )

    VkResult(
        "CreateDebugUtilsMessengerEXT",

        VkInstance("instance"),
        VkDebugUtilsMessengerCreateInfoEXT.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkDebugUtilsMessengerEXT.p("pMessenger")
    )

    void(
        "DestroyDebugUtilsMessengerEXT",

        VkInstance("instance"),
        VkDebugUtilsMessengerEXT("messenger"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    void(
        "SubmitDebugUtilsMessageEXT",

        VkInstance("instance"),
        VkDebugUtilsMessageSeverityFlagBitsEXT("messageSeverity"),
        VkDebugUtilsMessageTypeFlagsEXT("messageTypes"),
        VkDebugUtilsMessengerCallbackDataEXT.const.p("pCallbackData")
    )
}