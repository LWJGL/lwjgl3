/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_protected_surface = "EXTProtectedSurface".nativeClassEGL("EXT_protected_surface", postfix = EXT) {
    IntConstant(
        "PROTECTED_CONTENT_EXT"..0x32C0
    )
}