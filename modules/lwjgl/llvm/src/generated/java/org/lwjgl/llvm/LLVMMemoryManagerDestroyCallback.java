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
public abstract class LLVMMemoryManagerDestroyCallback extends Callback implements LLVMMemoryManagerDestroyCallbackI {

    /**
     * Creates a {@code LLVMMemoryManagerDestroyCallback} instance from the specified function pointer.
     *
     * @return the new {@code LLVMMemoryManagerDestroyCallback}
     */
    public static LLVMMemoryManagerDestroyCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LLVMMemoryManagerDestroyCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code LLVMMemoryManagerDestroyCallback} instance that delegates to the specified {@code LLVMMemoryManagerDestroyCallbackI} instance. */
    public static LLVMMemoryManagerDestroyCallback create(LLVMMemoryManagerDestroyCallbackI instance) { return create(instance, instance.address()); }

    private static LLVMMemoryManagerDestroyCallback create(LLVMMemoryManagerDestroyCallbackI instance, long functionPointer) {
        return instance instanceof LLVMMemoryManagerDestroyCallback
            ? (LLVMMemoryManagerDestroyCallback)instance
            : new LLVMMemoryManagerDestroyCallback(functionPointer) {
                @Override public void invoke(long Opaque) {
                    instance.invoke(Opaque);
                }
            };
    }

    protected LLVMMemoryManagerDestroyCallback() {
        super(DESCRIPTOR);
    }

    LLVMMemoryManagerDestroyCallback(long functionPointer) {
        super(functionPointer);
    }

}