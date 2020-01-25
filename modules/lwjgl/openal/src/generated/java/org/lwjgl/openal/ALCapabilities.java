/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.lwjgl.system.*;
import java.util.Set;
import org.lwjgl.*;

import static org.lwjgl.system.APIUtil.*;

/** Defines the capabilities of an OpenAL context. */
public final class ALCapabilities {

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
        alIsExtensionPresent,
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
        alSpeedOfSound,
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
        alGetAuxiliaryEffectSlotfv,
        alBufferDataStatic,
        alBufferSamplesSOFT,
        alBufferSubSamplesSOFT,
        alGetBufferSamplesSOFT,
        alIsBufferFormatSupportedSOFT,
        alBufferSubDataSOFT,
        alDeferUpdatesSOFT,
        alProcessUpdatesSOFT,
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
        alGetSourcei64vSOFT,
        alGetStringiSOFT;

    /** When true, {@link AL10} is supported. */
    public final boolean OpenAL10;
    /** When true, {@link AL11} is supported. */
    public final boolean OpenAL11;
    /** When true, {@link SOFTBformatEx} is supported. */
    public final boolean OpenAL_SOFT_bformat_ex;
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
    public final boolean AL_EXT_static_buffer;
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
    /** When true, {@link SOFTBlockAlignment} is supported. */
    public final boolean AL_SOFT_block_alignment;
    /** When true, {@link SOFTBufferSamples} is supported. */
    public final boolean AL_SOFT_buffer_samples;
    /** When true, {@link SOFTBufferSubData} is supported. */
    public final boolean AL_SOFT_buffer_sub_data;
    /** When true, {@link SOFTDeferredUpdates} is supported. */
    public final boolean AL_SOFT_deferred_updates;
    /** When true, {@link SOFTDirectChannels} is supported. */
    public final boolean AL_SOFT_direct_channels;
    /** When true, {@link SOFTDirectChannelsRemix} is supported. */
    public final boolean AL_SOFT_direct_channels_remix;
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

    /** Off-heap array of the above function addresses. */
    final PointerBuffer addresses;

