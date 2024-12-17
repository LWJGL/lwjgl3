/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

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

    public static final int
        CRYPTPROTECT_UI_FORBIDDEN      = 0x1,
        CRYPTPROTECT_LOCAL_MACHINE     = 0x4,
        CRYPTPROTECT_AUDIT             = 0x10,
        CRYPTPROTECT_VERIFY_PROTECTION = 0x40;

    public static final int
        CRYPTPROTECTMEMORY_SAME_PROCESS  = 0x0,
        CRYPTPROTECTMEMORY_CROSS_PROCESS = 0x1,
        CRYPTPROTECTMEMORY_SAME_LOGON    = 0x2;

    public static final int
        CRYPTPROTECT_PROMPT_ON_UNPROTECT = 0x1,
        CRYPTPROTECT_PROMPT_ON_PROTECT   = 0x2;

    public static final int CRYPTPROTECTMEMORY_BLOCK_SIZE = 16;

    protected Crypt32() {
        throw new UnsupportedOperationException();
    }

    // --- [ CryptProtectData ] ---

    /** {@code BOOL CryptProtectData(DATA_BLOB * pDataIn, LPCWSTR szDataDescr, DATA_BLOB * pOptionalEntropy, PVOID pvReserved, CRYPTPROTECT_PROMPTSTRUCT * pPromptStruct, DWORD dwFlags, DATA_BLOB * pDataOut)} */
    public static native int nCryptProtectData(long _GetLastError, long pDataIn, long szDataDescr, long pOptionalEntropy, long pvReserved, long pPromptStruct, int dwFlags, long pDataOut, long __functionAddress);

    /** {@code BOOL CryptProtectData(DATA_BLOB * pDataIn, LPCWSTR szDataDescr, DATA_BLOB * pOptionalEntropy, PVOID pvReserved, CRYPTPROTECT_PROMPTSTRUCT * pPromptStruct, DWORD dwFlags, DATA_BLOB * pDataOut)} */
    public static int nCryptProtectData(long _GetLastError, long pDataIn, long szDataDescr, long pOptionalEntropy, long pvReserved, long pPromptStruct, int dwFlags, long pDataOut) {
        long __functionAddress = Functions.CryptProtectData;
        return nCryptProtectData(_GetLastError, pDataIn, szDataDescr, pOptionalEntropy, pvReserved, pPromptStruct, dwFlags, pDataOut, __functionAddress);
    }

    /** {@code BOOL CryptProtectData(DATA_BLOB * pDataIn, LPCWSTR szDataDescr, DATA_BLOB * pOptionalEntropy, PVOID pvReserved, CRYPTPROTECT_PROMPTSTRUCT * pPromptStruct, DWORD dwFlags, DATA_BLOB * pDataOut)} */
    @NativeType("BOOL")
    public static boolean CryptProtectData(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("DATA_BLOB *") DATA_BLOB pDataIn, @NativeType("LPCWSTR") @Nullable ByteBuffer szDataDescr, @NativeType("DATA_BLOB *") @Nullable DATA_BLOB pOptionalEntropy, @NativeType("PVOID") long pvReserved, @NativeType("CRYPTPROTECT_PROMPTSTRUCT *") @Nullable CRYPTPROTECT_PROMPTSTRUCT pPromptStruct, @NativeType("DWORD") int dwFlags, @NativeType("DATA_BLOB *") DATA_BLOB pDataOut) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
            checkNT2Safe(szDataDescr);
        }
        return nCryptProtectData(memAddressSafe(_GetLastError), pDataIn.address(), memAddressSafe(szDataDescr), memAddressSafe(pOptionalEntropy), pvReserved, memAddressSafe(pPromptStruct), dwFlags, pDataOut.address()) != 0;
    }

    /** {@code BOOL CryptProtectData(DATA_BLOB * pDataIn, LPCWSTR szDataDescr, DATA_BLOB * pOptionalEntropy, PVOID pvReserved, CRYPTPROTECT_PROMPTSTRUCT * pPromptStruct, DWORD dwFlags, DATA_BLOB * pDataOut)} */
    @NativeType("BOOL")
    public static boolean CryptProtectData(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("DATA_BLOB *") DATA_BLOB pDataIn, @NativeType("LPCWSTR") @Nullable CharSequence szDataDescr, @NativeType("DATA_BLOB *") @Nullable DATA_BLOB pOptionalEntropy, @NativeType("PVOID") long pvReserved, @NativeType("CRYPTPROTECT_PROMPTSTRUCT *") @Nullable CRYPTPROTECT_PROMPTSTRUCT pPromptStruct, @NativeType("DWORD") int dwFlags, @NativeType("DATA_BLOB *") DATA_BLOB pDataOut) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF16Safe(szDataDescr, true);
            long szDataDescrEncoded = szDataDescr == null ? NULL : stack.getPointerAddress();
            return nCryptProtectData(memAddressSafe(_GetLastError), pDataIn.address(), szDataDescrEncoded, memAddressSafe(pOptionalEntropy), pvReserved, memAddressSafe(pPromptStruct), dwFlags, pDataOut.address()) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ CryptProtectMemory ] ---

    /** {@code BOOL CryptProtectMemory(LPVOID pDataIn, DWORD cbDataIn, DWORD dwFlags)} */
    public static native int nCryptProtectMemory(long _GetLastError, long pDataIn, int cbDataIn, int dwFlags, long __functionAddress);

    /** {@code BOOL CryptProtectMemory(LPVOID pDataIn, DWORD cbDataIn, DWORD dwFlags)} */
    public static int nCryptProtectMemory(long _GetLastError, long pDataIn, int cbDataIn, int dwFlags) {
        long __functionAddress = Functions.CryptProtectMemory;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nCryptProtectMemory(_GetLastError, pDataIn, cbDataIn, dwFlags, __functionAddress);
    }

    /** {@code BOOL CryptProtectMemory(LPVOID pDataIn, DWORD cbDataIn, DWORD dwFlags)} */
    @NativeType("BOOL")
    public static boolean CryptProtectMemory(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("LPVOID") ByteBuffer pDataIn, @NativeType("DWORD") int dwFlags) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nCryptProtectMemory(memAddressSafe(_GetLastError), memAddress(pDataIn), pDataIn.remaining(), dwFlags) != 0;
    }

    // --- [ CryptUnprotectData ] ---

    /** {@code BOOL CryptUnprotectData(DATA_BLOB * pDataIn, LPWSTR * ppszDataDescr, DATA_BLOB * pOptionalEntropy, PVOID pvReserved, CRYPTPROTECT_PROMPTSTRUCT * pPromptStruct, DWORD dwFlags, DATA_BLOB * pDataOut)} */
    public static native int nCryptUnprotectData(long _GetLastError, long pDataIn, long ppszDataDescr, long pOptionalEntropy, long pvReserved, long pPromptStruct, int dwFlags, long pDataOut, long __functionAddress);

    /** {@code BOOL CryptUnprotectData(DATA_BLOB * pDataIn, LPWSTR * ppszDataDescr, DATA_BLOB * pOptionalEntropy, PVOID pvReserved, CRYPTPROTECT_PROMPTSTRUCT * pPromptStruct, DWORD dwFlags, DATA_BLOB * pDataOut)} */
    public static int nCryptUnprotectData(long _GetLastError, long pDataIn, long ppszDataDescr, long pOptionalEntropy, long pvReserved, long pPromptStruct, int dwFlags, long pDataOut) {
        long __functionAddress = Functions.CryptUnprotectData;
        return nCryptUnprotectData(_GetLastError, pDataIn, ppszDataDescr, pOptionalEntropy, pvReserved, pPromptStruct, dwFlags, pDataOut, __functionAddress);
    }

    /** {@code BOOL CryptUnprotectData(DATA_BLOB * pDataIn, LPWSTR * ppszDataDescr, DATA_BLOB * pOptionalEntropy, PVOID pvReserved, CRYPTPROTECT_PROMPTSTRUCT * pPromptStruct, DWORD dwFlags, DATA_BLOB * pDataOut)} */
    @NativeType("BOOL")
    public static boolean CryptUnprotectData(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("DATA_BLOB *") DATA_BLOB pDataIn, @NativeType("LPWSTR *") @Nullable PointerBuffer ppszDataDescr, @NativeType("DATA_BLOB *") @Nullable DATA_BLOB pOptionalEntropy, @NativeType("PVOID") long pvReserved, @NativeType("CRYPTPROTECT_PROMPTSTRUCT *") @Nullable CRYPTPROTECT_PROMPTSTRUCT pPromptStruct, @NativeType("DWORD") int dwFlags, @NativeType("DATA_BLOB *") DATA_BLOB pDataOut) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
            checkSafe(ppszDataDescr, 1);
        }
        return nCryptUnprotectData(memAddressSafe(_GetLastError), pDataIn.address(), memAddressSafe(ppszDataDescr), memAddressSafe(pOptionalEntropy), pvReserved, memAddressSafe(pPromptStruct), dwFlags, pDataOut.address()) != 0;
    }

    // --- [ CryptUnprotectMemory ] ---

    /** {@code BOOL CryptUnprotectMemory(LPVOID pDataIn, DWORD cbDataIn, DWORD dwFlags)} */
    public static native int nCryptUnprotectMemory(long _GetLastError, long pDataIn, int cbDataIn, int dwFlags, long __functionAddress);

    /** {@code BOOL CryptUnprotectMemory(LPVOID pDataIn, DWORD cbDataIn, DWORD dwFlags)} */
    public static int nCryptUnprotectMemory(long _GetLastError, long pDataIn, int cbDataIn, int dwFlags) {
        long __functionAddress = Functions.CryptUnprotectMemory;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nCryptUnprotectMemory(_GetLastError, pDataIn, cbDataIn, dwFlags, __functionAddress);
    }

    /** {@code BOOL CryptUnprotectMemory(LPVOID pDataIn, DWORD cbDataIn, DWORD dwFlags)} */
    @NativeType("BOOL")
    public static boolean CryptUnprotectMemory(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("LPVOID") ByteBuffer pDataIn, @NativeType("DWORD") int dwFlags) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nCryptUnprotectMemory(memAddressSafe(_GetLastError), memAddress(pDataIn), pDataIn.remaining(), dwFlags) != 0;
    }

}