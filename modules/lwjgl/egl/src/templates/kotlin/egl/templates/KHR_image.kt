/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_image = "KHRImage".nativeClassEGL("KHR_image", postfix = KHR) {
    IntConstant(
        "NATIVE_PIXMAP_KHR"..0x30B0
    )

    LongConstant(
        "NO_IMAGE_KHR"..0L
    )

    reuse(KHR_image_base, "CreateImageKHR")
    reuse(KHR_image_base, "DestroyImageKHR")
}