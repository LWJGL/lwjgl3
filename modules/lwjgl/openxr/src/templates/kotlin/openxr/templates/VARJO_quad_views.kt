/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val VARJO_quad_views = "VARJOQuadViews".nativeClassXR("VARJO_quad_views", type = "instance", postfix = "VARJO") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_VARJO_quad_views">XR_VARJO_quad_views</a> extension.

        This extension adds a new view configuration type - #VIEW_CONFIGURATION_TYPE_PRIMARY_QUAD_VARJO to {@code XrViewConfigurationType} which can be returned by #EnumerateViewConfigurations() to indicate that the runtime supports 4 viewports.

        In this configuration each eye consists of two viewports of which one is smaller (in terms of field of view) of the other and fully included inside of the larger FoV one. The small FoV viewport however can have a higher resolution with respect to the same field of view in the outer viewport. The motivation is special hardware which superimposes a smaller, high resolution screen for the fovea region onto a larger screen for the periphery.

        The runtime guarantees that the inner viewport of each eye is fully inside of the outer viewport.

        To enumerate the 4 views #EnumerateViewConfigurationViews() can be used. The first two views (##XrViewConfigurationView) will be for the left and right eyes for the outer viewport. The views 2 and 3 are for the left and right eyes for the inner viewport.

        The relative position of the inner views relative to the outer views can change at run-time.

        The runtime might blend between the views at the edges, so the application should not omit the inner field of view from being generated in the outer view.
        """

    IntConstant(
        "The extension specification version.",

        "VARJO_quad_views_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "VARJO_QUAD_VIEWS_EXTENSION_NAME".."XR_VARJO_quad_views"
    )

    EnumConstant(
        "Extends {@code XrViewConfigurationType}.",

        "VIEW_CONFIGURATION_TYPE_PRIMARY_QUAD_VARJO".."1000037000"
    )
}