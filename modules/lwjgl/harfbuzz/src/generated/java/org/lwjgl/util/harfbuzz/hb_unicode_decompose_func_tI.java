/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke hb_unicode_decompose_func_t} */
@FunctionalInterface
@NativeType("hb_unicode_decompose_func_t")
public interface hb_unicode_decompose_func_tI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code hb_bool_t (* hb_unicode_decompose_func_t) (hb_unicode_funcs_t * ufuncs, hb_codepoint_t ab, hb_codepoint_t * a, hb_codepoint_t * b, void * user_data)} */
    @NativeType("hb_bool_t") int invoke(@NativeType("hb_unicode_funcs_t *") long ufuncs, @NativeType("hb_codepoint_t") int ab, @NativeType("hb_codepoint_t *") long a, @NativeType("hb_codepoint_t *") long b, @NativeType("void *") long user_data);

}