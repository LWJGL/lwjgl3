/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_conformance_automation = "EXTConformanceAutomation".nativeClassXR("EXT_conformance_automation", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_conformance_automation_SPEC_VERSION".."3"
    )

    StringConstant(
        "EXT_CONFORMANCE_AUTOMATION_EXTENSION_NAME".."XR_EXT_conformance_automation"
    )

    XrResult(
        "SetInputDeviceActiveEXT",

        XrSession("session"),
        XrPath("interactionProfile"),
        XrPath("topLevelPath"),
        XrBool32("isActive")
    )

    XrResult(
        "SetInputDeviceStateBoolEXT",

        XrSession("session"),
        XrPath("topLevelPath"),
        XrPath("inputSourcePath"),
        XrBool32("state")
    )

    XrResult(
        "SetInputDeviceStateFloatEXT",

        XrSession("session"),
        XrPath("topLevelPath"),
        XrPath("inputSourcePath"),
        float("state")
    )

    XrResult(
        "SetInputDeviceStateVector2fEXT",

        XrSession("session"),
        XrPath("topLevelPath"),
        XrPath("inputSourcePath"),
        XrVector2f("state")
    )

    XrResult(
        "SetInputDeviceLocationEXT",

        XrSession("session"),
        XrPath("topLevelPath"),
        XrPath("inputSourcePath"),
        XrSpace("space"),
        XrPosef("pose")
    )
}