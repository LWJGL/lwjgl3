/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_unpack_subimage = "EXTUnpackSubimage".nativeClassGLES("EXT_unpack_subimage", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This OpenGL ES 2.0 extension adds support for GL_UNPACK_ROW_LENGTH, GL_UNPACK_SKIP_ROWS and GL_UNPACK_SKIP_PIXELS as valid enums to PixelStore. The
        functionality is the same as in OpenGL. These are useful for updating textures with a sub-rectangle of pixel data coming from a larger image in host
        memory.
        """

    IntConstant(
        "Accepted by the {@code pname} parameters of PixelStorei, GetIntegerv, and GetFloatv.",

        "UNPACK_ROW_LENGTH_EXT"..0x0CF2,
        "UNPACK_SKIP_ROWS_EXT"..0x0CF3,
        "UNPACK_SKIP_PIXELS_EXT"..0x0CF4
    )
}