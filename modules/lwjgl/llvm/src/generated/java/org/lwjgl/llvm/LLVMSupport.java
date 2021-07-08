/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class LLVMSupport {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            LoadLibraryPermanently   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMLoadLibraryPermanently"),
            ParseCommandLineOptions  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMParseCommandLineOptions"),
            SearchForAddressOfSymbol = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMSearchForAddressOfSymbol"),
            AddSymbol                = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddSymbol");

    }

    protected LLVMSupport() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMLoadLibraryPermanently ] ---

    /** Unsafe version of: {@link #LLVMLoadLibraryPermanently LoadLibraryPermanently} */
    public static int nLLVMLoadLibraryPermanently(long Filename) {
        long __functionAddress = Functions.LoadLibraryPermanently;
        return invokePI(Filename, __functionAddress);
    }

    /** This function permanently loads the dynamic library at the given path. It is safe to call this function multiple times for the same library. */
    @NativeType("LLVMBool")
    public static boolean LLVMLoadLibraryPermanently(@NativeType("char const *") ByteBuffer Filename) {
        if (CHECKS) {
            checkNT1(Filename);
        }
        return nLLVMLoadLibraryPermanently(memAddress(Filename)) != 0;
    }

    /** This function permanently loads the dynamic library at the given path. It is safe to call this function multiple times for the same library. */
    @NativeType("LLVMBool")
    public static boolean LLVMLoadLibraryPermanently(@NativeType("char const *") CharSequence Filename) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Filename, true);
            long FilenameEncoded = stack.getPointerAddress();
            return nLLVMLoadLibraryPermanently(FilenameEncoded) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMParseCommandLineOptions ] ---

    /** Unsafe version of: {@link #LLVMParseCommandLineOptions ParseCommandLineOptions} */
    public static void nLLVMParseCommandLineOptions(int argc, long argv, long Overview) {
        long __functionAddress = Functions.ParseCommandLineOptions;
        invokePPV(argc, argv, Overview, __functionAddress);
    }

    /**
     * This function parses the given arguments using the LLVM command line parser.
     * 
     * <p>Note that the only stable thing about this function is its signature; you cannot rely on any particular set of command line arguments being interpreted
     * the same way across LLVM versions.</p>
     */
    public static void LLVMParseCommandLineOptions(@NativeType("char const * const *") PointerBuffer argv, @NativeType("char const *") ByteBuffer Overview) {
        if (CHECKS) {
            checkNT1(Overview);
        }
        nLLVMParseCommandLineOptions(argv.remaining(), memAddress(argv), memAddress(Overview));
    }

    /**
     * This function parses the given arguments using the LLVM command line parser.
     * 
     * <p>Note that the only stable thing about this function is its signature; you cannot rely on any particular set of command line arguments being interpreted
     * the same way across LLVM versions.</p>
     */
    public static void LLVMParseCommandLineOptions(@NativeType("char const * const *") PointerBuffer argv, @NativeType("char const *") CharSequence Overview) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Overview, true);
            long OverviewEncoded = stack.getPointerAddress();
            nLLVMParseCommandLineOptions(argv.remaining(), memAddress(argv), OverviewEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMSearchForAddressOfSymbol ] ---

    /** Unsafe version of: {@link #LLVMSearchForAddressOfSymbol SearchForAddressOfSymbol} */
    public static long nLLVMSearchForAddressOfSymbol(long symbolName) {
        long __functionAddress = Functions.SearchForAddressOfSymbol;
        return invokePP(symbolName, __functionAddress);
    }

    /**
     * This function will search through all previously loaded dynamic libraries for the symbol {@code symbolName}. If it is found, the address of that symbol
     * is returned. If not, null is returned.
     */
    @NativeType("void *")
    public static long LLVMSearchForAddressOfSymbol(@NativeType("char const *") ByteBuffer symbolName) {
        if (CHECKS) {
            checkNT1(symbolName);
        }
        return nLLVMSearchForAddressOfSymbol(memAddress(symbolName));
    }

    /**
     * This function will search through all previously loaded dynamic libraries for the symbol {@code symbolName}. If it is found, the address of that symbol
     * is returned. If not, null is returned.
     */
    @NativeType("void *")
    public static long LLVMSearchForAddressOfSymbol(@NativeType("char const *") CharSequence symbolName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(symbolName, true);
            long symbolNameEncoded = stack.getPointerAddress();
            return nLLVMSearchForAddressOfSymbol(symbolNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMAddSymbol ] ---

    /** Unsafe version of: {@link #LLVMAddSymbol AddSymbol} */
    public static void nLLVMAddSymbol(long symbolName, long symbolValue) {
        long __functionAddress = Functions.AddSymbol;
        if (CHECKS) {
            check(symbolValue);
        }
        invokePPV(symbolName, symbolValue, __functionAddress);
    }

    /** This functions permanently adds the symbol {@code symbolName} with the value {@code symbolValue}. These symbols are searched before any libraries. */
    public static void LLVMAddSymbol(@NativeType("char const *") ByteBuffer symbolName, @NativeType("void *") long symbolValue) {
        if (CHECKS) {
            checkNT1(symbolName);
        }
        nLLVMAddSymbol(memAddress(symbolName), symbolValue);
    }

    /** This functions permanently adds the symbol {@code symbolName} with the value {@code symbolValue}. These symbols are searched before any libraries. */
    public static void LLVMAddSymbol(@NativeType("char const *") CharSequence symbolName, @NativeType("void *") long symbolValue) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(symbolName, true);
            long symbolNameEncoded = stack.getPointerAddress();
            nLLVMAddSymbol(symbolNameEncoded, symbolValue);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}