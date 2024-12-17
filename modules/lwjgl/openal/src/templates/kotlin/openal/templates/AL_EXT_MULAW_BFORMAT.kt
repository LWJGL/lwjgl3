/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_EXT_MULAW_BFORMAT = "EXTMulawBFormat".nativeClassAL("EXT_MULAW_BFORMAT") {
    IntConstant(
        "FORMAT_BFORMAT2D_MULAW"..0x10031,
        "FORMAT_BFORMAT3D_MULAW"..0x10032
    )
}