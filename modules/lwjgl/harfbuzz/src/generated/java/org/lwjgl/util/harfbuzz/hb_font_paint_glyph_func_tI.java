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
 *     hb_codepoint_t glyph,
 *     hb_paint_funcs_t *paint_funcs,
 *     void *paint_data,
 *     unsigned int palette_index,
 *     hb_color_t foreground,
 *     void *user_data
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("hb_font_paint_glyph_func_t")
public interface hb_font_paint_glyph_func_tI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_pointer, ffi_type_uint32, ffi_type_uint32, ffi_type_pointer
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
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 5 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 6 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 7 * POINTER_SIZE))
        );
    }

    /**
     * A virtual method for the {@code hb_font_funcs_t} of an {@code hb_font_t} object.
     *
     * @param font          {@code hb_font_t} to work upon
     * @param font_data     user data pointer
     * @param glyph         the glyph ID to query
     * @param paint_funcs   the paint functions to use
     * @param paint_data    the data accompanying the paint functions
     * @param palette_index the color palette to use
     * @param foreground    the foreground color
     * @param user_data     user data pointer passed by the caller
     */
    void invoke(@NativeType("hb_font_t *") long font, @NativeType("void *") long font_data, @NativeType("hb_codepoint_t") int glyph, @NativeType("hb_paint_funcs_t *") long paint_funcs, @NativeType("void *") long paint_data, @NativeType("unsigned int") int palette_index, @NativeType("hb_color_t") int foreground, @NativeType("void *") long user_data);

}