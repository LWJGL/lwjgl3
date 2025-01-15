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

public final class ALCapabilities {

    // AL10
    public final long
        alGetError,
        alGetErrorDirect,
        alEnable,
        alEnableDirect,
        alDisable,
        alDisableDirect,
        alIsEnabled,
        alIsEnabledDirect,
        alGetBoolean,
        alGetBooleanDirect,
        alGetInteger,
        alGetIntegerDirect,
        alGetFloat,
        alGetFloatDirect,
        alGetDouble,
        alGetDoubleDirect,
        alGetBooleanv,
        alGetBooleanvDirect,
        alGetIntegerv,
        alGetIntegervDirect,
        alGetFloatv,
        alGetFloatvDirect,
        alGetDoublev,
        alGetDoublevDirect,
        alGetString,
        alGetStringDirect,
        alDistanceModel,
        alDistanceModelDirect,
        alDopplerFactor,
        alDopplerFactorDirect,
        alDopplerVelocity,
        alListenerf,
        alListenerfDirect,
        alListeneri,
        alListeneriDirect,
        alListener3f,
        alListener3fDirect,
        alListenerfv,
        alListenerfvDirect,
        alGetListenerf,
        alGetListenerfDirect,
        alGetListeneri,
        alGetListeneriDirect,
        alGetListener3f,
        alGetListener3fDirect,
        alGetListenerfv,
        alGetListenerfvDirect,
        alGenSources,
        alGenSourcesDirect,
        alDeleteSources,
        alDeleteSourcesDirect,
        alIsSource,
        alIsSourceDirect,
        alSourcef,
        alSourcefDirect,
        alSource3f,
        alSource3fDirect,
        alSourcefv,
        alSourcefvDirect,
        alSourcei,
        alSourceiDirect,
        alGetSourcef,
        alGetSourcefDirect,
        alGetSource3f,
        alGetSource3fDirect,
        alGetSourcefv,
        alGetSourcefvDirect,
        alGetSourcei,
        alGetSourceiDirect,
        alGetSourceiv,
        alGetSourceivDirect,
        alSourceQueueBuffers,
        alSourceQueueBuffersDirect,
        alSourceUnqueueBuffers,
        alSourceUnqueueBuffersDirect,
        alSourcePlay,
        alSourcePlayDirect,
        alSourcePause,
        alSourcePauseDirect,
        alSourceStop,
        alSourceStopDirect,
        alSourceRewind,
        alSourceRewindDirect,
        alSourcePlayv,
        alSourcePlayvDirect,
        alSourcePausev,
        alSourcePausevDirect,
        alSourceStopv,
        alSourceStopvDirect,
        alSourceRewindv,
        alSourceRewindvDirect,
        alGenBuffers,
        alGenBuffersDirect,
        alDeleteBuffers,
        alDeleteBuffersDirect,
        alIsBuffer,
        alIsBufferDirect,
        alGetBufferf,
        alGetBufferfDirect,
        alGetBufferi,
        alGetBufferiDirect,
        alBufferData,
        alBufferDataDirect,
        alGetEnumValue,
        alGetEnumValueDirect,
        alGetProcAddress,
        alGetProcAddressDirect,
        alIsExtensionPresent,
        alIsExtensionPresentDirect;

    // AL11
    public final long
        alListener3i,
        alListener3iDirect,
        alGetListener3i,
        alGetListener3iDirect,
        alGetListeneriv,
        alGetListenerivDirect,
        alSource3i,
        alSource3iDirect,
        alGetSource3i,
        alGetSource3iDirect,
        alListeneriv,
        alListenerivDirect,
        alSourceiv,
        alSourceivDirect,
        alBufferf,
        alBufferfDirect,
        alBuffer3f,
        alBuffer3fDirect,
        alBufferfv,
        alBufferfvDirect,
        alBufferi,
        alBufferiDirect,
        alBuffer3i,
        alBuffer3iDirect,
        alBufferiv,
        alBufferivDirect,
        alGetBuffer3i,
        alGetBuffer3iDirect,
        alGetBufferiv,
        alGetBufferivDirect,
        alGetBuffer3f,
        alGetBuffer3fDirect,
        alGetBufferfv,
        alGetBufferfvDirect,
        alSpeedOfSound,
        alSpeedOfSoundDirect;

    // EXT_debug
    public final long
        alDebugMessageCallbackEXT,
        alDebugMessageCallbackDirectEXT,
        alDebugMessageInsertEXT,
        alDebugMessageInsertDirectEXT,
        alDebugMessageControlEXT,
        alDebugMessageControlDirectEXT,
        alPushDebugGroupEXT,
        alPushDebugGroupDirectEXT,
        alPopDebugGroupEXT,
        alPopDebugGroupDirectEXT,
        alGetDebugMessageLogEXT,
        alGetDebugMessageLogDirectEXT,
        alObjectLabelEXT,
        alObjectLabelDirectEXT,
        alGetObjectLabelEXT,
        alGetObjectLabelDirectEXT,
        alGetPointerEXT,
        alGetPointerDirectEXT,
        alGetPointervEXT,
        alGetPointervDirectEXT;

