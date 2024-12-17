/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_UHJ_ex = "SOFTUHJEx".nativeClassAL("SOFT_UHJ_ex") {
    IntConstant(
        "FORMAT_UHJ2CHN_MULAW_SOFT"..0x19B3,
        "FORMAT_UHJ3CHN_MULAW_SOFT"..0x19B7,
        "FORMAT_UHJ4CHN_MULAW_SOFT"..0x19B9
    )

    IntConstant(
        "FORMAT_UHJ2CHN_ALAW_SOFT"..0x19B4,
        "FORMAT_UHJ3CHN_ALAW_SOFT"..0x19B8,
        "FORMAT_UHJ4CHN_ALAW_SOFT"..0x19BA
    )

    IntConstant(
        "FORMAT_UHJ2CHN_IMA4_SOFT"..0x19B5
    )

    IntConstant(
        "FORMAT_UHJ2CHN_MSADPCM_SOFT"..0x19B6
    )
}