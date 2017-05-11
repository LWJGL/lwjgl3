/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_EXT_MULAW = "EXTMulaw".nativeClassAL("EXT_MULAW") {
    documentation = "Native bindings to the $extensionName extension."

    IntConstant(
        "Buffer formats.",

        "FORMAT_MONO_MULAW_EXT"..0x10014,
        "FORMAT_STEREO_MULAW_EXT"..0x10015
    )
}