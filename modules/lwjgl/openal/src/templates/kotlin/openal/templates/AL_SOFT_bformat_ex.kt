/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

// TODO: change to uppercase F in LWJGL 4
val AL_SOFT_bformat_ex = "SOFTBformatEx".nativeClassAL("SOFT_bformat_ex") {
    IntConstant(
        "AMBISONIC_LAYOUT_SOFT"..0x1997,
        "AMBISONIC_SCALING_SOFT"..0x1998
    )

    IntConstant(
        "FUMA_SOFT"..0x0000
    )

    IntConstant(
        "ACN_SOFT"..0x0001
    )

    IntConstant(
        "SN3D_SOFT"..0x0001,
        "N3D_SOFT"..0x0002
    )
}