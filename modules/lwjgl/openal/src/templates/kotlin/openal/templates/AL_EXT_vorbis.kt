/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_EXT_vorbis = "EXTVorbis".nativeClassAL("EXT_vorbis") {
    IntConstant(
        "FORMAT_VORBIS_EXT"..0x10003
    )
}