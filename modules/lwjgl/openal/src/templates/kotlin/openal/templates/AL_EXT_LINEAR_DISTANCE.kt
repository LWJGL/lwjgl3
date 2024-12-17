/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_EXT_LINEAR_DISTANCE = "EXTLinearDistance".nativeClassAL("EXT_LINEAR_DISTANCE") {
    IntConstant(
        "LINEAR_DISTANCE"..0xd003,
        "LINEAR_DISTANCE_CLAMPED"..0xd004
    )
}