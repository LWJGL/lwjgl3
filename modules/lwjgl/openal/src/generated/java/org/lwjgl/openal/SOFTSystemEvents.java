/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/SOFT_system_events.txt">SOFT_system_events</a> extension.
 * 
 * <p>This extension allows applications to be notified of system events related to audio devices. In particular, when a new device becomes available, an
 * existing device becomes unavailable, and when the default device changes. Standard OpenAL has no mechanism to detect these events aside from maybe
 * querying the device names and comparing to a previous query, but this requires the application to actively query and compare two lists, and OpenAL
 * makes no guarantee that the device list will change at run-time, and the same goes for the default device name. This extension allows an application to
 * register a callback to be automatically alerted to such changes, providing the appropriate guarantees.</p>
 */
public class SOFTSystemEvents {

    /**
     * Accepted as the {@code eventType} parameter of {@link #alcEventIsSupportedSOFT EventIsSupportedSOFT}, as an element of the {@code events} parameter of {@link #alcEventControlSOFT EventControlSOFT}, and
     * provided as the {@code eventType} parameter of {@code ALCEVENTPROCTYPESOFT} callback functions.
     */
    public static final int
        ALC_EVENT_TYPE_DEFAULT_DEVICE_CHANGED_SOFT = 0x19D6,
        ALC_EVENT_TYPE_DEVICE_ADDED_SOFT           = 0x19D7,
        ALC_EVENT_TYPE_DEVICE_REMOVED_SOFT         = 0x19D8;

    /**
     * Accepted as the {@code deviceType} parameter of {@link #alcEventIsSupportedSOFT EventIsSupportedSOFT}, and provided as the {@code deviceType} parameter of
     * {@code ALCEVENTPROCTYPESOFT} callback functions.
     */
    public static final int
        ALC_PLAYBACK_DEVICE_SOFT = 0x19D4,
        ALC_CAPTURE_DEVICE_SOFT  = 0x19D5;

    /** Returned from {@link #alcEventIsSupportedSOFT EventIsSupportedSOFT}. */
    public static final int
        ALC_EVENT_SUPPORTED_SOFT     = 0x19D9,
        ALC_EVENT_NOT_SUPPORTED_SOFT = 0x19DA;

    protected SOFTSystemEvents() {
        throw new UnsupportedOperationException();
    }

    // --- [ alcEventIsSupportedSOFT ] ---

    @NativeType("ALCenum")
    public static int alcEventIsSupportedSOFT(@NativeType("ALCenum") int eventType, @NativeType("ALCenum") int deviceType) {
		long __functionAddress = ALC.getICD().alcEventIsSupportedSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeI(eventType, deviceType, __functionAddress);
    }

    // --- [ alcEventControlSOFT ] ---

    public static boolean nalcEventControlSOFT(int count, long events, boolean enable) {
		long __functionAddress = ALC.getICD().alcEventControlSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePZ(count, events, enable, __functionAddress);
    }

    @NativeType("ALCboolean")
    public static boolean alcEventControlSOFT(@NativeType("ALCenum const *") @Nullable IntBuffer events, @NativeType("ALCboolean") boolean enable) {
        return nalcEventControlSOFT(remainingSafe(events), memAddressSafe(events), enable);
    }

    // --- [ alcEventCallbackSOFT ] ---

    public static void nalcEventCallbackSOFT(long callback, long userParam) {
		long __functionAddress = ALC.getICD().alcEventCallbackSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPV(callback, userParam, __functionAddress);
    }

    @NativeType("ALCvoid")
    public static void alcEventCallbackSOFT(@NativeType("ALCEVENTPROCTYPESOFT") @Nullable SOFTSystemEventProcI callback, @NativeType("ALCvoid *") long userParam) {
        nalcEventCallbackSOFT(memAddressSafe(callback), userParam);
    }

    /** Array version of: {@link #alcEventControlSOFT EventControlSOFT} */
    @NativeType("ALCboolean")
    public static boolean alcEventControlSOFT(@NativeType("ALCenum const *") int @Nullable [] events, @NativeType("ALCboolean") boolean enable) {
		long __functionAddress = ALC.getICD().alcEventControlSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePZ(lengthSafe(events), events, enable, __functionAddress);
    }

}