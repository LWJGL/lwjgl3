/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val ANGLE_surface_d3d_texture_2d_share_handle = "ANGLESurfaceD3DTexture2DShareHandle".nativeClassEGL("ANGLE_surface_d3d_texture_2d_share_handle", postfix = ANGLE) {
    IntConstant(
        "D3D_TEXTURE_2D_SHARE_HANDLE_ANGLE"..0x3200
    )
}