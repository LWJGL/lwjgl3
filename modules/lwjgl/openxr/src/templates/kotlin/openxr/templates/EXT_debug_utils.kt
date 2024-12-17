/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_debug_utils = "EXTDebugUtils".nativeClassXR("EXT_debug_utils", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_debug_utils_SPEC_VERSION".."5"
    )

    StringConstant(
        "EXT_DEBUG_UTILS_EXTENSION_NAME".."XR_EXT_debug_utils"
    )

    EnumConstant(
        "TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT".."1000019000",
        "TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT".."1000019001",
        "TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT".."1000019002",
        "TYPE_DEBUG_UTILS_LABEL_EXT".."1000019003"
    )

    EnumConstant(
        "OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT".."1000019000"
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
        "DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT".enum(0x00000004),
        "DEBUG_UTILS_MESSAGE_TYPE_CONFORMANCE_BIT_EXT".enum(0x00000008)
    )

    XrResult(
        "SetDebugUtilsObjectNameEXT",

        XrInstance("instance"),
        XrDebugUtilsObjectNameInfoEXT.const.p("nameInfo")
    )

    XrResult(
        "CreateDebugUtilsMessengerEXT",

        XrInstance("instance"),
        XrDebugUtilsMessengerCreateInfoEXT.const.p("createInfo"),
        Check(1)..XrDebugUtilsMessengerEXT.p("messenger")
    )

    XrResult(
        "DestroyDebugUtilsMessengerEXT",

        XrDebugUtilsMessengerEXT("messenger")
    )

    XrResult(
        "SubmitDebugUtilsMessageEXT",

        XrInstance("instance"),
        XrDebugUtilsMessageSeverityFlagsEXT("messageSeverity"),
        XrDebugUtilsMessageTypeFlagsEXT("messageTypes"),
        XrDebugUtilsMessengerCallbackDataEXT.const.p("callbackData")
    )

    XrResult(
        "SessionBeginDebugUtilsLabelRegionEXT",

        XrSession("session"),
        XrDebugUtilsLabelEXT.const.p("labelInfo")
    )

    XrResult(
        "SessionEndDebugUtilsLabelRegionEXT",

        XrSession("session")
    )

    XrResult(
        "SessionInsertDebugUtilsLabelEXT",

        XrSession("session"),
        XrDebugUtilsLabelEXT.const.p("labelInfo")
    )
}