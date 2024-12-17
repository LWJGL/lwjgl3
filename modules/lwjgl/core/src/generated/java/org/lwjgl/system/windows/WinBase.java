/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class WinBase {

    static { Library.initialize(); }

    public static final int
        FALSE = 0,
        TRUE  = 1;

    protected WinBase() {
        throw new UnsupportedOperationException();
    }

    // --- [ LocalFree ] ---

    /** {@code HLOCAL LocalFree(HLOCAL hMem)} */
    public static native long nLocalFree(long _GetLastError, long hMem);

    /** {@code HLOCAL LocalFree(HLOCAL hMem)} */
    @NativeType("HLOCAL")
    public static long LocalFree(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HLOCAL") long hMem) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
            check(hMem);
        }
        return nLocalFree(memAddressSafe(_GetLastError), hMem);
    }

    // --- [ GetLastError ] ---

    /** {@code DWORD GetLastError(void)} */
    @NativeType("DWORD")
    public static native int GetLastError();

    // --- [ GetModuleHandle ] ---

    /** {@code HMODULE GetModuleHandle(LPCTSTR moduleName)} */
    public static native long nGetModuleHandle(long _GetLastError, long moduleName);

    /** {@code HMODULE GetModuleHandle(LPCTSTR moduleName)} */
    @NativeType("HMODULE")
    public static long GetModuleHandle(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("LPCTSTR") @Nullable ByteBuffer moduleName) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
            checkNT2Safe(moduleName);
        }
        return nGetModuleHandle(memAddressSafe(_GetLastError), memAddressSafe(moduleName));
    }

    /** {@code HMODULE GetModuleHandle(LPCTSTR moduleName)} */
    @NativeType("HMODULE")
    public static long GetModuleHandle(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("LPCTSTR") @Nullable CharSequence moduleName) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF16Safe(moduleName, true);
            long moduleNameEncoded = moduleName == null ? NULL : stack.getPointerAddress();
            return nGetModuleHandle(memAddressSafe(_GetLastError), moduleNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ GetModuleFileName ] ---

    /** {@code DWORD GetModuleFileName(HMODULE hModule, LPTSTR lpFilename, DWORD nSize)} */
    public static native int nGetModuleFileName(long _GetLastError, long hModule, long lpFilename, int nSize);

    /** {@code DWORD GetModuleFileName(HMODULE hModule, LPTSTR lpFilename, DWORD nSize)} */
    @NativeType("DWORD")
    public static int GetModuleFileName(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HMODULE") long hModule, @NativeType("LPTSTR") ByteBuffer lpFilename) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nGetModuleFileName(memAddressSafe(_GetLastError), hModule, memAddress(lpFilename), lpFilename.remaining() >> 1);
    }

    /** {@code DWORD GetModuleFileName(HMODULE hModule, LPTSTR lpFilename, DWORD nSize)} */
    @NativeType("DWORD")
    public static String GetModuleFileName(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HMODULE") long hModule, @NativeType("DWORD") int nSize) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer lpFilename = stack.malloc(nSize << 1);
            int __result = nGetModuleFileName(memAddressSafe(_GetLastError), hModule, memAddress(lpFilename), nSize);
            return memUTF16(lpFilename, __result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LoadLibrary ] ---

    /** {@code HMODULE LoadLibrary(LPCTSTR name)} */
    public static native long nLoadLibrary(long _GetLastError, long name);

    /** {@code HMODULE LoadLibrary(LPCTSTR name)} */
    @NativeType("HMODULE")
    public static long LoadLibrary(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("LPCTSTR") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
            checkNT2(name);
        }
        return nLoadLibrary(memAddressSafe(_GetLastError), memAddress(name));
    }

    /** {@code HMODULE LoadLibrary(LPCTSTR name)} */
    @NativeType("HMODULE")
    public static long LoadLibrary(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("LPCTSTR") CharSequence name) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF16(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nLoadLibrary(memAddressSafe(_GetLastError), nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ GetProcAddress ] ---

    /** {@code FARPROC GetProcAddress(HMODULE handle, LPCSTR name)} */
    public static native long nGetProcAddress(long _GetLastError, long handle, long name);

    /** {@code FARPROC GetProcAddress(HMODULE handle, LPCSTR name)} */
    @NativeType("FARPROC")
    public static long GetProcAddress(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HMODULE") long handle, @NativeType("LPCSTR") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
            check(handle);
            checkNT1(name);
        }
        return nGetProcAddress(memAddressSafe(_GetLastError), handle, memAddress(name));
    }

    /** {@code FARPROC GetProcAddress(HMODULE handle, LPCSTR name)} */
    @NativeType("FARPROC")
    public static long GetProcAddress(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HMODULE") long handle, @NativeType("LPCSTR") CharSequence name) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
            check(handle);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nGetProcAddress(memAddressSafe(_GetLastError), handle, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FreeLibrary ] ---

    /** {@code BOOL FreeLibrary(HMODULE handle)} */
    public static native int nFreeLibrary(long _GetLastError, long handle);

    /** {@code BOOL FreeLibrary(HMODULE handle)} */
    @NativeType("BOOL")
    public static boolean FreeLibrary(@NativeType("DWORD *") @Nullable IntBuffer _GetLastError, @NativeType("HMODULE") long handle) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
            check(handle);
        }
        return nFreeLibrary(memAddressSafe(_GetLastError), handle) != 0;
    }

}