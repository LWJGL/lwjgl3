/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_EXT_MULAW = "EXTMulaw".nativeClassAL("EXT_MULAW") {
    IntConstant(
        "FORMAT_MONO_MULAW_EXT"..0x10014,
        "FORMAT_STEREO_MULAW_EXT"..0x10015
    )
}