/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sse.templates

import org.lwjgl.generator.*

val SSE3 = "SSE3".nativeClass(Module.SSE, prefix = "_MM", prefixMethod = "_MM_") {
    nativeImport(
        "intrinsics.h"
    )

    IntConstant(
        "DENORMALS_ZERO_MASK"..0x0040,
        "DENORMALS_ZERO_ON"..0x0040,
        "DENORMALS_ZERO_OFF"..0x0000
    )

    macro()..void(
        "SET_DENORMALS_ZERO_MODE",

        unsigned_int("mode")
    )
    macro()..unsigned_int("GET_DENORMALS_ZERO_MODE", void())
}