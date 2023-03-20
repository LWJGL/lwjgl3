/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** Requires LLVM 12 or higher. */
public class LLVMOrcEE {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            OrcCreateRTDyldObjectLinkingLayerWithSectionMemoryManager            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcCreateRTDyldObjectLinkingLayerWithSectionMemoryManager"),
            OrcCreateRTDyldObjectLinkingLayerWithMCJITMemoryManagerLikeCallbacks = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMOrcCreateRTDyldObjectLinkingLayerWithMCJITMemoryManagerLikeCallbacks"),
            OrcRTDyldObjectLinkingLayerRegisterJITEventListener                  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcRTDyldObjectLinkingLayerRegisterJITEventListener");

    }

    protected LLVMOrcEE() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMOrcCreateRTDyldObjectLinkingLayerWithSectionMemoryManager ] ---

    /** Create a {@code RTDyldObjectLinkingLayer} instance using the standard {@code SectionMemoryManager} for memory management. */
    @NativeType("LLVMOrcObjectLayerRef")
    public static long LLVMOrcCreateRTDyldObjectLinkingLayerWithSectionMemoryManager(@NativeType("LLVMOrcExecutionSessionRef") long ES) {
        long __functionAddress = Functions.OrcCreateRTDyldObjectLinkingLayerWithSectionMemoryManager;
        if (CHECKS) {
            check(ES);
        }
        return invokePP(ES, __functionAddress);
    }

    // --- [ LLVMOrcCreateRTDyldObjectLinkingLayerWithMCJITMemoryManagerLikeCallbacks ] ---

    /** Unsafe version of: {@link #LLVMOrcCreateRTDyldObjectLinkingLayerWithMCJITMemoryManagerLikeCallbacks OrcCreateRTDyldObjectLinkingLayerWithMCJITMemoryManagerLikeCallbacks} */
    public static long nLLVMOrcCreateRTDyldObjectLinkingLayerWithMCJITMemoryManagerLikeCallbacks(long ES, long CreateContextCtx, long CreateContext, long NotifyTerminating, long AllocateCodeSection, long AllocateDataSection, long FinalizeMemory, long Destroy) {
        long __functionAddress = Functions.OrcCreateRTDyldObjectLinkingLayerWithMCJITMemoryManagerLikeCallbacks;
        if (CHECKS) {
            check(__functionAddress);
            check(ES);
        }
        return invokePPPPPPPPP(ES, CreateContextCtx, CreateContext, NotifyTerminating, AllocateCodeSection, AllocateDataSection, FinalizeMemory, Destroy, __functionAddress);
    }

    /**
     * Create a {@code RTDyldObjectLinkingLayer} instance using MCJIT-memory-manager-like callbacks.
     * 
     * <p>This is intended to simplify transitions for existing MCJIT clients. The callbacks used are similar (but not identical) to the callbacks for
     * {@link LLVMExecutionEngine#LLVMCreateSimpleMCJITMemoryManager CreateSimpleMCJITMemoryManager}): Unlike MCJIT, {@code RTDyldObjectLinkingLayer} will create a new memory manager for each object linked by calling
     * the given {@code CreateContext} callback. This allows for code removal by destroying each allocator individually. Every allocator will be destroyed (if
     * it has not been already) at {@code RTDyldObjectLinkingLayer} destruction time, and the {@code NotifyTerminating} callback will be called to indicate
     * that no further allocation contexts will be created.</p>
     * 
     * <p>To implement MCJIT-like behavior clients can implement {@code CreateContext}, {@code NotifyTerminating}, and {@code Destroy} as:</p>
     * 
     * <pre><code>
     * void *CreateContext(void *CtxCtx) { return CtxCtx; }
     * void NotifyTerminating(void *CtxCtx) { MyOriginalDestroy(CtxCtx); }
     * void Destroy(void *Ctx) { }</code></pre>
     * 
     * <p>This scheme simply reuses the {@code CreateContextCtx} pointer as the one-and-only allocation context.</p>
     */
    @NativeType("LLVMOrcObjectLayerRef")
    public static long LLVMOrcCreateRTDyldObjectLinkingLayerWithMCJITMemoryManagerLikeCallbacks(@NativeType("LLVMOrcExecutionSessionRef") long ES, @NativeType("void *") long CreateContextCtx, @NativeType("LLVMMemoryManagerCreateContextCallback") LLVMMemoryManagerCreateContextCallbackI CreateContext, @NativeType("LLVMMemoryManagerNotifyTerminatingCallback") LLVMMemoryManagerNotifyTerminatingCallbackI NotifyTerminating, @NativeType("uint8_t * (*) (void *, uintptr_t, unsigned int, unsigned int, char const *)") LLVMMemoryManagerAllocateCodeSectionCallbackI AllocateCodeSection, @NativeType("uint8_t * (*) (void *, uintptr_t, unsigned int, unsigned int, char const *, LLVMBool)") LLVMMemoryManagerAllocateDataSectionCallbackI AllocateDataSection, @NativeType("LLVMBool (*) (void *, char **)") LLVMMemoryManagerFinalizeMemoryCallbackI FinalizeMemory, @NativeType("void (*) (void *)") LLVMMemoryManagerDestroyCallbackI Destroy) {
        return nLLVMOrcCreateRTDyldObjectLinkingLayerWithMCJITMemoryManagerLikeCallbacks(ES, CreateContextCtx, CreateContext.address(), NotifyTerminating.address(), AllocateCodeSection.address(), AllocateDataSection.address(), FinalizeMemory.address(), Destroy.address());
    }

    // --- [ LLVMOrcRTDyldObjectLinkingLayerRegisterJITEventListener ] ---

    /**
     * Add the given listener to the given {@code RTDyldObjectLinkingLayer}.
     * 
     * <p>Note: Layer must be an {@code RTDyldObjectLinkingLayer} instance or behavior is undefined.</p>
     */
    public static void LLVMOrcRTDyldObjectLinkingLayerRegisterJITEventListener(@NativeType("LLVMOrcObjectLayerRef") long RTDyldObjLinkingLayer, @NativeType("LLVMJITEventListenerRef") long Listener) {
        long __functionAddress = Functions.OrcRTDyldObjectLinkingLayerRegisterJITEventListener;
        if (CHECKS) {
            check(RTDyldObjLinkingLayer);
            check(Listener);
        }
        invokePPV(RTDyldObjLinkingLayer, Listener, __functionAddress);
    }

}