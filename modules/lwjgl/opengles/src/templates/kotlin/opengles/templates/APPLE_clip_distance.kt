/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val APPLE_clip_distance = "APPLEClipDistance".nativeClassGLES("APPLE_clip_distance", postfix = APPLE) {
    IntConstant(
        "MAX_CLIP_DISTANCES_APPLE"..0x0D32
    )

    IntConstant(
        "CLIP_DISTANCE0_APPLE"..0x3000,
        "CLIP_DISTANCE1_APPLE"..0x3001,
        "CLIP_DISTANCE2_APPLE"..0x3002,
        "CLIP_DISTANCE3_APPLE"..0x3003,
        "CLIP_DISTANCE4_APPLE"..0x3004,
        "CLIP_DISTANCE5_APPLE"..0x3005,
        "CLIP_DISTANCE6_APPLE"..0x3006,
        "CLIP_DISTANCE7_APPLE"..0x3007
    )
}