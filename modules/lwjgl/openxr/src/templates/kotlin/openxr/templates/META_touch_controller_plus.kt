/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_touch_controller_plus = "METATouchControllerPlus".nativeClassXR("META_touch_controller_plus", type = "instance", postfix = "META") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_META_touch_controller_plus">XR_META_touch_controller_plus</a> extension.

        This extension defines a new interaction profile for the Meta Quest Touch Plus Controller.

        Meta Quest Touch Plus Controller interaction profile path:

        <ul>
            <li>pathname:/interaction_profiles/meta/touch_controller_plus</li>
        </ul>

        Valid for user paths:

        <ul>
            <li>pathname:/user/hand/left</li>
            <li>pathname:/user/hand/right</li>
        </ul>

        This interaction profile provides inputs and outputs that are a superset of those available in the existing "Oculus Touch Controller" interaction profile, pathname:/interaction_profiles/oculus/touch_controller

        Supported component paths:

        <ul>
            <li>
                On pathname:/user/hand/left only:
                <ul>
                    <li>subpathname:/input/x/click</li>
                    <li>subpathname:/input/x/touch</li>
                    <li>subpathname:/input/y/click</li>
                    <li>subpathname:/input/y/touch</li>
                    <li>subpathname:/input/menu/click</li>
                </ul>
            </li>
            <li>
                On pathname:/user/hand/right only:
                <ul>
                    <li>subpathname:/input/a/click</li>
                    <li>subpathname:/input/a/touch</li>
                    <li>subpathname:/input/b/click</li>
                    <li>subpathname:/input/b/touch</li>
                    <li>subpathname:/input/system/click (<b>may</b> not be available for application use)</li>
                </ul>
            </li>
            <li>
                On both:
                <ul>
                    <li>subpathname:/input/squeeze/value</li>
                    <li>subpathname:/input/trigger/value</li>
                    <li>subpathname:/input/trigger/touch</li>
                    <li>subpathname:/input/thumbstick</li>
                    <li>subpathname:/input/thumbstick/x</li>
                    <li>subpathname:/input/thumbstick/y</li>
                    <li>subpathname:/input/thumbstick/click</li>
                    <li>subpathname:/input/thumbstick/touch</li>
                    <li>subpathname:/input/thumbrest/touch</li>
                    <li>subpathname:/input/grip/pose</li>
                    <li>subpathname:/input/aim/pose</li>
                    <li>subpathname:/output/haptic</li>
                    <li>subpathname:/input/thumb_meta/proximity_meta</li>
                    <li>subpathname:/input/trigger/proximity_meta</li>
                    <li>subpathname:/input/trigger/curl_meta</li>
                    <li>subpathname:/input/trigger/slide_meta</li>
                    <li>subpathname:/input/trigger/force</li>
                </ul>
            </li>
        </ul>
        """

    IntConstant(
        "The extension specification version.",

        "META_touch_controller_plus_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "META_TOUCH_CONTROLLER_PLUS_EXTENSION_NAME".."XR_META_touch_controller_plus"
    )
}