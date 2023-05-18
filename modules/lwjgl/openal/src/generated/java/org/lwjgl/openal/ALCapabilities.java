/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.lwjgl.system.*;
import java.util.Set;
import org.lwjgl.*;
import java.util.function.IntFunction;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;

/** Defines the capabilities of an OpenAL context. */
public final class ALCapabilities {

    // AL10
    public final long
        alGetError,
        alEnable,
        alDisable,
        alIsEnabled,
        alGetBoolean,
        alGetInteger,
        alGetFloat,
        alGetDouble,
        alGetBooleanv,
        alGetIntegerv,
        alGetFloatv,
        alGetDoublev,
        alGetString,
        alDistanceModel,
        alDopplerFactor,
        alDopplerVelocity,
        alListenerf,
        alListeneri,
        alListener3f,
        alListenerfv,
        alGetListenerf,
        alGetListeneri,
        alGetListener3f,
        alGetListenerfv,
        alGenSources,
        alDeleteSources,
        alIsSource,
        alSourcef,
        alSource3f,
        alSourcefv,
        alSourcei,
        alGetSourcef,
        alGetSource3f,
        alGetSourcefv,
        alGetSourcei,
        alGetSourceiv,
        alSourceQueueBuffers,
        alSourceUnqueueBuffers,
        alSourcePlay,
        alSourcePause,
        alSourceStop,
        alSourceRewind,
        alSourcePlayv,
        alSourcePausev,
        alSourceStopv,
        alSourceRewindv,
        alGenBuffers,
        alDeleteBuffers,
        alIsBuffer,
        alGetBufferf,
        alGetBufferi,
        alBufferData,
        alGetEnumValue,
        alGetProcAddress,
        alIsExtensionPresent;

    // AL11
    public final long
        alListener3i,
        alGetListeneriv,
        alSource3i,
        alListeneriv,
        alSourceiv,
        alBufferf,
        alBuffer3f,
        alBufferfv,
        alBufferi,
        alBuffer3i,
        alBufferiv,
        alGetBufferiv,
        alGetBufferfv,
        alSpeedOfSound;

    // EXT_EFX
    public final long
        alGenEffects,
        alDeleteEffects,
        alIsEffect,
        alEffecti,
        alEffectiv,
        alEffectf,
        alEffectfv,
        alGetEffecti,
        alGetEffectiv,
        alGetEffectf,
        alGetEffectfv,
        alGenFilters,
        alDeleteFilters,
        alIsFilter,
        alFilteri,
        alFilteriv,
        alFilterf,
        alFilterfv,
        alGetFilteri,
        alGetFilteriv,
        alGetFilterf,
        alGetFilterfv,
        alGenAuxiliaryEffectSlots,
        alDeleteAuxiliaryEffectSlots,
        alIsAuxiliaryEffectSlot,
        alAuxiliaryEffectSloti,
        alAuxiliaryEffectSlotiv,
        alAuxiliaryEffectSlotf,
        alAuxiliaryEffectSlotfv,
        alGetAuxiliaryEffectSloti,
        alGetAuxiliaryEffectSlotiv,
        alGetAuxiliaryEffectSlotf,
        alGetAuxiliaryEffectSlotfv;

    // EXT_STATIC_BUFFER
    public final long
        alBufferDataStatic;

    // SOFT_buffer_samples
    public final long
        alBufferSamplesSOFT,
        alBufferSubSamplesSOFT,
        alGetBufferSamplesSOFT,
        alIsBufferFormatSupportedSOFT;

    // SOFT_buffer_sub_data
    public final long
        alBufferSubDataSOFT;

    // SOFT_callback_buffer
    public final long
        alBufferCallbackSOFT,
        alGetBufferPtrSOFT,
        alGetBuffer3PtrSOFT,
        alGetBufferPtrvSOFT;

    // SOFT_deferred_updates
    public final long
        alDeferUpdatesSOFT,
        alProcessUpdatesSOFT;

