/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_EXT_EXPONENT_DISTANCE = "EXTExponentDistance".nativeClassAL("EXT_EXPONENT_DISTANCE") {
    IntConstant(
        "EXPONENT_DISTANCE"..0xd005,
        "EXPONENT_DISTANCE_CLAMPED"..0xd006
    )
}