/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC_SOFT_output_mode = "SOFTOutputMode".nativeClassALC("SOFT_output_mode") {
    IntConstant(
        "OUTPUT_MODE_SOFT"..0x19AC
    )

    IntConstant(
        "ANY_SOFT"..0x19AD,
        "MONO_SOFT"..0x1500,
        "STEREO_SOFT"..0x1501,
        "STEREO_BASIC_SOFT"..0x19AE,
        "STEREO_UHJ_SOFT"..0x19AF,
        "STEREO_HRTF_SOFT"..0x19B2,
        "QUAD_SOFT"..0x1503,
        "SURROUND_5_1_SOFT"..0x1504,
        "SURROUND_6_1_SOFT"..0x1505,
        "SURROUND_7_1_SOFT"..0x1506
    )
}