    // SOFT_events
    public final long
        alEventControlSOFT,
        alEventCallbackSOFT,
        alGetPointerSOFT,
        alGetPointervSOFT;

    // SOFT_source_latency
    public final long
        alSourcedSOFT,
        alSource3dSOFT,
        alSourcedvSOFT,
        alGetSourcedSOFT,
        alGetSource3dSOFT,
        alGetSourcedvSOFT,
        alSourcei64SOFT,
        alSource3i64SOFT,
        alSourcei64vSOFT,
        alGetSourcei64SOFT,
        alGetSource3i64SOFT,
        alGetSourcei64vSOFT;

    // SOFT_source_resampler
    public final long
        alGetStringiSOFT;

    // SOFT_source_start_delay
    public final long
        alSourcePlayAtTimeSOFT,
        alSourcePlayAtTimevSOFT;

    /** When true, {@link AL10} is supported. */
    public final boolean OpenAL10;
    /** When true, {@link AL11} is supported. */
    public final boolean OpenAL11;
    /** When true, {@link EXTAlaw} is supported. */
    public final boolean AL_EXT_ALAW;
    /** When true, {@link EXTBFormat} is supported. */
    public final boolean AL_EXT_BFORMAT;
    /** When true, {@link EXTDouble} is supported. */
    public final boolean AL_EXT_DOUBLE;
    /** When true, {@link EXTEfx} is supported. */
    public final boolean ALC_EXT_EFX;
    /** When true, {@link EXTExponentDistance} is supported. */
    public final boolean AL_EXT_EXPONENT_DISTANCE;
    /** When true, {@link EXTFloat32} is supported. */
    public final boolean AL_EXT_FLOAT32;
    /** When true, {@link EXTIma4} is supported. */
    public final boolean AL_EXT_IMA4;
    /** When true, {@link EXTLinearDistance} is supported. */
    public final boolean AL_EXT_LINEAR_DISTANCE;
    /** When true, {@link EXTMCFormats} is supported. */
    public final boolean AL_EXT_MCFORMATS;
    /** When true, {@link EXTMulaw} is supported. */
    public final boolean AL_EXT_MULAW;
    /** When true, {@link EXTMulawBFormat} is supported. */
    public final boolean AL_EXT_MULAW_BFORMAT;
    /** When true, {@link EXTMulawMCFormats} is supported. */
    public final boolean AL_EXT_MULAW_MCFORMATS;
    /** When true, {@link EXTOffset} is supported. */
    public final boolean AL_EXT_OFFSET;
    /** When true, {@link EXTSourceDistanceModel} is supported. */
    public final boolean AL_EXT_source_distance_model;
    /** When true, {@link EXTSourceRadius} is supported. */
    public final boolean AL_EXT_SOURCE_RADIUS;
    /** When true, {@link EXTStaticBuffer} is supported. */
    public final boolean AL_EXT_STATIC_BUFFER;
    /** When true, {@link EXTStereoAngles} is supported. */
    public final boolean AL_EXT_STEREO_ANGLES;
    /** When true, {@link EXTVorbis} is supported. */
    public final boolean AL_EXT_vorbis;
    /** When true, {@link LOKIIMAADPCM} is supported. */
    public final boolean AL_LOKI_IMA_ADPCM;
    /** When true, {@link LOKIQuadriphonic} is supported. */
    public final boolean AL_LOKI_quadriphonic;
    /** When true, {@link LOKIWAVEFormat} is supported. */
    public final boolean AL_LOKI_WAVE_format;
    /** When true, {@link SOFTBformatEx} is supported. */
    public final boolean AL_SOFT_bformat_ex;
    /** When true, {@link SOFTBlockAlignment} is supported. */
    public final boolean AL_SOFT_block_alignment;
    /** When true, {@link SOFTBufferLengthQuery} is supported. */
    public final boolean AL_SOFT_buffer_length_query;
    /** When true, {@link SOFTBufferSamples} is supported. */
    public final boolean AL_SOFT_buffer_samples;
    /** When true, {@link SOFTBufferSubData} is supported. */
    public final boolean AL_SOFT_buffer_sub_data;
    /** When true, {@link SOFTCallbackBuffer} is supported. */
    public final boolean AL_SOFT_callback_buffer;
    /** When true, {@link SOFTDeferredUpdates} is supported. */
    public final boolean AL_SOFT_deferred_updates;
    /** When true, {@link SOFTDirectChannels} is supported. */
    public final boolean AL_SOFT_direct_channels;
    /** When true, {@link SOFTDirectChannelsRemix} is supported. */
    public final boolean AL_SOFT_direct_channels_remix;
    /** When true, {@link SOFTEffectTarget} is supported. */
    public final boolean AL_SOFT_effect_target;
    /** When true, {@link SOFTEvents} is supported. */
    public final boolean AL_SOFT_events;
    /** When true, {@link SOFTGainClampEx} is supported. */
    public final boolean AL_SOFT_gain_clamp_ex;
    /** When true, {@link SOFTLoopPoints} is supported. */
    public final boolean AL_SOFT_loop_points;
    /** When true, {@link SOFTMSADPCM} is supported. */
    public final boolean AL_SOFT_MSADPCM;
    /** When true, {@link SOFTSourceLatency} is supported. */
    public final boolean AL_SOFT_source_latency;
    /** When true, {@link SOFTSourceLength} is supported. */
    public final boolean AL_SOFT_source_length;
    /** When true, {@link SOFTSourceResampler} is supported. */
    public final boolean AL_SOFT_source_resampler;
    /** When true, {@link SOFTSourceSpatialize} is supported. */
    public final boolean AL_SOFT_source_spatialize;
    /** When true, {@link SOFTSourceStartDelay} is supported. */
    public final boolean AL_SOFT_source_start_delay;
    /** When true, {@link SOFTUHJ} is supported. */
    public final boolean AL_SOFT_UHJ;
    /** When true, {@link SOFTUHJEx} is supported. */
    public final boolean AL_SOFT_UHJ_ex;
    /** When true, {@link SOFTXHoldOnDisconnect} is supported. */
    public final boolean AL_SOFTX_hold_on_disconnect;

