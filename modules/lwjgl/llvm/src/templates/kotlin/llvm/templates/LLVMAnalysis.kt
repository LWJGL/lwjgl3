/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMAnalysis = "LLVMAnalysis".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    documentation = ""

    EnumConstant(
        "",

        "AbortProcessAction".enum("verifier will print to {@code stderr} and {@code abort()}", "0"),
        "PrintMessageAction".enum("verifier will print to {@code stderr} and {@code return 1}"),
        "ReturnStatusAction".enum("verifier will just {@code return 1}")
    )

    LLVMBool(
        "VerifyModule",
        """
        Verifies that a module is valid, taking the specified action if not. Optionally returns a human-readable description of any invalid constructs.
        {@code OutMessage} must be disposed with #DisposeMessage().
        """,

        LLVMModuleRef("M", ""),
        LLVMVerifierFailureAction("Action", ""),
        Check(1)..charUTF8.p.p("OutMessage", "")
    )

    LLVMBool(
        "VerifyFunction",
        "Verifies that a single function is valid, taking the specified action. Useful for debugging.",

        LLVMValueRef("Fn", ""),
        LLVMVerifierFailureAction("Action", "")
    )

    void(
        "ViewFunctionCFG",
        "Open up a ghostview window that displays the CFG of the current function. Useful for debugging.",

        LLVMValueRef("Fn", "")
    )

    void(
        "ViewFunctionCFGOnly",
        "",

        LLVMValueRef("Fn", "")
    )
}