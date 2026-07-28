/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class LLVMMemoryManagerFinalizeMemoryCallback extends Callback implements LLVMMemoryManagerFinalizeMemoryCallbackI {

    /**
     * Creates a {@code LLVMMemoryManagerFinalizeMemoryCallback} instance from the specified function pointer.
     *
     * @return the new {@code LLVMMemoryManagerFinalizeMemoryCallback}
     */
    public static LLVMMemoryManagerFinalizeMemoryCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LLVMMemoryManagerFinalizeMemoryCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code LLVMMemoryManagerFinalizeMemoryCallback} instance that delegates to the specified {@code LLVMMemoryManagerFinalizeMemoryCallbackI} instance. */
    public static LLVMMemoryManagerFinalizeMemoryCallback create(LLVMMemoryManagerFinalizeMemoryCallbackI instance) { return create(instance, instance.address()); }

    private static LLVMMemoryManagerFinalizeMemoryCallback create(LLVMMemoryManagerFinalizeMemoryCallbackI instance, long functionPointer) {
        return instance instanceof LLVMMemoryManagerFinalizeMemoryCallback
            ? (LLVMMemoryManagerFinalizeMemoryCallback)instance
            : new LLVMMemoryManagerFinalizeMemoryCallback(functionPointer) {
                @Override public int invoke(long Opaque, long ErrMsg) {
                    return instance.invoke(Opaque, ErrMsg);
                }
            };
    }

    protected LLVMMemoryManagerFinalizeMemoryCallback() {
        super(DESCRIPTOR);
    }

    LLVMMemoryManagerFinalizeMemoryCallback(long functionPointer) {
        super(functionPointer);
    }

}