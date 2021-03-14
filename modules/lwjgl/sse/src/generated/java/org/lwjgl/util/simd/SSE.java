/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.simd;

import org.lwjgl.system.*;

/** Bindings to SSE macros. */
public class SSE {

    static { LibSSE.initialize(); }

    /** Exception state. */
    public static final int
        _MM_EXCEPT_MASK      = 0x3F,
        _MM_EXCEPT_INVALID   = 0x1,
        _MM_EXCEPT_DENORM    = 0x2,
        _MM_EXCEPT_DIV_ZERO  = 0x4,
        _MM_EXCEPT_OVERFLOW  = 0x8,
        _MM_EXCEPT_UNDERFLOW = 0x10,
        _MM_EXCEPT_INEXACT   = 0x20;

    /** Exception mask. */
    public static final int
        _MM_MASK_MASK      = 0x1F80,
        _MM_MASK_INVALID   = 0x80,
        _MM_MASK_DENORM    = 0x100,
        _MM_MASK_DIV_ZERO  = 0x200,
        _MM_MASK_OVERFLOW  = 0x400,
        _MM_MASK_UNDERFLOW = 0x800,
        _MM_MASK_INEXACT   = 0x1000;

    /** Round mode. */
    public static final int
        _MM_ROUND_MASK        = 0x6000,
        _MM_ROUND_NEAREST     = 0x0,
        _MM_ROUND_DOWN        = 0x2000,
        _MM_ROUND_UP          = 0x4000,
        _MM_ROUND_TOWARD_ZERO = 0x6000;

    /** Flush zero mask. */
    public static final int
        _MM_FLUSH_ZERO_MASK = 0x8000,
        _MM_FLUSH_ZERO_ON   = 0x8000,
        _MM_FLUSH_ZERO_OFF  = 0x0;

    protected SSE() {
        throw new UnsupportedOperationException();
    }

    // --- [ _MM_SET_EXCEPTION_STATE ] ---

    /**
     * Sets the exception state bits of the MXCSR control and status register.
     *
     * @param mask the exception state. One of:<br><table><tr><td>{@link #_MM_EXCEPT_MASK EXCEPT_MASK}</td><td>{@link #_MM_EXCEPT_INVALID EXCEPT_INVALID}</td><td>{@link #_MM_EXCEPT_DENORM EXCEPT_DENORM}</td><td>{@link #_MM_EXCEPT_DIV_ZERO EXCEPT_DIV_ZERO}</td><td>{@link #_MM_EXCEPT_OVERFLOW EXCEPT_OVERFLOW}</td></tr><tr><td>{@link #_MM_EXCEPT_UNDERFLOW EXCEPT_UNDERFLOW}</td><td>{@link #_MM_EXCEPT_INEXACT EXCEPT_INEXACT}</td></tr></table>
     */
    public static native void _MM_SET_EXCEPTION_STATE(@NativeType("unsigned int") int mask);

    // --- [ _MM_GET_EXCEPTION_STATE ] ---

    /** Returns the exception state bits from the MXCSR control and status register. */
    @NativeType("unsigned int")
    public static native int _MM_GET_EXCEPTION_STATE();

    // --- [ _MM_SET_EXCEPTION_MASK ] ---

    /**
     * Sets the exception mask bits of the MXCSR control and status register.
     * 
     * <p>All six exception mask bits are always affected. Bits not set explicitly are cleared.</p>
     *
     * @param mask the exception mask. One or more of:<br><table><tr><td>{@link #_MM_MASK_MASK MASK_MASK}</td><td>{@link #_MM_MASK_INVALID MASK_INVALID}</td><td>{@link #_MM_MASK_DENORM MASK_DENORM}</td><td>{@link #_MM_MASK_DIV_ZERO MASK_DIV_ZERO}</td><td>{@link #_MM_MASK_OVERFLOW MASK_OVERFLOW}</td><td>{@link #_MM_MASK_UNDERFLOW MASK_UNDERFLOW}</td></tr><tr><td>{@link #_MM_MASK_INEXACT MASK_INEXACT}</td></tr></table>
     */
    public static native void _MM_SET_EXCEPTION_MASK(@NativeType("unsigned int") int mask);

    // --- [ _MM_GET_EXCEPTION_MASK ] ---

    /** Returns the exception mask bits from the MXCSR control and status register. */
    @NativeType("unsigned int")
    public static native int _MM_GET_EXCEPTION_MASK();

    // --- [ _MM_SET_ROUNDING_MODE ] ---

    /**
     * Sets the rounding mode bits of the MXCSR control and status register.
     *
     * @param mode the rounding mode. One of:<br><table><tr><td>{@link #_MM_ROUND_MASK ROUND_MASK}</td><td>{@link #_MM_ROUND_NEAREST ROUND_NEAREST}</td><td>{@link #_MM_ROUND_DOWN ROUND_DOWN}</td><td>{@link #_MM_ROUND_UP ROUND_UP}</td><td>{@link #_MM_ROUND_TOWARD_ZERO ROUND_TOWARD_ZERO}</td></tr></table>
     */
    public static native void _MM_SET_ROUNDING_MODE(@NativeType("unsigned int") int mode);

    // --- [ _MM_GET_ROUNDING_MODE ] ---

    /** Returns the rounding mode bits from the MXCSR control and status register. */
    @NativeType("unsigned int")
    public static native int _MM_GET_ROUNDING_MODE();

    // --- [ _MM_SET_FLUSH_ZERO_MODE ] ---

    /**
     * Sets the flush zero bits of the MXCSR control and status register. FTZ sets denormal results from floating-point calculations to zero.
     * 
     * <p>FTZ is a method of bypassing IEEE 754 methods of dealing with invalid floating-point numbers due to underflows. This mode is less precise, but much
     * faster.</p>
     *
     * @param mode the flush-to-zero mode. One of:<br><table><tr><td>{@link #_MM_FLUSH_ZERO_MASK FLUSH_ZERO_MASK}</td><td>{@link #_MM_FLUSH_ZERO_ON FLUSH_ZERO_ON}</td><td>{@link #_MM_FLUSH_ZERO_OFF FLUSH_ZERO_OFF}</td></tr></table>
     */
    public static native void _MM_SET_FLUSH_ZERO_MODE(@NativeType("unsigned int") int mode);

    // --- [ _MM_GET_FLUSH_ZERO_MODE ] ---

    /** Returns the flush zero bits from the MXCSR control and status register. */
    @NativeType("unsigned int")
    public static native int _MM_GET_FLUSH_ZERO_MODE();

}