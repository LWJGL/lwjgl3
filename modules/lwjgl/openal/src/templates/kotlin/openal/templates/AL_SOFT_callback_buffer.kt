/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_callback_buffer = "SOFTCallbackBuffer".nativeClassAL("SOFT_callback_buffer", postfix = SOFT) {
    IntConstant(
        "BUFFER_CALLBACK_FUNCTION_SOFT"..0x19A0,
        "BUFFER_CALLBACK_USER_PARAM_SOFT"..0x19A1
    )

    ALvoid(
        "BufferCallbackSOFT",

        ALuint("buffer"),
        ALenum("format"),
        ALsizei("freq"),
        ALBUFFERCALLBACKTYPESOFT("callback"),
        "ALvoid".opaque.p("userptr")
    ).directContext()

    ALvoid(
        "GetBufferPtrSOFT",

        ALuint("buffer"),
        ALenum("param"),
        Check(1)..ReturnParam..ALvoid.p.p("ptr")
    ).directContext()

    ALvoid(
        "GetBuffer3PtrSOFT",

        ALuint("buffer"),
        ALenum("param"),
        Check(1)..ALvoid.p.p("ptr0"),
        Check(1)..ALvoid.p.p("ptr1"),
        Check(1)..ALvoid.p.p("ptr2")
    ).directContext()

    ALvoid(
        "GetBufferPtrvSOFT",

        ALuint("buffer"),
        ALenum("param"),
        Check(1)..ALvoid.p.p("ptr")
    ).directContext()
}