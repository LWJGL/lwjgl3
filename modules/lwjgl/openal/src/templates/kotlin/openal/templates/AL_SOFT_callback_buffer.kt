/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_callback_buffer = "SOFTCallbackBuffer".nativeClassAL("SOFT_callback_buffer") {
    documentation =
        """
        Native bindings to the $specLinkOpenALSoft extension.

        This extension provides a mechanism for applications to provide sample data to the audio device in real-time.

        Standard OpenAL sources can read samples from a pre-loaded static buffer, or from a queue of prepared buffers that can be fed in over time. In both
        cases, an application needs to prepare all or some of the audio samples ahead of time to ensure proper continuous playback. A callback mechanism allows
        applications to generate audio as needed, without having to prepare samples ahead of time, and to implement their own streaming interface instead of
        having to fill, queue, and manage multiple OpenAL buffers per stream.
        """

    IntConstant(
        "Accepted as the {@code param} parameter of #GetBufferPtrSOFT() and #GetBufferPtrvSOFT().",

        "BUFFER_CALLBACK_FUNCTION_SOFT"..0x19A0,
        "BUFFER_CALLBACK_USER_PARAM_SOFT"..0x19A1
    )

    ALvoid(
        "BufferCallbackSOFT",
        """
        Instead of storing sample data, a buffer may be given a callback function which will be invoked when the source it's attached to needs more samples to
        mix. To specify a callback for a buffer, use {@code alBufferCallbackSOFT}.

        After a successful call, any sample data that was stored in the buffer is removed.

        A buffer with a callback cannot be queued onto a streaming source, and it can only be set on one static source at a time. Attempting to queue such a
        buffer on a source, or attempting to set it on a source while it's already on one, will generate an #INVALID_OPERATION error.

        A subsequent successful call to #BufferData() will remove the callback from the buffer, and make it a normal non-callback buffer.
        """,

        ALuint("buffer", ""),
        ALenum("format", "the sample format that will be expected from the callback"),
        ALsizei("freq", "the base sample rate the samples will play at"),
        ALBUFFERCALLBACKTYPESOFT("callback", ""),
        "ALvoid".opaque.p("userptr", "stored with the {@code callback} pointer. Any data it references is not copied")
    )

    ALvoid(
        "GetBufferPtrSOFT",
        "",

        ALuint("buffer", ""),
        ALenum("param", ""),
        Check(1)..ReturnParam..ALvoid.p.p("ptr", "")
    )

    ALvoid(
        "GetBuffer3PtrSOFT",
        "",

        ALuint("buffer", ""),
        ALenum("param", ""),
        Check(1)..ALvoid.p.p("ptr0", ""),
        Check(1)..ALvoid.p.p("ptr1", ""),
        Check(1)..ALvoid.p.p("ptr2", "")
    )

    ALvoid(
        "GetBufferPtrvSOFT",
        "",

        ALuint("buffer", ""),
        ALenum("param", ""),
        Check(1)..ALvoid.p.p("ptr", "")
    )
}