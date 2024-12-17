/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class LLVMComdat {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetOrInsertComdat      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetOrInsertComdat"),
            GetComdat              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetComdat"),
            SetComdat              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMSetComdat"),
            GetComdatSelectionKind = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetComdatSelectionKind"),
            SetComdatSelectionKind = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMSetComdatSelectionKind");

    }

    public static final int
        LLVMAnyComdatSelectionKind           = 0,
        LLVMExactMatchComdatSelectionKind    = 1,
        LLVMLargestComdatSelectionKind       = 2,
        LLVMNoDeduplicateComdatSelectionKind = 3,
        LLVMSameSizeComdatSelectionKind      = 4;

    protected LLVMComdat() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMGetOrInsertComdat ] ---

    /** {@code LLVMComdatRef LLVMGetOrInsertComdat(LLVMModuleRef M, char const * Name)} */
    public static long nLLVMGetOrInsertComdat(long M, long Name) {
        long __functionAddress = Functions.GetOrInsertComdat;
        if (CHECKS) {
            check(M);
        }
        return invokePPP(M, Name, __functionAddress);
    }

    /** {@code LLVMComdatRef LLVMGetOrInsertComdat(LLVMModuleRef M, char const * Name)} */
    @NativeType("LLVMComdatRef")
    public static long LLVMGetOrInsertComdat(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMGetOrInsertComdat(M, memAddress(Name));
    }

    /** {@code LLVMComdatRef LLVMGetOrInsertComdat(LLVMModuleRef M, char const * Name)} */
    @NativeType("LLVMComdatRef")
    public static long LLVMGetOrInsertComdat(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMGetOrInsertComdat(M, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetComdat ] ---

    /** {@code LLVMComdatRef LLVMGetComdat(LLVMValueRef V)} */
    @NativeType("LLVMComdatRef")
    public static long LLVMGetComdat(@NativeType("LLVMValueRef") long V) {
        long __functionAddress = Functions.GetComdat;
        if (CHECKS) {
            check(V);
        }
        return invokePP(V, __functionAddress);
    }

    // --- [ LLVMSetComdat ] ---

    /** {@code void LLVMSetComdat(LLVMValueRef V, LLVMComdatRef C)} */
    public static void LLVMSetComdat(@NativeType("LLVMValueRef") long V, @NativeType("LLVMComdatRef") long C) {
        long __functionAddress = Functions.SetComdat;
        if (CHECKS) {
            check(V);
            check(C);
        }
        invokePPV(V, C, __functionAddress);
    }

    // --- [ LLVMGetComdatSelectionKind ] ---

    /** {@code LLVMComdatSelectionKind LLVMGetComdatSelectionKind(LLVMComdatRef C)} */
    @NativeType("LLVMComdatSelectionKind")
    public static int LLVMGetComdatSelectionKind(@NativeType("LLVMComdatRef") long C) {
        long __functionAddress = Functions.GetComdatSelectionKind;
        if (CHECKS) {
            check(C);
        }
        return invokePI(C, __functionAddress);
    }

    // --- [ LLVMSetComdatSelectionKind ] ---

    /** {@code void LLVMSetComdatSelectionKind(LLVMComdatRef C, LLVMComdatSelectionKind Kind)} */
    public static void LLVMSetComdatSelectionKind(@NativeType("LLVMComdatRef") long C, @NativeType("LLVMComdatSelectionKind") int Kind) {
        long __functionAddress = Functions.SetComdatSelectionKind;
        if (CHECKS) {
            check(C);
        }
        invokePV(C, Kind, __functionAddress);
    }

}