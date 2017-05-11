/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val ANGLE_d3d_share_handle_client_buffer = "ANGLED3DShareHandleClientBuffer".nativeClassEGL("ANGLE_d3d_share_handle_client_buffer", postfix = ANGLE) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows creating EGL surfaces from handles to textures shared from the Direct3D API or from EGL_ANGLE_surface_texture_2d_share_handle.

        Requires ${ANGLE_surface_d3d_texture_2d_share_handle.link}.
        """

    IntConstant(
        "",

        "D3D_TEXTURE_2D_SHARE_HANDLE_ANGLE"..0x3200
    )
}