    /** Off-heap array of the above function addresses. */
    final PointerBuffer addresses;

    ALCapabilities(FunctionProvider provider, Set<String> ext, IntFunction<PointerBuffer> bufferFactory) {
        PointerBuffer caps = bufferFactory.apply(133);

        OpenAL10 = check_AL10(provider, caps, ext);
        OpenAL11 = check_AL11(provider, caps, ext);
        AL_EXT_ALAW = ext.contains("AL_EXT_ALAW");
        AL_EXT_BFORMAT = ext.contains("AL_EXT_BFORMAT");
        AL_EXT_DOUBLE = ext.contains("AL_EXT_DOUBLE");
        ALC_EXT_EFX = check_EXT_EFX(provider, caps, ext);
        AL_EXT_EXPONENT_DISTANCE = ext.contains("AL_EXT_EXPONENT_DISTANCE");
        AL_EXT_FLOAT32 = ext.contains("AL_EXT_FLOAT32");
        AL_EXT_IMA4 = ext.contains("AL_EXT_IMA4");
        AL_EXT_LINEAR_DISTANCE = ext.contains("AL_EXT_LINEAR_DISTANCE");
        AL_EXT_MCFORMATS = ext.contains("AL_EXT_MCFORMATS");
        AL_EXT_MULAW = ext.contains("AL_EXT_MULAW");
        AL_EXT_MULAW_BFORMAT = ext.contains("AL_EXT_MULAW_BFORMAT");
        AL_EXT_MULAW_MCFORMATS = ext.contains("AL_EXT_MULAW_MCFORMATS");
        AL_EXT_OFFSET = ext.contains("AL_EXT_OFFSET");
        AL_EXT_source_distance_model = ext.contains("AL_EXT_source_distance_model");
        AL_EXT_SOURCE_RADIUS = ext.contains("AL_EXT_SOURCE_RADIUS");
        AL_EXT_STATIC_BUFFER = check_EXT_STATIC_BUFFER(provider, caps, ext);
        AL_EXT_STEREO_ANGLES = ext.contains("AL_EXT_STEREO_ANGLES");
        AL_EXT_vorbis = ext.contains("AL_EXT_vorbis");
        AL_LOKI_IMA_ADPCM = ext.contains("AL_LOKI_IMA_ADPCM");
        AL_LOKI_quadriphonic = ext.contains("AL_LOKI_quadriphonic");
        AL_LOKI_WAVE_format = ext.contains("AL_LOKI_WAVE_format");
        AL_SOFT_bformat_ex = ext.contains("AL_SOFT_bformat_ex");
        AL_SOFT_block_alignment = ext.contains("AL_SOFT_block_alignment");
        AL_SOFT_buffer_length_query = ext.contains("AL_SOFT_buffer_length_query");
        AL_SOFT_buffer_samples = check_SOFT_buffer_samples(provider, caps, ext);
        AL_SOFT_buffer_sub_data = check_SOFT_buffer_sub_data(provider, caps, ext);
        AL_SOFT_callback_buffer = check_SOFT_callback_buffer(provider, caps, ext);
        AL_SOFT_deferred_updates = check_SOFT_deferred_updates(provider, caps, ext);
        AL_SOFT_direct_channels = ext.contains("AL_SOFT_direct_channels");
        AL_SOFT_direct_channels_remix = ext.contains("AL_SOFT_direct_channels_remix");
        AL_SOFT_effect_target = ext.contains("AL_SOFT_effect_target");
        AL_SOFT_events = check_SOFT_events(provider, caps, ext);
        AL_SOFT_gain_clamp_ex = ext.contains("AL_SOFT_gain_clamp_ex");
        AL_SOFT_loop_points = ext.contains("AL_SOFT_loop_points");
        AL_SOFT_MSADPCM = ext.contains("AL_SOFT_MSADPCM");
        AL_SOFT_source_latency = check_SOFT_source_latency(provider, caps, ext);
        AL_SOFT_source_length = ext.contains("AL_SOFT_source_length");
        AL_SOFT_source_resampler = check_SOFT_source_resampler(provider, caps, ext);
        AL_SOFT_source_spatialize = ext.contains("AL_SOFT_source_spatialize");
        AL_SOFT_source_start_delay = check_SOFT_source_start_delay(provider, caps, ext);
        AL_SOFT_UHJ = ext.contains("AL_SOFT_UHJ");
        AL_SOFT_UHJ_ex = ext.contains("AL_SOFT_UHJ_ex");
        AL_SOFTX_hold_on_disconnect = ext.contains("AL_SOFTX_hold_on_disconnect");

        alGetError = caps.get(0);
        alEnable = caps.get(1);
        alDisable = caps.get(2);
        alIsEnabled = caps.get(3);
        alGetBoolean = caps.get(4);
        alGetInteger = caps.get(5);
        alGetFloat = caps.get(6);
        alGetDouble = caps.get(7);
        alGetBooleanv = caps.get(8);
        alGetIntegerv = caps.get(9);
        alGetFloatv = caps.get(10);
        alGetDoublev = caps.get(11);
        alGetString = caps.get(12);
        alDistanceModel = caps.get(13);
        alDopplerFactor = caps.get(14);
        alDopplerVelocity = caps.get(15);
        alListenerf = caps.get(16);
        alListeneri = caps.get(17);
        alListener3f = caps.get(18);
        alListenerfv = caps.get(19);
        alGetListenerf = caps.get(20);
        alGetListeneri = caps.get(21);
        alGetListener3f = caps.get(22);
        alGetListenerfv = caps.get(23);
        alGenSources = caps.get(24);
        alDeleteSources = caps.get(25);
        alIsSource = caps.get(26);
        alSourcef = caps.get(27);
        alSource3f = caps.get(28);
        alSourcefv = caps.get(29);
        alSourcei = caps.get(30);
        alGetSourcef = caps.get(31);
        alGetSource3f = caps.get(32);
        alGetSourcefv = caps.get(33);
        alGetSourcei = caps.get(34);
        alGetSourceiv = caps.get(35);
        alSourceQueueBuffers = caps.get(36);
        alSourceUnqueueBuffers = caps.get(37);
        alSourcePlay = caps.get(38);
        alSourcePause = caps.get(39);
        alSourceStop = caps.get(40);
        alSourceRewind = caps.get(41);
        alSourcePlayv = caps.get(42);
        alSourcePausev = caps.get(43);
        alSourceStopv = caps.get(44);
        alSourceRewindv = caps.get(45);
        alGenBuffers = caps.get(46);
        alDeleteBuffers = caps.get(47);
        alIsBuffer = caps.get(48);
        alGetBufferf = caps.get(49);
        alGetBufferi = caps.get(50);
        alBufferData = caps.get(51);
        alGetEnumValue = caps.get(52);
        alGetProcAddress = caps.get(53);
        alIsExtensionPresent = caps.get(54);
        alListener3i = caps.get(55);
        alGetListeneriv = caps.get(56);
        alSource3i = caps.get(57);
        alListeneriv = caps.get(58);
        alSourceiv = caps.get(59);
        alBufferf = caps.get(60);
        alBuffer3f = caps.get(61);
        alBufferfv = caps.get(62);
        alBufferi = caps.get(63);
        alBuffer3i = caps.get(64);
        alBufferiv = caps.get(65);
        alGetBufferiv = caps.get(66);
        alGetBufferfv = caps.get(67);
        alSpeedOfSound = caps.get(68);
        alGenEffects = caps.get(69);
        alDeleteEffects = caps.get(70);
        alIsEffect = caps.get(71);
        alEffecti = caps.get(72);
        alEffectiv = caps.get(73);
        alEffectf = caps.get(74);
        alEffectfv = caps.get(75);
        alGetEffecti = caps.get(76);
        alGetEffectiv = caps.get(77);
        alGetEffectf = caps.get(78);
        alGetEffectfv = caps.get(79);
        alGenFilters = caps.get(80);
        alDeleteFilters = caps.get(81);
        alIsFilter = caps.get(82);
        alFilteri = caps.get(83);
        alFilteriv = caps.get(84);
        alFilterf = caps.get(85);
        alFilterfv = caps.get(86);
        alGetFilteri = caps.get(87);
        alGetFilteriv = caps.get(88);
        alGetFilterf = caps.get(89);
        alGetFilterfv = caps.get(90);
        alGenAuxiliaryEffectSlots = caps.get(91);
        alDeleteAuxiliaryEffectSlots = caps.get(92);
        alIsAuxiliaryEffectSlot = caps.get(93);
        alAuxiliaryEffectSloti = caps.get(94);
        alAuxiliaryEffectSlotiv = caps.get(95);
        alAuxiliaryEffectSlotf = caps.get(96);
        alAuxiliaryEffectSlotfv = caps.get(97);
        alGetAuxiliaryEffectSloti = caps.get(98);
        alGetAuxiliaryEffectSlotiv = caps.get(99);
        alGetAuxiliaryEffectSlotf = caps.get(100);
        alGetAuxiliaryEffectSlotfv = caps.get(101);
        alBufferDataStatic = caps.get(102);
        alBufferSamplesSOFT = caps.get(103);
        alBufferSubSamplesSOFT = caps.get(104);
        alGetBufferSamplesSOFT = caps.get(105);
        alIsBufferFormatSupportedSOFT = caps.get(106);
        alBufferSubDataSOFT = caps.get(107);
        alBufferCallbackSOFT = caps.get(108);
        alGetBufferPtrSOFT = caps.get(109);
        alGetBuffer3PtrSOFT = caps.get(110);
        alGetBufferPtrvSOFT = caps.get(111);
        alDeferUpdatesSOFT = caps.get(112);
        alProcessUpdatesSOFT = caps.get(113);
        alEventControlSOFT = caps.get(114);
        alEventCallbackSOFT = caps.get(115);
        alGetPointerSOFT = caps.get(116);
        alGetPointervSOFT = caps.get(117);
        alSourcedSOFT = caps.get(118);
        alSource3dSOFT = caps.get(119);
        alSourcedvSOFT = caps.get(120);
        alGetSourcedSOFT = caps.get(121);
        alGetSource3dSOFT = caps.get(122);
        alGetSourcedvSOFT = caps.get(123);
        alSourcei64SOFT = caps.get(124);
        alSource3i64SOFT = caps.get(125);
        alSourcei64vSOFT = caps.get(126);
        alGetSourcei64SOFT = caps.get(127);
        alGetSource3i64SOFT = caps.get(128);
        alGetSourcei64vSOFT = caps.get(129);
        alGetStringiSOFT = caps.get(130);
        alSourcePlayAtTimeSOFT = caps.get(131);
        alSourcePlayAtTimevSOFT = caps.get(132);

        addresses = ThreadLocalUtil.setupAddressBuffer(caps);
    }

