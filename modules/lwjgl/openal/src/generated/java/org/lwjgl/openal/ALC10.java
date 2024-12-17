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

public class ALC10 {

    public static final int
        ALC_INVALID = 0xFFFFFFFF,
        ALC_FALSE   = 0x0,
        ALC_TRUE    = 0x1;

    public static final int
        ALC_FREQUENCY = 0x1007,
        ALC_REFRESH   = 0x1008,
        ALC_SYNC      = 0x1009;

    public static final int
        ALC_NO_ERROR        = 0x0,
        ALC_INVALID_DEVICE  = 0xA001,
        ALC_INVALID_CONTEXT = 0xA002,
        ALC_INVALID_ENUM    = 0xA003,
        ALC_INVALID_VALUE   = 0xA004,
        ALC_OUT_OF_MEMORY   = 0xA005;

    public static final int
        ALC_DEFAULT_DEVICE_SPECIFIER = 0x1004,
        ALC_DEVICE_SPECIFIER         = 0x1005,
        ALC_EXTENSIONS               = 0x1006;

    public static final int
        ALC_MAJOR_VERSION   = 0x1000,
        ALC_MINOR_VERSION   = 0x1001,
        ALC_ATTRIBUTES_SIZE = 0x1002,
        ALC_ALL_ATTRIBUTES  = 0x1003;

    protected ALC10() {
        throw new UnsupportedOperationException();
    }

    // --- [ alcOpenDevice ] ---

    /** {@code ALCdevice * alcOpenDevice(ALCchar const * deviceSpecifier)} */
    public static long nalcOpenDevice(long deviceSpecifier) {
		long __functionAddress = ALC.getICD().alcOpenDevice;
        return invokePP(deviceSpecifier, __functionAddress);
    }

    /** {@code ALCdevice * alcOpenDevice(ALCchar const * deviceSpecifier)} */
    @NativeType("ALCdevice *")
    public static long alcOpenDevice(@NativeType("ALCchar const *") @Nullable ByteBuffer deviceSpecifier) {
        if (CHECKS) {
            checkNT1Safe(deviceSpecifier);
        }
        return nalcOpenDevice(memAddressSafe(deviceSpecifier));
    }

    /** {@code ALCdevice * alcOpenDevice(ALCchar const * deviceSpecifier)} */
    @NativeType("ALCdevice *")
    public static long alcOpenDevice(@NativeType("ALCchar const *") @Nullable CharSequence deviceSpecifier) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(deviceSpecifier, true);
            long deviceSpecifierEncoded = deviceSpecifier == null ? NULL : stack.getPointerAddress();
            return nalcOpenDevice(deviceSpecifierEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alcCloseDevice ] ---

    /** {@code ALCboolean alcCloseDevice(ALCdevice const * deviceHandle)} */
    @NativeType("ALCboolean")
    public static boolean alcCloseDevice(@NativeType("ALCdevice const *") long deviceHandle) {
		long __functionAddress = ALC.getICD().alcCloseDevice;
        if (CHECKS) {
            check(deviceHandle);
        }
        return invokePZ(deviceHandle, __functionAddress);
    }

    // --- [ alcCreateContext ] ---

    /** {@code ALCcontext * alcCreateContext(ALCdevice const * deviceHandle, ALCint const * attrList)} */
    public static long nalcCreateContext(long deviceHandle, long attrList) {
		long __functionAddress = ALC.getICD().alcCreateContext;
        if (CHECKS) {
            check(deviceHandle);
        }
        return invokePPP(deviceHandle, attrList, __functionAddress);
    }

    /** {@code ALCcontext * alcCreateContext(ALCdevice const * deviceHandle, ALCint const * attrList)} */
    @NativeType("ALCcontext *")
    public static long alcCreateContext(@NativeType("ALCdevice const *") long deviceHandle, @NativeType("ALCint const *") @Nullable IntBuffer attrList) {
        if (CHECKS) {
            checkNTSafe(attrList);
        }
        return nalcCreateContext(deviceHandle, memAddressSafe(attrList));
    }

    // --- [ alcMakeContextCurrent ] ---

    /** {@code ALCboolean alcMakeContextCurrent(ALCcontext * context)} */
    @NativeType("ALCboolean")
    public static boolean alcMakeContextCurrent(@NativeType("ALCcontext *") long context) {
		long __functionAddress = ALC.getICD().alcMakeContextCurrent;
        return invokePZ(context, __functionAddress);
    }

    // --- [ alcProcessContext ] ---

