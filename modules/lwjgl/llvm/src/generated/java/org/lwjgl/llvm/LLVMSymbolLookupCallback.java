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
 * char const * (*) (
 *     void *DisInfo,
 *     uint64_t ReferenceValue,
 *     uint64_t *ReferenceType,
 *     uint64_t ReferencePC,
 *     char const **ReferenceName
 * )</code></pre>
 */
public abstract class LLVMSymbolLookupCallback extends Callback implements LLVMSymbolLookupCallbackI {

    /**
     * Creates a {@code LLVMSymbolLookupCallback} instance from the specified function pointer.
     *
     * @return the new {@code LLVMSymbolLookupCallback}
     */
    public static LLVMSymbolLookupCallback create(long functionPointer) {
        LLVMSymbolLookupCallbackI instance = Callback.get(functionPointer);
        return instance instanceof LLVMSymbolLookupCallback
            ? (LLVMSymbolLookupCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static LLVMSymbolLookupCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LLVMSymbolLookupCallback} instance that delegates to the specified {@code LLVMSymbolLookupCallbackI} instance. */
    public static LLVMSymbolLookupCallback create(LLVMSymbolLookupCallbackI instance) {
        return instance instanceof LLVMSymbolLookupCallback
            ? (LLVMSymbolLookupCallback)instance
            : new Container(instance.address(), instance);
    }

    protected LLVMSymbolLookupCallback() {
        super(CIF);
    }

    LLVMSymbolLookupCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LLVMSymbolLookupCallback {

        private final LLVMSymbolLookupCallbackI delegate;

        Container(long functionPointer, LLVMSymbolLookupCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long DisInfo, long ReferenceValue, long ReferenceType, long ReferencePC, long ReferenceName) {
            return delegate.invoke(DisInfo, ReferenceValue, ReferenceType, ReferencePC, ReferenceName);
        }

    }

}