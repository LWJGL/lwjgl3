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

/** Callback function: {@link #invoke hb_paint_image_func_t} */
@FunctionalInterface
@NativeType("hb_paint_image_func_t")
public interface hb_paint_image_func_tI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_uint32, ffi_type_uint32, ffi_type_uint32, ffi_type_float, ffi_type_pointer, ffi_type_pointer
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
            memGetInt(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 5 * POINTER_SIZE)),
            memGetFloat(memGetAddress(args + 6 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 7 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 8 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code hb_bool_t (* hb_paint_image_func_t) (hb_paint_funcs_t * funcs, void * paint_data, hb_blob_t * image, unsigned int width, unsigned int height, hb_tag_t format, float slant, hb_glyph_extents_t * extents, void * user_data)} */
    @NativeType("hb_bool_t") int invoke(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("void *") long paint_data, @NativeType("hb_blob_t *") long image, @NativeType("unsigned int") int width, @NativeType("unsigned int") int height, @NativeType("hb_tag_t") int format, float slant, @NativeType("hb_glyph_extents_t *") long extents, @NativeType("void *") long user_data);

}