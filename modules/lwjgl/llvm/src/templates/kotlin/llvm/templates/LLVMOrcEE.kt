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
