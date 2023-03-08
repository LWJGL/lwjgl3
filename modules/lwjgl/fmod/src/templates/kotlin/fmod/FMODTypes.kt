/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package fmod

import org.lwjgl.generator.*

val FMOD_BOOL = typedef(int, "FMOD_BOOL")
val FMOD_CHANNEL = "FMOD_CHANNEL".opaque
val FMOD_CHANNELCONTROL = "FMOD_CHANNELCONTROL".opaque
val FMOD_CHANNELGROUP = "FMOD_CHANNELGROUP".opaque
val FMOD_CHANNELMASK = typedef(unsigned_int, "FMOD_CHANNELMASK")
val FMOD_CODEC_SEEK_METHOD = typedef(int, "FMOD_CODEC_SEEK_METHOD")
val FMOD_DEBUG_FLAGS = typedef(unsigned_int, "FMOD_DEBUG_FLAGS")
val FMOD_DRIVER_STATE = typedef(unsigned_int, "FMOD_DRIVER_STATE")
val FMOD_DSP = "FMOD_DSP".opaque
val FMOD_DSPCONNECTION = "FMOD_DSPCONNECTION".opaque
val FMOD_GEOMETRY = "FMOD_GEOMETRY".opaque
val FMOD_INITFLAGS = typedef(unsigned_int, "FMOD_INITFLAGS")
val FMOD_MEMORY_TYPE = typedef(unsigned_int, "FMOD_MEMORY_TYPE")
val FMOD_MODE = typedef(unsigned_int, "FMOD_MODE")
val FMOD_OUTPUT_METHOD = typedef(unsigned_int, "FMOD_OUTPUT_METHOD")
val FMOD_POLYGON = "FMOD_POLYGON".opaque
val FMOD_PORT_INDEX = typedef(unsigned_long_long, "FMOD_PORT_INDEX")
val FMOD_REVERB3D = "FMOD_REVERB3D".opaque
val FMOD_SOUND = "FMOD_SOUND".opaque
val FMOD_SOUNDGROUP = "FMOD_SOUNDGROUP".opaque
val FMOD_SYNCPOINT = "FMOD_SYNCPOINT".opaque
val FMOD_SYSTEM = "FMOD_SYSTEM".opaque
val FMOD_SYSTEM_CALLBACK_TYPE = typedef(unsigned_int, "FMOD_SYSTEM_CALLBACK_TYPE")
val FMOD_THREAD_AFFINITY = typedef(long_long, "FMOD_THREAD_AFFINITY")
val FMOD_THREAD_PRIORITY = typedef(int, "FMOD_THREAD_PRIORITY")
val FMOD_THREAD_STACK_SIZE = typedef(unsigned_int, "FMOD_THREAD_STACK_SIZE")
val FMOD_TIMEUNIT = typedef(unsigned_int, "FMOD_TIMEUNIT")

val FMOD_CHANNELCONTROL_CALLBACK_TYPE = "FMOD_CHANNELCONTROL_CALLBACK_TYPE".enumType
val FMOD_CHANNELCONTROL_DSP_INDEX = "FMOD_CHANNELCONTROL_DSP_INDEX".enumType
val FMOD_CHANNELCONTROL_TYPE = "FMOD_CHANNELCONTROL_TYPE".enumType
val FMOD_CHANNELORDER = "FMOD_CHANNELORDER".enumType
val FMOD_DEBUG_MODE = "FMOD_DEBUG_MODE".enumType
val FMOD_DSPCONNECTION_TYPE = "FMOD_DSPCONNECTION_TYPE".enumType
val FMOD_DSP_CALLBACK_TYPE = "FMOD_DSP_CALLBACK_TYPE".enumType
val FMOD_DSP_CHANNELMIX = "FMOD_DSP_CHANNELMIX".enumType
val FMOD_DSP_CHANNELMIX_OUTPUT = "FMOD_DSP_CHANNELMIX_OUTPUT".enumType
val FMOD_DSP_CHORUS = "FMOD_DSP_CHORUS".enumType
val FMOD_DSP_COMPRESSOR = "FMOD_DSP_COMPRESSOR".enumType
val FMOD_DSP_CONVOLUTION_REVERB = "FMOD_DSP_CONVOLUTION_REVERB".enumType
val FMOD_DSP_DELAY = "FMOD_DSP_DELAY".enumType
val FMOD_DSP_DISTORTION = "FMOD_DSP_DISTORTION".enumType
val FMOD_DSP_ECHO = "FMOD_DSP_ECHO".enumType
val FMOD_DSP_ENVELOPEFOLLOWER = "FMOD_DSP_ENVELOPEFOLLOWER".enumType
val FMOD_DSP_FADER = "FMOD_DSP_FADER".enumType
val FMOD_DSP_FFT = "FMOD_DSP_FFT".enumType
val FMOD_DSP_FFT_WINDOW = "FMOD_DSP_FFT_WINDOW".enumType
val FMOD_DSP_FLANGE = "FMOD_DSP_FLANGE".enumType
val FMOD_DSP_HIGHPASS = "FMOD_DSP_HIGHPASS".enumType
val FMOD_DSP_HIGHPASS_SIMPLE = "FMOD_DSP_HIGHPASS_SIMPLE".enumType
val FMOD_DSP_ITECHO = "FMOD_DSP_ITECHO".enumType
val FMOD_DSP_ITLOWPASS = "FMOD_DSP_ITLOWPASS".enumType
val FMOD_DSP_LIMITER = "FMOD_DSP_LIMITER".enumType
val FMOD_DSP_LOUDNESS_METER = "FMOD_DSP_LOUDNESS_METER".enumType
val FMOD_DSP_LOUDNESS_METER_STATE_TYPE = "FMOD_DSP_LOUDNESS_METER_STATE_TYPE".enumType
val FMOD_DSP_LOWPASS = "FMOD_DSP_LOWPASS".enumType
val FMOD_DSP_LOWPASS_SIMPLE = "FMOD_DSP_LOWPASS_SIMPLE".enumType
val FMOD_DSP_MULTIBAND_EQ = "FMOD_DSP_MULTIBAND_EQ".enumType
val FMOD_DSP_MULTIBAND_EQ_FILTER_TYPE = "FMOD_DSP_MULTIBAND_EQ_FILTER_TYPE".enumType
val FMOD_DSP_NORMALIZE = "FMOD_DSP_NORMALIZE".enumType
val FMOD_DSP_OBJECTPAN = "FMOD_DSP_OBJECTPAN".enumType
val FMOD_DSP_OSCILLATOR = "FMOD_DSP_OSCILLATOR".enumType
val FMOD_DSP_PAN = "FMOD_DSP_PAN".enumType
val FMOD_DSP_PAN_2D_STEREO_MODE_TYPE = "FMOD_DSP_PAN_2D_STEREO_MODE_TYPE".enumType
val FMOD_DSP_PAN_3D_EXTENT_MODE_TYPE = "FMOD_DSP_PAN_3D_EXTENT_MODE_TYPE".enumType
val FMOD_DSP_PAN_3D_ROLLOFF_TYPE = "FMOD_DSP_PAN_3D_ROLLOFF_TYPE".enumType
val FMOD_DSP_PAN_MODE_TYPE = "FMOD_DSP_PAN_MODE_TYPE".enumType
val FMOD_DSP_PAN_SURROUND_FLAGS = "FMOD_DSP_PAN_SURROUND_FLAGS".enumType
val FMOD_DSP_PARAMEQ = "FMOD_DSP_PARAMEQ".enumType
val FMOD_DSP_PARAMETER_DATA_TYPE = "FMOD_DSP_PARAMETER_DATA_TYPE".enumType
val FMOD_DSP_PARAMETER_FLOAT_MAPPING_TYPE = "FMOD_DSP_PARAMETER_FLOAT_MAPPING_TYPE".enumType
val FMOD_DSP_PARAMETER_TYPE = "FMOD_DSP_PARAMETER_TYPE".enumType
val FMOD_DSP_PITCHSHIFT = "FMOD_DSP_PITCHSHIFT".enumType
val FMOD_DSP_PROCESS_OPERATION = "FMOD_DSP_PROCESS_OPERATION".enumType
val FMOD_DSP_RESAMPLER = "FMOD_DSP_RESAMPLER".enumType
val FMOD_DSP_RETURN = "FMOD_DSP_RETURN".enumType
val FMOD_DSP_SEND = "FMOD_DSP_SEND".enumType
val FMOD_DSP_SFXREVERB = "FMOD_DSP_SFXREVERB".enumType
val FMOD_DSP_THREE_EQ = "FMOD_DSP_THREE_EQ".enumType
val FMOD_DSP_THREE_EQ_CROSSOVERSLOPE_TYPE = "FMOD_DSP_THREE_EQ_CROSSOVERSLOPE_TYPE".enumType
val FMOD_DSP_TRANSCEIVER = "FMOD_DSP_TRANSCEIVER".enumType
val FMOD_DSP_TRANSCEIVER_SPEAKERMODE = "FMOD_DSP_TRANSCEIVER_SPEAKERMODE".enumType
val FMOD_DSP_TREMOLO = "FMOD_DSP_TREMOLO".enumType
val FMOD_DSP_TYPE = "FMOD_DSP_TYPE".enumType
val FMOD_ERRORCALLBACK_INSTANCETYPE = "FMOD_ERRORCALLBACK_INSTANCETYPE".enumType
val FMOD_OPENSTATE = "FMOD_OPENSTATE".enumType
val FMOD_OUTPUTTYPE = "FMOD_OUTPUTTYPE".enumType
val FMOD_PLUGINTYPE = "FMOD_PLUGINTYPE".enumType
val FMOD_PORT_TYPE = "FMOD_PORT_TYPE".enumType
val FMOD_RESULT = "FMOD_RESULT".enumType
val FMOD_SOUNDGROUP_BEHAVIOR = "FMOD_SOUNDGROUP_BEHAVIOR".enumType
val FMOD_SOUND_FORMAT = "FMOD_SOUND_FORMAT".enumType
val FMOD_SOUND_TYPE = "FMOD_SOUND_TYPE".enumType
val FMOD_SPEAKER = "FMOD_SPEAKER".enumType
val FMOD_SPEAKERMODE = "FMOD_SPEAKERMODE".enumType
val FMOD_TAGDATATYPE = "FMOD_TAGDATATYPE".enumType
val FMOD_TAGTYPE = "FMOD_TAGTYPE".enumType
val FMOD_THREAD_TYPE = "FMOD_THREAD_TYPE".enumType

