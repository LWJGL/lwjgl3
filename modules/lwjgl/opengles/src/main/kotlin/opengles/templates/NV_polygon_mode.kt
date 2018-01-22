/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val NV_polygon_mode = "NVPolygonMode".nativeClassGLES("NV_polygon_mode", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds a PolygonModeNV entry point which can be used to change the polygon rasterization method. Using this extension, state consistent
        with rendering triangle primitives can trivially be toggled to render primitives as lines or points. In addition, independent enables are provided for
        polygon offset in conjunction with these new point and line polygon modes.

        This introduces a level of support for PolygonMode comparable with the OpenGL 4.3 core profile.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter to GetIntegerv.",

        "POLYGON_MODE_NV"..0x0B40
    )

    IntConstant(
        "Accepted by the {@code pname} parameter to IsEnabled.",

        "POLYGON_OFFSET_POINT_NV"..0x2A01,
        "POLYGON_OFFSET_LINE_NV"..0x2A02
    )

    IntConstant(
        "Returned by GetIntegerv, GetFloatv, and GetInteger64v when {@code pname} is POLYGON_MODE_NV.",

        "POINT_NV"..0x1B00,
        "LINE_NV"..0x1B01,
        "FILL_NV"..0x1B02
    )

    void(
        "PolygonModeNV",
        "",

        GLenum.IN("face", ""),
        GLenum.IN("mode", "")
    )
}