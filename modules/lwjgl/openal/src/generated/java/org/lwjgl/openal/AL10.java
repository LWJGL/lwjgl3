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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class AL10 {

    public static final int
        AL_INVALID = 0xFFFFFFFF,
        AL_NONE    = 0x0,
        AL_FALSE   = 0x0,
        AL_TRUE    = 0x1;

    public static final int
        AL_NO_ERROR          = 0x0,
        AL_INVALID_NAME      = 0xA001,
        AL_INVALID_ENUM      = 0xA002,
        AL_INVALID_VALUE     = 0xA003,
        AL_INVALID_OPERATION = 0xA004,
        AL_OUT_OF_MEMORY     = 0xA005;

    public static final int
        AL_DOPPLER_FACTOR = 0xC000,
        AL_DISTANCE_MODEL = 0xD000;

    public static final int
        AL_VENDOR     = 0xB001,
        AL_VERSION    = 0xB002,
        AL_RENDERER   = 0xB003,
        AL_EXTENSIONS = 0xB004;

    public static final int
        AL_INVERSE_DISTANCE         = 0xD001,
        AL_INVERSE_DISTANCE_CLAMPED = 0xD002;

    public static final int
        AL_SOURCE_ABSOLUTE = 0x201,
        AL_SOURCE_RELATIVE = 0x202;

    public static final int
        AL_POSITION = 0x1004,
        AL_VELOCITY = 0x1006,
        AL_GAIN     = 0x100A;

    public static final int
        AL_CONE_INNER_ANGLE = 0x1001,
        AL_CONE_OUTER_ANGLE = 0x1002,
        AL_PITCH            = 0x1003,
        AL_DIRECTION        = 0x1005,
        AL_LOOPING          = 0x1007,
        AL_BUFFER           = 0x1009,
        AL_SOURCE_STATE     = 0x1010,
        AL_CONE_OUTER_GAIN  = 0x1022,
        AL_SOURCE_TYPE      = 0x1027;

    public static final int
        AL_INITIAL = 0x1011,
        AL_PLAYING = 0x1012,
        AL_PAUSED  = 0x1013,
        AL_STOPPED = 0x1014;

    public static final int AL_ORIENTATION = 0x100F;

    public static final int
        AL_BUFFERS_QUEUED    = 0x1015,
        AL_BUFFERS_PROCESSED = 0x1016;

    public static final int
        AL_MIN_GAIN = 0x100D,
        AL_MAX_GAIN = 0x100E;

    public static final int
        AL_REFERENCE_DISTANCE = 0x1020,
        AL_ROLLOFF_FACTOR     = 0x1021,
        AL_MAX_DISTANCE       = 0x1023;

    public static final int
        AL_FREQUENCY = 0x2001,
        AL_BITS      = 0x2002,
        AL_CHANNELS  = 0x2003,
        AL_SIZE      = 0x2004;

    public static final int
        AL_FORMAT_MONO8    = 0x1100,
        AL_FORMAT_MONO16   = 0x1101,
        AL_FORMAT_STEREO8  = 0x1102,
        AL_FORMAT_STEREO16 = 0x1103;

    public static final int
        AL_UNUSED    = 0x2010,
        AL_PENDING   = 0x2011,
        AL_PROCESSED = 0x2012;

    protected AL10() {
        throw new UnsupportedOperationException();
    }

    // --- [ alGetError ] ---

    /** {@code ALenum alGetError(void)} */
    @NativeType("ALenum")
    public static int alGetError() {
        long __functionAddress = AL.getICD().alGetError;
        return invokeI(__functionAddress);
    }

    // --- [ alGetErrorDirect ] ---

    /** {@code ALenum alGetErrorDirect(ALCcontext * context)} */
    @NativeType("ALenum")
    public static int alGetErrorDirect(@NativeType("ALCcontext *") long context) {
        long __functionAddress = AL.getICD().alGetErrorDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return invokePI(context, __functionAddress);
    }

    // --- [ alEnable ] ---

    /** {@code ALvoid alEnable(ALenum target)} */
    @NativeType("ALvoid")
    public static void alEnable(@NativeType("ALenum") int target) {
        long __functionAddress = AL.getICD().alEnable;
        invokeV(target, __functionAddress);
    }

    // --- [ alEnableDirect ] ---

    /** {@code ALvoid alEnableDirect(ALCcontext * context, ALenum target)} */
    @NativeType("ALvoid")
    public static void alEnableDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int target) {
        long __functionAddress = AL.getICD().alEnableDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, target, __functionAddress);
    }

    // --- [ alDisable ] ---

    /** {@code ALvoid alDisable(ALenum target)} */
    @NativeType("ALvoid")
    public static void alDisable(@NativeType("ALenum") int target) {
        long __functionAddress = AL.getICD().alDisable;
        invokeV(target, __functionAddress);
    }

    // --- [ alDisableDirect ] ---

    /** {@code ALvoid alDisableDirect(ALCcontext * context, ALenum target)} */
    @NativeType("ALvoid")
    public static void alDisableDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int target) {
        long __functionAddress = AL.getICD().alDisableDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, target, __functionAddress);
    }

    // --- [ alIsEnabled ] ---

    /** {@code ALboolean alIsEnabled(ALenum target)} */
    @NativeType("ALboolean")
    public static boolean alIsEnabled(@NativeType("ALenum") int target) {
        long __functionAddress = AL.getICD().alIsEnabled;
        return invokeZ(target, __functionAddress);
    }

    // --- [ alIsEnabledDirect ] ---

    /** {@code ALboolean alIsEnabledDirect(ALCcontext * context, ALenum target)} */
    @NativeType("ALboolean")
    public static boolean alIsEnabledDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int target) {
        long __functionAddress = AL.getICD().alIsEnabledDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return invokePZ(context, target, __functionAddress);
    }

    // --- [ alGetBoolean ] ---

    /** {@code ALboolean alGetBoolean(ALenum paramName)} */
    @NativeType("ALboolean")
    public static boolean alGetBoolean(@NativeType("ALenum") int paramName) {
        long __functionAddress = AL.getICD().alGetBoolean;
        return invokeZ(paramName, __functionAddress);
    }

    // --- [ alGetBooleanDirect ] ---

    /** {@code ALboolean alGetBooleanDirect(ALCcontext * context, ALenum paramName)} */
    @NativeType("ALboolean")
    public static boolean alGetBooleanDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName) {
        long __functionAddress = AL.getICD().alGetBooleanDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return invokePZ(context, paramName, __functionAddress);
    }

    // --- [ alGetInteger ] ---

    /** {@code ALint alGetInteger(ALenum paramName)} */
    @NativeType("ALint")
    public static int alGetInteger(@NativeType("ALenum") int paramName) {
        long __functionAddress = AL.getICD().alGetInteger;
        return invokeI(paramName, __functionAddress);
    }

    // --- [ alGetIntegerDirect ] ---

    /** {@code ALint alGetIntegerDirect(ALCcontext * context, ALenum paramName)} */
    @NativeType("ALint")
    public static int alGetIntegerDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName) {
        long __functionAddress = AL.getICD().alGetIntegerDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return invokePI(context, paramName, __functionAddress);
    }

    // --- [ alGetFloat ] ---

    /** {@code ALfloat alGetFloat(ALenum paramName)} */
    @NativeType("ALfloat")
    public static float alGetFloat(@NativeType("ALenum") int paramName) {
        long __functionAddress = AL.getICD().alGetFloat;
        return invokeF(paramName, __functionAddress);
    }

    // --- [ alGetFloatDirect ] ---

    /** {@code ALfloat alGetFloatDirect(ALCcontext * context, ALenum paramName)} */
    @NativeType("ALfloat")
    public static float alGetFloatDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName) {
        long __functionAddress = AL.getICD().alGetFloatDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return invokePF(context, paramName, __functionAddress);
    }

    // --- [ alGetDouble ] ---

    /** {@code ALdouble alGetDouble(ALenum paramName)} */
    @NativeType("ALdouble")
    public static double alGetDouble(@NativeType("ALenum") int paramName) {
        long __functionAddress = AL.getICD().alGetDouble;
        return invokeD(paramName, __functionAddress);
    }

    // --- [ alGetDoubleDirect ] ---

    /** {@code ALdouble alGetDoubleDirect(ALCcontext * context, ALenum paramName)} */
    @NativeType("ALdouble")
    public static double alGetDoubleDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName) {
        long __functionAddress = AL.getICD().alGetDoubleDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return invokePD(context, paramName, __functionAddress);
    }

    // --- [ alGetBooleanv ] ---

    /** {@code ALvoid alGetBooleanv(ALenum paramName, ALboolean * dest)} */
    public static void nalGetBooleanv(int paramName, long dest) {
        long __functionAddress = AL.getICD().alGetBooleanv;
        invokePV(paramName, dest, __functionAddress);
    }

    /** {@code ALvoid alGetBooleanv(ALenum paramName, ALboolean * dest)} */
    @NativeType("ALvoid")
    public static void alGetBooleanv(@NativeType("ALenum") int paramName, @NativeType("ALboolean *") ByteBuffer dest) {
        if (CHECKS) {
            check(dest, 1);
        }
        nalGetBooleanv(paramName, memAddress(dest));
    }

    // --- [ alGetBooleanvDirect ] ---

    /** {@code ALvoid alGetBooleanvDirect(ALCcontext * context, ALenum paramName, ALboolean * dest)} */
    public static void nalGetBooleanvDirect(long context, int paramName, long dest) {
        long __functionAddress = AL.getICD().alGetBooleanvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, paramName, dest, __functionAddress);
    }

    /** {@code ALvoid alGetBooleanvDirect(ALCcontext * context, ALenum paramName, ALboolean * dest)} */
    @NativeType("ALvoid")
    public static void alGetBooleanvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName, @NativeType("ALboolean *") ByteBuffer dest) {
        if (CHECKS) {
            check(dest, 1);
        }
        nalGetBooleanvDirect(context, paramName, memAddress(dest));
    }

    // --- [ alGetIntegerv ] ---

    /** {@code ALvoid alGetIntegerv(ALenum paramName, ALint * dest)} */
    public static void nalGetIntegerv(int paramName, long dest) {
        long __functionAddress = AL.getICD().alGetIntegerv;
        invokePV(paramName, dest, __functionAddress);
    }

    /** {@code ALvoid alGetIntegerv(ALenum paramName, ALint * dest)} */
    @NativeType("ALvoid")
    public static void alGetIntegerv(@NativeType("ALenum") int paramName, @NativeType("ALint *") IntBuffer dest) {
        if (CHECKS) {
            check(dest, 1);
        }
        nalGetIntegerv(paramName, memAddress(dest));
    }

    // --- [ alGetIntegervDirect ] ---

    /** {@code ALvoid alGetIntegervDirect(ALCcontext * context, ALenum paramName, ALint * dest)} */
    public static void nalGetIntegervDirect(long context, int paramName, long dest) {
        long __functionAddress = AL.getICD().alGetIntegervDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, paramName, dest, __functionAddress);
    }

    /** {@code ALvoid alGetIntegervDirect(ALCcontext * context, ALenum paramName, ALint * dest)} */
    @NativeType("ALvoid")
    public static void alGetIntegervDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName, @NativeType("ALint *") IntBuffer dest) {
        if (CHECKS) {
            check(dest, 1);
        }
        nalGetIntegervDirect(context, paramName, memAddress(dest));
    }

    // --- [ alGetFloatv ] ---

    /** {@code ALvoid alGetFloatv(ALenum paramName, ALfloat * dest)} */
    public static void nalGetFloatv(int paramName, long dest) {
        long __functionAddress = AL.getICD().alGetFloatv;
        invokePV(paramName, dest, __functionAddress);
    }

    /** {@code ALvoid alGetFloatv(ALenum paramName, ALfloat * dest)} */
    @NativeType("ALvoid")
    public static void alGetFloatv(@NativeType("ALenum") int paramName, @NativeType("ALfloat *") FloatBuffer dest) {
        if (CHECKS) {
            check(dest, 1);
        }
        nalGetFloatv(paramName, memAddress(dest));
    }

    // --- [ alGetFloatvDirect ] ---

    /** {@code ALvoid alGetFloatvDirect(ALCcontext * context, ALenum paramName, ALfloat * dest)} */
    public static void nalGetFloatvDirect(long context, int paramName, long dest) {
        long __functionAddress = AL.getICD().alGetFloatvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, paramName, dest, __functionAddress);
    }

    /** {@code ALvoid alGetFloatvDirect(ALCcontext * context, ALenum paramName, ALfloat * dest)} */
    @NativeType("ALvoid")
    public static void alGetFloatvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName, @NativeType("ALfloat *") FloatBuffer dest) {
        if (CHECKS) {
            check(dest, 1);
        }
        nalGetFloatvDirect(context, paramName, memAddress(dest));
    }

    // --- [ alGetDoublev ] ---

    /** {@code ALvoid alGetDoublev(ALenum paramName, ALdouble * dest)} */
    public static void nalGetDoublev(int paramName, long dest) {
        long __functionAddress = AL.getICD().alGetDoublev;
        invokePV(paramName, dest, __functionAddress);
    }

    /** {@code ALvoid alGetDoublev(ALenum paramName, ALdouble * dest)} */
    @NativeType("ALvoid")
    public static void alGetDoublev(@NativeType("ALenum") int paramName, @NativeType("ALdouble *") DoubleBuffer dest) {
        if (CHECKS) {
            check(dest, 1);
        }
        nalGetDoublev(paramName, memAddress(dest));
    }

    // --- [ alGetDoublevDirect ] ---

    /** {@code ALvoid alGetDoublevDirect(ALCcontext * context, ALenum paramName, ALdouble * dest)} */
    public static void nalGetDoublevDirect(long context, int paramName, long dest) {
        long __functionAddress = AL.getICD().alGetDoublevDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, paramName, dest, __functionAddress);
    }

    /** {@code ALvoid alGetDoublevDirect(ALCcontext * context, ALenum paramName, ALdouble * dest)} */
    @NativeType("ALvoid")
    public static void alGetDoublevDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName, @NativeType("ALdouble *") DoubleBuffer dest) {
        if (CHECKS) {
            check(dest, 1);
        }
        nalGetDoublevDirect(context, paramName, memAddress(dest));
    }

    // --- [ alGetString ] ---

    /** {@code ALchar const * alGetString(ALenum paramName)} */
    public static long nalGetString(int paramName) {
        long __functionAddress = AL.getICD().alGetString;
        return invokeP(paramName, __functionAddress);
    }

    /** {@code ALchar const * alGetString(ALenum paramName)} */
    @NativeType("ALchar const *")
    public static @Nullable String alGetString(@NativeType("ALenum") int paramName) {
        long __result = nalGetString(paramName);
        return memUTF8Safe(__result);
    }

    // --- [ alGetStringDirect ] ---

    /** {@code ALchar const * alGetStringDirect(ALCcontext * context, ALenum paramName)} */
    public static long nalGetStringDirect(long context, int paramName) {
        long __functionAddress = AL.getICD().alGetStringDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return invokePP(context, paramName, __functionAddress);
    }

    /** {@code ALchar const * alGetStringDirect(ALCcontext * context, ALenum paramName)} */
    @NativeType("ALchar const *")
    public static @Nullable String alGetStringDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName) {
        long __result = nalGetStringDirect(context, paramName);
        return memUTF8Safe(__result);
    }

    // --- [ alDistanceModel ] ---

    /** {@code ALvoid alDistanceModel(ALenum modelName)} */
    @NativeType("ALvoid")
    public static void alDistanceModel(@NativeType("ALenum") int modelName) {
        long __functionAddress = AL.getICD().alDistanceModel;
        invokeV(modelName, __functionAddress);
    }

    // --- [ alDistanceModelDirect ] ---

    /** {@code ALvoid alDistanceModelDirect(ALCcontext * context, ALenum modelName)} */
    @NativeType("ALvoid")
    public static void alDistanceModelDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int modelName) {
        long __functionAddress = AL.getICD().alDistanceModelDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, modelName, __functionAddress);
    }

    // --- [ alDopplerFactor ] ---

    /** {@code ALvoid alDopplerFactor(ALfloat dopplerFactor)} */
    @NativeType("ALvoid")
    public static void alDopplerFactor(@NativeType("ALfloat") float dopplerFactor) {
        long __functionAddress = AL.getICD().alDopplerFactor;
        invokeV(dopplerFactor, __functionAddress);
    }

    // --- [ alDopplerFactorDirect ] ---

    /** {@code ALvoid alDopplerFactorDirect(ALCcontext * context, ALfloat dopplerFactor)} */
    @NativeType("ALvoid")
    public static void alDopplerFactorDirect(@NativeType("ALCcontext *") long context, @NativeType("ALfloat") float dopplerFactor) {
        long __functionAddress = AL.getICD().alDopplerFactorDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, dopplerFactor, __functionAddress);
    }

    // --- [ alDopplerVelocity ] ---

    /** {@code ALvoid alDopplerVelocity(ALfloat dopplerVelocity)} */
    @NativeType("ALvoid")
    public static void alDopplerVelocity(@NativeType("ALfloat") float dopplerVelocity) {
        long __functionAddress = AL.getICD().alDopplerVelocity;
        invokeV(dopplerVelocity, __functionAddress);
    }

    // --- [ alListenerf ] ---

    /** {@code ALvoid alListenerf(ALenum paramName, ALfloat value)} */
    @NativeType("ALvoid")
    public static void alListenerf(@NativeType("ALenum") int paramName, @NativeType("ALfloat") float value) {
        long __functionAddress = AL.getICD().alListenerf;
        invokeV(paramName, value, __functionAddress);
    }

    // --- [ alListenerfDirect ] ---

    /** {@code ALvoid alListenerfDirect(ALCcontext * context, ALenum paramName, ALfloat value)} */
    @NativeType("ALvoid")
    public static void alListenerfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName, @NativeType("ALfloat") float value) {
        long __functionAddress = AL.getICD().alListenerfDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, paramName, value, __functionAddress);
    }

    // --- [ alListeneri ] ---

    /** {@code ALvoid alListeneri(ALenum paramName, ALint values)} */
    @NativeType("ALvoid")
    public static void alListeneri(@NativeType("ALenum") int paramName, @NativeType("ALint") int values) {
        long __functionAddress = AL.getICD().alListeneri;
        invokeV(paramName, values, __functionAddress);
    }

    // --- [ alListeneriDirect ] ---

    /** {@code ALvoid alListeneriDirect(ALCcontext * context, ALenum paramName, ALint values)} */
    @NativeType("ALvoid")
    public static void alListeneriDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName, @NativeType("ALint") int values) {
        long __functionAddress = AL.getICD().alListeneriDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, paramName, values, __functionAddress);
    }

    // --- [ alListener3f ] ---

    /** {@code ALvoid alListener3f(ALenum paramName, ALfloat value1, ALfloat value2, ALfloat value3)} */
    @NativeType("ALvoid")
    public static void alListener3f(@NativeType("ALenum") int paramName, @NativeType("ALfloat") float value1, @NativeType("ALfloat") float value2, @NativeType("ALfloat") float value3) {
        long __functionAddress = AL.getICD().alListener3f;
        invokeV(paramName, value1, value2, value3, __functionAddress);
    }

    // --- [ alListener3fDirect ] ---

    /** {@code ALvoid alListener3fDirect(ALCcontext * context, ALenum paramName, ALfloat value1, ALfloat value2, ALfloat value3)} */
    @NativeType("ALvoid")
    public static void alListener3fDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName, @NativeType("ALfloat") float value1, @NativeType("ALfloat") float value2, @NativeType("ALfloat") float value3) {
        long __functionAddress = AL.getICD().alListener3fDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, paramName, value1, value2, value3, __functionAddress);
    }

    // --- [ alListenerfv ] ---

    /** {@code ALvoid alListenerfv(ALenum paramName, ALfloat const * values)} */
    public static void nalListenerfv(int paramName, long values) {
        long __functionAddress = AL.getICD().alListenerfv;
        invokePV(paramName, values, __functionAddress);
    }

    /** {@code ALvoid alListenerfv(ALenum paramName, ALfloat const * values)} */
    @NativeType("ALvoid")
    public static void alListenerfv(@NativeType("ALenum") int paramName, @NativeType("ALfloat const *") FloatBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalListenerfv(paramName, memAddress(values));
    }

    // --- [ alListenerfvDirect ] ---

    /** {@code ALvoid alListenerfvDirect(ALCcontext * context, ALenum paramName, ALfloat const * values)} */
    public static void nalListenerfvDirect(long context, int paramName, long values) {
        long __functionAddress = AL.getICD().alListenerfvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, paramName, values, __functionAddress);
    }

    /** {@code ALvoid alListenerfvDirect(ALCcontext * context, ALenum paramName, ALfloat const * values)} */
    @NativeType("ALvoid")
    public static void alListenerfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName, @NativeType("ALfloat const *") FloatBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalListenerfvDirect(context, paramName, memAddress(values));
    }

    // --- [ alGetListenerf ] ---

    /** {@code ALvoid alGetListenerf(ALenum paramName, ALfloat * value)} */
    public static void nalGetListenerf(int paramName, long value) {
        long __functionAddress = AL.getICD().alGetListenerf;
        invokePV(paramName, value, __functionAddress);
    }

    /** {@code ALvoid alGetListenerf(ALenum paramName, ALfloat * value)} */
    @NativeType("ALvoid")
    public static void alGetListenerf(@NativeType("ALenum") int paramName, @NativeType("ALfloat *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetListenerf(paramName, memAddress(value));
    }

    /** {@code ALvoid alGetListenerf(ALenum paramName, ALfloat * value)} */
    @NativeType("ALvoid")
    public static float alGetListenerf(@NativeType("ALenum") int paramName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer value = stack.callocFloat(1);
            nalGetListenerf(paramName, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetListenerfDirect ] ---

    /** {@code ALvoid alGetListenerfDirect(ALCcontext * context, ALenum paramName, ALfloat * value)} */
    public static void nalGetListenerfDirect(long context, int paramName, long value) {
        long __functionAddress = AL.getICD().alGetListenerfDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, paramName, value, __functionAddress);
    }

    /** {@code ALvoid alGetListenerfDirect(ALCcontext * context, ALenum paramName, ALfloat * value)} */
    @NativeType("ALvoid")
    public static void alGetListenerfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName, @NativeType("ALfloat *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetListenerfDirect(context, paramName, memAddress(value));
    }

    /** {@code ALvoid alGetListenerfDirect(ALCcontext * context, ALenum paramName, ALfloat * value)} */
    @NativeType("ALvoid")
    public static float alGetListenerfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer value = stack.callocFloat(1);
            nalGetListenerfDirect(context, paramName, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetListeneri ] ---

    /** {@code ALvoid alGetListeneri(ALenum paramName, ALint * value)} */
    public static void nalGetListeneri(int paramName, long value) {
        long __functionAddress = AL.getICD().alGetListeneri;
        invokePV(paramName, value, __functionAddress);
    }

    /** {@code ALvoid alGetListeneri(ALenum paramName, ALint * value)} */
    @NativeType("ALvoid")
    public static void alGetListeneri(@NativeType("ALenum") int paramName, @NativeType("ALint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetListeneri(paramName, memAddress(value));
    }

    /** {@code ALvoid alGetListeneri(ALenum paramName, ALint * value)} */
    @NativeType("ALvoid")
    public static int alGetListeneri(@NativeType("ALenum") int paramName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer value = stack.callocInt(1);
            nalGetListeneri(paramName, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetListeneriDirect ] ---

    /** {@code ALvoid alGetListeneriDirect(ALCcontext * context, ALenum paramName, ALint * value)} */
    public static void nalGetListeneriDirect(long context, int paramName, long value) {
        long __functionAddress = AL.getICD().alGetListeneriDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, paramName, value, __functionAddress);
    }

    /** {@code ALvoid alGetListeneriDirect(ALCcontext * context, ALenum paramName, ALint * value)} */
    @NativeType("ALvoid")
    public static void alGetListeneriDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName, @NativeType("ALint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetListeneriDirect(context, paramName, memAddress(value));
    }

    /** {@code ALvoid alGetListeneriDirect(ALCcontext * context, ALenum paramName, ALint * value)} */
    @NativeType("ALvoid")
    public static int alGetListeneriDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer value = stack.callocInt(1);
            nalGetListeneriDirect(context, paramName, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetListener3f ] ---

    /** {@code ALvoid alGetListener3f(ALenum paramName, ALfloat * value1, ALfloat * value2, ALfloat * value3)} */
    public static void nalGetListener3f(int paramName, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetListener3f;
        invokePPPV(paramName, value1, value2, value3, __functionAddress);
    }

    /** {@code ALvoid alGetListener3f(ALenum paramName, ALfloat * value1, ALfloat * value2, ALfloat * value3)} */
    @NativeType("ALvoid")
    public static void alGetListener3f(@NativeType("ALenum") int paramName, @NativeType("ALfloat *") FloatBuffer value1, @NativeType("ALfloat *") FloatBuffer value2, @NativeType("ALfloat *") FloatBuffer value3) {
        if (CHECKS) {
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        nalGetListener3f(paramName, memAddress(value1), memAddress(value2), memAddress(value3));
    }

    // --- [ alGetListener3fDirect ] ---

    /** {@code ALvoid alGetListener3fDirect(ALCcontext * context, ALenum paramName, ALfloat * value1, ALfloat * value2, ALfloat * value3)} */
    public static void nalGetListener3fDirect(long context, int paramName, long value1, long value2, long value3) {
        long __functionAddress = AL.getICD().alGetListener3fDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPPPV(context, paramName, value1, value2, value3, __functionAddress);
    }

    /** {@code ALvoid alGetListener3fDirect(ALCcontext * context, ALenum paramName, ALfloat * value1, ALfloat * value2, ALfloat * value3)} */
    @NativeType("ALvoid")
    public static void alGetListener3fDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName, @NativeType("ALfloat *") FloatBuffer value1, @NativeType("ALfloat *") FloatBuffer value2, @NativeType("ALfloat *") FloatBuffer value3) {
        if (CHECKS) {
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        nalGetListener3fDirect(context, paramName, memAddress(value1), memAddress(value2), memAddress(value3));
    }

    // --- [ alGetListenerfv ] ---

    /** {@code ALvoid alGetListenerfv(ALenum paramName, ALfloat * values)} */
    public static void nalGetListenerfv(int paramName, long values) {
        long __functionAddress = AL.getICD().alGetListenerfv;
        invokePV(paramName, values, __functionAddress);
    }

    /** {@code ALvoid alGetListenerfv(ALenum paramName, ALfloat * values)} */
    @NativeType("ALvoid")
    public static void alGetListenerfv(@NativeType("ALenum") int paramName, @NativeType("ALfloat *") FloatBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetListenerfv(paramName, memAddress(values));
    }

    // --- [ alGetListenerfvDirect ] ---

    /** {@code ALvoid alGetListenerfvDirect(ALCcontext * context, ALenum paramName, ALfloat * values)} */
    public static void nalGetListenerfvDirect(long context, int paramName, long values) {
        long __functionAddress = AL.getICD().alGetListenerfvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, paramName, values, __functionAddress);
    }

    /** {@code ALvoid alGetListenerfvDirect(ALCcontext * context, ALenum paramName, ALfloat * values)} */
    @NativeType("ALvoid")
    public static void alGetListenerfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName, @NativeType("ALfloat *") FloatBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetListenerfvDirect(context, paramName, memAddress(values));
    }

    // --- [ alGenSources ] ---

    /** {@code ALvoid alGenSources(ALsizei n, ALuint * srcNames)} */
    public static void nalGenSources(int n, long srcNames) {
        long __functionAddress = AL.getICD().alGenSources;
        invokePV(n, srcNames, __functionAddress);
    }

    /** {@code ALvoid alGenSources(ALsizei n, ALuint * srcNames)} */
    @NativeType("ALvoid")
    public static void alGenSources(@NativeType("ALuint *") IntBuffer srcNames) {
        nalGenSources(srcNames.remaining(), memAddress(srcNames));
    }

    /** {@code ALvoid alGenSources(ALsizei n, ALuint * srcNames)} */
    @NativeType("ALvoid")
    public static int alGenSources() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer srcNames = stack.callocInt(1);
            nalGenSources(1, memAddress(srcNames));
            return srcNames.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGenSourcesDirect ] ---

    /** {@code ALvoid alGenSourcesDirect(ALCcontext * context, ALsizei n, ALuint * srcNames)} */
    public static void nalGenSourcesDirect(long context, int n, long srcNames) {
        long __functionAddress = AL.getICD().alGenSourcesDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, n, srcNames, __functionAddress);
    }

    /** {@code ALvoid alGenSourcesDirect(ALCcontext * context, ALsizei n, ALuint * srcNames)} */
    @NativeType("ALvoid")
    public static void alGenSourcesDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") IntBuffer srcNames) {
        nalGenSourcesDirect(context, srcNames.remaining(), memAddress(srcNames));
    }

    /** {@code ALvoid alGenSourcesDirect(ALCcontext * context, ALsizei n, ALuint * srcNames)} */
    @NativeType("ALvoid")
    public static int alGenSourcesDirect(@NativeType("ALCcontext *") long context) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer srcNames = stack.callocInt(1);
            nalGenSourcesDirect(context, 1, memAddress(srcNames));
            return srcNames.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alDeleteSources ] ---

    /** {@code ALvoid alDeleteSources(ALsizei n, ALuint * sources)} */
    public static void nalDeleteSources(int n, long sources) {
        long __functionAddress = AL.getICD().alDeleteSources;
        invokePV(n, sources, __functionAddress);
    }

    /** {@code ALvoid alDeleteSources(ALsizei n, ALuint * sources)} */
    @NativeType("ALvoid")
    public static void alDeleteSources(@NativeType("ALuint *") IntBuffer sources) {
        nalDeleteSources(sources.remaining(), memAddress(sources));
    }

    /** {@code ALvoid alDeleteSources(ALsizei n, ALuint * sources)} */
    @NativeType("ALvoid")
    public static void alDeleteSources(@NativeType("ALuint *") int source) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer sources = stack.ints(source);
            nalDeleteSources(1, memAddress(sources));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alDeleteSourcesDirect ] ---

    /** {@code ALvoid alDeleteSourcesDirect(ALCcontext * context, ALsizei n, ALuint * sources)} */
    public static void nalDeleteSourcesDirect(long context, int n, long sources) {
        long __functionAddress = AL.getICD().alDeleteSourcesDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, n, sources, __functionAddress);
    }

    /** {@code ALvoid alDeleteSourcesDirect(ALCcontext * context, ALsizei n, ALuint * sources)} */
    @NativeType("ALvoid")
    public static void alDeleteSourcesDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") IntBuffer sources) {
        nalDeleteSourcesDirect(context, sources.remaining(), memAddress(sources));
    }

    /** {@code ALvoid alDeleteSourcesDirect(ALCcontext * context, ALsizei n, ALuint * sources)} */
    @NativeType("ALvoid")
    public static void alDeleteSourcesDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") int source) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer sources = stack.ints(source);
            nalDeleteSourcesDirect(context, 1, memAddress(sources));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alIsSource ] ---

    /** {@code ALboolean alIsSource(ALuint sourceName)} */
    @NativeType("ALboolean")
    public static boolean alIsSource(@NativeType("ALuint") int sourceName) {
        long __functionAddress = AL.getICD().alIsSource;
        return invokeZ(sourceName, __functionAddress);
    }

    // --- [ alIsSourceDirect ] ---

    /** {@code ALboolean alIsSourceDirect(ALCcontext * context, ALuint sourceName)} */
    @NativeType("ALboolean")
    public static boolean alIsSourceDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int sourceName) {
        long __functionAddress = AL.getICD().alIsSourceDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return invokePZ(context, sourceName, __functionAddress);
    }

    // --- [ alSourcef ] ---

    /** {@code ALvoid alSourcef(ALuint source, ALenum param, ALfloat value)} */
    @NativeType("ALvoid")
    public static void alSourcef(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALfloat") float value) {
        long __functionAddress = AL.getICD().alSourcef;
        invokeV(source, param, value, __functionAddress);
    }

    // --- [ alSourcefDirect ] ---

    /** {@code ALvoid alSourcefDirect(ALCcontext * context, ALuint source, ALenum param, ALfloat value)} */
    @NativeType("ALvoid")
    public static void alSourcefDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALfloat") float value) {
        long __functionAddress = AL.getICD().alSourcefDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, source, param, value, __functionAddress);
    }

    // --- [ alSource3f ] ---

    /** {@code ALvoid alSource3f(ALuint source, ALenum param, ALfloat v1, ALfloat v2, ALfloat v3)} */
    @NativeType("ALvoid")
    public static void alSource3f(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALfloat") float v1, @NativeType("ALfloat") float v2, @NativeType("ALfloat") float v3) {
        long __functionAddress = AL.getICD().alSource3f;
        invokeV(source, param, v1, v2, v3, __functionAddress);
    }

    // --- [ alSource3fDirect ] ---

    /** {@code ALvoid alSource3fDirect(ALCcontext * context, ALuint source, ALenum param, ALfloat v1, ALfloat v2, ALfloat v3)} */
    @NativeType("ALvoid")
    public static void alSource3fDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALfloat") float v1, @NativeType("ALfloat") float v2, @NativeType("ALfloat") float v3) {
        long __functionAddress = AL.getICD().alSource3fDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, source, param, v1, v2, v3, __functionAddress);
    }

    // --- [ alSourcefv ] ---

    /** {@code ALvoid alSourcefv(ALuint source, ALenum param, ALfloat const * values)} */
    public static void nalSourcefv(int source, int param, long values) {
        long __functionAddress = AL.getICD().alSourcefv;
        invokePV(source, param, values, __functionAddress);
    }

    /** {@code ALvoid alSourcefv(ALuint source, ALenum param, ALfloat const * values)} */
    @NativeType("ALvoid")
    public static void alSourcefv(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALfloat const *") FloatBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalSourcefv(source, param, memAddress(values));
    }

    // --- [ alSourcefvDirect ] ---

    /** {@code ALvoid alSourcefvDirect(ALCcontext * context, ALuint source, ALenum param, ALfloat const * values)} */
    public static void nalSourcefvDirect(long context, int source, int param, long values) {
        long __functionAddress = AL.getICD().alSourcefvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, source, param, values, __functionAddress);
    }

    /** {@code ALvoid alSourcefvDirect(ALCcontext * context, ALuint source, ALenum param, ALfloat const * values)} */
    @NativeType("ALvoid")
    public static void alSourcefvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALfloat const *") FloatBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalSourcefvDirect(context, source, param, memAddress(values));
    }

    // --- [ alSourcei ] ---

    /** {@code ALvoid alSourcei(ALuint source, ALenum param, ALint value)} */
    @NativeType("ALvoid")
    public static void alSourcei(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint") int value) {
        long __functionAddress = AL.getICD().alSourcei;
        invokeV(source, param, value, __functionAddress);
    }

    // --- [ alSourceiDirect ] ---

    /** {@code ALvoid alSourceiDirect(ALCcontext * context, ALuint source, ALenum param, ALint value)} */
    @NativeType("ALvoid")
    public static void alSourceiDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint") int value) {
        long __functionAddress = AL.getICD().alSourceiDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, source, param, value, __functionAddress);
    }

    // --- [ alGetSourcef ] ---

    /** {@code ALvoid alGetSourcef(ALuint source, ALenum param, ALfloat * value)} */
    public static void nalGetSourcef(int source, int param, long value) {
        long __functionAddress = AL.getICD().alGetSourcef;
        invokePV(source, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetSourcef(ALuint source, ALenum param, ALfloat * value)} */
    @NativeType("ALvoid")
    public static void alGetSourcef(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetSourcef(source, param, memAddress(value));
    }

    /** {@code ALvoid alGetSourcef(ALuint source, ALenum param, ALfloat * value)} */
    @NativeType("ALvoid")
    public static float alGetSourcef(@NativeType("ALuint") int source, @NativeType("ALenum") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer value = stack.callocFloat(1);
            nalGetSourcef(source, param, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetSourcefDirect ] ---

    /** {@code ALvoid alGetSourcefDirect(ALCcontext * context, ALuint source, ALenum param, ALfloat * value)} */
    public static void nalGetSourcefDirect(long context, int source, int param, long value) {
        long __functionAddress = AL.getICD().alGetSourcefDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, source, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetSourcefDirect(ALCcontext * context, ALuint source, ALenum param, ALfloat * value)} */
    @NativeType("ALvoid")
    public static void alGetSourcefDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetSourcefDirect(context, source, param, memAddress(value));
    }

    /** {@code ALvoid alGetSourcefDirect(ALCcontext * context, ALuint source, ALenum param, ALfloat * value)} */
    @NativeType("ALvoid")
    public static float alGetSourcefDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer value = stack.callocFloat(1);
            nalGetSourcefDirect(context, source, param, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetSource3f ] ---

    /** {@code ALvoid alGetSource3f(ALuint source, ALenum param, ALfloat * v1, ALfloat * v2, ALfloat * v3)} */
    public static void nalGetSource3f(int source, int param, long v1, long v2, long v3) {
        long __functionAddress = AL.getICD().alGetSource3f;
        invokePPPV(source, param, v1, v2, v3, __functionAddress);
    }

    /** {@code ALvoid alGetSource3f(ALuint source, ALenum param, ALfloat * v1, ALfloat * v2, ALfloat * v3)} */
    @NativeType("ALvoid")
    public static void alGetSource3f(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer v1, @NativeType("ALfloat *") FloatBuffer v2, @NativeType("ALfloat *") FloatBuffer v3) {
        if (CHECKS) {
            check(v1, 1);
            check(v2, 1);
            check(v3, 1);
        }
        nalGetSource3f(source, param, memAddress(v1), memAddress(v2), memAddress(v3));
    }

    // --- [ alGetSource3fDirect ] ---

    /** {@code ALvoid alGetSource3fDirect(ALCcontext * context, ALuint source, ALenum param, ALfloat * v1, ALfloat * v2, ALfloat * v3)} */
    public static void nalGetSource3fDirect(long context, int source, int param, long v1, long v2, long v3) {
        long __functionAddress = AL.getICD().alGetSource3fDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPPPV(context, source, param, v1, v2, v3, __functionAddress);
    }

    /** {@code ALvoid alGetSource3fDirect(ALCcontext * context, ALuint source, ALenum param, ALfloat * v1, ALfloat * v2, ALfloat * v3)} */
    @NativeType("ALvoid")
    public static void alGetSource3fDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer v1, @NativeType("ALfloat *") FloatBuffer v2, @NativeType("ALfloat *") FloatBuffer v3) {
        if (CHECKS) {
            check(v1, 1);
            check(v2, 1);
            check(v3, 1);
        }
        nalGetSource3fDirect(context, source, param, memAddress(v1), memAddress(v2), memAddress(v3));
    }

    // --- [ alGetSourcefv ] ---

    /** {@code ALvoid alGetSourcefv(ALuint source, ALenum param, ALfloat * values)} */
    public static void nalGetSourcefv(int source, int param, long values) {
        long __functionAddress = AL.getICD().alGetSourcefv;
        invokePV(source, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetSourcefv(ALuint source, ALenum param, ALfloat * values)} */
    @NativeType("ALvoid")
    public static void alGetSourcefv(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetSourcefv(source, param, memAddress(values));
    }

    // --- [ alGetSourcefvDirect ] ---

    /** {@code ALvoid alGetSourcefvDirect(ALCcontext * context, ALuint source, ALenum param, ALfloat * values)} */
    public static void nalGetSourcefvDirect(long context, int source, int param, long values) {
        long __functionAddress = AL.getICD().alGetSourcefvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, source, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetSourcefvDirect(ALCcontext * context, ALuint source, ALenum param, ALfloat * values)} */
    @NativeType("ALvoid")
    public static void alGetSourcefvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALfloat *") FloatBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetSourcefvDirect(context, source, param, memAddress(values));
    }

    // --- [ alGetSourcei ] ---

    /** {@code ALvoid alGetSourcei(ALuint source, ALenum param, ALint * value)} */
    public static void nalGetSourcei(int source, int param, long value) {
        long __functionAddress = AL.getICD().alGetSourcei;
        invokePV(source, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetSourcei(ALuint source, ALenum param, ALint * value)} */
    @NativeType("ALvoid")
    public static void alGetSourcei(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetSourcei(source, param, memAddress(value));
    }

    /** {@code ALvoid alGetSourcei(ALuint source, ALenum param, ALint * value)} */
    @NativeType("ALvoid")
    public static int alGetSourcei(@NativeType("ALuint") int source, @NativeType("ALenum") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer value = stack.callocInt(1);
            nalGetSourcei(source, param, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetSourceiDirect ] ---

    /** {@code ALvoid alGetSourceiDirect(ALCcontext * context, ALuint source, ALenum param, ALint * value)} */
    public static void nalGetSourceiDirect(long context, int source, int param, long value) {
        long __functionAddress = AL.getICD().alGetSourceiDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, source, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetSourceiDirect(ALCcontext * context, ALuint source, ALenum param, ALint * value)} */
    @NativeType("ALvoid")
    public static void alGetSourceiDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetSourceiDirect(context, source, param, memAddress(value));
    }

    /** {@code ALvoid alGetSourceiDirect(ALCcontext * context, ALuint source, ALenum param, ALint * value)} */
    @NativeType("ALvoid")
    public static int alGetSourceiDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer value = stack.callocInt(1);
            nalGetSourceiDirect(context, source, param, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetSourceiv ] ---

    /** {@code ALvoid alGetSourceiv(ALuint source, ALenum param, ALint * values)} */
    public static void nalGetSourceiv(int source, int param, long values) {
        long __functionAddress = AL.getICD().alGetSourceiv;
        invokePV(source, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetSourceiv(ALuint source, ALenum param, ALint * values)} */
    @NativeType("ALvoid")
    public static void alGetSourceiv(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetSourceiv(source, param, memAddress(values));
    }

    // --- [ alGetSourceivDirect ] ---

    /** {@code ALvoid alGetSourceivDirect(ALCcontext * context, ALuint source, ALenum param, ALint * values)} */
    public static void nalGetSourceivDirect(long context, int source, int param, long values) {
        long __functionAddress = AL.getICD().alGetSourceivDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, source, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetSourceivDirect(ALCcontext * context, ALuint source, ALenum param, ALint * values)} */
    @NativeType("ALvoid")
    public static void alGetSourceivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint *") IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetSourceivDirect(context, source, param, memAddress(values));
    }

    // --- [ alSourceQueueBuffers ] ---

    /** {@code ALvoid alSourceQueueBuffers(ALuint sourceName, ALsizei numBuffers, ALuint * bufferNames)} */
    public static void nalSourceQueueBuffers(int sourceName, int numBuffers, long bufferNames) {
        long __functionAddress = AL.getICD().alSourceQueueBuffers;
        invokePV(sourceName, numBuffers, bufferNames, __functionAddress);
    }

    /** {@code ALvoid alSourceQueueBuffers(ALuint sourceName, ALsizei numBuffers, ALuint * bufferNames)} */
    @NativeType("ALvoid")
    public static void alSourceQueueBuffers(@NativeType("ALuint") int sourceName, @NativeType("ALuint *") IntBuffer bufferNames) {
        nalSourceQueueBuffers(sourceName, bufferNames.remaining(), memAddress(bufferNames));
    }

    /** {@code ALvoid alSourceQueueBuffers(ALuint sourceName, ALsizei numBuffers, ALuint * bufferNames)} */
    @NativeType("ALvoid")
    public static void alSourceQueueBuffers(@NativeType("ALuint") int sourceName, @NativeType("ALuint *") int bufferName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer bufferNames = stack.ints(bufferName);
            nalSourceQueueBuffers(sourceName, 1, memAddress(bufferNames));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alSourceQueueBuffersDirect ] ---

    /** {@code ALvoid alSourceQueueBuffersDirect(ALCcontext * context, ALuint sourceName, ALsizei numBuffers, ALuint * bufferNames)} */
    public static void nalSourceQueueBuffersDirect(long context, int sourceName, int numBuffers, long bufferNames) {
        long __functionAddress = AL.getICD().alSourceQueueBuffersDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, sourceName, numBuffers, bufferNames, __functionAddress);
    }

    /** {@code ALvoid alSourceQueueBuffersDirect(ALCcontext * context, ALuint sourceName, ALsizei numBuffers, ALuint * bufferNames)} */
    @NativeType("ALvoid")
    public static void alSourceQueueBuffersDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int sourceName, @NativeType("ALuint *") IntBuffer bufferNames) {
        nalSourceQueueBuffersDirect(context, sourceName, bufferNames.remaining(), memAddress(bufferNames));
    }

    /** {@code ALvoid alSourceQueueBuffersDirect(ALCcontext * context, ALuint sourceName, ALsizei numBuffers, ALuint * bufferNames)} */
    @NativeType("ALvoid")
    public static void alSourceQueueBuffersDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int sourceName, @NativeType("ALuint *") int bufferName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer bufferNames = stack.ints(bufferName);
            nalSourceQueueBuffersDirect(context, sourceName, 1, memAddress(bufferNames));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alSourceUnqueueBuffers ] ---

    /** {@code ALvoid alSourceUnqueueBuffers(ALuint sourceName, ALsizei numEntries, ALuint * bufferNames)} */
    public static void nalSourceUnqueueBuffers(int sourceName, int numEntries, long bufferNames) {
        long __functionAddress = AL.getICD().alSourceUnqueueBuffers;
        invokePV(sourceName, numEntries, bufferNames, __functionAddress);
    }

    /** {@code ALvoid alSourceUnqueueBuffers(ALuint sourceName, ALsizei numEntries, ALuint * bufferNames)} */
    @NativeType("ALvoid")
    public static void alSourceUnqueueBuffers(@NativeType("ALuint") int sourceName, @NativeType("ALuint *") IntBuffer bufferNames) {
        nalSourceUnqueueBuffers(sourceName, bufferNames.remaining(), memAddress(bufferNames));
    }

    /** {@code ALvoid alSourceUnqueueBuffers(ALuint sourceName, ALsizei numEntries, ALuint * bufferNames)} */
    @NativeType("ALvoid")
    public static int alSourceUnqueueBuffers(@NativeType("ALuint") int sourceName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer bufferNames = stack.callocInt(1);
            nalSourceUnqueueBuffers(sourceName, 1, memAddress(bufferNames));
            return bufferNames.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alSourceUnqueueBuffersDirect ] ---

    /** {@code ALvoid alSourceUnqueueBuffersDirect(ALCcontext * context, ALuint sourceName, ALsizei numEntries, ALuint * bufferNames)} */
    public static void nalSourceUnqueueBuffersDirect(long context, int sourceName, int numEntries, long bufferNames) {
        long __functionAddress = AL.getICD().alSourceUnqueueBuffersDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, sourceName, numEntries, bufferNames, __functionAddress);
    }

    /** {@code ALvoid alSourceUnqueueBuffersDirect(ALCcontext * context, ALuint sourceName, ALsizei numEntries, ALuint * bufferNames)} */
    @NativeType("ALvoid")
    public static void alSourceUnqueueBuffersDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int sourceName, @NativeType("ALuint *") IntBuffer bufferNames) {
        nalSourceUnqueueBuffersDirect(context, sourceName, bufferNames.remaining(), memAddress(bufferNames));
    }

    /** {@code ALvoid alSourceUnqueueBuffersDirect(ALCcontext * context, ALuint sourceName, ALsizei numEntries, ALuint * bufferNames)} */
    @NativeType("ALvoid")
    public static int alSourceUnqueueBuffersDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int sourceName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer bufferNames = stack.callocInt(1);
            nalSourceUnqueueBuffersDirect(context, sourceName, 1, memAddress(bufferNames));
            return bufferNames.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alSourcePlay ] ---

    /** {@code ALvoid alSourcePlay(ALuint source)} */
    @NativeType("ALvoid")
    public static void alSourcePlay(@NativeType("ALuint") int source) {
        long __functionAddress = AL.getICD().alSourcePlay;
        invokeV(source, __functionAddress);
    }

    // --- [ alSourcePlayDirect ] ---

    /** {@code ALvoid alSourcePlayDirect(ALCcontext * context, ALuint source)} */
    @NativeType("ALvoid")
    public static void alSourcePlayDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source) {
        long __functionAddress = AL.getICD().alSourcePlayDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, source, __functionAddress);
    }

    // --- [ alSourcePause ] ---

    /** {@code ALvoid alSourcePause(ALuint source)} */
    @NativeType("ALvoid")
    public static void alSourcePause(@NativeType("ALuint") int source) {
        long __functionAddress = AL.getICD().alSourcePause;
        invokeV(source, __functionAddress);
    }

    // --- [ alSourcePauseDirect ] ---

    /** {@code ALvoid alSourcePauseDirect(ALCcontext * context, ALuint source)} */
    @NativeType("ALvoid")
    public static void alSourcePauseDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source) {
        long __functionAddress = AL.getICD().alSourcePauseDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, source, __functionAddress);
    }

    // --- [ alSourceStop ] ---

    /** {@code ALvoid alSourceStop(ALuint source)} */
    @NativeType("ALvoid")
    public static void alSourceStop(@NativeType("ALuint") int source) {
        long __functionAddress = AL.getICD().alSourceStop;
        invokeV(source, __functionAddress);
    }

    // --- [ alSourceStopDirect ] ---

    /** {@code ALvoid alSourceStopDirect(ALCcontext * context, ALuint source)} */
    @NativeType("ALvoid")
    public static void alSourceStopDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source) {
        long __functionAddress = AL.getICD().alSourceStopDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, source, __functionAddress);
    }

    // --- [ alSourceRewind ] ---

    /** {@code ALvoid alSourceRewind(ALuint source)} */
    @NativeType("ALvoid")
    public static void alSourceRewind(@NativeType("ALuint") int source) {
        long __functionAddress = AL.getICD().alSourceRewind;
        invokeV(source, __functionAddress);
    }

    // --- [ alSourceRewindDirect ] ---

    /** {@code ALvoid alSourceRewindDirect(ALCcontext * context, ALuint source)} */
    @NativeType("ALvoid")
    public static void alSourceRewindDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source) {
        long __functionAddress = AL.getICD().alSourceRewindDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePV(context, source, __functionAddress);
    }

    // --- [ alSourcePlayv ] ---

    /** {@code ALvoid alSourcePlayv(ALsizei n, ALuint const * sources)} */
    public static void nalSourcePlayv(int n, long sources) {
        long __functionAddress = AL.getICD().alSourcePlayv;
        invokePV(n, sources, __functionAddress);
    }

    /** {@code ALvoid alSourcePlayv(ALsizei n, ALuint const * sources)} */
    @NativeType("ALvoid")
    public static void alSourcePlayv(@NativeType("ALuint const *") IntBuffer sources) {
        nalSourcePlayv(sources.remaining(), memAddress(sources));
    }

    // --- [ alSourcePlayvDirect ] ---

    /** {@code ALvoid alSourcePlayvDirect(ALCcontext * context, ALsizei n, ALuint const * sources)} */
    public static void nalSourcePlayvDirect(long context, int n, long sources) {
        long __functionAddress = AL.getICD().alSourcePlayvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, n, sources, __functionAddress);
    }

    /** {@code ALvoid alSourcePlayvDirect(ALCcontext * context, ALsizei n, ALuint const * sources)} */
    @NativeType("ALvoid")
    public static void alSourcePlayvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint const *") IntBuffer sources) {
        nalSourcePlayvDirect(context, sources.remaining(), memAddress(sources));
    }

    // --- [ alSourcePausev ] ---

    /** {@code ALvoid alSourcePausev(ALsizei n, ALuint const * sources)} */
    public static void nalSourcePausev(int n, long sources) {
        long __functionAddress = AL.getICD().alSourcePausev;
        invokePV(n, sources, __functionAddress);
    }

    /** {@code ALvoid alSourcePausev(ALsizei n, ALuint const * sources)} */
    @NativeType("ALvoid")
    public static void alSourcePausev(@NativeType("ALuint const *") IntBuffer sources) {
        nalSourcePausev(sources.remaining(), memAddress(sources));
    }

    // --- [ alSourcePausevDirect ] ---

    /** {@code ALvoid alSourcePausevDirect(ALCcontext * context, ALsizei n, ALuint const * sources)} */
    public static void nalSourcePausevDirect(long context, int n, long sources) {
        long __functionAddress = AL.getICD().alSourcePausevDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, n, sources, __functionAddress);
    }

    /** {@code ALvoid alSourcePausevDirect(ALCcontext * context, ALsizei n, ALuint const * sources)} */
    @NativeType("ALvoid")
    public static void alSourcePausevDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint const *") IntBuffer sources) {
        nalSourcePausevDirect(context, sources.remaining(), memAddress(sources));
    }

    // --- [ alSourceStopv ] ---

    /** {@code ALvoid alSourceStopv(ALsizei n, ALuint const * sources)} */
    public static void nalSourceStopv(int n, long sources) {
        long __functionAddress = AL.getICD().alSourceStopv;
        invokePV(n, sources, __functionAddress);
    }

    /** {@code ALvoid alSourceStopv(ALsizei n, ALuint const * sources)} */
    @NativeType("ALvoid")
    public static void alSourceStopv(@NativeType("ALuint const *") IntBuffer sources) {
        nalSourceStopv(sources.remaining(), memAddress(sources));
    }

    // --- [ alSourceStopvDirect ] ---

    /** {@code ALvoid alSourceStopvDirect(ALCcontext * context, ALsizei n, ALuint const * sources)} */
    public static void nalSourceStopvDirect(long context, int n, long sources) {
        long __functionAddress = AL.getICD().alSourceStopvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, n, sources, __functionAddress);
    }

    /** {@code ALvoid alSourceStopvDirect(ALCcontext * context, ALsizei n, ALuint const * sources)} */
    @NativeType("ALvoid")
    public static void alSourceStopvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint const *") IntBuffer sources) {
        nalSourceStopvDirect(context, sources.remaining(), memAddress(sources));
    }

    // --- [ alSourceRewindv ] ---

    /** {@code ALvoid alSourceRewindv(ALsizei n, ALuint const * sources)} */
    public static void nalSourceRewindv(int n, long sources) {
        long __functionAddress = AL.getICD().alSourceRewindv;
        invokePV(n, sources, __functionAddress);
    }

    /** {@code ALvoid alSourceRewindv(ALsizei n, ALuint const * sources)} */
    @NativeType("ALvoid")
    public static void alSourceRewindv(@NativeType("ALuint const *") IntBuffer sources) {
        nalSourceRewindv(sources.remaining(), memAddress(sources));
    }

    // --- [ alSourceRewindvDirect ] ---

    /** {@code ALvoid alSourceRewindvDirect(ALCcontext * context, ALsizei n, ALuint const * sources)} */
    public static void nalSourceRewindvDirect(long context, int n, long sources) {
        long __functionAddress = AL.getICD().alSourceRewindvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, n, sources, __functionAddress);
    }

    /** {@code ALvoid alSourceRewindvDirect(ALCcontext * context, ALsizei n, ALuint const * sources)} */
    @NativeType("ALvoid")
    public static void alSourceRewindvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint const *") IntBuffer sources) {
        nalSourceRewindvDirect(context, sources.remaining(), memAddress(sources));
    }

    // --- [ alGenBuffers ] ---

    /** {@code ALvoid alGenBuffers(ALsizei n, ALuint * bufferNames)} */
    public static void nalGenBuffers(int n, long bufferNames) {
        long __functionAddress = AL.getICD().alGenBuffers;
        invokePV(n, bufferNames, __functionAddress);
    }

    /** {@code ALvoid alGenBuffers(ALsizei n, ALuint * bufferNames)} */
    @NativeType("ALvoid")
    public static void alGenBuffers(@NativeType("ALuint *") IntBuffer bufferNames) {
        nalGenBuffers(bufferNames.remaining(), memAddress(bufferNames));
    }

    /** {@code ALvoid alGenBuffers(ALsizei n, ALuint * bufferNames)} */
    @NativeType("ALvoid")
    public static int alGenBuffers() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer bufferNames = stack.callocInt(1);
            nalGenBuffers(1, memAddress(bufferNames));
            return bufferNames.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGenBuffersDirect ] ---

    /** {@code ALvoid alGenBuffersDirect(ALCcontext * context, ALsizei n, ALuint * bufferNames)} */
    public static void nalGenBuffersDirect(long context, int n, long bufferNames) {
        long __functionAddress = AL.getICD().alGenBuffersDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, n, bufferNames, __functionAddress);
    }

    /** {@code ALvoid alGenBuffersDirect(ALCcontext * context, ALsizei n, ALuint * bufferNames)} */
    @NativeType("ALvoid")
    public static void alGenBuffersDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") IntBuffer bufferNames) {
        nalGenBuffersDirect(context, bufferNames.remaining(), memAddress(bufferNames));
    }

    /** {@code ALvoid alGenBuffersDirect(ALCcontext * context, ALsizei n, ALuint * bufferNames)} */
    @NativeType("ALvoid")
    public static int alGenBuffersDirect(@NativeType("ALCcontext *") long context) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer bufferNames = stack.callocInt(1);
            nalGenBuffersDirect(context, 1, memAddress(bufferNames));
            return bufferNames.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alDeleteBuffers ] ---

    /** {@code ALvoid alDeleteBuffers(ALsizei n, ALuint const * bufferNames)} */
    public static void nalDeleteBuffers(int n, long bufferNames) {
        long __functionAddress = AL.getICD().alDeleteBuffers;
        invokePV(n, bufferNames, __functionAddress);
    }

    /** {@code ALvoid alDeleteBuffers(ALsizei n, ALuint const * bufferNames)} */
    @NativeType("ALvoid")
    public static void alDeleteBuffers(@NativeType("ALuint const *") IntBuffer bufferNames) {
        nalDeleteBuffers(bufferNames.remaining(), memAddress(bufferNames));
    }

    /** {@code ALvoid alDeleteBuffers(ALsizei n, ALuint const * bufferNames)} */
    @NativeType("ALvoid")
    public static void alDeleteBuffers(@NativeType("ALuint const *") int bufferName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer bufferNames = stack.ints(bufferName);
            nalDeleteBuffers(1, memAddress(bufferNames));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alDeleteBuffersDirect ] ---

    /** {@code ALvoid alDeleteBuffersDirect(ALCcontext * context, ALsizei n, ALuint const * bufferNames)} */
    public static void nalDeleteBuffersDirect(long context, int n, long bufferNames) {
        long __functionAddress = AL.getICD().alDeleteBuffersDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, n, bufferNames, __functionAddress);
    }

    /** {@code ALvoid alDeleteBuffersDirect(ALCcontext * context, ALsizei n, ALuint const * bufferNames)} */
    @NativeType("ALvoid")
    public static void alDeleteBuffersDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint const *") IntBuffer bufferNames) {
        nalDeleteBuffersDirect(context, bufferNames.remaining(), memAddress(bufferNames));
    }

    /** {@code ALvoid alDeleteBuffersDirect(ALCcontext * context, ALsizei n, ALuint const * bufferNames)} */
    @NativeType("ALvoid")
    public static void alDeleteBuffersDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint const *") int bufferName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer bufferNames = stack.ints(bufferName);
            nalDeleteBuffersDirect(context, 1, memAddress(bufferNames));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alIsBuffer ] ---

    /** {@code ALboolean alIsBuffer(ALuint bufferName)} */
    @NativeType("ALboolean")
    public static boolean alIsBuffer(@NativeType("ALuint") int bufferName) {
        long __functionAddress = AL.getICD().alIsBuffer;
        return invokeZ(bufferName, __functionAddress);
    }

    // --- [ alIsBufferDirect ] ---

    /** {@code ALboolean alIsBufferDirect(ALCcontext * context, ALuint bufferName)} */
    @NativeType("ALboolean")
    public static boolean alIsBufferDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int bufferName) {
        long __functionAddress = AL.getICD().alIsBufferDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return invokePZ(context, bufferName, __functionAddress);
    }

    // --- [ alGetBufferf ] ---

    /** {@code ALvoid alGetBufferf(ALuint bufferName, ALenum paramName, ALfloat * value)} */
    public static void nalGetBufferf(int bufferName, int paramName, long value) {
        long __functionAddress = AL.getICD().alGetBufferf;
        invokePV(bufferName, paramName, value, __functionAddress);
    }

    /** {@code ALvoid alGetBufferf(ALuint bufferName, ALenum paramName, ALfloat * value)} */
    @NativeType("ALvoid")
    public static void alGetBufferf(@NativeType("ALuint") int bufferName, @NativeType("ALenum") int paramName, @NativeType("ALfloat *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetBufferf(bufferName, paramName, memAddress(value));
    }

    /** {@code ALvoid alGetBufferf(ALuint bufferName, ALenum paramName, ALfloat * value)} */
    @NativeType("ALvoid")
    public static float alGetBufferf(@NativeType("ALuint") int bufferName, @NativeType("ALenum") int paramName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer value = stack.callocFloat(1);
            nalGetBufferf(bufferName, paramName, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetBufferfDirect ] ---

    /** {@code ALvoid alGetBufferfDirect(ALCcontext * context, ALuint bufferName, ALenum paramName, ALfloat * value)} */
    public static void nalGetBufferfDirect(long context, int bufferName, int paramName, long value) {
        long __functionAddress = AL.getICD().alGetBufferfDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, bufferName, paramName, value, __functionAddress);
    }

    /** {@code ALvoid alGetBufferfDirect(ALCcontext * context, ALuint bufferName, ALenum paramName, ALfloat * value)} */
    @NativeType("ALvoid")
    public static void alGetBufferfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int bufferName, @NativeType("ALenum") int paramName, @NativeType("ALfloat *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetBufferfDirect(context, bufferName, paramName, memAddress(value));
    }

    /** {@code ALvoid alGetBufferfDirect(ALCcontext * context, ALuint bufferName, ALenum paramName, ALfloat * value)} */
    @NativeType("ALvoid")
    public static float alGetBufferfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int bufferName, @NativeType("ALenum") int paramName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer value = stack.callocFloat(1);
            nalGetBufferfDirect(context, bufferName, paramName, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetBufferi ] ---

    /** {@code ALvoid alGetBufferi(ALuint bufferName, ALenum paramName, ALint * value)} */
    public static void nalGetBufferi(int bufferName, int paramName, long value) {
        long __functionAddress = AL.getICD().alGetBufferi;
        invokePV(bufferName, paramName, value, __functionAddress);
    }

    /** {@code ALvoid alGetBufferi(ALuint bufferName, ALenum paramName, ALint * value)} */
    @NativeType("ALvoid")
    public static void alGetBufferi(@NativeType("ALuint") int bufferName, @NativeType("ALenum") int paramName, @NativeType("ALint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetBufferi(bufferName, paramName, memAddress(value));
    }

    /** {@code ALvoid alGetBufferi(ALuint bufferName, ALenum paramName, ALint * value)} */
    @NativeType("ALvoid")
    public static int alGetBufferi(@NativeType("ALuint") int bufferName, @NativeType("ALenum") int paramName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer value = stack.callocInt(1);
            nalGetBufferi(bufferName, paramName, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetBufferiDirect ] ---

    /** {@code ALvoid alGetBufferiDirect(ALCcontext * context, ALuint bufferName, ALenum paramName, ALint * value)} */
    public static void nalGetBufferiDirect(long context, int bufferName, int paramName, long value) {
        long __functionAddress = AL.getICD().alGetBufferiDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, bufferName, paramName, value, __functionAddress);
    }

    /** {@code ALvoid alGetBufferiDirect(ALCcontext * context, ALuint bufferName, ALenum paramName, ALint * value)} */
    @NativeType("ALvoid")
    public static void alGetBufferiDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int bufferName, @NativeType("ALenum") int paramName, @NativeType("ALint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalGetBufferiDirect(context, bufferName, paramName, memAddress(value));
    }

    /** {@code ALvoid alGetBufferiDirect(ALCcontext * context, ALuint bufferName, ALenum paramName, ALint * value)} */
    @NativeType("ALvoid")
    public static int alGetBufferiDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int bufferName, @NativeType("ALenum") int paramName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer value = stack.callocInt(1);
            nalGetBufferiDirect(context, bufferName, paramName, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alBufferData ] ---

    /** {@code ALvoid alBufferData(ALuint bufferName, ALenum format, ALvoid const * data, ALsizei size, ALsizei frequency)} */
    public static void nalBufferData(int bufferName, int format, long data, int size, int frequency) {
        long __functionAddress = AL.getICD().alBufferData;
        invokePV(bufferName, format, data, size, frequency, __functionAddress);
    }

    /** {@code ALvoid alBufferData(ALuint bufferName, ALenum format, ALvoid const * data, ALsizei size, ALsizei frequency)} */
    @NativeType("ALvoid")
    public static void alBufferData(@NativeType("ALuint") int bufferName, @NativeType("ALenum") int format, @NativeType("ALvoid const *") ByteBuffer data, @NativeType("ALsizei") int frequency) {
        nalBufferData(bufferName, format, memAddress(data), data.remaining(), frequency);
    }

    /** {@code ALvoid alBufferData(ALuint bufferName, ALenum format, ALvoid const * data, ALsizei size, ALsizei frequency)} */
    @NativeType("ALvoid")
    public static void alBufferData(@NativeType("ALuint") int bufferName, @NativeType("ALenum") int format, @NativeType("ALvoid const *") ShortBuffer data, @NativeType("ALsizei") int frequency) {
        nalBufferData(bufferName, format, memAddress(data), data.remaining() << 1, frequency);
    }

    /** {@code ALvoid alBufferData(ALuint bufferName, ALenum format, ALvoid const * data, ALsizei size, ALsizei frequency)} */
    @NativeType("ALvoid")
    public static void alBufferData(@NativeType("ALuint") int bufferName, @NativeType("ALenum") int format, @NativeType("ALvoid const *") IntBuffer data, @NativeType("ALsizei") int frequency) {
        nalBufferData(bufferName, format, memAddress(data), data.remaining() << 2, frequency);
    }

    /** {@code ALvoid alBufferData(ALuint bufferName, ALenum format, ALvoid const * data, ALsizei size, ALsizei frequency)} */
    @NativeType("ALvoid")
    public static void alBufferData(@NativeType("ALuint") int bufferName, @NativeType("ALenum") int format, @NativeType("ALvoid const *") FloatBuffer data, @NativeType("ALsizei") int frequency) {
        nalBufferData(bufferName, format, memAddress(data), data.remaining() << 2, frequency);
    }

    // --- [ alBufferDataDirect ] ---

    /** {@code ALvoid alBufferDataDirect(ALCcontext * context, ALuint bufferName, ALenum format, ALvoid const * data, ALsizei size, ALsizei frequency)} */
    public static void nalBufferDataDirect(long context, int bufferName, int format, long data, int size, int frequency) {
        long __functionAddress = AL.getICD().alBufferDataDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, bufferName, format, data, size, frequency, __functionAddress);
    }

    /** {@code ALvoid alBufferDataDirect(ALCcontext * context, ALuint bufferName, ALenum format, ALvoid const * data, ALsizei size, ALsizei frequency)} */
    @NativeType("ALvoid")
    public static void alBufferDataDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int bufferName, @NativeType("ALenum") int format, @NativeType("ALvoid const *") ByteBuffer data, @NativeType("ALsizei") int frequency) {
        nalBufferDataDirect(context, bufferName, format, memAddress(data), data.remaining(), frequency);
    }

    /** {@code ALvoid alBufferDataDirect(ALCcontext * context, ALuint bufferName, ALenum format, ALvoid const * data, ALsizei size, ALsizei frequency)} */
    @NativeType("ALvoid")
    public static void alBufferDataDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int bufferName, @NativeType("ALenum") int format, @NativeType("ALvoid const *") ShortBuffer data, @NativeType("ALsizei") int frequency) {
        nalBufferDataDirect(context, bufferName, format, memAddress(data), data.remaining() << 1, frequency);
    }

    /** {@code ALvoid alBufferDataDirect(ALCcontext * context, ALuint bufferName, ALenum format, ALvoid const * data, ALsizei size, ALsizei frequency)} */
    @NativeType("ALvoid")
    public static void alBufferDataDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int bufferName, @NativeType("ALenum") int format, @NativeType("ALvoid const *") IntBuffer data, @NativeType("ALsizei") int frequency) {
        nalBufferDataDirect(context, bufferName, format, memAddress(data), data.remaining() << 2, frequency);
    }

    /** {@code ALvoid alBufferDataDirect(ALCcontext * context, ALuint bufferName, ALenum format, ALvoid const * data, ALsizei size, ALsizei frequency)} */
    @NativeType("ALvoid")
    public static void alBufferDataDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int bufferName, @NativeType("ALenum") int format, @NativeType("ALvoid const *") FloatBuffer data, @NativeType("ALsizei") int frequency) {
        nalBufferDataDirect(context, bufferName, format, memAddress(data), data.remaining() << 2, frequency);
    }

    // --- [ alGetEnumValue ] ---

    /** {@code ALenum alGetEnumValue(ALchar const * enumName)} */
    public static int nalGetEnumValue(long enumName) {
        long __functionAddress = AL.getICD().alGetEnumValue;
        return invokePI(enumName, __functionAddress);
    }

    /** {@code ALenum alGetEnumValue(ALchar const * enumName)} */
    @NativeType("ALenum")
    public static int alGetEnumValue(@NativeType("ALchar const *") ByteBuffer enumName) {
        if (CHECKS) {
            checkNT1(enumName);
        }
        return nalGetEnumValue(memAddress(enumName));
    }

    /** {@code ALenum alGetEnumValue(ALchar const * enumName)} */
    @NativeType("ALenum")
    public static int alGetEnumValue(@NativeType("ALchar const *") CharSequence enumName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(enumName, true);
            long enumNameEncoded = stack.getPointerAddress();
            return nalGetEnumValue(enumNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetEnumValueDirect ] ---

    /** {@code ALenum alGetEnumValueDirect(ALCcontext * context, ALchar const * enumName)} */
    public static int nalGetEnumValueDirect(long context, long enumName) {
        long __functionAddress = AL.getICD().alGetEnumValueDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return invokePPI(context, enumName, __functionAddress);
    }

    /** {@code ALenum alGetEnumValueDirect(ALCcontext * context, ALchar const * enumName)} */
    @NativeType("ALenum")
    public static int alGetEnumValueDirect(@NativeType("ALCcontext *") long context, @NativeType("ALchar const *") ByteBuffer enumName) {
        if (CHECKS) {
            checkNT1(enumName);
        }
        return nalGetEnumValueDirect(context, memAddress(enumName));
    }

    /** {@code ALenum alGetEnumValueDirect(ALCcontext * context, ALchar const * enumName)} */
    @NativeType("ALenum")
    public static int alGetEnumValueDirect(@NativeType("ALCcontext *") long context, @NativeType("ALchar const *") CharSequence enumName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(enumName, true);
            long enumNameEncoded = stack.getPointerAddress();
            return nalGetEnumValueDirect(context, enumNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetProcAddress ] ---

    /** {@code ALvoid * alGetProcAddress(ALchar const * funcName)} */
    public static long nalGetProcAddress(long funcName) {
        long __functionAddress = AL.getICD().alGetProcAddress;
        return invokePP(funcName, __functionAddress);
    }

    /** {@code ALvoid * alGetProcAddress(ALchar const * funcName)} */
    @NativeType("ALvoid *")
    public static long alGetProcAddress(@NativeType("ALchar const *") ByteBuffer funcName) {
        if (CHECKS) {
            checkNT1(funcName);
        }
        return nalGetProcAddress(memAddress(funcName));
    }

    /** {@code ALvoid * alGetProcAddress(ALchar const * funcName)} */
    @NativeType("ALvoid *")
    public static long alGetProcAddress(@NativeType("ALchar const *") CharSequence funcName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(funcName, true);
            long funcNameEncoded = stack.getPointerAddress();
            return nalGetProcAddress(funcNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetProcAddressDirect ] ---

    /** {@code ALvoid * alGetProcAddressDirect(ALCcontext * context, ALchar const * funcName)} */
    public static long nalGetProcAddressDirect(long context, long funcName) {
        long __functionAddress = AL.getICD().alGetProcAddressDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return invokePPP(context, funcName, __functionAddress);
    }

    /** {@code ALvoid * alGetProcAddressDirect(ALCcontext * context, ALchar const * funcName)} */
    @NativeType("ALvoid *")
    public static long alGetProcAddressDirect(@NativeType("ALCcontext *") long context, @NativeType("ALchar const *") ByteBuffer funcName) {
        if (CHECKS) {
            checkNT1(funcName);
        }
        return nalGetProcAddressDirect(context, memAddress(funcName));
    }

    /** {@code ALvoid * alGetProcAddressDirect(ALCcontext * context, ALchar const * funcName)} */
    @NativeType("ALvoid *")
    public static long alGetProcAddressDirect(@NativeType("ALCcontext *") long context, @NativeType("ALchar const *") CharSequence funcName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(funcName, true);
            long funcNameEncoded = stack.getPointerAddress();
            return nalGetProcAddressDirect(context, funcNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alIsExtensionPresent ] ---

    /** {@code ALCboolean alIsExtensionPresent(ALchar const * extName)} */
    public static boolean nalIsExtensionPresent(long extName) {
        long __functionAddress = AL.getICD().alIsExtensionPresent;
        return invokePZ(extName, __functionAddress);
    }

    /** {@code ALCboolean alIsExtensionPresent(ALchar const * extName)} */
    @NativeType("ALCboolean")
    public static boolean alIsExtensionPresent(@NativeType("ALchar const *") ByteBuffer extName) {
        if (CHECKS) {
            checkNT1(extName);
        }
        return nalIsExtensionPresent(memAddress(extName));
    }

    /** {@code ALCboolean alIsExtensionPresent(ALchar const * extName)} */
    @NativeType("ALCboolean")
    public static boolean alIsExtensionPresent(@NativeType("ALchar const *") CharSequence extName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(extName, true);
            long extNameEncoded = stack.getPointerAddress();
            return nalIsExtensionPresent(extNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alIsExtensionPresentDirect ] ---

    /** {@code ALCboolean alIsExtensionPresentDirect(ALCcontext * context, ALchar const * extName)} */
    public static boolean nalIsExtensionPresentDirect(long context, long extName) {
        long __functionAddress = AL.getICD().alIsExtensionPresentDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return invokePPZ(context, extName, __functionAddress);
    }

    /** {@code ALCboolean alIsExtensionPresentDirect(ALCcontext * context, ALchar const * extName)} */
    @NativeType("ALCboolean")
    public static boolean alIsExtensionPresentDirect(@NativeType("ALCcontext *") long context, @NativeType("ALchar const *") ByteBuffer extName) {
        if (CHECKS) {
            checkNT1(extName);
        }
        return nalIsExtensionPresentDirect(context, memAddress(extName));
    }

    /** {@code ALCboolean alIsExtensionPresentDirect(ALCcontext * context, ALchar const * extName)} */
    @NativeType("ALCboolean")
    public static boolean alIsExtensionPresentDirect(@NativeType("ALCcontext *") long context, @NativeType("ALchar const *") CharSequence extName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(extName, true);
            long extNameEncoded = stack.getPointerAddress();
            return nalIsExtensionPresentDirect(context, extNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code ALvoid alGetIntegerv(ALenum paramName, ALint * dest)} */
    @NativeType("ALvoid")
    public static void alGetIntegerv(@NativeType("ALenum") int paramName, @NativeType("ALint *") int[] dest) {
        long __functionAddress = AL.getICD().alGetIntegerv;
        if (CHECKS) {
            check(dest, 1);
        }
        invokePV(paramName, dest, __functionAddress);
    }

    /** {@code ALvoid alGetIntegervDirect(ALCcontext * context, ALenum paramName, ALint * dest)} */
    @NativeType("ALvoid")
    public static void alGetIntegervDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName, @NativeType("ALint *") int[] dest) {
        long __functionAddress = AL.getICD().alGetIntegervDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(dest, 1);
        }
        invokePPV(context, paramName, dest, __functionAddress);
    }

    /** {@code ALvoid alGetFloatv(ALenum paramName, ALfloat * dest)} */
    @NativeType("ALvoid")
    public static void alGetFloatv(@NativeType("ALenum") int paramName, @NativeType("ALfloat *") float[] dest) {
        long __functionAddress = AL.getICD().alGetFloatv;
        if (CHECKS) {
            check(dest, 1);
        }
        invokePV(paramName, dest, __functionAddress);
    }

    /** {@code ALvoid alGetFloatvDirect(ALCcontext * context, ALenum paramName, ALfloat * dest)} */
    @NativeType("ALvoid")
    public static void alGetFloatvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName, @NativeType("ALfloat *") float[] dest) {
        long __functionAddress = AL.getICD().alGetFloatvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(dest, 1);
        }
        invokePPV(context, paramName, dest, __functionAddress);
    }

    /** {@code ALvoid alGetDoublev(ALenum paramName, ALdouble * dest)} */
    @NativeType("ALvoid")
    public static void alGetDoublev(@NativeType("ALenum") int paramName, @NativeType("ALdouble *") double[] dest) {
        long __functionAddress = AL.getICD().alGetDoublev;
        if (CHECKS) {
            check(dest, 1);
        }
        invokePV(paramName, dest, __functionAddress);
    }

    /** {@code ALvoid alGetDoublevDirect(ALCcontext * context, ALenum paramName, ALdouble * dest)} */
    @NativeType("ALvoid")
    public static void alGetDoublevDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName, @NativeType("ALdouble *") double[] dest) {
        long __functionAddress = AL.getICD().alGetDoublevDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(dest, 1);
        }
        invokePPV(context, paramName, dest, __functionAddress);
    }

    /** {@code ALvoid alListenerfv(ALenum paramName, ALfloat const * values)} */
    @NativeType("ALvoid")
    public static void alListenerfv(@NativeType("ALenum") int paramName, @NativeType("ALfloat const *") float[] values) {
        long __functionAddress = AL.getICD().alListenerfv;
        if (CHECKS) {
            check(values, 1);
        }
        invokePV(paramName, values, __functionAddress);
    }

    /** {@code ALvoid alListenerfvDirect(ALCcontext * context, ALenum paramName, ALfloat const * values)} */
    @NativeType("ALvoid")
    public static void alListenerfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName, @NativeType("ALfloat const *") float[] values) {
        long __functionAddress = AL.getICD().alListenerfvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(values, 1);
        }
        invokePPV(context, paramName, values, __functionAddress);
    }

    /** {@code ALvoid alGetListenerf(ALenum paramName, ALfloat * value)} */
    @NativeType("ALvoid")
    public static void alGetListenerf(@NativeType("ALenum") int paramName, @NativeType("ALfloat *") float[] value) {
        long __functionAddress = AL.getICD().alGetListenerf;
        if (CHECKS) {
            check(value, 1);
        }
        invokePV(paramName, value, __functionAddress);
    }

    /** {@code ALvoid alGetListenerfDirect(ALCcontext * context, ALenum paramName, ALfloat * value)} */
    @NativeType("ALvoid")
    public static void alGetListenerfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName, @NativeType("ALfloat *") float[] value) {
        long __functionAddress = AL.getICD().alGetListenerfDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value, 1);
        }
        invokePPV(context, paramName, value, __functionAddress);
    }

    /** {@code ALvoid alGetListeneri(ALenum paramName, ALint * value)} */
    @NativeType("ALvoid")
    public static void alGetListeneri(@NativeType("ALenum") int paramName, @NativeType("ALint *") int[] value) {
        long __functionAddress = AL.getICD().alGetListeneri;
        if (CHECKS) {
            check(value, 1);
        }
        invokePV(paramName, value, __functionAddress);
    }

    /** {@code ALvoid alGetListeneriDirect(ALCcontext * context, ALenum paramName, ALint * value)} */
    @NativeType("ALvoid")
    public static void alGetListeneriDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName, @NativeType("ALint *") int[] value) {
        long __functionAddress = AL.getICD().alGetListeneriDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value, 1);
        }
        invokePPV(context, paramName, value, __functionAddress);
    }

    /** {@code ALvoid alGetListener3f(ALenum paramName, ALfloat * value1, ALfloat * value2, ALfloat * value3)} */
    @NativeType("ALvoid")
    public static void alGetListener3f(@NativeType("ALenum") int paramName, @NativeType("ALfloat *") float[] value1, @NativeType("ALfloat *") float[] value2, @NativeType("ALfloat *") float[] value3) {
        long __functionAddress = AL.getICD().alGetListener3f;
        if (CHECKS) {
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        invokePPPV(paramName, value1, value2, value3, __functionAddress);
    }

    /** {@code ALvoid alGetListener3fDirect(ALCcontext * context, ALenum paramName, ALfloat * value1, ALfloat * value2, ALfloat * value3)} */
    @NativeType("ALvoid")
    public static void alGetListener3fDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName, @NativeType("ALfloat *") float[] value1, @NativeType("ALfloat *") float[] value2, @NativeType("ALfloat *") float[] value3) {
        long __functionAddress = AL.getICD().alGetListener3fDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value1, 1);
            check(value2, 1);
            check(value3, 1);
        }
        invokePPPPV(context, paramName, value1, value2, value3, __functionAddress);
    }

    /** {@code ALvoid alGetListenerfv(ALenum paramName, ALfloat * values)} */
    @NativeType("ALvoid")
    public static void alGetListenerfv(@NativeType("ALenum") int paramName, @NativeType("ALfloat *") float[] values) {
        long __functionAddress = AL.getICD().alGetListenerfv;
        if (CHECKS) {
            check(values, 1);
        }
        invokePV(paramName, values, __functionAddress);
    }

    /** {@code ALvoid alGetListenerfvDirect(ALCcontext * context, ALenum paramName, ALfloat * values)} */
    @NativeType("ALvoid")
    public static void alGetListenerfvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALenum") int paramName, @NativeType("ALfloat *") float[] values) {
        long __functionAddress = AL.getICD().alGetListenerfvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(values, 1);
        }
        invokePPV(context, paramName, values, __functionAddress);
    }

    /** {@code ALvoid alGenSources(ALsizei n, ALuint * srcNames)} */
    @NativeType("ALvoid")
    public static void alGenSources(@NativeType("ALuint *") int[] srcNames) {
        long __functionAddress = AL.getICD().alGenSources;
        invokePV(srcNames.length, srcNames, __functionAddress);
    }

    /** {@code ALvoid alGenSourcesDirect(ALCcontext * context, ALsizei n, ALuint * srcNames)} */
    @NativeType("ALvoid")
    public static void alGenSourcesDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") int[] srcNames) {
        long __functionAddress = AL.getICD().alGenSourcesDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, srcNames.length, srcNames, __functionAddress);
    }

    /** {@code ALvoid alDeleteSources(ALsizei n, ALuint * sources)} */
    @NativeType("ALvoid")
    public static void alDeleteSources(@NativeType("ALuint *") int[] sources) {
        long __functionAddress = AL.getICD().alDeleteSources;
        invokePV(sources.length, sources, __functionAddress);
    }

    /** {@code ALvoid alDeleteSourcesDirect(ALCcontext * context, ALsizei n, ALuint * sources)} */
    @NativeType("ALvoid")
    public static void alDeleteSourcesDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") int[] sources) {
        long __functionAddress = AL.getICD().alDeleteSourcesDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, sources.length, sources, __functionAddress);
    }

    /** {@code ALvoid alSourcefv(ALuint source, ALenum param, ALfloat const * values)} */
    @NativeType("ALvoid")
    public static void alSourcefv(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALfloat const *") float[] values) {
        long __functionAddress = AL.getICD().alSourcefv;
        if (CHECKS) {
            check(values, 1);
        }
        invokePV(source, param, values, __functionAddress);
    }

    /** {@code ALvoid alSourcefvDirect(ALCcontext * context, ALuint source, ALenum param, ALfloat const * values)} */
    @NativeType("ALvoid")
    public static void alSourcefvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALfloat const *") float[] values) {
        long __functionAddress = AL.getICD().alSourcefvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(values, 1);
        }
        invokePPV(context, source, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetSourcef(ALuint source, ALenum param, ALfloat * value)} */
    @NativeType("ALvoid")
    public static void alGetSourcef(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] value) {
        long __functionAddress = AL.getICD().alGetSourcef;
        if (CHECKS) {
            check(value, 1);
        }
        invokePV(source, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetSourcefDirect(ALCcontext * context, ALuint source, ALenum param, ALfloat * value)} */
    @NativeType("ALvoid")
    public static void alGetSourcefDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] value) {
        long __functionAddress = AL.getICD().alGetSourcefDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value, 1);
        }
        invokePPV(context, source, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetSource3f(ALuint source, ALenum param, ALfloat * v1, ALfloat * v2, ALfloat * v3)} */
    @NativeType("ALvoid")
    public static void alGetSource3f(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] v1, @NativeType("ALfloat *") float[] v2, @NativeType("ALfloat *") float[] v3) {
        long __functionAddress = AL.getICD().alGetSource3f;
        if (CHECKS) {
            check(v1, 1);
            check(v2, 1);
            check(v3, 1);
        }
        invokePPPV(source, param, v1, v2, v3, __functionAddress);
    }

    /** {@code ALvoid alGetSource3fDirect(ALCcontext * context, ALuint source, ALenum param, ALfloat * v1, ALfloat * v2, ALfloat * v3)} */
    @NativeType("ALvoid")
    public static void alGetSource3fDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] v1, @NativeType("ALfloat *") float[] v2, @NativeType("ALfloat *") float[] v3) {
        long __functionAddress = AL.getICD().alGetSource3fDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(v1, 1);
            check(v2, 1);
            check(v3, 1);
        }
        invokePPPPV(context, source, param, v1, v2, v3, __functionAddress);
    }

    /** {@code ALvoid alGetSourcefv(ALuint source, ALenum param, ALfloat * values)} */
    @NativeType("ALvoid")
    public static void alGetSourcefv(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] values) {
        long __functionAddress = AL.getICD().alGetSourcefv;
        if (CHECKS) {
            check(values, 1);
        }
        invokePV(source, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetSourcefvDirect(ALCcontext * context, ALuint source, ALenum param, ALfloat * values)} */
    @NativeType("ALvoid")
    public static void alGetSourcefvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALfloat *") float[] values) {
        long __functionAddress = AL.getICD().alGetSourcefvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(values, 1);
        }
        invokePPV(context, source, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetSourcei(ALuint source, ALenum param, ALint * value)} */
    @NativeType("ALvoid")
    public static void alGetSourcei(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint *") int[] value) {
        long __functionAddress = AL.getICD().alGetSourcei;
        if (CHECKS) {
            check(value, 1);
        }
        invokePV(source, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetSourceiDirect(ALCcontext * context, ALuint source, ALenum param, ALint * value)} */
    @NativeType("ALvoid")
    public static void alGetSourceiDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint *") int[] value) {
        long __functionAddress = AL.getICD().alGetSourceiDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value, 1);
        }
        invokePPV(context, source, param, value, __functionAddress);
    }

    /** {@code ALvoid alGetSourceiv(ALuint source, ALenum param, ALint * values)} */
    @NativeType("ALvoid")
    public static void alGetSourceiv(@NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint *") int[] values) {
        long __functionAddress = AL.getICD().alGetSourceiv;
        if (CHECKS) {
            check(values, 1);
        }
        invokePV(source, param, values, __functionAddress);
    }

    /** {@code ALvoid alGetSourceivDirect(ALCcontext * context, ALuint source, ALenum param, ALint * values)} */
    @NativeType("ALvoid")
    public static void alGetSourceivDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int source, @NativeType("ALenum") int param, @NativeType("ALint *") int[] values) {
        long __functionAddress = AL.getICD().alGetSourceivDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(values, 1);
        }
        invokePPV(context, source, param, values, __functionAddress);
    }

    /** {@code ALvoid alSourceQueueBuffers(ALuint sourceName, ALsizei numBuffers, ALuint * bufferNames)} */
    @NativeType("ALvoid")
    public static void alSourceQueueBuffers(@NativeType("ALuint") int sourceName, @NativeType("ALuint *") int[] bufferNames) {
        long __functionAddress = AL.getICD().alSourceQueueBuffers;
        invokePV(sourceName, bufferNames.length, bufferNames, __functionAddress);
    }

    /** {@code ALvoid alSourceQueueBuffersDirect(ALCcontext * context, ALuint sourceName, ALsizei numBuffers, ALuint * bufferNames)} */
    @NativeType("ALvoid")
    public static void alSourceQueueBuffersDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int sourceName, @NativeType("ALuint *") int[] bufferNames) {
        long __functionAddress = AL.getICD().alSourceQueueBuffersDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, sourceName, bufferNames.length, bufferNames, __functionAddress);
    }

    /** {@code ALvoid alSourceUnqueueBuffers(ALuint sourceName, ALsizei numEntries, ALuint * bufferNames)} */
    @NativeType("ALvoid")
    public static void alSourceUnqueueBuffers(@NativeType("ALuint") int sourceName, @NativeType("ALuint *") int[] bufferNames) {
        long __functionAddress = AL.getICD().alSourceUnqueueBuffers;
        invokePV(sourceName, bufferNames.length, bufferNames, __functionAddress);
    }

    /** {@code ALvoid alSourceUnqueueBuffersDirect(ALCcontext * context, ALuint sourceName, ALsizei numEntries, ALuint * bufferNames)} */
    @NativeType("ALvoid")
    public static void alSourceUnqueueBuffersDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int sourceName, @NativeType("ALuint *") int[] bufferNames) {
        long __functionAddress = AL.getICD().alSourceUnqueueBuffersDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, sourceName, bufferNames.length, bufferNames, __functionAddress);
    }

    /** {@code ALvoid alSourcePlayv(ALsizei n, ALuint const * sources)} */
    @NativeType("ALvoid")
    public static void alSourcePlayv(@NativeType("ALuint const *") int[] sources) {
        long __functionAddress = AL.getICD().alSourcePlayv;
        invokePV(sources.length, sources, __functionAddress);
    }

    /** {@code ALvoid alSourcePlayvDirect(ALCcontext * context, ALsizei n, ALuint const * sources)} */
    @NativeType("ALvoid")
    public static void alSourcePlayvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint const *") int[] sources) {
        long __functionAddress = AL.getICD().alSourcePlayvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, sources.length, sources, __functionAddress);
    }

    /** {@code ALvoid alSourcePausev(ALsizei n, ALuint const * sources)} */
    @NativeType("ALvoid")
    public static void alSourcePausev(@NativeType("ALuint const *") int[] sources) {
        long __functionAddress = AL.getICD().alSourcePausev;
        invokePV(sources.length, sources, __functionAddress);
    }

    /** {@code ALvoid alSourcePausevDirect(ALCcontext * context, ALsizei n, ALuint const * sources)} */
    @NativeType("ALvoid")
    public static void alSourcePausevDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint const *") int[] sources) {
        long __functionAddress = AL.getICD().alSourcePausevDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, sources.length, sources, __functionAddress);
    }

    /** {@code ALvoid alSourceStopv(ALsizei n, ALuint const * sources)} */
    @NativeType("ALvoid")
    public static void alSourceStopv(@NativeType("ALuint const *") int[] sources) {
        long __functionAddress = AL.getICD().alSourceStopv;
        invokePV(sources.length, sources, __functionAddress);
    }

    /** {@code ALvoid alSourceStopvDirect(ALCcontext * context, ALsizei n, ALuint const * sources)} */
    @NativeType("ALvoid")
    public static void alSourceStopvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint const *") int[] sources) {
        long __functionAddress = AL.getICD().alSourceStopvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, sources.length, sources, __functionAddress);
    }

    /** {@code ALvoid alSourceRewindv(ALsizei n, ALuint const * sources)} */
    @NativeType("ALvoid")
    public static void alSourceRewindv(@NativeType("ALuint const *") int[] sources) {
        long __functionAddress = AL.getICD().alSourceRewindv;
        invokePV(sources.length, sources, __functionAddress);
    }

    /** {@code ALvoid alSourceRewindvDirect(ALCcontext * context, ALsizei n, ALuint const * sources)} */
    @NativeType("ALvoid")
    public static void alSourceRewindvDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint const *") int[] sources) {
        long __functionAddress = AL.getICD().alSourceRewindvDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, sources.length, sources, __functionAddress);
    }

    /** {@code ALvoid alGenBuffers(ALsizei n, ALuint * bufferNames)} */
    @NativeType("ALvoid")
    public static void alGenBuffers(@NativeType("ALuint *") int[] bufferNames) {
        long __functionAddress = AL.getICD().alGenBuffers;
        invokePV(bufferNames.length, bufferNames, __functionAddress);
    }

    /** {@code ALvoid alGenBuffersDirect(ALCcontext * context, ALsizei n, ALuint * bufferNames)} */
    @NativeType("ALvoid")
    public static void alGenBuffersDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint *") int[] bufferNames) {
        long __functionAddress = AL.getICD().alGenBuffersDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, bufferNames.length, bufferNames, __functionAddress);
    }

    /** {@code ALvoid alDeleteBuffers(ALsizei n, ALuint const * bufferNames)} */
    @NativeType("ALvoid")
    public static void alDeleteBuffers(@NativeType("ALuint const *") int[] bufferNames) {
        long __functionAddress = AL.getICD().alDeleteBuffers;
        invokePV(bufferNames.length, bufferNames, __functionAddress);
    }

    /** {@code ALvoid alDeleteBuffersDirect(ALCcontext * context, ALsizei n, ALuint const * bufferNames)} */
    @NativeType("ALvoid")
    public static void alDeleteBuffersDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint const *") int[] bufferNames) {
        long __functionAddress = AL.getICD().alDeleteBuffersDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, bufferNames.length, bufferNames, __functionAddress);
    }

    /** {@code ALvoid alGetBufferf(ALuint bufferName, ALenum paramName, ALfloat * value)} */
    @NativeType("ALvoid")
    public static void alGetBufferf(@NativeType("ALuint") int bufferName, @NativeType("ALenum") int paramName, @NativeType("ALfloat *") float[] value) {
        long __functionAddress = AL.getICD().alGetBufferf;
        if (CHECKS) {
            check(value, 1);
        }
        invokePV(bufferName, paramName, value, __functionAddress);
    }

    /** {@code ALvoid alGetBufferfDirect(ALCcontext * context, ALuint bufferName, ALenum paramName, ALfloat * value)} */
    @NativeType("ALvoid")
    public static void alGetBufferfDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int bufferName, @NativeType("ALenum") int paramName, @NativeType("ALfloat *") float[] value) {
        long __functionAddress = AL.getICD().alGetBufferfDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value, 1);
        }
        invokePPV(context, bufferName, paramName, value, __functionAddress);
    }

    /** {@code ALvoid alGetBufferi(ALuint bufferName, ALenum paramName, ALint * value)} */
    @NativeType("ALvoid")
    public static void alGetBufferi(@NativeType("ALuint") int bufferName, @NativeType("ALenum") int paramName, @NativeType("ALint *") int[] value) {
        long __functionAddress = AL.getICD().alGetBufferi;
        if (CHECKS) {
            check(value, 1);
        }
        invokePV(bufferName, paramName, value, __functionAddress);
    }

    /** {@code ALvoid alGetBufferiDirect(ALCcontext * context, ALuint bufferName, ALenum paramName, ALint * value)} */
    @NativeType("ALvoid")
    public static void alGetBufferiDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int bufferName, @NativeType("ALenum") int paramName, @NativeType("ALint *") int[] value) {
        long __functionAddress = AL.getICD().alGetBufferiDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(value, 1);
        }
        invokePPV(context, bufferName, paramName, value, __functionAddress);
    }

    /** {@code ALvoid alBufferData(ALuint bufferName, ALenum format, ALvoid const * data, ALsizei size, ALsizei frequency)} */
    @NativeType("ALvoid")
    public static void alBufferData(@NativeType("ALuint") int bufferName, @NativeType("ALenum") int format, @NativeType("ALvoid const *") short[] data, @NativeType("ALsizei") int frequency) {
        long __functionAddress = AL.getICD().alBufferData;
        invokePV(bufferName, format, data, data.length << 1, frequency, __functionAddress);
    }

    /** {@code ALvoid alBufferData(ALuint bufferName, ALenum format, ALvoid const * data, ALsizei size, ALsizei frequency)} */
    @NativeType("ALvoid")
    public static void alBufferData(@NativeType("ALuint") int bufferName, @NativeType("ALenum") int format, @NativeType("ALvoid const *") int[] data, @NativeType("ALsizei") int frequency) {
        long __functionAddress = AL.getICD().alBufferData;
        invokePV(bufferName, format, data, data.length << 2, frequency, __functionAddress);
    }

    /** {@code ALvoid alBufferData(ALuint bufferName, ALenum format, ALvoid const * data, ALsizei size, ALsizei frequency)} */
    @NativeType("ALvoid")
    public static void alBufferData(@NativeType("ALuint") int bufferName, @NativeType("ALenum") int format, @NativeType("ALvoid const *") float[] data, @NativeType("ALsizei") int frequency) {
        long __functionAddress = AL.getICD().alBufferData;
        invokePV(bufferName, format, data, data.length << 2, frequency, __functionAddress);
    }

    /** {@code ALvoid alBufferDataDirect(ALCcontext * context, ALuint bufferName, ALenum format, ALvoid const * data, ALsizei size, ALsizei frequency)} */
    @NativeType("ALvoid")
    public static void alBufferDataDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int bufferName, @NativeType("ALenum") int format, @NativeType("ALvoid const *") short[] data, @NativeType("ALsizei") int frequency) {
        long __functionAddress = AL.getICD().alBufferDataDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, bufferName, format, data, data.length << 1, frequency, __functionAddress);
    }

    /** {@code ALvoid alBufferDataDirect(ALCcontext * context, ALuint bufferName, ALenum format, ALvoid const * data, ALsizei size, ALsizei frequency)} */
    @NativeType("ALvoid")
    public static void alBufferDataDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int bufferName, @NativeType("ALenum") int format, @NativeType("ALvoid const *") int[] data, @NativeType("ALsizei") int frequency) {
        long __functionAddress = AL.getICD().alBufferDataDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, bufferName, format, data, data.length << 2, frequency, __functionAddress);
    }

    /** {@code ALvoid alBufferDataDirect(ALCcontext * context, ALuint bufferName, ALenum format, ALvoid const * data, ALsizei size, ALsizei frequency)} */
    @NativeType("ALvoid")
    public static void alBufferDataDirect(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int bufferName, @NativeType("ALenum") int format, @NativeType("ALvoid const *") float[] data, @NativeType("ALsizei") int frequency) {
        long __functionAddress = AL.getICD().alBufferDataDirect;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, bufferName, format, data, data.length << 2, frequency, __functionAddress);
    }

}