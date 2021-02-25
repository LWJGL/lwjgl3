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
 * void (*) (
 *     void *Opaque
 * )</code></pre>
 */
public abstract class LLVMMemoryManagerDestroyCallback extends Callback implements LLVMMemoryManagerDestroyCallbackI {

    /**
     * Creates a {@code LLVMMemoryManagerDestroyCallback} instance from the specified function pointer.
     *
     * @return the new {@code LLVMMemoryManagerDestroyCallback}
     */
    public static LLVMMemoryManagerDestroyCallback create(long functionPointer) {
        LLVMMemoryManagerDestroyCallbackI instance = Callback.get(functionPointer);
        return instance instanceof LLVMMemoryManagerDestroyCallback
            ? (LLVMMemoryManagerDestroyCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static LLVMMemoryManagerDestroyCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LLVMMemoryManagerDestroyCallback} instance that delegates to the specified {@code LLVMMemoryManagerDestroyCallbackI} instance. */
    public static LLVMMemoryManagerDestroyCallback create(LLVMMemoryManagerDestroyCallbackI instance) {
        return instance instanceof LLVMMemoryManagerDestroyCallback
            ? (LLVMMemoryManagerDestroyCallback)instance
            : new Container(instance.address(), instance);
    }

    protected LLVMMemoryManagerDestroyCallback() {
        super(CIF);
    }

    LLVMMemoryManagerDestroyCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LLVMMemoryManagerDestroyCallback {

        private final LLVMMemoryManagerDestroyCallbackI delegate;

        Container(long functionPointer, LLVMMemoryManagerDestroyCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long Opaque) {
            delegate.invoke(Opaque);
        }

    }

}