    // EXT_EFX
    public final long
        alGenEffects,
        alGenEffectsDirect,
        alDeleteEffects,
        alDeleteEffectsDirect,
        alIsEffect,
        alIsEffectDirect,
        alEffecti,
        alEffectiDirect,
        alEffectiv,
        alEffectivDirect,
        alEffectf,
        alEffectfDirect,
        alEffectfv,
        alEffectfvDirect,
        alGetEffecti,
        alGetEffectiDirect,
        alGetEffectiv,
        alGetEffectivDirect,
        alGetEffectf,
        alGetEffectfDirect,
        alGetEffectfv,
        alGetEffectfvDirect,
        alGenFilters,
        alGenFiltersDirect,
        alDeleteFilters,
        alDeleteFiltersDirect,
        alIsFilter,
        alIsFilterDirect,
        alFilteri,
        alFilteriDirect,
        alFilteriv,
        alFilterivDirect,
        alFilterf,
        alFilterfDirect,
        alFilterfv,
        alFilterfvDirect,
        alGetFilteri,
        alGetFilteriDirect,
        alGetFilteriv,
        alGetFilterivDirect,
        alGetFilterf,
        alGetFilterfDirect,
        alGetFilterfv,
        alGetFilterfvDirect,
        alGenAuxiliaryEffectSlots,
        alGenAuxiliaryEffectSlotsDirect,
        alDeleteAuxiliaryEffectSlots,
        alDeleteAuxiliaryEffectSlotsDirect,
        alIsAuxiliaryEffectSlot,
        alIsAuxiliaryEffectSlotDirect,
        alAuxiliaryEffectSloti,
        alAuxiliaryEffectSlotiDirect,
        alAuxiliaryEffectSlotiv,
        alAuxiliaryEffectSlotivDirect,
        alAuxiliaryEffectSlotf,
        alAuxiliaryEffectSlotfDirect,
        alAuxiliaryEffectSlotfv,
        alAuxiliaryEffectSlotfvDirect,
        alGetAuxiliaryEffectSloti,
        alGetAuxiliaryEffectSlotiDirect,
        alGetAuxiliaryEffectSlotiv,
        alGetAuxiliaryEffectSlotivDirect,
        alGetAuxiliaryEffectSlotf,
        alGetAuxiliaryEffectSlotfDirect,
        alGetAuxiliaryEffectSlotfv,
        alGetAuxiliaryEffectSlotfvDirect;

    // EXT_STATIC_BUFFER
    public final long
        alBufferDataStatic,
        alBufferDataStaticDirect;

    // SOFT_buffer_samples
    public final long
        alBufferSamplesSOFT,
        alBufferSubSamplesSOFT,
        alGetBufferSamplesSOFT,
        alIsBufferFormatSupportedSOFT;

    // SOFT_buffer_sub_data
    public final long
        alBufferSubDataSOFT,
        alBufferSubDataDirectSOFT;

    // SOFT_callback_buffer
    public final long
        alBufferCallbackSOFT,
        alBufferCallbackDirectSOFT,
        alGetBufferPtrSOFT,
        alGetBufferPtrDirectSOFT,
        alGetBuffer3PtrSOFT,
        alGetBuffer3PtrDirectSOFT,
        alGetBufferPtrvSOFT,
        alGetBufferPtrvDirectSOFT;

    // SOFT_deferred_updates
    public final long
        alDeferUpdatesSOFT,
        alDeferUpdatesDirectSOFT,
        alProcessUpdatesSOFT,
        alProcessUpdatesDirectSOFT;

    // SOFT_events
    public final long
        alEventControlSOFT,
        alEventControlDirectSOFT,
        alEventCallbackSOFT,
        alEventCallbackDirectSOFT,
        alGetPointerSOFT,
        alGetPointerDirectSOFT,
        alGetPointervSOFT,
        alGetPointervDirectSOFT;

    // SOFT_source_latency
    public final long
        alSourcedSOFT,
        alSourcedDirectSOFT,
        alSource3dSOFT,
        alSource3dDirectSOFT,
        alSourcedvSOFT,
        alSourcedvDirectSOFT,
        alGetSourcedSOFT,
        alGetSourcedDirectSOFT,
        alGetSource3dSOFT,
        alGetSource3dDirectSOFT,
        alGetSourcedvSOFT,
        alGetSourcedvDirectSOFT,
        alSourcei64SOFT,
        alSourcei64DirectSOFT,
        alSource3i64SOFT,
        alSource3i64DirectSOFT,
        alSourcei64vSOFT,
        alSourcei64vDirectSOFT,
        alGetSourcei64SOFT,
        alGetSourcei64DirectSOFT,
        alGetSource3i64SOFT,
        alGetSource3i64DirectSOFT,
        alGetSourcei64vSOFT,
        alGetSourcei64vDirectSOFT;

    // SOFT_source_resampler
    public final long
        alGetStringiSOFT,
        alGetStringiDirectSOFT;

    // SOFT_source_start_delay
    public final long
        alSourcePlayAtTimeSOFT,
        alSourcePlayAtTimeDirectSOFT,
        alSourcePlayAtTimevSOFT,
        alSourcePlayAtTimevDirectSOFT;

