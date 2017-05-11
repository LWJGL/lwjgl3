/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_bgra = "EXTBGRA".nativeClassGL("EXT_bgra", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        EXT_bgra extends the list of host-memory color formats. Specifically, it provides formats which match the memory layout of Windows DIBs so that
        applications can use the same data in both Windows API calls and OpenGL pixel API calls.

        ${GL12.promoted}
        """

    IntConstant(
        "Accepted by the {@code format} parameter of DrawPixels, GetTexImage, ReadPixels, TexImage1D, and TexImage2D.",

        "BGR_EXT"..0x80E0,
        "BGRA_EXT"..0x80E1
    )
}