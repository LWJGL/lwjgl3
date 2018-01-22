/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val KHR_image_pixmap = "KHRImagePixmap".nativeClassEGL("KHR_image_pixmap", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows creating an EGLImage from a native pixmap image.

        Requires ${EGL12.core} and ${KHR_image_base.link}.
        """

    IntConstant(
        "",

        "NATIVE_PIXMAP_KHR"..0x30B0
    )
}