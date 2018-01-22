/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.simd

import org.lwjgl.generator.*

val SSE_PACKAGE = "org.lwjgl.util.simd"
val SSE_LIBRARY = "LibSSE.initialize();"

fun config() {
    packageInfo(
        SSE_PACKAGE,
        "Contains bindings to SSE macros."
    )

    Generator.registerLibraryInit(SSE_PACKAGE, "LibSSE", "sse")
}