/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke PFNKTXITERCB} */
@FunctionalInterface
@NativeType("PFNKTXITERCB")
public interface PFNKTXITERCBI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_uint32,
        ffi_type_sint32, ffi_type_sint32, ffi_type_sint32, ffi_type_sint32, ffi_type_sint32, ffi_type_uint64, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetInt(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetLong(memGetAddress(args + 5 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 6 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 7 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code KTX_error_code (* PFNKTXITERCB) (int miplevel, int face, int width, int height, int depth, ktx_uint64_t faceLodSize, void * pixels, void * userdata)} */
    @NativeType("KTX_error_code") int invoke(int miplevel, int face, int width, int height, int depth, @NativeType("ktx_uint64_t") long faceLodSize, @NativeType("void *") long pixels, @NativeType("void *") long userdata);

}