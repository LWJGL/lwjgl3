/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.macosx.templates

import org.lwjgl.generator.*
import org.lwjgl.system.macosx.*

val libc = "LibC".nativeClass(MACOSX_PACKAGE, binding = libSystem.binding!!.delegate("LibSystem.getLibrary()")) {
    documentation = "Native bindings to libc, the Standard C Library."

    pid_t(
        "getpid",
        "Returns the process ID of the calling process."
    );
}