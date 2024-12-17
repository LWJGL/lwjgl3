/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMBitReader = "LLVMBitReader".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    LLVMBool(
        "ParseBitcode",

        LLVMMemoryBufferRef("MemBuf"),
        Check(1)..LLVMModuleRef.p("OutModule"),
        Check(1)..charUTF8.p.p("OutMessage")
    )

    LLVMBool(
        "ParseBitcode2",

        LLVMMemoryBufferRef("MemBuf"),
        Check(1)..LLVMModuleRef.p("OutModule")
    )

    LLVMBool(
        "ParseBitcodeInContext",

        LLVMContextRef("ContextRef"),
        LLVMMemoryBufferRef("MemBuf"),
        Check(1)..LLVMModuleRef.p("OutModule"),
        Check(1)..charUTF8.p.p("OutMessage")
    )

    LLVMBool(
        "ParseBitcodeInContext2",

        LLVMContextRef("ContextRef"),
        LLVMMemoryBufferRef("MemBuf"),
        Check(1)..LLVMModuleRef.p("OutModule")
    )

    LLVMBool(
        "GetBitcodeModuleInContext",

        LLVMContextRef("ContextRef"),
        LLVMMemoryBufferRef("MemBuf"),
        Check(1)..LLVMModuleRef.p("OutM"),
        Check(1)..charUTF8.p.p("OutMessage")
    )

    LLVMBool(
        "GetBitcodeModuleInContext2",

        LLVMContextRef("ContextRef"),
        LLVMMemoryBufferRef("MemBuf"),
        Check(1)..LLVMModuleRef.p("OutM")
    )

    LLVMBool(
        "GetBitcodeModule",

        LLVMMemoryBufferRef("MemBuf"),
        Check(1)..LLVMModuleRef.p("OutM"),
        Check(1)..charUTF8.p.p("OutMessage")
    )

    LLVMBool(
        "GetBitcodeModule2",

        LLVMMemoryBufferRef("MemBuf"),
        Check(1)..LLVMModuleRef.p("OutM")
    )
}