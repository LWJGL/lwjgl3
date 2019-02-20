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
    documentation = ""

    LLVMBool(
        "ParseBitcode",
        """
        Builds a module from the bitcode in the specified memory buffer, returning a reference to the module via the {@code OutModule} parameter. Returns 0 on
        success. Optionally returns a human-readable error message via {@code OutMessage}.

        This is deprecated. Use LLVMParseBitcode2.
        """,

        LLVMMemoryBufferRef("MemBuf", ""),
        Check(1)..LLVMModuleRef.p("OutModule", ""),
        Check(1)..charUTF8.p.p("OutMessage", "")
    )

    LLVMBool(
        "ParseBitcode2",
        """
        Builds a module from the bitcode in the specified memory buffer, returning a reference to the module via the {@code OutModule} parameter. Returns 0 on
        success.
        """,

        LLVMMemoryBufferRef("MemBuf", ""),
        Check(1)..LLVMModuleRef.p("OutModule", "")
    )

    LLVMBool(
        "ParseBitcodeInContext",
        "This is deprecated. Use #ParseBitcodeInContext2().",

        LLVMContextRef("ContextRef", ""),
        LLVMMemoryBufferRef("MemBuf", ""),
        Check(1)..LLVMModuleRef.p("OutModule", ""),
        Check(1)..charUTF8.p.p("OutMessage", "")
    )

    LLVMBool(
        "ParseBitcodeInContext2",
        "",

        LLVMContextRef("ContextRef", ""),
        LLVMMemoryBufferRef("MemBuf", ""),
        Check(1)..LLVMModuleRef.p("OutModule", "")
    )

    LLVMBool(
        "GetBitcodeModuleInContext",
        """
        Reads a module from the specified path, returning via the {@code OutMP} parameter a module provider which performs lazy deserialization. Returns 0 on
        success. Optionally returns a human-readable error message via {@code OutMessage}. This is deprecated. Use #GetBitcodeModuleInContext2().
        """,

        LLVMContextRef("ContextRef", ""),
        LLVMMemoryBufferRef("MemBuf", ""),
        Check(1)..LLVMModuleRef.p("OutM", ""),
        Check(1)..charUTF8.p.p("OutMessage", "")
    )

    LLVMBool(
        "GetBitcodeModuleInContext2",
        """
        Reads a module from the specified path, returning via the {@code OutMP} parameter a module provider which performs lazy deserialization. Returns 0 on
        success.
        """,

        LLVMContextRef("ContextRef", ""),
        LLVMMemoryBufferRef("MemBuf", ""),
        Check(1)..LLVMModuleRef.p("OutM", "")
    )

    LLVMBool(
        "GetBitcodeModule",
        "This is deprecated. Use #GetBitcodeModule2().",

        LLVMMemoryBufferRef("MemBuf", ""),
        Check(1)..LLVMModuleRef.p("OutM", ""),
        Check(1)..charUTF8.p.p("OutMessage", "")
    )

    LLVMBool(
        "GetBitcodeModule2",
        "",

        LLVMMemoryBufferRef("MemBuf", ""),
        Check(1)..LLVMModuleRef.p("OutM", "")
    )
}