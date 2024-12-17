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

public class EXTDirectContext {

    protected EXTDirectContext() {
        throw new UnsupportedOperationException();
    }

    // --- [ alcGetProcAddress2 ] ---

    /** {@code ALCvoid * alcGetProcAddress2(ALCdevice * device, ALchar const * funcName)} */
    public static long nalcGetProcAddress2(long device, long funcName) {
		long __functionAddress = ALC.getICD().alcGetProcAddress2;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePPP(device, funcName, __functionAddress);
    }

    /** {@code ALCvoid * alcGetProcAddress2(ALCdevice * device, ALchar const * funcName)} */
    @NativeType("ALCvoid *")
    public static long alcGetProcAddress2(@NativeType("ALCdevice *") long device, @NativeType("ALchar const *") ByteBuffer funcName) {
        if (CHECKS) {
            checkNT1(funcName);
        }
        return nalcGetProcAddress2(device, memAddress(funcName));
    }

    /** {@code ALCvoid * alcGetProcAddress2(ALCdevice * device, ALchar const * funcName)} */
    @NativeType("ALCvoid *")
    public static long alcGetProcAddress2(@NativeType("ALCdevice *") long device, @NativeType("ALchar const *") CharSequence funcName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(funcName, true);
            long funcNameEncoded = stack.getPointerAddress();
            return nalcGetProcAddress2(device, funcNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}