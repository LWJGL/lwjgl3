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
    documentation = "Requires LLVM 18.0 or higher."

    LLVMErrorRef(
        "OrcLLJITEnableDebugSupport",
        "Install the plugin that submits debug objects to the executor. Executors must expose the {@code llvm_orc_registerJITLoaderGDBWrapper} symbol.",

        LLVMOrcLLJITRef("J", ""),

        since = "18"
    )
}