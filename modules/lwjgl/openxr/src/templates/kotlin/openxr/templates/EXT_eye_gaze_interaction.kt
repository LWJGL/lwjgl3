/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_eye_gaze_interaction = "EXTEyeGazeInteraction".nativeClassXR("EXT_eye_gaze_interaction", type = "instance", postfix = "EXT") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_EXT_eye_gaze_interaction">XR_EXT_eye_gaze_interaction</a> extension.

        This extension provides an {@code XrPath} for getting eye gaze input from an eye tracker to enable eye gaze interactions.

        The intended use for this extension is to provide:

        <ul>
            <li>system properties to inform if eye gaze interaction is supported by the current device.</li>
            <li>an {@code XrPath} for real time eye tracking that exposes an accurate and precise eye gaze pose to be used to enable eye gaze interactions.</li>
            <li>a structure ##XrEyeGazeSampleTimeEXT that allows for an application to retrieve more information regarding the eye tracking samples.</li>
        </ul>

        With these building blocks, an application can discover if the XR runtime has access to an eye tracker, bind the eye gaze pose to the action system, determine if the eye tracker is actively tracking the users eye gaze, and use the eye gaze pose as an input signal to build eye gaze interactions.
        """

    IntConstant(
        "The extension specification version.",

        "EXT_eye_gaze_interaction_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "EXT_EYE_GAZE_INTERACTION_EXTENSION_NAME".."XR_EXT_eye_gaze_interaction"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SYSTEM_EYE_GAZE_INTERACTION_PROPERTIES_EXT".."1000030000",
        "TYPE_EYE_GAZE_SAMPLE_TIME_EXT".."1000030001"
    )
}