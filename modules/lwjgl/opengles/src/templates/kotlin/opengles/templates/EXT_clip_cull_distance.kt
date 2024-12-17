/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_clip_cull_distance = "EXTClipCullDistance".nativeClassGLES("EXT_clip_cull_distance", postfix = EXT) {
    IntConstant(
        "MAX_CLIP_DISTANCES_EXT"..0x0D32,
        "MAX_CULL_DISTANCES_EXT"..0x82F9,
        "MAX_COMBINED_CLIP_AND_CULL_DISTANCES_EXT"..0x82FA
    )

    IntConstant(
        "CLIP_DISTANCE0_EXT"..0x3000,
        "CLIP_DISTANCE1_EXT"..0x3001,
        "CLIP_DISTANCE2_EXT"..0x3002,
        "CLIP_DISTANCE3_EXT"..0x3003,
        "CLIP_DISTANCE4_EXT"..0x3004,
        "CLIP_DISTANCE5_EXT"..0x3005,
        "CLIP_DISTANCE6_EXT"..0x3006,
        "CLIP_DISTANCE7_EXT"..0x3007
    )
}