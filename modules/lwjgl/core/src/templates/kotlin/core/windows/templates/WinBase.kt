/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.windows.templates

import org.lwjgl.generator.*
import core.windows.*

val WinBase = "WinBase".nativeClass(Module.CORE_WINDOWS, nativeSubPath = "windows") {
    nativeImport(
        "WindowsLWJGL.h"
    )

    IntConstant(
        "FALSE".."0",
        "TRUE".."1"
    )

    HLOCAL(
        "LocalFree",

        CaptureCallState.GetLastError.param,
        HLOCAL("hMem")
    )

    DWORD(
        "GetLastError",
        void()
    )

    HMODULE(
        "GetModuleHandle",

        CaptureCallState.GetLastError.param,
        nullable..LPCTSTR("moduleName")
    )

    DWORD(
        "GetModuleFileName",

        CaptureCallState.GetLastError.param,
        nullable..HMODULE("hModule"),
        Return(RESULT)..LPTSTR("lpFilename"),
        AutoSize("lpFilename")..DWORD("nSize")
    )

    HMODULE(
        "LoadLibrary",

        CaptureCallState.GetLastError.param,
        LPCTSTR("name")
    )

    FARPROC(
        "GetProcAddress",

        CaptureCallState.GetLastError.param,
        HMODULE("handle"),
        LPCSTR("name")
    )

    BOOL(
        "FreeLibrary",

        CaptureCallState.GetLastError.param,
        HMODULE("handle")
    )
}