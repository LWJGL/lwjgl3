/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NOK_texture_from_pixmap = "NOKTextureFromPixmap".nativeClassEGL("NOK_texture_from_pixmap", postfix = NOK) {
    IntConstant(
        "Y_INVERTED_NOK"..0x307F
    )
}