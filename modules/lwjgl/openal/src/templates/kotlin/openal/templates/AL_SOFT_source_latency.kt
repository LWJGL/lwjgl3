/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_source_latency = "SOFTSourceLatency".nativeClassAL("SOFT_source_latency", postfix = SOFT) {
    IntConstant(
        "SAMPLE_OFFSET_LATENCY_SOFT"..0x1200
    )

    IntConstant(
        "SEC_OFFSET_LATENCY_SOFT"..0x1201
    )

    ALvoid(
        "SourcedSOFT",

        ALuint("source"),
        ALenum("param"),
        ALdouble("value")
    ).directContext()

    ALvoid(
        "Source3dSOFT",

        ALuint("source"),
        ALenum("param"),
        ALdouble("value1"),
        ALdouble("value2"),
        ALdouble("value3")
    ).directContext()

    ALvoid(
        "SourcedvSOFT",

        ALuint("source"),
        ALenum("param"),
        Check(1)..ALdouble.const.p("value")
    ).directContext()

    ALvoid(
        "GetSourcedSOFT",

        ALuint("source"),
        ALenum("param"),
        ReturnParam..Check(1)..ALdouble.p("value")
    ).directContext()

    ALvoid(
        "GetSource3dSOFT",

        ALuint("source"),
        ALenum("param"),
        Check(1)..ALdouble.p("value1"),
        Check(1)..ALdouble.p("value2"),
        Check(1)..ALdouble.p("value3")
    ).directContext()

    ALvoid(
        "GetSourcedvSOFT",

        ALuint("source"),
        ALenum("param"),
        Check(1)..ALdouble.p("values")
    ).directContext()

    ALvoid(
        "Sourcei64SOFT",

        ALuint("source"),
        ALenum("param"),
        ALint64SOFT("value")
    ).directContext()

    ALvoid(
        "Source3i64SOFT",

        ALuint("source"),
        ALenum("param"),
        ALint64SOFT("value1"),
        ALint64SOFT("value2"),
        ALint64SOFT("value3")
    ).directContext()

    ALvoid(
        "Sourcei64vSOFT",

        ALuint("source"),
        ALenum("param"),
        Check(1)..ALint64SOFT.const.p("values")
    ).directContext()

    ALvoid(
        "GetSourcei64SOFT",

        ALuint("source"),
        ALenum("param"),
        ReturnParam..Check(1)..ALint64SOFT.p("value")
    ).directContext()

    ALvoid(
        "GetSource3i64SOFT",

        ALuint("source"),
        ALenum("param"),
        Check(1)..ALint64SOFT.p("value1"),
        Check(1)..ALint64SOFT.p("value2"),
        Check(1)..ALint64SOFT.p("value3")
    ).directContext()

    ALvoid(
        "GetSourcei64vSOFT",

        ALuint("source"),
        ALenum("param"),
        Check(1)..ALint64SOFT.p("values")
    ).directContext()
}