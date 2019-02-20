/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMTargetX86 = "LLVMTargetX86".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    documentation = ""

    void("InitializeX86TargetInfo", "", void())
    void("InitializeX86Target", "", void())
    void("InitializeX86TargetMC", "", void())
    void("InitializeX86AsmPrinter", "", void())
    void("InitializeX86AsmParser", "", void())
    void("InitializeX86Disassembler", "", void())
}