    /** {@code ALCvoid alcProcessContext(ALCcontext * context)} */
    @NativeType("ALCvoid")
    public static void alcProcessContext(@NativeType("ALCcontext *") long context) {
		long __functionAddress = ALC.getICD().alcProcessContext;
        if (CHECKS) {
            check(context);
        }
        invokePV(context, __functionAddress);
    }

    // --- [ alcSuspendContext ] ---

    /** {@code ALCvoid alcSuspendContext(ALCcontext * context)} */
    @NativeType("ALCvoid")
    public static void alcSuspendContext(@NativeType("ALCcontext *") long context) {
		long __functionAddress = ALC.getICD().alcSuspendContext;
        if (CHECKS) {
            check(context);
        }
        invokePV(context, __functionAddress);
    }

    // --- [ alcDestroyContext ] ---

    /** {@code ALCvoid alcDestroyContext(ALCcontext * context)} */
    @NativeType("ALCvoid")
    public static void alcDestroyContext(@NativeType("ALCcontext *") long context) {
		long __functionAddress = ALC.getICD().alcDestroyContext;
        if (CHECKS) {
            check(context);
        }
        invokePV(context, __functionAddress);
    }

    // --- [ alcGetCurrentContext ] ---

    /** {@code ALCcontext * alcGetCurrentContext(void)} */
    @NativeType("ALCcontext *")
    public static long alcGetCurrentContext() {
		long __functionAddress = ALC.getICD().alcGetCurrentContext;
        return invokeP(__functionAddress);
    }

    // --- [ alcGetContextsDevice ] ---

    /** {@code ALCdevice * alcGetContextsDevice(ALCcontext * context)} */
    @NativeType("ALCdevice *")
    public static long alcGetContextsDevice(@NativeType("ALCcontext *") long context) {
		long __functionAddress = ALC.getICD().alcGetContextsDevice;
        if (CHECKS) {
            check(context);
        }
        return invokePP(context, __functionAddress);
    }

    // --- [ alcIsExtensionPresent ] ---

    /** {@code ALCboolean alcIsExtensionPresent(ALCdevice const * deviceHandle, ALCchar const * extName)} */
    public static boolean nalcIsExtensionPresent(long deviceHandle, long extName) {
		long __functionAddress = ALC.getICD().alcIsExtensionPresent;
        return invokePPZ(deviceHandle, extName, __functionAddress);
    }

    /** {@code ALCboolean alcIsExtensionPresent(ALCdevice const * deviceHandle, ALCchar const * extName)} */
    @NativeType("ALCboolean")
    public static boolean alcIsExtensionPresent(@NativeType("ALCdevice const *") long deviceHandle, @NativeType("ALCchar const *") ByteBuffer extName) {
        if (CHECKS) {
            checkNT1(extName);
        }
        return nalcIsExtensionPresent(deviceHandle, memAddress(extName));
    }

