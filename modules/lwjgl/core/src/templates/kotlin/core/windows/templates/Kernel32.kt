/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.windows.templates

import org.lwjgl.generator.*
import core.windows.*

val Kernel32 = "Kernel32".nativeClass(Module.CORE_WINDOWS, nativeSubPath = "windows", binding = simpleBinding(Module.CORE_WINDOWS, "kernel32")) {
    HANDLE(
        "GetCurrentProcess",

        void()
    )

    DWORD(
        "GetCurrentProcessId",

        void()
    )

    DWORD(
        "GetProcessId",

        HANDLE("Process")
    )

    HANDLE(
        "GetCurrentThread",

        void()
    )

    DWORD(
        "GetCurrentThreadId",

        void()
    )

    IgnoreMissing..DWORD(
        "GetThreadId",

        HANDLE("Thread")
    )

    IgnoreMissing..DWORD(
        "GetProcessIdOfThread",

        HANDLE("Thread")
    )

    IgnoreMissing..DWORD(
        "GetCurrentProcessorNumber",

        void()
    )
}