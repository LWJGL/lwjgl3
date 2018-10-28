/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link LLVMExecutionEngine#LLVMCreateSimpleMCJITMemoryManager CreateSimpleMCJITMemoryManager} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * LLVMBool (*) (
 *     void *Opaque,
 *     char **ErrMsg
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("LLVMBool (*) (void *, char **)")
public interface LLVMMemoryManagerFinalizeMemoryCallbackI extends CallbackI.I {

    String SIGNATURE = "(pp)i";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default int callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    @NativeType("LLVMBool") int invoke(@NativeType("void *") long Opaque, @NativeType("char **") long ErrMsg);

}