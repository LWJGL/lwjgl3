/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMOrcEE = "LLVMOrcEE".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    LLVMOrcObjectLayerRef(
        "OrcCreateRTDyldObjectLinkingLayerWithSectionMemoryManager",

        LLVMOrcExecutionSessionRef("ES")
    )

    IgnoreMissing..LLVMOrcObjectLayerRef(
        "OrcCreateRTDyldObjectLinkingLayerWithMCJITMemoryManagerLikeCallbacks",

        LLVMOrcExecutionSessionRef("ES"),
        nullable..opaque_p("CreateContextCtx"),
        LLVMMemoryManagerCreateContextCallback("CreateContext"),
        LLVMMemoryManagerNotifyTerminatingCallback("NotifyTerminating"),
        LLVMMemoryManagerAllocateCodeSectionCallback("AllocateCodeSection"),
        LLVMMemoryManagerAllocateDataSectionCallback("AllocateDataSection"),
        LLVMMemoryManagerFinalizeMemoryCallback("FinalizeMemory"),
        LLVMMemoryManagerDestroyCallback("Destroy")
    )

    void(
        "OrcRTDyldObjectLinkingLayerRegisterJITEventListener",

        LLVMOrcObjectLayerRef("RTDyldObjLinkingLayer"),
        LLVMJITEventListenerRef("Listener")
    )
}
