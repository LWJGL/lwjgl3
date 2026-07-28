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
public abstract class LLVMMemoryManagerAllocateCodeSectionCallback extends Callback implements LLVMMemoryManagerAllocateCodeSectionCallbackI {

    /**
     * Creates a {@code LLVMMemoryManagerAllocateCodeSectionCallback} instance from the specified function pointer.
     *
     * @return the new {@code LLVMMemoryManagerAllocateCodeSectionCallback}
     */
    public static LLVMMemoryManagerAllocateCodeSectionCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LLVMMemoryManagerAllocateCodeSectionCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code LLVMMemoryManagerAllocateCodeSectionCallback} instance that delegates to the specified {@code LLVMMemoryManagerAllocateCodeSectionCallbackI} instance. */
    public static LLVMMemoryManagerAllocateCodeSectionCallback create(LLVMMemoryManagerAllocateCodeSectionCallbackI instance) { return create(instance, instance.address()); }

    private static LLVMMemoryManagerAllocateCodeSectionCallback create(LLVMMemoryManagerAllocateCodeSectionCallbackI instance, long functionPointer) {
        return instance instanceof LLVMMemoryManagerAllocateCodeSectionCallback
            ? (LLVMMemoryManagerAllocateCodeSectionCallback)instance
            : new LLVMMemoryManagerAllocateCodeSectionCallback(functionPointer) {
                @Override public long invoke(long Opaque, long Size, int Alignment, int SectionID, long SectionName) {
                    return instance.invoke(Opaque, Size, Alignment, SectionID, SectionName);
                }
            };
    }

    protected LLVMMemoryManagerAllocateCodeSectionCallback() {
        super(DESCRIPTOR);
    }

    LLVMMemoryManagerAllocateCodeSectionCallback(long functionPointer) {
        super(functionPointer);
    }

}