// Forward declarations
private val _FMOD_ASYNCREADINFO = struct(Module.FMOD, "FMOD_ASYNCREADINFO", nativeName = "struct FMOD_ASYNCREADINFO")
private val _FMOD_CODEC_STATE = struct(Module.FMOD, "FMOD_CODEC_STATE", nativeName = "struct FMOD_CODEC_STATE")
private val _FMOD_CODEC_WAVEFORMAT = struct(Module.FMOD, "FMOD_CODEC_WAVEFORMAT", nativeName = "struct FMOD_CODEC_WAVEFORMAT")
private val _FMOD_COMPLEX = struct(Module.FMOD, "FMOD_COMPLEX", nativeName = "struct FMOD_COMPLEX")
private val _FMOD_DSP_BUFFER_ARRAY = struct(Module.FMOD, "FMOD_DSP_BUFFER_ARRAY", nativeName = "struct FMOD_DSP_BUFFER_ARRAY")
private val _FMOD_DSP_STATE = struct(Module.FMOD, "FMOD_DSP_STATE", nativeName = "struct FMOD_DSP_STATE")
private val _FMOD_OUTPUT_OBJECT3DINFO = struct(Module.FMOD, "FMOD_OUTPUT_OBJECT3DINFO", nativeName = "struct FMOD_OUTPUT_OBJECT3DINFO")
private val _FMOD_OUTPUT_STATE = struct(Module.FMOD, "FMOD_OUTPUT_STATE", nativeName = "struct FMOD_OUTPUT_STATE")

val FMOD_DEBUG_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DEBUG_CALLBACK",
        "FMOD callbacks",

        FMOD_DEBUG_FLAGS("flags", ""),
        charUTF8.const.p("file", ""),
        int("line", ""),
        charUTF8.const.p("func", ""),
        charUTF8.const.p("message", ""),

        nativeType = "FMOD_DEBUG_CALLBACK"
    )
}

val FMOD_SYSTEM_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_SYSTEM_CALLBACK",
        "",

        nullable..FMOD_SYSTEM.p("system", ""),
        FMOD_SYSTEM_CALLBACK_TYPE("type", ""),
        nullable..opaque_p("commanddata1", ""),
        nullable..opaque_p("commanddata2", ""),
        nullable..opaque_p("userdata", ""),

        nativeType = "FMOD_SYSTEM_CALLBACK"
    )
}

val FMOD_CHANNELCONTROL_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_CHANNELCONTROL_CALLBACK",
        "",

        FMOD_CHANNELCONTROL.p("channelcontrol", ""),
        FMOD_CHANNELCONTROL_TYPE("controltype", ""),
        FMOD_CHANNELCONTROL_CALLBACK_TYPE("callbacktype", ""),
        nullable..opaque_p("commanddata1", ""),
        nullable..opaque_p("commanddata2", ""),

        nativeType = "FMOD_CHANNELCONTROL_CALLBACK"
    )
}

val FMOD_DSP_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_CALLBACK",
        "",

        FMOD_DSP.p("dsp", ""),
        FMOD_DSP_CALLBACK_TYPE("type", ""),
        opaque_p("data", ""),

        nativeType = "FMOD_DSP_CALLBACK"
    )
}

val FMOD_SOUND_NONBLOCK_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_SOUND_NONBLOCK_CALLBACK",
        "",

        FMOD_SOUND.p("sound", ""),
        FMOD_RESULT("result", ""),

        nativeType = "FMOD_SOUND_NONBLOCK_CALLBACK"
    )
}

val FMOD_SOUND_PCMREAD_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_SOUND_PCMREAD_CALLBACK",
        "",

        FMOD_SOUND.p("sound", ""),
        void.p("data", ""),
        AutoSize("data")..unsigned_int("datalen", ""),

        nativeType = "FMOD_SOUND_PCMREAD_CALLBACK"
    )
}

val FMOD_SOUND_PCMSETPOS_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_SOUND_PCMSETPOS_CALLBACK",
        "",

        FMOD_SOUND.p("sound", ""),
        int("subsound", ""),
        unsigned_int("position", ""),
        FMOD_TIMEUNIT("postype", ""),

        nativeType = "FMOD_SOUND_PCMSETPOS_CALLBACK"
    )
}

val FMOD_FILE_OPEN_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_FILE_OPEN_CALLBACK",
        "",

        charUTF8.const.p("name", ""),
        Check(1)..unsigned_int.p("filesize", ""),
        Check(1)..void.p.p("handle", ""),
        nullable..opaque_p("userdata", ""),

        nativeType = "FMOD_FILE_OPEN_CALLBACK"
    )
}

val FMOD_FILE_CLOSE_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_FILE_CLOSE_CALLBACK",
        "",

        opaque_p("handle", ""),
        nullable..opaque_p("userdata", ""),

        nativeType = "FMOD_FILE_CLOSE_CALLBACK"
    )
}

val FMOD_FILE_READ_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_FILE_READ_CALLBACK",
        "",

        opaque_p("handle", ""),
        void.p("buffer", ""),
        AutoSize("buffer")..unsigned_int("sizebytes", ""),
        Check(1)..unsigned_int.p("bytesread", ""),
        nullable..opaque_p("userdata", ""),

        nativeType = "FMOD_FILE_READ_CALLBACK"
    )
}

val FMOD_FILE_SEEK_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_FILE_SEEK_CALLBACK",
        "",

        opaque_p("handle", ""),
        unsigned_int("pos", ""),
        nullable..opaque_p("userdata", ""),

        nativeType = "FMOD_FILE_SEEK_CALLBACK"
    )
}

val FMOD_FILE_ASYNCREAD_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_FILE_ASYNCREAD_CALLBACK",
        "",

        _FMOD_ASYNCREADINFO.p("info", ""),
        nullable..opaque_p("userdata", ""),

        nativeType = "FMOD_FILE_ASYNCREAD_CALLBACK"
    )
}

val FMOD_FILE_ASYNCCANCEL_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_FILE_ASYNCCANCEL_CALLBACK",
        "",

        _FMOD_ASYNCREADINFO.p("info", ""),
        nullable..opaque_p("userdata", ""),

        nativeType = "FMOD_FILE_ASYNCCANCEL_CALLBACK"
    )
}

val FMOD_FILE_ASYNCDONE_FUNC = Module.FMOD.callback {
    void(
        "FMOD_FILE_ASYNCDONE_FUNC",
        "",

        _FMOD_ASYNCREADINFO.p("info", ""),
        FMOD_RESULT("result", ""),

        nativeType = "FMOD_FILE_ASYNCDONE_FUNC"
    )
}

val FMOD_MEMORY_ALLOC_CALLBACK = Module.FMOD.callback {
    void.p(
        "FMOD_MEMORY_ALLOC_CALLBACK",
        "",

        AutoSizeResult..unsigned_int("size", ""),
        FMOD_MEMORY_TYPE("type", ""),
        nullable..charUTF8.const.p("sourcestr", ""),

        nativeType = "FMOD_MEMORY_ALLOC_CALLBACK"
    )
}

