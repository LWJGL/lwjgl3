/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMBitWriter = "LLVMBitWriter".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    int(
        "WriteBitcodeToFile",

        LLVMModuleRef("M"),
        charUTF8.const.p("Path")
    )

    int(
        "WriteBitcodeToFD",

        LLVMModuleRef("M"),
        int("FD"),
        int("ShouldClose"),
        int("Unbuffered")
    )

    int(
        "WriteBitcodeToFileHandle",

        LLVMModuleRef("M"),
        int("Handle")
    )

    LLVMMemoryBufferRef(
        "WriteBitcodeToMemoryBuffer",

        LLVMModuleRef("M")
    )
}