    ALCapabilities(FunctionProvider provider, Set<String> ext) {
        alGetError = provider.getFunctionAddress("alGetError");
        alEnable = provider.getFunctionAddress("alEnable");
        alDisable = provider.getFunctionAddress("alDisable");
        alIsEnabled = provider.getFunctionAddress("alIsEnabled");
        alGetBoolean = provider.getFunctionAddress("alGetBoolean");
        alGetInteger = provider.getFunctionAddress("alGetInteger");
        alGetFloat = provider.getFunctionAddress("alGetFloat");
        alGetDouble = provider.getFunctionAddress("alGetDouble");
        alGetBooleanv = provider.getFunctionAddress("alGetBooleanv");
        alGetIntegerv = provider.getFunctionAddress("alGetIntegerv");
        alGetFloatv = provider.getFunctionAddress("alGetFloatv");
        alGetDoublev = provider.getFunctionAddress("alGetDoublev");
        alGetString = provider.getFunctionAddress("alGetString");
        alDistanceModel = provider.getFunctionAddress("alDistanceModel");
        alDopplerFactor = provider.getFunctionAddress("alDopplerFactor");
        alDopplerVelocity = provider.getFunctionAddress("alDopplerVelocity");
        alListenerf = provider.getFunctionAddress("alListenerf");
        alListeneri = provider.getFunctionAddress("alListeneri");
        alListener3f = provider.getFunctionAddress("alListener3f");
        alListenerfv = provider.getFunctionAddress("alListenerfv");
        alGetListenerf = provider.getFunctionAddress("alGetListenerf");
        alGetListeneri = provider.getFunctionAddress("alGetListeneri");
        alGetListener3f = provider.getFunctionAddress("alGetListener3f");
        alGetListenerfv = provider.getFunctionAddress("alGetListenerfv");
        alGenSources = provider.getFunctionAddress("alGenSources");
        alDeleteSources = provider.getFunctionAddress("alDeleteSources");
        alIsSource = provider.getFunctionAddress("alIsSource");
        alSourcef = provider.getFunctionAddress("alSourcef");
        alSource3f = provider.getFunctionAddress("alSource3f");
        alSourcefv = provider.getFunctionAddress("alSourcefv");
        alSourcei = provider.getFunctionAddress("alSourcei");
        alGetSourcef = provider.getFunctionAddress("alGetSourcef");
        alGetSource3f = provider.getFunctionAddress("alGetSource3f");
        alGetSourcefv = provider.getFunctionAddress("alGetSourcefv");
        alGetSourcei = provider.getFunctionAddress("alGetSourcei");
        alGetSourceiv = provider.getFunctionAddress("alGetSourceiv");
        alSourceQueueBuffers = provider.getFunctionAddress("alSourceQueueBuffers");
        alSourceUnqueueBuffers = provider.getFunctionAddress("alSourceUnqueueBuffers");
        alSourcePlay = provider.getFunctionAddress("alSourcePlay");
        alSourcePause = provider.getFunctionAddress("alSourcePause");
        alSourceStop = provider.getFunctionAddress("alSourceStop");
        alSourceRewind = provider.getFunctionAddress("alSourceRewind");
        alSourcePlayv = provider.getFunctionAddress("alSourcePlayv");
        alSourcePausev = provider.getFunctionAddress("alSourcePausev");
        alSourceStopv = provider.getFunctionAddress("alSourceStopv");
        alSourceRewindv = provider.getFunctionAddress("alSourceRewindv");
        alGenBuffers = provider.getFunctionAddress("alGenBuffers");
        alDeleteBuffers = provider.getFunctionAddress("alDeleteBuffers");
        alIsBuffer = provider.getFunctionAddress("alIsBuffer");
        alGetBufferf = provider.getFunctionAddress("alGetBufferf");
        alGetBufferi = provider.getFunctionAddress("alGetBufferi");
        alBufferData = provider.getFunctionAddress("alBufferData");
        alGetEnumValue = provider.getFunctionAddress("alGetEnumValue");
        alGetProcAddress = provider.getFunctionAddress("alGetProcAddress");
        alIsExtensionPresent = provider.getFunctionAddress("alIsExtensionPresent");
        alListener3i = provider.getFunctionAddress("alListener3i");
        alGetListeneriv = provider.getFunctionAddress("alGetListeneriv");
        alSource3i = provider.getFunctionAddress("alSource3i");
        alListeneriv = provider.getFunctionAddress("alListeneriv");
        alSourceiv = provider.getFunctionAddress("alSourceiv");
        alBufferf = provider.getFunctionAddress("alBufferf");
        alBuffer3f = provider.getFunctionAddress("alBuffer3f");
        alBufferfv = provider.getFunctionAddress("alBufferfv");
        alBufferi = provider.getFunctionAddress("alBufferi");
        alBuffer3i = provider.getFunctionAddress("alBuffer3i");
        alBufferiv = provider.getFunctionAddress("alBufferiv");
        alGetBufferiv = provider.getFunctionAddress("alGetBufferiv");
        alGetBufferfv = provider.getFunctionAddress("alGetBufferfv");
        alSpeedOfSound = provider.getFunctionAddress("alSpeedOfSound");
        alGenEffects = provider.getFunctionAddress("alGenEffects");
        alDeleteEffects = provider.getFunctionAddress("alDeleteEffects");
        alIsEffect = provider.getFunctionAddress("alIsEffect");
        alEffecti = provider.getFunctionAddress("alEffecti");
        alEffectiv = provider.getFunctionAddress("alEffectiv");
        alEffectf = provider.getFunctionAddress("alEffectf");
        alEffectfv = provider.getFunctionAddress("alEffectfv");
        alGetEffecti = provider.getFunctionAddress("alGetEffecti");
        alGetEffectiv = provider.getFunctionAddress("alGetEffectiv");
        alGetEffectf = provider.getFunctionAddress("alGetEffectf");
        alGetEffectfv = provider.getFunctionAddress("alGetEffectfv");
        alGenFilters = provider.getFunctionAddress("alGenFilters");
        alDeleteFilters = provider.getFunctionAddress("alDeleteFilters");
        alIsFilter = provider.getFunctionAddress("alIsFilter");
        alFilteri = provider.getFunctionAddress("alFilteri");
        alFilteriv = provider.getFunctionAddress("alFilteriv");
        alFilterf = provider.getFunctionAddress("alFilterf");
        alFilterfv = provider.getFunctionAddress("alFilterfv");
        alGetFilteri = provider.getFunctionAddress("alGetFilteri");
        alGetFilteriv = provider.getFunctionAddress("alGetFilteriv");
        alGetFilterf = provider.getFunctionAddress("alGetFilterf");
        alGetFilterfv = provider.getFunctionAddress("alGetFilterfv");
        alGenAuxiliaryEffectSlots = provider.getFunctionAddress("alGenAuxiliaryEffectSlots");
        alDeleteAuxiliaryEffectSlots = provider.getFunctionAddress("alDeleteAuxiliaryEffectSlots");
        alIsAuxiliaryEffectSlot = provider.getFunctionAddress("alIsAuxiliaryEffectSlot");
        alAuxiliaryEffectSloti = provider.getFunctionAddress("alAuxiliaryEffectSloti");
        alAuxiliaryEffectSlotiv = provider.getFunctionAddress("alAuxiliaryEffectSlotiv");
        alAuxiliaryEffectSlotf = provider.getFunctionAddress("alAuxiliaryEffectSlotf");
        alAuxiliaryEffectSlotfv = provider.getFunctionAddress("alAuxiliaryEffectSlotfv");
        alGetAuxiliaryEffectSloti = provider.getFunctionAddress("alGetAuxiliaryEffectSloti");
        alGetAuxiliaryEffectSlotiv = provider.getFunctionAddress("alGetAuxiliaryEffectSlotiv");
        alGetAuxiliaryEffectSlotf = provider.getFunctionAddress("alGetAuxiliaryEffectSlotf");
        alGetAuxiliaryEffectSlotfv = provider.getFunctionAddress("alGetAuxiliaryEffectSlotfv");
        alBufferDataStatic = provider.getFunctionAddress("alBufferDataStatic");
        alBufferSamplesSOFT = provider.getFunctionAddress("alBufferSamplesSOFT");
        alBufferSubSamplesSOFT = provider.getFunctionAddress("alBufferSubSamplesSOFT");
        alGetBufferSamplesSOFT = provider.getFunctionAddress("alGetBufferSamplesSOFT");
        alIsBufferFormatSupportedSOFT = provider.getFunctionAddress("alIsBufferFormatSupportedSOFT");
        alBufferSubDataSOFT = provider.getFunctionAddress("alBufferSubDataSOFT");
        alDeferUpdatesSOFT = provider.getFunctionAddress("alDeferUpdatesSOFT");
        alProcessUpdatesSOFT = provider.getFunctionAddress("alProcessUpdatesSOFT");
        alSourcedSOFT = provider.getFunctionAddress("alSourcedSOFT");
        alSource3dSOFT = provider.getFunctionAddress("alSource3dSOFT");
        alSourcedvSOFT = provider.getFunctionAddress("alSourcedvSOFT");
        alGetSourcedSOFT = provider.getFunctionAddress("alGetSourcedSOFT");
        alGetSource3dSOFT = provider.getFunctionAddress("alGetSource3dSOFT");
        alGetSourcedvSOFT = provider.getFunctionAddress("alGetSourcedvSOFT");
        alSourcei64SOFT = provider.getFunctionAddress("alSourcei64SOFT");
        alSource3i64SOFT = provider.getFunctionAddress("alSource3i64SOFT");
        alSourcei64vSOFT = provider.getFunctionAddress("alSourcei64vSOFT");
        alGetSourcei64SOFT = provider.getFunctionAddress("alGetSourcei64SOFT");
        alGetSource3i64SOFT = provider.getFunctionAddress("alGetSource3i64SOFT");
        alGetSourcei64vSOFT = provider.getFunctionAddress("alGetSourcei64vSOFT");
        alGetStringiSOFT = provider.getFunctionAddress("alGetStringiSOFT");

        OpenAL10 = ext.contains("OpenAL10") && checkExtension("OpenAL10", AL10.isAvailable(this));
        OpenAL11 = ext.contains("OpenAL11") && checkExtension("OpenAL11", AL11.isAvailable(this));
        OpenAL_SOFT_bformat_ex = ext.contains("OpenAL_SOFT_bformat_ex");
        AL_EXT_ALAW = ext.contains("AL_EXT_ALAW");
        AL_EXT_BFORMAT = ext.contains("AL_EXT_BFORMAT");
        AL_EXT_DOUBLE = ext.contains("AL_EXT_DOUBLE");
        ALC_EXT_EFX = ext.contains("ALC_EXT_EFX") && checkExtension("ALC_EXT_EFX", EXTEfx.isAvailable(this));
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
        AL_EXT_static_buffer = ext.contains("AL_EXT_static_buffer") && checkExtension("AL_EXT_static_buffer", EXTStaticBuffer.isAvailable(this));
        AL_EXT_STEREO_ANGLES = ext.contains("AL_EXT_STEREO_ANGLES");
        AL_EXT_vorbis = ext.contains("AL_EXT_vorbis");
        AL_LOKI_IMA_ADPCM = ext.contains("AL_LOKI_IMA_ADPCM");
        AL_LOKI_quadriphonic = ext.contains("AL_LOKI_quadriphonic");
        AL_LOKI_WAVE_format = ext.contains("AL_LOKI_WAVE_format");
        AL_SOFT_block_alignment = ext.contains("AL_SOFT_block_alignment");
        AL_SOFT_buffer_samples = ext.contains("AL_SOFT_buffer_samples") && checkExtension("AL_SOFT_buffer_samples", SOFTBufferSamples.isAvailable(this));
        AL_SOFT_buffer_sub_data = ext.contains("AL_SOFT_buffer_sub_data") && checkExtension("AL_SOFT_buffer_sub_data", SOFTBufferSubData.isAvailable(this));
        AL_SOFT_deferred_updates = ext.contains("AL_SOFT_deferred_updates") && checkExtension("AL_SOFT_deferred_updates", SOFTDeferredUpdates.isAvailable(this));
        AL_SOFT_direct_channels = ext.contains("AL_SOFT_direct_channels");
        AL_SOFT_direct_channels_remix = ext.contains("AL_SOFT_direct_channels_remix");
        AL_SOFT_gain_clamp_ex = ext.contains("AL_SOFT_gain_clamp_ex");
        AL_SOFT_loop_points = ext.contains("AL_SOFT_loop_points");
        AL_SOFT_MSADPCM = ext.contains("AL_SOFT_MSADPCM");
        AL_SOFT_source_latency = ext.contains("AL_SOFT_source_latency") && checkExtension("AL_SOFT_source_latency", SOFTSourceLatency.isAvailable(this));
        AL_SOFT_source_length = ext.contains("AL_SOFT_source_length");
        AL_SOFT_source_resampler = ext.contains("AL_SOFT_source_resampler") && checkExtension("AL_SOFT_source_resampler", SOFTSourceResampler.isAvailable(this));
        AL_SOFT_source_spatialize = ext.contains("AL_SOFT_source_spatialize");

        addresses = ThreadLocalUtil.getAddressesFromCapabilities(this);
    }

    private static boolean checkExtension(String extension, boolean supported) {
        if (supported) {
            return true;
        }

        apiLog("[AL] " + extension + " was reported as available but an entry point is missing.");
        return false;
    }

}