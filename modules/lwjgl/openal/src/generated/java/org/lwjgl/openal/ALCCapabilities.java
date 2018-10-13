/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.lwjgl.system.*;
import java.util.Set;

import static org.lwjgl.system.APIUtil.*;

/** Defines the capabilities of the OpenAL Context API. */
public final class ALCCapabilities {

	public final long
		alcOpenDevice,
		alcCloseDevice,
		alcCreateContext,
		alcMakeContextCurrent,
		alcProcessContext,
		alcSuspendContext,
		alcDestroyContext,
		alcGetCurrentContext,
		alcGetContextsDevice,
		alcIsExtensionPresent,
		alcGetProcAddress,
		alcGetEnumValue,
		alcGetError,
		alcGetString,
		alcGetIntegerv,
		alcCaptureOpenDevice,
		alcCaptureCloseDevice,
		alcCaptureStart,
		alcCaptureStop,
		alcCaptureSamples,
		alcSetThreadContext,
		alcGetThreadContext,
		alcGetInteger64vSOFT,
		alcGetStringiSOFT,
		alcResetDeviceSOFT,
		alcLoopbackOpenDeviceSOFT,
		alcIsRenderFormatSupportedSOFT,
		alcRenderSamplesSOFT,
		alcDevicePauseSOFT,
		alcDeviceResumeSOFT;

    /** When true, {@link ALC10} is supported. */
	public final boolean OpenALC10;
    /** When true, {@link ALC11} is supported. */
	public final boolean OpenALC11;
    /** When true, {@link EnumerateAllExt} is supported. */
	public final boolean ALC_ENUMERATE_ALL_EXT;
    /**
     * An OpenAL 1.1 implementation will always support the {@code ALC_ENUMERATION_EXT} extension. This extension provides for enumeration of the available OpenAL devices
     * through {@link ALC10#alcGetString GetString}. An {@link ALC10#alcGetString GetString} query of {@link ALC10#ALC_DEVICE_SPECIFIER DEVICE_SPECIFIER} with a {@code NULL} device passed in will return a list of devices. Each
     * device name will be separated by a single {@code NULL} character and the list will be terminated with two {@code NULL} characters.
     */
	public final boolean ALC_ENUMERATION_EXT;
    /** When true, {@link EXTCapture} is supported. */
	public final boolean ALC_EXT_CAPTURE;
    /** When true, {@link EXTDedicated} is supported. */
	public final boolean ALC_EXT_DEDICATED;
    /** When true, {@link EXTDefaultFilterOrder} is supported. */
	public final boolean ALC_EXT_DEFAULT_FILTER_ORDER;
    /** When true, {@link EXTDisconnect} is supported. */
	public final boolean ALC_EXT_disconnect;
    /** When true, {@link EXTEfx} is supported. */
	public final boolean ALC_EXT_EFX;
    /** When true, {@link EXTThreadLocalContext} is supported. */
	public final boolean ALC_EXT_thread_local_context;
    /** When true, {@link LOKIAudioChannel} is supported. */
	public final boolean ALC_LOKI_audio_channel;
    /** When true, {@link SOFTDeviceClock} is supported. */
	public final boolean ALC_SOFT_device_clock;
    /** When true, {@link SOFTHRTF} is supported. */
	public final boolean ALC_SOFT_HRTF;
    /** When true, {@link SOFTLoopback} is supported. */
	public final boolean ALC_SOFT_loopback;
    /** When true, {@link SOFTOutputLimiter} is supported. */
	public final boolean ALC_SOFT_output_limiter;
    /** When true, {@link SOFTPauseDevice} is supported. */
	public final boolean ALC_SOFT_pause_device;

