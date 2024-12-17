/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMTargetAArch64 = "LLVMTargetAArch64".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    void("InitializeAArch64TargetInfo",   void())
    void("InitializeAArch64Target",       void())
    void("InitializeAArch64TargetMC",     void())
    void("InitializeAArch64AsmPrinter",   void())
    void("InitializeAArch64AsmParser",    void())
    void("InitializeAArch64Disassembler", void())
}