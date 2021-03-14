/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class LLVMIRReader {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ParseIRInContext = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMParseIRInContext");

    }

    protected LLVMIRReader() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMParseIRInContext ] ---

    /** Unsafe version of: {@link #LLVMParseIRInContext ParseIRInContext} */
    public static int nLLVMParseIRInContext(long ContextRef, long MemBuf, long OutM, long OutMessage) {
        long __functionAddress = Functions.ParseIRInContext;
        if (CHECKS) {
            check(ContextRef);
            check(MemBuf);
        }
        return invokePPPPI(ContextRef, MemBuf, OutM, OutMessage, __functionAddress);
    }

    /**
     * Read LLVM IR from a memory buffer and convert it into an in-memory {@code Module} object.
     * 
     * <p>Returns 0 on success. Optionally returns a human-readable description of any errors that occurred during parsing IR. {@code OutMessage} must be
     * disposed with {@link LLVMCore#LLVMDisposeMessage DisposeMessage}.</p>
     */
    @NativeType("LLVMBool")
    public static boolean LLVMParseIRInContext(@NativeType("LLVMContextRef") long ContextRef, @NativeType("LLVMMemoryBufferRef") long MemBuf, @NativeType("LLVMModuleRef *") PointerBuffer OutM, @NativeType("char **") PointerBuffer OutMessage) {
        if (CHECKS) {
            check(OutM, 1);
            check(OutMessage, 1);
        }
        return nLLVMParseIRInContext(ContextRef, MemBuf, memAddress(OutM), memAddress(OutMessage)) != 0;
    }

}