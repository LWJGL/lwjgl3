/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMTargetMips = "LLVMTargetMips".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    void("InitializeMipsTargetInfo",   void())
    void("InitializeMipsTarget",       void())
    void("InitializeMipsTargetMC",     void())
    void("InitializeMipsAsmPrinter",   void())
    void("InitializeMipsAsmParser",    void())
    void("InitializeMipsDisassembler", void())
}