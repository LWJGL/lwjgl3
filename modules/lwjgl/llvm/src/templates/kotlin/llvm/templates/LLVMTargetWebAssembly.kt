/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMTargetWebAssembly = "LLVMTargetWebAssembly".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    void("InitializeWebAssemblyTargetInfo",   void())
    void("InitializeWebAssemblyTarget",       void())
    void("InitializeWebAssemblyTargetMC",     void())
    void("InitializeWebAssemblyAsmPrinter",   void())
    void("InitializeWebAssemblyAsmParser",    void())
    void("InitializeWebAssemblyDisassembler", void())
}