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
 * Instances of this class may be passed to the {@link LLVMCore#LLVMContextSetYieldCallback ContextSetYieldCallback} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     LLVMContextRef Context,
 *     void *OpaqueHandle
 * )</code></pre>
 */
public abstract class LLVMYieldCallback extends Callback implements LLVMYieldCallbackI {

    /**
     * Creates a {@code LLVMYieldCallback} instance from the specified function pointer.
     *
     * @return the new {@code LLVMYieldCallback}
     */
    public static LLVMYieldCallback create(long functionPointer) {
        LLVMYieldCallbackI instance = Callback.get(functionPointer);
        return instance instanceof LLVMYieldCallback
            ? (LLVMYieldCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static LLVMYieldCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LLVMYieldCallback} instance that delegates to the specified {@code LLVMYieldCallbackI} instance. */
    public static LLVMYieldCallback create(LLVMYieldCallbackI instance) {
        return instance instanceof LLVMYieldCallback
            ? (LLVMYieldCallback)instance
            : new Container(instance.address(), instance);
    }

    protected LLVMYieldCallback() {
        super(CIF);
    }

    LLVMYieldCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LLVMYieldCallback {

        private final LLVMYieldCallbackI delegate;

        Container(long functionPointer, LLVMYieldCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long Context, long OpaqueHandle) {
            delegate.invoke(Context, OpaqueHandle);
        }

    }

}