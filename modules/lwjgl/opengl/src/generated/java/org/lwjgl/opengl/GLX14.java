/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GLX14 extends GLX13 {

    public static final int
        GLX_SAMPLE_BUFFERS = 0x186A0,
        GLX_SAMPLES        = 0x186A1;

    protected GLX14() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXGetProcAddress ] ---

    /** {@code void * glXGetProcAddress(GLchar const * procName)} */
    public static long nglXGetProcAddress(long procName) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetProcAddress;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPP(procName, __functionAddress);
    }

    /** {@code void * glXGetProcAddress(GLchar const * procName)} */
    @NativeType("void *")
    public static long glXGetProcAddress(@NativeType("GLchar const *") ByteBuffer procName) {
        if (CHECKS) {
            checkNT1(procName);
        }
        return nglXGetProcAddress(memAddress(procName));
    }

    /** {@code void * glXGetProcAddress(GLchar const * procName)} */
    @NativeType("void *")
    public static long glXGetProcAddress(@NativeType("GLchar const *") CharSequence procName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(procName, true);
            long procNameEncoded = stack.getPointerAddress();
            return nglXGetProcAddress(procNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}