val FMOD_MEMORY_REALLOC_CALLBACK = Module.FMOD.callback {
    void.p(
        "FMOD_MEMORY_REALLOC_CALLBACK",
        "",

        opaque_p("ptr", ""),
        AutoSizeResult..unsigned_int("size", ""),
        FMOD_MEMORY_TYPE("type", ""),
        nullable..charUTF8.const.p("sourcestr", ""),

        nativeType = "FMOD_MEMORY_REALLOC_CALLBACK"
    )
}

val FMOD_MEMORY_FREE_CALLBACK = Module.FMOD.callback {
    void(
        "FMOD_MEMORY_FREE_CALLBACK",
        "",

        opaque_p("ptr", ""),
        FMOD_MEMORY_TYPE("type", ""),
        nullable..charUTF8.const.p("sourcestr", ""),

        nativeType = "FMOD_MEMORY_FREE_CALLBACK"
    )
}

val FMOD_3D_ROLLOFF_CALLBACK = Module.FMOD.callback {
    float(
        "FMOD_3D_ROLLOFF_CALLBACK",
        "",

        FMOD_CHANNELCONTROL.p("channelcontrol", ""),
        float("distance", ""),

        nativeType = "FMOD_3D_ROLLOFF_CALLBACK"
    )
}

val FMOD_ASYNCREADINFO = struct(Module.FMOD, "FMOD_ASYNCREADINFO", nativeName = "struct FMOD_ASYNCREADINFO") {
    documentation = "FMOD structs"

    opaque_p("handle", "")
    unsigned_int("offset", "")
    unsigned_int("sizebytes", "")
    int("priority", "")
    nullable..opaque_p("userdata", "")
    void.p("buffer", "")
    AutoSize("buffer")..unsigned_int("bytesread", "")
    FMOD_FILE_ASYNCDONE_FUNC("done", "")
}

val FMOD_VECTOR = struct(Module.FMOD, "FMOD_VECTOR") {
    float("x", "")
    float("y", "")
    float("z", "")
}

val FMOD_3D_ATTRIBUTES = struct(Module.FMOD, "FMOD_3D_ATTRIBUTES") {
    FMOD_VECTOR("position", "")
    FMOD_VECTOR("velocity", "")
    FMOD_VECTOR("forward", "")
    FMOD_VECTOR("up", "")
}

val FMOD_GUID = struct(Module.FMOD, "FMOD_GUID") {
    unsigned_int("Data1", "")
    unsigned_short("Data2", "")
    unsigned_short("Data3", "")
    unsigned_char("Data4", "")[8]
}

val FMOD_PLUGINLIST = struct(Module.FMOD, "FMOD_PLUGINLIST") {
    FMOD_PLUGINTYPE("type", "")
    opaque_p("description", "")
}

val FMOD_ADVANCEDSETTINGS = struct(Module.FMOD, "FMOD_ADVANCEDSETTINGS") {
    int("cbSize", "")
    int("maxMPEGCodecs", "")
    int("maxADPCMCodecs", "")
    int("maxXMACodecs", "")
    int("maxVorbisCodecs", "")
    int("maxAT9Codecs", "")
    int("maxFADPCMCodecs", "")
    int("maxPCMCodecs", "")
    AutoSize("ASIOChannelList", "ASIOSpeakerList")..int("ASIONumChannels", "")
    charUTF8.p.p("ASIOChannelList", "")
    FMOD_SPEAKER.p("ASIOSpeakerList", "")
    float("vol0virtualvol", "")
    unsigned_int("defaultDecodeBufferSize", "")
    unsigned_short("profilePort", "")
    unsigned_int("geometryMaxFadeTime", "")
    float("distanceFilterCenterFreq", "")
    int("reverb3Dinstance", "")
    int("DSPBufferPoolSize", "")
    FMOD_DSP_RESAMPLER("resamplerMethod", "")
    unsigned_int("randomSeed", "")
    int("maxConvolutionThreads", "")
    int("maxOpusCodecs", "")
}

val FMOD_TAG = struct(Module.FMOD, "FMOD_TAG") {
    FMOD_TAGTYPE("type", "")
    FMOD_TAGDATATYPE("datatype", "")
    charUTF8.p("name", "")
    void.p("data", "")
    AutoSize("data")..unsigned_int("datalen", "")
    FMOD_BOOL("updated", "")
}

val FMOD_CREATESOUNDEXINFO = struct(Module.FMOD, "FMOD_CREATESOUNDEXINFO") {
    int("cbsize", "")
    unsigned_int("length", "")
    unsigned_int("fileoffset", "")
    int("numchannels", "")
    int("defaultfrequency", "")
    FMOD_SOUND_FORMAT("format", "")
    unsigned_int("decodebuffersize", "")
    int("initialsubsound", "")
    int("numsubsounds", "")
    int.p("inclusionlist", "")
    AutoSize("inclusionlist")..int("inclusionlistnum", "")
    nullable..FMOD_SOUND_PCMREAD_CALLBACK("pcmreadcallback", "")
    nullable..FMOD_SOUND_PCMSETPOS_CALLBACK("pcmsetposcallback", "")
    nullable..FMOD_SOUND_NONBLOCK_CALLBACK("nonblockcallback", "")
    nullable..charUTF8.const.p("dlsname", "")
    nullable..charUTF8.const.p("encryptionkey", "")
    int("maxpolyphony", "")
    nullable..opaque_p("userdata", "")
    FMOD_SOUND_TYPE("suggestedsoundtype", "")
    nullable..FMOD_FILE_OPEN_CALLBACK("fileuseropen", "")
    nullable..FMOD_FILE_CLOSE_CALLBACK("fileuserclose", "")
    nullable..FMOD_FILE_READ_CALLBACK("fileuserread", "")
    nullable..FMOD_FILE_SEEK_CALLBACK("fileuserseek", "")
    nullable..FMOD_FILE_ASYNCREAD_CALLBACK("fileuserasyncread", "")
    nullable..FMOD_FILE_ASYNCCANCEL_CALLBACK("fileuserasynccancel", "")
    nullable..opaque_p("fileuserdata", "")
    int("filebuffersize", "")
    FMOD_CHANNELORDER("channelorder", "")
    nullable..FMOD_SOUNDGROUP.p("initialsoundgroup", "")
    unsigned_int("initialseekposition", "")
    FMOD_TIMEUNIT("initialseekpostype", "")
    int("ignoresetfilesystem", "")
    unsigned_int("audioqueuepolicy", "")
    unsigned_int("minmidigranularity", "")
    int("nonblockthreadid", "")
    nullable..FMOD_GUID.p("fsbguid", "")
}

val FMOD_REVERB_PROPERTIES = struct(Module.FMOD, "FMOD_REVERB_PROPERTIES") {
    float("DecayTime", "")
    float("EarlyDelay", "")
    float("LateDelay", "")
    float("HFReference", "")
    float("HFDecayRatio", "")
    float("Diffusion", "")
    float("Density", "")
    float("LowShelfFrequency", "")
    float("LowShelfGain", "")
    float("HighCut", "")
    float("EarlyLateMix", "")
    float("WetLevel", "")
}

val FMOD_ERRORCALLBACK_INFO = struct(Module.FMOD, "FMOD_ERRORCALLBACK_INFO") {
    FMOD_RESULT("result", "")
    FMOD_ERRORCALLBACK_INSTANCETYPE("instancetype", "")
    opaque_p("instance", "")
    charUTF8.const.p("functionname", "")
    charUTF8.const.p("functionparams", "")
}

val FMOD_CPU_USAGE = struct(Module.FMOD, "FMOD_CPU_USAGE") {
    float("dsp", "")
    float("stream", "")
    float("geometry", "")
    float("update", "")
    float("convolution1", "")
    float("convolution2", "")
}

val FMOD_CODEC_OPEN_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_CODEC_OPEN_CALLBACK",
        "Codec callbacks",

        _FMOD_CODEC_STATE.p("codec_state", ""),
        FMOD_MODE("usermode", ""),
        nullable..FMOD_CREATESOUNDEXINFO.p("userexinfo", ""),

        nativeType = "FMOD_CODEC_OPEN_CALLBACK"
    )
}

val FMOD_CODEC_CLOSE_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_CODEC_CLOSE_CALLBACK",
        "",

        _FMOD_CODEC_STATE.p("codec_state", ""),

        nativeType = "FMOD_CODEC_CLOSE_CALLBACK"
    )
}

val FMOD_CODEC_READ_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_CODEC_READ_CALLBACK",
        "",

        _FMOD_CODEC_STATE.p("codec_state", ""),
        Unsafe..void.p("buffer", ""),
        unsigned_int("samples_in", ""),
        Check(1)..unsigned_int.p("samples_out", ""),

        nativeType = "FMOD_CODEC_READ_CALLBACK"
    )
}

