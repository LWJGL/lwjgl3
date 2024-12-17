/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_source_resampler = "SOFTSourceResampler".nativeClassAL("SOFT_source_resampler", postfix = SOFT) {
    IntConstant(
        "NUM_RESAMPLERS_SOFT"..0x1210,
        "DEFAULT_RESAMPLER_SOFT"..0x1211
    )

    IntConstant(
        "SOURCE_RESAMPLER_SOFT"..0x1212
    )

    IntConstant(
        "RESAMPLER_NAME_SOFT"..0x1213
    )

    ALcharUTF8.const.p(
        "GetStringiSOFT",

        ALenum("pname"),
        ALsizei("index")
    ).directContext()
}