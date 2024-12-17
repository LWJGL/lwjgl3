/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC_EXT_DEDICATED = "EXTDedicated".nativeClassALC("EXT_DEDICATED", prefix = AL) {
    IntConstant(
        "DEDICATED_GAIN"..0x1,
        "EFFECT_DEDICATED_DIALOGUE"..0x9001,
        "EFFECT_DEDICATED_LOW_FREQUENCY_EFFECT"..0x9000
    )
}