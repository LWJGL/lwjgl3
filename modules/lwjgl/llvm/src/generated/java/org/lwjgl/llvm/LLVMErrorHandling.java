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

    /** Unsafe version of: {@link #LLVMInstallFatalErrorHandler InstallFatalErrorHandler} */
    public static void nLLVMInstallFatalErrorHandler(long Handler) {
        long __functionAddress = Functions.InstallFatalErrorHandler;
        invokePV(Handler, __functionAddress);
    }

    /**
     * Install a fatal error handler. By default, if LLVM detects a fatal error, it will call {@code exit(1)}. This may not be appropriate in many contexts.
     * For example, doing {@code exit(1)} will bypass many crash reporting/tracing system tools. This function allows you to install a callback that will be
     * invoked prior to the call to {@code exit(1)}.
     */
    public static void LLVMInstallFatalErrorHandler(@NativeType("void (*) (char const *)") LLVMFatalErrorHandlerI Handler) {
        nLLVMInstallFatalErrorHandler(Handler.address());
    }

    // --- [ LLVMResetFatalErrorHandler ] ---

    /** Reset the fatal error handler. This resets LLVM's fatal error handling behavior to the default. */
    public static void LLVMResetFatalErrorHandler() {
        long __functionAddress = Functions.ResetFatalErrorHandler;
        invokeV(__functionAddress);
    }

    // --- [ LLVMEnablePrettyStackTrace ] ---

    /**
     * Enable LLVM's built-in stack trace code. This intercepts the OS's crash signals and prints which component of LLVM you were in at the time if the
     * crash.
     */
    public static void LLVMEnablePrettyStackTrace() {
        long __functionAddress = Functions.EnablePrettyStackTrace;
        invokeV(__functionAddress);
    }

}