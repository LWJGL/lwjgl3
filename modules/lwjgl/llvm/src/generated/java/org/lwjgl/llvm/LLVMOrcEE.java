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
            OrcCreateRTDyldObjectLinkingLayerWithSectionMemoryManager = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcCreateRTDyldObjectLinkingLayerWithSectionMemoryManager"),
            OrcRTDyldObjectLinkingLayerRegisterJITEventListener       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcRTDyldObjectLinkingLayerRegisterJITEventListener");

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