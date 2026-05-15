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
    public static LLVMMemoryManagerNotifyTerminatingCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LLVMMemoryManagerNotifyTerminatingCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code LLVMMemoryManagerNotifyTerminatingCallback} instance that delegates to the specified {@code LLVMMemoryManagerNotifyTerminatingCallbackI} instance. */
    public static LLVMMemoryManagerNotifyTerminatingCallback create(LLVMMemoryManagerNotifyTerminatingCallbackI instance) { return create(instance, instance.address()); }

    private static LLVMMemoryManagerNotifyTerminatingCallback create(LLVMMemoryManagerNotifyTerminatingCallbackI instance, long functionPointer) {
        return instance instanceof LLVMMemoryManagerNotifyTerminatingCallback
            ? (LLVMMemoryManagerNotifyTerminatingCallback)instance
            : new LLVMMemoryManagerNotifyTerminatingCallback(functionPointer) {
                @Override public void invoke(long CtxCtx) {
                    instance.invoke(CtxCtx);
                }
            };
    }

    protected LLVMMemoryManagerNotifyTerminatingCallback() {
        super(DESCRIPTOR);
    }

    LLVMMemoryManagerNotifyTerminatingCallback(long functionPointer) {
        super(functionPointer);
    }

}