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
 * void (*{@link #invoke}) (
 *     hb_font_t *font,
 *     void *font_data,
 *     unsigned int count,
 *     hb_codepoint_t const *first_glyph,
 *     unsigned int glyph_stride,
 *     hb_position_t *first_advance,
 *     unsigned int advance_stride,
 *     void *user_data
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("hb_font_get_glyph_advances_func_t")
public interface hb_font_get_glyph_advances_func_tI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_uint32, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 5 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 6 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 7 * POINTER_SIZE))
        );
    }

    /**
     * A virtual method for the {@code hb_font_funcs_t} of an {@code hb_font_t} object.
     * 
     * <p>This method should retrieve the advances for a sequence of glyphs.</p>
     *
     * @param font           {@code hb_font_t} to work upon
     * @param font_data      {@code font} user data pointer
     * @param count          the number of glyph IDs in the sequence queried
     * @param first_glyph    the first glyph ID to query
     * @param glyph_stride   the stride between successive glyph IDs
     * @param first_advance  the first advance retrieved
     * @param advance_stride the stride between successive advances
     * @param user_data      user data pointer passed by the caller
     */
    void invoke(@NativeType("hb_font_t *") long font, @NativeType("void *") long font_data, @NativeType("unsigned int") int count, @NativeType("hb_codepoint_t const *") long first_glyph, @NativeType("unsigned int") int glyph_stride, @NativeType("hb_position_t *") long first_advance, @NativeType("unsigned int") int advance_stride, @NativeType("void *") long user_data);

}