/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke LLVMMemoryManagerCreateContextCallback} */
public abstract class LLVMMemoryManagerCreateContextCallback extends Callback implements LLVMMemoryManagerCreateContextCallbackI {

    /**
     * Creates a {@code LLVMMemoryManagerCreateContextCallback} instance from the specified function pointer.
     *
     * @return the new {@code LLVMMemoryManagerCreateContextCallback}
     */
    public static LLVMMemoryManagerCreateContextCallback create(long functionPointer) {
        LLVMMemoryManagerCreateContextCallbackI instance = Callback.get(functionPointer);
        return instance instanceof LLVMMemoryManagerCreateContextCallback
            ? (LLVMMemoryManagerCreateContextCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LLVMMemoryManagerCreateContextCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LLVMMemoryManagerCreateContextCallback} instance that delegates to the specified {@code LLVMMemoryManagerCreateContextCallbackI} instance. */
    public static LLVMMemoryManagerCreateContextCallback create(LLVMMemoryManagerCreateContextCallbackI instance) {
        return instance instanceof LLVMMemoryManagerCreateContextCallback
            ? (LLVMMemoryManagerCreateContextCallback)instance
            : new Container(instance.address(), instance);
    }

    protected LLVMMemoryManagerCreateContextCallback() {
        super(CIF);
    }

    LLVMMemoryManagerCreateContextCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LLVMMemoryManagerCreateContextCallback {

        private final LLVMMemoryManagerCreateContextCallbackI delegate;

        Container(long functionPointer, LLVMMemoryManagerCreateContextCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long CtxCtx) {
            delegate.invoke(CtxCtx);
        }

    }

}