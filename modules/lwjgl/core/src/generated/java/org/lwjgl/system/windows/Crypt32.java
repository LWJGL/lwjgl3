/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to {@code dpapi.h} and {@code crypt32.dll}. */
public class Crypt32 {

    private static final SharedLibrary CRYPT32 = Library.loadNative(Crypt32.class, "org.lwjgl", "crypt32");

    /** Contains the function pointers loaded from the crypt32 {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CryptProtectData     = apiGetFunctionAddress(CRYPT32, "CryptProtectData"),
            CryptProtectMemory   = apiGetFunctionAddressOptional(CRYPT32, "CryptProtectMemory"),
            CryptUnprotectData   = apiGetFunctionAddress(CRYPT32, "CryptUnprotectData"),
            CryptUnprotectMemory = apiGetFunctionAddressOptional(CRYPT32, "CryptUnprotectMemory");

    }

    /** Returns the crypt32 {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return CRYPT32;
    }

    /** Flags for the {@code dwFlags} parameter of {@link #CryptProtectData} and/or {@link #CryptUnprotectData}. */
    public static final int
        CRYPTPROTECT_UI_FORBIDDEN      = 0x1,
        CRYPTPROTECT_LOCAL_MACHINE     = 0x4,
        CRYPTPROTECT_AUDIT             = 0x10,
        CRYPTPROTECT_VERIFY_PROTECTION = 0x40;

    /** Flags for the {@code dwFlags} parameter of {@link #CryptProtectMemory} and {@link #CryptUnprotectMemory}. */
    public static final int
        CRYPTPROTECTMEMORY_SAME_PROCESS  = 0x0,
        CRYPTPROTECTMEMORY_CROSS_PROCESS = 0x1,
        CRYPTPROTECTMEMORY_SAME_LOGON    = 0x2;

    /** Flags for the {@code dwPromptFlags} member of {@link DATA_BLOB}. */
    public static final int
        CRYPTPROTECT_PROMPT_ON_UNPROTECT = 0x1,
        CRYPTPROTECT_PROMPT_ON_PROTECT   = 0x2;

    /** The block size for data encrypted via {@link #CryptProtectMemory}. */
    public static final int CRYPTPROTECTMEMORY_BLOCK_SIZE = 16;

    protected Crypt32() {
        throw new UnsupportedOperationException();
    }

    // --- [ CryptProtectData ] ---

    /** Unsafe version of: {@link #CryptProtectData} */
    public static native int nCryptProtectData(long pDataIn, long szDataDescr, long pOptionalEntropy, long pvReserved, long pPromptStruct, int dwFlags, long pDataOut, long __functionAddress);

    /** Unsafe version of: {@link #CryptProtectData} */
    public static int nCryptProtectData(long pDataIn, long szDataDescr, long pOptionalEntropy, long pvReserved, long pPromptStruct, int dwFlags, long pDataOut) {
        long __functionAddress = Functions.CryptProtectData;
        return nCryptProtectData(pDataIn, szDataDescr, pOptionalEntropy, pvReserved, pPromptStruct, dwFlags, pDataOut, __functionAddress);
    }

