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

/** Callback function: {@link #invoke hb_color_line_get_color_stops_func_t} */
@FunctionalInterface
@NativeType("hb_color_line_get_color_stops_func_t")
public interface hb_color_line_get_color_stops_func_tI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
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
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 5 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code unsigned int (* hb_color_line_get_color_stops_func_t) (hb_color_line_t * color_line, void * color_line_data, unsigned int start, unsigned int * count, hb_color_stop_t * color_stops, void * user_data)} */
    @NativeType("unsigned int") int invoke(@NativeType("hb_color_line_t *") long color_line, @NativeType("void *") long color_line_data, @NativeType("unsigned int") int start, @NativeType("unsigned int *") long count, @NativeType("hb_color_stop_t *") long color_stops, @NativeType("void *") long user_data);

}