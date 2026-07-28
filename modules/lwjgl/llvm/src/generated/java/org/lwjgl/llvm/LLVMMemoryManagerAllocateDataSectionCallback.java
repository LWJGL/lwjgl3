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
public abstract class LLVMMemoryManagerAllocateDataSectionCallback extends Callback implements LLVMMemoryManagerAllocateDataSectionCallbackI {

    /**
     * Creates a {@code LLVMMemoryManagerAllocateDataSectionCallback} instance from the specified function pointer.
     *
     * @return the new {@code LLVMMemoryManagerAllocateDataSectionCallback}
     */
    public static LLVMMemoryManagerAllocateDataSectionCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LLVMMemoryManagerAllocateDataSectionCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code LLVMMemoryManagerAllocateDataSectionCallback} instance that delegates to the specified {@code LLVMMemoryManagerAllocateDataSectionCallbackI} instance. */
    public static LLVMMemoryManagerAllocateDataSectionCallback create(LLVMMemoryManagerAllocateDataSectionCallbackI instance) { return create(instance, instance.address()); }

    private static LLVMMemoryManagerAllocateDataSectionCallback create(LLVMMemoryManagerAllocateDataSectionCallbackI instance, long functionPointer) {
        return instance instanceof LLVMMemoryManagerAllocateDataSectionCallback
            ? (LLVMMemoryManagerAllocateDataSectionCallback)instance
            : new LLVMMemoryManagerAllocateDataSectionCallback(functionPointer) {
                @Override public long invoke(long Opaque, long Size, int Alignment, int SectionID, long SectionName, boolean IsReadOnly) {
                    return instance.invoke(Opaque, Size, Alignment, SectionID, SectionName, IsReadOnly);
                }
            };
    }

    protected LLVMMemoryManagerAllocateDataSectionCallback() {
        super(DESCRIPTOR);
    }

    LLVMMemoryManagerAllocateDataSectionCallback(long functionPointer) {
        super(functionPointer);
    }

}