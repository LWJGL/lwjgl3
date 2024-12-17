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

    /** {@code LLVMBool LLVMLoadLibraryPermanently(char const * Filename)} */
    public static int nLLVMLoadLibraryPermanently(long Filename) {
        long __functionAddress = Functions.LoadLibraryPermanently;
        return invokePI(Filename, __functionAddress);
    }

    /** {@code LLVMBool LLVMLoadLibraryPermanently(char const * Filename)} */
    @NativeType("LLVMBool")
    public static boolean LLVMLoadLibraryPermanently(@NativeType("char const *") ByteBuffer Filename) {
        if (CHECKS) {
            checkNT1(Filename);
        }
        return nLLVMLoadLibraryPermanently(memAddress(Filename)) != 0;
    }

    /** {@code LLVMBool LLVMLoadLibraryPermanently(char const * Filename)} */
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

    /** {@code void LLVMParseCommandLineOptions(int argc, char const * const * argv, char const * Overview)} */
    public static void nLLVMParseCommandLineOptions(int argc, long argv, long Overview) {
        long __functionAddress = Functions.ParseCommandLineOptions;
        invokePPV(argc, argv, Overview, __functionAddress);
    }

    /** {@code void LLVMParseCommandLineOptions(int argc, char const * const * argv, char const * Overview)} */
    public static void LLVMParseCommandLineOptions(@NativeType("char const * const *") PointerBuffer argv, @NativeType("char const *") ByteBuffer Overview) {
        if (CHECKS) {
            checkNT1(Overview);
        }
        nLLVMParseCommandLineOptions(argv.remaining(), memAddress(argv), memAddress(Overview));
    }

    /** {@code void LLVMParseCommandLineOptions(int argc, char const * const * argv, char const * Overview)} */
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

    /** {@code void * LLVMSearchForAddressOfSymbol(char const * symbolName)} */
    public static long nLLVMSearchForAddressOfSymbol(long symbolName) {
        long __functionAddress = Functions.SearchForAddressOfSymbol;
        return invokePP(symbolName, __functionAddress);
    }

    /** {@code void * LLVMSearchForAddressOfSymbol(char const * symbolName)} */
    @NativeType("void *")
    public static long LLVMSearchForAddressOfSymbol(@NativeType("char const *") ByteBuffer symbolName) {
        if (CHECKS) {
            checkNT1(symbolName);
        }
        return nLLVMSearchForAddressOfSymbol(memAddress(symbolName));
    }

    /** {@code void * LLVMSearchForAddressOfSymbol(char const * symbolName)} */
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

    /** {@code void LLVMAddSymbol(char const * symbolName, void * symbolValue)} */
    public static void nLLVMAddSymbol(long symbolName, long symbolValue) {
        long __functionAddress = Functions.AddSymbol;
        if (CHECKS) {
            check(symbolValue);
        }
        invokePPV(symbolName, symbolValue, __functionAddress);
    }

    /** {@code void LLVMAddSymbol(char const * symbolName, void * symbolValue)} */
    public static void LLVMAddSymbol(@NativeType("char const *") ByteBuffer symbolName, @NativeType("void *") long symbolValue) {
        if (CHECKS) {
            checkNT1(symbolName);
        }
        nLLVMAddSymbol(memAddress(symbolName), symbolValue);
    }

    /** {@code void LLVMAddSymbol(char const * symbolName, void * symbolValue)} */
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