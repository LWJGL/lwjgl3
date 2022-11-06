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
 *     hb_font_t *font,
 *     void *font_data,
 *     hb_codepoint_t unicode,
 *     hb_codepoint_t *glyph,
 *     void *user_data
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("hb_font_get_nominal_glyph_func_t")
public interface hb_font_get_nominal_glyph_func_tI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_pointer
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
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /**
     * A virtual method for the {@code hb_font_funcs_t} of an {@code hb_font_t} object.
     * 
     * <p>This method should retrieve the nominal glyph ID for a specified Unicode code point. Glyph IDs must be returned in a {@code hb_codepoint_t} output
     * parameter.</p>
     * 
     * <p>Return value: {@code true} if data found, {@code false} otherwise.</p>
     *
     * @param font      {@code hb_font_t} to work upon
     * @param font_data {@code font} user data pointer
     * @param unicode   the Unicode code point to query
     * @param glyph     the glyph ID retrieved
     * @param user_data user data pointer passed by the caller
     */
    @NativeType("hb_bool_t") int invoke(@NativeType("hb_font_t *") long font, @NativeType("void *") long font_data, @NativeType("hb_codepoint_t") int unicode, @NativeType("hb_codepoint_t *") long glyph, @NativeType("void *") long user_data);

}