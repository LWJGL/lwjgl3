/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_depth_texture_cube_map = "OESDepthTextureCubeMap".nativeClassGLES("OES_depth_texture_cube_map", postfix = OES) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension extends OES_depth_texture and OES_packed_depth_stencil to support depth and depth-stencil cube-map textures.

        Requires ${GLES20.core} and ${OES_depth_texture.registryLink}.
        """

    IntConstant(
        """
        Accepted by the {@code format} parameter of TexImage2D and TexSubImage2D and {@code internalFormat} parameter of TexImage2D when {@code target} is one
        of the TEXTURE_CUBE_MAP_ targets.
        """,

        "DEPTH_STENCIL_OES"..0x84F9
    )

    IntConstant(
        "Accepted by the {@code type} parameter of TexImage2D, TexSubImage2D when {@code target} is one of the TEXTURE_CUBE_MAP_ targets.",

        "DEPTH24_STENCIL8_OES"..0x88F0
    )
}