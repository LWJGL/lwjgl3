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

public class ClangFatalErrorHandler {

    /** Contains the function pointers loaded from {@code ClangIndex.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            install_aborting_llvm_fatal_error_handler = apiGetFunctionAddressOptional(ClangIndex.getLibrary(), "clang_install_aborting_llvm_fatal_error_handler"),
            uninstall_llvm_fatal_error_handler        = apiGetFunctionAddressOptional(ClangIndex.getLibrary(), "clang_uninstall_llvm_fatal_error_handler");

    }

    protected ClangFatalErrorHandler() {
        throw new UnsupportedOperationException();
    }

    // --- [ clang_install_aborting_llvm_fatal_error_handler ] ---

    /** {@code void clang_install_aborting_llvm_fatal_error_handler(void)} */
    public static void clang_install_aborting_llvm_fatal_error_handler() {
        long __functionAddress = Functions.install_aborting_llvm_fatal_error_handler;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress);
    }

    // --- [ clang_uninstall_llvm_fatal_error_handler ] ---

    /** {@code void clang_uninstall_llvm_fatal_error_handler(void)} */
    public static void clang_uninstall_llvm_fatal_error_handler() {
        long __functionAddress = Functions.uninstall_llvm_fatal_error_handler;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress);
    }

}