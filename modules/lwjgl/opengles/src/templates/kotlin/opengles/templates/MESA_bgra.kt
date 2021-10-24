/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val MESA_bgra = "MESABGRA".nativeClassGLES("MESA_bgra", postfix = MESA) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        {@code MESA_bgra} extends the list of combinations host-memory color formats with internal formats to include {@code BGRA} and {@code BGR} as
        acceptable formats with {@code RGB8/SRGB8} and {@code RGBA/sRGB8_ALPHA8} as internal formats respectively. This feature is of interest in virtualized
        environments, where the host supports OpenGL ES only, and the virtualized guest is supposed to support a subset of OpenGL including textures created
        with the format {@code BGRA}.
        """

    IntConstant(
        "Accepted by the {@code format} parameter of TexImage2D and TexSubImage2D.",

        "BGR_EXT"..0x80E0,
        "BGRA_EXT"..0x80E1
    )
}