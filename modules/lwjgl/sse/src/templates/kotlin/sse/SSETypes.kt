/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sse

import org.lwjgl.generator.*

const val SSE_LIBRARY = "LibSSE.initialize();"

fun config() {
    packageInfo(
        Module.SSE,
        "Contains bindings to SSE macros."
    )

    Generator.registerLibraryInit(Module.SSE, "LibSSE", "sse")
}