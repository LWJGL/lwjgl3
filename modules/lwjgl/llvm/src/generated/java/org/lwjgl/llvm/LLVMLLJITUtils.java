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

/** Requires LLVM 18.0 or higher. */
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

    /**
     * Install the plugin that submits debug objects to the executor. Executors must expose the {@code llvm_orc_registerJITLoaderGDBWrapper} symbol.
     *
     * @since 18
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcLLJITEnableDebugSupport(@NativeType("LLVMOrcLLJITRef") long J) {
        long __functionAddress = Functions.OrcLLJITEnableDebugSupport;
        if (CHECKS) {
            check(J);
        }
        return invokePP(J, __functionAddress);
    }

}