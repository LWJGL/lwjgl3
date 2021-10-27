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
 * Instances of this interface may be passed to the {@link LLVMOrc#LLVMOrcCreateCustomMaterializationUnit OrcCreateCustomMaterializationUnit} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     void *Ctx,
 *     LLVMOrcJITDylibRef JD,
 *     LLVMOrcSymbolStringPoolEntryRef Symbol
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("LLVMOrcMaterializationUnitDiscardFunction")
public interface LLVMOrcMaterializationUnitDiscardFunctionI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE))
        );
    }

    /**
     * A {@code MaterializationUnit} discard callback.
     * 
     * <p>Ownership of {@code JD} and {@code Symbol} remain with the caller: These arguments should not be disposed of or released.</p>
     */
    void invoke(@NativeType("void *") long Ctx, @NativeType("LLVMOrcJITDylibRef") long JD, @NativeType("LLVMOrcSymbolStringPoolEntryRef") long Symbol);

}