/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val WGL_EXT_depth_float = "WGLEXTDepthFloat".nativeClassWGL("WGL_EXT_depth_float", postfix = EXT) {
    IntConstant(
        "DEPTH_FLOAT_EXT"..0x2040
    )
}