/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke (* anonymous)} */
@FunctionalInterface
@NativeType("bool (*) (void *, Uint8, Uint8, Uint8)")
public interface SDL_VirtualJoystickDescSetLEDCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_uint8,
        ffi_type_pointer, ffi_type_uint8, ffi_type_uint8, ffi_type_uint8
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        boolean __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetByte(memGetAddress(args + POINTER_SIZE)),
            memGetByte(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetByte(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code bool (*) (void * userdata, Uint8 red, Uint8 green, Uint8 blue)} */
    @NativeType("bool") boolean invoke(@NativeType("void *") long userdata, @NativeType("Uint8") byte red, @NativeType("Uint8") byte green, @NativeType("Uint8") byte blue);

}