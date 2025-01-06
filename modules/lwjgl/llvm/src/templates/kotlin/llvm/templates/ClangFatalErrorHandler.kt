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
    binding = CLANG_BINDING_DELEGATE
) {
    IgnoreMissing..void("install_aborting_llvm_fatal_error_handler", void())
    IgnoreMissing..void("uninstall_llvm_fatal_error_handler", void())
}