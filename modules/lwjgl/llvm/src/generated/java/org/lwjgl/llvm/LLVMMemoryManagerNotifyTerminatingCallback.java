/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke LLVMMemoryManagerNotifyTerminatingCallback} */
public abstract class LLVMMemoryManagerNotifyTerminatingCallback extends Callback implements LLVMMemoryManagerNotifyTerminatingCallbackI {

    /**
     * Creates a {@code LLVMMemoryManagerNotifyTerminatingCallback} instance from the specified function pointer.
     *
     * @return the new {@code LLVMMemoryManagerNotifyTerminatingCallback}
     */
    public static LLVMMemoryManagerNotifyTerminatingCallback create(long functionPointer) {
        LLVMMemoryManagerNotifyTerminatingCallbackI instance = Callback.get(functionPointer);
        return instance instanceof LLVMMemoryManagerNotifyTerminatingCallback
            ? (LLVMMemoryManagerNotifyTerminatingCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LLVMMemoryManagerNotifyTerminatingCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LLVMMemoryManagerNotifyTerminatingCallback} instance that delegates to the specified {@code LLVMMemoryManagerNotifyTerminatingCallbackI} instance. */
    public static LLVMMemoryManagerNotifyTerminatingCallback create(LLVMMemoryManagerNotifyTerminatingCallbackI instance) {
        return instance instanceof LLVMMemoryManagerNotifyTerminatingCallback
            ? (LLVMMemoryManagerNotifyTerminatingCallback)instance
            : new Container(instance.address(), instance);
    }

    protected LLVMMemoryManagerNotifyTerminatingCallback() {
        super(CIF);
    }

    LLVMMemoryManagerNotifyTerminatingCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LLVMMemoryManagerNotifyTerminatingCallback {

        private final LLVMMemoryManagerNotifyTerminatingCallbackI delegate;

        Container(long functionPointer, LLVMMemoryManagerNotifyTerminatingCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long CtxCtx) {
            delegate.invoke(CtxCtx);
        }

    }

}