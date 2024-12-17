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

public class LLVMBitWriter {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            WriteBitcodeToFile         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMWriteBitcodeToFile"),
            WriteBitcodeToFD           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMWriteBitcodeToFD"),
            WriteBitcodeToFileHandle   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMWriteBitcodeToFileHandle"),
            WriteBitcodeToMemoryBuffer = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMWriteBitcodeToMemoryBuffer");

    }

    protected LLVMBitWriter() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMWriteBitcodeToFile ] ---

    /** {@code int LLVMWriteBitcodeToFile(LLVMModuleRef M, char const * Path)} */
    public static int nLLVMWriteBitcodeToFile(long M, long Path) {
        long __functionAddress = Functions.WriteBitcodeToFile;
        if (CHECKS) {
            check(M);
        }
        return invokePPI(M, Path, __functionAddress);
    }

    /** {@code int LLVMWriteBitcodeToFile(LLVMModuleRef M, char const * Path)} */
    public static int LLVMWriteBitcodeToFile(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Path) {
        if (CHECKS) {
            checkNT1(Path);
        }
        return nLLVMWriteBitcodeToFile(M, memAddress(Path));
    }

    /** {@code int LLVMWriteBitcodeToFile(LLVMModuleRef M, char const * Path)} */
    public static int LLVMWriteBitcodeToFile(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Path, true);
            long PathEncoded = stack.getPointerAddress();
            return nLLVMWriteBitcodeToFile(M, PathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMWriteBitcodeToFD ] ---

    /** {@code int LLVMWriteBitcodeToFD(LLVMModuleRef M, int FD, int ShouldClose, int Unbuffered)} */
    public static int LLVMWriteBitcodeToFD(@NativeType("LLVMModuleRef") long M, int FD, int ShouldClose, int Unbuffered) {
        long __functionAddress = Functions.WriteBitcodeToFD;
        if (CHECKS) {
            check(M);
        }
        return invokePI(M, FD, ShouldClose, Unbuffered, __functionAddress);
    }

    // --- [ LLVMWriteBitcodeToFileHandle ] ---

    /** {@code int LLVMWriteBitcodeToFileHandle(LLVMModuleRef M, int Handle)} */
    public static int LLVMWriteBitcodeToFileHandle(@NativeType("LLVMModuleRef") long M, int Handle) {
        long __functionAddress = Functions.WriteBitcodeToFileHandle;
        if (CHECKS) {
            check(M);
        }
        return invokePI(M, Handle, __functionAddress);
    }

    // --- [ LLVMWriteBitcodeToMemoryBuffer ] ---

    /** {@code LLVMMemoryBufferRef LLVMWriteBitcodeToMemoryBuffer(LLVMModuleRef M)} */
    @NativeType("LLVMMemoryBufferRef")
    public static long LLVMWriteBitcodeToMemoryBuffer(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.WriteBitcodeToMemoryBuffer;
        if (CHECKS) {
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

}