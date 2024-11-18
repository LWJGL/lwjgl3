/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_source_start_delay = "SOFTSourceStartDelay".nativeClassAL("SOFT_source_start_delay", postfix = SOFT) {
    documentation = """
        Native bindings to the $specLinkOpenALSoft extension.

        This extension allows applications to play a source at a particular future time.

        With standard OpenAL, an application can play a source with the #SourcePlay() or #SourcePlayv() functions which causes sources to start playing as soon
        as possible, but the actual start time is left to the implementation to deal with (which could be on the next 10ms or 20ms boundary, or whenever the
        mixer can start processing the source).

        Aside from {@code alSourcePlayv} starting all given sources in sync, there is no way to start playing sources at particular times relative to each
        other, or synchronized to some specific time point.

        This extension adds functionality to start source playback at an absolute device clock time, as well as to start with a relative delay.

        Requires ${ALC_SOFT_device_clock.link}.
        """

    ALvoid(
        "SourcePlayAtTimeSOFT",
        "",

        ALuint("source", ""),
        ALint64SOFT("start_time", "")
    ).directContext()

    ALvoid(
        "SourcePlayAtTimevSOFT",
        "",

        AutoSize("sources")..ALsizei("n", ""),
        ALuint.const.p("sources", ""),
        ALint64SOFT("start_time", "")
    ).directContext()
}