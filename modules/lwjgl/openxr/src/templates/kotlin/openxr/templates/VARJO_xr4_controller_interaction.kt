/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val VARJO_xr4_controller_interaction = "VARJOXr4ControllerInteraction".nativeClassXR("VARJO_xr4_controller_interaction", type = "instance", postfix = "VARJO") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html\#XR_VARJO_xr4_controller_interaction">XR_VARJO_xr4_controller_interaction</a> extension.

        This extension adds a new interaction profile for the Varjo Controllers compatible with the Varjo XR-4 headset.

        Interaction profile path:

        <ul>
            <li>pathname:/interaction_profiles/varjo/xr-4_controller</li>
        </ul>

        Valid for the user paths:

        <ul>
            <li>pathname:/user/hand/left</li>
            <li>pathname:/user/hand/right</li>
        </ul>

        Supported component paths for pathname:/user/hand/left only:

        <ul>
            <li>subpathname:/input/menu/click</li>
        </ul>

        Supported component paths for pathname:/user/hand/right only:

        <ul>
            <li>subpathname:/input/system/click (<b>may</b> not be available for application use)</li>
        </ul>

        Supported component paths on both pathnames:

        <ul>
            <li>subpathname:/input/a/click</li>
            <li>subpathname:/input/a/touch</li>
            <li>subpathname:/input/b/click</li>
            <li>subpathname:/input/b/touch</li>
            <li>subpathname:/input/squeeze/click</li>
            <li>subpathname:/input/squeeze/touch</li>
            <li>subpathname:/input/trigger/value</li>
            <li>subpathname:/input/trigger/touch</li>
            <li>subpathname:/input/thumbstick/x</li>
            <li>subpathname:/input/thumbstick/y</li>
            <li>subpathname:/input/thumbstick/click</li>
            <li>subpathname:/input/thumbstick/touch</li>
            <li>subpathname:/input/grip/pose</li>
            <li>subpathname:/input/aim/pose</li>
            <li>subpathname:/output/haptic</li>
        </ul>
        """

    IntConstant(
        "The extension specification version.",

        "VARJO_xr4_controller_interaction_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "VARJO_XR4_CONTROLLER_INTERACTION_EXTENSION_NAME".."XR_VARJO_xr4_controller_interaction"
    )
}