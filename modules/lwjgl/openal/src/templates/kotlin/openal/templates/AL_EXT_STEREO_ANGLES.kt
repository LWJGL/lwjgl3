/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_EXT_STEREO_ANGLES = "EXTStereoAngles".nativeClassAL("EXT_STEREO_ANGLES") {
    IntConstant(
        "STEREO_ANGLES"..0x1030
    )
}