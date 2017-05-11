/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val WGL_EXT_colorspace = "WGLEXTColorspace".nativeClassWGL("WGL_EXT_colorspace", EXT) {
    documentation =
        """
        Native bindings to the ${registryLink("EXT", "wgl_colorspace")} extension.

        Applications may wish to use sRGB format default framebuffers to more easily achieve sRGB rendering to display devices. This extension allows creating
        pixel formats which will be rendered to in sRGB by OpenGL/ES contexts supporting that capability.

        Requires ${GL30.core}.
        """

    IntConstant(
        "Accepted as an attribute name by #GetPixelFormatAttribivARB(), #GetPixelFormatAttribivARB() and #ChoosePixelFormatARB().",

        "COLORSPACE_EXT"..0x309D
    )

    IntConstant(
        "Accepted as attribute values for #COLORSPACE_EXT by #GetPixelFormatAttribivARB(), #GetPixelFormatAttribivARB() and #ChoosePixelFormatARB().",

        "COLORSPACE_SRGB_EXT"..0x3089,
        "COLORSPACE_LINEAR_EXT"..0x308A
    )
}