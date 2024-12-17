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

/** Callback function: {@link #invoke hb_font_get_nominal_glyphs_func_t} */
@FunctionalInterface
@NativeType("hb_font_get_nominal_glyphs_func_t")
public interface hb_font_get_nominal_glyphs_func_tI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_uint32, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 5 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 6 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 7 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code unsigned int (* hb_font_get_nominal_glyphs_func_t) (hb_font_t * font, void * font_data, unsigned int count, hb_codepoint_t const * first_unicode, unsigned int unicode_stride, hb_codepoint_t * first_glyph, unsigned int glyph_stride, void * user_data)} */
    @NativeType("unsigned int") int invoke(@NativeType("hb_font_t *") long font, @NativeType("void *") long font_data, @NativeType("unsigned int") int count, @NativeType("hb_codepoint_t const *") long first_unicode, @NativeType("unsigned int") int unicode_stride, @NativeType("hb_codepoint_t *") long first_glyph, @NativeType("unsigned int") int glyph_stride, @NativeType("void *") long user_data);

}