val FMOD_CODEC_GETLENGTH_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_CODEC_GETLENGTH_CALLBACK",
        "",

        _FMOD_CODEC_STATE.p("codec_state", ""),
        Check(1)..unsigned_int.p("length", ""),
        FMOD_TIMEUNIT("lengthtype", ""),

        nativeType = "FMOD_CODEC_GETLENGTH_CALLBACK"
    )
}

val FMOD_CODEC_SETPOSITION_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_CODEC_SETPOSITION_CALLBACK",
        "",

        _FMOD_CODEC_STATE.p("codec_state", ""),
        int("subsound", ""),
        unsigned_int("position", ""),
        FMOD_TIMEUNIT("postype", ""),

        nativeType = "FMOD_CODEC_SETPOSITION_CALLBACK"
    )
}

val FMOD_CODEC_GETPOSITION_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_CODEC_GETPOSITION_CALLBACK",
        "",

        _FMOD_CODEC_STATE.p("codec_state", ""),
        Check(1)..unsigned_int.p("position", ""),
        FMOD_TIMEUNIT("postype", ""),

        nativeType = "FMOD_CODEC_GETPOSITION_CALLBACK"
    )
}

val FMOD_CODEC_SOUNDCREATE_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_CODEC_SOUNDCREATE_CALLBACK",
        "",

        _FMOD_CODEC_STATE.p("codec_state", ""),
        int("subsound", ""),
        FMOD_SOUND.p("sound", ""),

        nativeType = "FMOD_CODEC_SOUNDCREATE_CALLBACK"
    )
}

val FMOD_CODEC_GETWAVEFORMAT_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_CODEC_GETWAVEFORMAT_CALLBACK",
        "",

        _FMOD_CODEC_STATE.p("codec_state", ""),
        int("index", ""),
        _FMOD_CODEC_WAVEFORMAT.p("waveformat", ""),

        nativeType = "FMOD_CODEC_GETWAVEFORMAT_CALLBACK"
    )
}

val FMOD_CODEC_METADATA_FUNC = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_CODEC_METADATA_FUNC",
        "Codec functions",

        _FMOD_CODEC_STATE.p("codec_state", ""),
        FMOD_TAGTYPE("tagtype", ""),
        charUTF8.p("name", ""),
        void.p("data", ""),
        AutoSize("data")..unsigned_int("datalen", ""),
        FMOD_TAGDATATYPE("datatype", ""),
        int("unique", ""),

        nativeType = "FMOD_CODEC_METADATA_FUNC"
    )
}

val FMOD_CODEC_ALLOC_FUNC = Module.FMOD.callback {
    void.p(
        "FMOD_CODEC_ALLOC_FUNC",
        "",

        AutoSizeResult..unsigned_int("size", ""),
        unsigned_int("align", ""),
        charUTF8.const.p("file", ""),
        int("line", ""),

        nativeType = "FMOD_CODEC_ALLOC_FUNC"
    )
}

val FMOD_CODEC_FREE_FUNC = Module.FMOD.callback {
    void(
        "FMOD_CODEC_FREE_FUNC",
        "",

        opaque_p("ptr", ""),
        charUTF8.const.p("file", ""),
        int("line", ""),

        nativeType = "FMOD_CODEC_FREE_FUNC"
    )
}

val FMOD_CODEC_LOG_FUNC = Module.FMOD.callback {
    void(
        "FMOD_CODEC_LOG_FUNC",
        "",

        FMOD_DEBUG_FLAGS("level", ""),
        charUTF8.const.p("file", ""),
        int("line", ""),
        charUTF8.const.p("function", ""),
        charUTF8.const.p("string", ""),

        nativeType = "FMOD_CODEC_LOG_FUNC"
    )
}

val FMOD_CODEC_FILE_READ_FUNC = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_CODEC_FILE_READ_FUNC",
        "",

        _FMOD_CODEC_STATE.p("codec_state", ""),
        void.p("buffer", ""),
        AutoSize("buffer")..unsigned_int("sizebytes", ""),
        Check(1)..unsigned_int.p("bytesread", ""),

        nativeType = "FMOD_CODEC_FILE_READ_FUNC"
    )
}

val FMOD_CODEC_FILE_SEEK_FUNC = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_CODEC_FILE_SEEK_FUNC",
        "",

        _FMOD_CODEC_STATE.p("codec_state", ""),
        unsigned_int("pos", ""),
        FMOD_CODEC_SEEK_METHOD("method", ""),

        nativeType = "FMOD_CODEC_FILE_SEEK_FUNC"
    )
}

val FMOD_CODEC_FILE_TELL_FUNC = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_CODEC_FILE_TELL_FUNC",
        "",

        _FMOD_CODEC_STATE.p("codec_state", ""),
        Check(1)..unsigned_int.p("pos", ""),

        nativeType = "FMOD_CODEC_FILE_TELL_FUNC"
    )
}

val FMOD_CODEC_FILE_SIZE_FUNC = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_CODEC_FILE_SIZE_FUNC",
        "",

        _FMOD_CODEC_STATE.p("codec_state", ""),
        Check(1)..unsigned_int.p("size", ""),

        nativeType = "FMOD_CODEC_FILE_SIZE_FUNC"
    )
}

val FMOD_CODEC_DESCRIPTION = struct(Module.FMOD, "FMOD_CODEC_DESCRIPTION") {
    documentation = "Codec structures"

    unsigned_int("apiversion", "")
    charUTF8.const.p("name", "")
    unsigned_int("version", "")
    int("defaultasstream", "")
    FMOD_TIMEUNIT("timeunits", "")
    FMOD_CODEC_OPEN_CALLBACK("open", "")
    FMOD_CODEC_CLOSE_CALLBACK("close", "")
    FMOD_CODEC_READ_CALLBACK("read", "")
    FMOD_CODEC_GETLENGTH_CALLBACK("getlength", "")
    FMOD_CODEC_SETPOSITION_CALLBACK("setposition", "")
    FMOD_CODEC_GETPOSITION_CALLBACK("getposition", "")
    FMOD_CODEC_SOUNDCREATE_CALLBACK("soundcreate", "")
    FMOD_CODEC_GETWAVEFORMAT_CALLBACK("getwaveformat", "")
}

val FMOD_CODEC_WAVEFORMAT = struct(Module.FMOD, "FMOD_CODEC_WAVEFORMAT", nativeName = "struct FMOD_CODEC_WAVEFORMAT") {
    nullable..charUTF8.const.p("name", "")
    FMOD_SOUND_FORMAT("format", "")
    int("channels", "")
    int("frequency", "")
    unsigned_int("lengthbytes", "")
    unsigned_int("lengthpcm", "")
    unsigned_int("pcmblocksize", "")
    int("loopstart", "")
    int("loopend", "")
    FMOD_MODE("mode", "")
    FMOD_CHANNELMASK("channelmask", "")
    FMOD_CHANNELORDER("channelorder", "")
    float("peakvolume", "")
}

val FMOD_CODEC_STATE_FUNCTIONS = struct(Module.FMOD, "FMOD_CODEC_STATE_FUNCTIONS") {
    FMOD_CODEC_METADATA_FUNC("metadata", "")
    FMOD_CODEC_ALLOC_FUNC("alloc", "")
    FMOD_CODEC_FREE_FUNC("free", "")
    FMOD_CODEC_LOG_FUNC("log", "")
    FMOD_CODEC_FILE_READ_FUNC("read", "")
    FMOD_CODEC_FILE_SEEK_FUNC("seek", "")
    FMOD_CODEC_FILE_TELL_FUNC("tell", "")
    FMOD_CODEC_FILE_SIZE_FUNC("size", "")
}

val FMOD_CODEC_STATE = struct(Module.FMOD, "FMOD_CODEC_STATE", nativeName = "struct FMOD_CODEC_STATE") {
    void.p("plugindata", "")
    Check("Math.max(1, numsubsounds)")..FMOD_CODEC_WAVEFORMAT.p("waveformat", "")
    FMOD_CODEC_STATE_FUNCTIONS.p("functions", "")
    int("numsubsounds", "")
}

val FMOD_DSP_LOUDNESS_METER_INFO_TYPE = struct(Module.FMOD, "FMOD_DSP_LOUDNESS_METER_INFO_TYPE") {
    float("momentaryloudness", "")
    float("shorttermloudness", "")
    float("integratedloudness", "")
    float("loudness10thpercentile", "")
    float("loudness95thpercentile", "")
    float("loudnesshistogram", "")[66]
    float("maxtruepeak", "")
    float("maxmomentaryloudness", "")
}

val FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE = struct(Module.FMOD, "FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE") {
    float("channelweight", "")[32]
}

