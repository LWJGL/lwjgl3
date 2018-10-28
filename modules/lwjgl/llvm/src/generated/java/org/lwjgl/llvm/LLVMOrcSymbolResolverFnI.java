/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link LLVMORC#LLVMOrcAddEagerlyCompiledIR OrcAddEagerlyCompiledIR}, {@link LLVMORC#LLVMOrcAddLazilyCompiledIR OrcAddLazilyCompiledIR} and {@link LLVMORC#LLVMOrcAddObjectFile OrcAddObjectFile} methods.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * uint64_t (*) (
 *     char const *Name,
 *     void *LookupCtx
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("uint64_t (*) (char const *, void *)")
public interface LLVMOrcSymbolResolverFnI extends CallbackI.J {

    String SIGNATURE = "(pp)l";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    @NativeType("uint64_t") long invoke(@NativeType("char const *") long Name, @NativeType("void *") long LookupCtx);

}