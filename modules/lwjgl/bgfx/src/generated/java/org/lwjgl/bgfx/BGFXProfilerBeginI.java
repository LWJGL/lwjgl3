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
@NativeType("void (*) (bgfx_callback_interface_t *, char const *, uint32_t, char const *, uint16_t)")
public interface BGFXProfilerBeginI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_uint16
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetShort(memGetAddress(args + 4 * POINTER_SIZE))
        );
    }

    /** {@code void (*) (bgfx_callback_interface_t * _this, char const * _name, uint32_t _abgr, char const * _filePath, uint16_t _line)} */
    void invoke(@NativeType("bgfx_callback_interface_t *") long _this, @NativeType("char const *") long _name, @NativeType("uint32_t") int _abgr, @NativeType("char const *") long _filePath, @NativeType("uint16_t") short _line);

}