/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.windows.templates

import org.lwjgl.generator.*
import core.windows.*

val Crypt32 = "Crypt32".nativeClass(Module.CORE_WINDOWS, nativeSubPath = "windows", binding = simpleBinding(Module.CORE_WINDOWS, "crypt32")) {
    nativeImport("WindowsLWJGL.h")

    IntConstant(
        "CRYPTPROTECT_UI_FORBIDDEN"..0x1,
        "CRYPTPROTECT_LOCAL_MACHINE"..0x4,
        "CRYPTPROTECT_AUDIT"..0x10,
        "CRYPTPROTECT_VERIFY_PROTECTION"..0x40,
    )

    IntConstant(
        "CRYPTPROTECTMEMORY_SAME_PROCESS"..0x0000,
        "CRYPTPROTECTMEMORY_CROSS_PROCESS"..0x0001,
        "CRYPTPROTECTMEMORY_SAME_LOGON"..0x0002
    )

    IntConstant(
        "CRYPTPROTECT_PROMPT_ON_UNPROTECT"..0x1,
        "CRYPTPROTECT_PROMPT_ON_PROTECT"..0x2
    )

    IntConstant(
        "CRYPTPROTECTMEMORY_BLOCK_SIZE".."16"
    )

    BOOL(
        "CryptProtectData",

        CaptureCallState.GetLastError.param,
        DATA_BLOB.p("pDataIn"),
        nullable..LPCWSTR("szDataDescr"),
        nullable..DATA_BLOB.p("pOptionalEntropy"),
        nullable..PVOID("pvReserved"),
        nullable..CRYPTPROTECT_PROMPTSTRUCT.p("pPromptStruct"),
        DWORD("dwFlags"),
        DATA_BLOB.p("pDataOut")
    )

    IgnoreMissing..BOOL(
        "CryptProtectMemory",

        CaptureCallState.GetLastError.param,
        typedef(void.p, "LPVOID")("pDataIn"),
        AutoSize("pDataIn")..DWORD("cbDataIn"),
        DWORD("dwFlags")
    )

    BOOL(
        "CryptUnprotectData",

        CaptureCallState.GetLastError.param,
        DATA_BLOB.p("pDataIn"),
        Check(1)..nullable..LPWSTR.p("ppszDataDescr"),
        nullable..DATA_BLOB.p("pOptionalEntropy"),
        nullable..PVOID("pvReserved"),
        nullable..CRYPTPROTECT_PROMPTSTRUCT.p("pPromptStruct"),
        DWORD("dwFlags"),
        DATA_BLOB.p("pDataOut")
    )

    IgnoreMissing..BOOL(
        "CryptUnprotectMemory",

        CaptureCallState.GetLastError.param,
        typedef(void.p, "LPVOID")("pDataIn"),
        AutoSize("pDataIn")..DWORD("cbDataIn"),
        DWORD("dwFlags")
    )

}