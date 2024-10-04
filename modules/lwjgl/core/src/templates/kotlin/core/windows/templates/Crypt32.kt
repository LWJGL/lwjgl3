/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.windows.templates

import org.lwjgl.generator.*
import core.windows.*

val Crypt32 = "Crypt32".nativeClass(Module.CORE_WINDOWS, nativeSubPath = "windows", binding = simpleBinding(Module.CORE_WINDOWS, "crypt32")) {
    nativeImport("WindowsLWJGL.h")

    documentation = "Native bindings to {@code dpapi.h} and {@code crypt32.dll}."

    IntConstant(
        "Flags for the {@code dwFlags} parameter of #CryptProtectData() and/or #CryptUnprotectData().",

        "CRYPTPROTECT_UI_FORBIDDEN"..0x1,
        "CRYPTPROTECT_LOCAL_MACHINE"..0x4,
        "CRYPTPROTECT_AUDIT"..0x10,
        "CRYPTPROTECT_VERIFY_PROTECTION"..0x40,
    )

    val CryptProtectMemoryFlags = IntConstant(
        "Flags for the {@code dwFlags} parameter of #CryptProtectMemory() and #CryptUnprotectMemory().",

        "CRYPTPROTECTMEMORY_SAME_PROCESS"..0x0000,
        "CRYPTPROTECTMEMORY_CROSS_PROCESS"..0x0001,
        "CRYPTPROTECTMEMORY_SAME_LOGON"..0x0002
    ).javaDocLinks

    IntConstant(
        "Flags for the {@code dwPromptFlags} member of ##DATA_BLOB.",

        "CRYPTPROTECT_PROMPT_ON_UNPROTECT"..0x1,
        "CRYPTPROTECT_PROMPT_ON_PROTECT"..0x2
    )

    IntConstant(
        "The block size for data encrypted via #CryptProtectMemory().",
        "CRYPTPROTECTMEMORY_BLOCK_SIZE".."16"
    )

    BOOL(
        "CryptProtectData",
        """
        The {@code CryptProtectData} function performs encryption on the data in a ##DATA_BLOB structure.

        Typically, only a user with the same logon credential as the user who encrypted the data can decrypt the data. In addition, the encryption and
        decryption usually must be done on the same computer.
        """,

        CaptureCallState.GetLastError.param,
        DATA_BLOB.p("pDataIn", "a pointer to a ##DATA_BLOB structure that contains the plaintext to be encrypted"),
        nullable..LPCWSTR(
            "szDataDescr",
            """
            a string with a readable description of the data to be encrypted.

            This description string is included with the encrypted data. This parameter is optional and can be set to #NULL.
            """
        ),
        nullable..DATA_BLOB.p(
            "pOptionalEntropy",
            """
            a pointer to a ##DATA_BLOB structure that contains a password or other additional entropy used to encrypt the data.

            The {@code DATA_BLOB} structure used in the encryption phase must also be used in the decryption phase. This parameter can be set to #NULL for no
            additional entropy.
            """
        ),
        nullable..PVOID("pvReserved", "reserved for future use and must be set to #NULL"),
        nullable..CRYPTPROTECT_PROMPTSTRUCT.p(
            "pPromptStruct",
            """
            a pointer to a ##CRYPTPROTECT_PROMPTSTRUCT structure that provides information about where and when prompts are to be displayed and what the
            content of those prompts should be.

            This parameter can be set to #NULL in both the encryption and decryption phases.
            """
        ),
        DWORD("dwFlags", "", "#CRYPTPROTECT_LOCAL_MACHINE, #CRYPTPROTECT_UI_FORBIDDEN, #CRYPTPROTECT_AUDIT", LinkMode.BITFIELD),
        DATA_BLOB.p(
            "pDataOut",
            """
            a pointer to a ##DATA_BLOB structure that receives the encrypted data.

            When you have finished using the {@code DATA_BLOB} structure, free its {@code pbData} member by calling the #LocalFree() function.
            """
        )
    )

    IgnoreMissing..BOOL(
        "CryptProtectMemory",
        """
        Encrypts memory to prevent others from viewing sensitive information in your process.

        For example, use the {@code CryptProtectMemory} function to encrypt memory that contains a password. Encrypting the password prevents others from
        viewing it when the process is paged out to the swap file. Otherwise, the password is in plaintext and viewable by others.
        """,

        CaptureCallState.GetLastError.param,
        typedef(void.p, "LPVOID")("pDataIn", "a pointer to the block of memory to encrypt"),
        AutoSize("pDataIn")..DWORD(
            "cbDataIn",
            """
            number of bytes of memory pointed to by the {@code pData} parameter to encrypt.

            The number of bytes must be a multiple of the #CRYPTPROTECTMEMORY_BLOCK_SIZE constant.
            """
        ),
        DWORD(
            "dwFlags",
            "this parameter can be one of the following flags. You must specify the same flag when encrypting and decrypting the memory.",
            CryptProtectMemoryFlags
        )
    )

    BOOL(
        "CryptUnprotectData",
        """
        The {@code CryptUnprotectData} function decrypts and does an integrity check of the data in a ##DATA_BLOB structure.

        Usually, the only user who can decrypt the data is a user with the same logon credentials as the user who encrypted the data. In addition, the
        encryption and decryption must be done on the same computer.
        """,

        CaptureCallState.GetLastError.param,
        DATA_BLOB.p("pDataIn", "a pointer to a ##DATA_BLOB structure that holds the encrypted data"),
        Check(1)..nullable..LPWSTR.p(
            "ppszDataDescr",
            """
            a pointer to a string-readable description of the encrypted data included with the encrypted data.

            This parameter can be set to #NULL. When you have finished using {@code ppszDataDescr}, free it by calling the #LocalFree() function.
            """
        ),
        nullable..DATA_BLOB.p(
            "pOptionalEntropy",
            """
            a pointer to a ##DATA_BLOB structure that contains a password or other additional entropy used when the data was encrypted.

            This parameter can be set to #NULL; however, if an optional entropy {@code DATA_BLOB} structure was used in the encryption phase, that same
            {@code DATA_BLOB} structure must be used for the decryption phase.
            """
        ),
        nullable..PVOID("pvReserved", "reserved for future use and must be set to #NULL"),
        nullable..CRYPTPROTECT_PROMPTSTRUCT.p(
            "pPromptStruct",
            """
            a pointer to a ##CRYPTPROTECT_PROMPTSTRUCT structure that provides information about where and when prompts are to be displayed and what the content
            of those prompts should be.

            This parameter can be set to #NULL.
            """
        ),
        DWORD("dwFlags", "", "#CRYPTPROTECT_UI_FORBIDDEN #CRYPTPROTECT_VERIFY_PROTECTION", LinkMode.BITFIELD),
        DATA_BLOB.p(
            "pDataOut",
            """
            a pointer to a ##DATA_BLOB structure where the function stores the decrypted data.

            When you have finished using the {@code DATA_BLOB} structure, free its {@code pbData} member by calling the #LocalFree() function.
            """
        )
    )

    IgnoreMissing..BOOL(
        "CryptUnprotectMemory",
        "The {@code CryptUnprotectMemory} function decrypts memory that was encrypted using the #CryptProtectMemory() function.",

        CaptureCallState.GetLastError.param,
        typedef(void.p, "LPVOID")("pDataIn", "a pointer to the block of memory to decrypt"),
        AutoSize("pDataIn")..DWORD(
            "cbDataIn",
            """
            number of bytes of memory pointed to by the {@code pData} parameter to decrypt.

            The number of bytes must be a multiple of the #CRYPTPROTECTMEMORY_BLOCK_SIZE constant.
            """
        ),
        DWORD(
            "dwFlags",
            "this parameter can be one of the following flags. You must specify the same flag when encrypting and decrypting the memory.",
            CryptProtectMemoryFlags
        )
    )

}