/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMTargetARM = "LLVMTargetARM".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    void("InitializeARMTargetInfo",   void())
    void("InitializeARMTarget",       void())
    void("InitializeARMTargetMC",     void())
    void("InitializeARMAsmPrinter",   void())
    void("InitializeARMAsmParser",    void())
    void("InitializeARMDisassembler", void())
}