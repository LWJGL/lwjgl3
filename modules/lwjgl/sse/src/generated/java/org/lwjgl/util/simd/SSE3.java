/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.simd;

import org.lwjgl.system.*;

public class SSE3 {

    static { LibSSE.initialize(); }

    public static final int
        _MM_DENORMALS_ZERO_MASK = 0x40,
        _MM_DENORMALS_ZERO_ON   = 0x40,
        _MM_DENORMALS_ZERO_OFF  = 0x0;

    protected SSE3() {
        throw new UnsupportedOperationException();
    }

    // --- [ _MM_SET_DENORMALS_ZERO_MODE ] ---

    /** {@code void _MM_SET_DENORMALS_ZERO_MODE(unsigned int mode)} */
    public static native void _MM_SET_DENORMALS_ZERO_MODE(@NativeType("unsigned int") int mode);

    // --- [ _MM_GET_DENORMALS_ZERO_MODE ] ---

    /** {@code unsigned int _MM_GET_DENORMALS_ZERO_MODE(void)} */
    @NativeType("unsigned int")
    public static native int _MM_GET_DENORMALS_ZERO_MODE();

}