/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke LLVMOrcSymbolPredicate} */
public abstract class LLVMOrcSymbolPredicate extends Callback implements LLVMOrcSymbolPredicateI {

    /**
     * Creates a {@code LLVMOrcSymbolPredicate} instance from the specified function pointer.
     *
     * @return the new {@code LLVMOrcSymbolPredicate}
     */
    public static LLVMOrcSymbolPredicate create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LLVMOrcSymbolPredicate createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code LLVMOrcSymbolPredicate} instance that delegates to the specified {@code LLVMOrcSymbolPredicateI} instance. */
    public static LLVMOrcSymbolPredicate create(LLVMOrcSymbolPredicateI instance) { return create(instance, instance.address()); }

    private static LLVMOrcSymbolPredicate create(LLVMOrcSymbolPredicateI instance, long functionPointer) {
        return instance instanceof LLVMOrcSymbolPredicate
            ? (LLVMOrcSymbolPredicate)instance
            : new LLVMOrcSymbolPredicate(functionPointer) {
                @Override public int invoke(long Ctx, long Sym) {
                    return instance.invoke(Ctx, Sym);
                }
            };
    }

    protected LLVMOrcSymbolPredicate() {
        super(DESCRIPTOR);
    }

    LLVMOrcSymbolPredicate(long functionPointer) {
        super(functionPointer);
    }

}