val FMOD_DSP_CREATE_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_CREATE_CALLBACK",
        "DSP Callbacks",

        _FMOD_DSP_STATE.p("dsp_state", ""),

        nativeType = "FMOD_DSP_CREATE_CALLBACK"
    )
}

val FMOD_DSP_RELEASE_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_RELEASE_CALLBACK",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),

        nativeType = "FMOD_DSP_RELEASE_CALLBACK"
    )
}

val FMOD_DSP_RESET_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_RESET_CALLBACK",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),

        nativeType = "FMOD_DSP_RESET_CALLBACK"
    )
}

val FMOD_DSP_READ_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_READ_CALLBACK",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        float.p("inbuffer", ""),
        float.p("outbuffer", ""),
        AutoSize("inbuffer", "outbuffer")..unsigned_int("length", ""),
        int("inchannels", ""),
        Check(1)..int.p("outchannels", ""),

        nativeType = "FMOD_DSP_READ_CALLBACK"
    )
}

val FMOD_DSP_PROCESS_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_PROCESS_CALLBACK",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        AutoSize("inbufferarray", "outbufferarray")..unsigned_int("length", ""),
        _FMOD_DSP_BUFFER_ARRAY.const.p("inbufferarray", ""),
        _FMOD_DSP_BUFFER_ARRAY.p("outbufferarray", ""),
        FMOD_BOOL("inputsidle", ""),
        FMOD_DSP_PROCESS_OPERATION("op", ""),

        nativeType = "FMOD_DSP_PROCESS_CALLBACK"
    )
}

val FMOD_DSP_SETPOSITION_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_SETPOSITION_CALLBACK",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        unsigned_int("pos", ""),

        nativeType = "FMOD_DSP_SETPOSITION_CALLBACK"
    )
}

val FMOD_DSP_SHOULDIPROCESS_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_SHOULDIPROCESS_CALLBACK",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        FMOD_BOOL("inputsidle", ""),
        unsigned_int("length", ""),
        FMOD_CHANNELMASK("inmask", ""),
        int("inchannels", ""),
        FMOD_SPEAKERMODE("speakermode", ""),

        nativeType = "FMOD_DSP_SHOULDIPROCESS_CALLBACK"
    )
}

val FMOD_DSP_SETPARAM_FLOAT_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_SETPARAM_FLOAT_CALLBACK",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        int("index", ""),
        float("value", ""),

        nativeType = "FMOD_DSP_SETPARAM_FLOAT_CALLBACK"
    )
}

val FMOD_DSP_SETPARAM_INT_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_SETPARAM_INT_CALLBACK",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        int("index", ""),
        int("value", ""),

        nativeType = "FMOD_DSP_SETPARAM_INT_CALLBACK"
    )
}

val FMOD_DSP_SETPARAM_BOOL_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_SETPARAM_BOOL_CALLBACK",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        int("index", ""),
        FMOD_BOOL("value", ""),

        nativeType = "FMOD_DSP_SETPARAM_BOOL_CALLBACK"
    )
}

val FMOD_DSP_SETPARAM_DATA_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_SETPARAM_DATA_CALLBACK",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        int("index", ""),
        void.p("data", ""),
        AutoSize("data")..unsigned_int("length", ""),

        nativeType = "FMOD_DSP_SETPARAM_DATA_CALLBACK"
    )
}

val FMOD_DSP_GETPARAM_FLOAT_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_GETPARAM_FLOAT_CALLBACK",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        int("index", ""),
        Check(1)..float.p("value", ""),
        nullable..Check("FMOD_DSP_GETPARAM_VALUESTR_LENGTH")..char.p("valuestr", ""),

        nativeType = "FMOD_DSP_GETPARAM_FLOAT_CALLBACK"
    )
}

val FMOD_DSP_GETPARAM_INT_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_GETPARAM_INT_CALLBACK",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        int("index", ""),
        Check(1)..int.p("value", ""),
        nullable..Check("FMOD_DSP_GETPARAM_VALUESTR_LENGTH")..char.p("valuestr", ""),

        nativeType = "FMOD_DSP_GETPARAM_INT_CALLBACK"
    )
}

val FMOD_DSP_GETPARAM_BOOL_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_GETPARAM_BOOL_CALLBACK",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        int("index", ""),
        Check(1)..FMOD_BOOL.p("value", ""),
        nullable..Check("FMOD_DSP_GETPARAM_VALUESTR_LENGTH")..char.p("valuestr", ""),

        nativeType = "FMOD_DSP_GETPARAM_BOOL_CALLBACK"
    )
}

val FMOD_DSP_GETPARAM_DATA_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_GETPARAM_DATA_CALLBACK",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        int("index", ""),
        Check(1)..void.p.p("data", ""),
        Check(1)..unsigned_int.p("length", ""),
        nullable..Check("FMOD_DSP_GETPARAM_VALUESTR_LENGTH")..char.p("valuestr", ""),

        nativeType = "FMOD_DSP_GETPARAM_DATA_CALLBACK"
    )
}

val FMOD_DSP_SYSTEM_REGISTER_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_SYSTEM_REGISTER_CALLBACK",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),

        nativeType = "FMOD_DSP_SYSTEM_REGISTER_CALLBACK"
    )
}

val FMOD_DSP_SYSTEM_DEREGISTER_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_SYSTEM_DEREGISTER_CALLBACK",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),

        nativeType = "FMOD_DSP_SYSTEM_DEREGISTER_CALLBACK"
    )
}

val FMOD_DSP_SYSTEM_MIX_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_SYSTEM_MIX_CALLBACK",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        int("stage", ""),

        nativeType = "FMOD_DSP_SYSTEM_MIX_CALLBACK"
    )
}

val FMOD_DSP_ALLOC_FUNC = Module.FMOD.callback {
    void.p(
        "FMOD_DSP_ALLOC_FUNC",
        "DSP Functions",

        AutoSizeResult..unsigned_int("size", ""),
        FMOD_MEMORY_TYPE("type", ""),
        nullable..charUTF8.const.p("sourcestr", ""),

        nativeType = "FMOD_DSP_ALLOC_FUNC"
    )
}

val FMOD_DSP_REALLOC_FUNC = Module.FMOD.callback {
    void.p(
        "FMOD_DSP_REALLOC_FUNC",
        "",

        opaque_p("ptr", ""),
        AutoSizeResult..unsigned_int("size", ""),
        FMOD_MEMORY_TYPE("type", ""),
        nullable..charUTF8.const.p("sourcestr", ""),

        nativeType = "FMOD_DSP_REALLOC_FUNC"
    )
}

val FMOD_DSP_FREE_FUNC = Module.FMOD.callback {
    void(
        "FMOD_DSP_FREE_FUNC",
        "",

        opaque_p("ptr", ""),
        FMOD_MEMORY_TYPE("type", ""),
        nullable..charUTF8.const.p("sourcestr", ""),

        nativeType = "FMOD_DSP_FREE_FUNC"
    )
}

val FMOD_DSP_LOG_FUNC = Module.FMOD.callback {
    void(
        "FMOD_DSP_LOG_FUNC",
        "",

        FMOD_DEBUG_FLAGS("level", ""),
        charUTF8.const.p("file", ""),
        int("line", ""),
        charUTF8.const.p("function", ""),
        charUTF8.const.p("str", ""),

        nativeType = "FMOD_DSP_LOG_FUNC"
    )
}

val FMOD_DSP_GETSAMPLERATE_FUNC = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_GETSAMPLERATE_FUNC",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        Check(1)..int.p("rate", ""),

        nativeType = "FMOD_DSP_GETSAMPLERATE_FUNC"
    )
}

val FMOD_DSP_GETBLOCKSIZE_FUNC = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_GETBLOCKSIZE_FUNC",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        Check(1)..unsigned_int.p("blocksize", ""),

        nativeType = "FMOD_DSP_GETBLOCKSIZE_FUNC"
    )
}

val FMOD_DSP_GETSPEAKERMODE_FUNC = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_GETSPEAKERMODE_FUNC",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        nullable..Check(1)..FMOD_SPEAKERMODE.p("speakermode_mixer", ""),
        nullable..Check(1)..FMOD_SPEAKERMODE.p("speakermode_output", ""),

        nativeType = "FMOD_DSP_GETSPEAKERMODE_FUNC"
    )
}

val FMOD_DSP_GETCLOCK_FUNC = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_GETCLOCK_FUNC",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        nullable..Check(1)..unsigned_long_long.p("clock", ""),
        nullable..Check(1)..unsigned_int.p("offset", ""),
        nullable..Check(1)..unsigned_int.p("length", ""),

        nativeType = "FMOD_DSP_GETCLOCK_FUNC"
    )
}

