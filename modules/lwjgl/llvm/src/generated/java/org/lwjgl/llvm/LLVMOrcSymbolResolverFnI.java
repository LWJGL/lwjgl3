/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

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
public interface LLVMOrcSymbolResolverFnI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_uint64,
        ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRetL(ret, __result);
    }

    @NativeType("uint64_t") long invoke(@NativeType("char const *") long Name, @NativeType("void *") long LookupCtx);

}