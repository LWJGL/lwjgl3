/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val APPLE_clip_distance = "APPLEClipDistance".nativeClassGLES("APPLE_clip_distance", postfix = APPLE) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds support for hardware clip planes to OpenGL ES 2.0 and 3.0. These were present in OpenGL ES 1.1, but were removed to better match
        certain hardware. Since they're useful for certain applications, notable CAD, we return them here.

        Requires ${GLES20.core}.
        """

    IntConstant(
        "ccepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetInteger64v, and GetFloatv.",

        "MAX_CLIP_DISTANCES_APPLE"..0x0D32
    )

    IntConstant(
        "Accepted by the {@code pname} parameters of Enable, Disable and IsEnabled.",

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