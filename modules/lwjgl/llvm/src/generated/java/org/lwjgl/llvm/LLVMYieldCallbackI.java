/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link LLVMCore#LLVMContextSetYieldCallback ContextSetYieldCallback} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     LLVMContextRef Context,
 *     void *OpaqueHandle
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (LLVMContextRef, void *)")
public interface LLVMYieldCallbackI extends CallbackI.V {

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

    void invoke(@NativeType("LLVMContextRef") long Context, @NativeType("void *") long OpaqueHandle);

}