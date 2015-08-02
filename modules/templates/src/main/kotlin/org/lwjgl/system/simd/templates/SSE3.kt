/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.simd.templates

import org.lwjgl.generator.*

val SSE3 = "SSE3".nativeClass("org.lwjgl.system.simd", prefix = "_MM", prefixMethod = "_MM_") {
	nativeImport(
		"simd/intrinsics.h"
	)

	documentation = "Bindings to SSE3 macros."

	val DenormalsZeroMode = IntConstant(
		"Denormals are zero mode.",

		"DENORMALS_ZERO_MASK" _ 0x0040,
		"DENORMALS_ZERO_ON" _ 0x0040,
		"DENORMALS_ZERO_OFF" _ 0x0000
	).javaDocLinks

	void(
		"SET_DENORMALS_ZERO_MODE",
		"Causes the \"denormals are zero\" mode to be turned ON or OFF by setting the appropriate bit of the control register.",

		unsigned_int.IN("mode", "the denormals are zero mode", DenormalsZeroMode)
	)
	unsigned_int("GET_DENORMALS_ZERO_MODE", "Returns the current value of the \"denormals are zero mode\" bit of the control register.")
}