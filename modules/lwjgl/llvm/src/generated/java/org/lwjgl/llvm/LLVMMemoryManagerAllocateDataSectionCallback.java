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
 *     char const *SectionName,
 *     LLVMBool IsReadOnly
 * )</code></pre>
 */
public abstract class LLVMMemoryManagerAllocateDataSectionCallback extends Callback implements LLVMMemoryManagerAllocateDataSectionCallbackI {

    /**
     * Creates a {@code LLVMMemoryManagerAllocateDataSectionCallback} instance from the specified function pointer.
     *
     * @return the new {@code LLVMMemoryManagerAllocateDataSectionCallback}
     */
    public static LLVMMemoryManagerAllocateDataSectionCallback create(long functionPointer) {
        LLVMMemoryManagerAllocateDataSectionCallbackI instance = Callback.get(functionPointer);
        return instance instanceof LLVMMemoryManagerAllocateDataSectionCallback
            ? (LLVMMemoryManagerAllocateDataSectionCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static LLVMMemoryManagerAllocateDataSectionCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LLVMMemoryManagerAllocateDataSectionCallback} instance that delegates to the specified {@code LLVMMemoryManagerAllocateDataSectionCallbackI} instance. */
    public static LLVMMemoryManagerAllocateDataSectionCallback create(LLVMMemoryManagerAllocateDataSectionCallbackI instance) {
        return instance instanceof LLVMMemoryManagerAllocateDataSectionCallback
            ? (LLVMMemoryManagerAllocateDataSectionCallback)instance
            : new Container(instance.address(), instance);
    }

    protected LLVMMemoryManagerAllocateDataSectionCallback() {
        super(CIF);
    }

    LLVMMemoryManagerAllocateDataSectionCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LLVMMemoryManagerAllocateDataSectionCallback {

        private final LLVMMemoryManagerAllocateDataSectionCallbackI delegate;

        Container(long functionPointer, LLVMMemoryManagerAllocateDataSectionCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long Opaque, long Size, int Alignment, int SectionID, long SectionName, boolean IsReadOnly) {
            return delegate.invoke(Opaque, Size, Alignment, SectionID, SectionName, IsReadOnly);
        }

    }

}