val FMOD_DSP_GETLISTENERATTRIBUTES_FUNC = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_GETLISTENERATTRIBUTES_FUNC",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        Check(1)..int.p("numlisteners", ""),
        FMOD_3D_ATTRIBUTES.p("attributes", ""),

        nativeType = "FMOD_DSP_GETLISTENERATTRIBUTES_FUNC"
    )
}

val FMOD_DSP_GETUSERDATA_FUNC = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_GETUSERDATA_FUNC",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        Check(1)..void.p.p("userdata", ""),

        nativeType = "FMOD_DSP_GETUSERDATA_FUNC"
    )
}

val FMOD_DSP_DFT_FFTREAL_FUNC = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_DFT_FFTREAL_FUNC",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        int("size", ""),
        float.const.p("signal", ""),
        _FMOD_COMPLEX.p("dft", ""),
        float.const.p("window", ""),
        int("signalhop", ""),

        nativeType = "FMOD_DSP_DFT_FFTREAL_FUNC"
    )
}

val FMOD_DSP_DFT_IFFTREAL_FUNC = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_DFT_IFFTREAL_FUNC",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        int("size", ""),
        _FMOD_COMPLEX.const.p("dft", ""),
        float.p("signal", ""),
        float.const.p("window", ""),
        int("signalhop", ""),

        nativeType = "FMOD_DSP_DFT_IFFTREAL_FUNC"
    )
}

val FMOD_DSP_PAN_SUMMONOMATRIX_FUNC = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_PAN_SUMMONOMATRIX_FUNC",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        FMOD_SPEAKERMODE("sourceSpeakerMode", ""),
        float("lowFrequencyGain", ""),
        float("overallGain", ""),
        float.p("matrix", ""),

        nativeType = "FMOD_DSP_PAN_SUMMONOMATRIX_FUNC"
    )
}

val FMOD_DSP_PAN_SUMSTEREOMATRIX_FUNC = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_PAN_SUMSTEREOMATRIX_FUNC",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        FMOD_SPEAKERMODE("sourceSpeakerMode", ""),
        float("pan", ""),
        float("lowFrequencyGain", ""),
        float("overallGain", ""),
        int("matrixHop", ""),
        float.p("matrix", ""),

        nativeType = "FMOD_DSP_PAN_SUMSTEREOMATRIX_FUNC"
    )
}

val FMOD_DSP_PAN_SUMSURROUNDMATRIX_FUNC = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_PAN_SUMSURROUNDMATRIX_FUNC",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        FMOD_SPEAKERMODE("sourceSpeakerMode", ""),
        FMOD_SPEAKERMODE("targetSpeakerMode", ""),
        float("direction", ""),
        float("extent", ""),
        float("rotation", ""),
        float("lowFrequencyGain", ""),
        float("overallGain", ""),
        int("matrixHop", ""),
        float.p("matrix", ""),
        FMOD_DSP_PAN_SURROUND_FLAGS("flags", ""),

        nativeType = "FMOD_DSP_PAN_SUMSURROUNDMATRIX_FUNC"
    )
}

val FMOD_DSP_PAN_SUMMONOTOSURROUNDMATRIX_FUNC = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_PAN_SUMMONOTOSURROUNDMATRIX_FUNC",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        FMOD_SPEAKERMODE("targetSpeakerMode", ""),
        float("direction", ""),
        float("extent", ""),
        float("lowFrequencyGain", ""),
        float("overallGain", ""),
        int("matrixHop", ""),
        float.p("matrix", ""),

        nativeType = "FMOD_DSP_PAN_SUMMONOTOSURROUNDMATRIX_FUNC"
    )
}

val FMOD_DSP_PAN_SUMSTEREOTOSURROUNDMATRIX_FUNC = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_PAN_SUMSTEREOTOSURROUNDMATRIX_FUNC",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        FMOD_SPEAKERMODE("targetSpeakerMode", ""),
        float("direction", ""),
        float("extent", ""),
        float("rotation", ""),
        float("lowFrequencyGain", ""),
        float("overallGain", ""),
        int("matrixHop", ""),
        float.p("matrix", ""),

        nativeType = "FMOD_DSP_PAN_SUMSTEREOTOSURROUNDMATRIX_FUNC"
    )
}

val FMOD_DSP_PAN_GETROLLOFFGAIN_FUNC = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_DSP_PAN_GETROLLOFFGAIN_FUNC",
        "",

        _FMOD_DSP_STATE.p("dsp_state", ""),
        FMOD_DSP_PAN_3D_ROLLOFF_TYPE("rolloff", ""),
        float("distance", ""),
        float("mindistance", ""),
        float("maxdistance", ""),
        float.p("gain", ""),

        nativeType = "FMOD_DSP_PAN_GETROLLOFFGAIN_FUNC"
    )
}

val FMOD_DSP_BUFFER_ARRAY = struct(Module.FMOD, "FMOD_DSP_BUFFER_ARRAY", nativeName = "struct FMOD_DSP_BUFFER_ARRAY") {
    documentation = "DSP Structures"

    AutoSize("buffers", "buffernumchannels", "bufferchannelmask")..int("numbuffers", "")
    int.p("buffernumchannels", "")
    FMOD_CHANNELMASK.p("bufferchannelmask", "")
    float.p.p("buffers", "")
    FMOD_SPEAKERMODE("speakermode", "")
}

val FMOD_COMPLEX = struct(Module.FMOD, "FMOD_COMPLEX", nativeName = "struct FMOD_COMPLEX") {
    float("real", "")
    float("imag", "")
}

val FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR = struct(Module.FMOD, "FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR") {
    AutoSize("pointparamvalues", "pointpositions")..int("numpoints", "")
    float.p("pointparamvalues", "")
    nullable..float.p("pointpositions", "")
}

val FMOD_DSP_PARAMETER_FLOAT_MAPPING = struct(Module.FMOD, "FMOD_DSP_PARAMETER_FLOAT_MAPPING") {
    FMOD_DSP_PARAMETER_FLOAT_MAPPING_TYPE("type", "")
    FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR("piecewiselinearmapping", "")
}

val FMOD_DSP_PARAMETER_DESC_FLOAT = struct(Module.FMOD, "FMOD_DSP_PARAMETER_DESC_FLOAT") {
    float("min", "")
    float("max", "")
    float("defaultval", "")
    FMOD_DSP_PARAMETER_FLOAT_MAPPING("mapping", "")
}

val FMOD_DSP_PARAMETER_DESC_INT = struct(Module.FMOD, "FMOD_DSP_PARAMETER_DESC_INT") {
    int("min", "")
    int("max", "")
    int("defaultval", "")
    FMOD_BOOL("goestoinf", "")
    Check("max - min + 1")..nullable..charUTF8.const.p.const.p("valuenames", "")
}

val FMOD_DSP_PARAMETER_DESC_BOOL = struct(Module.FMOD, "FMOD_DSP_PARAMETER_DESC_BOOL") {
    FMOD_BOOL("defaultval", "")
    nullable..Check(2)..charUTF8.const.p.const.p("valuenames", "")
}

val FMOD_DSP_PARAMETER_DESC_DATA = struct(Module.FMOD, "FMOD_DSP_PARAMETER_DESC_DATA") {
    int("datatype", "")
}

val FMOD_DSP_PARAMETER_DESC = struct(Module.FMOD, "FMOD_DSP_PARAMETER_DESC") {
    FMOD_DSP_PARAMETER_TYPE("type", "")
    char("name", "")[16]
    char("label", "")[16]
    charUTF8.const.p("description", "")
    union {
        FMOD_DSP_PARAMETER_DESC_FLOAT("floatdesc", "")
        FMOD_DSP_PARAMETER_DESC_INT("intdesc", "")
        FMOD_DSP_PARAMETER_DESC_BOOL("booldesc", "")
        FMOD_DSP_PARAMETER_DESC_DATA("datadesc", "")
    }
}

val FMOD_DSP_PARAMETER_OVERALLGAIN = struct(Module.FMOD, "FMOD_DSP_PARAMETER_OVERALLGAIN") {
    float("linear_gain", "")
    float("linear_gain_additive", "")
}

val FMOD_DSP_PARAMETER_3DATTRIBUTES = struct(Module.FMOD, "FMOD_DSP_PARAMETER_3DATTRIBUTES") {
    FMOD_3D_ATTRIBUTES("relative", "")
    FMOD_3D_ATTRIBUTES("absolute", "")
}

val FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI = struct(Module.FMOD, "FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI") {
    int("numlisteners", "")
    FMOD_3D_ATTRIBUTES("relative", "")[8]
    float("weight", "")[8]
    FMOD_3D_ATTRIBUTES("absolute", "")
}

