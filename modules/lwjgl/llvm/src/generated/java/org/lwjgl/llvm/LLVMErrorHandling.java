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

public class LLVMErrorHandling {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            InstallFatalErrorHandler = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInstallFatalErrorHandler"),
            ResetFatalErrorHandler   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMResetFatalErrorHandler"),
            EnablePrettyStackTrace   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMEnablePrettyStackTrace");

    }

    protected LLVMErrorHandling() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMInstallFatalErrorHandler ] ---

    /** {@code void LLVMInstallFatalErrorHandler(void (*) (char const *) Handler)} */
    public static void nLLVMInstallFatalErrorHandler(long Handler) {
        long __functionAddress = Functions.InstallFatalErrorHandler;
        invokePV(Handler, __functionAddress);
    }

    /** {@code void LLVMInstallFatalErrorHandler(void (*) (char const *) Handler)} */
    public static void LLVMInstallFatalErrorHandler(@NativeType("void (*) (char const *)") LLVMFatalErrorHandlerI Handler) {
        nLLVMInstallFatalErrorHandler(Handler.address());
    }

    // --- [ LLVMResetFatalErrorHandler ] ---

    /** {@code void LLVMResetFatalErrorHandler(void)} */
    public static void LLVMResetFatalErrorHandler() {
        long __functionAddress = Functions.ResetFatalErrorHandler;
        invokeV(__functionAddress);
    }

    // --- [ LLVMEnablePrettyStackTrace ] ---

    /** {@code void LLVMEnablePrettyStackTrace(void)} */
    public static void LLVMEnablePrettyStackTrace() {
        long __functionAddress = Functions.EnablePrettyStackTrace;
        invokeV(__functionAddress);
    }

}