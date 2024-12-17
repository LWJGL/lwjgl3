/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val WGL_ATI_render_texture_rectangle = "WGLATIRenderTextureRectangle".nativeClassWGL("WGL_ATI_render_texture_rectangle", postfix = ATI) {
    IntConstant(
        "TEXTURE_RECTANGLE_ATI"..0x21A5
    )
}