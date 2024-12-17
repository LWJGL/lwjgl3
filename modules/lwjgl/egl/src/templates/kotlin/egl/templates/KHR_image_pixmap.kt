/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_image_pixmap = "KHRImagePixmap".nativeClassEGL("KHR_image_pixmap", postfix = KHR) {
    IntConstant(
        "NATIVE_PIXMAP_KHR"..0x30B0
    )
}