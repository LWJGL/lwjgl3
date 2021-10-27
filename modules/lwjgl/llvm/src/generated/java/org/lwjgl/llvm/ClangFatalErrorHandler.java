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

/** Requires Clang 10 or higher. */
public class ClangFatalErrorHandler {

    private static final SharedLibrary CLANG = Library.loadNative(ClangFatalErrorHandler.class, "org.lwjgl.llvm", Configuration.LLVM_CLANG_LIBRARY_NAME, "clang", "libclang");

    /** Contains the function pointers loaded from the CLANG {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            install_aborting_llvm_fatal_error_handler = CLANG.getFunctionAddress("clang_install_aborting_llvm_fatal_error_handler"),
            uninstall_llvm_fatal_error_handler        = CLANG.getFunctionAddress("clang_uninstall_llvm_fatal_error_handler");

    }

    /** Returns the CLANG {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return CLANG;
    }

    protected ClangFatalErrorHandler() {
        throw new UnsupportedOperationException();
    }

    // --- [ clang_install_aborting_llvm_fatal_error_handler ] ---

    /** Installs error handler that prints error message to {@code stderr} and calls {@code abort()}. Replaces currently installed error handler (if any). */
    public static void clang_install_aborting_llvm_fatal_error_handler() {
        long __functionAddress = Functions.install_aborting_llvm_fatal_error_handler;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress);
    }

    // --- [ clang_uninstall_llvm_fatal_error_handler ] ---

    /**
     * Removes currently installed error handler (if any).
     * 
     * <p>If no error handler is intalled, the default strategy is to print error message to {@code stderr} and call {@code exit(1)}.</p>
     */
    public static void clang_uninstall_llvm_fatal_error_handler() {
        long __functionAddress = Functions.uninstall_llvm_fatal_error_handler;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress);
    }

}