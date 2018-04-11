/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC_LOKI_audio_channel = "LOKIAudioChannel".nativeClassALC("LOKI_audio_channel") {
    documentation = "Native bindings to the $extensionName extension."

    IntConstant(
        "$extensionName tokens.",

        "CHAN_MAIN_LOKI"..0x500001,
        "CHAN_PCM_LOKI"..0x500002,
        "CHAN_CD_LOKI"..0x500003
    )
}