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
 * Instances of this class may be passed to the {@link LLVMDisassembler#LLVMCreateDisasm CreateDisasm}, {@link LLVMDisassembler#LLVMCreateDisasmCPU CreateDisasmCPU} and {@link LLVMDisassembler#LLVMCreateDisasmCPUFeatures CreateDisasmCPUFeatures} methods.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * int (*) (
 *     void *DisInfo,
 *     uint64_t PC,
 *     uint64_t Offset,
 *     uint64_t Size,
 *     int TagType,
 *     void *TagBuf
 * )</code></pre>
 */
public abstract class LLVMOpInfoCallback extends Callback implements LLVMOpInfoCallbackI {

    /**
     * Creates a {@code LLVMOpInfoCallback} instance from the specified function pointer.
     *
     * @return the new {@code LLVMOpInfoCallback}
     */
    public static LLVMOpInfoCallback create(long functionPointer) {
        LLVMOpInfoCallbackI instance = Callback.get(functionPointer);
        return instance instanceof LLVMOpInfoCallback
            ? (LLVMOpInfoCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static LLVMOpInfoCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LLVMOpInfoCallback} instance that delegates to the specified {@code LLVMOpInfoCallbackI} instance. */
    public static LLVMOpInfoCallback create(LLVMOpInfoCallbackI instance) {
        return instance instanceof LLVMOpInfoCallback
            ? (LLVMOpInfoCallback)instance
            : new Container(instance.address(), instance);
    }

    protected LLVMOpInfoCallback() {
        super(CIF);
    }

    LLVMOpInfoCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LLVMOpInfoCallback {

        private final LLVMOpInfoCallbackI delegate;

        Container(long functionPointer, LLVMOpInfoCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long DisInfo, long PC, long Offset, long Size, int TagType, long TagBuf) {
            return delegate.invoke(DisInfo, PC, Offset, Size, TagType, TagBuf);
        }

    }

}