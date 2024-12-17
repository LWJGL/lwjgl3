/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMTargetAMDGPU = "LLVMTargetAMDGPU".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    void("InitializeAMDGPUTargetInfo",   void())
    void("InitializeAMDGPUTarget",       void())
    void("InitializeAMDGPUTargetMC",     void())
    IgnoreMissing..
    void("InitializeAMDGPUTargetMCA",    void())
    void("InitializeAMDGPUAsmPrinter",   void())
    void("InitializeAMDGPUAsmParser",    void())
    void("InitializeAMDGPUDisassembler", void())
}