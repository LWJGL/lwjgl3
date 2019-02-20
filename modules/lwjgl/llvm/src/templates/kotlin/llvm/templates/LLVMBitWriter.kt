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
    documentation = ""

    int(
        "WriteBitcodeToFile",
        "Writes a module to the specified path. Returns 0 on success.",

        LLVMModuleRef("M", ""),
        charUTF8.const.p("Path", "")
    )

    int(
        "WriteBitcodeToFD",
        "Writes a module to an open file descriptor. Returns 0 on success.",

        LLVMModuleRef("M", ""),
        int("FD", ""),
        int("ShouldClose", ""),
        int("Unbuffered", "")
    )

    int(
        "WriteBitcodeToFileHandle",
        "Deprecated for #WriteBitcodeToFD(). Writes a module to an open file descriptor. Returns 0 on success. Closes the {@code Handle}.",

        LLVMModuleRef("M", ""),
        int("Handle", "")
    )

    LLVMMemoryBufferRef(
        "WriteBitcodeToMemoryBuffer",
        "Writes a module to a new memory buffer and returns it.",

        LLVMModuleRef("M", "")
    )
}