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

public class GLXARBGetProcAddress {

    protected GLXARBGetProcAddress() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXGetProcAddressARB ] ---

    /** {@code void * glXGetProcAddressARB(GLchar const * procName)} */
    public static long nglXGetProcAddressARB(long procName) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetProcAddressARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPP(procName, __functionAddress);
    }

    /** {@code void * glXGetProcAddressARB(GLchar const * procName)} */
    @NativeType("void *")
    public static long glXGetProcAddressARB(@NativeType("GLchar const *") ByteBuffer procName) {
        if (CHECKS) {
            checkNT1(procName);
        }
        return nglXGetProcAddressARB(memAddress(procName));
    }

    /** {@code void * glXGetProcAddressARB(GLchar const * procName)} */
    @NativeType("void *")
    public static long glXGetProcAddressARB(@NativeType("GLchar const *") CharSequence procName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(procName, true);
            long procNameEncoded = stack.getPointerAddress();
            return nglXGetProcAddressARB(procNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}