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
 * Instances of this class may be passed to the {@link LLVMExecutionEngine#LLVMCreateSimpleMCJITMemoryManager CreateSimpleMCJITMemoryManager} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * LLVMBool (*) (
 *     void *Opaque,
 *     char **ErrMsg
 * )</code></pre>
 */
public abstract class LLVMMemoryManagerFinalizeMemoryCallback extends Callback implements LLVMMemoryManagerFinalizeMemoryCallbackI {

    /**
     * Creates a {@code LLVMMemoryManagerFinalizeMemoryCallback} instance from the specified function pointer.
     *
     * @return the new {@code LLVMMemoryManagerFinalizeMemoryCallback}
     */
    public static LLVMMemoryManagerFinalizeMemoryCallback create(long functionPointer) {
        LLVMMemoryManagerFinalizeMemoryCallbackI instance = Callback.get(functionPointer);
        return instance instanceof LLVMMemoryManagerFinalizeMemoryCallback
            ? (LLVMMemoryManagerFinalizeMemoryCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static LLVMMemoryManagerFinalizeMemoryCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LLVMMemoryManagerFinalizeMemoryCallback} instance that delegates to the specified {@code LLVMMemoryManagerFinalizeMemoryCallbackI} instance. */
    public static LLVMMemoryManagerFinalizeMemoryCallback create(LLVMMemoryManagerFinalizeMemoryCallbackI instance) {
        return instance instanceof LLVMMemoryManagerFinalizeMemoryCallback
            ? (LLVMMemoryManagerFinalizeMemoryCallback)instance
            : new Container(instance.address(), instance);
    }

    protected LLVMMemoryManagerFinalizeMemoryCallback() {
        super(CIF);
    }

    LLVMMemoryManagerFinalizeMemoryCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LLVMMemoryManagerFinalizeMemoryCallback {

        private final LLVMMemoryManagerFinalizeMemoryCallbackI delegate;

        Container(long functionPointer, LLVMMemoryManagerFinalizeMemoryCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long Opaque, long ErrMsg) {
            return delegate.invoke(Opaque, ErrMsg);
        }

    }

}