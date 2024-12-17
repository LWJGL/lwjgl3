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

public class LLVMAnalysis {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            VerifyModule        = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMVerifyModule"),
            VerifyFunction      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMVerifyFunction"),
            ViewFunctionCFG     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMViewFunctionCFG"),
            ViewFunctionCFGOnly = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMViewFunctionCFGOnly");

    }

    public static final int
        LLVMAbortProcessAction = 0,
        LLVMPrintMessageAction = 1,
        LLVMReturnStatusAction = 2;

    protected LLVMAnalysis() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMVerifyModule ] ---

    /** {@code LLVMBool LLVMVerifyModule(LLVMModuleRef M, LLVMVerifierFailureAction Action, char ** OutMessage)} */
    public static int nLLVMVerifyModule(long M, int Action, long OutMessage) {
        long __functionAddress = Functions.VerifyModule;
        if (CHECKS) {
            check(M);
        }
        return invokePPI(M, Action, OutMessage, __functionAddress);
    }

    /** {@code LLVMBool LLVMVerifyModule(LLVMModuleRef M, LLVMVerifierFailureAction Action, char ** OutMessage)} */
    @NativeType("LLVMBool")
    public static boolean LLVMVerifyModule(@NativeType("LLVMModuleRef") long M, @NativeType("LLVMVerifierFailureAction") int Action, @NativeType("char **") PointerBuffer OutMessage) {
        if (CHECKS) {
            check(OutMessage, 1);
        }
        return nLLVMVerifyModule(M, Action, memAddress(OutMessage)) != 0;
    }

    // --- [ LLVMVerifyFunction ] ---

    /** {@code LLVMBool LLVMVerifyFunction(LLVMValueRef Fn, LLVMVerifierFailureAction Action)} */
    @NativeType("LLVMBool")
    public static boolean LLVMVerifyFunction(@NativeType("LLVMValueRef") long Fn, @NativeType("LLVMVerifierFailureAction") int Action) {
        long __functionAddress = Functions.VerifyFunction;
        if (CHECKS) {
            check(Fn);
        }
        return invokePI(Fn, Action, __functionAddress) != 0;
    }

    // --- [ LLVMViewFunctionCFG ] ---

    /** {@code void LLVMViewFunctionCFG(LLVMValueRef Fn)} */
    public static void LLVMViewFunctionCFG(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.ViewFunctionCFG;
        if (CHECKS) {
            check(Fn);
        }
        invokePV(Fn, __functionAddress);
    }

    // --- [ LLVMViewFunctionCFGOnly ] ---

    /** {@code void LLVMViewFunctionCFGOnly(LLVMValueRef Fn)} */
    public static void LLVMViewFunctionCFGOnly(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.ViewFunctionCFGOnly;
        if (CHECKS) {
            check(Fn);
        }
        invokePV(Fn, __functionAddress);
    }

}