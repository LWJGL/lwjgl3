/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_surface_CTA861_3_metadata = "EXTSurfaceCTA861_3Metadata".nativeClassEGL("EXT_surface_CTA861_3_metadata", postfix = EXT) {
    IntConstant(
        "CTA861_3_MAX_CONTENT_LIGHT_LEVEL_EXT"..0x3360,
        "CTA861_3_MAX_FRAME_AVERAGE_LEVEL_EXT"..0x3361
    )
}