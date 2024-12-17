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
    EnumConstant(
        "AbortProcessAction".enum("0"),
        "PrintMessageAction".enum,
        "ReturnStatusAction".enum
    )

    LLVMBool(
        "VerifyModule",

        LLVMModuleRef("M"),
        LLVMVerifierFailureAction("Action"),
        Check(1)..charUTF8.p.p("OutMessage")
    )

    LLVMBool(
        "VerifyFunction",

        LLVMValueRef("Fn"),
        LLVMVerifierFailureAction("Action")
    )

    void(
        "ViewFunctionCFG",

        LLVMValueRef("Fn")
    )

    void(
        "ViewFunctionCFGOnly",

        LLVMValueRef("Fn")
    )
}