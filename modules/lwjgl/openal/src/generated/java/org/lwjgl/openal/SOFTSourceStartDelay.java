/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SOFTSourceStartDelay {

    protected SOFTSourceStartDelay() {
        throw new UnsupportedOperationException();
    }

    // --- [ alSourcePlayAtTimeSOFT ] ---

    /** {@code ALvoid alSourcePlayAtTimeSOFT(ALuint source, ALint64SOFT start_time)} */
    @NativeType("ALvoid")
    public static void alSourcePlayAtTimeSOFT(@NativeType("ALuint") int source, @NativeType("ALint64SOFT") long start_time) {
        long __functionAddress = AL.getICD().alSourcePlayAtTimeSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeJV(source, start_time, __functionAddress);
    }

    // --- [ alSourcePlayAtTimeDirectSOFT ] ---

    /** {@code ALvoid alSourcePlayAtTimeDirectSOFT(ALCcontext * context, ALuint source, ALint64SOFT start_time)} */
    @NativeType("ALvoid")
    public static void alSourcePlayAtTimeDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALint64SOFT") long start_time) {
        long __functionAddress = AL.getICD().alSourcePlayAtTimeDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePJV(context, source, start_time, __functionAddress);
    }

    // --- [ alSourcePlayAtTimevSOFT ] ---

    /** {@code ALvoid alSourcePlayAtTimevSOFT(ALsizei n, ALuint const * sources, ALint64SOFT start_time)} */
    public static void nalSourcePlayAtTimevSOFT(int n, long sources, long start_time) {
        long __functionAddress = AL.getICD().alSourcePlayAtTimevSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePJV(n, sources, start_time, __functionAddress);
    }

    /** {@code ALvoid alSourcePlayAtTimevSOFT(ALsizei n, ALuint const * sources, ALint64SOFT start_time)} */
    @NativeType("ALvoid")
    public static void alSourcePlayAtTimevSOFT(@NativeType("ALuint const *") IntBuffer sources, @NativeType("ALint64SOFT") long start_time) {
        nalSourcePlayAtTimevSOFT(sources.remaining(), memAddress(sources), start_time);
    }

    // --- [ alSourcePlayAtTimevDirectSOFT ] ---

    /** {@code ALvoid alSourcePlayAtTimevDirectSOFT(ALCcontext * context, ALsizei n, ALuint const * sources, ALint64SOFT start_time)} */
    public static void nalSourcePlayAtTimevDirectSOFT(long context, int n, long sources, long start_time) {
        long __functionAddress = AL.getICD().alSourcePlayAtTimevDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPJV(context, n, sources, start_time, __functionAddress);
    }

    /** {@code ALvoid alSourcePlayAtTimevDirectSOFT(ALCcontext * context, ALsizei n, ALuint const * sources, ALint64SOFT start_time)} */
    @NativeType("ALvoid")
    public static void alSourcePlayAtTimevDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint const *") IntBuffer sources, @NativeType("ALint64SOFT") long start_time) {
        nalSourcePlayAtTimevDirectSOFT(context, sources.remaining(), memAddress(sources), start_time);
    }

    /** {@code ALvoid alSourcePlayAtTimevSOFT(ALsizei n, ALuint const * sources, ALint64SOFT start_time)} */
    @NativeType("ALvoid")
    public static void alSourcePlayAtTimevSOFT(@NativeType("ALuint const *") int[] sources, @NativeType("ALint64SOFT") long start_time) {
        long __functionAddress = AL.getICD().alSourcePlayAtTimevSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePJV(sources.length, sources, start_time, __functionAddress);
    }

    /** {@code ALvoid alSourcePlayAtTimevDirectSOFT(ALCcontext * context, ALsizei n, ALuint const * sources, ALint64SOFT start_time)} */
    @NativeType("ALvoid")
    public static void alSourcePlayAtTimevDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint const *") int[] sources, @NativeType("ALint64SOFT") long start_time) {
        long __functionAddress = AL.getICD().alSourcePlayAtTimevDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPJV(context, sources.length, sources, start_time, __functionAddress);
    }

}