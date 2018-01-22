/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_read_format_bgra = "EXTReadFormatBGRA".nativeClassGLES("EXT_read_format_bgra", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension is intended to supplement the GL_OES_read_format extension by adding support for more format/type combinations to be used when calling
        ReadPixels. ReadPixels currently accepts one fixed format/type combination (format RGBA and type UNSIGNED_BYTE) for portability, and an implementation
        specific format/type combination queried using the tokens IMPLEMENTATION_COLOR_READ_FORMAT_OES and IMPLEMENTATION_COLOR_READ_TYPE_OES
        (GL_OES_read_format extension). This extension adds the following format/type combinations to those currently allowed to be returned by GetIntegerV:
        ${codeBlock("""
    format                      type
    ------                      ----
    BGRA_EXT                    UNSIGNED_BYTE
    BGRA_EXT                    UNSIGNED_SHORT_4_4_4_4_REV_EXT
    BGRA_EXT                    UNSIGNED_SHORT_1_5_5_5_REV_EXT""")}
        E.g. Calling GetIntegerv with a {@code pname} parameter of IMPLEMENTATION_COLOR_READ_FORMAT_OES can now return BGRA_EXT, with the corresponding call to
        GetIntegerv using a {@code pname} parameter of IMPLEMENTATION_COLOR_READ_TYPE_OES returning UNSIGNED_BYTE;
        """

    IntConstant(
        "Accepted by the {@code format} parameter of ReadPixels.",

        "BGRA_EXT"..0x80E1
    )

    IntConstant(
        "Accepted by the {@code type} parameter of ReadPixels.",

        "UNSIGNED_SHORT_4_4_4_4_REV_EXT"..0x8365,
        "UNSIGNED_SHORT_1_5_5_5_REV_EXT"..0x8366
    )
}