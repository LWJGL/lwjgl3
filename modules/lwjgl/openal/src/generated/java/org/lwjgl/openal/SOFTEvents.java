/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/SOFT_events.txt">SOFT_events</a> extension.
 * 
 * <p>This extension provides a method for applications to receive notifications about audio events via an asynchronous callback. This can help alleviate the
 * need for applications to continually poll the AL to check if an event happened, and instead allow them to respond when events happen. Such events can
 * include a source changing state or a device becoming disconnected.</p>
 */
public class SOFTEvents {

    /** Accepted as the {@code pname} parameter of {@link #alGetPointerSOFT GetPointerSOFT} and {@link #alGetPointervSOFT GetPointervSOFT}. */
    public static final int
        AL_EVENT_CALLBACK_FUNCTION_SOFT   = 0x19A2,
        AL_EVENT_CALLBACK_USER_PARAM_SOFT = 0x19A3;

    /**
     * Accepted as an element in the {@code types} parameter of {@link #alEventControlSOFT EventControlSOFT}, and provided as the {@code eventType} parameter of
     * {@code ALEVENTPROCSOFT} callback functions.
     */
    public static final int
        AL_EVENT_TYPE_BUFFER_COMPLETED_SOFT     = 0x19A4,
        AL_EVENT_TYPE_SOURCE_STATE_CHANGED_SOFT = 0x19A5,
        AL_EVENT_TYPE_DISCONNECTED_SOFT         = 0x19A6;

    protected SOFTEvents() {
        throw new UnsupportedOperationException();
    }

    // --- [ alEventControlSOFT ] ---

    public static void nalEventControlSOFT(int count, long types, boolean enable) {
        long __functionAddress = AL.getICD().alEventControlSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(count, types, enable, __functionAddress);
    }

    public static void alEventControlSOFT(@NativeType("ALenum const *") IntBuffer types, @NativeType("ALboolean") boolean enable) {
        nalEventControlSOFT(types.remaining(), memAddress(types), enable);
    }

    // --- [ alEventCallbackSOFT ] ---

    public static void nalEventCallbackSOFT(long callback, long userParam) {
        long __functionAddress = AL.getICD().alEventCallbackSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPV(callback, userParam, __functionAddress);
    }

    public static void alEventCallbackSOFT(@NativeType("ALEVENTPROCSOFT") SOFTEventProcI callback, @Nullable @NativeType("ALvoid *") ByteBuffer userParam) {
        nalEventCallbackSOFT(callback.address(), memAddressSafe(userParam));
    }

    // --- [ alGetPointerSOFT ] ---

    @NativeType("ALvoid *")
    public static long alGetPointerSOFT(@NativeType("ALenum") int pname) {
        long __functionAddress = AL.getICD().alGetPointerSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(pname, __functionAddress);
    }

    // --- [ alGetPointervSOFT ] ---

    public static void nalGetPointervSOFT(int pname, long values) {
        long __functionAddress = AL.getICD().alGetPointervSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(pname, values, __functionAddress);
    }

    public static void alGetPointervSOFT(@NativeType("ALenum") int pname, @NativeType("ALvoid **") PointerBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetPointervSOFT(pname, memAddress(values));
    }

    /** Array version of: {@link #alEventControlSOFT EventControlSOFT} */
    public static void alEventControlSOFT(@NativeType("ALenum const *") int[] types, @NativeType("ALboolean") boolean enable) {
        long __functionAddress = AL.getICD().alEventControlSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(types.length, types, enable, __functionAddress);
    }

}