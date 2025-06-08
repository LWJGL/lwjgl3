/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke (* anonymous)} */
@FunctionalInterface
@NativeType("void (*) (bgfx_callback_interface_t *, uint32_t, uint32_t, uint32_t, bgfx_texture_format_t, bool)")
public interface BGFXCaptureBeginCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        ffi_type_void,
        ffi_type_pointer, ffi_type_uint32, ffi_type_uint32, ffi_type_uint32, ffi_type_uint32, ffi_type_uint8
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetByte(memGetAddress(args + 5 * POINTER_SIZE)) != 0
        );
    }

    /** {@code void (*) (bgfx_callback_interface_t * _this, uint32_t _width, uint32_t _height, uint32_t _pitch, bgfx_texture_format_t _format, bool _yflip)} */
    void invoke(@NativeType("bgfx_callback_interface_t *") long _this, @NativeType("uint32_t") int _width, @NativeType("uint32_t") int _height, @NativeType("uint32_t") int _pitch, @NativeType("bgfx_texture_format_t") int _format, @NativeType("bool") boolean _yflip);

}