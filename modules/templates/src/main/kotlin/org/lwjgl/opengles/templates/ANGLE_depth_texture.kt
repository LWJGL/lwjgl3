/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val ANGLE_depth_texture = "ANGLEDepthTexture".nativeClassGLES("ANGLE_depth_texture", postfix = ANGLE) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension defines support for 2D depth and depth-stencil textures in an OpenGL ES implementation.

        This extension incorporates the depth texturing functionality of OES_depth_texture and OES_packed_depth_stencil, but does not provide the ability to
        load existing data via TexImage2D or TexSubImage2D. This extension also allows implementation variability in which components from a sampled depth
        texture contain the depth data. Depth textures created with this extension only support 1 level.

        Requires ${GLES20.core}.
        """

    IntConstant(
        "Accepted by the {@code format} parameter of TexImage2D and TexSubImage2D and {@code internalformat} parameter of TexImage2D.",

        "DEPTH_STENCIL_OES"..0x84F9
    )

    IntConstant(
        "Accepted by the {@code type} parameter of TexImage2D, TexSubImage2D.",

        "UNSIGNED_INT_24_8_OES"..0x84FA
    )

    IntConstant(
        "Accepted by the {@code internalformat} parameter of TexStorage2DEXT.",

        "DEPTH_COMPONENT32_OES"..0x81A7,
        "DEPTH24_STENCIL8_OES"..0x88F0
    )
}