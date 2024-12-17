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

/** Callback function: {@link #invoke LLVMOrcExecutionSessionLookupHandleResultFunction} */
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

    /** {@code void (* LLVMOrcExecutionSessionLookupHandleResultFunction) (LLVMErrorRef Err, LLVMOrcCSymbolMapPairs Result, size_t NumPairs, void * Ctx)} */
    void invoke(@NativeType("LLVMErrorRef") long Err, @NativeType("LLVMOrcCSymbolMapPairs") long Result, @NativeType("size_t") long NumPairs, @NativeType("void *") long Ctx);

}