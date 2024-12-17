/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class LLVMLLJITUtils {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            OrcLLJITEnableDebugSupport = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcLLJITEnableDebugSupport");

    }

    protected LLVMLLJITUtils() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMOrcLLJITEnableDebugSupport ] ---

    /** {@code LLVMErrorRef LLVMOrcLLJITEnableDebugSupport(LLVMOrcLLJITRef J)} */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcLLJITEnableDebugSupport(@NativeType("LLVMOrcLLJITRef") long J) {
        long __functionAddress = Functions.OrcLLJITEnableDebugSupport;
        if (CHECKS) {
            check(J);
        }
        return invokePP(J, __functionAddress);
    }

}