    /** Returns the buffer of OpenAL function pointers. */
    public PointerBuffer getAddressBuffer() {
        return addresses;
    }

    private static boolean check_AL10(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("OpenAL10")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
            39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54
        },
            "alGetError", "alEnable", "alDisable", "alIsEnabled", "alGetBoolean", "alGetInteger", "alGetFloat", "alGetDouble", "alGetBooleanv", "alGetIntegerv", 
            "alGetFloatv", "alGetDoublev", "alGetString", "alDistanceModel", "alDopplerFactor", "alDopplerVelocity", "alListenerf", "alListeneri", 
            "alListener3f", "alListenerfv", "alGetListenerf", "alGetListeneri", "alGetListener3f", "alGetListenerfv", "alGenSources", "alDeleteSources", 
            "alIsSource", "alSourcef", "alSource3f", "alSourcefv", "alSourcei", "alGetSourcef", "alGetSource3f", "alGetSourcefv", "alGetSourcei", 
            "alGetSourceiv", "alSourceQueueBuffers", "alSourceUnqueueBuffers", "alSourcePlay", "alSourcePause", "alSourceStop", "alSourceRewind", 
            "alSourcePlayv", "alSourcePausev", "alSourceStopv", "alSourceRewindv", "alGenBuffers", "alDeleteBuffers", "alIsBuffer", "alGetBufferf", 
            "alGetBufferi", "alBufferData", "alGetEnumValue", "alGetProcAddress", "alIsExtensionPresent"
        ) || reportMissing("AL", "OpenAL10");
    }

    private static boolean check_AL11(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("OpenAL11")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68
        },
            "alListener3i", "alGetListeneriv", "alSource3i", "alListeneriv", "alSourceiv", "alBufferf", "alBuffer3f", "alBufferfv", "alBufferi", "alBuffer3i", 
            "alBufferiv", "alGetBufferiv", "alGetBufferfv", "alSpeedOfSound"
        ) || reportMissing("AL", "OpenAL11");
    }

    private static boolean check_EXT_EFX(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("ALC_EXT_EFX")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101
        },
            "alGenEffects", "alDeleteEffects", "alIsEffect", "alEffecti", "alEffectiv", "alEffectf", "alEffectfv", "alGetEffecti", "alGetEffectiv", 
            "alGetEffectf", "alGetEffectfv", "alGenFilters", "alDeleteFilters", "alIsFilter", "alFilteri", "alFilteriv", "alFilterf", "alFilterfv", 
            "alGetFilteri", "alGetFilteriv", "alGetFilterf", "alGetFilterfv", "alGenAuxiliaryEffectSlots", "alDeleteAuxiliaryEffectSlots", 
            "alIsAuxiliaryEffectSlot", "alAuxiliaryEffectSloti", "alAuxiliaryEffectSlotiv", "alAuxiliaryEffectSlotf", "alAuxiliaryEffectSlotfv", 
            "alGetAuxiliaryEffectSloti", "alGetAuxiliaryEffectSlotiv", "alGetAuxiliaryEffectSlotf", "alGetAuxiliaryEffectSlotfv"
        ) || reportMissing("AL", "ALC_EXT_EFX");
    }

    private static boolean check_EXT_STATIC_BUFFER(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("AL_EXT_STATIC_BUFFER")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            102
        },
            "alBufferDataStatic"
        ) || reportMissing("AL", "AL_EXT_STATIC_BUFFER");
    }

    private static boolean check_SOFT_buffer_samples(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("AL_SOFT_buffer_samples")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            103, 104, 105, 106
        },
            "alBufferSamplesSOFT", "alBufferSubSamplesSOFT", "alGetBufferSamplesSOFT", "alIsBufferFormatSupportedSOFT"
        ) || reportMissing("AL", "AL_SOFT_buffer_samples");
    }

    private static boolean check_SOFT_buffer_sub_data(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("AL_SOFT_buffer_sub_data")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            107
        },
            "alBufferSubDataSOFT"
        ) || reportMissing("AL", "AL_SOFT_buffer_sub_data");
    }

    private static boolean check_SOFT_callback_buffer(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("AL_SOFT_callback_buffer")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            108, 109, 110, 111
        },
            "alBufferCallbackSOFT", "alGetBufferPtrSOFT", "alGetBuffer3PtrSOFT", "alGetBufferPtrvSOFT"
        ) || reportMissing("AL", "AL_SOFT_callback_buffer");
    }

    private static boolean check_SOFT_deferred_updates(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("AL_SOFT_deferred_updates")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            112, 113
        },
            "alDeferUpdatesSOFT", "alProcessUpdatesSOFT"
        ) || reportMissing("AL", "AL_SOFT_deferred_updates");
    }

    private static boolean check_SOFT_events(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("AL_SOFT_events")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            114, 115, 116, 117
        },
            "alEventControlSOFT", "alEventCallbackSOFT", "alGetPointerSOFT", "alGetPointervSOFT"
        ) || reportMissing("AL", "AL_SOFT_events");
    }

    private static boolean check_SOFT_source_latency(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("AL_SOFT_source_latency")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129
        },
            "alSourcedSOFT", "alSource3dSOFT", "alSourcedvSOFT", "alGetSourcedSOFT", "alGetSource3dSOFT", "alGetSourcedvSOFT", "alSourcei64SOFT", 
            "alSource3i64SOFT", "alSourcei64vSOFT", "alGetSourcei64SOFT", "alGetSource3i64SOFT", "alGetSourcei64vSOFT"
        ) || reportMissing("AL", "AL_SOFT_source_latency");
    }

    private static boolean check_SOFT_source_resampler(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("AL_SOFT_source_resampler")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            130
        },
            "alGetStringiSOFT"
        ) || reportMissing("AL", "AL_SOFT_source_resampler");
    }

    private static boolean check_SOFT_source_start_delay(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("AL_SOFT_source_start_delay")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            131, 132
        },
            "alSourcePlayAtTimeSOFT", "alSourcePlayAtTimevSOFT"
        ) || reportMissing("AL", "AL_SOFT_source_start_delay");
    }

}
