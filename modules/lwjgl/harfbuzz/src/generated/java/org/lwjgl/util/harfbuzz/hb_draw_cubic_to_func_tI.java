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
 *     hb_draw_funcs_t *dfuncs,
 *     void *draw_data,
 *     hb_draw_state_t *st,
 *     float control1_x,
 *     float control1_y,
 *     float control2_x,
 *     float control2_y,
 *     float to_x,
 *     float to_y,
 *     void *user_data
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("hb_draw_cubic_to_func_t")
public interface hb_draw_cubic_to_func_tI extends CallbackI {

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

    /**
     * A virtual method for the {@code hb_draw_funcs_t} to perform a "cubic-to" draw operation.
     *
     * @param dfuncs     draw functions object
     * @param draw_data  the data accompanying the draw functions
     * @param st         current draw state
     * @param control1_x X component of first control point
     * @param control1_y Y component of first control point
     * @param control2_x X component of second control point
     * @param control2_y Y component of second control point
     * @param to_x       X component of target point
     * @param to_y       Y component of target point
     * @param user_data  user data pointer passed by the caller
     */
    void invoke(@NativeType("hb_draw_funcs_t *") long dfuncs, @NativeType("void *") long draw_data, @NativeType("hb_draw_state_t *") long st, float control1_x, float control1_y, float control2_x, float control2_y, float to_x, float to_y, @NativeType("void *") long user_data);

}