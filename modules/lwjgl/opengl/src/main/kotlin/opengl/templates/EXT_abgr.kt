/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_abgr = "EXTABGR".nativeClassGL("EXT_abgr", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        EXT_abgr extends the list of host-memory color formats. Specifically, it provides a reverse-order alternative to image format RGBA. The ABGR component
        order matches the cpack Iris GL format on big-endian machines.
        """

    IntConstant(
        "Accepted by the {@code format} parameter of DrawPixels, GetTexImage, ReadPixels, TexImage1D, and TexImage2D.",

        "ABGR_EXT"..0x8000
    )
}