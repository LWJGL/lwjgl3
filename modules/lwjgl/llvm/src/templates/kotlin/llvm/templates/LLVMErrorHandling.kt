/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMErrorHandling = "LLVMErrorHandling".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    void(
        "InstallFatalErrorHandler",

        LLVMFatalErrorHandler("Handler")
    )

    void(
        "ResetFatalErrorHandler",

        void()
    )

    void(
        "EnablePrettyStackTrace",

        void()
    )
}