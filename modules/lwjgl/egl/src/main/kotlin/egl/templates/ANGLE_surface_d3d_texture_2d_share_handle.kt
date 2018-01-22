/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val ANGLE_surface_d3d_texture_2d_share_handle = "ANGLESurfaceD3DTexture2DShareHandle".nativeClassEGL("ANGLE_surface_d3d_texture_2d_share_handle", postfix = ANGLE) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Some EGL implementations generate EGLSurface handles that are backed by Direct3D 2D textures. For such surfaces, a D3D share handle can be generated,
        allowing access to the same surface from the Direct3D API.

        Requires ${ANGLE_query_surface_pointer.link}.
        """

    IntConstant(
        "",

        "D3D_TEXTURE_2D_SHARE_HANDLE_ANGLE"..0x3200
    )
}