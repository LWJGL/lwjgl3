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
 * Instances of this class may be passed to the {@link LLVMORC#LLVMOrcAddEagerlyCompiledIR OrcAddEagerlyCompiledIR}, {@link LLVMORC#LLVMOrcAddLazilyCompiledIR OrcAddLazilyCompiledIR} and {@link LLVMORC#LLVMOrcAddObjectFile OrcAddObjectFile} methods.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * uint64_t (*) (
 *     char const *Name,
 *     void *LookupCtx
 * )</code></pre>
 */
public abstract class LLVMOrcSymbolResolverFn extends Callback implements LLVMOrcSymbolResolverFnI {

    /**
     * Creates a {@code LLVMOrcSymbolResolverFn} instance from the specified function pointer.
     *
     * @return the new {@code LLVMOrcSymbolResolverFn}
     */
    public static LLVMOrcSymbolResolverFn create(long functionPointer) {
        LLVMOrcSymbolResolverFnI instance = Callback.get(functionPointer);
        return instance instanceof LLVMOrcSymbolResolverFn
            ? (LLVMOrcSymbolResolverFn)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static LLVMOrcSymbolResolverFn createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LLVMOrcSymbolResolverFn} instance that delegates to the specified {@code LLVMOrcSymbolResolverFnI} instance. */
    public static LLVMOrcSymbolResolverFn create(LLVMOrcSymbolResolverFnI instance) {
        return instance instanceof LLVMOrcSymbolResolverFn
            ? (LLVMOrcSymbolResolverFn)instance
            : new Container(instance.address(), instance);
    }

    protected LLVMOrcSymbolResolverFn() {
        super(CIF);
    }

    LLVMOrcSymbolResolverFn(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LLVMOrcSymbolResolverFn {

        private final LLVMOrcSymbolResolverFnI delegate;

        Container(long functionPointer, LLVMOrcSymbolResolverFnI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long Name, long LookupCtx) {
            return delegate.invoke(Name, LookupCtx);
        }

    }

}