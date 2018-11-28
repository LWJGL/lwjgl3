/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Remotery profiling for OpenGL. */
public class RemoteryGL {

    static { LibRemotery.initialize(); }

    protected RemoteryGL() {
        throw new UnsupportedOperationException();
    }

    // --- [ rmt_BindOpenGL ] ---

    public static native void rmt_BindOpenGL();

    // --- [ rmt_UnbindOpenGL ] ---

    public static native void rmt_UnbindOpenGL();

    // --- [ rmt_BeginOpenGLSample ] ---

    public static native void nrmt_BeginOpenGLSample(long name, long hash_cache);

    public static void rmt_BeginOpenGLSample(@NativeType("rmtPStr") ByteBuffer name, @Nullable @NativeType("rmtU32 *") IntBuffer hash_cache) {
        if (CHECKS) {
            checkNT1(name);
            checkSafe(hash_cache, 1);
        }
        nrmt_BeginOpenGLSample(memAddress(name), memAddressSafe(hash_cache));
    }

    public static void rmt_BeginOpenGLSample(@NativeType("rmtPStr") CharSequence name, @Nullable @NativeType("rmtU32 *") IntBuffer hash_cache) {
        if (CHECKS) {
            checkSafe(hash_cache, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            nrmt_BeginOpenGLSample(nameEncoded, memAddressSafe(hash_cache));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ rmt_EndOpenGLSample ] ---

    public static native void rmt_EndOpenGLSample();

}