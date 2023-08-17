/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_touch_controller_proximity = "FBTouchControllerProximity".nativeClassXR("FB_touch_controller_proximity", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_touch_controller_proximity">XR_FB_touch_controller_proximity</a> extension.

        This extension introduces a new component path, proximity_fb, and adds support for it for the pathname:/interaction_profiles/oculus/touch_controller interaction profile.
        """

    IntConstant(
        "The extension specification version.",

        "FB_touch_controller_proximity_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_TOUCH_CONTROLLER_PROXIMITY_EXTENSION_NAME".."XR_FB_touch_controller_proximity"
    )
}