	ALCCapabilities(FunctionProviderLocal provider, long device, Set<String> ext) {
		alcOpenDevice = provider.getFunctionAddress("alcOpenDevice");
		alcCloseDevice = provider.getFunctionAddress("alcCloseDevice");
		alcCreateContext = provider.getFunctionAddress("alcCreateContext");
		alcMakeContextCurrent = provider.getFunctionAddress("alcMakeContextCurrent");
		alcProcessContext = provider.getFunctionAddress("alcProcessContext");
		alcSuspendContext = provider.getFunctionAddress("alcSuspendContext");
		alcDestroyContext = provider.getFunctionAddress("alcDestroyContext");
		alcGetCurrentContext = provider.getFunctionAddress("alcGetCurrentContext");
		alcGetContextsDevice = provider.getFunctionAddress("alcGetContextsDevice");
		alcIsExtensionPresent = provider.getFunctionAddress("alcIsExtensionPresent");
		alcGetProcAddress = provider.getFunctionAddress("alcGetProcAddress");
		alcGetEnumValue = provider.getFunctionAddress("alcGetEnumValue");
		alcGetError = provider.getFunctionAddress("alcGetError");
		alcGetString = provider.getFunctionAddress("alcGetString");
		alcGetIntegerv = provider.getFunctionAddress("alcGetIntegerv");
		alcCaptureOpenDevice = provider.getFunctionAddress("alcCaptureOpenDevice");
		alcCaptureCloseDevice = provider.getFunctionAddress("alcCaptureCloseDevice");
		alcCaptureStart = provider.getFunctionAddress("alcCaptureStart");
		alcCaptureStop = provider.getFunctionAddress("alcCaptureStop");
		alcCaptureSamples = provider.getFunctionAddress("alcCaptureSamples");
		alcSetThreadContext = provider.getFunctionAddress(device, "alcSetThreadContext");
		alcGetThreadContext = provider.getFunctionAddress(device, "alcGetThreadContext");
		alcGetInteger64vSOFT = provider.getFunctionAddress(device, "alcGetInteger64vSOFT");
		alcGetStringiSOFT = provider.getFunctionAddress(device, "alcGetStringiSOFT");
		alcResetDeviceSOFT = provider.getFunctionAddress(device, "alcResetDeviceSOFT");
		alcLoopbackOpenDeviceSOFT = provider.getFunctionAddress(device, "alcLoopbackOpenDeviceSOFT");
		alcIsRenderFormatSupportedSOFT = provider.getFunctionAddress(device, "alcIsRenderFormatSupportedSOFT");
		alcRenderSamplesSOFT = provider.getFunctionAddress(device, "alcRenderSamplesSOFT");
		alcDevicePauseSOFT = provider.getFunctionAddress(device, "alcDevicePauseSOFT");
		alcDeviceResumeSOFT = provider.getFunctionAddress(device, "alcDeviceResumeSOFT");

		OpenALC10 = ext.contains("OpenALC10") && checkExtension("OpenALC10", ALC10.isAvailable(this));
		OpenALC11 = ext.contains("OpenALC11") && checkExtension("OpenALC11", ALC11.isAvailable(this));
		ALC_ENUMERATE_ALL_EXT = ext.contains("ALC_ENUMERATE_ALL_EXT");
		ALC_ENUMERATION_EXT = ext.contains("ALC_ENUMERATION_EXT");
		ALC_EXT_CAPTURE = ext.contains("ALC_EXT_CAPTURE") && checkExtension("ALC_EXT_CAPTURE", EXTCapture.isAvailable(this));
		ALC_EXT_DEDICATED = ext.contains("ALC_EXT_DEDICATED");
		ALC_EXT_DEFAULT_FILTER_ORDER = ext.contains("ALC_EXT_DEFAULT_FILTER_ORDER");
		ALC_EXT_disconnect = ext.contains("ALC_EXT_disconnect");
		ALC_EXT_EFX = ext.contains("ALC_EXT_EFX");
		ALC_EXT_thread_local_context = ext.contains("ALC_EXT_thread_local_context") && checkExtension("ALC_EXT_thread_local_context", EXTThreadLocalContext.isAvailable(this));
		ALC_LOKI_audio_channel = ext.contains("ALC_LOKI_audio_channel");
		ALC_SOFT_device_clock = ext.contains("ALC_SOFT_device_clock") && checkExtension("ALC_SOFT_device_clock", SOFTDeviceClock.isAvailable(this));
		ALC_SOFT_HRTF = ext.contains("ALC_SOFT_HRTF") && checkExtension("ALC_SOFT_HRTF", SOFTHRTF.isAvailable(this));
		ALC_SOFT_loopback = ext.contains("ALC_SOFT_loopback") && checkExtension("ALC_SOFT_loopback", SOFTLoopback.isAvailable(this));
		ALC_SOFT_output_limiter = ext.contains("ALC_SOFT_output_limiter");
		ALC_SOFT_pause_device = ext.contains("ALC_SOFT_pause_device") && checkExtension("ALC_SOFT_pause_device", SOFTPauseDevice.isAvailable(this));
    }

    private static boolean checkExtension(String extension, boolean supported) {
        if (supported) {
            return true;
        }

        apiLog("[ALC] " + extension + " was reported as available but an entry point is missing.");
        return false;
    }

}