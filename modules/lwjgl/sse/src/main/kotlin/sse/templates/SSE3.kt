/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.simd.templates

import org.lwjgl.generator.*
import org.lwjgl.util.simd.*

val SSE3 = "SSE3".nativeClass("org.lwjgl.util.simd", prefix = "_MM", prefixMethod = "_MM_", library = SSE_LIBRARY) {
    nativeImport(
        "simd/intrinsics.h"
    )

    documentation = "Bindings to SSE3 macros."

    val DenormalsZeroMode = IntConstant(
        "Denormals are zero mode.",

        "DENORMALS_ZERO_MASK"..0x0040,
        "DENORMALS_ZERO_ON"..0x0040,
        "DENORMALS_ZERO_OFF"..0x0000
    ).javaDocLinks

    macro()..void(
        "SET_DENORMALS_ZERO_MODE",
        """
        Causes the \"denormals are zero\" mode to be turned ON or OFF by setting the appropriate bit of the control register. DAZ treats denormal values used
        as input to floating-point instructions as zero.

        DAZ is very similar to FTZ in many ways. DAZ mode is a method of bypassing IEEE 754 methods of dealing with denormal floating-point numbers. This mode
        is less precise, but much faster and is typically used in applications like streaming media when minute differences in quality are essentially
        undetectable.
        """,

        unsigned_int.IN("mode", "the denormals are zero mode", DenormalsZeroMode)
    )
    macro()..unsigned_int("GET_DENORMALS_ZERO_MODE", "Returns the current value of the \"denormals are zero mode\" bit of the control register.")
}