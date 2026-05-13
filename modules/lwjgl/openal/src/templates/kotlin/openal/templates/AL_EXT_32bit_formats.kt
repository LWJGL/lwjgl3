/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_EXT_32bit_formats = "EXT32BitFormats".nativeClassAL("EXT_32bit_formats") {
    IntConstant(
        "FORMAT_MONO_I32"..0x19DB,
        "FORMAT_STEREO_I32"..0x19DC
    )

    IntConstant(
        "FORMAT_REAR_I32"..0x19DD,
        "FORMAT_QUAD_I32"..0x19DF,
        "FORMAT_51CHN_I32"..0x19E1,
        "FORMAT_61CHN_I32"..0x19E3,
        "FORMAT_71CHN_I32"..0x19E5
    )

    IntConstant(
        "FORMAT_REAR_FLOAT32"..0x19DE,
        "FORMAT_QUAD_FLOAT32"..0x19E0,
        "FORMAT_51CHN_FLOAT32"..0x19E2,
        "FORMAT_61CHN_FLOAT32"..0x19E4,
        "FORMAT_71CHN_FLOAT32"..0x19E6
    )

    IntConstant(
        "FORMAT_BFORMAT2D_I32"..0x19E7,
        "FORMAT_BFORMAT3D_I32"..0x19E8
    )

    IntConstant(
        "FORMAT_UHJ2CHN_I32_SOFT"..0x19E9,
        "FORMAT_UHJ3CHN_I32_SOFT"..0x19EA,
        "FORMAT_UHJ4CHN_I32_SOFT"..0x19EB
    )
}