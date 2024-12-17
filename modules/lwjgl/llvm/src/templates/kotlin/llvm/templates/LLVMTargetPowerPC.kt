/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMTargetPowerPC = "LLVMTargetPowerPC".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    void("InitializePowerPCTargetInfo",   void())
    void("InitializePowerPCTarget",       void())
    void("InitializePowerPCTargetMC",     void())
    void("InitializePowerPCAsmPrinter",   void())
    void("InitializePowerPCAsmParser",    void())
    void("InitializePowerPCDisassembler", void())
}