/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMInitialization = "LLVMInitialization".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE,
    library = LLVM_LIBRARY
) {
    documentation = ""

    void("InitializeCore", "", LLVMPassRegistryRef("R", ""))
    void("InitializeTransformUtils", "", LLVMPassRegistryRef("R", ""))
    void("InitializeScalarOpts", "", LLVMPassRegistryRef("R", ""))
    void("InitializeObjCARCOpts", "", LLVMPassRegistryRef("R", ""))
    void("InitializeVectorization", "", LLVMPassRegistryRef("R", ""))
    void("InitializeInstCombine", "", LLVMPassRegistryRef("R", ""))
    void("InitializeAggressiveInstCombiner", "", LLVMPassRegistryRef("R", ""))
    void("InitializeIPO", "", LLVMPassRegistryRef("R", ""))
    void("InitializeInstrumentation", "", LLVMPassRegistryRef("R", ""))
    void("InitializeAnalysis", "", LLVMPassRegistryRef("R", ""))
    void("InitializeIPA", "", LLVMPassRegistryRef("R", ""))
    void("InitializeCodeGen", "", LLVMPassRegistryRef("R", ""))
    void("InitializeTarget", "", LLVMPassRegistryRef("R", ""))
}