    /** When true, {@code AL10} is supported. */
    public final boolean OpenAL10;
    /** When true, {@code AL11} is supported. */
    public final boolean OpenAL11;
    /** When true, {@code EXT_ALAW} is supported. */
    public final boolean AL_EXT_ALAW;
    /** When true, {@code EXT_BFORMAT} is supported. */
    public final boolean AL_EXT_BFORMAT;
    /** When true, {@code EXT_debug} is supported. */
    public final boolean AL_EXT_debug;
    /** When true, {@code EXT_direct_context} is supported. */
    public final boolean AL_EXT_direct_context;
    /** When true, {@code EXT_DOUBLE} is supported. */
    public final boolean AL_EXT_DOUBLE;
    /** When true, {@code EXT_EFX} is supported. */
    public final boolean ALC_EXT_EFX;
    /** When true, {@code EXT_EXPONENT_DISTANCE} is supported. */
    public final boolean AL_EXT_EXPONENT_DISTANCE;
    /** When true, {@code EXT_FLOAT32} is supported. */
    public final boolean AL_EXT_FLOAT32;
    /** When true, {@code EXT_IMA4} is supported. */
    public final boolean AL_EXT_IMA4;
    /** When true, {@code EXT_LINEAR_DISTANCE} is supported. */
    public final boolean AL_EXT_LINEAR_DISTANCE;
    /** When true, {@code EXT_MCFORMATS} is supported. */
    public final boolean AL_EXT_MCFORMATS;
    /** When true, {@code EXT_MULAW} is supported. */
    public final boolean AL_EXT_MULAW;
    /** When true, {@code EXT_MULAW_BFORMAT} is supported. */
    public final boolean AL_EXT_MULAW_BFORMAT;
    /** When true, {@code EXT_MULAW_MCFORMATS} is supported. */
    public final boolean AL_EXT_MULAW_MCFORMATS;
    /** When true, {@code EXT_OFFSET} is supported. */
    public final boolean AL_EXT_OFFSET;
    /** When true, {@code EXT_source_distance_model} is supported. */
    public final boolean AL_EXT_source_distance_model;
    /** When true, {@code EXT_SOURCE_RADIUS} is supported. */
    public final boolean AL_EXT_SOURCE_RADIUS;
    /** When true, {@code EXT_STATIC_BUFFER} is supported. */
    public final boolean AL_EXT_STATIC_BUFFER;
    /** When true, {@code EXT_STEREO_ANGLES} is supported. */
    public final boolean AL_EXT_STEREO_ANGLES;
    /** When true, {@code EXT_vorbis} is supported. */
    public final boolean AL_EXT_vorbis;
    /** When true, {@code LOKI_IMA_ADPCM} is supported. */
    public final boolean AL_LOKI_IMA_ADPCM;
    /** When true, {@code LOKI_quadriphonic} is supported. */
    public final boolean AL_LOKI_quadriphonic;
    /** When true, {@code LOKI_WAVE_format} is supported. */
    public final boolean AL_LOKI_WAVE_format;
    /** When true, {@code SOFT_bformat_ex} is supported. */
    public final boolean AL_SOFT_bformat_ex;
    /** When true, {@code SOFT_bformat_hoa} is supported. */
    public final boolean AL_SOFT_bformat_hoa;
    /** When true, {@code SOFT_block_alignment} is supported. */
    public final boolean AL_SOFT_block_alignment;
    /** When true, {@code SOFT_buffer_length_query} is supported. */
    public final boolean AL_SOFT_buffer_length_query;
    /** When true, {@code SOFT_buffer_samples} is supported. */
    public final boolean AL_SOFT_buffer_samples;
    /** When true, {@code SOFT_buffer_sub_data} is supported. */
    public final boolean AL_SOFT_buffer_sub_data;
    /** When true, {@code SOFT_callback_buffer} is supported. */
    public final boolean AL_SOFT_callback_buffer;
    /** When true, {@code SOFT_deferred_updates} is supported. */
    public final boolean AL_SOFT_deferred_updates;
    /** When true, {@code SOFT_direct_channels} is supported. */
    public final boolean AL_SOFT_direct_channels;
    /** When true, {@code SOFT_direct_channels_remix} is supported. */
    public final boolean AL_SOFT_direct_channels_remix;
    /** When true, {@code SOFT_effect_target} is supported. */
    public final boolean AL_SOFT_effect_target;
    /** When true, {@code SOFT_events} is supported. */
    public final boolean AL_SOFT_events;
    /** When true, {@code SOFT_gain_clamp_ex} is supported. */
    public final boolean AL_SOFT_gain_clamp_ex;
    /** When true, {@code SOFT_loop_points} is supported. */
    public final boolean AL_SOFT_loop_points;
    /** When true, {@code SOFT_MSADPCM} is supported. */
    public final boolean AL_SOFT_MSADPCM;
    /** When true, {@code SOFT_source_latency} is supported. */
    public final boolean AL_SOFT_source_latency;
    /** When true, {@code SOFT_source_length} is supported. */
    public final boolean AL_SOFT_source_length;
    /** When true, {@code SOFT_source_resampler} is supported. */
    public final boolean AL_SOFT_source_resampler;
    /** When true, {@code SOFT_source_spatialize} is supported. */
    public final boolean AL_SOFT_source_spatialize;
    /** When true, {@code SOFT_source_start_delay} is supported. */
    public final boolean AL_SOFT_source_start_delay;
    /** When true, {@code SOFT_UHJ} is supported. */
    public final boolean AL_SOFT_UHJ;
    /** When true, {@code SOFT_UHJ_ex} is supported. */
    public final boolean AL_SOFT_UHJ_ex;
    /** When true, {@code SOFTX_hold_on_disconnect} is supported. */
    public final boolean AL_SOFTX_hold_on_disconnect;

    /** Off-heap array of the above function addresses. */
    final PointerBuffer addresses;

