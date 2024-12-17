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
    public static @Nullable LLVMSymbolLookupCallback createSafe(long functionPointer) {
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