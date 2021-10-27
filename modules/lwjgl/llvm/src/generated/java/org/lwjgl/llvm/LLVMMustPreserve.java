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
 * Instances of this class may be passed to the {@link LLVMTransforms#LLVMAddInternalizePassWithMustPreservePredicate AddInternalizePassWithMustPreservePredicate} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * LLVMBool (*{@link #invoke}) (
 *     LLVMValueRef Val,
 *     void *Context
 * )</code></pre>
 */
public abstract class LLVMMustPreserve extends Callback implements LLVMMustPreserveI {

    /**
     * Creates a {@code LLVMMustPreserve} instance from the specified function pointer.
     *
     * @return the new {@code LLVMMustPreserve}
     */
    public static LLVMMustPreserve create(long functionPointer) {
        LLVMMustPreserveI instance = Callback.get(functionPointer);
        return instance instanceof LLVMMustPreserve
            ? (LLVMMustPreserve)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static LLVMMustPreserve createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LLVMMustPreserve} instance that delegates to the specified {@code LLVMMustPreserveI} instance. */
    public static LLVMMustPreserve create(LLVMMustPreserveI instance) {
        return instance instanceof LLVMMustPreserve
            ? (LLVMMustPreserve)instance
            : new Container(instance.address(), instance);
    }

    protected LLVMMustPreserve() {
        super(CIF);
    }

    LLVMMustPreserve(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LLVMMustPreserve {

        private final LLVMMustPreserveI delegate;

        Container(long functionPointer, LLVMMustPreserveI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long Val, long Context) {
            return delegate.invoke(Val, Context);
        }

    }

}