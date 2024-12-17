/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_source_spatialize = "SOFTSourceSpatialize".nativeClassAL("SOFT_source_spatialize") {
    IntConstant(
        "SOURCE_SPATIALIZE_SOFT"..0x1214
    )

    IntConstant(
        "AUTO_SOFT"..0x0002
    )
}