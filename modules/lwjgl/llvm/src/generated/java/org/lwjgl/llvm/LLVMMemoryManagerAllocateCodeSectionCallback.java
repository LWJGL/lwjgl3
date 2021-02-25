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
 * uint8_t * (*) (
 *     void *Opaque,
 *     uintptr_t Size,
 *     unsigned int Alignment,
 *     unsigned int SectionID,
 *     char const *SectionName
 * )</code></pre>
 */
public abstract class LLVMMemoryManagerAllocateCodeSectionCallback extends Callback implements LLVMMemoryManagerAllocateCodeSectionCallbackI {

    /**
     * Creates a {@code LLVMMemoryManagerAllocateCodeSectionCallback} instance from the specified function pointer.
     *
     * @return the new {@code LLVMMemoryManagerAllocateCodeSectionCallback}
     */
    public static LLVMMemoryManagerAllocateCodeSectionCallback create(long functionPointer) {
        LLVMMemoryManagerAllocateCodeSectionCallbackI instance = Callback.get(functionPointer);
        return instance instanceof LLVMMemoryManagerAllocateCodeSectionCallback
            ? (LLVMMemoryManagerAllocateCodeSectionCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static LLVMMemoryManagerAllocateCodeSectionCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LLVMMemoryManagerAllocateCodeSectionCallback} instance that delegates to the specified {@code LLVMMemoryManagerAllocateCodeSectionCallbackI} instance. */
    public static LLVMMemoryManagerAllocateCodeSectionCallback create(LLVMMemoryManagerAllocateCodeSectionCallbackI instance) {
        return instance instanceof LLVMMemoryManagerAllocateCodeSectionCallback
            ? (LLVMMemoryManagerAllocateCodeSectionCallback)instance
            : new Container(instance.address(), instance);
    }

    protected LLVMMemoryManagerAllocateCodeSectionCallback() {
        super(CIF);
    }

    LLVMMemoryManagerAllocateCodeSectionCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LLVMMemoryManagerAllocateCodeSectionCallback {

        private final LLVMMemoryManagerAllocateCodeSectionCallbackI delegate;

        Container(long functionPointer, LLVMMemoryManagerAllocateCodeSectionCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long Opaque, long Size, int Alignment, int SectionID, long SectionName) {
            return delegate.invoke(Opaque, Size, Alignment, SectionID, SectionName);
        }

    }

}