/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_surface_SMPTE2086_metadata = "EXTSurfaceSMPTE2086Metadata".nativeClassEGL("EXT_surface_SMPTE2086_metadata", postfix = EXT) {
    IntConstant(
        "SMPTE2086_DISPLAY_PRIMARY_RX_EXT"..0x3341,
        "SMPTE2086_DISPLAY_PRIMARY_RY_EXT"..0x3342,
        "SMPTE2086_DISPLAY_PRIMARY_GX_EXT"..0x3343,
        "SMPTE2086_DISPLAY_PRIMARY_GY_EXT"..0x3344,
        "SMPTE2086_DISPLAY_PRIMARY_BX_EXT"..0x3345,
        "SMPTE2086_DISPLAY_PRIMARY_BY_EXT"..0x3346,
        "SMPTE2086_WHITE_POINT_X_EXT"..0x3347,
        "SMPTE2086_WHITE_POINT_Y_EXT"..0x3348,
        "SMPTE2086_MAX_LUMINANCE_EXT"..0x3349,
        "SMPTE2086_MIN_LUMINANCE_EXT"..0x334A
    )
}