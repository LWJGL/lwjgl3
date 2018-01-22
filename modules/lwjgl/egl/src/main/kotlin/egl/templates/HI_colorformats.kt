/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val HI_colorformats = "HIColorformats".nativeClassEGL("HI_colorformats", postfix = HI) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a mechanism for creating ARGB color-buffers, as opposed to the default RGBA format used by other EGL configurations.
        """

    IntConstant(
        "",

        "COLOR_FORMAT_HI"..0x8F70,
        "COLOR_RGB_HI"..0x8F71,
        "COLOR_RGBA_HI"..0x8F72,
        "COLOR_ARGB_HI"..0x8F73
    )
}