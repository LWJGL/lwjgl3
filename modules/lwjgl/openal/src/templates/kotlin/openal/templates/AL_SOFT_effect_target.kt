/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_effect_target = "SOFTEffectTarget".nativeClassAL("SOFT_effect_target") {
    IntConstant(
        "EFFECTSLOT_TARGET_SOFT"..0x199C
    )
}