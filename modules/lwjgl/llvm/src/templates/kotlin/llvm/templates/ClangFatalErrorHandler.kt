/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val ClangFatalErrorHandler = "ClangFatalErrorHandler".nativeClass(
    Module.LLVM,
    prefixConstant = "CX",
    prefixMethod = "clang_",
    binding = CLANG_BINDING
) {
    documentation = "Requires Clang 10 or higher."

    IgnoreMissing..void(
        "install_aborting_llvm_fatal_error_handler",
        "Installs error handler that prints error message to {@code stderr} and calls {@code abort()}. Replaces currently installed error handler (if any).",

        void()
    )

    IgnoreMissing..void(
        "uninstall_llvm_fatal_error_handler",
        """
        Removes currently installed error handler (if any).

        If no error handler is intalled, the default strategy is to print error message to {@code stderr} and call {@code exit(1)}.
        """,

        void()
    )
}