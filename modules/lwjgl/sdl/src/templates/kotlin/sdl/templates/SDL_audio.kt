/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_audio = "SDLAudio".nativeClassSDL("SDL_audio") {
    IntConstant(
        "AUDIO_MASK_BITSIZE"..0xFF,
        "AUDIO_MASK_FLOAT".."1 << 8",
        "AUDIO_MASK_BIG_ENDIAN".."1 << 12",
        "AUDIO_MASK_SIGNED".."1 << 15"
    )

    macro(expression = "((signed & 1) << 15) | ((bigendian & 1) << 12) | ((flt & 1) << 8) | (size & SDL_AUDIO_MASK_BITSIZE)")..uint32_t(
        "DEFINE_AUDIO_FORMAT",

        uint32_t("signed"),
        uint32_t("bigendian"),
        uint32_t("flt"),
        uint32_t("size")
    )

    EnumConstant(
        "AUDIO_UNKNOWN".enum("0x0000"),
        "AUDIO_U8".enum("0x0008"),
        "AUDIO_S8".enum("0x8008"),
        "AUDIO_S16LE".enum("0x8010"),
        "AUDIO_S16BE".enum("0x9010"),
        "AUDIO_S32LE".enum("0x8020"),
        "AUDIO_S32BE".enum("0x9020"),
        "AUDIO_F32LE".enum("0x8120"),
        "AUDIO_F32BE".enum("0x9120"),
        "AUDIO_S16".enum("ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_AUDIO_S16LE : SDL_AUDIO_S16BE"),
        "AUDIO_S32".enum("ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_AUDIO_S32LE : SDL_AUDIO_S32BE"),
        "AUDIO_F32".enum("ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_AUDIO_S32LE : SDL_AUDIO_S32BE")
    )

    macro(expression = "x & SDL_AUDIO_MASK_BITSIZE")..uint32_t("AUDIO_BITSIZE", SDL_AudioFormat("x"))
    macro(expression = "SDL_AUDIO_BITSIZE(x) / 8")..uint32_t("AUDIO_BYTESIZE", SDL_AudioFormat("x"))
    macro(expression = "(x & SDL_AUDIO_MASK_FLOAT) != 0")..bool("AUDIO_ISFLOAT", SDL_AudioFormat("x"))
    macro(expression = "(x & SDL_AUDIO_MASK_BIG_ENDIAN) != 0")..bool("AUDIO_ISBIGENDIAN", SDL_AudioFormat("x"))
    macro(expression = "!SDL_AUDIO_ISBIGENDIAN(x)")..bool("AUDIO_ISLITTLEENDIAN", SDL_AudioFormat("x"))
    macro(expression = "(x & SDL_AUDIO_MASK_SIGNED) != 0")..bool("AUDIO_ISSIGNED", SDL_AudioFormat("x"))
    macro(expression = "!SDL_AUDIO_ISFLOAT(x)")..bool("AUDIO_ISINT", SDL_AudioFormat("x"))
    macro(expression = "!SDL_AUDIO_ISSIGNED(x)")..bool("AUDIO_ISUNSIGNED", SDL_AudioFormat("x"))

    IntConstant(
        "AUDIO_DEVICE_DEFAULT_PLAYBACK".."0xFFFFFFFF",
        "AUDIO_DEVICE_DEFAULT_RECORDING".."0xFFFFFFFE"
    )

    macro(expression = "SDL_AUDIO_BYTESIZE(x.format()) * x.channels()")..uint32_t(
        "AUDIO_FRAMESIZE",

        SDL_AudioSpec("x")
    )

    int(
        "GetNumAudioDrivers",

        void()
    )

    charASCII.const.p(
        "GetAudioDriver",

        int("index")
    )

    charASCII.const.p(
        "GetCurrentAudioDriver",

        void()
    )

    SDL_AudioDeviceID.p(
        "GetAudioPlaybackDevices",

        AutoSizeResult..int.p("count")
    )

    SDL_AudioDeviceID.p(
        "GetAudioRecordingDevices",

        AutoSizeResult..int.p("count")
    )

    charUTF8.const.p(
        "GetAudioDeviceName",

        SDL_AudioDeviceID("devid")
    )

    bool(
        "GetAudioDeviceFormat",

        SDL_AudioDeviceID("devid"),
        SDL_AudioSpec.p("spec"),
        Check(1)..int.p("sample_frames")
    )

    int.p(
        "GetAudioDeviceChannelMap",

        SDL_AudioDeviceID("devid"),
        AutoSizeResult..int.p("count")
    )

    SDL_AudioDeviceID(
        "OpenAudioDevice",

        SDL_AudioDeviceID("devid"),
        nullable..SDL_AudioSpec.const.p("spec")
    )

    bool("IsAudioDevicePhysical", SDL_AudioDeviceID("devid"))
    bool("IsAudioDevicePlayback", SDL_AudioDeviceID("devid"))

    bool("PauseAudioDevice", SDL_AudioDeviceID("devid"))
    bool("ResumeAudioDevice", SDL_AudioDeviceID("devid"))
    bool("AudioDevicePaused", SDL_AudioDeviceID("devid"))

    float(
        "GetAudioDeviceGain",

        SDL_AudioDeviceID("devid")
    )

    bool(
        "SetAudioDeviceGain",

        SDL_AudioDeviceID("devid"),
        float("gain")
    )

    void(
        "CloseAudioDevice",

        SDL_AudioDeviceID("devid")
    )

    bool(
        "BindAudioStreams",

        SDL_AudioDeviceID("devid"),
        SDL_AudioStream.p.const.p("streams"),
        AutoSize("streams")..int("num_streams")
    )

    bool(
        "BindAudioStream",

        SDL_AudioDeviceID("devid"),
        SDL_AudioStream.p("stream")
    )

    void(
        "UnbindAudioStreams",

        nullable..SDL_AudioStream.p.const.p("streams"),
        AutoSize("streams")..int("num_streams")
    )

    void(
        "UnbindAudioStream",

        nullable..SDL_AudioStream.p("stream")
    )

    SDL_AudioDeviceID(
        "GetAudioStreamDevice",

        SDL_AudioStream.p("stream")
    )

    SDL_AudioStream.p(
        "CreateAudioStream",

        SDL_AudioSpec.const.p("src_spec"),
        SDL_AudioSpec.const.p("dst_spec")
    )

    SDL_PropertiesID(
        "GetAudioStreamProperties",

        SDL_AudioStream.p("stream")
    )

    bool(
        "GetAudioStreamFormat",

        SDL_AudioStream.p("stream"),
        nullable..SDL_AudioSpec.p("src_spec"),
        nullable..SDL_AudioSpec.p("dst_spec")
    )

    bool(
        "SetAudioStreamFormat",

        SDL_AudioStream.p("stream"),
        nullable..SDL_AudioSpec.const.p("src_spec"),
        nullable..SDL_AudioSpec.const.p("dst_spec")
    )

    float(
        "GetAudioStreamFrequencyRatio",

        SDL_AudioStream.p("stream")
    )

    bool(
        "SetAudioStreamFrequencyRatio",

        SDL_AudioStream.p("stream"),
        float("ratio")
    )

    float(
        "GetAudioStreamGain",

        SDL_AudioStream.p("stream")
    )

    bool(
        "SetAudioStreamGain",

        SDL_AudioStream.p("stream"),
        float("gain")
    )

    int.p(
        "GetAudioStreamInputChannelMap",

        SDL_AudioStream.p("stream"),
        AutoSizeResult..int.p("count")
    )

    int.p(
        "GetAudioStreamOutputChannelMap",

        SDL_AudioStream.p("stream"),
        AutoSizeResult..int.p("count")
    )

    bool(
        "SetAudioStreamInputChannelMap",

        SDL_AudioStream.p("stream"),
        nullable..int.const.p("chmap"),
        AutoSize("chmap")..int("count")
    )

    bool(
        "SetAudioStreamOutputChannelMap",

        SDL_AudioStream.p("stream"),
        nullable..int.const.p("chmap"),
        AutoSize("chmap")..int("count")
    )

    bool(
        "PutAudioStreamData",

        SDL_AudioStream.p("stream"),
        void.const.p("buf"),
        AutoSize("buf")..int("len")
    )

    int(
        "GetAudioStreamData",

        SDL_AudioStream.p("stream"),
        void.p("buf"),
        AutoSize("buf")..int("len")
    )

    int(
        "GetAudioStreamAvailable",

        SDL_AudioStream.p("stream")
    )

    int(
        "GetAudioStreamQueued",

        SDL_AudioStream.p("stream")
    )

    bool(
        "FlushAudioStream",

        SDL_AudioStream.p("stream")
    )

    bool(
        "ClearAudioStream",

        SDL_AudioStream.p("stream")
    )

    bool(
        "PauseAudioStreamDevice",

        SDL_AudioStream.p("stream")
    )

    bool(
        "ResumeAudioStreamDevice",

        SDL_AudioStream.p("stream")
    )

    bool(
        "AudioStreamDevicePaused",

        SDL_AudioStream.p("stream")
    )

    bool(
        "LockAudioStream",

        SDL_AudioStream.p("stream")
    )

    bool(
        "UnlockAudioStream",

        SDL_AudioStream.p("stream")
    )

    bool(
        "SetAudioStreamGetCallback",

        SDL_AudioStream.p("stream"),
        nullable..SDL_AudioStreamCallback("callback"),
        nullable..opaque_p("userdata")
    )

    bool(
        "SetAudioStreamPutCallback",

        SDL_AudioStream.p("stream"),
        nullable..SDL_AudioStreamCallback("callback"),
        nullable..opaque_p("userdata")
    )

    void(
        "DestroyAudioStream",

        SDL_AudioStream.p("stream")
    )

    SDL_AudioStream.p(
        "OpenAudioDeviceStream",

        SDL_AudioDeviceID("devid"),
        nullable..SDL_AudioSpec.const.p("spec"),
        nullable..SDL_AudioStreamCallback("callback"),
        nullable..opaque_p("userdata")
    )

    bool(
        "SetAudioPostmixCallback",

        SDL_AudioDeviceID("devid"),
        nullable..SDL_AudioPostmixCallback("callback"),
        nullable..opaque_p("userdata")
    )

    bool(
        "LoadWAV_IO",

        SDL_IOStream.p("src"),
        bool("closeio"),
        SDL_AudioSpec.p("spec"),
        Check(1)..Uint8.p.p("audio_buf"),
        Check(1)..Uint32.p("audio_len")
    )

    bool(
        "LoadWAV",

        charUTF8.const.p("path"),
        SDL_AudioSpec.p("spec"),
        Check(1)..Uint8.p.p("audio_buf"),
        Check(1)..Uint32.p("audio_len")
    )

    bool(
        "MixAudio",

        Uint8.p("dst"),
        Uint8.const.p("src"),
        SDL_AudioFormat("format"),
        AutoSize("src", "dst")..Uint32("len"),
        float("volume")
    )

    bool(
        "ConvertAudioSamples",

        SDL_AudioSpec.const.p("src_spec"),
        Uint8.const.p("src_data"),
        AutoSize("src_data")..int("src_len"),
        SDL_AudioSpec.const.p("dst_spec"),
        Check(1)..Uint8.p.p("dst_data"),
        Check(1)..int.p("dst_len")
    )

    charASCII.const.p(
        "GetAudioFormatName",

        SDL_AudioFormat("format")
    )

    int(
        "GetSilenceValueForFormat",

        SDL_AudioFormat("format")
    )
}