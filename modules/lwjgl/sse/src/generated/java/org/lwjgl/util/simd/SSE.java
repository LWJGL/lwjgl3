/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.simd;

import org.lwjgl.system.*;

public class SSE {

    static { LibSSE.initialize(); }

    public static final int
        _MM_EXCEPT_MASK      = 0x3F,
        _MM_EXCEPT_INVALID   = 0x1,
        _MM_EXCEPT_DENORM    = 0x2,
        _MM_EXCEPT_DIV_ZERO  = 0x4,
        _MM_EXCEPT_OVERFLOW  = 0x8,
        _MM_EXCEPT_UNDERFLOW = 0x10,
        _MM_EXCEPT_INEXACT   = 0x20;

    public static final int
        _MM_MASK_MASK      = 0x1F80,
        _MM_MASK_INVALID   = 0x80,
        _MM_MASK_DENORM    = 0x100,
        _MM_MASK_DIV_ZERO  = 0x200,
        _MM_MASK_OVERFLOW  = 0x400,
        _MM_MASK_UNDERFLOW = 0x800,
        _MM_MASK_INEXACT   = 0x1000;

    public static final int
        _MM_ROUND_MASK        = 0x6000,
        _MM_ROUND_NEAREST     = 0x0,
        _MM_ROUND_DOWN        = 0x2000,
        _MM_ROUND_UP          = 0x4000,
        _MM_ROUND_TOWARD_ZERO = 0x6000;

    public static final int
        _MM_FLUSH_ZERO_MASK = 0x8000,
        _MM_FLUSH_ZERO_ON   = 0x8000,
        _MM_FLUSH_ZERO_OFF  = 0x0;

    protected SSE() {
        throw new UnsupportedOperationException();
    }

    // --- [ _MM_SET_EXCEPTION_STATE ] ---

    /** {@code void _MM_SET_EXCEPTION_STATE(unsigned int mask)} */
    public static native void _MM_SET_EXCEPTION_STATE(@NativeType("unsigned int") int mask);

    // --- [ _MM_GET_EXCEPTION_STATE ] ---

    /** {@code unsigned int _MM_GET_EXCEPTION_STATE(void)} */
    @NativeType("unsigned int")
    public static native int _MM_GET_EXCEPTION_STATE();

    // --- [ _MM_SET_EXCEPTION_MASK ] ---

    /** {@code void _MM_SET_EXCEPTION_MASK(unsigned int mask)} */
    public static native void _MM_SET_EXCEPTION_MASK(@NativeType("unsigned int") int mask);

    // --- [ _MM_GET_EXCEPTION_MASK ] ---

    /** {@code unsigned int _MM_GET_EXCEPTION_MASK(void)} */
    @NativeType("unsigned int")
    public static native int _MM_GET_EXCEPTION_MASK();

    // --- [ _MM_SET_ROUNDING_MODE ] ---

    /** {@code void _MM_SET_ROUNDING_MODE(unsigned int mode)} */
    public static native void _MM_SET_ROUNDING_MODE(@NativeType("unsigned int") int mode);

    // --- [ _MM_GET_ROUNDING_MODE ] ---

    /** {@code unsigned int _MM_GET_ROUNDING_MODE(void)} */
    @NativeType("unsigned int")
    public static native int _MM_GET_ROUNDING_MODE();

    // --- [ _MM_SET_FLUSH_ZERO_MODE ] ---

    /** {@code void _MM_SET_FLUSH_ZERO_MODE(unsigned int mode)} */
    public static native void _MM_SET_FLUSH_ZERO_MODE(@NativeType("unsigned int") int mode);

    // --- [ _MM_GET_FLUSH_ZERO_MODE ] ---

    /** {@code unsigned int _MM_GET_FLUSH_ZERO_MODE(void)} */
    @NativeType("unsigned int")
    public static native int _MM_GET_FLUSH_ZERO_MODE();

}