/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_bformat_hoa = "SOFTBFormatHOA".nativeClassAL("SOFT_bformat_hoa") {
    IntConstant("UNPACK_AMBISONIC_ORDER_SOFT"..0x199D)
}