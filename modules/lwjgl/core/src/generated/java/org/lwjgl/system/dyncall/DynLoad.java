/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.dyncall;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to \"dynload.h\".
 * 
 * <p>The dynload library provides an interface to load foreign dynamic libraries and access to their symbols.</p>
 */
public class DynLoad {

    static { Library.initialize(); }

    protected DynLoad() {
        throw new UnsupportedOperationException();
    }

    // --- [ dlLoadLibrary ] ---

    /** Unsafe version of: {@link #dlLoadLibrary LoadLibrary} */
    public static native long ndlLoadLibrary(long libpath);

    /**
     * Loads a dynamic library at {@code libpath} and returns a handle to it.
     *
     * @param libpath the dynamic library path
     */
    @NativeType("DLLib *")
    public static long dlLoadLibrary(@NativeType("char const *") ByteBuffer libpath) {
        if (CHECKS) {
            checkNT1(libpath);
        }
        return ndlLoadLibrary(memAddress(libpath));
    }

    /**
     * Loads a dynamic library at {@code libpath} and returns a handle to it.
     *
     * @param libpath the dynamic library path
     */
    @NativeType("DLLib *")
    public static long dlLoadLibrary(@NativeType("char const *") CharSequence libpath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(libpath, true);
            long libpathEncoded = stack.getPointerAddress();
            return ndlLoadLibrary(libpathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ dlFreeLibrary ] ---

    /** Unsafe version of: {@link #dlFreeLibrary FreeLibrary} */
    public static native void ndlFreeLibrary(long pLib);

    /**
     * Frees a loaded library.
     *
     * @param pLib the dynamic library to free
     */
    public static void dlFreeLibrary(@NativeType("DLLib *") long pLib) {
        if (CHECKS) {
            check(pLib);
        }
        ndlFreeLibrary(pLib);
    }

    // --- [ dlFindSymbol ] ---

    /** Unsafe version of: {@link #dlFindSymbol FindSymbol} */
    public static native long ndlFindSymbol(long pLib, long pSymbolName);

    /**
     * Returns a pointer to a symbol with name {@code pSymbolName} in the library with handle {@code pLib}, or returns a null pointer if the symbol cannot be
     * found.
     *
     * @param pLib        the dynamic library
     * @param pSymbolName the symbol name
     */
    @NativeType("void *")
    public static long dlFindSymbol(@NativeType("DLLib *") long pLib, @NativeType("char const *") ByteBuffer pSymbolName) {
        if (CHECKS) {
            check(pLib);
            checkNT1(pSymbolName);
        }
        return ndlFindSymbol(pLib, memAddress(pSymbolName));
    }

    /**
     * Returns a pointer to a symbol with name {@code pSymbolName} in the library with handle {@code pLib}, or returns a null pointer if the symbol cannot be
     * found.
     *
     * @param pLib        the dynamic library
     * @param pSymbolName the symbol name
     */
    @NativeType("void *")
    public static long dlFindSymbol(@NativeType("DLLib *") long pLib, @NativeType("char const *") CharSequence pSymbolName) {
        if (CHECKS) {
            check(pLib);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pSymbolName, true);
            long pSymbolNameEncoded = stack.getPointerAddress();
            return ndlFindSymbol(pLib, pSymbolNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ dlGetLibraryPath ] ---

    /**
     * Unsafe version of: {@link #dlGetLibraryPath GetLibraryPath}
     *
     * @param bufSize the size of {@code sOut}, in bytes
     */
    public static native int ndlGetLibraryPath(long pLib, long sOut, int bufSize);

    /**
     * Gets a copy of the path to the library loaded with handle {@code pLib}.
     * 
     * <p>The parameter {@code sOut} is a pointer to a buffer of size {@code bufSize} (in bytes), to hold the output string. The return value is the size of the
     * buffer (in bytes) needed to hold the null-terminated string, or 0 if it can't be looked up. If {@code bufSize >= return value > 1}, a null-terminated
     * string with the path to the library should be in {@code sOut}. If it returns 0, the library name wasn't able to be found. Please note that this might
     * happen in some rare cases, so make sure to always check.</p>
     *
     * @param pLib the dynamic library
     * @param sOut pointer to a buffer where the library path will be stored
     */
    public static int dlGetLibraryPath(@NativeType("DLLib *") long pLib, @NativeType("char *") ByteBuffer sOut) {
        if (CHECKS) {
            check(pLib);
        }
        return ndlGetLibraryPath(pLib, memAddress(sOut), sOut.remaining());
    }

    /**
     * Gets a copy of the path to the library loaded with handle {@code pLib}.
     * 
     * <p>The parameter {@code sOut} is a pointer to a buffer of size {@code bufSize} (in bytes), to hold the output string. The return value is the size of the
     * buffer (in bytes) needed to hold the null-terminated string, or 0 if it can't be looked up. If {@code bufSize >= return value > 1}, a null-terminated
     * string with the path to the library should be in {@code sOut}. If it returns 0, the library name wasn't able to be found. Please note that this might
     * happen in some rare cases, so make sure to always check.</p>
     *
     * @param pLib    the dynamic library
     * @param bufSize the size of {@code sOut}, in bytes
     */
    @NativeType("int")
    public static String dlGetLibraryPath(@NativeType("DLLib *") long pLib, int bufSize) {
        if (CHECKS) {
            check(pLib);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer sOut = stack.malloc(bufSize);
            int __result = ndlGetLibraryPath(pLib, memAddress(sOut), bufSize);
            return memASCII(sOut, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ dlSymsInit ] ---

    /** Unsafe version of: {@link #dlSymsInit SymsInit} */
    public static native long ndlSymsInit(long libPath);

    /**
     * Creates a new {@code DLSyms} object.
     *
     * @param libPath the dynamic library path
     */
    @NativeType("DLSyms *")
    public static long dlSymsInit(@NativeType("char const *") ByteBuffer libPath) {
        if (CHECKS) {
            checkNT1(libPath);
        }
        return ndlSymsInit(memAddress(libPath));
    }

    /**
     * Creates a new {@code DLSyms} object.
     *
     * @param libPath the dynamic library path
     */
    @NativeType("DLSyms *")
    public static long dlSymsInit(@NativeType("char const *") CharSequence libPath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(libPath, true);
            long libPathEncoded = stack.getPointerAddress();
            return ndlSymsInit(libPathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ dlSymsCleanup ] ---

    /** Unsafe version of: {@link #dlSymsCleanup SymsCleanup} */
    public static native void ndlSymsCleanup(long pSyms);

    /**
     * Frees the specified {@code DLSyms} object.
     *
     * @param pSyms the {@code DLSyms} object to free
     */
    public static void dlSymsCleanup(@NativeType("DLSyms *") long pSyms) {
        if (CHECKS) {
            check(pSyms);
        }
        ndlSymsCleanup(pSyms);
    }

    // --- [ dlSymsCount ] ---

    /** Unsafe version of: {@link #dlSymsCount SymsCount} */
    public static native int ndlSymsCount(long pSyms);

    /**
     * Returns the number of symbols exported by the specified library.
     *
     * @param pSyms a {@code DLSyms} object
     */
    public static int dlSymsCount(@NativeType("DLSyms *") long pSyms) {
        if (CHECKS) {
            check(pSyms);
        }
        return ndlSymsCount(pSyms);
    }

    // --- [ dlSymsName ] ---

    /** Unsafe version of: {@link #dlSymsName SymsName} */
    public static native long ndlSymsName(long pSyms, int index);

    /**
     * Returns the symbol name exported by the specified library at the specified index.
     *
     * @param pSyms a {@code DLSyms} object
     */
    @Nullable
    @NativeType("char const *")
    public static String dlSymsName(@NativeType("DLSyms *") long pSyms, int index) {
        if (CHECKS) {
            check(pSyms);
        }
        long __result = ndlSymsName(pSyms, index);
        return memASCIISafe(__result);
    }

    // --- [ dlSymsNameFromValue ] ---

    /** Unsafe version of: {@link #dlSymsNameFromValue SymsNameFromValue} */
    public static native long ndlSymsNameFromValue(long pSyms, long value);

    /**
     * Returns the symbol name exported by the specified library at the specified address.
     *
     * @param pSyms a {@code DLSyms} object
     * @param value the symbol address
     */
    @Nullable
    @NativeType("char const *")
    public static String dlSymsNameFromValue(@NativeType("DLSyms *") long pSyms, @NativeType("void *") long value) {
        if (CHECKS) {
            check(pSyms);
            check(value);
        }
        long __result = ndlSymsNameFromValue(pSyms, value);
        return memASCIISafe(__result);
    }

}