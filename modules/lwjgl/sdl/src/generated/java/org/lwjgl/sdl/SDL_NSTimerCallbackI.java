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

/** Callback function: {@link #invoke SDL_NSTimerCallback} */
@FunctionalInterface
@NativeType("SDL_NSTimerCallback")
public interface SDL_NSTimerCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_uint64,
        ffi_type_pointer, ffi_type_uint32, ffi_type_uint64
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetLong(memGetAddress(args + 2 * POINTER_SIZE))
        );
        apiClosureRetL(ret, __result);
    }

    /** {@code Uint64 (* SDL_NSTimerCallback) (void * userdata, SDL_TimerID timerID, Uint64 interval)} */
    @NativeType("Uint64") long invoke(@NativeType("void *") long userdata, @NativeType("SDL_TimerID") int timerID, @NativeType("Uint64") long interval);

}