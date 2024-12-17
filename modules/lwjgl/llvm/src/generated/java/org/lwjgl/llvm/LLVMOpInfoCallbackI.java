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
@NativeType("int (*) (void *, uint64_t, uint64_t, uint64_t, uint64_t, int, void *)")
public interface LLVMOpInfoCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_sint32,
        ffi_type_pointer, ffi_type_uint64, ffi_type_uint64, ffi_type_uint64, ffi_type_uint64, ffi_type_sint32, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetLong(memGetAddress(args + POINTER_SIZE)),
            memGetLong(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetLong(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetLong(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 5 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 6 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code int (*) (void * DisInfo, uint64_t PC, uint64_t Offset, uint64_t OpSize, uint64_t InstSize, int TagType, void * TagBuf)} */
    int invoke(@NativeType("void *") long DisInfo, @NativeType("uint64_t") long PC, @NativeType("uint64_t") long Offset, @NativeType("uint64_t") long OpSize, @NativeType("uint64_t") long InstSize, int TagType, @NativeType("void *") long TagBuf);

}