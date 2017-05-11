/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_texture_format_BGRA8888 = "EXTTextureFormatBGRA8888".nativeClassGLES("EXT_texture_format_BGRA8888", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides an additional format and type combination for use when specifying texture data.  The current allowed combinations are:
        ${codeBlock("""
    Internal Format     External Format Type                    Bytes per Pixel
    ---------------     --------------- ----                    ---------------
    RGBA                RGBA             UNSIGNED_BYTE          4
    RGB                 RGB              UNSIGNED_BYTE          3
    RGBA                RGBA             UNSIGNED_SHORT_4_4_4_4 2
    RGBA                RGBA             UNSIGNED_SHORT_5_5_5_1 2
    RGB                 RGB              UNSIGNED_SHORT_5_6_5   2
    LUMINANCE_ALPHA     LUMINANCE_ALPHA  UNSIGNED_BYTE          2
    LUMINANCE           LUMINANCE        UNSIGNED_BYTE          1
    ALPHA               ALPHA            UNSIGNED_BYTE          1""")}

        This table is extended to include format BGRA_EXT and type UNSIGNED_BYTE:
        ${codeBlock("""
Internal Format     External Format Type                    Bytes per Pixel
---------------     --------------- ----                    ---------------
BGRA_EXT            BGRA_EXT        UNSIGNED_BYTE           4
RGBA                RGBA            UNSIGNED_BYTE           4
RGB                 RGB             UNSIGNED_BYTE           3
RGBA                RGBA            UNSIGNED_SHORT_4_4_4_4  2
RGBA                RGBA            UNSIGNED_SHORT_5_5_5_1  2
RGB                 RGB             UNSIGNED_SHORT_5_6_5    2
LUMINANCE_ALPHA     LUMINANCE_ALPHA UNSIGNED_BYTE           2
LUMINANCE           LUMINANCE       UNSIGNED_BYTE           1
ALPHA               ALPHA           UNSIGNED_BYTE           1""")}
        """

    IntConstant(
        "Accepted by the {@code format} and {@code internalformat} parameters of TexImage2D and the {@code format} parameter of TexSubImage2D.",

        "BGRA_EXT"..0x80E1
    )
}