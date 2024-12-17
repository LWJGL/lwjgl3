/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_gain_clamp_ex = "SOFTGainClampEx".nativeClassAL("SOFT_gain_clamp_ex") {
    IntConstant(
        "GAIN_LIMIT_SOFT"..0x200E
    )
}