    /** {@code ALCboolean alcIsExtensionPresent(ALCdevice const * deviceHandle, ALCchar const * extName)} */
    @NativeType("ALCboolean")
    public static boolean alcIsExtensionPresent(@NativeType("ALCdevice const *") long deviceHandle, @NativeType("ALCchar const *") CharSequence extName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(extName, true);
            long extNameEncoded = stack.getPointerAddress();
            return nalcIsExtensionPresent(deviceHandle, extNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alcGetProcAddress ] ---

    /** {@code ALCvoid * alcGetProcAddress(ALCdevice const * deviceHandle, ALchar const * funcName)} */
    public static long nalcGetProcAddress(long deviceHandle, long funcName) {
		long __functionAddress = ALC.getICD().alcGetProcAddress;
        return invokePPP(deviceHandle, funcName, __functionAddress);
    }

    /** {@code ALCvoid * alcGetProcAddress(ALCdevice const * deviceHandle, ALchar const * funcName)} */
    @NativeType("ALCvoid *")
    public static long alcGetProcAddress(@NativeType("ALCdevice const *") long deviceHandle, @NativeType("ALchar const *") ByteBuffer funcName) {
        if (CHECKS) {
            checkNT1(funcName);
        }
        return nalcGetProcAddress(deviceHandle, memAddress(funcName));
    }

    /** {@code ALCvoid * alcGetProcAddress(ALCdevice const * deviceHandle, ALchar const * funcName)} */
    @NativeType("ALCvoid *")
    public static long alcGetProcAddress(@NativeType("ALCdevice const *") long deviceHandle, @NativeType("ALchar const *") CharSequence funcName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(funcName, true);
            long funcNameEncoded = stack.getPointerAddress();
            return nalcGetProcAddress(deviceHandle, funcNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alcGetEnumValue ] ---

    /** {@code ALCenum alcGetEnumValue(ALCdevice const * deviceHandle, ALCchar const * enumName)} */
    public static int nalcGetEnumValue(long deviceHandle, long enumName) {
		long __functionAddress = ALC.getICD().alcGetEnumValue;
        return invokePPI(deviceHandle, enumName, __functionAddress);
    }

    /** {@code ALCenum alcGetEnumValue(ALCdevice const * deviceHandle, ALCchar const * enumName)} */
    @NativeType("ALCenum")
    public static int alcGetEnumValue(@NativeType("ALCdevice const *") long deviceHandle, @NativeType("ALCchar const *") ByteBuffer enumName) {
        if (CHECKS) {
            checkNT1(enumName);
        }
        return nalcGetEnumValue(deviceHandle, memAddress(enumName));
    }

    /** {@code ALCenum alcGetEnumValue(ALCdevice const * deviceHandle, ALCchar const * enumName)} */
    @NativeType("ALCenum")
    public static int alcGetEnumValue(@NativeType("ALCdevice const *") long deviceHandle, @NativeType("ALCchar const *") CharSequence enumName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(enumName, true);
            long enumNameEncoded = stack.getPointerAddress();
            return nalcGetEnumValue(deviceHandle, enumNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alcGetError ] ---

    /** {@code ALCenum alcGetError(ALCdevice * deviceHandle)} */
    @NativeType("ALCenum")
    public static int alcGetError(@NativeType("ALCdevice *") long deviceHandle) {
		long __functionAddress = ALC.getICD().alcGetError;
        return invokePI(deviceHandle, __functionAddress);
    }

    // --- [ alcGetString ] ---

    /** {@code ALCchar const * alcGetString(ALCdevice * deviceHandle, ALCenum token)} */
    public static long nalcGetString(long deviceHandle, int token) {
		long __functionAddress = ALC.getICD().alcGetString;
        return invokePP(deviceHandle, token, __functionAddress);
    }

    /** {@code ALCchar const * alcGetString(ALCdevice * deviceHandle, ALCenum token)} */
    @NativeType("ALCchar const *")
    public static @Nullable String alcGetString(@NativeType("ALCdevice *") long deviceHandle, @NativeType("ALCenum") int token) {
        long __result = nalcGetString(deviceHandle, token);
        return memUTF8Safe(__result);
    }

    // --- [ alcGetIntegerv ] ---

    /** {@code ALCvoid alcGetIntegerv(ALCdevice * deviceHandle, ALCenum token, ALCsizei size, ALCint * dest)} */
    public static void nalcGetIntegerv(long deviceHandle, int token, int size, long dest) {
		long __functionAddress = ALC.getICD().alcGetIntegerv;
        invokePPV(deviceHandle, token, size, dest, __functionAddress);
    }

    /** {@code ALCvoid alcGetIntegerv(ALCdevice * deviceHandle, ALCenum token, ALCsizei size, ALCint * dest)} */
    @NativeType("ALCvoid")
    public static void alcGetIntegerv(@NativeType("ALCdevice *") long deviceHandle, @NativeType("ALCenum") int token, @NativeType("ALCint *") IntBuffer dest) {
        nalcGetIntegerv(deviceHandle, token, dest.remaining(), memAddress(dest));
    }

    /** {@code ALCvoid alcGetIntegerv(ALCdevice * deviceHandle, ALCenum token, ALCsizei size, ALCint * dest)} */
    @NativeType("ALCvoid")
    public static int alcGetInteger(@NativeType("ALCdevice *") long deviceHandle, @NativeType("ALCenum") int token) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer dest = stack.callocInt(1);
            nalcGetIntegerv(deviceHandle, token, 1, memAddress(dest));
            return dest.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code ALCcontext * alcCreateContext(ALCdevice const * deviceHandle, ALCint const * attrList)} */
    @NativeType("ALCcontext *")
    public static long alcCreateContext(@NativeType("ALCdevice const *") long deviceHandle, @NativeType("ALCint const *") int @Nullable [] attrList) {
		long __functionAddress = ALC.getICD().alcCreateContext;
        if (CHECKS) {
            check(deviceHandle);
            checkNTSafe(attrList);
        }
        return invokePPP(deviceHandle, attrList, __functionAddress);
    }

    /** {@code ALCvoid alcGetIntegerv(ALCdevice * deviceHandle, ALCenum token, ALCsizei size, ALCint * dest)} */
    @NativeType("ALCvoid")
    public static void alcGetIntegerv(@NativeType("ALCdevice *") long deviceHandle, @NativeType("ALCenum") int token, @NativeType("ALCint *") int[] dest) {
		long __functionAddress = ALC.getICD().alcGetIntegerv;
        invokePPV(deviceHandle, token, dest.length, dest, __functionAddress);
    }

}