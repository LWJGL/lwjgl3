/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link LLVMCore#LLVMContextSetDiagnosticHandler ContextSetDiagnosticHandler} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     LLVMDiagnosticInfoRef DiagnosticInfo,
 *     void *DiagnosticContext
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (LLVMDiagnosticInfoRef, void *)")
public interface LLVMDiagnosticHandlerI extends CallbackI.V {

    String SIGNATURE = "(pp)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    void invoke(@NativeType("LLVMDiagnosticInfoRef") long DiagnosticInfo, @NativeType("void *") long DiagnosticContext);

}