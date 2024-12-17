/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_UHJ = "SOFTUHJ".nativeClassAL("SOFT_UHJ") {
    IntConstant(
        "FORMAT_UHJ2CHN8_SOFT"..0x19A2,
        "FORMAT_UHJ2CHN16_SOFT"..0x19A3,
        "FORMAT_UHJ2CHN_FLOAT32_SOFT"..0x19A4,
        "FORMAT_UHJ3CHN8_SOFT"..0x19A5,
        "FORMAT_UHJ3CHN16_SOFT"..0x19A6,
        "FORMAT_UHJ3CHN_FLOAT32_SOFT"..0x19A7,
        "FORMAT_UHJ4CHN8_SOFT"..0x19A8,
        "FORMAT_UHJ4CHN16_SOFT"..0x19A9,
        "FORMAT_UHJ4CHN_FLOAT32_SOFT"..0x19AA
    )

    IntConstant(
        "STEREO_MODE_SOFT"..0x19B0
    )

    IntConstant(
        "SUPER_STEREO_WIDTH_SOFT"..0x19B1
    )

    IntConstant(
        "NORMAL_SOFT"..0x0000,
        "SUPER_STEREO_SOFT"..0x0001
    )
}