/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_texture_type_2_10_10_10_REV = "EXTTextureType2101010REV".nativeClassGLES("EXT_texture_type_2_10_10_10_REV", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds a new texture data type, unsigned 2.10.10.10 ABGR, which can be used with RGB or RGBA formats.
        """

    IntConstant(
        "Accepted by the {@code type} parameter of TexImage2D and TexImage3D.",

        "UNSIGNED_INT_2_10_10_10_REV_EXT"..0x8368
    )
}