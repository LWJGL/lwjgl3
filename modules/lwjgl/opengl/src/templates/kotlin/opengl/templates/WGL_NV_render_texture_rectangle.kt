/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val WGL_NV_render_texture_rectangle = "WGLNVRenderTextureRectangle".nativeClassWGL("WGL_NV_render_texture_rectangle", postfix = NV) {
    IntConstant(
        "BIND_TO_TEXTURE_RECTANGLE_RGB_NV"..0x20A0,
        "BIND_TO_TEXTURE_RECTANGLE_RGBA_NV"..0x20A1
    )

    IntConstant(
        "TEXTURE_RECTANGLE_NV"..0x20A2
    )
}