    /**
     * The {@code CryptProtectData} function performs encryption on the data in a {@link DATA_BLOB} structure.
     * 
     * <p>Typically, only a user with the same logon credential as the user who encrypted the data can decrypt the data. In addition, the encryption and
     * decryption usually must be done on the same computer.</p>
     *
     * @param pDataIn          a pointer to a {@link DATA_BLOB} structure that contains the plaintext to be encrypted
     * @param szDataDescr      a string with a readable description of the data to be encrypted.
     *                         
     *                         <p>This description string is included with the encrypted data. This parameter is optional and can be set to {@code NULL}.</p>
     * @param pOptionalEntropy a pointer to a {@link DATA_BLOB} structure that contains a password or other additional entropy used to encrypt the data.
     *                         
     *                         <p>The {@code DATA_BLOB} structure used in the encryption phase must also be used in the decryption phase. This parameter can be set to {@code NULL} for no
     *                         additional entropy.</p>
     * @param pvReserved       reserved for future use and must be set to {@code NULL}
     * @param pPromptStruct    a pointer to a {@link CRYPTPROTECT_PROMPTSTRUCT} structure that provides information about where and when prompts are to be displayed and what the
     *                         content of those prompts should be.
     *                         
     *                         <p>This parameter can be set to {@code NULL} in both the encryption and decryption phases.</p>
     * @param dwFlags          one or more of:<br><table><tr><td>{@link #CRYPTPROTECT_LOCAL_MACHINE},</td><td>{@link #CRYPTPROTECT_UI_FORBIDDEN},</td><td>{@link #CRYPTPROTECT_AUDIT}</td></tr></table>
     * @param pDataOut         a pointer to a {@link DATA_BLOB} structure that receives the encrypted data.
     *                         
     *                         <p>When you have finished using the {@code DATA_BLOB} structure, free its {@code pbData} member by calling the {@link WinBase#LocalFree} function.</p>
     */
    @NativeType("BOOL")
    public static boolean CryptProtectData(@NativeType("DATA_BLOB *") DATA_BLOB pDataIn, @Nullable @NativeType("LPCWSTR") ByteBuffer szDataDescr, @Nullable @NativeType("DATA_BLOB *") DATA_BLOB pOptionalEntropy, @NativeType("PVOID") long pvReserved, @Nullable @NativeType("CRYPTPROTECT_PROMPTSTRUCT *") CRYPTPROTECT_PROMPTSTRUCT pPromptStruct, @NativeType("DWORD") int dwFlags, @NativeType("DATA_BLOB *") DATA_BLOB pDataOut) {
        if (CHECKS) {
            checkNT2Safe(szDataDescr);
        }
        return nCryptProtectData(pDataIn.address(), memAddressSafe(szDataDescr), memAddressSafe(pOptionalEntropy), pvReserved, memAddressSafe(pPromptStruct), dwFlags, pDataOut.address()) != 0;
    }

