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

/** Callback function: {@link #invoke hb_paint_sweep_gradient_tile_func_t} */
@FunctionalInterface
@NativeType("hb_paint_sweep_gradient_tile_func_t")
public interface hb_paint_sweep_gradient_tile_func_tI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        hb_paint_sweep_gradient_tile_func_tI.class,
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_void,
            ffi_type_float, ffi_type_pointer, ffi_type_float, ffi_type_pointer, ffi_type_pointer
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetFloat(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetFloat(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE))
        );
    }

    /** {@code void (* hb_paint_sweep_gradient_tile_func_t) (float a0, hb_color_t * c0, float a1, hb_color_t * c1, void * user_data)} */
    void invoke(float a0, @NativeType("hb_color_t *") long c0, float a1, @NativeType("hb_color_t *") long c1, @NativeType("void *") long user_data);

}