val FMOD_DSP_PARAMETER_ATTENUATION_RANGE = struct(Module.FMOD, "FMOD_DSP_PARAMETER_ATTENUATION_RANGE") {
    float("min", "")
    float("max", "")
}

val FMOD_DSP_PARAMETER_SIDECHAIN = struct(Module.FMOD, "FMOD_DSP_PARAMETER_SIDECHAIN") {
    FMOD_BOOL("sidechainenable", "")
}

val FMOD_DSP_PARAMETER_FFT = struct(Module.FMOD, "FMOD_DSP_PARAMETER_FFT") {
    int("length", "")
    int("numchannels", "")
    float.p("spectrum", "")[32]
}

val FMOD_DSP_DESCRIPTION = struct(Module.FMOD, "FMOD_DSP_DESCRIPTION") {
    unsigned_int("pluginsdkversion", "")
    char("name", "")[32]
    unsigned_int("version", "")
    int("numinputbuffers", "")
    int("numoutputbuffers", "")
    nullable..FMOD_DSP_CREATE_CALLBACK("create", "")
    nullable..FMOD_DSP_RELEASE_CALLBACK("release", "")
    FMOD_DSP_RESET_CALLBACK("reset", "")
    nullable..FMOD_DSP_READ_CALLBACK("read", "")
    nullable..FMOD_DSP_PROCESS_CALLBACK("process", "")
    nullable..FMOD_DSP_SETPOSITION_CALLBACK("setposition", "")
    AutoSize("paramdesc")..int("numparameters", "")
    FMOD_DSP_PARAMETER_DESC.p.p("paramdesc", "")
    nullable..FMOD_DSP_SETPARAM_FLOAT_CALLBACK("setparameterfloat", "")
    nullable..FMOD_DSP_SETPARAM_INT_CALLBACK("setparameterint", "")
    nullable..FMOD_DSP_SETPARAM_BOOL_CALLBACK("setparameterbool", "")
    nullable..FMOD_DSP_SETPARAM_DATA_CALLBACK("setparameterdata", "")
    nullable..FMOD_DSP_GETPARAM_FLOAT_CALLBACK("getparameterfloat", "")
    nullable..FMOD_DSP_GETPARAM_INT_CALLBACK("getparameterint", "")
    nullable..FMOD_DSP_GETPARAM_BOOL_CALLBACK("getparameterbool", "")
    nullable..FMOD_DSP_GETPARAM_DATA_CALLBACK("getparameterdata", "")
    FMOD_DSP_SHOULDIPROCESS_CALLBACK("shouldiprocess", "")
    nullable..opaque_p("userdata", "")
    nullable..FMOD_DSP_SYSTEM_REGISTER_CALLBACK("sys_register", "")
    nullable..FMOD_DSP_SYSTEM_DEREGISTER_CALLBACK("sys_deregister", "")
    nullable..FMOD_DSP_SYSTEM_MIX_CALLBACK("sys_mix", "")
}

val FMOD_DSP_STATE_DFT_FUNCTIONS = struct(Module.FMOD, "FMOD_DSP_STATE_DFT_FUNCTIONS") {
    FMOD_DSP_DFT_FFTREAL_FUNC("fftreal", "")
    FMOD_DSP_DFT_IFFTREAL_FUNC("inversefftreal", "")
}

val FMOD_DSP_STATE_PAN_FUNCTIONS = struct(Module.FMOD, "FMOD_DSP_STATE_PAN_FUNCTIONS") {
    FMOD_DSP_PAN_SUMMONOMATRIX_FUNC("summonomatrix", "")
    FMOD_DSP_PAN_SUMSTEREOMATRIX_FUNC("sumstereomatrix", "")
    FMOD_DSP_PAN_SUMSURROUNDMATRIX_FUNC("sumsurroundmatrix", "")
    FMOD_DSP_PAN_SUMMONOTOSURROUNDMATRIX_FUNC("summonotosurroundmatrix", "")
    FMOD_DSP_PAN_SUMSTEREOTOSURROUNDMATRIX_FUNC("sumstereotosurroundmatrix", "")
    FMOD_DSP_PAN_GETROLLOFFGAIN_FUNC("getrolloffgain", "")
}

val FMOD_DSP_STATE_FUNCTIONS = struct(Module.FMOD, "FMOD_DSP_STATE_FUNCTIONS") {
    FMOD_DSP_ALLOC_FUNC("alloc", "")
    FMOD_DSP_REALLOC_FUNC("realloc", "")
    FMOD_DSP_FREE_FUNC("free", "")
    FMOD_DSP_GETSAMPLERATE_FUNC("getsamplerate", "")
    FMOD_DSP_GETBLOCKSIZE_FUNC("getblocksize", "")
    FMOD_DSP_STATE_DFT_FUNCTIONS.p("dft", "")
    FMOD_DSP_STATE_PAN_FUNCTIONS.p("pan", "")
    FMOD_DSP_GETSPEAKERMODE_FUNC("getspeakermode", "")
    FMOD_DSP_GETCLOCK_FUNC("getclock", "")
    FMOD_DSP_GETLISTENERATTRIBUTES_FUNC("getlistenerattributes", "")
    FMOD_DSP_LOG_FUNC("log", "")
    FMOD_DSP_GETUSERDATA_FUNC("getuserdata", "")
}

val FMOD_DSP_STATE = struct(Module.FMOD, "FMOD_DSP_STATE", nativeName = "struct FMOD_DSP_STATE") {
    opaque_p("instance", "")
    opaque_p("plugindata", "")
    FMOD_CHANNELMASK("channelmask", "")
    FMOD_SPEAKERMODE("source_speakermode", "")
    float.p("sidechaindata", "")
    AutoSize("sidechaindata")..int("sidechainchannels", "")
    FMOD_DSP_STATE_FUNCTIONS.p("functions", "")
    int("systemobject", "")
}

val FMOD_DSP_METERING_INFO = struct(Module.FMOD, "FMOD_DSP_METERING_INFO") {
    int("numsamples", "")
    float("peaklevel", "")[32]
    float("rmslevel", "")[32]
    short("numchannels", "")
}

val FMOD_OUTPUT_GETNUMDRIVERS_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_OUTPUT_GETNUMDRIVERS_CALLBACK",
        "Output callbacks",

        _FMOD_OUTPUT_STATE.p("output_state", ""),
        Check(1)..int.p("numdrivers", ""),

        nativeType = "FMOD_OUTPUT_GETNUMDRIVERS_CALLBACK"
    )
}

val FMOD_OUTPUT_GETDRIVERINFO_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_OUTPUT_GETDRIVERINFO_CALLBACK",
        "",

        _FMOD_OUTPUT_STATE.p("output_state", ""),
        int("id", ""),
        char.p("name", ""),
        AutoSize("name")..int("namelen", ""),
        FMOD_GUID.p("guid", ""),
        nullable..Check(1)..int.p("systemrate", ""),
        nullable..FMOD_SPEAKERMODE.p("speakermode", ""),
        nullable..int.p("speakermodechannels", ""),

        nativeType = "FMOD_OUTPUT_GETDRIVERINFO_CALLBACK"
    )
}

val FMOD_OUTPUT_INIT_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_OUTPUT_INIT_CALLBACK",
        "",

        _FMOD_OUTPUT_STATE.p("output_state", ""),
        int("selecteddriver", ""),
        FMOD_INITFLAGS("flags", ""),
        Check(1)..int.p("outputrate", ""),
        Check(1)..FMOD_SPEAKERMODE.p("speakermode", ""),
        Check(1)..int.p("speakermodechannels", ""),
        Check(1)..FMOD_SOUND_FORMAT.p("outputformat", ""),
        int("dspbufferlength", ""),
        Check(1)..int.p("dspnumbuffers", ""),
        Check(1)..int.p("dspnumadditionalbuffers", ""),
        nullable..opaque_p("extradriverdata", ""),

        nativeType = "FMOD_OUTPUT_INIT_CALLBACK"
    )
}

val FMOD_OUTPUT_START_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_OUTPUT_START_CALLBACK",
        "",

        _FMOD_OUTPUT_STATE.p("output_state", ""),

        nativeType = "FMOD_OUTPUT_START_CALLBACK"
    )
}

val FMOD_OUTPUT_STOP_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_OUTPUT_STOP_CALLBACK",
        "",

        _FMOD_OUTPUT_STATE.p("output_state", ""),

        nativeType = "FMOD_OUTPUT_STOP_CALLBACK"
    )
}

val FMOD_OUTPUT_CLOSE_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_OUTPUT_CLOSE_CALLBACK",
        "",

        _FMOD_OUTPUT_STATE.p("output_state", ""),

        nativeType = "FMOD_OUTPUT_CLOSE_CALLBACK"
    )
}

