/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.simd.templates

import org.lwjgl.generator.*

val SSE = "SSE".nativeClass("org.lwjgl.system.simd", prefix = "_MM", prefixMethod = "_MM_") {
	nativeImport(
		"simd/intrinsics.h"
	)

	documentation = "Bindings to SSE macros."

	val ExceptionState = IntConstant(
		"Exception state.",

		"EXCEPT_MASK" _ 0x003f,
		"EXCEPT_INVALID" _ 0x0001,
		"EXCEPT_DENORM" _ 0x0002,
		"EXCEPT_DIV_ZERO" _ 0x0004,
		"EXCEPT_OVERFLOW" _ 0x0008,
		"EXCEPT_UNDERFLOW" _ 0x0010,
		"EXCEPT_INEXACT" _ 0x0020
	).javaDocLinks

	val ExceptionMask = IntConstant(
		"Exception mask.",

		"MASK_MASK" _ 0x1f80,
		"MASK_INVALID" _ 0x0080,
		"MASK_DENORM" _ 0x0100,
		"MASK_DIV_ZERO" _ 0x0200,
		"MASK_OVERFLOW" _ 0x0400,
		"MASK_UNDERFLOW" _ 0x0800,
		"MASK_INEXACT" _ 0x1000
	).javaDocLinks

	val RoundMode = IntConstant(
		"Round mode.",

		"ROUND_MASK" _ 0x6000,
		"ROUND_NEAREST" _ 0x0000,
		"ROUND_DOWN" _ 0x2000,
		"ROUND_UP" _ 0x4000,
		"ROUND_TOWARD_ZERO" _ 0x6000
	).javaDocLinks

	val FlushZeroMode = IntConstant(
		"Flush zero mask.",

		"FLUSH_ZERO_MASK" _ 0x8000,
		"FLUSH_ZERO_ON" _ 0x8000,
		"FLUSH_ZERO_OFF" _ 0x0000
	).javaDocLinks

	void(
		"SET_EXCEPTION_STATE",
		"Writes to the six least significant control register bits.",

		unsigned_int.IN("mask", "the exception state", ExceptionState)
	)
	unsigned_int("GET_EXCEPTION_STATE", "Reads from the six least significant control register bits.")

	void(
		"SET_EXCEPTION_MASK",
	    """
	    Writes to bit 7 – 12 control register bits.

	    All six exception mask bits are always affected. Bits not set explicitly are cleared.
	    """,

	    unsigned_int.IN("mask", "the exception mask", ExceptionMask, LinkMode.BITFIELD)
	)
	unsigned_int("GET_EXCEPTION_MASK", "Reads from bit 7 – 12 control register bits.")

	void(
		"SET_ROUNDING_MODE",
		"Writes to bits 13 and 14 of the control register.",

		unsigned_int.IN("mode", "the rounding mode", RoundMode)
	)
	unsigned_int("GET_ROUNDING_MODE", "Reads from bits 13 and 14 of the control register.")

	void(
		"SET_FLUSH_ZERO_MODE",
		"Writes to bit 15 of the control register.",

		unsigned_int.IN("mode", "the flush-to-zero mode", FlushZeroMode)
	)
	unsigned_int("GET_FLUSH_ZERO_MODE", "Reads from bit 15 of the control register.")
}