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

/** Callback function: {@link #invoke (* anonymous)} */
@FunctionalInterface
@NativeType("char const * (*) (void *, uint64_t, uint64_t *, uint64_t, char const **)")
public interface LLVMSymbolLookupCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_uint64, ffi_type_pointer, ffi_type_uint64, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetLong(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetLong(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /** {@code char const * (*) (void * DisInfo, uint64_t ReferenceValue, uint64_t * ReferenceType, uint64_t ReferencePC, char const ** ReferenceName)} */
    @NativeType("char const *") long invoke(@NativeType("void *") long DisInfo, @NativeType("uint64_t") long ReferenceValue, @NativeType("uint64_t *") long ReferenceType, @NativeType("uint64_t") long ReferencePC, @NativeType("char const **") long ReferenceName);

}