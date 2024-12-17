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

    // EXT_direct_context
    public final long
        alcGetProcAddress2;

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

    // SOFT_system_events
    public final long
        alcEventIsSupportedSOFT,
        alcEventControlSOFT,
        alcEventCallbackSOFT;

    /** When true, {@code ALC10} is supported. */
    public final boolean OpenALC10;
    /** When true, {@code ALC11} is supported. */
    public final boolean OpenALC11;
    /** When true, {@code ALC_SOFT_loopback_bformat} is supported. */
    public final boolean OpenALC_SOFT_loopback_bformat;
    /** When true, {@code ENUMERATE_ALL_EXT} is supported. */
    public final boolean ALC_ENUMERATE_ALL_EXT;
    /** When true, {@code ENUMERATION_EXT} is supported. */
    public final boolean ALC_ENUMERATION_EXT;
    /** When true, {@code EXT_CAPTURE} is supported. */
    public final boolean ALC_EXT_CAPTURE;
    /** When true, {@code EXT_debug} is supported. */
    public final boolean ALC_EXT_debug;
    /** When true, {@code EXT_DEDICATED} is supported. */
    public final boolean ALC_EXT_DEDICATED;
    /** When true, {@code EXT_DEFAULT_FILTER_ORDER} is supported. */
    public final boolean ALC_EXT_DEFAULT_FILTER_ORDER;
    /** When true, {@code EXT_direct_context} is supported. */
    public final boolean ALC_EXT_direct_context;
    /** When true, {@code EXT_disconnect} is supported. */
    public final boolean ALC_EXT_disconnect;
    /** When true, {@code EXT_EFX} is supported. */
    public final boolean ALC_EXT_EFX;
    /** When true, {@code EXT_thread_local_context} is supported. */
    public final boolean ALC_EXT_thread_local_context;
    /** When true, {@code LOKI_audio_channel} is supported. */
    public final boolean ALC_LOKI_audio_channel;
    /** When true, {@code SOFT_device_clock} is supported. */
    public final boolean ALC_SOFT_device_clock;
    /** When true, {@code SOFT_HRTF} is supported. */
    public final boolean ALC_SOFT_HRTF;
    /** When true, {@code SOFT_loopback} is supported. */
    public final boolean ALC_SOFT_loopback;
    /** When true, {@code SOFT_output_limiter} is supported. */
    public final boolean ALC_SOFT_output_limiter;
    /** When true, {@code SOFT_output_mode} is supported. */
    public final boolean ALC_SOFT_output_mode;
    /** When true, {@code SOFT_pause_device} is supported. */
    public final boolean ALC_SOFT_pause_device;
    /** When true, {@code SOFT_reopen_device} is supported. */
    public final boolean ALC_SOFT_reopen_device;
    /** When true, {@code SOFT_system_events} is supported. */
    public final boolean ALC_SOFT_system_events;

    /** Device handle. */
    final long device;

    /** Off-heap array of the above function addresses. */
    final PointerBuffer addresses;

    ALCCapabilities(FunctionProviderLocal provider, long device, Set<String> ext, IntFunction<PointerBuffer> bufferFactory) {
        this.device = device;

        PointerBuffer caps = bufferFactory.apply(35);

        OpenALC10 = check_ALC10(provider, device, caps, ext);
        OpenALC11 = check_ALC11(provider, device, caps, ext);
        OpenALC_SOFT_loopback_bformat = ext.contains("OpenALC_SOFT_loopback_bformat");
        ALC_ENUMERATE_ALL_EXT = ext.contains("ALC_ENUMERATE_ALL_EXT");
        ALC_ENUMERATION_EXT = ext.contains("ALC_ENUMERATION_EXT");
        ALC_EXT_CAPTURE = check_EXT_CAPTURE(provider, device, caps, ext);
        ALC_EXT_debug = ext.contains("ALC_EXT_debug");
        ALC_EXT_DEDICATED = ext.contains("ALC_EXT_DEDICATED");
        ALC_EXT_DEFAULT_FILTER_ORDER = ext.contains("ALC_EXT_DEFAULT_FILTER_ORDER");
        ALC_EXT_direct_context = check_EXT_direct_context(provider, device, caps, ext);
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
        ALC_SOFT_system_events = check_SOFT_system_events(provider, device, caps, ext);

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
        alcGetProcAddress2 = caps.get(20);
        alcSetThreadContext = caps.get(21);
        alcGetThreadContext = caps.get(22);
        alcGetInteger64vSOFT = caps.get(23);
        alcGetStringiSOFT = caps.get(24);
        alcResetDeviceSOFT = caps.get(25);
        alcLoopbackOpenDeviceSOFT = caps.get(26);
        alcIsRenderFormatSupportedSOFT = caps.get(27);
        alcRenderSamplesSOFT = caps.get(28);
        alcDevicePauseSOFT = caps.get(29);
        alcDeviceResumeSOFT = caps.get(30);
        alcReopenDeviceSOFT = caps.get(31);
        alcEventIsSupportedSOFT = caps.get(32);
        alcEventControlSOFT = caps.get(33);
        alcEventCallbackSOFT = caps.get(34);

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

    private static boolean check_EXT_direct_context(FunctionProviderLocal provider, long device, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("ALC_EXT_direct_context")) {
            return false;
        }

        return checkFunctions(provider, device, caps, new int[] {
            20
        },
            "alcGetProcAddress2"
        ) || reportMissing("ALC", "ALC_EXT_direct_context");
    }

    private static boolean check_EXT_thread_local_context(FunctionProviderLocal provider, long device, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("ALC_EXT_thread_local_context")) {
            return false;
        }

        return checkFunctions(provider, device, caps, new int[] {
            21, 22
        },
            "alcSetThreadContext", "alcGetThreadContext"
        ) || reportMissing("ALC", "ALC_EXT_thread_local_context");
    }

    private static boolean check_SOFT_device_clock(FunctionProviderLocal provider, long device, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("ALC_SOFT_device_clock")) {
            return false;
        }

        return checkFunctions(provider, device, caps, new int[] {
            23
        },
            "alcGetInteger64vSOFT"
        ) || reportMissing("ALC", "ALC_SOFT_device_clock");
    }

    private static boolean check_SOFT_HRTF(FunctionProviderLocal provider, long device, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("ALC_SOFT_HRTF")) {
            return false;
        }

        return checkFunctions(provider, device, caps, new int[] {
            24, 25
        },
            "alcGetStringiSOFT", "alcResetDeviceSOFT"
        ) || reportMissing("ALC", "ALC_SOFT_HRTF");
    }

    private static boolean check_SOFT_loopback(FunctionProviderLocal provider, long device, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("ALC_SOFT_loopback")) {
            return false;
        }

        return checkFunctions(provider, device, caps, new int[] {
            26, 27, 28
        },
            "alcLoopbackOpenDeviceSOFT", "alcIsRenderFormatSupportedSOFT", "alcRenderSamplesSOFT"
        ) || reportMissing("ALC", "ALC_SOFT_loopback");
    }

    private static boolean check_SOFT_pause_device(FunctionProviderLocal provider, long device, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("ALC_SOFT_pause_device")) {
            return false;
        }

        return checkFunctions(provider, device, caps, new int[] {
            29, 30
        },
            "alcDevicePauseSOFT", "alcDeviceResumeSOFT"
        ) || reportMissing("ALC", "ALC_SOFT_pause_device");
    }

    private static boolean check_SOFT_reopen_device(FunctionProviderLocal provider, long device, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("ALC_SOFT_reopen_device")) {
            return false;
        }

        return checkFunctions(provider, device, caps, new int[] {
            31
        },
            "alcReopenDeviceSOFT"
        ) || reportMissing("ALC", "ALC_SOFT_reopen_device");
    }

    private static boolean check_SOFT_system_events(FunctionProviderLocal provider, long device, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("ALC_SOFT_system_events")) {
            return false;
        }

        return checkFunctions(provider, device, caps, new int[] {
            32, 33, 34
        },
            "alcEventIsSupportedSOFT", "alcEventControlSOFT", "alcEventCallbackSOFT"
        ) || reportMissing("ALC", "ALC_SOFT_system_events");
    }

}
