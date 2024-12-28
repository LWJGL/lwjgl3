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
@NativeType("Sint64 (*) (void *, Sint64, SDL_IOWhence)")
public interface SDL_IOStreamInterfaceSeekCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_sint64,
        ffi_type_pointer, ffi_type_sint64, ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetLong(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE))
        );
        apiClosureRetL(ret, __result);
    }

    /** {@code Sint64 (*) (void * userdata, Sint64 offset, SDL_IOWhence whence)} */
    @NativeType("Sint64") long invoke(@NativeType("void *") long userdata, @NativeType("Sint64") long offset, @NativeType("SDL_IOWhence") int whence);

}