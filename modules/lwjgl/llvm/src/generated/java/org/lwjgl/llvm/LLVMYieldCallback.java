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
public abstract class LLVMYieldCallback extends Callback implements LLVMYieldCallbackI {

    /**
     * Creates a {@code LLVMYieldCallback} instance from the specified function pointer.
     *
     * @return the new {@code LLVMYieldCallback}
     */
    public static LLVMYieldCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LLVMYieldCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code LLVMYieldCallback} instance that delegates to the specified {@code LLVMYieldCallbackI} instance. */
    public static LLVMYieldCallback create(LLVMYieldCallbackI instance) { return create(instance, instance.address()); }

    private static LLVMYieldCallback create(LLVMYieldCallbackI instance, long functionPointer) {
        return instance instanceof LLVMYieldCallback
            ? (LLVMYieldCallback)instance
            : new LLVMYieldCallback(functionPointer) {
                @Override public void invoke(long Context, long OpaqueHandle) {
                    instance.invoke(Context, OpaqueHandle);
                }
            };
    }

    protected LLVMYieldCallback() {
        super(DESCRIPTOR);
    }

    LLVMYieldCallback(long functionPointer) {
        super(functionPointer);
    }

}