/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val GLX_EXT_visual_info = "GLXEXTVisualInfo".nativeClassGLX("GLX_EXT_visual_info", EXT) {
    documentation =
        """
        Native bindings to the ${registryLink("EXT", "visual_rating")} extension.

        This extension allows the user to request a particular X visual type to be associated with a GLX visual, and allows the user to query the X visual type
        underlying a GLX visual.

        In addition, this extension provides a means to request a visual with a transparent pixel and to query whether a visual supports a transparent pixel
        value and the value of the transparent pixel. Note that the notion of level and transparent pixels are orthogonal as both layer 1 and layer 0 visuals
        may or may not have a transparent pixel value.
        """

    IntConstant(
        "Accepted by the {@code attrib} parameter of #GetConfig(), and by the {@code attrib_list} parameter of #ChooseVisual().",

        "X_VISUAL_TYPE_EXT"..0x22,
        "TRANSPARENT_TYPE_EXT"..0x23,
        "TRANSPARENT_INDEX_VALUE_EXT"..0x24,
        "TRANSPARENT_RED_VALUE_EXT"..0x25,
        "TRANSPARENT_GREEN_VALUE_EXT"..0x26,
        "TRANSPARENT_BLUE_VALUE_EXT"..0x27,
        "TRANSPARENT_ALPHA_VALUE_EXT"..0x28
    )

    IntConstant(
        """
        Returned by #GetConfig(), and accepted by the {@code attrib_list} parameter of #ChooseVisual() (following the
        #X_VISUAL_TYPE_EXT token).
        """,

        "TRUE_COLOR_EXT"..0x8002,
        "DIRECT_COLOR_EXT"..0x8003,
        "PSEUDO_COLOR_EXT"..0x8004,
        "STATIC_COLOR_EXT"..0x8005,
        "GRAY_SCALE_EXT"..0x8006,
        "STATIC_GRAY_EXT"..0x8007
    )

    IntConstant(
        """
        Returned by #GetConfig(), and accepted by the {@code attrib_list} parameter of #ChooseVisual() (following the
        #TRANSPARENT_TYPE_EXT token).
        """,

        "NONE_EXT"..0x8000,
        "TRANSPARENT_RGB_EXT"..0x8008,
        "TRANSPARENT_INDEX_EXT"..0x8009
    )

}