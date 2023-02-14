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

import static org.lwjgl.system.Checks.*;

/** Defines the capabilities of the OpenAL Context API. */
public final class ALCCapabilities {

    // ALC10
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
        alcGetIntegerv;

    // ALC11
    public final long
        alcCaptureOpenDevice,
        alcCaptureCloseDevice,
        alcCaptureStart,
        alcCaptureStop,
        alcCaptureSamples;

    // EXT_thread_local_context
    public final long
        alcSetThreadContext,
        alcGetThreadContext;

    // SOFT_device_clock
    public final long
        alcGetInteger64vSOFT;

    // SOFT_HRTF
    public final long
        alcGetStringiSOFT,
        alcResetDeviceSOFT;

    // SOFT_loopback
    public final long
        alcLoopbackOpenDeviceSOFT,
        alcIsRenderFormatSupportedSOFT,
        alcRenderSamplesSOFT;

    // SOFT_pause_device
    public final long
        alcDevicePauseSOFT,
        alcDeviceResumeSOFT;

    // SOFT_reopen_device
    public final long
        alcReopenDeviceSOFT;

    /** When true, {@link ALC10} is supported. */
    public final boolean OpenALC10;
    /** When true, {@link ALC11} is supported. */
    public final boolean OpenALC11;
    /** When true, {@link SOFTLoopbackBformat} is supported. */
    public final boolean OpenALC_SOFT_loopback_bformat;
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
    /** When true, {@link SOFTOutputMode} is supported. */
    public final boolean ALC_SOFT_output_mode;
    /** When true, {@link SOFTPauseDevice} is supported. */
    public final boolean ALC_SOFT_pause_device;
    /** When true, {@link SOFTReopenDevice} is supported. */
    public final boolean ALC_SOFT_reopen_device;

    /** Device handle. */
    final long device;

    /** Off-heap array of the above function addresses. */
    final PointerBuffer addresses;

    ALCCapabilities(FunctionProviderLocal provider, long device, Set<String> ext, IntFunction<PointerBuffer> bufferFactory) {
        this.device = device;

        PointerBuffer caps = bufferFactory.apply(31);

        OpenALC10 = check_ALC10(provider, device, caps, ext);
        OpenALC11 = check_ALC11(provider, device, caps, ext);
        OpenALC_SOFT_loopback_bformat = ext.contains("OpenALC_SOFT_loopback_bformat");
        ALC_ENUMERATE_ALL_EXT = ext.contains("ALC_ENUMERATE_ALL_EXT");
        ALC_ENUMERATION_EXT = ext.contains("ALC_ENUMERATION_EXT");
        ALC_EXT_CAPTURE = check_EXT_CAPTURE(provider, device, caps, ext);
        ALC_EXT_DEDICATED = ext.contains("ALC_EXT_DEDICATED");
        ALC_EXT_DEFAULT_FILTER_ORDER = ext.contains("ALC_EXT_DEFAULT_FILTER_ORDER");
        ALC_EXT_disconnect = ext.contains("ALC_EXT_disconnect");
        ALC_EXT_EFX = ext.contains("ALC_EXT_EFX");
        ALC_EXT_thread_local_context = check_EXT_thread_local_context(provider, device, caps, ext);
        ALC_LOKI_audio_channel = ext.contains("ALC_LOKI_audio_channel");
        ALC_SOFT_device_clock = check_SOFT_device_clock(provider, device, caps, ext);
        ALC_SOFT_HRTF = check_SOFT_HRTF(provider, device, caps, ext);
        ALC_SOFT_loopback = check_SOFT_loopback(provider, device, caps, ext);
        ALC_SOFT_output_limiter = ext.contains("ALC_SOFT_output_limiter");
        ALC_SOFT_output_mode = ext.contains("ALC_SOFT_output_mode");
        ALC_SOFT_pause_device = check_SOFT_pause_device(provider, device, caps, ext);
        ALC_SOFT_reopen_device = check_SOFT_reopen_device(provider, device, caps, ext);

        alcOpenDevice = caps.get(0);
        alcCloseDevice = caps.get(1);
        alcCreateContext = caps.get(2);
        alcMakeContextCurrent = caps.get(3);
        alcProcessContext = caps.get(4);
        alcSuspendContext = caps.get(5);
        alcDestroyContext = caps.get(6);
        alcGetCurrentContext = caps.get(7);
        alcGetContextsDevice = caps.get(8);
        alcIsExtensionPresent = caps.get(9);
        alcGetProcAddress = caps.get(10);
        alcGetEnumValue = caps.get(11);
        alcGetError = caps.get(12);
        alcGetString = caps.get(13);
        alcGetIntegerv = caps.get(14);
        alcCaptureOpenDevice = caps.get(15);
        alcCaptureCloseDevice = caps.get(16);
        alcCaptureStart = caps.get(17);
        alcCaptureStop = caps.get(18);
        alcCaptureSamples = caps.get(19);
        alcSetThreadContext = caps.get(20);
        alcGetThreadContext = caps.get(21);
        alcGetInteger64vSOFT = caps.get(22);
        alcGetStringiSOFT = caps.get(23);
        alcResetDeviceSOFT = caps.get(24);
        alcLoopbackOpenDeviceSOFT = caps.get(25);
        alcIsRenderFormatSupportedSOFT = caps.get(26);
        alcRenderSamplesSOFT = caps.get(27);
        alcDevicePauseSOFT = caps.get(28);
        alcDeviceResumeSOFT = caps.get(29);
        alcReopenDeviceSOFT = caps.get(30);

        addresses = ThreadLocalUtil.setupAddressBuffer(caps);
    }

