/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link LLVMORC#LLVMOrcCreateLazyCompileCallback OrcCreateLazyCompileCallback} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * uint64_t (*) (
 *     LLVMOrcJITStackRef JITStack,
 *     void *CallbackCtx
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("uint64_t (*) (LLVMOrcJITStackRef, void *)")
public interface LLVMOrcLazyCompileCallbackFnI extends CallbackI.J {

    String SIGNATURE = "(pp)l";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    @NativeType("uint64_t") long invoke(@NativeType("LLVMOrcJITStackRef") long JITStack, @NativeType("void *") long CallbackCtx);

}