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
    documentation = ""

    LLVMBool(
        "ParseIRInContext",
        """
        Read LLVM IR from a memory buffer and convert it into an in-memory {@code Module} object.

        Returns 0 on success. Optionally returns a human-readable description of any errors that occurred during parsing IR. {@code OutMessage} must be
        disposed with #DisposeMessage().
        """,

        LLVMContextRef("ContextRef", ""),
        LLVMMemoryBufferRef("MemBuf", ""),
        Check(1)..LLVMModuleRef.p("OutM", ""),
        Check(1)..charUTF8.p.p("OutMessage", "")
    )
}