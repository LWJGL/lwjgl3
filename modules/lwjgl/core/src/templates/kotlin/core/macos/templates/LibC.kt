/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.macos.templates

import org.lwjgl.generator.*
import core.macos.*

val libc = "LibC".nativeClass(Module.CORE_MACOS, nativeSubPath = "macos", binding = libSystem.binding!!.delegate("LibSystem.getLibrary()")) {
    documentation = "Native bindings to libc, the Standard C Library."

    pid_t(
        "getpid",
        "Returns the process ID of the calling process.",
        void()
    )
}