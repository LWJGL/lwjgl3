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
        The $templateName extension.
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