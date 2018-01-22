/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val EXT_pixel_format_float = "EXTPixelFormatFloat".nativeClassEGL("EXT_pixel_format_float", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extensions aims to provide similar functionality as {@code GL_ARB_color_buffer_float}, {@code WGL_ARB_pixel_format_float} and
        {@code GLX_ARB_fbconfig_float}. This extension allows exposing new {@code EGLConfigs} that support formats with floating-point RGBA components. This is
        done by introducing a new {@code EGLConfig} attribute that represents the component type, i.e. fixed-point or floating-point. Such new
        {@code EGLConfigs} can be used to create floating-point rendering surfaces and contexts.
        """

    IntConstant(
        "Accepted as an attribute name in the {@code attrib_list} argument of #ChooseConfig(), and the {@code attribute} argument of #GetConfigAttrib().",

        "COLOR_COMPONENT_TYPE_EXT"..0x3339
    )

    IntConstant(
        "Accepted as attribute values for the #COLOR_COMPONENT_TYPE_EXT attribute of #ChooseConfig().",

        "COLOR_COMPONENT_TYPE_FIXED_EXT"..0x333A,
        "COLOR_COMPONENT_TYPE_FLOAT_EXT"..0x333B
    )

}