/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_MSADPCM = "SOFTMSADPCM".nativeClassAL("SOFT_MSADPCM") {
    IntConstant(
        "FORMAT_MONO_MSADPCM_SOFT"..0x1302,
        "FORMAT_STEREO_MSADPCM_SOFT"..0x1303
    )
}