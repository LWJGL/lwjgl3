/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import java.lang.invoke.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke (* anonymous)} */
@FunctionalInterface
@NativeType("void (*) (bgfx_callback_interface_t *, char const *, uint16_t, bgfx_fatal_t, char const *)")
public interface BGFXFatalCallbackI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_void,
            ffi_type_pointer, ffi_type_pointer, ffi_type_uint16, ffi_type_uint32, ffi_type_pointer
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetShort(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE))
        );
    }

    /** {@code void (*) (bgfx_callback_interface_t * _this, char const * _filePath, uint16_t _line, bgfx_fatal_t _code, char const * _str)} */
    void invoke(@NativeType("bgfx_callback_interface_t *") long _this, @NativeType("char const *") long _filePath, @NativeType("uint16_t") short _line, @NativeType("bgfx_fatal_t") int _code, @NativeType("char const *") long _str);

}