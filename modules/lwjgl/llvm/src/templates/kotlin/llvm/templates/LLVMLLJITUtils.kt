/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMLLJITUtils = "LLVMLLJITUtils".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    LLVMErrorRef(
        "OrcLLJITEnableDebugSupport",

        LLVMOrcLLJITRef("J")
    )
}