    /**
     * The {@code CryptProtectData} function performs encryption on the data in a {@link DATA_BLOB} structure.
     * 
     * <p>Typically, only a user with the same logon credential as the user who encrypted the data can decrypt the data. In addition, the encryption and
     * decryption usually must be done on the same computer.</p>
     *
     * @param pDataIn          a pointer to a {@link DATA_BLOB} structure that contains the plaintext to be encrypted
     * @param szDataDescr      a string with a readable description of the data to be encrypted.
     *                         
     *                         <p>This description string is included with the encrypted data. This parameter is optional and can be set to {@code NULL}.</p>
     * @param pOptionalEntropy a pointer to a {@link DATA_BLOB} structure that contains a password or other additional entropy used to encrypt the data.
     *                         
     *                         <p>The {@code DATA_BLOB} structure used in the encryption phase must also be used in the decryption phase. This parameter can be set to {@code NULL} for no
     *                         additional entropy.</p>
     * @param pvReserved       reserved for future use and must be set to {@code NULL}
     * @param pPromptStruct    a pointer to a {@link CRYPTPROTECT_PROMPTSTRUCT} structure that provides information about where and when prompts are to be displayed and what the
     *                         content of those prompts should be.
     *                         
     *                         <p>This parameter can be set to {@code NULL} in both the encryption and decryption phases.</p>
     * @param dwFlags          one or more of:<br><table><tr><td>{@link #CRYPTPROTECT_LOCAL_MACHINE},</td><td>{@link #CRYPTPROTECT_UI_FORBIDDEN},</td><td>{@link #CRYPTPROTECT_AUDIT}</td></tr></table>
     * @param pDataOut         a pointer to a {@link DATA_BLOB} structure that receives the encrypted data.
     *                         
     *                         <p>When you have finished using the {@code DATA_BLOB} structure, free its {@code pbData} member by calling the {@link WinBase#LocalFree} function.</p>
     */
    @NativeType("BOOL")
    public static boolean CryptProtectData(@NativeType("DATA_BLOB *") DATA_BLOB pDataIn, @Nullable @NativeType("LPCWSTR") CharSequence szDataDescr, @Nullable @NativeType("DATA_BLOB *") DATA_BLOB pOptionalEntropy, @NativeType("PVOID") long pvReserved, @Nullable @NativeType("CRYPTPROTECT_PROMPTSTRUCT *") CRYPTPROTECT_PROMPTSTRUCT pPromptStruct, @NativeType("DWORD") int dwFlags, @NativeType("DATA_BLOB *") DATA_BLOB pDataOut) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF16Safe(szDataDescr, true);
            long szDataDescrEncoded = szDataDescr == null ? NULL : stack.getPointerAddress();
            return nCryptProtectData(pDataIn.address(), szDataDescrEncoded, memAddressSafe(pOptionalEntropy), pvReserved, memAddressSafe(pPromptStruct), dwFlags, pDataOut.address()) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ CryptProtectMemory ] ---

    /**
     * Unsafe version of: {@link #CryptProtectMemory}
     *
     * @param cbDataIn number of bytes of memory pointed to by the {@code pData} parameter to encrypt.
     *                 
     *                 <p>The number of bytes must be a multiple of the {@link #CRYPTPROTECTMEMORY_BLOCK_SIZE} constant.</p>
     */
    public static native int nCryptProtectMemory(long pDataIn, int cbDataIn, int dwFlags, long __functionAddress);

    /**
     * Unsafe version of: {@link #CryptProtectMemory}
     *
     * @param cbDataIn number of bytes of memory pointed to by the {@code pData} parameter to encrypt.
     *                 
     *                 <p>The number of bytes must be a multiple of the {@link #CRYPTPROTECTMEMORY_BLOCK_SIZE} constant.</p>
     */
    public static int nCryptProtectMemory(long pDataIn, int cbDataIn, int dwFlags) {
        long __functionAddress = Functions.CryptProtectMemory;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nCryptProtectMemory(pDataIn, cbDataIn, dwFlags, __functionAddress);
    }

    /**
     * Encrypts memory to prevent others from viewing sensitive information in your process.
     * 
     * <p>For example, use the {@code CryptProtectMemory} function to encrypt memory that contains a password. Encrypting the password prevents others from
     * viewing it when the process is paged out to the swap file. Otherwise, the password is in plaintext and viewable by others.</p>
     *
     * @param pDataIn a pointer to the block of memory to encrypt
     * @param dwFlags this parameter can be one of the following flags. You must specify the same flag when encrypting and decrypting the memory. One of:<br><table><tr><td>{@link #CRYPTPROTECTMEMORY_SAME_PROCESS}</td><td>{@link #CRYPTPROTECTMEMORY_CROSS_PROCESS}</td></tr><tr><td>{@link #CRYPTPROTECTMEMORY_SAME_LOGON}</td></tr></table>
     */
    @NativeType("BOOL")
    public static boolean CryptProtectMemory(@NativeType("LPVOID") ByteBuffer pDataIn, @NativeType("DWORD") int dwFlags) {
        return nCryptProtectMemory(memAddress(pDataIn), pDataIn.remaining(), dwFlags) != 0;
    }

    // --- [ CryptUnprotectData ] ---

    /** Unsafe version of: {@link #CryptUnprotectData} */
    public static native int nCryptUnprotectData(long pDataIn, long ppszDataDescr, long pOptionalEntropy, long pvReserved, long pPromptStruct, int dwFlags, long pDataOut, long __functionAddress);

    /** Unsafe version of: {@link #CryptUnprotectData} */
    public static int nCryptUnprotectData(long pDataIn, long ppszDataDescr, long pOptionalEntropy, long pvReserved, long pPromptStruct, int dwFlags, long pDataOut) {
        long __functionAddress = Functions.CryptUnprotectData;
        return nCryptUnprotectData(pDataIn, ppszDataDescr, pOptionalEntropy, pvReserved, pPromptStruct, dwFlags, pDataOut, __functionAddress);
    }

    /**
     * The {@code CryptUnprotectData} function decrypts and does an integrity check of the data in a {@link DATA_BLOB} structure.
     * 
     * <p>Usually, the only user who can decrypt the data is a user with the same logon credentials as the user who encrypted the data. In addition, the
     * encryption and decryption must be done on the same computer.</p>
     *
     * @param pDataIn          a pointer to a {@link DATA_BLOB} structure that holds the encrypted data
     * @param ppszDataDescr    a pointer to a string-readable description of the encrypted data included with the encrypted data.
     *                         
     *                         <p>This parameter can be set to {@code NULL}. When you have finished using {@code ppszDataDescr}, free it by calling the {@link WinBase#LocalFree} function.</p>
     * @param pOptionalEntropy a pointer to a {@link DATA_BLOB} structure that contains a password or other additional entropy used when the data was encrypted.
     *                         
     *                         <p>This parameter can be set to {@code NULL}; however, if an optional entropy {@code DATA_BLOB} structure was used in the encryption phase, that same
     *                         {@code DATA_BLOB} structure must be used for the decryption phase.</p>
     * @param pvReserved       reserved for future use and must be set to {@code NULL}
     * @param pPromptStruct    a pointer to a {@link CRYPTPROTECT_PROMPTSTRUCT} structure that provides information about where and when prompts are to be displayed and what the content
     *                         of those prompts should be.
     *                         
     *                         <p>This parameter can be set to {@code NULL}.</p>
     * @param dwFlags          one or more of:<br><table><tr><td>{@link #CRYPTPROTECT_UI_FORBIDDEN}</td><td>{@link #CRYPTPROTECT_VERIFY_PROTECTION}</td></tr></table>
     * @param pDataOut         a pointer to a {@link DATA_BLOB} structure where the function stores the decrypted data.
     *                         
     *                         <p>When you have finished using the {@code DATA_BLOB} structure, free its {@code pbData} member by calling the {@link WinBase#LocalFree} function.</p>
     */
    @NativeType("BOOL")
    public static boolean CryptUnprotectData(@NativeType("DATA_BLOB *") DATA_BLOB pDataIn, @Nullable @NativeType("LPWSTR *") PointerBuffer ppszDataDescr, @Nullable @NativeType("DATA_BLOB *") DATA_BLOB pOptionalEntropy, @NativeType("PVOID") long pvReserved, @Nullable @NativeType("CRYPTPROTECT_PROMPTSTRUCT *") CRYPTPROTECT_PROMPTSTRUCT pPromptStruct, @NativeType("DWORD") int dwFlags, @NativeType("DATA_BLOB *") DATA_BLOB pDataOut) {
        if (CHECKS) {
            checkSafe(ppszDataDescr, 1);
        }
        return nCryptUnprotectData(pDataIn.address(), memAddressSafe(ppszDataDescr), memAddressSafe(pOptionalEntropy), pvReserved, memAddressSafe(pPromptStruct), dwFlags, pDataOut.address()) != 0;
    }

    // --- [ CryptUnprotectMemory ] ---

    /**
     * Unsafe version of: {@link #CryptUnprotectMemory}
     *
     * @param cbDataIn number of bytes of memory pointed to by the {@code pData} parameter to decrypt.
     *                 
     *                 <p>The number of bytes must be a multiple of the {@link #CRYPTPROTECTMEMORY_BLOCK_SIZE} constant.</p>
     */
    public static native int nCryptUnprotectMemory(long pDataIn, int cbDataIn, int dwFlags, long __functionAddress);

    /**
     * Unsafe version of: {@link #CryptUnprotectMemory}
     *
     * @param cbDataIn number of bytes of memory pointed to by the {@code pData} parameter to decrypt.
     *                 
     *                 <p>The number of bytes must be a multiple of the {@link #CRYPTPROTECTMEMORY_BLOCK_SIZE} constant.</p>
     */
    public static int nCryptUnprotectMemory(long pDataIn, int cbDataIn, int dwFlags) {
        long __functionAddress = Functions.CryptUnprotectMemory;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nCryptUnprotectMemory(pDataIn, cbDataIn, dwFlags, __functionAddress);
    }

    /**
     * The {@code CryptUnprotectMemory} function decrypts memory that was encrypted using the {@link #CryptProtectMemory} function.
     *
     * @param pDataIn a pointer to the block of memory to decrypt
     * @param dwFlags this parameter can be one of the following flags. You must specify the same flag when encrypting and decrypting the memory. One of:<br><table><tr><td>{@link #CRYPTPROTECTMEMORY_SAME_PROCESS}</td><td>{@link #CRYPTPROTECTMEMORY_CROSS_PROCESS}</td></tr><tr><td>{@link #CRYPTPROTECTMEMORY_SAME_LOGON}</td></tr></table>
     */
    @NativeType("BOOL")
    public static boolean CryptUnprotectMemory(@NativeType("LPVOID") ByteBuffer pDataIn, @NativeType("DWORD") int dwFlags) {
        return nCryptUnprotectMemory(memAddress(pDataIn), pDataIn.remaining(), dwFlags) != 0;
    }

}