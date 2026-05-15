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
    public static LLVMSymbolLookupCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LLVMSymbolLookupCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code LLVMSymbolLookupCallback} instance that delegates to the specified {@code LLVMSymbolLookupCallbackI} instance. */
    public static LLVMSymbolLookupCallback create(LLVMSymbolLookupCallbackI instance) { return create(instance, instance.address()); }

    private static LLVMSymbolLookupCallback create(LLVMSymbolLookupCallbackI instance, long functionPointer) {
        return instance instanceof LLVMSymbolLookupCallback
            ? (LLVMSymbolLookupCallback)instance
            : new LLVMSymbolLookupCallback(functionPointer) {
                @Override public long invoke(long DisInfo, long ReferenceValue, long ReferenceType, long ReferencePC, long ReferenceName) {
                    return instance.invoke(DisInfo, ReferenceValue, ReferenceType, ReferencePC, ReferenceName);
                }
            };
    }

    protected LLVMSymbolLookupCallback() {
        super(DESCRIPTOR);
    }

    LLVMSymbolLookupCallback(long functionPointer) {
        super(functionPointer);
    }

}