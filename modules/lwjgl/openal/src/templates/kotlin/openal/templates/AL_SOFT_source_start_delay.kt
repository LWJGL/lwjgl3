/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_source_start_delay = "SOFTSourceStartDelay".nativeClassAL("SOFT_source_start_delay", postfix = SOFT) {
    ALvoid(
        "SourcePlayAtTimeSOFT",

        ALuint("source"),
        ALint64SOFT("start_time")
    ).directContext()

    ALvoid(
        "SourcePlayAtTimevSOFT",

        AutoSize("sources")..ALsizei("n"),
        ALuint.const.p("sources"),
        ALint64SOFT("start_time")
    ).directContext()
}