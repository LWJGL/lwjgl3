/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class RemoteryGL {

    static { LibRemotery.initialize(); }

    protected RemoteryGL() {
        throw new UnsupportedOperationException();
    }

    // --- [ rmt_BindOpenGL ] ---

    /** {@code void rmt_BindOpenGL(void)} */
    public static native void rmt_BindOpenGL();

    // --- [ rmt_UnbindOpenGL ] ---

    /** {@code void rmt_UnbindOpenGL(void)} */
    public static native void rmt_UnbindOpenGL();

    // --- [ rmt_BeginOpenGLSample ] ---

    /** {@code void rmt_BeginOpenGLSample(rmtPStr name, rmtU32 * hash_cache)} */
    public static native void nrmt_BeginOpenGLSample(long name, long hash_cache);

    /** {@code void rmt_BeginOpenGLSample(rmtPStr name, rmtU32 * hash_cache)} */
    public static void rmt_BeginOpenGLSample(@NativeType("rmtPStr") ByteBuffer name, @NativeType("rmtU32 *") @Nullable IntBuffer hash_cache) {
        if (CHECKS) {
            checkNT1(name);
            checkSafe(hash_cache, 1);
        }
        nrmt_BeginOpenGLSample(memAddress(name), memAddressSafe(hash_cache));
    }

    /** {@code void rmt_BeginOpenGLSample(rmtPStr name, rmtU32 * hash_cache)} */
    public static void rmt_BeginOpenGLSample(@NativeType("rmtPStr") CharSequence name, @NativeType("rmtU32 *") @Nullable IntBuffer hash_cache) {
        if (CHECKS) {
            checkSafe(hash_cache, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nrmt_BeginOpenGLSample(nameEncoded, memAddressSafe(hash_cache));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ rmt_EndOpenGLSample ] ---

    /** {@code void rmt_EndOpenGLSample(void)} */
    public static native void rmt_EndOpenGLSample();

}