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
 * Instances of this interface may be passed to the {@link LLVMOrc#LLVMOrcCreateDynamicLibrarySearchGeneratorForProcess OrcCreateDynamicLibrarySearchGeneratorForProcess} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * int (*{@link #invoke}) (
 *     void *Ctx,
 *     LLVMOrcSymbolStringPoolEntryRef Sym
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("LLVMOrcSymbolPredicate")
public interface LLVMOrcSymbolPredicateI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_sint32,
        ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** Predicate function for {@code SymbolStringPoolEntries}. */
    int invoke(@NativeType("void *") long Ctx, @NativeType("LLVMOrcSymbolStringPoolEntryRef") long Sym);

}