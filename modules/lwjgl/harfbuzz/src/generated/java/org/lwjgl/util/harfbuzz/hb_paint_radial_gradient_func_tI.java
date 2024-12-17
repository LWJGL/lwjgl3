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

/** Callback function: {@link #invoke hb_paint_radial_gradient_func_t} */
@FunctionalInterface
@NativeType("hb_paint_radial_gradient_func_t")
public interface hb_paint_radial_gradient_func_tI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_float, ffi_type_float, ffi_type_float, ffi_type_float, ffi_type_float, ffi_type_float, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetFloat(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetFloat(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetFloat(memGetAddress(args + 5 * POINTER_SIZE)),
            memGetFloat(memGetAddress(args + 6 * POINTER_SIZE)),
            memGetFloat(memGetAddress(args + 7 * POINTER_SIZE)),
            memGetFloat(memGetAddress(args + 8 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 9 * POINTER_SIZE))
        );
    }

    /** {@code void (* hb_paint_radial_gradient_func_t) (hb_paint_funcs_t * funcs, void * paint_data, hb_color_line_t * color_line, float x0, float y0, float r0, float x1, float y1, float r1, void * user_data)} */
    void invoke(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("void *") long paint_data, @NativeType("hb_color_line_t *") long color_line, float x0, float y0, float r0, float x1, float y1, float r1, @NativeType("void *") long user_data);

}