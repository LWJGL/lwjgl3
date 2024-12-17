/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val WGL_NV_render_depth_texture = "WGLNVRenderDepthTexture".nativeClassWGL("WGL_NV_render_depth_texture", postfix = NV) {
    IntConstant(
        "BIND_TO_TEXTURE_DEPTH_NV"..0x20A3,
        "BIND_TO_TEXTURE_RECTANGLE_DEPTH_NV"..0x20A4
    )

    IntConstant(
        "DEPTH_TEXTURE_FORMAT_NV"..0x20A5
    )

    IntConstant(
        "TEXTURE_DEPTH_COMPONENT_NV"..0x20A6,
        "NO_TEXTURE_ARB"..0x2077
    )

    IntConstant(
        "DEPTH_COMPONENT_NV"..0x20A7
    )
}