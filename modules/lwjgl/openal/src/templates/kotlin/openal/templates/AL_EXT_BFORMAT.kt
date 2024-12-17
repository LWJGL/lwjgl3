/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_EXT_BFORMAT = "EXTBFormat".nativeClassAL("EXT_BFORMAT") {
    IntConstant(
        "FORMAT_BFORMAT2D_16"..0x20022,
        "FORMAT_BFORMAT2D_8"..0x20021,
        "FORMAT_BFORMAT2D_FLOAT32"..0x20023,
        "FORMAT_BFORMAT3D_16"..0x20032,
        "FORMAT_BFORMAT3D_8"..0x20031,
        "FORMAT_BFORMAT3D_FLOAT32"..0x20033
    )
}