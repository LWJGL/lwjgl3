/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SOFTSourceResampler {

    public static final int
        AL_NUM_RESAMPLERS_SOFT    = 0x1210,
        AL_DEFAULT_RESAMPLER_SOFT = 0x1211;

    public static final int AL_SOURCE_RESAMPLER_SOFT = 0x1212;

    public static final int AL_RESAMPLER_NAME_SOFT = 0x1213;

    protected SOFTSourceResampler() {
        throw new UnsupportedOperationException();
    }

    // --- [ alGetStringiSOFT ] ---

    /** {@code ALchar const * alGetStringiSOFT(ALenum pname, ALsizei index)} */
    public static long nalGetStringiSOFT(int pname, int index) {
        long __functionAddress = AL.getICD().alGetStringiSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(pname, index, __functionAddress);
    }

    /** {@code ALchar const * alGetStringiSOFT(ALenum pname, ALsizei index)} */
    @NativeType("ALchar const *")
    public static @Nullable String alGetStringiSOFT(@NativeType("ALenum") int pname, @NativeType("ALsizei") int index) {
        long __result = nalGetStringiSOFT(pname, index);
        return memUTF8Safe(__result);
    }

    // --- [ alGetStringiDirectSOFT ] ---

    /** {@code ALchar const * alGetStringiDirectSOFT(ALCcontext * context, ALenum pname, ALsizei index)} */
    public static long nalGetStringiDirectSOFT(long context, int pname, int index) {
        long __functionAddress = AL.getICD().alGetStringiDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return invokePP(context, pname, index, __functionAddress);
    }

    /** {@code ALchar const * alGetStringiDirectSOFT(ALCcontext * context, ALenum pname, ALsizei index)} */
    @NativeType("ALchar const *")
    public static @Nullable String alGetStringiDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int pname, @NativeType("ALsizei") int index) {
        long __result = nalGetStringiDirectSOFT(context, pname, index);
        return memUTF8Safe(__result);
    }

}