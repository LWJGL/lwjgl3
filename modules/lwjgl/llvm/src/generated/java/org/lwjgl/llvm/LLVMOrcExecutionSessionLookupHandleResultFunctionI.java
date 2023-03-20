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
 * Instances of this interface may be passed to the {@link LLVMOrc#LLVMOrcExecutionSessionLookup OrcExecutionSessionLookup} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     LLVMErrorRef Err,
 *     LLVMOrcCSymbolMapPairs Result,
 *     size_t NumPairs,
 *     void *Ctx
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("LLVMOrcExecutionSessionLookupHandleResultFunction")
public interface LLVMOrcExecutionSessionLookupHandleResultFunctionI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE))
        );
    }

    /**
     * Callback type for {@code ExecutionSession} lookups.
     * 
     * <p>If {@code Err} is {@link LLVMError#LLVMErrorSuccess ErrorSuccess} then {@code Result} will contain a pointer to a list of ( {@code SymbolStringPtr}, {@code JITEvaluatedSymbol} ) pairs
     * of length {@code NumPairs}.</p>
     * 
     * <p>If {@code Err} is a failure value then {@code Result} and {@code Ctx} are undefined and should not be accessed. The callback is responsible for
     * handling the error value (e.g. by calling {@link LLVMError#LLVMGetErrorMessage GetErrorMessage} + {@link LLVMError#LLVMDisposeErrorMessage DisposeErrorMessage}).</p>
     * 
     * <p>The caller retains ownership of the {@code Result} array and will release all contained symbol names. Clients are responsible for retaining any symbol
     * names that they wish to hold after the function returns.</p>
     */
    void invoke(@NativeType("LLVMErrorRef") long Err, @NativeType("LLVMOrcCSymbolMapPairs") long Result, @NativeType("size_t") long NumPairs, @NativeType("void *") long Ctx);

}