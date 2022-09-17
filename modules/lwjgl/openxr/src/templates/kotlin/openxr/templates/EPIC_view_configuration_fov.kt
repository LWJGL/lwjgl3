/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EPIC_view_configuration_fov = "EPICViewConfigurationFov".nativeClassXR("EPIC_view_configuration_fov", type = "instance", postfix = "EPIC") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_EPIC_view_configuration_fov">XR_EPIC_view_configuration_fov</a> extension.

        This extension allows the application to retrieve the recommended and maximum field-of-view using #EnumerateViewConfigurationViews(). These field-of-view parameters can be used during initialization of the application before creating a session.

        The field-of-view given here <b>should</b> not be used for rendering, see #LocateViews() to retrieve the field-of-view for rendering.

        For views with {@code fovMutable} set to {@code XR_TRUE} the maximum field-of-view <b>should</b> specify the upper limit that runtime can support. If the view has {@code fovMutable} set to {@code XR_FALSE} the runtime <b>must</b> set {@code maxMutableFov} to be the same as {@code recommendedFov}.
        """

    IntConstant(
        "The extension specification version.",

        "EPIC_view_configuration_fov_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "EPIC_VIEW_CONFIGURATION_FOV_EXTENSION_NAME".."XR_EPIC_view_configuration_fov"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_VIEW_CONFIGURATION_VIEW_FOV_EPIC".."1000059000"
    )
}