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
 * Instances of this class may be passed to the {@link LLVMOrc#LLVMOrcCreateDynamicLibrarySearchGeneratorForProcess OrcCreateDynamicLibrarySearchGeneratorForProcess} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * int (*{@link #invoke}) (
 *     void *Ctx,
 *     LLVMOrcSymbolStringPoolEntryRef Sym
 * )</code></pre>
 */
public abstract class LLVMOrcSymbolPredicate extends Callback implements LLVMOrcSymbolPredicateI {

    /**
     * Creates a {@code LLVMOrcSymbolPredicate} instance from the specified function pointer.
     *
     * @return the new {@code LLVMOrcSymbolPredicate}
     */
    public static LLVMOrcSymbolPredicate create(long functionPointer) {
        LLVMOrcSymbolPredicateI instance = Callback.get(functionPointer);
        return instance instanceof LLVMOrcSymbolPredicate
            ? (LLVMOrcSymbolPredicate)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static LLVMOrcSymbolPredicate createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LLVMOrcSymbolPredicate} instance that delegates to the specified {@code LLVMOrcSymbolPredicateI} instance. */
    public static LLVMOrcSymbolPredicate create(LLVMOrcSymbolPredicateI instance) {
        return instance instanceof LLVMOrcSymbolPredicate
            ? (LLVMOrcSymbolPredicate)instance
            : new Container(instance.address(), instance);
    }

    protected LLVMOrcSymbolPredicate() {
        super(CIF);
    }

    LLVMOrcSymbolPredicate(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LLVMOrcSymbolPredicate {

        private final LLVMOrcSymbolPredicateI delegate;

        Container(long functionPointer, LLVMOrcSymbolPredicateI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long Ctx, long Sym) {
            return delegate.invoke(Ctx, Sym);
        }

    }

}