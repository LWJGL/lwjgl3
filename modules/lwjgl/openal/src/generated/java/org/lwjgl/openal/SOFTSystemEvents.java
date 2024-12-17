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

public class SOFTSystemEvents {

    public static final int
        ALC_EVENT_TYPE_DEFAULT_DEVICE_CHANGED_SOFT = 0x19D6,
        ALC_EVENT_TYPE_DEVICE_ADDED_SOFT           = 0x19D7,
        ALC_EVENT_TYPE_DEVICE_REMOVED_SOFT         = 0x19D8;

    public static final int
        ALC_PLAYBACK_DEVICE_SOFT = 0x19D4,
        ALC_CAPTURE_DEVICE_SOFT  = 0x19D5;

    public static final int
        ALC_EVENT_SUPPORTED_SOFT     = 0x19D9,
        ALC_EVENT_NOT_SUPPORTED_SOFT = 0x19DA;

    protected SOFTSystemEvents() {
        throw new UnsupportedOperationException();
    }

    // --- [ alcEventIsSupportedSOFT ] ---

    /** {@code ALCenum alcEventIsSupportedSOFT(ALCenum eventType, ALCenum deviceType)} */
    @NativeType("ALCenum")
    public static int alcEventIsSupportedSOFT(@NativeType("ALCenum") int eventType, @NativeType("ALCenum") int deviceType) {
		long __functionAddress = ALC.getICD().alcEventIsSupportedSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeI(eventType, deviceType, __functionAddress);
    }

    // --- [ alcEventControlSOFT ] ---

    /** {@code ALCboolean alcEventControlSOFT(ALCsizei count, ALCenum const * events, ALCboolean enable)} */
    public static boolean nalcEventControlSOFT(int count, long events, boolean enable) {
		long __functionAddress = ALC.getICD().alcEventControlSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePZ(count, events, enable, __functionAddress);
    }

    /** {@code ALCboolean alcEventControlSOFT(ALCsizei count, ALCenum const * events, ALCboolean enable)} */
    @NativeType("ALCboolean")
    public static boolean alcEventControlSOFT(@NativeType("ALCenum const *") @Nullable IntBuffer events, @NativeType("ALCboolean") boolean enable) {
        return nalcEventControlSOFT(remainingSafe(events), memAddressSafe(events), enable);
    }

    // --- [ alcEventCallbackSOFT ] ---

    /** {@code ALCvoid alcEventCallbackSOFT(ALCEVENTPROCTYPESOFT callback, ALCvoid * userParam)} */
    public static void nalcEventCallbackSOFT(long callback, long userParam) {
		long __functionAddress = ALC.getICD().alcEventCallbackSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPV(callback, userParam, __functionAddress);
    }

    /** {@code ALCvoid alcEventCallbackSOFT(ALCEVENTPROCTYPESOFT callback, ALCvoid * userParam)} */
    @NativeType("ALCvoid")
    public static void alcEventCallbackSOFT(@NativeType("ALCEVENTPROCTYPESOFT") @Nullable SOFTSystemEventProcI callback, @NativeType("ALCvoid *") long userParam) {
        nalcEventCallbackSOFT(memAddressSafe(callback), userParam);
    }

    /** {@code ALCboolean alcEventControlSOFT(ALCsizei count, ALCenum const * events, ALCboolean enable)} */
    @NativeType("ALCboolean")
    public static boolean alcEventControlSOFT(@NativeType("ALCenum const *") int @Nullable [] events, @NativeType("ALCboolean") boolean enable) {
		long __functionAddress = ALC.getICD().alcEventControlSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePZ(lengthSafe(events), events, enable, __functionAddress);
    }

}