/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_EXT_source_distance_model = "EXTSourceDistanceModel".nativeClassAL("EXT_source_distance_model") {
    IntConstant(
        "SOURCE_DISTANCE_MODEL"..0x200
    )
}