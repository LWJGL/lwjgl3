/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be passed to the {@link LLVMORC#LLVMOrcCreateLazyCompileCallback OrcCreateLazyCompileCallback} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * uint64_t (*) (
 *     LLVMOrcJITStackRef JITStack,
 *     void *CallbackCtx
 * )</code></pre>
 */
public abstract class LLVMOrcLazyCompileCallbackFn extends Callback implements LLVMOrcLazyCompileCallbackFnI {

    /**
     * Creates a {@code LLVMOrcLazyCompileCallbackFn} instance from the specified function pointer.
     *
     * @return the new {@code LLVMOrcLazyCompileCallbackFn}
     */
    public static LLVMOrcLazyCompileCallbackFn create(long functionPointer) {
        LLVMOrcLazyCompileCallbackFnI instance = Callback.get(functionPointer);
        return instance instanceof LLVMOrcLazyCompileCallbackFn
            ? (LLVMOrcLazyCompileCallbackFn)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static LLVMOrcLazyCompileCallbackFn createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LLVMOrcLazyCompileCallbackFn} instance that delegates to the specified {@code LLVMOrcLazyCompileCallbackFnI} instance. */
    public static LLVMOrcLazyCompileCallbackFn create(LLVMOrcLazyCompileCallbackFnI instance) {
        return instance instanceof LLVMOrcLazyCompileCallbackFn
            ? (LLVMOrcLazyCompileCallbackFn)instance
            : new Container(instance.address(), instance);
    }

    protected LLVMOrcLazyCompileCallbackFn() {
        super(CIF);
    }

    LLVMOrcLazyCompileCallbackFn(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LLVMOrcLazyCompileCallbackFn {

        private final LLVMOrcLazyCompileCallbackFnI delegate;

        Container(long functionPointer, LLVMOrcLazyCompileCallbackFnI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long JITStack, long CallbackCtx) {
            return delegate.invoke(JITStack, CallbackCtx);
        }

    }

}