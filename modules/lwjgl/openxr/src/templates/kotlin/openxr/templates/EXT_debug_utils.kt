/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_debug_utils = "EXTDebugUtils".nativeClassXR("EXT_debug_utils", type = "instance", postfix = EXT) {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "EXT_debug_utils_SPEC_VERSION".."3"
    )

    StringConstant(
        "The extension name.",

        "EXT_DEBUG_UTILS_EXTENSION_NAME".."XR_EXT_debug_utils"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT".."1000019000",
        "TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT".."1000019001",
        "TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT".."1000019002",
        "TYPE_DEBUG_UTILS_LABEL_EXT".."1000019003"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT".."1000019000"
    )

    XrResult(
        "SetDebugUtilsObjectNameEXT",
        "",

        XrInstance("instance", ""),
        XrDebugUtilsObjectNameInfoEXT.const.p("nameInfo", "")
    )

    XrResult(
        "CreateDebugUtilsMessengerEXT",
        "",

        XrInstance("instance", ""),
        XrDebugUtilsMessengerCreateInfoEXT.const.p("createInfo", ""),
        Check(1)..XrDebugUtilsMessengerEXT.p("messenger", "")
    )

    XrResult(
        "DestroyDebugUtilsMessengerEXT",
        "",

        XrDebugUtilsMessengerEXT("messenger", "")
    )

    XrResult(
        "SubmitDebugUtilsMessageEXT",
        "",

        XrInstance("instance", ""),
        XrDebugUtilsMessageSeverityFlagsEXT("messageSeverity", ""),
        XrDebugUtilsMessageTypeFlagsEXT("messageTypes", ""),
        XrDebugUtilsMessengerCallbackDataEXT.const.p("callbackData", "")
    )

    XrResult(
        "SessionBeginDebugUtilsLabelRegionEXT",
        "",

        XrSession("session", ""),
        XrDebugUtilsLabelEXT.const.p("labelInfo", "")
    )

    XrResult(
        "SessionEndDebugUtilsLabelRegionEXT",
        "",

        XrSession("session", "")
    )

    XrResult(
        "SessionInsertDebugUtilsLabelEXT",
        "",

        XrSession("session", ""),
        XrDebugUtilsLabelEXT.const.p("labelInfo", "")
    )
}