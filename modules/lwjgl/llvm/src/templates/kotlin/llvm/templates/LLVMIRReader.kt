/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMIRReader = "LLVMIRReader".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    LLVMBool(
        "ParseIRInContext",

        LLVMContextRef("ContextRef"),
        LLVMMemoryBufferRef("MemBuf"),
        Check(1)..LLVMModuleRef.p("OutM"),
        Check(1)..charUTF8.p.p("OutMessage")
    )
}