    /** Returns the buffer of OpenAL function pointers. */
    public PointerBuffer getAddressBuffer() {
        return addresses;
    }

    private static boolean check_ALC10(FunctionProviderLocal provider, long device, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("OpenALC10")) {
            return false;
        }

        return checkFunctions(provider, device, caps, new int[] {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14
        },
            "alcOpenDevice", "alcCloseDevice", "alcCreateContext", "alcMakeContextCurrent", "alcProcessContext", "alcSuspendContext", "alcDestroyContext", 
            "alcGetCurrentContext", "alcGetContextsDevice", "alcIsExtensionPresent", "alcGetProcAddress", "alcGetEnumValue", "alcGetError", "alcGetString", 
            "alcGetIntegerv"
        ) || reportMissing("ALC", "OpenALC10");
    }

    private static boolean check_ALC11(FunctionProviderLocal provider, long device, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("OpenALC11")) {
            return false;
        }

        return checkFunctions(provider, device, caps, new int[] {
            15, 16, 17, 18, 19
        },
            "alcCaptureOpenDevice", "alcCaptureCloseDevice", "alcCaptureStart", "alcCaptureStop", "alcCaptureSamples"
        ) || reportMissing("ALC", "OpenALC11");
    }

    private static boolean check_EXT_CAPTURE(FunctionProviderLocal provider, long device, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("ALC_EXT_CAPTURE")) {
            return false;
        }

        return checkFunctions(provider, device, caps, new int[] {
            15, 16, 17, 18, 19
        },
            "alcCaptureOpenDevice", "alcCaptureCloseDevice", "alcCaptureStart", "alcCaptureStop", "alcCaptureSamples"
        ) || reportMissing("ALC", "ALC_EXT_CAPTURE");
    }

    private static boolean check_EXT_thread_local_context(FunctionProviderLocal provider, long device, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("ALC_EXT_thread_local_context")) {
            return false;
        }

        return checkFunctions(provider, device, caps, new int[] {
            20, 21
        },
            "alcSetThreadContext", "alcGetThreadContext"
        ) || reportMissing("ALC", "ALC_EXT_thread_local_context");
    }

    private static boolean check_SOFT_device_clock(FunctionProviderLocal provider, long device, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("ALC_SOFT_device_clock")) {
            return false;
        }

        return checkFunctions(provider, device, caps, new int[] {
            22
        },
            "alcGetInteger64vSOFT"
        ) || reportMissing("ALC", "ALC_SOFT_device_clock");
    }

    private static boolean check_SOFT_HRTF(FunctionProviderLocal provider, long device, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("ALC_SOFT_HRTF")) {
            return false;
        }

        return checkFunctions(provider, device, caps, new int[] {
            23, 24
        },
            "alcGetStringiSOFT", "alcResetDeviceSOFT"
        ) || reportMissing("ALC", "ALC_SOFT_HRTF");
    }

    private static boolean check_SOFT_loopback(FunctionProviderLocal provider, long device, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("ALC_SOFT_loopback")) {
            return false;
        }

        return checkFunctions(provider, device, caps, new int[] {
            25, 26, 27
        },
            "alcLoopbackOpenDeviceSOFT", "alcIsRenderFormatSupportedSOFT", "alcRenderSamplesSOFT"
        ) || reportMissing("ALC", "ALC_SOFT_loopback");
    }

    private static boolean check_SOFT_pause_device(FunctionProviderLocal provider, long device, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("ALC_SOFT_pause_device")) {
            return false;
        }

        return checkFunctions(provider, device, caps, new int[] {
            28, 29
        },
            "alcDevicePauseSOFT", "alcDeviceResumeSOFT"
        ) || reportMissing("ALC", "ALC_SOFT_pause_device");
    }

    private static boolean check_SOFT_reopen_device(FunctionProviderLocal provider, long device, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("ALC_SOFT_reopen_device")) {
            return false;
        }

        return checkFunctions(provider, device, caps, new int[] {
            30
        },
            "alcReopenDeviceSOFT"
        ) || reportMissing("ALC", "ALC_SOFT_reopen_device");
    }

}
