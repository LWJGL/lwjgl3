/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val KHR_image = "KHRImage".nativeClassEGL("KHR_image", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension defines a new EGL resource type that is suitable for sharing 2D arrays of image data between client APIs, the EGLImage, and allows
        creating EGLImages from EGL native pixmaps.

        Requires ${EGL12.core}.
        """

    IntConstant(
        "",

        "NATIVE_PIXMAP_KHR"..0x30B0
    )

    LongConstant(
        "",

        "NO_IMAGE_KHR"..0L
    )

    KHR_image_base reuse "CreateImageKHR"
    KHR_image_base reuse "DestroyImageKHR"
}