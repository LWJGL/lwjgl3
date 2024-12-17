/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_fog_distance = "NVFogDistance".nativeClassGL("NV_fog_distance", postfix = NV) {
    IntConstant(
        "FOG_DISTANCE_MODE_NV"..0x855A
    )

    IntConstant(
        "EYE_RADIAL_NV"..0x855B,
        "EYE_PLANE_ABSOLUTE_NV"..0x855C
    )
}