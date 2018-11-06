/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_source_latency = "SOFTSourceLatency".nativeClassAL("SOFT_source_latency") {
    documentation = """
        Native bindings to the $specLinkOpenALSoft extension.

        This extension provides a method for applications to more accurately measure the playback latency of sources. Unextended OpenAL allows apps to retrieve
        a source's playback offset in bytes, samples, or seconds, but this is (typically) where the AL is processing the audio data.

        Often, more processing is done outside of the AL. Audio servers are common and they can introduce a bit of latency, increasing the time between when the
        AL is done with a piece of audio data until it gets heard by the user. If the OpenAL implementation uses its own mixer, that can also add to the
        latency. This can ultimately cause a not-insignificant delay between where the AL is processing and what is actually being heard.

        Although this delay may not be very noticeable for general gaming, if the app is trying to keep a video or animation syncronized with the playback of an
        OpenAL source this extra delay can cause the audio and video to appear of out sync.

        Luckily, most audio systems have a way of measuring the latency it takes for sound to actually get to the physical output device (the DAC or speakers).
        By providing this information through the AL, an application can more accurately tell what a user is hearing and thus synchronize better with the audio
        output.
        """

    IntConstant(
        """
        The playback position, expressed in fixed-point samples, along with the playback latency, expressed in nanoseconds (1/1000000000ths of a second). This
        attribute is read-only.

        The first value in the returned vector is the sample offset, which is a 32.32 fixed-point value. The whole number is stored in the upper 32 bits and
        the fractional component is in the lower 32 bits. The value is similar to that returned by #SAMPLE_OFFSET, just with more precision.

        The second value is the latency, in nanoseconds. It represents the length of time it will take for the audio at the current offset to actually reach
        the speakers or DAC. This value should be considered volatile, as it may change very often during playback (it can depend on a number of factors,
        including how full the mixing buffer OpenAL may be using is timer jitter, or other changes deeper in the audio pipeline).

        The retrieved offset and latency should be considered atomic, with respect to one another. This means the returned latency was measured exactly when
        the source was at the returned offset.
        """,

        "SAMPLE_OFFSET_LATENCY_SOFT"..0x1200
    )

    IntConstant(
        """
        The playback position, along with the playback latency, both expressed in seconds. This attribute is read-only.

        The first value in the returned vector is the offset in seconds. The value is similar to that returned by #SEC_OFFSET, just with more precision.

        The second value is the latency, in seconds. It represents the length of time it will take for the audio at the current offset to actually reach the
        speakers or DAC. This value should be considered volatile, as it may change very often during playback (it can depend on a number of factors, including
        how full the mixing buffer OpenAL may be using is, timer jitter, or other changes deeper in the audio pipeline).

        The retrieved offset and latency should be considered atomic with respect to one another. This means the returned latency was measured exactly when the
        source was at the returned offset.
        """,

        "SEC_OFFSET_LATENCY_SOFT"..0x1201
    )

    ALvoid(
        "SourcedSOFT",
        "Sets the double value of a source parameter.",

        ALuint("source", "the source to modify"),
        ALenum("param", "the parameter to modify"),
        ALdouble("value", "the parameter value")
    )

    ALvoid(
        "Source3dSOFT",
        "Sets the 3 dimensional double values of a source parameter.",

        ALuint("source", "the source to modify"),
        ALenum("param", "the parameter to modify"),
        ALdouble("value1", "the first value"),
        ALdouble("value2", "the second value"),
        ALdouble("value3", "the third value")
    )

    ALvoid(
        "SourcedvSOFT",
        "pointer version of #SourcedSOFT()",

        ALuint("source", "the source to modify"),
        ALenum("param", "the parameter to modify"),
        Check(1)..ALdouble.const.p("value", "the parameter values")
    )

    ALvoid(
        "GetSourcedSOFT",
        "Gets the double value of a source parameter.",

        ALuint("source", "the source to query"),
        ALenum("param", "the parameter to query"),
        ReturnParam..Check(1)..ALdouble.p("value", "the parameter values")
    )

    ALvoid(
        "GetSource3dSOFT",
        "Gets the 3 dimensional double values of a source parameter.",

        ALuint("source", "the source to query"),
        ALenum("param", "the parameter to query"),
        Check(1)..ALdouble.p("value1", "the first value"),
        Check(1)..ALdouble.p("value2", "the second value"),
        Check(1)..ALdouble.p("value3", "the third value")
    )

    ALvoid(
        "GetSourcedvSOFT",
        "Array version of #GetSourcedSOFT()",

        ALuint("source", "the source to query"),
        ALenum("param", "the parameter to query"),
        Check(1)..ALdouble.p("values", "the parameter values")
    )

    ALvoid(
        "Sourcei64SOFT",
        "Sets the 64 bit integer value of a source parameter.",

        ALuint("source", "the source to modify"),
        ALenum("param", "the parameter to modify"),
        ALint64SOFT("value", "the parameter values")
    )

    ALvoid(
        "Source3i64SOFT",
        "Sets the 3 dimensional 64 bit integer values of a source parameter.",

        ALuint("source", "the source to modify"),
        ALenum("param", "the parameter to modify"),
        ALint64SOFT("value1", "the first value"),
        ALint64SOFT("value2", "the second value"),
        ALint64SOFT("value3", "the third value")
    )

    ALvoid(
        "Sourcei64vSOFT",
        "Array version of #Sourcei64SOFT()",

        ALuint("source", "the source to modify"),
        ALenum("param", "the parameter to modify"),
        Check(1)..ALint64SOFT.const.p("values", "the parameter values")
    )

    ALvoid(
        "GetSourcei64SOFT",
        "Gets the 64 bit integer value of a source parameter.",

        ALuint("source", "the source to query"),
        ALenum("param", "the parameter to query"),
        ReturnParam..Check(1)..ALint64SOFT.p("value", "the parameter values")
    )

    ALvoid(
        "GetSource3i64SOFT",
        "Gets the 3 dimensional 64 bit integer values of a source parameter.",

        ALuint("source", "the source to query"),
        ALenum("param", "the parameter to query"),
        Check(1)..ALint64SOFT.p("value1", "the first value"),
        Check(1)..ALint64SOFT.p("value2", "the second value"),
        Check(1)..ALint64SOFT.p("value3", "the third value")
    )

    ALvoid(
        "GetSourcei64vSOFT",
        "Array version of #GetSourcei64SOFT()",

        ALuint("source", "the source to query"),
        ALenum("param", "the parameter to query"),
        Check(1)..ALint64SOFT.p("values", "the parameter values")
    )
}