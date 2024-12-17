/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_3dvision_surface = "NV3dvisionSurface".nativeClassEGL("NV_3dvision_surface", postfix = NV) {
    IntConstant(
        "AUTO_STEREO_NV"..0x3136
    )
}