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

    /** {@code LLVMOrcObjectLayerRef LLVMOrcCreateRTDyldObjectLinkingLayerWithSectionMemoryManager(LLVMOrcExecutionSessionRef ES)} */
    @NativeType("LLVMOrcObjectLayerRef")
    public static long LLVMOrcCreateRTDyldObjectLinkingLayerWithSectionMemoryManager(@NativeType("LLVMOrcExecutionSessionRef") long ES) {
        long __functionAddress = Functions.OrcCreateRTDyldObjectLinkingLayerWithSectionMemoryManager;
        if (CHECKS) {
            check(ES);
        }
        return invokePP(ES, __functionAddress);
    }

    // --- [ LLVMOrcCreateRTDyldObjectLinkingLayerWithMCJITMemoryManagerLikeCallbacks ] ---

    /** {@code LLVMOrcObjectLayerRef LLVMOrcCreateRTDyldObjectLinkingLayerWithMCJITMemoryManagerLikeCallbacks(LLVMOrcExecutionSessionRef ES, void * CreateContextCtx, LLVMMemoryManagerCreateContextCallback CreateContext, LLVMMemoryManagerNotifyTerminatingCallback NotifyTerminating, uint8_t * (*) (void *, uintptr_t, unsigned int, unsigned int, char const *) AllocateCodeSection, uint8_t * (*) (void *, uintptr_t, unsigned int, unsigned int, char const *, LLVMBool) AllocateDataSection, LLVMBool (*) (void *, char **) FinalizeMemory, void (*) (void *) Destroy)} */
    public static long nLLVMOrcCreateRTDyldObjectLinkingLayerWithMCJITMemoryManagerLikeCallbacks(long ES, long CreateContextCtx, long CreateContext, long NotifyTerminating, long AllocateCodeSection, long AllocateDataSection, long FinalizeMemory, long Destroy) {
        long __functionAddress = Functions.OrcCreateRTDyldObjectLinkingLayerWithMCJITMemoryManagerLikeCallbacks;
        if (CHECKS) {
            check(__functionAddress);
            check(ES);
        }
        return invokePPPPPPPPP(ES, CreateContextCtx, CreateContext, NotifyTerminating, AllocateCodeSection, AllocateDataSection, FinalizeMemory, Destroy, __functionAddress);
    }

    /** {@code LLVMOrcObjectLayerRef LLVMOrcCreateRTDyldObjectLinkingLayerWithMCJITMemoryManagerLikeCallbacks(LLVMOrcExecutionSessionRef ES, void * CreateContextCtx, LLVMMemoryManagerCreateContextCallback CreateContext, LLVMMemoryManagerNotifyTerminatingCallback NotifyTerminating, uint8_t * (*) (void *, uintptr_t, unsigned int, unsigned int, char const *) AllocateCodeSection, uint8_t * (*) (void *, uintptr_t, unsigned int, unsigned int, char const *, LLVMBool) AllocateDataSection, LLVMBool (*) (void *, char **) FinalizeMemory, void (*) (void *) Destroy)} */
    @NativeType("LLVMOrcObjectLayerRef")
    public static long LLVMOrcCreateRTDyldObjectLinkingLayerWithMCJITMemoryManagerLikeCallbacks(@NativeType("LLVMOrcExecutionSessionRef") long ES, @NativeType("void *") long CreateContextCtx, @NativeType("LLVMMemoryManagerCreateContextCallback") LLVMMemoryManagerCreateContextCallbackI CreateContext, @NativeType("LLVMMemoryManagerNotifyTerminatingCallback") LLVMMemoryManagerNotifyTerminatingCallbackI NotifyTerminating, @NativeType("uint8_t * (*) (void *, uintptr_t, unsigned int, unsigned int, char const *)") LLVMMemoryManagerAllocateCodeSectionCallbackI AllocateCodeSection, @NativeType("uint8_t * (*) (void *, uintptr_t, unsigned int, unsigned int, char const *, LLVMBool)") LLVMMemoryManagerAllocateDataSectionCallbackI AllocateDataSection, @NativeType("LLVMBool (*) (void *, char **)") LLVMMemoryManagerFinalizeMemoryCallbackI FinalizeMemory, @NativeType("void (*) (void *)") LLVMMemoryManagerDestroyCallbackI Destroy) {
        return nLLVMOrcCreateRTDyldObjectLinkingLayerWithMCJITMemoryManagerLikeCallbacks(ES, CreateContextCtx, CreateContext.address(), NotifyTerminating.address(), AllocateCodeSection.address(), AllocateDataSection.address(), FinalizeMemory.address(), Destroy.address());
    }

    // --- [ LLVMOrcRTDyldObjectLinkingLayerRegisterJITEventListener ] ---

    /** {@code void LLVMOrcRTDyldObjectLinkingLayerRegisterJITEventListener(LLVMOrcObjectLayerRef RTDyldObjLinkingLayer, LLVMJITEventListenerRef Listener)} */
    public static void LLVMOrcRTDyldObjectLinkingLayerRegisterJITEventListener(@NativeType("LLVMOrcObjectLayerRef") long RTDyldObjLinkingLayer, @NativeType("LLVMJITEventListenerRef") long Listener) {
        long __functionAddress = Functions.OrcRTDyldObjectLinkingLayerRegisterJITEventListener;
        if (CHECKS) {
            check(RTDyldObjLinkingLayer);
            check(Listener);
        }
        invokePPV(RTDyldObjLinkingLayer, Listener, __functionAddress);
    }

}