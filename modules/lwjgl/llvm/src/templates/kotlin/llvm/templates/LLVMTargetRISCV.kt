/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMTargetRISCV = "LLVMTargetRISCV".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    void("InitializeRISCVTargetInfo",   void())
    void("InitializeRISCVTarget",       void())
    void("InitializeRISCVTargetMC",     void())
    IgnoreMissing..
    void("InitializeRISCVTargetMCA",    void())
    void("InitializeRISCVAsmPrinter",   void())
    void("InitializeRISCVAsmParser",    void())
    void("InitializeRISCVDisassembler", void())
}