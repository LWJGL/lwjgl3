/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SOFTCallbackBuffer {

    public static final int
        AL_BUFFER_CALLBACK_FUNCTION_SOFT   = 0x19A0,
        AL_BUFFER_CALLBACK_USER_PARAM_SOFT = 0x19A1;

    protected SOFTCallbackBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ alBufferCallbackSOFT ] ---

    /** {@code ALvoid alBufferCallbackSOFT(ALuint buffer, ALenum format, ALsizei freq, ALBUFFERCALLBACKTYPESOFT callback, ALvoid * userptr)} */
    public static void nalBufferCallbackSOFT(int buffer, int format, int freq, long callback, long userptr) {
        long __functionAddress = AL.getICD().alBufferCallbackSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(userptr);
        }
        invokePPV(buffer, format, freq, callback, userptr, __functionAddress);
    }

    /** {@code ALvoid alBufferCallbackSOFT(ALuint buffer, ALenum format, ALsizei freq, ALBUFFERCALLBACKTYPESOFT callback, ALvoid * userptr)} */
    @NativeType("ALvoid")
    public static void alBufferCallbackSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALsizei") int freq, @NativeType("ALBUFFERCALLBACKTYPESOFT") SOFTCallbackBufferTypeI callback, @NativeType("ALvoid *") long userptr) {
        nalBufferCallbackSOFT(buffer, format, freq, callback.address(), userptr);
    }

    // --- [ alBufferCallbackDirectSOFT ] ---

    /** {@code ALvoid alBufferCallbackDirectSOFT(ALCcontext * context, ALuint buffer, ALenum format, ALsizei freq, ALBUFFERCALLBACKTYPESOFT callback, ALvoid * userptr)} */
    public static void nalBufferCallbackDirectSOFT(long context, int buffer, int format, int freq, long callback, long userptr) {
        long __functionAddress = AL.getICD().alBufferCallbackDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(userptr);
        }
        invokePPPV(context, buffer, format, freq, callback, userptr, __functionAddress);
    }

    /** {@code ALvoid alBufferCallbackDirectSOFT(ALCcontext * context, ALuint buffer, ALenum format, ALsizei freq, ALBUFFERCALLBACKTYPESOFT callback, ALvoid * userptr)} */
    @NativeType("ALvoid")
    public static void alBufferCallbackDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int format, @NativeType("ALsizei") int freq, @NativeType("ALBUFFERCALLBACKTYPESOFT") SOFTCallbackBufferTypeI callback, @NativeType("ALvoid *") long userptr) {
        nalBufferCallbackDirectSOFT(context, buffer, format, freq, callback.address(), userptr);
    }

    // --- [ alGetBufferPtrSOFT ] ---

    /** {@code ALvoid alGetBufferPtrSOFT(ALuint buffer, ALenum param, ALvoid ** ptr)} */
    public static void nalGetBufferPtrSOFT(int buffer, int param, long ptr) {
        long __functionAddress = AL.getICD().alGetBufferPtrSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, param, ptr, __functionAddress);
    }

    /** {@code ALvoid alGetBufferPtrSOFT(ALuint buffer, ALenum param, ALvoid ** ptr)} */
    @NativeType("ALvoid")
    public static void alGetBufferPtrSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALvoid **") PointerBuffer ptr) {
        if (CHECKS) {
            check(ptr, 1);
        }
        nalGetBufferPtrSOFT(buffer, param, memAddress(ptr));
    }

    /** {@code ALvoid alGetBufferPtrSOFT(ALuint buffer, ALenum param, ALvoid ** ptr)} */
    @NativeType("ALvoid")
    public static long alGetBufferPtrSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer ptr = stack.callocPointer(1);
            nalGetBufferPtrSOFT(buffer, param, memAddress(ptr));
            return ptr.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetBufferPtrDirectSOFT ] ---

    /** {@code ALvoid alGetBufferPtrDirectSOFT(ALCcontext * context, ALuint buffer, ALenum param, ALvoid ** ptr)} */
    public static void nalGetBufferPtrDirectSOFT(long context, int buffer, int param, long ptr) {
        long __functionAddress = AL.getICD().alGetBufferPtrDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, buffer, param, ptr, __functionAddress);
    }

    /** {@code ALvoid alGetBufferPtrDirectSOFT(ALCcontext * context, ALuint buffer, ALenum param, ALvoid ** ptr)} */
    @NativeType("ALvoid")
    public static void alGetBufferPtrDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALvoid **") PointerBuffer ptr) {
        if (CHECKS) {
            check(ptr, 1);
        }
        nalGetBufferPtrDirectSOFT(context, buffer, param, memAddress(ptr));
    }

    /** {@code ALvoid alGetBufferPtrDirectSOFT(ALCcontext * context, ALuint buffer, ALenum param, ALvoid ** ptr)} */
    @NativeType("ALvoid")
    public static long alGetBufferPtrDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer ptr = stack.callocPointer(1);
            nalGetBufferPtrDirectSOFT(context, buffer, param, memAddress(ptr));
            return ptr.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ alGetBuffer3PtrSOFT ] ---

    /** {@code ALvoid alGetBuffer3PtrSOFT(ALuint buffer, ALenum param, ALvoid ** ptr0, ALvoid ** ptr1, ALvoid ** ptr2)} */
    public static void nalGetBuffer3PtrSOFT(int buffer, int param, long ptr0, long ptr1, long ptr2) {
        long __functionAddress = AL.getICD().alGetBuffer3PtrSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPPV(buffer, param, ptr0, ptr1, ptr2, __functionAddress);
    }

    /** {@code ALvoid alGetBuffer3PtrSOFT(ALuint buffer, ALenum param, ALvoid ** ptr0, ALvoid ** ptr1, ALvoid ** ptr2)} */
    @NativeType("ALvoid")
    public static void alGetBuffer3PtrSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALvoid **") PointerBuffer ptr0, @NativeType("ALvoid **") PointerBuffer ptr1, @NativeType("ALvoid **") PointerBuffer ptr2) {
        if (CHECKS) {
            check(ptr0, 1);
            check(ptr1, 1);
            check(ptr2, 1);
        }
        nalGetBuffer3PtrSOFT(buffer, param, memAddress(ptr0), memAddress(ptr1), memAddress(ptr2));
    }

    // --- [ alGetBuffer3PtrDirectSOFT ] ---

    /** {@code ALvoid alGetBuffer3PtrDirectSOFT(ALCcontext * context, ALuint buffer, ALenum param, ALvoid ** ptr0, ALvoid ** ptr1, ALvoid ** ptr2)} */
    public static void nalGetBuffer3PtrDirectSOFT(long context, int buffer, int param, long ptr0, long ptr1, long ptr2) {
        long __functionAddress = AL.getICD().alGetBuffer3PtrDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPPPV(context, buffer, param, ptr0, ptr1, ptr2, __functionAddress);
    }

    /** {@code ALvoid alGetBuffer3PtrDirectSOFT(ALCcontext * context, ALuint buffer, ALenum param, ALvoid ** ptr0, ALvoid ** ptr1, ALvoid ** ptr2)} */
    @NativeType("ALvoid")
    public static void alGetBuffer3PtrDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALvoid **") PointerBuffer ptr0, @NativeType("ALvoid **") PointerBuffer ptr1, @NativeType("ALvoid **") PointerBuffer ptr2) {
        if (CHECKS) {
            check(ptr0, 1);
            check(ptr1, 1);
            check(ptr2, 1);
        }
        nalGetBuffer3PtrDirectSOFT(context, buffer, param, memAddress(ptr0), memAddress(ptr1), memAddress(ptr2));
    }

    // --- [ alGetBufferPtrvSOFT ] ---

    /** {@code ALvoid alGetBufferPtrvSOFT(ALuint buffer, ALenum param, ALvoid ** ptr)} */
    public static void nalGetBufferPtrvSOFT(int buffer, int param, long ptr) {
        long __functionAddress = AL.getICD().alGetBufferPtrvSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(buffer, param, ptr, __functionAddress);
    }

    /** {@code ALvoid alGetBufferPtrvSOFT(ALuint buffer, ALenum param, ALvoid ** ptr)} */
    @NativeType("ALvoid")
    public static void alGetBufferPtrvSOFT(@NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALvoid **") PointerBuffer ptr) {
        if (CHECKS) {
            check(ptr, 1);
        }
        nalGetBufferPtrvSOFT(buffer, param, memAddress(ptr));
    }

    // --- [ alGetBufferPtrvDirectSOFT ] ---

    /** {@code ALvoid alGetBufferPtrvDirectSOFT(ALCcontext * context, ALuint buffer, ALenum param, ALvoid ** ptr)} */
    public static void nalGetBufferPtrvDirectSOFT(long context, int buffer, int param, long ptr) {
        long __functionAddress = AL.getICD().alGetBufferPtrvDirectSOFT;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        invokePPV(context, buffer, param, ptr, __functionAddress);
    }

    /** {@code ALvoid alGetBufferPtrvDirectSOFT(ALCcontext * context, ALuint buffer, ALenum param, ALvoid ** ptr)} */
    @NativeType("ALvoid")
    public static void alGetBufferPtrvDirectSOFT(@NativeType("ALCcontext *") long context, @NativeType("ALuint") int buffer, @NativeType("ALenum") int param, @NativeType("ALvoid **") PointerBuffer ptr) {
        if (CHECKS) {
            check(ptr, 1);
        }
        nalGetBufferPtrvDirectSOFT(context, buffer, param, memAddress(ptr));
    }

}