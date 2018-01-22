/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.simd.templates

import org.lwjgl.generator.*
import org.lwjgl.util.simd.*

val SSE = "SSE".nativeClass("org.lwjgl.util.simd", prefix = "_MM", prefixMethod = "_MM_", library = SSE_LIBRARY) {
    nativeImport(
        "simd/intrinsics.h"
    )

    documentation = "Bindings to SSE macros."

    val ExceptionState = IntConstant(
        "Exception state.",

        "EXCEPT_MASK"..0x003f,
        "EXCEPT_INVALID"..0x0001,
        "EXCEPT_DENORM"..0x0002,
        "EXCEPT_DIV_ZERO"..0x0004,
        "EXCEPT_OVERFLOW"..0x0008,
        "EXCEPT_UNDERFLOW"..0x0010,
        "EXCEPT_INEXACT"..0x0020
    ).javaDocLinks

    val ExceptionMask = IntConstant(
        "Exception mask.",

        "MASK_MASK"..0x1f80,
        "MASK_INVALID"..0x0080,
        "MASK_DENORM"..0x0100,
        "MASK_DIV_ZERO"..0x0200,
        "MASK_OVERFLOW"..0x0400,
        "MASK_UNDERFLOW"..0x0800,
        "MASK_INEXACT"..0x1000
    ).javaDocLinks

    val RoundMode = IntConstant(
        "Round mode.",

        "ROUND_MASK"..0x6000,
        "ROUND_NEAREST"..0x0000,
        "ROUND_DOWN"..0x2000,
        "ROUND_UP"..0x4000,
        "ROUND_TOWARD_ZERO"..0x6000
    ).javaDocLinks

    val FlushZeroMode = IntConstant(
        "Flush zero mask.",

        "FLUSH_ZERO_MASK"..0x8000,
        "FLUSH_ZERO_ON"..0x8000,
        "FLUSH_ZERO_OFF"..0x0000
    ).javaDocLinks

    macro()..void(
        "SET_EXCEPTION_STATE",
        "Sets the exception state bits of the MXCSR control and status register.",

        unsigned_int.IN("mask", "the exception state", ExceptionState)
    )
    macro()..unsigned_int("GET_EXCEPTION_STATE", "Returns the exception state bits from the MXCSR control and status register.")

    macro()..void(
        "SET_EXCEPTION_MASK",
        """
        Sets the exception mask bits of the MXCSR control and status register.

        All six exception mask bits are always affected. Bits not set explicitly are cleared.
        """,

        unsigned_int.IN("mask", "the exception mask", ExceptionMask, LinkMode.BITFIELD)
    )
    macro()..unsigned_int("GET_EXCEPTION_MASK", "Returns the exception mask bits from the MXCSR control and status register.")

    macro()..void(
        "SET_ROUNDING_MODE",
        "Sets the rounding mode bits of the MXCSR control and status register.",

        unsigned_int.IN("mode", "the rounding mode", RoundMode)
    )
    macro()..unsigned_int("GET_ROUNDING_MODE", "Returns the rounding mode bits from the MXCSR control and status register.")

    macro()..void(
        "SET_FLUSH_ZERO_MODE",
        """
        Sets the flush zero bits of the MXCSR control and status register. FTZ sets denormal results from floating-point calculations to zero.

        FTZ is a method of bypassing IEEE 754 methods of dealing with invalid floating-point numbers due to underflows. This mode is less precise, but much
        faster.
        """,

        unsigned_int.IN("mode", "the flush-to-zero mode", FlushZeroMode)
    )
    macro()..unsigned_int("GET_FLUSH_ZERO_MODE", "Returns the flush zero bits from the MXCSR control and status register.")
}