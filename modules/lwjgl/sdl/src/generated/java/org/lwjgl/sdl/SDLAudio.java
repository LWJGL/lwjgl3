/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SDLAudio {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetNumAudioDrivers             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumAudioDrivers"),
            GetAudioDriver                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioDriver"),
            GetCurrentAudioDriver          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCurrentAudioDriver"),
            GetAudioPlaybackDevices        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioPlaybackDevices"),
            GetAudioRecordingDevices       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioRecordingDevices"),
            GetAudioDeviceName             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioDeviceName"),
            GetAudioDeviceFormat           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioDeviceFormat"),
            GetAudioDeviceChannelMap       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioDeviceChannelMap"),
            OpenAudioDevice                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenAudioDevice"),
            IsAudioDevicePhysical          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_IsAudioDevicePhysical"),
            IsAudioDevicePlayback          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_IsAudioDevicePlayback"),
            PauseAudioDevice               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_PauseAudioDevice"),
            ResumeAudioDevice              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ResumeAudioDevice"),
            AudioDevicePaused              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_AudioDevicePaused"),
            GetAudioDeviceGain             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioDeviceGain"),
            SetAudioDeviceGain             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetAudioDeviceGain"),
            CloseAudioDevice               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CloseAudioDevice"),
            BindAudioStreams               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindAudioStreams"),
            BindAudioStream                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindAudioStream"),
            UnbindAudioStreams             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_UnbindAudioStreams"),
            UnbindAudioStream              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_UnbindAudioStream"),
            GetAudioStreamDevice           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioStreamDevice"),
            CreateAudioStream              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateAudioStream"),
            GetAudioStreamProperties       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioStreamProperties"),
            GetAudioStreamFormat           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioStreamFormat"),
            SetAudioStreamFormat           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetAudioStreamFormat"),
            GetAudioStreamFrequencyRatio   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioStreamFrequencyRatio"),
            SetAudioStreamFrequencyRatio   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetAudioStreamFrequencyRatio"),
            GetAudioStreamGain             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioStreamGain"),
            SetAudioStreamGain             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetAudioStreamGain"),
            GetAudioStreamInputChannelMap  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioStreamInputChannelMap"),
            GetAudioStreamOutputChannelMap = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioStreamOutputChannelMap"),
            SetAudioStreamInputChannelMap  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetAudioStreamInputChannelMap"),
            SetAudioStreamOutputChannelMap = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetAudioStreamOutputChannelMap"),
            PutAudioStreamData             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_PutAudioStreamData"),
            GetAudioStreamData             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioStreamData"),
            GetAudioStreamAvailable        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioStreamAvailable"),
            GetAudioStreamQueued           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioStreamQueued"),
            FlushAudioStream               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_FlushAudioStream"),
            ClearAudioStream               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ClearAudioStream"),
            PauseAudioStreamDevice         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_PauseAudioStreamDevice"),
            ResumeAudioStreamDevice        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ResumeAudioStreamDevice"),
            AudioStreamDevicePaused        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_AudioStreamDevicePaused"),
            LockAudioStream                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_LockAudioStream"),
            UnlockAudioStream              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_UnlockAudioStream"),
            SetAudioStreamGetCallback      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetAudioStreamGetCallback"),
            SetAudioStreamPutCallback      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetAudioStreamPutCallback"),
            DestroyAudioStream             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyAudioStream"),
            OpenAudioDeviceStream          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenAudioDeviceStream"),
            SetAudioPostmixCallback        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetAudioPostmixCallback"),
            LoadWAV_IO                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_LoadWAV_IO"),
            LoadWAV                        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_LoadWAV"),
            MixAudio                       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_MixAudio"),
            ConvertAudioSamples            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ConvertAudioSamples"),
            GetAudioFormatName             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioFormatName"),
            GetSilenceValueForFormat       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSilenceValueForFormat");

    }

    public static final int
        SDL_AUDIO_MASK_BITSIZE    = 0xFF,
        SDL_AUDIO_MASK_FLOAT      = 1 << 8,
        SDL_AUDIO_MASK_BIG_ENDIAN = 1 << 12,
        SDL_AUDIO_MASK_SIGNED     = 1 << 15;

    public static final int
        SDL_AUDIO_UNKNOWN = 0x0000,
        SDL_AUDIO_U8      = 0x0008,
        SDL_AUDIO_S8      = 0x8008,
        SDL_AUDIO_S16LE   = 0x8010,
        SDL_AUDIO_S16BE   = 0x9010,
        SDL_AUDIO_S32LE   = 0x8020,
        SDL_AUDIO_S32BE   = 0x9020,
        SDL_AUDIO_F32LE   = 0x8120,
        SDL_AUDIO_F32BE   = 0x9120,
        SDL_AUDIO_S16     = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_AUDIO_S16LE : SDL_AUDIO_S16BE,
        SDL_AUDIO_S32     = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_AUDIO_S32LE : SDL_AUDIO_S32BE,
        SDL_AUDIO_F32     = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_AUDIO_S32LE : SDL_AUDIO_S32BE;

    public static final int
        SDL_AUDIO_DEVICE_DEFAULT_PLAYBACK  = 0xFFFFFFFF,
        SDL_AUDIO_DEVICE_DEFAULT_RECORDING = 0xFFFFFFFE;

    protected SDLAudio() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_DEFINE_AUDIO_FORMAT ] ---

    /** {@code uint32_t SDL_DEFINE_AUDIO_FORMAT(uint32_t signed, uint32_t bigendian, uint32_t flt, uint32_t size)} */
    @NativeType("uint32_t")
    public static int SDL_DEFINE_AUDIO_FORMAT(@NativeType("uint32_t") int signed, @NativeType("uint32_t") int bigendian, @NativeType("uint32_t") int flt, @NativeType("uint32_t") int size) {
        return ((signed & 1) << 15) | ((bigendian & 1) << 12) | ((flt & 1) << 8) | (size & SDL_AUDIO_MASK_BITSIZE);
    }

    // --- [ SDL_AUDIO_BITSIZE ] ---

    /** {@code uint32_t SDL_AUDIO_BITSIZE(SDL_AudioFormat x)} */
    @NativeType("uint32_t")
    public static int SDL_AUDIO_BITSIZE(@NativeType("SDL_AudioFormat") int x) {
        return x & SDL_AUDIO_MASK_BITSIZE;
    }

    // --- [ SDL_AUDIO_BYTESIZE ] ---

    /** {@code uint32_t SDL_AUDIO_BYTESIZE(SDL_AudioFormat x)} */
    @NativeType("uint32_t")
    public static int SDL_AUDIO_BYTESIZE(@NativeType("SDL_AudioFormat") int x) {
        return SDL_AUDIO_BITSIZE(x) / 8;
    }

    // --- [ SDL_AUDIO_ISFLOAT ] ---

    /** {@code bool SDL_AUDIO_ISFLOAT(SDL_AudioFormat x)} */
    @NativeType("bool")
    public static boolean SDL_AUDIO_ISFLOAT(@NativeType("SDL_AudioFormat") int x) {
        return (x & SDL_AUDIO_MASK_FLOAT) != 0;
    }

    // --- [ SDL_AUDIO_ISBIGENDIAN ] ---

    /** {@code bool SDL_AUDIO_ISBIGENDIAN(SDL_AudioFormat x)} */
    @NativeType("bool")
    public static boolean SDL_AUDIO_ISBIGENDIAN(@NativeType("SDL_AudioFormat") int x) {
        return (x & SDL_AUDIO_MASK_BIG_ENDIAN) != 0;
    }

    // --- [ SDL_AUDIO_ISLITTLEENDIAN ] ---

    /** {@code bool SDL_AUDIO_ISLITTLEENDIAN(SDL_AudioFormat x)} */
    @NativeType("bool")
    public static boolean SDL_AUDIO_ISLITTLEENDIAN(@NativeType("SDL_AudioFormat") int x) {
        return !SDL_AUDIO_ISBIGENDIAN(x);
    }

    // --- [ SDL_AUDIO_ISSIGNED ] ---

    /** {@code bool SDL_AUDIO_ISSIGNED(SDL_AudioFormat x)} */
    @NativeType("bool")
    public static boolean SDL_AUDIO_ISSIGNED(@NativeType("SDL_AudioFormat") int x) {
        return (x & SDL_AUDIO_MASK_SIGNED) != 0;
    }

    // --- [ SDL_AUDIO_ISINT ] ---

    /** {@code bool SDL_AUDIO_ISINT(SDL_AudioFormat x)} */
    @NativeType("bool")
    public static boolean SDL_AUDIO_ISINT(@NativeType("SDL_AudioFormat") int x) {
        return !SDL_AUDIO_ISFLOAT(x);
    }

    // --- [ SDL_AUDIO_ISUNSIGNED ] ---

    /** {@code bool SDL_AUDIO_ISUNSIGNED(SDL_AudioFormat x)} */
    @NativeType("bool")
    public static boolean SDL_AUDIO_ISUNSIGNED(@NativeType("SDL_AudioFormat") int x) {
        return !SDL_AUDIO_ISSIGNED(x);
    }

    // --- [ SDL_AUDIO_FRAMESIZE ] ---

    /** {@code uint32_t SDL_AUDIO_FRAMESIZE(SDL_AudioSpec x)} */
    @NativeType("uint32_t")
    public static int SDL_AUDIO_FRAMESIZE(SDL_AudioSpec x) {
        return SDL_AUDIO_BYTESIZE(x.format()) * x.channels();
    }

    // --- [ SDL_GetNumAudioDrivers ] ---

    /** {@code int SDL_GetNumAudioDrivers(void)} */
    public static int SDL_GetNumAudioDrivers() {
        long __functionAddress = Functions.GetNumAudioDrivers;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_GetAudioDriver ] ---

    /** {@code char const * SDL_GetAudioDriver(int index)} */
    public static long nSDL_GetAudioDriver(int index) {
        long __functionAddress = Functions.GetAudioDriver;
        return invokeP(index, __functionAddress);
    }

    /** {@code char const * SDL_GetAudioDriver(int index)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetAudioDriver(int index) {
        long __result = nSDL_GetAudioDriver(index);
        return memASCIISafe(__result);
    }

    // --- [ SDL_GetCurrentAudioDriver ] ---

    /** {@code char const * SDL_GetCurrentAudioDriver(void)} */
    public static long nSDL_GetCurrentAudioDriver() {
        long __functionAddress = Functions.GetCurrentAudioDriver;
        return invokeP(__functionAddress);
    }

    /** {@code char const * SDL_GetCurrentAudioDriver(void)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetCurrentAudioDriver() {
        long __result = nSDL_GetCurrentAudioDriver();
        return memASCIISafe(__result);
    }

    // --- [ SDL_GetAudioPlaybackDevices ] ---

    /** {@code SDL_AudioDeviceID * SDL_GetAudioPlaybackDevices(int * count)} */
    public static long nSDL_GetAudioPlaybackDevices(long count) {
        long __functionAddress = Functions.GetAudioPlaybackDevices;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_AudioDeviceID * SDL_GetAudioPlaybackDevices(int * count)} */
    @NativeType("SDL_AudioDeviceID *")
    public static @Nullable IntBuffer SDL_GetAudioPlaybackDevices() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetAudioPlaybackDevices(memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetAudioRecordingDevices ] ---

    /** {@code SDL_AudioDeviceID * SDL_GetAudioRecordingDevices(int * count)} */
    public static long nSDL_GetAudioRecordingDevices(long count) {
        long __functionAddress = Functions.GetAudioRecordingDevices;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_AudioDeviceID * SDL_GetAudioRecordingDevices(int * count)} */
    @NativeType("SDL_AudioDeviceID *")
    public static @Nullable IntBuffer SDL_GetAudioRecordingDevices() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetAudioRecordingDevices(memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetAudioDeviceName ] ---

    /** {@code char const * SDL_GetAudioDeviceName(SDL_AudioDeviceID devid)} */
    public static long nSDL_GetAudioDeviceName(int devid) {
        long __functionAddress = Functions.GetAudioDeviceName;
        return invokeP(devid, __functionAddress);
    }

    /** {@code char const * SDL_GetAudioDeviceName(SDL_AudioDeviceID devid)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetAudioDeviceName(@NativeType("SDL_AudioDeviceID") int devid) {
        long __result = nSDL_GetAudioDeviceName(devid);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetAudioDeviceFormat ] ---

    /** {@code bool SDL_GetAudioDeviceFormat(SDL_AudioDeviceID devid, SDL_AudioSpec * spec, int * sample_frames)} */
    public static boolean nSDL_GetAudioDeviceFormat(int devid, long spec, long sample_frames) {
        long __functionAddress = Functions.GetAudioDeviceFormat;
        return invokePPZ(devid, spec, sample_frames, __functionAddress);
    }

    /** {@code bool SDL_GetAudioDeviceFormat(SDL_AudioDeviceID devid, SDL_AudioSpec * spec, int * sample_frames)} */
    @NativeType("bool")
    public static boolean SDL_GetAudioDeviceFormat(@NativeType("SDL_AudioDeviceID") int devid, @NativeType("SDL_AudioSpec *") SDL_AudioSpec spec, @NativeType("int *") IntBuffer sample_frames) {
        if (CHECKS) {
            check(sample_frames, 1);
        }
        return nSDL_GetAudioDeviceFormat(devid, spec.address(), memAddress(sample_frames));
    }

    // --- [ SDL_GetAudioDeviceChannelMap ] ---

    /** {@code int * SDL_GetAudioDeviceChannelMap(SDL_AudioDeviceID devid, int * count)} */
    public static long nSDL_GetAudioDeviceChannelMap(int devid, long count) {
        long __functionAddress = Functions.GetAudioDeviceChannelMap;
        return invokePP(devid, count, __functionAddress);
    }

    /** {@code int * SDL_GetAudioDeviceChannelMap(SDL_AudioDeviceID devid, int * count)} */
    @NativeType("int *")
    public static @Nullable IntBuffer SDL_GetAudioDeviceChannelMap(@NativeType("SDL_AudioDeviceID") int devid) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetAudioDeviceChannelMap(devid, memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_OpenAudioDevice ] ---

    /** {@code SDL_AudioDeviceID SDL_OpenAudioDevice(SDL_AudioDeviceID devid, SDL_AudioSpec const * spec)} */
    public static int nSDL_OpenAudioDevice(int devid, long spec) {
        long __functionAddress = Functions.OpenAudioDevice;
        return invokePI(devid, spec, __functionAddress);
    }

    /** {@code SDL_AudioDeviceID SDL_OpenAudioDevice(SDL_AudioDeviceID devid, SDL_AudioSpec const * spec)} */
    @NativeType("SDL_AudioDeviceID")
    public static int SDL_OpenAudioDevice(@NativeType("SDL_AudioDeviceID") int devid, @NativeType("SDL_AudioSpec const *") @Nullable SDL_AudioSpec spec) {
        return nSDL_OpenAudioDevice(devid, memAddressSafe(spec));
    }

    // --- [ SDL_IsAudioDevicePhysical ] ---

    /** {@code bool SDL_IsAudioDevicePhysical(SDL_AudioDeviceID devid)} */
    @NativeType("bool")
    public static boolean SDL_IsAudioDevicePhysical(@NativeType("SDL_AudioDeviceID") int devid) {
        long __functionAddress = Functions.IsAudioDevicePhysical;
        return invokeZ(devid, __functionAddress);
    }

    // --- [ SDL_IsAudioDevicePlayback ] ---

    /** {@code bool SDL_IsAudioDevicePlayback(SDL_AudioDeviceID devid)} */
    @NativeType("bool")
    public static boolean SDL_IsAudioDevicePlayback(@NativeType("SDL_AudioDeviceID") int devid) {
        long __functionAddress = Functions.IsAudioDevicePlayback;
        return invokeZ(devid, __functionAddress);
    }

    // --- [ SDL_PauseAudioDevice ] ---

    /** {@code bool SDL_PauseAudioDevice(SDL_AudioDeviceID devid)} */
    @NativeType("bool")
    public static boolean SDL_PauseAudioDevice(@NativeType("SDL_AudioDeviceID") int devid) {
        long __functionAddress = Functions.PauseAudioDevice;
        return invokeZ(devid, __functionAddress);
    }

    // --- [ SDL_ResumeAudioDevice ] ---

    /** {@code bool SDL_ResumeAudioDevice(SDL_AudioDeviceID devid)} */
    @NativeType("bool")
    public static boolean SDL_ResumeAudioDevice(@NativeType("SDL_AudioDeviceID") int devid) {
        long __functionAddress = Functions.ResumeAudioDevice;
        return invokeZ(devid, __functionAddress);
    }

    // --- [ SDL_AudioDevicePaused ] ---

    /** {@code bool SDL_AudioDevicePaused(SDL_AudioDeviceID devid)} */
    @NativeType("bool")
    public static boolean SDL_AudioDevicePaused(@NativeType("SDL_AudioDeviceID") int devid) {
        long __functionAddress = Functions.AudioDevicePaused;
        return invokeZ(devid, __functionAddress);
    }

    // --- [ SDL_GetAudioDeviceGain ] ---

    /** {@code float SDL_GetAudioDeviceGain(SDL_AudioDeviceID devid)} */
    public static float SDL_GetAudioDeviceGain(@NativeType("SDL_AudioDeviceID") int devid) {
        long __functionAddress = Functions.GetAudioDeviceGain;
        return invokeF(devid, __functionAddress);
    }

    // --- [ SDL_SetAudioDeviceGain ] ---

    /** {@code bool SDL_SetAudioDeviceGain(SDL_AudioDeviceID devid, float gain)} */
    @NativeType("bool")
    public static boolean SDL_SetAudioDeviceGain(@NativeType("SDL_AudioDeviceID") int devid, float gain) {
        long __functionAddress = Functions.SetAudioDeviceGain;
        return invokeZ(devid, gain, __functionAddress);
    }

    // --- [ SDL_CloseAudioDevice ] ---

    /** {@code void SDL_CloseAudioDevice(SDL_AudioDeviceID devid)} */
    public static void SDL_CloseAudioDevice(@NativeType("SDL_AudioDeviceID") int devid) {
        long __functionAddress = Functions.CloseAudioDevice;
        invokeV(devid, __functionAddress);
    }

    // --- [ SDL_BindAudioStreams ] ---

    /** {@code bool SDL_BindAudioStreams(SDL_AudioDeviceID devid, SDL_AudioStream * const * streams, int num_streams)} */
    public static boolean nSDL_BindAudioStreams(int devid, long streams, int num_streams) {
        long __functionAddress = Functions.BindAudioStreams;
        return invokePZ(devid, streams, num_streams, __functionAddress);
    }

    /** {@code bool SDL_BindAudioStreams(SDL_AudioDeviceID devid, SDL_AudioStream * const * streams, int num_streams)} */
    @NativeType("bool")
    public static boolean SDL_BindAudioStreams(@NativeType("SDL_AudioDeviceID") int devid, @NativeType("SDL_AudioStream * const *") PointerBuffer streams) {
        return nSDL_BindAudioStreams(devid, memAddress(streams), streams.remaining());
    }

    // --- [ SDL_BindAudioStream ] ---

    /** {@code bool SDL_BindAudioStream(SDL_AudioDeviceID devid, SDL_AudioStream * stream)} */
    @NativeType("bool")
    public static boolean SDL_BindAudioStream(@NativeType("SDL_AudioDeviceID") int devid, @NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.BindAudioStream;
        if (CHECKS) {
            check(stream);
        }
        return invokePZ(devid, stream, __functionAddress);
    }

    // --- [ SDL_UnbindAudioStreams ] ---

    /** {@code void SDL_UnbindAudioStreams(SDL_AudioStream * const * streams, int num_streams)} */
    public static void nSDL_UnbindAudioStreams(long streams, int num_streams) {
        long __functionAddress = Functions.UnbindAudioStreams;
        invokePV(streams, num_streams, __functionAddress);
    }

    /** {@code void SDL_UnbindAudioStreams(SDL_AudioStream * const * streams, int num_streams)} */
    public static void SDL_UnbindAudioStreams(@NativeType("SDL_AudioStream * const *") @Nullable PointerBuffer streams) {
        nSDL_UnbindAudioStreams(memAddressSafe(streams), remainingSafe(streams));
    }

    // --- [ SDL_UnbindAudioStream ] ---

    /** {@code void SDL_UnbindAudioStream(SDL_AudioStream * stream)} */
    public static void SDL_UnbindAudioStream(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.UnbindAudioStream;
        invokePV(stream, __functionAddress);
    }

    // --- [ SDL_GetAudioStreamDevice ] ---

    /** {@code SDL_AudioDeviceID SDL_GetAudioStreamDevice(SDL_AudioStream * stream)} */
    @NativeType("SDL_AudioDeviceID")
    public static int SDL_GetAudioStreamDevice(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.GetAudioStreamDevice;
        if (CHECKS) {
            check(stream);
        }
        return invokePI(stream, __functionAddress);
    }

    // --- [ SDL_CreateAudioStream ] ---

    /** {@code SDL_AudioStream * SDL_CreateAudioStream(SDL_AudioSpec const * src_spec, SDL_AudioSpec const * dst_spec)} */
    public static long nSDL_CreateAudioStream(long src_spec, long dst_spec) {
        long __functionAddress = Functions.CreateAudioStream;
        return invokePPP(src_spec, dst_spec, __functionAddress);
    }

    /** {@code SDL_AudioStream * SDL_CreateAudioStream(SDL_AudioSpec const * src_spec, SDL_AudioSpec const * dst_spec)} */
    @NativeType("SDL_AudioStream *")
    public static long SDL_CreateAudioStream(@NativeType("SDL_AudioSpec const *") SDL_AudioSpec src_spec, @NativeType("SDL_AudioSpec const *") SDL_AudioSpec dst_spec) {
        return nSDL_CreateAudioStream(src_spec.address(), dst_spec.address());
    }

    // --- [ SDL_GetAudioStreamProperties ] ---

    /** {@code SDL_PropertiesID SDL_GetAudioStreamProperties(SDL_AudioStream * stream)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_GetAudioStreamProperties(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.GetAudioStreamProperties;
        if (CHECKS) {
            check(stream);
        }
        return invokePI(stream, __functionAddress);
    }

    // --- [ SDL_GetAudioStreamFormat ] ---

    /** {@code bool SDL_GetAudioStreamFormat(SDL_AudioStream * stream, SDL_AudioSpec * src_spec, SDL_AudioSpec * dst_spec)} */
    public static boolean nSDL_GetAudioStreamFormat(long stream, long src_spec, long dst_spec) {
        long __functionAddress = Functions.GetAudioStreamFormat;
        if (CHECKS) {
            check(stream);
        }
        return invokePPPZ(stream, src_spec, dst_spec, __functionAddress);
    }

    /** {@code bool SDL_GetAudioStreamFormat(SDL_AudioStream * stream, SDL_AudioSpec * src_spec, SDL_AudioSpec * dst_spec)} */
    @NativeType("bool")
    public static boolean SDL_GetAudioStreamFormat(@NativeType("SDL_AudioStream *") long stream, @NativeType("SDL_AudioSpec *") @Nullable SDL_AudioSpec src_spec, @NativeType("SDL_AudioSpec *") @Nullable SDL_AudioSpec dst_spec) {
        return nSDL_GetAudioStreamFormat(stream, memAddressSafe(src_spec), memAddressSafe(dst_spec));
    }

    // --- [ SDL_SetAudioStreamFormat ] ---

    /** {@code bool SDL_SetAudioStreamFormat(SDL_AudioStream * stream, SDL_AudioSpec const * src_spec, SDL_AudioSpec const * dst_spec)} */
    public static boolean nSDL_SetAudioStreamFormat(long stream, long src_spec, long dst_spec) {
        long __functionAddress = Functions.SetAudioStreamFormat;
        if (CHECKS) {
            check(stream);
        }
        return invokePPPZ(stream, src_spec, dst_spec, __functionAddress);
    }

    /** {@code bool SDL_SetAudioStreamFormat(SDL_AudioStream * stream, SDL_AudioSpec const * src_spec, SDL_AudioSpec const * dst_spec)} */
    @NativeType("bool")
    public static boolean SDL_SetAudioStreamFormat(@NativeType("SDL_AudioStream *") long stream, @NativeType("SDL_AudioSpec const *") @Nullable SDL_AudioSpec src_spec, @NativeType("SDL_AudioSpec const *") @Nullable SDL_AudioSpec dst_spec) {
        return nSDL_SetAudioStreamFormat(stream, memAddressSafe(src_spec), memAddressSafe(dst_spec));
    }

    // --- [ SDL_GetAudioStreamFrequencyRatio ] ---

    /** {@code float SDL_GetAudioStreamFrequencyRatio(SDL_AudioStream * stream)} */
    public static float SDL_GetAudioStreamFrequencyRatio(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.GetAudioStreamFrequencyRatio;
        if (CHECKS) {
            check(stream);
        }
        return invokePF(stream, __functionAddress);
    }

    // --- [ SDL_SetAudioStreamFrequencyRatio ] ---

    /** {@code bool SDL_SetAudioStreamFrequencyRatio(SDL_AudioStream * stream, float ratio)} */
    @NativeType("bool")
    public static boolean SDL_SetAudioStreamFrequencyRatio(@NativeType("SDL_AudioStream *") long stream, float ratio) {
        long __functionAddress = Functions.SetAudioStreamFrequencyRatio;
        if (CHECKS) {
            check(stream);
        }
        return invokePZ(stream, ratio, __functionAddress);
    }

    // --- [ SDL_GetAudioStreamGain ] ---

    /** {@code float SDL_GetAudioStreamGain(SDL_AudioStream * stream)} */
    public static float SDL_GetAudioStreamGain(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.GetAudioStreamGain;
        if (CHECKS) {
            check(stream);
        }
        return invokePF(stream, __functionAddress);
    }

    // --- [ SDL_SetAudioStreamGain ] ---

    /** {@code bool SDL_SetAudioStreamGain(SDL_AudioStream * stream, float gain)} */
    @NativeType("bool")
    public static boolean SDL_SetAudioStreamGain(@NativeType("SDL_AudioStream *") long stream, float gain) {
        long __functionAddress = Functions.SetAudioStreamGain;
        if (CHECKS) {
            check(stream);
        }
        return invokePZ(stream, gain, __functionAddress);
    }

    // --- [ SDL_GetAudioStreamInputChannelMap ] ---

    /** {@code int * SDL_GetAudioStreamInputChannelMap(SDL_AudioStream * stream, int * count)} */
    public static long nSDL_GetAudioStreamInputChannelMap(long stream, long count) {
        long __functionAddress = Functions.GetAudioStreamInputChannelMap;
        if (CHECKS) {
            check(stream);
        }
        return invokePPP(stream, count, __functionAddress);
    }

    /** {@code int * SDL_GetAudioStreamInputChannelMap(SDL_AudioStream * stream, int * count)} */
    @NativeType("int *")
    public static @Nullable IntBuffer SDL_GetAudioStreamInputChannelMap(@NativeType("SDL_AudioStream *") long stream) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetAudioStreamInputChannelMap(stream, memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetAudioStreamOutputChannelMap ] ---

    /** {@code int * SDL_GetAudioStreamOutputChannelMap(SDL_AudioStream * stream, int * count)} */
    public static long nSDL_GetAudioStreamOutputChannelMap(long stream, long count) {
        long __functionAddress = Functions.GetAudioStreamOutputChannelMap;
        if (CHECKS) {
            check(stream);
        }
        return invokePPP(stream, count, __functionAddress);
    }

    /** {@code int * SDL_GetAudioStreamOutputChannelMap(SDL_AudioStream * stream, int * count)} */
    @NativeType("int *")
    public static @Nullable IntBuffer SDL_GetAudioStreamOutputChannelMap(@NativeType("SDL_AudioStream *") long stream) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetAudioStreamOutputChannelMap(stream, memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetAudioStreamInputChannelMap ] ---

    /** {@code bool SDL_SetAudioStreamInputChannelMap(SDL_AudioStream * stream, int const * chmap, int count)} */
    public static boolean nSDL_SetAudioStreamInputChannelMap(long stream, long chmap, int count) {
        long __functionAddress = Functions.SetAudioStreamInputChannelMap;
        if (CHECKS) {
            check(stream);
        }
        return invokePPZ(stream, chmap, count, __functionAddress);
    }

    /** {@code bool SDL_SetAudioStreamInputChannelMap(SDL_AudioStream * stream, int const * chmap, int count)} */
    @NativeType("bool")
    public static boolean SDL_SetAudioStreamInputChannelMap(@NativeType("SDL_AudioStream *") long stream, @NativeType("int const *") @Nullable IntBuffer chmap) {
        return nSDL_SetAudioStreamInputChannelMap(stream, memAddressSafe(chmap), remainingSafe(chmap));
    }

    // --- [ SDL_SetAudioStreamOutputChannelMap ] ---

    /** {@code bool SDL_SetAudioStreamOutputChannelMap(SDL_AudioStream * stream, int const * chmap, int count)} */
    public static boolean nSDL_SetAudioStreamOutputChannelMap(long stream, long chmap, int count) {
        long __functionAddress = Functions.SetAudioStreamOutputChannelMap;
        if (CHECKS) {
            check(stream);
        }
        return invokePPZ(stream, chmap, count, __functionAddress);
    }

    /** {@code bool SDL_SetAudioStreamOutputChannelMap(SDL_AudioStream * stream, int const * chmap, int count)} */
    @NativeType("bool")
    public static boolean SDL_SetAudioStreamOutputChannelMap(@NativeType("SDL_AudioStream *") long stream, @NativeType("int const *") @Nullable IntBuffer chmap) {
        return nSDL_SetAudioStreamOutputChannelMap(stream, memAddressSafe(chmap), remainingSafe(chmap));
    }

    // --- [ SDL_PutAudioStreamData ] ---

    /** {@code bool SDL_PutAudioStreamData(SDL_AudioStream * stream, void const * buf, int len)} */
    public static boolean nSDL_PutAudioStreamData(long stream, long buf, int len) {
        long __functionAddress = Functions.PutAudioStreamData;
        if (CHECKS) {
            check(stream);
        }
        return invokePPZ(stream, buf, len, __functionAddress);
    }

    /** {@code bool SDL_PutAudioStreamData(SDL_AudioStream * stream, void const * buf, int len)} */
    @NativeType("bool")
    public static boolean SDL_PutAudioStreamData(@NativeType("SDL_AudioStream *") long stream, @NativeType("void const *") ByteBuffer buf) {
        return nSDL_PutAudioStreamData(stream, memAddress(buf), buf.remaining());
    }

    // --- [ SDL_GetAudioStreamData ] ---

    /** {@code int SDL_GetAudioStreamData(SDL_AudioStream * stream, void * buf, int len)} */
    public static int nSDL_GetAudioStreamData(long stream, long buf, int len) {
        long __functionAddress = Functions.GetAudioStreamData;
        if (CHECKS) {
            check(stream);
        }
        return invokePPI(stream, buf, len, __functionAddress);
    }

    /** {@code int SDL_GetAudioStreamData(SDL_AudioStream * stream, void * buf, int len)} */
    public static int SDL_GetAudioStreamData(@NativeType("SDL_AudioStream *") long stream, @NativeType("void *") ByteBuffer buf) {
        return nSDL_GetAudioStreamData(stream, memAddress(buf), buf.remaining());
    }

    // --- [ SDL_GetAudioStreamAvailable ] ---

    /** {@code int SDL_GetAudioStreamAvailable(SDL_AudioStream * stream)} */
    public static int SDL_GetAudioStreamAvailable(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.GetAudioStreamAvailable;
        if (CHECKS) {
            check(stream);
        }
        return invokePI(stream, __functionAddress);
    }

    // --- [ SDL_GetAudioStreamQueued ] ---

    /** {@code int SDL_GetAudioStreamQueued(SDL_AudioStream * stream)} */
    public static int SDL_GetAudioStreamQueued(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.GetAudioStreamQueued;
        if (CHECKS) {
            check(stream);
        }
        return invokePI(stream, __functionAddress);
    }

    // --- [ SDL_FlushAudioStream ] ---

    /** {@code bool SDL_FlushAudioStream(SDL_AudioStream * stream)} */
    @NativeType("bool")
    public static boolean SDL_FlushAudioStream(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.FlushAudioStream;
        if (CHECKS) {
            check(stream);
        }
        return invokePZ(stream, __functionAddress);
    }

    // --- [ SDL_ClearAudioStream ] ---

    /** {@code bool SDL_ClearAudioStream(SDL_AudioStream * stream)} */
    @NativeType("bool")
    public static boolean SDL_ClearAudioStream(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.ClearAudioStream;
        if (CHECKS) {
            check(stream);
        }
        return invokePZ(stream, __functionAddress);
    }

    // --- [ SDL_PauseAudioStreamDevice ] ---

    /** {@code bool SDL_PauseAudioStreamDevice(SDL_AudioStream * stream)} */
    @NativeType("bool")
    public static boolean SDL_PauseAudioStreamDevice(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.PauseAudioStreamDevice;
        if (CHECKS) {
            check(stream);
        }
        return invokePZ(stream, __functionAddress);
    }

    // --- [ SDL_ResumeAudioStreamDevice ] ---

    /** {@code bool SDL_ResumeAudioStreamDevice(SDL_AudioStream * stream)} */
    @NativeType("bool")
    public static boolean SDL_ResumeAudioStreamDevice(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.ResumeAudioStreamDevice;
        if (CHECKS) {
            check(stream);
        }
        return invokePZ(stream, __functionAddress);
    }

    // --- [ SDL_AudioStreamDevicePaused ] ---

    /** {@code bool SDL_AudioStreamDevicePaused(SDL_AudioStream * stream)} */
    @NativeType("bool")
    public static boolean SDL_AudioStreamDevicePaused(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.AudioStreamDevicePaused;
        if (CHECKS) {
            check(stream);
        }
        return invokePZ(stream, __functionAddress);
    }

    // --- [ SDL_LockAudioStream ] ---

    /** {@code bool SDL_LockAudioStream(SDL_AudioStream * stream)} */
    @NativeType("bool")
    public static boolean SDL_LockAudioStream(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.LockAudioStream;
        if (CHECKS) {
            check(stream);
        }
        return invokePZ(stream, __functionAddress);
    }

    // --- [ SDL_UnlockAudioStream ] ---

    /** {@code bool SDL_UnlockAudioStream(SDL_AudioStream * stream)} */
    @NativeType("bool")
    public static boolean SDL_UnlockAudioStream(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.UnlockAudioStream;
        if (CHECKS) {
            check(stream);
        }
        return invokePZ(stream, __functionAddress);
    }

    // --- [ SDL_SetAudioStreamGetCallback ] ---

    /** {@code bool SDL_SetAudioStreamGetCallback(SDL_AudioStream * stream, SDL_AudioStreamCallback callback, void * userdata)} */
    public static boolean nSDL_SetAudioStreamGetCallback(long stream, long callback, long userdata) {
        long __functionAddress = Functions.SetAudioStreamGetCallback;
        if (CHECKS) {
            check(stream);
        }
        return invokePPPZ(stream, callback, userdata, __functionAddress);
    }

    /** {@code bool SDL_SetAudioStreamGetCallback(SDL_AudioStream * stream, SDL_AudioStreamCallback callback, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_SetAudioStreamGetCallback(@NativeType("SDL_AudioStream *") long stream, @NativeType("SDL_AudioStreamCallback") @Nullable SDL_AudioStreamCallbackI callback, @NativeType("void *") long userdata) {
        return nSDL_SetAudioStreamGetCallback(stream, memAddressSafe(callback), userdata);
    }

    // --- [ SDL_SetAudioStreamPutCallback ] ---

    /** {@code bool SDL_SetAudioStreamPutCallback(SDL_AudioStream * stream, SDL_AudioStreamCallback callback, void * userdata)} */
    public static boolean nSDL_SetAudioStreamPutCallback(long stream, long callback, long userdata) {
        long __functionAddress = Functions.SetAudioStreamPutCallback;
        if (CHECKS) {
            check(stream);
        }
        return invokePPPZ(stream, callback, userdata, __functionAddress);
    }

    /** {@code bool SDL_SetAudioStreamPutCallback(SDL_AudioStream * stream, SDL_AudioStreamCallback callback, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_SetAudioStreamPutCallback(@NativeType("SDL_AudioStream *") long stream, @NativeType("SDL_AudioStreamCallback") @Nullable SDL_AudioStreamCallbackI callback, @NativeType("void *") long userdata) {
        return nSDL_SetAudioStreamPutCallback(stream, memAddressSafe(callback), userdata);
    }

    // --- [ SDL_DestroyAudioStream ] ---

    /** {@code void SDL_DestroyAudioStream(SDL_AudioStream * stream)} */
    public static void SDL_DestroyAudioStream(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.DestroyAudioStream;
        if (CHECKS) {
            check(stream);
        }
        invokePV(stream, __functionAddress);
    }

    // --- [ SDL_OpenAudioDeviceStream ] ---

    /** {@code SDL_AudioStream * SDL_OpenAudioDeviceStream(SDL_AudioDeviceID devid, SDL_AudioSpec const * spec, SDL_AudioStreamCallback callback, void * userdata)} */
    public static long nSDL_OpenAudioDeviceStream(int devid, long spec, long callback, long userdata) {
        long __functionAddress = Functions.OpenAudioDeviceStream;
        return invokePPPP(devid, spec, callback, userdata, __functionAddress);
    }

    /** {@code SDL_AudioStream * SDL_OpenAudioDeviceStream(SDL_AudioDeviceID devid, SDL_AudioSpec const * spec, SDL_AudioStreamCallback callback, void * userdata)} */
    @NativeType("SDL_AudioStream *")
    public static long SDL_OpenAudioDeviceStream(@NativeType("SDL_AudioDeviceID") int devid, @NativeType("SDL_AudioSpec const *") @Nullable SDL_AudioSpec spec, @NativeType("SDL_AudioStreamCallback") @Nullable SDL_AudioStreamCallbackI callback, @NativeType("void *") long userdata) {
        return nSDL_OpenAudioDeviceStream(devid, memAddressSafe(spec), memAddressSafe(callback), userdata);
    }

    // --- [ SDL_SetAudioPostmixCallback ] ---

    /** {@code bool SDL_SetAudioPostmixCallback(SDL_AudioDeviceID devid, SDL_AudioPostmixCallback callback, void * userdata)} */
    public static boolean nSDL_SetAudioPostmixCallback(int devid, long callback, long userdata) {
        long __functionAddress = Functions.SetAudioPostmixCallback;
        return invokePPZ(devid, callback, userdata, __functionAddress);
    }

    /** {@code bool SDL_SetAudioPostmixCallback(SDL_AudioDeviceID devid, SDL_AudioPostmixCallback callback, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_SetAudioPostmixCallback(@NativeType("SDL_AudioDeviceID") int devid, @NativeType("SDL_AudioPostmixCallback") @Nullable SDL_AudioPostmixCallbackI callback, @NativeType("void *") long userdata) {
        return nSDL_SetAudioPostmixCallback(devid, memAddressSafe(callback), userdata);
    }

    // --- [ SDL_LoadWAV_IO ] ---

    /** {@code bool SDL_LoadWAV_IO(SDL_IOStream * src, bool closeio, SDL_AudioSpec * spec, Uint8 ** audio_buf, Uint32 * audio_len)} */
    public static boolean nSDL_LoadWAV_IO(long src, boolean closeio, long spec, long audio_buf, long audio_len) {
        long __functionAddress = Functions.LoadWAV_IO;
        if (CHECKS) {
            check(src);
        }
        return invokePPPPZ(src, closeio, spec, audio_buf, audio_len, __functionAddress);
    }

    /** {@code bool SDL_LoadWAV_IO(SDL_IOStream * src, bool closeio, SDL_AudioSpec * spec, Uint8 ** audio_buf, Uint32 * audio_len)} */
    @NativeType("bool")
    public static boolean SDL_LoadWAV_IO(@NativeType("SDL_IOStream *") long src, @NativeType("bool") boolean closeio, @NativeType("SDL_AudioSpec *") SDL_AudioSpec spec, @NativeType("Uint8 **") PointerBuffer audio_buf, @NativeType("Uint32 *") IntBuffer audio_len) {
        if (CHECKS) {
            check(audio_buf, 1);
            check(audio_len, 1);
        }
        return nSDL_LoadWAV_IO(src, closeio, spec.address(), memAddress(audio_buf), memAddress(audio_len));
    }

    // --- [ SDL_LoadWAV ] ---

    /** {@code bool SDL_LoadWAV(char const * path, SDL_AudioSpec * spec, Uint8 ** audio_buf, Uint32 * audio_len)} */
    public static boolean nSDL_LoadWAV(long path, long spec, long audio_buf, long audio_len) {
        long __functionAddress = Functions.LoadWAV;
        return invokePPPPZ(path, spec, audio_buf, audio_len, __functionAddress);
    }

    /** {@code bool SDL_LoadWAV(char const * path, SDL_AudioSpec * spec, Uint8 ** audio_buf, Uint32 * audio_len)} */
    @NativeType("bool")
    public static boolean SDL_LoadWAV(@NativeType("char const *") ByteBuffer path, @NativeType("SDL_AudioSpec *") SDL_AudioSpec spec, @NativeType("Uint8 **") PointerBuffer audio_buf, @NativeType("Uint32 *") IntBuffer audio_len) {
        if (CHECKS) {
            checkNT1(path);
            check(audio_buf, 1);
            check(audio_len, 1);
        }
        return nSDL_LoadWAV(memAddress(path), spec.address(), memAddress(audio_buf), memAddress(audio_len));
    }

    /** {@code bool SDL_LoadWAV(char const * path, SDL_AudioSpec * spec, Uint8 ** audio_buf, Uint32 * audio_len)} */
    @NativeType("bool")
    public static boolean SDL_LoadWAV(@NativeType("char const *") CharSequence path, @NativeType("SDL_AudioSpec *") SDL_AudioSpec spec, @NativeType("Uint8 **") PointerBuffer audio_buf, @NativeType("Uint32 *") IntBuffer audio_len) {
        if (CHECKS) {
            check(audio_buf, 1);
            check(audio_len, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_LoadWAV(pathEncoded, spec.address(), memAddress(audio_buf), memAddress(audio_len));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_MixAudio ] ---

    /** {@code bool SDL_MixAudio(Uint8 * dst, Uint8 const * src, SDL_AudioFormat format, Uint32 len, float volume)} */
    public static boolean nSDL_MixAudio(long dst, long src, int format, int len, float volume) {
        long __functionAddress = Functions.MixAudio;
        return invokePPZ(dst, src, format, len, volume, __functionAddress);
    }

    /** {@code bool SDL_MixAudio(Uint8 * dst, Uint8 const * src, SDL_AudioFormat format, Uint32 len, float volume)} */
    @NativeType("bool")
    public static boolean SDL_MixAudio(@NativeType("Uint8 *") ByteBuffer dst, @NativeType("Uint8 const *") ByteBuffer src, @NativeType("SDL_AudioFormat") int format, float volume) {
        if (CHECKS) {
            check(dst, src.remaining());
        }
        return nSDL_MixAudio(memAddress(dst), memAddress(src), format, src.remaining(), volume);
    }

    // --- [ SDL_ConvertAudioSamples ] ---

    /** {@code bool SDL_ConvertAudioSamples(SDL_AudioSpec const * src_spec, Uint8 const * src_data, int src_len, SDL_AudioSpec const * dst_spec, Uint8 ** dst_data, int * dst_len)} */
    public static boolean nSDL_ConvertAudioSamples(long src_spec, long src_data, int src_len, long dst_spec, long dst_data, long dst_len) {
        long __functionAddress = Functions.ConvertAudioSamples;
        return invokePPPPPZ(src_spec, src_data, src_len, dst_spec, dst_data, dst_len, __functionAddress);
    }

    /** {@code bool SDL_ConvertAudioSamples(SDL_AudioSpec const * src_spec, Uint8 const * src_data, int src_len, SDL_AudioSpec const * dst_spec, Uint8 ** dst_data, int * dst_len)} */
    @NativeType("bool")
    public static boolean SDL_ConvertAudioSamples(@NativeType("SDL_AudioSpec const *") SDL_AudioSpec src_spec, @NativeType("Uint8 const *") ByteBuffer src_data, @NativeType("SDL_AudioSpec const *") SDL_AudioSpec dst_spec, @NativeType("Uint8 **") PointerBuffer dst_data, @NativeType("int *") IntBuffer dst_len) {
        if (CHECKS) {
            check(dst_data, 1);
            check(dst_len, 1);
        }
        return nSDL_ConvertAudioSamples(src_spec.address(), memAddress(src_data), src_data.remaining(), dst_spec.address(), memAddress(dst_data), memAddress(dst_len));
    }

    // --- [ SDL_GetAudioFormatName ] ---

    /** {@code char const * SDL_GetAudioFormatName(SDL_AudioFormat format)} */
    public static long nSDL_GetAudioFormatName(int format) {
        long __functionAddress = Functions.GetAudioFormatName;
        return invokeP(format, __functionAddress);
    }

    /** {@code char const * SDL_GetAudioFormatName(SDL_AudioFormat format)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetAudioFormatName(@NativeType("SDL_AudioFormat") int format) {
        long __result = nSDL_GetAudioFormatName(format);
        return memASCIISafe(__result);
    }

    // --- [ SDL_GetSilenceValueForFormat ] ---

    /** {@code int SDL_GetSilenceValueForFormat(SDL_AudioFormat format)} */
    public static int SDL_GetSilenceValueForFormat(@NativeType("SDL_AudioFormat") int format) {
        long __functionAddress = Functions.GetSilenceValueForFormat;
        return invokeI(format, __functionAddress);
    }

}