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

    /**
     * {@code LLVMComdatSelectionKind}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMAnyComdatSelectionKind AnyComdatSelectionKind} - The linker may choose any COMDAT.</li>
     * <li>{@link #LLVMExactMatchComdatSelectionKind ExactMatchComdatSelectionKind} - The data referenced by the COMDAT must be the same.</li>
     * <li>{@link #LLVMLargestComdatSelectionKind LargestComdatSelectionKind} - The linker will choose the largest COMDAT.</li>
     * <li>{@link #LLVMNoDeduplicateComdatSelectionKind NoDeduplicateComdatSelectionKind} - No deduplication is performed.</li>
     * <li>{@link #LLVMSameSizeComdatSelectionKind SameSizeComdatSelectionKind} - The data referenced by the COMDAT must be the same size.</li>
     * </ul>
     */
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

    /** Unsafe version of: {@link #LLVMGetOrInsertComdat GetOrInsertComdat} */
    public static long nLLVMGetOrInsertComdat(long M, long Name) {
        long __functionAddress = Functions.GetOrInsertComdat;
        if (CHECKS) {
            check(M);
        }
        return invokePPP(M, Name, __functionAddress);
    }

    /** Return the {@code Comdat} in the module with the specified name. It is created if it didn't already exist. */
    @NativeType("LLVMComdatRef")
    public static long LLVMGetOrInsertComdat(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMGetOrInsertComdat(M, memAddress(Name));
    }

    /** Return the {@code Comdat} in the module with the specified name. It is created if it didn't already exist. */
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

    /** Get the Comdat assigned to the given global object. */
    @NativeType("LLVMComdatRef")
    public static long LLVMGetComdat(@NativeType("LLVMValueRef") long V) {
        long __functionAddress = Functions.GetComdat;
        if (CHECKS) {
            check(V);
        }
        return invokePP(V, __functionAddress);
    }

    // --- [ LLVMSetComdat ] ---

    /** Assign the Comdat to the given global object. */
    public static void LLVMSetComdat(@NativeType("LLVMValueRef") long V, @NativeType("LLVMComdatRef") long C) {
        long __functionAddress = Functions.SetComdat;
        if (CHECKS) {
            check(V);
            check(C);
        }
        invokePPV(V, C, __functionAddress);
    }

    // --- [ LLVMGetComdatSelectionKind ] ---

    /** Get the conflict resolution selection kind for the Comdat. */
    @NativeType("LLVMComdatSelectionKind")
    public static int LLVMGetComdatSelectionKind(@NativeType("LLVMComdatRef") long C) {
        long __functionAddress = Functions.GetComdatSelectionKind;
        if (CHECKS) {
            check(C);
        }
        return invokePI(C, __functionAddress);
    }

    // --- [ LLVMSetComdatSelectionKind ] ---

    /** Set the conflict resolution selection kind for the Comdat. */
    public static void LLVMSetComdatSelectionKind(@NativeType("LLVMComdatRef") long C, @NativeType("LLVMComdatSelectionKind") int Kind) {
        long __functionAddress = Functions.SetComdatSelectionKind;
        if (CHECKS) {
            check(C);
        }
        invokePV(C, Kind, __functionAddress);
    }

}