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

/** Callback function: {@link #invoke SDL_EGLIntArrayCallback} */
@FunctionalInterface
@NativeType("SDL_EGLIntArrayCallback")
public interface SDL_EGLIntArrayCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /** {@code SDL_EGLint * (* SDL_EGLIntArrayCallback) (void * userdata, SDL_EGLDisplay display, SDL_EGLConfig config)} */
    @NativeType("SDL_EGLint *") long invoke(@NativeType("void *") long userdata, @NativeType("SDL_EGLDisplay") long display, @NativeType("SDL_EGLConfig") long config);

}