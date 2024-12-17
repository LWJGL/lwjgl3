/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMLinker = "LLVMLinker".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    EnumConstant(
        "LinkerDestroySource".enum("0"),
        "LinkerPreserveSource_Removed".enum
    )

    LLVMBool(
        "LinkModules2",

        LLVMModuleRef("Dest"),
        LLVMModuleRef("Src")
    )
}