    ALCapabilities(FunctionProvider provider, Set<String> ext, IntFunction<PointerBuffer> bufferFactory) {
        PointerBuffer caps = bufferFactory.apply(289);

        OpenAL10 = check_AL10(provider, caps, ext);
        OpenAL11 = check_AL11(provider, caps, ext);
        AL_EXT_ALAW = ext.contains("AL_EXT_ALAW");
        AL_EXT_BFORMAT = ext.contains("AL_EXT_BFORMAT");
        AL_EXT_debug = check_EXT_debug(provider, caps, ext);
        AL_EXT_direct_context = ext.contains("AL_EXT_direct_context");
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
        AL_SOFT_bformat_hoa = ext.contains("AL_SOFT_bformat_hoa");
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
        alGetErrorDirect = caps.get(1);
        alEnable = caps.get(2);
        alEnableDirect = caps.get(3);
        alDisable = caps.get(4);
        alDisableDirect = caps.get(5);
        alIsEnabled = caps.get(6);
        alIsEnabledDirect = caps.get(7);
        alGetBoolean = caps.get(8);
        alGetBooleanDirect = caps.get(9);
        alGetInteger = caps.get(10);
        alGetIntegerDirect = caps.get(11);
        alGetFloat = caps.get(12);
        alGetFloatDirect = caps.get(13);
        alGetDouble = caps.get(14);
        alGetDoubleDirect = caps.get(15);
        alGetBooleanv = caps.get(16);
        alGetBooleanvDirect = caps.get(17);
        alGetIntegerv = caps.get(18);
        alGetIntegervDirect = caps.get(19);
        alGetFloatv = caps.get(20);
        alGetFloatvDirect = caps.get(21);
        alGetDoublev = caps.get(22);
        alGetDoublevDirect = caps.get(23);
        alGetString = caps.get(24);
        alGetStringDirect = caps.get(25);
        alDistanceModel = caps.get(26);
        alDistanceModelDirect = caps.get(27);
        alDopplerFactor = caps.get(28);
        alDopplerFactorDirect = caps.get(29);
        alDopplerVelocity = caps.get(30);
        alListenerf = caps.get(31);
        alListenerfDirect = caps.get(32);
        alListeneri = caps.get(33);
        alListeneriDirect = caps.get(34);
        alListener3f = caps.get(35);
        alListener3fDirect = caps.get(36);
        alListenerfv = caps.get(37);
        alListenerfvDirect = caps.get(38);
        alGetListenerf = caps.get(39);
        alGetListenerfDirect = caps.get(40);
        alGetListeneri = caps.get(41);
        alGetListeneriDirect = caps.get(42);
        alGetListener3f = caps.get(43);
        alGetListener3fDirect = caps.get(44);
        alGetListenerfv = caps.get(45);
        alGetListenerfvDirect = caps.get(46);
        alGenSources = caps.get(47);
        alGenSourcesDirect = caps.get(48);
        alDeleteSources = caps.get(49);
        alDeleteSourcesDirect = caps.get(50);
        alIsSource = caps.get(51);
        alIsSourceDirect = caps.get(52);
        alSourcef = caps.get(53);
        alSourcefDirect = caps.get(54);
        alSource3f = caps.get(55);
        alSource3fDirect = caps.get(56);
        alSourcefv = caps.get(57);
        alSourcefvDirect = caps.get(58);
        alSourcei = caps.get(59);
        alSourceiDirect = caps.get(60);
        alGetSourcef = caps.get(61);
        alGetSourcefDirect = caps.get(62);
        alGetSource3f = caps.get(63);
        alGetSource3fDirect = caps.get(64);
        alGetSourcefv = caps.get(65);
        alGetSourcefvDirect = caps.get(66);
        alGetSourcei = caps.get(67);
        alGetSourceiDirect = caps.get(68);
        alGetSourceiv = caps.get(69);
        alGetSourceivDirect = caps.get(70);
        alSourceQueueBuffers = caps.get(71);
        alSourceQueueBuffersDirect = caps.get(72);
        alSourceUnqueueBuffers = caps.get(73);
        alSourceUnqueueBuffersDirect = caps.get(74);
        alSourcePlay = caps.get(75);
        alSourcePlayDirect = caps.get(76);
        alSourcePause = caps.get(77);
        alSourcePauseDirect = caps.get(78);
        alSourceStop = caps.get(79);
        alSourceStopDirect = caps.get(80);
        alSourceRewind = caps.get(81);
        alSourceRewindDirect = caps.get(82);
        alSourcePlayv = caps.get(83);
        alSourcePlayvDirect = caps.get(84);
        alSourcePausev = caps.get(85);
        alSourcePausevDirect = caps.get(86);
        alSourceStopv = caps.get(87);
        alSourceStopvDirect = caps.get(88);
        alSourceRewindv = caps.get(89);
        alSourceRewindvDirect = caps.get(90);
        alGenBuffers = caps.get(91);
        alGenBuffersDirect = caps.get(92);
        alDeleteBuffers = caps.get(93);
        alDeleteBuffersDirect = caps.get(94);
        alIsBuffer = caps.get(95);
        alIsBufferDirect = caps.get(96);
        alGetBufferf = caps.get(97);
        alGetBufferfDirect = caps.get(98);
        alGetBufferi = caps.get(99);
        alGetBufferiDirect = caps.get(100);
        alBufferData = caps.get(101);
        alBufferDataDirect = caps.get(102);
        alGetEnumValue = caps.get(103);
        alGetEnumValueDirect = caps.get(104);
        alGetProcAddress = caps.get(105);
        alGetProcAddressDirect = caps.get(106);
        alIsExtensionPresent = caps.get(107);
        alIsExtensionPresentDirect = caps.get(108);
        alListener3i = caps.get(109);
        alListener3iDirect = caps.get(110);
        alGetListener3i = caps.get(111);
        alGetListener3iDirect = caps.get(112);
        alGetListeneriv = caps.get(113);
        alGetListenerivDirect = caps.get(114);
        alSource3i = caps.get(115);
        alSource3iDirect = caps.get(116);
        alGetSource3i = caps.get(117);
        alGetSource3iDirect = caps.get(118);
        alListeneriv = caps.get(119);
        alListenerivDirect = caps.get(120);
        alSourceiv = caps.get(121);
        alSourceivDirect = caps.get(122);
        alBufferf = caps.get(123);
        alBufferfDirect = caps.get(124);
        alBuffer3f = caps.get(125);
        alBuffer3fDirect = caps.get(126);
        alBufferfv = caps.get(127);
        alBufferfvDirect = caps.get(128);
        alBufferi = caps.get(129);
        alBufferiDirect = caps.get(130);
        alBuffer3i = caps.get(131);
        alBuffer3iDirect = caps.get(132);
        alBufferiv = caps.get(133);
        alBufferivDirect = caps.get(134);
        alGetBuffer3i = caps.get(135);
        alGetBuffer3iDirect = caps.get(136);
        alGetBufferiv = caps.get(137);
        alGetBufferivDirect = caps.get(138);
        alGetBuffer3f = caps.get(139);
        alGetBuffer3fDirect = caps.get(140);
        alGetBufferfv = caps.get(141);
        alGetBufferfvDirect = caps.get(142);
        alSpeedOfSound = caps.get(143);
        alSpeedOfSoundDirect = caps.get(144);
        alDebugMessageCallbackEXT = caps.get(145);
        alDebugMessageCallbackDirectEXT = caps.get(146);
        alDebugMessageInsertEXT = caps.get(147);
        alDebugMessageInsertDirectEXT = caps.get(148);
        alDebugMessageControlEXT = caps.get(149);
        alDebugMessageControlDirectEXT = caps.get(150);
        alPushDebugGroupEXT = caps.get(151);
        alPushDebugGroupDirectEXT = caps.get(152);
        alPopDebugGroupEXT = caps.get(153);
        alPopDebugGroupDirectEXT = caps.get(154);
        alGetDebugMessageLogEXT = caps.get(155);
        alGetDebugMessageLogDirectEXT = caps.get(156);
        alObjectLabelEXT = caps.get(157);
        alObjectLabelDirectEXT = caps.get(158);
        alGetObjectLabelEXT = caps.get(159);
        alGetObjectLabelDirectEXT = caps.get(160);
        alGetPointerEXT = caps.get(161);
        alGetPointerDirectEXT = caps.get(162);
        alGetPointervEXT = caps.get(163);
        alGetPointervDirectEXT = caps.get(164);
        alGenEffects = caps.get(165);
        alGenEffectsDirect = caps.get(166);
        alDeleteEffects = caps.get(167);
        alDeleteEffectsDirect = caps.get(168);
        alIsEffect = caps.get(169);
        alIsEffectDirect = caps.get(170);
        alEffecti = caps.get(171);
        alEffectiDirect = caps.get(172);
        alEffectiv = caps.get(173);
        alEffectivDirect = caps.get(174);
        alEffectf = caps.get(175);
        alEffectfDirect = caps.get(176);
        alEffectfv = caps.get(177);
        alEffectfvDirect = caps.get(178);
        alGetEffecti = caps.get(179);
        alGetEffectiDirect = caps.get(180);
        alGetEffectiv = caps.get(181);
        alGetEffectivDirect = caps.get(182);
        alGetEffectf = caps.get(183);
        alGetEffectfDirect = caps.get(184);
        alGetEffectfv = caps.get(185);
        alGetEffectfvDirect = caps.get(186);
        alGenFilters = caps.get(187);
        alGenFiltersDirect = caps.get(188);
        alDeleteFilters = caps.get(189);
        alDeleteFiltersDirect = caps.get(190);
        alIsFilter = caps.get(191);
        alIsFilterDirect = caps.get(192);
        alFilteri = caps.get(193);
        alFilteriDirect = caps.get(194);
        alFilteriv = caps.get(195);
        alFilterivDirect = caps.get(196);
        alFilterf = caps.get(197);
        alFilterfDirect = caps.get(198);
        alFilterfv = caps.get(199);
        alFilterfvDirect = caps.get(200);
        alGetFilteri = caps.get(201);
        alGetFilteriDirect = caps.get(202);
        alGetFilteriv = caps.get(203);
        alGetFilterivDirect = caps.get(204);
        alGetFilterf = caps.get(205);
        alGetFilterfDirect = caps.get(206);
        alGetFilterfv = caps.get(207);
        alGetFilterfvDirect = caps.get(208);
        alGenAuxiliaryEffectSlots = caps.get(209);
        alGenAuxiliaryEffectSlotsDirect = caps.get(210);
        alDeleteAuxiliaryEffectSlots = caps.get(211);
        alDeleteAuxiliaryEffectSlotsDirect = caps.get(212);
        alIsAuxiliaryEffectSlot = caps.get(213);
        alIsAuxiliaryEffectSlotDirect = caps.get(214);
        alAuxiliaryEffectSloti = caps.get(215);
        alAuxiliaryEffectSlotiDirect = caps.get(216);
        alAuxiliaryEffectSlotiv = caps.get(217);
        alAuxiliaryEffectSlotivDirect = caps.get(218);
        alAuxiliaryEffectSlotf = caps.get(219);
        alAuxiliaryEffectSlotfDirect = caps.get(220);
        alAuxiliaryEffectSlotfv = caps.get(221);
        alAuxiliaryEffectSlotfvDirect = caps.get(222);
        alGetAuxiliaryEffectSloti = caps.get(223);
        alGetAuxiliaryEffectSlotiDirect = caps.get(224);
        alGetAuxiliaryEffectSlotiv = caps.get(225);
        alGetAuxiliaryEffectSlotivDirect = caps.get(226);
        alGetAuxiliaryEffectSlotf = caps.get(227);
        alGetAuxiliaryEffectSlotfDirect = caps.get(228);
        alGetAuxiliaryEffectSlotfv = caps.get(229);
        alGetAuxiliaryEffectSlotfvDirect = caps.get(230);
        alBufferDataStatic = caps.get(231);
        alBufferDataStaticDirect = caps.get(232);
        alBufferSamplesSOFT = caps.get(233);
        alBufferSubSamplesSOFT = caps.get(234);
        alGetBufferSamplesSOFT = caps.get(235);
        alIsBufferFormatSupportedSOFT = caps.get(236);
        alBufferSubDataSOFT = caps.get(237);
        alBufferSubDataDirectSOFT = caps.get(238);
        alBufferCallbackSOFT = caps.get(239);
        alBufferCallbackDirectSOFT = caps.get(240);
        alGetBufferPtrSOFT = caps.get(241);
        alGetBufferPtrDirectSOFT = caps.get(242);
        alGetBuffer3PtrSOFT = caps.get(243);
        alGetBuffer3PtrDirectSOFT = caps.get(244);
        alGetBufferPtrvSOFT = caps.get(245);
        alGetBufferPtrvDirectSOFT = caps.get(246);
        alDeferUpdatesSOFT = caps.get(247);
        alDeferUpdatesDirectSOFT = caps.get(248);
        alProcessUpdatesSOFT = caps.get(249);
        alProcessUpdatesDirectSOFT = caps.get(250);
        alEventControlSOFT = caps.get(251);
        alEventControlDirectSOFT = caps.get(252);
        alEventCallbackSOFT = caps.get(253);
        alEventCallbackDirectSOFT = caps.get(254);
        alGetPointerSOFT = caps.get(255);
        alGetPointerDirectSOFT = caps.get(256);
        alGetPointervSOFT = caps.get(257);
        alGetPointervDirectSOFT = caps.get(258);
        alSourcedSOFT = caps.get(259);
        alSourcedDirectSOFT = caps.get(260);
        alSource3dSOFT = caps.get(261);
        alSource3dDirectSOFT = caps.get(262);
        alSourcedvSOFT = caps.get(263);
        alSourcedvDirectSOFT = caps.get(264);
        alGetSourcedSOFT = caps.get(265);
        alGetSourcedDirectSOFT = caps.get(266);
        alGetSource3dSOFT = caps.get(267);
        alGetSource3dDirectSOFT = caps.get(268);
        alGetSourcedvSOFT = caps.get(269);
        alGetSourcedvDirectSOFT = caps.get(270);
        alSourcei64SOFT = caps.get(271);
        alSourcei64DirectSOFT = caps.get(272);
        alSource3i64SOFT = caps.get(273);
        alSource3i64DirectSOFT = caps.get(274);
        alSourcei64vSOFT = caps.get(275);
        alSourcei64vDirectSOFT = caps.get(276);
        alGetSourcei64SOFT = caps.get(277);
        alGetSourcei64DirectSOFT = caps.get(278);
        alGetSource3i64SOFT = caps.get(279);
        alGetSource3i64DirectSOFT = caps.get(280);
        alGetSourcei64vSOFT = caps.get(281);
        alGetSourcei64vDirectSOFT = caps.get(282);
        alGetStringiSOFT = caps.get(283);
        alGetStringiDirectSOFT = caps.get(284);
        alSourcePlayAtTimeSOFT = caps.get(285);
        alSourcePlayAtTimeDirectSOFT = caps.get(286);
        alSourcePlayAtTimevSOFT = caps.get(287);
        alSourcePlayAtTimevDirectSOFT = caps.get(288);

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
            39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 
            76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108
        },
            "alGetError", "alGetErrorDirect", "alEnable", "alEnableDirect", "alDisable", "alDisableDirect", "alIsEnabled", "alIsEnabledDirect", "alGetBoolean", 
            "alGetBooleanDirect", "alGetInteger", "alGetIntegerDirect", "alGetFloat", "alGetFloatDirect", "alGetDouble", "alGetDoubleDirect", "alGetBooleanv", 
            "alGetBooleanvDirect", "alGetIntegerv", "alGetIntegervDirect", "alGetFloatv", "alGetFloatvDirect", "alGetDoublev", "alGetDoublevDirect", 
            "alGetString", "alGetStringDirect", "alDistanceModel", "alDistanceModelDirect", "alDopplerFactor", "alDopplerFactorDirect", "alDopplerVelocity", 
            "alListenerf", "alListenerfDirect", "alListeneri", "alListeneriDirect", "alListener3f", "alListener3fDirect", "alListenerfv", "alListenerfvDirect", 
            "alGetListenerf", "alGetListenerfDirect", "alGetListeneri", "alGetListeneriDirect", "alGetListener3f", "alGetListener3fDirect", "alGetListenerfv", 
            "alGetListenerfvDirect", "alGenSources", "alGenSourcesDirect", "alDeleteSources", "alDeleteSourcesDirect", "alIsSource", "alIsSourceDirect", 
            "alSourcef", "alSourcefDirect", "alSource3f", "alSource3fDirect", "alSourcefv", "alSourcefvDirect", "alSourcei", "alSourceiDirect", "alGetSourcef", 
            "alGetSourcefDirect", "alGetSource3f", "alGetSource3fDirect", "alGetSourcefv", "alGetSourcefvDirect", "alGetSourcei", "alGetSourceiDirect", 
            "alGetSourceiv", "alGetSourceivDirect", "alSourceQueueBuffers", "alSourceQueueBuffersDirect", "alSourceUnqueueBuffers", 
            "alSourceUnqueueBuffersDirect", "alSourcePlay", "alSourcePlayDirect", "alSourcePause", "alSourcePauseDirect", "alSourceStop", "alSourceStopDirect", 
            "alSourceRewind", "alSourceRewindDirect", "alSourcePlayv", "alSourcePlayvDirect", "alSourcePausev", "alSourcePausevDirect", "alSourceStopv", 
            "alSourceStopvDirect", "alSourceRewindv", "alSourceRewindvDirect", "alGenBuffers", "alGenBuffersDirect", "alDeleteBuffers", "alDeleteBuffersDirect", 
            "alIsBuffer", "alIsBufferDirect", "alGetBufferf", "alGetBufferfDirect", "alGetBufferi", "alGetBufferiDirect", "alBufferData", "alBufferDataDirect", 
            "alGetEnumValue", "alGetEnumValueDirect", "alGetProcAddress", "alGetProcAddressDirect", "alIsExtensionPresent", "alIsExtensionPresentDirect"
        ) || reportMissing("AL", "OpenAL10");
    }

    private static boolean check_AL11(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("OpenAL11")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 
            138, 139, 140, 141, 142, 143, 144
        },
            "alListener3i", "alListener3iDirect", "alGetListener3i", "alGetListener3iDirect", "alGetListeneriv", "alGetListenerivDirect", "alSource3i", 
            "alSource3iDirect", "alGetSource3i", "alGetSource3iDirect", "alListeneriv", "alListenerivDirect", "alSourceiv", "alSourceivDirect", "alBufferf", 
            "alBufferfDirect", "alBuffer3f", "alBuffer3fDirect", "alBufferfv", "alBufferfvDirect", "alBufferi", "alBufferiDirect", "alBuffer3i", 
            "alBuffer3iDirect", "alBufferiv", "alBufferivDirect", "alGetBuffer3i", "alGetBuffer3iDirect", "alGetBufferiv", "alGetBufferivDirect", 
            "alGetBuffer3f", "alGetBuffer3fDirect", "alGetBufferfv", "alGetBufferfvDirect", "alSpeedOfSound", "alSpeedOfSoundDirect"
        ) || reportMissing("AL", "OpenAL11");
    }

    private static boolean check_EXT_debug(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("AL_EXT_debug")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164
        },
            "alDebugMessageCallbackEXT", "alDebugMessageCallbackDirectEXT", "alDebugMessageInsertEXT", "alDebugMessageInsertDirectEXT", 
            "alDebugMessageControlEXT", "alDebugMessageControlDirectEXT", "alPushDebugGroupEXT", "alPushDebugGroupDirectEXT", "alPopDebugGroupEXT", 
            "alPopDebugGroupDirectEXT", "alGetDebugMessageLogEXT", "alGetDebugMessageLogDirectEXT", "alObjectLabelEXT", "alObjectLabelDirectEXT", 
            "alGetObjectLabelEXT", "alGetObjectLabelDirectEXT", "alGetPointerEXT", "alGetPointerDirectEXT", "alGetPointervEXT", "alGetPointervDirectEXT"
        ) || reportMissing("AL", "AL_EXT_debug");
    }

    private static boolean check_EXT_EFX(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("ALC_EXT_EFX")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 
            194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 
            223, 224, 225, 226, 227, 228, 229, 230
        },
            "alGenEffects", "alGenEffectsDirect", "alDeleteEffects", "alDeleteEffectsDirect", "alIsEffect", "alIsEffectDirect", "alEffecti", "alEffectiDirect", 
            "alEffectiv", "alEffectivDirect", "alEffectf", "alEffectfDirect", "alEffectfv", "alEffectfvDirect", "alGetEffecti", "alGetEffectiDirect", 
            "alGetEffectiv", "alGetEffectivDirect", "alGetEffectf", "alGetEffectfDirect", "alGetEffectfv", "alGetEffectfvDirect", "alGenFilters", 
            "alGenFiltersDirect", "alDeleteFilters", "alDeleteFiltersDirect", "alIsFilter", "alIsFilterDirect", "alFilteri", "alFilteriDirect", "alFilteriv", 
            "alFilterivDirect", "alFilterf", "alFilterfDirect", "alFilterfv", "alFilterfvDirect", "alGetFilteri", "alGetFilteriDirect", "alGetFilteriv", 
            "alGetFilterivDirect", "alGetFilterf", "alGetFilterfDirect", "alGetFilterfv", "alGetFilterfvDirect", "alGenAuxiliaryEffectSlots", 
            "alGenAuxiliaryEffectSlotsDirect", "alDeleteAuxiliaryEffectSlots", "alDeleteAuxiliaryEffectSlotsDirect", "alIsAuxiliaryEffectSlot", 
            "alIsAuxiliaryEffectSlotDirect", "alAuxiliaryEffectSloti", "alAuxiliaryEffectSlotiDirect", "alAuxiliaryEffectSlotiv", 
            "alAuxiliaryEffectSlotivDirect", "alAuxiliaryEffectSlotf", "alAuxiliaryEffectSlotfDirect", "alAuxiliaryEffectSlotfv", 
            "alAuxiliaryEffectSlotfvDirect", "alGetAuxiliaryEffectSloti", "alGetAuxiliaryEffectSlotiDirect", "alGetAuxiliaryEffectSlotiv", 
            "alGetAuxiliaryEffectSlotivDirect", "alGetAuxiliaryEffectSlotf", "alGetAuxiliaryEffectSlotfDirect", "alGetAuxiliaryEffectSlotfv", 
            "alGetAuxiliaryEffectSlotfvDirect"
        ) || reportMissing("AL", "ALC_EXT_EFX");
    }

    private static boolean check_EXT_STATIC_BUFFER(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("AL_EXT_STATIC_BUFFER")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            231, 232
        },
            "alBufferDataStatic", "alBufferDataStaticDirect"
        ) || reportMissing("AL", "AL_EXT_STATIC_BUFFER");
    }

    private static boolean check_SOFT_buffer_samples(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("AL_SOFT_buffer_samples")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            233, 234, 235, 236
        },
            "alBufferSamplesSOFT", "alBufferSubSamplesSOFT", "alGetBufferSamplesSOFT", "alIsBufferFormatSupportedSOFT"
        ) || reportMissing("AL", "AL_SOFT_buffer_samples");
    }

    private static boolean check_SOFT_buffer_sub_data(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("AL_SOFT_buffer_sub_data")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            237, 238
        },
            "alBufferSubDataSOFT", "alBufferSubDataDirectSOFT"
        ) || reportMissing("AL", "AL_SOFT_buffer_sub_data");
    }

    private static boolean check_SOFT_callback_buffer(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("AL_SOFT_callback_buffer")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            239, 240, 241, 242, 243, 244, 245, 246
        },
            "alBufferCallbackSOFT", "alBufferCallbackDirectSOFT", "alGetBufferPtrSOFT", "alGetBufferPtrDirectSOFT", "alGetBuffer3PtrSOFT", 
            "alGetBuffer3PtrDirectSOFT", "alGetBufferPtrvSOFT", "alGetBufferPtrvDirectSOFT"
        ) || reportMissing("AL", "AL_SOFT_callback_buffer");
    }

    private static boolean check_SOFT_deferred_updates(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("AL_SOFT_deferred_updates")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            247, 248, 249, 250
        },
            "alDeferUpdatesSOFT", "alDeferUpdatesDirectSOFT", "alProcessUpdatesSOFT", "alProcessUpdatesDirectSOFT"
        ) || reportMissing("AL", "AL_SOFT_deferred_updates");
    }

    private static boolean check_SOFT_events(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("AL_SOFT_events")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            251, 252, 253, 254, 255, 256, 257, 258
        },
            "alEventControlSOFT", "alEventControlDirectSOFT", "alEventCallbackSOFT", "alEventCallbackDirectSOFT", "alGetPointerSOFT", "alGetPointerDirectSOFT", 
            "alGetPointervSOFT", "alGetPointervDirectSOFT"
        ) || reportMissing("AL", "AL_SOFT_events");
    }

    private static boolean check_SOFT_source_latency(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("AL_SOFT_source_latency")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            259, 260, 261, 262, 263, 264, 265, 266, 267, 268, 269, 270, 271, 272, 273, 274, 275, 276, 277, 278, 279, 280, 281, 282
        },
            "alSourcedSOFT", "alSourcedDirectSOFT", "alSource3dSOFT", "alSource3dDirectSOFT", "alSourcedvSOFT", "alSourcedvDirectSOFT", "alGetSourcedSOFT", 
            "alGetSourcedDirectSOFT", "alGetSource3dSOFT", "alGetSource3dDirectSOFT", "alGetSourcedvSOFT", "alGetSourcedvDirectSOFT", "alSourcei64SOFT", 
            "alSourcei64DirectSOFT", "alSource3i64SOFT", "alSource3i64DirectSOFT", "alSourcei64vSOFT", "alSourcei64vDirectSOFT", "alGetSourcei64SOFT", 
            "alGetSourcei64DirectSOFT", "alGetSource3i64SOFT", "alGetSource3i64DirectSOFT", "alGetSourcei64vSOFT", "alGetSourcei64vDirectSOFT"
        ) || reportMissing("AL", "AL_SOFT_source_latency");
    }

    private static boolean check_SOFT_source_resampler(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("AL_SOFT_source_resampler")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            283, 284
        },
            "alGetStringiSOFT", "alGetStringiDirectSOFT"
        ) || reportMissing("AL", "AL_SOFT_source_resampler");
    }

    private static boolean check_SOFT_source_start_delay(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("AL_SOFT_source_start_delay")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            285, 286, 287, 288
        },
            "alSourcePlayAtTimeSOFT", "alSourcePlayAtTimeDirectSOFT", "alSourcePlayAtTimevSOFT", "alSourcePlayAtTimevDirectSOFT"
        ) || reportMissing("AL", "AL_SOFT_source_start_delay");
    }

}
