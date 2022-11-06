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
 * hb_position_t (*{@link #invoke}) (
 *     hb_font_t *font,
 *     void *font_data,
 *     hb_codepoint_t first_glyph,
 *     hb_codepoint_t second_glyph,
 *     void *user_data
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("hb_font_get_glyph_kerning_func_t")
public interface hb_font_get_glyph_kerning_func_tI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_sint32,
        ffi_type_pointer, ffi_type_pointer, ffi_type_uint32, ffi_type_uint32, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /**
     * This method should retrieve the kerning-adjustment value for a glyph-pair in the specified font, for horizontal text segments.
     *
     * @param font         {@code hb_font_t} to work upon
     * @param font_data    {@code font} user data pointer
     * @param first_glyph  the glyph ID of the first glyph in the glyph pair
     * @param second_glyph the glyph ID of the second glyph in the glyph pair
     * @param user_data    user data pointer passed by the caller
     */
    @NativeType("hb_position_t") int invoke(@NativeType("hb_font_t *") long font, @NativeType("void *") long font_data, @NativeType("hb_codepoint_t") int first_glyph, @NativeType("hb_codepoint_t") int second_glyph, @NativeType("void *") long user_data);

}