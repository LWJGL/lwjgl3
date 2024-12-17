/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SOFTEvents {

    public static final int
        AL_EVENT_CALLBACK_FUNCTION_SOFT   = 0x19A2,
        AL_EVENT_CALLBACK_USER_PARAM_SOFT = 0x19A3;

    public static final int
        AL_EVENT_TYPE_BUFFER_COMPLETED_SOFT     = 0x19A4,
        AL_EVENT_TYPE_SOURCE_STATE_CHANGED_SOFT = 0x19A5,
        AL_EVENT_TYPE_DISCONNECTED_SOFT         = 0x19A6;

    protected SOFTEvents() {
        throw new UnsupportedOperationException();
    }

    // --- [ alEventControlSOFT ] ---

    /** {@code void alEventControlSOFT(ALsizei count, ALenum const * types, ALboolean enable)} */
    public static void nalEventControlSOFT(int count, long types, boolean enable) {
        long __functionAddress = AL.getICD().alEventControlSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(count, types, enable, __functionAddress);
    }

    /** {@code void alEventControlSOFT(ALsizei count, ALenum const * types, ALboolean enable)} */
    public static void alEventControlSOFT(@NativeType("ALenum const *") IntBuffer types, @NativeType("ALboolean") boolean enable) {
        nalEventControlSOFT(types.remaining(), memAddress(types), enable);
    }

    // --- [ alEventControlDirectSOFT ] ---

    /** {@code void alEventControlDirectSOFT(ALCcontext * context, ALsizei count, ALenum const * types, ALboolean enable)} */
    public static void nalEventControlDirectSOFT(long context, int count, long types, boolean enable) {
        long __functionAddress = AL.getICD().alEventControlDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, count, types, enable, __functionAddress);
    }

    /** {@code void alEventControlDirectSOFT(ALCcontext * context, ALsizei count, ALenum const * types, ALboolean enable)} */
    public static void alEventControlDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALenum const *") IntBuffer types, @NativeType("ALboolean") boolean enable) {
        nalEventControlDirectSOFT(context, types.remaining(), memAddress(types), enable);
    }

    // --- [ alEventCallbackSOFT ] ---

    /** {@code void alEventCallbackSOFT(ALEVENTPROCSOFT callback, ALvoid * userParam)} */
    public static void nalEventCallbackSOFT(long callback, long userParam) {
        long __functionAddress = AL.getICD().alEventCallbackSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPV(callback, userParam, __functionAddress);
    }

    /** {@code void alEventCallbackSOFT(ALEVENTPROCSOFT callback, ALvoid * userParam)} */
    public static void alEventCallbackSOFT(@NativeType("ALEVENTPROCSOFT") @Nullable SOFTEventProcI callback, @NativeType("ALvoid *") long userParam) {
        nalEventCallbackSOFT(memAddressSafe(callback), userParam);
    }

    // --- [ alEventCallbackDirectSOFT ] ---

    /** {@code void alEventCallbackDirectSOFT(ALCcontext * context, ALEVENTPROCSOFT callback, ALvoid * userParam)} */
    public static void nalEventCallbackDirectSOFT(long context, long callback, long userParam) {
        long __functionAddress = AL.getICD().alEventCallbackDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPPV(context, callback, userParam, __functionAddress);
    }

    /** {@code void alEventCallbackDirectSOFT(ALCcontext * context, ALEVENTPROCSOFT callback, ALvoid * userParam)} */
    public static void alEventCallbackDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALEVENTPROCSOFT") @Nullable SOFTEventProcI callback, @NativeType("ALvoid *") long userParam) {
        nalEventCallbackDirectSOFT(context, memAddressSafe(callback), userParam);
    }

    // --- [ alGetPointerSOFT ] ---

    /** {@code ALvoid * alGetPointerSOFT(ALenum pname)} */
    @NativeType("ALvoid *")
    public static long alGetPointerSOFT(@NativeType("ALenum") int pname) {
        long __functionAddress = AL.getICD().alGetPointerSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(pname, __functionAddress);
    }

    // --- [ alGetPointerDirectSOFT ] ---

    /** {@code ALvoid * alGetPointerDirectSOFT(ALCcontext * context, ALenum pname)} */
    @NativeType("ALvoid *")
    public static long alGetPointerDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int pname) {
        long __functionAddress = AL.getICD().alGetPointerDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return invokePP(context, pname, __functionAddress);
    }

    // --- [ alGetPointervSOFT ] ---

    /** {@code void alGetPointervSOFT(ALenum pname, ALvoid ** values)} */
    public static void nalGetPointervSOFT(int pname, long values) {
        long __functionAddress = AL.getICD().alGetPointervSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(pname, values, __functionAddress);
    }

    /** {@code void alGetPointervSOFT(ALenum pname, ALvoid ** values)} */
    public static void alGetPointervSOFT(@NativeType("ALenum") int pname, @NativeType("ALvoid **") PointerBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetPointervSOFT(pname, memAddress(values));
    }

    // --- [ alGetPointervDirectSOFT ] ---

    /** {@code void alGetPointervDirectSOFT(ALCcontext * context, ALenum pname, ALvoid ** values)} */
    public static void nalGetPointervDirectSOFT(long context, int pname, long values) {
        long __functionAddress = AL.getICD().alGetPointervDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, pname, values, __functionAddress);
    }

    /** {@code void alGetPointervDirectSOFT(ALCcontext * context, ALenum pname, ALvoid ** values)} */
    public static void alGetPointervDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int pname, @NativeType("ALvoid **") PointerBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetPointervDirectSOFT(context, pname, memAddress(values));
    }

    /** {@code void alEventControlSOFT(ALsizei count, ALenum const * types, ALboolean enable)} */
    public static void alEventControlSOFT(@NativeType("ALenum const *") int[] types, @NativeType("ALboolean") boolean enable) {
        long __functionAddress = AL.getICD().alEventControlSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(types.length, types, enable, __functionAddress);
    }

    /** {@code void alEventControlDirectSOFT(ALCcontext * context, ALsizei count, ALenum const * types, ALboolean enable)} */
    public static void alEventControlDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALenum const *") int[] types, @NativeType("ALboolean") boolean enable) {
        long __functionAddress = AL.getICD().alEventControlDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, types.length, types, enable, __functionAddress);
    }

}