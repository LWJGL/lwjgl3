/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_LOKI_IMA_ADPCM = "LOKIIMAADPCM".nativeClassAL("LOKI_IMA_ADPCM") {
    documentation = "Native bindings to the $extensionName extension."

    IntConstant(
        "Buffer formats.",

        "FORMAT_IMA_ADPCM_MONO16_EXT"..0x10000,
        "FORMAT_IMA_ADPCM_STEREO16_EXT"..0x10001
    )
}