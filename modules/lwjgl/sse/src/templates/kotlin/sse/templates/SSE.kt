/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sse.templates

import org.lwjgl.generator.*

val SSE = "SSE".nativeClass(Module.SSE, prefix = "_MM", prefixMethod = "_MM_") {
    nativeImport(
        "intrinsics.h"
    )

    IntConstant(
        "EXCEPT_MASK"..0x003f,
        "EXCEPT_INVALID"..0x0001,
        "EXCEPT_DENORM"..0x0002,
        "EXCEPT_DIV_ZERO"..0x0004,
        "EXCEPT_OVERFLOW"..0x0008,
        "EXCEPT_UNDERFLOW"..0x0010,
        "EXCEPT_INEXACT"..0x0020
    )

    IntConstant(
        "MASK_MASK"..0x1f80,
        "MASK_INVALID"..0x0080,
        "MASK_DENORM"..0x0100,
        "MASK_DIV_ZERO"..0x0200,
        "MASK_OVERFLOW"..0x0400,
        "MASK_UNDERFLOW"..0x0800,
        "MASK_INEXACT"..0x1000
    )

    IntConstant(
        "ROUND_MASK"..0x6000,
        "ROUND_NEAREST"..0x0000,
        "ROUND_DOWN"..0x2000,
        "ROUND_UP"..0x4000,
        "ROUND_TOWARD_ZERO"..0x6000
    )

    IntConstant(
        "FLUSH_ZERO_MASK"..0x8000,
        "FLUSH_ZERO_ON"..0x8000,
        "FLUSH_ZERO_OFF"..0x0000
    )

    macro()..void(
        "SET_EXCEPTION_STATE",

        unsigned_int("mask")
    )
    macro()..unsigned_int("GET_EXCEPTION_STATE", void())

    macro()..void(
        "SET_EXCEPTION_MASK",

        unsigned_int("mask")
    )
    macro()..unsigned_int("GET_EXCEPTION_MASK", void())

    macro()..void(
        "SET_ROUNDING_MODE",

        unsigned_int("mode")
    )
    macro()..unsigned_int("GET_ROUNDING_MODE", void())

    macro()..void(
        "SET_FLUSH_ZERO_MODE",

        unsigned_int("mode")
    )
    macro()..unsigned_int("GET_FLUSH_ZERO_MODE", void())
}