val FMOD_OUTPUT_UPDATE_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_OUTPUT_UPDATE_CALLBACK",
        "",

        _FMOD_OUTPUT_STATE.p("output_state", ""),

        nativeType = "FMOD_OUTPUT_UPDATE_CALLBACK"
    )
}

val FMOD_OUTPUT_GETHANDLE_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_OUTPUT_GETHANDLE_CALLBACK",
        "",

        _FMOD_OUTPUT_STATE.p("output_state", ""),
        Check(1)..void.p.p("handle", ""),

        nativeType = "FMOD_OUTPUT_GETHANDLE_CALLBACK"
    )
}

val FMOD_OUTPUT_MIXER_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_OUTPUT_MIXER_CALLBACK",
        "",

        _FMOD_OUTPUT_STATE.p("output_state", ""),

        nativeType = "FMOD_OUTPUT_MIXER_CALLBACK"
    )
}

val FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK",
        "",

        _FMOD_OUTPUT_STATE.p("output_state", ""),
        Check(1)..int.p("maxhardwareobjects", ""),

        nativeType = "FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK"
    )
}

val FMOD_OUTPUT_OBJECT3DALLOC_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_OUTPUT_OBJECT3DALLOC_CALLBACK",
        "",

        _FMOD_OUTPUT_STATE.p("output_state", ""),
        Check(1)..void.p.p("object3d", ""),

        nativeType = "FMOD_OUTPUT_OBJECT3DALLOC_CALLBACK"
    )
}

val FMOD_OUTPUT_OBJECT3DFREE_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_OUTPUT_OBJECT3DFREE_CALLBACK",
        "",

        _FMOD_OUTPUT_STATE.p("output_state", ""),
        opaque_p("object3d", ""),

        nativeType = "FMOD_OUTPUT_OBJECT3DFREE_CALLBACK"
    )
}

val FMOD_OUTPUT_OBJECT3DUPDATE_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_OUTPUT_OBJECT3DUPDATE_CALLBACK",
        "",

        _FMOD_OUTPUT_STATE.p("output_state", ""),
        opaque_p("object3d", ""),
        _FMOD_OUTPUT_OBJECT3DINFO.const.p("info", ""),

        nativeType = "FMOD_OUTPUT_OBJECT3DUPDATE_CALLBACK"
    )
}

val FMOD_OUTPUT_OPENPORT_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_OUTPUT_OPENPORT_CALLBACK",
        "",

        _FMOD_OUTPUT_STATE.p("output_state", ""),
        FMOD_PORT_TYPE("portType", ""),
        FMOD_PORT_INDEX("portIndex", ""),
        Check(1)..int.p("portId", ""),
        Check(1)..int.p("portRate", ""),
        Check(1)..int.p("portChannels", ""),
        FMOD_SOUND_FORMAT.p("portFormat", ""),

        nativeType = "FMOD_OUTPUT_OPENPORT_CALLBACK"
    )
}

val FMOD_OUTPUT_CLOSEPORT_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_OUTPUT_CLOSEPORT_CALLBACK",
        "",

        _FMOD_OUTPUT_STATE.p("output_state", ""),
        int("portId", ""),

        nativeType = "FMOD_OUTPUT_CLOSEPORT_CALLBACK"
    )
}

val FMOD_OUTPUT_DEVICELISTCHANGED_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_OUTPUT_DEVICELISTCHANGED_CALLBACK",
        "",

        _FMOD_OUTPUT_STATE.p("output_state", ""),

        nativeType = "FMOD_OUTPUT_DEVICELISTCHANGED_CALLBACK"
    )
}

val FMOD_OUTPUT_READFROMMIXER_FUNC = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_OUTPUT_READFROMMIXER_FUNC",
        "Output functions",

        _FMOD_OUTPUT_STATE.p("output_state", ""),
        void.p("buffer", ""),
        AutoSize("buffer")..unsigned_int("length", ""),

        nativeType = "FMOD_OUTPUT_READFROMMIXER_FUNC"
    )
}

val FMOD_OUTPUT_COPYPORT_FUNC = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_OUTPUT_COPYPORT_FUNC",
        "",

        _FMOD_OUTPUT_STATE.p("output_state", ""),
        int("portId", ""),
        void.p("buffer", ""),
        AutoSize("buffer")..unsigned_int("length", ""),

        nativeType = "FMOD_OUTPUT_COPYPORT_FUNC"
    )
}

val FMOD_OUTPUT_REQUESTRESET_FUNC = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_OUTPUT_REQUESTRESET_FUNC",
        "",

        _FMOD_OUTPUT_STATE.p("output_state", ""),

        nativeType = "FMOD_OUTPUT_REQUESTRESET_FUNC"
    )
}

val FMOD_OUTPUT_ALLOC_FUNC = Module.FMOD.callback {
    void.p(
        "FMOD_OUTPUT_ALLOC_FUNC",
        "",

        AutoSizeResult..unsigned_int("size", ""),
        unsigned_int("align", ""),
        charUTF8.const.p("file", ""),
        int("line", ""),

        nativeType = "FMOD_OUTPUT_ALLOC_FUNC"
    )
}

val FMOD_OUTPUT_FREE_FUNC = Module.FMOD.callback {
    void(
        "FMOD_OUTPUT_FREE_FUNC",
        "",

        opaque_p("ptr", ""),
        charUTF8.const.p("file", ""),
        int("line", ""),

        nativeType = "FMOD_OUTPUT_FREE_FUNC"
    )
}

val FMOD_OUTPUT_LOG_FUNC = Module.FMOD.callback {
    void(
        "FMOD_OUTPUT_LOG_FUNC",
        "",

        FMOD_DEBUG_FLAGS("level", ""),
        charUTF8.const.p("file", ""),
        int("line", ""),
        charUTF8.const.p("function", ""),
        charUTF8.const.p("string", ""),

        nativeType = "FMOD_OUTPUT_LOG_FUNC"
    )
}

val FMOD_OUTPUT_DESCRIPTION = struct(Module.FMOD, "FMOD_OUTPUT_DESCRIPTION") {
    documentation = "Output structures"

    unsigned_int("apiversion", "")
    charUTF8.const.p("name", "")
    unsigned_int("version", "")
    FMOD_OUTPUT_METHOD("method", "")
    FMOD_OUTPUT_GETNUMDRIVERS_CALLBACK("getnumdrivers", "")
    FMOD_OUTPUT_GETDRIVERINFO_CALLBACK("getdriverinfo", "")
    FMOD_OUTPUT_INIT_CALLBACK("init", "")
    nullable..FMOD_OUTPUT_START_CALLBACK("start", "")
    nullable..FMOD_OUTPUT_STOP_CALLBACK("stop", "")
    nullable..FMOD_OUTPUT_CLOSE_CALLBACK("close", "")
    nullable..FMOD_OUTPUT_UPDATE_CALLBACK("update", "")
    nullable..FMOD_OUTPUT_GETHANDLE_CALLBACK("gethandle", "")
    nullable..FMOD_OUTPUT_MIXER_CALLBACK("mixer", "")
    nullable..FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK("object3dgetinfo", "")
    nullable..FMOD_OUTPUT_OBJECT3DALLOC_CALLBACK("object3dalloc", "")
    nullable..FMOD_OUTPUT_OBJECT3DFREE_CALLBACK("object3dfree", "")
    nullable..FMOD_OUTPUT_OBJECT3DUPDATE_CALLBACK("object3dupdate", "")
    nullable..FMOD_OUTPUT_OPENPORT_CALLBACK("openport", "")
    nullable..FMOD_OUTPUT_CLOSEPORT_CALLBACK("closeport", "")
    nullable..FMOD_OUTPUT_DEVICELISTCHANGED_CALLBACK("devicelistchanged", "")
}

val FMOD_OUTPUT_STATE = struct(Module.FMOD, "FMOD_OUTPUT_STATE", nativeName = "struct FMOD_OUTPUT_STATE") {
    opaque_p("plugindata", "")
    FMOD_OUTPUT_READFROMMIXER_FUNC("readfrommixer", "")
    FMOD_OUTPUT_ALLOC_FUNC("alloc", "")
    FMOD_OUTPUT_FREE_FUNC("free", "")
    FMOD_OUTPUT_LOG_FUNC("log", "")
    FMOD_OUTPUT_COPYPORT_FUNC("copyport", "")
    FMOD_OUTPUT_REQUESTRESET_FUNC("requestreset", "")
}

val FMOD_OUTPUT_OBJECT3DINFO = struct(Module.FMOD, "FMOD_OUTPUT_OBJECT3DINFO", nativeName = "struct FMOD_OUTPUT_OBJECT3DINFO") {
    float.p("buffer", "")
    AutoSize("buffer")..unsigned_int("bufferlength", "")
    FMOD_VECTOR("position", "")
    float("gain", "")
    float("spread", "")
    float("priority", "")
}