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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SOFTSourceLatency {

    public static final int AL_SAMPLE_OFFSET_LATENCY_SOFT = 0x1200;

    public static final int AL_SEC_OFFSET_LATENCY_SOFT = 0x1201;

    protected SOFTSourceLatency() {
        throw new UnsupportedOperationException();
    }

    // --- [ alSourcedSOFT ] ---

    /** {@code ALvoid alSourcedSOFT(ALuint source, ALenum param, ALdouble value)} */
    @NativeType("ALvoid")
    public static void alSourcedSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble") double value) {
        long __functionAddress = AL.getICD().alSourcedSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(source, param, value, __functionAddress);
    }

    // --- [ alSourcedDirectSOFT ] ---

    /** {@code ALvoid alSourcedDirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALdouble value)} */
    @NativeType("ALvoid")
    public static void alSourcedDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble") double value) {
        long __functionAddress = AL.getICD().alSourcedDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, source, param, value, __functionAddress);
    }

    // --- [ alSource3dSOFT ] ---

    /** {@code ALvoid alSource3dSOFT(ALuint source, ALenum param, ALdouble value1, ALdouble value2, ALdouble value3)} */
    @NativeType("ALvoid")
    public static void alSource3dSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble") double value1, @NativeType("ALdouble") double value2, @NativeType("ALdouble") double value3) {
        long __functionAddress = AL.getICD().alSource3dSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(source, param, value1, value2, value3, __functionAddress);
    }

    // --- [ alSource3dDirectSOFT ] ---

    /** {@code ALvoid alSource3dDirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALdouble value1, ALdouble value2, ALdouble value3)} */
    @NativeType("ALvoid")
    public static void alSource3dDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble") double value1, @NativeType("ALdouble") double value2, @NativeType("ALdouble") double value3) {
        long __functionAddress = AL.getICD().alSource3dDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, source, param, value1, value2, value3, __functionAddress);
    }

    // --- [ alSourcedvSOFT ] ---

    /** {@code ALvoid alSourcedvSOFT(ALuint source, ALenum param, ALdouble const * value)} */
    public static void nalSourcedvSOFT(int source, int param, long value) {
        long __functionAddress = AL.getICD().alSourcedvSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(source, param, value, __functionAddress);
    }

    /** {@code ALvoid alSourcedvSOFT(ALuint source, ALenum param, ALdouble const * value)} */
    @NativeType("ALvoid")
    public static void alSourcedvSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble const *") DoubleBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalSourcedvSOFT(source, param, memAddress(value));
    }

    // --- [ alSourcedvDirectSOFT ] ---

    /** {@code ALvoid alSourcedvDirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALdouble const * value)} */
    public static void nalSourcedvDirectSOFT(long context, int source, int param, long value) {
        long __functionAddress = AL.getICD().alSourcedvDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, source, param, value, __functionAddress);
    }

    /** {@code ALvoid alSourcedvDirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALdouble const * value)} */
    @NativeType("ALvoid")
    public static void alSourcedvDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble const *") DoubleBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalSourcedvDirectSOFT(context, source, param, memAddress(value));
    }

    // --- [ alGetSourcedSOFT ] ---

    /** {@code ALvoid alGetSourcedSOFT(ALuint source, ALenum param, ALdouble * value)} */
    public static void nalGetSourcedSOFT(int source, int param, long value) {
        long __functionAddress = AL.getICD().alGetSourcedSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(source, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetSourcedSOFT(ALuint source, ALenum param, ALdouble * value)} */
    @NativeType("ALvoid")
    public static void alGetSourcedSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") DoubleBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetSourcedSOFT(source, param, memAddress(value));
    }

    /** {@code ALvoid alGetSourcedSOFT(ALuint source, ALenum param, ALdouble * value)} */
    @NativeType("ALvoid")
    public static double alGetSourcedSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer value = stack.callocDouble(1);
            nalGetSourcedSOFT(source, param, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetSourcedDirectSOFT ] ---

    /** {@code ALvoid alGetSourcedDirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALdouble * value)} */
    public static void nalGetSourcedDirectSOFT(long context, int source, int param, long value) {
        long __functionAddress = AL.getICD().alGetSourcedDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, source, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetSourcedDirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALdouble * value)} */
    @NativeType("ALvoid")
    public static void alGetSourcedDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") DoubleBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetSourcedDirectSOFT(context, source, param, memAddress(value));
    }

    /** {@code ALvoid alGetSourcedDirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALdouble * value)} */
    @NativeType("ALvoid")
    public static double alGetSourcedDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer value = stack.callocDouble(1);
            nalGetSourcedDirectSOFT(context, source, param, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetSource3dSOFT ] ---

    /** {@code ALvoid alGetSource3dSOFT(ALuint source, ALenum param, ALdouble * value1, ALdouble * value2, ALdouble * value3)} */
    public static void nalGetSource3dSOFT(int source, int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetSource3dSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPPV(source, param, value1, value2, value3, __functionAddress);
    }

    /** {@code ALvoid alGetSource3dSOFT(ALuint source, ALenum param, ALdouble * value1, ALdouble * value2, ALdouble * value3)} */
    @NativeType("ALvoid")
    public static void alGetSource3dSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") DoubleBuffer value1, @NativeType("ALdouble *") DoubleBuffer value2, @NativeType("ALdouble *") DoubleBuffer value3) {
        if (CHECKS) {
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        nalGetSource3dSOFT(source, param, memAddress(value1), memAddress(value2), memAddress(value3));
    }

    // --- [ alGetSource3dDirectSOFT ] ---

    /** {@code ALvoid alGetSource3dDirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALdouble * value1, ALdouble * value2, ALdouble * value3)} */
    public static void nalGetSource3dDirectSOFT(long context, int source, int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetSource3dDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPPPV(context, source, param, value1, value2, value3, __functionAddress);
    }

    /** {@code ALvoid alGetSource3dDirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALdouble * value1, ALdouble * value2, ALdouble * value3)} */
    @NativeType("ALvoid")
    public static void alGetSource3dDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") DoubleBuffer value1, @NativeType("ALdouble *") DoubleBuffer value2, @NativeType("ALdouble *") DoubleBuffer value3) {
        if (CHECKS) {
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        nalGetSource3dDirectSOFT(context, source, param, memAddress(value1), memAddress(value2), memAddress(value3));
    }

    // --- [ alGetSourcedvSOFT ] ---

    /** {@code ALvoid alGetSourcedvSOFT(ALuint source, ALenum param, ALdouble * values)} */
    public static void nalGetSourcedvSOFT(int source, int param, long values) {
        long __functionAddress = AL.getICD().alGetSourcedvSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(source, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetSourcedvSOFT(ALuint source, ALenum param, ALdouble * values)} */
    @NativeType("ALvoid")
    public static void alGetSourcedvSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") DoubleBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetSourcedvSOFT(source, param, memAddress(values));
    }

    // --- [ alGetSourcedvDirectSOFT ] ---

    /** {@code ALvoid alGetSourcedvDirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALdouble * values)} */
    public static void nalGetSourcedvDirectSOFT(long context, int source, int param, long values) {
        long __functionAddress = AL.getICD().alGetSourcedvDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, source, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetSourcedvDirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALdouble * values)} */
    @NativeType("ALvoid")
    public static void alGetSourcedvDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") DoubleBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetSourcedvDirectSOFT(context, source, param, memAddress(values));
    }

    // --- [ alSourcei64SOFT ] ---

    /** {@code ALvoid alSourcei64SOFT(ALuint source, ALenum param, ALint64SOFT value)} */
    @NativeType("ALvoid")
    public static void alSourcei64SOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT") long value) {
        long __functionAddress = AL.getICD().alSourcei64SOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeJV(source, param, value, __functionAddress);
    }

    // --- [ alSourcei64DirectSOFT ] ---

    /** {@code ALvoid alSourcei64DirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALint64SOFT value)} */
    @NativeType("ALvoid")
    public static void alSourcei64DirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT") long value) {
        long __functionAddress = AL.getICD().alSourcei64DirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePJV(context, source, param, value, __functionAddress);
    }

    // --- [ alSource3i64SOFT ] ---

    /** {@code ALvoid alSource3i64SOFT(ALuint source, ALenum param, ALint64SOFT value1, ALint64SOFT value2, ALint64SOFT value3)} */
    @NativeType("ALvoid")
    public static void alSource3i64SOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT") long value1, @NativeType("ALint64SOFT") long value2, @NativeType("ALint64SOFT") long value3) {
        long __functionAddress = AL.getICD().alSource3i64SOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeJJJV(source, param, value1, value2, value3, __functionAddress);
    }

    // --- [ alSource3i64DirectSOFT ] ---

    /** {@code ALvoid alSource3i64DirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALint64SOFT value1, ALint64SOFT value2, ALint64SOFT value3)} */
    @NativeType("ALvoid")
    public static void alSource3i64DirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT") long value1, @NativeType("ALint64SOFT") long value2, @NativeType("ALint64SOFT") long value3) {
        long __functionAddress = AL.getICD().alSource3i64DirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePJJJV(context, source, param, value1, value2, value3, __functionAddress);
    }

    // --- [ alSourcei64vSOFT ] ---

    /** {@code ALvoid alSourcei64vSOFT(ALuint source, ALenum param, ALint64SOFT const * values)} */
    public static void nalSourcei64vSOFT(int source, int param, long values) {
        long __functionAddress = AL.getICD().alSourcei64vSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(source, param, values, __functionAddress);
    }

    /** {@code ALvoid alSourcei64vSOFT(ALuint source, ALenum param, ALint64SOFT const * values)} */
    @NativeType("ALvoid")
    public static void alSourcei64vSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT const *") LongBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalSourcei64vSOFT(source, param, memAddress(values));
    }

    // --- [ alSourcei64vDirectSOFT ] ---

    /** {@code ALvoid alSourcei64vDirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALint64SOFT const * values)} */
    public static void nalSourcei64vDirectSOFT(long context, int source, int param, long values) {
        long __functionAddress = AL.getICD().alSourcei64vDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, source, param, values, __functionAddress);
    }

    /** {@code ALvoid alSourcei64vDirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALint64SOFT const * values)} */
    @NativeType("ALvoid")
    public static void alSourcei64vDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT const *") LongBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalSourcei64vDirectSOFT(context, source, param, memAddress(values));
    }

    // --- [ alGetSourcei64SOFT ] ---

    /** {@code ALvoid alGetSourcei64SOFT(ALuint source, ALenum param, ALint64SOFT * value)} */
    public static void nalGetSourcei64SOFT(int source, int param, long value) {
        long __functionAddress = AL.getICD().alGetSourcei64SOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(source, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetSourcei64SOFT(ALuint source, ALenum param, ALint64SOFT * value)} */
    @NativeType("ALvoid")
    public static void alGetSourcei64SOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") LongBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetSourcei64SOFT(source, param, memAddress(value));
    }

    /** {@code ALvoid alGetSourcei64SOFT(ALuint source, ALenum param, ALint64SOFT * value)} */
    @NativeType("ALvoid")
    public static long alGetSourcei64SOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer value = stack.callocLong(1);
            nalGetSourcei64SOFT(source, param, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetSourcei64DirectSOFT ] ---

    /** {@code ALvoid alGetSourcei64DirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALint64SOFT * value)} */
    public static void nalGetSourcei64DirectSOFT(long context, int source, int param, long value) {
        long __functionAddress = AL.getICD().alGetSourcei64DirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, source, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetSourcei64DirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALint64SOFT * value)} */
    @NativeType("ALvoid")
    public static void alGetSourcei64DirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") LongBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetSourcei64DirectSOFT(context, source, param, memAddress(value));
    }

    /** {@code ALvoid alGetSourcei64DirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALint64SOFT * value)} */
    @NativeType("ALvoid")
    public static long alGetSourcei64DirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer value = stack.callocLong(1);
            nalGetSourcei64DirectSOFT(context, source, param, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetSource3i64SOFT ] ---

    /** {@code ALvoid alGetSource3i64SOFT(ALuint source, ALenum param, ALint64SOFT * value1, ALint64SOFT * value2, ALint64SOFT * value3)} */
    public static void nalGetSource3i64SOFT(int source, int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetSource3i64SOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPPV(source, param, value1, value2, value3, __functionAddress);
    }

    /** {@code ALvoid alGetSource3i64SOFT(ALuint source, ALenum param, ALint64SOFT * value1, ALint64SOFT * value2, ALint64SOFT * value3)} */
    @NativeType("ALvoid")
    public static void alGetSource3i64SOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") LongBuffer value1, @NativeType("ALint64SOFT *") LongBuffer value2, @NativeType("ALint64SOFT *") LongBuffer value3) {
        if (CHECKS) {
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        nalGetSource3i64SOFT(source, param, memAddress(value1), memAddress(value2), memAddress(value3));
    }

    // --- [ alGetSource3i64DirectSOFT ] ---

    /** {@code ALvoid alGetSource3i64DirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALint64SOFT * value1, ALint64SOFT * value2, ALint64SOFT * value3)} */
    public static void nalGetSource3i64DirectSOFT(long context, int source, int param, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetSource3i64DirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPPPV(context, source, param, value1, value2, value3, __functionAddress);
    }

    /** {@code ALvoid alGetSource3i64DirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALint64SOFT * value1, ALint64SOFT * value2, ALint64SOFT * value3)} */
    @NativeType("ALvoid")
    public static void alGetSource3i64DirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") LongBuffer value1, @NativeType("ALint64SOFT *") LongBuffer value2, @NativeType("ALint64SOFT *") LongBuffer value3) {
        if (CHECKS) {
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        nalGetSource3i64DirectSOFT(context, source, param, memAddress(value1), memAddress(value2), memAddress(value3));
    }

    // --- [ alGetSourcei64vSOFT ] ---

    /** {@code ALvoid alGetSourcei64vSOFT(ALuint source, ALenum param, ALint64SOFT * values)} */
    public static void nalGetSourcei64vSOFT(int source, int param, long values) {
        long __functionAddress = AL.getICD().alGetSourcei64vSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(source, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetSourcei64vSOFT(ALuint source, ALenum param, ALint64SOFT * values)} */
    @NativeType("ALvoid")
    public static void alGetSourcei64vSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") LongBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetSourcei64vSOFT(source, param, memAddress(values));
    }

    // --- [ alGetSourcei64vDirectSOFT ] ---

    /** {@code ALvoid alGetSourcei64vDirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALint64SOFT * values)} */
    public static void nalGetSourcei64vDirectSOFT(long context, int source, int param, long values) {
        long __functionAddress = AL.getICD().alGetSourcei64vDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, source, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetSourcei64vDirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALint64SOFT * values)} */
    @NativeType("ALvoid")
    public static void alGetSourcei64vDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") LongBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetSourcei64vDirectSOFT(context, source, param, memAddress(values));
    }

    /** {@code ALvoid alSourcedvSOFT(ALuint source, ALenum param, ALdouble const * value)} */
    @NativeType("ALvoid")
    public static void alSourcedvSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble const *") double[] value) {
        long __functionAddress = AL.getICD().alSourcedvSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        invokePV(source, param, value, __functionAddress);
    }

    /** {@code ALvoid alSourcedvDirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALdouble const * value)} */
    @NativeType("ALvoid")
    public static void alSourcedvDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble const *") double[] value) {
        long __functionAddress = AL.getICD().alSourcedvDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value, 1);
        }
        invokePPV(context, source, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetSourcedSOFT(ALuint source, ALenum param, ALdouble * value)} */
    @NativeType("ALvoid")
    public static void alGetSourcedSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") double[] value) {
        long __functionAddress = AL.getICD().alGetSourcedSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        invokePV(source, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetSourcedDirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALdouble * value)} */
    @NativeType("ALvoid")
    public static void alGetSourcedDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") double[] value) {
        long __functionAddress = AL.getICD().alGetSourcedDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value, 1);
        }
        invokePPV(context, source, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetSource3dSOFT(ALuint source, ALenum param, ALdouble * value1, ALdouble * value2, ALdouble * value3)} */
    @NativeType("ALvoid")
    public static void alGetSource3dSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") double[] value1, @NativeType("ALdouble *") double[] value2, @NativeType("ALdouble *") double[] value3) {
        long __functionAddress = AL.getICD().alGetSource3dSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        invokePPPV(source, param, value1, value2, value3, __functionAddress);
    }

    /** {@code ALvoid alGetSource3dDirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALdouble * value1, ALdouble * value2, ALdouble * value3)} */
    @NativeType("ALvoid")
    public static void alGetSource3dDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") double[] value1, @NativeType("ALdouble *") double[] value2, @NativeType("ALdouble *") double[] value3) {
        long __functionAddress = AL.getICD().alGetSource3dDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        invokePPPPV(context, source, param, value1, value2, value3, __functionAddress);
    }

    /** {@code ALvoid alGetSourcedvSOFT(ALuint source, ALenum param, ALdouble * values)} */
    @NativeType("ALvoid")
    public static void alGetSourcedvSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") double[] values) {
        long __functionAddress = AL.getICD().alGetSourcedvSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        invokePV(source, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetSourcedvDirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALdouble * values)} */
    @NativeType("ALvoid")
    public static void alGetSourcedvDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALdouble *") double[] values) {
        long __functionAddress = AL.getICD().alGetSourcedvDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(values, 1);
        }
        invokePPV(context, source, param, values, __functionAddress);
    }

    /** {@code ALvoid alSourcei64vSOFT(ALuint source, ALenum param, ALint64SOFT const * values)} */
    @NativeType("ALvoid")
    public static void alSourcei64vSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT const *") long[] values) {
        long __functionAddress = AL.getICD().alSourcei64vSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        invokePV(source, param, values, __functionAddress);
    }

    /** {@code ALvoid alSourcei64vDirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALint64SOFT const * values)} */
    @NativeType("ALvoid")
    public static void alSourcei64vDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT const *") long[] values) {
        long __functionAddress = AL.getICD().alSourcei64vDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(values, 1);
        }
        invokePPV(context, source, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetSourcei64SOFT(ALuint source, ALenum param, ALint64SOFT * value)} */
    @NativeType("ALvoid")
    public static void alGetSourcei64SOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") long[] value) {
        long __functionAddress = AL.getICD().alGetSourcei64SOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        invokePV(source, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetSourcei64DirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALint64SOFT * value)} */
    @NativeType("ALvoid")
    public static void alGetSourcei64DirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") long[] value) {
        long __functionAddress = AL.getICD().alGetSourcei64DirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value, 1);
        }
        invokePPV(context, source, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetSource3i64SOFT(ALuint source, ALenum param, ALint64SOFT * value1, ALint64SOFT * value2, ALint64SOFT * value3)} */
    @NativeType("ALvoid")
    public static void alGetSource3i64SOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") long[] value1, @NativeType("ALint64SOFT *") long[] value2, @NativeType("ALint64SOFT *") long[] value3) {
        long __functionAddress = AL.getICD().alGetSource3i64SOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        invokePPPV(source, param, value1, value2, value3, __functionAddress);
    }

    /** {@code ALvoid alGetSource3i64DirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALint64SOFT * value1, ALint64SOFT * value2, ALint64SOFT * value3)} */
    @NativeType("ALvoid")
    public static void alGetSource3i64DirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") long[] value1, @NativeType("ALint64SOFT *") long[] value2, @NativeType("ALint64SOFT *") long[] value3) {
        long __functionAddress = AL.getICD().alGetSource3i64DirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        invokePPPPV(context, source, param, value1, value2, value3, __functionAddress);
    }

    /** {@code ALvoid alGetSourcei64vSOFT(ALuint source, ALenum param, ALint64SOFT * values)} */
    @NativeType("ALvoid")
    public static void alGetSourcei64vSOFT(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") long[] values) {
        long __functionAddress = AL.getICD().alGetSourcei64vSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        invokePV(source, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetSourcei64vDirectSOFT(ALCcontext * context, ALuint source, ALenum param, ALint64SOFT * values)} */
    @NativeType("ALvoid")
    public static void alGetSourcei64vDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint64SOFT *") long[] values) {
        long __functionAddress = AL.getICD().alGetSourcei64vDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(values, 1);
        }
        invokePPV(context, source, param, values, __functionAddress);
    }

}