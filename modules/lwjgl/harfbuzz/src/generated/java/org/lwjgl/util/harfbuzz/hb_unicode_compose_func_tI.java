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

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * hb_bool_t (*{@link #invoke}) (
 *     hb_unicode_funcs_t *ufuncs,
 *     hb_codepoint_t a,
 *     hb_codepoint_t b,
 *     hb_codepoint_t *ab,
 *     void *user_data
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("hb_unicode_compose_func_t")
public interface hb_unicode_compose_func_tI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_uint32, ffi_type_uint32, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /**
     * A virtual method for the {@code hb_unicode_funcs_t} structure.
     * 
     * <p>This method should compose a sequence of two input Unicode code points by canonical equivalence, returning the composed code point in a
     * {@code hb_codepoint_t} output parameter (if successful). The method must return an {@code hb_bool_t} indicating the success of the composition.</p>
     * 
     * <p>Return value: {@code true} is {@code a},{@code b} composed, {@code false} otherwise</p>
     *
     * @param ufuncs    a Unicode-functions structure
     * @param a         the first code point to compose
     * @param b         the second code point to compose
     * @param ab        the composed code point
     * @param user_data user data pointer passed by the caller
     */
    @NativeType("hb_bool_t") int invoke(@NativeType("hb_unicode_funcs_t *") long ufuncs, @NativeType("hb_codepoint_t") int a, @NativeType("hb_codepoint_t") int b, @NativeType("hb_codepoint_t *") long ab, @NativeType("void *") long user_data);

}