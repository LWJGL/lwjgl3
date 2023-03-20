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
    documentation = "Requires LLVM 12 or higher."

    LLVMOrcObjectLayerRef(
        "OrcCreateRTDyldObjectLinkingLayerWithSectionMemoryManager",
        "Create a {@code RTDyldObjectLinkingLayer} instance using the standard {@code SectionMemoryManager} for memory management.",

        LLVMOrcExecutionSessionRef("ES", "")
    )

    IgnoreMissing..LLVMOrcObjectLayerRef(
        "OrcCreateRTDyldObjectLinkingLayerWithMCJITMemoryManagerLikeCallbacks",
        """
        Create a {@code RTDyldObjectLinkingLayer} instance using MCJIT-memory-manager-like callbacks.

        This is intended to simplify transitions for existing MCJIT clients. The callbacks used are similar (but not identical) to the callbacks for
        #CreateSimpleMCJITMemoryManager()): Unlike MCJIT, {@code RTDyldObjectLinkingLayer} will create a new memory manager for each object linked by calling
        the given {@code CreateContext} callback. This allows for code removal by destroying each allocator individually. Every allocator will be destroyed (if
        it has not been already) at {@code RTDyldObjectLinkingLayer} destruction time, and the {@code NotifyTerminating} callback will be called to indicate
        that no further allocation contexts will be created.

        To implement MCJIT-like behavior clients can implement {@code CreateContext}, {@code NotifyTerminating}, and {@code Destroy} as:
        ${codeBlock("""
void *CreateContext(void *CtxCtx) { return CtxCtx; }
void NotifyTerminating(void *CtxCtx) { MyOriginalDestroy(CtxCtx); }
void Destroy(void *Ctx) { }""")}

        This scheme simply reuses the {@code CreateContextCtx} pointer as the one-and-only allocation context.
        """,

        LLVMOrcExecutionSessionRef("ES", ""),
        nullable..opaque_p("CreateContextCtx", ""),
        LLVMMemoryManagerCreateContextCallback("CreateContext", ""),
        LLVMMemoryManagerNotifyTerminatingCallback("NotifyTerminating", ""),
        LLVMMemoryManagerAllocateCodeSectionCallback("AllocateCodeSection", ""),
        LLVMMemoryManagerAllocateDataSectionCallback("AllocateDataSection", ""),
        LLVMMemoryManagerFinalizeMemoryCallback("FinalizeMemory", ""),
        LLVMMemoryManagerDestroyCallback("Destroy", "")
    )

    void(
        "OrcRTDyldObjectLinkingLayerRegisterJITEventListener",
        """
        Add the given listener to the given {@code RTDyldObjectLinkingLayer}.

        Note: Layer must be an {@code RTDyldObjectLinkingLayer} instance or behavior is undefined.
        """,

        LLVMOrcObjectLayerRef("RTDyldObjLinkingLayer", ""),
        LLVMJITEventListenerRef("Listener", "")
    )
}
