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
    documentation = ""

    void(
        "InstallFatalErrorHandler",
        """
        Install a fatal error handler. By default, if LLVM detects a fatal error, it will call {@code exit(1)}. This may not be appropriate in many contexts.
        For example, doing {@code exit(1)} will bypass many crash reporting/tracing system tools. This function allows you to install a callback that will be
        invoked prior to the call to {@code exit(1)}.
        """,

        LLVMFatalErrorHandler("Handler", "")
    )

    void(
        "ResetFatalErrorHandler",
        "Reset the fatal error handler. This resets LLVM's fatal error handling behavior to the default.",

        void()
    )

    void(
        "EnablePrettyStackTrace",
        """
        Enable LLVM's built-in stack trace code. This intercepts the OS's crash signals and prints which component of LLVM you were in at the time if the
        crash.
        """,

        void()
    )
}