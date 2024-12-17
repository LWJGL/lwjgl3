/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC_SOFT_loopback_bformat = "SOFTLoopbackBformat".nativeClassALC("ALC_SOFT_loopback_bformat") {
    IntConstant(
        "BFORMAT3D_SOFT"..0x1507
    )

    IntConstant(
        "AMBISONIC_LAYOUT_SOFT"..0x1997,
        "AMBISONIC_SCALING_SOFT"..0x1998,
        "AMBISONIC_ORDER_SOFT"..0x1999
    )

    IntConstant(
        "FUMA_SOFT"..0x0000,
        "ACN_SOFT"..0x0001
    )

    IntConstant(
        "SN3D_SOFT"..0x0001,
        "N3D_SOFT"..0x0002
    )

    IntConstant(
        "MAX_AMBISONIC_ORDER_SOFT"..0x199B
    )
}