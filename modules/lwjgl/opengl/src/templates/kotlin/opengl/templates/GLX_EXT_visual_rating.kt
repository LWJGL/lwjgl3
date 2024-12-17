/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GLX_EXT_visual_rating = "GLXEXTVisualRating".nativeClassGLX("GLX_EXT_visual_rating", EXT) {
    IntConstant(
        "VISUAL_CAVEAT_EXT"..0x20
    )

    IntConstant(
        "NONE_EXT"..0x8000,
        "SLOW_VISUAL_EXT"..0x8001,
        "NON_CONFORMANT_VISUAL_EXT"..0x800D
    )

}