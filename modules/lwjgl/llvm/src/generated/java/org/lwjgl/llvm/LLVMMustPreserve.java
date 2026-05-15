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
public abstract class LLVMMustPreserve extends Callback implements LLVMMustPreserveI {

    /**
     * Creates a {@code LLVMMustPreserve} instance from the specified function pointer.
     *
     * @return the new {@code LLVMMustPreserve}
     */
    public static LLVMMustPreserve create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LLVMMustPreserve createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code LLVMMustPreserve} instance that delegates to the specified {@code LLVMMustPreserveI} instance. */
    public static LLVMMustPreserve create(LLVMMustPreserveI instance) { return create(instance, instance.address()); }

    private static LLVMMustPreserve create(LLVMMustPreserveI instance, long functionPointer) {
        return instance instanceof LLVMMustPreserve
            ? (LLVMMustPreserve)instance
            : new LLVMMustPreserve(functionPointer) {
                @Override public int invoke(long Val, long Context) {
                    return instance.invoke(Val, Context);
                }
            };
    }

    protected LLVMMustPreserve() {
        super(DESCRIPTOR);
    }

    LLVMMustPreserve(long functionPointer) {
        super(functionPointer);
    }

}