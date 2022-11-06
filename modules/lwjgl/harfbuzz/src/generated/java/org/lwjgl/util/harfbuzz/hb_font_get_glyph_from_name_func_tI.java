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
 *     char const *name,
 *     int len,
 *     hb_codepoint_t *glyph,
 *     void *user_data
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("hb_font_get_glyph_from_name_func_t")
public interface hb_font_get_glyph_from_name_func_tI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_sint32, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 5 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /**
     * A virtual method for the {@code hb_font_funcs_t} of an {@code hb_font_t} object.
     * 
     * <p>This method should retrieve the glyph ID that corresponds to a glyph-name string.</p>
     * 
     * <p>Return value: {@code true} if data found, {@code false} otherwise.</p>
     *
     * @param font      {@code hb_font_t} to work upon
     * @param font_data {@code font} user data pointer
     * @param name      the name string to query
     * @param glyph     the glyph ID retrieved
     * @param user_data user data pointer passed by the caller
     */
    @NativeType("hb_bool_t") int invoke(@NativeType("hb_font_t *") long font, @NativeType("void *") long font_data, @NativeType("char const *") long name, int len, @NativeType("hb_codepoint_t *") long glyph, @NativeType("void *") long user_data);

}