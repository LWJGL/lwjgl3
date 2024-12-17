/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val TIZEN_image_native_surface = "TIZENImageNativeSurface".nativeClassEGL("TIZEN_image_native_surface", postfix = TIZEN) {
    IntConstant(
        "NATIVE_SURFACE_TIZEN"..0x32A1
    )
}