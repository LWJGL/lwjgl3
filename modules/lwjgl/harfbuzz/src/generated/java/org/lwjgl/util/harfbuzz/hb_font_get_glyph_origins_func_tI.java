/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

import org.lwjgl.system.*;

import java.lang.invoke.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke hb_font_get_glyph_origins_func_t} */
@FunctionalInterface
@NativeType("hb_font_get_glyph_origins_func_t")
public interface hb_font_get_glyph_origins_func_tI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        hb_font_get_glyph_origins_func_tI.class,
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_uint32,
            ffi_type_pointer, ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_uint32, ffi_type_pointer
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

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
            memGetAddress(memGetAddress(args + 7 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 8 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 9 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code hb_bool_t (* hb_font_get_glyph_origins_func_t) (hb_font_t * font, void * font_data, unsigned int count, hb_codepoint_t const * first_glyph, unsigned glyph_stride, hb_position_t * first_x, unsigned x_stride, hb_position_t * first_y, unsigned y_stride, void * user_data)} */
    @NativeType("hb_bool_t") int invoke(@NativeType("hb_font_t *") long font, @NativeType("void *") long font_data, @NativeType("unsigned int") int count, @NativeType("hb_codepoint_t const *") long first_glyph, @NativeType("unsigned") int glyph_stride, @NativeType("hb_position_t *") long first_x, @NativeType("unsigned") int x_stride, @NativeType("hb_position_t *") long first_y, @NativeType("unsigned") int y_stride, @NativeType("void *") long user_data);

}