/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_virtual_keyboard = "METAVirtualKeyboard".nativeClassXR("META_virtual_keyboard", type = "instance", postfix = "META") {
    IntConstant(
        "META_virtual_keyboard_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_VIRTUAL_KEYBOARD_EXTENSION_NAME".."XR_META_virtual_keyboard"
    )

    EnumConstant(
        "MAX_VIRTUAL_KEYBOARD_COMMIT_TEXT_SIZE_META".."3992"
    )

    EnumConstant(
        "OBJECT_TYPE_VIRTUAL_KEYBOARD_META".."1000219000"
    )

    EnumConstant(
        "TYPE_SYSTEM_VIRTUAL_KEYBOARD_PROPERTIES_META".."1000219001",
        "TYPE_VIRTUAL_KEYBOARD_CREATE_INFO_META".."1000219002",
        "TYPE_VIRTUAL_KEYBOARD_SPACE_CREATE_INFO_META".."1000219003",
        "TYPE_VIRTUAL_KEYBOARD_LOCATION_INFO_META".."1000219004",
        "TYPE_VIRTUAL_KEYBOARD_MODEL_VISIBILITY_SET_INFO_META".."1000219005",
        "TYPE_VIRTUAL_KEYBOARD_ANIMATION_STATE_META".."1000219006",
        "TYPE_VIRTUAL_KEYBOARD_MODEL_ANIMATION_STATES_META".."1000219007",
        "TYPE_VIRTUAL_KEYBOARD_TEXTURE_DATA_META".."1000219009",
        "TYPE_VIRTUAL_KEYBOARD_INPUT_INFO_META".."1000219010",
        "TYPE_VIRTUAL_KEYBOARD_TEXT_CONTEXT_CHANGE_INFO_META".."1000219011",
        "TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_COMMIT_TEXT_META".."1000219014",
        "TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_BACKSPACE_META".."1000219015",
        "TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_ENTER_META".."1000219016",
        "TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_SHOWN_META".."1000219017",
        "TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_HIDDEN_META".."1000219018"
    )

    EnumConstant(
        "VIRTUAL_KEYBOARD_LOCATION_TYPE_CUSTOM_META".."0",
        "VIRTUAL_KEYBOARD_LOCATION_TYPE_FAR_META".."1",
        "VIRTUAL_KEYBOARD_LOCATION_TYPE_DIRECT_META".."2"
    )

    EnumConstant(
        "VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_RAY_LEFT_META".."1",
        "VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_RAY_RIGHT_META".."2",
        "VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_RAY_LEFT_META".."3",
        "VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_RAY_RIGHT_META".."4",
        "VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_DIRECT_LEFT_META".."5",
        "VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_DIRECT_RIGHT_META".."6",
        "VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_DIRECT_INDEX_TIP_LEFT_META".."7",
        "VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_DIRECT_INDEX_TIP_RIGHT_META".."8"
    )

    EnumConstant(
        "VIRTUAL_KEYBOARD_INPUT_STATE_PRESSED_BIT_META".enum(0x00000001)
    )

    XrResult(
        "CreateVirtualKeyboardMETA",

        XrSession("session"),
        XrVirtualKeyboardCreateInfoMETA.const.p("createInfo"),
        Check(1)..XrVirtualKeyboardMETA.p("keyboard")
    )

    XrResult(
        "DestroyVirtualKeyboardMETA",

        XrVirtualKeyboardMETA("keyboard")
    )

    XrResult(
        "CreateVirtualKeyboardSpaceMETA",

        XrSession("session"),
        XrVirtualKeyboardMETA("keyboard"),
        XrVirtualKeyboardSpaceCreateInfoMETA.const.p("createInfo"),
        Check(1)..XrSpace.p("keyboardSpace")
    )

    XrResult(
        "SuggestVirtualKeyboardLocationMETA",

        XrVirtualKeyboardMETA("keyboard"),
        XrVirtualKeyboardLocationInfoMETA.const.p("locationInfo")
    )

    XrResult(
        "GetVirtualKeyboardScaleMETA",

        XrVirtualKeyboardMETA("keyboard"),
        Check(1)..float.p("scale")
    )

    XrResult(
        "SetVirtualKeyboardModelVisibilityMETA",

        XrVirtualKeyboardMETA("keyboard"),
        XrVirtualKeyboardModelVisibilitySetInfoMETA.const.p("modelVisibility")
    )

    XrResult(
        "GetVirtualKeyboardModelAnimationStatesMETA",

        XrVirtualKeyboardMETA("keyboard"),
        XrVirtualKeyboardModelAnimationStatesMETA.p("animationStates")
    )

    XrResult(
        "GetVirtualKeyboardDirtyTexturesMETA",

        XrVirtualKeyboardMETA("keyboard"),
        AutoSize("textureIds")..uint32_t("textureIdCapacityInput"),
        Check(1)..uint32_t.p("textureIdCountOutput"),
        nullable..uint64_t.p("textureIds")
    )

    XrResult(
        "GetVirtualKeyboardTextureDataMETA",

        XrVirtualKeyboardMETA("keyboard"),
        uint64_t("textureId"),
        XrVirtualKeyboardTextureDataMETA.p("textureData")
    )

    XrResult(
        "SendVirtualKeyboardInputMETA",

        XrVirtualKeyboardMETA("keyboard"),
        XrVirtualKeyboardInputInfoMETA.const.p("info"),
        XrPosef.p("interactorRootPose")
    )

    XrResult(
        "ChangeVirtualKeyboardTextContextMETA",

        XrVirtualKeyboardMETA("keyboard"),
        XrVirtualKeyboardTextContextChangeInfoMETA.const.p("changeInfo")
    )
}