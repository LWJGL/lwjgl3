/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GLX_EXT_visual_info = "GLXEXTVisualInfo".nativeClassGLX("GLX_EXT_visual_info", EXT) {
    IntConstant(
        "X_VISUAL_TYPE_EXT"..0x22,
        "TRANSPARENT_TYPE_EXT"..0x23,
        "TRANSPARENT_INDEX_VALUE_EXT"..0x24,
        "TRANSPARENT_RED_VALUE_EXT"..0x25,
        "TRANSPARENT_GREEN_VALUE_EXT"..0x26,
        "TRANSPARENT_BLUE_VALUE_EXT"..0x27,
        "TRANSPARENT_ALPHA_VALUE_EXT"..0x28
    )

    IntConstant(
        "TRUE_COLOR_EXT"..0x8002,
        "DIRECT_COLOR_EXT"..0x8003,
        "PSEUDO_COLOR_EXT"..0x8004,
        "STATIC_COLOR_EXT"..0x8005,
        "GRAY_SCALE_EXT"..0x8006,
        "STATIC_GRAY_EXT"..0x8007
    )

    IntConstant(
        "NONE_EXT"..0x8000,
        "TRANSPARENT_RGB_EXT"..0x8008,
        "TRANSPARENT_INDEX_EXT"..0x8009
    )

}