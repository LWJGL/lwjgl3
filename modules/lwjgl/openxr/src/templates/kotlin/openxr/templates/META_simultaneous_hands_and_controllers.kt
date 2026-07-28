/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_simultaneous_hands_and_controllers = "METASimultaneousHandsAndControllers".nativeClassXR("META_simultaneous_hands_and_controllers", type = "instance", postfix = "META") {
    IntConstant(
        "META_simultaneous_hands_and_controllers_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_SIMULTANEOUS_HANDS_AND_CONTROLLERS_EXTENSION_NAME".."XR_META_simultaneous_hands_and_controllers"
    )

    EnumConstant(
        "TYPE_SYSTEM_SIMULTANEOUS_HANDS_AND_CONTROLLERS_PROPERTIES_META".."1000532001",
        "TYPE_SIMULTANEOUS_HANDS_AND_CONTROLLERS_TRACKING_RESUME_INFO_META".."1000532002",
        "TYPE_SIMULTANEOUS_HANDS_AND_CONTROLLERS_TRACKING_PAUSE_INFO_META".."1000532003"
    )

    XrResult(
        "ResumeSimultaneousHandsAndControllersTrackingMETA",

        XrSession("session"),
        XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.const.p("resumeInfo")
    )

    XrResult(
        "PauseSimultaneousHandsAndControllersTrackingMETA",

        XrSession("session"),
        XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.const.p("pauseInfo")
    )
}